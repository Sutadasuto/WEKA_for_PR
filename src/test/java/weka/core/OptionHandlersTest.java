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
 * Copyright (C) 2006 University of Waikato 
 */

package weka.core;

<<<<<<< HEAD
=======
import weka.gui.GenericPropertiesCreator;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
<<<<<<< HEAD
import weka.gui.GenericPropertiesCreator;

/**
 * Tests OptionHandlers. Run from the command line with:
 * <p/>
 * java weka.core.OptionHandlerTest
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14293 $
 */
public class OptionHandlersTest extends TestCase {
=======

/**
 * Tests OptionHandlers. Run from the command line with:<p/>
 * java weka.core.OptionHandlerTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.2 $
 */
public class OptionHandlersTest 
  extends TestCase {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * tests a specific OptionHandler
   */
<<<<<<< HEAD
  public static class OptionHandlerTest extends TestCase {

    /** the class to test */
    protected String m_Classname;

    /** the OptionHandler tester */
    protected CheckOptionHandler m_OptionTester;

    /**
     * Constructs the <code>OptionHandlersTest</code>.
     * 
     * @param name the name of the test class
     * @param classname the actual classname
     */
    public OptionHandlerTest(String name, String classname) {
      super(name);

      m_Classname = classname;
    }

    /**
     * returns the classname this test is for
     * 
     * @return the classname
=======
  public static class OptionHandlerTest
    extends TestCase {
  
    /** the class to test */
    protected String m_Classname;
    
    /** the OptionHandler tester */
    protected CheckOptionHandler m_OptionTester;
    
    /**
     * Constructs the <code>OptionHandlersTest</code>.
     *
     * @param name the name of the test class
     * @param classname the actual classname
     */
    public OptionHandlerTest(String name, String classname) { 
      super(name); 
      
      m_Classname = classname;
    }
    
    /**
     * returns the classname this test is for
     * 
     * @return		the classname
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     */
    public String getClassname() {
      return m_Classname;
    }
<<<<<<< HEAD

    /**
     * configures the optionhandler
     * 
     * @return the configured optionhandler, null in case of an error
     */
    protected OptionHandler getOptionHandler() {
      OptionHandler result;

      try {
        result = (OptionHandler) Class.forName(m_Classname).newInstance();
      } catch (Exception e) {
        result = null;
      }

      return result;
    }

    /**
     * Called by JUnit before each test method.
     * 
     * @throws Exception if an error occurs
     */
    @Override
    protected void setUp() throws Exception {
      super.setUp();

=======
    
    /**
     * configures the optionhandler
     * 
     * @return		the configured optionhandler, null in case of an error
     */
    protected OptionHandler getOptionHandler() {
      OptionHandler	result;
      
      try {
	result = (OptionHandler) Class.forName(m_Classname).newInstance();
      }
      catch (Exception e) {
	result = null;
      }
      
      return result;
    }
    
    /**
     * Called by JUnit before each test method.
     *
     * @throws Exception if an error occurs
     */
    protected void setUp() throws Exception {
      super.setUp();
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_OptionTester = new CheckOptionHandler();
      m_OptionTester.setOptionHandler(getOptionHandler());
      m_OptionTester.setUserOptions(new String[0]);
      m_OptionTester.setSilent(true);
    }

<<<<<<< HEAD
    /**
     * Called by JUnit after each test method
     * 
     * @throws Exception if an error occurs
     */
    @Override
    protected void tearDown() throws Exception {
      super.tearDown();

      m_OptionTester = null;
    }

=======
    /** 
     * Called by JUnit after each test method
     *
     * @throws Exception if an error occurs
     */
    protected void tearDown() throws Exception {
      super.tearDown();
      
      m_OptionTester = null;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /**
     * tests the listing of the options
     * 
     * @throws Exception if test fails
     */
    public void testListOptions() throws Exception {
      if (m_OptionTester.getOptionHandler() != null) {
<<<<<<< HEAD
        if (!m_OptionTester.checkListOptions()) {
          fail(getClassname() + ": "
            + "Options cannot be listed via listOptions.");
        }
      }
    }

=======
        if (!m_OptionTester.checkListOptions())
  	fail(getClassname() + ": " + "Options cannot be listed via listOptions.");
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /**
     * tests the setting of the options
     * 
     * @throws Exception if test fails
     */
    public void testSetOptions() throws Exception {
      if (m_OptionTester.getOptionHandler() != null) {
<<<<<<< HEAD
        if (!m_OptionTester.checkSetOptions()) {
          fail(getClassname() + ": " + "setOptions method failed.");
        }
      }
    }

=======
        if (!m_OptionTester.checkSetOptions())
  	fail(getClassname() + ": " + "setOptions method failed.");
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /**
     * tests whether there are any remaining options
     * 
     * @throws Exception if test fails
     */
    public void testRemainingOptions() throws Exception {
      if (m_OptionTester.getOptionHandler() != null) {
<<<<<<< HEAD
        if (!m_OptionTester.checkRemainingOptions()) {
          fail(getClassname() + ": " + "There were 'left-over' options.");
        }
      }
    }

=======
        if (!m_OptionTester.checkRemainingOptions())
  	fail(getClassname() + ": " + "There were 'left-over' options.");
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /**
     * tests the whether the user-supplied options stay the same after setting.
     * getting, and re-setting again.
     * 
<<<<<<< HEAD
     * @see #m_OptionTester
=======
     * @see 	#m_OptionTester
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     * @throws Exception if test fails
     */
    public void testCanonicalUserOptions() throws Exception {
      if (m_OptionTester.getOptionHandler() != null) {
<<<<<<< HEAD
        if (!m_OptionTester.checkCanonicalUserOptions()) {
          fail(getClassname() + ": " + "setOptions method failed");
        }
      }
    }

=======
        if (!m_OptionTester.checkCanonicalUserOptions())
  	fail(getClassname() + ": " + "setOptions method failed");
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /**
     * tests the resetting of the options to the default ones
     * 
     * @throws Exception if test fails
     */
    public void testResettingOptions() throws Exception {
      if (m_OptionTester.getOptionHandler() != null) {
<<<<<<< HEAD
        if (!m_OptionTester.checkSetOptions()) {
          fail(getClassname() + ": " + "Resetting of options failed");
        }
      }
    }
  }

  /**
   * Constructs the <code>OptionHandlersTest</code>.
   * 
   * @param name the name of the test class
   */
  public OptionHandlersTest(String name) {
    super(name);
  }

  /**
   * dummy for JUnit, does nothing, only to prevent JUnit from complaining about
   * "no tests"
=======
        if (!m_OptionTester.checkSetOptions())
  	fail(getClassname() + ": " + "Resetting of options failed");
      }
    }
  }
  
  /**
   * Constructs the <code>OptionHandlersTest</code>.
   *
   * @param name the name of the test class
   */
  public OptionHandlersTest(String name) { 
    super(name); 
  }

  /**
   * dummy for JUnit, does nothing, only to prevent JUnit from complaining 
   * about "no tests"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @throws Exception never happens
   */
  public void testDummy() throws Exception {
    // does nothing, only to prevent JUnit from complaining about "no tests"
  }
<<<<<<< HEAD

  /**
   * generate all tests
   * 
   * @return all the tests
   */
  public static Test suite() {
    TestSuite suite = new TestSuite();

=======
  
  /**
   * generate all tests
   * 
   * @return		all the tests
   */
  public static Test suite() {
    TestSuite suite = new TestSuite();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    try {
      // determine all test methods in the OptionHandlerTest class
      Vector<String> testMethods = new Vector<String>();
      Method[] methods = OptionHandlerTest.class.getDeclaredMethods();
<<<<<<< HEAD
      for (Method method : methods) {
        if (method.getName().startsWith("test")) {
          testMethods.add(method.getName());
        }
      }

=======
      for (int i = 0; i < methods.length; i++) {
	if (methods[i].getName().startsWith("test"))
	  testMethods.add(methods[i].getName());
      }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // get all classes that are accessible through the GUI
      GenericPropertiesCreator creator = new GenericPropertiesCreator();
      creator.execute(false);
      Properties props = creator.getOutputProperties();
<<<<<<< HEAD

      // traverse all super-classes
      Enumeration<?> names = props.propertyNames();
      while (names.hasMoreElements()) {
        String name = names.nextElement().toString();

        // add tests for all listed classes
        StringTokenizer tok = new StringTokenizer(props.getProperty(name, ""),
          ",");
        while (tok.hasMoreTokens()) {
          String classname = tok.nextToken();

          // does class implement OptionHandler?
          try {
            Class<?> cls = Class.forName(classname);
            if (!InheritanceUtils.hasInterface(OptionHandler.class, cls)) {
              continue;
            }
          } catch (Exception e) {
            // some other problem, skip this class
            continue;
          }

          // add tests for this class
          for (int i = 0; i < testMethods.size(); i++) {
            suite.addTest(new OptionHandlerTest(testMethods.get(i), classname));
          }
        }
      }
    } catch (Exception e) {
=======
      
      // traverse all super-classes
      Enumeration names = props.propertyNames();
      while (names.hasMoreElements()) {
	String name = names.nextElement().toString();

	// add tests for all listed classes
	StringTokenizer tok = new StringTokenizer(props.getProperty(name, ""), ",");
	while (tok.hasMoreTokens()) {
	  String classname = tok.nextToken();
	  
	  // does class implement OptionHandler?
	  try {
	    Class cls = Class.forName(classname);
	    if (!ClassDiscovery.hasInterface(OptionHandler.class, cls))
	      continue;
	  }
	  catch (Exception e) {
	    // some other problem, skip this class
	    continue;
	  }
	  
	  // add tests for this class
	  for (int i = 0; i < testMethods.size(); i++)
	    suite.addTest(new OptionHandlerTest(testMethods.get(i), classname));
	}
      }
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
    }

    return suite;
  }

  /**
   * for running the tests from commandline
   * 
<<<<<<< HEAD
   * @param args the commandline arguments - ignored
   */
  public static void main(String[] args) {
=======
   * @param args	the commandline arguments - ignored
   */
  public static void main(String[] args){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    junit.textui.TestRunner.run(suite());
  }
}
