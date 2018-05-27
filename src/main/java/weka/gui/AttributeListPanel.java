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
 *    AttributeListPanel.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;

/**
 * Creates a panel that displays the attributes contained in a set of instances,
 * letting the user select a single attribute for inspection.
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10216 $
 */
public class AttributeListPanel extends JPanel {
<<<<<<< HEAD
=======
=======
/**
 * Creates a panel that displays the attributes contained in a set of
 * instances, letting the user select a single attribute for inspection.
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class AttributeListPanel
  extends JPanel {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -2030706987910400362L;

  /**
   * A table model that looks at the names of attributes.
   */
<<<<<<< HEAD
  class AttributeTableModel extends AbstractTableModel {
=======
<<<<<<< HEAD
  class AttributeTableModel extends AbstractTableModel {
=======
  class AttributeTableModel
    extends AbstractTableModel {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /** for serialization */
    private static final long serialVersionUID = -7345701953670327707L;

    /** The instances who's attribute structure we are reporting */
    protected Instances m_Instances;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Creates the tablemodel with the given set of instances.
     * 
<<<<<<< HEAD
=======
=======
    
    /**
     * Creates the tablemodel with the given set of instances.
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param instances the initial set of Instances
     */
    public AttributeTableModel(Instances instances) {

      setInstances(instances);
    }

    /**
     * Sets the tablemodel to look at a new set of instances.
<<<<<<< HEAD
     * 
=======
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param instances the new set of Instances.
     */
    public void setInstances(Instances instances) {

      m_Instances = instances;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Gets the number of attributes.
     * 
     * @return the number of attributes.
     */
    @Override
    public int getRowCount() {

      return m_Instances.numAttributes();
    }

    /**
     * Gets the number of columns: 2
     * 
     * @return 2
     */
    @Override
    public int getColumnCount() {

      return 2;
    }

    /**
     * Gets a table cell
     * 
<<<<<<< HEAD
=======
=======
    
    /**
     * Gets the number of attributes.
     *
     * @return the number of attributes.
     */
    public int getRowCount() {
      
      return m_Instances.numAttributes();
    }
    
    /**
     * Gets the number of columns: 2
     *
     * @return 2
     */
    public int getColumnCount() {
      
      return 2;
    }
    
    /**
     * Gets a table cell
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param row the row index
     * @param column the column index
     * @return the value at row, column
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public Object getValueAt(int row, int column) {

      switch (column) {
      case 0:
        return new Integer(row + 1);
      case 1:
        return m_Instances.attribute(row).name();
      default:
        return null;
      }
    }

    /**
     * Gets the name for a column.
     * 
     * @param column the column index.
     * @return the name of the column.
     */
    @Override
    public String getColumnName(int column) {

      switch (column) {
      case 0:
        return new String("No.");
      case 1:
        return new String("Name");
      default:
        return null;
      }
    }

    /**
     * Gets the class of elements in a column.
     * 
     * @param col the column index.
     * @return the class of elements in the column.
     */
    @Override
    public Class<?> getColumnClass(int col) {
<<<<<<< HEAD
=======
=======
    public Object getValueAt(int row, int column) {
      
      switch (column) {
      case 0:
	return new Integer(row + 1);
      case 1:
	return m_Instances.attribute(row).name();
      default:
	return null;
      }
    }
    
    /**
     * Gets the name for a column.
     *
     * @param column the column index.
     * @return the name of the column.
     */
    public String getColumnName(int column) {
      
      switch (column) {
      case 0:
	return new String(Messages.getInstance().getString("AttributeListPanel_getColumnName_Number_Text"));
      case 1:
	return new String(Messages.getInstance().getString("AttributeListPanel_getColumnName_Name_Text"));
      default:
	return null;
      }
    }
    
    /**
     * Gets the class of elements in a column.
     *
     * @param col the column index.
     * @return the class of elements in the column.
     */
    public Class getColumnClass(int col) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return getValueAt(0, col).getClass();
    }

    /**
     * Returns false
<<<<<<< HEAD
     * 
=======
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param row ignored
     * @param col ignored
     * @return false
     */
<<<<<<< HEAD
    @Override
=======
<<<<<<< HEAD
    @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public boolean isCellEditable(int row, int col) {

      return false;
    }
  }

  /** The table displaying attribute names */
  protected JTable m_Table = new JTable();

  /** The table model containing attribute names */
  protected AttributeTableModel m_Model;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates the attribute selection panel with no initial instances.
   */
  public AttributeListPanel() {

    m_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
<<<<<<< HEAD
    m_Table.setColumnSelectionAllowed(false);
=======
<<<<<<< HEAD
    m_Table.setColumnSelectionAllowed(false);
=======
    m_Table.setColumnSelectionAllowed(false); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Table.setPreferredScrollableViewportSize(new Dimension(250, 150));

    setLayout(new BorderLayout());
    add(new JScrollPane(m_Table), BorderLayout.CENTER);
  }

  /**
   * Sets the instances who's attribute names will be displayed.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newInstances the new set of instances
   */
  public void setInstances(Instances newInstances) {

    if (m_Model == null) {
      m_Model = new AttributeTableModel(newInstances);
      m_Table.setModel(m_Model);
      TableColumnModel tcm = m_Table.getColumnModel();
      tcm.getColumn(0).setMaxWidth(60);
      tcm.getColumn(1).setMinWidth(100);
    } else {
      m_Model.setInstances(newInstances);
    }
    m_Table.sizeColumnsToFit(-1);
    m_Table.revalidate();
    m_Table.repaint();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the selection model used by the table.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets the selection model used by the table.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a value of type 'ListSelectionModel'
   */
  public ListSelectionModel getSelectionModel() {

    return m_Table.getSelectionModel();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Tests the attribute list panel from the command line.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Tests the attribute list panel from the command line.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param args must contain the name of an arff file to load.
   */
  public static void main(String[] args) {

    try {
      if (args.length == 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        throw new Exception("supply the name of an arff file");
      }
      Instances i = new Instances(new java.io.BufferedReader(
        new java.io.FileReader(args[0])));
      AttributeListPanel asp = new AttributeListPanel();
      final javax.swing.JFrame jf = new javax.swing.JFrame(
        "Attribute List Panel");
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(asp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
<<<<<<< HEAD
=======
=======
	throw new Exception(Messages.getInstance().getString("AttributeListPanel_Main_Error_Text"));
      }
      Instances i = new Instances(new java.io.BufferedReader(
				  new java.io.FileReader(args[0])));
      AttributeListPanel asp = new AttributeListPanel();
      final javax.swing.JFrame jf =
	new javax.swing.JFrame(Messages.getInstance().getString("AttributeListPanel_Main_AttributeListPanel_Text"));
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(asp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
	public void windowClosing(java.awt.event.WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
      jf.pack();
      jf.setVisible(true);
      asp.setInstances(i);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
} // AttributeListPanel
