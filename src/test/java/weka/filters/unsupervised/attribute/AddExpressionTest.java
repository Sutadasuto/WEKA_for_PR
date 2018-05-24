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

import weka.core.Instance;
import weka.core.Instances;
import weka.filters.AbstractFilterTest;
import weka.filters.Filter;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests AddExpression. Run from the command line with:<p>
 * java weka.filters.unsupervised.attribute.AddExpressionTest
 *
 * @author <a href="mailto:len@reeltwo.com">Len Trigg</a>
<<<<<<< HEAD
 * @version $Revision: 11497 $
=======
 * @version $Revision: 1.3 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class AddExpressionTest extends AbstractFilterTest {
  
  private static double EXPR_DELTA = 0.001;

  public AddExpressionTest(String name) { super(name);  }

  /** Creates a default AddExpression */
  public Filter getFilter() {
    return new AddExpression();
  }

  /** Creates a specialized AddExpression */
  public Filter getFilter(String expr) {
    AddExpression af = new AddExpression();
    af.setExpression(expr);
    return af;
  }

  public void testAdd() {
<<<<<<< HEAD
    m_Filter = getFilter("a3+a6");
=======
    m_Filter = getFilter("a1+a2");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   inst.value(2) + inst.value(5), 
=======
                   inst.value(0) + inst.value(1), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testSubtract() {
<<<<<<< HEAD
    m_Filter = getFilter("a3-a6");
=======
    m_Filter = getFilter("a1-a2");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   inst.value(2) - inst.value(5), 
=======
                   inst.value(0) - inst.value(1), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testMultiply() {
<<<<<<< HEAD
    m_Filter = getFilter("a3*a6");
=======
    m_Filter = getFilter("a1*a2");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   inst.value(2) * inst.value(5), 
=======
                   inst.value(0) * inst.value(1), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testDivide() {
<<<<<<< HEAD
    m_Filter = getFilter("a3/a6");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
          inst.value(2) / inst.value(5), 
          inst.value(inst.numAttributes() - 1), EXPR_DELTA);
=======
    m_Filter = getFilter("a1/a2");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.value(1) == 0) {
        assertTrue("Instance " + (i + 1) + " should have been ?" , 
               inst.isMissing(inst.numAttributes() - 1));
      } else {
        assertEquals("Instance " + (i + 1),
                     inst.value(0) / inst.value(1), 
                     inst.value(inst.numAttributes() - 1), EXPR_DELTA);
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  public void testExponent() {
<<<<<<< HEAD
    m_Filter = getFilter("a3^a6");
=======
    m_Filter = getFilter("a1^a2");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.pow(inst.value(2), inst.value(5)), 
=======
                   Math.pow(inst.value(0), inst.value(1)), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testLog() {
<<<<<<< HEAD
    m_Filter = getFilter("log(a6/5)");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.value(5) != 0) {
        assertEquals("Instance " + (i + 1),
                     Math.log(inst.value(5)/5), 
=======
    m_Filter = getFilter("log(a2/5)");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.value(1) != 0) {
        assertEquals("Instance " + (i + 1),
                     Math.log(inst.value(1)/5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                     inst.value(inst.numAttributes() - 1), EXPR_DELTA);
      }
    }
  }

  public void testCos() {
<<<<<<< HEAD
    m_Filter = getFilter("cos(a6/5)");
=======
    m_Filter = getFilter("cos(a2/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.cos(inst.value(5) / 5), 
=======
                   Math.cos(inst.value(1) / 5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testSin() {
<<<<<<< HEAD
    m_Filter = getFilter("sin(a6/5)");
=======
    m_Filter = getFilter("sin(a2/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.sin(inst.value(5) / 5), 
=======
                   Math.sin(inst.value(1) / 5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testTan() {
<<<<<<< HEAD
    m_Filter = getFilter("tan(a6/5)");
=======
    m_Filter = getFilter("tan(a2/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1) + ": " + inst + "\n",
<<<<<<< HEAD
                   Math.tan(inst.value(5) / 5), 
=======
                   Math.tan(inst.value(1) / 5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testAbs() {
<<<<<<< HEAD
    m_Filter = getFilter("abs(a6-a3)");
=======
    m_Filter = getFilter("abs(a2-a1)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.abs(inst.value(5) - inst.value(2)), 
=======
                   Math.abs(inst.value(1) - inst.value(0)), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testExp() {
<<<<<<< HEAD
    m_Filter = getFilter("exp(a6-a3)");
=======
    m_Filter = getFilter("exp(a2-a1)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.exp(inst.value(5) - inst.value(2)), 
=======
                   Math.exp(inst.value(1) - inst.value(0)), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testSqrt() {
<<<<<<< HEAD
    m_Filter = getFilter("sqrt(a6+a3/5)");
=======
    m_Filter = getFilter("sqrt(a2+a1/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.sqrt(inst.value(5) + inst.value(2)/5), 
=======
                   Math.sqrt(inst.value(1) + inst.value(0)/5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testFloor() {
<<<<<<< HEAD
    m_Filter = getFilter("floor(a6+a3/5)");
=======
    m_Filter = getFilter("floor(a2+a1/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.floor(inst.value(5) + inst.value(2)/5), 
=======
                   Math.floor(inst.value(1) + inst.value(0)/5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testCeil() {
<<<<<<< HEAD
    m_Filter = getFilter("ceil(a6*a3/5)");
=======
    m_Filter = getFilter("ceil(a2*a1/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.ceil(inst.value(5) * inst.value(2)/5), 
=======
                   Math.ceil(inst.value(1) * inst.value(0)/5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testRint() {
<<<<<<< HEAD
    m_Filter = getFilter("rint(a6*a3/5)");
=======
    m_Filter = getFilter("rint(a2*a1/5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                   Math.rint(inst.value(5) * inst.value(2)/5), 
=======
                   Math.rint(inst.value(1) * inst.value(0)/5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                   inst.value(inst.numAttributes() - 1), EXPR_DELTA);
    }
  }

  public void testBracketing() {
<<<<<<< HEAD
    m_Filter = getFilter("(a3+a6)*((a6-a3)/5)");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.isMissing(2) || inst.isMissing(5)) {
=======
    m_Filter = getFilter("(a3+a4)*((a2-a1)/5)");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.isMissing(0) || inst.isMissing(1) ||
          inst.isMissing(2) || inst.isMissing(3)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        assertTrue("Instance " + (i + 1) + " should have been ?" , 
               inst.isMissing(inst.numAttributes() - 1));
      } else {
        assertEquals("Instance " + (i + 1),
<<<<<<< HEAD
                     (inst.value(2) + inst.value(5)) * 
                     ((inst.value(5) - inst.value(2))/5), 
=======
                     (inst.value(3) + inst.value(2)) * 
                     ((inst.value(1) - inst.value(0))/5), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                     inst.value(inst.numAttributes() - 1), EXPR_DELTA);
      }
    }
  }

  public void testBODMAS() {
<<<<<<< HEAD
    m_Filter = getFilter("a3+a3*a6-a3/5+a3*a6+a6");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.isMissing(2) || inst.isMissing(5)) {
=======
    m_Filter = getFilter("a3+a4*a2-a1/5+a3*a4+a2");
    Instances result = useFilter();
    for (int i = 0; i < result.numInstances(); i++) {
      Instance inst = result.instance(i);
      if (inst.isMissing(0) || inst.isMissing(1) ||
          inst.isMissing(2) || inst.isMissing(3)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        assertTrue("Instance " + (i + 1) + " should have been ?" , 
               inst.isMissing(inst.numAttributes() - 1));
      } else {
        assertEquals("Instance " + (i + 1),
                     inst.value(2) + 
<<<<<<< HEAD
                     (inst.value(2) * inst.value(5)) 
                     - (inst.value(2)/5)
                     + (inst.value(2) * inst.value(5))
                     + inst.value(5), 
=======
                     (inst.value(3) * inst.value(1)) 
                     - (inst.value(0)/5)
                     + (inst.value(3) * inst.value(2))
                     + inst.value(1), 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                     inst.value(inst.numAttributes() - 1), EXPR_DELTA);
      }
    }
  }

  public void testAddNamed() {
<<<<<<< HEAD
    m_Filter = getFilter("a3+a6");
=======
    m_Filter = getFilter("a1+a2");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String name = "BongoBongo";
    ((AddExpression)m_Filter).setName(name);
    Instances result = useFilter();
    assertEquals(name, result.attribute(result.numAttributes() - 1).name());
    name = "BongoBongoSecond";
    ((AddExpression)m_Filter).setName(name);
    result = useFilter();
    assertEquals(name, result.attribute(result.numAttributes() - 1).name());
  }

  public static Test suite() {
    return new TestSuite(AddExpressionTest.class);
  }

  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());
  }

}
