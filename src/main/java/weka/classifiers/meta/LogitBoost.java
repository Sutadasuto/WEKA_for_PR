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
 *    LogitBoost.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2014 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999, 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.meta;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.IterativeClassifier;
import weka.classifiers.RandomizableIteratedSingleClassifierEnhancer;
import weka.classifiers.Sourcable;
import weka.classifiers.rules.ZeroR;
import weka.core.Attribute;
import weka.core.BatchPredictor;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
=======
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.RandomizableIteratedSingleClassifierEnhancer;
import weka.classifiers.Sourcable;
import weka.core.Attribute;
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
<<<<<<< HEAD
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.UnassignedClassException;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;

/**
 * <!-- globalinfo-start --> Class for performing additive logistic regression. <br/>
 * This class performs classification using a regression scheme as the base
 * learner, and can handle multi-class problems. For more information, see<br/>
 * <br/>
 * J. Friedman, T. Hastie, R. Tibshirani (1998). Additive Logistic Regression: a
 * Statistical View of Boosting. Stanford University.<br/>
 * <br/>
 * <p/>
 * <!-- globalinfo-end -->
 *
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
import weka.core.Capabilities.Capability;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Class for performing additive logistic regression. <br/>
 * This class performs classification using a regression scheme as the base learner, and can handle multi-class problems.  For more information, see<br/>
 * <br/>
 * J. Friedman, T. Hastie, R. Tibshirani (1998). Additive Logistic Regression: a Statistical View of Boosting. Stanford University.<br/>
 * <br/>
 * Can do efficient internal cross-validation to determine appropriate number of iterations.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;techreport{Friedman1998,
 *    address = {Stanford University},
 *    author = {J. Friedman and T. Hastie and R. Tibshirani},
 *    title = {Additive Logistic Regression: a Statistical View of Boosting},
 *    year = {1998},
 *    PS = {http://www-stat.stanford.edu/\~jhf/ftp/boost.ps}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
 * <!-- technical-bibtex-end -->
 *
 * <!-- options-start --> Valid options are:
 * <p/>
 *
 * <pre>
 * -Q
 *  Use resampling instead of reweighting for boosting.
 * </pre>
 *
 * <pre>
 * -use-estimated-priors
 *  Use estimated priors rather than uniform ones.
 * </pre>
 *
 * <pre>
 * -P &lt;percent&gt;
 *  Percentage of weight mass to base training on.
 *  (default 100, reduce to around 90 speed up)
 * </pre>
 * 
 * <pre>
 * -L &lt;num&gt;
 *  Threshold on the improvement of the likelihood.
 *  (default -Double.MAX_VALUE)
 * </pre>
 * 
 * <pre>
 * -H &lt;num&gt;
 *  Shrinkage parameter.
 *  (default 1)
 * </pre>
 * 
 * <pre>
 * -Z &lt;num&gt;
 *  Z max threshold for responses.
 *  (default 3)
 * </pre>
 * 
 * <pre>
 * -O &lt;int&gt;
 *  The size of the thread pool, for example, the number of cores in the CPU. (default 1)
 * </pre>
 * 
 * <pre>
 * -E &lt;int&gt;
 *  The number of threads to use for batch prediction, which should be &gt;= size of thread pool.
 *  (default 1)
 * </pre>
 * 
 * <pre>
 * -S &lt;num&gt;
 *  Random number seed.
 *  (default 1)
 * </pre>
 * 
 * <pre>
 * -I &lt;num&gt;
 *  Number of iterations.
 *  (default 10)
 * </pre>
 * 
 * <pre>
 * -W
 *  Full name of base classifier.
 *  (default: weka.classifiers.trees.DecisionStump)
 * </pre>
 * 
 * <pre>
 * -output-debug-info
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
 * 
 * <pre>
 * -do-not-check-capabilities
 *  If set, classifier capabilities are not checked before classifier is built
 *  (use with caution).
 * </pre>
 * 
 * <pre>
 * Options specific to classifier weka.classifiers.trees.DecisionStump:
 * </pre>
 * 
 * <pre>
 * -output-debug-info
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
 * 
 * <pre>
 * -do-not-check-capabilities
 *  If set, classifier capabilities are not checked before classifier is built
 *  (use with caution).
 * </pre>
 * 
 * <!-- options-end -->
 *
 * Options after -- are passed to the designated learner.
 * <p>
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14463 $
 */
