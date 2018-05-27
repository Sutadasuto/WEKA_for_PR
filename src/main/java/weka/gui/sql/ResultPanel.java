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
 * ResultPanel.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.sql;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.gui.JTableHelper;
import weka.gui.sql.event.QueryExecuteEvent;
import weka.gui.sql.event.QueryExecuteListener;
import weka.gui.sql.event.ResultChangedEvent;
import weka.gui.sql.event.ResultChangedListener;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.JTableHelper;
import weka.gui.sql.event.QueryExecuteEvent;
import weka.gui.sql.event.QueryExecuteListener;
import weka.gui.sql.event.ResultChangedEvent;
import weka.gui.sql.event.ResultChangedListener;

/**
 * Represents a panel for displaying the results of a query in table format.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10222 $
 */
public class ResultPanel extends JPanel implements QueryExecuteListener,
  ChangeListener {

  /** for serialization */
  private static final long serialVersionUID = 278654800344034571L;

<<<<<<< HEAD
=======
=======
/**
 * Represents a panel for displaying the results of a query in table format.
 *
 * @author    FracPete (fracpete at waikato dot ac dot nz)
 * @version   $Revision: 7059 $
 */
public class ResultPanel 
  extends JPanel 
  implements QueryExecuteListener, ChangeListener {

  /** for serialization */
  private static final long serialVersionUID = 278654800344034571L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** the parent of this panel */
  protected JFrame m_Parent;

  /** the result change listeners */
<<<<<<< HEAD
  protected HashSet<ResultChangedListener> m_Listeners;
=======
<<<<<<< HEAD
  protected HashSet<ResultChangedListener> m_Listeners;
=======
  protected HashSet m_Listeners;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the panel where to output the queries */
  protected QueryPanel m_QueryPanel;

  /** the tabbed pane for the results */
  protected JTabbedPane m_TabbedPane;

  /** the close button */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JButton m_ButtonClose = new JButton("Close");

  /** the close all button */
  protected JButton m_ButtonCloseAll = new JButton("Close all");

  /** the button that copies the query into the QueryPanel */
  protected JButton m_ButtonCopyQuery = new JButton("Re-use query");

  /** the button for the optimal column width of the current table */
  protected JButton m_ButtonOptWidth = new JButton("Optimal width");

  /** the counter for the tab names */
  protected int m_NameCounter;

  /**
   * initializes the panel
   * 
   * @param parent the parent of this panel
   */
  public ResultPanel(JFrame parent) {
    super();

    m_Parent = parent;
    m_QueryPanel = null;
    m_NameCounter = 0;
    m_Listeners = new HashSet<ResultChangedListener>();

<<<<<<< HEAD
=======
=======
  protected JButton m_ButtonClose = new JButton(Messages.getInstance().getString("ResultPanel_ButtonClose_JButton_Text"));

  /** the close all button */
  protected JButton m_ButtonCloseAll = new JButton(Messages.getInstance().getString("ResultPanel_ButtonCloseAll_JButton_Text"));

  /** the button that copies the query into the QueryPanel */
  protected JButton m_ButtonCopyQuery = new JButton(Messages.getInstance().getString("ResultPanel_ButtonCopyQuery_JButton_Text"));

  /** the button for the optimal column width of the current table */
  protected JButton m_ButtonOptWidth = new JButton(Messages.getInstance().getString("ResultPanel_ButtonOptWidth_JButton_Text"));

  /** the counter for the tab names */
  protected int m_NameCounter;
  
  /**
   * initializes the panel
   * @param parent        the parent of this panel
   */
  public ResultPanel(JFrame parent) {
    super();
    
    m_Parent      = parent;
    m_QueryPanel  = null;
    m_NameCounter = 0;
    m_Listeners   = new HashSet();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    createPanel();
  }

  /**
   * creates the panel with all its components
   */
  protected void createPanel() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
<<<<<<< HEAD
=======
=======
    JPanel          panel;
    JPanel          panel2;
    JPanel          panel3;
    JPanel          panel4;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(0, 200));

    // tabbed pane
    m_TabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
    m_TabbedPane.addChangeListener(this);
    add(m_TabbedPane, BorderLayout.CENTER);

    // buttons
    panel = new JPanel(new BorderLayout());
    add(panel, BorderLayout.EAST);
    panel2 = new JPanel(new BorderLayout());
    panel.add(panel2, BorderLayout.CENTER);
    panel3 = new JPanel(new BorderLayout());
    panel2.add(panel3, BorderLayout.CENTER);
    panel4 = new JPanel(new BorderLayout());
    panel3.add(panel4, BorderLayout.CENTER);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_ButtonClose.setMnemonic('l');
    m_ButtonClose.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        close();
      }
    });
    panel.add(m_ButtonClose, BorderLayout.NORTH);

    m_ButtonCloseAll.setMnemonic('a');
    m_ButtonCloseAll.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        closeAll();
      }
    });
    panel2.add(m_ButtonCloseAll, BorderLayout.NORTH);

    m_ButtonCopyQuery.setMnemonic('Q');
    m_ButtonCopyQuery
      .setToolTipText("Copies the query of the currently selected tab into the query field.");
    m_ButtonCopyQuery.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        copyQuery();
      }
    });
    panel3.add(m_ButtonCopyQuery, BorderLayout.NORTH);

    m_ButtonOptWidth.setMnemonic('p');
    m_ButtonOptWidth
      .setToolTipText("Calculates the optimal column width for the current table.");
    m_ButtonOptWidth.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calcOptimalWidth();
      }
    });
