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
 *    PKIDiscretize.java
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.filters.unsupervised.attribute;

<<<<<<< HEAD
import java.util.Enumeration;
import java.util.Vector;

import weka.core.*;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;

/**
 * <!-- globalinfo-start --> Discretizes numeric attributes using equal
 * frequency binning and forces the number of bins to be equal to the square root of
 * the number of values of the numeric attribute.<br/>
 * <br/>
 * For more information, see:<br/>
 * <br/>
 * Ying Yang, Geoffrey I. Webb: Proportional k-Interval Discretization for
 * Naive-Bayes Classifiers. In: 12th European Conference on Machine Learning,
 * 564-575, 2001.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;

import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Discretizes numeric attributes using equal frequency binning, where the number of bins is equal to the square root of the number of non-missing values.<br/>
 * <br/>
 * For more information, see:<br/>
 * <br/>
 * Ying Yang, Geoffrey I. Webb: Proportional k-Interval Discretization for Naive-Bayes Classifiers. In: 12th European Conference on Machine Learning, 564-575, 2001.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;inproceedings{Yang2001,
 *    author = {Ying Yang and Geoffrey I. Webb},
 *    booktitle = {12th European Conference on Machine Learning},
 *    pages = {564-575},
 *    publisher = {Springer},
 *    series = {LNCS},
 *    title = {Proportional k-Interval Discretization for Naive-Bayes Classifiers},
 *    volume = {2167},
 *    year = {2001}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
 * <!-- technical-bibtex-end -->
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
 * -R &lt;col1,col2-col4,...&gt;
 *  Specifies list of columns to discretize. First and last are valid indexes.
 *  (default: first-last)
 * </pre>
 * 
 * <pre>
 * -V
 *  Invert matching sense of column indexes.
 * </pre>
 * 
 * <pre>
 * -D
 *  Output binary attributes for discretized attributes.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class PKIDiscretize extends Discretize implements
  TechnicalInformationHandler, WeightedAttributesHandler, WeightedInstancesHandler {

=======
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -unset-class-temporarily
 *  Unsets the class index temporarily before the filter is
 *  applied to the data.
 *  (default: no)</pre>
 * 
 * <pre> -R &lt;col1,col2-col4,...&gt;
 *  Specifies list of columns to Discretize. First and last are valid indexes.
 *  (default: first-last)</pre>
 * 
 * <pre> -V
 *  Invert matching sense of column indexes.</pre>
 * 
 * <pre> -D
 *  Output binary attributes for discretized attributes.</pre>
 * 
 <!-- options-end -->
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 1.9 $
 */
public class PKIDiscretize 
  extends Discretize
  implements TechnicalInformationHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  static final long serialVersionUID = 6153101248977702675L;

  /**
   * Sets the format of the input instances.
<<<<<<< HEAD
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set successfully
   */
  @Override
=======
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    // alter child behaviour to do what we want
    m_FindNumBins = true;
    return super.setInputFormat(instanceInfo);
  }

  /**
   * Finds the number of bins to use and creates the cut points.
<<<<<<< HEAD
   * 
   * @param index the attribute index
   */
  @Override
