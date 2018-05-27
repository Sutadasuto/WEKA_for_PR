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
 *    Apriori.java
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

package weka.associations;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Hashtable;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import weka.core.AttributeStats;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
<<<<<<< HEAD
import weka.core.WekaEnumeration;
=======
<<<<<<< HEAD
import weka.core.WekaEnumeration;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

/**
 * <!-- globalinfo-start --> Class implementing an Apriori-type algorithm.
 * Iteratively reduces the minimum support until it finds the required number of
 * rules with the given minimum confidence.<br/>
 * The algorithm has an option to mine class association rules. It is adapted as
 * explained in the second reference.<br/>
 * <br/>
 * For more information see:<br/>
 * <br/>
 * R. Agrawal, R. Srikant: Fast Algorithms for Mining Association Rules in Large
 * Databases. In: 20th International Conference on Very Large Data Bases,
 * 478-499, 1994.<br/>
 * <br/>
 * Bing Liu, Wynne Hsu, Yiming Ma: Integrating Classification and Association
 * Rule Mining. In: Fourth International Conference on Knowledge Discovery and
 * Data Mining, 80-86, 1998.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
 * <pre>
 * &#64;inproceedings{Agrawal1994,
 *    author = {R. Agrawal and R. Srikant},
 *    booktitle = {20th International Conference on Very Large Data Bases},
 *    pages = {478-499},
 *    publisher = {Morgan Kaufmann, Los Altos, CA},
 *    title = {Fast Algorithms for Mining Association Rules in Large Databases},
 *    year = {1994}
 * }
 * 
 * &#64;inproceedings{Liu1998,
 *    author = {Bing Liu and Wynne Hsu and Yiming Ma},
 *    booktitle = {Fourth International Conference on Knowledge Discovery and Data Mining},
 *    pages = {80-86},
 *    publisher = {AAAI Press},
 *    title = {Integrating Classification and Association Rule Mining},
 *    year = {1998}
 * }
 * </pre>
 * <p/>
 * <!-- technical-bibtex-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -N &lt;required number of rules output&gt;
 *  The required number of rules. (default = 10)
 * </pre>
 * 
 * <pre>
 * -T &lt;0=confidence | 1=lift | 2=leverage | 3=Conviction&gt;
 *  The metric type by which to rank rules. (default = confidence)
 * </pre>
 * 
 * <pre>
 * -C &lt;minimum metric score of a rule&gt;
 *  The minimum confidence of a rule. (default = 0.9)
 * </pre>
 * 
 * <pre>
 * -D &lt;delta for minimum support&gt;
 *  The delta by which the minimum support is decreased in
 *  each iteration. (default = 0.05)
 * </pre>
 * 
 * <pre>
 * -U &lt;upper bound for minimum support&gt;
 *  Upper bound for minimum support. (default = 1.0)
 * </pre>
 * 
 * <pre>
 * -M &lt;lower bound for minimum support&gt;
 *  The lower bound for the minimum support. (default = 0.1)
 * </pre>
 * 
 * <pre>
 * -S &lt;significance level&gt;
 *  If used, rules are tested for significance at
 *  the given level. Slower. (default = no significance testing)
 * </pre>
 * 
 * <pre>
 * -I
 *  If set the itemsets found are also output. (default = no)
 * </pre>
 * 
 * <pre>
 * -R
 *  Remove columns that contain all missing values (default = no)
 * </pre>
 * 
 * <pre>
 * -V
 *  Report progress iteratively. (default = no)
 * </pre>
 * 
 * <pre>
 * -A
 *  If set class association rules are mined. (default = no)
 * </pre>
 * 
 * <pre>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * -Z
 *  Treat zero (i.e. first value of nominal attributes) as missing
 * </pre>
 * 
 * <pre>
 * -B &lt;toString delimiters&gt;
 *  If used, two characters to use as rule delimiters
 *  in the result of toString: the first to delimit fields,
 *  the second to delimit items within fields.
 *  (default = traditional toString result)
 * </pre>
 * 
 * <pre>
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * -c &lt;the class index&gt;
 *  The class index. (default = last)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Stefan Mutter (mutter@cs.waikato.ac.nz)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 12014 $
 */
public class Apriori extends AbstractAssociator implements OptionHandler,
  AssociationRulesProducer, CARuleMiner, TechnicalInformationHandler {
<<<<<<< HEAD
=======
=======
 * @version $Revision: 9096 $
 */
public class Apriori extends AbstractAssociator implements OptionHandler,
    CARuleMiner, TechnicalInformationHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  static final long serialVersionUID = 3277498842319212687L;

  /** The minimum support. */
  protected double m_minSupport;

  /** The upper bound on the support */
  protected double m_upperBoundMinSupport;

  /** The lower bound for the minimum support. */
  protected double m_lowerBoundMinSupport;

  /** Metric type: Confidence */
  protected static final int CONFIDENCE = 0;
  /** Metric type: Lift */
  protected static final int LIFT = 1;
  /** Metric type: Leverage */
  protected static final int LEVERAGE = 2;
  /** Metric type: Conviction */
  protected static final int CONVICTION = 3;
  /** Metric types. */
  public static final Tag[] TAGS_SELECTION = {
<<<<<<< HEAD
    new Tag(CONFIDENCE, "Confidence"), new Tag(LIFT, "Lift"),
    new Tag(LEVERAGE, "Leverage"), new Tag(CONVICTION, "Conviction") };
=======
<<<<<<< HEAD
    new Tag(CONFIDENCE, "Confidence"), new Tag(LIFT, "Lift"),
    new Tag(LEVERAGE, "Leverage"), new Tag(CONVICTION, "Conviction") };
=======
      new Tag(CONFIDENCE, "Confidence"), new Tag(LIFT, "Lift"),
      new Tag(LEVERAGE, "Leverage"), new Tag(CONVICTION, "Conviction") };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The selected metric type. */
  protected int m_metricType = CONFIDENCE;

  /** The minimum metric score. */
  protected double m_minMetric;

  /** The maximum number of rules that are output. */
  protected int m_numRules;

  /** Delta by which m_minSupport is decreased in each iteration. */
  protected double m_delta;

  /** Significance level for optional significance test. */
  protected double m_significanceLevel;

  /** Number of cycles used before required number of rules was one. */
  protected int m_cycles;

  /** The set of all sets of itemsets L. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected ArrayList<ArrayList<Object>> m_Ls;

  /** The same information stored in hash tables. */
  protected ArrayList<Hashtable<ItemSet, Integer>> m_hashtables;

  /** The list of all generated rules. */
  protected ArrayList<Object>[] m_allTheRules;
<<<<<<< HEAD
=======
=======
  protected FastVector m_Ls;

  /** The same information stored in hash tables. */
  protected FastVector m_hashtables;

  /** The list of all generated rules. */
  protected FastVector[] m_allTheRules;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * The instances (transactions) to be used for generating the association
   * rules.
   */
  protected Instances m_instances;

  /** Output itemsets found? */
  protected boolean m_outputItemSets;

  /** Remove columns with all missing values */
  protected boolean m_removeMissingCols;

  /** Report progress iteratively */
  protected boolean m_verbose;

  /** Only the class attribute of all Instances. */
  protected Instances m_onlyClass;

  /** The class index. */
  protected int m_classIndex;

  /** Flag indicating whether class association rules are mined. */
  protected boolean m_car;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Treat zeros as missing (rather than a value in their own right)
   */
  protected boolean m_treatZeroAsMissing = false;

  /**
   * ToString delimiters, if any
   */
  protected String m_toStringDelimiters = null;

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns a string describing this associator
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class implementing an Apriori-type algorithm. Iteratively reduces "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "the minimum support until it finds the required number of rules with "
      + "the given minimum confidence.\n"
      + "The algorithm has an option to mine class association rules. It is "
      + "adapted as explained in the second reference.\n\n"
      + "For more information see:\n\n" + getTechnicalInformation().toString();
<<<<<<< HEAD
=======
=======
        + "the minimum support until it finds the required number of rules with "
        + "the given minimum confidence.\n"
        + "The algorithm has an option to mine class association rules. It is "
        + "adapted as explained in the second reference.\n\n"
        + "For more information see:\n\n"
        + getTechnicalInformation().toString();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;
    TechnicalInformation additional;

    result = new TechnicalInformation(Type.INPROCEEDINGS);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.setValue(Field.AUTHOR, "R. Agrawal and R. Srikant");
    result.setValue(Field.TITLE,
      "Fast Algorithms for Mining Association Rules in Large Databases");
    result.setValue(Field.BOOKTITLE,
      "20th International Conference on Very Large Data Bases");
<<<<<<< HEAD
=======
=======
    result.setValue(Field.AUTHOR,
        Messages.getInstance().getString("APRIORI_AUTHOR"));
    result.setValue(Field.TITLE,
        "Fast Algorithms for Mining Association Rules in Large Databases");
    result.setValue(Field.BOOKTITLE,
        "20th International Conference on Very Large Data Bases");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.setValue(Field.YEAR, "1994");
    result.setValue(Field.PAGES, "478-499");
    result.setValue(Field.PUBLISHER, "Morgan Kaufmann, Los Altos, CA");

    additional = result.add(Type.INPROCEEDINGS);
    additional.setValue(Field.AUTHOR, "Bing Liu and Wynne Hsu and Yiming Ma");
    additional.setValue(Field.TITLE,
<<<<<<< HEAD
      "Integrating Classification and Association Rule Mining");
    additional.setValue(Field.BOOKTITLE,
      "Fourth International Conference on Knowledge Discovery and Data Mining");
=======
<<<<<<< HEAD
      "Integrating Classification and Association Rule Mining");
    additional.setValue(Field.BOOKTITLE,
      "Fourth International Conference on Knowledge Discovery and Data Mining");
