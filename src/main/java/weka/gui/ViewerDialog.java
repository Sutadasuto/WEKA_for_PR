<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/*
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
 */

 /*
  *    ViewerDialog.java
  *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
<<<<<<< HEAD
=======
=======
 /*
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
  */

 /*
  *    ViewerDialog.java
  *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  *
  */

package weka.gui;

import weka.core.Instances;
import weka.gui.arffviewer.ArffPanel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * A downsized version of the ArffViewer, displaying only one Instances-Object.
 *
 *
 * @see weka.gui.arffviewer.ArffViewer
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 14497 $ 
 */
public class ViewerDialog 
  extends JDialog 
  implements ChangeListener { 

  /** for serialization */
  private static final long serialVersionUID = 6747718484736047752L;
  
<<<<<<< HEAD
=======
=======
 * @version $Revision: 7904 $
 */
public class ViewerDialog
  extends JDialog
  implements ChangeListener {

  /** for serialization */
  private static final long serialVersionUID = 6747718484736047752L;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Signifies an OK property selection */
  public static final int APPROVE_OPTION = 0;

  /** Signifies a cancelled property selection */
  public static final int CANCEL_OPTION = 1;

  /** the result of the user's action, either OK or CANCEL */
  protected int m_Result = CANCEL_OPTION;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  /** Click to activate the current set parameters */
  protected JButton m_OkButton = new JButton("OK");

  /** Click to cancel the dialog */
  protected JButton m_CancelButton = new JButton("Cancel");

  /** Click to undo the last action */
  protected JButton m_UndoButton = new JButton("Undo");

  /** Click to add a new instance to the end of the dataset */
  protected JButton m_addInstanceButton = new JButton("Add instance");
  
  /** the panel to display the Instances-object */
  protected ArffPanel m_ArffPanel = new ArffPanel();
  
  /**
   * initializes the dialog with the given parent
   * 
<<<<<<< HEAD
=======
=======

  /** Click to activate the current set parameters */
  protected JButton m_OkButton = new JButton(Messages.getInstance().getString("ViewerDialog_OkButton_JButton_Text"));

  /** Click to cancel the dialog */
  protected JButton m_CancelButton = new JButton(Messages.getInstance().getString("ViewerDialog_CancelButton_JButton_Text"));

  /** Click to undo the last action */
  protected JButton m_UndoButton = new JButton(Messages.getInstance().getString("ViewerDialog_UndoButton_JButton_Text"));

  /** the panel to display the Instances-object */
  protected ArffPanel m_ArffPanel = new ArffPanel();

  /**
   * initializes the dialog with the given parent
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param parent the parent for this dialog
   */
  public ViewerDialog(Frame parent) {
    super(parent, ModalityType.DOCUMENT_MODAL);
    createDialog();
  }
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * creates all the elements of the dialog
   */
  protected void createDialog() {
    JPanel              panel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setTitle("Viewer");
    
    getContentPane().setLayout(new BorderLayout());
    
    // ArffPanel
    m_ArffPanel.addChangeListener(this);
    getContentPane().add(m_ArffPanel, BorderLayout.CENTER);
    
<<<<<<< HEAD
=======
=======
    setTitle(Messages.getInstance().getString("ViewerDialog_CreateDialog_SetTitle_Text"));

    getContentPane().setLayout(new BorderLayout());

    // ArffPanel
    m_ArffPanel.addChangeListener(this);
    getContentPane().add(m_ArffPanel, BorderLayout.CENTER);

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // Buttons
    panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    getContentPane().add(panel, BorderLayout.SOUTH);
    m_UndoButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        undo();
      }
    });
    getContentPane().add(panel, BorderLayout.SOUTH);
    m_CancelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_Result = CANCEL_OPTION;
        setVisible(false);
      }
    });
    m_OkButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_Result = APPROVE_OPTION;
        setVisible(false);
      }
    });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_addInstanceButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_ArffPanel.addInstanceAtEnd();
      }
    });
    panel.add(m_addInstanceButton);
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    panel.add(m_UndoButton);
    panel.add(m_OkButton);
    panel.add(m_CancelButton);

    pack();
<<<<<<< HEAD
    setLocationRelativeTo(getParent());
  }
  
=======
<<<<<<< HEAD
    setLocationRelativeTo(getParent());
  }
  
=======
  }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * sets the instances to display
   */
  public void setInstances(Instances inst) {
    m_ArffPanel.setInstances(new Instances(inst));
  }
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * returns the currently displayed instances
   */
  public Instances getInstances() {
    return m_ArffPanel.getInstances();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  /**
   * sets the state of the buttons 
   */
  protected void setButtons() {
    m_OkButton.setEnabled(true); 
    m_CancelButton.setEnabled(true); 
    m_UndoButton.setEnabled(m_ArffPanel.canUndo()); 
  }
  
  /**
   * returns whether the data has been changed
   * 
<<<<<<< HEAD
=======
=======

  /**
   * sets the state of the buttons
   */
  protected void setButtons() {
    m_OkButton.setEnabled(true);
    m_CancelButton.setEnabled(true);
    m_UndoButton.setEnabled(m_ArffPanel.canUndo());
  }

  /**
   * returns whether the data has been changed
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if the data has been changed
   */
  public boolean isChanged() {
    return m_ArffPanel.isChanged();
  }
<<<<<<< HEAD
  
  /**
   * undoes the last action 
=======
<<<<<<< HEAD
  
  /**
   * undoes the last action 
=======

  /**
   * undoes the last action
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void undo() {
    m_ArffPanel.undo();
  }

  /**
   * Invoked when the target of the listener has changed its state.
   */
  public void stateChanged(ChangeEvent e) {
    setButtons();
  }
<<<<<<< HEAD
  
=======
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Pops up the modal dialog and waits for Cancel or OK.
   *
   * @return either APPROVE_OPTION, or CANCEL_OPTION
   */
  public int showDialog() {
    m_Result = CANCEL_OPTION;
    setVisible(true);
    setButtons();
    return m_Result;
  }

  /**
   * Pops up the modal dialog and waits for Cancel or OK.
   *
   * @param inst the instances to display
   * @return either APPROVE_OPTION, or CANCEL_OPTION
   */
  public int showDialog(Instances inst) {
    setInstances(inst);
    return showDialog();
  }
}
