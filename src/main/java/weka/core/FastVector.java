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
 *    FastVector.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
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
import java.util.Collection;
import java.util.Enumeration;

/**
 * Simple extension of ArrayList. Exists for legacy reasons.
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 10203 $
 */
@Deprecated
public class FastVector<E> extends ArrayList<E> implements Copyable,
  RevisionHandler {
<<<<<<< HEAD
=======
=======
import java.io.Serializable;
import java.util.Enumeration;

/**
 * Implements a fast vector class without synchronized
 * methods. Replaces java.util.Vector. (Synchronized methods tend to
 * be slow.)
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 1.16 $
 */
public class FastVector
  implements Copyable, Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -2173635135622930169L;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Constructs an empty vector with initial capacity zero.
   */
  public FastVector() {
    super();
<<<<<<< HEAD
=======
=======
   * Class for enumerating the vector's elements.
   */
  public class FastVectorEnumeration
    implements Enumeration, RevisionHandler {

    /** The counter. */
    private int m_Counter;
    // These JML commands say how m_Counter implements Enumeration
    //@ in moreElements;
    //@ private represents moreElements = m_Counter < m_Vector.size();
    //@ private invariant 0 <= m_Counter && m_Counter <= m_Vector.size();

    /** The vector. */
    private /*@non_null@*/ FastVector m_Vector;

    /** Special element. Skipped during enumeration. */
    private int m_SpecialElement;
    //@ private invariant -1 <= m_SpecialElement;
    //@ private invariant m_SpecialElement < m_Vector.size();
    //@ private invariant m_SpecialElement>=0 ==> m_Counter!=m_SpecialElement;

    /**
     * Constructs an enumeration.
     *
     * @param vector the vector which is to be enumerated
     */
    public FastVectorEnumeration(/*@non_null@*/FastVector vector) {

      m_Counter = 0;
      m_Vector = vector;
      m_SpecialElement = -1;
    }

    /**
     * Constructs an enumeration with a special element.
     * The special element is skipped during the enumeration.
     *
     * @param vector the vector which is to be enumerated
     * @param special the index of the special element
     */
    //@ requires 0 <= special && special < vector.size();
    public FastVectorEnumeration(/*@non_null@*/FastVector vector, int special){

      m_Vector = vector;
      m_SpecialElement = special;
      if (special == 0) {
	m_Counter = 1;
      } else {
	m_Counter = 0;
      }
    }


    /**
     * Tests if there are any more elements to enumerate.
     *
     * @return true if there are some elements left
     */
    public final /*@pure@*/ boolean hasMoreElements() {

      if (m_Counter < m_Vector.size()) {
	return true;
      }
      return false;
    }

    /**
     * Returns the next element.
     *
     * @return the next element to be enumerated
     */
    //@ also requires hasMoreElements();
    public final Object nextElement() {
  
      Object result = m_Vector.elementAt(m_Counter);

      m_Counter++;
      if (m_Counter == m_SpecialElement) {
	m_Counter++;
      }
      return result;
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 1.16 $");
    }
  }

  /** The array of objects. */
  private /*@spec_public@*/ Object[] m_Objects;
  //@ invariant m_Objects != null;
  //@ invariant m_Objects.length >= 0;

  /** The current size; */
  private /*@spec_public@*/ int m_Size = 0;
  //@ invariant 0 <= m_Size;
  //@ invariant m_Size <= m_Objects.length;

  /** The capacity increment */
  private /*@spec_public@*/ int m_CapacityIncrement = 1;
  //@ invariant 1 <= m_CapacityIncrement;
  
  /** The capacity multiplier. */
  private /*@spec_public@*/ int m_CapacityMultiplier = 2;
  //@ invariant 1 <= m_CapacityMultiplier;

  // Make sure the size will increase...
  //@ invariant 3 <= m_CapacityMultiplier + m_CapacityIncrement;

  /**
   * Constructs an empty vector with initial
   * capacity zero.
   */
  public FastVector() {
  
    m_Objects = new Object[0];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Constructs a vector with the given capacity.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param capacity the vector's initial capacity
   */
  public FastVector(int capacity) {
    super(capacity);
  }

  /**
   * Adds an element to this vector. Increases its capacity if its not large
   * enough.
   * 
   * @param element the element to add
   */
  public final void addElement(E element) {
    add(element);
<<<<<<< HEAD
=======
=======
   *
   * @param capacity the vector's initial capacity
   */
  //@ requires capacity >= 0;
  public FastVector(int capacity) {

    m_Objects = new Object[capacity];
  }

  /**
   * Adds an element to this vector. Increases its
   * capacity if its not large enough.
   *
   * @param element the element to add
   */
  public final void addElement(Object element) {

    Object[] newObjects;

    if (m_Size == m_Objects.length) {
      newObjects = new Object[m_CapacityMultiplier *
			     (m_Objects.length +
			      m_CapacityIncrement)];
      System.arraycopy(m_Objects, 0, newObjects, 0, m_Size);
      m_Objects = newObjects;
    }
    m_Objects[m_Size] = element;
    m_Size++;
  }

  /**
   * Returns the capacity of the vector.
   *
   * @return the capacity of the vector
   */
  //@ ensures \result == m_Objects.length;
  public final /*@pure@*/ int capacity() {
  
    return m_Objects.length;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Produces a shallow copy of this vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the new vector
   */
  @Override
  public final FastVector<E> copy() {
    return Utils.cast(clone());
  }

  /**
   * Clones the vector and shallow copies all its elements. The elements have to
   * implement the Copyable interface.
   * 
   * @return the new vector
   */
  public final FastVector<E> copyElements() {

    FastVector<E> copy = copy();
    for (int i = 0; i < size(); i++) {
      copy.set(i, Utils.<E> cast(((Copyable) get(i)).copy()));
<<<<<<< HEAD
=======
=======
   *
   * @return the new vector
   */
  public final Object copy() {

    FastVector copy = new FastVector(m_Objects.length);

    copy.m_Size = m_Size;
    copy.m_CapacityIncrement = m_CapacityIncrement;
    copy.m_CapacityMultiplier = m_CapacityMultiplier;
    System.arraycopy(m_Objects, 0, copy.m_Objects, 0, m_Size);
    return copy;
  }

  /**
   * Clones the vector and shallow copies all its elements.
   * The elements have to implement the Copyable interface.
   * 
   * @return the new vector
   */
  public final Object copyElements() {

    FastVector copy = new FastVector(m_Objects.length);

    copy.m_Size = m_Size;
    copy.m_CapacityIncrement = m_CapacityIncrement;
    copy.m_CapacityMultiplier = m_CapacityMultiplier;
    for (int i = 0; i < m_Size; i++) {
      copy.m_Objects[i] = ((Copyable)m_Objects[i]).copy();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return copy;
  }

  /**
   * Returns the element at the given position.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param index the element's index
   * @return the element with the given index
   */
  public final E elementAt(int index) {
    return get(index);
<<<<<<< HEAD
=======
=======
   *
   * @param index the element's index
   * @return the element with the given index
   */
  //@ requires 0 <= index;
  //@ requires index < m_Objects.length;
  public final /*@pure@*/ Object elementAt(int index) {

    return m_Objects[index];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns an enumeration of this vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of this vector
   */
  public final Enumeration<E> elements() {
    return new WekaEnumeration<E>(this);
  }

  /**
   * Returns an enumeration of this vector, skipping the element with the given
   * index.
   * 
   * @param index the element to skip
   * @return an enumeration of this vector
   */
  public final Enumeration<E> elements(int index) {
    return new WekaEnumeration<E>(this, index);
  }

  /**
   * Returns the first element of the vector.
   * 
   * @return the first element of the vector
   */
  public final E firstElement() {
    return get(0);
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of this vector
   */
  public final /*@pure@*/ Enumeration elements() {
  
    return new FastVectorEnumeration(this);
  }

  /**
   * Returns an enumeration of this vector, skipping the
   * element with the given index.
   *
   * @param index the element to skip
   * @return an enumeration of this vector
   */
  //@ requires 0 <= index && index < size();
  public final /*@pure@*/ Enumeration elements(int index) {
  
    return new FastVectorEnumeration(this, index);
  }

    /**
     * added by akibriya
     */
  public /*@pure@*/ boolean contains(Object o) {
      if(o==null)
	  return false;

      for(int i=0; i<m_Objects.length; i++) 
	  if(o.equals(m_Objects[i]))
	      return true;
      
      return false;
  }


  /**
   * Returns the first element of the vector.
   *
   * @return the first element of the vector
   */
  //@ requires m_Size > 0;
  public final /*@pure@*/ Object firstElement() {

    return m_Objects[0];
  }

  /**
   * Searches for the first occurence of the given argument, 
   * testing for equality using the equals method. 
   *
   * @param element the element to be found
   * @return the index of the first occurrence of the argument 
   * in this vector; returns -1 if the object is not found
   */
  public final /*@pure@*/ int indexOf(/*@non_null@*/ Object element) {

    for (int i = 0; i < m_Size; i++) {
      if (element.equals(m_Objects[i])) {
	return i;
      }
    }
    return -1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Inserts an element at the given position.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param element the element to be inserted
   * @param index the element's index
   */
  public final void insertElementAt(E element, int index) {
    add(index, element);
<<<<<<< HEAD
=======
=======
   *
   * @param element the element to be inserted
   * @param index the element's index
   */
  public final void insertElementAt(Object element, int index) {

    Object[] newObjects;

    if (m_Size < m_Objects.length) {
      System.arraycopy(m_Objects, index, m_Objects, index + 1, 
                       m_Size - index);
      m_Objects[index] = element;
    } else {
      newObjects = new Object[m_CapacityMultiplier *
			     (m_Objects.length +
			      m_CapacityIncrement)];
      System.arraycopy(m_Objects, 0, newObjects, 0, index);
      newObjects[index] = element;
      System.arraycopy(m_Objects, index, newObjects, index + 1,
		       m_Size - index);
      m_Objects = newObjects;
    }
    m_Size++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the last element of the vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the last element of the vector
   */
  public final E lastElement() {
    return get(size() - 1);
<<<<<<< HEAD
=======
=======
   *
   * @return the last element of the vector
   */
  //@ requires m_Size > 0;
  public final /*@pure@*/ Object lastElement() {

    return m_Objects[m_Size - 1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Deletes an element from this vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param index the index of the element to be deleted
   */
  public final void removeElementAt(int index) {
    remove(index);
  }

  /**
   * Removes all components from this vector and sets its size to zero.
   */
  public final void removeAllElements() {
    clear();
<<<<<<< HEAD
=======
=======
   *
   * @param index the index of the element to be deleted
   */
  //@ requires 0 <= index && index < m_Size;
  public final void removeElementAt(int index) {

    System.arraycopy(m_Objects, index + 1, m_Objects, index, 
                     m_Size - index - 1);

    // clear the last reference
    m_Objects[m_Size - 1] = null;

    m_Size--;
  }

  /**
   * Removes all components from this vector and sets its 
   * size to zero. 
   */
  public final void removeAllElements() {

    m_Objects = new Object[m_Objects.length];
    m_Size = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Appends all elements of the supplied vector to this vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param toAppend the FastVector containing elements to append.
   */
  public final void appendElements(Collection<? extends E> toAppend) {
    addAll(toAppend);
<<<<<<< HEAD
=======
=======
   *
   * @param toAppend the FastVector containing elements to append.
   */
  public final void appendElements(FastVector toAppend) {

    setCapacity(size() + toAppend.size());
    System.arraycopy(toAppend.m_Objects, 0, m_Objects, size(), toAppend.size());
    m_Size = m_Objects.length;
  }

  /** 
   * Returns all the elements of this vector as an array
   *
   * @return an array containing all the elements of this vector
   */
  public final Object [] toArray() {

    Object [] newObjects = new Object[size()];
    System.arraycopy(m_Objects, 0, newObjects, 0, size());
    return newObjects;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the vector's capacity to the given value.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param capacity the new capacity
   */
  public final void setCapacity(int capacity) {
    ensureCapacity(capacity);
<<<<<<< HEAD
=======
=======
   *
   * @param capacity the new capacity
   */
  public final void setCapacity(int capacity) {

    Object[] newObjects = new Object[capacity];
   
    System.arraycopy(m_Objects, 0, newObjects, 0, Math.min(capacity, m_Size));
    m_Objects = newObjects;
    if (m_Objects.length < m_Size)
      m_Size = m_Objects.length;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the element at the given index.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param element the element to be put into the vector
   * @param index the index at which the element is to be placed
   */
  public final void setElementAt(E element, int index) {
    set(index, element);
<<<<<<< HEAD
=======
=======
   *
   * @param element the element to be put into the vector
   * @param index the index at which the element is to be placed
   */
  //@ requires 0 <= index && index < size();
  public final void setElementAt(Object element, int index) {

    m_Objects[index] = element;
  }

  /**
   * Returns the vector's current size.
   *
   * @return the vector's current size
   */
  //@ ensures \result == m_Size;
  public final /*@pure@*/ int size() {

    return m_Size;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Swaps two elements in the vector.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param first index of the first element
   * @param second index of the second element
   */
  public final void swap(int first, int second) {

    E in = get(first);
    set(first, get(second));
    set(second, in);
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
  }
}
<<<<<<< HEAD
=======
=======
   *
   * @param first index of the first element
   * @param second index of the second element
   */
  //@ requires 0 <= first && first < size();
  //@ requires 0 <= second && second < size();
  public final void swap(int first, int second) {

    Object help = m_Objects[first];

    m_Objects[first] = m_Objects[second];
    m_Objects[second] = help;
  }

  /**
   * Sets the vector's capacity to its size.
   */
  public final void trimToSize() {

    Object[] newObjects = new Object[m_Size];
    
    System.arraycopy(m_Objects, 0, newObjects, 0, m_Size);
    m_Objects = newObjects;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.16 $");
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
