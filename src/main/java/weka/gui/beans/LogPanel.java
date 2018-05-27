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
 *    LogPanel
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import weka.gui.Logger;
=======
<<<<<<< HEAD
import weka.gui.Logger;
=======
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
<<<<<<< HEAD
=======
=======

import weka.gui.Logger;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * Class for displaying a status area (made up of a variable number of lines)
 * and a log area.
 * 
 * @author mhall (mhall{[at]}pentaho{[dot]}com)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 12361 $
 */
public class LogPanel extends JPanel implements Logger {

  /** Added ID to avoid warning */
  private static final long serialVersionUID = 6583097154513435548L;

<<<<<<< HEAD
=======
=======
 * @version $Revision: 9700 $
 */
public class LogPanel extends JPanel implements Logger {

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Holds the index (line number) in the JTable of each component being
   * tracked.
   */
<<<<<<< HEAD
  protected HashMap<String, Integer> m_tableIndexes =
    new HashMap<String, Integer>();
=======
<<<<<<< HEAD
  protected HashMap<String, Integer> m_tableIndexes =
    new HashMap<String, Integer>();
=======
  private final HashMap<String, Integer> m_tableIndexes = new HashMap<String, Integer>();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Holds the timers associated with each component being tracked.
   */
  private final HashMap<String, Timer> m_timers = new HashMap<String, Timer>();

  /**
   * The table model for the JTable used in the status area
   */
  private final DefaultTableModel m_tableModel;

  /**
   * The table for the status area
   */
  private JTable m_table;

  /**
   * Tabbed pane to hold both the status and the log
   */
  private final JTabbedPane m_tabs = new JTabbedPane();

  /**
   * For formatting timer digits
   */
  private final DecimalFormat m_formatter = new DecimalFormat("00");

  /**
   * The log panel to delegate log messages to.
   */
  private final weka.gui.LogPanel m_logPanel = new weka.gui.LogPanel(null,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    false, true, false);

  public LogPanel() {

    String[] columnNames = { "Component", "Parameters", "Time", "Status" };
<<<<<<< HEAD
=======
=======
      false, true, false);

  public LogPanel() {

    String[] columnNames = {
        Messages.getInstance().getString("LogPanel_ColumnNames_Text_Index0"),
        Messages.getInstance().getString("LogPanel_ColumnNames_Text_Index1"),
        Messages.getInstance().getString("LogPanel_ColumnNames_Text_Index2"),
        Messages.getInstance().getString("LogPanel_ColumnNames_Text_Index3") };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_tableModel = new DefaultTableModel(columnNames, 0);

    // JTable with error/warning indication for rows.
    m_table = new JTable() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      /** Added ID to avoid warning */
      private static final long serialVersionUID = 5883722364387855125L;

      @Override
      public Class<?> getColumnClass(int column) {
<<<<<<< HEAD
=======
=======
      @Override
      public Class getColumnClass(int column) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        return getValueAt(0, column).getClass();
      }

      @Override
      public Component prepareRenderer(TableCellRenderer renderer, int row,
<<<<<<< HEAD
        int column) {
=======
<<<<<<< HEAD
        int column) {
=======
          int column) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        Component c = super.prepareRenderer(renderer, row, column);
        if (!c.getBackground().equals(getSelectionBackground())) {
          String type = (String) getModel().getValueAt(row, 3);
          Color backgroundIndicator = null;
          if (type.startsWith("ERROR")) {
            backgroundIndicator = Color.RED;
          } else if (type.startsWith("WARNING")) {
            backgroundIndicator = Color.YELLOW;
          } else if (type.startsWith("INTERRUPTED")) {
            backgroundIndicator = Color.MAGENTA;
          }
          c.setBackground(backgroundIndicator);
        }
        return c;
      }
    };

    m_table.setModel(m_tableModel);
    m_table.getColumnModel().getColumn(0).setPreferredWidth(100);
    m_table.getColumnModel().getColumn(1).setPreferredWidth(150);
<<<<<<< HEAD
    m_table.getColumnModel().getColumn(2).setPreferredWidth(40);
    m_table.getColumnModel().getColumn(3).setPreferredWidth(350);
=======
<<<<<<< HEAD
    m_table.getColumnModel().getColumn(2).setPreferredWidth(40);
    m_table.getColumnModel().getColumn(3).setPreferredWidth(350);
=======
    m_table.getColumnModel().getColumn(2).setPreferredWidth(30);
    m_table.getColumnModel().getColumn(3).setPreferredWidth(500);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_table.setShowVerticalLines(true);