=======
        "Integrating Classification and Association Rule Mining");
    additional
        .setValue(Field.BOOKTITLE,
            "Fourth International Conference on Knowledge Discovery and Data Mining");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    additional.setValue(Field.YEAR, "1998");
    additional.setValue(Field.PAGES, "80-86");
    additional.setValue(Field.PUBLISHER, "AAAI Press");

    return result;
  }

  /**
   * Constructor that allows to sets default values for the minimum confidence
   * and the maximum number of rules the minimum confidence.
   */
  public Apriori() {

    resetOptions();
  }

  /**
   * Resets the options to the default values.
   */
  public void resetOptions() {

    m_removeMissingCols = false;
    m_verbose = false;
    m_delta = 0.05;
    m_minMetric = 0.90;
    m_numRules = 10;
    m_lowerBoundMinSupport = 0.1;
    m_upperBoundMinSupport = 1.0;
    m_significanceLevel = -1;
    m_outputItemSets = false;
    m_car = false;
    m_classIndex = -1;
<<<<<<< HEAD
    m_treatZeroAsMissing = false;
    m_metricType = CONFIDENCE;
=======
<<<<<<< HEAD
    m_treatZeroAsMissing = false;
    m_metricType = CONFIDENCE;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Removes columns that are all missing from the data
   * 
   * @param instances the instances
   * @return a new set of instances with all missing columns removed
   * @throws Exception if something goes wrong
   */
  protected Instances removeMissingColumns(Instances instances)
<<<<<<< HEAD
    throws Exception {
=======
<<<<<<< HEAD
    throws Exception {
=======
      throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int numInstances = instances.numInstances();
    StringBuffer deleteString = new StringBuffer();
    int removeCount = 0;
    boolean first = true;
    int maxCount = 0;

    for (int i = 0; i < instances.numAttributes(); i++) {
      AttributeStats as = instances.attributeStats(i);
      if (m_upperBoundMinSupport == 1.0 && maxCount != numInstances) {
        // see if we can decrease this by looking for the most frequent value
        int[] counts = as.nominalCounts;
        if (counts[Utils.maxIndex(counts)] > maxCount) {
          maxCount = counts[Utils.maxIndex(counts)];
        }
      }
      if (as.missingCount == numInstances) {
        if (first) {
          deleteString.append((i + 1));
          first = false;
        } else {
          deleteString.append("," + (i + 1));
        }
        removeCount++;
      }
    }
    if (m_verbose) {
      System.err.println("Removed : " + removeCount
<<<<<<< HEAD
        + " columns with all missing " + "values.");
=======
<<<<<<< HEAD
        + " columns with all missing " + "values.");
=======
          + " columns with all missing " + "values.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    if (m_upperBoundMinSupport == 1.0 && maxCount != numInstances) {
      m_upperBoundMinSupport = (double) maxCount / (double) numInstances;
      if (m_verbose) {
        System.err.println("Setting upper bound min support to : "
<<<<<<< HEAD
          + m_upperBoundMinSupport);
=======
<<<<<<< HEAD
          + m_upperBoundMinSupport);
=======
            + m_upperBoundMinSupport);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    if (deleteString.toString().length() > 0) {
      Remove af = new Remove();
      af.setAttributeIndices(deleteString.toString());
      af.setInvertSelection(false);
      af.setInputFormat(instances);
      Instances newInst = Filter.useFilter(instances, af);

      return newInst;
    }
    return instances;
  }

  /**
   * Returns default capabilities of the classifier.
   * 
   * @return the capabilities of this classifier
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

<<<<<<< HEAD
    // enable what we can handle

=======
<<<<<<< HEAD
    // enable what we can handle

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class (can handle a nominal class if CAR rules are selected). This
    result.enable(Capability.NO_CLASS);
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

    return result;
  }

  /**
   * Method that generates all large itemsets with a minimum support, and from
   * these all association rules with a minimum confidence.
   * 
   * @param instances the instances to be used for generating the associations
   * @throws Exception if rules can't be built successfully
   */
<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  @Override
=======
<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void buildAssociations(Instances instances) throws Exception {

    double[] confidences, supports;
    int[] indices;
<<<<<<< HEAD
    ArrayList<Object>[] sortedRuleSet;
    double necSupport = 0;
=======
<<<<<<< HEAD
    ArrayList<Object>[] sortedRuleSet;
    double necSupport = 0;
=======
    FastVector[] sortedRuleSet;
    int necSupport = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    instances = new Instances(instances);

    if (m_removeMissingCols) {
      instances = removeMissingColumns(instances);
    }
<<<<<<< HEAD
    if (m_car && m_metricType != CONFIDENCE) {
      throw new Exception("For CAR-Mining metric type has to be confidence!");
    }
=======
<<<<<<< HEAD
    if (m_car && m_metricType != CONFIDENCE) {
      throw new Exception("For CAR-Mining metric type has to be confidence!");
    }
=======
    if (m_car && m_metricType != CONFIDENCE)
      throw new Exception("For CAR-Mining metric type has to be confidence!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // only set class index if CAR is requested
    if (m_car) {
      if (m_classIndex == -1) {
        instances.setClassIndex(instances.numAttributes() - 1);
      } else if (m_classIndex <= instances.numAttributes() && m_classIndex > 0) {
        instances.setClassIndex(m_classIndex - 1);
      } else {
        throw new Exception("Invalid class index.");
      }
    }

    // can associator handle the data?
    getCapabilities().testWithFail(instances);

    m_cycles = 0;

    // make sure that the lower bound is equal to at least one instance
    double lowerBoundMinSupportToUse = (m_lowerBoundMinSupport
<<<<<<< HEAD
      * instances.numInstances() < 1.0) ? 1.0 / instances.numInstances()
      : m_lowerBoundMinSupport;
=======
<<<<<<< HEAD
      * instances.numInstances() < 1.0) ? 1.0 / instances.numInstances()
      : m_lowerBoundMinSupport;
=======
        * instances.numInstances() < 1.0) ? 1.0 / instances.numInstances()
        : m_lowerBoundMinSupport;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_car) {
      // m_instances does not contain the class attribute
      m_instances = LabeledItemSet.divide(instances, false);

      // m_onlyClass contains only the class attribute
      m_onlyClass = LabeledItemSet.divide(instances, true);
<<<<<<< HEAD
    } else {
      m_instances = instances;
    }
=======
<<<<<<< HEAD
    } else {
      m_instances = instances;
    }
