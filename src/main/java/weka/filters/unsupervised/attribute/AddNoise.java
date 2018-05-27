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
 *    AddNoise.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;
import weka.gui.ProgrammaticProperty;

/**
 * <!-- globalinfo-start --> An instance filter that changes a percentage of a
 * given attribute's values. The attribute must be nominal. Missing value can be
 * treated as a distinct separate value.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -C &lt;col&gt;
 *  Index of the attribute to be changed 
 *  (default last attribute)
 * </pre>
 * 
 * <pre>
 * -M
 *  Treat missing values as an extra value
 * </pre>
 * 
 * <pre>
 * -P &lt;num&gt;
 *  Specify the percentage of values that are changed (default 10)
 * </pre>
 * 
 * <pre>
 * -S &lt;num&gt;
 *  Specify the random number seed (default 1)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class AddNoise extends Filter implements UnsupervisedFilter,
  OptionHandler, Randomizable, WeightedAttributesHandler {

<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SingleIndex;
import weka.core.Utils;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * An instance filter that changes a percentage of a given attributes values. The attribute must be nominal. Missing value can be treated as value itself.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -C &lt;col&gt;
 *  Index of the attribute to be changed 
 *  (default last attribute)</pre>
 * 
 * <pre> -M
 *  Treat missing values as an extra value 
 * </pre>
 * 
 * <pre> -P &lt;num&gt;
 *  Specify the percentage of noise introduced 
 *  to the data (default 10)</pre>
 * 
 * <pre> -S &lt;num&gt;
 *  Specify the random number seed (default 1)</pre>
 * 
 <!-- options-end -->
 *
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 5543 $ 
 */
public class AddNoise 
  extends Filter 
  implements UnsupervisedFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -8499673222857299082L;

  /** The attribute's index setting. */
<<<<<<< HEAD
  private final SingleIndex m_AttIndex = new SingleIndex("last");
=======
<<<<<<< HEAD
  private final SingleIndex m_AttIndex = new SingleIndex("last");
