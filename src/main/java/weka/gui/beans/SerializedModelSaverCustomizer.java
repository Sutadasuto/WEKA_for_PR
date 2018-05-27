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
 *    SerializedModelSaverCustomizer.java
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
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
=======
=======
import weka.gui.GenericObjectEditor;
import weka.gui.PropertySheetPanel;
import weka.core.Tag;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.Customizer;
import java.beans.PropertyChangeEvent;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Tag;
import weka.gui.GenericObjectEditor;
import weka.gui.PropertySheetPanel;

/**
 * GUI Customizer for the SerializedModelSaver bean
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org
 * @version $Revision: 14497 $
 */
public class SerializedModelSaverCustomizer
  extends JPanel
  implements BeanCustomizer, CustomizerCloseRequester,
  CustomizerClosingListener, EnvironmentHandler {
<<<<<<< HEAD
=======
=======
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileFilter;

/**
 * GUI Customizer for the SerializedModelSaver bean
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org
 * @version $Revision: 7059 $
 */
public class SerializedModelSaverCustomizer
  extends JPanel
  implements Customizer, CustomizerCloseRequester {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -4874208115942078471L;

  static {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    GenericObjectEditor.registerEditors();
  }

  private final PropertyChangeSupport m_pcSupport =
<<<<<<< HEAD
=======
=======
     GenericObjectEditor.registerEditors();
  }

  private PropertyChangeSupport m_pcSupport = 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    new PropertyChangeSupport(this);

  private weka.gui.beans.SerializedModelSaver m_smSaver;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final PropertySheetPanel m_SaverEditor =
    new PropertySheetPanel();

  private final JFileChooser m_fileChooser = new JFileChooser(new File(
    System.getProperty("user.dir")));

  private Window m_parentWindow;

  private JDialog m_fileChooserFrame;

  // private JTextField m_prefixText;
  private EnvironmentField m_prefixText;

  private JTextField m_incrementalSaveSchedule;
<<<<<<< HEAD
=======
=======
  private PropertySheetPanel m_SaverEditor = 
    new PropertySheetPanel();

  private JFileChooser m_fileChooser 
    = new JFileChooser(new File(System.getProperty("user.dir")));
  

  private JFrame m_parentFrame;
  
  private JTextField m_prefixText;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private JComboBox m_fileFormatBox;

  private JCheckBox m_relativeFilePath;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private JCheckBox m_includeRelationName;

  private Environment m_env = Environment.getSystemWide();

  private EnvironmentField m_directoryText;

  private ModifyListener m_modifyListener;

  private String m_prefixBackup;
  private File m_directoryBackup;
  private boolean m_relativeBackup;
  private boolean m_relationBackup;
  private Tag m_formatBackup;

  /** Constructor */
  public SerializedModelSaverCustomizer() {

    /*
     * try { m_SaverEditor.addPropertyChangeListener( new
     * PropertyChangeListener() { public void propertyChange(PropertyChangeEvent
     * e) { repaint(); if (m_smSaver != null) {
     * System.err.println("Property change!!"); //
     * m_smSaver.setSaver(m_smSaver.getSaver()); } } }); repaint(); } catch
     * (Exception ex) { ex.printStackTrace(); }
     */
<<<<<<< HEAD
=======
=======
  

  /** Constructor */  
  public SerializedModelSaverCustomizer() {

    try {
      m_SaverEditor.addPropertyChangeListener(
	  new PropertyChangeListener() {
	      public void propertyChange(PropertyChangeEvent e) {
		repaint();
		if (m_smSaver != null) {
		  System.err.println(Messages.getInstance().getString("SerializedModelSaverCustomizer_Error_Text"));
                  //		  m_smSaver.setSaver(m_smSaver.getSaver());
		}
	      }
	    });
      repaint();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setLayout(new BorderLayout());

    m_fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
    m_fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_fileChooser.setApproveButtonText("Select directory and prefix");

    m_fileChooser.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
          try {
            m_smSaver.setPrefix(m_prefixText.getText());
            // m_smSaver.setDirectory(m_fileChooser.getSelectedFile());

            File selectedFile = m_fileChooser.getSelectedFile();
            m_directoryText.setText(selectedFile.toString());

          } catch (Exception ex) {
            ex.printStackTrace();
          }
        }
        // closing
        if (m_parentWindow != null) {
          m_fileChooserFrame.dispose();
        }
      }
    });
  }

  @Override
  public void setParentWindow(Window parent) {
    m_parentWindow = parent;
  }

  /** Sets up dialog for saving models to a file */
  public void setUpFile() {
    removeAll();
    m_fileChooser.setFileFilter(new FileFilter() {
      @Override
      public boolean accept(File f) {
        return f.isDirectory();
      }

      @Override
      public String getDescription() {
        return "Directory";
      }
    });

    m_fileChooser.setAcceptAllFileFilterUsed(false);

    try {
      if (!m_smSaver.getDirectory().getPath().equals("")) {
        // File tmp = m_smSaver.getDirectory();
        String dirStr = m_smSaver.getDirectory().toString();
        if (Environment.containsEnvVariables(dirStr)) {
          try {
            dirStr = m_env.substitute(dirStr);
          } catch (Exception ex) {
            // ignore
          }
        }
        File tmp = new File(dirStr);
        ;
        tmp = new File(tmp.getAbsolutePath());
        m_fileChooser.setCurrentDirectory(tmp);
      }
    } catch (Exception ex) {
<<<<<<< HEAD
=======
=======
    m_fileChooser.setApproveButtonText(Messages.getInstance().getString("SerializedModelSaverCustomizer_FileChooser_SetApproveButtonText_Text"));

    m_fileChooser.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
	    try {
              m_smSaver.setPrefix(m_prefixText.getText());
              m_smSaver.setDirectory(m_fileChooser.getSelectedFile());               
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }
	  }
	  // closing
	  if (m_parentFrame != null) {
	    m_parentFrame.dispose();
	  }
	}
      });   
  }

  public void setParentFrame(JFrame parent) {
    m_parentFrame = parent;
  }
  
  private void setUpOther() {
    removeAll();
    add(m_SaverEditor, BorderLayout.CENTER);
    validate();
    repaint();
  }
  
  /** Sets up dialog for saving models to a file */  
  public void setUpFile() {
    removeAll();
    m_fileChooser.setFileFilter(new FileFilter()
        { public boolean accept(File f)
            { return f.isDirectory();}
          public String getDescription()
            { return Messages.getInstance().getString("SerializedModelSaverCustomizer_SetUpFile_GetDescription_Text");}
         });

    m_fileChooser.setAcceptAllFileFilterUsed(false);

    try{
      if (!m_smSaver.getDirectory().getPath().equals("")) {
        File tmp = m_smSaver.getDirectory();
        tmp = new File(tmp.getAbsolutePath());
        m_fileChooser.setCurrentDirectory(tmp);
      }
    } catch(Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.out.println(ex);
    }

    JPanel innerPanel = new JPanel();
    innerPanel.setLayout(new BorderLayout());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JPanel alignedP = new JPanel();
    GridBagLayout gbLayout = new GridBagLayout();
    alignedP.setLayout(gbLayout);

    JLabel prefixLab = new JLabel("Prefix for file name", SwingConstants.RIGHT);
    prefixLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    GridBagConstraints gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 0;
    gbConstraints.gridx = 0;
    gbLayout.setConstraints(prefixLab, gbConstraints);
    alignedP.add(prefixLab);

    // m_prefixText = new JTextField(m_smSaver.getPrefix(), 25);
    m_prefixText = new EnvironmentField();
    m_prefixText.setEnvironment(m_env);
    /*
     * int width = m_prefixText.getPreferredSize().width; int height =
     * m_prefixText.getPreferredSize().height; m_prefixText.setMinimumSize(new
     * Dimension(width * 2, height)); m_prefixText.setPreferredSize(new
     * Dimension(width * 2, height));
     */
    m_prefixText.setText(m_smSaver.getPrefix());
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 0;
    gbConstraints.gridx = 1;
    gbLayout.setConstraints(m_prefixText, gbConstraints);
    alignedP.add(m_prefixText);

    JLabel ffLab = new JLabel("File format", SwingConstants.RIGHT);
    ffLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 1;
    gbConstraints.gridx = 0;
    gbLayout.setConstraints(ffLab, gbConstraints);
    alignedP.add(ffLab);

    setUpFileFormatComboBox();
    m_fileFormatBox.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 1;
    gbConstraints.gridx = 1;
    gbLayout.setConstraints(m_fileFormatBox, gbConstraints);
    alignedP.add(m_fileFormatBox);

<<<<<<< HEAD
=======
=======
    try {
      m_prefixText = new JTextField(m_smSaver.getPrefix(), 25); 
      JLabel prefixLab = new JLabel(Messages.getInstance().getString("SerializedModelSaverCustomizer_SetUpFile_PrefixLab_JLabel_Text"), SwingConstants.LEFT);
      JPanel prefixP = new JPanel();   
      prefixP.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      //      prefixP.setLayout(new FlowLayout(FlowLayout.LEFT));
      prefixP.setLayout(new BorderLayout());
      prefixP.add(prefixLab, BorderLayout.WEST);
      prefixP.add(m_prefixText, BorderLayout.CENTER);
      innerPanel.add(prefixP, BorderLayout.SOUTH);

      JPanel ffP = new JPanel();
      ffP.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      ffP.setLayout(new BorderLayout());
      ffP.add(new JLabel(Messages.getInstance().getString("SerializedModelSaverCustomizer_SetUpFile_FfP_JLabel_Text")), BorderLayout.WEST);
      setUpFileFormatComboBox();
      ffP.add(m_fileFormatBox, BorderLayout.CENTER);
      innerPanel.add(ffP, BorderLayout.CENTER);
    } catch(Exception ex){
    }
    //innerPanel.add(m_SaverEditor, BorderLayout.SOUTH);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JPanel about = m_SaverEditor.getAboutPanel();
    if (about != null) {
      innerPanel.add(about, BorderLayout.NORTH);
    }
    add(innerPanel, BorderLayout.NORTH);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JLabel directoryLab = new JLabel("Directory", SwingConstants.RIGHT);
    directoryLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 2;
    gbConstraints.gridx = 0;
    gbLayout.setConstraints(directoryLab, gbConstraints);
    alignedP.add(directoryLab);

    m_directoryText = new EnvironmentField();
    m_directoryText.setEnvironment(m_env);
    /*
     * width = m_directoryText.getPreferredSize().width; height =
     * m_directoryText.getPreferredSize().height;
     * m_directoryText.setMinimumSize(new Dimension(width * 2, height));
     * m_directoryText.setPreferredSize(new Dimension(width * 2, height));
     */

    m_directoryText.setText(m_smSaver.getDirectory().toString());

    JButton browseBut = new JButton("Browse...");
    browseBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          // final JFrame jf = new JFrame("Choose directory");
          final JDialog jf =
            new JDialog((JDialog) SerializedModelSaverCustomizer.this
              .getTopLevelAncestor(),
              "Choose directory", ModalityType.DOCUMENT_MODAL);
          jf.getContentPane().setLayout(new BorderLayout());
          jf.getContentPane().add(m_fileChooser, BorderLayout.CENTER);
          m_fileChooserFrame = jf;
          jf.pack();
          jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(SerializedModelSaverCustomizer.this));
          jf.setVisible(true);
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });

    JPanel efHolder = new JPanel();
    efHolder.setLayout(new BorderLayout());
    JPanel bP = new JPanel();
    bP.setLayout(new BorderLayout());
    bP.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 5));
    bP.add(browseBut, BorderLayout.CENTER);
    efHolder.add(bP, BorderLayout.EAST);
    efHolder.add(m_directoryText, BorderLayout.CENTER);
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 2;
    gbConstraints.gridx = 1;
    gbConstraints.weightx = 5; // make sure that extra horizontal space gets
                               // allocated to this column
    gbLayout.setConstraints(efHolder, gbConstraints);
    alignedP.add(efHolder);

    JLabel saveSchedule =
      new JLabel("Incremental classifier save schedule", SwingConstants.RIGHT);
    saveSchedule.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 3;
    gbConstraints.gridx = 0;
    gbLayout.setConstraints(saveSchedule, gbConstraints);
    alignedP.add(saveSchedule);
    saveSchedule.setToolTipText("How often to save incremental models "
      + "(<=0 means only at the end of the stream)");

    m_incrementalSaveSchedule =
      new JTextField("" + m_smSaver.getIncrementalSaveSchedule(), 5);
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 3;
    gbConstraints.gridx = 1;
    gbLayout.setConstraints(m_incrementalSaveSchedule, gbConstraints);
    alignedP.add(m_incrementalSaveSchedule);
    m_incrementalSaveSchedule
      .setToolTipText("How often to save incremental models "
        + "(<=0 means only at the end of the stream)");

    JLabel relativeLab =
      new JLabel("Use relative file paths", SwingConstants.RIGHT);
    relativeLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 4;
    gbConstraints.gridx = 0;
    gbLayout.setConstraints(relativeLab, gbConstraints);
    alignedP.add(relativeLab);

    m_relativeFilePath = new JCheckBox();
    m_relativeFilePath.
      setSelected(m_smSaver.getUseRelativePath());

    /*
     * m_relativeFilePath.addActionListener(new ActionListener() { public void
     * actionPerformed(ActionEvent e) {
     * m_smSaver.setUseRelativePath(m_relativeFilePath.isSelected()); } });
     */
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 4;
    gbConstraints.gridx = 1;
    gbLayout.setConstraints(m_relativeFilePath, gbConstraints);
    alignedP.add(m_relativeFilePath);

    JLabel relationLab =
      new JLabel("Include relation name in file name", SwingConstants.RIGHT);
    relationLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 5;
    gbConstraints.gridx = 0;
    gbLayout.setConstraints(relationLab, gbConstraints);
    alignedP.add(relationLab);

    m_includeRelationName = new JCheckBox();
    m_includeRelationName
      .setToolTipText("Include the relation name of the training data used "
        + "to create the model in the file name.");
    m_includeRelationName.setSelected(m_smSaver.getIncludeRelationName());

    gbConstraints = new GridBagConstraints();
    gbConstraints.anchor = GridBagConstraints.EAST;
    gbConstraints.fill = GridBagConstraints.HORIZONTAL;
    gbConstraints.gridy = 5;
    gbConstraints.gridx = 1;
    gbLayout.setConstraints(m_includeRelationName, gbConstraints);
    alignedP.add(m_includeRelationName);

    JButton OKBut = new JButton("OK");
    OKBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          m_smSaver.setPrefix(m_prefixText.getText());
          m_smSaver.setDirectory(new File(m_directoryText.getText()));
          m_smSaver.
            setIncludeRelationName(m_includeRelationName.isSelected());
          m_smSaver.setUseRelativePath(m_relativeFilePath.isSelected());
          String schedule = m_incrementalSaveSchedule.getText();
          if (schedule != null && schedule.length() > 0) {
            try {
              m_smSaver.setIncrementalSaveSchedule(Integer
                .parseInt(m_incrementalSaveSchedule.getText()));
            } catch (NumberFormatException ex) {
              // ignore
            }
          }

          Tag selected = (Tag) m_fileFormatBox.getSelectedItem();
          if (selected != null) {
            m_smSaver.setFileFormat(selected);
          }
        } catch (Exception ex) {
          ex.printStackTrace();
        }

        if (m_modifyListener != null) {
          m_modifyListener.setModifiedStatus(
            SerializedModelSaverCustomizer.this, true);
        }

        m_parentWindow.dispose();
      }
    });

    JButton CancelBut = new JButton("Cancel");
    CancelBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        customizerClosing();
        m_parentWindow.dispose();
      }
    });

    JPanel butHolder = new JPanel();
    butHolder.setLayout(new FlowLayout());
    butHolder.add(OKBut);
    butHolder.add(CancelBut);

    JPanel holderPanel = new JPanel();
    holderPanel.setLayout(new BorderLayout());
    holderPanel.add(alignedP, BorderLayout.NORTH);
    holderPanel.add(butHolder, BorderLayout.SOUTH);
