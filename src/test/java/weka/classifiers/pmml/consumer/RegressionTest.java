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
 * Copyright 2008 University of Waikato, Hamilton, New Zealand
 */

package weka.classifiers.pmml.consumer;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests the pmml Regression classifier.
<<<<<<< HEAD
 * 
=======
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision 1.0 $
 */
public class RegressionTest extends AbstractPMMLClassifierTest {

  public RegressionTest(String name) {
    super(name);
  }

<<<<<<< HEAD
  @Override
  protected void setUp() throws Exception {
    m_modelNames = new ArrayList<String>();
    m_dataSetNames = new ArrayList<String>();
    m_modelNames.add("linear_regression_model.xml");
    m_modelNames.add("ELNINO_REGRESSION_SIMPLE.xml");
    m_dataSetNames.add("Elnino_small.arff");
    m_dataSetNames.add("Elnino_small.arff");
=======
  protected void setUp() throws Exception {
    m_modelNames = new FastVector();
    m_dataSetNames = new FastVector();
    m_modelNames.addElement("linear_regression_model.xml");
    m_modelNames.addElement("ELNINO_REGRESSION_SIMPLE.xml");
    m_dataSetNames.addElement("Elnino_small.arff");
    m_dataSetNames.addElement("Elnino_small.arff");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  public static Test suite() {
    return new TestSuite(weka.classifiers.pmml.consumer.RegressionTest.class);
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
<<<<<<< HEAD
}
=======
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
