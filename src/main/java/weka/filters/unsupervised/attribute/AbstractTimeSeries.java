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
 *    AbstractTimeSeries.java
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

package weka.filters.unsupervised.attribute;

import java.util.Enumeration;
import java.util.Vector;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import weka.core.*;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

/**
 * An abstract instance filter that assumes instances form time-series data and
 * performs some merging of attribute values in the current instance with
 * attribute attribute values of some previous (or future) instance. For
 * instances where the desired value is unknown either the instance may be
 * dropped, or missing values used.
 * <p>
 * 
 * Valid filter-specific options are:
 * <p>
 * 
 * -R index1,index2-index4,...<br>
 * Specify list of columns to calculate new values for. First and last are valid
 * indexes. (default none)
 * <p>
 * 
 * -V <br>
 * Invert matching sense (i.e. calculate for all non-specified columns)
 * <p>
 * 
 * -I num <br>
 * The number of instances forward to merge values between. A negative number
 * indicates taking values from a past instance. (default -1)
 * <p>
 * 
 * -M <br>
 * For instances at the beginning or end of the dataset where the translated
 * values are not known, remove those instances (default is to use missing
 * values).
 * <p>
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public abstract class AbstractTimeSeries extends Filter implements
  UnsupervisedFilter, OptionHandler, WeightedAttributesHandler, WeightedInstancesHandler {
<<<<<<< HEAD
=======
=======
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Queue;
import weka.core.Range;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

/** 
 * An abstract instance filter that assumes instances form time-series data and
 * performs some merging of attribute values in the current instance with 
 * attribute attribute values of some previous (or future) instance. For
 * instances where the desired value is unknown either the instance may
 * be dropped, or missing values used.<p>
 *
 * Valid filter-specific options are:<p>
 *
 * -R index1,index2-index4,...<br>
 * Specify list of columns to calculate new values for.
 * First and last are valid indexes.
 * (default none)<p>
 *
 * -V <br>
 * Invert matching sense (i.e. calculate for all non-specified columns)<p>
 *
 * -I num <br>
 * The number of instances forward to merge values between.
 * A negative number indicates taking values from a past instance.
 * (default -1) <p>
 *
 * -M <br>
 * For instances at the beginning or end of the dataset where the translated
 * values are not known, remove those instances (default is to use missing 
 * values). <p>
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 1.8 $
 */
