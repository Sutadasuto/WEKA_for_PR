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
 * MexicanHat.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.datagenerators.classifiers.regression;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.DenseInstance;
<<<<<<< HEAD
=======
=======
import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.datagenerators.RegressionGenerator;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> A data generator for the simple 'Mexian Hat'
 * function:<br/>
 * y = sin|x| / |x|<br/>
 * In addition to this simple function, the amplitude can be changed and
 * gaussian noise can be added.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -h
 *  Prints this help.
 * </pre>
 * 
 * <pre>
 * -o &lt;file&gt;
 *  The name of the output file, otherwise the generated data is
 *  printed to stdout.
 * </pre>
 * 
 * <pre>
 * -r &lt;name&gt;
 *  The name of the relation.
 * </pre>
 * 
 * <pre>
 * -d
 *  Whether to print debug informations.
 * </pre>
 * 
 * <pre>
 * -S
 *  The seed for random function (default 1)
 * </pre>
 * 
 * <pre>
 * -n &lt;num&gt;
 *  The number of examples to generate (default 100)
 * </pre>
 * 
 * <pre>
 * -A &lt;num&gt;
 *  The amplitude multiplier (default 1.0).
 * </pre>
 * 
 * <pre>
 * -R &lt;num&gt;..&lt;num&gt;
 *  The range x is randomly drawn from (default -10.0..10.0).
 * </pre>
 * 
 * <pre>
 * -N &lt;num&gt;
 *  The noise rate (default 0.0).
 * </pre>
 * 
 * <pre>
 * -V &lt;num&gt;
 *  The noise variance (default 1.0).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */

public class MexicanHat extends RegressionGenerator {

