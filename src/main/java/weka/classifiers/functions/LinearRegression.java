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
 *    LinearRegression.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.functions;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;

import no.uib.cipr.matrix.*;
import no.uib.cipr.matrix.Matrix;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.evaluation.RegressionAnalysis;
import weka.core.*;
=======
import weka.classifiers.Classifier;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.matrix.Matrix;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.supervised.attribute.NominalToBinary;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

<<<<<<< HEAD
/**
 <!-- globalinfo-start -->
 * Class for using linear regression for prediction.
 * Uses the Akaike criterion for model selection, and is able to deal with
 * weighted instances.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are:
 * <p/>
 * 
 * <pre>
 * -S &lt;number of selection method&gt;
 *  Set the attribute selection method to use. 1 = None, 2 = Greedy.
 *  (default 0 = M5' method)
 * </pre>
 * 
 * <pre>
 * -C
 *  Do not try to eliminate colinear attributes.
 * </pre>
 * 
 * <pre>
 * -R &lt;double&gt;
 *  Set ridge parameter (default 1.0e-8).
 * </pre>
 * 
 * <pre>
 * -minimal
 *  Conserve memory, don't keep dataset header and means/stdevs.
 *  Model cannot be printed out if this option is enabled. (default: keep data)
 * </pre>
 * 
 * <pre>
 * -additional-stats
 *  Output additional statistics.
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
 <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 13014 $
 */
