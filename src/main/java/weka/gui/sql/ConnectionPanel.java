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
 * ConnectionPanel.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.gui.sql;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import weka.gui.ComponentHelper;
import weka.gui.DatabaseConnectionDialog;
import weka.gui.ExtensionFileFilter;
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.gui.sql;

import weka.gui.DatabaseConnectionDialog;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.gui.ListSelectorDialog;
import weka.gui.sql.event.ConnectionEvent;
import weka.gui.sql.event.ConnectionListener;
import weka.gui.sql.event.HistoryChangedEvent;
import weka.gui.sql.event.HistoryChangedListener;

<<<<<<< HEAD
/**
 * Enables the user to insert a database URL, plus user/password to connect to
 * this database.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14497 $
 */
public class ConnectionPanel extends JPanel implements CaretListener {

  /** for serialization. */
  static final long serialVersionUID = 3499317023969723490L;

  /** the name of the history. */
  public final static String HISTORY_NAME = "connection";

  /** the parent frame. */
  protected JFrame m_Parent = null;

  /** the database connection dialog. */
=======
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

/**
 * Enables the user to insert a database URL, plus user/password to connect
 * to this database.
 *
 * @author      FracPete (fracpete at waikato dot ac dot nz)
 * @version     $Revision: 7059 $
 */
public class ConnectionPanel 
  extends JPanel 
  implements CaretListener {

  /** for serialization. */
  static final long serialVersionUID = 3499317023969723490L;
  
  /** the name of the history. */
  public final static String HISTORY_NAME = "connection";
  
  /** the parent frame. */
  protected JFrame m_Parent = null;
  
  /** the databae connection dialog. */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected DatabaseConnectionDialog m_DbDialog;

  /** the URL to use. */
  protected String m_URL = "";

  /** the user to use for connecting to the DB. */
  protected String m_User = "";

  /** the password to use for connecting to the DB. */
  protected String m_Password = "";

  /** the label for the URL. */
<<<<<<< HEAD
  protected JLabel m_LabelURL = new JLabel("URL ");
=======
  protected JLabel m_LabelURL = new JLabel(Messages.getInstance().getString("ConnectionPanel_LabelURL_JLabel_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** the textfield for the URL. */
  protected JTextField m_TextURL = new JTextField(40);

  /** the button for the DB-Dialog. */
<<<<<<< HEAD
  protected JButton m_ButtonDatabase = new JButton(
    ComponentHelper.getImageIcon("user.png"));

  /** the button for connecting to the database. */
  protected JButton m_ButtonConnect = new JButton(
    ComponentHelper.getImageIcon("connect.png"));

  /** the button for the history. */
  protected JButton m_ButtonHistory = new JButton(
    ComponentHelper.getImageIcon("history.png"));

  /** the button for the setup. */
  protected JButton m_ButtonSetup = new JButton(
    ComponentHelper.getImageIcon("properties.gif"));

  /** the connection listeners. */
  protected HashSet<ConnectionListener> m_ConnectionListeners;

  /** the history listeners. */
  protected HashSet<HistoryChangedListener> m_HistoryChangedListeners;
=======
  protected JButton m_ButtonDatabase = new JButton(Messages.getInstance().getString("ConnectionPanel_ButtonDatabase_JButton_Text"));

  /** the button for connecting to the database. */
  protected JButton m_ButtonConnect = new JButton(Messages.getInstance().getString("ConnectionPanel_ButtonConnect_JButton_Text"));

  /** the button for the history. */
  protected JButton m_ButtonHistory = new JButton(Messages.getInstance().getString("ConnectionPanel_ButtonHistory_JButton_Text"));

  /** the connection listeners. */
  protected HashSet m_ConnectionListeners;

  /** the history listeners. */
  protected HashSet m_HistoryChangedListeners;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for connecting to the database. */
  protected DbUtils m_DbUtils;

  /** the history of connections. */
  protected DefaultListModel m_History = new DefaultListModel();

<<<<<<< HEAD
  /** the file chooser for the setup files. */
  protected JFileChooser m_SetupFileChooser;

  /**
   * initializes the panel.
   * 
   * @param parent the parent of this panel
   */
  public ConnectionPanel(JFrame parent) {
    super();

    m_Parent = parent;
    m_ConnectionListeners = new HashSet<ConnectionListener>();
    m_HistoryChangedListeners = new HashSet<HistoryChangedListener>();
    m_SetupFileChooser = new JFileChooser();
    m_SetupFileChooser.setDialogTitle("Switch database setup");
    m_SetupFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    m_SetupFileChooser.setMultiSelectionEnabled(false);
    m_SetupFileChooser.setAcceptAllFileFilterUsed(true);
    ExtensionFileFilter filter = new ExtensionFileFilter(".props",
      "Properties file");
    m_SetupFileChooser.addChoosableFileFilter(filter);
    m_SetupFileChooser.setFileFilter(filter);

    try {
      m_DbUtils = new DbUtils();
      m_URL = m_DbUtils.getDatabaseURL();
      m_User = m_DbUtils.getUsername();
      m_Password = m_DbUtils.getPassword();
    } catch (Exception e) {
      e.printStackTrace();
      m_URL = "";
      m_User = "";
      m_Password = "";
    }

=======
  /**
   * initializes the panel.
   * 
   * @param parent      the parent of this panel
   */
  public ConnectionPanel(JFrame parent) {
    super();
    
    m_Parent                  = parent;
    m_ConnectionListeners     = new HashSet();
    m_HistoryChangedListeners = new HashSet();
    
    try {
      m_DbUtils   = new DbUtils();
      m_URL       = m_DbUtils.getDatabaseURL();
      m_User      = m_DbUtils.getUsername();
      m_Password  = m_DbUtils.getPassword();
    }
    catch (Exception e) {
      e.printStackTrace();
      m_URL      = "";
      m_User     = "";
      m_Password = "";
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    createPanel();
  }

  /**
   * builds the panel with all its components.
   */
  protected void createPanel() {
<<<<<<< HEAD
    JPanel panel;
    JPanel panel2;

=======
    JPanel        panel;
    JPanel        panel2;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setLayout(new BorderLayout());
    panel2 = new JPanel(new FlowLayout());
    add(panel2, BorderLayout.WEST);

    // label
    m_LabelURL.setLabelFor(m_ButtonDatabase);
    m_LabelURL.setDisplayedMnemonic('U');
    panel2.add(m_LabelURL);

    // editfield
    m_TextURL.setText(m_URL);
    m_TextURL.addCaretListener(this);
    panel2.add(m_TextURL);
<<<<<<< HEAD

    // buttons
    panel = new JPanel(new FlowLayout());
    panel2.add(panel);

    m_ButtonDatabase.setToolTipText("Set user and password");
    m_ButtonDatabase.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        showDialog();
      }
    });
    panel.add(m_ButtonDatabase);

    m_ButtonConnect.setToolTipText("Connect to the database");
    m_ButtonConnect.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        connect();
      }
    });
    panel.add(m_ButtonConnect);

