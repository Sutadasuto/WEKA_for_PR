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
 * Reorder.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters.unsupervised.attribute;

import java.util.*;

import weka.core.*;
<<<<<<< HEAD
=======
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.filters.unsupervised.attribute;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Range;
import weka.core.RevisionUtils;
import weka.core.SparseInstance;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * <!-- globalinfo-start --> A filter that generates output with a new order of
 * the attributes. Useful if one wants to move an attribute to the end of the list of attributes to use it
 * as class attribute (e.g., using "-R 2-last,1").<br/><br/>
 * It is not only possible to change the order of the attributes. Attributes can also be left out.
 * E.g. if you have 10 attributes, you can
 * generate the following output order: 1,3,5,7,9,10 or 10,1-5.<br/><br/>
 * You can also duplicate attributes, e.g., for further processing later on: e.g., using
 * 1,1,1,4,4,4,2,2,2 if one needs to process two copies of the attributes with other filters but also
 * needs to keep the original attributes.<br/><br/>
 * One can simply reverse the order of the attributes via 'last-first'.<br/><br/>
 * After applying the filter, the index of the class attribute is set to the index of the last
 * attribute.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -R &lt;index1,index2-index4,...&gt;
 *  Specifies the order of the attributes (default first-last).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14606 $
 */
