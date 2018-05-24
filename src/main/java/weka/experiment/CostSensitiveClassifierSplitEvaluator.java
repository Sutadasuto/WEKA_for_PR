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
 *    CostSensitiveClassifierSplitEvaluator.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.experiment;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.experiment;

import weka.classifiers.Classifier;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.classifiers.CostMatrix;
import weka.classifiers.Evaluation;
import weka.core.AdditionalMeasureProducer;
import weka.core.Attribute;
<<<<<<< HEAD
=======
import weka.core.Instance;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Summarizable;
import weka.core.Utils;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> SplitEvaluator that produces results for a
 * classification scheme on a nominal class attribute, including weighted
 * misclassification costs.
 * <p/>
 * <!-- globalinfo-end -->
 *
 * <!-- options-start --> Valid options are:
 * <p/>
 *
 * <pre>
 * -W &lt;class name&gt;
 *  The full class name of the classifier.
 *  eg: weka.classifiers.bayes.NaiveBayes
 * </pre>
 *
 * <pre>
 * -C &lt;index&gt;
 *  The index of the class for which IR statistics
 *  are to be output. (default 1)
 * </pre>
 *
 * <pre>
 * -I &lt;index&gt;
=======
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * SplitEvaluator that produces results for a classification scheme on a nominal class attribute, including weighted misclassification costs.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -W &lt;class name&gt;
 *  The full class name of the classifier.
 *  eg: weka.classifiers.bayes.NaiveBayes</pre>
 * 
 * <pre> -C &lt;index&gt;
 *  The index of the class for which IR statistics
 *  are to be output. (default 1)</pre>
 * 
 * <pre> -I &lt;index&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *  The index of an attribute to output in the
 *  results. This attribute should identify an
 *  instance in order to know which instances are
 *  in the test set of a cross validation. if 0
<<<<<<< HEAD
 *  no output (default 0).
 * </pre>
 *
 * <pre>
 * -P
 *  Add target and prediction columns to the result
 *  for each fold.
 * </pre>
 *
 * <pre>
 * Options specific to classifier weka.classifiers.rules.ZeroR:
 * </pre>
 *
 * <pre>
 * -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
 *
 * <pre>
 * -D &lt;directory&gt;
 *  Name of a directory to search for cost files when loading
 *  costs on demand (default current directory).
 * </pre>
 *
 * <!-- options-end -->
=======
 *  no output (default 0).</pre>
 * 
 * <pre> -P
 *  Add target and prediction columns to the result
 *  for each fold.</pre>
 * 
 * <pre> 
 * Options specific to classifier weka.classifiers.rules.ZeroR:
 * </pre>
 * 
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 * <pre> -D &lt;directory&gt;
 *  Name of a directory to search for cost files when loading
 *  costs on demand (default current directory).</pre>
 * 
 <!-- options-end -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 * All options after -- will be passed to the classifier.
 *
 * @author Len Trigg (len@reeltwo.com)
<<<<<<< HEAD
 * @version $Revision: 11323 $
 */
