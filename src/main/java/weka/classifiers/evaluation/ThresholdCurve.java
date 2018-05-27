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
 *    ThresholdCurve.java
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

import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.DenseInstance;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * Generates points illustrating prediction tradeoffs that can be obtained by
 * varying the threshold value between classes. For example, the typical
 * threshold value of 0.5 means the predicted probability of "positive" must be
 * higher than 0.5 for the instance to be predicted as "positive". The resulting
 * dataset can be used to visualize precision/recall tradeoff, or for ROC curve
 * analysis (true positive rate vs false positive rate). Weka just varies the
 * threshold on the class probability estimates in each case. The Mann Whitney
 * statistic is used to calculate the AUC.
 * 
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 10153 $
 */
public class ThresholdCurve implements RevisionHandler {
<<<<<<< HEAD
=======
=======
 * Generates points illustrating prediction tradeoffs that can be obtained
 * by varying the threshold value between classes. For example, the typical 
 * threshold value of 0.5 means the predicted probability of "positive" must be
 * higher than 0.5 for the instance to be predicted as "positive". The 
 * resulting dataset can be used to visualize precision/recall tradeoff, or 
 * for ROC curve analysis (true positive rate vs false positive rate).
 * Weka just varies the threshold on the class probability estimates in each 
 * case. The Mann Whitney statistic is used to calculate the AUC.
 *
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 7833 $
 */
public class ThresholdCurve
  implements RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The name of the relation used in threshold curve datasets */
  public static final String RELATION_NAME = "ThresholdCurve";

