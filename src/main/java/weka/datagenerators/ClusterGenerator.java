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
 * ClusterGenerator.java
<<<<<<< HEAD
 * Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.datagenerators;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Option;
import weka.core.Range;
import weka.core.Utils;

/**
 * Abstract class for cluster data generators.
 * <p/>
 * 
 * Example usage as the main of a datagenerator called RandomGenerator:
 * 
<<<<<<< HEAD
=======
=======
import weka.core.Option;
import weka.core.Range;
import weka.core.Utils;
import weka.datagenerators.DataGenerator;

import java.util.Enumeration;
import java.util.Vector;

/** 
 * Abstract class for cluster data generators. <p/>
 *
 * Example usage as the main of a datagenerator called RandomGenerator:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <pre>
 * public static void main(String[] args) {
 *   try {
 *     DataGenerator.makeData(new RandomGenerator(), args);
<<<<<<< HEAD
 *   } catch (Exception e) {
=======
<<<<<<< HEAD
 *   } catch (Exception e) {
=======
 *   } 
 *   catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *     e.printStackTrace();
 *     System.err.println(e.getMessage());
 *   }
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 12478 $
 */
public abstract class ClusterGenerator extends DataGenerator {
<<<<<<< HEAD
=======
=======
 *
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.6 $
 */
public abstract class ClusterGenerator 
  extends DataGenerator {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 6131722618472046365L;

  /** Number of attribute the dataset should have */
  protected int m_NumAttributes;

<<<<<<< HEAD
  /** class flag */
=======
<<<<<<< HEAD
  /** class flag */
=======
  /** class flag  */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected boolean m_ClassFlag = false;

  /** Stores which columns are boolean (default numeric) */
  protected Range m_booleanCols;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Stores which columns are nominal (default numeric) */
  protected Range m_nominalCols;

  /**
   * initializes the generator
<<<<<<< HEAD
=======
=======
  /** Stores which columns are nominal (default numeric)  */
  protected Range m_nominalCols;

  /**
   * initializes the generator 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public ClusterGenerator() {
    super();

    setNumAttributes(defaultNumAttributes());
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = enumToVector(super.listOptions());

    result.addElement(new Option("\tThe number of attributes (default "
      + defaultNumAttributes() + ").", "a", 1, "-a <num>"));

    result.addElement(new Option(
      "\tClass Flag, if set, the cluster is listed in extra attribute.", "c",
      0, "-c"));

    result.addElement(new Option("\tThe indices for boolean attributes.", "b",
      1, "-b <range>"));

    result.addElement(new Option("\tThe indices for nominal attributes.", "m",
      1, "-m <range>"));

<<<<<<< HEAD
=======
=======
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = enumToVector(super.listOptions());

    result.addElement(new Option(
          "\tThe number of attributes (default " 
          + defaultNumAttributes() + ").",
          "a", 1, "-a <num>"));

    result.addElement(new Option(
        "\tClass Flag, if set, the cluster is listed in extra attribute.",
        "c", 0, "-c"));
    
    result.addElement(new Option(
        "\tThe indices for boolean attributes.",
        "b", 1, "-b <range>"));
    
    result.addElement(new Option(
        "\tThe indices for nominal attributes.",
        "m", 1, "-m <range>"));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result.elements();
  }

  /**
   * Sets the options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param options the options
   * @throws Exception if invalid option
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    super.setOptions(options);

    tmpStr = Utils.getOption('a', options);
    if (tmpStr.length() != 0) {
      setNumAttributes(Integer.parseInt(tmpStr));
    } else {
      setNumAttributes(defaultNumAttributes());
    }
<<<<<<< HEAD
=======
=======
   *
   * @param options the options 
   * @throws Exception if invalid option
   */
  public void setOptions(String[] options) throws Exception { 
    String        tmpStr;
   
    super.setOptions(options);

    tmpStr = Utils.getOption('a', options);
    if (tmpStr.length() != 0)
      setNumAttributes(Integer.parseInt(tmpStr));
    else
      setNumAttributes(defaultNumAttributes());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setClassFlag(Utils.getFlag('c', options));

    tmpStr = Utils.getOption('b', options);
    setBooleanIndices(tmpStr);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_booleanCols.setUpper(getNumAttributes() - 1);

    tmpStr = Utils.getOption('m', options);
    setNominalIndices(tmpStr);
    m_nominalCols.setUpper(getNumAttributes() - 1);

    // check indices
    tmpStr = checkIndices();
    if (tmpStr.length() > 0) {
      throw new IllegalArgumentException(tmpStr);
    }
  }

  /**
   * Gets the current settings of the classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();

    Collections.addAll(result, super.getOptions());

    result.add("-a");
    result.add("" + getNumAttributes());

    if (getClassFlag()) {
      result.add("-c");
    }

    if (!getBooleanCols().toString().equalsIgnoreCase("empty")) {
      result.add("-b");
      result.add("" + getBooleanCols().getRanges());
    }

    if (!getNominalCols().toString().equalsIgnoreCase("empty")) {
      result.add("-m");
      result.add("" + getNominalCols().getRanges());
    }

    return result.toArray(new String[result.size()]);
<<<<<<< HEAD
=======
=======
    m_booleanCols.setUpper(getNumAttributes());

    tmpStr = Utils.getOption('m', options);
    setNominalIndices(tmpStr);
    m_nominalCols.setUpper(getNumAttributes());

    // check indices
    tmpStr = checkIndices();
    if (tmpStr.length() > 0)
      throw new IllegalArgumentException(tmpStr);
  }
  
  /**
   * Gets the current settings of the classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    String[]      options;
    int           i;
    
    result  = new Vector();
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
    
    result.add("-a");
    result.add("" + getNumAttributes());

    if (getClassFlag())
      result.add("-c");
    
    if (!getBooleanCols().toString().equalsIgnoreCase("empty")) {
      result.add("-b");
      result.add("" + getBooleanCols());
    }
    
    if (!getNominalCols().toString().equalsIgnoreCase("empty")) {
      result.add("-m");
      result.add("" + getNominalCols());
    }
    
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the default number of attributes
   * 
   * @return the default number of attributes
   */
  protected int defaultNumAttributes() {
    return 10;
  }

  /**
   * Sets the number of attributes the dataset should have.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param numAttributes the new number of attributes
   */
  public void setNumAttributes(int numAttributes) {
    m_NumAttributes = numAttributes;
    getBooleanCols().setUpper(getNumAttributes());
    getNominalCols().setUpper(getNumAttributes());
  }

  /**
   * Gets the number of attributes that should be produced.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of attributes that should be produced
   */
  public int getNumAttributes() {
    return m_NumAttributes;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   * @return the number of attributes that should be produced
   */
  public int getNumAttributes() { 
    return m_NumAttributes; 
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numAttributesTipText() {
    return "The number of attributes the generated data will contain.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the class flag, if class flag is set, the cluster is listed as class
   * atrribute in an extra attribute.
   * 
   * @param classFlag the new class flag
   */
  public void setClassFlag(boolean classFlag) {
    m_ClassFlag = classFlag;
<<<<<<< HEAD
=======
=======
   * Sets the class flag, if class flag is set, 
   * the cluster is listed as class atrribute in an extra attribute.
   * @param classFlag the new class flag
   */
  public void setClassFlag(boolean classFlag) { 
    m_ClassFlag = classFlag; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the class flag.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the class flag
   */
  public boolean getClassFlag() {
    return m_ClassFlag;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   * @return the class flag 
   */
  public boolean getClassFlag() {
    return m_ClassFlag; 
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String classFlagTipText() {
    return "If set to TRUE, lists the cluster as an extra attribute.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets which attributes are boolean
   * 
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br/>
   *          eg: first-3,5,6-last
   * @throws IllegalArgumentException if an invalid range list is supplied
<<<<<<< HEAD
=======
=======
   * Sets which attributes are boolean 
   * @param rangeList a string representing the list of attributes. Since
   * the string will typically come from a user, attributes are indexed from
   * 1. <br/>
   * eg: first-3,5,6-last
   * @throws IllegalArgumentException if an invalid range list is supplied 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setBooleanIndices(String rangeList) {
    m_booleanCols.setRanges(rangeList);
  }

  /**
   * Sets which attributes are boolean.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the range to use
   */
  public void setBooleanCols(Range value) {
    m_booleanCols.setRanges(value.getRanges());
  }

  /**
   * returns the range of boolean attributes.
   * 
   * @return the range of boolean attributes
   */
  public Range getBooleanCols() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_booleanCols == null) {
      m_booleanCols = new Range();
    }

    return m_booleanCols;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
    if (m_booleanCols == null)
      m_booleanCols = new Range();

    return m_booleanCols;
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String booleanColsTipText() {
    return "The range of attributes that are generated as boolean ones.";
  }

  /**
   * Sets which attributes are nominal
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br/>
   *          eg: first-3,5,6-last
   * @throws IllegalArgumentException if an invalid range list is supplied
<<<<<<< HEAD
=======
=======
   * @param rangeList a string representing the list of attributes. Since
   * the string will typically come from a user, attributes are indexed from
   * 1. <br/>
   * eg: first-3,5,6-last
   * @throws IllegalArgumentException if an invalid range list is supplied 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setNominalIndices(String rangeList) {
    m_nominalCols.setRanges(rangeList);
  }

  /**
   * Sets which attributes are nominal.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the range to use
   */
  public void setNominalCols(Range value) {
    m_nominalCols.setRanges(value.getRanges());
  }

  /**
   * returns the range of nominal attributes
   * 
   * @return the range of nominal attributes
   */
  public Range getNominalCols() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_nominalCols == null) {
      m_nominalCols = new Range();
    }

    return m_nominalCols;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
    if (m_nominalCols == null)
      m_nominalCols = new Range();

    return m_nominalCols;
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String nominalColsTipText() {
    return "The range of attributes to generate as nominal ones.";
  }

  /**
   * check if attribute types are not contradicting
   * 
   * @return empty string if no problem, otherwise error message
   */
  protected String checkIndices() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < getNumAttributes(); i++) {
      if (m_booleanCols.isInRange(i) && m_nominalCols.isInRange(i)) {
        return "Error in attribute type: Attribute " + i
          + " is set boolean and nominal.";
      }
    }
    return "";
  }
}
<<<<<<< HEAD
=======
=======
    for (int i = 1; i < getNumAttributes() + 1; i++) {
      m_booleanCols.isInRange(i);
      if (m_booleanCols.isInRange(i) && m_nominalCols.isInRange(i)) {
	return   "Error in attribute type: Attribute " 
               + i + " is set boolean and nominal.";
      }
    } 
    return "";
  }
}


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
