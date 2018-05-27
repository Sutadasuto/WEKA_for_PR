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
 * RDG1.java
<<<<<<< HEAD
 * Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.datagenerators.classifiers.classification;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.DenseInstance;
<<<<<<< HEAD
=======
=======
import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.WekaEnumeration;
import weka.datagenerators.ClassificationGenerator;
import weka.datagenerators.Test;

/**
 * <!-- globalinfo-start --> A data generator that produces data randomly by
 * producing a decision list.<br/>
 * The decision list consists of rules.<br/>
 * Instances are generated randomly one by one. If decision list fails to
 * classify the current instance, a new rule according to this current instance
 * is generated and added to the decision list.<br/>
 * <br/>
 * The option -V switches on voting, which means that at the end of the
 * generation all instances are reclassified to the class value that is
 * supported by the most rules.<br/>
 * <br/>
 * This data generator can generate 'boolean' attributes (= nominal with the
 * values {true, false}) and numeric attributes. The rules can be 'A' or 'NOT A'
 * for boolean values and 'B &lt; random_value' or 'B &gt;= random_value' for
 * numeric values.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -h
 *  Prints this help.
 * </pre>
 * 
 * <pre>
 * -o &lt;file&gt;
 *  The name of the output file, otherwise the generated data is
 *  printed to stdout.
 * </pre>
 * 
 * <pre>
 * -r &lt;name&gt;
 *  The name of the relation.
 * </pre>
 * 
 * <pre>
 * -d
 *  Whether to print debug informations.
 * </pre>
 * 
 * <pre>
 * -S
 *  The seed for random function (default 1)
 * </pre>
 * 
 * <pre>
 * -n &lt;num&gt;
 *  The number of examples to generate (default 100)
 * </pre>
 * 
 * <pre>
 * -a &lt;num&gt;
 *  The number of attributes (default 10).
 * </pre>
 * 
 * <pre>
 * -c &lt;num&gt;
 *  The number of classes (default 2)
 * </pre>
 * 
 * <pre>
 * -R &lt;num&gt;
 *  maximum size for rules (default 10)
 * </pre>
 * 
 * <pre>
 * -M &lt;num&gt;
 *  minimum size for rules (default 1)
 * </pre>
 * 
 * <pre>
 * -I &lt;num&gt;
 *  number of irrelevant attributes (default 0)
 * </pre>
 * 
 * <pre>
 * -N
 *  number of numeric attributes (default 0)
 * </pre>
 * 
 * <pre>
 * -V
 *  switch on voting (default is no voting)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * Following an example of a generated dataset: <br/>
 * 
<<<<<<< HEAD
=======
=======
import weka.datagenerators.ClassificationGenerator;
import weka.datagenerators.Test;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * A data generator that produces data randomly by producing a decision list.<br/>
 * The decision list consists of rules.<br/>
 * Instances are generated randomly one by one. If decision list fails to classify the current instance, a new rule according to this current instance is generated and added to the decision list.<br/>
 * <br/>
 * The option -V switches on voting, which means that at the end of the generation all instances are reclassified to the class value that is supported by the most rules.<br/>
 * <br/>
 * This data generator can generate 'boolean' attributes (= nominal with the values {true, false}) and numeric attributes. The rules can be 'A' or 'NOT A' for boolean values and 'B &lt; random_value' or 'B &gt;= random_value' for numeric values.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -h
 *  Prints this help.</pre>
 * 
 * <pre> -o &lt;file&gt;
 *  The name of the output file, otherwise the generated data is
 *  printed to stdout.</pre>
 * 
 * <pre> -r &lt;name&gt;
 *  The name of the relation.</pre>
 * 
 * <pre> -d
 *  Whether to print debug informations.</pre>
 * 
 * <pre> -S
 *  The seed for random function (default 1)</pre>
 * 
 * <pre> -n &lt;num&gt;
 *  The number of examples to generate (default 100)</pre>
 * 
 * <pre> -a &lt;num&gt;
 *  The number of attributes (default 10).</pre>
 * 
 * <pre> -c &lt;num&gt;
 *  The number of classes (default 2)</pre>
 * 
 * <pre> -R &lt;num&gt;
 *  maximum size for rules (default 10) </pre>
 * 
 * <pre> -M &lt;num&gt;
 *  minimum size for rules (default 1) </pre>
 * 
 * <pre> -I &lt;num&gt;
 *  number of irrelevant attributes (default 0)</pre>
 * 
 * <pre> -N
 *  number of numeric attributes (default 0)</pre>
 * 
 * <pre> -V
 *  switch on voting (default is no voting)</pre>
 * 
 <!-- options-end -->
 *
 * Following an example of a generated dataset: <br/>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <pre>
 * %
 * % weka.datagenerators.RDG1 -r expl -a 2 -c 3 -n 4 -N 1 -I 0 -M 2 -R 10 -S 2
 * %
 * relation expl
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * attribute a0 {false,true}
 * attribute a1 numeric
 * attribute class {c0,c1,c2}
 * 
 * data
 * 
<<<<<<< HEAD
=======
=======
 *
 * attribute a0 {false,true}
 * attribute a1 numeric
 * attribute class {c0,c1,c2}
 *
 * data
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * true,0.496823,c0
 * false,0.743158,c1
 * false,0.408285,c1
 * false,0.993687,c2
 * %
 * % Number of attributes chosen as irrelevant = 0
 * %
 * % DECISIONLIST (number of rules = 3):
 * % RULE 0:   c0 := a1 &lt; 0.986, a0
 * % RULE 1:   c1 := a1 &lt; 0.95, not(a0)
 * % RULE 2:   c2 := not(a0), a1 &gt;= 0.562
 * </pre>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 10203 $
 */
public class RDG1 extends ClassificationGenerator {

  /** for serialization */
  static final long serialVersionUID = 7751005204635320414L;

  /**
   * class to represent decisionlist
   */
  private class RuleList implements Serializable, RevisionHandler {

    /** for serialization */
    static final long serialVersionUID = 2830125413361938177L;

