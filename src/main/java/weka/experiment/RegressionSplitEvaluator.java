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
 *    RegressionSplitEvaluator.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.experiment;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.AbstractEvaluationMetric;
import weka.classifiers.rules.ZeroR;
import weka.core.AdditionalMeasureProducer;
import weka.core.Attribute;
=======
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.rules.ZeroR;
import weka.core.AdditionalMeasureProducer;
import weka.core.Attribute;
import weka.core.Instance;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Summarizable;
import weka.core.Utils;

/**
 * <!-- globalinfo-start --> A SplitEvaluator that produces results for a
 * classification scheme on a numeric class attribute.
 * <p/>
 * <!-- globalinfo-end -->
<<<<<<< HEAD
 *
 * <!-- options-start --> Valid options are:
 * <p/>
 *
 * <pre>
 * -no-size
 *  Skips the determination of sizes (train/test/classifier)
 *  (default: sizes are determined)
 * </pre>
 *
=======
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * -W &lt;class name&gt;
 *  The full class name of the classifier.
 *  eg: weka.classifiers.bayes.NaiveBayes
 * </pre>
<<<<<<< HEAD
 *
 * <pre>
 * Options specific to classifier weka.classifiers.rules.ZeroR:
 * </pre>
 *
=======
 * 
 * <pre>
 * Options specific to classifier weka.classifiers.rules.ZeroR:
 * </pre>
 * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
<<<<<<< HEAD
 *
 * <!-- options-end -->
 *
 * All options after -- will be passed to the classifier.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 11323 $
=======
 * 
 * <!-- options-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 11198 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class RegressionSplitEvaluator implements SplitEvaluator, OptionHandler,
  AdditionalMeasureProducer, RevisionHandler {

  /** for serialization */
  static final long serialVersionUID = -328181640503349202L;

  /** The template classifier */
  protected Classifier m_Template = new ZeroR();

  /** The classifier used for evaluation */
  protected Classifier m_Classifier;

<<<<<<< HEAD
  /** Holds the most recently used Evaluation object */
  protected Evaluation m_Evaluation;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The names of any additional measures to look for in SplitEvaluators */
  protected String[] m_AdditionalMeasures = null;

  /**
   * Array of booleans corresponding to the measures in m_AdditionalMeasures
   * indicating which of the AdditionalMeasures the current classifier can
   * produce
   */
  protected boolean[] m_doesProduce = null;

  /** Holds the statistics for the most recent application of the classifier */
  protected String m_result = null;

  /** The classifier options (if any) */
  protected String m_ClassifierOptions = "";

  /** The classifier version */
  protected String m_ClassifierVersion = "";

<<<<<<< HEAD
  /** whether to skip determination of sizes (train/test/classifier). */
  private boolean m_NoSizeDetermination;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The length of a key */
  private static final int KEY_SIZE = 3;

  /** The length of a result */
<<<<<<< HEAD
  private static final int RESULT_SIZE = 27;

  protected final List<AbstractEvaluationMetric> m_pluginMetrics =
    new ArrayList<AbstractEvaluationMetric>();
  protected int m_numPluginStatistics = 0;
