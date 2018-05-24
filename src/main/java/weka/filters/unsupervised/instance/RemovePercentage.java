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
 *    RemovePercentage.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters.unsupervised.instance;

import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.filters.unsupervised.instance;

import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> A filter that removes a given percentage of a
 * dataset.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -P &lt;percentage&gt;
 *  Specifies percentage of instances to select. (default 50)
 * </pre>
 * 
 * <pre>
 * -V
 *  Specifies if inverse of selection is to be output.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (eibe@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class RemovePercentage extends Filter implements UnsupervisedFilter,
  OptionHandler, WeightedAttributesHandler {

  /** for serialization */
  static final long serialVersionUID = 2150341191158533133L;

=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * A filter that removes a given percentage of a dataset.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -P &lt;percentage&gt;
 *  Specifies percentage of instances to select. (default 50)
 * </pre>
 * 
 * <pre> -V
 *  Specifies if inverse of selection is to be output.
 * </pre>
 * 
 <!-- options-end -->
 *
 * @author Richard Kirkby (eibe@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 5548 $ 
*/
public class RemovePercentage 
  extends Filter
  implements UnsupervisedFilter, OptionHandler {

  /** for serialization */
  static final long serialVersionUID = 2150341191158533133L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Percentage of instances to select. */
  private double m_Percentage = 50;

  /** Indicates if inverse of selection is to be output. */
  private boolean m_Inverse = false;

  /**
   * Gets an enumeration describing the available options..
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(2);

    newVector.addElement(new Option(
      "\tSpecifies percentage of instances to select. (default 50)\n", "P", 1,
      "-P <percentage>"));

    newVector.addElement(new Option(
      "\tSpecifies if inverse of selection is to be output.\n", "V", 0, "-V"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(2);

    newVector.addElement(new Option(
              "\tSpecifies percentage of instances to select. (default 50)\n",
              "P", 1, "-P <percentage>"));

    newVector.addElement(new Option(
	      "\tSpecifies if inverse of selection is to be output.\n",
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
   * -P &lt;percentage&gt;
   *  Specifies percentage of instances to select. (default 50)
   * </pre>
   * 
   * <pre>
   * -V
   *  Specifies if inverse of selection is to be output.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -P &lt;percentage&gt;
   *  Specifies percentage of instances to select. (default 50)
   * </pre>
   * 
   * <pre> -V
   *  Specifies if inverse of selection is to be output.
   * </pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {

    String percent = Utils.getOption('P', options);
    if (percent.length() != 0) {
      setPercentage(Double.parseDouble(percent));
    } else {
      setPercentage(50.0);
    }
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

    options.add("-P");
    options.add("" + getPercentage());
    if (getInvertSelection()) {
      options.add("-V");
    }

    return options.toArray(new String[0]);
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [5];
    int current = 0;

    options[current++] = "-P"; options[current++] = "" + getPercentage();
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

    return "A filter that removes a given percentage of a dataset.";
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
  public String percentageTipText() {

    return "The percentage of the data to select.";
  }

  /**
   * Gets the percentage of instances to select.
   * 
   * @return the percentage.
   */
  public double getPercentage() {

    return m_Percentage;
  }

  /**
   * Sets the percentage of intances to select.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param percent the percentage
   * @throws IllegalArgumentException if percentage out of range
   */
  public void setPercentage(double percent) {

    if (percent < 0 || percent > 100) {
<<<<<<< HEAD
      throw new IllegalArgumentException(
        "Percentage must be between 0 and 100.");
=======
      throw new IllegalArgumentException("Percentage must be between 0 and 100.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    m_Percentage = percent;
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

    return "Whether to invert the selection.";
  }

  /**
   * Gets if selection is to be inverted.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if the selection is to be inverted
   */
  public boolean getInvertSelection() {

    return m_Inverse;
  }

  /**
   * Sets if selection is to be inverted.
<<<<<<< HEAD
   * 
   * @param inverse true if inversion is to be performed
   */
  public void setInvertSelection(boolean inverse) {

    m_Inverse = inverse;
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
   *
   * @param inverse true if inversion is to be performed
   */
  public void setInvertSelection(boolean inverse) {
    
    m_Inverse = inverse;
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
   * @return true because outputFormat can be collected immediately
   * @throws Exception if the input format can't be set successfully
   */
  @Override
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true because outputFormat can be collected immediately
   * @throws Exception if the input format can't be set successfully
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);
    setOutputFormat(instanceInfo);
    return true;
  }
<<<<<<< HEAD

  /**
   * Input an instance for filtering. Ordinarily the instance is processed and
   * made available for output immediately. Some filters require all instances
   * be read before producing output.
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

    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }

    if (isFirstBatchDone()) {
      push(instance);
      return true;
    } else {
      bufferInput(instance);
      return false;
    }
  }

  /**
   * Signify that this batch of input to the filter is finished. Output() may
   * now be called to retrieve the filtered instances.
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
=======
  
  /**
   * Input an instance for filtering. Ordinarily the instance is processed
   * and made available for output immediately. Some filters require all
   * instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been set.
   */
  public boolean input(Instance instance) {
     if (getInputFormat() == null) {
        throw new IllegalStateException("No input instance format defined");
     }
     
     if (m_NewBatch) {
        resetQueue();
        m_NewBatch = false;
     }

     if (isFirstBatchDone()) {
       push(instance);
       return true;
     } 
     else {
       bufferInput(instance);
       return false;
     }
  }

  /**
   * Signify that this batch of input to the filter is
   * finished. Output() may now be called to retrieve the filtered
   * instances.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined 
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean batchFinished() {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }

    // Push instances for output into output queue
    Instances toFilter = getInputFormat();
    int cutOff = (int) Math.round(toFilter.numInstances() * m_Percentage / 100);
<<<<<<< HEAD

    if (m_Inverse) {
      for (int i = 0; i < cutOff; i++) {
        push(toFilter.instance(i), false); // No need to copy
      }
    } else {
      for (int i = cutOff; i < toFilter.numInstances(); i++) {
        push(toFilter.instance(i), false); // No need to copy
      }
    }
    flushInput();

    m_NewBatch = true;
    m_FirstBatchDone = true;

    return (numPendingOutput() != 0);
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
    
    if (m_Inverse) {
      for (int i = 0; i < cutOff; i++) {
	push(toFilter.instance(i));
      }
    } else {
      for (int i = cutOff; i < toFilter.numInstances(); i++) {
	push(toFilter.instance(i));
      }
    }
    flushInput();
    
    m_NewBatch = true;
    m_FirstBatchDone = true;
    
    return (numPendingOutput() != 0);
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5548 $");
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
    runFilter(new RemovePercentage(), argv);
  }
}
