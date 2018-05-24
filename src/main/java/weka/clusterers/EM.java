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
 *    EM.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.clusterers;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Instance;
=======
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Attribute;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
import weka.estimators.DiscreteEstimator;
import weka.estimators.Estimator;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start -->
=======
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * Simple EM (expectation maximisation) class.<br/>
 * <br/>
 * EM assigns a probability distribution to each instance which indicates the probability of it belonging to each of the clusters. EM can decide how many clusters to create by cross validation, or you may specify apriori how many clusters to generate.<br/>
 * <br/>
 * The cross validation performed to determine the number of clusters is done in the following steps:<br/>
 * 1. the number of clusters is set to 1<br/>
 * 2. the training set is split randomly into 10 folds.<br/>
 * 3. EM is performed 10 times using the 10 folds the usual CV way.<br/>
 * 4. the loglikelihood is averaged over all 10 results.<br/>
 * 5. if loglikelihood has increased the number of clusters is increased by 1 and the program continues at step 2. <br/>
 * <br/>
<<<<<<< HEAD
 * The number of folds is fixed to 10, as long as the number of instances in the training set is not smaller 10. If this is the case the number of folds is set equal to the number of instances.<br/>
 * <br/>
 * Missing values are globally replaced with ReplaceMissingValues.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start -->
=======
 * The number of folds is fixed to 10, as long as the number of instances in the training set is not smaller 10. If this is the case the number of folds is set equal to the number of instances.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * Valid options are: <p/>
 * 
 * <pre> -N &lt;num&gt;
 *  number of clusters. If omitted or -1 specified, then 
 *  cross validation is used to select the number of clusters.</pre>
 * 
<<<<<<< HEAD
 * <pre> -X &lt;num&gt;
 *  Number of folds to use when cross-validating to find the best number of clusters.</pre>
 * 
 * <pre> -K &lt;num&gt;
 *  Number of runs of k-means to perform.
 *  (default 10)</pre>
 * 
 * <pre> -max &lt;num&gt;
 *  Maximum number of clusters to consider during cross-validation. If omitted or -1 specified, then 
 *  there is no upper limit on the number of clusters.</pre>
 * 
 * <pre> -ll-cv &lt;num&gt;
 *  Minimum improvement in cross-validated log likelihood required
 *  to consider increasing the number of clusters.
 *  (default 1e-6)</pre>
 * 
 * <pre> -I &lt;num&gt;
 *  max iterations.
 *  (default 100)</pre>
 * 
 * <pre> -ll-iter &lt;num&gt;
 *  Minimum improvement in log likelihood required
 *  to perform another iteration of the E and M steps.
 *  (default 1e-6)</pre>
=======
 * <pre> -I &lt;num&gt;
 *  max iterations.
 * (default 100)</pre>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * 
 * <pre> -V
 *  verbose.</pre>
 * 
 * <pre> -M &lt;num&gt;
 *  minimum allowable standard deviation for normal density
 *  computation
 *  (default 1e-6)</pre>
 * 
 * <pre> -O
 *  Display model in old format (good when there are many clusters)
 * </pre>
 * 
<<<<<<< HEAD
 * <pre> -num-slots &lt;num&gt;
 *  Number of execution slots.
 *  (default 1 - i.e. no parallelism)</pre>
 * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre> -S &lt;num&gt;
 *  Random number seed.
 *  (default 100)</pre>
 * 
<<<<<<< HEAD
 * <pre> -output-debug-info
 *  If set, clusterer is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 * <pre> -do-not-check-capabilities
 *  If set, clusterer capabilities are not checked before clusterer is built
 *  (use with caution).</pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 11451 $
 */
