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
 *    DatabaseConnectionDialog.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/** 
 * A dialog to enter URL, username and password for a database connection.
 *
 * @author Dale Fletcher (dale@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class DatabaseConnectionDialog
  extends JDialog {

  /** for serialization */
  private static final long serialVersionUID = -1081946748666245054L;

  /* URL field and label */
  protected JTextField m_DbaseURLText;
  protected JLabel m_DbaseURLLab;

  /* Username field and label */
  protected JTextField m_UserNameText; 
  protected JLabel m_UserNameLab;

  /* Password field and label */
  protected JPasswordField m_PasswordText; 
  protected JLabel m_PasswordLab;

  /* Debug checkbox and label */
  protected JCheckBox m_DebugCheckBox; 
  protected JLabel m_DebugLab;
  
  /* whether dialog was cancel'ed or OK'ed */
  protected int m_returnValue;

  /**
   * Create database connection dialog.
   *
   * @param parentFrame the parent frame of the dialog
   */
  public DatabaseConnectionDialog(Frame parentFrame) {
    this(parentFrame, "", "");
  }
  
  /**
   * Create database connection dialog.
   *
   * @param parentFrame the parent frame of the dialog
   * @param url initial text for URL field
   * @param uname initial text for username field
   */
  public DatabaseConnectionDialog(Frame parentFrame, String url, String uname) {
    this(parentFrame, url, uname, true);
  }
  
  /**
   * Create database connection dialog.
   *
   * @param parentFrame the parent frame of the dialog
   * @param url initial text for URL field
   * @param uname initial text for username field
   * @param debug whether to display the debug checkbox
   */
  public DatabaseConnectionDialog(Frame parentFrame, String url, String uname, boolean debug) {
<<<<<<< HEAD
    super(parentFrame,"Database Connection Parameters", true);
=======
<<<<<<< HEAD
    super(parentFrame,"Database Connection Parameters", true);
=======
    super(parentFrame,Messages.getInstance().getString("DatabaseConnectionDialog_Text"), true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    DbConnectionDialog(url, uname, debug);
  }

  /**
   * Returns URL from dialog 
   *
   * @return URL string
   */
  public String getURL(){
    return(m_DbaseURLText.getText());
  }

  /**
   * Returns Username from dialog 
   *
   * @return Username string
   */ 
  public String getUsername(){
    return(m_UserNameText.getText());
  }

  /**
   * Returns password from dialog 
   *
   * @return Password string
   */
  public String getPassword(){
    return(new String(m_PasswordText.getPassword()));
  }
  
  /**
   * Returns the debug flag
   * 
   * @return true if debugging should be enabled
   */
  public boolean getDebug() {
    return m_DebugCheckBox.isSelected();
  }

  /**
   * Returns which of OK or cancel was clicked from dialog 
   *
   * @return either JOptionPane.OK_OPTION or JOptionPane.CLOSED_OPTION
   */
  public int getReturnValue(){
    return(m_returnValue);
  }
  
  /**
   * Display the database connection dialog
   *
   * @param url initial text for URL field
   * @param uname initial text for username field
   */
  public void DbConnectionDialog(String url, String uname) {
    DbConnectionDialog(url, uname, true);
  }
  
  /**
   * Display the database connection dialog
   *
   * @param url initial text for URL field
   * @param uname initial text for username field
   * @param debug whether to display the debug checkbox
   */
  public void DbConnectionDialog(String url, String uname, boolean debug) {

    JPanel DbP = new JPanel();
    if (debug)
      DbP.setLayout(new GridLayout(5, 1));
    else
      DbP.setLayout(new GridLayout(4, 1));
    
    m_DbaseURLText = new JTextField(url,50); 
<<<<<<< HEAD
    m_DbaseURLLab = new JLabel(" Database URL", SwingConstants.LEFT);
=======
<<<<<<< HEAD
    m_DbaseURLLab = new JLabel(" Database URL", SwingConstants.LEFT);
=======
    m_DbaseURLLab = new JLabel(Messages.getInstance().getString("DbConnectionDialog_DbaseURLLab_JLabel_Text"), SwingConstants.LEFT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_DbaseURLLab.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_DbaseURLLab.setDisplayedMnemonic('D');
    m_DbaseURLLab.setLabelFor(m_DbaseURLText);

    m_UserNameText = new JTextField(uname,25); 
<<<<<<< HEAD
    m_UserNameLab = new JLabel(" Username    ", SwingConstants.LEFT);
=======
<<<<<<< HEAD
    m_UserNameLab = new JLabel(" Username    ", SwingConstants.LEFT);
=======
    m_UserNameLab = new JLabel(Messages.getInstance().getString("DbConnectionDialog_UserNameLab_JLabel_Text"), SwingConstants.LEFT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_UserNameLab.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_UserNameLab.setDisplayedMnemonic('U');
    m_UserNameLab.setLabelFor(m_UserNameText);

    m_PasswordText = new JPasswordField(25); 
<<<<<<< HEAD
    m_PasswordLab = new JLabel(" Password    ", SwingConstants.LEFT);
=======
<<<<<<< HEAD
    m_PasswordLab = new JLabel(" Password    ", SwingConstants.LEFT);
=======
    m_PasswordLab = new JLabel(Messages.getInstance().getString("DbConnectionDialog_PasswordLab_JLabel_Text"), SwingConstants.LEFT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_PasswordLab.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_PasswordLab.setDisplayedMnemonic('P');
    m_PasswordLab.setLabelFor(m_PasswordText);

    m_DebugCheckBox = new JCheckBox(); 
<<<<<<< HEAD
    m_DebugLab = new JLabel(" Debug       ", SwingConstants.LEFT);
=======
<<<<<<< HEAD
    m_DebugLab = new JLabel(" Debug       ", SwingConstants.LEFT);
=======
    m_DebugLab = new JLabel(Messages.getInstance().getString("DbConnectionDialog_DebugLab_JLabel_Text"), SwingConstants.LEFT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_DebugLab.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_DebugLab.setDisplayedMnemonic('P');
    m_DebugLab.setLabelFor(m_DebugCheckBox);

    JPanel urlP = new JPanel();   
    urlP.setLayout(new FlowLayout(FlowLayout.LEFT));
    urlP.add(m_DbaseURLLab);
    urlP.add(m_DbaseURLText);
    DbP.add(urlP);

    JPanel usernameP = new JPanel();   
    usernameP.setLayout(new FlowLayout(FlowLayout.LEFT));
    usernameP.add(m_UserNameLab);
    usernameP.add(m_UserNameText);
    DbP.add(usernameP);

    JPanel passwordP = new JPanel();   
    passwordP.setLayout(new FlowLayout(FlowLayout.LEFT));
    passwordP.add(m_PasswordLab);
    passwordP.add(m_PasswordText);
    DbP.add(passwordP);

    if (debug) {
      JPanel debugP = new JPanel();   
      debugP.setLayout(new FlowLayout(FlowLayout.LEFT));
      debugP.add(m_DebugLab);
      debugP.add(m_DebugCheckBox);
      DbP.add(debugP);
    }

    JPanel buttonsP = new JPanel();
    buttonsP.setLayout(new FlowLayout());
    JButton ok,cancel;
<<<<<<< HEAD
    buttonsP.add(ok = new JButton("OK"));
    buttonsP.add(cancel=new JButton("Cancel"));
=======
<<<<<<< HEAD
    buttonsP.add(ok = new JButton("OK"));
    buttonsP.add(cancel=new JButton("Cancel"));
=======
    buttonsP.add(ok = new JButton(Messages.getInstance().getString("DbConnectionDialog_ButtonP_JButton_OK_Text")));
    buttonsP.add(cancel=new JButton(Messages.getInstance().getString("DbConnectionDialog_ButtonP_JButton_Cancel_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ok.setMnemonic('O');
    ok.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent evt){
	  m_returnValue=JOptionPane.OK_OPTION;
	  DatabaseConnectionDialog.this.dispose();
      }
    });
    cancel.setMnemonic('C');
    cancel.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent evt){
	  m_returnValue=JOptionPane.CLOSED_OPTION;
	  DatabaseConnectionDialog.this.dispose();
      }
    });
    
    // Listen for window close events
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent e) {
<<<<<<< HEAD
          System.err.println("Cancelled!!");
=======
<<<<<<< HEAD
          System.err.println("Cancelled!!");
=======
          System.err.println(Messages.getInstance().getString("DbConnectionDialog_WindowClosing_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_returnValue = JOptionPane.CLOSED_OPTION;
        }
      });
   
    DbP.add(buttonsP);
    this.getContentPane().add(DbP,BorderLayout.CENTER);
    this.pack();
    getRootPane().setDefaultButton(ok);
    setResizable(false);
  }
  
  /**
   * for testing only
   */
  public static void main(String[] args){
<<<<<<< HEAD
    DatabaseConnectionDialog dbd= new DatabaseConnectionDialog(null,"URL","username");
=======
<<<<<<< HEAD
    DatabaseConnectionDialog dbd= new DatabaseConnectionDialog(null,"URL","username");
=======
    DatabaseConnectionDialog dbd= new DatabaseConnectionDialog(null,Messages.getInstance().getString("DbConnectionDialog_Main_URL_Text"), Messages.getInstance().getString("DbConnectionDialog_Main_Username_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    dbd.setVisible(true);
    System.out.println(dbd.getReturnValue()+":"+dbd.getUsername()+":"+dbd.getPassword()+":"+dbd.getURL());
  }
}




