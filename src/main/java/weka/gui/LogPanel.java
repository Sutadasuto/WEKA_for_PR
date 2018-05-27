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
 *    LogPanel.java
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

package weka.gui;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Utils;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
<<<<<<< HEAD
=======
=======
import java.awt.BorderLayout;
import java.awt.Point;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * This panel allows log and status messages to be posted. Log messages appear
 * in a scrollable text area, and status messages appear as one-line transient
 * messages.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
public class LogPanel extends JPanel implements Logger, TaskLogger {
<<<<<<< HEAD
=======
=======
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/** 
 * This panel allows log and status messages to be posted. Log messages
 * appear in a scrollable text area, and status messages appear as one-line
 * transient messages.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class LogPanel
  extends JPanel
  implements Logger, TaskLogger {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -4072464549112439484L;

  /** Displays the current status */
<<<<<<< HEAD
  protected JLabel m_StatusLab = new JLabel("OK");

=======
<<<<<<< HEAD
  protected JLabel m_StatusLab = new JLabel("OK");

=======
  protected JLabel m_StatusLab = new JLabel(Messages.getInstance().getString("LogPanel_TaskLogger_StatusLab_JLabel_Text"));
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Displays the log messages */
  protected JTextArea m_LogText = new JTextArea(4, 20);

