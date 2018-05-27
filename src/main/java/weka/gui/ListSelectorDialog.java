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
 *    ListSelectorDialog.java
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
import java.awt.*;
=======
<<<<<<< HEAD
import java.awt.*;
=======
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

<<<<<<< HEAD
/** 
=======
<<<<<<< HEAD
/** 
=======
/**
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * A dialog to present the user with a list of items, that the user can
 * make a selection from, or cancel the selection.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 14497 $
=======
<<<<<<< HEAD
 * @version $Revision: 14497 $
=======
 * @version $Revision: 7899 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class ListSelectorDialog
  extends JDialog {

  /** for serialization */
  private static final long serialVersionUID = 906147926840288895L;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  /** Click to choose the currently selected property */
  protected JButton m_SelectBut = new JButton("Select");

  /** Click to cancel the property selection */
  protected JButton m_CancelBut = new JButton("Cancel");

  /** Click to enter a regex pattern for selection */
  protected JButton m_PatternBut = new JButton("Pattern");

  /** The list component */
  protected JList m_List;
  
<<<<<<< HEAD
=======
=======

  /** Click to choose the currently selected property */
  protected JButton m_SelectBut = new JButton(Messages.getInstance().getString("ListSelectorDialog_SelectBut_JButton_Text"));

  /** Click to cancel the property selection */
  protected JButton m_CancelBut = new JButton(Messages.getInstance().getString("ListSelectorDialog_CancelBut_JButton_Text"));

  /** Click to enter a regex pattern for selection */
  protected JButton m_PatternBut = new JButton(Messages.getInstance().getString("ListSelectorDialog_PatternBut_JButton_Text"));

  /** The list component */
  protected JList m_List;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Whether the selection was made or cancelled */
  protected int m_Result;

  /** Signifies an OK property selection */
  public static final int APPROVE_OPTION = 0;

  /** Signifies a cancelled property selection */
  public static final int CANCEL_OPTION = 1;

  /** The current regular expression. */
  protected String m_PatternRegEx = ".*";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  /**
   * Create the list selection dialog.
   *
   * @param parentFrame the parent window of the dialog
   * @param userList the JList component the user will select from
   */
  public ListSelectorDialog(Window parentFrame, JList userList) {
    
    super(parentFrame, "Select items", ModalityType.DOCUMENT_MODAL);
<<<<<<< HEAD
=======
=======

  /**
   * Create the list selection dialog.
   *
   * @param parentFrame the parent frame of the dialog
   * @param userList the JList component the user will select from
   */
  public ListSelectorDialog(Frame parentFrame, JList userList) {

    super(parentFrame, Messages.getInstance().getString("ListSelectorDialog_Text"), ModalityType.DOCUMENT_MODAL);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_List = userList;
    m_CancelBut.setMnemonic('C');
    m_CancelBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	m_Result = CANCEL_OPTION;
	setVisible(false);
      }
    });
    m_SelectBut.setMnemonic('S');
    m_SelectBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	m_Result = APPROVE_OPTION;
	setVisible(false);
      }
    });
    m_PatternBut.setMnemonic('P');
    m_PatternBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        selectPattern();
      }
    });
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    //    setBorder(BorderFactory.createTitledBorder("Select a property"));
    Box b1 = new Box(BoxLayout.X_AXIS);
    b1.add(m_SelectBut);
    b1.add(Box.createHorizontalStrut(10));
    b1.add(m_PatternBut);
    b1.add(Box.createHorizontalStrut(10));
    b1.add(m_CancelBut);
    c.add(b1, BorderLayout.SOUTH);
    c.add(new JScrollPane(m_List), BorderLayout.CENTER);

    getRootPane().setDefaultButton(m_SelectBut);
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    pack();

    // make sure, it's not bigger than the screen
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int width  = getWidth() > screen.getWidth() 
                    ? (int) screen.getWidth() : getWidth();
    int height = getHeight() > screen.getHeight() 
                    ? (int) screen.getHeight() : getHeight();
    setSize(width, height);
    setLocationRelativeTo(parentFrame);