public class CostSensitiveClassifierSplitEvaluator extends
  ClassifierSplitEvaluator {
=======
 * @version $Revision: 7516 $
 */
public class CostSensitiveClassifierSplitEvaluator 
  extends ClassifierSplitEvaluator {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  static final long serialVersionUID = -8069566663019501276L;

<<<<<<< HEAD
  /**
   * The directory used when loading cost files on demand, null indicates
   * current directory
=======
  /** 
   * The directory used when loading cost files on demand, null indicates
   * current directory 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected File m_OnDemandDirectory = new File(System.getProperty("user.dir"));

  /** The length of a result */
<<<<<<< HEAD
  private static final int RESULT_SIZE = 33;

  /**
   * Returns a string describing this split evaluator
   *
   * @return a description of the split evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String globalInfo() {
    return " SplitEvaluator that produces results for a classification scheme "
      + "on a nominal class attribute, including weighted misclassification "
      + "costs.";
=======
  private static final int RESULT_SIZE = 31;

  /**
   * Returns a string describing this split evaluator
   * @return a description of the split evaluator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return " SplitEvaluator that produces results for a classification scheme "
      +"on a nominal class attribute, including weighted misclassification "
      +"costs.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns an enumeration describing the available options..
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(1);

    newVector.addAll(Collections.list(super.listOptions()));

    newVector.addElement(new Option(
      "\tName of a directory to search for cost files when loading\n"
        + "\tcosts on demand (default current directory).", "D", 1,
      "-D <directory>"));
=======
  public Enumeration listOptions() {

    Vector newVector = new Vector(1);
    Enumeration enu = super.listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }

    newVector.addElement(new Option(
              "\tName of a directory to search for cost files when loading\n"
              +"\tcosts on demand (default current directory).",
              "D", 1, "-D <directory>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newVector.elements();
  }

  /**
<<<<<<< HEAD
   * Parses a given list of options.
   * <p/>
   *
   * <!-- options-start --> Valid options are:
   * <p/>
   *
   * <pre>
   * -W &lt;class name&gt;
   *  The full class name of the classifier.
   *  eg: weka.classifiers.bayes.NaiveBayes
   * </pre>
   *
   * <pre>
   * -C &lt;index&gt;
   *  The index of the class for which IR statistics
   *  are to be output. (default 1)
   * </pre>
   *
   * <pre>
   * -I &lt;index&gt;
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -W &lt;class name&gt;
   *  The full class name of the classifier.
   *  eg: weka.classifiers.bayes.NaiveBayes</pre>
   * 
   * <pre> -C &lt;index&gt;
   *  The index of the class for which IR statistics
   *  are to be output. (default 1)</pre>
   * 
   * <pre> -I &lt;index&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  The index of an attribute to output in the
   *  results. This attribute should identify an
   *  instance in order to know which instances are
   *  in the test set of a cross validation. if 0
<<<<<<< HEAD
   *  no output (default 0).
   * </pre>
   *
   * <pre>
   * -P
   *  Add target and prediction columns to the result
   *  for each fold.
   * </pre>
   *
   * <pre>
   * Options specific to classifier weka.classifiers.rules.ZeroR:
   * </pre>
   *
   * <pre>
   * -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console
   * </pre>
   *
   * <pre>
   * -D &lt;directory&gt;
   *  Name of a directory to search for cost files when loading
   *  costs on demand (default current directory).
   * </pre>
   *
   * <!-- options-end -->
=======
   *  no output (default 0).</pre>
   * 
   * <pre> -P
   *  Add target and prediction columns to the result
   *  for each fold.</pre>
   * 
   * <pre> 
   * Options specific to classifier weka.classifiers.rules.ZeroR:
   * </pre>
   * 
   * <pre> -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console</pre>
   * 
   * <pre> -D &lt;directory&gt;
   *  Name of a directory to search for cost files when loading
   *  costs on demand (default current directory).</pre>
   * 
   <!-- options-end -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * All options after -- will be passed to the classifier.
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
<<<<<<< HEAD
  @Override
  public void setOptions(String[] options) throws Exception {

=======
  public void setOptions(String[] options) throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String demandDir = Utils.getOption('D', options);
    if (demandDir.length() != 0) {
      setOnDemandDirectory(new File(demandDir));
    }

    super.setOptions(options);
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
<<<<<<< HEAD
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    options.add("-D");
    options.add("" + getOnDemandDirectory());

    Collections.addAll(options, super.getOptions());

    return options.toArray(new String[0]);
=======
  public String [] getOptions() {

    String [] superOptions = super.getOptions();
    String [] options = new String [superOptions.length + 3];
    int current = 0;

    options[current++] = "-D";
    options[current++] = "" + getOnDemandDirectory();

    System.arraycopy(superOptions, 0, options, current, 
		     superOptions.length);
    current += superOptions.length;
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String onDemandDirectoryTipText() {
    return "The directory to look in for cost files. This directory will be "
      + "searched for cost files when loading on demand.";
  }

  /**
   * Returns the directory that will be searched for cost files when loading on
   * demand.
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String onDemandDirectoryTipText() {
    return "The directory to look in for cost files. This directory will be "
      +"searched for cost files when loading on demand.";
  }

  /**
   * Returns the directory that will be searched for cost files when
   * loading on demand.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @return The cost file search directory.
   */
  public File getOnDemandDirectory() {

    return m_OnDemandDirectory;
  }

  /**
<<<<<<< HEAD
   * Sets the directory that will be searched for cost files when loading on
   * demand.
=======
   * Sets the directory that will be searched for cost files when
   * loading on demand.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param newDir The cost file search directory.
   */
  public void setOnDemandDirectory(File newDir) {

    if (newDir.isDirectory()) {
      m_OnDemandDirectory = newDir;
    } else {
      m_OnDemandDirectory = new File(newDir.getParent());
    }
  }

  /**
<<<<<<< HEAD
   * Gets the data types of each of the result columns produced for a single
   * run. The number of result fields must be constant for a given
   * SplitEvaluator.
   *
   * @return an array containing objects of the type of each result column. The
   *         objects should be Strings, or Doubles.
   */
  @Override
  public Object[] getResultTypes() {
    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
    Object[] resultTypes = new Object[RESULT_SIZE + addm];
=======
   * Gets the data types of each of the result columns produced for a 
   * single run. The number of result fields must be constant
   * for a given SplitEvaluator.
   *
   * @return an array containing objects of the type of each result column. 
   * The objects should be Strings, or Doubles.
   */
  public Object [] getResultTypes() {
    int addm = (m_AdditionalMeasures != null) 
      ? m_AdditionalMeasures.length 
      : 0;
    Object [] resultTypes = new Object[RESULT_SIZE+addm];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Double doub = new Double(0);
    int current = 0;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

    // Timing stats
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
<<<<<<< HEAD
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // sizes
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
<<<<<<< HEAD

    resultTypes[current++] = "";

    // add any additional measures
    for (int i = 0; i < addm; i++) {
      resultTypes[current++] = doub;
    }
    if (current != RESULT_SIZE + addm) {
=======
    
    resultTypes[current++] = "";

    // add any additional measures
    for (int i=0;i<addm;i++) {
      resultTypes[current++] = doub;
    }
    if (current != RESULT_SIZE+addm) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new Error("ResultTypes didn't fit RESULT_SIZE");
    }
    return resultTypes;
  }

  /**
<<<<<<< HEAD
   * Gets the names of each of the result columns produced for a single run. The
   * number of result fields must be constant for a given SplitEvaluator.
   *
   * @return an array containing the name of each result column
   */
  @Override
  public String[] getResultNames() {
    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
    String[] resultNames = new String[RESULT_SIZE + addm];
=======
   * Gets the names of each of the result columns produced for a single run.
   * The number of result fields must be constant
   * for a given SplitEvaluator.
   *
   * @return an array containing the name of each result column
   */
  public String [] getResultNames() {
    int addm = (m_AdditionalMeasures != null) 
      ? m_AdditionalMeasures.length 
      : 0;
    String [] resultNames = new String[RESULT_SIZE+addm];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int current = 0;
    resultNames[current++] = "Number_of_training_instances";
    resultNames[current++] = "Number_of_testing_instances";

    // Basic performance stats - right vs wrong
    resultNames[current++] = "Number_correct";
    resultNames[current++] = "Number_incorrect";
    resultNames[current++] = "Number_unclassified";
    resultNames[current++] = "Percent_correct";
    resultNames[current++] = "Percent_incorrect";
    resultNames[current++] = "Percent_unclassified";
    resultNames[current++] = "Total_cost";
    resultNames[current++] = "Average_cost";

    // Sensitive stats - certainty of predictions
    resultNames[current++] = "Mean_absolute_error";
    resultNames[current++] = "Root_mean_squared_error";
    resultNames[current++] = "Relative_absolute_error";
    resultNames[current++] = "Root_relative_squared_error";

    // SF stats
    resultNames[current++] = "SF_prior_entropy";
    resultNames[current++] = "SF_scheme_entropy";
    resultNames[current++] = "SF_entropy_gain";
    resultNames[current++] = "SF_mean_prior_entropy";
    resultNames[current++] = "SF_mean_scheme_entropy";
    resultNames[current++] = "SF_mean_entropy_gain";

    // K&B stats
    resultNames[current++] = "KB_information";
    resultNames[current++] = "KB_mean_information";
    resultNames[current++] = "KB_relative_information";

    // Timing stats
    resultNames[current++] = "Elapsed_Time_training";
    resultNames[current++] = "Elapsed_Time_testing";
    resultNames[current++] = "UserCPU_Time_training";
    resultNames[current++] = "UserCPU_Time_testing";
<<<<<<< HEAD
    resultNames[current++] = "UserCPU_Time_millis_training";
    resultNames[current++] = "UserCPU_Time_millis_testing";
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // sizes
    resultNames[current++] = "Serialized_Model_Size";
    resultNames[current++] = "Serialized_Train_Set_Size";
    resultNames[current++] = "Serialized_Test_Set_Size";

    // Classifier defined extras
    resultNames[current++] = "Summary";
    // add any additional measures
<<<<<<< HEAD
    for (int i = 0; i < addm; i++) {
      resultNames[current++] = m_AdditionalMeasures[i];
    }
    if (current != RESULT_SIZE + addm) {
=======
    for (int i=0;i<addm;i++) {
      resultNames[current++] = m_AdditionalMeasures[i];
    }
    if (current != RESULT_SIZE+addm) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new Error("ResultNames didn't fit RESULT_SIZE");
    }
    return resultNames;
  }

  /**
<<<<<<< HEAD
   * Gets the results for the supplied train and test datasets. Now performs a
   * deep copy of the classifier before it is built and evaluated (just in case
=======
   * Gets the results for the supplied train and test datasets. Now performs
   * a deep copy of the classifier before it is built and evaluated (just in case
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * the classifier is not initialized properly in buildClassifier()).
   *
   * @param train the training Instances.
   * @param test the testing Instances.
<<<<<<< HEAD
   * @return the results stored in an array. The objects stored in the array may
   *         be Strings, Doubles, or null (for the missing value).
   * @throws Exception if a problem occurs while getting the results
   */
  @Override
  public Object[] getResult(Instances train, Instances test) throws Exception {

=======
   * @return the results stored in an array. The objects stored in
   * the array may be Strings, Doubles, or null (for the missing value).
   * @throws Exception if a problem occurs while getting the results
   */
  public Object [] getResult(Instances train, Instances test)
  throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (train.classAttribute().type() != Attribute.NOMINAL) {
      throw new Exception("Class attribute is not nominal!");
    }
    if (m_Template == null) {
      throw new Exception("No classifier has been specified");
    }
    ThreadMXBean thMonitor = ManagementFactory.getThreadMXBean();
    boolean canMeasureCPUTime = thMonitor.isThreadCpuTimeSupported();
<<<<<<< HEAD
    if (canMeasureCPUTime && !thMonitor.isThreadCpuTimeEnabled()) {
      thMonitor.setThreadCpuTimeEnabled(true);
    }

    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
    Object[] result = new Object[RESULT_SIZE + addm];
    long thID = Thread.currentThread().getId();
    long CPUStartTime = -1, trainCPUTimeElapsed = -1, testCPUTimeElapsed = -1, trainTimeStart, trainTimeElapsed, testTimeStart, testTimeElapsed;

=======
    if(canMeasureCPUTime && !thMonitor.isThreadCpuTimeEnabled())
      thMonitor.setThreadCpuTimeEnabled(true);
    
    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
    Object [] result = new Object[RESULT_SIZE+addm];
    long thID = Thread.currentThread().getId();
    long CPUStartTime=-1, trainCPUTimeElapsed=-1, testCPUTimeElapsed=-1,
         trainTimeStart, trainTimeElapsed, testTimeStart, testTimeElapsed;    
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String costName = train.relationName() + CostMatrix.FILE_EXTENSION;
    File costFile = new File(getOnDemandDirectory(), costName);
    if (!costFile.exists()) {
      throw new Exception("On-demand cost file doesn't exist: " + costFile);
    }
<<<<<<< HEAD
    CostMatrix costMatrix = new CostMatrix(new BufferedReader(new FileReader(
      costFile)));

    Evaluation eval = new Evaluation(train, costMatrix);
    m_Classifier = AbstractClassifier.makeCopy(m_Template);

    trainTimeStart = System.currentTimeMillis();
    if (canMeasureCPUTime) {
      CPUStartTime = thMonitor.getThreadUserTime(thID);
    }
    m_Classifier.buildClassifier(train);
    if (canMeasureCPUTime) {
      trainCPUTimeElapsed = thMonitor.getThreadUserTime(thID) - CPUStartTime;
    }
    trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;
    testTimeStart = System.currentTimeMillis();
    if (canMeasureCPUTime) {
      CPUStartTime = thMonitor.getThreadUserTime(thID);
    }
    eval.evaluateModel(m_Classifier, test);
    if (canMeasureCPUTime) {
      testCPUTimeElapsed = thMonitor.getThreadUserTime(thID) - CPUStartTime;
    }
    testTimeElapsed = System.currentTimeMillis() - testTimeStart;
    thMonitor = null;

=======
    CostMatrix costMatrix = new CostMatrix(new BufferedReader(
    new FileReader(costFile)));
    
    Evaluation eval = new Evaluation(train, costMatrix);    
    m_Classifier = Classifier.makeCopy(m_Template);
    
    trainTimeStart = System.currentTimeMillis();
    if(canMeasureCPUTime)
      CPUStartTime = thMonitor.getThreadUserTime(thID);
    m_Classifier.buildClassifier(train);
    if(canMeasureCPUTime)
      trainCPUTimeElapsed = thMonitor.getThreadUserTime(thID) - CPUStartTime;
    trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;
    testTimeStart = System.currentTimeMillis();
    if(canMeasureCPUTime)
      CPUStartTime = thMonitor.getThreadUserTime(thID);
    eval.evaluateModel(m_Classifier, test);
    if(canMeasureCPUTime)
      testCPUTimeElapsed = thMonitor.getThreadUserTime(thID) - CPUStartTime;
    testTimeElapsed = System.currentTimeMillis() - testTimeStart;
    thMonitor = null;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_result = eval.toSummaryString();
    // The results stored are all per instance -- can be multiplied by the
    // number of instances to get absolute numbers
    int current = 0;
    result[current++] = new Double(train.numInstances());
    result[current++] = new Double(eval.numInstances());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result[current++] = new Double(eval.correct());
    result[current++] = new Double(eval.incorrect());
    result[current++] = new Double(eval.unclassified());
    result[current++] = new Double(eval.pctCorrect());
    result[current++] = new Double(eval.pctIncorrect());
    result[current++] = new Double(eval.pctUnclassified());
    result[current++] = new Double(eval.totalCost());
    result[current++] = new Double(eval.avgCost());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result[current++] = new Double(eval.meanAbsoluteError());
    result[current++] = new Double(eval.rootMeanSquaredError());
    result[current++] = new Double(eval.relativeAbsoluteError());
    result[current++] = new Double(eval.rootRelativeSquaredError());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result[current++] = new Double(eval.SFPriorEntropy());
    result[current++] = new Double(eval.SFSchemeEntropy());
    result[current++] = new Double(eval.SFEntropyGain());
    result[current++] = new Double(eval.SFMeanPriorEntropy());
    result[current++] = new Double(eval.SFMeanSchemeEntropy());
    result[current++] = new Double(eval.SFMeanEntropyGain());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // K&B stats
    result[current++] = new Double(eval.KBInformation());
    result[current++] = new Double(eval.KBMeanInformation());
    result[current++] = new Double(eval.KBRelativeInformation());
<<<<<<< HEAD

    // Timing stats
    result[current++] = new Double(trainTimeElapsed / 1000.0);
    result[current++] = new Double(testTimeElapsed / 1000.0);
    if (canMeasureCPUTime) {
      result[current++] =
        new Double((trainCPUTimeElapsed / 1000000.0) / 1000.0);
      result[current++] = new Double((testCPUTimeElapsed / 1000000.0) / 1000.0);

      result[current++] =
        new Double(trainCPUTimeElapsed / 1000000.0);
      result[current++] = new Double(testCPUTimeElapsed / 1000000.0);
    } else {
      result[current++] = new Double(Utils.missingValue());
      result[current++] = new Double(Utils.missingValue());
      result[current++] = new Double(Utils.missingValue());
      result[current++] = new Double(Utils.missingValue());
    }

=======
    
    // Timing stats
    result[current++] = new Double(trainTimeElapsed / 1000.0);
    result[current++] = new Double(testTimeElapsed / 1000.0);
    if(canMeasureCPUTime) {
      result[current++] = new Double((trainCPUTimeElapsed/1000000.0) / 1000.0);
      result[current++] = new Double((testCPUTimeElapsed /1000000.0) / 1000.0);
    }
    else {
      result[current++] = new Double(Instance.missingValue());
      result[current++] = new Double(Instance.missingValue());
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // sizes
    ByteArrayOutputStream bastream = new ByteArrayOutputStream();
    ObjectOutputStream oostream = new ObjectOutputStream(bastream);
    oostream.writeObject(m_Classifier);
    result[current++] = new Double(bastream.size());
    bastream = new ByteArrayOutputStream();
    oostream = new ObjectOutputStream(bastream);
    oostream.writeObject(train);
    result[current++] = new Double(bastream.size());
    bastream = new ByteArrayOutputStream();
    oostream = new ObjectOutputStream(bastream);
    oostream.writeObject(test);
    result[current++] = new Double(bastream.size());
<<<<<<< HEAD

    if (m_Classifier instanceof Summarizable) {
      result[current++] = ((Summarizable) m_Classifier).toSummaryString();
    } else {
      result[current++] = null;
    }

    for (int i = 0; i < addm; i++) {
      if (m_doesProduce[i]) {
        try {
          double dv = ((AdditionalMeasureProducer) m_Classifier)
            .getMeasure(m_AdditionalMeasures[i]);
          if (!Utils.isMissingValue(dv)) {
=======
    
    if (m_Classifier instanceof Summarizable) {
      result[current++] = ((Summarizable)m_Classifier).toSummaryString();
    } else {
      result[current++] = null;
    }
    
    for (int i=0;i<addm;i++) {
      if (m_doesProduce[i]) {
        try {
          double dv = ((AdditionalMeasureProducer)m_Classifier).
          getMeasure(m_AdditionalMeasures[i]);
          if (!Instance.isMissingValue(dv)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            Double value = new Double(dv);
            result[current++] = value;
          } else {
            result[current++] = null;
          }
        } catch (Exception ex) {
          System.err.println(ex);
        }
      } else {
        result[current++] = null;
      }
    }
<<<<<<< HEAD

    if (current != RESULT_SIZE + addm) {
      throw new Error("Results didn't fit RESULT_SIZE");
    }

    m_Evaluation = eval;

=======
    
    if (current != RESULT_SIZE+addm) {
      throw new Error("Results didn't fit RESULT_SIZE");
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Returns a text description of the split evaluator.
   *
   * @return a text description of the split evaluator.
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String toString() {

    String result = "CostSensitiveClassifierSplitEvaluator: ";
    if (m_Template == null) {
      return result + "<null> classifier";
    }
<<<<<<< HEAD
    return result + m_Template.getClass().getName() + " " + m_ClassifierOptions
      + "(version " + m_ClassifierVersion + ")";
  }

  /**
   * Returns the revision string.
   *
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11323 $");
=======
    return result + m_Template.getClass().getName() + " " 
      + m_ClassifierOptions + "(version " + m_ClassifierVersion + ")";
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7516 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
} // CostSensitiveClassifierSplitEvaluator
