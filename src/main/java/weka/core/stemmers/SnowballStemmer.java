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
 * SnowballStemmer.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.core.stemmers;

import weka.core.ClassDiscovery;
import weka.core.Option;
import weka.core.OptionHandler;
<<<<<<< HEAD
import weka.core.PluginManager;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.WekaPackageClassLoaderManager;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * <!-- globalinfo-start --> A wrapper class for the Snowball stemmers. Only
 * available if the Snowball classes are in the classpath.<br/>
 * If the class discovery is not dynamic, i.e., the property 'UseDynamic' in the
 * props file 'weka/gui/GenericPropertiesCreator.props' is 'false', then the
 * property 'org.tartarus.snowball.SnowballProgram' in the
 * 'weka/gui/GenericObjectEditor.props' file has to be uncommented as well. If
 * necessary you have to discover and fill in the snowball stemmers manually.
 * You can use the 'weka.core.ClassDiscovery' for this:<br/>
 * java weka.core.ClassDiscovery org.tartarus.snowball.SnowballProgram
 * org.tartarus.snowball.ext<br/>
 * <br/>
 * For more information visit these web sites:<br/>
 * http://weka.wikispaces.com/Stemmers<br/>
 * http://snowball.tartarus.org/<br/>
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -S &lt;name&gt;
=======
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.gui.GenericObjectEditor;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * A wrapper class for the Snowball stemmers. Only available if the Snowball classes are in the classpath.<br/>
 * If the class discovery is not dynamic, i.e., the property 'UseDynamic' in the props file 'weka/gui/GenericPropertiesCreator.props' is 'false', then the property 'org.tartarus.snowball.SnowballProgram' in the 'weka/gui/GenericObjectEditor.props' file has to be uncommented as well. If necessary you have to discover and fill in the snowball stemmers manually. You can use the 'weka.core.ClassDiscovery' for this:<br/>
 *   java weka.core.ClassDiscovery org.tartarus.snowball.SnowballProgram org.tartarus.snowball.ext<br/>
 * <br/>
 * For more information visit these web sites:<br/>
 *   http://weka.wikispaces.com/Stemmers<br/>
 *   http://snowball.tartarus.org/<br/>
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -S &lt;name&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *  The name of the snowball stemmer (default 'porter').
 *  available stemmers:
 *     danish, dutch, english, finnish, french, german, italian, 
 *     norwegian, porter, portuguese, russian, spanish, swedish
 * </pre>
 * 
<<<<<<< HEAD
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14291 $
 */
public class SnowballStemmer implements Stemmer, OptionHandler {

  /** for serialization. */
  static final long serialVersionUID = -6111170431963015178L;

