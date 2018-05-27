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
 *    M5Base.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.trees.m5;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.functions.LinearRegression;
import weka.core.AdditionalMeasureProducer;
import weka.core.Capabilities;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.classifiers.functions.LinearRegression;
import weka.core.AdditionalMeasureProducer;
import weka.core.Capabilities;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.TechnicalInformation;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
<<<<<<< HEAD
=======
=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.filters.Filter;
import weka.filters.supervised.attribute.NominalToBinary;
import weka.filters.unsupervised.attribute.RemoveUseless;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * M5Base. Implements base routines for generating M5 Model trees and rules.
 * <p>
 * 
 * The original algorithm M5 was invented by Quinlan: <br/>
 * 
 * Quinlan J. R. (1992). Learning with continuous classes. Proceedings of the
 * Australian Joint Conference on Artificial Intelligence. 343--348. World
 * Scientific, Singapore.
 * <p/>
 * 
 * Yong Wang made improvements and created M5': <br/>
 * 
 * Wang, Y and Witten, I. H. (1997). Induction of model trees for predicting
 * continuous classes. Proceedings of the poster papers of the European
 * Conference on Machine Learning. University of Economics, Faculty of
 * Informatics and Statistics, Prague.
 * <p/>
 * 
 * Valid options are:
 * <p>
 * 
 * -U <br>
 * Use unsmoothed predictions.
 * <p>
 * 
 * -R <br>
 * Build regression tree/rule rather than model tree/rule
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public abstract class M5Base extends AbstractClassifier implements
  AdditionalMeasureProducer, TechnicalInformationHandler {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 * M5Base. Implements base routines
 * for generating M5 Model trees and rules. <p>
 * 
 * The original algorithm M5 was invented by Quinlan: <br/>
 * 
 * Quinlan J. R. (1992). Learning with continuous classes. Proceedings of
 * the Australian Joint Conference on Artificial Intelligence. 343--348.
 * World Scientific, Singapore. <p/>
 * 
 * Yong Wang made improvements and created M5': <br/>
 * 
 * Wang, Y and Witten, I. H. (1997). Induction of model trees for
 * predicting continuous classes. Proceedings of the poster papers of the
 * European Conference on Machine Learning. University of Economics,
 * Faculty of Informatics and Statistics, Prague. <p/>
 *
 * Valid options are:<p>
 * 
 * -U <br>
 * Use unsmoothed predictions. <p>
 *
 * -R <br>
 * Build regression tree/rule rather than model tree/rule
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 6260 $
 */
public abstract class M5Base 
  extends Classifier 
  implements AdditionalMeasureProducer,
	     TechnicalInformationHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -4022221950191647679L;

  /**
   * the instances covered by the tree/rules
   */
  private Instances m_instances;

  /**
   * the rule set
   */
<<<<<<< HEAD
  protected ArrayList<Rule> m_ruleSet;
=======
<<<<<<< HEAD
  protected ArrayList<Rule> m_ruleSet;
=======
  protected FastVector m_ruleSet;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * generate a decision list instead of a single tree.
   */
  private boolean m_generateRules;

  /**
   * use unsmoothed predictions
   */
  private boolean m_unsmoothedPredictions;

  /**
   * filter to fill in missing values
   */
  private ReplaceMissingValues m_replaceMissing;

  /**
   * filter to convert nominal attributes to binary
   */
  private NominalToBinary m_nominalToBinary;
<<<<<<< HEAD

  /**
   * for removing useless attributes
=======
<<<<<<< HEAD

  /**
   * for removing useless attributes
=======
  
  /**
   * for removing useless attributes 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private RemoveUseless m_removeUseless;

  /**
   * Save instances at each node in an M5 tree for visualization purposes.
   */
  protected boolean m_saveInstances = false;

  /**
   * Make a regression tree/rule instead of a model tree/rule
   */
  protected boolean m_regressionTree;

  /**
   * Do not prune tree/rules
   */
  protected boolean m_useUnpruned = false;

  /**
   * The minimum number of instances to allow at a leaf node
   */
  protected double m_minNumInstances = 4;

  /**
   * Constructor
   */
  public M5Base() {
    m_generateRules = false;
    m_unsmoothedPredictions = false;
    m_useUnpruned = false;
    m_minNumInstances = 4;
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
    TechnicalInformation additional;

    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Ross J. Quinlan");
    result.setValue(Field.TITLE, "Learning with Continuous Classes");
    result.setValue(Field.BOOKTITLE,
      "5th Australian Joint Conference on Artificial Intelligence");
<<<<<<< HEAD
=======
=======
   * returns information about the classifier
   * @return a description suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "M5Base. Implements base routines for generating M5 Model trees and " 
      + "rules\n"
      + "The original algorithm M5 was invented by R. Quinlan and Yong Wang "
      + "made improvements.\n\n"
      + "For more information see:\n\n"
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
    TechnicalInformation 	additional;
    
    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Ross J. Quinlan");
    result.setValue(Field.TITLE, "Learning with Continuous Classes");
    result.setValue(Field.BOOKTITLE, "5th Australian Joint Conference on Artificial Intelligence");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.setValue(Field.YEAR, "1992");
    result.setValue(Field.PAGES, "343-348");
    result.setValue(Field.PUBLISHER, "World Scientific");
    result.setValue(Field.ADDRESS, "Singapore");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    additional = result.add(Type.INPROCEEDINGS);
    additional.setValue(Field.AUTHOR, "Y. Wang and I. H. Witten");
    additional.setValue(Field.TITLE,
      "Induction of model trees for predicting continuous classes");
    additional.setValue(Field.BOOKTITLE,
      "Poster papers of the 9th European Conference on Machine Learning");
    additional.setValue(Field.YEAR, "1997");
    additional.setValue(Field.PUBLISHER, "Springer");

<<<<<<< HEAD
=======
=======
    
    additional = result.add(Type.INPROCEEDINGS);
    additional.setValue(Field.AUTHOR, "Y. Wang and I. H. Witten");
    additional.setValue(Field.TITLE, "Induction of model trees for predicting continuous classes");
    additional.setValue(Field.BOOKTITLE, "Poster papers of the 9th European Conference on Machine Learning");
    additional.setValue(Field.YEAR, "1997");
    additional.setValue(Field.PUBLISHER, "Springer");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

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

    newVector.add(new Option("\tUse unpruned tree/rules", "N", 0, "-N"));

    newVector.add(new Option("\tUse unsmoothed predictions", "U", 0, "-U"));

    newVector.add(new Option("\tBuild regression tree/rule rather "
      + "than a model tree/rule", "R", 0, "-R"));

    newVector.add(new Option("\tSet minimum number of instances "
      + "per leaf\n\t(default 4)", "M", 1, "-M <minimum number of instances>"));

    newVector.addAll(Collections.list(super.listOptions()));

    return newVector.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * Valid options are:
   * <p>
   * 
   * -U <br>
   * Use unsmoothed predictions.
   * <p>
   * 
   * -R <br>
   * Build a regression tree rather than a model tree.
   * <p>
<<<<<<< HEAD
=======
=======
  public Enumeration listOptions() {
    Vector newVector = new Vector(4);

    newVector.addElement(new Option("\tUse unpruned tree/rules", 
				    "N", 0, "-N"));

    newVector.addElement(new Option("\tUse unsmoothed predictions", 
				    "U", 0, "-U"));

    newVector.addElement(new Option("\tBuild regression tree/rule rather "
				    +"than a model tree/rule", 
				    "R", 0, "-R"));

    newVector.addElement(new Option("\tSet minimum number of instances "
				    +"per leaf\n\t(default 4)",
				    "M",1,"-M <minimum number of instances>"));
    return newVector.elements();
  } 

  /**
   * Parses a given list of options. <p/>
   * 
   * Valid options are:<p>
   * 
   * -U <br>
   * Use unsmoothed predictions. <p>
   *
   * -R <br>
   * Build a regression tree rather than a model tree. <p>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setOptions(String[] options) throws Exception {
    setUnpruned(Utils.getFlag('N', options));
    setUseUnsmoothed(Utils.getFlag('U', options));
    setBuildRegressionTree(Utils.getFlag('R', options));
    String optionString = Utils.getOption('M', options);
    if (optionString.length() != 0) {
      setMinNumInstances((new Double(optionString)).doubleValue());
    }
<<<<<<< HEAD
    super.setOptions(options);
    Utils.checkForRemainingOptions(options);
  }
=======
<<<<<<< HEAD
    super.setOptions(options);
    Utils.checkForRemainingOptions(options);
  }
=======
    Utils.checkForRemainingOptions(options);
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

    Vector<String> result = new Vector<String>();

    if (getUnpruned()) {
      result.add("-N");
    }

    if (getUseUnsmoothed()) {
      result.add("-U");
    }

    if (getBuildRegressionTree()) {
      result.add("-R");
    }

    result.add("-M");
    result.add("" + getMinNumInstances());

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }
<<<<<<< HEAD
=======
=======
  public String[] getOptions() {
    String[] options = new String[5];
    int current = 0;

    if (getUnpruned()) {
      options[current++] = "-N";
    }

    if (getUseUnsmoothed()) {
      options[current++] = "-U";
    } 

    if (getBuildRegressionTree()) {
      options[current++] = "-R";
    }

    options[current++] = "-M"; 
    options[current++] = ""+getMinNumInstances();

    while (current < options.length) {
      options[current++] = "";
    } 
    return options;
  } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String unprunedTipText() {
    return "Whether unpruned tree/rules are to be generated.";
  }

  /**
   * Use unpruned tree/rules
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param unpruned true if unpruned tree/rules are to be generated
   */
  public void setUnpruned(boolean unpruned) {
    m_useUnpruned = unpruned;
  }

  /**
   * Get whether unpruned tree/rules are being generated
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if unpruned tree/rules are to be generated
   */
  public boolean getUnpruned() {
    return m_useUnpruned;
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String generateRulesTipText() {
    return "Whether to generate rules (decision list) rather than a tree.";
  }

  /**
   * Generate rules (decision list) rather than a tree
   * 
   * @param u true if rules are to be generated
   */
  protected void setGenerateRules(boolean u) {
    m_generateRules = u;
<<<<<<< HEAD
  }
=======
<<<<<<< HEAD
  }
=======
  } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * get whether rules are being generated rather than a tree
   * 
   * @return true if rules are to be generated
   */
  protected boolean getGenerateRules() {
    return m_generateRules;
<<<<<<< HEAD
  }
=======
<<<<<<< HEAD
  }