public class Reorder extends Filter implements UnsupervisedFilter,
  StreamableFilter, OptionHandler, WeightedAttributesHandler, WeightedInstancesHandler {

<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * A filter that generates output with a new order of the attributes. Useful if one wants to move an attribute to the end to use it as class attribute (e.g. with using "-R 2-last,1").<br/>
 * But it's not only possible to change the order of all the attributes, but also to leave out attributes. E.g. if you have 10 attributes, you can generate the following output order: 1,3,5,7,9,10 or 10,1-5.<br/>
 * You can also duplicate attributes, e.g. for further processing later on: e.g. 1,1,1,4,4,4,2,2,2 where the second and the third column of each attribute are processed differently and the first one, i.e. the original one is kept.<br/>
 * One can simply inverse the order of the attributes via 'last-first'.<br/>
 * After appyling the filter, the index of the class attribute is the last attribute.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -R &lt;index1,index2-index4,...&gt;
 *  Specify list of columns to copy. First and last are valid
 *  indexes. (default first-last)</pre>
 * 
 <!-- options-end -->
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 6249 $
 */
public class Reorder 
  extends Filter 
  implements UnsupervisedFilter, StreamableFilter, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -1135571321097202292L;

  /** Stores which columns to reorder */
  protected String m_NewOrderCols = "first-last";

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Stores the indexes of the selected attributes in order, once the dataset is
   * seen
   */
  protected int[] m_SelectedAttributes;

  /**
   * Contains an index of string attributes in the input format that survive the
   * filtering process -- some entries may be duplicated
<<<<<<< HEAD
=======
=======
   * Stores the indexes of the selected attributes in order, once the
   * dataset is seen
   */
  protected int[] m_SelectedAttributes;

  /** 
   * Contains an index of string attributes in the input format
   * that survive the filtering process -- some entries may be duplicated 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected int[] m_InputStringIndex;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Whether to set all attribute weights to 1.0 in the reordered data.
   */
  protected boolean m_setAllAttributeWeightsToOne;

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>();

    newVector.addElement(new Option(
      "\tSpecifies the order of the attributes (default first-last).", "R", 1,
      "-R <index1,index2-index4,...>"));
<<<<<<< HEAD
=======
=======
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector newVector = new Vector();

    newVector.addElement(new Option(
              "\tSpecify list of columns to copy. First and last are valid\n"
	      +"\tindexes. (default first-last)",
              "R", 1, "-R <index1,index2-index4,...>"));
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
   * -R &lt;index1,index2-index4,...&gt;
   *  Specifies the order of the attributes (default first-last).
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -R &lt;index1,index2-index4,...&gt;
   *  Specify list of columns to copy. First and last are valid
   *  indexes. (default first-last)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String orderList = Utils.getOption('R', options);
    if (orderList.length() != 0) {
      setAttributeIndices(orderList);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }

    Utils.checkForRemainingOptions(options);
<<<<<<< HEAD
=======
=======
    
    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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

    if (!getAttributeIndices().equals("")) {
      options.add("-R");
      options.add(getAttributeIndices());
    }

    return options.toArray(new String[0]);
  }

  /**
   * parses the index string and returns the corresponding int index
   * 
   * @param s the index string to parse
   * @param numAttributes necessary for "last" and OutOfBounds checks
   * @return the int index determined form the index string
   * @throws Exception if index is not valid
   */
  protected int determineIndex(String s, int numAttributes) throws Exception {
    int result;

    if (s.equals("first")) {
      result = 0;
    } else if (s.equals("last")) {
      result = numAttributes - 1;
    } else {
      result = Integer.parseInt(s) - 1;
    }

    // out of bounds?
    if ((result < 0) || (result > numAttributes - 1)) {
      throw new IllegalArgumentException("'" + s
        + "' is not a valid index for the range '1-" + numAttributes + "'!");
    }

    return result;
  }

  /**
   * parses the range string and returns an array with the indices
   * 
   * @param numAttributes necessary for "last" and OutOfBounds checks
   * @return the indices determined form the range string
   * @see #m_NewOrderCols
   * @throws Exception if range is not valid
   */
  protected int[] determineIndices(int numAttributes) throws Exception {
    int[] result;
    Vector<Integer> list;
    int i;
    StringTokenizer tok;
    String token;
    String[] range;
    int from;
    int to;

    list = new Vector<Integer>();

<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {
    String [] options = new String [2];
    int current = 0;

    if (!getAttributeIndices().equals("")) {
      options[current++] = "-R"; 
      options[current++] = getAttributeIndices();
    }

    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }
  
  /**
   * parses the index string and returns the corresponding int index
   * 
   * @param s			the index string to parse
   * @param numAttributes	necessary for "last" and OutOfBounds checks
   * @return			the int index determined form the index string
   * @throws Exception		if index is not valid
   */
  protected int determineIndex(String s, int numAttributes) throws Exception {
    int		result;
    
    if (s.equals("first"))
      result = 0;
    else if (s.equals("last"))
      result = numAttributes - 1;
    else
      result = Integer.parseInt(s) - 1;
    
    // out of bounds?
    if ( (result < 0) || (result > numAttributes - 1) )
      throw new IllegalArgumentException(
	  "'" + s + "' is not a valid index for the range '1-" + numAttributes + "'!");
    
    return result;
  }
  
  /**
   * parses the range string and returns an array with the indices
   * 
   * @param numAttributes	necessary for "last" and OutOfBounds checks
   * @return			the indices determined form the range string
   * @see			#m_NewOrderCols
   * @throws Exception		if range is not valid
   */
  protected int[] determineIndices(int numAttributes) throws Exception {
    int[]		result;
    Vector<Integer>	list;
    int			i;
    StringTokenizer	tok;
    String		token;
    String[]		range;
    int			from;
    int			to;
    
    list = new Vector<Integer>();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // parse range
    tok = new StringTokenizer(m_NewOrderCols, ",");
    while (tok.hasMoreTokens()) {
      token = tok.nextToken();
      if (token.indexOf("-") > -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        range = token.split("-");
        if (range.length != 2) {
          throw new IllegalArgumentException("'" + token
            + "' is not a valid range!");
        }
        from = determineIndex(range[0], numAttributes);
        to = determineIndex(range[1], numAttributes);

        if (from <= to) {
          for (i = from; i <= to; i++) {
            list.add(i);
          }
        } else {
          for (i = from; i >= to; i--) {
            list.add(i);
          }
        }
      } else {
        list.add(determineIndex(token, numAttributes));
      }
    }

    // turn vector into int array
    result = new int[list.size()];
    for (i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }

    return result;
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
<<<<<<< HEAD
=======
=======
	range = token.split("-");
	if (range.length != 2)
	  throw new IllegalArgumentException("'" + token + "' is not a valid range!");
	from = determineIndex(range[0], numAttributes);
	to   = determineIndex(range[1], numAttributes);

	if (from <= to) {
	  for (i = from; i <= to; i++)
	    list.add(i);
	}
	else {
	  for (i = from; i >= to; i--)
	    list.add(i);
	}
      }
      else {
	list.add(determineIndex(token, numAttributes));
      }
    }
    
    // turn vector into int array
    result = new int[list.size()];
    for (i = 0; i < list.size(); i++)
      result[i] = list.get(i);
    
    return result;
  }

  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attribute
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // class
    result.enableAllClasses();
    result.enable(Capability.NO_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
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
   * @throws Exception if a problem occurs setting the input format
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    super.setInputFormat(instanceInfo);

    // An array to keep track of how of how often each attribute is chosen
    int[] frequency = new int[instanceInfo.numAttributes()];
    m_SelectedAttributes = determineIndices(instanceInfo.numAttributes());
    boolean atLeastOneAttributeOccursMoreThanOnce = false;
    for (int current : m_SelectedAttributes) {
      frequency[current]++;
      if (frequency[current] > 1) {
        if (current == instanceInfo.classIndex()) {
          throw new IllegalArgumentException("Reorder filter: Cannot duplicate class attribute");
        }
        atLeastOneAttributeOccursMoreThanOnce = true;
        break;
      }
    }
    Arrays.fill(frequency, 0);

    ArrayList<Attribute> attributes = new ArrayList<Attribute>();
    int outputClass = -1;
    for (int current : m_SelectedAttributes) {
      if (instanceInfo.classIndex() == current) {
        outputClass = attributes.size();
      }
      String newName = instanceInfo.attribute(current).name();
      if (atLeastOneAttributeOccursMoreThanOnce) {
        newName += "_" + (++frequency[current]); // Make sure attribute names in filtered data are unique
      }
      Attribute keep = (Attribute) instanceInfo.attribute(current).copy(newName);
      if (m_setAllAttributeWeightsToOne) {
        keep.setWeight(1.0);
      }
      attributes.add(keep);
    }

    initInputLocators(instanceInfo, m_SelectedAttributes);

    Instances outputFormat = new Instances(instanceInfo.relationName(),
      attributes, 0);
    outputFormat.setClassIndex(outputClass);
    setOutputFormat(outputFormat);

    return true;
  }

  /**
   * Whether to set all attribute weights to one in output data.
   */
  public void setAllAttributeWeightsToOne(boolean b) {

    m_setAllAttributeWeightsToOne = b;
  }

  /**
   * Input an instance for filtering. Ordinarily the instance is processed and
   * made available for output immediately. Some filters require all instances
   * be read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input format has been defined.
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if a problem occurs setting the input format
   */
  public boolean setInputFormat(Instances instanceInfo) throws Exception {
    super.setInputFormat(instanceInfo);
    
    FastVector attributes = new FastVector();
    int outputClass = -1;
    m_SelectedAttributes = determineIndices(instanceInfo.numAttributes());
    for (int i = 0; i < m_SelectedAttributes.length; i++) {
      int current = m_SelectedAttributes[i];
      if (instanceInfo.classIndex() == current) {
	outputClass = attributes.size();
      }
      Attribute keep = (Attribute)instanceInfo.attribute(current).copy();
      attributes.addElement(keep);
    }
    
    initInputLocators(instanceInfo, m_SelectedAttributes);

    Instances outputFormat = new Instances(instanceInfo.relationName(),
					   attributes, 0); 
    outputFormat.setClassIndex(outputClass);
    setOutputFormat(outputFormat);
    
    return true;
  }
  

  /**
   * Input an instance for filtering. Ordinarily the instance is processed
   * and made available for output immediately. Some filters require all
   * instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input format has been defined.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean input(Instance instance) {
    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }

    double[] vals = new double[outputFormatPeek().numAttributes()];
    for (int i = 0; i < m_SelectedAttributes.length; i++) {
      int current = m_SelectedAttributes[i];
      vals[i] = instance.value(current);
    }
    Instance inst = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (instance instanceof SparseInstance) {
      inst = new SparseInstance(instance.weight(), vals);
    } else {
      inst = new DenseInstance(instance.weight(), vals);
    }

    copyValues(inst, false, instance.dataset(), outputFormatPeek());

    push(inst); // No need to copy

<<<<<<< HEAD
=======
=======
    if (instance instanceof SparseInstance)
      inst = new SparseInstance(instance.weight(), vals);
    else
      inst = new Instance(instance.weight(), vals);

    inst.setDataset(getOutputFormat());
    copyValues(inst, false, instance.dataset(), getOutputFormat());
    inst.setDataset(getOutputFormat());
    
    push(inst);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return true;
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
    return "A filter that generates output with a new order of the "
      + "attributes. Useful if one wants to move an attribute to the end of the list of attributes to "
      + "use it as class attribute (e.g., using \"-R 2-last,1\").\n\n"
      + "It is not only possible to change the order of the attributes. "
      + "Attributes can also be left out. E.g. if you have 10 attributes, you "
      + "can generate the following output order: 1,3,5,7,9,10 or 10,1-5.\n\n"
      + "You can also duplicate attributes, e.g., for further processing later "
      + "on: e.g., using 1,1,1,4,4,4,2,2,2 if one needs to process two copies of the attributes "
            + "with other filters but also needs to keep the original attributes.\n\n"
      + "One can simply reverse the order of the attributes via 'last-first'.\n\n"
      + "After applying the filter, the index of the class attribute is set to the index of the "
<<<<<<< HEAD
=======
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "A filter that generates output with a new order of the "
      + "attributes. Useful if one wants to move an attribute to the end to "
      + "use it as class attribute (e.g. with using \"-R 2-last,1\").\n"
      + "But it's not only possible to change the order of all the attributes, "
      + "but also to leave out attributes. E.g. if you have 10 attributes, you "
      + "can generate the following output order: 1,3,5,7,9,10 or 10,1-5.\n"
      + "You can also duplicate attributes, e.g. for further processing later "
      + "on: e.g. 1,1,1,4,4,4,2,2,2 where the second and the third column of "
      + "each attribute are processed differently and the first one, i.e. the "
      + "original one is kept.\n"
      + "One can simply inverse the order of the attributes via 'last-first'.\n"
      + "After appyling the filter, the index of the class attribute is the "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "last attribute.";
  }

  /**
   * Get the current range selection
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a string containing a comma separated list of ranges
   */
  public String getAttributeIndices() {
    return m_NewOrderCols;
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
  public String attributeIndicesTipText() {
    return "Specify range of attributes to act on."
      + " This is a comma separated list of attribute indices, with"
      + " \"first\" and \"last\" valid values. Specify an inclusive"
      + " range with \"-\". E.g: \"first-3,5,6-10,last\".";
  }

  /**
   * Set which attributes are to be copied (or kept if invert is true)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br>
   *          eg: first-3,5,6-last<br>
   *          Note: use this method before you call
   *          <code>setInputFormat(Instances)</code>, since the output format is
   *          determined in that method.
<<<<<<< HEAD
=======
=======
   *
   * @param rangeList a string representing the list of attributes.  Since
   * the string will typically come from a user, attributes are indexed from
   * 1. <br>
   * eg: first-3,5,6-last<br>
   * Note: use this method before you call 
   * <code>setInputFormat(Instances)</code>, since the output format is
   * determined in that method.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @throws Exception if an invalid range list is supplied
   */
  public void setAttributeIndices(String rangeList) throws Exception {
    // simple test
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (rangeList.replaceAll("[afilrst0-9\\-,]*", "").length() != 0) {
      throw new IllegalArgumentException("Not a valid range string!");
    }

<<<<<<< HEAD
=======
=======
    if (rangeList.replaceAll("[afilrst0-9\\-,]*", "").length() != 0)
      throw new IllegalArgumentException("Not a valid range string!");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_NewOrderCols = rangeList;
  }

  /**
   * Set which attributes are to be copied (or kept if invert is true)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param attributes an array containing indexes of attributes to select.
   *          Since the array will typically come from a program, attributes are
   *          indexed from 0.<br>
   *          Note: use this method before you call
   *          <code>setInputFormat(Instances)</code>, since the output format is
   *          determined in that method.
   * @throws Exception if an invalid set of ranges is supplied
   */
  public void setAttributeIndicesArray(int[] attributes) throws Exception {
    setAttributeIndices(Range.indicesToRangeList(attributes));
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14606 $");
<<<<<<< HEAD
=======
=======
   *
   * @param attributes an array containing indexes of attributes to select.
   * Since the array will typically come from a program, attributes are indexed
   * from 0.<br>
   * Note: use this method before you call 
   * <code>setInputFormat(Instances)</code>, since the output format is
   * determined in that method.
   * @throws Exception if an invalid set of ranges is supplied
   */
  public void setAttributeIndicesArray(int [] attributes) throws Exception {
    setAttributeIndices(Range.indicesToRangeList(attributes));
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 6249 $");
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
    runFilter(new Reorder(), argv);
  }
}