public abstract class AbstractTimeSeries
  extends Filter
  implements UnsupervisedFilter, OptionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -3795656792078022357L;

  /** Stores which columns to copy */
  protected Range m_SelectedCols = new Range();

  /**
<<<<<<< HEAD
   * True if missing values should be used rather than removing instances where
   * the translated value is not known (due to border effects).
=======
<<<<<<< HEAD
   * True if missing values should be used rather than removing instances where
   * the translated value is not known (due to border effects).
=======
   * True if missing values should be used rather than removing instances
   * where the translated value is not known (due to border effects).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected boolean m_FillWithMissing = true;

  /**
<<<<<<< HEAD
   * The number of instances forward to translate values between. A negative
   * number indicates taking values from a past instance.
=======
<<<<<<< HEAD
   * The number of instances forward to translate values between. A negative
   * number indicates taking values from a past instance.
=======
   * The number of instances forward to translate values between.
   * A negative number indicates taking values from a past instance.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected int m_InstanceRange = -1;

  /** Stores the historical instances to copy values between */
  protected Queue m_History;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(4);

    newVector.addElement(new Option(
      "\tSpecify list of columns to translate in time. First and\n"
        + "\tlast are valid indexes. (default none)", "R", 1,
      "-R <index1,index2-index4,...>"));
    newVector.addElement(new Option(
      "\tInvert matching sense (i.e. calculate for all non-specified columns)",
      "V", 0, "-V"));
    newVector.addElement(new Option(
      "\tThe number of instances forward to translate values\n"
        + "\tbetween. A negative number indicates taking values from\n"
        + "\ta past instance. (default -1)", "I", 1, "-I <num>"));
    newVector.addElement(new Option(
      "\tFor instances at the beginning or end of the dataset where\n"
        + "\tthe translated values are not known, remove those instances\n"
        + "\t(default is to use missing values).", "M", 0, "-M"));
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(4);

    newVector.addElement(new Option(
              "\tSpecify list of columns to translate in time. First and\n"
	      + "\tlast are valid indexes. (default none)",
              "R", 1, "-R <index1,index2-index4,...>"));
    newVector.addElement(new Option(
	      "\tInvert matching sense (i.e. calculate for all non-specified columns)",
              "V", 0, "-V"));
    newVector.addElement(new Option(
              "\tThe number of instances forward to translate values\n"
	      + "\tbetween. A negative number indicates taking values from\n"
	      + "\ta past instance. (default -1)",
              "I", 1, "-I <num>"));
    newVector.addElement(new Option(
	      "\tFor instances at the beginning or end of the dataset where\n"
	      + "\tthe translated values are not known, remove those instances\n"
	      + "\t(default is to use missing values).",
	      "M", 0, "-M"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return newVector.elements();
  }

  /**
   * Parses a given list of options controlling the behaviour of this object.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Valid options are:
   * <p>
   * 
   * -R index1,index2-index4,...<br>
   * Specify list of columns to copy. First and last are valid indexes. (default
   * none)
   * <p>
   * 
   * -V<br>
   * Invert matching sense (i.e. calculate for all non-specified columns)
   * <p>
   * 
   * -I num <br>
   * The number of instances forward to translate values between. A negative
   * number indicates taking values from a past instance. (default -1)
   * <p>
   * 
   * -M <br>
   * For instances at the beginning or end of the dataset where the translated
   * values are not known, remove those instances (default is to use missing
   * values).
   * <p>
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Valid options are:<p>
   *
   * -R index1,index2-index4,...<br>
   * Specify list of columns to copy. First and last are valid indexes.
   * (default none)<p>
   *
   * -V<br>
   * Invert matching sense (i.e. calculate for all non-specified columns)<p>
   *
   * -I num <br>
   * The number of instances forward to translate values between.
   * A negative number indicates taking values from a past instance.
   * (default -1) <p>
   *
   * -M <br>
   * For instances at the beginning or end of the dataset where the translated
   * values are not known, remove those instances (default is to use missing 
   * values). <p>
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setOptions(String[] options) throws Exception {

    String copyList = Utils.getOption('R', options);
    if (copyList.length() != 0) {
      setAttributeIndices(copyList);
    } else {
      setAttributeIndices("");
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setInvertSelection(Utils.getFlag('V', options));

    setFillWithMissing(!Utils.getFlag('M', options));

<<<<<<< HEAD
=======
=======
    
    setInvertSelection(Utils.getFlag('V', options));

    setFillWithMissing(!Utils.getFlag('M', options));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String instanceRange = Utils.getOption('I', options);
    if (instanceRange.length() != 0) {
      setInstanceRange(Integer.parseInt(instanceRange));
    } else {
      setInstanceRange(-1);
    }

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
=======
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the current settings of the filter.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    if (!getAttributeIndices().equals("")) {
      options.add("-R");
      options.add(getAttributeIndices());
    }
    if (getInvertSelection()) {
      options.add("-V");
    }
    options.add("-I");
    options.add("" + getInstanceRange());
    if (!getFillWithMissing()) {
      options.add("-M");
    }

    return options.toArray(new String[0]);
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [6];
    int current = 0;

    if (!getAttributeIndices().equals("")) {
      options[current++] = "-R"; options[current++] = getAttributeIndices();
    }
    if (getInvertSelection()) {
      options[current++] = "-V";
    }
    options[current++] = "-I"; options[current++] = "" + getInstanceRange();
    if (!getFillWithMissing()) {
      options[current++] = "-M";
    }

    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the format of the input instances.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);
    resetHistory();
    m_SelectedCols.setUpper(instanceInfo.numAttributes() - 1);
    return false;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Input an instance for filtering. Ordinarily the instance is processed and
   * made available for output immediately. Some filters require all instances
   * be read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws Exception if the input instance was not of the correct format or if
   *           there was a problem with the filtering.
   */
  @Override
<<<<<<< HEAD
=======
=======
  

  /**
   * Input an instance for filtering. Ordinarily the instance is processed
   * and made available for output immediately. Some filters require all
   * instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws Exception if the input instance was not of the correct 
   * format or if there was a problem with the filtering.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean input(Instance instance) throws Exception {

    if (getInputFormat() == null) {
      throw new NullPointerException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
      resetHistory();
    }

    Instance newInstance = historyInput(instance);
    if (newInstance != null) {
      push(newInstance);
      return true;
    } else {
      return false;
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Signifies that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances.
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Signifies that this batch of input to the filter is finished. If the 
   * filter requires all instances prior to filtering, output() may now 
   * be called to retrieve the filtered instances.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean batchFinished() {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (getFillWithMissing() && (m_InstanceRange > 0)) {
      while (!m_History.empty()) {
<<<<<<< HEAD
        push(mergeInstances(null, (Instance) m_History.pop()));
      }
    }
=======
<<<<<<< HEAD
        push(mergeInstances(null, (Instance) m_History.pop()));
      }
    }
=======
	push(mergeInstances(null, (Instance) m_History.pop()));
      }
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    flushInput();
    m_NewBatch = true;
    m_FirstBatchDone = true;
    return (numPendingOutput() != 0);
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
  public String fillWithMissingTipText() {
    return "For instances at the beginning or end of the dataset where the translated "
      + "values are not known, use missing values (default is to remove those "
      + "instances)";
  }

  /**
   * Gets whether missing values should be used rather than removing instances
   * where the translated value is not known (due to border effects).
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return true if so
   */
  public boolean getFillWithMissing() {

    return m_FillWithMissing;
  }

  /**
   * Sets whether missing values should be used rather than removing instances
   * where the translated value is not known (due to border effects).
   * 
   * @param newFillWithMissing true if so
   */
  public void setFillWithMissing(boolean newFillWithMissing) {

<<<<<<< HEAD
=======
=======
   *
   * @return true if so
   */
  public boolean getFillWithMissing() {
    
    return m_FillWithMissing;
  }
  
  /**
   * Sets whether missing values should be used rather than removing instances
   * where the translated value is not known (due to border effects).
   *
   * @param newFillWithMissing true if so
   */
  public void setFillWithMissing(boolean newFillWithMissing) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_FillWithMissing = newFillWithMissing;
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
  public String instanceRangeTipText() {
    return "The number of instances forward/backward to merge values between. "
      + "A negative number indicates taking values from a past instance.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the number of instances forward to translate values between. A
   * negative number indicates taking values from a past instance.
   * 
   * @return Value of InstanceRange.
   */
  public int getInstanceRange() {

    return m_InstanceRange;
  }

  /**
   * Sets the number of instances forward to translate values between. A
   * negative number indicates taking values from a past instance.
   * 
   * @param newInstanceRange Value to assign to InstanceRange.
   */
  public void setInstanceRange(int newInstanceRange) {

    m_InstanceRange = newInstanceRange;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   * Gets the number of instances forward to translate values between.
   * A negative number indicates taking values from a past instance.
   *
   * @return Value of InstanceRange.
   */
  public int getInstanceRange() {
    
    return m_InstanceRange;
  }
  
  /**
   * Sets the number of instances forward to translate values between.
   * A negative number indicates taking values from a past instance.
   *
   * @param newInstanceRange Value to assign to InstanceRange.
   */
  public void setInstanceRange(int newInstanceRange) {
    
    m_InstanceRange = newInstanceRange;
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String invertSelectionTipText() {
    return "Invert matching sense. ie calculate for all non-specified columns.";
  }

  /**
   * Get whether the supplied columns are to be removed or kept
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if the supplied columns will be kept
   */
  public boolean getInvertSelection() {

    return m_SelectedCols.getInvert();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set whether selected columns should be removed or kept. If true the
   * selected columns are kept and unselected columns are copied. If false
   * selected columns are copied and unselected columns are kept.
   * 
<<<<<<< HEAD
=======
=======
   * Set whether selected columns should be removed or kept. If true the 
   * selected columns are kept and unselected columns are copied. If false
   * selected columns are copied and unselected columns are kept.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param invert the new invert setting
   */
  public void setInvertSelection(boolean invert) {

    m_SelectedCols.setInvert(invert);
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
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String attributeIndicesTipText() {
    return "Specify range of attributes to act on."
      + " This is a comma separated list of attribute indices, with"
      + " \"first\" and \"last\" valid values. Specify an inclusive"
      + " range with \"-\". E.g: \"first-3,5,6-10,last\".";
  }

  /**
   * Get the current range selection
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a string containing a comma separated list of ranges
   */
  public String getAttributeIndices() {

    return m_SelectedCols.getRanges();
  }

  /**
   * Set which attributes are to be copied (or kept if invert is true)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br>
   *          eg: first-3,5,6-last
<<<<<<< HEAD
=======
=======
   *
   * @param rangeList a string representing the list of attributes.  Since
   * the string will typically come from a user, attributes are indexed from
   * 1. <br>
   * eg: first-3,5,6-last
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setAttributeIndices(String rangeList) {

    m_SelectedCols.setRanges(rangeList);
  }

  /**
   * Set which attributes are to be copied (or kept if invert is true)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param attributes an array containing indexes of attributes to select.
   *          Since the array will typically come from a program, attributes are
   *          indexed from 0.
   */
  public void setAttributeIndicesArray(int[] attributes) {
<<<<<<< HEAD
=======
=======
   *
   * @param attributes an array containing indexes of attributes to select.
   * Since the array will typically come from a program, attributes are indexed
   * from 0.
   */
  public void setAttributeIndicesArray(int [] attributes) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setAttributeIndices(Range.indicesToRangeList(attributes));
  }

  /** Clears any instances from the history queue. */
  protected void resetHistory() {

    if (m_History == null) {
      m_History = new Queue();
    } else {
      m_History.removeAllElements();
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Adds an instance to the history buffer. If enough instances are in the
   * buffer, a new instance may be output, with selected attribute values copied
   * from one to another.
   * 
   * @param instance the input instance
   * @return a new instance with translated values, or null if no output
   *         instance is produced
<<<<<<< HEAD
=======
=======
   * Adds an instance to the history buffer. If enough instances are in
   * the buffer, a new instance may be output, with selected attribute
   * values copied from one to another.
   *
   * @param instance the input instance
   * @return a new instance with translated values, or null if no
   * output instance is produced
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected Instance historyInput(Instance instance) {

    m_History.push(instance);
    if (m_History.size() <= Math.abs(m_InstanceRange)) {
      if (getFillWithMissing() && (m_InstanceRange < 0)) {
<<<<<<< HEAD
        return mergeInstances(null, instance);
      } else {
        return null;
=======
<<<<<<< HEAD
        return mergeInstances(null, instance);
      } else {
        return null;
=======
	return mergeInstances(null, instance);
      } else {
	return null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (m_InstanceRange < 0) {
      return mergeInstances((Instance) m_History.pop(), instance);
    } else {
      return mergeInstances(instance, (Instance) m_History.pop());
    }
  }

  /**
<<<<<<< HEAD
   * Creates a new instance the same as one instance (the "destination") but
   * with some attribute values copied from another instance (the "source")
   * 
=======
<<<<<<< HEAD
   * Creates a new instance the same as one instance (the "destination") but
   * with some attribute values copied from another instance (the "source")
   * 
=======
   * Creates a new instance the same as one instance (the "destination")
   * but with some attribute values copied from another instance
   * (the "source")
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param source the source instance
   * @param dest the destination instance
   * @return the new merged instance
   */
  protected abstract Instance mergeInstances(Instance source, Instance dest);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
