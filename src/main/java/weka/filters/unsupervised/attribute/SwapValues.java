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
 *    SwapValues.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters.unsupervised.attribute;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
<<<<<<< HEAD
=======
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.filters.unsupervised.attribute;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SingleIndex;
import weka.core.UnsupportedAttributeTypeException;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> Swaps two values of a nominal attribute.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -C &lt;col&gt;
 *  Sets the attribute index (default last).
 * </pre>
 * 
 * <pre>
 * -F &lt;value index&gt;
 *  Sets the first value's index (default first).
 * </pre>
 * 
 * <pre>
 * -S &lt;value index&gt;
 *  Sets the second value's index (default last).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class SwapValues extends Filter implements UnsupervisedFilter,
  StreamableFilter, OptionHandler, WeightedInstancesHandler, WeightedAttributesHandler {

<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;


/** 
 <!-- globalinfo-start -->
 * Swaps two values of a nominal attribute.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -C &lt;col&gt;
 *  Sets the attribute index (default last).</pre>
 * 
 * <pre> -F &lt;value index&gt;
 *  Sets the first value's index (default first).</pre>
 * 
 * <pre> -S &lt;value index&gt;
 *  Sets the second value's index (default last).</pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz) 
 * @version $Revision: 8585 $
 */
public class SwapValues 
  extends Filter 
  implements UnsupervisedFilter, StreamableFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = 6155834679414275855L;

  /** The attribute's index setting. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final SingleIndex m_AttIndex = new SingleIndex("last");

  /** The first value's index setting. */
  private final SingleIndex m_FirstIndex = new SingleIndex("first");

  /** The second value's index setting. */
  private final SingleIndex m_SecondIndex = new SingleIndex("last");

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {

    return "Swaps two values of a nominal attribute.";
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
<<<<<<< HEAD
=======
=======
  private SingleIndex m_AttIndex = new SingleIndex("last"); 

  /** The first value's index setting. */
  private SingleIndex m_FirstIndex = new SingleIndex("first");

  /** The second value's index setting. */
  private SingleIndex m_SecondIndex = new SingleIndex("last");

  /**
   * Returns a string describing this filter
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {

    return  "Swaps two values of a nominal attribute.";
  }

  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // class
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
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
   * @throws UnsupportedAttributeTypeException if the selected attribute is not
   *           nominal or if it only has one value.
   * @throws Exception if the input format can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);
    m_AttIndex.setUpper(instanceInfo.numAttributes() - 1);
    m_FirstIndex.setUpper(instanceInfo.attribute(m_AttIndex.getIndex())
      .numValues() - 1);
    m_SecondIndex.setUpper(instanceInfo.attribute(m_AttIndex.getIndex())
      .numValues() - 1);
    if (!instanceInfo.attribute(m_AttIndex.getIndex()).isNominal()) {
      throw new UnsupportedAttributeTypeException(
        "Chosen attribute not nominal.");
    }
    if (instanceInfo.attribute(m_AttIndex.getIndex()).numValues() < 2) {
      throw new UnsupportedAttributeTypeException(
        "Chosen attribute has less than " + "two values.");
<<<<<<< HEAD
=======
=======
   *
   * @param instanceInfo an Instances object containing the input 
   * instance structure (any instances contained in the object are 
   * ignored - only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws UnsupportedAttributeTypeException if the selected attribute
   * is not nominal or if it only has one value.
   * @throws Exception if the input format can't be set 
   * successfully
   */
  public boolean setInputFormat(Instances instanceInfo) 
       throws Exception {

    super.setInputFormat(instanceInfo);
    m_AttIndex.setUpper(instanceInfo.numAttributes() - 1);
    m_FirstIndex.setUpper(instanceInfo.
			  attribute(m_AttIndex.getIndex()).numValues() - 1);
    m_SecondIndex.setUpper(instanceInfo.
			   attribute(m_AttIndex.getIndex()).numValues() - 1);
    if (!instanceInfo.attribute(m_AttIndex.getIndex()).isNominal()) {
      throw new UnsupportedAttributeTypeException("Chosen attribute not nominal.");
    }
    if (instanceInfo.attribute(m_AttIndex.getIndex()).numValues() < 2) {
      throw new UnsupportedAttributeTypeException("Chosen attribute has less than " 
						  + "two values.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    setOutputFormat();
    return true;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Input an instance for filtering. The instance is processed and made
   * available for output immediately.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input structure has been defined.
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Input an instance for filtering. The instance is processed
   * and made available for output immediately.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input structure has been defined.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean input(Instance instance) {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Instance newInstance = (Instance) instance.copy();
    if (!newInstance.isMissing(m_AttIndex.getIndex())) {
      if ((int) newInstance.value(m_AttIndex.getIndex()) == m_SecondIndex.getIndex()) {
        newInstance.setValue(m_AttIndex.getIndex(), m_FirstIndex.getIndex());
      } else if ((int) newInstance.value(m_AttIndex.getIndex()) == m_FirstIndex.getIndex()) {
        newInstance.setValue(m_AttIndex.getIndex(), m_SecondIndex.getIndex());
      }
    }
    push(newInstance, false); // No need to copy
<<<<<<< HEAD
=======
=======
    Instance newInstance = (Instance)instance.copy();
    if (!newInstance.isMissing(m_AttIndex.getIndex())) {
      if ((int)newInstance.value(m_AttIndex.getIndex()) == m_SecondIndex.getIndex()) {
        newInstance.setValue(m_AttIndex.getIndex(), (double)m_FirstIndex.getIndex());
      } else if ((int)newInstance.value(m_AttIndex.getIndex()) == 
		 m_FirstIndex.getIndex()) {
        newInstance.setValue(m_AttIndex.getIndex(), (double)m_SecondIndex.getIndex());
      }
    }
    push(newInstance);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return true;
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

    Vector<Option> newVector = new Vector<Option>(3);

    newVector.addElement(new Option(
      "\tSets the attribute index (default last).", "C", 1, "-C <col>"));

    newVector.addElement(new Option(
      "\tSets the first value's index (default first).", "F", 1,
      "-F <value index>"));

    newVector.addElement(new Option(
      "\tSets the second value's index (default last).", "S", 1,
      "-S <value index>"));
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(3);

    newVector.addElement(new Option(
              "\tSets the attribute index (default last).",
              "C", 1, "-C <col>"));

    newVector.addElement(new Option(
              "\tSets the first value's index (default first).",
              "F", 1, "-F <value index>"));

    newVector.addElement(new Option(
              "\tSets the second value's index (default last).",
              "S", 1, "-S <value index>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return newVector.elements();
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -C &lt;col&gt;
   *  Sets the attribute index (default last).
   * </pre>
   * 
   * <pre>
   * -F &lt;value index&gt;
   *  Sets the first value's index (default first).
   * </pre>
   * 
   * <pre>
   * -S &lt;value index&gt;
   *  Sets the second value's index (default last).
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

  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -C &lt;col&gt;
   *  Sets the attribute index (default last).</pre>
   * 
   * <pre> -F &lt;value index&gt;
   *  Sets the first value's index (default first).</pre>
   * 
   * <pre> -S &lt;value index&gt;
   *  Sets the second value's index (default last).</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String attIndex = Utils.getOption('C', options);
    if (attIndex.length() != 0) {
      setAttributeIndex(attIndex);
    } else {
      setAttributeIndex("last");
    }

    String firstValIndex = Utils.getOption('F', options);
    if (firstValIndex.length() != 0) {
      setFirstValueIndex(firstValIndex);
    } else {
      setFirstValueIndex("first");
    }

    String secondValIndex = Utils.getOption('S', options);
    if (secondValIndex.length() != 0) {
      setSecondValueIndex(secondValIndex);
    } else {
      setSecondValueIndex("last");
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }

    Utils.checkForRemainingOptions(options);
<<<<<<< HEAD
=======
=======
   
    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }
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

    options.add("-C");
    options.add("" + (getAttributeIndex()));
    options.add("-F");
    options.add("" + (getFirstValueIndex()));
    options.add("-S");
    options.add("" + (getSecondValueIndex()));

    return options.toArray(new String[0]);
  }

  /**
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [6];
    int current = 0;

    options[current++] = "-C";
    options[current++] = "" + (getAttributeIndex());
    options[current++] = "-F"; 
    options[current++] = "" + (getFirstValueIndex());
    options[current++] = "-S"; 
    options[current++] = "" + (getSecondValueIndex());
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }

  /**
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String attributeIndexTipText() {

    return "Sets which attribute to process. This "
      + "attribute must be nominal (\"first\" and \"last\" are valid values)";
  }

  /**
   * Get the index of the attribute used.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the index of the attribute
   */
  public String getAttributeIndex() {

    return m_AttIndex.getSingleIndex();
  }

  /**
   * Sets index of the attribute used.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param attIndex the index of the attribute
   */
  public void setAttributeIndex(String attIndex) {

<<<<<<< HEAD
=======
=======
   *
   * @param attIndex the index of the attribute
   */
  public void setAttributeIndex(String attIndex) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_AttIndex.setSingleIndex(attIndex);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String firstValueIndexTipText() {

    return "The index of the first value "
      + "(\"first\" and \"last\" are valid values).";
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String firstValueIndexTipText() {

    return "The index of the first value."
      + "(\"first\" and \"last\" are valid values)";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the index of the first value used.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the index of the first value
   */
  public String getFirstValueIndex() {

    return m_FirstIndex.getSingleIndex();
  }

  /**
   * Sets index of the first value used.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param firstIndex the index of the first value
   */
  public void setFirstValueIndex(String firstIndex) {

<<<<<<< HEAD
=======
=======
   *
   * @param firstIndex the index of the first value
   */
  public void setFirstValueIndex(String firstIndex) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_FirstIndex.setSingleIndex(firstIndex);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String secondValueIndexTipText() {

    return "The index of the second value "
      + "(\"first\" and \"last\" are valid values).";
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String secondValueIndexTipText() {

    return "The index of the second value."
      + "(\"first\" and \"last\" are valid values)";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the index of the second value used.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the index of the second value
   */
  public String getSecondValueIndex() {

    return m_SecondIndex.getSingleIndex();
  }

  /**
   * Sets index of the second value used.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param secondIndex the index of the second value
   */
  public void setSecondValueIndex(String secondIndex) {

<<<<<<< HEAD
=======
=======
   *
   * @param secondIndex the index of the second value
   */
  public void setSecondValueIndex(String secondIndex) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_SecondIndex.setSingleIndex(secondIndex);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set the output format. Swapss the desired nominal attribute values in the
   * header and calls setOutputFormat(Instances) appropriately.
   */
  private void setOutputFormat() {

    Instances newData;
    ArrayList<Attribute> newAtts;
    ArrayList<String> newVals;

    // Compute new attributes

    newAtts = new ArrayList<Attribute>(getInputFormat().numAttributes());
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (j != m_AttIndex.getIndex()) {
        newAtts.add((Attribute) att.copy());
      } else {

        // Compute list of attribute values

        newVals = new ArrayList<String>(att.numValues());
        for (int i = 0; i < att.numValues(); i++) {
          if (i == m_FirstIndex.getIndex()) {
            newVals.add(att.value(m_SecondIndex.getIndex()));
          } else if (i == m_SecondIndex.getIndex()) {
            newVals.add(att.value(m_FirstIndex.getIndex()));
          } else {
            newVals.add(att.value(i));
          }
        }
        Attribute newAtt = new Attribute(att.name(), newVals);
        newAtt.setWeight(att.weight());
        newAtts.add(newAtt);
      }
    }

    // Construct new header

<<<<<<< HEAD
=======
=======
   * Set the output format. Swapss the desired nominal attribute values in
   * the header and calls setOutputFormat(Instances) appropriately.
   */
  private void setOutputFormat() {
    
    Instances newData;
    FastVector newAtts, newVals;
      
    // Compute new attributes
      
    newAtts = new FastVector(getInputFormat().numAttributes());
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (j != m_AttIndex.getIndex()) {
	newAtts.addElement(att.copy()); 
      } else {
	  
	// Compute list of attribute values
	  
	newVals = new FastVector(att.numValues());
	for (int i = 0; i < att.numValues(); i++) {
	  if (i == m_FirstIndex.getIndex()) {
	    newVals.addElement(att.value(m_SecondIndex.getIndex()));
	  } else if (i == m_SecondIndex.getIndex()) {
	    newVals.addElement(att.value(m_FirstIndex.getIndex()));
	  } else {
	    newVals.addElement(att.value(i)); 
	  }
	}
	Attribute newAtt = new Attribute(att.name(), newVals);
	newAtt.setWeight(att.weight());
	newAtts.addElement(newAtt);
      }
    }
      
    // Construct new header
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    newData = new Instances(getInputFormat().relationName(), newAtts, 0);
    newData.setClassIndex(getInputFormat().classIndex());
    setOutputFormat(newData);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
  }

  /**
   * Main method for testing this class.
   * 
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 8585 $");
  }
  
  /**
   * Main method for testing this class.
   *
   * @param argv should contain arguments to the filter: 
   * use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    runFilter(new SwapValues(), argv);
  }
}