<<<<<<< HEAD
=======
=======
    add(m_fileChooser, BorderLayout.CENTER);

    m_relativeFilePath = new JCheckBox(Messages.getInstance().getString("SerializedModelSaverCustomizer_SetUpFile_RelativeFilePath_JCheckBox_Text"));
    m_relativeFilePath.
      setSelected(m_smSaver.getUseRelativePath());

    m_relativeFilePath.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          m_smSaver.setUseRelativePath(m_relativeFilePath.isSelected());
        }
      });

    JPanel holderPanel = new JPanel();
    holderPanel.setLayout(new FlowLayout());
    holderPanel.add(m_relativeFilePath);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    add(holderPanel, BorderLayout.SOUTH);
  }

  /**
   * Set the model saver to be customized
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param object a weka.gui.beans.SerializedModelSaver
   */
  @Override
  public void setObject(Object object) {
    m_smSaver = (weka.gui.beans.SerializedModelSaver) object;
    m_SaverEditor.setTarget(m_smSaver);
    m_prefixBackup = m_smSaver.getPrefix();
    m_directoryBackup = m_smSaver.getDirectory();
    m_relationBackup = m_smSaver.getIncludeRelationName();
    m_relativeBackup = m_smSaver.getUseRelativePath();
    m_formatBackup = m_smSaver.getFileFormat();

    setUpFile();
<<<<<<< HEAD
=======
=======
   *
   * @param object a weka.gui.beans.SerializedModelSaver
   */
  public void setObject(Object object) {
    m_smSaver = (weka.gui.beans.SerializedModelSaver)object;
    m_SaverEditor.setTarget(m_smSaver);

    setUpFile();    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  private void setUpFileFormatComboBox() {
    m_fileFormatBox = new JComboBox();
    for (int i = 0; i < SerializedModelSaver.s_fileFormatsAvailable.size(); i++) {
      Tag temp = SerializedModelSaver.s_fileFormatsAvailable.get(i);
      m_fileFormatBox.addItem(temp);
    }

    Tag result = m_smSaver.validateFileFormat(m_smSaver.getFileFormat());
    if (result == null) {
      m_fileFormatBox.setSelectedIndex(0);
    } else {
      m_fileFormatBox.setSelectedItem(result);
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /*
     * m_fileFormatBox.addActionListener(new ActionListener() { public void
     * actionPerformed(ActionEvent e) { Tag selected =
     * (Tag)m_fileFormatBox.getSelectedItem(); if (selected != null) {
     * m_smSaver.setFileFormat(selected); } } });
     */
<<<<<<< HEAD
=======
=======
    m_fileFormatBox.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Tag selected = (Tag)m_fileFormatBox.getSelectedItem();
          if (selected != null) {
            m_smSaver.setFileFormat(selected);
          }
        }
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Add a property change listener
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.addPropertyChangeListener(pcl);
  }

  /**
   * Remove a property change listener
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }

  /*
   * (non-Javadoc)
   * 
   * @see weka.core.EnvironmentHandler#setEnvironment(weka.core.Environment)
   */
  @Override
  public void setEnvironment(Environment env) {
    m_env = env;
  }

  @Override
  public void setModifiedListener(ModifyListener l) {
    m_modifyListener = l;
  }

  @Override
  public void customizerClosing() {
    // restore backup (when window is closed with close widget or
    // cancel button is pressed)
    m_smSaver.setPrefix(m_prefixBackup);
    m_smSaver.setDirectory(m_directoryBackup);
    m_smSaver.setUseRelativePath(m_relativeBackup);
    m_smSaver.setIncludeRelationName(m_relationBackup);
    m_smSaver.setFileFormat(m_formatBackup);
  }
<<<<<<< HEAD
=======
=======
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
