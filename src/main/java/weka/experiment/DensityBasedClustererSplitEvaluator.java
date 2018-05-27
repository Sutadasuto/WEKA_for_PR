/*
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
=======
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
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

/*
 *    DensityBasedClustererSplitEvaluator.java
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.experiment;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
<<<<<<< HEAD
=======
=======
import java.io.ObjectStreamClass;
import java.io.Serializable;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Vector;

import weka.clusterers.AbstractClusterer;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.DensityBasedClusterer;
import weka.clusterers.EM;
import weka.core.AdditionalMeasureProducer;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <!-- globalinfo-start --> A SplitEvaluator that produces results for a
 * density based clusterer.
 * <p/>
 * <!-- globalinfo-end -->
 *
 * <!-- options-start --> Valid options are:
 * <p/>
 *
 * <pre>
 * -no-size
 *  Skips the determination of sizes (train/test/clusterer)
 *  (default: sizes are determined)
 * </pre>
 *
 * <pre>
 * -W &lt;class name&gt;
 *  The full class name of the density based clusterer.
 *  eg: weka.clusterers.EM
 * </pre>
 *
 * <pre>
 * Options specific to clusterer weka.clusterers.EM:
 * </pre>
 *
 * <pre>
 * -N &lt;num&gt;
 *  number of clusters. If omitted or -1 specified, then
 *  cross validation is used to select the number of clusters.
 * </pre>
 *
 * <pre>
 * -I &lt;num&gt;
 *  max iterations.
 * (default 100)
 * </pre>
 *
 * <pre>
 * -V
 *  verbose.
 * </pre>
 *
 * <pre>
 * -M &lt;num&gt;
 *  minimum allowable standard deviation for normal density
 *  computation
 *  (default 1e-6)
 * </pre>
 *
 * <pre>
 * -O
 *  Display model in old format (good when there are many clusters)
 * </pre>
 *
 * <pre>
 * -S &lt;num&gt;
 *  Random number seed.
 *  (default 100)
 * </pre>
 *
 * <!-- options-end -->
 *
 * All options after -- will be passed to the clusterer.
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org
 * @version $Revision: 11323 $
 */

