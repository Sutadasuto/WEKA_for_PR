/*
<<<<<<< HEAD
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
=======
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

/*
 *    RegOptimizer.java
<<<<<<< HEAD
 *    Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.functions.supportVector;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.classifiers.functions.SMOreg;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

<<<<<<< HEAD
/**
 * Base class implementation for learning algorithm of SMOreg
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -L &lt;double&gt;
 *  The epsilon parameter in epsilon-insensitive loss function.
 *  (default 1.0e-3)
 * </pre>
 * 
 * <pre>
 * -W &lt;double&gt;
 *  The random number seed.
 *  (default 1)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Remco Bouckaert (remco@cs.waikato.ac.nz,rrb@xm.co.nz)
 * @version $Revision: 12533 $
 */
public class RegOptimizer implements OptionHandler, Serializable,
  RevisionHandler {

  /** for serialization */
  private static final long serialVersionUID = -2198266997254461814L;

  /** loss type **/
  // protected int m_nLossType = EPSILON;

  /** the loss type: L1 */
  // public final static int L1 = 1;
  /** the loss type: L2 */
  // public final static int L2 = 2;
  /** the loss type: HUBER */
  // public final static int HUBER = 3;
  /** the loss type: EPSILON */
  // public final static int EPSILON = 4;
  /** the loss type */
  // public static final Tag[] TAGS_LOSS_TYPE = {
  // new Tag(L2, "L2"),
  // new Tag(L1, "L1"),
  // new Tag(HUBER, "Huber"),
  // new Tag(EPSILON, "EPSILON"),
  // };
  /** alpha and alpha* arrays containing weights for solving dual problem **/
  public double[] m_alpha;
  public double[] m_alphaStar;

  /** offset **/
  protected double m_b;

  /** epsilon of epsilon-insensitive cost function **/
  protected double m_epsilon = 1e-3;

  /** capacity parameter, copied from SMOreg **/
  protected double m_C = 1.0;

  /** class values/desired output vector **/
  protected double[] m_target;

  /** points to data set **/
  protected Instances m_data;

  /** the kernel */
  protected Kernel m_kernel;

  /** index of class variable in data set **/
  protected int m_classIndex = -1;

  /** number of instances in data set **/
  protected int m_nInstances = -1;

  /** random number generator **/
  protected Random m_random;

  /** seed for initializing random number generator **/
  protected int m_nSeed = 1;

  /** set of support vectors, that is, vectors with alpha(*)!=0 **/
  protected SMOset m_supportVectors;

=======
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 * Base class implementation for learning algorithm of SMOreg
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -L &lt;double&gt;
 *  The epsilon parameter in epsilon-insensitive loss function.
 *  (default 1.0e-3)</pre>
 * 
 * <pre> -W &lt;double&gt;
 *  The random number seed.
 *  (default 1)</pre>
 * 
 <!-- options-end -->
 *
 * @author  Remco Bouckaert (remco@cs.waikato.ac.nz,rrb@xm.co.nz)
 * @version $Revision: 11614 $
 */
public class RegOptimizer 
  implements OptionHandler, Serializable, RevisionHandler {
  
  /** for serialization */
  private static final long serialVersionUID = -2198266997254461814L;
  
  /** loss type **/
  //protected int m_nLossType = EPSILON;
  
  /** the loss type: L1 */
  //public final static int L1 = 1;
  /** the loss type: L2 */
  //public final static int L2 = 2;
  /** the loss type: HUBER */
  //public final static int HUBER = 3;
  /** the loss type: EPSILON */
  //public final static int EPSILON = 4;
  /** the loss type */
  //public static final Tag[] TAGS_LOSS_TYPE = {
  //  new Tag(L2, "L2"),
  //  new Tag(L1, "L1"),
  //  new Tag(HUBER, "Huber"),
  //  new Tag(EPSILON, "EPSILON"),
  //};
  /** alpha and alpha* arrays containing weights for solving dual problem **/
  public double[] m_alpha;
  public double[] m_alphaStar;
  
  /** offset **/
  protected double m_b;
  
  /** epsilon of epsilon-insensitive cost function **/
  protected double m_epsilon = 1e-3;
  
  /** capacity parameter, copied from SMOreg **/
  protected double m_C = 1.0;
  
  /** class values/desired output vector **/
  protected double[] m_target;
  
  /** points to data set **/
  protected Instances m_data;
  
  /** the kernel */
  protected Kernel m_kernel;
  
  /** index of class variable in data set **/
  protected int m_classIndex = -1;
  
  /** number of instances in data set **/
  protected int m_nInstances = -1;
  
  /** random number generator **/
  protected Random m_random;
  
  /** seed for initializing random number generator **/
  protected int m_nSeed = 1;
  
  /** set of support vectors, that is, vectors with alpha(*)!=0 **/
  protected SMOset m_supportVectors;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** number of kernel evaluations, used for printing statistics only **/
  protected long m_nEvals = 0;

  /** number of kernel cache hits, used for printing statistics only **/
  protected int m_nCacheHits = -1;
<<<<<<< HEAD

  /** weights for linear kernel **/
  protected double[] m_weights;

  /**
   * Variables to hold weight vector in sparse form. (To reduce storage
   * requirements.)
   */
  protected double[] m_sparseWeights;
  protected int[] m_sparseIndices;

=======
  
  /** weights for linear kernel **/
  protected double[] m_weights;
  
  /** Variables to hold weight vector in sparse form.
   (To reduce storage requirements.) */
  protected double[] m_sparseWeights;
  protected int[] m_sparseIndices;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** flag to indicate whether the model is built yet **/
  protected boolean m_bModelBuilt = false;

  /** parent SMOreg class **/
  protected SMOreg m_SVM = null;
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * the default constructor
   */
  public RegOptimizer() {
    super();
    m_random = new Random(m_nSeed);
  }
<<<<<<< HEAD

  /**
   * Gets an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tThe epsilon parameter in epsilon-insensitive loss function.\n"
        + "\t(default 1.0e-3)", "L", 1, "-L <double>"));

    // result.addElement(new Option(
    // "\tLoss type (L1, L2, Huber, Epsilon insensitive loss)\n",
    // "L", 1, "-L [L1|L2|HUBER|EPSILON]"));

    result.addElement(new Option("\tThe random number seed.\n"
      + "\t(default 1)", "W", 1, "-W <double>"));

    return result.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -L &lt;double&gt;
   *  The epsilon parameter in epsilon-insensitive loss function.
   *  (default 1.0e-3)
   * </pre>
   * 
   * <pre>
   * -W &lt;double&gt;
   *  The random number seed.
   *  (default 1)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

=======
  
  /**
   * Gets an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();
    
    result.addElement(new Option(
	"\tThe epsilon parameter in epsilon-insensitive loss function.\n" 
	+ "\t(default 1.0e-3)", 
	"L", 1, "-L <double>"));
    
//  result.addElement(new Option(
//      "\tLoss type (L1, L2, Huber, Epsilon insensitive loss)\n",
//      "L", 1, "-L [L1|L2|HUBER|EPSILON]"));
    
    result.addElement(new Option(
	"\tThe random number seed.\n" 
	+ "\t(default 1)", 
	"W", 1, "-W <double>"));
    
    return result.elements();
  }
  
  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -L &lt;double&gt;
   *  The epsilon parameter in epsilon-insensitive loss function.
   *  (default 1.0e-3)</pre>
   * 
   * <pre> -W &lt;double&gt;
   *  The random number seed.
   *  (default 1)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported 
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    tmpStr = Utils.getOption('L', options);
    if (tmpStr.length() != 0) {
      setEpsilonParameter(Double.parseDouble(tmpStr));
    } else {
      setEpsilonParameter(1.0e-3);
    }
<<<<<<< HEAD

    /*
     * tmpStr = Utils.getOption('S', options); if (tmpStr.length() != 0)
     * setLossType(new SelectedTag(tmpStr, TAGS_LOSS_TYPE)); else
     * setLossType(new SelectedTag(EPSILON, TAGS_LOSS_TYPE));
     */

=======
    
    /*
    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0)
      setLossType(new SelectedTag(tmpStr, TAGS_LOSS_TYPE));
    else
      setLossType(new SelectedTag(EPSILON, TAGS_LOSS_TYPE));
    */
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() != 0) {
      setSeed(Integer.parseInt(tmpStr));
    } else {
      setSeed(1);
    }
  }
