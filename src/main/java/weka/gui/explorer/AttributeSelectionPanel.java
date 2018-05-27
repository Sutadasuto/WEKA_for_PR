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
 *    AttributeSelectionPanel.java
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

package weka.gui.explorer;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.Color;
=======
<<<<<<< HEAD
import java.awt.Color;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.swing.*;
<<<<<<< HEAD
=======
=======
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import weka.attributeSelection.ASEvaluation;
import weka.attributeSelection.ASSearch;
import weka.attributeSelection.AttributeEvaluator;
import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.AttributeTransformer;
<<<<<<< HEAD
import weka.attributeSelection.BestFirst;
import weka.attributeSelection.CfsSubsetEval;
=======
<<<<<<< HEAD
import weka.attributeSelection.BestFirst;
import weka.attributeSelection.CfsSubsetEval;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.attributeSelection.Ranker;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Defaults;
import weka.core.Environment;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Settings;
import weka.core.Utils;
import weka.gui.AbstractPerspective;
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.Logger;
import weka.gui.PerspectiveInfo;
<<<<<<< HEAD
=======
=======
import weka.core.FastVector;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.Logger;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.PropertyPanel;
import weka.gui.ResultHistoryPanel;
import weka.gui.SaveBuffer;
import weka.gui.SysErrLog;
import weka.gui.TaskLogger;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeEvent;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeListener;
import weka.gui.explorer.Explorer.ExplorerPanel;
import weka.gui.explorer.Explorer.LogHandler;
import weka.gui.visualize.MatrixPanel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * This panel allows the user to select and configure an attribute evaluator and
 * a search method, set the attribute of the current dataset to be used as the
 * class, and perform attribute selection using one of two selection modes
 * (select using all the training data or perform a n-fold cross validation---on
 * each trial selecting features using n-1 folds of the data). The results of
 * attribute selection runs are stored in a results history so that previous
 * results are accessible.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
@PerspectiveInfo(ID = "weka.gui.explorer.attributeselectionpanel",
  title = "Select attributes",
  toolTipText = "Determine relevance of attributes",
  iconPath = "weka/gui/weka_icon_new_small.png")
