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
 * SingleClustererEnhancer.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.clusterers;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;

/**
 * Meta-clusterer for enhancing a base clusterer.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public abstract class SingleClustererEnhancer extends AbstractClusterer
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.core.Capabilities.Capability;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Meta-clusterer for enhancing a base clusterer.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.4 $
 */
public abstract class SingleClustererEnhancer
  extends AbstractClusterer
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  implements OptionHandler {

  /** for serialization */
  private static final long serialVersionUID = 4893928362926428671L;

  /** the clusterer */
  protected Clusterer m_Clusterer = new SimpleKMeans();

  /**
   * String describing default clusterer.
   * 
<<<<<<< HEAD
   * @return the default clusterer classname
=======
<<<<<<< HEAD
   * @return the default clusterer classname
=======
   * @return 		the default clusterer classname
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected String defaultClustererString() {
    return SimpleKMeans.class.getName();
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
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tFull name of base clusterer.\n"
      + "\t(default: " + defaultClustererString() + ")", "W", 1, "-W"));

    result.addAll(Collections.list(super.listOptions()));

    if (m_Clusterer instanceof OptionHandler) {
      result.addElement(new Option("", "", 0,
        "\nOptions specific to clusterer " + m_Clusterer.getClass().getName()
          + ":"));

      result.addAll(Collections.list(((OptionHandler) m_Clusterer)
        .listOptions()));
<<<<<<< HEAD
=======
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
	"\tFull name of base clusterer.\n"
	+ "\t(default: " + defaultClustererString() +")",
	"W", 1, "-W"));

    if (m_Clusterer instanceof OptionHandler) {
      result.addElement(new Option(
	  "",
	  "", 0, "\nOptions specific to clusterer "
	  + m_Clusterer.getClass().getName() + ":"));
      Enumeration enu = ((OptionHandler) m_Clusterer).listOptions();
      while (enu.hasMoreElements()) {
	result.addElement(enu.nextElement());
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    return result.elements();
  }

  /**
   * Parses a given list of options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('W', options);
    super.setOptions(options);
    if (tmpStr.length() > 0) {
      setClusterer(AbstractClusterer.forName(tmpStr, null));
      setClusterer(AbstractClusterer.forName(tmpStr,
        Utils.partitionOptions(options)));
    } else {
      setClusterer(AbstractClusterer.forName(defaultClustererString(), null));
      setClusterer(AbstractClusterer.forName(defaultClustererString(),
        Utils.partitionOptions(options)));
<<<<<<< HEAD
=======
=======
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() > 0) { 
      // This is just to set the classifier in case the option 
      // parsing fails.
      setClusterer(AbstractClusterer.forName(tmpStr, null));
      setClusterer(AbstractClusterer.forName(tmpStr, Utils.partitionOptions(options)));
    } 
    else {
      // This is just to set the classifier in case the option 
      // parsing fails.
      setClusterer(AbstractClusterer.forName(defaultClustererString(), null));
      setClusterer(AbstractClusterer.forName(defaultClustererString(), Utils.partitionOptions(options)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Gets the current settings of the clusterer.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    result.add("-W");
    result.add(getClusterer().getClass().getName());

    Collections.addAll(result, super.getOptions());

    if (getClusterer() instanceof OptionHandler) {
      String[] options = ((OptionHandler) getClusterer()).getOptions();

      if (options.length > 0) {
        result.add("--");
      }
      Collections.addAll(result, options);
    }

    return result.toArray(new String[result.size()]);
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
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector	result;
    String[]	options;
    int		i;
    
    result = new Vector();

    result.add("-W");
    result.add(getClusterer().getClass().getName());
    
    if (getClusterer() instanceof OptionHandler) {
      result.add("--");
      options = ((OptionHandler) getClusterer()).getOptions();
      for (i = 0; i < options.length; i++)
	result.add(options[i]);
    }
    
    return (String[]) result.toArray(new String[result.size()]);
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String clustererTipText() {
    return "The base clusterer to be used.";
  }

  /**
   * Set the base clusterer.
<<<<<<< HEAD
   * 
   * @param value the classifier to use.
=======
<<<<<<< HEAD
   * 
   * @param value the classifier to use.
=======
   *
   * @param value 	the classifier to use.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setClusterer(Clusterer value) {
    m_Clusterer = value;
  }

  /**
   * Get the clusterer used as the base clusterer.
<<<<<<< HEAD
   * 
   * @return the base clusterer
=======
<<<<<<< HEAD
   * 
   * @return the base clusterer
=======
   *
   * @return 		the base clusterer
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Clusterer getClusterer() {
    return m_Clusterer;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the clusterer specification string, which contains the class name of
   * the clusterer and any options to the clusterer
   * 
   * @return the clusterer string
   */
  protected String getClustererSpec() {
    String result;
    Clusterer clusterer;

    clusterer = getClusterer();
    result = clusterer.getClass().getName();

    if (clusterer instanceof OptionHandler) {
      result += " "
        + Utils.joinOptions(((OptionHandler) clusterer).getOptions());
    }

<<<<<<< HEAD
=======
=======
  
  /**
   * Gets the clusterer specification string, which contains the class name of
   * the clusterer and any options to the clusterer
   *
   * @return 		the clusterer string
   */
  protected String getClustererSpec() {
    String	result;
    Clusterer 	clusterer;
    
    clusterer = getClusterer();
    result    = clusterer.getClass().getName();
    
    if (clusterer instanceof OptionHandler)
      result += " " + Utils.joinOptions(((OptionHandler) clusterer).getOptions());
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Returns default capabilities of the clusterer.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of this clusterer
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;

    if (getClusterer() == null) {
      result = super.getCapabilities();
    } else {
      result = getClusterer().getCapabilities();
    }

    // set dependencies
    for (Capability cap : Capability.values()) {
      result.enableDependency(cap);
    }

<<<<<<< HEAD
=======
=======
   *
   * @return		the capabilities of this clusterer
   */
  public Capabilities getCapabilities() {
    Capabilities	result;
    
    if (getClusterer() == null)
      result = super.getCapabilities();
    else
      result = getClusterer().getCapabilities();
    
    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Returns the number of clusters.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of clusters generated for a training dataset.
   * @throws Exception if number of clusters could not be returned successfully
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return 		the number of clusters generated for a training dataset.
   * @throws Exception 	if number of clusters could not be returned
   * 			successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int numberOfClusters() throws Exception {
    return m_Clusterer.numberOfClusters();
  }
}
