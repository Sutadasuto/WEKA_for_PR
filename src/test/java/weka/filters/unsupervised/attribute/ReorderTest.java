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
 * Copyright (C) 2002 University of Waikato 
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import junit.framework.Test;
import junit.framework.TestSuite;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.filters.AbstractFilterTest;
import weka.filters.Filter;

<<<<<<< HEAD
/**
 * Tests Reorder. Run from the command line with:
 * <p>
 * java weka.filters.unsupervised.attribute.ReorderTest
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10160 $
 */
public class ReorderTest extends AbstractFilterTest {

  public ReorderTest(String name) {
    super(name);
  }

  /** Creates a default Reorder */
  @Override
=======
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests Reorder. Run from the command line with:<p>
 * java weka.filters.unsupervised.attribute.ReorderTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.2 $
 */
public class ReorderTest extends AbstractFilterTest {
  
  public ReorderTest(String name) { 
    super(name);  
  }

  /** Creates a default Reorder */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Filter getFilter() {
    return getFilter("first-last");
  }

  /** Creates a specialized Reorder */
  public Filter getFilter(String rangelist) {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    try {
      Reorder af = new Reorder();
      af.setAttributeIndices(rangelist);
      return af;
    } catch (Exception ex) {
      ex.printStackTrace();
<<<<<<< HEAD
      fail("Exception setting attribute range: " + rangelist + "\n"
        + ex.getMessage());
=======
      fail("Exception setting attribute range: " + rangelist 
           + "\n" + ex.getMessage()); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return null;
  }

  public void testTypical() {
    m_Filter = getFilter("2,1");
    Instances result = useFilter();
<<<<<<< HEAD
    m_Instances.numAttributes();
    assertEquals(2, result.numAttributes());
    assertTrue(result.attribute(1).name()
      .endsWith(m_Instances.attribute(0).name()));
    assertTrue(result.attribute(0).name()
      .endsWith(m_Instances.attribute(1).name()));
=======
    int origNum = m_Instances.numAttributes();
    assertEquals(2, result.numAttributes());
    assertTrue(result.attribute(1).name().endsWith(m_Instances.attribute(0).name()));
    assertTrue(result.attribute(0).name().endsWith(m_Instances.attribute(1).name()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  public void testTypical2() {
    m_Filter = getFilter("3-4");
    Instances result = useFilter();
<<<<<<< HEAD
    m_Instances.numAttributes();
    assertEquals(2, result.numAttributes());
    assertTrue(result.attribute(0).name()
      .endsWith(m_Instances.attribute(2).name()));
    assertTrue(result.attribute(1).name()
      .endsWith(m_Instances.attribute(3).name()));
=======
    int origNum = m_Instances.numAttributes();
    assertEquals(2, result.numAttributes());
    assertTrue(result.attribute(0).name().endsWith(m_Instances.attribute(2).name()));
    assertTrue(result.attribute(1).name().endsWith(m_Instances.attribute(3).name()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  public void testTypical3() {
    m_Filter = getFilter("2-last,1");
    Instances result = useFilter();
    int origNum = m_Instances.numAttributes();
    assertEquals(origNum, result.numAttributes());
<<<<<<< HEAD
    assertTrue(result.attribute(0).name()
      .endsWith(m_Instances.attribute(1).name()));
    assertTrue(result.attribute(1).name()
      .endsWith(m_Instances.attribute(2).name()));
    assertTrue(result.attribute(origNum - 1).name()
      .endsWith(m_Instances.attribute(0).name()));
=======
    assertTrue(result.attribute(0).name().endsWith(m_Instances.attribute(1).name()));
    assertTrue(result.attribute(1).name().endsWith(m_Instances.attribute(2).name()));
    assertTrue(result.attribute(origNum - 1).name().endsWith(m_Instances.attribute(0).name()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  public static Test suite() {
    return new TestSuite(ReorderTest.class);
  }

<<<<<<< HEAD
  public static void main(String[] args) {
=======
  public static void main(String[] args){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    junit.textui.TestRunner.run(suite());
  }
}