public class AttributeSelectionPanel extends AbstractPerspective implements
  CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {

<<<<<<< HEAD
=======
=======
/** 
 * This panel allows the user to select and configure an attribute
 * evaluator and a search method, set the
 * attribute of the current dataset to be used as the class, and perform
 * attribute selection using one of two  selection modes (select using all the
 * training data or perform a n-fold cross validation---on each trial
 * selecting features using n-1 folds of the data).
 * The results of attribute selection runs are stored in a results history
 * so that previous results are accessible.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 9495 $
 */
public class AttributeSelectionPanel 
  extends JPanel
  implements CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = 5627185966993476142L;

  /** the parent frame */
  protected Explorer m_Explorer = null;

  /** Lets the user configure the attribute evaluator */
  protected GenericObjectEditor m_AttributeEvaluatorEditor =
    new GenericObjectEditor();

  /** Lets the user configure the search method */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected GenericObjectEditor m_AttributeSearchEditor =
    new GenericObjectEditor();

  /** The panel showing the current attribute evaluation method */
  protected PropertyPanel m_AEEPanel = new PropertyPanel(
    m_AttributeEvaluatorEditor);

  /** The panel showing the current search method */
  protected PropertyPanel m_ASEPanel = new PropertyPanel(
    m_AttributeSearchEditor);

<<<<<<< HEAD
=======
=======
  protected GenericObjectEditor m_AttributeSearchEditor = 
    new GenericObjectEditor();

  /** The panel showing the current attribute evaluation method */
  protected PropertyPanel m_AEEPanel = 
    new PropertyPanel(m_AttributeEvaluatorEditor);

  /** The panel showing the current search method */
  protected PropertyPanel m_ASEPanel = 
    new PropertyPanel(m_AttributeSearchEditor);
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The output area for attribute selection results */
  protected JTextArea m_OutText = new JTextArea(20, 40);

  /** The destination for log/status messages */
  protected Logger m_Log = new SysErrLog();

  /** The buffer saving object for saving output */
  SaveBuffer m_SaveOut = new SaveBuffer(m_Log, this);

  /** A panel controlling results viewing */
  protected ResultHistoryPanel m_History = new ResultHistoryPanel(m_OutText);

  /** Lets the user select the class column */
  protected JComboBox m_ClassCombo = new JComboBox();

  /** Click to set evaluation mode to cross-validation */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JRadioButton m_CVBut = new JRadioButton("Cross-validation");

  /** Click to set test mode to test on training data */
  protected JRadioButton m_TrainBut = new JRadioButton("Use full training set");

  /** Label by where the cv folds are entered */
  protected JLabel m_CVLab = new JLabel("Folds", SwingConstants.RIGHT);

  /** The field where the cv folds are entered */
  protected JTextField m_CVText = new JTextField("10");

  /** Label by where cv random seed is entered */
  protected JLabel m_SeedLab = new JLabel("Seed", SwingConstants.RIGHT);

  /** The field where the seed value is entered */
  protected JTextField m_SeedText = new JTextField("1");

  /**
   * Alters the enabled/disabled status of elements associated with each radio
   * button
   */
  ActionListener m_RadioListener = new ActionListener() {
    @Override
<<<<<<< HEAD
=======
=======
  protected JRadioButton m_CVBut = new JRadioButton(Messages.getInstance().getString("AttributeSelectionPanel_CVBut_JRadioButton_Text"));

  /** Click to set test mode to test on training data */
  protected JRadioButton m_TrainBut = new JRadioButton(Messages.getInstance().getString("AttributeSelectionPanel_TrainBut_JRadioButton_Text"));

  /** Label by where the cv folds are entered */
  protected JLabel m_CVLab = new JLabel(Messages.getInstance().getString("AttributeSelectionPanel_CVLab_JLabel_Text"), SwingConstants.RIGHT);

  /** The field where the cv folds are entered */
  protected JTextField m_CVText = new JTextField(Messages.getInstance().getString("AttributeSelectionPanel_CVText_JTextField_Text"));

  //protected JTextField m_CVText = new JTextField(10);
  
  /** Label by where cv random seed is entered */
  protected JLabel m_SeedLab = new JLabel(Messages.getInstance().getString("AttributeSelectionPanel_SeedLab_JLabel_Text"),SwingConstants.RIGHT);

  /** The field where the seed value is entered */
  protected JTextField m_SeedText = new JTextField(Messages.getInstance().getString("AttributeSelectionPanel_SeedText_JTextField_Text"));

  /** Click to set evaluation mode to cross-validation */
  //protected JRadioButton m_CVBut = new JRadioButton("Cross-validation");

  /** Click to set test mode to test on training data */
  //protected JRadioButton m_TrainBut = 
  //  new JRadioButton("Use full training set");

  /** Label by where the cv folds are entered */
  //protected JLabel m_CVLab = new JLabel("Folds", SwingConstants.RIGHT);

  /** The field where the cv folds are entered */
  //protected JTextField m_CVText = new JTextField("10");

  /** Label by where cv random seed is entered */
  //protected JLabel m_SeedLab = new JLabel("Seed",SwingConstants.RIGHT);

  /** The field where the seed value is entered */
  //protected JTextField m_SeedText = new JTextField("1");
  
  /**
   * Alters the enabled/disabled status of elements associated with each
   * radio button
   */
  ActionListener m_RadioListener = new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public void actionPerformed(ActionEvent e) {
      updateRadioLinks();
    }
  };

  /** Click to start running the attribute selector */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JButton m_StartBut = new JButton("Start");

  /** Click to stop a running classifier */
  protected JButton m_StopBut = new JButton("Stop");

  /** Stop the class combo from taking up to much space */
  private final Dimension COMBO_SIZE = new Dimension(150,
    m_StartBut.getPreferredSize().height);

<<<<<<< HEAD
=======
=======
  protected JButton m_StartBut = new JButton(Messages.getInstance().getString("AttributeSelectionPanel_StartBut_JButton_Text"));

  /** Click to stop a running classifier */
  protected JButton m_StopBut = new JButton(Messages.getInstance().getString("AttributeSelectionPanel_StopBut_JButton_Text"));

 /** Stop the class combo from taking up to much space */
  private Dimension COMBO_SIZE = new Dimension(150, m_StartBut
					       .getPreferredSize().height);
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The main set of instances we're playing with */
  protected Instances m_Instances;

  /** A thread that attribute selection runs in */
  protected Thread m_RunThread;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** True if startup settings have been applied */
  protected boolean m_initialSettingsSet;

  /* Register the property editors we need */
  static {
    GenericObjectEditor.registerEditors();
  }

<<<<<<< HEAD
=======
=======
  /* Register the property editors we need */
  static {
     GenericObjectEditor.registerEditors();
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates the classifier panel
   */
  public AttributeSelectionPanel() {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // Connect / configure the components
    m_OutText.setEditable(false);
    m_OutText.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_OutText.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    m_OutText.addMouseListener(new MouseAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      @Override
      public void mouseClicked(MouseEvent e) {
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK) {
          m_OutText.selectAll();
        }
      }
    });
    JPanel historyHolder = new JPanel(new BorderLayout());
    historyHolder.setBorder(BorderFactory
      .createTitledBorder("Result list (right-click for options)"));
    historyHolder.add(m_History, BorderLayout.CENTER);
    m_AttributeEvaluatorEditor.setClassType(ASEvaluation.class);
    m_AttributeEvaluatorEditor.setValue(ExplorerDefaults.getASEvaluator());
    m_AttributeEvaluatorEditor
      .addPropertyChangeListener(new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent e) {
          if (m_AttributeEvaluatorEditor.getValue() instanceof AttributeEvaluator) {
            if (!(m_AttributeSearchEditor.getValue() instanceof Ranker)) {
              Object backup = m_AttributeEvaluatorEditor.getBackup();
              int result =
                JOptionPane.showConfirmDialog(null,
                  "You must use use the Ranker search method "
                    + "in order to use\n"
                    + m_AttributeEvaluatorEditor.getValue().getClass()
                      .getName()
                    + ".\nShould I select the Ranker search method for you?",
                  "Alert!", JOptionPane.YES_NO_OPTION);
              if (result == JOptionPane.YES_OPTION) {
                m_AttributeSearchEditor.setValue(new Ranker());
              } else {
                // restore to what was there previously (if possible)
                if (backup != null) {
                  m_AttributeEvaluatorEditor.setValue(backup);
                }
              }
            }
          } else {
            if (m_AttributeSearchEditor.getValue() instanceof Ranker) {
              Object backup = m_AttributeEvaluatorEditor.getBackup();
              int result =
                JOptionPane
                  .showConfirmDialog(
                    null,
                    "You must use use a search method that explores \n"
                      + "the space of attribute subsets (such as GreedyStepwise) in "
                      + "order to use\n"
                      + m_AttributeEvaluatorEditor.getValue().getClass()
                        .getName()
                      + ".\nShould I select the GreedyStepwise search method for "
                      + "you?\n(you can always switch to a different method afterwards)",
                    "Alert!", JOptionPane.YES_NO_OPTION);
              if (result == JOptionPane.YES_OPTION) {
                m_AttributeSearchEditor
                  .setValue(new weka.attributeSelection.GreedyStepwise());
              } else {
                // restore to what was there previously (if possible)
                if (backup != null) {
                  m_AttributeEvaluatorEditor.setValue(backup);
                }
              }
            }
          }
          updateRadioLinks();

          m_StartBut.setEnabled(true);
          // check capabilities...
          Capabilities currentFilter =
            m_AttributeEvaluatorEditor.getCapabilitiesFilter();
          ASEvaluation evaluator =
            (ASEvaluation) m_AttributeEvaluatorEditor.getValue();
          Capabilities currentSchemeCapabilities = null;
          if (evaluator != null && currentFilter != null
            && (evaluator instanceof CapabilitiesHandler)) {
            currentSchemeCapabilities =
              ((CapabilitiesHandler) evaluator).getCapabilities();

            if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
              && !currentSchemeCapabilities.supports(currentFilter)) {
              m_StartBut.setEnabled(false);
            }
          }
          repaint();
        }
      });

    m_AttributeSearchEditor.setClassType(ASSearch.class);
    m_AttributeSearchEditor.setValue(ExplorerDefaults.getASSearch());
    m_AttributeSearchEditor
      .addPropertyChangeListener(new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent e) {
          if (m_AttributeSearchEditor.getValue() instanceof Ranker) {
            if (!(m_AttributeEvaluatorEditor.getValue() instanceof AttributeEvaluator)) {
              Object backup = m_AttributeSearchEditor.getBackup();
              int result =
                JOptionPane
                  .showConfirmDialog(
                    null,
                    "You must use use an evaluator that evaluates\n"
                      + "single attributes (such as InfoGain) in order to use\n"
                      + "the Ranker. Should I select the InfoGain evaluator "
                      + "for you?\n"
                      + "(You can always switch to a different method afterwards)",
                    "Alert!", JOptionPane.YES_NO_OPTION);
              if (result == JOptionPane.YES_OPTION) {
                m_AttributeEvaluatorEditor
                  .setValue(new weka.attributeSelection.InfoGainAttributeEval());
<<<<<<< HEAD
=======
=======
      public void mouseClicked(MouseEvent e) {
	if ((e.getModifiers() & InputEvent.BUTTON1_MASK)
	    != InputEvent.BUTTON1_MASK) {
	  m_OutText.selectAll();
	}
      }
    });
    m_History.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("AttributeSelectionPanel_History_BorderFactoryCreateTitledBorder_Text")));
    m_AttributeEvaluatorEditor.setClassType(ASEvaluation.class);
    m_AttributeEvaluatorEditor.setValue(ExplorerDefaults.getASEvaluator());
    m_AttributeEvaluatorEditor.
      addPropertyChangeListener(new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent e) {
        if (m_AttributeEvaluatorEditor.getValue() instanceof AttributeEvaluator) {
          if (!(m_AttributeSearchEditor.getValue() instanceof Ranker)) {
            Object backup = m_AttributeEvaluatorEditor.getBackup();
            int result = 
              JOptionPane.showConfirmDialog(null, Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_First")
                                            +m_AttributeEvaluatorEditor.getValue().getClass().getName()
                                            +Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Second"),
                                            Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Third"), JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
              m_AttributeSearchEditor.setValue(new Ranker());
            } else {
              // restore to what was there previously (if possible)
              if (backup != null) {
                m_AttributeEvaluatorEditor.setValue(backup);
              }             
            }
          }
        } else {
          if (m_AttributeSearchEditor.getValue() instanceof Ranker) {
            Object backup = m_AttributeEvaluatorEditor.getBackup();
            int result = 
              JOptionPane.showConfirmDialog(null, Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Fourth")
                                            +m_AttributeEvaluatorEditor.getValue().getClass().getName()
                                            +Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Fifth"),
                                            Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Sixth"), JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
              m_AttributeSearchEditor.setValue(new weka.attributeSelection.GreedyStepwise());
            } else {
              // restore to what was there previously (if possible)
              if (backup != null) {
                m_AttributeEvaluatorEditor.setValue(backup);
              } 
            }
          }
        }
	updateRadioLinks();
	
	m_StartBut.setEnabled(true);
	// check capabilities...
        Capabilities currentFilter = m_AttributeEvaluatorEditor.getCapabilitiesFilter();
        ASEvaluation evaluator = (ASEvaluation) m_AttributeEvaluatorEditor.getValue();
        Capabilities currentSchemeCapabilities =  null;
        if (evaluator != null && currentFilter != null && 
            (evaluator instanceof CapabilitiesHandler)) {
          currentSchemeCapabilities = ((CapabilitiesHandler)evaluator).getCapabilities();
          
          if (!currentSchemeCapabilities.supportsMaybe(currentFilter) &&
              !currentSchemeCapabilities.supports(currentFilter)) {
            m_StartBut.setEnabled(false);
          }
        }
	repaint();
      }
    });

    m_AttributeSearchEditor.setClassType(ASSearch.class);
    m_AttributeSearchEditor.setValue(ExplorerDefaults.getASSearch());
    m_AttributeSearchEditor.
      addPropertyChangeListener(new PropertyChangeListener() {
	public void propertyChange(PropertyChangeEvent e) {
          if (m_AttributeSearchEditor.getValue() instanceof Ranker) {
            if (!(m_AttributeEvaluatorEditor.getValue() instanceof AttributeEvaluator)) {
              Object backup = m_AttributeSearchEditor.getBackup();
              int result = 
                JOptionPane.showConfirmDialog(null, Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Seventh"),
                                              Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Eigth"), JOptionPane.YES_NO_OPTION);
              if (result == JOptionPane.YES_OPTION) {
                m_AttributeEvaluatorEditor.setValue(new weka.attributeSelection.InfoGainAttributeEval());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              } else {
                // restore to what was there previously (if possible)
                if (backup != null) {
                  m_AttributeSearchEditor.setValue(backup);
<<<<<<< HEAD
                }
=======
<<<<<<< HEAD
                }
=======
                }             
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              }
            }
          } else {
            if (m_AttributeEvaluatorEditor.getValue() instanceof AttributeEvaluator) {
              Object backup = m_AttributeSearchEditor.getBackup();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              int result =
                JOptionPane
                  .showConfirmDialog(
                    null,
                    "You must use use an evaluator that evaluates\n"
                      + "subsets of attributes (such as CFS) in order to use\n"
                      + m_AttributeEvaluatorEditor.getValue().getClass()
                        .getName()
                      + ".\nShould I select the CFS subset evaluator for you?"
                      + "\n(you can always switch to a different method afterwards)",
                    "Alert!", JOptionPane.YES_NO_OPTION);

              if (result == JOptionPane.YES_OPTION) {
                m_AttributeEvaluatorEditor
                  .setValue(new weka.attributeSelection.CfsSubsetEval());
<<<<<<< HEAD
=======
=======
              int result = 
                JOptionPane.showConfirmDialog(null, Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Nineth")
                                              +m_AttributeEvaluatorEditor.getValue().getClass().getName()
                                              +Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Tenth"),
                                              Messages.getInstance().getString("AttributeSelectionPanel_Result_JOptionPaneShowConfirmDialog_Text_Eleventh"), JOptionPane.YES_NO_OPTION);

              if (result == JOptionPane.YES_OPTION) {
                m_AttributeEvaluatorEditor.setValue(new weka.attributeSelection.CfsSubsetEval());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              } else {
                // restore to what was there previously (if possible)
                if (backup != null) {
                  m_AttributeSearchEditor.setValue(backup);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                }
              }
            }
          }
          repaint();
        }
      });

    m_ClassCombo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        updateCapabilitiesFilter(m_AttributeEvaluatorEditor
          .getCapabilitiesFilter());
      }
    });

    m_ClassCombo.setToolTipText("Select the attribute to use as the class");
    m_TrainBut.setToolTipText("select attributes using the full training "
      + "dataset");
    m_CVBut.setToolTipText("Perform a n-fold cross-validation");

    m_StartBut.setToolTipText("Starts attribute selection");
    m_StopBut.setToolTipText("Stops a attribute selection task");

