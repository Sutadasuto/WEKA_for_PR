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
 *    NumericPrediction.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.evaluation;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.Serializable;

import weka.classifiers.IntervalEstimator;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

<<<<<<< HEAD
=======
=======
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

import java.io.Serializable;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Encapsulates an evaluatable numeric prediction: the predicted class value
 * plus the actual class value.
 *
 * @author Len Trigg (len@reeltwo.com)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.9 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class NumericPrediction
  implements Prediction, Serializable, RevisionHandler {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization. */
  private static final long serialVersionUID = -4880216423674233887L;

  /** The actual class value. */
  private double m_Actual = MISSING_VALUE;

  /** The predicted class value. */
  private double m_Predicted = MISSING_VALUE;

  /** The weight assigned to this prediction. */
  private double m_Weight = 1;
  
  /** the prediction intervals. */
  private double[][] m_PredictionIntervals;
<<<<<<< HEAD
=======
=======
  /** for serialization */
  private static final long serialVersionUID = -4880216423674233887L;

  /** The actual class value */
  private double m_Actual = MISSING_VALUE;

  /** The predicted class value */
  private double m_Predicted = MISSING_VALUE;

  /** The weight assigned to this prediction */
  private double m_Weight = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Creates the NumericPrediction object with a default weight of 1.0.
   *
   * @param actual the actual value, or MISSING_VALUE.
   * @param predicted the predicted value, or MISSING_VALUE.
   */
  public NumericPrediction(double actual, double predicted) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    this(actual, predicted, 1);
  }

  /**
   * Creates the NumericPrediction object.
   *
   * @param actual the actual value, or MISSING_VALUE.
   * @param predicted the predicted value, or MISSING_VALUE.
   * @param weight the weight assigned to the prediction.
   */
  public NumericPrediction(double actual, double predicted, double weight) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    this(actual, predicted, weight, new double[0][]);
  }

  /**
   * Creates the NumericPrediction object.
   *
   * @param actual the actual value, or MISSING_VALUE.
   * @param predicted the predicted value, or MISSING_VALUE.
   * @param weight the weight assigned to the prediction.
   * @param predInt the prediction intervals from classifiers implementing
   * the <code>IntervalEstimator</code> interface.
   * @see IntervalEstimator
   */
  public NumericPrediction(double actual, double predicted, double weight, double[][] predInt) {
    m_Actual = actual;
    m_Predicted = predicted;
    m_Weight = weight;
    setPredictionIntervals(predInt);
<<<<<<< HEAD
=======
=======

    m_Actual = actual;
    m_Predicted = predicted;
    m_Weight = weight;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /** 
   * Gets the actual class value.
   *
   * @return the actual class value, or MISSING_VALUE if no
   * prediction was made.  
   */
  public double actual() { 
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_Actual; 
  }

  /**
   * Gets the predicted class value.
   *
   * @return the predicted class value, or MISSING_VALUE if no
   * prediction was made.  
   */
  public double predicted() { 
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_Predicted; 
  }

  /** 
   * Gets the weight assigned to this prediction. This is typically the weight
   * of the test instance the prediction was made for.
   *
   * @return the weight assigned to this prediction.
   */
  public double weight() { 
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_Weight; 
  }

  /**
   * Calculates the prediction error. This is defined as the predicted
   * value minus the actual value.
   *
   * @return the error for this prediction, or
   * MISSING_VALUE if either the actual or predicted value
   * is missing.  
   */
  public double error() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if ((m_Actual == MISSING_VALUE) ||
        (m_Predicted == MISSING_VALUE)) {
      return MISSING_VALUE;
    }
    return m_Predicted - m_Actual;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  /**
   * Sets the prediction intervals for this prediction.
   * 
   * @param predInt the prediction intervals
   */
  public void setPredictionIntervals(double[][] predInt) {
    m_PredictionIntervals = predInt.clone();
  }
  
  /**
   * Returns the predictions intervals. Only classifiers implementing the
   * <code>IntervalEstimator</code> interface.
   * 
   * @return the prediction intervals.
   * @see IntervalEstimator
   */
  public double[][] predictionIntervals() {
    return m_PredictionIntervals;
  }
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets a human readable representation of this prediction.
   *
   * @return a human readable representation of this prediction.
   */
  public String toString() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    StringBuffer sb = new StringBuffer();
    sb.append("NUM: ").append(actual()).append(' ').append(predicted());
    sb.append(' ').append(weight());
    return sb.toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 8034 $");
=======
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 8034 $");
=======
    return RevisionUtils.extract("$Revision: 1.9 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