public class EM extends RandomizableDensityBasedClusterer implements
NumberOfClustersRequestable, WeightedInstancesHandler {

  /** for serialization */
  static final long serialVersionUID = 8348181483812829475L;

  private Estimator m_modelPrev[][];
  private double[][][] m_modelNormalPrev;
  private double[] m_priorsPrev;

=======
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 9988 $
 */
public class EM
  extends RandomizableDensityBasedClusterer
  implements NumberOfClustersRequestable, WeightedInstancesHandler {

  /** for serialization */
  static final long serialVersionUID = 8348181483812829475L;
  
  private Estimator m_modelPrev[][];
  private double[][][] m_modelNormalPrev;
  private double[] m_priorsPrev;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** hold the discrete estimators for each cluster */
  private Estimator m_model[][];

  /** hold the normal estimators for each cluster */
  private double m_modelNormal[][][];

  /** default minimum standard deviation */
  private double m_minStdDev = 1e-6;

<<<<<<< HEAD
  private double[] m_minStdDevPerAtt;
=======
  private double [] m_minStdDevPerAtt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** hold the weights of each instance for each cluster */
  private double m_weights[][];

  /** the prior probabilities for clusters */
  private double m_priors[];

<<<<<<< HEAD
  /** full training instances */
=======
  /** the loglikelihood of the data */
  private double m_loglikely;

  /** training instances */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private Instances m_theInstances = null;

  /** number of clusters selected by the user or cross validation */
  private int m_num_clusters;

<<<<<<< HEAD
  /**
   * the initial number of clusters requested by the user--- -1 if xval is to be
   * used to find the number of clusters
   */
  private int m_initialNumClusters;

  /** Don't consider more clusters than this under CV (-1 means no upper bound) */
  private int m_upperBoundNumClustersCV = -1;

=======
  /** the initial number of clusters requested by the user--- -1 if
      xval is to be used to find the number of clusters */
  private int m_initialNumClusters;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** number of attributes */
  private int m_num_attribs;

  /** number of training instances */
  private int m_num_instances;

  /** maximum iterations to perform */
  private int m_max_iterations;

  /** attribute min values */
<<<<<<< HEAD
  private double[] m_minValues;

  /** attribute max values */
  private double[] m_maxValues;
=======
  private double [] m_minValues;

  /** attribute max values */
  private double [] m_maxValues;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** random number generator */
  private Random m_rr;

  /** Verbose? */
  private boolean m_verbose;

<<<<<<< HEAD
  /** globally replace missing values */
=======
 /** globally replace missing values */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private ReplaceMissingValues m_replaceMissing;

  /** display model output in old-style format */
  private boolean m_displayModelInOldFormat;

<<<<<<< HEAD
  /** Number of threads to use for E and M steps */
  protected int m_executionSlots = 1;

  /** For parallel execution mode */
  protected transient ExecutorService m_executorPool;

  /** False once training has completed */
  protected boolean m_training;

  /** The actual number of iterations performed */
  protected int m_iterationsPerformed;

  /** Minimum improvement in log likelihood when iterating */
  protected double m_minLogLikelihoodImprovementIterating = 1e-6;

  /** Minimum improvement to increase number of clusters when cross-validating */
  protected double m_minLogLikelihoodImprovementCV = 1e-6;

  /** The number of folds to use for cross-validation */
  protected int m_cvFolds = 10;

  /** The number of runs of k-means to perform */
  protected int m_NumKMeansRuns = 10;

  /**
   * Returns a string describing this clusterer
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Simple EM (expectation maximisation) class.\n\n"
=======
  /**
   * Returns a string describing this clusterer
   * @return a description of the evaluator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return
        "Simple EM (expectation maximisation) class.\n\n"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "EM assigns a probability distribution to each instance which "
      + "indicates the probability of it belonging to each of the clusters. "
      + "EM can decide how many clusters to create by cross validation, or you "
      + "may specify apriori how many clusters to generate.\n\n"
      + "The cross validation performed to determine the number of clusters "
      + "is done in the following steps:\n"
      + "1. the number of clusters is set to 1\n"
      + "2. the training set is split randomly into 10 folds.\n"
      + "3. EM is performed 10 times using the 10 folds the usual CV way.\n"
      + "4. the loglikelihood is averaged over all 10 results.\n"
      + "5. if loglikelihood has increased the number of clusters is increased "
      + "by 1 and the program continues at step 2. \n\n"
      + "The number of folds is fixed to 10, as long as the number of "
      + "instances in the training set is not smaller 10. If this is the case "
<<<<<<< HEAD
      + "the number of folds is set equal to the number of instances.\n\n"
      + "Missing values are globally replaced with ReplaceMissingValues.";
=======
      + "the number of folds is set equal to the number of instances.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tnumber of clusters. If omitted or -1 specified, then \n"
        + "\tcross validation is used to select the number of clusters.", "N",
        1, "-N <num>"));

    result
    .addElement(new Option(
      "\tNumber of folds to use when cross-validating to find the best number of clusters.",
      "X", 1, "-X <num>"));

    result.addElement(new Option("\tNumber of runs of k-means to perform." + "\n\t(default 10)",
      "K", 1, "-K <num>"));

    result
    .addElement(new Option(
      "\tMaximum number of clusters to consider during cross-validation. If omitted or -1 specified, then \n"
        + "\tthere is no upper limit on the number of clusters.", "max", 1,
      "-max <num>"));

    result.addElement(new Option(
      "\tMinimum improvement in cross-validated log likelihood required"
        + "\n\tto consider increasing the number of clusters."
        + "\n\t(default 1e-6)", "ll-cv", 1, "-ll-cv <num>"));

    result.addElement(new Option("\tmax iterations." + "\n\t(default 100)",
      "I", 1, "-I <num>"));

    result.addElement(new Option(
      "\tMinimum improvement in log likelihood required"
        + "\n\tto perform another iteration of the E and M steps."
        + "\n\t(default 1e-6)", "ll-iter", 1, "-ll-iter <num>"));

    result.addElement(new Option("\tverbose.", "V", 0, "-V"));

    result.addElement(new Option(
      "\tminimum allowable standard deviation for normal density\n"
        + "\tcomputation\n" + "\t(default 1e-6)", "M", 1, "-M <num>"));

    result.addElement(new Option(
      "\tDisplay model in old format (good when there are "
        + "many clusters)\n", "O", 0, "-O"));

    result.addElement(new Option("\tNumber of execution slots.\n"
      + "\t(default 1 - i.e. no parallelism)", "num-slots", 1,
      "-num-slots <num>"));

    result.addAll(Collections.list(super.listOptions()));

    return result.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start -->
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions () {
    Vector result = new Vector();
    
    result.addElement(new Option(
	"\tnumber of clusters. If omitted or -1 specified, then \n"
	+ "\tcross validation is used to select the number of clusters.", 
	"N", 1, "-N <num>"));

    result.addElement(new Option(
	"\tmax iterations."
	+ "\n(default 100)", 
	"I", 1, "-I <num>"));
    
    result.addElement(new Option(
	"\tverbose.",
	"V", 0, "-V"));
    
    result.addElement(new Option(
	"\tminimum allowable standard deviation for normal density\n"
	+ "\tcomputation\n"
	+ "\t(default 1e-6)",
	"M",1,"-M <num>"));

    result.addElement(
              new Option("\tDisplay model in old format (good when there are "
                         + "many clusters)\n",
                         "O", 0, "-O"));

    Enumeration en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement(en.nextElement());
    
    return  result.elements();
  }


  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Valid options are: <p/>
   * 
   * <pre> -N &lt;num&gt;
   *  number of clusters. If omitted or -1 specified, then 
   *  cross validation is used to select the number of clusters.</pre>
   * 
<<<<<<< HEAD
   * <pre> -X &lt;num&gt;
   *  Number of folds to use when cross-validating to find the best number of clusters.</pre>
   * 
   * <pre> -K &lt;num&gt;
   *  Number of runs of k-means to perform.
   *  (default 10)</pre>
   * 
   * <pre> -max &lt;num&gt;
   *  Maximum number of clusters to consider during cross-validation. If omitted or -1 specified, then 
   *  there is no upper limit on the number of clusters.</pre>
   * 
   * <pre> -ll-cv &lt;num&gt;
   *  Minimum improvement in cross-validated log likelihood required
   *  to consider increasing the number of clusters.
   *  (default 1e-6)</pre>
   * 
   * <pre> -I &lt;num&gt;
   *  max iterations.
   *  (default 100)</pre>
   * 
   * <pre> -ll-iter &lt;num&gt;
   *  Minimum improvement in log likelihood required
   *  to perform another iteration of the E and M steps.
   *  (default 1e-6)</pre>
=======
   * <pre> -I &lt;num&gt;
   *  max iterations.
   * (default 100)</pre>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * <pre> -V
   *  verbose.</pre>
   * 
   * <pre> -M &lt;num&gt;
   *  minimum allowable standard deviation for normal density
   *  computation
   *  (default 1e-6)</pre>
   * 
   * <pre> -O
   *  Display model in old format (good when there are many clusters)
   * </pre>
   * 
<<<<<<< HEAD
   * <pre> -num-slots &lt;num&gt;
   *  Number of execution slots.
   *  (default 1 - i.e. no parallelism)</pre>
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre> -S &lt;num&gt;
   *  Random number seed.
   *  (default 100)</pre>
   * 
<<<<<<< HEAD
   * <pre> -output-debug-info
   *  If set, clusterer is run in debug mode and
   *  may output additional info to the console</pre>
   * 
   * <pre> -do-not-check-capabilities
   *  If set, clusterer capabilities are not checked before clusterer is built
   *  (use with caution).</pre>
   * 
   * <!-- options-end -->
=======
   <!-- options-end -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
<<<<<<< HEAD
  @Override
  public void setOptions(String[] options) throws Exception {
=======
  public void setOptions (String[] options)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    resetOptions();
    setDebug(Utils.getFlag('V', options));
    String optionString = Utils.getOption('I', options);

    if (optionString.length() != 0) {
      setMaxIterations(Integer.parseInt(optionString));
    }

<<<<<<< HEAD
    optionString = Utils.getOption('X', options);
    if (optionString.length() > 0) {
      setNumFolds(Integer.parseInt(optionString));
    }

    optionString = Utils.getOption("ll-iter", options);
    if (optionString.length() > 0) {
      setMinLogLikelihoodImprovementIterating(Double.parseDouble(optionString));
    }

    optionString = Utils.getOption("ll-cv", options);
    if (optionString.length() > 0) {
      setMinLogLikelihoodImprovementCV(Double.parseDouble(optionString));
    }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    optionString = Utils.getOption('N', options);
    if (optionString.length() != 0) {
      setNumClusters(Integer.parseInt(optionString));
    }

<<<<<<< HEAD
    optionString = Utils.getOption("max", options);
    if (optionString.length() > 0) {
      setMaximumNumberOfClusters(Integer.parseInt(optionString));
    }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    optionString = Utils.getOption('M', options);
    if (optionString.length() != 0) {
      setMinStdDev((new Double(optionString)).doubleValue());
    }

<<<<<<< HEAD
    optionString = Utils.getOption('K', options);
    if (optionString.length() != 0) {
      setNumKMeansRuns((new Integer(optionString)).intValue());
    }

    setDisplayModelInOldFormat(Utils.getFlag('O', options));

    String slotsS = Utils.getOption("num-slots", options);
    if (slotsS.length() > 0) {
      setNumExecutionSlots(Integer.parseInt(slotsS));
    }

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
=======
    setDisplayModelInOldFormat(Utils.getFlag('O', options));
    
    super.setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numKMeansRunsTipText() {

    return "The number of runs of k-means to perform.";
  }
  /**
   * Returns the number of runs of k-means to perform.
   * 
   * @return the number of runs
   */
  public int getNumKMeansRuns() {

    return m_NumKMeansRuns;
  }

  /**
   * Set the number of runs of SimpleKMeans to perform.
   * 
   * @param intValue
   */
  public void setNumKMeansRuns(int intValue) {

    m_NumKMeansRuns = intValue;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numFoldsTipText() {
    return "The number of folds to use when cross-validating to find the "
      + "best number of clusters (default = 10)";
  }

  /**
   * Set the number of folds to use when cross-validating to find the best
   * number of clusters.
   * 
   * @param folds the number of folds to use
   */
  public void setNumFolds(int folds) {
    m_cvFolds = folds;
  }

  /**
   * Get the number of folds to use when cross-validating to find the best
   * number of clusters.
   * 
   * @return the number of folds to use
   */
  public int getNumFolds() {
    return m_cvFolds;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String minLogLikelihoodImprovementCVTipText() {
    return "The minimum improvement in cross-validated log likelihood required "
      + "in order to consider increasing the number of clusters "
      + "when cross-validiting to find the best number of clusters";
  }

  /**
   * Set the minimum improvement in cross-validated log likelihood required to
   * consider increasing the number of clusters when cross-validating to find
   * the best number of clusters
   * 
   * @param min the minimum improvement in log likelihood
   */
  public void setMinLogLikelihoodImprovementCV(double min) {
    m_minLogLikelihoodImprovementCV = min;
  }

  /**
   * Get the minimum improvement in cross-validated log likelihood required to
   * consider increasing the number of clusters when cross-validating to find
   * the best number of clusters
   * 
   * @return the minimum improvement in log likelihood
   */
  public double getMinLogLikelihoodImprovementCV() {
    return m_minLogLikelihoodImprovementCV;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String minLogLikelihoodImprovementIteratingTipText() {
    return "The minimum improvement in log likelihood required to "
      + "perform another iteration of the E and M steps";
  }

  /**
   * Set the minimum improvement in log likelihood necessary to perform another
   * iteration of the E and M steps.
   * 
   * @param min the minimum improvement in log likelihood
   */
  public void setMinLogLikelihoodImprovementIterating(double min) {
    m_minLogLikelihoodImprovementIterating = min;
  }

  /**
   * Get the minimum improvement in log likelihood necessary to perform another
   * iteration of the E and M steps.
   * 
   * @return the minimum improvement in log likelihood
   */
  public double getMinLogLikelihoodImprovementIterating() {
    return m_minLogLikelihoodImprovementIterating;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numExecutionSlotsTipText() {
    return "The number of execution slots (threads) to use. "
      + "Set equal to the number of available cpu/cores";
  }

  /**
   * Set the degree of parallelism to use.
   * 
   * @param slots the number of tasks to run in parallel when computing the
   *          nearest neighbors and evaluating different values of k between the
   *          lower and upper bounds
   */
  public void setNumExecutionSlots(int slots) {
    m_executionSlots = slots;
  }

  /**
   * Get the degree of parallelism to use.
   * 
   * @return the number of tasks to run in parallel when computing the nearest
   *         neighbors and evaluating different values of k between the lower
   *         and upper bounds
   */
  public int getNumExecutionSlots() {
    return m_executionSlots;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String displayModelInOldFormatTipText() {
    return "Use old format for model output. The old format is "
      + "better when there are many clusters. The new format "
      + "is better when there are fewer clusters and many attributes.";
  }

  /**
<<<<<<< HEAD
   * Set whether to display model output in the old, original format.
   * 
=======
   * Set whether to display model output in the old, original
   * format.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param d true if model ouput is to be shown in the old format
   */
  public void setDisplayModelInOldFormat(boolean d) {
    m_displayModelInOldFormat = d;
  }

  /**
<<<<<<< HEAD
   * Get whether to display model output in the old, original format.
   * 
=======
   * Get whether to display model output in the old, original
   * format.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if model ouput is to be shown in the old format
   */
  public boolean getDisplayModelInOldFormat() {
    return m_displayModelInOldFormat;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String minStdDevTipText() {
    return "set minimum allowable standard deviation";
  }

  /**
<<<<<<< HEAD
   * Set the minimum value for standard deviation when calculating normal
   * density. Reducing this value can help prevent arithmetic overflow resulting
   * from multiplying large densities (arising from small standard deviations)
   * when there are many singleton or near singleton values.
   * 
=======
   * Set the minimum value for standard deviation when calculating
   * normal density. Reducing this value can help prevent arithmetic
   * overflow resulting from multiplying large densities (arising from small
   * standard deviations) when there are many singleton or near singleton
   * values.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param m minimum value for standard deviation
   */
  public void setMinStdDev(double m) {
    m_minStdDev = m;
  }

<<<<<<< HEAD
  public void setMinStdDevPerAtt(double[] m) {
=======
  public void setMinStdDevPerAtt(double [] m) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_minStdDevPerAtt = m;
  }

  /**
   * Get the minimum allowable standard deviation.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the minumum allowable standard deviation
   */
  public double getMinStdDev() {
    return m_minStdDev;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numClustersTipText() {
    return "set number of clusters. -1 to select number of clusters "
      + "automatically by cross validation.";
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String numClustersTipText() {
    return "set number of clusters. -1 to select number of clusters "
      +"automatically by cross validation.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set the number of clusters (-1 to select by CV).
<<<<<<< HEAD
   * 
   * @param n the number of clusters
   * @throws Exception if n is 0
   */
  @Override
  public void setNumClusters(int n) throws Exception {

    if (n == 0) {
      throw new Exception("Number of clusters must be > 0. (or -1 to "
        + "select by cross validation).");
=======
   *
   * @param n the number of clusters
   * @throws Exception if n is 0
   */
  public void setNumClusters (int n)
    throws Exception {
    
    if (n == 0) {
      throw  new Exception("Number of clusters must be > 0. (or -1 to " 
			   + "select by cross validation).");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    if (n < 0) {
      m_num_clusters = -1;
      m_initialNumClusters = -1;
<<<<<<< HEAD
    } else {
=======
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_num_clusters = n;
      m_initialNumClusters = n;
    }
  }

<<<<<<< HEAD
  /**
   * Get the number of clusters
   * 
   * @return the number of clusters.
   */
  public int getNumClusters() {
    return m_initialNumClusters;
  }

  /**
   * Set the maximum number of clusters to consider when cross-validating
   * 
   * @param n the maximum number of clusters to consider
   */
  public void setMaximumNumberOfClusters(int n) {
    m_upperBoundNumClustersCV = n;
  }

  /**
   * Get the maximum number of clusters to consider when cross-validating
   * 
   * @return the maximum number of clusters to consider
   */
  public int getMaximumNumberOfClusters() {
    return m_upperBoundNumClustersCV;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String maximumNumberOfClustersTipText() {
    return "The maximum number of clusters to consider during cross-validation "
      + "to select the best number of clusters";
=======

  /**
   * Get the number of clusters
   *
   * @return the number of clusters.
   */
  public int getNumClusters () {
    return  m_initialNumClusters;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String maxIterationsTipText() {
    return "maximum number of iterations";
  }

  /**
   * Set the maximum number of iterations to perform
<<<<<<< HEAD
   * 
   * @param i the number of iterations
   * @throws Exception if i is less than 1
   */
  public void setMaxIterations(int i) throws Exception {
    if (i < 1) {
      throw new Exception("Maximum number of iterations must be > 0!");
=======
   *
   * @param i the number of iterations
   * @throws Exception if i is less than 1
   */
  public void setMaxIterations (int i)
    throws Exception {
    if (i < 1) {
      throw  new Exception("Maximum number of iterations must be > 0!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    m_max_iterations = i;
  }

<<<<<<< HEAD
  /**
   * Get the maximum number of iterations
   * 
   * @return the number of iterations
   */
  public int getMaxIterations() {
    return m_max_iterations;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String debugTipText() {
    return "If set to true, clusterer may output additional info to "
      + "the console.";
  }

  /**
   * Set debug mode - verbose output
   * 
   * @param v true for verbose output
   */
  @Override
  public void setDebug(boolean v) {
    m_verbose = v;
  }

  /**
   * Get debug mode
   * 
   * @return true if debug mode is set
   */
  @Override
  public boolean getDebug() {
    return m_verbose;
  }

  /**
   * Gets the current settings of EM.
   * 
   * @return an array of strings suitable for passing to setOptions()
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
=======

  /**
   * Get the maximum number of iterations
   *
   * @return the number of iterations
   */
  public int getMaxIterations () {
    return  m_max_iterations;
  }

  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String debugTipText() {
    return "If set to true, clusterer may output additional info to " +
      "the console.";
  }


  /**
   * Set debug mode - verbose output
   *
   * @param v true for verbose output
   */
  public void setDebug (boolean v) {
    m_verbose = v;
  }


  /**
   * Get debug mode
   *
   * @return true if debug mode is set
   */
  public boolean getDebug () {
    return  m_verbose;
  }


  /**
   * Gets the current settings of EM.
   *
   * @return an array of strings suitable for passing to setOptions()
   */
  public String[] getOptions () {
    int       	i;
    Vector    	result;
    String[]  	options;

    result = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result.add("-I");
    result.add("" + m_max_iterations);
    result.add("-N");
    result.add("" + getNumClusters());
<<<<<<< HEAD
    result.add("-X");
    result.add("" + getNumFolds());
    result.add("-max");
    result.add("" + getMaximumNumberOfClusters());
    result.add("-ll-cv");
    result.add("" + getMinLogLikelihoodImprovementCV());
    result.add("-ll-iter");
    result.add("" + getMinLogLikelihoodImprovementIterating());
    result.add("-M");
    result.add("" + getMinStdDev());
    result.add("-K");
    result.add("" + getNumKMeansRuns());
=======
    result.add("-M");
    result.add("" + getMinStdDev());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_displayModelInOldFormat) {
      result.add("-O");
    }

<<<<<<< HEAD
    result.add("-num-slots");
    result.add("" + getNumExecutionSlots());

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Initialize the global aggregated estimators and storage.
   * 
   * @param inst the instances
   * @throws Exception if initialization fails
   **/
  private void EM_Init(Instances inst) throws Exception {
    int i, j, k;

    // run k means a user-specified number of times and choose best solution
    SimpleKMeans bestK = null;
    double bestSqE = Double.MAX_VALUE;
    for (i = 0; i < m_NumKMeansRuns; i++) {
      SimpleKMeans sk = new SimpleKMeans();
      sk.setSeed(m_rr.nextInt());
      sk.setNumClusters(m_num_clusters);
      sk.setNumExecutionSlots(m_executionSlots);
      sk.setDisplayStdDevs(true);
      sk.setDoNotCheckCapabilities(true);
      sk.setDontReplaceMissingValues(true);
      sk.buildClusterer(inst);
      if (sk.getSquaredError() < bestSqE) {
        bestSqE = sk.getSquaredError();
        bestK = sk;
      }
    }

=======
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return (String[]) result.toArray(new String[result.size()]);	  
  }

  /**
   * Initialise estimators and storage.
   *
   * @param inst the instances
   * @throws Exception if initialization fails
   **/
  private void EM_Init (Instances inst)
    throws Exception {
    int i, j, k;

    // run k means 10 times and choose best solution
    SimpleKMeans bestK = null;
    double bestSqE = Double.MAX_VALUE;
    for (i = 0; i < 10; i++) {
      SimpleKMeans sk = new SimpleKMeans();
      sk.setSeed(m_rr.nextInt());
      sk.setNumClusters(m_num_clusters);
      sk.setDisplayStdDevs(true);
      sk.buildClusterer(inst);
      if (sk.getSquaredError() < bestSqE) {
	bestSqE = sk.getSquaredError();
	bestK = sk;
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // initialize with best k-means solution
    m_num_clusters = bestK.numberOfClusters();
    m_weights = new double[inst.numInstances()][m_num_clusters];
    m_model = new DiscreteEstimator[m_num_clusters][m_num_attribs];
    m_modelNormal = new double[m_num_clusters][m_num_attribs][3];
    m_priors = new double[m_num_clusters];
<<<<<<< HEAD

    m_modelPrev = new DiscreteEstimator[m_num_clusters][m_num_attribs];
    m_modelNormalPrev = new double[m_num_clusters][m_num_attribs][3];
    m_priorsPrev = new double[m_num_clusters];

    Instances centers = bestK.getClusterCentroids();
    Instances stdD = bestK.getClusterStandardDevs();
    double[][][] nominalCounts = bestK.getClusterNominalCounts();
    double[] clusterSizes = bestK.getClusterSizes();
=======
    
    m_modelPrev = new DiscreteEstimator[m_num_clusters][m_num_attribs];
    m_modelNormalPrev = new double[m_num_clusters][m_num_attribs][3];
    m_priorsPrev = new double[m_num_clusters];
    
    Instances centers = bestK.getClusterCentroids();
    Instances stdD = bestK.getClusterStandardDevs();
    int [][][] nominalCounts = bestK.getClusterNominalCounts();
    int [] clusterSizes = bestK.getClusterSizes();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    for (i = 0; i < m_num_clusters; i++) {
      Instance center = centers.instance(i);
      for (j = 0; j < m_num_attribs; j++) {
<<<<<<< HEAD
        if (inst.attribute(j).isNominal()) {
          m_model[i][j] = new DiscreteEstimator(m_theInstances.attribute(j)
            .numValues(), true);
          for (k = 0; k < inst.attribute(j).numValues(); k++) {
            m_model[i][j].addValue(k, nominalCounts[i][j][k]);
          }
        } else {
          double minStdD = (m_minStdDevPerAtt != null) ? m_minStdDevPerAtt[j]
            : m_minStdDev;
          m_modelNormal[i][j][0] = center.value(j);
          double stdv = stdD.instance(i).value(j);
          if (stdv < minStdD) {
            stdv = Math.sqrt(inst.variance(j));
            if (Double.isInfinite(stdv)) {
              stdv = minStdD;
            }
            if (stdv < minStdD) {
              stdv = minStdD;
            }
          }
          if ((stdv <= 0) || Double.isNaN(stdv)) {
            stdv = m_minStdDev;
          }

          m_modelNormal[i][j][1] = stdv;
          m_modelNormal[i][j][2] = 1.0;
        }
      }
    }

    for (j = 0; j < m_num_clusters; j++) {
      // m_priors[j] += 1.0;
=======
	if (inst.attribute(j).isNominal()) {
	  m_model[i][j] = new DiscreteEstimator(m_theInstances.
						attribute(j).numValues()
						, true);
	  for (k = 0; k < inst.attribute(j).numValues(); k++) {
	    m_model[i][j].addValue(k, nominalCounts[i][j][k]);
	  }
	} else {
	  double minStdD = (m_minStdDevPerAtt != null)
	    ? m_minStdDevPerAtt[j]
	    : m_minStdDev;
	  double mean = (center.isMissing(j))
	    ? inst.meanOrMode(j)
	    : center.value(j);
	  m_modelNormal[i][j][0] = mean;
	  double stdv = (stdD.instance(i).isMissing(j))
	    ? ((m_maxValues[j] - m_minValues[j]) / (2 * m_num_clusters))
	    : stdD.instance(i).value(j);
	  if (stdv < minStdD) {
	    stdv = inst.attributeStats(j).numericStats.stdDev;
            if (Double.isInfinite(stdv)) {
              stdv = minStdD;
            }
	    if (stdv < minStdD) {
	      stdv = minStdD;
	    }
	  }
	  if (stdv <= 0) {
	    stdv = m_minStdDev;
	  }

	  m_modelNormal[i][j][1] = stdv;
	  m_modelNormal[i][j][2] = 1.0;
	}
      } 
    }    
    
    
    for (j = 0; j < m_num_clusters; j++) {
      //      m_priors[j] += 1.0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_priors[j] = clusterSizes[j];
    }
    Utils.normalize(m_priors);
  }

<<<<<<< HEAD
  /**
   * calculate prior probabilites for the clusters
   * 
   * @param inst the instances
   * @throws Exception if priors can't be calculated
   **/
  private void estimate_priors(Instances inst) throws Exception {
=======

  /**
   * calculate prior probabilites for the clusters
   *
   * @param inst the instances
   * @throws Exception if priors can't be calculated
   **/
  private void estimate_priors (Instances inst)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    for (int i = 0; i < m_num_clusters; i++) {
      m_priorsPrev[i] = m_priors[i];
      m_priors[i] = 0.0;
    }

    for (int i = 0; i < inst.numInstances(); i++) {
      for (int j = 0; j < m_num_clusters; j++) {
        m_priors[j] += inst.instance(i).weight() * m_weights[i][j];
      }
    }

    Utils.normalize(m_priors);
  }

<<<<<<< HEAD
  /** Constant for normal distribution. */
  private static double m_normConst = Math.log(Math.sqrt(2 * Math.PI));

  /**
   * Density function of normal distribution.
   * 
=======

  /** Constant for normal distribution. */
  private static double m_normConst = Math.log(Math.sqrt(2*Math.PI));

  /**
   * Density function of normal distribution.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param x input value
   * @param mean mean of distribution
   * @param stdDev standard deviation of distribution
   * @return the density
   */
<<<<<<< HEAD
  private double logNormalDens(double x, double mean, double stdDev) {

    double diff = x - mean;
    // System.err.println("x: "+x+" mean: "+mean+" diff: "+diff+" stdv: "+stdDev);
    // System.err.println("diff*diff/(2*stdv*stdv): "+ (diff * diff / (2 *
    // stdDev * stdDev)));

    return -(diff * diff / (2 * stdDev * stdDev)) - m_normConst
      - Math.log(stdDev);
=======
  private double logNormalDens (double x, double mean, double stdDev) {

    double diff = x - mean;
    //    System.err.println("x: "+x+" mean: "+mean+" diff: "+diff+" stdv: "+stdDev);
    //    System.err.println("diff*diff/(2*stdv*stdv): "+ (diff * diff / (2 * stdDev * stdDev)));
    
    return - (diff * diff / (2 * stdDev * stdDev))  - m_normConst - Math.log(stdDev);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * New probability estimators for an iteration
   */
<<<<<<< HEAD
  private void new_estimators() {
=======
  private void new_estimators () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (int i = 0; i < m_num_clusters; i++) {
      for (int j = 0; j < m_num_attribs; j++) {
        if (m_theInstances.attribute(j).isNominal()) {
          m_modelPrev[i][j] = m_model[i][j];
<<<<<<< HEAD
          m_model[i][j] = new DiscreteEstimator(m_theInstances.attribute(j)
            .numValues(), true);
        } else {
          m_modelNormalPrev[i][j][0] = m_modelNormal[i][j][0];
          m_modelNormalPrev[i][j][1] = m_modelNormal[i][j][1];
          m_modelNormalPrev[i][j][2] = m_modelNormal[i][j][2];
          m_modelNormal[i][j][0] = m_modelNormal[i][j][1] = m_modelNormal[i][j][2] = 0.0;
=======
          m_model[i][j] = new DiscreteEstimator(m_theInstances.
						attribute(j).numValues()
						, true);
        }
        else {
          m_modelNormalPrev[i][j][0] = m_modelNormal[i][j][0];
          m_modelNormalPrev[i][j][1] = m_modelNormal[i][j][1];
          m_modelNormalPrev[i][j][2] = m_modelNormal[i][j][2];
          m_modelNormal[i][j][0] = m_modelNormal[i][j][1] = 
	    m_modelNormal[i][j][2] = 0.0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    }
  }

<<<<<<< HEAD
  /**
   * Start the pool of execution threads
   */
  protected void startExecutorPool() {
    if (m_executorPool != null) {
      m_executorPool.shutdownNow();
    }

    m_executorPool = Executors.newFixedThreadPool(m_executionSlots);
  }

  private class ETask implements Callable<double[]> {

    protected int m_lowNum;
    protected int m_highNum;
    protected boolean m_changeWeights;
    protected Instances m_eData;

    public ETask(Instances data, int lowInstNum, int highInstNum,
      boolean changeWeights) {
      m_eData = data;
      m_lowNum = lowInstNum;
      m_highNum = highInstNum;
      m_changeWeights = changeWeights;
    }

    @Override
    public double[] call() {
      double[] llk = new double[2];
      double loglk = 0.0, sOW = 0.0;
      try {

        for (int i = m_lowNum; i < m_highNum; i++) {
          Instance in = m_eData.instance(i);

          loglk += in.weight() * EM.this.logDensityForInstance(in);
          sOW += in.weight();

          if (m_changeWeights) {
            m_weights[i] = distributionForInstance(in);
          }
        }
        // completedETask(loglk, sOW, true);
      } catch (Exception ex) {
        // completedETask(0, 0, false);
      }

      llk[0] = loglk;
      llk[1] = sOW;

      return llk;
    }
  }

  private class MTask implements Callable<MTask> {

    // protected Instances m_dataChunk;
    protected int m_start;
    protected int m_end;
    protected Instances m_inst;

    protected DiscreteEstimator[][] m_taskModel;
    double[][][] m_taskModelNormal;

    public MTask(Instances inst, int start, int end,
      DiscreteEstimator[][] discEst, double[][][] numericEst) {
      // m_dataChunk = chunk;
      m_start = start;
      m_end = end;
      m_inst = inst;
      m_taskModel = discEst;
      m_taskModelNormal = numericEst;
    }

    @Override
    public MTask call() {

      for (int l = m_start; l < m_end; l++) {
        Instance in = m_inst.instance(l);
        for (int i = 0; i < m_num_clusters; i++) {
          for (int j = 0; j < m_num_attribs; j++) {
            if (m_inst.attribute(j).isNominal()) {
              m_taskModel[i][j].addValue(in.value(j), in.weight()
                * m_weights[l][i]);
            } else {
              m_taskModelNormal[i][j][0] += (in.value(j) * in.weight() * m_weights[l][i]);
              m_taskModelNormal[i][j][2] += in.weight() * m_weights[l][i];
              m_taskModelNormal[i][j][1] += (in.value(j) * in.value(j)
                * in.weight() * m_weights[l][i]);
=======

  /**
   * The M step of the EM algorithm.
   * @param inst the training instances
   * @throws Exception if something goes wrong
   */
  private void M (Instances inst)
    throws Exception {

    int i, j, l;

    new_estimators();
    estimate_priors(inst);

    for (i = 0; i < m_num_clusters; i++) {
      for (j = 0; j < m_num_attribs; j++) {
        for (l = 0; l < inst.numInstances(); l++) {
	  Instance in = inst.instance(l);
          if (!in.isMissing(j)) {
            if (inst.attribute(j).isNominal()) {
              m_model[i][j].addValue(in.value(j), 
				     in.weight() * m_weights[l][i]);
            }
            else {
              m_modelNormal[i][j][0] += (in.value(j) * in.weight() *
					 m_weights[l][i]);
              m_modelNormal[i][j][2] += in.weight() * m_weights[l][i];
              m_modelNormal[i][j][1] += (in.value(j) * 
					 in.value(j) * in.weight() * m_weights[l][i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }
          }
        }
      }
<<<<<<< HEAD

      // completedMTask(this, true);
      return this;
    }
  }

  private void M_reEstimate(Instances inst) {
    // calcualte mean and std deviation for numeric attributes
    for (int i = 0; i < m_num_clusters; i++) {
      for (int j = 0; j < m_num_attribs; j++) {
        if (!inst.attribute(j).isNominal()) {
          if (m_modelNormal[i][j][2] <= 0) {
            m_modelNormal[i][j][1] = Double.MAX_VALUE;
            // m_modelNormal[i][j][0] = 0;
            m_modelNormal[i][j][0] = m_minStdDev;
          } else {

            // variance
            m_modelNormal[i][j][1] = (m_modelNormal[i][j][1] - (m_modelNormal[i][j][0]
              * m_modelNormal[i][j][0] / m_modelNormal[i][j][2]))
              / (m_modelNormal[i][j][2]);

            if (m_modelNormal[i][j][1] < 0) {
              m_modelNormal[i][j][1] = 0;
            }

            // std dev
            double minStdD = (m_minStdDevPerAtt != null) ? m_minStdDevPerAtt[j]
              : m_minStdDev;

            m_modelNormal[i][j][1] = Math.sqrt(m_modelNormal[i][j][1]);

            if ((m_modelNormal[i][j][1] <= minStdD)) {
              m_modelNormal[i][j][1] = Math.sqrt(inst.variance(j));
              if ((m_modelNormal[i][j][1] <= minStdD)) {
                m_modelNormal[i][j][1] = minStdD;
              }
            }
            if ((m_modelNormal[i][j][1] <= 0)) {
              m_modelNormal[i][j][1] = m_minStdDev;
            }
            if (Double.isInfinite(m_modelNormal[i][j][1])) {
              m_modelNormal[i][j][1] = m_minStdDev;
            }

            // mean
            m_modelNormal[i][j][0] /= m_modelNormal[i][j][2];
          }
=======
    }
    
    // calcualte mean and std deviation for numeric attributes
    for (j = 0; j < m_num_attribs; j++) {
      if (!inst.attribute(j).isNominal()) {
        for (i = 0; i < m_num_clusters; i++) {
          if (m_modelNormal[i][j][2] <= 0) {
            m_modelNormal[i][j][1] = Double.MAX_VALUE;
	    //	    m_modelNormal[i][j][0] = 0;
	    m_modelNormal[i][j][0] = m_minStdDev;
          } else {
	      
	    // variance
	    m_modelNormal[i][j][1] = (m_modelNormal[i][j][1] - 
				      (m_modelNormal[i][j][0] * 
				       m_modelNormal[i][j][0] / 
				       m_modelNormal[i][j][2])) / 
	      (m_modelNormal[i][j][2]);
	    
	    if (m_modelNormal[i][j][1] < 0) {
	      m_modelNormal[i][j][1] = 0;
	    }
	    
	    // std dev      
	    double minStdD = (m_minStdDevPerAtt != null)
	    ? m_minStdDevPerAtt[j]
	    : m_minStdDev;

	    m_modelNormal[i][j][1] = Math.sqrt(m_modelNormal[i][j][1]);              

	    if ((m_modelNormal[i][j][1] <= minStdD)) {
	      m_modelNormal[i][j][1] = inst.attributeStats(j).numericStats.stdDev;
	      if ((m_modelNormal[i][j][1] <= minStdD)) {
		m_modelNormal[i][j][1] = minStdD;
	      }
	    }
	    if ((m_modelNormal[i][j][1] <= 0)) {
	      m_modelNormal[i][j][1] = m_minStdDev;
	    }
            if (Double.isInfinite(m_modelNormal[i][j][1])) {
              m_modelNormal[i][j][1] = m_minStdDev;
            }
	    
	    // mean
	    m_modelNormal[i][j][0] /= m_modelNormal[i][j][2];
	  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    }
  }

  /**
<<<<<<< HEAD
   * The M step of the EM algorithm.
   * 
   * @param inst the training instances
   * @throws Exception if something goes wrong
   */
  private void M(Instances inst) throws Exception {

    int i, j, l;

    new_estimators();
    estimate_priors(inst);

    // sum
    for (l = 0; l < inst.numInstances(); l++) {
      Instance in = inst.instance(l);
      for (i = 0; i < m_num_clusters; i++) {
        for (j = 0; j < m_num_attribs; j++) {
          if (inst.attribute(j).isNominal()) {
            m_model[i][j]
              .addValue(in.value(j), in.weight() * m_weights[l][i]);
          } else {
            m_modelNormal[i][j][0] += (in.value(j) * in.weight() * m_weights[l][i]);
            m_modelNormal[i][j][2] += in.weight() * m_weights[l][i];
            m_modelNormal[i][j][1] += (in.value(j) * in.value(j)
              * in.weight() * m_weights[l][i]);
          }
        }
      }
    }

    // re-estimate Gaussian parameters
    M_reEstimate(inst);
  }

  /**
   * The E step of the EM algorithm. Estimate cluster membership probabilities.
   * 
=======
   * The E step of the EM algorithm. Estimate cluster membership 
   * probabilities.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param inst the training instances
   * @param change_weights whether to change the weights
   * @return the average log likelihood
   * @throws Exception if computation fails
   */
<<<<<<< HEAD
  private double E(Instances inst, boolean change_weights) throws Exception {
=======
  private double E (Instances inst, boolean change_weights)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    double loglk = 0.0, sOW = 0.0;

    for (int l = 0; l < inst.numInstances(); l++) {

      Instance in = inst.instance(l);

      loglk += in.weight() * logDensityForInstance(in);
      sOW += in.weight();

      if (change_weights) {
<<<<<<< HEAD
        m_weights[l] = distributionForInstance(in);
      }
    }

    if (sOW <= 0) { // In case all weights are zero
      return 0;
    }
    
    // reestimate priors
    /*
     * if (change_weights) { estimate_priors(inst); }
     */
    return loglk / sOW;
  }

  /**
   * Constructor.
   * 
   **/
  public EM() {
    super();

=======
	m_weights[l] = distributionForInstance(in);
      }
    }
    
    // reestimate priors
    /*if (change_weights) {
      estimate_priors(inst);
    } */
    return  loglk / sOW;
  }
  
  
  /**
   * Constructor.
   *
   **/
  public EM () {
    super();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_SeedDefault = 100;
    resetOptions();
  }

<<<<<<< HEAD
  /**
   * Reset to default options
   */
  protected void resetOptions() {
=======

  /**
   * Reset to default options
   */
  protected void resetOptions () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_minStdDev = 1e-6;
    m_max_iterations = 100;
    m_Seed = m_SeedDefault;
    m_num_clusters = -1;
    m_initialNumClusters = -1;
    m_verbose = false;
<<<<<<< HEAD
    m_minLogLikelihoodImprovementIterating = 1e-6;
    m_minLogLikelihoodImprovementCV = 1e-6;
    m_executionSlots = 1;
    m_cvFolds = 10;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Return the normal distributions for the cluster models
<<<<<<< HEAD
   * 
   * @return a <code>double[][][]</code> value
   */
  public double[][][] getClusterModelsNumericAtts() {
=======
   *
   * @return a <code>double[][][]</code> value
   */
  public double [][][] getClusterModelsNumericAtts() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_modelNormal;
  }

  /**
   * Return the priors for the clusters
<<<<<<< HEAD
   * 
   * @return a <code>double[]</code> value
   */
  public double[] getClusterPriors() {
=======
   *
   * @return a <code>double[]</code> value
   */
  public double [] getClusterPriors() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_priors;
  }

  /**
   * Outputs the generated clusters into a string.
   * 
   * @return the clusterer in string representation
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String toString() {
    if (m_displayModelInOldFormat) {
      return toStringOriginal();
    }

    if (m_priors == null) {
      return "No clusterer built yet!";
    }
    StringBuffer temp = new StringBuffer();
    temp.append("\nEM\n==\n");
    if (m_initialNumClusters == -1) {
      temp.append("\nNumber of clusters selected by cross validation: "
<<<<<<< HEAD
        + m_num_clusters + "\n");
=======
		  +m_num_clusters+"\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      temp.append("\nNumber of clusters: " + m_num_clusters + "\n");
    }

<<<<<<< HEAD
    temp.append("Number of iterations performed: " + m_iterationsPerformed
      + "\n");

    int maxWidth = 0;
    int maxAttWidth = 0;
=======
    int maxWidth = 0;
    int maxAttWidth = 0;
    boolean containsKernel = false;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // set up max widths
    // attributes
    for (int i = 0; i < m_num_attribs; i++) {
      Attribute a = m_theInstances.attribute(i);
      if (a.name().length() > maxAttWidth) {
        maxAttWidth = m_theInstances.attribute(i).name().length();
      }
      if (a.isNominal()) {
        // check values
        for (int j = 0; j < a.numValues(); j++) {
          String val = a.value(j) + "  ";
          if (val.length() > maxAttWidth) {
            maxAttWidth = val.length();
          }
        }
      }
    }

    for (int i = 0; i < m_num_clusters; i++) {
      for (int j = 0; j < m_num_attribs; j++) {
        if (m_theInstances.attribute(j).isNumeric()) {
          // check mean and std. dev. against maxWidth
<<<<<<< HEAD
          double mean = Math.log(Math.abs(m_modelNormal[i][j][0]))
            / Math.log(10.0);
          double stdD = Math.log(Math.abs(m_modelNormal[i][j][1]))
            / Math.log(10.0);
          double width = (mean > stdD) ? mean : stdD;
=======
          double mean = Math.log(Math.abs(m_modelNormal[i][j][0])) / Math.log(10.0);
          double stdD = Math.log(Math.abs(m_modelNormal[i][j][1])) / Math.log(10.0);
          double width = (mean > stdD)
            ? mean
            : stdD;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (width < 0) {
            width = 1;
          }
          // decimal + # decimal places + 1
          width += 6.0;
<<<<<<< HEAD
          if ((int) width > maxWidth) {
            maxWidth = (int) width;
          }
        } else {
          // nominal distributions
          DiscreteEstimator d = (DiscreteEstimator) m_model[i][j];
          for (int k = 0; k < d.getNumSymbols(); k++) {
            String size = Utils.doubleToString(d.getCount(k), maxWidth, 4)
              .trim();
=======
          if ((int)width > maxWidth) {
            maxWidth = (int)width;
          }
        } else {
          // nominal distributions
          DiscreteEstimator d = (DiscreteEstimator)m_model[i][j];
          for (int k = 0; k < d.getNumSymbols(); k++) {
            String size = Utils.doubleToString(d.getCount(k), maxWidth, 4).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (size.length() > maxWidth) {
              maxWidth = size.length();
            }
          }
<<<<<<< HEAD
          int sum = Utils.doubleToString(d.getSumOfCounts(), maxWidth, 4)
            .trim().length();
=======
          int sum = 
            Utils.doubleToString(d.getSumOfCounts(), maxWidth, 4).trim().length();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (sum > maxWidth) {
            maxWidth = sum;
          }
        }
      }
    }

    if (maxAttWidth < "Attribute".length()) {
      maxAttWidth = "Attribute".length();
<<<<<<< HEAD
    }

    maxAttWidth += 2;

    temp.append("\n\n");
    temp.append(pad("Cluster", " ",
      (maxAttWidth + maxWidth + 1) - "Cluster".length(), true));

    temp.append("\n");
    temp
    .append(pad("Attribute", " ", maxAttWidth - "Attribute".length(), false));
=======
    }    
    
    maxAttWidth += 2;

    temp.append("\n\n");
    temp.append(pad("Cluster", " ", 
                    (maxAttWidth + maxWidth + 1) - "Cluster".length(), 
                    true));
    
    temp.append("\n");
    temp.append(pad("Attribute", " ", maxAttWidth - "Attribute".length(), false));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // cluster #'s
    for (int i = 0; i < m_num_clusters; i++) {
      String classL = "" + i;
      temp.append(pad(classL, " ", maxWidth + 1 - classL.length(), true));
    }
    temp.append("\n");

    // cluster priors
    temp.append(pad("", " ", maxAttWidth, true));
    for (int i = 0; i < m_num_clusters; i++) {
      String priorP = Utils.doubleToString(m_priors[i], maxWidth, 2).trim();
      priorP = "(" + priorP + ")";
      temp.append(pad(priorP, " ", maxWidth + 1 - priorP.length(), true));
    }

    temp.append("\n");
<<<<<<< HEAD
    temp.append(pad("", "=", maxAttWidth + (maxWidth * m_num_clusters)
      + m_num_clusters + 1, true));
=======
    temp.append(pad("", "=", maxAttWidth + 
                    (maxWidth * m_num_clusters)
                    + m_num_clusters + 1, true));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    temp.append("\n");

    for (int i = 0; i < m_num_attribs; i++) {
      String attName = m_theInstances.attribute(i).name();
      temp.append(attName + "\n");

      if (m_theInstances.attribute(i).isNumeric()) {
        String meanL = "  mean";
        temp.append(pad(meanL, " ", maxAttWidth + 1 - meanL.length(), false));
        for (int j = 0; j < m_num_clusters; j++) {
          // means
<<<<<<< HEAD
          String mean = Utils.doubleToString(m_modelNormal[j][i][0], maxWidth,
            4).trim();
          temp.append(pad(mean, " ", maxWidth + 1 - mean.length(), true));
        }
        temp.append("\n");
        // now do std deviations
        String stdDevL = "  std. dev.";
        temp
        .append(pad(stdDevL, " ", maxAttWidth + 1 - stdDevL.length(), false));
        for (int j = 0; j < m_num_clusters; j++) {
          String stdDev = Utils.doubleToString(m_modelNormal[j][i][1],
            maxWidth, 4).trim();
=======
          String mean = 
            Utils.doubleToString(m_modelNormal[j][i][0], maxWidth, 4).trim();
          temp.append(pad(mean, " ", maxWidth + 1 - mean.length(), true));
        }
        temp.append("\n");            
        // now do std deviations
        String stdDevL = "  std. dev.";
        temp.append(pad(stdDevL, " ", maxAttWidth + 1 - stdDevL.length(), false));
        for (int j = 0; j < m_num_clusters; j++) {
          String stdDev = 
            Utils.doubleToString(m_modelNormal[j][i][1], maxWidth, 4).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          temp.append(pad(stdDev, " ", maxWidth + 1 - stdDev.length(), true));
        }
        temp.append("\n\n");
      } else {
        Attribute a = m_theInstances.attribute(i);
        for (int j = 0; j < a.numValues(); j++) {
          String val = "  " + a.value(j);
          temp.append(pad(val, " ", maxAttWidth + 1 - val.length(), false));
          for (int k = 0; k < m_num_clusters; k++) {
<<<<<<< HEAD
            DiscreteEstimator d = (DiscreteEstimator) m_model[k][i];
            String count = Utils.doubleToString(d.getCount(j), maxWidth, 4)
              .trim();
=======
            DiscreteEstimator d = (DiscreteEstimator)m_model[k][i];
            String count = Utils.doubleToString(d.getCount(j), maxWidth, 4).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            temp.append(pad(count, " ", maxWidth + 1 - count.length(), true));
          }
          temp.append("\n");
        }
        // do the totals
        String total = "  [total]";
        temp.append(pad(total, " ", maxAttWidth + 1 - total.length(), false));
        for (int k = 0; k < m_num_clusters; k++) {
<<<<<<< HEAD
          DiscreteEstimator d = (DiscreteEstimator) m_model[k][i];
          String count = Utils.doubleToString(d.getSumOfCounts(), maxWidth, 4)
            .trim();
          temp.append(pad(count, " ", maxWidth + 1 - count.length(), true));
        }
        temp.append("\n");
=======
          DiscreteEstimator d = (DiscreteEstimator)m_model[k][i];
          String count = 
            Utils.doubleToString(d.getSumOfCounts(), maxWidth, 4).trim();
            temp.append(pad(count, " ", maxWidth + 1 - count.length(), true));
        }
        temp.append("\n");        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    return temp.toString();
  }

<<<<<<< HEAD
  private String pad(String source, String padChar, int length, boolean leftPad) {
    StringBuffer temp = new StringBuffer();

    if (leftPad) {
      for (int i = 0; i < length; i++) {
=======
  private String pad(String source, String padChar, 
                     int length, boolean leftPad) {
    StringBuffer temp = new StringBuffer();

    if (leftPad) {
      for (int i = 0; i< length; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        temp.append(padChar);
      }
      temp.append(source);
    } else {
      temp.append(source);
<<<<<<< HEAD
      for (int i = 0; i < length; i++) {
=======
      for (int i = 0; i< length; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        temp.append(padChar);
      }
    }
    return temp.toString();
  }

  /**
   * Outputs the generated clusters into a string.
   * 
   * @return the clusterer in string representation
   */
<<<<<<< HEAD
  protected String toStringOriginal() {
=======
  protected String toStringOriginal () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_priors == null) {
      return "No clusterer built yet!";
    }
    StringBuffer temp = new StringBuffer();
    temp.append("\nEM\n==\n");
    if (m_initialNumClusters == -1) {
      temp.append("\nNumber of clusters selected by cross validation: "
<<<<<<< HEAD
        + m_num_clusters + "\n");
=======
		  +m_num_clusters+"\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      temp.append("\nNumber of clusters: " + m_num_clusters + "\n");
    }

    for (int j = 0; j < m_num_clusters; j++) {
<<<<<<< HEAD
      temp.append("\nCluster: " + j + " Prior probability: "
        + Utils.doubleToString(m_priors[j], 4) + "\n\n");
=======
      temp.append("\nCluster: " + j + " Prior probability: " 
		  + Utils.doubleToString(m_priors[j], 4) + "\n\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      for (int i = 0; i < m_num_attribs; i++) {
        temp.append("Attribute: " + m_theInstances.attribute(i).name() + "\n");

        if (m_theInstances.attribute(i).isNominal()) {
          if (m_model[j][i] != null) {
            temp.append(m_model[j][i].toString());
          }
<<<<<<< HEAD
        } else {
          temp.append("Normal Distribution. Mean = "
            + Utils.doubleToString(m_modelNormal[j][i][0], 4) + " StdDev = "
            + Utils.doubleToString(m_modelNormal[j][i][1], 4) + "\n");
=======
        }
        else {
          temp.append("Normal Distribution. Mean = " 
		      + Utils.doubleToString(m_modelNormal[j][i][0], 4) 
		      + " StdDev = " 
		      + Utils.doubleToString(m_modelNormal[j][i][1], 4) 
		      + "\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    }

<<<<<<< HEAD
    return temp.toString();
  }

  /**
   * verbose output for debugging
   * 
   * @param inst the training instances
   */
  private void EM_Report(Instances inst) {
=======
    return  temp.toString();
  }


  /**
   * verbose output for debugging
   * @param inst the training instances
   */
  private void EM_Report (Instances inst) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int i, j, l, m;
    System.out.println("======================================");

    for (j = 0; j < m_num_clusters; j++) {
      for (i = 0; i < m_num_attribs; i++) {
<<<<<<< HEAD
        System.out.println("Clust: " + j + " att: " + i + "\n");

        if (m_theInstances.attribute(i).isNominal()) {
          if (m_model[j][i] != null) {
            System.out.println(m_model[j][i].toString());
          }
        } else {
          System.out.println("Normal Distribution. Mean = "
            + Utils.doubleToString(m_modelNormal[j][i][0], 8, 4)
            + " StandardDev = "
            + Utils.doubleToString(m_modelNormal[j][i][1], 8, 4)
            + " WeightSum = "
            + Utils.doubleToString(m_modelNormal[j][i][2], 8, 4));
        }
      }
    }

    for (l = 0; l < inst.numInstances(); l++) {
      m = Utils.maxIndex(m_weights[l]);
      System.out.print("Inst " + Utils.doubleToString(l, 5, 0) + " Class " + m
        + "\t");
      for (j = 0; j < m_num_clusters; j++) {
        System.out.print(Utils.doubleToString(m_weights[l][j], 7, 5) + "  ");
=======
	System.out.println("Clust: " + j + " att: " + i + "\n");

	if (m_theInstances.attribute(i).isNominal()) {
	  if (m_model[j][i] != null) {
	    System.out.println(m_model[j][i].toString());
	  }
	}
	else {
	  System.out.println("Normal Distribution. Mean = " 
			     + Utils.doubleToString(m_modelNormal[j][i][0]
						    , 8, 4) 
			     + " StandardDev = " 
			     + Utils.doubleToString(m_modelNormal[j][i][1]
						    , 8, 4) 
			     + " WeightSum = " 
			     + Utils.doubleToString(m_modelNormal[j][i][2]
						    , 8, 4));
	}
      }
    }
    
    for (l = 0; l < inst.numInstances(); l++) {
      m = Utils.maxIndex(m_weights[l]);
      System.out.print("Inst " + Utils.doubleToString((double)l, 5, 0) 
		       + " Class " + m + "\t");
      for (j = 0; j < m_num_clusters; j++) {
	System.out.print(Utils.doubleToString(m_weights[l][j], 7, 5) + "  ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.out.println();
    }
  }

<<<<<<< HEAD
  /**
   * estimate the number of clusters by cross validation on the training data.
   * 
   * @throws Exception if something goes wrong
   */
  private void CVClusters() throws Exception {
=======

  /**
   * estimate the number of clusters by cross validation on the training
   * data.
   *
   * @throws Exception if something goes wrong
   */
  private void CVClusters ()
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double CVLogLikely = -Double.MAX_VALUE;
    double templl, tll;
    boolean CVincreased = true;
    m_num_clusters = 1;
<<<<<<< HEAD
    int upperBoundMaxClusters = (m_upperBoundNumClustersCV > 0) ? m_upperBoundNumClustersCV
      : Integer.MAX_VALUE;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int num_clusters = m_num_clusters;
    int i;
    Random cvr;
    Instances trainCopy;
<<<<<<< HEAD
    int numFolds = (m_theInstances.numInstances() < m_cvFolds) ? m_theInstances
      .numInstances() : m_cvFolds;

      boolean ok = true;
      int seed = getSeed();
      int restartCount = 0;
      CLUSTER_SEARCH: while (CVincreased) {
        if (num_clusters > upperBoundMaxClusters) {
          break CLUSTER_SEARCH;
        }
        // theInstances.stratify(10);

        CVincreased = false;
        cvr = new Random(getSeed());
        trainCopy = new Instances(m_theInstances);
        trainCopy.randomize(cvr);
        templl = 0.0;
        for (i = 0; i < numFolds; i++) {
          Instances cvTrain = trainCopy.trainCV(numFolds, i, cvr);
          if (num_clusters > cvTrain.numInstances()) {
            break CLUSTER_SEARCH;
          }
          Instances cvTest = trainCopy.testCV(numFolds, i);
          m_rr = new Random(seed);
          for (int z = 0; z < 10; z++) {
            m_rr.nextDouble();
          }
          m_num_clusters = num_clusters;
          EM_Init(cvTrain);
          try {
            iterate(cvTrain, false);
          } catch (Exception ex) {
            // catch any problems - i.e. empty clusters occurring
            ex.printStackTrace();
            // System.err.println("Restarting after CV training failure ("+num_clusters+" clusters");
            seed++;
            restartCount++;
            ok = false;
            if (restartCount > 5) {
              break CLUSTER_SEARCH;
            }
            break;
          }
          try {
            tll = E(cvTest, false);
          } catch (Exception ex) {
            // catch any problems - i.e. empty clusters occurring
            // ex.printStackTrace();
            ex.printStackTrace();
            // System.err.println("Restarting after CV testing failure ("+num_clusters+" clusters");
            // throw new Exception(ex);
            seed++;
            restartCount++;
            ok = false;
            if (restartCount > 5) {
              break CLUSTER_SEARCH;
            }
            break;
          }

          if (m_verbose) {
            System.out.println("# clust: " + num_clusters + " Fold: " + i
              + " Loglikely: " + tll);
          }
          templl += tll;
        }

        if (ok) {
          restartCount = 0;
          seed = getSeed();
          templl /= numFolds;

          if (m_verbose) {
            System.out.println("==================================="
              + "==============\n# clust: " + num_clusters + " Mean Loglikely: "
              + templl + "\n================================"
              + "=================");
          }

          // if (templl > CVLogLikely) {
          if (templl - CVLogLikely > m_minLogLikelihoodImprovementCV) {
            CVLogLikely = templl;
            CVincreased = true;
            num_clusters++;
          }
        }
      }

      if (m_verbose) {
        System.out.println("Number of clusters: " + (num_clusters - 1));
      }

      m_num_clusters = num_clusters - 1;
  }

  /**
   * Returns the number of clusters.
   * 
   * @return the number of clusters generated for a training dataset.
   * @throws Exception if number of clusters could not be returned successfully
   */
  @Override
  public int numberOfClusters() throws Exception {
    if (m_num_clusters == -1) {
      throw new Exception("Haven't generated any clusters!");
    }

    return m_num_clusters;
  }

  /**
   * Updates the minimum and maximum values for all the attributes based on a
   * new instance.
   * 
   * @param instance the new instance
   */
  private void updateMinMax(Instance instance) {

    for (int j = 0; j < m_theInstances.numAttributes(); j++) {      
      if (instance.value(j) < m_minValues[j]) {
        m_minValues[j] = instance.value(j);
      } else {
        if (instance.value(j) > m_maxValues[j]) {
          m_maxValues[j] = instance.value(j);
        }
=======
    int numFolds = (m_theInstances.numInstances() < 10) 
      ? m_theInstances.numInstances() 
      : 10;

    boolean ok = true;
    int seed = getSeed();
    int restartCount = 0;
    CLUSTER_SEARCH: while (CVincreased) {
      // theInstances.stratify(10);
        
      CVincreased = false;
      cvr = new Random(getSeed());
      trainCopy = new Instances(m_theInstances);
      trainCopy.randomize(cvr);
      templl = 0.0;
      for (i = 0; i < numFolds; i++) {
	Instances cvTrain = trainCopy.trainCV(numFolds, i, cvr);
	if (num_clusters > cvTrain.numInstances()) {
	  break CLUSTER_SEARCH;
	}
	Instances cvTest = trainCopy.testCV(numFolds, i);
	m_rr = new Random(seed);
        for (int z=0; z<10; z++) m_rr.nextDouble();
	m_num_clusters = num_clusters;
	EM_Init(cvTrain);
	try {
	  iterate(cvTrain, false);
	} catch (Exception ex) {
	  // catch any problems - i.e. empty clusters occuring
	  ex.printStackTrace();
          //          System.err.println("Restarting after CV training failure ("+num_clusters+" clusters");
          seed++;
          restartCount++;
          ok = false;
          if (restartCount > 5) {
            break CLUSTER_SEARCH;
          }
	  break;
	}
        try {
          tll = E(cvTest, false);
        } catch (Exception ex) {
          // catch any problems - i.e. empty clusters occuring
          //          ex.printStackTrace();
          ex.printStackTrace();
          //          System.err.println("Restarting after CV testing failure ("+num_clusters+" clusters");
          //          throw new Exception(ex); 
          seed++;
          restartCount++;
          ok = false;
          if (restartCount > 5) {
            break CLUSTER_SEARCH;
          }
          break;
        }

	if (m_verbose) {
	  System.out.println("# clust: " + num_clusters + " Fold: " + i 
			     + " Loglikely: " + tll);
	}
	templl += tll;
      }

      if (ok) {
        restartCount = 0;
        seed = getSeed();
        templl /= (double)numFolds;
        
        if (m_verbose) {
          System.out.println("===================================" 
                             + "==============\n# clust: " 
                             + num_clusters 
                             + " Mean Loglikely: " 
                             + templl 
                             + "\n================================" 
                             + "=================");
        }
        
        if (templl > CVLogLikely) {
          CVLogLikely = templl;
          CVincreased = true;
          num_clusters++;
        }
      }
    }

    if (m_verbose) {
      System.out.println("Number of clusters: " + (num_clusters - 1));
    }

    m_num_clusters = num_clusters - 1;
  }


  /**
   * Returns the number of clusters.
   *
   * @return the number of clusters generated for a training dataset.
   * @throws Exception if number of clusters could not be returned
   * successfully
   */
  public int numberOfClusters ()
    throws Exception {
    if (m_num_clusters == -1) {
      throw  new Exception("Haven't generated any clusters!");
    }

    return  m_num_clusters;
  }

 /**
  * Updates the minimum and maximum values for all the attributes
  * based on a new instance.
  *
  * @param instance the new instance
  */
  private void updateMinMax(Instance instance) {
    
    for (int j = 0; j < m_theInstances.numAttributes(); j++) {
      if (!instance.isMissing(j)) {
	if (Double.isNaN(m_minValues[j])) {
	  m_minValues[j] = instance.value(j);
	  m_maxValues[j] = instance.value(j);
	} else {
	  if (instance.value(j) < m_minValues[j]) {
	    m_minValues[j] = instance.value(j);
	  } else {
	    if (instance.value(j) > m_maxValues[j]) {
	      m_maxValues[j] = instance.value(j);
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Returns default capabilities of the clusterer (i.e., the ones of
   * SimpleKMeans).
   * 
   * @return the capabilities of this clusterer
   */
  @Override
=======
   * Returns default capabilities of the clusterer (i.e., the ones of 
   * SimpleKMeans).
   *
   * @return      the capabilities of this clusterer
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = new SimpleKMeans().getCapabilities();
    result.setOwner(this);
    return result;
  }
<<<<<<< HEAD

  /**
   * Generates a clusterer. Has to initialize all fields of the clusterer that
   * are not being set via options.
   * 
   * @param data set of instances serving as training data
   * @throws Exception if the clusterer has not been generated successfully
   */
  @Override
  public void buildClusterer(Instances data) throws Exception {
    m_training = true;

=======
  
  /**
   * Generates a clusterer. Has to initialize all fields of the clusterer
   * that are not being set via options.
   *
   * @param data set of instances serving as training data 
   * @throws Exception if the clusterer has not been 
   * generated successfully
   */
  public void buildClusterer (Instances data)
    throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // can clusterer handle the data?
    getCapabilities().testWithFail(data);

    m_replaceMissing = new ReplaceMissingValues();
    Instances instances = new Instances(data);
    instances.setClassIndex(-1);
    m_replaceMissing.setInputFormat(instances);
    data = weka.filters.Filter.useFilter(instances, m_replaceMissing);
    instances = null;
<<<<<<< HEAD

    m_theInstances = data;

    // calculate min and max values for attributes
    m_minValues = new double[m_theInstances.numAttributes()];
    m_maxValues = new double[m_theInstances.numAttributes()];
    for (int i = 0; i < m_theInstances.numAttributes(); i++) {
      m_minValues[i] = Double.MAX_VALUE;
      m_maxValues[i] = -Double.MAX_VALUE;
=======
    
    m_theInstances = data;

    // calculate min and max values for attributes
    m_minValues = new double [m_theInstances.numAttributes()];
    m_maxValues = new double [m_theInstances.numAttributes()];
    for (int i = 0; i < m_theInstances.numAttributes(); i++) {
      m_minValues[i] = m_maxValues[i] = Double.NaN;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    for (int i = 0; i < m_theInstances.numInstances(); i++) {
      updateMinMax(m_theInstances.instance(i));
    }

    doEM();
<<<<<<< HEAD

    // save memory
    m_theInstances = new Instances(m_theInstances, 0);
    m_training = false;
=======
    
    // save memory
    m_theInstances = new Instances(m_theInstances,0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the cluster priors.
   * 
   * @return the cluster priors
   */
<<<<<<< HEAD
  @Override
  public double[] clusterPriors() {

    double[] n = new double[m_priors.length];

=======
  public double[] clusterPriors() {

    double[] n = new double[m_priors.length];
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    System.arraycopy(m_priors, 0, n, 0, n.length);
    return n;
  }

  /**
<<<<<<< HEAD
   * Computes the log of the conditional density (per cluster) for a given
   * instance.
   * 
   * @param inst the instance to compute the density for
   * @return an array containing the estimated densities
   * @throws Exception if the density could not be computed successfully
   */
  @Override
  public double[] logDensityPerClusterForInstance(Instance inst)
    throws Exception {
=======
   * Computes the log of the conditional density (per cluster) for a given instance.
   * 
   * @param inst the instance to compute the density for
   * @return an array containing the estimated densities
   * @throws Exception if the density could not be computed
   * successfully
   */
  public double[] logDensityPerClusterForInstance(Instance inst) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    int i, j;
    double logprob;
    double[] wghts = new double[m_num_clusters];
<<<<<<< HEAD

    if (!m_training) {
      m_replaceMissing.input(inst);
      inst = m_replaceMissing.output();
    }

    for (i = 0; i < m_num_clusters; i++) {
      // System.err.println("Cluster : "+i);
      logprob = 0.0;

      for (j = 0; j < m_num_attribs; j++) {
        if (inst.attribute(j).isNominal()) {
          logprob += Math.log(m_model[i][j].getProbability(inst.value(j)));
        } else { // numeric attribute
          logprob += logNormalDens(inst.value(j), m_modelNormal[i][j][0],
            m_modelNormal[i][j][1]);
          /*
           * System.err.println(logNormalDens(inst.value(j),
           * m_modelNormal[i][j][0], m_modelNormal[i][j][1]) + " ");
           */
        }
      }
      // System.err.println("");

      wghts[i] = logprob;
    }
    return wghts;
  }

=======
    
    m_replaceMissing.input(inst);
    inst = m_replaceMissing.output();

    for (i = 0; i < m_num_clusters; i++) {
      //      System.err.println("Cluster : "+i);
      logprob = 0.0;

      for (j = 0; j < m_num_attribs; j++) {
	if (!inst.isMissing(j)) {
	  if (inst.attribute(j).isNominal()) {
	    logprob += Math.log(m_model[i][j].getProbability(inst.value(j)));
	  }
	  else { // numeric attribute
	    logprob += logNormalDens(inst.value(j), 
				     m_modelNormal[i][j][0], 
				     m_modelNormal[i][j][1]);
	    /*	    System.err.println(logNormalDens(inst.value(j), 
				     m_modelNormal[i][j][0], 
				     m_modelNormal[i][j][1]) + " "); */
	  }
	}
      }
      //      System.err.println("");

      wghts[i] = logprob;
    }
    return  wghts;
  }


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Perform the EM algorithm
   * 
   * @throws Exception if something goes wrong
   */
<<<<<<< HEAD
  private void doEM() throws Exception {

=======
  private void doEM ()
    throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_verbose) {
      System.out.println("Seed: " + getSeed());
    }

    m_rr = new Random(getSeed());

    // throw away numbers to avoid problem of similar initial numbers
    // from a similar seed
<<<<<<< HEAD
    for (int i = 0; i < 10; i++) {
      m_rr.nextDouble();
    }
=======
    for (int i=0; i<10; i++) m_rr.nextDouble();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_num_instances = m_theInstances.numInstances();
    m_num_attribs = m_theInstances.numAttributes();

    if (m_verbose) {
<<<<<<< HEAD
      System.out.println("Number of instances: " + m_num_instances
        + "\nNumber of atts: " + m_num_attribs + "\n");
    }
    startExecutorPool();
=======
      System.out.println("Number of instances: " 
			 + m_num_instances 
			 + "\nNumber of atts: " 
			 + m_num_attribs 
			 + "\n");
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // setDefaultStdDevs(theInstances);
    // cross validate to determine number of clusters?
    if (m_initialNumClusters == -1) {
      if (m_theInstances.numInstances() > 9) {
<<<<<<< HEAD
        CVClusters();
        m_rr = new Random(getSeed());
        for (int i = 0; i < 10; i++) {
          m_rr.nextDouble();
        }
      } else {
        m_num_clusters = 1;
=======
	CVClusters();
	m_rr = new Random(getSeed());
	for (int i=0; i<10; i++) m_rr.nextDouble();
      } else {
	m_num_clusters = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // fit full training set
    EM_Init(m_theInstances);
<<<<<<< HEAD
    double loglikely = iterate(m_theInstances, m_verbose);
    if (m_Debug) {
      System.err.println("Current log-likelihood: " + loglikely);
    }

    m_executorPool.shutdown();
  }

  /**
   * Launch E step tasks
   * 
   * @param inst the instances to be clustered
   * @return the log likelihood from this E step
   * @throws Exception if a problem occurs
   */
  protected double launchESteps(Instances inst) throws Exception {
    int numPerTask = inst.numInstances() / m_executionSlots;
    double eStepLogL = 0;
    double eStepSow = 0;

    if (m_executionSlots <= 1 || inst.numInstances() < 2 * m_executionSlots) {
      return E(inst, true);
    }

    List<Future<double[]>> results = new ArrayList<Future<double[]>>();

    for (int i = 0; i < m_executionSlots; i++) {
      int start = i * numPerTask;
      int end = start + numPerTask;
      if (i == m_executionSlots - 1) {
        end = inst.numInstances();
      }
      ETask newTask = new ETask(inst, start, end, true);
      Future<double[]> futureE = m_executorPool.submit(newTask);
      results.add(futureE);
      // m_executorPool.execute(newTask);
      // et[i] = newTask;
      // newTask.run();
    }

    for (int i = 0; i < results.size(); i++) {
      double[] r = results.get(i).get();

      eStepLogL += r[0];
      eStepSow += r[1];
    }

    eStepLogL /= eStepSow;

    return eStepLogL;
  }

  /**
   * Launch the M step tasks
   * 
   * @param inst the instances to be clustered
   * @throws Exception if a problem occurs
   */
  protected void launchMSteps(Instances inst) throws Exception {
    if (m_executionSlots <= 1 || inst.numInstances() < 2 * m_executionSlots) {
      M(inst);
      return;
    }

    // aggregated estimators
    new_estimators();
    estimate_priors(inst);

    int numPerTask = inst.numInstances() / m_executionSlots;
    List<Future<MTask>> results = new ArrayList<Future<MTask>>();

    for (int i = 0; i < m_executionSlots; i++) {
      int start = i * numPerTask;
      int end = start + numPerTask;
      if (i == m_executionSlots - 1) {
        end = inst.numInstances();
      }

      DiscreteEstimator[][] model = new DiscreteEstimator[m_num_clusters][m_num_attribs];
      double[][][] normal = new double[m_num_clusters][m_num_attribs][3];
      for (int ii = 0; ii < m_num_clusters; ii++) {
        for (int j = 0; j < m_num_attribs; j++) {
          if (m_theInstances.attribute(j).isNominal()) {
            model[ii][j] = new DiscreteEstimator(m_theInstances.attribute(j)
              .numValues(), false);
          } else {
            normal[ii][j][0] = normal[ii][j][1] = normal[ii][j][2] = 0.0;
          }
        }
      }

      MTask newTask = new MTask(inst, start, end, model, normal);
      Future<MTask> futureM = m_executorPool.submit(newTask);
      results.add(futureM);
      // newTask.run();
    }

    for (Future<MTask> t : results) {
      MTask m = t.get();

      // aggregate
      for (int i = 0; i < m_num_clusters; i++) {
        for (int j = 0; j < m_num_attribs; j++) {
          if (m_theInstances.attribute(j).isNominal()) {
            for (int k = 0; k < m_theInstances.attribute(j).numValues(); k++) {
              m_model[i][j].addValue(k, m.m_taskModel[i][j].getCount(k));
            }
          } else {
            m_modelNormal[i][j][0] += m.m_taskModelNormal[i][j][0];
            m_modelNormal[i][j][2] += m.m_taskModelNormal[i][j][2];
            m_modelNormal[i][j][1] += m.m_taskModelNormal[i][j][1];
          }
        }
      }
    }

    // re-estimate Gaussian parameters
    M_reEstimate(inst);
  }

  /**
   * iterates the E and M steps until the log likelihood of the data converges.
   * 
=======
    m_loglikely = iterate(m_theInstances, m_verbose);
  }


  /**
   * iterates the E and M steps until the log likelihood of the data
   * converges.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param inst the training instances.
   * @param report be verbose.
   * @return the log likelihood of the data
   * @throws Exception if something goes wrong
   */
<<<<<<< HEAD
  private double iterate(Instances inst, boolean report) throws Exception {

=======
  private double iterate (Instances inst, boolean report)
    throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int i;
    double llkold = 0.0;
    double llk = 0.0;

    if (report) {
      EM_Report(inst);
    }

    boolean ok = false;
    int seed = getSeed();
    int restartCount = 0;
<<<<<<< HEAD
    m_iterationsPerformed = -1;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    while (!ok) {
      try {
        for (i = 0; i < m_max_iterations; i++) {
          llkold = llk;
<<<<<<< HEAD

          llk = launchESteps(inst);

          if (report) {
            System.out.println("Loglikely: " + llk);
          }

          if (i > 0) {
            if ((llk - llkold) < m_minLogLikelihoodImprovementIterating) {
=======
          llk = E(inst, true);
          
          if (report) {
            System.out.println("Loglikely: " + llk);
          }
          
          if (i > 0) {
            if ((llk - llkold) < 1e-6) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              if (llk - llkold < 0) {
                // decrease in log likelihood - revert to the model from the
                // previous iteration
                m_modelNormal = m_modelNormalPrev;
                m_model = m_modelPrev;
                m_priors = m_priorsPrev;
<<<<<<< HEAD
                m_iterationsPerformed = i - 1;
              } else {
                m_iterationsPerformed = i;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
              break;
            }
          }
<<<<<<< HEAD

          launchMSteps(inst);
        }
        ok = true;
      } catch (Exception ex) {
        // System.err.println("Restarting after training failure");
=======
          M(inst);
        }
        ok = true;
      } catch (Exception ex) {
        //        System.err.println("Restarting after training failure");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        ex.printStackTrace();
        seed++;
        restartCount++;
        m_rr = new Random(seed);
        for (int z = 0; z < 10; z++) {
<<<<<<< HEAD
          m_rr.nextDouble();
          m_rr.nextInt();
        }
        if (restartCount > 5) {
          // System.err.println("Reducing the number of clusters");
=======
          m_rr.nextDouble(); m_rr.nextInt();
        }
        if (restartCount > 5) {
          //          System.err.println("Reducing the number of clusters");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          m_num_clusters--;
          restartCount = 0;
        }
        EM_Init(m_theInstances);
<<<<<<< HEAD
        startExecutorPool();
      }
    }

    if (m_iterationsPerformed == -1) {
      m_iterationsPerformed = m_max_iterations;
    }

    if (m_verbose) {
      System.out.println("# iterations performed: " + m_iterationsPerformed);
    }

=======
      }
    }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (report) {
      EM_Report(inst);
    }

<<<<<<< HEAD
    return llk;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11451 $");
=======
    return  llk;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9988 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  // ============
  // Test method.
  // ============
  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv should contain the following arguments:
   *          <p>
   *          -t training file [-T test file] [-N number of clusters] [-S random
   *          seed]
   */
  public static void main(String[] argv) {
=======
   *
   * @param argv should contain the following arguments: <p>
   * -t training file [-T test file] [-N number of clusters] [-S random seed]
   */
  public static void main (String[] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runClusterer(new EM(), argv);
  }
}

