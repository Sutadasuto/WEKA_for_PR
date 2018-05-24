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
 * RandomizableSingleClustererEnhancer.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.clusterers;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Randomizable;
import weka.core.Utils;

<<<<<<< HEAD
/**
 * Abstract utility class for handling settings common to randomizable
 * clusterers.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public abstract class RandomizableSingleClustererEnhancer extends
  AbstractClusterer implements OptionHandler, Randomizable {

  /** for serialization */
  private static final long serialVersionUID = -644847037106316249L;

  /** the default seed value */
  protected int m_SeedDefault = 1;

=======
import java.util.Enumeration;
import java.util.Vector;

/**
 * Abstract utility class for handling settings common to randomizable
 * clusterers.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.3 $
 */
public abstract class RandomizableSingleClustererEnhancer
  extends AbstractClusterer
  implements OptionHandler, Randomizable {

  /** for serialization */
  private static final long serialVersionUID = -644847037106316249L;
  
  /** the default seed value */
  protected int m_SeedDefault = 1;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The random number seed. */
  protected int m_Seed = m_SeedDefault;

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tRandom number seed.\n" + "\t(default "
      + m_SeedDefault + ")", "S", 1, "-S <num>"));

    result.addAll(Collections.list(super.listOptions()));
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
	"\tRandom number seed.\n"
	+ "\t(default " + m_SeedDefault + ")",
	"S", 1, "-S <num>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result.elements();
  }

  /**
<<<<<<< HEAD
   * Parses a given list of options. Valid options are:
   * <p>
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    String tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0) {
      setSeed(Integer.parseInt(tmpStr));
    } else {
      setSeed(m_SeedDefault);
    }

    super.setOptions(options);
=======
   * Parses a given list of options. Valid options are:<p>
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0)
      setSeed(Integer.parseInt(tmpStr));
    else
      setSeed(m_SeedDefault);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the classifier.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector	result;
    
    result = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result.add("-S");
    result.add("" + getSeed());

<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
    return (String[]) result.toArray(new String[result.size()]);
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String seedTipText() {
    return "The random number seed to be used.";
  }

  /**
   * Set the seed for random number generation.
<<<<<<< HEAD
   * 
   * @param value the seed to use
   */
  @Override
=======
   *
   * @param value 	the seed to use
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setSeed(int value) {
    m_Seed = value;
  }

  /**
   * Gets the seed for the random number generations
<<<<<<< HEAD
   * 
   * @return the seed for the random number generation
   */
  @Override
=======
   *
   * @return 		the seed for the random number generation
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public int getSeed() {
    return m_Seed;
  }
}
