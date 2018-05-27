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
 *    AttributeSummaryPanel.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.gui;

<<<<<<< HEAD
=======
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.gui;

import weka.core.Attribute;
import weka.core.AttributeStats;
import weka.core.Instances;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Attribute;
import weka.core.AttributeStats;
import weka.core.Instances;
import weka.core.Utils;

/**
 * This panel displays summary statistics about an attribute: name, type
 * number/% of missing/unique values, number of distinct values. For numeric
 * attributes gives some other stats (mean/std dev), for nominal attributes
 * gives counts for each attribute value.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14589 $
 */
public class AttributeSummaryPanel extends JPanel {

<<<<<<< HEAD
=======
=======
/** 
 * This panel displays summary statistics about an attribute: name, type
 * number/% of missing/unique values, number of distinct values. For
 * numeric attributes gives some other stats (mean/std dev), for nominal
 * attributes gives counts for each attribute value.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class AttributeSummaryPanel 
  extends JPanel {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -5434987925737735880L;

  /** Message shown when no instances have been loaded and no attribute set */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected static final String NO_SOURCE = "None";

  /** Displays the name of the relation */
  protected JLabel m_AttributeNameLab = new JLabel(NO_SOURCE);

  /** Displays the weight of attribute */
  protected JLabel m_AttributeWeightLab = new JLabel(NO_SOURCE);

  /** Displays the string "Weight:" */
  protected JLabel m_WeightLab = new JLabel("Weight:", SwingConstants.RIGHT);

  /** Displays the type of attribute */
  protected JLabel m_AttributeTypeLab = new JLabel(NO_SOURCE);

  /** Displays the number of missing values */
  protected JLabel m_MissingLab = new JLabel(NO_SOURCE);

  /** Displays the number of unique values */
  protected JLabel m_UniqueLab = new JLabel(NO_SOURCE);

<<<<<<< HEAD
=======
=======
  protected static final String NO_SOURCE = Messages.getInstance().getString("AttributeSummaryPanel_NO_SOURCE_Text");

  /** Displays the name of the relation */
  protected JLabel m_AttributeNameLab = new JLabel(NO_SOURCE);
  
  /** Displays the type of attribute */
  protected JLabel m_AttributeTypeLab = new JLabel(NO_SOURCE);
  
  /** Displays the number of missing values */
  protected JLabel m_MissingLab = new JLabel(NO_SOURCE);
    
  /** Displays the number of unique values */
  protected JLabel m_UniqueLab = new JLabel(NO_SOURCE);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Displays the number of distinct values */
  protected JLabel m_DistinctLab = new JLabel(NO_SOURCE);

  /** Displays other stats in a table */
  protected JTable m_StatsTable = new JTable() {
    /** for serialization */
    private static final long serialVersionUID = 7165142874670048578L;

    /**
     * returns always false, since it's just information for the user
     * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param row the row
     * @param column the column
     * @return always false, i.e., the whole table is not editable
     */
    @Override
<<<<<<< HEAD
=======
=======
     * @param row	the row
     * @param column	the column
     * @return		always false, i.e., the whole table is not editable
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public boolean isCellEditable(int row, int column) {
      return false;
    }
  };
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The instances we're playing with */
  protected Instances m_Instances;

  /** Cached stats on the attributes we've summarized so far */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected AttributeStats[] m_AttributeStats;

  /** Do all instances have the same weight */
  protected boolean m_allEqualWeights = true;

<<<<<<< HEAD
=======
=======
  protected AttributeStats [] m_AttributeStats;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates the instances panel with no initial instances.
   */
  public AttributeSummaryPanel() {

    JPanel simple = new JPanel();
    GridBagLayout gbL = new GridBagLayout();
    simple.setLayout(gbL);
<<<<<<< HEAD
    JLabel lab = new JLabel("Name:", SwingConstants.RIGHT);
=======
<<<<<<< HEAD
    JLabel lab = new JLabel("Name:", SwingConstants.RIGHT);
=======
    JLabel lab = new JLabel(Messages.getInstance().getString("AttributeSummaryPanel_Lab_JLabel_Text_First"), SwingConstants.RIGHT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    lab.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
    GridBagConstraints gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 0;
=======
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 0;
=======
    gbC.gridy = 0;     gbC.gridx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(lab, gbC);
    simple.add(lab);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.gridy = 0;
    gbC.gridx = 1;
    gbC.weightx = 100;
    gbC.gridwidth = 3;
    gbL.setConstraints(m_AttributeNameLab, gbC);
    simple.add(m_AttributeNameLab);
    m_AttributeNameLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 10));

