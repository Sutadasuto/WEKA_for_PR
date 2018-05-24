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
 *    Add.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters.unsupervised.attribute;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
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
import weka.core.Range;
import weka.core.RevisionUtils;
import weka.core.SelectedTag;
import weka.core.SingleIndex;
import weka.core.Tag;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> An instance filter that adds a new attribute to the
 * dataset. The new attribute will contain all missing values.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -T &lt;NUM|NOM|STR|DAT&gt;
=======
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * An instance filter that adds a new attribute to the dataset. The new attribute will contain all missing values.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -T &lt;NUM|NOM|STR|DAT&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *  The type of attribute to create:
 *  NUM = Numeric attribute
 *  NOM = Nominal attribute
 *  STR = String attribute
 *  DAT = Date attribute
<<<<<<< HEAD
 *  (default: NUM)
 * </pre>
 * 
 * <pre>
 * -C &lt;index&gt;
 *  Specify where to insert the column. First and last
 *  are valid indexes.(default: last)
 * </pre>
 * 
 * <pre>
 * -N &lt;name&gt;
 *  Name of the new attribute.
 *  (default: 'Unnamed')
 * </pre>
 * 
 * <pre>
 * -L &lt;label1,label2,...&gt;
 *  Create nominal attribute with given labels
 *  (default: numeric attribute)
 * </pre>
 * 
 * <pre>
 * -F &lt;format&gt;
 *  The format of the date values (see ISO-8601)
 *  (default: yyyy-MM-dd'T'HH:mm:ss)
 * </pre>
 *
 * <pre>
 * -W &lt;double&gt;
 *  The weight for the new attribute (default: 1.0)
 * </pre>
 *  *
 * <!-- options-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class Add extends Filter implements UnsupervisedFilter,
  StreamableFilter, OptionHandler, WeightedInstancesHandler, WeightedAttributesHandler {

=======
 *  (default: NUM)</pre>
 * 
 * <pre> -C &lt;index&gt;
 *  Specify where to insert the column. First and last
 *  are valid indexes.(default: last)</pre>
 * 
 * <pre> -N &lt;name&gt;
 *  Name of the new attribute.
 *  (default: 'Unnamed')</pre>
 * 
 * <pre> -L &lt;label1,label2,...&gt;
 *  Create nominal attribute with given labels
 *  (default: numeric attribute)</pre>
 * 
 * <pre> -F &lt;format&gt;
 *  The format of the date values (see ISO-8601)
 *  (default: yyyy-MM-dd'T'HH:mm:ss)</pre>
 * 
 <!-- options-end -->
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 5543 $
 */
public class Add 
  extends Filter 
  implements UnsupervisedFilter, StreamableFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization. */
  static final long serialVersionUID = 761386447332932389L;

  /** the attribute type. */
  public static final Tag[] TAGS_TYPE = {
    new Tag(Attribute.NUMERIC, "NUM", "Numeric attribute"),
    new Tag(Attribute.NOMINAL, "NOM", "Nominal attribute"),
<<<<<<< HEAD
    new Tag(Attribute.STRING, "STR", "String attribute"),
    new Tag(Attribute.DATE, "DAT", "Date attribute") };

=======
    new Tag(Attribute.STRING,  "STR", "String attribute"),
    new Tag(Attribute.DATE,    "DAT", "Date attribute")
  };
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Record the type of attribute to insert. */
  protected int m_AttributeType = Attribute.NUMERIC;

  /** The name for the new attribute. */
  protected String m_Name = "unnamed";

  /** The location to insert the new attribute. */