    /** rule list */
    private ArrayList<Test> m_RuleList = null;

<<<<<<< HEAD
=======
=======
 *
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 5674 $ 
 */
public class RDG1 
  extends ClassificationGenerator {

  /** for serialization */
  static final long serialVersionUID = 7751005204635320414L;  
  
  /**
   * class to represent decisionlist
   */
  private class RuleList 
    implements Serializable, RevisionHandler {

    /** for serialization */
    static final long serialVersionUID = 2830125413361938177L;
    
    /** rule list */
    private FastVector m_RuleList = null;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /** class */
    double m_ClassValue = 0.0;

    /**
     * returns the class value
     * 
     * @return the class value
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public double getClassValue() {
      return m_ClassValue;
    }

<<<<<<< HEAD
=======
=======
    public double getClassValue() { 
      return m_ClassValue; 
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * sets the class value
     * 
     * @param newClassValue the new classvalue
     */
    public void setClassValue(double newClassValue) {
      m_ClassValue = newClassValue;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * adds the given test to the list
     * 
     * @param newTest the test to add
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    private void addTest(Test newTest) {
      if (m_RuleList == null) {
        m_RuleList = new ArrayList<Test>();
      }

      m_RuleList.add(newTest);
    }

<<<<<<< HEAD
=======
=======
    private void addTest (Test newTest) { 
      if (m_RuleList == null)
	m_RuleList = new FastVector();
      
      m_RuleList.addElement(newTest);
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * classifies the given example
     * 
     * @param example the instance to classify
     * @return the classification
     * @throws Exception if classification fails
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    private double classifyInstance(Instance example) throws Exception {
      boolean passedAllTests = true;
      for (Enumeration<Test> e = new WekaEnumeration<Test>(m_RuleList); passedAllTests
        && e.hasMoreElements();) {
        Test test = e.nextElement();
        passedAllTests = test.passesTest(example);
      }
      if (passedAllTests) {
        return m_ClassValue;
      } else {
        return -1.0;
      }
    }

<<<<<<< HEAD
=======
=======
    private double classifyInstance (Instance example) throws Exception {
      boolean passedAllTests = true;
      for (Enumeration e = m_RuleList.elements(); 
	   passedAllTests && e.hasMoreElements(); ) {
	Test test = (Test) e.nextElement();
	passedAllTests = test.passesTest(example);
      }
      if (passedAllTests) return m_ClassValue;
      else return -1.0;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * returns a string representation of the rule list
     * 
     * @return the rule list as string
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public String toString() {
      StringBuffer str = new StringBuffer();
      str = str.append("  c" + (int) m_ClassValue + " := ");
      Enumeration<Test> e = new WekaEnumeration<Test>(m_RuleList);
      if (e.hasMoreElements()) {
        Test test = e.nextElement();
        str = str.append(test.toPrologString());
      }
      while (e.hasMoreElements()) {
        Test test = e.nextElement();
        str = str.append(", " + test.toPrologString());
      }
      return str.toString();
    }

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 10203 $");
    }
  } /* end class RuleList ***** */
<<<<<<< HEAD
=======
=======
    public String toString () {
      StringBuffer str = new StringBuffer();
      str = str.append("  c" + (int) m_ClassValue + " := ");
      Enumeration e = m_RuleList.elements();
      if (e.hasMoreElements()) {
	Test test = (Test) e.nextElement();
	str = str.append(test.toPrologString()); 
      }
      while (e.hasMoreElements()) {
	Test test = (Test) e.nextElement();
	str = str.append(", " + test.toPrologString());       
      }
      return str.toString();
    } 
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 5674 $");
    }
  } /*end class RuleList ******/
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Number of attribute the dataset should have */
  protected int m_NumAttributes;

  /** Number of Classes the dataset should have */
  protected int m_NumClasses;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** maximum rule size */
  private int m_MaxRuleSize;

  /** minimum rule size */
  private int m_MinRuleSize;

  /** number of irrelevant attributes. */
  private int m_NumIrrelevant;

  /** number of numeric attribute */
  private int m_NumNumeric;

  /** flag that stores if voting is wished */
  private boolean m_VoteFlag = false;

  /** decision list */
  private ArrayList<RuleList> m_DecisionList = null;

  /**
   * array defines which attributes are irrelevant, with: true = attribute is
   * irrelevant; false = attribute is not irrelevant
   */
<<<<<<< HEAD
=======
=======
  /** maximum rule size*/ 
  private int m_MaxRuleSize;
  
  /** minimum rule size*/ 
  private int m_MinRuleSize;
  
  /** number of irrelevant attributes.*/
  private int m_NumIrrelevant;

  /** number of numeric attribute*/
  private int m_NumNumeric;
 
  /** flag that stores if voting is wished*/ 
  private boolean m_VoteFlag = false;

   /** decision list */
  private FastVector m_DecisionList = null;

  /** array defines which attributes are irrelevant, with:
   * true = attribute is irrelevant; false = attribute is not irrelevant*/
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  boolean[] m_AttList_Irr;

  /**
   * initializes the generator with default values
   */
  public RDG1() {
    super();

    setNumAttributes(defaultNumAttributes());
    setNumClasses(defaultNumClasses());
    setMaxRuleSize(defaultMaxRuleSize());
    setMinRuleSize(defaultMinRuleSize());
    setNumIrrelevant(defaultNumIrrelevant());
    setNumNumeric(defaultNumNumeric());
  }

  /**
   * Returns a string describing this data generator.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the data generator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "A data generator that produces data randomly by producing a decision list.\n"
<<<<<<< HEAD
=======
=======
   *
   * @return a description of the data generator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return
        "A data generator that produces data randomly by producing a decision list.\n"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "The decision list consists of rules.\n"
      + "Instances are generated randomly one by one. If decision list fails "
      + "to classify the current instance, a new rule according to this current "
      + "instance is generated and added to the decision list.\n\n"
      + "The option -V switches on voting, which means that at the end "
      + "of the generation all instances are "
      + "reclassified to the class value that is supported by the most rules.\n\n"
      + "This data generator can generate 'boolean' attributes (= nominal with "
      + "the values {true, false}) and numeric attributes. The rules can be "
      + "'A' or 'NOT A' for boolean values and 'B < random_value' or "
      + "'B >= random_value' for numeric values.";
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = enumToVector(super.listOptions());

    result.addElement(new Option("\tThe number of attributes (default "
      + defaultNumAttributes() + ").", "a", 1, "-a <num>"));

    result.addElement(new Option("\tThe number of classes (default "
      + defaultNumClasses() + ")", "c", 1, "-c <num>"));

    result.addElement(new Option("\tmaximum size for rules (default "
      + defaultMaxRuleSize() + ") ", "R", 1, "-R <num>"));

    result.addElement(new Option("\tminimum size for rules (default "
      + defaultMinRuleSize() + ") ", "M", 1, "-M <num>"));

    result.addElement(new Option("\tnumber of irrelevant attributes (default "
      + defaultNumIrrelevant() + ")", "I", 1, "-I <num>"));

    result.addElement(new Option("\tnumber of numeric attributes (default "
      + defaultNumNumeric() + ")", "N", 1, "-N"));

    result.addElement(new Option("\tswitch on voting (default is no voting)",
      "V", 1, "-V"));

<<<<<<< HEAD
=======
=======
 /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options
   */
  public Enumeration listOptions() {
    Vector result = enumToVector(super.listOptions());

    result.addElement(new Option(
          "\tThe number of attributes (default " 
          + defaultNumAttributes() + ").",
          "a", 1, "-a <num>"));

    result.addElement(new Option(
        "\tThe number of classes (default " + defaultNumClasses() + ")",
        "c", 1, "-c <num>"));

    result.addElement(new Option(
          "\tmaximum size for rules (default " 
          + defaultMaxRuleSize() + ") ",
          "R", 1, "-R <num>"));
    
    result.addElement(new Option(
          "\tminimum size for rules (default " 
          + defaultMinRuleSize() + ") ",
          "M", 1, "-M <num>"));
    
    result.addElement(new Option(
          "\tnumber of irrelevant attributes (default " 
          + defaultNumIrrelevant() + ")",
          "I", 1, "-I <num>"));
    
    result.addElement(new Option(
          "\tnumber of numeric attributes (default "
          + defaultNumNumeric() + ")",
          "N", 1, "-N"));
    
    result.addElement(new Option(
          "\tswitch on voting (default is no voting)",
          "V", 1, "-V"));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result.elements();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Parses a list of options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -h
   *  Prints this help.
   * </pre>
   * 
   * <pre>
   * -o &lt;file&gt;
   *  The name of the output file, otherwise the generated data is
   *  printed to stdout.
   * </pre>
   * 
   * <pre>
   * -r &lt;name&gt;
   *  The name of the relation.
   * </pre>
   * 
   * <pre>
   * -d
   *  Whether to print debug informations.
   * </pre>
   * 
   * <pre>
   * -S
   *  The seed for random function (default 1)
   * </pre>
   * 
   * <pre>
   * -n &lt;num&gt;
   *  The number of examples to generate (default 100)
   * </pre>
   * 
   * <pre>
   * -a &lt;num&gt;
   *  The number of attributes (default 10).
   * </pre>
   * 
   * <pre>
   * -c &lt;num&gt;
   *  The number of classes (default 2)
   * </pre>
   * 
   * <pre>
   * -R &lt;num&gt;
   *  maximum size for rules (default 10)
   * </pre>
   * 
   * <pre>
   * -M &lt;num&gt;
   *  minimum size for rules (default 1)
   * </pre>
   * 
   * <pre>
   * -I &lt;num&gt;
   *  number of irrelevant attributes (default 0)
   * </pre>
   * 
   * <pre>
   * -N
   *  number of numeric attributes (default 0)
   * </pre>
   * 
   * <pre>
   * -V
   *  switch on voting (default is no voting)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;
<<<<<<< HEAD
=======
=======
   * Parses a list of options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -h
   *  Prints this help.</pre>
   * 
   * <pre> -o &lt;file&gt;
   *  The name of the output file, otherwise the generated data is
   *  printed to stdout.</pre>
   * 
   * <pre> -r &lt;name&gt;
   *  The name of the relation.</pre>
   * 
   * <pre> -d
   *  Whether to print debug informations.</pre>
   * 
   * <pre> -S
   *  The seed for random function (default 1)</pre>
   * 
   * <pre> -n &lt;num&gt;
   *  The number of examples to generate (default 100)</pre>
   * 
   * <pre> -a &lt;num&gt;
   *  The number of attributes (default 10).</pre>
   * 
   * <pre> -c &lt;num&gt;
   *  The number of classes (default 2)</pre>
   * 
   * <pre> -R &lt;num&gt;
   *  maximum size for rules (default 10) </pre>
   * 
   * <pre> -M &lt;num&gt;
   *  minimum size for rules (default 1) </pre>
   * 
   * <pre> -I &lt;num&gt;
   *  number of irrelevant attributes (default 0)</pre>
   * 
   * <pre> -N
   *  number of numeric attributes (default 0)</pre>
   * 
   * <pre> -V
   *  switch on voting (default is no voting)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String      tmpStr;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    super.setOptions(options);

    tmpStr = Utils.getOption('a', options);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (tmpStr.length() != 0) {
      setNumAttributes(Integer.parseInt(tmpStr));
    } else {
      setNumAttributes(defaultNumAttributes());
    }

    tmpStr = Utils.getOption('c', options);
    if (tmpStr.length() != 0) {
      setNumClasses(Integer.parseInt(tmpStr));
    } else {
      setNumClasses(defaultNumClasses());
    }

    tmpStr = Utils.getOption('R', options);
    if (tmpStr.length() != 0) {
      setMaxRuleSize(Integer.parseInt(tmpStr));
    } else {
      setMaxRuleSize(defaultMaxRuleSize());
    }

    tmpStr = Utils.getOption('M', options);
    if (tmpStr.length() != 0) {
      setMinRuleSize(Integer.parseInt(tmpStr));
    } else {
      setMinRuleSize(defaultMinRuleSize());
    }

    tmpStr = Utils.getOption('I', options);
    if (tmpStr.length() != 0) {
      setNumIrrelevant(Integer.parseInt(tmpStr));
    } else {
      setNumIrrelevant(defaultNumIrrelevant());
    }

    if ((getNumAttributes() - getNumIrrelevant()) < getMinRuleSize()) {
      throw new Exception("Possible rule size is below minimal rule size.");
    }

    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0) {
      setNumNumeric(Integer.parseInt(tmpStr));
    } else {
      setNumNumeric(defaultNumNumeric());
    }
<<<<<<< HEAD
=======
=======
    if (tmpStr.length() != 0)
      setNumAttributes(Integer.parseInt(tmpStr));
    else
      setNumAttributes(defaultNumAttributes());

    tmpStr = Utils.getOption('c', options);
    if (tmpStr.length() != 0)
      setNumClasses(Integer.parseInt(tmpStr));
    else
      setNumClasses(defaultNumClasses());

    tmpStr = Utils.getOption('R', options);
    if (tmpStr.length() != 0)
      setMaxRuleSize(Integer.parseInt(tmpStr));
    else 
      setMaxRuleSize(defaultMaxRuleSize());

    tmpStr = Utils.getOption('M', options);
    if (tmpStr.length() != 0)
      setMinRuleSize(Integer.parseInt(tmpStr));
    else
      setMinRuleSize(defaultMinRuleSize());

    tmpStr = Utils.getOption('I', options);
    if (tmpStr.length() != 0)
      setNumIrrelevant(Integer.parseInt(tmpStr));
    else
      setNumIrrelevant(defaultNumIrrelevant());

    if ((getNumAttributes() - getNumIrrelevant()) < getMinRuleSize())
       throw new Exception("Possible rule size is below minimal rule size.");

    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0)
      setNumNumeric(Integer.parseInt(tmpStr));
    else
      setNumNumeric(defaultNumNumeric());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setVoteFlag(Utils.getFlag('V', options));
  }

