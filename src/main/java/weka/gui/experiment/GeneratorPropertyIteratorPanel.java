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
 *    GeneratorPropertyIteratorPanel.java
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

package weka.gui.experiment;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.FastVector;
import weka.experiment.Experiment;
import weka.experiment.PropertyNode;
import weka.gui.GenericArrayEditor;
import weka.gui.PropertySelectorDialog;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import weka.experiment.Experiment;
import weka.experiment.PropertyNode;
import weka.gui.GenericArrayEditor;
import weka.gui.PropertySelectorDialog;

/**
 * This panel controls setting a list of values for an arbitrary resultgenerator
 * property for an experiment to iterate over.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10295 $
 */
public class GeneratorPropertyIteratorPanel extends JPanel implements
  ActionListener {
<<<<<<< HEAD
=======
=======
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * This panel controls setting a list of values for an arbitrary
 * resultgenerator property for an experiment to iterate over.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class GeneratorPropertyIteratorPanel
  extends JPanel
  implements ActionListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -6026938995241632139L;

  /** Click to select the property to iterate over */
<<<<<<< HEAD
  protected JButton m_ConfigureBut = new JButton("Select property...");
=======
<<<<<<< HEAD
  protected JButton m_ConfigureBut = new JButton("Select property...");
=======
  protected JButton m_ConfigureBut = new JButton(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_ConfigureBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Controls whether the custom iterator is used or not */
  protected JComboBox m_StatusBox = new JComboBox();

  /** Allows editing of the custom property values */
  protected GenericArrayEditor m_ArrayEditor = new GenericArrayEditor();

  /** The experiment this all applies to */
  protected Experiment m_Exp;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Listeners who want to be notified about editing status of this panel
   */
  protected ArrayList<ActionListener> m_Listeners = new ArrayList<ActionListener>();

<<<<<<< HEAD
=======
=======
  /** Listeners who want to be notified about editing status of this
      panel */
  protected FastVector m_Listeners = new FastVector();
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates the property iterator panel initially disabled.
   */
  public GeneratorPropertyIteratorPanel() {
<<<<<<< HEAD

    String[] options = { "Disabled", "Enabled" };
=======
<<<<<<< HEAD

    String[] options = { "Disabled", "Enabled" };
=======
    String [] options = {Messages.getInstance().getString("GeneratorPropertyIteratorPanel_Options_Disabled_Text"), Messages.getInstance().getString("GeneratorPropertyIteratorPanel_Options_Enabled_Text")};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ComboBoxModel cbm = new DefaultComboBoxModel(options);
    m_StatusBox.setModel(cbm);
    m_StatusBox.setSelectedIndex(0);
    m_StatusBox.addActionListener(this);
    m_StatusBox.setEnabled(false);
    m_ConfigureBut.setEnabled(false);
    m_ConfigureBut.addActionListener(this);
    JPanel buttons = new JPanel();
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
    buttons.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // buttons.setLayout(new GridLayout(1, 2));
    buttons.setLayout(gb);
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.insets = new Insets(0, 2, 0, 2);
    buttons.add(m_StatusBox, constraints);
    constraints.gridx = 1;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    buttons.add(m_ConfigureBut, constraints);
    buttons.setMaximumSize(new Dimension(buttons.getMaximumSize().width,
      buttons.getMinimumSize().height));
    setBorder(BorderFactory.createTitledBorder("Generator properties"));
    setLayout(new BorderLayout());
    add(buttons, BorderLayout.NORTH);
    // add(Box.createHorizontalGlue());
    ((JComponent) m_ArrayEditor.getCustomEditor()).setBorder(BorderFactory
      .createEtchedBorder());
    m_ArrayEditor.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent e) {
        System.err.println("Updating experiment property iterator array");
        m_Exp.setPropertyArray(m_ArrayEditor.getValue());
      }
    });
    add(m_ArrayEditor.getCustomEditor(), BorderLayout.CENTER);