<<<<<<< HEAD
=======
=======
                }              
              }
            }
          }
	  repaint();
	}
      });
    
    m_ClassCombo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	updateCapabilitiesFilter(m_AttributeEvaluatorEditor.getCapabilitiesFilter());
      }
    });

    m_ClassCombo.setToolTipText(Messages.getInstance().getString("AttributeSelectionPanel_ClassCombo_SetToolTipText_Text"));
    m_TrainBut.setToolTipText(Messages.getInstance().getString("AttributeSelectionPanel_TrainBut_SetToolTipText_Text"));
    m_CVBut.setToolTipText(Messages.getInstance().getString("AttributeSelectionPanel_CVBut_SetToolTipText_Text"));

    m_StartBut.setToolTipText(Messages.getInstance().getString("AttributeSelectionPanel_StartBut_SetToolTipText_Text"));
    m_StopBut.setToolTipText(Messages.getInstance().getString("AttributeSelectionPanel_StopBut_SetToolTipText_Text"));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_ClassCombo.setPreferredSize(COMBO_SIZE);
    m_ClassCombo.setMaximumSize(COMBO_SIZE);
    m_ClassCombo.setMinimumSize(COMBO_SIZE);
    m_History.setPreferredSize(COMBO_SIZE);
    m_History.setMaximumSize(COMBO_SIZE);
    m_History.setMinimumSize(COMBO_SIZE);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_ClassCombo.setEnabled(false);
    m_TrainBut.setSelected(ExplorerDefaults.getASTestMode() == 0);
    m_CVBut.setSelected(ExplorerDefaults.getASTestMode() == 1);
    updateRadioLinks();
    ButtonGroup bg = new ButtonGroup();
    bg.add(m_TrainBut);
    bg.add(m_CVBut);

    m_TrainBut.addActionListener(m_RadioListener);
    m_CVBut.addActionListener(m_RadioListener);

    m_CVText.setText("" + ExplorerDefaults.getASCrossvalidationFolds());
    m_SeedText.setText("" + ExplorerDefaults.getASRandomSeed());
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_StartBut.setEnabled(false);
    m_StopBut.setEnabled(false);

    m_StartBut.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        boolean proceed = true;
        if (Explorer.m_Memory.memoryIsLow()) {
          proceed = Explorer.m_Memory.showMemoryIsLow();
        }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (proceed) {
          startAttributeSelection();
        }
      }
    });
    m_StopBut.addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      @Override
      public void actionPerformed(ActionEvent e) {
        stopAttributeSelection();
      }
    });

    m_History.setHandleRightClicks(false);
    // see if we can popup a menu for the selected result
    m_History.getList().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
          || e.isAltDown()) {
          int index = m_History.getList().locationToIndex(e.getPoint());
          if (index != -1) {
            List<String> selectedEls =
              (List<String>) m_History.getList().getSelectedValuesList();
            visualize(selectedEls, e.getX(), e.getY());
          } else {
            visualize(null, e.getX(), e.getY());
          }
        }
      }
    });
