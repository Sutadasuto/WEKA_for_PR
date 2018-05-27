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
 *    SerializedObject.java
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

<<<<<<< HEAD
import weka.core.scripting.Jython;
import weka.core.scripting.JythonSerializableObject;

=======
<<<<<<< HEAD
import weka.core.scripting.Jython;
import weka.core.scripting.JythonSerializableObject;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
<<<<<<< HEAD
=======
=======
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * Class for storing an object in serialized form in memory. It can be used to
 * make deep copies of objects, and also allows compression to conserve memory.
 * <p>
 *
 * @author Richard Kirkby (rbk1@cs.waikato.ac.nz)
 * @version $Revision: 13986 $
 */
public class SerializedObject implements Serializable, RevisionHandler {
<<<<<<< HEAD
=======
=======
 * Class for storing an object in serialized form in memory. It can be used 
 * to make deep copies of objects, and also allows compression to conserve
 * memory. <p>
 *
 * @author Richard Kirkby (rbk1@cs.waikato.ac.nz)
 * @version $Revision: 1.12 $ 
 */
public class SerializedObject
  implements Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 6635502953928860434L;

  /** The array storing the object. */
  private byte[] m_storedObjectArray;

  /** Whether or not the object is compressed. */
  private boolean m_isCompressed;

  /** Whether it is a Jython object or not */
  private boolean m_isJython;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates a new serialized object (without compression).
   *
   * @param toStore the object to store
   * @exception Exception if the object couldn't be serialized
<<<<<<< HEAD
   */
=======
<<<<<<< HEAD
   */
=======
   */ 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public SerializedObject(Object toStore) throws Exception {

    this(toStore, false);
  }

