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
 *    DecisionTable.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.rules;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

import weka.attributeSelection.ASEvaluation;
import weka.attributeSelection.ASSearch;
import weka.attributeSelection.BestFirst;
import weka.attributeSelection.SubsetEvaluator;
import weka.classifiers.AbstractClassifier;
=======
import weka.attributeSelection.ASSearch;
import weka.attributeSelection.BestFirst;
import weka.attributeSelection.SubsetEvaluator;
import weka.attributeSelection.ASEvaluation;
import weka.classifiers.Classifier;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.AdditionalMeasureProducer;
import weka.core.Capabilities;
<<<<<<< HEAD
import weka.core.Capabilities.Capability;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.core.TechnicalInformation;
<<<<<<< HEAD
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

/**
 * <!-- globalinfo-start --> Class for building and using a simple decision
 * table majority classifier.<br/>
 * <br/>
 * For more information see: <br/>
 * <br/>
 * Ron Kohavi: The Power of Decision Tables. In: 8th European Conference on
 * Machine Learning, 174-189, 1995.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
import weka.core.Capabilities.Capability;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Class for building and using a simple decision table majority classifier.<br/>
 * <br/>
 * For more information see: <br/>
 * <br/>
 * Ron Kohavi: The Power of Decision Tables. In: 8th European Conference on Machine Learning, 174-189, 1995.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;inproceedings{Kohavi1995,
 *    author = {Ron Kohavi},
 *    booktitle = {8th European Conference on Machine Learning},
 *    pages = {174-189},
 *    publisher = {Springer},
 *    title = {The Power of Decision Tables},
 *    year = {1995}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
 * <!-- technical-bibtex-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -S &lt;search method specification&gt;
 *  Full class name of search method, followed
 *  by its options.
 *  eg: "weka.attributeSelection.BestFirst -D 1"
 *  (default weka.attributeSelection.BestFirst)
 * </pre>
 * 
 * <pre>
 * -X &lt;number of folds&gt;
 *  Use cross validation to evaluate features.
 *  Use number of folds = 1 for leave one out CV.
 *  (Default = leave one out CV)
 * </pre>
 * 
 * <pre>
 * -E &lt;acc | rmse | mae | auc&gt;
 *  Performance evaluation measure to use for selecting attributes.
 *  (Default = accuracy for discrete class and rmse for numeric class)
 * </pre>
 * 
 * <pre>
 * -I
 *  Use nearest neighbour instead of global table majority.
 * </pre>
 * 
 * <pre>
 * -R
 *  Display decision table rules.
 * </pre>
 * 
 * <pre>
 * Options specific to search method weka.attributeSelection.BestFirst:
 * </pre>
 * 
 * <pre>
 * -P &lt;start set&gt;
 *  Specify a starting set of attributes.
 *  Eg. 1,3,5-7.
 * </pre>
 * 
 * <pre>
 * -D &lt;0 = backward | 1 = forward | 2 = bi-directional&gt;
 *  Direction of search. (default = 1).
 * </pre>
 * 
 * <pre>
 * -N &lt;num&gt;
 *  Number of non-improving nodes to
 *  consider before terminating search.
 * </pre>
 * 
 * <pre>
 * -S &lt;num&gt;
 *  Size of lookup cache for evaluated subsets.
 *  Expressed as a multiple of the number of
 *  attributes in the data set. (default = 1)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 13387 $
 */
