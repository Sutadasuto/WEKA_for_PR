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
 *    SetupModePanel.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.experiment;

import weka.experiment.Experiment;

<<<<<<< HEAD
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
=======
import java.awt.BorderLayout;
import java.awt.GridLayout;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

<<<<<<< HEAD
=======
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/** 
 * This panel switches between simple and advanced experiment setup panels.
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 12968 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class SetupModePanel
  extends JPanel {

  /** for serialization */
  private static final long serialVersionUID = -3758035565520727822L;

<<<<<<< HEAD
  /** the available panels. */
  protected AbstractSetupPanel[] m_Panels = AbstractSetupPanel.getPanels();

  /** the combobox with all available setup panels. */
  protected JComboBox m_ComboBoxPanels;

  /** The simple setup panel */
  protected AbstractSetupPanel m_defaultPanel = null;

  /** The advanced setup panel */
  protected AbstractSetupPanel m_advancedPanel = null;

  /** the current panel. */
  protected AbstractSetupPanel m_CurrentPanel;
=======
  /** The button for choosing simple setup mode */
  protected JRadioButton m_SimpleSetupRBut = 
    new JRadioButton(Messages.getInstance().getString("SetupModePanel_SimpleSetupRBut_JRadioButton_Text"));

  /** The button for choosing advanced setup mode */
  protected JRadioButton m_AdvancedSetupRBut = 
    new JRadioButton(Messages.getInstance().getString("SetupModePanel_AdvancedSetupRBut_JRadioButton_Text"));  

  /** The simple setup panel */
  protected SimpleSetupPanel m_simplePanel = new SimpleSetupPanel();

  /** The advanced setup panel */
  protected SetupPanel m_advancedPanel = new SetupPanel();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Creates the setup panel with no initial experiment.
   */
  public SetupModePanel() {

<<<<<<< HEAD
    // no panels discovered?
    if (m_Panels.length == 0) {
      System.err.println("No experimenter setup panels discovered? Using fallback (simple, advanced).");
      m_Panels = new AbstractSetupPanel[]{
	new SetupPanel(),
	new SimpleSetupPanel()
      };
    }

    for (AbstractSetupPanel panel: m_Panels) {
      if (panel.getClass().getName().equals(ExperimenterDefaults.getSetupPanel()))
	m_defaultPanel = panel;
      if (panel instanceof SetupPanel)
	m_advancedPanel = panel;
      panel.setModePanel(this);
    }

    // fallback on simple setup panel
    if (m_defaultPanel == null) {
      for (AbstractSetupPanel panel: m_Panels) {
	if (panel instanceof SimpleSetupPanel)
	  m_defaultPanel = panel;
      }
    }

    m_CurrentPanel = m_defaultPanel;

    m_ComboBoxPanels = new JComboBox(m_Panels);
    m_ComboBoxPanels.setSelectedItem(m_defaultPanel);
    m_ComboBoxPanels.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
	if (m_ComboBoxPanels.getSelectedIndex() == -1)
	  return;
	AbstractSetupPanel panel = (AbstractSetupPanel) m_ComboBoxPanels.getSelectedItem();
	switchTo(panel, null);
      }
    });

    JPanel switchPanel = new JPanel();
    switchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    switchPanel.add(new JLabel("Experiment Configuration Mode"));
    switchPanel.add(m_ComboBoxPanels);

    setLayout(new BorderLayout());
    add(switchPanel, BorderLayout.NORTH);
    add(m_defaultPanel, BorderLayout.CENTER);
  }

  /**
   * Switches to the advanced panel.
=======
    m_simplePanel.setModePanel(this);

    m_SimpleSetupRBut.setMnemonic('S');
    m_SimpleSetupRBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  switchToSimple(null);
	}
      });

    m_AdvancedSetupRBut.setMnemonic('A');
    m_AdvancedSetupRBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  switchToAdvanced(null);
	}
      });

    ButtonGroup modeBG = new ButtonGroup();
    modeBG.add(m_SimpleSetupRBut);
    modeBG.add(m_AdvancedSetupRBut);
    m_SimpleSetupRBut.setSelected(true);

    JPanel modeButtons = new JPanel();
    modeButtons.setLayout(new GridLayout(1,0));
    modeButtons.add(m_SimpleSetupRBut);
    modeButtons.add(m_AdvancedSetupRBut);

    JPanel switchPanel = new JPanel();
    switchPanel.setLayout(new GridLayout(1,0));
    switchPanel.add(new JLabel(Messages.getInstance().getString("SetupModePanel_SwitchPanel_JPanel_Text")));
    switchPanel.add(modeButtons);

    setLayout(new BorderLayout());
    add(switchPanel, BorderLayout.NORTH);
    add(m_simplePanel, BorderLayout.CENTER);
  }

  /**
   * Switches to the advanced setup mode.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param exp the experiment to configure
   */
  public void switchToAdvanced(Experiment exp) {
<<<<<<< HEAD
    switchTo(m_advancedPanel, exp);
    m_ComboBoxPanels.setSelectedItem(m_advancedPanel);
  }

  /**
   * Switches to the specified panel. Switching from advanced panel to simple panel without conversion
   * is not permitted by this method.
   *
   * @param panel the panel to switch to
   * @param exp the experiment to configure
   */
  public void switchTo(AbstractSetupPanel panel, Experiment exp) {
    if (exp == null)
      exp = m_CurrentPanel.getExperiment();

    if (exp != null) {
      if (!panel.setExperiment(exp)) {
        m_ComboBoxPanels.setSelectedItem(m_CurrentPanel);
        return;
      }
    }

    remove(m_CurrentPanel);
    m_CurrentPanel.cleanUpAfterSwitch();
    add(panel, BorderLayout.CENTER);
    validate();
    repaint();

    m_CurrentPanel = panel;
  }

  /**
   * Adds a PropertyChangeListener who will be notified of value changes.
   *
   * @param l a value of type 'PropertyChangeListener'
   */
  public void addPropertyChangeListener(PropertyChangeListener l) {
    if (m_Panels != null) {
      for (AbstractSetupPanel panel : m_Panels)
        panel.addPropertyChangeListener(l);
=======
 
    if (exp == null) {
      exp = m_simplePanel.getExperiment();
    }
    if (exp != null) {
      m_AdvancedSetupRBut.setSelected(true);
      m_advancedPanel.setExperiment(exp);
    }
    remove(m_simplePanel);
    m_simplePanel.removeNotesFrame();
    add(m_advancedPanel, BorderLayout.CENTER);
    validate();
    repaint();
  }
  
  /**
   * Switches to the simple setup mode only if allowed to.
   *
   * @param exp the experiment to configure
   */
  public void switchToSimple(Experiment exp) {
    
    if (exp == null) {
      exp = m_advancedPanel.getExperiment();
    }
    if (exp != null && !m_simplePanel.setExperiment(exp)) {
      m_AdvancedSetupRBut.setSelected(true);
      switchToAdvanced(exp);
    } else {
      remove(m_advancedPanel);
      m_advancedPanel.removeNotesFrame();
      add(m_simplePanel, BorderLayout.CENTER);
      validate();
      repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Removes a PropertyChangeListener who will be notified of value changes.
   *
   * @param l a value of type 'PropertyChangeListener'
   */
  public void removePropertyChangeListener(PropertyChangeListener l) {
    if (m_Panels != null) {
      for (AbstractSetupPanel panel : m_Panels)
        panel.removePropertyChangeListener(l);
    }
=======
   * Adds a PropertyChangeListener who will be notified of value changes.
   *
   * @param l a value of type 'PropertyChangeListener'
   */
  public void addPropertyChangeListener(PropertyChangeListener l) {

    m_simplePanel.addPropertyChangeListener(l);
    m_advancedPanel.addPropertyChangeListener(l);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the currently configured experiment.
   *
   * @return the currently configured experiment.
   */
  public Experiment getExperiment() {
<<<<<<< HEAD
    return m_CurrentPanel.getExperiment();
=======

    if (m_SimpleSetupRBut.isSelected()) return m_simplePanel.getExperiment();
    else return m_advancedPanel.getExperiment();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
