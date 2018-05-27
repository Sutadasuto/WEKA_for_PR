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
 *    OutputFormatDialog.java
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.experiment;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.PluginManager;
import weka.experiment.ResultMatrix;
import weka.experiment.ResultMatrixPlainText;
import weka.gui.GenericObjectEditor;
import weka.gui.PropertyPanel;

import javax.swing.BorderFactory;
<<<<<<< HEAD
=======
=======
import weka.experiment.ResultMatrix;
import weka.experiment.ResultMatrixPlainText;
import weka.gui.GenericObjectEditor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Vector;

/**
 * A dialog for setting various output format parameters.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14291 $
 */
public class OutputFormatDialog extends JDialog {
<<<<<<< HEAD
=======
=======

/**
 * A dialog for setting various output format parameters.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7899 $
 */
public class OutputFormatDialog
  extends JDialog {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization. */
  private static final long serialVersionUID = 2169792738187807378L;

  /** Signifies an OK property selection. */
  public static final int APPROVE_OPTION = 0;

  /** Signifies a cancelled property selection. */
  public static final int CANCEL_OPTION = 1;

  /** the result of the user's action, either OK or CANCEL. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected int m_Result;

  /** the different classes for outputting the comparison tables. */
  protected Vector<Class<?>> m_OutputFormatClasses;

  /** the different names of matrices for outputting the comparison tables. */
  protected Vector<String> m_OutputFormatNames;

  /** Lets the user configure the result matrix. */
  protected GenericObjectEditor m_ResultMatrixEditor;

  /** the panel for the GOE. */
  protected PropertyPanel m_ResultMatrixPanel;

  /** the label for the GOE. */
  protected JLabel m_ResultMatrixLabel;

  /** the current result matrix. */
  protected ResultMatrix m_ResultMatrix;

  /** lets the user choose the format for the output. */
  protected JComboBox m_OutputFormatComboBox;

  /** the label for the format. */
  protected JLabel m_OutputFormatLabel;

  /** the spinner to choose the precision for the mean from. */
  protected JSpinner m_MeanPrecSpinner;

  /** the label for the mean precision. */
  protected JLabel m_MeanPrecLabel;

  /** the spinner to choose the precision for the std. deviation from */
  protected JSpinner m_StdDevPrecSpinner;

  /** the label for the std dev precision. */
  protected JLabel m_StdDevPrecLabel;

  /** the checkbox for outputting the average. */
  protected JCheckBox m_ShowAverageCheckBox;

  /** the label for showing the average. */
  protected JLabel m_ShowAverageLabel;

  /** the checkbox for the removing of filter classnames. */
  protected JCheckBox m_RemoveFilterNameCheckBox;

  /** the label for the removing the filter classnames. */
  protected JLabel m_RemoveFilterNameLabel;

  /** Click to activate the current set parameters. */
  protected JButton m_OkButton;

  /** Click to cancel the dialog. */
  protected JButton m_CancelButton;

  /** whether to ignore updates in the GUI momentarily. */
  protected boolean m_IgnoreChanges;

  /**
   * initializes the dialog with the given parent frame.
   * 
   * @param parent the parent of this dialog
   */
  public OutputFormatDialog(Frame parent) {
    super(parent, "Output Format...", ModalityType.DOCUMENT_MODAL);

    m_IgnoreChanges = true;

    initialize();
    initGUI();

    m_IgnoreChanges = false;
  }

  /**
   * initializes the member variables.
   */
  protected void initialize() {
    List<String> classes;
    int i;
    Class<?> cls;
    ResultMatrix matrix;

    m_Result = CANCEL_OPTION;

    if (m_OutputFormatClasses == null) {
      classes = PluginManager.getPluginNamesOfTypeList(ResultMatrix.class.getName());

      // set names and classes
      m_OutputFormatClasses = new Vector<Class<?>>();
      m_OutputFormatNames = new Vector<String>();
      for (i = 0; i < classes.size(); i++) {
        try {
          cls = Class.forName(classes.get(i).toString());
          matrix = (ResultMatrix) cls.newInstance();
          m_OutputFormatClasses.add(cls);
          m_OutputFormatNames.add(matrix.getDisplayName());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
<<<<<<< HEAD
=======
=======
  protected int m_Result = CANCEL_OPTION;

  /** the different classes for outputting the comparison tables. */
  protected static Vector m_OutputFormatClasses = null;

  /** the different names of matrices for outputting the comparison tables. */
  protected static Vector m_OutputFormatNames = null;

  /** determine all classes inheriting from the ResultMatrix (in the same
   * package!)
   * @see ResultMatrix
   * @see ClassDiscovery */
  static {
    Vector classes = GenericObjectEditor.getClassnames(ResultMatrix.class.getName());

    // set names and classes
    m_OutputFormatClasses = new Vector();
    m_OutputFormatNames   = new Vector();
    for (int i = 0; i < classes.size(); i++) {
      try {
        Class cls = Class.forName(classes.get(i).toString());
        ResultMatrix matrix = (ResultMatrix) cls.newInstance();
        m_OutputFormatClasses.add(cls);
        m_OutputFormatNames.add(matrix.getDisplayName());
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  /** the output format specific matrix. */
  protected Class m_ResultMatrix = ResultMatrixPlainText.class;

  /** lets the user choose the format for the output. */
  protected JComboBox m_OutputFormatComboBox = new JComboBox(m_OutputFormatNames);

  /** the spinner to choose the precision for the mean from. */
  protected JSpinner m_MeanPrecSpinner = new JSpinner();

  /** the spinner to choose the precision for the std. deviation from */
  protected JSpinner m_StdDevPrecSpinner = new JSpinner();

  /** the checkbox for outputting the average. */
  protected JCheckBox m_ShowAverageCheckBox = new JCheckBox("");

  /** the checkbox for the removing of filter classnames. */
  protected JCheckBox m_RemoveFilterNameCheckBox = new JCheckBox("");

  /** Click to activate the current set parameters. */
  protected JButton m_OkButton = new JButton(Messages.getInstance().getString("OutputFormatDialog_OkButton_JButton_Text"));

  /** Click to cancel the dialog. */
  protected JButton m_CancelButton = new JButton(Messages.getInstance().getString("OutputFormatDialog_CancelButton_JButton_Text"));

  /** the number of digits after the period (= precision) for printing the mean. */
  protected int m_MeanPrec = 2;

  /** the number of digits after the period (= precision) for printing the std.
   * deviation */
  protected int m_StdDevPrec = 2;

  /** whether to remove the filter names from the names. */
  protected boolean m_RemoveFilterName = false;

  /** whether to show the average too. */
  protected boolean m_ShowAverage = false;

  /**
   * initializes the dialog with the given parent frame.
   *
   * @param parent the parent of this dialog
   */
  public OutputFormatDialog(Frame parent) {
    super(parent, Messages.getInstance().getString("OutputFormatDialog_Title_Text"), ModalityType.DOCUMENT_MODAL);
    createDialog();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * performs the creation of the dialog and all its components.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected void initGUI() {
    JPanel panel;
    SpinnerNumberModel model;
    JPanel panel2;

    getContentPane().setLayout(new BorderLayout());

    panel = new JPanel(new GridLayout(6, 1));
    panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    getContentPane().add(panel, BorderLayout.CENTER);

    // mean precision
    m_MeanPrecSpinner = new JSpinner();
    m_MeanPrecSpinner.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        getData();
      }
    });
    model = (SpinnerNumberModel) m_MeanPrecSpinner.getModel();
    model.setMaximum(new Integer(20));
    model.setMinimum(new Integer(0));
    m_MeanPrecLabel = new JLabel("Mean Precision");
    m_MeanPrecLabel.setDisplayedMnemonic('M');
    m_MeanPrecLabel.setLabelFor(m_MeanPrecSpinner);
    panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(m_MeanPrecLabel);
    panel2.add(m_MeanPrecSpinner);
    panel.add(panel2);

    // stddev precision
    m_StdDevPrecSpinner = new JSpinner();
    m_StdDevPrecSpinner.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        getData();
      }
    });
    model = (SpinnerNumberModel) m_StdDevPrecSpinner.getModel();
    model.setMaximum(new Integer(20));
    model.setMinimum(new Integer(0));
    m_StdDevPrecLabel = new JLabel("StdDev. Precision");
    m_StdDevPrecLabel.setDisplayedMnemonic('S');
    m_StdDevPrecLabel.setLabelFor(m_StdDevPrecSpinner);
    panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(m_StdDevPrecLabel);
    panel2.add(m_StdDevPrecSpinner);
    panel.add(panel2);

    // Format
    m_OutputFormatComboBox = new JComboBox(m_OutputFormatNames);
    m_OutputFormatComboBox.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        getData();
      }
    });
    m_OutputFormatLabel = new JLabel("Output Format");
    m_OutputFormatLabel.setDisplayedMnemonic('F');
    m_OutputFormatLabel.setLabelFor(m_OutputFormatComboBox);
    panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(m_OutputFormatLabel);
    panel2.add(m_OutputFormatComboBox);
    panel.add(panel2);

    // Average
    m_ShowAverageCheckBox = new JCheckBox("");
    m_ShowAverageCheckBox.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        getData();
      }
    });
    m_ShowAverageLabel = new JLabel("Show Average");
    m_ShowAverageLabel.setDisplayedMnemonic('A');
    m_ShowAverageLabel.setLabelFor(m_ShowAverageCheckBox);
    panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(m_ShowAverageLabel);
    panel2.add(m_ShowAverageCheckBox);
    panel.add(panel2);

    // Remove filter classname
    m_RemoveFilterNameCheckBox = new JCheckBox("");
    m_RemoveFilterNameCheckBox.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        getData();
      }
    });
    m_RemoveFilterNameLabel = new JLabel("Remove filter classnames");
    m_RemoveFilterNameLabel.setDisplayedMnemonic('R');
    m_RemoveFilterNameLabel.setLabelFor(m_RemoveFilterNameCheckBox);
    panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(m_RemoveFilterNameLabel);
    panel2.add(m_RemoveFilterNameCheckBox);
    panel.add(panel2);

    // Advanced setup
    m_ResultMatrix = ExperimenterDefaults.getOutputFormat();
    m_ResultMatrixEditor = new GenericObjectEditor(true);
    m_ResultMatrixEditor.setClassType(ResultMatrix.class);
    m_ResultMatrixEditor.setValue(m_ResultMatrix);
    m_ResultMatrixEditor
      .addPropertyChangeListener(new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent e) {
          // user selected different class?
          if (!m_ResultMatrix.getClass().equals(
            m_ResultMatrixEditor.getValue().getClass())) {
            // if it's the preferred class, then automaticallly use the
            // Experimenter defaults
            if (m_ResultMatrixEditor.getValue().getClass()
              .equals(ExperimenterDefaults.getOutputFormat().getClass())) {
              m_ResultMatrix = ExperimenterDefaults.getOutputFormat();
              m_ResultMatrixEditor.setValue(ExperimenterDefaults
                .getOutputFormat());
            } else {
              m_ResultMatrix = (ResultMatrix) m_ResultMatrixEditor.getValue();
            }
            setData();
          }
          repaint();
        }
      });
    ((GenericObjectEditor.GOEPanel) m_ResultMatrixEditor.getCustomEditor())
      .addOkListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_ResultMatrix = (ResultMatrix) m_ResultMatrixEditor.getValue();
          setData();
        }
      });
    m_ResultMatrixPanel = new PropertyPanel(m_ResultMatrixEditor, false);
    m_ResultMatrixLabel = new JLabel("Advanced setup");
    panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel2.add(m_ResultMatrixLabel);
    panel2.add(m_ResultMatrixPanel);
    panel.add(panel2);
