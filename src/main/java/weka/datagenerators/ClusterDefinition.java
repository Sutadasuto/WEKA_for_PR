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
 * ClusterDefinition.java
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

package weka.datagenerators;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.Serializable;
import java.util.Enumeration;

import weka.core.Option;
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.Utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Ancestor to all ClusterDefinitions, i.e., subclasses that handle their own
 * parameters that the cluster generator only passes on.
 * 
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */

public abstract class ClusterDefinition implements Serializable, OptionHandler,
  RevisionHandler {
<<<<<<< HEAD
=======
=======
import java.io.Serializable;
import java.util.Enumeration;

/**
 * Ancestor to all ClusterDefinitions, i.e., subclasses that handle their
 * own parameters that the cluster generator only passes on.
 *
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.5 $
 */

public abstract class ClusterDefinition
  implements Serializable, OptionHandler, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -5950001207047429961L;

  /** the parent of the cluster */
  protected ClusterGenerator m_Parent;

  /**
   * initializes the cluster, without a parent cluster (necessary for GOE)
   */
  public ClusterDefinition() {
    this(null);
  }

  /**
   * initializes the cluster
<<<<<<< HEAD
   * 
   * @param parent the datagenerator this cluster belongs to
=======
<<<<<<< HEAD
   * 
   * @param parent the datagenerator this cluster belongs to
=======
   *
   * @param parent    the datagenerator this cluster belongs to
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public ClusterDefinition(ClusterGenerator parent) {
    m_Parent = parent;

    try {
      setDefaults();
<<<<<<< HEAD
    } catch (Exception e) {
=======
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      e.printStackTrace();
    }
  }

  /**
   * sets the default values
   * 
   * @throws Exception if setting of defaults fails
   */
  protected abstract void setDefaults() throws Exception;

  /**
   * Returns a string describing this data generator.
<<<<<<< HEAD
   * 
   * @return a description of the data generator suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return a description of the data generator suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return a description of the data generator suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String globalInfo() {
    return "Contains informations about a certain cluster of a cluster generator.";
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
  public abstract Enumeration<Option> listOptions();

  /**
   * Parses a list of options for this object.
   * <p/>
   * 
   * For list of valid options see class description.
   * <p/>
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options
   */
  public abstract Enumeration listOptions();

  /**
   * Parses a list of options for this object. <p/>
   *
   * For list of valid options see class description.<p/>
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public abstract void setOptions(String[] options) throws Exception;

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
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public abstract String[] getOptions();

  /**
   * returns the parent datagenerator this cluster belongs to
   * 
   * @return the parent this cluster belongs to
   */
  public ClusterGenerator getParent() {
    return m_Parent;
  }

  /**
   * sets the parent datagenerator this cluster belongs to
   * 
   * @param parent the parent datagenerator
   */
  public void setParent(ClusterGenerator parent) {
    m_Parent = parent;
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
  public String parentTipText() {
    return "The cluster generator this object belongs to.";
  }

  /**
   * returns a string representation of the cluster
   * 
   * @return the cluster definition as string
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {
    return this.getClass().getName() + ": " + Utils.joinOptions(getOptions());
  }
}
