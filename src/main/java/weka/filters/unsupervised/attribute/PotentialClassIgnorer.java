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
 *    PotentialClassIgnorer.java
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

=======
<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.filters.Filter;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * This filter should be extended by other unsupervised attribute filters to
 * allow processing of the class attribute if that's required. It the class is
 * to be ignored it is essential that the extending filter does not change the
 * position (i.e. index) of the attribute that is originally the class attribute
 * !
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz), Mark Hall
 *         (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10215 $
 */
public abstract class PotentialClassIgnorer extends Filter implements
  OptionHandler {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 * This filter should be extended by other unsupervised attribute
 * filters to allow processing of the class attribute if that's
 * required. It the class is to be ignored it is essential that the
 * extending filter does not change the position (i.e. index) of the
 * attribute that is originally the class attribute !
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz), Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 1.7 $ 
 */
public abstract class PotentialClassIgnorer
  extends Filter
  implements OptionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 8625371119276845454L;

  /** True if the class is to be unset */
  protected boolean m_IgnoreClass = false;

  /** Storing the class index */
  protected int m_ClassIndex = -1;

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

    result.addElement(new Option(
      "\tUnsets the class index temporarily before the filter is\n"
        + "\tapplied to the data.\n" + "\t(default: no)",
      "unset-class-temporarily", 1, "-unset-class-temporarily"));
<<<<<<< HEAD
=======
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();
      
    result.addElement(new Option(
	"\tUnsets the class index temporarily before the filter is\n"
	+ "\tapplied to the data.\n"
	+ "\t(default: no)",
	"unset-class-temporarily", 1, "-unset-class-temporarily"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.elements();
  }

  /**
   * Parses a list of options for this object.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setOptions(String[] options) throws Exception {
    setIgnoreClass(Utils.getFlag("unset-class-temporarily", options));
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

    Vector<String> result = new Vector<String>();

    if (getIgnoreClass()) {
      result.add("-unset-class-temporarily");
    }

    return result.toArray(new String[result.size()]);
  }

  /**
   * Sets the format of the input instances. If the filter is able to determine
   * the output format before seeing any input instances, it does so here. This
   * default implementation clears the output format and output queue, and the
   * new batch flag is set. Overriders should call
   * <code>super.setInputFormat(Instances)</code>
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
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;

    result = new Vector();

    if (getIgnoreClass())
      result.add("-unset-class-temporarily");

    return (String[]) result.toArray(new String[result.size()]);
  }

  /**
   * Sets the format of the input instances. If the filter is able to
   * determine the output format before seeing any input instances, it
   * does so here. This default implementation clears the output format
   * and output queue, and the new batch flag is set. Overriders should
   * call <code>super.setInputFormat(Instances)</code>
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

    boolean result = super.setInputFormat(instanceInfo);
    if (m_IgnoreClass) {
      m_ClassIndex = inputFormatPeek().classIndex();
      inputFormatPeek().setClassIndex(-1);
<<<<<<< HEAD
    }
=======
<<<<<<< HEAD
    }
=======
    }      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the format of the output instances. This should only be called after
   * input() or batchFinished() has returned true. The relation name of the
   * output instances should be changed to reflect the action of the filter (eg:
   * add the filter name and options).
   * 
   * @return an Instances object containing the output instance structure only.
   * @throws NullPointerException if no input structure has been defined (or the
   *           output format hasn't been determined yet)
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Gets the format of the output instances. This should only be called
   * after input() or batchFinished() has returned true. The relation
   * name of the output instances should be changed to reflect the
   * action of the filter (eg: add the filter name and options).
   *
   * @return an Instances object containing the output instance
   * structure only.
   * @throws NullPointerException if no input structure has been
   * defined (or the output format hasn't been determined yet) 
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instances getOutputFormat() {

    if (m_IgnoreClass) {
      outputFormatPeek().setClassIndex(m_ClassIndex);
    }
    return super.getOutputFormat();
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
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String ignoreClassTipText() {
    return "The class index will be unset temporarily before the filter is applied.";
  }

  /**
<<<<<<< HEAD
   * Set the IgnoreClass value. Set this to true if the class index is to be
   * unset before the filter is applied.
=======
<<<<<<< HEAD
   * Set the IgnoreClass value. Set this to true if the class index is to be
   * unset before the filter is applied.
=======
   * Set the IgnoreClass value. Set this to true if the
   * class index is to be unset before the filter is applied.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newIgnoreClass The new IgnoreClass value.
   */
  public void setIgnoreClass(boolean newIgnoreClass) {
    m_IgnoreClass = newIgnoreClass;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the IgnoreClass value. If this to true then the class index is to
   * unset before the filter is applied.
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets the IgnoreClass value. If this to true then the
   * class index is to unset before the filter is applied.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the current IgnoreClass value.
   */
  public boolean getIgnoreClass() {
    return m_IgnoreClass;
  }
}
