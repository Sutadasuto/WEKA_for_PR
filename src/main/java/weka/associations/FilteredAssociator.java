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
 *    FilteredAssociator.java
<<<<<<< HEAD
 *    Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.associations;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.filters.Filter;
import weka.filters.MultiFilter;

/**
 * <!-- globalinfo-start --> Class for running an arbitrary associator on data
 * that has been passed through an arbitrary filter. Like the associator, the
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
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.MultiFilter;

import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Class for running an arbitrary associator on data that has been passed through an arbitrary filter. Like the associator, the structure of the filter is based exclusively on the training data and test instances will be processed by the filter without changing their structure.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -F &lt;filter specification&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *  Full class name of filter to use, followed
 *  by filter options.
 *  eg: "weka.filters.unsupervised.attribute.Remove -V -R 1,2"
 *  (default: weka.filters.MultiFilter with
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *  weka.filters.unsupervised.attribute.ReplaceMissingValues)
 * </pre>
 * 
 * <pre>
 * -c &lt;the class index&gt;
 *  The class index.
 *  (default: -1, i.e. unset)
 * </pre>
 * 
 * <pre>
 * -W
 *  Full name of base associator.
 *  (default: weka.associations.Apriori)
 * </pre>
 * 
 * <pre>
 * Options specific to associator weka.associations.Apriori:
 * </pre>
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
 * -c &lt;the class index&gt;
 *  The class index. (default = last)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10172 $
 */
public class FilteredAssociator extends SingleAssociatorEnhancer implements
  AssociationRulesProducer {

  /** for serialization */
  static final long serialVersionUID = -4523450618538717400L;

<<<<<<< HEAD
=======
=======
 *  weka.filters.unsupervised.attribute.ReplaceMissingValues)</pre>
 * 
 * <pre> -c &lt;the class index&gt;
 *  The class index.
 *  (default: -1, i.e. unset)</pre>
 * 
 * <pre> -W
 *  Full name of base associator.
 *  (default: weka.associations.Apriori)</pre>
 * 
 * <pre> 
 * Options specific to associator weka.associations.Apriori:
 * </pre>
 * 
 * <pre> -N &lt;required number of rules output&gt;
 *  The required number of rules. (default = 10)</pre>
 * 
 * <pre> -T &lt;0=confidence | 1=lift | 2=leverage | 3=Conviction&gt;
 *  The metric type by which to rank rules. (default = confidence)</pre>
 * 
 * <pre> -C &lt;minimum metric score of a rule&gt;
 *  The minimum confidence of a rule. (default = 0.9)</pre>
 * 
 * <pre> -D &lt;delta for minimum support&gt;
 *  The delta by which the minimum support is decreased in
 *  each iteration. (default = 0.05)</pre>
 * 
 * <pre> -U &lt;upper bound for minimum support&gt;
 *  Upper bound for minimum support. (default = 1.0)</pre>
 * 
 * <pre> -M &lt;lower bound for minimum support&gt;
 *  The lower bound for the minimum support. (default = 0.1)</pre>
 * 
 * <pre> -S &lt;significance level&gt;
 *  If used, rules are tested for significance at
 *  the given level. Slower. (default = no significance testing)</pre>
 * 
 * <pre> -I
 *  If set the itemsets found are also output. (default = no)</pre>
 * 
 * <pre> -R
 *  Remove columns that contain all missing values (default = no)</pre>
 * 
 * <pre> -V
 *  Report progress iteratively. (default = no)</pre>
 * 
 * <pre> -A
 *  If set class association rules are mined. (default = no)</pre>
 * 
 * <pre> -c &lt;the class index&gt;
 *  The class index. (default = last)</pre>
 * 
 <!-- options-end -->
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 5504 $
 */