public class LinearRegression extends AbstractClassifier implements
  OptionHandler, WeightedInstancesHandler {

  /** Attribute selection method: M5 method */
  public static final int SELECTION_M5 = 0;
  /** Attribute selection method: No attribute selection */
  public static final int SELECTION_NONE = 1;
  /** Attribute selection method: Greedy method */
  public static final int SELECTION_GREEDY = 2;
  /** Attribute selection methods */
  public static final Tag[] TAGS_SELECTION = {
    new Tag(SELECTION_NONE, "No attribute selection"),
    new Tag(SELECTION_M5, "M5 method"),
    new Tag(SELECTION_GREEDY, "Greedy method") };
  /** for serialization */
  static final long serialVersionUID = -3364580862046573747L;
  /** Array for storing coefficients of linear regression. */
  protected double[] m_Coefficients;
  /** Which attributes are relevant? */
  protected boolean[] m_SelectedAttributes;
  /** Variable for storing transformed training data. */
  protected Instances m_TransformedData;
  /** The filter for removing missing values. */
  protected ReplaceMissingValues m_MissingFilter;
  /**
   * The filter storing the transformation from nominal to binary attributes.
   */
  protected NominalToBinary m_TransformFilter;
  /** The standard deviations of the class attribute */
  protected double m_ClassStdDev;
  /** The mean of the class attribute */
  protected double m_ClassMean;
  /** The index of the class attribute */
  protected int m_ClassIndex;
  /** The attributes means */
  protected double[] m_Means;
  /** The attribute standard deviations */
  protected double[] m_StdDevs;
  /**
   * Whether to output additional statistics such as std. dev. of coefficients
   * and t-stats
   */
  protected boolean m_outputAdditionalStats;
  /** The current attribute selection method */
  protected int m_AttributeSelection;
  /** Try to eliminate correlated attributes? */
  protected boolean m_EliminateColinearAttributes = true;
  /** Turn off all checks and conversions? */
  protected boolean m_checksTurnedOff = false;
  /** The ridge parameter */
  protected double m_Ridge = 1.0e-8;
  /** Conserve memory? */
  protected boolean m_Minimal = false;
  /** Model already built? */
  protected boolean m_ModelBuilt = false;
  /** True if the model is a zero R one */
  protected boolean m_isZeroR;
  /** The degrees of freedom of the regression model */
  private int m_df;
  /** The R-squared value of the regression model */
  private double m_RSquared;
  /** The adjusted R-squared value of the regression model */
  private double m_RSquaredAdj;
  /** The F-statistic of the regression model */
  private double m_FStat;
  /** Array for storing the standard error of each coefficient */
  private double[] m_StdErrorOfCoef;
  /** Array for storing the t-statistic of each coefficient */
  private double[] m_TStats;

  public LinearRegression() {
    m_numDecimalPlaces = 4;
  }

  /**
   * Generates a linear regression function predictor.
   *
   * @param argv the options
   */
  public static void main(String argv[]) {
    runClassifier(new LinearRegression(), argv);
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Class for using linear regression for prediction. Uses the Akaike criterion for model selection, and is able to deal with weighted instances.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  Produce debugging output.
 *  (default no debugging output)</pre>
 * 
 * <pre> -S &lt;number of selection method&gt;
 *  Set the attribute selection method to use. 1 = None, 2 = Greedy.
 *  (default 0 = M5' method)</pre>
 * 
 * <pre> -C
 *  Do not try to eliminate colinear attributes.
 * </pre>
 * 
 * <pre> -R &lt;double&gt;
 *  Set ridge parameter (default 1.0e-8).
 * </pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 9770 $
 */
public class LinearRegression extends Classifier implements OptionHandler,
  WeightedInstancesHandler {
  
  /** for serialization */
  static final long serialVersionUID = -3364580862046573747L;

  /** Array for storing coefficients of linear regression. */
  private double[] m_Coefficients;

  /** Which attributes are relevant? */
  private boolean[] m_SelectedAttributes;

  /** Variable for storing transformed training data. */
  private Instances m_TransformedData;

  /** The filter for removing missing values. */
  private ReplaceMissingValues m_MissingFilter;

  /** The filter storing the transformation from nominal to 
      binary attributes. */
  private NominalToBinary m_TransformFilter;

  /** The standard deviations of the class attribute */
  private double m_ClassStdDev;

  /** The mean of the class attribute */
  private double m_ClassMean;

  /** The index of the class attribute */
  private int m_ClassIndex;

  /** The attributes means */
  private double[] m_Means;

  /** The attribute standard deviations */
  private double[] m_StdDevs;

  /** True if debug output will be printed */
  private boolean b_Debug;

  /** The current attribute selection method */
  private int m_AttributeSelection;

  /** Attribute selection method: M5 method */
  public static final int SELECTION_M5 = 0;
  /** Attribute selection method: No attribute selection */
  public static final int SELECTION_NONE = 1;
  /** Attribute selection method: Greedy method */
  public static final int SELECTION_GREEDY = 2;
  /** Attribute selection methods */
  public static final Tag [] TAGS_SELECTION = {
    new Tag(SELECTION_NONE, "No attribute selection"),
    new Tag(SELECTION_M5, "M5 method"),
    new Tag(SELECTION_GREEDY, "Greedy method")
  };

  /** Try to eliminate correlated attributes? */
  private boolean m_EliminateColinearAttributes = true;

  /** Turn off all checks and conversions? */
  private boolean m_checksTurnedOff = false;

  /** The ridge parameter */
  private double m_Ridge = 1.0e-8;

  /**
   * Turns off checks for missing values, etc. Use with caution.
   * Also turns off scaling.
   */
  public void turnChecksOff() {

    m_checksTurnedOff = true;
  }

  /**
   * Turns on checks for missing values, etc. Also turns
   * on scaling.
   */
  public void turnChecksOn() {

    m_checksTurnedOff = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns a string describing this classifier
<<<<<<< HEAD
   *
   * @return a description of the classifier suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class for using linear regression for prediction. Uses the Akaike "
      + "criterion for model selection, and is able to deal with weighted "
      + "instances.";
=======
   * @return a description of the classifier suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class for using linear regression for prediction. Uses the Akaike "
      +"criterion for model selection, and is able to deal with weighted "
      +"instances.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns default capabilities of the classifier.
   *
<<<<<<< HEAD
   * @return the capabilities of this classifier
   */
  @Override
=======
   * @return      the capabilities of this classifier
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NUMERIC_CLASS);
    result.enable(Capability.DATE_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Builds a regression model for the given data.
   *
<<<<<<< HEAD
   * @param data the training data to be used for generating the linear
   *          regression function
   * @throws Exception if the classifier could not be built successfully
   */
  @Override
  public void buildClassifier(Instances data) throws Exception {
    m_ModelBuilt = false;
    m_isZeroR = false;

    if (data.numInstances() == 1) {
      m_Coefficients = new double[1];
      m_Coefficients[0] = data.instance(0).classValue();
      m_SelectedAttributes = new boolean[data.numAttributes()];
      m_isZeroR = true;
      return;
    }

=======
   * @param data the training data to be used for generating the
   * linear regression function
   * @throws Exception if the classifier could not be built successfully
   */
  public void buildClassifier(Instances data) throws Exception {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (!m_checksTurnedOff) {
      // can classifier handle the data?
      getCapabilities().testWithFail(data);

<<<<<<< HEAD
      if (m_outputAdditionalStats) {
        // check that the instances weights are all 1
        // because the RegressionAnalysis class does
        // not handle weights
        boolean ok = true;
        for (int i = 0; i < data.numInstances(); i++) {
          if (data.instance(i).weight() != 1) {
            ok = false;
            break;
          }
        }
        if (!ok) {
          throw new Exception(
            "Can only compute additional statistics on unweighted data");
        }
      }

      // remove instances with missing class
      data = new Instances(data);
      data.deleteWithMissingClass();

=======
      // remove instances with missing class
      data = new Instances(data);
      data.deleteWithMissingClass();
    }

    // Preprocess instances
    if (!m_checksTurnedOff) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_TransformFilter = new NominalToBinary();
      m_TransformFilter.setInputFormat(data);
      data = Filter.useFilter(data, m_TransformFilter);
      m_MissingFilter = new ReplaceMissingValues();
      m_MissingFilter.setInputFormat(data);
      data = Filter.useFilter(data, m_MissingFilter);
      data.deleteWithMissingClass();
    } else {
      m_TransformFilter = null;
      m_MissingFilter = null;
    }

    m_ClassIndex = data.classIndex();
    m_TransformedData = data;

    // Turn all attributes on for a start
<<<<<<< HEAD
    m_Coefficients = null;

    // Compute means and standard deviations
    m_SelectedAttributes = new boolean[data.numAttributes()];
    m_Means = new double[data.numAttributes()];
    m_StdDevs = new double[data.numAttributes()];
    for (int j = 0; j < data.numAttributes(); j++) {
      if (j != m_ClassIndex) {
        m_SelectedAttributes[j] = true; // Turn attributes on for a start
        m_Means[j] = data.meanOrMode(j);
        m_StdDevs[j] = Math.sqrt(data.variance(j));
        if (m_StdDevs[j] == 0) {
          m_SelectedAttributes[j] = false;
        }
=======
    m_SelectedAttributes = new boolean[data.numAttributes()];
    for (int i = 0; i < data.numAttributes(); i++) {
      if (i != m_ClassIndex) {
	m_SelectedAttributes[i] = true;
      }
    }
    m_Coefficients = null;

    // Compute means and standard deviations
    m_Means = new double[data.numAttributes()];
    m_StdDevs = new double[data.numAttributes()];
    for (int j = 0; j < data.numAttributes(); j++) {
      if (j != data.classIndex()) {
	m_Means[j] = data.meanOrMode(j);
	m_StdDevs[j] = Math.sqrt(data.variance(j));
	if (m_StdDevs[j] == 0) {
	  m_SelectedAttributes[j] = false;
	} 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    m_ClassStdDev = Math.sqrt(data.variance(m_TransformedData.classIndex()));
    m_ClassMean = data.meanOrMode(m_TransformedData.classIndex());

    // Perform the regression
    findBestModel();

<<<<<<< HEAD
    if (m_outputAdditionalStats) {
      // find number of coefficients, degrees of freedom
      int k = 1;
      for (int i = 0; i < data.numAttributes(); i++) {
        if (i != data.classIndex()) {
          if (m_SelectedAttributes[i]) {
            k++;
          }
        }
      }
      m_df = m_TransformedData.numInstances() - k;

      // calculate R^2 and F-stat
      double se = calculateSE(m_SelectedAttributes, m_Coefficients);
      m_RSquared = RegressionAnalysis.calculateRSquared(m_TransformedData, se);
      m_RSquaredAdj =
        RegressionAnalysis.calculateAdjRSquared(m_RSquared,
          m_TransformedData.numInstances(), k);
      m_FStat =
        RegressionAnalysis.calculateFStat(m_RSquared,
          m_TransformedData.numInstances(), k);
      // calculate std error of coefficients and t-stats
      m_StdErrorOfCoef =
        RegressionAnalysis.calculateStdErrorOfCoef(m_TransformedData,
          m_SelectedAttributes, se, m_TransformedData.numInstances(), k);
      m_TStats =
        RegressionAnalysis.calculateTStats(m_Coefficients, m_StdErrorOfCoef, k);
    }

    // Save memory
    if (m_Minimal) {
      m_TransformedData = null;
      m_Means = null;
      m_StdDevs = null;
    } else {
      m_TransformedData = new Instances(data, 0);
    }

    m_ModelBuilt = true;
=======
    // Save memory
    m_TransformedData = new Instances(data, 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Classifies the given instance using the linear regression function.
   *
   * @param instance the test instance
   * @return the classification
   * @throws Exception if classification can't be done successfully
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public double classifyInstance(Instance instance) throws Exception {

    // Transform the input instance
    Instance transformedInstance = instance;
<<<<<<< HEAD
    if (!m_checksTurnedOff && !m_isZeroR) {
=======
    if (!m_checksTurnedOff) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_TransformFilter.input(transformedInstance);
      m_TransformFilter.batchFinished();
      transformedInstance = m_TransformFilter.output();
      m_MissingFilter.input(transformedInstance);
      m_MissingFilter.batchFinished();
      transformedInstance = m_MissingFilter.output();
    }

    // Calculate the dependent variable from the regression model
<<<<<<< HEAD
    return regressionPrediction(transformedInstance, m_SelectedAttributes,
      m_Coefficients);
=======
    return regressionPrediction(transformedInstance,
				m_SelectedAttributes,
				m_Coefficients);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Outputs the linear regression model as a string.
<<<<<<< HEAD
   *
   * @return the model as string
   */
  @Override
  public String toString() {
    if (!m_ModelBuilt) {
      return "Linear Regression: No model built yet.";
    }

    if (m_Minimal) {
      return "Linear Regression: Model built.";
    }

    try {
      StringBuilder text = new StringBuilder();
      int column = 0;
      boolean first = true;

      text.append("\nLinear Regression Model\n\n");

      text.append(m_TransformedData.classAttribute().name() + " =\n\n");
      for (int i = 0; i < m_TransformedData.numAttributes(); i++) {
        if ((i != m_ClassIndex) && (m_SelectedAttributes[i])) {
          if (!first) {
            text.append(" +\n");
          } else {
            first = false;
          }
          text.append(Utils.doubleToString(m_Coefficients[column], 12,
            m_numDecimalPlaces) + " * ");
          text.append(m_TransformedData.attribute(i).name());
          column++;
        }
      }
      text.append(" +\n"
        + Utils.doubleToString(m_Coefficients[column], 12, m_numDecimalPlaces));

      if (m_outputAdditionalStats) {
        int maxAttLength = 0;
        for (int i = 0; i < m_TransformedData.numAttributes(); i++) {
          if ((i != m_ClassIndex) && (m_SelectedAttributes[i])) {
            if (m_TransformedData.attribute(i).name().length() > maxAttLength) {
              maxAttLength = m_TransformedData.attribute(i).name().length();
            }
          }
        }
        maxAttLength += 3;
        if (maxAttLength < "Variable".length() + 3) {
          maxAttLength = "Variable".length() + 3;
        }

        text.append("\n\nRegression Analysis:\n\n"
          + Utils.padRight("Variable", maxAttLength)
          + "  Coefficient     SE of Coef        t-Stat");
        column = 0;
        for (int i = 0; i < m_TransformedData.numAttributes(); i++) {
          if ((i != m_ClassIndex) && (m_SelectedAttributes[i])) {
            text.append("\n"
              + Utils.padRight(m_TransformedData.attribute(i).name(),
                maxAttLength));
            text.append(Utils.doubleToString(m_Coefficients[column], 12,
              m_numDecimalPlaces));
            text.append("   "
              + Utils.doubleToString(m_StdErrorOfCoef[column], 12,
                m_numDecimalPlaces));
            text.append("   "
              + Utils.doubleToString(m_TStats[column], 12, m_numDecimalPlaces));
            column++;
          }
        }
        text.append(Utils.padRight("\nconst", maxAttLength + 1)
          + Utils
            .doubleToString(m_Coefficients[column], 12, m_numDecimalPlaces));
        text.append("   "
          + Utils.doubleToString(m_StdErrorOfCoef[column], 12,
            m_numDecimalPlaces));
        text.append("   "
          + Utils.doubleToString(m_TStats[column], 12, m_numDecimalPlaces));

        text.append("\n\nDegrees of freedom = " + Integer.toString(m_df));
        text.append("\nR^2 value = "
          + Utils.doubleToString(m_RSquared, m_numDecimalPlaces));
        text.append("\nAdjusted R^2 = "
          + Utils.doubleToString(m_RSquaredAdj, 5));
        text.append("\nF-statistic = "
          + Utils.doubleToString(m_FStat, m_numDecimalPlaces));
      }

=======
   * 
   * @return the model as string
   */
  public String toString() {

    if (m_TransformedData == null) {
      return "Linear Regression: No model built yet.";
    }
    try {
      StringBuffer text = new StringBuffer();
      int column = 0;
      boolean first = true;
      
      text.append("\nLinear Regression Model\n\n");
      
      text.append(m_TransformedData.classAttribute().name()+" =\n\n");
      for (int i = 0; i < m_TransformedData.numAttributes(); i++) {
	if ((i != m_ClassIndex) 
	    && (m_SelectedAttributes[i])) {
	  if (!first) 
	    text.append(" +\n");
	  else
	    first = false;
	  text.append(Utils.doubleToString(m_Coefficients[column], 12, 4)
		      + " * ");
	  text.append(m_TransformedData.attribute(i).name());
	  column++;
	}
      }
      text.append(" +\n" + 
		  Utils.doubleToString(m_Coefficients[column], 12, 4));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return text.toString();
    } catch (Exception e) {
      return "Can't print Linear Regression!";
    }
  }

  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  @Override
  public Enumeration<Option> listOptions() {
    java.util.Vector<Option> newVector = new java.util.Vector<Option>();

    newVector.addElement(new Option("\tSet the attribute selection method"
      + " to use. 1 = None, 2 = Greedy.\n" + "\t(default 0 = M5' method)", "S",
      1, "-S <number of selection method>"));

    newVector.addElement(new Option("\tDo not try to eliminate colinear"
      + " attributes.\n", "C", 0, "-C"));

    newVector.addElement(new Option(
      "\tSet ridge parameter (default 1.0e-8).\n", "R", 1, "-R <double>"));

    newVector.addElement(new Option(
      "\tConserve memory, don't keep dataset header and means/stdevs.\n"
        + "\tModel cannot be printed out if this option is enabled."
        + "\t(default: keep data)", "minimal", 0, "-minimal"));

    newVector.addElement(new Option("\tOutput additional statistics.",
      "additional-stats", 0, "-additional-stats"));

    newVector.addAll(Collections.list(super.listOptions()));

=======
  public Enumeration listOptions() {
    
    Vector newVector = new Vector(4);
    newVector.addElement(new Option("\tProduce debugging output.\n"
				    + "\t(default no debugging output)",
				    "D", 0, "-D"));
    newVector.addElement(new Option("\tSet the attribute selection method"
				    + " to use. 1 = None, 2 = Greedy.\n"
				    + "\t(default 0 = M5' method)",
				    "S", 1, "-S <number of selection method>"));
    newVector.addElement(new Option("\tDo not try to eliminate colinear"
				    + " attributes.\n",
				    "C", 0, "-C"));
    newVector.addElement(new Option("\tSet ridge parameter (default 1.0e-8).\n",
				    "R", 1, "-R <double>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return newVector.elements();
  }

  /**
<<<<<<< HEAD
   * Returns the coefficients for this linear model.
   * 
   * @return the coefficients for this linear model
   */
  public double[] coefficients() {

    double[] coefficients = new double[m_SelectedAttributes.length + 1];
    int counter = 0;
    for (int i = 0; i < m_SelectedAttributes.length; i++) {
      if ((m_SelectedAttributes[i]) && ((i != m_ClassIndex))) {
        coefficients[i] = m_Coefficients[counter++];
      }
    }
    coefficients[m_SelectedAttributes.length] = m_Coefficients[counter];
    return coefficients;
  }

  /**
   * Gets the current settings of the classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    java.util.Vector<String> result = new java.util.Vector<String>();

    result.add("-S");
    result.add("" + getAttributeSelectionMethod().getSelectedTag().getID());

    if (!getEliminateColinearAttributes()) {
      result.add("-C");
    }

    result.add("-R");
    result.add("" + getRidge());

    if (getMinimal()) {
      result.add("-minimal");
    }

    if (getOutputAdditionalStats()) {
      result.add("-additional-stats");
    }

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Parses a given list of options.
   * <p/>
   *
   <!-- options-start -->
   * Valid options are:
   * <p/>
   *
   * <pre>
   * -S &lt;number of selection method&gt;
   *  Set the attribute selection method to use. 1 = None, 2 = Greedy.
   *  (default 0 = M5' method)
   * </pre>
   *
   * <pre>
   * -C
   *  Do not try to eliminate colinear attributes.
   * </pre>
   *
   * <pre>
   * -R &lt;double&gt;
   *  Set ridge parameter (default 1.0e-8).
   * </pre>
   *
   * <pre>
   * -minimal
   *  Conserve memory, don't keep dataset header and means/stdevs.
   *  Model cannot be printed out if this option is enabled. (default: keep data)
   * </pre>
   *
   * <pre>
   * -additional-stats
   *  Output additional statistics.
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
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Produce debugging output.
   *  (default no debugging output)</pre>
   * 
   * <pre> -S &lt;number of selection method&gt;
   *  Set the attribute selection method to use. 1 = None, 2 = Greedy.
   *  (default 0 = M5' method)</pre>
   * 
   * <pre> -C
   *  Do not try to eliminate colinear attributes.
   * </pre>
   * 
   * <pre> -R &lt;double&gt;
   *  Set ridge parameter (default 1.0e-8).
   * </pre>
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {

    String selectionString = Utils.getOption('S', options);
    if (selectionString.length() != 0) {
<<<<<<< HEAD
      setAttributeSelectionMethod(new SelectedTag(
        Integer.parseInt(selectionString), TAGS_SELECTION));
    } else {
      setAttributeSelectionMethod(new SelectedTag(SELECTION_M5, TAGS_SELECTION));
=======
      setAttributeSelectionMethod(new SelectedTag(Integer
						  .parseInt(selectionString),
						  TAGS_SELECTION));
    } else {
      setAttributeSelectionMethod(new SelectedTag(SELECTION_M5,
						  TAGS_SELECTION));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    String ridgeString = Utils.getOption('R', options);
    if (ridgeString.length() != 0) {
      setRidge(new Double(ridgeString).doubleValue());
    } else {
      setRidge(1.0e-8);
    }
<<<<<<< HEAD
    setEliminateColinearAttributes(!Utils.getFlag('C', options));
    setMinimal(Utils.getFlag("minimal", options));

    setOutputAdditionalStats(Utils.getFlag("additional-stats", options));

    super.setOptions(options);
    Utils.checkForRemainingOptions(options);
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
    setDebug(Utils.getFlag('D', options));
    setEliminateColinearAttributes(!Utils.getFlag('C', options));
  }

  /**
   * Returns the coefficients for this linear model.
   * 
   * @return the coefficients for this linear model
   */
  public double[] coefficients() {

    double[] coefficients = new double[m_SelectedAttributes.length + 1];
    int counter = 0;
    for (int i = 0; i < m_SelectedAttributes.length; i++) {
      if ((m_SelectedAttributes[i]) && ((i != m_ClassIndex))) {
	coefficients[i] = m_Coefficients[counter++];
      }
    }
    coefficients[m_SelectedAttributes.length] = m_Coefficients[counter];
    return coefficients;
  }

  /**
   * Gets the current settings of the classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [6];
    int current = 0;

    options[current++] = "-S";
    options[current++] = "" + getAttributeSelectionMethod()
      .getSelectedTag().getID();
    if (getDebug()) {
      options[current++] = "-D";
    }
    if (!getEliminateColinearAttributes()) {
      options[current++] = "-C";
    }
    options[current++] = "-R";
    options[current++] = "" + getRidge();

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
  public String ridgeTipText() {
    return "The value of the Ridge parameter.";
  }

  /**
   * Get the value of Ridge.
   *
   * @return Value of Ridge.
   */
  public double getRidge() {
<<<<<<< HEAD

    return m_Ridge;
  }

=======
    
    return m_Ridge;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set the value of Ridge.
   *
   * @param newRidge Value to assign to Ridge.
   */
  public void setRidge(double newRidge) {
<<<<<<< HEAD

    m_Ridge = newRidge;
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
    
    m_Ridge = newRidge;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String eliminateColinearAttributesTipText() {
    return "Eliminate colinear attributes.";
  }

  /**
   * Get the value of EliminateColinearAttributes.
   *
   * @return Value of EliminateColinearAttributes.
   */
  public boolean getEliminateColinearAttributes() {
<<<<<<< HEAD

    return m_EliminateColinearAttributes;
  }

  /**
   * Set the value of EliminateColinearAttributes.
   *
   * @param newEliminateColinearAttributes Value to assign to
   *          EliminateColinearAttributes.
   */
  public void setEliminateColinearAttributes(
    boolean newEliminateColinearAttributes) {

    m_EliminateColinearAttributes = newEliminateColinearAttributes;
  }

=======
    
    return m_EliminateColinearAttributes;
  }
  
  /**
   * Set the value of EliminateColinearAttributes.
   *
   * @param newEliminateColinearAttributes Value to assign to EliminateColinearAttributes.
   */
  public void setEliminateColinearAttributes(boolean newEliminateColinearAttributes) {
    
    m_EliminateColinearAttributes = newEliminateColinearAttributes;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Get the number of coefficients used in the model
   *
   * @return the number of coefficients
   */
<<<<<<< HEAD
  public int numParameters() {
    return m_Coefficients.length - 1;
=======
  public int numParameters()
  {
    return m_Coefficients.length-1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String attributeSelectionMethodTipText() {
    return "Set the method used to select attributes for use in the linear "
      + "regression. Available methods are: no attribute selection, attribute "
      + "selection using M5's method (step through the attributes removing the one "
      + "with the smallest standardised coefficient until no improvement is observed "
      + "in the estimate of the error given by the Akaike "
      + "information criterion), and a greedy selection using the Akaike information "
      + "metric.";
  }

  /**
   * Gets the method used to select attributes for use in the linear regression.
   * 
   * @return the method to use.
   */
  public SelectedTag getAttributeSelectionMethod() {

    return new SelectedTag(m_AttributeSelection, TAGS_SELECTION);
  }

  /**
   * Sets the method used to select attributes for use in the linear regression.
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String attributeSelectionMethodTipText() {
    return "Set the method used to select attributes for use in the linear "
      +"regression. Available methods are: no attribute selection, attribute "
      +"selection using M5's method (step through the attributes removing the one "
      +"with the smallest standardised coefficient until no improvement is observed "
      +"in the estimate of the error given by the Akaike "
      +"information criterion), and a greedy selection using the Akaike information "
      +"metric.";
  }

  /**
   * Sets the method used to select attributes for use in the
   * linear regression. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param method the attribute selection method to use.
   */
  public void setAttributeSelectionMethod(SelectedTag method) {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (method.getTags() == TAGS_SELECTION) {
      m_AttributeSelection = method.getSelectedTag().getID();
    }
  }

  /**
<<<<<<< HEAD
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String minimalTipText() {
    return "If enabled, dataset header, means and stdevs get discarded to conserve memory; also, the model cannot be printed out.";
  }

  /**
   * Returns whether to be more memory conservative or being able to output the
   * model as string.
   * 
   * @return true if memory conservation is preferred over outputting model
   *         description
   */
  public boolean getMinimal() {
    return m_Minimal;
  }

  /**
   * Sets whether to be more memory conservative or being able to output the
   * model as string.
   *
   * @param value if true memory will be conserved
   */
  public void setMinimal(boolean value) {
    m_Minimal = value;
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String outputAdditionalStatsTipText() {
    return "Output additional statistics (such as "
      + "std deviation of coefficients and t-statistics)";
  }

  /**
   * Get whether to output additional statistics (such as std. deviation of
   * coefficients and t-statistics
   * 
   * @return true if additional stats are to be output
   */
  public boolean getOutputAdditionalStats() {
    return m_outputAdditionalStats;
  }

  /**
   * Set whether to output additional statistics (such as std. deviation of
   * coefficients and t-statistics
   *
   * @param additional true if additional stats are to be output
   */
  public void setOutputAdditionalStats(boolean additional) {
    m_outputAdditionalStats = additional;
  }

  /**
   * Turns off checks for missing values, etc. Use with caution. Also turns off
   * scaling.
   */
  public void turnChecksOff() {
    m_checksTurnedOff = true;
  }

  /**
   * Turns on checks for missing values, etc. Also turns on scaling.
   */
  public void turnChecksOn() {
    m_checksTurnedOff = false;
  }

  /**
   * Removes the attribute with the highest standardised coefficient greater
   * than 1.5 from the selected attributes.
   *
   * @param selectedAttributes an array of flags indicating which attributes are
   *          included in the regression model
   * @param coefficients an array of coefficients for the regression model
   * @return true if an attribute was removed
   */
  protected boolean deselectColinearAttributes(boolean[] selectedAttributes,
    double[] coefficients) {
=======
   * Gets the method used to select attributes for use in the
   * linear regression. 
   *
   * @return the method to use.
   */
  public SelectedTag getAttributeSelectionMethod() {
    
    return new SelectedTag(m_AttributeSelection, TAGS_SELECTION);
  }

  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String debugTipText() {
    return "Outputs debug information to the console.";
  }

  /**
   * Controls whether debugging output will be printed
   *
   * @param debug true if debugging output should be printed
   */
  public void setDebug(boolean debug) {

    b_Debug = debug;
  }

  /**
   * Controls whether debugging output will be printed
   *
   * @return true if debugging output is printed
   */
  public boolean getDebug() {

    return b_Debug;
  }

  /**
   * Removes the attribute with the highest standardised coefficient
   * greater than 1.5 from the selected attributes.
   *
   * @param selectedAttributes an array of flags indicating which 
   * attributes are included in the regression model
   * @param coefficients an array of coefficients for the regression
   * model
   * @return true if an attribute was removed
   */
  private boolean deselectColinearAttributes(boolean [] selectedAttributes,
					     double [] coefficients) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    double maxSC = 1.5;
    int maxAttr = -1, coeff = 0;
    for (int i = 0; i < selectedAttributes.length; i++) {
      if (selectedAttributes[i]) {
<<<<<<< HEAD
        double SC =
          Math.abs(coefficients[coeff] * m_StdDevs[i] / m_ClassStdDev);
        if (SC > maxSC) {
          maxSC = SC;
          maxAttr = i;
        }
        coeff++;
=======
	double SC = Math.abs(coefficients[coeff] * m_StdDevs[i] 
			     / m_ClassStdDev);
	if (SC > maxSC) {
	  maxSC = SC;
	  maxAttr = i;
	}
	coeff++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    if (maxAttr >= 0) {
      selectedAttributes[maxAttr] = false;
<<<<<<< HEAD
      if (m_Debug) {
        System.out.println("Deselected colinear attribute:" + (maxAttr + 1)
          + " with standardised coefficient: " + maxSC);
=======
      if (b_Debug) {
	System.out.println("Deselected colinear attribute:" + (maxAttr + 1)
			   + " with standardised coefficient: " + maxSC);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return true;
    }
    return false;
  }

  /**
<<<<<<< HEAD
   * Performs a greedy search for the best regression model using Akaike's
   * criterion.
   *
   * @throws Exception if regression can't be done
   */
  protected void findBestModel() throws Exception {

    // For the weighted case we still use numInstances in
    // the calculation of the Akaike criterion.
    int numInstances = m_TransformedData.numInstances();

    if (m_Debug) {
=======
   * Performs a greedy search for the best regression model using
   * Akaike's criterion.
   *
   * @throws Exception if regression can't be done
   */
  private void findBestModel() throws Exception {

    // For the weighted case we still use numInstances in
    // the calculation of the Akaike criterion. 
    int numInstances = m_TransformedData.numInstances();

    if (b_Debug) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.out.println((new Instances(m_TransformedData, 0)).toString());
    }

    // Perform a regression for the full model, and remove colinear attributes
    do {
      m_Coefficients = doRegression(m_SelectedAttributes);
<<<<<<< HEAD
    } while (m_EliminateColinearAttributes
      && deselectColinearAttributes(m_SelectedAttributes, m_Coefficients));
=======
    } while (m_EliminateColinearAttributes && 
	     deselectColinearAttributes(m_SelectedAttributes, m_Coefficients));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // Figure out current number of attributes + 1. (We treat this model
    // as the full model for the Akaike-based methods.)
    int numAttributes = 1;
<<<<<<< HEAD
    for (boolean m_SelectedAttribute : m_SelectedAttributes) {
      if (m_SelectedAttribute) {
        numAttributes++;
=======
    for (int i = 0; i < m_SelectedAttributes.length; i++) {
      if (m_SelectedAttributes[i]) {
	numAttributes++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    double fullMSE = calculateSE(m_SelectedAttributes, m_Coefficients);
    double akaike = (numInstances - numAttributes) + 2 * numAttributes;
<<<<<<< HEAD
    if (m_Debug) {
=======
    if (b_Debug) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.out.println("Initial Akaike value: " + akaike);
    }

    boolean improved;
    int currentNumAttributes = numAttributes;
    switch (m_AttributeSelection) {

    case SELECTION_GREEDY:

      // Greedy attribute removal
      do {
<<<<<<< HEAD
        boolean[] currentSelected = m_SelectedAttributes.clone();
        improved = false;
        currentNumAttributes--;

        for (int i = 0; i < m_SelectedAttributes.length; i++) {
          if (currentSelected[i]) {

            // Calculate the akaike rating without this attribute
            currentSelected[i] = false;
            double[] currentCoeffs = doRegression(currentSelected);
            double currentMSE = calculateSE(currentSelected, currentCoeffs);
            double currentAkaike =
              currentMSE / fullMSE * (numInstances - numAttributes) + 2
                * currentNumAttributes;
            if (m_Debug) {
              System.out.println("(akaike: " + currentAkaike);
            }

            // If it is better than the current best
            if (currentAkaike < akaike) {
              if (m_Debug) {
                System.err.println("Removing attribute " + (i + 1)
                  + " improved Akaike: " + currentAkaike);
              }
              improved = true;
              akaike = currentAkaike;
              System.arraycopy(currentSelected, 0, m_SelectedAttributes, 0,
                m_SelectedAttributes.length);
              m_Coefficients = currentCoeffs;
            }
            currentSelected[i] = true;
          }
        }
=======
	boolean [] currentSelected = (boolean []) m_SelectedAttributes.clone();
	improved = false;
	currentNumAttributes--;

	for (int i = 0; i < m_SelectedAttributes.length; i++) {
	  if (currentSelected[i]) {

	    // Calculate the akaike rating without this attribute
	    currentSelected[i] = false;
	    double [] currentCoeffs = doRegression(currentSelected);
	    double currentMSE = calculateSE(currentSelected, currentCoeffs);
	    double currentAkaike = currentMSE / fullMSE 
	      * (numInstances - numAttributes)
	      + 2 * currentNumAttributes;
	    if (b_Debug) {
	      System.out.println("(akaike: " + currentAkaike);
	    }

	    // If it is better than the current best
	    if (currentAkaike < akaike) {
	      if (b_Debug) {
		System.err.println("Removing attribute " + (i + 1)
				   + " improved Akaike: " + currentAkaike);
	      }
	      improved = true;
	      akaike = currentAkaike;
	      System.arraycopy(currentSelected, 0,
			       m_SelectedAttributes, 0,
			       m_SelectedAttributes.length);
	      m_Coefficients = currentCoeffs;
	    }
	    currentSelected[i] = true;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } while (improved);
      break;

    case SELECTION_M5:

<<<<<<< HEAD
      // Step through the attributes removing the one with the smallest
      // standardised coefficient until no improvement in Akaike
      do {
        improved = false;
        currentNumAttributes--;

        // Find attribute with smallest SC
        double minSC = 0;
        int minAttr = -1, coeff = 0;
        for (int i = 0; i < m_SelectedAttributes.length; i++) {
          if (m_SelectedAttributes[i]) {
            double SC =
              Math.abs(m_Coefficients[coeff] * m_StdDevs[i] / m_ClassStdDev);
            if ((coeff == 0) || (SC < minSC)) {
              minSC = SC;
              minAttr = i;
            }
            coeff++;
          }
        }

        // See whether removing it improves the Akaike score
        if (minAttr >= 0) {
          m_SelectedAttributes[minAttr] = false;
          double[] currentCoeffs = doRegression(m_SelectedAttributes);
          double currentMSE = calculateSE(m_SelectedAttributes, currentCoeffs);
          double currentAkaike =
            currentMSE / fullMSE * (numInstances - numAttributes) + 2
              * currentNumAttributes;
          if (m_Debug) {
            System.out.println("(akaike: " + currentAkaike);
          }

          // If it is better than the current best
          if (currentAkaike < akaike) {
            if (m_Debug) {
              System.err.println("Removing attribute " + (minAttr + 1)
                + " improved Akaike: " + currentAkaike);
            }
            improved = true;
            akaike = currentAkaike;
            m_Coefficients = currentCoeffs;
          } else {
            m_SelectedAttributes[minAttr] = true;
          }
        }
=======
      // Step through the attributes removing the one with the smallest 
      // standardised coefficient until no improvement in Akaike
      do {
	improved = false;
	currentNumAttributes--;

	// Find attribute with smallest SC
	double minSC = 0;
	int minAttr = -1, coeff = 0;
	for (int i = 0; i < m_SelectedAttributes.length; i++) {
	  if (m_SelectedAttributes[i]) {
	    double SC = Math.abs(m_Coefficients[coeff] * m_StdDevs[i] 
				 / m_ClassStdDev);
	    if ((coeff == 0) || (SC < minSC)) {
	      minSC = SC;
	      minAttr = i;
	    }
	    coeff++;
	  }
	}

	// See whether removing it improves the Akaike score
	if (minAttr >= 0) {
	  m_SelectedAttributes[minAttr] = false;
	  double [] currentCoeffs = doRegression(m_SelectedAttributes);
	  double currentMSE = calculateSE(m_SelectedAttributes, currentCoeffs);
	  double currentAkaike = currentMSE / fullMSE 
	    * (numInstances - numAttributes)
	    + 2 * currentNumAttributes;
	  if (b_Debug) {
	    System.out.println("(akaike: " + currentAkaike);
	  }

	  // If it is better than the current best
	  if (currentAkaike < akaike) {
	    if (b_Debug) {
	      System.err.println("Removing attribute " + (minAttr + 1)
				 + " improved Akaike: " + currentAkaike);
	    }
	    improved = true;
	    akaike = currentAkaike;
	    m_Coefficients = currentCoeffs;
	  } else {
	    m_SelectedAttributes[minAttr] = true;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } while (improved);
      break;

    case SELECTION_NONE:
      break;
    }
  }

  /**
<<<<<<< HEAD
   * Calculate the squared error of a regression model on the training data
   *
   * @param selectedAttributes an array of flags indicating which attributes are
   *          included in the regression model
   * @param coefficients an array of coefficients for the regression model
   * @return the mean squared error on the training data
   * @throws Exception if there is a missing class value in the training data
   */
  protected double calculateSE(boolean[] selectedAttributes,
    double[] coefficients) throws Exception {

    double mse = 0;
    for (int i = 0; i < m_TransformedData.numInstances(); i++) {
      double prediction =
        regressionPrediction(m_TransformedData.instance(i), selectedAttributes,
          coefficients);
=======
   * Calculate the squared error of a regression model on the 
   * training data
   *
   * @param selectedAttributes an array of flags indicating which 
   * attributes are included in the regression model
   * @param coefficients an array of coefficients for the regression
   * model
   * @return the mean squared error on the training data
   * @throws Exception if there is a missing class value in the training
   * data
   */
  private double calculateSE(boolean [] selectedAttributes, 
			      double [] coefficients) throws Exception {

    double mse = 0;
    for (int i = 0; i < m_TransformedData.numInstances(); i++) {
      double prediction = regressionPrediction(m_TransformedData.instance(i),
					       selectedAttributes,
					       coefficients);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      double error = prediction - m_TransformedData.instance(i).classValue();
      mse += error * error;
    }
    return mse;
  }

  /**
<<<<<<< HEAD
   * Calculate the dependent value for a given instance for a given regression
   * model.
   *
   * @param transformedInstance the input instance
   * @param selectedAttributes an array of flags indicating which attributes are
   *          included in the regression model
   * @param coefficients an array of coefficients for the regression model
   * @return the regression value for the instance.
   * @throws Exception if the class attribute of the input instance is not
   *           assigned
   */
  protected double regressionPrediction(Instance transformedInstance,
    boolean[] selectedAttributes, double[] coefficients) throws Exception {

    double result = 0;
    int column = 0;
    for (int j = 0; j < transformedInstance.numAttributes(); j++) {
      if ((m_ClassIndex != j) && (selectedAttributes[j])) {
        result += coefficients[column] * transformedInstance.value(j);
        column++;
      }
    }
    result += coefficients[column];

=======
   * Calculate the dependent value for a given instance for a
   * given regression model.
   *
   * @param transformedInstance the input instance
   * @param selectedAttributes an array of flags indicating which 
   * attributes are included in the regression model
   * @param coefficients an array of coefficients for the regression
   * model
   * @return the regression value for the instance.
   * @throws Exception if the class attribute of the input instance
   * is not assigned
   */
  private double regressionPrediction(Instance transformedInstance,
				      boolean [] selectedAttributes,
				      double [] coefficients) 
  throws Exception {
    
    double result = 0;
    int column = 0;
    for (int j = 0; j < transformedInstance.numAttributes(); j++) {
      if ((m_ClassIndex != j) 
	  && (selectedAttributes[j])) {
	result += coefficients[column] * transformedInstance.value(j);
	column++;
      }
    }
    result += coefficients[column];
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Calculate a linear regression using the selected attributes
   *
<<<<<<< HEAD
   * @param selectedAttributes an array of booleans where each element is true
   *          if the corresponding attribute should be included in the
   *          regression.
   * @return an array of coefficients for the linear regression model.
   * @throws Exception if an error occurred during the regression.
   */
  protected double[] doRegression(boolean[] selectedAttributes)
    throws Exception {

    if (m_Debug) {
      System.out.print("doRegression(");
      for (boolean selectedAttribute : selectedAttributes) {
        System.out.print(" " + selectedAttribute);
=======
   * @param selectedAttributes an array of booleans where each element
   * is true if the corresponding attribute should be included in the
   * regression.
   * @return an array of coefficients for the linear regression model.
   * @throws Exception if an error occurred during the regression.
   */
  private double [] doRegression(boolean [] selectedAttributes) 
  throws Exception {

    if (b_Debug) {
      System.out.print("doRegression(");
      for (int i = 0; i < selectedAttributes.length; i++) {
	System.out.print(" " + selectedAttributes[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.out.println(" )");
    }
    int numAttributes = 0;
<<<<<<< HEAD
    for (boolean selectedAttribute : selectedAttributes) {
      if (selectedAttribute) {
        numAttributes++;
=======
    for (int i = 0; i < selectedAttributes.length; i++) {
      if (selectedAttributes[i]) {
	numAttributes++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // Check whether there are still attributes left
<<<<<<< HEAD
    Matrix independentTransposed = null;
    Vector dependent = null;
    if (numAttributes > 0) {
      independentTransposed = new DenseMatrix(numAttributes, m_TransformedData.numInstances());
      dependent = new DenseVector(m_TransformedData.numInstances());
      for (int i = 0; i < m_TransformedData.numInstances(); i++) {
        Instance inst = m_TransformedData.instance(i);
        double sqrt_weight = Math.sqrt(inst.weight());
        int row = 0;
        for (int j = 0; j < m_TransformedData.numAttributes(); j++) {
          if (j == m_ClassIndex) {
            dependent.set(i, inst.classValue() * sqrt_weight);
          } else {
            if (selectedAttributes[j]) {
              double value = inst.value(j) - m_Means[j];

              // We only need to do this if we want to
              // scale the input
              if (!m_checksTurnedOff) {
                value /= m_StdDevs[j];
              }
              independentTransposed.set(row, i, value * sqrt_weight);
              row++;
            }
          }
        }
      }
=======
    Matrix independent = null, dependent = null;
    if (numAttributes > 0) {
      independent = new Matrix(m_TransformedData.numInstances(), 
			       numAttributes);
      dependent = new Matrix(m_TransformedData.numInstances(), 1);
      for (int i = 0; i < m_TransformedData.numInstances(); i ++) {
	Instance inst = m_TransformedData.instance(i);
	double sqrt_weight = Math.sqrt(inst.weight());
	int column = 0;
	for (int j = 0; j < m_TransformedData.numAttributes(); j++) {
	  if (j == m_ClassIndex) {
	    dependent.set(i, 0, inst.classValue() * sqrt_weight);
	  } else {
	    if (selectedAttributes[j]) {
	      double value = inst.value(j) - m_Means[j];
	      
	      // We only need to do this if we want to
	      // scale the input
	      if (!m_checksTurnedOff) {
		value /= m_StdDevs[j];
	      }
	      independent.set(i, column, value * sqrt_weight);
	      column++;
	    }
	  }
	}
      }      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    // Compute coefficients (note that we have to treat the
    // intercept separately so that it doesn't get affected
    // by the ridge constant.)
    double[] coefficients = new double[numAttributes + 1];
    if (numAttributes > 0) {
<<<<<<< HEAD

      Vector aTy = independentTransposed.mult(dependent, new DenseVector(numAttributes));
      Matrix aTa = new UpperSymmDenseMatrix(numAttributes).rank1(independentTransposed);
      independentTransposed = null;
      dependent = null;

      boolean success = true;
      Vector coeffsWithoutIntercept = null;
      double ridge = getRidge();
      do {
        for (int i = 0; i < numAttributes; i++) {
          aTa.add(i, i, ridge);
        }
        try {
          coeffsWithoutIntercept = aTa.solve(aTy, new DenseVector(numAttributes));
          success = true;
        } catch (Exception ex) {
          for (int i = 0; i < numAttributes; i++) {
            aTa.add(i, i, -ridge);
          }
          ridge *= 10;
          success = false;
        }
      } while (!success);

      System.arraycopy(((DenseVector)coeffsWithoutIntercept).getData(), 0, coefficients, 0, numAttributes);
    }
    coefficients[numAttributes] = m_ClassMean;

    // Convert coefficients into original scale
    int column = 0;
    for (int i = 0; i < m_TransformedData.numAttributes(); i++) {
      if ((i != m_TransformedData.classIndex()) && (selectedAttributes[i])) {

        // We only need to do this if we have scaled the
        // input.
        if (!m_checksTurnedOff) {
          coefficients[column] /= m_StdDevs[i];
        }

        // We have centred the input
        coefficients[coefficients.length - 1] -=
          coefficients[column] * m_Means[i];
        column++;
=======
      double[] coeffsWithoutIntercept  =	
        independent.regression(dependent, m_Ridge).getCoefficients();
      System.arraycopy(coeffsWithoutIntercept, 0, coefficients, 0,
		       numAttributes);
    }
    coefficients[numAttributes] = m_ClassMean;
	   
    // Convert coefficients into original scale
    int column = 0;
    for(int i = 0; i < m_TransformedData.numAttributes(); i++) {
      if ((i != m_TransformedData.classIndex()) &&
	  (selectedAttributes[i])) {

	// We only need to do this if we have scaled the
	// input.
	if (!m_checksTurnedOff) {
	  coefficients[column] /= m_StdDevs[i];
	}

	// We have centred the input
	coefficients[coefficients.length - 1] -= 
	  coefficients[column] * m_Means[i];
	column++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    return coefficients;
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   *
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 13014 $");
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9770 $");
  }
 
  /**
   * Generates a linear regression function predictor.
   *
   * @param argv the options
   */
  public static void main(String argv[]) {
    runClassifier(new LinearRegression(), argv);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
