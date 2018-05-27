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
 *    RemoveUseless.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
<<<<<<< HEAD
=======
=======
import weka.core.AttributeStats;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> This filter removes attributes that do not vary at
 * all or that vary too much. All constant attributes are deleted automatically,
 * along with any that exceed the maximum percentage of variance parameter. The
 * maximum variance test is only applied to nominal attributes.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -M &lt;max variance %&gt;
 *  Maximum variance percentage allowed (default 99). Specifically, if
 *  (number_of_distinct_values / total_number_of_values * 100)
 *  is greater than this value, then the attribute will be removed.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class RemoveUseless extends Filter implements UnsupervisedFilter,
  OptionHandler, WeightedInstancesHandler, WeightedAttributesHandler {

<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * This filter removes attributes that do not vary at all or that vary too much. All constant attributes are deleted automatically, along with any that exceed the maximum percentage of variance parameter. The maximum variance test is only applied to nominal attributes.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -M &lt;max variance %&gt;
 *  Maximum variance percentage allowed (default 99)</pre>
 * 
 <!-- options-end -->
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 7470 $
 */
public class RemoveUseless 
  extends Filter 
  implements UnsupervisedFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -8659417851407640038L;

  /** The filter used to remove attributes */
  protected Remove m_removeFilter = null;

  /** The type of attribute to delete */
  protected double m_maxVariancePercentage = 99.0;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
<<<<<<< HEAD
=======
=======
  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
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
    result.enable(Capability.STRING_ATTRIBUTES);
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
   * @throws Exception if the inputFormat can't be set successfully
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
   * @throws Exception if the inputFormat can't be set successfully 
   */ 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);
    m_removeFilter = null;
    return false;
  }

  /**
   * Input an instance for filtering.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
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
    if (m_removeFilter != null) {
      m_removeFilter.input(instance);
      Instance processed = m_removeFilter.output();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      copyValues(processed, false, instance.dataset(), outputFormatPeek());

      push(processed, false); // No need to copy
<<<<<<< HEAD
=======
=======
      processed.setDataset(getOutputFormat());
      copyValues(processed, false, instance.dataset(), getOutputFormat());
      push(processed);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return true;
    }
    bufferInput(instance);
    return false;
  }

  /**
   * Signify that this batch of input to the filter is finished.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return true if there are instances pending output
   * @throws Exception if no input format defined
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return true if there are instances pending output
   * @throws Exception if no input format defined
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean batchFinished() throws Exception {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_removeFilter == null) {

      // establish attributes to remove from first batch

      Instances toFilter = getInputFormat();
      int[] attsToDelete = new int[toFilter.numAttributes()];
      int numToDelete = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (int i = 0; i < toFilter.numAttributes(); i++) {
        if (i == toFilter.classIndex()) {
          continue; // skip class
        }
        AttributeStats stats = toFilter.attributeStats(i);
        if (stats.missingCount == toFilter.numInstances()) {
          attsToDelete[numToDelete++] = i;
        } else if (stats.distinctCount < 2) {
          // remove constant attributes
          attsToDelete[numToDelete++] = i;
        } else if (toFilter.attribute(i).isNominal()) {
          // remove nominal attributes that vary too much
          double variancePercent = (double) stats.distinctCount
            / (double) (stats.totalCount - stats.missingCount) * 100.0;
          if (variancePercent > m_maxVariancePercentage) {
            attsToDelete[numToDelete++] = i;
          }
        }
      }

      int[] finalAttsToDelete = new int[numToDelete];
      System.arraycopy(attsToDelete, 0, finalAttsToDelete, 0, numToDelete);

<<<<<<< HEAD
=======
=======
      for(int i = 0; i < toFilter.numAttributes(); i++) {
	if (i==toFilter.classIndex()) continue; // skip class
	AttributeStats stats = toFilter.attributeStats(i);
	if (stats.missingCount == toFilter.numInstances()) {
          attsToDelete[numToDelete++] = i;
        } else if (stats.distinctCount < 2) {
	  // remove constant attributes
	  attsToDelete[numToDelete++] = i;
	} else if (toFilter.attribute(i).isNominal()) {
	  // remove nominal attributes that vary too much
	  double variancePercent = (double) stats.distinctCount
	    / (double)(stats.totalCount - stats.missingCount) * 100.0;
	  if (variancePercent > m_maxVariancePercentage) {
	      attsToDelete[numToDelete++] = i;
	  }
	}
      }
      
      int[] finalAttsToDelete = new int[numToDelete];
      System.arraycopy(attsToDelete, 0, finalAttsToDelete, 0, numToDelete);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_removeFilter = new Remove();
      m_removeFilter.setAttributeIndicesArray(finalAttsToDelete);
      m_removeFilter.setInvertSelection(false);
      m_removeFilter.setInputFormat(toFilter);
<<<<<<< HEAD

      for (int i = 0; i < toFilter.numInstances(); i++) {
        m_removeFilter.input(toFilter.instance(i));
=======
<<<<<<< HEAD

      for (int i = 0; i < toFilter.numInstances(); i++) {
        m_removeFilter.input(toFilter.instance(i));
=======
      
      for (int i = 0; i < toFilter.numInstances(); i++) {
	m_removeFilter.input(toFilter.instance(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_removeFilter.batchFinished();

      Instance processed;
      Instances outputDataset = m_removeFilter.getOutputFormat();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // restore old relation name to hide attribute filter stamp
      outputDataset.setRelationName(toFilter.relationName());

      setOutputFormat(outputDataset);
      while ((processed = m_removeFilter.output()) != null) {
        processed.setDataset(outputDataset);
        push(processed, false); // No need to copy
      }
    }
    flushInput();

<<<<<<< HEAD
=======
=======
    
      // restore old relation name to hide attribute filter stamp
      outputDataset.setRelationName(toFilter.relationName());
    
      setOutputFormat(outputDataset);
      while ((processed = m_removeFilter.output()) != null) {
	processed.setDataset(outputDataset);
	push(processed);
      }
    }
    flushInput();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_NewBatch = true;
    return (numPendingOutput() != 0);
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

    Vector<Option> newVector = new Vector<Option>(1);

    newVector.addElement(new Option(
      "\tMaximum variance percentage allowed (default 99). Specifically, if"
                + "\t(number_of_distinct_values / total_number_of_values * 100)"
                + "\tis greater than this value, then the attribute will be removed.", "M", 1,
      "-M <max variance %>"));
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(1);

    newVector.addElement(new Option(
				    "\tMaximum variance percentage allowed (default 99)",
				    "M", 1, "-M <max variance %>"));

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return newVector.elements();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -M &lt;max variance %&gt;
   *  Maximum variance percentage allowed (default 99). Specifically, if
   *  (number_of_distinct_values / total_number_of_values * 100)
   *  is greater than this value, then the attribute will be removed.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    String mString = Utils.getOption('M', options);
    if (mString.length() != 0) {
      setMaximumVariancePercentageAllowed((int) Double.valueOf(mString)
        .doubleValue());
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -M &lt;max variance %&gt;
   *  Maximum variance percentage allowed (default 99)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    
    String mString = Utils.getOption('M', options);
    if (mString.length() != 0) {
      setMaximumVariancePercentageAllowed((int) Double.valueOf(mString).doubleValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      setMaximumVariancePercentageAllowed(99.0);
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

    options.add("-M");
    options.add("" + getMaximumVariancePercentageAllowed());

    return options.toArray(new String[0]);
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [2];
    int current = 0;

    options[current++] = "-M";
    options[current++] = "" + getMaximumVariancePercentageAllowed();
    
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns a string describing this filter
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "This filter removes attributes that do not vary at all or that vary "
<<<<<<< HEAD
=======
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "This filter removes attributes that do not vary at all or that vary "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "too much. All constant attributes are deleted automatically, along "
      + "with any that exceed the maximum percentage of variance parameter. "
      + "The maximum variance test is only applied to nominal attributes.";
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
  public String maximumVariancePercentageAllowedTipText() {

    return "Set the threshold for the highest variance allowed before a nominal attribute will be deleted. "
      + "Specifically, if (number_of_distinct_values / total_number_of_values * 100)"
      + " is greater than this value, then the attribute will be removed.";
<<<<<<< HEAD
=======
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String maximumVariancePercentageAllowedTipText() {

    return "Set the threshold for the highest variance allowed before a nominal attribute will be deleted."
      + "Specifically, if (number_of_distinct_values / total_number_of_values * 100)"
      + " is greater than this value then the attribute will be removed.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the maximum variance attributes are allowed to have before they are
   * deleted by the filter.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param maxVariance the maximum variance allowed, specified as a percentage
   */
  public void setMaximumVariancePercentageAllowed(double maxVariance) {

<<<<<<< HEAD
=======
=======
   *
   * @param maxVariance the maximum variance allowed, specified as a percentage
   */
  public void setMaximumVariancePercentageAllowed(double maxVariance) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_maxVariancePercentage = maxVariance;
  }

  /**
   * Gets the maximum variance attributes are allowed to have before they are
   * deleted by the filter.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the maximum variance allowed, specified as a percentage
   */
  public double getMaximumVariancePercentageAllowed() {

    return m_maxVariancePercentage;
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
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7470 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
<<<<<<< HEAD
=======
=======
   *
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    runFilter(new RemoveUseless(), argv);
  }
}
