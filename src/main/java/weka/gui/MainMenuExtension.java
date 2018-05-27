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
 * MainMenuExtension.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.gui;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * Classes implementing this interface will be displayed in the "Extensions"
 * menu in the main GUI of Weka.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.1 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public interface MainMenuExtension {
  
  /**
   * Returns the name of the submenu. If there is no submenu necessary then 
   * the return value is null.
   * 
   * @return		the title of the submenu or null if no submenu
   */
  public String getSubmenuTitle();
  
  /**
   * Returns the name of the menu item.
   * 
   * @return		the name of the menu item.
   */
  public String getMenuTitle();
  
  /**
   * If the extension has a custom ActionListener for the menu item, then it
   * must be returned here. Having a custom <code>ActionListener</code> also 
   * means that the component handles any frame by itself.
   * 
   * @param owner 	the owner of potential dialogs
   * @return		a custom ActionListener, can be null
   * @see		#fillFrame(Component)
   */
  public ActionListener getActionListener(JFrame owner);
  
  /**
   * Fills the frame with life, like adding components, window listeners,
   * setting size, location, etc. The frame object can be either derived from 
   * <code>JFrame</code> or from <code>JInternalFrame</code>. This method is 
   * only called in case <code>getActionListener()</code> returns null.
   * 
   * @param frame	the frame object to embed components, etc.
   * @see		#getActionListener(JFrame)
   * @see		javax.swing.JFrame
   * @see		javax.swing.JInternalFrame
   */
  public void fillFrame(Component frame);
}
