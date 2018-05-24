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
 *    ClassValuePickerCustomizer.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
import weka.core.Instances;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Customizer;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
<<<<<<< HEAD
=======
import javax.swing.JFrame;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

<<<<<<< HEAD
import weka.core.Attribute;
import weka.core.Instances;

/**
 * @author Mark Hall
 * @version $Revision: 11506 $
 */
public class ClassValuePickerCustomizer
  extends JPanel
  implements BeanCustomizer, CustomizerClosingListener,
  CustomizerCloseRequester /* , DataFormatListener */{
=======
/**
 * @author Mark Hall
 * @version $Revision: 7441 $
 */
public class ClassValuePickerCustomizer
  extends JPanel
  implements Customizer, CustomizerClosingListener, 
  CustomizerCloseRequester /*DataFormatListener*/ {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 8213423053861600469L;

  private boolean m_displayValNames = false;

  private ClassValuePicker m_classValuePicker;
<<<<<<< HEAD

  private final PropertyChangeSupport m_pcSupport =
    new PropertyChangeSupport(this);

  private final JComboBox m_ClassValueCombo =
    new EnvironmentField.WideComboBox();
  private final JPanel m_holderP = new JPanel();

  private final JLabel m_messageLabel = new JLabel(
    "No customization possible at present.");

  private ModifyListener m_modifyListener;
  private boolean m_modified = false;

  private Window m_parent;
  private String m_backup;

  private boolean m_textBoxEntryMode = false;

=======
  
  private PropertyChangeSupport m_pcSupport = 
    new PropertyChangeSupport(this);

  private JComboBox m_ClassValueCombo = new JComboBox();
  private JPanel m_holderP = new JPanel();

  private JLabel m_messageLabel = new JLabel(Messages.getInstance().getString("ClassValuePickerCustomizer_MessageLabel_JLabel_Text"));
  
  private JFrame m_parent;
  private String m_backup;
  
  private boolean m_textBoxEntryMode = false;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private JTextField m_valueTextBox;

  public ClassValuePickerCustomizer() {
    setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));
<<<<<<< HEAD
    m_ClassValueCombo.setEditable(true);
    m_ClassValueCombo.setToolTipText("Class label. /first, /last and /<num> " +
      "can be used to specify the first, last or specific index " +
      "of the label to use respectively.");

    setLayout(new BorderLayout());
    add(new javax.swing.JLabel("ClassValuePickerCustomizer"),
      BorderLayout.NORTH);
    m_holderP.setLayout(new BorderLayout());
    m_holderP.setBorder(BorderFactory.createTitledBorder("Choose class value"));
    m_holderP.setToolTipText("Class label. /first, /last and /<num> " +
      "can be used to specify the first, last or specific index " +
      "of the label to use respectively.");
    m_holderP.add(m_ClassValueCombo, BorderLayout.CENTER);
    m_ClassValueCombo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (m_classValuePicker != null) {
          m_classValuePicker.
            setClassValue(m_ClassValueCombo.getSelectedItem().toString());
          m_modified = true;
        }
      }
    });
=======
    
    setLayout(new BorderLayout());
    add(new javax.swing.JLabel(Messages.getInstance().getString("ClassValuePickerCustomizer_JLabel_Text")), 
	BorderLayout.NORTH);
    m_holderP.setLayout(new BorderLayout());
    m_holderP.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("ClassValuePickerCustomizer_HolderP_SetBorder_BorderFactory_CreateTitledBorder_Text")));
    m_holderP.add(m_ClassValueCombo, BorderLayout.CENTER);
    m_ClassValueCombo.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  if (m_classValuePicker != null) {
	    m_classValuePicker.
	      setClassValue(m_ClassValueCombo.getSelectedItem().toString());
	  }
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    add(m_messageLabel, BorderLayout.CENTER);
    addButtons();
  }
<<<<<<< HEAD

  private void addButtons() {
    JButton okBut = new JButton("OK");
    JButton cancelBut = new JButton("Cancel");

    JPanel butHolder = new JPanel();
    butHolder.setLayout(new GridLayout(1, 2));
    butHolder.add(okBut);
    butHolder.add(cancelBut);
    add(butHolder, BorderLayout.SOUTH);

    okBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (m_modifyListener != null) {
          m_modifyListener.setModifiedStatus(ClassValuePickerCustomizer.this,
            m_modified);
        }

        if (m_textBoxEntryMode) {
          m_classValuePicker.setClassValue(m_valueTextBox.getText().trim());
        }

=======
  
  private void addButtons() {
    JButton okBut = new JButton("OK");
    JButton cancelBut = new JButton("Cancel");
    
    JPanel butHolder = new JPanel();
    butHolder.setLayout(new GridLayout(1, 2));
    butHolder.add(okBut); butHolder.add(cancelBut);
    add(butHolder, BorderLayout.SOUTH);
    
    okBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {        
        
        if (m_textBoxEntryMode) {
          m_classValuePicker.setClassValue(m_valueTextBox.getText().trim());
        }
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (m_parent != null) {
          m_parent.dispose();
        }
      }
    });
