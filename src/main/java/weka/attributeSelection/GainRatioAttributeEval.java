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
 *    GainRatioAttributeEval.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.attributeSelection;

import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.ContingencyTables;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.supervised.attribute.Discretize;

/**
 * <!-- globalinfo-start --> GainRatioAttributeEval :<br/>
 * <br/>
 * Evaluates the worth of an attribute by measuring the gain ratio with respect
 * to the class.<br/>
 * <br/>
 * GainR(Class, Attribute) = (H(Class) - H(Class | Attribute)) / H(Attribute).<br/>
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -M
 *  treat missing values as a seperate value.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 11215 $
 * @see Discretize
 */
public class GainRatioAttributeEval extends ASEvaluation implements
  AttributeEvaluator, OptionHandler {
=======
 * @version $Revision: 11219 $
 * @see Discretize
 */
public class GainRatioAttributeEval
  extends ASEvaluation
  implements AttributeEvaluator, OptionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  static final long serialVersionUID = -8504656625598579926L;

  /** The training instances */
  private Instances m_trainInstances;

  /** The class index */
  private int m_classIndex;

<<<<<<< HEAD
=======
  /** The number of attributes */
  private int m_numAttribs;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The number of instances */
  private int m_numInstances;

  /** The number of classes */
  private int m_numClasses;

  /** Merge missing values */
  private boolean m_missing_merge;

  /**
   * Returns a string describing this attribute evaluator
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "GainRatioAttributeEval :\n\nEvaluates the worth of an attribute "
      + "by measuring the gain ratio with respect to the class.\n\n"
      + "GainR(Class, Attribute) = (H(Class) - H(Class | Attribute)) / "
      + "H(Attribute).\n";
  }

  /**
   * Constructor
   */
  public GainRatioAttributeEval() {
    resetOptions();
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   **/
  @Override
<<<<<<< HEAD
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>(1);
=======
  public Enumeration listOptions() {
    Vector newVector = new Vector(1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    newVector.addElement(new Option("\ttreat missing values as a seperate "
      + "value.", "M", 0, "-M"));
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
   * -M
   *  treat missing values as a seperate value.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   **/
  @Override
<<<<<<< HEAD
  public void setOptions(String[] options) throws Exception {
=======
  public void setOptions(String[] options)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    resetOptions();
    setMissingMerge(!(Utils.getFlag('M', options)));
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String missingMergeTipText() {
    return "Distribute counts for missing values. Counts are distributed "
      + "across other values in proportion to their frequency. Otherwise, "
      + "missing is treated as a separate value.";
  }

  /**
   * distribute the counts for missing values across observed values
   * 
   * @param b true=distribute missing values.
   */
  public void setMissingMerge(boolean b) {
    m_missing_merge = b;
  }

  /**
   * get whether missing values are being distributed or not
   * 
   * @return true if missing values are being distributed.
   */
  public boolean getMissingMerge() {
    return m_missing_merge;
  }

  /**
   * Gets the current settings of WrapperSubsetEval.
   * 
   * @return an array of strings suitable for passing to setOptions()
   */
  @Override
  public String[] getOptions() {
    String[] options = new String[1];
<<<<<<< HEAD

    if (!getMissingMerge()) {
      options[0] = "-M";
    } else {
      options[0] = "";
=======
    int current = 0;

    if (!getMissingMerge()) {
      options[current++] = "-M";
    }

    while (current < options.length) {
      options[current++] = "";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return options;
  }

  /**
   * Returns the capabilities of this evaluator.
   * 
   * @return the capabilities of this evaluator
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

    return result;
  }

  /**
   * Initializes a gain ratio attribute evaluator. Discretizes all attributes
   * that are numeric.
   * 
   * @param data set of instances serving as training data
   * @throws Exception if the evaluator has not been generated successfully
   */
  @Override
<<<<<<< HEAD
  public void buildEvaluator(Instances data) throws Exception {
=======
  public void buildEvaluator(Instances data)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // can evaluator handle data?
    getCapabilities().testWithFail(data);

    m_trainInstances = data;
    m_classIndex = m_trainInstances.classIndex();
<<<<<<< HEAD
=======
    m_numAttribs = m_trainInstances.numAttributes();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_numInstances = m_trainInstances.numInstances();
    Discretize disTransform = new Discretize();
    disTransform.setUseBetterEncoding(true);
    disTransform.setInputFormat(m_trainInstances);
    m_trainInstances = Filter.useFilter(m_trainInstances, disTransform);
    m_numClasses = m_trainInstances.attribute(m_classIndex).numValues();
  }

  /**
   * reset options to default values
   */
  protected void resetOptions() {
    m_trainInstances = null;
    m_missing_merge = true;
  }

  /**
   * evaluates an individual attribute by measuring the gain ratio of the class
   * given the attribute.
   * 
   * @param attribute the index of the attribute to be evaluated
   * @return the gain ratio
   * @throws Exception if the attribute could not be evaluated
   */
  @Override
<<<<<<< HEAD
  public double evaluateAttribute(int attribute) throws Exception {
=======
  public double evaluateAttribute(int attribute)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int i, j, ii, jj;
    int ni, nj;
    double sum = 0.0;
    ni = m_trainInstances.attribute(attribute).numValues() + 1;
    nj = m_numClasses + 1;
    double[] sumi, sumj;
    Instance inst;
    double temp = 0.0;
    sumi = new double[ni];
    sumj = new double[nj];
    double[][] counts = new double[ni][nj];
    sumi = new double[ni];
    sumj = new double[nj];

    for (i = 0; i < ni; i++) {
      sumi[i] = 0.0;

      for (j = 0; j < nj; j++) {
        sumj[j] = 0.0;
        counts[i][j] = 0.0;
      }
    }

    // Fill the contingency table
    for (i = 0; i < m_numInstances; i++) {
      inst = m_trainInstances.instance(i);

      if (inst.isMissing(attribute)) {
        ii = ni - 1;
<<<<<<< HEAD
      } else {
=======
      }
      else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        ii = (int) inst.value(attribute);
      }

      if (inst.isMissing(m_classIndex)) {
        jj = nj - 1;
<<<<<<< HEAD
      } else {
=======
      }
      else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        jj = (int) inst.value(m_classIndex);
      }

      counts[ii][jj] += inst.weight();
    }

    // get the row totals
    for (i = 0; i < ni; i++) {
      sumi[i] = 0.0;

      for (j = 0; j < nj; j++) {
        sumi[i] += counts[i][j];
        sum += counts[i][j];
      }
    }

    // get the column totals
    for (j = 0; j < nj; j++) {
      sumj[j] = 0.0;

      for (i = 0; i < ni; i++) {
        sumj[j] += counts[i][j];
      }
    }

    // distribute missing counts
<<<<<<< HEAD
    if (m_missing_merge && (sumi[ni - 1] < sum) && (sumj[nj - 1] < sum)) {
=======
    if (m_missing_merge &&
      (sumi[ni - 1] < sum) &&
      (sumj[nj - 1] < sum)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      double[] i_copy = new double[sumi.length];
      double[] j_copy = new double[sumj.length];
      double[][] counts_copy = new double[sumi.length][sumj.length];

      for (i = 0; i < ni; i++) {
        System.arraycopy(counts[i], 0, counts_copy[i], 0, sumj.length);
      }

      System.arraycopy(sumi, 0, i_copy, 0, sumi.length);
      System.arraycopy(sumj, 0, j_copy, 0, sumj.length);
<<<<<<< HEAD
      double total_missing =
        (sumi[ni - 1] + sumj[nj - 1] - counts[ni - 1][nj - 1]);
=======
      double total_missing = (sumi[ni - 1] + sumj[nj - 1] -
        counts[ni - 1][nj - 1]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      // do the missing i's
      if (sumi[ni - 1] > 0.0) {
        for (j = 0; j < nj - 1; j++) {
          if (counts[ni - 1][j] > 0.0) {
            for (i = 0; i < ni - 1; i++) {
              temp = ((i_copy[i] / (sum - i_copy[ni - 1])) * counts[ni - 1][j]);
              counts[i][j] += temp;
              sumi[i] += temp;
            }

            counts[ni - 1][j] = 0.0;
          }
        }
      }

      sumi[ni - 1] = 0.0;

      // do the missing j's
      if (sumj[nj - 1] > 0.0) {
        for (i = 0; i < ni - 1; i++) {
          if (counts[i][nj - 1] > 0.0) {
            for (j = 0; j < nj - 1; j++) {
              temp = ((j_copy[j] / (sum - j_copy[nj - 1])) * counts[i][nj - 1]);
              counts[i][j] += temp;
              sumj[j] += temp;
            }

            counts[i][nj - 1] = 0.0;
          }
        }
      }

      sumj[nj - 1] = 0.0;

      // do the both missing
      if (counts[ni - 1][nj - 1] > 0.0 && total_missing < sum) {
        for (i = 0; i < ni - 1; i++) {
          for (j = 0; j < nj - 1; j++) {
<<<<<<< HEAD
            temp = (counts_copy[i][j] / (sum - total_missing))
              * counts_copy[ni - 1][nj - 1];
=======
            temp = (counts_copy[i][j] / (sum - total_missing)) *
              counts_copy[ni - 1][nj - 1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            counts[i][j] += temp;
            sumi[i] += temp;
            sumj[j] += temp;
          }
        }

        counts[ni - 1][nj - 1] = 0.0;
      }
    }

    return ContingencyTables.gainRatio(counts);
  }

  /**
   * Return a description of the evaluator
   * 
   * @return description as a string
   */
  @Override
  public String toString() {
    StringBuffer text = new StringBuffer();

    if (m_trainInstances == null) {
      text.append("\tGain Ratio evaluator has not been built");
<<<<<<< HEAD
    } else {
=======
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      text.append("\tGain Ratio feature evaluator");

      if (!m_missing_merge) {
        text.append("\n\tMissing values treated as seperate");
      }
    }

    text.append("\n");
    return text.toString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 11215 $");
=======
    return RevisionUtils.extract("$Revision: 11219 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  @Override
  public int[] postProcess(int[] attributeSet) {

    // save memory
    m_trainInstances = new Instances(m_trainInstances, 0);

    return attributeSet;
  }

  /**
   * Main method.
   * 
   * @param args the options -t training file
   */
  public static void main(String[] args) {
    runEvaluator(new GainRatioAttributeEval(), args);
  }
}
