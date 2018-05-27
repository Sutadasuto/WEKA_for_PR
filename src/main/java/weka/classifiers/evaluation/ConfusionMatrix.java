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
 *    NominalPrediction.java
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
import java.util.ArrayList;

import weka.classifiers.CostMatrix;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.matrix.Matrix;

/**
 * Cells of this matrix correspond to counts of the number (or weight) of
 * predictions for each actual value / predicted value combination.
 * 
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 10169 $
<<<<<<< HEAD
=======
=======
import weka.classifiers.CostMatrix;
import weka.core.FastVector;
import weka.core.Matrix;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * Cells of this matrix correspond to counts of the number (or weight)
 * of predictions for each actual value / predicted value combination.
 *
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 1.9 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class ConfusionMatrix extends Matrix {

  /** for serialization */
  private static final long serialVersionUID = -181789981401504090L;

  /** Stores the names of the classes */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected String[] m_ClassNames;

  /**
   * Creates the confusion matrix with the given class names.
   * 
   * @param classNames an array containing the names the classes.
   */
  public ConfusionMatrix(String[] classNames) {

    super(classNames.length, classNames.length);
    m_ClassNames = classNames.clone();
  }

  /**
   * Makes a copy of this ConfusionMatrix after applying the supplied CostMatrix
   * to the cells. The resulting ConfusionMatrix can be used to get
   * cost-weighted statistics.
   * 
   * @param costs the CostMatrix.
   * @return a ConfusionMatrix that has had costs applied.
   * @exception Exception if the CostMatrix is not of the same size as this
   *              ConfusionMatrix.
<<<<<<< HEAD
=======
=======
  protected String [] m_ClassNames;

  /**
   * Creates the confusion matrix with the given class names.
   *
   * @param classNames an array containing the names the classes.
   */
  public ConfusionMatrix(String [] classNames) {

    super(classNames.length, classNames.length);
    m_ClassNames = (String [])classNames.clone();
  }

  /**
   * Makes a copy of this ConfusionMatrix after applying the
   * supplied CostMatrix to the cells. The resulting ConfusionMatrix
   * can be used to get cost-weighted statistics.
   *
   * @param costs the CostMatrix.
   * @return a ConfusionMatrix that has had costs applied.
   * @exception Exception if the CostMatrix is not of the same size
   * as this ConfusionMatrix.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public ConfusionMatrix makeWeighted(CostMatrix costs) throws Exception {

    if (costs.size() != size()) {
      throw new Exception("Cost and confusion matrices must be the same size");
    }
    ConfusionMatrix weighted = new ConfusionMatrix(m_ClassNames);
    for (int row = 0; row < size(); row++) {
      for (int col = 0; col < size(); col++) {
<<<<<<< HEAD
        weighted.set(row, col, get(row, col) * costs.getElement(row, col));
=======
<<<<<<< HEAD
        weighted.set(row, col, get(row, col) * costs.getElement(row, col));
=======
        weighted.setElement(row, col, getElement(row, col) * 
                            costs.getElement(row, col));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return weighted;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates and returns a clone of this object.
   * 
   * @return a clone of this instance.
   */
  @Override
  public Object clone() {

    ConfusionMatrix m = (ConfusionMatrix) super.clone();
    m.m_ClassNames = m_ClassNames.clone();
<<<<<<< HEAD
=======
=======

  /**
   * Creates and returns a clone of this object.
   *
   * @return a clone of this instance.
   */
  public Object clone() {

    ConfusionMatrix m = (ConfusionMatrix)super.clone();
    m.m_ClassNames = (String [])m_ClassNames.clone();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m;
  }

  /**
   * Gets the number of classes.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the number of classes
   */
  public int size() {

    return m_ClassNames.length;
  }

  /**
   * Gets the name of one of the classes.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param index the index of the class.
   * @return the class name.
   */
  public String className(int index) {

    return m_ClassNames[index];
  }

  /**
   * Includes a prediction in the confusion matrix.
<<<<<<< HEAD
   * 
   * @param pred the NominalPrediction to include
   * @exception Exception if no valid prediction was made (i.e. unclassified).
=======
<<<<<<< HEAD
   * 
   * @param pred the NominalPrediction to include
   * @exception Exception if no valid prediction was made (i.e. unclassified).
=======
   *
   * @param pred the NominalPrediction to include
   * @exception Exception if no valid prediction was made (i.e. 
   * unclassified).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void addPrediction(NominalPrediction pred) throws Exception {

    if (pred.predicted() == NominalPrediction.MISSING_VALUE) {
      throw new Exception("No predicted value given.");
    }
    if (pred.actual() == NominalPrediction.MISSING_VALUE) {
      throw new Exception("No actual value given.");
    }
<<<<<<< HEAD
    set((int) pred.actual(), (int) pred.predicted(),
      get((int) pred.actual(), (int) pred.predicted()) + pred.weight());

=======
<<<<<<< HEAD
    set((int) pred.actual(), (int) pred.predicted(),
      get((int) pred.actual(), (int) pred.predicted()) + pred.weight());

=======
    addElement((int)pred.actual(), (int)pred.predicted(), pred.weight());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Includes a whole bunch of predictions in the confusion matrix.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param predictions a FastVector containing the NominalPredictions to
   *          include
   * @exception Exception if no valid prediction was made (i.e. unclassified).
   */
  public void addPredictions(ArrayList<Prediction> predictions)
    throws Exception {

    for (int i = 0; i < predictions.size(); i++) {
      addPrediction((NominalPrediction) predictions.get(i));
    }
  }

  /**
   * Gets the performance with respect to one of the classes as a TwoClassStats
   * object.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @param predictions a FastVector containing the NominalPredictions
   * to include
   * @exception Exception if no valid prediction was made (i.e. 
   * unclassified).
   */
  public void addPredictions(FastVector predictions) throws Exception {

    for (int i = 0; i < predictions.size(); i++) {
      addPrediction((NominalPrediction)predictions.elementAt(i));
    }
  }

  
  /**
   * Gets the performance with respect to one of the classes
   * as a TwoClassStats object.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param classIndex the index of the class of interest.
   * @return the generated TwoClassStats object.
   */
  public TwoClassStats getTwoClassStats(int classIndex) {

    double fp = 0, tp = 0, fn = 0, tn = 0;
    for (int row = 0; row < size(); row++) {
      for (int col = 0; col < size(); col++) {
        if (row == classIndex) {
          if (col == classIndex) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            tp += get(row, col);
          } else {
            fn += get(row, col);
          }
        } else {
          if (col == classIndex) {
            fp += get(row, col);
          } else {
            tn += get(row, col);
          }
<<<<<<< HEAD
=======
=======
            tp += getElement(row, col);
          } else {
            fn += getElement(row, col);
          }          
        } else {
          if (col == classIndex) {
            fp += getElement(row, col);
          } else {
            tn += getElement(row, col);
          }          
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
    return new TwoClassStats(tp, fp, tn, fn);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the number of correct classifications (that is, for which a correct
   * prediction was made). (Actually the sum of the weights of these
   * classifications)
   * 
   * @return the number of correct classifications
<<<<<<< HEAD
=======
=======
   * Gets the number of correct classifications (that is, for which a
   * correct prediction was made). (Actually the sum of the weights of
   * these classifications)
   *
   * @return the number of correct classifications 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public double correct() {

    double correct = 0;
    for (int i = 0; i < size(); i++) {
<<<<<<< HEAD
      correct += get(i, i);
=======
<<<<<<< HEAD
      correct += get(i, i);
=======
      correct += getElement(i, i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return correct;
  }

  /**
   * Gets the number of incorrect classifications (that is, for which an
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * incorrect prediction was made). (Actually the sum of the weights of these
   * classifications)
   * 
   * @return the number of incorrect classifications
<<<<<<< HEAD
=======
=======
   * incorrect prediction was made). (Actually the sum of the weights of
   * these classifications)
   *
   * @return the number of incorrect classifications 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public double incorrect() {

    double incorrect = 0;
    for (int row = 0; row < size(); row++) {
      for (int col = 0; col < size(); col++) {
        if (row != col) {
<<<<<<< HEAD
          incorrect += get(row, col);
=======
<<<<<<< HEAD
          incorrect += get(row, col);
=======
          incorrect += getElement(row, col);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
    return incorrect;
  }

  /**
<<<<<<< HEAD
   * Gets the number of predictions that were made (actually the sum of the
   * weights of predictions where the class value was known).
   * 
=======
<<<<<<< HEAD
   * Gets the number of predictions that were made (actually the sum of the
   * weights of predictions where the class value was known).
   * 
=======
   * Gets the number of predictions that were made
   * (actually the sum of the weights of predictions where the
   * class value was known).
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the number of predictions with known class
   */
  public double total() {

    double total = 0;
    for (int row = 0; row < size(); row++) {
      for (int col = 0; col < size(); col++) {
<<<<<<< HEAD
        total += get(row, col);
=======
<<<<<<< HEAD
        total += get(row, col);
=======
        total += getElement(row, col);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return total;
  }

  /**
   * Returns the estimated error rate.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the estimated error rate (between 0 and 1).
   */
  public double errorRate() {

    return incorrect() / total();
  }

  /**
   * Calls toString() with a default title.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the confusion matrix as a string
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the confusion matrix as a string
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {

    return toString("=== Confusion Matrix ===\n");
  }

  /**
<<<<<<< HEAD
   * Outputs the performance statistics as a classification confusion matrix.
   * For each class value, shows the distribution of predicted class values.
   * 
=======
<<<<<<< HEAD
   * Outputs the performance statistics as a classification confusion matrix.
   * For each class value, shows the distribution of predicted class values.
   * 
=======
   * Outputs the performance statistics as a classification confusion
   * matrix. For each class value, shows the distribution of 
   * predicted class values.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param title the title for the confusion matrix
   * @return the confusion matrix as a String
   */
  public String toString(String title) {

    StringBuffer text = new StringBuffer();
<<<<<<< HEAD
    char[] IDChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
=======
<<<<<<< HEAD
    char[] IDChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
=======
    char [] IDChars = {'a','b','c','d','e','f','g','h','i','j',
		       'k','l','m','n','o','p','q','r','s','t',
		       'u','v','w','x','y','z'};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int IDWidth;
    boolean fractional = false;

    // Find the maximum value in the matrix
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // and check for fractional display requirement
    double maxval = 0;
    for (int i = 0; i < size(); i++) {
      for (int j = 0; j < size(); j++) {
        double current = get(i, j);
        if (current < 0) {
          current *= -10;
        }
        if (current > maxval) {
          maxval = current;
        }
        double fract = current - Math.rint(current);
        if (!fractional && ((Math.log(fract) / Math.log(10)) >= -2)) {
          fractional = true;
        }
      }
    }

    IDWidth = 1 + Math.max(
      (int) (Math.log(maxval) / Math.log(10) + (fractional ? 3 : 0)),
      (int) (Math.log(size()) / Math.log(IDChars.length)));
    text.append(title).append("\n");
    for (int i = 0; i < size(); i++) {
      if (fractional) {
        text.append(" ").append(num2ShortID(i, IDChars, IDWidth - 3))
          .append("   ");
      } else {
        text.append(" ").append(num2ShortID(i, IDChars, IDWidth));
      }
    }
    text.append("     actual class\n");
    for (int i = 0; i < size(); i++) {
      for (int j = 0; j < size(); j++) {
        text.append(" ").append(
          Utils.doubleToString(get(i, j), IDWidth, (fractional ? 2 : 0)));
      }
      text.append(" | ").append(num2ShortID(i, IDChars, IDWidth)).append(" = ")
        .append(m_ClassNames[i]).append("\n");
<<<<<<< HEAD
=======
=======
    // and check for fractional display requirement 
    double maxval = 0;
    for (int i = 0; i < size(); i++) {
      for (int j = 0; j < size(); j++) {
	double current = getElement(i, j);
        if (current < 0) {
          current *= -10;
        }
	if (current > maxval) {
	  maxval = current;
	}
	double fract = current - Math.rint(current);
	if (!fractional
	    && ((Math.log(fract) / Math.log(10)) >= -2)) {
	  fractional = true;
	}
      }
    }

    IDWidth = 1 + Math.max((int)(Math.log(maxval) / Math.log(10) 
				 + (fractional ? 3 : 0)),
			     (int)(Math.log(size()) / 
				   Math.log(IDChars.length)));
    text.append(title).append("\n");
    for (int i = 0; i < size(); i++) {
      if (fractional) {
	text.append(" ").append(num2ShortID(i,IDChars,IDWidth - 3))
          .append("   ");
      } else {
	text.append(" ").append(num2ShortID(i,IDChars,IDWidth));
      }
    }
    text.append("     actual class\n");
    for (int i = 0; i< size(); i++) { 
      for (int j = 0; j < size(); j++) {
	text.append(" ").append(
		    Utils.doubleToString(getElement(i, j),
					 IDWidth,
					 (fractional ? 2 : 0)));
      }
      text.append(" | ").append(num2ShortID(i,IDChars,IDWidth))
        .append(" = ").append(m_ClassNames[i]).append("\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return text.toString();
  }

  /**
   * Method for generating indices for the confusion matrix.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param num integer to format
   * @return the formatted integer as a string
   */
  private static String num2ShortID(int num, char[] IDChars, int IDWidth) {

    char ID[] = new char[IDWidth];
    int i;

    for (i = IDWidth - 1; i >= 0; i--) {
      ID[i] = IDChars[num % IDChars.length];
      num = num / IDChars.length - 1;
      if (num < 0) {
        break;
      }
    }
    for (i--; i >= 0; i--) {
<<<<<<< HEAD
=======
=======
   *
   * @param num integer to format
   * @return the formatted integer as a string
   */
  private static String num2ShortID(int num, char [] IDChars, int IDWidth) {
    
    char ID [] = new char [IDWidth];
    int i;
    
    for(i = IDWidth - 1; i >=0; i--) {
      ID[i] = IDChars[num % IDChars.length];
      num = num / IDChars.length - 1;
      if (num < 0) {
	break;
      }
    }
    for(i--; i >= 0; i--) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ID[i] = ' ';
    }

    return new String(ID);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

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
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.9 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
