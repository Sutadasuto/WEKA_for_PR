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
 *    CheckGOE.java
<<<<<<< HEAD
 *    Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.core;

<<<<<<< HEAD
import weka.gui.ProgrammaticProperty;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
<<<<<<< HEAD
import java.util.Vector;

/**
 * Simple command line checking of classes that are editable in the GOE.
 * <p/>
 * 
 * Usage:
 * <p/>
 * <code>
 *     CheckGOE -W classname -- test options
 * </code>
 * <p/>
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D
 *  Turn on debugging output.
 * </pre>
 * 
 * <pre>
 * -S
 *  Silent mode - prints nothing to stdout.
 * </pre>
 * 
 * <pre>
 * -ignored &lt;comma-separated list of properties&gt;
 *  Skipped properties.
 *  (default: capabilities,options)
 * </pre>
 * 
 * <pre>
 * -W
 *  Full name of the class analysed.
 *  eg: weka.classifiers.rules.ZeroR
 *  (default weka.classifiers.rules.ZeroR)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 11726 $
 */
public class CheckGOE extends Check {

  /** the object to test */
  protected Object m_Object = new weka.classifiers.rules.ZeroR();

  /** whether the tests were successful */
  protected boolean m_Success;

  /**
   * properties that are skipped in the checkToolTips method
   * 
   * @see #checkToolTips()
   */
  protected HashSet<String> m_IgnoredProperties = new HashSet<String>();

=======
import java.util.Iterator;
import java.util.Vector;

/**
 * Simple command line checking of classes that are editable in the GOE.<p/>
 *
 * Usage: <p/>
 * <code>
 *     CheckGOE -W classname -- test options
 * </code> <p/>
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  Turn on debugging output.</pre>
 * 
 * <pre> -S
 *  Silent mode - prints nothing to stdout.</pre>
 * 
 * <pre> -ignored &lt;comma-separated list of properties&gt;
 *  Skipped properties.
 *  (default: capabilities,options)</pre>
 * 
 * <pre> -W
 *  Full name of the class analysed.
 *  eg: weka.classifiers.rules.ZeroR
 *  (default weka.classifiers.rules.ZeroR)</pre>
 * 
 <!-- options-end -->
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.4 $
 */
public class CheckGOE
  extends Check {

  /** the object to test */
  protected Object m_Object = new weka.classifiers.rules.ZeroR();
  
  /** whether the tests were successful */
  protected boolean m_Success;
  
  /** properties that are skipped in the checkToolTips method 
   * @see #checkToolTips() */
  protected HashSet<String> m_IgnoredProperties = new HashSet<String>();
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * default constructor
   */
  public CheckGOE() {
    super();
<<<<<<< HEAD

    // set default options
    try {
      setOptions(new String[0]);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addAll(Collections.list(super.listOptions()));

    result.addElement(new Option("\tSkipped properties.\n"
      + "\t(default: capabilities,options)", "ignored", 1,
      "-ignored <comma-separated list of properties>"));

    result.addElement(new Option("\tFull name of the class analysed.\n"
      + "\teg: weka.classifiers.rules.ZeroR\n"
      + "\t(default weka.classifiers.rules.ZeroR)", "W", 1, "-W"));

    return result.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -D
   *  Turn on debugging output.
   * </pre>
   * 
   * <pre>
   * -S
   *  Silent mode - prints nothing to stdout.
   * </pre>
   * 
   * <pre>
   * -ignored &lt;comma-separated list of properties&gt;
   *  Skipped properties.
   *  (default: capabilities,options)
   * </pre>
   * 
   * <pre>
   * -W
   *  Full name of the class analysed.
   *  eg: weka.classifiers.rules.ZeroR
   *  (default weka.classifiers.rules.ZeroR)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    super.setOptions(options);

    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() == 0) {
      tmpStr = weka.classifiers.rules.ZeroR.class.getName();
    }
    setObject(Utils.forName(Object.class, tmpStr, null));

    tmpStr = Utils.getOption("ignored", options);
    if (tmpStr.length() == 0) {
      tmpStr = "capabilities,options";
    }
    setIgnoredProperties(tmpStr);
  }

  /**
   * Gets the current settings of the object.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    Collections.addAll(result, super.getOptions());

    result.add("-ignored");
    result.add(getIgnoredProperties());

=======
    
    // set default options
    try {
      setOptions(new String[0]);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();
    
    Enumeration en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement(en.nextElement());
    
    result.addElement(new Option(
        "\tSkipped properties.\n"
	+ "\t(default: capabilities,options)",
        "ignored", 1, "-ignored <comma-separated list of properties>"));
    
    result.addElement(new Option(
        "\tFull name of the class analysed.\n"
        +"\teg: weka.classifiers.rules.ZeroR\n"
        + "\t(default weka.classifiers.rules.ZeroR)",
        "W", 1, "-W"));
    
    return result.elements();
  }
  
  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Turn on debugging output.</pre>
   * 
   * <pre> -S
   *  Silent mode - prints nothing to stdout.</pre>
   * 
   * <pre> -ignored &lt;comma-separated list of properties&gt;
   *  Skipped properties.
   *  (default: capabilities,options)</pre>
   * 
   * <pre> -W
   *  Full name of the class analysed.
   *  eg: weka.classifiers.rules.ZeroR
   *  (default weka.classifiers.rules.ZeroR)</pre>
   * 
   <!-- options-end -->
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String      tmpStr;
    
    super.setOptions(options);
    
    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() == 0)
      tmpStr = weka.classifiers.rules.ZeroR.class.getName();
    setObject(Utils.forName(Object.class, tmpStr, null));
    
    tmpStr = Utils.getOption("ignored", options);
    if (tmpStr.length() == 0)
      tmpStr = "capabilities,options";
    setIgnoredProperties(tmpStr);
  }
  
  /**
   * Gets the current settings of the object.
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    String[]      options;
    int           i;
    
    result = new Vector();
    
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    result.add("-ignored");
    result.add(getIgnoredProperties());
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (getObject() != null) {
      result.add("-W");
      result.add(getObject().getClass().getName());
    }
<<<<<<< HEAD

    return result.toArray(new String[result.size()]);
  }

  /**
   * Set the object to work on..
   * 
   * @param value the object to use.
=======
    
    return (String[]) result.toArray(new String[result.size()]);
  }
  
  /**
   * Set the object to work on.. 
   *
   * @param value 	the object to use.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setObject(Object value) {
    m_Object = value;
  }
<<<<<<< HEAD

  /**
   * Get the object used in the tests.
   * 
   * @return the object used in the tests.
=======
  
  /**
   * Get the object used in the tests.
   *
   * @return 		the object used in the tests.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Object getObject() {
    return m_Object;
  }

  /**
   * Sets the properties to ignore in checkToolTips(). Comma-separated list.
   * 
<<<<<<< HEAD
   * @param value the list of properties
   * @see #checkToolTips()
   */
  public void setIgnoredProperties(String value) {
    String[] props;
    int i;

    m_IgnoredProperties.clear();
    props = value.split(",");
    for (i = 0; i < props.length; i++) {
      m_IgnoredProperties.add(props[i]);
    }
  }

  /**
   * Get the ignored properties used in checkToolTips() as comma-separated list
   * (sorted).
   * 
   * @return the ignored properties
   * @see #checkToolTips()
   */
  public String getIgnoredProperties() {
    String result;
    Vector<String> list;
    int i;

    list = new Vector<String>();
    list.addAll(m_IgnoredProperties);

    // sort
    if (list.size() > 1) {
      Collections.sort(list);
    }

    result = "";
    for (i = 0; i < list.size(); i++) {
      if (i > 0) {
        result += ",";
      }
      result += list.get(i);
    }

    return result;
  }

  /**
   * returns the success of the tests
   * 
   * @return true if the tests were successful
=======
   * @param value	the list of properties
   * @see 		#checkToolTips()
   */
  public void setIgnoredProperties(String value) {
    String[] 	props;
    int		i;
    
    m_IgnoredProperties.clear();
    props = value.split(",");
    for (i = 0; i < props.length; i++)
      m_IgnoredProperties.add(props[i]);
  }

  /**
   * Get the ignored properties used in checkToolTips() as comma-separated 
   * list (sorted).
   * 
   * @return		the ignored properties
   * @see		#checkToolTips()
   */
  public String getIgnoredProperties() {
    String		result;
    Vector<String>	list;
    Iterator		iter;
    int			i;
    
    list = new Vector<String>();
    iter = m_IgnoredProperties.iterator();
    while (iter.hasNext())
      list.add((String) iter.next());
    
    // sort
    if (list.size() > 1)
      Collections.sort(list);
    
    result = "";
    for (i = 0; i < list.size(); i++) {
      if (i > 0)
	result += ",";
      result += list.get(i);
    }
     
    return result;
  }
  
  /**
   * returns the success of the tests
   * 
   * @return		true if the tests were successful
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public boolean getSuccess() {
    return m_Success;
  }

  /**
   * checks whether the object declares a globalInfo method.
   * 
<<<<<<< HEAD
   * @return true if the test was passed
   */
  public boolean checkGlobalInfo() {
    boolean result;
    Class<?> cls;

    print("Global info...");

    result = true;
    cls = getObject().getClass();

    // test for globalInfo method
    try {
      cls.getMethod("globalInfo", (Class[]) null);
    } catch (Exception e) {
      result = false;
    }

    if (result) {
      println("yes");
    } else {
      println("no");
    }
=======
   * @return 		true if the test was passed
   */
  public boolean checkGlobalInfo() {
    boolean 	result;
    Class	cls;
    
    print("Global info...");
    
    result = true;
    cls    = getObject().getClass();
    
    // test for globalInfo method
    try {
      cls.getMethod("globalInfo", (Class[]) null);
    }
    catch (Exception e) {
      result = false;
    }

    if (result)
      println("yes");
    else
      println("no");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result;
  }

  /**
<<<<<<< HEAD
   * checks whether the object declares tip text method for all its properties.
   * 
   * @return true if the test was passed
   */
  public boolean checkToolTips() {
    boolean result;
    Class<?> cls;
    BeanInfo info;
    PropertyDescriptor[] desc;
    int i;
    Vector<String> missing;
    String suffix;

    print("Tool tips...");

    result = true;
    suffix = "TipText";
    cls = getObject().getClass();

=======
   * checks whether the object declares tip text method for all its
   * properties.
   * 
   * @return 		true if the test was passed
   */
  public boolean checkToolTips() {
    boolean 			result;
    Class			cls;
    BeanInfo			info;
    PropertyDescriptor[]	desc;
    int				i;
    Vector<String>		missing;
    String			suffix;
    
    print("Tool tips...");
    
    result = true;
    suffix = "TipText";
    cls    = getObject().getClass();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // get properties
    try {
      info = Introspector.getBeanInfo(cls, Object.class);
      desc = info.getPropertyDescriptors();
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      desc = null;
    }

    // test for TipText methods
    if (desc != null) {
      missing = new Vector<String>();
<<<<<<< HEAD

      for (i = 0; i < desc.length; i++) {
        // skip property?
        if (m_IgnoredProperties.contains(desc[i].getName())) {
          continue;
        }
        if ((desc[i].getReadMethod() == null)
          || (desc[i].getWriteMethod() == null)) {
          continue;
        }

        OptionMetadata m = desc[i].getReadMethod().getAnnotation(OptionMetadata.class);
        if (m == null) {
          m = desc[i].getWriteMethod().getAnnotation(OptionMetadata.class);
        }
        if (m != null) {
          continue;
        }

        // programatic properties don't need tip texts
        ProgrammaticProperty p = desc[i].getReadMethod().getAnnotation(ProgrammaticProperty.class);
        if (p == null) {
          p = desc[i].getWriteMethod().getAnnotation(ProgrammaticProperty.class);
        }
        if (p != null) {
          continue;
        }

        try {
          cls.getMethod(desc[i].getName() + suffix, (Class[]) null);
        } catch (Exception e) {
          result = false;
          missing.add(desc[i].getName() + suffix);
        }
      }

      if (result) {
        println("yes");
      } else {
        println("no (missing: " + missing + ")");
      }

    } else {
      println("maybe");
    }

    return result;
  }

  /**
   * Runs some diagnostic tests on the object. Output is printed to System.out
   * (if not silent).
   */
  @Override
=======
      
      for (i = 0; i < desc.length; i++) {
	// skip property?
	if (m_IgnoredProperties.contains(desc[i].getName()))
	  continue;
	if ((desc[i].getReadMethod() == null) || (desc[i].getWriteMethod() == null))
	  continue;
	  
	try {
	  cls.getMethod(desc[i].getName() + suffix, (Class[]) null);
	}
	catch (Exception e) {
	  result = false;
	  missing.add(desc[i].getName() + suffix);
	}
      }
      
      if (result)
	println("yes");
      else
	println("no (missing: " + missing + ")");

    }
    else {
      println("maybe");
    }
    
    return result;
  }
  
  /**
   * Runs some diagnostic tests on the object. Output is
   * printed to System.out (if not silent).
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void doTests() {
    println("Object: " + m_Object.getClass().getName() + "\n");

    println("--> Tests");

    m_Success = checkGlobalInfo();

<<<<<<< HEAD
    if (m_Success) {
      m_Success = checkToolTips();
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11726 $");
  }

  /**
   * Main method for using the CheckGOE.
   * 
   * @param args the options to the CheckGOE
=======
    if (m_Success)
      m_Success = checkToolTips();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.4 $");
  }
  
  /** 
   * Main method for using the CheckGOE.
   *
   * @param args 	the options to the CheckGOE
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static void main(String[] args) {
    CheckGOE check = new CheckGOE();
    runCheck(check, args);
<<<<<<< HEAD
    if (check.getSuccess()) {
      System.exit(0);
    } else {
      System.exit(1);
    }
=======
    if (check.getSuccess())
      System.exit(0);
    else
      System.exit(1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
