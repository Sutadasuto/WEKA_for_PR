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
 *    ChangeDateFormat.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters.unsupervised.attribute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
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
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> Changes the date format used by a date attribute.
 * This is most useful for converting to a format with less precision, for
 * example, from an absolute date to day of year, etc. This changes the format
 * string, and changes the date values to those that would be parsed by the new
 * format.
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
 *  Sets the output date format string (default corresponds to ISO-8601).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author <a href="mailto:len@reeltwo.com">Len Trigg</a>
 * @version $Revision: 14534 $
 */
public class ChangeDateFormat extends Filter implements UnsupervisedFilter,
  StreamableFilter, OptionHandler, WeightedInstancesHandler, WeightedAttributesHandler {
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Changes the date format used by a date attribute. This is most useful for converting to a format with less precision, for example, from an absolute date to day of year, etc. This changes the format string, and changes the date values to those that would be parsed by the new format.
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
 *  Sets the output date format string (default corresponds to ISO-8601).</pre>
 * 
 <!-- options-end -->
 *
 * @author <a href="mailto:len@reeltwo.com">Len Trigg</a>
 * @version $Revision: 5543 $
 */
public class ChangeDateFormat 
  extends Filter 
  implements UnsupervisedFilter, StreamableFilter, OptionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  static final long serialVersionUID = -1609344074013448737L;

  /** The default output date format. Corresponds to ISO-8601 format. */
<<<<<<< HEAD
  private static final SimpleDateFormat DEFAULT_FORMAT = new SimpleDateFormat(
    "yyyy-MM-dd'T'HH:mm:ss");

  /** The attribute's index setting. */
  private final SingleIndex m_AttIndex = new SingleIndex("last");
=======
  private static final SimpleDateFormat DEFAULT_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

  /** The attribute's index setting. */
  private SingleIndex m_AttIndex = new SingleIndex("last"); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The output date format. */
  private SimpleDateFormat m_DateFormat = DEFAULT_FORMAT;

  /** The output attribute. */
  private Attribute m_OutputAttribute;

  /**
   * Returns a string describing this filter
<<<<<<< HEAD
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Changes the date format used by a date attribute. This is most "
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "Changes the date format used by a date attribute. This is most "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "useful for converting to a format with less precision, for example, "
      + "from an absolute date to day of year, etc. This changes the format "
      + "string, and changes the date values to those that would be parsed "
      + "by the new format.";
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
   * @throws Exception if the input format can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
=======
   *
   * @param instanceInfo an Instances object containing the input 
   * instance structure (any instances contained in the object are 
   * ignored - only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set 
   * successfully
   */
  public boolean setInputFormat(Instances instanceInfo) 
       throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    super.setInputFormat(instanceInfo);
    m_AttIndex.setUpper(instanceInfo.numAttributes() - 1);
    if (!instanceInfo.attribute(m_AttIndex.getIndex()).isDate()) {
      throw new UnsupportedAttributeTypeException("Chosen attribute not date.");
    }

    setOutputFormat();
    return true;
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws Exception if the input format was not set or the date format cannot
   *           be parsed
   */
  @Override
=======
   * Input an instance for filtering. 
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws Exception if the input format was not set or the date format cannot
   * be parsed
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean input(Instance instance) throws Exception {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }
<<<<<<< HEAD
    Instance newInstance = (Instance) instance.copy();
=======
    Instance newInstance = (Instance)instance.copy();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int index = m_AttIndex.getIndex();
    if (!newInstance.isMissing(index)) {
      double value = instance.value(index);
      try {
        // Format and parse under the new format to force any required
        // loss in precision.
<<<<<<< HEAD
        value = m_OutputAttribute
          .parseDate(m_OutputAttribute.formatDate(value));
      } catch (ParseException pe) {
        throw new RuntimeException(
          "Output date format couldn't parse its own output!!");
      }
      newInstance.setValue(index, value);
    }
    push(newInstance, false); // No need to copy instance
=======
        value = m_OutputAttribute.parseDate(m_OutputAttribute.formatDate(value));
      } catch (ParseException pe) {
        throw new RuntimeException("Output date format couldn't parse its own output!!");
      }
      newInstance.setValue(index, value);
    }
    push(newInstance);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return true;
  }

  /**
   * Returns an enumeration describing the available options
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(2);

    newVector.addElement(new Option(
      "\tSets the attribute index (default last).", "C", 1, "-C <col>"));

    newVector
      .addElement(new Option(
        "\tSets the output date format string (default corresponds to ISO-8601).",
        "F", 1, "-F <value index>"));
=======
   *
   * @return an enumeration of all the available options
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(2);

    newVector.addElement(new Option(
              "\tSets the attribute index (default last).",
              "C", 1, "-C <col>"));

    newVector.addElement(new Option(
              "\tSets the output date format string (default corresponds to ISO-8601).",
              "F", 1, "-F <value index>"));
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
   * -C &lt;col&gt;
   *  Sets the attribute index (default last).
   * </pre>
   * 
   * <pre>
   * -F &lt;value index&gt;
   *  Sets the output date format string (default corresponds to ISO-8601).
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -C &lt;col&gt;
   *  Sets the attribute index (default last).</pre>
   * 
   * <pre> -F &lt;value index&gt;
   *  Sets the output date format string (default corresponds to ISO-8601).</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String attIndex = Utils.getOption('C', options);
    if (attIndex.length() != 0) {
      setAttributeIndex(attIndex);
    } else {
      setAttributeIndex("last");
    }

    String formatString = Utils.getOption('F', options);
    if (formatString.length() != 0) {
      setDateFormat(formatString);
    } else {
      setDateFormat(DEFAULT_FORMAT);
    }

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
  }

  /**
   * Gets the current settings of the filter.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    options.add("-C");
    options.add("" + getAttributeIndex());
    options.add("-F");
    options.add("" + getDateFormat().toPattern());

    return options.toArray(new String[0]);
  }

  /**
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  }
  
  /**
   * Gets the current settings of the filter.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [4];
    int current = 0;

    options[current++] = "-C";
    options[current++] = "" + getAttributeIndex();
    options[current++] = "-F"; 
    options[current++] = "" + getDateFormat().toPattern();
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }

  /**
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String attributeIndexTipText() {

    return "Sets which attribute to process. This "
      + "attribute must be of type date (\"first\" and \"last\" are valid values)";
  }

  /**
   * Gets the index of the attribute converted.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the index of the attribute
   */
  public String getAttributeIndex() {

    return m_AttIndex.getSingleIndex();
  }

  /**
   * Sets the index of the attribute used.
<<<<<<< HEAD
   * 
   * @param attIndex the index of the attribute
   */
  public void setAttributeIndex(String attIndex) {

=======
   *
   * @param attIndex the index of the attribute
   */
  public void setAttributeIndex(String attIndex) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_AttIndex.setSingleIndex(attIndex);
  }

  /**
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String dateFormatTipText() {

    return "The date format to change to. This should be a "
      + "format understood by Java's SimpleDateFormat class.";
  }

  /**
   * Get the date format used in output.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the output date format.
   */
  public SimpleDateFormat getDateFormat() {

    return m_DateFormat;
  }

  /**
   * Sets the output date format.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param dateFormat the output date format.
   */
  public void setDateFormat(String dateFormat) {

    setDateFormat(new SimpleDateFormat(dateFormat));
  }

  /**
   * Sets the output date format.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param dateFormat the output date format.
   */
  public void setDateFormat(SimpleDateFormat dateFormat) {
    if (dateFormat == null) {
      throw new NullPointerException();
    }
    m_DateFormat = dateFormat;
  }

  /**
<<<<<<< HEAD
   * Set the output format. Changes the format of the specified date attribute.
   */
  private void setOutputFormat() {

    // Create new attributes
    ArrayList<Attribute> newAtts = new ArrayList<Attribute>(getInputFormat()
      .numAttributes());
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (j == m_AttIndex.getIndex()) {
        Attribute a = new Attribute(att.name(), getDateFormat().toPattern());
        a.setWeight(att.weight());
        newAtts.add(a);
      } else {
        newAtts.add((Attribute) att.copy());
      }
    }

    // Create new header
    Instances newData = new Instances(getInputFormat().relationName(), newAtts,
      0);
=======
   * Set the output format. Changes the format of the specified date
   * attribute.
   */
  private void setOutputFormat() {
    
    // Create new attributes
    FastVector newAtts = new FastVector(getInputFormat().numAttributes());
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (j == m_AttIndex.getIndex()) {
	newAtts.addElement(new Attribute(att.name(), getDateFormat().toPattern()));  
      } else {
	newAtts.addElement(att.copy()); 
      }
    }
      
    // Create new header
    Instances newData = new Instances(getInputFormat().relationName(), newAtts, 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    newData.setClassIndex(getInputFormat().classIndex());
    m_OutputAttribute = newData.attribute(m_AttIndex.getIndex());
    setOutputFormat(newData);
  }
<<<<<<< HEAD

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
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5543 $");
  }
  
  /**
   * Main method for testing this class.
   *
   * @param argv should contain arguments to the filter: 
   * use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new ChangeDateFormat(), argv);
  }
}
