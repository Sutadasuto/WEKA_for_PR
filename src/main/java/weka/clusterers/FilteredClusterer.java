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
 * FilteredClusterer.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.clusterers;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
=======
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.SupervisedFilter;

<<<<<<< HEAD
/**
 * <!-- globalinfo-start --> Class for running an arbitrary clusterer on data
 * that has been passed through an arbitrary filter. Like the clusterer, the
 * structure of the filter is based exclusively on the training data and test
 * instances will be processed by the filter without changing their structure.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -F &lt;filter specification&gt;
 *  Full class name of filter to use, followed
 *  by filter options.
 *  eg: "weka.filters.unsupervised.attribute.Remove -V -R 1,2"
 * (default: weka.filters.AllFilter)
 * </pre>
 * 
 * <pre>
 * -W
 *  Full name of base clusterer.
 *  (default: weka.clusterers.SimpleKMeans)
 * </pre>
 * 
 * <pre>
 * Options specific to clusterer weka.clusterers.SimpleKMeans:
 * </pre>
 * 
 * <pre>
 * -N &lt;num&gt;
 *  number of clusters.
 *  (default 2).
 * </pre>
 * 
 * <pre>
 * -V
 *  Display std. deviations for centroids.
 * </pre>
 * 
 * <pre>
 * -M
 *  Replace missing values with mean/mode.
 * </pre>
 * 
 * <pre>
 * -S &lt;num&gt;
 *  Random number seed.
 *  (default 10)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * Based on code from the FilteredClassifier by Len Trigg.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14132 $
 * @see weka.classifiers.meta.FilteredClassifier
 */
public class FilteredClusterer extends SingleClustererEnhancer implements Drawable {

