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
 *    SimpleCLI.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import weka.gui.scripting.ScriptingPanel;
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

/**
 * Creates a very simple command line for invoking the main method of
 * classes. System.out and System.err are redirected to an output area.
 * Features a simple command history -- use up and down arrows to move
 * through previous commmands. This gui uses only AWT (i.e. no Swing).
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
 */
public class SimpleCLI
  extends JFrame {
  
  /** for serialization. */
  static final long serialVersionUID = -50661410800566036L;
  
  /**
   * Constructor.
=======
 * @version $Revision: 7059 $
 */
public class SimpleCLI
  extends Frame {
  
  /** for serialization */
  static final long serialVersionUID = -50661410800566036L;
  
  /**
   * Constructor
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @throws Exception if an error occurs
   */
  public SimpleCLI() throws Exception {
<<<<<<< HEAD
    SimpleCLIPanel	panel;

    panel = new SimpleCLIPanel();
    
    setLayout(new BorderLayout());
    setTitle(panel.getTitle());
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setIconImage(panel.getIcon().getImage());
    add(panel);
    pack();
    setSize(600, 500);
    setLocationRelativeTo(null);
=======
    setTitle(Messages.getInstance().getString("SimpleCL_SetTitle_Text"));
    setLayout(new BorderLayout());
    add(new SimpleCLIPanel());
    pack();
    setSize(600, 500);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setVisible(true);
  }

  /**
<<<<<<< HEAD
   * Method to start up the simple cli.
   *
   * @param args 	Not used.
   */
  public static void main(String[] args) {
    ScriptingPanel.showPanel(new SimpleCLIPanel(), args, 600, 500);
=======
   * Method to start up the simple cli
   *
   * @param args array of command line arguments. Not used.
   */
  public static void main(String[] args) {
    
    try {
      final SimpleCLI frame = new SimpleCLI();
      frame.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent param1) {
	  System.err.println(Messages.getInstance().getString("SimpleCL_Main_Error_Text"));
	  frame.dispose();
	}
      });
      frame.setVisible(true);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.exit(0);
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