=======
    } else
      m_instances = instances;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_car && m_numRules == Integer.MAX_VALUE) {
      // Set desired minimum support
      m_minSupport = lowerBoundMinSupportToUse;
    } else {
      // Decrease minimum support until desired number of rules found.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // m_minSupport = m_upperBoundMinSupport - m_delta;
      m_minSupport = 1.0 - m_delta;
      m_minSupport = (m_minSupport < lowerBoundMinSupportToUse) ? lowerBoundMinSupportToUse
        : m_minSupport;
    }

    do {
      // Reserve space for variables
      m_Ls = new ArrayList<ArrayList<Object>>();
      m_hashtables = new ArrayList<Hashtable<ItemSet, Integer>>();
      m_allTheRules = new ArrayList[6];
      m_allTheRules[0] = new ArrayList<Object>();
      m_allTheRules[1] = new ArrayList<Object>();
      m_allTheRules[2] = new ArrayList<Object>();
      // if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
      m_allTheRules[3] = new ArrayList<Object>();
      m_allTheRules[4] = new ArrayList<Object>();
      m_allTheRules[5] = new ArrayList<Object>();
      // }
      sortedRuleSet = new ArrayList[6];
      sortedRuleSet[0] = new ArrayList<Object>();
      sortedRuleSet[1] = new ArrayList<Object>();
      sortedRuleSet[2] = new ArrayList<Object>();
      // if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
      sortedRuleSet[3] = new ArrayList<Object>();
      sortedRuleSet[4] = new ArrayList<Object>();
      sortedRuleSet[5] = new ArrayList<Object>();
      // }
      if (!m_car) {
        // Find large itemsets and rules
        findLargeItemSets();
        if (m_significanceLevel != -1 || m_metricType != CONFIDENCE) {
          findRulesBruteForce();
        } else {
          findRulesQuickly();
        }
<<<<<<< HEAD
=======
=======
      m_minSupport = m_upperBoundMinSupport - m_delta;
      m_minSupport = (m_minSupport < lowerBoundMinSupportToUse) ? lowerBoundMinSupportToUse
          : m_minSupport;
    }

    do {

      // Reserve space for variables
      m_Ls = new FastVector();
      m_hashtables = new FastVector();
      m_allTheRules = new FastVector[6];
      m_allTheRules[0] = new FastVector();
      m_allTheRules[1] = new FastVector();
      m_allTheRules[2] = new FastVector();
      if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
        m_allTheRules[3] = new FastVector();
        m_allTheRules[4] = new FastVector();
        m_allTheRules[5] = new FastVector();
      }
      sortedRuleSet = new FastVector[6];
      sortedRuleSet[0] = new FastVector();
      sortedRuleSet[1] = new FastVector();
      sortedRuleSet[2] = new FastVector();
      if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
        sortedRuleSet[3] = new FastVector();
        sortedRuleSet[4] = new FastVector();
        sortedRuleSet[5] = new FastVector();
      }
      if (!m_car) {
        // Find large itemsets and rules
        findLargeItemSets();
        if (m_significanceLevel != -1 || m_metricType != CONFIDENCE)
          findRulesBruteForce();
        else
          findRulesQuickly();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } else {
        findLargeCarItemSets();
        findCarRulesQuickly();
      }

      // prune rules for upper bound min support
      if (m_upperBoundMinSupport < 1.0) {
        pruneRulesForUpperBoundSupport();
      }

      // Sort rules according to their support
      /*
       * supports = new double[m_allTheRules[2].size()]; for (int i = 0; i <
       * m_allTheRules[2].size(); i++) supports[i] =
       * (double)((AprioriItemSet)m_allTheRules[1].elementAt(i)).support();
       * indices = Utils.stableSort(supports); for (int i = 0; i <
       * m_allTheRules[2].size(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
       * sortedRuleSet[0].add(m_allTheRules[0].get(indices[i]));
       * sortedRuleSet[1].add(m_allTheRules[1].get(indices[i]));
       * sortedRuleSet[2].add(m_allTheRules[2].get(indices[i])); if
       * (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
       * sortedRuleSet[3].add(m_allTheRules[3].get(indices[i]));
       * sortedRuleSet[4].add(m_allTheRules[4].get(indices[i]));
       * sortedRuleSet[5].add(m_allTheRules[5].get(indices[i])); } }
       */
      int j = m_allTheRules[2].size() - 1;
      supports = new double[m_allTheRules[2].size()];
      for (int i = 0; i < (j + 1); i++) {
        supports[j - i] = ((double) ((ItemSet) m_allTheRules[1].get(j - i))
          .support()) * (-1);
      }
      indices = Utils.stableSort(supports);
      for (int i = 0; i < (j + 1); i++) {
        sortedRuleSet[0].add(m_allTheRules[0].get(indices[j - i]));
        sortedRuleSet[1].add(m_allTheRules[1].get(indices[j - i]));
        sortedRuleSet[2].add(m_allTheRules[2].get(indices[j - i]));
        if (!m_car) {
          // if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
          sortedRuleSet[3].add(m_allTheRules[3].get(indices[j - i]));
          sortedRuleSet[4].add(m_allTheRules[4].get(indices[j - i]));
          sortedRuleSet[5].add(m_allTheRules[5].get(indices[j - i]));
        }
        // }
      }

      // Sort rules according to their confidence
      m_allTheRules[0].clear();
      m_allTheRules[1].clear();
      m_allTheRules[2].clear();
      // if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
      m_allTheRules[3].clear();
      m_allTheRules[4].clear();
      m_allTheRules[5].clear();
      // }
      confidences = new double[sortedRuleSet[2].size()];
      int sortType = 2 + m_metricType;

      for (int i = 0; i < sortedRuleSet[2].size(); i++) {
        confidences[i] = ((Double) sortedRuleSet[sortType].get(i))
          .doubleValue();
      }
      indices = Utils.stableSort(confidences);
      for (int i = sortedRuleSet[0].size() - 1; (i >= (sortedRuleSet[0].size() - m_numRules))
        && (i >= 0); i--) {
        m_allTheRules[0].add(sortedRuleSet[0].get(indices[i]));
        m_allTheRules[1].add(sortedRuleSet[1].get(indices[i]));
        m_allTheRules[2].add(sortedRuleSet[2].get(indices[i]));
        // if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
        if (!m_car) {
          m_allTheRules[3].add(sortedRuleSet[3].get(indices[i]));
          m_allTheRules[4].add(sortedRuleSet[4].get(indices[i]));
          m_allTheRules[5].add(sortedRuleSet[5].get(indices[i]));
        }
        // }
<<<<<<< HEAD
=======
=======
       * sortedRuleSet[0].addElement(m_allTheRules[0].elementAt(indices[i]));
       * sortedRuleSet[1].addElement(m_allTheRules[1].elementAt(indices[i]));
       * sortedRuleSet[2].addElement(m_allTheRules[2].elementAt(indices[i])); if
       * (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
       * sortedRuleSet[3].addElement(m_allTheRules[3].elementAt(indices[i]));
       * sortedRuleSet[4].addElement(m_allTheRules[4].elementAt(indices[i]));
       * sortedRuleSet[5].addElement(m_allTheRules[5].elementAt(indices[i])); }
       * }
       */
      int j = m_allTheRules[2].size() - 1;
      supports = new double[m_allTheRules[2].size()];
      for (int i = 0; i < (j + 1); i++)
        supports[j - i] = ((double) ((ItemSet) m_allTheRules[1]
            .elementAt(j - i)).support()) * (-1);
      indices = Utils.stableSort(supports);
      for (int i = 0; i < (j + 1); i++) {
        sortedRuleSet[0].addElement(m_allTheRules[0].elementAt(indices[j - i]));
        sortedRuleSet[1].addElement(m_allTheRules[1].elementAt(indices[j - i]));
        sortedRuleSet[2].addElement(m_allTheRules[2].elementAt(indices[j - i]));
        if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
          sortedRuleSet[3].addElement(m_allTheRules[3]
              .elementAt(indices[j - i]));
          sortedRuleSet[4].addElement(m_allTheRules[4]
              .elementAt(indices[j - i]));
          sortedRuleSet[5].addElement(m_allTheRules[5]
              .elementAt(indices[j - i]));
        }
      }

      // Sort rules according to their confidence
      m_allTheRules[0].removeAllElements();
      m_allTheRules[1].removeAllElements();
      m_allTheRules[2].removeAllElements();
      if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
        m_allTheRules[3].removeAllElements();
        m_allTheRules[4].removeAllElements();
        m_allTheRules[5].removeAllElements();
      }
      confidences = new double[sortedRuleSet[2].size()];
      int sortType = 2 + m_metricType;

      for (int i = 0; i < sortedRuleSet[2].size(); i++)
        confidences[i] = ((Double) sortedRuleSet[sortType].elementAt(i))
            .doubleValue();
      indices = Utils.stableSort(confidences);
      for (int i = sortedRuleSet[0].size() - 1; (i >= (sortedRuleSet[0].size() - m_numRules))
          && (i >= 0); i--) {
        m_allTheRules[0].addElement(sortedRuleSet[0].elementAt(indices[i]));
        m_allTheRules[1].addElement(sortedRuleSet[1].elementAt(indices[i]));
        m_allTheRules[2].addElement(sortedRuleSet[2].elementAt(indices[i]));
        if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
          m_allTheRules[3].addElement(sortedRuleSet[3].elementAt(indices[i]));
          m_allTheRules[4].addElement(sortedRuleSet[4].elementAt(indices[i]));
          m_allTheRules[5].addElement(sortedRuleSet[5].elementAt(indices[i]));
        }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      if (m_verbose) {
        if (m_Ls.size() > 1) {
          System.out.println(toString());
        }
      }

      if (m_minSupport == lowerBoundMinSupportToUse
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        || m_minSupport - m_delta > lowerBoundMinSupportToUse) {
        m_minSupport -= m_delta;
      } else {
        m_minSupport = lowerBoundMinSupportToUse;
      }

      necSupport = Math.rint(m_minSupport * m_instances.numInstances());

      m_cycles++;
    } while ((m_allTheRules[0].size() < m_numRules)
      && (Utils.grOrEq(m_minSupport, lowerBoundMinSupportToUse))
      /* (necSupport >= lowerBoundNumInstancesSupport) */
      /* (Utils.grOrEq(m_minSupport, m_lowerBoundMinSupport)) */&& (necSupport >= 1));
<<<<<<< HEAD
=======
=======
          || m_minSupport - m_delta > lowerBoundMinSupportToUse)
        m_minSupport -= m_delta;
      else
        m_minSupport = lowerBoundMinSupportToUse;

      necSupport = Math.round((float) ((m_minSupport * m_instances
          .numInstances()) + 0.5));

      m_cycles++;
    } while ((m_allTheRules[0].size() < m_numRules)
        && (Utils.grOrEq(m_minSupport, lowerBoundMinSupportToUse))
        /* (necSupport >= lowerBoundNumInstancesSupport) */
        /* (Utils.grOrEq(m_minSupport, m_lowerBoundMinSupport)) */&& (necSupport >= 1));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_minSupport += m_delta;
  }

  private void pruneRulesForUpperBoundSupport() {
    int necMaxSupport = (int) (m_upperBoundMinSupport
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      * m_instances.numInstances() + 0.5);

    @SuppressWarnings("unchecked")
    ArrayList<Object>[] prunedRules = new ArrayList[6];
    for (int i = 0; i < 6; i++) {
      prunedRules[i] = new ArrayList<Object>();
    }

    for (int i = 0; i < m_allTheRules[0].size(); i++) {
      if (((ItemSet) m_allTheRules[1].get(i)).support() <= necMaxSupport) {
        prunedRules[0].add(m_allTheRules[0].get(i));
        prunedRules[1].add(m_allTheRules[1].get(i));
        prunedRules[2].add(m_allTheRules[2].get(i));

        if (!m_car) {
          prunedRules[3].add(m_allTheRules[3].get(i));
          prunedRules[4].add(m_allTheRules[4].get(i));
          prunedRules[5].add(m_allTheRules[5].get(i));
        }
      }
    }
<<<<<<< HEAD
=======
=======
        * m_instances.numInstances() + 0.5);

    FastVector[] prunedRules = new FastVector[6];
    for (int i = 0; i < 6; i++) {
      prunedRules[i] = new FastVector();
    }

    for (int i = 0; i < m_allTheRules[0].size(); i++) {
      if (((ItemSet) m_allTheRules[1].elementAt(i)).support() <= necMaxSupport) {
        prunedRules[0].addElement(m_allTheRules[0].elementAt(i));
        prunedRules[1].addElement(m_allTheRules[1].elementAt(i));
        prunedRules[2].addElement(m_allTheRules[2].elementAt(i));

        if (!m_car) {
          prunedRules[3].addElement(m_allTheRules[3].elementAt(i));
          prunedRules[4].addElement(m_allTheRules[4].elementAt(i));
          prunedRules[5].addElement(m_allTheRules[5].elementAt(i));
        }
      }
    }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_allTheRules[0] = prunedRules[0];
    m_allTheRules[1] = prunedRules[1];
    m_allTheRules[2] = prunedRules[2];
    m_allTheRules[3] = prunedRules[3];
    m_allTheRules[4] = prunedRules[4];
    m_allTheRules[5] = prunedRules[5];
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Method that mines all class association rules with minimum support and with
   * a minimum confidence.
   * 
   * @return an sorted array of FastVector (confidence depended) containing the
   *         rules and metric information
   * @param data the instances for which class association rules should be mined
   * @throws Exception if rules can't be built successfully
   */
