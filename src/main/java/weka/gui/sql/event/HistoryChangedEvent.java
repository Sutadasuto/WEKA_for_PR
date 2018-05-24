/*
<<<<<<< HEAD
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
 */

/*
 * HistoryChangedEvent.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.sql.event;

import java.util.EventObject;

import javax.swing.DefaultListModel;

/**
 * An event that is generated when a history is modified.
 *
 * @see         HistoryChangedListener
 * @author      FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version     $Revision: 8034 $
=======
 * @version     $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class HistoryChangedEvent
  extends EventObject {

  /** for serialization */
  private static final long serialVersionUID = 7476087315774869973L;
  
  /** the name of the history */
  protected String m_HistoryName;
  
  /** the history model */
  protected DefaultListModel m_History;
  
  /**
   * constructs the event
   * @param name        the name of the history
   * @param history     the model of the history
   */
  public HistoryChangedEvent( Object source, 
                              String name, 
                              DefaultListModel history ) {
    super(source);
    
    m_HistoryName = name;
    m_History     = history;
  }

  /**
   * returns the name of the history
   */
  public String getHistoryName() {
    return m_HistoryName;
  }

  /**
   * returns the history model
   */
  public DefaultListModel getHistory() {
    return m_History;
  }

  /**
   * returns the event in a string representation
   * @return        the event in a string representation
   */
  public String toString() {
    String        result;

    result  = super.toString();
    result  = result.substring(0, result.length() - 1);  // remove "]"
<<<<<<< HEAD
    result +=   ",name=" + getHistoryName() 
=======
    result += ",name=" + getHistoryName() 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              + ",history=" + getHistory()
              + "]";

    return result;
  }
}