  /** for serialization. */
  private static final long serialVersionUID = 1420005943163412943L;

=======
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Class for running an arbitrary clusterer on data that has been passed through an arbitrary filter. Like the clusterer, the structure of the filter is based exclusively on the training data and test instances will be processed by the filter without changing their structure.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -F &lt;filter specification&gt;
 *  Full class name of filter to use, followed
 *  by filter options.
 *  eg: "weka.filters.unsupervised.attribute.Remove -V -R 1,2"
 * (default: weka.filters.AllFilter)</pre>
 * 
 * <pre> -W
 *  Full name of base clusterer.
 *  (default: weka.clusterers.SimpleKMeans)</pre>
 * 
 * <pre> 
 * Options specific to clusterer weka.clusterers.SimpleKMeans:
 * </pre>
 * 
 * <pre> -N &lt;num&gt;
 *  number of clusters.
 *  (default 2).</pre>
 * 
 * <pre> -V
 *  Display std. deviations for centroids.
 * </pre>
 * 
 * <pre> -M
 *  Replace missing values with mean/mode.
 * </pre>
 * 
 * <pre> -S &lt;num&gt;
 *  Random number seed.
 *  (default 10)</pre>
 * 
 <!-- options-end -->
 *
 * Based on code from the FilteredClassifier by Len Trigg.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 5538 $
 * @see weka.classifiers.meta.FilteredClassifier
 */
public class FilteredClusterer
  extends SingleClustererEnhancer {

  /** for serialization. */
  private static final long serialVersionUID = 1420005943163412943L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The filter. */
  protected Filter m_Filter;

  /** The instance structure of the filtered instances. */
  protected Instances m_FilteredInstances;

  /**
   * Default constructor.
   */
  public FilteredClusterer() {
    m_Clusterer = new SimpleKMeans();
<<<<<<< HEAD
    m_Filter = new weka.filters.AllFilter();
=======
    m_Filter    = new weka.filters.AllFilter();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns a string describing this clusterer.
   * 
<<<<<<< HEAD
   * @return a description of the clusterer suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class for running an arbitrary clusterer on data that has been passed "
=======
   * @return 		a description of the clusterer suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return
        "Class for running an arbitrary clusterer on data that has been passed "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "through an arbitrary filter. Like the clusterer, the structure of the filter "
      + "is based exclusively on the training data and test instances will be processed "
      + "by the filter without changing their structure.";
  }

  /**
   * String describing default filter.
   * 
<<<<<<< HEAD
   * @return the default filter classname
=======
   * @return 		the default filter classname
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected String defaultFilterString() {
    return weka.filters.AllFilter.class.getName();
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
      "\tFull class name of filter to use, followed\n"
        + "\tby filter options.\n"
        + "\teg: \"weka.filters.unsupervised.attribute.Remove -V -R 1,2\"\n"
        + "(default: " + defaultFilterString() + ")", "F", 1,
      "-F <filter specification>"));

    result.addAll(Collections.list(super.listOptions()));
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
	"\tFull class name of filter to use, followed\n"
	+ "\tby filter options.\n"
	+ "\teg: \"weka.filters.unsupervised.attribute.Remove -V -R 1,2\"\n"
	+ "(default: " + defaultFilterString() + ")",
	"F", 1, "-F <filter specification>"));

    Enumeration enm = super.listOptions();
    while (enm.hasMoreElements())
      result.addElement(enm.nextElement());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result.elements();
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
   * -F &lt;filter specification&gt;
   *  Full class name of filter to use, followed
   *  by filter options.
   *  eg: "weka.filters.unsupervised.attribute.Remove -V -R 1,2"
   * (default: weka.filters.AllFilter)
   * </pre>
   * 
   * <pre>
   * -W
   *  Full name of base clusterer.
   *  (default: weka.clusterers.SimpleKMeans)
   * </pre>
   * 
   * <pre>
   * Options specific to clusterer weka.clusterers.SimpleKMeans:
   * </pre>
   * 
   * <pre>
   * -N &lt;num&gt;
   *  number of clusters.
   *  (default 2).
   * </pre>
   * 
   * <pre>
   * -V
   *  Display std. deviations for centroids.
   * </pre>
   * 
   * <pre>
   * -M
   *  Replace missing values with mean/mode.
   * </pre>
   * 
   * <pre>
   * -S &lt;num&gt;
   *  Random number seed.
   *  (default 10)
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
    String[] tmpOptions;

    tmpStr = Utils.getOption('F', options);
    if (tmpStr.length() > 0) {
      tmpOptions = Utils.splitOptions(tmpStr);
      if (tmpOptions.length == 0) {
        throw new IllegalArgumentException(
          "Invalid filter specification string");
      }
      tmpStr = tmpOptions[0];
      tmpOptions[0] = "";
      setFilter((Filter) Utils.forName(Filter.class, tmpStr, tmpOptions));
    } else {
      setFilter(new weka.filters.AllFilter());
    }

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -F &lt;filter specification&gt;
   *  Full class name of filter to use, followed
   *  by filter options.
   *  eg: "weka.filters.unsupervised.attribute.Remove -V -R 1,2"
   * (default: weka.filters.AllFilter)</pre>
   * 
   * <pre> -W
   *  Full name of base clusterer.
   *  (default: weka.clusterers.SimpleKMeans)</pre>
   * 
   * <pre> 
   * Options specific to clusterer weka.clusterers.SimpleKMeans:
   * </pre>
   * 
   * <pre> -N &lt;num&gt;
   *  number of clusters.
   *  (default 2).</pre>
   * 
   * <pre> -V
   *  Display std. deviations for centroids.
   * </pre>
   * 
   * <pre> -M
   *  Replace missing values with mean/mode.
   * </pre>
   * 
   * <pre> -S &lt;num&gt;
   *  Random number seed.
   *  (default 10)</pre>
   * 
   <!-- options-end -->
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    String[]	tmpOptions;
    
    tmpStr = Utils.getOption('F', options);
    if (tmpStr.length() > 0) {
      tmpOptions = Utils.splitOptions(tmpStr);
      if (tmpOptions.length == 0)
	throw new IllegalArgumentException("Invalid filter specification string");
      tmpStr = tmpOptions[0];
      tmpOptions[0] = "";
      setFilter((Filter) Utils.forName(Filter.class, tmpStr, tmpOptions));
    } 
    else {
      setFilter(new weka.filters.AllFilter());
    }
    
    super.setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the clusterer.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    result.addElement("-F");
    result.addElement(getFilterSpec());

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector	result;
    String[]	options;
    int		i;
    
    result = new Vector();
    
    result.add("-F");
    result.add(getFilterSpec());
    
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return (String[]) result.toArray(new String[result.size()]);
  }
  
  /**
   * Returns the tip text for this property.
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String filterTipText() {
    return "The filter to be used.";
  }

  /**
   * Sets the filter.
<<<<<<< HEAD
   * 
   * @param filter the filter with all options set.
   */
  public void setFilter(Filter filter) {
    m_Filter = filter;

    if (m_Filter instanceof SupervisedFilter) {
      System.out
        .println("WARNING: you are using a supervised filter, which will leak "
          + "information about the class attribute!");
    }
=======
   *
   * @param filter 	the filter with all options set.
   */
  public void setFilter(Filter filter) {
    m_Filter = filter;
    
    if (m_Filter instanceof SupervisedFilter)
      System.out.println(
	  "WARNING: you are using a supervised filter, which will leak "
	  + "information about the class attribute!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the filter used.
<<<<<<< HEAD
   * 
   * @return the filter
=======
   *
   * @return 		the filter
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Filter getFilter() {
    return m_Filter;
  }
<<<<<<< HEAD

  /**
   * Gets the filter specification string, which contains the class name of the
   * filter and any options to the filter.
   * 
   * @return the filter string.
   */
  protected String getFilterSpec() {
    String result;
    Filter filter;

    filter = getFilter();
    result = filter.getClass().getName();

    if (filter instanceof OptionHandler) {
      result += " " + Utils.joinOptions(((OptionHandler) filter).getOptions());
    }

=======
  
  /**
   * Gets the filter specification string, which contains the class name of
   * the filter and any options to the filter.
   *
   * @return 		the filter string.
   */
  protected String getFilterSpec() {
    String	result;
    Filter 	filter;
    
    filter = getFilter();
    result = filter.getClass().getName();
    
    if (filter instanceof OptionHandler)
      result += " " + Utils.joinOptions(((OptionHandler) filter).getOptions());
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Returns default capabilities of the clusterer.
<<<<<<< HEAD
   * 
   * @return the capabilities of this clusterer
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;

=======
   *
   * @return		the capabilities of this clusterer
   */
  public Capabilities getCapabilities() {
    Capabilities	result;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (getFilter() == null) {
      result = super.getCapabilities();
      result.disableAll();
      result.enable(Capability.NO_CLASS);
    } else {
      result = getFilter().getCapabilities();
    }
<<<<<<< HEAD

    // set dependencies
    for (Capability cap : Capability.values()) {
      result.enableDependency(cap);
    }

=======
    
    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Build the clusterer on the filtered data.
<<<<<<< HEAD
   * 
   * @param data the training data
   * @throws Exception if the clusterer could not be built successfully
   */
  @Override
  public void buildClusterer(Instances data) throws Exception {
    if (m_Clusterer == null) {
      throw new Exception("No base clusterer has been set!");
    }
=======
   *
   * @param data 	the training data
   * @throws Exception 	if the clusterer could not be built successfully
   */
  public void buildClusterer(Instances data) throws Exception {
    if (m_Clusterer == null)
      throw new Exception("No base clusterer has been set!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // remove instances with missing class
    if (data.classIndex() > -1) {
      data = new Instances(data);
      data.deleteWithMissingClass();
    }
<<<<<<< HEAD

    m_Filter.setInputFormat(data); // filter capabilities are checked here
=======
    
    m_Filter.setInputFormat(data);  // filter capabilities are checked here
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    data = Filter.useFilter(data, m_Filter);

    // can clusterer handle the data?
    getClusterer().getCapabilities().testWithFail(data);

    m_FilteredInstances = data.stringFreeStructure();
    m_Clusterer.buildClusterer(data);
  }

  /**
   * Classifies a given instance after filtering.
<<<<<<< HEAD
   * 
   * @param instance the instance to be classified
   * @return the class distribution for the given instance
   * @throws Exception if instance could not be classified successfully
   */
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {

    if (m_Filter.numPendingOutput() > 0) {
      throw new Exception("Filter output queue not empty!");
    }

    if (!m_Filter.input(instance)) {
      throw new Exception(
        "Filter didn't make the test instance immediately available!");
    }

=======
   *
   * @param instance 	the instance to be classified
   * @return 		the class distribution for the given instance
   * @throws Exception 	if instance could not be classified
   * 			successfully
   */
  public double[] distributionForInstance(Instance instance)
    throws Exception {

    if (m_Filter.numPendingOutput() > 0)
      throw new Exception("Filter output queue not empty!");
    
    if (!m_Filter.input(instance))
      throw new Exception(
	  "Filter didn't make the test instance immediately available!");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_Filter.batchFinished();
    Instance newInstance = m_Filter.output();

    return m_Clusterer.distributionForInstance(newInstance);
  }

  /**
   * Output a representation of this clusterer.
   * 
<<<<<<< HEAD
   * @return a representation of this clusterer
   */
  @Override
  public String toString() {
    String result;

    if (m_FilteredInstances == null) {
      result = "FilteredClusterer: No model built yet.";
    } else {
      result = "FilteredClusterer using " + getClustererSpec()
        + " on data filtered through " + getFilterSpec()
        + "\n\nFiltered Header\n" + m_FilteredInstances.toString()
        + "\n\nClusterer Model\n" + m_Clusterer.toString();
    }

    return result;
  }

  /**
   * Returns the type of graph this clusterer represents.
   *
   * @return the graph type of this clusterer
   */
  public int graphType() {

    if (m_Clusterer instanceof Drawable)
      return ((Drawable) m_Clusterer).graphType();
    else
      return Drawable.NOT_DRAWABLE;
  }

  /**
   * Returns graph describing the clusterer (if possible).
   *
   * @return the graph of the clusterer in dotty format
   * @throws Exception if the clusterer cannot be graphed
   */
  public String graph() throws Exception {

    if (m_Clusterer instanceof Drawable)
      return ((Drawable) m_Clusterer).graph();
    else
      throw new Exception(
              "Clusterer: " + getClustererSpec() + " cannot be graphed");
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14132 $");
=======
   * @return 		a representation of this clusterer
   */
  public String toString() {
    String 	result;
    
    if (m_FilteredInstances == null)
      result = "FilteredClusterer: No model built yet.";
    else
      result = "FilteredClusterer using "
	+ getClustererSpec()
	+ " on data filtered through "
	+ getFilterSpec()
	+ "\n\nFiltered Header\n"
	+ m_FilteredInstances.toString()
	+ "\n\nClusterer Model\n"
	+ m_Clusterer.toString();
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5538 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param args the commandline options, use "-h" for help
   */
  public static void main(String[] args) {
    runClusterer(new FilteredClusterer(), args);
  }
}
=======
   *
   * @param args 	the commandline options, use "-h" for help
   */
  public static void main(String [] args) {
    runClusterer(new FilteredClusterer(), args);
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