public class FilteredAssociator 
  extends SingleAssociatorEnhancer {

  /** for serialization */
  static final long serialVersionUID = -4523450618538717400L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The filter */
  protected Filter m_Filter;

  /** The instance structure of the filtered instances */
  protected Instances m_FilteredInstances;
<<<<<<< HEAD

  /** The class index. */
=======
<<<<<<< HEAD

  /** The class index. */
=======
  
  /** The class index. */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected int m_ClassIndex;

  /**
   * Default constructor.
   */
  public FilteredAssociator() {
    m_Associator = new Apriori();
<<<<<<< HEAD
    m_Filter = new MultiFilter();
    ((MultiFilter) m_Filter)
      .setFilters(new Filter[] { new weka.filters.unsupervised.attribute.ReplaceMissingValues() });
=======
<<<<<<< HEAD
    m_Filter = new MultiFilter();
    ((MultiFilter) m_Filter)
      .setFilters(new Filter[] { new weka.filters.unsupervised.attribute.ReplaceMissingValues() });
=======
    m_Filter     = new MultiFilter();
    ((MultiFilter) m_Filter).setFilters(new Filter[]{
	new weka.filters.unsupervised.attribute.ReplaceMissingValues()});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_ClassIndex = -1;
  }

  /**
   * Returns a string describing this Associator
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a description of the Associator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Class for running an arbitrary associator on data that has been passed "
<<<<<<< HEAD
=======
=======
   * @return 		a description of the Associator suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return   
        "Class for running an arbitrary associator on data that has been passed "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "through an arbitrary filter. Like the associator, the structure of the filter "
      + "is based exclusively on the training data and test instances will be processed "
      + "by the filter without changing their structure.";
  }

  /**
   * String describing default associator.
   * 
<<<<<<< HEAD
   * @return the default associator classname
   */
  @Override
=======
<<<<<<< HEAD
   * @return the default associator classname
   */
  @Override
=======
   * @return 		the default associator classname
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected String defaultAssociatorString() {
    return Apriori.class.getName();
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
      "\tFull class name of filter to use, followed\n"
        + "\tby filter options.\n"
        + "\teg: \"weka.filters.unsupervised.attribute.Remove -V -R 1,2\"\n"
        + "\t(default: weka.filters.MultiFilter with\n"
        + "\tweka.filters.unsupervised.attribute.ReplaceMissingValues)", "F",
      1, "-F <filter specification>"));

    result.addElement(new Option("\tThe class index.\n"
      + "\t(default: -1, i.e. unset)", "c", 1, "-c <the class index>"));

    result.addAll(Collections.list(super.listOptions()));
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
	"\tFull class name of filter to use, followed\n"
	+ "\tby filter options.\n"
	+ "\teg: \"weka.filters.unsupervised.attribute.Remove -V -R 1,2\"\n"
	+ "\t(default: weka.filters.MultiFilter with\n"
	+ "\tweka.filters.unsupervised.attribute.ReplaceMissingValues)",
	"F", 1, "-F <filter specification>"));

    result.addElement(new Option(
	"\tThe class index.\n"
	+ "\t(default: -1, i.e. unset)", 
	"c", 1, "-c <the class index>"));
    
    Enumeration enm = super.listOptions();
    while (enm.hasMoreElements())
      result.addElement(enm.nextElement());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.elements();
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
   * -F &lt;filter specification&gt;
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -F &lt;filter specification&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *  Full class name of filter to use, followed
   *  by filter options.
   *  eg: "weka.filters.unsupervised.attribute.Remove -V -R 1,2"
   *  (default: weka.filters.MultiFilter with
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *  weka.filters.unsupervised.attribute.ReplaceMissingValues)
   * </pre>
   * 
   * <pre>
   * -c &lt;the class index&gt;
   *  The class index.
   *  (default: -1, i.e. unset)
   * </pre>
   * 
   * <pre>
   * -W
   *  Full name of base associator.
   *  (default: weka.associations.Apriori)
   * </pre>
   * 
   * <pre>
   * Options specific to associator weka.associations.Apriori:
   * </pre>
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
   * -c &lt;the class index&gt;
   *  The class index. (default = last)
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

    tmpStr = Utils.getOption('F', options);
    if (tmpStr.length() > 0) {
      String[] filterSpec = Utils.splitOptions(tmpStr);
      if (filterSpec.length == 0) {
        throw new IllegalArgumentException(
          "Invalid filter specification string");
      }
      String filterName = filterSpec[0];
      filterSpec[0] = "";
      setFilter((Filter) Utils.forName(Filter.class, filterName, filterSpec));
    } else {
      setFilter(new weka.filters.supervised.attribute.Discretize());
    }

