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
 *    SingleAssociatorEnhancer.java
<<<<<<< HEAD
 *    Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.associations;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;

/**
 * Abstract utility class for handling settings common to meta associators that
 * use a single base associator.
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10172 $
 */
public abstract class SingleAssociatorEnhancer extends AbstractAssociator
=======
import weka.core.Capabilities;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.core.Capabilities.Capability;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Abstract utility class for handling settings common to meta
 * associators that use a single base associator.  
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 5504 $
 */
public abstract class SingleAssociatorEnhancer
  extends AbstractAssociator
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  implements OptionHandler {

  /** for serialization */
  private static final long serialVersionUID = -3665885256363525164L;

  /** The base associator to use */
  protected Associator m_Associator = new Apriori();

  /**
   * String describing default Associator.
   * 
<<<<<<< HEAD
   * @return default classname
=======
   * @return		default classname
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected String defaultAssociatorString() {
    return Apriori.class.getName();
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tFull name of base associator.\n"
      + "\t(default: " + defaultAssociatorString() + ")", "W", 1, "-W"));

    if (m_Associator instanceof OptionHandler) {
      result.addElement(new Option("", "", 0,
        "\nOptions specific to associator " + m_Associator.getClass().getName()
          + ":"));

      result.addAll(Collections.list(((OptionHandler) m_Associator)
        .listOptions()));
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
	      "\tFull name of base associator.\n"
	      + "\t(default: " + defaultAssociatorString() +")",
	      "W", 1, "-W"));

    if (m_Associator instanceof OptionHandler) {
      result.addElement(new Option(
	  "",
	  "", 0, "\nOptions specific to associator "
	  + m_Associator.getClass().getName() + ":"));

      Enumeration enm = ((OptionHandler) m_Associator).listOptions();
      while (enm.hasMoreElements())
	result.addElement(enm.nextElement());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return result.elements();
  }

  /**
<<<<<<< HEAD
   * Parses a given list of options. Valid options are:
   * <p>
   * 
   * -W classname <br>
   * Specify the full class name of the base associator.
   * <p>
   * 
   * Options after -- are passed to the designated associator.
   * <p>
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() > 0) {
      // This is just to set the associator in case the option
      // parsing fails.
      setAssociator(AbstractAssociator.forName(tmpStr, null));
      setAssociator(AbstractAssociator.forName(tmpStr,
        Utils.partitionOptions(options)));
    } else {
      // This is just to set the associator in case the option
      // parsing fails.
      setAssociator(AbstractAssociator.forName(defaultAssociatorString(), null));
      setAssociator(AbstractAssociator.forName(defaultAssociatorString(),
        Utils.partitionOptions(options)));
=======
   * Parses a given list of options. Valid options are:<p>
   *
   * -W classname <br>
   * Specify the full class name of the base associator.<p>
   *
   * Options after -- are passed to the designated associator.<p>
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() > 0) { 
      // This is just to set the associator in case the option 
      // parsing fails.
      setAssociator(AbstractAssociator.forName(tmpStr, null));
      setAssociator(AbstractAssociator.forName(tmpStr, Utils.partitionOptions(options)));
    }
    else {
      // This is just to set the associator in case the option 
      // parsing fails.
      setAssociator(AbstractAssociator.forName(defaultAssociatorString(), null));
      setAssociator(AbstractAssociator.forName(defaultAssociatorString(), Utils.partitionOptions(options)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Gets the current settings of the associator.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    int i;
    Vector<String> result;
    String[] options;

=======
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    int       		i;
    Vector<String>    	result;
    String[]		options;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result = new Vector<String>();

    result.add("-W");
    result.add(getAssociator().getClass().getName());

    if (getAssociator() instanceof OptionHandler) {
      options = ((OptionHandler) getAssociator()).getOptions();
      result.add("--");
<<<<<<< HEAD
      for (i = 0; i < options.length; i++) {
        result.add(options[i]);
      }
=======
      for (i = 0; i < options.length; i++)
	result.add(options[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return result.toArray(new String[result.size()]);
  }
<<<<<<< HEAD

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String associatorTipText() {
    return "The base associator to be used.";
  }

  /**
   * Set the base associator.
<<<<<<< HEAD
   * 
   * @param value the associator to use.
=======
   *
   * @param value 	the associator to use.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setAssociator(Associator value) {
    m_Associator = value;
  }

  /**
   * Get the associator used as the base associator.
<<<<<<< HEAD
   * 
   * @return the currently used associator
=======
   *
   * @return 		the currently used associator
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Associator getAssociator() {
    return m_Associator;
  }
<<<<<<< HEAD

  /**
   * Gets the associator specification string, which contains the class name of
   * the associator and any options to the associator
   * 
=======
  
  /**
   * Gets the associator specification string, which contains the class name of
   * the associator and any options to the associator
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the associator string
   */
  protected String getAssociatorSpec() {
    Associator c = getAssociator();
    return c.getClass().getName() + " "
<<<<<<< HEAD
      + Utils.joinOptions(((OptionHandler) c).getOptions());
=======
      + Utils.joinOptions(((OptionHandler)c).getOptions());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns default capabilities of the base associator.
<<<<<<< HEAD
   * 
   * @return the capabilities of the base associator
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;
=======
   *
   * @return      the capabilities of the base associator
   */
  public Capabilities getCapabilities() {
    Capabilities        result;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (getAssociator() != null) {
      result = getAssociator().getCapabilities();
    } else {
      result = new Capabilities(this);
<<<<<<< HEAD
    }

    // set dependencies
    for (Capability cap : Capability.values()) {
      result.enableDependency(cap);
    }

    result.setOwner(this);

=======
      result.disableAll();
    }
    
    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);
    
    result.setOwner(this);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }
}
