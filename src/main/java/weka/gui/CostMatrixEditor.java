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
 *    CostMatrixEditor.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui;

<<<<<<< HEAD
=======
import weka.classifiers.CostMatrix;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyEditor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

<<<<<<< HEAD
import weka.classifiers.CostMatrix;

/**
 * Class for editing CostMatrix objects. Brings up a custom editing panel with
 * which the user can edit the matrix interactively, as well as save load cost
 * matrices from files.
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 10216 $
 */
public class CostMatrixEditor implements PropertyEditor {
=======
/**
 * Class for editing CostMatrix objects. Brings up a custom editing panel
 * with which the user can edit the matrix interactively, as well as save
 * load cost matrices from files.
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class CostMatrixEditor 
  implements PropertyEditor {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The cost matrix being edited */
  private CostMatrix m_matrix;

  /** A helper class for notifying listeners */
<<<<<<< HEAD
  private final PropertyChangeSupport m_propSupport;

  /** An instance of the custom editor */
  private final CustomEditor m_customEditor;

  /** The file chooser for the user to select cost files to save and load */
  private final JFileChooser m_fileChooser = new JFileChooser(new File(
    System.getProperty("user.dir")));

  /**
   * This class wraps around the cost matrix presenting it as a TableModel so
   * that it can be displayed and edited in a JTable.
   */
  private class CostMatrixTableModel extends AbstractTableModel {

=======
  private PropertyChangeSupport m_propSupport;

  /** An instance of the custom editor */
  private CustomEditor m_customEditor;

  /** The file chooser for the user to select cost files to save and load */
  private JFileChooser m_fileChooser
    = new JFileChooser(new File(System.getProperty("user.dir")));

