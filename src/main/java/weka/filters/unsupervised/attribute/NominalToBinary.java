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
 *    NominalToBinary.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters.unsupervised.attribute;

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
import weka.core.SparseInstance;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> Converts all nominal attributes into binary numeric
 * attributes. An attribute with k values is transformed into k binary
 * attributes if the class is nominal (using the one-attribute-per-value
 * approach). Binary attributes are left binary if option '-A' is not given. If
 * the class is numeric, you might want to use the supervised version of this
 * filter.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -N
 *  Sets if binary attributes are to be coded as nominal ones.
 * </pre>
 * 
 * <pre>
 * -A
 *  For each nominal value a new attribute is created, 
 *  not only if there are more than 2 values.
 * </pre>
 * 
 * <pre>
 * -R &lt;col1,col2-col4,...&gt;
 *  Specifies list of columns to act on. First and last are 
 *  valid indexes.
 *  (default: first-last)
 * </pre>
 * 
 * <pre>
 * -V
 *  Invert matching sense of column indexes.
 * </pre>
 *
 * <pre>-spread-attribute-weight
 *  When generating binary attributes, spread weight of old
 *  attribute across new attributes. Do not give each new attribute the old weight.</pre>
 *
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class NominalToBinary extends Filter implements UnsupervisedFilter,
  OptionHandler, StreamableFilter, WeightedAttributesHandler, WeightedInstancesHandler {

=======
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * Converts all nominal attributes into binary numeric attributes. An attribute with k values is transformed into k binary attributes if the class is nominal (using the one-attribute-per-value approach). Binary attributes are left binary, if option '-A' is not given.If the class is numeric, you might want to use the supervised version of this filter.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -N
 *  Sets if binary attributes are to be coded as nominal ones.</pre>
 * 
 * <pre> -A
 *  For each nominal value a new attribute is created, 
 *  not only if there are more than 2 values.</pre>
 * 
 * <pre> -R &lt;col1,col2-col4,...&gt;
 *  Specifies list of columns to act on. First and last are 
 *  valid indexes.
 *  (default: first-last)</pre>
 * 
 * <pre> -V
 *  Invert matching sense of column indexes.</pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz) 
 * @version $Revision: 9819 $ 
 */
