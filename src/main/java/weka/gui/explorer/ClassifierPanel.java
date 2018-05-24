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
 *    ClassifierPanel.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2013 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.explorer;

<<<<<<< HEAD
import weka.classifiers.AbstractClassifier;
=======
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.classifiers.Classifier;
import weka.classifiers.CostMatrix;
import weka.classifiers.Evaluation;
import weka.classifiers.Sourcable;
import weka.classifiers.evaluation.CostCurve;
import weka.classifiers.evaluation.MarginCurve;
<<<<<<< HEAD
import weka.classifiers.evaluation.Prediction;
import weka.classifiers.evaluation.ThresholdCurve;
import weka.classifiers.evaluation.output.prediction.AbstractOutput;
import weka.classifiers.evaluation.output.prediction.Null;
import weka.classifiers.pmml.consumer.PMMLClassifier;
import weka.classifiers.rules.ZeroR;
import weka.core.Attribute;
import weka.core.BatchPredictor;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Defaults;
import weka.core.Drawable;
import weka.core.Environment;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.PluginManager;
import weka.core.Range;
import weka.core.SerializationHelper;
import weka.core.SerializedObject;
import weka.core.Settings;
import weka.core.Utils;
import weka.core.Version;
import weka.core.WekaPackageClassLoaderManager;
import weka.core.converters.ArffLoader;
=======
import weka.classifiers.evaluation.ThresholdCurve;
import weka.classifiers.pmml.consumer.PMMLClassifier;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Drawable;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Range;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.Version;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.converters.IncrementalConverter;
import weka.core.converters.Loader;
import weka.core.pmml.PMMLFactory;
import weka.core.pmml.PMMLModel;
<<<<<<< HEAD
import weka.gui.AbstractPerspective;
import weka.gui.CostMatrixEditor;
import weka.gui.EvaluationMetricSelectionDialog;
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.Logger;
import weka.gui.Perspective;
import weka.gui.PerspectiveInfo;
=======
import weka.gui.CostMatrixEditor;
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.Logger;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.gui.PropertyDialog;
import weka.gui.PropertyPanel;
import weka.gui.ResultHistoryPanel;
import weka.gui.SaveBuffer;
import weka.gui.SetInstancesPanel;
import weka.gui.SysErrLog;
import weka.gui.TaskLogger;
import weka.gui.beans.CostBenefitAnalysis;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeEvent;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeListener;
import weka.gui.explorer.Explorer.ExplorerPanel;
import weka.gui.explorer.Explorer.LogHandler;
import weka.gui.graphvisualizer.BIFFormatException;
import weka.gui.graphvisualizer.GraphVisualizer;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;
<<<<<<< HEAD
=======
import weka.gui.visualize.Plot2D;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.gui.visualize.PlotData2D;
import weka.gui.visualize.ThresholdVisualizePanel;
import weka.gui.visualize.VisualizePanel;
import weka.gui.visualize.plugins.ErrorVisualizePlugin;
import weka.gui.visualize.plugins.GraphVisualizePlugin;
import weka.gui.visualize.plugins.TreeVisualizePlugin;
import weka.gui.visualize.plugins.VisualizePlugin;

<<<<<<< HEAD
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * This panel allows the user to select and configure a classifier, set the
=======
/**
 * 0* This panel allows the user to select and configure a classifier, set the
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * attribute of the current dataset to be used as the class, and evaluate the
 * classifier using a number of testing modes (test on the training data,
 * train/test on a percentage split, n-fold cross-validation, test on a separate
 * split). The results of classification runs are stored in a result history so
 * that previous results are accessible.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 14519 $
 */
@PerspectiveInfo(ID = "weka.gui.explorer.classifierpanel", title = "Classify",
  toolTipText = "Classify instances",
  iconPath = "weka/gui/weka_icon_new_small.png")
public class ClassifierPanel extends AbstractPerspective implements
  CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {

  /** for serialization. */
  static final long serialVersionUID = 6959973704963624003L;

  /** the parent frame. */
  protected Explorer m_Explorer = null;

  /** The filename extension that should be used for model files. */
  public static String MODEL_FILE_EXTENSION = ".model";

  /** The filename extension that should be used for PMML xml files. */
  public static String PMML_FILE_EXTENSION = ".xml";

  /** Lets the user configure the classifier. */
  protected GenericObjectEditor m_ClassifierEditor = new GenericObjectEditor();

  /** The panel showing the current classifier selection. */
  protected PropertyPanel m_CEPanel = new PropertyPanel(m_ClassifierEditor);

  /** The output area for classification results. */
  protected JTextArea m_OutText = new JTextArea(20, 40);

  /** The destination for log/status messages. */
  protected Logger m_Log = new SysErrLog();

  /** The buffer saving object for saving output. */
  SaveBuffer m_SaveOut = new SaveBuffer(m_Log, this);

  /** A panel controlling results viewing. */
  protected ResultHistoryPanel m_History = new ResultHistoryPanel(m_OutText);

  /** Lets the user select the class column. */
  protected JComboBox m_ClassCombo = new JComboBox();

  /** Click to set test mode to cross-validation. */
  protected JRadioButton m_CVBut = new JRadioButton("Cross-validation");

  /** Click to set test mode to generate a % split. */
  protected JRadioButton m_PercentBut = new JRadioButton("Percentage split");

  /** Click to set test mode to test on training data. */
  protected JRadioButton m_TrainBut = new JRadioButton("Use training set");

  /** Click to set test mode to a user-specified test set. */
  protected JRadioButton m_TestSplitBut = new JRadioButton("Supplied test set");

  /**
   * Check to save the predictions in the results list for visualizing later on.
   */
  protected JCheckBox m_StorePredictionsBut = new JCheckBox(
    "Store predictions for visualization");

  /**
   * Check to have the point size in error plots proportional to the prediction
   * margin (classification only)
   */
  protected JCheckBox m_errorPlotPointSizeProportionalToMargin = new JCheckBox(
    "Error plot point size proportional to margin");

  /** Check to output the model built from the training data. */
  protected JCheckBox m_OutputModelBut = new JCheckBox("Output model");

  /** Check to output the models built from the training splits. */
  protected JCheckBox m_OutputModelsForTrainingSplitsBut = new JCheckBox("Output models for training splits");

  /** Check to output true/false positives, precision/recall for each class. */
  protected JCheckBox m_OutputPerClassBut = new JCheckBox(
    "Output per-class stats");

  /** Check to output a confusion matrix. */
  protected JCheckBox m_OutputConfusionBut = new JCheckBox(
    "Output confusion matrix");

  /** Check to output entropy statistics. */
  protected JCheckBox m_OutputEntropyBut = new JCheckBox(
    "Output entropy evaluation measures");

  /** Lets the user configure the ClassificationOutput. */
  protected GenericObjectEditor m_ClassificationOutputEditor =
    new GenericObjectEditor(true);

  /** ClassificationOutput configuration. */
  protected PropertyPanel m_ClassificationOutputPanel = new PropertyPanel(
    m_ClassificationOutputEditor);

  /** the range of attributes to output. */
  protected Range m_OutputAdditionalAttributesRange = null;

  /** Check to evaluate w.r.t a cost matrix. */
  protected JCheckBox m_EvalWRTCostsBut = new JCheckBox(
    "Cost-sensitive evaluation");

  /** for the cost matrix. */
  protected JButton m_SetCostsBut = new JButton("Set...");

  /** Label by where the cv folds are entered. */
  protected JLabel m_CVLab = new JLabel("Folds", SwingConstants.RIGHT);

  /** The field where the cv folds are entered. */
  protected JTextField m_CVText = new JTextField("10", 3);

  /** Label by where the % split is entered. */
  protected JLabel m_PercentLab = new JLabel("%", SwingConstants.RIGHT);

  /** The field where the % split is entered. */
  protected JTextField m_PercentText = new JTextField("66", 3);

  /** The button used to open a separate test dataset. */
  protected JButton m_SetTestBut = new JButton("Set...");

  /** The frame used to show the test set selection panel. */
  protected JFrame m_SetTestFrame;

  /** The frame used to show the cost matrix editing panel. */
=======
 * @version $Revision: 10372 $
 */
public class ClassifierPanel extends JPanel implements
  CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {

  /** for serialization */
  static final long serialVersionUID = 6959973704963624003L;

  /** the parent frame */
  protected Explorer m_Explorer = null;

  /** The filename extension that should be used for model files */
  public static String MODEL_FILE_EXTENSION = ".model";

  /** The filename extension that should be used for PMML xml files */
  public static String PMML_FILE_EXTENSION = ".xml";

  /** Lets the user configure the classifier */
  protected GenericObjectEditor m_ClassifierEditor = new GenericObjectEditor();

  /** The panel showing the current classifier selection */
  protected PropertyPanel m_CEPanel = new PropertyPanel(m_ClassifierEditor);

  /** The output area for classification results */
  protected JTextArea m_OutText = new JTextArea(20, 40);

  /** The destination for log/status messages */
  protected Logger m_Log = new SysErrLog();

  /** The buffer saving object for saving output */
  SaveBuffer m_SaveOut = new SaveBuffer(m_Log, this);

  /** A panel controlling results viewing */
  protected ResultHistoryPanel m_History = new ResultHistoryPanel(m_OutText);

  /** Lets the user select the class column */
  protected JComboBox m_ClassCombo = new JComboBox();

  /** Click to set test mode to cross-validation */
  protected JRadioButton m_CVBut = new JRadioButton(Messages.getInstance()
    .getString("ClassifierPanel_CVBut_JRadioButton_Text"));

  /** Click to set test mode to generate a % split */
  protected JRadioButton m_PercentBut = new JRadioButton(Messages.getInstance()
    .getString("ClassifierPanel_PercentBut_JRadioButton_Text"));

  /** Click to set test mode to test on training data */
  protected JRadioButton m_TrainBut = new JRadioButton(Messages.getInstance()
    .getString("ClassifierPanel_TrainBut_JRadioButton_Text"));

  /** Click to set test mode to a user-specified test set */
  protected JRadioButton m_TestSplitBut = new JRadioButton(Messages
    .getInstance().getString("ClassifierPanel_TestSplitBut_JRadioButton_Text"));

  /**
   * Check to save the predictions in the results list for visualizing later on
   */
  protected JCheckBox m_StorePredictionsBut = new JCheckBox(Messages
    .getInstance().getString(
      "ClassifierPanel_StorePredictionsBut_JCheckBox_Text"));

  /** Check to output the model built from the training data */
  protected JCheckBox m_OutputModelBut = new JCheckBox(Messages.getInstance()
    .getString("ClassifierPanel_OutputModelBut_JCheckBox_Text"));

  /** Check to output true/false positives, precision/recall for each class */
  protected JCheckBox m_OutputPerClassBut = new JCheckBox(Messages
    .getInstance()
    .getString("ClassifierPanel_OutputPerClassBut_JCheckBox_Text"));

  /** Check to output a confusion matrix */
  protected JCheckBox m_OutputConfusionBut = new JCheckBox(Messages
    .getInstance().getString(
      "ClassifierPanel_OutputConfusionBut_JCheckBox_Text"));

  /** Check to output entropy statistics */
  protected JCheckBox m_OutputEntropyBut = new JCheckBox(Messages.getInstance()
    .getString("ClassifierPanel_OutputEntropyBut_JCheckBox_Text"));

  /** Check to output text predictions */
  protected JCheckBox m_OutputPredictionsTextBut = new JCheckBox(Messages
    .getInstance().getString(
      "ClassifierPanel_OutputPredictionsTextBut_JCheckBox_Text"));

  /** Lists indices for additional attributes to output */
  protected JTextField m_OutputAdditionalAttributesText = new JTextField("", 10);

  /** Label for the text field with additional attributes in the output */
  protected JLabel m_OutputAdditionalAttributesLab = new JLabel(Messages
    .getInstance().getString(
      "ClassifierPanel_OutputAdditionalAttributesLab_JLabel_Text"));

  /** the range of attributes to output */
  protected Range m_OutputAdditionalAttributesRange = null;

  /** Check to evaluate w.r.t a cost matrix */
  protected JCheckBox m_EvalWRTCostsBut = new JCheckBox(Messages.getInstance()
    .getString("ClassifierPanel_EvalWRTCostsBut_JCheckBox_Text"));

  /** for the cost matrix */
  protected JButton m_SetCostsBut = new JButton(Messages.getInstance()
    .getString("ClassifierPanel_SetCostsBut_JButton_Text"));

  /** Label by where the cv folds are entered */
  protected JLabel m_CVLab = new JLabel(Messages.getInstance().getString(
    "ClassifierPanel_CVLab_JLabel_Text"), SwingConstants.RIGHT);

  /** The field where the cv folds are entered */
  protected JTextField m_CVText = new JTextField(Messages.getInstance()
    .getString("ClassifierPanel_CVText_JTextField_Text"), 3);

  /** Label by where the % split is entered */
  protected JLabel m_PercentLab = new JLabel(Messages.getInstance().getString(
    "ClassifierPanel_PercentLab_JLabel_Text"), SwingConstants.RIGHT);

  /** The field where the % split is entered */
  protected JTextField m_PercentText = new JTextField(Messages.getInstance()
    .getString("ClassifierPanel_PercentText_JTextField_Text"), 3);

  /** The button used to open a separate test dataset */
  protected JButton m_SetTestBut = new JButton(Messages.getInstance()
    .getString("ClassifierPanel_SetTestBut_JButton_Text"));

  /** The frame used to show the test set selection panel */
  protected JFrame m_SetTestFrame;

  /** The frame used to show the cost matrix editing panel */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected PropertyDialog m_SetCostsFrame;

  /**
   * Alters the enabled/disabled status of elements associated with each radio
<<<<<<< HEAD
   * button.
=======
   * button
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  ActionListener m_RadioListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      updateRadioLinks();
    }
  };

<<<<<<< HEAD
  /** Button for further output/visualize options. */
  JButton m_MoreOptions = new JButton("More options...");

  /** User specified random seed for cross validation or % split. */
  protected JTextField m_RandomSeedText = new JTextField("1", 3);

  /** the label for the random seed textfield. */
  protected JLabel m_RandomLab = new JLabel("Random seed for XVal / % Split",
    SwingConstants.RIGHT);

  /** Whether randomization is turned off to preserve order. */
  protected JCheckBox m_PreserveOrderBut = new JCheckBox(
    "Preserve order for % Split");

  /**
   * Whether to output the source code (only for classifiers importing
   * Sourcable).
   */
  protected JCheckBox m_OutputSourceCode = new JCheckBox("Output source code");

  /** The name of the generated class (only applicable to Sourcable schemes). */
  protected JTextField m_SourceCodeClass = new JTextField("WekaClassifier", 10);

  /** Click to start running the classifier. */
  protected JButton m_StartBut = new JButton("Start");

  /** Click to stop a running classifier. */
  protected JButton m_StopBut = new JButton("Stop");

  /** Stop the class combo from taking up to much space. */
  private final Dimension COMBO_SIZE = new Dimension(150,
    m_StartBut.getPreferredSize().height);

  /** The cost matrix editor for evaluation costs. */
  protected CostMatrixEditor m_CostMatrixEditor = new CostMatrixEditor();

  /** The main set of instances we're playing with. */
  protected Instances m_Instances;

  /** The loader used to load the user-supplied test set (if any). */
  protected Loader m_TestLoader;

  /** the class index for the supplied test set. */
  protected int m_TestClassIndex = -1;

  /** A thread that classification runs in. */
  protected Thread m_RunThread;

  /** The current visualization object. */
  protected VisualizePanel m_CurrentVis = null;

  /** Filter to ensure only model files are selected. */
  protected FileFilter m_ModelFilter = new ExtensionFileFilter(
    MODEL_FILE_EXTENSION, "Model object files");

  protected FileFilter m_PMMLModelFilter = new ExtensionFileFilter(
    PMML_FILE_EXTENSION, "PMML model files");

  /** The file chooser for selecting model files. */
  protected JFileChooser m_FileChooser = new JFileChooser(new File(
    System.getProperty("user.dir")));

  /** The user's list of selected evaluation metrics */
  protected List<String> m_selectedEvalMetrics = Evaluation
    .getAllEvaluationMetricNames();

  /**
   * Whether start-up settings have been applied (i.e. initial classifier to
   * use)
   */
  protected boolean m_initialSettingsSet;

=======
  /** Button for further output/visualize options */
  JButton m_MoreOptions = new JButton(Messages.getInstance().getString(
    "ClassifierPanel_MoreOptions_JButton_Text"));

  /** User specified random seed for cross validation or % split */
  protected JTextField m_RandomSeedText = new JTextField(Messages.getInstance()
    .getString("ClassifierPanel_RandomSeedText_JTextField_Text"), 3);

  /** the label for the random seed textfield */
  protected JLabel m_RandomLab = new JLabel(Messages.getInstance().getString(
    "ClassifierPanel_RandomLab_JLabel_Text"), SwingConstants.RIGHT);

  /** Whether randomization is turned off to preserve order */
  protected JCheckBox m_PreserveOrderBut = new JCheckBox(Messages.getInstance()
    .getString("ClassifierPanel_PreserveOrderBut_JCheckBox_Text"));

  /**
   * Whether to output the source code (only for classifiers importing
   * Sourcable)
   */
  protected JCheckBox m_OutputSourceCode = new JCheckBox(Messages.getInstance()
    .getString("ClassifierPanel_OutputSourceCode_JCheckBox_Text"));

  /** The name of the generated class (only applicable to Sourcable schemes) */
  protected JTextField m_SourceCodeClass = new JTextField(
    Messages.getInstance().getString(
      "ClassifierPanel_SourceCodeClass_JTextField_Text"), 10);

  /** Click to start running the classifier */
  protected JButton m_StartBut = new JButton(Messages.getInstance().getString(
    "ClassifierPanel_StartBut_JButton_Text"));

  /** Click to stop a running classifier */
  protected JButton m_StopBut = new JButton(Messages.getInstance().getString(
    "ClassifierPanel_StopBut_JButton_Text"));

  /** Stop the class combo from taking up to much space */
  private final Dimension COMBO_SIZE = new Dimension(150,
    m_StartBut.getPreferredSize().height);

  /** The cost matrix editor for evaluation costs */
  protected CostMatrixEditor m_CostMatrixEditor = new CostMatrixEditor();

  /** The main set of instances we're playing with */
  protected Instances m_Instances;

  /** The loader used to load the user-supplied test set (if any) */
  protected Loader m_TestLoader;

  /** A thread that classification runs in */
  protected Thread m_RunThread;

  /** The current visualization object */
  protected VisualizePanel m_CurrentVis = null;

  /** Filter to ensure only model files are selected */
  protected FileFilter m_ModelFilter = new ExtensionFileFilter(
    MODEL_FILE_EXTENSION, Messages.getInstance().getString(
      "ClassifierPanel_ModelFilter_FileFilter_Text"));

  protected FileFilter m_PMMLModelFilter = new ExtensionFileFilter(
    PMML_FILE_EXTENSION, Messages.getInstance().getString(
      "ClassifierPanel_PMMLModelFilter_FileFilter_Text"));

  /** The file chooser for selecting model files */
  protected JFileChooser m_FileChooser = new JFileChooser(new File(
    System.getProperty("user.dir")));

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /* Register the property editors we need */
  static {
    GenericObjectEditor.registerEditors();
  }

  /**
<<<<<<< HEAD
   * Creates the classifier panel.
   */
  public ClassifierPanel() {
    m_selectedEvalMetrics.remove("Coverage");
    m_selectedEvalMetrics.remove("Region size");
=======
   * Creates the classifier panel
   */
  public ClassifierPanel() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // Connect / configure the components
    m_OutText.setEditable(false);
    m_OutText.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_OutText.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    m_OutText.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK) {
          m_OutText.selectAll();
        }
      }
    });
<<<<<<< HEAD
    JPanel historyHolder = new JPanel(new BorderLayout());
    historyHolder.setBorder(BorderFactory
      .createTitledBorder("Result list (right-click for options)"));
    historyHolder.add(m_History, BorderLayout.CENTER);
=======
    m_History.setBorder(BorderFactory
      .createTitledBorder(Messages.getInstance().getString(
        "ClassifierPanel_History_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_ClassifierEditor.setClassType(Classifier.class);
    m_ClassifierEditor.setValue(ExplorerDefaults.getClassifier());
    m_ClassifierEditor.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent e) {
        m_StartBut.setEnabled(true);
        // Check capabilities
        Capabilities currentFilter = m_ClassifierEditor.getCapabilitiesFilter();
        Classifier classifier = (Classifier) m_ClassifierEditor.getValue();
        Capabilities currentSchemeCapabilities = null;
        if (classifier != null && currentFilter != null
          && (classifier instanceof CapabilitiesHandler)) {
<<<<<<< HEAD
          currentSchemeCapabilities =
            ((CapabilitiesHandler) classifier).getCapabilities();
=======
          currentSchemeCapabilities = ((CapabilitiesHandler) classifier)
            .getCapabilities();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

          if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
            && !currentSchemeCapabilities.supports(currentFilter)) {
            m_StartBut.setEnabled(false);
          }
        }
        repaint();
      }
    });

<<<<<<< HEAD
    m_ClassCombo.setToolTipText("Select the attribute to use as the class");
    m_TrainBut.setToolTipText("Test on the same set that the classifier"
      + " is trained on");
    m_CVBut.setToolTipText("Perform a n-fold cross-validation");
    m_PercentBut.setToolTipText("Train on a percentage of the data and"
      + " test on the remainder");
    m_TestSplitBut.setToolTipText("Test on a user-specified dataset");
    m_StartBut.setToolTipText("Starts the classification");
    m_StopBut.setToolTipText("Stops a running classification");
    m_StorePredictionsBut
      .setToolTipText("Store predictions in the result list for later "
        + "visualization");
    m_errorPlotPointSizeProportionalToMargin
      .setToolTipText("In classifier errors plots the point size will be "
        + "set proportional to the absolute value of the "
        + "prediction margin (affects classification only)");
    m_OutputModelBut
      .setToolTipText("Output the model obtained from the full training set");
    m_OutputModelsForTrainingSplitsBut
            .setToolTipText("Output the models obtained from the training splits");
    m_OutputPerClassBut.setToolTipText("Output precision/recall & true/false"
      + " positives for each class");
    m_OutputConfusionBut
      .setToolTipText("Output the matrix displaying class confusions");
    m_OutputEntropyBut
      .setToolTipText("Output entropy-based evaluation measures");
    m_EvalWRTCostsBut
      .setToolTipText("Evaluate errors with respect to a cost matrix");
    m_RandomLab.setToolTipText("The seed value for randomization");
    m_RandomSeedText.setToolTipText(m_RandomLab.getToolTipText());
    m_PreserveOrderBut
      .setToolTipText("Preserves the order in a percentage split");
    m_OutputSourceCode
      .setToolTipText("Whether to output the built classifier as Java source code");
    m_SourceCodeClass.setToolTipText("The classname of the built classifier");
