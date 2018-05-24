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
 * AddID.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
=======
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SingleIndex;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> An instance filter that adds an ID attribute to the
 * dataset. The new attribute contains a unique ID for each instance.<br/>
 * Note: The ID is not reset for the second batch of instances when batch mode
 * is used from the command-line, or the FilteredClassifier.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -C &lt;index&gt;
 *  Specify where to insert the ID. First and last
 *  are valid indexes.(default first)
 * </pre>
 * 
 * <pre>
 * -N &lt;name&gt;
 *  Name of the new attribute.
 *  (default = 'ID')
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14534 $
 */
public class AddID extends Filter
        implements UnsupervisedFilter, OptionHandler, WeightedInstancesHandler, WeightedAttributesHandler{

=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * An instance filter that adds an ID attribute to the dataset. The new attribute contains a unique ID for each instance.<br/>
 * Note: The ID is not reset for the second batch of files (using -b and -r and -s).
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -C &lt;index&gt;
 *  Specify where to insert the ID. First and last
 *  are valid indexes.(default first)</pre>
 * 
 * <pre> -N &lt;name&gt;
 *  Name of the new attribute.
 *  (default = 'ID')</pre>
 * 
 <!-- options-end -->
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 5543 $
 */
public class AddID
  extends Filter
  implements UnsupervisedFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  static final long serialVersionUID = 4734383199819293390L;

  /** the index of the attribute */
  protected SingleIndex m_Index = new SingleIndex("first");

  /** the name of the attribute */
  protected String m_Name = "ID";
<<<<<<< HEAD

  /** the counter for the ID */
  protected int m_Counter = -1;

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "An instance filter that adds an ID attribute to the dataset. "
      + "The new attribute contains a unique ID for each instance.\n\n"
      + "Note: The ID is not reset for the second batch of instances "
      + "when batch mode is used from the command-line, or the FilteredClassifier.";
=======
  
  /** the counter for the ID */
  protected int m_Counter = -1;
  
  /**
   * Returns a string describing this filter
   *
   * @return            a description of the filter suitable for
   *                    displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "An instance filter that adds an ID attribute to the dataset. "
      + "The new attribute contains a unique ID for each instance.\n"
      + "Note: The ID is not reset for the second batch of files (using -b "
      + "and -r and -s).";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tSpecify where to insert the ID. First and last\n"
        + "\tare valid indexes.(default first)", "C", 1, "-C <index>"));

    result.addElement(new Option("\tName of the new attribute.\n"
      + "\t(default = 'ID')", "N", 1, "-N <name>"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
              "\tSpecify where to insert the ID. First and last\n"
              +"\tare valid indexes.(default first)",
              "C", 1, "-C <index>"));

    result.addElement(new Option(
              "\tName of the new attribute.\n"
              +"\t(default = 'ID')",
              "N", 1,"-N <name>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result.elements();
  }

<<<<<<< HEAD
  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -C &lt;index&gt;
   *  Specify where to insert the ID. First and last
   *  are valid indexes.(default first)
   * </pre>
   * 
   * <pre>
   * -N &lt;name&gt;
   *  Name of the new attribute.
   *  (default = 'ID')
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('C', options);
    if (tmpStr.length() != 0) {
      m_Index.setSingleIndex(tmpStr);
    } else {
      m_Index.setSingleIndex("first");
    }

    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0) {
      m_Name = tmpStr;
    } else {
      m_Name = "ID";
    }

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }

    Utils.checkForRemainingOptions(options);
=======

  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -C &lt;index&gt;
   *  Specify where to insert the ID. First and last
   *  are valid indexes.(default first)</pre>
   * 
   * <pre> -N &lt;name&gt;
   *  Name of the new attribute.
   *  (default = 'ID')</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String      tmpStr;

    tmpStr = Utils.getOption('C', options);
    if (tmpStr.length() != 0)
      m_Index.setSingleIndex(tmpStr);
    else
      m_Index.setSingleIndex("first");
    
    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0)
      m_Name = tmpStr;
    else
      m_Name = "ID";

    if (getInputFormat() != null)
      setInputFormat(getInputFormat());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the filter.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector      result;
    
    result = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result.add("-C");
    result.add(getIDIndex());

    result.add("-N");
    result.add(getAttributeName());
<<<<<<< HEAD

    return result.toArray(new String[result.size()]);
=======
    
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String attributeNameTipText() {
    return "Set the new attribute's name.";
  }

  /**
   * Get the name of the attribute to be created
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the current attribute name
   */
  public String getAttributeName() {
    return m_Name;
  }

<<<<<<< HEAD
  /**
   * Set the new attribute's name
   * 
=======
  /** 
   * Set the new attribute's name
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value the new name
   */
  public void setAttributeName(String value) {
    m_Name = value;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String IDIndexTipText() {
    return "The position (starting from 1) where the attribute will be inserted "
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String IDIndexTipText() {
    return 
        "The position (starting from 1) where the attribute will be inserted "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "(first and last are valid indices).";
  }

  /**
   * Get the index of the attribute used.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the index of the attribute
   */
  public String getIDIndex() {
    return m_Index.getSingleIndex();
  }

  /**
   * Sets index of the attribute used.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value the index of the attribute
   */
  public void setIDIndex(String value) {
    m_Index.setSingleIndex(value);
  }

<<<<<<< HEAD
  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // class
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Sets the format of the input instances.
<<<<<<< HEAD
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    Instances outputFormat;
    Attribute newAttribute;
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    Instances           outputFormat;
    Attribute           newAttribute;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    super.setInputFormat(instanceInfo);

    m_Counter = -1;
    m_Index.setUpper(instanceInfo.numAttributes());
    outputFormat = new Instances(instanceInfo, 0);
    newAttribute = new Attribute(m_Name);

<<<<<<< HEAD
    if ((m_Index.getIndex() < 0)
      || (m_Index.getIndex() > getInputFormat().numAttributes())) {
      throw new IllegalArgumentException("Index out of range");
    }

    outputFormat.insertAttributeAt(newAttribute, m_Index.getIndex());
    setOutputFormat(outputFormat);

=======
    if ((m_Index.getIndex() < 0) || 
        (m_Index.getIndex() > getInputFormat().numAttributes()))
      throw new IllegalArgumentException("Index out of range");
    
    outputFormat.insertAttributeAt(newAttribute, m_Index.getIndex());
    setOutputFormat(outputFormat);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return true;
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering. Filter requires all training instances be
   * read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input format has been set.
   */
  @Override
  public boolean input(Instance instance) {
    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
=======
   * Input an instance for filtering. Filter requires all
   * training instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been set.
   */
  public boolean input(Instance instance) {
    if (getInputFormat() == null)
      throw new IllegalStateException("No input instance format defined");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }
<<<<<<< HEAD

    if (!isFirstBatchDone()) {
      bufferInput(instance);
      return false;
    } else {
=======
    
    if (!isFirstBatchDone()) {
      bufferInput(instance);
      return false;
    } 
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      convertInstance(instance);
      return true;
    }
  }

  /**
<<<<<<< HEAD
   * Signify that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances.
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
  public boolean batchFinished() {
    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }

    if (!isFirstBatchDone()) {
      m_Counter = 0;

      // Convert pending input instances
      for (int i = 0; i < getInputFormat().numInstances(); i++) {
        convertInstance(getInputFormat().instance(i));
      }
    }

=======
   * Signify that this batch of input to the filter is finished. 
   * If the filter requires all instances prior to filtering,
   * output() may now be called to retrieve the filtered instances.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  public boolean batchFinished() {
    if (getInputFormat() == null)
      throw new IllegalStateException("No input instance format defined");

    if (!isFirstBatchDone()) {
      m_Counter = 0;
      
      // Convert pending input instances
      for (int i = 0; i < getInputFormat().numInstances(); i++)
        convertInstance(getInputFormat().instance(i));
    } 
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // Free memory
    flushInput();

    m_NewBatch = true;
    m_FirstBatchDone = true;
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return (numPendingOutput() != 0);
  }

  /**
<<<<<<< HEAD
   * Convert a single instance over. The converted instance is added to the end
   * of the output queue.
   * 
   * @param instance the instance to convert
   */
  protected void convertInstance(Instance instance) {
    Instance inst;

=======
   * Convert a single instance over. The converted instance is 
   * added to the end of the output queue.
   *
   * @param instance the instance to convert
   */
  protected void convertInstance(Instance instance) {
    Instance            inst;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_Counter++;

    // build instance
    try {
<<<<<<< HEAD
      inst = (Instance) instance.copy();

      // First copy string values from input to output
      copyValues(inst, true, inst.dataset(), outputFormatPeek());
=======
      inst = (Instance)instance.copy();

      // First copy string values from input to output
      copyValues(inst, true, inst.dataset(), getOutputFormat());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      // Insert the new attribute and reassign to output
      inst.setDataset(null);
      inst.insertAttributeAt(m_Index.getIndex());
      inst.setValue(m_Index.getIndex(), m_Counter);
<<<<<<< HEAD

      push(inst); // No need to copy instance
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
=======
      inst.setDataset(getOutputFormat());

      push(inst);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5543 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param args should contain arguments to the filter: use -h for help
   */
  public static void main(String[] args) {
    runFilter(new AddID(), args);
  }
}
