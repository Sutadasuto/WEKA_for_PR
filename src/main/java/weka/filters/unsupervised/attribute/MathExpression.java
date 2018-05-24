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
 *    MathExpression.java
 *    Copyright (C) 2004 Prados Julien
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.core.expressionlanguage.common.IfElseMacro;
import weka.core.expressionlanguage.common.JavaMacro;
import weka.core.expressionlanguage.common.MacroDeclarationsCompositor;
import weka.core.expressionlanguage.common.MathFunctions;
import weka.core.expressionlanguage.common.Primitives.DoubleExpression;
import weka.core.expressionlanguage.common.SimpleVariableDeclarations;
import weka.core.expressionlanguage.common.SimpleVariableDeclarations.VariableInitializer;
import weka.core.expressionlanguage.common.VariableDeclarationsCompositor;
import weka.core.expressionlanguage.core.Node;
import weka.core.expressionlanguage.parser.Parser;
import weka.core.expressionlanguage.weka.InstancesHelper;
import weka.core.expressionlanguage.weka.StatsHelper;
import weka.experiment.Stats;
import weka.filters.UnsupervisedFilter;

/**
 * <!-- globalinfo-start --> Modify numeric attributes according to a given
 * mathematical expression. Supported operators are +, -, *,
 * /, pow, log, abs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ), MEAN, MAX, MIN, SD, COUNT, SUM,
 * SUMSQUARED, ifelse. The 'A' letter refers to the value of the attribute being processed. Other attribute
 * values (numeric only) can be accessed through the variables A1, A2, A3, ...
 *
 * Example: pow(A,6)/(MEAN+MAX)*ifelse(A<0,0,sqrt(A))+ifelse(![A>9 && A<15])
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -unset-class-temporarily
 *  Unsets the class index temporarily before the filter is
 *  applied to the data.
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -E &lt;expression&gt;
 *  Specify the expression to apply.
 * </pre>
 * 
 * <pre>
 * -R &lt;index1,index2-index4,...&gt;
 *  Specify list of columns to ignore. First and last are valid
 *  indexes. (default none)
 * </pre>
 * 
 * <pre>
 * -V
 *  Invert matching sense (i.e. only modify specified columns)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Prados Julien (julien.prados@cui.unige.ch)
 * @version $Revision: 14534 $
 */
public class MathExpression extends PotentialClassIgnorer implements
  UnsupervisedFilter, WeightedInstancesHandler, WeightedAttributesHandler {

  /** for serialization */
  static final long serialVersionUID = -3713222714671997901L;

  /** Stores which columns to select as a funky range */
  protected Range m_SelectCols = new Range();

=======
import weka.core.AttributeStats;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.MathematicalExpression;
import weka.core.Option;
import weka.core.Range;
import weka.core.RevisionUtils;
import weka.core.SparseInstance;
import weka.core.Utils;
import weka.core.Capabilities.Capability;
import weka.core.mathematicalexpression.Parser;
import weka.core.mathematicalexpression.Scanner;
import java_cup.runtime.DefaultSymbolFactory;
import java_cup.runtime.SymbolFactory;
import weka.filters.UnsupervisedFilter;

import java.io.ByteArrayInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * Modify numeric attributes according to a given expression
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -unset-class-temporarily
 *  Unsets the class index temporarily before the filter is
 *  applied to the data.
 *  (default: no)</pre>
 * 
 * <pre> -E &lt;expression&gt;
 *  Specify the expression to apply. Eg. pow(A,6)/(MEAN+MAX)
 *  Supported operators are +, -, *, /, pow, log,
 *  abs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ), 
 *  MEAN, MAX, MIN, SD, COUNT, SUM, SUMSQUARED, ifelse</pre>
 * 
 * <pre> -R &lt;index1,index2-index4,...&gt;
 *  Specify list of columns to ignore. First and last are valid
 *  indexes. (default none)</pre>
 * 
 * <pre> -V
 *  Invert matching sense (i.e. only modify specified columns)</pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz) 
 * @author Prados Julien (julien.prados@cui.unige.ch) 
 * @version $Revision: 5543 $
 * @see MathematicalExpression
 */
