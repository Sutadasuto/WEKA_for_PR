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
 *    DatasetListPanel.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.experiment;

<<<<<<< HEAD
=======
import weka.core.ClassDiscovery.StringCompare;
import weka.core.converters.ConverterUtils;
import weka.core.converters.Saver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Utils;
import weka.experiment.Experiment;
import weka.gui.ConverterFileChooser;
import weka.gui.JListHelper;
import weka.gui.ViewerDialog;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Collections;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

<<<<<<< HEAD
import weka.core.Utils;
import weka.core.converters.ConverterUtils;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.converters.Saver;
import weka.experiment.Experiment;
import weka.gui.ConverterFileChooser;
import weka.gui.JListHelper;
import weka.gui.ViewerDialog;

/**
 * This panel controls setting a list of datasets for an experiment to iterate
 * over.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10222 $
 */
public class DatasetListPanel extends JPanel implements ActionListener {
=======
/** 
 * This panel controls setting a list of datasets for an experiment to
 * iterate over.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class DatasetListPanel
  extends JPanel
  implements ActionListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization. */
  private static final long serialVersionUID = 7068857852794405769L;

  /** The experiment to set the dataset list of. */
  protected Experiment m_Exp;

  /** The component displaying the dataset list. */
  protected JList m_List;

  /** Click to add a dataset. */
<<<<<<< HEAD
  protected JButton m_AddBut = new JButton("Add new...");

  /** Click to edit the selected algorithm. */
  protected JButton m_EditBut = new JButton("Edit selected...");

  /** Click to remove the selected dataset from the list. */
  protected JButton m_DeleteBut = new JButton("Delete selected");

  /** Click to move the selected dataset(s) one up. */
  protected JButton m_UpBut = new JButton("Up");

  /** Click to move the selected dataset(s) one down. */
  protected JButton m_DownBut = new JButton("Down");

  /** Make file paths relative to the user (start) directory. */
  protected JCheckBox m_relativeCheck = new JCheckBox("Use relative paths");

  /** The user (start) directory. */
  // protected File m_UserDir = new File(System.getProperty("user.dir"));

  /** The file chooser component. */
  protected ConverterFileChooser m_FileChooser = new ConverterFileChooser(
    ExperimenterDefaults.getInitialDatasetsDirectory());

  /**
   * Creates the dataset list panel with the given experiment.
   * 
=======
  protected JButton m_AddBut = new JButton(Messages.getInstance().getString("DatasetListPanel_AddBut_JButton_Text"));
  
  /** Click to edit the selected algorithm. */
  protected JButton m_EditBut = new JButton(Messages.getInstance().getString("DatasetListPanel_EditBut_JButton_Text"));

  /** Click to remove the selected dataset from the list. */
  protected JButton m_DeleteBut = new JButton(Messages.getInstance().getString("DatasetListPanel_DeleteBut_JButton_Text"));
  
  /** Click to move the selected dataset(s) one up. */
  protected JButton m_UpBut = new JButton(Messages.getInstance().getString("DatasetListPanel_UpBut_JButton_Text"));
  
  /** Click to move the selected dataset(s) one down. */
  protected JButton m_DownBut = new JButton(Messages.getInstance().getString("DatasetListPanel_DownBut_JButton_Text"));

  /** Make file paths relative to the user (start) directory. */
  protected JCheckBox m_relativeCheck = new JCheckBox(Messages.getInstance().getString("DatasetListPanel_RelativeCheck_JCheckBox_Text"));

  /** The user (start) directory. */
  //  protected File m_UserDir = new File(System.getProperty("user.dir"));

  /** The file chooser component. */
  protected ConverterFileChooser m_FileChooser = 
    new ConverterFileChooser(ExperimenterDefaults.getInitialDatasetsDirectory());

  
  /**
   * Creates the dataset list panel with the given experiment.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param exp a value of type 'Experiment'
   */
  public DatasetListPanel(Experiment exp) {

    this();
    setExperiment(exp);
  }

