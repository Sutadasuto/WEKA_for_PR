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
 *    PairedTTester.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.experiment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

import weka.core.Attribute;
<<<<<<< HEAD
=======
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.experiment;

import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Range;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Calculates T-Test statistics on data stored in a set of instances.
 * <p/>
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D &lt;index,index2-index4,...&gt;
 *  Specify list of columns that specify a unique
 *  dataset.
 *  First and last are valid indexes. (default none)
 * </pre>
 * 
 * <pre>
 * -R &lt;index&gt;
 *  Set the index of the column containing the run number
 * </pre>
 * 
 * <pre>
 * -F &lt;index&gt;
 *  Set the index of the column containing the fold number
 * </pre>
 * 
 * <pre>
 * -G &lt;index1,index2-index4,...&gt;
 *  Specify list of columns that specify a unique
 *  'result generator' (eg: classifier name and options).
 *  First and last are valid indexes. (default none)
 * </pre>
 * 
 * <pre>
 * -S &lt;significance level&gt;
 *  Set the significance level for comparisons (default 0.05)
 * </pre>
 * 
 * <pre>
 * -V
 *  Show standard deviations
 * </pre>
 * 
 * <pre>
 * -L
 *  Produce table comparisons in Latex table format
 * </pre>
 * 
 * <pre>
 * -csv
 *  Produce table comparisons in CSV table format
 * </pre>
 * 
 * <pre>
 * -html
 *  Produce table comparisons in HTML table format
 * </pre>
 * 
 * <pre>
 * -significance
 *  Produce table comparisons with only the significance values
 * </pre>
 * 
 * <pre>
 * -gnuplot
 *  Produce table comparisons output suitable for GNUPlot
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 11542 $
 */
public class PairedTTester implements OptionHandler, Tester, RevisionHandler {

<<<<<<< HEAD
=======
=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Calculates T-Test statistics on data stored in a set of instances. <p/>
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D &lt;index,index2-index4,...&gt;
 *  Specify list of columns that specify a unique
 *  dataset.
 *  First and last are valid indexes. (default none)</pre>
 * 
 * <pre> -R &lt;index&gt;
 *  Set the index of the column containing the run number</pre>
 * 
 * <pre> -F &lt;index&gt;
 *  Set the index of the column containing the fold number</pre>
 * 
 * <pre> -G &lt;index1,index2-index4,...&gt;
 *  Specify list of columns that specify a unique
 *  'result generator' (eg: classifier name and options).
 *  First and last are valid indexes. (default none)</pre>
 * 
 * <pre> -S &lt;significance level&gt;
 *  Set the significance level for comparisons (default 0.05)</pre>
 * 
 * <pre> -V
 *  Show standard deviations</pre>
 * 
 * <pre> -L
 *  Produce table comparisons in Latex table format</pre>
 * 
 * <pre> -csv
 *  Produce table comparisons in CSV table format</pre>
 * 
 * <pre> -html
 *  Produce table comparisons in HTML table format</pre>
 * 
 * <pre> -significance
 *  Produce table comparisons with only the significance values</pre>
 * 
 * <pre> -gnuplot
 *  Produce table comparisons output suitable for GNUPlot</pre>
 * 
 <!-- options-end -->
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 6431 $
 */
public class PairedTTester 
  implements OptionHandler, Tester, RevisionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = 8370014624008728610L;

  /** The set of instances we will analyse */
  protected Instances m_Instances;

  /** The index of the column containing the run number */
  protected int m_RunColumn = 0;

  /** The option setting for the run number column (-1 means last) */
  protected int m_RunColumnSet = -1;

  /** The option setting for the fold number column (-1 means none) */
  protected int m_FoldColumn = -1;

  /** The column to sort on (-1 means default sorting) */
  protected int m_SortColumn = -1;

  /** The sorting of the datasets (according to the sort column) */
  protected int[] m_SortOrder = null;

  /** The sorting of the columns (test base is always first) */
  protected int[] m_ColOrder = null;

  /** The significance level for comparisons */
  protected double m_SignificanceLevel = 0.05;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * The range of columns that specify a unique "dataset" (eg: scheme plus
   * configuration)
   */
  protected Range m_DatasetKeyColumnsRange = new Range();

  /** An array containing the indexes of just the selected columns */
  protected int[] m_DatasetKeyColumns;

  /** The list of dataset specifiers */
  protected DatasetSpecifiers m_DatasetSpecifiers = new DatasetSpecifiers();

  /**
   * The range of columns that specify a unique result set (eg: scheme plus
   * configuration)
   */
  protected Range m_ResultsetKeyColumnsRange = new Range();

  /** An array containing the indexes of just the selected columns */
  protected int[] m_ResultsetKeyColumns;
<<<<<<< HEAD
=======
=======
   * The range of columns that specify a unique "dataset"
   * (eg: scheme plus configuration)
   */
  protected Range m_DatasetKeyColumnsRange = new Range();

  /** An array containing the indexes of just the selected columns */ 
  protected int [] m_DatasetKeyColumns;

  /** The list of dataset specifiers */
  protected DatasetSpecifiers m_DatasetSpecifiers = 
    new DatasetSpecifiers();

  /**
   * The range of columns that specify a unique result set
   * (eg: scheme plus configuration)
   */
  protected Range m_ResultsetKeyColumnsRange = new Range();

  /** An array containing the indexes of just the selected columns */ 
  protected int [] m_ResultsetKeyColumns;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** An array containing the indexes of the datasets to display */
  protected int[] m_DisplayedResultsets = null;

  /** Stores a vector for each resultset holding all instances in each set */
<<<<<<< HEAD
  protected ArrayList<Resultset> m_Resultsets = new ArrayList<Resultset>();
=======
<<<<<<< HEAD
  protected ArrayList<Resultset> m_Resultsets = new ArrayList<Resultset>();
=======
  protected FastVector m_Resultsets = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Indicates whether the instances have been partitioned */
  protected boolean m_ResultsetsValid;

  /** Indicates whether standard deviations should be displayed */
  protected boolean m_ShowStdDevs = false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the instance of the class to produce the output. */
  protected ResultMatrix m_ResultMatrix = new ResultMatrixPlainText();

  /** A list of unique "dataset" specifiers that have been observed */
  protected class DatasetSpecifiers implements RevisionHandler, Serializable {

    /** for serialization. */
    private static final long serialVersionUID = -9020938059902723401L;

    /** the specifiers that have been observed */
    ArrayList<Instance> m_Specifiers = new ArrayList<Instance>();
<<<<<<< HEAD
=======
=======
  
  /** the instance of the class to produce the output. */
  protected ResultMatrix m_ResultMatrix = new ResultMatrixPlainText();
  
