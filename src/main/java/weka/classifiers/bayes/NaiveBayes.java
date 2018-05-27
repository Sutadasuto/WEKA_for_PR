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
 *    NaiveBayes.java
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

package weka.classifiers.bayes;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.core.*;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Capabilities.Capability;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.estimators.DiscreteEstimator;
import weka.estimators.Estimator;
import weka.estimators.KernelEstimator;
import weka.estimators.NormalEstimator;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> Class for a Naive Bayes classifier using estimator
 * classes. Numeric estimator precision values are chosen based on analysis of
 * the training data. For this reason, the classifier is not an
 * UpdateableClassifier (which in typical usage are initialized with zero
 * training instances) -- if you need the UpdateableClassifier functionality,
 * use the NaiveBayesUpdateable classifier. The NaiveBayesUpdateable classifier
 * will use a default precision of 0.1 for numeric attributes when
 * buildClassifier is called with zero training instances.<br/>
 * <br/>
 * For more information on Naive Bayes classifiers, see<br/>
 * <br/>
 * George H. John, Pat Langley: Estimating Continuous Distributions in Bayesian
 * Classifiers. In: Eleventh Conference on Uncertainty in Artificial
 * Intelligence, San Mateo, 338-345, 1995.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Class for a Naive Bayes classifier using estimator classes. Numeric estimator precision values are chosen based on analysis of the  training data. For this reason, the classifier is not an UpdateableClassifier (which in typical usage are initialized with zero training instances) -- if you need the UpdateableClassifier functionality, use the NaiveBayesUpdateable classifier. The NaiveBayesUpdateable classifier will  use a default precision of 0.1 for numeric attributes when buildClassifier is called with zero training instances.<br/>
 * <br/>
 * For more information on Naive Bayes classifiers, see<br/>
 * <br/>
 * George H. John, Pat Langley: Estimating Continuous Distributions in Bayesian Classifiers. In: Eleventh Conference on Uncertainty in Artificial Intelligence, San Mateo, 338-345, 1995.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <pre>
 * &#64;inproceedings{John1995,
 *    address = {San Mateo},
 *    author = {George H. John and Pat Langley},
 *    booktitle = {Eleventh Conference on Uncertainty in Artificial Intelligence},
 *    pages = {338-345},
 *    publisher = {Morgan Kaufmann},
 *    title = {Estimating Continuous Distributions in Bayesian Classifiers},
 *    year = {1995}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <!-- technical-bibtex-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -K
 *  Use kernel density estimator rather than normal
 *  distribution for numeric attributes
 * </pre>
 * 
 * <pre>
 * -D
 *  Use supervised discretization to process numeric attributes
 * </pre>
 * 
 * <pre>
 * -O
 *  Display model in old format (good when there are many classes)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class NaiveBayes extends AbstractClassifier implements OptionHandler,
  WeightedInstancesHandler, WeightedAttributesHandler, TechnicalInformationHandler,
  Aggregateable<NaiveBayes> {
<<<<<<< HEAD
=======
=======
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -K
 *  Use kernel density estimator rather than normal
 *  distribution for numeric attributes</pre>
 * 
 * <pre> -D
 *  Use supervised discretization to process numeric attributes
 * </pre>
 *
 * <pre> -O
 *  Display model in old format (good when there are many classes)
 * </pre>
 * 
 <!-- options-end -->
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 5516 $
 */
public class NaiveBayes extends Classifier 
implements OptionHandler, WeightedInstancesHandler, 
           TechnicalInformationHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  static final long serialVersionUID = 5995231201785697655L;

  /** The attribute estimators. */
<<<<<<< HEAD
  protected Estimator[][] m_Distributions;
=======
<<<<<<< HEAD
  protected Estimator[][] m_Distributions;
=======
  protected Estimator [][] m_Distributions;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The class estimator. */
  protected Estimator m_ClassDistribution;

  /**
<<<<<<< HEAD
   * Whether to use kernel density estimator rather than normal distribution for
   * numeric attributes
=======
<<<<<<< HEAD
   * Whether to use kernel density estimator rather than normal distribution for
   * numeric attributes
=======
   * Whether to use kernel density estimator rather than normal distribution
   * for numeric attributes
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected boolean m_UseKernelEstimator = false;

  /**
<<<<<<< HEAD
   * Whether to use discretization than normal distribution for numeric
   * attributes
=======
<<<<<<< HEAD
   * Whether to use discretization than normal distribution for numeric
   * attributes
=======
   * Whether to use discretization than normal distribution
   * for numeric attributes
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected boolean m_UseDiscretization = false;

  /** The number of classes (or 1 for numeric class) */
  protected int m_NumClasses;

  /**
<<<<<<< HEAD
   * The dataset header for the purposes of printing out a semi-intelligible
   * model
=======
<<<<<<< HEAD
   * The dataset header for the purposes of printing out a semi-intelligible
   * model
=======
   * The dataset header for the purposes of printing out a semi-intelligible 
   * model 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected Instances m_Instances;

  /*** The precision parameter used for numeric attributes */
  protected static final double DEFAULT_NUM_PRECISION = 0.01;

  /**
   * The discretization filter.
   */
  protected weka.filters.supervised.attribute.Discretize m_Disc = null;

  protected boolean m_displayModelInOldFormat = false;

  /**
   * Returns a string describing this classifier
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the classifier suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class for a Naive Bayes classifier using estimator classes. Numeric"
      + " estimator precision values are chosen based on analysis of the "
      + " training data. For this reason, the classifier is not an"
      + " UpdateableClassifier (which in typical usage are initialized with zero"
      + " training instances) -- if you need the UpdateableClassifier functionality,"
      + " use the NaiveBayesUpdateable classifier. The NaiveBayesUpdateable"
      + " classifier will  use a default precision of 0.1 for numeric attributes"
      + " when buildClassifier is called with zero training instances.\n\n"
      + "For more information on Naive Bayes classifiers, see\n\n"
<<<<<<< HEAD
=======
=======
   * @return a description of the classifier suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class for a Naive Bayes classifier using estimator classes. Numeric"
      +" estimator precision values are chosen based on analysis of the "
      +" training data. For this reason, the classifier is not an"
      +" UpdateableClassifier (which in typical usage are initialized with zero"
      +" training instances) -- if you need the UpdateableClassifier functionality,"
      +" use the NaiveBayesUpdateable classifier. The NaiveBayesUpdateable"
      +" classifier will  use a default precision of 0.1 for numeric attributes"
      +" when buildClassifier is called with zero training instances.\n\n"
      +"For more information on Naive Bayes classifiers, see\n\n"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + getTechnicalInformation().toString();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  @Override
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;

    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "George H. John and Pat Langley");
    result.setValue(Field.TITLE,
      "Estimating Continuous Distributions in Bayesian Classifiers");
    result.setValue(Field.BOOKTITLE,
      "Eleventh Conference on Uncertainty in Artificial Intelligence");
<<<<<<< HEAD
=======
=======
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;

    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "George H. John and Pat Langley");
    result.setValue(Field.TITLE, "Estimating Continuous Distributions in Bayesian Classifiers");
    result.setValue(Field.BOOKTITLE, "Eleventh Conference on Uncertainty in Artificial Intelligence");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.setValue(Field.YEAR, "1995");
    result.setValue(Field.PAGES, "338-345");
    result.setValue(Field.PUBLISHER, "Morgan Kaufmann");
    result.setValue(Field.ADDRESS, "San Mateo");

    return result;
  }

  /**
   * Returns default capabilities of the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of this classifier
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return      the capabilities of this classifier
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
<<<<<<< HEAD
    result.enable( Capability.MISSING_VALUES );
=======
<<<<<<< HEAD
    result.enable( Capability.MISSING_VALUES );
=======
    result.enable(Capability.MISSING_VALUES);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

    // instances
    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * Generates the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param instances set of instances serving as training data
   * @exception Exception if the classifier has not been generated successfully
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param instances set of instances serving as training data 
   * @exception Exception if the classifier has not been generated 
   * successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void buildClassifier(Instances instances) throws Exception {

    // can classifier handle the data?
    getCapabilities().testWithFail(instances);

    // remove instances with missing class
    instances = new Instances(instances);
    instances.deleteWithMissingClass();

    m_NumClasses = instances.numClasses();

    // Copy the instances
    m_Instances = new Instances(instances);

    // Discretize instances if required
    if (m_UseDiscretization) {
      m_Disc = new weka.filters.supervised.attribute.Discretize();
      m_Disc.setInputFormat(m_Instances);
      m_Instances = weka.filters.Filter.useFilter(m_Instances, m_Disc);
    } else {
      m_Disc = null;
    }

    // Reserve space for the distributions
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Distributions = new Estimator[m_Instances.numAttributes() - 1][m_Instances
      .numClasses()];
    m_ClassDistribution = new DiscreteEstimator(m_Instances.numClasses(), true);
    int attIndex = 0;
    Enumeration<Attribute> enu = m_Instances.enumerateAttributes();
    while (enu.hasMoreElements()) {
      Attribute attribute = enu.nextElement();

      // If the attribute is numeric, determine the estimator
      // numeric precision from differences between adjacent values
      double numPrecision = DEFAULT_NUM_PRECISION;
      if (attribute.type() == Attribute.NUMERIC) {
        m_Instances.sort(attribute);
        if ((m_Instances.numInstances() > 0)
          && !m_Instances.instance(0).isMissing(attribute)) {
          double lastVal = m_Instances.instance(0).value(attribute);
          double currentVal, deltaSum = 0;
          int distinct = 0;
          for (int i = 1; i < m_Instances.numInstances(); i++) {
            Instance currentInst = m_Instances.instance(i);
            if (currentInst.isMissing(attribute)) {
              break;
            }
            currentVal = currentInst.value(attribute);
            if (currentVal != lastVal) {
              deltaSum += currentVal - lastVal;
              lastVal = currentVal;
              distinct++;
            }
          }
          if (distinct > 0) {
            numPrecision = deltaSum / distinct;
          }
        }
      }

      for (int j = 0; j < m_Instances.numClasses(); j++) {
        switch (attribute.type()) {
        case Attribute.NUMERIC:
          if (m_UseKernelEstimator) {
            m_Distributions[attIndex][j] = new KernelEstimator(numPrecision);
          } else {
            m_Distributions[attIndex][j] = new NormalEstimator(numPrecision);
          }
          break;
        case Attribute.NOMINAL:
          m_Distributions[attIndex][j] = new DiscreteEstimator(
            attribute.numValues(), true);
          break;
        default:
          throw new Exception("Attribute type unknown to NaiveBayes");
        }
<<<<<<< HEAD
=======
=======
    m_Distributions = new Estimator[m_Instances.numAttributes() - 1]
      [m_Instances.numClasses()];
    m_ClassDistribution = new DiscreteEstimator(m_Instances.numClasses(), 
                                                true);
    int attIndex = 0;
    Enumeration enu = m_Instances.enumerateAttributes();
    while (enu.hasMoreElements()) {
      Attribute attribute = (Attribute) enu.nextElement();

      // If the attribute is numeric, determine the estimator 
      // numeric precision from differences between adjacent values
      double numPrecision = DEFAULT_NUM_PRECISION;
      if (attribute.type() == Attribute.NUMERIC) {
	m_Instances.sort(attribute);
	if ((m_Instances.numInstances() > 0)
	    && !m_Instances.instance(0).isMissing(attribute)) {
	  double lastVal = m_Instances.instance(0).value(attribute);
	  double currentVal, deltaSum = 0;
	  int distinct = 0;
	  for (int i = 1; i < m_Instances.numInstances(); i++) {
	    Instance currentInst = m_Instances.instance(i);
	    if (currentInst.isMissing(attribute)) {
	      break;
	    }
	    currentVal = currentInst.value(attribute);
	    if (currentVal != lastVal) {
	      deltaSum += currentVal - lastVal;
	      lastVal = currentVal;
	      distinct++;
	    }
	  }
	  if (distinct > 0) {
	    numPrecision = deltaSum / distinct;
	  }
	}
      }


      for (int j = 0; j < m_Instances.numClasses(); j++) {
	switch (attribute.type()) {
	case Attribute.NUMERIC: 
	  if (m_UseKernelEstimator) {
	    m_Distributions[attIndex][j] = 
	      new KernelEstimator(numPrecision);
	  } else {
	    m_Distributions[attIndex][j] = 
	      new NormalEstimator(numPrecision);
	  }
	  break;
	case Attribute.NOMINAL:
	  m_Distributions[attIndex][j] = 
	    new DiscreteEstimator(attribute.numValues(), true);
	  break;
	default:
	  throw new Exception("Attribute type unknown to NaiveBayes");
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      attIndex++;
    }

    // Compute counts
<<<<<<< HEAD
    Enumeration<Instance> enumInsts = m_Instances.enumerateInstances();
    while (enumInsts.hasMoreElements()) {
      Instance instance = enumInsts.nextElement();
=======
<<<<<<< HEAD
    Enumeration<Instance> enumInsts = m_Instances.enumerateInstances();
    while (enumInsts.hasMoreElements()) {
      Instance instance = enumInsts.nextElement();
=======
    Enumeration enumInsts = m_Instances.enumerateInstances();
    while (enumInsts.hasMoreElements()) {
      Instance instance = 
	(Instance) enumInsts.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      updateClassifier(instance);
    }

    // Save space
    m_Instances = new Instances(m_Instances, 0);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Updates the classifier with the given instance.
   * 
   * @param instance the new training instance to include in the model
   * @exception Exception if the instance could not be incorporated in the
   *              model.
<<<<<<< HEAD
=======
=======

  /**
   * Updates the classifier with the given instance.
   *
   * @param instance the new training instance to include in the model 
   * @exception Exception if the instance could not be incorporated in
   * the model.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void updateClassifier(Instance instance) throws Exception {

    if (!instance.classIsMissing()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Enumeration<Attribute> enumAtts = m_Instances.enumerateAttributes();
      int attIndex = 0;
      while (enumAtts.hasMoreElements()) {
        Attribute attribute = enumAtts.nextElement();
        if (!instance.isMissing(attribute)) {
          m_Distributions[attIndex][(int) instance.classValue()].addValue(
            instance.value(attribute), instance.weight());
        }
        attIndex++;
      }
      m_ClassDistribution.addValue(instance.classValue(), instance.weight());
    }
  }

  /**
   * Calculates the class membership probabilities for the given test instance.
   * 
<<<<<<< HEAD
=======
=======
      Enumeration enumAtts = m_Instances.enumerateAttributes();
      int attIndex = 0;
      while (enumAtts.hasMoreElements()) {
	Attribute attribute = (Attribute) enumAtts.nextElement();
	if (!instance.isMissing(attribute)) {
	  m_Distributions[attIndex][(int)instance.classValue()].
            addValue(instance.value(attribute), instance.weight());
	}
	attIndex++;
      }
      m_ClassDistribution.addValue(instance.classValue(),
                                   instance.weight());
    }
  }


  /**
   * Calculates the class membership probabilities for the given test 
   * instance.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param instance the instance to be classified
   * @return predicted class probability distribution
   * @exception Exception if there is a problem generating the prediction
   */
<<<<<<< HEAD
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {
=======
<<<<<<< HEAD
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {
=======
  public double [] distributionForInstance(Instance instance) 
    throws Exception { 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_UseDiscretization) {
      m_Disc.input(instance);
      instance = m_Disc.output();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double[] probs = new double[m_NumClasses];
    for (int j = 0; j < m_NumClasses; j++) {
      probs[j] = m_ClassDistribution.getProbability(j);
    }
    Enumeration<Attribute> enumAtts = instance.enumerateAttributes();
    int attIndex = 0;
    while (enumAtts.hasMoreElements()) {
      Attribute attribute = enumAtts.nextElement();
      if (!instance.isMissing(attribute)) {
        double temp, max = 0;
        for (int j = 0; j < m_NumClasses; j++) {
          temp = Math.max(1e-75, Math.pow(m_Distributions[attIndex][j]
            .getProbability(instance.value(attribute)),
            m_Instances.attribute(attIndex).weight()));
          probs[j] *= temp;
          if (probs[j] > max) {
            max = probs[j];
          }
          if (Double.isNaN(probs[j])) {
            throw new Exception("NaN returned from estimator for attribute "
              + attribute.name() + ":\n"
              + m_Distributions[attIndex][j].toString());
          }
        }
        if ((max > 0) && (max < 1e-75)) { // Danger of probability underflow
          for (int j = 0; j < m_NumClasses; j++) {
            probs[j] *= 1e75;
          }
        }
<<<<<<< HEAD
=======
=======
    double [] probs = new double[m_NumClasses];
    for (int j = 0; j < m_NumClasses; j++) {
      probs[j] = m_ClassDistribution.getProbability(j);
    }
    Enumeration enumAtts = instance.enumerateAttributes();
    int attIndex = 0;
    while (enumAtts.hasMoreElements()) {
      Attribute attribute = (Attribute) enumAtts.nextElement();
      if (!instance.isMissing(attribute)) {
	double temp, max = 0;
	for (int j = 0; j < m_NumClasses; j++) {
	  temp = Math.max(1e-75, Math.pow(m_Distributions[attIndex][j].
                                          getProbability(instance.value(attribute)), 
                                          m_Instances.attribute(attIndex).weight()));
	  probs[j] *= temp;
	  if (probs[j] > max) {
	    max = probs[j];
	  }
	  if (Double.isNaN(probs[j])) {
	    throw new Exception("NaN returned from estimator for attribute "
                                + attribute.name() + ":\n"
                                + m_Distributions[attIndex][j].toString());
	  }
	}
	if ((max > 0) && (max < 1e-75)) { // Danger of probability underflow
	  for (int j = 0; j < m_NumClasses; j++) {
	    probs[j] *= 1e75;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      attIndex++;
    }

    // Display probabilities
    Utils.normalize(probs);
    return probs;
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

    Vector<Option> newVector = new Vector<Option>(3);

    newVector.addElement(new Option(
      "\tUse kernel density estimator rather than normal\n"
        + "\tdistribution for numeric attributes", "K", 0, "-K"));
    newVector.addElement(new Option(
      "\tUse supervised discretization to process numeric attributes\n", "D",
      0, "-D"));

    newVector
      .addElement(new Option(
        "\tDisplay model in old format (good when there are "
          + "many classes)\n", "O", 0, "-O"));

    newVector.addAll(Collections.list(super.listOptions()));

<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(3);

    newVector.addElement(
              new Option("\tUse kernel density estimator rather than normal\n"
                         +"\tdistribution for numeric attributes",
                         "K", 0,"-K"));
    newVector.addElement(
              new Option("\tUse supervised discretization to process numeric attributes\n",
                         "D", 0,"-D"));
    
    newVector.addElement(
              new Option("\tDisplay model in old format (good when there are "
                         + "many classes)\n",
                         "O", 0, "-O"));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return newVector.elements();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -K
   *  Use kernel density estimator rather than normal
   *  distribution for numeric attributes
   * </pre>
   * 
   * <pre>
   * -D
   *  Use supervised discretization to process numeric attributes
   * </pre>
   * 
   * <pre>
   * -O
   *  Display model in old format (good when there are many classes)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    super.setOptions(options);
    boolean k = Utils.getFlag('K', options);
    boolean d = Utils.getFlag('D', options);
    if (k && d) {
      throw new IllegalArgumentException("Can't use both kernel density "
        + "estimation and discretization!");
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -K
   *  Use kernel density estimator rather than normal
   *  distribution for numeric attributes</pre>
   * 
   * <pre> -D
   *  Use supervised discretization to process numeric attributes
   * </pre>
   *
   * <pre> -O
   *  Display model in old format (good when there are many classes)
   * </pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {

    boolean k = Utils.getFlag('K', options);
    boolean d = Utils.getFlag('D', options);
    if (k && d) {
      throw new IllegalArgumentException("Can't use both kernel density " +
                                         "estimation and discretization!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    setUseSupervisedDiscretization(d);
    setUseKernelEstimator(k);
    setDisplayModelInOldFormat(Utils.getFlag('O', options));
    Utils.checkForRemainingOptions(options);
  }

  /**
   * Gets the current settings of the classifier.
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

    Collections.addAll(options, super.getOptions());

    if (m_UseKernelEstimator) {
      options.add("-K");
    }

    if (m_UseDiscretization) {
      options.add("-D");
    }

    if (m_displayModelInOldFormat) {
      options.add("-O");
    }

    return options.toArray(new String[0]);
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [3];
    int current = 0;

    if (m_UseKernelEstimator) {
      options[current++] = "-K";
    }

    if (m_UseDiscretization) {
      options[current++] = "-D";
    }

    if (m_displayModelInOldFormat) {
      options[current++] = "-O";
    }

    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns a description of the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the classifier as a string.
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return a description of the classifier as a string.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {
    if (m_displayModelInOldFormat) {
      return toStringOriginal();
    }

    StringBuffer temp = new StringBuffer();
    temp.append("Naive Bayes Classifier");
    if (m_Instances == null) {
      temp.append(": No model built yet.");
    } else {

      int maxWidth = 0;
      int maxAttWidth = 0;
      boolean containsKernel = false;

      // set up max widths
      // class values
      for (int i = 0; i < m_Instances.numClasses(); i++) {
        if (m_Instances.classAttribute().value(i).length() > maxWidth) {
          maxWidth = m_Instances.classAttribute().value(i).length();
        }
      }
      // attributes
      for (int i = 0; i < m_Instances.numAttributes(); i++) {
        if (i != m_Instances.classIndex()) {
          Attribute a = m_Instances.attribute(i);
          if (a.name().length() > maxAttWidth) {
            maxAttWidth = m_Instances.attribute(i).name().length();
          }
          if (a.isNominal()) {
            // check values
            for (int j = 0; j < a.numValues(); j++) {
              String val = a.value(j) + "  ";
              if (val.length() > maxAttWidth) {
                maxAttWidth = val.length();
              }
            }
          }
        }
      }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (Estimator[] m_Distribution : m_Distributions) {
        for (int j = 0; j < m_Instances.numClasses(); j++) {
          if (m_Distribution[0] instanceof NormalEstimator) {
            // check mean/precision dev against maxWidth
            NormalEstimator n = (NormalEstimator) m_Distribution[j];
            double mean = Math.log(Math.abs(n.getMean())) / Math.log(10.0);
            double precision = Math.log(Math.abs(n.getPrecision()))
              / Math.log(10.0);
            double width = (mean > precision) ? mean : precision;
<<<<<<< HEAD
=======
=======
      for (int i = 0; i < m_Distributions.length; i++) {
        for (int j = 0; j < m_Instances.numClasses(); j++) {
          if (m_Distributions[i][0] instanceof NormalEstimator) {
            // check mean/precision dev against maxWidth
            NormalEstimator n = (NormalEstimator)m_Distributions[i][j];
            double mean = Math.log(Math.abs(n.getMean())) / Math.log(10.0);
            double precision = Math.log(Math.abs(n.getPrecision())) / Math.log(10.0);
            double width = (mean > precision)
              ? mean
              : precision;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (width < 0) {
              width = 1;
            }
            // decimal + # decimal places + 1
            width += 6.0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if ((int) width > maxWidth) {
              maxWidth = (int) width;
            }
          } else if (m_Distribution[0] instanceof KernelEstimator) {
            containsKernel = true;
            KernelEstimator ke = (KernelEstimator) m_Distribution[j];
<<<<<<< HEAD
=======
=======
            if ((int)width > maxWidth) {
              maxWidth = (int)width;
            }
          } else if (m_Distributions[i][0] instanceof KernelEstimator) {
            containsKernel = true;
            KernelEstimator ke = (KernelEstimator)m_Distributions[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            int numK = ke.getNumKernels();
            String temps = "K" + numK + ": mean (weight)";
            if (maxAttWidth < temps.length()) {
              maxAttWidth = temps.length();
            }
            // check means + weights against maxWidth
            if (ke.getNumKernels() > 0) {
              double[] means = ke.getMeans();
              double[] weights = ke.getWeights();
              for (int k = 0; k < ke.getNumKernels(); k++) {
                String m = Utils.doubleToString(means[k], maxWidth, 4).trim();
<<<<<<< HEAD
                m += " ("
                  + Utils.doubleToString(weights[k], maxWidth, 1).trim() + ")";
=======
<<<<<<< HEAD
                m += " ("
                  + Utils.doubleToString(weights[k], maxWidth, 1).trim() + ")";
=======
                m += " (" + Utils.doubleToString(weights[k], maxWidth, 1).trim() + ")";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                if (maxWidth < m.length()) {
                  maxWidth = m.length();
                }
              }
            }
<<<<<<< HEAD
          } else if (m_Distribution[0] instanceof DiscreteEstimator) {
            DiscreteEstimator d = (DiscreteEstimator) m_Distribution[j];
=======
<<<<<<< HEAD
          } else if (m_Distribution[0] instanceof DiscreteEstimator) {
            DiscreteEstimator d = (DiscreteEstimator) m_Distribution[j];
=======
          } else if (m_Distributions[i][0] instanceof DiscreteEstimator) {
            DiscreteEstimator d = (DiscreteEstimator)m_Distributions[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            for (int k = 0; k < d.getNumSymbols(); k++) {
              String size = "" + d.getCount(k);
              if (size.length() > maxWidth) {
                maxWidth = size.length();
              }
            }
            int sum = ("" + d.getSumOfCounts()).length();
            if (sum > maxWidth) {
              maxWidth = sum;
            }
          }
        }
      }

      // Check width of class labels
      for (int i = 0; i < m_Instances.numClasses(); i++) {
        String cSize = m_Instances.classAttribute().value(i);
        if (cSize.length() > maxWidth) {
          maxWidth = cSize.length();
        }
      }

      // Check width of class priors
      for (int i = 0; i < m_Instances.numClasses(); i++) {
<<<<<<< HEAD
        String priorP = Utils.doubleToString(
          ((DiscreteEstimator) m_ClassDistribution).getProbability(i),
          maxWidth, 2).trim();
=======
<<<<<<< HEAD
        String priorP = Utils.doubleToString(
          ((DiscreteEstimator) m_ClassDistribution).getProbability(i),
          maxWidth, 2).trim();
=======
        String priorP = 
          Utils.doubleToString(((DiscreteEstimator)m_ClassDistribution).getProbability(i),
                               maxWidth, 2).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        priorP = "(" + priorP + ")";
        if (priorP.length() > maxWidth) {
          maxWidth = priorP.length();
        }
      }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (maxAttWidth < "Attribute".length()) {
        maxAttWidth = "Attribute".length();
      }

      if (maxAttWidth < "  weight sum".length()) {
        maxAttWidth = "  weight sum".length();
      }

      if (containsKernel) {
        if (maxAttWidth < "  [precision]".length()) {
          maxAttWidth = "  [precision]".length();
        }
      }

      maxAttWidth += 2;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      temp.append("\n\n");
      temp.append(pad("Class", " ",
        (maxAttWidth + maxWidth + 1) - "Class".length(), true));

      temp.append("\n");
      temp.append(pad("Attribute", " ", maxAttWidth - "Attribute".length(),
        false));
<<<<<<< HEAD
=======
=======
    


      temp.append("\n\n");
      temp.append(pad("Class", " ", 
                      (maxAttWidth + maxWidth + 1) - "Class".length(), 
                      true));

      temp.append("\n");
      temp.append(pad("Attribute", " ", maxAttWidth - "Attribute".length(), false));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // class labels
      for (int i = 0; i < m_Instances.numClasses(); i++) {
        String classL = m_Instances.classAttribute().value(i);
        temp.append(pad(classL, " ", maxWidth + 1 - classL.length(), true));
      }
      temp.append("\n");
      // class priors
      temp.append(pad("", " ", maxAttWidth, true));
      for (int i = 0; i < m_Instances.numClasses(); i++) {
<<<<<<< HEAD
        String priorP = Utils.doubleToString(
          ((DiscreteEstimator) m_ClassDistribution).getProbability(i),
          maxWidth, 2).trim();
=======
<<<<<<< HEAD
        String priorP = Utils.doubleToString(
          ((DiscreteEstimator) m_ClassDistribution).getProbability(i),
          maxWidth, 2).trim();
=======
        String priorP = 
          Utils.doubleToString(((DiscreteEstimator)m_ClassDistribution).getProbability(i),
                               maxWidth, 2).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        priorP = "(" + priorP + ")";
        temp.append(pad(priorP, " ", maxWidth + 1 - priorP.length(), true));
      }
      temp.append("\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      temp.append(pad(
        "",
        "=",
        maxAttWidth + (maxWidth * m_Instances.numClasses())
          + m_Instances.numClasses() + 1, true));
<<<<<<< HEAD
=======
=======
      temp.append(pad("", "=", maxAttWidth + 
                      (maxWidth * m_Instances.numClasses()) 
                      + m_Instances.numClasses() + 1, true));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      temp.append("\n");

      // loop over the attributes
      int counter = 0;
      for (int i = 0; i < m_Instances.numAttributes(); i++) {
        if (i == m_Instances.classIndex()) {
          continue;
        }
        String attName = m_Instances.attribute(i).name();
        temp.append(attName + "\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        if (m_Distributions[counter][0] instanceof NormalEstimator) {
          String meanL = "  mean";
          temp.append(pad(meanL, " ", maxAttWidth + 1 - meanL.length(), false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            // means
            NormalEstimator n = (NormalEstimator) m_Distributions[counter][j];
            String mean = Utils.doubleToString(n.getMean(), maxWidth, 4).trim();
            temp.append(pad(mean, " ", maxWidth + 1 - mean.length(), true));
          }
          temp.append("\n");
          // now do std deviations
          String stdDevL = "  std. dev.";
          temp.append(pad(stdDevL, " ", maxAttWidth + 1 - stdDevL.length(),
            false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            NormalEstimator n = (NormalEstimator) m_Distributions[counter][j];
            String stdDev = Utils.doubleToString(n.getStdDev(), maxWidth, 4)
              .trim();
<<<<<<< HEAD
=======
=======
          
        if (m_Distributions[counter][0] instanceof NormalEstimator) {
          String meanL = "  mean";
          temp.append(pad(meanL, " ", maxAttWidth + 1 - meanL.length(), false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {            
            // means
            NormalEstimator n = (NormalEstimator)m_Distributions[counter][j];
            String mean = 
              Utils.doubleToString(n.getMean(), maxWidth, 4).trim();
            temp.append(pad(mean, " ", maxWidth + 1 - mean.length(), true));
          }
          temp.append("\n");            
          // now do std deviations
          String stdDevL = "  std. dev.";
          temp.append(pad(stdDevL, " ", maxAttWidth + 1 - stdDevL.length(), false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            NormalEstimator n = (NormalEstimator)m_Distributions[counter][j];
            String stdDev = 
              Utils.doubleToString(n.getStdDev(), maxWidth, 4).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            temp.append(pad(stdDev, " ", maxWidth + 1 - stdDev.length(), true));
          }
          temp.append("\n");
          // now the weight sums
          String weightL = "  weight sum";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          temp.append(pad(weightL, " ", maxAttWidth + 1 - weightL.length(),
            false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            NormalEstimator n = (NormalEstimator) m_Distributions[counter][j];
            String weight = Utils.doubleToString(n.getSumOfWeights(), maxWidth,
              4).trim();
<<<<<<< HEAD
=======
=======
          temp.append(pad(weightL, " ", maxAttWidth + 1 - weightL.length(), false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            NormalEstimator n = (NormalEstimator)m_Distributions[counter][j];
            String weight = 
              Utils.doubleToString(n.getSumOfWeights(), maxWidth, 4).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            temp.append(pad(weight, " ", maxWidth + 1 - weight.length(), true));
          }
          temp.append("\n");
          // now the precisions
          String precisionL = "  precision";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          temp.append(pad(precisionL, " ",
            maxAttWidth + 1 - precisionL.length(), false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            NormalEstimator n = (NormalEstimator) m_Distributions[counter][j];
            String precision = Utils.doubleToString(n.getPrecision(), maxWidth,
              4).trim();
            temp.append(pad(precision, " ", maxWidth + 1 - precision.length(),
              true));
          }
          temp.append("\n\n");

<<<<<<< HEAD
=======
=======
          temp.append(pad(precisionL, " ", maxAttWidth + 1 - precisionL.length(), false));
          for (int j = 0; j < m_Instances.numClasses(); j++) {
            NormalEstimator n = (NormalEstimator)m_Distributions[counter][j];
            String precision = 
              Utils.doubleToString(n.getPrecision(), maxWidth, 4).trim();
            temp.append(pad(precision, " ", maxWidth + 1 - precision.length(), true));
          }
          temp.append("\n\n");
            
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        } else if (m_Distributions[counter][0] instanceof DiscreteEstimator) {
          Attribute a = m_Instances.attribute(i);
          for (int j = 0; j < a.numValues(); j++) {
            String val = "  " + a.value(j);
            temp.append(pad(val, " ", maxAttWidth + 1 - val.length(), false));
            for (int k = 0; k < m_Instances.numClasses(); k++) {
<<<<<<< HEAD
              DiscreteEstimator d = (DiscreteEstimator) m_Distributions[counter][k];
=======
<<<<<<< HEAD
              DiscreteEstimator d = (DiscreteEstimator) m_Distributions[counter][k];
=======
              DiscreteEstimator d = (DiscreteEstimator)m_Distributions[counter][k];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              String count = "" + d.getCount(j);
              temp.append(pad(count, " ", maxWidth + 1 - count.length(), true));
            }
            temp.append("\n");
          }
          // do the totals
          String total = "  [total]";
          temp.append(pad(total, " ", maxAttWidth + 1 - total.length(), false));
          for (int k = 0; k < m_Instances.numClasses(); k++) {
<<<<<<< HEAD
            DiscreteEstimator d = (DiscreteEstimator) m_Distributions[counter][k];
=======
<<<<<<< HEAD
            DiscreteEstimator d = (DiscreteEstimator) m_Distributions[counter][k];
=======
            DiscreteEstimator d = (DiscreteEstimator)m_Distributions[counter][k];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            String count = "" + d.getSumOfCounts();
            temp.append(pad(count, " ", maxWidth + 1 - count.length(), true));
          }
          temp.append("\n\n");
        } else if (m_Distributions[counter][0] instanceof KernelEstimator) {
          String kL = "  [# kernels]";
          temp.append(pad(kL, " ", maxAttWidth + 1 - kL.length(), false));
          for (int k = 0; k < m_Instances.numClasses(); k++) {
<<<<<<< HEAD
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
=======
<<<<<<< HEAD
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
=======
            KernelEstimator ke = (KernelEstimator)m_Distributions[counter][k];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            String nk = "" + ke.getNumKernels();
            temp.append(pad(nk, " ", maxWidth + 1 - nk.length(), true));
          }
          temp.append("\n");
          // do num kernels, std. devs and precisions
          String stdDevL = "  [std. dev]";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          temp.append(pad(stdDevL, " ", maxAttWidth + 1 - stdDevL.length(),
            false));
          for (int k = 0; k < m_Instances.numClasses(); k++) {
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
            String stdD = Utils.doubleToString(ke.getStdDev(), maxWidth, 4)
              .trim();
<<<<<<< HEAD
=======
=======
          temp.append(pad(stdDevL, " ", maxAttWidth + 1 - stdDevL.length(), false));
          for (int k = 0; k < m_Instances.numClasses(); k++) {
            KernelEstimator ke = (KernelEstimator)m_Distributions[counter][k];
            String stdD = Utils.doubleToString(ke.getStdDev(), maxWidth, 4).trim(); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            temp.append(pad(stdD, " ", maxWidth + 1 - stdD.length(), true));
          }
          temp.append("\n");
          String precL = "  [precision]";
          temp.append(pad(precL, " ", maxAttWidth + 1 - precL.length(), false));
          for (int k = 0; k < m_Instances.numClasses(); k++) {
<<<<<<< HEAD
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
            String prec = Utils.doubleToString(ke.getPrecision(), maxWidth, 4)
              .trim();
=======
<<<<<<< HEAD
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
            String prec = Utils.doubleToString(ke.getPrecision(), maxWidth, 4)
              .trim();
=======
            KernelEstimator ke = (KernelEstimator)m_Distributions[counter][k];
            String prec = Utils.doubleToString(ke.getPrecision(), maxWidth, 4).trim(); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            temp.append(pad(prec, " ", maxWidth + 1 - prec.length(), true));
          }
          temp.append("\n");
          // first determine max number of kernels accross the classes
          int maxK = 0;
          for (int k = 0; k < m_Instances.numClasses(); k++) {
<<<<<<< HEAD
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
=======
<<<<<<< HEAD
            KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
=======
            KernelEstimator ke = (KernelEstimator)m_Distributions[counter][k];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (ke.getNumKernels() > maxK) {
              maxK = ke.getNumKernels();
            }
          }
          for (int j = 0; j < maxK; j++) {
            // means first
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            String meanL = "  K" + (j + 1) + ": mean (weight)";
            temp
              .append(pad(meanL, " ", maxAttWidth + 1 - meanL.length(), false));
            for (int k = 0; k < m_Instances.numClasses(); k++) {
              KernelEstimator ke = (KernelEstimator) m_Distributions[counter][k];
<<<<<<< HEAD
=======
=======
            String meanL = "  K" + (j+1) + ": mean (weight)";
            temp.append(pad(meanL, " ", maxAttWidth + 1 - meanL.length(), false));
            for (int k = 0; k < m_Instances.numClasses(); k++) {
              KernelEstimator ke = (KernelEstimator)m_Distributions[counter][k];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              double[] means = ke.getMeans();
              double[] weights = ke.getWeights();
              String m = "--";
              if (ke.getNumKernels() == 0) {
                m = "" + 0;
              } else if (j < ke.getNumKernels()) {
                m = Utils.doubleToString(means[j], maxWidth, 4).trim();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                m += " ("
                  + Utils.doubleToString(weights[j], maxWidth, 1).trim() + ")";
              }
              temp.append(pad(m, " ", maxWidth + 1 - m.length(), true));
            }
            temp.append("\n");
<<<<<<< HEAD
=======
=======
                m += " (" + Utils.doubleToString(weights[j], maxWidth, 1).trim() + ")";
              }
              temp.append(pad(m, " ", maxWidth + 1 - m.length(), true));
            }
            temp.append("\n");              
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
          temp.append("\n");
        }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        counter++;
      }
    }

<<<<<<< HEAD
=======
=======

        counter++;
      }
    }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return temp.toString();
  }

  /**
   * Returns a description of the classifier in the old format.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the classifier as a string.
   */
  protected String toStringOriginal() {

<<<<<<< HEAD
=======
=======
   *
   * @return a description of the classifier as a string.
   */
  protected String toStringOriginal() {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    StringBuffer text = new StringBuffer();

    text.append("Naive Bayes Classifier");
    if (m_Instances == null) {
      text.append(": No model built yet.");
    } else {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        for (int i = 0; i < m_Distributions[0].length; i++) {
          text.append("\n\nClass " + m_Instances.classAttribute().value(i)
            + ": Prior probability = "
            + Utils.doubleToString(m_ClassDistribution.getProbability(i), 4, 2)
            + "\n\n");
          Enumeration<Attribute> enumAtts = m_Instances.enumerateAttributes();
          int attIndex = 0;
          while (enumAtts.hasMoreElements()) {
            Attribute attribute = enumAtts.nextElement();
            if (attribute.weight() > 0) {
              text.append(attribute.name() + ":  "
                + m_Distributions[attIndex][i]);
            }
            attIndex++;
          }
        }
      } catch (Exception ex) {
        text.append(ex.getMessage());
<<<<<<< HEAD
=======
=======
	for (int i = 0; i < m_Distributions[0].length; i++) {
	  text.append("\n\nClass " + m_Instances.classAttribute().value(i) +
                      ": Prior probability = " + Utils.
                      doubleToString(m_ClassDistribution.getProbability(i),
                                     4, 2) + "\n\n");
	  Enumeration enumAtts = m_Instances.enumerateAttributes();
	  int attIndex = 0;
	  while (enumAtts.hasMoreElements()) {
	    Attribute attribute = (Attribute) enumAtts.nextElement();
	    if (attribute.weight() > 0) {
	      text.append(attribute.name() + ":  " 
                          + m_Distributions[attIndex][i]);
	    }
	    attIndex++;
	  }
	}
      } catch (Exception ex) {
	text.append(ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    return text.toString();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  private String pad(String source, String padChar, int length, boolean leftPad) {
    StringBuffer temp = new StringBuffer();

    if (leftPad) {
      for (int i = 0; i < length; i++) {
<<<<<<< HEAD
=======
=======
  } 

  private String pad(String source, String padChar, 
                     int length, boolean leftPad) {
    StringBuffer temp = new StringBuffer();

    if (leftPad) {
      for (int i = 0; i< length; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        temp.append(padChar);
      }
      temp.append(source);
    } else {
      temp.append(source);
<<<<<<< HEAD
      for (int i = 0; i < length; i++) {
=======
<<<<<<< HEAD
      for (int i = 0; i < length; i++) {
=======
      for (int i = 0; i< length; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        temp.append(padChar);
      }
    }
    return temp.toString();
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String useKernelEstimatorTipText() {
    return "Use a kernel estimator for numeric attributes rather than a "
      + "normal distribution.";
  }

  /**
   * Gets if kernel estimator is being used.
   * 
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String useKernelEstimatorTipText() {
    return "Use a kernel estimator for numeric attributes rather than a "
      +"normal distribution.";
  }
  /**
   * Gets if kernel estimator is being used.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return Value of m_UseKernelEstimatory.
   */
  public boolean getUseKernelEstimator() {

    return m_UseKernelEstimator;
  }

  /**
   * Sets if kernel estimator is to be used.
<<<<<<< HEAD
   * 
   * @param v Value to assign to m_UseKernelEstimatory.
=======
<<<<<<< HEAD
   * 
   * @param v Value to assign to m_UseKernelEstimatory.
=======
   *
   * @param v  Value to assign to m_UseKernelEstimatory.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setUseKernelEstimator(boolean v) {

    m_UseKernelEstimator = v;
    if (v) {
      setUseSupervisedDiscretization(false);
    }
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String useSupervisedDiscretizationTipText() {
    return "Use supervised discretization to convert numeric attributes to nominal "
      + "ones.";
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String useSupervisedDiscretizationTipText() {
    return "Use supervised discretization to convert numeric attributes to nominal "
      +"ones.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get whether supervised discretization is to be used.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if supervised discretization is to be used.
   */
  public boolean getUseSupervisedDiscretization() {

    return m_UseDiscretization;
  }

  /**
   * Set whether supervised discretization is to be used.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newblah true if supervised discretization is to be used.
   */
  public void setUseSupervisedDiscretization(boolean newblah) {

    m_UseDiscretization = newblah;
    if (newblah) {
      setUseKernelEstimator(false);
    }
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
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String displayModelInOldFormatTipText() {
    return "Use old format for model output. The old format is "
      + "better when there are many class values. The new format "
      + "is better when there are fewer classes and many attributes.";
  }

  /**
<<<<<<< HEAD
   * Set whether to display model output in the old, original format.
   * 
=======
<<<<<<< HEAD
   * Set whether to display model output in the old, original format.
   * 
=======
   * Set whether to display model output in the old, original
   * format.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param d true if model ouput is to be shown in the old format
   */
  public void setDisplayModelInOldFormat(boolean d) {
    m_displayModelInOldFormat = d;
  }

  /**
<<<<<<< HEAD
   * Get whether to display model output in the old, original format.
   * 
=======
<<<<<<< HEAD
   * Get whether to display model output in the old, original format.
   * 
=======
   * Get whether to display model output in the old, original
   * format.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if model ouput is to be shown in the old format
   */
  public boolean getDisplayModelInOldFormat() {
    return m_displayModelInOldFormat;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Return the header that this classifier was trained with
   *
   * @return the header that this classifier was trained with
   */
  public Instances getHeader() {
    return m_Instances;
  }

  /**
   * Get all the conditional estimators.
   *
   * @return all the conditional estimators.
   */
  public Estimator[][] getConditionalEstimators() {
    return m_Distributions;
  }

  /**
   * Get the class estimator.
   *
   * @return the class estimator
   */
  public Estimator getClassEstimator() {
    return m_ClassDistribution;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public NaiveBayes aggregate(NaiveBayes toAggregate) throws Exception {

    // Highly unlikely that discretization intervals will match between the
    // two classifiers
    if (m_UseDiscretization || toAggregate.getUseSupervisedDiscretization()) {
      throw new Exception("Unable to aggregate when supervised discretization "
        + "has been turned on");
    }

    if (!m_Instances.equalHeaders(toAggregate.m_Instances)) {
      throw new Exception("Can't aggregate - data headers don't match: "
        + m_Instances.equalHeadersMsg(toAggregate.m_Instances));
    }

    ((Aggregateable) m_ClassDistribution)
      .aggregate(toAggregate.m_ClassDistribution);

    // aggregate all conditional estimators
    for (int i = 0; i < m_Distributions.length; i++) {
      for (int j = 0; j < m_Distributions[i].length; j++) {
        ((Aggregateable) m_Distributions[i][j])
          .aggregate(toAggregate.m_Distributions[i][j]);
      }
    }

    return this;
  }

  @Override
  public void finalizeAggregation() throws Exception {
    // nothing to do
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5516 $");
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
   * @param argv the options
   */
  public static void main(String[] argv) {
    runClassifier(new NaiveBayes(), argv);
  }
}
<<<<<<< HEAD
=======
=======
   *
   * @param argv the options
   */
  public static void main(String [] argv) {
    runClassifier(new NaiveBayes(), argv);
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
