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
 *    DistributeExperimentPanel.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.experiment;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.experiment.Experiment;
import weka.experiment.RemoteExperiment;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Utils;
import weka.experiment.Experiment;
import weka.experiment.RemoteExperiment;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/** 
 * This panel enables an experiment to be distributed to multiple hosts;
 * it also allows remote host names to be specified.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 14497 $
=======
<<<<<<< HEAD
 * @version $Revision: 14497 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class DistributeExperimentPanel
  extends JPanel {

  /** for serialization */
  private static final long serialVersionUID = 5206721431754800278L;

  /**
   * The experiment to configure.
   */
  RemoteExperiment m_Exp = null;

  /** Distribute the current experiment to remote hosts */
  protected JCheckBox m_enableDistributedExperiment = 
    new JCheckBox();

  /** Popup the HostListPanel */
<<<<<<< HEAD
  protected JButton m_configureHostNames = new JButton("Hosts");
=======
<<<<<<< HEAD
  protected JButton m_configureHostNames = new JButton("Hosts");
=======
  protected JButton m_configureHostNames = new JButton(Messages.getInstance().getString("DistributeExperimentPanel_ConfigureHostNames_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The host list panel */
  protected HostListPanel m_hostList = new HostListPanel();

  /**
   * Split experiment up by data set.
   */
<<<<<<< HEAD
  protected JRadioButton m_splitByDataSet = new JRadioButton("By data set");
=======
<<<<<<< HEAD
  protected JRadioButton m_splitByDataSet = new JRadioButton("By data set");
=======
  protected JRadioButton m_splitByDataSet = new JRadioButton(Messages.getInstance().getString("DistributeExperimentPanel_SplitByDataSet_JRadioButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Split experiment up by run number.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JRadioButton m_splitByRun = new JRadioButton("By run");

  /**
   * Split experiment up by algorithm.
   */
  protected JRadioButton m_splitByProperty = new JRadioButton("By property");
<<<<<<< HEAD
=======
=======
  protected JRadioButton m_splitByRun = new JRadioButton(Messages.getInstance().getString("DistributeExperimentPanel_SplitByRun_JRadioButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Handle radio buttons */
  ActionListener m_radioListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	updateRadioLinks();
      }
<<<<<<< HEAD
    };
  
=======
<<<<<<< HEAD
    };
  
=======
  };

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Constructor
   */
  public DistributeExperimentPanel() {
    m_enableDistributedExperiment.setSelected(false);
    m_enableDistributedExperiment.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      setToolTipText("Allow this experiment to be distributed to remote hosts");
    m_enableDistributedExperiment.setEnabled(false);
    m_configureHostNames.setEnabled(false);
    m_configureHostNames.setToolTipText("Edit the list of remote hosts");
<<<<<<< HEAD
=======
=======
      setToolTipText(Messages.getInstance().getString("DistributeExperimentPanel_EnableDistributedExperiment_SetToolTipText_Text"));
    m_enableDistributedExperiment.setEnabled(false);
    m_configureHostNames.setEnabled(false);
    m_configureHostNames.setToolTipText(Messages.getInstance().getString("DistributeExperimentPanel_ConfigureHostNames_SetToolTipText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    
    m_enableDistributedExperiment.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  m_configureHostNames.setEnabled(m_enableDistributedExperiment.
					  isSelected());
	  m_splitByDataSet.setEnabled(m_enableDistributedExperiment.
					  isSelected());
	  m_splitByRun.setEnabled(m_enableDistributedExperiment.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
					  isSelected());
    m_splitByProperty.setEnabled(m_enableDistributedExperiment.
            isSelected());
  }
<<<<<<< HEAD
=======
=======
					  isSelected());	  
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });

    m_configureHostNames.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  popupHostPanel();
	}
      });

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_splitByDataSet.setToolTipText("Distribute experiment by data set");
    m_splitByRun.setToolTipText("Distribute experiment by run number");
    m_splitByProperty.setToolTipText("Distribute experiment by property");
    m_splitByDataSet.setSelected(true);
    m_splitByDataSet.setEnabled(false);
    m_splitByRun.setEnabled(false);
    m_splitByProperty.setEnabled(false);
    m_splitByDataSet.addActionListener(m_radioListener);
    m_splitByRun.addActionListener(m_radioListener);
    m_splitByProperty.addActionListener(m_radioListener);
<<<<<<< HEAD
=======
=======
    m_splitByDataSet.setToolTipText(Messages.getInstance().getString("DistributeExperimentPanel_SetBorder_BorderFactoryCreateTitledBorder_Text"));
    m_splitByRun.setToolTipText(Messages.getInstance().getString("DistributeExperimentPanel_SplitByRun_SetToolTipText_Text"));
    m_splitByDataSet.setSelected(true);
    m_splitByDataSet.setEnabled(false);
    m_splitByRun.setEnabled(false);
    m_splitByDataSet.addActionListener(m_radioListener);
    m_splitByRun.addActionListener(m_radioListener);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    ButtonGroup bg = new ButtonGroup();
    bg.add(m_splitByDataSet);
    bg.add(m_splitByRun);
