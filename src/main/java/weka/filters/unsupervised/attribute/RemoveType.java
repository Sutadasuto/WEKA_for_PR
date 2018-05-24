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
 *    RemoveType.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
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
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> Removes attributes of a given type.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -T &lt;nominal|numeric|string|date|relational&gt;
 *  Attribute type to delete. Valid options are "nominal", 
 *  "numeric", "string", "date" and "relational".
 *  (default "string")
 * </pre>
 * 
 * <pre>
 * -V
 *  Invert matching sense (i.e. only keep specified columns)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class RemoveType extends Filter implements UnsupervisedFilter,
  StreamableFilter, OptionHandler, WeightedAttributesHandler, WeightedInstancesHandler {

  /** for serialization */
  static final long serialVersionUID = -3563999462782486279L;

=======
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * Removes attributes of a given type.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -T &lt;nominal|numeric|string|date|relational&gt;
 *  Attribute type to delete. Valid options are "nominal", 
 *  "numeric", "string", "date" and "relational".
 *  (default "string")</pre>
 * 
 * <pre> -V
 *  Invert matching sense (i.e. only keep specified columns)</pre>
 * 
 <!-- options-end -->
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 9814 $
 */
public class RemoveType 
  extends Filter
  implements UnsupervisedFilter, StreamableFilter, OptionHandler {

  /** for serialization */
  static final long serialVersionUID = -3563999462782486279L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The attribute filter used to do the filtering */
  protected Remove m_attributeFilter = new Remove();

  /** The type of attribute to delete */
  protected int m_attTypeToDelete = Attribute.STRING;

  /** Whether to invert selection */
  protected boolean m_invert = false;
<<<<<<< HEAD

  /** Tag allowing selection of attribute type to delete */
  public static final Tag[] TAGS_ATTRIBUTETYPE = {
=======
  
  /** Tag allowing selection of attribute type to delete */
  public static final Tag [] TAGS_ATTRIBUTETYPE = {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    new Tag(Attribute.NOMINAL, "Delete nominal attributes"),
    new Tag(Attribute.NUMERIC, "Delete numeric attributes"),
    new Tag(Attribute.STRING, "Delete string attributes"),
    new Tag(Attribute.DATE, "Delete date attributes"),
<<<<<<< HEAD
    new Tag(Attribute.RELATIONAL, "Delete relational attributes") };

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
    new Tag(Attribute.RELATIONAL, "Delete relational attributes")
  };

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
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.STRING_ATTRIBUTES);
    result.enable(Capability.RELATIONAL_ATTRIBUTES);
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
   * @throws Exception if the inputFormat can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the inputFormat can't be set successfully 
   */ 
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    super.setInputFormat(instanceInfo);

    int[] attsToDelete = new int[instanceInfo.numAttributes()];
    int numToDelete = 0;
<<<<<<< HEAD
    for (int i = 0; i < instanceInfo.numAttributes(); i++) {
=======
    for (int i=0; i<instanceInfo.numAttributes(); i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (i == instanceInfo.classIndex()) {
        if (!m_invert) {
          continue; // skip class
        } else {
<<<<<<< HEAD
          attsToDelete[numToDelete++] = i; // Need to keep the class even if
                                           // selection is inverted
        }
      }
      if (instanceInfo.attribute(i).type() == m_attTypeToDelete) {
        attsToDelete[numToDelete++] = i;
      }
=======
          attsToDelete[numToDelete++] = i; // Need to keep the class even if selection is inverted          
        }
      }
      if (instanceInfo.attribute(i).type() == m_attTypeToDelete)
	attsToDelete[numToDelete++] = i;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    int[] finalAttsToDelete = new int[numToDelete];
    System.arraycopy(attsToDelete, 0, finalAttsToDelete, 0, numToDelete);
<<<<<<< HEAD

    m_attributeFilter.setAttributeIndicesArray(finalAttsToDelete);
    m_attributeFilter.setInvertSelection(m_invert);

    boolean result = m_attributeFilter.setInputFormat(instanceInfo);
    Instances afOutputFormat = m_attributeFilter.getOutputFormat();

=======
    
    m_attributeFilter.setAttributeIndicesArray(finalAttsToDelete);
    m_attributeFilter.setInvertSelection(m_invert);
    
    boolean result = m_attributeFilter.setInputFormat(instanceInfo);
    Instances afOutputFormat = m_attributeFilter.getOutputFormat();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // restore old relation name to hide attribute filter stamp
    afOutputFormat.setRelationName(instanceInfo.relationName());

    setOutputFormat(afOutputFormat);
    return result;
  }

  /**
   * Input an instance for filtering.
<<<<<<< HEAD
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   */
  @Override
  public boolean input(Instance instance) {

=======
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   */
  public boolean input(Instance instance) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_attributeFilter.input(instance);
  }

  /**
   * Signify that this batch of input to the filter is finished.
<<<<<<< HEAD
   * 
   * @return true if there are instances pending output
   * @throws Exception if something goes wrong
   */
  @Override
