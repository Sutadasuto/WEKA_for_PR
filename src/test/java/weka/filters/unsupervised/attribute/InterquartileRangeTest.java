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

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
=======
import junit.framework.Test;
import junit.framework.TestSuite;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.core.TestInstances;
import weka.filters.AbstractFilterTest;
import weka.filters.Filter;

<<<<<<< HEAD
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests InterquartileRange. Run from the command line with:<p>
 * java weka.filters.unsupervised.attribute.InterquartileRangeTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 9528 $
 */
public class InterquartileRangeTest
  extends AbstractFilterTest {
  
  protected void setUp() throws Exception {
    super.setUp();
    
    TestInstances noMissing = TestInstances.forCapabilities(
        m_Filter.getCapabilities());
=======
/**
 * Tests InterquartileRange. Run from the command line with:
 * <p>
 * java weka.filters.unsupervised.attribute.InterquartileRangeTest
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 9529 $
 */
public class InterquartileRangeTest extends AbstractFilterTest {

  @Override
  protected void setUp() throws Exception {
    super.setUp();

    TestInstances noMissing = TestInstances.forCapabilities(m_Filter
        .getCapabilities());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_Instances = noMissing.generate();
  }

  /**
   * Initializes the test with the given name.
   * 
<<<<<<< HEAD
   * @param name	the name of the test
   */
  public InterquartileRangeTest(String name) { 
    super(name);  
=======
   * @param name the name of the test
   */
  public InterquartileRangeTest(String name) {
    super(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Creates a default InterquartileRange.
   * 
<<<<<<< HEAD
   * @return		the filter
   */
=======
   * @return the filter
   */
  @Override
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Filter getFilter() {
    return new InterquartileRange();
  }

  /**
   * a typical test, with nominal class attribute.
   */
  public void testNominalClass() {
    // run filter
    m_Instances.setClassIndex(1);
    Instances icopy = new Instances(m_Instances);
    Instances result = null;
    try {
      m_Filter.setInputFormat(icopy);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on setInputFormat(): \n" + ex.getMessage());
    }
    try {
      result = Filter.useFilter(icopy, m_Filter);
      assertNotNull(result);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on useFilter(): \n" + ex.getMessage());
    }

    // test
    assertEquals(icopy.numAttributes() + 2, result.numAttributes());
    assertEquals(icopy.numInstances(), result.numInstances());
  }

  /**
   * a typical test, with nominal class attribute and on a single numeric
   * attribute.
   */
  public void testNominalClassSingleAttribute() {
    // run filter
    m_Instances.setClassIndex(1);
    Instances icopy = new Instances(m_Instances);
    Instances result = null;
    ((InterquartileRange) m_Filter).setAttributeIndices("3");
    try {
      m_Filter.setInputFormat(icopy);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on setInputFormat(): \n" + ex.getMessage());
    }
    try {
      result = Filter.useFilter(icopy, m_Filter);
      assertNotNull(result);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on useFilter(): \n" + ex.getMessage());
    }

    // test
    assertEquals(icopy.numAttributes() + 2, result.numAttributes());
    assertEquals(icopy.numInstances(), result.numInstances());
  }

  /**
   * a typical test, with numeric class attribute.
   */
  public void testNumericClass() {
    // run filter
    m_Instances.setClassIndex(2);
    Instances icopy = new Instances(m_Instances);
    Instances result = null;
    try {
      m_Filter.setInputFormat(icopy);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on setInputFormat(): \n" + ex.getMessage());
    }
    try {
      result = Filter.useFilter(icopy, m_Filter);
      assertNotNull(result);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on useFilter(): \n" + ex.getMessage());
    }

    // test
    assertEquals(icopy.numAttributes() + 2, result.numAttributes());
    assertEquals(icopy.numInstances(), result.numInstances());
  }

  /**
   * a typical test, w/o class attribute.
   */
  public void testWithoutClass() {
    // run filter
    Instances icopy = new Instances(m_Instances);
    Instances result = null;
    try {
      m_Filter.setInputFormat(icopy);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on setInputFormat(): \n" + ex.getMessage());
    }
    try {
      result = Filter.useFilter(icopy, m_Filter);
      assertNotNull(result);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on useFilter(): \n" + ex.getMessage());
    }

    // test
    assertEquals(icopy.numAttributes() + 2, result.numAttributes());
    assertEquals(icopy.numInstances(), result.numInstances());
  }

  /**
   * a typical test, w/o class attribute but with Outlier/ExtremeValue
   * generation per attribute.
   */
  public void testPerAttribute() {
    // parameters
    ((InterquartileRange) m_Filter).setDetectionPerAttribute(true);
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // run filter
    Instances icopy = new Instances(m_Instances);
    Instances result = null;
    try {
      m_Filter.setInputFormat(icopy);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on setInputFormat(): \n" + ex.getMessage());
    }
    try {
      result = Filter.useFilter(icopy, m_Filter);
      assertNotNull(result);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on useFilter(): \n" + ex.getMessage());
    }

    // test
    int count = 0;
    for (int i = 0; i < icopy.numAttributes(); i++) {
      if (icopy.attribute(i).isNumeric())
<<<<<<< HEAD
	count++;
    }
    assertEquals(icopy.numAttributes() + 2*count, result.numAttributes());
=======
        count++;
    }
    assertEquals(icopy.numAttributes() + 2 * count, result.numAttributes());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    assertEquals(icopy.numInstances(), result.numInstances());
  }

  /**
   * a typical test, w/o class attribute but with Outlier/ExtremeValue
   * generation per attribute and Offset multiplier generation.
   */
  public void testOffset() {
    // parameters
    ((InterquartileRange) m_Filter).setDetectionPerAttribute(true);
    ((InterquartileRange) m_Filter).setOutputOffsetMultiplier(true);

    // run filter
    Instances icopy = new Instances(m_Instances);
    Instances result = null;
    try {
      m_Filter.setInputFormat(icopy);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on setInputFormat(): \n" + ex.getMessage());
    }
    try {
      result = Filter.useFilter(icopy, m_Filter);
      assertNotNull(result);
<<<<<<< HEAD
    } 
    catch (Exception ex) {
=======
    } catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      fail("Exception thrown on useFilter(): \n" + ex.getMessage());
    }

    // test
    int count = 0;
    for (int i = 0; i < icopy.numAttributes(); i++) {
      if (icopy.attribute(i).isNumeric())
<<<<<<< HEAD
	count++;
    }
    assertEquals(icopy.numAttributes() + 3*count, result.numAttributes());
=======
        count++;
    }
    assertEquals(icopy.numAttributes() + 3 * count, result.numAttributes());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    assertEquals(icopy.numInstances(), result.numInstances());
  }

  /**
   * Returns a test suite.
   * 
<<<<<<< HEAD
   * @return		the suite
=======
   * @return the suite
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static Test suite() {
    return new TestSuite(InterquartileRangeTest.class);
  }

  /**
   * Runs the test from the commandline.
   * 
<<<<<<< HEAD
   * @param args	ignored
   */
  public static void main(String[] args){
=======
   * @param args ignored
   */
  public static void main(String[] args) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    junit.textui.TestRunner.run(suite());
  }
}
