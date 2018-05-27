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
 *    PropertyNode.java
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

package weka.experiment;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.Serializable;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

/**
 * Stores information on a property of an object: the class of the object with
 * the property; the property descriptor, and the current value.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10203 $
 */
public class PropertyNode implements Serializable, RevisionHandler {
<<<<<<< HEAD
=======
=======
/**
 * Stores information on a property of an object: the class of the
 * object with the property; the property descriptor, and the current
 * value.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 1.7 $
 */
public class PropertyNode
  implements Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -8718165742572631384L;

  /** The current property value */
  public Object value;

  /** The class of the object with this property */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Class<?> parentClass;

  /** Other info about the property */
  public PropertyDescriptor property;

  /**
   * Creates a mostly empty property.
   * 
   * @param pValue a property value.
   */
  public PropertyNode(Object pValue) {

<<<<<<< HEAD
=======
=======
  public Class parentClass;

  /** Other info about the property */
  public PropertyDescriptor property;
  
  /**
   * Creates a mostly empty property.
   *
   * @param pValue a property value.
   */
  public PropertyNode(Object pValue) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    this(pValue, null, null);
  }

  /**
   * Creates a fully specified property node.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pValue the current property value.
   * @param prop the PropertyDescriptor.
   * @param pClass the Class of the object with this property.
   */
<<<<<<< HEAD
  public PropertyNode(Object pValue, PropertyDescriptor prop, Class<?> pClass) {

=======
<<<<<<< HEAD
  public PropertyNode(Object pValue, PropertyDescriptor prop, Class<?> pClass) {

=======
  public PropertyNode(Object pValue, PropertyDescriptor prop, Class pClass) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    value = pValue;
    property = prop;
    parentClass = pClass;
  }

  /**
   * Returns a string description of this property.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a value of type 'String'
   */
  @Override
  public String toString() {

<<<<<<< HEAD
=======
=======
   *
   * @return a value of type 'String'
   */
  public String toString() {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (property == null) {
      return "Available properties";
    }
    return property.getDisplayName();
  }

  /*
<<<<<<< HEAD
   * Handle serialization ourselves since PropertyDescriptor isn't serializable
=======
<<<<<<< HEAD
   * Handle serialization ourselves since PropertyDescriptor isn't serializable
=======
   * Handle serialization ourselves since PropertyDescriptor isn't
   * serializable
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void writeObject(java.io.ObjectOutputStream out) throws IOException {

    try {
      out.writeObject(value);
    } catch (Exception ex) {
      throw new IOException("Can't serialize object: " + ex.getMessage());
    }
    out.writeObject(parentClass);
    out.writeObject(property.getDisplayName());
    out.writeObject(property.getReadMethod().getName());
    out.writeObject(property.getWriteMethod().getName());
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private void readObject(java.io.ObjectInputStream in) throws IOException,
    ClassNotFoundException {

    value = in.readObject();
    parentClass = (Class<?>) in.readObject();
<<<<<<< HEAD
=======
=======
  private void readObject(java.io.ObjectInputStream in)
    throws IOException, ClassNotFoundException {

    value = in.readObject();
    parentClass = (Class) in.readObject();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String name = (String) in.readObject();
    String getter = (String) in.readObject();
    String setter = (String) in.readObject();
    /*
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * System.err.println("Loading property descriptor:\n" + "\tparentClass: " +
     * parentClass.getName() + "\tname: " + name + "\tgetter: " + getter +
     * "\tsetter: " + setter);
     */
<<<<<<< HEAD
=======
=======
    System.err.println("Loading property descriptor:\n"
		       + "\tparentClass: " + parentClass.getName()
		       + "\tname: " + name
		       + "\tgetter: " + getter
		       + "\tsetter: " + setter);
    */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    try {
      property = new PropertyDescriptor(name, parentClass, getter, setter);
    } catch (IntrospectionException ex) {
      throw new ClassNotFoundException("Couldn't create property descriptor: "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        + parentClass.getName() + "::" + name);
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
<<<<<<< HEAD
=======
=======
				       + parentClass.getName() + "::"
				       + name);
    }
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.7 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
} // PropertyNode
