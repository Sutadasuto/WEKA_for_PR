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

package weka.attributeSelection;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests GreedyStepwise. Run from the command line with:<p/>
 * java weka.attributeSelection.GreedyStepwiseTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.2 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class GreedyStepwiseTest 
  extends AbstractSearchTest {

  public GreedyStepwiseTest(String name) { 
    super(name);  
  }

  /** Creates a default GreedyStepwise */
  public ASSearch getSearch() {
    return new GreedyStepwise();
  }

  /** Creates a default CfsSubsetEval */
  public ASEvaluation getEvaluator() {
    return new CfsSubsetEval();
  }

  public static Test suite() {
    return new TestSuite(GreedyStepwiseTest.class);
  }

  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());
  }
}
