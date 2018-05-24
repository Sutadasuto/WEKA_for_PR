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

package weka.filters.supervised.attribute;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.filters.supervised.attribute;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SparseInstance;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformationHandler;
import weka.core.UnassignedClassException;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.filters.Filter;
import weka.filters.SupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> Converts all nominal attributes into binary numeric
 * attributes. An attribute with k values is transformed into k binary
 * attributes if the class is nominal (using the one-attribute-per-value
 * approach). Binary attributes are left binary if option '-A' is not given. If
 * the class is numeric, k - 1 new binary attributes are generated in the manner
 * described in "Classification and Regression Trees" by Breiman et al. (i.e.
 * by taking the average class value associated with each attribute value into
 * account)<br/>
 * <br/>
 * For more information, see:<br/>
 * <br/>
 * L. Breiman, J.H. Friedman, R.A. Olshen, C.J. Stone (1984). Classification and
 * Regression Trees. Wadsworth Inc.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * Converts all nominal attributes into binary numeric attributes. An attribute with k values is transformed into k binary attributes if the class is nominal (using the one-attribute-per-value approach). Binary attributes are left binary, if option '-A' is not given.If the class is numeric, k - 1 new binary attributes are generated in the manner described in "Classification and Regression Trees" by Breiman et al. (i.e. taking the average class value associated with each attribute value into account)<br/>
 * <br/>
 * For more information, see:<br/>
 * <br/>
 * L. Breiman, J.H. Friedman, R.A. Olshen, C.J. Stone (1984). Classification and Regression Trees. Wadsworth Inc.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;book{Breiman1984,
 *    author = {L. Breiman and J.H. Friedman and R.A. Olshen and C.J. Stone},
 *    publisher = {Wadsworth Inc},
 *    title = {Classification and Regression Trees},
 *    year = {1984},
 *    ISBN = {0412048418}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
 * <!-- technical-bibtex-end -->
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
 * <pre>-spread-attribute-weight
 *  When generating binary attributes, spread weight of old
 *  attribute across new attributes. Do not give each new attribute the old weight.</pre>
 *
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class NominalToBinary extends Filter implements SupervisedFilter,
  OptionHandler, TechnicalInformationHandler, WeightedAttributesHandler, WeightedInstancesHandler {

=======
 <!-- technical-bibtex-end -->
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
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz) 
 * @version $Revision: 8094 $ 
 */
public class NominalToBinary 
  extends Filter 
  implements SupervisedFilter, OptionHandler, TechnicalInformationHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  static final long serialVersionUID = -5004607029857673950L;

  /** The sorted indices of the attribute values. */
  private int[][] m_Indices = null;

  /** Are the new attributes going to be nominal or numeric ones? */
  private boolean m_Numeric = true;

  /** Are all values transformed into new attributes? */
  private boolean m_TransformAll = false;
<<<<<<< HEAD

  /** Whether we need to transform at all */
  private boolean m_needToTransform = false;

  /** Whether to spread attribute weight when creating binary attributes */
  protected boolean m_SpreadAttributeWeight = false;

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /** Whether we need to transform at all */
  private boolean m_needToTransform = false;

  /**
   * Returns a string describing this filter
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
      + "If the class is numeric, k - 1 new binary attributes are generated "
      + "in the manner described in \"Classification and Regression "
      + "Trees\" by Breiman et al. (i.e., by taking the average class value associated "
      + "with each attribute value into account).\n\n"
      + "For more information, see:\n\n" + getTechnicalInformation().toString();
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  @Override
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;

    result = new TechnicalInformation(Type.BOOK);
    result.setValue(Field.AUTHOR,
      "L. Breiman and J.H. Friedman and R.A. Olshen and C.J. Stone");
=======
      + "Binary attributes are left binary, if option '-A' is not given."
      + "If the class is numeric, k - 1 new binary attributes are generated "
      + "in the manner described in \"Classification and Regression "
      + "Trees\" by Breiman et al. (i.e. taking the average class value associated "
      + "with each attribute value into account)\n\n"
      + "For more information, see:\n\n"
      + getTechnicalInformation().toString();
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;
    
    result = new TechnicalInformation(Type.BOOK);
    result.setValue(Field.AUTHOR, "L. Breiman and J.H. Friedman and R.A. Olshen and C.J. Stone");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.setValue(Field.TITLE, "Classification and Regression Trees");
    result.setValue(Field.YEAR, "1984");
    result.setValue(Field.PUBLISHER, "Wadsworth Inc");
    result.setValue(Field.ISBN, "0412048418");
<<<<<<< HEAD

    return result;
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
    
    return result;
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
    result.enable(Capability.NUMERIC_CLASS);
    result.enable(Capability.DATE_CLASS);
    result.enable(Capability.NOMINAL_CLASS);
<<<<<<< HEAD
    result.enable(Capability.MISSING_CLASS_VALUES);

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

    super.setInputFormat(instanceInfo);
    if (instanceInfo.classIndex() < 0) {
      throw new UnassignedClassException(
        "No class has been assigned to the instances");
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

    super.setInputFormat(instanceInfo);
    if (instanceInfo.classIndex() < 0) {
      throw new UnassignedClassException("No class has been assigned to the instances");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    setOutputFormat();
    m_Indices = null;
    if (instanceInfo.classAttribute().isNominal()) {
      return true;
    } else {
      return false;
    }
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
<<<<<<< HEAD
    if ((m_Indices != null) || (getInputFormat().classAttribute().isNominal())) {
      convertInstance((Instance)instance.copy());
=======
    if ((m_Indices != null) || 
	(getInputFormat().classAttribute().isNominal())) {
      convertInstance(instance);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return true;
    }
    bufferInput(instance);
    return false;
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
=======
   * Signify that this batch of input to the filter is finished. 
   * If the filter requires all instances prior to filtering,
   * output() may now be called to retrieve the filtered instances.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean batchFinished() {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
<<<<<<< HEAD
    if ((m_Indices == null) && (getInputFormat().classAttribute().isNumeric())) {
=======
    if ((m_Indices == null) && 
	(getInputFormat().classAttribute().isNumeric())) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      computeAverageClassValues();
      setOutputFormat();

      // Convert pending input instances

<<<<<<< HEAD
      for (int i = 0; i < getInputFormat().numInstances(); i++) {
        convertInstance(getInputFormat().instance(i));
      }
    }
=======
      for(int i = 0; i < getInputFormat().numInstances(); i++) {
	convertInstance(getInputFormat().instance(i));
      }
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    flushInput();

    m_NewBatch = true;
    return (numPendingOutput() != 0);
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
      "\tSets if binary attributes are to be coded as nominal ones.", "N", 0,
      "-N"));

    newVector.addElement(new Option(
      "\tFor each nominal value a new attribute is created, \n"
        + "\tnot only if there are more than 2 values.", "A", 0, "-A"));

    newVector.addElement(new Option("\tWhen generating binary attributes, spread weight of old "
            + "attribute across new attributes. Do not give each new attribute the old weight.\n\t",
            "spread-attribute-weight", 0, "-spread-attribute-weight"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(1);

    newVector.addElement(new Option(
	"\tSets if binary attributes are to be coded as nominal ones.",
	"N", 0, "-N"));
    
    newVector.addElement(new Option(
	"\tFor each nominal value a new attribute is created, \n"
	+ "\tnot only if there are more than 2 values.",
	"A", 0, "-A"));
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
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {

    setBinaryAttributesNominal(Utils.getFlag('N', options));

    setTransformAllValues(Utils.getFlag('A', options));

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

    if (getSpreadAttributeWeight()) {
      options.add("-spread-attribute-weight");
    }

    return options.toArray(new String[0]);
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [1];
    int current = 0;

    if (getBinaryAttributesNominal()) {
      options[current++] = "-N";
    }

    if (getTransformAllValues()) {
      options[current++] = "-A";
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
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String transformAllValuesTipText() {
    return "Whether all nominal values are turned into new attributes, not only if there are more than 2.";
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

  /** Computes average class values for each attribute and value */
  private void computeAverageClassValues() {

    double totalCounts, sum;
    Instance instance;
<<<<<<< HEAD
    double[] counts;

    double[][] avgClassValues = new double[getInputFormat().numAttributes()][0];
=======
    double [] counts;

    double [][] avgClassValues = new double[getInputFormat().numAttributes()][0];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_Indices = new int[getInputFormat().numAttributes()][0];
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if (att.isNominal()) {
<<<<<<< HEAD
        avgClassValues[j] = new double[att.numValues()];
        counts = new double[att.numValues()];
        for (int i = 0; i < getInputFormat().numInstances(); i++) {
          instance = getInputFormat().instance(i);
          if (!instance.classIsMissing() && (!instance.isMissing(j))) {
            counts[(int) instance.value(j)] += instance.weight();
            avgClassValues[j][(int) instance.value(j)] += instance.weight()
              * instance.classValue();
          }
        }
        sum = Utils.sum(avgClassValues[j]);
        totalCounts = Utils.sum(counts);
        if (Utils.gr(totalCounts, 0)) {
          for (int k = 0; k < att.numValues(); k++) {
            if (Utils.gr(counts[k], 0)) {
              avgClassValues[j][k] /= counts[k];
            } else {
              avgClassValues[j][k] = sum / totalCounts;
            }
          }
        }
        m_Indices[j] = Utils.sort(avgClassValues[j]);
=======
	avgClassValues[j] = new double [att.numValues()];
	counts = new double [att.numValues()];
	for (int i = 0; i < getInputFormat().numInstances(); i++) {
	  instance = getInputFormat().instance(i);
	  if (!instance.classIsMissing() && 
	      (!instance.isMissing(j))) {
	    counts[(int)instance.value(j)] += instance.weight();
	    avgClassValues[j][(int)instance.value(j)] += 
	      instance.weight() * instance.classValue();
	  }
	}
	sum = Utils.sum(avgClassValues[j]);
	totalCounts = Utils.sum(counts);
	if (Utils.gr(totalCounts, 0)) {
	  for (int k = 0; k < att.numValues(); k++) {
	    if (Utils.gr(counts[k], 0)) {
	      avgClassValues[j][k] /= (double)counts[k];
	    } else {
	      avgClassValues[j][k] = sum / (double)totalCounts;
	    }
	  }
	}
	m_Indices[j] = Utils.sort(avgClassValues[j]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /** Set the output format. */
  private void setOutputFormat() {

    if (getInputFormat().classAttribute().isNominal()) {
      setOutputFormatNominal();
    } else {
      setOutputFormatNumeric();
    }
  }

  /**
<<<<<<< HEAD
   * Convert a single instance over. The converted instance is added to the end
   * of the output queue.
   * 
   * @param inst the instance to convert
=======
   * Convert a single instance over. The converted instance is 
   * added to the end of the output queue.
   *
   * @param instance the instance to convert
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  private void convertInstance(Instance inst) {

    if (getInputFormat().classAttribute().isNominal()) {
      convertInstanceNominal(inst);
    } else {
      convertInstanceNumeric(inst);
    }
  }

  /**
   * Set the output format if the class is nominal.
   */
  private void setOutputFormatNominal() {

<<<<<<< HEAD
    ArrayList<Attribute> newAtts;
    int newClassIndex;
    StringBuffer attributeName;
    Instances outputFormat;
    ArrayList<String> vals;
=======
    FastVector newAtts;
    int newClassIndex;
    StringBuffer attributeName;
    Instances outputFormat;
    FastVector vals;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // Compute new attributes
    m_needToTransform = false;
    for (int i = 0; i < getInputFormat().numAttributes(); i++) {
      Attribute att = getInputFormat().attribute(i);
<<<<<<< HEAD
      if (att.isNominal() && i != getInputFormat().classIndex()
        && (att.numValues() > 2 || m_TransformAll || m_Numeric)) {
=======
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
      if ((!att.isNominal()) || (j == getInputFormat().classIndex())) {
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

          if (j < getInputFormat().classIndex()) {
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
      if ((!att.isNominal()) || 
	  (j == getInputFormat().classIndex())) {
	newAtts.addElement(att.copy());
      } else {
	if ( (att.numValues() <= 2) && (!m_TransformAll) ) {
	  if (m_Numeric) {
	    newAtts.addElement(new Attribute(att.name()));
	  } else {
	    newAtts.addElement(att.copy());
	  }
	} else {

	  if (j < getInputFormat().classIndex()) {
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
   * Set the output format if the class is numeric.
   */
  private void setOutputFormatNumeric() {

    if (m_Indices == null) {
      setOutputFormat(null);
      return;
    }
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
      if (att.isNominal()
        && (att.numValues() > 2 || m_Numeric || m_TransformAll)) {
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
      if (att.isNominal() && (att.numValues() > 2 || m_Numeric || m_TransformAll)) {
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
      if ((!att.isNominal()) || (j == getInputFormat().classIndex())) {
        newAtts.add((Attribute) att.copy());
      } else {
        if (j < getInputFormat().classIndex()) {
          newClassIndex += att.numValues() - 2;
        }

        // Compute values for new attributes

        for (int k = 1; k < att.numValues(); k++) {
          attributeName = new StringBuffer(att.name() + "=");
          for (int l = k; l < att.numValues(); l++) {
            if (l > k) {
              attributeName.append(',');
            }
            attributeName.append(att.value(m_Indices[j][l]));
          }
          if (m_Numeric) {
            Attribute a = new Attribute(attributeName.toString());
            if (getSpreadAttributeWeight()) {
              a.setWeight(att.weight() / (att.numValues() - 1));
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
              a.setWeight(att.weight() / (att.numValues() - 1));
            } else {
              a.setWeight(att.weight());
            }
            newAtts.add(a);
          }
        }
      }
    }
    outputFormat = new Instances(getInputFormat().relationName(), newAtts, 0);
=======
    newAtts = new FastVector();
    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if ((!att.isNominal()) || 
	  (j == getInputFormat().classIndex())) {
	newAtts.addElement(att.copy());
      } else {
	if (j < getInputFormat().classIndex())
	  newClassIndex += att.numValues() - 2;
	  
	// Compute values for new attributes
	  
	for (int k = 1; k < att.numValues(); k++) {
	  attributeName = 
	    new StringBuffer(att.name() + "=");
	  for (int l = k; l < att.numValues(); l++) {
	    if (l > k) {
	      attributeName.append(',');
	    }
	    attributeName.append(att.value(m_Indices[j][l]));
	  }
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
  private void convertInstanceNominal(Instance instance) {

    if (!m_needToTransform) {
      push(instance, false); // No need to copy instance
      return;
    }

    double[] vals = new double[outputFormatPeek().numAttributes()];
    int attSoFar = 0;

    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if ((!att.isNominal()) || (j == getInputFormat().classIndex())) {
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
   * Convert a single instance over if the class is nominal. The converted 
   * instance is added to the end of the output queue.
   *
   * @param instance the instance to convert
   */
  private void convertInstanceNominal(Instance instance) {
    
    if (!m_needToTransform) {
      push(instance);
      return;
    }

    double [] vals = new double [outputFormatPeek().numAttributes()];
    int attSoFar = 0;

    for(int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if ((!att.isNominal()) || (j == getInputFormat().classIndex())) {
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

    copyValues(inst, false, instance.dataset(), outputFormatPeek());

    push(inst); // No need to copy instance
  }

  /**
   * Convert a single instance over if the class is numeric. The converted
   * instance is added to the end of the output queue.
   * 
   * @param instance the instance to convert
   */
  private void convertInstanceNumeric(Instance instance) {

    if (!m_needToTransform) {
      push(instance, false); // No need to copy instance
      return;
    }

    double[] vals = new double[outputFormatPeek().numAttributes()];
    int attSoFar = 0;

    for (int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if ((!att.isNominal()) || (j == getInputFormat().classIndex())) {
        vals[attSoFar] = instance.value(j);
        attSoFar++;
      } else {
        if (instance.isMissing(j)) {
          for (int k = 0; k < att.numValues() - 1; k++) {
            vals[attSoFar + k] = instance.value(j);
          }
        } else {
          int k = 0;
          while ((int) instance.value(j) != m_Indices[j][k]) {
            vals[attSoFar + k] = 1;
            k++;
          }
          while (k < att.numValues() - 1) {
            vals[attSoFar + k] = 0;
            k++;
          }
        }
        attSoFar += att.numValues() - 1;
=======
      inst = new Instance(instance.weight(), vals);
    }
    inst.setDataset(getOutputFormat());
    copyValues(inst, false, instance.dataset(), getOutputFormat());
    inst.setDataset(getOutputFormat());
    push(inst);
  }

  /**
   * Convert a single instance over if the class is numeric. The converted 
   * instance is added to the end of the output queue.
   *
   * @param instance the instance to convert
   */
  private void convertInstanceNumeric(Instance instance) {
    
    if (!m_needToTransform) {
      push(instance);
      return;
    }

    double [] vals = new double [outputFormatPeek().numAttributes()];
    int attSoFar = 0;

    for(int j = 0; j < getInputFormat().numAttributes(); j++) {
      Attribute att = getInputFormat().attribute(j);
      if ((!att.isNominal()) || (j == getInputFormat().classIndex())) {
	vals[attSoFar] = instance.value(j);
	attSoFar++;
      } else {
	if (instance.isMissing(j)) {
	  for (int k = 0; k < att.numValues() - 1; k++) {
            vals[attSoFar + k] = instance.value(j);
	  }
	} else {
	  int k = 0;
	  while ((int)instance.value(j) != m_Indices[j][k]) {
            vals[attSoFar + k] = 1;
	    k++;
	  }
	  while (k < att.numValues() - 1) {
            vals[attSoFar + k] = 0;
	    k++;
	  }
	}
	attSoFar += att.numValues() - 1;
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

    copyValues(inst, false, instance.dataset(), outputFormatPeek());

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
    return RevisionUtils.extract("$Revision: 8094 $");
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