=======
    m_ClassCombo.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_ClassCombo_SetToolTipText_Text"));
    m_TrainBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_TrainBut_SetToolTipText_Text"));
    m_CVBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_CVBut_SetToolTipText_Text"));
    m_PercentBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_PercentBut_SetToolTipText_Text"));
    m_TestSplitBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_TestSplitBut_SetToolTipText_Text"));
    m_StartBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_StartBut_SetToolTipText_Text"));
    m_StopBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_StopBut_SetToolTipText_Text"));
    m_StorePredictionsBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_StorePredictionsBut_SetToolTipText_Text"));
    m_OutputModelBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_OutputModelBut_SetToolTipText_Text"));
    m_OutputPerClassBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_OutputPerClassBut_SetToolTipText_Text"));
    m_OutputConfusionBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_OutputConfusionBut_SetToolTipText_Text"));
    m_OutputEntropyBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_OutputEntropyBut_SetToolTipText_Text"));
    m_EvalWRTCostsBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_EvalWRTCostsBut_SetToolTipText_Text"));
    m_OutputPredictionsTextBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_OutputPredictionsTextBut_SetToolTipText_Text"));
    m_OutputAdditionalAttributesText.setToolTipText(Messages.getInstance()
      .getString(
        "ClassifierPanel_OutputAdditionalAttributesText_SetToolTipText_Text"));
    m_RandomLab.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_RandomLab_SetToolTipText_Text"));
    m_RandomSeedText.setToolTipText(m_RandomLab.getToolTipText());
    m_PreserveOrderBut.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_PreserveOrderBut_SetToolTipText_Text"));
    m_OutputSourceCode.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_OutputSourceCode_SetToolTipText_Text"));
    m_SourceCodeClass.setToolTipText(Messages.getInstance().getString(
      "ClassifierPanel_SourceCodeClass_SetToolTipText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_FileChooser.addChoosableFileFilter(m_PMMLModelFilter);
    m_FileChooser.setFileFilter(m_ModelFilter);

    m_FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

<<<<<<< HEAD
    m_ClassificationOutputEditor.setClassType(AbstractOutput.class);
    m_ClassificationOutputEditor.setValue(new Null());

    m_StorePredictionsBut.setSelected(ExplorerDefaults
      .getClassifierStorePredictionsForVis());
    m_OutputModelBut.setSelected(ExplorerDefaults.getClassifierOutputModel());
    m_OutputModelsForTrainingSplitsBut.setSelected(ExplorerDefaults.getClassifierOutputModelsForTrainingSplits());
=======
    m_StorePredictionsBut.setSelected(ExplorerDefaults
      .getClassifierStorePredictionsForVis());
    m_OutputModelBut.setSelected(ExplorerDefaults.getClassifierOutputModel());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_OutputPerClassBut.setSelected(ExplorerDefaults
      .getClassifierOutputPerClassStats());
    m_OutputConfusionBut.setSelected(ExplorerDefaults
      .getClassifierOutputConfusionMatrix());
    m_EvalWRTCostsBut.setSelected(ExplorerDefaults
      .getClassifierCostSensitiveEval());
    m_OutputEntropyBut.setSelected(ExplorerDefaults
      .getClassifierOutputEntropyEvalMeasures());
<<<<<<< HEAD
=======
    m_OutputPredictionsTextBut.setSelected(ExplorerDefaults
      .getClassifierOutputPredictions());
    m_OutputPredictionsTextBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_OutputAdditionalAttributesText.setEnabled(m_OutputPredictionsTextBut
          .isSelected());
      }
    });
    m_OutputAdditionalAttributesText.setText(ExplorerDefaults
      .getClassifierOutputAdditionalAttributes());
    m_OutputAdditionalAttributesText.setEnabled(m_OutputPredictionsTextBut
      .isSelected());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_RandomSeedText.setText("" + ExplorerDefaults.getClassifierRandomSeed());
    m_PreserveOrderBut.setSelected(ExplorerDefaults
      .getClassifierPreserveOrder());
    m_OutputSourceCode.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_SourceCodeClass.setEnabled(m_OutputSourceCode.isSelected());
      }
    });
    m_OutputSourceCode.setSelected(ExplorerDefaults
      .getClassifierOutputSourceCode());
    m_SourceCodeClass.setText(ExplorerDefaults.getClassifierSourceCodeClass());
    m_SourceCodeClass.setEnabled(m_OutputSourceCode.isSelected());
    m_ClassCombo.setEnabled(false);
    m_ClassCombo.setPreferredSize(COMBO_SIZE);
    m_ClassCombo.setMaximumSize(COMBO_SIZE);
    m_ClassCombo.setMinimumSize(COMBO_SIZE);

    m_CVBut.setSelected(true);
    // see "testMode" variable in startClassifier
    m_CVBut.setSelected(ExplorerDefaults.getClassifierTestMode() == 1);
    m_PercentBut.setSelected(ExplorerDefaults.getClassifierTestMode() == 2);
    m_TrainBut.setSelected(ExplorerDefaults.getClassifierTestMode() == 3);
    m_TestSplitBut.setSelected(ExplorerDefaults.getClassifierTestMode() == 4);
    m_PercentText.setText("" + ExplorerDefaults.getClassifierPercentageSplit());
    m_CVText.setText("" + ExplorerDefaults.getClassifierCrossvalidationFolds());
    updateRadioLinks();
    ButtonGroup bg = new ButtonGroup();
    bg.add(m_TrainBut);
    bg.add(m_CVBut);
    bg.add(m_PercentBut);
    bg.add(m_TestSplitBut);
    m_TrainBut.addActionListener(m_RadioListener);
    m_CVBut.addActionListener(m_RadioListener);
    m_PercentBut.addActionListener(m_RadioListener);
    m_TestSplitBut.addActionListener(m_RadioListener);
    m_SetTestBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setTestSet();
      }
    });
    m_EvalWRTCostsBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_SetCostsBut.setEnabled(m_EvalWRTCostsBut.isSelected());
        if ((m_SetCostsFrame != null) && (!m_EvalWRTCostsBut.isSelected())) {
          m_SetCostsFrame.setVisible(false);
        }
      }
    });
    m_CostMatrixEditor.setValue(new CostMatrix(1));
    m_SetCostsBut.setEnabled(m_EvalWRTCostsBut.isSelected());
    m_SetCostsBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_SetCostsBut.setEnabled(false);
        if (m_SetCostsFrame == null) {
<<<<<<< HEAD
          if (PropertyDialog.getParentDialog(m_SetCostsBut) != null) {
            m_SetCostsFrame =
              new PropertyDialog(PropertyDialog.getParentDialog(m_SetCostsBut), m_CostMatrixEditor, -1, -1);
          } else {
            m_SetCostsFrame =
              new PropertyDialog(PropertyDialog.getParentFrame(m_SetCostsBut), m_CostMatrixEditor, -1, -1);
          }
          m_SetCostsFrame.setTitle("Cost Matrix Editor");
=======
          if (PropertyDialog.getParentDialog(ClassifierPanel.this) != null) {
            m_SetCostsFrame = new PropertyDialog(PropertyDialog
              .getParentDialog(ClassifierPanel.this), m_CostMatrixEditor, 100,
              100);
          } else {
            m_SetCostsFrame = new PropertyDialog(PropertyDialog
              .getParentFrame(ClassifierPanel.this), m_CostMatrixEditor, 100,
              100);
          }
          m_SetCostsFrame.setTitle(Messages.getInstance().getString(
            "ClassifierPanel_SetCostsFrame_SetTitle_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          // pd.setSize(250,150);
          m_SetCostsFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent p) {
              m_SetCostsBut.setEnabled(m_EvalWRTCostsBut.isSelected());
              if ((m_SetCostsFrame != null)
                && (!m_EvalWRTCostsBut.isSelected())) {
                m_SetCostsFrame.setVisible(false);
              }
            }
          });
<<<<<<< HEAD
=======
          m_SetCostsFrame.setVisible(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }

        // do we need to change the size of the matrix?
        int classIndex = m_ClassCombo.getSelectedIndex();
        int numClasses = m_Instances.attribute(classIndex).numValues();
        if (numClasses != ((CostMatrix) m_CostMatrixEditor.getValue())
          .numColumns()) {
          m_CostMatrixEditor.setValue(new CostMatrix(numClasses));
        }

<<<<<<< HEAD
        if (PropertyDialog.getParentDialog(m_SetCostsBut) != null) {
          m_SetCostsFrame.setLocationRelativeTo(PropertyDialog.getParentDialog(m_SetCostsBut));
        } else {
          m_SetCostsFrame.setLocationRelativeTo(PropertyDialog.getParentFrame(m_SetCostsBut));
        }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        m_SetCostsFrame.setVisible(true);
      }
    });

    m_StartBut.setEnabled(false);
    m_StopBut.setEnabled(false);
    m_StartBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        boolean proceed = true;
        if (Explorer.m_Memory.memoryIsLow()) {
          proceed = Explorer.m_Memory.showMemoryIsLow();
        }
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (proceed) {
          startClassifier();
        }
      }
    });
    m_StopBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        stopClassifier();
      }
    });

    m_ClassCombo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int selected = m_ClassCombo.getSelectedIndex();
        if (selected != -1) {
          boolean isNominal = m_Instances.attribute(selected).isNominal();
          m_OutputPerClassBut.setEnabled(isNominal);
          m_OutputConfusionBut.setEnabled(isNominal);
        }
        updateCapabilitiesFilter(m_ClassifierEditor.getCapabilitiesFilter());
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
<<<<<<< HEAD
            List<String> selectedEls =
              (List<String>) m_History.getList().getSelectedValuesList();
            // String name = m_History.getNameAtIndex(index);
            visualize(selectedEls, e.getX(), e.getY());
=======
            String name = m_History.getNameAtIndex(index);
            visualize(name, e.getX(), e.getY());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          } else {
            visualize(null, e.getX(), e.getY());
          }
        }
      }
    });

    m_MoreOptions.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_MoreOptions.setEnabled(false);
        JPanel moreOptionsPanel = new JPanel();
        moreOptionsPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
<<<<<<< HEAD
        moreOptionsPanel.setLayout(new GridLayout(0, 1));
        moreOptionsPanel.add(m_OutputModelBut);
        moreOptionsPanel.add(m_OutputModelsForTrainingSplitsBut);
=======
        moreOptionsPanel.setLayout(new GridLayout(11, 1));
        moreOptionsPanel.add(m_OutputModelBut);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        moreOptionsPanel.add(m_OutputPerClassBut);
        moreOptionsPanel.add(m_OutputEntropyBut);
        moreOptionsPanel.add(m_OutputConfusionBut);
        moreOptionsPanel.add(m_StorePredictionsBut);
<<<<<<< HEAD
        moreOptionsPanel.add(m_errorPlotPointSizeProportionalToMargin);
        JPanel classOutPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        classOutPanel.add(new JLabel("Output predictions"));
        classOutPanel.add(m_ClassificationOutputPanel);
        moreOptionsPanel.add(classOutPanel);
=======
        moreOptionsPanel.add(m_OutputPredictionsTextBut);
        JPanel additionalAttsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        additionalAttsPanel.add(m_OutputAdditionalAttributesLab);
        additionalAttsPanel.add(m_OutputAdditionalAttributesText);
        moreOptionsPanel.add(additionalAttsPanel);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        JPanel costMatrixOption = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costMatrixOption.add(m_EvalWRTCostsBut);
        costMatrixOption.add(m_SetCostsBut);
        moreOptionsPanel.add(costMatrixOption);
        JPanel seedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        seedPanel.add(m_RandomLab);
        seedPanel.add(m_RandomSeedText);
        moreOptionsPanel.add(seedPanel);
        moreOptionsPanel.add(m_PreserveOrderBut);
        JPanel sourcePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        m_OutputSourceCode.setEnabled(m_ClassifierEditor.getValue() instanceof Sourcable);
        m_SourceCodeClass.setEnabled(m_OutputSourceCode.isEnabled()
          && m_OutputSourceCode.isSelected());
        sourcePanel.add(m_OutputSourceCode);
        sourcePanel.add(m_SourceCodeClass);
        moreOptionsPanel.add(sourcePanel);

        JPanel all = new JPanel();
        all.setLayout(new BorderLayout());

<<<<<<< HEAD
        JButton oK = new JButton("OK");
=======
        JButton oK = new JButton(Messages.getInstance().getString(
          "ClassifierPanel_OK_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        JPanel okP = new JPanel();
        okP.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        okP.setLayout(new GridLayout(1, 1, 5, 5));
        okP.add(oK);

        all.add(moreOptionsPanel, BorderLayout.CENTER);
        all.add(okP, BorderLayout.SOUTH);

<<<<<<< HEAD
        final JDialog jd =
          new JDialog(PropertyDialog.getParentFrame(ClassifierPanel.this),
            "Classifier evaluation options");
=======
        final JDialog jd = new JDialog(PropertyDialog
          .getParentFrame(ClassifierPanel.this), Messages.getInstance()
          .getString("ClassifierPanel_JD_JDialog_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        jd.getContentPane().setLayout(new BorderLayout());
        jd.getContentPane().add(all, BorderLayout.CENTER);
        jd.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent w) {
            jd.dispose();
            m_MoreOptions.setEnabled(true);
          }
        });
        oK.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent a) {
            m_MoreOptions.setEnabled(true);
            jd.dispose();
          }
        });
        jd.pack();
<<<<<<< HEAD

        // panel height is only available now
        m_ClassificationOutputPanel.setPreferredSize(new Dimension(300,
          m_ClassificationOutputPanel.getHeight()));
        jd.pack();

        // final List<AbstractEvaluationMetric> pluginMetrics =
        // AbstractEvaluationMetric
        // .getPluginMetrics();

        final JButton editEvalMetrics = new JButton("Evaluation metrics...");
        JPanel evalP = new JPanel();
        evalP.setLayout(new BorderLayout());
        evalP.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        evalP.add(editEvalMetrics, BorderLayout.CENTER);
        editEvalMetrics
          .setToolTipText("Enable/disable output of specific evaluation metrics");
        moreOptionsPanel.add(evalP);

        editEvalMetrics.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            EvaluationMetricSelectionDialog esd =
              new EvaluationMetricSelectionDialog(jd, m_selectedEvalMetrics);
            esd.setLocation(m_MoreOptions.getLocationOnScreen());
            esd.pack();
            esd.setVisible(true);
            m_selectedEvalMetrics = esd.getSelectedEvalMetrics();
          }
        });

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        jd.setLocation(m_MoreOptions.getLocationOnScreen());
        jd.setVisible(true);
      }
    });

    // Layout the GUI
    JPanel p1 = new JPanel();
    p1.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Classifier"),
=======
      BorderFactory.createTitledBorder(Messages.getInstance().getString(
        "ClassifierPanel_P1_JPanel_BorderFactoryCreateTitledBorder_Text")),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
    p1.setLayout(new BorderLayout());
    p1.add(m_CEPanel, BorderLayout.NORTH);

    JPanel p2 = new JPanel();
    GridBagLayout gbL = new GridBagLayout();
    p2.setLayout(gbL);
    p2.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Test options"),
=======
      BorderFactory.createTitledBorder(Messages.getInstance().getString(
        "ClassifierPanel_P2_JPanel_BorderFactoryCreateTitledBorder_Text")),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
    GridBagConstraints gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 0;
    gbC.gridx = 0;
    gbL.setConstraints(m_TrainBut, gbC);
    p2.add(m_TrainBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 1;
    gbC.gridx = 0;
    gbL.setConstraints(m_TestSplitBut, gbC);
    p2.add(m_TestSplitBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 1;
    gbC.gridx = 1;
    gbC.gridwidth = 2;
    gbC.insets = new Insets(2, 10, 2, 0);
    gbL.setConstraints(m_SetTestBut, gbC);
    p2.add(m_SetTestBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 2;
    gbC.gridx = 0;
    gbL.setConstraints(m_CVBut, gbC);
    p2.add(m_CVBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 2;
    gbC.gridx = 1;
    gbC.insets = new Insets(2, 10, 2, 10);
    gbL.setConstraints(m_CVLab, gbC);
    p2.add(m_CVLab);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 2;
    gbC.gridx = 2;
    gbC.weightx = 100;
    gbC.ipadx = 20;
    gbL.setConstraints(m_CVText, gbC);
    p2.add(m_CVText);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 3;
    gbC.gridx = 0;
    gbL.setConstraints(m_PercentBut, gbC);
    p2.add(m_PercentBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 3;
    gbC.gridx = 1;
    gbC.insets = new Insets(2, 10, 2, 10);
    gbL.setConstraints(m_PercentLab, gbC);
    p2.add(m_PercentLab);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 3;
    gbC.gridx = 2;
    gbC.weightx = 100;
    gbC.ipadx = 20;
    gbL.setConstraints(m_PercentText, gbC);
    p2.add(m_PercentText);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 4;
    gbC.gridx = 0;
    gbC.weightx = 100;
    gbC.gridwidth = 3;

    gbC.insets = new Insets(3, 0, 1, 0);
    gbL.setConstraints(m_MoreOptions, gbC);
    p2.add(m_MoreOptions);

<<<<<<< HEAD
    // Any launcher plugins?
    List<String> pluginsVector =
      PluginManager.getPluginNamesOfTypeList(ClassifierPanelLaunchHandlerPlugin.class.getName());
    JButton pluginBut = null;
    if (pluginsVector.size() == 1) {
      try {
        // Display as a single button
        String className = pluginsVector.get(0);
        final ClassifierPanelLaunchHandlerPlugin plugin =
          (ClassifierPanelLaunchHandlerPlugin) WekaPackageClassLoaderManager
            .objectForName(className);
        // (ClassifierPanelLaunchHandlerPlugin) Class.forName(className)
        // .newInstance();
        if (plugin != null) {
          plugin.setClassifierPanel(this);
          pluginBut = new JButton(plugin.getLaunchCommand());
          pluginBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              plugin.launch();
            }
          });
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    } else if (pluginsVector.size() > 1) {
      // make a popu menu
      int okPluginCount = 0;
      final java.awt.PopupMenu pluginPopup = new java.awt.PopupMenu();

      for (int i = 0; i < pluginsVector.size(); i++) {
        String className = (pluginsVector.get(i));
        try {
          final ClassifierPanelLaunchHandlerPlugin plugin =
            (ClassifierPanelLaunchHandlerPlugin) WekaPackageClassLoaderManager
              .objectForName(className);
          // (ClassifierPanelLaunchHandlerPlugin) Class.forName(className)
          // .newInstance();

          if (plugin == null) {
            continue;
          }
          okPluginCount++;
          plugin.setClassifierPanel(this);
          java.awt.MenuItem popI =
            new java.awt.MenuItem(plugin.getLaunchCommand());
          popI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // pluginPopup.setVisible(false);
              plugin.launch();
            }
          });
          pluginPopup.add(popI);
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }

      if (okPluginCount > 0) {
        pluginBut = new JButton("Launchers...");
        final JButton copyB = pluginBut;
        copyB.add(pluginPopup);
        pluginBut.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            pluginPopup.show(copyB, 0, 0);
          }
        });
      } else {
        pluginBut = null;
      }
    }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    JPanel buttons = new JPanel();
    buttons.setLayout(new GridLayout(2, 2));
    buttons.add(m_ClassCombo);
    m_ClassCombo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    JPanel ssButs = new JPanel();
    ssButs.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
<<<<<<< HEAD
    if (pluginBut == null) {
      ssButs.setLayout(new GridLayout(1, 2, 5, 5));
    } else {
      ssButs.setLayout(new FlowLayout(FlowLayout.LEFT));
    }
    ssButs.add(m_StartBut);
    ssButs.add(m_StopBut);
    if (pluginBut != null) {
      ssButs.add(pluginBut);
    }
=======
    ssButs.setLayout(new GridLayout(1, 2, 5, 5));
    ssButs.add(m_StartBut);
    ssButs.add(m_StopBut);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    buttons.add(ssButs);

    JPanel p3 = new JPanel();
<<<<<<< HEAD
    p3.setBorder(BorderFactory.createTitledBorder("Classifier output"));
