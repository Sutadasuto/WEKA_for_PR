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
 * XStream.java
<<<<<<< HEAD
 * Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.core.xml;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

/**
 * This class is a helper class for XML serialization using <a
 * href="http://xstream.codehaus.org" target="_blank">XStream</a> . XStream does
 * not need to be present, since the class-calls are done generically via
 * Reflection.
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org)
 * @version $Revision: 10203 $
 */
public class XStream implements RevisionHandler {

  /**
   * indicates whether <a href="http://xstream.codehaus.org"
   * target="_blank">XStream</a> is present
<<<<<<< HEAD
=======
=======
/**
 * This class is a helper class for XML serialization using 
 * <a href="http://xstream.codehaus.org" target="_blank">XStream</a> .
 * XStream does not need to be present, since the class-calls are done generically via Reflection.
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org)
 * @version $Revision: 5562 $
 */
public class XStream
  implements RevisionHandler {

  /**
   * indicates whether <a href="http://xstream.codehaus.org" target="_blank">XStream</a> 
   * is present
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected static boolean m_Present = false;

  /** the extension for XStream files (including '.') */
  public final static String FILE_EXTENSION = ".xstream";
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** check for XStream statically (needs only to be done once) */
  static {
    checkForXStream();
  }

  /**
   * checks whether the XStream is present in the class path
   */
  private static void checkForXStream() {
    try {
      Class.forName("com.thoughtworks.xstream.XStream");
      m_Present = true;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception e) {
      m_Present = false;
    }
  }

  /**
   * returns whether XStream is present or not, i.e. whether the classes are in
   * the classpath or not
   * 
<<<<<<< HEAD
=======
=======
    }
    catch (Exception e) {
      m_Present = false;
    }
  }
  
  /**
   * returns whether XStream is present or not, i.e. whether the classes are in the
   * classpath or not
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return whether XStream is available
   */
  public static boolean isPresent() {
    return m_Present;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Serializes the supplied object xml
   * 
<<<<<<< HEAD
=======
=======
 
  /**
   * Serializes the supplied object xml
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param toSerialize the object to serialize
   * @return the serialized object as an XML string
   * @throws Exception if something goes wrong
   */
  public static String serialize(Object toSerialize) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Class<?> xstreamClass;
    java.lang.reflect.Constructor<?> constructor;
    Object xstream;
    Class<?>[] serializeArgsClasses = new Class[1];
    Object[] serializeArgs = new Object[1];
    java.lang.reflect.Method methodSerialize;
    String result;

<<<<<<< HEAD
=======
=======
    Class xstreamClass;
    java.lang.reflect.Constructor constructor;
    Object xstream;
    Class [] serializeArgsClasses = new Class[1];
    Object [] serializeArgs = new Object[1];
    java.lang.reflect.Method methodSerialize;
    String result;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    xstreamClass = Class.forName("com.thoughtworks.xstream.XStream");
    constructor = xstreamClass.getConstructor();
    xstream = constructor.newInstance();

    serializeArgsClasses[0] = Object.class;
    serializeArgs[0] = toSerialize;
    methodSerialize = xstreamClass.getMethod("toXML", serializeArgsClasses);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // execute it
    try {
      result = (String) methodSerialize.invoke(xstream, serializeArgs);
<<<<<<< HEAD
=======
=======
    
    // execute it
    try {
      result = (String)methodSerialize.invoke(xstream, serializeArgs);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      result = null;
    }

    return result;
  }

<<<<<<< HEAD
  /**
   * writes the XML-serialized object to the given file
   * 
=======
<<<<<<< HEAD
  /**
   * writes the XML-serialized object to the given file
   * 
=======
 /**
   * writes the XML-serialized object to the given file
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param filename the file to serialize the object to
   * @param o the object to write to the file
   * @return whether writing was successful or not
   * @throws Exception if something goes wrong while writing to the file
   */
  public static boolean write(String filename, Object o) throws Exception {
    return write(new File(filename), o);
  }

  /**
   * write the XML-serialized object to the given file
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param file the file to serialize the object to
   * @param o the object to write to the file
   * @return whether writing was successful or not
   * @throws Exception if something goes wrong while writing to the file
   */
  public static boolean write(File file, Object o) throws Exception {
    return write(new BufferedOutputStream(new FileOutputStream(file)), o);
  }

  /**
   * writes the XML-serialized object to the given output stream
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param stream the output stream
   * @param o the object to write
   * @return true if everything goes ok
   */
  public static boolean write(OutputStream stream, Object o) throws Exception {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Class<?> xstreamClass;
    java.lang.reflect.Constructor<?> constructor;
    Object xstream;
    Class<?>[] serializeArgsClasses = new Class[2];
    Object[] serializeArgs = new Object[2];
    java.lang.reflect.Method methodSerialize;
    boolean result = false;

<<<<<<< HEAD
=======
=======
    Class xstreamClass;
    java.lang.reflect.Constructor constructor;
    Object xstream;
    Class [] serializeArgsClasses = new Class[2];
    Object [] serializeArgs = new Object[2];
    java.lang.reflect.Method methodSerialize;
    boolean result = false;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    xstreamClass = Class.forName("com.thoughtworks.xstream.XStream");
    constructor = xstreamClass.getConstructor();
    xstream = constructor.newInstance();

    serializeArgsClasses[0] = Object.class;
    serializeArgsClasses[1] = OutputStream.class;
    serializeArgs[0] = o;
    serializeArgs[1] = stream;
    methodSerialize = xstreamClass.getMethod("toXML", serializeArgsClasses);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // execute it
    try {
      methodSerialize.invoke(xstream, serializeArgs);
      result = true;
    } catch (Exception ex) {
      result = false;
    }

    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * writes the XML-serialized object to the given Writer.
   * 
   * @param writer the Writer
   * @param toSerialize the object to write
   * @return true if everything goes ok
   * @throws Exception if something goes wrong
   */
  public static boolean write(Writer writer, Object toSerialize)
    throws Exception {
    Class<?> xstreamClass;
    java.lang.reflect.Constructor<?> constructor;
    Object xstream;
    Class<?>[] serializeArgsClasses = new Class[2];
    Object[] serializeArgs = new Object[2];
    java.lang.reflect.Method methodSerialize;
    boolean result = false;

<<<<<<< HEAD
=======
=======
   * writes the XML-serialized object to the given Writer
   *
   * @param writer the Writer
   * @param o the object to write
   * @return true if everything goes ok
   */
  public static boolean write(Writer writer, Object toSerialize) throws Exception {
    Class xstreamClass;
    java.lang.reflect.Constructor constructor;
    Object xstream;
    Class [] serializeArgsClasses = new Class[2];
    Object [] serializeArgs = new Object[2];
    java.lang.reflect.Method methodSerialize;
    boolean result = false;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    xstreamClass = Class.forName("com.thoughtworks.xstream.XStream");
    constructor = xstreamClass.getConstructor();
    xstream = constructor.newInstance();

    serializeArgsClasses[0] = Object.class;
    serializeArgsClasses[1] = Writer.class;
    serializeArgs[0] = toSerialize;
    serializeArgs[1] = writer;
    methodSerialize = xstreamClass.getMethod("toXML", serializeArgsClasses);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // execute it
    try {
      methodSerialize.invoke(xstream, serializeArgs);
      result = true;
    } catch (Exception ex) {
      result = false;
    }

    return result;
  }

  /**
   * reads the XML-serialized object from the given file
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param filename the file to deserialize the object from
   * @return the deserialized object
   * @throws Exception if something goes wrong while reading from the file
   */
  public static Object read(String filename) throws Exception {
    return read(new File(filename));
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * reads the XML-serialized object from the given file
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * reads the XML-serialized object from the given file
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param file the file to deserialize the object from
   * @return the deserialized object
   * @throws Exception if something goes wrong while reading from the file
   */
  public static Object read(File file) throws Exception {
    return read(new BufferedInputStream(new FileInputStream(file)));
  }

  /**
   * reads the XML-serialized object from the given input stream
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param stream the input stream
   * @return the deserialized object
   * @throws Exception if something goes wrong while reading from stream
   */
  public static Object read(InputStream stream) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Class<?> xstreamClass;
    java.lang.reflect.Constructor<?> constructor;
    Object xstream;
    Class<?>[] deSerializeArgsClasses = new Class[1];
    Object[] deSerializeArgs = new Object[1];
<<<<<<< HEAD
=======
=======
    Class xstreamClass;
    java.lang.reflect.Constructor constructor;
    Object xstream;
    Class [] deSerializeArgsClasses = new Class[1];
    Object [] deSerializeArgs = new Object[1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    java.lang.reflect.Method methodDeSerialize;
    Object result;

    xstreamClass = Class.forName("com.thoughtworks.xstream.XStream");
    constructor = xstreamClass.getConstructor();
    xstream = constructor.newInstance();

    deSerializeArgsClasses[0] = InputStream.class;
    deSerializeArgs[0] = stream;
<<<<<<< HEAD
    methodDeSerialize = xstreamClass.getMethod("fromXML",
      deSerializeArgsClasses);
=======
<<<<<<< HEAD
    methodDeSerialize = xstreamClass.getMethod("fromXML",
      deSerializeArgsClasses);
=======
    methodDeSerialize = xstreamClass.getMethod("fromXML", deSerializeArgsClasses);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // execute it
    try {
      result = methodDeSerialize.invoke(xstream, deSerializeArgs);
    } catch (Exception ex) {
      ex.printStackTrace();
      result = null;
    }

    return result;
  }

  /**
   * reads the XML-serialized object from the given Reader
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r the reader
   * @return the deserialized object
   * @throws Exception if something goes wrong while reading from stream
   */
  public static Object read(Reader r) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Class<?> xstreamClass;
    java.lang.reflect.Constructor<?> constructor;
    Object xstream;
    Class<?>[] deSerializeArgsClasses = new Class[1];
    Object[] deSerializeArgs = new Object[1];
<<<<<<< HEAD
=======
=======
    Class xstreamClass;
    java.lang.reflect.Constructor constructor;
    Object xstream;
    Class [] deSerializeArgsClasses = new Class[1];
    Object [] deSerializeArgs = new Object[1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    java.lang.reflect.Method methodDeSerialize;
    Object result;

    xstreamClass = Class.forName("com.thoughtworks.xstream.XStream");
    constructor = xstreamClass.getConstructor();
    xstream = constructor.newInstance();

    deSerializeArgsClasses[0] = Reader.class;
    deSerializeArgs[0] = r;
<<<<<<< HEAD
    methodDeSerialize = xstreamClass.getMethod("fromXML",
      deSerializeArgsClasses);
=======
<<<<<<< HEAD
    methodDeSerialize = xstreamClass.getMethod("fromXML",
      deSerializeArgsClasses);
=======
    methodDeSerialize = xstreamClass.getMethod("fromXML", deSerializeArgsClasses);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // execute it
    try {
      result = methodDeSerialize.invoke(xstream, deSerializeArgs);
    } catch (Exception ex) {
      ex.printStackTrace();
      result = null;
    }

    return result;
  }

  /**
   * Deserializes an object from the supplied XML string
   * 
   * @param xmlString the XML to deserialize from
   * @return the deserialized object
   * @throws Exception if something goes wrong
   */
  public static Object deSerialize(String xmlString) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Class<?> xstreamClass;
    java.lang.reflect.Constructor<?> constructor;
    Object xstream;
    Class<?>[] deSerializeArgsClasses = new Class[1];
    Object[] deSerializeArgs = new Object[1];
<<<<<<< HEAD
=======
=======
    Class xstreamClass;
    java.lang.reflect.Constructor constructor;
    Object xstream;
    Class [] deSerializeArgsClasses = new Class[1];
    Object [] deSerializeArgs = new Object[1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    java.lang.reflect.Method methodDeSerialize;
    Object result;

    xstreamClass = Class.forName("com.thoughtworks.xstream.XStream");
    constructor = xstreamClass.getConstructor();
    xstream = constructor.newInstance();

    deSerializeArgsClasses[0] = String.class;
    deSerializeArgs[0] = xmlString;
<<<<<<< HEAD
    methodDeSerialize = xstreamClass.getMethod("fromXML",
      deSerializeArgsClasses);
=======
<<<<<<< HEAD
    methodDeSerialize = xstreamClass.getMethod("fromXML",
      deSerializeArgsClasses);
=======
    methodDeSerialize = xstreamClass.getMethod("fromXML", deSerializeArgsClasses);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // execute it
    try {
      result = methodDeSerialize.invoke(xstream, deSerializeArgs);
    } catch (Exception ex) {
      ex.printStackTrace();
      result = null;
    }

    return result;
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
    return RevisionUtils.extract("$Revision: 10203 $");
  }
}
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5562 $");
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