<<<<<<< HEAD
  private final SingleIndex m_Insert = new SingleIndex("last");

  /** The list of labels for nominal attribute. */
  protected ArrayList<String> m_Labels = new ArrayList<String>();

  /** The date format. */
  protected String m_DateFormat = "yyyy-MM-dd'T'HH:mm:ss";

  /** The weight for the new attribute. */
  protected double m_Weight = 1.0;

  /**
   * Returns a string describing this filter.
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
=======
  private SingleIndex m_Insert = new SingleIndex("last"); 

  /** The list of labels for nominal attribute. */
  protected FastVector m_Labels = new FastVector();

  /** The date format. */
  protected String m_DateFormat = "yyyy-MM-dd'T'HH:mm:ss";
  
  /**
   * Returns a string describing this filter.
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String globalInfo() {

    return "An instance filter that adds a new attribute to the dataset."
      + " The new attribute will contain all missing values.";
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector;
    String desc;
    SelectedTag tag;
    int i;

    newVector = new Vector<Option>();

    desc = "";
    for (i = 0; i < TAGS_TYPE.length; i++) {
      tag = new SelectedTag(TAGS_TYPE[i].getID(), TAGS_TYPE);
      desc += "\t" + tag.getSelectedTag().getIDStr() + " = "
        + tag.getSelectedTag().getReadable() + "\n";
    }
    newVector.addElement(new Option("\tThe type of attribute to create:\n"
      + desc + "\t(default: " + new SelectedTag(Attribute.NUMERIC, TAGS_TYPE)
      + ")", "T", 1, "-T " + Tag.toOptionList(TAGS_TYPE)));

    newVector.addElement(new Option(
      "\tSpecify where to insert the column. First and last\n"
        + "\tare valid indexes.(default: last)", "C", 1, "-C <index>"));

    newVector.addElement(new Option("\tName of the new attribute.\n"
      + "\t(default: 'Unnamed')", "N", 1, "-N <name>"));

    newVector.addElement(new Option(
      "\tCreate nominal attribute with given labels\n"
        + "\t(default: numeric attribute)", "L", 1, "-L <label1,label2,...>"));

    newVector.addElement(new Option(
      "\tThe format of the date values (see ISO-8601)\n"
        + "\t(default: yyyy-MM-dd'T'HH:mm:ss)", "F", 1, "-F <format>"));

    newVector.addElement(new Option(
            "\tThe weight for the new attribute\n"
                    + "\t(default: 1.0)", "W", 1, "-W <double>"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector 		newVector;
    String		desc;
    SelectedTag		tag;
    int			i;

    newVector = new Vector();

    desc  = "";
    for (i = 0; i < TAGS_TYPE.length; i++) {
      tag = new SelectedTag(TAGS_TYPE[i].getID(), TAGS_TYPE);
      desc  +=   "\t" + tag.getSelectedTag().getIDStr() 
      	       + " = " + tag.getSelectedTag().getReadable()
      	       + "\n";
    }
    newVector.addElement(new Option(
	"\tThe type of attribute to create:\n"
	+ desc
	+"\t(default: " + new SelectedTag(Attribute.NUMERIC, TAGS_TYPE) + ")",
	"T", 1, "-T " + Tag.toOptionList(TAGS_TYPE)));

    newVector.addElement(new Option(
	"\tSpecify where to insert the column. First and last\n"
	+"\tare valid indexes.(default: last)",
	"C", 1, "-C <index>"));

    newVector.addElement(new Option(
	"\tName of the new attribute.\n"
	+"\t(default: 'Unnamed')",
	"N", 1,"-N <name>"));
    
    newVector.addElement(new Option(
	"\tCreate nominal attribute with given labels\n"
	+"\t(default: numeric attribute)",
	"L", 1, "-L <label1,label2,...>"));

    newVector.addElement(new Option(
	"\tThe format of the date values (see ISO-8601)\n"
	+"\t(default: yyyy-MM-dd'T'HH:mm:ss)",
	"F", 1, "-F <format>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newVector.elements();
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
   * -T &lt;NUM|NOM|STR|DAT&gt;
=======

  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -T &lt;NUM|NOM|STR|DAT&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  The type of attribute to create:
   *  NUM = Numeric attribute
   *  NOM = Nominal attribute
   *  STR = String attribute
   *  DAT = Date attribute
<<<<<<< HEAD
   *  (default: NUM)
   * </pre>
   * 
   * <pre>
   * -C &lt;index&gt;
   *  Specify where to insert the column. First and last
   *  are valid indexes.(default: last)
   * </pre>
   * 
   * <pre>
   * -N &lt;name&gt;
   *  Name of the new attribute.
   *  (default: 'Unnamed')
   * </pre>
   * 
   * <pre>
   * -L &lt;label1,label2,...&gt;
   *  Create nominal attribute with given labels
   *  (default: numeric attribute)
   * </pre>
   * 
   * <pre>
   * -F &lt;format&gt;
   *  The format of the date values (see ISO-8601)
   *  (default: yyyy-MM-dd'T'HH:mm:ss)
   * </pre>
   *
   * <pre>
   * -W &lt;double&gt;
   *  The weight for the new attribute (default: 1.0)
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

    tmpStr = Utils.getOption('T', options);
    if (tmpStr.length() != 0) {
      setAttributeType(new SelectedTag(tmpStr, TAGS_TYPE));
    } else {
      setAttributeType(new SelectedTag(Attribute.NUMERIC, TAGS_TYPE));
    }

    tmpStr = Utils.getOption('C', options);
    if (tmpStr.length() == 0) {
      tmpStr = "last";
    }
    setAttributeIndex(tmpStr);

    setAttributeName(Utils.unbackQuoteChars(Utils.getOption('N', options)));

    if (m_AttributeType == Attribute.NOMINAL) {
      tmpStr = Utils.getOption('L', options);
      if (tmpStr.length() != 0) {
        setNominalLabels(tmpStr);
      }
    } else if (m_AttributeType == Attribute.DATE) {
      tmpStr = Utils.getOption('F', options);
      if (tmpStr.length() != 0) {
        setDateFormat(tmpStr);
      }
    }

    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() == 0) {
      setWeight(1.0);
    } else {
      setWeight(Double.parseDouble(tmpStr));
=======
   *  (default: NUM)</pre>
   * 
   * <pre> -C &lt;index&gt;
   *  Specify where to insert the column. First and last
   *  are valid indexes.(default: last)</pre>
   * 
   * <pre> -N &lt;name&gt;
   *  Name of the new attribute.
   *  (default: 'Unnamed')</pre>
   * 
   * <pre> -L &lt;label1,label2,...&gt;
   *  Create nominal attribute with given labels
   *  (default: numeric attribute)</pre>
   * 
   * <pre> -F &lt;format&gt;
   *  The format of the date values (see ISO-8601)
   *  (default: yyyy-MM-dd'T'HH:mm:ss)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;

    tmpStr = Utils.getOption('T', options);
    if (tmpStr.length() != 0)
      setAttributeType(new SelectedTag(tmpStr, TAGS_TYPE));
    else
      setAttributeType(new SelectedTag(Attribute.NUMERIC, TAGS_TYPE));
    
    tmpStr = Utils.getOption('C', options);
    if (tmpStr.length() == 0)
      tmpStr = "last";
    setAttributeIndex(tmpStr);
    
    setAttributeName(Utils.unbackQuoteChars(Utils.getOption('N', options)));
    
    if (m_AttributeType == Attribute.NOMINAL) {
      tmpStr = Utils.getOption('L', options);
      if (tmpStr.length() != 0)
	setNominalLabels(tmpStr);
    }
    else if (m_AttributeType == Attribute.DATE) {
      tmpStr = Utils.getOption('F', options);
      if (tmpStr.length() != 0)
	setDateFormat(tmpStr);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

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
    Vector<String> result;

    result = new Vector<String>();

=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {
    Vector<String>	result;
    
    result = new Vector<String>();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_AttributeType != Attribute.NUMERIC) {
      result.add("-T");
      result.add("" + getAttributeType());
    }
<<<<<<< HEAD

    result.add("-N");
    result.add(Utils.backQuoteChars(getAttributeName()));

    if (m_AttributeType == Attribute.NOMINAL) {
      result.add("-L");
      result.add(getNominalLabels());
    } else if (m_AttributeType == Attribute.NOMINAL) {
      result.add("-F");
      result.add(getDateFormat());
    }

    result.add("-C");
    result.add("" + getAttributeIndex());

    result.add("-W");
    result.add("" + getWeight());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
    
    result.add("-N");
    result.add(Utils.backQuoteChars(getAttributeName()));
    
    if (m_AttributeType == Attribute.NOMINAL) {
      result.add("-L");
      result.add(getNominalLabels());
    }
    else if (m_AttributeType == Attribute.NOMINAL) {
      result.add("-F");
      result.add(getDateFormat());
    }
    
    result.add("-C");
    result.add("" + getAttributeIndex());

    return result.toArray(new String[result.size()]);
  }

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
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);

    m_Insert.setUpper(instanceInfo.numAttributes());
    Instances outputFormat = new Instances(instanceInfo, 0);
    Attribute newAttribute = null;
    switch (m_AttributeType) {
<<<<<<< HEAD
    case Attribute.NUMERIC:
      newAttribute = new Attribute(m_Name);
      break;
    case Attribute.NOMINAL:
      newAttribute = new Attribute(m_Name, m_Labels);
      break;
    case Attribute.STRING:
      newAttribute = new Attribute(m_Name, (ArrayList<String>) null);
      break;
    case Attribute.DATE:
      newAttribute = new Attribute(m_Name, m_DateFormat);
      break;
    default:
      throw new IllegalArgumentException("Unknown attribute type in Add");
    }
    newAttribute.setWeight(getWeight());

    if ((m_Insert.getIndex() < 0)
      || (m_Insert.getIndex() > getInputFormat().numAttributes())) {
=======
      case Attribute.NUMERIC:
	newAttribute = new Attribute(m_Name);
	break;
      case Attribute.NOMINAL:
	newAttribute = new Attribute(m_Name, m_Labels);
	break;
      case Attribute.STRING:
	newAttribute = new Attribute(m_Name, (FastVector) null);
	break;
      case Attribute.DATE:
	newAttribute = new Attribute(m_Name, m_DateFormat);
	break;
      default:
	throw new IllegalArgumentException("Unknown attribute type in Add");
    }

    if ((m_Insert.getIndex() < 0) || 
	(m_Insert.getIndex() > getInputFormat().numAttributes())) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new IllegalArgumentException("Index out of range");
    }
    outputFormat.insertAttributeAt(newAttribute, m_Insert.getIndex());
    setOutputFormat(outputFormat);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // all attributes, except index of added attribute
    // (otherwise the length of the input/output indices differ)
    Range atts = new Range(m_Insert.getSingleIndex());
    atts.setInvert(true);
    atts.setUpper(outputFormat.numAttributes() - 1);
    initOutputLocators(outputFormat, atts.getSelection());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return true;
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering. Ordinarily the instance is processed and
   * made available for output immediately. Some filters require all instances
   * be read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input format has been defined.
   */
  @Override
