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
 * DelimitedTokenizer.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.core.tokenizers;

<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Option;
import weka.core.Utils;

/**
 * Abstract superclass for tokenizers that take characters as delimiters.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public abstract class CharacterDelimitedTokenizer extends Tokenizer {

  /** Added to prevent warning */
  private static final long serialVersionUID = -3091468793633408477L;

  /** Delimiters used in tokenization */
  protected String m_Delimiters = " \r\n\t.,;:'\"()?!";

  /**
   * Returns an enumeration of all the available options..
   * 
   * @return an enumeration of all available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tThe delimiters to use\n"
      + "\t(default ' \\r\\n\\t.,;:'\"()?!').", "delimiters", 1,
      "-delimiters <value>"));

    return result.elements();
  }

  /**
   * Gets the current option settings for the OptionHandler.
   * 
   * @return the list of current option settings as an array of strings
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    result.add("-delimiters");
    result.add(getDelimiters());

=======
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Abstract superclass for tokenizers that take characters as delimiters.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.3 $
 */
public abstract class CharacterDelimitedTokenizer
  extends Tokenizer {

  /** Delimiters used in tokenization */
  protected String m_Delimiters = " \r\n\t.,;:'\"()?!";
  
  /**
   * Returns an enumeration of all the available options..
   *
   * @return 		an enumeration of all available options.
   */
  public Enumeration listOptions() {
    Vector	result;
    
    result = new Vector();
    
    result.addElement(new Option(
        "\tThe delimiters to use\n"
	+ "\t(default ' \\r\\n\\t.,;:'\"()?!').",
        "delimiters", 1, "-delimiters <value>"));
    
    return result.elements();
  }
  
  /**
   * Gets the current option settings for the OptionHandler.
   *
   * @return 		the list of current option settings as an array of 
   * 			strings
   */
  public String[] getOptions() {
    Vector<String>	result;
    
    result = new Vector<String>();
    
    result.add("-delimiters");
    result.add(getDelimiters());
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result.toArray(new String[result.size()]);
  }

  /**
<<<<<<< HEAD
   * Sets the OptionHandler's options using the given list. All options will be
   * set (or reset) during this call (i.e. incremental setting of options is not
   * possible).
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    String tmpStr = Utils.getOption("delimiters", options);
    if (tmpStr.length() != 0) {
      setDelimiters(tmpStr);
    } else {
      setDelimiters(" \r\n\t.,;:'\"()?!");
    }
=======
   * Sets the OptionHandler's options using the given list. All options
   * will be set (or reset) during this call (i.e. incremental setting
   * of options is not possible).
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption("delimiters", options);
    if (tmpStr.length() != 0)
      setDelimiters(tmpStr);
    else
      setDelimiters(" \r\n\t.,;:'\"()?!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Get the value of delimiters (not backquoted).
<<<<<<< HEAD
   * 
   * @return Value of delimiters.
=======
   *
   * @return 		Value of delimiters.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String getDelimiters() {
    return m_Delimiters;
  }
<<<<<<< HEAD

  /**
   * Set the value of delimiters. For convenienve, the strings "\r", "\n", "\t",
   * "\'", "\\" get automatically translated into their character
   * representations '\r', '\n', '\t', '\'', '\\'. This means, one can either
   * use <code>setDelimiters("\r\n\t\\");</code> or
   * <code>setDelimiters("\\r\\n\\t\\\\");</code>.
   * 
   * @param value Value to assign to delimiters.
   * @see Utils#unbackQuoteChars(String)
=======
    
  /**
   * Set the value of delimiters. For convenienve, the strings 
   * "\r", "\n", "\t", "\'", "\\" get automatically translated into their 
   * character representations '\r', '\n', '\t', '\'', '\\'. This means, one 
   * can either use <code>setDelimiters("\r\n\t\\");</code> or 
   * <code>setDelimiters("\\r\\n\\t\\\\");</code>.
   *
   * @param value 	Value to assign to delimiters.
   * @see 		Utils#unbackQuoteChars(String)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setDelimiters(String value) {
    m_Delimiters = Utils.unbackQuoteChars(value);
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String delimitersTipText() {
    return "Set of delimiter characters to use in tokenizing (\\r, \\n and \\t can be used for carriage-return, line-feed and tab)";
  }
}