  /** A list of unique "dataset" specifiers that have been observed */
  protected class DatasetSpecifiers
    implements RevisionHandler {

    /** the specifiers that have been observed */
    FastVector m_Specifiers = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Removes all specifiers.
     */
    protected void removeAllSpecifiers() {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_Specifiers.clear();
    }

    /**
     * Add an instance to the list of specifiers (if necessary)
     * 
     * @param inst the instance to add
     */
    protected void add(Instance inst) {

      for (int i = 0; i < m_Specifiers.size(); i++) {
        Instance specifier = m_Specifiers.get(i);
        boolean found = true;
        for (int m_DatasetKeyColumn : m_DatasetKeyColumns) {
          if (inst.value(m_DatasetKeyColumn) != specifier
            .value(m_DatasetKeyColumn)) {
            found = false;
          }
        }
        if (found) {
          return;
        }
      }
      m_Specifiers.add(inst);
<<<<<<< HEAD
=======
=======
      m_Specifiers.removeAllElements();
    }

    /** 
     * Add an instance to the list of specifiers (if necessary)
     * 
     * @param inst	the instance to add
     */
    protected void add(Instance inst) {
      
      for (int i = 0; i < m_Specifiers.size(); i++) {
	Instance specifier = (Instance)m_Specifiers.elementAt(i);
	boolean found = true;
	for (int j = 0; j < m_DatasetKeyColumns.length; j++) {
	  if (inst.value(m_DatasetKeyColumns[j]) !=
	      specifier.value(m_DatasetKeyColumns[j])) {
	    found = false;
	  }
	}
	if (found) {
	  return;
	}
      }
      m_Specifiers.addElement(inst);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    /**
     * Get the template at the given position.
     * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param i the index
     * @return the template
     */
    protected Instance specifier(int i) {

      return m_Specifiers.get(i);
<<<<<<< HEAD
=======
=======
     * @param i		the index
     * @return		the template
     */
    protected Instance specifier(int i) {

      return (Instance)m_Specifiers.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    /**
     * Gets the number of specifiers.
     * 
<<<<<<< HEAD
     * @return the current number of specifiers
=======
<<<<<<< HEAD
     * @return the current number of specifiers
=======
     * @return		the current number of specifiers
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    protected int numSpecifiers() {

      return m_Specifiers.size();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 11542 $");
<<<<<<< HEAD
=======
=======
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 6431 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /** Utility class to store the instances pertaining to a dataset */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected class Dataset implements RevisionHandler, Serializable {

    /** for serialization. */
    private static final long serialVersionUID = -2801397601839433282L;
<<<<<<< HEAD
=======
=======
  protected class Dataset
    implements RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /** the template */
    Instance m_Template;

    /** the dataset */
<<<<<<< HEAD
    ArrayList<Instance> m_Dataset;
=======
<<<<<<< HEAD
    ArrayList<Instance> m_Dataset;
=======
    FastVector m_Dataset;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Constructor
     * 
<<<<<<< HEAD
     * @param template the template
=======
<<<<<<< HEAD
     * @param template the template
=======
     * @param template	the template
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    public Dataset(Instance template) {

      m_Template = template;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_Dataset = new ArrayList<Instance>();
      add(template);
    }

    /**
     * Returns true if the two instances match on those attributes that have
     * been designated key columns (eg: scheme name and scheme options)
     * 
<<<<<<< HEAD
=======
=======
      m_Dataset = new FastVector();
      add(template);
    }
    
    /**
     * Returns true if the two instances match on those attributes that have
     * been designated key columns (eg: scheme name and scheme options)
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param first the first instance
     * @return true if first and second match on the currently set key columns
     */
    protected boolean matchesTemplate(Instance first) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      for (int m_DatasetKeyColumn : m_DatasetKeyColumns) {
        if (first.value(m_DatasetKeyColumn) != m_Template
          .value(m_DatasetKeyColumn)) {
          return false;
        }
<<<<<<< HEAD
=======
=======
      
      for (int i = 0; i < m_DatasetKeyColumns.length; i++) {
	if (first.value(m_DatasetKeyColumns[i]) !=
	    m_Template.value(m_DatasetKeyColumns[i])) {
	  return false;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      return true;
    }

    /**
     * Adds the given instance to the dataset
     * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param inst the instance to add
     */
    protected void add(Instance inst) {

      m_Dataset.add(inst);
<<<<<<< HEAD
=======
=======
     * @param inst	the instance to add
     */
    protected void add(Instance inst) {
      
      m_Dataset.addElement(inst);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    /**
     * Returns a vector containing the instances in the dataset
     * 
<<<<<<< HEAD
     * @return the current contents
     */
    protected ArrayList<Instance> contents() {
=======
<<<<<<< HEAD
     * @return the current contents
     */
    protected ArrayList<Instance> contents() {
=======
     * @return 		the current contents
     */
    protected FastVector contents() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      return m_Dataset;
    }

    /**
     * Sorts the instances in the dataset by the run number.
<<<<<<< HEAD
     * 
=======
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param runColumn a value of type 'int'
     */
    public void sort(int runColumn) {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      double[] runNums = new double[m_Dataset.size()];
      for (int j = 0; j < runNums.length; j++) {
        runNums[j] = m_Dataset.get(j).value(runColumn);
      }
      int[] index = Utils.stableSort(runNums);
      ArrayList<Instance> newDataset = new ArrayList<Instance>(runNums.length);
      for (int element : index) {
        newDataset.add(m_Dataset.get(element));
      }
      m_Dataset = newDataset;
    }

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 11542 $");
    }
  }

  /** Utility class to store the instances in a resultset */
  protected class Resultset implements RevisionHandler, Serializable {

    /** for serialization. */
    private static final long serialVersionUID = 1543786683821339978L;

    /** the template */
    Instance m_Template;

    /** the dataset */
    ArrayList<Dataset> m_Datasets;
<<<<<<< HEAD
=======
=======
      double [] runNums = new double [m_Dataset.size()];
      for (int j = 0; j < runNums.length; j++) {
	runNums[j] = ((Instance) m_Dataset.elementAt(j)).value(runColumn);
      }
      int [] index = Utils.stableSort(runNums);
      FastVector newDataset = new FastVector(runNums.length);
      for (int j = 0; j < index.length; j++) {
	newDataset.addElement(m_Dataset.elementAt(index[j]));
      }
      m_Dataset = newDataset;
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 6431 $");
    }
  }
 
  /** Utility class to store the instances in a resultset */
  protected class Resultset
    implements RevisionHandler {

    /** the template */
    Instance m_Template;
    
    /** the dataset */
    FastVector m_Datasets;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Constructir
     * 
<<<<<<< HEAD
     * @param template the template
=======
<<<<<<< HEAD
     * @param template the template
=======
     * @param template		the template
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    public Resultset(Instance template) {

      m_Template = template;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_Datasets = new ArrayList<Dataset>();
      add(template);
    }

    /**
     * Returns true if the two instances match on those attributes that have
     * been designated key columns (eg: scheme name and scheme options)
     * 
<<<<<<< HEAD
=======
=======
      m_Datasets = new FastVector();
      add(template);
    }
    
    /**
     * Returns true if the two instances match on those attributes that have
     * been designated key columns (eg: scheme name and scheme options)
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param first the first instance
     * @return true if first and second match on the currently set key columns
     */
    protected boolean matchesTemplate(Instance first) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      for (int m_ResultsetKeyColumn : m_ResultsetKeyColumns) {
        if (first.value(m_ResultsetKeyColumn) != m_Template
          .value(m_ResultsetKeyColumn)) {
          return false;
        }
<<<<<<< HEAD
=======
=======
      
      for (int i = 0; i < m_ResultsetKeyColumns.length; i++) {
	if (first.value(m_ResultsetKeyColumns[i]) !=
	    m_Template.value(m_ResultsetKeyColumns[i])) {
	  return false;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      return true;
    }

    /**
<<<<<<< HEAD
     * Returns a string descriptive of the resultset key column values for this
     * resultset
     * 
=======
<<<<<<< HEAD
     * Returns a string descriptive of the resultset key column values for this
     * resultset
     * 
=======
     * Returns a string descriptive of the resultset key column values
     * for this resultset
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @return a value of type 'String'
     */
    protected String templateString() {

      String result = "";
      String tempResult = "";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (int m_ResultsetKeyColumn : m_ResultsetKeyColumns) {
        tempResult = m_Template.toString(m_ResultsetKeyColumn) + ' ';

        // compact the string
        tempResult = Utils.removeSubstring(tempResult, "weka.classifiers.");
        tempResult = Utils.removeSubstring(tempResult, "weka.filters.");
        tempResult = Utils.removeSubstring(tempResult,
          "weka.attributeSelection.");
        result += tempResult;
      }
      return result.trim();
    }

    /**
     * Returns a vector containing all instances belonging to one dataset.
     * 
     * @param inst a template instance
     * @return a value of type 'FastVector'
     */
    public ArrayList<Instance> dataset(Instance inst) {

      for (int i = 0; i < m_Datasets.size(); i++) {
        if (m_Datasets.get(i).matchesTemplate(inst)) {
          return m_Datasets.get(i).contents();
        }
      }
      return null;
    }

    /**
     * Adds an instance to this resultset
     * 
     * @param newInst a value of type 'Instance'
     */
    public void add(Instance newInst) {

      for (int i = 0; i < m_Datasets.size(); i++) {
        if (m_Datasets.get(i).matchesTemplate(newInst)) {
          m_Datasets.get(i).add(newInst);
          return;
        }
      }
      Dataset newDataset = new Dataset(newInst);
      m_Datasets.add(newDataset);
<<<<<<< HEAD
=======
=======
      for (int i = 0; i < m_ResultsetKeyColumns.length; i++) {
	tempResult = m_Template.toString(m_ResultsetKeyColumns[i]) + ' ';

	// compact the string
        tempResult = Utils.removeSubstring(tempResult, "weka.classifiers.");
        tempResult = Utils.removeSubstring(tempResult, "weka.filters.");
        tempResult = Utils.removeSubstring(tempResult, "weka.attributeSelection.");
	result += tempResult;
      }
      return result.trim();
    }
    
    /**
     * Returns a vector containing all instances belonging to one dataset.
     *
     * @param inst a template instance
     * @return a value of type 'FastVector'
     */
    public FastVector dataset(Instance inst) {

      for (int i = 0; i < m_Datasets.size(); i++) {
	if (((Dataset)m_Datasets.elementAt(i)).matchesTemplate(inst)) {
	  return ((Dataset)m_Datasets.elementAt(i)).contents();
	} 
      }
      return null;
    }
    
    /**
     * Adds an instance to this resultset
     *
     * @param newInst a value of type 'Instance'
     */
    public void add(Instance newInst) {
      
      for (int i = 0; i < m_Datasets.size(); i++) {
	if (((Dataset)m_Datasets.elementAt(i)).matchesTemplate(newInst)) {
	  ((Dataset)m_Datasets.elementAt(i)).add(newInst);
	  return;
	}
      }
      Dataset newDataset = new Dataset(newInst);
      m_Datasets.addElement(newDataset);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    /**
     * Sorts the instances in each dataset by the run number.
<<<<<<< HEAD
     * 
=======
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param runColumn a value of type 'int'
     */
    public void sort(int runColumn) {

      for (int i = 0; i < m_Datasets.size(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_Datasets.get(i).sort(runColumn);
      }
    }

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 11542 $");
    }
  } // Resultset

  /**
   * Returns a string descriptive of the key column values for the "datasets
   * 
<<<<<<< HEAD
=======
=======
	((Dataset)m_Datasets.elementAt(i)).sort(runColumn);
      }
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 6431 $");
    }
  } // Resultset


  /**
   * Returns a string descriptive of the key column values for
   * the "datasets
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param template the template
   * @return a value of type 'String'
   */
  protected String templateString(Instance template) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    String result = "";
    for (int m_DatasetKeyColumn : m_DatasetKeyColumns) {
      result += template.toString(m_DatasetKeyColumn) + ' ';
<<<<<<< HEAD
=======
=======
    
    String result = "";
    for (int i = 0; i < m_DatasetKeyColumns.length; i++) {
      result += template.toString(m_DatasetKeyColumns[i]) + ' ';
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    if (result.startsWith("weka.classifiers.")) {
      result = result.substring("weka.classifiers.".length());
    }
    return result.trim();
  }

  /**
   * Sets the matrix to use to produce the output.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param matrix the instance to use to produce the output
   * @see ResultMatrix
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @param matrix the instance to use to produce the output
   * @see ResultMatrix
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setResultMatrix(ResultMatrix matrix) {
    m_ResultMatrix = matrix;
  }

  /**
   * Gets the instance that produces the output.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the instance to produce the output
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @return the instance to produce the output
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public ResultMatrix getResultMatrix() {
    return m_ResultMatrix;
  }

  /**
   * Set whether standard deviations are displayed or not.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param s true if standard deviations are to be displayed
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @param s true if standard deviations are to be displayed
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setShowStdDevs(boolean s) {
    m_ShowStdDevs = s;
  }

  /**
   * Returns true if standard deviations have been requested.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return true if standard deviations are to be displayed.
   */
  @Override
  public boolean getShowStdDevs() {
    return m_ShowStdDevs;
  }

  /**
   * Separates the instances into resultsets and by dataset/run.
   * 
<<<<<<< HEAD
=======
=======
   * @return true if standard deviations are to be displayed.
   */
  public boolean getShowStdDevs() {
    return m_ShowStdDevs;
  }
  
  /**
   * Separates the instances into resultsets and by dataset/run.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @throws Exception if the TTest parameters have not been set.
   */
  protected void prepareData() throws Exception {

    if (m_Instances == null) {
      throw new Exception("No instances have been set");
    }
    if (m_RunColumnSet == -1) {
      m_RunColumn = m_Instances.numAttributes() - 1;
    } else {
      m_RunColumn = m_RunColumnSet;
    }

    if (m_ResultsetKeyColumnsRange == null) {
      throw new Exception("No result specifier columns have been set");
    }
    m_ResultsetKeyColumnsRange.setUpper(m_Instances.numAttributes() - 1);
    m_ResultsetKeyColumns = m_ResultsetKeyColumnsRange.getSelection();

    if (m_DatasetKeyColumnsRange == null) {
      throw new Exception("No dataset specifier columns have been set");
    }
    m_DatasetKeyColumnsRange.setUpper(m_Instances.numAttributes() - 1);
    m_DatasetKeyColumns = m_DatasetKeyColumnsRange.getSelection();
<<<<<<< HEAD

    // Split the data up into result sets
    m_Resultsets.clear();
=======
<<<<<<< HEAD

    // Split the data up into result sets
    m_Resultsets.clear();
=======
    
    //  Split the data up into result sets
    m_Resultsets.removeAllElements();  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_DatasetSpecifiers.removeAllSpecifiers();
    for (int i = 0; i < m_Instances.numInstances(); i++) {
      Instance current = m_Instances.instance(i);
      if (current.isMissing(m_RunColumn)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        throw new Exception("Instance has missing value in run " + "column!\n"
          + current);
      }
      for (int m_ResultsetKeyColumn : m_ResultsetKeyColumns) {
        if (current.isMissing(m_ResultsetKeyColumn)) {
          throw new Exception("Instance has missing value in resultset key "
            + "column " + (m_ResultsetKeyColumn + 1) + "!\n" + current);
        }
      }
      for (int m_DatasetKeyColumn : m_DatasetKeyColumns) {
        if (current.isMissing(m_DatasetKeyColumn)) {
          throw new Exception("Instance has missing value in dataset key "
            + "column " + (m_DatasetKeyColumn + 1) + "!\n" + current);
        }
      }
      boolean found = false;
      for (int j = 0; j < m_Resultsets.size(); j++) {
        Resultset resultset = m_Resultsets.get(j);
        if (resultset.matchesTemplate(current)) {
          resultset.add(current);
          found = true;
          break;
        }
      }
      if (!found) {
        Resultset resultset = new Resultset(current);
        m_Resultsets.add(resultset);
<<<<<<< HEAD
=======
=======
	throw new Exception("Instance has missing value in run "
			    + "column!\n" + current);
      } 
      for (int j = 0; j < m_ResultsetKeyColumns.length; j++) {
	if (current.isMissing(m_ResultsetKeyColumns[j])) {
	  throw new Exception("Instance has missing value in resultset key "
			      + "column " + (m_ResultsetKeyColumns[j] + 1)
			      + "!\n" + current);
	}
      }
      for (int j = 0; j < m_DatasetKeyColumns.length; j++) {
	if (current.isMissing(m_DatasetKeyColumns[j])) {
	  throw new Exception("Instance has missing value in dataset key "
			      + "column " + (m_DatasetKeyColumns[j] + 1)
			      + "!\n" + current);
	}
      }
      boolean found = false;
      for (int j = 0; j < m_Resultsets.size(); j++) {
	Resultset resultset = (Resultset) m_Resultsets.elementAt(j);
	if (resultset.matchesTemplate(current)) {
	  resultset.add(current);
	  found = true;
	  break;
	}
      }
      if (!found) {
	Resultset resultset = new Resultset(current);
	m_Resultsets.addElement(resultset);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      m_DatasetSpecifiers.add(current);
    }

    // Tell each resultset to sort on the run column
    for (int j = 0; j < m_Resultsets.size(); j++) {
<<<<<<< HEAD
      Resultset resultset = m_Resultsets.get(j);
=======
<<<<<<< HEAD
      Resultset resultset = m_Resultsets.get(j);
=======
      Resultset resultset = (Resultset) m_Resultsets.elementAt(j);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (m_FoldColumn >= 0) {
        // sort on folds first in case they are out of order
        resultset.sort(m_FoldColumn);
      }
      resultset.sort(m_RunColumn);
    }

    m_ResultsetsValid = true;
  }

  /**
   * Gets the number of datasets in the resultsets
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of datasets in the resultsets
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the number of datasets in the resultsets
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int getNumDatasets() {

    if (!m_ResultsetsValid) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        prepareData();
      } catch (Exception ex) {
        ex.printStackTrace();
        return 0;
<<<<<<< HEAD
=======
=======
	prepareData();
      } catch (Exception ex) {
	ex.printStackTrace();
	return 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return m_DatasetSpecifiers.numSpecifiers();
  }

  /**
   * Gets the number of resultsets in the data.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of resultsets in the data
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the number of resultsets in the data
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int getNumResultsets() {

    if (!m_ResultsetsValid) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        prepareData();
      } catch (Exception ex) {
        ex.printStackTrace();
        return 0;
<<<<<<< HEAD
=======
=======
  prepareData();
      } catch (Exception ex) {
  ex.printStackTrace();
  return 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return m_Resultsets.size();
  }

  /**
   * Gets a string descriptive of the specified resultset.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param index the index of the resultset
   * @return a descriptive string for the resultset
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param index the index of the resultset
   * @return a descriptive string for the resultset
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String getResultsetName(int index) {

    if (!m_ResultsetsValid) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        prepareData();
      } catch (Exception ex) {
        ex.printStackTrace();
        return null;
      }
    }
    return m_Resultsets.get(index).templateString();
  }

  /**
   * Checks whether the resultset with the given index shall be displayed.
   * 
   * @param index the index of the resultset to check whether it shall be
   *          displayed
   * @return whether the specified resultset is displayed
   */
  @Override
  public boolean displayResultset(int index) {
    boolean result;
    int i;

<<<<<<< HEAD
=======
=======
	prepareData();
      } catch (Exception ex) {
	ex.printStackTrace();
	return null;
      }
    }
    return ((Resultset) m_Resultsets.elementAt(index)).templateString();
  }
  
  /**
   * Checks whether the resultset with the given index shall be displayed.
   * 
   * @param index the index of the resultset to check whether it shall be displayed 
   * @return whether the specified resultset is displayed 
   */
  public boolean displayResultset(int index) {
    boolean       result;
    int           i;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result = true;

    if (m_DisplayedResultsets != null) {
      result = false;
      for (i = 0; i < m_DisplayedResultsets.length; i++) {
        if (m_DisplayedResultsets[i] == index) {
          result = true;
          break;
        }
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result;
  }

  /**
   * Computes a paired t-test comparison for a specified dataset between two
   * resultsets.
   * 
<<<<<<< HEAD
=======
=======
      
    return result;
  }
  
  /**
   * Computes a paired t-test comparison for a specified dataset between
   * two resultsets.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param datasetSpecifier the dataset specifier
   * @param resultset1Index the index of the first resultset
   * @param resultset2Index the index of the second resultset
   * @param comparisonColumn the column containing values to compare
   * @return the results of the paired comparison
   * @throws Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public PairedStats calculateStatistics(Instance datasetSpecifier,
    int resultset1Index, int resultset2Index, int comparisonColumn)
    throws Exception {

    if (m_Instances.attribute(comparisonColumn).type() != Attribute.NUMERIC) {
      throw new Exception("Comparison column " + (comparisonColumn + 1) + " ("
        + m_Instances.attribute(comparisonColumn).name() + ") is not numeric");
<<<<<<< HEAD
=======
=======
  public PairedStats calculateStatistics(Instance datasetSpecifier,
					 int resultset1Index,
					 int resultset2Index,
					 int comparisonColumn) throws Exception {

    if (m_Instances.attribute(comparisonColumn).type()
	!= Attribute.NUMERIC) {
      throw new Exception("Comparison column " + (comparisonColumn + 1)
			  + " ("
			  + m_Instances.attribute(comparisonColumn).name()
			  + ") is not numeric");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    if (!m_ResultsetsValid) {
      prepareData();
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Resultset resultset1 = m_Resultsets.get(resultset1Index);
    Resultset resultset2 = m_Resultsets.get(resultset2Index);
    ArrayList<Instance> dataset1 = resultset1.dataset(datasetSpecifier);
    ArrayList<Instance> dataset2 = resultset2.dataset(datasetSpecifier);
    String datasetName = templateString(datasetSpecifier);
    if (dataset1 == null) {
      throw new Exception("No results for dataset=" + datasetName
        + " for resultset=" + resultset1.templateString());
    } else if (dataset2 == null) {
      throw new Exception("No results for dataset=" + datasetName
        + " for resultset=" + resultset2.templateString());
    } else if (dataset1.size() != dataset2.size()) {
      throw new Exception("Results for dataset=" + datasetName
        + " differ in size for resultset=" + resultset1.templateString()
        + " and resultset=" + resultset2.templateString());
    }

    PairedStats pairedStats = new PairedStats(m_SignificanceLevel);

    for (int k = 0; k < dataset1.size(); k++) {
      Instance current1 = dataset1.get(k);
      Instance current2 = dataset2.get(k);
      if (current1.isMissing(comparisonColumn)) {
        System.err.println("Instance has missing value in comparison "
          + "column!\n" + current1);
        continue;
      }
      if (current2.isMissing(comparisonColumn)) {
        System.err.println("Instance has missing value in comparison "
          + "column!\n" + current2);
        continue;
      }
      if (current1.value(m_RunColumn) != current2.value(m_RunColumn)) {
        System.err.println("Run numbers do not match!\n" + current1 + current2);
      }
      if (m_FoldColumn != -1) {
        if (current1.value(m_FoldColumn) != current2.value(m_FoldColumn)) {
          System.err.println("Fold numbers do not match!\n" + current1
            + current2);
        }
<<<<<<< HEAD
=======
=======
    Resultset resultset1 = (Resultset) m_Resultsets.elementAt(resultset1Index);
    Resultset resultset2 = (Resultset) m_Resultsets.elementAt(resultset2Index);
    FastVector dataset1 = resultset1.dataset(datasetSpecifier);
    FastVector dataset2 = resultset2.dataset(datasetSpecifier);
    String datasetName = templateString(datasetSpecifier);
    if (dataset1 == null) {
      throw new Exception("No results for dataset=" + datasetName
			 + " for resultset=" + resultset1.templateString());
    } else if (dataset2 == null) {
      throw new Exception("No results for dataset=" + datasetName
			 + " for resultset=" + resultset2.templateString());
    } else if (dataset1.size() != dataset2.size()) {
      throw new Exception("Results for dataset=" + datasetName
			  + " differ in size for resultset="
			  + resultset1.templateString()
			  + " and resultset="
			  + resultset2.templateString()
			  );
    }
    
    PairedStats pairedStats = new PairedStats(m_SignificanceLevel);

    for (int k = 0; k < dataset1.size(); k ++) {
      Instance current1 = (Instance) dataset1.elementAt(k);
      Instance current2 = (Instance) dataset2.elementAt(k);
      if (current1.isMissing(comparisonColumn)) {
	System.err.println("Instance has missing value in comparison "
			   + "column!\n" + current1);
	continue;
      }
      if (current2.isMissing(comparisonColumn)) {
	System.err.println("Instance has missing value in comparison "
			   + "column!\n" + current2);
	continue;
      }
      if (current1.value(m_RunColumn) != current2.value(m_RunColumn)) {
	System.err.println("Run numbers do not match!\n"
			    + current1 + current2);
      }
      if (m_FoldColumn != -1) {
	if (current1.value(m_FoldColumn) != current2.value(m_FoldColumn)) {
	  System.err.println("Fold numbers do not match!\n"
			     + current1 + current2);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      double value1 = current1.value(comparisonColumn);
      double value2 = current2.value(comparisonColumn);
      pairedStats.add(value1, value2);
    }
    pairedStats.calculateDerived();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // System.err.println("Differences stats:\n" +
    // pairedStats.differencesStats);
    return pairedStats;

  }

  /**
   * Creates a key that maps resultset numbers to their descriptions.
   * 
   * @return a value of type 'String'
   */
  @Override
<<<<<<< HEAD
=======
=======
    //System.err.println("Differences stats:\n" + pairedStats.differencesStats);
    return pairedStats;

  }
  
  /**
   * Creates a key that maps resultset numbers to their descriptions.
   *
   * @return a value of type 'String'
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String resultsetKey() {

    if (!m_ResultsetsValid) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        prepareData();
      } catch (Exception ex) {
        ex.printStackTrace();
        return ex.getMessage();
<<<<<<< HEAD
=======
=======
	prepareData();
      } catch (Exception ex) {
	ex.printStackTrace();
	return ex.getMessage();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    String result = "";
    for (int j = 0; j < getNumResultsets(); j++) {
      result += "(" + (j + 1) + ") " + getResultsetName(j) + '\n';
    }
    return result + '\n';
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Creates a "header" string describing the current resultsets.
   * 
   * @param comparisonColumn a value of type 'int'
   * @return a value of type 'String'
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  /**
   * Creates a "header" string describing the current resultsets.
   *
   * @param comparisonColumn a value of type 'int'
   * @return a value of type 'String'
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String header(int comparisonColumn) {

    if (!m_ResultsetsValid) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        prepareData();
      } catch (Exception ex) {
        ex.printStackTrace();
        return ex.getMessage();
      }
    }

    initResultMatrix();
    m_ResultMatrix.addHeader("Tester", getClass().getName() + " " + Utils.joinOptions(getOptions()));
    m_ResultMatrix.addHeader("Analysing",
      m_Instances.attribute(comparisonColumn).name());
    m_ResultMatrix.addHeader("Datasets", Integer.toString(getNumDatasets()));
    m_ResultMatrix
      .addHeader("Resultsets", Integer.toString(getNumResultsets()));
    m_ResultMatrix.addHeader("Confidence", getSignificanceLevel()
      + " (two tailed)");
    m_ResultMatrix.addHeader("Sorted by", getSortColumnName());
    m_ResultMatrix.addHeader("Date",
      (new SimpleDateFormat()).format(new Date()));
<<<<<<< HEAD
=======
=======
	prepareData();
      } catch (Exception ex) {
	ex.printStackTrace();
	return ex.getMessage();
      }
    }
    
    initResultMatrix();
    m_ResultMatrix.addHeader("Tester", getClass().getName());
    m_ResultMatrix.addHeader("Analysing", m_Instances.attribute(comparisonColumn).name());
    m_ResultMatrix.addHeader("Datasets", Integer.toString(getNumDatasets()));
    m_ResultMatrix.addHeader("Resultsets", Integer.toString(getNumResultsets()));
    m_ResultMatrix.addHeader("Confidence", getSignificanceLevel() + " (two tailed)");
    m_ResultMatrix.addHeader("Sorted by", getSortColumnName());
    m_ResultMatrix.addHeader("Date", (new SimpleDateFormat()).format(new Date()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return m_ResultMatrix.toStringHeader() + "\n";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Carries out a comparison between all resultsets, counting the number of
   * datsets where one resultset outperforms the other.
   * 
   * @param comparisonColumn the index of the comparison column
   * @param nonSigWin for storing the non-significant wins
   * @return a 2d array where element [i][j] is the number of times resultset j
   *         performed significantly better than resultset i.
   * @throws Exception if an error occurs
   */
  @Override
  public int[][] multiResultsetWins(int comparisonColumn, int[][] nonSigWin)
    throws Exception {

    int numResultsets = getNumResultsets();
    int[][] win = new int[numResultsets][numResultsets];
    // int [][] nonSigWin = new int [numResultsets][numResultsets];
    for (int i = 0; i < numResultsets; i++) {
      for (int j = i + 1; j < numResultsets; j++) {
        System.err
          .print("Comparing (" + (i + 1) + ") with (" + (j + 1) + ")\r");
        System.err.flush();
        for (int k = 0; k < getNumDatasets(); k++) {
          try {
            PairedStats pairedStats = calculateStatistics(
              m_DatasetSpecifiers.specifier(k), i, j, comparisonColumn);
            if (pairedStats.differencesSignificance < 0) {
              win[i][j]++;
            } else if (pairedStats.differencesSignificance > 0) {
              win[j][i]++;
            }

            if (pairedStats.differencesStats.mean < 0) {
              nonSigWin[i][j]++;
            } else if (pairedStats.differencesStats.mean > 0) {
              nonSigWin[j][i]++;
            }
          } catch (Exception ex) {
            // ex.printStackTrace();
            System.err.println(ex.getMessage());
          }
        }
<<<<<<< HEAD
=======
=======
   * Carries out a comparison between all resultsets, counting the number
   * of datsets where one resultset outperforms the other.
   *
   * @param comparisonColumn the index of the comparison column
   * @param nonSigWin for storing the non-significant wins
   * @return a 2d array where element [i][j] is the number of times resultset
   * j performed significantly better than resultset i.
   * @throws Exception if an error occurs
   */
  public int [][] multiResultsetWins(int comparisonColumn, int [][] nonSigWin)
    throws Exception {

    int numResultsets = getNumResultsets();
    int [][] win = new int [numResultsets][numResultsets];
    //    int [][] nonSigWin = new int [numResultsets][numResultsets];
    for (int i = 0; i < numResultsets; i++) {
      for (int j = i + 1; j < numResultsets; j++) {
	System.err.print("Comparing (" + (i + 1) + ") with ("
			 + (j + 1) + ")\r");
	System.err.flush();
	for (int k = 0; k < getNumDatasets(); k++) {
	  try {
	    PairedStats pairedStats = 
	      calculateStatistics(m_DatasetSpecifiers.specifier(k), i, j,
				  comparisonColumn);
	    if (pairedStats.differencesSignificance < 0) {
	      win[i][j]++;
	    } else if (pairedStats.differencesSignificance > 0) {
	      win[j][i]++;
	    }

	    if (pairedStats.differencesStats.mean < 0) {
	      nonSigWin[i][j]++;
	    } else if (pairedStats.differencesStats.mean > 0) {
	      nonSigWin[j][i]++;
	    }
	  } catch (Exception ex) {
	    //ex.printStackTrace();
	    System.err.println(ex.getMessage());
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return win;
  }

  /**
   * clears the content and fills the column and row names according to the
   * given sorting
   */
  protected void initResultMatrix() {
    m_ResultMatrix.setSize(getNumResultsets(), getNumDatasets());
    m_ResultMatrix.setShowStdDev(m_ShowStdDevs);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < getNumDatasets(); i++) {
      m_ResultMatrix.setRowName(i,
        templateString(m_DatasetSpecifiers.specifier(i)));
    }
<<<<<<< HEAD
=======
=======
    for (int i = 0; i < getNumDatasets(); i++)
      m_ResultMatrix.setRowName(i, 
          templateString(m_DatasetSpecifiers.specifier(i)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    for (int j = 0; j < getNumResultsets(); j++) {
      m_ResultMatrix.setColName(j, getResultsetName(j));
      m_ResultMatrix.setColHidden(j, !displayResultset(j));
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Carries out a comparison between all resultsets, counting the number of
   * datsets where one resultset outperforms the other. The results are
   * summarized in a table.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Carries out a comparison between all resultsets, counting the number
   * of datsets where one resultset outperforms the other. The results
   * are summarized in a table.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param comparisonColumn the index of the comparison column
   * @return the results in a string
   * @throws Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String multiResultsetSummary(int comparisonColumn) throws Exception {

    int[][] nonSigWin = new int[getNumResultsets()][getNumResultsets()];
    int[][] win = multiResultsetWins(comparisonColumn, nonSigWin);

    initResultMatrix();
    m_ResultMatrix.setSummary(nonSigWin, win);

<<<<<<< HEAD
=======
=======
  public String multiResultsetSummary(int comparisonColumn)
    throws Exception {
    
    int[][] nonSigWin = new int [getNumResultsets()][getNumResultsets()];
    int[][] win = multiResultsetWins(comparisonColumn, nonSigWin);
    
    initResultMatrix();    
    m_ResultMatrix.setSummary(nonSigWin, win);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_ResultMatrix.toStringSummary();
  }

  /**
   * returns a ranking of the resultsets
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param comparisonColumn the column to compare with
   * @return the ranking
   * @throws Exception if something goes wrong
   */
  @Override
  public String multiResultsetRanking(int comparisonColumn) throws Exception {

    int[][] nonSigWin = new int[getNumResultsets()][getNumResultsets()];
    int[][] win = multiResultsetWins(comparisonColumn, nonSigWin);

    initResultMatrix();
<<<<<<< HEAD
=======
=======
   * @param comparisonColumn	the column to compare with
   * @return			the ranking
   * @throws Exception		if something goes wrong
   */
  public String multiResultsetRanking(int comparisonColumn)
    throws Exception {
    
    int[][] nonSigWin = new int [getNumResultsets()][getNumResultsets()];
    int[][] win       = multiResultsetWins(comparisonColumn, nonSigWin);
    
    initResultMatrix();    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_ResultMatrix.setRanking(win);

    return m_ResultMatrix.toStringRanking();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Creates a comparison table where a base resultset is compared to the other
   * resultsets. Results are presented for every dataset.
   * 
<<<<<<< HEAD
=======
=======
				    
  /**
   * Creates a comparison table where a base resultset is compared to the
   * other resultsets. Results are presented for every dataset.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param baseResultset the index of the base resultset
   * @param comparisonColumn the index of the column to compare over
   * @return the comparison table string
   * @throws Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String multiResultsetFull(int baseResultset, int comparisonColumn)
    throws Exception {

    int maxWidthMean = 2;
    int maxWidthStdDev = 2;

    double[] sortValues = new double[getNumDatasets()];

    // determine max field width
    for (int i = 0; i < getNumDatasets(); i++) {
      sortValues[i] = Double.POSITIVE_INFINITY; // sorts skipped cols to end

      for (int j = 0; j < getNumResultsets(); j++) {
        if (!displayResultset(j)) {
          continue;
        }
        try {
          PairedStats pairedStats = calculateStatistics(
            m_DatasetSpecifiers.specifier(i), baseResultset, j,
            comparisonColumn);
          if (!Double.isInfinite(pairedStats.yStats.mean)
            && !Double.isNaN(pairedStats.yStats.mean)) {
            double width = ((Math.log(Math.abs(pairedStats.yStats.mean)) / Math
              .log(10)) + 1);
            if (width > maxWidthMean) {
              maxWidthMean = (int) width;
<<<<<<< HEAD
=======
=======
  public String multiResultsetFull(int baseResultset,
				   int comparisonColumn) throws Exception {

    int maxWidthMean = 2;
    int maxWidthStdDev = 2;
    
    double[] sortValues = new double[getNumDatasets()];
      
    // determine max field width
    for (int i = 0; i < getNumDatasets(); i++) {
      sortValues[i] = Double.POSITIVE_INFINITY;  // sorts skipped cols to end
      
      for (int j = 0; j < getNumResultsets(); j++) {
        if (!displayResultset(j))
          continue;
	try {
	  PairedStats pairedStats = 
	    calculateStatistics(m_DatasetSpecifiers.specifier(i), 
				baseResultset, j, comparisonColumn);
          if (!Double.isInfinite(pairedStats.yStats.mean) &&
              !Double.isNaN(pairedStats.yStats.mean)) {
            double width = ((Math.log(Math.abs(pairedStats.yStats.mean)) / 
                             Math.log(10))+1);
            if (width > maxWidthMean) {
              maxWidthMean = (int)width;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }
          }

          if (j == baseResultset) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (getSortColumn() != -1) {
              sortValues[i] = calculateStatistics(
                m_DatasetSpecifiers.specifier(i), baseResultset, j,
                getSortColumn()).xStats.mean;
            } else {
              sortValues[i] = i;
            }
          }

          if (m_ShowStdDevs && !Double.isInfinite(pairedStats.yStats.stdDev)
            && !Double.isNaN(pairedStats.yStats.stdDev)) {
            double width = ((Math.log(Math.abs(pairedStats.yStats.stdDev)) / Math
              .log(10)) + 1);
            if (width > maxWidthStdDev) {
              maxWidthStdDev = (int) width;
            }
          }
        } catch (Exception ex) {
          // ex.printStackTrace();
          System.err.println(ex);
        }
<<<<<<< HEAD
=======
=======
            if (getSortColumn() != -1)
              sortValues[i] = calculateStatistics(
                                m_DatasetSpecifiers.specifier(i), 
                                baseResultset, j, getSortColumn()).xStats.mean;
            else
              sortValues[i] = i;
          }
	  
	  if (m_ShowStdDevs &&
              !Double.isInfinite(pairedStats.yStats.stdDev) &&
              !Double.isNaN(pairedStats.yStats.stdDev)) {
	    double width = ((Math.log(Math.abs(pairedStats.yStats.stdDev)) / 
                             Math.log(10))+1);
	    if (width > maxWidthStdDev) {
	      maxWidthStdDev = (int)width;
	    }
	  }
	}  catch (Exception ex) {
	  //ex.printStackTrace();
          System.err.println(ex);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    // sort rows according to sort column
    m_SortOrder = Utils.sort(sortValues);

    // determine column order
    m_ColOrder = new int[getNumResultsets()];
    m_ColOrder[0] = baseResultset;
    int index = 1;
    for (int i = 0; i < getNumResultsets(); i++) {
<<<<<<< HEAD
      if (i == baseResultset) {
        continue;
      }
=======
<<<<<<< HEAD
      if (i == baseResultset) {
        continue;
      }
=======
      if (i == baseResultset)
        continue;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_ColOrder[index] = i;
      index++;
    }

    // setup matrix
<<<<<<< HEAD
    initResultMatrix();
=======
<<<<<<< HEAD
    initResultMatrix();
=======
    initResultMatrix();    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_ResultMatrix.setRowOrder(m_SortOrder);
    m_ResultMatrix.setColOrder(m_ColOrder);
    m_ResultMatrix.setMeanWidth(maxWidthMean);
    m_ResultMatrix.setStdDevWidth(maxWidthStdDev);
    m_ResultMatrix.setSignificanceWidth(1);

    // make sure that test base is displayed, even though it might not be
    // selected
    for (int i = 0; i < m_ResultMatrix.getColCount(); i++) {
<<<<<<< HEAD
      if ((i == baseResultset) && (m_ResultMatrix.getColHidden(i))) {
=======
<<<<<<< HEAD
      if ((i == baseResultset) && (m_ResultMatrix.getColHidden(i))) {
=======
      if (    (i == baseResultset)
           && (m_ResultMatrix.getColHidden(i)) ) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_ResultMatrix.setColHidden(i, false);
        System.err.println("Note: test base was hidden - set visible!");
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // the data
    for (int i = 0; i < getNumDatasets(); i++) {
      m_ResultMatrix.setRowName(i,
        templateString(m_DatasetSpecifiers.specifier(i)));
<<<<<<< HEAD
=======
=======
    
    // the data
    for (int i = 0; i < getNumDatasets(); i++) {
      m_ResultMatrix.setRowName(i, 
          templateString(m_DatasetSpecifiers.specifier(i)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      for (int j = 0; j < getNumResultsets(); j++) {
        try {
          // calc stats
<<<<<<< HEAD
          PairedStats pairedStats = calculateStatistics(
            m_DatasetSpecifiers.specifier(i), baseResultset, j,
            comparisonColumn);
=======
<<<<<<< HEAD
          PairedStats pairedStats = calculateStatistics(
            m_DatasetSpecifiers.specifier(i), baseResultset, j,
            comparisonColumn);
=======
          PairedStats pairedStats = 
            calculateStatistics(m_DatasetSpecifiers.specifier(i), 
                baseResultset, j, comparisonColumn);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          // count
          m_ResultMatrix.setCount(i, pairedStats.count);

          // mean
          m_ResultMatrix.setMean(j, i, pairedStats.yStats.mean);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
          
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          // std dev
          m_ResultMatrix.setStdDev(j, i, pairedStats.yStats.stdDev);

          // significance
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (pairedStats.differencesSignificance < 0) {
            m_ResultMatrix.setSignificance(j, i, ResultMatrix.SIGNIFICANCE_WIN);
          } else if (pairedStats.differencesSignificance > 0) {
            m_ResultMatrix
              .setSignificance(j, i, ResultMatrix.SIGNIFICANCE_LOSS);
          } else {
            m_ResultMatrix.setSignificance(j, i, ResultMatrix.SIGNIFICANCE_TIE);
          }
        } catch (Exception e) {
          // e.printStackTrace();
<<<<<<< HEAD
=======
=======
          if (pairedStats.differencesSignificance < 0)
            m_ResultMatrix.setSignificance(j, i, ResultMatrix.SIGNIFICANCE_WIN);
          else if (pairedStats.differencesSignificance > 0)
            m_ResultMatrix.setSignificance(j, i, ResultMatrix.SIGNIFICANCE_LOSS);
          else
            m_ResultMatrix.setSignificance(j, i, ResultMatrix.SIGNIFICANCE_TIE);
        }
        catch (Exception e) {
          //e.printStackTrace();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          System.err.println(e);
        }
      }
    }

    // generate output
    StringBuffer result = new StringBuffer(1000);
    try {
      result.append(m_ResultMatrix.toStringMatrix());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception e) {
      e.printStackTrace();
    }

    // append a key so that we can tell the difference between long
    // scheme+option names
    if (m_ResultMatrix.getEnumerateColNames()) {
      result.append("\n\n" + m_ResultMatrix.toStringKey());
    }
<<<<<<< HEAD
=======
=======
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    // append a key so that we can tell the difference between long
    // scheme+option names
    result.append("\n\n" + m_ResultMatrix.toStringKey());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.toString();
  }

  /**
   * Lists options understood by this object.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of Options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>();

    newVector.addElement(new Option(
      "\tSpecify list of columns that specify a unique\n" + "\tdataset.\n"
        + "\tFirst and last are valid indexes. (default none)", "D", 1,
      "-D <index,index2-index4,...>"));
    newVector.addElement(new Option(
      "\tSet the index of the column containing the run number", "R", 1,
      "-R <index>"));
    newVector.addElement(new Option(
      "\tSet the index of the column containing the fold number", "F", 1,
      "-F <index>"));
    newVector.addElement(new Option(
      "\tSpecify list of columns that specify a unique\n"
        + "\t'result generator' (eg: classifier name and options).\n"
        + "\tFirst and last are valid indexes. (default none)", "G", 1,
      "-G <index1,index2-index4,...>"));
    newVector.addElement(new Option(
      "\tSet the significance level for comparisons (default 0.05)", "S", 1,
      "-S <significance level>"));
    newVector.addElement(new Option(
            "\tSet the result matrix (classname plus parameters).\n\t(default: weka.experiment.ResultMatrixPlainText)",
            "result-matrix", 1,
            "-result-matrix <result-matrix-class>"));
    newVector
      .addElement(new Option("\tShow standard deviations", "V", 0, "-V"));
    newVector.addElement(new Option(
      "\tProduce table comparisons in Latex table format", "L", 0, "-L"));
    newVector.addElement(new Option(
      "\tProduce table comparisons in CSV table format", "csv", 0, "-csv"));
    newVector.addElement(new Option(
      "\tProduce table comparisons in HTML table format", "html", 0, "-html"));
    newVector.addElement(new Option(
      "\tProduce table comparisons with only the significance values",
      "significance", 0, "-significance"));
    newVector.addElement(new Option(
      "\tProduce table comparisons output suitable for GNUPlot", "gnuplot", 0,
      "-gnuplot"));
    newVector.addElement(new Option(
            "",
            "", 0, "\nOptions specific to result matrix "
            + getResultMatrix().getClass().getName() + ":"));

    newVector.addAll(Collections.list(((OptionHandler) getResultMatrix()).listOptions()));
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of Options.
   */
  public Enumeration listOptions() {
    
    Vector newVector = new Vector();

    newVector.addElement(new Option(
             "\tSpecify list of columns that specify a unique\n"
	      + "\tdataset.\n"
	      + "\tFirst and last are valid indexes. (default none)",
              "D", 1, "-D <index,index2-index4,...>"));
    newVector.addElement(new Option(
	      "\tSet the index of the column containing the run number",
              "R", 1, "-R <index>"));
    newVector.addElement(new Option(
	      "\tSet the index of the column containing the fold number",
              "F", 1, "-F <index>"));
    newVector.addElement(new Option(
              "\tSpecify list of columns that specify a unique\n"
	      + "\t'result generator' (eg: classifier name and options).\n"
	      + "\tFirst and last are valid indexes. (default none)",
              "G", 1, "-G <index1,index2-index4,...>"));
    newVector.addElement(new Option(
	      "\tSet the significance level for comparisons (default 0.05)",
              "S", 1, "-S <significance level>"));
    newVector.addElement(new Option(
	      "\tShow standard deviations",
              "V", 0, "-V"));
    newVector.addElement(new Option(
	      "\tProduce table comparisons in Latex table format",
              "L", 0, "-L"));
    newVector.addElement(new Option(
         "\tProduce table comparisons in CSV table format",
         "csv", 0, "-csv"));
    newVector.addElement(new Option(
         "\tProduce table comparisons in HTML table format",
         "html", 0, "-html"));
    newVector.addElement(new Option(
         "\tProduce table comparisons with only the significance values",
         "significance", 0, "-significance"));
    newVector.addElement(new Option(
         "\tProduce table comparisons output suitable for GNUPlot",
         "gnuplot", 0, "-gnuplot"));

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
   * -D &lt;index,index2-index4,...&gt;
   *  Specify list of columns that specify a unique
   *  dataset.
   *  First and last are valid indexes. (default none)
   * </pre>
   * 
   * <pre>
   * -R &lt;index&gt;
   *  Set the index of the column containing the run number
   * </pre>
   * 
   * <pre>
   * -F &lt;index&gt;
   *  Set the index of the column containing the fold number
   * </pre>
   * 
   * <pre>
   * -G &lt;index1,index2-index4,...&gt;
   *  Specify list of columns that specify a unique
   *  'result generator' (eg: classifier name and options).
   *  First and last are valid indexes. (default none)
   * </pre>
   * 
   * <pre>
   * -S &lt;significance level&gt;
   *  Set the significance level for comparisons (default 0.05)
   * </pre>
   * 
   * <pre>
   * -V
   *  Show standard deviations
   * </pre>
   * 
   * <pre>
   * -L
   *  Produce table comparisons in Latex table format
   * </pre>
   * 
   * <pre>
   * -csv
   *  Produce table comparisons in CSV table format
   * </pre>
   * 
   * <pre>
   * -html
   *  Produce table comparisons in HTML table format
   * </pre>
   * 
   * <pre>
   * -significance
   *  Produce table comparisons with only the significance values
   * </pre>
   * 
   * <pre>
   * -gnuplot
   *  Produce table comparisons output suitable for GNUPlot
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options an array containing options to set.
   * @throws Exception if invalid options are given
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    setShowStdDevs(Utils.getFlag('V', options));
    String outputOption = Utils.getOption("result-matrix", options);
    if (outputOption.length() != 0) {
      String[] resultMatrixSpec = Utils.splitOptions(outputOption);
      if (resultMatrixSpec.length == 0) {
        throw new Exception("Invalid ResultMatrix specification string");
      }
      String resultMatrixName = resultMatrixSpec[0];
      resultMatrixSpec[0] = "";
      ResultMatrix resultMatrix = (ResultMatrix) Utils.forName(Class.forName("weka.experiment.ResultMatrix"),
                      resultMatrixName, resultMatrixSpec);
      setResultMatrix(resultMatrix);
    } else if (Utils.getFlag('L', options)) {
      setResultMatrix(new ResultMatrixLatex());
    } else if (Utils.getFlag("csv", options)) {
      setResultMatrix(new ResultMatrixCSV());
    } else if (Utils.getFlag("html", options)) {
      setResultMatrix(new ResultMatrixHTML());
    } else if (Utils.getFlag("significance", options)) {
      setResultMatrix(new ResultMatrixSignificance());
    } else if (Utils.getFlag("gnuplot", options)) {
      setResultMatrix(new ResultMatrixGnuPlot());
    }
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D &lt;index,index2-index4,...&gt;
   *  Specify list of columns that specify a unique
   *  dataset.
   *  First and last are valid indexes. (default none)</pre>
   * 
   * <pre> -R &lt;index&gt;
   *  Set the index of the column containing the run number</pre>
   * 
   * <pre> -F &lt;index&gt;
   *  Set the index of the column containing the fold number</pre>
   * 
   * <pre> -G &lt;index1,index2-index4,...&gt;
   *  Specify list of columns that specify a unique
   *  'result generator' (eg: classifier name and options).
   *  First and last are valid indexes. (default none)</pre>
   * 
   * <pre> -S &lt;significance level&gt;
   *  Set the significance level for comparisons (default 0.05)</pre>
   * 
   * <pre> -V
   *  Show standard deviations</pre>
   * 
   * <pre> -L
   *  Produce table comparisons in Latex table format</pre>
   * 
   * <pre> -csv
   *  Produce table comparisons in CSV table format</pre>
   * 
   * <pre> -html
   *  Produce table comparisons in HTML table format</pre>
   * 
   * <pre> -significance
   *  Produce table comparisons with only the significance values</pre>
   * 
   * <pre> -gnuplot
   *  Produce table comparisons output suitable for GNUPlot</pre>
   * 
   <!-- options-end -->
   *
   * @param options an array containing options to set.
   * @throws Exception if invalid options are given
   */
  public void setOptions(String[] options) throws Exception {

    setShowStdDevs(Utils.getFlag('V', options));
    if (Utils.getFlag('L', options))
      setResultMatrix(new ResultMatrixLatex());
    if (Utils.getFlag("csv", options))
      setResultMatrix(new ResultMatrixCSV());
    if (Utils.getFlag("html", options))
      setResultMatrix(new ResultMatrixHTML());
    if (Utils.getFlag("significance", options))
      setResultMatrix(new ResultMatrixSignificance());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    String datasetList = Utils.getOption('D', options);
    Range datasetRange = new Range();
    if (datasetList.length() != 0) {
      datasetRange.setRanges(datasetList);
    }
    setDatasetKeyColumns(datasetRange);

    String indexStr = Utils.getOption('R', options);
    if (indexStr.length() != 0) {
      if (indexStr.equals("first")) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        setRunColumn(0);
      } else if (indexStr.equals("last")) {
        setRunColumn(-1);
      } else {
        setRunColumn(Integer.parseInt(indexStr) - 1);
      }
<<<<<<< HEAD
=======
=======
	setRunColumn(0);
      } else if (indexStr.equals("last")) {
	setRunColumn(-1);
      } else {
	setRunColumn(Integer.parseInt(indexStr) - 1);
      }    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      setRunColumn(-1);
    }

    String foldStr = Utils.getOption('F', options);
    if (foldStr.length() != 0) {
      setFoldColumn(Integer.parseInt(foldStr) - 1);
    } else {
      setFoldColumn(-1);
    }

    String sigStr = Utils.getOption('S', options);
    if (sigStr.length() != 0) {
      setSignificanceLevel((new Double(sigStr)).doubleValue());
    } else {
      setSignificanceLevel(0.05);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String resultsetList = Utils.getOption('G', options);
    Range generatorRange = new Range();
    if (resultsetList.length() != 0) {
      generatorRange.setRanges(resultsetList);
    }
    setResultsetKeyColumns(generatorRange);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets current settings of the PairedTTester.
   * 
   * @return an array of strings containing current options.
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();;

    if (!getResultsetKeyColumns().getRanges().equals("")) {
      options.add("-G");
      options.add(getResultsetKeyColumns().getRanges());
    }
    if (!getDatasetKeyColumns().getRanges().equals("")) {
      options.add("-D");
      options.add(getDatasetKeyColumns().getRanges());
    }
    options.add("-R");
    options.add("" + (getRunColumn() + 1));
    options.add("-S");
    options.add("" + getSignificanceLevel());

    if (getShowStdDevs()) {
      options.add("-V");
    }

    options.add("-result-matrix");
    String spec = getResultMatrix().getClass().getName();
    if (getResultMatrix() instanceof OptionHandler) {
      spec += " " + Utils.joinOptions(((OptionHandler) getResultMatrix()).getOptions());
    }
    options.add(spec.trim());

    return options.toArray(new String[options.size()]);
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets current settings of the PairedTTester.
   *
   * @return an array of strings containing current options.
   */
  public String[] getOptions() {

    String [] options = new String [11];
    int current = 0;

    if (!getResultsetKeyColumns().getRanges().equals("")) {
      options[current++] = "-G";
      options[current++] = getResultsetKeyColumns().getRanges();
    }
    if (!getDatasetKeyColumns().getRanges().equals("")) {
      options[current++] = "-D";
      options[current++] = getDatasetKeyColumns().getRanges();
    }
    options[current++] = "-R";
    options[current++] = "" + (getRunColumn() + 1);
    options[current++] = "-S";
    options[current++] = "" + getSignificanceLevel();
    
    if (getShowStdDevs()) {
      options[current++] = "-V";
    }

    if (getResultMatrix() instanceof ResultMatrixLatex)
      options[current++] = "-L";

    if (getResultMatrix() instanceof ResultMatrixCSV)
      options[current++] = "-csv";
   
    if (getResultMatrix() instanceof ResultMatrixHTML)
      options[current++] = "-html";
   
    if (getResultMatrix() instanceof ResultMatrixSignificance)
      options[current++] = "-significance";
   
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the value of ResultsetKeyColumns.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return Value of ResultsetKeyColumns.
   */
  @Override
  public Range getResultsetKeyColumns() {

    return m_ResultsetKeyColumnsRange;
  }

  /**
   * Set the value of ResultsetKeyColumns.
   * 
   * @param newResultsetKeyColumns Value to assign to ResultsetKeyColumns.
   */
  @Override
  public void setResultsetKeyColumns(Range newResultsetKeyColumns) {

    m_ResultsetKeyColumnsRange = newResultsetKeyColumns;
    m_ResultsetsValid = false;
  }

  /**
   * Gets the indices of the the datasets that are displayed (if
   * <code>null</code> then all are displayed). The base is always displayed.
   * 
   * @return the indices of the datasets to display
   */
  @Override
  public int[] getDisplayedResultsets() {
    return m_DisplayedResultsets;
  }

<<<<<<< HEAD
=======
=======
   *
   * @return Value of ResultsetKeyColumns.
   */
  public Range getResultsetKeyColumns() {
    
    return m_ResultsetKeyColumnsRange;
  }
  
  /**
   * Set the value of ResultsetKeyColumns.
   *
   * @param newResultsetKeyColumns Value to assign to ResultsetKeyColumns.
   */
  public void setResultsetKeyColumns(Range newResultsetKeyColumns) {
    
    m_ResultsetKeyColumnsRange = newResultsetKeyColumns;
    m_ResultsetsValid = false;
  }
  
  /**
   * Gets the indices of the the datasets that are displayed (if <code>null</code>
   * then all are displayed). The base is always displayed.
   * 
   * @return the indices of the datasets to display
   */
  public int[] getDisplayedResultsets() {
    return m_DisplayedResultsets;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Sets the indicies of the datasets to display (<code>null</code> means all).
   * The base is always displayed.
   * 
   * @param cols the indices of the datasets to display
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public void setDisplayedResultsets(int[] cols) {
    m_DisplayedResultsets = cols;
  }

  /**
   * Get the value of SignificanceLevel.
   * 
   * @return Value of SignificanceLevel.
   */
  @Override
  public double getSignificanceLevel() {

    return m_SignificanceLevel;
  }

  /**
   * Set the value of SignificanceLevel.
   * 
   * @param newSignificanceLevel Value to assign to SignificanceLevel.
   */
  @Override
  public void setSignificanceLevel(double newSignificanceLevel) {

<<<<<<< HEAD
=======
=======
  public void setDisplayedResultsets(int[] cols) {
    m_DisplayedResultsets = cols;
  }
  
  /**
   * Get the value of SignificanceLevel.
   *
   * @return Value of SignificanceLevel.
   */
  public double getSignificanceLevel() {
    
    return m_SignificanceLevel;
  }
  
  /**
   * Set the value of SignificanceLevel.
   *
   * @param newSignificanceLevel Value to assign to SignificanceLevel.
   */
  public void setSignificanceLevel(double newSignificanceLevel) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_SignificanceLevel = newSignificanceLevel;
  }

  /**
   * Get the value of DatasetKeyColumns.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return Value of DatasetKeyColumns.
   */
  @Override
  public Range getDatasetKeyColumns() {

    return m_DatasetKeyColumnsRange;
  }

  /**
   * Set the value of DatasetKeyColumns.
   * 
   * @param newDatasetKeyColumns Value to assign to DatasetKeyColumns.
   */
  @Override
  public void setDatasetKeyColumns(Range newDatasetKeyColumns) {

    m_DatasetKeyColumnsRange = newDatasetKeyColumns;
    m_ResultsetsValid = false;
  }

  /**
   * Get the value of RunColumn.
   * 
   * @return Value of RunColumn.
   */
  @Override
  public int getRunColumn() {

    return m_RunColumnSet;
  }

  /**
   * Set the value of RunColumn.
   * 
   * @param newRunColumn Value to assign to RunColumn.
   */
  @Override
  public void setRunColumn(int newRunColumn) {

<<<<<<< HEAD
=======
=======
   *
   * @return Value of DatasetKeyColumns.
   */
  public Range getDatasetKeyColumns() {
    
    return m_DatasetKeyColumnsRange;
  }
  
  /**
   * Set the value of DatasetKeyColumns.
   *
   * @param newDatasetKeyColumns Value to assign to DatasetKeyColumns.
   */
  public void setDatasetKeyColumns(Range newDatasetKeyColumns) {
    
    m_DatasetKeyColumnsRange = newDatasetKeyColumns;
    m_ResultsetsValid = false;
  }
  
  /**
   * Get the value of RunColumn.
   *
   * @return Value of RunColumn.
   */
  public int getRunColumn() {
    
    return m_RunColumnSet;
  }
  
  /**
   * Set the value of RunColumn.
   *
   * @param newRunColumn Value to assign to RunColumn.
   */
  public void setRunColumn(int newRunColumn) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_RunColumnSet = newRunColumn;
    m_ResultsetsValid = false;
  }

  /**
   * Get the value of FoldColumn.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return Value of FoldColumn.
   */
  @Override
  public int getFoldColumn() {

    return m_FoldColumn;
  }

  /**
   * Set the value of FoldColumn.
   * 
   * @param newFoldColumn Value to assign to FoldColumn.
   */
  @Override
  public void setFoldColumn(int newFoldColumn) {

<<<<<<< HEAD
=======
=======
   *
   * @return Value of FoldColumn.
   */
  public int getFoldColumn() {
    
    return m_FoldColumn;
  }
  
  /**
   * Set the value of FoldColumn.
   *
   * @param newFoldColumn Value to assign to FoldColumn.
   */
  public void setFoldColumn(int newFoldColumn) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_FoldColumn = newFoldColumn;
    m_ResultsetsValid = false;
  }

  /**
   * Returns the name of the column to sort on.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the name of the column to sort on.
   */
  @Override
  public String getSortColumnName() {
    if (getSortColumn() == -1) {
      return "-";
    } else {
      return m_Instances.attribute(getSortColumn()).name();
    }
<<<<<<< HEAD
=======
=======
   *
   * @return the name of the column to sort on.
   */
  public String getSortColumnName() {
    if (getSortColumn() == -1)
      return "-";
    else
      return m_Instances.attribute(getSortColumn()).name();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the column to sort on, -1 means the default sorting.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the column to sort on.
   */
  @Override
  public int getSortColumn() {
    return m_SortColumn;
  }

  /**
   * Set the column to sort on, -1 means the default sorting.
   * 
   * @param newSortColumn the new sort column.
   */
  @Override
  public void setSortColumn(int newSortColumn) {
    if (newSortColumn >= -1) {
      m_SortColumn = newSortColumn;
    }
  }

  /**
   * Get the value of Instances.
   * 
   * @return Value of Instances.
   */
  @Override
  public Instances getInstances() {

    return m_Instances;
  }

  /**
   * Set the value of Instances.
   * 
   * @param newInstances Value to assign to Instances.
   */
  @Override
  public void setInstances(Instances newInstances) {

<<<<<<< HEAD
=======
=======
   *
   * @return the column to sort on.
   */
  public int getSortColumn() {
    return m_SortColumn;
  }
  
  /**
   * Set the column to sort on, -1 means the default sorting.
   *
   * @param newSortColumn the new sort column.
   */
  public void setSortColumn(int newSortColumn) {
    if (newSortColumn >= -1)
      m_SortColumn = newSortColumn;
  }
  
  /**
   * Get the value of Instances.
   *
   * @return Value of Instances.
   */
  public Instances getInstances() {
    
    return m_Instances;
  }
  
  /**
   * Set the value of Instances.
   *
   * @param newInstances Value to assign to Instances.
   */
  public void setInstances(Instances newInstances) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Instances = newInstances;
    m_ResultsetsValid = false;
  }

  /**
   * retrieves all the settings from the given Tester
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param tester the Tester to get the settings from
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param tester      the Tester to get the settings from
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void assign(Tester tester) {
    setInstances(tester.getInstances());
    setResultMatrix(tester.getResultMatrix());
    setShowStdDevs(tester.getShowStdDevs());
    setResultsetKeyColumns(tester.getResultsetKeyColumns());
    setDisplayedResultsets(tester.getDisplayedResultsets());
    setSignificanceLevel(tester.getSignificanceLevel());
    setDatasetKeyColumns(tester.getDatasetKeyColumns());
    setRunColumn(tester.getRunColumn());
    setFoldColumn(tester.getFoldColumn());
    setSortColumn(tester.getSortColumn());
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * returns a string that is displayed as tooltip on the "perform test" button
   * in the experimenter
   * 
   * @return the tool tip
   */
  @Override
<<<<<<< HEAD
=======
=======
   * returns a string that is displayed as tooltip on the "perform test"
   * button in the experimenter
   * 
   * @return	the tool tip
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String getToolTipText() {
    return "Performs test using t-test statistic";
  }

  /**
   * returns the name of the tester
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the display name
   */
  @Override
  public String getDisplayName() {
    return "Paired T-Tester";
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11542 $");
  }

  /**
   * Test the class from the command line.
   * 
<<<<<<< HEAD
=======
=======
   * @return	the display name
   */
  public String getDisplayName() {
    return "Paired T-Tester";
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 6431 $");
  }
  
  /**
   * Test the class from the command line.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param args contains options for the instance ttests
   */
  public static void main(String args[]) {

    try {
      PairedTTester tt = new PairedTTester();
      String datasetName = Utils.getOption('t', args);
      String compareColStr = Utils.getOption('c', args);
      String baseColStr = Utils.getOption('b', args);
      boolean summaryOnly = Utils.getFlag('s', args);
      boolean rankingOnly = Utils.getFlag('r', args);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      boolean noHeader = Utils.getFlag('n', args);
      try {
        if ((datasetName.length() == 0) || (compareColStr.length() == 0)) {
          throw new Exception("-t and -c options are required");
        }
        tt.setOptions(args);
        Utils.checkForRemainingOptions(args);
      } catch (Exception ex) {
        String result = "";
        Enumeration<Option> enu = tt.listOptions();
        while (enu.hasMoreElements()) {
          Option option = enu.nextElement();
          result += option.synopsis() + '\n' + option.description() + '\n';
        }
        throw new Exception(ex.getMessage() + "\n\nUsage:\n\n" + "-t <file>\n"
          + "\tSet the dataset containing data to evaluate\n" + "-b <index>\n"
          + "\tSet the resultset to base comparisons against (optional)\n"
          + "-c <index>\n" + "\tSet the column to perform a comparison on\n"
          + "-s\n" + "\tSummarize wins over all resultset pairs\n" + "-r\n"
          + "\tGenerate a resultset ranking\n" + "-n\n" + "\tDo not output header info\n"+ result);
      }
      Instances data = new Instances(new BufferedReader(new FileReader(
        datasetName)));
      tt.setInstances(data);
      // tt.prepareData();
      int compareCol = Integer.parseInt(compareColStr) - 1;
      if (!noHeader) {
        System.out.println(tt.header(compareCol));
      }
      if (rankingOnly) {
        System.out.println(tt.multiResultsetRanking(compareCol));
      } else if (summaryOnly) {
        System.out.println(tt.multiResultsetSummary(compareCol));
      } else {
        //System.out.println(tt.resultsetKey());
        if (baseColStr.length() == 0) {
          for (int i = 0; i < tt.getNumResultsets(); i++) {
            if (!tt.displayResultset(i)) {
              continue;
            }
            System.out.println(tt.multiResultsetFull(i, compareCol));
          }
        } else {
          int baseCol = Integer.parseInt(baseColStr) - 1;
          System.out.println(tt.multiResultsetFull(baseCol, compareCol));
        }
      }
    } catch (Exception e) {
<<<<<<< HEAD
=======
=======
      try {
	if ((datasetName.length() == 0)
	    || (compareColStr.length() == 0)) {
	  throw new Exception("-t and -c options are required");
	}
	tt.setOptions(args);
	Utils.checkForRemainingOptions(args);
      } catch (Exception ex) {
	String result = "";
	Enumeration enu = tt.listOptions();
	while (enu.hasMoreElements()) {
	  Option option = (Option) enu.nextElement();
	  result += option.synopsis() + '\n'
	    + option.description() + '\n';
	}
	throw new Exception(
	      "Usage:\n\n"
	      + "-t <file>\n"
	      + "\tSet the dataset containing data to evaluate\n"
	      + "-b <index>\n"
	      + "\tSet the resultset to base comparisons against (optional)\n"
	      + "-c <index>\n"
	      + "\tSet the column to perform a comparison on\n"
	      + "-s\n"
	      + "\tSummarize wins over all resultset pairs\n\n"
	      + "-r\n"
	      + "\tGenerate a resultset ranking\n\n"
	      + result);
      }
      Instances data = new Instances(new BufferedReader(
				  new FileReader(datasetName)));
      tt.setInstances(data);
      //      tt.prepareData();
      int compareCol = Integer.parseInt(compareColStr) - 1;
      System.out.println(tt.header(compareCol));
      if (rankingOnly) {
	System.out.println(tt.multiResultsetRanking(compareCol));
      } else if (summaryOnly) {
	System.out.println(tt.multiResultsetSummary(compareCol));
      } else {
	System.out.println(tt.resultsetKey());
	if (baseColStr.length() == 0) {
	  for (int i = 0; i < tt.getNumResultsets(); i++) {
            if (!tt.displayResultset(i))
              continue;
	    System.out.println(tt.multiResultsetFull(i, compareCol));
	  }
	} else {
	  int baseCol = Integer.parseInt(baseColStr) - 1;
	  System.out.println(tt.multiResultsetFull(baseCol, compareCol));
	}
      }
    } catch(Exception e) {
      e.printStackTrace();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.println(e.getMessage());
    }
  }
}
