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
 *    RandomForest.java
<<<<<<< HEAD
 *    Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2001 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.trees;

<<<<<<< HEAD
import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.meta.Bagging;
import weka.core.Capabilities;
import weka.core.Option;
import weka.core.OptionHandler;
=======
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.Classifier;
import weka.classifiers.meta.Bagging;
import weka.core.AdditionalMeasureProducer;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Randomizable;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
<<<<<<< HEAD
import weka.core.Utils;
import weka.core.WekaException;
import weka.gui.ProgrammaticProperty;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * <!-- globalinfo-start --> Class for constructing a forest of random trees.<br>
 * <br>
 * For more information see: <br>
 * <br>
 * Leo Breiman (2001). Random Forests. Machine Learning. 45(1):5-32. <br>
 * <br>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;

/**
 <!-- globalinfo-start --> 
 * Class for constructing a forest of random trees.<br/>
 * <br/>
 * For more information see: <br/>
 * <br/>
 * Leo Breiman (2001). Random Forests. Machine Learning. 45(1):5-32.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- technical-bibtex-start --> 
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * 
 * <pre>
 * &#64;article{Breiman2001,
 *    author = {Leo Breiman},
 *    journal = {Machine Learning},
 *    number = {1},
 *    pages = {5-32},
 *    title = {Random Forests},
 *    volume = {45},
 *    year = {2001}
 * }
 * </pre>
<<<<<<< HEAD
 * 
 * <br>
 * <br>
 * <!-- technical-bibtex-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p>
 * 
 * <pre>
 * -P
 *  Size of each bag, as a percentage of the
 *  training set size. (default 100)
 * </pre>
 * 
 * <pre>
 * -O
 *  Calculate the out of bag error.
 * </pre>
 * 
 * <pre>
 * -store-out-of-bag-predictions
 *  Whether to store out of bag predictions in internal evaluation object.
 * </pre>
 * 
 * <pre>
 * -output-out-of-bag-complexity-statistics
 *  Whether to output complexity-based statistics when out-of-bag evaluation is performed.
 * </pre>
 * 
 * <pre>
 * -print
 *  Print the individual classifiers in the output
 * </pre>
 * 
 * <pre>
 * -attribute-importance
 *  Compute and output attribute importance (mean impurity decrease method)
 * </pre>
 * 
 * <pre>
 * -I &lt;num&gt;
 *  Number of iterations.
 *  (current value 100)
 * </pre>
 * 
 * <pre>
 * -num-slots &lt;num&gt;
 *  Number of execution slots.
 *  (default 1 - i.e. no parallelism)
 *  (use 0 to auto-detect number of cores)
 * </pre>
 * 
 * <pre>
 * -K &lt;number of attributes&gt;
 *  Number of attributes to randomly investigate. (default 0)
 *  (&lt;1 = int(log_2(#predictors)+1)).
 * </pre>
 * 
 * <pre>
 * -M &lt;minimum number of instances&gt;
 *  Set minimum number of instances per leaf.
 *  (default 1)
 * </pre>
 * 
 * <pre>
 * -V &lt;minimum variance for split&gt;
 *  Set minimum numeric class variance proportion
 *  of train variance for split (default 1e-3).
 * </pre>
 * 
 * <pre>
 * -S &lt;num&gt;
=======
 * <p/>
 <!-- technical-bibtex-end -->
 * 
 <!-- options-start --> 
 * Valid options are:
 * <p/>
 * 
 * <pre>
 * -I &lt;number of trees&gt;
 *  Number of trees to build.
 * </pre>
 * 
 * <pre>
 * -K &lt;number of features&gt;
 *  Number of features to consider (&lt;0 = int(log_2(#predictors)+1)).
 * </pre>
 * 
 * <pre>
 * -S
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *  Seed for random number generator.
 *  (default 1)
 * </pre>
 * 
 * <pre>
 * -depth &lt;num&gt;
<<<<<<< HEAD
 *  The maximum depth of the tree, 0 for unlimited.
=======
 *  The maximum depth of the trees, 0 for unlimited.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *  (default 0)
 * </pre>
 * 
 * <pre>
<<<<<<< HEAD
 * -N &lt;num&gt;
 *  Number of folds for backfitting (default 0, no backfitting).
 * </pre>
 * 
 * <pre>
 * -U
 *  Allow unclassified instances.
 * </pre>
 * 
 * <pre>
 * -B
 *  Break ties randomly when several attributes look equally good.
 * </pre>
 * 
 * <pre>
 * -output-debug-info
=======
 * -D
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
 * 
<<<<<<< HEAD
 * <pre>
 * -do-not-check-capabilities
 *  If set, classifier capabilities are not checked before classifier is built
 *  (use with caution).
 * </pre>
 * 
 * <pre>
 * -num-decimal-places
 *  The number of decimal places for the output of numbers in the model (default 2).
 * </pre>
 * 
 * <pre>
 * -batch-size
 *  The desired batch size for batch prediction  (default 100).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 13295 $
 */