<<<<<<< HEAD
=======
=======
    //    buttons.setLayout(new GridLayout(1, 2));
    buttons.setLayout(gb);
    constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;
    constraints.insets = new Insets(0,2,0,2);
    buttons.add(m_StatusBox,constraints);
    constraints.gridx=1;constraints.gridy=0;constraints.weightx=5;
    constraints.gridwidth=1;constraints.gridheight=1;
    buttons.add(m_ConfigureBut,constraints);
    buttons.setMaximumSize(new Dimension(buttons.getMaximumSize().width,
					   buttons.getMinimumSize().height));
    setBorder(BorderFactory.createTitledBorder("Generator properties"));
    setLayout(new BorderLayout());
    add(buttons, BorderLayout.NORTH);
    //    add(Box.createHorizontalGlue());
    m_ArrayEditor.setBorder(BorderFactory.createEtchedBorder());
    m_ArrayEditor.addPropertyChangeListener(new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent e) {
	System.err.println(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_PropertyChange_Error_Text"));
	m_Exp.setPropertyArray(m_ArrayEditor.getValue());
      }
    });
    add(m_ArrayEditor, BorderLayout.CENTER);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Creates the property iterator panel and sets the experiment.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param exp a value of type 'Experiment'
   */
  public GeneratorPropertyIteratorPanel(Experiment exp) {

    this();
    setExperiment(exp);
  }

  /**
<<<<<<< HEAD
   * Returns true if the editor is currently in an active status---that is the
   * array is active and able to be edited.
   * 
=======
<<<<<<< HEAD
   * Returns true if the editor is currently in an active status---that is the
   * array is active and able to be edited.
   * 
=======
   * Returns true if the editor is currently in an active status---that
   * is the array is active and able to be edited.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if editor is active
   */
  public boolean getEditorActive() {
    if (m_StatusBox.getSelectedIndex() == 0) {
      return false;
    }

    return true;
  }

  /**
   * Sets the experiment which will have the custom properties edited.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param exp a value of type 'Experiment'
   */
  public void setExperiment(Experiment exp) {

    m_Exp = exp;
    m_StatusBox.setEnabled(true);
    m_ArrayEditor.setValue(m_Exp.getPropertyArray());
    if (m_Exp.getPropertyArray() == null) {
      m_StatusBox.setSelectedIndex(0);
      m_ConfigureBut.setEnabled(false);
    } else {
      m_StatusBox.setSelectedIndex(m_Exp.getUsePropertyIterator() ? 1 : 0);
      m_ConfigureBut.setEnabled(m_Exp.getUsePropertyIterator());
    }
    validate();
  }

  /**
   * Gets the user to select a property of the current resultproducer.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return APPROVE_OPTION if the selection went OK, otherwise the selection
   *         was cancelled.
   */
  protected int selectProperty() {

    final PropertySelectorDialog jd = new PropertySelectorDialog(null,
      m_Exp.getResultProducer());
    jd.setLocationRelativeTo(this);
    int result = jd.showDialog();
    if (result == PropertySelectorDialog.APPROVE_OPTION) {
      System.err.println("Property Selected");
      PropertyNode[] path = jd.getPath();
      Object value = path[path.length - 1].value;
      PropertyDescriptor property = path[path.length - 1].property;
      // Make an array containing the propertyValue
      Class<?> propertyClass = property.getPropertyType();
      m_Exp.setPropertyPath(path);
      m_Exp.setPropertyArray(Array.newInstance(propertyClass, 1));
      Array.set(m_Exp.getPropertyArray(), 0, value);
      // Pass it to the arrayeditor
      m_ArrayEditor.setValue(m_Exp.getPropertyArray());
      m_ArrayEditor.getCustomEditor().repaint();
      System.err.println("Set new array to array editor");
    } else {
      System.err.println("Cancelled");
<<<<<<< HEAD
=======
=======
   *
   * @return APPROVE_OPTION if the selection went OK, otherwise the selection
   * was cancelled.
   */
  protected int selectProperty() {
    
    final PropertySelectorDialog jd = new PropertySelectorDialog(null,
					  m_Exp.getResultProducer());
    jd.setLocationRelativeTo(this);
    int result = jd.showDialog();
    if (result == PropertySelectorDialog.APPROVE_OPTION) {
      System.err.println(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_SelectProperty_Error_Text_First"));
      PropertyNode [] path = jd.getPath();
      Object value = path[path.length - 1].value;
      PropertyDescriptor property = path[path.length - 1].property;
      // Make an array containing the propertyValue
      Class propertyClass = property.getPropertyType();
      m_Exp.setPropertyPath(path);
      m_Exp.setPropertyArray(Array.newInstance(propertyClass, 1));
      Array.set(m_Exp.getPropertyArray(), 0, value);	
      // Pass it to the arrayeditor
      m_ArrayEditor.setValue(m_Exp.getPropertyArray());
      m_ArrayEditor.repaint();
      System.err.println(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_SelectProperty_Error_Text_Second"));
    } else {
      System.err.println(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_SelectProperty_Error_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return result;
  }

  /**
   * Handles the various button clicking type activities.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param e a value of type 'ActionEvent'
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param e a value of type 'ActionEvent'
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == m_ConfigureBut) {
      selectProperty();
    } else if (e.getSource() == m_StatusBox) {
      // notify any listeners
      for (int i = 0; i < m_Listeners.size(); i++) {
<<<<<<< HEAD
        ActionListener temp = (m_Listeners.get(i));
        temp.actionPerformed(new ActionEvent(this,
          ActionEvent.ACTION_PERFORMED, "Editor status change"));
=======
<<<<<<< HEAD
        ActionListener temp = (m_Listeners.get(i));
        temp.actionPerformed(new ActionEvent(this,
          ActionEvent.ACTION_PERFORMED, "Editor status change"));
=======
	ActionListener temp = ((ActionListener)m_Listeners.elementAt(i));
	temp.actionPerformed(new ActionEvent(this, 
					     ActionEvent.ACTION_PERFORMED, 
					     Messages.getInstance().getString("GeneratorPropertyIteratorPanel_ActionPerformed_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      // Toggles whether the custom property is used
      if (m_StatusBox.getSelectedIndex() == 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_Exp.setUsePropertyIterator(false);
        m_ConfigureBut.setEnabled(false);
        m_ArrayEditor.getCustomEditor().setEnabled(false);
        m_ArrayEditor.setValue(null);
        validate();
      } else {
        if (m_Exp.getPropertyArray() == null) {
          selectProperty();
        }
        if (m_Exp.getPropertyArray() == null) {
          m_StatusBox.setSelectedIndex(0);
        } else {
          m_Exp.setUsePropertyIterator(true);
          m_ConfigureBut.setEnabled(true);
          m_ArrayEditor.getCustomEditor().setEnabled(true);
        }
        validate();
<<<<<<< HEAD
=======
=======
	m_Exp.setUsePropertyIterator(false);
	m_ConfigureBut.setEnabled(false);
	m_ArrayEditor.setEnabled(false);
	m_ArrayEditor.setValue(null);
	validate();
      } else {
	if (m_Exp.getPropertyArray() == null) {
	  selectProperty();
	}
	if (m_Exp.getPropertyArray() == null) {
	  m_StatusBox.setSelectedIndex(0);
	} else {
	  m_Exp.setUsePropertyIterator(true);
	  m_ConfigureBut.setEnabled(true);
	  m_ArrayEditor.setEnabled(true);
	}
	validate();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Add a listener interested in kowing about editor status changes
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newA an listener to add
   */
  public void addActionListener(ActionListener newA) {
    m_Listeners.add(newA);
<<<<<<< HEAD
=======
=======
   * @param newA an listener to add
   */
  public void addActionListener(ActionListener newA) {
    m_Listeners.addElement(newA);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tests out the panel from the command line.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args ignored.
   */
  public static void main(String[] args) {

    try {
      final JFrame jf = new JFrame("Generator Property Iterator");
<<<<<<< HEAD
=======
=======
   *
   * @param args ignored.
   */
  public static void main(String [] args) {

    try {
      final JFrame jf = new JFrame(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      GeneratorPropertyIteratorPanel gp = new GeneratorPropertyIteratorPanel();
      jf.getContentPane().add(gp, BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void windowClosing(WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });
      jf.pack();
      jf.setVisible(true);
      System.err.println("Short nap");
      Thread.sleep(3000);
      System.err.println("Done");
<<<<<<< HEAD
=======
=======
	public void windowClosing(WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
      });
      jf.pack();
      jf.setVisible(true);
      System.err.println(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_Main_Error_Text_First"));
      Thread.currentThread().sleep(3000);
      System.err.println(Messages.getInstance().getString("GeneratorPropertyIteratorPanel_Main_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      gp.setExperiment(new Experiment());
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