    m_WeightLab.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 0;
    gbC.gridx = 2;
    gbL.setConstraints(m_WeightLab, gbC);
    simple.add(m_WeightLab);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 0;
    gbC.gridx = 3;
    gbC.weightx = 100;
    gbC.gridwidth = 3;
    gbL.setConstraints(m_AttributeWeightLab, gbC);
    simple.add(m_AttributeWeightLab);
    m_AttributeWeightLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 10));

    lab = new JLabel("Type:", SwingConstants.RIGHT);
<<<<<<< HEAD
=======
=======
    gbC.gridy = 0;     gbC.gridx = 1;
    gbC.weightx = 100; gbC.gridwidth = 3;
    gbL.setConstraints(m_AttributeNameLab, gbC);
    simple.add(m_AttributeNameLab);
    m_AttributeNameLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 10));
    
    lab = new JLabel(Messages.getInstance().getString("AttributeSummaryPanel_Lab_JLabel_Text_Second"), SwingConstants.RIGHT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    lab.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 4;
=======
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 4;
=======
    gbC.gridy = 0;     gbC.gridx = 4;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(lab, gbC);
    simple.add(lab);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 5;
=======
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 5;
=======
    gbC.gridy = 0;     gbC.gridx = 5;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.weightx = 100;
    gbL.setConstraints(m_AttributeTypeLab, gbC);
    simple.add(m_AttributeTypeLab);
    m_AttributeTypeLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 10));

    // Put into a separate panel?
<<<<<<< HEAD
    lab = new JLabel("Missing:", SwingConstants.RIGHT);
=======
<<<<<<< HEAD
    lab = new JLabel("Missing:", SwingConstants.RIGHT);
=======
    lab = new JLabel(Messages.getInstance().getString("AttributeSummaryPanel_Lab_JLabel_Text_Third"), SwingConstants.RIGHT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    lab.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 0));
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 0;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 0;
=======
    gbC.gridy = 1;     gbC.gridx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(lab, gbC);
    simple.add(lab);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 1;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 1;
=======
    gbC.gridy = 1;     gbC.gridx = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.weightx = 100;
    gbL.setConstraints(m_MissingLab, gbC);
    simple.add(m_MissingLab);
    m_MissingLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 10));

<<<<<<< HEAD
    lab = new JLabel("Distinct:", SwingConstants.RIGHT);
=======
<<<<<<< HEAD
    lab = new JLabel("Distinct:", SwingConstants.RIGHT);
=======
    lab = new JLabel(Messages.getInstance().getString("AttributeSummaryPanel_Lab_JLabel_Text_Fourth"), SwingConstants.RIGHT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    lab.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 0));
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 2;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 2;
=======
    gbC.gridy = 1;     gbC.gridx = 2;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(lab, gbC);
    simple.add(lab);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 3;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 3;
=======
    gbC.gridy = 1;     gbC.gridx = 3;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.weightx = 100;
    gbL.setConstraints(m_DistinctLab, gbC);
    simple.add(m_DistinctLab);
    m_DistinctLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 10));

<<<<<<< HEAD
    lab = new JLabel("Unique:", SwingConstants.RIGHT);
=======
<<<<<<< HEAD
    lab = new JLabel("Unique:", SwingConstants.RIGHT);
=======
    lab = new JLabel(Messages.getInstance().getString("AttributeSummaryPanel_Lab_JLabel_Text_Fifth"), SwingConstants.RIGHT);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    lab.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 0));
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 4;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 4;
=======
    gbC.gridy = 1;     gbC.gridx = 4;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(lab, gbC);
    simple.add(lab);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 5;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 5;