public class MathExpression 
  extends PotentialClassIgnorer 
  implements UnsupervisedFilter {
  
  /** for serialization */
  static final long serialVersionUID = -3713222714671997901L;
  
  /** Stores which columns to select as a funky range */
  protected Range m_SelectCols = new Range();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The default modification expression */
  public static final String m_defaultExpression = "(A-MIN)/(MAX-MIN)";

  /** The modification expression */
  private String m_expression = m_defaultExpression;
  
<<<<<<< HEAD
  /** The compiled modification expression */
  private DoubleExpression m_CompiledExpression;

  /** Attributes statistics */
  private Stats[] m_attStats;

  /** InstancesHelpers for different indices */
  private InstancesHelper m_InstancesHelper;
  
  /** StatsHelpers for different indices */
  private StatsHelper m_StatsHelper;
  
  /** VariableInitializer for the current value 'A' in an expression */
  private VariableInitializer m_CurrentValue;

=======
  /** Attributes statistics */
  private AttributeStats[] m_attStats;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Constructor
   */
  public MathExpression() {
    super();
    setInvertSelection(false);
<<<<<<< HEAD
  }

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {

    return "Modify numeric attributes according to a given mathematical expression. Supported operators are +, -, *, " +
            "/, pow, log, abs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ), MEAN, MAX, MIN, SD, COUNT, SUM, " +
            "SUMSQUARED, ifelse. The 'A' letter refers to the value of the attribute being processed. Other attribute " +
            "values (numeric only) can be accessed through the variables A1, A2, A3, ... \n\nExample:" +
            "pow(A,6)/(MEAN+MAX)*ifelse(A<0,0,sqrt(A))+ifelse(![A>9 && A<15])";
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
  }  
  
  /**
   * Returns a string describing this filter
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {

    return "Modify numeric attributes according to a given expression ";
  }

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

    return result;
  }

  /**
   * Sets the format of the input instances.
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    m_SelectCols.setUpper(instanceInfo.numAttributes() - 1);
    super.setInputFormat(instanceInfo);
    setOutputFormat(instanceInfo);

    m_attStats = new Stats[instanceInfo.numAttributes()];
    
    for (int i = 0; i < instanceInfo.numAttributes(); i++) {
      if (m_SelectCols.isInRange(i)
          && instanceInfo.attribute(i).isNumeric()
          && (instanceInfo.classIndex() != i) || getIgnoreClass()) {
        
        m_attStats[i] = new Stats();
      }
    }
    
    if (instanceInfo != null)
      compile();

    return true;
  }
  
  /**
   * Compiles the expression
   * Requires that the input format is set and not null
   * 
   * @throws Exception if a compilation error occurs
   */
  private void compile() throws Exception {

    m_InstancesHelper = new InstancesHelper(getInputFormat());
    m_StatsHelper = new StatsHelper();
    SimpleVariableDeclarations currentValueDeclaration = new SimpleVariableDeclarations();
    currentValueDeclaration.addDouble("A");

    Node node = Parser.parse(
        // expression
        m_expression,
        // variables
        new VariableDeclarationsCompositor(
            m_InstancesHelper,
            m_StatsHelper,
            currentValueDeclaration
            ),
        // macros
        new MacroDeclarationsCompositor(
            m_InstancesHelper,
            new MathFunctions(),
            new IfElseMacro(),
            new JavaMacro()
            )
        );

    if (!(node instanceof DoubleExpression))
      throw new Exception("Expression must be of type double!");
    
    m_CurrentValue = currentValueDeclaration.getInitializer();

    m_CompiledExpression = (DoubleExpression) node;
    
  }

  /**
   * Input an instance for filtering. Filter requires all training instances be
   * read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input format has been set.
   */
  @Override
=======
    
    return result;
  }
  
  /**
   * Sets the format of the input instances.
   *
   * @param instanceInfo an Instances object containing the input 
   * instance structure (any instances contained in the object are 
   * ignored - only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set 
   * successfully
   */
  public boolean setInputFormat(Instances instanceInfo) 
       throws Exception {
    m_SelectCols.setUpper(instanceInfo.numAttributes() - 1);
    super.setInputFormat(instanceInfo);
    setOutputFormat(instanceInfo);
    m_attStats = null;
    return true;
  }

  /**
   * Input an instance for filtering. Filter requires all
   * training instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been set.
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
    if (!m_FirstBatchDone) {
      for (int i = 0; i < instance.numAttributes(); i++) {
        if (m_SelectCols.isInRange(i)
            && instance.attribute(i).isNumeric()
            && (getInputFormat().classIndex() != i)
            && (!instance.isMissing(i))) {

          m_attStats[i].add(instance.value(i), instance.weight());
        }
      }
     
=======
    if (m_attStats == null) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      bufferInput(instance);
      return false;
    } else {
      convertInstance(instance);
      return true;
    }
  }

  /**
<<<<<<< HEAD
   * Signify that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances.
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
=======
   * Signify that this batch of input to the filter is finished. 
   * If the filter requires all instances prior to filtering,
   * output() may now be called to retrieve the filtered instances.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean batchFinished() throws Exception {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
<<<<<<< HEAD
    if (!m_FirstBatchDone) {
      
      Instances input = getInputFormat();

      for (int i = 0; i < input.numAttributes(); i++) {
        if (m_SelectCols.isInRange(i)
            && input.attribute(i).isNumeric()
            && input.classIndex() != i) {

          m_attStats[i].calculateDerived();
        }
      }
      

      // Convert pending input instances
      for (int i = 0; i < input.numInstances(); i++) {
        convertInstance(input.instance(i));
      }
    }
=======
    if (m_attStats == null) {
      Instances input = getInputFormat();

      m_attStats = new AttributeStats [input.numAttributes()];
      
      for (int i = 0; i < input.numAttributes(); i++) {
	if (input.attribute(i).isNumeric() &&
	    (input.classIndex() != i)) {
	  m_attStats[i] = input.attributeStats(i);
	}
      }

      // Convert pending input instances
      for(int i = 0; i < input.numInstances(); i++) {
	convertInstance(input.instance(i));
      }
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // Free memory
    flushInput();

    m_NewBatch = true;
<<<<<<< HEAD
    m_FirstBatchDone = true;
    return (numPendingOutput() != 0);
  }

  /**
   * Convert a single instance over. The converted instance is added to the end
   * of the output queue.
   * 
=======
    return (numPendingOutput() != 0);
  }
  
  /**
   * Evaluates the symbols.
   * 
   * @param symbols 	the symbols to use for evaluation
   * @return		the calculated value, Double.NaN in case of an error
   */
  protected double eval(HashMap symbols) {
    SymbolFactory 		sf;
    ByteArrayInputStream 	parserInput;
    Parser 			parser;
    double			result;
    
    try {
      sf          = new DefaultSymbolFactory();
      parserInput = new ByteArrayInputStream(m_expression.getBytes());
      parser      = new Parser(new Scanner(parserInput, sf), sf);
      parser.setSymbols(symbols);
      parser.parse();
      result = parser.getResult();
    }
    catch (Exception e) {
      result = Double.NaN;
      e.printStackTrace();
    }
    
    return result;
  }
  
  /**
   * Convert a single instance over. The converted instance is 
   * added to the end of the output queue.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instance the instance to convert
   * @throws Exception if instance cannot be converted
   */
  private void convertInstance(Instance instance) throws Exception {
<<<<<<< HEAD

    double[] vals = instance.toDoubleArray();
    for (int i = 0; i < instance.numAttributes(); i++) {

      if (
          m_SelectCols.isInRange(i)
          && instance.attribute(i).isNumeric()
          && !Utils.isMissingValue(vals[i])
          && getInputFormat().classIndex() != i
          ) {

        // setup program
        m_InstancesHelper.setInstance(instance);
        m_StatsHelper.setStats(m_attStats[i]);
        if (m_CurrentValue.hasVariable("A"))
          m_CurrentValue.setDouble("A", vals[i]);

        // compute
        double value = m_CompiledExpression.evaluate();

        // set new value
        if (Double.isNaN(value) || Double.isInfinite(value) ||
            m_InstancesHelper.missingAccessed()) {
          System.err
          .println("WARNING:Error in evaluating the expression: missing value set");
          vals[i] = Utils.missingValue();
        } else {
          vals[i] = value;
        }

      }
    }

    Instance outInstance;
    if (instance instanceof SparseInstance) {
      outInstance = new SparseInstance(instance.weight(), vals);
    } else {
      outInstance = new DenseInstance(instance.weight(), vals);
    }
    outInstance.setDataset(instance.dataset());
    push(outInstance, false); // No need to copy instance
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -unset-class-temporarily
   *  Unsets the class index temporarily before the filter is
   *  applied to the data.
   *  (default: no)
   * </pre>
   * 
   * <pre>
   * -E &lt;expression&gt;
   *  Specify the expression to apply.
   * </pre>
   * 
   * <pre>
   * -R &lt;index1,index2-index4,...&gt;
   *  Specify list of columns to ignore. First and last are valid
   *  indexes. (default none)
   * </pre>
   * 
   * <pre>
   * -V
   *  Invert matching sense (i.e. only modify specified columns)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
=======
  
    Instance inst = null;
    HashMap symbols = new HashMap(5);
    if (instance instanceof SparseInstance) {
      double[] newVals = new double[instance.numAttributes()];
      int[] newIndices = new int[instance.numAttributes()];
      double[] vals = instance.toDoubleArray();
      int ind = 0;
      double value;
      for (int j = 0; j < instance.numAttributes(); j++) {
        if (m_SelectCols.isInRange(j)) {          
	  if (instance.attribute(j).isNumeric() &&
	    (!Instance.isMissingValue(vals[j])) &&
	    (getInputFormat().classIndex() != j)) {
              symbols.put("A", new Double(vals[j]));  
              symbols.put("MAX", new Double(m_attStats[j].numericStats.max));
              symbols.put("MIN", new Double(m_attStats[j].numericStats.min));
              symbols.put("MEAN", new Double(m_attStats[j].numericStats.mean));
              symbols.put("SD", new Double(m_attStats[j].numericStats.stdDev));
              symbols.put("COUNT", new Double(m_attStats[j].numericStats.count));
              symbols.put("SUM", new Double(m_attStats[j].numericStats.sum));
              symbols.put("SUMSQUARED", new Double(m_attStats[j].numericStats.sumSq));
              value = eval(symbols);
              if (Double.isNaN(value) || Double.isInfinite(value)) {
                  System.err.println("WARNING:Error in evaluating the expression: missing value set");
                  value = Instance.missingValue();
              }
	      if (value != 0.0) {
	        newVals[ind] = value;
	        newIndices[ind] = j;
	        ind++;
	      }
	      
	  }
        } else {
          value = vals[j];
          if (value != 0.0) {
            newVals[ind] = value;
            newIndices[ind] = j;
            ind++;
          }
        }
      }	
      double[] tempVals = new double[ind];
      int[] tempInd = new int[ind];
      System.arraycopy(newVals, 0, tempVals, 0, ind);
      System.arraycopy(newIndices, 0, tempInd, 0, ind);
      inst = new SparseInstance(instance.weight(), tempVals, tempInd,
                                instance.numAttributes());
    } else {
      double[] vals = instance.toDoubleArray();
      for (int j = 0; j < getInputFormat().numAttributes(); j++) {
        if (m_SelectCols.isInRange(j)) {
	  if (instance.attribute(j).isNumeric() &&
	      (!Instance.isMissingValue(vals[j])) &&
	      (getInputFormat().classIndex() != j)) {
              symbols.put("A", new Double(vals[j]));  
              symbols.put("MAX", new Double(m_attStats[j].numericStats.max));
              symbols.put("MIN", new Double(m_attStats[j].numericStats.min));
              symbols.put("MEAN", new Double(m_attStats[j].numericStats.mean));
              symbols.put("SD", new Double(m_attStats[j].numericStats.stdDev));
              symbols.put("COUNT", new Double(m_attStats[j].numericStats.count));
              symbols.put("SUM", new Double(m_attStats[j].numericStats.sum));
              symbols.put("SUMSQUARED", new Double(m_attStats[j].numericStats.sumSq));
              vals[j] = eval(symbols);
              if (Double.isNaN(vals[j]) || Double.isInfinite(vals[j])) {
                  System.err.println("WARNING:Error in Evaluation the Expression: missing value set");
                  vals[j] = Instance.missingValue();
              }
	  }
        }
      }
      inst = new Instance(instance.weight(), vals);
    }
    inst.setDataset(instance.dataset());
    push(inst);
  }

  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -unset-class-temporarily
   *  Unsets the class index temporarily before the filter is
   *  applied to the data.
   *  (default: no)</pre>
   * 
   * <pre> -E &lt;expression&gt;
   *  Specify the expression to apply. Eg. pow(A,6)/(MEAN+MAX)
   *  Supported operators are +, -, *, /, pow, log,
   *  abs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ), 
   *  MEAN, MAX, MIN, SD, COUNT, SUM, SUMSQUARED, ifelse</pre>
   * 
   * <pre> -R &lt;index1,index2-index4,...&gt;
   *  Specify list of columns to ignore. First and last are valid
   *  indexes. (default none)</pre>
   * 
   * <pre> -V
   *  Invert matching sense (i.e. only modify specified columns)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    super.setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    String expString = Utils.getOption('E', options);
    if (expString.length() != 0) {
      setExpression(expString);
    } else {
      setExpression(m_defaultExpression);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String ignoreList = Utils.getOption('R', options);
    if (ignoreList.length() != 0) {
      setIgnoreRange(ignoreList);
    }

    setInvertSelection(Utils.getFlag('V', options));
<<<<<<< HEAD

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
  }

  /**
   * Gets the current settings of the filter.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();

    result.add("-E");
    result.add(getExpression());

    if (getInvertSelection()) {
      result.add("-V");
    }
=======
  }
  
  /**
   * Gets the current settings of the filter.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {
    Vector        result;
    String[]      options;
    int           i;

    result = new Vector();

    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    result.add("-E");
    result.add(getExpression());
    
    if (getInvertSelection())
      result.add("-V");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (!getIgnoreRange().equals("")) {
      result.add("-R");
      result.add(getIgnoreRange());
    }

<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tSpecify the expression to apply. Eg. pow(A,6)/(MEAN+MAX)"
        + "\n\tSupported operators are +, -, *, /, pow, log,"
        + "\n\tabs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ), "
        + "\n\tMEAN, MAX, MIN, SD, COUNT, SUM, SUMSQUARED, ifelse. The 'A'"
        + "\n\tletter refers to the value of the attribute being processed."
        + "\n\tOther attribute values (numeric only) can be accessed through"
        + "\n\tthe variables A1, A2, A3, ...", "E", 1, "-E <expression>"));

    result
      .addElement(new Option(
        "\tSpecify list of columns to ignore. First and last are valid\n"
          + "\tindexes. (default none)", "R", 1,
        "-R <index1,index2-index4,...>"));

    result.addElement(new Option(
      "\tInvert matching sense (i.e. only modify specified columns)", "V", 0,
      "-V"));

    result.addAll(Collections.list(super.listOptions()));

    return result.elements();
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String expressionTipText() {
    return "Specify the expression to apply.";
  }

  /**
   * Set the expression to apply
   * 
   * @param expr a mathematical expression to apply
   * @throws Exception if the input format is set and there is a problem with the expression
   */
  public void setExpression(String expr) throws Exception {
    m_expression = expr;
    if (getInputFormat() != null)
      compile();
=======
    return (String[]) result.toArray(new String[result.size()]);
  }
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();
    Enumeration enm = super.listOptions();
    while (enm.hasMoreElements())
      result.add(enm.nextElement());
      
    result.addElement(new Option(
	"\tSpecify the expression to apply. Eg. pow(A,6)/(MEAN+MAX)"
	+"\n\tSupported operators are +, -, *, /, pow, log,"
	+"\n\tabs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ), "
	+"\n\tMEAN, MAX, MIN, SD, COUNT, SUM, SUMSQUARED, ifelse",
	"E",1,"-E <expression>"));
    
    result.addElement(new Option(
	"\tSpecify list of columns to ignore. First and last are valid\n"
	+"\tindexes. (default none)",
	"R", 1, "-R <index1,index2-index4,...>"));
    
    result.addElement(new Option(
	"\tInvert matching sense (i.e. only modify specified columns)",
	"V", 0, "-V"));
    
    return result.elements();
  }
  
  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String expressionTipText() {
    return "Specify the expression to apply. The 'A' letter"
             + "refers to the attribute value. MIN,MAX,MEAN,SD"
             + "refer respectively to minimum, maximum, mean and"
             + "standard deviation of the attribute."
	     +"\n\tSupported operators are +, -, *, /, pow, log,"
             +"abs, cos, exp, sqrt, tan, sin, ceil, floor, rint, (, ),"
             +"A,MEAN, MAX, MIN, SD, COUNT, SUM, SUMSQUARED, ifelse"
             +"\n\tEg. pow(A,6)/(MEAN+MAX)*ifelse(A<0,0,sqrt(A))+ifelse(![A>9 && A<15])";
  }
  
  /**
   * Set the expression to apply
   * @param expr a mathematical expression to apply
   */
  public void setExpression(String expr) {
    m_expression = expr;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
    return m_expression;
  }
