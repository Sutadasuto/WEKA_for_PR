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
 * SqlViewerDialog.java
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
import weka.gui.sql.event.ResultChangedEvent;
import weka.gui.sql.event.ResultChangedListener;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
<<<<<<< HEAD
import javax.swing.JCheckBox;
=======
<<<<<<< HEAD
import javax.swing.JCheckBox;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

<<<<<<< HEAD
import weka.gui.sql.event.ResultChangedEvent;
import weka.gui.sql.event.ResultChangedListener;

=======
<<<<<<< HEAD
import weka.gui.sql.event.ResultChangedEvent;
import weka.gui.sql.event.ResultChangedListener;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * A little dialog containing the SqlViewer.
 *
 * @author      FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version     $Revision: 8034 $
 */
public class SqlViewerDialog 
  extends JDialog 
  implements ResultChangedListener {

  /** for serialization. */
  private static final long serialVersionUID = -31619864037233099L;
  
  /** the parent frame. */
  protected JFrame m_Parent;
  
  /** the SQL panel. */
  protected SqlViewer m_Viewer;

  /** the panel for the buttons. */
  protected JPanel m_PanelButtons;

  /** the OK button. */
  protected JButton m_ButtonOK = new JButton("OK");

  /** the Cancel button. */
  protected JButton m_ButtonCancel = new JButton("Cancel");

  /** displays the current query. */
  protected JLabel m_LabelQuery = new JLabel("");
  
  /** whether to return sparse instances or not. */
  protected JCheckBox m_CheckBoxSparseData = new JCheckBox("Generate sparse data");

  /** the return value. */
  protected int m_ReturnValue = JOptionPane.CANCEL_OPTION;

  /** the connect string with which the query was run. */
  protected String m_URL;

  /** the user that was used to connect to the DB. */
  protected String m_User;

  /** the password that was used to connect to the DB. */
  protected String m_Password;

  /** the currently selected query. */
  protected String m_Query;
  
  /**
   * initializes the dialog.
   * 
   * @param parent	the parent frame
   */
  public SqlViewerDialog(JFrame parent) {
    super(parent, "SQL-Viewer", ModalityType.DOCUMENT_MODAL);
<<<<<<< HEAD
=======
=======
 * @version     $Revision: 7899 $
 */
public class SqlViewerDialog
  extends JDialog
  implements ResultChangedListener {

  /** for serialization */
  private static final long serialVersionUID = -31619864037233099L;

  /** the parent frame */
  protected JFrame m_Parent;

  /** the SQL panel */
  protected SqlViewer m_Viewer;

  /** the panel for the buttons */
  protected JPanel m_PanelButtons;

  /** the OK button */
  protected JButton m_ButtonOK = new JButton(Messages.getInstance().getString("SqlViewerDialog_ButtonOK_JButton_Text"));

  /** the Cancel button */
  protected JButton m_ButtonCancel = new JButton(Messages.getInstance().getString("SqlViewerDialog_ButtonCancel_JButton_Text"));

  /** displays the current query */
  protected JLabel m_LabelQuery = new JLabel("");

  /** the return value */
  protected int m_ReturnValue = JOptionPane.CANCEL_OPTION;

  /** the connect string with which the query was run */
  protected String m_URL;

  /** the user that was used to connect to the DB */
  protected String m_User;

  /** the password that was used to connect to the DB */
  protected String m_Password;

  /** the currently selected query */
  protected String m_Query;

  /**
   * initializes the dialog
   */
  public SqlViewerDialog(JFrame parent) {
    super(parent, Messages.getInstance().getString("SqlViewerDialog_SQL_Viewer_Text"), ModalityType.DOCUMENT_MODAL);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_Parent   = parent;
    m_URL      = "";
    m_User     = "";
    m_Password = "";
    m_Query    = "";
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    createDialog();
  }

  /**
<<<<<<< HEAD
   * builds the dialog and all its components.
=======
<<<<<<< HEAD
   * builds the dialog and all its components.
=======
   * builds the dialog and all its components
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void createDialog() {
    JPanel                    panel;
    JPanel                    panel2;
    final SqlViewerDialog     dialog;
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    dialog = this;
    setLayout(new BorderLayout());

    // sql panel
    m_Viewer = new SqlViewer(m_Parent);
    add(m_Viewer, BorderLayout.CENTER);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    
    panel2 = new JPanel(new BorderLayout());
    add(panel2, BorderLayout.SOUTH);
    
    // Buttons
    panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
<<<<<<< HEAD
=======
=======

    panel2 = new JPanel(new BorderLayout());
    add(panel2, BorderLayout.SOUTH);

    // Buttons
    panel = new JPanel();
    panel.setLayout(new FlowLayout());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    panel2.add(panel, BorderLayout.EAST);
    m_ButtonOK.setMnemonic('O');
    panel.add(m_ButtonOK);
    m_ButtonOK.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent evt){
	  m_ReturnValue = JOptionPane.OK_OPTION;
          // remove listener, otherwise does the disposal of resultspanel
          // change the query again!
          m_Viewer.removeResultChangedListener(dialog);
          m_Viewer.saveSize();
	  dialog.dispose();
      }
    });
    m_ButtonCancel.setMnemonic('C');
    panel.add(m_ButtonCancel);
    m_ButtonCancel.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent evt){
	  m_ReturnValue = JOptionPane.CANCEL_OPTION;
          // remove listener, otherwise does the disposal of resultspanel
          // change the query again!
          m_Viewer.removeResultChangedListener(dialog);
          m_Viewer.saveSize();
	  dialog.dispose();
      }
    });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    
    // the checkbox for sparse data
    panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(panel, BorderLayout.WEST);
    panel.add(m_CheckBoxSparseData);
    m_CheckBoxSparseData.setMnemonic('s');
    
<<<<<<< HEAD
=======
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    addWindowListener(new WindowAdapter() {
      /**
       * Invoked when a window is in the process of being closed.
       */
      public void windowClosing(WindowEvent e) {
	m_Viewer.saveSize();
      }
    });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   
    // current Query
    panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel2.add(panel, BorderLayout.CENTER);
    panel.add(m_LabelQuery);
    
<<<<<<< HEAD
=======
=======

    // current Query
    panel = new JPanel(new FlowLayout());
    panel2.add(panel, BorderLayout.CENTER);
    panel.add(m_LabelQuery);

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    pack();
    getRootPane().setDefaultButton(m_ButtonOK);
    setResizable(true);

    // listener
    m_Viewer.addResultChangedListener(this);
  }

  /**
<<<<<<< HEAD
   * displays the dialog if TRUE.
   * 
   * @param b		if true displaying the dialog, hiding otherwise
=======
<<<<<<< HEAD
   * displays the dialog if TRUE.
   * 
   * @param b		if true displaying the dialog, hiding otherwise
=======
   * displays the dialog if TRUE
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setVisible(boolean b) {
    if (b)
      m_ReturnValue = JOptionPane.CANCEL_OPTION;

    super.setVisible(b);
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // free up memory
    if (b)
      m_Viewer.clear();
  }

  /**
   * returns whether the user clicked OK (JOptionPane.OK_OPTION) or whether he
<<<<<<< HEAD
   * cancelled the dialog (JOptionPane.CANCEL_OPTION).
   * @return		the return value
   * @see		JOptionPane
=======
<<<<<<< HEAD
   * cancelled the dialog (JOptionPane.CANCEL_OPTION).
   * @return		the return value
   * @see		JOptionPane
=======
   * cancelled the dialog (JOptionPane.CANCEL_OPTION)
   * @return      the return value
   * @see         JOptionPane
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public int getReturnValue() {
    return m_ReturnValue;
  }

  /**
<<<<<<< HEAD
   * returns the chosen URL, if any.
   * 
   * @return		the URL
=======
<<<<<<< HEAD
   * returns the chosen URL, if any.
   * 
   * @return		the URL
=======
   * returns the chosen URL, if any
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getURL() {
    return m_URL;
  }

  /**
<<<<<<< HEAD
   * returns the chosen user, if any.
   * 
   * @return		the user
=======
<<<<<<< HEAD
   * returns the chosen user, if any.
   * 
   * @return		the user
=======
   * returns the chosen user, if any
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getUser() {
    return m_User;
  }

  /**
<<<<<<< HEAD
   * returns the chosen password, if any.
   * 
   * @return		the password
=======
<<<<<<< HEAD
   * returns the chosen password, if any.
   * 
   * @return		the password
=======
   * returns the chosen password, if any
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getPassword() {
    return m_Password;
  }

  /**
<<<<<<< HEAD
   * returns the chosen query, if any.
   * 
   * @return		the query
=======
<<<<<<< HEAD
   * returns the chosen query, if any.
   * 
   * @return		the query
=======
   * returns the chosen query, if any
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getQuery() {
    return m_Query;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  /**
   * Returns whether sparse data is generated.
   * 
   * @return		true if sparse data is to be generated
   */
  public boolean getGenerateSparseData() {
    return m_CheckBoxSparseData.isSelected();
  }

  /**
   * This method gets called when a query has been executed.
   * 
   * @param evt		the event
<<<<<<< HEAD
=======
=======

  /**
   * This method gets called when a query has been executed.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void resultChanged(ResultChangedEvent evt) {
    m_URL      = evt.getURL();
    m_User     = evt.getUser();
    m_Password = evt.getPassword();
    m_Query    = evt.getQuery();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_LabelQuery.setText("Current query: " + m_Query);
  }

  /**
   * for testing only.
   * 
   * @param args	ignored
<<<<<<< HEAD
=======
=======
    m_LabelQuery.setText(Messages.getInstance().getString("SqlViewerDialog_ResultChanged_Text") + m_Query);
  }

  /**
   * for testing only
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    SqlViewerDialog       dialog;

    dialog = new SqlViewerDialog(null);
    dialog.setDefaultCloseOperation(SqlViewerDialog.DISPOSE_ON_CLOSE);
    dialog.setVisible(true);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    System.out.println("ReturnValue = " + dialog.getReturnValue());
    if (dialog.getReturnValue() == JOptionPane.OK_OPTION) {
      System.out.println("URL      = " + dialog.getURL());
      System.out.println("User     = " + dialog.getUser());
      System.out.println("Password = " + dialog.getPassword().replaceAll(".", "*"));
      System.out.println("Query    = " + dialog.getQuery());
<<<<<<< HEAD
=======
=======
    System.out.println(Messages.getInstance().getString("SqlViewerDialog_Main_Text_First") + dialog.getReturnValue());
    if (dialog.getReturnValue() == JOptionPane.OK_OPTION) {
      System.out.println(Messages.getInstance().getString("SqlViewerDialog_Main_Text_Second") + dialog.getURL());
      System.out.println(Messages.getInstance().getString("SqlViewerDialog_Main_Text_Third") + dialog.getUser());
      System.out.println(Messages.getInstance().getString("SqlViewerDialog_Main_Text_Fourth") + dialog.getPassword().replaceAll(".", "*"));
      System.out.println(Messages.getInstance().getString("SqlViewerDialog_Main_Text_Fifth") + dialog.getQuery());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }
}