=======
    gbC.gridy = 1;     gbC.gridx = 5;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.weightx = 100;
    gbL.setConstraints(m_UniqueLab, gbC);
    simple.add(m_UniqueLab);
    m_UniqueLab.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 10));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setLayout(new BorderLayout());
    add(simple, BorderLayout.NORTH);
    add(new JScrollPane(m_StatsTable), BorderLayout.CENTER);
    m_StatsTable.getSelectionModel().setSelectionMode(
      ListSelectionModel.SINGLE_SELECTION);
<<<<<<< HEAD
=======
=======
    
    setLayout(new BorderLayout());
    add(simple, BorderLayout.NORTH);
    add(new JScrollPane(m_StatsTable), BorderLayout.CENTER);
    m_StatsTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tells the panel to use a new set of instances.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param inst a set of Instances
   */
  public void setInstances(Instances inst) {

    m_Instances = inst;
    m_AttributeStats = new AttributeStats[inst.numAttributes()];
    m_AttributeNameLab.setText(NO_SOURCE);
    m_AttributeTypeLab.setText(NO_SOURCE);
    m_AttributeWeightLab.setText(NO_SOURCE);
<<<<<<< HEAD
=======
=======
   *
   * @param inst a set of Instances
   */
  public void setInstances(Instances inst) {
    
    m_Instances = inst;
    m_AttributeStats = new AttributeStats [inst.numAttributes()];
    m_AttributeNameLab.setText(NO_SOURCE);
    m_AttributeTypeLab.setText(NO_SOURCE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_MissingLab.setText(NO_SOURCE);
    m_UniqueLab.setText(NO_SOURCE);
    m_DistinctLab.setText(NO_SOURCE);
    m_StatsTable.setModel(new DefaultTableModel());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_allEqualWeights = true;
    if (m_Instances.numInstances() == 0) {
      return;
    }
    double w = m_Instances.instance(0).weight();
    for (int i = 1; i < m_Instances.numInstances(); i++) {
      if (m_Instances.instance(i).weight() != w) {
        m_allEqualWeights = false;
        break;
      }
    }
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the attribute that statistics will be displayed for.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param index the index of the attribute to display
   */
  public void setAttribute(final int index) {

    setHeader(index);
    if (m_AttributeStats[index] == null) {
      Thread t = new Thread() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void run() {
          m_AttributeStats[index] = m_Instances.attributeStats(index);
          SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              setDerived(index);
              m_StatsTable.sizeColumnsToFit(-1);
              m_StatsTable.revalidate();
              m_StatsTable.repaint();
            }
          });
        }
<<<<<<< HEAD
=======
=======
	public void run() {
	  m_AttributeStats[index] = m_Instances
	  .attributeStats(index);
	  SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
	      setDerived(index);
	      m_StatsTable.sizeColumnsToFit(-1);
	      m_StatsTable.revalidate();
	      m_StatsTable.repaint();
	    }
	  });
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      };
      t.setPriority(Thread.MIN_PRIORITY);
      t.start();
    } else {
      setDerived(index);
    }
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Sets the gui elements for fields that are stored in the AttributeStats
   * structure.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param index the index of the attribute
   */
  protected void setDerived(int index) {

<<<<<<< HEAD
=======
=======
   * @param index	the index of the attribute
   */
  protected void setDerived(int index) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    AttributeStats as = m_AttributeStats[index];
    long percent = Math.round(100.0 * as.missingCount / as.totalCount);
    m_MissingLab.setText("" + as.missingCount + " (" + percent + "%)");
    percent = Math.round(100.0 * as.uniqueCount / as.totalCount);
    m_UniqueLab.setText("" + as.uniqueCount + " (" + percent + "%)");
    m_DistinctLab.setText("" + as.distinctCount);
    setTable(as, index);
  }

  /**
   * Creates a tablemodel for the attribute being displayed
   * 
<<<<<<< HEAD
   * @param as the attribute statistics
   * @param index the index of the attribute
=======
<<<<<<< HEAD
   * @param as the attribute statistics
   * @param index the index of the attribute
=======
   * @param as		the attribute statistics
   * @param index	the index of the attribute
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void setTable(AttributeStats as, int index) {

    if (as.nominalCounts != null) {
      Attribute att = m_Instances.attribute(index);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Object[] colNames = { "No.", "Label", "Count", "Weight" };
      Object[][] data = new Object[as.nominalCounts.length][4];
      for (int i = 0; i < as.nominalCounts.length; i++) {
        data[i][0] = new Integer(i + 1);
        data[i][1] = att.value(i);
        data[i][2] = new Integer(as.nominalCounts[i]);
        data[i][3] = new Double(Utils.doubleToString(as.nominalWeights[i], 3));
<<<<<<< HEAD
=======
=======
      Object [] colNames = {Messages.getInstance().getString("AttributeSummaryPanel_SetTable_ColNames_Text_First"), Messages.getInstance().getString("AttributeSummaryPanel_SetTable_ColNames_Text_Second"), Messages.getInstance().getString("AttributeSummaryPanel_SetTable_ColNames_Text_Third")};
      Object [][] data = new Object [as.nominalCounts.length][3];
      for (int i = 0; i < as.nominalCounts.length; i++) {
	data[i][0] = new Integer(i + 1);
	data[i][1] = att.value(i);
	data[i][2] = new Integer(as.nominalCounts[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_StatsTable.setModel(new DefaultTableModel(data, colNames));
      m_StatsTable.getColumnModel().getColumn(0).setMaxWidth(60);
      DefaultTableCellRenderer tempR = new DefaultTableCellRenderer();
      tempR.setHorizontalAlignment(JLabel.RIGHT);
      m_StatsTable.getColumnModel().getColumn(0).setCellRenderer(tempR);
    } else if (as.numericStats != null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Object[] colNames = { "Statistic", "Value" };
      Object[][] data = new Object[4][2];
      data[0][0] = "Minimum";
      data[0][1] = Utils.doubleToString(as.numericStats.min, 3);
      data[1][0] = "Maximum";
      data[1][1] = Utils.doubleToString(as.numericStats.max, 3);
      data[2][0] = "Mean" + ((!m_allEqualWeights) ? " (weighted)" : "");
      data[2][1] = Utils.doubleToString(as.numericStats.mean, 3);
      data[3][0] = "StdDev" + ((!m_allEqualWeights) ? " (weighted)" : "");
      data[3][1] = Utils.doubleToString(as.numericStats.stdDev, 3);
<<<<<<< HEAD
=======
=======
      Object [] colNames = {Messages.getInstance().getString("AttributeSummaryPanel_SetTable_ColNames_Text_Fourth"), Messages.getInstance().getString("AttributeSummaryPanel_SetTable_ColNames_Text_Fifth")};
      Object [][] data = new Object [4][2];
      data[0][0] = Messages.getInstance().getString("AttributeSummaryPanel_SetTable_Data_0_Text"); data[0][1] = Utils.doubleToString(as.numericStats.min, 3);
      data[1][0] = Messages.getInstance().getString("AttributeSummaryPanel_SetTable_Data_1_Text"); data[1][1] = Utils.doubleToString(as.numericStats.max, 3);
      data[2][0] = Messages.getInstance().getString("AttributeSummaryPanel_SetTable_Data_2_Text");    data[2][1] = Utils.doubleToString(as.numericStats.mean, 3);
      data[3][0] = Messages.getInstance().getString("AttributeSummaryPanel_SetTable_Data_3_Text");  data[3][1] = Utils.doubleToString(as.numericStats.stdDev, 3);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_StatsTable.setModel(new DefaultTableModel(data, colNames));
    } else {
      m_StatsTable.setModel(new DefaultTableModel());
    }
    m_StatsTable.getColumnModel().setColumnMargin(4);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the labels for fields we can determine just from the instance header.
   * 
   * @param index the index of the attribute
   */
  protected void setHeader(int index) {

<<<<<<< HEAD
=======
=======
  
  /**
   * Sets the labels for fields we can determine just from the instance
   * header.
   * 
   * @param index	the index of the attribute
   */
  protected void setHeader(int index) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Attribute att = m_Instances.attribute(index);
    m_AttributeNameLab.setText(att.name());
    switch (att.type()) {
    case Attribute.NOMINAL:
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_AttributeTypeLab.setText("Nominal");
      break;
    case Attribute.NUMERIC:
      m_AttributeTypeLab.setText("Numeric");
      break;
    case Attribute.STRING:
      m_AttributeTypeLab.setText("String");
      break;
    case Attribute.DATE:
      m_AttributeTypeLab.setText("Date");
      break;
    case Attribute.RELATIONAL:
      m_AttributeTypeLab.setText("Relational");
      break;
    default:
      m_AttributeTypeLab.setText("Unknown");
      break;
    }
    if (att.weight() != 1.0) {
      m_AttributeWeightLab.setText(Utils.doubleToString(att.weight(), 3));
      m_AttributeWeightLab.setVisible(true);
      m_WeightLab.setVisible(true);
    } else {
      m_AttributeWeightLab.setVisible(false);
      m_WeightLab.setVisible(false);
    }
    m_MissingLab.setText("...");
    m_UniqueLab.setText("...");
    m_DistinctLab.setText("...");
<<<<<<< HEAD
=======
=======
      m_AttributeTypeLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_AttributeNOMINAL_Text"));
      break;
    case Attribute.NUMERIC:
      m_AttributeTypeLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_AttributeNUMERIC_Text"));
      break;
    case Attribute.STRING:
      m_AttributeTypeLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_AttributeSTRING_Text"));
      break;
    case Attribute.DATE:
      m_AttributeTypeLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_AttributeDATE_Text"));
      break;
    case Attribute.RELATIONAL:
      m_AttributeTypeLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_AttributeRELATIONAL_Text"));
      break;
    default:
      m_AttributeTypeLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_AttributeDEFAULT_TEXT"));
      break;
    }
    m_MissingLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_MissingLab_SetText_Text"));
    m_UniqueLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_UniqueLab_SetText_Text"));
    m_DistinctLab.setText(Messages.getInstance().getString("AttributeSummaryPanel_SetHeader_DistinctLab_SetText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tests out the attribute summary panel from the command line.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args optional name of dataset to load
   */
  public static void main(String[] args) {

    try {
      final javax.swing.JFrame jf = new javax.swing.JFrame("Attribute Panel");
      jf.getContentPane().setLayout(new BorderLayout());
      final AttributeSummaryPanel p = new AttributeSummaryPanel();
      p.setBorder(BorderFactory.createTitledBorder("Attribute"));
<<<<<<< HEAD
=======
=======
   *
   * @param args optional name of dataset to load
   */
  public static void main(String [] args) {

    try {
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages.getInstance().getString("AttributeSummaryPanel_Main_JFrame_Text"));
      jf.getContentPane().setLayout(new BorderLayout());
      final AttributeSummaryPanel p = new AttributeSummaryPanel();
      p.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("AttributeSummaryPanel_Main_P_SetBorder_BorderFactoryCreateTitledBorder")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().add(p, BorderLayout.CENTER);
      final javax.swing.JComboBox j = new javax.swing.JComboBox();
      j.setEnabled(false);
      j.addActionListener(new java.awt.event.ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
          p.setAttribute(j.getSelectedIndex());
        }
      });
      jf.getContentPane().add(j, BorderLayout.NORTH);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
<<<<<<< HEAD
=======
=======
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  p.setAttribute(j.getSelectedIndex());
	}
      });
      jf.getContentPane().add(j, BorderLayout.NORTH);
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
      if (args.length == 1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        java.io.Reader r = new java.io.BufferedReader(new java.io.FileReader(
          args[0]));
        Instances inst = new Instances(r);
        p.setInstances(inst);
        p.setAttribute(0);
        String[] names = new String[inst.numAttributes()];
        for (int i = 0; i < names.length; i++) {
          names[i] = inst.attribute(i).name();
        }
        j.setModel(new javax.swing.DefaultComboBoxModel(names));
        j.setEnabled(true);
<<<<<<< HEAD
=======
=======
	java.io.Reader r = new java.io.BufferedReader(
			   new java.io.FileReader(args[0]));
	Instances inst = new Instances(r);
	p.setInstances(inst);
	p.setAttribute(0);
	String [] names = new String [inst.numAttributes()];
	for (int i = 0; i < names.length; i++) {
	  names[i] = inst.attribute(i).name();
	}
	j.setModel(new javax.swing.DefaultComboBoxModel(names));
	j.setEnabled(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