  /**
   * This class wraps around the cost matrix presenting it as a TableModel
   * so that it can be displayed and edited in a JTable.
   */
  private class CostMatrixTableModel 
    extends AbstractTableModel {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /** for serialization */
    static final long serialVersionUID = -2762326138357037181L;

    /**
<<<<<<< HEAD
     * Gets the number of rows in the matrix. Cost matrices are square so it is
     * the same as the column count, i.e. the size of the matrix.
     * 
     * @return the row count
     */
    @Override
=======
     * Gets the number of rows in the matrix. Cost matrices are square so it is the
     * same as the column count, i.e. the size of the matrix.
     *
     * @return the row count
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    public int getRowCount() {

      return m_matrix.size();
    }

    /**
<<<<<<< HEAD
     * Gets the number of columns in the matrix. Cost matrices are square so it
     * is the same as the row count, i.e. the size of the matrix.
     * 
     * @return the row count
     */
    @Override
=======
     * Gets the number of columns in the matrix. Cost matrices are square so it is
     * the same as the row count, i.e. the size of the matrix.
     *
     * @return the row count
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    public int getColumnCount() {

      return m_matrix.size();
    }

    /**
     * Returns a value at the specified position in the cost matrix.
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     * @param row the row position
     * @param column the column position
     * @return the value
     */
<<<<<<< HEAD
    @Override
    public Object getValueAt(int row, int column) {

      // return new Double(m_matrix.getElement(row, column));
=======
    public Object getValueAt(int row, int column) {

      //      return new Double(m_matrix.getElement(row, column));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      try {
        return m_matrix.getCell(row, column);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      return new Double(0.0);
    }

    /**
     * Sets a value at a specified position in the cost matrix.
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     * @param aValue the new value (should be of type Double).
     * @param rowIndex the row position
     * @param columnIndex the column position
     */
<<<<<<< HEAD
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

      // double value = ((Double) aValue).doubleValue();
      // m_matrix.setElement(rowIndex, columnIndex, value);
      // try to parse it as a double first
      Double val;
      try {
        val = new Double(((String) aValue));
=======
    public void setValueAt(Object aValue,
			   int rowIndex,
			   int columnIndex) {

      //      double value = ((Double) aValue).doubleValue();
      //      m_matrix.setElement(rowIndex, columnIndex, value);
      // try to parse it as a double first
      Double val;
      try {
        val = new Double(((String)aValue));
        double value = val.doubleValue();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } catch (Exception ex) {
        val = null;
      }
      if (val == null) {
        m_matrix.setCell(rowIndex, columnIndex, aValue);
      } else {
        m_matrix.setCell(rowIndex, columnIndex, val);
      }
      fireTableCellUpdated(rowIndex, columnIndex);
    }

    /**
     * Indicates whether a cell in the table is editable. In this case all cells
     * are editable so true is always returned.
<<<<<<< HEAD
     * 
     * @param rowIndex the row position
     * @param columnIndex the column position
     * @return true
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
=======
     *
     * @param rowIndex the row position
     * @param columnIndex the column position
     * @return true
     */    
    public boolean isCellEditable(int rowIndex,
				  int columnIndex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      return true;
    }

    /**
     * Indicates the class of the objects within a column of the table. In this
<<<<<<< HEAD
     * case all columns in the cost matrix consist of double values so
     * Double.class is always returned.
     * 
     * @param columnIndex the column position
     * @return Double.class
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
=======
     * case all columns in the cost matrix consist of double values so Double.class
     * is always returned.
     *
     * @param columnIndex the column position
     * @return Double.class
     */    
    public Class getColumnClass(int columnIndex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      return Object.class;
    }
  }

  /**
<<<<<<< HEAD
   * This class presents a GUI for editing the cost matrix, and saving and
   * loading from files.
   */
  private class CustomEditor extends JPanel implements ActionListener,
    TableModelListener {

=======
   * This class presents a GUI for editing the cost matrix, and saving and 
   * loading from files.
   */
  private class CustomEditor
    extends JPanel 
    implements ActionListener, TableModelListener {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /** for serialization */
    static final long serialVersionUID = -2931593489871197274L;

    /** The table model of the cost matrix being edited */
<<<<<<< HEAD
    private final CostMatrixTableModel m_tableModel;

    /** The button for setting default matrix values */
    private final JButton m_defaultButton;

    /** The button for opening a cost matrix from a file */
    private final JButton m_openButton;

    /** The button for saving a cost matrix to a file */
    private final JButton m_saveButton;

    /** The field for changing the size of the cost matrix */
    private final JTextField m_classesField;

    /** The button for resizing a matrix */
    private final JButton m_resizeButton;

    /**
     * Constructs a new CustomEditor.
     * 
=======
    private CostMatrixTableModel m_tableModel;

    /** The button for setting default matrix values */
    private JButton m_defaultButton;

    /** The button for opening a cost matrix from a file */
    private JButton m_openButton;

    /** The button for saving a cost matrix to a file */
    private JButton m_saveButton;

    /** The field for changing the size of the cost matrix */
    private JTextField m_classesField;

    /** The button for resizing a matrix */
    private JButton m_resizeButton;

    /**
     * Constructs a new CustomEditor.
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     */
    public CustomEditor() {

      // set up the file chooser
<<<<<<< HEAD
      m_fileChooser.setFileFilter(new ExtensionFileFilter(
        CostMatrix.FILE_EXTENSION, "Cost files"));
      m_fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

      // create the buttons + field
      m_defaultButton = new JButton("Defaults");
      m_openButton = new JButton("Open...");
      m_saveButton = new JButton("Save...");
      m_resizeButton = new JButton("Resize");
=======
      m_fileChooser.setFileFilter(
	     new ExtensionFileFilter(CostMatrix.FILE_EXTENSION, 
				     Messages.getInstance().getString("CostMatrixEditor_CustomEditor_FileChooser_SetFileFilter_Text"))
	       );
      m_fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

      // create the buttons + field
      m_defaultButton = new JButton(Messages.getInstance().getString("CostMatrixEditor_CustomEditor_DefaultButton_JButton_Text"));
      m_openButton = new JButton(Messages.getInstance().getString("CostMatrixEditor_CustomEditor_OpenButton_JButton_Text"));
      m_saveButton = new JButton(Messages.getInstance().getString("CostMatrixEditor_CustomEditor_SaveButton_JButton_Text"));
      m_resizeButton = new JButton(Messages.getInstance().getString("CostMatrixEditor_CustomEditor_ResizeButton_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_classesField = new JTextField("" + m_matrix.size());

      m_defaultButton.addActionListener(this);
      m_openButton.addActionListener(this);
      m_saveButton.addActionListener(this);
      m_resizeButton.addActionListener(this);
      m_classesField.addActionListener(this);

      // lay out the GUI
      JPanel classesPanel = new JPanel();
      classesPanel.setLayout(new GridLayout(1, 2, 0, 0));
<<<<<<< HEAD
      classesPanel.add(new JLabel("Classes:", SwingConstants.RIGHT));
      classesPanel.add(m_classesField);

      JPanel rightPanel = new JPanel();

      GridBagLayout gridBag = new GridBagLayout();
      GridBagConstraints gbc = new GridBagConstraints();
      rightPanel.setLayout(gridBag);
      gbc.gridx = 0;
      gbc.gridy = GridBagConstraints.RELATIVE;
=======
      classesPanel.add(new JLabel(Messages.getInstance().getString("CostMatrixEditor_CustomEditor_ClassesPanel_JLabel_Text"), SwingConstants.RIGHT));
      classesPanel.add(m_classesField);

      JPanel rightPanel = new JPanel();
      
      GridBagLayout gridBag = new GridBagLayout();
      GridBagConstraints gbc = new GridBagConstraints();
      rightPanel.setLayout(gridBag);
      gbc.gridx = 0; gbc.gridy = GridBagConstraints.RELATIVE;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      gbc.insets = new Insets(2, 10, 2, 10);
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gridBag.setConstraints(m_defaultButton, gbc);
      rightPanel.add(m_defaultButton);

      gridBag.setConstraints(m_openButton, gbc);
      rightPanel.add(m_openButton);
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      gridBag.setConstraints(m_saveButton, gbc);
      rightPanel.add(m_saveButton);

      gridBag.setConstraints(classesPanel, gbc);
      rightPanel.add(classesPanel);
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      gridBag.setConstraints(m_resizeButton, gbc);
      rightPanel.add(m_resizeButton);

      JPanel fill = new JPanel();
<<<<<<< HEAD
      gbc.weightx = 1.0;
      gbc.weighty = 1.0;
      gbc.fill = GridBagConstraints.BOTH;

=======
      gbc.weightx = 1.0; gbc.weighty = 1.0;
      gbc.fill = GridBagConstraints.BOTH;
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      gridBag.setConstraints(fill, gbc);
      rightPanel.add(fill);

      m_tableModel = new CostMatrixTableModel();
      m_tableModel.addTableModelListener(this);
      JTable matrixTable = new JTable(m_tableModel);
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      setLayout(new BorderLayout());
      add(matrixTable, BorderLayout.CENTER);
      add(rightPanel, BorderLayout.EAST);
    }

    /**
     * Responds to the user perfoming an action.
<<<<<<< HEAD
     * 
     * @param e the action event that occured
     */
    @Override
    public void actionPerformed(ActionEvent e) {

      if (e.getSource() == m_defaultButton) {
        m_matrix.initialize();
        matrixChanged();
      } else if (e.getSource() == m_openButton) {
        openMatrix();
      } else if (e.getSource() == m_saveButton) {
        saveMatrix();
      } else if ((e.getSource() == m_classesField)
        || (e.getSource() == m_resizeButton)) {
        try {
          int newNumClasses = Integer.parseInt(m_classesField.getText());
          if (newNumClasses > 0 && newNumClasses != m_matrix.size()) {
            setValue(new CostMatrix(newNumClasses));
          }
        } catch (Exception ex) {
        }
=======
     *
     * @param e the action event that occured
     */
    public void actionPerformed(ActionEvent e) {
      
      if (e.getSource() == m_defaultButton) {
	m_matrix.initialize();
	matrixChanged();
      } else if (e.getSource() == m_openButton) {
	openMatrix();
      } else if (e.getSource() == m_saveButton) {
	saveMatrix();
      } else if (    (e.getSource() == m_classesField) 
	          || (e.getSource() == m_resizeButton) ) {
	try {
	  int newNumClasses = Integer.parseInt(m_classesField.getText());
	  if (newNumClasses > 0 && newNumClasses != m_matrix.size()) {
	    setValue(new CostMatrix(newNumClasses));
	  }
	} catch (Exception ex) {}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    /**
     * Responds to a change in the cost matrix table.
<<<<<<< HEAD
     * 
     * @param e the tabel model event that occured
     */
    @Override
=======
     *
     * @param e the tabel model event that occured
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    public void tableChanged(TableModelEvent e) {

      m_propSupport.firePropertyChange(null, null, null);
    }

    /**
     * Responds to a change in structure of the matrix being edited.
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     */
    public void matrixChanged() {

      m_tableModel.fireTableStructureChanged();
      m_classesField.setText("" + m_matrix.size());
    }

    /**
     * Prompts the user to open a matrix, and attemps to load it.
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     */
    private void openMatrix() {

      int returnVal = m_fileChooser.showOpenDialog(this);
<<<<<<< HEAD
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File selectedFile = m_fileChooser.getSelectedFile();
        Reader reader = null;
        try {
          reader = new BufferedReader(new FileReader(selectedFile));
          m_matrix = new CostMatrix(reader);
          reader.close();
          matrixChanged();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, "Error reading file '"
            + selectedFile.getName() + "':\n" + ex.getMessage(), "Load failed",
            JOptionPane.ERROR_MESSAGE);
          System.out.println(ex.getMessage());
        }
=======
      if(returnVal == JFileChooser.APPROVE_OPTION) {
	File selectedFile = m_fileChooser.getSelectedFile();
	Reader reader = null;
	try {
	  reader = new BufferedReader(new FileReader(selectedFile));
	  m_matrix = 
	    new CostMatrix(reader);
	  reader.close();
	  matrixChanged();
	} catch (Exception ex) {
	  JOptionPane.showMessageDialog(this, 
			  Messages.getInstance().getString("CostMatrixEditor_OpenMatrix_JOptionPaneShowMessageDialog_Text_First")
					+ selectedFile.getName()
					+ Messages.getInstance().getString("CostMatrixEditor_OpenMatrix_JOptionPaneShowMessageDialog_Text_Second") + ex.getMessage(),
					Messages.getInstance().getString("CostMatrixEditor_OpenMatrix_JOptionPaneShowMessageDialog_Text_Third"),
					JOptionPane.ERROR_MESSAGE);
	  System.out.println(ex.getMessage());
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    /**
     * Prompts the user to save a matrix, and attemps to save it.
<<<<<<< HEAD
     * 
     */
    private void saveMatrix() {

      int returnVal = m_fileChooser.showSaveDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File selectedFile = m_fileChooser.getSelectedFile();

        // append extension if not already present
        if (!selectedFile.getName().toLowerCase()
          .endsWith(CostMatrix.FILE_EXTENSION)) {
          selectedFile = new File(selectedFile.getParent(),
            selectedFile.getName() + CostMatrix.FILE_EXTENSION);
        }

        Writer writer = null;
        try {
          writer = new BufferedWriter(new FileWriter(selectedFile));
          m_matrix.write(writer);
          writer.close();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, "Error writing file '"
            + selectedFile.getName() + "':\n" + ex.getMessage(), "Save failed",
            JOptionPane.ERROR_MESSAGE);
          System.out.println(ex.getMessage());
        }
=======
     *
     */
    private void saveMatrix() {
      
      int returnVal = m_fileChooser.showSaveDialog(this);
      if(returnVal == JFileChooser.APPROVE_OPTION) {
	File selectedFile = m_fileChooser.getSelectedFile();

	// append extension if not already present
	if (!selectedFile.getName().toLowerCase()
            .endsWith(CostMatrix.FILE_EXTENSION)) {
	  selectedFile = new File(selectedFile.getParent(), 
				  selectedFile.getName() 
				  + CostMatrix.FILE_EXTENSION);
	}

	Writer writer = null;
	try {
	  writer = new BufferedWriter(new FileWriter(selectedFile));
	  m_matrix.write(writer);
	  writer.close();
	} catch (Exception ex) {
	  JOptionPane.showMessageDialog(this, 
			  Messages.getInstance().getString("CostMatrixEditor_SaveMatrix_JOptionPaneShowMessageDialog_Text_First")
					+ selectedFile.getName()
					+ Messages.getInstance().getString("CostMatrixEditor_SaveMatrix_JOptionPaneShowMessageDialog_Text_Second") + ex.getMessage(),
					Messages.getInstance().getString("CostMatrixEditor_SaveMatrix_JOptionPaneShowMessageDialog_Text_Third"),
					JOptionPane.ERROR_MESSAGE);
	  System.out.println(ex.getMessage());
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Constructs a new CostMatrixEditor.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public CostMatrixEditor() {

    m_matrix = new CostMatrix(2);
    m_propSupport = new PropertyChangeSupport(this);
    m_customEditor = new CustomEditor();
  }

  /**
   * Sets the value of the CostMatrix to be edited.
<<<<<<< HEAD
   * 
   * @param value a CostMatrix object to be edited
   */
  @Override
  public void setValue(Object value) {

=======
   *
   * @param value a CostMatrix object to be edited
   */
  public void setValue(Object value) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_matrix = (CostMatrix) value;
    m_customEditor.matrixChanged();
  }

  /**
   * Gets the cost matrix that is being edited.
<<<<<<< HEAD
   * 
   * @return the edited CostMatrix object
   */
  @Override
=======
   *
   * @return the edited CostMatrix object
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Object getValue() {

    return m_matrix;
  }

  /**
   * Indicates whether the object can be represented graphically. In this case
   * it can.
<<<<<<< HEAD
   * 
   * @return true
   */
  @Override
=======
   *
   * @return true
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean isPaintable() {

    return true;
  }

  /**
   * Paints a graphical representation of the object. For the cost matrix it
   * prints out the text "X x X matrix", where X is the size of the matrix.
<<<<<<< HEAD
   * 
   * @param gfx the graphics context to draw the representation to
   * @param box the bounds within which the representation should fit.
   */
  @Override
  public void paintValue(Graphics gfx, Rectangle box) {

    gfx.drawString(m_matrix.size() + " x " + m_matrix.size() + " cost matrix",
      box.x, box.y + box.height);
  }

  /**
   * Returns the Java code that generates an object the same as the one being
   * edited. Unfortunately this can't be done in a single line of code, so the
   * code returned will only build a default cost matrix of the same size.
   * 
   * @return the initialization string
   */
  @Override
=======
   *
   * @param gfx the graphics context to draw the representation to
   * @param box the bounds within which the representation should fit.
   */    
  public void paintValue(Graphics gfx,
			 Rectangle box) {

    gfx.drawString(m_matrix.size() + " x " + m_matrix.size() + " cost matrix",
		   box.x, box.y + box.height);
  }

  /**
   * Returns the Java code that generates an object the same as the one being edited.
   * Unfortunately this can't be done in a single line of code, so the code returned
   * will only build a default cost matrix of the same size.
   *
   * @return the initialization string
   */   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String getJavaInitializationString() {

    return ("new CostMatrix(" + m_matrix.size() + ")");
  }

  /**
   * Some objects can be represented as text, but a cost matrix cannot.
<<<<<<< HEAD
   * 
   * @return null
   */
  @Override
=======
   *
   * @return null
   */   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String getAsText() {

    return null;
  }

  /**
   * Some objects can be represented as text, but a cost matrix cannot.
<<<<<<< HEAD
   * 
   * @param text ignored
   * @throws IllegalArgumentException always throws an IllegalArgumentException
   */
  @Override
  public void setAsText(String text) {
    throw new IllegalArgumentException("CostMatrixEditor: "
      + "CostMatrix properties cannot be " + "expressed as text");
=======
   *
   * @param text ignored
   * @throws IllegalArgumentException always throws an IllegalArgumentException
   */   
  public void setAsText(String text) {
    throw new IllegalArgumentException(Messages.getInstance().getString("CostMatrixEditor_SetAsText_IllegalArgumentException_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Some objects can return tags, but a cost matrix cannot.
<<<<<<< HEAD
   * 
   * @return null
   */
  @Override
=======
   *
   * @return null
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String[] getTags() {

    return null;
  }

  /**
   * Gets a GUI component with which the user can edit the cost matrix.
<<<<<<< HEAD
   * 
   * @return an editor GUI component
   */
  @Override
=======
   *
   * @return an editor GUI component
   */    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Component getCustomEditor() {

    return m_customEditor;
  }

  /**
   * Indicates whether the cost matrix can be edited in a GUI, which it can.
<<<<<<< HEAD
   * 
   * @return true
   */
  @Override
=======
   *
   * @return true
   */     
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean supportsCustomEditor() {

    return true;
  }

  /**
<<<<<<< HEAD
   * Adds an object to the list of those that wish to be informed when the cost
   * matrix changes.
   * 
   * @param listener a new listener to add to the list
   */
  @Override
=======
   * Adds an object to the list of those that wish to be informed when the
   * cost matrix changes.
   *
   * @param listener a new listener to add to the list
   */   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void addPropertyChangeListener(PropertyChangeListener listener) {

    m_propSupport.addPropertyChangeListener(listener);
  }

  /**
   * Removes an object from the list of those that wish to be informed when the
   * cost matrix changes.
<<<<<<< HEAD
   * 
   * @param listener the listener to remove from the list
   */
  @Override
=======
   *
   * @param listener the listener to remove from the list
   */  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void removePropertyChangeListener(PropertyChangeListener listener) {

    m_propSupport.removePropertyChangeListener(listener);
  }
}