  /**
   * Gets the current settings of the datagenerator RDG1.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    Collections.addAll(result, super.getOptions());

    result.add("-a");
    result.add("" + getNumAttributes());

    result.add("-c");
    result.add("" + getNumClasses());

    result.add("-N");
    result.add("" + getNumNumeric());

    result.add("-I");
    result.add("" + getNumIrrelevant());

    result.add("-M");
    result.add("" + getMinRuleSize());

    result.add("-R");
    result.add("" + getMaxRuleSize());

    if (getVoteFlag()) {
      result.add("-V");
    }

    return result.toArray(new String[result.size()]);
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    String[]      options;
    int           i;
    
    result  = new Vector();
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
    
    result.add("-a");
    result.add("" + getNumAttributes());
    
    result.add("-c");
    result.add("" + getNumClasses());

    result.add("-N"); 
    result.add("" + getNumNumeric());
    
    result.add("-I"); 
    result.add("" + getNumIrrelevant());
    
    result.add("-M"); 
    result.add("" + getMinRuleSize());
    
    result.add("-R"); 
    result.add("" + getMaxRuleSize());
    
    if (getVoteFlag())
      result.add("-V"); 

    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the default number of attributes
   * 
   * @return the default number of attributes
   */
  protected int defaultNumAttributes() {
    return 10;
  }

