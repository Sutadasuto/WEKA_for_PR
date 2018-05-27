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
 * Javadoc.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012,2015 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012,2015 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Abstract superclass for classes that generate Javadoc comments and replace
 * the content between certain comment tags.
 * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 11734 $
 */
public abstract class Javadoc implements OptionHandler, RevisionHandler {
<<<<<<< HEAD
=======
=======
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.6 $
 */
public abstract class Javadoc 
  implements OptionHandler, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the start tag */
  protected String[] m_StartTag = null;

  /** the end tag */
  protected String[] m_EndTag = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the classname */
  protected String m_Classname = Javadoc.class.getName();

<<<<<<< HEAD
=======
=======
  
  /** the classname */
  protected String m_Classname = Javadoc.class.getName();
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** whether to include the stars in the Javadoc */
  protected boolean m_UseStars = true;

  /** the directory above the class to update */
  protected String m_Dir = "";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** whether to suppress error messages (no printout in the console) */
  protected boolean m_Silent = false;

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tThe class to load.", "W", 1,
      "-W <classname>"));

    result.addElement(new Option("\tSuppresses the '*' in the Javadoc.",
      "nostars", 0, "-nostars"));

    result.addElement(new Option(
      "\tThe directory above the package hierarchy of the class.", "dir", 1,
      "-dir <dir>"));

    result.addElement(new Option("\tSuppresses printing in the console.",
      "silent", 0, "-silent"));

    return result.elements();
  }

  /**
   * Parses a given list of options.
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() > 0) {
      setClassname(tmpStr);
    } else {
      setClassname(this.getClass().getName());
    }
<<<<<<< HEAD
=======
=======
  
  /** whether to suppress error messages (no printout in the console) */
  protected boolean m_Silent = false;
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
        "\tThe class to load.",
        "W", 1, "-W <classname>"));
    
    result.addElement(new Option(
        "\tSuppresses the '*' in the Javadoc.",
        "nostars", 0, "-nostars"));
    
    result.addElement(new Option(
        "\tThe directory above the package hierarchy of the class.",
        "dir", 1, "-dir <dir>"));
    
    result.addElement(new Option(
        "\tSuppresses printing in the console.",
        "silent", 0, "-silent"));
    
    return result.elements();
  }
  
  /**
   * Parses a given list of options. 
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String      		tmpStr;
    
    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() > 0)
      setClassname(tmpStr);
    else
      setClassname(this.getClass().getName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setUseStars(!Utils.getFlag("nostars", options));

    setDir(Utils.getOption("dir", options));

    setSilent(Utils.getFlag("silent", options));
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the current settings of this object.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result;

    result = new Vector<String>();

    result.add("-W");
    result.add(getClassname());

    if (!getUseStars()) {
      result.add("-nostars");
    }

<<<<<<< HEAD
=======
=======
  
  /**
   * Gets the current settings of this object.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector 	result;

    result = new Vector();
    
    result.add("-W");
    result.add(getClassname());
    
    if (!getUseStars())
      result.add("-nostars");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (getDir().length() != 0) {
      result.add("-dir");
      result.add(getDir());
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (getSilent()) {
      result.add("-silent");
    }

    return result.toArray(new String[result.size()]);
  }

  /**
   * sets the classname of the class to generate the Javadoc for
   * 
   * @param value the new classname
<<<<<<< HEAD
=======
=======
    
    if (getSilent())
      result.add("-silent");
    
    return (String[]) result.toArray(new String[result.size()]);
  }
  
  /**
   * sets the classname of the class to generate the Javadoc for
   * 
   * @param value	the new classname
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setClassname(String value) {
    m_Classname = value;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * returns the current classname
   * 
   * @return the current classname
<<<<<<< HEAD
=======
=======
  
  /**
   * returns the current classname
   * 
   * @return	the current classname
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getClassname() {
    return m_Classname;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * sets whether to prefix the Javadoc with "*"
   * 
   * @param value true if stars are used
<<<<<<< HEAD
=======
=======
  
  /**
   * sets whether to prefix the Javadoc with "*"
   * 
   * @param value	true if stars are used
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setUseStars(boolean value) {
    m_UseStars = value;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * whether the Javadoc is prefixed with "*"
   * 
   * @return whether stars are used
<<<<<<< HEAD
=======
=======
  
  /**
   * whether the Javadoc is prefixed with "*"
   * 
   * @return 		whether stars are used
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getUseStars() {
    return m_UseStars;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * sets the dir containing the file that is to be updated. It is the dir above
   * the package hierarchy of the class.
   * 
   * @param value the directory containing the classes
<<<<<<< HEAD
=======
=======
  
  /**
   * sets the dir containing the file that is to be updated. It is the dir
   * above the package hierarchy of the class.
   * 
   * @param value	the directory containing the classes
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setDir(String value) {
    m_Dir = value;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * returns the current dir containing the class to update. It is the dir above
   * the package name of the class.
   * 
   * @return the current directory
<<<<<<< HEAD
=======
=======
  
  /**
   * returns the current dir containing the class to update. It is the dir
   * above the package name of the class.
   * 
   * @return		the  current directory
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getDir() {
    return m_Dir;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * sets whether to suppress output in the console
   * 
   * @param value true if output is to be suppressed
<<<<<<< HEAD
=======
=======
  
  /**
   * sets whether to suppress output in the console
   * 
   * @param value	true if output is to be suppressed
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setSilent(boolean value) {
    m_Silent = value;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * whether output in the console is suppressed
   * 
   * @return true if output is suppressed
<<<<<<< HEAD
=======
=======
  
  /**
   * whether output in the console is suppressed
   * 
   * @return 		true if output is suppressed
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getSilent() {
    return m_Silent;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * prints the given object to System.err
   * 
   * @param o the object to print
   */
  protected void println(Object o) {
    if (!getSilent()) {
      System.err.println(o.toString());
    }
<<<<<<< HEAD
=======
=======
  
  /**
   * prints the given object to System.err
   * 
   * @param o		the object to print
   */
  protected void println(Object o) {
    if (!getSilent())
      System.err.println(o.toString());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns true if the class can be instantiated, i.e., has a default
   * constructor.
   * 
   * @return true if the class can be instantiated
   */
  protected boolean canInstantiateClass() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    boolean result;
    Class<?> cls;

    result = true;
    cls = null;

    try {
      cls = Class.forName(getClassname());
    } catch (Exception e) {
      result = false;
      println("Cannot instantiate '" + getClassname()
        + "'! Class in CLASSPATH?");
<<<<<<< HEAD
=======
=======
    boolean	result;
    Class	cls;

    result = true;
    cls    = null;

    try {
      cls = Class.forName(getClassname());
    }
    catch (Exception e) {
      result = false;
      println("Cannot instantiate '" + getClassname() + "'! Class in CLASSPATH?");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    if (result) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        cls.newInstance();
      } catch (Exception e) {
        result = false;
        println("Cannot instantiate '" + getClassname()
          + "'! Missing default constructor?");
      }
    }

    return result;
  }

<<<<<<< HEAD
=======
=======
	cls.newInstance();
      }
      catch (Exception e) {
	result = false;
	println("Cannot instantiate '" + getClassname() + "'! Missing default constructor?");
      }
    }
    
    return result;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns a new instance of the class
   * 
   * @return a new instance of the class
   */
  protected Object getInstance() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Object result;
    Class<?> cls;

    result = null;

    try {
      cls = Class.forName(getClassname());
      result = cls.newInstance();
    } catch (Exception e) {
      result = null;
    }

    return result;
  }

