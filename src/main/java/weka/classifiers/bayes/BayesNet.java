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
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

/*
 * BayesNet.java
<<<<<<< HEAD
 * Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2001 University of Waikato, Hamilton, New Zealand
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
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.bayes.net.ADNode;
import weka.classifiers.bayes.net.BIFReader;
import weka.classifiers.bayes.net.ParentSet;
import weka.classifiers.bayes.net.estimate.BayesNetEstimator;
import weka.classifiers.bayes.net.estimate.DiscreteEstimatorBayes;
import weka.classifiers.bayes.net.estimate.SimpleEstimator;
import weka.classifiers.bayes.net.search.SearchAlgorithm;
import weka.classifiers.bayes.net.search.local.K2;
import weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm;
import weka.classifiers.bayes.net.search.local.Scoreable;
import weka.core.AdditionalMeasureProducer;
import weka.core.Attribute;
import weka.core.Capabilities;
<<<<<<< HEAD
import weka.core.Capabilities.Capability;
=======
<<<<<<< HEAD
import weka.core.Capabilities.Capability;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Drawable;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.Capabilities.Capability;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.estimators.Estimator;
import weka.filters.Filter;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> Bayes Network learning using various search
 * algorithms and quality measures.<br/>
 * Base class for a Bayes Network classifier. Provides datastructures (network
 * structure, conditional probability distributions, etc.) and facilities common
 * to Bayes Network learning algorithms like K2 and B.<br/>
 * <br/>
 * For more information see:<br/>
 * <br/>
 * http://sourceforge.net/projects/weka/files/documentation/WekaManual-3-7-0.pdf
 * /download
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D
 *  Do not use ADTree data structure
 * </pre>
 * 
 * <pre>
 * -B &lt;BIF file&gt;
 *  BIF file to compare with
 * </pre>
 * 
 * <pre>
 * -Q weka.classifiers.bayes.net.search.SearchAlgorithm
 *  Search algorithm
 * </pre>
 * 
 * <pre>
 * -E weka.classifiers.bayes.net.estimate.SimpleEstimator
 *  Estimator algorithm
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Remco Bouckaert (rrb@xm.co.nz)
 * @version $Revision: 13308 $
 */