public class DensityBasedClustererSplitEvaluator implements SplitEvaluator,
  OptionHandler, AdditionalMeasureProducer, RevisionHandler {

  /** for serialization. */
  private static final long serialVersionUID = 5124501059135692160L;
<<<<<<< HEAD
=======
=======
 * A SplitEvaluator that produces results for a density based clusterer.
 * 
 * -W classname <br>
 * Specify the full class name of the clusterer to evaluate.
 * <p>
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org
 * @version $Revision: 11198 $
 */

public class DensityBasedClustererSplitEvaluator
  implements SplitEvaluator,
  OptionHandler,
  AdditionalMeasureProducer,
  RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Remove the class column (if set) from the data */
  protected boolean m_removeClassColumn = true;

  /** The clusterer used for evaluation */
  protected DensityBasedClusterer m_clusterer = new EM();

<<<<<<< HEAD
  /** Holds the most recently used ClusterEvaluation object */
  protected ClusterEvaluation m_Evaluation;

=======
<<<<<<< HEAD
  /** Holds the most recently used ClusterEvaluation object */
  protected ClusterEvaluation m_Evaluation;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The names of any additional measures to look for in SplitEvaluators */
  protected String[] m_additionalMeasures = null;

  /**
   * Array of booleans corresponding to the measures in m_AdditionalMeasures
   * indicating which of the AdditionalMeasures the current clusterer can
   * produce
   */
  protected boolean[] m_doesProduce = null;

  /**
   * The number of additional measures that need to be filled in after taking
   * into account column constraints imposed by the final destination for
   * results
   */
  protected int m_numberAdditionalMeasures = 0;

  /** Holds the statistics for the most recent application of the clusterer */
  protected String m_result = null;

  /** The clusterer options (if any) */
  protected String m_clustererOptions = "";

  /** The clusterer version */
  protected String m_clustererVersion = "";

<<<<<<< HEAD
  /** whether to skip determination of sizes (train/test/classifier). */
  protected boolean m_NoSizeDetermination;

=======
<<<<<<< HEAD
  /** whether to skip determination of sizes (train/test/classifier). */
  protected boolean m_NoSizeDetermination;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The length of a key */
  private static final int KEY_SIZE = 3;

  /** The length of a result */
<<<<<<< HEAD
  private static final int RESULT_SIZE = 9;
=======
<<<<<<< HEAD
  private static final int RESULT_SIZE = 9;
=======
  private static final int RESULT_SIZE = 6;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  public DensityBasedClustererSplitEvaluator() {
    updateOptions();
  }

  /**
   * Returns a string describing this split evaluator
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a description of the split evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return " A SplitEvaluator that produces results for a density based clusterer. ";
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(2);

    newVector.addElement(new Option(
      "\tSkips the determination of sizes (train/test/clusterer)\n"
        + "\t(default: sizes are determined)", "no-size", 0, "-no-size"));
    newVector.addElement(new Option(
      "\tThe full class name of the density based clusterer.\n"
        + "\teg: weka.clusterers.EM", "W", 1, "-W <class name>"));

    if ((m_clusterer != null) && (m_clusterer instanceof OptionHandler)) {
      newVector.addElement(new Option("", "", 0,
        "\nOptions specific to clusterer " + m_clusterer.getClass().getName()
          + ":"));
      newVector.addAll(Collections.list(((OptionHandler) m_clusterer)
        .listOptions()));
<<<<<<< HEAD
=======
=======
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration listOptions() {

    Vector newVector = new Vector(1);

    newVector.addElement(new Option(
      "\tThe full class name of the density based clusterer.\n"
        + "\teg: weka.clusterers.EM",
      "W", 1,
      "-W <class name>"));

    if ((m_clusterer != null) &&
      (m_clusterer instanceof OptionHandler)) {
      newVector.addElement(new Option(
        "",
        "", 0, "\nOptions specific to clusterer "
          + m_clusterer.getClass().getName() + ":"));
      Enumeration enu = ((OptionHandler) m_clusterer).listOptions();
      while (enu.hasMoreElements()) {
        newVector.addElement(enu.nextElement());
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return newVector.elements();
  }

  /**
   * Parses a given list of options. Valid options are:
   * <p>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * -W classname <br>
   * Specify the full class name of the clusterer to evaluate.
   * <p>
   *
   * All option after -- will be passed to the classifier.
   *
<<<<<<< HEAD
=======
=======
   * 
   * -W classname <br>
   * Specify the full class name of the clusterer to evaluate.
   * <p>
   * 
   * All option after -- will be passed to the classifier.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_NoSizeDetermination = Utils.getFlag("no-size", options);

    String cName = Utils.getOption('W', options);
    if (cName.length() == 0) {
      throw new Exception("A clusterer must be specified with"
        + " the -W option.");
    }
    // Do it first without options, so if an exception is thrown during
    // the option setting, listOptions will contain options for the actual
    // Classifier.
    setClusterer((DensityBasedClusterer) AbstractClusterer.forName(cName, null));
    if (getClusterer() instanceof OptionHandler) {
      ((OptionHandler) getClusterer()).setOptions(Utils
        .partitionOptions(options));
<<<<<<< HEAD
=======
=======

    String cName = Utils.getOption('W', options);
    if (cName.length() > 0) {

      // Do it first without options, so if an exception is thrown during
      // the option setting, listOptions will contain options for the actual
      // Classifier.
      setClusterer((DensityBasedClusterer) AbstractClusterer.forName(cName,
        null));
    }
    if (getClusterer() instanceof OptionHandler) {
      ((OptionHandler) getClusterer())
        .setOptions(Utils.partitionOptions(options));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      updateOptions();
    }
  }

  /**
   * Gets the current settings of the Classifier.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Vector<String> result;
    String[] clustererOptions;

    result = new Vector<String>();

    clustererOptions = new String[0];
    if ((m_clusterer != null) && (m_clusterer instanceof OptionHandler)) {
      clustererOptions = ((OptionHandler) m_clusterer).getOptions();
    }

    if (getClusterer() != null) {
      result.add("-W");
      result.add(getClusterer().getClass().getName());
    }

    if (getNoSizeDetermination()) {
      result.add("-no-size");
    }

    result.add("--");
    result.addAll(Arrays.asList(clustererOptions));

    return result.toArray(new String[result.size()]);
<<<<<<< HEAD
=======
=======

    String[] clustererOptions = new String[0];
    if ((m_clusterer != null) &&
      (m_clusterer instanceof OptionHandler)) {
      clustererOptions = ((OptionHandler) m_clusterer).getOptions();
    }

    String[] options = new String[clustererOptions.length + 3];
    int current = 0;

    if (getClusterer() != null) {
      options[current++] = "-W";
      options[current++] = getClusterer().getClass().getName();
    }

    options[current++] = "--";

    System.arraycopy(clustererOptions, 0, options, current,
      clustererOptions.length);
    current += clustererOptions.length;
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set a list of method names for additional measures to look for in
   * Classifiers. This could contain many measures (of which only a subset may
   * be produceable by the current Classifier) if an experiment is the type that
   * iterates over a set of properties.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param additionalMeasures a list of method names
   */
  @Override
  public void setAdditionalMeasures(String[] additionalMeasures) {
    // System.err.println("ClassifierSplitEvaluator: setting additional measures");
    m_additionalMeasures = additionalMeasures;

    // determine which (if any) of the additional measures this clusterer
    // can produce
    if (m_additionalMeasures != null && m_additionalMeasures.length > 0) {
      m_doesProduce = new boolean[m_additionalMeasures.length];

      if (m_clusterer instanceof AdditionalMeasureProducer) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        Enumeration<String> en = ((AdditionalMeasureProducer) m_clusterer)
          .enumerateMeasures();
        while (en.hasMoreElements()) {
          String mname = en.nextElement();
<<<<<<< HEAD
=======
=======
        Enumeration en = ((AdditionalMeasureProducer) m_clusterer).
          enumerateMeasures();
        while (en.hasMoreElements()) {
          String mname = (String) en.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          for (int j = 0; j < m_additionalMeasures.length; j++) {
            if (mname.compareToIgnoreCase(m_additionalMeasures[j]) == 0) {
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
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration<String> enumerateMeasures() {
    Vector<String> newVector = new Vector<String>();
    if (m_clusterer instanceof AdditionalMeasureProducer) {
      Enumeration<String> en = ((AdditionalMeasureProducer) m_clusterer)
        .enumerateMeasures();
      while (en.hasMoreElements()) {
        String mname = en.nextElement();
<<<<<<< HEAD
=======
=======
   * 
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration enumerateMeasures() {
    Vector newVector = new Vector();
    if (m_clusterer instanceof AdditionalMeasureProducer) {
      Enumeration en = ((AdditionalMeasureProducer) m_clusterer).
        enumerateMeasures();
      while (en.hasMoreElements()) {
        String mname = (String) en.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        newVector.addElement(mname);
      }
    }
    return newVector.elements();
  }

  /**
   * Returns the value of the named measure
<<<<<<< HEAD
   *
   * @param additionalMeasureName the name of the measure to query for its value
=======
<<<<<<< HEAD
   *
   * @param additionalMeasureName the name of the measure to query for its value
=======
   * 
   * @param measureName the name of the measure to query for its value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the value of the named measure
   * @exception IllegalArgumentException if the named measure is not supported
   */
  @Override
  public double getMeasure(String additionalMeasureName) {
    if (m_clusterer instanceof AdditionalMeasureProducer) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return ((AdditionalMeasureProducer) m_clusterer)
        .getMeasure(additionalMeasureName);
    } else {
      throw new IllegalArgumentException(
        "DensityBasedClustererSplitEvaluator: " + "Can't return value for : "
          + additionalMeasureName + ". " + m_clusterer.getClass().getName()
          + " " + "is not an AdditionalMeasureProducer");
<<<<<<< HEAD
=======
=======
      return ((AdditionalMeasureProducer) m_clusterer).
        getMeasure(additionalMeasureName);
    } else {
      throw new IllegalArgumentException(
        "DensityBasedClustererSplitEvaluator: "
          + "Can't return value for : " + additionalMeasureName
          + ". " + m_clusterer.getClass().getName() + " "
          + "is not an AdditionalMeasureProducer");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Gets the data types of each of the key columns produced for a single run.
   * The number of key fields must be constant for a given SplitEvaluator.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an array of objects containing the key.
   */
  @Override
  public Object[] getKey() {

    Object[] key = new Object[KEY_SIZE];
    key[0] = m_clusterer.getClass().getName();
    key[1] = m_clustererOptions;
    key[2] = m_clustererVersion;
    return key;
  }

  /**
   * Gets the data types of each of the result columns produced for a single
   * run. The number of result fields must be constant for a given
   * SplitEvaluator.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an array containing objects of the type of each result column. The
   *         objects should be Strings, or Doubles.
   */
  @Override
  public Object[] getResultTypes() {
<<<<<<< HEAD
    int addm = (m_additionalMeasures != null) ? m_additionalMeasures.length : 0;
=======
<<<<<<< HEAD
    int addm = (m_additionalMeasures != null) ? m_additionalMeasures.length : 0;
=======
    int addm = (m_additionalMeasures != null)
      ? m_additionalMeasures.length
      : 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int overall_length = RESULT_SIZE + addm;

    Object[] resultTypes = new Object[overall_length];
    Double doub = new Double(0);
    int current = 0;

    // number of training and testing instances
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

    // log liklihood
    resultTypes[current++] = doub;
    // number of clusters
    resultTypes[current++] = doub;

    // timing stats
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // sizes
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;
    resultTypes[current++] = doub;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // resultTypes[current++] = "";

    // add any additional measures
    for (int i = 0; i < addm; i++) {
      resultTypes[current++] = doub;
    }
    if (current != overall_length) {
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
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an array containing the name of each result column
   */
  @Override
  public String[] getResultNames() {
<<<<<<< HEAD
    int addm = (m_additionalMeasures != null) ? m_additionalMeasures.length : 0;
=======
<<<<<<< HEAD
    int addm = (m_additionalMeasures != null) ? m_additionalMeasures.length : 0;
=======
    int addm = (m_additionalMeasures != null)
      ? m_additionalMeasures.length
      : 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int overall_length = RESULT_SIZE + addm;

    String[] resultNames = new String[overall_length];
    int current = 0;
    resultNames[current++] = "Number_of_training_instances";
    resultNames[current++] = "Number_of_testing_instances";

    // Basic performance stats
    resultNames[current++] = "Log_likelihood";
    resultNames[current++] = "Number_of_clusters";

    // Timing stats
    resultNames[current++] = "Time_training";
    resultNames[current++] = "Time_testing";

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // sizes
    resultNames[current++] = "Serialized_Model_Size";
    resultNames[current++] = "Serialized_Train_Set_Size";
    resultNames[current++] = "Serialized_Test_Set_Size";

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // Classifier defined extras
    // resultNames[current++] = "Summary";
    // add any additional measures
    for (int i = 0; i < addm; i++) {
      resultNames[current++] = m_additionalMeasures[i];
    }
    if (current != overall_length) {
      throw new Error("ResultNames didn't fit RESULT_SIZE");
    }
    return resultNames;
  }

  /**
   * Gets the results for the supplied train and test datasets.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param train the training Instances.
   * @param test the testing Instances.
   * @return the results stored in an array. The objects stored in the array may
   *         be Strings, Doubles, or null (for the missing value).
   * @exception Exception if a problem occurs while getting the results
   */
  @Override
<<<<<<< HEAD
  public Object[] getResult(Instances train, Instances test) throws Exception {
=======
<<<<<<< HEAD
  public Object[] getResult(Instances train, Instances test) throws Exception {
=======
  public Object[] getResult(Instances train, Instances test)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_clusterer == null) {
      throw new Exception("No clusterer has been specified");
    }
<<<<<<< HEAD
    int addm = (m_additionalMeasures != null) ? m_additionalMeasures.length : 0;
=======
<<<<<<< HEAD
    int addm = (m_additionalMeasures != null) ? m_additionalMeasures.length : 0;
=======
    int addm = (m_additionalMeasures != null)
      ? m_additionalMeasures.length
      : 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int overall_length = RESULT_SIZE + addm;

    if (m_removeClassColumn && train.classIndex() != -1) {
      // remove the class column from the training and testing data
      Remove r = new Remove();
      r.setAttributeIndicesArray(new int[] { train.classIndex() });
      r.setInvertSelection(false);
      r.setInputFormat(train);
      train = Filter.useFilter(train, r);

      test = Filter.useFilter(test, r);
    }
    train.setClassIndex(-1);
    test.setClassIndex(-1);

    ClusterEvaluation eval = new ClusterEvaluation();

    Object[] result = new Object[overall_length];
    long trainTimeStart = System.currentTimeMillis();
    m_clusterer.buildClusterer(train);
    double numClusters = m_clusterer.numberOfClusters();
    eval.setClusterer(m_clusterer);
    long trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;
    long testTimeStart = System.currentTimeMillis();
    eval.evaluateClusterer(test);
    long testTimeElapsed = System.currentTimeMillis() - testTimeStart;
    // m_result = eval.toSummaryString();

    // The results stored are all per instance -- can be multiplied by the
    // number of instances to get absolute numbers
    int current = 0;
    result[current++] = new Double(train.numInstances());
    result[current++] = new Double(test.numInstances());

    result[current++] = new Double(eval.getLogLikelihood());
    result[current++] = new Double(numClusters);

    // Timing stats
    result[current++] = new Double(trainTimeElapsed / 1000.0);
    result[current++] = new Double(testTimeElapsed / 1000.0);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // sizes
    if (m_NoSizeDetermination) {
      result[current++] = -1.0;
      result[current++] = -1.0;
      result[current++] = -1.0;
    } else {
      ByteArrayOutputStream bastream = new ByteArrayOutputStream();
      ObjectOutputStream oostream = new ObjectOutputStream(bastream);
      oostream.writeObject(m_clusterer);
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

    for (int i = 0; i < addm; i++) {
      if (m_doesProduce[i]) {
        try {
          double dv = ((AdditionalMeasureProducer) m_clusterer)
            .getMeasure(m_additionalMeasures[i]);
<<<<<<< HEAD
=======
=======
    for (int i = 0; i < addm; i++) {
      if (m_doesProduce[i]) {
        try {
          double dv = ((AdditionalMeasureProducer) m_clusterer).
            getMeasure(m_additionalMeasures[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          Double value = new Double(dv);

          result[current++] = value;
        } catch (Exception ex) {
          System.err.println(ex);
        }
      } else {
        result[current++] = null;
      }
    }

    if (current != overall_length) {
      throw new Error("Results didn't fit RESULT_SIZE");
    }
<<<<<<< HEAD

    m_Evaluation = eval;

=======
<<<<<<< HEAD

    m_Evaluation = eval;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String removeClassColumnTipText() {
    return "Remove the class column (if set) from the data.";
  }

  /**
   * Set whether the class column should be removed from the data.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r true if the class column is to be removed.
   */
  public void setRemoveClassColumn(boolean r) {
    m_removeClassColumn = r;
  }

  /**
   * Get whether the class column is to be removed.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if the class column is to be removed.
   */
  public boolean getRemoveClassColumn() {
    return m_removeClassColumn;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String clustererTipText() {
    return "The density based clusterer to use.";
  }

  /**
   * Get the value of clusterer
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return Value of clusterer.
   */
  public DensityBasedClusterer getClusterer() {

    return m_clusterer;
  }

  /**
   * Sets the clusterer.
<<<<<<< HEAD
   *
   * @param newClusterer the new clusterer to use.
=======
<<<<<<< HEAD
   *
   * @param newClusterer the new clusterer to use.
=======
   * 
   * @param newClassifier the new clusterer to use.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setClusterer(DensityBasedClusterer newClusterer) {

    m_clusterer = newClusterer;
    updateOptions();
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns whether the size determination (train/test/clusterer) is skipped.
   *
   * @return true if size determination skipped
   */
  public boolean getNoSizeDetermination() {
    return m_NoSizeDetermination;
  }

  /**
   * Sets whether the size determination (train/test/clusterer) is skipped.
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
    return "If enabled, the size determination for train/test/clusterer is skipped.";
  }

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected void updateOptions() {

    if (m_clusterer instanceof OptionHandler) {
      m_clustererOptions = Utils.joinOptions(((OptionHandler) m_clusterer)
        .getOptions());
    } else {
      m_clustererOptions = "";
    }
    if (m_clusterer instanceof Serializable) {
<<<<<<< HEAD
      ObjectStreamClass obs = ObjectStreamClass.lookup(m_clusterer.getClass());
=======
<<<<<<< HEAD
      ObjectStreamClass obs = ObjectStreamClass.lookup(m_clusterer.getClass());
=======
      ObjectStreamClass obs = ObjectStreamClass.lookup(m_clusterer
        .getClass());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_clustererVersion = "" + obs.getSerialVersionUID();
    } else {
      m_clustererVersion = "";
    }
  }

  /**
   * Set the Clusterer to use, given it's class name. A new clusterer will be
   * instantiated.
<<<<<<< HEAD
   *
   * @param newClustererName the clusterer class name.
=======
<<<<<<< HEAD
   *
   * @param newClustererName the clusterer class name.
=======
   * 
   * @param newClusterer the Classifier class name.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @exception Exception if the class name is invalid.
   */
  public void setClustererName(String newClustererName) throws Exception {

    try {
      setClusterer((DensityBasedClusterer) Class.forName(newClustererName)
        .newInstance());
    } catch (Exception ex) {
      throw new Exception("Can't find Clusterer with class name: "
        + newClustererName);
    }
  }

  /**
   * Gets the raw output from the classifier
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the raw output from the classifier
   */
  @Override
  public String getRawResultOutput() {
    StringBuffer result = new StringBuffer();

    if (m_clusterer == null) {
      return "<null> clusterer";
    }
    result.append(toString());
    result.append("Clustering model: \n" + m_clusterer.toString() + '\n');

    // append the performance statistics
    if (m_result != null) {
      // result.append(m_result);

      if (m_doesProduce != null) {
        for (int i = 0; i < m_doesProduce.length; i++) {
          if (m_doesProduce[i]) {
            try {
<<<<<<< HEAD
              double dv = ((AdditionalMeasureProducer) m_clusterer)
                .getMeasure(m_additionalMeasures[i]);
=======
<<<<<<< HEAD
              double dv = ((AdditionalMeasureProducer) m_clusterer)
                .getMeasure(m_additionalMeasures[i]);
=======
              double dv = ((AdditionalMeasureProducer) m_clusterer).
                getMeasure(m_additionalMeasures[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              Double value = new Double(dv);

              result.append(m_additionalMeasures[i] + " : " + value + '\n');
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
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a text description of the split evaluator.
   */
  @Override
  public String toString() {

    String result = "DensityBasedClustererSplitEvaluator: ";
    if (m_clusterer == null) {
      return result + "<null> clusterer";
    }
<<<<<<< HEAD
    return result + m_clusterer.getClass().getName() + " " + m_clustererOptions
      + "(version " + m_clustererVersion + ")";
=======
<<<<<<< HEAD
    return result + m_clusterer.getClass().getName() + " " + m_clustererOptions
      + "(version " + m_clustererVersion + ")";
=======
    return result + m_clusterer.getClass().getName() + " "
      + m_clustererOptions + "(version " + m_clustererVersion + ")";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the revision string.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the revision
   */
  @Override
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 11323 $");
=======
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 11323 $");
=======
    return RevisionUtils.extract("$Revision: 11198 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