<<<<<<< HEAD
=======
=======
      public void actionPerformed(ActionEvent e) {
	stopAttributeSelection();
      }
    });
    
    m_History.setHandleRightClicks(false);
    // see if we can popup a menu for the selected result
    m_History.getList().addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
	  if (((e.getModifiers() & InputEvent.BUTTON1_MASK)
	       != InputEvent.BUTTON1_MASK) || e.isAltDown()) {
	    int index = m_History.getList().locationToIndex(e.getPoint());
	    if (index != -1) {
	      String name = m_History.getNameAtIndex(index);
	      visualize(name, e.getX(), e.getY());
	    } else {
	      visualize(null, e.getX(), e.getY());
	    }
	  }
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Layout the GUI
    JPanel p1 = new JPanel();
    p1.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Attribute Evaluator"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Attribute Evaluator"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
		 BorderFactory.createTitledBorder(Messages.getInstance().getString("AttributeSelectionPanel_P1_BorderFactoryCreateTitledBorder_Text")),
		 BorderFactory.createEmptyBorder(0, 5, 5, 5)
		 ));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p1.setLayout(new BorderLayout());
    p1.add(m_AEEPanel, BorderLayout.NORTH);

    JPanel p1_1 = new JPanel();
    p1_1.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Search Method"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Search Method"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
		 BorderFactory.createTitledBorder(Messages.getInstance().getString("AttributeSelectionPanel_P1_1_BorderFactoryCreateTitledBorder_Text")),
		 BorderFactory.createEmptyBorder(0, 5, 5, 5)
		 ));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p1_1.setLayout(new BorderLayout());
    p1_1.add(m_ASEPanel, BorderLayout.NORTH);

    JPanel p_new = new JPanel();
    p_new.setLayout(new BorderLayout());
    p_new.add(p1, BorderLayout.NORTH);
    p_new.add(p1_1, BorderLayout.CENTER);

    JPanel p2 = new JPanel();
    GridBagLayout gbL = new GridBagLayout();
    p2.setLayout(gbL);
    p2.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      BorderFactory.createTitledBorder("Attribute Selection Mode"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
    GridBagConstraints gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 2;
    gbC.gridx = 0;
<<<<<<< HEAD
=======
=======
		 BorderFactory.createTitledBorder(Messages.getInstance().getString("AttributeSelectionPanel_P2_BorderFactoryCreateTitledBorder_Text")),
		 BorderFactory.createEmptyBorder(0, 5, 5, 5)
		 ));
    GridBagConstraints gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 2;     gbC.gridx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(m_TrainBut, gbC);
    p2.add(m_TrainBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
<<<<<<< HEAD
    gbC.gridy = 4;
    gbC.gridx = 0;
=======
<<<<<<< HEAD
    gbC.gridy = 4;
    gbC.gridx = 0;
=======
    gbC.gridy = 4;     gbC.gridx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(m_CVBut, gbC);
    p2.add(m_CVBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 4;
    gbC.gridx = 1;
=======
<<<<<<< HEAD
    gbC.gridy = 4;
    gbC.gridx = 1;
=======
    gbC.gridy = 4;     gbC.gridx = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.insets = new Insets(2, 10, 2, 10);
    gbL.setConstraints(m_CVLab, gbC);
    p2.add(m_CVLab);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 4;
    gbC.gridx = 2;
    gbC.weightx = 100;
=======
<<<<<<< HEAD
    gbC.gridy = 4;
    gbC.gridx = 2;
    gbC.weightx = 100;
=======
    gbC.gridy = 4;     gbC.gridx = 2;  gbC.weightx = 100;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.ipadx = 20;
    gbL.setConstraints(m_CVText, gbC);
    p2.add(m_CVText);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 6;
    gbC.gridx = 1;
=======
<<<<<<< HEAD
    gbC.gridy = 6;
    gbC.gridx = 1;
=======
    gbC.gridy = 6;     gbC.gridx = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.insets = new Insets(2, 10, 2, 10);
    gbL.setConstraints(m_SeedLab, gbC);
    p2.add(m_SeedLab);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 6;
    gbC.gridx = 2;
    gbC.weightx = 100;
=======
<<<<<<< HEAD
    gbC.gridy = 6;
    gbC.gridx = 2;
    gbC.weightx = 100;
=======
    gbC.gridy = 6;     gbC.gridx = 2;  gbC.weightx = 100;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.ipadx = 20;
    gbL.setConstraints(m_SeedText, gbC);
    p2.add(m_SeedText);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JPanel buttons = new JPanel();
    buttons.setLayout(new GridLayout(2, 2));
    buttons.add(m_ClassCombo);
    m_ClassCombo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    JPanel ssButs = new JPanel();
    ssButs.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    ssButs.setLayout(new GridLayout(1, 2, 5, 5));
    ssButs.add(m_StartBut);
    ssButs.add(m_StopBut);
    buttons.add(ssButs);
<<<<<<< HEAD

    JPanel p3 = new JPanel();
    p3.setBorder(BorderFactory.createTitledBorder("Attribute selection output"));
=======
<<<<<<< HEAD

    JPanel p3 = new JPanel();
    p3.setBorder(BorderFactory.createTitledBorder("Attribute selection output"));
=======
    
    JPanel p3 = new JPanel();
    p3.setBorder(BorderFactory.
		 createTitledBorder(Messages.getInstance().getString("AttributeSelectionPanel_P3_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p3.setLayout(new BorderLayout());
    final JScrollPane js = new JScrollPane(m_OutText);
    p3.add(js, BorderLayout.CENTER);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      @Override
      public void stateChanged(ChangeEvent e) {
        JViewport vp = (JViewport) e.getSource();
        int h = vp.getViewSize().height;
        if (h != lastHeight) { // i.e. an addition not just a user scrolling
          lastHeight = h;
          int x = h - vp.getExtentSize().height;
          vp.setViewPosition(new Point(0, x));
        }
<<<<<<< HEAD
=======
=======
      public void stateChanged(ChangeEvent e) {
	JViewport vp = (JViewport)e.getSource();
	int h = vp.getViewSize().height; 
	if (h != lastHeight) { // i.e. an addition not just a user scrolling
	  lastHeight = h;
	  int x = h - vp.getExtentSize().height;
	  vp.setViewPosition(new Point(0, x));
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    });

    JPanel mondo = new JPanel();
    gbL = new GridBagLayout();
    mondo.setLayout(gbL);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 0;
    gbC.weightx = 0;
=======
<<<<<<< HEAD
    gbC.gridy = 0;
    gbC.gridx = 0;
    gbC.weightx = 0;
=======
    gbC.gridy = 0;     gbC.gridx = 0; gbC.weightx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(p2, gbC);
    mondo.add(p2);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.NORTH;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 0;
    gbC.weightx = 0;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 0;
    gbC.weightx = 0;
=======
    gbC.gridy = 1;     gbC.gridx = 0; gbC.weightx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(buttons, gbC);
    mondo.add(buttons);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.gridy = 2;
    gbC.gridx = 0;
    gbC.weightx = 0;
    gbC.weighty = 100;
    gbL.setConstraints(historyHolder, gbC);
    mondo.add(historyHolder);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
    gbC.gridy = 0;
    gbC.gridx = 1;
    gbC.gridheight = 3;
    gbC.weightx = 100;
    gbC.weighty = 100;
<<<<<<< HEAD
=======
=======
    gbC.gridy = 2;     gbC.gridx = 0; gbC.weightx = 0; gbC.weighty = 100;
    gbL.setConstraints(m_History, gbC);
    mondo.add(m_History);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
    gbC.gridy = 0;     gbC.gridx = 1;
    gbC.gridheight = 3;
    gbC.weightx = 100; gbC.weighty = 100;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(p3, gbC);
    mondo.add(p3);

    setLayout(new BorderLayout());
    add(p_new, BorderLayout.NORTH);
    add(mondo, BorderLayout.CENTER);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Updates the enabled status of the input fields and labels.
   */
  protected void updateRadioLinks() {
    m_CVBut.setEnabled(true);
    m_CVText.setEnabled(m_CVBut.isSelected());
    m_CVLab.setEnabled(m_CVBut.isSelected());
    m_SeedText.setEnabled(m_CVBut.isSelected());
    m_SeedLab.setEnabled(m_CVBut.isSelected());
<<<<<<< HEAD

    if (m_AttributeEvaluatorEditor.getValue() instanceof AttributeTransformer) {
=======
<<<<<<< HEAD

    if (m_AttributeEvaluatorEditor.getValue() instanceof AttributeTransformer) {
=======
    
    if (m_AttributeEvaluatorEditor.getValue() 
	instanceof AttributeTransformer) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_CVBut.setSelected(false);
      m_CVBut.setEnabled(false);
      m_CVText.setEnabled(false);
      m_CVLab.setEnabled(false);
      m_SeedText.setEnabled(false);
      m_SeedLab.setEnabled(false);
      m_TrainBut.setSelected(true);
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the Logger to receive informational messages
   * 
   * @param newLog the Logger that will now get info messages
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  /**
   * Sets the Logger to receive informational messages
   *
   * @param newLog the Logger that will now get info messages
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setLog(Logger newLog) {

    m_Log = newLog;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Tells the panel to use a new set of instances.
   * 
   * @param inst a set of Instances
   */
  @Override
  public void setInstances(Instances inst) {

    m_Instances = inst;
    String[] attribNames = new String[m_Instances.numAttributes() + 1];
    attribNames[0] = "No class";
    for (int i = 0; i < inst.numAttributes(); i++) {
      String type =
        "(" + Attribute.typeToStringShort(m_Instances.attribute(i)) + ") ";
      String attnm = m_Instances.attribute(i).name();
<<<<<<< HEAD
=======
=======
  
  /**
   * Tells the panel to use a new set of instances.
   *
   * @param inst a set of Instances
   */
  public void setInstances(Instances inst) {
    
    m_Instances = inst;
    String [] attribNames = new String [m_Instances.numAttributes() + 1];
    attribNames[0] = "No class";      
    for (int i = 0; i < inst.numAttributes(); i++) {
      String type = "";
      switch (m_Instances.attribute(i).type()) {
      case Attribute.NOMINAL:
	type = Messages.getInstance().getString("AttributeSelectionPanel_SetInstances_AttributeNOMINAL_Type_Text");
	break;
      case Attribute.NUMERIC:
	type = Messages.getInstance().getString("AttributeSelectionPanel_SetInstances_AttributeNUMERIC_Type_Text");
	break;
      case Attribute.STRING:
	type = Messages.getInstance().getString("AttributeSelectionPanel_SetInstances_AttributeSTRING_Type_Text");
	break;
      case Attribute.DATE:
	type = Messages.getInstance().getString("AttributeSelectionPanel_SetInstances_AttributeDATE_Type_Text");
	break;
      case Attribute.RELATIONAL:
	type = Messages.getInstance().getString("AttributeSelectionPanel_SetInstances_AttributeRELATIONAL_Type_Text");
	break;
      default:
	type = Messages.getInstance().getString("AttributeSelectionPanel_SetInstances_AttributeDEFAULT_Type_Text");
      }
      String attnm = m_Instances.attribute(i).name();
     
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      attribNames[i + 1] = type + attnm;
    }
    m_StartBut.setEnabled(m_RunThread == null);
    m_StopBut.setEnabled(m_RunThread != null);
    m_ClassCombo.setModel(new DefaultComboBoxModel(attribNames));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (inst.classIndex() == -1) {
      m_ClassCombo.setSelectedIndex(attribNames.length - 1);
    } else {
      m_ClassCombo.setSelectedIndex(inst.classIndex());
    }
    m_ClassCombo.setEnabled(true);
  }

  /**
   * Starts running the currently configured attribute evaluator and search
   * method. This is run in a separate thread, and will only start if there is
   * no attribute selection already running. The attribute selection output is
   * sent to the results history panel.
<<<<<<< HEAD
=======
=======
    if (inst.classIndex() == -1)
      m_ClassCombo.setSelectedIndex(attribNames.length - 1);
    else
      m_ClassCombo.setSelectedIndex(inst.classIndex());
    m_ClassCombo.setEnabled(true);
  }
  
  /**
   * Starts running the currently configured attribute evaluator and
   * search method. This is run in a separate thread, and will only start if
   * there is no attribute selection  already running. The attribute selection
   * output is sent to the results history panel.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void startAttributeSelection() {

    if (m_RunThread == null) {
      m_StartBut.setEnabled(false);
      m_StopBut.setEnabled(true);
      m_RunThread = new Thread() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void run() {
          m_AEEPanel.addToHistory();
          m_ASEPanel.addToHistory();

          // Copy the current state of things
          m_Log.statusMessage("Setting up...");
          Instances inst = new Instances(m_Instances);

          int testMode = 0;
          int numFolds = 10;
          int seed = 1;
          int classIndex = m_ClassCombo.getSelectedIndex() - 1;
          ASEvaluation evaluator =
            (ASEvaluation) m_AttributeEvaluatorEditor.getValue();

          ASSearch search = (ASSearch) m_AttributeSearchEditor.getValue();

          StringBuffer outBuff = new StringBuffer();
          String name =
            (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
          String sname = search.getClass().getName();
          if (sname.startsWith("weka.attributeSelection.")) {
            name += sname.substring("weka.attributeSelection.".length());
          } else {
            name += sname;
          }
          String ename = evaluator.getClass().getName();
          if (ename.startsWith("weka.attributeSelection.")) {
            name +=
              (" + " + ename.substring("weka.attributeSelection.".length()));
          } else {
            name += (" + " + ename);
          }

          // assemble commands
          String cmd;
          String cmdFilter;
          String cmdClassifier;

          // 1. attribute selection command
          Vector<String> list = new Vector<String>();
          list.add("-s");
          if (search instanceof OptionHandler) {
            list.add(sname + " "
              + Utils.joinOptions(((OptionHandler) search).getOptions()));
          } else {
            list.add(sname);
          }
          if (evaluator instanceof OptionHandler) {
            String[] opt = ((OptionHandler) evaluator).getOptions();
            for (String element : opt) {
              list.add(element);
            }
          }
          cmd =
            ename + " "
              + Utils.joinOptions(list.toArray(new String[list.size()]));

          // 2. filter command
          weka.filters.supervised.attribute.AttributeSelection filter =
            new weka.filters.supervised.attribute.AttributeSelection();
          filter.setEvaluator((ASEvaluation) m_AttributeEvaluatorEditor
            .getValue());
          filter.setSearch((ASSearch) m_AttributeSearchEditor.getValue());
          cmdFilter =
            filter.getClass().getName() + " "
              + Utils.joinOptions(((OptionHandler) filter).getOptions());

          // 3. meta-classifier command
          weka.classifiers.meta.AttributeSelectedClassifier cls =
            new weka.classifiers.meta.AttributeSelectedClassifier();
          cls
            .setEvaluator((ASEvaluation) m_AttributeEvaluatorEditor.getValue());
          cls.setSearch((ASSearch) m_AttributeSearchEditor.getValue());
          cmdClassifier =
            cls.getClass().getName() + " "
              + Utils.joinOptions(cls.getOptions());

          AttributeSelection eval = null;

          try {
            if (m_CVBut.isSelected()) {
              testMode = 1;
              numFolds = Integer.parseInt(m_CVText.getText());
              seed = Integer.parseInt(m_SeedText.getText());
              if (numFolds <= 1) {
                throw new Exception("Number of folds must be greater than 1");
              }
            }

            if (classIndex >= 0) {
              inst.setClassIndex(classIndex);
            }

            // Output some header information
            m_Log.logMessage("Started " + ename);
            m_Log.logMessage("Command: " + cmd);
            m_Log.logMessage("Filter command: " + cmdFilter);
            m_Log.logMessage("Meta-classifier command: " + cmdClassifier);
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
            outBuff.append("=== Run information ===\n\n");
            outBuff.append("Evaluator:    " + ename);
            if (evaluator instanceof OptionHandler) {
              String[] o = ((OptionHandler) evaluator).getOptions();
              outBuff.append(" " + Utils.joinOptions(o));
            }
            outBuff.append("\nSearch:       " + sname);
            if (search instanceof OptionHandler) {
              String[] o = ((OptionHandler) search).getOptions();
              outBuff.append(" " + Utils.joinOptions(o));
            }
            outBuff.append("\n");
            outBuff.append("Relation:     " + inst.relationName() + '\n');
            outBuff.append("Instances:    " + inst.numInstances() + '\n');
            outBuff.append("Attributes:   " + inst.numAttributes() + '\n');
            if (inst.numAttributes() < 100) {
              for (int i = 0; i < inst.numAttributes(); i++) {
                outBuff.append("              " + inst.attribute(i).name()
                  + '\n');
              }
            } else {
              outBuff.append("              [list of attributes omitted]\n");
            }
            outBuff.append("Evaluation mode:    ");
            switch (testMode) {
            case 0: // select using all training
              outBuff.append("evaluate on all training data\n");
              break;
            case 1: // CV mode
              outBuff.append("" + numFolds + "-fold cross-validation\n");
              break;
            }
            outBuff.append("\n");
            m_History.addResult(name, outBuff);
            m_History.setSingle(name);

            // Do the feature selection and output the results.
            m_Log.statusMessage("Doing feature selection...");
            m_History.updateResult(name);

            eval = new AttributeSelection();
            eval.setEvaluator(evaluator);
            eval.setSearch(search);
            eval.setFolds(numFolds);
            eval.setSeed(seed);
            if (testMode == 1) {
              eval.setXval(true);
            }

            switch (testMode) {
            case 0: // select using training
              m_Log.statusMessage("Evaluating on training data...");
              eval.SelectAttributes(inst);
              break;

            case 1: // CV mode
              m_Log.statusMessage("Randomizing instances...");
              Random random = new Random(seed);
              inst.randomize(random);
              if (inst.attribute(classIndex).isNominal()) {
                m_Log.statusMessage("Stratifying instances...");
                inst.stratify(numFolds);
              }
              for (int fold = 0; fold < numFolds; fold++) {
                m_Log.statusMessage("Creating splits for fold " + (fold + 1)
                  + "...");
                Instances train = inst.trainCV(numFolds, fold, random);
                m_Log.statusMessage("Selecting attributes using all but fold "
                  + (fold + 1) + "...");

                eval.selectAttributesCVSplit(train);
              }
              break;
            default:
              throw new Exception("Test mode not implemented");
            }

            if (testMode == 0) {
              outBuff.append(eval.toResultsString());
            } else {
              outBuff.append(eval.CVResultsString());
            }

            outBuff.append("\n");
            m_History.updateResult(name);
            m_Log.logMessage("Finished " + ename + " " + sname);
            m_Log.statusMessage("OK");
          } catch (Exception ex) {
            m_Log.logMessage(ex.getMessage());
            m_Log.statusMessage("See error log");
          } finally {
            ArrayList<Object> vv = new ArrayList<Object>();
            Vector<Object> configHolder = new Vector<Object>();
            try {
              ASEvaluation eval_copy = evaluator.getClass().newInstance();
              if (evaluator instanceof OptionHandler) {
                ((OptionHandler) eval_copy)
                  .setOptions(((OptionHandler) evaluator).getOptions());
              }

              ASSearch search_copy = search.getClass().newInstance();
              if (search instanceof OptionHandler) {
                ((OptionHandler) search_copy)
                  .setOptions(((OptionHandler) search).getOptions());
              }
              configHolder.add(eval_copy);
              configHolder.add(search_copy);
            } catch (Exception ex) {
              configHolder.add(evaluator);
              configHolder.add(search);
            }
            vv.add(configHolder);

            if (evaluator instanceof AttributeTransformer) {
              try {
                Instances transformed =
                  ((AttributeTransformer) evaluator).transformedData(inst);
                transformed
                  .setRelationName("AT: " + transformed.relationName());

                vv.add(transformed);
                m_History.addObject(name, vv);
              } catch (Exception ex) {
                System.err.println(ex);
                ex.printStackTrace();
              }
            } else if (testMode == 0) {
              try {
                Instances reducedInst = eval.reduceDimensionality(inst);
                vv.add(reducedInst);
                m_History.addObject(name, vv);
              } catch (Exception ex) {
                ex.printStackTrace();
              }
            }
            if (isInterrupted()) {
              m_Log.logMessage("Interrupted " + ename + " " + sname);
              m_Log.statusMessage("See error log");
            }
            m_RunThread = null;
            m_StartBut.setEnabled(true);
            m_StopBut.setEnabled(false);
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskFinished();
            }
          }
        }
<<<<<<< HEAD
=======
=======
	public void run() {
	  // Copy the current state of things
	  m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_First"));
	  Instances inst = new Instances(m_Instances);

	  int testMode = 0;
	  int numFolds = 10;
	  int seed = 1;
	  int classIndex = m_ClassCombo.getSelectedIndex() - 1;
	  ASEvaluation evaluator = 
	     (ASEvaluation) m_AttributeEvaluatorEditor.getValue();

	  ASSearch search = (ASSearch) m_AttributeSearchEditor.getValue();

	  StringBuffer outBuff = new StringBuffer();
	  String name = (new SimpleDateFormat("HH:mm:ss - "))
	  .format(new Date());
	  String sname = search.getClass().getName();
	  if (sname.startsWith("weka.attributeSelection.")) {
	    name += sname.substring("weka.attributeSelection.".length());
	  } else {
	    name += sname;
	  }
	  String ename = evaluator.getClass().getName();
	  if (ename.startsWith("weka.attributeSelection.")) {
	    name += (" + "
		     +ename.substring("weka.attributeSelection.".length()));
	  } else {
	    name += (" + "+ename);
	  }
          
	  // assemble commands
          String cmd;
	  String cmdFilter;
          String cmdClassifier;
          
          // 1. attribute selection command
          Vector<String> list = new Vector<String>();
          list.add("-s");
          if (search instanceof OptionHandler)
            list.add(sname + " " + Utils.joinOptions(((OptionHandler) search).getOptions()));
          else
            list.add(sname);
          if (evaluator instanceof OptionHandler) {
            String[] opt = ((OptionHandler) evaluator).getOptions();
            for (int i = 0; i < opt.length; i++)
              list.add(opt[i]);
          }
          cmd =   ename + " " 
                + Utils.joinOptions(list.toArray(new String[list.size()]));

          // 2. filter command
          weka.filters.supervised.attribute.AttributeSelection filter = 
            new weka.filters.supervised.attribute.AttributeSelection();
          filter.setEvaluator((ASEvaluation) m_AttributeEvaluatorEditor.getValue());
          filter.setSearch((ASSearch) m_AttributeSearchEditor.getValue());
	  cmdFilter =   filter.getClass().getName() + " " 
                      + Utils.joinOptions(((OptionHandler) filter).getOptions());

          // 3. meta-classifier command
          weka.classifiers.meta.AttributeSelectedClassifier cls = 
            new weka.classifiers.meta.AttributeSelectedClassifier();
          cls.setEvaluator((ASEvaluation) m_AttributeEvaluatorEditor.getValue());
          cls.setSearch((ASSearch) m_AttributeSearchEditor.getValue());
          cmdClassifier =   cls.getClass().getName() + " " 
                          + Utils.joinOptions(cls.getOptions());
          
	  AttributeSelection eval = null;

	  try {
	    if (m_CVBut.isSelected()) {
	      testMode = 1;
	      numFolds = Integer.parseInt(m_CVText.getText());
	      seed = Integer.parseInt(m_SeedText.getText());
	      if (numFolds <= 1) {
		throw new Exception(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Exception_Text_First"));
	      }
	    }
	    
	    if (classIndex >= 0) {
	      inst.setClassIndex(classIndex);
	    }

	    // Output some header information
	    m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_LogMessage_Text_First") + ename);
	    m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_LogMessage_Text_Second") + cmd);
            m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_LogMessage_Text_Third") + cmdFilter);
            m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_LogMessage_Text_Fourth") + cmdClassifier);
	    if (m_Log instanceof TaskLogger) {
	      ((TaskLogger)m_Log).taskStarted();
	    }
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_First"));
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Second") + ename);
	    if (evaluator instanceof OptionHandler) {
	      String [] o = ((OptionHandler) evaluator).getOptions();
	      outBuff.append(" " + Utils.joinOptions(o));
	    }
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Third") + sname);
	    if (search instanceof OptionHandler) {
	      String [] o = ((OptionHandler) search).getOptions();
	      outBuff.append(" " + Utils.joinOptions(o));
	    }
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Fourth"));
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Fifth") + inst.relationName() + '\n');
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Sixth") + inst.numInstances() + '\n');
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Seventh") + inst.numAttributes() + '\n');
	    if (inst.numAttributes() < 100) {
	      for (int i = 0; i < inst.numAttributes(); i++) {
		outBuff.append("              " + inst.attribute(i).name()
			       + '\n');
	      }
	    } else {
	      outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Eigth"));
	    }
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Nineth"));
	    switch (testMode) {
	      case 0: // select using all training
	      outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Tenth"));
	      break;
	      case 1: // CV mode
	      outBuff.append("" + numFolds + Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Eleventh"));
	      break;
	    }
	    outBuff.append("\n");
	    m_History.addResult(name, outBuff);
	    m_History.setSingle(name);
	    
	    // Do the feature selection and output the results.
	    m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text"));
	    m_History.updateResult(name);
	    
	    eval = new AttributeSelection();
	    eval.setEvaluator(evaluator);
	    eval.setSearch(search);
	    eval.setFolds(numFolds);
	    eval.setSeed(seed);
	    if (testMode == 1) {
	      eval.setXval(true);
	    }
	    	    
	    switch (testMode) {
	      case 0: // select using training
	      m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_First"));
	      eval.SelectAttributes(inst);
	      break;

	      case 1: // CV mode
	      m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Second"));
	      Random random = new Random(seed);
	      inst.randomize(random);
	      if (inst.attribute(classIndex).isNominal()) {
		m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Third"));
		inst.stratify(numFolds);
	      }
	      for (int fold = 0; fold < numFolds;fold++) {
		m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Fourth")
				    + (fold + 1) + Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Fifth"));
		Instances train = inst.trainCV(numFolds, fold, random);
		m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Sixth")
				    + (fold + 1) + Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Seventh"));
		
		eval.selectAttributesCVSplit(train);
	      }
	      break;
	      default:
	      throw new Exception(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Exception_Text_Second"));
	    }

	    if (testMode == 0) {
	      outBuff.append(eval.toResultsString());
	    } else {
	      outBuff.append(eval.CVResultsString());
	    }
	  
	    outBuff.append(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_OutBuffer_Text_Thirteenth"));
	    m_History.updateResult(name);
	    m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_LogMessage_Text_Fifth") + ename+" "+sname);
	    m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Eigth"));
	  } catch (Exception ex) {
	    m_Log.logMessage(ex.getMessage());
	    m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Ninth"));
	  } finally {
	    if (evaluator instanceof AttributeTransformer) {
	      try {
		Instances transformed = 
		  ((AttributeTransformer)evaluator).transformedData(inst);
		transformed.
		  setRelationName(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Transformed_SetRelationName_Text") + transformed.relationName());

		FastVector vv = new FastVector();
		vv.addElement(transformed);
		m_History.addObject(name, vv);
	      } catch (Exception ex) {
		System.err.println(ex);
		ex.printStackTrace();
	      }
	    } else if (testMode == 0) {
	      try {
		Instances reducedInst = eval.reduceDimensionality(inst);
		FastVector vv = new FastVector();
		vv.addElement(reducedInst);
		m_History.addObject(name, vv);
	      } catch (Exception ex) {
		ex.printStackTrace();
	      }
	    }
	    if (isInterrupted()) {
	      m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_LogMessage_Text_Sixth") + ename+" "+sname);
	      m_Log.statusMessage(Messages.getInstance().getString("AttributeSelectionPanel_StartAttributeSelection_Run_Log_StatusMessage_Text_Tenth"));
	    }
	    m_RunThread = null;
	    m_StartBut.setEnabled(true);
	    m_StopBut.setEnabled(false);
	    if (m_Log instanceof TaskLogger) {
	      ((TaskLogger)m_Log).taskFinished();
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      };
      m_RunThread.setPriority(Thread.MIN_PRIORITY);
      m_RunThread.start();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Stops the currently running attribute selection (if any).
   */
  @SuppressWarnings("deprecation")
<<<<<<< HEAD
=======
=======
  
  /**
   * Stops the currently running attribute selection (if any).
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected void stopAttributeSelection() {

    if (m_RunThread != null) {
      m_RunThread.interrupt();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // This is deprecated (and theoretically the interrupt should do).
      m_RunThread.stop();

    }
  }

  /**
   * Save the named buffer to a file.
   * 
<<<<<<< HEAD
=======
=======
      
      // This is deprecated (and theoretically the interrupt should do).
      m_RunThread.stop();
      
    }
  }
  
  /**
   * Save the named buffer to a file.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param name the name of the buffer to be saved.
   */
  protected void saveBuffer(String name) {
    StringBuffer sb = m_History.getNamedBuffer(name);
    if (sb != null) {
      if (m_SaveOut.save(sb)) {
<<<<<<< HEAD
        m_Log.logMessage("Save succesful.");
=======
<<<<<<< HEAD
        m_Log.logMessage("Save succesful.");
=======
	m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_SaveBuffer_Log_LogMessage_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Popup a visualize panel for viewing transformed data
   * 
<<<<<<< HEAD
   * @param ti the Instances to display
=======
<<<<<<< HEAD
   * @param ti the Instances to display
=======
   * @param ti          the Instances to display
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void visualizeTransformedData(Instances ti) {
    if (ti != null) {
      MatrixPanel mp = new MatrixPanel();
      mp.setInstances(ti);
      String plotName = ti.relationName();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      final javax.swing.JFrame jf =
              Utils.getWekaJFrame("Weka Attribute Selection Visualize: "
                      + plotName, this);
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(mp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });
      jf.pack();
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
<<<<<<< HEAD
=======
=======
      final javax.swing.JFrame jf = 
	new javax.swing.JFrame(Messages.getInstance().getString("AttributeSelectionPanel_VisualizeTransformedData_JFrame_Text")
			       +plotName);
      jf.setSize(800,600);
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(mp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
	  public void windowClosing(java.awt.event.WindowEvent e) {
	    jf.dispose();
	  }
	});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      jf.setVisible(true);
    }
  }

  /**
   * Popup a SaveDialog for saving the transformed data
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param ti the Instances to display
   */
  protected void saveTransformedData(Instances ti) {
    JFileChooser fc;
    int retVal;
    BufferedWriter writer;
    ExtensionFileFilter filter;

    fc = new JFileChooser();
    filter = new ExtensionFileFilter(".arff", "ARFF data files");
<<<<<<< HEAD
=======
=======
   * @param ti          the Instances to display
   */
  protected void saveTransformedData(Instances ti) {
    JFileChooser        fc;
    int                 retVal;
    BufferedWriter      writer;
    ExtensionFileFilter filter;

    fc     = new JFileChooser();
    filter = new ExtensionFileFilter(".arff", Messages.getInstance().getString("AttributeSelectionPanel_SaveTransformedData_Filter_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    fc.setFileFilter(filter);
    retVal = fc.showSaveDialog(this);

    if (retVal == JFileChooser.APPROVE_OPTION) {
      try {
        writer = new BufferedWriter(new FileWriter(fc.getSelectedFile()));
        writer.write(ti.toString());
        writer.flush();
        writer.close();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } catch (Exception e) {
        e.printStackTrace();
        m_Log.logMessage("Problem saving data: " + e.getMessage());
        JOptionPane.showMessageDialog(this,
          "Problem saving data:\n" + e.getMessage(), "Error",
          JOptionPane.ERROR_MESSAGE);
<<<<<<< HEAD
=======
=======
      }
      catch (Exception e) {
        e.printStackTrace();
        m_Log.logMessage(Messages.getInstance().getString("AttributeSelectionPanel_SaveTransformedData_Log_LogMessage_Text") + e.getMessage());
        JOptionPane.showMessageDialog(
            this, 
            Messages.getInstance().getString("AttributeSelectionPanel_SaveTransformedData_JOptionPaneShowMessageDialog_Text_First") + e.getMessage(), 
            Messages.getInstance().getString("AttributeSelectionPanel_SaveTransformedData_JOptionPaneShowMessageDialog_Text_Second"), 
            JOptionPane.ERROR_MESSAGE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Handles constructing a popup menu with visualization options
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param names the name of the result history list entry clicked on by the
   *          user.
   * @param x the x coordinate for popping up the menu
   * @param y the y coordinate for popping up the menu
   */
  @SuppressWarnings("unchecked")
  protected void visualize(List<String> names, int x, int y) {
    final List<String> selectedNames = names;
    JPopupMenu resultListMenu = new JPopupMenu();

    JMenuItem visMainBuffer = new JMenuItem("View in main window");
    if (selectedNames != null && selectedNames.size() == 1) {
      visMainBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.setSingle(selectedNames.get(0));
        }
      });
<<<<<<< HEAD
=======
=======
   * @param name the name of the result history list entry clicked on by
   * the user.
   * @param x the x coordinate for popping up the menu
   * @param y the y coordinate for popping up the menu
   */
  protected void visualize(String name, int x, int y) {
    final String selectedName = name;
    JPopupMenu resultListMenu = new JPopupMenu();

    JMenuItem visMainBuffer = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_VisMainBuffer_JMenuItem_Text"));
    if (selectedName != null) {
      visMainBuffer.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    m_History.setSingle(selectedName);
	  }
	});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      visMainBuffer.setEnabled(false);
    }
    resultListMenu.add(visMainBuffer);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem visSepBuffer = new JMenuItem("View in separate window");
    if (selectedNames != null && selectedNames.size() == 1) {
      visSepBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.openFrame(selectedNames.get(0));
        }
<<<<<<< HEAD
=======
=======
    JMenuItem visSepBuffer = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_VisSepBuffer_JMenuItem_Text"));
    if (selectedName != null) {
    visSepBuffer.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  m_History.openFrame(selectedName);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
    } else {
      visSepBuffer.setEnabled(false);
    }
    resultListMenu.add(visSepBuffer);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem saveOutput = new JMenuItem("Save result buffer");
    if (selectedNames != null && selectedNames.size() == 1) {
      saveOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveBuffer(selectedNames.get(0));
        }
<<<<<<< HEAD
=======
=======
    JMenuItem saveOutput = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_SaveOutput_JMenuItem_Text"));
    if (selectedName != null) {
    saveOutput.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  saveBuffer(selectedName);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
    } else {
      saveOutput.setEnabled(false);
    }
    resultListMenu.add(saveOutput);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JMenuItem deleteOutput = new JMenuItem("Delete result buffer(s)");
    if (selectedNames != null) {
      deleteOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.removeResults(selectedNames);
        }
<<<<<<< HEAD
=======
=======
    
    JMenuItem deleteOutput = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_DeleteOutput_JMenuItem_Text"));
    if (selectedName != null) {
      deleteOutput.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  m_History.removeResult(selectedName);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
    } else {
      deleteOutput.setEnabled(false);
    }
    resultListMenu.add(deleteOutput);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ArrayList<Object> o = null;
    if (selectedNames != null && selectedNames.size() == 1) {
      o = (ArrayList<Object>) m_History.getNamedObject(selectedNames.get(0));
    }

    // VisualizePanel temp_vp = null;
    Instances tempTransformed = null;
    ASEvaluation temp_eval = null;
    ASSearch temp_search = null;

    if (o != null) {
      for (int i = 0; i < o.size(); i++) {
        Object temp = o.get(i);
        // if (temp instanceof VisualizePanel) {
        if (temp instanceof Instances) {
          // temp_vp = (VisualizePanel)temp;
          tempTransformed = (Instances) temp;
        }
        if (temp instanceof Vector) {
          temp_eval = (ASEvaluation) ((Vector<Object>) temp).get(0);
          temp_search = (ASSearch) ((Vector<Object>) temp).get(1);
        }
      }
    }

    final ASEvaluation eval = temp_eval;
    final ASSearch search = temp_search;

    // final VisualizePanel vp = temp_vp;
    final Instances ti = tempTransformed;
    JMenuItem visTrans = null;

    if (ti != null) {
      if (ti.relationName().startsWith("AT:")) {
        visTrans = new JMenuItem("Visualize transformed data");
      } else {
        visTrans = new JMenuItem("Visualize reduced data");
<<<<<<< HEAD
=======
=======

    FastVector o = null;
    if (selectedName != null) {
      o = (FastVector)m_History.getNamedObject(selectedName);
    }    

    //    VisualizePanel temp_vp = null;
    Instances tempTransformed = null;

    if (o != null) {
      for (int i = 0; i < o.size(); i++) {
	Object temp = o.elementAt(i);
	//	if (temp instanceof VisualizePanel) {
	if (temp instanceof Instances) {
	  //	  temp_vp = (VisualizePanel)temp;
	  tempTransformed = (Instances) temp;
	} 
      }
    }
    
    //    final VisualizePanel vp = temp_vp;
    final Instances ti = tempTransformed;
    JMenuItem visTrans = null;
    
    if (ti != null) {
      if (ti.relationName().startsWith(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_RelationName_Text_First"))) {
	visTrans = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_VisTrans_JMenuItem_Text_First"));
      } else {
	visTrans = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_VisTrans_JMenuItem_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      resultListMenu.addSeparator();
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // JMenuItem visTrans = new JMenuItem("Visualize transformed data");
    if (ti != null && visTrans != null) {
      visTrans.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          visualizeTransformedData(ti);
        }
      });
    }

    if (visTrans != null) {
      resultListMenu.add(visTrans);
    }

    JMenuItem saveTrans = null;
    if (ti != null) {
      if (ti.relationName().startsWith("AT:")) {
        saveTrans = new JMenuItem("Save transformed data...");
      } else {
        saveTrans = new JMenuItem("Save reduced data...");
      }
    }
    if (saveTrans != null) {
      saveTrans.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveTransformedData(ti);
        }
      });
      resultListMenu.add(saveTrans);
    }

    JMenuItem reApplyConfig =
      new JMenuItem("Re-apply attribute selection configuration");
    if (eval != null && search != null) {
      reApplyConfig.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_AttributeEvaluatorEditor.setValue(eval);
          m_AttributeSearchEditor.setValue(search);
        }
      });
    } else {
      reApplyConfig.setEnabled(false);
    }
    resultListMenu.add(reApplyConfig);

    resultListMenu.show(m_History.getList(), x, y);
  }

  /**
   * updates the capabilities filter of the GOE
   * 
   * @param filter the new filter to use
   */
  protected void updateCapabilitiesFilter(Capabilities filter) {
    Instances tempInst;
    Capabilities filterClass;
<<<<<<< HEAD
=======
=======
    //    JMenuItem visTrans = new JMenuItem("Visualize transformed data");
    if (ti != null && visTrans != null) {
      visTrans.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    visualizeTransformedData(ti);
	  }
	});
    }
     
    if (visTrans != null) {
      resultListMenu.add(visTrans);
    }
    
    JMenuItem saveTrans = null;
    if (ti != null) {
      if (ti.relationName().startsWith(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_RelationName_Text_Second")))
        saveTrans = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_SaveTrans_JMenuItem_Text_First"));
      else
        saveTrans = new JMenuItem(Messages.getInstance().getString("AttributeSelectionPanel_Visualize_SaveTrans_JMenuItem_Text_Second"));
    }
    if (saveTrans != null) {
      saveTrans.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            saveTransformedData(ti);
          }
      });
      resultListMenu.add(saveTrans);
    }
    
    resultListMenu.show(m_History.getList(), x, y);
  }
  
  /**
   * updates the capabilities filter of the GOE
   * 
   * @param filter	the new filter to use
   */
  protected void updateCapabilitiesFilter(Capabilities filter) {
    Instances 		tempInst;
    Capabilities 	filterClass;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (filter == null) {
      m_AttributeEvaluatorEditor.setCapabilitiesFilter(new Capabilities(null));
      m_AttributeSearchEditor.setCapabilitiesFilter(new Capabilities(null));
      return;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (!ExplorerDefaults.getInitGenericObjectEditorFilter()) {
      tempInst = new Instances(m_Instances, 0);
    } else {
      tempInst = new Instances(m_Instances);
    }
    int clIndex = m_ClassCombo.getSelectedIndex() - 1;

    if (clIndex >= 0) {
      tempInst.setClassIndex(clIndex);
    }

    try {
      filterClass = Capabilities.forInstances(tempInst);
    } catch (Exception e) {
      filterClass = new Capabilities(null);
    }

<<<<<<< HEAD
=======
=======
    
    if (!ExplorerDefaults.getInitGenericObjectEditorFilter())
      tempInst = new Instances(m_Instances, 0);
    else
      tempInst = new Instances(m_Instances);
    int clIndex = m_ClassCombo.getSelectedIndex() - 1;
    
    if (clIndex >= 0) {
      tempInst.setClassIndex(clIndex);
    }        

    try {
      filterClass = Capabilities.forInstances(tempInst);
    }
    catch (Exception e) {
      filterClass = new Capabilities(null);
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // set new filter
    m_AttributeEvaluatorEditor.setCapabilitiesFilter(filterClass);
    m_AttributeSearchEditor.setCapabilitiesFilter(filterClass);

    m_StartBut.setEnabled(true);
    // check capabilities...
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Capabilities currentFilter =
      m_AttributeEvaluatorEditor.getCapabilitiesFilter();
    ASEvaluation evaluator =
      (ASEvaluation) m_AttributeEvaluatorEditor.getValue();
    Capabilities currentSchemeCapabilities = null;
    if (evaluator != null && currentFilter != null
      && (evaluator instanceof CapabilitiesHandler)) {
      currentSchemeCapabilities =
        ((CapabilitiesHandler) evaluator).getCapabilities();

      if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
        && !currentSchemeCapabilities.supports(currentFilter)) {
<<<<<<< HEAD
=======
=======
    Capabilities currentFilter = m_AttributeEvaluatorEditor.getCapabilitiesFilter();
    ASEvaluation evaluator = (ASEvaluation) m_AttributeEvaluatorEditor.getValue();
    Capabilities currentSchemeCapabilities =  null;
    if (evaluator != null && currentFilter != null && 
        (evaluator instanceof CapabilitiesHandler)) {
      currentSchemeCapabilities = ((CapabilitiesHandler)evaluator).getCapabilities();
          
      if (!currentSchemeCapabilities.supportsMaybe(currentFilter) &&
          !currentSchemeCapabilities.supports(currentFilter)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_StartBut.setEnabled(false);
      }
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * method gets called in case of a change event
   * 
   * @param e the associated change event
   */
  @Override
  public void capabilitiesFilterChanged(CapabilitiesFilterChangeEvent e) {
    if (e.getFilter() == null) {
      updateCapabilitiesFilter(null);
    } else {
      updateCapabilitiesFilter((Capabilities) e.getFilter().clone());
    }
<<<<<<< HEAD
=======
=======
  
  /**
   * method gets called in case of a change event
   * 
   * @param e		the associated change event
   */
  public void capabilitiesFilterChanged(CapabilitiesFilterChangeEvent e) {
    if (e.getFilter() == null)
      updateCapabilitiesFilter(null);
    else
      updateCapabilitiesFilter((Capabilities) e.getFilter().clone());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the Explorer to use as parent frame (used for sending notifications
   * about changes in the data)
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param parent the parent frame
   */
  @Override
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }

  /**
   * returns the parent Explorer frame
   * 
   * @return the parent
   */
  @Override
  public Explorer getExplorer() {
    return m_Explorer;
  }

  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return the title of this tab
   */
  @Override
  public String getTabTitle() {
    return "Select attributes";
  }

  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return the tooltip of this tab
   */
  @Override
  public String getTabTitleToolTip() {
    return "Determine relevance of attributes";
  }

  @Override
  public boolean requiresLog() {
    return true;
  }

  @Override
  public boolean acceptsInstances() {
    return true;
  }

  @Override
  public Defaults getDefaultSettings() {
    return new AttributeSelectionPanelDefaults();
  }

  @Override
  public boolean okToBeActive() {
    return m_Instances != null;
  }

  @Override
  public void setActive(boolean active) {
    super.setActive(active);

    if (m_isActive) {
      // make sure initial settings get applied
      settingsChanged();
    }
  }

  @Override
  public void settingsChanged() {
    if (getMainApplication() != null) {
      if (!m_initialSettingsSet) {
        Object initialEval =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), AttributeSelectionPanelDefaults.EVALUATOR_KEY,
            AttributeSelectionPanelDefaults.EVALUATOR,
            Environment.getSystemWide());
        m_AttributeEvaluatorEditor.setValue(initialEval);

        Object initialSearch =
          getMainApplication().getApplicationSettings()
            .getSetting(getPerspectiveID(),
              AttributeSelectionPanelDefaults.SEARCH_KEY,
              AttributeSelectionPanelDefaults.SEARCH,
              Environment.getSystemWide());
        m_AttributeSearchEditor.setValue(initialSearch);

        TestMode initialEvalMode =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), AttributeSelectionPanelDefaults.EVAL_MODE_KEY,
            AttributeSelectionPanelDefaults.EVAL_MODE,
            Environment.getSystemWide());
        m_TrainBut.setSelected(initialEvalMode == TestMode.TRAINING_SET);
        m_CVBut.setSelected(initialEvalMode == TestMode.CROSS_VALIDATION);

        int folds =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), AttributeSelectionPanelDefaults.FOLDS_KEY,
            AttributeSelectionPanelDefaults.FOLDS, Environment.getSystemWide());
        m_CVText.setText("" + folds);

        int seed =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), AttributeSelectionPanelDefaults.SEED_KEY,
            AttributeSelectionPanelDefaults.SEED, Environment.getSystemWide());
        m_SeedText.setText("" + seed);

        updateRadioLinks();
        m_initialSettingsSet = true;
      }

      Font outputFont =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(), AttributeSelectionPanelDefaults.OUTPUT_FONT_KEY,
          AttributeSelectionPanelDefaults.OUTPUT_FONT,
          Environment.getSystemWide());
      m_OutText.setFont(outputFont);
      m_History.setFont(outputFont);
      Color textColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(),
          AttributeSelectionPanelDefaults.OUTPUT_TEXT_COLOR_KEY,
          AttributeSelectionPanelDefaults.OUTPUT_TEXT_COLOR,
          Environment.getSystemWide());
      m_OutText.setForeground(textColor);
      m_History.setForeground(textColor);
      Color outputBackgroundColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(),
          AttributeSelectionPanelDefaults.OUTPUT_BACKGROUND_COLOR_KEY,
          AttributeSelectionPanelDefaults.OUTPUT_BACKGROUND_COLOR,
          Environment.getSystemWide());
      m_OutText.setBackground(outputBackgroundColor);
      m_History.setBackground(outputBackgroundColor);
    }
  }

  public static enum TestMode {
    TRAINING_SET, CROSS_VALIDATION;
  }

  protected static final class AttributeSelectionPanelDefaults extends Defaults {

    public static final String ID = "weka.gui.explorer.attributeselectionpanel";

    protected static final Settings.SettingKey EVALUATOR_KEY =
      new Settings.SettingKey(ID + ".initialEvaluator", "Initial evaluator",
        "On startup, set this evaluator as the default one");
    protected static final ASEvaluation EVALUATOR = new CfsSubsetEval();

    protected static final Settings.SettingKey SEARCH_KEY =
      new Settings.SettingKey(ID + ".initialSearch", "Initial search method",
        "On startup, set this search method as the default one");
    protected static final ASSearch SEARCH = new BestFirst();

    protected static final Settings.SettingKey EVAL_MODE_KEY =
      new Settings.SettingKey(ID + ".initialEvalMode",
        "Default evaluation mode", "");
    protected static final TestMode EVAL_MODE = TestMode.TRAINING_SET;

    protected static final Settings.SettingKey FOLDS_KEY =
      new Settings.SettingKey(ID + ".xvalFolds",
        "Default cross-validation folds", "");
    protected static final Integer FOLDS = 10;

    protected static final Settings.SettingKey SEED_KEY =
      new Settings.SettingKey(ID + ".seed", "Random seed", "");
    protected static final Integer SEED = 1;

    protected static final Settings.SettingKey OUTPUT_FONT_KEY =
      new Settings.SettingKey(ID + ".outputFont", "Font for text output",
        "Font to " + "use in the output area");
    protected static final Font OUTPUT_FONT = new Font("Monospaced",
      Font.PLAIN, 12);

    protected static final Settings.SettingKey OUTPUT_TEXT_COLOR_KEY =
      new Settings.SettingKey(ID + ".outputFontColor", "Output text color",
        "Color " + "of output text");
    protected static final Color OUTPUT_TEXT_COLOR = Color.black;

    protected static final Settings.SettingKey OUTPUT_BACKGROUND_COLOR_KEY =
      new Settings.SettingKey(ID + ".outputBackgroundColor",
        "Output background color", "Output background color");
    protected static final Color OUTPUT_BACKGROUND_COLOR = Color.white;
    private static final long serialVersionUID = -5413933415469545770L;

    public AttributeSelectionPanelDefaults() {
      super(ID);
      m_defaults.put(EVALUATOR_KEY, EVALUATOR);
      m_defaults.put(SEARCH_KEY, SEARCH);
      m_defaults.put(EVAL_MODE_KEY, EVAL_MODE);
      m_defaults.put(FOLDS_KEY, FOLDS);
      m_defaults.put(SEED_KEY, SEED);
      m_defaults.put(OUTPUT_FONT_KEY, OUTPUT_FONT);
      m_defaults.put(OUTPUT_TEXT_COLOR_KEY, OUTPUT_TEXT_COLOR);
      m_defaults.put(OUTPUT_BACKGROUND_COLOR_KEY, OUTPUT_BACKGROUND_COLOR);
    }
<<<<<<< HEAD
=======
=======
   * @param parent	the parent frame
   */
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }
  
  /**
   * returns the parent Explorer frame
   * 
   * @return		the parent
   */
  public Explorer getExplorer() {
    return m_Explorer;
  }
  
  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return 		the title of this tab
   */
  public String getTabTitle() {
    return Messages.getInstance().getString("AttributeSelectionPanel_GetTabTitle_Text");
  }
  
  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return 		the tooltip of this tab
   */
  public String getTabTitleToolTip() {
    return Messages.getInstance().getString("AttributeSelectionPanel_GetTabTitleToolTip_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tests out the attribute selection panel from the command line.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args may optionally contain the name of a dataset to load.
   */
  public static void main(String[] args) {

    try {
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Select attributes");
<<<<<<< HEAD
=======
=======
   *
   * @param args may optionally contain the name of a dataset to load.
   */
  public static void main(String [] args) {

    try {
      final javax.swing.JFrame jf =
	new javax.swing.JFrame(Messages.getInstance().getString("AttributeSelectionPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      final AttributeSelectionPanel sp = new AttributeSelectionPanel();
      jf.getContentPane().add(sp, BorderLayout.CENTER);
      weka.gui.LogPanel lp = new weka.gui.LogPanel();
      sp.setLog(lp);
      jf.getContentPane().add(lp, BorderLayout.SOUTH);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
<<<<<<< HEAD
=======
=======
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
        System.err.println("Loading instances from " + args[0]);
        java.io.Reader r =
          new java.io.BufferedReader(new java.io.FileReader(args[0]));
        Instances i = new Instances(r);
        sp.setInstances(i);
<<<<<<< HEAD
=======
=======
	System.err.println(Messages.getInstance().getString("AttributeSelectionPanel_Main_Error_Text") + args[0]);
	java.io.Reader r = new java.io.BufferedReader(
			   new java.io.FileReader(args[0]));
	Instances i = new Instances(r);
	sp.setInstances(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