public class BayesNet extends AbstractClassifier implements OptionHandler,
  WeightedInstancesHandler, Drawable, AdditionalMeasureProducer {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Bayes Network learning using various search algorithms and quality measures.<br/>
 * Base class for a Bayes Network classifier. Provides datastructures (network structure, conditional probability distributions, etc.) and facilities common to Bayes Network learning algorithms like K2 and B.<br/>
 * <br/>
 * For more information see:<br/>
 * <br/>
 * http://sourceforge.net/projects/weka/files/documentation/WekaManual-3-6-1.pdf/download
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  Do not use ADTree data structure
 * </pre>
 * 
 * <pre> -B &lt;BIF file&gt;
 *  BIF file to compare with
 * </pre>
 * 
 * <pre> -Q weka.classifiers.bayes.net.search.SearchAlgorithm
 *  Search algorithm
 * </pre>
 * 
 * <pre> -E weka.classifiers.bayes.net.estimate.SimpleEstimator
 *  Estimator algorithm
 * </pre>
 * 
 <!-- options-end -->
 *
 * @author Remco Bouckaert (rrb@xm.co.nz)
 * @version $Revision: 5725 $
 */
public class BayesNet
  extends Classifier
  implements OptionHandler, WeightedInstancesHandler, Drawable, 
             AdditionalMeasureProducer {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  static final long serialVersionUID = 746037443258775954L;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * The parent sets.
   */
  protected ParentSet[] m_ParentSets;

  /**
   * The attribute estimators containing CPTs.
   */
  public Estimator[][] m_Distributions;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** filter used to quantize continuous variables, if any **/
  protected Discretize m_DiscretizeFilter = null;

  /** attribute index of a non-nominal attribute */
  int m_nNonDiscreteAttribute = -1;

  /** filter used to fill in missing values, if any **/
<<<<<<< HEAD
  protected ReplaceMissingValues m_MissingValuesFilter = null;
=======
<<<<<<< HEAD
  protected ReplaceMissingValues m_MissingValuesFilter = null;
=======
  protected ReplaceMissingValues m_MissingValuesFilter = null;	
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * The number of classes
   */
  protected int m_NumClasses;

  /**
   * The dataset header for the purposes of printing out a semi-intelligible
   * model
   */
  public Instances m_Instances;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * The number of instances the model was built from
   */
  private int m_NumInstances;

  /**
   * Datastructure containing ADTree representation of the database. This may
   * result in more efficient access to the data.
<<<<<<< HEAD
=======
=======
   * Datastructure containing ADTree representation of the database.
   * This may result in more efficient access to the data.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  ADNode m_ADTree;

  /**
   * Bayes network to compare the structure with.
   */
  protected BIFReader m_otherBayesNet = null;

  /**
<<<<<<< HEAD
   * Use the experimental ADTree datastructure for calculating contingency
   * tables
=======
<<<<<<< HEAD
   * Use the experimental ADTree datastructure for calculating contingency
   * tables
=======
   * Use the experimental ADTree datastructure for calculating contingency tables
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  boolean m_bUseADTree = false;

  /**
   * Search algorithm used for learning the structure of a network.
   */
  SearchAlgorithm m_SearchAlgorithm = new K2();

  /**
   * Search algorithm used for learning the structure of a network.
   */
  BayesNetEstimator m_BayesNetEstimator = new SimpleEstimator();

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
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

    // instances
    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * Generates the classifier.
   * 
   * @param instances set of instances serving as training data
<<<<<<< HEAD
   * @throws Exception if the classifier has not been generated successfully
   */
  @Override
=======
<<<<<<< HEAD
   * @throws Exception if the classifier has not been generated successfully
   */
  @Override
=======
   * @throws Exception if the classifier has not been generated
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

<<<<<<< HEAD
    // ensure we have a data set with discrete variables only and with no
    // missing values
=======
<<<<<<< HEAD
    // ensure we have a data set with discrete variables only and with no
    // missing values
=======
    // ensure we have a data set with discrete variables only and with no missing values
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    instances = normalizeDataSet(instances);

    // Copy the instances
    m_Instances = new Instances(instances);
<<<<<<< HEAD
    m_NumInstances = m_Instances.numInstances();
=======
<<<<<<< HEAD
    m_NumInstances = m_Instances.numInstances();
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // sanity check: need more than 1 variable in datat set
    m_NumClasses = instances.numClasses();

    // initialize ADTree
    if (m_bUseADTree) {
      m_ADTree = ADNode.makeADTree(instances);
<<<<<<< HEAD
      // System.out.println("Oef, done!");
=======
<<<<<<< HEAD
      // System.out.println("Oef, done!");
=======
      //      System.out.println("Oef, done!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // build the network structure
    initStructure();

    // build the network structure
    buildStructure();

    // build the set of CPTs
    estimateCPTs();

    // Save space
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Instances = new Instances(m_Instances, 0);
    m_ADTree = null;
  } // buildClassifier

  /**
   * Returns the number of instances the model was built from.
   */
  public int getNumInstances() {

    return m_NumInstances;
  }

  /**
   * ensure that all variables are nominal and that there are no missing values
   * 
   * @param instances data set to check and quantize and/or fill in missing
   *          values
<<<<<<< HEAD
=======
=======
    // m_Instances = new Instances(m_Instances, 0);
    m_ADTree = null;
  } // buildClassifier

  /** ensure that all variables are nominal and that there are no missing values
   * @param instances data set to check and quantize and/or fill in missing values
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return filtered instances
   * @throws Exception if a filter (Discretize, ReplaceMissingValues) fails
   */
  protected Instances normalizeDataSet(Instances instances) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_nNonDiscreteAttribute = -1;
    Enumeration<Attribute> enu = instances.enumerateAttributes();
    while (enu.hasMoreElements()) {
      Attribute attribute = enu.nextElement();
      if (attribute.type() != Attribute.NOMINAL) {
        m_nNonDiscreteAttribute = attribute.index();
      }
    }

    if ((m_nNonDiscreteAttribute > -1)
      && (instances.attribute(m_nNonDiscreteAttribute).type() != Attribute.NOMINAL)) {
<<<<<<< HEAD
=======
=======
    m_DiscretizeFilter = null;
    m_MissingValuesFilter = null;

    boolean bHasNonNominal = false;
    boolean bHasMissingValues = false;

    Enumeration enu = instances.enumerateAttributes();		
    while (enu.hasMoreElements()) {
      Attribute attribute = (Attribute) enu.nextElement();
      if (attribute.type() != Attribute.NOMINAL) {
	m_nNonDiscreteAttribute = attribute.index();
	bHasNonNominal = true;
	//throw new UnsupportedAttributeTypeException("BayesNet handles nominal variables only. Non-nominal variable in dataset detected.");
      }
      Enumeration enum2 = instances.enumerateInstances();
      while (enum2.hasMoreElements()) {
	if (((Instance) enum2.nextElement()).isMissing(attribute)) {
	  bHasMissingValues = true;
	  // throw new NoSupportForMissingValuesException("BayesNet: no missing values, please.");
	}
      }
    }

    if (bHasNonNominal) {
      System.err.println("Warning: discretizing data set");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_DiscretizeFilter = new Discretize();
      m_DiscretizeFilter.setInputFormat(instances);
      instances = Filter.useFilter(instances, m_DiscretizeFilter);
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_MissingValuesFilter = new ReplaceMissingValues();
    m_MissingValuesFilter.setInputFormat(instances);
    instances = Filter.useFilter(instances, m_MissingValuesFilter);

    return instances;
  } // normalizeDataSet

  /**
   * ensure that all variables are nominal and that there are no missing values
   * 
   * @param instance instance to check and quantize and/or fill in missing
   *          values
<<<<<<< HEAD
=======
=======
    if (bHasMissingValues) {
      System.err.println("Warning: filling in missing values in data set");
      m_MissingValuesFilter = new ReplaceMissingValues();
      m_MissingValuesFilter.setInputFormat(instances);
      instances = Filter.useFilter(instances, m_MissingValuesFilter);
    }
    return instances;
  } // normalizeDataSet

  /** ensure that all variables are nominal and that there are no missing values
   * @param instance instance to check and quantize and/or fill in missing values
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return filtered instance
   * @throws Exception if a filter (Discretize, ReplaceMissingValues) fails
   */
  protected Instance normalizeInstance(Instance instance) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if ((m_nNonDiscreteAttribute > -1)
      && (instance.attribute(m_nNonDiscreteAttribute).type() != Attribute.NOMINAL)) {
      m_DiscretizeFilter.input(instance);
      instance = m_DiscretizeFilter.output();
    }

    m_MissingValuesFilter.input(instance);
    instance = m_MissingValuesFilter.output();

<<<<<<< HEAD
=======
=======
    if ((m_DiscretizeFilter != null) &&
	(instance.attribute(m_nNonDiscreteAttribute).type() != Attribute.NOMINAL)) {
      m_DiscretizeFilter.input(instance);
      instance = m_DiscretizeFilter.output();
    }
    if (m_MissingValuesFilter != null) {
      m_MissingValuesFilter.input(instance);
      instance = m_MissingValuesFilter.output();
    } else {
      // is there a missing value in this instance?
      // this can happen when there is no missing value in the training set
      for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
	if (iAttribute != instance.classIndex() && instance.isMissing(iAttribute)) {
	  System.err.println("Warning: Found missing value in test set, filling in values.");
	  m_MissingValuesFilter = new ReplaceMissingValues();
	  m_MissingValuesFilter.setInputFormat(m_Instances);
	  Filter.useFilter(m_Instances, m_MissingValuesFilter);
	  m_MissingValuesFilter.input(instance);
	  instance = m_MissingValuesFilter.output();
	  iAttribute = m_Instances.numAttributes();
	}
      }
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return instance;
  } // normalizeInstance

  /**
   * Init structure initializes the structure to an empty graph or a Naive Bayes
   * graph (depending on the -N flag).
   * 
   * @throws Exception in case of an error
   */
  public void initStructure() throws Exception {

    // initialize topological ordering
<<<<<<< HEAD
    // m_nOrder = new int[m_Instances.numAttributes()];
    // m_nOrder[0] = m_Instances.classIndex();
=======
<<<<<<< HEAD
    // m_nOrder = new int[m_Instances.numAttributes()];
    // m_nOrder[0] = m_Instances.classIndex();
=======
    //    m_nOrder = new int[m_Instances.numAttributes()];
    //    m_nOrder[0] = m_Instances.classIndex();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int nAttribute = 0;

    for (int iOrder = 1; iOrder < m_Instances.numAttributes(); iOrder++) {
      if (nAttribute == m_Instances.classIndex()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        nAttribute++;
      }

      // m_nOrder[iOrder] = nAttribute++;
<<<<<<< HEAD
=======
=======
	nAttribute++;
      }

      //      m_nOrder[iOrder] = nAttribute++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // reserve memory
    m_ParentSets = new ParentSet[m_Instances.numAttributes()];

    for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
      m_ParentSets[iAttribute] = new ParentSet(m_Instances.numAttributes());
    }
  } // initStructure

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * buildStructure determines the network structure/graph of the network. The
   * default behavior is creating a network where all nodes have the first node
   * as its parent (i.e., a BayesNet that behaves like a naive Bayes
   * classifier). This method can be overridden by derived classes to restrict
   * the class of network structures that are acceptable.
<<<<<<< HEAD
=======
=======
   * buildStructure determines the network structure/graph of the network.
   * The default behavior is creating a network where all nodes have the first
   * node as its parent (i.e., a BayesNet that behaves like a naive Bayes classifier).
   * This method can be overridden by derived classes to restrict the class
   * of network structures that are acceptable.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws Exception in case of an error
   */
  public void buildStructure() throws Exception {
    m_SearchAlgorithm.buildStructure(this, m_Instances);
  } // buildStructure

  /**
<<<<<<< HEAD
   * estimateCPTs estimates the conditional probability tables for the Bayes Net
   * using the network structure.
=======
<<<<<<< HEAD
   * estimateCPTs estimates the conditional probability tables for the Bayes Net
   * using the network structure.
=======
   * estimateCPTs estimates the conditional probability tables for the Bayes
   * Net using the network structure.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws Exception in case of an error
   */
  public void estimateCPTs() throws Exception {
    m_BayesNetEstimator.estimateCPTs(this);
  } // estimateCPTs

  /**
   * initializes the conditional probabilities
   * 
   * @throws Exception in case of an error
   */
  public void initCPTs() throws Exception {
    m_BayesNetEstimator.initCPTs(this);
  } // estimateCPTs

  /**
   * Updates the classifier with the given instance.
   * 
   * @param instance the new training instance to include in the model
<<<<<<< HEAD
   * @throws Exception if the instance could not be incorporated in the model.
=======
<<<<<<< HEAD
   * @throws Exception if the instance could not be incorporated in the model.
=======
   * @throws Exception if the instance could not be incorporated in
   * the model.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void updateClassifier(Instance instance) throws Exception {
    instance = normalizeInstance(instance);
    m_BayesNetEstimator.updateClassifier(this, instance);
  } // updateClassifier

  /**
<<<<<<< HEAD
   * Calculates the class membership probabilities for the given test instance.
=======
<<<<<<< HEAD
   * Calculates the class membership probabilities for the given test instance.
=======
   * Calculates the class membership probabilities for the given test
   * instance.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param instance the instance to be classified
   * @return predicted class probability distribution
   * @throws Exception if there is a problem generating the prediction
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public double[] distributionForInstance(Instance instance) throws Exception {
    instance = normalizeInstance(instance);
    return m_BayesNetEstimator.distributionForInstance(this, instance);
  } // distributionForInstance

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Calculates the counts for Dirichlet distribution for the class membership
   * probabilities for the given test instance.
   * 
   * @param instance the instance to be classified
   * @return counts for Dirichlet distribution for class probability
<<<<<<< HEAD
=======
=======
   * Calculates the counts for Dirichlet distribution for the 
   * class membership probabilities for the given test instance.
   * 
   * @param instance the instance to be classified
   * @return counts for Dirichlet distribution for class probability 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @throws Exception if there is a problem generating the prediction
   */
  public double[] countsForInstance(Instance instance) throws Exception {
    double[] fCounts = new double[m_NumClasses];

    for (int iClass = 0; iClass < m_NumClasses; iClass++) {
      fCounts[iClass] = 0.0;
    }

    for (int iClass = 0; iClass < m_NumClasses; iClass++) {
      double fCount = 0;

      for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        double iCPT = 0;

        for (int iParent = 0; iParent < m_ParentSets[iAttribute]
          .getNrOfParents(); iParent++) {
          int nParent = m_ParentSets[iAttribute].getParent(iParent);

          if (nParent == m_Instances.classIndex()) {
            iCPT = iCPT * m_NumClasses + iClass;
          } else {
            iCPT = iCPT * m_Instances.attribute(nParent).numValues()
              + instance.value(nParent);
          }
        }

        if (iAttribute == m_Instances.classIndex()) {
          fCount += ((DiscreteEstimatorBayes) m_Distributions[iAttribute][(int) iCPT])
            .getCount(iClass);
        } else {
          fCount += ((DiscreteEstimatorBayes) m_Distributions[iAttribute][(int) iCPT])
            .getCount(instance.value(iAttribute));
        }
<<<<<<< HEAD
=======
=======
	double iCPT = 0;

	for (int iParent = 0; iParent < m_ParentSets[iAttribute].getNrOfParents(); iParent++) {
	  int nParent = m_ParentSets[iAttribute].getParent(iParent);

	  if (nParent == m_Instances.classIndex()) {
	    iCPT = iCPT * m_NumClasses + iClass;
	  } else {
	    iCPT = iCPT * m_Instances.attribute(nParent).numValues() + instance.value(nParent);
	  }
	}

	if (iAttribute == m_Instances.classIndex()) {
	  fCount += ((DiscreteEstimatorBayes) m_Distributions[iAttribute][(int) iCPT]).getCount(iClass);
	} else {
	  fCount
	  += ((DiscreteEstimatorBayes) m_Distributions[iAttribute][(int) iCPT]).getCount(
	      instance.value(iAttribute));
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      fCounts[iClass] += fCount;
    }
    return fCounts;
  } // countsForInstance

  /**
   * Returns an enumeration describing the available options
   * 
   * @return an enumeration of all the available options
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>(4);

    newVector.addElement(new Option("\tDo not use ADTree data structure\n",
      "D", 0, "-D"));
    newVector.addElement(new Option("\tBIF file to compare with\n", "B", 1,
      "-B <BIF file>"));
    newVector.addElement(new Option("\tSearch algorithm\n", "Q", 1,
      "-Q weka.classifiers.bayes.net.search.SearchAlgorithm"));
    newVector.addElement(new Option("\tEstimator algorithm\n", "E", 1,
      "-E weka.classifiers.bayes.net.estimate.SimpleEstimator"));
    newVector.addAll(Collections.list(super.listOptions()));

    newVector.addElement(new Option("", "", 0,
      "\nOptions specific to search method "
        + getSearchAlgorithm().getClass().getName() + ":"));
    newVector.addAll(Collections.list(getSearchAlgorithm().listOptions()));

    newVector.addElement(new Option("", "", 0,
      "\nOptions specific to estimator method "
        + getEstimator().getClass().getName() + ":"));
    newVector.addAll(Collections.list(getEstimator().listOptions()));
<<<<<<< HEAD
=======
=======
  public Enumeration listOptions() {
    Vector newVector = new Vector(4);

    newVector.addElement(new Option("\tDo not use ADTree data structure\n", "D", 0, "-D"));
    newVector.addElement(new Option("\tBIF file to compare with\n", "B", 1, "-B <BIF file>"));
    newVector.addElement(new Option("\tSearch algorithm\n", "Q", 1, "-Q weka.classifiers.bayes.net.search.SearchAlgorithm"));
    newVector.addElement(new Option("\tEstimator algorithm\n", "E", 1, "-E weka.classifiers.bayes.net.estimate.SimpleEstimator"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return newVector.elements();
  } // listOptions

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Parses a given list of options.
   * <p>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -D
   *  Do not use ADTree data structure
   * </pre>
   * 
   * <pre>
   * -B &lt;BIF file&gt;
   *  BIF file to compare with
   * </pre>
   * 
   * <pre>
   * -Q weka.classifiers.bayes.net.search.SearchAlgorithm
   *  Search algorithm
   * </pre>
   * 
   * <pre>
   * -E weka.classifiers.bayes.net.estimate.SimpleEstimator
   *  Estimator algorithm
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    super.setOptions(options);
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p>
   * 
     <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Do not use ADTree data structure
   * </pre>
   * 
   * <pre> -B &lt;BIF file&gt;
   *  BIF file to compare with
   * </pre>
   * 
   * <pre> -Q weka.classifiers.bayes.net.search.SearchAlgorithm
   *  Search algorithm
   * </pre>
   * 
   * <pre> -E weka.classifiers.bayes.net.estimate.SimpleEstimator
   *  Estimator algorithm
   * </pre>
   * 
     <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_bUseADTree = !(Utils.getFlag('D', options));

    String sBIFFile = Utils.getOption('B', options);
    if (sBIFFile != null && !sBIFFile.equals("")) {
      setBIFFile(sBIFFile);
    }

    String searchAlgorithmName = Utils.getOption('Q', options);
    if (searchAlgorithmName.length() != 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      setSearchAlgorithm((SearchAlgorithm) Utils.forName(SearchAlgorithm.class,
        searchAlgorithmName, partitionOptions(options)));
    } else {
      setSearchAlgorithm(new K2());
    }

    String estimatorName = Utils.getOption('E', options);
    if (estimatorName.length() != 0) {
      setEstimator((BayesNetEstimator) Utils.forName(BayesNetEstimator.class,
        estimatorName, Utils.partitionOptions(options)));
    } else {
<<<<<<< HEAD
=======
=======
      setSearchAlgorithm(
	  (SearchAlgorithm) Utils.forName(
	      SearchAlgorithm.class,
	      searchAlgorithmName,
	      partitionOptions(options)));
    }
    else {
      setSearchAlgorithm(new K2());
    }


    String estimatorName = Utils.getOption('E', options);
    if (estimatorName.length() != 0) {
      setEstimator(
	  (BayesNetEstimator) Utils.forName(
	      BayesNetEstimator.class,
	      estimatorName,
	      Utils.partitionOptions(options)));
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      setEstimator(new SimpleEstimator());
    }

    Utils.checkForRemainingOptions(options);
  } // setOptions

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the secondary set of options (if any) contained in the supplied
   * options array. The secondary set is defined to be any options after the
   * first "--" but before the "-E". These options are removed from the original
   * options array.
   * 
   * @param options the input array of options
   * @return the array of secondary options
   */
  public static String[] partitionOptions(String[] options) {

    for (int i = 0; i < options.length; i++) {
      if (options[i].equals("--")) {
        // ensure it follows by a -E option
        int j = i;
        while ((j < options.length) && !(options[j].equals("-E"))) {
          j++;
        }
        /*
         * if (j >= options.length) { return new String[0]; }
         */
        options[i++] = "";
        String[] result = new String[options.length - i];
        j = i;
        while ((j < options.length) && !(options[j].equals("-E"))) {
          result[j - i] = options[j];
          options[j] = "";
          j++;
        }
        while (j < options.length) {
          result[j - i] = "";
          j++;
        }
        return result;
      }
    }
    return new String[0];
  }

<<<<<<< HEAD
=======
=======
   * Returns the secondary set of options (if any) contained in
   * the supplied options array. The secondary set is defined to
   * be any options after the first "--" but before the "-E". These 
   * options are removed from the original options array.
   *
   * @param options the input array of options
   * @return the array of secondary options
   */
  public static String [] partitionOptions(String [] options) {

    for (int i = 0; i < options.length; i++) {
      if (options[i].equals("--")) {
	// ensure it follows by a -E option
	int j = i;
	while ((j < options.length) && !(options[j].equals("-E"))) {
	  j++;
	}
        /*	if (j >= options.length) {
	  return new String[0];
          } */
	options[i++] = "";
	String [] result = new String [options.length - i];
	j = i;
	while ((j < options.length) && !(options[j].equals("-E"))) {
	  result[j - i] = options[j];
	  options[j] = "";
	  j++;
	}
	while(j < options.length) {
	  result[j - i] = "";
	  j++;
	}		 
	return result;
      }
    }
    return new String [0];
  }


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Gets the current settings of the classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String[] getOptions() {
    Vector<String> options = new Vector<String>();

    Collections.addAll(options, super.getOptions());

    if (!m_bUseADTree) {
      options.add("-D");
    }

    if (m_otherBayesNet != null) {
      options.add("-B");
      options.add(m_otherBayesNet.getFileName());
    }

    options.add("-Q");
    options.add("" + getSearchAlgorithm().getClass().getName());
    options.add("--");
    Collections.addAll(options, getSearchAlgorithm().getOptions());

    options.add("-E");
    options.add("" + getEstimator().getClass().getName());
    options.add("--");
    Collections.addAll(options, getEstimator().getOptions());

    return options.toArray(new String[0]);
  } // getOptions

  /**
   * Set the SearchAlgorithm used in searching for network structures.
   * 
<<<<<<< HEAD
=======
=======
  public String[] getOptions() {
    String[] searchOptions = m_SearchAlgorithm.getOptions();
    String[] estimatorOptions = m_BayesNetEstimator.getOptions();
    String[] options = new String[11 + searchOptions.length + estimatorOptions.length];
    int current = 0;

    if (!m_bUseADTree) {
      options[current++] = "-D";
    }

    if (m_otherBayesNet != null) {
      options[current++] = "-B";
      options[current++] = ((BIFReader) m_otherBayesNet).getFileName();
    }

    options[current++] = "-Q";
    options[current++] = "" + getSearchAlgorithm().getClass().getName();
    options[current++] = "--";
    for (int iOption = 0; iOption < searchOptions.length; iOption++) {
      options[current++] = searchOptions[iOption];
    }

    options[current++] = "-E";
    options[current++] = "" + getEstimator().getClass().getName();
    options[current++] = "--";
    for (int iOption = 0; iOption < estimatorOptions.length; iOption++) {
      options[current++] = estimatorOptions[iOption];
    }

    // Fill up rest with empty strings, not nulls!
    while (current < options.length) {
      options[current++] = "";
    }

    return options;
  } // getOptions

  /**
   * Set the SearchAlgorithm used in searching for network structures. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newSearchAlgorithm the SearchAlgorithm to use.
   */
  public void setSearchAlgorithm(SearchAlgorithm newSearchAlgorithm) {
    m_SearchAlgorithm = newSearchAlgorithm;
  }

  /**
   * Get the SearchAlgorithm used as the search algorithm
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the SearchAlgorithm used as the search algorithm
   */
  public SearchAlgorithm getSearchAlgorithm() {
    return m_SearchAlgorithm;
  }

  /**
<<<<<<< HEAD
   * Set the Estimator Algorithm used in calculating the CPTs
   * 
=======
<<<<<<< HEAD
   * Set the Estimator Algorithm used in calculating the CPTs
   * 
=======
   * Set the Estimator Algorithm used in calculating the CPTs 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newBayesNetEstimator the Estimator to use.
   */
  public void setEstimator(BayesNetEstimator newBayesNetEstimator) {
    m_BayesNetEstimator = newBayesNetEstimator;
  }

  /**
   * Get the BayesNetEstimator used for calculating the CPTs
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the BayesNetEstimator used.
   */
  public BayesNetEstimator getEstimator() {
    return m_BayesNetEstimator;
  }

  /**
   * Set whether ADTree structure is used or not
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param bUseADTree true if an ADTree structure is used
   */
  public void setUseADTree(boolean bUseADTree) {
    m_bUseADTree = bUseADTree;
  }

  /**
   * Method declaration
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return whether ADTree structure is used or not
   */
  public boolean getUseADTree() {
    return m_bUseADTree;
  }

  /**
   * Set name of network in BIF file to compare with
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param sBIFFile the name of the BIF file
   */
  public void setBIFFile(String sBIFFile) {
    try {
      m_otherBayesNet = new BIFReader().processFile(sBIFFile);
    } catch (Throwable t) {
      m_otherBayesNet = null;
    }
  }

  /**
   * Get name of network in BIF file to compare with
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return BIF file name
   */
  public String getBIFFile() {
    if (m_otherBayesNet != null) {
      return m_otherBayesNet.getFileName();
    }
    return "";
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns a description of the classifier.
   * 
   * @return a description of the classifier as a string.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {
    StringBuffer text = new StringBuffer();

    text.append("Bayes Network Classifier");
    text.append("\n" + (m_bUseADTree ? "Using " : "not using ") + "ADTree");

    if (m_Instances == null) {
      text.append(": No model built yet.");
    } else {

      // flatten BayesNet down to text
      text.append("\n#attributes=");
      text.append(m_Instances.numAttributes());
      text.append(" #classindex=");
      text.append(m_Instances.classIndex());
      text.append("\nNetwork structure (nodes followed by parents)\n");

      for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        text.append(m_Instances.attribute(iAttribute).name() + "("
          + m_Instances.attribute(iAttribute).numValues() + "): ");

        for (int iParent = 0; iParent < m_ParentSets[iAttribute]
          .getNrOfParents(); iParent++) {
          text.append(m_Instances.attribute(
            m_ParentSets[iAttribute].getParent(iParent)).name()
            + " ");
        }

        text.append("\n");

        // Description of distributions tends to be too much detail, so it is
        // commented out here
        // for (int iParent = 0; iParent <
        // m_ParentSets[iAttribute].GetCardinalityOfParents(); iParent++) {
        // text.append('(' + m_Distributions[iAttribute][iParent].toString() +
        // ')');
        // }
        // text.append("\n");
<<<<<<< HEAD
=======
=======
	text.append(
	    m_Instances.attribute(iAttribute).name()
	    + "("
		+ m_Instances.attribute(iAttribute).numValues()
		+ "): ");

	for (int iParent = 0; iParent < m_ParentSets[iAttribute].getNrOfParents(); iParent++) {
	  text.append(m_Instances.attribute(m_ParentSets[iAttribute].getParent(iParent)).name() + " ");
	}

	text.append("\n");

	// Description of distributions tends to be too much detail, so it is commented out here
	// for (int iParent = 0; iParent < m_ParentSets[iAttribute].GetCardinalityOfParents(); iParent++) {
	// text.append('(' + m_Distributions[iAttribute][iParent].toString() + ')');
	// }
	// text.append("\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      text.append("LogScore Bayes: " + measureBayesScore() + "\n");
      text.append("LogScore BDeu: " + measureBDeuScore() + "\n");
      text.append("LogScore MDL: " + measureMDLScore() + "\n");
      text.append("LogScore ENTROPY: " + measureEntropyScore() + "\n");
      text.append("LogScore AIC: " + measureAICScore() + "\n");

      if (m_otherBayesNet != null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        text.append("Missing: " + m_otherBayesNet.missingArcs(this)
          + " Extra: " + m_otherBayesNet.extraArcs(this) + " Reversed: "
          + m_otherBayesNet.reversedArcs(this) + "\n");
        text.append("Divergence: " + m_otherBayesNet.divergence(this) + "\n");
<<<<<<< HEAD
=======
=======
	text.append(
	    "Missing: "
	    + m_otherBayesNet.missingArcs(this)
	    + " Extra: "
	    + m_otherBayesNet.extraArcs(this)
	    + " Reversed: "
	    + m_otherBayesNet.reversedArcs(this)
	    + "\n");
	text.append("Divergence: " + m_otherBayesNet.divergence(this) + "\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    return text.toString();
  } // toString

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the type of graph this classifier represents.
   * 
   * @return Drawable.TREE
   */
  @Override
<<<<<<< HEAD
=======
=======

  /**
   *  Returns the type of graph this classifier
   *  represents.
   *  @return Drawable.TREE
   */   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int graphType() {
    return Drawable.BayesNet;
  }

  /**
   * Returns a BayesNet graph in XMLBIF ver 0.3 format.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return String representing this BayesNet in XMLBIF ver 0.3
   * @throws Exception in case BIF generation fails
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @return String representing this BayesNet in XMLBIF ver  0.3
   * @throws Exception in case BIF generation fails
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String graph() throws Exception {
    return toXMLBIF03();
  }

  public String getBIFHeader() {
    StringBuffer text = new StringBuffer();
    text.append("<?xml version=\"1.0\"?>\n");
    text.append("<!-- DTD for the XMLBIF 0.3 format -->\n");
    text.append("<!DOCTYPE BIF [\n");
    text.append("	<!ELEMENT BIF ( NETWORK )*>\n");
    text.append("	      <!ATTLIST BIF VERSION CDATA #REQUIRED>\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text
      .append("	<!ELEMENT NETWORK ( NAME, ( PROPERTY | VARIABLE | DEFINITION )* )>\n");
    text.append("	<!ELEMENT NAME (#PCDATA)>\n");
    text.append("	<!ELEMENT VARIABLE ( NAME, ( OUTCOME |  PROPERTY )* ) >\n");
    text
      .append("	      <!ATTLIST VARIABLE TYPE (nature|decision|utility) \"nature\">\n");
    text.append("	<!ELEMENT OUTCOME (#PCDATA)>\n");
    text
      .append("	<!ELEMENT DEFINITION ( FOR | GIVEN | TABLE | PROPERTY )* >\n");
<<<<<<< HEAD
=======
=======
    text.append("	<!ELEMENT NETWORK ( NAME, ( PROPERTY | VARIABLE | DEFINITION )* )>\n");
    text.append("	<!ELEMENT NAME (#PCDATA)>\n");
    text.append("	<!ELEMENT VARIABLE ( NAME, ( OUTCOME |  PROPERTY )* ) >\n");
    text.append("	      <!ATTLIST VARIABLE TYPE (nature|decision|utility) \"nature\">\n");
    text.append("	<!ELEMENT OUTCOME (#PCDATA)>\n");
    text.append("	<!ELEMENT DEFINITION ( FOR | GIVEN | TABLE | PROPERTY )* >\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text.append("	<!ELEMENT FOR (#PCDATA)>\n");
    text.append("	<!ELEMENT GIVEN (#PCDATA)>\n");
    text.append("	<!ELEMENT TABLE (#PCDATA)>\n");
    text.append("	<!ELEMENT PROPERTY (#PCDATA)>\n");
    text.append("]>\n");
    return text.toString();
  } // getBIFHeader

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns a description of the classifier in XML BIF 0.3 format. See
   * http://www-2.cs.cmu.edu/~fgcozman/Research/InterchangeFormat/ for details
   * on XML BIF.
   * 
<<<<<<< HEAD
=======
=======
   * Returns a description of the classifier in XML BIF 0.3 format.
   * See http://www-2.cs.cmu.edu/~fgcozman/Research/InterchangeFormat/
   * for details on XML BIF.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an XML BIF 0.3 description of the classifier as a string.
   */
  public String toXMLBIF03() {
    if (m_Instances == null) {
<<<<<<< HEAD
      return ("<!--No model built yet-->");
=======
<<<<<<< HEAD
      return ("<!--No model built yet-->");
=======
      return("<!--No model built yet-->");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    StringBuffer text = new StringBuffer();
    text.append(getBIFHeader());
    text.append("\n");
    text.append("\n");
    text.append("<BIF VERSION=\"0.3\">\n");
    text.append("<NETWORK>\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text.append("<NAME>" + XMLNormalize(Utils.quote(m_Instances.relationName()))
      + "</NAME>\n");
    for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
      text.append("<VARIABLE TYPE=\"nature\">\n");
      text.append("<NAME>"
        + XMLNormalize(Utils.quote(m_Instances.attribute(iAttribute).name())) + "</NAME>\n");
      for (int iValue = 0; iValue < m_Instances.attribute(iAttribute)
        .numValues(); iValue++) {
        text.append("<OUTCOME>"
          + XMLNormalize(Utils.quote(m_Instances.attribute(iAttribute).value(iValue)))
          + "</OUTCOME>\n");
<<<<<<< HEAD
=======
=======
    text.append("<NAME>" + XMLNormalize(m_Instances.relationName()) + "</NAME>\n");
    for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
      text.append("<VARIABLE TYPE=\"nature\">\n");
      text.append("<NAME>" + XMLNormalize(m_Instances.attribute(iAttribute).name()) + "</NAME>\n");
      for (int iValue = 0; iValue < m_Instances.attribute(iAttribute).numValues(); iValue++) {
	text.append("<OUTCOME>" + XMLNormalize(m_Instances.attribute(iAttribute).value(iValue)) + "</OUTCOME>\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      text.append("</VARIABLE>\n");
    }

    for (int iAttribute = 0; iAttribute < m_Instances.numAttributes(); iAttribute++) {
      text.append("<DEFINITION>\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      text.append("<FOR>"
        + XMLNormalize(Utils.quote(m_Instances.attribute(iAttribute).name())) + "</FOR>\n");
      for (int iParent = 0; iParent < m_ParentSets[iAttribute].getNrOfParents(); iParent++) {
        text
          .append("<GIVEN>"
            + XMLNormalize(Utils.quote(m_Instances.attribute(
              m_ParentSets[iAttribute].getParent(iParent)).name()))
            + "</GIVEN>\n");
      }
      text.append("<TABLE>\n");
      for (int iParent = 0; iParent < m_ParentSets[iAttribute]
        .getCardinalityOfParents(); iParent++) {
        for (int iValue = 0; iValue < m_Instances.attribute(iAttribute)
          .numValues(); iValue++) {
          text.append(m_Distributions[iAttribute][iParent]
            .getProbability(iValue));
          text.append(' ');
        }
        text.append('\n');
<<<<<<< HEAD
=======
=======
      text.append("<FOR>" + XMLNormalize(m_Instances.attribute(iAttribute).name()) + "</FOR>\n");
      for (int iParent = 0; iParent < m_ParentSets[iAttribute].getNrOfParents(); iParent++) {
	text.append("<GIVEN>"
	    + XMLNormalize(m_Instances.attribute(m_ParentSets[iAttribute].getParent(iParent)).name()) +
	"</GIVEN>\n");
      }
      text.append("<TABLE>\n");
      for (int iParent = 0; iParent < m_ParentSets[iAttribute].getCardinalityOfParents(); iParent++) {
	for (int iValue = 0; iValue < m_Instances.attribute(iAttribute).numValues(); iValue++) {
	  text.append(m_Distributions[iAttribute][iParent].getProbability(iValue));
	  text.append(' ');
	}
	text.append('\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      text.append("</TABLE>\n");
      text.append("</DEFINITION>\n");
    }
    text.append("</NETWORK>\n");
    text.append("</BIF>\n");
    return text.toString();
  } // toXMLBIF03

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * XMLNormalize converts the five standard XML entities in a string g.e. the
   * string V&D's is returned as V&amp;D&apos;s
   * 
<<<<<<< HEAD
=======
=======

  /** XMLNormalize converts the five standard XML entities in a string
   * g.e. the string V&D's is returned as V&amp;D&apos;s
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param sStr string to normalize
   * @return normalized string
   */
  protected String XMLNormalize(String sStr) {
    StringBuffer sStr2 = new StringBuffer();
    for (int iStr = 0; iStr < sStr.length(); iStr++) {
      char c = sStr.charAt(iStr);
      switch (c) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      case '&':
        sStr2.append("&amp;");
        break;
      case '\'':
        sStr2.append("&apos;");
        break;
      case '\"':
        sStr2.append("&quot;");
        break;
      case '<':
        sStr2.append("&lt;");
        break;
      case '>':
        sStr2.append("&gt;");
        break;
      default:
        sStr2.append(c);
<<<<<<< HEAD
=======
=======
	case '&': sStr2.append("&amp;"); break;
	case '\'': sStr2.append("&apos;"); break;
	case '\"': sStr2.append("&quot;"); break;
	case '<': sStr2.append("&lt;"); break;
	case '>': sStr2.append("&gt;"); break;
	default:
	  sStr2.append(c);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return sStr2.toString();
  } // XMLNormalize

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the UseADTreeoption.
   */
  public String useADTreeTipText() {
    return "When ADTree (the data structure for increasing speed on counts,"
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + " not to be confused with the classifier under the same name) is used"
      + " learning time goes down typically. However, because ADTrees are memory"
      + " intensive, memory problems may occur. Switching this option off makes"
      + " the structure learning algorithms slower, and run with less memory."
      + " By default, ADTrees are used.";
<<<<<<< HEAD
=======
=======
    + " not to be confused with the classifier under the same name) is used"
    + " learning time goes down typically. However, because ADTrees are memory"
    + " intensive, memory problems may occur. Switching this option off makes"
    + " the structure learning algorithms slower, and run with less memory."
    + " By default, ADTrees are used.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * @return a string to describe the SearchAlgorithm.
   */
  public String searchAlgorithmTipText() {
    return "Select method used for searching network structures.";
  }

  /**
   * This will return a string describing the BayesNetEstimator.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return The string.
   */
  public String estimatorTipText() {
    return "Select Estimator algorithm for finding the conditional probability tables"
<<<<<<< HEAD
      + " of the Bayes Network.";
=======
<<<<<<< HEAD
      + " of the Bayes Network.";
=======
    + " of the Bayes Network.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * @return a string to describe the BIFFile.
   */
  public String BIFFileTipText() {
    return "Set the name of a file in BIF XML format. A Bayes network learned"
<<<<<<< HEAD
      + " from data can be compared with the Bayes network represented by the BIF file."
      + " Statistics calculated are o.a. the number of missing and extra arcs.";
=======
<<<<<<< HEAD
      + " from data can be compared with the Bayes network represented by the BIF file."
      + " Statistics calculated are o.a. the number of missing and extra arcs.";
=======
    + " from data can be compared with the Bayes network represented by the BIF file."
    + " Statistics calculated are o.a. the number of missing and extra arcs.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * This will return a string describing the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return The string.
   */
  public String globalInfo() {
    return "Bayes Network learning using various search algorithms and "
      + "quality measures.\n"
      + "Base class for a Bayes Network classifier. Provides "
      + "datastructures (network structure, conditional probability "
      + "distributions, etc.) and facilities common to Bayes Network "
      + "learning algorithms like K2 and B.\n\n"
      + "For more information see:\n\n"
      + "http://www.cs.waikato.ac.nz/~remco/weka.pdf";
<<<<<<< HEAD
=======
=======
   * @return The string.
   */
  public String globalInfo() {
    return 
    "Bayes Network learning using various search algorithms and "
    + "quality measures.\n"
    + "Base class for a Bayes Network classifier. Provides "
    + "datastructures (network structure, conditional probability "
    + "distributions, etc.) and facilities common to Bayes Network "
    + "learning algorithms like K2 and B.\n\n"
    + "For more information see:\n\n"
    + "http://www.cs.waikato.ac.nz/~remco/weka.pdf";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class.
   * 
   * @param argv the options
   */
  public static void main(String[] argv) {
    runClassifier(new BayesNet(), argv);
  } // main

<<<<<<< HEAD
  /**
   * get name of the Bayes network
   * 
=======
<<<<<<< HEAD
  /**
   * get name of the Bayes network
   * 
=======
  /** get name of the Bayes network
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return name of the Bayes net
   */
  public String getName() {
    return m_Instances.relationName();
  }

<<<<<<< HEAD
  /**
   * get number of nodes in the Bayes network
   * 
=======
<<<<<<< HEAD
  /**
   * get number of nodes in the Bayes network
   * 
=======
  /** get number of nodes in the Bayes network
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return number of nodes
   */
  public int getNrOfNodes() {
    return m_Instances.numAttributes();
  }

<<<<<<< HEAD
  /**
   * get name of a node in the Bayes network
   * 
=======
<<<<<<< HEAD
  /**
   * get name of a node in the Bayes network
   * 
=======
  /** get name of a node in the Bayes network
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iNode index of the node
   * @return name of the specified node
   */
  public String getNodeName(int iNode) {
    return m_Instances.attribute(iNode).name();
  }

<<<<<<< HEAD
  /**
   * get number of values a node can take
   * 
=======
<<<<<<< HEAD
  /**
   * get number of values a node can take
   * 
=======
  /** get number of values a node can take
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iNode index of the node
   * @return cardinality of the specified node
   */
  public int getCardinality(int iNode) {
    return m_Instances.attribute(iNode).numValues();
  }

<<<<<<< HEAD
  /**
   * get name of a particular value of a node
   * 
=======
<<<<<<< HEAD
  /**
   * get name of a particular value of a node
   * 
=======
  /** get name of a particular value of a node
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iNode index of the node
   * @param iValue index of the value
   * @return cardinality of the specified node
   */
  public String getNodeValue(int iNode, int iValue) {
    return m_Instances.attribute(iNode).value(iValue);
  }

<<<<<<< HEAD
  /**
   * get number of parents of a node in the network structure
   * 
=======
<<<<<<< HEAD
  /**
   * get number of parents of a node in the network structure
   * 
=======
  /** get number of parents of a node in the network structure
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iNode index of the node
   * @return number of parents of the specified node
   */
  public int getNrOfParents(int iNode) {
    return m_ParentSets[iNode].getNrOfParents();
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * get node index of a parent of a node in the network structure
   * 
   * @param iNode index of the node
   * @param iParent index of the parents, e.g., 0 is the first parent, 1 the
   *          second parent, etc.
<<<<<<< HEAD
=======
=======
  /** get node index of a parent of a node in the network structure
   * @param iNode index of the node
   * @param iParent index of the parents, e.g., 0 is the first parent, 1 the second parent, etc.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return node index of the iParent's parent of the specified node
   */
  public int getParent(int iNode, int iParent) {
    return m_ParentSets[iNode].getParent(iParent);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Get full set of parent sets.
   * 
   * @return parent sets;
   */
  public ParentSet[] getParentSets() {
    return m_ParentSets;
  }

  /**
   * Get full set of estimators.
   * 
<<<<<<< HEAD
=======
=======
  /** Get full set of parent sets.
   * @return parent sets;
   */
  public ParentSet[] getParentSets() { 
    return m_ParentSets;
  }

  /** Get full set of estimators.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return estimators;
   */
  public Estimator[][] getDistributions() {
    return m_Distributions;
  }

<<<<<<< HEAD
  /**
   * get number of values the collection of parents of a node can take
   * 
=======
<<<<<<< HEAD
  /**
   * get number of values the collection of parents of a node can take
   * 
=======
  /** get number of values the collection of parents of a node can take
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iNode index of the node
   * @return cardinality of the parent set of the specified node
   */
  public int getParentCardinality(int iNode) {
    return m_ParentSets[iNode].getCardinalityOfParents();
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * get particular probability of the conditional probability distribtion of a
   * node given its parents.
   * 
   * @param iNode index of the node
   * @param iParent index of the parent set, 0 <= iParent <=
   *          getParentCardinality(iNode)
<<<<<<< HEAD
=======
=======
  /** get particular probability of the conditional probability distribtion
   * of a node given its parents.
   * @param iNode index of the node
   * @param iParent index of the parent set, 0 <= iParent <= getParentCardinality(iNode)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iValue index of the value, 0 <= iValue <= getCardinality(iNode)
   * @return probability
   */
  public double getProbability(int iNode, int iParent, int iValue) {
    return m_Distributions[iNode][iParent].getProbability(iValue);
  }

<<<<<<< HEAD
  /**
   * get the parent set of a node
   * 
=======
<<<<<<< HEAD
  /**
   * get the parent set of a node
   * 
=======
  /** get the parent set of a node 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param iNode index of the node
   * @return Parent set of the specified node.
   */
  public ParentSet getParentSet(int iNode) {
    return m_ParentSets[iNode];
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * get ADTree strucrture containing efficient representation of counts.
   * 
   * @return ADTree strucrture
   */
  public ADNode getADTree() {
    return m_ADTree;
  }

  // implementation of AdditionalMeasureProducer interface
  /**
   * Returns an enumeration of the measure names. Additional measures must
   * follow the naming convention of starting with "measure", eg. double
   * measureBlah()
   * 
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration<String> enumerateMeasures() {
    Vector<String> newVector = new Vector<String>(4);
<<<<<<< HEAD
=======
=======
  /** get ADTree strucrture containing efficient representation of counts.
   * @return ADTree strucrture
   */
  public ADNode getADTree() { return m_ADTree;}

  // implementation of AdditionalMeasureProducer interface
  /**
   * Returns an enumeration of the measure names. Additional measures
   * must follow the naming convention of starting with "measure", eg.
   * double measureBlah()
   * @return an enumeration of the measure names
   */
  public Enumeration enumerateMeasures() {
    Vector newVector = new Vector(4);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    newVector.addElement("measureExtraArcs");
    newVector.addElement("measureMissingArcs");
    newVector.addElement("measureReversedArcs");
    newVector.addElement("measureDivergence");
    newVector.addElement("measureBayesScore");
    newVector.addElement("measureBDeuScore");
    newVector.addElement("measureMDLScore");
    newVector.addElement("measureAICScore");
    newVector.addElement("measureEntropyScore");
    return newVector.elements();
  } // enumerateMeasures

  public double measureExtraArcs() {
    if (m_otherBayesNet != null) {
<<<<<<< HEAD
      return m_otherBayesNet.extraArcs(this);
=======
<<<<<<< HEAD
      return m_otherBayesNet.extraArcs(this);
=======
      return m_otherBayesNet.extraArcs(this); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return 0;
  } // measureExtraArcs

  public double measureMissingArcs() {
    if (m_otherBayesNet != null) {
<<<<<<< HEAD
      return m_otherBayesNet.missingArcs(this);
=======
<<<<<<< HEAD
      return m_otherBayesNet.missingArcs(this);
=======
      return m_otherBayesNet.missingArcs(this); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return 0;
  } // measureMissingArcs

  public double measureReversedArcs() {
    if (m_otherBayesNet != null) {
<<<<<<< HEAD
      return m_otherBayesNet.reversedArcs(this);
=======
<<<<<<< HEAD
      return m_otherBayesNet.reversedArcs(this);
=======
      return m_otherBayesNet.reversedArcs(this); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return 0;
  } // measureReversedArcs

  public double measureDivergence() {
    if (m_otherBayesNet != null) {
<<<<<<< HEAD
      return m_otherBayesNet.divergence(this);
=======
<<<<<<< HEAD
      return m_otherBayesNet.divergence(this);
=======
      return m_otherBayesNet.divergence(this); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return 0;
  } // measureDivergence

  public double measureBayesScore() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    try {
      LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this,
                                                                  m_Instances);
      return s.logScore(Scoreable.BAYES);
    } catch (ArithmeticException ex) {
      return Double.NaN;
    }
  } // measureBayesScore

  public double measureBDeuScore() {

    try {
      LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this,
                                                                  m_Instances);
      return s.logScore(Scoreable.BDeu);
    } catch (ArithmeticException ex) {
      return Double.NaN;
    }
  } // measureBDeuScore

  public double measureMDLScore() {

    try {
      LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this,
                                                                  m_Instances);
      return s.logScore(Scoreable.MDL);
    } catch (ArithmeticException ex) {
      return Double.NaN;
    }
  } // measureMDLScore

  public double measureAICScore() {

    try {
      LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this,
                                                                  m_Instances);
      return s.logScore(Scoreable.AIC);
    } catch (ArithmeticException ex) {
      return Double.NaN;
    }
  } // measureAICScore

  public double measureEntropyScore() {

    try {
      LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this,
                                                                  m_Instances);
      return s.logScore(Scoreable.ENTROPY);
    } catch (ArithmeticException ex) {
      return Double.NaN;
    }
<<<<<<< HEAD
=======
=======
    LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this, m_Instances);
    return s.logScore(Scoreable.BAYES);
  } // measureBayesScore

  public double measureBDeuScore() {
    LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this, m_Instances);
    return s.logScore(Scoreable.BDeu);
  } // measureBDeuScore

  public double measureMDLScore() {
    LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this, m_Instances);
    return s.logScore(Scoreable.MDL);
  } // measureMDLScore

  public double measureAICScore() {
    LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this, m_Instances);
    return s.logScore(Scoreable.AIC);
  } // measureAICScore

  public double measureEntropyScore() {
    LocalScoreSearchAlgorithm s = new LocalScoreSearchAlgorithm(this, m_Instances);
    return s.logScore(Scoreable.ENTROPY);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  } // measureEntropyScore

  /**
   * Returns the value of the named measure
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param measureName the name of the measure to query for its value
   * @return the value of the named measure
   * @throws IllegalArgumentException if the named measure is not supported
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public double getMeasure(String measureName) {
    if (measureName.equals("measureExtraArcs")) {
      return measureExtraArcs();
    }
    if (measureName.equals("measureMissingArcs")) {
      return measureMissingArcs();
    }
    if (measureName.equals("measureReversedArcs")) {
      return measureReversedArcs();
    }
    if (measureName.equals("measureDivergence")) {
      return measureDivergence();
    }
    if (measureName.equals("measureBayesScore")) {
      return measureBayesScore();
    }
    if (measureName.equals("measureBDeuScore")) {
      return measureBDeuScore();
    }
    if (measureName.equals("measureMDLScore")) {
      return measureMDLScore();
    }
    if (measureName.equals("measureAICScore")) {
      return measureAICScore();
    }
    if (measureName.equals("measureEntropyScore")) {
      return measureEntropyScore();
    }
    return 0;
  } // getMeasure

  /**
   * Returns the revision string.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 13308 $");
<<<<<<< HEAD
=======
=======
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5725 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
} // class BayesNet
