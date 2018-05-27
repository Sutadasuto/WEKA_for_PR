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
 * CorrelationSplitInfo.java
<<<<<<< HEAD
 * Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.trees.m5;

<<<<<<< HEAD
import java.io.Serializable;

=======
<<<<<<< HEAD
import java.io.Serializable;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.experiment.PairedStats;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Finds split points using correlation.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10169 $
 */
public final class CorrelationSplitInfo implements Cloneable, Serializable,
  SplitEvaluate, RevisionHandler {
<<<<<<< HEAD
=======
=======
import java.io.Serializable;

/**
 * Finds split points using correlation.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 1.4 $
 */
public final class CorrelationSplitInfo
  implements Cloneable, Serializable, SplitEvaluate, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 4212734895125452770L;

<<<<<<< HEAD
  private int m_position;
=======
<<<<<<< HEAD
  private int m_position;
=======
  /**
   * the first instance
   */
  private int    m_first;

  /**
   * the last instance
   */
  private int    m_last;
  private int    m_position;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * the maximum impurity reduction
   */
  private double m_maxImpurity;

  /**
   * the attribute being tested
   */
<<<<<<< HEAD
  private int m_splitAttr;
=======
<<<<<<< HEAD
  private int m_splitAttr;
=======
  private int    m_splitAttr;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * the best value on which to split
   */
  private double m_splitValue;

  /**
   * the number of instances
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private int m_number;

  /**
   * Constructs an object which contains the split information
   * 
<<<<<<< HEAD
=======
=======
  private int    m_number;

  /**
   * Constructs an object which contains the split information
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param low the index of the first instance
   * @param high the index of the last instance
   * @param attr an attribute
   */
  public CorrelationSplitInfo(int low, int high, int attr) {
    initialize(low, high, attr);
  }

  /**
   * Makes a copy of this CorrelationSplitInfo object
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public final SplitEvaluate copy() throws Exception {
    CorrelationSplitInfo s = (CorrelationSplitInfo) this.clone();

    return s;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Resets the object of split information
   * 
<<<<<<< HEAD
=======
=======
  } 

  /**
   * Resets the object of split information
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param low the index of the first instance
   * @param high the index of the last instance
   * @param attr the attribute
   */
  public final void initialize(int low, int high, int attr) {
    m_number = high - low + 1;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    m_first = low;
    m_last = high;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_position = -1;
    m_maxImpurity = -Double.MAX_VALUE;
    m_splitAttr = attr;
    m_splitValue = 0.0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Finds the best splitting point for an attribute in the instances
   * 
<<<<<<< HEAD
=======
=======
  } 

  /**
   * Finds the best splitting point for an attribute in the instances
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param attr the splitting attribute
   * @param inst the instances
   * @exception Exception if something goes wrong
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public final void attrSplit(int attr, Instances inst) throws Exception {
    int i;
    int len;
    int low = 0;
    int high = inst.numInstances() - 1;
    PairedStats full = new PairedStats(0.01);
    PairedStats leftSubset = new PairedStats(0.01);
    PairedStats rightSubset = new PairedStats(0.01);
    int classIndex = inst.classIndex();
    double leftCorr, rightCorr;
    double leftVar, rightVar, allVar;
    double order = 2.0;
<<<<<<< HEAD
=======
=======
  public final void attrSplit(int attr, Instances inst) throws Exception {
    int		i;
    int		len;
    int		part;
    int		low = 0;
    int		high = inst.numInstances() - 1;
    PairedStats full = new PairedStats(0.01);
    PairedStats leftSubset = new PairedStats(0.01);
    PairedStats rightSubset = new PairedStats(0.01);
    int		classIndex = inst.classIndex();
    double      leftCorr, rightCorr;
    double      leftVar, rightVar, allVar;
    double      order = 2.0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    initialize(low, high, attr);

    if (m_number < 4) {
      return;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    len = ((high - low + 1) < 5) ? 1 : (high - low + 1) / 5;
    m_position = low;
    // prime the subsets
    for (i = low; i < len; i++) {
      full
        .add(inst.instance(i).value(attr), inst.instance(i).value(classIndex));
      leftSubset.add(inst.instance(i).value(attr),
        inst.instance(i).value(classIndex));
    }

    for (i = len; i < inst.numInstances(); i++) {
      full
        .add(inst.instance(i).value(attr), inst.instance(i).value(classIndex));
      rightSubset.add(inst.instance(i).value(attr),
        inst.instance(i).value(classIndex));
    }
<<<<<<< HEAD
=======
=======
    } 

    len = ((high - low + 1) < 5) ? 1 : (high - low + 1) / 5;
    m_position = low;
    part = low + len - 1;

    // prime the subsets
    for (i = low; i < len; i++) {
      full.add(inst.instance(i).value(attr), 
	       inst.instance(i).value(classIndex));
      leftSubset.add(inst.instance(i).value(attr), 
		     inst.instance(i).value(classIndex));
    } 

    for (i = len; i < inst.numInstances(); i++) {
      full.add(inst.instance(i).value(attr), 
	       inst.instance(i).value(classIndex));
      rightSubset.add(inst.instance(i).value(attr), 
		      inst.instance(i).value(classIndex));
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    full.calculateDerived();

    allVar = (full.yStats.stdDev * full.yStats.stdDev);
    allVar = Math.abs(allVar);
    allVar = Math.pow(allVar, (1.0 / order));

    for (i = low + len; i < high - len - 1; i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      rightSubset.subtract(inst.instance(i).value(attr), inst.instance(i)
        .value(classIndex));
      leftSubset.add(inst.instance(i).value(attr),
        inst.instance(i).value(classIndex));

      if (!Utils.eq(inst.instance(i + 1).value(attr),
        inst.instance(i).value(attr))) {
        leftSubset.calculateDerived();
        rightSubset.calculateDerived();

        leftCorr = Math.abs(leftSubset.correlation);
        rightCorr = Math.abs(rightSubset.correlation);
        leftVar = (leftSubset.yStats.stdDev * leftSubset.yStats.stdDev);
        leftVar = Math.abs(leftVar);
        leftVar = Math.pow(leftVar, (1.0 / order));
        rightVar = (rightSubset.yStats.stdDev * rightSubset.yStats.stdDev);
        rightVar = Math.abs(rightVar);
        rightVar = Math.pow(rightVar, (1.0 / order));

        double score = allVar - ((leftSubset.count / full.count) * leftVar)
          - ((rightSubset.count / full.count) * rightVar);

        // score /= allVar;
        leftCorr = (leftSubset.count / full.count) * leftCorr;
        rightCorr = (rightSubset.count / full.count) * rightCorr;

        // c_score += score;
        if (!Utils.eq(score, 0.0)) {
          if (score > m_maxImpurity) {
            m_maxImpurity = score;
            m_splitValue = (inst.instance(i).value(attr) + inst.instance(i + 1)
              .value(attr)) * 0.5;
            m_position = i;
          }
        }
      }
    }
  }

  /**
   * Returns the impurity of this split
   * 
   * @return the impurity of this split
   */
  @Override
  public double maxImpurity() {
    return m_maxImpurity;
  }

  /**
   * Returns the attribute used in this split
   * 
   * @return the attribute used in this split
   */
  @Override
  public int splitAttr() {
    return m_splitAttr;
  }

  /**
   * Returns the position of the split in the sorted values. -1 indicates that a
   * split could not be found.
   * 
   * @return an <code>int</code> value
   */
  @Override
  public int position() {
    return m_position;
  }

  /**
   * Returns the split value
   * 
   * @return the split value
   */
  @Override
  public double splitValue() {
    return m_splitValue;
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
      rightSubset.subtract(inst.instance(i).value(attr), 
			   inst.instance(i).value(classIndex));
      leftSubset.add(inst.instance(i).value(attr), 
		     inst.instance(i).value(classIndex));

      if (!Utils.eq(inst.instance(i + 1).value(attr), 
		    inst.instance(i).value(attr))) {
	leftSubset.calculateDerived();
	rightSubset.calculateDerived();

	leftCorr = Math.abs(leftSubset.correlation);
	rightCorr = Math.abs(rightSubset.correlation);
	leftVar = (leftSubset.yStats.stdDev * leftSubset.yStats.stdDev);
	leftVar = Math.abs(leftVar);
	leftVar = Math.pow(leftVar, (1.0 / order));
	rightVar = (rightSubset.yStats.stdDev * rightSubset.yStats.stdDev);
	rightVar = Math.abs(rightVar);
	rightVar = Math.pow(rightVar, (1.0 / order));

	double score = allVar - ((leftSubset.count / full.count) * leftVar) 
		       - ((rightSubset.count / full.count) * rightVar);

	// score /= allVar;
	leftCorr = (leftSubset.count / full.count) * leftCorr;
	rightCorr = (rightSubset.count / full.count) * rightCorr;

	double c_score = (leftCorr + rightCorr) - Math.abs(full.correlation);

	// c_score += score;
	if (!Utils.eq(score, 0.0)) {
	  if (score > m_maxImpurity) {
	    m_maxImpurity = score;
	    m_splitValue = 
	      (inst.instance(i).value(attr) + inst.instance(i + 1)
	      .value(attr)) * 0.5;
	    m_position = i;
	  } 
	} 
      } 
    } 
  } 

  /**
   * Returns the impurity of this split
   *
   * @return the impurity of this split
   */
  public double maxImpurity() {
    return m_maxImpurity;
  } 

  /**
   * Returns the attribute used in this split
   *
   * @return the attribute used in this split
   */
  public int splitAttr() {
    return m_splitAttr;
  } 

  /**
   * Returns the position of the split in the sorted values. -1 indicates that
   * a split could not be found.
   *
   * @return an <code>int</code> value
   */
  public int position() {
    return m_position;
  } 

  /**
   * Returns the split value
   *
   * @return the split value
   */
  public double splitValue() {
    return m_splitValue;
  } 
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.4 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