    m_ButtonHistory.setToolTipText("Select a previously used connection");
    m_ButtonHistory.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        showHistory();
      }
    });
    panel.add(m_ButtonHistory);

    m_ButtonSetup.setToolTipText("Switch database setup");
    m_ButtonSetup.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        switchSetup();
      }
    });
    panel.add(m_ButtonSetup);

=======
    
    // buttons
    panel = new JPanel(new FlowLayout());
    panel2.add(panel);
    
    m_ButtonDatabase.setMnemonic('s');
    m_ButtonDatabase.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  showDialog();
	}
      });
    panel.add(m_ButtonDatabase);
    
    m_ButtonConnect.setMnemonic('n');
    m_ButtonConnect.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  connect();
	}
      });
    panel.add(m_ButtonConnect);

    m_ButtonHistory.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  showHistory();
	}
      });
    panel.add(m_ButtonHistory);

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setButtons();
  }

  /**
   * sets the buttons according to the connected-state.
   */
  protected void setButtons() {
    boolean isEmpty;
<<<<<<< HEAD

    isEmpty = m_TextURL.getText().equals("");

    m_ButtonConnect.setEnabled(!isEmpty);
    m_ButtonDatabase.setEnabled(!isEmpty);
    m_ButtonHistory.setEnabled(m_History.size() > 0);
    m_ButtonSetup.setEnabled(true);
=======
    
    isEmpty = m_TextURL.getText().equals("");
    
    m_ButtonConnect.setEnabled(!isEmpty);
    m_ButtonDatabase.setEnabled(!isEmpty);
    m_ButtonHistory.setEnabled(m_History.size() > 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * sets the parameters back to standard.
   */
  public void clear() {
    setURL(m_DbUtils.getDatabaseURL());
    setUser(m_DbUtils.getUsername());
    setPassword(m_DbUtils.getPassword());
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * sets the focus in a designated control.
   */
  public void setFocus() {
    m_TextURL.requestFocus();
  }

  /**
   * sets the URL.
   * 
<<<<<<< HEAD
   * @param url the new value of the URL
=======
   * @param url       the new value of the URL
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setURL(String url) {
    m_URL = url;
    m_TextURL.setText(url);
  }

  /**
   * returns the current URL.
   * 
   * @return the current URL
   */
  public String getURL() {
    m_URL = m_TextURL.getText();
    return m_URL;
  }

  /**
   * sets the User.
   * 
<<<<<<< HEAD
   * @param user the new value of the User
=======
   * @param user       the new value of the User
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setUser(String user) {
    m_User = user;
  }

  /**
   * returns the current User.
   * 
   * @return the current user
   */
  public String getUser() {
    return m_User;
  }

  /**
   * sets the Password.
   * 
<<<<<<< HEAD
   * @param pw the new value of the Password
=======
   * @param pw       the new value of the Password
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setPassword(String pw) {
    m_Password = pw;
  }

  /**
   * returns the current Password.
   * 
   * @return the current password
   */
  public String getPassword() {
    return m_Password;
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
   * displays the database dialog.
   */
  protected void showDialog() {
<<<<<<< HEAD
    JFrame parent = m_Parent;
    if (parent == null) {
      Window window = SwingUtilities.getWindowAncestor(this);
      if (window instanceof JFrame) {
        parent = (JFrame)window;
      }
    }
    m_DbDialog = new DatabaseConnectionDialog(parent, getURL(), getUser(),
      false);
    m_DbDialog.setLocationRelativeTo(parent);
=======
    m_DbDialog = new DatabaseConnectionDialog(m_Parent, getURL(), getUser(), false);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_DbDialog.setVisible(true);
    if (m_DbDialog.getReturnValue() == JOptionPane.OK_OPTION) {
      setURL(m_DbDialog.getURL());
      setUser(m_DbDialog.getUsername());
      setPassword(m_DbDialog.getPassword());
    }

    setButtons();
  }

  /**
   * connects to the database, notifies the listeners.
   */
  protected void connect() {
    // disconnect if still connected
    if (m_DbUtils.isConnected()) {
      try {
        m_DbUtils.disconnectFromDatabase();
        notifyConnectionListeners(ConnectionEvent.DISCONNECT);
<<<<<<< HEAD
      } catch (Exception e) {
=======
      }
      catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        e.printStackTrace();
        notifyConnectionListeners(ConnectionEvent.DISCONNECT, e);
      }
    }

    // connect
    try {
      m_DbUtils.setDatabaseURL(getURL());
      m_DbUtils.setUsername(getUser());
      m_DbUtils.setPassword(getPassword());
      m_DbUtils.connectToDatabase();
      notifyConnectionListeners(ConnectionEvent.CONNECT);
      // add to history
      addHistory(getUser() + "@" + getURL());
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      notifyConnectionListeners(ConnectionEvent.CONNECT, e);
    }

    setButtons();
  }

  /**
   * displays the query history.
   */
  public void showHistory() {
<<<<<<< HEAD
    JList list;
    ListSelectorDialog dialog;
    String tmpStr;

    list = new JList(m_History);
    dialog = new ListSelectorDialog(m_Parent, list);

=======
    JList                 list;
    ListSelectorDialog    dialog;
    String                tmpStr;

    list   = new JList(m_History);
    dialog = new ListSelectorDialog(m_Parent, list);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (dialog.showDialog() == ListSelectorDialog.APPROVE_OPTION) {
      if (list.getSelectedValue() != null) {
        tmpStr = list.getSelectedValue().toString();
        if (tmpStr.indexOf("@") > -1) {
          setUser(tmpStr.substring(0, tmpStr.indexOf("@")));
          setURL(tmpStr.substring(tmpStr.indexOf("@") + 1));
          showDialog();
<<<<<<< HEAD
        } else {
=======
        }
        else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          setUser("");
          setURL(tmpStr);
        }
      }
    }

    setButtons();
  }

  /**
<<<<<<< HEAD
   * Lets the user select a props file for changing the database connection
   * parameters.
   */
  public void switchSetup() {
    int retVal;

    retVal = m_SetupFileChooser.showOpenDialog(this);
    if (retVal != JFileChooser.APPROVE_OPTION) {
      return;
    }

    m_DbUtils.initialize(m_SetupFileChooser.getSelectedFile());

    m_URL = m_DbUtils.getDatabaseURL();
    m_User = m_DbUtils.getUsername();
    m_Password = m_DbUtils.getPassword();

    m_TextURL.setText(m_URL);
  }

  /**
   * adds the given listener to the list of listeners.
   * 
   * @param l the listener to add to the list
=======
   * adds the given listener to the list of listeners.
   * 
   * @param l       the listener to add to the list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void addConnectionListener(ConnectionListener l) {
    m_ConnectionListeners.add(l);
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
  public void removeConnectionListener(ConnectionListener l) {
    m_ConnectionListeners.remove(l);
  }

  /**
   * notifies the connection listeners of the event.
   * 
<<<<<<< HEAD
   * @param type the type of the action, CONNECT or DISCONNECT
=======
   * @param type      the type of the action, CONNECT or DISCONNECT
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void notifyConnectionListeners(int type) {
    notifyConnectionListeners(type, null);
  }

  /**
   * notifies the connection listeners of the event.
   * 
<<<<<<< HEAD
   * @param type the type of the action, CONNECT or DISCONNECT
   * @param ex an optional exception that happened (indicates failure!)
   */
  protected void notifyConnectionListeners(int type, Exception ex) {
    Iterator<ConnectionListener> iter;
    ConnectionListener l;

    iter = m_ConnectionListeners.iterator();
    while (iter.hasNext()) {
      l = iter.next();
      l.connectionChange(new ConnectionEvent(this, type, m_DbUtils, ex));
=======
   * @param type      the type of the action, CONNECT or DISCONNECT
   * @param ex        an optional exception that happened (indicates failure!)
   */
  protected void notifyConnectionListeners(int type, Exception ex) {
    Iterator              iter;
    ConnectionListener    l;

    iter = m_ConnectionListeners.iterator();
    while (iter.hasNext()) {
      l = (ConnectionListener) iter.next();
      l.connectionChange(
          new ConnectionEvent(this, type, m_DbUtils, ex));
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
   * @param event the event to process
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void caretUpdate(CaretEvent event) {
    setButtons();
  }
}
