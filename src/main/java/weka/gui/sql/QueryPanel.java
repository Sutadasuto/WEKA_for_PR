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
 * QueryPanel.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.sql;

<<<<<<< HEAD
=======
import weka.gui.ListSelectorDialog;
import weka.gui.sql.event.ConnectionEvent;
import weka.gui.sql.event.ConnectionListener;
import weka.gui.sql.event.HistoryChangedEvent;
import weka.gui.sql.event.HistoryChangedListener;
import weka.gui.sql.event.QueryExecuteEvent;
import weka.gui.sql.event.QueryExecuteListener;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

<<<<<<< HEAD
import weka.gui.ListSelectorDialog;
import weka.gui.sql.event.ConnectionEvent;
import weka.gui.sql.event.ConnectionListener;
import weka.gui.sql.event.HistoryChangedEvent;
import weka.gui.sql.event.HistoryChangedListener;
import weka.gui.sql.event.QueryExecuteEvent;
import weka.gui.sql.event.QueryExecuteListener;

/**
 * Represents a panel for entering an SQL query.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10222 $
 */
public class QueryPanel extends JPanel implements ConnectionListener,
  CaretListener {
=======
/**
 * Represents a panel for entering an SQL query.
 *
 * @author      FracPete (fracpete at waikato dot ac dot nz)
 * @version     $Revision: 7059 $
 */
public class QueryPanel 
  extends JPanel 
  implements ConnectionListener, CaretListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization. */
  private static final long serialVersionUID = 4348967824619706636L;

  /** the name of the history. */
  public final static String HISTORY_NAME = "query";

  /** the name for the max rows in the history. */
  public final static String MAX_ROWS = "max_rows";
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** the parent of this panel. */
  protected JFrame m_Parent;

  /** the textarea for the query. */
  protected JTextArea m_TextQuery;

  /** the execute button. */
<<<<<<< HEAD
  protected JButton m_ButtonExecute = new JButton("Execute");

  /** the clear button. */
  protected JButton m_ButtonClear = new JButton("Clear");

  /** the history button. */
  protected JButton m_ButtonHistory = new JButton("History...");
=======
  protected JButton m_ButtonExecute = new JButton(Messages.getInstance().getString("QueryPanel_ButtonExecute_JButton_Text"));

  /** the clear button. */
  protected JButton m_ButtonClear = new JButton(Messages.getInstance().getString("QueryPanel_ButtonClear_JButton_Text"));

  /** the history button. */
  protected JButton m_ButtonHistory = new JButton(Messages.getInstance().getString("QueryPanel_ButtonHistory_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** the spinner for the maximum number of rows. */
  protected JSpinner m_SpinnerMaxRows = new JSpinner();

  /** the connection listeners. */
<<<<<<< HEAD
  protected HashSet<QueryExecuteListener> m_QueryExecuteListeners;

  /** the history listeners. */
  protected HashSet<HistoryChangedListener> m_HistoryChangedListeners;
=======
  protected HashSet m_QueryExecuteListeners;

  /** the history listeners. */
  protected HashSet m_HistoryChangedListeners;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for working on the database. */
  protected DbUtils m_DbUtils;

  /** whether we have a connection to a database or not. */
  protected boolean m_Connected;

  /** the query history. */
  protected DefaultListModel m_History = new DefaultListModel();
<<<<<<< HEAD

  /**
   * initializes the panel.
   * 
   * @param parent the parent of this panel
   */
  public QueryPanel(JFrame parent) {
    super();

    m_Parent = parent;
    m_QueryExecuteListeners = new HashSet<QueryExecuteListener>();
    m_HistoryChangedListeners = new HashSet<HistoryChangedListener>();
    m_DbUtils = null;
    m_Connected = false;
=======
  
  /**
   * initializes the panel.
   * 
   * @param parent        the parent of this panel
   */
  public QueryPanel(JFrame parent) {
    super();
    
    m_Parent                  = parent;
    m_QueryExecuteListeners   = new HashSet();
    m_HistoryChangedListeners = new HashSet();
    m_DbUtils                 = null;
    m_Connected               = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    createPanel();
  }

  /**
   * creates the panel with all its components.
   */
  protected void createPanel() {
<<<<<<< HEAD
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    SpinnerNumberModel model;

    setLayout(new BorderLayout());

    // textarea
    m_TextQuery = new JTextArea();
    m_TextQuery.addCaretListener(this);
    m_TextQuery.setFont(new Font("Monospaced", Font.PLAIN, m_TextQuery
      .getFont().getSize()));
=======
    JPanel              panel;
    JPanel              panel2;
    JPanel              panel3;
    SpinnerNumberModel  model;
    
    setLayout(new BorderLayout());
    
    // textarea
    m_TextQuery = new JTextArea();
    m_TextQuery.addCaretListener(this);
    m_TextQuery.setFont(
        new Font("Monospaced", Font.PLAIN, m_TextQuery.getFont().getSize()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    add(new JScrollPane(m_TextQuery), BorderLayout.CENTER);

    // buttons
    panel = new JPanel(new BorderLayout());
    add(panel, BorderLayout.EAST);
    m_ButtonExecute.setMnemonic('E');
    m_ButtonExecute.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
      public void actionPerformed(ActionEvent e) {
        execute();
      }
    });
=======
	public void actionPerformed(ActionEvent e) {
	  execute();
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    panel.add(m_ButtonExecute, BorderLayout.NORTH);
    panel2 = new JPanel(new BorderLayout());
    panel.add(panel2, BorderLayout.CENTER);
    m_ButtonClear.setMnemonic('r');
    m_ButtonClear.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
      public void actionPerformed(ActionEvent e) {
        clear();
      }
    });
=======
	public void actionPerformed(ActionEvent e) {
	  clear();
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    panel2.add(m_ButtonClear, BorderLayout.NORTH);
    panel3 = new JPanel(new BorderLayout());
    panel2.add(panel3, BorderLayout.CENTER);
    m_ButtonHistory.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
      public void actionPerformed(ActionEvent e) {
        showHistory();
      }
    });
=======
	public void actionPerformed(ActionEvent e) {
	  showHistory();
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    panel3.add(m_ButtonHistory, BorderLayout.NORTH);

    // limit
    panel3 = new JPanel(new FlowLayout());
<<<<<<< HEAD
    panel3.add(new JLabel("max. rows"));
=======
    panel3.add(new JLabel(Messages.getInstance().getString("QueryPanel_CreatePanel_Panel3_JLabel_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    panel3.add(m_SpinnerMaxRows);
    panel2.add(panel3, BorderLayout.SOUTH);
    model = (SpinnerNumberModel) m_SpinnerMaxRows.getModel();
    model.setMaximum(new Integer(Integer.MAX_VALUE));
    model.setMinimum(new Integer(0));
    model.setValue(new Integer(100));
    model.setStepSize(new Integer(100));
<<<<<<< HEAD
    m_SpinnerMaxRows.setMinimumSize(new Dimension(50, m_SpinnerMaxRows
      .getHeight()));
    m_SpinnerMaxRows.setToolTipText("with 0 all rows are retrieved");

=======
    m_SpinnerMaxRows.setMinimumSize(
        new Dimension(50, m_SpinnerMaxRows.getHeight()));
    m_SpinnerMaxRows.setToolTipText(Messages.getInstance().getString("QueryPanel_CreatePanel_SpinnerMaxRows_SetToolTipText_Text"));
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // set initial state
    setButtons();
  }

  /**
   * sets the focus in a designated control.
   */
  public void setFocus() {
    m_TextQuery.requestFocus();
  }

  /**
   * sets the buttons according to the connected-state.
   */
  protected void setButtons() {
    boolean isEmpty;
<<<<<<< HEAD

    isEmpty = m_TextQuery.getText().trim().equals("");

=======
    
    isEmpty = m_TextQuery.getText().trim().equals("");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_ButtonExecute.setEnabled((m_Connected) && (!isEmpty));
    m_ButtonClear.setEnabled(!isEmpty);
    m_ButtonHistory.setEnabled(m_History.size() > 0);
  }
<<<<<<< HEAD

  /**
   * This method gets called when the connection is either established or
   * disconnected.
   * 
   * @param evt the event
   */
  @Override
  public void connectionChange(ConnectionEvent evt) {
    m_Connected = evt.isConnected();
    m_DbUtils = evt.getDbUtils();
=======
  
  /**
   * This method gets called when the connection is either established
   * or disconnected.
   * 
   * @param evt		the event
   */
  public void connectionChange(ConnectionEvent evt) {
    m_Connected = evt.isConnected();
    m_DbUtils   = evt.getDbUtils();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setButtons();
  }

  /**
   * executes the current query.
   */
  public void execute() {
<<<<<<< HEAD
    Exception ex;
    ResultSet rs;

    // not connected?
    if (!m_ButtonExecute.isEnabled()) {
      return;
    }

    // no query?
    if (m_TextQuery.getText().trim().equals("")) {
      return;
    }

    // close old resultset
    try {
      if (m_DbUtils.getResultSet() != null) {
        m_DbUtils.close();
      }
    } catch (Exception e) {
=======
    Exception     ex;
    ResultSet     rs;
    
    // not connected?
    if (!m_ButtonExecute.isEnabled())
      return;

    // no query?
    if (m_TextQuery.getText().trim().equals(""))
      return;

    // close old resultset
    try {
      if (m_DbUtils.getResultSet() != null)
        m_DbUtils.close();
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // ignore (if no resultset present we get an unncessary NullPointerEx.)
    }

    ex = null;
    rs = null;
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    try {
      if (m_DbUtils.execute(getQuery())) {
        rs = m_DbUtils.getResultSet();
        // add to history
        addHistory(getQuery());
      }
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex = new Exception(e.getMessage());
    }

    notifyQueryExecuteListeners(rs, ex);

    setButtons();
  }

  /**
   * clears the textarea.
   */
  public void clear() {
    m_TextQuery.setText("");
    m_SpinnerMaxRows.setValue(new Integer(100));
  }

  /**
   * adds the given string to the history (removes duplicates).
   * 
<<<<<<< HEAD
   * @param s the string to add
   */
  protected void addHistory(String s) {
    if (s.equals("")) {
      return;
    }

    // no duplicates!
    if (m_History.contains(s)) {
      m_History.removeElement(s);
    }

    m_History.add(0, s);

=======
   * @param s           the string to add
   */
  protected void addHistory(String s) {
    if (s.equals(""))
      return;
    
    // no duplicates!
    if (m_History.contains(s))
      m_History.removeElement(s);

    m_History.add(0, s);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // send notification
    notifyHistoryChangedListeners();
  }

  /**
   * sets the local history to the given one.
   * 
<<<<<<< HEAD
   * @param history the history to use
   */
  public void setHistory(DefaultListModel history) {
    int i;

    m_History.clear();
    for (i = 0; i < history.size(); i++) {
      m_History.addElement(history.get(i));
    }
=======
   * @param history     the history to use
   */
  public void setHistory(DefaultListModel history) {
    int           i;
    
    m_History.clear();
    for (i = 0; i < history.size(); i++)
      m_History.addElement(history.get(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    setButtons();
  }

  /**
   * returns the history.
   * 
<<<<<<< HEAD
   * @return the current history
=======
   * @return        the current history
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public DefaultListModel getHistory() {
    return m_History;
  }

  /**
   * displays the query history.
   */
  public void showHistory() {
<<<<<<< HEAD
    JList list;
    ListSelectorDialog dialog;

    list = new JList(m_History);
    dialog = new ListSelectorDialog(m_Parent, list);

    if (dialog.showDialog() == ListSelectorDialog.APPROVE_OPTION) {
      if (list.getSelectedValue() != null) {
        setQuery(list.getSelectedValue().toString());
      }
=======
    JList                 list;
    ListSelectorDialog    dialog;

    list   = new JList(m_History);
    dialog = new ListSelectorDialog(m_Parent, list);
    
    if (dialog.showDialog() == ListSelectorDialog.APPROVE_OPTION) {
      if (list.getSelectedValue() != null)
        setQuery(list.getSelectedValue().toString());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    setButtons();
  }

  /**
   * sets the query in the textarea.
   * 
<<<<<<< HEAD
   * @param query the query to display
=======
   * @param query         the query to display
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setQuery(String query) {
    m_TextQuery.setText(query);
  }

  /**
   * returns the currently displayed query.
   * 
<<<<<<< HEAD
   * @return the query
=======
   * @return		the query
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String getQuery() {
    return m_TextQuery.getText();
  }

  /**
   * sets the maximum number of rows to display. 0 means unlimited.
   * 
<<<<<<< HEAD
   * @param rows the maximum number of rows
   */
  public void setMaxRows(int rows) {
    if (rows >= 0) {
      m_SpinnerMaxRows.setValue(new Integer(rows));
    }
=======
   * @param rows	the maximum number of rows
   */
  public void setMaxRows(int rows) {
    if (rows >= 0)
      m_SpinnerMaxRows.setValue(new Integer(rows));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * returns the current value for the maximum number of rows. 0 means
   * unlimited.
   * 
<<<<<<< HEAD
   * @return the maximum number of rows
=======
   * @return		the maximum number of rows
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getMaxRows() {
    return ((Integer) m_SpinnerMaxRows.getValue()).intValue();
  }

  /**
   * adds the given listener to the list of listeners.
   * 
<<<<<<< HEAD
   * @param l the listener to add to the list
=======
   * @param l       the listener to add to the list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void addQueryExecuteListener(QueryExecuteListener l) {
    m_QueryExecuteListeners.add(l);
  }

  /**
   * removes the given listener from the list of listeners.
   * 
<<<<<<< HEAD
   * @param l the listener to remove
=======
   * @param l       the listener to remove
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void removeQueryExecuteListener(QueryExecuteListener l) {
    m_QueryExecuteListeners.remove(l);
  }

  /**
   * notifies the listeners of the event.
   * 
<<<<<<< HEAD
   * @param rs the resultset
   * @param ex the exception
   */
  protected void notifyQueryExecuteListeners(ResultSet rs, Exception ex) {
    Iterator<QueryExecuteListener> iter;
    QueryExecuteListener l;

    iter = m_QueryExecuteListeners.iterator();
    while (iter.hasNext()) {
      l = iter.next();
      l.queryExecuted(new QueryExecuteEvent(this, m_DbUtils, getQuery(),
        getMaxRows(), rs, ex));
=======
   * @param rs		the resultset
   * @param ex		the exception
   */
  protected void notifyQueryExecuteListeners(ResultSet rs, Exception ex) {
    Iterator              iter;
    QueryExecuteListener  l;

    iter = m_QueryExecuteListeners.iterator();
    while (iter.hasNext()) {
      l = (QueryExecuteListener) iter.next();
      l.queryExecuted(
          new QueryExecuteEvent(
            this, m_DbUtils, getQuery(), getMaxRows(), rs, ex));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * adds the given listener to the list of listeners.
   * 
<<<<<<< HEAD
   * @param l the listener to add to the list
=======
   * @param l       the listener to add to the list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void addHistoryChangedListener(HistoryChangedListener l) {
    m_HistoryChangedListeners.add(l);
  }

  /**
   * removes the given listener from the list of listeners.
   * 
<<<<<<< HEAD
   * @param l the listener to remove
=======
   * @param l       the listener to remove
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void removeHistoryChangedListener(HistoryChangedListener l) {
    m_HistoryChangedListeners.remove(l);
  }

  /**
   * notifies the history listeners of the event.
   */
  protected void notifyHistoryChangedListeners() {
<<<<<<< HEAD
    Iterator<HistoryChangedListener> iter;
    HistoryChangedListener l;

    iter = m_HistoryChangedListeners.iterator();
    while (iter.hasNext()) {
      l = iter.next();
      l.historyChanged(new HistoryChangedEvent(this, HISTORY_NAME, getHistory()));
=======
    Iterator                iter;
    HistoryChangedListener  l;

    iter = m_HistoryChangedListeners.iterator();
    while (iter.hasNext()) {
      l = (HistoryChangedListener) iter.next();
      l.historyChanged(
          new HistoryChangedEvent(this, HISTORY_NAME, getHistory()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Called when the caret position is updated.
   * 
<<<<<<< HEAD
   * @param event the event
   */
  @Override
=======
   * @param event	the event
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void caretUpdate(CaretEvent event) {
    setButtons();
  }
}
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
