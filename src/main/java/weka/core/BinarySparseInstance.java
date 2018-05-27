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
 *    BinarySparseInstance.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Class for storing a binary-data-only instance as a sparse vector. A sparse
 * instance only requires storage for those attribute values that are non-zero.
 * Since the objective is to reduce storage requirements for datasets with large
 * numbers of default values, this also includes nominal attributes -- the first
 * nominal value (i.e. that which has index 0) will not require explicit
 * storage, so rearrange your nominal attribute value orderings if necessary.
 * Missing values are not supported, and will be treated as 1 (true).
 * 
 * @version $Revision: 12472 $
 */
public class BinarySparseInstance extends SparseInstance {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;

/**
 * Class for storing a binary-data-only instance as a sparse vector. A
 * sparse instance only requires storage for those attribute values
 * that are non-zero.  Since the objective is to reduce storage
 * requirements for datasets with large numbers of default values,
 * this also includes nominal attributes -- the first nominal value
 * (i.e. that which has index 0) will not require explicit storage, so
 * rearrange your nominal attribute value orderings if
 * necessary. Missing values are not supported, and will be treated as 
 * 1 (true).
 *
 * @version $Revision: 1.13 $
 */
public class BinarySparseInstance
  extends SparseInstance {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -5297388762342528737L;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructor that generates a sparse instance from the given instance.
   * Reference to the dataset is set to null. (ie. the instance doesn't have
   * access to information about the attribute types)
   * 
   * @param instance the instance from which the attribute values and the weight
   *          are to be copied
   */
  public BinarySparseInstance(Instance instance) {

    m_Weight = instance.weight();
<<<<<<< HEAD
=======
=======
   * Constructor that generates a sparse instance from the given
   * instance. Reference to the dataset is set to null.
   * (ie. the instance doesn't have access to information about the
   * attribute types)
   *
   * @param instance the instance from which the attribute values
   * and the weight are to be copied
   */
  public BinarySparseInstance(Instance instance) {
    
    m_Weight = instance.m_Weight;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Dataset = null;
    m_NumAttributes = instance.numAttributes();
    if (instance instanceof SparseInstance) {
      m_AttValues = null;
<<<<<<< HEAD
      m_Indices = ((SparseInstance) instance).m_Indices;
=======
<<<<<<< HEAD
      m_Indices = ((SparseInstance) instance).m_Indices;
=======
      m_Indices = ((SparseInstance)instance).m_Indices;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      int[] tempIndices = new int[instance.numAttributes()];
      int vals = 0;
      for (int i = 0; i < instance.numAttributes(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (instance.value(i) != 0) {
          tempIndices[vals] = i;
          vals++;
        }
<<<<<<< HEAD
=======
=======
	if (instance.value(i) != 0) {
	  tempIndices[vals] = i;
	  vals++;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_AttValues = null;
      m_Indices = new int[vals];
      System.arraycopy(tempIndices, 0, m_Indices, 0, vals);
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Constructor that copies the info from the given instance. Reference to the
   * dataset is set to null. (ie. the instance doesn't have access to
   * information about the attribute types)
   * 
   * @param instance the instance from which the attribute info is to be copied
   */
  public BinarySparseInstance(SparseInstance instance) {

<<<<<<< HEAD
=======
=======
  
  /**
   * Constructor that copies the info from the given instance. 
   * Reference to the dataset is set to null.
   * (ie. the instance doesn't have access to information about the
   * attribute types)
   *
   * @param instance the instance from which the attribute
   * info is to be copied 
   */
  public BinarySparseInstance(SparseInstance instance) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_AttValues = null;
    m_Indices = instance.m_Indices;
    m_Weight = instance.m_Weight;
    m_NumAttributes = instance.m_NumAttributes;
    m_Dataset = null;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructor that generates a sparse instance from the given parameters.
   * Reference to the dataset is set to null. (ie. the instance doesn't have
   * access to information about the attribute types)
   * 
   * @param weight the instance's weight
   * @param attValues a vector of attribute values
   */
  public BinarySparseInstance(double weight, double[] attValues) {

<<<<<<< HEAD
=======
=======
   * Constructor that generates a sparse instance from the given
   * parameters. Reference to the dataset is set to null.
   * (ie. the instance doesn't have access to information about the
   * attribute types)
   *
   * @param weight the instance's weight
   * @param attValues a vector of attribute values 
   */
  public BinarySparseInstance(double weight, double[] attValues) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Weight = weight;
    m_Dataset = null;
    m_NumAttributes = attValues.length;
    int[] tempIndices = new int[m_NumAttributes];
    int vals = 0;
    for (int i = 0; i < m_NumAttributes; i++) {
      if (attValues[i] != 0) {
<<<<<<< HEAD
        tempIndices[vals] = i;
        vals++;
=======
<<<<<<< HEAD
        tempIndices[vals] = i;
        vals++;
=======
	tempIndices[vals] = i;
	vals++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_AttValues = null;
    m_Indices = new int[vals];
    System.arraycopy(tempIndices, 0, m_Indices, 0, vals);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Constructor that inititalizes instance variable with given values.
   * Reference to the dataset is set to null. (ie. the instance doesn't have
   * access to information about the attribute types)
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Constructor that inititalizes instance variable with given
   * values. Reference to the dataset is set to null. (ie. the instance
   * doesn't have access to information about the attribute types)
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param weight the instance's weight
   * @param indices the indices of the given values in the full vector
   * @param maxNumValues the maximium number of values that can be stored
   */
<<<<<<< HEAD
  public BinarySparseInstance(double weight, int[] indices, int maxNumValues) {

=======
<<<<<<< HEAD
  public BinarySparseInstance(double weight, int[] indices, int maxNumValues) {

=======
  public BinarySparseInstance(double weight,
                              int[] indices, int maxNumValues) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_AttValues = null;
    m_Indices = indices;
    m_Weight = weight;
    m_NumAttributes = maxNumValues;
    m_Dataset = null;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructor of an instance that sets weight to one, all values to 1, and
   * the reference to the dataset to null. (ie. the instance doesn't have access
   * to information about the attribute types)
   * 
   * @param numAttributes the size of the instance
   */
  public BinarySparseInstance(int numAttributes) {

<<<<<<< HEAD
=======
=======
   * Constructor of an instance that sets weight to one, all values to
   * 1, and the reference to the dataset to null. (ie. the instance
   * doesn't have access to information about the attribute types)
   *
   * @param numAttributes the size of the instance 
   */
  public BinarySparseInstance(int numAttributes) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_AttValues = null;
    m_NumAttributes = numAttributes;
    m_Indices = new int[numAttributes];
    for (int i = 0; i < m_Indices.length; i++) {
      m_Indices[i] = i;
    }
    m_Weight = 1;
    m_Dataset = null;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Produces a shallow copy of this instance. The copy has access to the same
   * dataset. (if you want to make a copy that doesn't have access to the
   * dataset, use <code>new BinarySparseInstance(instance)</code>
   *
   * @return the shallow copy
   */
  @Override
  public Object copy() {

    BinarySparseInstance result = new BinarySparseInstance(this);
    result.m_Dataset = m_Dataset;
    return result;
  }

  /**
   * Copies the instance but fills up its values based on the given array
   * of doubles. The copy has access to the same dataset.
   *
   * @param values the array with new values
   * @return the new instance
   */
  public Instance copy(double[] values) {

    BinarySparseInstance result = new BinarySparseInstance(this.m_Weight, values);
    result.m_Dataset = m_Dataset;
    return result;
  }

  /**
   * Merges this instance with the given instance and returns the result.
   * Dataset is set to null.
   * 
   * @param inst the instance to be merged with this one
   * @return the merged instances
   */
  @Override
  public Instance mergeInstance(Instance inst) {

    int[] indices = new int[numValues() + inst.numValues()];
<<<<<<< HEAD
=======
=======
   * Produces a shallow copy of this instance. The copy doesn't have
   * access to a dataset.
   *
   * @return the shallow copy
   */
  public Object copy() {

    return new BinarySparseInstance(this);
  }

  /**
   * Merges this instance with the given instance and returns
   * the result. Dataset is set to null.
   *
   * @param inst the instance to be merged with this one
   * @return the merged instances
   */
  public Instance mergeInstance(Instance inst) {

    int [] indices = new int [numValues() + inst.numValues()];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int m = 0;
    for (int j = 0; j < numValues(); j++) {
      indices[m++] = index(j);
    }
    for (int j = 0; j < inst.numValues(); j++) {
      if (inst.valueSparse(j) != 0) {
        indices[m++] = numAttributes() + inst.index(j);
      }
    }

    if (m != indices.length) {
      // Need to truncate
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      int[] newInd = new int[m];
      System.arraycopy(indices, 0, newInd, 0, m);
      indices = newInd;
    }
    return new BinarySparseInstance(1.0, indices, numAttributes()
      + inst.numAttributes());
  }

  /**
   * Does nothing, since we don't support missing values.
   * 
   * @param array containing the means and modes
   */
  @Override
  public void replaceMissingValues(double[] array) {

<<<<<<< HEAD
=======
=======
      int [] newInd = new int [m];
      System.arraycopy(indices, 0, newInd, 0, m);
      indices = newInd;
    }
    return new BinarySparseInstance(1.0, indices, numAttributes() +
                                    inst.numAttributes());
  }

  /** 
   * Does nothing, since we don't support missing values.
   *
   * @param array containing the means and modes
   */
  public void replaceMissingValues(double[] array) {
	 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // Does nothing, since we don't store missing values.
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets a specific value in the instance to the given value (internal
   * floating-point format). Performs a deep copy of the vector of attribute
   * values before the value is set.
   * 
   * @param attIndex the attribute's index
   * @param value the new attribute value (If the corresponding attribute is
   *          nominal (or a string) then this is the new value's index as a
   *          double).
   */
  @Override
  public void setValue(int attIndex, double value) {

    int index = locateIndex(attIndex);

    if ((index >= 0) && (m_Indices[index] == attIndex)) {
      if (value == 0) {
        int[] tempIndices = new int[m_Indices.length - 1];
        System.arraycopy(m_Indices, 0, tempIndices, 0, index);
        System.arraycopy(m_Indices, index + 1, tempIndices, index,
          m_Indices.length - index - 1);
        m_Indices = tempIndices;
      }
    } else {
      if (value != 0) {
        int[] tempIndices = new int[m_Indices.length + 1];
        System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
        tempIndices[index + 1] = attIndex;
        System.arraycopy(m_Indices, index + 1, tempIndices, index + 2,
          m_Indices.length - index - 1);
        m_Indices = tempIndices;
<<<<<<< HEAD
=======
=======
   * Sets a specific value in the instance to the given value 
   * (internal floating-point format). Performs a deep copy
   * of the vector of attribute values before the value is set.
   *
   * @param attIndex the attribute's index 
   * @param value the new attribute value (If the corresponding
   * attribute is nominal (or a string) then this is the new value's
   * index as a double).  
   */
  public void setValue(int attIndex, double value) {

    int index = locateIndex(attIndex);
    
    if ((index >= 0) && (m_Indices[index] == attIndex)) {
      if (value == 0) {
	int[] tempIndices = new int[m_Indices.length - 1];
	System.arraycopy(m_Indices, 0, tempIndices, 0, index);
	System.arraycopy(m_Indices, index + 1, tempIndices, index, 
			 m_Indices.length - index - 1);
	m_Indices = tempIndices;
      }
    } else {
      if (value != 0) {
	int[] tempIndices = new int[m_Indices.length + 1];
	System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
	tempIndices[index + 1] = attIndex;
	System.arraycopy(m_Indices, index + 1, tempIndices, index + 2, 
			 m_Indices.length - index - 1);
	m_Indices = tempIndices;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets a specific value in the instance to the given value (internal
   * floating-point format). Performs a deep copy of the vector of attribute
   * values before the value is set.
   * 
   * @param indexOfIndex the index of the attribute's index
   * @param value the new attribute value (If the corresponding attribute is
   *          nominal (or a string) then this is the new value's index as a
   *          double).
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Sets a specific value in the instance to the given value 
   * (internal floating-point format). Performs a deep copy
   * of the vector of attribute values before the value is set.
   *
   * @param indexOfIndex the index of the attribute's index 
   * @param value the new attribute value (If the corresponding
   * attribute is nominal (or a string) then this is the new value's
   * index as a double).  
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setValueSparse(int indexOfIndex, double value) {

    if (value == 0) {
      int[] tempIndices = new int[m_Indices.length - 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, indexOfIndex);
<<<<<<< HEAD
      System.arraycopy(m_Indices, indexOfIndex + 1, tempIndices, indexOfIndex,
        m_Indices.length - indexOfIndex - 1);
=======
<<<<<<< HEAD
      System.arraycopy(m_Indices, indexOfIndex + 1, tempIndices, indexOfIndex,
        m_Indices.length - indexOfIndex - 1);
=======
      System.arraycopy(m_Indices, indexOfIndex + 1, tempIndices, indexOfIndex, 
		       m_Indices.length - indexOfIndex - 1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_Indices = tempIndices;
    }
  }

  /**
   * Returns the values of each attribute as an array of doubles.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array containing all the instance attribute values
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return an array containing all the instance attribute values
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public double[] toDoubleArray() {

    double[] newValues = new double[m_NumAttributes];
    for (int i = 0; i < m_Indices.length; i++) {
      newValues[m_Indices[i]] = 1.0;
    }
    return newValues;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the description of one instance in sparse format. If the instance
   * doesn't have access to a dataset, it returns the internal floating-point
   * values. Quotes string values that contain whitespace characters.
   * 
   * @return the instance's description as a string
   */
  @Override
  public String toString() {

    StringBuffer text = new StringBuffer();

<<<<<<< HEAD
=======
=======
   * Returns the description of one instance in sparse format. 
   * If the instance doesn't have access to a dataset, it returns the 
   * internal floating-point values. Quotes string values that contain 
   * whitespace characters.
   *
   * @return the instance's description as a string
   */
  public String toString() {

    StringBuffer text = new StringBuffer();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text.append('{');
    for (int i = 0; i < m_Indices.length; i++) {
      if (i > 0) {
        text.append(",");
      }
      if (m_Dataset == null) {
        text.append(m_Indices[i] + " 1");
      } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (m_Dataset.attribute(m_Indices[i]).isNominal()
          || m_Dataset.attribute(m_Indices[i]).isString()) {
          text.append(m_Indices[i] + " "
            + Utils.quote(m_Dataset.attribute(m_Indices[i]).value(1)));
<<<<<<< HEAD
=======
=======
        if (m_Dataset.attribute(m_Indices[i]).isNominal() || 
            m_Dataset.attribute(m_Indices[i]).isString()) {
          text.append(m_Indices[i] + " " +
                      Utils.quote(m_Dataset.attribute(m_Indices[i]).
                                  value(1)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        } else {
          text.append(m_Indices[i] + " 1");
        }
      }
    }
    text.append('}');
    if (m_Weight != 1.0) {
<<<<<<< HEAD
      text.append(",{"
        + Utils.doubleToString(m_Weight,
          AbstractInstance.s_numericAfterDecimalPoint) + "}");
=======
<<<<<<< HEAD
      text.append(",{"
        + Utils.doubleToString(m_Weight,
          AbstractInstance.s_numericAfterDecimalPoint) + "}");
=======
      text.append(",{" + Utils.doubleToString(m_Weight, 6) + "}");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return text.toString();
  }

  /**
   * Returns an instance's attribute value in internal format.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param attIndex the attribute's index
   * @return the specified value as a double (If the corresponding attribute is
   *         nominal (or a string) then it returns the value's index as a
   *         double).
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param attIndex the attribute's index
   * @return the specified value as a double (If the corresponding
   * attribute is nominal (or a string) then it returns the value's index as a 
   * double).
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public double value(int attIndex) {

    int index = locateIndex(attIndex);
    if ((index >= 0) && (m_Indices[index] == attIndex)) {
      return 1.0;
    } else {
      return 0.0;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns an instance's attribute value in internal format. Does exactly the
   * same thing as value() if applied to an Instance.
   * 
   * @param indexOfIndex the index of the attribute's index
   * @return the specified value as a double (If the corresponding attribute is
   *         nominal (or a string) then it returns the value's index as a
   *         double).
   */
  @Override
  public final double valueSparse(int indexOfIndex) {

    return 1;
  }

  /**
   * Deletes an attribute at the given position (0 to numAttributes() - 1).
   * 
   * @param position the attribute's position
   */
  @Override
  protected void forceDeleteAttributeAt(int position) {
<<<<<<< HEAD
=======
=======
  }  

  /**
   * Returns an instance's attribute value in internal format.
   * Does exactly the same thing as value() if applied to an Instance.
   *
   * @param indexOfIndex the index of the attribute's index
   * @return the specified value as a double (If the corresponding
   * attribute is nominal (or a string) then it returns the value's index as a 
   * double).
   */
  public final double valueSparse(int indexOfIndex) {

    int index = m_Indices[indexOfIndex]; // Throws if out of bounds
    return 1;
  }  

  /**
   * Deletes an attribute at the given position (0 to 
   * numAttributes() - 1).
   *
   * @param position the attribute's position
   */
  void forceDeleteAttributeAt(int position) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int index = locateIndex(position);

    m_NumAttributes--;
    if ((index >= 0) && (m_Indices[index] == position)) {
      int[] tempIndices = new int[m_Indices.length - 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index);
      for (int i = index; i < m_Indices.length - 1; i++) {
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i + 1] - 1;
=======
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i + 1] - 1;
=======
	tempIndices[i] = m_Indices[i + 1] - 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
    } else {
      int[] tempIndices = new int[m_Indices.length];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
      for (int i = index + 1; i < m_Indices.length - 1; i++) {
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i] - 1;
=======
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i] - 1;
=======
	tempIndices[i] = m_Indices[i] - 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Inserts an attribute at the given position (0 to numAttributes()) and sets
   * its value to 1.
   * 
   * @param position the attribute's position
   */
  @Override
  protected void forceInsertAttributeAt(int position) {
<<<<<<< HEAD
=======
=======
   * Inserts an attribute at the given position
   * (0 to numAttributes()) and sets its value to 1. 
   *
   * @param position the attribute's position
   */
  void forceInsertAttributeAt(int position)  {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int index = locateIndex(position);

    m_NumAttributes++;
    if ((index >= 0) && (m_Indices[index] == position)) {
      int[] tempIndices = new int[m_Indices.length + 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index);
      tempIndices[index] = position;
      for (int i = index; i < m_Indices.length; i++) {
<<<<<<< HEAD
        tempIndices[i + 1] = m_Indices[i] + 1;
=======
<<<<<<< HEAD
        tempIndices[i + 1] = m_Indices[i] + 1;
=======
	tempIndices[i + 1] = m_Indices[i] + 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
    } else {
      int[] tempIndices = new int[m_Indices.length + 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
      tempIndices[index + 1] = position;
      for (int i = index + 1; i < m_Indices.length; i++) {
<<<<<<< HEAD
        tempIndices[i + 1] = m_Indices[i] + 1;
=======
<<<<<<< HEAD
        tempIndices[i + 1] = m_Indices[i] + 1;
=======
	tempIndices[i + 1] = m_Indices[i] + 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
    }
  }

  /**
   * Main method for testing this class.
   * 
<<<<<<< HEAD
   * @param options the command line options - ignored
=======
<<<<<<< HEAD
   * @param options the command line options - ignored
=======
   * @param options	the command line options - ignored
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] options) {

    try {

      // Create numeric attributes "length" and "weight"
      Attribute length = new Attribute("length");
      Attribute weight = new Attribute("weight");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // Create vector to hold nominal values "first", "second", "third"
      ArrayList<String> my_nominal_values = new ArrayList<String>(3);
      my_nominal_values.add("first");
      my_nominal_values.add("second");

      // Create nominal attribute "position"
      Attribute position = new Attribute("position", my_nominal_values);

      // Create vector of the above attributes
      ArrayList<Attribute> attributes = new ArrayList<Attribute>(3);
      attributes.add(length);
      attributes.add(weight);
      attributes.add(position);

      // Create the empty dataset "race" with above attributes
      Instances race = new Instances("race", attributes, 0);

      // Make position the class attribute
      race.setClassIndex(position.index());

      // Create empty instance with three attribute values
      BinarySparseInstance inst = new BinarySparseInstance(3);

      // Set instance's values for the attributes "length", "weight", and
      // "position"
      inst.setValue(length, 5.3);
      inst.setValue(weight, 300);
      inst.setValue(position, "first");

      // Set instance's dataset to be the dataset "race"
      inst.setDataset(race);

      // Print the instance
      System.out.println("The instance: " + inst);

      // Print the first attribute
      System.out.println("First attribute: " + inst.attribute(0));

      // Print the class attribute
      System.out.println("Class attribute: " + inst.classAttribute());

      // Print the class index
      System.out.println("Class index: " + inst.classIndex());

      // Say if class is missing
      System.out.println("Class is missing: " + inst.classIsMissing());

      // Print the instance's class value in internal format
      System.out.println("Class value (internal format): " + inst.classValue());

      // Print a shallow copy of this instance
      SparseInstance copy = (SparseInstance) inst.copy();
      System.out.println("Shallow copy: " + copy);

<<<<<<< HEAD
=======
=======
      
      // Create vector to hold nominal values "first", "second", "third" 
      FastVector my_nominal_values = new FastVector(3); 
      my_nominal_values.addElement("first"); 
      my_nominal_values.addElement("second"); 
      
      // Create nominal attribute "position" 
      Attribute position = new Attribute("position", my_nominal_values);
      
      // Create vector of the above attributes 
      FastVector attributes = new FastVector(3);
      attributes.addElement(length);
      attributes.addElement(weight);
      attributes.addElement(position);
      
      // Create the empty dataset "race" with above attributes
      Instances race = new Instances("race", attributes, 0);
      
      // Make position the class attribute
      race.setClassIndex(position.index());
      
      // Create empty instance with three attribute values
      BinarySparseInstance inst = new BinarySparseInstance(3);
      
      // Set instance's values for the attributes "length", "weight", and "position"
      inst.setValue(length, 5.3);
      inst.setValue(weight, 300);
      inst.setValue(position, "first");
      
      // Set instance's dataset to be the dataset "race"
      inst.setDataset(race);
      
      // Print the instance
      System.out.println("The instance: " + inst);
      
      // Print the first attribute
      System.out.println("First attribute: " + inst.attribute(0));
      
      // Print the class attribute
      System.out.println("Class attribute: " + inst.classAttribute());
      
      // Print the class index
      System.out.println("Class index: " + inst.classIndex());
      
      // Say if class is missing
      System.out.println("Class is missing: " + inst.classIsMissing());
      
      // Print the instance's class value in internal format
      System.out.println("Class value (internal format): " + inst.classValue());
      
      // Print a shallow copy of this instance
      SparseInstance copy = (SparseInstance) inst.copy();
      System.out.println("Shallow copy: " + copy);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // Set dataset for shallow copy
      copy.setDataset(inst.dataset());
      System.out.println("Shallow copy with dataset set: " + copy);

      // Print out all values in internal format
      System.out.print("All stored values in internal format: ");
      for (int i = 0; i < inst.numValues(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (i > 0) {
          System.out.print(",");
        }
        System.out.print(inst.valueSparse(i));
<<<<<<< HEAD
=======
=======
	if (i > 0) {
	  System.out.print(",");
	}
	System.out.print(inst.valueSparse(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      System.out.println();

      // Set all values to zero
      System.out.print("All values set to zero: ");
      while (inst.numValues() > 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        inst.setValueSparse(0, 0);
      }
      for (int i = 0; i < inst.numValues(); i++) {
        if (i > 0) {
          System.out.print(",");
        }
        System.out.print(inst.valueSparse(i));
<<<<<<< HEAD
=======
=======
	inst.setValueSparse(0, 0);
      }
      for (int i = 0; i < inst.numValues(); i++) {
	if (i > 0) {
	  System.out.print(",");
	}
	System.out.print(inst.valueSparse(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      System.out.println();

      // Set all values to one
      System.out.print("All values set to one: ");
      for (int i = 0; i < inst.numAttributes(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        inst.setValue(i, 1);
      }
      for (int i = 0; i < inst.numValues(); i++) {
        if (i > 0) {
          System.out.print(",");
        }
        System.out.print(inst.valueSparse(i));
<<<<<<< HEAD
=======
=======
	inst.setValue(i, 1);
      }
      for (int i = 0; i < inst.numValues(); i++) {
	if (i > 0) {
	  System.out.print(",");
	}
	System.out.print(inst.valueSparse(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      System.out.println();

      // Unset dataset for copy, delete first attribute, and insert it again
      copy.setDataset(null);
      copy.deleteAttributeAt(0);
      copy.insertAttributeAt(0);
      copy.setDataset(inst.dataset());
<<<<<<< HEAD
      System.out.println("Copy with first attribute deleted and inserted: "
        + copy);
=======
<<<<<<< HEAD
      System.out.println("Copy with first attribute deleted and inserted: "
        + copy);
=======
      System.out.println("Copy with first attribute deleted and inserted: " + copy); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // Same for second attribute
      copy.setDataset(null);
      copy.deleteAttributeAt(1);
      copy.insertAttributeAt(1);
      copy.setDataset(inst.dataset());
<<<<<<< HEAD
      System.out.println("Copy with second attribute deleted and inserted: "
        + copy);
=======
<<<<<<< HEAD
      System.out.println("Copy with second attribute deleted and inserted: "
        + copy);
=======
      System.out.println("Copy with second attribute deleted and inserted: " + copy); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // Same for last attribute
      copy.setDataset(null);
      copy.deleteAttributeAt(2);
      copy.insertAttributeAt(2);
      copy.setDataset(inst.dataset());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.out.println("Copy with third attribute deleted and inserted: "
        + copy);

      // Enumerate attributes (leaving out the class attribute)
      System.out.println("Enumerating attributes (leaving out class):");
      Enumeration<Attribute> enu = inst.enumerateAttributes();
      while (enu.hasMoreElements()) {
        Attribute att = enu.nextElement();
        System.out.println(att);
      }

      // Headers are equivalent?
      System.out.println("Header of original and copy equivalent: "
        + inst.equalHeaders(copy));

      // Test for missing values
      System.out.println("Length of copy missing: " + copy.isMissing(length));
      System.out.println("Weight of copy missing: "
        + copy.isMissing(weight.index()));
      System.out.println("Length of copy missing: "
        + Utils.isMissingValue(copy.value(length)));
<<<<<<< HEAD
=======
=======
      System.out.println("Copy with third attribute deleted and inserted: " + copy); 
      
      // Enumerate attributes (leaving out the class attribute)
      System.out.println("Enumerating attributes (leaving out class):");
      Enumeration enu = inst.enumerateAttributes();
      while (enu.hasMoreElements()) {
	Attribute att = (Attribute) enu.nextElement();
	System.out.println(att);
      }
      
      // Headers are equivalent?
      System.out.println("Header of original and copy equivalent: " +
			 inst.equalHeaders(copy));

      // Test for missing values
      System.out.println("Length of copy missing: " + copy.isMissing(length));
      System.out.println("Weight of copy missing: " + copy.isMissing(weight.index()));
      System.out.println("Length of copy missing: " + 
			 Instance.isMissingValue(copy.value(length)));
      System.out.println("Missing value coded as: " + Instance.missingValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // Prints number of attributes and classes
      System.out.println("Number of attributes: " + copy.numAttributes());
      System.out.println("Number of classes: " + copy.numClasses());

      // Replace missing values
<<<<<<< HEAD
      double[] meansAndModes = { 2, 3, 0 };
=======
<<<<<<< HEAD
      double[] meansAndModes = { 2, 3, 0 };
=======
      double[] meansAndModes = {2, 3, 0};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      copy.replaceMissingValues(meansAndModes);
      System.out.println("Copy with missing value replaced: " + copy);

      // Setting and getting values and weights
      copy.setClassMissing();
      System.out.println("Copy with missing class: " + copy);
      copy.setClassValue(0);
      System.out.println("Copy with class value set to first value: " + copy);
      copy.setClassValue("second");
      System.out.println("Copy with class value set to \"second\": " + copy);
      copy.setMissing(1);
<<<<<<< HEAD
      System.out.println("Copy with second attribute set to be missing: "
        + copy);
=======
<<<<<<< HEAD
      System.out.println("Copy with second attribute set to be missing: "
        + copy);
=======
      System.out.println("Copy with second attribute set to be missing: " + copy);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      copy.setMissing(length);
      System.out.println("Copy with length set to be missing: " + copy);
      copy.setValue(0, 0);
      System.out.println("Copy with first attribute set to 0: " + copy);
      copy.setValue(weight, 1);
      System.out.println("Copy with weight attribute set to 1: " + copy);
      copy.setValue(position, "second");
      System.out.println("Copy with position set to \"second\": " + copy);
      copy.setValue(2, "first");
      System.out.println("Copy with last attribute set to \"first\": " + copy);
      System.out.println("Current weight of instance copy: " + copy.weight());
      copy.setWeight(2);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.out.println("Current weight of instance copy (set to 2): "
        + copy.weight());
      System.out.println("Last value of copy: " + copy.toString(2));
      System.out.println("Value of position for copy: "
        + copy.toString(position));
      System.out.println("Last value of copy (internal format): "
        + copy.value(2));
      System.out.println("Value of position for copy (internal format): "
        + copy.value(position));
<<<<<<< HEAD
=======
=======
      System.out.println("Current weight of instance copy (set to 2): " + copy.weight());
      System.out.println("Last value of copy: " + copy.toString(2));
      System.out.println("Value of position for copy: " + copy.toString(position));
      System.out.println("Last value of copy (internal format): " + copy.value(2));
      System.out.println("Value of position for copy (internal format): " + 
			 copy.value(position));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception e) {
      e.printStackTrace();
    }
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
    return RevisionUtils.extract("$Revision: 12472 $");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.13 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
