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
 *    GainRatioSplitCrit.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.trees.j48;

<<<<<<< HEAD
import weka.core.ContingencyTables;
=======
<<<<<<< HEAD
import weka.core.ContingencyTables;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * Class for computing the gain ratio for a given distribution.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 10169 $
 */
public final class GainRatioSplitCrit extends EntropyBasedSplitCrit {
<<<<<<< HEAD
=======
=======
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 1.8 $
 */
public final class GainRatioSplitCrit
  extends EntropyBasedSplitCrit{
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -433336694718670930L;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This method is a straightforward implementation of the gain ratio criterion
   * for the given distribution.
   */
  @Override
<<<<<<< HEAD
=======
=======
   * This method is a straightforward implementation of the gain
   * ratio criterion for the given distribution.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public final double splitCritValue(Distribution bags) {

    double numerator;
    double denumerator;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    numerator = oldEnt(bags) - newEnt(bags);

    // Splits with no gain are useless.
    if (Utils.eq(numerator, 0)) {
      return Double.MAX_VALUE;
    }
    denumerator = splitEnt(bags);

    // Test if split is trivial.
    if (Utils.eq(denumerator, 0)) {
      return Double.MAX_VALUE;
    }

    // We take the reciprocal value because we want to minimize the
    // splitting criterion's value.
    return denumerator / numerator;
<<<<<<< HEAD
=======
=======
    
    numerator = oldEnt(bags)-newEnt(bags);

    // Splits with no gain are useless.
    if (Utils.eq(numerator,0))
      return Double.MAX_VALUE;
    denumerator = splitEnt(bags);
    
    // Test if split is trivial.
    if (Utils.eq(denumerator,0))
      return Double.MAX_VALUE;
    
    //  We take the reciprocal value because we want to minimize the
    // splitting criterion's value.
    return denumerator/numerator;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * This method computes the gain ratio in the same way C4.5 does.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param bags the distribution
   * @param totalnoInst the weight of ALL instances
   * @param numerator the info gain
   */
  public final double splitCritValue(Distribution bags, double totalnoInst,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double numerator) {

    double denumerator;
    // Compute split info.
    denumerator = splitEnt(bags, totalnoInst);

    // Test if split is trivial.
    if (Utils.eq(denumerator, 0)) {
      return 0;
    }
    denumerator = denumerator / totalnoInst;

    return numerator / denumerator;
  }

  /**
   * Help method for computing the split entropy.
   */
  private final double splitEnt(Distribution bags, double totalnoInst) {

    double returnValue = 0;
    double noUnknown;
    int i;

    noUnknown = totalnoInst - bags.total();
    if (Utils.gr(bags.total(), 0)) {
      for (i = 0; i < bags.numBags(); i++) {
        returnValue = returnValue - lnFunc(bags.perBag(i));
      }
      returnValue = returnValue - lnFunc(noUnknown);
      returnValue = returnValue + lnFunc(totalnoInst);
    }
    return returnValue / ContingencyTables.log2;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10169 $");
<<<<<<< HEAD
=======
=======
				     double numerator){
    
    double denumerator;
    double noUnknown;
    double unknownRate;
    int i;
    
    // Compute split info.
    denumerator = splitEnt(bags,totalnoInst);
        
    // Test if split is trivial.
    if (Utils.eq(denumerator,0))
      return 0;  
    denumerator = denumerator/totalnoInst;

    return numerator/denumerator;
  }
  
  /**
   * Help method for computing the split entropy.
   */
  private final double splitEnt(Distribution bags,double totalnoInst){
    
    double returnValue = 0;
    double noUnknown;
    int i;
    
    noUnknown = totalnoInst-bags.total();
    if (Utils.gr(bags.total(),0)){
      for (i=0;i<bags.numBags();i++)
	returnValue = returnValue-logFunc(bags.perBag(i));
      returnValue = returnValue-logFunc(noUnknown);
      returnValue = returnValue+logFunc(totalnoInst);
    }
    return returnValue;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.8 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