  /** The button for viewing the log */
<<<<<<< HEAD
  protected JButton m_logButton = new JButton("Log");
=======
<<<<<<< HEAD
  protected JButton m_logButton = new JButton("Log");
=======
  protected JButton m_logButton = new JButton(Messages.getInstance().getString("LogPanel_TaskLogger_LogButton_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** An indicator for whether text has been output yet */
  protected boolean m_First = true;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The panel for monitoring the number of running tasks (if supplied) */
  protected WekaTaskMonitor m_TaskMonitor = null;

  /**
   * Creates the log panel with no task monitor and the log always visible.
<<<<<<< HEAD
=======
=======
  /** The panel for monitoring the number of running tasks (if supplied)*/
  protected WekaTaskMonitor m_TaskMonitor=null;
  
  /**
   * Creates the log panel with no task monitor and
   * the log always visible.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public LogPanel() {

    this(null, false, false, true);
  }

  /**
<<<<<<< HEAD
   * Creates the log panel with a task monitor, where the log is hidden.
=======
<<<<<<< HEAD
   * Creates the log panel with a task monitor, where the log is hidden.
=======
   * Creates the log panel with a task monitor,
   * where the log is hidden.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param tm the task monitor, or null for none
   */
  public LogPanel(WekaTaskMonitor tm) {

    this(tm, true, false, true);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Creates the log panel, possibly with task monitor, where the log is
   * optionally hidden.
   *
   * @param tm the task monitor, or null for none
   * @param logHidden true if the log should be hidden and acessible via a
   *          button, or false if the log should always be visible.
<<<<<<< HEAD
=======
=======
   * Creates the log panel, possibly with task monitor,
   * where the log is optionally hidden.
   *
   * @param tm the task monitor, or null for none
   * @param logHidden true if the log should be hidden and
   *                  acessible via a button, or false if the
   *                  log should always be visible.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public LogPanel(WekaTaskMonitor tm, boolean logHidden) {
    this(tm, logHidden, false, true);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Creates the log panel, possibly with task monitor, where the either the log
   * is optionally hidden or the status (having both hidden is not allowed).
   * 
   *
   * @param tm the task monitor, or null for none
   * @param logHidden true if the log should be hidden and acessible via a
   *          button, or false if the log should always be visible.
   * @param statusHidden true if the status bar should be hidden (i.e.
   * @param titledBorder true if the log should have a title you only want the
   *          log part).
   */
  public LogPanel(WekaTaskMonitor tm, boolean logHidden, boolean statusHidden,
    boolean titledBorder) {
<<<<<<< HEAD
=======
=======
   * Creates the log panel, possibly with task monitor,
   * where the either the log is optionally hidden or the status
   * (having both hidden is not allowed).
   * 
   *
   * @param tm the task monitor, or null for none
   * @param logHidden true if the log should be hidden and
   *                  acessible via a button, or false if the
   *                  log should always be visible.
   * @param statusHidden true if the status bar should be hidden (i.e.
   * @param titledBorder true if the log should have a title
   * you only want the log part).
   */
  public LogPanel(WekaTaskMonitor tm, boolean logHidden, 
      boolean statusHidden, boolean titledBorder) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_TaskMonitor = tm;
    m_LogText.setEditable(false);
    m_LogText.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    m_StatusLab.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Status"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Status"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
			  BorderFactory.createTitledBorder(Messages.getInstance().getString("LogPanel_StatusLab_SetBorder_BorderFactoryCreateCompoundBorder_Text")),
			  BorderFactory.createEmptyBorder(0, 5, 5, 5)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // create scrolling log
    final JScrollPane js = new JScrollPane(m_LogText);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      public void stateChanged(ChangeEvent e) {
        JViewport vp = (JViewport) e.getSource();
        int h = vp.getViewSize().height;
        if (h != lastHeight) { // i.e. an addition not just a user scrolling
          lastHeight = h;
          int x = h - vp.getExtentSize().height;
          vp.setViewPosition(new Point(0, x));
        }
<<<<<<< HEAD
=======
=======
      public void stateChanged(ChangeEvent e) {
	JViewport vp = (JViewport)e.getSource();
	int h = vp.getViewSize().height; 
	if (h != lastHeight) { // i.e. an addition not just a user scrolling
	  lastHeight = h;
	  int x = h - vp.getExtentSize().height;
	  vp.setViewPosition(new Point(0, x));
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    });

    if (logHidden) {

      // create log window
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      final JFrame jf = Utils.getWekaJFrame("Log", this);
      jf.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          jf.setVisible(false);
        }
      });
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(js, BorderLayout.CENTER);
      jf.pack();
      jf.setSize(800, 600);

      // display log window on request
      m_logButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Window windowAncestor = SwingUtilities.getWindowAncestor(LogPanel.this);
          if (windowAncestor instanceof Frame) {
            jf.setIconImage(((Frame) windowAncestor).getIconImage());
          }
          jf.setLocationRelativeTo(LogPanel.this);
          jf.setVisible(true);
        }
      });

<<<<<<< HEAD
=======
=======
      final JFrame jf = new JFrame(Messages.getInstance().getString("LogPanel_Jf_JFrame_Text"));
      jf.addWindowListener(new WindowAdapter() {
	  public void windowClosing(WindowEvent e) {
	    jf.setVisible(false);
	  }
	});
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(js, BorderLayout.CENTER);
      jf.pack();
      jf.setSize(450, 350);
      
      // display log window on request
      m_logButton.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    jf.setVisible(true);
	  }
	});
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // do layout
      setLayout(new BorderLayout());
      JPanel logButPanel = new JPanel();
      logButPanel.setLayout(new BorderLayout());
      logButPanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
      logButPanel.add(m_logButton, BorderLayout.CENTER);
      JPanel p1 = new JPanel();
      p1.setLayout(new BorderLayout());
      p1.add(m_StatusLab, BorderLayout.CENTER);
      p1.add(logButPanel, BorderLayout.EAST);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      if (tm == null) {
        add(p1, BorderLayout.SOUTH);
      } else {
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(p1, BorderLayout.CENTER);
        p2.add((java.awt.Component) m_TaskMonitor, BorderLayout.EAST);
        add(p2, BorderLayout.SOUTH);
      }
    } else {
      // log always visible

      JPanel p1 = new JPanel();
      if (titledBorder) {
        p1.setBorder(BorderFactory.createTitledBorder("Log"));
<<<<<<< HEAD
=======
=======
      
      if (tm == null) {
	add(p1, BorderLayout.SOUTH);
      } else {
	JPanel p2 = new JPanel();
	p2.setLayout(new BorderLayout());
	p2.add(p1, BorderLayout.CENTER);
	p2.add((java.awt.Component)m_TaskMonitor, BorderLayout.EAST);
	add(p2, BorderLayout.SOUTH);
      }
    } else {
      // log always visible
      
      JPanel p1 = new JPanel();
      if (titledBorder) {
        p1.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("LogPanel_P1_SetBorder_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      p1.setLayout(new BorderLayout());
      p1.add(js, BorderLayout.CENTER);
      setLayout(new BorderLayout());
      add(p1, BorderLayout.CENTER);

      if (tm == null) {
        if (!statusHidden) {
          add(m_StatusLab, BorderLayout.SOUTH);
        }
      } else {
        if (!statusHidden) {
          JPanel p2 = new JPanel();
          p2.setLayout(new BorderLayout());
<<<<<<< HEAD
          p2.add(m_StatusLab, BorderLayout.CENTER);
          p2.add((java.awt.Component) m_TaskMonitor, BorderLayout.EAST);
=======
<<<<<<< HEAD
          p2.add(m_StatusLab, BorderLayout.CENTER);
          p2.add((java.awt.Component) m_TaskMonitor, BorderLayout.EAST);
=======
          p2.add(m_StatusLab,BorderLayout.CENTER);
          p2.add((java.awt.Component)m_TaskMonitor, BorderLayout.EAST);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          add(p2, BorderLayout.SOUTH);
        }
      }
    }
    addPopup();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set the size of the font used in the log message area. <= 0 will use the
   * default for JTextArea.
   *
   * @param size the size of the font to use in the log message area
   */
  public void setLoggingFontSize(int size) {
    if (size > 0) {
      m_LogText.setFont(new Font(null, Font.PLAIN, size));
    } else {
      Font temp = new JTextArea().getFont();
      m_LogText.setFont(temp);
    }
  }

  /**
   * adds thousand's-separators to the number
   * 
   * @param l the number to print
   * @return the number as string with separators
   */
  private String printLong(long l) {
    String result;
    String str;
    int i;
    int count;

    str = Long.toString(l);
    result = "";
    count = 0;
<<<<<<< HEAD
=======
=======
   * adds thousand's-separators to the number
   * @param l       the number to print
   * @return        the number as string with separators
   */
  private String printLong(long l) {
    String        result;
    String        str;
    int           i;
    int           count;

    str    = Long.toString(l);
    result = "";
    count  = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    for (i = str.length() - 1; i >= 0; i--) {
      count++;
      result = str.charAt(i) + result;
<<<<<<< HEAD
      if ((count == 3) && (i > 0)) {
=======
<<<<<<< HEAD
      if ((count == 3) && (i > 0)) {
=======
      if ( (count == 3) && (i > 0) ) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        result = "," + result;
        count = 0;
      }
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Add a popup menu for displaying the amount of free memory and running the
   * garbage collector
   */
  private void addPopup() {
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
          || e.isAltDown()) {
          JPopupMenu gcMenu = new JPopupMenu();
          JMenuItem availMem = new JMenuItem("Memory information");
          availMem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ee) {
              System.gc();
              Runtime currR = Runtime.getRuntime();
              long freeM = currR.freeMemory();
              long totalM = currR.totalMemory();
              long maxM = currR.maxMemory();
              logMessage("Memory (free/total/max.) in bytes: "
                + printLong(freeM) + " / " + printLong(totalM) + " / "
                + printLong(maxM));
              statusMessage("Memory (free/total/max.) in bytes: "
                + printLong(freeM) + " / " + printLong(totalM) + " / "
                + printLong(maxM));
            }
          });
          gcMenu.add(availMem);
          JMenuItem runGC = new JMenuItem("Run garbage collector");
          runGC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ee) {
              statusMessage("Running garbage collector");
              System.gc();
              statusMessage("OK");
            }
          });
          gcMenu.add(runGC);
          gcMenu.show(LogPanel.this, e.getX(), e.getY());
        }
      }
    });
