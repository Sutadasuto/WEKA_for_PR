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
 *    AddExpression.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.core.expressionlanguage.common.IfElseMacro;
import weka.core.expressionlanguage.common.JavaMacro;
import weka.core.expressionlanguage.common.MacroDeclarationsCompositor;
import weka.core.expressionlanguage.common.MathFunctions;
import weka.core.expressionlanguage.common.Primitives.DoubleExpression;
import weka.core.expressionlanguage.core.Node;
import weka.core.expressionlanguage.parser.Parser;
import weka.core.expressionlanguage.weka.InstancesHelper;
=======
import weka.core.Attribute;
import weka.core.AttributeExpression;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SparseInstance;
import weka.core.Utils;
import weka.core.Capabilities.Capability;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> An instance filter that creates a new attribute by
 * applying a mathematical expression to existing attributes. The expression can
 * contain attribute references and numeric constants. Supported operators are :<br/>
 * +, -, *, /, ^, log, abs, cos, exp, sqrt, floor, ceil, rint, tan, sin, (, )<br/>
 * Attributes are specified by prefixing with 'a', eg. a7 is attribute number 7
 * (starting from 1).<br/>
 * Example expression : a1^2*a5/log(a7*4.0).
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -E &lt;expression&gt;
 *  Specify the expression to apply. Eg a1^2*a5/log(a7*4.0).
 *  Supported opperators: ,+, -, *, /, ^, log, abs, cos, 
 *  exp, sqrt, floor, ceil, rint, tan, sin, (, )
 *  (default: 0.0)
 * </pre>
 * 
 * <pre>
 * -N &lt;name&gt;
 *  Specify the name for the new attribute. (default is the expression provided with -E)
 * </pre>
 * 
 * <pre>
 * -D
 *  Debug. Names attribute with the postfix parse of the expression.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class AddExpression extends Filter implements UnsupervisedFilter,
  StreamableFilter, OptionHandler, WeightedInstancesHandler, WeightedAttributesHandler {

  /** for serialization */
  static final long serialVersionUID = 402130384261736245L;

  /** The infix expression */
  private String m_infixExpression = "0.0";

  /**
   * Name of the new attribute. "expression" length string will use the provided
   * expression as the new attribute name
   */
  private String m_attributeName = "expression";

  /**
   * If true, makes the attribute name equal to the postfix parse of the
   * expression
   */
  private boolean m_Debug = false;

  private DoubleExpression m_Expression = null;

  private InstancesHelper m_InstancesHelper;

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "An instance filter that creates a new attribute by applying a "
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * An instance filter that creates a new attribute by applying a mathematical expression to existing attributes. The expression can contain attribute references and numeric constants. Supported operators are :<br/>
 * +, -, *, /, ^, log, abs, cos, exp, sqrt, floor, ceil, rint, tan, sin, (, )<br/>
 * Attributes are specified by prefixing with 'a', eg. a7 is attribute number 7 (starting from 1).<br/>
 * Example expression : a1^2*a5/log(a7*4.0).
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -E &lt;expression&gt;
 *  Specify the expression to apply. Eg a1^2*a5/log(a7*4.0).
 *  Supported opperators: ,+, -, *, /, ^, log, abs, cos, 
 *  exp, sqrt, floor, ceil, rint, tan, sin, (, )
 *  (default: a1^2)</pre>
 * 
 * <pre> -N &lt;name&gt;
 *  Specify the name for the new attribute. (default is the expression provided with -E)</pre>
 * 
 * <pre> -D
 *  Debug. Names attribute with the postfix parse of the expression.</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 5543 $
 */
public class AddExpression 
  extends Filter 
  implements UnsupervisedFilter, StreamableFilter, OptionHandler {

  /** for serialization */
  static final long serialVersionUID = 402130384261736245L;
  
  /** The infix expression */
  private String m_infixExpression = "a1^2";

  /** Name of the new attribute. "expression"  length string will use the 
      provided expression as the new attribute name */
  private String m_attributeName="expression";

  /** If true, makes the attribute name equal to the postfix parse of the
      expression */
  private boolean m_Debug = false;

  private AttributeExpression m_attributeExpression = null;

  /**
   * Returns a string describing this filter
   *
   * @return 		a description of the filter suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "An instance filter that creates a new attribute by applying a "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "mathematical expression to existing attributes. The expression "
      + "can contain attribute references and numeric constants. Supported "
      + "operators are :\n"
      + "+, -, *, /, ^, log, abs, cos, exp, sqrt, floor, ceil, rint, tan, "
      + "sin, (, )\n"
      + "Attributes are specified by prefixing with 'a', eg. a7 is "
      + "attribute number 7 (starting from 1).\n"
      + "Example expression : a1^2*a5/log(a7*4.0).";
  }
<<<<<<< HEAD

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(3);

    newVector.addElement(new Option(
      "\tSpecify the expression to apply. Eg a1^2*a5/log(a7*4.0)."
        + "\n\tSupported opperators: ,+, -, *, /, ^, log, abs, cos, "
        + "\n\texp, sqrt, floor, ceil, rint, tan, sin, (, )"
        + "\n\t(default: a1^2)", "E", 1, "-E <expression>"));

    newVector.addElement(new Option(
      "\tSpecify the name for the new attribute. (default is the "
        + "expression provided with -E)", "N", 1, "-N <name>"));

    newVector
      .addElement(new Option(
        "\tDebug. Names attribute with the postfix parse of the "
          + "expression.", "D", 0, "-D"));
=======
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {

    Vector newVector = new Vector(3); 

    newVector.addElement(new Option(
	     "\tSpecify the expression to apply. Eg a1^2*a5/log(a7*4.0)."
	     +"\n\tSupported opperators: ,+, -, *, /, ^, log, abs, cos, "
	     +"\n\texp, sqrt, floor, ceil, rint, tan, sin, (, )"
	     +"\n\t(default: a1^2)",
	     "E",1,"-E <expression>"));

    newVector.addElement(new Option(
	     "\tSpecify the name for the new attribute. (default is the "
	     +"expression provided with -E)",
	     "N",1,"-N <name>"));

    newVector.addElement(new Option(
	     "\tDebug. Names attribute with the postfix parse of the "
	     +"expression.","D",0,"-D"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newVector.elements();
  }

  /**
<<<<<<< HEAD
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -E &lt;expression&gt;
   *  Specify the expression to apply. Eg a1^2*a5/log(a7*4.0).
   *  Supported opperators: ,+, -, *, /, ^, log, abs, cos, 
   *  exp, sqrt, floor, ceil, rint, tan, sin, (, )
   *  (default: a1^2)
   * </pre>
   * 
   * <pre>
   * -N &lt;name&gt;
   *  Specify the name for the new attribute. (default is the expression provided with -E)
   * </pre>
   * 
   * <pre>
   * -D
   *  Debug. Names attribute with the postfix parse of the expression.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -E &lt;expression&gt;
   *  Specify the expression to apply. Eg a1^2*a5/log(a7*4.0).
   *  Supported opperators: ,+, -, *, /, ^, log, abs, cos, 
   *  exp, sqrt, floor, ceil, rint, tan, sin, (, )
   *  (default: a1^2)</pre>
   * 
   * <pre> -N &lt;name&gt;
   *  Specify the name for the new attribute. (default is the expression provided with -E)</pre>
   * 
   * <pre> -D
   *  Debug. Names attribute with the postfix parse of the expression.</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {
    String expString = Utils.getOption('E', options);
    if (expString.length() != 0) {
      setExpression(expString);
    } else {
      setExpression("a1^2");
    }

<<<<<<< HEAD
    String name = Utils.getOption('N', options);
=======
    String name = Utils.getOption('N',options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (name.length() != 0) {
      setName(name);
    }

    setDebug(Utils.getFlag('D', options));
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
  }

  /**
   * Gets the current settings of the filter.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    options.add("-E");
    options.add(getExpression());
    options.add("-N");
    options.add(getName());

    if (getDebug()) {
      options.add("-D");
    }

    return options.toArray(new String[0]);
=======
  }
  
  /**
   * Gets the current settings of the filter.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] options = new String [5];
    int current = 0;
    
    options[current++] = "-E"; options[current++] = getExpression();
    options[current++] = "-N"; options[current++] = getName();

    if (getDebug()) {
      options[current++] = "-D";
    }
    
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String nameTipText() {
    return "Set the name of the new attribute.";
  }

  /**
<<<<<<< HEAD
   * Set the name for the new attribute. The string "expression" can be used to
   * make the name of the new attribute equal to the expression provided.
   * 
=======
   * Set the name for the new attribute. The string "expression" can
   * be used to make the name of the new attribute equal to the expression
   * provided.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param name the name of the new attribute
   */
  public void setName(String name) {
    m_attributeName = name;
  }

  /**
   * Returns the name of the new attribute
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the name of the new attribute
   */
  public String getName() {
    return m_attributeName;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String debugTipText() {
    return "Set debug mode. If true then the new attribute will be named with "
      + "the postfix parse of the supplied expression.";
  }

  /**
   * Set debug mode. Causes the new attribute to be named with the postfix parse
   * of the expression
   * 
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String debugTipText() {
    return "Set debug mode. If true then the new attribute will be named with "
      +"the postfix parse of the supplied expression.";
  }
  
  /**
   * Set debug mode. Causes the new attribute to be named with the postfix
   * parse of the expression
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param d true if debug mode is to be used
   */
  public void setDebug(boolean d) {
    m_Debug = d;
  }

  /**
   * Gets whether debug is set
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if debug is set
   */
  public boolean getDebug() {
    return m_Debug;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String expressionTipText() {
    return "Set the math expression to apply. Eg. a1^2*a5/log(a7*4.0)";
  }

  /**
   * Set the expression to apply
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param expr a mathematical expression to apply
   */
  public void setExpression(String expr) {
    m_infixExpression = expr;
  }

  /**
   * Get the expression
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the expression
   */
  public String getExpression() {
    return m_infixExpression;
  }

<<<<<<< HEAD
  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // class
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Sets the format of the input instances.
<<<<<<< HEAD
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    m_InstancesHelper = new InstancesHelper(instanceInfo);
    Node node = Parser.parse(
        // expressions string
        m_infixExpression,
        // variables
        m_InstancesHelper,
        // macros
        new MacroDeclarationsCompositor(
            m_InstancesHelper,
            new MathFunctions(),
            new IfElseMacro(),
            new JavaMacro()
            )
        );
    
    if (!(node instanceof DoubleExpression))
      throw new Exception("Expression must be of double type!");
    
    m_Expression = (DoubleExpression) node;
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the format couldn't be set successfully
   */
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    m_attributeExpression = new AttributeExpression();
    m_attributeExpression.
      convertInfixToPostfix(new String(m_infixExpression));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    super.setInputFormat(instanceInfo);

    Instances outputFormat = new Instances(instanceInfo, 0);
    Attribute newAttribute;
<<<<<<< HEAD
    if (m_attributeName.compareTo("expression") != 0) {
=======
    if (m_Debug) {
      newAttribute = 
        new Attribute(m_attributeExpression.getPostFixExpression());
    } else if (m_attributeName.compareTo("expression") != 0) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      newAttribute = new Attribute(m_attributeName);
    } else {
      newAttribute = new Attribute(m_infixExpression);
    }
<<<<<<< HEAD
    outputFormat.insertAttributeAt(newAttribute, instanceInfo.numAttributes());
=======
    outputFormat.insertAttributeAt(newAttribute, 
				   instanceInfo.numAttributes());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setOutputFormat(outputFormat);
    return true;
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering. Ordinarily the instance is processed and
   * made available for output immediately. Some filters require all instances
   * be read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input format has been defined.
   * @throws Exception if there was a problem during the filtering.
   */
  @Override
=======
   * Input an instance for filtering. Ordinarily the instance is processed
   * and made available for output immediately. Some filters require all
   * instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been defined.
   * @throws Exception if there was a problem during the filtering.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean input(Instance instance) throws Exception {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }

<<<<<<< HEAD
    double[] vals = new double[instance.numAttributes() + 1];
    System.arraycopy(instance.toDoubleArray(), 0, vals, 0, instance.numAttributes());

    m_InstancesHelper.setInstance(instance);
    vals[vals.length - 1] = m_Expression.evaluate();
    if (m_InstancesHelper.missingAccessed())
      vals[vals.length - 1] = Utils.missingValue();
=======
    double[] vals = new double[instance.numAttributes()+1];
    for(int i = 0; i < instance.numAttributes(); i++) {
      if (instance.isMissing(i)) {
	vals[i] = Instance.missingValue();
      } else {
	vals[i] = instance.value(i);
      }
    }

    m_attributeExpression.evaluateExpression(vals);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    Instance inst = null;
    if (instance instanceof SparseInstance) {
      inst = new SparseInstance(instance.weight(), vals);
    } else {
<<<<<<< HEAD
      inst = new DenseInstance(instance.weight(), vals);
    }

    copyValues(inst, false, instance.dataset(), outputFormatPeek());

    push(inst); // No need to copy instance
    return true;
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

  /**
   * Main method for testing this class.
   * 
   * @param args should contain arguments to the filter: use -h for help
   */
  public static void main(String[] args) {
=======
      inst = new Instance(instance.weight(), vals);
    }

    inst.setDataset(getOutputFormat());
    copyValues(inst, false, instance.dataset(), getOutputFormat());
    inst.setDataset(getOutputFormat());
    push(inst);
    return true;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5543 $");
  }
  
  /**
   * Main method for testing this class.
   *
   * @param args should contain arguments to the filter: use -h for help
   */
  public static void main(String [] args) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new AddExpression(), args);
  }
}
