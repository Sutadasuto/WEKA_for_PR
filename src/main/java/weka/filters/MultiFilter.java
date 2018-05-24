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
 * MultiFilter.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.filters;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;

/**
 * <!-- globalinfo-start --> Applies several filters successively. In case all
 * supplied filters are StreamableFilters, it will act as a streamable one, too.
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
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14534 $
 * @see weka.filters.StreamableFilter
 */
public class MultiFilter extends SimpleStreamFilter implements WeightedAttributesHandler, WeightedInstancesHandler {
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.filters;

import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * Applies several filters successively. In case all supplied filters are StreamableFilters, it will act as a streamable one, too.
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
 <!-- options-end -->
 *
 * @author  FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 9718 $
 * @see     weka.filters.StreamableFilter
 */
public class MultiFilter
  extends SimpleStreamFilter {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -6293720886005713120L;

  /** The filters */
<<<<<<< HEAD
  protected Filter m_Filters[] = { new AllFilter() };
=======
  protected Filter m_Filters[] = {new AllFilter()};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** caches the streamable state */
  protected boolean m_Streamable = false;

  /** whether we already checked the streamable state */
  protected boolean m_StreamableChecked = false;
<<<<<<< HEAD

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String globalInfo() {
    return "Applies several filters successively. In case all supplied filters "
=======
  
  /**
   * Returns a string describing this filter
   * @return 		a description of the filter suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "Applies several filters successively. In case all supplied filters " 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "are StreamableFilters, it will act as a streamable one, too.";
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
      "\tA filter to apply (can be specified multiple times).", "F", 1,
      "-F <classname [options]>"));

    result.addAll(Collections.list(super.listOptions()));
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
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result.elements();
  }

  /**
<<<<<<< HEAD
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
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;
    String filter;
    String[] options2;
    Vector<Filter> filters;

    super.setOptions(options);

    filters = new Vector<Filter>();
    while ((tmpStr = Utils.getOption("F", options)).length() != 0) {
      options2 = Utils.splitOptions(tmpStr);
      filter = options2[0];
      options2[0] = "";
      filters.add((Filter) Utils.forName(Filter.class, filter, options2));
    }

    // at least one filter
    if (filters.size() == 0) {
      filters.add(new AllFilter());
    }

    setFilters(filters.toArray(new Filter[filters.size()]));
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
   <!-- options-end -->
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String        tmpStr;
    String        filter;
    String[]      options2;
    Vector        filters;

    super.setOptions(options);
    
    filters = new Vector();
    while ((tmpStr = Utils.getOption("F", options)).length() != 0) {
      options2    = Utils.splitOptions(tmpStr);
      filter      = options2[0];
      options2[0] = "";
      filters.add(Utils.forName(Filter.class, filter, options2));
    }

    // at least one filter
    if (filters.size() == 0)
      filters.add(new AllFilter());

    setFilters((Filter[]) filters.toArray(new Filter[filters.size()]));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the filter.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result;
    String[] options;
    int i;

    result = new Vector<String>();

    options = super.getOptions();
    for (i = 0; i < options.length; i++) {
      result.add(options[i]);
    }

=======
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    String[]      options;
    int           i;

    result = new Vector();

    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (i = 0; i < getFilters().length; i++) {
      result.add("-F");
      result.add(getFilterSpec(getFilter(i)));
    }

<<<<<<< HEAD
    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
    return (String[]) result.toArray(new String[result.size()]);
  }

  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    if (getFilters().length == 0) {
      Capabilities result = super.getCapabilities();
      result.disableAll();
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return result;
    } else {
      return getFilters()[0].getCapabilities();
    }
  }

  /**
<<<<<<< HEAD
   * resets the filter, i.e., m_NewBatch to true and m_FirstBatchDone to false.
   * 
   * @see #m_NewBatch
   * @see #m_FirstBatchDone
   */
  @Override
=======
   * resets the filter, i.e., m_NewBatch to true and m_FirstBatchDone to
   * false.
   *
   * @see #m_NewBatch
   * @see #m_FirstBatchDone
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected void reset() {
    super.reset();
    m_StreamableChecked = false;
  }

  /**
<<<<<<< HEAD
   * Sets the list of possible filters to choose from. Also resets the state of
   * the filter (this reset doesn't affect the options).
   * 
   * @param filters an array of filters with all options set.
   * @see #reset()
   */
  public void setFilters(Filter[] filters) {
    m_Filters = filters;
=======
   * Sets the list of possible filters to choose from.
   * Also resets the state of the filter (this reset doesn't affect the 
   * options).
   *
   * @param filters	an array of filters with all options set.
   * @see #reset()
   */
  public void setFilters(Filter[] filters) {
    m_Filters           = filters;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    reset();
  }

  /**
   * Gets the list of possible filters to choose from.
<<<<<<< HEAD
   * 
   * @return the array of Filters
=======
   *
   * @return 	the array of Filters
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Filter[] getFilters() {
    return m_Filters;
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
   * @return    tip text for this property suitable for
   *            displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String filtersTipText() {
    return "The base filters to be used.";
  }
<<<<<<< HEAD

  /**
   * Gets a single filter from the set of available filters.
   * 
   * @param index the index of the filter wanted
   * @return the Filter
=======
  
  /**
   * Gets a single filter from the set of available filters.
   *
   * @param 	index the index of the filter wanted
   * @return 	the Filter
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Filter getFilter(int index) {
    return m_Filters[index];
  }

  /**
   * returns the filter classname and the options as one string
   * 
<<<<<<< HEAD
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
=======
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
    }

    return result;
  }

  /**
   * tests whether all the enclosed filters are streamable
<<<<<<< HEAD
   * 
   * @return true if all the enclosed filters are streamable
   */
  public boolean isStreamableFilter() {
    int i;

    if (!m_StreamableChecked) {
      m_Streamable = true;
      m_StreamableChecked = true;

      for (i = 0; i < getFilters().length; i++) {
        if (getFilter(i) instanceof MultiFilter) {
          m_Streamable = ((MultiFilter) getFilter(i)).isStreamableFilter();
        } else if (getFilter(i) instanceof StreamableFilter) {
          m_Streamable = true;
        } else {
          m_Streamable = false;
        }

        if (!m_Streamable) {
          break;
        }
      }

      if (getDebug()) {
        System.out.println("Streamable: " + m_Streamable);
      }
=======
   *
   * @return	true if all the enclosed filters are streamable
   */
  public boolean isStreamableFilter() {
    int           i;

    if (!m_StreamableChecked) {
      m_Streamable        = true;
      m_StreamableChecked = true;

      for (i = 0; i < getFilters().length; i++) {
        if (getFilter(i) instanceof MultiFilter)
          m_Streamable = ((MultiFilter) getFilter(i)).isStreamableFilter();
        else if (getFilter(i) instanceof StreamableFilter)
          m_Streamable = true;
        else
          m_Streamable = false;

        if (!m_Streamable)
          break;
      }

      if (getDebug())
        System.out.println("Streamable: " + m_Streamable);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return m_Streamable;
  }

  /**
<<<<<<< HEAD
   * Returns true if the output format is immediately available after the input
   * format has been set and not only after all the data has been seen (see
   * batchFinished()). This method should normally return true for a stream
   * filter, since the data will be processed in a batch manner instead (or at
   * least for the second batch of files, see m_FirstBatchDone).
   * 
   * @return true if the output format is immediately available
   * @see #batchFinished()
   * @see #setInputFormat(Instances)
   * @see #m_FirstBatchDone
   */
  @Override
  protected boolean hasImmediateOutputFormat() {
    return isStreamableFilter();
  }

  /**
   * Determines the output format based on the input format and returns this. In
   * case the output format cannot be returned immediately, i.e.,
   * hasImmediateOutputFormat() returns false, then this method will called from
   * batchFinished() after the call of preprocess(Instances), in which, e.g.,
   * statistics for the actual processing step can be gathered.
   * 
   * @param inputFormat the input format to base the output format on
   * @return the output format
   * @throws Exception in case the determination goes wrong
   * @see #hasImmediateOutputFormat()
   * @see #batchFinished()
   * @see #preprocess(Instances)
   */
  @Override
  protected Instances determineOutputFormat(Instances inputFormat)
    throws Exception {
    Instances result;
    int i;

    result = getInputFormat();

    for (i = 0; i < getFilters().length; i++) {
      if (!isFirstBatchDone()) {
        getFilter(i).setInputFormat(result);
      }
=======
   * Returns true if the output format is immediately available after the
   * input format has been set and not only after all the data has been
   * seen (see batchFinished()). This method should normally return true
   * for a stream filter, since the data will be processed in a batch
   * manner instead (or at least for the second batch of files, see
   * m_FirstBatchDone).
   *
   * @return      true if the output format is immediately available
   * @see         #batchFinished()
   * @see         #setInputFormat(Instances)
   * @see         #m_FirstBatchDone
   */
  protected boolean hasImmediateOutputFormat() {
    return isStreamableFilter();
  }
  
  /**
   * Determines the output format based on the input format and returns 
   * this. In case the output format cannot be returned immediately, i.e.,
   * hasImmediateOutputFormat() returns false, then this method will called
   * from batchFinished() after the call of preprocess(Instances), in which,
   * e.g., statistics for the actual processing step can be gathered.
   *
   * @param inputFormat     the input format to base the output format on
   * @return                the output format
   * @throws Exception      in case the determination goes wrong
   * @see                   #hasImmediateOutputFormat()
   * @see                   #batchFinished()
   * @see                   #preprocess(Instances)
   */
  protected Instances determineOutputFormat(Instances inputFormat) throws Exception {
    Instances   result;
    int         i;
    
    result = getInputFormat();
    
    for (i = 0; i < getFilters().length; i++) {
      if (!isFirstBatchDone())
	getFilter(i).setInputFormat(result);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      result = getFilter(i).getOutputFormat();
    }

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
    int i;

    result = (Instance) instance.copy();

=======
   * processes the given instance (may change the provided instance) and
   * returns the modified version.
   *
   * @param instance    the instance to process
   * @return            the modified data
   * @throws Exception  in case the processing goes wrong
   */
  protected Instance process(Instance instance) throws Exception {
    Instance    result;
    int         i;
    
    result = (Instance) instance.copy();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (i = 0; i < getFilters().length; i++) {
      if (getFilter(i).input(result)) {
        result = getFilter(i).output();
      } else {
        // if a filter says nothing to collect then terminate
        result = null;
        break;
      }
    }

    return result;
  }

  /**
<<<<<<< HEAD
   * Processes the given data (may change the provided dataset) and returns the
   * modified version. This method is called in batchFinished(). This
   * implementation only calls process(Instance) for each instance in the given
   * dataset.
   * 
   * @param instances the data to process
   * @return the modified data
   * @throws Exception in case the processing goes wrong
   * @see #batchFinished()
   * @see #process(Instance)
   */
  @Override
  protected Instances process(Instances instances) throws Exception {
    Instances result;
    int i;

    result = instances;

    for (i = 0; i < getFilters().length; i++) {
      if (!isFirstBatchDone()) {
        getFilter(i).setInputFormat(result);
      }
      result = Filter.useFilter(result, getFilter(i));
    }

    return result;
  }

  /**
   * Signify that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances. Any subsequent instances filtered should
   * be filtered based on setting obtained from the first batch (unless the
   * setInputFormat has been re-assigned or new options have been set).
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input format has been set.
   */
  @Override
  public boolean batchFinished() throws Exception {
    super.batchFinished();

    for (int i = 0; i > getFilters().length; i++) {
      getFilter(i).batchFinished();
    }

    return (numPendingOutput() != 0);
  }

  /**
   * RemoveWithValues may return false from input() (thus not making an instance
   * available immediately) even after the first batch has been completed due to
   * matching a value that the user wants to remove. Therefore this method
   * returns true.
   * 
   * @return true if one of the base filters returns true for this method.
   */
  @Override
  public boolean mayRemoveInstanceAfterFirstBatchDone() {
    boolean result = false;

    for (Filter f : m_Filters) {
      result = (result || f.mayRemoveInstanceAfterFirstBatchDone());
    }

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
   * Processes the given data (may change the provided dataset) and returns
   * the modified version. This method is called in batchFinished().
   * This implementation only calls process(Instance) for each instance
   * in the given dataset.
   *
   * @param instances   the data to process
   * @return            the modified data
   * @throws Exception  in case the processing goes wrong
   * @see               #batchFinished()
   * @see               #process(Instance)
   */
  protected Instances process(Instances instances) throws Exception {
    Instances     result;
    int           i;

    result = instances;
    
    for (i = 0; i < getFilters().length; i++) {
      if (!isFirstBatchDone())
	getFilter(i).setInputFormat(result);
      result = Filter.useFilter(result, getFilter(i));
    }
    
    return result;
  }
  
  /**
   * Signify that this batch of input to the filter is finished. If
   * the filter requires all instances prior to filtering, output()
   * may now be called to retrieve the filtered instances. Any
   * subsequent instances filtered should be filtered based on setting
   * obtained from the first batch (unless the setInputFormat has been
   * re-assigned or new options have been set).
   *
   * @return            true if there are instances pending output
   * @throws IllegalStateException      if no input format has been set. 
   */
  public boolean batchFinished() throws Exception {
    super.batchFinished();
    
    for (int i = 0; i > getFilters().length; i++) {
      getFilter(i).batchFinished();
    }
    
    return (numPendingOutput() != 0);
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9718 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for executing this class.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param args should contain arguments for the filter: use -h for help
   */
  public static void main(String[] args) {
    runFilter(new MultiFilter(), args);
  }
}
