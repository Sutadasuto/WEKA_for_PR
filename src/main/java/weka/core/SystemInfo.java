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
 *    SystemInfo.java
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */
package weka.core;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.gui.LookAndFeel;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.LookAndFeel;

/**
 * This class prints some information about the system setup, like Java version,
 * JVM settings etc. Useful for Bug-Reports.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public class SystemInfo implements RevisionHandler {

  /** for storing the information */
  private Hashtable<String, String> m_Info = null;

<<<<<<< HEAD
=======
=======
/**
 * This class prints some information about the system setup, like Java
 * version, JVM settings etc. Useful for Bug-Reports.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.5 $
 */
public class SystemInfo
  implements RevisionHandler {
  
  /** for storing the information */
  private Hashtable m_Info = null;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * initializes the object and reads the system information
   */
  public SystemInfo() {
<<<<<<< HEAD
    m_Info = new Hashtable<String, String>();
=======
<<<<<<< HEAD
    m_Info = new Hashtable<String, String>();
=======
    m_Info = new Hashtable();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    readProperties();
  }

  /**
   * reads all the properties and stores them in the hashtable
   */
  private void readProperties() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Properties props;
    Enumeration<?> enm;
    String name;
    String[] laf;
    String tmpStr;
    int i;
    Memory mem;

<<<<<<< HEAD
=======
=======
    Properties          props;
    Enumeration         enm;
    Object              name;
    String[]            laf;
    String              tmpStr;
    int                 i;
    Memory              mem;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Info.clear();

    // System information
    props = System.getProperties();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    enm = props.propertyNames();
    while (enm.hasMoreElements()) {
      name = (String) enm.nextElement();
      m_Info.put(name, (String) props.get(name));
<<<<<<< HEAD
=======
=======
    enm   = props.propertyNames();
    while (enm.hasMoreElements()) {
      name = enm.nextElement();
      m_Info.put(name, props.get(name));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // additional WEKA info
    m_Info.put("weka.version", Version.VERSION);

    // look and feel info
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    laf = LookAndFeel.getInstalledLookAndFeels();
    tmpStr = "";
    for (i = 0; i < laf.length; i++) {
      if (i > 0) {
        tmpStr += ",";
      }
<<<<<<< HEAD
=======
=======
    laf    = LookAndFeel.getInstalledLookAndFeels();
    tmpStr = "";
    for (i = 0; i < laf.length; i++) {
      if (i > 0)
        tmpStr += ",";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      tmpStr += laf[i];
    }
    m_Info.put("ui.installedLookAndFeels", tmpStr);
    m_Info.put("ui.currentLookAndFeel", LookAndFeel.getSystemLookAndFeel());

    // memory info
    mem = new Memory();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Info.put("memory.initial",
      "" + Utils.doubleToString(Memory.toMegaByte(mem.getInitial()), 1) + "MB"
        + " (" + mem.getInitial() + ")");
    m_Info.put("memory.max",
      "" + Utils.doubleToString(Memory.toMegaByte(mem.getMax()), 1) + "MB"
<<<<<<< HEAD
=======
=======
    m_Info.put(
        "memory.initial", 
        "" + Utils.doubleToString(Memory.toMegaByte(mem.getInitial()), 1) + "MB" 
        + " (" + mem.getInitial() + ")");
    m_Info.put(
        "memory.max", 
        "" + Utils.doubleToString(Memory.toMegaByte(mem.getMax()), 1) + "MB"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        + " (" + mem.getMax() + ")");
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * returns a copy of the system info. the key is the name of the property and
   * the associated object is the value of the property (a string).
   */
  public Hashtable<String, String> getSystemInfo() {
    return new Hashtable<String, String>(m_Info);
<<<<<<< HEAD
=======
=======
   * returns a copy of the system info. the key is the name of the property
   * and the associated object is the value of the property (a string).
   */
  public Hashtable getSystemInfo() {
    return (Hashtable) m_Info.clone();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns a string representation of all the system properties
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String toString() {
    Enumeration<String> enm;
    String result;
    String key;
    Vector<String> keys;
    int i;
    String value;

    result = "";
    keys = new Vector<String>();

    // get names and sort them
    enm = m_Info.keys();
    while (enm.hasMoreElements()) {
      keys.add(enm.nextElement());
    }
    Collections.sort(keys);

    // generate result
    for (i = 0; i < keys.size(); i++) {
      key = keys.get(i).toString();
      value = m_Info.get(key).toString();
      if (key.equals("line.separator")) {
        value = Utils.backQuoteChars(value);
      }
<<<<<<< HEAD
=======
=======
  public String toString() {
    Enumeration     enm;
    String          result;
    String          key;
    Vector          keys;
    int             i;
    String          value;

    result = "";
    keys   = new Vector();
    
    // get names and sort them
    enm = m_Info.keys();
    while (enm.hasMoreElements())
      keys.add(enm.nextElement());
    Collections.sort(keys);
    
    // generate result
    for (i = 0; i < keys.size(); i++) {
      key   = keys.get(i).toString();
      value = m_Info.get(key).toString();
      if (key.equals("line.separator"))
        value = Utils.backQuoteChars(value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      result += key + ": " + value + "\n";
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
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.5 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * for printing the system info to stdout.
   */
  public static void main(String[] args) {
    System.out.println(new SystemInfo());
  }
}
