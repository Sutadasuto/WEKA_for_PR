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
 * Tokenizer.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.core.tokenizers;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.OptionHandler;
import weka.core.RevisionHandler;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;

/**
 * A superclass for all tokenizer algorithms.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public abstract class Tokenizer implements Enumeration<String>, OptionHandler,
  Serializable, RevisionHandler {

  /** Added to avoid warning */
  private static final long serialVersionUID = 7781271062738973996L;

  /**
   * Returns a string describing the stemmer
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  public abstract String globalInfo();

  /**
   * Returns an enumeration of all the available options..
   * 
   * @return an enumeration of all available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    return (new Vector<Option>()).elements();
  }

  /**
   * Gets the current option settings for the OptionHandler.
   * 
   * @return the list of current option settings as an array of strings
   */
  @Override
<<<<<<< HEAD
=======
=======
/**
 * A superclass for all tokenizer algorithms.
 * 
 * @author  FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.3 $
 */
public abstract class Tokenizer
  implements Enumeration, OptionHandler, Serializable, RevisionHandler {
  
  /**
   * Returns a string describing the stemmer
   * 
   * @return 		a description suitable for displaying in the 
   * 			explorer/experimenter gui
   */
  public abstract String globalInfo();
    
  /**
   * Returns an enumeration of all the available options..
   *
   * @return 		an enumeration of all available options.
   */
  public Enumeration listOptions() {
    return (new Vector()).elements();
  }
  
  /**
   * Gets the current option settings for the OptionHandler.
   *
   * @return 		the list of current option settings as an array of 
   * 			strings
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String[] getOptions() {
    return new String[0];
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the OptionHandler's options using the given list. All options will be
   * set (or reset) during this call (i.e. incremental setting of options is not
   * possible).
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Sets the OptionHandler's options using the given list. All options
   * will be set (or reset) during this call (i.e. incremental setting
   * of options is not possible).
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setOptions(String[] options) throws Exception {
    // nothing in this class
  }

  /**
   * Tests if this enumeration contains more elements.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if and only if this enumeration object contains at least one
   *         more element to provide; false otherwise.
   */
  @Override
  public abstract boolean hasMoreElements();

  /**
   * Returns the next element of this enumeration if this enumeration object has
   * at least one more element to provide.
   * 
   * @return the next element of this enumeration.
   */
  @Override
  public abstract String nextElement();

  /**
   * Sets the string to tokenize. Tokenization happens immediately.
   * 
   * @param s the string to tokenize
   */
  public abstract void tokenize(String s);

  /**
   * initializes the given tokenizer with the given options and runs the
   * tokenizer over all the remaining strings in the options array. If no
   * strings remained in the option string then data is read from stdin, line by
   * line.
   * 
   * @param tokenizer the tokenizer to use
   * @param options the options for the tokenizer
   * @return the tokenized strings
   * @throws Exception if setting of options or tokenization fails
   */
  public static String[] tokenize(Tokenizer tokenizer, String[] options)
    throws Exception {
    Vector<String> result;
    Vector<String> tmpResult;
    Vector<String> data;
    int i;
    boolean processed;
    BufferedReader reader;
    String line;

    result = new Vector<String>();

<<<<<<< HEAD
=======
=======
   * @return 		true if and only if this enumeration object contains 
   * 			at least one more element to provide; false otherwise.
   */
  public abstract boolean hasMoreElements();

  /**
   * Returns the next element of this enumeration if this enumeration object 
   * has at least one more element to provide.
   * 
   * @return		the next element of this enumeration.
   */
  public abstract Object nextElement();
  
  /**
   * Sets the string to tokenize. Tokenization happens immediately.
   * 
   * @param s		the string to tokenize
   */
  public abstract void tokenize(String s);
  
  /**
   * initializes the given tokenizer with the given options and runs the
   * tokenizer over all the remaining strings in the options array. If no 
   * strings remained in the option string then data is read from stdin, line 
   * by line.
   * 
   * @param tokenizer	the tokenizer to use
   * @param options	the options for the tokenizer
   * @return		the tokenized strings
   * @throws Exception	if setting of options or tokenization fails
   */
  public static String[] tokenize(Tokenizer tokenizer, String[] options) throws Exception {
    Vector<String>	result;
    Vector<String>	tmpResult;
    Vector<String>	data;
    int			i;
    boolean		processed;
    BufferedReader	reader;
    String		line;
    
    result = new Vector<String>();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // init tokenizer
    tokenizer.setOptions(options);

    // for storing the data to process
    data = new Vector<String>();
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // run over all un-processed strings in the options array
    processed = false;
    for (i = 0; i < options.length; i++) {
      if (options[i].length() != 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        processed = true;
        data.add(options[i]);
      }
    }

<<<<<<< HEAD
=======
=======
	processed = true;
	data.add(options[i]);
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // if no strings in option string then read from stdin
    if (!processed) {
      reader = new BufferedReader(new InputStreamReader(System.in));
      while ((line = reader.readLine()) != null) {
<<<<<<< HEAD
        data.add(line);
=======
<<<<<<< HEAD
        data.add(line);
=======
	data.add(line);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    // process data
    for (i = 0; i < data.size(); i++) {
      tmpResult = new Vector<String>();
      tokenizer.tokenize(data.get(i));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      while (tokenizer.hasMoreElements()) {
        tmpResult.add(tokenizer.nextElement());
      }
      // add to result
      result.addAll(tmpResult);
    }

    return result.toArray(new String[result.size()]);
  }

  /**
   * initializes the given tokenizer with the given options and runs the
   * tokenizer over all the remaining strings in the options array. The
   * generated tokens are then printed to stdout. If no strings remained in the
   * option string then data is read from stdin, line by line.
   * 
   * @param tokenizer the tokenizer to use
   * @param options the options for the tokenizer
   */
  public static void runTokenizer(Tokenizer tokenizer, String[] options) {
    String[] result;
    int i;

    try {
      result = tokenize(tokenizer, options);
      for (i = 0; i < result.length; i++) {
        System.out.println(result[i]);
      }
    } catch (Exception e) {
<<<<<<< HEAD
=======
=======
      while (tokenizer.hasMoreElements())
	tmpResult.add((String) tokenizer.nextElement());
      // add to result
      result.addAll(tmpResult);
    }
    
    return result.toArray(new String[result.size()]);
  }
  
  /**
   * initializes the given tokenizer with the given options and runs the
   * tokenizer over all the remaining strings in the options array. The 
   * generated tokens are then printed to stdout. If no strings remained
   * in the option string then data is read from stdin, line by line.
   * 
   * @param tokenizer	the tokenizer to use
   * @param options	the options for the tokenizer
   */
  public static void runTokenizer(Tokenizer tokenizer, String[] options) {
    String[]	result;
    int		i;

    try {
      result = tokenize(tokenizer, options);
      for (i = 0; i < result.length; i++)
	System.out.println(result[i]);
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      e.printStackTrace();
    }
  }
}