<<<<<<< HEAD
=======
=======
  protected void createDialog() {
    JPanel              panel;
    SpinnerNumberModel  model;
    JLabel              label;

    getContentPane().setLayout(new BorderLayout());

    panel = new JPanel(new GridLayout(5, 2));
    getContentPane().add(panel, BorderLayout.CENTER);

    // Precision
    model = (SpinnerNumberModel) m_MeanPrecSpinner.getModel();
    model.setMaximum(new Integer(20));
    model.setMinimum(new Integer(0));
    model = (SpinnerNumberModel) m_StdDevPrecSpinner.getModel();
    model.setMaximum(new Integer(20));
    model.setMinimum(new Integer(0));
    label = new JLabel(Messages.getInstance().getString("OutputFormatDialog_CreateDialog_MeanPrecision_JLabel_Text"));
    label.setDisplayedMnemonic('M');
    label.setLabelFor(m_MeanPrecSpinner);
    panel.add(label);
    panel.add(m_MeanPrecSpinner);
    label = new JLabel(Messages.getInstance().getString("OutputFormatDialog_CreateDialog_StdDevPrecision_JLabel_Text"));
    label.setDisplayedMnemonic('S');
    label.setLabelFor(m_StdDevPrecSpinner);
    panel.add(label);
    panel.add(m_StdDevPrecSpinner);

    // Format
    label = new JLabel(Messages.getInstance().getString("OutputFormatDialog_CreateDialog_OutputFormat_JLabel_Text"));
    label.setDisplayedMnemonic('F');
    label.setLabelFor(m_OutputFormatComboBox);
    panel.add(label);
    panel.add(m_OutputFormatComboBox);
    m_OutputFormatComboBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  getData();
	}
      });

    // Average
    label = new JLabel(Messages.getInstance().getString("OutputFormatDialog_CreateDialog_ShowAverage_JLabel_Text"));
    label.setDisplayedMnemonic('A');
    label.setLabelFor(m_ShowAverageCheckBox);
    panel.add(label);
    panel.add(m_ShowAverageCheckBox);

    // Remove filter classname
    label = new JLabel(Messages.getInstance().getString("OutputFormatDialog_CreateDialog_RemoveFilterClassnames_JLabel_Text"));
    label.setDisplayedMnemonic('R');
    label.setLabelFor(m_RemoveFilterNameCheckBox);
    panel.add(label);
    panel.add(m_RemoveFilterNameCheckBox);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Buttons
    panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    getContentPane().add(panel, BorderLayout.SOUTH);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_CancelButton = new JButton("Cancel");
    m_CancelButton.setMnemonic('C');
    m_CancelButton.addActionListener(new ActionListener() {
      @Override
<<<<<<< HEAD
=======
=======
    m_CancelButton.setMnemonic('C');
    m_CancelButton.addActionListener(new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        m_Result = CANCEL_OPTION;
        setVisible(false);
      }
    });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_OkButton = new JButton("OK");
    m_OkButton.setMnemonic('O');
    m_OkButton.addActionListener(new ActionListener() {
      @Override
<<<<<<< HEAD
=======
=======
    m_OkButton.setMnemonic('O');
    m_OkButton.addActionListener(new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        getData();
        m_Result = APPROVE_OPTION;
        setVisible(false);
      }
    });
    panel.add(m_OkButton);
    panel.add(m_CancelButton);

    // default button
    getRootPane().setDefaultButton(m_OkButton);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // initial layout (to get widths and heights)
    pack();

    // adjust dimensions
    m_MeanPrecLabel.setPreferredSize(new Dimension(m_RemoveFilterNameLabel
      .getWidth(), m_MeanPrecLabel.getHeight()));
    m_MeanPrecSpinner.setPreferredSize(new Dimension(m_MeanPrecSpinner
      .getWidth() * 3, m_MeanPrecSpinner.getHeight()));
    m_StdDevPrecLabel.setPreferredSize(new Dimension(m_RemoveFilterNameLabel
      .getWidth(), m_StdDevPrecLabel.getHeight()));
    m_StdDevPrecSpinner.setPreferredSize(new Dimension(m_StdDevPrecSpinner
      .getWidth() * 3, m_StdDevPrecSpinner.getHeight()));
    m_OutputFormatLabel.setPreferredSize(new Dimension(m_RemoveFilterNameLabel
      .getWidth(), m_OutputFormatLabel.getHeight()));
    m_ShowAverageLabel.setPreferredSize(new Dimension(m_RemoveFilterNameLabel
      .getWidth(), m_ShowAverageLabel.getHeight()));
    m_ResultMatrixLabel.setPreferredSize(new Dimension(m_RemoveFilterNameLabel
      .getWidth(), m_ResultMatrixLabel.getHeight()));
    m_ResultMatrixPanel.setPreferredSize(new Dimension(
      (int) (m_ResultMatrixPanel.getWidth() * 1.5), m_ResultMatrixPanel
        .getHeight()));

    // final layout
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    pack();
  }

  /**
   * initializes the GUI components with the data.
   */
  private void setData() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_IgnoreChanges = true;

    // Precision
    m_MeanPrecSpinner.setValue(m_ResultMatrix.getMeanPrec());
    m_StdDevPrecSpinner.setValue(m_ResultMatrix.getStdDevPrec());

    // format
    for (int i = 0; i < m_OutputFormatClasses.size(); i++) {
      if (m_OutputFormatClasses.get(i).equals(m_ResultMatrix.getClass())) {
<<<<<<< HEAD
=======
=======
    // Precision
    m_MeanPrecSpinner.setValue(new Integer(m_MeanPrec));
    m_StdDevPrecSpinner.setValue(new Integer(m_StdDevPrec));

    // average
    m_ShowAverageCheckBox.setSelected(m_ShowAverage);

    // filter names
    m_RemoveFilterNameCheckBox.setSelected(m_RemoveFilterName);

    // format (must be last, since getData() will be called!)
    for (int i = 0; i < m_OutputFormatClasses.size(); i++) {
      if (m_OutputFormatClasses.get(i).equals(m_ResultMatrix)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_OutputFormatComboBox.setSelectedItem(m_OutputFormatNames.get(i));
        break;
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // average
    m_ShowAverageCheckBox.setSelected(m_ResultMatrix.getShowAverage());

    // filter names
    m_RemoveFilterNameCheckBox
      .setSelected(m_ResultMatrix.getRemoveFilterName());

    // GOE
    m_ResultMatrixEditor.setValue(m_ResultMatrix);

    m_IgnoreChanges = false;
  }

  /**
   * gets the data from GUI components.
   */
  private void getData() {
    if (m_IgnoreChanges) {
      return;
    }

    // format
    try {
      if (!m_ResultMatrix.getClass().equals(
        m_OutputFormatClasses.get(m_OutputFormatComboBox.getSelectedIndex()))) {
        if (m_OutputFormatClasses
          .get(m_OutputFormatComboBox.getSelectedIndex()).equals(
            ExperimenterDefaults.getOutputFormat().getClass())) {
          m_ResultMatrix = ExperimenterDefaults.getOutputFormat();
        } else {
          m_ResultMatrix = (ResultMatrix) m_OutputFormatClasses.get(
            m_OutputFormatComboBox.getSelectedIndex()).newInstance();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      m_ResultMatrix = new ResultMatrixPlainText();
    }

    // Precision
    m_ResultMatrix.setMeanPrec(Integer.parseInt(m_MeanPrecSpinner.getValue()
      .toString()));
    m_ResultMatrix.setStdDevPrec(Integer.parseInt(m_StdDevPrecSpinner
      .getValue().toString()));

    // average
    m_ResultMatrix.setShowAverage(m_ShowAverageCheckBox.isSelected());

    // filter names
    m_ResultMatrix.setRemoveFilterName(m_RemoveFilterNameCheckBox.isSelected());

    // update GOE
    m_ResultMatrixEditor.setValue(m_ResultMatrix);
<<<<<<< HEAD
=======
=======
  }

  /**
   *  gets the data from GUI components.
   */
  private void getData() {
    // Precision
    m_MeanPrec   = Integer.parseInt(m_MeanPrecSpinner.getValue().toString());
    m_StdDevPrec = Integer.parseInt(m_StdDevPrecSpinner.getValue().toString());

    // average
    m_ShowAverage = m_ShowAverageCheckBox.isSelected();

    // filter names
    m_RemoveFilterName = m_RemoveFilterNameCheckBox.isSelected();

    // format
    m_ResultMatrix = (Class) m_OutputFormatClasses.get(
                        m_OutputFormatComboBox.getSelectedIndex());
  }

  /**
   * Sets the precision of the mean output.
   *
   * @param precision the number of digits used in printing the mean
   */
  public void setMeanPrec(int precision) {
    m_MeanPrec = precision;
  }

  /**
   * Gets the precision used for printing the mean.
   *
   * @return the number of digits used in printing the mean
   */
  public int getMeanPrec() {
    return m_MeanPrec;
  }

  /**
   * Sets the precision of the std. deviation output.
   *
   * @param precision the number of digits used in printing the std. deviation
   */
  public void setStdDevPrec(int precision) {
    m_StdDevPrec = precision;
  }

  /**
   * Gets the precision used for printing the std. deviation
   * @return the number of digits used in printing the std. deviation
   */
  public int getStdDevPrec() {
    return m_StdDevPrec;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the matrix to use as initial selected output format.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param matrix the matrix to use as initial selected output format
   */
  public void setResultMatrix(ResultMatrix matrix) {
    m_ResultMatrix = matrix;
    setData();
<<<<<<< HEAD
=======
=======
   *
   * @param matrix the matrix to use as initial selected output format
   */
  public void setResultMatrix(Class matrix) {
    m_ResultMatrix = matrix;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the currently selected output format result matrix.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the currently selected matrix to use as output
   */
  public ResultMatrix getResultMatrix() {
<<<<<<< HEAD
=======
=======
   *
   * @return the currently selected matrix to use as output
   */
  public Class getResultMatrix() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_ResultMatrix;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
   * sets whether to remove the filter classname from the dataset name.
   *
   * @param remove if true then the filter classname is removed
   */
  public void setRemoveFilterName(boolean remove) {
    m_RemoveFilterName = remove;
  }

  /**
   * returns whether the filter classname is removed from the dataset name.
   *
   * @return true if the filter classname is removed
   */
  public boolean getRemoveFilterName() {
    return m_RemoveFilterName;
  }

  /**
   * sets whether the average for each column is displayed.
   *
   * @param show if true then an additional row with the average is printed.
   */
  public void setShowAverage(boolean show) {
    m_ShowAverage = show;
  }

  /**
   * returns whether the average for each column is displayed.
   *
   * @return true if an additional row with the average is displayed
   */
  public boolean getShowAverage() {
    return m_ShowAverage;
  }

  /**
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * sets the class of the chosen result matrix.
   */
  protected void setFormat() {
    for (int i = 0; i < m_OutputFormatClasses.size(); i++) {
<<<<<<< HEAD
      if (m_OutputFormatNames.get(i).equals(
        m_OutputFormatComboBox.getItemAt(i).toString())) {
=======
<<<<<<< HEAD
      if (m_OutputFormatNames.get(i).equals(
        m_OutputFormatComboBox.getItemAt(i).toString())) {
=======
      if (m_OutputFormatNames.get(i).toString().equals(
            m_OutputFormatComboBox.getItemAt(i).toString())) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_OutputFormatComboBox.setSelectedIndex(i);
        break;
      }
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * the result from the last display of the dialog, the same is returned from
   * <code>showDialog</code>.
   * 
   * @return the result from the last display of the dialog; either
   *         APPROVE_OPTION, or CANCEL_OPTION
<<<<<<< HEAD
=======
=======
   * the result from the last display of the dialog, the same is returned
   * from <code>showDialog</code>.
   *
   * @return the result from the last display of the dialog;
   *         either APPROVE_OPTION, or CANCEL_OPTION
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @see #showDialog()
   */
  public int getResult() {
    return m_Result;
  }

  /**
   * Pops up the modal dialog and waits for cancel or a selection.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return either APPROVE_OPTION, or CANCEL_OPTION
   */
  public int showDialog() {
    m_Result = CANCEL_OPTION;
    setData();
    setVisible(true);
    return m_Result;
  }

  /**
   * for testing only.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args ignored
   */
  public static void main(String[] args) {
    OutputFormatDialog dialog;

    dialog = new OutputFormatDialog(null);
    if (dialog.showDialog() == APPROVE_OPTION) {
      System.out.println("Accepted");
    } else {
      System.out.println("Aborted");
    }
<<<<<<< HEAD
=======
=======
   *
   * @param args ignored
   */
  public static void main(String[] args) {
    OutputFormatDialog      dialog;

    dialog = new OutputFormatDialog(null);
    if (dialog.showDialog() == APPROVE_OPTION)
      System.out.println(Messages.getInstance().getString("OutputFormatDialog_Main_Accepted_Text"));
    else
      System.out.println(Messages.getInstance().getString("OutputFormatDialog_Main_Aborted_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
