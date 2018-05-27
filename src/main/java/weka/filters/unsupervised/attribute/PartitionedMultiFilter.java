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
 * PartitionedMultiFilter.java
<<<<<<< HEAD
 * Copyright (C) 2006-2016 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2016 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006-2010 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import weka.core.*;
=======
<<<<<<< HEAD
import weka.core.*;
=======
import weka.core.Attribute;
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
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.SimpleBatchFilter;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Vector;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <!-- globalinfo-start --> A filter that applies filters on subsets of
 * attributes and assembles the output into a new dataset. Attributes that are
 * not covered by any of the ranges can be either retained or removed from the
 * output.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D
 *  Turns on output of debugging information.
 * </pre>
 * 
 * <pre>
 * -F &lt;classname [options]&gt;
 *  A filter to apply (can be specified multiple times).
 * </pre>
 * 
 * <pre>
 * -R &lt;range&gt;
 *  An attribute range (can be specified multiple times).
 *  For each filter a range must be supplied. 'first' and 'last'
 *  are valid indices. 'inv(...)' around the range denotes an
 *  inverted range.
 * </pre>
 * 
 * <pre>
 * -U
 *  Flag for leaving unused attributes out of the output, by default
 *  these are included in the filter output.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14534 $
 * @see weka.filters.StreamableFilter
 */