  /**
   * Create the dataset list panel initially disabled.
   */
  public DatasetListPanel() {
<<<<<<< HEAD

    m_List = new JList();
    m_List.addListSelectionListener(new ListSelectionListener() {
      @Override
      public void valueChanged(ListSelectionEvent e) {
        setButtons(e);
      }
    });
    MouseListener mouseListener = new MouseAdapter() {
      @Override
=======
    
    m_List = new JList();
    m_List.addListSelectionListener(new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent e) {
          setButtons(e);
        }
      });
    MouseListener mouseListener = new MouseAdapter() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
          // unfortunately, locationToIndex only returns the nearest entry
          // and not the exact one, i.e. if there's one item in the list and
          // one doublelclicks somewhere in the list, this index will be
          // returned
          int index = m_List.locationToIndex(e.getPoint());
<<<<<<< HEAD
          if (index > -1) {
            actionPerformed(new ActionEvent(m_EditBut, 0, ""));
          }
=======
          if (index > -1)
            actionPerformed(new ActionEvent(m_EditBut, 0, ""));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    };
    m_List.addMouseListener(mouseListener);
<<<<<<< HEAD

    // m_FileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    m_FileChooser.setCoreConvertersOnly(true);
    m_FileChooser.setMultiSelectionEnabled(true);
    m_FileChooser
      .setFileSelectionMode(ConverterFileChooser.FILES_AND_DIRECTORIES);
=======
    
    //m_FileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    m_FileChooser.setCoreConvertersOnly(true);
    m_FileChooser.setMultiSelectionEnabled(true);
    m_FileChooser.setFileSelectionMode(ConverterFileChooser.FILES_AND_DIRECTORIES);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_FileChooser.setAcceptAllFileFilterUsed(false);
    m_DeleteBut.setEnabled(false);
    m_DeleteBut.addActionListener(this);
    m_AddBut.setEnabled(false);
    m_AddBut.addActionListener(this);
    m_EditBut.setEnabled(false);
    m_EditBut.addActionListener(this);
    m_UpBut.setEnabled(false);
    m_UpBut.addActionListener(this);
    m_DownBut.setEnabled(false);
    m_DownBut.addActionListener(this);
    m_relativeCheck.setSelected(ExperimenterDefaults.getUseRelativePaths());
