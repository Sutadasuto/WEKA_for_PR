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
 *    RemoveMisclassified.java
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

package weka.filters.unsupervised.instance;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.core.*;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

/**
 * <!-- globalinfo-start --> A filter that removes instances which are
 * incorrectly classified. Useful for removing outliers.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -W &lt;classifier specification&gt;
 *  Full class name of classifier to use, followed
 *  by scheme options. eg:
 *   "weka.classifiers.bayes.NaiveBayes -D"
 *  (default: weka.classifiers.rules.ZeroR)
 * </pre>
 * 
 * <pre>
 * -C &lt;class index&gt;
 *  Attribute on which misclassifications are based.
 *  If &lt; 0 will use any current set class or default to the last attribute.
 * </pre>
 * 
 * <pre>
 * -F &lt;number of folds&gt;
 *  The number of folds to use for cross-validation cleansing.
 *  (&lt;2 = no cross-validation - default).
 * </pre>
 * 
 * <pre>
 * -T &lt;threshold&gt;
 *  Threshold for the max error when predicting numeric class.
 *  (Value should be &gt;= 0, default = 0.1).
 * </pre>
 * 
 * <pre>
 * -I
 *  The maximum number of cleansing iterations to perform.
 *  (&lt;1 = until fully cleansed - default)
 * </pre>
 * 
 * <pre>
 * -V
 *  Invert the match so that correctly classified instances are discarded.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class RemoveMisclassified extends Filter implements UnsupervisedFilter,
  OptionHandler, WeightedAttributesHandler, WeightedInstancesHandler {

<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.UnsupervisedFilter;

import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * A filter that removes instances which are incorrectly classified. Useful for removing outliers.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -W &lt;classifier specification&gt;
 *  Full class name of classifier to use, followed
 *  by scheme options. eg:
 *   "weka.classifiers.bayes.NaiveBayes -D"
 *  (default: weka.classifiers.rules.ZeroR)</pre>
 * 
 * <pre> -C &lt;class index&gt;
 *  Attribute on which misclassifications are based.
 *  If &lt; 0 will use any current set class or default to the last attribute.</pre>
 * 
 * <pre> -F &lt;number of folds&gt;
 *  The number of folds to use for cross-validation cleansing.
 *  (&lt;2 = no cross-validation - default).</pre>
 * 
 * <pre> -T &lt;threshold&gt;
 *  Threshold for the max error when predicting numeric class.
 *  (Value should be &gt;= 0, default = 0.1).</pre>
 * 
 * <pre> -I
 *  The maximum number of cleansing iterations to perform.
 *  (&lt;1 = until fully cleansed - default)</pre>
 * 
 * <pre> -V
 *  Invert the match so that correctly classified instances are discarded.
 * </pre>
 * 
 <!-- options-end -->
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
 * @version $Revision: 5548 $
 */
public class RemoveMisclassified 
  extends Filter 
  implements UnsupervisedFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = 5469157004717663171L;

  /** The classifier used to do the cleansing */
  protected Classifier m_cleansingClassifier = new weka.classifiers.rules.ZeroR();

  /** The attribute to treat as the class for purposes of cleansing. */
  protected int m_classIndex = -1;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * The number of cross validation folds to perform (&lt;2 = no cross
   * validation)
   */
  protected int m_numOfCrossValidationFolds = 0;

  /**
   * The maximum number of cleansing iterations to perform (&lt;1 = until fully
   * cleansed)
   */
<<<<<<< HEAD
=======
=======
  /** The number of cross validation folds to perform (&lt;2 = no cross validation)  */
  protected int m_numOfCrossValidationFolds = 0;
  
  /** The maximum number of cleansing iterations to perform (&lt;1 = until fully cleansed)  */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected int m_numOfCleansingIterations = 0;

  /** The threshold for deciding when a numeric value is correctly classified */
  protected double m_numericClassifyThreshold = 0.1;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Whether to invert the match so the correctly classified instances are
   * discarded
   */