=======
   *
   * @return true if there are instances pending output
   * @throws Exception if something goes wrong
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean batchFinished() throws Exception {

    return m_attributeFilter.batchFinished();
  }

  /**
   * Output an instance after filtering and remove from the output queue.
<<<<<<< HEAD
   * 
   * @return the instance that has most recently been filtered (or null if the
   *         queue is empty).
   */
  @Override
=======
   *
   * @return the instance that has most recently been filtered (or null if
   * the queue is empty).
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Instance output() {

    return m_attributeFilter.output();
  }

  /**
<<<<<<< HEAD
   * Output an instance after filtering but do not remove from the output queue.
   * 
   * @return the instance that has most recently been filtered (or null if the
   *         queue is empty).
   */
  @Override
=======
   * Output an instance after filtering but do not remove from the
   * output queue.
   *
   * @return the instance that has most recently been filtered (or null if
   * the queue is empty).
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Instance outputPeek() {

    return m_attributeFilter.outputPeek();
  }

  /**
   * Returns the number of instances pending output
<<<<<<< HEAD
   * 
   * @return the number of instances pending output
   */
  @Override
  public int numPendingOutput() {

    return m_attributeFilter.numPendingOutput();
  }

  /**
   * Returns whether the output format is ready to be collected
   * 
   * @return true if the output format is set
   */
  @Override
