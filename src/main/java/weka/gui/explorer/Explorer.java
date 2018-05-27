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
 *    Explorer.java
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

package weka.gui.explorer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Capabilities;
import weka.core.Copyright;
import weka.core.Instances;
import weka.core.Memory;
import weka.core.PluginManager;
import weka.core.WekaPackageClassLoaderManager;
import weka.core.converters.AbstractFileLoader;
import weka.core.converters.ConverterUtils;
import weka.gui.LogPanel;
import weka.gui.Logger;
import weka.gui.LookAndFeel;
import weka.gui.WekaTaskMonitor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;

import weka.core.Capabilities;
import weka.core.Copyright;
import weka.core.Instances;
import weka.core.Memory;
import weka.core.converters.AbstractFileLoader;
import weka.core.converters.ConverterUtils;
import weka.gui.LogPanel;
import weka.gui.Logger;
import weka.gui.LookAndFeel;
import weka.gui.WekaTaskMonitor;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * The main class for the Weka explorer. Lets the user create, open, save,
 * configure, datasets, and perform ML analysis.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 13477 $
=======
<<<<<<< HEAD
 * @version $Revision: 13477 $
=======
 * @version $Revision: 10438 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class Explorer extends JPanel {

  /** for serialization */
  private static final long serialVersionUID = -7674003708867909578L;

  /**
   * Interface for classes that listen for filter changes.
   * 
   * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
   * @version $Revision: 10438 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static interface CapabilitiesFilterChangeListener extends
    EventListener {

    /**
     * method gets called in case of a change event
     * 
     * @param e the associated change event
     */
    public void capabilitiesFilterChanged(CapabilitiesFilterChangeEvent e);
  }

  /**
   * This event can be fired in case the capabilities filter got changed
   * 
   * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
   * @version $Revision: 10438 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static class CapabilitiesFilterChangeEvent extends ChangeEvent {

    /** for serialization */
    private static final long serialVersionUID = 1194260517270385559L;

    /** the capabilities filter */
    protected Capabilities m_Filter;

    /**
     * Constructs a GOECapabilitiesFilterChangeEvent object.
     * 
     * @param source the Object that is the source of the event
     * @param filter the responsible capabilities filter
     */
    public CapabilitiesFilterChangeEvent(Object source, Capabilities filter) {
      super(source);
      m_Filter = filter;
    }

    /**
     * returns the associated Capabilities filter
     * 
     * @return the filter
     */
    public Capabilities getFilter() {
      return m_Filter;
    }
  }

  /**
   * A common interface for panels to be displayed in the Explorer
   * 
   * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
   * @version $Revision: 10438 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static interface ExplorerPanel {

    /**
     * Sets the Explorer to use as parent frame (used for sending notifications
     * about changes in the data)
     * 
     * @param parent the parent frame
     */
    public void setExplorer(Explorer parent);

    /**
     * returns the parent Explorer frame
     * 
     * @return the parent
     */
    public Explorer getExplorer();

    /**
     * Tells the panel to use a new set of instances.
     * 
     * @param inst a set of Instances
     */
    public void setInstances(Instances inst);

    /**
     * Returns the title for the tab in the Explorer
     * 
     * @return the title of this tab
     */
    public String getTabTitle();

    /**
     * Returns the tooltip for the tab in the Explorer
     * 
     * @return the tooltip of this tab
     */
    public String getTabTitleToolTip();
  }

  /**
   * A common interface for panels in the explorer that can handle logs
   * 
   * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
<<<<<<< HEAD
   * @version $Revision: 13477 $
=======
   * @version $Revision: 10438 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static interface LogHandler {

    /**
     * Sets the Logger to receive informational messages
     * 
     * @param newLog the Logger that will now get info messages
     */
    public void setLog(Logger newLog);
  }

  /** The panel for preprocessing instances */
  protected PreprocessPanel m_PreprocessPanel = new PreprocessPanel();

  /** Contains all the additional panels apart from the pre-processing panel */
  protected Vector<ExplorerPanel> m_Panels = new Vector<ExplorerPanel>();

  /** The tabbed pane that controls which sub-pane we are working with */
  protected JTabbedPane m_TabbedPane = new JTabbedPane();

  /** The panel for log and status messages */
  protected LogPanel m_LogPanel = new LogPanel(new WekaTaskMonitor());

  /** the listeners that listen to filter changes */
  protected HashSet<CapabilitiesFilterChangeListener> m_CapabilitiesFilterChangeListeners = new HashSet<CapabilitiesFilterChangeListener>();

  /**
   * Creates the experiment environment gui with no initial experiment
   */
  public Explorer() {

    String date = (new SimpleDateFormat("EEEE, d MMMM yyyy"))
      .format(new Date());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_LogPanel.logMessage("Weka Explorer");
    m_LogPanel.logMessage("(c) " + Copyright.getFromYear() + "-"
      + Copyright.getToYear() + " " + Copyright.getOwner() + ", "
      + Copyright.getAddress());
    m_LogPanel.logMessage("web: " + Copyright.getURL());
    m_LogPanel.logMessage("Started on " + date);
    m_LogPanel.statusMessage("Welcome to the Weka Explorer");
<<<<<<< HEAD
=======
=======
    m_LogPanel.logMessage(Messages.getInstance().getString(
      "Explorer_LogPanel_LogMessage_Text_First"));
    m_LogPanel.logMessage(Messages.getInstance().getString(
      "Explorer_LogPanel_LogMessage_Text_Second")
      + Copyright.getFromYear()
      + Messages.getInstance().getString(
        "Explorer_LogPanel_LogMessage_Text_Third")
      + Copyright.getToYear()
      + " " + Copyright.getOwner() + ", " + Copyright.getAddress());
    m_LogPanel.logMessage(Messages.getInstance().getString(
      "Explorer_LogPanel_LogMessage_Text_Fourth")
      + Copyright.getURL());
    m_LogPanel.logMessage(Messages.getInstance().getString(
      "Explorer_LogPanel_LogMessage_Text_Fifth")
      + date);
    m_LogPanel.statusMessage(Messages.getInstance().getString(
      "Explorer_LogPanel_StatusMessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // intialize pre-processpanel
    m_PreprocessPanel.setLog(m_LogPanel);
    m_TabbedPane.addTab(m_PreprocessPanel.getTabTitle(), null,
      m_PreprocessPanel, m_PreprocessPanel.getTabTitleToolTip());

    // initialize additional panels
    String[] tabs = ExplorerDefaults.getTabs();
<<<<<<< HEAD
    Hashtable<String, HashSet<String>> tabOptions = new Hashtable<String, HashSet<String>>();
=======
<<<<<<< HEAD
    Hashtable<String, HashSet<String>> tabOptions = new Hashtable<String, HashSet<String>>();
=======
    Hashtable<String, HashSet> tabOptions = new Hashtable<String, HashSet>();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (String tab : tabs) {
      try {
        // determine classname and additional options
        String[] optionsStr = tab.split(":");
        String classname = optionsStr[0];
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (PluginManager.isInDisabledList(classname)) {
          continue;
        }
        HashSet<String> options = new HashSet<String>();
<<<<<<< HEAD
=======
=======
        HashSet options = new HashSet();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        tabOptions.put(classname, options);
        for (int n = 1; n < optionsStr.length; n++) {
          options.add(optionsStr[n]);
        }

        // setup panel
<<<<<<< HEAD
        ExplorerPanel panel = (ExplorerPanel) WekaPackageClassLoaderManager.forName(classname)
=======
<<<<<<< HEAD
        ExplorerPanel panel = (ExplorerPanel) WekaPackageClassLoaderManager.forName(classname)
=======
        ExplorerPanel panel = (ExplorerPanel) Class.forName(classname)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          .newInstance();
        panel.setExplorer(this);
        m_Panels.add(panel);
        if (panel instanceof LogHandler) {
          ((LogHandler) panel).setLog(m_LogPanel);
        }
        m_TabbedPane.addTab(panel.getTabTitle(), null, (JPanel) panel,
          panel.getTabTitleToolTip());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    // setup tabbed pane
    m_TabbedPane.setSelectedIndex(0);
    for (int i = 0; i < m_Panels.size(); i++) {
<<<<<<< HEAD
      HashSet<String> options = tabOptions.get(m_Panels.get(i).getClass()
        .getName());
=======
<<<<<<< HEAD
      HashSet<String> options = tabOptions.get(m_Panels.get(i).getClass()
        .getName());
=======
      HashSet options = tabOptions.get(m_Panels.get(i).getClass().getName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_TabbedPane.setEnabledAt(i + 1, options.contains("standalone"));
    }

    // setup notification for dataset changes
    m_PreprocessPanel.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent e) {
        for (int i = 0; i < m_Panels.size(); i++) {
          m_Panels.get(i).setInstances(m_PreprocessPanel.getInstances());
          m_TabbedPane.setEnabledAt(i + 1, true);
        }
      }
    });

    // add listeners for changes in the capabilities
    m_PreprocessPanel.setExplorer(this);
    addCapabilitiesFilterListener(m_PreprocessPanel);
    for (int i = 0; i < m_Panels.size(); i++) {
      if (m_Panels.get(i) instanceof CapabilitiesFilterChangeListener) {
        addCapabilitiesFilterListener((CapabilitiesFilterChangeListener) m_Panels
          .get(i));
      }
    }

    // add components to layout
    setLayout(new BorderLayout());
    add(m_TabbedPane, BorderLayout.CENTER);
    add(m_LogPanel, BorderLayout.SOUTH);
  }

  /**
   * returns all the panels, apart from the PreprocessPanel
   * 
   * @return the currently displayed panels w/o PreprocessPanel
   */
  public Vector<ExplorerPanel> getPanels() {
    return m_Panels;
  }

  /**
   * returns the instance of the PreprocessPanel being used in this instance of
   * the Explorer
   * 
   * @return the panel
   */
  public PreprocessPanel getPreprocessPanel() {
    return m_PreprocessPanel;
  }

  /**
   * returns the tabbed pane of the Explorer
   * 
   * @return the tabbed pane
   */
  public JTabbedPane getTabbedPane() {
    return m_TabbedPane;
  }

  /**
   * adds the listener to the list of objects that listen for changes of the
   * CapabilitiesFilter
   * 
   * @param l the listener to add
   * @see #m_CapabilitiesFilterChangeListeners
   */
  public void addCapabilitiesFilterListener(CapabilitiesFilterChangeListener l) {
    m_CapabilitiesFilterChangeListeners.add(l);
  }

  /**
   * Removes the specified listener from the set of listeners if it is present.
   * 
   * @param l the listener to remove
   * @return true if the listener was registered
   */
  public boolean removeCapabilitiesFilterListener(
    CapabilitiesFilterChangeListener l) {
    return m_CapabilitiesFilterChangeListeners.remove(l);
  }

  /**
   * notifies all the listeners of a change
   * 
   * @param filter the affected filter
   */
  public void notifyCapabilitiesFilterListener(Capabilities filter) {
    for (CapabilitiesFilterChangeListener l : m_CapabilitiesFilterChangeListeners) {
      if (l == this) {
        continue;
      }
      l.capabilitiesFilterChanged(new CapabilitiesFilterChangeEvent(this,
        filter));
    }
  }

  /**
   * variable for the Explorer class which would be set to null by the memory
   * monitoring thread to free up some memory if we running out of memory
   */
  private static Explorer m_explorer;

  /** for monitoring the Memory consumption */
  protected static Memory m_Memory = new Memory(true);

  /**
   * Tests out the explorer environment.
   * 
   * @param args ignored.
   */
  public static void main(String[] args) {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
      "Logging started");

    LookAndFeel.setLookAndFeel();
    // make sure that packages are loaded and the GenericPropertiesCreator
    // executes to populate the lists correctly
    weka.gui.GenericObjectEditor.determineClasses();
<<<<<<< HEAD
=======
=======
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO, Messages
      .getInstance().getString("Explorer_Main_Logger_Text"));

    LookAndFeel.setLookAndFeel();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    try {
      // uncomment to disable the memory management:
      // m_Memory.setEnabled(false);

      m_explorer = new Explorer();
<<<<<<< HEAD
      final JFrame jf = new JFrame("Weka Explorer");
=======
<<<<<<< HEAD
      final JFrame jf = new JFrame("Weka Explorer");
=======
      final JFrame jf = new JFrame(Messages.getInstance().getString(
        "Explorer_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(m_explorer, BorderLayout.CENTER);
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
      Image icon = Toolkit.getDefaultToolkit().getImage(
        m_explorer.getClass().getClassLoader()
          .getResource("weka/gui/weka_icon_new_48.png"));
      jf.setIconImage(icon);

      if (args.length == 1) {
<<<<<<< HEAD
        System.err.println("Loading instances from " + args[0]);
=======
<<<<<<< HEAD
        System.err.println("Loading instances from " + args[0]);
=======
        System.err.println(Messages.getInstance().getString(
          "Explorer_Main_Run_Error_Text")
          + args[0]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        AbstractFileLoader loader = ConverterUtils.getLoaderForFile(args[0]);
        loader.setFile(new File(args[0]));
        m_explorer.m_PreprocessPanel.setInstancesFromFile(loader);
      }

      Thread memMonitor = new Thread() {
        @Override
        public void run() {
          while (true) {
            // try {
<<<<<<< HEAD
            // System.out.println("Before sleeping.");
            // Thread.sleep(10);
=======
<<<<<<< HEAD
            // System.out.println("Before sleeping.");
            // Thread.sleep(10);
=======
            // //System.out.println("Before sleeping.");
            // this.sleep(4000);

            // System.gc();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

            if (m_Memory.isOutOfMemory()) {
              // clean up
              jf.dispose();
              m_explorer = null;
              System.gc();

              // display error
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              System.err.println("\ndisplayed message:");
              m_Memory.showOutOfMemory();
              System.err.println("\nexiting");
              System.exit(-1);
            }

            // } catch (InterruptedException ex) {
            // ex.printStackTrace();
            // }
<<<<<<< HEAD
=======
=======
              System.err.println(Messages.getInstance().getString(
                "Explorer_Main_Run_Error_Text_First"));
              m_Memory.showOutOfMemory();
              System.err.println(Messages.getInstance().getString(
                "Explorer_Main_Run_Error_Text_Second"));
              System.exit(-1);
            }

            // } catch(InterruptedException ex) { ex.printStackTrace(); }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      };

      memMonitor.setPriority(Thread.MAX_PRIORITY);
      memMonitor.start();
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
