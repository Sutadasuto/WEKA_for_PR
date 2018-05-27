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
 *    SelectedTag.java
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
import java.io.Serializable;
=======
<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.HashSet;

/**
 * Represents a selected value from a finite set of values, where each
 * value is a Tag (i.e. has some string associated with it). Primarily
 * used in schemes to select between alternative behaviours,
 * associating names with the alternative behaviours.
 *
 * @author <a href="mailto:len@reeltwo.com">Len Trigg</a> 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 11718 $
 */
public class SelectedTag
  implements RevisionHandler, Serializable {

  private static final long serialVersionUID = 6947341624626504975L;

<<<<<<< HEAD
=======
=======
 * @version $Revision: 1.11 $
 */
public class SelectedTag
  implements RevisionHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The index of the selected tag */
  protected int m_Selected;
  
  /** The set of tags to choose from */
  protected Tag[] m_Tags;
  
  /**
   * Creates a new <code>SelectedTag</code> instance.
   *
   * @param tagID the id of the selected tag.
   * @param tags an array containing the possible valid Tags.
   * @throws IllegalArgumentException if the selected tag isn't in the array
   * of valid values or the IDs/IDStrs are not unique.
   */
  public SelectedTag(int tagID, Tag[] tags) {
    // are IDs unique?
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    HashSet<Integer> ID = new HashSet<Integer>();
    HashSet<String> IDStr = new HashSet<String>();
    for (int i = 0; i < tags.length; i++) {
      Integer newID = new Integer(tags[i].getID());
      if (!ID.contains(newID)) {
        ID.add(newID);
      } else {
        throw new IllegalArgumentException("The IDs are not unique: " + newID + "!");
      }
      String IDstring = tags[i].getIDStr();
      if (!IDStr.contains(IDstring)) {
        IDStr.add(IDstring);
      } else {
        throw new IllegalArgumentException("The ID strings are not unique: " + IDstring + "!");
      }
    }
<<<<<<< HEAD
=======
=======
    HashSet ID = new HashSet();
    HashSet IDStr = new HashSet();
    for (int i = 0; i < tags.length; i++) {
      ID.add(new Integer(tags[i].getID()));
      IDStr.add(tags[i].getIDStr());
    }
    if (ID.size() != tags.length)
      throw new IllegalArgumentException("The IDs are not unique!");
    if (IDStr.size() != tags.length)
      throw new IllegalArgumentException("The ID strings are not unique!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    for (int i = 0; i < tags.length; i++) {
      if (tags[i].getID() == tagID) {
	m_Selected = i;
	m_Tags = tags;
	return;
      }
    }
    
    throw new IllegalArgumentException("Selected tag is not valid");
  }
  
  /**
   * Creates a new <code>SelectedTag</code> instance.
   *
   * @param tagText the text of the selected tag (case-insensitive).
   * @param tags an array containing the possible valid Tags.
   * @throws IllegalArgumentException if the selected tag isn't in the array
   * of valid values.
   */
  public SelectedTag(String tagText, Tag[] tags) {
    for (int i = 0; i < tags.length; i++) {
      if (    tags[i].getReadable().equalsIgnoreCase(tagText)
	   || tags[i].getIDStr().equalsIgnoreCase(tagText) ) {
        m_Selected = i;
        m_Tags = tags;
        return;
      }
    }
    throw new IllegalArgumentException("Selected tag is not valid");
  }
  
  /**
   * Returns true if this SelectedTag equals another object
   * 
   * @param o the object to compare with
   * @return true if the tags and the selected tag are the same
   */
  public boolean equals(Object o) {
    if ((o == null) || !(o.getClass().equals(this.getClass()))) {
      return false;
    }
    SelectedTag s = (SelectedTag)o;
    if ((s.getTags() == m_Tags)
	&& (s.getSelectedTag() == m_Tags[m_Selected])) {
      return true;
    } else {
      return false;
    }
  }
  
  
  /**
   * Gets the selected Tag.
   *
   * @return the selected Tag.
   */
  public Tag getSelectedTag() {
    return m_Tags[m_Selected];
  }
  
  /**
   * Gets the set of all valid Tags.
   *
   * @return an array containing the valid Tags.
   */
  public Tag[] getTags() {
    return m_Tags;
  }
  
  /**
   * returns the selected tag in string representation
   * 
   * @return the selected tag as string
   */
  public String toString() {
    return getSelectedTag().toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 11718 $");
=======
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 11718 $");
=======
    return RevisionUtils.extract("$Revision: 1.11 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