<<<<<<< HEAD
=======
=======
   * Add a popup menu for displaying the amount of free memory
   * and running the garbage collector
   */
  private void addPopup() {
    addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
	  if (((e.getModifiers() & InputEvent.BUTTON1_MASK)
	       != InputEvent.BUTTON1_MASK) || e.isAltDown()) {
	    JPopupMenu gcMenu = new JPopupMenu();
	    JMenuItem availMem = new JMenuItem(Messages.getInstance().getString("LogPanel_AddPopup_AvailMem_JMenuItem_Text"));
	    availMem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ee) {
		  System.gc();
		  Runtime currR = Runtime.getRuntime();
		  long freeM = currR.freeMemory();
		  long totalM = currR.totalMemory();
		  long maxM = currR.maxMemory();
		  logMessage(Messages.getInstance().getString("LogPanel_AddPopup_LogMessage_Text_First") + printLong(freeM) + Messages.getInstance().getString("LogPanel_AddPopup_LogMessage_Text_Second") + printLong(totalM) + Messages.getInstance().getString("LogPanel_AddPopup_LogMessage_Text_Third") + printLong(maxM));
		  statusMessage(Messages.getInstance().getString("LogPanel_AddPopup_StatusMessage_Text_First") + printLong(freeM) + Messages.getInstance().getString("LogPanel_AddPopup_StatusMessage_Text_Second") + printLong(totalM) + Messages.getInstance().getString("LogPanel_AddPopup_StatusMessage_Text_Third") + printLong(maxM));
		}
	      });
	    gcMenu.add(availMem);
	    JMenuItem runGC = new JMenuItem(Messages.getInstance().getString("LogPanel_AddPopup_RunGC_JMenuItem_Text"));
	    runGC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ee) {
		  statusMessage(Messages.getInstance().getString("LogPanel_AddPopup_StatusMessage_Text_Fourth"));
		  System.gc();
		  statusMessage(Messages.getInstance().getString("LogPanel_AddPopup_StatusMessage_Text_Fifth"));
		}
	      });
	    gcMenu.add(runGC);
	    gcMenu.show(LogPanel.this, e.getX(), e.getY());
	  }
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Record the starting of a new task
   */
  public void taskStarted() {
    if (m_TaskMonitor != null) {
      m_TaskMonitor.taskStarted();
    }
  }

  /**
   * Record a task ending
   */
  public void taskFinished() {
    if (m_TaskMonitor != null) {
      m_TaskMonitor.taskFinished();
    }
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Gets a string containing current date and time.
   *
   * @return a string containing the date and time.
   */
  protected static String getTimestamp() {

    return (new SimpleDateFormat("HH:mm:ss:")).format(new Date());
  }

  /**
<<<<<<< HEAD
   * Sends the supplied message to the log area. The current timestamp will be
   * prepended.
=======
<<<<<<< HEAD
   * Sends the supplied message to the log area. The current timestamp will be
   * prepended.
=======
   * Sends the supplied message to the log area. The current timestamp will
   * be prepended.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param message a value of type 'String'
   */
  public synchronized void logMessage(String message) {

    if (m_First) {
      m_First = false;
    } else {
      m_LogText.append("\n");
    }
    m_LogText.append(LogPanel.getTimestamp() + ' ' + message);
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO, message);
  }

  /**
   * Sends the supplied message to the status line.
   *
   * @param message the status message
   */
  public synchronized void statusMessage(String message) {

    m_StatusLab.setText(message);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Tests out the log panel from the command line.
   *
   * @param args ignored
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static void main(String[] args) {

    try {
      final javax.swing.JFrame jf = new javax.swing.JFrame("Log Panel");
<<<<<<< HEAD
=======
=======
  public static void main(String [] args) {

    try {
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages.getInstance().getString("LogPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      final LogPanel lp = new LogPanel();
      jf.getContentPane().add(lp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });
      jf.pack();
      jf.setVisible(true);
      lp.logMessage("Welcome to the generic log panel!");
      lp.statusMessage("Hi there");
      lp.logMessage("Funky chickens");

<<<<<<< HEAD
=======
=======
	public void windowClosing(java.awt.event.WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
      });
      jf.pack();
      jf.setVisible(true);
      lp.logMessage(Messages.getInstance().getString("LogPanel_Main_Lp_LogMessage_Text_First"));
      lp.statusMessage(Messages.getInstance().getString("LogPanel_Main_Lp_StatusMessage_Text"));
      lp.logMessage(Messages.getInstance().getString("LogPanel_Main_Lp_LogMessage_Text_Second"));
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
