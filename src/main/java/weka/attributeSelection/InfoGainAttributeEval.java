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
 *    InfoGainAttributeEval.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.attributeSelection;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.ContingencyTables;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.Capabilities.Capability;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.filters.Filter;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.unsupervised.attribute.NumericToBinary;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> InfoGainAttributeEval :<br/>
 * <br/>
 * Evaluates the worth of an attribute by measuring the information gain with
 * respect to the class.<br/>
 * <br/>
 * InfoGain(Class,Attribute) = H(Class) - H(Class | Attribute).<br/>
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
 * <pre>
 * -B
 *  just binarize numeric attributes instead 
 *  of properly discretizing them.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10172 $
 * @see Discretize
 * @see NumericToBinary
 */
public class InfoGainAttributeEval extends ASEvaluation implements
  AttributeEvaluator, OptionHandler {

<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * InfoGainAttributeEval :<br/>
 * <br/>
 * Evaluates the worth of an attribute by measuring the information gain with respect to the class.<br/>
 * <br/>
 * InfoGain(Class,Attribute) = H(Class) - H(Class | Attribute).<br/>
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -M
 *  treat missing values as a seperate value.</pre>
 * 
 * <pre> -B
 *  just binarize numeric attributes instead 
 *  of properly discretizing them.</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 5511 $
 * @see Discretize
 * @see NumericToBinary
 */
public class InfoGainAttributeEval
  extends ASEvaluation
  implements AttributeEvaluator, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -1949849512589218930L;

  /** Treat missing values as a seperate value */
  private boolean m_missing_merge;

  /** Just binarize numeric attributes */
  private boolean m_Binarize;

  /** The info gain for each attribute */
  private double[] m_InfoGains;

  /**
   * Returns a string describing this attribute evaluator
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "InfoGainAttributeEval :\n\nEvaluates the worth of an attribute "
      + "by measuring the information gain with respect to the class.\n\n"
      + "InfoGain(Class,Attribute) = H(Class) - H(Class | Attribute).\n";
<<<<<<< HEAD
=======
=======
   * @return a description of the evaluator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "InfoGainAttributeEval :\n\nEvaluates the worth of an attribute "
      +"by measuring the information gain with respect to the class.\n\n"
      +"InfoGain(Class,Attribute) = H(Class) - H(Class | Attribute).\n";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Constructor
   */
<<<<<<< HEAD
  public InfoGainAttributeEval() {
=======
<<<<<<< HEAD
  public InfoGainAttributeEval() {
=======
  public InfoGainAttributeEval () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    resetOptions();
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of all the available options.
   **/
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>(2);
    newVector.addElement(new Option("\ttreat missing values as a seperate "
      + "value.", "M", 0, "-M"));
    newVector.addElement(new Option(
      "\tjust binarize numeric attributes instead \n"
        + "\tof properly discretizing them.", "B", 0, "-B"));
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
   * <pre>
   * -B
   *  just binarize numeric attributes instead 
   *  of properly discretizing them.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
<<<<<<< HEAD
=======
=======
   * @return an enumeration of all the available options.
   **/
  public Enumeration listOptions () {
    Vector newVector = new Vector(2);
    newVector.addElement(new Option("\ttreat missing values as a seperate " 
                                    + "value.", "M", 0, "-M"));
    newVector.addElement(new Option("\tjust binarize numeric attributes instead \n" 
                                    +"\tof properly discretizing them.", "B", 0, 
                                    "-B"));
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
   * <pre> -B
   *  just binarize numeric attributes instead 
   *  of properly discretizing them.</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions (String[] options)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    resetOptions();
    setMissingMerge(!(Utils.getFlag('M', options)));
    setBinarizeNumericAttributes(Utils.getFlag('B', options));
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Gets the current settings of WrapperSubsetEval.
   * 
   * @return an array of strings suitable for passing to setOptions()
   */
  @Override
  public String[] getOptions() {
<<<<<<< HEAD
=======
=======

  /**
   * Gets the current settings of WrapperSubsetEval.
   *
   * @return an array of strings suitable for passing to setOptions()
   */
  public String[] getOptions () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String[] options = new String[2];
    int current = 0;

    if (!getMissingMerge()) {
      options[current++] = "-M";
    }
    if (getBinarizeNumericAttributes()) {
      options[current++] = "-B";
    }

    while (current < options.length) {
      options[current++] = "";
    }

<<<<<<< HEAD
    return options;
=======
<<<<<<< HEAD
    return options;
=======
    return  options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String binarizeNumericAttributesTipText() {
    return "Just binarize numeric attributes instead of properly discretizing them.";
  }

  /**
   * Binarize numeric attributes.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param b true=binarize numeric attributes
   */
  public void setBinarizeNumericAttributes(boolean b) {
    m_Binarize = b;
  }

  /**
   * get whether numeric attributes are just being binarized.
   * 
   * @return true if missing values are being distributed.
   */
  public boolean getBinarizeNumericAttributes() {
    return m_Binarize;
<<<<<<< HEAD
=======
=======
   *
   * @param b true=binarize numeric attributes
   */
  public void setBinarizeNumericAttributes (boolean b) {
    m_Binarize = b;
  }


  /**
   * get whether numeric attributes are just being binarized.
   *
   * @return true if missing values are being distributed.
   */
  public boolean getBinarizeNumericAttributes () {
    return  m_Binarize;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String missingMergeTipText() {
    return "Distribute counts for missing values. Counts are distributed "
      + "across other values in proportion to their frequency. Otherwise, "
      + "missing is treated as a separate value.";
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String missingMergeTipText() {
    return "Distribute counts for missing values. Counts are distributed "
      +"across other values in proportion to their frequency. Otherwise, "
      +"missing is treated as a separate value.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * distribute the counts for missing values across observed values
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
=======
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
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the capabilities of this evaluator.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of this evaluator
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

<<<<<<< HEAD
=======
=======
   *
   * @return            the capabilities of this evaluator
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

<<<<<<< HEAD
=======
=======
    
    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Initializes an information gain attribute evaluator. Discretizes all
   * attributes that are numeric.
   * 
   * @param data set of instances serving as training data
   * @throws Exception if the evaluator has not been generated successfully
   */
  @Override
  public void buildEvaluator(Instances data) throws Exception {

<<<<<<< HEAD
=======
=======
   * Initializes an information gain attribute evaluator.
   * Discretizes all attributes that are numeric.
   *
   * @param data set of instances serving as training data 
   * @throws Exception if the evaluator has not been 
   * generated successfully
   */
  public void buildEvaluator (Instances data)
    throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // can evaluator handle data?
    getCapabilities().testWithFail(data);

    int classIndex = data.classIndex();
    int numInstances = data.numInstances();
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (!m_Binarize) {
      Discretize disTransform = new Discretize();
      disTransform.setUseBetterEncoding(true);
      disTransform.setInputFormat(data);
      data = Filter.useFilter(data, disTransform);
    } else {
      NumericToBinary binTransform = new NumericToBinary();
      binTransform.setInputFormat(data);
      data = Filter.useFilter(data, binTransform);
<<<<<<< HEAD
    }
=======
<<<<<<< HEAD
    }
=======
    }      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int numClasses = data.attribute(classIndex).numValues();

    // Reserve space and initialize counters
    double[][][] counts = new double[data.numAttributes()][][];
    for (int k = 0; k < data.numAttributes(); k++) {
      if (k != classIndex) {
        int numValues = data.attribute(k).numValues();
        counts[k] = new double[numValues + 1][numClasses + 1];
      }
    }

    // Initialize counters
    double[] temp = new double[numClasses + 1];
    for (int k = 0; k < numInstances; k++) {
      Instance inst = data.instance(k);
      if (inst.classIsMissing()) {
        temp[numClasses] += inst.weight();
      } else {
<<<<<<< HEAD
        temp[(int) inst.classValue()] += inst.weight();
=======
<<<<<<< HEAD
        temp[(int) inst.classValue()] += inst.weight();
=======
        temp[(int)inst.classValue()] += inst.weight();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    for (int k = 0; k < counts.length; k++) {
      if (k != classIndex) {
        for (int i = 0; i < temp.length; i++) {
          counts[k][0][i] = temp[i];
        }
      }
    }

    // Get counts
    for (int k = 0; k < numInstances; k++) {
      Instance inst = data.instance(k);
      for (int i = 0; i < inst.numValues(); i++) {
        if (inst.index(i) != classIndex) {
          if (inst.isMissingSparse(i) || inst.classIsMissing()) {
            if (!inst.isMissingSparse(i)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              counts[inst.index(i)][(int) inst.valueSparse(i)][numClasses] += inst
                .weight();
              counts[inst.index(i)][0][numClasses] -= inst.weight();
            } else if (!inst.classIsMissing()) {
              counts[inst.index(i)][data.attribute(inst.index(i)).numValues()][(int) inst
                .classValue()] += inst.weight();
              counts[inst.index(i)][0][(int) inst.classValue()] -= inst
                .weight();
            } else {
              counts[inst.index(i)][data.attribute(inst.index(i)).numValues()][numClasses] += inst
                .weight();
              counts[inst.index(i)][0][numClasses] -= inst.weight();
            }
          } else {
            counts[inst.index(i)][(int) inst.valueSparse(i)][(int) inst
              .classValue()] += inst.weight();
            counts[inst.index(i)][0][(int) inst.classValue()] -= inst.weight();
<<<<<<< HEAD
=======
=======
              counts[inst.index(i)][(int)inst.valueSparse(i)][numClasses] += 
                inst.weight();
              counts[inst.index(i)][0][numClasses] -= inst.weight();
            } else if (!inst.classIsMissing()) {
              counts[inst.index(i)][data.attribute(inst.index(i)).numValues()]
                [(int)inst.classValue()] += inst.weight();
              counts[inst.index(i)][0][(int)inst.classValue()] -= 
                inst.weight();
            } else {
              counts[inst.index(i)][data.attribute(inst.index(i)).numValues()]
                [numClasses] += inst.weight();
              counts[inst.index(i)][0][numClasses] -= inst.weight();
            }
          } else {
            counts[inst.index(i)][(int)inst.valueSparse(i)]
              [(int)inst.classValue()] += inst.weight();
            counts[inst.index(i)][0][(int)inst.classValue()] -= inst.weight();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      }
    }

    // distribute missing counts if required
    if (m_missing_merge) {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (int k = 0; k < data.numAttributes(); k++) {
        if (k != classIndex) {
          int numValues = data.attribute(k).numValues();

          // Compute marginals
          double[] rowSums = new double[numValues];
          double[] columnSums = new double[numClasses];
          double sum = 0;
          for (int i = 0; i < numValues; i++) {
            for (int j = 0; j < numClasses; j++) {
              rowSums[i] += counts[k][i][j];
              columnSums[j] += counts[k][i][j];
            }
            sum += rowSums[i];
          }

          if (Utils.gr(sum, 0)) {
            double[][] additions = new double[numValues][numClasses];

            // Compute what needs to be added to each row
            for (int i = 0; i < numValues; i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              for (int j = 0; j < numClasses; j++) {
                additions[i][j] = (rowSums[i] / sum) * counts[k][numValues][j];
              }
            }

            // Compute what needs to be added to each column
            for (int i = 0; i < numClasses; i++) {
              for (int j = 0; j < numValues; j++) {
                additions[j][i] += (columnSums[i] / sum)
                  * counts[k][j][numClasses];
              }
            }

            // Compute what needs to be added to each cell
            for (int i = 0; i < numClasses; i++) {
              for (int j = 0; j < numValues; j++) {
                additions[j][i] += (counts[k][j][i] / sum)
                  * counts[k][numValues][numClasses];
              }
            }

<<<<<<< HEAD
=======
=======
              for (int j = 0; j  < numClasses; j++) {
                additions[i][j] = (rowSums[i] / sum) * counts[k][numValues][j];
              }
            }
            
            // Compute what needs to be added to each column
            for (int i = 0; i < numClasses; i++) {
              for (int j = 0; j  < numValues; j++) {
                additions[j][i] += (columnSums[i] / sum) * 
                  counts[k][j][numClasses];
              }
            }
            
            // Compute what needs to be added to each cell
            for (int i = 0; i < numClasses; i++) {
              for (int j = 0; j  < numValues; j++) {
                additions[j][i] += (counts[k][j][i] / sum) * 
                  counts[k][numValues][numClasses];
              }
            }
            
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            // Make new contingency table
            double[][] newTable = new double[numValues][numClasses];
            for (int i = 0; i < numValues; i++) {
              for (int j = 0; j < numClasses; j++) {
                newTable[i][j] = counts[k][i][j] + additions[i][j];
              }
            }
            counts[k] = newTable;
          }
        }
      }
    }

    // Compute info gains
    m_InfoGains = new double[data.numAttributes()];
    for (int i = 0; i < data.numAttributes(); i++) {
      if (i != classIndex) {
<<<<<<< HEAD
        m_InfoGains[i] = (ContingencyTables.entropyOverColumns(counts[i]) - ContingencyTables
          .entropyConditionedOnRows(counts[i]));
=======
<<<<<<< HEAD
        m_InfoGains[i] = (ContingencyTables.entropyOverColumns(counts[i]) - ContingencyTables
          .entropyConditionedOnRows(counts[i]));
=======
        m_InfoGains[i] = 
          (ContingencyTables.entropyOverColumns(counts[i]) 
           - ContingencyTables.entropyConditionedOnRows(counts[i]));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Reset options to their default values
   */
<<<<<<< HEAD
  protected void resetOptions() {
=======
<<<<<<< HEAD
  protected void resetOptions() {
=======
  protected void resetOptions () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_InfoGains = null;
    m_missing_merge = true;
    m_Binarize = false;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * evaluates an individual attribute by measuring the amount of information
   * gained about the class given the attribute.
   * 
<<<<<<< HEAD
=======
=======

  /**
   * evaluates an individual attribute by measuring the amount
   * of information gained about the class given the attribute.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param attribute the index of the attribute to be evaluated
   * @return the info gain
   * @throws Exception if the attribute could not be evaluated
   */
<<<<<<< HEAD
  @Override
  public double evaluateAttribute(int attribute) throws Exception {
=======
<<<<<<< HEAD
  @Override
  public double evaluateAttribute(int attribute) throws Exception {
=======
  public double evaluateAttribute (int attribute)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return m_InfoGains[attribute];
  }

  /**
   * Describe the attribute evaluator
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the attribute evaluator as a string
   */
  @Override
  public String toString() {
<<<<<<< HEAD
=======
=======
   * @return a description of the attribute evaluator as a string
   */
  public String toString () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    StringBuffer text = new StringBuffer();

    if (m_InfoGains == null) {
      text.append("Information Gain attribute evaluator has not been built");
<<<<<<< HEAD
    } else {
=======
<<<<<<< HEAD
    } else {
=======
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      text.append("\tInformation Gain Ranking Filter");
      if (!m_missing_merge) {
        text.append("\n\tMissing values treated as seperate");
      }
      if (m_Binarize) {
        text.append("\n\tNumeric attributes are just binarized");
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

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
    return RevisionUtils.extract("$Revision: 10172 $");
  }

<<<<<<< HEAD
=======
=======
    
    text.append("\n");
    return  text.toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5511 $");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  // ============
  // Test method.
  // ============
  /**
   * Main method for testing this class.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args the options
   */
  public static void main(String[] args) {
<<<<<<< HEAD
=======
=======
   *
   * @param args the options
   */
  public static void main (String[] args) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    runEvaluator(new InfoGainAttributeEval(), args);
  }
}