<<<<<<< HEAD
  @Override
  public ArrayList<Object>[] mineCARs(Instances data) throws Exception {
=======
<<<<<<< HEAD
  @Override
  public ArrayList<Object>[] mineCARs(Instances data) throws Exception {
=======
  public FastVector[] mineCARs(Instances data) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_car = true;
    buildAssociations(data);
    return m_allTheRules;
  }

  /**
   * Gets the instances without the class atrribute.
   * 
   * @return the instances without the class attribute.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instances getInstancesNoClass() {

    return m_instances;
  }

  /**
   * Gets only the class attribute of the instances.
   * 
   * @return the class attribute of all instances.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instances getInstancesOnlyClass() {

    return m_onlyClass;
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Enumeration<Option> listOptions() {

    String string1 = "\tThe required number of rules. (default = " + m_numRules
      + ")", string2 = "\tThe minimum confidence of a rule. (default = "
      + m_minMetric + ")", string3 = "\tThe delta by which the minimum support is decreased in\n", string4 = "\teach iteration. (default = "
      + m_delta + ")", string5 = "\tThe lower bound for the minimum support. (default = "
      + m_lowerBoundMinSupport + ")", string6 = "\tIf used, rules are tested for significance at\n", string7 = "\tthe given level. Slower. (default = no significance testing)", string8 = "\tIf set the itemsets found are also output. (default = no)", string9 = "\tIf set class association rules are mined. (default = no)", string10 = "\tThe class index. (default = last)", stringType = "\tThe metric type by which to rank rules. (default = "
      + "confidence)", stringZeroAsMissing = "\tTreat zero (i.e. first value of nominal attributes) as "
      + "missing", stringToStringDelimiters = "\tIf used, two characters to use as rule delimiters\n"
      + "\tin the result of toString: the first to delimit fields,\n"
      + "\tthe second to delimit items within fields.\n"
      + "\t(default = traditional toString result)";

    Vector<Option> newVector = new Vector<Option>(14);

    newVector.add(new Option(string1, "N", 1,
      "-N <required number of rules output>"));
    newVector.add(new Option(stringType, "T", 1, "-T <0=confidence | 1=lift | "
      + "2=leverage | 3=Conviction>"));
    newVector.add(new Option(string2, "C", 1,
      "-C <minimum metric score of a rule>"));
    newVector.add(new Option(string3 + string4, "D", 1,
      "-D <delta for minimum support>"));
    newVector.add(new Option("\tUpper bound for minimum support. "
      + "(default = 1.0)", "U", 1, "-U <upper bound for minimum support>"));
    newVector.add(new Option(string5, "M", 1,
      "-M <lower bound for minimum support>"));
    newVector.add(new Option(string6 + string7, "S", 1,
      "-S <significance level>"));
    newVector.add(new Option(string8, "I", 0, "-I"));
    newVector.add(new Option("\tRemove columns that contain "
      + "all missing values (default = no)", "R", 0, "-R"));
    newVector.add(new Option("\tReport progress iteratively. (default "
      + "= no)", "V", 0, "-V"));
    newVector.add(new Option(string9, "A", 0, "-A"));
    newVector.add(new Option(stringZeroAsMissing, "Z", 0, "-Z"));
    newVector.add(new Option(stringToStringDelimiters, "B", 1,
      "-B <toString delimiters>"));
    newVector.add(new Option(string10, "c", 1, "-c <the class index>"));
<<<<<<< HEAD
=======
=======
  public Enumeration listOptions() {

    String string1 = "\tThe required number of rules. (default = " + m_numRules
        + ")", string2 = "\tThe minimum confidence of a rule. (default = "
        + m_minMetric + ")", string3 = "\tThe delta by which the minimum support is decreased in\n", string4 = "\teach iteration. (default = "
        + m_delta + ")", string5 = "\tThe lower bound for the minimum support. (default = "
        + m_lowerBoundMinSupport + ")", string6 = "\tIf used, rules are tested for significance at\n", string7 = "\tthe given level. Slower. (default = no significance testing)", string8 = "\tIf set the itemsets found are also output. (default = no)", string9 = "\tIf set class association rules are mined. (default = no)", string10 = "\tThe class index. (default = last)", stringType = "\tThe metric type by which to rank rules. (default = "
        + "confidence)";

    FastVector newVector = new FastVector(11);

    newVector.addElement(new Option(string1, "N", 1,
        "-N <required number of rules output>"));
    newVector.addElement(new Option(stringType, "T", 1,
        "-T <0=confidence | 1=lift | " + "2=leverage | 3=Conviction>"));
    newVector.addElement(new Option(string2, "C", 1,
        "-C <minimum metric score of a rule>"));
    newVector.addElement(new Option(string3 + string4, "D", 1,
        "-D <delta for minimum support>"));
    newVector.addElement(new Option("\tUpper bound for minimum support. "
        + "(default = 1.0)", "U", 1, "-U <upper bound for minimum support>"));
    newVector.addElement(new Option(string5, "M", 1,
        "-M <lower bound for minimum support>"));
    newVector.addElement(new Option(string6 + string7, "S", 1,
        "-S <significance level>"));
    newVector.addElement(new Option(string8, "I", 0, "-I"));
    newVector.addElement(new Option("\tRemove columns that contain "
        + "all missing values (default = no)", "R", 0, "-R"));
    newVector.addElement(new Option("\tReport progress iteratively. (default "
        + "= no)", "V", 0, "-V"));
    newVector.addElement(new Option(string9, "A", 0, "-A"));
    newVector.addElement(new Option(string10, "c", 1, "-c <the class index>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

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
   * -N &lt;required number of rules output&gt;
   *  The required number of rules. (default = 10)
   * </pre>
   * 
   * <pre>
   * -T &lt;0=confidence | 1=lift | 2=leverage | 3=Conviction&gt;
   *  The metric type by which to rank rules. (default = confidence)
   * </pre>
   * 
   * <pre>
   * -C &lt;minimum metric score of a rule&gt;
   *  The minimum confidence of a rule. (default = 0.9)
   * </pre>
   * 
   * <pre>
   * -D &lt;delta for minimum support&gt;
   *  The delta by which the minimum support is decreased in
   *  each iteration. (default = 0.05)
   * </pre>
   * 
   * <pre>
   * -U &lt;upper bound for minimum support&gt;
   *  Upper bound for minimum support. (default = 1.0)
   * </pre>
   * 
   * <pre>
   * -M &lt;lower bound for minimum support&gt;
   *  The lower bound for the minimum support. (default = 0.1)
   * </pre>
   * 
   * <pre>
   * -S &lt;significance level&gt;
   *  If used, rules are tested for significance at
   *  the given level. Slower. (default = no significance testing)
   * </pre>
   * 
   * <pre>
   * -I
   *  If set the itemsets found are also output. (default = no)
   * </pre>
   * 
   * <pre>
   * -R
   *  Remove columns that contain all missing values (default = no)
   * </pre>
   * 
   * <pre>
   * -V
   *  Report progress iteratively. (default = no)
   * </pre>
   * 
   * <pre>
   * -A
   *  If set class association rules are mined. (default = no)
   * </pre>
   * 
   * <pre>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * -Z
   *  Treat zero (i.e. first value of nominal attributes) as missing
   * </pre>
   * 
   * <pre>
   * -B &lt;toString delimiters&gt;
   *  If used, two characters to use as rule delimiters
   *  in the result of toString: the first to delimit fields,
   *  the second to delimit items within fields.
   *  (default = traditional toString result)
   * </pre>
   * 
   * <pre>
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * -c &lt;the class index&gt;
   *  The class index. (default = last)
   * </pre>
   * 
   * <!-- options-end -->
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

    resetOptions();
    String numRulesString = Utils.getOption('N', options), minConfidenceString = Utils
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      .getOption('C', options), deltaString = Utils.getOption('D', options), maxSupportString = Utils
      .getOption('U', options), minSupportString = Utils
      .getOption('M', options), significanceLevelString = Utils.getOption('S',
      options), classIndexString = Utils.getOption('c', options), toStringDelimitersString = Utils
      .getOption('B', options);

    String metricTypeString = Utils.getOption('T', options);
    if (metricTypeString.length() != 0) {
      setMetricType(new SelectedTag(Integer.parseInt(metricTypeString),
        TAGS_SELECTION));
<<<<<<< HEAD
=======
=======
        .getOption('C', options), deltaString = Utils.getOption('D', options), maxSupportString = Utils
        .getOption('U', options), minSupportString = Utils.getOption('M',
        options), significanceLevelString = Utils.getOption('S', options), classIndexString = Utils
        .getOption('c', options);
    String metricTypeString = Utils.getOption('T', options);
    if (metricTypeString.length() != 0) {
      setMetricType(new SelectedTag(Integer.parseInt(metricTypeString),
          TAGS_SELECTION));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    if (numRulesString.length() != 0) {
      m_numRules = Integer.parseInt(numRulesString);
    }
    if (classIndexString.length() != 0) {
      if (classIndexString.equalsIgnoreCase("last")) {
        m_classIndex = -1;
      } else if (classIndexString.equalsIgnoreCase("first")) {
        m_classIndex = 0;
      } else {
        m_classIndex = Integer.parseInt(classIndexString);
      }
    }
    if (minConfidenceString.length() != 0) {
      m_minMetric = (new Double(minConfidenceString)).doubleValue();
    }
    if (deltaString.length() != 0) {
      m_delta = (new Double(deltaString)).doubleValue();
    }
    if (maxSupportString.length() != 0) {
      setUpperBoundMinSupport((new Double(maxSupportString)).doubleValue());
    }
    if (minSupportString.length() != 0) {
      m_lowerBoundMinSupport = (new Double(minSupportString)).doubleValue();
    }
    if (significanceLevelString.length() != 0) {
      m_significanceLevel = (new Double(significanceLevelString)).doubleValue();
    }
    m_outputItemSets = Utils.getFlag('I', options);
    m_car = Utils.getFlag('A', options);
    m_verbose = Utils.getFlag('V', options);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_treatZeroAsMissing = Utils.getFlag('Z', options);

    setRemoveAllMissingCols(Utils.getFlag('R', options));

    if (toStringDelimitersString.length() == 2) {
      m_toStringDelimiters = toStringDelimitersString;
    }
<<<<<<< HEAD
=======
=======
    setRemoveAllMissingCols(Utils.getFlag('R', options));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the current settings of the Apriori object.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String[] getOptions() {

    String[] options = new String[23];
<<<<<<< HEAD
=======
=======
  public String[] getOptions() {

    String[] options = new String[20];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int current = 0;

    if (m_outputItemSets) {
      options[current++] = "-I";
    }

    if (getRemoveAllMissingCols()) {
      options[current++] = "-R";
    }

    options[current++] = "-N";
    options[current++] = "" + m_numRules;
    options[current++] = "-T";
    options[current++] = "" + m_metricType;
    options[current++] = "-C";
    options[current++] = "" + m_minMetric;
    options[current++] = "-D";
    options[current++] = "" + m_delta;
    options[current++] = "-U";
    options[current++] = "" + m_upperBoundMinSupport;
    options[current++] = "-M";
    options[current++] = "" + m_lowerBoundMinSupport;
    options[current++] = "-S";
    options[current++] = "" + m_significanceLevel;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_car) {
      options[current++] = "-A";
    }
    if (m_verbose) {
      options[current++] = "-V";
    }

    if (m_treatZeroAsMissing) {
      options[current++] = "-Z";
    }
    options[current++] = "-c";
    options[current++] = "" + m_classIndex;

    if (m_toStringDelimiters != null) {
      options[current++] = "-B";
      options[current++] = m_toStringDelimiters;
    }

<<<<<<< HEAD
=======
=======
    if (m_car)
      options[current++] = "-A";
    if (m_verbose)
      options[current++] = "-V";
    options[current++] = "-c";
    options[current++] = "" + m_classIndex;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }

  /**
   * Outputs the size of all the generated sets of itemsets and the rules.
   * 
   * @return a string representation of the model
   */
  @Override
  public String toString() {

    StringBuffer text = new StringBuffer();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_Ls.size() <= 1) {
      return "\nNo large itemsets and rules found!\n";
    }
    text.append("\nApriori\n=======\n\n");
    text.append("Minimum support: " + Utils.doubleToString(m_minSupport, 2)
      + " (" + ((int) (m_minSupport * m_instances.numInstances() + 0.5))
      + " instances)" + '\n');
<<<<<<< HEAD
=======
=======
    if (m_Ls.size() <= 1)
      return "\nNo large itemsets and rules found!\n";
    text.append("\nApriori\n=======\n\n");
    text.append("Minimum support: " + Utils.doubleToString(m_minSupport, 2)
        + " (" + ((int) (m_minSupport * m_instances.numInstances() + 0.5))
        + " instances)" + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text.append("Minimum metric <");
    switch (m_metricType) {
    case CONFIDENCE:
      text.append("confidence>: ");
      break;
    case LIFT:
      text.append("lift>: ");
      break;
    case LEVERAGE:
      text.append("leverage>: ");
      break;
    case CONVICTION:
      text.append("conviction>: ");
      break;
    }
    text.append(Utils.doubleToString(m_minMetric, 2) + '\n');

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_significanceLevel != -1) {
      text.append("Significance level: "
        + Utils.doubleToString(m_significanceLevel, 2) + '\n');
    }
<<<<<<< HEAD
=======
=======
    if (m_significanceLevel != -1)
      text.append("Significance level: "
          + Utils.doubleToString(m_significanceLevel, 2) + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text.append("Number of cycles performed: " + m_cycles + '\n');
    text.append("\nGenerated sets of large itemsets:\n");
    if (!m_car) {
      for (int i = 0; i < m_Ls.size(); i++) {
        text.append("\nSize of set of large itemsets L(" + (i + 1) + "): "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          + (m_Ls.get(i)).size() + '\n');
        if (m_outputItemSets) {
          text.append("\nLarge Itemsets L(" + (i + 1) + "):\n");
          for (int j = 0; j < (m_Ls.get(i)).size(); j++) {
            text.append(((AprioriItemSet) (m_Ls.get(i)).get(j))
              .toString(m_instances) + "\n");
          }
        }
      }

      text.append("\nBest rules found:\n\n");

      if (m_toStringDelimiters != null) {
        text
          .append("Number,Premise,Premise Support,Consequence,Consequence Support,Confidence,Lift,Leverage,LeverageT,Conviction\n");
      }

      for (int i = 0; i < m_allTheRules[0].size(); i++) {
        /*
         * text.append(Utils.doubleToString((double) i + 1, (int)
         * (Math.log(m_numRules) / Math.log(10) + 1), 0) + ". " +
         * ((AprioriItemSet) m_allTheRules[0].get(i)) .toString(m_instances) +
         * " ==> " + ((AprioriItemSet) m_allTheRules[1].get(i))
         * .toString(m_instances)); text.append("    " + ((m_metricType ==
         * CONFIDENCE) ? "<" : "") + "conf:(" + Utils.doubleToString( ((Double)
         * m_allTheRules[2].get(i)).doubleValue(), 2) + ")" + ((m_metricType ==
         * CONFIDENCE) ? ">" : ""));
         */

        String outerDelim;
        String innerDelim;

        String stop;
        String implies;

        String confOpen;
        String confClose;

        String liftOpen;
        String liftClose;

        String levOpen;
        String levInner;
        String levClose;

        String convOpen;
        String convClose;

        if (m_toStringDelimiters != null) {
          outerDelim = m_toStringDelimiters.substring(0, 1);
          innerDelim = m_toStringDelimiters.substring(1, 2);

          stop = outerDelim;
          implies = outerDelim;

          confOpen = outerDelim;
          confClose = "";

          liftOpen = outerDelim;
          liftClose = "";

          levOpen = outerDelim;
          levInner = outerDelim;
          levClose = "";

          convOpen = outerDelim;
          convClose = "";
        } else {
          outerDelim = " ";
          innerDelim = " ";

          stop = ". ";
          implies = " ==> ";

          confOpen = "    " + (m_metricType == CONFIDENCE ? "<" : "")
            + "conf:(";
          confClose = ")" + (m_metricType == CONFIDENCE ? ">" : "");

          liftOpen = (m_metricType == LIFT ? " <" : "") + " lift:(";
          liftClose = ")" + (m_metricType == LIFT ? ">" : "");

          levOpen = (m_metricType == LEVERAGE ? " <" : "") + " lev:(";
          levInner = ")" + " [";
          levClose = "]" + (m_metricType == LEVERAGE ? ">" : "");

          convOpen = (m_metricType == CONVICTION ? " <" : "") + " conv:(";
          convClose = ")" + (m_metricType == CONVICTION ? ">" : "");
        }

        char odc = outerDelim.charAt(0);
        char idc = innerDelim.charAt(0);

        String n = Utils.doubleToString((double) i + 1,
          (int) (Math.log(m_numRules) / Math.log(10) + 1), 0);

        String premise = ((AprioriItemSet) m_allTheRules[0].get(i)).toString(
          m_instances, odc, idc);
        String consequence = ((AprioriItemSet) m_allTheRules[1].get(i))
          .toString(m_instances, odc, idc);

        String confidence = Utils.doubleToString(
          ((Double) m_allTheRules[2].get(i)).doubleValue(), 2);
        String lift = Utils.doubleToString(
          ((Double) m_allTheRules[3].get(i)).doubleValue(), 2);
        String leverage = Utils.doubleToString(
          ((Double) m_allTheRules[4].get(i)).doubleValue(), 2);
        String conviction = Utils.doubleToString(
          ((Double) m_allTheRules[5].get(i)).doubleValue(), 2);

        int leverageT = (int) (((Double) m_allTheRules[4].get(i)).doubleValue() * m_instances
          .numInstances());

        text.append(n).append(stop);
        text.append(premise).append(implies).append(consequence);
        text.append(confOpen).append(confidence).append(confClose);
        // if (/*m_metricType != CONFIDENCE ||*/ m_significanceLevel != -1) {

        text.append(liftOpen).append(lift).append(liftClose);
        text.append(levOpen).append(leverage).append(levInner)
          .append(leverageT).append(levClose);
        text.append(convOpen).append(conviction).append(convClose);

        // if (/*m_metricType != CONFIDENCE ||*/ m_significanceLevel != -1) {
        /*
         * text.append((m_metricType == LIFT ? " <" : "") + " lift:(" +
         * Utils.doubleToString( ((Double)
         * m_allTheRules[3].get(i)).doubleValue(), 2) + ")" + (m_metricType ==
         * LIFT ? ">" : "")); text.append((m_metricType == LEVERAGE ? " <" : "")
         * + " lev:(" + Utils.doubleToString( ((Double)
         * m_allTheRules[4].get(i)).doubleValue(), 2) + ")"); text.append(" [" +
         * (int) (((Double) m_allTheRules[4].get(i)).doubleValue() * m_instances
         * .numInstances()) + "]" + (m_metricType == LEVERAGE ? ">" : ""));
         * text.append((m_metricType == CONVICTION ? " <" : "") + " conv:(" +
         * Utils.doubleToString( ((Double)
         * m_allTheRules[5].get(i)).doubleValue(), 2) + ")" + (m_metricType ==
         * CONVICTION ? ">" : ""));
         */
        // }
<<<<<<< HEAD
=======
=======
            + ((FastVector) m_Ls.elementAt(i)).size() + '\n');
        if (m_outputItemSets) {
          text.append("\nLarge Itemsets L(" + (i + 1) + "):\n");
          for (int j = 0; j < ((FastVector) m_Ls.elementAt(i)).size(); j++)
            text.append(((AprioriItemSet) ((FastVector) m_Ls.elementAt(i))
                .elementAt(j)).toString(m_instances) + "\n");
        }
      }
      text.append("\nBest rules found:\n\n");
      for (int i = 0; i < m_allTheRules[0].size(); i++) {
        text.append(Utils.doubleToString((double) i + 1,
            (int) (Math.log(m_numRules) / Math.log(10) + 1), 0)
            + ". "
            + ((AprioriItemSet) m_allTheRules[0].elementAt(i))
                .toString(m_instances)
            + " ==> "
            + ((AprioriItemSet) m_allTheRules[1].elementAt(i))
                .toString(m_instances)
            + "    conf:("
            + Utils.doubleToString(
                ((Double) m_allTheRules[2].elementAt(i)).doubleValue(), 2)
            + ")");
        if (m_metricType != CONFIDENCE || m_significanceLevel != -1) {
          text.append((m_metricType == LIFT ? " <" : "")
              + " lift:("
              + Utils.doubleToString(
                  ((Double) m_allTheRules[3].elementAt(i)).doubleValue(), 2)
              + ")" + (m_metricType == LIFT ? ">" : ""));
          text.append((m_metricType == LEVERAGE ? " <" : "")
              + " lev:("
              + Utils.doubleToString(
                  ((Double) m_allTheRules[4].elementAt(i)).doubleValue(), 2)
              + ")");
          text.append(" ["
              + (int) (((Double) m_allTheRules[4].elementAt(i)).doubleValue() * m_instances
                  .numInstances()) + "]"
              + (m_metricType == LEVERAGE ? ">" : ""));
          text.append((m_metricType == CONVICTION ? " <" : "")
              + " conv:("
              + Utils.doubleToString(
                  ((Double) m_allTheRules[5].elementAt(i)).doubleValue(), 2)
              + ")" + (m_metricType == CONVICTION ? ">" : ""));
        }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        text.append('\n');
      }
    } else {
      for (int i = 0; i < m_Ls.size(); i++) {
        text.append("\nSize of set of large itemsets L(" + (i + 1) + "): "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          + (m_Ls.get(i)).size() + '\n');
        if (m_outputItemSets) {
          text.append("\nLarge Itemsets L(" + (i + 1) + "):\n");
          for (int j = 0; j < (m_Ls.get(i)).size(); j++) {
            text.append(((ItemSet) (m_Ls.get(i)).get(j)).toString(m_instances)
              + "\n");
            text.append(((LabeledItemSet) (m_Ls.get(i)).get(j)).m_classLabel
              + "  ");
            text.append(((LabeledItemSet) (m_Ls.get(i)).get(j)).support()
              + "\n");
<<<<<<< HEAD
=======
=======
            + ((FastVector) m_Ls.elementAt(i)).size() + '\n');
        if (m_outputItemSets) {
          text.append("\nLarge Itemsets L(" + (i + 1) + "):\n");
          for (int j = 0; j < ((FastVector) m_Ls.elementAt(i)).size(); j++) {
            text.append(((ItemSet) ((FastVector) m_Ls.elementAt(i))
                .elementAt(j)).toString(m_instances) + "\n");
            text.append(((LabeledItemSet) ((FastVector) m_Ls.elementAt(i))
                .elementAt(j)).m_classLabel + "  ");
            text.append(((LabeledItemSet) ((FastVector) m_Ls.elementAt(i))
                .elementAt(j)).support() + "\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      }
      text.append("\nBest rules found:\n\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      if (m_toStringDelimiters != null) {
        text
          .append("Number,Premise,Premise Support,Consequence,Consequence Support,Confidence\n");
      }

      for (int i = 0; i < m_allTheRules[0].size(); i++) {
        /*
         * text.append(Utils.doubleToString((double) i + 1, (int)
         * (Math.log(m_numRules) / Math.log(10) + 1), 0) + ". " + ((ItemSet)
         * m_allTheRules[0].get(i)).toString(m_instances) + " ==> " + ((ItemSet)
         * m_allTheRules[1].get(i)).toString(m_onlyClass) + "    conf:(" +
         * Utils.doubleToString( ((Double)
         * m_allTheRules[2].get(i)).doubleValue(), 2) + ")");
         */

        String outerDelim;
        String innerDelim;

        String stop;
        String implies;

        String confOpen;
        String confClose;

        if (m_toStringDelimiters != null) {
          outerDelim = m_toStringDelimiters.substring(0, 1);
          innerDelim = m_toStringDelimiters.substring(1, 2);

          stop = outerDelim;
          implies = outerDelim;

          confOpen = outerDelim;
          confClose = "";
        } else {
          outerDelim = " ";
          innerDelim = " ";

          stop = ". ";
          implies = " ==> ";

          confOpen = "    " + "conf:(";
          confClose = ")";
        }

        char odc = outerDelim.charAt(0);
        char idc = innerDelim.charAt(0);

        String n = Utils.doubleToString((double) i + 1,
          (int) (Math.log(m_numRules) / Math.log(10) + 1), 0);

        String premise = ((ItemSet) m_allTheRules[0].get(i)).toString(
          m_instances, odc, idc);
        String consequence = ((ItemSet) m_allTheRules[1].get(i)).toString(
          m_onlyClass, odc, idc);

        String confidence = Utils.doubleToString(
          ((Double) m_allTheRules[2].get(i)).doubleValue(), 2);

        text.append(n).append(stop).append(premise).append(implies)
          .append(consequence).append(confOpen).append(confidence)
          .append(confClose);
<<<<<<< HEAD
=======
=======
      for (int i = 0; i < m_allTheRules[0].size(); i++) {
        text.append(Utils.doubleToString((double) i + 1,
            (int) (Math.log(m_numRules) / Math.log(10) + 1), 0)
            + ". "
            + ((ItemSet) m_allTheRules[0].elementAt(i)).toString(m_instances)
            + " ==> "
            + ((ItemSet) m_allTheRules[1].elementAt(i)).toString(m_onlyClass)
            + "    conf:("
            + Utils.doubleToString(
                ((Double) m_allTheRules[2].elementAt(i)).doubleValue(), 2)
            + ")");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        text.append('\n');
      }
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return text.toString();
  }

  /**
   * Returns the metric string for the chosen metric type
   * 
   * @return a string describing the used metric for the interestingness of a
   *         class association rule
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String metricString() {

    switch (m_metricType) {
    case LIFT:
      return "lif";
    case LEVERAGE:
      return "leverage";
    case CONVICTION:
      return "conviction";
    default:
      return "conf";
    }
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String removeAllMissingColsTipText() {
    return "Remove columns with all missing values.";
  }

  /**
   * Remove columns containing all missing values.
   * 
   * @param r true if cols are to be removed.
   */
  public void setRemoveAllMissingCols(boolean r) {
    m_removeMissingCols = r;
  }

  /**
   * Returns whether columns containing all missing values are to be removed
   * 
   * @return true if columns are to be removed.
   */
  public boolean getRemoveAllMissingCols() {
    return m_removeMissingCols;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String upperBoundMinSupportTipText() {
    return "Upper bound for minimum support. Start iteratively decreasing "
<<<<<<< HEAD
      + "minimum support from this value.";
=======
<<<<<<< HEAD
      + "minimum support from this value.";
=======
        + "minimum support from this value.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the value of upperBoundMinSupport.
   * 
   * @return Value of upperBoundMinSupport.
   */
  public double getUpperBoundMinSupport() {

    return m_upperBoundMinSupport;
  }

  /**
   * Set the value of upperBoundMinSupport.
   * 
   * @param v Value to assign to upperBoundMinSupport.
   */
  public void setUpperBoundMinSupport(double v) {

    m_upperBoundMinSupport = v;
  }

  /**
   * Sets the class index
   * 
   * @param index the class index
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setClassIndex(int index) {

    m_classIndex = index;
  }

  /**
   * Gets the class index
   * 
   * @return the index of the class attribute
   */
  public int getClassIndex() {

    return m_classIndex;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String classIndexTipText() {
    return "Index of the class attribute. If set to -1, the last attribute is taken as class attribute.";

  }

  /**
   * Sets class association rule mining
   * 
   * @param flag if class association rules are mined, false otherwise
   */
  public void setCar(boolean flag) {
    m_car = flag;
  }

  /**
   * Gets whether class association ruels are mined
   * 
   * @return true if class association rules are mined, false otherwise
   */
  public boolean getCar() {
    return m_car;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String carTipText() {
    return "If enabled class association rules are mined instead of (general) association rules.";
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String lowerBoundMinSupportTipText() {
    return "Lower bound for minimum support.";
  }

  /**
   * Get the value of lowerBoundMinSupport.
   * 
   * @return Value of lowerBoundMinSupport.
   */
  public double getLowerBoundMinSupport() {

    return m_lowerBoundMinSupport;
  }

  /**
   * Set the value of lowerBoundMinSupport.
   * 
   * @param v Value to assign to lowerBoundMinSupport.
   */
  public void setLowerBoundMinSupport(double v) {

    m_lowerBoundMinSupport = v;
  }

  /**
   * Get the metric type
   * 
   * @return the type of metric to use for ranking rules
   */
  public SelectedTag getMetricType() {
    return new SelectedTag(m_metricType, TAGS_SELECTION);
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String metricTypeTipText() {
    return "Set the type of metric by which to rank rules. Confidence is "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "the proportion of the examples covered by the premise that are also "
      + "covered by the consequence (Class association rules can only be mined using confidence). Lift is confidence divided by the "
      + "proportion of all examples that are covered by the consequence. This "
      + "is a measure of the importance of the association that is independent "
      + "of support. Leverage is the proportion of additional examples covered "
      + "by both the premise and consequence above those expected if the "
      + "premise and consequence were independent of each other. The total "
      + "number of examples that this represents is presented in brackets "
      + "following the leverage. Conviction is "
      + "another measure of departure from independence. Conviction is given "
      + "by P(premise)P(!consequence) / P(premise, !consequence).";
<<<<<<< HEAD
=======
=======
        + "the proportion of the examples covered by the premise that are also "
        + "covered by the consequence(Class association rules can only be mined using confidence). Lift is confidence divided by the "
        + "proportion of all examples that are covered by the consequence. This "
        + "is a measure of the importance of the association that is independent "
        + "of support. Leverage is the proportion of additional examples covered "
        + "by both the premise and consequence above those expected if the "
        + "premise and consequence were independent of each other. The total "
        + "number of examples that this represents is presented in brackets "
        + "following the leverage. Conviction is "
        + "another measure of departure from independence. Conviction is given "
        + "by P(premise)P(!consequence) / P(premise, !consequence).";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set the metric type for ranking rules
   * 
   * @param d the type of metric
   */
  public void setMetricType(SelectedTag d) {

    if (d.getTags() == TAGS_SELECTION) {
      m_metricType = d.getSelectedTag().getID();
    }

    if (m_metricType == CONFIDENCE) {
      setMinMetric(0.9);
    }

    if (m_metricType == LIFT || m_metricType == CONVICTION) {
      setMinMetric(1.1);
    }

    if (m_metricType == LEVERAGE) {
      setMinMetric(0.1);
    }
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String minMetricTipText() {
    return "Minimum metric score. Consider only rules with scores higher than "
<<<<<<< HEAD
      + "this value.";
=======
<<<<<<< HEAD
      + "this value.";
=======
        + "this value.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the value of minConfidence.
   * 
   * @return Value of minConfidence.
   */
  public double getMinMetric() {

    return m_minMetric;
  }

  /**
   * Set the value of minConfidence.
   * 
   * @param v Value to assign to minConfidence.
   */
  public void setMinMetric(double v) {

    m_minMetric = v;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numRulesTipText() {
    return "Number of rules to find.";
  }

  /**
   * Get the value of numRules.
   * 
   * @return Value of numRules.
   */
  public int getNumRules() {

    return m_numRules;
  }

  /**
   * Set the value of numRules.
   * 
   * @param v Value to assign to numRules.
   */
  public void setNumRules(int v) {

    m_numRules = v;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String deltaTipText() {
    return "Iteratively decrease support by this factor. Reduces support "
<<<<<<< HEAD
      + "until min support is reached or required number of rules has been "
      + "generated.";
=======
<<<<<<< HEAD
      + "until min support is reached or required number of rules has been "
      + "generated.";
=======
        + "until min support is reached or required number of rules has been "
        + "generated.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the value of delta.
   * 
   * @return Value of delta.
   */
  public double getDelta() {

    return m_delta;
  }

  /**
   * Set the value of delta.
   * 
   * @param v Value to assign to delta.
   */
  public void setDelta(double v) {

    m_delta = v;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String significanceLevelTipText() {
    return "Significance level. Significance test (confidence metric only).";
  }

  /**
   * Get the value of significanceLevel.
   * 
   * @return Value of significanceLevel.
   */
  public double getSignificanceLevel() {

    return m_significanceLevel;
  }

  /**
   * Set the value of significanceLevel.
   * 
   * @param v Value to assign to significanceLevel.
   */
  public void setSignificanceLevel(double v) {

    m_significanceLevel = v;
  }

  /**
   * Sets whether itemsets are output as well
   * 
   * @param flag true if itemsets are to be output as well
   */
  public void setOutputItemSets(boolean flag) {
    m_outputItemSets = flag;
  }

  /**
   * Gets whether itemsets are output as well
   * 
   * @return true if itemsets are output as well
   */
  public boolean getOutputItemSets() {
    return m_outputItemSets;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String outputItemSetsTipText() {
    return "If enabled the itemsets are output as well.";
  }

  /**
   * Sets verbose mode
   * 
   * @param flag true if algorithm should be run in verbose mode
   */
  public void setVerbose(boolean flag) {
    m_verbose = flag;
  }

  /**
   * Gets whether algorithm is run in verbose mode
   * 
   * @return true if algorithm is run in verbose mode
   */
  public boolean getVerbose() {
    return m_verbose;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String verboseTipText() {
    return "If enabled the algorithm will be run in verbose mode.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String treatZeroAsMissingTipText() {
    return "If enabled, zero (that is, the first value of a nominal) is "
      + "treated in the same way as a missing value.";
  }

  /**
   * Sets whether zeros (i.e. the first value of a nominal attribute) should be
   * treated as missing values.
   * 
   * @param z true if zeros should be treated as missing values.
   */
  public void setTreatZeroAsMissing(boolean z) {
    m_treatZeroAsMissing = z;
  }

  /**
   * Gets whether zeros (i.e. the first value of a nominal attribute) is to be
   * treated int he same way as missing values.
   * 
   * @return true if zeros are to be treated like missing values.
   */
  public boolean getTreatZeroAsMissing() {
    return m_treatZeroAsMissing;
  }

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Method that finds all large itemsets for the given set of instances.
   * 
   * @throws Exception if an attribute is numeric
   */
  private void findLargeItemSets() throws Exception {

<<<<<<< HEAD
    ArrayList<Object> kMinusOneSets, kSets;
    Hashtable<ItemSet, Integer> hashtable;
    int necSupport, i = 0;
=======
<<<<<<< HEAD
    ArrayList<Object> kMinusOneSets, kSets;
    Hashtable<ItemSet, Integer> hashtable;
    int necSupport, i = 0;
=======
    FastVector kMinusOneSets, kSets;
    Hashtable hashtable;
    int necSupport, necMaxSupport, i = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Find large itemsets

    // minimum support
    necSupport = (int) (m_minSupport * m_instances.numInstances() + 0.5);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    kSets = AprioriItemSet.singletons(m_instances, m_treatZeroAsMissing);
    if (m_treatZeroAsMissing) {
      AprioriItemSet.upDateCountersTreatZeroAsMissing(kSets, m_instances);
    } else {
      AprioriItemSet.upDateCounters(kSets, m_instances);
    }
    kSets = AprioriItemSet.deleteItemSets(kSets, necSupport,
      m_instances.numInstances());
    if (kSets.size() == 0) {
      return;
    }
    do {
      m_Ls.add(kSets);
      kMinusOneSets = kSets;
      kSets = AprioriItemSet.mergeAllItemSets(kMinusOneSets, i,
        m_instances.numInstances());
      hashtable = AprioriItemSet.getHashtable(kMinusOneSets,
        kMinusOneSets.size());
      m_hashtables.add(hashtable);
      kSets = AprioriItemSet.pruneItemSets(kSets, hashtable);
      if (m_treatZeroAsMissing) {
        AprioriItemSet.upDateCountersTreatZeroAsMissing(kSets, m_instances);
      } else {
        AprioriItemSet.upDateCounters(kSets, m_instances);
      }
      kSets = AprioriItemSet.deleteItemSets(kSets, necSupport,
        m_instances.numInstances());
<<<<<<< HEAD
=======
=======
    necMaxSupport = (int) (m_upperBoundMinSupport * m_instances.numInstances() + 0.5);

    kSets = AprioriItemSet.singletons(m_instances);
    AprioriItemSet.upDateCounters(kSets, m_instances);
    kSets = AprioriItemSet.deleteItemSets(kSets, necSupport,
        m_instances.numInstances());
    if (kSets.size() == 0)
      return;
    do {
      m_Ls.addElement(kSets);
      kMinusOneSets = kSets;
      kSets = AprioriItemSet.mergeAllItemSets(kMinusOneSets, i,
          m_instances.numInstances());
      hashtable = AprioriItemSet.getHashtable(kMinusOneSets,
          kMinusOneSets.size());
      m_hashtables.addElement(hashtable);
      kSets = AprioriItemSet.pruneItemSets(kSets, hashtable);
      AprioriItemSet.upDateCounters(kSets, m_instances);
      kSets = AprioriItemSet.deleteItemSets(kSets, necSupport,
          m_instances.numInstances());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      i++;
    } while (kSets.size() > 0);
  }

  /**
   * Method that finds all association rules and performs significance test.
   * 
   * @throws Exception if an attribute is numeric
   */
  private void findRulesBruteForce() throws Exception {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Object>[] rules;

    // Build rules
    for (int j = 1; j < m_Ls.size(); j++) {
      ArrayList<Object> currentItemSets = m_Ls.get(j);
      Enumeration<Object> enumItemSets = new WekaEnumeration<Object>(
        currentItemSets);
      while (enumItemSets.hasMoreElements()) {
        AprioriItemSet currentItemSet = (AprioriItemSet) enumItemSets
          .nextElement();
        // AprioriItemSet currentItemSet = new
        // AprioriItemSet((ItemSet)enumItemSets.nextElement());
        rules = currentItemSet.generateRulesBruteForce(m_minMetric,
          m_metricType, m_hashtables, j + 1, m_instances.numInstances(),
          m_significanceLevel);
        for (int k = 0; k < rules[0].size(); k++) {
          m_allTheRules[0].add(rules[0].get(k));
          m_allTheRules[1].add(rules[1].get(k));
          m_allTheRules[2].add(rules[2].get(k));

          m_allTheRules[3].add(rules[3].get(k));
          m_allTheRules[4].add(rules[4].get(k));
          m_allTheRules[5].add(rules[5].get(k));
<<<<<<< HEAD
=======
=======
    FastVector[] rules;

    // Build rules
    for (int j = 1; j < m_Ls.size(); j++) {
      FastVector currentItemSets = (FastVector) m_Ls.elementAt(j);
      Enumeration enumItemSets = currentItemSets.elements();
      while (enumItemSets.hasMoreElements()) {
        AprioriItemSet currentItemSet = (AprioriItemSet) enumItemSets
            .nextElement();
        // AprioriItemSet currentItemSet = new
        // AprioriItemSet((ItemSet)enumItemSets.nextElement());
        rules = currentItemSet.generateRulesBruteForce(m_minMetric,
            m_metricType, m_hashtables, j + 1, m_instances.numInstances(),
            m_significanceLevel);
        for (int k = 0; k < rules[0].size(); k++) {
          m_allTheRules[0].addElement(rules[0].elementAt(k));
          m_allTheRules[1].addElement(rules[1].elementAt(k));
          m_allTheRules[2].addElement(rules[2].elementAt(k));

          m_allTheRules[3].addElement(rules[3].elementAt(k));
          m_allTheRules[4].addElement(rules[4].elementAt(k));
          m_allTheRules[5].addElement(rules[5].elementAt(k));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
  }

  /**
   * Method that finds all association rules.
   * 
   * @throws Exception if an attribute is numeric
   */
  private void findRulesQuickly() throws Exception {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Object>[] rules;
    // Build rules
    for (int j = 1; j < m_Ls.size(); j++) {
      ArrayList<Object> currentItemSets = m_Ls.get(j);
      Enumeration<Object> enumItemSets = new WekaEnumeration<Object>(
        currentItemSets);
      while (enumItemSets.hasMoreElements()) {
        AprioriItemSet currentItemSet = (AprioriItemSet) enumItemSets
          .nextElement();
<<<<<<< HEAD
=======
=======
    FastVector[] rules;

    // Build rules
    for (int j = 1; j < m_Ls.size(); j++) {
      FastVector currentItemSets = (FastVector) m_Ls.elementAt(j);
      Enumeration enumItemSets = currentItemSets.elements();
      while (enumItemSets.hasMoreElements()) {
        AprioriItemSet currentItemSet = (AprioriItemSet) enumItemSets
            .nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // AprioriItemSet currentItemSet = new
        // AprioriItemSet((ItemSet)enumItemSets.nextElement());
        rules = currentItemSet.generateRules(m_minMetric, m_hashtables, j + 1);
        for (int k = 0; k < rules[0].size(); k++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_allTheRules[0].add(rules[0].get(k));
          m_allTheRules[1].add(rules[1].get(k));
          m_allTheRules[2].add(rules[2].get(k));

          if (rules.length > 3) {
            m_allTheRules[3].add(rules[3].get(k));
            m_allTheRules[4].add(rules[4].get(k));
            m_allTheRules[5].add(rules[5].get(k));
          }
<<<<<<< HEAD
=======
=======
          m_allTheRules[0].addElement(rules[0].elementAt(k));
          m_allTheRules[1].addElement(rules[1].elementAt(k));
          m_allTheRules[2].addElement(rules[2].elementAt(k));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
  }

  /**
   * 
   * Method that finds all large itemsets for class association rules for the
   * given set of instances.
   * 
   * @throws Exception if an attribute is numeric
   */
  private void findLargeCarItemSets() throws Exception {

<<<<<<< HEAD
    ArrayList<Object> kMinusOneSets, kSets;
    Hashtable<ItemSet, Integer> hashtable;
    int necSupport, i = 0;
=======
<<<<<<< HEAD
    ArrayList<Object> kMinusOneSets, kSets;
    Hashtable<ItemSet, Integer> hashtable;
    int necSupport, i = 0;
=======
    FastVector kMinusOneSets, kSets;
    Hashtable hashtable;
    int necSupport, necMaxSupport, i = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Find large itemsets

    // minimum support
    double nextMinSupport = m_minSupport * m_instances.numInstances();
    double nextMaxSupport = m_upperBoundMinSupport * m_instances.numInstances();
    if (Math.rint(nextMinSupport) == nextMinSupport) {
      necSupport = (int) nextMinSupport;
    } else {
      necSupport = Math.round((float) (nextMinSupport + 0.5));
    }
    if (Math.rint(nextMaxSupport) == nextMaxSupport) {
<<<<<<< HEAD
    } else {
      Math.round((float) (nextMaxSupport + 0.5));
=======
<<<<<<< HEAD
    } else {
      Math.round((float) (nextMaxSupport + 0.5));
=======
      necMaxSupport = (int) nextMaxSupport;
    } else {
      necMaxSupport = Math.round((float) (nextMaxSupport + 0.5));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // find item sets of length one
    kSets = LabeledItemSet.singletons(m_instances, m_onlyClass);
    LabeledItemSet.upDateCounters(kSets, m_instances, m_onlyClass);

    // check if a item set of lentgh one is frequent, if not delete it
    kSets = LabeledItemSet.deleteItemSets(kSets, necSupport,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_instances.numInstances());
    if (kSets.size() == 0) {
      return;
    }
    do {
      m_Ls.add(kSets);
      kMinusOneSets = kSets;
      kSets = LabeledItemSet.mergeAllItemSets(kMinusOneSets, i,
        m_instances.numInstances());
      hashtable = LabeledItemSet.getHashtable(kMinusOneSets,
        kMinusOneSets.size());
      kSets = LabeledItemSet.pruneItemSets(kSets, hashtable);
      LabeledItemSet.upDateCounters(kSets, m_instances, m_onlyClass);
      kSets = LabeledItemSet.deleteItemSets(kSets, necSupport,
        m_instances.numInstances());
<<<<<<< HEAD
=======
=======
        m_instances.numInstances());
    if (kSets.size() == 0)
      return;
    do {
      m_Ls.addElement(kSets);
      kMinusOneSets = kSets;
      kSets = LabeledItemSet.mergeAllItemSets(kMinusOneSets, i,
          m_instances.numInstances());
      hashtable = LabeledItemSet.getHashtable(kMinusOneSets,
          kMinusOneSets.size());
      kSets = LabeledItemSet.pruneItemSets(kSets, hashtable);
      LabeledItemSet.upDateCounters(kSets, m_instances, m_onlyClass);
      kSets = LabeledItemSet.deleteItemSets(kSets, necSupport,
          m_instances.numInstances());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      i++;
    } while (kSets.size() > 0);
  }

  /**
   * Method that finds all class association rules.
   * 
   * @throws Exception if an attribute is numeric
   */
  private void findCarRulesQuickly() throws Exception {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Object>[] rules;

    // Build rules
    for (int j = 0; j < m_Ls.size(); j++) {
      ArrayList<Object> currentLabeledItemSets = m_Ls.get(j);
      Enumeration<Object> enumLabeledItemSets = new WekaEnumeration<Object>(
        currentLabeledItemSets);
      while (enumLabeledItemSets.hasMoreElements()) {
        LabeledItemSet currentLabeledItemSet = (LabeledItemSet) enumLabeledItemSets
          .nextElement();
        rules = currentLabeledItemSet.generateRules(m_minMetric, false);
        for (int k = 0; k < rules[0].size(); k++) {
          m_allTheRules[0].add(rules[0].get(k));
          m_allTheRules[1].add(rules[1].get(k));
          m_allTheRules[2].add(rules[2].get(k));
<<<<<<< HEAD
=======
=======
    FastVector[] rules;

    // Build rules
    for (int j = 0; j < m_Ls.size(); j++) {
      FastVector currentLabeledItemSets = (FastVector) m_Ls.elementAt(j);
      Enumeration enumLabeledItemSets = currentLabeledItemSets.elements();
      while (enumLabeledItemSets.hasMoreElements()) {
        LabeledItemSet currentLabeledItemSet = (LabeledItemSet) enumLabeledItemSets
            .nextElement();
        rules = currentLabeledItemSet.generateRules(m_minMetric, false);
        for (int k = 0; k < rules[0].size(); k++) {
          m_allTheRules[0].addElement(rules[0].elementAt(k));
          m_allTheRules[1].addElement(rules[1].elementAt(k));
          m_allTheRules[2].addElement(rules[2].elementAt(k));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
  }

  /**
   * returns all the rules
   * 
   * @return all the rules
   * @see #m_allTheRules
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public ArrayList<Object>[] getAllTheRules() {
    return m_allTheRules;
  }

  @Override
  public AssociationRules getAssociationRules() {
    List<AssociationRule> rules = new ArrayList<AssociationRule>();

    if (m_allTheRules != null && m_allTheRules.length > 3) {
      for (int i = 0; i < m_allTheRules[0].size(); i++) {
        // Construct the Lists for the premise and consequence
        List<Item> premise = new ArrayList<Item>();
        List<Item> consequence = new ArrayList<Item>();

        AprioriItemSet premiseSet = (AprioriItemSet) m_allTheRules[0].get(i);
        AprioriItemSet consequenceSet = (AprioriItemSet) m_allTheRules[1]
          .get(i);
        for (int j = 0; j < m_instances.numAttributes(); j++) {
          if (premiseSet.m_items[j] != -1) {
            try {
              Item newItem = new NominalItem(m_instances.attribute(j),
                premiseSet.m_items[j]);
              premise.add(newItem);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }

          if (consequenceSet.m_items[j] != -1) {
            try {
              Item newItem = new NominalItem(m_instances.attribute(j),
                consequenceSet.m_items[j]);
              consequence.add(newItem);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
        }

        // get the constituents of the metrics
        int totalTrans = premiseSet.m_totalTransactions;
        int totalSupport = consequenceSet.m_counter;
        int premiseSupport = premiseSet.m_counter;
        int consequenceSupport = consequenceSet.m_secondaryCounter;

        // map the primary metric
        DefaultAssociationRule.METRIC_TYPE metric = null;
        switch (m_metricType) {
        case CONFIDENCE:
          metric = DefaultAssociationRule.METRIC_TYPE.CONFIDENCE;
          break;
        case LIFT:
          metric = DefaultAssociationRule.METRIC_TYPE.LIFT;
          break;
        case LEVERAGE:
          metric = DefaultAssociationRule.METRIC_TYPE.LEVERAGE;
          break;
        case CONVICTION:
          metric = DefaultAssociationRule.METRIC_TYPE.CONVICTION;
          break;
        }

        DefaultAssociationRule newRule = new DefaultAssociationRule(premise,
          consequence, metric, premiseSupport, consequenceSupport,
          totalSupport, totalTrans);

        rules.add(newRule);
      }
    }

    return new AssociationRules(rules, this);
  }

  /**
   * Gets a list of the names of the metrics output for each rule. This list
   * should be the same (in terms of the names and order thereof) as that
   * produced by AssociationRule.getMetricNamesForRule().
   * 
   * @return an array of the names of the metrics available for each rule
   *         learned by this producer.
   */
  @Override
  public String[] getRuleMetricNames() {
    String[] metricNames = new String[DefaultAssociationRule.TAGS_SELECTION.length];

    for (int i = 0; i < DefaultAssociationRule.TAGS_SELECTION.length; i++) {
      metricNames[i] = DefaultAssociationRule.TAGS_SELECTION[i].getReadable();
    }

    return metricNames;
  }

  /**
   * Returns true if this AssociationRulesProducer can actually produce rules.
   * Most implementing classes will always return true from this method
   * (obviously :-)). However, an implementing class that actually acts as a
   * wrapper around things that may or may not implement
   * AssociationRulesProducer will want to return false if the thing they wrap
   * can't produce rules.
   * 
   * @return true if this producer can produce rules in its current
   *         configuration
   */
  @Override
  public boolean canProduceRules() {
    return true;
  }

<<<<<<< HEAD
=======
=======
  public FastVector[] getAllTheRules() {
    return m_allTheRules;
  }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 12014 $");
=======
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 12014 $");
=======
    return RevisionUtils.extract("$Revision: 9096 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method.
   * 
   * @param args the commandline options
   */
  public static void main(String[] args) {
    runAssociator(new Apriori(), args);
  }
}
