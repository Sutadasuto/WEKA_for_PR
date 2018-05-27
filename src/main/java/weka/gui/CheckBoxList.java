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
 * CheckBoxList.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.gui;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
<<<<<<< HEAD
import java.util.NoSuchElementException;
=======
<<<<<<< HEAD
import java.util.NoSuchElementException;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;

/**
 * An extended JList that contains CheckBoxes. If necessary a CheckBoxListItem
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * wrapper is added around the displayed object in any of the Model methods,
 * e.g., addElement. For methods returning objects the opposite takes place, the
 * wrapper is removed and only the payload object is returned.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10219 $
 */
public class CheckBoxList extends JList {

  /** for serialization */
  private static final long serialVersionUID = -4359573373359270258L;

  /**
   * represents an item in the CheckBoxListModel
   * 
   * @author fracpete (fracpete at waikato dot ac dot nz)
   * @version $Revision: 10219 $
   */
  protected class CheckBoxListItem {

    /** whether item is checked or not */
    private boolean m_Checked = false;

    /** the actual object */
    private Object m_Content = null;

    /**
     * initializes the item with the given object and initially unchecked
     * 
     * @param o the content object
<<<<<<< HEAD
=======
=======
 * wrapper is added around the displayed object in any of the Model methods, 
 * e.g., addElement. For methods returning objects the opposite takes place, 
 * the wrapper is removed and only the payload object is returned.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7059 $
 */
public class CheckBoxList
  extends JList {

  /** for serialization */
  private static final long serialVersionUID = -4359573373359270258L;
  
  /**
   * represents an item in the CheckBoxListModel
   * 
   * @author  fracpete (fracpete at waikato dot ac dot nz)
   * @version $Revision: 7059 $
   */
  protected class CheckBoxListItem {
    
    /** whether item is checked or not */
    private boolean m_Checked = false;
    
    /** the actual object */
    private Object m_Content = null;
    
    /**
     * initializes the item with the given object and initially unchecked
     * 
     * @param o		the content object
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    public CheckBoxListItem(Object o) {
      this(o, false);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * initializes the item with the given object and whether it's checked
     * initially
     * 
<<<<<<< HEAD
     * @param o the content object
     * @param checked whether the item should be checked initially
=======
<<<<<<< HEAD
     * @param o the content object
     * @param checked whether the item should be checked initially
=======
     * @param o		the content object
     * @param checked	whether the item should be checked initially
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    public CheckBoxListItem(Object o, boolean checked) {
      m_Checked = checked;
      m_Content = o;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * returns the content object
     */
    public Object getContent() {
      return m_Content;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * sets the checked state of the item
     */
    public void setChecked(boolean value) {
      m_Checked = value;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * returns the checked state of the item
     */
    public boolean getChecked() {
      return m_Checked;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * returns the string representation of the content object
     */
    @Override
    public String toString() {
      return m_Content.toString();
    }

<<<<<<< HEAD
=======
=======
    
    /**
     * returns the string representation of the content object
     */
    public String toString() {
      return m_Content.toString();
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * returns true if the "payload" objects of the current and the given
     * CheckBoxListItem are the same.
     * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param o the CheckBoxListItem to check
     * @throws IllegalArgumentException if the provided object is not a
     *           CheckBoxListItem
     */
    @Override
    public boolean equals(Object o) {
      if (!(o instanceof CheckBoxListItem)) {
        throw new IllegalArgumentException("Must be a CheckBoxListItem!");
      }

      return getContent().equals(((CheckBoxListItem) o).getContent());
    }
  }

  /**
   * A specialized model.
   * 
   * @author fracpete (fracpete at waikato dot ac dot nz)
   * @version $Revision: 10219 $
   */
  @SuppressWarnings("rawtypes")
  public class CheckBoxListModel extends DefaultListModel {

    /** for serialization */
    private static final long serialVersionUID = 7772455499540273507L;

<<<<<<< HEAD
=======
=======
     * @param o		the CheckBoxListItem to check
     * @throws IllegalArgumentException if the provided object is not a CheckBoxListItem
     */
    public boolean equals(Object o) {
      if (!(o instanceof CheckBoxListItem))
	throw new IllegalArgumentException(Messages.getInstance().getString("CheckBoxList_Equals_IllegalArgumentException_Text"));
      
      return getContent().equals(((CheckBoxListItem) o).getContent());
    }
  }
  
  /**
   * A specialized model.
   * 
   * @author  fracpete (fracpete at waikato dot ac dot nz)
   * @version $Revision: 7059 $
   */
  public class CheckBoxListModel
    extends DefaultListModel {

    /** for serialization */
    private static final long serialVersionUID = 7772455499540273507L;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * initializes the model with no data.
     */
    public CheckBoxListModel() {
      super();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Constructs a CheckBoxListModel from an array of objects and then applies
     * setModel to it.
     * 
     * @param listData the data to use
     */
    public CheckBoxListModel(Object[] listData) {
      for (Object element : listData) {
        addElement(element);
      }
    }

    /**
     * Constructs a CheckBoxListModel from a Vector and then applies setModel to
     * it.
     */
    public CheckBoxListModel(Vector listData) {
      for (int i = 0; i < listData.size(); i++) {
        addElement(listData.get(i));
      }
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * 
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, Object element) {
      if (!(element instanceof CheckBoxListItem)) {
        super.add(index, new CheckBoxListItem(element));
      } else {
        super.add(index, element);
      }
    }

    /**
     * Adds the specified component to the end of this list.
     * 
     * @param obj the component to be added
     */
    @Override
    public void addElement(Object obj) {
      if (!(obj instanceof CheckBoxListItem)) {
        super.addElement(new CheckBoxListItem(obj));
      } else {
        super.addElement(obj);
      }
    }

    /**
     * Tests whether the specified object is a component in this list.
     * 
     * @param elem the element to check
     * @return true if the element is in the list
     */
    @Override
    public boolean contains(Object elem) {
      if (!(elem instanceof CheckBoxListItem)) {
        return super.contains(new CheckBoxListItem(elem));
      } else {
        return super.contains(elem);
      }
    }

    /**
     * Copies the components of this list into the specified array.
     * 
     * @param anArray the array into which the components get copied
     * @throws IndexOutOfBoundsException if the array is not big enough
     */
    @Override
    public void copyInto(Object[] anArray) {
      if (anArray.length < getSize()) {
        throw new IndexOutOfBoundsException("Array not big enough!");
      }

      for (int i = 0; i < getSize(); i++) {
        anArray[i] = ((CheckBoxListItem) getElementAt(i)).getContent();
      }
    }

    /**
     * Returns the component at the specified index. Throws an
     * ArrayIndexOutOfBoundsException if the index is negative or not less than
     * the size of the list.
     * 
     * @param index an index into this list
     * @return the component at the specified index
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public Object elementAt(int index) {
      return ((CheckBoxListItem) super.elementAt(index)).getContent();
    }

    /**
     * Returns the first component of this list. Throws a NoSuchElementException
     * if this vector has no components.
     * 
     * @return the first component of this list
     * @throws NoSuchElementException
     */
    @Override
    public Object firstElement() {
      return ((CheckBoxListItem) super.firstElement()).getContent();
    }

<<<<<<< HEAD
=======
=======
    
    /**
     * Constructs a CheckBoxListModel from an array of objects and then applies 
     * setModel to it.
     * 
     * @param listData	the data to use
     */
    public CheckBoxListModel(Object[] listData) {
      for (int i = 0; i < listData.length; i++)
        addElement(listData[i]);
    }
    
    /**
     * Constructs a CheckBoxListModel from a Vector and then applies setModel 
     * to it.
     */
    public CheckBoxListModel(Vector listData) {
      for (int i = 0; i < listData.size(); i++)
        addElement(listData.get(i));
    }
    
    /**
     * Inserts the specified element at the specified position in this list.
     * 
     * @param index	index at which the specified element is to be inserted
     * @param element	element to be inserted
     */
    public void add(int index, Object element) {
      if (!(element instanceof CheckBoxListItem))
	super.add(index, new CheckBoxListItem(element));
      else
	super.add(index, element);
    }
    
    /**
     * Adds the specified component to the end of this list.
     * 
     * @param obj 	the component to be added
     */
    public void addElement(Object obj) {
      if (!(obj instanceof CheckBoxListItem))
	super.addElement(new CheckBoxListItem(obj));
      else
	super.addElement(obj);
    }
    
    /**
     * Tests whether the specified object is a component in this list.
     * 
     * @param elem	the element to check
     * @return		true if the element is in the list
     */
    public boolean contains(Object elem) {
      if (!(elem instanceof CheckBoxListItem))
	return super.contains(new CheckBoxListItem(elem));
      else
	return super.contains(elem);
    }
    
    /**
     * Copies the components of this list into the specified array.
     * 
     * @param anArray	the array into which the components get copied
     * @throws IndexOutOfBoundsException if the array is not big enough
     */
    public void copyInto(Object[] anArray) {
      if (anArray.length < getSize())
	throw new IndexOutOfBoundsException(Messages.getInstance().getString("CheckBoxList_CopyInto_IndexOutOfBoundsException_Text"));
      
      for (int i = 0; i < getSize(); i++)
	anArray[i] = ((CheckBoxListItem) getElementAt(i)).getContent();
    }
    
    /**
     * Returns the component at the specified index. Throws an 
     * ArrayIndexOutOfBoundsException if the index is negative or not less 
     * than the size of the list.
     * 
     * @param index	an index into this list
     * @return 		the component at the specified index
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object elementAt(int index) {
      return ((CheckBoxListItem) super.elementAt(index)).getContent();
    }
    
    /**
     * Returns the first component of this list. Throws a 
     * NoSuchElementException if this vector has no components.
     * 
     * @return		the first component of this list
     * @throws NoSuchElementException
     */
    public Object firstElement() {
      return ((CheckBoxListItem) super.firstElement()).getContent();
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index of element to return
     * @throws ArrayIndexOutOfBoundsException
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public Object get(int index) {
      return ((CheckBoxListItem) super.get(index)).getContent();
    }

    /**
     * Returns the component at the specified index.
     * 
     * @param index an index into this list
     * @return the component at the specified index
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public Object getElementAt(int index) {
      return ((CheckBoxListItem) super.getElementAt(index)).getContent();
    }

    /**
     * Searches for the first occurrence of elem.
     * 
     * @param elem an object
     * @return the index of the first occurrence of the argument in this list;
     *         returns -1 if the object is not found
     */
    @Override
    public int indexOf(Object elem) {
      if (!(elem instanceof CheckBoxListItem)) {
        return super.indexOf(new CheckBoxListItem(elem));
      } else {
        return super.indexOf(elem);
      }
    }

    /**
     * Searches for the first occurrence of elem, beginning the search at index.
     * 
     * @param elem the desired component
     * @param index the index from which to begin searching
     * @return the index where the first occurrence of elem is found after
     *         index; returns -1 if the elem is not found in the list
     */
    @Override
    public int indexOf(Object elem, int index) {
      if (!(elem instanceof CheckBoxListItem)) {
        return super.indexOf(new CheckBoxListItem(elem), index);
      } else {
        return super.indexOf(elem, index);
      }
    }

    /**
     * Inserts the specified object as a component in this list at the specified
     * index.
     * 
     * @param obj the component to insert
     * @param index where to insert the new component
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public void insertElementAt(Object obj, int index) {
      if (!(obj instanceof CheckBoxListItem)) {
        super.insertElementAt(new CheckBoxListItem(obj), index);
      } else {
        super.insertElementAt(obj, index);
      }
    }

    /**
     * Returns the last component of the list. Throws a NoSuchElementException
     * if this vector has no components.
     * 
     * @return the last component of the list
     * @throws NoSuchElementException
     */
    @Override
    public Object lastElement() {
      return ((CheckBoxListItem) super.lastElement()).getContent();
    }

    /**
     * Returns the index of the last occurrence of elem.
     * 
     * @param elem the desired component
     * @return the index of the last occurrence of elem in the list; returns -1
     *         if the object is not found
     */
    @Override
    public int lastIndexOf(Object elem) {
      if (!(elem instanceof CheckBoxListItem)) {
        return super.lastIndexOf(new CheckBoxListItem(elem));
      } else {
        return super.lastIndexOf(elem);
      }
    }

    /**
     * Searches backwards for elem, starting from the specified index, and
     * returns an index to it.
     * 
     * @param elem the desired component
     * @param index the index to start searching from
     * @return the index of the last occurrence of the elem in this list at
     *         position less than index; returns -1 if the object is not found
     */
    @Override
    public int lastIndexOf(Object elem, int index) {
      if (!(elem instanceof CheckBoxListItem)) {
        return super.lastIndexOf(new CheckBoxListItem(elem), index);
      } else {
        return super.lastIndexOf(elem, index);
      }
    }

    /**
     * Removes the element at the specified position in this list. Returns the
     * element that was removed from the list.
     * 
     * @param index the index of the element to removed
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public Object remove(int index) {
      return ((CheckBoxListItem) super.remove(index)).getContent();
    }

    /**
     * Removes the first (lowest-indexed) occurrence of the argument from this
     * list.
     * 
     * @param obj the component to be removed
     * @return true if the argument was a component of this list; false
     *         otherwise
     */
    @Override
    public boolean removeElement(Object obj) {
      if (!(obj instanceof CheckBoxListItem)) {
        return super.removeElement(new CheckBoxListItem(obj));
      } else {
        return super.removeElement(obj);
      }
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * 
     * @param index index of element to replace
     * @param element element to be stored at the specified position
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public Object set(int index, Object element) {
      if (!(element instanceof CheckBoxListItem)) {
        return ((CheckBoxListItem) super.set(index, new CheckBoxListItem(
          element))).getContent();
      } else {
        return ((CheckBoxListItem) super.set(index, element)).getContent();
      }
    }

    /**
     * Sets the component at the specified index of this list to be the
     * specified object. The previous component at that position is discarded.
     * 
     * @param obj what the component is to be set to
     * @param index the specified index
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public void setElementAt(Object obj, int index) {
      if (!(obj instanceof CheckBoxListItem)) {
        super.setElementAt(new CheckBoxListItem(obj), index);
      } else {
        super.setElementAt(obj, index);
      }
    }

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order.
     * 
     * @return an array containing the elements of the list
     */
    @Override
    public Object[] toArray() {
      Object[] result;
      Object[] internal;
      int i;

      internal = super.toArray();
      result = new Object[internal.length];

      for (i = 0; i < internal.length; i++) {
        result[i] = ((CheckBoxListItem) internal[i]).getContent();
      }

      return result;
    }

    /**
     * returns the checked state of the element at the given index
     * 
     * @param index the index of the element to return the checked state for
     * @return the checked state of the specifed element
<<<<<<< HEAD
=======
=======
    public Object get(int index) {
      return ((CheckBoxListItem) super.get(index)).getContent();
    }
    
    /**
     * Returns the component at the specified index.
     * 
     * @param index 	an index into this list
     * @return 		the component at the specified index 
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object getElementAt(int index) {
      return ((CheckBoxListItem) super.getElementAt(index)).getContent();
    }
    
    /**
     * Searches for the first occurrence of elem.
     * 
     * @param elem	an object
     * @return 		the index of the first occurrence of the argument in this list; 
     * 			returns -1 if the object is not found
     */
    public int indexOf(Object elem) {
      if (!(elem instanceof CheckBoxListItem))
	return super.indexOf(new CheckBoxListItem(elem));
      else
	return super.indexOf(elem);
    }
    
    /**
     * Searches for the first occurrence of elem, beginning the search at index.
     * 
     * @param elem 	the desired component
     * @param index	the index from which to begin searching
     * @return		the index where the first occurrence of elem  is found after index; 
     * 			returns -1  if the elem is not found in the list
     */
    public int indexOf(Object elem, int index) {
      if (!(elem instanceof CheckBoxListItem))
	return super.indexOf(new CheckBoxListItem(elem), index);
      else
	return super.indexOf(elem, index);
    }
    
    /**
     * Inserts the specified object as a component in this list at the 
     * specified index.
     * 
     * @param obj	the component to insert
     * @param index	where to insert the new component
     * @throws ArrayIndexOutOfBoundsException 
     */
    public void insertElementAt(Object obj, int index) {
      if (!(obj instanceof CheckBoxListItem))
	super.insertElementAt(new CheckBoxListItem(obj), index);
      else
	super.insertElementAt(obj, index);
    }
    
    /**
     * Returns the last component of the list. Throws a NoSuchElementException 
     * if this vector has no components.
     * 
     * @return 		the last component of the list
     * @throws NoSuchElementException
     */
    public Object lastElement() {
      return ((CheckBoxListItem) super.lastElement()).getContent();
    }
    
    /**
     * Returns the index of the last occurrence of elem.
     * 
     * @param elem	the desired component
     * @return		the index of the last occurrence of elem  in the list; 
     * 			returns -1 if the object is not found
     */
    public int lastIndexOf(Object elem) {
      if (!(elem instanceof CheckBoxListItem))
	return super.lastIndexOf(new CheckBoxListItem(elem));
      else
	return super.lastIndexOf(elem);
    }
    
    /**
     * Searches backwards for elem, starting from the specified index, 
     * and returns an index to it.
     * 
     * @param elem	the desired component
     * @param index	the index to start searching from
     * @return		the index of the last occurrence of the elem in this 
     * 			list at position less than index; returns -1 if the 
     * 			object is not found
     */
    public int lastIndexOf(Object elem, int index) {
      if (!(elem instanceof CheckBoxListItem))
	return super.lastIndexOf(new CheckBoxListItem(elem), index);
      else
	return super.lastIndexOf(elem, index);
    }
    
    /**
     * Removes the element at the specified position in this list. Returns the 
     * element that was removed from the list.
     * 
     * @param index	the index of the element to removed
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object remove(int index) {
      return ((CheckBoxListItem) super.remove(index)).getContent();
    }
    
    /**
     * Removes the first (lowest-indexed) occurrence of the argument from this 
     * list.
     * 
     * @param obj	the component to be removed
     * @return		true if the argument was a component of this list; 
     * 			false otherwise
     */
    public boolean removeElement(Object obj) {
      if (!(obj instanceof CheckBoxListItem))
	return super.removeElement(new CheckBoxListItem(obj));
      else
	return super.removeElement(obj);
    }
    
    /**
     * Replaces the element at the specified position in this list with the 
     * specified element.
     * 
     * @param index	index of element to replace
     * @param element	element to be stored at the specified position
     * @throws ArrayIndexOutOfBoundsException 
     */
    public Object set(int index, Object element) {
      if (!(element instanceof CheckBoxListItem))
	return ((CheckBoxListItem) super.set(index, new CheckBoxListItem(element))).getContent();
      else
	return ((CheckBoxListItem) super.set(index, element)).getContent();
    }
    
    /**
     * Sets the component at the specified index of this list to be the 
     * specified object. The previous component at that position is discarded.
     * 
     * @param obj	what the component is to be set to
     * @param index	the specified index
     * @throws ArrayIndexOutOfBoundsException
     */
    public void setElementAt(Object obj, int index) {
      if (!(obj instanceof CheckBoxListItem))
	super.setElementAt(new CheckBoxListItem(obj), index);
      else
	super.setElementAt(obj, index);
    }
    
    /**
     * Returns an array containing all of the elements in this list in the 
     * correct order.
     * 
     * @return 		an array containing the elements of the list
     */
    public Object[] toArray() {
      Object[]		result;
      Object[]		internal;
      int		i;
      
      internal = super.toArray();
      result   = new Object[internal.length];
      
      for (i = 0; i < internal.length; i++)
	result[i] = ((CheckBoxListItem) internal[i]).getContent();
      
      return result;
    }
    
    /**
     * returns the checked state of the element at the given index
     * 
     * @param index	the index of the element to return the checked state for
     * @return		the checked state of the specifed element
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    public boolean getChecked(int index) {
      return ((CheckBoxListItem) super.getElementAt(index)).getChecked();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * sets the checked state of the element at the given index
     * 
     * @param index the index of the element to set the checked state for
     * @param checked the new checked state
<<<<<<< HEAD
=======
=======
    
    /**
     * sets the checked state of the element at the given index
     * 
     * @param index	the index of the element to set the checked state for
     * @param checked	the new checked state
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     */
    public void setChecked(int index, boolean checked) {
      ((CheckBoxListItem) super.getElementAt(index)).setChecked(checked);
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * A specialized CellRenderer for the CheckBoxList
   * 
   * @author fracpete (fracpete at waikato dot ac dot nz)
   * @version $Revision: 10219 $
   * @see CheckBoxList
   */
  public class CheckBoxListRenderer extends JCheckBox implements
    ListCellRenderer {

    /** for serialization */
    private static final long serialVersionUID = 1059591605858524586L;

    /**
     * Return a component that has been configured to display the specified
     * value.
     * 
     * @param list The JList we're painting.
     * @param value The value returned by list.getModel().getElementAt(index).
     * @param index The cells index.
     * @param isSelected True if the specified cell was selected.
     * @param cellHasFocus True if the specified cell has the focus.
     * @return A component whose paint() method will render the specified value.
     */
    @Override
    public Component getListCellRendererComponent(JList list, Object value,
      int index, boolean isSelected, boolean cellHasFocus) {

      setText(value.toString());
      setSelected(((CheckBoxList) list).getChecked(index));
      setBackground(isSelected ? list.getSelectionBackground() : list
        .getBackground());
      setForeground(isSelected ? list.getSelectionForeground() : list
        .getForeground());
      setFocusPainted(false);

      return this;
    }
  }

<<<<<<< HEAD
=======
=======
  
  /**
   * A specialized CellRenderer for the CheckBoxList
   * 
   * @author  fracpete (fracpete at waikato dot ac dot nz)
   * @version $Revision: 7059 $
   * @see CheckBoxList
   */
  public class CheckBoxListRenderer 
    extends JCheckBox 
    implements ListCellRenderer {

    /** for serialization */
    private static final long serialVersionUID = 1059591605858524586L;
  
    /**
     * Return a component that has been configured to display the specified 
     * value.
     * 
     * @param list	The JList we're painting.
     * @param value	The value returned by list.getModel().getElementAt(index).
     * @param index	The cells index.
     * @param isSelected	True if the specified cell was selected.
     * @param cellHasFocus	True if the specified cell has the focus.
     * @return 		A component whose paint() method will render the 
     * 			specified value.
     */
    public Component getListCellRendererComponent(
	JList list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus) {
      
      setText(value.toString());
      setSelected(((CheckBoxList) list).getChecked(index));
      setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
      setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());
      setFocusPainted(false);
      
      return this;
    }
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * initializes the list with an empty CheckBoxListModel
   */
  public CheckBoxList() {
    this(null);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * initializes the list with the given CheckBoxListModel
   * 
   * @param model the model to initialize with
   */
  public CheckBoxList(CheckBoxListModel model) {
    super();

    if (model == null) {
      model = this.new CheckBoxListModel();
    }

    setModel(model);
    setCellRenderer(new CheckBoxListRenderer());

    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        int index = locationToIndex(e.getPoint());

        if (index != -1) {
          setChecked(index, !getChecked(index));
          repaint();
        }
      }
    });

    addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {
        if ((e.getKeyChar() == ' ') && (e.getModifiers() == 0)) {
          int index = getSelectedIndex();
          setChecked(index, !getChecked(index));
          e.consume();
          repaint();
<<<<<<< HEAD
=======
=======
  
  /**
   * initializes the list with the given CheckBoxListModel
   * 
   * @param model	the model to initialize with
   */
  public CheckBoxList(CheckBoxListModel model) {
    super();
    
    if (model == null)
      model = this.new CheckBoxListModel();
    
    setModel(model);
    setCellRenderer(new CheckBoxListRenderer());
    
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
	int index = locationToIndex(e.getPoint());
	
	if (index != -1) {
	  setChecked(index, !getChecked(index));
	  repaint();
	}
      }
    });
    
    addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) {
        if ( (e.getKeyChar() == ' ') && (e.getModifiers() == 0) ) {
          int index = getSelectedIndex();
          setChecked(index, !getChecked(index));
          e.consume();
	  repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    });
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * sets the model - must be an instance of CheckBoxListModel
   * 
   * @param model the model to use
   * @throws IllegalArgumentException if the model is not an instance of
   *           CheckBoxListModel
   * @see CheckBoxListModel
   */
  @Override
  public void setModel(ListModel model) {
    if (!(model instanceof CheckBoxListModel)) {
      throw new IllegalArgumentException(
        "Model must be an instance of CheckBoxListModel!");
    }

    super.setModel(model);
  }

  /**
   * Constructs a CheckBoxListModel from an array of objects and then applies
   * setModel to it.
   * 
   * @param listData the data to use
   */
  @Override
  public void setListData(Object[] listData) {
    setModel(new CheckBoxListModel(listData));
  }

  /**
   * Constructs a CheckBoxListModel from a Vector and then applies setModel to
   * it.
   */
  @Override
  public void setListData(@SuppressWarnings("rawtypes") Vector listData) {
    setModel(new CheckBoxListModel(listData));
  }

  /**
   * returns the checked state of the element at the given index
   * 
   * @param index the index of the element to return the checked state for
   * @return the checked state of the specifed element
<<<<<<< HEAD
=======
=======
  
  /**
   * sets the model - must be an instance of CheckBoxListModel
   * 
   * @param model			the model to use
   * @throws IllegalArgumentException 	if the model is not an instance of
   * 					CheckBoxListModel
   * @see CheckBoxListModel
   */
  public void setModel(ListModel model) {
    if (!(model instanceof CheckBoxListModel))
      throw new IllegalArgumentException(Messages.getInstance().getString("CheckBoxList_SetModel_IllegalArgumentException_Text"));
    
    super.setModel(model);
  }
  
  /**
   * Constructs a CheckBoxListModel from an array of objects and then applies 
   * setModel to it.
   * 
   * @param listData	the data to use
   */
  public void setListData(Object[] listData) {
    setModel(new CheckBoxListModel(listData));
  }
  
  /**
   * Constructs a CheckBoxListModel from a Vector and then applies setModel 
   * to it.
   */
  public void setListData(Vector listData) {
    setModel(new CheckBoxListModel(listData));
  }
  
  /**
   * returns the checked state of the element at the given index
   * 
   * @param index	the index of the element to return the checked state for
   * @return		the checked state of the specifed element
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getChecked(int index) {
    return ((CheckBoxListModel) getModel()).getChecked(index);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * sets the checked state of the element at the given index
   * 
   * @param index the index of the element to set the checked state for
   * @param checked the new checked state
<<<<<<< HEAD
=======
=======
  
  /**
   * sets the checked state of the element at the given index
   * 
   * @param index	the index of the element to set the checked state for
   * @param checked	the new checked state
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setChecked(int index, boolean checked) {
    ((CheckBoxListModel) getModel()).setChecked(index, checked);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * returns an array with the indices of all checked items
   * 
   * @return the indices of all items that are currently checked
   */
  public int[] getCheckedIndices() {
    Vector<Integer> list;
    int[] result;
    int i;

    // traverse over model
    list = new Vector<Integer>();
    for (i = 0; i < getModel().getSize(); i++) {
      if (getChecked(i)) {
        list.add(new Integer(i));
      }
    }

    // generate result array
    result = new int[list.size()];
    for (i = 0; i < list.size(); i++) {
      result[i] = list.get(i).intValue();
    }

<<<<<<< HEAD
=======
=======
  
  /**
   * returns an array with the indices of all checked items
   * 
   * @return		the indices of all items that are currently checked
   */
  public int[] getCheckedIndices() {
    Vector	list;
    int[]	result;
    int		i;
    
    // traverse over model
    list = new Vector();
    for (i = 0; i < getModel().getSize(); i++) {
      if (getChecked(i))
	list.add(new Integer(i));
    }
    
    // generate result array
    result = new int[list.size()];
    for (i = 0; i < list.size(); i++) {
      result[i] = ((Integer) list.get(i)).intValue();
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }
}