  /**
   * Sets the number of attributes the dataset should have.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param numAttributes the new number of attributes
   */
  public void setNumAttributes(int numAttributes) {
    m_NumAttributes = numAttributes;
  }

  /**
   * Gets the number of attributes that should be produced.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of attributes that should be produced
   */
  public int getNumAttributes() {
    return m_NumAttributes;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   * @return the number of attributes that should be produced
   */
  public int getNumAttributes() { 
    return m_NumAttributes; 
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numAttributesTipText() {
    return "The number of attributes the generated data will contain.";
  }

  /**
   * returns the default number of classes
   * 
   * @return the default number of classes
   */
  protected int defaultNumClasses() {
    return 2;
  }

  /**
   * Sets the number of classes the dataset should have.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param numClasses the new number of classes
   */
  public void setNumClasses(int numClasses) {
    m_NumClasses = numClasses;
<<<<<<< HEAD
=======
=======
   * @param numClasses the new number of classes
   */
  public void setNumClasses(int numClasses) { 
    m_NumClasses = numClasses; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the number of classes the dataset should have.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of classes the dataset should have
   */
  public int getNumClasses() {
    return m_NumClasses;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   * @return the number of classes the dataset should have
   */
  public int getNumClasses() { 
    return m_NumClasses; 
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numClassesTipText() {
    return "The number of classes to generate.";
  }

  /**
   * returns the default max size of rules
   * 
   * @return the default max size of rules
   */
  protected int defaultMaxRuleSize() {
    return 10;
  }

  /**
   * Gets the maximum number of tests in rules.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the maximum number of tests allowed in rules
   */
  public int getMaxRuleSize() {
    return m_MaxRuleSize;
  }

  /**
   * Sets the maximum number of tests in rules.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return the maximum number of tests allowed in rules
   */
  public int getMaxRuleSize() { 
    return m_MaxRuleSize; 
  }
  
  /**
   * Sets the maximum number of tests in rules.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newMaxRuleSize new maximum number of tests allowed in rules.
   */
  public void setMaxRuleSize(int newMaxRuleSize) {
    m_MaxRuleSize = newMaxRuleSize;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String maxRuleSizeTipText() {
    return "The maximum number of tests in rules.";
  }

  /**
   * returns the default min size of rules
   * 
   * @return the default min size of rules
   */
  protected int defaultMinRuleSize() {
    return 1;
  }

  /**
   * Gets the minimum number of tests in rules.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the minimum number of tests allowed in rules
   */
  public int getMinRuleSize() {
    return m_MinRuleSize;
  }

  /**
   * Sets the minimum number of tests in rules.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return the minimum number of tests allowed in rules
   */
  public int getMinRuleSize() { 
    return m_MinRuleSize; 
  }
  
  /**
   * Sets the minimum number of tests in rules.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newMinRuleSize new minimum number of test in rules.
   */
  public void setMinRuleSize(int newMinRuleSize) {
    m_MinRuleSize = newMinRuleSize;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String minRuleSizeTipText() {
    return "The minimum number of tests in rules.";
  }

  /**
   * returns the default number of irrelevant attributes
   * 
   * @return the default number of irrelevant attributes
   */
  protected int defaultNumIrrelevant() {
    return 0;
  }

  /**
   * Gets the number of irrelevant attributes.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of irrelevant attributes
   */
  public int getNumIrrelevant() {
    return m_NumIrrelevant;
  }

  /**
   * Sets the number of irrelevant attributes.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return the number of irrelevant attributes
   */
  public int getNumIrrelevant() { 
    return m_NumIrrelevant; 
  }
  
  /**
   * Sets the number of irrelevant attributes.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newNumIrrelevant the number of irrelevant attributes.
   */
  public void setNumIrrelevant(int newNumIrrelevant) {
    m_NumIrrelevant = newNumIrrelevant;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numIrrelevantTipText() {
    return "The number of irrelevant attributes.";
  }

  /**
   * returns the default number of numeric attributes
   * 
   * @return the default number of numeric attributes
   */
  protected int defaultNumNumeric() {
    return 0;
  }

  /**
   * Gets the number of numerical attributes.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of numerical attributes.
   */
  public int getNumNumeric() {
    return m_NumNumeric;
  }

  /**
   * Sets the number of numerical attributes.
   * 
   * @param newNumNumeric the number of numerical attributes.
   */
  public void setNumNumeric(int newNumNumeric) {
    m_NumNumeric = newNumNumeric;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   *
   * @return the number of numerical attributes.
   */
  public int getNumNumeric() { 
    return m_NumNumeric; 
  }
  
  /**
   * Sets the number of numerical attributes.
   *
   * @param newNumNumeric the number of numerical attributes.
   */
  public void setNumNumeric(int newNumNumeric) { 
    m_NumNumeric = newNumNumeric;
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String numNumericTipText() {
    return "The number of numerical attributes.";
  }

  /**
   * Gets the vote flag.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return voting flag.
   */
  public boolean getVoteFlag() {
    return m_VoteFlag;
  }

  /**
   * Sets the vote flag.
   * 
   * @param newVoteFlag boolean with the new setting of the vote flag.
   */
  public void setVoteFlag(boolean newVoteFlag) {
    m_VoteFlag = newVoteFlag;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
   *
   * @return voting flag.
   */
  public boolean getVoteFlag() { 
    return m_VoteFlag; 
  }
  
  /**
   * Sets the vote flag.
   *
   * @param newVoteFlag boolean with the new setting of the vote flag.
   */
  public void setVoteFlag(boolean newVoteFlag) { 
    m_VoteFlag = newVoteFlag; 
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String voteFlagTipText() {
    return "Whether to use voting or not.";
  }

  /**
   * Gets the single mode flag.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return true if methode generateExample can be used.
   */
  @Override
  public boolean getSingleModeFlag() {
    return (!getVoteFlag());
  }

  /**
   * Gets the array that defines which of the attributes are seen to be
   * irrelevant.
   * 
   * @return the array that defines the irrelevant attributes
   */
  public boolean[] getAttList_Irr() {
    return m_AttList_Irr;
  }

  /**
   * Sets the array that defines which of the attributes are seen to be
   * irrelevant.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return true if methode generateExample can be used.
   */
  public boolean getSingleModeFlag() { 
    return (!getVoteFlag()); 
  }

  /**
   * Gets the array that defines which of the attributes
   * are seen to be irrelevant.
   *
   * @return the array that defines the irrelevant attributes
   */
  public boolean[] getAttList_Irr() { 
    return m_AttList_Irr; 
  }
  
  /**
   * Sets the array that defines which of the attributes
   * are seen to be irrelevant.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newAttList_Irr array that defines the irrelevant attributes.
   */
  public void setAttList_Irr(boolean[] newAttList_Irr) {
    m_AttList_Irr = newAttList_Irr;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String attList_IrrTipText() {
    return "The array with the indices of the irrelevant attributes.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Initializes the format for the dataset produced.
   * 
   * @return the output data format
   * @throws Exception data format could not be defined
   */
  @Override
  public Instances defineDataFormat() throws Exception {
    Instances dataset;
    Random random = new Random(getSeed());
    setRandom(random);

    m_DecisionList = new ArrayList<RuleList>();
<<<<<<< HEAD
=======
=======
   * Initializes the format for the dataset produced. 
   *
   * @return the output data format
   * @throws Exception data format could not be defined 
   */
  public Instances defineDataFormat() throws Exception {
    Instances dataset;
    Random random = new Random (getSeed());
    setRandom(random);

    m_DecisionList = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // number of examples is the same as given per option
    setNumExamplesAct(getNumExamples());

    // define dataset
    dataset = defineDataset(random);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return dataset;
  }

  /**
   * Generate an example of the dataset dataset.
   * 
   * @return the instance generated
   * @throws Exception if format not defined or generating <br/>
   *           examples one by one is not possible, because voting is chosen
   */
  @Override
<<<<<<< HEAD
=======
=======
    return dataset; 
  }

  /**
   * Generate an example of the dataset dataset. 
   * @return the instance generated
   * @throws Exception if format not defined or generating <br/>
   * examples one by one is not possible, because voting is chosen
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instance generateExample() throws Exception {
    Random random = getRandom();
    Instances format = getDatasetFormat();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (format == null) {
      throw new Exception("Dataset format not defined.");
    }
    if (getVoteFlag()) {
      throw new Exception("Examples cannot be generated one by one.");
    }
<<<<<<< HEAD
=======
=======
    if (format == null) 
      throw new Exception("Dataset format not defined.");
    if (getVoteFlag()) 
      throw new Exception("Examples cannot be generated one by one.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // generate values for all attributes
    format = generateExamples(1, random, format);

    return format.lastInstance();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Generate all examples of the dataset.
   * 
   * @return the instance generated
   * @throws Exception if format not defined or generating <br/>
   *           examples one by one is not possible, because voting is chosen
   */
  @Override
  public Instances generateExamples() throws Exception {
    Random random = getRandom();
    Instances format = getDatasetFormat();
    if (format == null) {
      throw new Exception("Dataset format not defined.");
    }
<<<<<<< HEAD
=======
=======
   * Generate all examples of the dataset. 
   * @return the instance generated
   * @throws Exception if format not defined or generating <br/>
   * examples one by one is not possible, because voting is chosen
   */
  public Instances generateExamples() throws Exception {
    Random random = getRandom();
    Instances format = getDatasetFormat();
    if (format == null) 
      throw new Exception("Dataset format not defined.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // generate values for all attributes
    format = generateExamples(getNumExamplesAct(), random, format);

    // vote all examples, and set new class value
<<<<<<< HEAD
    if (getVoteFlag()) {
      format = voteDataset(format);
    }
=======
<<<<<<< HEAD
    if (getVoteFlag()) {
      format = voteDataset(format);
    }
=======
    if (getVoteFlag())
      format = voteDataset(format);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return format;
  }

  /**
<<<<<<< HEAD
   * Generate all examples of the dataset.
   * 
=======
<<<<<<< HEAD
   * Generate all examples of the dataset.
   * 
=======
   * Generate all examples of the dataset. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param num the number of examples to generate
   * @param random the random number generator to use
   * @param format the dataset format
   * @return the instance generated
   * @throws Exception if format not defined or generating <br/>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *           examples one by one is not possible, because voting is chosen
   */
  public Instances generateExamples(int num, Random random, Instances format)
    throws Exception {

    if (format == null) {
      throw new Exception("Dataset format not defined.");
    }

    // generate values for all attributes
    for (int i = 0; i < num; i++) {
<<<<<<< HEAD
=======
=======
   * examples one by one is not possible, because voting is chosen
   */
  public Instances generateExamples(int num, 
                                   Random random,
                                   Instances format) throws Exception {

    if (format == null) 
      throw new Exception("Dataset format not defined.");
    
    // generate values for all attributes
    for (int i = 0; i < num; i++)  {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // over all examples to be produced
      Instance example = generateExample(random, format);

      // set class of example using decision list
      boolean classDefined = classifyExample(example);
      if (!classDefined) {
        // set class with newly generated rule
        example = updateDecisionList(random, example);
      }
      example.setDataset(format);
      format.add(example);
    }

    return (format);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Generates a new rule for the decision list. and classifies the new example
   * 
   * @param random random number generator
   * @param example example used to update decision list
<<<<<<< HEAD
=======
=======
 /**
   * Generates a new rule for the decision list.
   * and classifies the new example
   * @param random random number generator
   * @param example example used to update decision list 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the classified example
   * @throws Exception if dataset format not defined
   */
  private Instance updateDecisionList(Random random, Instance example)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {

    ArrayList<Test> TestList;
    Instances format = getDatasetFormat();
    if (format == null) {
      throw new Exception("Dataset format not defined.");
    }

    TestList = generateTestList(random, example);

    int maxSize = getMaxRuleSize() < TestList.size() ? getMaxRuleSize()
      : TestList.size();
    int ruleSize = ((int) (random.nextDouble() * (maxSize - getMinRuleSize())))
      + getMinRuleSize();

    RuleList newRule = new RuleList();
    for (int i = 0; i < ruleSize; i++) {
      int testIndex = (int) (random.nextDouble() * TestList.size());
      Test test = TestList.get(testIndex);

      newRule.addTest(test);
      TestList.remove(testIndex);
    }
    double newClassValue = 0.0;
    if (m_DecisionList.size() > 0) {
      RuleList r = (m_DecisionList.get(m_DecisionList.size() - 1));
      double oldClassValue = (r.getClassValue());
      newClassValue = (double) ((int) oldClassValue + 1) % getNumClasses();
    }
    newRule.setClassValue(newClassValue);
    m_DecisionList.add(newRule);
    example = (Instance) example.copy();
<<<<<<< HEAD
=======
=======
   throws Exception {

    FastVector TestList;
    Instances format = getDatasetFormat();
    if (format == null) 
      throw new Exception("Dataset format not defined.");

    TestList = generateTestList(random, example);

    int maxSize = getMaxRuleSize() < TestList.size() ? 
                            getMaxRuleSize() : TestList.size();
    int ruleSize = ((int) (random.nextDouble() * 
                             (double) (maxSize - getMinRuleSize())))
                                   + getMinRuleSize();

    RuleList newRule = new RuleList();
    for (int i=0; i < ruleSize; i++) {
      int testIndex = (int) (random.nextDouble() * (double) TestList.size());
      Test test = (Test) TestList.elementAt(testIndex);
          
      newRule.addTest(test);
      TestList.removeElementAt(testIndex);
    }
    double newClassValue = 0.0;
    if (m_DecisionList.size() > 0) {
      RuleList r = (RuleList)(m_DecisionList.lastElement());
      double oldClassValue = (double) 
                        (r.getClassValue());
      newClassValue = (double)((int)oldClassValue + 1)
                               % getNumClasses();
    }
    newRule.setClassValue(newClassValue);
    m_DecisionList.addElement(newRule);
    example = (Instance)example.copy();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    example.setDataset(format);
    example.setClassValue(newClassValue);
    return example;
  }

<<<<<<< HEAD
  /**
   * Generates a new rule for the decision list and classifies the new example.
   * 
=======
<<<<<<< HEAD
  /**
   * Generates a new rule for the decision list and classifies the new example.
   * 
=======
 /**
   * Generates a new rule for the decision list
   * and classifies the new example.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param random random number generator
   * @param example the instance to classify
   * @return a list of tests
   * @throws Exception if dataset format not defined
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private ArrayList<Test> generateTestList(Random random, Instance example)
    throws Exception {

    Instances format = getDatasetFormat();
    if (format == null) {
      throw new Exception("Dataset format not defined.");
    }

    int numTests = getNumAttributes() - getNumIrrelevant();
    ArrayList<Test> TestList = new ArrayList<Test>(numTests);
<<<<<<< HEAD
=======
=======
  private FastVector generateTestList(Random random, Instance example) 
   throws Exception {

    Instances format = getDatasetFormat();
    if (format == null) 
      throw new Exception("Dataset format not defined.");

    int numTests = getNumAttributes() - getNumIrrelevant();
    FastVector TestList = new FastVector(numTests);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    boolean[] irrelevant = getAttList_Irr();

    for (int i = 0; i < getNumAttributes(); i++) {
      if (!irrelevant[i]) {
        Test newTest = null;
        Attribute att = example.attribute(i);
        if (att.isNumeric()) {
          double newSplit = random.nextDouble();
          boolean newNot = newSplit < example.value(i);
          newTest = new Test(i, newSplit, format, newNot);
        } else {
          newTest = new Test(i, example.value(i), format, false);
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        TestList.add(newTest);
      }
    }

    return TestList;
  }

  /**
   * Generates an example with its classvalue set to missing and binds it to the
   * datasets.
   * 
<<<<<<< HEAD
=======
=======
      TestList.addElement (newTest);     
      }
    }
    
    return TestList;
  }

 /**
   * Generates an example with its classvalue set to missing
   * and binds it to the datasets.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param random random number generator
   * @param format dataset the example gets bind to
   * @return the generated example
   * @throws Exception if attribute type not supported
   */
<<<<<<< HEAD
  private Instance generateExample(Random random, Instances format)
    throws Exception {
=======
<<<<<<< HEAD
  private Instance generateExample(Random random, Instances format)
    throws Exception {
=======
  private Instance generateExample(Random random, Instances format) 
    throws Exception {     
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double[] attributes;
    Instance example;

    attributes = new double[getNumAttributes() + 1];
    for (int i = 0; i < getNumAttributes(); i++) {
      double value = random.nextDouble();
      if (format.attribute(i).isNumeric()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        attributes[i] = value;
      } else {
        if (format.attribute(i).isNominal()) {
          attributes[i] = (value > 0.5) ? 1.0 : 0.0;
        } else {
          throw new Exception("Attribute type is not supported.");
        }
      }
    }
    example = new DenseInstance(1.0, attributes);
    example.setDataset(format);
    example.setClassMissing();

    return example;
  }

  /**
   * Tries to classify an example.
<<<<<<< HEAD
=======
=======
        attributes[i] = value; 
      } else {
	if (format.attribute(i).isNominal())
	  attributes[i] = (value > 0.5) ? 1.0 : 0.0;
	else
	  throw new Exception ("Attribute type is not supported.");
      }
    }
    example = new Instance(1.0, attributes);
    example.setDataset(format);
    example.setClassMissing();

    return example; 
  }

 /**
   * Tries to classify an example. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param example the example to classify
   * @return true if it could be classified
   * @throws Exception if something goes wrong
   */
  private boolean classifyExample(Instance example) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double classValue = -1.0;

    for (Enumeration<RuleList> e = new WekaEnumeration<RuleList>(m_DecisionList); e
      .hasMoreElements() && classValue < 0.0;) {
      RuleList rl = e.nextElement();
      classValue = rl.classifyInstance(example);
<<<<<<< HEAD
=======
=======
    double classValue = -1.0;  

    for (Enumeration e = m_DecisionList.elements(); 
         e.hasMoreElements() && classValue < 0.0;) {
      RuleList rl = (RuleList) e.nextElement();
      classValue = rl.classifyInstance(example);   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    if (classValue >= 0.0) {
      example.setClassValue(classValue);
      return true;
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
      return false;
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Classify example with maximum vote the following way. With every rule in
   * the decisionlist, it is evaluated if the given instance could be the class
   * of the rule. Finally the class value that receives the highest number of
   * votes is assigned to the example.
<<<<<<< HEAD
=======
=======
 /**
   * Classify example with maximum vote the following way.
   * With every rule in the decisionlist, it is evaluated if
   * the given instance could be the class of the rule.
   * Finally the class value that receives the highest number of votes
   * is assigned to the example.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param example example to be reclassified
   * @return instance with new class value
   * @throws Exception if classification fails
   */
  private Instance votedReclassifyExample(Instance example) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int classVotes[] = new int[getNumClasses()];
    for (int i = 0; i < classVotes.length; i++) {
      classVotes[i] = 0;
    }

    for (Enumeration<RuleList> e = new WekaEnumeration<RuleList>(m_DecisionList); e
      .hasMoreElements();) {
      RuleList rl = e.nextElement();
      int classValue = (int) rl.classifyInstance(example);
      if (classValue >= 0) {
        classVotes[classValue]++;
      }
<<<<<<< HEAD
=======
=======
    int classVotes[] = new int [getNumClasses()]; 
    for (int i = 0; i < classVotes.length; i++) classVotes[i] = 0; 

    for (Enumeration e = m_DecisionList.elements(); 
         e.hasMoreElements();) {
      RuleList rl = (RuleList) e.nextElement();
      int classValue = (int) rl.classifyInstance(example);
      if (classValue >= 0) classVotes[classValue]++;  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    int maxVote = 0;
    int vote = -1;
    for (int i = 0; i < classVotes.length; i++) {
      if (classVotes[i] > maxVote) {
        maxVote = classVotes[i];
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        vote = i;
      }
    }
    if (vote >= 0) {
      example.setClassValue(vote);
    } else {
      throw new Exception("Error in instance classification.");
    }
<<<<<<< HEAD
=======
=======
        vote = i; 
      }
    }
    if (vote >= 0)
      example.setClassValue((double) vote);
    else
      throw new Exception ("Error in instance classification.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return example;
  }

<<<<<<< HEAD
  /**
   * Returns a dataset header.
   * 
=======
<<<<<<< HEAD
  /**
   * Returns a dataset header.
   * 
=======
 /**
   * Returns a dataset header.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param random random number generator
   * @return dataset header
   * @throws Exception if something goes wrong
   */
  private Instances defineDataset(Random random) throws Exception {

    boolean[] attList_Irr;
    int[] attList_Num;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Attribute> attributes = new ArrayList<Attribute>();
    Attribute attribute;
    ArrayList<String> nominalValues = new ArrayList<String>(2);
    nominalValues.add("false");
    nominalValues.add("true");
    ArrayList<String> classValues = new ArrayList<String>(getNumClasses());
    Instances dataset;

<<<<<<< HEAD
=======
=======
    FastVector attributes = new FastVector();
    Attribute attribute;
    FastVector nominalValues = new FastVector (2);
    nominalValues.addElement("false"); 
    nominalValues.addElement("true"); 
    FastVector classValues = new FastVector (getNumClasses());
    Instances dataset;
     
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // set randomly those attributes that are irrelevant
    attList_Irr = defineIrrelevant(random);
    setAttList_Irr(attList_Irr);

    // set randomly those attributes that are numeric
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    attList_Num = defineNumeric(random);

    // define dataset
    for (int i = 0; i < getNumAttributes(); i++) {
      if (attList_Num[i] == Attribute.NUMERIC) {
        attribute = new Attribute("a" + i);
      } else {
        attribute = new Attribute("a" + i, nominalValues);
      }
      attributes.add(attribute);
    }
    for (int i = 0; i < getNumClasses(); i++) {
      classValues.add("c" + i);
    }
    attribute = new Attribute("class", classValues);
    attributes.add(attribute);

    dataset = new Instances(getRelationNameToUse(), attributes,
      getNumExamplesAct());
<<<<<<< HEAD
=======
=======
    attList_Num = defineNumeric(random); 

    // define dataset
    for (int i = 0; i < getNumAttributes(); i++) {
      if (attList_Num[i] == Attribute.NUMERIC)
        attribute = new Attribute("a" + i); 
      else
        attribute = new Attribute("a" + i, nominalValues); 
      attributes.addElement(attribute);
    }
    for (int i = 0; i < classValues.capacity(); i++)
      classValues.addElement("c" + i);
    attribute = new Attribute ("class", classValues); 
    attributes.addElement(attribute);

    dataset = new Instances(getRelationNameToUse(), attributes,
                            getNumExamplesAct());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    dataset.setClassIndex(getNumAttributes());

    // set dataset format of this class
    Instances format = new Instances(dataset, 0);
    setDatasetFormat(format);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return dataset;
  }

  /**
   * Defines randomly the attributes as irrelevant. Number of attributes to be
   * set as irrelevant is either set with a preceeding call of
   * setNumIrrelevant() or is per default 0.
   * 
   * @param random the random number generator to use
   * @return list of boolean values with one value for each attribute, and each
   *         value set true or false according to if the corresponding attribute
   *         was defined irrelevant or not
   */
  private boolean[] defineIrrelevant(Random random) {

    boolean[] irr = new boolean[getNumAttributes()];

    // initialize
    for (int i = 0; i < irr.length; i++) {
      irr[i] = false;
    }

    // set randomly
    int numIrr = 0;
    for (int i = 0; (numIrr < getNumIrrelevant())
      && (i < getNumAttributes() * 5); i++) {
      int maybeNext = (int) (random.nextDouble() * irr.length);
      if (irr[maybeNext] == false) {
        irr[maybeNext] = true;
        numIrr++;
      }
    }

    return irr;
  }

  /**
   * Chooses randomly the attributes that get datatyp numeric.
   * 
   * @param random the random number generator to use
   * @return list of integer values, with one value for each attribute, and each
   *         value set to Attribut.NOMINAL or Attribut.NUMERIC
   */
  private int[] defineNumeric(Random random) {

    int[] num = new int[getNumAttributes()];

    // initialize
    for (int i = 0; i < num.length; i++) {
      num[i] = Attribute.NOMINAL;
    }

    int numNum = 0;
    for (int i = 0; (numNum < getNumNumeric()) && (i < getNumAttributes() * 5); i++) {
      int maybeNext = (int) (random.nextDouble() * num.length);
<<<<<<< HEAD
=======
=======
    
    return dataset; 
  } 

 /**
   * Defines randomly the attributes as irrelevant.
   * Number of attributes to be set as irrelevant is either set
   * with a preceeding call of setNumIrrelevant() or is per default 0.
   *
   * @param random the random number generator to use
   * @return list of boolean values with one value for each attribute,
   * and each value set true or false according to if the corresponding
   * attribute was defined irrelevant or not
   */
  private boolean[] defineIrrelevant(Random random) {

    boolean[] irr = new boolean [getNumAttributes()];
 
    // initialize
    for (int i = 0; i < irr.length; i++)
      irr[i] = false;

    // set randomly
    int numIrr = 0;
    for (int i = 0; 
         (numIrr < getNumIrrelevant()) && (i < getNumAttributes() * 5);
          i++) {
      int maybeNext = (int) (random.nextDouble() * (double) irr.length);
      if (irr[maybeNext] == false) {
        irr [maybeNext] = true;
        numIrr++;
      }
    }
    
    return irr;
  }

 /**
   * Chooses randomly the attributes that get datatyp numeric.
   * @param random the random number generator to use
   * @return list of integer values, with one value for each attribute,
   * and each value set to Attribut.NOMINAL or Attribut.NUMERIC
   */
  private int[] defineNumeric(Random random) {
    
    int[] num = new int [getNumAttributes()];

    // initialize
    for (int i = 0; i < num.length; i++)
      num[i] = Attribute.NOMINAL;

    int numNum = 0;
    for (int i = 0;
         (numNum < getNumNumeric()) && (i < getNumAttributes() * 5); i++) {
      int maybeNext = (int) (random.nextDouble() * (double) num.length);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (num[maybeNext] != Attribute.NUMERIC) {
        num[maybeNext] = Attribute.NUMERIC;
        numNum++;
      }
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return num;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Generates a comment string that documentates the data generator. By default
   * this string is added at the beginning of the produced output as ARFF file
   * type, next after the options.
   * 
   * @return string contains info about the generated rules
   */
  @Override
  public String generateStart() {
<<<<<<< HEAD
=======
=======
   * Generates a comment string that documentates the data generator.
   * By default this string is added at the beginning of the produced output
   * as ARFF file type, next after the options.
   * 
   * @return string contains info about the generated rules
   */
  public String generateStart () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "";
  }

  /**
   * Compiles documentation about the data generation. This is the number of
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * irrelevant attributes and the decisionlist with all rules. Considering that
   * the decisionlist might get enhanced until the last instance is generated,
   * this method should be called at the end of the data generation process.
   * 
   * @return string with additional information about generated dataset
   * @throws Exception no input structure has been defined
   */
  @Override
<<<<<<< HEAD
=======
=======
   * irrelevant attributes and the decisionlist with all rules.
   * Considering that the decisionlist might get enhanced until
   * the last instance is generated, this method should be called at the
   * end of the data generation process. 
   *
   * @return string with additional information about generated dataset
   * @throws Exception no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String generateFinished() throws Exception {

    StringBuffer dLString = new StringBuffer();

    // string for output at end of ARFF-File
    boolean[] attList_Irr = getAttList_Irr();
    Instances format = getDatasetFormat();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    dLString.append("%\n% Number of attributes chosen as irrelevant = "
      + getNumIrrelevant() + "\n");
    for (int i = 0; i < attList_Irr.length; i++) {
      if (attList_Irr[i]) {
        dLString.append("% " + format.attribute(i).name() + "\n");
      }
    }

    dLString.append("%\n% DECISIONLIST (number of rules = "
      + m_DecisionList.size() + "):\n");

    for (int i = 0; i < m_DecisionList.size(); i++) {
      RuleList rl = m_DecisionList.get(i);
      dLString.append("% RULE " + i + ": " + rl.toString() + "\n");
    }

    return dLString.toString();
  }

  /**
   * Resets the class values of all instances using voting. For each instance
   * the class value that satisfies the most rules is choosen as new class
   * value.
   * 
<<<<<<< HEAD
=======
=======
    dLString.append("%\n% Number of attributes chosen as irrelevant = " +
                    getNumIrrelevant() + "\n");
    for (int i = 0; i < attList_Irr.length; i++) {
      if (attList_Irr[i])
        dLString.append("% " + format.attribute(i).name() + "\n");
    }

    dLString.append("%\n% DECISIONLIST (number of rules = " +
                    m_DecisionList.size() + "):\n");
     
    for (int i = 0; i < m_DecisionList.size(); i++) {
      RuleList rl = (RuleList) m_DecisionList.elementAt(i);
      dLString.append("% RULE " + i + ": " + rl.toString() + "\n");
    }
    
    return dLString.toString();
  }

 /**
   * Resets the class values of all instances using voting.
   * For each instance the class value that satisfies the most rules
   * is choosen as new class value.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param dataset the dataset to work on
   * @return the changed instances
   * @throws Exception if something goes wrong
   */
  private Instances voteDataset(Instances dataset) throws Exception {
    for (int i = 0; i < dataset.numInstances(); i++) {
      Instance inst = dataset.firstInstance();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      inst = votedReclassifyExample(inst);
      dataset.add(inst);
      dataset.delete(0);
    }

    return dataset;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
<<<<<<< HEAD
=======
=======
      inst = votedReclassifyExample(inst); 
      dataset.add(inst);
      dataset.delete(0);
    }  

    return dataset;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5674 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param args should contain arguments for the data producer:
=======
<<<<<<< HEAD
   * 
   * @param args should contain arguments for the data producer:
=======
   *
   * @param args should contain arguments for the data producer: 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    runDataGenerator(new RDG1(), args);
  }
}