=======
   * Input an instance for filtering. Ordinarily the instance is processed
   * and made available for output immediately. Some filters require all
   * instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been defined.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean input(Instance instance) {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }

<<<<<<< HEAD
    Instance inst = (Instance) instance.copy();

    // First copy string values from input to output
    copyValues(inst, true, inst.dataset(), outputFormatPeek());

    // Insert the new attribute and reassign to output
    inst.setDataset(null);
    inst.insertAttributeAt(m_Insert.getIndex());

    push(inst); // No need to copy instance
=======
    Instance inst = (Instance)instance.copy();

    // First copy string values from input to output
    copyValues(inst, true, inst.dataset(), getOutputFormat());
    
    // Insert the new attribute and reassign to output
    inst.setDataset(null);
    inst.insertAttributeAt(m_Insert.getIndex());
    inst.setDataset(getOutputFormat());
    push(inst);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return true;
  }

  /**
   * Returns the tip text for this property.
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
   * Get the name of the attribute to be created.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the new attribute name
   */
  public String getAttributeName() {

    return m_Name;
  }

<<<<<<< HEAD
  /**
   * Set the new attribute's name.
   * 
   * @param name the new name
   */
  public void setAttributeName(String name) {
    if (name.trim().equals("")) {
      m_Name = "unnamed";
    } else {
      m_Name = name;
    }
=======
  /** 
   * Set the new attribute's name.
   *
   * @param name the new name
   */
  public void setAttributeName(String name) {
    if (name.trim().equals(""))
      m_Name = "unnamed";
    else
      m_Name = name;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property.
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
  public String attributeIndexTipText() {

    return "The position (starting from 1) where the attribute will be inserted "
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
  public String getAttributeIndex() {

    return m_Insert.getSingleIndex();
  }

  /**
   * Sets index of the attribute used.
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
    m_Insert.setSingleIndex(attIndex);
  }

  /**
   * Returns the tip text for this property.
   *
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String weightTipText() {

    return "The weight for the new attribute.";
  }

  /**
   * Get the weight of the attribute used.
   *
   * @return the weight of the attribute
   */
  public double getWeight() {

    return m_Weight;
  }

  /**
   * Sets weight of the attribute used.
   *
   * @param weight the weight of the attribute
   */
  public void setWeight(double weight) {

    m_Weight = weight;
  }
  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String nominalLabelsTipText() {
    return "The list of value labels (nominal attribute creation only). "
      + " The list must be comma-separated, eg: \"red,green,blue\"."
      + " If this is empty, the created attribute will be numeric.";
  }

  /**
   * Get the list of labels for nominal attribute creation.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the list of labels for nominal attribute creation
   */
  public String getNominalLabels() {

    String labelList = "";
<<<<<<< HEAD
    for (int i = 0; i < m_Labels.size(); i++) {
      if (i == 0) {
        labelList = m_Labels.get(i);
      } else {
        labelList += "," + m_Labels.get(i);
=======
    for(int i = 0; i < m_Labels.size(); i++) {
      if (i == 0) {
	labelList = (String)m_Labels.elementAt(i);
      } else {
	labelList += "," + (String)m_Labels.elementAt(i); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return labelList;
  }

  /**
   * Set the labels for nominal attribute creation.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param labelList a comma separated list of labels
   * @throws IllegalArgumentException if the labelList was invalid
   */
  public void setNominalLabels(String labelList) {

<<<<<<< HEAD
    ArrayList<String> labels = new ArrayList<String>(10);
=======
    FastVector labels = new FastVector (10);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // Split the labelList up into the vector
    int commaLoc;
    while ((commaLoc = labelList.indexOf(',')) >= 0) {
      String label = labelList.substring(0, commaLoc).trim();
      if (!label.equals("")) {
<<<<<<< HEAD
        labels.add(label);
      } else {
        throw new IllegalArgumentException("Invalid label list at "
          + labelList.substring(commaLoc));
=======
	labels.addElement(label);
      } else {
	throw new IllegalArgumentException("Invalid label list at "+
                                           labelList.substring(commaLoc));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      labelList = labelList.substring(commaLoc + 1);
    }
    String label = labelList.trim();
    if (!label.equals("")) {
<<<<<<< HEAD
      labels.add(label);
=======
      labels.addElement(label);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    // If everything is OK, make the type change
    m_Labels = labels;
    if (labels.size() == 0) {
      m_AttributeType = Attribute.NUMERIC;
    } else {
<<<<<<< HEAD
      m_AttributeType = Attribute.NOMINAL;
=======
      m_AttributeType = Attribute.NOMINAL; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String attributeTypeTipText() {
    return "Defines the type of the attribute to generate.";
  }

  /**
<<<<<<< HEAD
   * Sets the type of attribute to generate.
   * 
   * @param value the attribute type
=======
   * Sets the type of attribute to generate. 
   *
   * @param value 	the attribute type
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setAttributeType(SelectedTag value) {
    if (value.getTags() == TAGS_TYPE) {
      m_AttributeType = value.getSelectedTag().getID();
    }
  }

  /**
<<<<<<< HEAD
   * Gets the type of attribute to generate.
   * 
   * @return the current attribute type.
=======
   * Gets the type of attribute to generate. 
   *
   * @return 		the current attribute type.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public SelectedTag getAttributeType() {
    return new SelectedTag(m_AttributeType, TAGS_TYPE);
  }

  /**
   * Returns the tip text for this property.
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String dateFormatTipText() {
    return "The format of the date values (see ISO-8601).";
  }

  /**
   * Get the date format, complying to ISO-8601.
<<<<<<< HEAD
   * 
   * @return the date format
=======
   *
   * @return 		the date format
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String getDateFormat() {
    return m_DateFormat;
  }

  /**
   * Set the date format, complying to ISO-8601.
<<<<<<< HEAD
   * 
   * @param value a comma separated list of labels
=======
   *
   * @param value 	a comma separated list of labels
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setDateFormat(String value) {
    try {
      new SimpleDateFormat(value);
      m_DateFormat = value;
<<<<<<< HEAD
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
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
=======
   *
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new Add(), argv);
  }
}
