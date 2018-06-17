package weka.classifiers.LC;

import weka.classifiers.AbstractClassifier;
import weka.core.*;
import weka.core.Capabilities.Capability;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class CRplus
        extends AbstractClassifier
        implements OptionHandler,
        WeightedInstancesHandler, WeightedAttributesHandler, TechnicalInformationHandler{

  /**
   *
   */
  static final long serialVersionUID = 1487520790733881279L;

  /** The training instances used for classification. */
  protected Instances m_Train;

  /** The number of class values (or 1 if predicting numeric). */
  protected int m_NumClasses;

  /** The class attribute type. */
  protected int m_ClassType;

  protected  String[] classes;

  //En este array se guardan los conjuntos de rasgos complejos para cada clase
  protected ArrayList<ClassComplexTraits> model = new ArrayList<ClassComplexTraits>();

  /** the distance function used. */
  protected DistanceFunction m_SimilarityMeasure= new SimilarityMeasure();

  private double m_PercentOfDeltaPrime=10.0;
  private double m_PercentOfDelta=90.0;

  public void setPercentOfDeltaPrime(double _numTimes) {
    m_PercentOfDeltaPrime=_numTimes;
  }
  public double getPercentOfDeltaPrime() {
    return m_PercentOfDeltaPrime;
  }
  public String percentOfDeltaPrimeTipText(){
    return "Delta prime: maximum number of times to appear outside the class."
            + "Uniform value ex: and default 70 % or indicate for each class in text file.\n";
  }
  public void setPercentOfDelta(double _numTimes) {
    m_PercentOfDelta=_numTimes;
  }
  public double getPercentOfDelta() {
    return m_PercentOfDelta;
  }
  public String percentOfDeltaTipText(){
    return "Delta: minimum number of times to appear inside the class."
            + "Uniform value ex: and default 30 % or indicate for each class in text file.\n";
  }

  private double eta=10.0;

  public void setEta(double _eta){
    eta = _eta;
  }

  public double getEta(){
    return eta;
  }

  public String EtaTipText(){
    return "Similarity threshold to define class' leftovers";
  }

  private double resizeFactor=0.9;

  public void setResizeFactor(double _resizeFactor){
    resizeFactor = _resizeFactor;
  }

  public double getResizeFactor(){
    return resizeFactor;
  }

  public String resizeFactorTipText(){
    return "Resize factor for increasing and decreasing the delta and delta prime thresholds";
  }


  /*variable file path of omega parts*/
  protected String omegasFilePath="";
  /*variable n omegas parts*/
  protected int numOmegas=3;


  public String numOmegasTipText(){
    return "Indicate the number of n omega parts, this is the defualt option if you do not specify"
            + " a file path";
  }

  /**
   * Set the path
   *
   * @param omegasFilePath file path
   */
  public void setNumOmegas(int _num) {
    numOmegas=_num;
  }
  /**
   * Get the paths to omegas
   *
   * @return an array of File paths to serialized models
   * @throws IOException
   */
  public int getNumOmegas() {
    return numOmegas;
  }

  public String omegasFilePathTipText() {
    return "Specifiy a file path who contains omega parts to initilizate the algorithm";
  }

  /**
   * Set the path
   *
   * @param omegasFilePath file path
   */
  public void setOmegasFilePath(String _filePath) {
    omegasFilePath=_filePath;

  }

  /**
   * Get the paths to omegas
   *
   * @return an array of File paths to serialized models
   * @throws IOException
   */
  public String getOmegasFilePath() {
    return omegasFilePath;
  }
  /**
   * Returns default capabilities of the classifier.
   *
   * @return the capabilities of this classifier
   */

  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>();

    newVector.add(new Option("\tSimlarity function to use.\n"
            + "\t(default: weka.core.SimilarityMeasure.java)", "A", 1,
            "-A <classname and options>"));

    return newVector.elements();
  }

  @Override
  public void setOptions(String[] options) throws Exception {
    String LCSearchClass = Utils.getOption('A', options);
    if (LCSearchClass.length() != 0) {
      String LCSearchClassSpec[] = Utils.splitOptions(LCSearchClass);
      if (LCSearchClassSpec.length == 0) {
        throw new Exception("Invalid DistanceFunction specification string.");
      }
      String className = LCSearchClassSpec[0];
      LCSearchClassSpec[0] = "";

      setSimilarityMeasure((DistanceFunction) Utils.forName(
              DistanceFunction.class, className, LCSearchClassSpec));
    } else {
      setSimilarityMeasure(new SimilarityMeasure());
    }
  }

  @Override
  public String[] getOptions() {
    Vector<String> result;

    result = new Vector<String>();

    result.add("-A");
    result.add((m_SimilarityMeasure.getClass().getName() + " " + Utils
            .joinOptions(m_SimilarityMeasure.getOptions())).trim());

    return result.toArray(new String[result.size()]);
  }

  public String similarityMeasureTipText() {
    return "The similarity measure to use "
            + "(default: weka.core.SimilarityMeasure). ";
  }

  public DistanceFunction getSimilarityMeasure() {
    return m_SimilarityMeasure;
  }

  public void setSimilarityMeasure(DistanceFunction df) throws Exception {
    m_SimilarityMeasure = df;
  }

  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.NUMERIC_CLASS);

    // instances
    result.setMinimumNumberInstances(0);

    return result;
  }

  @Override
  public void buildClassifier(Instances instances) throws Exception {

    getCapabilities().testWithFail(instances);

    String clases = instances.classAttribute().toString();

    instances = new Instances(instances);
    instances.deleteWithMissingClass();

    m_NumClasses = instances.numClasses();
    m_ClassType = instances.classAttribute().type();
    m_Train = new Instances(instances, 0, instances.numInstances());
    m_SimilarityMeasure.setInstances(m_Train);
    double delta;
    double deltaPrime;


    AttributeStats[] m_AttributeStats;
    m_AttributeStats = new AttributeStats[m_Train.numAttributes()];
    m_AttributeStats[m_Train.classIndex()] = m_Train.attributeStats(m_Train.classIndex());
    AttributeStats as = m_AttributeStats[m_Train.classIndex()];
    int[] instancesPerClass = as.nominalCounts;
    classes = new String[m_Train.classAttribute().numValues()];
    for(int val=0; val<m_Train.classAttribute().numValues(); val++){
      classes[val] = m_Train.classAttribute().value(val);
    }

    //lista de omega partes para cada clase
    ArrayList<omegasSet> listaOSetClass = new ArrayList<omegasSet>();
    //Si se tiene un ruta de archivo se utiliza, si no, se utiliza un k predefinido
    if(!omegasFilePath.equals("")) {
      //se lee archivo
      String cadena;
      FileReader file = new FileReader(omegasFilePath);
      BufferedReader b = new BufferedReader(file);
      int num_lines=0;
      while((cadena = b.readLine())!=null) {
        cadena = cadena.trim();
        if (cadena.length() == 0) {
          continue;
        } else {
          num_lines+=1;
          int numAttributes = instances.numAttributes();
          String[] div = clases.split("\\{",2);
          String[] classNames = div[1].split("\\}",2);
          /*como acordado cada linea pertenece a una clase
           * por lo que se crea las omegas partes */
          String[] div4 = cadena.split("\\[",2);
          String className = div4[0];
          testExistClass(className,classNames[0]);
          testAlreadyAdded(className,listaOSetClass);
          omegasSet set = new omegasSet();
          String[] umbrales = div4[1].split("\\]",2);
          set.setThresholds(umbrales[0], 0); //Kora
          set.setOmegasSetFromFile(className+umbrales[1],numAttributes);
          /*Se agrega a la lista, la lista tendra
           * tantos elementos como lineas del archivo
           * que corresponden a el numero de clases*/
          listaOSetClass.add(set);
        }
      }
    }else {
      //busco subconjuntos de n cuando no se especifican con el archivo
      System.out.println("Sera con n partes= "+numOmegas);

      omegasSet set = new omegasSet();
      set.setOmegasFromSize(classes[0], numOmegas, instances.classIndex());
      String thres =  String.valueOf(m_PercentOfDelta)+","+ String.valueOf(m_PercentOfDeltaPrime);
      set.setThresholds(thres, 0);
      listaOSetClass.add(set);
      for (int i=1;i<classes.length;i++) {
        omegasSet set1 = new omegasSet();
        set1.setThresholds(thres, 0);//Kora
        set1.setOmegasFromString(classes[i], set.getIndicesString(), instances.classIndex());
        listaOSetClass.add(set1);
      }
    }

    // Para cada clase...
    for(omegasSet omegasClase:listaOSetClass)
    {
      /*obtengo el nombre de la clase que esta en mi archivo
       * como por ejemplo A: .., puede ser adultos: ..
       */
      String name_class =omegasClase.getOmegasClassName();

      //Se obtienen delta y delta prima
      delta = omegasClase.getThresholds().get(0).getThresholdSet().get(0);
      deltaPrime = omegasClase.getThresholds().get(0).getThresholdSet().get(1);
      //Se redimensionan con base al número de objetos de la clase
      int sameClassInstances = 0;
      for(int k=0; k<classes.length; k++){
        if(name_class.equals(classes[k])){
          sameClassInstances = instancesPerClass[k];
          break;
        }
      }
      delta = sameClassInstances * delta/100.0;
      deltaPrime = (m_Train.numInstances() - sameClassInstances) * deltaPrime/100.0;


      /*Se obtienen todas las omegas partes de esa clase
       * recordemos que pueden ser n y de distinto tamaño*/
      ArrayList<omegas> sub_indices_omegas = omegasClase.getOmegasSet();
      //para cada omega hay un peso
      ArrayList<Double> omega_weights = omegasClase.getWeghts();

      ClassComplexTraits classComplexTraits;

      classComplexTraits = getComplexTraits(m_Train, sub_indices_omegas, omega_weights, delta, deltaPrime, name_class);

      //Se calculan los restos de la clase
      Instances leftovers = new Instances(m_Train,0,1);
      leftovers.delete(0);
      double beta;
      boolean allObjects = true;
      for(int i=0; i<m_Train.size(); i++){
        if(m_Train.get(i).stringValue(m_Train.get(i).classIndex()).equals(name_class)){
          ComplexTrait complexTrait;
          String indices;
          beta = 0;
          for(int j=0; j<classComplexTraits.getSize(); j++){
            if(beta < eta) {
              complexTrait = classComplexTraits.getComplexTrait(j);
              indices = complexTrait.getOmega();
              m_SimilarityMeasure.setAttributeIndices(indices);
              beta += m_SimilarityMeasure.distance(m_Train.get(i), complexTrait.getEquivalentInstance());
            }
            else{
              break;
            }
          }
          if(beta < eta){
            leftovers.add(m_Train.get(i));
            allObjects = false;
          }
        }
        else{
          leftovers.add(m_Train.get(i));
        }
      }

      // Se calculan los rasgos complejos complementarios
      ClassComplexTraits classComplexTraits2;
      while(!allObjects){
        delta = delta*resizeFactor;
        deltaPrime = deltaPrime/resizeFactor;

        if(deltaPrime <= delta) {
          classComplexTraits2 = getComplexTraits(leftovers, sub_indices_omegas, omega_weights, delta, deltaPrime, name_class);

          for (int i = 0; i < classComplexTraits2.getSize(); i++) {
            classComplexTraits.addComplexTrait(classComplexTraits2.getComplexTrait(i));
          }

          //Se calculan los restos de la clase
          Instances leftovers2 = new Instances(leftovers, 0, leftovers.size());
          leftovers = new Instances(leftovers, 0, 1);
          leftovers.delete(0);
          allObjects = true;
          for (int i = 0; i < m_Train.size(); i++) {
            if (m_Train.get(i).stringValue(m_Train.get(i).classIndex()).equals(name_class)) {
              ComplexTrait complexTrait;
              String indices;
              beta = 0;
              for (int j = 0; j < classComplexTraits.getSize(); j++) {
                if (beta < eta) {
                  complexTrait = classComplexTraits.getComplexTrait(j);
                  indices = complexTrait.getOmega();
                  m_SimilarityMeasure.setAttributeIndices(indices);
                  beta += m_SimilarityMeasure.distance(m_Train.get(i), complexTrait.getEquivalentInstance());
                } else {
                  break;
                }
              }
              if (beta < eta) {
                leftovers.add(m_Train.get(i));
                allObjects = false;
              }
            } else {
              leftovers.add(m_Train.get(i));
            }
          }
        }
        else{
          allObjects = true;
        }
      }
      model.add(classComplexTraits);
    }
    int a = 0;
  }

  private void sendException(String message) throws Exception{
    Exception m_FailReason = new WekaException(message);
    throw m_FailReason;
  }

  private void testAlreadyAdded(String _classToFind, ArrayList<omegasSet> _omegasSetList) throws Exception {
    boolean finded = false;
    int c=0;
    while (c<_omegasSetList.size() && finded==false) {
      omegasSet omega = _omegasSetList.get(c);
      if(omega.getOmegasClassName().equals(_classToFind)) {
        finded = true;
      }
      c++;
    }
    if(finded) {
      sendException("There are more than 1 class declaration in the file."
              + "\nClass Name "+_classToFind);
    }
  }
  private void testExistClass(String _className, String _allClasses) throws Exception {
    // TODO Auto-generated method stub
    String[] classes = _allClasses.split(",");
    boolean finded = false;
    int c=0;
    while (c<classes.length && finded==false) {
      //System.out.println(classes[c]+_className);
      if(classes[c].equals(_className)) {
        finded = true;
      }
      c++;
    }
    if(!finded) {
      sendException("There are more classes in the file than in dataset."
              + "\nClass Name: "+_className);
    }
  }

  /**
   * Calculates the class membership probabilities for the given test instance.
   *
   * @param instance the instance to be classified
   * @return predicted class probability distribution
   * @exception Exception if there is a problem generating the prediction
   */
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {
    int numClasses = model.size();

    double[] votes = new double[numClasses];
    double accVotes;
    double electoralRoll = 0;

    ComplexTrait voter;
    for(int i=0; i<numClasses; i++){
      // En esta parte nos aseguramos de que las clases sean evualadas en el orden almacenado por Weka
      // (que puede diferir del orden del archivo de texto)
      int index = 0;
      String setClass = model.get(i).getComplexTrait(0).getAnalyzedClass();
      for(int j=0; j<classes.length; j++){
        if(classes[j] == setClass){
          index = j;
          break;
        }
      }
      // Se suman las similitudes de la instancia con todos los rasgos complejos de la clase a evaluar
      accVotes = 0;
      for(int j=0; j<model.get(i).getSize(); j++){
        voter = model.get(i).getComplexTrait(j);
        m_SimilarityMeasure.setAttributeIndices(voter.getOmega());
        accVotes += voter.getWeight() * m_SimilarityMeasure.distance(instance, voter.getEquivalentInstance());
      }
      votes[index] = accVotes;
      electoralRoll += accVotes; //Esta es la suma de las similitudes con todos los rasgos complejos de todas las clases
    }
    // Al parecer para evaluar Weka pide probabilidades de todas las clases. Los votos se normalizan en el rango [0.1]
    for(int i=0; i<votes.length; i++){
      votes[i] = votes[i] / electoralRoll;
    }
    return votes;
  }

  @Override
  public TechnicalInformation getTechnicalInformation() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Main method for testing this class.
   *
   * @param argv the options
   */
  public static void main(String[] argv) {
    runClassifier(new CRplus(), argv);
  }

  private ClassComplexTraits getComplexTraits(Instances objects, ArrayList<omegas> omegaSets, ArrayList<Double> weights,
                                              double delta, double deltaPrime, String classToAnalyze){

    ClassComplexTraits complexTraits = new ClassComplexTraits();
    complexTraits.setClass(classToAnalyze);
    boolean sameClass;
    double calculatedSimilarity;
    double positive;
    double negative;
    double weight;

    //Para cada uno de estos subconjuntos...
    for(int y=0;y<omegaSets.size();y++)
    {
      weight = weights.get(y);
      omegas subconjunto = omegaSets.get(y);
      /*lo devuelve en forma de array de int
       * esto por que los filter de atributos
       * usan array de int con esto quedara
       * directo para futuras aplicaciones
       */
      String indices = subconjunto.getOmegas();

      //Acá se define el omega-conjunto a evaluar
      m_SimilarityMeasure.setAttributeIndices(indices);
      //Inician las comparaciones de todos los pares de instancias
      for(int i1=0; i1<objects.size(); i1++)
      {
        //Se analiza si la instancia a evaluar es de la misma clase que la omega parte
        if(objects.get(i1).stringValue(objects.get(i1).classIndex()).equals(classToAnalyze))
        {
/*          System.out.println(classToAnalyze);
          System.out.println("Indice del subconjunto: " + String.valueOf(y));
          System.out.println("Indice de la instancia cuyo rasgo se evalua: " + String.valueOf(i1));*/
          //Se inician los contadores para evaluar si el subconjunto es un rasgo complejo
          positive = 0;
          negative = 0;
          double class1 = objects.get(i1).valueSparse(objects.get(i1).classIndex());

          for(int i2=0; i2<objects.size(); i2++)
          {
            if(negative <= deltaPrime) {
              sameClass = (class1 == objects.get(i2).valueSparse(objects.get(i2).classIndex()));

              if(sameClass)
              {
                if (positive < delta) {
                  calculatedSimilarity = m_SimilarityMeasure.distance(objects.get(i1), objects.get(i2));
                  positive += calculatedSimilarity;
                }
              }
              else{
                calculatedSimilarity = m_SimilarityMeasure.distance(objects.get(i1), objects.get(i2));
                negative += calculatedSimilarity;
              }
            }
            else break;
          }
          /*System.out.print("delta: " + String.format("%.4g%n", delta));
          System.out.print("Positive: " + String.format("%.4g%n", positive));
          System.out.print("deltaPrime: " + String.format("%.4g%n", deltaPrime));
          System.out.print("Negative: " + String.format("%.4g%n", negative));
          System.out.println("\n");*/
          if(positive >= delta && negative <= deltaPrime){
            //Objeto equivalente a un rasgo complejo
            ComplexTrait complexTrait= new ComplexTrait();
            //Se guarda la clase de la instancia 1 (es decir, la clase para la cual queremos obtener rasgos)
            try {
              complexTrait.setClass(objects.get(i1).stringValue(objects.get(i1).classIndex()));
            } catch (IllegalArgumentException exception) {
              complexTrait.setClass(String.valueOf(objects.get(i1).valueSparse(objects.get(i1).classIndex())));
            }
            int[] omegaIndices = subconjunto.getOmegaIndices();
            String[] code = new String[objects.numAttributes()];
            for(int index=0; index<objects.numAttributes(); index++)
            {
              code[index] = "-";
            }
            for(int index=0; index<omegaIndices.length; index++)
            {
              String value;
              try {
                value = objects.get(i1).stringValue(omegaIndices[index]);
              } catch (IllegalArgumentException exception) {
                value = String.valueOf(objects.get(i1).valueSparse(omegaIndices[index]));
              }
              code[omegaIndices[index]] = value;
            }
            complexTrait.setValues(code);
            complexTrait.setOmega(indices);
            complexTrait.setEquivalentInstance(objects.get(i1));
            complexTraits.addComplexTrait(complexTrait);
            complexTrait.setWeight(weight);
          }
        }
      }
    }

    return complexTraits;
  }

}
