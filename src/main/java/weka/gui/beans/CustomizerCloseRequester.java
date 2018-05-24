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
 *    CustomizerCloseRequester.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.awt.Window;
=======
import javax.swing.JFrame;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

/**
 * Customizers who want to be able to close the customizer window
 * themselves can implement this window. The KnowledgeFlow will
<<<<<<< HEAD
 * pass in the reference to the parent Window when constructing
=======
 * pass in the reference to the parent JFrame when constructing
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * the customizer. The customizer can then call dispose() the
 * Frame whenever it suits them.
 *
 * @author Mark Hall
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.2 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public interface CustomizerCloseRequester {

  /**
   * A reference to the parent is passed in
   *
<<<<<<< HEAD
   * @param parent the parent Window
   */
  void setParentWindow(Window parent);
=======
   * @param parent the parent frame
   */
  void setParentFrame(JFrame parent);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
}