=======
   *
   * @param index the attribute index
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected void findNumBins(int index) {

    Instances toFilter = getInputFormat();

    // Find number of instances for attribute where not missing
<<<<<<< HEAD
    double sum = 0;
    for (Instance inst : toFilter) {
      if (!inst.isMissing(index)) {
        sum += inst.weight();
      }
    }

    m_NumBins = (int) Math.sqrt(sum);
=======
    int numOfInstances = toFilter.numInstances();
    for (int i = 0; i < toFilter.numInstances(); i++) {
      if (toFilter.instance(i).isMissing(index))
	numOfInstances--;
    }

    m_NumBins = (int)(Math.sqrt(numOfInstances));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (m_NumBins > 0) {
      calculateCutPointsByEqualFrequencyBinning(index);
    }
  }

  /**
   * Gets an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tUnsets the class index temporarily before the filter is\n"
        + "\tapplied to the data.\n" + "\t(default: no)",
      "unset-class-temporarily", 1, "-unset-class-temporarily"));

    result.addElement(new Option(
      "\tSpecifies list of columns to discretize. First"
        + " and last are valid indexes.\n" + "\t(default: first-last)", "R", 1,
      "-R <col1,col2-col4,...>"));

    result.addElement(new Option("\tInvert matching sense of column indexes.",
      "V", 0, "-V"));

    result.addElement(new Option(
      "\tOutput binary attributes for discretized attributes.", "D", 0, "-D"));

    return result.elements();
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
   * -R &lt;col1,col2-col4,...&gt;
   *  Specifies list of columns to discretize. First and last are valid indexes.
   *  (default: first-last)
   * </pre>
   * 
   * <pre>
   * -V
   *  Invert matching sense of column indexes.
   * </pre>
   * 
   * <pre>
   * -D
   *  Output binary attributes for discretized attributes.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();
    
    result.addElement(new Option(
	"\tUnsets the class index temporarily before the filter is\n"
	+ "\tapplied to the data.\n"
	+ "\t(default: no)",
	"unset-class-temporarily", 1, "-unset-class-temporarily"));
    
    result.addElement(new Option(
	"\tSpecifies list of columns to Discretize. First"
	+ " and last are valid indexes.\n"
	+ "\t(default: first-last)",
	"R", 1, "-R <col1,col2-col4,...>"));
    
    result.addElement(new Option(
	"\tInvert matching sense of column indexes.",
	"V", 0, "-V"));
    
    result.addElement(new Option(
	"\tOutput binary attributes for discretized attributes.",
	"D", 0, "-D"));
    
    return result.elements();
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
   * <pre> -R &lt;col1,col2-col4,...&gt;
   *  Specifies list of columns to Discretize. First and last are valid indexes.
   *  (default: first-last)</pre>
   * 
   * <pre> -V
   *  Invert matching sense of column indexes.</pre>
   * 
   * <pre> -D
   *  Output binary attributes for discretized attributes.</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {

    setIgnoreClass(Utils.getFlag("unset-class-temporarily", options));
    setMakeBinary(Utils.getFlag('D', options));
    setInvertSelection(Utils.getFlag('V', options));
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String convertList = Utils.getOption('R', options);
    if (convertList.length() != 0) {
      setAttributeIndices(convertList);
    } else {
      setAttributeIndices("first-last");
    }

    if (getInputFormat() != null) {
      setInputFormat(getInputFormat());
    }
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

    Vector<String> result = new Vector<String>();

    if (getMakeBinary()) {
      result.add("-D");
    }

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
  public String[] getOptions() {
    Vector        result;

    result = new Vector();

    if (getMakeBinary())
      result.add("-D");
    
    if (getInvertSelection())
      result.add("-V");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (!getAttributeIndices().equals("")) {
      result.add("-R");
      result.add(getAttributeIndices());
    }

<<<<<<< HEAD
    return result.toArray(new String[result.size()]);
=======
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns a string describing this filter
<<<<<<< HEAD
   * 
   * @return a description of the filter suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String globalInfo() {

    return "Discretizes numeric attributes using equal" +
            " frequency binning and forces the number of bins to be equal to the square root of" +
            " the number of values of the numeric attribute.\n\n" +
            "For more information, see:\n\n"
=======
   *
   * @return a description of the filter suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {

    return "Discretizes numeric attributes using equal frequency binning,"
      + " where the number of bins is equal to the square root of the"
      + " number of non-missing values.\n\n"
      + "For more information, see:\n\n"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + getTechnicalInformation().toString();
  }

  /**
<<<<<<< HEAD
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  @Override
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;

    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Ying Yang and Geoffrey I. Webb");
    result.setValue(Field.TITLE,
      "Proportional k-Interval Discretization for Naive-Bayes Classifiers");
    result.setValue(Field.BOOKTITLE,
      "12th European Conference on Machine Learning");
=======
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;
    
    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Ying Yang and Geoffrey I. Webb");
    result.setValue(Field.TITLE, "Proportional k-Interval Discretization for Naive-Bayes Classifiers");
    result.setValue(Field.BOOKTITLE, "12th European Conference on Machine Learning");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.setValue(Field.YEAR, "2001");
    result.setValue(Field.PAGES, "564-575");
    result.setValue(Field.PUBLISHER, "Springer");
    result.setValue(Field.SERIES, "LNCS");
    result.setValue(Field.VOLUME, "2167");
<<<<<<< HEAD

    return result;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
=======
    
    return result;
  }
  
  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String findNumBinsTipText() {

    return "Ignored.";
  }

  /**
   * Get the value of FindNumBins.
<<<<<<< HEAD
   * 
   * @return Value of FindNumBins.
   */
  @Override
  public boolean getFindNumBins() {

    return false;
  }

  /**
   * Set the value of FindNumBins.
   * 
   * @param newFindNumBins Value to assign to FindNumBins.
   */
  @Override
  public void setFindNumBins(boolean newFindNumBins) {

  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
=======
   *
   * @return Value of FindNumBins.
   */
  public boolean getFindNumBins() {
    
    return false;
  }
  
  /**
   * Set the value of FindNumBins.
   *
   * @param newFindNumBins Value to assign to FindNumBins.
   */
  public void setFindNumBins(boolean newFindNumBins) {
    
  }
  
  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String useEqualFrequencyTipText() {

    return "Always true.";
  }

  /**
   * Get the value of UseEqualFrequency.
<<<<<<< HEAD
   * 
   * @return Value of UseEqualFrequency.
   */
  @Override
  public boolean getUseEqualFrequency() {

    return true;
  }

  /**
   * Set the value of UseEqualFrequency.
   * 
   * @param newUseEqualFrequency Value to assign to UseEqualFrequency.
   */
  @Override
  public void setUseEqualFrequency(boolean newUseEqualFrequency) {

=======
   *
   * @return Value of UseEqualFrequency.
   */
  public boolean getUseEqualFrequency() {
    
    return true;
  }
  
  /**
   * Set the value of UseEqualFrequency.
   *
   * @param newUseEqualFrequency Value to assign to UseEqualFrequency.
   */
  public void setUseEqualFrequency(boolean newUseEqualFrequency) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
=======
   *
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String binsTipText() {

    return "Ignored.";
  }

  /**
   * Ignored
<<<<<<< HEAD
   * 
   * @return the number of bins.
   */
  @Override
=======
   *
   * @return the number of bins.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public int getBins() {

    return 0;
  }

  /**
   * Ignored
<<<<<<< HEAD
   * 
   * @param numBins the number of bins
   */
  @Override
  public void setBins(int numBins) {

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
   *
   * @param numBins the number of bins
   */
  public void setBins(int numBins) {

  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.9 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
=======
   *
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    runFilter(new PKIDiscretize(), argv);
  }
}