<<<<<<< HEAD

    cancelBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_classValuePicker.setClassValue(m_backup);

=======
    
    cancelBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_classValuePicker.setClassValue(m_backup);
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        customizerClosing();
        if (m_parent != null) {
          m_parent.dispose();
        }
      }
    });
  }

<<<<<<< HEAD
  private void setupTextBoxSelection() {
    m_textBoxEntryMode = true;

    JPanel holderPanel = new JPanel();
    holderPanel.setLayout(new BorderLayout());
    holderPanel.setBorder(BorderFactory
      .createTitledBorder("Specify class label"));
=======
  private void setUpNoCustPossible() {
    if (m_displayValNames == true) {
      remove(m_holderP);
      add(m_messageLabel, BorderLayout.CENTER);
      m_displayValNames = false;
    }
    validate(); repaint();
  }
  
  private void setupTextBoxSelection() {
    m_textBoxEntryMode = true;
    
    JPanel holderPanel = new JPanel();
    holderPanel.setLayout(new BorderLayout());
    holderPanel.setBorder(BorderFactory.createTitledBorder("Specify class label"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    JLabel label = new JLabel("Class label ", SwingConstants.RIGHT);
    holderPanel.add(label, BorderLayout.WEST);
    m_valueTextBox = new JTextField(15);
    m_valueTextBox.setToolTipText("Class label. /first, /last and /<num> " +
<<<<<<< HEAD
      "can be used to specify the first, last or specific index " +
      "of the label to use respectively.");
=======
                "can be used to specify the first, last or specific index " +
                "of the label to use respectively.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    holderPanel.add(m_valueTextBox, BorderLayout.CENTER);
    JPanel holder2 = new JPanel();
    holder2.setLayout(new BorderLayout());
    holder2.add(holderPanel, BorderLayout.NORTH);
    add(holder2, BorderLayout.CENTER);
<<<<<<< HEAD
    String existingClassVal = m_classValuePicker.getClassValue();
    if (existingClassVal != null) {
      m_valueTextBox.setText(existingClassVal);
    }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  private void setUpValueSelection(Instances format) {
    if (format.classIndex() < 0 || format.classAttribute().isNumeric()) {
      // cant do anything in this case
      m_messageLabel.setText((format.classIndex() < 0) ?
<<<<<<< HEAD
        "EROR: no class attribute set" : "ERROR: class is numeric");
      return;
    }

    if (m_displayValNames == false) {
      remove(m_messageLabel);
    }

    m_textBoxEntryMode = false;

=======
          "EROR: no class attribute set" : "ERROR: class is numeric");
      return;
    }
    
    if (m_displayValNames == false) {
      remove(m_messageLabel);
    }
    
    m_textBoxEntryMode = false;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (format.classAttribute().numValues() == 0) {
      // loader may not be able to give us the set of legal
      // values for a nominal attribute until it has read
      // the data (e.g. database loader or csv loader).
      // In this case we'll use a text box and the user
      // can enter the class value.
      setupTextBoxSelection();
<<<<<<< HEAD
      validate();
      repaint();
      return;
    }

    String existingClassVal = m_classValuePicker.getClassValue();
    String existingCopy = existingClassVal;
=======
      validate(); repaint();
      return;
    }    
    
    String existingClassVal = m_classValuePicker.getClassValue();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (existingClassVal == null) {
      existingClassVal = "";
    }
    int classValIndex = format.classAttribute().indexOfValue(existingClassVal);
<<<<<<< HEAD

    // do we have a special (last, first or number)
    // if (existingClassVal.startsWith("/")) {
    // existingClassVal = existingClassVal.substring(1);
    // if (existingClassVal.equalsIgnoreCase("first")) {
    // classValIndex = 0;
    // } else if (existingClassVal.equalsIgnoreCase("last")) {
    // classValIndex = format.classAttribute().numValues() - 1;
    // } else {
    // // try and parse as a number
    // classValIndex = Integer.parseInt(existingClassVal);
    // classValIndex--;
    // }
    // }

    // if (classValIndex < 0) {
    // classValIndex = 0;
    // }
    String[] attribValNames = new String[format.classAttribute().numValues()];
=======
    
    // do we have a special (last, first or number)
    if (existingClassVal.startsWith("/")) {
      existingClassVal = existingClassVal.substring(1);
      if (existingClassVal.equalsIgnoreCase("first")) {
        classValIndex = 0;
      } else if (existingClassVal.equalsIgnoreCase("last")) {
        classValIndex = format.classAttribute().numValues() - 1;
      } else {
        // try and parse as a number
        classValIndex = Integer.parseInt(existingClassVal);
        classValIndex--;
      }
    }
    
    if (classValIndex < 0) {
      classValIndex = 0;
    }
    String [] attribValNames = new String [format.classAttribute().numValues()];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (int i = 0; i < attribValNames.length; i++) {
      attribValNames[i] = format.classAttribute().value(i);
    }
    m_ClassValueCombo.setModel(new DefaultComboBoxModel(attribValNames));
    if (attribValNames.length > 0) {
<<<<<<< HEAD
      // if (existingClassVal < attribValNames.length) {
      if (classValIndex >= 0) {
        m_ClassValueCombo.setSelectedIndex(classValIndex);
      } else {
        String toSet = existingCopy != null ? existingCopy : attribValNames[0];
        m_ClassValueCombo.setSelectedItem(toSet);
      }
      // }
=======
//      if (existingClassVal < attribValNames.length) {
      m_ClassValueCombo.setSelectedIndex(classValIndex);
//      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    if (m_displayValNames == false) {
      add(m_holderP, BorderLayout.CENTER);
      m_displayValNames = true;
    }
<<<<<<< HEAD
    validate();
    repaint();
=======
    validate(); repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set the bean to be edited
<<<<<<< HEAD
   * 
   * @param object an <code>Object</code> value
   */
  @Override
  public void setObject(Object object) {
    if (m_classValuePicker != (ClassValuePicker) object) {
      // remove ourselves as a listener from the old ClassvaluePicker (if
      // necessary)
      /*
       * if (m_classValuePicker != null) {
       * m_classValuePicker.removeDataFormatListener(this); }
       */
      m_classValuePicker = (ClassValuePicker) object;
      // add ourselves as a data format listener
      // m_classValuePicker.addDataFormatListener(this);
      if (m_classValuePicker.getConnectedFormat() != null) {
        setUpValueSelection(m_classValuePicker.getConnectedFormat());
      }
      m_backup = m_classValuePicker.getClassValue();
    }
  }

  @Override
  public void customizerClosing() {
    // remove ourselves as a listener from the ClassValuePicker (if necessary)
    // if (m_classValuePicker != null) {
    // System.out.println("Customizer deregistering with class value picker");
    // m_classValuePicker.removeDataFormatListener(this);
    // }
    m_classValuePicker.setClassValue(m_backup);
  }

  /*
   * public void newDataFormat(DataSetEvent dse) { if (dse.getDataSet() != null)
   * { setUpValueSelection(m_classValuePicker.getConnectedFormat()); } else {
   * setUpNoCustPossible(); } }
   */

  /**
   * Add a property change listener
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.addPropertyChangeListener(pcl);
  }

  /**
   * Remove a property change listener
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }

  @Override
  public void setModifiedListener(ModifyListener l) {
    m_modifyListener = l;
  }

  @Override
  public void setParentWindow(Window parent) {
=======
   *
   * @param object an <code>Object</code> value
   */
  public void setObject(Object object) {
    if (m_classValuePicker != (ClassValuePicker)object) {
      // remove ourselves as a listener from the old ClassvaluePicker (if necessary)
/*      if (m_classValuePicker != null) {
        m_classValuePicker.removeDataFormatListener(this);
      } */
      m_classValuePicker = (ClassValuePicker)object;
      // add ourselves as a data format listener
//      m_classValuePicker.addDataFormatListener(this);
      if (m_classValuePicker.getConnectedFormat() != null) {
        setUpValueSelection(m_classValuePicker.getConnectedFormat());   
      } 
      m_backup = m_classValuePicker.getClassValue();
    }
  }
  
  public void customizerClosing() {
    // remove ourselves as a listener from the ClassValuePicker (if necessary)
//    if (m_classValuePicker != null) {
      //System.err.println(Messages.getInstance().getString("ClassValuePickerCustomizer_CustomizerClosing_Text"));
//      m_classValuePicker.removeDataFormatListener(this);
  //  }
    m_classValuePicker.setClassValue(m_backup);
  }

  /*public void newDataFormat(DataSetEvent dse) {
    if (dse.getDataSet() != null) {
      setUpValueSelection(m_classValuePicker.getConnectedFormat());
    } else {
      setUpNoCustPossible();
    }
  }*/
  
  /**
   * Add a property change listener
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.addPropertyChangeListener(pcl);
  }
  
  /**
   * Remove a property change listener
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }
  
  public void setParentFrame(JFrame parent) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_parent = parent;
  }
}