<<<<<<< HEAD

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
    /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String invertSelectionTipText() {

    return "Determines whether action is to select or unselect."
      + " If set to true, only the specified attributes will be modified;"
      + " If set to false, specified attributes will not be modified.";
  }

  /**
   * Get whether the supplied columns are to be select or unselect
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if the supplied columns will be kept
   */
  public boolean getInvertSelection() {

    return !m_SelectCols.getInvert();
  }

  /**
<<<<<<< HEAD
   * Set whether selected columns should be select or unselect. If true the
   * selected columns are modified. If false the selected columns are not
   * modified.
   * 
=======
   * Set whether selected columns should be select or unselect. If true the 
   * selected columns are modified. If false the selected columns are not
   * modified.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param invert the new invert setting
   */
  public void setInvertSelection(boolean invert) {

    m_SelectCols.setInvert(!invert);
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String ignoreRangeTipText() {

    return "Specify range of attributes to ignore."
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String ignoreRangeTipText() {

    return "Specify range of attributes to act on."
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + " This is a comma separated list of attribute indices, with"
      + " \"first\" and \"last\" valid values. Specify an inclusive"
      + " range with \"-\". E.g: \"first-3,5,6-10,last\".";
  }

  /**
   * Get the current range selection.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a string containing a comma separated list of ranges
   */
  public String getIgnoreRange() {

    return m_SelectCols.getRanges();
  }

  /**
   * Set which attributes are to be ignored
<<<<<<< HEAD
   * 
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br/>
   *          eg: first-3,5,6-last
=======
   *
   * @param rangeList a string representing the list of attributes.  Since
   * the string will typically come from a user, attributes are indexed from
   * 1. <br/>
   * eg: first-3,5,6-last
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setIgnoreRange(String rangeList) {

    m_SelectCols.setRanges(rangeList);
  }
<<<<<<< HEAD

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
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
=======
  
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
   * @param argv should contain arguments to the filter: 
   * use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new MathExpression(), argv);
  }
}
