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
 * ClassificationGenerator.java
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
import weka.core.Utils;

/**
 * Abstract class for data generators for classifiers.
 * <p/>
 * 
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public abstract class ClassificationGenerator extends DataGenerator {
<<<<<<< HEAD
=======
=======
import weka.core.Option;
import weka.core.Utils;

import java.util.Enumeration;
import java.util.Vector;

/** 
 * Abstract class for data generators for classifiers. <p/>
 *
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.4 $
 */
public abstract class ClassificationGenerator 
  extends DataGenerator {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -5261662546673517844L;

<<<<<<< HEAD
  /** Number of instances */
=======
<<<<<<< HEAD
  /** Number of instances */
=======
  /** Number of instances*/
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected int m_NumExamples;

  /**
   * initializes with default values
   */
  public ClassificationGenerator() {
    super();

    setNumExamples(defaultNumExamples());
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

    result.addElement(new Option(
      "\tThe number of examples to generate (default " + defaultNumExamples()
        + ")", "n", 1, "-n <num>"));

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
        "\tThe number of examples to generate (default " 
        + defaultNumExamples() + ")",
        "n", 1, "-n <num>"));
    
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

    tmpStr = Utils.getOption('n', options);
    if (tmpStr.length() != 0) {
      setNumExamples(Integer.parseInt(tmpStr));
    } else {
      setNumExamples(defaultNumExamples());
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

    result.add("-n");
    result.add("" + getNumExamples());

    return result.toArray(new String[result.size()]);
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

    tmpStr = Utils.getOption('n', options);
    if (tmpStr.length() != 0)
      setNumExamples(Integer.parseInt(tmpStr));
    else
      setNumExamples(defaultNumExamples());
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
    
    result.add("-n");
    result.add("" + getNumExamples());
    
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the default number of examples
   * 
   * @return the default number of examples
   */
  protected int defaultNumExamples() {
    return 100;
  }

  /**
   * Sets the number of examples, given by option.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param numExamples the new number of examples
   */
  public void setNumExamples(int numExamples) {
    m_NumExamples = numExamples;
<<<<<<< HEAD
=======
=======
   * @param numExamples the new number of examples
   */
  public void setNumExamples(int numExamples) { 
    m_NumExamples = numExamples; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the number of examples, given by option.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of examples, given by option
   */
  public int getNumExamples() {
    return m_NumExamples;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   * @return the number of examples, given by option 
   */
  public int getNumExamples() { 
    return m_NumExamples; 
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numExamplesTipText() {
    return "The number of examples to generate.";
  }
}