=======
  } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String useUnsmoothedTipText() {
    return "Whether to use unsmoothed predictions.";
  }

  /**
   * Use unsmoothed predictions
   * 
   * @param s true if unsmoothed predictions are to be used
   */
  public void setUseUnsmoothed(boolean s) {
    m_unsmoothedPredictions = s;
<<<<<<< HEAD
  }
=======
<<<<<<< HEAD
  }
=======
  } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Get whether or not smoothing is being used
   * 
   * @return true if unsmoothed predictions are to be used
   */
  public boolean getUseUnsmoothed() {
    return m_unsmoothedPredictions;
<<<<<<< HEAD
  }
=======
<<<<<<< HEAD
  }
=======
  } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String buildRegressionTreeTipText() {
    return "Whether to generate a regression tree/rule instead of a model tree/rule.";
  }

  /**
   * Get the value of regressionTree.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return Value of regressionTree.
   */
  public boolean getBuildRegressionTree() {

    return m_regressionTree;
  }

  /**
   * Set the value of regressionTree.
   * 
   * @param newregressionTree Value to assign to regressionTree.
   */
  public void setBuildRegressionTree(boolean newregressionTree) {

<<<<<<< HEAD
=======
=======
   *
   * @return Value of regressionTree.
   */
  public boolean getBuildRegressionTree() {
    
    return m_regressionTree;
  }
  
  /**
   * Set the value of regressionTree.
   *
   * @param newregressionTree Value to assign to regressionTree.
   */
  public void setBuildRegressionTree(boolean newregressionTree) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_regressionTree = newregressionTree;
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String minNumInstancesTipText() {
    return "The minimum number of instances to allow at a leaf node.";
  }

  /**
   * Set the minimum number of instances to allow at a leaf node
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param minNum the minimum number of instances
   */
  public void setMinNumInstances(double minNum) {
    m_minNumInstances = minNum;
  }

  /**
   * Get the minimum number of instances to allow at a leaf node
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a <code>double</code> value
   */
  public double getMinNumInstances() {
    return m_minNumInstances;
  }

  /**
   * Returns default capabilities of the classifier, i.e., of LinearRegression.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of this classifier
   */
  @Override
  public Capabilities getCapabilities() {

    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(Capabilities.Capability.MISSING_VALUES);

    // class
    result.enable(Capabilities.Capability.NUMERIC_CLASS);
    result.enable(Capabilities.Capability.DATE_CLASS);
    result.enable(Capabilities.Capability.MISSING_CLASS_VALUES);

    return result;
<<<<<<< HEAD
=======
=======
   *
   * @return      the capabilities of this classifier
   */
  public Capabilities getCapabilities() {
    return new LinearRegression().getCapabilities();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Generates the classifier.
   * 
   * @param data set of instances serving as training data
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
  public void buildClassifier(Instances data) throws Exception {
    // can classifier handle the data?
    getCapabilities().testWithFail(data);

    // remove instances with missing class
    data = new Instances(data);
    data.deleteWithMissingClass();
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_instances = new Instances(data);

    m_replaceMissing = new ReplaceMissingValues();
    m_replaceMissing.setInputFormat(m_instances);
    m_instances = Filter.useFilter(m_instances, m_replaceMissing);

    m_nominalToBinary = new NominalToBinary();
    m_nominalToBinary.setInputFormat(m_instances);
    m_instances = Filter.useFilter(m_instances, m_nominalToBinary);

    m_removeUseless = new RemoveUseless();
    m_removeUseless.setInputFormat(m_instances);
    m_instances = Filter.useFilter(m_instances, m_removeUseless);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_instances.randomize(new Random(1));

    m_ruleSet = new ArrayList<Rule>();
<<<<<<< HEAD
=======
=======
    
    m_instances.randomize(new Random(1));

    m_ruleSet = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Rule tempRule;

    if (m_generateRules) {
      Instances tempInst = m_instances;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      do {
        tempRule = new Rule();
        tempRule.setSmoothing(!m_unsmoothedPredictions);
        tempRule.setRegressionTree(m_regressionTree);
        tempRule.setUnpruned(m_useUnpruned);
        tempRule.setSaveInstances(false);
        tempRule.setMinNumInstances(m_minNumInstances);
        tempRule.buildClassifier(tempInst);
        m_ruleSet.add(tempRule);
        // System.err.println("Built rule : "+tempRule.toString());
        tempInst = tempRule.notCoveredInstances();
        tempRule.freeNotCoveredInstances();
<<<<<<< HEAD
=======
=======
     
      do {
	tempRule = new Rule();
	tempRule.setSmoothing(!m_unsmoothedPredictions);
	tempRule.setRegressionTree(m_regressionTree);
	tempRule.setUnpruned(m_useUnpruned);
	tempRule.setSaveInstances(false);
	tempRule.setMinNumInstances(m_minNumInstances);
	tempRule.buildClassifier(tempInst);
	m_ruleSet.addElement(tempRule);
	//	System.err.println("Built rule : "+tempRule.toString());
	tempInst = tempRule.notCoveredInstances();
	tempRule.freeNotCoveredInstances();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } while (tempInst.numInstances() > 0);
    } else {
      // just build a single tree
      tempRule = new Rule();

      tempRule.setUseTree(true);
<<<<<<< HEAD
      // tempRule.setGrowFullTree(true);
=======
<<<<<<< HEAD
      // tempRule.setGrowFullTree(true);
=======
      //      tempRule.setGrowFullTree(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      tempRule.setSmoothing(!m_unsmoothedPredictions);
      tempRule.setSaveInstances(m_saveInstances);
      tempRule.setRegressionTree(m_regressionTree);
      tempRule.setUnpruned(m_useUnpruned);
      tempRule.setMinNumInstances(m_minNumInstances);

      Instances temp_train;

      temp_train = m_instances;

      tempRule.buildClassifier(temp_train);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_ruleSet.add(tempRule);

      // System.err.print(tempRule.m_topOfTree.treeToString(0));
    }

    // save space
    m_instances = new Instances(m_instances, 0);
  }

  /**
   * Calculates a prediction for an instance using a set of rules or an M5 model
   * tree
<<<<<<< HEAD
=======
=======
      m_ruleSet.addElement(tempRule);      

      //      System.err.print(tempRule.m_topOfTree.treeToString(0));
    }
    
    // save space
    m_instances = new Instances(m_instances, 0);
  } 

  /**
   * Calculates a prediction for an instance using a set of rules
   * or an M5 model tree
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param inst the instance whos class value is to be predicted
   * @return the prediction
   * @throws Exception if a prediction can't be made.
   */
<<<<<<< HEAD
  @Override
  public double classifyInstance(Instance inst) throws Exception {
    Rule temp;
=======
<<<<<<< HEAD
  @Override
  public double classifyInstance(Instance inst) throws Exception {
    Rule temp;
=======
  public double classifyInstance(Instance inst) throws Exception {
    Rule   temp;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double prediction = 0;
    boolean success = false;

    m_replaceMissing.input(inst);
    inst = m_replaceMissing.output();
    m_nominalToBinary.input(inst);
    inst = m_nominalToBinary.output();
    m_removeUseless.input(inst);
    inst = m_removeUseless.output();

    if (m_ruleSet == null) {
      throw new Exception("Classifier has not been built yet!");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    if (!m_generateRules) {
      temp = m_ruleSet.get(0);
      return temp.classifyInstance(inst);
    }

    boolean cont;
    int i;

    for (i = 0; i < m_ruleSet.size(); i++) {
      cont = false;
      temp = m_ruleSet.get(i);

      try {
        prediction = temp.classifyInstance(inst);
        success = true;
      } catch (Exception e) {
        cont = true;
      }

      if (!cont) {
        break;
      }
    }

    if (!success) {
      System.out.println("Error in predicting (DecList)");
    }
    return prediction;
  }
<<<<<<< HEAD
=======
=======
    } 

    if (!m_generateRules) {
      temp = (Rule) m_ruleSet.elementAt(0);
      return temp.classifyInstance(inst);
    } 

    boolean cont;
    int     i;

    for (i = 0; i < m_ruleSet.size(); i++) {
      cont = false;
      temp = (Rule) m_ruleSet.elementAt(i);

      try {
	prediction = temp.classifyInstance(inst);
	success = true;
      } catch (Exception e) {
	cont = true;
      } 

      if (!cont) {
	break;
      } 
    } 

    if (!success) {
      System.out.println("Error in predicting (DecList)");
    } 
    return prediction;
  } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns a description of the classifier
   * 
   * @return a description of the classifier as a String
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String toString() {
    StringBuffer text = new StringBuffer();
    Rule temp;

    if (m_ruleSet == null) {
      return "Classifier hasn't been built yet!";
    }

    if (m_generateRules) {
      text.append("M5 " + ((m_useUnpruned == true) ? "unpruned " : "pruned ")
        + ((m_regressionTree == true) ? "regression " : "model ") + "rules ");

      if (!m_unsmoothedPredictions) {
        text.append("\n(using smoothed linear models) ");
<<<<<<< HEAD
=======
=======
  public String toString() {
    StringBuffer text = new StringBuffer();
    Rule	 temp;

    if (m_ruleSet == null) {
      return "Classifier hasn't been built yet!";
    } 

    if (m_generateRules) {
      text.append("M5 "
		  + ((m_useUnpruned == true)
		     ? "unpruned "
		     : "pruned ")
		  + ((m_regressionTree == true) 
		     ?  "regression "
		     : "model ")
		  + "rules ");

      if (!m_unsmoothedPredictions) {
	text.append("\n(using smoothed linear models) ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      text.append(":\n");

      text.append("Number of Rules : " + m_ruleSet.size() + "\n\n");

      for (int j = 0; j < m_ruleSet.size(); j++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        temp = m_ruleSet.get(j);

        text.append("Rule: " + (j + 1) + "\n");
        text.append(temp.toString());
      }
    } else {
      temp = m_ruleSet.get(0);
      text.append(temp.toString());
    }
    return text.toString();
  }

  /**
   * Returns an enumeration of the additional measure names
   * 
   * @return an enumeration of the measure names
   */
  @Override
  public Enumeration<String> enumerateMeasures() {
    Vector<String> newVector = new Vector<String>(1);
    newVector.add("measureNumRules");
<<<<<<< HEAD
=======
=======
	temp = (Rule) m_ruleSet.elementAt(j);

	text.append("Rule: " + (j + 1) + "\n");
	text.append(temp.toString());
      } 
    } else {
      temp = (Rule) m_ruleSet.elementAt(0);
      text.append(temp.toString());
    } 
    return text.toString();
  } 

  /**
   * Returns an enumeration of the additional measure names
   * @return an enumeration of the measure names
   */
  public Enumeration enumerateMeasures() {
    Vector newVector = new Vector(1);
    newVector.addElement("measureNumRules");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return newVector.elements();
  }

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
   * @param additionalMeasureName the name of the measure to query for its value
   * @return the value of the named measure
   * @throws Exception if the named measure is not supported
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public double getMeasure(String additionalMeasureName) {
    if (additionalMeasureName.compareToIgnoreCase("measureNumRules") == 0) {
      return measureNumRules();
    } else {
      throw new IllegalArgumentException(additionalMeasureName
        + " not supported (M5)");
<<<<<<< HEAD
=======
=======
  public double getMeasure(String additionalMeasureName) 
    {
    if (additionalMeasureName.compareToIgnoreCase("measureNumRules") == 0) {
      return measureNumRules();
    } else {
      throw new IllegalArgumentException(additionalMeasureName 
					 + " not supported (M5)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * return the number of rules
<<<<<<< HEAD
   * 
   * @return the number of rules (same as # linear models & # leaves in the
   *         tree)
=======
<<<<<<< HEAD
   * 
   * @return the number of rules (same as # linear models & # leaves in the
   *         tree)
=======
   * @return the number of rules (same as # linear models &
   * # leaves in the tree)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public double measureNumRules() {
    if (m_generateRules) {
      return m_ruleSet.size();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_ruleSet.get(0).m_topOfTree.numberOfLinearModels();
  }

  public RuleNode getM5RootNode() {
    Rule temp = m_ruleSet.get(0);
<<<<<<< HEAD
=======
=======
    return ((Rule)m_ruleSet.elementAt(0)).m_topOfTree.numberOfLinearModels();
  }

  public RuleNode getM5RootNode() {
    Rule temp = (Rule) m_ruleSet.elementAt(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return temp.getM5RootNode();
  }
}
