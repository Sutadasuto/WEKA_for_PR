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
 *    EvaluationUtils.java
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
import java.util.Random;

import weka.classifiers.Classifier;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Contains utility functions for generating lists of predictions in various
 * manners.
 * 
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 10153 $
 */
public class EvaluationUtils implements RevisionHandler {
<<<<<<< HEAD
=======
=======
import java.util.Random;

/**
 * Contains utility functions for generating lists of predictions in 
 * various manners.
 *
 * @author Len Trigg (len@reeltwo.com)
 * @version $Revision: 1.11 $
 */
public class EvaluationUtils
  implements RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Seed used to randomize data in cross-validation */
  private int m_Seed = 1;

  /** Sets the seed for randomization during cross-validation */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setSeed(int seed) {
    m_Seed = seed;
  }

  /** Gets the seed for randomization during cross-validation */
  public int getSeed() {
    return m_Seed;
  }

  /**
   * Generate a bunch of predictions ready for processing, by performing a
   * cross-validation on the supplied dataset.
   * 
<<<<<<< HEAD
=======
=======
  public void setSeed(int seed) { m_Seed = seed; }

  /** Gets the seed for randomization during cross-validation */
  public int getSeed() { return m_Seed; }
  
  /**
   * Generate a bunch of predictions ready for processing, by performing a
   * cross-validation on the supplied dataset.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param classifier the Classifier to evaluate
   * @param data the dataset
   * @param numFolds the number of folds in the cross-validation.
   * @exception Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public ArrayList<Prediction> getCVPredictions(Classifier classifier,
    Instances data, int numFolds) throws Exception {

    ArrayList<Prediction> predictions = new ArrayList<Prediction>();
<<<<<<< HEAD
=======
=======
  public FastVector getCVPredictions(Classifier classifier, 
                                     Instances data, 
                                     int numFolds) 
    throws Exception {

    FastVector predictions = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Instances runInstances = new Instances(data);
    Random random = new Random(m_Seed);
    runInstances.randomize(random);
    if (runInstances.classAttribute().isNominal() && (numFolds > 1)) {
      runInstances.stratify(numFolds);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int fold = 0; fold < numFolds; fold++) {
      Instances train = runInstances.trainCV(numFolds, fold, random);
      Instances test = runInstances.testCV(numFolds, fold);
      ArrayList<Prediction> foldPred = getTrainTestPredictions(classifier,
        train, test);
      predictions.addAll(foldPred);
    }
<<<<<<< HEAD
=======
=======
    int inst = 0;
    for (int fold = 0; fold < numFolds; fold++) {
      Instances train = runInstances.trainCV(numFolds, fold, random);
      Instances test = runInstances.testCV(numFolds, fold);
      FastVector foldPred = getTrainTestPredictions(classifier, train, test);
      predictions.appendElements(foldPred);
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return predictions;
  }

  /**
   * Generate a bunch of predictions ready for processing, by performing a
   * evaluation on a test set after training on the given training set.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param classifier the Classifier to evaluate
   * @param train the training dataset
   * @param test the test dataset
   * @exception Exception if an error occurs
   */
<<<<<<< HEAD
  public ArrayList<Prediction> getTrainTestPredictions(Classifier classifier,
    Instances train, Instances test) throws Exception {

=======
<<<<<<< HEAD
  public ArrayList<Prediction> getTrainTestPredictions(Classifier classifier,
    Instances train, Instances test) throws Exception {

=======
  public FastVector getTrainTestPredictions(Classifier classifier, 
                                            Instances train, Instances test) 
    throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    classifier.buildClassifier(train);
    return getTestPredictions(classifier, test);
  }

  /**
   * Generate a bunch of predictions ready for processing, by performing a
   * evaluation on a test set assuming the classifier is already trained.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param classifier the pre-trained Classifier to evaluate
   * @param test the test dataset
   * @exception Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public ArrayList<Prediction> getTestPredictions(Classifier classifier,
    Instances test) throws Exception {

    ArrayList<Prediction> predictions = new ArrayList<Prediction>();
    for (int i = 0; i < test.numInstances(); i++) {
      if (!test.instance(i).classIsMissing()) {
        predictions.add(getPrediction(classifier, test.instance(i)));
<<<<<<< HEAD
=======
=======
  public FastVector getTestPredictions(Classifier classifier, 
                                       Instances test) 
    throws Exception {
    
    FastVector predictions = new FastVector();
    for (int i = 0; i < test.numInstances(); i++) {
      if (!test.instance(i).classIsMissing()) {
        predictions.addElement(getPrediction(classifier, test.instance(i)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return predictions;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Generate a single prediction for a test instance given the pre-trained
   * classifier.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Generate a single prediction for a test instance given the pre-trained
   * classifier.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param classifier the pre-trained Classifier to evaluate
   * @param test the test instance
   * @exception Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Prediction getPrediction(Classifier classifier, Instance test)
    throws Exception {

    double actual = test.classValue();
    double[] dist = classifier.distributionForInstance(test);
<<<<<<< HEAD
=======
=======
  public Prediction getPrediction(Classifier classifier,
                                  Instance test)
    throws Exception {
   
    double actual = test.classValue();
    double [] dist = classifier.distributionForInstance(test);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (test.classAttribute().isNominal()) {
      return new NominalPrediction(actual, dist, test.weight());
    } else {
      return new NumericPrediction(actual, dist[0], test.weight());
    }
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
    return RevisionUtils.extract("$Revision: 10153 $");
  }
}
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.11 $");
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
