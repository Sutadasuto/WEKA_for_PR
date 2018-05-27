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
 *    SparseInstance.java
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

package weka.core;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Class for storing an instance as a sparse vector. A sparse instance only
 * requires storage for those attribute values that are non-zero. Since the
 * objective is to reduce storage requirements for datasets with large numbers
 * of default values, this also includes nominal attributes -- the first nominal
 * value (i.e. that which has index 0) will not require explicit storage, so
 * rearrange your nominal attribute value orderings if necessary. Missing values
 * will be stored explicitly.
 * 
 * @author Eibe Frank
 * @version $Revision: 14606 $
 */
public class SparseInstance extends AbstractInstance {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;

/**
 * Class for storing an instance as a sparse vector. A sparse instance
 * only requires storage for those attribute values that are non-zero.
 * Since the objective is to reduce storage requirements for datasets
 * with large numbers of default values, this also includes nominal
 * attributes -- the first nominal value (i.e. that which has index 0)
 * will not require explicit storage, so rearrange your nominal attribute
 * value orderings if necessary. Missing values will be stored
 * explicitly.
 *
 * @author Eibe Frank
 * @version $Revision: 5970 $
 */
public class SparseInstance
  extends Instance {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -3579051291332630149L;

  /** The index of the attribute associated with each stored value. */
  protected int[] m_Indices;

  /** The maximum number of values that can be stored. */
  protected int m_NumAttributes;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Constructor that generates a sparse instance from the given instance.
   * Reference to the dataset is set to null. (ie. the instance doesn't have
   * access to information about the attribute types)
   * 
   * @param instance the instance from which the attribute values and the weight
   *          are to be copied
   */
  public SparseInstance(Instance instance) {

    m_Weight = instance.weight();
    m_Dataset = null;
    m_NumAttributes = instance.numAttributes();
    if (instance instanceof SparseInstance) {
      m_AttValues = ((SparseInstance) instance).m_AttValues;
      m_Indices = ((SparseInstance) instance).m_Indices;
<<<<<<< HEAD
=======
=======
  protected SparseInstance() {

  }

  /**
   * Constructor that generates a sparse instance from the given
   * instance. Reference to the dataset is set to null.
   * (ie. the instance doesn't have access to information about the
   * attribute types)
   *
   * @param instance the instance from which the attribute values
   * and the weight are to be copied
   */
  public SparseInstance(Instance instance) {
    
    m_Weight = instance.m_Weight;
    m_Dataset = null;
    m_NumAttributes = instance.numAttributes();
    if (instance instanceof SparseInstance) {
      m_AttValues = ((SparseInstance)instance).m_AttValues;
      m_Indices = ((SparseInstance)instance).m_Indices;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      double[] tempValues = new double[instance.numAttributes()];
      int[] tempIndices = new int[instance.numAttributes()];
      int vals = 0;
      for (int i = 0; i < instance.numAttributes(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (instance.value(i) != 0) {
          tempValues[vals] = instance.value(i);
          tempIndices[vals] = i;
          vals++;
        }
<<<<<<< HEAD
=======
=======
	if (instance.value(i) != 0) {
	  tempValues[vals] = instance.value(i);
	  tempIndices[vals] = i;
	  vals++;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_AttValues = new double[vals];
      m_Indices = new int[vals];
      System.arraycopy(tempValues, 0, m_AttValues, 0, vals);
      System.arraycopy(tempIndices, 0, m_Indices, 0, vals);
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructor that copies the info from the given instance. Reference to the
   * dataset is set to null. (ie. the instance doesn't have access to
   * information about the attribute types)
   * 
   * @param instance the instance from which the attribute info is to be copied
   */
  public SparseInstance(SparseInstance instance) {

<<<<<<< HEAD
=======
=======
   * Constructor that copies the info from the given instance. 
   * Reference to the dataset is set to null.
   * (ie. the instance doesn't have access to information about the
   * attribute types)
   *
   * @param instance the instance from which the attribute
   * info is to be copied 
   */
  public SparseInstance(SparseInstance instance) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_AttValues = instance.m_AttValues;
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
  public SparseInstance(double weight, double[] attValues) {

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
  public SparseInstance(double weight, double[] attValues) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Weight = weight;
    m_Dataset = null;
    m_NumAttributes = attValues.length;
    double[] tempValues = new double[m_NumAttributes];
    int[] tempIndices = new int[m_NumAttributes];
    int vals = 0;
    for (int i = 0; i < m_NumAttributes; i++) {
      if (attValues[i] != 0) {
<<<<<<< HEAD
        tempValues[vals] = attValues[i];
        tempIndices[vals] = i;
        vals++;
=======
<<<<<<< HEAD
        tempValues[vals] = attValues[i];
        tempIndices[vals] = i;
        vals++;
=======
	tempValues[vals] = attValues[i];
	tempIndices[vals] = i;
	vals++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_AttValues = new double[vals];
    m_Indices = new int[vals];
    System.arraycopy(tempValues, 0, m_AttValues, 0, vals);
    System.arraycopy(tempIndices, 0, m_Indices, 0, vals);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Constructor that initializes instance variable with given values.
   * Reference to the dataset is set to null. (ie. the instance doesn't have
   * access to information about the attribute types) Note that the indices need
   * to be sorted in ascending order. Otherwise things won't work properly.
   * 
   * @param weight the instance's weight
   * @param attValues a vector of attribute values (just the ones to be stored)
   * @param indices the indices of the given values in the full vector (need to
   *          be sorted in ascending order)
   * @param maxNumValues the maximum number of values that can be stored
   */
  public SparseInstance(double weight, double[] attValues, int[] indices,
    int maxNumValues) {

    int vals = 0;
    m_AttValues = new double[attValues.length];
    m_Indices = new int[indices.length];
<<<<<<< HEAD
=======
=======
  
  /**
   * Constructor that inititalizes instance variable with given
   * values. Reference to the dataset is set to null. (ie. the instance
   * doesn't have access to information about the attribute types)
   * Note that the indices need to be sorted in ascending order. Otherwise
   * things won't work properly.
   *
   * @param weight the instance's weight
   * @param attValues a vector of attribute values (just the ones to be stored)
   * @param indices the indices of the given values in the full vector (need to
   * be sorted in ascending order)
   * @param maxNumValues the maximium number of values that can be stored
   */
  public SparseInstance(double weight, double[] attValues,
			int[] indices, int maxNumValues){
    
    int vals = 0; 
    m_AttValues = new double [attValues.length];
    m_Indices = new int [indices.length];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < attValues.length; i++) {
      if (attValues[i] != 0) {
        m_AttValues[vals] = attValues[i];
        m_Indices[vals] = indices[i];
        vals++;
      }
    }
    if (vals != attValues.length) {
      // Need to truncate.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      double[] newVals = new double[vals];
      System.arraycopy(m_AttValues, 0, newVals, 0, vals);
      m_AttValues = newVals;
      int[] newIndices = new int[vals];
<<<<<<< HEAD
=======
=======
      double [] newVals = new double[vals];
      System.arraycopy(m_AttValues, 0, newVals, 0, vals);
      m_AttValues = newVals;
      int [] newIndices = new int[vals];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.arraycopy(m_Indices, 0, newIndices, 0, vals);
      m_Indices = newIndices;
    }
    m_Weight = weight;
    m_NumAttributes = maxNumValues;
    m_Dataset = null;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructor of an instance that sets weight to one, all values to be
   * missing, and the reference to the dataset to null. (ie. the instance
   * doesn't have access to information about the attribute types)
   * 
   * @param numAttributes the size of the instance
   */
  public SparseInstance(int numAttributes) {

<<<<<<< HEAD
=======
=======
   * Constructor of an instance that sets weight to one, all values to
   * be missing, and the reference to the dataset to null. (ie. the instance
   * doesn't have access to information about the attribute types)
   *
   * @param numAttributes the size of the instance 
   */
  public SparseInstance(int numAttributes) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_AttValues = new double[numAttributes];
    m_NumAttributes = numAttributes;
    m_Indices = new int[numAttributes];
    for (int i = 0; i < m_AttValues.length; i++) {
<<<<<<< HEAD
      m_AttValues[i] = Utils.missingValue();
=======
<<<<<<< HEAD
      m_AttValues[i] = Utils.missingValue();
=======
      m_AttValues[i] = MISSING_VALUE;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
   * dataset, use <code>new SparseInstance(instance)</code>
   * 
   * @return the shallow copy
   */
  @Override
  public Object copy() {

    SparseInstance result = new SparseInstance(this);
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

    SparseInstance result = new SparseInstance(this.m_Weight, values);
<<<<<<< HEAD
=======
=======
   * Returns the attribute associated with the internal index. 
   *
   * @param indexOfIndex the index of the attribute's index 
   * @return the attribute at the given position
   * @exception UnassignedDatasetException if instance doesn't have access to a
   * dataset
   */ 
  public Attribute attributeSparse(int indexOfIndex) {
   
    if (m_Dataset == null) {
      throw new UnassignedDatasetException("Instance doesn't have access to a dataset!");
    }
    return m_Dataset.attribute(m_Indices[indexOfIndex]);
  }

  /**
   * Produces a shallow copy of this instance. The copy has
   * access to the same dataset. (if you want to make a copy
   * that doesn't have access to the dataset, use 
   * <code>new SparseInstance(instance)</code>
   *
   * @return the shallow copy
   */
  public Object copy() {

    Instance result = new SparseInstance(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    result.m_Dataset = m_Dataset;
    return result;
  }

  /**
   * Returns the index of the attribute stored at the given position.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param position the position
   * @return the index of the attribute stored at the given position
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param position the position 
   * @return the index of the attribute stored at the given position
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int index(int position) {

    return m_Indices[position];
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Locates the greatest index that is not greater than the given index.
   * 
   * @return the internal index of the attribute index. Returns -1 if no index
   *         with this property could be found
<<<<<<< HEAD
=======
=======
   * Tests if a specific value is "missing".
   *
   * @param attIndex the attribute's index
   */
  public boolean isMissing(int attIndex) {

    if (Double.isNaN(value(attIndex))) {
      return true;
    }
    return false;
  }

  /**
   * Locates the greatest index that is not greater than the
   * given index.
   *
   * @return the internal index of the attribute index. Returns
   * -1 if no index with this property could be found
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public int locateIndex(int index) {

    int min = 0, max = m_Indices.length - 1;

    if (max == -1) {
      return -1;
    }

    // Binary search
    while ((m_Indices[min] <= index) && (m_Indices[max] >= index)) {
      int current = (max + min) / 2;
      if (m_Indices[current] > index) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        max = current - 1;
      } else if (m_Indices[current] < index) {
        min = current + 1;
      } else {
        return current;
<<<<<<< HEAD
=======
=======
	max = current - 1;
      } else if (m_Indices[current] < index) {
	min = current + 1;
      } else {
	return current;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (m_Indices[max] < index) {
      return max;
    } else {
      return min - 1;
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Merges this instance with the given instance and returns the result.
   * Dataset is set to null.
   * 
   * @param inst the instance to be merged with this one
   * @return the merged instances
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Merges this instance with the given instance and returns
   * the result. Dataset is set to null.
   *
   * @param inst the instance to be merged with this one
   * @return the merged instances
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Instance mergeInstance(Instance inst) {

    double[] values = new double[numValues() + inst.numValues()];
    int[] indices = new int[numValues() + inst.numValues()];

    int m = 0;
    for (int j = 0; j < numValues(); j++, m++) {
      values[m] = valueSparse(j);
      indices[m] = index(j);
    }
    for (int j = 0; j < inst.numValues(); j++, m++) {
      values[m] = inst.valueSparse(j);
      indices[m] = numAttributes() + inst.index(j);
    }
<<<<<<< HEAD

    return new SparseInstance(1.0, values, indices, numAttributes()
      + inst.numAttributes());
=======
<<<<<<< HEAD

    return new SparseInstance(1.0, values, indices, numAttributes()
      + inst.numAttributes());
=======
    
    return new SparseInstance(1.0, values, indices, numAttributes() +
			      inst.numAttributes());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the number of attributes.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of attributes as an integer
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the number of attributes as an integer
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int numAttributes() {

    return m_NumAttributes;
  }

  /**
   * Returns the number of values in the sparse vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of values
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the number of values
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int numValues() {

    return m_Indices.length;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Replaces all missing values in the instance with the values contained in
   * the given array. A deep copy of the vector of attribute values is performed
   * before the values are replaced.
   * 
   * @param array containing the means and modes
   * @exception IllegalArgumentException if numbers of attributes are unequal
   */
  @Override
  public void replaceMissingValues(double[] array) {

<<<<<<< HEAD
=======
=======
  /** 
   * Replaces all missing values in the instance with the 
   * values contained in the given array. A deep copy of
   * the vector of attribute values is performed before the
   * values are replaced.
   *
   * @param array containing the means and modes
   * @exception IllegalArgumentException if numbers of attributes are unequal
   */
  public void replaceMissingValues(double[] array) {
	 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if ((array == null) || (array.length != m_NumAttributes)) {
      throw new IllegalArgumentException("Unequal number of attributes!");
    }
    double[] tempValues = new double[m_AttValues.length];
    int[] tempIndices = new int[m_AttValues.length];
    int vals = 0;
    for (int i = 0; i < m_AttValues.length; i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (isMissingSparse(i)) {
        if (array[m_Indices[i]] != 0) {
          tempValues[vals] = array[m_Indices[i]];
          tempIndices[vals] = m_Indices[i];
          vals++;
        }
      } else {
        tempValues[vals] = m_AttValues[i];
        tempIndices[vals] = m_Indices[i];
        vals++;
<<<<<<< HEAD
=======
=======
      if (isMissingValue(m_AttValues[i])) {
	if (array[m_Indices[i]] != 0) {
	  tempValues[vals] = array[m_Indices[i]];
	  tempIndices[vals] = m_Indices[i];
	  vals++;
	} 
      } else {
	tempValues[vals] = m_AttValues[i];
	tempIndices[vals] = m_Indices[i];
	vals++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_AttValues = new double[vals];
    m_Indices = new int[vals];
    System.arraycopy(tempValues, 0, m_AttValues, 0, vals);
    System.arraycopy(tempIndices, 0, m_Indices, 0, vals);
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
      if (value != 0) {
        double[] tempValues = new double[m_AttValues.length];
        System.arraycopy(m_AttValues, 0, tempValues, 0, m_AttValues.length);
        tempValues[index] = value;
        m_AttValues = tempValues;
      } else {
        double[] tempValues = new double[m_AttValues.length - 1];
        int[] tempIndices = new int[m_Indices.length - 1];
        System.arraycopy(m_AttValues, 0, tempValues, 0, index);
        System.arraycopy(m_Indices, 0, tempIndices, 0, index);
        System.arraycopy(m_AttValues, index + 1, tempValues, index,
          m_AttValues.length - index - 1);
        System.arraycopy(m_Indices, index + 1, tempIndices, index,
          m_Indices.length - index - 1);
        m_AttValues = tempValues;
        m_Indices = tempIndices;
      }
    } else {
      if (value != 0) {
        double[] tempValues = new double[m_AttValues.length + 1];
        int[] tempIndices = new int[m_Indices.length + 1];
        System.arraycopy(m_AttValues, 0, tempValues, 0, index + 1);
        System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
        tempIndices[index + 1] = attIndex;
        tempValues[index + 1] = value;
        System.arraycopy(m_AttValues, index + 1, tempValues, index + 2,
          m_AttValues.length - index - 1);
        System.arraycopy(m_Indices, index + 1, tempIndices, index + 2,
          m_Indices.length - index - 1);
        m_AttValues = tempValues;
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
      if (value != 0) {
	double[] tempValues = new double[m_AttValues.length];
	System.arraycopy(m_AttValues, 0, tempValues, 0, m_AttValues.length);
	tempValues[index] = value;
	m_AttValues = tempValues;
      } else {
	double[] tempValues = new double[m_AttValues.length - 1];
	int[] tempIndices = new int[m_Indices.length - 1];
	System.arraycopy(m_AttValues, 0, tempValues, 0, index);
	System.arraycopy(m_Indices, 0, tempIndices, 0, index);
	System.arraycopy(m_AttValues, index + 1, tempValues, index, 
			 m_AttValues.length - index - 1);
	System.arraycopy(m_Indices, index + 1, tempIndices, index, 
			 m_Indices.length - index - 1);
	m_AttValues = tempValues;
	m_Indices = tempIndices;
      }
    } else {
      if (value != 0) {
	double[] tempValues = new double[m_AttValues.length + 1];
	int[] tempIndices = new int[m_Indices.length + 1];
	System.arraycopy(m_AttValues, 0, tempValues, 0, index + 1);
	System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
	tempIndices[index + 1] = attIndex;
	tempValues[index + 1] = value;
	System.arraycopy(m_AttValues, index + 1, tempValues, index + 2, 
			 m_AttValues.length - index - 1);
	System.arraycopy(m_Indices, index + 1, tempIndices, index + 2, 
			 m_Indices.length - index - 1);
	m_AttValues = tempValues;
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

    if (value != 0) {
      double[] tempValues = new double[m_AttValues.length];
      System.arraycopy(m_AttValues, 0, tempValues, 0, m_AttValues.length);
      m_AttValues = tempValues;
      m_AttValues[indexOfIndex] = value;
    } else {
      double[] tempValues = new double[m_AttValues.length - 1];
      int[] tempIndices = new int[m_Indices.length - 1];
      System.arraycopy(m_AttValues, 0, tempValues, 0, indexOfIndex);
      System.arraycopy(m_Indices, 0, tempIndices, 0, indexOfIndex);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.arraycopy(m_AttValues, indexOfIndex + 1, tempValues, indexOfIndex,
        m_AttValues.length - indexOfIndex - 1);
      System.arraycopy(m_Indices, indexOfIndex + 1, tempIndices, indexOfIndex,
        m_Indices.length - indexOfIndex - 1);
<<<<<<< HEAD
=======
=======
      System.arraycopy(m_AttValues, indexOfIndex + 1, tempValues, indexOfIndex, 
		       m_AttValues.length - indexOfIndex - 1);
      System.arraycopy(m_Indices, indexOfIndex + 1, tempIndices, indexOfIndex, 
		       m_Indices.length - indexOfIndex - 1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_AttValues = tempValues;
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
    for (int i = 0; i < m_AttValues.length; i++) {
      newValues[m_Indices[i]] = m_AttValues[i];
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
  public String toStringNoWeight() {
    return toStringNoWeight(AbstractInstance.s_numericAfterDecimalPoint);
  }

  /**
   * Returns the description of one instance in sparse format. If the instance
   * doesn't have access to a dataset, it returns the internal floating-point
   * values. Quotes string values that contain whitespace characters.
   * 
   * @param afterDecimalPoint maximum number of digits permitted after the
   *          decimal point for numeric values
   * 
   * @return the instance's description as a string
   */
  @Override
  public String toStringNoWeight(int afterDecimalPoint) {

    StringBuilder text = new StringBuilder();

    text.append('{');
    String prefix = "";
    int sparseIndex = 0;
    for (int i = 0; i < m_NumAttributes; i++) {

      // Have we already output some values?
      if (text.length() > 1) {
        prefix = ",";
      }

      double value = 0;

      try {

        // Get the actual attribute value
        if (sparseIndex < m_Indices.length && m_Indices[sparseIndex] == i) {
          value = m_AttValues[sparseIndex++];
          if (Utils.isMissingValue(value)) {
            text.append(prefix).append(i).append(" ?");
            continue;
          }
        }

        // Have to treat all attributes as numeric if we don't have access to a dataset
        if (m_Dataset == null) {
          if (value != 0) {
            text.append(prefix).append(i).append(" ").append(Utils.doubleToString(value, afterDecimalPoint));
          }
        } else {
          Attribute att = m_Dataset.attribute(i);
          if (att.isString()) { // Output string value regardless
            text.append(prefix).append(i).append(" ").append(Utils.quote(att.value((int) value)));
          } else if (att.isRelationValued()) { // Output relational value regardless
            text.append(prefix).append(i).append(" ").append(Utils.quote(att.relation((int) value).stringWithoutHeader()));
          } else if (value != 0) { // Only output other attribute types if value != 0
            if (att.isNominal()) {
              text.append(prefix).append(i).append(" ").append(Utils.quote(att.value((int) value)));
            } else if (att.isDate()) {
              text.append(prefix).append(i).append(" ").append(Utils.quote(att.formatDate(value)));
            } else {
              text.append(prefix).append(i).append(" ").append(Utils.doubleToString(value, afterDecimalPoint));
            }
          }
        }

      } catch (Exception e) {
        e.printStackTrace();
        System.err.println(new Instances(m_Dataset, 0) + "\n" + "Att: " + i + " Val: " + value);
        throw new Error("This should never happen!");
      }
    }


    text.append('}');
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
    
    text.append('{');
    for (int i = 0; i < m_Indices.length; i++) {
      if (i > 0) text.append(",");
      if (isMissingValue(m_AttValues[i])) {
	text.append(m_Indices[i] + " ?");
      } else {
	if (m_Dataset == null) {
	  text.append(m_Indices[i] + " " + 
		      Utils.doubleToString(m_AttValues[i],6));
	} else {
	  if (m_Dataset.attribute(m_Indices[i]).isNominal() || 
	      m_Dataset.attribute(m_Indices[i]).isString() ||
	      m_Dataset.attribute(m_Indices[i]).isDate()) {
	    try {
	      text.append(m_Indices[i] + " " +
		  Utils.quote(stringValue(m_Indices[i])));
	    } catch (Exception e) {
              e.printStackTrace();
              System.err.println(new Instances(m_Dataset, 0));
              System.err.println("Att:" + m_Indices[i] + " Val:" + valueSparse(i));
	      throw new Error("This should never happen!");
	    }
	  } else if (m_Dataset.attribute(m_Indices[i]).isRelationValued()) {
	    try {
	      text.append(m_Indices[i] + " " +
			  Utils.quote(m_Dataset.attribute(m_Indices[i]).
				      relation((int)valueSparse(i)).
                                      stringWithoutHeader()));
            } catch (Exception e) {
              e.printStackTrace();
              System.err.println(new Instances(m_Dataset, 0));
              System.err.println("Att:" + m_Indices[i] + " Val:" + valueSparse(i));
	      throw new Error("This should never happen!");
	    }
	  } else {
	    text.append(m_Indices[i] + " " +
			Utils.doubleToString(m_AttValues[i],6));
	  }
	}
      }
    }
    text.append('}');
    if (m_Weight != 1.0) {
      text.append(",{" + Utils.doubleToString(m_Weight, 6) + "}");
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

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
      return m_AttValues[index];
    } else {
      return 0.0;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
   * Deletes an attribute at the given position (0 to 
   * numAttributes() - 1).
   *
   * @param pos the attribute's position
   */
  void forceDeleteAttributeAt(int position) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int index = locateIndex(position);

    m_NumAttributes--;
    if ((index >= 0) && (m_Indices[index] == position)) {
      int[] tempIndices = new int[m_Indices.length - 1];
      double[] tempValues = new double[m_AttValues.length - 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index);
      System.arraycopy(m_AttValues, 0, tempValues, 0, index);
      for (int i = index; i < m_Indices.length - 1; i++) {
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i + 1] - 1;
        tempValues[i] = m_AttValues[i + 1];
=======
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i + 1] - 1;
        tempValues[i] = m_AttValues[i + 1];
=======
	tempIndices[i] = m_Indices[i + 1] - 1;
	tempValues[i] = m_AttValues[i + 1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
      m_AttValues = tempValues;
    } else {
      int[] tempIndices = new int[m_Indices.length];
      double[] tempValues = new double[m_AttValues.length];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
      System.arraycopy(m_AttValues, 0, tempValues, 0, index + 1);
      for (int i = index + 1; i < m_Indices.length; i++) {
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i] - 1;
        tempValues[i] = m_AttValues[i];
=======
<<<<<<< HEAD
        tempIndices[i] = m_Indices[i] - 1;
        tempValues[i] = m_AttValues[i];
=======
	tempIndices[i] = m_Indices[i] - 1;
	tempValues[i] = m_AttValues[i];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
      m_AttValues = tempValues;
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Inserts an attribute at the given position (0 to numAttributes()) and sets
   * its value to be missing.
   * 
   * @param position the attribute's position
   */
  @Override
  protected void forceInsertAttributeAt(int position) {
<<<<<<< HEAD
=======
=======
   * Inserts an attribute at the given position
   * (0 to numAttributes()) and sets its value to be missing. 
   *
   * @param pos the attribute's position
   */
  void forceInsertAttributeAt(int position)  {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int index = locateIndex(position);

    m_NumAttributes++;
    if ((index >= 0) && (m_Indices[index] == position)) {
      int[] tempIndices = new int[m_Indices.length + 1];
      double[] tempValues = new double[m_AttValues.length + 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index);
      System.arraycopy(m_AttValues, 0, tempValues, 0, index);
      tempIndices[index] = position;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      tempValues[index] = Utils.missingValue();
      for (int i = index; i < m_Indices.length; i++) {
        tempIndices[i + 1] = m_Indices[i] + 1;
        tempValues[i + 1] = m_AttValues[i];
<<<<<<< HEAD
=======
=======
      tempValues[index] = MISSING_VALUE;
      for (int i = index; i < m_Indices.length; i++) {
	tempIndices[i + 1] = m_Indices[i] + 1;
	tempValues[i + 1] = m_AttValues[i];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
      m_AttValues = tempValues;
    } else {
      int[] tempIndices = new int[m_Indices.length + 1];
      double[] tempValues = new double[m_AttValues.length + 1];
      System.arraycopy(m_Indices, 0, tempIndices, 0, index + 1);
      System.arraycopy(m_AttValues, 0, tempValues, 0, index + 1);
      tempIndices[index + 1] = position;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      tempValues[index + 1] = Utils.missingValue();
      for (int i = index + 1; i < m_Indices.length; i++) {
        tempIndices[i + 1] = m_Indices[i] + 1;
        tempValues[i + 1] = m_AttValues[i];
<<<<<<< HEAD
=======
=======
      tempValues[index + 1] = MISSING_VALUE;
      for (int i = index + 1; i < m_Indices.length; i++) {
	tempIndices[i + 1] = m_Indices[i] + 1;
	tempValues[i + 1] = m_AttValues[i];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_Indices = tempIndices;
      m_AttValues = tempValues;
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructor for sub classes.
   */
  protected SparseInstance() {
  };

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Main method for testing this class.
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
      my_nominal_values.add("third");

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
      SparseInstance inst = new SparseInstance(3);

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
      my_nominal_values.addElement("third"); 
      
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
      SparseInstance inst = new SparseInstance(3);
      
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
      copy.setClassValue("third");
      System.out.println("Copy with class value set to \"third\": " + copy);
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
    return RevisionUtils.extract("$Revision: 14606 $");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5970 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