public class NominalToBinary 
  extends Filter 
  implements UnsupervisedFilter, OptionHandler, StreamableFilter {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  static final long serialVersionUID = -1130642825710549138L;

  /** Stores which columns to act on */
  protected Range m_Columns = new Range();

  /** Are the new attributes going to be nominal or numeric ones? */
  private boolean m_Numeric = true;

  /** Are all values transformed into new attributes? */
  private boolean m_TransformAll = false;
<<<<<<< HEAD

  /** Whether we need to transform at all */
  private boolean m_needToTransform = false;

  /** Whether to spread attribute weight when creating binary attributes */
  protected boolean m_SpreadAttributeWeight = false;

=======
  
  /** Whether we need to transform at all */
  private boolean m_needToTransform = false;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Constructor - initialises the filter */
  public NominalToBinary() {

    setAttributeIndices("first-last");
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

    return "Converts all nominal attributes into binary numeric attributes. An "
      + "attribute with k values is transformed into k binary attributes if "
      + "the class is nominal (using the one-attribute-per-value approach). "
<<<<<<< HEAD
      + "Binary attributes are left binary if option '-A' is not given. "
=======
      + "Binary attributes are left binary, if option '-A' is not given."
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "If the class is numeric, you might want to use the supervised version of "
      + "this filter.";
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

    m_Columns.setUpper(instanceInfo.numAttributes() - 1);

    setOutputFormat();
    return true;
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering. Filter requires all training instances be
   * read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input format has been set
   */
  @Override
=======
   * Input an instance for filtering. Filter requires all
   * training instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been set
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

    convertInstance(instance);
    return true;
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(4);

    newVector.addElement(new Option(
      "\tSets if binary attributes are to be coded as nominal ones.", "N", 0,
      "-N"));

    newVector.addElement(new Option(
      "\tFor each nominal value a new attribute is created, \n"
        + "\tnot only if there are more than 2 values.", "A", 0, "-A"));

    newVector.addElement(new Option(
            "\tSpecifies list of columns to act on. First and last are \n"
                    + "\tvalid indexes.\n" + "\t(default: first-last)", "R", 1,
            "-R <col1,col2-col4,...>"));

    newVector.addElement(new Option(
            "\tInvert matching sense of column indexes.", "V", 0, "-V"));

    newVector.addElement(new Option("\tWhen generating binary attributes, spread weight of old "
            + "attribute across new attributes. Do not give each new attribute the old weight.\n\t",
            "spread-attribute-weight", 0, "-spread-attribute-weight"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(3);

    newVector.addElement(new Option(
	"\tSets if binary attributes are to be coded as nominal ones.",
	"N", 0, "-N"));

    newVector.addElement(new Option(
	"\tFor each nominal value a new attribute is created, \n"
	+ "\tnot only if there are more than 2 values.",
	"A", 0, "-A"));

    newVector.addElement(new Option(
	"\tSpecifies list of columns to act on. First and last are \n"
	+ "\tvalid indexes.\n"
	+ "\t(default: first-last)",
	"R", 1, "-R <col1,col2-col4,...>"));

    newVector.addElement(new Option(
	"\tInvert matching sense of column indexes.",
	"V", 0, "-V"));
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
   * -N
   *  Sets if binary attributes are to be coded as nominal ones.
   * </pre>
   * 
   * <pre>
   * -A
   *  For each nominal value a new attribute is created, 
   *  not only if there are more than 2 values.
   * </pre>
   * 
   * <pre>
   * -R &lt;col1,col2-col4,...&gt;
   *  Specifies list of columns to act on. First and last are 
   *  valid indexes.
   *  (default: first-last)
   * </pre>
   * 
   * <pre>
   * -V
   *  Invert matching sense of column indexes.
   * </pre>
   *
   * <pre>-spread-attribute-weight
   *  When generating binary attributes, spread weight of old
   *  attribute across new attributes. Do not give each new attribute the old weight.</pre>
   *
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
=======

  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -N
   *  Sets if binary attributes are to be coded as nominal ones.</pre>
   * 
   * <pre> -A
   *  For each nominal value a new attribute is created, 
   *  not only if there are more than 2 values.</pre>
   * 
   * <pre> -R &lt;col1,col2-col4,...&gt;
   *  Specifies list of columns to act on. First and last are 
   *  valid indexes.
   *  (default: first-last)</pre>
   * 
   * <pre> -V
   *  Invert matching sense of column indexes.</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {

    setBinaryAttributesNominal(Utils.getFlag('N', options));

    setTransformAllValues(Utils.getFlag('A', options));

    String convertList = Utils.getOption('R', options);
    if (convertList.length() != 0) {
      setAttributeIndices(convertList);
    } else {
      setAttributeIndices("first-last");
    }
    setInvertSelection(Utils.getFlag('V', options));

<<<<<<< HEAD
    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }

    setSpreadAttributeWeight(Utils.getFlag("spread-attribute-weight", options));

    Utils.checkForRemainingOptions(options);
=======
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

    Vector<String> options = new Vector<String>();

    if (getBinaryAttributesNominal()) {
      options.add("-N");
    }

    if (getTransformAllValues()) {
      options.add("-A");
    }

    if (!getAttributeIndices().equals("")) {
      options.add("-R");
      options.add(getAttributeIndices());
    }
    if (getInvertSelection()) {
      options.add("-V");
    }

    if (getSpreadAttributeWeight()) {
      options.add("-spread-attribute-weight");
    }

    return options.toArray(new String[0]);
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [4];
    int current = 0;

    if (getBinaryAttributesNominal()) {
      options[current++] = "-N";
    }

    if (getTransformAllValues()) {
      options[current++] = "-A";
    }

    if (!getAttributeIndices().equals("")) {
      options[current++] = "-R"; options[current++] = getAttributeIndices();
    }
    if (getInvertSelection()) {
      options[current++] = "-V";
    }

    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
   *
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String spreadAttributeWeightTipText() {
    return "When generating binary attributes, spread weight of old attribute across new attributes. " +
            "Do not give each new attribute the old weight.";
  }

  /**
   * If true, when generating binary attributes, spread weight of old
   * attribute across new attributes. Do not give each new attribute the old weight.
   *
   * @param p whether weight is spread
   */
  public void setSpreadAttributeWeight(boolean p) {
    m_SpreadAttributeWeight = p;
  }

  /**
   * If true, when generating binary attributes, spread weight of old
   * attribute across new attributes. Do not give each new attribute the old weight.
   *
   * @return whether weight is spread
   */
  public boolean getSpreadAttributeWeight() {
    return m_SpreadAttributeWeight;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String binaryAttributesNominalTipText() {
    return "Whether resulting binary attributes will be nominal.";
  }

  /**
   * Gets if binary attributes are to be treated as nominal ones.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if binary attributes are to be treated as nominal ones
   */
  public boolean getBinaryAttributesNominal() {

    return !m_Numeric;
  }

  /**
   * Sets if binary attributes are to be treates as nominal ones.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param bool true if binary attributes are to be treated as nominal ones
   */
  public void setBinaryAttributesNominal(boolean bool) {

    m_Numeric = !bool;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String transformAllValuesTipText() {
    return "Whether all nominal values are turned into new attributes, not only if there are more than 2 values.";
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String transformAllValuesTipText() {
    return "Whether all nominal values are turned into new attributes, not only if there are more than 2.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets if all nominal values are turned into new attributes, not only if
   * there are more than 2.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true all nominal values are transformed into new attributes
   */
  public boolean getTransformAllValues() {

    return m_TransformAll;
  }

  /**
   * Sets whether all nominal values are transformed into new attributes, not
   * just if there are more than 2.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param bool true if all nominal value are transformed into new attributes
   */
  public void setTransformAllValues(boolean bool) {

    m_TransformAll = bool;
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

    return "Set attribute selection mode. If false, only selected"
<<<<<<< HEAD
      + " (nominal) attributes in the range will be processed; if"
      + " true, only non-selected attributes will be processed.";
=======
      + " (numeric) attributes in the range will be discretized; if"
      + " true, only non-selected attributes will be discretized.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets whether the supplied columns are to be removed or kept
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if the supplied columns will be kept
   */
  public boolean getInvertSelection() {

    return m_Columns.getInvert();
  }

  /**
<<<<<<< HEAD
   * Sets whether selected columns should be removed or kept. If true the
   * selected columns are kept and unselected columns are deleted. If false
   * selected columns are deleted and unselected columns are kept.
   * 
=======
   * Sets whether selected columns should be removed or kept. If true the 
   * selected columns are kept and unselected columns are deleted. If false
   * selected columns are deleted and unselected columns are kept.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param invert the new invert setting
   */
  public void setInvertSelection(boolean invert) {

    m_Columns.setInvert(invert);
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
  public String attributeIndicesTipText() {
    return "Specify range of attributes to act on."
      + " This is a comma separated list of attribute indices, with"
      + " \"first\" and \"last\" valid values. Specify an inclusive"
      + " range with \"-\". E.g: \"first-3,5,6-10,last\".";
  }

  /**
   * Gets the current range selection
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a string containing a comma separated list of ranges
   */
  public String getAttributeIndices() {

    return m_Columns.getRanges();
  }

  /**
   * Sets which attributes are to be acted on.
<<<<<<< HEAD
   * 
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br>
   *          eg: first-3,5,6-last
   * @throws IllegalArgumentException if an invalid range list is supplied
=======
   *
   * @param rangeList a string representing the list of attributes. Since
   * the string will typically come from a user, attributes are indexed from
   * 1. <br>
   * eg: first-3,5,6-last
   * @throws IllegalArgumentException if an invalid range list is supplied 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setAttributeIndices(String rangeList) {

    m_Columns.setRanges(rangeList);
  }

  /**
   * Set the output format if the class is nominal.
   */
  private void setOutputFormat() {

<<<<<<< HEAD
    ArrayList<Attribute> newAtts;
    int newClassIndex;
    StringBuffer attributeName;
    Instances outputFormat;
    ArrayList<String> vals;

    // Compute new attributes
    m_needToTransform = false;
    for (int i = 0; i < getInputFormat().numAttributes(); i++) {
      Attribute att = getInputFormat().attribute(i);
      if (att.isNominal() && i != getInputFormat().classIndex()
        && (att.numValues() > 2 || m_TransformAll || m_Numeric)) {
=======
    FastVector newAtts;
    int newClassIndex;
    StringBuffer attributeName;
    Instances outputFormat;
    FastVector vals;

    // Compute new attributes
    
    m_needToTransform = false;
    for (int i = 0; i < getInputFormat().numAttributes(); i++) {
      Attribute att = getInputFormat().attribute(i);
      if (att.isNominal() && i != getInputFormat().classIndex() && 
          (att.numValues() > 2 || m_TransformAll || m_Numeric)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        m_needToTransform = true;
        break;
      }
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (!m_needToTransform) {
      setOutputFormat(getInputFormat());
      return;
    }

    newClassIndex = getInputFormat().classIndex();
<<<<<<< HEAD
    newAtts = new ArrayList<Attribute>();
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (!att.isNominal() || (j == getInputFormat().classIndex())
        || !m_Columns.isInRange(j)) {
        newAtts.add((Attribute) att.copy());
      } else {
        if ((att.numValues() <= 2) && (!m_TransformAll)) {
          if (m_Numeric) {
            String value = "";
            if (att.numValues() == 2) {
              value = "=" + att.value(1);
            }
            Attribute a = new Attribute(att.name() + value);
            a.setWeight(att.weight());
            newAtts.add(a);
          } else {
            newAtts.add((Attribute) att.copy());
          }
        } else {

          if (newClassIndex >= 0 && j < getInputFormat().classIndex()) {
            newClassIndex += att.numValues() - 1;
          }

          // Compute values for new attributes
          for (int k = 0; k < att.numValues(); k++) {
            attributeName = new StringBuffer(att.name() + "=");
            attributeName.append(att.value(k));
            if (m_Numeric) {
              Attribute a = new Attribute(attributeName.toString());
              if (getSpreadAttributeWeight()) {
                a.setWeight(att.weight() / att.numValues());
              } else {
                a.setWeight(att.weight());
              }
              newAtts.add(a);
            } else {
              vals = new ArrayList<String>(2);
              vals.add("f");
              vals.add("t");
              Attribute a = new Attribute(attributeName.toString(), vals);
              if (getSpreadAttributeWeight()) {
                a.setWeight(att.weight() / att.numValues());
              } else {
                a.setWeight(att.weight());
              }
              newAtts.add(a);
            }
          }
        }
      }
    }
    outputFormat = new Instances(getInputFormat().relationName(), newAtts, 0);
=======
    newAtts = new FastVector();
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (!att.isNominal() || (j == getInputFormat().classIndex()) ||
	  !m_Columns.isInRange(j)) {
	newAtts.addElement(att.copy());
      } else {
	if ( (att.numValues() <= 2) && (!m_TransformAll) ) {
	  if (m_Numeric) {
	    newAtts.addElement(new Attribute(att.name()));
	  } else {
	    newAtts.addElement(att.copy());
	  }
	} else {

	  if (newClassIndex >= 0 && j < getInputFormat().classIndex()) {
	    newClassIndex += att.numValues() - 1;
	  }

	  // Compute values for new attributes
	  for (int k = 0; k < att.numValues(); k++) {
	    attributeName = 
	      new StringBuffer(att.name() + "=");
	    attributeName.append(att.value(k));
	    if (m_Numeric) {
	      newAtts.
		addElement(new Attribute(attributeName.toString()));
	    } else {
	      vals = new FastVector(2);
	      vals.addElement("f"); vals.addElement("t");
	      newAtts.
		addElement(new Attribute(attributeName.toString(), vals));
	    }
	  }
	}
      }
    }
    outputFormat = new Instances(getInputFormat().relationName(),
				 newAtts, 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    outputFormat.setClassIndex(newClassIndex);
    setOutputFormat(outputFormat);
  }

  /**
<<<<<<< HEAD
   * Convert a single instance over if the class is nominal. The converted
   * instance is added to the end of the output queue.
   * 
   * @param instance the instance to convert
   */
  private void convertInstance(Instance instance) {

=======
   * Convert a single instance over if the class is nominal. The converted 
   * instance is added to the end of the output queue.
   *
   * @param instance the instance to convert
   */
  private void convertInstance(Instance instance) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (!m_needToTransform) {
      push(instance);
      return;
    }

<<<<<<< HEAD
    double[] vals = new double[outputFormatPeek().numAttributes()];
    int attSoFar = 0;

    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (!att.isNominal() || (j == getInputFormat().classIndex())
        || !m_Columns.isInRange(j)) {
        vals[attSoFar] = instance.value(j);
        attSoFar++;
      } else {
        if ((att.numValues() <= 2) && (!m_TransformAll)) {
          vals[attSoFar] = instance.value(j);
          attSoFar++;
        } else {
          if (instance.isMissing(j)) {
            for (int k = 0; k < att.numValues(); k++) {
              vals[attSoFar + k] = instance.value(j);
            }
          } else {
            for (int k = 0; k < att.numValues(); k++) {
              if (k == (int) instance.value(j)) {
                vals[attSoFar + k] = 1;
              } else {
                vals[attSoFar + k] = 0;
              }
            }
          }
          attSoFar += att.numValues();
        }
=======
    double [] vals = new double [outputFormatPeek().numAttributes()];
    int attSoFar = 0;

    for(int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (!att.isNominal() || (j == getInputFormat().classIndex()) ||
	  !m_Columns.isInRange(j)) {
	vals[attSoFar] = instance.value(j);
	attSoFar++;
      } else {
	if ( (att.numValues() <= 2) && (!m_TransformAll) ) {
	  vals[attSoFar] = instance.value(j);
	  attSoFar++;
	} else {
	  if (instance.isMissing(j)) {
	    for (int k = 0; k < att.numValues(); k++) {
              vals[attSoFar + k] = instance.value(j);
	    }
	  } else {
	    for (int k = 0; k < att.numValues(); k++) {
	      if (k == (int)instance.value(j)) {
                vals[attSoFar + k] = 1;
	      } else {
                vals[attSoFar + k] = 0;
	      }
	    }
	  }
	  attSoFar += att.numValues();
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    Instance inst = null;
    if (instance instanceof SparseInstance) {
      inst = new SparseInstance(instance.weight(), vals);
    } else {
<<<<<<< HEAD
      inst = new DenseInstance(instance.weight(), vals);
    }

    copyValues(inst, false, instance.dataset(), getOutputFormat());

    push(inst); // No need to copy instance
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
      inst = new Instance(instance.weight(), vals);
    }
    inst.setDataset(getOutputFormat());
    copyValues(inst, false, instance.dataset(), getOutputFormat());
    inst.setDataset(getOutputFormat());
    push(inst);
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9819 $");
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
   * @param argv should contain arguments to the filter: 
   * use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new NominalToBinary(), argv);
  }
}
