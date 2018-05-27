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
 *    PrincipalComponents.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.attributeSelection;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import no.uib.cipr.matrix.*;

import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.*;

/**
 * <!-- globalinfo-start --> Performs a principal components analysis and
 * transformation of the data. Use in conjunction with a Ranker search.
 * Dimensionality reduction is accomplished by choosing enough eigenvectors to
 * account for some percentage of the variance in the original data---default
 * 0.95 (95%). Attribute noise can be filtered by transforming to the PC space,
 * eliminating some of the worst eigenvectors, and then transforming back to the
 * original space.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -C
 *  Center (rather than standardize) the
 *  data and compute PCA using the covariance (rather
 *   than the correlation) matrix.
 * </pre>
 * 
 * <pre>
 * -R
 *  Retain enough PC attributes to account 
 *  for this proportion of variance in the original data.
 *  (default = 0.95)
 * </pre>
 * 
 * <pre>
 * -O
 *  Transform through the PC space and 
 *  back to the original space.
 * </pre>
 * 
 * <pre>
 * -A
 *  Maximum number of attributes to include in 
 *  transformed attribute names. (-1 = include all)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 12659 $
 */
public class PrincipalComponents extends UnsupervisedAttributeEvaluator
  implements AttributeTransformer, OptionHandler {

<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Matrix;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.SparseInstance;
import weka.core.Utils;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Center;
import weka.filters.unsupervised.attribute.NominalToBinary;
import weka.filters.unsupervised.attribute.Remove;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;
import weka.filters.unsupervised.attribute.Standardize;

/**
 <!-- globalinfo-start -->
 * Performs a principal components analysis and transformation of the data. Use in conjunction with a Ranker search. Dimensionality reduction is accomplished by choosing enough eigenvectors to account for some percentage of the variance in the original data---default 0.95 (95%). Attribute noise can be filtered by transforming to the PC space, eliminating some of the worst eigenvectors, and then transforming back to the original space.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  Don't normalize input data.</pre>
 * 
 * <pre> -R
 *  Retain enough PC attributes to account 
 *  for this proportion of variance in the original data.
 *  (default = 0.95)</pre>
 * 
 * <pre> -O
 *  Transform through the PC space and 
 *  back to the original space.</pre>
 * 
 * <pre> -A
 *  Maximum number of attributes to include in 
 *  transformed attribute names. (-1 = include all)</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 6690 $
 */
public class PrincipalComponents 
  extends UnsupervisedAttributeEvaluator 
  implements AttributeTransformer, OptionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  private static final long serialVersionUID = -3675307197777734007L;

  /** The data to transform analyse/transform */
  private Instances m_trainInstances;

  /** Keep a copy for the class attribute (if set) */
  private Instances m_trainHeader;

  /** The header for the transformed data format */
  private Instances m_transformedFormat;

  /** The header for data transformed back to the original space */
  private Instances m_originalSpaceFormat;

  /** Data has a class set */
  private boolean m_hasClass;

  /** Class index */
  private int m_classIndex;

  /** Number of attributes */
  private int m_numAttribs;

  /** Number of instances */
  private int m_numInstances;

  /** Correlation/covariance matrix for the original data */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private UpperSymmDenseMatrix m_correlation;

  private double[] m_means;
  private double[] m_stdDevs;

  /**
   * If true, center (rather than standardize) the data and compute PCA from
   * covariance (rather than correlation) matrix.
   */
  private boolean m_center = false;

  /**
   * Will hold the unordered linear transformations of the (normalized) original
   * data
   */
  private double[][] m_eigenvectors;

  /** Eigenvalues for the corresponding eigenvectors */
  private double[] m_eigenvalues = null;

  /** Sorted eigenvalues */
  private int[] m_sortedEigens;

  /** sum of the eigenvalues */
  private double m_sumOfEigenValues = 0.0;

<<<<<<< HEAD
=======
=======
  private double [][] m_correlation;
  
  private double[] m_means;
  private double[] m_stdDevs;
  
  /** 
   * If true, center (rather than standardize) the data and
   * compute PCA from covariance (rather than correlation)
   * matrix.
   */
  private boolean m_center = false;

  /** Will hold the unordered linear transformations of the (normalized)
      original data */
  private double [][] m_eigenvectors;
  
  /** Eigenvalues for the corresponding eigenvectors */
  private double [] m_eigenvalues = null;

  /** Sorted eigenvalues */
  private int [] m_sortedEigens;

  /** sum of the eigenvalues */
  private double m_sumOfEigenValues = 0.0;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Filters for original data */
  private ReplaceMissingValues m_replaceMissingFilter;
  private NominalToBinary m_nominalToBinFilter;
  private Remove m_attributeFilter;
  private Center m_centerFilter;
  private Standardize m_standardizeFilter;

  /** The number of attributes in the pc transformed data */
  private int m_outputNumAtts = -1;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * the amount of variance to cover in the original data when retaining the
   * best n PC's
   */
  private double m_coverVariance = 0.95;

  /**
   * transform the data through the pc space and back to the original space ?
   */
  private boolean m_transBackToOriginal = false;

  /** maximum number of attributes in the transformed attribute name */
  private int m_maxAttrsInName = 5;

  /**
   * holds the transposed eigenvectors for converting back to the original space
   */
  private double[][] m_eTranspose;

  /**
   * Returns a string describing this attribute transformer
   *
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Performs a principal components analysis and transformation of "
      + "the data. Use in conjunction with a Ranker search. Dimensionality "
      + "reduction is accomplished by choosing enough eigenvectors to "
      + "account for some percentage of the variance in the original data---"
      + "default 0.95 (95%). Attribute noise can be filtered by transforming "
      + "to the PC space, eliminating some of the worst eigenvectors, and "
      + "then transforming back to the original space.";
  }

  /**
   * Returns an enumeration describing the available options.
   * <p>
   *
   * @return an enumeration of all the available options.
   **/
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>(4);

    newVector.addElement(new Option("\tCenter (rather than standardize) the"
      + "\n\tdata and compute PCA using the covariance (rather"
      + "\n\t than the correlation) matrix.", "C", 0, "-C"));

    newVector.addElement(new Option("\tRetain enough PC attributes to account "
      + "\n\tfor this proportion of variance in " + "the original data.\n"
      + "\t(default = 0.95)", "R", 1, "-R"));

    newVector.addElement(new Option("\tTransform through the PC space and "
      + "\n\tback to the original space.", "O", 0, "-O"));

    newVector.addElement(new Option(
      "\tMaximum number of attributes to include in "
        + "\n\ttransformed attribute names. (-1 = include all)", "A", 1, "-A"));
    return newVector.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   *
   * <!-- options-start --> Valid options are:
   * <p/>
   *
   * <pre>
   * -C
   *  Center (rather than standardize) the
   *  data and compute PCA using the covariance (rather
   *   than the correlation) matrix.
   * </pre>
   *
   * <pre>
   * -R
   *  Retain enough PC attributes to account
   *  for this proportion of variance in the original data.
   *  (default = 0.95)
   * </pre>
   *
   * <pre>
   * -O
   *  Transform through the PC space and
   *  back to the original space.
   * </pre>
   *
   * <pre>
   * -A
   *  Maximum number of attributes to include in
   *  transformed attribute names. (-1 = include all)
   * </pre>
   *
   * <!-- options-end -->
<<<<<<< HEAD
=======
=======
  
  /** normalize the input data? */
  //private boolean m_normalize = true;

  /** the amount of variance to cover in the original data when
      retaining the best n PC's */
  private double m_coverVariance = 0.95;

  /** transform the data through the pc space and back to the original
      space ? */
  private boolean m_transBackToOriginal = false;
  
  /** maximum number of attributes in the transformed attribute name */
  private int m_maxAttrsInName = 5;

  /** holds the transposed eigenvectors for converting back to the
      original space */
  private double [][] m_eTranspose;

  /**
   * Returns a string describing this attribute transformer
   * @return a description of the evaluator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "Performs a principal components analysis and transformation of "
      +"the data. Use in conjunction with a Ranker search. Dimensionality "
      +"reduction is accomplished by choosing enough eigenvectors to "
      +"account for some percentage of the variance in the original data---"
      +"default 0.95 (95%). Attribute noise can be filtered by transforming "
      +"to the PC space, eliminating some of the worst eigenvectors, and "
      +"then transforming back to the original space.";
  }

  /**
   * Returns an enumeration describing the available options. <p>
   *
   * @return an enumeration of all the available options.
   **/
  public Enumeration listOptions () {
    Vector newVector = new Vector(3);
    
    newVector.addElement(new Option("\tCenter (rather than standardize) the" +
    		"\n\tdata and compute PCA using the covariance (rather" +
    		"\n\t than the correlation) matrix.",
    		"C", 0, "-C"));

    newVector.addElement(new Option("\tRetain enough PC attributes to account "
                                    +"\n\tfor this proportion of variance in "
                                    +"the original data.\n"
                                    + "\t(default = 0.95)",
                                    "R",1,"-R"));
    
    newVector.addElement(new Option("\tTransform through the PC space and "
                                    +"\n\tback to the original space."
                                    , "O", 0, "-O"));
                                    
    newVector.addElement(new Option("\tMaximum number of attributes to include in "
                                    + "\n\ttransformed attribute names. (-1 = include all)"
                                    , "A", 1, "-A"));
    return  newVector.elements();
  }

  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Don't normalize input data.</pre>
   * 
   * <pre> -R
   *  Retain enough PC attributes to account 
   *  for this proportion of variance in the original data.
   *  (default = 0.95)</pre>
   * 
   * <pre> -O
   *  Transform through the PC space and 
   *  back to the original space.</pre>
   * 
   * <pre> -A
   *  Maximum number of attributes to include in 
   *  transformed attribute names. (-1 = include all)</pre>
   * 
   <!-- options-end -->
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
<<<<<<< HEAD
  @Override
  public void setOptions(String[] options) throws Exception {
=======
<<<<<<< HEAD
  @Override
  public void setOptions(String[] options) throws Exception {
=======
  public void setOptions (String[] options)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    resetOptions();
    String optionString;

    optionString = Utils.getOption('R', options);
    if (optionString.length() != 0) {
      Double temp;
      temp = Double.valueOf(optionString);
      setVarianceCovered(temp.doubleValue());
    }
    optionString = Utils.getOption('A', options);
    if (optionString.length() != 0) {
      setMaximumAttributeNames(Integer.parseInt(optionString));
    }

    setTransformBackToOriginal(Utils.getFlag('O', options));
    setCenterData(Utils.getFlag('C', options));
  }

  /**
   * Reset to defaults
   */
  private void resetOptions() {
    m_coverVariance = 0.95;
    m_sumOfEigenValues = 0.0;
    m_transBackToOriginal = false;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String centerDataTipText() {
    return "Center (rather than standardize) the data. PCA will "
      + "be computed from the covariance (rather than correlation) " + "matrix";
  }

  /**
   * Set whether to center (rather than standardize) the data. If set to true
   * then PCA is computed from the covariance rather than correlation matrix.
   *
   * @param center true if the data is to be centered rather than standardized
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String centerDataTipText() {
    return "Center (rather than standardize) the data. PCA will "
      + "be computed from the covariance (rather than correlation) "
      + "matrix";
  }
  
  /**
   * Set whether to center (rather than standardize)
   * the data. If set to true then PCA is computed
   * from the covariance rather than correlation matrix.
   * 
   * @param center true if the data is to be
   * centered rather than standardized
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setCenterData(boolean center) {
    m_center = center;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Get whether to center (rather than standardize) the data. If true then PCA
   * is computed from the covariance rather than correlation matrix.
   * 
   * @return true if the data is to be centered rather than standardized.
<<<<<<< HEAD
=======
=======
  
  /**
   * Get whether to center (rather than standardize)
   * the data. If true then PCA is computed
   * from the covariance rather than correlation matrix. 
   * 
   * @return true if the data is to be centered rather
   * than standardized.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getCenterData() {
    return m_center;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String varianceCoveredTipText() {
    return "Retain enough PC attributes to account for this proportion of "
      + "variance.";
  }

  /**
   * Sets the amount of variance to account for when retaining principal
   * components
   *
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String varianceCoveredTipText() {
    return "Retain enough PC attributes to account for this proportion of "
      +"variance.";
  }

  /**
   * Sets the amount of variance to account for when retaining
   * principal components
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param vc the proportion of total variance to account for
   */
  public void setVarianceCovered(double vc) {
    m_coverVariance = vc;
  }

  /**
<<<<<<< HEAD
   * Gets the proportion of total variance to account for when retaining
   * principal components
   * 
=======
<<<<<<< HEAD
   * Gets the proportion of total variance to account for when retaining
   * principal components
   * 
=======
   * Gets the proportion of total variance to account for when
   * retaining principal components
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the proportion of variance to account for
   */
  public double getVarianceCovered() {
    return m_coverVariance;
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
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String maximumAttributeNamesTipText() {
    return "The maximum number of attributes to include in transformed attribute names.";
  }

  /**
<<<<<<< HEAD
   * Sets maximum number of attributes to include in transformed attribute
   * names.
   *
=======
<<<<<<< HEAD
   * Sets maximum number of attributes to include in transformed attribute
   * names.
   *
=======
   * Sets maximum number of attributes to include in
   * transformed attribute names.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param m the maximum number of attributes
   */
  public void setMaximumAttributeNames(int m) {
    m_maxAttrsInName = m;
  }

  /**
<<<<<<< HEAD
   * Gets maximum number of attributes to include in transformed attribute
   * names.
   * 
=======
<<<<<<< HEAD
   * Gets maximum number of attributes to include in transformed attribute
   * names.
   * 
=======
   * Gets maximum number of attributes to include in
   * transformed attribute names.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the maximum number of attributes
   */
  public int getMaximumAttributeNames() {
    return m_maxAttrsInName;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String transformBackToOriginalTipText() {
    return "Transform through the PC space and back to the original space. "
      + "If only the best n PCs are retained (by setting varianceCovered < 1) "
      + "then this option will give a dataset in the original space but with "
      + "less attribute noise.";
  }

  /**
   * Sets whether the data should be transformed back to the original space
   *
   * @param b true if the data should be transformed back to the original space
<<<<<<< HEAD
=======
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String transformBackToOriginalTipText() {
    return "Transform through the PC space and back to the original space. "
      +"If only the best n PCs are retained (by setting varianceCovered < 1) "
      +"then this option will give a dataset in the original space but with "
      +"less attribute noise.";
  }

  /**
   * Sets whether the data should be transformed back to the original
   * space
   * @param b true if the data should be transformed back to the
   * original space
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setTransformBackToOriginal(boolean b) {
    m_transBackToOriginal = b;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets whether the data is to be transformed back to the original space.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets whether the data is to be transformed back to the original
   * space.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if the data is to be transformed back to the original space
   */
  public boolean getTransformBackToOriginal() {
    return m_transBackToOriginal;
  }

  /**
   * Gets the current settings of PrincipalComponents
   *
   * @return an array of strings suitable for passing to setOptions()
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    if (getCenterData()) {
      options.add("-C");
    }

    options.add("-R");
    options.add("" + getVarianceCovered());

    options.add("-A");
    options.add("" + getMaximumAttributeNames());

    if (getTransformBackToOriginal()) {
      options.add("-O");
    }

    return options.toArray(new String[0]);
<<<<<<< HEAD
=======
=======
  public String[] getOptions () {

    String[] options = new String[6];
    int current = 0;
    
    if (getCenterData()) {
      options[current++] = "-C";
    }

    options[current++] = "-R";
    options[current++] = ""+getVarianceCovered();

    options[current++] = "-A";
    options[current++] = ""+getMaximumAttributeNames();

    if (getTransformBackToOriginal()) {
      options[current++] = "-O";
    }
    
    while (current < options.length) {
      options[current++] = "";
    }
    
    return  options;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the capabilities of this evaluator.
   *
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the capabilities of this evaluator
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

<<<<<<< HEAD
=======
=======
   * @return            the capabilities of this evaluator
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.UNARY_CLASS);
<<<<<<< HEAD
=======
=======
    
    // class
    result.enable(Capability.NOMINAL_CLASS);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.enable(Capability.NUMERIC_CLASS);
    result.enable(Capability.DATE_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Initializes principal components and performs the analysis
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param data the instances to analyse/transform
   * @throws Exception if analysis fails
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @param data the instances to analyse/transform
   * @throws Exception if analysis fails
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void buildEvaluator(Instances data) throws Exception {
    // can evaluator handle data?
    getCapabilities().testWithFail(data);

    buildAttributeConstructor(data);
  }

<<<<<<< HEAD
  private void buildAttributeConstructor(Instances data) throws Exception {
=======
<<<<<<< HEAD
  private void buildAttributeConstructor(Instances data) throws Exception {
=======
  private void buildAttributeConstructor (Instances data) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_eigenvalues = null;
    m_outputNumAtts = -1;
    m_attributeFilter = null;
    m_nominalToBinFilter = null;
    m_sumOfEigenValues = 0.0;
    m_trainInstances = new Instances(data);

    // make a copy of the training data so that we can get the class
    // column to append to the transformed data (if necessary)
    m_trainHeader = new Instances(m_trainInstances, 0);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_replaceMissingFilter = new ReplaceMissingValues();
    m_replaceMissingFilter.setInputFormat(m_trainInstances);
    m_trainInstances =
      Filter.useFilter(m_trainInstances, m_replaceMissingFilter);

    /*
     * if (m_normalize) { m_normalizeFilter = new Normalize();
     * m_normalizeFilter.setInputFormat(m_trainInstances); m_trainInstances =
     * Filter.useFilter(m_trainInstances, m_normalizeFilter); }
     */

    m_nominalToBinFilter = new NominalToBinary();
    m_nominalToBinFilter.setInputFormat(m_trainInstances);
    m_trainInstances = Filter.useFilter(m_trainInstances, m_nominalToBinFilter);

    // delete any attributes with only one distinct value or are all missing
    Vector<Integer> deleteCols = new Vector<Integer>();
    for (int i = 0; i < m_trainInstances.numAttributes(); i++) {
      if (m_trainInstances.numDistinctValues(i) <= 1) {
<<<<<<< HEAD
=======
=======
    
    m_replaceMissingFilter = new ReplaceMissingValues();
    m_replaceMissingFilter.setInputFormat(m_trainInstances);
    m_trainInstances = Filter.useFilter(m_trainInstances, 
                                        m_replaceMissingFilter);

    /*if (m_normalize) {
      m_normalizeFilter = new Normalize();
      m_normalizeFilter.setInputFormat(m_trainInstances);
      m_trainInstances = Filter.useFilter(m_trainInstances, m_normalizeFilter);
    } */

    m_nominalToBinFilter = new NominalToBinary();
    m_nominalToBinFilter.setInputFormat(m_trainInstances);
    m_trainInstances = Filter.useFilter(m_trainInstances, 
                                        m_nominalToBinFilter);
    
    // delete any attributes with only one distinct value or are all missing
    Vector deleteCols = new Vector();
    for (int i=0;i<m_trainInstances.numAttributes();i++) {
      if (m_trainInstances.numDistinctValues(i) <=1) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        deleteCols.addElement(new Integer(i));
      }
    }

<<<<<<< HEAD
    if (m_trainInstances.classIndex() >= 0) {
=======
<<<<<<< HEAD
    if (m_trainInstances.classIndex() >= 0) {
=======
    if (m_trainInstances.classIndex() >=0) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // get rid of the class column
      m_hasClass = true;
      m_classIndex = m_trainInstances.classIndex();
      deleteCols.addElement(new Integer(m_classIndex));
    }

    // remove columns from the data if necessary
    if (deleteCols.size() > 0) {
      m_attributeFilter = new Remove();
<<<<<<< HEAD
      int[] todelete = new int[deleteCols.size()];
      for (int i = 0; i < deleteCols.size(); i++) {
        todelete[i] = (deleteCols.elementAt(i)).intValue();
=======
<<<<<<< HEAD
      int[] todelete = new int[deleteCols.size()];
      for (int i = 0; i < deleteCols.size(); i++) {
        todelete[i] = (deleteCols.elementAt(i)).intValue();
=======
      int [] todelete = new int [deleteCols.size()];
      for (int i=0;i<deleteCols.size();i++) {
        todelete[i] = ((Integer)(deleteCols.elementAt(i))).intValue();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_attributeFilter.setAttributeIndicesArray(todelete);
      m_attributeFilter.setInvertSelection(false);
      m_attributeFilter.setInputFormat(m_trainInstances);
      m_trainInstances = Filter.useFilter(m_trainInstances, m_attributeFilter);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // can evaluator handle the processed data ? e.g., enough attributes?
    getCapabilities().testWithFail(m_trainInstances);

    m_numInstances = m_trainInstances.numInstances();
    m_numAttribs = m_trainInstances.numAttributes();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    fillCovariance();

    SymmDenseEVD evd = SymmDenseEVD.factorize(m_correlation);

    m_eigenvectors = Matrices.getArray(evd.getEigenvectors());
    m_eigenvalues = evd.getEigenvalues();

    /*
     * for (int i = 0; i < m_numAttribs; i++) { for (int j = 0; j <
     * m_numAttribs; j++) { System.err.println(v[i][j] + " "); }
     * System.err.println(d[i]); }
     */
<<<<<<< HEAD
=======
=======
    //fillCorrelation();
    fillCovariance();

    double [] d = new double[m_numAttribs]; 
    double [][] v = new double[m_numAttribs][m_numAttribs];

    Matrix corr = new Matrix(m_correlation);
    corr.eigenvalueDecomposition(v, d);
    m_eigenvectors = (double [][])v.clone();
    m_eigenvalues = (double [])d.clone();
    
    /*for (int i = 0; i < m_numAttribs; i++) {
      for (int j = 0; j < m_numAttribs; j++) {
        System.err.println(v[i][j] + " ");
      }
      System.err.println(d[i]);
    } */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // any eigenvalues less than 0 are not worth anything --- change to 0
    for (int i = 0; i < m_eigenvalues.length; i++) {
      if (m_eigenvalues[i] < 0) {
        m_eigenvalues[i] = 0.0;
      }
    }
    m_sortedEigens = Utils.sort(m_eigenvalues);
    m_sumOfEigenValues = Utils.sum(m_eigenvalues);

    m_transformedFormat = setOutputFormat();
    if (m_transBackToOriginal) {
      m_originalSpaceFormat = setOutputFormatOriginal();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // new ordered eigenvector matrix
      int numVectors =
        (m_transformedFormat.classIndex() < 0) ? m_transformedFormat
          .numAttributes() : m_transformedFormat.numAttributes() - 1;

      double[][] orderedVectors =
        new double[m_eigenvectors.length][numVectors + 1];

      // try converting back to the original space
      for (int i = m_numAttribs - 1; i > (m_numAttribs - numVectors - 1); i--) {
        for (int j = 0; j < m_numAttribs; j++) {
          orderedVectors[j][m_numAttribs - i] =
            m_eigenvectors[j][m_sortedEigens[i]];
        }
      }

      // transpose the matrix
      int nr = orderedVectors.length;
      int nc = orderedVectors[0].length;
      m_eTranspose = new double[nc][nr];
<<<<<<< HEAD
=======
=======
      
      // new ordered eigenvector matrix
      int numVectors = (m_transformedFormat.classIndex() < 0) 
        ? m_transformedFormat.numAttributes()
        : m_transformedFormat.numAttributes() - 1;

      double [][] orderedVectors = 
        new double [m_eigenvectors.length][numVectors + 1];
      
      // try converting back to the original space
      for (int i = m_numAttribs - 1; i > (m_numAttribs - numVectors - 1); i--) {
        for (int j = 0; j < m_numAttribs; j++) {
          orderedVectors[j][m_numAttribs - i] = 
            m_eigenvectors[j][m_sortedEigens[i]];
        }
      }
      
      // transpose the matrix
      int nr = orderedVectors.length;
      int nc = orderedVectors[0].length;
      m_eTranspose = 
        new double [nc][nr];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (int i = 0; i < nc; i++) {
        for (int j = 0; j < nr; j++) {
          m_eTranspose[i][j] = orderedVectors[j][i];
        }
      }
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns just the header for the transformed data (ie. an empty set of
   * instances. This is so that AttributeSelection can determine the structure
   * of the transformed data without actually having to get all the transformed
   * data through transformedData().
   *
   * @return the header of the transformed data.
   * @throws Exception if the header of the transformed data can't be
   *           determined.
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Returns just the header for the transformed data (ie. an empty
   * set of instances. This is so that AttributeSelection can
   * determine the structure of the transformed data without actually
   * having to get all the transformed data through transformedData().
   * @return the header of the transformed data.
   * @throws Exception if the header of the transformed data can't
   * be determined.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instances transformedHeader() throws Exception {
    if (m_eigenvalues == null) {
      throw new Exception("Principal components hasn't been built yet");
    }
    if (m_transBackToOriginal) {
      return m_originalSpaceFormat;
    } else {
      return m_transformedFormat;
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Return the header of the training data after all filtering - i.e missing
   * values and nominal to binary.
   *
   * @return the header of the training data after all filtering.
   */
  public Instances getFilteredInputFormat() {
    return new Instances(m_trainInstances, 0);
  }

  /**
   * Return the correlation/covariance matrix
   *
   * @return the correlation or covariance matrix
   */
  public double[][] getCorrelationMatrix() {
    return Matrices.getArray(m_correlation);
  }

  /**
   * Return the unsorted eigenvectors
   *
   * @return the unsorted eigenvectors
   */
  public double[][] getUnsortedEigenVectors() {
    return m_eigenvectors;
  }

  /**
   * Return the eigenvalues corresponding to the eigenvectors
   *
   * @return the eigenvalues
   */
  public double[] getEigenValues() {
    return m_eigenvalues;
  }

  /**
   * Gets the transformed training data.
   *
   * @return the transformed training data
   * @throws Exception if transformed data can't be returned
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Gets the transformed training data.
   * @return the transformed training data
   * @throws Exception if transformed data can't be returned
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instances transformedData(Instances data) throws Exception {
    if (m_eigenvalues == null) {
      throw new Exception("Principal components hasn't been built yet");
    }

    Instances output = null;

    if (m_transBackToOriginal) {
      output = new Instances(m_originalSpaceFormat);
    } else {
      output = new Instances(m_transformedFormat);
    }
    for (int i = 0; i < data.numInstances(); i++) {
      Instance converted = convertInstance(data.instance(i));
      output.add(converted);
    }

    return output;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Evaluates the merit of a transformed attribute. This is defined to be 1
   * minus the cumulative variance explained. Merit can't be meaningfully
   * evaluated if the data is to be transformed back to the original space.
   *
<<<<<<< HEAD
=======
=======
   * Evaluates the merit of a transformed attribute. This is defined
   * to be 1 minus the cumulative variance explained. Merit can't
   * be meaningfully evaluated if the data is to be transformed back
   * to the original space.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param att the attribute to be evaluated
   * @return the merit of a transformed attribute
   * @throws Exception if attribute can't be evaluated
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public double evaluateAttribute(int att) throws Exception {
    if (m_eigenvalues == null) {
      throw new Exception("Principal components hasn't been built yet!");
    }

    if (m_transBackToOriginal) {
      return 1.0; // can't evaluate back in the original space!
    }

    // return 1-cumulative variance explained for this transformed att
    double cumulative = 0.0;
    for (int i = m_numAttribs - 1; i >= m_numAttribs - att - 1; i--) {
      cumulative += m_eigenvalues[m_sortedEigens[i]];
    }

    return 1.0 - cumulative / m_sumOfEigenValues;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private void fillCovariance() throws Exception {
    // first store the means
    m_means = new double[m_trainInstances.numAttributes()];
    m_stdDevs = new double[m_trainInstances.numAttributes()];
    for (int i = 0; i < m_trainInstances.numAttributes(); i++) {
      m_means[i] = m_trainInstances.meanOrMode(i);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_stdDevs[i] =
        Math.sqrt(Utils.variance(m_trainInstances.attributeToDoubleArray(i)));
    }

    // just center the data or standardize it?
    if (m_center) {
      m_centerFilter = new Center();
      m_centerFilter.setInputFormat(m_trainInstances);
      m_trainInstances = Filter.useFilter(m_trainInstances, m_centerFilter);
    } else {
      m_standardizeFilter = new Standardize();
      m_standardizeFilter.setInputFormat(m_trainInstances);
      m_trainInstances = Filter.useFilter(m_trainInstances, m_standardizeFilter);
    }

    // now compute the covariance matrix
    m_correlation = new UpperSymmDenseMatrix(m_numAttribs);
    for (int i = 0; i < m_numAttribs; i++) {
      for (int j = i; j < m_numAttribs; j++) {

        double cov = 0;
        for (Instance inst : m_trainInstances) {
          cov += inst.value(i) * inst.value(j);
        }

        cov /= m_trainInstances.numInstances() - 1;
        m_correlation.set(i, j, cov);
      }
    }
<<<<<<< HEAD
=======
=======
    }
    
    if (!m_center) {
      fillCorrelation();
      return;
    }
    
    double[] att = new double[m_trainInstances.numInstances()];
    
    // now center the data by subtracting the mean
    m_centerFilter = new Center();
    m_centerFilter.setInputFormat(m_trainInstances);
    m_trainInstances = Filter.useFilter(m_trainInstances, m_centerFilter);
    
    // now compute the covariance matrix
    m_correlation = new double[m_numAttribs][m_numAttribs];
    
    for (int i = 0; i < m_numAttribs; i++) {
      for (int j = 0; j < m_numAttribs; j++) {
        
        double cov = 0;
        for (int k = 0; k < m_numInstances; k++) {
       
          if (i == j) {
            cov += (m_trainInstances.instance(k).value(i) *
                m_trainInstances.instance(k).value(i));
          } else {
          cov += (m_trainInstances.instance(k).value(i) *
              m_trainInstances.instance(k).value(j));
          }
        }
        
        cov /= (double)(m_trainInstances.numInstances() - 1);
        m_correlation[i][j] = cov;
        m_correlation[j][i] = cov;                
      }
    }
  }

  /**
   * Fill the correlation matrix
   */
  private void fillCorrelation() throws Exception {
    m_correlation = new double[m_numAttribs][m_numAttribs];
    double [] att1 = new double [m_numInstances];
    double [] att2 = new double [m_numInstances];
    double corr;

    for (int i = 0; i < m_numAttribs; i++) {
      for (int j = 0; j < m_numAttribs; j++) {
        for (int k = 0; k < m_numInstances; k++) {
          att1[k] = m_trainInstances.instance(k).value(i);
          att2[k] = m_trainInstances.instance(k).value(j);
        }
        if (i == j) {
          m_correlation[i][j] = 1.0;
            // store the standard deviation
            m_stdDevs[i] = Math.sqrt(Utils.variance(att1));
        } else {
          corr = Utils.correlation(att1,att2,m_numInstances);
          m_correlation[i][j] = corr;
          m_correlation[j][i] = corr;
        }
      }
    }
    
    // now standardize the input data
    m_standardizeFilter = new Standardize();
    m_standardizeFilter.setInputFormat(m_trainInstances);
    m_trainInstances = Filter.useFilter(m_trainInstances, m_standardizeFilter);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Return a summary of the analysis
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a summary of the analysis.
   */
  private String principalComponentsSummary() {
    StringBuffer result = new StringBuffer();
    double cumulative = 0.0;
    Instances output = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int numVectors = 0;

    try {
      output = setOutputFormat();
      numVectors =
        (output.classIndex() < 0) ? output.numAttributes() : output
          .numAttributes() - 1;
    } catch (Exception ex) {
    }
    // tomorrow
    String corrCov = (m_center) ? "Covariance " : "Correlation ";
    result
      .append(corrCov + "matrix\n" + matrixToString(Matrices.getArray(m_correlation)) + "\n\n");
    result.append("eigenvalue\tproportion\tcumulative\n");
    for (int i = m_numAttribs - 1; i > (m_numAttribs - numVectors - 1); i--) {
      cumulative += m_eigenvalues[m_sortedEigens[i]];
      result.append(Utils
        .doubleToString(m_eigenvalues[m_sortedEigens[i]], 9, 5)
        + "\t"
        + Utils.doubleToString(
          (m_eigenvalues[m_sortedEigens[i]] / m_sumOfEigenValues), 9, 5)
        + "\t"
        + Utils.doubleToString((cumulative / m_sumOfEigenValues), 9, 5)
        + "\t"
        + output.attribute(m_numAttribs - i - 1).name() + "\n");
    }

    result.append("\nEigenvectors\n");
    for (int j = 1; j <= numVectors; j++) {
      result.append(" V" + j + '\t');
<<<<<<< HEAD
=======
=======
    int numVectors=0;

    try {
      output = setOutputFormat();
      numVectors = (output.classIndex() < 0) 
        ? output.numAttributes()
        : output.numAttributes()-1;
    } catch (Exception ex) {
    }
    //tomorrow
    String corrCov = (m_center) ? "Covariance " : "Correlation ";
    result.append(corrCov + "matrix\n"+matrixToString(m_correlation)
                  +"\n\n");
    result.append("eigenvalue\tproportion\tcumulative\n");
    for (int i = m_numAttribs - 1; i > (m_numAttribs - numVectors - 1); i--) {
      cumulative+=m_eigenvalues[m_sortedEigens[i]];
      result.append(Utils.doubleToString(m_eigenvalues[m_sortedEigens[i]],9,5)
                    +"\t"+Utils.
                    doubleToString((m_eigenvalues[m_sortedEigens[i]] / 
                                    m_sumOfEigenValues),
                                     9,5)
                    +"\t"+Utils.doubleToString((cumulative / 
                                                m_sumOfEigenValues),9,5)
                    +"\t"+output.attribute(m_numAttribs - i - 1).name()+"\n");
    }

    result.append("\nEigenvectors\n");
    for (int j = 1;j <= numVectors;j++) {
      result.append(" V"+j+'\t');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    result.append("\n");
    for (int j = 0; j < m_numAttribs; j++) {

      for (int i = m_numAttribs - 1; i > (m_numAttribs - numVectors - 1); i--) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        result.append(Utils.doubleToString(
          m_eigenvectors[j][m_sortedEigens[i]], 7, 4) + "\t");
      }
      result.append(m_trainInstances.attribute(j).name() + '\n');
<<<<<<< HEAD
=======
=======
        result.append(Utils.
                      doubleToString(m_eigenvectors[j][m_sortedEigens[i]],7,4)
                      +"\t");
      }
      result.append(m_trainInstances.attribute(j).name()+'\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    if (m_transBackToOriginal) {
      result.append("\nPC space transformed back to original space.\n"
<<<<<<< HEAD
        + "(Note: can't evaluate attributes in the original " + "space)\n");
=======
<<<<<<< HEAD
        + "(Note: can't evaluate attributes in the original " + "space)\n");
=======
                    +"(Note: can't evaluate attributes in the original "
                    +"space)\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return result.toString();
  }

  /**
   * Returns a description of this attribute transformer
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return a String describing this attribute transformer
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @return a String describing this attribute transformer
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {
    if (m_eigenvalues == null) {
      return "Principal components hasn't been built yet!";
    } else {
      return "\tPrincipal Components Attribute Transformer\n\n"
<<<<<<< HEAD
        + principalComponentsSummary();
=======
<<<<<<< HEAD
        + principalComponentsSummary();
=======
        +principalComponentsSummary();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Return a matrix as a String
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param matrix that is decribed as a string
   * @return a String describing a matrix
   */
  public static String matrixToString(double[][] matrix) {
<<<<<<< HEAD
=======
=======
   * @param matrix that is decribed as a string
   * @return a String describing a matrix
   */
  private String matrixToString(double [][] matrix) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    StringBuffer result = new StringBuffer();
    int last = matrix.length - 1;

    for (int i = 0; i <= last; i++) {
      for (int j = 0; j <= last; j++) {
<<<<<<< HEAD
        result.append(Utils.doubleToString(matrix[i][j], 6, 2) + " ");
=======
<<<<<<< HEAD
        result.append(Utils.doubleToString(matrix[i][j], 6, 2) + " ");
=======
        result.append(Utils.doubleToString(matrix[i][j],6,2)+" ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (j == last) {
          result.append('\n');
        }
      }
    }
    return result.toString();
  }

  /**
   * Convert a pc transformed instance back to the original space
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param inst the instance to convert
   * @return the processed instance
   * @throws Exception if something goes wrong
   */
  private Instance convertInstanceToOriginal(Instance inst) throws Exception {
    double[] newVals = null;

    if (m_hasClass) {
      newVals = new double[m_numAttribs + 1];
<<<<<<< HEAD
=======
=======
   * 
   * @param inst        the instance to convert
   * @return            the processed instance
   * @throws Exception  if something goes wrong
   */
  private Instance convertInstanceToOriginal(Instance inst)
    throws Exception {
    double[] newVals = null;

    if (m_hasClass) {
      newVals = new double[m_numAttribs+1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      newVals = new double[m_numAttribs];
    }

    if (m_hasClass) {
      // class is always appended as the last attribute
      newVals[m_numAttribs] = inst.value(inst.numAttributes() - 1);
    }

    for (int i = 0; i < m_eTranspose[0].length; i++) {
      double tempval = 0.0;
      for (int j = 1; j < m_eTranspose.length; j++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        tempval += (m_eTranspose[j][i] * inst.value(j - 1));
      }
      newVals[i] = tempval;
      if (!m_center) {
        newVals[i] *= m_stdDevs[i];
      }
      newVals[i] += m_means[i];
    }

    if (inst instanceof SparseInstance) {
      return new SparseInstance(inst.weight(), newVals);
    } else {
      return new DenseInstance(inst.weight(), newVals);
    }
  }

  /**
   * Transform an instance in original (unormalized) format. Convert back to the
   * original space if requested.
   *
<<<<<<< HEAD
=======
=======
        tempval += (m_eTranspose[j][i] * 
                    inst.value(j - 1));
       }
      newVals[i] = tempval;
      if (!m_center) {
        newVals[i] *= m_stdDevs[i];
      } 
      newVals[i] += m_means[i];
    }
    
    if (inst instanceof SparseInstance) {
      return new SparseInstance(inst.weight(), newVals);
    } else {
      return new Instance(inst.weight(), newVals);
    }      
  }

  /**
   * Transform an instance in original (unormalized) format. Convert back
   * to the original space if requested.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param instance an instance in the original (unormalized) format
   * @return a transformed instance
   * @throws Exception if instance cant be transformed
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instance convertInstance(Instance instance) throws Exception {

    if (m_eigenvalues == null) {
      throw new Exception("convertInstance: Principal components not "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        + "built yet");
    }

    double[] newVals = new double[m_outputNumAtts];
    Instance tempInst = (Instance) instance.copy();
    if (!instance.dataset().equalHeaders(m_trainHeader)) {
      throw new Exception("Can't convert instance: header's don't match: "
        + "PrincipalComponents\n"
        + instance.dataset().equalHeadersMsg(m_trainHeader));
<<<<<<< HEAD
=======
=======
                          +"built yet");
    }

    double[] newVals = new double[m_outputNumAtts];
    Instance tempInst = (Instance)instance.copy();
    if (!instance.dataset().equalHeaders(m_trainHeader)) {
      throw new Exception("Can't convert instance: header's don't match: "
                          +"PrincipalComponents\n"
                          + "Can't convert instance: header's don't match.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    m_replaceMissingFilter.input(tempInst);
    m_replaceMissingFilter.batchFinished();
    tempInst = m_replaceMissingFilter.output();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /*
     * if (m_normalize) { m_normalizeFilter.input(tempInst);
     * m_normalizeFilter.batchFinished(); tempInst = m_normalizeFilter.output();
     * }
     */
<<<<<<< HEAD
=======
=======
    /*if (m_normalize) {
      m_normalizeFilter.input(tempInst);
      m_normalizeFilter.batchFinished();
      tempInst = m_normalizeFilter.output();
    }*/
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_nominalToBinFilter.input(tempInst);
    m_nominalToBinFilter.batchFinished();
    tempInst = m_nominalToBinFilter.output();

    if (m_attributeFilter != null) {
      m_attributeFilter.input(tempInst);
      m_attributeFilter.batchFinished();
      tempInst = m_attributeFilter.output();
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (!m_center) {
      m_standardizeFilter.input(tempInst);
      m_standardizeFilter.batchFinished();
      tempInst = m_standardizeFilter.output();
    } else {
      m_centerFilter.input(tempInst);
      m_centerFilter.batchFinished();
      tempInst = m_centerFilter.output();
    }

    if (m_hasClass) {
<<<<<<< HEAD
      newVals[m_outputNumAtts - 1] = instance.value(instance.classIndex());
=======
<<<<<<< HEAD
      newVals[m_outputNumAtts - 1] = instance.value(instance.classIndex());
=======
       newVals[m_outputNumAtts - 1] = instance.value(instance.classIndex());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    double cumulative = 0;
    for (int i = m_numAttribs - 1; i >= 0; i--) {
      double tempval = 0.0;
      for (int j = 0; j < m_numAttribs; j++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        tempval += (m_eigenvectors[j][m_sortedEigens[i]] * tempInst.value(j));
      }
      newVals[m_numAttribs - i - 1] = tempval;
      cumulative += m_eigenvalues[m_sortedEigens[i]];
<<<<<<< HEAD
=======
=======
        tempval += (m_eigenvectors[j][m_sortedEigens[i]] * 
                    tempInst.value(j));
       }
      newVals[m_numAttribs - i - 1] = tempval;
      cumulative+=m_eigenvalues[m_sortedEigens[i]];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if ((cumulative / m_sumOfEigenValues) >= m_coverVariance) {
        break;
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (!m_transBackToOriginal) {
      if (instance instanceof SparseInstance) {
        return new SparseInstance(instance.weight(), newVals);
      } else {
        return new DenseInstance(instance.weight(), newVals);
      }
    } else {
      if (instance instanceof SparseInstance) {
        return convertInstanceToOriginal(new SparseInstance(instance.weight(),
          newVals));
      } else {
        return convertInstanceToOriginal(new DenseInstance(instance.weight(),
          newVals));
<<<<<<< HEAD
=======
=======
    
    if (!m_transBackToOriginal) {
      if (instance instanceof SparseInstance) {
      return new SparseInstance(instance.weight(), newVals);
      } else {
        return new Instance(instance.weight(), newVals);
      }      
    } else {
      if (instance instanceof SparseInstance) {
        return convertInstanceToOriginal(new SparseInstance(instance.weight(), 
                                                            newVals));
      } else {
        return convertInstanceToOriginal(new Instance(instance.weight(),
                                                      newVals));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Set up the header for the PC->original space dataset
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return the output format
   * @throws Exception if something goes wrong
   */
  private Instances setOutputFormatOriginal() throws Exception {
    ArrayList<Attribute> attributes = new ArrayList<Attribute>();

    for (int i = 0; i < m_numAttribs; i++) {
      String att = m_trainInstances.attribute(i).name();
      attributes.add(new Attribute(att));
    }

    if (m_hasClass) {
      attributes.add((Attribute) m_trainHeader.classAttribute().copy());
    }

    Instances outputFormat =
      new Instances(m_trainHeader.relationName() + "->PC->original space",
        attributes, 0);

    // set the class to be the last attribute if necessary
    if (m_hasClass) {
      outputFormat.setClassIndex(outputFormat.numAttributes() - 1);
<<<<<<< HEAD
=======
=======
   * 
   * @return            the output format
   * @throws Exception  if something goes wrong
   */
  private Instances setOutputFormatOriginal() throws Exception {
    FastVector attributes = new FastVector();
    
    for (int i = 0; i < m_numAttribs; i++) {
      String att = m_trainInstances.attribute(i).name();
      attributes.addElement(new Attribute(att));
    }
    
    if (m_hasClass) {
      attributes.addElement(m_trainHeader.classAttribute().copy());
    }

    Instances outputFormat = 
      new Instances(m_trainHeader.relationName()+"->PC->original space",
                    attributes, 0);
    
    // set the class to be the last attribute if necessary
    if (m_hasClass) {
      outputFormat.setClassIndex(outputFormat.numAttributes()-1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    return outputFormat;
  }

  /**
   * Set the format for the transformed data
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a set of empty Instances (header only) in the new format
   * @throws Exception if the output format can't be set
   */
  private Instances setOutputFormat() throws Exception {
    if (m_eigenvalues == null) {
      return null;
    }

    double cumulative = 0.0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Attribute> attributes = new ArrayList<Attribute>();
    for (int i = m_numAttribs - 1; i >= 0; i--) {
      StringBuffer attName = new StringBuffer();
      // build array of coefficients
      double[] coeff_mags = new double[m_numAttribs];
      for (int j = 0; j < m_numAttribs; j++) {
        coeff_mags[j] = -Math.abs(m_eigenvectors[j][m_sortedEigens[i]]);
      }
      int num_attrs =
        (m_maxAttrsInName > 0) ? Math.min(m_numAttribs, m_maxAttrsInName)
          : m_numAttribs;
      // this array contains the sorted indices of the coefficients
      int[] coeff_inds;
      if (m_numAttribs > 0) {
        // if m_maxAttrsInName > 0, sort coefficients by decreasing magnitude
        coeff_inds = Utils.sort(coeff_mags);
      } else {
        // if m_maxAttrsInName <= 0, use all coeffs in original order
        coeff_inds = new int[m_numAttribs];
        for (int j = 0; j < m_numAttribs; j++) {
          coeff_inds[j] = j;
        }
      }
      // build final attName string
      for (int j = 0; j < num_attrs; j++) {
        double coeff_value = m_eigenvectors[coeff_inds[j]][m_sortedEigens[i]];
        if (j > 0 && coeff_value >= 0) {
          attName.append("+");
        }
        attName.append(Utils.doubleToString(coeff_value, 5, 3)
          + m_trainInstances.attribute(coeff_inds[j]).name());
      }
      if (num_attrs < m_numAttribs) {
        attName.append("...");
      }

      attributes.add(new Attribute(attName.toString()));
      cumulative += m_eigenvalues[m_sortedEigens[i]];

      if ((cumulative / m_sumOfEigenValues) >= m_coverVariance) {
        break;
      }
    }

    if (m_hasClass) {
      attributes.add((Attribute) m_trainHeader.classAttribute().copy());
    }

    Instances outputFormat =
      new Instances(m_trainInstances.relationName() + "_principal components",
        attributes, 0);

    // set the class to be the last attribute if necessary
    if (m_hasClass) {
      outputFormat.setClassIndex(outputFormat.numAttributes() - 1);
    }

    m_outputNumAtts = outputFormat.numAttributes();
    return outputFormat;
  }

  /**
   * Returns the revision string.
   *
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 12659 $");
<<<<<<< HEAD
=======
=======
    FastVector attributes = new FastVector();
     for (int i = m_numAttribs - 1; i >= 0; i--) {
       StringBuffer attName = new StringBuffer();
       // build array of coefficients
       double[] coeff_mags = new double[m_numAttribs];
       for (int j = 0; j < m_numAttribs; j++)
         coeff_mags[j] = -Math.abs(m_eigenvectors[j][m_sortedEigens[i]]);
       int num_attrs = (m_maxAttrsInName > 0) ? Math.min(m_numAttribs, m_maxAttrsInName) : m_numAttribs;
       // this array contains the sorted indices of the coefficients
       int[] coeff_inds;
       if (m_numAttribs > 0) {
          // if m_maxAttrsInName > 0, sort coefficients by decreasing magnitude
          coeff_inds = Utils.sort(coeff_mags);
       } else {
          // if  m_maxAttrsInName <= 0, use all coeffs in original order
          coeff_inds = new int[m_numAttribs];
          for (int j=0; j<m_numAttribs; j++)
            coeff_inds[j] = j;
       }
       // build final attName string
       for (int j = 0; j < num_attrs; j++) {
         double coeff_value = m_eigenvectors[coeff_inds[j]][m_sortedEigens[i]];
         if (j > 0 && coeff_value >= 0)
           attName.append("+");
         attName.append(Utils.doubleToString(coeff_value,5,3)
                        +m_trainInstances.attribute(coeff_inds[j]).name());
       }
       if (num_attrs < m_numAttribs)
         attName.append("...");
         
       attributes.addElement(new Attribute(attName.toString()));
       cumulative+=m_eigenvalues[m_sortedEigens[i]];

       if ((cumulative / m_sumOfEigenValues) >= m_coverVariance) {
         break;
       }
     }
     
     if (m_hasClass) {
       attributes.addElement(m_trainHeader.classAttribute().copy());
     }

     Instances outputFormat = 
       new Instances(m_trainInstances.relationName()+"_principal components",
                     attributes, 0);

     // set the class to be the last attribute if necessary
     if (m_hasClass) {
       outputFormat.setClassIndex(outputFormat.numAttributes()-1);
     }
     
     m_outputNumAtts = outputFormat.numAttributes();
     return outputFormat;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 6690 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param argv should contain the command line arguments to the
   *          evaluator/transformer (see AttributeSelection)
   */
  public static void main(String[] argv) {
<<<<<<< HEAD
=======
=======
   * @param argv should contain the command line arguments to the
   * evaluator/transformer (see AttributeSelection)
   */
  public static void main(String [] argv) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    runEvaluator(new PrincipalComponents(), argv);
  }
}