=======
   *
   * @return the number of instances  pending output
   */  
  public int numPendingOutput() {
  
    return m_attributeFilter.numPendingOutput();
  }
  
  /**
   * Returns whether the output format is ready to be collected
   *
   * @return true if the output format is set
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean isOutputFormatDefined() {

    return m_attributeFilter.isOutputFormatDefined();
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(2);

    newVector.addElement(new Option(
      "\tAttribute type to delete. Valid options are \"nominal\", \n"
        + "\t\"numeric\", \"string\", \"date\" and \"relational\".\n"
        + "\t(default \"string\")", "T", 1,
      "-T <nominal|numeric|string|date|relational>"));

    newVector.addElement(new Option(
      "\tInvert matching sense (i.e. only keep specified columns)", "V", 0,
      "-V"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(2);

    newVector.addElement(new Option(
	"\tAttribute type to delete. Valid options are \"nominal\", \n"
	+ "\t\"numeric\", \"string\", \"date\" and \"relational\".\n"
	+ "\t(default \"string\")",
	"T", 1, "-T <nominal|numeric|string|date|relational>"));

    newVector.addElement(new Option(
	"\tInvert matching sense (i.e. only keep specified columns)",
	"V", 0, "-V"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newVector.elements();
  }

  /**
<<<<<<< HEAD
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -T &lt;nominal|numeric|string|date|relational&gt;
   *  Attribute type to delete. Valid options are "nominal", 
   *  "numeric", "string", "date" and "relational".
   *  (default "string")
   * </pre>
   * 
   * <pre>
   * -V
   *  Invert matching sense (i.e. only keep specified columns)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    String tString = Utils.getOption('T', options);
    if (tString.length() != 0) {
      setAttributeTypeString(tString);
    }
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -T &lt;nominal|numeric|string|date|relational&gt;
   *  Attribute type to delete. Valid options are "nominal", 
   *  "numeric", "string", "date" and "relational".
   *  (default "string")</pre>
   * 
   * <pre> -V
   *  Invert matching sense (i.e. only keep specified columns)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    
    String tString = Utils.getOption('T', options);
    if (tString.length() != 0) setAttributeTypeString(tString);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setInvertSelection(Utils.getFlag('V', options));

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
=======
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

    Vector<String> options = new Vector<String>();

    if (getInvertSelection()) {
      options.add("-V");
    }
    options.add("-T");
    options.add(getAttributeTypeString());

    return options.toArray(new String[0]);
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [3];
    int current = 0;

    if (getInvertSelection()) {
      options[current++] = "-V";
    }
    options[current++] = "-T";
    options[current++] = getAttributeTypeString();
    
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns a string describing this filter
<<<<<<< HEAD
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String globalInfo() {

    return "Removes attributes of a given type.";
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
  public String attributeTypeTipText() {

    return "The type of attribute to remove.";
  }

  /**
   * Sets the attribute type to be deleted by the filter.
<<<<<<< HEAD
   * 
   * @param type a TAGS_ATTRIBUTETYPE of the new type the filter should delete
   */
  public void setAttributeType(SelectedTag type) {

=======
   *
   * @param type a TAGS_ATTRIBUTETYPE of the new type the filter should delete
   */
  public void setAttributeType(SelectedTag type) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (type.getTags() == TAGS_ATTRIBUTETYPE) {
      m_attTypeToDelete = type.getSelectedTag().getID();
    }
  }

  /**
   * Gets the attribute type to be deleted by the filter.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the attribute type as a selected tag TAGS_ATTRIBUTETYPE
   */
  public SelectedTag getAttributeType() {

    return new SelectedTag(m_attTypeToDelete, TAGS_ATTRIBUTETYPE);
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
  public String invertSelectionTipText() {

    return "Determines whether action is to select or delete."
      + " If set to true, only the specified attributes will be kept;"
      + " If set to false, specified attributes will be deleted.";
  }

  /**
   * Get whether the supplied columns are to be removed or kept
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if the supplied columns will be kept
   */
  public boolean getInvertSelection() {

    return m_invert;
  }

  /**
<<<<<<< HEAD
   * Set whether selected columns should be removed or kept. If true the
   * selected columns are kept and unselected columns are deleted. If false
   * selected columns are deleted and unselected columns are kept.
   * 
=======
   * Set whether selected columns should be removed or kept. If true the 
   * selected columns are kept and unselected columns are deleted. If false
   * selected columns are deleted and unselected columns are kept.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param invert the new invert setting
   */
  public void setInvertSelection(boolean invert) {

    m_invert = invert;
  }

  /**
   * Gets the attribute type to be deleted by the filter as a string.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the attribute type as a String
   */
  protected String getAttributeTypeString() {

<<<<<<< HEAD
    if (m_attTypeToDelete == Attribute.NOMINAL) {
      return "nominal";
    } else if (m_attTypeToDelete == Attribute.NUMERIC) {
      return "numeric";
    } else if (m_attTypeToDelete == Attribute.STRING) {
      return "string";
    } else if (m_attTypeToDelete == Attribute.DATE) {
      return "date";
    } else if (m_attTypeToDelete == Attribute.RELATIONAL) {
      return "relational";
    } else {
      return "unknown";
    }
=======
    if (m_attTypeToDelete == Attribute.NOMINAL) return "nominal";
    else if (m_attTypeToDelete == Attribute.NUMERIC) return "numeric";
    else if (m_attTypeToDelete == Attribute.STRING) return "string";
    else if (m_attTypeToDelete == Attribute.DATE) return "date";
    else if (m_attTypeToDelete == Attribute.RELATIONAL) return "relational";
    else return "unknown";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Sets the attribute type to be deleted by the filter.
<<<<<<< HEAD
   * 
   * @param typeString a String representing the new type the filter should
   *          delete
=======
   *
   * @param typeString a String representing the new type the filter should delete
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void setAttributeTypeString(String typeString) {

    typeString = typeString.toLowerCase();
<<<<<<< HEAD
    if (typeString.equals("nominal")) {
      m_attTypeToDelete = Attribute.NOMINAL;
    } else if (typeString.equals("numeric")) {
      m_attTypeToDelete = Attribute.NUMERIC;
    } else if (typeString.equals("string")) {
      m_attTypeToDelete = Attribute.STRING;
    } else if (typeString.equals("date")) {
      m_attTypeToDelete = Attribute.DATE;
    } else if (typeString.equals("relational")) {
      m_attTypeToDelete = Attribute.RELATIONAL;
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
    if (typeString.equals("nominal")) m_attTypeToDelete = Attribute.NOMINAL;
    else if (typeString.equals("numeric")) m_attTypeToDelete = Attribute.NUMERIC;
    else if (typeString.equals("string")) m_attTypeToDelete = Attribute.STRING;
    else if (typeString.equals("date")) m_attTypeToDelete = Attribute.DATE;
    else if (typeString.equals("relational")) m_attTypeToDelete = Attribute.RELATIONAL;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9814 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
=======
   *
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new RemoveType(), argv);
  }
}