  /**
   * Creates a new serialized object.
   *
   * @param toStore the object to store
   * @param compress whether or not to use compression
   * @exception Exception if the object couldn't be serialized
<<<<<<< HEAD
   */
=======
<<<<<<< HEAD
   */
=======
   */ 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public SerializedObject(Object toStore, boolean compress) throws Exception {

    ByteArrayOutputStream ostream = new ByteArrayOutputStream();
    OutputStream os = ostream;
    ObjectOutputStream p;
    if (!compress)
      p = new ObjectOutputStream(new BufferedOutputStream(os));
    else
<<<<<<< HEAD
      p =
        new ObjectOutputStream(new BufferedOutputStream(
          new GZIPOutputStream(os)));
=======
<<<<<<< HEAD
      p =
        new ObjectOutputStream(new BufferedOutputStream(
          new GZIPOutputStream(os)));
=======
      p = new ObjectOutputStream(new BufferedOutputStream(new GZIPOutputStream(os)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p.writeObject(toStore);
    p.flush();
    p.close(); // used to be ostream.close() !
    m_storedObjectArray = ostream.toByteArray();

    m_isCompressed = compress;
<<<<<<< HEAD
    m_isJython = (toStore instanceof JythonSerializableObject);
=======
<<<<<<< HEAD
    m_isJython = (toStore instanceof JythonSerializableObject);
=======
    m_isJython     = (toStore instanceof JythonSerializableObject);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /*
   * Checks to see whether this object is equal to another.
<<<<<<< HEAD
   * 
   * @param compareTo the object to compare to
   * 
=======
<<<<<<< HEAD
   * 
   * @param compareTo the object to compare to
   * 
=======
   *
   * @param compareTo the object to compare to
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return whether or not the objects are equal
   */
  public final boolean equals(Object compareTo) {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (compareTo == null)
      return false;
    if (!compareTo.getClass().equals(this.getClass()))
      return false;
    byte[] compareArray = ((SerializedObject) compareTo).m_storedObjectArray;
    if (compareArray.length != m_storedObjectArray.length)
      return false;
    for (int i = 0; i < compareArray.length; i++) {
      if (compareArray[i] != m_storedObjectArray[i])
        return false;
<<<<<<< HEAD
=======
=======
    if (compareTo == null) return false;
    if (!compareTo.getClass().equals(this.getClass())) return false;
    byte[] compareArray = ((SerializedObject)compareTo).m_storedObjectArray;
    if (compareArray.length != m_storedObjectArray.length) return false;
    for (int i=0; i<compareArray.length; i++) {
      if (compareArray[i] != m_storedObjectArray[i]) return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return true;
  }

  /**
   * Returns a hashcode for this object.
   *
   * @return the hashcode
   */
  public int hashCode() {

    return m_storedObjectArray.length;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns a serialized object. Uses org.python.util.PythonObjectInputStream
   * for Jython objects (read <a
   * href="http://aspn.activestate.com/ASPN/Mail/Message/Jython-users/1001401"
   * >here</a> for more details).
   *
   * @return the restored object
   */
  public Object getObject() {
    try {
      ByteArrayInputStream istream =
        new ByteArrayInputStream(m_storedObjectArray);
      ObjectInputStream p;
      Object toReturn = null;
      if (m_isJython) {
        if (!m_isCompressed)
          toReturn = Jython.deserialize(new BufferedInputStream(istream));
        else
          toReturn =
            Jython.deserialize(new BufferedInputStream(new GZIPInputStream(
              istream)));
      } else {
        if (!m_isCompressed)
          p = new ObjectInputStream(new BufferedInputStream(istream)) {
            protected Set<WekaPackageLibIsolatingClassLoader> m_thirdPartyLoaders =
              new LinkedHashSet<>();

            @Override
            protected Class<?> resolveClass(ObjectStreamClass desc)
              throws IOException, ClassNotFoundException {

              // make sure that the type descriptor for arrays gets removed from
              // what we're going to look up!
              String arrayStripped =
                desc.getName().replace("[L", "").replace("[", "")
                  .replace(";", "");
              ClassLoader cl =
                WekaPackageClassLoaderManager
                  .getWekaPackageClassLoaderManager().getLoaderForClass(
                    arrayStripped);
              if (cl instanceof WekaPackageLibIsolatingClassLoader) {
                // might be third-party classes involved, store the classloader
                m_thirdPartyLoaders
                  .add((WekaPackageLibIsolatingClassLoader) cl);
              }

              Class<?> result = null;
              try {
                result = Class.forName(desc.getName(), true, cl);
              } catch (ClassNotFoundException ex) {
                for (WekaPackageLibIsolatingClassLoader l : m_thirdPartyLoaders) {
                  ClassLoader checked =
                    SerializationHelper.checkForThirdPartyClass(arrayStripped, l);
                  if (checked != null) {
                    result = Class.forName(desc.getName(), true, checked);
                  }
                }
              }

              if (result == null) {
                throw new ClassNotFoundException("Unable to find class "
                  + arrayStripped);
              }

              return result;
            }
          };
        else
          p =
            new ObjectInputStream(new BufferedInputStream(new GZIPInputStream(
              istream))) {

              protected Set<WekaPackageLibIsolatingClassLoader> m_thirdPartyLoaders =
                new LinkedHashSet<>();
              protected WekaPackageLibIsolatingClassLoader m_firstLoader = null;

              @Override
              protected Class<?> resolveClass(ObjectStreamClass desc)
                throws IOException, ClassNotFoundException {

                // make sure that the type descriptor for arrays gets removed
                // from what we're going to look up!
                String arrayStripped =
                  desc.getName().replace("[L", "").replace("[", "")
                    .replace(";", "");
                ClassLoader cl =
                  WekaPackageClassLoaderManager
                    .getWekaPackageClassLoaderManager().getLoaderForClass(
                      arrayStripped);

                if (cl instanceof WekaPackageLibIsolatingClassLoader) {
                  // might be third-party classes involved, store the
                  // classloader
                  m_thirdPartyLoaders
                    .add((WekaPackageLibIsolatingClassLoader) cl);
                }

                Class<?> result = null;
                try {
                  result = Class.forName(desc.getName(), true, cl);
                } catch (ClassNotFoundException ex) {
                  for (WekaPackageLibIsolatingClassLoader l : m_thirdPartyLoaders) {
                    ClassLoader checked =
                      SerializationHelper.checkForThirdPartyClass(arrayStripped, l);
                    if (checked != null) {
                      result = Class.forName(desc.getName(), true, checked);
                    }
                  }
                }

                if (result == null) {
                  throw new ClassNotFoundException("Unable to find class "
                    + arrayStripped);
                }

                return result;
              }
            };
        toReturn = p.readObject();
<<<<<<< HEAD
=======
=======
   * Returns a serialized object. Uses org.python.util.PythonObjectInputStream 
   * for Jython objects (read 
   * <a href="http://aspn.activestate.com/ASPN/Mail/Message/Jython-users/1001401">here</a>
   * for more details).
   *
   * @return the restored object
   * @exception Exception if the object couldn't be restored
   */ 
  public Object getObject() {

    try {
      ByteArrayInputStream istream = new ByteArrayInputStream(m_storedObjectArray);
      ObjectInputStream p;
      Object toReturn = null;
      if (m_isJython) {
	if (!m_isCompressed)
	  toReturn = Jython.deserialize(new BufferedInputStream(istream));
	else 
	  toReturn = Jython.deserialize(new BufferedInputStream(new GZIPInputStream(istream)));
      }
      else {
	if (!m_isCompressed)
	  p = new ObjectInputStream(new BufferedInputStream(istream));
	else 
	  p = new ObjectInputStream(new BufferedInputStream(new GZIPInputStream(istream)));
	toReturn = p.readObject();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      istream.close();
      return toReturn;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
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
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 13986 $");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.12 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