public class DecisionTable extends AbstractClassifier implements OptionHandler,
  WeightedInstancesHandler, AdditionalMeasureProducer,
  TechnicalInformationHandler {
=======
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -S &lt;search method specification&gt;
 *  Full class name of search method, followed
 *  by its options.
 *  eg: "weka.attributeSelection.BestFirst -D 1"
 *  (default weka.attributeSelection.BestFirst)</pre>
 * 
 * <pre> -X &lt;number of folds&gt;
 *  Use cross validation to evaluate features.
 *  Use number of folds = 1 for leave one out CV.
 *  (Default = leave one out CV)</pre>
 * 
 * <pre> -E &lt;acc | rmse | mae | auc&gt;
 *  Performance evaluation measure to use for selecting attributes.
 *  (Default = accuracy for discrete class and rmse for numeric class)</pre>
 * 
 * <pre> -I
 *  Use nearest neighbour instead of global table majority.</pre>
 * 
 * <pre> -R
 *  Display decision table rules.
 * </pre>
 * 
 * <pre> 
 * Options specific to search method weka.attributeSelection.BestFirst:
 * </pre>
 * 
 * <pre> -P &lt;start set&gt;
 *  Specify a starting set of attributes.
 *  Eg. 1,3,5-7.</pre>
 * 
 * <pre> -D &lt;0 = backward | 1 = forward | 2 = bi-directional&gt;
 *  Direction of search. (default = 1).</pre>
 * 
 * <pre> -N &lt;num&gt;
 *  Number of non-improving nodes to
 *  consider before terminating search.</pre>
 * 
 * <pre> -S &lt;num&gt;
 *  Size of lookup cache for evaluated subsets.
 *  Expressed as a multiple of the number of
 *  attributes in the data set. (default = 1)</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 12089 $ 
 */
public class DecisionTable 
  extends Classifier 
  implements OptionHandler, WeightedInstancesHandler, 
             AdditionalMeasureProducer, TechnicalInformationHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  static final long serialVersionUID = 2888557078165701326L;

  /** The hashtable used to hold training instances */
<<<<<<< HEAD
  protected Hashtable<DecisionTableHashKey, double[]> m_entries;

  /** The class priors to use when there is no match in the table */
  protected double[] m_classPriorCounts;
  protected double[] m_classPriors;

  /** Holds the final feature set */
  protected int[] m_decisionFeatures;
=======
  protected Hashtable m_entries;

  /** The class priors to use when there is no match in the table */
  protected double [] m_classPriorCounts;
  protected double [] m_classPriors;

  /** Holds the final feature set */
  protected int [] m_decisionFeatures;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Discretization filter */
  protected Filter m_disTransform;

  /** Filter used to remove columns discarded by feature selection */
  protected Remove m_delTransform;

  /** IB1 used to classify non matching instances rather than majority class */
  protected IBk m_ibk;

  /** Holds the original training instances */
  protected Instances m_theInstances;

  /** Holds the final feature selected set of instances */
  protected Instances m_dtInstances;

  /** The number of attributes in the dataset */
  protected int m_numAttributes;

  /** The number of instances in the dataset */
  private int m_numInstances;

  /** Class is nominal */
  protected boolean m_classIsNominal;

  /** Use the IBk classifier rather than majority class */
  protected boolean m_useIBk;

  /** Display Rules */
  protected boolean m_displayRules;

  /** Number of folds for cross validating feature sets */
  private int m_CVFolds;

  /** Random numbers for use in cross validation */
  private Random m_rr;

  /** Holds the majority class */
  protected double m_majority;

  /** The search method to use */
  protected ASSearch m_search = new BestFirst();

  /** Our own internal evaluator */
  protected ASEvaluation m_evaluator;

  /** The evaluation object used to evaluate subsets */
  protected Evaluation m_evaluation;

  /** default is accuracy for discrete class and RMSE for numeric class */
  public static final int EVAL_DEFAULT = 1;
  public static final int EVAL_ACCURACY = 2;
  public static final int EVAL_RMSE = 3;
  public static final int EVAL_MAE = 4;
  public static final int EVAL_AUC = 5;

<<<<<<< HEAD
  public static final Tag[] TAGS_EVALUATION = {
    new Tag(EVAL_DEFAULT,
      "Default: accuracy (discrete class); RMSE (numeric class)"),
    new Tag(EVAL_ACCURACY, "Accuracy (discrete class only"),
    new Tag(EVAL_RMSE, "RMSE (of the class probabilities for discrete class)"),
    new Tag(EVAL_MAE, "MAE (of the class probabilities for discrete class)"),
    new Tag(EVAL_AUC, "AUC (area under the ROC curve - discrete class only)") };
=======
  public static final Tag [] TAGS_EVALUATION = {
    new Tag(EVAL_DEFAULT, "Default: accuracy (discrete class); RMSE (numeric class)"),
    new Tag(EVAL_ACCURACY, "Accuracy (discrete class only"),
    new Tag(EVAL_RMSE, "RMSE (of the class probabilities for discrete class)"),
    new Tag(EVAL_MAE, "MAE (of the class probabilities for discrete class)"),
    new Tag(EVAL_AUC, "AUC (area under the ROC curve - discrete class only)")
  };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  protected int m_evaluationMeasure = EVAL_DEFAULT;

  /**
   * Returns a string describing classifier
<<<<<<< HEAD
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  public String globalInfo() {

    return "Class for building and using a simple decision table majority "
      + "classifier.\n\n" + "For more information see: \n\n"
      + getTechnicalInformation().toString();
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  @Override
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;
=======
   * @return a description suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {

    return  
    "Class for building and using a simple decision table majority "
    + "classifier.\n\n"
    + "For more information see: \n\n"
    + getTechnicalInformation().toString();
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Ron Kohavi");
    result.setValue(Field.TITLE, "The Power of Decision Tables");
<<<<<<< HEAD
    result.setValue(Field.BOOKTITLE,
      "8th European Conference on Machine Learning");
=======
    result.setValue(Field.BOOKTITLE, "8th European Conference on Machine Learning");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.setValue(Field.YEAR, "1995");
    result.setValue(Field.PAGES, "174-189");
    result.setValue(Field.PUBLISHER, "Springer");

    return result;
  }
<<<<<<< HEAD

  /**
   * Inserts an instance into the hash table
   * 
=======
  
  /**
   * Inserts an instance into the hash table
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param inst instance to be inserted
   * @param instA to create the hash key from
   * @throws Exception if the instance can't be inserted
   */
<<<<<<< HEAD
  private void insertIntoTable(Instance inst, double[] instA) throws Exception {

    double[] tempClassDist2;
    double[] newDist;
=======
  private void insertIntoTable(Instance inst, double [] instA)
  throws Exception {

    double [] tempClassDist2;
    double [] newDist;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    DecisionTableHashKey thekey;

    if (instA != null) {
      thekey = new DecisionTableHashKey(instA);
    } else {
      thekey = new DecisionTableHashKey(inst, inst.numAttributes(), false);
    }

    // see if this one is already in the table
<<<<<<< HEAD
    tempClassDist2 = m_entries.get(thekey);
    if (tempClassDist2 == null) {
      if (m_classIsNominal) {
        newDist = new double[m_theInstances.classAttribute().numValues()];

        // Leplace estimation
        for (int i = 0; i < m_theInstances.classAttribute().numValues(); i++) {
          newDist[i] = 1.0;
        }

        newDist[(int) inst.classValue()] = inst.weight();

        // add to the table
        m_entries.put(thekey, newDist);
      } else {
        newDist = new double[2];
        newDist[0] = inst.classValue() * inst.weight();
        newDist[1] = inst.weight();

        // add to the table
        m_entries.put(thekey, newDist);
      }
    } else {

      // update the distribution for this instance
      if (m_classIsNominal) {
        tempClassDist2[(int) inst.classValue()] += inst.weight();

        // update the table
        m_entries.put(thekey, tempClassDist2);
      } else {
        tempClassDist2[0] += (inst.classValue() * inst.weight());
        tempClassDist2[1] += inst.weight();

        // update the table
        m_entries.put(thekey, tempClassDist2);
=======
    tempClassDist2 = (double []) m_entries.get(thekey);
    if (tempClassDist2 == null) {
      if (m_classIsNominal) {
	newDist = new double [m_theInstances.classAttribute().numValues()];
	
	//Leplace estimation
	for (int i = 0; i < m_theInstances.classAttribute().numValues(); i++) {
	  newDist[i] = 1.0;
	}
	
	newDist[(int)inst.classValue()] = inst.weight();

	// add to the table
	m_entries.put(thekey, newDist);
      } else {
	newDist = new double [2];
	newDist[0] = inst.classValue() * inst.weight();
	newDist[1] = inst.weight();

	// add to the table
	m_entries.put(thekey, newDist);
      }
    } else { 

      // update the distribution for this instance
      if (m_classIsNominal) {
	tempClassDist2[(int)inst.classValue()]+=inst.weight();

	// update the table
	m_entries.put(thekey, tempClassDist2);
      } else  {
	tempClassDist2[0] += (inst.classValue() * inst.weight());
	tempClassDist2[1] += inst.weight();

	// update the table
	m_entries.put(thekey, tempClassDist2);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Classifies an instance for internal leave one out cross validation of
   * feature sets
   * 
=======
   * Classifies an instance for internal leave one out cross validation
   * of feature sets
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instance instance to be "left out" and classified
   * @param instA feature values of the selected features for the instance
   * @return the classification of the instance
   * @throws Exception if something goes wrong
   */
<<<<<<< HEAD
  protected double evaluateInstanceLeaveOneOut(Instance instance, double[] instA)
    throws Exception {

    // System.err.println("---------------- superclass leave-one-out ------------");
    DecisionTableHashKey thekey;
    double[] tempDist;
    double[] normDist;
=======
  double evaluateInstanceLeaveOneOut(Instance instance, double [] instA)
  throws Exception {

    DecisionTableHashKey thekey;
    double [] tempDist;
    double [] normDist;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    thekey = new DecisionTableHashKey(instA);
    if (m_classIsNominal) {

      // if this one is not in the table
<<<<<<< HEAD
      if ((tempDist = m_entries.get(thekey)) == null) {
        throw new Error("This should never happen!");
      } else {
        normDist = new double[tempDist.length];
        System.arraycopy(tempDist, 0, normDist, 0, tempDist.length);
        normDist[(int) instance.classValue()] -= instance.weight();

        // update the table
        // first check to see if the class counts are all zero now
        boolean ok = false;
        for (double element : normDist) {
          if (Utils.gr(element, 1.0)) {
            ok = true;
            break;
          }
        }

        // downdate the class prior counts
        m_classPriorCounts[(int) instance.classValue()] -= instance.weight();
        double[] classPriors = m_classPriorCounts.clone();
        Utils.normalize(classPriors);
        if (!ok) { // majority class
          normDist = classPriors;
        }

        m_classPriorCounts[(int) instance.classValue()] += instance.weight();

        // if (ok) {
        Utils.normalize(normDist);
        if (m_evaluationMeasure == EVAL_AUC) {
          m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, instance);
        } else {
          m_evaluation.evaluateModelOnce(normDist, instance);
        }
        return Utils.maxIndex(normDist);
        /*
         * } else { normDist = new double [normDist.length];
         * normDist[(int)m_majority] = 1.0; if (m_evaluationMeasure == EVAL_AUC)
         * { m_evaluation.evaluateModelOnceAndRecordPrediction(normDist,
         * instance); } else { m_evaluation.evaluateModelOnce(normDist,
         * instance); } return m_majority; }
         */
      }
      // return Utils.maxIndex(tempDist);
    } else {

      // see if this one is already in the table
      if ((tempDist = m_entries.get(thekey)) != null) {
        normDist = new double[tempDist.length];
        System.arraycopy(tempDist, 0, normDist, 0, tempDist.length);
        normDist[0] -= (instance.classValue() * instance.weight());
        normDist[1] -= instance.weight();
        if (Utils.eq(normDist[1], 0.0)) {
          double[] temp = new double[1];
          temp[0] = m_majority;
          m_evaluation.evaluateModelOnce(temp, instance);
          return m_majority;
        } else {
          double[] temp = new double[1];
          temp[0] = normDist[0] / normDist[1];
          m_evaluation.evaluateModelOnce(temp, instance);
          return temp[0];
        }
      } else {
        throw new Error("This should never happen!");
      }
    }

    // shouldn't get here
=======
      if ((tempDist = (double [])m_entries.get(thekey)) == null) {
	throw new Error("This should never happen!");
      } else {
	normDist = new double [tempDist.length];
	System.arraycopy(tempDist,0,normDist,0,tempDist.length);
	normDist[(int)instance.classValue()] -= instance.weight();

	// update the table
	// first check to see if the class counts are all zero now
	boolean ok = false;
	for (int i=0;i<normDist.length;i++) {
	  if (Utils.gr(normDist[i],1.0)) {
	    ok = true;
	    break;
	  }
	}

//	downdate the class prior counts
	m_classPriorCounts[(int)instance.classValue()] -= 
	  instance.weight();
	double [] classPriors = m_classPriorCounts.clone();
	Utils.normalize(classPriors);
	if (!ok) { // majority class
	  normDist = classPriors;
	}

	m_classPriorCounts[(int)instance.classValue()] += 
	  instance.weight();

	//if (ok) {
	Utils.normalize(normDist);
	if (m_evaluationMeasure == EVAL_AUC) {
	  m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, instance);						
	} else {
	  m_evaluation.evaluateModelOnce(normDist, instance);
	}
	return Utils.maxIndex(normDist);
	/*} else {
	  normDist = new double [normDist.length];
	  normDist[(int)m_majority] = 1.0;
	  if (m_evaluationMeasure == EVAL_AUC) {
	    m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, instance);						
	  } else {
	    m_evaluation.evaluateModelOnce(normDist, instance);
	  }
	  return m_majority;
	} */
      }
      //      return Utils.maxIndex(tempDist);
    } else {

      // see if this one is already in the table
      if ((tempDist = (double[])m_entries.get(thekey)) != null) {
	normDist = new double [tempDist.length];
	System.arraycopy(tempDist,0,normDist,0,tempDist.length);
	normDist[0] -= (instance.classValue() * instance.weight());
	normDist[1] -= instance.weight();
	if (Utils.eq(normDist[1],0.0)) {
	  double [] temp = new double[1];
	  temp[0] = m_majority;
	  m_evaluation.evaluateModelOnce(temp, instance);
	  return m_majority;
	} else {
	  double [] temp = new double[1];
	  temp[0] = normDist[0] / normDist[1];
	  m_evaluation.evaluateModelOnce(temp, instance);
	  return temp[0];
	}
      } else {
	throw new Error("This should never happen!");
      }
    }

    // shouldn't get here 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // return 0.0;
  }

  /**
<<<<<<< HEAD
   * Calculates the accuracy on a test fold for internal cross validation of
   * feature sets
   * 
=======
   * Calculates the accuracy on a test fold for internal cross validation
   * of feature sets
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param fold set of instances to be "left out" and classified
   * @param fs currently selected feature set
   * @return the accuracy for the fold
   * @throws Exception if something goes wrong
   */
<<<<<<< HEAD
  protected double evaluateFoldCV(Instances fold, int[] fs) throws Exception {

    int i;
    int numFold = fold.numInstances();
    int numCl = m_theInstances.classAttribute().numValues();
    double[][] class_distribs = new double[numFold][numCl];
    double[] instA = new double[fs.length];
    double[] normDist;
=======
  double evaluateFoldCV(Instances fold, int [] fs) throws Exception {

    int i;
    int ruleCount = 0;
    int numFold = fold.numInstances();
    int numCl = m_theInstances.classAttribute().numValues();
    double [][] class_distribs = new double [numFold][numCl];
    double [] instA = new double [fs.length];
    double [] normDist;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    DecisionTableHashKey thekey;
    double acc = 0.0;
    int classI = m_theInstances.classIndex();
    Instance inst;

    if (m_classIsNominal) {
<<<<<<< HEAD
      normDist = new double[numCl];
    } else {
      normDist = new double[2];
    }

    // first *remove* instances
    for (i = 0; i < numFold; i++) {
      inst = fold.instance(i);
      for (int j = 0; j < fs.length; j++) {
        if (fs[j] == classI) {
          instA[j] = Double.MAX_VALUE; // missing for the class
        } else if (inst.isMissing(fs[j])) {
          instA[j] = Double.MAX_VALUE;
        } else {
          instA[j] = inst.value(fs[j]);
        }
      }
      thekey = new DecisionTableHashKey(instA);
      if ((class_distribs[i] = m_entries.get(thekey)) == null) {
        throw new Error("This should never happen!");
      } else {
        if (m_classIsNominal) {
          class_distribs[i][(int) inst.classValue()] -= inst.weight();
        } else {
          class_distribs[i][0] -= (inst.classValue() * inst.weight());
          class_distribs[i][1] -= inst.weight();
        }
      }
      m_classPriorCounts[(int) inst.classValue()] -= inst.weight();
    }
    double[] classPriors = m_classPriorCounts.clone();
    Utils.normalize(classPriors);

    // now classify instances
    for (i = 0; i < numFold; i++) {
      inst = fold.instance(i);
      System.arraycopy(class_distribs[i], 0, normDist, 0, normDist.length);
      if (m_classIsNominal) {
        boolean ok = false;
        for (double element : normDist) {
          if (Utils.gr(element, 1.0)) {
            ok = true;
            break;
          }
        }

        if (!ok) { // majority class
          normDist = classPriors.clone();
        }

        // if (ok) {
        Utils.normalize(normDist);
        if (m_evaluationMeasure == EVAL_AUC) {
          m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, inst);
        } else {
          m_evaluation.evaluateModelOnce(normDist, inst);
        }
        /*
         * } else { normDist[(int)m_majority] = 1.0; if (m_evaluationMeasure ==
         * EVAL_AUC) {
         * m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, inst); }
         * else { m_evaluation.evaluateModelOnce(normDist, inst); } }
         */
      } else {
        if (Utils.eq(normDist[1], 0.0)) {
          double[] temp = new double[1];
          temp[0] = m_majority;
          m_evaluation.evaluateModelOnce(temp, inst);
        } else {
          double[] temp = new double[1];
          temp[0] = normDist[0] / normDist[1];
          m_evaluation.evaluateModelOnce(temp, inst);
        }
=======
      normDist = new double [numCl];
    } else {
      normDist = new double [2];
    }

    // first *remove* instances
    for (i=0;i<numFold;i++) {
      inst = fold.instance(i);
      for (int j=0;j<fs.length;j++) {
	if (fs[j] == classI) {
	  instA[j] = Double.MAX_VALUE; // missing for the class
	} else if (inst.isMissing(fs[j])) {
	  instA[j] = Double.MAX_VALUE;
	} else{
	  instA[j] = inst.value(fs[j]);
	}
      }
      thekey = new DecisionTableHashKey(instA);
      if ((class_distribs[i] = (double [])m_entries.get(thekey)) == null) {
	throw new Error("This should never happen!");
      } else {
	if (m_classIsNominal) {
	  class_distribs[i][(int)inst.classValue()] -= inst.weight();
	} else {
	  class_distribs[i][0] -= (inst.classValue() * inst.weight());
	  class_distribs[i][1] -= inst.weight();
	}
	ruleCount++;
      }
      m_classPriorCounts[(int)inst.classValue()] -= 
	inst.weight();	
    }
    double [] classPriors = m_classPriorCounts.clone();
    Utils.normalize(classPriors);

    // now classify instances
    for (i=0;i<numFold;i++) {
      inst = fold.instance(i);
      System.arraycopy(class_distribs[i],0,normDist,0,normDist.length);
      if (m_classIsNominal) {
	boolean ok = false;
	for (int j=0;j<normDist.length;j++) {
	  if (Utils.gr(normDist[j],1.0)) {
	    ok = true;
	    break;
	  }
	}

	if (!ok) { // majority class
	  normDist = classPriors.clone();
	}

//	if (ok) {
	Utils.normalize(normDist);
	if (m_evaluationMeasure == EVAL_AUC) {
	  m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, inst);						
	} else {
	  m_evaluation.evaluateModelOnce(normDist, inst);
	}
	/*	} else {					
	  normDist[(int)m_majority] = 1.0;
	  if (m_evaluationMeasure == EVAL_AUC) {
	    m_evaluation.evaluateModelOnceAndRecordPrediction(normDist, inst);						
	  } else {
	    m_evaluation.evaluateModelOnce(normDist, inst);					
	  }
	} */
      } else {
	if (Utils.eq(normDist[1],0.0)) {
	  double [] temp = new double[1];
	  temp[0] = m_majority;
	  m_evaluation.evaluateModelOnce(temp, inst);
	} else {
	  double [] temp = new double[1];
	  temp[0] = normDist[0] / normDist[1];
	  m_evaluation.evaluateModelOnce(temp, inst);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // now re-insert instances
<<<<<<< HEAD
    for (i = 0; i < numFold; i++) {
      inst = fold.instance(i);

      m_classPriorCounts[(int) inst.classValue()] += inst.weight();

      if (m_classIsNominal) {
        class_distribs[i][(int) inst.classValue()] += inst.weight();
      } else {
        class_distribs[i][0] += (inst.classValue() * inst.weight());
        class_distribs[i][1] += inst.weight();
=======
    for (i=0;i<numFold;i++) {
      inst = fold.instance(i);

      m_classPriorCounts[(int)inst.classValue()] += 
	inst.weight();

      if (m_classIsNominal) {
	class_distribs[i][(int)inst.classValue()] += inst.weight();
      } else {
	class_distribs[i][0] += (inst.classValue() * inst.weight());
	class_distribs[i][1] += inst.weight();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return acc;
  }

<<<<<<< HEAD
  /**
   * Evaluates a feature subset by cross validation
   * 
=======

  /**
   * Evaluates a feature subset by cross validation
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param feature_set the subset to be evaluated
   * @param num_atts the number of attributes in the subset
   * @return the estimated accuracy
   * @throws Exception if subset can't be evaluated
   */
  protected double estimatePerformance(BitSet feature_set, int num_atts)
<<<<<<< HEAD
    throws Exception {

    m_evaluation = new Evaluation(m_theInstances);
    int i;
    int[] fs = new int[num_atts];

    double[] instA = new double[num_atts];
    int classI = m_theInstances.classIndex();

    int index = 0;
    for (i = 0; i < m_numAttributes; i++) {
      if (feature_set.get(i)) {
        fs[index++] = i;
=======
  throws Exception {

    m_evaluation = new Evaluation(m_theInstances);
    int i;
    int [] fs = new int [num_atts];

    double [] instA = new double [num_atts];
    int classI = m_theInstances.classIndex();

    int index = 0;
    for (i=0;i<m_numAttributes;i++) {
      if (feature_set.get(i)) {
	fs[index++] = i;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // create new hash table
<<<<<<< HEAD
    m_entries = new Hashtable<DecisionTableHashKey, double[]>(
      (int) (m_theInstances.numInstances() * 1.5));

    // insert instances into the hash table
    for (i = 0; i < m_numInstances; i++) {

      Instance inst = m_theInstances.instance(i);
      for (int j = 0; j < fs.length; j++) {
        if (fs[j] == classI) {
          instA[j] = Double.MAX_VALUE; // missing for the class
        } else if (inst.isMissing(fs[j])) {
          instA[j] = Double.MAX_VALUE;
        } else {
          instA[j] = inst.value(fs[j]);
        }
=======
    m_entries = new Hashtable((int)(m_theInstances.numInstances() * 1.5));

    // insert instances into the hash table
    for (i=0;i<m_numInstances;i++) {

      Instance inst = m_theInstances.instance(i);
      for (int j=0;j<fs.length;j++) {
	if (fs[j] == classI) {
	  instA[j] = Double.MAX_VALUE; // missing for the class
	} else if (inst.isMissing(fs[j])) {
	  instA[j] = Double.MAX_VALUE;
	} else {
	  instA[j] = inst.value(fs[j]);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      insertIntoTable(inst, instA);
    }

<<<<<<< HEAD
    if (m_CVFolds == 1) {

      // calculate leave one out error
      for (i = 0; i < m_numInstances; i++) {
        Instance inst = m_theInstances.instance(i);
        for (int j = 0; j < fs.length; j++) {
          if (fs[j] == classI) {
            instA[j] = Double.MAX_VALUE; // missing for the class
          } else if (inst.isMissing(fs[j])) {
            instA[j] = Double.MAX_VALUE;
          } else {
            instA[j] = inst.value(fs[j]);
          }
        }
        evaluateInstanceLeaveOneOut(inst, instA);
=======

    if (m_CVFolds == 1) {

      // calculate leave one out error
      for (i=0;i<m_numInstances;i++) {
	Instance inst = m_theInstances.instance(i);
	for (int j=0;j<fs.length;j++) {
	  if (fs[j] == classI) {
	    instA[j] = Double.MAX_VALUE; // missing for the class
	  } else if (inst.isMissing(fs[j])) {
	    instA[j] = Double.MAX_VALUE;
	  } else {
	    instA[j] = inst.value(fs[j]);
	  }
	}
	evaluateInstanceLeaveOneOut(inst, instA);				
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } else {
      m_theInstances.randomize(m_rr);
      m_theInstances.stratify(m_CVFolds);

      // calculate 10 fold cross validation error
<<<<<<< HEAD
      for (i = 0; i < m_CVFolds; i++) {
        Instances insts = m_theInstances.testCV(m_CVFolds, i);
        evaluateFoldCV(insts, fs);
=======
      for (i=0;i<m_CVFolds;i++) {
	Instances insts = m_theInstances.testCV(m_CVFolds,i);
	evaluateFoldCV(insts, fs);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    switch (m_evaluationMeasure) {
    case EVAL_DEFAULT:
      if (m_classIsNominal) {
<<<<<<< HEAD
        return m_evaluation.pctCorrect();
=======
	return m_evaluation.pctCorrect();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return -m_evaluation.rootMeanSquaredError();
    case EVAL_ACCURACY:
      return m_evaluation.pctCorrect();
    case EVAL_RMSE:
      return -m_evaluation.rootMeanSquaredError();
    case EVAL_MAE:
      return -m_evaluation.meanAbsoluteError();
    case EVAL_AUC:
<<<<<<< HEAD
      double[] classPriors = m_evaluation.getClassPriors();
      Utils.normalize(classPriors);
      double weightedAUC = 0;
      for (i = 0; i < m_theInstances.classAttribute().numValues(); i++) {
        double tempAUC = m_evaluation.areaUnderROC(i);
        if (!Utils.isMissingValue(tempAUC)) {
          weightedAUC += (classPriors[i] * tempAUC);
        } else {
          System.err.println("Undefined AUC!!");
        }
=======
      double [] classPriors = m_evaluation.getClassPriors();
      Utils.normalize(classPriors);
      double weightedAUC = 0;
      for (i = 0; i < m_theInstances.classAttribute().numValues(); i++) {
	double tempAUC = m_evaluation.areaUnderROC(i);
	if (!Instance.isMissingValue(tempAUC)) {
	  weightedAUC += (classPriors[i] * tempAUC);
	} else {
	  System.err.println("Undefined AUC!!");
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return weightedAUC;
    }
    // shouldn't get here
    return 0.0;
  }

  /**
<<<<<<< HEAD
   * Resets the options.
   */
  protected void resetOptions() {
=======
   * Returns a String representation of a feature subset
   *
   * @param sub BitSet representation of a subset
   * @return String containing subset
   */
  private String printSub(BitSet sub) {

    String s="";
    for (int jj=0;jj<m_numAttributes;jj++) {
      if (sub.get(jj)) {
	s += " "+(jj+1);
      }
    }
    return s;
  }

  /**
   * Resets the options.
   */
  protected void resetOptions()  {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_entries = null;
    m_decisionFeatures = null;
    m_useIBk = false;
    m_CVFolds = 1;
    m_displayRules = false;
    m_evaluationMeasure = EVAL_DEFAULT;
  }

  /**
   * Constructor for a DecisionTable
   */
  public DecisionTable() {

    resetOptions();
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(6);

    newVector.addElement(new Option(
      "\tFull class name of search method, followed\n" + "\tby its options.\n"
        + "\teg: \"weka.attributeSelection.BestFirst -D 1\"\n"
        + "\t(default weka.attributeSelection.BestFirst)", "S", 1,
      "-S <search method specification>"));

    newVector.addElement(new Option(
      "\tUse cross validation to evaluate features.\n"
        + "\tUse number of folds = 1 for leave one out CV.\n"
        + "\t(Default = leave one out CV)", "X", 1, "-X <number of folds>"));

    newVector
      .addElement(new Option(
        "\tPerformance evaluation measure to use for selecting attributes.\n"
          + "\t(Default = accuracy for discrete class and rmse for numeric class)",
        "E", 1, "-E <acc | rmse | mae | auc>"));

    newVector
      .addElement(new Option(
        "\tUse nearest neighbour instead of global table majority.", "I", 0,
        "-I"));

    newVector.addElement(new Option("\tDisplay decision table rules.\n", "R",
      0, "-R"));

    newVector.addAll(Collections.list(super.listOptions()));

    newVector.addElement(new Option("", "", 0,
      "\nOptions specific to search method " + m_search.getClass().getName()
        + ":"));
    newVector
      .addAll(Collections.list(((OptionHandler) m_search).listOptions()));

=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(7);

    newVector.addElement(new Option(
	"\tFull class name of search method, followed\n"
	+ "\tby its options.\n"
	+ "\teg: \"weka.attributeSelection.BestFirst -D 1\"\n"
	+ "\t(default weka.attributeSelection.BestFirst)",
	"S", 1, "-S <search method specification>"));

    newVector.addElement(new Option(
	"\tUse cross validation to evaluate features.\n" +
	"\tUse number of folds = 1 for leave one out CV.\n" +
	"\t(Default = leave one out CV)",
	"X", 1, "-X <number of folds>"));

    newVector.addElement(new Option(
	"\tPerformance evaluation measure to use for selecting attributes.\n" +
	"\t(Default = accuracy for discrete class and rmse for numeric class)",
	"E", 1, "-E <acc | rmse | mae | auc>"));

    newVector.addElement(new Option(
	"\tUse nearest neighbour instead of global table majority.",
	"I", 0, "-I"));

    newVector.addElement(new Option(
	"\tDisplay decision table rules.\n",
	"R", 0, "-R")); 

    newVector.addElement(new Option(
	"",
	"", 0, "\nOptions specific to search method "
	+ m_search.getClass().getName() + ":"));
    Enumeration enu = ((OptionHandler)m_search).listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return newVector.elements();
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String crossValTipText() {
    return "Sets the number of folds for cross validation (1 = leave one out).";
  }

  /**
   * Sets the number of folds for cross validation (1 = leave one out)
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param folds the number of folds
   */
  public void setCrossVal(int folds) {

    m_CVFolds = folds;
  }

  /**
   * Gets the number of folds for cross validation
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the number of cross validation folds
   */
  public int getCrossVal() {

    return m_CVFolds;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String useIBkTipText() {
    return "Sets whether IBk should be used instead of the majority class.";
  }

  /**
   * Sets whether IBk should be used instead of the majority class
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param ibk true if IBk is to be used
   */
  public void setUseIBk(boolean ibk) {

    m_useIBk = ibk;
  }

  /**
   * Gets whether IBk is being used instead of the majority class
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if IBk is being used
   */
  public boolean getUseIBk() {

    return m_useIBk;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String displayRulesTipText() {
    return "Sets whether rules are to be printed.";
  }

  /**
   * Sets whether rules are to be printed
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rules true if rules are to be printed
   */
  public void setDisplayRules(boolean rules) {

    m_displayRules = rules;
  }

  /**
   * Gets whether rules are being printed
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if rules are being printed
   */
  public boolean getDisplayRules() {

    return m_displayRules;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String searchTipText() {
    return "The search method used to find good attribute combinations for the "
      + "decision table.";
  }

=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String searchTipText() {
    return "The search method used to find good attribute combinations for the "
    + "decision table.";
  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Sets the search method to use
   * 
   * @param search
   */
  public void setSearch(ASSearch search) {
    m_search = search;
  }

  /**
   * Gets the current search method
   * 
   * @return the search method used
   */
  public ASSearch getSearch() {
    return m_search;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String evaluationMeasureTipText() {
    return "The measure used to evaluate the performance of attribute combinations "
      + "used in the decision table.";
  }

=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String evaluationMeasureTipText() {
    return "The measure used to evaluate the performance of attribute combinations "
    + "used in the decision table.";
  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Gets the currently set performance evaluation measure used for selecting
   * attributes for the decision table
   * 
   * @return the performance evaluation measure
   */
  public SelectedTag getEvaluationMeasure() {
    return new SelectedTag(m_evaluationMeasure, TAGS_EVALUATION);
  }

  /**
<<<<<<< HEAD
   * Sets the performance evaluation measure to use for selecting attributes for
   * the decision table
=======
   * Sets the performance evaluation measure to use for selecting attributes
   * for the decision table
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param newMethod the new performance evaluation metric to use
   */
  public void setEvaluationMeasure(SelectedTag newMethod) {
    if (newMethod.getTags() == TAGS_EVALUATION) {
      m_evaluationMeasure = newMethod.getSelectedTag().getID();
    }
  }

  /**
<<<<<<< HEAD
   * Parses the options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -S &lt;search method specification&gt;
   *  Full class name of search method, followed
   *  by its options.
   *  eg: "weka.attributeSelection.BestFirst -D 1"
   *  (default weka.attributeSelection.BestFirst)
   * </pre>
   * 
   * <pre>
   * -X &lt;number of folds&gt;
   *  Use cross validation to evaluate features.
   *  Use number of folds = 1 for leave one out CV.
   *  (Default = leave one out CV)
   * </pre>
   * 
   * <pre>
   * -E &lt;acc | rmse | mae | auc&gt;
   *  Performance evaluation measure to use for selecting attributes.
   *  (Default = accuracy for discrete class and rmse for numeric class)
   * </pre>
   * 
   * <pre>
   * -I
   *  Use nearest neighbour instead of global table majority.
   * </pre>
   * 
   * <pre>
   * -R
   *  Display decision table rules.
   * </pre>
   * 
   * <pre>
   * Options specific to search method weka.attributeSelection.BestFirst:
   * </pre>
   * 
   * <pre>
   * -P &lt;start set&gt;
   *  Specify a starting set of attributes.
   *  Eg. 1,3,5-7.
   * </pre>
   * 
   * <pre>
   * -D &lt;0 = backward | 1 = forward | 2 = bi-directional&gt;
   *  Direction of search. (default = 1).
   * </pre>
   * 
   * <pre>
   * -N &lt;num&gt;
   *  Number of non-improving nodes to
   *  consider before terminating search.
   * </pre>
   * 
   * <pre>
   * -S &lt;num&gt;
   *  Size of lookup cache for evaluated subsets.
   *  Expressed as a multiple of the number of
   *  attributes in the data set. (default = 1)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
=======
   * Parses the options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -S &lt;search method specification&gt;
   *  Full class name of search method, followed
   *  by its options.
   *  eg: "weka.attributeSelection.BestFirst -D 1"
   *  (default weka.attributeSelection.BestFirst)</pre>
   * 
   * <pre> -X &lt;number of folds&gt;
   *  Use cross validation to evaluate features.
   *  Use number of folds = 1 for leave one out CV.
   *  (Default = leave one out CV)</pre>
   * 
   * <pre> -E &lt;acc | rmse | mae | auc&gt;
   *  Performance evaluation measure to use for selecting attributes.
   *  (Default = accuracy for discrete class and rmse for numeric class)</pre>
   * 
   * <pre> -I
   *  Use nearest neighbour instead of global table majority.</pre>
   * 
   * <pre> -R
   *  Display decision table rules.
   * </pre>
   * 
   * <pre> 
   * Options specific to search method weka.attributeSelection.BestFirst:
   * </pre>
   * 
   * <pre> -P &lt;start set&gt;
   *  Specify a starting set of attributes.
   *  Eg. 1,3,5-7.</pre>
   * 
   * <pre> -D &lt;0 = backward | 1 = forward | 2 = bi-directional&gt;
   *  Direction of search. (default = 1).</pre>
   * 
   * <pre> -N &lt;num&gt;
   *  Number of non-improving nodes to
   *  consider before terminating search.</pre>
   * 
   * <pre> -S &lt;num&gt;
   *  Size of lookup cache for evaluated subsets.
   *  Expressed as a multiple of the number of
   *  attributes in the data set. (default = 1)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {

    String optionString;

    resetOptions();

<<<<<<< HEAD
    super.setOptions(options);

    optionString = Utils.getOption('X', options);
=======
    optionString = Utils.getOption('X',options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (optionString.length() != 0) {
      m_CVFolds = Integer.parseInt(optionString);
    }

<<<<<<< HEAD
    m_useIBk = Utils.getFlag('I', options);

    m_displayRules = Utils.getFlag('R', options);
=======
    m_useIBk = Utils.getFlag('I',options);

    m_displayRules = Utils.getFlag('R',options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    optionString = Utils.getOption('E', options);
    if (optionString.length() != 0) {
      if (optionString.equals("acc")) {
<<<<<<< HEAD
        setEvaluationMeasure(new SelectedTag(EVAL_ACCURACY, TAGS_EVALUATION));
      } else if (optionString.equals("rmse")) {
        setEvaluationMeasure(new SelectedTag(EVAL_RMSE, TAGS_EVALUATION));
      } else if (optionString.equals("mae")) {
        setEvaluationMeasure(new SelectedTag(EVAL_MAE, TAGS_EVALUATION));
      } else if (optionString.equals("auc")) {
        setEvaluationMeasure(new SelectedTag(EVAL_AUC, TAGS_EVALUATION));
      } else {
        throw new IllegalArgumentException("Invalid evaluation measure");
=======
	setEvaluationMeasure(new SelectedTag(EVAL_ACCURACY, TAGS_EVALUATION));
      } else if (optionString.equals("rmse")) {
	setEvaluationMeasure(new SelectedTag(EVAL_RMSE, TAGS_EVALUATION));
      } else if (optionString.equals("mae")) {
	setEvaluationMeasure(new SelectedTag(EVAL_MAE, TAGS_EVALUATION));
      } else if (optionString.equals("auc")) {
	setEvaluationMeasure(new SelectedTag(EVAL_AUC, TAGS_EVALUATION));
      } else {
	throw new IllegalArgumentException("Invalid evaluation measure");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    String searchString = Utils.getOption('S', options);
<<<<<<< HEAD
    if (searchString.length() == 0) {
      searchString = weka.attributeSelection.BestFirst.class.getName();
    }
    String[] searchSpec = Utils.splitOptions(searchString);
=======
    if (searchString.length() == 0)
      searchString = weka.attributeSelection.BestFirst.class.getName();
    String [] searchSpec = Utils.splitOptions(searchString);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (searchSpec.length == 0) {
      throw new IllegalArgumentException("Invalid search specification string");
    }
    String searchName = searchSpec[0];
    searchSpec[0] = "";
    setSearch(ASSearch.forName(searchName, searchSpec));
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the classifier.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    options.add("-X");
    options.add("" + m_CVFolds);

    if (m_evaluationMeasure != EVAL_DEFAULT) {
      options.add("-E");
      switch (m_evaluationMeasure) {
      case EVAL_ACCURACY:
        options.add("acc");
        break;
      case EVAL_RMSE:
        options.add("rmse");
        break;
      case EVAL_MAE:
        options.add("mae");
        break;
      case EVAL_AUC:
        options.add("auc");
        break;
      }
    }
    if (m_useIBk) {
      options.add("-I");
    }
    if (m_displayRules) {
      options.add("-R");
    }

    options.add("-S");
    options.add("" + getSearchSpec());

    Collections.addAll(options, super.getOptions());

    return options.toArray(new String[0]);
  }

  /**
   * Gets the search specification string, which contains the class name of the
   * search method and any options to it
   * 
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [9];
    int current = 0;

    options[current++] = "-X"; options[current++] = "" + m_CVFolds;

    if (m_evaluationMeasure != EVAL_DEFAULT) {
      options[current++] = "-E";
      switch (m_evaluationMeasure) {
      case EVAL_ACCURACY:
	options[current++] = "acc";
	break;
      case EVAL_RMSE:
	options[current++] = "rmse";
	break;
      case EVAL_MAE:
	options[current++] = "mae";
	break;
      case EVAL_AUC:
	options[current++] = "auc";
	break;
      }
    }
    if (m_useIBk) {
      options[current++] = "-I";
    }
    if (m_displayRules) {
      options[current++] = "-R";
    }

    options[current++] = "-S";
    options[current++] = "" + getSearchSpec();

    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }

  /**
   * Gets the search specification string, which contains the class name of
   * the search method and any options to it
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the search string.
   */
  protected String getSearchSpec() {

    ASSearch s = getSearch();
    if (s instanceof OptionHandler) {
      return s.getClass().getName() + " "
<<<<<<< HEAD
        + Utils.joinOptions(((OptionHandler) s).getOptions());
=======
      + Utils.joinOptions(((OptionHandler)s).getOptions());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return s.getClass().getName();
  }

  /**
   * Returns default capabilities of the classifier.
<<<<<<< HEAD
   * 
   * @return the capabilities of this classifier
   */
  @Override
=======
   *
   * @return      the capabilities of this classifier
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NOMINAL_CLASS);
    if (m_evaluationMeasure != EVAL_ACCURACY && m_evaluationMeasure != EVAL_AUC) {
      result.enable(Capability.NUMERIC_CLASS);
      result.enable(Capability.DATE_CLASS);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.enable(Capability.MISSING_CLASS_VALUES);

    return result;
  }
<<<<<<< HEAD

  private class DummySubsetEvaluator extends ASEvaluation implements
    SubsetEvaluator {
    /** for serialization */
    private static final long serialVersionUID = 3927442457704974150L;

    @Override
    public void buildEvaluator(Instances data) throws Exception {
    }

    @Override
    public double evaluateSubset(BitSet subset) throws Exception {

      int fc = 0;
      for (int jj = 0; jj < m_numAttributes; jj++) {
=======
  
  private class DummySubsetEvaluator extends ASEvaluation implements SubsetEvaluator {
    /** for serialization */
    private static final long serialVersionUID = 3927442457704974150L;
      
    public void buildEvaluator(Instances data) throws Exception {
    }

    public double evaluateSubset(BitSet subset) throws Exception {

      int fc = 0;
      for (int jj = 0;jj < m_numAttributes; jj++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (subset.get(jj)) {
          fc++;
        }
      }

      return estimatePerformance(subset, fc);
    }
  }

  /**
<<<<<<< HEAD
   * Sets up a dummy subset evaluator that basically just delegates evaluation
   * to the estimatePerformance method in DecisionTable
=======
   * Sets up a dummy subset evaluator that basically just delegates
   * evaluation to the estimatePerformance method in DecisionTable
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void setUpEvaluator() throws Exception {
    m_evaluator = new DummySubsetEvaluator();
  }

  protected boolean m_saveMemory = true;
<<<<<<< HEAD

  /**
   * Generates the classifier.
   * 
   * @param data set of instances serving as training data
   * @throws Exception if the classifier has not been generated successfully
   */
  @Override
=======
  /**
   * Generates the classifier.
   *
   * @param data set of instances serving as training data 
   * @throws Exception if the classifier has not been generated successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void buildClassifier(Instances data) throws Exception {

    // can classifier handle the data?
    getCapabilities().testWithFail(data);

    // remove instances with missing class
    m_theInstances = new Instances(data);
    m_theInstances.deleteWithMissingClass();

    m_rr = new Random(1);

<<<<<<< HEAD
    if (m_theInstances.classAttribute().isNominal()) {// Set up class priors
      m_classPriorCounts = new double[data.classAttribute().numValues()];
      Arrays.fill(m_classPriorCounts, 1.0);
      for (int i = 0; i < data.numInstances(); i++) {
        Instance curr = data.instance(i);
        m_classPriorCounts[(int) curr.classValue()] += curr.weight();
=======
    if (m_theInstances.classAttribute().isNominal())  {//	 Set up class priors
      m_classPriorCounts = 
	new double [data.classAttribute().numValues()];
      Arrays.fill(m_classPriorCounts, 1.0);
      for (int i = 0; i <data.numInstances(); i++) {
	Instance curr = data.instance(i);
	m_classPriorCounts[(int)curr.classValue()] += 
	  curr.weight();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      m_classPriors = m_classPriorCounts.clone();
      Utils.normalize(m_classPriors);
    }

    setUpEvaluator();

    if (m_theInstances.classAttribute().isNumeric()) {
      m_disTransform = new weka.filters.unsupervised.attribute.Discretize();
      m_classIsNominal = false;

      // use binned discretisation if the class is numeric
<<<<<<< HEAD
      ((weka.filters.unsupervised.attribute.Discretize) m_disTransform)
        .setBins(10);
      ((weka.filters.unsupervised.attribute.Discretize) m_disTransform)
        .setInvertSelection(true);

      // Discretize all attributes EXCEPT the class
      String rangeList = "";
      rangeList += (m_theInstances.classIndex() + 1);
      // System.out.println("The class col: "+m_theInstances.classIndex());

      ((weka.filters.unsupervised.attribute.Discretize) m_disTransform)
        .setAttributeIndices(rangeList);
    } else {
      m_disTransform = new weka.filters.supervised.attribute.Discretize();
      ((weka.filters.supervised.attribute.Discretize) m_disTransform)
        .setUseBetterEncoding(true);
=======
      ((weka.filters.unsupervised.attribute.Discretize)m_disTransform).
      setBins(10);
      ((weka.filters.unsupervised.attribute.Discretize)m_disTransform).
      setInvertSelection(true);

      // Discretize all attributes EXCEPT the class 
      String rangeList = "";
      rangeList+=(m_theInstances.classIndex()+1);
      //System.out.println("The class col: "+m_theInstances.classIndex());

      ((weka.filters.unsupervised.attribute.Discretize)m_disTransform).
      setAttributeIndices(rangeList);
    } else {
      m_disTransform = new weka.filters.supervised.attribute.Discretize();
      ((weka.filters.supervised.attribute.Discretize)m_disTransform).setUseBetterEncoding(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_classIsNominal = true;
    }

    m_disTransform.setInputFormat(m_theInstances);
    m_theInstances = Filter.useFilter(m_theInstances, m_disTransform);

    m_numAttributes = m_theInstances.numAttributes();
    m_numInstances = m_theInstances.numInstances();
    m_majority = m_theInstances.meanOrMode(m_theInstances.classAttribute());

    // Perform the search
<<<<<<< HEAD
    int[] selected = m_search.search(m_evaluator, m_theInstances);

    m_decisionFeatures = new int[selected.length + 1];
    System.arraycopy(selected, 0, m_decisionFeatures, 0, selected.length);
    m_decisionFeatures[m_decisionFeatures.length - 1] = m_theInstances
      .classIndex();
=======
    int [] selected = m_search.search(m_evaluator, m_theInstances);

    m_decisionFeatures = new int [selected.length+1];
    System.arraycopy(selected, 0, m_decisionFeatures, 0, selected.length);
    m_decisionFeatures[m_decisionFeatures.length-1] = m_theInstances.classIndex();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // reduce instances to selected features
    m_delTransform = new Remove();
    m_delTransform.setInvertSelection(true);

    // set features to keep
<<<<<<< HEAD
    m_delTransform.setAttributeIndicesArray(m_decisionFeatures);
=======
    m_delTransform.setAttributeIndicesArray(m_decisionFeatures); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_delTransform.setInputFormat(m_theInstances);
    m_dtInstances = Filter.useFilter(m_theInstances, m_delTransform);

    // reset the number of attributes
    m_numAttributes = m_dtInstances.numAttributes();

    // create hash table
<<<<<<< HEAD
    m_entries = new Hashtable<DecisionTableHashKey, double[]>(
      (int) (m_dtInstances.numInstances() * 1.5));
=======
    m_entries = new Hashtable((int)(m_dtInstances.numInstances() * 1.5));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // insert instances into the hash table
    for (int i = 0; i < m_numInstances; i++) {
      Instance inst = m_dtInstances.instance(i);
      insertIntoTable(inst, null);
    }

    // Replace the global table majority with nearest neighbour?
    if (m_useIBk) {
      m_ibk = new IBk();
      m_ibk.buildClassifier(m_dtInstances);
    }

    // Save memory
    if (m_saveMemory) {
      m_theInstances = new Instances(m_theInstances, 0);
      m_dtInstances = new Instances(m_dtInstances, 0);
    }
    m_evaluation = null;
  }

  /**
<<<<<<< HEAD
   * Calculates the class membership probabilities for the given test instance.
   * 
=======
   * Calculates the class membership probabilities for the given 
   * test instance.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instance the instance to be classified
   * @return predicted class probability distribution
   * @throws Exception if distribution can't be computed
   */
<<<<<<< HEAD
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {

    DecisionTableHashKey thekey;
    double[] tempDist;
    double[] normDist;
=======
  public double [] distributionForInstance(Instance instance)
  throws Exception {

    DecisionTableHashKey thekey;
    double [] tempDist;
    double [] normDist;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_disTransform.input(instance);
    m_disTransform.batchFinished();
    instance = m_disTransform.output();

    m_delTransform.input(instance);
    m_delTransform.batchFinished();
    instance = m_delTransform.output();

    thekey = new DecisionTableHashKey(instance, instance.numAttributes(), false);

    // if this one is not in the table
<<<<<<< HEAD
    if ((tempDist = m_entries.get(thekey)) == null) {
      if (m_useIBk) {
        tempDist = m_ibk.distributionForInstance(instance);
      } else {
        if (!m_classIsNominal) {
          tempDist = new double[1];
          tempDist[0] = m_majority;
        } else {
          tempDist = m_classPriors.clone();
          /*
           * tempDist = new double
           * [m_theInstances.classAttribute().numValues()];
           * tempDist[(int)m_majority] = 1.0;
           */
        }
      }
    } else {
      if (!m_classIsNominal) {
        normDist = new double[1];
        normDist[0] = (tempDist[0] / tempDist[1]);
        tempDist = normDist;
      } else {

        // normalise distribution
        normDist = new double[tempDist.length];
        System.arraycopy(tempDist, 0, normDist, 0, tempDist.length);
        Utils.normalize(normDist);
        tempDist = normDist;
=======
    if ((tempDist = (double [])m_entries.get(thekey)) == null) {
      if (m_useIBk) {
	tempDist = m_ibk.distributionForInstance(instance);
      } else {
	if (!m_classIsNominal) {
	  tempDist = new double[1];
	  tempDist[0] = m_majority;
	} else {
	  tempDist = m_classPriors.clone();
	  /*tempDist = new double [m_theInstances.classAttribute().numValues()];
	  tempDist[(int)m_majority] = 1.0; */
	}
      }
    } else {
      if (!m_classIsNominal) {
	normDist = new double[1];
	normDist[0] = (tempDist[0] / tempDist[1]);
	tempDist = normDist;
      } else {

	// normalise distribution
	normDist = new double [tempDist.length];
	System.arraycopy(tempDist,0,normDist,0,tempDist.length);
	Utils.normalize(normDist);
	tempDist = normDist;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return tempDist;
  }

  /**
   * Returns a string description of the features selected
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a string of features
   */
  public String printFeatures() {

    int i;
    String s = "";

<<<<<<< HEAD
    for (i = 0; i < m_decisionFeatures.length; i++) {
      if (i == 0) {
        s = "" + (m_decisionFeatures[i] + 1);
      } else {
        s += "," + (m_decisionFeatures[i] + 1);
=======
    for (i=0;i<m_decisionFeatures.length;i++) {
      if (i==0) {
	s = ""+(m_decisionFeatures[i]+1);
      } else {
	s += ","+(m_decisionFeatures[i]+1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return s;
  }

  /**
   * Returns the number of rules
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the number of rules
   */
  public double measureNumRules() {
    return m_entries.size();
  }

  /**
   * Returns an enumeration of the additional measure names
<<<<<<< HEAD
   * 
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration<String> enumerateMeasures() {
    Vector<String> newVector = new Vector<String>(1);
=======
   * @return an enumeration of the measure names
   */
  public Enumeration enumerateMeasures() {
    Vector newVector = new Vector(1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    newVector.addElement("measureNumRules");
    return newVector.elements();
  }

  /**
   * Returns the value of the named measure
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param additionalMeasureName the name of the measure to query for its value
   * @return the value of the named measure
   * @throws IllegalArgumentException if the named measure is not supported
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public double getMeasure(String additionalMeasureName) {
    if (additionalMeasureName.compareToIgnoreCase("measureNumRules") == 0) {
      return measureNumRules();
    } else {
<<<<<<< HEAD
      throw new IllegalArgumentException(additionalMeasureName
        + " not supported (DecisionTable)");
=======
      throw new IllegalArgumentException(additionalMeasureName 
	  + " not supported (DecisionTable)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Returns a description of the classifier.
<<<<<<< HEAD
   * 
   * @return a description of the classifier as a string.
   */
  @Override
=======
   *
   * @return a description of the classifier as a string.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String toString() {

    if (m_entries == null) {
      return "Decision Table: No model built yet.";
    } else {
      StringBuffer text = new StringBuffer();

<<<<<<< HEAD
      text.append("Decision Table:" + "\n\nNumber of training instances: "
        + m_numInstances + "\nNumber of Rules : " + m_entries.size() + "\n");

      if (m_useIBk) {
        text.append("Non matches covered by IB1.\n");
      } else {
        text.append("Non matches covered by Majority class.\n");
      }

      text.append(m_search.toString());
      /*
       * text.append("Best first search for feature set,\nterminated after "+
       * m_maxStale+" non improving subsets.\n");
       */

      text.append("Evaluation (for feature selection): CV ");
      if (m_CVFolds > 1) {
        text.append("(" + m_CVFolds + " fold) ");
      } else {
        text.append("(leave one out) ");
      }
      text.append("\nFeature set: " + printFeatures());

      if (m_displayRules) {

        // find out the max column width
        int maxColWidth = 0;
        for (int i = 0; i < m_dtInstances.numAttributes(); i++) {
          if (m_dtInstances.attribute(i).name().length() > maxColWidth) {
            maxColWidth = m_dtInstances.attribute(i).name().length();
          }

          if (m_classIsNominal || (i != m_dtInstances.classIndex())) {
            Enumeration<Object> e = m_dtInstances.attribute(i)
              .enumerateValues();
            while (e.hasMoreElements()) {
              String ss = (String) e.nextElement();
              if (ss.length() > maxColWidth) {
                maxColWidth = ss.length();
              }
            }
          }
        }

        text.append("\n\nRules:\n");
        StringBuffer tm = new StringBuffer();
        for (int i = 0; i < m_dtInstances.numAttributes(); i++) {
          if (m_dtInstances.classIndex() != i) {
            int d = maxColWidth - m_dtInstances.attribute(i).name().length();
            tm.append(m_dtInstances.attribute(i).name());
            for (int j = 0; j < d + 1; j++) {
              tm.append(" ");
            }
          }
        }
        tm.append(m_dtInstances.attribute(m_dtInstances.classIndex()).name()
          + "  ");

        for (int i = 0; i < tm.length() + 10; i++) {
          text.append("=");
        }
        text.append("\n");
        text.append(tm);
        text.append("\n");
        for (int i = 0; i < tm.length() + 10; i++) {
          text.append("=");
        }
        text.append("\n");

        Enumeration<DecisionTableHashKey> e = m_entries.keys();
        while (e.hasMoreElements()) {
          DecisionTableHashKey tt = e.nextElement();
          text.append(tt.toString(m_dtInstances, maxColWidth));
          double[] ClassDist = m_entries.get(tt);

          if (m_classIsNominal) {
            int m = Utils.maxIndex(ClassDist);
            try {
              text.append(m_dtInstances.classAttribute().value(m) + "\n");
            } catch (Exception ee) {
              System.out.println(ee.getMessage());
            }
          } else {
            text.append((ClassDist[0] / ClassDist[1]) + "\n");
          }
        }

        for (int i = 0; i < tm.length() + 10; i++) {
          text.append("=");
        }
        text.append("\n");
        text.append("\n");
=======
      text.append("Decision Table:"+
	  "\n\nNumber of training instances: "+m_numInstances+
	  "\nNumber of Rules : "+m_entries.size()+"\n");

      if (m_useIBk) {
	text.append("Non matches covered by IB1.\n");
      } else {
	text.append("Non matches covered by Majority class.\n");
      }

      text.append(m_search.toString());
      /*text.append("Best first search for feature set,\nterminated after "+
					m_maxStale+" non improving subsets.\n"); */

      text.append("Evaluation (for feature selection): CV ");
      if (m_CVFolds > 1) {
	text.append("("+m_CVFolds+" fold) ");
      } else {
	text.append("(leave one out) ");
      }
      text.append("\nFeature set: "+printFeatures());

      if (m_displayRules) {

	// find out the max column width
	int maxColWidth = 0;
	for (int i=0;i<m_dtInstances.numAttributes();i++) {
	  if (m_dtInstances.attribute(i).name().length() > maxColWidth) {
	    maxColWidth = m_dtInstances.attribute(i).name().length();
	  }

	  if (m_classIsNominal || (i != m_dtInstances.classIndex())) {
	    Enumeration e = m_dtInstances.attribute(i).enumerateValues();
	    while (e.hasMoreElements()) {
	      String ss = (String)e.nextElement();
	      if (ss.length() > maxColWidth) {
		maxColWidth = ss.length();
	      }
	    }
	  }
	}

	text.append("\n\nRules:\n");
	StringBuffer tm = new StringBuffer();
	for (int i=0;i<m_dtInstances.numAttributes();i++) {
	  if (m_dtInstances.classIndex() != i) {
	    int d = maxColWidth - m_dtInstances.attribute(i).name().length();
	    tm.append(m_dtInstances.attribute(i).name());
	    for (int j=0;j<d+1;j++) {
	      tm.append(" ");
	    }
	  }
	}
	tm.append(m_dtInstances.attribute(m_dtInstances.classIndex()).name()+"  ");

	for (int i=0;i<tm.length()+10;i++) {
	  text.append("=");
	}
	text.append("\n");
	text.append(tm);
	text.append("\n");
	for (int i=0;i<tm.length()+10;i++) {
	  text.append("=");
	}
	text.append("\n");

	Enumeration e = m_entries.keys();
	while (e.hasMoreElements()) {
	  DecisionTableHashKey tt = (DecisionTableHashKey)e.nextElement();
	  text.append(tt.toString(m_dtInstances,maxColWidth));
	  double [] ClassDist = (double []) m_entries.get(tt);

	  if (m_classIsNominal) {
	    int m = Utils.maxIndex(ClassDist);
	    try {
	      text.append(m_dtInstances.classAttribute().value(m)+"\n");
	    } catch (Exception ee) {
	      System.out.println(ee.getMessage());
	    }
	  } else {
	    text.append((ClassDist[0] / ClassDist[1])+"\n");
	  }
	}

	for (int i=0;i<tm.length()+10;i++) {
	  text.append("=");
	}
	text.append("\n");
	text.append("\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return text.toString();
    }
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 13387 $");
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 12089 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv the command-line options
   */
  public static void main(String[] argv) {
=======
   *
   * @param argv the command-line options
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runClassifier(new DecisionTable(), argv);
  }
}