<<<<<<< HEAD
=======
=======
    Object	result;
    Class	cls;

    result = null;
    
    try {
      cls    = Class.forName(getClassname());
      result = cls.newInstance();
    }
    catch (Exception e) {
      result = null;
    }
    
    return result;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * converts the given String into HTML, i.e., replacing some char entities
   * with HTML entities.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param s the string to convert
   * @return the HTML conform string
   */
  protected String toHTML(String s) {
    String result;

    result = s;

<<<<<<< HEAD
=======
=======
   * @param s		the string to convert
   * @return		the HTML conform string
   */
  protected String toHTML(String s) {
    String	result;
    
    result = s;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result = result.replaceAll("&", "&amp;");
    result = result.replaceAll("<", "&lt;");
    result = result.replaceAll(">", "&gt;");
    result = result.replaceAll("@", "&#64;");
<<<<<<< HEAD
    result = result.replaceAll("\n", "<br>\n");

=======
<<<<<<< HEAD
    result = result.replaceAll("\n", "<br>\n");

=======
    result = result.replaceAll("\n", "<br/>\n");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * indents the given string by a given number of indention strings
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param content the string to indent
   * @param count the number of times to indent one line
   * @param indentStr the indention string
   * @return the indented content
   */
  protected String indent(String content, int count, String indentStr) {
    String result;
    StringTokenizer tok;
    int i;

<<<<<<< HEAD
=======
=======
   * @param content	the string to indent
   * @param count	the number of times to indent one line
   * @param indentStr	the indention string
   * @return		the indented content
   */
  protected String indent(String content, int count, String indentStr) {
    String		result;
    StringTokenizer	tok;
    int			i;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    tok = new StringTokenizer(content, "\n", true);
    result = "";
    while (tok.hasMoreTokens()) {
      if (result.endsWith("\n") || (result.length() == 0)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        for (i = 0; i < count; i++) {
          result += indentStr;
        }
      }
      result += tok.nextToken();
    }

    return result;
  }

  /**
   * generates and returns the Javadoc for the specified start/end tag pair.
   * 
   * @param index the index in the start/end tag array
   * @return the generated Javadoc
   * @throws Exception in case the generation fails
   */
  protected abstract String generateJavadoc(int index) throws Exception;

  /**
   * generates and returns the Javadoc
   * 
   * @return the generated Javadoc
   * @throws Exception in case the generation fails
   */
  protected String generateJavadoc() throws Exception {
    String result;
    int i;

    result = "";

    for (i = 0; i < m_StartTag.length; i++) {
      if (i > 0) {
        result += "\n\n";
      }
      result += generateJavadoc(i).trim();
    }

<<<<<<< HEAD
=======
=======
	for (i = 0; i < count; i++)
	  result += indentStr;
      }
      result += tok.nextToken();
    }
    
    return result;
  }
  
  /**
   * generates and returns the Javadoc for the specified start/end tag pair.
   * 
   * @param index	the index in the start/end tag array
   * @return		the generated Javadoc
   * @throws Exception 	in case the generation fails
   */
  protected abstract String generateJavadoc(int index) throws Exception;
  
  /**
   * generates and returns the Javadoc
   * 
   * @return		the generated Javadoc
   * @throws Exception 	in case the generation fails
   */
  protected String generateJavadoc() throws Exception {
    String	result;
    int		i;
    
    result = "";
    
    for (i = 0; i < m_StartTag.length; i++) {
      if (i > 0)
	result += "\n\n";
      result += generateJavadoc(i).trim();
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * determines the base string of the given indention string, whether it's
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * either only spaces (one space will be retured) or mixed mode (tabs and
   * spaces, in that case the same string will be returned)
   * 
   * @param str the string to analyze
   * @return the indention string
   */
  protected String getIndentionString(String str) {
    String result;

    // only spaces?
    if (str.replaceAll(" ", "").length() == 0) {
      result = " ";
    } else if (str.replaceAll("\t", "").length() == 0) {
      result = "\t";
    } else {
      result = str;
    }

    return result;
  }

<<<<<<< HEAD
=======
=======
   * either only spaces (one space will be retured) or mixed mode (tabs and 
   * spaces, in that case the same string will be returned)
   * 
   * @param str		the string to analyze
   * @return 		the indention string
   */
  protected String getIndentionString(String str) {
    String	result;
    
    // only spaces?
    if (str.replaceAll(" ", "").length() == 0)
      result = " ";
    // only tabs?
    else if (str.replaceAll("\t", "").length() == 0)
      result = "\t";
    else
      result = str;
      
    return result;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * determines the number of indention strings that have to be inserted to
   * generated the given indention string.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param str the string to analyze
   * @return the number of base indention strings to insert
   */
  protected int getIndentionLength(String str) {
    int result;

    // only spaces?
    if (str.replaceAll(" ", "").length() == 0) {
      result = str.length();
    } else if (str.replaceAll("\t", "").length() == 0) {
      result = str.length();
    } else {
      result = 1;
    }

    return result;
  }

  /**
   * generates and returns the Javadoc for the specified start/end tag pair
   * 
   * @param content the current source code
   * @param index the index in the start/end tag array
   * @return the generated Javadoc
   * @throws Exception in case the generation fails
   */
  protected String updateJavadoc(String content, int index) throws Exception {
    StringBuffer resultBuf;
    int indentionLen;
    String indentionStr;
    String part;
    String tmpStr;

    // start and end tag?
    if ((content.indexOf(m_StartTag[index]) == -1)
      || (content.indexOf(m_EndTag[index]) == -1)) {
      println("No start and/or end tags found: " + m_StartTag[index] + "/"
        + m_EndTag[index]);
      return content;
<<<<<<< HEAD
=======
=======
   * @param str 	the string to analyze
   * @return		the number of base indention strings to insert
   */
  protected int getIndentionLength(String str) {
    int		result;
    
    // only spaces?
    if (str.replaceAll(" ", "").length() == 0)
      result = str.length();
    // only tabs?
    else if (str.replaceAll("\t", "").length() == 0)
      result = str.length();
    else
      result = 1;
    
    return result;
  }
  
  /**
   * generates and returns the Javadoc for the specified start/end tag pair
   * 
   * @param content	the current source code
   * @param index	the index in the start/end tag array
   * @return		the generated Javadoc
   * @throws Exception 	in case the generation fails
   */
  protected String updateJavadoc(String content, int index) throws Exception {
    StringBuffer	resultBuf;
    int			indentionLen;
    String		indentionStr;
    String		part;
    String		tmpStr;

    // start and end tag?
    if (    (content.indexOf(m_StartTag[index]) == -1)
	   || (content.indexOf(m_EndTag[index]) == -1) ) {
	println(
	    "No start and/or end tags found: " 
	    + m_StartTag[index] + "/" + m_EndTag[index]);
	return content;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // replace option-tags
    resultBuf = new StringBuffer();
    while (content.length() > 0) {
      if (content.indexOf(m_StartTag[index]) > -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        part = content.substring(0, content.indexOf(m_StartTag[index]));
        // is it a Java constant? -> skip
        if (part.endsWith("\"")) {
          resultBuf.append(part);
          resultBuf.append(m_StartTag[index]);
          content = content.substring(part.length()
            + m_StartTag[index].length());
        } else {
          tmpStr = part.substring(part.lastIndexOf("\n") + 1);
          indentionLen = getIndentionLength(tmpStr);
          indentionStr = getIndentionString(tmpStr);
          part = part.substring(0, part.lastIndexOf("\n") + 1);
          resultBuf.append(part);
          resultBuf
            .append(indent(m_StartTag[index], indentionLen, indentionStr)
              + "\n");
          resultBuf.append(indent(generateJavadoc(index), indentionLen,
            indentionStr));
          resultBuf.append(indent(m_EndTag[index], indentionLen, indentionStr));
          content = content.substring(content.indexOf(m_EndTag[index]));
          content = content.substring(m_EndTag[index].length());
        }
      } else {
        resultBuf.append(content);
        content = "";
      }
    }

    return resultBuf.toString().trim();
  }

  /**
   * updates the Javadoc in the given source code.
   * 
   * @param content the source code
   * @return the updated source code
   * @throws Exception in case the generation fails
   */
  protected String updateJavadoc(String content) throws Exception {
    String result;
    int i;

    result = content;

    for (i = 0; i < m_StartTag.length; i++) {
      result = updateJavadoc(result, i);
    }

    return result;
  }

  /**
   * generates the Javadoc and returns it applied to the source file if one was
   * provided, otherwise an empty string.
   * 
   * @return the generated Javadoc
   * @throws Exception in case the generation fails
   */
  public String updateJavadoc() throws Exception {
    StringBuffer contentBuf;
    BufferedReader reader;
    String line;
    String result;
    File file;

    result = "";

    // non-existing?
    file = new File(getDir() + "/" + getClassname().replaceAll("\\.", "/")
      + ".java");
<<<<<<< HEAD
=======
=======
	part = content.substring(0, content.indexOf(m_StartTag[index]));
	// is it a Java constant? -> skip
	if (part.endsWith("\"")) {
	  resultBuf.append(part);
	  resultBuf.append(m_StartTag[index]);
	  content = content.substring(part.length() + m_StartTag[index].length());
	}
	else {
	  tmpStr       = part.substring(part.lastIndexOf("\n") + 1);
	  indentionLen = getIndentionLength(tmpStr);
	  indentionStr = getIndentionString(tmpStr);
	  part         = part.substring(0, part.lastIndexOf("\n") + 1);
	  resultBuf.append(part);
	  resultBuf.append(indent(m_StartTag[index], indentionLen, indentionStr) + "\n");
	  resultBuf.append(indent(generateJavadoc(index), indentionLen, indentionStr));
	  resultBuf.append(indent(m_EndTag[index], indentionLen, indentionStr));
	  content = content.substring(content.indexOf(m_EndTag[index]));
	  content = content.substring(m_EndTag[index].length());
	}
      }
      else {
	resultBuf.append(content);
	content = "";
      }
    }
    
    return resultBuf.toString().trim();
  }
  
  /**
   * updates the Javadoc in the given source code.
   * 
   * @param content	the source code
   * @return		the updated source code
   * @throws Exception 	in case the generation fails
   */
  protected String updateJavadoc(String content) throws Exception {
    String	result;
    int		i;
    
    result = content;
    
    for (i = 0; i < m_StartTag.length; i++) {
      result = updateJavadoc(result, i);
    }
    
    return result;
  }
  
  /**
   * generates the Javadoc and returns it applied to the source file if one
   * was provided, otherwise an empty string.
   * 
   * @return		the generated Javadoc
   * @throws Exception 	in case the generation fails
   */
  public String updateJavadoc() throws Exception {
    StringBuffer	contentBuf;
    BufferedReader	reader;
    String		line;
    String		result;
    File		file;
    
    result = "";
    
    // non-existing?
    file = new File(getDir() + "/" + getClassname().replaceAll("\\.", "/") + ".java");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (!file.exists()) {
      println("File '" + file.getAbsolutePath() + "' doesn't exist!");
      return result;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    try {
      // load file
      reader = new BufferedReader(new FileReader(file));
      contentBuf = new StringBuffer();
      while ((line = reader.readLine()) != null) {
        contentBuf.append(line + "\n");
      }
      reader.close();
      result = updateJavadoc(contentBuf.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }

    return result.trim();
  }

  /**
   * generates either the plain Javadoc (if no filename specified) or the
   * updated file (if a filename is specified). The start and end tag for the
   * global info have to be specified in the file in the latter case.
   * 
   * @return either the plain Javadoc or the modified file
   * @throws Exception in case the generation fails
   */
  public String generate() throws Exception {
    if (getDir().length() == 0) {
      return generateJavadoc();
    } else {
      return updateJavadoc();
    }
  }

  /**
   * generates a string to print as help on the console
   * 
   * @return the generated help
   */
  public String generateHelp() {
    String result;
    Enumeration<Option> enm;
    Option option;

    result = getClass().getName().replaceAll(".*\\.", "") + " Options:\n\n";
    enm = listOptions();
    while (enm.hasMoreElements()) {
      option = enm.nextElement();
      result += option.synopsis() + "\n" + option.description() + "\n";
    }

    return result;
  }

  /**
   * runs the javadoc producer with the given commandline options
   * 
   * @param javadoc the javadoc producer to execute
   * @param options the commandline options
<<<<<<< HEAD
=======
=======
    
    try {
      // load file
      reader     = new BufferedReader(new FileReader(file));
      contentBuf = new StringBuffer();
      while ((line = reader.readLine()) != null) {
	contentBuf.append(line + "\n");
      }
      reader.close();
      result = updateJavadoc(contentBuf.toString());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    return result.trim();
  }
  
  /**
   * generates either the plain Javadoc (if no filename specified) or the
   * updated file (if a filename is specified). The start and end tag for
   * the global info have to be specified in the file in the latter case.
   * 
   * @return 		either the plain Javadoc or the modified file
   * @throws Exception 	in case the generation fails
   */
  public String generate() throws Exception {
    if (getDir().length() == 0)
      return generateJavadoc();
    else
      return updateJavadoc();
  }
  
  /**
   * generates a string to print as help on the console
   * 
   * @return 	the generated help
   */
  public String generateHelp() {
    String 		result;
    Enumeration 	enm;
    Option 		option;
    
    result = getClass().getName().replaceAll(".*\\.", "") + " Options:\n\n";
    enm = listOptions();
    while (enm.hasMoreElements()) {
      option = (Option) enm.nextElement();
      result += option.synopsis() + "\n" + option.description() + "\n";
    }
    
    return result;
  }
  
  /**
   * runs the javadoc producer with the given commandline options
   * 
   * @param javadoc	the javadoc producer to execute
   * @param options	the commandline options
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected static void runJavadoc(Javadoc javadoc, String[] options) {
    try {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (Utils.getFlag('h', options)) {
          throw new Exception("Help requested");
        }

        javadoc.setOptions(options);
        Utils.checkForRemainingOptions(options);

        // directory is necessary!
        if (javadoc.getDir().length() == 0) {
          throw new Exception("No directory provided!");
        }
      } catch (Exception ex) {
        String result = "\n" + ex.getMessage() + "\n\n"
          + javadoc.generateHelp();
<<<<<<< HEAD
=======
=======
	if (Utils.getFlag('h', options))
	  throw new Exception("Help requested");

	javadoc.setOptions(options);
        Utils.checkForRemainingOptions(options);

        // directory is necessary!
        if (javadoc.getDir().length() == 0)
          throw new Exception("No directory provided!");
      } 
      catch (Exception ex) {
        String result = "\n" + ex.getMessage() + "\n\n" + javadoc.generateHelp();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        throw new Exception(result);
      }

      System.out.println(javadoc.generate() + "\n");
<<<<<<< HEAD
    } catch (Exception ex) {
=======
<<<<<<< HEAD
    } catch (Exception ex) {
=======
    } 
    catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.println(ex.getMessage());
    }
  }
}