<<<<<<< HEAD
=======
=======
   *  weka.filters.unsupervised.attribute.ReplaceMissingValues)</pre>
   * 
   * <pre> -c &lt;the class index&gt;
   *  The class index.
   *  (default: -1, i.e. unset)</pre>
   * 
   * <pre> -W
   *  Full name of base associator.
   *  (default: weka.associations.Apriori)</pre>
   * 
   * <pre> 
   * Options specific to associator weka.associations.Apriori:
   * </pre>
   * 
   * <pre> -N &lt;required number of rules output&gt;
   *  The required number of rules. (default = 10)</pre>
   * 
   * <pre> -T &lt;0=confidence | 1=lift | 2=leverage | 3=Conviction&gt;
   *  The metric type by which to rank rules. (default = confidence)</pre>
   * 
   * <pre> -C &lt;minimum metric score of a rule&gt;
   *  The minimum confidence of a rule. (default = 0.9)</pre>
   * 
   * <pre> -D &lt;delta for minimum support&gt;
   *  The delta by which the minimum support is decreased in
   *  each iteration. (default = 0.05)</pre>
   * 
   * <pre> -U &lt;upper bound for minimum support&gt;
   *  Upper bound for minimum support. (default = 1.0)</pre>
   * 
   * <pre> -M &lt;lower bound for minimum support&gt;
   *  The lower bound for the minimum support. (default = 0.1)</pre>
   * 
   * <pre> -S &lt;significance level&gt;
   *  If used, rules are tested for significance at
   *  the given level. Slower. (default = no significance testing)</pre>
   * 
   * <pre> -I
   *  If set the itemsets found are also output. (default = no)</pre>
   * 
   * <pre> -R
   *  Remove columns that contain all missing values (default = no)</pre>
   * 
   * <pre> -V
   *  Report progress iteratively. (default = no)</pre>
   * 
   * <pre> -A
   *  If set class association rules are mined. (default = no)</pre>
   * 
   * <pre> -c &lt;the class index&gt;
   *  The class index. (default = last)</pre>
   * 
   <!-- options-end -->
   *
   * @param options 	the list of options as an array of strings
   * @throws Exception	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption('F', options);
    if (tmpStr.length() > 0) {
      String[] filterSpec = Utils.splitOptions(tmpStr);
      if (filterSpec.length == 0)
	throw new IllegalArgumentException("Invalid filter specification string");
      String filterName = filterSpec[0];
      filterSpec[0] = "";
      setFilter((Filter) Utils.forName(Filter.class, filterName, filterSpec));
    }
    else {
      setFilter(new weka.filters.supervised.attribute.Discretize());
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    tmpStr = Utils.getOption('c', options);
    if (tmpStr.length() > 0) {
      if (tmpStr.equalsIgnoreCase("last")) {
        setClassIndex(0);
      } else if (tmpStr.equalsIgnoreCase("first")) {
        setClassIndex(1);
      } else {
        setClassIndex(Integer.parseInt(tmpStr));
      }
    } else {
      setClassIndex(-1);
    }

    super.setOptions(options);
  }

  /**
   * Gets the current settings of the Associator.
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

<<<<<<< HEAD
=======
=======
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector<String>    	result;
    int       		i;
    String[]  		options;

    result = new Vector<String>();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.add("-F");
    result.add("" + getFilterSpec());

    result.add("-c");
    result.add("" + getClassIndex());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
    
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return result.toArray(new String[result.size()]);	  
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String filterTipText() {
    return "The filter to be used.";
  }

  /**
   * Sets the filter
<<<<<<< HEAD
   * 
   * @param value the filter with all options set.
=======
<<<<<<< HEAD
   * 
   * @param value the filter with all options set.
=======
   *
   * @param value 	the filter with all options set.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setFilter(Filter value) {
    m_Filter = value;
  }

  /**
   * Gets the filter used.
<<<<<<< HEAD
   * 
   * @return the current filter
=======
<<<<<<< HEAD
   * 
   * @return the current filter
=======
   *
   * @return 		the current filter
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Filter getFilter() {
    return m_Filter;
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
  public String classIndexTipText() {
    return "Index of the class attribute. If set to -1, the last attribute is taken as class attribute.";
  }

  /**
   * Sets the class index
   * 
<<<<<<< HEAD
   * @param value the class index
   */
  public void setClassIndex(int value) {
=======
<<<<<<< HEAD
   * @param value the class index
   */
  public void setClassIndex(int value) {
=======
   * @param value 	the class index
   */  
  public void setClassIndex(int value){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_ClassIndex = value;
  }

  /**
   * Gets the class index
   * 
<<<<<<< HEAD
   * @return the index of the class attribute
   */
  public int getClassIndex() {
=======
<<<<<<< HEAD
   * @return the index of the class attribute
   */
  public int getClassIndex() {
=======
   * @return 		the index of the class attribute
   */  
  public int getClassIndex(){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_ClassIndex;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the filter specification string, which contains the class name of the
   * filter and any options to the filter
   * 
   * @return the filter string.
   */
  protected String getFilterSpec() {
    Filter c = getFilter();

    if (c instanceof OptionHandler) {
      return c.getClass().getName() + " "
        + Utils.joinOptions(((OptionHandler) c).getOptions());
    } else {
      return c.getClass().getName();
    }
<<<<<<< HEAD
=======
=======
   * Gets the filter specification string, which contains the class name of
   * the filter and any options to the filter
   *
   * @return 		the filter string.
   */
  protected String getFilterSpec() {
    Filter c = getFilter();
    
    if (c instanceof OptionHandler)
      return   c.getClass().getName() + " " 
      	     + Utils.joinOptions(((OptionHandler)c).getOptions());
    else
      return c.getClass().getName();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns default capabilities of the associator.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of this associator
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;

    if (getFilter() == null) {
      result = super.getCapabilities();
      result.disableAll();
    } else {
      result = getFilter().getCapabilities();
    }

    result.enable(Capability.NO_CLASS);

    // set dependencies
    for (Capability cap : Capability.values()) {
      result.enableDependency(cap);
    }

<<<<<<< HEAD
=======
=======
   *
   * @return      the capabilities of this associator
   */
  public Capabilities getCapabilities() {
    Capabilities	result;
    
    if (getFilter() == null) {
      result = super.getCapabilities();
    } else {
      result = getFilter().getCapabilities();
    }
    
    result.enable(Capability.NO_CLASS);
    
    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Build the associator on the filtered data.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param data the training data
   * @throws Exception if the Associator could not be built successfully
   */
  @Override
  public void buildAssociations(Instances data) throws Exception {
    if (m_Associator == null) {
      throw new Exception("No base associator has been set!");
    }
<<<<<<< HEAD
=======
=======
   *
   * @param data 	the training data
   * @throws Exception	if the Associator could not be built successfully
   */
  public void buildAssociations(Instances data) throws Exception {
    if (m_Associator == null)
      throw new Exception("No base associator has been set!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // create copy and set class-index
    data = new Instances(data);
    if (getClassIndex() == 0) {
      data.setClassIndex(data.numAttributes() - 1);
    } else {
      data.setClassIndex(getClassIndex() - 1);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (getClassIndex() != -1) {
      // remove instances with missing class
      data.deleteWithMissingClass();
    }
<<<<<<< HEAD

    m_Filter.setInputFormat(data); // filter capabilities are checked here
=======
<<<<<<< HEAD

    m_Filter.setInputFormat(data); // filter capabilities are checked here
=======
    
    m_Filter.setInputFormat(data);  // filter capabilities are checked here
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    data = Filter.useFilter(data, m_Filter);

    // can associator handle the data?
    getAssociator().getCapabilities().testWithFail(data);

    m_FilteredInstances = data.stringFreeStructure();
    m_Associator.buildAssociations(data);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the list of mined association rules.
   * 
   * @return the list of association rules discovered during mining. Returns
   *         null if mining hasn't been performed yet.
   */
  @Override
  public AssociationRules getAssociationRules() {
    if (m_Associator instanceof AssociationRulesProducer) {
      AssociationRules rules = ((AssociationRulesProducer) m_Associator)
        .getAssociationRules();

      // construct a new FilteredAssociationRules
      FilteredAssociationRules fRules = new FilteredAssociationRules(
        FilteredAssociator.this, m_Filter, rules);

      return fRules;
    }

    // return null if we don't wrap an association rules producer
    return null;
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
    if (m_Associator instanceof AssociationRulesProducer) {
      return ((AssociationRulesProducer) m_Associator).getRuleMetricNames();
    }

    return new String[0];
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
    if (m_Associator instanceof AssociationRulesProducer) {
      return ((AssociationRulesProducer) m_Associator).canProduceRules();
    }

    return false;
  }

  /**
   * Output a representation of this associator
   * 
   * @return a representation of this associator
   */
  @Override
  public String toString() {
    String result;

    if (m_FilteredInstances == null) {
      result = "FilteredAssociator: No model built yet.";
    } else {
      result = "FilteredAssociator using " + getAssociatorSpec()
        + " on data filtered through " + getFilterSpec()
        + "\n\nFiltered Header\n" + m_FilteredInstances.toString()
        + "\n\nAssociator Model\n" + m_Associator.toString();
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
    return RevisionUtils.extract("$Revision: 10172 $");
<<<<<<< HEAD
=======
=======
   * Output a representation of this associator
   * 
   * @return 		a representation of this associator
   */
  public String toString() {
    String 	result;
    
    if (m_FilteredInstances == null) {
      result = "FilteredAssociator: No model built yet.";
    }
    else {
      result = "FilteredAssociator using "
	+ getAssociatorSpec()
	+ " on data filtered through "
	+ getFilterSpec()
	+ "\n\nFiltered Header\n"
	+ m_FilteredInstances.toString()
	+ "\n\nAssociator Model\n"
	+ m_Associator.toString();
    }
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5504 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for running this class.
<<<<<<< HEAD
   * 
   * @param args commandline arguments, use "-h" for full list
=======
<<<<<<< HEAD
   * 
   * @param args commandline arguments, use "-h" for full list
=======
   *
   * @param args 	commandline arguments, use "-h" for full list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    runAssociator(new FilteredAssociator(), args);
  }
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