public class PartitionedMultiFilter extends SimpleBatchFilter
        implements WeightedInstancesHandler, WeightedAttributesHandler {
<<<<<<< HEAD
=======
=======
 <!-- globalinfo-start -->
 * A filter that applies filters on subsets of attributes and assembles the output into a new dataset. Attributes that are not covered by any of the ranges can be either retained or removed from the output.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 *
 * <pre> -D
 *  Turns on output of debugging information.</pre>
 *
 * <pre> -F &lt;classname [options]&gt;
 *  A filter to apply (can be specified multiple times).</pre>
 *
 * <pre> -R &lt;range&gt;
 *  An attribute range (can be specified multiple times).
 *  For each filter a range must be supplied. 'first' and 'last'
 *  are valid indices. 'inv(...)' around the range denotes an
 *  inverted range.</pre>
 *
 * <pre> -U
 *  Flag for leaving unused attributes out of the output, by default
 *  these are included in the filter output.</pre>
 *
 <!-- options-end -->
 *
 * @author  FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7506 $
 * @see     weka.filters.StreamableFilter
 */
public class PartitionedMultiFilter
  extends SimpleBatchFilter {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization. */
  private static final long serialVersionUID = -6293720886005713120L;

  /** The filters. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected Filter m_Filters[] = { new AllFilter() };

  /** The attribute ranges. */
  protected Range m_Ranges[] = { new Range("first-last") };
<<<<<<< HEAD
=======
=======
  protected Filter m_Filters[] = {new AllFilter()};

  /** The attribute ranges. */
  protected Range m_Ranges[] = {new Range("first-last")};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Whether unused attributes are left out of the output. */
  protected boolean m_RemoveUnused = false;

  /** the indices of the unused attributes. */
  protected int[] m_IndicesUnused = new int[0];

  /**
   * Returns a string describing this filter.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String globalInfo() {
    return "A filter that applies filters on subsets of attributes and "
<<<<<<< HEAD
=======
=======
   * @return 		a description of the filter suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return
        "A filter that applies filters on subsets of attributes and "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "assembles the output into a new dataset. Attributes that are "
      + "not covered by any of the ranges can be either retained or removed "
      + "from the output.";
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

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tA filter to apply (can be specified multiple times).", "F", 1,
      "-F <classname [options]>"));

    result.addElement(new Option(
      "\tAn attribute range (can be specified multiple times).\n"
        + "\tFor each filter a range must be supplied. 'first' and 'last'\n"
        + "\tare valid indices. 'inv(...)' around the range denotes an\n"
        + "\tinverted range.", "R", 1, "-R <range>"));

    result.addElement(new Option(
      "\tFlag for leaving unused attributes out of the output, by default\n"
        + "\tthese are included in the filter output.", "U", 0, "-U"));

    result.addAll(Collections.list(super.listOptions()));
<<<<<<< HEAD
=======
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();
    Enumeration enm = super.listOptions();
    while (enm.hasMoreElements())
      result.add(enm.nextElement());

    result.addElement(new Option(
        "\tA filter to apply (can be specified multiple times).",
        "F", 1, "-F <classname [options]>"));

    result.addElement(new Option(
        "\tAn attribute range (can be specified multiple times).\n"
	+ "\tFor each filter a range must be supplied. 'first' and 'last'\n"
	+ "\tare valid indices. 'inv(...)' around the range denotes an\n"
	+ "\tinverted range.",
        "R", 1, "-R <range>"));

    result.addElement(new Option(
        "\tFlag for leaving unused attributes out of the output, by default\n"
	+ "\tthese are included in the filter output.",
        "U", 0, "-U"));
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
   * -D
   *  Turns on output of debugging information.
   * </pre>
   * 
   * <pre>
   * -F &lt;classname [options]&gt;
   *  A filter to apply (can be specified multiple times).
   * </pre>
   * 
   * <pre>
   * -R &lt;range&gt;
   *  An attribute range (can be specified multiple times).
   *  For each filter a range must be supplied. 'first' and 'last'
   *  are valid indices. 'inv(...)' around the range denotes an
   *  inverted range.
   * </pre>
   * 
   * <pre>
   * -U
   *  Flag for leaving unused attributes out of the output, by default
   *  these are included in the filter output.
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
    String classname;
    String[] options2;
    Vector<Object> objects;
    Range range;

    setRemoveUnused(Utils.getFlag("U", options));

    objects = new Vector<Object>();
    while ((tmpStr = Utils.getOption("F", options)).length() != 0) {
      options2 = Utils.splitOptions(tmpStr);
      classname = options2[0];
<<<<<<< HEAD
=======
=======
   * Parses a list of options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   *
   * <pre> -D
   *  Turns on output of debugging information.</pre>
   *
   * <pre> -F &lt;classname [options]&gt;
   *  A filter to apply (can be specified multiple times).</pre>
   *
   * <pre> -R &lt;range&gt;
   *  An attribute range (can be specified multiple times).
   *  For each filter a range must be supplied. 'first' and 'last'
   *  are valid indices. 'inv(...)' around the range denotes an
   *  inverted range.</pre>
   *
   * <pre> -U
   *  Flag for leaving unused attributes out of the output, by default
   *  these are included in the filter output.</pre>
   *
   <!-- options-end -->
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    String	classname;
    String[]	options2;
    Vector	objects;
    Range	range;

    super.setOptions(options);

    setRemoveUnused(Utils.getFlag("U", options));

    objects = new Vector();
    while ((tmpStr = Utils.getOption("F", options)).length() != 0) {
      options2    = Utils.splitOptions(tmpStr);
      classname      = options2[0];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      options2[0] = "";
      objects.add(Utils.forName(Filter.class, classname, options2));
    }

    // at least one filter
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (objects.size() == 0) {
      objects.add(new AllFilter());
    }

    setFilters(objects.toArray(new Filter[objects.size()]));

    objects = new Vector<Object>();
    while ((tmpStr = Utils.getOption("R", options)).length() != 0) {
      if (tmpStr.startsWith("inv(") && tmpStr.endsWith(")")) {
        range = new Range(tmpStr.substring(4, tmpStr.length() - 1));
        range.setInvert(true);
      } else {
        range = new Range(tmpStr);
<<<<<<< HEAD
=======
=======
    if (objects.size() == 0)
      objects.add(new AllFilter());

    setFilters((Filter[]) objects.toArray(new Filter[objects.size()]));

    objects = new Vector();
    while ((tmpStr = Utils.getOption("R", options)).length() != 0) {
      if (tmpStr.startsWith("inv(") && tmpStr.endsWith(")")) {
	range = new Range(tmpStr.substring(4, tmpStr.length() - 1));
	range.setInvert(true);
      }
      else {
	range = new Range(tmpStr);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      objects.add(range);
    }

    // at least one Range
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (objects.size() == 0) {
      objects.add(new Range("first-last"));
    }

    setRanges(objects.toArray(new Range[objects.size()]));

    // is number of filters the same as ranges?
    checkDimensions();

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
<<<<<<< HEAD
=======
=======
    if (objects.size() == 0)
      objects.add(new Range("first-last"));

    setRanges((Range[]) objects.toArray(new Range[objects.size()]));

    // is number of filters the same as ranges?
    checkDimensions();
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

    Vector<String> result = new Vector<String>();

    if (getRemoveUnused()) {
      result.add("-U");
    }

    for (int i = 0; i < getFilters().length; i++) {
<<<<<<< HEAD
=======
=======
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector	result;
    String[]	options;
    int		i;
    String	tmpStr;

    result = new Vector();

    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    if (getRemoveUnused())
      result.add("-U");

    for (i = 0; i < getFilters().length; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      result.add("-F");
      result.add(getFilterSpec(getFilter(i)));
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < getRanges().length; i++) {
      String tmpStr = getRange(i).getRanges();
      if (getRange(i).getInvert()) {
        tmpStr = "inv(" + tmpStr + ")";
      }
<<<<<<< HEAD
=======
=======
    for (i = 0; i < getRanges().length; i++) {
      tmpStr = getRange(i).getRanges();
      if (getRange(i).getInvert())
	tmpStr = "inv(" + tmpStr + ")";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      result.add("-R");
      result.add(tmpStr);
    }

<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
=======
<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
=======
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * checks whether the dimensions of filters and ranges fit together.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws Exception if dimensions differ
   */
  protected void checkDimensions() throws Exception {
    if (getFilters().length != getRanges().length) {
      throw new IllegalArgumentException("Number of filters (= "
        + getFilters().length + ") " + "and ranges (= " + getRanges().length
        + ") don't match!");
    }
<<<<<<< HEAD
=======
=======
   *
   * @throws Exception	if dimensions differ
   */
  protected void checkDimensions() throws Exception {
    if (getFilters().length != getRanges().length)
      throw new IllegalArgumentException(
	  "Number of filters (= " + getFilters().length + ") "
	  + "and ranges (= " + getRanges().length + ") don't match!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * tests the data whether the filter can actually handle it.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param instanceInfo the data to test
   * @throws Exception if the test fails
   */
  @Override
  protected void testInputFormat(Instances instanceInfo) throws Exception {
    for (int i = 0; i < getRanges().length; i++) {
      Instances newi = new Instances(instanceInfo, 0);
      if (instanceInfo.size() > 0) {
        newi.add((Instance) instanceInfo.get(0).copy());
<<<<<<< HEAD
=======
=======
   *
   * @param instanceInfo	the data to test
   * @throws Exception		if the test fails
   */
  protected void testInputFormat(Instances instanceInfo) throws Exception {
    for (int i = 0; i < getRanges().length; i++) {
      Instances newi = new Instances(instanceInfo, 0);
      if (instanceInfo.numInstances() > 0){
	newi.add((Instance)instanceInfo.instance(0).copy());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      Range range = getRanges()[i];
      range.setUpper(instanceInfo.numAttributes() - 1);
      Instances subset = generateSubset(newi, range);
      getFilters()[i].setInputFormat(subset);
    }
  }

  /**
   * Sets whether unused attributes (ones that are not covered by any of the
   * ranges) are removed from the output.
<<<<<<< HEAD
   * 
   * @param value if true then the unused attributes get removed
=======
<<<<<<< HEAD
   * 
   * @param value if true then the unused attributes get removed
=======
   *
   * @param value	if true then the unused attributes get removed
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setRemoveUnused(boolean value) {
    m_RemoveUnused = value;
  }

  /**
   * Gets whether unused attributes (ones that are not covered by any of the
   * ranges) are removed from the output.
<<<<<<< HEAD
   * 
   * @return true if unused attributes are removed
=======
<<<<<<< HEAD
   * 
   * @return true if unused attributes are removed
=======
   *
   * @return		true if unused attributes are removed
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getRemoveUnused() {
    return m_RemoveUnused;
  }

  /**
   * Returns the tip text for this property.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String removeUnusedTipText() {
    return "If true then unused attributes (ones that are not covered by any "
<<<<<<< HEAD
=======
=======
   *
   * @return    	tip text for this property suitable for
   *            	displaying in the explorer/experimenter gui
   */
  public String removeUnusedTipText() {
    return
        "If true then unused attributes (ones that are not covered by any "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "of the ranges) will be removed from the output.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the list of possible filters to choose from. Also resets the state of
   * the filter (this reset doesn't affect the options).
   * 
   * @param filters an array of filters with all options set.
<<<<<<< HEAD
=======
=======
   * Sets the list of possible filters to choose from.
   * Also resets the state of the filter (this reset doesn't affect the
   * options).
   *
   * @param filters	an array of filters with all options set.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @see #reset()
   */
  public void setFilters(Filter[] filters) {
    m_Filters = filters;
    reset();
  }

  /**
   * Gets the list of possible filters to choose from.
<<<<<<< HEAD
   * 
   * @return the array of Filters
=======
<<<<<<< HEAD
   * 
   * @return the array of Filters
=======
   *
   * @return 		the array of Filters
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Filter[] getFilters() {
    return m_Filters;
  }

  /**
   * Returns the tip text for this property.
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
   * @return    	tip text for this property suitable for
   *            	displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String filtersTipText() {
    return "The base filters to be used.";
  }

  /**
   * Gets a single filter from the set of available filters.
<<<<<<< HEAD
   * 
   * @param index the index of the filter wanted
   * @return the Filter
=======
<<<<<<< HEAD
   * 
   * @param index the index of the filter wanted
   * @return the Filter
=======
   *
   * @param index 	the index of the filter wanted
   * @return 		the Filter
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Filter getFilter(int index) {
    return m_Filters[index];
  }

  /**
   * returns the filter classname and the options as one string.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param filter the filter to get the specs for
   * @return the classname plus options
   */
  protected String getFilterSpec(Filter filter) {
    String result;

    if (filter == null) {
      result = "";
    } else {
      result = filter.getClass().getName();
      if (filter instanceof OptionHandler) {
        result += " "
          + Utils.joinOptions(((OptionHandler) filter).getOptions());
      }
<<<<<<< HEAD
=======
=======
   *
   * @param filter	the filter to get the specs for
   * @return		the classname plus options
   */
  protected String getFilterSpec(Filter filter) {
    String        result;

    if (filter == null) {
      result = "";
    }
    else {
      result  = filter.getClass().getName();
      if (filter instanceof OptionHandler)
        result += " "
          + Utils.joinOptions(((OptionHandler) filter).getOptions());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the list of possible Ranges to choose from. Also resets the state of
   * the Range (this reset doesn't affect the options).
   * 
   * @param Ranges an array of Ranges with all options set.
<<<<<<< HEAD
=======
=======
   * Sets the list of possible Ranges to choose from.
   * Also resets the state of the Range (this reset doesn't affect the
   * options).
   *
   * @param Ranges	an array of Ranges with all options set.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @see #reset()
   */
  public void setRanges(Range[] Ranges) {
    m_Ranges = Ranges;
    reset();
  }

  /**
   * Gets the list of possible Ranges to choose from.
<<<<<<< HEAD
   * 
   * @return the array of Ranges
=======
<<<<<<< HEAD
   * 
   * @return the array of Ranges
=======
   *
   * @return 		the array of Ranges
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Range[] getRanges() {
    return m_Ranges;
  }

  /**
   * Returns the tip text for this property.
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
   * @return    	tip text for this property suitable for
   *            	displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String rangesTipText() {
    return "The attribute ranges to be used; 'inv(...)' denotes an inverted range.";
  }

  /**
   * Gets a single Range from the set of available Ranges.
<<<<<<< HEAD
   * 
   * @param index the index of the Range wanted
   * @return the Range
=======
<<<<<<< HEAD
   * 
   * @param index the index of the Range wanted
   * @return the Range
=======
   *
   * @param index 	the index of the Range wanted
   * @return 		the Range
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Range getRange(int index) {
    return m_Ranges[index];
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * determines the indices of unused attributes (ones that are not covered by
   * any of the range).
   * 
   * @param data the data to base the determination on
   * @see #m_IndicesUnused
   */
  protected void determineUnusedIndices(Instances data) {
    Vector<Integer> indices;
    int i;
    int n;
    boolean covered;
<<<<<<< HEAD
=======
=======
   * determines the indices of unused attributes (ones that are not covered
   * by any of the range).
   *
   * @param data	the data to base the determination on
   * @see 		#m_IndicesUnused
   */
  protected void determineUnusedIndices(Instances data) {
    Vector<Integer>	indices;
    int			i;
    int			n;
    boolean		covered;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // traverse all ranges
    indices = new Vector<Integer>();
    for (i = 0; i < data.numAttributes(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (i == data.classIndex()) {
        continue;
      }

      covered = false;
      for (n = 0; n < getRanges().length; n++) {
        if (getRanges()[n].isInRange(i)) {
          covered = true;
          break;
        }
      }

      if (!covered) {
        indices.add(new Integer(i));
      }
<<<<<<< HEAD
=======
=======
      if (i == data.classIndex())
	continue;

      covered = false;
      for (n = 0; n < getRanges().length; n++) {
	if (getRanges()[n].isInRange(i)) {
	  covered = true;
	  break;
	}
      }

      if (!covered)
	indices.add(new Integer(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // create array
    m_IndicesUnused = new int[indices.size()];
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (i = 0; i < indices.size(); i++) {
      m_IndicesUnused[i] = indices.get(i).intValue();
    }

    if (getDebug()) {
      System.out.println("Unused indices: "
        + Utils.arrayToString(m_IndicesUnused));
    }
<<<<<<< HEAD
=======
=======
    for (i = 0; i < indices.size(); i++)
      m_IndicesUnused[i] = indices.get(i).intValue();

    if (getDebug())
      System.out.println(
	  "Unused indices: " + Utils.arrayToString(m_IndicesUnused));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * generates a subset of the dataset with only the attributes from the range
   * (class is always added if present).
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param data the data to work on
   * @param range the range of attribute to use
   * @return the generated subset
   * @throws Exception if creation fails
   */
  protected Instances generateSubset(Instances data, Range range)
    throws Exception {
    Remove filter;
    StringBuilder atts;
    Instances result;
    int[] indices;
    int i;

    // determine attributes
    indices = range.getSelection();
    atts = new StringBuilder();
    for (i = 0; i < indices.length; i++) {
      if (i > 0) {
        atts.append(",");
      }
      atts.append("" + (indices[i] + 1));
    }
    if ((data.classIndex() > -1) && (!range.isInRange(data.classIndex()))) {
      atts.append("," + (data.classIndex() + 1));
    }
<<<<<<< HEAD
=======
=======
   *
   * @param data	the data to work on
   * @param range	the range of attribute to use
   * @return		the generated subset
   * @throws Exception	if creation fails
   */
  protected Instances generateSubset(Instances data, Range range) throws Exception {
    Remove		filter;
    StringBuilder	atts;
    Instances		result;
    int[]		indices;
    int			i;

    // determine attributes
    indices = range.getSelection();
    atts    = new StringBuilder();
    for (i = 0; i < indices.length; i++) {
      if (i > 0)
	atts.append(",");
      atts.append("" + (indices[i] + 1));
    }
    if ((data.classIndex() > -1) && (!range.isInRange(data.classIndex())))
      atts.append("," + (data.classIndex() + 1));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // setup filter
    filter = new Remove();
    filter.setAttributeIndices(atts.toString());
    filter.setInvertSelection(true);
    filter.setInputFormat(data);

    // generate output
    result = Filter.useFilter(data, filter);

    return result;
  }

  /**
   * renames all the attributes in the dataset (excluding the class if present)
   * by adding the prefix to the name.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param data the data to work on
   * @param prefix the prefix for the attributes
   * @return a copy of the data with the attributes renamed
   * @throws Exception if renaming fails
   */
  protected Instances renameAttributes(Instances data, String prefix)
    throws Exception {
    Instances result;
    int i;
    ArrayList<Attribute> atts;

    // rename attributes
    atts = new ArrayList<Attribute>();
    for (i = 0; i < data.numAttributes(); i++) {
      if (i == data.classIndex()) {
        atts.add((Attribute) data.attribute(i).copy());
      } else {
        atts.add(data.attribute(i).copy(prefix + data.attribute(i).name()));
      }
<<<<<<< HEAD
=======
=======
   *
   * @param data	the data to work on
   * @param prefix	the prefix for the attributes
   * @return		a copy of the data with the attributes renamed
   * @throws Exception	if renaming fails
   */
  protected Instances renameAttributes(Instances data, String prefix) throws Exception {
    Instances	result;
    int		i;
    FastVector	atts;

    // rename attributes
    atts = new FastVector();
    for (i = 0; i < data.numAttributes(); i++) {
      if (i == data.classIndex())
	atts.addElement((Attribute) data.attribute(i).copy());
      else
	atts.addElement(data.attribute(i).copy(prefix + data.attribute(i).name()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // create new dataset
    result = new Instances(data.relationName(), atts, data.numInstances());
    for (i = 0; i < data.numInstances(); i++) {
      result.add((Instance) data.instance(i).copy());
    }

    // set class if present
<<<<<<< HEAD
    if (data.classIndex() > -1) {
      result.setClassIndex(data.classIndex());
    }
=======
<<<<<<< HEAD
    if (data.classIndex() > -1) {
      result.setClassIndex(data.classIndex());
    }
=======
    if (data.classIndex() > -1)
      result.setClassIndex(data.classIndex());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result;
  }

  /**
   * Determines the output format based only on the full input dataset and
   * returns this otherwise null is returned. In case the output format cannot
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * be returned immediately, i.e., immediateOutputFormat() returns false, then
   * this method will be called from batchFinished().
   * 
   * @param inputFormat the input format to base the output format on
   * @return the output format
   * @throws Exception in case the determination goes wrong
   * @see #hasImmediateOutputFormat()
   * @see #batchFinished()
   */
  @Override
  protected Instances determineOutputFormat(Instances inputFormat)
    throws Exception {
    Instances result;
    Instances processed;
    int i;
    int n;
    ArrayList<Attribute> atts;
    Attribute att;

    if (!isFirstBatchDone()) {
      // we need the full dataset here, see process(Instances)
      if (inputFormat.numInstances() == 0) {
        return null;
      }
<<<<<<< HEAD
=======
=======
   * be returned immediately, i.e., immediateOutputFormat() returns false,
   * then this method will be called from batchFinished().
   *
   * @param inputFormat     the input format to base the output format on
   * @return                the output format
   * @throws Exception      in case the determination goes wrong
   * @see                   #hasImmediateOutputFormat()
   * @see                   #batchFinished()
   */
  protected Instances determineOutputFormat(Instances inputFormat) throws Exception {
    Instances   result;
    Instances	processed;
    int         i;
    int		n;
    FastVector	atts;
    Attribute	att;

    if (!isFirstBatchDone()) {
      // we need the full dataset here, see process(Instances)
      if (inputFormat.numInstances() == 0)
	return null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      checkDimensions();

      // determine unused indices
      determineUnusedIndices(inputFormat);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      atts = new ArrayList<Attribute>();
      for (i = 0; i < getFilters().length; i++) {
        if (!isFirstBatchDone()) {
          // generate subset
          processed = generateSubset(inputFormat, getRange(i));
          // set input format
          if (!getFilter(i).setInputFormat(processed)) {
            Filter.useFilter(processed, getFilter(i));
          }
        }

        // get output format
        processed = getFilter(i).getOutputFormat();

        // rename attributes
        processed = renameAttributes(processed, "filtered-" + i + "-");

        // add attributes
        for (n = 0; n < processed.numAttributes(); n++) {
          if (n == processed.classIndex()) {
            continue;
          }
          atts.add((Attribute) processed.attribute(n).copy());
        }
<<<<<<< HEAD
=======
=======
      atts = new FastVector();
      for (i = 0; i < getFilters().length; i++) {
	if (!isFirstBatchDone()) {
	  // generate subset
	  processed = generateSubset(inputFormat, getRange(i));
	  // set input format
	  if (!getFilter(i).setInputFormat(processed))
	    Filter.useFilter(processed, getFilter(i));
	}

	// get output format
	processed = getFilter(i).getOutputFormat();

	// rename attributes
	processed = renameAttributes(processed, "filtered-" + i + "-");

	// add attributes
	for (n = 0; n < processed.numAttributes(); n++) {
	  if (n == processed.classIndex())
	    continue;
	  atts.addElement((Attribute) processed.attribute(n).copy());
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      // add unused attributes
      if (!getRemoveUnused()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        for (i = 0; i < m_IndicesUnused.length; i++) {
          att = inputFormat.attribute(m_IndicesUnused[i]);
          atts.add(att.copy("unfiltered-" + att.name()));
        }
      }

      // add class if present
      if (inputFormat.classIndex() > -1) {
        atts.add((Attribute) inputFormat.classAttribute().copy());
      }

      // generate new dataset
      result = new Instances(inputFormat.relationName(), atts, 0);
      if (inputFormat.classIndex() > -1) {
        result.setClassIndex(result.numAttributes() - 1);
      }
    } else {
<<<<<<< HEAD
=======
=======
	for (i = 0; i < m_IndicesUnused.length; i++) {
	  att = inputFormat.attribute(m_IndicesUnused[i]);
	  atts.addElement(att.copy("unfiltered-" + att.name()));
	}
      }

      // add class if present
      if (inputFormat.classIndex() > -1)
	atts.addElement((Attribute) inputFormat.classAttribute().copy());

      // generate new dataset
      result = new Instances(inputFormat.relationName(), atts, 0);
      if (inputFormat.classIndex() > -1)
	result.setClassIndex(result.numAttributes() - 1);
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      result = getOutputFormat();
    }

    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Processes the given data (may change the provided dataset) and returns the
   * modified version. This method is called in batchFinished().
   * 
   * @param instances the data to process
   * @return the modified data
   * @throws Exception in case the processing goes wrong
   * @see #batchFinished()
   */
  @Override
  protected Instances process(Instances instances) throws Exception {
    Instances result;
    int i;
    int n;
    int m;
    int index;
    Instances[] processed;
    Instance inst;
    Instance newInst;
    double[] values;
    Vector<Integer> errors;
<<<<<<< HEAD
=======
=======
   * Processes the given data (may change the provided dataset) and returns
   * the modified version. This method is called in batchFinished().
   *
   * @param instances   the data to process
   * @return            the modified data
   * @throws Exception  in case the processing goes wrong
   * @see               #batchFinished()
   */
  protected Instances process(Instances instances) throws Exception {
    Instances		result;
    int        		i;
    int			n;
    int			m;
    int			index;
    Instances[]		processed;
    Instance		inst;
    Instance		newInst;
    double[]		values;
    Vector		errors;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (!isFirstBatchDone()) {
      checkDimensions();

      // set upper limits
<<<<<<< HEAD
      for (i = 0; i < m_Ranges.length; i++) {
        m_Ranges[i].setUpper(instances.numAttributes() - 1);
      }
=======
<<<<<<< HEAD
      for (i = 0; i < m_Ranges.length; i++) {
        m_Ranges[i].setUpper(instances.numAttributes() - 1);
      }
=======
      for (i = 0; i < m_Ranges.length; i++)
	m_Ranges[i].setUpper(instances.numAttributes() - 1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // determine unused indices
      determineUnusedIndices(instances);
    }

    // pass data through all filters
    processed = new Instances[getFilters().length];
    for (i = 0; i < getFilters().length; i++) {
      processed[i] = generateSubset(instances, getRange(i));
<<<<<<< HEAD
      if (!isFirstBatchDone()) {
        getFilter(i).setInputFormat(processed[i]);
      }
=======
<<<<<<< HEAD
      if (!isFirstBatchDone()) {
        getFilter(i).setInputFormat(processed[i]);
      }
=======
      if (!isFirstBatchDone())
	getFilter(i).setInputFormat(processed[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      processed[i] = Filter.useFilter(processed[i], getFilter(i));
    }

    // set output format (can only be determined with full dataset, hence here)
    if (!isFirstBatchDone()) {
      result = determineOutputFormat(instances);
      setOutputFormat(result);
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
      result = getOutputFormat();
    }

    // check whether all filters didn't change the number of instances
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    errors = new Vector<Integer>();
    for (i = 0; i < processed.length; i++) {
      if (processed[i].numInstances() != instances.numInstances()) {
        errors.add(new Integer(i));
      }
    }
    if (errors.size() > 0) {
      throw new IllegalStateException(
              "The following filter(s) changed the number of instances: " + errors);
    }

    // assemble data
    for (i = 0; i < instances.numInstances(); i++) {
      inst = instances.instance(i);
<<<<<<< HEAD
=======
=======
    errors = new Vector();
    for (i = 0; i < processed.length; i++) {
      if (processed[i].numInstances() != instances.numInstances())
	errors.add(new Integer(i));
    }
    if (errors.size() > 0)
      throw new IllegalStateException(
	  "The following filter(s) changed the number of instances: " + errors);

    // assemble data
    for (i = 0; i < instances.numInstances(); i++) {
      inst   = instances.instance(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      values = new double[result.numAttributes()];

      // filtered data
      index = 0;
      for (n = 0; n < processed.length; n++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        for (m = 0; m < processed[n].numAttributes(); m++) {
          if (m == processed[n].classIndex()) {
            continue;
          }
          if (processed[n].instance(i).isMissing(m)) {
            values[index] = Utils.missingValue();
          } else if (result.attribute(index).isString()) {
            values[index] = result.attribute(index).addStringValue(
                    processed[n].instance(i).stringValue(m));
          } else if (result.attribute(index).isRelationValued()) {
            values[index] = result.attribute(index).addRelation(
                    processed[n].instance(i).relationalValue(m));
          } else {
            values[index] = processed[n].instance(i).value(m);
          }
          index++;
        }
<<<<<<< HEAD
=======
=======
	for (m = 0; m < processed[n].numAttributes(); m++) {
	  if (m == processed[n].classIndex())
	    continue;
	  if (result.attribute(index).isString())
	    values[index] = result.attribute(index).addStringValue(processed[n].instance(i).stringValue(m));
	  else if (result.attribute(index).isRelationValued())
	    values[index] = result.attribute(index).addRelation(processed[n].instance(i).relationalValue(m));
	  else
	    values[index] = processed[n].instance(i).value(m);
	  index++;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      // unused attributes
      if (!getRemoveUnused()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        for (n = 0; n < m_IndicesUnused.length; n++) {
          if (inst.isMissing(m_IndicesUnused[n])) {
            values[index] = Utils.missingValue();
          } else if (result.attribute(index).isString()) {
            values[index] = result.attribute(index).addStringValue(
                    inst.stringValue(m_IndicesUnused[n]));
          } else if (result.attribute(index).isRelationValued()) {
            values[index] = result.attribute(index).addRelation(
                    inst.relationalValue(m_IndicesUnused[n]));
          } else {
            values[index] = inst.value(m_IndicesUnused[n]);
          }
          index++;
        }
      }

      // class
      if (instances.classIndex() > -1) {
        index = values.length - 1;
        if (inst.classIsMissing())
          values[index] = Utils.missingValue();
        else if (result.attribute(index).isString())
          values[index] = result.attribute(index).addStringValue(inst.stringValue(instances.classIndex()));
        else if (result.attribute(index).isRelationValued())
          values[index] = result.attribute(index).addRelation(inst.relationalValue(instances.classIndex()));
        else
          values[index] = inst.value(instances.classIndex());
      }

      // generate and add instance
      if (inst instanceof SparseInstance) {
        newInst = new SparseInstance(instances.instance(i).weight(), values);
      } else {
        newInst = new DenseInstance(instances.instance(i).weight(), values);
      }
<<<<<<< HEAD
=======
=======
	for (n = 0; n < m_IndicesUnused.length; n++) {
	  if (result.attribute(index).isString())
	    values[index] = result.attribute(index).addStringValue(inst.stringValue(m_IndicesUnused[n]));
	  else if (result.attribute(index).isRelationValued())
	    values[index] = result.attribute(index).addRelation(inst.relationalValue(m_IndicesUnused[n]));
	  else
	    values[index] = inst.value(m_IndicesUnused[n]);
	  index++;
	}
      }

      // class
      if (instances.classIndex() > -1)
	values[values.length - 1] = inst.value(instances.classIndex());

      // generate and add instance
      if (inst instanceof SparseInstance)
	newInst = new SparseInstance(instances.instance(i).weight(), values);
      else
	newInst = new Instance(instances.instance(i).weight(), values);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      result.add(newInst);
    }

    return result;
  }

  /**
   * Returns the revision string.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
<<<<<<< HEAD
=======
=======
   *
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7506 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for executing this class.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param args should contain arguments for the filter: use -h for help
   */
  public static void main(String[] args) {
    runFilter(new PartitionedMultiFilter(), args);
  }
}
