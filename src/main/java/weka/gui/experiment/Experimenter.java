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
 *    Experimenter.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.experiment;

<<<<<<< HEAD
import weka.core.Memory;
import weka.experiment.Experiment;
import weka.gui.AbstractPerspective;
import weka.gui.LookAndFeel;
import weka.gui.PerspectiveInfo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

<<<<<<< HEAD
=======
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import weka.core.Memory;
import weka.experiment.Experiment;
import weka.gui.LookAndFeel;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * The main class for the experiment environment. Lets the user create, open,
 * save, configure, run experiments, and analyse experimental results.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 12971 $
 */
@PerspectiveInfo(ID = "weka.gui.experimenter", title = "Experiment",
  toolTipText = "Run large scale experiments",
  iconPath = "weka/gui/weka_icon_new_small.png")
public class Experimenter extends AbstractPerspective {
=======
 * @version $Revision: 10438 $
 */
public class Experimenter extends JPanel {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -5751617505738193788L;

  /** The panel for configuring the experiment */
  protected SetupModePanel m_SetupPanel;

  /** The panel for running the experiment */
  protected RunPanel m_RunPanel;

  /** The panel for analysing experimental results */
  protected ResultsPanel m_ResultsPanel;

  /** The tabbed pane that controls which sub-pane we are working with */
  protected JTabbedPane m_TabbedPane = new JTabbedPane();

  /**
   * True if the class attribute is the first attribute for all datasets
   * involved in this experiment.
   */
  protected boolean m_ClassFirst = false;

  /**
   * Creates the experiment environment gui with no initial experiment
   */
<<<<<<< HEAD
  public Experimenter() {
    this(false);
  }

  /**
   * Creates the experiment environment gui with no initial experiment
   */
  public Experimenter(boolean classFirst) {

=======
  public Experimenter(boolean classFirst) {

    System.out.println("[DEBUGGER] ---- "
      + Messages.getInstance().getString(
        "Experimenter_TabbedPane_Setup_Key_Text"));

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_SetupPanel = new SetupModePanel();
    m_ResultsPanel = new ResultsPanel();
    m_RunPanel = new RunPanel();
    m_RunPanel.setResultsPanel(m_ResultsPanel);

    m_ClassFirst = classFirst;

<<<<<<< HEAD
    m_TabbedPane.addTab("Setup", null, m_SetupPanel, "Set up the experiment");
    m_TabbedPane.addTab("Run", null, m_RunPanel, "Run the experiment");
    m_TabbedPane.addTab("Analyse", null, m_ResultsPanel,
      "Analyse experiment results");
=======
    m_TabbedPane.addTab(
      Messages.getInstance()
        .getString("Experimenter_TabbedPane_Setup_Key_Text"),
      null,
      m_SetupPanel,
      Messages.getInstance().getString(
        "Experimenter_TabbedPane_Setup_Value_Text"));
    m_TabbedPane.addTab(
      Messages.getInstance().getString("Experimenter_TabbedPane_Run_Key_Text"),
      null, m_RunPanel,
      Messages.getInstance()
        .getString("Experimenter_TabbedPane_Run_Value_Text"));
    m_TabbedPane.addTab(
      Messages.getInstance().getString(
        "Experimenter_TabbedPane_Analyse_Key_Text"),
      null,
      m_ResultsPanel,
      Messages.getInstance().getString(
        "Experimenter_TabbedPane_Analyse_Value_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_TabbedPane.setSelectedIndex(0);
    m_TabbedPane.setEnabledAt(1, false);
    m_SetupPanel.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent e) {
        // System.err.println("Updated experiment");
        Experiment exp = m_SetupPanel.getExperiment();
<<<<<<< HEAD
        if (exp != null) {
          exp.classFirst(m_ClassFirst);
          m_RunPanel.setExperiment(exp);
          // m_ResultsPanel.setExperiment(exp);
          m_TabbedPane.setEnabledAt(1, true);
        }
=======
        exp.classFirst(m_ClassFirst);
        m_RunPanel.setExperiment(exp);
        // m_ResultsPanel.setExperiment(exp);
        m_TabbedPane.setEnabledAt(1, true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    });
    setLayout(new BorderLayout());
    add(m_TabbedPane, BorderLayout.CENTER);
  }

  /**
<<<<<<< HEAD
   * Gets called if we are running in a {@code GUIApplication}. We pass
   * on a reference to the main perspective to the ResultsPanel here.
   */
  @Override
  public void instantiationComplete() {
    m_ResultsPanel
      .setMainPerspective(getMainApplication().getMainPerspective());
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * variable for the Experimenter class which would be set to null by the
   * memory monitoring thread to free up some memory if we running out of memory
   */
  private static Experimenter m_experimenter;

  /** for monitoring the Memory consumption */
  protected static Memory m_Memory = new Memory(true);

  /**
   * Tests out the experiment environment.
   * 
   * @param args ignored.
   */
  public static void main(String[] args) {
<<<<<<< HEAD
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
      "Logging started");

    // make sure that packages are loaded and the GenericPropertiesCreator
    // executes to populate the lists correctly
    weka.gui.GenericObjectEditor.determineClasses();

=======
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO, Messages
      .getInstance().getString("Experimenter_Main_LoggingStarted_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    LookAndFeel.setLookAndFeel();

    try {
      // uncomment to disable the memory management:
      // m_Memory.setEnabled(false);

      boolean classFirst = false;
      if (args.length > 0) {
        classFirst = args[0].equals("CLASS_FIRST");
      }
      m_experimenter = new Experimenter(classFirst);
<<<<<<< HEAD
      final JFrame jf = new JFrame("Weka Experiment Environment");
=======
      final JFrame jf = new JFrame(Messages.getInstance().getString(
        "Experimenter_Main_WekaExperimentEnvironment_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(m_experimenter, BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });
      jf.pack();
      jf.setSize(800, 600);
      jf.setVisible(true);

<<<<<<< HEAD
      Image icon =
        Toolkit.getDefaultToolkit().getImage(
          m_experimenter.getClass().getClassLoader()
            .getResource("weka/gui/weka_icon_new_48.png"));
=======
      Image icon = Toolkit.getDefaultToolkit().getImage(
        m_experimenter.getClass().getClassLoader()
          .getResource("weka/gui/weka_icon_new_48.png"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.setIconImage(icon);

      Thread memMonitor = new Thread() {
        @Override
        public void run() {
          while (true) {
            // try {
<<<<<<< HEAD
            // Thread.sleep(10);
=======
            // this.sleep(4000);
            //
            // System.gc();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

            if (m_Memory.isOutOfMemory()) {
              // clean up
              jf.dispose();
              m_experimenter = null;
              System.gc();

              // display error
<<<<<<< HEAD
              System.err.println("\ndisplayed message:");
              m_Memory.showOutOfMemory();
              System.err.println("\nexiting");
              System.exit(-1);
            }

            // } catch (InterruptedException ex) {
            // ex.printStackTrace();
            // }
=======
              System.err.println(Messages.getInstance().getString(
                "Experimenter_Main_Error_Text_First"));
              m_Memory.showOutOfMemory();
              System.err.println(Messages.getInstance().getString(
                "Experimenter_Main_Error_Text_Second"));
              System.exit(-1);
            }

            // } catch(InterruptedException ex) { ex.printStackTrace(); }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          }
        }
      };

      memMonitor.setPriority(Thread.NORM_PRIORITY);
      memMonitor.start();
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
