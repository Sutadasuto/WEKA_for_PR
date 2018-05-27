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
 *    ExtensionFileFilter.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.gui;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;

import javax.swing.filechooser.FileFilter;

/**
 * Provides a file filter for FileChoosers that accepts or rejects files based
 * on their extension. Compatible with both java.io.FilenameFilter and
 * javax.swing.filechooser.FileFilter (why there are two I have no idea).
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10216 $
 */
public class ExtensionFileFilter extends FileFilter implements FilenameFilter,
  Serializable {

  /** Added ID to avoid warning. */
  private static final long serialVersionUID = -5960622841390665131L;
<<<<<<< HEAD
=======
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.gui;

import java.io.File;
import java.io.Serializable;
import java.io.FilenameFilter;
import javax.swing.filechooser.FileFilter;

/**
 * Provides a file filter for FileChoosers that accepts or rejects files
 * based on their extension. Compatible with both java.io.FilenameFilter and
 * javax.swing.filechooser.FileFilter (why there are two I have no idea).
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 1.8 $
 */
public class ExtensionFileFilter
  extends FileFilter
  implements FilenameFilter, Serializable {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The text description of the types of files accepted */
  protected String m_Description;

  /** The filename extensions of accepted files */
  protected String[] m_Extension;

  /**
   * Creates the ExtensionFileFilter
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param extension the extension of accepted files.
   * @param description a text description of accepted files.
   */
  public ExtensionFileFilter(String extension, String description) {
<<<<<<< HEAD
    m_Extension = new String[1];
=======
<<<<<<< HEAD
    m_Extension = new String[1];
=======
    m_Extension = new String [1];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Extension[0] = extension;
    m_Description = description;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Creates an ExtensionFileFilter that accepts files that have any of the
   * extensions contained in the supplied array.
   * 
   * @param extensions an array of acceptable file extensions (as Strings).
   * @param description a text description of accepted files.
   */
  public ExtensionFileFilter(String[] extensions, String description) {
    m_Extension = extensions;
    m_Description = description;
  }

  /**
   * Gets the description of accepted files.
   * 
   * @return the description.
   */
  @Override
  public String getDescription() {

    return m_Description;
  }

<<<<<<< HEAD
=======
=======
   * Creates an ExtensionFileFilter that accepts files that have any of
   * the extensions contained in the supplied array.
   *
   * @param extensions an array of acceptable file extensions (as Strings).
   * @param description a text description of accepted files.
   */
  public ExtensionFileFilter(String [] extensions, String description) {
    m_Extension = extensions;
    m_Description = description;
  }
  
  /**
   * Gets the description of accepted files.
   *
   * @return the description.
   */
  public String getDescription() {
    
    return m_Description;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns a copy of the acceptable extensions.
   * 
   * @return the accepted extensions
   */
  public String[] getExtensions() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_Extension.clone();
  }

  /**
   * Returns true if the supplied file should be accepted (i.e.: if it has the
   * required extension or is a directory).
   * 
   * @param file the file of interest.
   * @return true if the file is accepted by the filter.
   */
  @Override
  public boolean accept(File file) {

<<<<<<< HEAD
=======
=======
    return (String[]) m_Extension.clone();
  }
  
  /**
   * Returns true if the supplied file should be accepted (i.e.: if it
   * has the required extension or is a directory).
   *
   * @param file the file of interest.
   * @return true if the file is accepted by the filter.
   */
  public boolean accept(File file) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String name = file.getName().toLowerCase();
    if (file.isDirectory()) {
      return true;
    }
<<<<<<< HEAD
    for (String element : m_Extension) {
      if (name.endsWith(element)) {
        return true;
=======
<<<<<<< HEAD
    for (String element : m_Extension) {
      if (name.endsWith(element)) {
        return true;
=======
    for (int i = 0; i < m_Extension.length; i++) {
      if (name.endsWith(m_Extension[i])) {
	return true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return false;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns true if the file in the given directory with the given name should
   * be accepted.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns true if the file in the given directory with the given name
   * should be accepted.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param dir the directory where the file resides.
   * @param name the name of the file.
   * @return true if the file is accepted.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean accept(File dir, String name) {
    return accept(new File(dir, name));
  }
}