<<<<<<< HEAD
=======
=======
  /** Whether to invert the match so the correctly classified instances are discarded */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected boolean m_invertMatching = false;

  /** Have we processed the first batch (i.e. training data)? */
  protected boolean m_firstBatchFinished = false;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;

<<<<<<< HEAD
=======
=======
  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities 	result;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (getClassifier() == null) {
      result = super.getCapabilities();
      result.disableAll();
    } else {
      result = getClassifier().getCapabilities();
    }
<<<<<<< HEAD

    result.setMinimumNumberInstances(0);

=======
<<<<<<< HEAD

    result.setMinimumNumberInstances(0);

=======
    
    result.setMinimumNumberInstances(0);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Sets the format of the input instances.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the inputFormat can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

<<<<<<< HEAD
=======
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the inputFormat can't be set successfully 
   */ 
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setInputFormat(instanceInfo);
    setOutputFormat(instanceInfo);
    m_firstBatchFinished = false;
    return true;
  }

  /**
   * Cleanses the data based on misclassifications when used training data.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param data the data to train with and cleanse
   * @return the cleansed data
   * @throws Exception if something goes wrong
   */
  private Instances cleanseTrain(Instances data) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Instance inst;
    Instances buildSet = new Instances(data);
    Instances temp;
    Instances inverseSet = new Instances(data, data.numInstances());