<<<<<<< HEAD
    m_relativeCheck.setToolTipText("Store file paths relative to "
      + "the start directory");
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder("Datasets"));
=======
    m_relativeCheck.setToolTipText(Messages.getInstance().getString("DatasetListPanel_RelativeCheck_SetToolTipText_Text"));
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("DatasetListPanel_RelativeCheck_SetBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    JPanel topLab = new JPanel();
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
    topLab.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
<<<<<<< HEAD
    // topLab.setLayout(new GridLayout(1,2,5,5));
    topLab.setLayout(gb);

    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.insets = new Insets(0, 2, 0, 2);
    topLab.add(m_AddBut, constraints);
    constraints.gridx = 1;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    topLab.add(m_EditBut, constraints);
    constraints.gridx = 2;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    topLab.add(m_DeleteBut, constraints);

    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.insets = new Insets(0, 2, 0, 2);
    topLab.add(m_relativeCheck, constraints);
=======
    //    topLab.setLayout(new GridLayout(1,2,5,5));
    topLab.setLayout(gb);
   
    constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;
    constraints.insets = new Insets(0,2,0,2);
    topLab.add(m_AddBut,constraints);
    constraints.gridx=1;constraints.gridy=0;constraints.weightx=5;
    constraints.gridwidth=1;constraints.gridheight=1;
    topLab.add(m_EditBut,constraints);
    constraints.gridx=2;constraints.gridy=0;constraints.weightx=5;
    constraints.gridwidth=1;constraints.gridheight=1;
    topLab.add(m_DeleteBut,constraints);

    constraints.gridx=0;constraints.gridy=1;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;
    constraints.insets = new Insets(0,2,0,2);
    topLab.add(m_relativeCheck,constraints);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    JPanel bottomLab = new JPanel();
    gb = new GridBagLayout();
    constraints = new GridBagConstraints();
    bottomLab.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
    bottomLab.setLayout(gb);
<<<<<<< HEAD

    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.insets = new Insets(0, 2, 0, 2);
    bottomLab.add(m_UpBut, constraints);
    constraints.gridx = 1;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    bottomLab.add(m_DownBut, constraints);
=======
   
    constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;
    constraints.insets = new Insets(0,2,0,2);
    bottomLab.add(m_UpBut,constraints);
    constraints.gridx=1;constraints.gridy=0;constraints.weightx=5;
    constraints.gridwidth=1;constraints.gridheight=1;
    bottomLab.add(m_DownBut,constraints);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    add(topLab, BorderLayout.NORTH);
    add(new JScrollPane(m_List), BorderLayout.CENTER);
    add(bottomLab, BorderLayout.SOUTH);
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * sets the state of the buttons according to the selection state of the
   * JList.
   * 
   * @param e the event
   */
  private void setButtons(ListSelectionEvent e) {
<<<<<<< HEAD
    if ((e == null) || (e.getSource() == m_List)) {
=======
    if ( (e == null) || (e.getSource() == m_List) ) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_DeleteBut.setEnabled(m_List.getSelectedIndex() > -1);
      m_EditBut.setEnabled(m_List.getSelectedIndices().length == 1);
      m_UpBut.setEnabled(JListHelper.canMoveUp(m_List));
      m_DownBut.setEnabled(JListHelper.canMoveDown(m_List));
    }
  }

  /**
   * Tells the panel to act on a new experiment.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param exp a value of type 'Experiment'
   */
  public void setExperiment(Experiment exp) {

    m_Exp = exp;
    m_List.setModel(m_Exp.getDatasets());
    m_AddBut.setEnabled(true);
    setButtons(null);
  }
<<<<<<< HEAD

  /**
   * Gets all the files in the given directory that match the currently selected
   * extension.
=======
  
  /**
   * Gets all the files in the given directory
   * that match the currently selected extension.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param directory the directory to get the files for
   * @param files the list to add the files to
   */
<<<<<<< HEAD
  protected void getFilesRecursively(File directory, Vector<File> files) {
=======
  protected void getFilesRecursively(File directory, Vector files) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    try {
      String[] currentDirFiles = directory.list();
      for (int i = 0; i < currentDirFiles.length; i++) {
<<<<<<< HEAD
        currentDirFiles[i] = directory.getCanonicalPath() + File.separator
          + currentDirFiles[i];
        File current = new File(currentDirFiles[i]);
        if (m_FileChooser.getFileFilter().accept(current)) {
          if (current.isDirectory()) {
            getFilesRecursively(current, files);
          } else {
            files.addElement(current);
          }
        }
      }
    } catch (Exception e) {
      System.err.println("IOError occured when reading list of files");
    }
  }

  /**
   * Handle actions when buttons get pressed.
   * 
   * @param e a value of type 'ActionEvent'
   */
  @Override
=======
	currentDirFiles[i] = directory.getCanonicalPath() + File.separator + 
	  currentDirFiles[i];
	File current = new File(currentDirFiles[i]);
	if (m_FileChooser.getFileFilter().accept(current)) {
	  if (current.isDirectory()) {
	    getFilesRecursively(current, files);
	  } else {
	    files.addElement(current);
	  }
	}
      }
    } catch (Exception e) {
      System.err.println(Messages.getInstance().getString("DatasetListPanel_GetFilesRecursively_Error_Text"));
    }
  }
  
  /**
   * Handle actions when buttons get pressed.
   *
   * @param e a value of type 'ActionEvent'
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void actionPerformed(ActionEvent e) {
    boolean useRelativePaths = m_relativeCheck.isSelected();

    if (e.getSource() == m_AddBut) {
      // Let the user select an arff file from a file chooser
      int returnVal = m_FileChooser.showOpenDialog(this);
<<<<<<< HEAD
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        if (m_FileChooser.isMultiSelectionEnabled()) {
          File[] selected = m_FileChooser.getSelectedFiles();
          for (File element : selected) {
            if (element.isDirectory()) {
              Vector<File> files = new Vector<File>();
              getFilesRecursively(element, files);

              // sort the result
              Collections.sort(files);

              for (int j = 0; j < files.size(); j++) {
                File temp = files.elementAt(j);
                if (useRelativePaths) {
                  try {
                    temp = Utils.convertToRelativePath(temp);
                  } catch (Exception ex) {
                    ex.printStackTrace();
                  }
                }
                m_Exp.getDatasets().addElement(temp);
              }
            } else {
              File temp = element;
              if (useRelativePaths) {
                try {
                  temp = Utils.convertToRelativePath(temp);
                } catch (Exception ex) {
                  ex.printStackTrace();
                }
              }
              m_Exp.getDatasets().addElement(temp);
            }
          }
          setButtons(null);
        } else {
          if (m_FileChooser.getSelectedFile().isDirectory()) {
            Vector<File> files = new Vector<File>();
            getFilesRecursively(m_FileChooser.getSelectedFile(), files);

            // sort the result
            Collections.sort(files);

            for (int j = 0; j < files.size(); j++) {
              File temp = files.elementAt(j);
              if (useRelativePaths) {
                try {
                  temp = Utils.convertToRelativePath(temp);
                } catch (Exception ex) {
                  ex.printStackTrace();
                }
              }
              m_Exp.getDatasets().addElement(temp);
            }
          } else {
            File temp = m_FileChooser.getSelectedFile();
            if (useRelativePaths) {
              try {
                temp = Utils.convertToRelativePath(temp);
              } catch (Exception ex) {
                ex.printStackTrace();
              }
            }
            m_Exp.getDatasets().addElement(temp);
          }
          setButtons(null);
        }
      }
    } else if (e.getSource() == m_DeleteBut) {
      // Delete the selected files
      int[] selected = m_List.getSelectedIndices();
      if (selected != null) {
        for (int i = selected.length - 1; i >= 0; i--) {
          int current = selected[i];
          m_Exp.getDatasets().removeElementAt(current);
          if (m_Exp.getDatasets().size() > current) {
            m_List.setSelectedIndex(current);
          } else {
            m_List.setSelectedIndex(current - 1);
          }
        }
=======
      if(returnVal == JFileChooser.APPROVE_OPTION) {
	if (m_FileChooser.isMultiSelectionEnabled()) {
	  File [] selected = m_FileChooser.getSelectedFiles();
	  for (int i = 0; i < selected.length; i++) {
	    if (selected[i].isDirectory()) {
	      Vector files = new Vector();
	      getFilesRecursively(selected[i], files);
    
	      // sort the result
	      Collections.sort(files, new StringCompare());

	      for (int j = 0; j < files.size(); j++) {
		File temp = (File)files.elementAt(j);
		if (useRelativePaths) {
		  try {
		    temp = Utils.convertToRelativePath(temp);
		  } catch (Exception ex) {
		    ex.printStackTrace();
		  }
		}
		m_Exp.getDatasets().addElement(temp);
	      }
	    } else {
	      File temp = selected[i];
	      if (useRelativePaths) {
		try {
		  temp = Utils.convertToRelativePath(temp);
		} catch (Exception ex) {
		  ex.printStackTrace();
		}
	      }
	      m_Exp.getDatasets().addElement(temp);
	    }
	  }
          setButtons(null);
	} else {
	  if (m_FileChooser.getSelectedFile().isDirectory()) {
	    Vector files = new Vector();
	    getFilesRecursively(m_FileChooser.getSelectedFile(), files);
    
	    // sort the result
	    Collections.sort(files, new StringCompare());

	    for (int j = 0; j < files.size(); j++) {
	      File temp = (File)files.elementAt(j);
	      if (useRelativePaths) {
		try {
		  temp = Utils.convertToRelativePath(temp);
		} catch (Exception ex) {
		  ex.printStackTrace();
		}
	      }
	      m_Exp.getDatasets().addElement(temp);
	    }
	  } else {
	    File temp = m_FileChooser.getSelectedFile();
	    if (useRelativePaths) {
	      try {
		temp = Utils.convertToRelativePath(temp);
	      } catch (Exception ex) {
		ex.printStackTrace();
	      }
	    }
	    m_Exp.getDatasets().addElement(temp);
	  }
          setButtons(null);
	}
      }
    } else if (e.getSource() == m_DeleteBut) {
      // Delete the selected files
      int [] selected = m_List.getSelectedIndices();
      if (selected != null) {
	for (int i = selected.length - 1; i >= 0; i--) {
	  int current = selected[i];
	  m_Exp.getDatasets().removeElementAt(current);
	  if (m_Exp.getDatasets().size() > current) {
	    m_List.setSelectedIndex(current);
	  } else {
	    m_List.setSelectedIndex(current - 1);
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      setButtons(null);
    } else if (e.getSource() == m_EditBut) {
      // Delete the selected files
      int selected = m_List.getSelectedIndex();
      if (selected != -1) {
<<<<<<< HEAD
        ViewerDialog dialog = new ViewerDialog(null);
        String filename = m_List.getSelectedValue().toString();
        int result;
        try {
          DataSource source = new DataSource(filename);
          result = dialog.showDialog(source.getDataSet());
          // nasty workaround for Windows regarding locked files:
          // if file Reader in Loader is not closed explicitly, we cannot
          // overwrite the file.
          source = null;
          System.gc();
          // workaround end
          if ((result == ViewerDialog.APPROVE_OPTION) && (dialog.isChanged())) {
            result = JOptionPane.showConfirmDialog(this,
              "File was modified - save changes?");
            if (result == JOptionPane.YES_OPTION) {
              Saver saver = ConverterUtils.getSaverForFile(filename);
              saver.setFile(new File(filename));
              saver.setInstances(dialog.getInstances());
              saver.writeBatch();
            }
          }
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, "Error loading file '" + filename
            + "':\n" + ex.toString(), "Error loading file",
            JOptionPane.INFORMATION_MESSAGE);
        }
=======
	ViewerDialog dialog = new ViewerDialog(null);
	String filename = m_List.getSelectedValue().toString();
	int result;
	try {
	  DataSource source = new DataSource(filename);
	  result = dialog.showDialog(source.getDataSet());
	  // nasty workaround for Windows regarding locked files:
	  // if file Reader in Loader is not closed explicitly, we cannot
	  // overwrite the file.
	  source = null;
	  System.gc();
	  // workaround end
	  if ((result == ViewerDialog.APPROVE_OPTION) && (dialog.isChanged())) {
	    result = JOptionPane.showConfirmDialog(
			this,
			Messages.getInstance().getString("DatasetListPanel_ActionPerformed_Result_JOptionPaneShowConfirmDialog_Text"));
	    if (result == JOptionPane.YES_OPTION) {
	      Saver saver = ConverterUtils.getSaverForFile(filename);
	      saver.setFile(new File(filename));
	      saver.setInstances(dialog.getInstances());
	      saver.writeBatch();
	    }
	  }
	}
	catch (Exception ex) {
	  JOptionPane.showMessageDialog(
	      this,
	      Messages.getInstance().getString("DatasetListPanel_ActionPerformed_Error_JOptionPaneShowMessageDialog_Text_First") + filename + Messages.getInstance().getString("DatasetListPanel_ActionPerformed_Error_JOptionPaneShowMessageDialog_Text_Second") + ex.toString(),
	      Messages.getInstance().getString("DatasetListPanel_ActionPerformed_Error_JOptionPaneShowMessageDialog_Text_Third"),
	      JOptionPane.INFORMATION_MESSAGE);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      setButtons(null);
    } else if (e.getSource() == m_UpBut) {
      JListHelper.moveUp(m_List);
    } else if (e.getSource() == m_DownBut) {
      JListHelper.moveDown(m_List);
    }
  }

  /**
   * Tests out the dataset list panel from the command line.
<<<<<<< HEAD
   * 
   * @param args ignored
   */
  public static void main(String[] args) {

    try {
      final JFrame jf = new JFrame("Dataset List Editor");
      jf.getContentPane().setLayout(new BorderLayout());
      DatasetListPanel dp = new DatasetListPanel();
      jf.getContentPane().add(dp, BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
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
=======
   *
   * @param args ignored
   */
  public static void main(String [] args) {

    try {
      final JFrame jf = new JFrame(Messages.getInstance().getString("DatasetListPanel_Main_JFrame_Text"));
      jf.getContentPane().setLayout(new BorderLayout());
      DatasetListPanel dp = new DatasetListPanel();
      jf.getContentPane().add(dp,
			      BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
      });
      jf.pack();
      jf.setVisible(true);
      System.err.println(Messages.getInstance().getString("DatasetListPanel_Main_Error_Text_First"));
      Thread.currentThread().sleep(3000);
      System.err.println(Messages.getInstance().getString("DatasetListPanel_Main_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      dp.setExperiment(new Experiment());
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
