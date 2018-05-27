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
 * VisualizePanel.java
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

package weka.gui.explorer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Defaults;
import weka.core.Instances;
import weka.core.Settings;
import weka.gui.AbstractPerspective;
import weka.gui.PerspectiveInfo;
import weka.gui.explorer.Explorer.ExplorerPanel;
import weka.gui.visualize.MatrixPanel;
import weka.gui.visualize.VisualizeUtils;
<<<<<<< HEAD
=======
=======
import weka.core.Instances;
import weka.gui.explorer.Explorer.ExplorerPanel;
import weka.gui.visualize.MatrixPanel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import java.awt.BorderLayout;

/**
 * A slightly extended MatrixPanel for better support in the Explorer.
 * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 12391 $
 * @see MatrixPanel
 */
@PerspectiveInfo(ID = "weka.gui.workbench.visualizepanel", title = "Visualize",
  toolTipText = "Explore the data",
  iconPath = "weka/gui/weka_icon_new_small.png")
public class VisualizePanel extends AbstractPerspective implements
  ExplorerPanel {

<<<<<<< HEAD
=======
=======
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7059 $
 * @see MatrixPanel
 */
public class VisualizePanel
  extends MatrixPanel
  implements ExplorerPanel {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  private static final long serialVersionUID = 6084015036853918846L;

  /** the parent frame */
  protected Explorer m_Explorer = null;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected MatrixPanel m_matrixPanel = new MatrixPanel();

  /** True if a set of instances has been set on the panel */
  protected boolean m_hasInstancesSet;

  public VisualizePanel() {
    setLayout(new BorderLayout());
    add(m_matrixPanel, BorderLayout.CENTER);
  }

  @Override
  public void setInstances(Instances instances) {
    m_matrixPanel.setInstances(instances);
    m_hasInstancesSet = true;
  }

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Sets the Explorer to use as parent frame (used for sending notifications
   * about changes in the data)
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param parent the parent frame
   */
  @Override
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }

  /**
   * returns the parent Explorer frame
   * 
   * @return the parent
   */
  @Override
  public Explorer getExplorer() {
    return m_Explorer;
  }

  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return the title of this tab
   */
  @Override
  public String getTabTitle() {
    return "Visualize";
  }

  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return the tooltip of this tab
   */
  @Override
  public String getTabTitleToolTip() {
    return "Explore the data";
  }

  /**
   * This perspective processes instances
   *
   * @return true, as this perspective accepts instances
   */
  @Override
  public boolean acceptsInstances() {
    return true;
  }

  /**
   * Default settings for the scatter plot
   *
   * @return default settings
   */
  @Override
  public Defaults getDefaultSettings() {
    Defaults d = new ScatterDefaults();
    d.add(new VisualizeUtils.VisualizeDefaults());
    return d;
  }

  @Override
  public boolean okToBeActive() {
    return m_hasInstancesSet;
  }

  /**
   * Make sure current settings are applied when this panel becomes active
   *
   * @param active true if this panel is the visible (active) one
   */
  @Override
  public void setActive(boolean active) {
    super.setActive(active);
    if (m_isActive) {
      settingsChanged();
    }
  }

  @Override
  public void settingsChanged() {
    if (getMainApplication() != null) {
      m_matrixPanel.applySettings(m_mainApplication.getApplicationSettings(),
        ScatterDefaults.ID);
      if (m_isActive) {
        m_matrixPanel.updatePanel();
      }
    }
  }

  /**
   * Default settings specific to the {@code MatrixPanel} that provides the
   * scatter plot matrix
   */
  public static class ScatterDefaults extends Defaults {
    public static final String ID = "weka.gui.workbench.visualizepanel";

    public static final Settings.SettingKey POINT_SIZE_KEY =
      new Settings.SettingKey(ID + ".pointSize",
        "Point size for scatter plots", "");
    public static final int POINT_SIZE = 1;

    public static final Settings.SettingKey PLOT_SIZE_KEY =
      new Settings.SettingKey(ID + ".plotSize",
        "Size (in pixels) of the cells in the matrix", "");
    public static final int PLOT_SIZE = 100;

    public static final long serialVersionUID = -6890761195767034507L;

    public ScatterDefaults() {
      super(ID);

      m_defaults.put(POINT_SIZE_KEY, POINT_SIZE);
      m_defaults.put(PLOT_SIZE_KEY, PLOT_SIZE);
    }
<<<<<<< HEAD
=======
=======
   * @param parent	the parent frame
   */
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }
  
  /**
   * returns the parent Explorer frame
   * 
   * @return		the parent
   */
  public Explorer getExplorer() {
    return m_Explorer;
  }
  
  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return 		the title of this tab
   */
  public String getTabTitle() {
    return Messages.getInstance().getString("VisualizePanel_GetTabTitle_Text");
  }
  
  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return 		the tooltip of this tab
   */
  public String getTabTitleToolTip() {
    return Messages.getInstance().getString("VisualizePanel_GetTabTitleToolTip_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tests out the visualize panel from the command line.
   *
   * @param args may optionally contain the name of a dataset to load.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static void main(String[] args) {

    try {
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Visualize");
<<<<<<< HEAD
=======
=======
  public static void main(String [] args) {

    try {
      final javax.swing.JFrame jf =
	new javax.swing.JFrame(Messages.getInstance().getString("VisualizePanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      final VisualizePanel sp = new VisualizePanel();
      jf.getContentPane().add(sp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
<<<<<<< HEAD
=======
=======
	public void windowClosing(java.awt.event.WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
      jf.pack();
      jf.setSize(800, 600);
      jf.setVisible(true);
      if (args.length == 1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        System.err.println("Loading instances from " + args[0]);
        java.io.Reader r =
          new java.io.BufferedReader(new java.io.FileReader(args[0]));
        Instances i = new Instances(r);
        sp.setInstances(i);
<<<<<<< HEAD
=======
=======
	System.err.println(Messages.getInstance().getString("VisualizePanel_Main_Error_Text") + args[0]);
	java.io.Reader r = new java.io.BufferedReader(
			   new java.io.FileReader(args[0]));
	Instances i = new Instances(r);
	sp.setInstances(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