public class LogitBoost extends RandomizableIteratedSingleClassifierEnhancer
  implements Sourcable, WeightedInstancesHandler, TechnicalInformationHandler,
  IterativeClassifier, BatchPredictor {

  /** for serialization */
  static final long serialVersionUID = -1105660358715833753L;

  /**
   * ArrayList for storing the generated base classifiers. Note: we are hiding
   * the variable from IteratedSingleClassifierEnhancer
   */
  protected ArrayList<Classifier[]> m_Classifiers;
=======
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -Q
 *  Use resampling instead of reweighting for boosting.</pre>
 * 
 * <pre> -P &lt;percent&gt;
 *  Percentage of weight mass to base training on.
 *  (default 100, reduce to around 90 speed up)</pre>
 * 
 * <pre> -F &lt;num&gt;
 *  Number of folds for internal cross-validation.
 *  (default 0 -- no cross-validation)</pre>
 * 
 * <pre> -R &lt;num&gt;
 *  Number of runs for internal cross-validation.
 *  (default 1)</pre>
 * 
 * <pre> -L &lt;num&gt;
 *  Threshold on the improvement of the likelihood.
 *  (default -Double.MAX_VALUE)</pre>
 * 
 * <pre> -H &lt;num&gt;
 *  Shrinkage parameter.
 *  (default 1)</pre>
 * 
 * <pre> -S &lt;num&gt;
 *  Random number seed.
 *  (default 1)</pre>
 * 
 * <pre> -I &lt;num&gt;
 *  Number of iterations.
 *  (default 10)</pre>
 * 
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 * <pre> -W
 *  Full name of base classifier.
 *  (default: weka.classifiers.trees.DecisionStump)</pre>
 * 
 * <pre> 
 * Options specific to classifier weka.classifiers.trees.DecisionStump:
 * </pre>
 * 
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 <!-- options-end -->
 *
 * Options after -- are passed to the designated learner.<p>
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 9371 $ 
 */
public class LogitBoost 
  extends RandomizableIteratedSingleClassifierEnhancer
  implements Sourcable, WeightedInstancesHandler, TechnicalInformationHandler {

  /** for serialization */
  private static final long serialVersionUID = 8627452775249625582L;

  /** Array for storing the generated base classifiers. 
   Note: we are hiding the variable from IteratedSingleClassifierEnhancer*/
  protected Classifier [][] m_Classifiers;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The number of classes */
  protected int m_NumClasses;

  /** The number of successfully generated base classifiers. */
  protected int m_NumGenerated;

<<<<<<< HEAD
=======
  /** The number of folds for the internal cross-validation. */
  protected int m_NumFolds = 0;

  /** The number of runs for the internal cross-validation. */
  protected int m_NumRuns = 1;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Weight thresholding. The percentage of weight mass used in training */
  protected int m_WeightThreshold = 100;

  /** A threshold for responses (Friedman suggests between 2 and 4) */
<<<<<<< HEAD
  protected static final double DEFAULT_Z_MAX = 3;
=======
  protected static final double Z_MAX = 3;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Dummy dataset with a numeric class */
  protected Instances m_NumericClassData;

  /** The actual class attribute (for getting class names) */
  protected Attribute m_ClassAttribute;

  /** Use boosting with reweighting? */
  protected boolean m_UseResampling;

<<<<<<< HEAD
  /** The threshold on the improvement of the likelihood */
=======
  /** The threshold on the improvement of the likelihood */   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected double m_Precision = -Double.MAX_VALUE;

  /** The value of the shrinkage parameter */
  protected double m_Shrinkage = 1;

<<<<<<< HEAD
  /** Whether to start with class priors estimated from the training data */
  protected boolean m_UseEstimatedPriors = false;

  /** The random number generator used */
  protected Random m_RandomInstance = null;

  /**
   * The value by which the actual target value for the true class is offset.
   */
  protected double m_Offset = 0.0;

  /** A ZeroR model in case no model can be built from the data */
  protected Classifier m_ZeroR;

  /** The initial F scores (0 by default) */
  protected double[] m_InitialFs;

  /** The Z max value to use */
  protected double m_zMax = DEFAULT_Z_MAX;

  /** The y values used during the training process. */
  protected double[][] m_trainYs;

  /** The F scores used during the training process. */
  protected double[][] m_trainFs;

  /** The probabilities used during the training process. */
  protected double[][] m_probs;

  /** The current loglikelihood. */
  protected double m_logLikelihood;

  /** The total weight of the data. */
  protected double m_sumOfWeights;

  /** The training data. */
  protected Instances m_data;

  /** The number of threads to use at prediction time in batch prediction. */
  protected int m_numThreads = 1;

  /** The size of the thread pool. */
  protected int m_poolSize = 1;

  /**
   * Returns a string describing classifier
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
=======
  /** The random number generator used */
  protected Random m_RandomInstance = null;

  /** The value by which the actual target value for the
      true class is offset. */
  protected double m_Offset = 0.0;
    
  /** a ZeroR model in case no model can be built from the data */
  protected Classifier m_ZeroR;
    
  /**
   * Returns a string describing classifier
   * @return a description suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String globalInfo() {

    return "Class for performing additive logistic regression. \n"
      + "This class performs classification using a regression scheme as the "
      + "base learner, and can handle multi-class problems.  For more "
<<<<<<< HEAD
      + "information, see\n\n" + getTechnicalInformation().toString();
  }

=======
      + "information, see\n\n"
      + getTechnicalInformation().toString() + "\n\n"
      + "Can do efficient internal cross-validation to determine "
      + "appropriate number of iterations.";
  }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Constructor.
   */
  public LogitBoost() {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_Classifier = new weka.classifiers.trees.DecisionStump();
  }

  /**
<<<<<<< HEAD
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
=======
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
<<<<<<< HEAD
    TechnicalInformation result;

    result = new TechnicalInformation(Type.TECHREPORT);
    result
      .setValue(Field.AUTHOR, "J. Friedman and T. Hastie and R. Tibshirani");
    result.setValue(Field.YEAR, "1998");
    result.setValue(Field.TITLE,
      "Additive Logistic Regression: a Statistical View of Boosting");
    result.setValue(Field.ADDRESS, "Stanford University");
    result.setValue(Field.PS, "http://www-stat.stanford.edu/~jhf/ftp/boost.ps");

=======
    TechnicalInformation 	result;
    
    result = new TechnicalInformation(Type.TECHREPORT);
    result.setValue(Field.AUTHOR, "J. Friedman and T. Hastie and R. Tibshirani");
    result.setValue(Field.YEAR, "1998");
    result.setValue(Field.TITLE, "Additive Logistic Regression: a Statistical View of Boosting");
    result.setValue(Field.ADDRESS, "Stanford University");
    result.setValue(Field.PS, "http://www-stat.stanford.edu/~jhf/ftp/boost.ps");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * String describing default classifier.
   * 
   * @return the default classifier classname
   */
  protected String defaultClassifierString() {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return "weka.classifiers.trees.DecisionStump";
  }

  /**
<<<<<<< HEAD
   * Select only instances with weights that contribute to the specified
   * quantile of the weight distribution
   *
   * @param data the input instances
   * @param quantile the specified quantile eg 0.9 to select 90% of the weight
   *          mass
   * @return the selected instances
   */
  protected Instances selectWeightQuantile(Instances data, double quantile) {

    int numInstances = data.numInstances();
    Instances trainData = new Instances(data, numInstances);
    double[] weights = new double[numInstances];
=======
   * Select only instances with weights that contribute to 
   * the specified quantile of the weight distribution
   *
   * @param data the input instances
   * @param quantile the specified quantile eg 0.9 to select 
   * 90% of the weight mass
   * @return the selected instances
   */
  protected Instances selectWeightQuantile(Instances data, double quantile) { 

    int numInstances = data.numInstances();
    Instances trainData = new Instances(data, numInstances);
    double [] weights = new double [numInstances];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    double sumOfWeights = 0;
    for (int i = 0; i < numInstances; i++) {
      weights[i] = data.instance(i).weight();
      sumOfWeights += weights[i];
    }
    double weightMassToSelect = sumOfWeights * quantile;
<<<<<<< HEAD
    int[] sortedIndices = Utils.sort(weights);

    // Select the instances
    sumOfWeights = 0;
    for (int i = numInstances - 1; i >= 0; i--) {
      Instance instance = (Instance) data.instance(sortedIndices[i]).copy();
      trainData.add(instance);
      sumOfWeights += weights[sortedIndices[i]];
      if ((sumOfWeights > weightMassToSelect) && (i > 0)
        && (weights[sortedIndices[i]] != weights[sortedIndices[i - 1]])) {
        break;
      }
    }
    if (m_Debug) {
      System.err.println("Selected " + trainData.numInstances() + " out of "
        + numInstances);
=======
    int [] sortedIndices = Utils.sort(weights);

    // Select the instances
    sumOfWeights = 0;
    for (int i = numInstances-1; i >= 0; i--) {
      Instance instance = (Instance)data.instance(sortedIndices[i]).copy();
      trainData.add(instance);
      sumOfWeights += weights[sortedIndices[i]];
      if ((sumOfWeights > weightMassToSelect) && 
	  (i > 0) && 
	  (weights[sortedIndices[i]] != weights[sortedIndices[i-1]])) {
	break;
      }
    }
    if (m_Debug) {
      System.err.println("Selected " + trainData.numInstances()
			 + " out of " + numInstances);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return trainData;
  }

  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(5);

    newVector.addElement(new Option(
            "\tUse resampling instead of reweighting for boosting.", "Q", 0, "-Q"));
    newVector.addElement(new Option(
            "\tUse estimated priors rather than uniform ones.",
            "use-estimated-priors", 0, "-use-estimated-priors"));
    newVector.addElement(new Option(
      "\tPercentage of weight mass to base training on.\n"
        + "\t(default 100, reduce to around 90 speed up)", "P", 1,
      "-P <percent>"));
    newVector.addElement(new Option(
      "\tThreshold on the improvement of the likelihood.\n"
        + "\t(default -Double.MAX_VALUE)", "L", 1, "-L <num>"));
    newVector.addElement(new Option("\tShrinkage parameter.\n"
      + "\t(default 1)", "H", 1, "-H <num>"));
    newVector.addElement(new Option("\tZ max threshold for responses."
      + "\n\t(default 3)", "Z", 1, "-Z <num>"));
    newVector.addElement(new Option("\t" + poolSizeTipText() + " (default 1)",
      "O", 1, "-O <int>"));
    newVector.addElement(new Option("\t" + numThreadsTipText() + "\n"
      + "\t(default 1)", "E", 1, "-E <int>"));

    newVector.addAll(Collections.list(super.listOptions()));

    return newVector.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -Q
   *  Use resampling instead of reweighting for boosting.
   * </pre>
   *
   * <pre>
   * -use-estimated-priors
   *  Use estimated priors rather than uniform ones.
   * </pre>
   *
   * <pre>
   * -P &lt;percent&gt;
   *  Percentage of weight mass to base training on.
   *  (default 100, reduce to around 90 speed up)
   * </pre>
   * 
   * <pre>
   * -L &lt;num&gt;
   *  Threshold on the improvement of the likelihood.
   *  (default -Double.MAX_VALUE)
   * </pre>
   * 
   * <pre>
   * -H &lt;num&gt;
   *  Shrinkage parameter.
   *  (default 1)
   * </pre>
   * 
   * <pre>
   * -Z &lt;num&gt;
   *  Z max threshold for responses.
   *  (default 3)
   * </pre>
   * 
   * <pre>
   * -O &lt;int&gt;
   *  The size of the thread pool, for example, the number of cores in the CPU. (default 1)
   * </pre>
   * 
   * <pre>
   * -E &lt;int&gt;
   *  The number of threads to use for batch prediction, which should be &gt;= size of thread pool.
   *  (default 1)
   * </pre>
   * 
   * <pre>
   * -S &lt;num&gt;
   *  Random number seed.
   *  (default 1)
   * </pre>
   * 
   * <pre>
   * -I &lt;num&gt;
   *  Number of iterations.
   *  (default 10)
   * </pre>
   * 
   * <pre>
   * -W
   *  Full name of base classifier.
   *  (default: weka.classifiers.trees.DecisionStump)
   * </pre>
   * 
   * <pre>
   * -output-debug-info
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console
   * </pre>
   * 
   * <pre>
   * -do-not-check-capabilities
   *  If set, classifier capabilities are not checked before classifier is built
   *  (use with caution).
   * </pre>
   * 
   * <pre>
   * Options specific to classifier weka.classifiers.trees.DecisionStump:
   * </pre>
   * 
   * <pre>
   * -output-debug-info
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console
   * </pre>
   * 
   * <pre>
   * -do-not-check-capabilities
   *  If set, classifier capabilities are not checked before classifier is built
   *  (use with caution).
   * </pre>
   * 
   * <!-- options-end -->
   *
   * Options after -- are passed to the designated learner.
   * <p>
=======
  public Enumeration listOptions() {

    Vector newVector = new Vector(6);

    newVector.addElement(new Option(
	      "\tUse resampling instead of reweighting for boosting.",
	      "Q", 0, "-Q"));
    newVector.addElement(new Option(
	      "\tPercentage of weight mass to base training on.\n"
	      +"\t(default 100, reduce to around 90 speed up)",
	      "P", 1, "-P <percent>"));
    newVector.addElement(new Option(
	      "\tNumber of folds for internal cross-validation.\n"
	      +"\t(default 0 -- no cross-validation)",
	      "F", 1, "-F <num>"));
    newVector.addElement(new Option(
	      "\tNumber of runs for internal cross-validation.\n"
	      +"\t(default 1)",
	      "R", 1, "-R <num>"));
    newVector.addElement(new Option(
	      "\tThreshold on the improvement of the likelihood.\n"
	      +"\t(default -Double.MAX_VALUE)",
	      "L", 1, "-L <num>"));
    newVector.addElement(new Option(
	      "\tShrinkage parameter.\n"
	      +"\t(default 1)",
	      "H", 1, "-H <num>"));

    Enumeration enu = super.listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }
    return newVector.elements();
  }


  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -Q
   *  Use resampling instead of reweighting for boosting.</pre>
   * 
   * <pre> -P &lt;percent&gt;
   *  Percentage of weight mass to base training on.
   *  (default 100, reduce to around 90 speed up)</pre>
   * 
   * <pre> -F &lt;num&gt;
   *  Number of folds for internal cross-validation.
   *  (default 0 -- no cross-validation)</pre>
   * 
   * <pre> -R &lt;num&gt;
   *  Number of runs for internal cross-validation.
   *  (default 1)</pre>
   * 
   * <pre> -L &lt;num&gt;
   *  Threshold on the improvement of the likelihood.
   *  (default -Double.MAX_VALUE)</pre>
   * 
   * <pre> -H &lt;num&gt;
   *  Shrinkage parameter.
   *  (default 1)</pre>
   * 
   * <pre> -S &lt;num&gt;
   *  Random number seed.
   *  (default 1)</pre>
   * 
   * <pre> -I &lt;num&gt;
   *  Number of iterations.
   *  (default 10)</pre>
   * 
   * <pre> -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console</pre>
   * 
   * <pre> -W
   *  Full name of base classifier.
   *  (default: weka.classifiers.trees.DecisionStump)</pre>
   * 
   * <pre> 
   * Options specific to classifier weka.classifiers.trees.DecisionStump:
   * </pre>
   * 
   * <pre> -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console</pre>
   * 
   <!-- options-end -->
   *
   * Options after -- are passed to the designated learner.<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
<<<<<<< HEAD
=======
    
    String numFolds = Utils.getOption('F', options);
    if (numFolds.length() != 0) {
      setNumFolds(Integer.parseInt(numFolds));
    } else {
      setNumFolds(0);
    }
    
    String numRuns = Utils.getOption('R', options);
    if (numRuns.length() != 0) {
      setNumRuns(Integer.parseInt(numRuns));
    } else {
      setNumRuns(1);
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    String thresholdString = Utils.getOption('P', options);
    if (thresholdString.length() != 0) {
      setWeightThreshold(Integer.parseInt(thresholdString));
    } else {
      setWeightThreshold(100);
    }

    String precisionString = Utils.getOption('L', options);
    if (precisionString.length() != 0) {
<<<<<<< HEAD
      setLikelihoodThreshold(new Double(precisionString).doubleValue());
=======
      setLikelihoodThreshold(new Double(precisionString).
	doubleValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      setLikelihoodThreshold(-Double.MAX_VALUE);
    }

    String shrinkageString = Utils.getOption('H', options);
    if (shrinkageString.length() != 0) {
<<<<<<< HEAD
      setShrinkage(new Double(shrinkageString).doubleValue());
=======
      setShrinkage(new Double(shrinkageString).
	doubleValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      setShrinkage(1.0);
    }

<<<<<<< HEAD
    String zString = Utils.getOption('Z', options);
    if (zString.length() > 0) {
      setZMax(Double.parseDouble(zString));
    }

    setUseResampling(Utils.getFlag('Q', options));
    if (m_UseResampling && (thresholdString.length() != 0)) {
      throw new Exception("Weight pruning with resampling" + "not allowed.");
    }
    setUseEstimatedPriors(Utils.getFlag("use-estimated-priors", options));
    String PoolSize = Utils.getOption('O', options);
    if (PoolSize.length() != 0) {
      setPoolSize(Integer.parseInt(PoolSize));
    } else {
      setPoolSize(1);
    }
    String NumThreads = Utils.getOption('E', options);
    if (NumThreads.length() != 0) {
      setNumThreads(Integer.parseInt(NumThreads));
    } else {
      setNumThreads(1);
    }

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
=======
    setUseResampling(Utils.getFlag('Q', options));
    if (m_UseResampling && (thresholdString.length() != 0)) {
      throw new Exception("Weight pruning with resampling"+
			  "not allowed.");
    }

    super.setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
<<<<<<< HEAD
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    if (getUseResampling()) {
      options.add("-Q");
    } else {
      options.add("-P");
      options.add("" + getWeightThreshold());
    }
    if (getUseEstimatedPriors()) {
      options.add("-use-estimated-priors");
    }
    options.add("-L");
    options.add("" + getLikelihoodThreshold());
    options.add("-H");
    options.add("" + getShrinkage());
    options.add("-Z");
    options.add("" + getZMax());

    options.add("-O");
    options.add("" + getPoolSize());

    options.add("-E");
    options.add("" + getNumThreads());

    Collections.addAll(options, super.getOptions());

    return options.toArray(new String[0]);
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String ZMaxTipText() {
    return "Z max threshold for responses";
  }

  /**
   * Set the Z max threshold on the responses
   * 
   * @param zMax the threshold to use
   */
  public void setZMax(double zMax) {
    m_zMax = zMax;
  }

  /**
   * Get the Z max threshold on the responses
   * 
   * @return the threshold to use
   */
  public double getZMax() {
    return m_zMax;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  public String [] getOptions() {

    String [] superOptions = super.getOptions();
    String [] options = new String [superOptions.length + 10];

    int current = 0;
    if (getUseResampling()) {
      options[current++] = "-Q";
    } else {
      options[current++] = "-P"; 
      options[current++] = "" + getWeightThreshold();
    }
    options[current++] = "-F"; options[current++] = "" + getNumFolds();
    options[current++] = "-R"; options[current++] = "" + getNumRuns();
    options[current++] = "-L"; options[current++] = "" + getLikelihoodThreshold();
    options[current++] = "-H"; options[current++] = "" + getShrinkage();

    System.arraycopy(superOptions, 0, options, current, 
		     superOptions.length);
    current += superOptions.length;
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String shrinkageTipText() {
    return "Shrinkage parameter (use small value like 0.1 to reduce "
      + "overfitting).";
  }
<<<<<<< HEAD

=======
			 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Get the value of Shrinkage.
   *
   * @return Value of Shrinkage.
   */
  public double getShrinkage() {
<<<<<<< HEAD

    return m_Shrinkage;
  }

=======
    
    return m_Shrinkage;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set the value of Shrinkage.
   *
   * @param newShrinkage Value to assign to Shrinkage.
   */
  public void setShrinkage(double newShrinkage) {
<<<<<<< HEAD

    m_Shrinkage = newShrinkage;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
    
    m_Shrinkage = newShrinkage;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String likelihoodThresholdTipText() {
    return "Threshold on improvement in likelihood.";
  }
<<<<<<< HEAD

=======
			 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Get the value of Precision.
   *
   * @return Value of Precision.
   */
  public double getLikelihoodThreshold() {
<<<<<<< HEAD

    return m_Precision;
  }

=======
    
    return m_Precision;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set the value of Precision.
   *
   * @param newPrecision Value to assign to Precision.
   */
  public void setLikelihoodThreshold(double newPrecision) {
<<<<<<< HEAD

    m_Precision = newPrecision;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String useResamplingTipText() {
    return "Whether resampling is used instead of reweighting.";
  }

  /**
   * Set resampling mode
   *
   * @param r true if resampling should be done
   */
  public void setUseResampling(boolean r) {

    m_UseResampling = r;
  }

  /**
   * Get whether resampling is turned on
   *
   * @return true if resampling output is on
   */
  public boolean getUseResampling() {

    return m_UseResampling;
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String useEstimatedPriorsTipText() {
    return "Whether estimated priors are used rather than uniform ones.";
  }

=======
    
    m_Precision = newPrecision;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String numRunsTipText() {
    return "Number of runs for internal cross-validation.";
  }
  
  /**
   * Get the value of NumRuns.
   *
   * @return Value of NumRuns.
   */
  public int getNumRuns() {
    
    return m_NumRuns;
  }
  
  /**
   * Set the value of NumRuns.
   *
   * @param newNumRuns Value to assign to NumRuns.
   */
  public void setNumRuns(int newNumRuns) {
    
    m_NumRuns = newNumRuns;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String numFoldsTipText() {
    return "Number of folds for internal cross-validation (default 0 "
      + "means no cross-validation is performed).";
  }
  
  /**
   * Get the value of NumFolds.
   *
   * @return Value of NumFolds.
   */
  public int getNumFolds() {
    
    return m_NumFolds;
  }
  
  /**
   * Set the value of NumFolds.
   *
   * @param newNumFolds Value to assign to NumFolds.
   */
  public void setNumFolds(int newNumFolds) {
    
    m_NumFolds = newNumFolds;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String useResamplingTipText() {
    return "Whether resampling is used instead of reweighting.";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set resampling mode
   *
   * @param r true if resampling should be done
   */
<<<<<<< HEAD
  public void setUseEstimatedPriors(boolean r) {

    m_UseEstimatedPriors = r;
=======
  public void setUseResampling(boolean r) {
    
    m_UseResampling = r;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Get whether resampling is turned on
   *
   * @return true if resampling output is on
   */
<<<<<<< HEAD
  public boolean getUseEstimatedPriors() {

    return m_UseEstimatedPriors;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  public boolean getUseResampling() {
    
    return m_UseResampling;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String weightThresholdTipText() {
    return "Weight threshold for weight pruning (reduce to 90 "
      + "for speeding up learning process).";
  }

  /**
   * Set weight thresholding
   *
   * @param threshold the percentage of weight mass used for training
   */
  public void setWeightThreshold(int threshold) {

    m_WeightThreshold = threshold;
  }

  /**
   * Get the degree of weight thresholding
   *
   * @return the percentage of weight mass used for training
   */
  public int getWeightThreshold() {

    return m_WeightThreshold;
  }

  /**
<<<<<<< HEAD
   * @return a string to describe the option
   */
  public String numThreadsTipText() {

    return "The number of threads to use for batch prediction, which should be >= size of thread pool.";
  }

  /**
   * Gets the number of threads.
   */
  public int getNumThreads() {

    return m_numThreads;
  }

  /**
   * Sets the number of threads
   */
  public void setNumThreads(int nT) {

    m_numThreads = nT;
  }

  /**
   * @return a string to describe the option
   */
  public String poolSizeTipText() {

    return "The size of the thread pool, for example, the number of cores in the CPU.";
  }

  /**
   * Gets the number of threads.
   */
  public int getPoolSize() {

    return m_poolSize;
  }

  /**
   * Sets the number of threads
   */
  public void setPoolSize(int nT) {

    m_poolSize = nT;
  }

  /**
   * Returns default capabilities of the classifier.
   *
   * @return the capabilities of this classifier
=======
   * Returns default capabilities of the classifier.
   *
   * @return      the capabilities of this classifier
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();

    // class
    result.disableAllClasses();
    result.disableAllClassDependencies();
    result.enable(Capability.NOMINAL_CLASS);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
<<<<<<< HEAD
   * Method used to build the classifier.
   */
  public void buildClassifier(Instances data) throws Exception {

    // Initialize classifier
    initializeClassifier(data);

    // For the given number of iterations
    while (next()) {
    }

    // Clean up
    done();
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Builds the boosted classifier
   * 
   * @param data the data to train the classifier with
   * @throws Exception if building fails, e.g., can't handle data
   */
<<<<<<< HEAD
  public void initializeClassifier(Instances data) throws Exception {
=======
  public void buildClassifier(Instances data) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_RandomInstance = new Random(m_Seed);
    int classIndex = data.classIndex();

    if (m_Classifier == null) {
      throw new Exception("A base classifier has not been specified!");
    }
<<<<<<< HEAD

    if (!(m_Classifier instanceof WeightedInstancesHandler) && !m_UseResampling) {
=======
    
    if (!(m_Classifier instanceof WeightedInstancesHandler) &&
	!m_UseResampling) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_UseResampling = true;
    }

    // can classifier handle the data?
    getCapabilities().testWithFail(data);

    if (m_Debug) {
      System.err.println("Creating copy of the training data");
    }

    // remove instances with missing class
<<<<<<< HEAD
    m_data = new Instances(data);
    m_data.deleteWithMissingClass();

    // only class? -> build ZeroR model
    if ((m_data.numAttributes() == 1) || (m_data.numInstances() == 0)) {
      System.err
        .println("Cannot build model (only class attribute present in data!), "
          + "using ZeroR model instead!");
      m_ZeroR = new ZeroR();
      m_ZeroR.buildClassifier(m_data);
      return;
    }

    // Set up initial probabilities and Fs
    int numInstances = m_data.numInstances();
    m_NumClasses = m_data.numClasses();
    m_ClassAttribute = m_data.classAttribute();
    m_probs = new double[numInstances][m_NumClasses];
    m_InitialFs = new double[m_NumClasses];
    m_trainFs = new double[numInstances][m_NumClasses];

    if (!m_UseEstimatedPriors) {

      // Default behaviour: equal probabilities for all classes initially
      for (int i = 0; i < numInstances; i++) {
        for (int j = 0; j < m_NumClasses; j++) {
          m_probs[i][j] = 1.0 / m_NumClasses;
        }
      }
    } else {

      // If requested, used priors estimated from the training set initially
      m_ZeroR = new ZeroR();
      m_ZeroR.buildClassifier(m_data);
      for (int i = 0; i < numInstances; i++) {
        m_probs[i] = m_ZeroR.distributionForInstance(m_data.instance(i));
      }
      double avg = 0;
      for (int j = 0; j < m_NumClasses; j++) {
        avg += Math.log(m_probs[0][j]);
      }
      avg /= m_NumClasses;
      for (int j = 0; j < m_NumClasses; j++) {
        m_InitialFs[j] = Math.log(m_probs[0][j]) - avg;
      }
      for (int i = 0; i < numInstances; i++) {
        for (int j = 0; j < m_NumClasses; j++) {
          m_trainFs[i][j] = m_InitialFs[j];
        }
      }
      m_ZeroR = null;
    }
=======
    data = new Instances(data);
    data.deleteWithMissingClass();
    
    // only class? -> build ZeroR model
    if (data.numAttributes() == 1) {
      System.err.println(
	  "Cannot build model (only class attribute present in data!), "
	  + "using ZeroR model instead!");
      m_ZeroR = new weka.classifiers.rules.ZeroR();
      m_ZeroR.buildClassifier(data);
      return;
    }
    else {
      m_ZeroR = null;
    }
    
    m_NumClasses = data.numClasses();
    m_ClassAttribute = data.classAttribute();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // Create the base classifiers
    if (m_Debug) {
      System.err.println("Creating base classifiers");
    }
<<<<<<< HEAD
    m_Classifiers = new ArrayList<Classifier[]>();

    // Build classifier on all the data
    m_trainYs = new double[numInstances][m_NumClasses];
    for (int j = 0; j < m_NumClasses; j++) {
      for (int i = 0, k = 0; i < numInstances; i++, k++) {
        m_trainYs[i][j] =
          (m_data.instance(k).classValue() == j) ? 1.0 - m_Offset
            : 0.0 + (m_Offset / (double) m_NumClasses);
      }
    }

    // Make class numeric
    m_data.setClassIndex(-1);
    m_data.deleteAttributeAt(classIndex);
    m_data.insertAttributeAt(new Attribute("'pseudo class'"), classIndex);
    m_data.setClassIndex(classIndex);
    m_NumericClassData = new Instances(m_data, 0);

    // Perform iterations
    m_sumOfWeights = m_data.sumOfWeights();
    m_logLikelihood = negativeLogLikelihood(m_trainYs, m_probs, m_data, m_sumOfWeights);
    if (m_Debug) {
      System.err.println("Avg. negative log-likelihood: " + m_logLikelihood);
    }
    m_NumGenerated = 0;
   }

  /**
   * Perform another iteration of boosting.
   */
  public boolean next() throws Exception {

    if (m_NumGenerated >= m_NumIterations) {
      return false;
    }

    // Do we only have a ZeroR model
    if (m_ZeroR != null) {
      return false;
    }

    double previousLoglikelihood = m_logLikelihood;
    performIteration(m_trainYs, m_trainFs, m_probs, m_data, m_sumOfWeights);
    m_logLikelihood = negativeLogLikelihood(m_trainYs, m_probs, m_data, m_sumOfWeights);
    if (m_Debug) {
      System.err.println("Avg. negative log-likelihood: " + m_logLikelihood);
    }
    if (Math.abs(previousLoglikelihood - m_logLikelihood) < m_Precision) {
      return false;
    }
    return true;
  }

  /**
   * Clean up after boosting.
   */
  public void done() {

    m_trainYs = m_trainFs = m_probs = null;
    m_data = null;
  }

  /**
   * Computes negative loglikelihood given class values and estimated probabilities.
   * 
   * @param trainYs class values
   * @param probs estimated probabilities
   * @param data the data
   * @param sumOfWeights the sum of weights
   * @return the computed negative loglikelihood
   */
  private double negativeLogLikelihood(double[][] trainYs, double[][] probs, Instances data, double sumOfWeights) {
=======
    m_Classifiers = new Classifier [m_NumClasses][];
    for (int j = 0; j < m_NumClasses; j++) {
      m_Classifiers[j] = Classifier.makeCopies(m_Classifier,
					       getNumIterations());
    }

    // Do we want to select the appropriate number of iterations
    // using cross-validation?
    int bestNumIterations = getNumIterations();
    if (m_NumFolds > 1) {
      if (m_Debug) {
	System.err.println("Processing first fold.");
      }

      // Array for storing the results
      double[] results = new double[getNumIterations()];

      // Iterate throught the cv-runs
      for (int r = 0; r < m_NumRuns; r++) {

	// Stratify the data
	data.randomize(m_RandomInstance);
	data.stratify(m_NumFolds);
	
	// Perform the cross-validation
	for (int i = 0; i < m_NumFolds; i++) {
	  
	  // Get train and test folds
	  Instances train = data.trainCV(m_NumFolds, i, m_RandomInstance);
	  Instances test = data.testCV(m_NumFolds, i);
	  
	  // Make class numeric
	  Instances trainN = new Instances(train);
	  trainN.setClassIndex(-1);
	  trainN.deleteAttributeAt(classIndex);
	  trainN.insertAttributeAt(new Attribute("'pseudo class'"), classIndex);
	  trainN.setClassIndex(classIndex);
	  m_NumericClassData = new Instances(trainN, 0);
	  
	  // Get class values
	  int numInstances = train.numInstances();
	  double [][] trainFs = new double [numInstances][m_NumClasses];
	  double [][] trainYs = new double [numInstances][m_NumClasses];
	  for (int j = 0; j < m_NumClasses; j++) {
	    for (int k = 0; k < numInstances; k++) {
	      trainYs[k][j] = (train.instance(k).classValue() == j) ? 
		1.0 - m_Offset: 0.0 + (m_Offset / (double)m_NumClasses);
	    }
	  }
	  
	  // Perform iterations
	  double[][] probs = initialProbs(numInstances);
	  m_NumGenerated = 0;
	  double sumOfWeights = train.sumOfWeights();
	  for (int j = 0; j < getNumIterations(); j++) {
	    performIteration(trainYs, trainFs, probs, trainN, sumOfWeights);
	    Evaluation eval = new Evaluation(train);
	    eval.evaluateModel(this, test);
	    results[j] += eval.correct();
	  }
	}
      }
      
      // Find the number of iterations with the lowest error
      double bestResult = -Double.MAX_VALUE;
      for (int j = 0; j < getNumIterations(); j++) {
	if (results[j] > bestResult) {
	  bestResult = results[j];
	  bestNumIterations = j;
	}
      }
      if (m_Debug) {
	System.err.println("Best result for " + 
			   bestNumIterations + " iterations: " +
			   bestResult);
      }
    }

    // Build classifier on all the data
    int numInstances = data.numInstances();
    double [][] trainFs = new double [numInstances][m_NumClasses];
    double [][] trainYs = new double [numInstances][m_NumClasses];
    for (int j = 0; j < m_NumClasses; j++) {
      for (int i = 0, k = 0; i < numInstances; i++, k++) {
	trainYs[i][j] = (data.instance(k).classValue() == j) ? 
	  1.0 - m_Offset: 0.0 + (m_Offset / (double)m_NumClasses);
      }
    }
    
    // Make class numeric
    data.setClassIndex(-1);
    data.deleteAttributeAt(classIndex);
    data.insertAttributeAt(new Attribute("'pseudo class'"), classIndex);
    data.setClassIndex(classIndex);
    m_NumericClassData = new Instances(data, 0);
	
    // Perform iterations
    double[][] probs = initialProbs(numInstances);
    double logLikelihood = logLikelihood(trainYs, probs);
    m_NumGenerated = 0;
    if (m_Debug) {
      System.err.println("Avg. log-likelihood: " + logLikelihood);
    }
    double sumOfWeights = data.sumOfWeights();
    for (int j = 0; j < bestNumIterations; j++) {
      double previousLoglikelihood = logLikelihood;
      performIteration(trainYs, trainFs, probs, data, sumOfWeights);
      logLikelihood = logLikelihood(trainYs, probs);
      if (m_Debug) {
	System.err.println("Avg. log-likelihood: " + logLikelihood);
      }
      if (Math.abs(previousLoglikelihood - logLikelihood) < m_Precision) {
	return;
      }
    }
  }

  /**
   * Gets the intial class probabilities.
   * 
   * @param numInstances the number of instances
   * @return the initial class probabilities
   */
  private double[][] initialProbs(int numInstances) {

    double[][] probs = new double[numInstances][m_NumClasses];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0 ; j < m_NumClasses; j++) {
	probs[i][j] = 1.0 / m_NumClasses;
      }
    }
    return probs;
  }

  /**
   * Computes loglikelihood given class values
   * and estimated probablities.
   * 
   * @param trainYs class values
   * @param probs estimated probabilities
   * @return the computed loglikelihood
   */
  private double logLikelihood(double[][] trainYs, double[][] probs) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    double logLikelihood = 0;
    for (int i = 0; i < trainYs.length; i++) {
      for (int j = 0; j < m_NumClasses; j++) {
<<<<<<< HEAD
        if (trainYs[i][j] == 1.0 - m_Offset) {
          logLikelihood -= data.instance(i).weight() * Math.log(probs[i][j]);
        }
      }
    }
    return logLikelihood / sumOfWeights;
=======
	if (trainYs[i][j] == 1.0 - m_Offset) {
	  logLikelihood -= Math.log(probs[i][j]);
	}
      }
    }
    return logLikelihood / (double)trainYs.length;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Performs one boosting iteration.
   * 
   * @param trainYs class values
   * @param trainFs F scores
   * @param probs probabilities
   * @param data the data to run the iteration on
   * @param origSumOfWeights the original sum of weights
   * @throws Exception in case base classifiers run into problems
   */
<<<<<<< HEAD
  private void performIteration(double[][] trainYs, double[][] trainFs,
    double[][] probs, Instances data, double origSumOfWeights) throws Exception {
=======
  private void performIteration(double[][] trainYs,
				double[][] trainFs,
				double[][] probs,
				Instances data,
				double origSumOfWeights) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (m_Debug) {
      System.err.println("Training classifier " + (m_NumGenerated + 1));
    }

<<<<<<< HEAD
    // Make space for classifiers
    Classifier[] classifiers = new Classifier[m_NumClasses];

    // Build the new models
    for (int j = 0; j < m_NumClasses; j++) {
      if (m_Debug) {
        System.err.println("\t...for class " + (j + 1) + " ("
          + m_ClassAttribute.name() + "=" + m_ClassAttribute.value(j) + ")");
      }

      // Make copy because we want to save the weights
      Instances boostData = new Instances(data);

      // Set instance pseudoclass and weights
      for (int i = 0; i < probs.length; i++) {

        // Compute response and weight
        double p = probs[i][j];
        double z, actual = trainYs[i][j];
        if (actual == 1 - m_Offset) {
          z = 1.0 / p;
          if (z > m_zMax) { // threshold
            z = m_zMax;
          }
        } else {
          z = -1.0 / (1.0 - p);
          if (z < -m_zMax) { // threshold
            z = -m_zMax;
          }
        }
        double w = (actual - p) / z;

        // Set values for instance
        Instance current = boostData.instance(i);
        current.setValue(boostData.classIndex(), z);
        current.setWeight(current.weight() * w);
      }

      // Scale the weights (helps with some base learners)
      double sumOfWeights = boostData.sumOfWeights();
      double scalingFactor = (double) origSumOfWeights / sumOfWeights;
      for (int i = 0; i < probs.length; i++) {
        Instance current = boostData.instance(i);
        current.setWeight(current.weight() * scalingFactor);
=======
    // Build the new models
    for (int j = 0; j < m_NumClasses; j++) {
      if (m_Debug) {
	System.err.println("\t...for class " + (j + 1)
			   + " (" + m_ClassAttribute.name() 
			   + "=" + m_ClassAttribute.value(j) + ")");
      }
    
      // Make copy because we want to save the weights
      Instances boostData = new Instances(data);
      
      // Set instance pseudoclass and weights
      for (int i = 0; i < probs.length; i++) {

	// Compute response and weight
	double p = probs[i][j];
	double z, actual = trainYs[i][j];
	if (actual == 1 - m_Offset) {
	  z = 1.0 / p;
	  if (z > Z_MAX) { // threshold
	    z = Z_MAX;
	  }
	} else {
	  z = -1.0 / (1.0 - p);
	  if (z < -Z_MAX) { // threshold
	    z = -Z_MAX;
	  }
	}
	double w = (actual - p) / z;

	// Set values for instance
	Instance current = boostData.instance(i);
	current.setValue(boostData.classIndex(), z);
	current.setWeight(current.weight() * w);
      }
      
      // Scale the weights (helps with some base learners)
      double sumOfWeights = boostData.sumOfWeights();
      double scalingFactor = (double)origSumOfWeights / sumOfWeights;
      for (int i = 0; i < probs.length; i++) {
	Instance current = boostData.instance(i);
	current.setWeight(current.weight() * scalingFactor);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      // Select instances to train the classifier on
      Instances trainData = boostData;
      if (m_WeightThreshold < 100) {
<<<<<<< HEAD
        trainData =
          selectWeightQuantile(boostData, (double) m_WeightThreshold / 100);
      } else {
        if (m_UseResampling) {
          double[] weights = new double[boostData.numInstances()];
          for (int kk = 0; kk < weights.length; kk++) {
            weights[kk] = boostData.instance(kk).weight();
          }
          trainData = boostData.resampleWithWeights(m_RandomInstance, weights);
        }
      }

      // Build the classifier
      classifiers[j] = AbstractClassifier.makeCopy(m_Classifier);
      classifiers[j].buildClassifier(trainData);
      if (m_NumClasses == 2) {
        break; // Don't actually need to build the other model in the two-class
               // case
      }
    }
    m_Classifiers.add(classifiers);

    // Evaluate / increment trainFs from the classifier
    for (int i = 0; i < trainFs.length; i++) {
      double[] pred = new double[m_NumClasses];
      double predSum = 0;
      for (int j = 0; j < m_NumClasses; j++) {
        double tempPred = m_Shrinkage * classifiers[j].classifyInstance(data.instance(i));
        if (Utils.isMissingValue(tempPred)) {
          throw new UnassignedClassException("LogitBoost: base learner predicted missing value.");
        }
        pred[j] = tempPred;
        if (m_NumClasses == 2) {
          pred[1] = -tempPred; // Can treat 2 classes as special case
          break;
        }
        predSum += pred[j];
      }
      predSum /= m_NumClasses;
      for (int j = 0; j < m_NumClasses; j++) {
        trainFs[i][j] += (pred[j] - predSum) * (m_NumClasses - 1) / m_NumClasses;
      }
    }
    m_NumGenerated = m_Classifiers.size();

=======
	trainData = selectWeightQuantile(boostData, 
					 (double)m_WeightThreshold / 100);
      } else {
	if (m_UseResampling) {
	  double[] weights = new double[boostData.numInstances()];
	  for (int kk = 0; kk < weights.length; kk++) {
	    weights[kk] = boostData.instance(kk).weight();
	  }
	  trainData = boostData.resampleWithWeights(m_RandomInstance, 
						    weights);
	}
      }
      
      // Build the classifier
      m_Classifiers[j][m_NumGenerated].buildClassifier(trainData);
    }      
    
    // Evaluate / increment trainFs from the classifier
    for (int i = 0; i < trainFs.length; i++) {
      double [] pred = new double [m_NumClasses];
      double predSum = 0;
      for (int j = 0; j < m_NumClasses; j++) {
	pred[j] = m_Shrinkage * m_Classifiers[j][m_NumGenerated]
	  .classifyInstance(data.instance(i));
	predSum += pred[j];
      }
      predSum /= m_NumClasses;
      for (int j = 0; j < m_NumClasses; j++) {
	trainFs[i][j] += (pred[j] - predSum) * (m_NumClasses - 1) 
	  / m_NumClasses;
      }
    }
    m_NumGenerated++;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // Compute the current probability estimates
    for (int i = 0; i < trainYs.length; i++) {
      probs[i] = probs(trainFs[i]);
    }
  }

  /**
   * Returns the array of classifiers that have been built.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the built classifiers
   */
  public Classifier[][] classifiers() {

<<<<<<< HEAD
    return m_Classifiers.toArray(new Classifier[0][0]);
=======
    Classifier[][] classifiers = 
      new Classifier[m_NumClasses][m_NumGenerated];
    for (int j = 0; j < m_NumClasses; j++) {
      for (int i = 0; i < m_NumGenerated; i++) {
	classifiers[j][i] = m_Classifiers[j][i];
      }
    }
    return classifiers;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Computes probabilities from F scores
   * 
   * @param Fs the F scores
   * @return the computed probabilities
   */
  private double[] probs(double[] Fs) {

    double maxF = -Double.MAX_VALUE;
    for (int i = 0; i < Fs.length; i++) {
      if (Fs[i] > maxF) {
<<<<<<< HEAD
        maxF = Fs[i];
=======
	maxF = Fs[i];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    double sum = 0;
    double[] probs = new double[Fs.length];
    for (int i = 0; i < Fs.length; i++) {
      probs[i] = Math.exp(Fs[i] - maxF);
      sum += probs[i];
    }
    Utils.normalize(probs, sum);
    return probs;
  }
<<<<<<< HEAD

  /**
   * Performs efficient batch prediction
   *
   * @return true, as LogitBoost can perform efficient batch prediction
   */
  @Override
  public boolean implementsMoreEfficientBatchPrediction() {
    return true;
  }

  /**
   * Calculates the class membership probabilities for the given test instance.
   *
   * @param inst the instance to be classified
   * @return predicted class probability distribution
   * @throws Exception if instance could not be classified successfully
   */
  public double[] distributionForInstance(Instance inst) throws Exception {

    // default model?
    if (m_ZeroR != null) {
      return m_ZeroR.distributionForInstance(inst);
    }
    Instance instance = (Instance) inst.copy();
    instance.setDataset(m_NumericClassData);

    return processInstance(instance);
  }

  /**
   * Applies models to an instance to get class probabilities.
   */
  protected double[] processInstance(Instance instance) throws Exception {

    double[] Fs = new double[m_NumClasses];
    double[] pred = new double[m_NumClasses];

    if (m_InitialFs != null) {
      for (int i = 0; i < m_NumClasses; i++) {
        Fs[i] = m_InitialFs[i];
      }
    }
    for (int i = 0; i < m_NumGenerated; i++) {
      double predSum = 0;
      for (int j = 0; j < m_NumClasses; j++) {
        double tempPred = m_Shrinkage * m_Classifiers.get(i)[j].classifyInstance(instance);
        if (Utils.isMissingValue(tempPred)) {
          throw new UnassignedClassException("LogitBoost: base learner predicted missing value.");
        }
        pred[j] = tempPred;
        if (m_NumClasses == 2) {
          pred[1] = -tempPred; // Can treat 2 classes as special case
          break;
        }
        predSum += pred[j];
      }
      predSum /= m_NumClasses;
      for (int j = 0; j < m_NumClasses; j++) {
        Fs[j] += (pred[j] - predSum) * (m_NumClasses - 1) / m_NumClasses;
      }
    }
    return probs(Fs);
  }

  /**
   * Calculates the class membership probabilities for the given test instances.
   * Uses multi-threading if requested.
   *
   * @param insts the instances to be classified
   * @return predicted class probability distributions
   * @throws Exception if instances could not be classified successfully
   */
  public double[][] distributionsForInstances(Instances insts) throws Exception {

    // default model?
    if (m_ZeroR != null) {
      double[][] preds = new double[insts.numInstances()][];
      for (int i = 0; i < preds.length; i++) {
        preds[i] = m_ZeroR.distributionForInstance(insts.instance(i));
      }
      return preds;
    }

    final Instances numericClassInsts = new Instances(m_NumericClassData);
    for (int i = 0; i < insts.numInstances(); i++) {
      numericClassInsts.add(insts.instance(i));
    }

    // Start thread pool
    ExecutorService pool = Executors.newFixedThreadPool(m_poolSize);

    // Set up result set, and chunk size
    final int chunksize = numericClassInsts.numInstances() / m_numThreads;
    Set<Future<Void>> results = new HashSet<Future<Void>>();
    double[][] preds = new double[insts.numInstances()][];

    // For each thread
    for (int j = 0; j < m_numThreads; j++) {

      // Determine batch to be processed
      final int lo = j * chunksize;
      final int hi = (j < m_numThreads - 1) ? (lo + chunksize) : numericClassInsts.numInstances();

      // Create and submit new job for each batch of instances
      Future<Void> futureT = pool.submit(new Callable<Void>() {
        @Override
        public Void call() throws Exception {
          for (int i = lo; i < hi; i++) {
            preds[i] = processInstance(numericClassInsts.instance(i));
          }
          return null;
        }
      });
      results.add(futureT);
    }

    // Incorporate predictions
    try {
      for (Future<Void> futureT : results) {
        futureT.get();
      }
    } catch (Exception e) {
      System.out.println("Predictions could not be generated.");
      e.printStackTrace();
    }

    pool.shutdown();

    return preds;
=======
    
  /**
   * Calculates the class membership probabilities for the given test instance.
   *
   * @param instance the instance to be classified
   * @return predicted class probability distribution
   * @throws Exception if instance could not be classified
   * successfully
   */
  public double [] distributionForInstance(Instance instance) 
    throws Exception {

    // default model?
    if (m_ZeroR != null) {
      return m_ZeroR.distributionForInstance(instance);
    }
    
    instance = (Instance)instance.copy();
    instance.setDataset(m_NumericClassData);
    double [] pred = new double [m_NumClasses];
    double [] Fs = new double [m_NumClasses]; 
    for (int i = 0; i < m_NumGenerated; i++) {
      double predSum = 0;
      for (int j = 0; j < m_NumClasses; j++) {
	pred[j] = m_Shrinkage * m_Classifiers[j][i].classifyInstance(instance);
	predSum += pred[j];
      }
      predSum /= m_NumClasses;
      for (int j = 0; j < m_NumClasses; j++) {
	Fs[j] += (pred[j] - predSum) * (m_NumClasses - 1) 
	  / m_NumClasses;
      }
    }

    return probs(Fs);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the boosted model as Java source code.
   *
   * @param className the classname in the generated code
   * @return the tree as Java source code
   * @throws Exception if something goes wrong
   */
  public String toSource(String className) throws Exception {

    if (m_NumGenerated == 0) {
      throw new Exception("No model built yet");
    }
<<<<<<< HEAD
    if (!(m_Classifiers.get(0)[0] instanceof Sourcable)) {
      throw new Exception("Base learner " + m_Classifier.getClass().getName()
        + " is not Sourcable");
=======
    if (!(m_Classifiers[0][0] instanceof Sourcable)) {
      throw new Exception("Base learner " + m_Classifier.getClass().getName()
			  + " is not Sourcable");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    StringBuffer text = new StringBuffer("class ");
    text.append(className).append(" {\n\n");
<<<<<<< HEAD
    text.append("  private static double RtoP(double []R, int j) {\n"
      + "    double Rcenter = 0;\n"
      + "    for (int i = 0; i < R.length; i++) {\n"
      + "      Rcenter += R[i];\n" + "    }\n" + "    Rcenter /= R.length;\n"
      + "    double Rsum = 0;\n" + "    for (int i = 0; i < R.length; i++) {\n"
      + "      Rsum += Math.exp(R[i] - Rcenter);\n" + "    }\n"
      + "    return Math.exp(R[j]) / Rsum;\n" + "  }\n\n");

    text.append("  public static double classify(Object[] i) {\n"
      + "    double [] d = distribution(i);\n" + "    double maxV = d[0];\n"
      + "    int maxI = 0;\n" + "    for (int j = 1; j < " + m_NumClasses
      + "; j++) {\n" + "      if (d[j] > maxV) { maxV = d[j]; maxI = j; }\n"
      + "    }\n    return (double) maxI;\n  }\n\n");
=======
    text.append("  private static double RtoP(double []R, int j) {\n"+
		"    double Rcenter = 0;\n"+
		"    for (int i = 0; i < R.length; i++) {\n"+
		"      Rcenter += R[i];\n"+
		"    }\n"+
		"    Rcenter /= R.length;\n"+
		"    double Rsum = 0;\n"+
		"    for (int i = 0; i < R.length; i++) {\n"+
		"      Rsum += Math.exp(R[i] - Rcenter);\n"+
		"    }\n"+
		"    return Math.exp(R[j]) / Rsum;\n"+
		"  }\n\n");

    text.append("  public static double classify(Object[] i) {\n" +
                "    double [] d = distribution(i);\n" +
                "    double maxV = d[0];\n" +
		"    int maxI = 0;\n"+
		"    for (int j = 1; j < " + m_NumClasses + "; j++) {\n"+
		"      if (d[j] > maxV) { maxV = d[j]; maxI = j; }\n"+
		"    }\n    return (double) maxI;\n  }\n\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    text.append("  public static double [] distribution(Object [] i) {\n");
    text.append("    double [] Fs = new double [" + m_NumClasses + "];\n");
    text.append("    double [] Fi = new double [" + m_NumClasses + "];\n");
<<<<<<< HEAD
    if (m_InitialFs != null) {
      for (int j = 0; j < m_NumClasses; j++) {
        text.append("    Fs[" + j + "] = " + m_InitialFs[j] + ";\n");
      }
    }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    text.append("    double Fsum;\n");
    for (int i = 0; i < m_NumGenerated; i++) {
      text.append("    Fsum = 0;\n");
      for (int j = 0; j < m_NumClasses; j++) {
<<<<<<< HEAD
        text.append("    Fi[" + j + "] = " + m_Shrinkage + " * " + className + '_' + j + '_' + i
          + ".classify(i); Fsum += Fi[" + j + "];\n");
        if (m_NumClasses == 2) {
          text.append("    Fi[1] = -Fi[0];\n"); // 2-class case is special
          break;
        }
      }
      text.append("    Fsum /= " + m_NumClasses + ";\n");
      text.append("    for (int j = 0; j < " + m_NumClasses + "; j++) {");
      text.append(" Fs[j] += (Fi[j] - Fsum) * " + (m_NumClasses - 1) + " / "
        + m_NumClasses + "; }\n");
    }

    text.append("    double [] dist = new double [" + m_NumClasses + "];\n"
      + "    for (int j = 0; j < " + m_NumClasses + "; j++) {\n"
      + "      dist[j] = RtoP(Fs, j);\n" + "    }\n    return dist;\n");
    text.append("  }\n}\n");

    for (int i = 0; i < m_Classifiers.get(0).length; i++) {
      for (int j = 0; j < m_Classifiers.size(); j++) {
        text.append(((Sourcable) m_Classifiers.get(j)[i]).toSource(
          className + '_' + i + '_' + j));
      }
      if (m_NumClasses == 2) {
        break; // Only need one classifier per iteration in this case
=======
	text.append("    Fi[" + j + "] = " + className + '_' +j + '_' + i 
		    + ".classify(i); Fsum += Fi[" + j + "];\n");
      }
      text.append("    Fsum /= " + m_NumClasses + ";\n");
      text.append("    for (int j = 0; j < " + m_NumClasses + "; j++) {");
      text.append(" Fs[j] += (Fi[j] - Fsum) * "
		  + (m_NumClasses - 1) + " / " + m_NumClasses + "; }\n");
    }
    
    text.append("    double [] dist = new double [" + m_NumClasses + "];\n" +
		"    for (int j = 0; j < " + m_NumClasses + "; j++) {\n"+
		"      dist[j] = RtoP(Fs, j);\n"+
		"    }\n    return dist;\n");
    text.append("  }\n}\n");

    for (int i = 0; i < m_Classifiers.length; i++) {
      for (int j = 0; j < m_Classifiers[i].length; j++) {
	text.append(((Sourcable)m_Classifiers[i][j])
		    .toSource(className + '_' + i + '_' + j));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return text.toString();
  }

  /**
   * Returns description of the boosted classifier.
   *
   * @return description of the boosted classifier as a string
   */
  public String toString() {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // only ZeroR model?
    if (m_ZeroR != null) {
      StringBuffer buf = new StringBuffer();
      buf.append(this.getClass().getName().replaceAll(".*\\.", "") + "\n");
<<<<<<< HEAD
      buf.append(this.getClass().getName().replaceAll(".*\\.", "")
        .replaceAll(".", "=")
        + "\n\n");
      buf
        .append(
          "Warning: No model could be built, hence ZeroR model is used:\n\n");
      buf.append(m_ZeroR.toString());
      return buf.toString();
    }

    StringBuffer text = new StringBuffer();
    if ((m_InitialFs != null) && getUseEstimatedPriors()) {
      text.append("Initial Fs: \n");
      for (int j = 0; j < m_NumClasses; j++) {
        text.append("\n\tClass " + (j + 1) + " (" + m_ClassAttribute.name()
                + "=" + m_ClassAttribute.value(j) + "): " + Utils.doubleToString(m_InitialFs[j], getNumDecimalPlaces())
                + "\n");
      }
      text.append("\n");
    }
    if (m_NumGenerated == 0) {
      text.append("LogitBoost: No model built yet.");
      // text.append(m_Classifiers[0].toString()+"\n");
    } else {
      text.append("LogitBoost: Base classifiers and their weights: \n");
      for (int i = 0; i < m_NumGenerated; i++) {
        text.append("\nIteration " + (i + 1));
        for (int j = 0; j < m_NumClasses; j++) {
          text.append("\n\tClass " + (j + 1) + " (" + m_ClassAttribute.name()
            + "=" + m_ClassAttribute.value(j) + ")\n\n"
            + m_Classifiers.get(i)[j].toString() + "\n");
          if (m_NumClasses == 2) {
            text.append("Two-class case: second classifier predicts "
              + "additive inverse of first classifier and "
              + "is not explicitly computed.\n\n");
            break;
          }
        }
      }
      text.append("Number of performed iterations: " + m_NumGenerated + "\n");
    }

    return text.toString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14463 $");
=======
      buf.append(this.getClass().getName().replaceAll(".*\\.", "").replaceAll(".", "=") + "\n\n");
      buf.append("Warning: No model could be built, hence ZeroR model is used:\n\n");
      buf.append(m_ZeroR.toString());
      return buf.toString();
    }
    
    StringBuffer text = new StringBuffer();
    
    if (m_NumGenerated == 0) {
      text.append("LogitBoost: No model built yet.");
      //      text.append(m_Classifiers[0].toString()+"\n");
    } else {
      text.append("LogitBoost: Base classifiers and their weights: \n");
      for (int i = 0; i < m_NumGenerated; i++) {
	text.append("\nIteration "+(i+1));
	for (int j = 0; j < m_NumClasses; j++) {
	  text.append("\n\tClass " + (j + 1) 
		      + " (" + m_ClassAttribute.name() 
		      + "=" + m_ClassAttribute.value(j) + ")\n\n"
		      + m_Classifiers[j][i].toString() + "\n");
	}
      }
      text.append("Number of performed iterations: " +
		    m_NumGenerated + "\n");
    }
    
    return text.toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9371 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
   *
   * @param argv the options
   */
<<<<<<< HEAD
  public static void main(String[] argv) {
=======
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runClassifier(new LogitBoost(), argv);
  }
}
