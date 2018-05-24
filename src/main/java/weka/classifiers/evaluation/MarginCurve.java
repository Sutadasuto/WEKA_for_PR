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
 *    MarginCurve.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.evaluation;

<<<<<<< HEAD
import java.util.ArrayList;

import weka.core.Attribute;
import weka.core.DenseInstance;
=======
import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
<<<<<<< HEAD
 * Generates points illustrating the prediction margin. The margin is defined as
 * the difference between the probability predicted for the actual class and the
 * highest probability predicted for the other classes. One hypothesis as to the
 * good performance of boosting algorithms is that they increaes the margins on
 * the training data and this gives better performance on test data.
 * 
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 10153 $
 */
public class MarginCurve implements RevisionHandler {

  /**
   * Calculates the cumulative margin distribution for the set of predictions,
   * returning the result as a set of Instances. The structure of these
   * Instances is as follows:
   * <p>
   * <ul>
   * <li><b>Margin</b> contains the margin value (which should be plotted as an
   * x-coordinate)
   * <li><b>Current</b> contains the count of instances with the current margin
   * (plot as y axis)
   * <li><b>Cumulative</b> contains the count of instances with margin less than
   * or equal to the current margin (plot as y axis)
   * </ul>
   * <p>
   * 
   * @return datapoints as a set of instances, null if no predictions have been
   *         made.
   */
  public Instances getCurve(ArrayList<Prediction> predictions) {
=======
 * Generates points illustrating the prediction margin. The margin is defined
 * as the difference between the probability predicted for the actual class and
 * the highest probability predicted for the other classes. One hypothesis
 * as to the good performance of boosting algorithms is that they increaes the
 * margins on the training data and this gives better performance on test data.
 *
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 1.11 $
 */
public class MarginCurve
  implements RevisionHandler {

  /**
   * Calculates the cumulative margin distribution for the set of
   * predictions, returning the result as a set of Instances. The
   * structure of these Instances is as follows:<p> <ul> 
   * <li> <b>Margin</b> contains the margin value (which should be plotted
   * as an x-coordinate) 
   * <li> <b>Current</b> contains the count of instances with the current 
   * margin (plot as y axis)
   * <li> <b>Cumulative</b> contains the count of instances with margin
   * less than or equal to the current margin (plot as y axis)
   * </ul> <p>
   *
   * @return datapoints as a set of instances, null if no predictions
   * have been made.  
   */
  public Instances getCurve(FastVector predictions) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (predictions.size() == 0) {
      return null;
    }

    Instances insts = makeHeader();
<<<<<<< HEAD
    double[] margins = getMargins(predictions);
    int[] sorted = Utils.sort(margins);
    int binMargin = 0;
    int totalMargin = 0;
    insts.add(makeInstance(-1, binMargin, totalMargin));
    for (int element : sorted) {
      double current = margins[element];
      double weight = ((NominalPrediction) predictions.get(element)).weight();
=======
    double [] margins = getMargins(predictions);
    int [] sorted = Utils.sort(margins);
    int binMargin = 0;
    int totalMargin = 0;
    insts.add(makeInstance(-1, binMargin, totalMargin));
    for (int i = 0; i < sorted.length; i++) {
      double current = margins[sorted[i]];
      double weight = ((NominalPrediction)predictions.elementAt(sorted[i]))
        .weight();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      totalMargin += weight;
      binMargin += weight;
      if (true) {
        insts.add(makeInstance(current, binMargin, totalMargin));
        binMargin = 0;
      }
    }
    return insts;
  }

  /**
   * Pulls all the margin values out of a vector of NominalPredictions.
<<<<<<< HEAD
   * 
   * @param predictions a FastVector containing NominalPredictions
   * @return an array of margin values.
   */
  private double[] getMargins(ArrayList<Prediction> predictions) {

    // sort by predicted probability of the desired class.
    double[] margins = new double[predictions.size()];
    for (int i = 0; i < margins.length; i++) {
      NominalPrediction pred = (NominalPrediction) predictions.get(i);
=======
   *
   * @param predictions a FastVector containing NominalPredictions
   * @return an array of margin values.
   */
  private double [] getMargins(FastVector predictions) {

    // sort by predicted probability of the desired class.
    double [] margins = new double [predictions.size()];
    for (int i = 0; i < margins.length; i++) {
      NominalPrediction pred = (NominalPrediction)predictions.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      margins[i] = pred.margin();
    }
    return margins;
  }

  /**
   * Creates an Instances object with the attributes we will be calculating.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the Instances structure.
   */
  private Instances makeHeader() {

<<<<<<< HEAD
    ArrayList<Attribute> fv = new ArrayList<Attribute>();
    fv.add(new Attribute("Margin"));
    fv.add(new Attribute("Current"));
    fv.add(new Attribute("Cumulative"));
    return new Instances("MarginCurve", fv, 100);
  }

  /**
   * Creates an Instance object with the attributes calculated.
   * 
   * @param margin the margin for this data point.
   * @param current the number of instances with this margin.
   * @param cumulative the number of instances with margin less than or equal to
   *          this margin.
=======
    FastVector fv = new FastVector();
    fv.addElement(new Attribute("Margin"));
    fv.addElement(new Attribute("Current"));
    fv.addElement(new Attribute("Cumulative"));
    return new Instances("MarginCurve", fv, 100);
  }
  
  /**
   * Creates an Instance object with the attributes calculated.
   *
   * @param margin the margin for this data point.
   * @param current the number of instances with this margin.
   * @param cumulative the number of instances with margin less than or equal
   * to this margin.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the Instance object.
   */
  private Instance makeInstance(double margin, int current, int cumulative) {

    int count = 0;
<<<<<<< HEAD
    double[] vals = new double[3];
    vals[count++] = margin;
    vals[count++] = current;
    vals[count++] = cumulative;
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
   * Tests the MarginCurve generation from the command line. The classifier is
   * currently hardcoded. Pipe in an arff file.
   * 
   * @param args currently ignored
   */
  public static void main(String[] args) {
=======
    double [] vals = new double[3];
    vals[count++] = margin;
    vals[count++] = current;
    vals[count++] = cumulative;
    return new Instance(1.0, vals);
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.11 $");
  }
  
  /**
   * Tests the MarginCurve generation from the command line.
   * The classifier is currently hardcoded. Pipe in an arff file.
   *
   * @param args currently ignored
   */
  public static void main(String [] args) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    try {
      Utils.SMALL = 0;
      Instances inst = new Instances(new java.io.InputStreamReader(System.in));
      inst.setClassIndex(inst.numAttributes() - 1);
      MarginCurve tc = new MarginCurve();
      EvaluationUtils eu = new EvaluationUtils();
<<<<<<< HEAD
      weka.classifiers.meta.LogitBoost classifier = new weka.classifiers.meta.LogitBoost();
      classifier.setNumIterations(20);
      ArrayList<Prediction> predictions = eu.getTrainTestPredictions(
        classifier, inst, inst);
=======
      weka.classifiers.meta.LogitBoost classifier 
        = new weka.classifiers.meta.LogitBoost();
      classifier.setNumIterations(20);
      FastVector predictions 
        = eu.getTrainTestPredictions(classifier, inst, inst);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      Instances result = tc.getCurve(predictions);
      System.out.println(result);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
