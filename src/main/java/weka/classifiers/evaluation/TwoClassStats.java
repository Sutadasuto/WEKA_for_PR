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
 *    TwoClassStats.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.evaluation;

import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

/**
 * Encapsulates performance functions for two-class problems.
<<<<<<< HEAD
 * 
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 14382 $
 */
public class TwoClassStats implements RevisionHandler {

  /** The names used when converting this object to a confusion matrix */
  private static final String[] CATEGORY_NAMES = { "negative", "positive" };
=======
 *
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 1.9 $
 */
public class TwoClassStats
  implements RevisionHandler {

  /** The names used when converting this object to a confusion matrix */
  private static final String [] CATEGORY_NAMES = {"negative", "positive"};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Pos predicted as pos */
  private double m_TruePos;

  /** Neg predicted as pos */
  private double m_FalsePos;

  /** Neg predicted as neg */
  private double m_TrueNeg;

  /** Pos predicted as neg */
  private double m_FalseNeg;

  /**
   * Creates the TwoClassStats with the given initial performance values.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param tp the number of correctly classified positives
   * @param fp the number of incorrectly classified negatives
   * @param tn the number of correctly classified negatives
   * @param fn the number of incorrectly classified positives
   */
  public TwoClassStats(double tp, double fp, double tn, double fn) {
<<<<<<< HEAD

    setTruePositive(tp);
    setFalsePositive(fp);
    setTrueNegative(tn);
=======
      
    setTruePositive(tp); 
    setFalsePositive(fp);
    setTrueNegative(tn); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setFalseNegative(fn);
  }

  /** Sets the number of positive instances predicted as positive */
<<<<<<< HEAD
  public void setTruePositive(double tp) {
    m_TruePos = tp;
  }

  /** Sets the number of negative instances predicted as positive */
  public void setFalsePositive(double fp) {
    m_FalsePos = fp;
  }

  /** Sets the number of negative instances predicted as negative */
  public void setTrueNegative(double tn) {
    m_TrueNeg = tn;
  }

  /** Sets the number of positive instances predicted as negative */
  public void setFalseNegative(double fn) {
    m_FalseNeg = fn;
  }

  /** Gets the number of positive instances predicted as positive */
  public double getTruePositive() {
    return m_TruePos;
  }

  /** Gets the number of negative instances predicted as positive */
  public double getFalsePositive() {
    return m_FalsePos;
  }

  /** Gets the number of negative instances predicted as negative */
  public double getTrueNegative() {
    return m_TrueNeg;
  }

  /** Gets the number of positive instances predicted as negative */
  public double getFalseNegative() {
    return m_FalseNeg;
  }

  /**
   * Calculate the true positive rate. This is defined as
   * <p>
   * 
=======
  public void setTruePositive(double tp) { m_TruePos = tp; }

  /** Sets the number of negative instances predicted as positive */
  public void setFalsePositive(double fp) { m_FalsePos = fp; }

  /** Sets the number of negative instances predicted as negative */
  public void setTrueNegative(double tn) { m_TrueNeg = tn; }

  /** Sets the number of positive instances predicted as negative */
  public void setFalseNegative(double fn) { m_FalseNeg = fn; }

  /** Gets the number of positive instances predicted as positive */
  public double getTruePositive() { return m_TruePos; }

  /** Gets the number of negative instances predicted as positive */
  public double getFalsePositive() { return m_FalsePos; }

  /** Gets the number of negative instances predicted as negative */
  public double getTrueNegative() { return m_TrueNeg; }

  /** Gets the number of positive instances predicted as negative */
  public double getFalseNegative() { return m_FalseNeg; }

  /**
   * Calculate the true positive rate. 
   * This is defined as<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * correctly classified positives
   * ------------------------------
   *       total positives
   * </pre>
<<<<<<< HEAD
   * 
   * @return the true positive rate
   */
  public double getTruePositiveRate() {
    if (0 == (m_TruePos + m_FalseNeg)) {
      return Double.NaN;
    } else {
      return m_TruePos / (m_TruePos + m_FalseNeg);
=======
   *
   * @return the true positive rate
   */
  public double getTruePositiveRate() { 
    if (0 == (m_TruePos + m_FalseNeg)) {
      return 0;
    } else {
      return m_TruePos / (m_TruePos + m_FalseNeg); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Calculate the false positive rate. This is defined as
   * <p>
   * 
=======
   * Calculate the false positive rate. 
   * This is defined as<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * incorrectly classified negatives
   * --------------------------------
   *        total negatives
   * </pre>
<<<<<<< HEAD
   * 
   * @return the false positive rate
   */
  public double getFalsePositiveRate() {
    if (0 == (m_FalsePos + m_TrueNeg)) {
      return Double.NaN;
    } else {
      return m_FalsePos / (m_FalsePos + m_TrueNeg);
=======
   *
   * @return the false positive rate
   */
  public double getFalsePositiveRate() { 
    if (0 == (m_FalsePos + m_TrueNeg)) {
      return 0;
    } else {
      return m_FalsePos / (m_FalsePos + m_TrueNeg); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Calculate the precision. This is defined as
   * <p>
   * 
=======
   * Calculate the precision. 
   * This is defined as<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * correctly classified positives
   * ------------------------------
   *  total predicted as positive
   * </pre>
<<<<<<< HEAD
   * 
   * @return the precision
   */
  public double getPrecision() {
    if (0 == (m_TruePos + m_FalsePos)) {
      return Double.NaN;
    } else {
      return m_TruePos / (m_TruePos + m_FalsePos);
=======
   *
   * @return the precision
   */
  public double getPrecision() { 
    if (0 == (m_TruePos + m_FalsePos)) {
      return 0;
    } else {
      return m_TruePos / (m_TruePos + m_FalsePos); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Calculate the recall. This is defined as
   * <p>
   * 
=======
   * Calculate the recall. 
   * This is defined as<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * correctly classified positives
   * ------------------------------
   *       total positives
<<<<<<< HEAD
   * </pre>
   * <p>
   * (Which is also the same as the truePositiveRate.)
   * 
   * @return the recall
   */
  public double getRecall() {
    return getTruePositiveRate();
  }

  /**
   * Calculate the F-Measure. This is defined as
   * <p>
   * 
=======
   * </pre><p>
   * (Which is also the same as the truePositiveRate.)
   *
   * @return the recall
   */
  public double getRecall() { return getTruePositiveRate(); }

  /**
   * Calculate the F-Measure. 
   * This is defined as<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * 2 * recall * precision
   * ----------------------
   *   recall + precision
   * </pre>
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the F-Measure
   */
  public double getFMeasure() {

    double precision = getPrecision();
    double recall = getRecall();
    if ((precision + recall) == 0) {
<<<<<<< HEAD
      return Double.NaN;
=======
      return 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return 2 * precision * recall / (precision + recall);
  }

  /**
<<<<<<< HEAD
   * Calculate the fallout. This is defined as
   * <p>
   * 
=======
   * Calculate the fallout. 
   * This is defined as<p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre>
   * incorrectly classified negatives
   * --------------------------------
   *   total predicted as positive
   * </pre>
<<<<<<< HEAD
   * 
   * @return the fallout
   */
  public double getFallout() {
    if (0 == (m_TruePos + m_FalsePos)) {
      return Double.NaN;
    } else {
      return m_FalsePos / (m_TruePos + m_FalsePos);
=======
   *
   * @return the fallout
   */
  public double getFallout() { 
    if (0 == (m_TruePos + m_FalsePos)) {
      return 0;
    } else {
      return m_FalsePos / (m_TruePos + m_FalsePos); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Generates a <code>ConfusionMatrix</code> representing the current two-class
   * statistics, using class names "negative" and "positive".
   * 
=======
   * Generates a <code>ConfusionMatrix</code> representing the current
   * two-class statistics, using class names "negative" and "positive".
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a <code>ConfusionMatrix</code>.
   */
  public ConfusionMatrix getConfusionMatrix() {

    ConfusionMatrix cm = new ConfusionMatrix(CATEGORY_NAMES);
<<<<<<< HEAD
    cm.set(0, 0, m_TrueNeg);
    cm.set(0, 1, m_FalsePos);
    cm.set(1, 0, m_FalseNeg);
    cm.set(1, 1, m_TruePos);
=======
    cm.setElement(0, 0, m_TrueNeg);
    cm.setElement(0, 1, m_FalsePos);
    cm.setElement(1, 0, m_FalseNeg);
    cm.setElement(1, 1, m_TruePos);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return cm;
  }

  /**
<<<<<<< HEAD
   * Returns a string containing the various performance measures for the
   * current object
   */
  @Override
=======
   * Returns a string containing the various performance measures
   * for the current object 
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String toString() {

    StringBuffer res = new StringBuffer();
    res.append(getTruePositive()).append(' ');
    res.append(getFalseNegative()).append(' ');
    res.append(getTrueNegative()).append(' ');
    res.append(getFalsePositive()).append(' ');
    res.append(getFalsePositiveRate()).append(' ');
    res.append(getTruePositiveRate()).append(' ');
    res.append(getPrecision()).append(' ');
    res.append(getRecall()).append(' ');
    res.append(getFMeasure()).append(' ');
    res.append(getFallout()).append(' ');
    return res.toString();
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14382 $");
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.9 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