    JPanel statusPan = new JPanel();
    statusPan.setLayout(new BorderLayout());
    statusPan.add(new JScrollPane(m_table), BorderLayout.CENTER);
<<<<<<< HEAD
    m_tabs.addTab("Status", statusPan);
    m_tabs.addTab("Log", m_logPanel);
=======
<<<<<<< HEAD
    m_tabs.addTab("Status", statusPan);
    m_tabs.addTab("Log", m_logPanel);
=======
    m_tabs.addTab(
        Messages.getInstance().getString("LogPanel_Tabs_AddTab_Text_First"),
        statusPan);
    m_tabs.addTab(
        Messages.getInstance().getString("LogPanel_Tabs_AddTab_Text_Second"),
        m_logPanel);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setLayout(new BorderLayout());
    add(m_tabs, BorderLayout.CENTER);

  }

  /**
   * Clear the status area.
   */
  public void clearStatus() {
    // stop any running timers
    Iterator<Timer> i = m_timers.values().iterator();
    while (i.hasNext()) {
      i.next().stop();
    }

    // clear the map entries
    m_timers.clear();
    m_tableIndexes.clear();

    // clear the rows from the table
    while (m_tableModel.getRowCount() > 0) {
      m_tableModel.removeRow(0);
    }
  }

  /**
   * The JTable used for the status messages (in case clients want to attach
   * listeners etc.)
   * 
   * @return the JTable used for the status messages.
   */
  public JTable getStatusTable() {
    return m_table;
  }

  /**
   * Sends the supplied message to the log area. These message will typically
   * have the current timestamp prepended, and be viewable as a history.
   * 
   * @param message the log message
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void logMessage(String message) {
    // delegate to the weka.gui.LogPanel
    m_logPanel.logMessage(message);
  }

  /**
   * Sends the supplied message to the status area. These messages are typically
   * one-line status messages to inform the user of progress during processing
   * (i.e. it doesn't matter if the user doesn't happen to look at each
   * message). These messages have the following format:
   * 
   * <Component name (needs to be unique)>|<Parameter string (optional)|<Status
   * message>
   * 
   * @param message the status message.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void statusMessage(String message) {

    boolean hasDelimiters = (message.indexOf('|') > 0);
    String stepName = "";
    String stepHash = "";
    String stepParameters = "";
    String stepStatus = "";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    boolean noTimer = false;

    if (!hasDelimiters) {
      stepName = "Unknown";
      stepHash = "Unknown";
<<<<<<< HEAD
=======
=======

    if (!hasDelimiters) {
      stepName = Messages.getInstance().getString(
          "LogPanel_StatusMessage_StepName_Text");
      stepHash = Messages.getInstance().getString(
          "LogPanel_StatusMessage_StepHash_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      stepStatus = message;
    } else {
      // Extract the fields of the status message
      stepHash = message.substring(0, message.indexOf('|'));
      message = message.substring(message.indexOf('|') + 1, message.length());
      // See if there is a unique object ID in the stepHash string
      if (stepHash.indexOf('$') > 0) {
        // Extract the step name
        stepName = stepHash.substring(0, stepHash.indexOf('$'));
      } else {
        stepName = stepHash;
      }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (stepName.startsWith("@!@")) {
        noTimer = true;
        stepName = stepName.substring(3, stepName.length());
      }

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // See if there are any step parameters to extract
      if (message.indexOf('|') >= 0) {
        stepParameters = message.substring(0, message.indexOf('|'));
        stepStatus = message.substring(message.indexOf('|') + 1,
<<<<<<< HEAD
          message.length());
=======
<<<<<<< HEAD
          message.length());
=======
            message.length());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } else {
        // set the status message to the remainder
        stepStatus = message;
      }
    }

    // Now see if this step is in the hashmap
    if (m_tableIndexes.containsKey(stepHash)) {
      // Get the row number and update the table model...
      final Integer rowNum = m_tableIndexes.get(stepHash);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (stepStatus.equalsIgnoreCase("remove")
        || stepStatus.equalsIgnoreCase("remove.")) {

        // m_tableModel.fireTableDataChanged();
        m_tableIndexes.remove(stepHash);
        Timer t = m_timers.get(stepHash);
        if (t != null) {
          t.stop();
          m_timers.remove(stepHash);
        }
<<<<<<< HEAD
=======
=======
      if (stepStatus.trim().equalsIgnoreCase("remove")
          || stepStatus.trim().equalsIgnoreCase("remove.")) {

        // m_tableModel.fireTableDataChanged();
        m_tableIndexes.remove(stepHash);
        m_timers.get(stepHash).stop();
        m_timers.remove(stepHash);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        // now need to decrement all the row indexes of
        // any rows greater than this one
        Iterator<String> i = m_tableIndexes.keySet().iterator();
        while (i.hasNext()) {
          String nextKey = i.next();
          int index = m_tableIndexes.get(nextKey).intValue();
          if (index > rowNum.intValue()) {
            index--;
            // System.err.println("*** " + nextKey + " needs decrementing to " +
            // index);
            m_tableIndexes.put(nextKey, index);
            // System.err.println("new index " +
            // m_rows.get(nextKey).intValue());
          }
        }

        // Remove the entry...
        if (!SwingUtilities.isEventDispatchThread()) {
          try {
            SwingUtilities.invokeLater(new Runnable() {
<<<<<<< HEAD
              @Override
=======
<<<<<<< HEAD
              @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              public void run() {
                m_tableModel.removeRow(rowNum);
              }
            });
          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else {
          m_tableModel.removeRow(rowNum);
        }
      } else {
        final String stepNameCopy = stepName;
        final String stepStatusCopy = stepStatus;
        final String stepParametersCopy = stepParameters;

        if (!SwingUtilities.isEventDispatchThread()) {
          try {
            SwingUtilities.invokeLater(new Runnable() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              @Override
              public void run() {
                String currentStatus = m_tableModel.getValueAt(rowNum.intValue(), 3).toString();
                if (currentStatus.startsWith("INTERRUPTED") || currentStatus.startsWith("ERROR")) {
                  // leave these in place until the status area is cleared.
                  return;
                }
                // ERROR overrides INTERRUPTED
                if (!(stepStatusCopy.startsWith("INTERRUPTED") && ((String) m_tableModel
                  .getValueAt(rowNum.intValue(), 3)).startsWith("ERROR"))) {
                  m_tableModel.setValueAt(stepNameCopy, rowNum.intValue(), 0);
                  m_tableModel.setValueAt(stepParametersCopy,
                    rowNum.intValue(), 1);
                  m_tableModel.setValueAt(
                    m_table.getValueAt(rowNum.intValue(), 2),
                    rowNum.intValue(), 2);
<<<<<<< HEAD
=======
=======
              public void run() {
                // ERROR overrides INTERRUPTED
                if (!(stepStatusCopy.startsWith("INTERRUPTED") && ((String) m_tableModel
                    .getValueAt(rowNum.intValue(), 3)).startsWith("ERROR"))) {
                  m_tableModel.setValueAt(stepNameCopy, rowNum.intValue(), 0);
                  m_tableModel.setValueAt(stepParametersCopy,
                      rowNum.intValue(), 1);
                  m_tableModel.setValueAt(
                      m_table.getValueAt(rowNum.intValue(), 2),
                      rowNum.intValue(), 2);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  m_tableModel.setValueAt(stepStatusCopy, rowNum.intValue(), 3);
                }
              }
            });
          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          String currentStatus = m_tableModel.getValueAt(rowNum.intValue(), 3).toString();
          if (currentStatus.startsWith("INTERRUPTED") || currentStatus.startsWith("ERROR")) {
            // leave these in place until the status area is cleared.
            return;
          }
          if (!(stepStatusCopy.startsWith("INTERRUPTED") && ((String) m_tableModel
            .getValueAt(rowNum.intValue(), 3)).startsWith("ERROR"))) {
            m_tableModel.setValueAt(stepNameCopy, rowNum.intValue(), 0);
            m_tableModel.setValueAt(stepParametersCopy, rowNum.intValue(), 1);
            m_tableModel.setValueAt(m_table.getValueAt(rowNum.intValue(), 2),
              rowNum.intValue(), 2);
            if (m_table.getValueAt(rowNum.intValue(), 3) != null
              && !m_table.getValueAt(rowNum.intValue(), 3).toString()
                .toLowerCase()
                .startsWith("finished")) {
              m_tableModel.setValueAt(stepStatusCopy, rowNum.intValue(), 3);
            }
          }
        }
        if (stepStatus.startsWith("ERROR")
          || stepStatus.startsWith("INTERRUPTED")
          || stepStatus.toLowerCase().startsWith("finished")
          ||
          // stepStatus.toLowerCase().startsWith("finished.") ||
          stepStatus.toLowerCase().startsWith("done")
          ||
          // stepStatus.toLowerCase().startsWith("done.") ||
          stepStatus.equalsIgnoreCase("stopped")
          || stepStatus.equalsIgnoreCase("stopped.")) {
          // stop the timer.
          Timer t = m_timers.get(stepHash);
          if (t != null) {
            t.stop();
          }
        } else if (m_timers.get(stepHash) != null
          && !m_timers.get(stepHash).isRunning()) {
<<<<<<< HEAD
=======
=======
          if (!(stepStatusCopy.startsWith("INTERRUPTED") && ((String) m_tableModel
              .getValueAt(rowNum.intValue(), 3)).startsWith("ERROR"))) {
            m_tableModel.setValueAt(stepNameCopy, rowNum.intValue(), 0);
            m_tableModel.setValueAt(stepParametersCopy, rowNum.intValue(), 1);
            m_tableModel.setValueAt(m_table.getValueAt(rowNum.intValue(), 2),
                rowNum.intValue(), 2);
            m_tableModel.setValueAt(stepStatusCopy, rowNum.intValue(), 3);
          }
        }
        if (stepStatus.startsWith("ERROR")
            || stepStatus.startsWith("INTERRUPTED")
            || stepStatus.trim().equalsIgnoreCase("finished")
            || stepStatus.trim().equalsIgnoreCase("finished.")
            || stepStatus.trim().equalsIgnoreCase("done")
            || stepStatus.trim().equalsIgnoreCase("done.")) {
          // stop the timer.
          m_timers.get(stepHash).stop();
        } else if (!m_timers.get(stepHash).isRunning()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          // need to create a new one in order to reset the
          // elapsed time.
          installTimer(stepHash);
        }
        // m_tableModel.fireTableCellUpdated(rowNum.intValue(), 3);
      }
<<<<<<< HEAD
    } else if (!stepStatus.equalsIgnoreCase("Remove")
      && !stepStatus.equalsIgnoreCase("Remove.")) {
=======
<<<<<<< HEAD
    } else if (!stepStatus.equalsIgnoreCase("Remove")
      && !stepStatus.equalsIgnoreCase("Remove.")) {
=======
    } else if (!stepStatus.trim().equalsIgnoreCase("Remove")
        && !stepStatus.trim().equalsIgnoreCase("Remove.")) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // Add this one to the hash map
      int numKeys = m_tableIndexes.keySet().size();
      m_tableIndexes.put(stepHash, numKeys);

      // Now add a row to the table model
      final Object[] newRow = new Object[4];
      newRow[0] = stepName;
      newRow[1] = stepParameters;
      newRow[2] = "-";
      newRow[3] = stepStatus;
      final String stepHashCopy = stepHash;
      try {
        if (!SwingUtilities.isEventDispatchThread()) {
          SwingUtilities.invokeLater(new Runnable() {
<<<<<<< HEAD
            @Override
=======
<<<<<<< HEAD
            @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            public void run() {
              m_tableModel.addRow(newRow);
              // m_tableModel.fireTableDataChanged();
            }
          });
        } else {
          m_tableModel.addRow(newRow);
        }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (!noTimer && !stepStatus.toLowerCase().startsWith("finished")
          && !stepStatus.toLowerCase().startsWith("done")) {
          installTimer(stepHashCopy);
        }
<<<<<<< HEAD
=======
=======
        installTimer(stepHashCopy);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }

  private void installTimer(final String stepHash) {
    final long startTime = System.currentTimeMillis();
    Timer newTimer = new Timer(1000, new ActionListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        synchronized (LogPanel.this) {
          if (m_tableIndexes.containsKey(stepHash)) {
            final Integer rn = m_tableIndexes.get(stepHash);
            long elapsed = System.currentTimeMillis() - startTime;
            long seconds = elapsed / 1000;
            long minutes = seconds / 60;
            final long hours = minutes / 60;
            seconds = seconds - (minutes * 60);
            minutes = minutes - (hours * 60);
            final long seconds2 = seconds;
            final long minutes2 = minutes;
            if (!SwingUtilities.isEventDispatchThread()) {
              try {
                SwingUtilities.invokeLater(new Runnable() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  @Override
                  public void run() {
                    m_tableModel.setValueAt(
                      "" + m_formatter.format(hours) + ":"
                        + m_formatter.format(minutes2) + ":"
<<<<<<< HEAD
=======
=======
                  public void run() {
                    m_tableModel.setValueAt("" + m_formatter.format(hours)
                        + ":" + m_formatter.format(minutes2) + ":"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                        + m_formatter.format(seconds2), rn.intValue(), 2);
                  }
                });
              } catch (Exception ex) {
                ex.printStackTrace();
              }
            } else {
              m_tableModel.setValueAt(
<<<<<<< HEAD
                "" + m_formatter.format(hours) + ":"
                  + m_formatter.format(minutes2) + ":"
                  + m_formatter.format(seconds2), rn.intValue(), 2);
=======
<<<<<<< HEAD
                "" + m_formatter.format(hours) + ":"
                  + m_formatter.format(minutes2) + ":"
                  + m_formatter.format(seconds2), rn.intValue(), 2);
=======
                  "" + m_formatter.format(hours) + ":"
                      + m_formatter.format(minutes2) + ":"
                      + m_formatter.format(seconds2), rn.intValue(), 2);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }
          }
        }
      }
    });
    m_timers.put(stepHash, newTimer);
    newTimer.start();
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
    m_logPanel.setLoggingFontSize(size);
  }

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Main method to test this class.
   * 
   * @param args any arguments (unused)
   */
  public static void main(String[] args) {
    try {
<<<<<<< HEAD
      final javax.swing.JFrame jf = new javax.swing.JFrame("Status/Log Panel");
=======
<<<<<<< HEAD
      final javax.swing.JFrame jf = new javax.swing.JFrame("Status/Log Panel");
=======
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages
          .getInstance().getString("LogPanel_Main_Jf_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      jf.getContentPane().setLayout(new BorderLayout());
      final LogPanel lp = new LogPanel();
      jf.getContentPane().add(lp, BorderLayout.CENTER);

      jf.getContentPane().add(lp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });
      jf.pack();
      jf.setVisible(true);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      lp.statusMessage("Step 1|Some options here|A status message");
      lp.statusMessage("Step 2$hashkey|Status message: no options");
      Thread.sleep(3000);
      lp.statusMessage("Step 2$hashkey|Funky Chickens!!!");
      Thread.sleep(3000);
      lp.statusMessage("Step 1|Some options here|finished");
      // lp.statusMessage("Step 1|Some options here|back again!");
      Thread.sleep(3000);
      lp.statusMessage("Step 2$hashkey|ERROR! More Funky Chickens!!!");
      Thread.sleep(3000);
      lp.statusMessage("Step 2$hashkey|WARNING - now a warning...");
      Thread.sleep(3000);
      lp.statusMessage("Step 2$hashkey|Back to normal.");
      Thread.sleep(3000);
      lp.statusMessage("Step 2$hashkey|INTERRUPTED.");
<<<<<<< HEAD
=======
=======
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_First"));
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Second"));
      Thread.sleep(3000);
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Third"));
      Thread.sleep(3000);
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Fourth"));
      // lp.statusMessage("Step 1|Some options here|back again!");
      Thread.sleep(3000);
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Sixth"));
      Thread.sleep(3000);
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Seventh"));
      Thread.sleep(3000);
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Eighth"));
      Thread.sleep(3000);
      lp.statusMessage(Messages.getInstance().getString(
          "LogPanel_Main_StatusMessage_Nineth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