<<<<<<< HEAD
=======
=======
    
    Instance inst;
    Instances buildSet = new Instances(data);  
    Instances temp = new Instances(data, data.numInstances());
    Instances inverseSet = new Instances(data, data.numInstances()); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int count = 0;
    double ans;
    int iterations = 0;
    int classIndex = m_classIndex;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (classIndex < 0) {
      classIndex = data.classIndex();
    }
    if (classIndex < 0) {
      classIndex = data.numAttributes() - 1;
    }

    // loop until perfect
    while (count != buildSet.numInstances()) {

      // check if hit maximum number of iterations
      iterations++;
      if (m_numOfCleansingIterations > 0
        && iterations > m_numOfCleansingIterations) {
        break;
      }
<<<<<<< HEAD
=======
=======
    if (classIndex < 0) classIndex = data.classIndex();
    if (classIndex < 0) classIndex = data.numAttributes()-1;

    // loop until perfect
    while(count != buildSet.numInstances()) {
      
      // check if hit maximum number of iterations
      iterations++;
      if (m_numOfCleansingIterations > 0 && iterations > m_numOfCleansingIterations) break;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // build classifier
      count = buildSet.numInstances();
      buildSet.setClassIndex(classIndex);
      m_cleansingClassifier.buildClassifier(buildSet);

      temp = new Instances(buildSet, buildSet.numInstances());

      // test on training data
      for (int i = 0; i < buildSet.numInstances(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        inst = buildSet.instance(i);
        ans = m_cleansingClassifier.classifyInstance(inst);
        if (buildSet.classAttribute().isNumeric()) {
          if (ans >= inst.classValue() - m_numericClassifyThreshold
            && ans <= inst.classValue() + m_numericClassifyThreshold) {
            temp.add(inst);
          } else if (m_invertMatching) {
            inverseSet.add(inst);
          }
        } else { // class is nominal
          if (ans == inst.classValue()) {
            temp.add(inst);
          } else if (m_invertMatching) {
            inverseSet.add(inst);
          }
        }
<<<<<<< HEAD
=======
=======
	inst = buildSet.instance(i);
	ans = m_cleansingClassifier.classifyInstance(inst);
	if (buildSet.classAttribute().isNumeric()) {
	  if (ans >= inst.classValue() - m_numericClassifyThreshold &&
	      ans <= inst.classValue() + m_numericClassifyThreshold) {
	    temp.add(inst);
	  } else if (m_invertMatching) {
	    inverseSet.add(inst);
	  }
	}
	else { //class is nominal
	  if (ans == inst.classValue()) {
	    temp.add(inst);
	  } else if (m_invertMatching) {
	    inverseSet.add(inst);
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      buildSet = temp;
    }

    if (m_invertMatching) {
      inverseSet.setClassIndex(data.classIndex());
      return inverseSet;
<<<<<<< HEAD
    } else {
=======
<<<<<<< HEAD
    } else {
=======
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      buildSet.setClassIndex(data.classIndex());
      return buildSet;
    }
  }

  /**
<<<<<<< HEAD
   * Cleanses the data based on misclassifications when performing
   * cross-validation.
   * 
=======
<<<<<<< HEAD
   * Cleanses the data based on misclassifications when performing
   * cross-validation.
   * 
=======
   * Cleanses the data based on misclassifications when performing cross-validation.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param data the data to train with and cleanse
   * @return the cleansed data
   * @throws Exception if something goes wrong
   */
  private Instances cleanseCross(Instances data) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Instance inst;
    Instances crossSet = new Instances(data);
    Instances temp = new Instances(data, data.numInstances());
    Instances inverseSet = new Instances(data, data.numInstances());
<<<<<<< HEAD
=======
=======
    
    Instance inst;
    Instances crossSet = new Instances(data);
    Instances temp = new Instances(data, data.numInstances());    
    Instances inverseSet = new Instances(data, data.numInstances()); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int count = 0;
    double ans;
    int iterations = 0;
    int classIndex = m_classIndex;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (classIndex < 0) {
      classIndex = data.classIndex();
    }
    if (classIndex < 0) {
      classIndex = data.numAttributes() - 1;
    }

    // loop until perfect
    while (count != crossSet.numInstances()
      && crossSet.numInstances() >= m_numOfCrossValidationFolds) {

      count = crossSet.numInstances();

      // check if hit maximum number of iterations
      iterations++;
      if (m_numOfCleansingIterations > 0
        && iterations > m_numOfCleansingIterations) {
        break;
      }
<<<<<<< HEAD
=======
=======
    if (classIndex < 0) classIndex = data.classIndex();
    if (classIndex < 0) classIndex = data.numAttributes()-1;

    // loop until perfect
    while (count != crossSet.numInstances() && 
	   crossSet.numInstances() >= m_numOfCrossValidationFolds) {

      count = crossSet.numInstances();
      
      // check if hit maximum number of iterations
      iterations++;
      if (m_numOfCleansingIterations > 0 && iterations > m_numOfCleansingIterations) break;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      crossSet.setClassIndex(classIndex);

      if (crossSet.classAttribute().isNominal()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        crossSet.stratify(m_numOfCrossValidationFolds);
      }
      // do the folds
      temp = new Instances(crossSet, crossSet.numInstances());

      for (int fold = 0; fold < m_numOfCrossValidationFolds; fold++) {
        Instances train = crossSet.trainCV(m_numOfCrossValidationFolds, fold);
        m_cleansingClassifier.buildClassifier(train);
        Instances test = crossSet.testCV(m_numOfCrossValidationFolds, fold);
        // now test
        for (int i = 0; i < test.numInstances(); i++) {
          inst = test.instance(i);
          ans = m_cleansingClassifier.classifyInstance(inst);
          if (crossSet.classAttribute().isNumeric()) {
            if (ans >= inst.classValue() - m_numericClassifyThreshold
              && ans <= inst.classValue() + m_numericClassifyThreshold) {
              temp.add(inst);
            } else if (m_invertMatching) {
              inverseSet.add(inst);
            }
          } else { // class is nominal
            if (ans == inst.classValue()) {
              temp.add(inst);
            } else if (m_invertMatching) {
              inverseSet.add(inst);
            }
          }
        }
<<<<<<< HEAD
=======
=======
	crossSet.stratify(m_numOfCrossValidationFolds);
      }
      // do the folds
      temp = new Instances(crossSet, crossSet.numInstances());
      
      for (int fold = 0; fold < m_numOfCrossValidationFolds; fold++) {
	Instances train = crossSet.trainCV(m_numOfCrossValidationFolds, fold);
	m_cleansingClassifier.buildClassifier(train);
	Instances test = crossSet.testCV(m_numOfCrossValidationFolds, fold);
	//now test
	for (int i = 0; i < test.numInstances(); i++) {
	  inst = test.instance(i);
	  ans = m_cleansingClassifier.classifyInstance(inst);
	  if (crossSet.classAttribute().isNumeric()) {
	    if (ans >= inst.classValue() - m_numericClassifyThreshold &&
		ans <= inst.classValue() + m_numericClassifyThreshold) {
	      temp.add(inst);
	    } else if (m_invertMatching) {
	      inverseSet.add(inst);
	    }
	  }
	  else { //class is nominal
	    if (ans == inst.classValue()) {
	      temp.add(inst);
	    } else if (m_invertMatching) {
	      inverseSet.add(inst);
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      crossSet = temp;
    }

    if (m_invertMatching) {
      inverseSet.setClassIndex(data.classIndex());
      return inverseSet;
<<<<<<< HEAD
    } else {
=======
<<<<<<< HEAD
    } else {
=======
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      crossSet.setClassIndex(data.classIndex());
      return crossSet;
    }

  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Input an instance for filtering.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws NullPointerException if the input format has not been defined.
   * @throws Exception if the input instance was not of the correct format or if
   *           there was a problem with the filtering.
   */
  @Override
<<<<<<< HEAD
=======
=======
 
  /**
   * Input an instance for filtering.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws NullPointerException if the input format has not been
   * defined.
   * @throws Exception if the input instance was not of the correct 
   * format or if there was a problem with the filtering.  
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean input(Instance instance) throws Exception {

    if (inputFormatPeek() == null) {
      throw new NullPointerException("No input instance format defined");
    }

    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }
    if (m_firstBatchFinished) {
      push(instance);
      return true;
    } else {
      bufferInput(instance);
      return false;
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Signify that this batch of input to the filter is finished.
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
<<<<<<< HEAD
=======
=======
 
  /**
   * Signify that this batch of input to the filter is finished.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined 
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean batchFinished() throws Exception {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }

    if (!m_firstBatchFinished) {

      Instances filtered;
      if (m_numOfCrossValidationFolds < 2) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        filtered = cleanseTrain(getInputFormat());
      } else {
        filtered = cleanseCross(getInputFormat());
      }

      for (int i = 0; i < filtered.numInstances(); i++) {
        push(filtered.instance(i), false); // No need to copy
      }

<<<<<<< HEAD
=======
=======
	filtered = cleanseTrain(getInputFormat());
      } else {
	filtered = cleanseCross(getInputFormat());
      }
      
      for (int i=0; i<filtered.numInstances(); i++) {
	push(filtered.instance(i));
      }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_firstBatchFinished = true;
      flushInput();
    }
    m_NewBatch = true;
    return (numPendingOutput() != 0);
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(6);

    newVector.addElement(new Option(
      "\tFull class name of classifier to use, followed\n"
        + "\tby scheme options. eg:\n"
        + "\t\t\"weka.classifiers.bayes.NaiveBayes -D\"\n"
        + "\t(default: weka.classifiers.rules.ZeroR)", "W", 1,
      "-W <classifier specification>"));
    newVector
      .addElement(new Option(
        "\tAttribute on which misclassifications are based.\n"
          + "\tIf < 0 will use any current set class or default to the last attribute.",
        "C", 1, "-C <class index>"));
    newVector.addElement(new Option(
      "\tThe number of folds to use for cross-validation cleansing.\n"
        + "\t(<2 = no cross-validation - default).", "F", 1,
      "-F <number of folds>"));
    newVector
      .addElement(new Option(
        "\tThreshold for the max error when predicting numeric class.\n"
          + "\t(Value should be >= 0, default = 0.1).", "T", 1,
        "-T <threshold>"));
    newVector.addElement(new Option(
      "\tThe maximum number of cleansing iterations to perform.\n"
        + "\t(<1 = until fully cleansed - default)", "I", 1, "-I"));
    newVector
      .addElement(new Option(
        "\tInvert the match so that correctly classified instances are discarded.\n",
        "V", 0, "-V"));

    return newVector.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -W &lt;classifier specification&gt;
   *  Full class name of classifier to use, followed
   *  by scheme options. eg:
   *   "weka.classifiers.bayes.NaiveBayes -D"
   *  (default: weka.classifiers.rules.ZeroR)
   * </pre>
   * 
   * <pre>
   * -C &lt;class index&gt;
   *  Attribute on which misclassifications are based.
   *  If &lt; 0 will use any current set class or default to the last attribute.
   * </pre>
   * 
   * <pre>
   * -F &lt;number of folds&gt;
   *  The number of folds to use for cross-validation cleansing.
   *  (&lt;2 = no cross-validation - default).
   * </pre>
   * 
   * <pre>
   * -T &lt;threshold&gt;
   *  Threshold for the max error when predicting numeric class.
   *  (Value should be &gt;= 0, default = 0.1).
   * </pre>
   * 
   * <pre>
   * -I
   *  The maximum number of cleansing iterations to perform.
   *  (&lt;1 = until fully cleansed - default)
   * </pre>
   * 
   * <pre>
   * -V
   *  Invert the match so that correctly classified instances are discarded.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    String classifierString = Utils.getOption('W', options);
    if (classifierString.length() == 0) {
      classifierString = weka.classifiers.rules.ZeroR.class.getName();
    }
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    
    Vector newVector = new Vector(6);
    
    newVector.addElement(new Option(
	      "\tFull class name of classifier to use, followed\n"
	      + "\tby scheme options. eg:\n"
	      + "\t\t\"weka.classifiers.bayes.NaiveBayes -D\"\n"
	      + "\t(default: weka.classifiers.rules.ZeroR)",
	      "W", 1, "-W <classifier specification>"));
    newVector.addElement(new Option(
	      "\tAttribute on which misclassifications are based.\n"
	      + "\tIf < 0 will use any current set class or default to the last attribute.",
	      "C", 1, "-C <class index>"));
    newVector.addElement(new Option(
	      "\tThe number of folds to use for cross-validation cleansing.\n"
	      +"\t(<2 = no cross-validation - default).",
	      "F", 1, "-F <number of folds>"));
    newVector.addElement(new Option(
	      "\tThreshold for the max error when predicting numeric class.\n"
	      +"\t(Value should be >= 0, default = 0.1).",
	      "T", 1, "-T <threshold>"));
    newVector.addElement(new Option(
	      "\tThe maximum number of cleansing iterations to perform.\n"
	      +"\t(<1 = until fully cleansed - default)",
	      "I", 1,"-I"));
    newVector.addElement(new Option(
	      "\tInvert the match so that correctly classified instances are discarded.\n",
	      "V", 0,"-V"));
    
    return newVector.elements();
  }


  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -W &lt;classifier specification&gt;
   *  Full class name of classifier to use, followed
   *  by scheme options. eg:
   *   "weka.classifiers.bayes.NaiveBayes -D"
   *  (default: weka.classifiers.rules.ZeroR)</pre>
   * 
   * <pre> -C &lt;class index&gt;
   *  Attribute on which misclassifications are based.
   *  If &lt; 0 will use any current set class or default to the last attribute.</pre>
   * 
   * <pre> -F &lt;number of folds&gt;
   *  The number of folds to use for cross-validation cleansing.
   *  (&lt;2 = no cross-validation - default).</pre>
   * 
   * <pre> -T &lt;threshold&gt;
   *  Threshold for the max error when predicting numeric class.
   *  (Value should be &gt;= 0, default = 0.1).</pre>
   * 
   * <pre> -I
   *  The maximum number of cleansing iterations to perform.
   *  (&lt;1 = until fully cleansed - default)</pre>
   * 
   * <pre> -V
   *  Invert the match so that correctly classified instances are discarded.
   * </pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {

    String classifierString = Utils.getOption('W', options);
    if (classifierString.length() == 0)
      classifierString = weka.classifiers.rules.ZeroR.class.getName();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String[] classifierSpec = Utils.splitOptions(classifierString);
    if (classifierSpec.length == 0) {
      throw new Exception("Invalid classifier specification string");
    }
    String classifierName = classifierSpec[0];
    classifierSpec[0] = "";
<<<<<<< HEAD
    setClassifier(AbstractClassifier.forName(classifierName, classifierSpec));
=======
<<<<<<< HEAD
    setClassifier(AbstractClassifier.forName(classifierName, classifierSpec));
=======
    setClassifier(Classifier.forName(classifierName, classifierSpec));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    String cString = Utils.getOption('C', options);
    if (cString.length() != 0) {
      setClassIndex((new Double(cString)).intValue());
    } else {
      setClassIndex(-1);
    }

    String fString = Utils.getOption('F', options);
    if (fString.length() != 0) {
      setNumFolds((new Double(fString)).intValue());
    } else {
      setNumFolds(0);
    }

    String tString = Utils.getOption('T', options);
    if (tString.length() != 0) {
      setThreshold((new Double(tString)).doubleValue());
    } else {
      setThreshold(0.1);
    }

    String iString = Utils.getOption('I', options);
    if (iString.length() != 0) {
      setMaxIterations((new Double(iString)).intValue());
    } else {
      setMaxIterations(0);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (Utils.getFlag('V', options)) {
      setInvert(true);
    } else {
      setInvert(false);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Utils.checkForRemainingOptions(options);

  }

  /**
   * Gets the current settings of the filter.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    options.add("-W");
    options.add("" + getClassifierSpec());
    options.add("-C");
    options.add("" + getClassIndex());
    options.add("-F");
    options.add("" + getNumFolds());
    options.add("-T");
    options.add("" + getThreshold());
    options.add("-I");
    options.add("" + getMaxIterations());
    if (getInvert()) {
      options.add("-V");
    }

    return options.toArray(new String[0]);
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [15];
    int current = 0;

    options[current++] = "-W"; options[current++] = "" + getClassifierSpec();
    options[current++] = "-C"; options[current++] = "" + getClassIndex();
    options[current++] = "-F"; options[current++] = "" + getNumFolds();
    options[current++] = "-T"; options[current++] = "" + getThreshold();
    options[current++] = "-I"; options[current++] = "" + getMaxIterations();
    if (getInvert()) {
      options[current++] = "-V";
    }
    
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns a string describing this filter
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "A filter that removes instances which are incorrectly classified. "
<<<<<<< HEAD
=======
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "A filter that removes instances which are incorrectly classified. "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "Useful for removing outliers.";
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String classifierTipText() {

    return "The classifier upon which to base the misclassifications.";
  }

  /**
   * Sets the classifier to classify instances with.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param classifier The classifier to be used (with its options set).
   */
  public void setClassifier(Classifier classifier) {

    m_cleansingClassifier = classifier;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the classifier used by the filter.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets the classifier used by the filter.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return The classifier to be used.
   */
  public Classifier getClassifier() {

    return m_cleansingClassifier;
  }

  /**
   * Gets the classifier specification string, which contains the class name of
   * the classifier and any options to the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the classifier string.
   */
  protected String getClassifierSpec() {

    Classifier c = getClassifier();
    if (c instanceof OptionHandler) {
      return c.getClass().getName() + " "
        + Utils.joinOptions(((OptionHandler) c).getOptions());
<<<<<<< HEAD
=======
=======
   *
   * @return the classifier string.
   */
  protected String getClassifierSpec() {
    
    Classifier c = getClassifier();
    if (c instanceof OptionHandler) {
      return c.getClass().getName() + " "
	+ Utils.joinOptions(((OptionHandler)c).getOptions());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return c.getClass().getName();
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String classIndexTipText() {

    return "Index of the class upon which to base the misclassifications. "
      + "If < 0 will use any current set class or default to the last attribute.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the attribute on which misclassifications are based. If &lt; 0 will
   * use any current set class or default to the last attribute.
   * 
   * @param classIndex the class index.
   */
  public void setClassIndex(int classIndex) {

<<<<<<< HEAD
=======
=======
   * Sets the attribute on which misclassifications are based.
   * If &lt; 0 will use any current set class or default to the last attribute.
   *
   * @param classIndex the class index.
   */
  public void setClassIndex(int classIndex) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_classIndex = classIndex;
  }

  /**
   * Gets the attribute on which misclassifications are based.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the class index.
   */
  public int getClassIndex() {

    return m_classIndex;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numFoldsTipText() {

    return "The number of cross-validation folds to use. If < 2 then no cross-validation will be performed.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the number of cross-validation folds to use - &lt; 2 means no
   * cross-validation.
   * 
   * @param numOfFolds the number of folds.
   */
  public void setNumFolds(int numOfFolds) {

<<<<<<< HEAD
=======
=======
   * Sets the number of cross-validation folds to use
   * - &lt; 2 means no cross-validation.
   *
   * @param numOfFolds the number of folds.
   */
  public void setNumFolds(int numOfFolds) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_numOfCrossValidationFolds = numOfFolds;
  }

  /**
   * Gets the number of cross-validation folds used by the filter.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the number of folds.
   */
  public int getNumFolds() {

    return m_numOfCrossValidationFolds;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String thresholdTipText() {

    return "Threshold for the max allowable error when predicting a numeric class. Should be >= 0.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the threshold for the max error when predicting a numeric class. The
   * value should be &gt;= 0.
   * 
   * @param threshold the numeric theshold.
   */
  public void setThreshold(double threshold) {

<<<<<<< HEAD
=======
=======
   * Sets the threshold for the max error when predicting a numeric class.
   * The value should be &gt;= 0.
   *
   * @param threshold the numeric theshold.
   */
  public void setThreshold(double threshold) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_numericClassifyThreshold = threshold;
  }

  /**
   * Gets the threshold for the max error when predicting a numeric class.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the numeric threshold.
   */
  public double getThreshold() {

    return m_numericClassifyThreshold;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String maxIterationsTipText() {

    return "The maximum number of iterations to perform. < 1 means filter will go until fully cleansed.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the maximum number of cleansing iterations to perform - &lt; 1 means
   * go until fully cleansed
   * 
   * @param iterations the maximum number of iterations.
   */
  public void setMaxIterations(int iterations) {

<<<<<<< HEAD
=======
=======
   * Sets the maximum number of cleansing iterations to perform
   * - &lt; 1 means go until fully cleansed
   *
   * @param iterations the maximum number of iterations.
   */
  public void setMaxIterations(int iterations) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_numOfCleansingIterations = iterations;
  }

  /**
   * Gets the maximum number of cleansing iterations performed
<<<<<<< HEAD
   * 
   * @return the maximum number of iterations.
=======
<<<<<<< HEAD
   * 
   * @return the maximum number of iterations.
=======
   *
   * @return the maximum number of iterations. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public int getMaxIterations() {

    return m_numOfCleansingIterations;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String invertTipText() {

    return "Whether or not to invert the selection. If true, correctly classified instances will be discarded.";
  }

  /**
   * Set whether selection is inverted.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param invert whether or not to invert selection.
   */
  public void setInvert(boolean invert) {

<<<<<<< HEAD
=======
=======
   *
   * @param invert whether or not to invert selection.
   */
  public void setInvert(boolean invert) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_invertMatching = invert;
  }

  /**
   * Get whether selection is inverted.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return whether or not selection is inverted.
   */
  public boolean getInvert() {

    return m_invertMatching;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
<<<<<<< HEAD
=======
=======
   *
   * @return whether or not selection is inverted.
   */
  public boolean getInvert() {
    
    return m_invertMatching;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5548 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
<<<<<<< HEAD
=======
=======
   *
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    runFilter(new RemoveMisclassified(), argv);
  }
}