<<<<<<< HEAD
=======
=======
    int width  = getWidth() > screen.getWidth()
                    ? (int) screen.getWidth() : getWidth();
    int height = getHeight() > screen.getHeight()
                    ? (int) screen.getHeight() : getHeight();
    setSize(width, height);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Pops up the modal dialog and waits for cancel or a selection.
   *
   * @return either APPROVE_OPTION, or CANCEL_OPTION
   */
  public int showDialog() {

    m_Result = CANCEL_OPTION;
    int [] origSelected = m_List.getSelectedIndices();
    setVisible(true);
    if (m_Result == CANCEL_OPTION) {
      m_List.setSelectedIndices(origSelected);
    }
    return m_Result;
  }

  /**
   * opens a separate dialog for entering a regex pattern for selecting
   * elements from the provided list
   */
  protected void selectPattern() {
    String pattern = JOptionPane.showInputDialog(
                        m_PatternBut.getParent(),
<<<<<<< HEAD
                        "Enter a Perl regular expression ('.*' for all)",
=======
<<<<<<< HEAD
                        "Enter a Perl regular expression ('.*' for all)",
=======
                        Messages.getInstance().getString("ListSelectorDialog_SelectPattern_Pattern_JOptionPaneShowInputDialog_Text"),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                        m_PatternRegEx);
    if (pattern != null) {
      try {
        Pattern.compile(pattern);
        m_PatternRegEx = pattern;
        m_List.clearSelection();
        for (int i = 0; i < m_List.getModel().getSize(); i++) {
          if (Pattern.matches(
                pattern, m_List.getModel().getElementAt(i).toString()))
            m_List.addSelectionInterval(i, i);
        }
      }
      catch (Exception ex) {
        JOptionPane.showMessageDialog(
          m_PatternBut.getParent(),
<<<<<<< HEAD
          "'" + pattern + "' is not a valid Perl regular expression!\n" 
          + "Error: " + ex, 
          "Error in Pattern...", 
=======
<<<<<<< HEAD
          "'" + pattern + "' is not a valid Perl regular expression!\n" 
          + "Error: " + ex, 
          "Error in Pattern...", 
=======
          Messages.getInstance().getString("ListSelectorDialog_SelectPattern_Exception_JOptionPaneShowInputDialog_Text_First") + pattern + Messages.getInstance().getString("ListSelectorDialog_SelectPattern_Exception_JOptionPaneShowInputDialog_Text_Second") + ex,
          Messages.getInstance().getString("ListSelectorDialog_SelectPattern_Exception_JOptionPaneShowInputDialog_Text_Third"),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          JOptionPane.ERROR_MESSAGE);
      }
    }
  }
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Tests out the list selector from the command line.
   *
   * @param args ignored
   */
  public static void main(String [] args) {

    try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      DefaultListModel lm = new DefaultListModel();      
      lm.addElement("one");
      lm.addElement("two");
      lm.addElement("three");
      lm.addElement("four");
      lm.addElement("five");
<<<<<<< HEAD
=======
=======
      DefaultListModel lm = new DefaultListModel();
      lm.addElement(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_AddElement_Text_First"));
      lm.addElement(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_AddElement_Text_Second"));
      lm.addElement(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_AddElement_Text_Third"));
      lm.addElement(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_AddElement_Text_Fourth"));
      lm.addElement(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_AddElement_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      JList jl = new JList(lm);
      final ListSelectorDialog jd = new ListSelectorDialog(null, jl);
      int result = jd.showDialog();
      if (result == ListSelectorDialog.APPROVE_OPTION) {
<<<<<<< HEAD
	System.err.println("Fields Selected");
=======
<<<<<<< HEAD
	System.err.println("Fields Selected");
=======
	System.err.println(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_Error_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	int [] selected = jl.getSelectedIndices();
	for (int i = 0; i < selected.length; i++) {
	  System.err.println("" + selected[i]
			     + " " + lm.elementAt(selected[i]));
	}
      } else {
<<<<<<< HEAD
	System.err.println("Cancelled");
=======
<<<<<<< HEAD
	System.err.println("Cancelled");
=======
	System.err.println(Messages.getInstance().getString("ListSelectorDialog_Main_DefaultListModel_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      System.exit(0);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