=======
    p3.setBorder(BorderFactory.createTitledBorder(Messages.getInstance()
      .getString(
        "ClassifierPanel_P3_JPanel_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    p3.setLayout(new BorderLayout());
    final JScrollPane js = new JScrollPane(m_OutText);
    p3.add(js, BorderLayout.CENTER);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;

      @Override
      public void stateChanged(ChangeEvent e) {
        JViewport vp = (JViewport) e.getSource();
        int h = vp.getViewSize().height;
        if (h != lastHeight) { // i.e. an addition not just a user scrolling
          lastHeight = h;
          int x = h - vp.getExtentSize().height;
          vp.setViewPosition(new Point(0, x));
        }
      }
    });

    JPanel mondo = new JPanel();
    gbL = new GridBagLayout();
    mondo.setLayout(gbL);
    gbC = new GridBagConstraints();
    // gbC.anchor = GridBagConstraints.WEST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 0;
    gbC.gridx = 0;
    gbL.setConstraints(p2, gbC);
    mondo.add(p2);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.NORTH;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 1;
    gbC.gridx = 0;
    gbL.setConstraints(buttons, gbC);
    mondo.add(buttons);
    gbC = new GridBagConstraints();
    // gbC.anchor = GridBagConstraints.NORTH;
    gbC.fill = GridBagConstraints.BOTH;
    gbC.gridy = 2;
    gbC.gridx = 0;
    gbC.weightx = 0;
<<<<<<< HEAD
    gbL.setConstraints(historyHolder, gbC);
    mondo.add(historyHolder);
=======
    gbL.setConstraints(m_History, gbC);
    mondo.add(m_History);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
    gbC.gridy = 0;
    gbC.gridx = 1;
    gbC.gridheight = 3;
    gbC.weightx = 100;
    gbC.weighty = 100;
    gbL.setConstraints(p3, gbC);
    mondo.add(p3);

    setLayout(new BorderLayout());
    add(p1, BorderLayout.NORTH);
    add(mondo, BorderLayout.CENTER);
  }

  /**
   * Updates the enabled status of the input fields and labels.
   */
  protected void updateRadioLinks() {

    m_SetTestBut.setEnabled(m_TestSplitBut.isSelected());
    if ((m_SetTestFrame != null) && (!m_TestSplitBut.isSelected())) {
      m_SetTestFrame.setVisible(false);
    }
    m_CVText.setEnabled(m_CVBut.isSelected());
    m_CVLab.setEnabled(m_CVBut.isSelected());
    m_PercentText.setEnabled(m_PercentBut.isSelected());
    m_PercentLab.setEnabled(m_PercentBut.isSelected());
  }

  /**
<<<<<<< HEAD
   * Sets the Logger to receive informational messages.
   *
=======
   * Sets the Logger to receive informational messages
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newLog the Logger that will now get info messages
   */
  @Override
  public void setLog(Logger newLog) {

    m_Log = newLog;
  }

  /**
   * Tells the panel to use a new set of instances.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param inst a set of Instances
   */
  @Override
  public void setInstances(Instances inst) {
    m_Instances = inst;

    String[] attribNames = new String[m_Instances.numAttributes()];
    for (int i = 0; i < attribNames.length; i++) {
<<<<<<< HEAD
      String type =
        "(" + Attribute.typeToStringShort(m_Instances.attribute(i)) + ") ";
=======
      String type = "";
      switch (m_Instances.attribute(i).type()) {
      case Attribute.NOMINAL:
        type = Messages.getInstance().getString(
          "ClassifierPanel_SetInstances_Type_AttributeNOMINAL_Text");
        break;
      case Attribute.NUMERIC:
        type = Messages.getInstance().getString(
          "ClassifierPanel_SetInstances_Type_AttributeNUMERIC_Text");
        break;
      case Attribute.STRING:
        type = Messages.getInstance().getString(
          "ClassifierPanel_SetInstances_Type_AttributeSTRING_Text");
        break;
      case Attribute.DATE:
        type = Messages.getInstance().getString(
          "ClassifierPanel_SetInstances_Type_AttributeDATE_Text");
        break;
      case Attribute.RELATIONAL:
        type = Messages.getInstance().getString(
          "ClassifierPanel_SetInstances_Type_AttributeRELATIONAL_Text");
        break;
      default:
        type = Messages.getInstance().getString(
          "ClassifierPanel_SetInstances_Type_AttributeDEFAULT_Text");
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      attribNames[i] = type + m_Instances.attribute(i).name();
    }
    m_ClassCombo.setModel(new DefaultComboBoxModel(attribNames));
    if (attribNames.length > 0) {
      if (inst.classIndex() == -1) {
        m_ClassCombo.setSelectedIndex(attribNames.length - 1);
      } else {
        m_ClassCombo.setSelectedIndex(inst.classIndex());
      }
      m_ClassCombo.setEnabled(true);
      m_StartBut.setEnabled(m_RunThread == null);
      m_StopBut.setEnabled(m_RunThread != null);
    } else {
      m_StartBut.setEnabled(false);
      m_StopBut.setEnabled(false);
    }
  }

  /**
<<<<<<< HEAD
   * Get the current set of instances
   *
   * @return the current set of instances
   */
  public Instances getInstances() {
    return m_Instances;
  }

  /**
   * Sets the user test set. Information about the current test set is displayed
   * in an InstanceSummaryPanel and the user is given the ability to load
   * another set from a file or url.
   *
=======
   * Sets the user test set. Information about the current test set is displayed
   * in an InstanceSummaryPanel and the user is given the ability to load
   * another set from a file or url.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void setTestSet() {

    if (m_SetTestFrame == null) {
<<<<<<< HEAD
      PreprocessPanel preprocessPanel = null;
      if (m_Explorer != null) {
        preprocessPanel = m_Explorer.getPreprocessPanel();
      } else if (getMainApplication() != null) {
        Perspective p =
          getMainApplication().getPerspectiveManager().getPerspective(
            PreprocessPanel.PreprocessDefaults.ID);
        preprocessPanel = (PreprocessPanel) p;
      } else {
        throw new IllegalStateException("We don't have access to a "
          + "PreprocessPanel!");
      }

      final SetInstancesPanel sp =
        new SetInstancesPanel(true, true, preprocessPanel.m_FileChooser);

=======
      final SetInstancesPanel sp = new SetInstancesPanel(true,
        m_Explorer.getPreprocessPanel().m_FileChooser);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (m_TestLoader != null) {
        try {
          if (m_TestLoader.getStructure() != null) {
            sp.setInstances(m_TestLoader.getStructure());
          }
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
      sp.addPropertyChangeListener(new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent e) {
          m_TestLoader = sp.getLoader();
<<<<<<< HEAD
          m_TestClassIndex = sp.getClassIndex();
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
      // Add propertychangelistener to update m_TestLoader whenever
      // it changes in the settestframe
<<<<<<< HEAD
      m_SetTestFrame = Utils.getWekaJFrame("Test Instances", this);
=======
      m_SetTestFrame = new JFrame(Messages.getInstance().getString(
        "ClassifierPanel_SetTestSet_SetTestFrame_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      sp.setParentFrame(m_SetTestFrame); // enable Close-Button
      m_SetTestFrame.getContentPane().setLayout(new BorderLayout());
      m_SetTestFrame.getContentPane().add(sp, BorderLayout.CENTER);
      m_SetTestFrame.pack();
<<<<<<< HEAD
      m_SetTestFrame.setSize(400,200);
    }
    m_SetTestFrame.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_SetTestFrame.setVisible(true);
  }

  /**
<<<<<<< HEAD
   * outputs the header for the predictions on the data.
   *
   * @param outBuff the buffer to add the output to
   * @param classificationOutput for generating the classification output
   * @param title the title to print
   */
  protected void printPredictionsHeader(StringBuffer outBuff,
    AbstractOutput classificationOutput, String title) {
    if (classificationOutput.generatesOutput()) {
      outBuff.append("=== Predictions on " + title + " ===\n\n");
    }
    classificationOutput.printHeader();
  }

  /**
   * Configures an evaluation object with respect to a classifier, cost matrix,
   * output and plotting.
   *
   * @param eval the Evaluation object to configure
   * @param classifier the Classifier being used
   * @param inst the Instances involved
   * @param costMatrix a cost matrix (if any)
   * @param plotInstances a ClassifierErrorsPlotInstances for visualization of
   *          errors (can be null)
   * @param classificationOutput an output object for printing predictions (can
   *          be null)
   * @param onlySetPriors true to only set priors
   * @return the configured Evaluation object
   * @throws Exception if a problem occurs
   */
  public static Evaluation setupEval(Evaluation eval, Classifier classifier,
    Instances inst, CostMatrix costMatrix,
    ClassifierErrorsPlotInstances plotInstances,
    AbstractOutput classificationOutput, boolean onlySetPriors)
    throws Exception {

    if (classifier instanceof weka.classifiers.misc.InputMappedClassifier) {
      Instances mappedClassifierHeader =
        ((weka.classifiers.misc.InputMappedClassifier) classifier)
          .getModelHeader(new Instances(inst, 0));

      if (classificationOutput != null) {
        classificationOutput.setHeader(mappedClassifierHeader);
      }

      if (!onlySetPriors) {
        if (costMatrix != null) {
          eval =
            new Evaluation(new Instances(mappedClassifierHeader, 0), costMatrix);
        } else {
          eval = new Evaluation(new Instances(mappedClassifierHeader, 0));
        }
      }

      if (!eval.getHeader().equalHeaders(inst)) {
        // When the InputMappedClassifier is loading a model,
        // we need to make a new dataset that maps the training instances to
        // the structure expected by the mapped classifier - this is only
        // to ensure that the structure and priors computed by
        // evaluation object is correct with respect to the mapped classifier
        Instances mappedClassifierDataset =
          ((weka.classifiers.misc.InputMappedClassifier) classifier)
            .getModelHeader(new Instances(mappedClassifierHeader, 0));
        for (int zz = 0; zz < inst.numInstances(); zz++) {
          Instance mapped =
            ((weka.classifiers.misc.InputMappedClassifier) classifier)
              .constructMappedInstance(inst.instance(zz));
          mappedClassifierDataset.add(mapped);
        }
        eval.setPriors(mappedClassifierDataset);
        if (!onlySetPriors) {
          if (plotInstances != null) {
            plotInstances.setInstances(mappedClassifierDataset);
            plotInstances.setClassifier(classifier);
            /*
             * int mappedClass =
             * ((weka.classifiers.misc.InputMappedClassifier)classifier
             * ).getMappedClassIndex(); System.err.println("Mapped class index "
             * + mappedClass);
             */
            plotInstances.setClassIndex(mappedClassifierDataset.classIndex());
            plotInstances.setEvaluation(eval);
          }
        }
      } else {
        eval.setPriors(inst);
        if (!onlySetPriors) {
          if (plotInstances != null) {
            plotInstances.setInstances(inst);
            plotInstances.setClassifier(classifier);
            plotInstances.setClassIndex(inst.classIndex());
            plotInstances.setEvaluation(eval);
          }
        }
      }
    } else {
      eval.setPriors(inst);
      if (!onlySetPriors) {
        if (plotInstances != null) {
          plotInstances.setInstances(inst);
          plotInstances.setClassifier(classifier);
          plotInstances.setClassIndex(inst.classIndex());
          plotInstances.setEvaluation(eval);
        }
      }
    }

    return eval;
=======
   * Process a classifier's prediction for an instance and update a set of
   * plotting instances and additional plotting info. plotInfo for nominal class
   * datasets holds shape types (actual data points have automatic shape type
   * assignment; classifier error data points have box shape type). For numeric
   * class datasets, the actual data points are stored in plotInstances and
   * plotInfo stores the error (which is later converted to shape size values)
   * 
   * @param toPredict the actual data point
   * @param classifier the classifier
   * @param eval the evaluation object to use for evaluating the classifier on
   *          the instance to predict
   * @param plotInstances a set of plottable instances
   * @param plotShape additional plotting information (shape)
   * @param plotSize additional plotting information (size)
   */
  public static void processClassifierPrediction(Instance toPredict,
    Classifier classifier, Evaluation eval, Instances plotInstances,
    FastVector plotShape, FastVector plotSize) {
    try {
      double pred = eval.evaluateModelOnceAndRecordPrediction(classifier,
        toPredict);

      if (plotInstances != null) {
        double[] values = new double[plotInstances.numAttributes()];
        for (int i = 0; i < plotInstances.numAttributes(); i++) {
          if (i < toPredict.classIndex()) {
            values[i] = toPredict.value(i);
          } else if (i == toPredict.classIndex()) {
            values[i] = pred;
            values[i + 1] = toPredict.value(i);
            /*
             * // if the class value of the instances to predict is missing then
             * // set it to the predicted value if (toPredict.isMissing(i)) {
             * values[i+1] = pred; }
             */
            i++;
          } else {
            values[i] = toPredict.value(i - 1);
          }
        }

        plotInstances.add(new Instance(1.0, values));
        if (toPredict.classAttribute().isNominal()) {
          if (toPredict.isMissing(toPredict.classIndex())
            || Instance.isMissingValue(pred)) {
            plotShape.addElement(new Integer(Plot2D.MISSING_SHAPE));
          } else if (pred != toPredict.classValue()) {
            // set to default error point shape
            plotShape.addElement(new Integer(Plot2D.ERROR_SHAPE));
          } else {
            // otherwise set to constant (automatically assigned) point shape
            plotShape.addElement(new Integer(Plot2D.CONST_AUTOMATIC_SHAPE));
          }
          plotSize.addElement(new Integer(Plot2D.DEFAULT_SHAPE_SIZE));
        } else {
          // store the error (to be converted to a point size later)
          Double errd = null;
          if (!toPredict.isMissing(toPredict.classIndex())
            && !Instance.isMissingValue(pred)) {
            errd = new Double(pred - toPredict.classValue());
            plotShape.addElement(new Integer(Plot2D.CONST_AUTOMATIC_SHAPE));
          } else {
            // missing shape if actual class not present or prediction is
            // missing
            plotShape.addElement(new Integer(Plot2D.MISSING_SHAPE));
          }
          plotSize.addElement(errd);
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /**
   * Post processes numeric class errors into shape sizes for plotting in the
   * visualize panel
   * 
   * @param plotSize a FastVector of numeric class errors
   */
  private void postProcessPlotInfo(FastVector plotSize) {
    int maxpSize = 20;
    double maxErr = Double.NEGATIVE_INFINITY;
    double minErr = Double.POSITIVE_INFINITY;
    double err;

    for (int i = 0; i < plotSize.size(); i++) {
      Double errd = (Double) plotSize.elementAt(i);
      if (errd != null) {
        err = Math.abs(errd.doubleValue());
        if (err < minErr) {
          minErr = err;
        }
        if (err > maxErr) {
          maxErr = err;
        }
      }
    }

    for (int i = 0; i < plotSize.size(); i++) {
      Double errd = (Double) plotSize.elementAt(i);
      if (errd != null) {
        err = Math.abs(errd.doubleValue());
        if (maxErr - minErr > 0) {
          double temp = (((err - minErr) / (maxErr - minErr)) * maxpSize);
          plotSize.setElementAt(new Integer((int) temp), i);
        } else {
          plotSize.setElementAt(new Integer(1), i);
        }
      } else {
        plotSize.setElementAt(new Integer(1), i);
      }
    }
  }

  /**
   * Sets up the structure for the visualizable instances. This dataset contains
   * the original attributes plus the classifier's predictions for the class as
   * an attribute called "predicted+WhateverTheClassIsCalled".
   * 
   * @param trainInstances the instances that the classifier is trained on
   * @return a new set of instances containing one more attribute (predicted
   *         class) than the trainInstances
   */
  public static Instances setUpVisualizableInstances(Instances trainInstances) {
    FastVector hv = new FastVector();
    Attribute predictedClass;

    Attribute classAt = trainInstances.attribute(trainInstances.classIndex());
    if (classAt.isNominal()) {
      FastVector attVals = new FastVector();
      for (int i = 0; i < classAt.numValues(); i++) {
        attVals.addElement(classAt.value(i));
      }
      predictedClass = new Attribute(
        Messages
          .getInstance()
          .getString(
            "ClassifierPanel_SetUpVisualizableInstances_PredictedClass_Attribute_Text_First")
          + classAt.name(), attVals);
    } else {
      predictedClass = new Attribute(
        Messages
          .getInstance()
          .getString(
            "ClassifierPanel_SetUpVisualizableInstances_PredictedClass_Attribute_Text_Second")
          + classAt.name());
    }

    for (int i = 0; i < trainInstances.numAttributes(); i++) {
      if (i == trainInstances.classIndex()) {
        hv.addElement(predictedClass);
      }
      hv.addElement(trainInstances.attribute(i).copy());
    }
    return new Instances(trainInstances.relationName() + "_predicted", hv,
      trainInstances.numInstances());
  }

  /**
   * outputs the header for the predictions on the data
   * 
   * @param outBuff the buffer to add the output to
   * @param inst the data header
   * @param title the title to print
   */
  protected void printPredictionsHeader(StringBuffer outBuff, Instances inst,
    String title) {
    outBuff.append(Messages.getInstance().getString(
      "ClassifierPanel_PrintPredictionsHeader_OutBuffer_Text_First")
      + title
      + " "
      + Messages.getInstance().getString(
        "ClassifierPanel_PrintPredictionsHeader_OutBuffer_Text_First_Alpha"));
    outBuff.append(Messages.getInstance().getString(
      "ClassifierPanel_PrintPredictionsHeader_OutBuffer_Text_Second"));
    if (inst.classAttribute().isNominal()) {
      outBuff.append(Messages.getInstance().getString(
        "ClassifierPanel_PrintPredictionsHeader_OutBuffer_Text_Third"));
    }
    if (m_OutputAdditionalAttributesRange != null) {
      outBuff.append(" (");
      boolean first = true;
      for (int i = 0; i < inst.numAttributes() - 1; i++) {
        if (m_OutputAdditionalAttributesRange.isInRange(i)) {
          if (!first) {
            outBuff.append(",");
          } else {
            first = false;
          }
          outBuff.append(inst.attribute(i).name());
        }
      }
      outBuff.append(")");
    }
    outBuff.append("\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Starts running the currently configured classifier with the current
   * settings. This is run in a separate thread, and will only start if there is
   * no classifier already running. The classifier output is sent to the results
   * history panel.
   */
  protected void startClassifier() {

    if (m_RunThread == null) {
      synchronized (this) {
        m_StartBut.setEnabled(false);
        m_StopBut.setEnabled(true);
      }
      m_RunThread = new Thread() {
        @Override
        public void run() {
<<<<<<< HEAD
          m_CEPanel.addToHistory();

          // Copy the current state of things
          m_Log.statusMessage("Setting up...");
=======
          // Copy the current state of things
          m_Log.statusMessage(Messages.getInstance().getString(
            "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          CostMatrix costMatrix = null;
          Instances inst = new Instances(m_Instances);
          DataSource source = null;
          Instances userTestStructure = null;
<<<<<<< HEAD
          ClassifierErrorsPlotInstances plotInstances = null;

          // for timing
          long trainTimeStart = 0, trainTimeElapsed = 0;
          long testTimeStart = 0, testTimeElapsed = 0;

          try {
            if (m_TestLoader != null && m_TestLoader.getStructure() != null) {
              /* if (m_ClassifierEditor.getValue() instanceof BatchPredictor
                && ((BatchPredictor) m_ClassifierEditor.getValue())
                  .implementsMoreEfficientBatchPrediction()
                && m_TestLoader instanceof ArffLoader) {
                // we're not really streaming test instances in this case...
                ((ArffLoader) m_TestLoader).setRetainStringVals(true);
              } */
              if (m_TestLoader instanceof ArffLoader && m_StorePredictionsBut.isSelected()) {
                ((ArffLoader) m_TestLoader).setRetainStringVals(true);
              }
              m_TestLoader.reset();
              source = new DataSource(m_TestLoader);
              userTestStructure = source.getStructure();
              userTestStructure.setClassIndex(m_TestClassIndex);
=======
          // additional vis info (either shape type or point size)
          FastVector plotShape = new FastVector();
          FastVector plotSize = new FastVector();
          Instances predInstances = null;

          // for timing
          long trainTimeStart = 0, trainTimeElapsed = 0;

          try {
            if (m_TestLoader != null && m_TestLoader.getStructure() != null) {
              m_TestLoader.reset();
              source = new DataSource(m_TestLoader);
              userTestStructure = source.getStructure();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }
          } catch (Exception ex) {
            ex.printStackTrace();
          }
          if (m_EvalWRTCostsBut.isSelected()) {
<<<<<<< HEAD
            costMatrix =
              new CostMatrix((CostMatrix) m_CostMatrixEditor.getValue());
          }
          boolean outputModel = m_OutputModelBut.isSelected();
          boolean outputModelsForTrainingSplits = m_OutputModelsForTrainingSplitsBut.isSelected();
=======
            costMatrix = new CostMatrix(
              (CostMatrix) m_CostMatrixEditor.getValue());
          }
          boolean outputModel = m_OutputModelBut.isSelected();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          boolean outputConfusion = m_OutputConfusionBut.isSelected();
          boolean outputPerClass = m_OutputPerClassBut.isSelected();
          boolean outputSummary = true;
          boolean outputEntropy = m_OutputEntropyBut.isSelected();
          boolean saveVis = m_StorePredictionsBut.isSelected();
<<<<<<< HEAD
          boolean outputPredictionsText =
            (m_ClassificationOutputEditor.getValue().getClass() != Null.class);
=======
          boolean outputPredictionsText = m_OutputPredictionsTextBut
            .isSelected();
          if (m_OutputAdditionalAttributesText.getText().equals("")) {
            m_OutputAdditionalAttributesRange = null;
          } else {
            try {
              m_OutputAdditionalAttributesRange = new Range(
                m_OutputAdditionalAttributesText.getText());
              m_OutputAdditionalAttributesRange
                .setUpper(inst.numAttributes() - 1);
            } catch (IllegalArgumentException e) {
              JOptionPane.showMessageDialog(
                ClassifierPanel.this,
                Messages.getInstance().getString(
                  "ClassifierPanel_OutputAdditionalAttributes_First")
                  + "\n\n"
                  + m_OutputAdditionalAttributesText.getText()
                  + "\n\n"
                  + Messages.getInstance().getString(
                    "ClassifierPanel_OutputAdditionalAttributes_Second"),
                Messages.getInstance().getString(
                  "ClassifierPanel_OutputAdditionalAttributes_Title"),
                JOptionPane.ERROR_MESSAGE);
              m_OutputAdditionalAttributesRange = null;
            }
          }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

          String grph = null;

          int testMode = 0;
          int numFolds = 10;
          double percent = 66;
          int classIndex = m_ClassCombo.getSelectedIndex();
<<<<<<< HEAD
          inst.setClassIndex(classIndex);
          Classifier classifier = (Classifier) m_ClassifierEditor.getValue();
          Classifier template = null;
          try {
            template = AbstractClassifier.makeCopy(classifier);
          } catch (Exception ex) {
            m_Log.logMessage("Problem copying classifier: " + ex.getMessage());
          }
          Classifier fullClassifier = null;
          StringBuffer outBuff = new StringBuffer();
          AbstractOutput classificationOutput = null;
          if (outputPredictionsText) {
            classificationOutput =
              (AbstractOutput) m_ClassificationOutputEditor.getValue();
            Instances header = new Instances(inst, 0);
            header.setClassIndex(classIndex);
            classificationOutput.setHeader(header);
            classificationOutput.setBuffer(outBuff);
          }
          String name =
            (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
          String cname = "";
          String cmd = "";
=======
          Classifier classifier = (Classifier) m_ClassifierEditor.getValue();
          Classifier template = null;
          try {
            template = Classifier.makeCopy(classifier);
          } catch (Exception ex) {
            m_Log.logMessage(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_Log_LogMessage_Text_First")
              + ex.getMessage());
          }
          Classifier fullClassifier = null;
          StringBuffer outBuff = new StringBuffer();
          String name = (new SimpleDateFormat("HH:mm:ss - "))
            .format(new Date());
          String cname = classifier.getClass().getName();
          if (cname.startsWith("weka.classifiers.")) {
            name += cname.substring("weka.classifiers.".length());
          } else {
            name += cname;
          }
          String cmd = m_ClassifierEditor.getValue().getClass().getName();
          if (m_ClassifierEditor.getValue() instanceof OptionHandler) {
            cmd += " "
              + Utils.joinOptions(((OptionHandler) m_ClassifierEditor
                .getValue()).getOptions());
          }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          Evaluation eval = null;
          try {
            if (m_CVBut.isSelected()) {
              testMode = 1;
              numFolds = Integer.parseInt(m_CVText.getText());
              if (numFolds <= 1) {
<<<<<<< HEAD
                throw new Exception("Number of folds must be greater than 1");
=======
                throw new Exception(Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_Exception_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
            } else if (m_PercentBut.isSelected()) {
              testMode = 2;
              percent = Double.parseDouble(m_PercentText.getText());
              if ((percent <= 0) || (percent >= 100)) {
<<<<<<< HEAD
                throw new Exception("Percentage must be between 0 and 100");
=======
                throw new Exception(Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_Exception_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
            } else if (m_TrainBut.isSelected()) {
              testMode = 3;
            } else if (m_TestSplitBut.isSelected()) {
              testMode = 4;
              // Check the test instance compatibility
              if (source == null) {
<<<<<<< HEAD
                throw new Exception("No user test set has been specified");
              }

              if (!(classifier instanceof weka.classifiers.misc.InputMappedClassifier)) {
                if (!inst.equalHeaders(userTestStructure)) {
                  boolean wrapClassifier = false;
                  if (!Utils
                    .getDontShowDialog("weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier")) {
                    JCheckBox dontShow =
                      new JCheckBox("Do not show this message again");
                    Object[] stuff = new Object[2];
                    stuff[0] =
                      "Train and test set are not compatible.\n"
                        + "Would you like to automatically wrap the classifier in\n"
                        + "an \"InputMappedClassifier\" before proceeding?.\n";
                    stuff[1] = dontShow;

                    int result =
                      JOptionPane.showConfirmDialog(ClassifierPanel.this,
                        stuff, "ClassifierPanel", JOptionPane.YES_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                      wrapClassifier = true;
                    }

                    if (dontShow.isSelected()) {
                      String response = (wrapClassifier) ? "yes" : "no";
                      Utils
                        .setDontShowDialogResponse(
                          "weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier",
                          response);
                    }

                  } else {
                    // What did the user say - do they want to autowrap or not?
                    String response =
                      Utils
                        .getDontShowDialogResponse("weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier");
                    if (response != null && response.equalsIgnoreCase("yes")) {
                      wrapClassifier = true;
                    }
                  }

                  if (wrapClassifier) {
                    weka.classifiers.misc.InputMappedClassifier temp =
                      new weka.classifiers.misc.InputMappedClassifier();

                    // pass on the known test structure so that we get the
                    // correct mapping report from the toString() method
                    // of InputMappedClassifier
                    temp.setClassifier(classifier);
                    temp.setTestStructure(userTestStructure);
                    classifier = temp;
                  } else {
                    throw new Exception(
                      "Train and test set are not compatible\n"
                        + inst.equalHeadersMsg(userTestStructure));
                  }
                }
              }

            } else {
              throw new Exception("Unknown test mode");
            }

            cname = classifier.getClass().getName();
            if (cname.startsWith("weka.classifiers.")) {
              name += cname.substring("weka.classifiers.".length());
            } else {
              name += cname;
            }
            cmd = classifier.getClass().getName();
            if (classifier instanceof OptionHandler) {
              cmd +=
                " "
                  + Utils
                    .joinOptions(((OptionHandler) classifier).getOptions());
            }

            // set up the structure of the plottable instances for
            // visualization
            plotInstances = ExplorerDefaults.getClassifierErrorsPlotInstances();
            plotInstances.setInstances(testMode == 4 ? userTestStructure : inst);
            plotInstances.setClassifier(classifier);
            plotInstances.setClassIndex(inst.classIndex());
            plotInstances.setSaveForVisualization(saveVis);
            plotInstances
              .setPointSizeProportionalToMargin(m_errorPlotPointSizeProportionalToMargin
                .isSelected());

            // Output some header information
            m_Log.logMessage("Started " + cname);
            m_Log.logMessage("Command: " + cmd);
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
            outBuff.append("=== Run information ===\n\n");
            outBuff.append("Scheme:       " + cname);
=======
                throw new Exception(Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_Exception_Text_Third"));
              }
              if (!inst.equalHeaders(userTestStructure)) {
                throw new Exception(Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_Exception_Text_Fourth"));
              }
              userTestStructure.setClassIndex(classIndex);
            } else {
              throw new Exception(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_Exception_Text_Fifth"));
            }
            inst.setClassIndex(classIndex);

            // set up the structure of the plottable instances for
            // visualization
            if (saveVis) {
              predInstances = setUpVisualizableInstances(inst);
              predInstances.setClassIndex(inst.classIndex() + 1);
            }

            // Output some header information
            m_Log.logMessage(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_Log_LogMessage_Text_Second")
              + cname);
            m_Log.logMessage(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_Log_LogMessage_Text_Third")
              + cmd);
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_OutBuffer_Text_First"));
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_OutBuffer_Text_Second")
              + cname);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (classifier instanceof OptionHandler) {
              String[] o = ((OptionHandler) classifier).getOptions();
              outBuff.append(" " + Utils.joinOptions(o));
            }
            outBuff.append("\n");
<<<<<<< HEAD
            outBuff.append("Relation:     " + inst.relationName() + '\n');
            outBuff.append("Instances:    " + inst.numInstances() + '\n');
            outBuff.append("Attributes:   " + inst.numAttributes() + '\n');
=======
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_OutBuffer_Text_Fourth")
              + inst.relationName() + '\n');
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_OutBuffer_Text_Sixth")
              + inst.numInstances() + '\n');
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_OutBuffer_Text_Eigth")
              + inst.numAttributes() + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (inst.numAttributes() < 100) {
              for (int i = 0; i < inst.numAttributes(); i++) {
                outBuff.append("              " + inst.attribute(i).name()
                  + '\n');
              }
            } else {
<<<<<<< HEAD
              outBuff.append("              [list of attributes omitted]\n");
            }

            outBuff.append("Test mode:    ");
            switch (testMode) {
            case 3: // Test on training
              outBuff.append("evaluate on training data\n");
              break;
            case 1: // CV mode
              outBuff.append("" + numFolds + "-fold cross-validation\n");
              break;
            case 2: // Percent split
              outBuff.append("split " + percent + "% train, remainder test\n");
              break;
            case 4: // Test on user split
              if (source.isIncremental()) {
                outBuff.append("user supplied test set: "
                  + " size unknown (reading incrementally)\n");
              } else {
                outBuff.append("user supplied test set: "
                  + source.getDataSet().numInstances() + " instances\n");
=======
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_Twelveth"));
            }

            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_OutBuffer_Text_Thirteenth"));
            switch (testMode) {
            case 3: // Test on training
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_Fourteenth"));
              break;
            case 1: // CV mode
              outBuff.append(""
                + numFolds
                + Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_OutBuffer_Text_Sixteenth"));
              break;
            case 2: // Percent split
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_Seventeenth")
                + percent
                + Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_OutBuffer_Text_Eighteenth"));
              break;
            case 4: // Test on user split
              if (source.isIncremental()) {
                outBuff.append(Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_OutBuffer_Text_Nineteenth"));
              } else {
                outBuff
                  .append(Messages.getInstance().getString(
                    "ClassifierPanel_StartClassifier_OutBuffer_Text_Twentyth")
                    + source.getDataSet().numInstances()
                    + Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentyFirst"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
              break;
            }
            if (costMatrix != null) {
<<<<<<< HEAD
              outBuff.append("Evaluation cost matrix:\n")
=======
              outBuff
                .append(
                  Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentySecond"))
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                .append(costMatrix.toString()).append("\n");
            }
            outBuff.append("\n");
            m_History.addResult(name, outBuff);
            m_History.setSingle(name);

            // Build the model and output it.
            if (outputModel || (testMode == 3) || (testMode == 4)) {
<<<<<<< HEAD
              m_Log.statusMessage("Building model on training data...");
=======
              m_Log
                .statusMessage(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

              trainTimeStart = System.currentTimeMillis();
              classifier.buildClassifier(inst);
              trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;
            }

            if (outputModel) {
<<<<<<< HEAD
              outBuff
                .append("=== Classifier model (full training set) ===\n\n");
              outBuff.append(classifier.toString() + "\n");
              outBuff.append("\nTime taken to build model: "
                + Utils.doubleToString(trainTimeElapsed / 1000.0, 2)
                + " seconds\n\n");
=======
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentySixth"));
              outBuff.append(classifier.toString() + "\n");
              outBuff
                .append(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentyEighth")
                  + Utils.doubleToString(trainTimeElapsed / 1000.0, 2)
                  + " "
                  + Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentyNineth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              m_History.updateResult(name);
              if (classifier instanceof Drawable) {
                grph = null;
                try {
                  grph = ((Drawable) classifier).graph();
                } catch (Exception ex) {
                }
              }
              // copy full model for output
              SerializedObject so = new SerializedObject(classifier);
              fullClassifier = (Classifier) so.getObject();
            }

            switch (testMode) {
            case 3: // Test on training
              m_Log.statusMessage("Evaluating on training data...");
              eval = new Evaluation(inst, costMatrix);

<<<<<<< HEAD
              // make adjustments if the classifier is an InputMappedClassifier
              eval =
                setupEval(eval, classifier, inst, costMatrix, plotInstances,
                  classificationOutput, false);
              eval.setMetricsToDisplay(m_selectedEvalMetrics);

              // plotInstances.setEvaluation(eval);
              plotInstances.setUp();

              if (outputPredictionsText) {
                printPredictionsHeader(outBuff, classificationOutput,
                  "training set");
              }

              testTimeStart = System.currentTimeMillis();
              if (classifier instanceof BatchPredictor
                && ((BatchPredictor) classifier)
                  .implementsMoreEfficientBatchPrediction()) {
                Instances toPred = new Instances(inst);
                for (int i = 0; i < toPred.numInstances(); i++) {
                  toPred.instance(i).setClassMissing();
                }
                double[][] predictions =
                  ((BatchPredictor) classifier)
                    .distributionsForInstances(toPred);
                plotInstances.process(inst, predictions, eval);
                if (outputPredictionsText) {
                  for (int jj = 0; jj < inst.numInstances(); jj++) {
                    classificationOutput.printClassification(predictions[jj],
                      inst.instance(jj), jj);
                  }
                }
              } else {
                for (int jj = 0; jj < inst.numInstances(); jj++) {
                  plotInstances.process(inst.instance(jj), classifier, eval);

                  if (outputPredictionsText) {
                    classificationOutput.printClassification(classifier,
                      inst.instance(jj), jj);
                  }
                  if ((jj % 100) == 0) {
                    m_Log
                      .statusMessage("Evaluating on training data. Processed "
                        + jj + " instances...");
                  }
                }
              }
              testTimeElapsed = System.currentTimeMillis() - testTimeStart;
              if (outputPredictionsText) {
                classificationOutput.printFooter();
              }
              if (outputPredictionsText
                && classificationOutput.generatesOutput()) {
=======
              if (outputPredictionsText) {
                printPredictionsHeader(outBuff, inst, "training set");
              }

              for (int jj = 0; jj < inst.numInstances(); jj++) {
                processClassifierPrediction(inst.instance(jj), classifier,
                  eval, predInstances, plotShape, plotSize);

                if (outputPredictionsText) {
                  outBuff.append(predictionText(classifier, inst.instance(jj),
                    jj + 1));
                }
                if ((jj % 100) == 0) {
                  m_Log.statusMessage("Evaluating on training data. Processed "
                    + jj + " instances...");
                }
              }
              if (outputPredictionsText) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                outBuff.append("\n");
              }
              outBuff.append("=== Evaluation on training set ===\n");
              break;

            case 1: // CV mode
              m_Log.statusMessage("Randomizing instances...");
              int rnd = 1;
              try {
                rnd = Integer.parseInt(m_RandomSeedText.getText().trim());
                // System.err.println("Using random seed "+rnd);
              } catch (Exception ex) {
                m_Log.logMessage("Trouble parsing random seed value");
                rnd = 1;
              }
              Random random = new Random(rnd);
              inst.randomize(random);
              if (inst.attribute(classIndex).isNominal()) {
                m_Log.statusMessage("Stratifying instances...");
                inst.stratify(numFolds);
              }
              eval = new Evaluation(inst, costMatrix);

<<<<<<< HEAD
              // make adjustments if the classifier is an InputMappedClassifier
              eval =
                setupEval(eval, classifier, inst, costMatrix, plotInstances,
                  classificationOutput, false);
              eval.setMetricsToDisplay(m_selectedEvalMetrics);

              // plotInstances.setEvaluation(eval);
              plotInstances.setUp();

              if (outputPredictionsText) {
                printPredictionsHeader(outBuff, classificationOutput,
                  "test data");
=======
              if (outputPredictionsText) {
                printPredictionsHeader(outBuff, inst, "test data");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }

              // Make some splits and do a CV
              for (int fold = 0; fold < numFolds; fold++) {
<<<<<<< HEAD
                m_Log.statusMessage("Creating splits for fold " + (fold + 1)
                  + "...");
                Instances train = inst.trainCV(numFolds, fold, random);

                // make adjustments if the classifier is an
                // InputMappedClassifier
                eval =
                  setupEval(eval, classifier, train, costMatrix, plotInstances,
                    classificationOutput, true);
                eval.setMetricsToDisplay(m_selectedEvalMetrics);

                // eval.setPriors(train);
                m_Log.statusMessage("Building model for fold " + (fold + 1)
                  + "...");
                Classifier current = null;
                try {
                  current = AbstractClassifier.makeCopy(template);
                } catch (Exception ex) {
                  m_Log.logMessage("Problem copying classifier: "
                    + ex.getMessage());
                }
                current.buildClassifier(train);
                if (outputModelsForTrainingSplits) {
                  outBuff.append("\n=== Classifier model for fold " + (fold + 1) + " ===\n\n");
                  outBuff.append(current.toString() + "\n");
                }
                Instances test = inst.testCV(numFolds, fold);
                m_Log.statusMessage("Evaluating model for fold " + (fold + 1)
                  + "...");

                if (classifier instanceof BatchPredictor
                  && ((BatchPredictor) classifier)
                    .implementsMoreEfficientBatchPrediction()) {
                  Instances toPred = new Instances(test);
                  for (int i = 0; i < toPred.numInstances(); i++) {
                    toPred.instance(i).setClassMissing();
                  }
                  double[][] predictions =
                    ((BatchPredictor) current)
                      .distributionsForInstances(toPred);
                  plotInstances.process(test, predictions, eval);
                  if (outputPredictionsText) {
                    for (int jj = 0; jj < test.numInstances(); jj++) {
                      classificationOutput.printClassification(predictions[jj],
                        test.instance(jj), jj);
                    }
                  }
                } else {
                  for (int jj = 0; jj < test.numInstances(); jj++) {
                    plotInstances.process(test.instance(jj), current, eval);
                    if (outputPredictionsText) {
                      classificationOutput.printClassification(current,
                        test.instance(jj), jj);
                    }
=======
                m_Log
                  .statusMessage(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Eighth")
                    + (fold + 1)
                    + Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Nineth"));
                Instances train = inst.trainCV(numFolds, fold, random);
                eval.setPriors(train);
                m_Log
                  .statusMessage(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Tenth")
                    + (fold + 1)
                    + Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Twelveth"));
                Classifier current = null;
                try {
                  current = Classifier.makeCopy(template);
                } catch (Exception ex) {
                  m_Log
                    .logMessage(Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_LogMessage_Text_Fifth")
                      + ex.getMessage());
                }
                current.buildClassifier(train);
                Instances test = inst.testCV(numFolds, fold);
                m_Log
                  .statusMessage(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Eleventh")
                    + (fold + 1)
                    + Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Twelveth"));
                for (int jj = 0; jj < test.numInstances(); jj++) {
                  processClassifierPrediction(test.instance(jj), current, eval,
                    predInstances, plotShape, plotSize);
                  if (outputPredictionsText) {
                    outBuff.append(predictionText(current, test.instance(jj),
                      jj + 1));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                  }
                }
              }
              if (outputPredictionsText) {
<<<<<<< HEAD
                classificationOutput.printFooter();
              }
              if (outputPredictionsText) {
                outBuff.append("\n");
              }
              if (inst.attribute(classIndex).isNominal()) {
                outBuff.append("=== Stratified cross-validation ===\n");
              } else {
                outBuff.append("=== Cross-validation ===\n");
=======
                outBuff.append("\n");
              }
              if (inst.attribute(classIndex).isNominal()) {
                outBuff
                  .append(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_OutBuffer_Text_ThirtyThird"));
              } else {
                outBuff
                  .append(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_OutBuffer_Text_ThirtyFourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
              break;

            case 2: // Percent split
              if (!m_PreserveOrderBut.isSelected()) {
<<<<<<< HEAD
                m_Log.statusMessage("Randomizing instances...");
                try {
                  rnd = Integer.parseInt(m_RandomSeedText.getText().trim());
                } catch (Exception ex) {
                  m_Log.logMessage("Trouble parsing random seed value");
=======
                m_Log
                  .statusMessage(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Thirteenth"));
                try {
                  rnd = Integer.parseInt(m_RandomSeedText.getText().trim());
                } catch (Exception ex) {
                  m_Log
                    .logMessage(Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Fourteenth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                  rnd = 1;
                }
                inst.randomize(new Random(rnd));
              }
<<<<<<< HEAD
              int trainSize =
                (int) Math.round(inst.numInstances() * percent / 100);
              int testSize = inst.numInstances() - trainSize;
              Instances train = new Instances(inst, 0, trainSize);
              Instances test = new Instances(inst, trainSize, testSize);
              m_Log.statusMessage("Building model on training split ("
                + trainSize + " instances)...");
              Classifier current = null;
              try {
                current = AbstractClassifier.makeCopy(template);
              } catch (Exception ex) {
                m_Log.logMessage("Problem copying classifier: "
                  + ex.getMessage());
              }
              current.buildClassifier(train);
              if (outputModelsForTrainingSplits) {
                outBuff.append("\n=== Classifier model for training split (" + trainSize + " instances) ===\n\n");
                outBuff.append(current.toString() + "\n");
              }
              eval = new Evaluation(train, costMatrix);

              // make adjustments if the classifier is an InputMappedClassifier
              eval =
                setupEval(eval, classifier, train, costMatrix, plotInstances,
                  classificationOutput, false);
              eval.setMetricsToDisplay(m_selectedEvalMetrics);

              // plotInstances.setEvaluation(eval);
              plotInstances.setUp();
              m_Log.statusMessage("Evaluating on test split...");

              if (outputPredictionsText) {
                printPredictionsHeader(outBuff, classificationOutput,
                  "test split");
              }

              testTimeStart = System.currentTimeMillis();
              if (classifier instanceof BatchPredictor
                && ((BatchPredictor) classifier)
                  .implementsMoreEfficientBatchPrediction()) {
                Instances toPred = new Instances(test);
                for (int i = 0; i < toPred.numInstances(); i++) {
                  toPred.instance(i).setClassMissing();
                }

                double[][] predictions =
                  ((BatchPredictor) current).distributionsForInstances(toPred);
                plotInstances.process(test, predictions, eval);
                if (outputPredictionsText) {
                  for (int jj = 0; jj < test.numInstances(); jj++) {
                    classificationOutput.printClassification(predictions[jj],
                      test.instance(jj), jj);
                  }
                }
              } else {
                for (int jj = 0; jj < test.numInstances(); jj++) {
                  plotInstances.process(test.instance(jj), current, eval);
                  if (outputPredictionsText) {
                    classificationOutput.printClassification(current,
                      test.instance(jj), jj);
                  }
                  if ((jj % 100) == 0) {
                    m_Log.statusMessage("Evaluating on test split. Processed "
                      + jj + " instances...");
                  }
                }
              }
              testTimeElapsed = System.currentTimeMillis() - testTimeStart;
              if (outputPredictionsText) {
                classificationOutput.printFooter();
              }
              if (outputPredictionsText) {
                outBuff.append("\n");
              }
              outBuff.append("=== Evaluation on test split ===\n");
              break;

            case 4: // Test on user split
              m_Log.statusMessage("Evaluating on test data...");
              eval = new Evaluation(inst, costMatrix);
              // make adjustments if the classifier is an InputMappedClassifier
              eval =
                setupEval(eval, classifier, inst, costMatrix, plotInstances,
                  classificationOutput, false);
              plotInstances.setInstances(userTestStructure);
              eval.setMetricsToDisplay(m_selectedEvalMetrics);

              // plotInstances.setEvaluation(eval);
              plotInstances.setUp();

              if (outputPredictionsText) {
                printPredictionsHeader(outBuff, classificationOutput,
                  "test set");
=======
              int trainSize = (int) Math.round(inst.numInstances() * percent
                / 100);
              int testSize = inst.numInstances() - trainSize;
              Instances train = new Instances(inst, 0, trainSize);
              Instances test = new Instances(inst, trainSize, testSize);
              m_Log
                .statusMessage(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Fifteenth")
                  + trainSize
                  + Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Sixteenth"));
              Classifier current = null;
              try {
                current = Classifier.makeCopy(template);
              } catch (Exception ex) {
                m_Log.logMessage(Messages.getInstance().getString(
                  "ClassifierPanel_StartClassifier_Log_LogMessage_Text_Sixth")
                  + ex.getMessage());
              }
              current.buildClassifier(train);
              eval = new Evaluation(train, costMatrix);
              m_Log
                .statusMessage(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Seventeenth"));

              if (outputPredictionsText) {
                printPredictionsHeader(
                  outBuff,
                  inst,
                  Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_PrintPredictionsHeader_Text_First"));
              }

              for (int jj = 0; jj < test.numInstances(); jj++) {
                processClassifierPrediction(test.instance(jj), current, eval,
                  predInstances, plotShape, plotSize);
                if (outputPredictionsText) {
                  outBuff.append(predictionText(current, test.instance(jj),
                    jj + 1));
                }
                if ((jj % 100) == 0) {
                  m_Log
                    .statusMessage(Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Eighteenth")
                      + jj
                      + Messages
                        .getInstance()
                        .getString(
                          "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Nineteenth"));
                }
              }
              if (outputPredictionsText) {
                outBuff.append("\n");
              }
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_ThirtySixth"));
              break;

            case 4: // Test on user split
              m_Log
                .statusMessage(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_Twentyth"));
              eval = new Evaluation(inst, costMatrix);

              if (outputPredictionsText) {
                printPredictionsHeader(
                  outBuff,
                  inst,
                  Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_StartClassifier_PrintPredictionsHeader_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }

              Instance instance;
              int jj = 0;
<<<<<<< HEAD
              Instances batchInst = null;
              int batchSize = 100;
              if (classifier instanceof BatchPredictor
                && ((BatchPredictor) classifier)
                  .implementsMoreEfficientBatchPrediction()) {
                batchInst = new Instances(userTestStructure, 0);
                String batchSizeS =
                  ((BatchPredictor) classifier).getBatchSize();
                if (batchSizeS != null && batchSizeS.length() > 0) {
                  try {
                    batchSizeS =
                      Environment.getSystemWide().substitute(batchSizeS);
                  } catch (Exception ex) {
                  }

                  try {
                    batchSize = Integer.parseInt(batchSizeS);
                  } catch (NumberFormatException ex) {
                    // just go with the default
                  }
                }
              }
              testTimeStart = System.currentTimeMillis();
              while (source.hasMoreElements(userTestStructure)) {
                instance = source.nextElement(userTestStructure);

                if (classifier instanceof BatchPredictor
                  && ((BatchPredictor) classifier)
                    .implementsMoreEfficientBatchPrediction()) {
                  batchInst.add(instance);
                  if (batchInst.numInstances() == batchSize) {
                    Instances toPred = new Instances(batchInst);
                    for (int i = 0; i < toPred.numInstances(); i++) {
                      toPred.instance(i).setClassMissing();
                    }
                    double[][] predictions =
                      ((BatchPredictor) classifier)
                        .distributionsForInstances(toPred);
                    plotInstances.process(batchInst, predictions, eval);

                    if (outputPredictionsText) {
                      for (int kk = 0; kk < batchInst.numInstances(); kk++) {
                        classificationOutput.printClassification(
                          predictions[kk], batchInst.instance(kk), kk);
                      }
                    }
                    jj += batchInst.numInstances();
                    m_Log.statusMessage("Evaluating on test data. Processed "
                      + jj + " instances...");
                    batchInst.delete();
                  }
                } else {
                  plotInstances.process(instance, classifier, eval);
                  if (outputPredictionsText) {
                    classificationOutput.printClassification(classifier,
                      instance, jj);
                  }
                  if ((++jj % 100) == 0) {
                    m_Log.statusMessage("Evaluating on test data. Processed "
                      + jj + " instances...");
                  }
                }
              }

              if (classifier instanceof BatchPredictor
                && ((BatchPredictor) classifier)
                  .implementsMoreEfficientBatchPrediction()
                && batchInst.numInstances() > 0) {
                // finish the last batch

                Instances toPred = new Instances(batchInst);
                for (int i = 0; i < toPred.numInstances(); i++) {
                  toPred.instance(i).setClassMissing();
                }

                double[][] predictions =
                  ((BatchPredictor) classifier)
                    .distributionsForInstances(toPred);
                plotInstances.process(batchInst, predictions, eval);

                if (outputPredictionsText) {
                  for (int kk = 0; kk < batchInst.numInstances(); kk++) {
                    classificationOutput.printClassification(predictions[kk],
                      batchInst.instance(kk), kk);
                  }
                }
              }
              testTimeElapsed = System.currentTimeMillis() - testTimeStart;

              if (outputPredictionsText) {
                classificationOutput.printFooter();
              }
              if (outputPredictionsText) {
                outBuff.append("\n");
              }
              outBuff.append("=== Evaluation on test set ===\n");
              break;

            default:
              throw new Exception("Test mode not implemented");
            }

            if (testMode != 1) {
              String mode = "";
              if (testMode == 2) {
                mode = "test split";
              } else if (testMode == 3) {
                mode = "training data";
              } else if (testMode == 4) {
                mode = "supplied test set";
              }
              outBuff.append("\nTime taken to test model on " + mode + ": "
                + Utils.doubleToString(testTimeElapsed / 1000.0, 2)
                + " seconds\n\n");
=======
              while (source.hasMoreElements(userTestStructure)) {
                instance = source.nextElement(userTestStructure);
                processClassifierPrediction(instance, classifier, eval,
                  predInstances, plotShape, plotSize);
                if (outputPredictionsText) {
                  outBuff.append(predictionText(classifier, instance, jj + 1));
                }
                if ((++jj % 100) == 0) {
                  m_Log
                    .statusMessage(Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_TwentyFirst")
                      + jj
                      + Messages
                        .getInstance()
                        .getString(
                          "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_TwentySecond"));
                }
              }

              if (outputPredictionsText) {
                outBuff.append("\n");
              }
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_ThirtyEighth"));
              break;

            default:
              throw new Exception(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_Exception_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }

            if (outputSummary) {
              outBuff.append(eval.toSummaryString(outputEntropy) + "\n");
            }

            if (inst.attribute(classIndex).isNominal()) {

              if (outputPerClass) {
                outBuff.append(eval.toClassDetailsString() + "\n");
              }

              if (outputConfusion) {
                outBuff.append(eval.toMatrixString() + "\n");
              }
            }

            if ((fullClassifier instanceof Sourcable)
              && m_OutputSourceCode.isSelected()) {
<<<<<<< HEAD
              outBuff.append("=== Source code ===\n\n");
=======
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_OutBuffer_Text_FourtySecond"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              outBuff.append(Evaluation.wekaStaticWrapper(
                ((Sourcable) fullClassifier), m_SourceCodeClass.getText()));
            }

            m_History.updateResult(name);
<<<<<<< HEAD
            m_Log.logMessage("Finished " + cname);
            m_Log.statusMessage("OK");
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane.showMessageDialog(ClassifierPanel.this,
              "Problem evaluating classifier:\n" + ex.getMessage(),
              "Evaluate classifier", JOptionPane.ERROR_MESSAGE);
            m_Log.statusMessage("Problem evaluating classifier");
          } finally {
            try {
              if (!saveVis && outputModel) {
                ArrayList<Object> vv = new ArrayList<Object>();
                vv.add(fullClassifier);
                Instances trainHeader = new Instances(m_Instances, 0);
                trainHeader.setClassIndex(classIndex);
                vv.add(trainHeader);
                if (grph != null) {
                  vv.add(grph);
                }
                m_History.addObject(name, vv);
              } else if (saveVis && plotInstances != null
                && plotInstances.canPlot(false)) {
                m_CurrentVis = new VisualizePanel();
                if (getMainApplication() != null) {
                  Settings settings =
                    getMainApplication().getApplicationSettings();
                  m_CurrentVis.applySettings(settings,
                    weka.gui.explorer.VisualizePanel.ScatterDefaults.ID);
                }
                m_CurrentVis.setName(name + " (" + inst.relationName() + ")");
                m_CurrentVis.setLog(m_Log);
                m_CurrentVis.addPlot(plotInstances.getPlotData(cname));
                // m_CurrentVis.setColourIndex(plotInstances.getPlotInstances().classIndex()+1);
                m_CurrentVis.setColourIndex(plotInstances.getPlotInstances()
                  .classIndex());
                plotInstances.cleanUp();

                ArrayList<Object> vv = new ArrayList<Object>();
                if (outputModel) {
                  vv.add(fullClassifier);
                  Instances trainHeader = new Instances(m_Instances, 0);
                  trainHeader.setClassIndex(classIndex);
                  vv.add(trainHeader);
                  if (grph != null) {
                    vv.add(grph);
                  }
                }
                vv.add(m_CurrentVis);

                if ((eval != null) && (eval.predictions() != null)) {
                  vv.add(eval.predictions());
                  vv.add(inst.classAttribute());
=======
            m_Log.logMessage(Messages.getInstance().getString(
              "ClassifierPanel_StartClassifier_Log_LogMessage_Text_Seventh")
              + cname);
            m_Log
              .statusMessage(Messages
                .getInstance()
                .getString(
                  "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_TwentyThird"));
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane
              .showMessageDialog(
                ClassifierPanel.this,
                Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_JOptionPaneShowMessageDialog_Text_First")
                  + ex.getMessage(),
                Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_JOptionPaneShowMessageDialog_Text_Second"),
                JOptionPane.ERROR_MESSAGE);
            m_Log
              .statusMessage(Messages
                .getInstance()
                .getString(
                  "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_TwentyFourth"));
          } finally {
            try {
              if (!saveVis && outputModel) {
                FastVector vv = new FastVector();
                vv.addElement(fullClassifier);
                Instances trainHeader = new Instances(m_Instances, 0);
                trainHeader.setClassIndex(classIndex);
                vv.addElement(trainHeader);
                if (grph != null) {
                  vv.addElement(grph);
                }
                m_History.addObject(name, vv);
              } else if (saveVis && predInstances != null
                && predInstances.numInstances() > 0) {
                if (predInstances.attribute(predInstances.classIndex())
                  .isNumeric()) {
                  postProcessPlotInfo(plotSize);
                }
                m_CurrentVis = new VisualizePanel();
                m_CurrentVis.setName(name + " (" + inst.relationName() + ")");
                m_CurrentVis.setLog(m_Log);
                PlotData2D tempd = new PlotData2D(predInstances);
                tempd.setShapeSize(plotSize);
                tempd.setShapeType(plotShape);
                tempd.setPlotName(name + " (" + inst.relationName() + ")");
                // tempd.addInstanceNumberAttribute();

                m_CurrentVis.addPlot(tempd);
                // m_CurrentVis.setColourIndex(predInstances.classIndex()+1);
                m_CurrentVis.setColourIndex(predInstances.classIndex());

                FastVector vv = new FastVector();
                if (outputModel) {
                  vv.addElement(fullClassifier);
                  Instances trainHeader = new Instances(m_Instances, 0);
                  trainHeader.setClassIndex(classIndex);
                  vv.addElement(trainHeader);
                  if (grph != null) {
                    vv.addElement(grph);
                  }
                }
                vv.addElement(m_CurrentVis);

                if ((eval != null) && (eval.predictions() != null)) {
                  vv.addElement(eval.predictions());
                  vv.addElement(inst.classAttribute());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                }
                m_History.addObject(name, vv);
              }
            } catch (Exception ex) {
              ex.printStackTrace();
            }

            if (isInterrupted()) {
<<<<<<< HEAD
              m_Log.logMessage("Interrupted " + cname);
              m_Log.statusMessage("Interrupted");
=======
              m_Log.logMessage(Messages.getInstance().getString(
                "ClassifierPanel_StartClassifier_Log_LogMessage_Text_Eighth")
                + cname);
              m_Log
                .statusMessage(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_StartClassifier_Log_StatusMessage_Text_TwentyFourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }

            synchronized (this) {
              m_StartBut.setEnabled(true);
              m_StopBut.setEnabled(false);
              m_RunThread = null;
            }
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskFinished();
            }
          }
        }
      };
      m_RunThread.setPriority(Thread.MIN_PRIORITY);
      m_RunThread.start();
    }
  }

  /**
<<<<<<< HEAD
   * Handles constructing a popup menu with visualization options.
   *
   * @param names the name of the result history list entry clicked on by the
=======
   * generates a prediction row for an instance
   * 
   * @param classifier the classifier to use for making the prediction
   * @param inst the instance to predict
   * @param instNum the index of the instance
   * @throws Exception if something goes wrong
   * @return the generated row
   */
  protected String predictionText(Classifier classifier, Instance inst,
    int instNum) throws Exception {

    // > inst# actual predicted error probability distribution

    StringBuffer text = new StringBuffer();
    // inst #
    text.append(Utils.padLeft("" + instNum, 6) + " ");
    if (inst.classAttribute().isNominal()) {

      // actual
      if (inst.classIsMissing()) {
        text.append(Utils.padLeft("?", 10) + " ");
      } else {
        text.append(Utils.padLeft("" + ((int) inst.classValue() + 1) + ":"
          + inst.stringValue(inst.classAttribute()), 10)
          + " ");
      }

      // predicted
      double[] probdist = null;
      double pred;
      if (inst.classAttribute().isNominal()) {
        probdist = classifier.distributionForInstance(inst);
        pred = Utils.maxIndex(probdist);
        if (probdist[(int) pred] <= 0.0) {
          pred = Instance.missingValue();
        }
      } else {
        pred = classifier.classifyInstance(inst);
      }
      text.append(Utils.padLeft((Instance.isMissingValue(pred) ? "?"
        : (((int) pred + 1) + ":" + inst.classAttribute().value((int) pred))),
        10)
        + " ");
      // error
      if (pred == inst.classValue()) {
        text.append(Utils.padLeft(" ", 6) + " ");
      } else {
        text.append(Utils.padLeft("+", 6) + " ");
      }

      // prob dist
      if (inst.classAttribute().type() == Attribute.NOMINAL) {
        for (int i = 0; i < probdist.length; i++) {
          if (i == (int) pred) {
            text.append(" *");
          } else {
            text.append("  ");
          }
          text.append(Utils.doubleToString(probdist[i], 5, 3));
        }
      }
    } else {

      // actual
      if (inst.classIsMissing()) {
        text.append(Utils.padLeft("?", 10) + " ");
      } else {
        text.append(Utils.doubleToString(inst.classValue(), 10, 3) + " ");
      }

      // predicted
      double pred = classifier.classifyInstance(inst);
      if (Instance.isMissingValue(pred)) {
        text.append(Utils.padLeft("?", 10) + " ");
      } else {
        text.append(Utils.doubleToString(pred, 10, 3) + " ");
      }

      // err
      if (!inst.classIsMissing() && !Instance.isMissingValue(pred)) {
        text.append(Utils.doubleToString(pred - inst.classValue(), 10, 3));
      }
    }

    // additional Attributes
    if (m_OutputAdditionalAttributesRange != null) {
      text.append(" (");
      boolean first = true;
      for (int i = 0; i < inst.numAttributes() - 1; i++) {
        if (m_OutputAdditionalAttributesRange.isInRange(i)) {
          if (!first) {
            text.append(",");
          } else {
            first = false;
          }
          text.append(inst.toString(i));
        }
      }
      text.append(")");
    }

    text.append("\n");
    return text.toString();
  }

  /**
   * Handles constructing a popup menu with visualization options.
   * 
   * @param name the name of the result history list entry clicked on by the
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *          user
   * @param x the x coordinate for popping up the menu
   * @param y the y coordinate for popping up the menu
   */
<<<<<<< HEAD
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
=======
  protected void visualize(String name, int x, int y) {
    final String selectedName = name;
    JPopupMenu resultListMenu = new JPopupMenu();

    JMenuItem visMainBuffer = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisMainBuffer_JMenuItem_Text"));
    if (selectedName != null) {
      visMainBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.setSingle(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
    } else {
      visMainBuffer.setEnabled(false);
    }
    resultListMenu.add(visMainBuffer);

<<<<<<< HEAD
    JMenuItem visSepBuffer = new JMenuItem("View in separate window");
    if (selectedNames != null && selectedNames.size() == 1) {
      visSepBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.openFrame(selectedNames.get(0));
=======
    JMenuItem visSepBuffer = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisSepBuffer_JMenuItem_Text"));
    if (selectedName != null) {
      visSepBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.openFrame(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
    } else {
      visSepBuffer.setEnabled(false);
    }
    resultListMenu.add(visSepBuffer);

<<<<<<< HEAD
    JMenuItem saveOutput = new JMenuItem("Save result buffer");
    if (selectedNames != null && selectedNames.size() == 1) {
      saveOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveBuffer(selectedNames.get(0));
=======
    JMenuItem saveOutput = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_SaveOutput_JMenuItem_Text"));
    if (selectedName != null) {
      saveOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveBuffer(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
    } else {
      saveOutput.setEnabled(false);
    }
    resultListMenu.add(saveOutput);

<<<<<<< HEAD
    JMenuItem deleteOutput = new JMenuItem("Delete result buffer(s)");
    if (selectedNames != null) {
      deleteOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.removeResults(selectedNames);
=======
    JMenuItem deleteOutput = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_DeleteOutput_JMenuItem_Text"));
    if (selectedName != null) {
      deleteOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.removeResult(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
    } else {
      deleteOutput.setEnabled(false);
    }
    resultListMenu.add(deleteOutput);

    resultListMenu.addSeparator();

<<<<<<< HEAD
    JMenuItem loadModel = new JMenuItem("Load model");
=======
    JMenuItem loadModel = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_LoadModel_JMenuItem_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    loadModel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        loadClassifier();
      }
    });
    resultListMenu.add(loadModel);

<<<<<<< HEAD
    ArrayList<Object> o = null;
    if (selectedNames != null && selectedNames.size() == 1) {
      o = (ArrayList<Object>) m_History.getNamedObject(selectedNames.get(0));
=======
    FastVector o = null;
    if (selectedName != null) {
      o = (FastVector) m_History.getNamedObject(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    VisualizePanel temp_vp = null;
    String temp_grph = null;
<<<<<<< HEAD
    ArrayList<Prediction> temp_preds = null;
=======
    FastVector temp_preds = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Attribute temp_classAtt = null;
    Classifier temp_classifier = null;
    Instances temp_trainHeader = null;

    if (o != null) {
      for (int i = 0; i < o.size(); i++) {
<<<<<<< HEAD
        Object temp = o.get(i);
=======
        Object temp = o.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (temp instanceof Classifier) {
          temp_classifier = (Classifier) temp;
        } else if (temp instanceof Instances) { // training header
          temp_trainHeader = (Instances) temp;
        } else if (temp instanceof VisualizePanel) { // normal errors
          temp_vp = (VisualizePanel) temp;
        } else if (temp instanceof String) { // graphable output
          temp_grph = (String) temp;
<<<<<<< HEAD
        } else if (temp instanceof ArrayList<?>) { // predictions
          temp_preds = (ArrayList<Prediction>) temp;
=======
        } else if (temp instanceof FastVector) { // predictions
          temp_preds = (FastVector) temp;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        } else if (temp instanceof Attribute) { // class attribute
          temp_classAtt = (Attribute) temp;
        }
      }
    }

    final VisualizePanel vp = temp_vp;
    final String grph = temp_grph;
<<<<<<< HEAD
    final ArrayList<Prediction> preds = temp_preds;
=======
    final FastVector preds = temp_preds;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    final Attribute classAtt = temp_classAtt;
    final Classifier classifier = temp_classifier;
    final Instances trainHeader = temp_trainHeader;

<<<<<<< HEAD
    JMenuItem saveModel = new JMenuItem("Save model");
    if (classifier != null && selectedNames != null
      && selectedNames.size() == 1) {
      saveModel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveClassifier(selectedNames.get(0), classifier, trainHeader);
=======
    JMenuItem saveModel = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_SaveModel_JMenuItem_Text"));
    if (classifier != null) {
      saveModel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveClassifier(selectedName, classifier, trainHeader);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
    } else {
      saveModel.setEnabled(false);
    }
    resultListMenu.add(saveModel);

<<<<<<< HEAD
    JMenuItem reEvaluate =
      new JMenuItem("Re-evaluate model on current test set");
    if (classifier != null && m_TestLoader != null && selectedNames != null
      && selectedNames.size() == 1) {
      reEvaluate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          reevaluateModel(selectedNames.get(0), classifier, trainHeader);
=======
    JMenuItem reEvaluate = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_ReEvaluate_JMenuItem_Text"));
    if (classifier != null && m_TestLoader != null) {
      reEvaluate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          reevaluateModel(selectedName, classifier, trainHeader);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      });
    } else {
      reEvaluate.setEnabled(false);
    }
    resultListMenu.add(reEvaluate);

<<<<<<< HEAD
    JMenuItem reApplyConfig =
      new JMenuItem("Re-apply this model's configuration");
    if (classifier != null && selectedNames != null
      && selectedNames.size() == 1) {
      reApplyConfig.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_ClassifierEditor.setValue(classifier);
        }
      });
    } else {
      reApplyConfig.setEnabled(false);
    }
    resultListMenu.add(reApplyConfig);

    resultListMenu.addSeparator();

    JMenuItem visErrors = new JMenuItem("Visualize classifier errors");
=======
    resultListMenu.addSeparator();

    JMenuItem visErrors = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisErrors_JMenuItem_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (vp != null) {
      if ((vp.getXIndex() == 0) && (vp.getYIndex() == 1)) {
        try {
          vp.setXIndex(vp.getInstances().classIndex()); // class
          vp.setYIndex(vp.getInstances().classIndex() - 1); // predicted class
        } catch (Exception e) {
          // ignored
        }
      }
      visErrors.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          visualizeClassifierErrors(vp);
        }
      });
    } else {
      visErrors.setEnabled(false);
    }
    resultListMenu.add(visErrors);

<<<<<<< HEAD
    JMenuItem visGrph = new JMenuItem("Visualize tree");
=======
    JMenuItem visGrph = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisGrph_JMenuItem_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (grph != null) {
      if (((Drawable) temp_classifier).graphType() == Drawable.TREE) {
        visGrph.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            String title;
            if (vp != null) {
              title = vp.getName();
            } else {
<<<<<<< HEAD
              title = selectedNames.get(0);
=======
              title = selectedName;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }
            visualizeTree(grph, title);
          }
        });
      } else if (((Drawable) temp_classifier).graphType() == Drawable.BayesNet) {
<<<<<<< HEAD
        visGrph.setText("Visualize graph");
=======
        visGrph.setText(Messages.getInstance().getString(
          "ClassifierPanel_Visualize_VisGrph_JMenuItem_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        visGrph.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            Thread th = new Thread() {
              @Override
              public void run() {
<<<<<<< HEAD
                visualizeBayesNet(grph, selectedNames.get(0));
=======
                visualizeBayesNet(grph, selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
            };
            th.start();
          }
        });
      } else {
        visGrph.setEnabled(false);
      }
    } else {
      visGrph.setEnabled(false);
    }
    resultListMenu.add(visGrph);

<<<<<<< HEAD
    JMenuItem visMargin = new JMenuItem("Visualize margin curve");
    if ((preds != null) && (classAtt != null) && (classAtt.isNominal())) {
=======
    JMenuItem visMargin = new JMenuItem(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisMargin_JMenuItem_Text"));
    if (preds != null) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      visMargin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          try {
            MarginCurve tc = new MarginCurve();
            Instances result = tc.getCurve(preds);
            VisualizePanel vmc = new VisualizePanel();
<<<<<<< HEAD
            if (getMainApplication() != null) {
              Settings settings = getMainApplication().getApplicationSettings();
              m_CurrentVis.applySettings(settings,
                weka.gui.explorer.VisualizePanel.ScatterDefaults.ID);
            }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            vmc.setName(result.relationName());
            vmc.setLog(m_Log);
            PlotData2D tempd = new PlotData2D(result);
            tempd.setPlotName(result.relationName());
            tempd.addInstanceNumberAttribute();
            vmc.addPlot(tempd);
            visualizeClassifierErrors(vmc);
          } catch (Exception ex) {
            ex.printStackTrace();
          }
        }
      });
    } else {
      visMargin.setEnabled(false);
    }
    resultListMenu.add(visMargin);

<<<<<<< HEAD
    JMenu visThreshold = new JMenu("Visualize threshold curve");
    if ((preds != null) && (classAtt != null) && (classAtt.isNominal())) {
=======
    JMenu visThreshold = new JMenu(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisThreshold_JMenu_Text"));
    if (preds != null && classAtt != null) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      for (int i = 0; i < classAtt.numValues(); i++) {
        JMenuItem clv = new JMenuItem(classAtt.value(i));
        final int classValue = i;
        clv.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              ThresholdCurve tc = new ThresholdCurve();
              Instances result = tc.getCurve(preds, classValue);
              // VisualizePanel vmc = new VisualizePanel();
              ThresholdVisualizePanel vmc = new ThresholdVisualizePanel();
<<<<<<< HEAD
              vmc.setROCString("(Area under ROC = "
                + Utils.doubleToString(ThresholdCurve.getROCArea(result), 4)
                + ")");
              vmc.setLog(m_Log);
              vmc.setName(result.relationName() + ". (Class value "
                + classAtt.value(classValue) + ")");
=======
              vmc.setROCString(Messages.getInstance().getString(
                "ClassifierPanel_Visualize_VMC_SetROCString_Text_First")
                + Utils.doubleToString(ThresholdCurve.getROCArea(result), 4)
                + Messages.getInstance().getString(
                  "ClassifierPanel_Visualize_VMC_SetROCString_Text_Second"));
              vmc.setLog(m_Log);
              vmc.setName(result.relationName()
                + Messages.getInstance().getString(
                  "ClassifierPanel_Visualize_VMC_SetName_Text_First")
                + classAtt.value(classValue)
                + Messages.getInstance().getString(
                  "ClassifierPanel_Visualize_VMC_SetName_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              PlotData2D tempd = new PlotData2D(result);
              tempd.setPlotName(result.relationName());
              tempd.addInstanceNumberAttribute();
              // specify which points are connected
              boolean[] cp = new boolean[result.numInstances()];
              for (int n = 1; n < cp.length; n++) {
                cp[n] = true;
              }
              tempd.setConnectPoints(cp);
              // add plot
              vmc.addPlot(tempd);
              visualizeClassifierErrors(vmc);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
        });
        visThreshold.add(clv);
      }
    } else {
      visThreshold.setEnabled(false);
    }
    resultListMenu.add(visThreshold);

<<<<<<< HEAD
    JMenu visCostBenefit = new JMenu("Cost/Benefit analysis");
=======
    JMenu visCostBenefit = new JMenu(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisCostBenefit_JMenu_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if ((preds != null) && (classAtt != null) && (classAtt.isNominal())) {
      for (int i = 0; i < classAtt.numValues(); i++) {
        JMenuItem clv = new JMenuItem(classAtt.value(i));
        final int classValue = i;
        clv.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              ThresholdCurve tc = new ThresholdCurve();
              Instances result = tc.getCurve(preds, classValue);

              // Create a dummy class attribute with the chosen
              // class value as index 0 (if necessary).
              Attribute classAttToUse = classAtt;
              if (classValue != 0) {
<<<<<<< HEAD
                ArrayList<String> newNames = new ArrayList<String>();
                newNames.add(classAtt.value(classValue));
                for (int k = 0; k < classAtt.numValues(); k++) {
                  if (k != classValue) {
                    newNames.add(classAtt.value(k));
=======
                FastVector newNames = new FastVector();
                newNames.addElement(classAtt.value(classValue));
                for (int k = 0; k < classAtt.numValues(); k++) {
                  if (k != classValue) {
                    newNames.addElement(classAtt.value(k));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                  }
                }
                classAttToUse = new Attribute(classAtt.name(), newNames);
              }

              CostBenefitAnalysis cbAnalysis = new CostBenefitAnalysis();

              PlotData2D tempd = new PlotData2D(result);
              tempd.setPlotName(result.relationName());
              tempd.m_alwaysDisplayPointsOfThisSize = 10;
              // specify which points are connected
              boolean[] cp = new boolean[result.numInstances()];
              for (int n = 1; n < cp.length; n++) {
                cp[n] = true;
              }
              tempd.setConnectPoints(cp);

              String windowTitle = "";
              if (classifier != null) {
                String cname = classifier.getClass().getName();
                if (cname.startsWith("weka.classifiers.")) {
<<<<<<< HEAD
                  windowTitle =
                    "" + cname.substring("weka.classifiers.".length()) + " ";
                }
              }
              windowTitle += " (class = " + classAttToUse.value(0) + ")";
=======
                  windowTitle = ""
                    + cname.substring("weka.classifiers.".length()) + " ";
                }
              }
              windowTitle += Messages.getInstance().getString(
                "ClassifierPanel_Visualize_WindowTitle_Text_First")
                + classAttToUse.value(0)
                + Messages.getInstance().getString(
                  "ClassifierPanel_Visualize_WindowTitle_Text_Second");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

              // add plot
              cbAnalysis.setCurveData(tempd, classAttToUse);
              visualizeCostBenefitAnalysis(cbAnalysis, windowTitle);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
        });
        visCostBenefit.add(clv);
      }
    } else {
      visCostBenefit.setEnabled(false);
    }
    resultListMenu.add(visCostBenefit);

<<<<<<< HEAD
    JMenu visCost = new JMenu("Visualize cost curve");
    if ((preds != null) && (classAtt != null) && (classAtt.isNominal())) {
=======
    JMenu visCost = new JMenu(Messages.getInstance().getString(
      "ClassifierPanel_VisCost_JMenu_Text"));
    if (preds != null && classAtt != null) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      for (int i = 0; i < classAtt.numValues(); i++) {
        JMenuItem clv = new JMenuItem(classAtt.value(i));
        final int classValue = i;
        clv.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              CostCurve cc = new CostCurve();
              Instances result = cc.getCurve(preds, classValue);
              VisualizePanel vmc = new VisualizePanel();
<<<<<<< HEAD
              if (getMainApplication() != null) {
                Settings settings =
                  getMainApplication().getApplicationSettings();
                m_CurrentVis.applySettings(settings,
                  weka.gui.explorer.VisualizePanel.ScatterDefaults.ID);
              }
              vmc.setLog(m_Log);
              vmc.setName(result.relationName() + ". (Class value "
                + classAtt.value(classValue) + ")");
=======
              vmc.setLog(m_Log);
              vmc.setName(result.relationName()
                + Messages.getInstance().getString(
                  "ClassifierPanel_Visualize_VMC_SetName_Text_Third")
                + classAtt.value(classValue)
                + Messages.getInstance().getString(
                  "ClassifierPanel_Visualize_VMC_SetName_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              PlotData2D tempd = new PlotData2D(result);
              tempd.m_displayAllPoints = true;
              tempd.setPlotName(result.relationName());
              boolean[] connectPoints = new boolean[result.numInstances()];
              for (int jj = 1; jj < connectPoints.length; jj += 2) {
                connectPoints[jj] = true;
              }
              tempd.setConnectPoints(connectPoints);
              // tempd.addInstanceNumberAttribute();
              vmc.addPlot(tempd);
              visualizeClassifierErrors(vmc);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
        });
        visCost.add(clv);
      }
    } else {
      visCost.setEnabled(false);
    }
    resultListMenu.add(visCost);

<<<<<<< HEAD
    // visualization plugins
    JMenu visPlugins = new JMenu("Plugins");
    boolean availablePlugins = false;

    // predictions
    List<String> pluginsVector =
      PluginManager.getPluginNamesOfTypeList(VisualizePlugin.class.getName());
    for (int i = 0; i < pluginsVector.size(); i++) {
      String className = (pluginsVector.get(i));
      try {
        VisualizePlugin plugin =
          (VisualizePlugin) WekaPackageClassLoaderManager
            .objectForName(className);
        // (VisualizePlugin) Class.forName(className).newInstance();
=======
    JMenu visPlugins = new JMenu(Messages.getInstance().getString(
      "ClassifierPanel_Visualize_VisPlugins_JMenu_Text"));
    Vector pluginsVector = GenericObjectEditor
      .getClassnames(VisualizePlugin.class.getName());
    boolean availablePlugins = false;

    for (int i = 0; i < pluginsVector.size(); i++) {
      String className = (String) (pluginsVector.elementAt(i));
      try {
        VisualizePlugin plugin = (VisualizePlugin) Class.forName(className)
          .newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (plugin == null) {
          continue;
        }
        availablePlugins = true;
        JMenuItem pluginMenuItem = plugin.getVisualizeMenuItem(preds, classAtt);
<<<<<<< HEAD
        new Version();
=======
        Version version = new Version();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (pluginMenuItem != null) {
          /*
           * if (version.compareTo(plugin.getMinVersion()) < 0)
           * pluginMenuItem.setText(pluginMenuItem.getText() +
<<<<<<< HEAD
           * " (weka outdated)"); if (version.compareTo(plugin.getMaxVersion())
           * >= 0) pluginMenuItem.setText(pluginMenuItem.getText() +
           * " (plugin outdated)");
           */
          visPlugins.add(pluginMenuItem);
        }
      } catch (Exception e) {
        // e.printStackTrace();
      }
    }

    // errros
    pluginsVector =
      PluginManager.getPluginNamesOfTypeList(ErrorVisualizePlugin.class.getName());
    for (int i = 0; i < pluginsVector.size(); i++) {
      String className = (pluginsVector.get(i));
      try {
        ErrorVisualizePlugin plugin =
          (ErrorVisualizePlugin) WekaPackageClassLoaderManager
            .objectForName(className);
        // (ErrorVisualizePlugin) Class.forName(className).newInstance();
=======
           * Messages.getInstance().getString(
           * "ClassifierPanel_Visualize_PluginMenuItemSetText_Text_First")); if
           * (version.compareTo(plugin.getMaxVersion()) >= 0)
           * pluginMenuItem.setText(pluginMenuItem.getText() +
           * Messages.getInstance().getString(
           * "ClassifierPanel_Visualize_PluginMenuItemSetText_Text_Second"));
           */
          visPlugins.add(pluginMenuItem);
        }
      } catch (ClassNotFoundException cnfe) {
        // System.out.println("Visualize plugin ClassNotFoundException " +
        // cnfe.getMessage());
      } catch (InstantiationException ie) {
        // System.out.println("Visualize plugin InstantiationException " +
        // ie.getMessage());
      } catch (IllegalAccessException iae) {
        // System.out.println("Visualize plugin IllegalAccessException " +
        // iae.getMessage());
      }
    }

    // errors
    pluginsVector = GenericObjectEditor
      .getClassnames(ErrorVisualizePlugin.class.getName());
    for (int i = 0; i < pluginsVector.size(); i++) {
      String className = (String) (pluginsVector.elementAt(i));
      try {
        ErrorVisualizePlugin plugin = (ErrorVisualizePlugin) Class.forName(
          className).newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (plugin == null) {
          continue;
        }
        availablePlugins = true;
<<<<<<< HEAD
        JMenuItem pluginMenuItem =
          plugin.getVisualizeMenuItem(vp.getInstances());
        new Version();
=======
        JMenuItem pluginMenuItem = plugin.getVisualizeMenuItem(vp
          .getInstances());
        Version version = new Version();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (pluginMenuItem != null) {
          /*
           * if (version.compareTo(plugin.getMinVersion()) < 0)
           * pluginMenuItem.setText(pluginMenuItem.getText() +
           * " (weka outdated)"); if (version.compareTo(plugin.getMaxVersion())
           * >= 0) pluginMenuItem.setText(pluginMenuItem.getText() +
           * " (plugin outdated)");
           */
          visPlugins.add(pluginMenuItem);
        }
      } catch (Exception e) {
        // e.printStackTrace();
      }
    }

    // graphs+trees
    if (grph != null) {
      // trees
      if (((Drawable) temp_classifier).graphType() == Drawable.TREE) {
<<<<<<< HEAD
        pluginsVector =
          PluginManager.getPluginNamesOfTypeList(TreeVisualizePlugin.class.getName());
        for (int i = 0; i < pluginsVector.size(); i++) {
          String className = (pluginsVector.get(i));
          try {
            TreeVisualizePlugin plugin =
              (TreeVisualizePlugin) WekaPackageClassLoaderManager
                .objectForName(className);
            // (TreeVisualizePlugin) Class.forName(className).newInstance();
=======
        pluginsVector = GenericObjectEditor
          .getClassnames(TreeVisualizePlugin.class.getName());
        for (int i = 0; i < pluginsVector.size(); i++) {
          String className = (String) (pluginsVector.elementAt(i));
          try {
            TreeVisualizePlugin plugin = (TreeVisualizePlugin) Class.forName(
              className).newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (plugin == null) {
              continue;
            }
            availablePlugins = true;
<<<<<<< HEAD
            JMenuItem pluginMenuItem =
              plugin.getVisualizeMenuItem(grph, selectedNames.get(0));
            new Version();
=======
            JMenuItem pluginMenuItem = plugin.getVisualizeMenuItem(grph,
              selectedName);
            Version version = new Version();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (pluginMenuItem != null) {
              /*
               * if (version.compareTo(plugin.getMinVersion()) < 0)
               * pluginMenuItem.setText(pluginMenuItem.getText() +
               * " (weka outdated)"); if
               * (version.compareTo(plugin.getMaxVersion()) >= 0)
               * pluginMenuItem.setText(pluginMenuItem.getText() +
               * " (plugin outdated)");
               */
              visPlugins.add(pluginMenuItem);
            }
          } catch (Exception e) {
            // e.printStackTrace();
          }
        }
      }
      // graphs
      else {
<<<<<<< HEAD
        pluginsVector =
          PluginManager.getPluginNamesOfTypeList(GraphVisualizePlugin.class.getName());
        for (int i = 0; i < pluginsVector.size(); i++) {
          String className = (pluginsVector.get(i));
          try {
            GraphVisualizePlugin plugin =
              (GraphVisualizePlugin) WekaPackageClassLoaderManager
                .objectForName(className);
            // (GraphVisualizePlugin) Class.forName(className).newInstance();
=======
        pluginsVector = GenericObjectEditor
          .getClassnames(GraphVisualizePlugin.class.getName());
        for (int i = 0; i < pluginsVector.size(); i++) {
          String className = (String) (pluginsVector.elementAt(i));
          try {
            GraphVisualizePlugin plugin = (GraphVisualizePlugin) Class.forName(
              className).newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (plugin == null) {
              continue;
            }
            availablePlugins = true;
<<<<<<< HEAD
            JMenuItem pluginMenuItem =
              plugin.getVisualizeMenuItem(grph, selectedNames.get(0));
            new Version();
=======
            JMenuItem pluginMenuItem = plugin.getVisualizeMenuItem(grph,
              selectedName);
            Version version = new Version();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (pluginMenuItem != null) {
              /*
               * if (version.compareTo(plugin.getMinVersion()) < 0)
               * pluginMenuItem.setText(pluginMenuItem.getText() +
               * " (weka outdated)"); if
               * (version.compareTo(plugin.getMaxVersion()) >= 0)
               * pluginMenuItem.setText(pluginMenuItem.getText() +
               * " (plugin outdated)");
               */
              visPlugins.add(pluginMenuItem);
            }
          } catch (Exception e) {
            // e.printStackTrace();
          }
        }
      }
    }

    if (availablePlugins) {
      resultListMenu.add(visPlugins);
    }

    resultListMenu.show(m_History.getList(), x, y);
  }

  /**
   * Pops up a TreeVisualizer for the classifier from the currently selected
<<<<<<< HEAD
   * item in the results list.
   *
=======
   * item in the results list
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param dottyString the description of the tree in dotty format
   * @param treeName the title to assign to the display
   */
  protected void visualizeTree(String dottyString, String treeName) {
<<<<<<< HEAD
    final javax.swing.JFrame jf =
            Utils.getWekaJFrame("Weka Classifier Tree Visualizer: " + treeName, this);
=======
    final javax.swing.JFrame jf = new javax.swing.JFrame(Messages.getInstance()
      .getString("ClassifierPanel_VisualizeTree_JF_JFrame_Text") + treeName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    jf.setSize(500, 400);
    jf.getContentPane().setLayout(new BorderLayout());
    TreeVisualizer tv = new TreeVisualizer(null, dottyString, new PlaceNode2());
    jf.getContentPane().add(tv, BorderLayout.CENTER);
    jf.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent e) {
        jf.dispose();
      }
    });
<<<<<<< HEAD
    jf.pack();
    jf.setSize(800, 600);
    jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    jf.setVisible(true);
    tv.fitToScreen();
  }

  /**
   * Pops up a GraphVisualizer for the BayesNet classifier from the currently
<<<<<<< HEAD
   * selected item in the results list.
   *
=======
   * selected item in the results list
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param XMLBIF the description of the graph in XMLBIF ver. 0.3
   * @param graphName the name of the graph
   */
  protected void visualizeBayesNet(String XMLBIF, String graphName) {
<<<<<<< HEAD
    final javax.swing.JFrame jf =
      Utils.getWekaJFrame("Weka Classifier Graph Visualizer: " + graphName, this);
=======
    final javax.swing.JFrame jf = new javax.swing.JFrame(Messages.getInstance()
      .getString("ClassifierPanel_VisualizeBayesNet_JF_JFrame_Text")
      + graphName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    jf.setSize(500, 400);
    jf.getContentPane().setLayout(new BorderLayout());
    GraphVisualizer gv = new GraphVisualizer();
    try {
      gv.readBIF(XMLBIF);
    } catch (BIFFormatException be) {
<<<<<<< HEAD
      System.err.println("unable to visualize BayesNet");
=======
      System.err.println(Messages.getInstance().getString(
        "ClassifierPanel_VisualizeBayesNet_Error_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      be.printStackTrace();
    }
    gv.layoutGraph();

    jf.getContentPane().add(gv, BorderLayout.CENTER);
    jf.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent e) {
        jf.dispose();
      }
    });

<<<<<<< HEAD
    jf.pack();
    jf.setSize(800, 600);
    jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    jf.setVisible(true);
  }

  /**
<<<<<<< HEAD
   * Pops up the Cost/Benefit analysis panel.
   *
   * @param cb the CostBenefitAnalysis panel to pop up
   */
  protected void visualizeCostBenefitAnalysis(CostBenefitAnalysis cb,
    String classifierAndRelationName) {
    if (cb != null) {
      String windowTitle = "Weka Classifier: Cost/Benefit Analysis ";
      if (classifierAndRelationName != null) {
        windowTitle += "- " + classifierAndRelationName;
      }
      final javax.swing.JFrame jf = Utils.getWekaJFrame(windowTitle, this);
      jf.getContentPane().setLayout(new BorderLayout());

      jf.getContentPane().add(cb, BorderLayout.CENTER);
=======
   * Pops up a VisualizePanel for visualizing the data and errors for the
   * classifier from the currently selected item in the results list
   * 
   * @param sp the VisualizePanel to pop up.
   */
  protected void visualizeClassifierErrors(VisualizePanel sp) {

    if (sp != null) {
      String plotName = sp.getName();
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages
        .getInstance().getString(
          "ClassifierPanel_VisualizeClassifierErrors_JF_JFrame_Text")
        + plotName);
      jf.setSize(600, 400);
      jf.getContentPane().setLayout(new BorderLayout());

      jf.getContentPane().add(sp, BorderLayout.CENTER);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });
<<<<<<< HEAD
      jf.pack();
      jf.setSize(1024, 700);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      jf.setVisible(true);
    }
  }

  /**
<<<<<<< HEAD
   * Pops up a VisualizePanel for visualizing the data and errors for the
   * classifier from the currently selected item in the results list.
   *
   * @param sp the VisualizePanel to pop up.
   */
  protected void visualizeClassifierErrors(VisualizePanel sp) {

    if (sp != null) {
      String plotName = sp.getName();
      final javax.swing.JFrame jf =
        Utils.getWekaJFrame("Weka Classifier Visualize: " + plotName, this);
      jf.getContentPane().setLayout(new BorderLayout());

      jf.getContentPane().add(sp, BorderLayout.CENTER);
=======
   * Pops up the Cost/Benefit analysis panel.
   * 
   * @param cb the CostBenefitAnalysis panel to pop up
   */
  protected void visualizeCostBenefitAnalysis(CostBenefitAnalysis cb,
    String classifierAndRelationName) {
    if (cb != null) {
      String windowTitle = Messages.getInstance().getString(
        "ClassifierPanel_VisualizeCostBenefitAnalysis_WindowTitle_Text");
      if (classifierAndRelationName != null) {
        windowTitle += "- " + classifierAndRelationName;
      }
      final javax.swing.JFrame jf = new javax.swing.JFrame(windowTitle);
      jf.setSize(1000, 600);
      jf.getContentPane().setLayout(new BorderLayout());

      jf.getContentPane().add(cb, BorderLayout.CENTER);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });

<<<<<<< HEAD
      jf.pack();
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.setVisible(true);
    }
  }

  /**
   * Save the currently selected classifier output to a file.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param name the name of the buffer to save
   */
  protected void saveBuffer(String name) {
    StringBuffer sb = m_History.getNamedBuffer(name);
    if (sb != null) {
      if (m_SaveOut.save(sb)) {
<<<<<<< HEAD
        m_Log.logMessage("Save successful.");
=======
        m_Log.logMessage(Messages.getInstance().getString(
          "ClassifierPanel_SaveBuffer_Log_LogMessage_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Stops the currently running classifier (if any).
   */
<<<<<<< HEAD
  @SuppressWarnings("deprecation")
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected void stopClassifier() {

    if (m_RunThread != null) {
      m_RunThread.interrupt();

      // This is deprecated (and theoretically the interrupt should do).
      m_RunThread.stop();
    }
  }

  /**
<<<<<<< HEAD
   * Saves the currently selected classifier.
   *
=======
   * Saves the currently selected classifier
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param name the name of the run
   * @param classifier the classifier to save
   * @param trainHeader the header of the training instances
   */
<<<<<<< HEAD
  public void saveClassifier(String name, Classifier classifier,
=======
  protected void saveClassifier(String name, Classifier classifier,
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances trainHeader) {

    File sFile = null;
    boolean saveOK = true;

    m_FileChooser.removeChoosableFileFilter(m_PMMLModelFilter);
    m_FileChooser.setFileFilter(m_ModelFilter);
    int returnVal = m_FileChooser.showSaveDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      sFile = m_FileChooser.getSelectedFile();
      if (!sFile.getName().toLowerCase().endsWith(MODEL_FILE_EXTENSION)) {
<<<<<<< HEAD
        sFile =
          new File(sFile.getParent(), sFile.getName() + MODEL_FILE_EXTENSION);
      }
      m_Log.statusMessage("Saving model to file...");
=======
        sFile = new File(sFile.getParent(), sFile.getName()
          + MODEL_FILE_EXTENSION);
      }
      m_Log.statusMessage(Messages.getInstance().getString(
        "ClassifierPanel_SaveClassifier_Log_StatusMessage_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      try {
        OutputStream os = new FileOutputStream(sFile);
        if (sFile.getName().endsWith(".gz")) {
          os = new GZIPOutputStream(os);
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
        objectOutputStream.writeObject(classifier);
        trainHeader = trainHeader.stringFreeStructure();
        if (trainHeader != null) {
          objectOutputStream.writeObject(trainHeader);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
      } catch (Exception e) {

<<<<<<< HEAD
        JOptionPane.showMessageDialog(null, e, "Save Failed",
          JOptionPane.ERROR_MESSAGE);
        saveOK = false;
      }
      if (saveOK) {
        m_Log.logMessage("Saved model (" + name + ") to file '"
          + sFile.getName() + "'");
      }
      m_Log.statusMessage("OK");
=======
        JOptionPane
          .showMessageDialog(
            null,
            e,
            Messages
              .getInstance()
              .getString(
                "ClassifierPanel_SaveClassifier_JOptionPaneShowMessageDialog_Text_First"),
            JOptionPane.ERROR_MESSAGE);
        saveOK = false;
      }
      if (saveOK) {
        m_Log.logMessage(Messages.getInstance().getString(
          "ClassifierPanel_SaveClassifier_Log_LogMessage_Text_First")
          + name
          + Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_Log_LogMessage_Text_Second")
          + sFile.getName()
          + Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_Log_LogMessage_Text_Third"));
      }
      m_Log.statusMessage(Messages.getInstance().getString(
        "ClassifierPanel_SaveClassifier_JOptionPaneShowMessageDialog_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Loads a classifier.
=======
   * Loads a classifier
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void loadClassifier() {

    m_FileChooser.addChoosableFileFilter(m_PMMLModelFilter);
    m_FileChooser.setFileFilter(m_ModelFilter);
    int returnVal = m_FileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File selected = m_FileChooser.getSelectedFile();
      Classifier classifier = null;
      Instances trainHeader = null;

<<<<<<< HEAD
      m_Log.statusMessage("Loading model from file...");
=======
      m_Log.statusMessage(Messages.getInstance().getString(
        "ClassifierPanel_LoadClassifier_Log_StatusMessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      try {
        InputStream is = new FileInputStream(selected);
        if (selected.getName().endsWith(PMML_FILE_EXTENSION)) {
          PMMLModel model = PMMLFactory.getPMMLModel(is, m_Log);
          if (model instanceof PMMLClassifier) {
            classifier = (PMMLClassifier) model;
            /*
             * trainHeader = ((PMMLClassifier)classifier).getMiningSchema().
             * getMiningSchemaAsInstances();
             */
          } else {
<<<<<<< HEAD
            throw new Exception(
              "PMML model is not a classification/regression model!");
=======
            throw new Exception(Messages.getInstance().getString(
              "ClassifierPanel_LoadClassifier_Exception_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          }
        } else {
          if (selected.getName().endsWith(".gz")) {
            is = new GZIPInputStream(is);
          }
<<<<<<< HEAD
          // ObjectInputStream objectInputStream = new ObjectInputStream(is);
          ObjectInputStream objectInputStream =
            SerializationHelper.getObjectInputStream(is);
=======
          ObjectInputStream objectInputStream = new ObjectInputStream(is);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          classifier = (Classifier) objectInputStream.readObject();
          try { // see if we can load the header
            trainHeader = (Instances) objectInputStream.readObject();
          } catch (Exception e) {
          } // don't fuss if we can't
          objectInputStream.close();
        }
      } catch (Exception e) {

<<<<<<< HEAD
        JOptionPane.showMessageDialog(null, e, "Load Failed",
          JOptionPane.ERROR_MESSAGE);
      }

      m_Log.statusMessage("OK");

      if (classifier != null) {
        m_Log.logMessage("Loaded model from file '" + selected.getName() + "'");
=======
        JOptionPane
          .showMessageDialog(
            null,
            e,
            Messages
              .getInstance()
              .getString(
                "ClassifierPanel_LoadClassifier_JOptionPaneShowMessageDialog_Text"),
            JOptionPane.ERROR_MESSAGE);
      }

      m_Log.statusMessage(Messages.getInstance().getString(
        "ClassifierPanel_LoadClassifier_Log_StatusMessage_Text_Second"));

      if (classifier != null) {
        m_Log.logMessage(Messages.getInstance().getString(
          "ClassifierPanel_SaveClassifier_Log_LogMessage_Text_Fourth")
          + selected.getName()
          + Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_Log_LogMessage_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        String name = (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
        String cname = classifier.getClass().getName();
        if (cname.startsWith("weka.classifiers.")) {
          cname = cname.substring("weka.classifiers.".length());
        }
<<<<<<< HEAD
        name += cname + " from file '" + selected.getName() + "'";
        StringBuffer outBuff = new StringBuffer();

        outBuff.append("=== Model information ===\n\n");
        outBuff.append("Filename:     " + selected.getName() + "\n");
        outBuff.append("Scheme:       " + classifier.getClass().getName());
=======
        name += cname
          + Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_Name_Text_First")
          + selected.getName()
          + Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_Name_Text_Second");
        StringBuffer outBuff = new StringBuffer();

        outBuff.append(Messages.getInstance().getString(
          "ClassifierPanel_SaveClassifier_OutBuffer_Text_First"));
        outBuff.append(Messages.getInstance().getString(
          "ClassifierPanel_SaveClassifier_OutBuffer_Text_Second")
          + selected.getName() + "\n");
        outBuff.append(Messages.getInstance().getString(
          "ClassifierPanel_SaveClassifier_OutBuffer_Text_Fourth")
          + classifier.getClass().getName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (classifier instanceof OptionHandler) {
          String[] o = ((OptionHandler) classifier).getOptions();
          outBuff.append(" " + Utils.joinOptions(o));
        }
        outBuff.append("\n");
        if (trainHeader != null) {
<<<<<<< HEAD
          outBuff.append("Relation:     " + trainHeader.relationName() + '\n');
          outBuff.append("Attributes:   " + trainHeader.numAttributes() + '\n');
=======
          outBuff.append(Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_OutBuffer_Text_Fifth")
            + trainHeader.relationName() + '\n');
          outBuff.append(Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_OutBuffer_Text_Seventh")
            + trainHeader.numAttributes() + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (trainHeader.numAttributes() < 100) {
            for (int i = 0; i < trainHeader.numAttributes(); i++) {
              outBuff.append("              " + trainHeader.attribute(i).name()
                + '\n');
            }
          } else {
<<<<<<< HEAD
            outBuff.append("              [list of attributes omitted]\n");
          }
        } else {
          outBuff.append("\nTraining data unknown\n");
        }

        outBuff.append("\n=== Classifier model ===\n\n");
=======
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_SaveClassifier_OutBuffer_Text_Nineth"));
          }
        } else {
          outBuff.append(Messages.getInstance().getString(
            "ClassifierPanel_SaveClassifier_OutBuffer_Text_Tenth"));
        }

        outBuff.append(Messages.getInstance().getString(
          "ClassifierPanel_SaveClassifier_OutBuffer_Text_Eleventh"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        outBuff.append(classifier.toString() + "\n");

        m_History.addResult(name, outBuff);
        m_History.setSingle(name);
<<<<<<< HEAD
        ArrayList<Object> vv = new ArrayList<Object>();
        vv.add(classifier);
        if (trainHeader != null) {
          vv.add(trainHeader);
=======
        FastVector vv = new FastVector();
        vv.addElement(classifier);
        if (trainHeader != null) {
          vv.addElement(trainHeader);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
        // allow visualization of graphable classifiers
        String grph = null;
        if (classifier instanceof Drawable) {
          try {
            grph = ((Drawable) classifier).graph();
          } catch (Exception ex) {
          }
        }
        if (grph != null) {
<<<<<<< HEAD
          vv.add(grph);
=======
          vv.addElement(grph);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }

        m_History.addObject(name, vv);
      }
    }
  }

  /**
   * Re-evaluates the named classifier with the current test set. Unpredictable
   * things will happen if the data set is not compatible with the classifier.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param name the name of the classifier entry
   * @param classifier the classifier to evaluate
   * @param trainHeader the header of the training set
   */
  protected void reevaluateModel(final String name,
    final Classifier classifier, final Instances trainHeader) {

    if (m_RunThread == null) {
      synchronized (this) {
        m_StartBut.setEnabled(false);
        m_StopBut.setEnabled(true);
      }
      m_RunThread = new Thread() {
        @Override
        public void run() {
          // Copy the current state of things
<<<<<<< HEAD
          m_Log.statusMessage("Setting up...");
          Classifier classifierToUse = classifier;
=======
          m_Log.statusMessage(Messages.getInstance().getString(
            "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

          StringBuffer outBuff = m_History.getNamedBuffer(name);
          DataSource source = null;
          Instances userTestStructure = null;
<<<<<<< HEAD
          ClassifierErrorsPlotInstances plotInstances = null;

          CostMatrix costMatrix = null;
          if (m_EvalWRTCostsBut.isSelected()) {
            costMatrix =
              new CostMatrix((CostMatrix) m_CostMatrixEditor.getValue());
=======
          // additional vis info (either shape type or point size)
          FastVector plotShape = new FastVector();
          FastVector plotSize = new FastVector();
          Instances predInstances = null;

          CostMatrix costMatrix = null;
          if (m_EvalWRTCostsBut.isSelected()) {
            costMatrix = new CostMatrix(
              (CostMatrix) m_CostMatrixEditor.getValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          }
          boolean outputConfusion = m_OutputConfusionBut.isSelected();
          boolean outputPerClass = m_OutputPerClassBut.isSelected();
          boolean outputSummary = true;
          boolean outputEntropy = m_OutputEntropyBut.isSelected();
          boolean saveVis = m_StorePredictionsBut.isSelected();
<<<<<<< HEAD
          boolean outputPredictionsText =
            (m_ClassificationOutputEditor.getValue().getClass() != Null.class);
=======
          boolean outputPredictionsText = m_OutputPredictionsTextBut
            .isSelected();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          String grph = null;
          Evaluation eval = null;

          try {

<<<<<<< HEAD
            boolean incrementalLoader =
              (m_TestLoader instanceof IncrementalConverter);
            if (m_TestLoader != null && m_TestLoader.getStructure() != null) {
              m_TestLoader.reset();
              if (classifierToUse instanceof BatchPredictor
                && ((BatchPredictor) classifierToUse)
                  .implementsMoreEfficientBatchPrediction()
                && m_TestLoader instanceof ArffLoader) {
                ((ArffLoader) m_TestLoader).setRetainStringVals(true);
              }
              source = new DataSource(m_TestLoader);
              userTestStructure = source.getStructure();
              userTestStructure.setClassIndex(m_TestClassIndex);
            }
            // Check the test instance compatibility
            if (source == null) {
              throw new Exception("No user test set has been specified");
            }
            if (trainHeader != null) {
              if (!trainHeader.equalHeaders(userTestStructure)) {
                if (!(classifierToUse instanceof weka.classifiers.misc.InputMappedClassifier)) {

                  boolean wrapClassifier = false;
                  if (!Utils
                    .getDontShowDialog("weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier")) {
                    JCheckBox dontShow =
                      new JCheckBox("Do not show this message again");
                    Object[] stuff = new Object[2];
                    stuff[0] =
                      "Data used to train model and test set are not compatible.\n"
                        + "Would you like to automatically wrap the classifier in\n"
                        + "an \"InputMappedClassifier\" before proceeding?.\n";
                    stuff[1] = dontShow;

                    int result =
                      JOptionPane.showConfirmDialog(ClassifierPanel.this,
                        stuff, "ClassifierPanel", JOptionPane.YES_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                      wrapClassifier = true;
                    }

                    if (dontShow.isSelected()) {
                      String response = (wrapClassifier) ? "yes" : "no";
                      Utils
                        .setDontShowDialogResponse(
                          "weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier",
                          response);
                    }

                  } else {
                    // What did the user say - do they want to autowrap or not?
                    String response =
                      Utils
                        .getDontShowDialogResponse("weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier");
                    if (response != null && response.equalsIgnoreCase("yes")) {
                      wrapClassifier = true;
                    }
                  }

                  if (wrapClassifier) {
                    weka.classifiers.misc.InputMappedClassifier temp =
                      new weka.classifiers.misc.InputMappedClassifier();

                    temp.setClassifier(classifierToUse);
                    temp.setModelHeader(trainHeader);
                    temp.setTestStructure(userTestStructure);
                    classifierToUse = temp;
                  } else {
                    throw new Exception(
                      "Train and test set are not compatible\n"
                        + trainHeader.equalHeadersMsg(userTestStructure));
                  }
                }
              }
            } else {
              if (classifierToUse instanceof PMMLClassifier) {
                // set the class based on information in the mining schema
                Instances miningSchemaStructure =
                  ((PMMLClassifier) classifierToUse).getMiningSchema()
                    .getMiningSchemaAsInstances();
                String className =
                  miningSchemaStructure.classAttribute().name();
                Attribute classMatch = userTestStructure.attribute(className);
                if (classMatch == null) {
                  throw new Exception(
                    "Can't find a match for the PMML target field " + className
                      + " in the " + "test instances!");
=======
            boolean incrementalLoader = (m_TestLoader instanceof IncrementalConverter);
            if (m_TestLoader != null && m_TestLoader.getStructure() != null) {
              m_TestLoader.reset();
              source = new DataSource(m_TestLoader);
              userTestStructure = source.getStructure();
            }
            // Check the test instance compatibility
            if (source == null) {
              throw new Exception(Messages.getInstance().getString(
                "ClassifierPanel_ReEvaluateModel_Exception_Text_First"));
            }
            if (trainHeader != null) {
              if (trainHeader.classIndex() > userTestStructure.numAttributes() - 1) {
                throw new Exception(Messages.getInstance().getString(
                  "ClassifierPanel_ReEvaluateModel_Exception_Text_Second"));
              }
              userTestStructure.setClassIndex(trainHeader.classIndex());
              if (!trainHeader.equalHeaders(userTestStructure)) {
                throw new Exception(Messages.getInstance().getString(
                  "ClassifierPanel_ReEvaluateModel_Exception_Text_Third"));
              }
            } else {
              if (classifier instanceof PMMLClassifier) {
                // set the class based on information in the mining schema
                Instances miningSchemaStructure = ((PMMLClassifier) classifier)
                  .getMiningSchema().getMiningSchemaAsInstances();
                String className = miningSchemaStructure.classAttribute()
                  .name();
                Attribute classMatch = userTestStructure.attribute(className);
                if (classMatch == null) {
                  throw new Exception(Messages.getInstance().getString(
                    "ClassifierPanel_ReEvaluateModel_Exception_Text_Fourth")
                    + className
                    + Messages.getInstance().getString(
                      "ClassifierPanel_ReEvaluateModel_Exception_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                }
                userTestStructure.setClass(classMatch);
              } else {
                userTestStructure.setClassIndex(userTestStructure
                  .numAttributes() - 1);
              }
            }
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
<<<<<<< HEAD
            m_Log.statusMessage("Evaluating on test data...");
            m_Log.logMessage("Re-evaluating classifier (" + name
              + ") on test set");
            eval = new Evaluation(userTestStructure, costMatrix);
            eval.setMetricsToDisplay(m_selectedEvalMetrics);

            // set up the structure of the plottable instances for
            // visualization if selected
            // if (saveVis) {
            plotInstances = ExplorerDefaults.getClassifierErrorsPlotInstances();
            plotInstances.setInstances(trainHeader != null ? trainHeader
              : userTestStructure);
            plotInstances.setClassifier(classifierToUse);
            plotInstances.setClassIndex(trainHeader != null ? trainHeader
              .classIndex() : userTestStructure.classIndex());
            plotInstances.setSaveForVisualization(saveVis);
            plotInstances.setEvaluation(eval);

            outBuff.append("\n=== Re-evaluation on test set ===\n\n");
            outBuff.append("User supplied test set\n");
            outBuff.append("Relation:     " + userTestStructure.relationName()
              + '\n');
            if (incrementalLoader) {
              outBuff
                .append("Instances:     unknown (yet). Reading incrementally\n");
            } else {
              outBuff.append("Instances:    "
                + source.getDataSet().numInstances() + "\n");
            }
            outBuff.append("Attributes:   " + userTestStructure.numAttributes()
              + "\n\n");
            if (trainHeader == null
              && !(classifierToUse instanceof weka.classifiers.pmml.consumer.PMMLClassifier)) {
              outBuff
                .append("NOTE - if test set is not compatible then results are "
                  + "unpredictable\n\n");
            }

            AbstractOutput classificationOutput = null;
            if (outputPredictionsText) {
              classificationOutput =
                (AbstractOutput) m_ClassificationOutputEditor.getValue();
              classificationOutput.setHeader(userTestStructure);
              classificationOutput.setBuffer(outBuff);
            }

            // make adjustments if the classifier is an InputMappedClassifier
            eval =
              setupEval(eval, classifierToUse,
                trainHeader != null ? trainHeader : userTestStructure,
                costMatrix, plotInstances, classificationOutput, false);
            eval.useNoPriors();
            plotInstances.setUp();

            if (outputPredictionsText) {
              printPredictionsHeader(outBuff, classificationOutput,
                "user test set");
            }

            int batchSize = 100;
            Instances batchInst = null;
            if (classifierToUse instanceof BatchPredictor
              && ((BatchPredictor) classifierToUse)
                .implementsMoreEfficientBatchPrediction()) {
              batchInst = new Instances(userTestStructure, 0);
              String batchSizeS =
                ((BatchPredictor) classifierToUse).getBatchSize();
              if (batchSizeS != null && batchSizeS.length() > 0) {
                try {
                  batchSizeS =
                    Environment.getSystemWide().substitute(batchSizeS);
                } catch (Exception ex) {
                }
                try {
                  batchSize = Integer.parseInt(batchSizeS);
                } catch (NumberFormatException e) {
                  // just go with the default
                }
              }
            }
=======
            m_Log.statusMessage(Messages.getInstance().getString(
              "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Second"));
            m_Log.logMessage(Messages.getInstance().getString(
              "ClassifierPanel_ReEvaluateModel_Log_LogMessage_Text_First")
              + name
              + Messages.getInstance().getString(
                "ClassifierPanel_ReEvaluateModel_Log_LogMessage_Text_Second"));
            eval = new Evaluation(userTestStructure, costMatrix);
            eval.useNoPriors();

            // set up the structure of the plottable instances for
            // visualization if selected
            if (saveVis) {
              predInstances = setUpVisualizableInstances(userTestStructure);
              predInstances.setClassIndex(userTestStructure.classIndex() + 1);
            }

            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_SaveClassifier_OutBuffer_Text_Twelveth"));
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_SaveClassifier_OutBuffer_Text_Thirteenth"));
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_SaveClassifier_OutBuffer_Text_Fourteenth")
              + userTestStructure.relationName() + '\n');
            if (incrementalLoader) {
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_SaveClassifier_OutBuffer_Text_Sixteenth"));
            } else {
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_SaveClassifier_OutBuffer_Text_Seventeenth")
                + source.getDataSet().numInstances() + "\n");
            }
            outBuff.append(Messages.getInstance().getString(
              "ClassifierPanel_SaveClassifier_OutBuffer_Text_Nineteenth")
              + userTestStructure.numAttributes() + "\n\n");
            if (trainHeader == null
              && !(classifier instanceof weka.classifiers.pmml.consumer.PMMLClassifier)) {

              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_SaveClassifier_OutBuffer_Text_TwentyFirst"));

            }

            if (outputPredictionsText) {
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_SaveClassifier_OutBuffer_Text_TwentySecond"));
              outBuff.append(Messages.getInstance().getString(
                "ClassifierPanel_SaveClassifier_OutBuffer_Text_TwentyThird"));
              if (userTestStructure.classAttribute().isNominal()) {
                outBuff
                  .append(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_SaveClassifier_OutBuffer_Text_TwentyFourth"));
              }
              outBuff.append("\n");
            }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            Instance instance;
            int jj = 0;
            while (source.hasMoreElements(userTestStructure)) {
              instance = source.nextElement(userTestStructure);
<<<<<<< HEAD

              if (classifierToUse instanceof BatchPredictor
                && ((BatchPredictor) classifierToUse)
                  .implementsMoreEfficientBatchPrediction()) {
                batchInst.add(instance);
                if (batchInst.numInstances() == batchSize) {
                  Instances toPred = new Instances(batchInst);
                  for (int i = 0; i < toPred.numInstances(); i++) {
                    toPred.instance(i).setClassMissing();
                  }
                  double[][] predictions =
                    ((BatchPredictor) classifierToUse)
                      .distributionsForInstances(toPred);
                  plotInstances.process(batchInst, predictions, eval);

                  if (outputPredictionsText) {
                    for (int kk = 0; kk < batchInst.numInstances(); kk++) {
                      classificationOutput.printClassification(predictions[kk],
                        batchInst.instance(kk), kk);
                    }
                  }
                  jj += batchInst.numInstances();
                  m_Log.statusMessage("Evaluating on test data. Processed "
                    + jj + " instances...");
                  batchInst.delete();
                }
              } else {
                plotInstances.process(instance, classifierToUse, eval);
                if (outputPredictionsText) {
                  classificationOutput.printClassification(classifierToUse,
                    instance, jj);
                }
              }
              if ((++jj % 100) == 0) {
                m_Log.statusMessage("Evaluating on test data. Processed " + jj
                  + " instances...");
              }
            }

            if (classifierToUse instanceof BatchPredictor
              && ((BatchPredictor) classifierToUse)
                .implementsMoreEfficientBatchPrediction()
              && batchInst.numInstances() > 0) {
              // finish the last batch

              Instances toPred = new Instances(batchInst);
              for (int i = 0; i < toPred.numInstances(); i++) {
                toPred.instance(i).setClassMissing();
              }

              double[][] predictions =
                ((BatchPredictor) classifierToUse)
                  .distributionsForInstances(toPred);
              plotInstances.process(batchInst, predictions, eval);

              if (outputPredictionsText) {
                for (int kk = 0; kk < batchInst.numInstances(); kk++) {
                  classificationOutput.printClassification(predictions[kk],
                    batchInst.instance(kk), kk);
                }
=======
              processClassifierPrediction(instance, classifier, eval,
                predInstances, plotShape, plotSize);
              if (outputPredictionsText) {
                outBuff.append(predictionText(classifier, instance, jj + 1));
              }
              if ((++jj % 100) == 0) {
                m_Log
                  .statusMessage(Messages
                    .getInstance()
                    .getString(
                      "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Third")
                    + jj
                    + Messages
                      .getInstance()
                      .getString(
                        "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              }
            }

            if (outputPredictionsText) {
<<<<<<< HEAD
              classificationOutput.printFooter();
            }
            if (outputPredictionsText && classificationOutput.generatesOutput()) {
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              outBuff.append("\n");
            }

            if (outputSummary) {
              outBuff.append(eval.toSummaryString(outputEntropy) + "\n");
            }

            if (userTestStructure.classAttribute().isNominal()) {

              if (outputPerClass) {
                outBuff.append(eval.toClassDetailsString() + "\n");
              }

              if (outputConfusion) {
                outBuff.append(eval.toMatrixString() + "\n");
              }
            }

            m_History.updateResult(name);
<<<<<<< HEAD
            m_Log.logMessage("Finished re-evaluation");
            m_Log.statusMessage("OK");
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            m_Log.statusMessage("See error log");

            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane.showMessageDialog(ClassifierPanel.this,
              "Problem evaluating classifier:\n" + ex.getMessage(),
              "Evaluate classifier", JOptionPane.ERROR_MESSAGE);
            m_Log.statusMessage("Problem evaluating classifier");
          } finally {
            try {
              if (classifierToUse instanceof PMMLClassifier) {
=======
            m_Log.logMessage(Messages.getInstance().getString(
              "ClassifierPanel_ReEvaluateModel_Log_LogMessage_Text_Third"));
            m_Log.statusMessage(Messages.getInstance().getString(
              "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Fifth"));
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            m_Log.statusMessage(Messages.getInstance().getString(
              "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Sixth"));

            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane
              .showMessageDialog(
                ClassifierPanel.this,
                Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_ReEvaluateModel_JOptionPaneShowMessageDialog_Text_First")
                  + ex.getMessage(),
                Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_ReEvaluateModel_JOptionPaneShowMessageDialog_Text_Second"),
                JOptionPane.ERROR_MESSAGE);
            m_Log
              .statusMessage(Messages
                .getInstance()
                .getString(
                  "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Seventh"));
          } finally {
            try {
              if (classifier instanceof PMMLClassifier) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                // signal the end of the scoring run so
                // that the initialized state can be reset
                // (forces the field mapping to be recomputed
                // for the next scoring run).
<<<<<<< HEAD
                ((PMMLClassifier) classifierToUse).done();
              }

              if (plotInstances != null
                && plotInstances.getPlotInstances() != null
                && plotInstances.getPlotInstances().numInstances() > 0) {
                m_CurrentVis = new VisualizePanel();
                if (getMainApplication() != null) {
                  Settings settings =
                    getMainApplication().getApplicationSettings();
                  m_CurrentVis.applySettings(settings,
                    weka.gui.explorer.VisualizePanel.ScatterDefaults.ID);
                }
                m_CurrentVis.setName(name + " ("
                  + userTestStructure.relationName() + ")");
                m_CurrentVis.setLog(m_Log);
                m_CurrentVis.addPlot(plotInstances.getPlotData(name));
                // m_CurrentVis.setColourIndex(plotInstances.getPlotInstances().classIndex()+1);
                m_CurrentVis.setColourIndex(plotInstances.getPlotInstances()
                  .classIndex());
                plotInstances.cleanUp();

                if (classifierToUse instanceof Drawable) {
                  try {
                    grph = ((Drawable) classifierToUse).graph();
=======
                ((PMMLClassifier) classifier).done();
              }

              if (predInstances != null && predInstances.numInstances() > 0) {
                if (predInstances.attribute(predInstances.classIndex())
                  .isNumeric()) {
                  postProcessPlotInfo(plotSize);
                }
                m_CurrentVis = new VisualizePanel();
                m_CurrentVis.setName(name + " ("
                  + userTestStructure.relationName() + ")");
                m_CurrentVis.setLog(m_Log);
                PlotData2D tempd = new PlotData2D(predInstances);
                tempd.setShapeSize(plotSize);
                tempd.setShapeType(plotShape);
                tempd.setPlotName(name + " ("
                  + userTestStructure.relationName() + ")");
                // tempd.addInstanceNumberAttribute();

                m_CurrentVis.addPlot(tempd);
                m_CurrentVis.setColourIndex(predInstances.classIndex());
                // m_CurrentVis.setColourIndex(predInstances.classIndex()+1);

                if (classifier instanceof Drawable) {
                  try {
                    grph = ((Drawable) classifier).graph();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                  } catch (Exception ex) {
                  }
                }

                if (saveVis) {
<<<<<<< HEAD
                  ArrayList<Object> vv = new ArrayList<Object>();
                  vv.add(classifier);
                  if (trainHeader != null) {
                    vv.add(trainHeader);
                  }
                  vv.add(m_CurrentVis);
                  if (grph != null) {
                    vv.add(grph);
                  }
                  if ((eval != null) && (eval.predictions() != null)) {
                    vv.add(eval.predictions());
                    vv.add(userTestStructure.classAttribute());
                  }
                  m_History.addOrOverwriteObject(name, vv);
                } else {
                  ArrayList<Object> vv = new ArrayList<Object>();
                  vv.add(classifierToUse);
                  if (trainHeader != null) {
                    vv.add(trainHeader);
                  }
                  m_History.addOrOverwriteObject(name, vv);
=======
                  FastVector vv = new FastVector();
                  vv.addElement(classifier);
                  if (trainHeader != null) {
                    vv.addElement(trainHeader);
                  }
                  vv.addElement(m_CurrentVis);
                  if (grph != null) {
                    vv.addElement(grph);
                  }
                  if ((eval != null) && (eval.predictions() != null)) {
                    vv.addElement(eval.predictions());
                    vv.addElement(userTestStructure.classAttribute());
                  }
                  m_History.addObject(name, vv);
                } else {
                  FastVector vv = new FastVector();
                  vv.addElement(classifier);
                  if (trainHeader != null) {
                    vv.addElement(trainHeader);
                  }
                  m_History.addObject(name, vv);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
                }
              }
            } catch (Exception ex) {
              ex.printStackTrace();
            }
            if (isInterrupted()) {
<<<<<<< HEAD
              m_Log.logMessage("Interrupted reevaluate model");
              m_Log.statusMessage("Interrupted");
=======
              m_Log.logMessage(Messages.getInstance().getString(
                "ClassifierPanel_ReEvaluateModel_Log_LogMessage_Text_Fourth"));
              m_Log
                .statusMessage(Messages
                  .getInstance()
                  .getString(
                    "ClassifierPanel_ReEvaluateModel_Log_StatusMessage_Text_Seventh"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }

            synchronized (this) {
              m_StartBut.setEnabled(true);
              m_StopBut.setEnabled(false);
              m_RunThread = null;
            }

            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskFinished();
            }
          }
        }
      };

      m_RunThread.setPriority(Thread.MIN_PRIORITY);
      m_RunThread.start();
    }
  }

  /**
<<<<<<< HEAD
   * updates the capabilities filter of the GOE.
   *
=======
   * updates the capabilities filter of the GOE
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param filter the new filter to use
   */
  protected void updateCapabilitiesFilter(Capabilities filter) {
    Instances tempInst;
    Capabilities filterClass;

    if (filter == null) {
      m_ClassifierEditor.setCapabilitiesFilter(new Capabilities(null));
      return;
    }

    if (!ExplorerDefaults.getInitGenericObjectEditorFilter()) {
      tempInst = new Instances(m_Instances, 0);
    } else {
      tempInst = new Instances(m_Instances);
    }
    tempInst.setClassIndex(m_ClassCombo.getSelectedIndex());

    try {
      filterClass = Capabilities.forInstances(tempInst);
    } catch (Exception e) {
      filterClass = new Capabilities(null);
    }

    // set new filter
    m_ClassifierEditor.setCapabilitiesFilter(filterClass);

<<<<<<< HEAD
    // Check capabilities
    m_StartBut.setEnabled(true);
=======
    m_StartBut.setEnabled(true);
    // Check capabilities
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Capabilities currentFilter = m_ClassifierEditor.getCapabilitiesFilter();
    Classifier classifier = (Classifier) m_ClassifierEditor.getValue();
    Capabilities currentSchemeCapabilities = null;
    if (classifier != null && currentFilter != null
      && (classifier instanceof CapabilitiesHandler)) {
<<<<<<< HEAD
      currentSchemeCapabilities =
        ((CapabilitiesHandler) classifier).getCapabilities();
=======
      currentSchemeCapabilities = ((CapabilitiesHandler) classifier)
        .getCapabilities();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
        && !currentSchemeCapabilities.supports(currentFilter)) {
        m_StartBut.setEnabled(false);
      }
    }
  }

  /**
<<<<<<< HEAD
   * method gets called in case of a change event.
   *
=======
   * method gets called in case of a change event
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param e the associated change event
   */
  @Override
  public void capabilitiesFilterChanged(CapabilitiesFilterChangeEvent e) {
    if (e.getFilter() == null) {
      updateCapabilitiesFilter(null);
    } else {
      updateCapabilitiesFilter((Capabilities) e.getFilter().clone());
    }
  }

  /**
   * Sets the Explorer to use as parent frame (used for sending notifications
<<<<<<< HEAD
   * about changes in the data).
   *
=======
   * about changes in the data)
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param parent the parent frame
   */
  @Override
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }

  /**
<<<<<<< HEAD
   * returns the parent Explorer frame.
   *
=======
   * returns the parent Explorer frame
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the parent
   */
  @Override
  public Explorer getExplorer() {
    return m_Explorer;
  }

  /**
<<<<<<< HEAD
   * Returns the title for the tab in the Explorer.
   *
=======
   * Returns the title for the tab in the Explorer
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the title of this tab
   */
  @Override
  public String getTabTitle() {
<<<<<<< HEAD
    return "Classify";
  }

  /**
   * Returns the tooltip for the tab in the Explorer.
   *
=======
    return Messages.getInstance().getString("ClassifierPanel_GetTabTitle_Text");
  }

  /**
   * Returns the tooltip for the tab in the Explorer
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the tooltip of this tab
   */
  @Override
  public String getTabTitleToolTip() {
<<<<<<< HEAD
    return "Classify instances";
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
    return new ClassifierPanelDefaults();
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
        Object initialC =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), ClassifierPanelDefaults.CLASSIFIER_KEY,
            ClassifierPanelDefaults.CLASSIFIER, Environment.getSystemWide());
        m_ClassifierEditor.setValue(initialC);

        TestMode initialTestMode =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), ClassifierPanelDefaults.TEST_MODE_KEY,
            ClassifierPanelDefaults.TEST_MODE, Environment.getSystemWide());

        m_CVBut.setSelected(initialTestMode == TestMode.CROSS_VALIDATION);
        m_PercentBut.setSelected(initialTestMode == TestMode.PERCENTAGE_SPLIT);
        m_TrainBut.setSelected(initialTestMode == TestMode.USE_TRAINING_SET);
        m_TestSplitBut
          .setSelected(initialTestMode == TestMode.SEPARATE_TEST_SET);
        m_CVText.setEnabled(m_CVBut.isSelected());
        m_PercentText.setEnabled(m_PercentBut.isSelected());
        m_CVText.setText(""
          + getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(),
            ClassifierPanelDefaults.CROSS_VALIDATION_FOLDS_KEY,
            ClassifierPanelDefaults.CROSS_VALIDATION_FOLDS,
            Environment.getSystemWide()));
        m_PercentText.setText(""
          + getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), ClassifierPanelDefaults.PERCENTAGE_SPLIT_KEY,
            ClassifierPanelDefaults.PERCENTAGE_SPLIT,
            Environment.getSystemWide()));

        // TODO these widgets will disappear, as the "More options" dialog will
        // not be necessary
        m_OutputModelBut.setSelected(getMainApplication()
          .getApplicationSettings().getSetting(getPerspectiveID(),
            ClassifierPanelDefaults.OUTPUT_MODEL_KEY,
            ClassifierPanelDefaults.OUTPUT_MODEL, Environment.getSystemWide()));
        m_OutputModelsForTrainingSplitsBut.setSelected(getMainApplication()
                .getApplicationSettings().getSetting(getPerspectiveID(),
                        ClassifierPanelDefaults.OUTPUT_MODELS_FOR_TRAINING_SPLITS_KEY,
                        ClassifierPanelDefaults.OUTPUT_MODELS_FOR_TRAINING_SPLITS, Environment.getSystemWide()));
        m_OutputPerClassBut.setSelected(getMainApplication()
          .getApplicationSettings().getSetting(getPerspectiveID(),
            ClassifierPanelDefaults.OUTPUT_PER_CLASS_STATS_KEY,
            ClassifierPanelDefaults.OUTPUT_PER_CLASS_STATS,
            Environment.getSystemWide()));
        m_OutputEntropyBut.setSelected(getMainApplication()
          .getApplicationSettings().getSetting(getPerspectiveID(),
            ClassifierPanelDefaults.OUTPUT_ENTROPY_EVAL_METRICS_KEY,
            ClassifierPanelDefaults.OUTPUT_ENTROPY_EVAL_METRICS,
            Environment.getSystemWide()));
        m_OutputConfusionBut.setSelected(getMainApplication()
          .getApplicationSettings().getSetting(getPerspectiveID(),
            ClassifierPanelDefaults.OUTPUT_CONFUSION_MATRIX_KEY,
            ClassifierPanelDefaults.OUTPUT_CONFUSION_MATRIX,
            Environment.getSystemWide()));
        m_StorePredictionsBut.setSelected(getMainApplication()
          .getApplicationSettings().getSetting(getPerspectiveID(),
            ClassifierPanelDefaults.STORE_PREDICTIONS_FOR_VIS_KEY,
            ClassifierPanelDefaults.STORE_PREDICTIONS_FOR_VIS,
            Environment.getSystemWide()));
        m_errorPlotPointSizeProportionalToMargin
          .setSelected(getMainApplication().getApplicationSettings()
            .getSetting(getPerspectiveID(),
              ClassifierPanelDefaults.ERROR_PLOT_POINT_SIZE_PROP_TO_MARGIN_KEY,
              ClassifierPanelDefaults.ERROR_PLOT_POINT_SIZE_PROP_TO_MARGIN,
              Environment.getSystemWide()));
        m_RandomSeedText.setText(""
          + getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), ClassifierPanelDefaults.RANDOM_SEED_KEY,
            ClassifierPanelDefaults.RANDOM_SEED, Environment.getSystemWide()));
      }
      m_initialSettingsSet = true;

      Font outputFont =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(), ClassifierPanelDefaults.OUTPUT_FONT_KEY,
          ClassifierPanelDefaults.OUTPUT_FONT, Environment.getSystemWide());
      m_OutText.setFont(outputFont);
      m_History.setFont(outputFont);
      Color textColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(), ClassifierPanelDefaults.OUTPUT_TEXT_COLOR_KEY,
          ClassifierPanelDefaults.OUTPUT_TEXT_COLOR,
          Environment.getSystemWide());
      m_OutText.setForeground(textColor);
      m_History.setForeground(textColor);
      Color outputBackgroundColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(),
          ClassifierPanelDefaults.OUTPUT_BACKGROUND_COLOR_KEY,
          ClassifierPanelDefaults.OUTPUT_BACKGROUND_COLOR,
          Environment.getSystemWide());
      m_OutText.setBackground(outputBackgroundColor);
      m_History.setBackground(outputBackgroundColor);
    }
  }

  /**
   * Gets whether cross-validation has been selected by the user
   *
   * @return true if cross-validation has been selected
   */
  public boolean isSelectedCV() {
    return m_CVBut.isSelected();
  }

  /**
   * Gets whether test on train has been selected by the user
   *
   * @return true if testing is to be done on the training set
   */
  public boolean isSelectedTestOnTrain() {
    return m_TrainBut.isSelected();
  }

  /**
   * Gets whether a percentage split has been selected by the user
   *
   * @return true if a percentage split has been selected
   */
  public boolean isSelectedPercentageSplit() {
    return m_PercentBut.isSelected();
  }

  /**
   * Gets whether a separate test set has been selected by the user
   *
   * @return true if a separate test set has been selected by the user
   */
  public boolean isSelectedSeparateTestSet() {
    return m_TestSplitBut.isSelected();
  }

  /**
   * Gets whether evaluation with respect to costs has been selected by the user
   *
   * @return true if eval with respect to costs
   */
  public boolean isSelectedEvalWithRespectToCosts() {
    return m_EvalWRTCostsBut.isSelected();
  }

  /**
   * Gets whether the user has opted to output the model
   *
   * @return true if the model is to be output
   */
  public boolean isSelectedOutputModel() {
    return m_OutputModelBut.isSelected();
  }

  /**
   * Gets whether the user has opted to output the models for the training splits
   *
   * @return true if the models for the training splits are to be output
   */
  public boolean isSelectedOutputModelsForTrainingSplits() {
    return m_OutputModelsForTrainingSplitsBut.isSelected();
  }

  /**
   * Gets whether the user has opted to output the confusion matrix
   *
   * @return true if the confusion matrix is to be output
   */
  public boolean isSelectedOutputConfusion() {
    return m_OutputConfusionBut.isSelected();
  }

  /**
   * Gets whether the user has opted to output per-class stats
   *
   * @return true if per-class stats are to be output
   */
  public boolean isSelectedOutputPerClassStats() {
    return m_OutputPerClassBut.isSelected();
  }

  /**
   * Gets whether the user has opted to output entropy metrics
   *
   * @return true if entropy metrics are to be output
   */
  public boolean isSelectedOutputEntropy() {
    return m_OutputEntropyBut.isSelected();
  }

  /**
   * Gets whether the user has opted to store the predictions in the history
   *
   * @return true if predictions are to be stored
   */
  public boolean isSelectedStorePredictions() {
    return m_StorePredictionsBut.isSelected();
  }

  /**
   * Gets whether the user has opted to output source code
   *
   * @return true if source code is to be output
   */
  public boolean isSelectedOutputSourceCode() {
    return m_OutputSourceCode.isSelected();
  }

  /**
   * Gets whether the user has opted to preserve order of instances in a
   * percentage split
   *
   * @return whether the user has opted to preserve the instance order
   */
  public boolean isSelectedPreserveOrder() {
    return m_PreserveOrderBut.isSelected();
  }

  /**
   * Gets the name of the source code class to be generated
   *
   * @return the name of the source code class to be generated
   */
  public String getSourceCodeClassName() {
    return m_SourceCodeClass.getText();
  }

  /**
   * Get the current visualization
   *
   * @return the current visualization
   */
  public VisualizePanel getCurrentVisualization() {
    return m_CurrentVis;
  }

  /**
   * Set the current visualization
   *
   * @param current the visualization to use
   */
  public void setCurrentVisualization(VisualizePanel current) {
    m_CurrentVis = current;
  }

  /**
   * Get the selected (0-based) class index
   *
   * @return the selected class index
   */
  public int getSelectedClassIndex() {
    return m_ClassCombo.getSelectedIndex();
  }

  /**
   * Get the number of cross-validation folds to use
   *
   * @return the number of cross-validation folds to use
   */
  public int getNumCVFolds() {
    return Integer.parseInt(m_CVText.getText());
  }

  /**
   * Get the percentage to use for percentage split evaluation
   *
   * @return the percentage to use in a percent split evaluation
   */
  public double getPercentageSplit() {
    return Double.parseDouble(m_PercentText.getText());
  }

  /**
   * Get the currently configured classifier from the GenericObjectEditor
   *
   * @return the currently configured classifier
   */
  public Classifier getClassifier() {
    return (Classifier) m_ClassifierEditor.getValue();
  }

  /**
   * Get the cost matrix (if any)
   *
   * @return the cost matrix
   */
  public CostMatrix getCostMatrix() {
    return (CostMatrix) m_CostMatrixEditor.getValue();
  }

  /**
   * Get the formatter for classifcation output
   *
   * @return the formatter for classification output
   */
  public Object getClassificationOutputFormatter() {
    return m_ClassificationOutputEditor.getValue();
  }

  /**
   * Get the result history panel
   *
   * @return the result history panel
   */
  public ResultHistoryPanel getResultHistory() {
    return m_History;
  }

  /**
   * Get the loader object used for loading a separate test set
   *
   * @return the loader used for loading a separate test set
   */
  public Loader getSeparateTestSetLoader() {
    return m_TestLoader;
  }

  /**
   * Get the class index specified for the separate test set
   *
   * @return the class index specified for the separate test set
   */
  public int getSeparateTestSetClassIndex() {
    return m_TestClassIndex;
  }

  /**
   * Get the random seed
   *
   * @return the random seed
   */
  public int getRandomSeed() {
    return Integer.parseInt(m_RandomSeedText.getText());
  }

  /**
   * Get the log
   *
   * @return the log object
   */
  public Logger getLog() {
    return m_Log;
  }

  public static enum TestMode {
    CROSS_VALIDATION, PERCENTAGE_SPLIT, USE_TRAINING_SET, SEPARATE_TEST_SET;
  }

  /**
   * Default settings for the classifier panel
   */
  protected static final class ClassifierPanelDefaults extends Defaults {
    public static final String ID = "weka.gui.explorer.classifierpanel";

    protected static final Settings.SettingKey CLASSIFIER_KEY =
      new Settings.SettingKey(ID + ".initialClassifier", "Initial classifier",
        "On startup, set this classifier as the default one");
    protected static final Classifier CLASSIFIER = new ZeroR();

    protected static final Settings.SettingKey TEST_MODE_KEY =
      new Settings.SettingKey(ID + ".initialTestMode", "Default test mode", "");
    protected static final TestMode TEST_MODE = TestMode.CROSS_VALIDATION;

    protected static final Settings.SettingKey CROSS_VALIDATION_FOLDS_KEY =
      new Settings.SettingKey(ID + ".crossValidationFolds",
        "Default cross validation folds", "");
    protected static final int CROSS_VALIDATION_FOLDS = 10;

    protected static final Settings.SettingKey PERCENTAGE_SPLIT_KEY =
      new Settings.SettingKey(ID + ".percentageSplit",
        "Default percentage split", "");
    protected static final int PERCENTAGE_SPLIT = 66;

    protected static final Settings.SettingKey OUTPUT_MODEL_KEY =
      new Settings.SettingKey(ID + ".outputModel", "Output model obtained from"
        + " the full training set", "");
    protected static final boolean OUTPUT_MODEL = true;

    protected static final Settings.SettingKey OUTPUT_MODELS_FOR_TRAINING_SPLITS_KEY =
            new Settings.SettingKey(ID + ".outputModelsForTrainingSplits", "Output models obtained from"
                    + " the training splits", "");
    protected static final boolean OUTPUT_MODELS_FOR_TRAINING_SPLITS = false;

    protected static final Settings.SettingKey OUTPUT_PER_CLASS_STATS_KEY =
      new Settings.SettingKey(ID + ".outputPerClassStats",
        "Output per-class statistics", "");
    protected static final boolean OUTPUT_PER_CLASS_STATS = true;

    protected static final Settings.SettingKey OUTPUT_ENTROPY_EVAL_METRICS_KEY =
      new Settings.SettingKey(ID + ".outputEntropyMetrics", "Output entropy "
        + "evaluation metrics", "");
    protected static final boolean OUTPUT_ENTROPY_EVAL_METRICS = false;

    protected static final Settings.SettingKey OUTPUT_CONFUSION_MATRIX_KEY =
      new Settings.SettingKey(ID + ".outputConfusionMatrix",
        "Output confusion " + "matrix", "");
    protected static final boolean OUTPUT_CONFUSION_MATRIX = true;

    protected static final Settings.SettingKey STORE_PREDICTIONS_FOR_VIS_KEY =
      new Settings.SettingKey(ID + ".storePredsForVis", "Store predictions for"
        + " visualization", "");
    protected static final boolean STORE_PREDICTIONS_FOR_VIS = true;

    /*
     * protected static final Settings.SettingKey OUTPUT_PREDICTIONS_KEY = new
     * Settings.SettingKey(ID + ".outputPredictions", "Output predictions", "");
     * protected static final boolean OUTPUT_PREDICTIONS = false;
     */

    protected static final Settings.SettingKey PREDICTION_FORMATTER_KEY =
      new Settings.SettingKey(ID + ".predictionFormatter",
        "Prediction formatter", "");
    protected static final AbstractOutput PREDICTION_FORMATTER = new Null();

    protected static final Settings.SettingKey ERROR_PLOT_POINT_SIZE_PROP_TO_MARGIN_KEY =
      new Settings.SettingKey(
        ID + ".errorPlotPointSizePropToMargin",
        "Error plot point size proportional to margin",
        "In classifier error plots the point size will be set proportional to "
          + "the absolute value of the prediction margin (affects classification "
          + "only)");
    protected static final boolean ERROR_PLOT_POINT_SIZE_PROP_TO_MARGIN = false;

    protected static final Settings.SettingKey COST_SENSITIVE_EVALUATION_KEY =
      new Settings.SettingKey(ID + ".costSensitiveEval",
        "Cost sensitive evaluation",
        "Evaluate errors with respect to a cost matrix");
    protected static final boolean COST_SENSITIVE_EVALUATION = false;

    protected static final Settings.SettingKey COST_MATRIX_KEY =
      new Settings.SettingKey(ID + ".costMatrix",
        "Cost matrix for cost sensitive " + "evaluation", "");
    protected static final CostMatrix COST_MATRIX = new CostMatrix(1);

    protected static final Settings.SettingKey RANDOM_SEED_KEY =
      new Settings.SettingKey(ID + ".randomSeed",
        "Random seed for XVal / % Split", "The seed for randomization");
    protected static final int RANDOM_SEED = 1;

    protected static final Settings.SettingKey PRESERVE_ORDER_FOR_PERCENT_SPLIT_KEY =
      new Settings.SettingKey(ID + ".preserveOrder",
        "Preserve order for % Split",
        "Preserves the order in a percentage split");
    protected static final boolean PRESERVE_ORDER_FOR_PERCENT_SPLIT = false;

    protected static final Settings.SettingKey SOURCE_CODE_CLASS_NAME_KEY =
      new Settings.SettingKey(ID + ".sourceCodeClassName", "Source code class "
        + "name", "Default classname of a Sourcable classifier");
    protected static final String SOURCE_CODE_CLASS_NAME = "WekaClassifier";

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
    private static final long serialVersionUID = 7109938811150596359L;

    public ClassifierPanelDefaults() {
      super(ID);

      m_defaults.put(CLASSIFIER_KEY, CLASSIFIER);
      m_defaults.put(TEST_MODE_KEY, TEST_MODE);
      m_defaults.put(CROSS_VALIDATION_FOLDS_KEY, CROSS_VALIDATION_FOLDS);
      m_defaults.put(PERCENTAGE_SPLIT_KEY, PERCENTAGE_SPLIT);
      m_defaults.put(OUTPUT_MODEL_KEY, OUTPUT_MODEL);
      m_defaults.put(OUTPUT_MODELS_FOR_TRAINING_SPLITS_KEY, OUTPUT_MODELS_FOR_TRAINING_SPLITS);
      m_defaults.put(OUTPUT_PER_CLASS_STATS_KEY, OUTPUT_PER_CLASS_STATS);
      m_defaults.put(OUTPUT_ENTROPY_EVAL_METRICS_KEY,
        OUTPUT_ENTROPY_EVAL_METRICS);
      m_defaults.put(OUTPUT_CONFUSION_MATRIX_KEY, OUTPUT_CONFUSION_MATRIX);
      m_defaults.put(STORE_PREDICTIONS_FOR_VIS_KEY, STORE_PREDICTIONS_FOR_VIS);
      // m_defaults.put(OUTPUT_PREDICTIONS_KEY, OUTPUT_PREDICTIONS);
      m_defaults.put(PREDICTION_FORMATTER_KEY, PREDICTION_FORMATTER);
      m_defaults.put(ERROR_PLOT_POINT_SIZE_PROP_TO_MARGIN_KEY,
        ERROR_PLOT_POINT_SIZE_PROP_TO_MARGIN);
      m_defaults.put(COST_SENSITIVE_EVALUATION_KEY, COST_SENSITIVE_EVALUATION);
      m_defaults.put(COST_MATRIX_KEY, COST_MATRIX);
      m_defaults.put(RANDOM_SEED_KEY, RANDOM_SEED);
      m_defaults.put(PRESERVE_ORDER_FOR_PERCENT_SPLIT_KEY,
        PRESERVE_ORDER_FOR_PERCENT_SPLIT);
      m_defaults.put(SOURCE_CODE_CLASS_NAME_KEY, SOURCE_CODE_CLASS_NAME);
      m_defaults.put(OUTPUT_FONT_KEY, OUTPUT_FONT);
      m_defaults.put(OUTPUT_TEXT_COLOR_KEY, OUTPUT_TEXT_COLOR);
      m_defaults.put(OUTPUT_BACKGROUND_COLOR_KEY, OUTPUT_BACKGROUND_COLOR);
    }
=======
    return Messages.getInstance().getString(
      "ClassifierPanel_GetTabTitleToolTip_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Tests out the classifier panel from the command line.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param args may optionally contain the name of a dataset to load.
   */
  public static void main(String[] args) {

    try {
<<<<<<< HEAD
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Classifier");
=======
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages
        .getInstance().getString("ClassifierPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.getContentPane().setLayout(new BorderLayout());
      final ClassifierPanel sp = new ClassifierPanel();
      jf.getContentPane().add(sp, BorderLayout.CENTER);
      weka.gui.LogPanel lp = new weka.gui.LogPanel();
      sp.setLog(lp);
      jf.getContentPane().add(lp, BorderLayout.SOUTH);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });
      jf.pack();
      jf.setSize(800, 600);
      jf.setVisible(true);
      if (args.length == 1) {
<<<<<<< HEAD
        System.err.println("Loading instances from " + args[0]);
        java.io.Reader r =
          new java.io.BufferedReader(new java.io.FileReader(args[0]));
=======
        System.err.println(Messages.getInstance().getString(
          "ClassifierPanel_Main_Error_Text")
          + args[0]);
        java.io.Reader r = new java.io.BufferedReader(new java.io.FileReader(
          args[0]));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        Instances i = new Instances(r);
        sp.setInstances(i);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