=======
  private SingleIndex m_AttIndex = new SingleIndex("last"); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Flag if missing values are taken as value. */
  private boolean m_UseMissing = false;

  /** The subsample size, percent of original set, default 10% */
  private int m_Percent = 10;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The random number generator seed */
  private int m_RandomSeed = 1;

  /**
   * Returns a string describing this filter
<<<<<<< HEAD
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String globalInfo() {

    return "An instance filter that changes a percentage of a given"
<<<<<<< HEAD
      + " attribute's values. The attribute must be nominal."
      + " Missing value can be treated as as a distinct separate value.";
=======
<<<<<<< HEAD
      + " attribute's values. The attribute must be nominal."
      + " Missing value can be treated as as a distinct separate value.";
=======
           + " attributes values. The attribute must be nominal."
           + " Missing value can be treated as value itself.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns an enumeration describing the available options
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of all the available options
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(4);

    newVector.addElement(new Option("\tIndex of the attribute to be changed \n"
      + "\t(default last attribute)", "C", 1, "-C <col>"));
    newVector.addElement(new Option(
      "\tTreat missing values as an extra value \n", "M", 1, "-M"));
    newVector.addElement(new Option(
      "\tSpecify the percentage of values that are changed (default 10)", "P", 1, "-P <num>"));
    newVector.addElement(new Option(
      "\tSpecify the random number seed (default 1)", "S", 1, "-S <num>"));
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(4);

    newVector.addElement(new Option(
              "\tIndex of the attribute to be changed \n"
              +"\t(default last attribute)",
              "C", 1, "-C <col>"));
    newVector.addElement(new Option(
              "\tTreat missing values as an extra value \n",
              "M", 1, "-M"));
    newVector.addElement(new Option(
              "\tSpecify the percentage of noise introduced \n"
              +"\tto the data (default 10)",
              "P", 1, "-P <num>"));
    newVector.addElement(new Option(
              "\tSpecify the random number seed (default 1)",
              "S", 1, "-S <num>"));
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
   * -C &lt;col&gt;
   *  Index of the attribute to be changed 
   *  (default last attribute)
   * </pre>
   * 
   * <pre>
   * -M
   *  Treat missing values as an extra value
   * </pre>
   * 
   * <pre>
   * -P &lt;num&gt;
   *  Specify the percentage of values that are changed (default 10)
   * </pre>
   * 
   * <pre>
   * -S &lt;num&gt;
   *  Specify the random number seed (default 1)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -C &lt;col&gt;
   *  Index of the attribute to be changed 
   *  (default last attribute)</pre>
   * 
   * <pre> -M
   *  Treat missing values as an extra value 
   * </pre>
   * 
   * <pre> -P &lt;num&gt;
   *  Specify the percentage of noise introduced 
   *  to the data (default 10)</pre>
   * 
   * <pre> -S &lt;num&gt;
   *  Specify the random number seed (default 1)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setOptions(String[] options) throws Exception {

    String indexString = Utils.getOption('C', options);
    if (indexString.length() != 0) {
      setAttributeIndex(indexString);
    } else {
      setAttributeIndex("last");
    }

    if (Utils.getFlag('M', options)) {
      setUseMissing(true);
    }

    String percentString = Utils.getOption('P', options);
    if (percentString.length() != 0) {
      setPercent((int) Double.valueOf(percentString).doubleValue());
    } else {
      setPercent(10);
    }

    String seedString = Utils.getOption('S', options);
    if (seedString.length() != 0) {
      setRandomSeed(Integer.parseInt(seedString));
    } else {
      setRandomSeed(1);
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

    options.add("-C");
    options.add("" + getAttributeIndex());

    if (getUseMissing()) {
      options.add("-M");
    }

    options.add("-P");
    options.add("" + getPercent());

    options.add("-S");
    options.add("" + getRandomSeed());

    return options.toArray(new String[0]);
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String useMissingTipText() {

    return "Flag to set if missing values are treated as separate values.";
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [7];
    int current = 0;

    options[current++] = "-C"; options[current++] = "" + getAttributeIndex();

    if (getUseMissing()) {
      options[current++] = "-M";
    }

    options[current++] = "-P"; options[current++] = "" + getPercent();

    options[current++] = "-S"; options[current++] = "" + getRandomSeed();

    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }
    
  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String useMissingTipText() {

    return "Flag to set if missing values are used.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the flag if missing values are treated as extra values.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the flag missing values.
   */
  public boolean getUseMissing() {

    return m_UseMissing;
  }

  /**
   * Sets the flag if missing values are treated as extra values.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newUseMissing the new flag value.
   */
  public void setUseMissing(boolean newUseMissing) {

    m_UseMissing = newUseMissing;
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
  public String randomSeedTipText() {

    return "Random number seed.";
  }

  /**
   * Gets the random number seed.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the random number seed.
   */
  public int getRandomSeed() {

    return m_RandomSeed;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the random number seed.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Sets the random number seed.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newSeed the new random number seed.
   */
  public void setRandomSeed(int newSeed) {

    m_RandomSeed = newSeed;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  @ProgrammaticProperty
  public void setSeed(int seed) {
    setRandomSeed(seed);
  }

  @ProgrammaticProperty
  public int getSeed() {
    return getRandomSeed();
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String percentTipText() {

    return "Percentage of values that are changed.";
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String percentTipText() {

    return "Percentage of introduced noise to data.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the size of noise data as a percentage of the original set.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the noise data size
   */
  public int getPercent() {

    return m_Percent;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the size of noise data, as a percentage of the original set.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Sets the size of noise data, as a percentage of the original set.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newPercent the subsample set size, between 0 and 100.
   */
  public void setPercent(int newPercent) {

    m_Percent = newPercent;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String attributeIndexTipText() {

    return "Index of the attribute that is to changed.";
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

    m_AttIndex.setSingleIndex(attIndex);
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
   *
   * @param attIndex the index of the attribute
   */
  public void setAttributeIndex(String attIndex) {
    
    m_AttIndex.setSingleIndex(attIndex);
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
   * @throws Exception if the input format can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);
    // set input format
    // m_InputFormat = new Instances(instanceInfo, 0);
    m_AttIndex.setUpper(getInputFormat().numAttributes() - 1);
    // set index of attribute to be changed

    // test if nominal
    if (!getInputFormat().attribute(m_AttIndex.getIndex()).isNominal()) {
      throw new Exception("Adding noise is not possible:"
        + "Chosen attribute is numeric.");
    }

    // test if two values are given
    if ((getInputFormat().attribute(m_AttIndex.getIndex()).numValues() < 2)
      && (!m_UseMissing)) {
      throw new Exception("Adding noise is not possible:"
        + "Chosen attribute has less than two values.");
    }

    setOutputFormat(getInputFormat());
    m_NewBatch = true;
<<<<<<< HEAD
=======
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
    // set input format
    //m_InputFormat = new Instances(instanceInfo, 0);
    m_AttIndex.setUpper(getInputFormat().numAttributes() - 1);
    // set index of attribute to be changed

    // test if nominal 
    if (!getInputFormat().attribute(m_AttIndex.getIndex()).isNominal()) {
      throw new Exception("Adding noise is not possible:"
                          + "Chosen attribute is numeric.");
      }

    // test if two values are given
    if ((getInputFormat().attribute(m_AttIndex.getIndex()).numValues() < 2)
        && (!m_UseMissing)) {
      throw new Exception("Adding noise is not possible:"
                          + "Chosen attribute has less than two values.");
    }
 
    setOutputFormat(getInputFormat());
    m_NewBatch = true; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return false;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Input an instance for filtering.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws Exception if the input format was not set
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Input an instance for filtering. 
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws Exception if the input format was not set
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean input(Instance instance) throws Exception {

    // check if input format is defined
    if (getInputFormat() == null) {
      throw new Exception("No input instance format defined");
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Signify that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances.
   * 
   * @return true if there are instances pending output
   * @throws Exception if no input structure has been defined
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Signify that this batch of input to the filter is finished. 
   * If the filter requires all instances prior to filtering,
   * output() may now be called to retrieve the filtered instances.
   *
   * @return true if there are instances pending output
   * @throws Exception if no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean batchFinished() throws Exception {

    if (getInputFormat() == null) {
      throw new Exception("No input instance format defined");
    }

    // Do the subsample, and clear the input instances.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    addNoise(getInputFormat(), m_RandomSeed, m_Percent, m_AttIndex.getIndex(),
      m_UseMissing);

    for (int i = 0; i < getInputFormat().numInstances(); i++) {
      push((Instance) getInputFormat().instance(i).copy(), false); // No need to copy instance
<<<<<<< HEAD
=======
=======
    addNoise (getInputFormat(), m_RandomSeed, m_Percent, m_AttIndex.getIndex(), 
              m_UseMissing);

    for(int i=0; i<getInputFormat().numInstances(); i++) {
      push ((Instance)getInputFormat().instance(i).copy());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    flushInput();

    m_NewBatch = true;
    m_FirstBatchDone = true;
    return (numPendingOutput() != 0);
  }

  /**
   * add noise to the dataset
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * a given percentage of the instances are changed in the way that a set of
   * instances are randomly selected using seed. The attribute given by its
   * index is changed from its current value to one of the other possibly ones,
   * also randomly. This is done while leaving the proportion the same. If
   * m_UseMissing is true, missing value is used as a value of its own
   * 
<<<<<<< HEAD
=======
=======
   * a given percentage of the instances are changed in the  way, that 
   * a set of instances are randomly selected using seed. The attribute 
   * given by its index is changed from its current value to one of the
   * other possibly ones, also randomly. This is done with leaving the
   * apportion the same.  
   * if m_UseMissing is true, missing value is  used as a value of its own
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param instances is the dataset
   * @param seed used for random function
   * @param percent percentage of instances that are changed
   * @param attIndex index of the attribute changed
   * @param useMissing if true missing values are treated as extra value
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void addNoise(Instances instances, int seed, int percent,
    int attIndex, boolean useMissing) {
    int indexList[];
    int partition_count[];
    int partition_max[];
    double splitPercent = percent; // percentage used for splits

    // fill array with the indexes
    indexList = new int[instances.numInstances()];
    for (int i = 0; i < instances.numInstances(); i++) {
      indexList[i] = i;
    }

    // randomize list of indexes
    Random random = new Random(seed);
    for (int i = instances.numInstances() - 1; i >= 0; i--) {
      int hValue = indexList[i];
      int hIndex = (int) (random.nextDouble() * i);
      indexList[i] = indexList[hIndex];
      indexList[hIndex] = hValue;
    }

    // initialize arrays that are used to count instances
    // of each value and to keep the amount of instances of that value
<<<<<<< HEAD
=======
=======
  public void addNoise (Instances instances, 
                         int seed, 
                         int percent,
                         int attIndex,
                         boolean useMissing) {
    int indexList [];
    int partition_count [];
    int partition_max [];
    double splitPercent = (double) percent; // percentage used for splits

    // fill array with the indexes
    indexList = new int [instances.numInstances()];
    for (int i=0; i<instances.numInstances(); i++) {
      indexList[i] = i;
      }

    // randomize list of indexes
    Random random = new Random(seed);
    for (int i=instances.numInstances()-1; i>=0; i--) {
      int hValue = indexList[i];
      int hIndex = (int)(random.nextDouble()*(double) i);
      indexList[i] = indexList[hIndex];
      indexList[hIndex] = hValue;
      }
 
    // initialize arrays that are used to count instances
    // of each value and to keep the amount of instances of that value 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // that has to be changed
    // this is done for the missing values in the two variables
    // missing_count and missing_max
    int numValues = instances.attribute(attIndex).numValues();

    partition_count = new int[numValues];
    partition_max = new int[numValues];
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int missing_count = 0;

    int missing_max = 0;

<<<<<<< HEAD
=======
=======
    int missing_count = 0;;
    int missing_max = 0;;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    for (int i = 0; i < numValues; i++) {
      partition_count[i] = 0;
      partition_max[i] = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // go through the dataset and count all occurrences of values
    // and all missing values using temporarily .._max arrays and
    // variable missing_max
    for (Object element : instances) {
      Instance instance = (Instance) element;
      if (instance.isMissing(attIndex)) {
        missing_max++;
      } else {
        instance.value(attIndex);
        partition_max[(int) instance.value(attIndex)]++;
      }
    }

    // use given percentage to calculate
<<<<<<< HEAD
=======
=======
      }

    // go through the dataset and count all occurrences of values 
    // and all missing values using temporarily .._max arrays and
    // variable missing_max
    for (Enumeration e = instances.enumerateInstances();
         e.hasMoreElements();) {
      Instance instance = (Instance) e.nextElement(); 
      if (instance.isMissing(attIndex)) {
        missing_max++;
      }
      else {
        int j = (int) instance.value(attIndex);
        partition_max[(int) instance.value(attIndex)]++; 
      }
    }
      
    // use given percentage to calculate 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // how many have to be changed per split and
    // how many of the missing values
    if (!useMissing) {
      missing_max = missing_count;
    } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      missing_max = (int) (((double) missing_max / 100) * splitPercent + 0.5);
    }
    int sum_max = missing_max;
    for (int i = 0; i < numValues; i++) {
      partition_max[i] = (int) (((double) partition_max[i] / 100)
        * splitPercent + 0.5);
      sum_max = sum_max + partition_max[i];
    }

    // initialize sum_count to zero, use this variable to see if
    // everything is done already
    int sum_count = 0;

    // add noise
    // using the randomized index-array
    //
    Random randomValue = new Random(seed);
    int numOfValues = instances.attribute(attIndex).numValues();
    for (int i = 0; i < instances.numInstances(); i++) {
      if (sum_count >= sum_max) {
        break;
      } // finished
      Instance currInstance = instances.instance(indexList[i]);
      // if value is missing then...
      if (currInstance.isMissing(attIndex)) {
        if (missing_count < missing_max) {
          changeValueRandomly(randomValue, numOfValues, attIndex, currInstance,
            useMissing);
          missing_count++;
          sum_count++;
        }

      } else {
        int vIndex = (int) currInstance.value(attIndex);
        if (partition_count[vIndex] < partition_max[vIndex]) {
          changeValueRandomly(randomValue, numOfValues, attIndex, currInstance,
            useMissing);
          partition_count[vIndex]++;
          sum_count++;
        }
      }
<<<<<<< HEAD
=======
=======
      missing_max = (int) (((double)missing_max/100) * splitPercent + 0.5);
    }
    int sum_max = missing_max;
    for (int i=0; i<numValues; i++) {
      partition_max[i]=(int) (((double)partition_max[i]/100) * splitPercent 
                              + 0.5);
      sum_max = sum_max + partition_max[i];
      }

    // initialize sum_count to zero, use this variable to see if 
    // everything is done already
    int sum_count = 0;
  
    // add noise
    // using the randomized index-array
    // 
    Random randomValue = new Random (seed);
    int numOfValues = instances.attribute(attIndex).numValues();
    for(int i=0; i<instances.numInstances(); i++) {
       if (sum_count >= sum_max) { break; } // finished
       Instance currInstance = instances.instance(indexList[i]);
       // if value is missing then...
       if (currInstance.isMissing(attIndex)) {
         if (missing_count < missing_max) {
           changeValueRandomly (randomValue, 
                                numOfValues,
                                attIndex, 
                                currInstance,
                                useMissing); 
           missing_count++;
           sum_count++;
         }
         
       } else {
         int vIndex = (int) currInstance.value(attIndex);
         if (partition_count[vIndex] < partition_max[vIndex]) {
           changeValueRandomly (randomValue,
                                numOfValues,
                                attIndex,     
                                currInstance, 
                                useMissing);           
           partition_count[vIndex]++;
           sum_count++;
         }
       }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

  }

  /**
   * method to set a new value
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param r random function
   * @param numOfValues
   * @param instance
   * @param useMissing
   */
  private void changeValueRandomly(Random r, int numOfValues, int indexOfAtt,
    Instance instance, boolean useMissing) {
    int currValue;

    // get current value
    // if value is missing set current value to number of values
    // whiche is the highest possible value plus one
<<<<<<< HEAD
=======
=======
   *
   * @param r random function
   * @param numOfValues 
   * @param instance
   * @param useMissing
   */
  private void changeValueRandomly(Random r, int numOfValues,
                                   int indexOfAtt, 
                                   Instance instance, 
                                   boolean useMissing) {
    int currValue;

    // get current value 
    // if value is missing set current value to number of values
    // whiche is the highest possible value plus one 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (instance.isMissing(indexOfAtt)) {
      currValue = numOfValues;
    } else {
      currValue = (int) instance.value(indexOfAtt);
    }

    // with only two possible values it is easier
    if ((numOfValues == 2) && (!instance.isMissing(indexOfAtt))) {
<<<<<<< HEAD
      instance.setValue(indexOfAtt, (currValue + 1) % 2);
=======
<<<<<<< HEAD
      instance.setValue(indexOfAtt, (currValue + 1) % 2);
=======
	instance.setValue(indexOfAtt, (double) ((currValue+1)% 2));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      // get randomly a new value not equal to the current value
      // if missing values are used as values they must be treated
      // in a special way
      while (true) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        int newValue;
        if (useMissing) {
          newValue = (int) (r.nextDouble() * (numOfValues + 1));
        } else {
          newValue = (int) (r.nextDouble() * numOfValues);
        }
        // have we found a new value?
        if (newValue != currValue) {
          // the value 1 above the highest possible value (=numOfValues)
          // is used as missing value
          if (newValue == numOfValues) {
            instance.setMissing(indexOfAtt);
          } else {
            instance.setValue(indexOfAtt, newValue);
          }
<<<<<<< HEAD
=======
=======
	  int newValue;
        if (useMissing) {
          newValue = (int) (r.nextDouble() * (double) (numOfValues + 1));
        } else {
          newValue = (int) (r.nextDouble() * (double) numOfValues);
        }
        // have we found a new value?
        if (newValue != currValue) { 
          // the value 1 above the highest possible value (=numOfValues)
          // is used as missing value
          if (newValue == numOfValues) { instance.setMissing(indexOfAtt); }
          else { instance.setValue(indexOfAtt, (double) newValue); }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          break;
        }
      }
    }
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
    return RevisionUtils.extract("$Revision: 5543 $");
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
   * @param argv should contain arguments to the filter: 
   * use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    runFilter(new AddNoise(), argv);
  }
}