  /** the package name for snowball. */
  public final static String PACKAGE = "org.tartarus.snowball";

=======
 <!-- options-end -->
 *
 * @author    FracPete (fracpete at waikato dot ac dot nz)
 * @version   $Revision: 5836 $
 */
public class SnowballStemmer 
  implements Stemmer, OptionHandler {
  
  /** for serialization. */
  static final long serialVersionUID = -6111170431963015178L;
  
  /** the package name for snowball. */
  public final static String PACKAGE = "org.tartarus.snowball";
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** the package name where the stemmers are located. */
  public final static String PACKAGE_EXT = PACKAGE + ".ext";

  /** the snowball program, all stemmers are derived from. */
  protected final static String SNOWBALL_PROGRAM = PACKAGE + ".SnowballProgram";
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** whether the snowball stemmers are in the Classpath. */
  protected static boolean m_Present = false;

  /** contains the all the found stemmers (language names). */
<<<<<<< HEAD
  protected static Vector<String> m_Stemmers;
=======
  protected static Vector m_Stemmers;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** the current stemmer. */
  protected Object m_Stemmer;

  /** the stem method. */
  protected transient Method m_StemMethod;

  /** the setCurrent method. */
  protected transient Method m_SetCurrentMethod;

  /** the getCurrent method. */
  protected transient Method m_GetCurrentMethod;
<<<<<<< HEAD

=======
   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** check for Snowball statically (needs only to be done once) */
  static {
    checkForSnowball();
  }

  /**
   * initializes the stemmer ("porter").
   */
  public SnowballStemmer() {
    this("porter");
    initStemmers();
  }

  /**
   * initializes the stemmer with the given stemmer.
<<<<<<< HEAD
   * 
   * @param name the name of the stemmer
   */
  public SnowballStemmer(String name) {
    super();

=======
   *
   * @param name        the name of the stemmer
   */
  public SnowballStemmer(String name) {
    super();
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setStemmer(name);
  }

  /**
   * checks whether Snowball is present in the classpath.
   */
  private static void checkForSnowball() {
    try {
<<<<<<< HEAD
      WekaPackageClassLoaderManager.forName(SNOWBALL_PROGRAM);
      m_Present = true;
    } catch (Exception e) {
=======
      Class.forName(SNOWBALL_PROGRAM);
      m_Present = true;
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_Present = false;
    }
  }

  /**
   * Returns a string describing the stemmer.
   * 
<<<<<<< HEAD
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  public String globalInfo() {
    return "A wrapper class for the Snowball stemmers. Only available if the "
=======
   * @return a description suitable for
   *         displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "A wrapper class for the Snowball stemmers. Only available if the "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "Snowball classes are in the classpath.\n"
      + "If the class discovery is not dynamic, i.e., the property 'UseDynamic' "
      + "in the props file 'weka/gui/GenericPropertiesCreator.props' is 'false', "
      + "then the property 'org.tartarus.snowball.SnowballProgram' in the "
      + "'weka/gui/GenericObjectEditor.props' file has to be uncommented "
      + "as well. If necessary you have to discover and fill in the snowball "
      + "stemmers manually. You can use the 'weka.core.ClassDiscovery' for this:\n"
      + "  java weka.core.ClassDiscovery org.tartarus.snowball.SnowballProgram org.tartarus.snowball.ext\n"
<<<<<<< HEAD
      + "\n" + "For more information visit these web sites:\n"
      + "  http://weka.wikispaces.com/Stemmers\n"
      + "  http://snowball.tartarus.org/\n";
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tThe name of the snowball stemmer (default 'porter').\n"
        + "\tavailable stemmers:\n" + getStemmerList(65, "\t   "), "S", 1,
      "-S <name>"));

    return result.elements();
  }

  /**
   * Parses the options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -S &lt;name&gt;
=======
      + "\n"
      + "For more information visit these web sites:\n"
      + "  http://weka.wikispaces.com/Stemmers\n"
      + "  http://snowball.tartarus.org/\n";
  }
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector        result;
    
    result = new Vector();
    
    result.addElement(new Option(
        "\tThe name of the snowball stemmer (default 'porter').\n"
        + "\tavailable stemmers:\n" 
        + getStemmerList(65, "\t   "),
        "S", 1, "-S <name>"));
    
    return result.elements();
  }
  
  /**
   * Parses the options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -S &lt;name&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  The name of the snowball stemmer (default 'porter').
   *  available stemmers:
   *     danish, dutch, english, finnish, french, german, italian, 
   *     norwegian, porter, portuguese, russian, spanish, swedish
   * </pre>
   * 
<<<<<<< HEAD
   * <!-- options-end -->
   * 
   * @param options the options to parse
   * @throws Exception if parsing fails
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0) {
      setStemmer(tmpStr);
    } else {
      setStemmer("porter");
    }
  }

  /**
   * Gets the current settings of the classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result;

    result = new Vector<String>();

=======
   <!-- options-end -->
   *
   * @param options	the options to parse
   * @throws Exception 	if parsing fails
   */
  public void setOptions(String[] options) throws Exception {
    String      tmpStr;
    
    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0)
      setStemmer(tmpStr);
    else
      setStemmer("porter");
  }
  
  /**
   * Gets the current settings of the classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    
    result  = new Vector();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (getStemmer() != null) {
      result.add("-S");
      result.add("" + getStemmer());
    }
<<<<<<< HEAD

    return result.toArray(new String[result.size()]);
=======
    
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * extracts the stemmer name form the classname.
   * 
<<<<<<< HEAD
   * @param classname the full classname of the stemmer
   * @return the name of the stemmer
=======
   * @param classname     the full classname of the stemmer
   * @return              the name of the stemmer
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  private static String getStemmerName(String classname) {
    return classname.replaceAll(".*\\.", "").replaceAll("Stemmer$", "");
  }

  /**
   * returns the full classname of the stemmer.
<<<<<<< HEAD
   * 
   * @param name the name of the stemmer
   * @return the full classname of the stemmer
   * @see #PACKAGE_EXT
=======
   *
   * @param name          the name of the stemmer
   * @return              the full classname of the stemmer
   * @see                 #PACKAGE_EXT
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  private static String getStemmerClassname(String name) {
    return PACKAGE_EXT + "." + name + "Stemmer";
  }

  /**
   * retrieves the language names of the availabel stemmers.
   */
  private static void initStemmers() {
<<<<<<< HEAD
    List<String> classnames;
    int i;

    if (m_Stemmers != null) {
      return;
    }

    m_Stemmers = new Vector<String>();

    if (!m_Present) {
      return;
    }

    classnames = PluginManager.getPluginNamesOfTypeList(SNOWBALL_PROGRAM);
    // try dynamic discovery if not in props file
    if (classnames.size() == 0) {
      classnames = ClassDiscovery.find(SNOWBALL_PROGRAM, PACKAGE_EXT);
    }
    for (i = 0; i < classnames.size(); i++) {
      m_Stemmers.add(getStemmerName(classnames.get(i).toString()));
=======
    Vector        classnames;
    int           i;
    
    if (m_Stemmers != null)
      return;
    
    m_Stemmers = new Vector();
    
    if (!m_Present)
      return;

    classnames = GenericObjectEditor.getClassnames(SNOWBALL_PROGRAM);
    // try dynamic discovery if not in props file
    if (classnames.size() == 0) {
      classnames = ClassDiscovery.find(SNOWBALL_PROGRAM, PACKAGE_EXT);
      for (i = 0; i < classnames.size(); i++)
	m_Stemmers.add(getStemmerName(classnames.get(i).toString()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * returns whether Snowball is present or not, i.e. whether the classes are in
   * the classpath or not
   * 
=======
   * returns whether Snowball is present or not, i.e. whether the classes are
   * in the classpath or not
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return whether Snowball is available
   */
  public static boolean isPresent() {
    return m_Present;
  }

  /**
   * returns an enumeration over all currently stored stemmer names.
   * 
   * @return all available stemmers
   */
<<<<<<< HEAD
  public static Enumeration<String> listStemmers() {
    initStemmers();

=======
  public static Enumeration listStemmers() {
    initStemmers();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_Stemmers.elements();
  }

  /**
   * generates a comma list of the available stemmers.
   * 
<<<<<<< HEAD
   * @param lineLength the max line length, before a linefeed is inserted (0 is
   *          unlimited)
   * @param indention the indention of a line
   * @return the generated list
   */
  private static String getStemmerList(int lineLength, String indention) {
    String result;
    Enumeration<String> enm;
    String name;
    String line;

    result = "";
    line = "";
    enm = listStemmers();
    while (enm.hasMoreElements()) {
      name = enm.nextElement().toString();
      if (line.length() > 0) {
        line += ", ";
      }
      if ((lineLength > 0) && (line.length() + name.length() > lineLength)) {
        result += indention + line + "\n";
        line = "";
=======
   * @param lineLength    the max line length, before a linefeed is inserted
   *                      (0 is unlimited)
   * @param indention     the indention of a line
   * @return              the generated list
   */
  private static String getStemmerList(int lineLength, String indention) {
    String        result;
    Enumeration   enm;
    String        name;
    String        line;
    
    result = "";
    line   = "";
    enm    = listStemmers();
    while (enm.hasMoreElements()) {
      name = enm.nextElement().toString();
      if (line.length() > 0)
        line += ", ";
      if ( (lineLength > 0) && (line.length() + name.length() > lineLength) ) {
        result += indention + line + "\n";
        line    = "";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      line += name;
    }

<<<<<<< HEAD
    if (line.length() > 0) {
      result += indention + line + "\n";
    }

=======
    if (line.length() > 0)
      result += indention + line + "\n";
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * returns the name of the current stemmer, null if none is set.
   * 
   * @return the name of the stemmer
   */
  public String getStemmer() {
    initStemmers();
<<<<<<< HEAD

    if (m_Stemmer == null) {
      return null;
    } else {
      return getStemmerName(m_Stemmer.getClass().getName());
    }
=======
    
    if (m_Stemmer == null)
      return null;
    else
      return getStemmerName(m_Stemmer.getClass().getName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * sets the stemmer with the given name, e.g., "porter".
<<<<<<< HEAD
   * 
   * @param name the name of the stemmer, e.g., "porter"
   */
  public void setStemmer(String name) {
    Class<?> snowballClass;
    Class<?>[] argClasses;

    initStemmers();

    if (m_Stemmers.contains(name)) {
      try {
        // snowballClass = Class.forName(getStemmerClassname(name));
        snowballClass = WekaPackageClassLoaderManager.forName(getStemmerClassname(name));
        m_Stemmer = snowballClass.newInstance();

        // methods
        argClasses = new Class[0];
        m_StemMethod = snowballClass.getMethod("stem", argClasses);

        argClasses = new Class[1];
        argClasses[0] = String.class;
        m_SetCurrentMethod = snowballClass.getMethod("setCurrent", argClasses);

        argClasses = new Class[0];
        m_GetCurrentMethod = snowballClass.getMethod("getCurrent", argClasses);
      } catch (Exception e) {
        System.out.println("Error initializing stemmer '" + name + "'!"
          + e.getMessage());
        m_Stemmer = null;
      }
    } else {
=======
   *
   * @param name        the name of the stemmer, e.g., "porter"
   */
  public void setStemmer(String name) {
    Class       snowballClass;
    Class[]     argClasses;
    
    initStemmers();
    
    if (m_Stemmers.contains(name)) {
      try {
        snowballClass = Class.forName(getStemmerClassname(name));
        m_Stemmer     = snowballClass.newInstance();

        // methods
        argClasses         = new Class[0];
        m_StemMethod       = snowballClass.getMethod("stem", argClasses);
        
        argClasses         = new Class[1];
        argClasses[0]      = String.class;
        m_SetCurrentMethod = snowballClass.getMethod("setCurrent", argClasses);
        
        argClasses         = new Class[0];
        m_GetCurrentMethod = snowballClass.getMethod("getCurrent", argClasses);
      }
      catch (Exception e) {
        System.out.println(
              "Error initializing stemmer '" + name + "'!"
            + e.getMessage());
        m_Stemmer = null;
      }
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.err.println("Stemmer '" + name + "' unknown!");
      m_Stemmer = null;
    }
  }

  /**
   * Returns the tip text for this property.
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String stemmerTipText() {
    return "The Snowball stemmer to use, available: " + getStemmerList(0, "");
  }

  /**
   * Returns the word in its stemmed form.
<<<<<<< HEAD
   * 
   * @param word the unstemmed word
   * @return the stemmed word
   */
  @Override
  public String stem(String word) {
    String result;
    Object[] args;

    if (m_Stemmer == null) {
      result = new String(word);
    } else {
      // after de-serialization, the methods are null and need to be
      // re-initialized
      if (m_SetCurrentMethod == null) {
        setStemmer(getStemmer());
      }

      try {
        // set word
        args = new Object[1];
=======
   *
   * @param word      the unstemmed word
   * @return          the stemmed word
   */
  public String stem(String word) {
    String      result;
    Object[]    args;
    
    if (m_Stemmer == null) {
      result = new String(word);
    }
    else {
      // after de-serialization, the methods are null and need to be
      // re-initialized
      if (m_SetCurrentMethod == null)
	setStemmer(getStemmer());
      
      try {
        // set word
        args    = new Object[1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        args[0] = word;
        m_SetCurrentMethod.invoke(m_Stemmer, args);

        // stem word
        args = new Object[0];
        m_StemMethod.invoke(m_Stemmer, args);

        // get word
<<<<<<< HEAD
        args = new Object[0];
        result = (String) m_GetCurrentMethod.invoke(m_Stemmer, args);
      } catch (Exception e) {
=======
        args   = new Object[0];
        result = (String) m_GetCurrentMethod.invoke(m_Stemmer, args);
      }
      catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        e.printStackTrace();
        result = word;
      }
    }
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * returns a string representation of the stemmer.
   * 
   * @return a string representation of the stemmer
   */
<<<<<<< HEAD
  @Override
  public String toString() {
    String result;

    result = getClass().getName();
=======
  public String toString() {
    String      result;

    result  = getClass().getName();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result += " " + Utils.joinOptions(getOptions());

    return result.trim();
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14291 $");
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5836 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Runs the stemmer with the given options.
<<<<<<< HEAD
   * 
   * @param args the options
=======
   *
   * @param args      the options
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static void main(String[] args) {
    try {
      Stemming.useStemmer(new SnowballStemmer(), args);
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
    }
  }
}
