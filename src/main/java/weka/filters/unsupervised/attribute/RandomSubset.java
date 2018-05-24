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
 * RandomSubset.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.Capabilities.Capability;
import weka.filters.SimpleStreamFilter;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

<<<<<<< HEAD
import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.filters.SimpleStreamFilter;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 <!-- globalinfo-start -->
 * Chooses a random subset of attributes, either an absolute number or a percentage. The class is always included in the output (as the last attribute).
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
<<<<<<< HEAD
=======
 * <pre> -D
 *  Turns on output of debugging information.</pre>
 * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre> -N &lt;double&gt;
 *  The number of attributes to randomly select.
 *  If &lt; 1 then percentage, &gt;= 1 absolute number.
 *  (default: 0.5)</pre>
 * 
<<<<<<< HEAD
 * <pre> -V
 *  Invert selection - i.e. randomly remove rather than select.</pre>
 * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre> -S &lt;int&gt;
 *  The seed value.
 *  (default: 1)</pre>
 * 
<<<<<<< HEAD
 * <pre> -output-debug-info
 *  If set, filter is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 * <pre> -do-not-check-capabilities
 *  If set, filter capabilities are not checked before filter is built
 *  (use with caution).</pre>
 * 
 <!-- options-end -->
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @author eibe@cs.waikato.ac.nz
 * @version $Revision: 14534 $
 */
