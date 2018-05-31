package weka.classifiers.LC;

import weka.classifiers.AbstractClassifier;
import weka.core.*;
import weka.core.Capabilities.Capability;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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

  /*variable file path of omega parts*/
  protected String omegasFilePath="null";
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
    //System.out.println(clases);
    String[] div = clases.split("\\{",2);
    String[] div1 = div[1].split("\\}",2);
    //System.out.println(div1[0]);


    instances = new Instances(instances);
    instances.deleteWithMissingClass();

    m_NumClasses = instances.numClasses();
    m_ClassType = instances.classAttribute().type();
    m_Train = new Instances(instances, 0, instances.numInstances());
    m_SimilarityMeasure.setInstances(m_Train);

    //lista de omega partes para cada clase
    ArrayList<omegasSet> listaOSetClass = new ArrayList<omegasSet>();
    //Si se tiene un ruta de archivo se utiliza, si no, se utiliza un k predefinido
    if(!omegasFilePath.equals("null")) {
      //se lee archivo
      String cadena;
      FileReader file = new FileReader(omegasFilePath);
      BufferedReader b = new BufferedReader(file);
      while((cadena = b.readLine())!=null) {
          /*como acordado cada linea pertenece a una clase
           * por lo que se crea las omegas partes */
          omegasSet set = new omegasSet();
          set.setOmegasSetFromFile(cadena);
          /*Se agrega a la lista, la lista tendra
           * tantos elementos como lineas del archivo
           * que corresponden a el numero de clases*/
          listaOSetClass.add(set);
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
          for(int i2=0; i2<m_Train.size(); i2++)
          {
            System.out.println(i1);
            System.out.println(i2);
            System.out.println("\n");
            //Objeto que guarda la evaluación entre un par de instancias
            omegaSimilarity similarity = new omegaSimilarity();

            //Se guarda el omega-set evaluado
            similarity.setOmega(indices);
            //Se guardan las instancia comparadas
            similarity.setInstances(m_Train.get(i1), m_Train.get(i2));
            similarity.setSimilarity(m_SimilarityMeasure.distance(m_Train.get(i1), m_Train.get(i2)));
            //Se guarda la clase de la instancia 1 (es decir, la clase para la cual queremos obtener rasgos)
            try
            {
              similarity.setClass(m_Train.get(i1).stringValue(m_Train.get(i2).classIndex()));
            }
            catch(IllegalArgumentException exception)
            {
              similarity.setClass(String.valueOf(m_Train.get(i1).valueSparse(m_Train.get(i2).classIndex())));
            }
            //Se registra si las clases de las instancias son iguales
            similarity.setSameClass(
                    m_Train.get(i1).valueSparse(m_Train.get(i1).classIndex()) ==
                            m_Train.get(i2).valueSparse(m_Train.get(i2).classIndex())
            );
            similarities.add(similarity);
          }
        }
      }
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

