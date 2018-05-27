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
 * AllJavadoc.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012,2015 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012,2015 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.core;

import java.util.HashSet;
import java.util.Vector;

/**
 * Applies all known Javadoc-derived classes to a source file.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * <!-- options-start --> Valid options are:
 * <br><br>
 * 
 * <pre>
 * -W &lt;classname&gt;
 *  The class to load.
 * </pre>
 * 
 * <pre>
 * -nostars
 *  Suppresses the '*' in the Javadoc.
 * </pre>
 * 
 * <pre>
 * -dir &lt;dir&gt;
 *  The directory above the package hierarchy of the class.
 * </pre>
 * 
 * <pre>
 * -silent
 *  Suppresses printing in the console.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 11736 $
 */
public class AllJavadoc extends Javadoc {

  /** contains all the */
  protected static Vector<Javadoc> m_Javadocs;
<<<<<<< HEAD
=======
=======
 *
 <!-- options-start -->
 * Valid options are: <p/>
 *
 * <pre> -W &lt;classname&gt;
 *  The class to load.</pre>
 *
 * <pre> -nostars
 *  Suppresses the '*' in the Javadoc.</pre>
 *
 * <pre> -dir &lt;dir&gt;
 *  The directory above the package hierarchy of the class.</pre>
 *
 * <pre> -silent
 *  Suppresses printing in the console.</pre>
 *
 <!-- options-end -->
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 6110 $
 */
public class AllJavadoc
  extends Javadoc {

  /** contains all the  */
  protected static Vector m_Javadocs;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** determine all classes derived from Javadoc and instantiate them */
  static {
    // get all classnames, besides this one
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    HashSet<String> set = new HashSet<String>(ClassDiscovery.find(
      Javadoc.class, Javadoc.class.getPackage().getName()));
    if (set.contains(AllJavadoc.class.getName())) {
      set.remove(AllJavadoc.class.getName());
    }

    // instantiate them
    m_Javadocs = new Vector<Javadoc>();
    for (String classname : set) {
      try {
        Class<?> cls = Class.forName(classname);
        m_Javadocs.add((Javadoc) cls.newInstance());
      } catch (Exception e) {
        e.printStackTrace();
<<<<<<< HEAD
=======
=======
    HashSet<String> set = new HashSet<String>(ClassDiscovery.find(Javadoc.class, Javadoc.class.getPackage().getName()));
    if (set.contains(AllJavadoc.class.getName()))
      set.remove(AllJavadoc.class.getName());

    // instantiate them
    m_Javadocs = new Vector<Javadoc>();
    for (String classname: set) {
      try {
	Class cls = Class.forName(classname);
	m_Javadocs.add((Javadoc)cls.newInstance());
      }
      catch (Exception e) {
	e.printStackTrace();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * sets the classname of the class to generate the Javadoc for
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param value the new classname
   */
  @Override
  public void setClassname(String value) {
    super.setClassname(value);
    for (int i = 0; i < m_Javadocs.size(); i++) {
      m_Javadocs.get(i).setClassname(value);
    }
<<<<<<< HEAD
=======
=======
   *
   * @param value	the new classname
   */
  public void setClassname(String value) {
    super.setClassname(value);
    for (int i = 0; i < m_Javadocs.size(); i++)
      ((Javadoc) m_Javadocs.get(i)).setClassname(value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * sets whether to prefix the Javadoc with "*"
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param value true if stars are to be used
   */
  @Override
  public void setUseStars(boolean value) {
    super.setUseStars(value);
    for (int i = 0; i < m_Javadocs.size(); i++) {
      m_Javadocs.get(i).setUseStars(value);
    }
<<<<<<< HEAD
=======
=======
   *
   * @param value	true if stars are to be used
   */
  public void setUseStars(boolean value) {
    super.setUseStars(value);
    for (int i = 0; i < m_Javadocs.size(); i++)
      ((Javadoc) m_Javadocs.get(i)).setUseStars(value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * sets whether to suppress output in the console
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param value true if output is to be suppressed
   */
  @Override
  public void setSilent(boolean value) {
    super.setSilent(value);
    for (int i = 0; i < m_Javadocs.size(); i++) {
      m_Javadocs.get(i).setSilent(value);
    }
<<<<<<< HEAD
=======
=======
   *
   * @param value	true if output is to be suppressed
   */
  public void setSilent(boolean value) {
    super.setSilent(value);
    for (int i = 0; i < m_Javadocs.size(); i++)
      ((Javadoc) m_Javadocs.get(i)).setSilent(value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * generates and returns the Javadoc for the specified start/end tag pair.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param index the index in the start/end tag array
   * @return the generated Javadoc
   * @throws Exception in case the generation fails
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param index	the index in the start/end tag array
   * @return		the generated Javadoc
   * @throws Exception 	in case the generation fails
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected String generateJavadoc(int index) throws Exception {
    throw new Exception("Not used!");
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * updates the Javadoc in the given source code, using all the found Javadoc
   * updaters.
   * 
   * @param content the source code
   * @return the updated source code
   * @throws Exception in case the generation fails
   */
  @Override
  protected String updateJavadoc(String content) throws Exception {
    String result;
    int i;
<<<<<<< HEAD
=======
=======
   * updates the Javadoc in the given source code, using all the found
   * Javadoc updaters.
   *
   * @param content	the source code
   * @return		the updated source code
   * @throws Exception 	in case the generation fails
   */
  protected String updateJavadoc(String content) throws Exception {
    String	result;
    int		i;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    result = content;

    for (i = 0; i < m_Javadocs.size(); i++) {
<<<<<<< HEAD
      result = m_Javadocs.get(i).updateJavadoc(result);
=======
<<<<<<< HEAD
      result = m_Javadocs.get(i).updateJavadoc(result);
=======
      result = ((Javadoc) m_Javadocs.get(i)).updateJavadoc(result);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    return result;
  }

  /**
   * Returns the revision string.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11736 $");
<<<<<<< HEAD
=======
=======
   *
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 6110 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Parses the given commandline parameters and generates the Javadoc.
<<<<<<< HEAD
   * 
   * @param args the commandline parameters for the object
=======
<<<<<<< HEAD
   * 
   * @param args the commandline parameters for the object
=======
   *
   * @param args	the commandline parameters for the object
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    runJavadoc(new AllJavadoc(), args);
  }
}