public class RandomSubset extends SimpleStreamFilter
        implements Randomizable, WeightedInstancesHandler, WeightedAttributesHandler {
=======
 <!-- options-end -->
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 5547 $
 */
public class RandomSubset
  extends SimpleStreamFilter {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization. */
  private static final long serialVersionUID = 2911221724251628050L;

<<<<<<< HEAD
  /**
   * The number of attributes to randomly choose (&gt;= 1 absolute number of
   * attributes, &lt; 1 percentage).
   */
  protected double m_NumAttributes = 0.5;

  /** The seed value. */
  protected int m_Seed = 1;

  /** The indices of the attributes that got selected. */
  protected int[] m_Indices = null;

  /** Whether to randomly remove rather than select */
  protected boolean m_invertSelection;

  /**
   * Returns a string describing this filter.
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String globalInfo() {
    return "Chooses a random subset of attributes, either an absolute number "
=======
  /** The number of attributes to randomly choose (&gt;= 1 absolute number of
   * attributes, &lt; 1 percentage). */
  protected double m_NumAttributes = 0.5;
  
  /** The seed value. */
  protected int m_Seed = 1;
  
  /** The indices of the attributes that got selected. */
  protected int[] m_Indices = null;
  
  /**
   * Returns a string describing this filter.
   *
   * @return 		a description of the filter suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "Chooses a random subset of attributes, either an absolute number "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "or a percentage. The class is always included in the output ("
      + "as the last attribute).";
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tThe number of attributes to randomly select.\n"
        + "\tIf < 1 then percentage, >= 1 absolute number.\n"
        + "\t(default: 0.5)", "N", 1, "-N <double>"));

    result.addElement(new Option(
      "\tInvert selection - i.e. randomly remove rather than select.", "V", 0,
      "-V"));

    result.addElement(new Option("\tThe seed value.\n" + "\t(default: 1)", "S",
      1, "-S <int>"));

    result.addAll(Collections.list(super.listOptions()));

    return result.elements();
  }

  /**
   * Gets the current settings of the filter.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();

    result.add("-N");
    result.add("" + m_NumAttributes);

    if (getInvertSelection()) {
      result.add("-V");
    }

    result.add("-S");
    result.add("" + m_Seed);

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector        result;
    Enumeration   enm;

    result = new Vector();

    enm = super.listOptions();
    while (enm.hasMoreElements())
      result.addElement(enm.nextElement());

    result.addElement(new Option(
	"\tThe number of attributes to randomly select.\n"
	+ "\tIf < 1 then percentage, >= 1 absolute number.\n"
	+ "\t(default: 0.5)",
	"N", 1, "-N <double>"));
    
    result.addElement(new Option(
	"\tThe seed value.\n"
	+ "\t(default: 1)",
	"S", 1, "-S <int>"));

    return result.elements();
  }	  

  /**
   * Gets the current settings of the filter.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    int			i;
    Vector<String>	result;
    String[]		options;

    result  = new Vector<String>();
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    result.add("-N"); 
    result.add("" + m_NumAttributes);

    result.add("-S"); 
    result.add("" + m_Seed);

    return result.toArray(new String[result.size()]);	  
  }	  

  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Turns on output of debugging information.</pre>
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre> -N &lt;double&gt;
   *  The number of attributes to randomly select.
   *  If &lt; 1 then percentage, &gt;= 1 absolute number.
   *  (default: 0.5)</pre>
   * 
<<<<<<< HEAD
   * <pre> -V
   *  Invert selection - i.e. randomly remove rather than select.</pre>
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre> -S &lt;int&gt;
   *  The seed value.
   *  (default: 1)</pre>
   * 
<<<<<<< HEAD
   * <pre> -output-debug-info
   *  If set, filter is run in debug mode and
   *  may output additional info to the console</pre>
   * 
   * <pre> -do-not-check-capabilities
   *  If set, filter capabilities are not checked before filter is built
   *  (use with caution).</pre>
   * 
   <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption("N", options);
    if (tmpStr.length() != 0) {
      setNumAttributes(Double.parseDouble(tmpStr));
    } else {
      setNumAttributes(0.5);
    }

    setInvertSelection(Utils.getFlag('V', options));

    tmpStr = Utils.getOption("S", options);
    if (tmpStr.length() != 0) {
      setSeed(Integer.parseInt(tmpStr));
    } else {
      setSeed(1);
    }

    super.setOptions(options);
  }
=======
   <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported 
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;

    tmpStr = Utils.getOption("N", options);
    if (tmpStr.length() != 0)
      setNumAttributes(Double.parseDouble(tmpStr));
    else
      setNumAttributes(0.5);
    
    tmpStr = Utils.getOption("S", options);
    if (tmpStr.length() != 0)
      setSeed(Integer.parseInt(tmpStr));
    else
      setSeed(1);
    
    super.setOptions(options);
  }	  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Returns the tip text for this property.
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String numAttributesTipText() {
    return "The number of attributes to choose: < 1 percentage, >= 1 absolute number.";
  }

  /**
   * Get the number of attributes (&lt; 1 percentage, &gt;= 1 absolute number).
<<<<<<< HEAD
   * 
   * @return the number of attributes.
=======
   *
   * @return 		the number of attributes.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double getNumAttributes() {
    return m_NumAttributes;
  }

  /**
<<<<<<< HEAD
   * Set the number of attributes.
   * 
   * @param value the number of attributes to use.
=======
   * Set the number of attributes. 
   *
   * @param value	the number of attributes to use.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setNumAttributes(double value) {
    m_NumAttributes = value;
  }

  /**
   * Returns the tip text for this property.
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String invertSelectionTipText() {
    return "Randomly remove rather than select attributes.";
  }

  /**
   * Set whether to invert the selection - i.e. randomly remove rather than
   * select attributes.
   * 
   * @param inv true if the selection should be inverted
   */
  public void setInvertSelection(boolean inv) {
    m_invertSelection = inv;
  }

  /**
   * Get whether to invert the selection - i.e. randomly remove rather than
   * select attributes.
   * 
   * @return true if the selection should be inverted
   */
  public boolean getInvertSelection() {
    return m_invertSelection;
  }

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String seedTipText() {
    return "The seed value for the random number generator.";
  }

  /**
   * Get the seed value for the random number generator.
<<<<<<< HEAD
   * 
   * @return the seed value.
=======
   *
   * @return 		the seed value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getSeed() {
    return m_Seed;
  }

  /**
<<<<<<< HEAD
   * Set the seed value for the random number generator.
   * 
   * @param value the seed value.
=======
   * Set the seed value for the random number generator. 
   *
   * @param value	the seed value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setSeed(int value) {
    m_Seed = value;
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
<<<<<<< HEAD
   * Determines the output format based on the input format and returns this. In
   * case the output format cannot be returned immediately, i.e.,
   * hasImmediateOutputFormat() returns false, then this method will called from
   * batchFinished() after the call of preprocess(Instances), in which, e.g.,
   * statistics for the actual processing step can be gathered.
   * 
   * @param inputFormat the input format to base the output format on
   * @return the output format
   * @throws Exception in case the determination goes wrong
   */
  @Override
  protected Instances determineOutputFormat(Instances inputFormat)
    throws Exception {
    Instances result;
    ArrayList<Attribute> atts;
    int i;
    int numAtts;
    Vector<Integer> indices;
    Vector<Integer> subset;
    Random rand;
    int index;

    // determine the number of attributes
    numAtts = inputFormat.numAttributes();
    if (inputFormat.classIndex() > -1) {
      numAtts--;
    }

    if (m_NumAttributes < 1) {
      numAtts = (int) Math.round(numAtts * m_NumAttributes);
    } else {
      if (m_NumAttributes < numAtts) {
        numAtts = (int) m_NumAttributes;
      }
    }
    if (getDebug()) {
      System.out.println("# of atts: " + numAtts);
    }

    // determine random indices
    indices = new Vector<Integer>();
    for (i = 0; i < inputFormat.numAttributes(); i++) {
      if (i == inputFormat.classIndex()) {
        continue;
      }
      indices.add(i);
    }

    subset = new Vector<Integer>();
    rand = new Random(m_Seed);
=======
   * Determines the output format based on the input format and returns 
   * this. In case the output format cannot be returned immediately, i.e.,
   * hasImmediateOutputFormat() returns false, then this method will called
   * from batchFinished() after the call of preprocess(Instances), in which,
   * e.g., statistics for the actual processing step can be gathered.
   *
   * @param inputFormat     the input format to base the output format on
   * @return                the output format
   * @throws Exception      in case the determination goes wrong
   */
  protected Instances determineOutputFormat(Instances inputFormat) throws Exception {
    Instances		result;
    FastVector		atts;
    int			i;
    int			numAtts;
    Vector<Integer>	indices;
    Vector<Integer>	subset;
    Random		rand;
    int			index;
 
    // determine the number of attributes
    numAtts = inputFormat.numAttributes();
    if (inputFormat.classIndex() > -1)
      numAtts--;
    
    if (m_NumAttributes < 1) {
      numAtts = (int) Math.round((double) numAtts * m_NumAttributes);
    }
    else {
      if (m_NumAttributes < numAtts)
	numAtts = (int) m_NumAttributes;
    }
    if (getDebug())
      System.out.println("# of atts: " + numAtts);
    
    // determine random indices
    indices = new Vector<Integer>();
    for (i = 0; i < inputFormat.numAttributes(); i++) {
      if (i == inputFormat.classIndex())
	continue;
      indices.add(i);
    }
    
    subset = new Vector<Integer>();
    rand   = new Random(m_Seed);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (i = 0; i < numAtts; i++) {
      index = rand.nextInt(indices.size());
      subset.add(indices.get(index));
      indices.remove(index);
    }
<<<<<<< HEAD

    if (m_invertSelection) {
      subset = indices;
    }

    Collections.sort(subset);
    if (inputFormat.classIndex() > -1) {
      subset.add(inputFormat.classIndex());
    }
    if (getDebug()) {
      System.out.println("indices: " + subset);
    }

    // generate output format
    atts = new ArrayList<Attribute>();
    m_Indices = new int[subset.size()];
    for (i = 0; i < subset.size(); i++) {
      atts.add((Attribute)inputFormat.attribute(subset.get(i)).copy());
      m_Indices[i] = subset.get(i);
    }
    result = new Instances(inputFormat.relationName(), atts, 0);
    if (inputFormat.classIndex() > -1) {
      result.setClassIndex(result.numAttributes() - 1);
    }
=======
    Collections.sort(subset);
    if (inputFormat.classIndex() > -1)
      subset.add(inputFormat.classIndex());
    if (getDebug())
      System.out.println("indices: " + subset);
    
    // generate output format
    atts      = new FastVector();
    m_Indices = new int[subset.size()];
    for (i = 0; i < subset.size(); i++) {
      atts.addElement(inputFormat.attribute(subset.get(i)));
      m_Indices[i] = subset.get(i);
    }
    result = new Instances(inputFormat.relationName(), atts, 0);
    if (inputFormat.classIndex() > -1)
      result.setClassIndex(result.numAttributes() - 1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result;
  }

  /**
<<<<<<< HEAD
   * processes the given instance (may change the provided instance) and returns
   * the modified version.
   * 
   * @param instance the instance to process
   * @return the modified data
   * @throws Exception in case the processing goes wrong
   */
  @Override
  protected Instance process(Instance instance) throws Exception {
    Instance result;

    if (instance instanceof SparseInstance) {
      int n1 = instance.numValues();
      int classIndex = getInputFormat().classIndex();
      int n2 = classIndex >= 0 ? m_Indices.length : m_Indices.length - 1;
      int[] indices = new int[instance.numValues()];
      double[] values = new double[instance.numValues()];
      int vals = 0;
      double classValue = 0;
      boolean classFound = false;
      for (int p1 = 0, p2 = 0; p1 < n1 && p2 < n2;) {
        int ind1 = instance.index(p1);
        int ind2 = m_Indices[p2];
        if (ind1 == classIndex) {
          classFound = true;
          classValue = instance.valueSparse(p1);
          p1++;
        } else if (ind1 == ind2) {
          indices[vals] = p2;
          values[vals] = instance.valueSparse(p1);
          vals++;
          p1++;
          p2++;
        } else if (ind1 > ind2) {
          p2++;
        } else {
          p1++;
        }
      }
      if (classFound) {
        indices[vals] = outputFormatPeek().numAttributes() - 1;
        values[vals] = classValue;
      }
      result = new SparseInstance(instance.weight(), values, indices, m_Indices.length);
    } else {
      double[] values = new double[m_Indices.length];
      for (int i = 0; i < m_Indices.length; i++) {
        values[i] = instance.value(m_Indices[i]);
      }
      result = new DenseInstance(instance.weight(), values);
    }

    copyValues(result, false, instance.dataset(), outputFormatPeek());

    return result;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
=======
   * processes the given instance (may change the provided instance) and
   * returns the modified version.
   *
   * @param instance    the instance to process
   * @return            the modified data
   * @throws Exception  in case the processing goes wrong
   */
  protected Instance process(Instance instance) throws Exception {
    Instance	result;
    double[]	values;
    int		i;
    
    values = new double[m_Indices.length];
    for (i = 0; i < m_Indices.length; i++)
      values[i] = instance.value(m_Indices[i]);

    result = new Instance(instance.weight(), values);
    result.setDataset(getOutputFormat());
    
    copyValues(result, false, instance.dataset(), getOutputFormat());
    result.setDataset(getOutputFormat());
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5547 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Runs the filter with the given parameters. Use -h to list options.
   * 
<<<<<<< HEAD
   * @param args the commandline options
=======
   * @param args	the commandline options
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static void main(String[] args) {
    runFilter(new RandomSubset(), args);
  }
}
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