<<<<<<< HEAD

  /**
   * Gets the current settings of the classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    result.add("-L");
    result.add("" + getEpsilonParameter());

    result.add("-W");
    result.add("" + getSeed());

    // result.add("-S";
    // result.add((new SelectedTag(m_nLossType,
    // TAGS_LOSS_TYPE)).getSelectedTag().getReadable();

    return result.toArray(new String[result.size()]);
=======
  
  /**
   * Gets the current settings of the classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector    	result;

    result = new Vector();

    result.add("-L");
    result.add("" + getEpsilonParameter());
    
    result.add("-W");
    result.add("" + getSeed());
    
    //result.add("-S";
    //result.add((new SelectedTag(m_nLossType, TAGS_LOSS_TYPE)).getSelectedTag().getReadable();

    return (String[]) result.toArray(new String[result.size()]);	  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * flag to indicate whether the model was built yet
   * 
<<<<<<< HEAD
   * @return true if the model was built
=======
   * @return		true if the model was built
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public boolean modelBuilt() {
    return m_bModelBuilt;
  }

  /**
   * sets the parent SVM
   * 
<<<<<<< HEAD
   * @param value the parent SVM
=======
   * @param value	the parent SVM
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setSMOReg(SMOreg value) {
    m_SVM = value;
  }

  /**
   * returns the number of kernel evaluations
   * 
<<<<<<< HEAD
   * @return the number of kernel evaluations
=======
   * @return		the number of kernel evaluations
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public long getKernelEvaluations() {
    return m_nEvals;
  }

  /**
   * return the number of kernel cache hits
   * 
<<<<<<< HEAD
   * @return the number of hits
=======
   * @return		the number of hits
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getCacheHits() {
    return m_nCacheHits;
  }

  /**
   * initializes the algorithm
   * 
<<<<<<< HEAD
   * @param data the data to work with
   * @throws Exception if m_SVM is null
   */
  protected void init(Instances data) throws Exception {
    if (m_SVM == null) {
      throw new Exception(
        "SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()");
=======
   * @param data	the data to work with
   * @throws Exception 	if m_SVM is null
   */
  protected void init(Instances data) throws Exception {
    if (m_SVM == null) {
      throw new Exception ("SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    m_C = m_SVM.getC();
    m_data = data;
    m_classIndex = data.classIndex();
    m_nInstances = data.numInstances();
<<<<<<< HEAD

    // Initialize kernel
    m_kernel = Kernel.makeCopy(m_SVM.getKernel());
    m_kernel.buildKernel(data);

    // init m_target
=======
    
    // Initialize kernel
    m_kernel = Kernel.makeCopy(m_SVM.getKernel());
    m_kernel.buildKernel(data);
    
    //init m_target
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_target = new double[m_nInstances];
    for (int i = 0; i < m_nInstances; i++) {
      m_target[i] = data.instance(i).classValue();
    }
<<<<<<< HEAD

    m_random = new Random(m_nSeed);

    // initialize alpha and alpha* array to all zero
    m_alpha = new double[m_target.length];
    m_alphaStar = new double[m_target.length];

    m_supportVectors = new SMOset(m_nInstances);

=======
    
    m_random = new Random(m_nSeed);
    
    //		initialize alpha and alpha* array to all zero 
    m_alpha = new double[m_target.length];
    m_alphaStar = new double[m_target.length];
    
    m_supportVectors = new SMOset(m_nInstances);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_b = 0.0;
    m_nEvals = 0;
    m_nCacheHits = -1;
  }
<<<<<<< HEAD

  /**
   * wrap up various variables to save memeory and do some housekeeping after
   * optimization has finished.
   * 
   * @throws Exception if something goes wrong
   */
  protected void wrapUp() throws Exception {
    m_target = null;

    m_nEvals = m_kernel.numEvals();
    m_nCacheHits = m_kernel.numCacheHits();

    if ((m_SVM.getKernel() instanceof PolyKernel)
      && ((PolyKernel) m_SVM.getKernel()).getExponent() == 1.0) {
      // convert alpha's to weights
      double[] weights = new double[m_data.numAttributes()];
      for (int k = m_supportVectors.getNext(-1); k != -1; k = m_supportVectors
        .getNext(k)) {
        for (int j = 0; j < weights.length; j++) {
          if (j != m_classIndex) {
            weights[j] += (m_alpha[k] - m_alphaStar[k])
              * m_data.instance(k).value(j);
          }
        }
      }
      m_weights = weights;

=======
  
  /** 
   * wrap up various variables to save memeory and do some housekeeping after optimization
   * has finished.
   *
   * @throws Exception	if something goes wrong
   */
  protected void wrapUp() throws Exception {
    m_target = null;
    
    m_nEvals = m_kernel.numEvals();
    m_nCacheHits = m_kernel.numCacheHits();
    
    if ((m_SVM.getKernel() instanceof PolyKernel) && ((PolyKernel) m_SVM.getKernel()).getExponent() == 1.0) {
      // convert alpha's to weights
      double [] weights = new double[m_data.numAttributes()];
      for (int k = m_supportVectors.getNext(-1); k != -1; k = m_supportVectors.getNext(k)) {
	for (int j = 0; j < weights.length; j++) {
	  if (j != m_classIndex) {
	    weights[j] += (m_alpha[k] - m_alphaStar[k]) * m_data.instance(k).value(j);
	  }
	}
      }
      m_weights = weights;
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // release memory
      m_alpha = null;
      m_alphaStar = null;
      m_kernel = null;
<<<<<<< HEAD

    } else {
      m_kernel.clean();
    }
    m_bModelBuilt = true;
  }

  /**
   * Compute the value of the objective function.
   * 
   * @return the score
   * @throws Exception if something goes wrong
=======
      
    }
    m_bModelBuilt = true;
  }
  
  /**
   * Compute the value of the objective function.
   * 
   * @return		the score
   * @throws Exception	if something goes wrong
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected double getScore() throws Exception {
    double res = 0;
    double t = 0, t2 = 0;
<<<<<<< HEAD
    for (int i = 0; i < m_nInstances; i++) {
      for (int j = 0; j < m_nInstances; j++) {
        t += (m_alpha[i] - m_alphaStar[i]) * (m_alpha[j] - m_alphaStar[j])
          * m_kernel.eval(i, j, m_data.instance(i));
      }
      // switch(m_nLossType) {
      // case L1:
      // t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alpha_[i]);
      // break;
      // case L2:
      // t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alpha_[i]) -
      // (0.5/m_SVM.getC()) * (m_alpha[i]*m_alpha[i] + m_alpha_[i]*m_alpha_[i]);
      // break;
      // case HUBER:
      // t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alpha_[i]) -
      // (0.5*m_SVM.getEpsilon()/m_SVM.getC()) * (m_alpha[i]*m_alpha[i] +
      // m_alpha_[i]*m_alpha_[i]);
      // break;
      // case EPSILON:
      // t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alphaStar[i]) -
      // m_epsilon * (m_alpha[i] + m_alphaStar[i]);
      t2 += m_target[i] * (m_alpha[i] - m_alphaStar[i]) - m_epsilon
        * (m_alpha[i] + m_alphaStar[i]);
      // break;
      // }
=======
    double sumAlpha = 0.0;
    for (int i = 0; i < m_nInstances; i++) {
      sumAlpha += (m_alpha[i] - m_alphaStar[i]);
      for (int j = 0; j < m_nInstances; j++) {
	t += (m_alpha[i] - m_alphaStar[i]) * (m_alpha[j] - m_alphaStar[j]) * m_kernel.eval(i, j, m_data.instance(i));
      }
//    switch(m_nLossType) {
//    case L1:
//    t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alpha_[i]);
//    break;
//    case L2:
//    t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alpha_[i]) - (0.5/m_SVM.getC()) * (m_alpha[i]*m_alpha[i] + m_alpha_[i]*m_alpha_[i]);
//    break;
//    case HUBER:
//    t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alpha_[i]) - (0.5*m_SVM.getEpsilon()/m_SVM.getC()) * (m_alpha[i]*m_alpha[i] + m_alpha_[i]*m_alpha_[i]);
//    break;
//    case EPSILON:
      //t2 += m_data.instance(i).classValue() * (m_alpha[i] - m_alphaStar[i]) - m_epsilon * (m_alpha[i] + m_alphaStar[i]);
      t2 += m_target[i] * (m_alpha[i] - m_alphaStar[i]) - m_epsilon * (m_alpha[i] + m_alphaStar[i]);
//    break;
//    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    res += -0.5 * t + t2;
    return res;
  }
<<<<<<< HEAD

  /**
   * learn SVM parameters from data. Subclasses should implement something more
   * interesting.
   * 
   * @param data the data to work with
   * @throws Exception always an Exceoption since subclasses must override it
=======
  
  /** 
   * learn SVM parameters from data.
   * Subclasses should implement something more interesting.
   * 
   * @param data	the data to work with
   * @throws Exception	always an Exceoption since subclasses must override it
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void buildClassifier(Instances data) throws Exception {
    throw new Exception("Don't call this directly, use subclass instead");
  }
<<<<<<< HEAD

  /**
   * sets the loss type type to use
   * 
   * @param newLossType the loss type to use
   */
  // public void setLossType(SelectedTag newLossType) {
  // if (newLossType.getTags() == TAGS_LOSS_TYPE) {
  // m_nLossType = newLossType.getSelectedTag().getID();
  // }
  // }

  /**
   * returns the current loss type
   * 
   * @return the loss type
   */
  // public SelectedTag getLossType() {
  // return new SelectedTag(m_nLossType, TAGS_LOSS_TYPE);
  // }

  /**
   * SVMOutput of an instance in the training set, m_data This uses the cache,
   * unlike SVMOutput(Instance)
   * 
   * @param index index of the training instance in m_data
   * @return the SVM output
   * @throws Exception if something goes wrong
   */
  protected double SVMOutput(int index) throws Exception {
    double result = -m_b;
    for (int i = m_supportVectors.getNext(-1); i != -1; i = m_supportVectors
      .getNext(i)) {
      result += (m_alpha[i] - m_alphaStar[i])
        * m_kernel.eval(index, i, m_data.instance(index));
    }
    return result;
  }

=======
  
  /**
   * sets the loss type type to use
   * 
   * @param newLossType	the loss type to use
   */
  //public void setLossType(SelectedTag newLossType) {
  //  if (newLossType.getTags() == TAGS_LOSS_TYPE) {
  //    m_nLossType = newLossType.getSelectedTag().getID();
  //   }
  //}
   
  /**
   * returns the current loss type
   * 
   * @return		the loss type
   */
  //public SelectedTag getLossType() {
  //  return new SelectedTag(m_nLossType, TAGS_LOSS_TYPE);
  //}
  
  /** 
   * SVMOutput of an instance in the training set, m_data
   * This uses the cache, unlike SVMOutput(Instance)
   * 
   * @param index 	index of the training instance in m_data
   * @return		the SVM output
   * @throws Exception	if something goes wrong
   */
  protected double SVMOutput(int index) throws Exception {
    double result = -m_b;
    for (int i = m_supportVectors.getNext(-1); i != -1; i = m_supportVectors.getNext(i)) {
      result += (m_alpha[i] - m_alphaStar[i]) * m_kernel.eval(index, i, m_data.instance(index));
    }
    return result;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * 
   * @param inst
   * @return
   * @throws Exception
   */
  public double SVMOutput(Instance inst) throws Exception {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double result = -m_b;
    // Is the machine linear?
    if (m_weights != null) {
      // Is weight vector stored in sparse format?
      for (int i = 0; i < inst.numValues(); i++) {
<<<<<<< HEAD
        if (inst.index(i) != m_classIndex) {
          result += m_weights[inst.index(i)] * inst.valueSparse(i);
        }
      }
    } else {
      for (int i = m_supportVectors.getNext(-1); i != -1; i = m_supportVectors
        .getNext(i)) {
        result += (m_alpha[i] - m_alphaStar[i]) * m_kernel.eval(-1, i, inst);
=======
	if (inst.index(i) != m_classIndex) {
	  result += m_weights[inst.index(i)] * inst.valueSparse(i);
	}
      }
    } else {
      for (int i = m_supportVectors.getNext(-1); i != -1; i = m_supportVectors.getNext(i)) {
	result += (m_alpha[i] - m_alphaStar[i]) * m_kernel.eval(-1, i, inst);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return result;
  }
<<<<<<< HEAD

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String seedTipText() {
    return "Seed for random number generator.";
  }
<<<<<<< HEAD

  /**
   * Gets the current seed value for the random number generator
   * 
   * @return the seed value
=======
  
  /**
   * Gets the current seed value for the random number generator
   * 
   * @return		the seed value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getSeed() {
    return m_nSeed;
  }
<<<<<<< HEAD

  /**
   * Sets the seed value for the random number generator
   * 
   * @param value the seed value
=======
  
  /**
   * Sets the seed value for the random number generator
   * 
   * @param value	the seed value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setSeed(int value) {
    m_nSeed = value;
  }
<<<<<<< HEAD

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String epsilonParameterTipText() {
    return "The epsilon parameter of the epsilon insensitive loss function.(default 0.001).";
  }
<<<<<<< HEAD

  /**
   * Get the value of epsilon parameter of the epsilon insensitive loss
   * function.
   * 
   * @return Value of epsilon parameter.
=======
  
  /**
   * Get the value of epsilon parameter of the epsilon insensitive loss function.
   * 
   * @return 		Value of epsilon parameter.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double getEpsilonParameter() {
    return m_epsilon;
  }
<<<<<<< HEAD

  /**
   * Set the value of epsilon parameter of the epsilon insensitive loss
   * function.
   * 
   * @param v Value to assign to epsilon parameter.
=======
  
  /**
   * Set the value of epsilon parameter of the epsilon insensitive loss function.
   * 
   * @param v  		Value to assign to epsilon parameter.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setEpsilonParameter(double v) {
    m_epsilon = v;
  }
<<<<<<< HEAD

  /**
   * Prints out the classifier.
   * 
   * @return a description of the classifier as a string
   */
  @Override
=======
  
  /**
   * Prints out the classifier.
   *
   * @return 		a description of the classifier as a string
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String toString() {
    StringBuffer text = new StringBuffer();
    text.append("SMOreg\n\n");
    if (m_weights != null) {
      text.append("weights (not support vectors):\n");
      // it's a linear machine
      for (int i = 0; i < m_data.numAttributes(); i++) {
<<<<<<< HEAD
        if (i != m_classIndex) {
          text.append((m_weights[i] >= 0 ? " + " : " - ")
            + Utils.doubleToString(Math.abs(m_weights[i]), 12, 4) + " * ");
          if (m_SVM.getFilterType().getSelectedTag().getID() == SMOreg.FILTER_STANDARDIZE) {
            text.append("(standardized) ");
          } else if (m_SVM.getFilterType().getSelectedTag().getID() == SMOreg.FILTER_NORMALIZE) {
            text.append("(normalized) ");
          }
          text.append(m_data.attribute(i).name() + "\n");
        }
=======
	if (i != m_classIndex) {
	  text.append((m_weights[i] >= 0 ? " + " : " - ") + Utils.doubleToString(Math.abs(m_weights[i]), 12, 4) + " * ");
	  if (m_SVM.getFilterType().getSelectedTag().getID() == SMOreg.FILTER_STANDARDIZE) {
	    text.append("(standardized) ");
	  } else if (m_SVM.getFilterType().getSelectedTag().getID() == SMOreg.FILTER_NORMALIZE) {
	    text.append("(normalized) ");
	  }
	  text.append(m_data.attribute(i).name() + "\n");
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } else {
      // non linear, print out all supportvectors
      text.append("Support vectors:\n");
      for (int i = 0; i < m_nInstances; i++) {
<<<<<<< HEAD
        if (m_alpha[i] > 0) {
          text.append("+" + m_alpha[i] + " * k[" + i + "]\n");
        }
        if (m_alphaStar[i] > 0) {
          text.append("-" + m_alphaStar[i] + " * k[" + i + "]\n");
        }
      }
    }

    text.append((m_b <= 0 ? " + " : " - ")
      + Utils.doubleToString(Math.abs(m_b), 12, 4) + "\n\n");

    text.append("\n\nNumber of kernel evaluations: " + m_nEvals);
    if (m_nCacheHits >= 0 && m_nEvals > 0) {
      double hitRatio = 1 - m_nEvals * 1.0 / (m_nCacheHits + m_nEvals);
      text.append(" (" + Utils.doubleToString(hitRatio * 100, 7, 3).trim()
        + "% cached)");
    }

    return text.toString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 12533 $");
=======
	if (m_alpha[i] > 0) {
	  text.append("+" + m_alpha[i] + " * k[" + i + "]\n");
	}
	if (m_alphaStar[i] > 0) {
	  text.append("-" + m_alphaStar[i] + " * k[" + i + "]\n");
	}
      }
    }
    
    text.append((m_b<=0?" + ":" - ") + Utils.doubleToString(Math.abs(m_b), 12, 4) + "\n\n");
    
    text.append("\n\nNumber of kernel evaluations: " + m_nEvals);
    if (m_nCacheHits >= 0 && m_nEvals > 0) {
      double hitRatio = 1 - m_nEvals * 1.0 / (m_nCacheHits + m_nEvals);
      text.append(" (" + Utils.doubleToString(hitRatio * 100, 7, 3).trim() + "% cached)");
    }
    
    return text.toString();		
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11614 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
