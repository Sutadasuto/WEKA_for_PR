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
 *    SymmetricalUncertAttributeEval.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.attributeSelection;

<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
=======
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.ContingencyTables;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
<<<<<<< HEAD
import weka.filters.Filter;
import weka.filters.supervised.attribute.Discretize;

/**
 * <!-- globalinfo-start --> SymmetricalUncertAttributeEval :<br/>
 * <br/>
 * Evaluates the worth of an attribute by measuring the symmetrical uncertainty
 * with respect to the class. <br/>
 * <br/>
 * SymmU(Class, Attribute) = 2 * (H(Class) - H(Class | Attribute)) / H(Class) +
 * H(Attribute).<br/>
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
 * @version $Revision: 10172 $
 * @see Discretize
 */
public class SymmetricalUncertAttributeEval extends ASEvaluation implements
  AttributeEvaluator, OptionHandler {

=======
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.supervised.attribute.Discretize;

import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * SymmetricalUncertAttributeEval :<br/>
 * <br/>
 * Evaluates the worth of an attribute by measuring the symmetrical uncertainty with respect to the class. <br/>
 * <br/>
 *  SymmU(Class, Attribute) = 2 * (H(Class) - H(Class | Attribute)) / H(Class) + H(Attribute).<br/>
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -M
 *  treat missing values as a seperate value.</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 5511 $
 * @see Discretize
 */
public class SymmetricalUncertAttributeEval
  extends ASEvaluation
  implements AttributeEvaluator, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  static final long serialVersionUID = -8096505776132296416L;

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

  /** Treat missing values as a seperate value */
  private boolean m_missing_merge;

  /**
   * Returns a string describing this attribute evaluator
<<<<<<< HEAD
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "SymmetricalUncertAttributeEval :\n\nEvaluates the worth of an attribute "
      + "by measuring the symmetrical uncertainty with respect to the class. "
      + "\n\n SymmU(Class, Attribute) = 2 * (H(Class) - H(Class | Attribute)) "
      + "/ H(Class) + H(Attribute).\n";
  }

  /**
   * Constructor
   */
  public SymmetricalUncertAttributeEval() {
    resetOptions();
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   **/
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>(1);
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
  public void setOptions(String[] options) throws Exception {
=======
   * @return a description of the evaluator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "SymmetricalUncertAttributeEval :\n\nEvaluates the worth of an attribute "
      +"by measuring the symmetrical uncertainty with respect to the class. "
      +"\n\n SymmU(Class, Attribute) = 2 * (H(Class) - H(Class | Attribute)) "
      +"/ H(Class) + H(Attribute).\n";
  }
  
  /**
   * Constructor
   */
  public SymmetricalUncertAttributeEval () {
    resetOptions();
  }


  /**
   * Returns an enumeration describing the available options.
   * @return an enumeration of all the available options.
   **/
  public Enumeration listOptions () {
    Vector newVector = new Vector(1);
    newVector.addElement(new Option("\ttreat missing values as a seperate " 
				    + "value.", "M", 0, "-M"));
    return  newVector.elements();
  }


  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -M
   *  treat missing values as a seperate value.</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   **/
  public void setOptions (String[] options)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    resetOptions();
    setMissingMerge(!(Utils.getFlag('M', options)));
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String missingMergeTipText() {
    return "Distribute counts for missing values. Counts are distributed "
      + "across other values in proportion to their frequency. Otherwise, "
      + "missing is treated as a separate value.";
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String missingMergeTipText() {
    return "Distribute counts for missing values. Counts are distributed "
      +"across other values in proportion to their frequency. Otherwise, "
      +"missing is treated as a separate value.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * distribute the counts for missing values across observed values
<<<<<<< HEAD
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
=======
   *
   * @param b true=distribute missing values.
   */
  public void setMissingMerge (boolean b) {
    m_missing_merge = b;
  }


  /**
   * get whether missing values are being distributed or not
   *
   * @return true if missing values are being distributed.
   */
  public boolean getMissingMerge () {
    return  m_missing_merge;
  }


  /**
   * Gets the current settings of WrapperSubsetEval.
   * @return an array of strings suitable for passing to setOptions()
   */
  public String[] getOptions () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String[] options = new String[1];
    int current = 0;

    if (!getMissingMerge()) {
      options[current++] = "-M";
    }

    while (current < options.length) {
      options[current++] = "";
    }

<<<<<<< HEAD
    return options;
=======
    return  options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the capabilities of this evaluator.
<<<<<<< HEAD
   * 
   * @return the capabilities of this evaluator
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

=======
   *
   * @return            the capabilities of this evaluator
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

=======
    
    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
<<<<<<< HEAD
   * Initializes a symmetrical uncertainty attribute evaluator. Discretizes all
   * attributes that are numeric.
   * 
   * @param data set of instances serving as training data
   * @throws Exception if the evaluator has not been generated successfully
   */
  @Override
  public void buildEvaluator(Instances data) throws Exception {
=======
   * Initializes a symmetrical uncertainty attribute evaluator. 
   * Discretizes all attributes that are numeric.
   *
   * @param data set of instances serving as training data 
   * @throws Exception if the evaluator has not been 
   * generated successfully
   */
  public void buildEvaluator (Instances data)
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

<<<<<<< HEAD
  /**
   * set options to default values
   */
  protected void resetOptions() {
=======

  /**
   * set options to default values
   */
  protected void resetOptions () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_trainInstances = null;
    m_missing_merge = true;
  }

<<<<<<< HEAD
  /**
   * evaluates an individual attribute by measuring the symmetrical uncertainty
   * between it and the class.
   * 
=======

  /**
   * evaluates an individual attribute by measuring the symmetrical
   * uncertainty between it and the class.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param attribute the index of the attribute to be evaluated
   * @return the uncertainty
   * @throws Exception if the attribute could not be evaluated
   */
<<<<<<< HEAD
  @Override
  public double evaluateAttribute(int attribute) throws Exception {
    int i, j, ii, jj;
    int ni, nj;
=======
  public double evaluateAttribute (int attribute)
    throws Exception {
    int i, j, ii, jj;
    int nnj, nni, ni, nj;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
<<<<<<< HEAD
        sumj[j] = 0.0;
        counts[i][j] = 0.0;
=======
	sumj[j] = 0.0;
	counts[i][j] = 0.0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // Fill the contingency table
    for (i = 0; i < m_numInstances; i++) {
      inst = m_trainInstances.instance(i);

      if (inst.isMissing(attribute)) {
<<<<<<< HEAD
        ii = ni - 1;
      } else {
        ii = (int) inst.value(attribute);
      }

      if (inst.isMissing(m_classIndex)) {
        jj = nj - 1;
      } else {
        jj = (int) inst.value(m_classIndex);
=======
	ii = ni - 1;
      }
      else {
	ii = (int)inst.value(attribute);
      }

      if (inst.isMissing(m_classIndex)) {
	jj = nj - 1;
      }
      else {
	jj = (int)inst.value(m_classIndex);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      counts[ii][jj]++;
    }

    // get the row totals
    for (i = 0; i < ni; i++) {
      sumi[i] = 0.0;

      for (j = 0; j < nj; j++) {
<<<<<<< HEAD
        sumi[i] += counts[i][j];
        sum += counts[i][j];
=======
	sumi[i] += counts[i][j];
	sum += counts[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // get the column totals
    for (j = 0; j < nj; j++) {
      sumj[j] = 0.0;

      for (i = 0; i < ni; i++) {
<<<<<<< HEAD
        sumj[j] += counts[i][j];
=======
	sumj[j] += counts[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // distribute missing counts
<<<<<<< HEAD
    if (m_missing_merge && (sumi[ni - 1] < m_numInstances)
      && (sumj[nj - 1] < m_numInstances)) {
=======
    if (m_missing_merge && 
	(sumi[ni-1] < m_numInstances) && 
	(sumj[nj-1] < m_numInstances)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      double[] i_copy = new double[sumi.length];
      double[] j_copy = new double[sumj.length];
      double[][] counts_copy = new double[sumi.length][sumj.length];

      for (i = 0; i < ni; i++) {
<<<<<<< HEAD
        System.arraycopy(counts[i], 0, counts_copy[i], 0, sumj.length);
=======
	System.arraycopy(counts[i], 0, counts_copy[i], 0, sumj.length);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      System.arraycopy(sumi, 0, i_copy, 0, sumi.length);
      System.arraycopy(sumj, 0, j_copy, 0, sumj.length);
<<<<<<< HEAD
      double total_missing = (sumi[ni - 1] + sumj[nj - 1] - counts[ni - 1][nj - 1]);

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
=======
      double total_missing = (sumi[ni - 1] + sumj[nj - 1] 
			      - counts[ni - 1][nj - 1]);

      // do the missing i's
      if (sumi[ni - 1] > 0.0) {
	for (j = 0; j < nj - 1; j++) {
	  if (counts[ni - 1][j] > 0.0) {
	    for (i = 0; i < ni - 1; i++) {
	      temp = ((i_copy[i]/(sum - i_copy[ni - 1])) * 
		      counts[ni - 1][j]);
	      counts[i][j] += temp;
	      sumi[i] += temp;
	    }

	    counts[ni - 1][j] = 0.0;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      sumi[ni - 1] = 0.0;

      // do the missing j's
      if (sumj[nj - 1] > 0.0) {
<<<<<<< HEAD
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
=======
	for (i = 0; i < ni - 1; i++) {
	  if (counts[i][nj - 1] > 0.0) {
	    for (j = 0; j < nj - 1; j++) {
	      temp = ((j_copy[j]/(sum - j_copy[nj - 1]))*counts[i][nj - 1]);
	      counts[i][j] += temp;
	      sumj[j] += temp;
	    }

	    counts[i][nj - 1] = 0.0;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      sumj[nj - 1] = 0.0;

      // do the both missing
      if (counts[ni - 1][nj - 1] > 0.0 && total_missing != sum) {
<<<<<<< HEAD
        for (i = 0; i < ni - 1; i++) {
          for (j = 0; j < nj - 1; j++) {
            temp = (counts_copy[i][j] / (sum - total_missing))
              * counts_copy[ni - 1][nj - 1];
            counts[i][j] += temp;
            sumi[i] += temp;
            sumj[j] += temp;
          }
        }

        counts[ni - 1][nj - 1] = 0.0;
      }
    }

    return ContingencyTables.symmetricalUncertainty(counts);
  }

  /**
   * Return a description of the evaluator
   * 
   * @return description as a string
   */
  @Override
  public String toString() {
=======
	for (i = 0; i < ni - 1; i++) {
	  for (j = 0; j < nj - 1; j++) {
	    temp = (counts_copy[i][j]/(sum - total_missing)) * 
	      counts_copy[ni - 1][nj - 1];
	    counts[i][j] += temp;
	    sumi[i] += temp;
	    sumj[j] += temp;
	  }
	}

	counts[ni - 1][nj - 1] = 0.0;
      }
    }

    return  ContingencyTables.symmetricalUncertainty(counts);
  }


  /**
   * Return a description of the evaluator
   * @return description as a string
   */
  public String toString () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    StringBuffer text = new StringBuffer();

    if (m_trainInstances == null) {
      text.append("\tSymmetrical Uncertainty evaluator has not been built");
<<<<<<< HEAD
    } else {
      text.append("\tSymmetrical Uncertainty Ranking Filter");
      if (!m_missing_merge) {
        text.append("\n\tMissing values treated as seperate");
=======
    }
    else {
      text.append("\tSymmetrical Uncertainty Ranking Filter");
      if (!m_missing_merge) {
	text.append("\n\tMissing values treated as seperate");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    text.append("\n");
<<<<<<< HEAD
    return text.toString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10172 $");
=======
    return  text.toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5511 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  // ============
  // Test method.
  // ============
  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv should contain the following arguments: -t training file
   */
  public static void main(String[] argv) {
=======
   *
   * @param argv should contain the following arguments:
   * -t training file
   */
  public static void main (String[] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runEvaluator(new SymmetricalUncertAttributeEval(), argv);
  }
}