  /** attribute name: True Positives */
<<<<<<< HEAD
  public static final String TRUE_POS_NAME = "True Positives";
=======
<<<<<<< HEAD
  public static final String TRUE_POS_NAME = "True Positives";
=======
  public static final String TRUE_POS_NAME  = "True Positives";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** attribute name: False Negatives */
  public static final String FALSE_NEG_NAME = "False Negatives";
  /** attribute name: False Positives */
  public static final String FALSE_POS_NAME = "False Positives";
  /** attribute name: True Negatives */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static final String TRUE_NEG_NAME = "True Negatives";
  /** attribute name: False Positive Rate" */
  public static final String FP_RATE_NAME = "False Positive Rate";
  /** attribute name: True Positive Rate */
  public static final String TP_RATE_NAME = "True Positive Rate";
  /** attribute name: Precision */
  public static final String PRECISION_NAME = "Precision";
  /** attribute name: Recall */
  public static final String RECALL_NAME = "Recall";
  /** attribute name: Fallout */
  public static final String FALLOUT_NAME = "Fallout";
  /** attribute name: FMeasure */
  public static final String FMEASURE_NAME = "FMeasure";
<<<<<<< HEAD
=======
=======
  public static final String TRUE_NEG_NAME  = "True Negatives";
  /** attribute name: False Positive Rate" */
  public static final String FP_RATE_NAME   = "False Positive Rate";
  /** attribute name: True Positive Rate */
  public static final String TP_RATE_NAME   = "True Positive Rate";
  /** attribute name: Precision */
  public static final String PRECISION_NAME = "Precision";
  /** attribute name: Recall */
  public static final String RECALL_NAME    = "Recall";
  /** attribute name: Fallout */
  public static final String FALLOUT_NAME   = "Fallout";
  /** attribute name: FMeasure */
  public static final String FMEASURE_NAME  = "FMeasure";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** attribute name: Sample Size */
  public static final String SAMPLE_SIZE_NAME = "Sample Size";
  /** attribute name: Lift */
  public static final String LIFT_NAME = "Lift";
  /** attribute name: Threshold */
  public static final String THRESHOLD_NAME = "Threshold";

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Calculates the performance stats for the default class and return results
   * as a set of Instances. The structure of these Instances is as follows:
   * <p>
   * <ul>
   * <li><b>True Positives </b>
   * <li><b>False Negatives</b>
   * <li><b>False Positives</b>
   * <li><b>True Negatives</b>
   * <li><b>False Positive Rate</b>
   * <li><b>True Positive Rate</b>
   * <li><b>Precision</b>
   * <li><b>Recall</b>
   * <li><b>Fallout</b>
   * <li><b>Threshold</b> contains the probability threshold that gives rise to
   * the previous performance values.
   * </ul>
   * <p>
   * For the definitions of these measures, see TwoClassStats
   * <p>
   * 
   * @see TwoClassStats
   * @param predictions the predictions to base the curve on
   * @return datapoints as a set of instances, null if no predictions have been
   *         made.
   */
  public Instances getCurve(ArrayList<Prediction> predictions) {
<<<<<<< HEAD
=======
=======
   * Calculates the performance stats for the default class and return 
   * results as a set of Instances. The
   * structure of these Instances is as follows:<p> <ul> 
   * <li> <b>True Positives </b>
   * <li> <b>False Negatives</b>
   * <li> <b>False Positives</b>
   * <li> <b>True Negatives</b>
   * <li> <b>False Positive Rate</b>
   * <li> <b>True Positive Rate</b>
   * <li> <b>Precision</b>
   * <li> <b>Recall</b>  
   * <li> <b>Fallout</b>  
   * <li> <b>Threshold</b> contains the probability threshold that gives
   * rise to the previous performance values. 
   * </ul> <p>
   * For the definitions of these measures, see TwoClassStats <p>
   *
   * @see TwoClassStats
   * @param predictions the predictions to base the curve on
   * @return datapoints as a set of instances, null if no predictions
   * have been made.
   */
  public Instances getCurve(FastVector predictions) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (predictions.size() == 0) {
      return null;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return getCurve(predictions,
      ((NominalPrediction) predictions.get(0)).distribution().length - 1);
  }

  /**
   * Calculates the performance stats for the desired class and return results
   * as a set of Instances.
   * 
<<<<<<< HEAD
=======
=======
    return getCurve(predictions, 
                    ((NominalPrediction)predictions.elementAt(0))
                    .distribution().length - 1);
  }

  /**
   * Calculates the performance stats for the desired class and return 
   * results as a set of Instances.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param predictions the predictions to base the curve on
   * @param classIndex index of the class of interest.
   * @return datapoints as a set of instances.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instances getCurve(ArrayList<Prediction> predictions, int classIndex) {

    if ((predictions.size() == 0)
      || (((NominalPrediction) predictions.get(0)).distribution().length <= classIndex)) {
<<<<<<< HEAD
=======
=======
  public Instances getCurve(FastVector predictions, int classIndex) {

    if ((predictions.size() == 0) ||
        (((NominalPrediction)predictions.elementAt(0))
         .distribution().length <= classIndex)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return null;
    }

    double totPos = 0, totNeg = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double[] probs = getProbabilities(predictions, classIndex);

    // Get distribution of positive/negatives
    for (int i = 0; i < probs.length; i++) {
      NominalPrediction pred = (NominalPrediction) predictions.get(i);
      if (pred.actual() == Prediction.MISSING_VALUE) {
        System.err.println(getClass().getName()
          + " Skipping prediction with missing class value");
        continue;
      }
      if (pred.weight() < 0) {
        System.err.println(getClass().getName()
          + " Skipping prediction with negative weight");
<<<<<<< HEAD
=======
=======
    double [] probs = getProbabilities(predictions, classIndex);

    // Get distribution of positive/negatives
    for (int i = 0; i < probs.length; i++) {
      NominalPrediction pred = (NominalPrediction)predictions.elementAt(i);
      if (pred.actual() == Prediction.MISSING_VALUE) {
        System.err.println(getClass().getName() 
                           + " Skipping prediction with missing class value");
        continue;
      }
      if (pred.weight() < 0) {
        System.err.println(getClass().getName() 
                           + " Skipping prediction with negative weight");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        continue;
      }
      if (pred.actual() == classIndex) {
        totPos += pred.weight();
      } else {
        totNeg += pred.weight();
      }
    }

    Instances insts = makeHeader();
<<<<<<< HEAD
    int[] sorted = Utils.sort(probs);
=======
<<<<<<< HEAD
    int[] sorted = Utils.sort(probs);
=======
    int [] sorted = Utils.sort(probs);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    TwoClassStats tc = new TwoClassStats(totPos, totNeg, 0, 0);
    double threshold = 0;
    double cumulativePos = 0;
    double cumulativeNeg = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    for (int i = 0; i < sorted.length; i++) {

      if ((i == 0) || (probs[sorted[i]] > threshold)) {
        tc.setTruePositive(tc.getTruePositive() - cumulativePos);
        tc.setFalseNegative(tc.getFalseNegative() + cumulativePos);
        tc.setFalsePositive(tc.getFalsePositive() - cumulativeNeg);
        tc.setTrueNegative(tc.getTrueNegative() + cumulativeNeg);
        threshold = probs[sorted[i]];
        insts.add(makeInstance(tc, threshold));
        cumulativePos = 0;
        cumulativeNeg = 0;
        if (i == sorted.length - 1) {
          break;
        }
      }

      NominalPrediction pred = (NominalPrediction) predictions.get(sorted[i]);

      if (pred.actual() == Prediction.MISSING_VALUE) {
        System.err.println(getClass().getName()
          + " Skipping prediction with missing class value");
        continue;
      }
      if (pred.weight() < 0) {
        System.err.println(getClass().getName()
          + " Skipping prediction with negative weight");
        continue;
      }
      if (pred.actual() == classIndex) {
        cumulativePos += pred.weight();
      } else {
        cumulativeNeg += pred.weight();
      }

      /*
       * System.out.println(tc + " " + probs[sorted[i]] + " " + (pred.actual()
       * == classIndex));
       */
      /*
       * if ((i != (sorted.length - 1)) && ((i == 0) || (probs[sorted[i]] !=
       * probs[sorted[i - 1]]))) { insts.add(makeInstance(tc,
       * probs[sorted[i]])); }
       */
    }

<<<<<<< HEAD
=======
=======
    for (int i = 0; i < sorted.length; i++) {

      if ((i == 0) || (probs[sorted[i]] > threshold)) {
	tc.setTruePositive(tc.getTruePositive() - cumulativePos);
	tc.setFalseNegative(tc.getFalseNegative() + cumulativePos);
	tc.setFalsePositive(tc.getFalsePositive() - cumulativeNeg);
	tc.setTrueNegative(tc.getTrueNegative() + cumulativeNeg);
	threshold = probs[sorted[i]];
	insts.add(makeInstance(tc, threshold));
	cumulativePos = 0;
	cumulativeNeg = 0;
	if (i == sorted.length - 1) {
	  break;
	}
      }

      NominalPrediction pred = (NominalPrediction)predictions.elementAt(sorted[i]);

      if (pred.actual() == Prediction.MISSING_VALUE) {
	System.err.println(getClass().getName()
			   + " Skipping prediction with missing class value");
	continue;
      }
      if (pred.weight() < 0) {
	System.err.println(getClass().getName() 
			   + " Skipping prediction with negative weight");
	continue;
      }
      if (pred.actual() == classIndex) {
	cumulativePos += pred.weight();
      } else {
	cumulativeNeg += pred.weight();
      }

      /*
      System.out.println(tc + " " + probs[sorted[i]] 
                         + " " + (pred.actual() == classIndex));
      */
      /*if ((i != (sorted.length - 1)) &&
          ((i == 0) ||  
          (probs[sorted[i]] != probs[sorted[i - 1]]))) {
        insts.add(makeInstance(tc, probs[sorted[i]]));
	}*/
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // make sure a zero point gets into the curve
    if (tc.getFalseNegative() != totPos || tc.getTrueNegative() != totNeg) {
      tc = new TwoClassStats(0, 0, totNeg, totPos);
      threshold = probs[sorted[sorted.length - 1]] + 10e-6;
      insts.add(makeInstance(tc, threshold));
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return insts;
  }

  /**
   * Calculates the n point precision result, which is the precision averaged
   * over n evenly spaced (w.r.t recall) samples of the curve.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param tcurve a previously extracted threshold curve Instances.
   * @param n the number of points to average over.
   * @return the n-point precision.
   */
  public static double getNPointPrecision(Instances tcurve, int n) {

<<<<<<< HEAD
    if (!RELATION_NAME.equals(tcurve.relationName())
      || (tcurve.numInstances() == 0)) {
=======
<<<<<<< HEAD
    if (!RELATION_NAME.equals(tcurve.relationName())
      || (tcurve.numInstances() == 0)) {
=======
    if (!RELATION_NAME.equals(tcurve.relationName()) 
        || (tcurve.numInstances() == 0)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return Double.NaN;
    }
    int recallInd = tcurve.attribute(RECALL_NAME).index();
    int precisInd = tcurve.attribute(PRECISION_NAME).index();
<<<<<<< HEAD
    double[] recallVals = tcurve.attributeToDoubleArray(recallInd);
    int[] sorted = Utils.sort(recallVals);
=======
<<<<<<< HEAD
    double[] recallVals = tcurve.attributeToDoubleArray(recallInd);
    int[] sorted = Utils.sort(recallVals);
=======
    double [] recallVals = tcurve.attributeToDoubleArray(recallInd);
    int [] sorted = Utils.sort(recallVals);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double isize = 1.0 / (n - 1);
    double psum = 0;
    for (int i = 0; i < n; i++) {
      int pos = binarySearch(sorted, recallVals, i * isize);
      double recall = recallVals[sorted[pos]];
      double precis = tcurve.instance(sorted[pos]).value(precisInd);
      /*
<<<<<<< HEAD
       * System.err.println("Point " + (i + 1) + ": i=" + pos + " r=" + (i *
       * isize) + " p'=" + precis + " r'=" + recall);
       */
=======
<<<<<<< HEAD
       * System.err.println("Point " + (i + 1) + ": i=" + pos + " r=" + (i *
       * isize) + " p'=" + precis + " r'=" + recall);
       */
=======
      System.err.println("Point " + (i + 1) + ": i=" + pos 
                         + " r=" + (i * isize)
                         + " p'=" + precis 
                         + " r'=" + recall);
      */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // interpolate figures for non-endpoints
      while ((pos != 0) && (pos < sorted.length - 1)) {
        pos++;
        double recall2 = recallVals[sorted[pos]];
        if (recall2 != recall) {
          double precis2 = tcurve.instance(sorted[pos]).value(precisInd);
          double slope = (precis2 - precis) / (recall2 - recall);
          double offset = precis - recall * slope;
          precis = isize * i * slope + offset;
          /*
<<<<<<< HEAD
           * System.err.println("Point2 " + (i + 1) + ": i=" + pos + " r=" + (i
           * * isize) + " p'=" + precis2 + " r'=" + recall2 + " p''=" + precis);
           */
=======
<<<<<<< HEAD
           * System.err.println("Point2 " + (i + 1) + ": i=" + pos + " r=" + (i
           * * isize) + " p'=" + precis2 + " r'=" + recall2 + " p''=" + precis);
           */
=======
          System.err.println("Point2 " + (i + 1) + ": i=" + pos 
                             + " r=" + (i * isize)
                             + " p'=" + precis2 
                             + " r'=" + recall2
                             + " p''=" + precis);
          */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          break;
        }
      }
      psum += precis;
    }
    return psum / n;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Calculates the area under the precision-recall curve (AUPRC).
   * 
   * @param tcurve a previously extracted threshold curve Instances.
   * @return the PRC area, or Double.NaN if you don't pass in a ThresholdCurve
   *         generated Instances.
   */
  public static double getPRCArea(Instances tcurve) {
    final int n = tcurve.numInstances();
    if (!RELATION_NAME.equals(tcurve.relationName()) || (n == 0)) {
      return Double.NaN;
    }

    final int pInd = tcurve.attribute(PRECISION_NAME).index();
    final int rInd = tcurve.attribute(RECALL_NAME).index();
    final double[] pVals = tcurve.attributeToDoubleArray(pInd);
    final double[] rVals = tcurve.attributeToDoubleArray(rInd);

    double area = 0;
    double xlast = rVals[n - 1];

    // start from the first real p/r pair (not the artificial zero point)
    for (int i = n - 2; i >= 0; i--) {
      double recallDelta = rVals[i] - xlast;
      area += (pVals[i] * recallDelta);

      xlast = rVals[i];
    }

    if (area == 0) {
      return Utils.missingValue();
    }
    return area;
  }

  /**
   * Calculates the area under the ROC curve as the Wilcoxon-Mann-Whitney
   * statistic.
   * 
   * @param tcurve a previously extracted threshold curve Instances.
   * @return the ROC area, or Double.NaN if you don't pass in a ThresholdCurve
   *         generated Instances.
<<<<<<< HEAD
=======
=======
   * Calculates the area under the ROC curve as the Wilcoxon-Mann-Whitney statistic.
   *
   * @param tcurve a previously extracted threshold curve Instances.
   * @return the ROC area, or Double.NaN if you don't pass in 
   * a ThresholdCurve generated Instances. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static double getROCArea(Instances tcurve) {

    final int n = tcurve.numInstances();
<<<<<<< HEAD
    if (!RELATION_NAME.equals(tcurve.relationName()) || (n == 0)) {
=======
<<<<<<< HEAD
    if (!RELATION_NAME.equals(tcurve.relationName()) || (n == 0)) {
=======
    if (!RELATION_NAME.equals(tcurve.relationName()) 
        || (n == 0)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return Double.NaN;
    }
    final int tpInd = tcurve.attribute(TRUE_POS_NAME).index();
    final int fpInd = tcurve.attribute(FALSE_POS_NAME).index();
<<<<<<< HEAD
    final double[] tpVals = tcurve.attributeToDoubleArray(tpInd);
    final double[] fpVals = tcurve.attributeToDoubleArray(fpInd);
=======
<<<<<<< HEAD
    final double[] tpVals = tcurve.attributeToDoubleArray(tpInd);
    final double[] fpVals = tcurve.attributeToDoubleArray(fpInd);
=======
    final double [] tpVals = tcurve.attributeToDoubleArray(tpInd);
    final double [] fpVals = tcurve.attributeToDoubleArray(fpInd);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    double area = 0.0, cumNeg = 0.0;
    final double totalPos = tpVals[0];
    final double totalNeg = fpVals[0];
    for (int i = 0; i < n; i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      double cip, cin;
      if (i < n - 1) {
        cip = tpVals[i] - tpVals[i + 1];
        cin = fpVals[i] - fpVals[i + 1];
      } else {
        cip = tpVals[n - 1];
        cin = fpVals[n - 1];
      }
      area += cip * (cumNeg + (0.5 * cin));
      cumNeg += cin;
<<<<<<< HEAD
=======
=======
	double cip, cin;
	if (i < n - 1) {
	    cip = tpVals[i] - tpVals[i + 1];
	    cin = fpVals[i] - fpVals[i + 1];
	} else {
	    cip = tpVals[n - 1];
	    cin = fpVals[n - 1];
	}
	area += cip * (cumNeg + (0.5 * cin));
	cumNeg += cin;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    area /= (totalNeg * totalPos);

    return area;
  }

  /**
   * Gets the index of the instance with the closest threshold value to the
   * desired target
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param tcurve a set of instances that have been generated by this class
   * @param threshold the target threshold
   * @return the index of the instance that has threshold closest to the target,
   *         or -1 if this could not be found (i.e. no data, or bad threshold
   *         target)
   */
  public static int getThresholdInstance(Instances tcurve, double threshold) {

    if (!RELATION_NAME.equals(tcurve.relationName())
      || (tcurve.numInstances() == 0) || (threshold < 0) || (threshold > 1.0)) {
<<<<<<< HEAD
=======
=======
   *
   * @param tcurve a set of instances that have been generated by this class
   * @param threshold the target threshold
   * @return the index of the instance that has threshold closest to
   * the target, or -1 if this could not be found (i.e. no data, or
   * bad threshold target)
   */
  public static int getThresholdInstance(Instances tcurve, double threshold) {

    if (!RELATION_NAME.equals(tcurve.relationName()) 
        || (tcurve.numInstances() == 0)
        || (threshold < 0)
        || (threshold > 1.0)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return -1;
    }
    if (tcurve.numInstances() == 1) {
      return 0;
    }
<<<<<<< HEAD
    double[] tvals = tcurve.attributeToDoubleArray(tcurve.numAttributes() - 1);
    int[] sorted = Utils.sort(tvals);
=======
<<<<<<< HEAD
    double[] tvals = tcurve.attributeToDoubleArray(tcurve.numAttributes() - 1);
    int[] sorted = Utils.sort(tvals);
=======
    double [] tvals = tcurve.attributeToDoubleArray(tcurve.numAttributes() - 1);
    int [] sorted = Utils.sort(tvals);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return binarySearch(sorted, tvals, threshold);
  }

  /**
   * performs a binary search
   * 
   * @param index the indices
   * @param vals the values
   * @param target the target to look for
   * @return the index of the target
   */
<<<<<<< HEAD
  private static int binarySearch(int[] index, double[] vals, double target) {

=======
<<<<<<< HEAD
  private static int binarySearch(int[] index, double[] vals, double target) {

=======
  private static int binarySearch(int [] index, double [] vals, double target) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int lo = 0, hi = index.length - 1;
    while (hi - lo > 1) {
      int mid = lo + (hi - lo) / 2;
      double midval = vals[index[mid]];
      if (target > midval) {
        lo = mid;
      } else if (target < midval) {
        hi = mid;
      } else {
        while ((mid > 0) && (vals[index[mid - 1]] == target)) {
<<<<<<< HEAD
          mid--;
=======
<<<<<<< HEAD
          mid--;
=======
          mid --;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
        return mid;
      }
    }
    return lo;
  }

  /**
   * 
   * @param predictions the predictions to use
   * @param classIndex the class index
   * @return the probabilities
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private double[] getProbabilities(ArrayList<Prediction> predictions,
    int classIndex) {

    // sort by predicted probability of the desired class.
    double[] probs = new double[predictions.size()];
    for (int i = 0; i < probs.length; i++) {
      NominalPrediction pred = (NominalPrediction) predictions.get(i);
<<<<<<< HEAD
=======
=======
  private double [] getProbabilities(FastVector predictions, int classIndex) {

    // sort by predicted probability of the desired class.
    double [] probs = new double [predictions.size()];
    for (int i = 0; i < probs.length; i++) {
      NominalPrediction pred = (NominalPrediction)predictions.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      probs[i] = pred.distribution()[classIndex];
    }
    return probs;
  }

  /**
   * generates the header
   * 
   * @return the header
   */
  private Instances makeHeader() {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Attribute> fv = new ArrayList<Attribute>();
    fv.add(new Attribute(TRUE_POS_NAME));
    fv.add(new Attribute(FALSE_NEG_NAME));
    fv.add(new Attribute(FALSE_POS_NAME));
    fv.add(new Attribute(TRUE_NEG_NAME));
    fv.add(new Attribute(FP_RATE_NAME));
    fv.add(new Attribute(TP_RATE_NAME));
    fv.add(new Attribute(PRECISION_NAME));
    fv.add(new Attribute(RECALL_NAME));
    fv.add(new Attribute(FALLOUT_NAME));
    fv.add(new Attribute(FMEASURE_NAME));
    fv.add(new Attribute(SAMPLE_SIZE_NAME));
    fv.add(new Attribute(LIFT_NAME));
    fv.add(new Attribute(THRESHOLD_NAME));
    return new Instances(RELATION_NAME, fv, 100);
  }

<<<<<<< HEAD
=======
=======
    FastVector fv = new FastVector();
    fv.addElement(new Attribute(TRUE_POS_NAME));
    fv.addElement(new Attribute(FALSE_NEG_NAME));
    fv.addElement(new Attribute(FALSE_POS_NAME));
    fv.addElement(new Attribute(TRUE_NEG_NAME));
    fv.addElement(new Attribute(FP_RATE_NAME));
    fv.addElement(new Attribute(TP_RATE_NAME));
    fv.addElement(new Attribute(PRECISION_NAME));
    fv.addElement(new Attribute(RECALL_NAME));
    fv.addElement(new Attribute(FALLOUT_NAME));
    fv.addElement(new Attribute(FMEASURE_NAME));
    fv.addElement(new Attribute(SAMPLE_SIZE_NAME));
    fv.addElement(new Attribute(LIFT_NAME));
    fv.addElement(new Attribute(THRESHOLD_NAME));      
    return new Instances(RELATION_NAME, fv, 100);
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * generates an instance out of the given data
   * 
   * @param tc the statistics
   * @param prob the probability
   * @return the generated instance
   */
  private Instance makeInstance(TwoClassStats tc, double prob) {

    int count = 0;
<<<<<<< HEAD
    double[] vals = new double[13];
=======
<<<<<<< HEAD
    double[] vals = new double[13];
=======
    double [] vals = new double[13];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    vals[count++] = tc.getTruePositive();
    vals[count++] = tc.getFalseNegative();
    vals[count++] = tc.getFalsePositive();
    vals[count++] = tc.getTrueNegative();
    vals[count++] = tc.getFalsePositiveRate();
    vals[count++] = tc.getTruePositiveRate();
    vals[count++] = tc.getPrecision();
    vals[count++] = tc.getRecall();
    vals[count++] = tc.getFallout();
    vals[count++] = tc.getFMeasure();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double ss = (tc.getTruePositive() + tc.getFalsePositive())
      / (tc.getTruePositive() + tc.getFalsePositive() + tc.getTrueNegative() + tc
        .getFalseNegative());
    vals[count++] = ss;
    double expectedByChance = (ss * (tc.getTruePositive() + tc
      .getFalseNegative()));
    if (expectedByChance < 1) {
      vals[count++] = Utils.missingValue();
    } else {
      vals[count++] = tc.getTruePositive() / expectedByChance;

    }
    vals[count++] = prob;
    return new DenseInstance(1.0, vals);
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10153 $");
  }

  /**
   * Tests the ThresholdCurve generation from the command line. The classifier
   * is currently hardcoded. Pipe in an arff file.
   * 
   * @param args currently ignored
   */
  public static void main(String[] args) {

    try {

      Instances inst = new Instances(new java.io.InputStreamReader(System.in));
      if (0 != Math.log(1)) { // false
        System.out.println(ThresholdCurve.getNPointPrecision(inst, 11));
      } else if (3 != 1 + 1) { // true
<<<<<<< HEAD
=======
=======
      double ss = (tc.getTruePositive() + tc.getFalsePositive()) / 
        (tc.getTruePositive() + tc.getFalsePositive() + tc.getTrueNegative() + tc.getFalseNegative());
    vals[count++] = ss;
    double expectedByChance = (ss * (tc.getTruePositive() + tc.getFalseNegative()));
    if (expectedByChance < 1) {
      vals[count++] = Instance.missingValue();
    } else {
    vals[count++] = tc.getTruePositive() / expectedByChance; 
     
    }
    vals[count++] = prob;
    return new Instance(1.0, vals);
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7833 $");
  }
  
  /**
   * Tests the ThresholdCurve generation from the command line.
   * The classifier is currently hardcoded. Pipe in an arff file.
   *
   * @param args currently ignored
   */
  public static void main(String [] args) {

    try {
      
      Instances inst = new Instances(new java.io.InputStreamReader(System.in));
      if (false) {
        System.out.println(ThresholdCurve.getNPointPrecision(inst, 11));
      } else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        inst.setClassIndex(inst.numAttributes() - 1);
        ThresholdCurve tc = new ThresholdCurve();
        EvaluationUtils eu = new EvaluationUtils();
        Classifier classifier = new weka.classifiers.functions.Logistic();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        ArrayList<Prediction> predictions = new ArrayList<Prediction>();
        for (int i = 0; i < 2; i++) { // Do two runs.
          eu.setSeed(i);
          predictions.addAll(eu.getCVPredictions(classifier, inst, 10));
          // System.out.println("\n\n\n");
<<<<<<< HEAD
=======
=======
        FastVector predictions = new FastVector();
        for (int i = 0; i < 2; i++) { // Do two runs.
          eu.setSeed(i);
          predictions.appendElements(eu.getCVPredictions(classifier, inst, 10));
          //System.out.println("\n\n\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
        Instances result = tc.getCurve(predictions);
        System.out.println(result);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
