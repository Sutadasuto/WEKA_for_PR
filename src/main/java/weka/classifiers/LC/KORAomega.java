package weka.classifiers.LC;

import weka.attributeSelection.AttributeSelection;
import weka.classifiers.AbstractClassifier;
import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JOptionPane;

public class KORAomega
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

  /** the distance function used. */
  protected DistanceFunction m_SimilarityMeasure= new SimilarityMeasure();

  private String m_PercentOfEta="70";

  public void setPercentOfEta(String _numTimes) {
    m_PercentOfEta=_numTimes;
  }
  public String getPercentOfEta() {
    return m_PercentOfEta;
  }
  public String percentOfEtaTipText(){
    return "Eta: number of times to apper the pattern"
            + "Uniform value ex: and default 70 % or indicate for each class {A,B} ex: A:80,B:70\n";
  }
  public void setPercentOfDelta(String _numTimes) {
    m_PercentOfEta=_numTimes;
  }
  public String getPercentOfDelta() {
    return m_PercentOfEta;
  }
  public String percentOfDeltaTipText(){
    return "Eta: number of times to apper the pattern"
            + "Uniform value ex: and default 70 % or indicate for each class {A,B} ex: A:80,B:70\n";
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
      int result = numOmegas;
      return result;
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
    /*Desde aqui intento mostrar el flujo de como se extraen
     * los indices del archivo y todo el flujo de esos datos
     * puse todo esto aqui ya que de aqui se ejecuta
     * espero poder lograr explicar bien
     */


    /* Esto primero es informacion que por el momento no se usa pero
     * creo que se podra utilizar no le hagan mucho caso por ahora*/
    String clases = instances.classAttribute().toString();
    int numAttributes = instances.numAttributes();
    //System.out.println(clases);
    String[] div = clases.split("\\{",2);
    String[] classNames = div[1].split("\\}",2);
    //System.out.println(div1[0]);


    instances = new Instances(instances);
    instances.deleteWithMissingClass();

    m_NumClasses = instances.numClasses();
    m_ClassType = instances.classAttribute().type();
    m_Train = new Instances(instances, 0, instances.numInstances());
    m_SimilarityMeasure.setInstances(m_Train);

    boolean sameClass;
    double calculatedSimilarity;
    double delta;
    double positive;
    double deltaPrime;
    double negative;


    AttributeStats[] m_AttributeStats;
    m_AttributeStats = new AttributeStats[m_Train.numAttributes()];
    m_AttributeStats[m_Train.classIndex()] = m_Train.attributeStats(m_Train.classIndex());
    AttributeStats as = m_AttributeStats[m_Train.classIndex()];
    int[] instancesPerClass = as.nominalCounts;
    String[] classes = new String[m_Train.classAttribute().numValues()];
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
          /*como acordado cada linea pertenece a una clase
           * por lo que se crea las omegas partes */
          String[] div4 = cadena.split("\\[",2);
          String className = div4[0];
          testExistClass(className,classNames[0]);
          testAlreadyAdded(className,listaOSetClass);
          omegasSet set = new omegasSet();
          String[] umbrales = div4[1].split("\\]",2);
          set.setTresholds(umbrales[0], 0); //Kora

          set.setOmegasSetFromFile(className+umbrales[1],numAttributes);
          /*Se agrega a la lista, la lista tendra
           * tantos elementos como lineas del archivo
           * que corresponden a el numero de clases*/
          listaOSetClass.add(set);
          if(num_lines>instances.numClasses()) {
            System.out.println("sale");
          }
        }
      }
    }else {
      //busco subconjuntos de n cuando no se especifican con el archivo
      System.out.println("Sera con n partes= "+numOmegas);
      //supongamos que encuentro y uso los atributos 0,2,3 y 1,4
      int[] omega_parte_1 = {0,2,3};
      int[] omega_parte_2= {1,4};
      //creo lista de array por que van a ser varios
      ArrayList<int[]> omegas_encontradas =new ArrayList<int[]>();
      //agrego las omegas partes a la lista
      omegas_encontradas.add(omega_parte_1);
      omegas_encontradas.add(omega_parte_2);
      //creo mi conjunto de omega parte para la clase
      //aqui es donde pienso usarlo lo que comento casi al
      //inicio de este meteodo que no hagan caso
      // ya que aho recupero los nombres de las clases
      omegasSet set = new omegasSet();
      set.setOmegasClassName("A");
      set.setOmegasSet(omegas_encontradas);
      //todo el proceso de recuperacion es igual que
      // en el if ya no lo quise copiar
      //al final de cuantas no se hara en este orden
      // es solo un jemplo de como meter y sacar los datos
    }

    // Para cada clase...
    for(int x=0;x<listaOSetClass.size();x++)
    {
      omegasSet omegasClase = listaOSetClass.get(x);
      /*obtengo el nombre de la clase que esta en mi archivo
       * como por ejemplo A: .., puede ser adultos: ..
       */
      String name_class =omegasClase.getOmegasClassName();
      //Se obtienen delta y delta prima
      delta = omegasClase.getThresholds().get(0).getThresholdSet().get(0);
      deltaPrime = omegasClase.getThresholds().get(0).getThresholdSet().get(1);
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

      //Para cada uno de estos subconjuntos...
      for(int y=0;y<sub_indices_omegas.size();y++)
      {
        ArrayList<omegaSimilarity> similarities = new ArrayList<omegaSimilarity>();
        omegas subconjunto = sub_indices_omegas.get(y);
        /*lo devuelve en forma de array de int
         * esto por que los filter de atributos
         * usan array de int con esto quedara
         * directo para futuras aplicaciones
         */
        String indices = subconjunto.getOmegas();

        //Acá se define el omega-conjunto a evaluar
        m_SimilarityMeasure.setAttributeIndices(indices);
        //Inician las comparaciones de todos los pares de instancias
        for(int i1=0; i1<m_Train.size(); i1++)
        {
          //Se analiza si la instancia a evaluar es de la misma clase que la omega parte
          if(m_Train.get(i1).stringValue(m_Train.get(i1).classIndex()).equals(name_class))
          {

            System.out.println(name_class);
            System.out.println("Indice del subconjunto: " + String.valueOf(y));
            System.out.println("Indice de la instancia cuyo rasgo se evalua: " + String.valueOf(i1));
            //Se inician los contadores para evaluar si el subconjunto es un rasgo complejo
            positive = 0;
            negative = 0;

            for(int i2=0; i2<m_Train.size(); i2++)
            {
              if(negative <= deltaPrime) {
                sameClass = (m_Train.get(i1).valueSparse(m_Train.get(i1).classIndex()) ==
                        m_Train.get(i2).valueSparse(m_Train.get(i2).classIndex()));

                if(sameClass)
                {
                  if (positive < delta) {
                    calculatedSimilarity = m_SimilarityMeasure.distance(m_Train.get(i1), m_Train.get(i2));
                    positive += calculatedSimilarity;
                  }
                }
                else{
                  calculatedSimilarity = m_SimilarityMeasure.distance(m_Train.get(i1), m_Train.get(i2));
                  negative += calculatedSimilarity;
                }
              }
              else break;
            }
            System.out.print("delta: " + String.format("%.4g%n", delta));
            System.out.print("Positive: " + String.format("%.4g%n", positive));
            System.out.print("deltaPrime: " + String.format("%.4g%n", deltaPrime));
            System.out.print("Negative: " + String.format("%.4g%n", negative));
            System.out.println("\n");
            if(positive >= delta && negative <= deltaPrime){
              //Objeto equivalente a un rasgo complejo
              omegaSimilarity similarity = new omegaSimilarity();
              //Se guarda la clase de la instancia 1 (es decir, la clase para la cual queremos obtener rasgos)
              try {
                similarity.setClass(m_Train.get(i1).stringValue(m_Train.get(i1).classIndex()));
              } catch (IllegalArgumentException exception) {
                similarity.setClass(String.valueOf(m_Train.get(i1).valueSparse(m_Train.get(i1).classIndex())));
              }
              int[] omegaIndices = subconjunto.getOmegaIndices();
              String[] code = new String[m_Train.numAttributes()];
              for(int index=0; index<m_Train.numAttributes(); index++)
              {
                code[index] = "-";
              }
              for(int index=0; index<omegaIndices.length; index++)
              {
                String value;
                try {
                  value = m_Train.get(i1).stringValue(omegaIndices[index]);
                } catch (IllegalArgumentException exception) {
                  value = String.valueOf(m_Train.get(i1).valueSparse(omegaIndices[index]));
                }
                code[omegaIndices[index]] = value;
              }
              similarity.setValues(code);
              similarity.setOmega(indices);
            }
          }
        }
      }
    }
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
      //debe retornar probabilidades
      return null;
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
      runClassifier(new KORAomega(), argv);
  }

}