<<<<<<< HEAD
    bg.add(m_splitByProperty);
=======
<<<<<<< HEAD
    bg.add(m_splitByProperty);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JPanel rbuts = new JPanel();
    rbuts.setLayout(new GridLayout(1, 2));
    rbuts.add(m_splitByDataSet);
    rbuts.add(m_splitByRun);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    rbuts.add(m_splitByProperty);

    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder("Distribute experiment"));
<<<<<<< HEAD
=======
=======

    setLayout(new BorderLayout());
    setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("DistributeExperimentPanel_SetBorder_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    add(m_enableDistributedExperiment, BorderLayout.WEST);
    add(m_configureHostNames, BorderLayout.CENTER);
    add(rbuts, BorderLayout.SOUTH);
  }

  /**
   * Creates the panel with the supplied initial experiment.
   *
   * @param exp a value of type 'Experiment'
   */
  public DistributeExperimentPanel(Experiment exp) {
    this();
    setExperiment(exp);
  }

  /**
   * Sets the experiment to be configured.
   *
   * @param exp a value of type 'Experiment'
   */
<<<<<<< HEAD
  public void setExperiment(Experiment exp) {
    
=======
<<<<<<< HEAD
  public void setExperiment(Experiment exp) {
    
=======
  public void setExperiment(Experiment exp) {    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_enableDistributedExperiment.setEnabled(true);
    m_Exp = null;
    if (exp instanceof RemoteExperiment) {
      m_Exp = (RemoteExperiment)exp;
      m_enableDistributedExperiment.setSelected(true);
      m_configureHostNames.setEnabled(true);
      m_hostList.setExperiment(m_Exp);
      m_splitByDataSet.setEnabled(true);
      m_splitByRun.setEnabled(true);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_splitByProperty.setEnabled(true);
      m_splitByDataSet.setSelected(m_Exp.getSplitByDataSet());
      m_splitByRun.setSelected(!m_Exp.getSplitByDataSet() && !m_Exp.getSplitByProperty());
      m_splitByProperty.setSelected(m_Exp.getSplitByProperty());
<<<<<<< HEAD
=======
=======
      m_splitByDataSet.setSelected(m_Exp.getSplitByDataSet());
      m_splitByRun.setSelected(!m_Exp.getSplitByDataSet());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Pop up the host list panel
   */
  private void popupHostPanel() {
    try {
<<<<<<< HEAD
      final JFrame jf = Utils.getWekaJFrame("Edit host names", this);
=======
<<<<<<< HEAD
      final JFrame jf = Utils.getWekaJFrame("Edit host names", this);
=======
      final JFrame jf = new JFrame(Messages.getInstance().getString("DistributeExperimentPanel_PopupHostPanel_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(m_hostList,
			      BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
	  public void windowClosing(WindowEvent e) {
	    jf.dispose();
	  }
	});
      jf.pack();
<<<<<<< HEAD
      jf.setLocationRelativeTo(this);
=======
<<<<<<< HEAD
      jf.setLocationRelativeTo(this);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setVisible(true);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }

  /**
   * Returns true if the distribute experiment checkbox is selected
   * @return true if the user has opted for distributing the experiment
   */
  public boolean distributedExperimentSelected() {
    return m_enableDistributedExperiment.isSelected();
  }

  /**
   * Enable objects to listen for changes to the check box
   * @param al an ActionListener
   */
  public void addCheckBoxActionListener(ActionListener al) {
    m_enableDistributedExperiment.addActionListener(al);
  }

  /**
   * Updates the remote experiment when a radio button is clicked
   */
  private void updateRadioLinks() {
    if (m_Exp != null) {
      m_Exp.setSplitByDataSet(m_splitByDataSet.isSelected());
<<<<<<< HEAD
      m_Exp.setSplitByProperty(m_splitByProperty.isSelected());
=======
<<<<<<< HEAD
      m_Exp.setSplitByProperty(m_splitByProperty.isSelected());
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Tests out the panel from the command line.
   *
   * @param args ignored.
   */
  public static void main(String [] args) {
    try {
<<<<<<< HEAD
      final JFrame jf = new JFrame("DistributeExperiment");
=======
<<<<<<< HEAD
      final JFrame jf = new JFrame("DistributeExperiment");
=======
      final JFrame jf = new JFrame(Messages.getInstance().getString("DistributeExperimentPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(new DistributeExperimentPanel(new Experiment()),
			      BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
      });
      jf.pack();
      jf.setVisible(true);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