public class RandomForest extends Bagging {

  /** for serialization */
  static final long serialVersionUID = 1116839470751428698L;

  /** True to compute attribute importance */
  protected boolean m_computeAttributeImportance;

  /**
   * The default number of iterations to perform.
   */
  @Override
  protected int defaultNumberOfIterations() {
    return 100;
  }

  /**
   * Constructor that sets base classifier for bagging to RandomTre and default
   * number of iterations to 100.
   */
  public RandomForest() {

    RandomTree rTree = new RandomTree();
    rTree.setDoNotCheckCapabilities(true);
    super.setClassifier(rTree);
    super.setRepresentCopiesUsingWeights(true);
    setNumIterations(defaultNumberOfIterations());
  }

  /**
   * Returns default capabilities of the base classifier.
   *
   * @return the capabilities of the base classifier
   */
  public Capabilities getCapabilities() {

    // Cannot use the main RandomTree object because capabilities checking has
    // been turned off
    // for that object.
    return (new RandomTree()).getCapabilities();
  }

  /**
   * String describing default classifier.
   *
   * @return the default classifier classname
   */
  @Override
  protected String defaultClassifierString() {

    return "weka.classifiers.trees.RandomTree";
  }

  /**
   * String describing default classifier options.
   *
   * @return the default classifier options
   */
  @Override
  protected String[] defaultClassifierOptions() {

    String[] args = { "-do-not-check-capabilities" };
    return args;
  }
=======
 <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 1.13 $
 */
public class RandomForest extends Classifier implements OptionHandler,
    Randomizable, WeightedInstancesHandler, AdditionalMeasureProducer,
    TechnicalInformationHandler {

  /** for serialization */
  private static final long serialVersionUID = -2260823972777004705L;

  /** Number of trees in forest. */
  protected int m_numTrees = 100;

  /**
   * Number of features to consider in random feature selection. If less than 1
   * will use int(logM+1) )
   */
  protected int m_numFeatures = 0;

  /** The random seed. */
  protected int m_randomSeed = 1;

  /** Final number of features that were considered in last build. */
  protected int m_KValue = 0;

  /** The bagger. */
  protected Bagging m_bagger = null;

  /** The maximum depth of the trees (0 = unlimited) */
  protected int m_MaxDepth = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Returns a string describing classifier
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  public String globalInfo() {

    return "Class for constructing a forest of random trees.\n\n"
<<<<<<< HEAD
      + "For more information see: \n\n" + getTechnicalInformation().toString();
=======
        + "For more information see: \n\n"
        + getTechnicalInformation().toString();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;

    result = new TechnicalInformation(Type.ARTICLE);
    result.setValue(Field.AUTHOR, "Leo Breiman");
    result.setValue(Field.YEAR, "2001");
    result.setValue(Field.TITLE, "Random Forests");
    result.setValue(Field.JOURNAL, "Machine Learning");
    result.setValue(Field.VOLUME, "45");
    result.setValue(Field.NUMBER, "1");
    result.setValue(Field.PAGES, "5-32");

    return result;
  }

  /**
<<<<<<< HEAD
   * This method only accepts RandomTree arguments.
   *
   * @param newClassifier the RandomTree to use.
   * @exception if argument is not a RandomTree
   */
  @Override
  @ProgrammaticProperty
  public void setClassifier(Classifier newClassifier) {
    if (!(newClassifier instanceof RandomTree)) {
      throw new IllegalArgumentException(
        "RandomForest: Argument of setClassifier() must be a RandomTree.");
    }
    super.setClassifier(newClassifier);
  }

  /**
   * This method only accepts true as its argument
   *
   * @param representUsingWeights must be set to true.
   * @exception if argument is not true
   */
  @Override
  @ProgrammaticProperty
  public void setRepresentCopiesUsingWeights(boolean representUsingWeights) {
    if (!representUsingWeights) {
      throw new IllegalArgumentException(
        "RandomForest: Argument of setRepresentCopiesUsingWeights() must be true.");
    }
    super.setRepresentCopiesUsingWeights(representUsingWeights);
=======
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numTreesTipText() {
    return "The number of trees to be generated.";
  }

  /**
   * Get the value of numTrees.
   * 
   * @return Value of numTrees.
   */
  public int getNumTrees() {

    return m_numTrees;
  }

  /**
   * Set the value of numTrees.
   * 
   * @param newNumTrees Value to assign to numTrees.
   */
  public void setNumTrees(int newNumTrees) {

    m_numTrees = newNumTrees;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
  public String numFeaturesTipText() {
<<<<<<< HEAD
    return ((RandomTree) getClassifier()).KValueTipText();
=======
    return "The number of attributes to be used in random selection (see RandomTree).";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Get the number of features used in random selection.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return Value of numFeatures.
   */
  public int getNumFeatures() {

<<<<<<< HEAD
    return ((RandomTree) getClassifier()).getKValue();
=======
    return m_numFeatures;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set the number of features to use in random selection.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newNumFeatures Value to assign to numFeatures.
   */
  public void setNumFeatures(int newNumFeatures) {

<<<<<<< HEAD
    ((RandomTree) getClassifier()).setKValue(newNumFeatures);
=======
    m_numFeatures = newNumFeatures;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String computeAttributeImportanceTipText() {
    return "Compute attribute importance via mean impurity decrease";
  }

  /**
   * Set whether to compute and output attribute importance scores
   *
   * @param computeAttributeImportance true to compute attribute importance
   *          scores
   */
  public void setComputeAttributeImportance(boolean computeAttributeImportance) {
    m_computeAttributeImportance = computeAttributeImportance;
    ((RandomTree)m_Classifier).setComputeImpurityDecreases(computeAttributeImportance);
  }

  /**
   * Get whether to compute and output attribute importance scores
   *
   * @return true if computing attribute importance scores
   */
  public boolean getComputeAttributeImportance() {
    return m_computeAttributeImportance;
=======
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String seedTipText() {
    return "The random number seed to be used.";
  }

  /**
   * Set the seed for random number generation.
   * 
   * @param seed the seed
   */
  public void setSeed(int seed) {

    m_randomSeed = seed;
  }

  /**
   * Gets the seed for the random number generations
   * 
   * @return the seed for the random number generation
   */
  public int getSeed() {

    return m_randomSeed;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
  public String maxDepthTipText() {
<<<<<<< HEAD
    return ((RandomTree) getClassifier()).maxDepthTipText();
=======
    return "The maximum depth of the trees, 0 for unlimited.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Get the maximum depth of trh tree, 0 for unlimited.
<<<<<<< HEAD
   *
   * @return the maximum depth.
   */
  public int getMaxDepth() {
    return ((RandomTree) getClassifier()).getMaxDepth();
=======
   * 
   * @return the maximum depth.
   */
  public int getMaxDepth() {
    return m_MaxDepth;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set the maximum depth of the tree, 0 for unlimited.
<<<<<<< HEAD
   *
   * @param value the maximum depth.
   */
  public void setMaxDepth(int value) {
    ((RandomTree) getClassifier()).setMaxDepth(value);
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String breakTiesRandomlyTipText() {
    return ((RandomTree) getClassifier()).breakTiesRandomlyTipText();
  }

  /**
   * Get whether to break ties randomly.
   *
   * @return true if ties are to be broken randomly.
   */
  public boolean getBreakTiesRandomly() {

    return ((RandomTree) getClassifier()).getBreakTiesRandomly();
  }

  /**
   * Set whether to break ties randomly.
   *
   * @param newBreakTiesRandomly true if ties are to be broken randomly
   */
  public void setBreakTiesRandomly(boolean newBreakTiesRandomly) {

    ((RandomTree) getClassifier()).setBreakTiesRandomly(newBreakTiesRandomly);
  }

  /**
   * Set debugging mode.
   *
   * @param debug true if debug output should be printed
   */
  public void setDebug(boolean debug) {

    super.setDebug(debug);
    ((RandomTree) getClassifier()).setDebug(debug);
  }

  /**
   * Set the number of decimal places.
   */
  public void setNumDecimalPlaces(int num) {

    super.setNumDecimalPlaces(num);
    ((RandomTree) getClassifier()).setNumDecimalPlaces(num);
  }

  /**
   * Set the preferred batch size for batch prediction.
   *
   * @param size the batch size to use
   */
  @Override
  public void setBatchSize(String size) {

    super.setBatchSize(size);
    ((RandomTree) getClassifier()).setBatchSize(size);
  }

  /**
   * Sets the seed for the random number generator.
   *
   * @param s the seed to be used
   */
  public void setSeed(int s) {

    super.setSeed(s);
    ((RandomTree) getClassifier()).setSeed(s);
  }

  /**
   * Returns description of the bagged classifier.
   *
   * @return description of the bagged classifier as a string
   */
  @Override
  public String toString() {

    if (m_Classifiers == null) {
      return "RandomForest: No model built yet.";
    }
    StringBuilder buffer = new StringBuilder("RandomForest\n\n");
    buffer.append(super.toString());

    if (getComputeAttributeImportance()) {
      try {
        double[] nodeCounts = new double[m_data.numAttributes()];
        double[] impurityScores =
          computeAverageImpurityDecreasePerAttribute(nodeCounts);
        int[] sortedIndices = Utils.sort(impurityScores);
        buffer
          .append("\n\nAttribute importance based on average impurity decrease "
            + "(and number of nodes using that attribute)\n\n");
        for (int i = sortedIndices.length - 1; i >= 0; i--) {
          int index = sortedIndices[i];
          if (index != m_data.classIndex()) {
            buffer
              .append(
                Utils.doubleToString(impurityScores[index], 10,
                  getNumDecimalPlaces())).append(" (")
              .append(Utils.doubleToString(nodeCounts[index], 6, 0))
              .append(")  ").append(m_data.attribute(index).name())
              .append("\n");
          }
        }
      } catch (WekaException ex) {
        // ignore
      }
    }

    return buffer.toString();
  }

  /**
   * Computes the average impurity decrease per attribute over the trees
   *
   * @param nodeCounts an optional array that, if non-null, will hold the count
   *          of the number of nodes at which each attribute was used for
   *          splitting
   * @return the average impurity decrease per attribute over the trees
   */
  public double[] computeAverageImpurityDecreasePerAttribute(
    double[] nodeCounts) throws WekaException {

    if (m_Classifiers == null) {
      throw new WekaException("Classifier has not been built yet!");
    }

    if (!getComputeAttributeImportance()) {
      throw new WekaException("Stats for attribute importance have not "
        + "been collected!");
    }

    double[] impurityDecreases = new double[m_data.numAttributes()];
    if (nodeCounts == null) {
      nodeCounts = new double[m_data.numAttributes()];
    }
    for (Classifier c : m_Classifiers) {
      double[][] forClassifier = ((RandomTree) c).getImpurityDecreases();
      for (int i = 0; i < m_data.numAttributes(); i++) {
        impurityDecreases[i] += forClassifier[i][0];
        nodeCounts[i] += forClassifier[i][1];
      }
    }
    for (int i = 0; i < m_data.numAttributes(); i++) {
      if (nodeCounts[i] > 0) {
        impurityDecreases[i] /= nodeCounts[i];
      }
    }

    return impurityDecreases;
=======
   * 
   * @param value the maximum depth.
   */
  public void setMaxDepth(int value) {
    m_MaxDepth = value;
  }

  /**
   * Gets the out of bag error that was calculated as the classifier was built.
   * 
   * @return the out of bag error
   */
  public double measureOutOfBagError() {

    if (m_bagger != null) {
      return m_bagger.measureOutOfBagError();
    } else
      return Double.NaN;
  }

  /**
   * Returns an enumeration of the additional measure names.
   * 
   * @return an enumeration of the measure names
   */
  public Enumeration enumerateMeasures() {

    Vector newVector = new Vector(1);
    newVector.addElement("measureOutOfBagError");
    return newVector.elements();
  }

  /**
   * Returns the value of the named measure.
   * 
   * @param additionalMeasureName the name of the measure to query for its value
   * @return the value of the named measure
   * @throws IllegalArgumentException if the named measure is not supported
   */
  public double getMeasure(String additionalMeasureName) {

    if (additionalMeasureName.equalsIgnoreCase("measureOutOfBagError")) {
      return measureOutOfBagError();
    } else {
      throw new IllegalArgumentException(additionalMeasureName
          + " not supported (RandomForest)");
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options
   */
  @Override
<<<<<<< HEAD
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>();

    newVector.addElement(new Option(
      "\tSize of each bag, as a percentage of the\n"
        + "\ttraining set size. (default 100)", "P", 1, "-P"));

    newVector.addElement(new Option("\tCalculate the out of bag error.", "O",
      0, "-O"));

    newVector
      .addElement(new Option(
        "\tWhether to store out of bag predictions in internal evaluation object.",
        "store-out-of-bag-predictions", 0, "-store-out-of-bag-predictions"));

    newVector
      .addElement(new Option(
        "\tWhether to output complexity-based statistics when out-of-bag evaluation is performed.",
        "output-out-of-bag-complexity-statistics", 0,
        "-output-out-of-bag-complexity-statistics"));

    newVector
      .addElement(new Option(
        "\tPrint the individual classifiers in the output", "print", 0,
        "-print"));

    newVector.addElement(new Option(
      "\tCompute and output attribute importance (mean impurity decrease "
        + "method)", "attribute-importance", 0, "-attribute-importance"));

    newVector.addElement(new Option("\tNumber of iterations.\n"
      + "\t(current value " + getNumIterations() + ")", "I", 1, "-I <num>"));

    newVector.addElement(new Option("\tNumber of execution slots.\n"
      + "\t(default 1 - i.e. no parallelism)\n"
      + "\t(use 0 to auto-detect number of cores)", "num-slots", 1,
      "-num-slots <num>"));

    // Add base classifier options
    List<Option> list =
      Collections.list(((OptionHandler) getClassifier()).listOptions());
    newVector.addAll(list);
=======
  public Enumeration listOptions() {

    Vector newVector = new Vector();

    newVector.addElement(new Option("\tNumber of trees to build.\n\t(default 100)", "I", 1,
        "-I <number of trees>"));

    newVector.addElement(new Option(
      "\tNumber of features to consider (<1=int(log_2(#predictors)+1)).\n\t(default 0)", "K", 1,
      "-K <number of features>"));

    newVector.addElement(new Option("\tSeed for random number generator.\n"
        + "\t(default 1)", "S", 1, "-S"));

    newVector.addElement(new Option(
        "\tThe maximum depth of the trees, 0 for unlimited.\n"
            + "\t(default 0)", "depth", 1, "-depth <num>"));

    Enumeration enu = super.listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newVector.elements();
  }

  /**
   * Gets the current settings of the forest.
   * 
   * @return an array of strings suitable for passing to setOptions()
   */
  @Override
  public String[] getOptions() {
<<<<<<< HEAD
    Vector<String> result = new Vector<String>();

    result.add("-P");
    result.add("" + getBagSizePercent());

    if (getCalcOutOfBag()) {
      result.add("-O");
    }

    if (getStoreOutOfBagPredictions()) {
      result.add("-store-out-of-bag-predictions");
    }

    if (getOutputOutOfBagComplexityStatistics()) {
      result.add("-output-out-of-bag-complexity-statistics");
    }

    if (getPrintClassifiers()) {
      result.add("-print");
    }

    if (getComputeAttributeImportance()) {
      result.add("-attribute-importance");
    }

    result.add("-I");
    result.add("" + getNumIterations());

    result.add("-num-slots");
    result.add("" + getNumExecutionSlots());

    if (getDoNotCheckCapabilities()) {
      result.add("-do-not-check-capabilities");
    }

    // Add base classifier options
    Vector<String> classifierOptions = new Vector<String>();
    Collections.addAll(classifierOptions,
      ((OptionHandler) getClassifier()).getOptions());
    Option.deleteFlagString(classifierOptions, "-do-not-check-capabilities");
    result.addAll(classifierOptions);

    return result.toArray(new String[result.size()]);
=======
    Vector result;
    String[] options;
    int i;

    result = new Vector();

    result.add("-I");
    result.add("" + getNumTrees());

    result.add("-K");
    result.add("" + getNumFeatures());

    result.add("-S");
    result.add("" + getSeed());

    if (getMaxDepth() > 0) {
      result.add("-depth");
      result.add("" + getMaxDepth());
    }

    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
<<<<<<< HEAD
   * <!-- options-start --> Valid options are:
   * <p>
   * 
   * <pre>
   * -P
   *  Size of each bag, as a percentage of the
   *  training set size. (default 100)
   * </pre>
   * 
   * <pre>
   * -O
   *  Calculate the out of bag error.
   * </pre>
   * 
   * <pre>
   * -store-out-of-bag-predictions
   *  Whether to store out of bag predictions in internal evaluation object.
   * </pre>
   * 
   * <pre>
   * -output-out-of-bag-complexity-statistics
   *  Whether to output complexity-based statistics when out-of-bag evaluation is performed.
   * </pre>
   * 
   * <pre>
   * -print
   *  Print the individual classifiers in the output
   * </pre>
   * 
   * <pre>
   * -attribute-importance
   *  Compute and output attribute importance (mean impurity decrease method)
   * </pre>
   * 
   * <pre>
   * -I &lt;num&gt;
   *  Number of iterations.
   *  (current value 100)
   * </pre>
   * 
   * <pre>
   * -num-slots &lt;num&gt;
   *  Number of execution slots.
   *  (default 1 - i.e. no parallelism)
   *  (use 0 to auto-detect number of cores)
   * </pre>
   * 
   * <pre>
   * -K &lt;number of attributes&gt;
   *  Number of attributes to randomly investigate. (default 0)
   *  (&lt;1 = int(log_2(#predictors)+1)).
   * </pre>
   * 
   * <pre>
   * -M &lt;minimum number of instances&gt;
   *  Set minimum number of instances per leaf.
   *  (default 1)
   * </pre>
   * 
   * <pre>
   * -V &lt;minimum variance for split&gt;
   *  Set minimum numeric class variance proportion
   *  of train variance for split (default 1e-3).
   * </pre>
   * 
   * <pre>
   * -S &lt;num&gt;
=======
   <!-- options-start --> 
   * Valid options are:
   * <p/>
   * 
   * <pre>
   * -I &lt;number of trees&gt;
   *  Number of trees to build.
   * </pre>
   * 
   * <pre>
   * -K &lt;number of features&gt;
   *  Number of features to consider (&lt;0 = int(log_2(#predictors)+1)).
   * </pre>
   * 
   * <pre>
   * -S
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  Seed for random number generator.
   *  (default 1)
   * </pre>
   * 
   * <pre>
   * -depth &lt;num&gt;
<<<<<<< HEAD
   *  The maximum depth of the tree, 0 for unlimited.
=======
   *  The maximum depth of the trees, 0 for unlimited.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  (default 0)
   * </pre>
   * 
   * <pre>
<<<<<<< HEAD
   * -N &lt;num&gt;
   *  Number of folds for backfitting (default 0, no backfitting).
   * </pre>
   * 
   * <pre>
   * -U
   *  Allow unclassified instances.
   * </pre>
   * 
   * <pre>
   * -B
   *  Break ties randomly when several attributes look equally good.
   * </pre>
   * 
   * <pre>
   * -output-debug-info
=======
   * -D
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console
   * </pre>
   * 
<<<<<<< HEAD
   * <pre>
   * -do-not-check-capabilities
   *  If set, classifier capabilities are not checked before classifier is built
   *  (use with caution).
   * </pre>
   * 
   * <pre>
   * -num-decimal-places
   *  The number of decimal places for the output of numbers in the model (default 2).
   * </pre>
   * 
   * <pre>
   * -batch-size
   *  The desired batch size for batch prediction  (default 100).
   * </pre>
   * 
   * <!-- options-end -->
=======
   <!-- options-end -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
<<<<<<< HEAD

    String bagSize = Utils.getOption('P', options);
    if (bagSize.length() != 0) {
      setBagSizePercent(Integer.parseInt(bagSize));
    } else {
      setBagSizePercent(100);
    }

    setCalcOutOfBag(Utils.getFlag('O', options));

    setStoreOutOfBagPredictions(Utils.getFlag("store-out-of-bag-predictions",
      options));

    setOutputOutOfBagComplexityStatistics(Utils.getFlag(
      "output-out-of-bag-complexity-statistics", options));

    setPrintClassifiers(Utils.getFlag("print", options));

    setComputeAttributeImportance(Utils
      .getFlag("attribute-importance", options));

    String iterations = Utils.getOption('I', options);
    if (iterations.length() != 0) {
      setNumIterations(Integer.parseInt(iterations));
    } else {
      setNumIterations(defaultNumberOfIterations());
    }

    String numSlots = Utils.getOption("num-slots", options);
    if (numSlots.length() != 0) {
      setNumExecutionSlots(Integer.parseInt(numSlots));
    } else {
      setNumExecutionSlots(1);
    }

    RandomTree classifier =
      ((RandomTree) AbstractClassifier.forName(defaultClassifierString(),
        options));
    classifier.setComputeImpurityDecreases(m_computeAttributeImportance);
    setDoNotCheckCapabilities(classifier.getDoNotCheckCapabilities());
    setSeed(classifier.getSeed());
    setDebug(classifier.getDebug());
    setNumDecimalPlaces(classifier.getNumDecimalPlaces());
    setBatchSize(classifier.getBatchSize());
    classifier.setDoNotCheckCapabilities(true);

    // Set base classifier and options
    setClassifier(classifier);
=======
    String tmpStr;

    tmpStr = Utils.getOption('I', options);
    if (tmpStr.length() != 0) {
      m_numTrees = Integer.parseInt(tmpStr);
    } else {
      m_numTrees = 100;
    }

    tmpStr = Utils.getOption('K', options);
    if (tmpStr.length() != 0) {
      m_numFeatures = Integer.parseInt(tmpStr);
    } else {
      m_numFeatures = 0;
    }

    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0) {
      setSeed(Integer.parseInt(tmpStr));
    } else {
      setSeed(1);
    }

    tmpStr = Utils.getOption("depth", options);
    if (tmpStr.length() != 0) {
      setMaxDepth(Integer.parseInt(tmpStr));
    } else {
      setMaxDepth(0);
    }

    super.setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    Utils.checkForRemainingOptions(options);
  }

  /**
<<<<<<< HEAD
=======
   * Returns default capabilities of the classifier.
   * 
   * @return the capabilities of this classifier
   */
  @Override
  public Capabilities getCapabilities() {
    return new RandomTree().getCapabilities();
  }

  /**
   * Builds a classifier for a set of instances.
   * 
   * @param data the instances to train the classifier with
   * @throws Exception if something goes wrong
   */
  @Override
  public void buildClassifier(Instances data) throws Exception {

    // can classifier handle the data?
    getCapabilities().testWithFail(data);

    // remove instances with missing class
    data = new Instances(data);
    data.deleteWithMissingClass();

    m_bagger = new Bagging();
    RandomTree rTree = new RandomTree();

    // set up the random tree options
    m_KValue = m_numFeatures;
    if (m_KValue < 1)
      m_KValue = (int) Utils.log2(data.numAttributes() - 1) + 1;
    rTree.setKValue(m_KValue);
    rTree.setMaxDepth(getMaxDepth());

    // set up the bagger and build the forest
    m_bagger.setClassifier(rTree);
    m_bagger.setSeed(m_randomSeed);
    m_bagger.setNumIterations(m_numTrees);
    m_bagger.setCalcOutOfBag(true);
    m_bagger.buildClassifier(data);
  }

  /**
   * Returns the class probability distribution for an instance.
   * 
   * @param instance the instance to be classified
   * @return the distribution the forest generates for the instance
   * @throws Exception if computation fails
   */
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {

    return m_bagger.distributionForInstance(instance);
  }

  /**
   * Outputs a description of this classifier.
   * 
   * @return a string containing a description of the classifier
   */
  @Override
  public String toString() {

    if (m_bagger == null)
      return "Random forest not built yet";
    else
      return "Random forest of "
          + m_numTrees
          + " trees, each constructed while considering "
          + m_KValue
          + " random feature"
          + (m_KValue == 1 ? "" : "s")
          + ".\n"
          + "Out of bag error: "
          + Utils.doubleToString(m_bagger.measureOutOfBagError(), 4)
          + "\n"
          + (getMaxDepth() > 0 ? ("Max. depth of trees: " + getMaxDepth() + "\n")
              : ("")) + "\n";
  }

  /**
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 13295 $");
=======
    return RevisionUtils.extract("$Revision: 1.13 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for this class.
   * 
   * @param argv the options
   */
  public static void main(String[] argv) {
    runClassifier(new RandomForest(), argv);
  }
}