<<<<<<< HEAD
=======
=======
    
    m_ButtonClose.setMnemonic('l');
    m_ButtonClose.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  close();
	}
      });
    panel.add(m_ButtonClose, BorderLayout.NORTH);
    
    m_ButtonCloseAll.setMnemonic('a');
    m_ButtonCloseAll.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  closeAll();
	}
      });
    panel2.add(m_ButtonCloseAll, BorderLayout.NORTH);
    
    m_ButtonCopyQuery.setMnemonic('Q');
    m_ButtonCopyQuery.setToolTipText(Messages.getInstance().getString("ResultPanel_CreatePanel_ButtonCopyQuery_SetToolTipText_Text"));
    m_ButtonCopyQuery.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  copyQuery();
	}
      });
    panel3.add(m_ButtonCopyQuery, BorderLayout.NORTH);
    
    m_ButtonOptWidth.setMnemonic('p');
    m_ButtonOptWidth.setToolTipText(Messages.getInstance().getString("ResultPanel_CreatePanel_ButtonOptWidth_SetToolTipText_Text"));
    m_ButtonOptWidth.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  calcOptimalWidth();
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    panel4.add(m_ButtonOptWidth, BorderLayout.NORTH);

    // dummy place holder, otherwise is the space too small for the tabbed
    // pane
    panel4.add(new JLabel(" "), BorderLayout.CENTER);
    panel4.add(new JLabel(" "), BorderLayout.SOUTH);

    // set the initial button state
    setButtons();
  }

  /**
   * sets the parameters back to standard
   */
  public void clear() {
    closeAll();
  }

  /**
   * sets the focus in a designated control
   */
  public void setFocus() {
    m_TabbedPane.requestFocus();
  }

  /**
   * sets the state of the buttons
   */
  protected void setButtons() {
<<<<<<< HEAD
    int index;
=======
<<<<<<< HEAD
    int index;
=======
    int         index;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    index = m_TabbedPane.getSelectedIndex();

    m_ButtonClose.setEnabled(index > -1);
    m_ButtonCloseAll.setEnabled(m_TabbedPane.getTabCount() > 0);
    m_ButtonCopyQuery.setEnabled(index > -1);
    m_ButtonOptWidth.setEnabled(index > -1);
  }

  /**
   * returns the next name for a tab "QueryXYZ'
   */
  protected String getNextTabName() {
    m_NameCounter++;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "Query" + m_NameCounter;
  }

  /**
   * This method gets called when a query has been executed.
   */
  @Override
  public void queryExecuted(QueryExecuteEvent evt) {
    ResultSetTable table;

    // only displayed successful queries
    if (evt.failed()) {
      return;
    }

    // DDL command like drop etc that don't create ResultSet?
    if (!evt.hasResult()) {
      return;
    }

    try {
      table = new ResultSetTable(evt.getDbUtils().getDatabaseURL(), evt
        .getDbUtils().getUsername(), evt.getDbUtils().getPassword(),
        evt.getQuery(), new ResultSetTableModel(evt.getResultSet(),
          evt.getMaxRows()));
<<<<<<< HEAD
=======
=======
    return Messages.getInstance().getString("ResultPanel_GetNextTabName_Text") + m_NameCounter;
  }
  
  /**
   * This method gets called when a query has been executed.
   */
  public void queryExecuted(QueryExecuteEvent evt) {
    ResultSetTable      table;
    
    // only displayed successful queries
    if (evt.failed())
      return;

    // DDL command like drop etc that don't create ResultSet?
    if (!evt.hasResult())
      return;

    try {
      table = new ResultSetTable(
                evt.getDbUtils().getDatabaseURL(),
                evt.getDbUtils().getUsername(),
                evt.getDbUtils().getPassword(),
                evt.getQuery(), 
                new ResultSetTableModel(evt.getResultSet(), evt.getMaxRows()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_TabbedPane.addTab(getNextTabName(), new JScrollPane(table));

      // set active tab
      m_TabbedPane.setSelectedIndex(m_TabbedPane.getTabCount() - 1);
<<<<<<< HEAD
    } catch (Exception e) {
=======
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      e.printStackTrace();
    }

    // set buttons
    setButtons();
  }

  /**
   * Invoked when the target of the listener has changed its state.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void stateChanged(ChangeEvent e) {
    // in case the tabs get clicked
    setButtons();

    // notify listeners about current query
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (getCurrentTable() != null) {
      notifyListeners(getCurrentTable().getURL(), getCurrentTable().getUser(),
        getCurrentTable().getPassword(), getCurrentTable().getQuery());
    }
<<<<<<< HEAD
=======
=======
    if (getCurrentTable() != null)
      notifyListeners(getCurrentTable().getURL(), 
                      getCurrentTable().getUser(),
                      getCurrentTable().getPassword(),
                      getCurrentTable().getQuery());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the currently set QueryPanel, can be NULL
<<<<<<< HEAD
   * 
   * @return the current QueryPanel, possibly NULL
=======
<<<<<<< HEAD
   * 
   * @return the current QueryPanel, possibly NULL
=======
   * @return        the current QueryPanel, possibly NULL
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public QueryPanel getQueryPanel() {
    return m_QueryPanel;
  }

  /**
   * sets the QueryPanel to use for displaying the query
<<<<<<< HEAD
   * 
   * @param panel the panel used for displaying the query
=======
<<<<<<< HEAD
   * 
   * @param panel the panel used for displaying the query
=======
   * @param panel   the panel used for displaying the query
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setQueryPanel(QueryPanel panel) {
    m_QueryPanel = panel;
  }

  /**
   * returns the table of the current tab, can be NULL
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the currently selected table
   */
  protected ResultSetTable getCurrentTable() {
    ResultSetTable table;
    JScrollPane pane;
    JViewport port;
    int index;
<<<<<<< HEAD
=======
=======
   * @return        the currently selected table
   */
  protected ResultSetTable getCurrentTable() {
    ResultSetTable      table;
    JScrollPane         pane;
    JViewport           port;
    int                 index;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    table = null;

    index = m_TabbedPane.getSelectedIndex();
    if (index > -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      pane = (JScrollPane) m_TabbedPane.getComponentAt(index);
      port = (JViewport) pane.getComponent(0);
      table = (ResultSetTable) port.getComponent(0);
    }

<<<<<<< HEAD
=======
=======
      pane  = (JScrollPane) m_TabbedPane.getComponentAt(index);
      port  = (JViewport) pane.getComponent(0);
      table = (ResultSetTable) port.getComponent(0);
    }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return table;
  }

  /**
   * closes the current tab
   */
  protected void close() {
<<<<<<< HEAD
    int index;
=======
<<<<<<< HEAD
    int index;
=======
    int                 index;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    index = m_TabbedPane.getSelectedIndex();

    if (index > -1) {
      try {
        getCurrentTable().finalize();
<<<<<<< HEAD
      } catch (Throwable t) {
=======
<<<<<<< HEAD
      } catch (Throwable t) {
=======
      }
      catch (Throwable t) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        System.out.println(t);
      }
      m_TabbedPane.removeTabAt(index);
    }

    // set buttons
    setButtons();
  }

  /**
   * closes all tabs
   */
  protected void closeAll() {
    while (m_TabbedPane.getTabCount() > 0) {
      m_TabbedPane.setSelectedIndex(0);
      try {
        getCurrentTable().finalize();
<<<<<<< HEAD
      } catch (Throwable t) {
=======
<<<<<<< HEAD
      } catch (Throwable t) {
=======
      }
      catch (Throwable t) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        System.out.println(t);
      }
      m_TabbedPane.removeTabAt(0);
    }

    // set buttons
    setButtons();
  }

  /**
   * copies the query of the current tab into the QueryPanel
   */
  protected void copyQuery() {
<<<<<<< HEAD
    if ((getCurrentTable() != null) && (getQueryPanel() != null)) {
      getQueryPanel().setQuery(getCurrentTable().getQuery());
    }
=======
<<<<<<< HEAD
    if ((getCurrentTable() != null) && (getQueryPanel() != null)) {
      getQueryPanel().setQuery(getCurrentTable().getQuery());
    }
=======
    if ( (getCurrentTable() != null) && (getQueryPanel() != null) )
      getQueryPanel().setQuery(getCurrentTable().getQuery());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * calculates the optimal column width for the current table
   */
  protected void calcOptimalWidth() {
<<<<<<< HEAD
    if (getCurrentTable() != null) {
      JTableHelper.setOptimalColumnWidth(getCurrentTable());
    }
=======
<<<<<<< HEAD
    if (getCurrentTable() != null) {
      JTableHelper.setOptimalColumnWidth(getCurrentTable());
    }
=======
    if (getCurrentTable() != null)
      JTableHelper.setOptimalColumnWidth(getCurrentTable());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * adds the given listener to the list of listeners
<<<<<<< HEAD
   * 
   * @param l the listener to add to the list
=======
<<<<<<< HEAD
   * 
   * @param l the listener to add to the list
=======
   * @param l       the listener to add to the list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void addResultChangedListener(ResultChangedListener l) {
    m_Listeners.add(l);
  }

  /**
   * removes the given listener from the list of listeners
<<<<<<< HEAD
   * 
   * @param l the listener to remove
=======
<<<<<<< HEAD
   * 
   * @param l the listener to remove
=======
   * @param l       the listener to remove
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void removeResultChangedListener(ResultChangedListener l) {
    m_Listeners.remove(l);
  }

  /**
   * notifies the listeners of the event
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param url the database URL
   * @param user the user
   * @param pw the password
   * @param query the query
   */
  protected void notifyListeners(String url, String user, String pw,
    String query) {
    Iterator<ResultChangedListener> iter;
    ResultChangedListener l;

    iter = m_Listeners.iterator();
    while (iter.hasNext()) {
      l = iter.next();
<<<<<<< HEAD
=======
=======
   * @param url         the database URL
   * @param user        the user
   * @param pw          the password
   * @param query       the query
   */
  protected void notifyListeners(String url, String user, 
                                 String pw, String query) {
    Iterator                iter;
    ResultChangedListener   l;

    iter = m_Listeners.iterator();
    while (iter.hasNext()) {
      l = (ResultChangedListener) iter.next();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      l.resultChanged(new ResultChangedEvent(this, url, user, pw, query));
    }
  }
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
