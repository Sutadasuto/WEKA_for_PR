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
 *    ProtectedProperties.java
<<<<<<< HEAD
 *    Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2001 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * Simple class that extends the Properties class so that the properties are
 * unable to be modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 10203 $
 */
public class ProtectedProperties extends Properties implements RevisionHandler {
<<<<<<< HEAD
=======
=======
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 1.6 $
 */
public class ProtectedProperties
  extends Properties
  implements RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 3876658672657323985L;

  /** the properties need to be open during construction of the object */
  private boolean closed = false;

  /**
   * Creates a set of protected properties from a set of normal ones.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param props the properties to be stored and protected.
   */
  public ProtectedProperties(Properties props) {

    Enumeration<?> propEnum = props.propertyNames();
<<<<<<< HEAD
=======
=======
   *
   * @param props the properties to be stored and protected.
   */
  public ProtectedProperties(Properties props)
  {

    Enumeration propEnum = props.propertyNames();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    while (propEnum.hasMoreElements()) {
      String propName = (String) propEnum.nextElement();
      String propValue = props.getProperty(propName);
      super.setProperty(propName, propValue);
    }
    closed = true; // no modifications allowed from now on
  }

  /**
   * Overrides a method to prevent the properties from being modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return never returns without throwing an exception.
   * @throws UnsupportedOperationException always.
   */
  @Override
  public Object setProperty(String key, String value) {

    if (closed) {
      throw new UnsupportedOperationException(
        "ProtectedProperties cannot be modified!");
    } else {
      return super.setProperty(key, value);
    }
<<<<<<< HEAD
=======
=======
   *
   * @return never returns without throwing an exception.
   * @throws UnsupportedOperationException always.
   */
  public Object setProperty(String key, String value)
    {
    
    if (closed) 
      throw new
	UnsupportedOperationException("ProtectedProperties cannot be modified!");
    else return super.setProperty(key, value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Overrides a method to prevent the properties from being modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws UnsupportedOperationException always.
   */
  @Override
  public void load(InputStream inStream) {

    throw new UnsupportedOperationException(
      "ProtectedProperties cannot be modified!");
<<<<<<< HEAD
=======
=======
   *
   * @throws UnsupportedOperationException always.
   */  
  public void load(InputStream inStream) {
    
    throw new
      UnsupportedOperationException("ProtectedProperties cannot be modified!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Overrides a method to prevent the properties from being modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws UnsupportedOperationException always.
   */
  @Override
  public void clear() {

    throw new UnsupportedOperationException(
      "ProtectedProperties cannot be modified!");
<<<<<<< HEAD
=======
=======
   *
   * @throws UnsupportedOperationException always.
   */
  public void clear() {
    
    throw new
      UnsupportedOperationException("ProtectedProperties cannot be modified!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Overrides a method to prevent the properties from being modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return never returns without throwing an exception.
   * @throws UnsupportedOperationException always.
   */
  @Override
  public Object put(Object key, Object value) {

    if (closed) {
      throw new UnsupportedOperationException(
        "ProtectedProperties cannot be modified!");
    } else {
      return super.put(key, value);
    }
<<<<<<< HEAD
=======
=======
   *
   * @return never returns without throwing an exception.
   * @throws UnsupportedOperationException always.
   */
  public Object put(Object key,
		    Object value) {

    if (closed) 
      throw new
	UnsupportedOperationException("ProtectedProperties cannot be modified!");
    else return super.put(key, value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Overrides a method to prevent the properties from being modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws UnsupportedOperationException always.
   */
  @Override
  public void putAll(Map<? extends Object, ? extends Object> t) {

    throw new UnsupportedOperationException(
      "ProtectedProperties cannot be modified!");
<<<<<<< HEAD
=======
=======
   *
   * @throws UnsupportedOperationException always.
   */
  public void putAll(Map t) {
    
    throw new
      UnsupportedOperationException("ProtectedProperties cannot be modified!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Overrides a method to prevent the properties from being modified.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return never returns without throwing an exception.
   * @throws UnsupportedOperationException always.
   */
  @Override
  public Object remove(Object key) {

    throw new UnsupportedOperationException(
      "ProtectedProperties cannot be modified!");
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
   * @return never returns without throwing an exception.
   * @throws UnsupportedOperationException always.
   */
  public Object remove(Object key) {

    throw new
      UnsupportedOperationException("ProtectedProperties cannot be modified!");
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.6 $");
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