=======
  private static final int RESULT_SIZE = 23;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * No args constructor.
   */
  public RegressionSplitEvaluator() {

    updateOptions();
<<<<<<< HEAD

    List<AbstractEvaluationMetric> pluginMetrics = AbstractEvaluationMetric
      .getPluginMetrics();
    if (pluginMetrics != null) {
      for (AbstractEvaluationMetric m : pluginMetrics) {
        if (m.appliesToNumericClass()) {
          m_pluginMetrics.add(m);
          m_numPluginStatistics += m.getStatisticNames().size();
        }
      }
    }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns a string describing this split evaluator
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a description of the split evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "A SplitEvaluator that produces results for a classification "
      + "scheme on a numeric class attribute.";
  }

  /**
   * Returns an enumeration describing the available options..
<<<<<<< HEAD
   *
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(2);

    newVector.addElement(new Option(
      "\tSkips the determination of sizes (train/test/classifier)\n"
        + "\t(default: sizes are determined)", "no-size", 0, "-no-size"));
=======
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration listOptions() {

    Vector newVector = new Vector(1);

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    newVector
      .addElement(new Option("\tThe full class name of the classifier.\n"
        + "\teg: weka.classifiers.bayes.NaiveBayes", "W", 1, "-W <class name>"));

    if ((m_Template != null) && (m_Template instanceof OptionHandler)) {
      newVector.addElement(new Option("", "", 0,
        "\nOptions specific to classifier " + m_Template.getClass().getName()
          + ":"));
<<<<<<< HEAD
      newVector.addAll(Collections.list(((OptionHandler) m_Template)
        .listOptions()));
=======
      Enumeration enu = ((OptionHandler) m_Template).listOptions();
      while (enu.hasMoreElements()) {
        newVector.addElement(enu.nextElement());
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return newVector.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
<<<<<<< HEAD
   *
   * <!-- options-start --> Valid options are:
   * <p/>
   *
   * <pre>
   * -no-size
   *  Skips the determination of sizes (train/test/classifier)
   *  (default: sizes are determined)
   * </pre>
   *
=======
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * -W &lt;class name&gt;
   *  The full class name of the classifier.
   *  eg: weka.classifiers.bayes.NaiveBayes
   * </pre>
<<<<<<< HEAD
   *
   * <pre>
   * Options specific to classifier weka.classifiers.rules.ZeroR:
   * </pre>
   *
=======
   * 
   * <pre>
   * Options specific to classifier weka.classifiers.rules.ZeroR:
   * </pre>
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console
   * </pre>
<<<<<<< HEAD
   *
   * <!-- options-end -->
   *
   * All option after -- will be passed to the classifier.
   *
=======
   * 
   * <!-- options-end -->
   * 
   * All option after -- will be passed to the classifier.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
<<<<<<< HEAD
    m_NoSizeDetermination = Utils.getFlag("no-size", options);

    String cName = Utils.getOption('W', options);
    if (cName.length() == 0) {
      throw new Exception("A classifier must be specified with"
        + " the -W option.");
    }
    // Do it first without options, so if an exception is thrown during
    // the option setting, listOptions will contain options for the actual
    // Classifier.
    setClassifier(AbstractClassifier.forName(cName, null));
=======

    String cName = Utils.getOption('W', options);
    if (cName.length() > 0) {

      // Do it first without options, so if an exception is thrown during
      // the option setting, listOptions will contain options for the actual
      // Classifier.
      setClassifier(Classifier.forName(cName, null));
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (getClassifier() instanceof OptionHandler) {
      ((OptionHandler) getClassifier()).setOptions(Utils
        .partitionOptions(options));
      updateOptions();
    }
  }

  /**
   * Gets the current settings of the Classifier.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
<<<<<<< HEAD
    Vector<String> result;
    String[] classifierOptions;

    result = new Vector<String>();

    classifierOptions = new String[0];
=======

    String[] classifierOptions = new String[0];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if ((m_Template != null) && (m_Template instanceof OptionHandler)) {
      classifierOptions = ((OptionHandler) m_Template).getOptions();
    }

<<<<<<< HEAD
    if (getNoSizeDetermination()) {
      result.add("-no-size");
    }

    if (getClassifier() != null) {
      result.add("-W");
      result.add(getClassifier().getClass().getName());
    }
    result.add("--");
    result.addAll(Arrays.asList(classifierOptions));

    return result.toArray(new String[result.size()]);
=======
    String[] options = new String[classifierOptions.length + 3];
    int current = 0;

    if (getClassifier() != null) {
      options[current++] = "-W";
      options[current++] = getClassifier().getClass().getName();
    }
    options[current++] = "--";

    System.arraycopy(classifierOptions, 0, options, current,
      classifierOptions.length);
    current += classifierOptions.length;
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set a list of method names for additional measures to look for in
   * Classifiers. This could contain many measures (of which only a subset may
   * be produceable by the current Classifier) if an experiment is the type that
   * iterates over a set of properties.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param additionalMeasures an array of method names.
   */
  @Override
  public void setAdditionalMeasures(String[] additionalMeasures) {
    m_AdditionalMeasures = additionalMeasures;

    // determine which (if any) of the additional measures this classifier
    // can produce
    if (m_AdditionalMeasures != null && m_AdditionalMeasures.length > 0) {
      m_doesProduce = new boolean[m_AdditionalMeasures.length];

      if (m_Template instanceof AdditionalMeasureProducer) {
<<<<<<< HEAD
        Enumeration<String> en = ((AdditionalMeasureProducer) m_Template)
          .enumerateMeasures();
        while (en.hasMoreElements()) {
          String mname = en.nextElement();
=======
        Enumeration en = ((AdditionalMeasureProducer) m_Template)
          .enumerateMeasures();
        while (en.hasMoreElements()) {
          String mname = (String) en.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          for (int j = 0; j < m_AdditionalMeasures.length; j++) {
            if (mname.compareToIgnoreCase(m_AdditionalMeasures[j]) == 0) {
              m_doesProduce[j] = true;
            }
          }
        }
      }
    } else {
      m_doesProduce = null;
    }
  }

  /**
   * Returns an enumeration of any additional measure names that might be in the
   * classifier
<<<<<<< HEAD
   *
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration<String> enumerateMeasures() {
    Vector<String> newVector = new Vector<String>();
    if (m_Template instanceof AdditionalMeasureProducer) {
      Enumeration<String> en = ((AdditionalMeasureProducer) m_Template)
        .enumerateMeasures();
      while (en.hasMoreElements()) {
        String mname = en.nextElement();
        newVector.add(mname);
=======
   * 
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration enumerateMeasures() {
    Vector newVector = new Vector();
    if (m_Template instanceof AdditionalMeasureProducer) {
      Enumeration en = ((AdditionalMeasureProducer) m_Template)
        .enumerateMeasures();
      while (en.hasMoreElements()) {
        String mname = (String) en.nextElement();
        newVector.addElement(mname);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return newVector.elements();
  }

  /**
   * Returns the value of the named measure
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param additionalMeasureName the name of the measure to query for its value
   * @return the value of the named measure
   * @throws IllegalArgumentException if the named measure is not supported
   */
  @Override
  public double getMeasure(String additionalMeasureName) {
    if (m_Template instanceof AdditionalMeasureProducer) {
      if (m_Classifier == null) {
        throw new IllegalArgumentException("ClassifierSplitEvaluator: "
          + "Can't return result for measure, "
          + "classifier has not been built yet.");
      }
      return ((AdditionalMeasureProducer) m_Classifier)
        .getMeasure(additionalMeasureName);
    } else {
      throw new IllegalArgumentException("ClassifierSplitEvaluator: "
        + "Can't return value for : " + additionalMeasureName + ". "
        + m_Template.getClass().getName() + " "
        + "is not an AdditionalMeasureProducer");
    }
  }

  /**
   * Gets the data types of each of the key columns produced for a single run.
   * The number of key fields must be constant for a given SplitEvaluator.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an array containing objects of the type of each key column. The
   *         objects should be Strings, or Doubles.
   */
  @Override
  public Object[] getKeyTypes() {

    Object[] keyTypes = new Object[KEY_SIZE];
    keyTypes[0] = "";
    keyTypes[1] = "";
    keyTypes[2] = "";
    return keyTypes;
  }

  /**
   * Gets the names of each of the key columns produced for a single run. The
   * number of key fields must be constant for a given SplitEvaluator.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an array containing the name of each key column
   */
  @Override
  public String[] getKeyNames() {

    String[] keyNames = new String[KEY_SIZE];
    keyNames[0] = "Scheme";
    keyNames[1] = "Scheme_options";
    keyNames[2] = "Scheme_version_ID";
    return keyNames;
  }

  /**
   * Gets the key describing the current SplitEvaluator. For example This may
   * contain the name of the classifier used for classifier predictive
   * evaluation. The number of key fields must be constant for a given
   * SplitEvaluator.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an array of objects containing the key.
   */
  @Override
  public Object[] getKey() {

    Object[] key = new Object[KEY_SIZE];
    key[0] = m_Template.getClass().getName();
    key[1] = m_ClassifierOptions;
    key[2] = m_ClassifierVersion;
    return key;
  }

  /**
   * Gets the data types of each of the result columns produced for a single
   * run. The number of result fields must be constant for a given
   * SplitEvaluator.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an array containing objects of the type of each result column. The
   *         objects should be Strings, or Doubles.
   */
  @Override
  public Object[] getResultTypes() {
    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
<<<<<<< HEAD
    Object[] resultTypes = new Object[RESULT_SIZE + addm
      + m_numPluginStatistics];
=======
    Object[] resultTypes = new Object[RESULT_SIZE + addm];
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
    // Prediction interval statistics
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    resultTypes[current++] = "";

    // add any additional measures
    for (int i = 0; i < addm; i++) {
      resultTypes[current++] = doub;
    }
<<<<<<< HEAD

    // plugin metrics
    for (int i = 0; i < m_numPluginStatistics; i++) {
      resultTypes[current++] = doub;
    }

    if (current != RESULT_SIZE + addm + m_numPluginStatistics) {
=======
    if (current != RESULT_SIZE + addm) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new Error("ResultTypes didn't fit RESULT_SIZE");
    }
    return resultTypes;
  }

  /**
   * Gets the names of each of the result columns produced for a single run. The
   * number of result fields must be constant for a given SplitEvaluator.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an array containing the name of each result column
   */
  @Override
  public String[] getResultNames() {
    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
<<<<<<< HEAD
    String[] resultNames = new String[RESULT_SIZE + addm
      + m_numPluginStatistics];
=======
    String[] resultNames = new String[RESULT_SIZE + addm];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int current = 0;
    resultNames[current++] = "Number_of_training_instances";
    resultNames[current++] = "Number_of_testing_instances";

    // Sensitive stats - certainty of predictions
    resultNames[current++] = "Mean_absolute_error";
    resultNames[current++] = "Root_mean_squared_error";
    resultNames[current++] = "Relative_absolute_error";
    resultNames[current++] = "Root_relative_squared_error";
    resultNames[current++] = "Correlation_coefficient";
    resultNames[current++] = "Number_unclassified";
    resultNames[current++] = "Percent_unclassified";

    // SF stats
    resultNames[current++] = "SF_prior_entropy";
    resultNames[current++] = "SF_scheme_entropy";
    resultNames[current++] = "SF_entropy_gain";
    resultNames[current++] = "SF_mean_prior_entropy";
    resultNames[current++] = "SF_mean_scheme_entropy";
    resultNames[current++] = "SF_mean_entropy_gain";

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

<<<<<<< HEAD
    // Prediction interval statistics
    resultNames[current++] = "Coverage_of_Test_Cases_By_Regions";
    resultNames[current++] = "Size_of_Predicted_Regions";

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // Classifier defined extras
    resultNames[current++] = "Summary";
    // add any additional measures
    for (int i = 0; i < addm; i++) {
      resultNames[current++] = m_AdditionalMeasures[i];
    }
<<<<<<< HEAD

    for (AbstractEvaluationMetric m : m_pluginMetrics) {
      List<String> statNames = m.getStatisticNames();
      for (String s : statNames) {
        resultNames[current++] = s;
      }
    }

    if (current != RESULT_SIZE + addm + m_numPluginStatistics) {
=======
    if (current != RESULT_SIZE + addm) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new Error("ResultNames didn't fit RESULT_SIZE");
    }
    return resultNames;
  }

  /**
   * Gets the results for the supplied train and test datasets. Now performs a
   * deep copy of the classifier before it is built and evaluated (just in case
   * the classifier is not initialized properly in buildClassifier()).
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param train the training Instances.
   * @param test the testing Instances.
   * @return the results stored in an array. The objects stored in the array may
   *         be Strings, Doubles, or null (for the missing value).
   * @throws Exception if a problem occurs while getting the results
   */
  @Override
  public Object[] getResult(Instances train, Instances test) throws Exception {

    if (train.classAttribute().type() != Attribute.NUMERIC) {
      throw new Exception("Class attribute is not numeric!");
    }
    if (m_Template == null) {
      throw new Exception("No classifier has been specified");
    }
    ThreadMXBean thMonitor = ManagementFactory.getThreadMXBean();
    boolean canMeasureCPUTime = thMonitor.isThreadCpuTimeSupported();
    if (canMeasureCPUTime && !thMonitor.isThreadCpuTimeEnabled()) {
      thMonitor.setThreadCpuTimeEnabled(true);
    }

    int addm = (m_AdditionalMeasures != null) ? m_AdditionalMeasures.length : 0;
<<<<<<< HEAD
    Object[] result = new Object[RESULT_SIZE + addm + m_numPluginStatistics];
    long thID = Thread.currentThread().getId();
    long CPUStartTime = -1, trainCPUTimeElapsed = -1, testCPUTimeElapsed = -1, trainTimeStart, trainTimeElapsed, testTimeStart, testTimeElapsed;
    Evaluation eval = new Evaluation(train);
    m_Classifier = AbstractClassifier.makeCopy(m_Template);
=======
    Object[] result = new Object[RESULT_SIZE + addm];
    long thID = Thread.currentThread().getId();
    long CPUStartTime = -1, trainCPUTimeElapsed = -1, testCPUTimeElapsed = -1, trainTimeStart, trainTimeElapsed, testTimeStart, testTimeElapsed;
    Evaluation eval = new Evaluation(train);
    m_Classifier = Classifier.makeCopy(m_Template);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

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

    m_result = eval.toSummaryString();
    // The results stored are all per instance -- can be multiplied by the
    // number of instances to get absolute numbers
    int current = 0;
    result[current++] = new Double(train.numInstances());
    result[current++] = new Double(eval.numInstances());

    result[current++] = new Double(eval.meanAbsoluteError());
    result[current++] = new Double(eval.rootMeanSquaredError());
    result[current++] = new Double(eval.relativeAbsoluteError());
    result[current++] = new Double(eval.rootRelativeSquaredError());
    result[current++] = new Double(eval.correlationCoefficient());
    result[current++] = new Double(eval.unclassified());
    result[current++] = new Double(eval.pctUnclassified());

    result[current++] = new Double(eval.SFPriorEntropy());
    result[current++] = new Double(eval.SFSchemeEntropy());
    result[current++] = new Double(eval.SFEntropyGain());
    result[current++] = new Double(eval.SFMeanPriorEntropy());
    result[current++] = new Double(eval.SFMeanSchemeEntropy());
    result[current++] = new Double(eval.SFMeanEntropyGain());

    // Timing stats
    result[current++] = new Double(trainTimeElapsed / 1000.0);
    result[current++] = new Double(testTimeElapsed / 1000.0);
    if (canMeasureCPUTime) {
      result[current++] =
        new Double((trainCPUTimeElapsed / 1000000.0) / 1000.0);
      result[current++] = new Double((testCPUTimeElapsed / 1000000.0) / 1000.0);
<<<<<<< HEAD

      result[current++] =
        new Double(trainCPUTimeElapsed / 1000000.0);
      result[current++] = new Double(testCPUTimeElapsed / 1000000.0);
    } else {
      result[current++] = new Double(Utils.missingValue());
      result[current++] = new Double(Utils.missingValue());
      result[current++] = new Double(Utils.missingValue());
      result[current++] = new Double(Utils.missingValue());
    }

    // sizes
    if (m_NoSizeDetermination) {
      result[current++] = -1.0;
      result[current++] = -1.0;
      result[current++] = -1.0;
    } else {
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
    }

    // Prediction interval statistics
    result[current++] =
      new Double(eval.coverageOfTestCasesByPredictedRegions());
    result[current++] = new Double(eval.sizeOfPredictedRegions());
=======
    } else {
      result[current++] = new Double(Instance.missingValue());
      result[current++] = new Double(Instance.missingValue());
    }

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
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

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
<<<<<<< HEAD
          if (!Utils.isMissingValue(dv)) {
=======
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
    // get the actual metrics from the evaluation object
    List<AbstractEvaluationMetric> metrics = eval.getPluginMetrics();
    if (metrics != null) {
      for (AbstractEvaluationMetric m : metrics) {
        if (m.appliesToNumericClass()) {
          List<String> statNames = m.getStatisticNames();
          for (String s : statNames) {
            result[current++] = new Double(m.getStatistic(s));
          }
        }
      }
    }

    if (current != RESULT_SIZE + addm + m_numPluginStatistics) {
      throw new Error("Results didn't fit RESULT_SIZE");
    }

    m_Evaluation = eval;

=======
    if (current != RESULT_SIZE + addm) {
      throw new Error("Results didn't fit RESULT_SIZE");
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String classifierTipText() {
    return "The classifier to use.";
  }

  /**
   * Get the value of Classifier.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return Value of Classifier.
   */
  public Classifier getClassifier() {

    return m_Template;
  }

  /**
   * Sets the classifier.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newClassifier the new classifier to use.
   */
  public void setClassifier(Classifier newClassifier) {

    m_Template = newClassifier;
    updateOptions();

    System.err.println("RegressionSplitEvaluator: In set classifier");
  }

  /**
<<<<<<< HEAD
   * Returns whether the size determination (train/test/classifer) is skipped.
   *
   * @return true if size determination skipped
   */
  public boolean getNoSizeDetermination() {
    return m_NoSizeDetermination;
  }

  /**
   * Sets whether the size determination (train/test/classifer) is skipped.
   *
   * @param value true if to determine sizes
   */
  public void setNoSizeDetermination(boolean value) {
    m_NoSizeDetermination = value;
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String noSizeDeterminationTipText() {
    return "If enabled, the size determination for train/test/classifier is skipped.";
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Updates the options that the current classifier is using.
   */
  protected void updateOptions() {

    if (m_Template instanceof OptionHandler) {
      m_ClassifierOptions = Utils.joinOptions(((OptionHandler) m_Template)
        .getOptions());
    } else {
      m_ClassifierOptions = "";
    }
    if (m_Template instanceof Serializable) {
      ObjectStreamClass obs = ObjectStreamClass.lookup(m_Template.getClass());
      m_ClassifierVersion = "" + obs.getSerialVersionUID();
    } else {
      m_ClassifierVersion = "";
    }
  }

  /**
   * Set the Classifier to use, given it's class name. A new classifier will be
   * instantiated.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newClassifierName the Classifier class name.
   * @throws Exception if the class name is invalid.
   */
  public void setClassifierName(String newClassifierName) throws Exception {

    try {
      setClassifier((Classifier) Class.forName(newClassifierName).newInstance());
    } catch (Exception ex) {
      throw new Exception("Can't find Classifier with class name: "
        + newClassifierName);
    }
  }

  /**
   * Gets the raw output from the classifier
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the raw output from the classifier
   */
  @Override
  public String getRawResultOutput() {
    StringBuffer result = new StringBuffer();

    if (m_Classifier == null) {
      return "<null> classifier";
    }
    result.append(toString());
    result.append("Classifier model: \n" + m_Classifier.toString() + '\n');

    // append the performance statistics
    if (m_result != null) {
      result.append(m_result);

      if (m_doesProduce != null) {
        for (int i = 0; i < m_doesProduce.length; i++) {
          if (m_doesProduce[i]) {
            try {
              double dv = ((AdditionalMeasureProducer) m_Classifier)
                .getMeasure(m_AdditionalMeasures[i]);
<<<<<<< HEAD
              if (!Utils.isMissingValue(dv)) {
=======
              if (!Instance.isMissingValue(dv)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                Double value = new Double(dv);
                result.append(m_AdditionalMeasures[i] + " : " + value + '\n');
              } else {
                result.append(m_AdditionalMeasures[i] + " : " + '?' + '\n');
              }
            } catch (Exception ex) {
              System.err.println(ex);
            }
          }
        }
      }
    }
    return result.toString();
  }

  /**
   * Returns a text description of the split evaluator.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a text description of the split evaluator.
   */
  @Override
  public String toString() {

    String result = "RegressionSplitEvaluator: ";
    if (m_Template == null) {
      return result + "<null> classifier";
    }
    return result + m_Template.getClass().getName() + " " + m_ClassifierOptions
      + "(version " + m_ClassifierVersion + ")";
  }

  /**
   * Returns the revision string.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the revision
   */
  @Override
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 11323 $");
  }
}
=======
    return RevisionUtils.extract("$Revision: 11198 $");
  }
} // RegressionSplitEvaluator
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
