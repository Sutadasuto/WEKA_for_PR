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
 * Stemming.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.core.stemmers;

<<<<<<< HEAD
=======
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * A helper class for using the stemmers. Run with option '-h' to list all the
 * available options.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public class Stemming implements RevisionHandler {

  /**
   * lists all the options on the command line
   * 
   * @param stemmer the stemmer to list the parameters for
   * @return the option string
   */
  protected static String makeOptionsString(Stemmer stemmer) {
    Vector<Option> options = new Vector<Option>();

    // general options
    options.add(new Option("\tDisplays this help.", "h", 0, "-h"));

    options
      .add(new Option("\tThe file to process.", "i", 1, "-i <input-file>"));

    options.add(new Option(
      "\tThe file to output the processed data to (default stdout).", "o", 1,
      "-o <output-file>"));

    options.add(new Option("\tUses lowercase strings.", "l", 0, "-l"));

    // stemmer options?
    if (stemmer instanceof OptionHandler) {
      options.addAll(Collections.list(((OptionHandler) stemmer).listOptions()));

    }

    // print options
    StringBuffer result = new StringBuffer();
    result.append("\nStemmer options:\n\n");
    Enumeration<Option> enm = options.elements();
    while (enm.hasMoreElements()) {
      Option option = enm.nextElement();
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 * A helper class for using the stemmers. Run with option '-h' to list
 * all the available options.
 *
 * @author  FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.3 $
 */
public class Stemming
  implements RevisionHandler {

  /**
   * lists all the options on the command line
   *
   * @param stemmer     the stemmer to list the parameters for
   * @return 		the option string
   */
  protected static String makeOptionsString(Stemmer stemmer) {
    Vector          options;
    Enumeration     enm;
    StringBuffer    result;

    options = new Vector();
    
    // general options
    options.add(
        new Option(
          "\tDisplays this help.",
          "h", 0, "-h"));

    options.add(
        new Option(
          "\tThe file to process.",
          "i", 1, "-i <input-file>"));

    options.add(
        new Option(
          "\tThe file to output the processed data to (default stdout).",
          "o", 1, "-o <output-file>"));

    options.add(
        new Option(
          "\tUses lowercase strings.",
          "l", 0, "-l"));

    // stemmer options?
    if (stemmer instanceof OptionHandler) {
      enm = ((OptionHandler) stemmer).listOptions();
      while (enm.hasMoreElements())
        options.add(enm.nextElement());
    }

    // print options
    result = new StringBuffer();
    result.append("\nStemmer options:\n\n");
    enm = options.elements();
    while (enm.hasMoreElements()) {
      Option option = (Option) enm.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      result.append(option.synopsis() + "\n");
      result.append(option.description() + "\n");
    }

    return result.toString();
  }
<<<<<<< HEAD

  /**
   * Applies the given stemmer according to the given options. '-h' lists all
   * the available options for the given stemmer.
   * 
   * @param stemmer the stemmer to use
   * @param options the options for the stemmer
   * @throws Exception if something goes wrong
   */
  public static void useStemmer(Stemmer stemmer, String[] options)
    throws Exception {

    Reader reader;
    StringBuffer input;
    Writer output;
    String tmpStr;
    boolean lowerCase;

=======
  
  /**
   * Applies the given stemmer according to the given options. '-h' lists
   * all the available options for the given stemmer.
   *
   * @param stemmer     the stemmer to use
   * @param options     the options for the stemmer
   * @throws Exception	if something goes wrong
   */
  public static void useStemmer(Stemmer stemmer, String[] options) 
    throws Exception {

    Reader          reader;
    StringBuffer    input;
    Writer          output;
    String          tmpStr;
    boolean         lowerCase;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // help?
    if (Utils.getFlag('h', options)) {
      System.out.println(makeOptionsString(stemmer));
      return;
    }

    // input file
    tmpStr = Utils.getOption('i', options);
<<<<<<< HEAD
    if (tmpStr.length() == 0) {
      throw new IllegalArgumentException("No input file defined!"
        + makeOptionsString(stemmer));
    } else {
      reader = new BufferedReader(new InputStreamReader(new FileInputStream(
        tmpStr)));
    }
=======
    if (tmpStr.length() == 0)
      throw new IllegalArgumentException(
          "No input file defined!" + makeOptionsString(stemmer));
    else
      reader = new BufferedReader(
                  new InputStreamReader(new FileInputStream(tmpStr)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    input = new StringBuffer();

    // output file?
    tmpStr = Utils.getOption('o', options);
<<<<<<< HEAD
    if (tmpStr.length() == 0) {
      output = new BufferedWriter(new OutputStreamWriter(System.out));
    } else {
      output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
        tmpStr)));
    }
=======
    if (tmpStr.length() == 0)
      output = new BufferedWriter(
                  new OutputStreamWriter(System.out));
    else
      output = new BufferedWriter(
                  new OutputStreamWriter(new FileOutputStream(tmpStr)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // lowercase?
    lowerCase = Utils.getFlag('l', options);

    // stemmer options
<<<<<<< HEAD
    if (stemmer instanceof OptionHandler) {
      ((OptionHandler) stemmer).setOptions(options);
    }

    // unknown options?
    try {
      Utils.checkForRemainingOptions(options);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(makeOptionsString(stemmer));
      reader.close();
      return;
    }

=======
    if (stemmer instanceof OptionHandler)
      ((OptionHandler) stemmer).setOptions(options);
    
    // unknown options?
    try {
      Utils.checkForRemainingOptions(options);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(makeOptionsString(stemmer));
      return;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // process file
    int character;
    while ((character = reader.read()) != -1) {
      char ch = (char) character;
<<<<<<< HEAD
      if (Character.isWhitespace(ch)) {
=======
      if (Character.isWhitespace((char) ch)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (input.length() > 0) {
          output.write(stemmer.stem(input.toString()));
          input = new StringBuffer();
        }
        output.write(ch);
<<<<<<< HEAD
      } else {
        if (lowerCase) {
          input.append(Character.toLowerCase(ch));
        } else {
          input.append(ch);
        }
      }
    }
    output.flush();
    reader.close();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
=======
      } 
      else {
        if (lowerCase)
          input.append(Character.toLowerCase(ch));
        else
          input.append(ch);
      }
    }
    output.flush();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.3 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
