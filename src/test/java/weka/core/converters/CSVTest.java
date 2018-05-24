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
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
 */

package weka.core.converters;

<<<<<<< HEAD
=======
import weka.core.Instance;
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests CSVLoader/CSVSaver. Run from the command line with:<p/>
 * java weka.core.converters.CSVTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.2 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class CSVTest 
  extends AbstractFileConverterTest {

  /**
   * Constructs the <code>CSVTest</code>.
   *
   * @param name the name of the test class
   */
  public CSVTest(String name) { 
    super(name);  
  }

  /**
<<<<<<< HEAD
   * returns the loader used in the tests.
=======
   * returns the loader used in the tests
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return the configured loader
   */
  public AbstractLoader getLoader() {
    return new CSVLoader();
  }

  /**
<<<<<<< HEAD
   * returns the saver used in the tests.
=======
   * returns the saver used in the tests
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return the configured saver
   */
  public AbstractSaver getSaver() {
    return new CSVSaver();
  }
  
  /**
<<<<<<< HEAD
   * Called by JUnit before each test method. This implementation creates
   * the default loader/saver to test and generates a test set of Instances.
   *
   * @throws Exception if an error occurs reading the example instances.
   */
  protected void setUp() throws Exception {
    super.setUp();
    
    m_CheckHeader           = false;
    m_CompareValuesAsString = true;
  }

  /**
   * returns a test suite.
=======
   * Compare two datasets to see if they differ.
   *
   * @param data1 one set of instances
   * @param data2 the other set of instances
   * @throws Exception if the datasets differ
   */
  protected void compareDatasets(Instances data1, Instances data2)
    throws Exception {

    // header (order of values of nominal attributes can differ!)
    if (data1.numAttributes() != data2.numAttributes()) {
      throw new Exception("header has been modified");
    }
    
    if (!(data2.numInstances() == data1.numInstances())) {
      throw new Exception("number of instances has changed");
    }
    for (int i = 0; i < data2.numInstances(); i++) {
      Instance orig = data1.instance(i);
      Instance copy = data2.instance(i);
      for (int j = 0; j < orig.numAttributes(); j++) {
        if (orig.isMissing(j)) {
          if (!copy.isMissing(j)) {
            throw new Exception("instances have changed");
          }
        } else if (!orig.toString(j).equals(copy.toString(j))) {
          throw new Exception("instances have changed");
        }
        if (orig.weight() != copy.weight()) {
          throw new Exception("instance weights have changed");
        }	  
      }
    }
  }

  /**
   * returns a test suite
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return the test suite
   */
  public static Test suite() {
    return new TestSuite(CSVTest.class);
  }

  /**
<<<<<<< HEAD
   * for running the test from commandline.
=======
   * for running the test from commandline
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param args the commandline arguments - ignored
   */
  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());
  }
}