  /** for serialization */
  static final long serialVersionUID = 4577016375261512975L;

<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * A data generator for the simple 'Mexian Hat' function:<br/>
 *    y = sin|x| / |x|<br/>
 * In addition to this simple function, the amplitude can be changed and gaussian noise can be added.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -h
 *  Prints this help.</pre>
 * 
 * <pre> -o &lt;file&gt;
 *  The name of the output file, otherwise the generated data is
 *  printed to stdout.</pre>
 * 
 * <pre> -r &lt;name&gt;
 *  The name of the relation.</pre>
 * 
 * <pre> -d
 *  Whether to print debug informations.</pre>
 * 
 * <pre> -S
 *  The seed for random function (default 1)</pre>
 * 
 * <pre> -n &lt;num&gt;
 *  The number of examples to generate (default 100)</pre>
 * 
 * <pre> -A &lt;num&gt;
 *  The amplitude multiplier (default 1.0).</pre>
 * 
 * <pre> -R &lt;num&gt;..&lt;num&gt;
 *  The range x is randomly drawn from (default -10.0..10.0).</pre>
 * 
 * <pre> -N &lt;num&gt;
 *  The noise rate (default 0.0).</pre>
 * 
 * <pre> -V &lt;num&gt;
 *  The noise variance (default 1.0).</pre>
 * 
 <!-- options-end -->
 *
 * @author  FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.4 $
 */

public class MexicanHat
  extends RegressionGenerator {

  /** for serialization */
  static final long serialVersionUID = 4577016375261512975L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** the amplitude of y */
  protected double m_Amplitude;

  /** the lower boundary of the range, x is drawn from */
  protected double m_MinRange;

  /** the upper boundary of the range, x is drawn from */
  protected double m_MaxRange;

  /** the rate of the gaussian noise */
  protected double m_NoiseRate;

  /** the variance of the gaussian noise */
  protected double m_NoiseVariance;

  /** the random number generator for the noise */
  protected Random m_NoiseRandom = null;

  /**
   * initializes the generator
   */
  public MexicanHat() {
    super();

    setAmplitude(defaultAmplitude());
    setMinRange(defaultMinRange());
    setMaxRange(defaultMaxRange());
    setNoiseRate(defaultNoiseRate());
    setNoiseVariance(defaultNoiseVariance());
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns a string describing this data generator.
   * 
   * @return a description of the data generator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "A data generator for the simple 'Mexian Hat' function:\n"
      + "   y = sin|x| / |x|\n"
      + "In addition to this simple function, the amplitude can be changed and "
      + "gaussian noise can be added.";
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns a string describing this data generator.
   *
   * @return a description of the data generator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "A data generator for the simple 'Mexian Hat' function:\n"
        + "   y = sin|x| / |x|\n"
        + "In addition to this simple function, the amplitude can be changed and "
        + "gaussian noise can be added.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of all the available options
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = enumToVector(super.listOptions());

    result.addElement(new Option("\tThe amplitude multiplier (default "
      + defaultAmplitude() + ").", "A", 1, "-A <num>"));

    result.addElement(new Option(
      "\tThe range x is randomly drawn from (default " + defaultMinRange()
        + ".." + defaultMaxRange() + ").", "R", 1, "-R <num>..<num>"));

    result.addElement(new Option("\tThe noise rate (default "
      + defaultNoiseRate() + ").", "N", 1, "-N <num>"));

    result.addElement(new Option("\tThe noise variance (default "
      + defaultNoiseVariance() + ").", "V", 1, "-V <num>"));

    return result.elements();
  }

  /**
   * Parses a list of options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -h
   *  Prints this help.
   * </pre>
   * 
   * <pre>
   * -o &lt;file&gt;
   *  The name of the output file, otherwise the generated data is
   *  printed to stdout.
   * </pre>
   * 
   * <pre>
   * -r &lt;name&gt;
   *  The name of the relation.
   * </pre>
   * 
   * <pre>
   * -d
   *  Whether to print debug informations.
   * </pre>
   * 
   * <pre>
   * -S
   *  The seed for random function (default 1)
   * </pre>
   * 
   * <pre>
   * -n &lt;num&gt;
   *  The number of examples to generate (default 100)
   * </pre>
   * 
   * <pre>
   * -A &lt;num&gt;
   *  The amplitude multiplier (default 1.0).
   * </pre>
   * 
   * <pre>
   * -R &lt;num&gt;..&lt;num&gt;
   *  The range x is randomly drawn from (default -10.0..10.0).
   * </pre>
   * 
   * <pre>
   * -N &lt;num&gt;
   *  The noise rate (default 0.0).
   * </pre>
   * 
   * <pre>
   * -V &lt;num&gt;
   *  The noise variance (default 1.0).
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    super.setOptions(options);

    tmpStr = Utils.getOption('A', options);
    if (tmpStr.length() != 0) {
      setAmplitude(Double.parseDouble(tmpStr));
    } else {
      setAmplitude(defaultAmplitude());
    }

    tmpStr = Utils.getOption('R', options);
    if (tmpStr.length() != 0) {
      setRange(tmpStr);
    } else {
      setRange(defaultMinRange() + ".." + defaultMaxRange());
    }

    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0) {
      setNoiseRate(Double.parseDouble(tmpStr));
    } else {
      setNoiseRate(defaultNoiseRate());
    }

    tmpStr = Utils.getOption('V', options);
    if (tmpStr.length() != 0) {
      setNoiseVariance(Double.parseDouble(tmpStr));
    } else {
      setNoiseVariance(defaultNoiseVariance());
    }
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options
   */
  public Enumeration listOptions() {
    Vector result = enumToVector(super.listOptions());

    result.addElement(new Option(
              "\tThe amplitude multiplier (default " 
              + defaultAmplitude() + ").",
              "A", 1, "-A <num>"));

    result.addElement(new Option(
              "\tThe range x is randomly drawn from (default " 
              + defaultMinRange() + ".." + defaultMaxRange() + ").",
              "R", 1, "-R <num>..<num>"));

    result.addElement(new Option(
              "\tThe noise rate (default " 
              + defaultNoiseRate() + ").",
              "N", 1, "-N <num>"));

    result.addElement(new Option(
              "\tThe noise variance (default "
              + defaultNoiseVariance() + ").",
              "V", 1, "-V <num>"));

    return result.elements();
  }
  
  /**
   * Parses a list of options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -h
   *  Prints this help.</pre>
   * 
   * <pre> -o &lt;file&gt;
   *  The name of the output file, otherwise the generated data is
   *  printed to stdout.</pre>
   * 
   * <pre> -r &lt;name&gt;
   *  The name of the relation.</pre>
   * 
   * <pre> -d
   *  Whether to print debug informations.</pre>
   * 
   * <pre> -S
   *  The seed for random function (default 1)</pre>
   * 
   * <pre> -n &lt;num&gt;
   *  The number of examples to generate (default 100)</pre>
   * 
   * <pre> -A &lt;num&gt;
   *  The amplitude multiplier (default 1.0).</pre>
   * 
   * <pre> -R &lt;num&gt;..&lt;num&gt;
   *  The range x is randomly drawn from (default -10.0..10.0).</pre>
   * 
   * <pre> -N &lt;num&gt;
   *  The noise rate (default 0.0).</pre>
   * 
   * <pre> -V &lt;num&gt;
   *  The noise variance (default 1.0).</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String        tmpStr;
   
    super.setOptions(options);

    tmpStr = Utils.getOption('A', options);
    if (tmpStr.length() != 0)
      setAmplitude(Double.parseDouble(tmpStr));
    else
      setAmplitude(defaultAmplitude());

    tmpStr = Utils.getOption('R', options);
    if (tmpStr.length() != 0)
      setRange(tmpStr);
    else
      setRange(defaultMinRange() + ".." + defaultMaxRange());
    
    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0)
      setNoiseRate(Double.parseDouble(tmpStr));
    else
      setNoiseRate(defaultNoiseRate());

    tmpStr = Utils.getOption('V', options);
    if (tmpStr.length() != 0)
      setNoiseVariance(Double.parseDouble(tmpStr));
    else
      setNoiseVariance(defaultNoiseVariance());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the current settings of the datagenerator BIRCHCluster.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result;
    String[] options;

    result = new Vector<String>();
    options = removeBlacklist(super.getOptions());
    Collections.addAll(result, options);

    result.add("-A");
    result.add("" + getAmplitude());

    result.add("-R");
    result.add("" + getRange());

    result.add("-N");
    result.add("" + getNoiseRate());

    result.add("-V");
    result.add("" + getNoiseVariance());

    return result.toArray(new String[result.size()]);
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    String[]      options;
    int           i;
    
    result  = new Vector();
    options = removeBlacklist(super.getOptions());
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    result.add("-A"); 
    result.add("" + getAmplitude());

    result.add("-R"); 
    result.add("" + getRange());

    result.add("-N"); 
    result.add("" + getNoiseRate());

    result.add("-V"); 
    result.add("" + getNoiseVariance());
    
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the default amplitude
   * 
   * @return the default amplitude
   */
  protected double defaultAmplitude() {
    return 1.0;
  }

  /**
   * Gets the amplitude multiplier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the amplitude multiplier
   */
  public double getAmplitude() {
    return m_Amplitude;
  }

  /**
   * Sets the amplitude multiplier.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return the amplitude multiplier
   */
  public double getAmplitude() { 
    return m_Amplitude; 
  }
  
  /**
   * Sets the amplitude multiplier.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the amplitude multiplier
   */
  public void setAmplitude(double value) {
    m_Amplitude = value;
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
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String amplitudeTipText() {
    return "The amplitude of the mexican hat.";
  }

  /**
   * Sets the upper and lower boundary for the range of x
<<<<<<< HEAD
   * 
   * @param fromTo the string containing the upper and lower boundary for the
   *          range of x, separated by ..
=======
<<<<<<< HEAD
   * 
   * @param fromTo the string containing the upper and lower boundary for the
   *          range of x, separated by ..
=======
   *
   * @param fromTo the string containing the upper and lower boundary for
   *               the range of x, separated by ..
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void setRange(String fromTo) {
    int i = fromTo.indexOf("..");
    String from = fromTo.substring(0, i);
    setMinRange(Double.valueOf(from).doubleValue());
    String to = fromTo.substring(i + 2, fromTo.length());
    setMaxRange(Double.valueOf(to).doubleValue());
  }

  /**
   * Gets the upper and lower boundary for the range of x
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the string containing the upper and lower boundary for the range of
   *         x, separated by ..
   */
  protected String getRange() {
    String fromTo = "" + Utils.doubleToString(getMinRange(), 2) + ".."
      + Utils.doubleToString(getMaxRange(), 2);
    return fromTo;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   *
   * @return the string containing the upper and lower boundary for
   *         the range of x, separated by ..
   */
  protected String getRange() {
    String fromTo = "" 
                    + Utils.doubleToString(getMinRange(), 2) + ".."
                    + Utils.doubleToString(getMaxRange(), 2);
    return fromTo;
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected String rangeTipText() {
    return "The upper and lower boundary for the range x is drawn from randomly.";
  }

  /**
   * returns the default min range
   * 
   * @return the default min range
   */
  protected double defaultMinRange() {
    return -10;
  }

  /**
   * Sets the lower boundary for the range of x
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the lower boundary
   */
  public void setMinRange(double value) {
    m_MinRange = value;
  }

  /**
   * Gets the lower boundary for the range of x
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the lower boundary for the range of x
   */
  public double getMinRange() {
    return m_MinRange;
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
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String minRangeTipText() {
    return "The lower boundary for the range x is drawn from randomly.";
  }

  /**
   * returns the default max range
   * 
   * @return the default max range
   */
  protected double defaultMaxRange() {
    return 10;
  }

  /**
   * Sets the upper boundary for the range of x
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the upper boundary
   */
  public void setMaxRange(double value) {
    m_MaxRange = value;
  }

  /**
   * Gets the upper boundary for the range of x
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the upper boundary for the range of x
   */
  public double getMaxRange() {
    return m_MaxRange;
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
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String maxRangeTipText() {
    return "The upper boundary for the range x is drawn from randomly.";
  }

  /**
   * returns the default gaussian noise rate
   * 
   * @return the default gaussian noise rate
   */
  protected double defaultNoiseRate() {
    return 0.0;
  }

  /**
   * Gets the gaussian noise rate.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the gaussian noise rate
   */
  public double getNoiseRate() {
    return m_NoiseRate;
  }

  /**
   * Sets the gaussian noise rate.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return the gaussian noise rate
   */
  public double getNoiseRate() { 
    return m_NoiseRate; 
  }
  
  /**
   * Sets the gaussian noise rate.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the gaussian noise rate
   */
  public void setNoiseRate(double value) {
    m_NoiseRate = value;
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
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String noiseRateTipText() {
    return "The gaussian noise rate to use.";
  }

  /**
   * returns the default variance of the noise rate
   * 
   * @return the default variance of the noise rate
   */
  protected double defaultNoiseVariance() {
    return 1.0;
  }

  /**
   * Gets the noise variance
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the noise variance
   */
  public double getNoiseVariance() {
    return m_NoiseVariance;
  }

  /**
   * Sets the noise variance
   * 
   * @param value the noise variance
   */
  public void setNoiseVariance(double value) {
    if (value > 0) {
      m_NoiseVariance = value;
    } else {
      throw new IllegalArgumentException(
        "Noise variance needs to be > 0 (provided: " + value + ")!");
    }
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   *
   * @return the noise variance
   */
  public double getNoiseVariance() { 
    return m_NoiseVariance; 
  }
  
  /**
   * Sets the noise variance
   *
   * @param value the noise variance
   */
  public void setNoiseVariance(double value) {
    if (value > 0)
      m_NoiseVariance = value;
    else
      throw new IllegalArgumentException(
          "Noise variance needs to be > 0 (provided: " + value + ")!");
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String noiseVarianceTipText() {
    return "The noise variance to use.";
  }

  /**
<<<<<<< HEAD
   * Return if single mode is set for the given data generator mode depends on
   * option setting and or generator type.
=======
<<<<<<< HEAD
   * Return if single mode is set for the given data generator mode depends on
   * option setting and or generator type.
=======
   * Return if single mode is set for the given data generator
   * mode depends on option setting and or generator type.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return single mode flag
   * @throws Exception if mode is not set yet
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean getSingleModeFlag() throws Exception {
    return true;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Initializes the format for the dataset produced. Must be called before the
   * generateExample or generateExamples methods are used. Re-initializes the
   * random number generator with the given seed.
   * 
   * @return the format for the dataset
   * @throws Exception if the generating of the format failed
   * @see #getSeed()
   */
  @Override
  public Instances defineDataFormat() throws Exception {
    ArrayList<Attribute> atts;

    m_Random = new Random(getSeed());
<<<<<<< HEAD
=======
=======
   * Initializes the format for the dataset produced. 
   * Must be called before the generateExample or generateExamples
   * methods are used.
   * Re-initializes the random number generator with the given seed.
   *
   * @return the format for the dataset 
   * @throws Exception if the generating of the format failed
   * @see  #getSeed()
   */
  public Instances defineDataFormat() throws Exception {
    FastVector      atts;

    m_Random      = new Random(getSeed());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_NoiseRandom = new Random(getSeed());

    // number of examples is the same as given per option
    setNumExamplesAct(getNumExamples());

    // initialize dataset format
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    atts = new ArrayList<Attribute>();
    atts.add(new Attribute("x"));
    atts.add(new Attribute("y"));

    m_DatasetFormat = new Instances(getRelationNameToUse(), atts, 0);

<<<<<<< HEAD
=======
=======
    atts = new FastVector();
    atts.addElement(new Attribute("x"));
    atts.addElement(new Attribute("y"));
    
    m_DatasetFormat = new Instances(getRelationNameToUse(), atts, 0);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_DatasetFormat;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Generates one example of the dataset.
   * 
   * @return the generated example
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExamples which
   *           means in non single mode
   */
  @Override
  public Instance generateExample() throws Exception {
    Instance result;
    Random rand;
    double x;
    double y;
    double[] atts;

    result = null;
    rand = getRandom();

    if (m_DatasetFormat == null) {
      throw new Exception("Dataset format not defined.");
    }

    // generate attributes
    atts = new double[m_DatasetFormat.numAttributes()];

<<<<<<< HEAD
=======
=======
   * Generates one example of the dataset. 
   *
   * @return the generated example
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExamples
   * which means in non single mode
   */
  public Instance generateExample() throws Exception {
    Instance    result;
    Random      rand;
    double      x;
    double      y;
    double[]    atts;

    result = null;
    rand   = getRandom();

    if (m_DatasetFormat == null)
      throw new Exception("Dataset format not defined.");

    // generate attributes
    atts = new double[m_DatasetFormat.numAttributes()];
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // random x
    x = rand.nextDouble();
    // fit into range
    x = x * (getMaxRange() - getMinRange()) + getMinRange();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // generate y
    if (Utils.eq(x, 0)) {
      y = getAmplitude();
    } else {
      y = getAmplitude() * StrictMath.sin(StrictMath.abs(x))
        / StrictMath.abs(x);
    }
    // noise
    y = y + getAmplitude() * m_NoiseRandom.nextGaussian() * getNoiseRate()
      * getNoiseVariance();

    atts[0] = x;
    atts[1] = y;
    result = new DenseInstance(1.0, atts);

    // dataset reference
    result.setDataset(m_DatasetFormat);

<<<<<<< HEAD
=======
=======
    
    // generate y
    if (Utils.eq(x, 0))
      y = getAmplitude();
    else
      y = getAmplitude() 
          * StrictMath.sin(StrictMath.abs(x)) / StrictMath.abs(x);
    // noise
    y = y + getAmplitude() 
            * m_NoiseRandom.nextGaussian() 
            * getNoiseRate() * getNoiseVariance();

    atts[0] = x;
    atts[1] = y;
    result = new Instance(1.0, atts);

    // dataset reference
    result.setDataset(m_DatasetFormat);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Generates all examples of the dataset. Re-initializes the random number
   * generator with the given seed, before generating instances.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the generated dataset
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExample, which
   *           means in single mode
   * @see #getSeed()
   */
  @Override
  public Instances generateExamples() throws Exception {
    Instances result;
    int i;

    result = new Instances(m_DatasetFormat, 0);
    m_Random = new Random(getSeed());

    for (i = 0; i < getNumExamplesAct(); i++) {
      result.add(generateExample());
    }
<<<<<<< HEAD
=======
=======
   *
   * @return the generated dataset
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExample,
   * which means in single mode
   * @see   #getSeed()
   */
  public Instances generateExamples() throws Exception {
    Instances       result;
    int             i;

    result   = new Instances(m_DatasetFormat, 0);
    m_Random = new Random(getSeed());

    for (i = 0; i < getNumExamplesAct(); i++)
      result.add(generateExample());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Generates a comment string that documentates the data generator. By default
   * this string is added at the beginning of the produced output as ARFF file
   * type, next after the options.
   * 
   * @return string contains info about the generated rules
   */
  @Override
  public String generateStart() {
<<<<<<< HEAD
=======
=======
   * Generates a comment string that documentates the data generator.
   * By default this string is added at the beginning of the produced output
   * as ARFF file type, next after the options.
   * 
   * @return string contains info about the generated rules
   */
  public String generateStart () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "";
  }

  /**
<<<<<<< HEAD
   * Generates a comment string that documentats the data generator. By default
   * this string is added at the end of theproduces output as ARFF file type.
=======
<<<<<<< HEAD
   * Generates a comment string that documentats the data generator. By default
   * this string is added at the end of theproduces output as ARFF file type.
=======
   * Generates a comment string that documentats the data generator.
   * By default this string is added at the end of theproduces output
   * as ARFF file type.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return string contains info about the generated rules
   * @throws Exception if the generating of the documentaion fails
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String generateFinished() throws Exception {
    return "";
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
<<<<<<< HEAD
=======
=======
  public String generateFinished() throws Exception {
    return "";
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.4 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param args should contain arguments for the data producer:
=======
<<<<<<< HEAD
   * 
   * @param args should contain arguments for the data producer:
=======
   *
   * @param args should contain arguments for the data producer: 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    runDataGenerator(new MexicanHat(), args);
  }
}
