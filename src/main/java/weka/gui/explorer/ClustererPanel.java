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
 *    ClustererPanel.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2013 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2013 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.explorer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.Clusterer;
import weka.clusterers.SimpleKMeans;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Defaults;
import weka.core.Drawable;
import weka.core.Environment;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.PluginManager;
import weka.core.SerializationHelper;
import weka.core.SerializedObject;
import weka.core.Settings;
import weka.core.Utils;
import weka.core.Version;
import weka.core.WekaPackageClassLoaderManager;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.AbstractPerspective;
<<<<<<< HEAD
=======
=======
import java.awt.BorderLayout;
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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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

import weka.clusterers.ClusterEvaluation;
import weka.clusterers.Clusterer;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Drawable;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.InstancesSummaryPanel;
import weka.gui.ListSelectorDialog;
import weka.gui.Logger;
<<<<<<< HEAD
import weka.gui.PerspectiveInfo;
=======
<<<<<<< HEAD
import weka.gui.PerspectiveInfo;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.PropertyPanel;
import weka.gui.ResultHistoryPanel;
import weka.gui.SaveBuffer;
import weka.gui.SetInstancesPanel;
import weka.gui.SysErrLog;
import weka.gui.TaskLogger;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeEvent;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeListener;
import weka.gui.explorer.Explorer.ExplorerPanel;
import weka.gui.explorer.Explorer.LogHandler;
import weka.gui.hierarchyvisualizer.HierarchyVisualizer;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.visualize.VisualizePanel;
import weka.gui.visualize.plugins.TreeVisualizePlugin;

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
<<<<<<< HEAD
=======
=======
import weka.gui.visualize.Plot2D;
import weka.gui.visualize.PlotData2D;
import weka.gui.visualize.VisualizePanel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * This panel allows the user to select and configure a clusterer, and evaluate
 * the clusterer using a number of testing modes (test on the training data,
 * train/test on a percentage split, test on a separate split). The results of
 * clustering runs are stored in a result history so that previous results are
 * accessible.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 14497 $
 */
@PerspectiveInfo(ID = "weka.gui.explorer.clustererpanel", title = "Cluster",
  toolTipText = "Cluster instances",
  iconPath = "weka/gui/weka_icon_new_small.png")
public class ClustererPanel extends AbstractPerspective implements
  CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {
<<<<<<< HEAD
=======
=======
 * @version $Revision: 9728 $
 */
public class ClustererPanel extends JPanel implements
    CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  static final long serialVersionUID = -2474932792950820990L;

  /** the parent frame */
  protected Explorer m_Explorer = null;

  /** The filename extension that should be used for model files */
  public static String MODEL_FILE_EXTENSION = ".model";

  /** Lets the user configure the clusterer */
  protected GenericObjectEditor m_ClustererEditor = new GenericObjectEditor();

  /** The panel showing the current clusterer selection */
  protected PropertyPanel m_CLPanel = new PropertyPanel(m_ClustererEditor);

  /** The output area for classification results */
  protected JTextArea m_OutText = new JTextArea(20, 40);

  /** The destination for log/status messages */
  protected Logger m_Log = new SysErrLog();

  /** The buffer saving object for saving output */
  SaveBuffer m_SaveOut = new SaveBuffer(m_Log, this);

  /** A panel controlling results viewing */
  protected ResultHistoryPanel m_History = new ResultHistoryPanel(m_OutText);

  /** Click to set test mode to generate a % split */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JRadioButton m_PercentBut = new JRadioButton("Percentage split");

  /** Click to set test mode to test on training data */
  protected JRadioButton m_TrainBut = new JRadioButton("Use training set");

  /** Click to set test mode to a user-specified test set */
  protected JRadioButton m_TestSplitBut = new JRadioButton("Supplied test set");

  /** Click to set test mode to classes to clusters based evaluation */
  protected JRadioButton m_ClassesToClustersBut = new JRadioButton(
    "Classes to clusters evaluation");
<<<<<<< HEAD
=======
=======
  protected JRadioButton m_PercentBut = new JRadioButton(Messages.getInstance()
      .getString("ClustererPanel_PercentBut_JRadioButton_Text"));

  /** Click to set test mode to test on training data */
  protected JRadioButton m_TrainBut = new JRadioButton(Messages.getInstance()
      .getString("ClustererPanel_TrainBut_JRadioButton_Text"));

  /** Click to set test mode to a user-specified test set */
  protected JRadioButton m_TestSplitBut = new JRadioButton(Messages
      .getInstance().getString("ClustererPanel_TestSplitBut_JRadioButton_Text"));

  /** Click to set test mode to classes to clusters based evaluation */
  protected JRadioButton m_ClassesToClustersBut = new JRadioButton(Messages
      .getInstance().getString(
          "ClustererPanel_ClassesToClustersBut_JRadioButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Lets the user select the class column for classes to clusters based
   * evaluation
   */
  protected JComboBox m_ClassCombo = new JComboBox();

  /** Label by where the % split is entered */
  protected JLabel m_PercentLab = new JLabel("%", SwingConstants.RIGHT);

  /** The field where the % split is entered */
  protected JTextField m_PercentText = new JTextField("66");

  /** The button used to open a separate test dataset */
<<<<<<< HEAD
  protected JButton m_SetTestBut = new JButton("Set...");
=======
<<<<<<< HEAD
  protected JButton m_SetTestBut = new JButton("Set...");
=======
  protected JButton m_SetTestBut = new JButton(Messages.getInstance()
      .getString("ClustererPanel_SetTestBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The frame used to show the test set selection panel */
  protected JFrame m_SetTestFrame;

  /**
   * The button used to popup a list for choosing attributes to ignore while
   * clustering
   */
<<<<<<< HEAD
  protected JButton m_ignoreBut = new JButton("Ignore attributes");
=======
<<<<<<< HEAD
  protected JButton m_ignoreBut = new JButton("Ignore attributes");
=======
  protected JButton m_ignoreBut = new JButton(Messages.getInstance().getString(
      "ClustererPanel_IgnoreBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  protected DefaultListModel m_ignoreKeyModel = new DefaultListModel();
  protected JList m_ignoreKeyList = new JList(m_ignoreKeyModel);

  // protected Remove m_ignoreFilter = null;

  /**
   * Alters the enabled/disabled status of elements associated with each radio
   * button
   */
  ActionListener m_RadioListener = new ActionListener() {
<<<<<<< HEAD
    @Override
=======
<<<<<<< HEAD
    @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public void actionPerformed(ActionEvent e) {
      updateRadioLinks();
    }
  };

  /** Click to start running the clusterer */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JButton m_StartBut = new JButton("Start");

  /** Stop the class combo from taking up to much space */
  private final Dimension COMBO_SIZE = new Dimension(250,
    m_StartBut.getPreferredSize().height);

  /** Click to stop a running clusterer */
  protected JButton m_StopBut = new JButton("Stop");
<<<<<<< HEAD
=======
=======
  protected JButton m_StartBut = new JButton(Messages.getInstance().getString(
      "ClustererPanel_StartBut_JButton_Text"));

  /** Stop the class combo from taking up to much space */
  private final Dimension COMBO_SIZE = new Dimension(250,
      m_StartBut.getPreferredSize().height);

  /** Click to stop a running clusterer */
  protected JButton m_StopBut = new JButton(Messages.getInstance().getString(
      "ClustererPanel_StopBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The main set of instances we're playing with */
  protected Instances m_Instances;

  /** The user-supplied test set (if any) */
  protected Instances m_TestInstances;

  /** The current visualization object */
  protected VisualizePanel m_CurrentVis = null;

  /**
   * Check to save the predictions in the results list for visualizing later on
   */
<<<<<<< HEAD
  protected JCheckBox m_StorePredictionsBut = new JCheckBox(
    "Store clusters for visualization");
=======
<<<<<<< HEAD
  protected JCheckBox m_StorePredictionsBut = new JCheckBox(
    "Store clusters for visualization");
=======
  protected JCheckBox m_StorePredictionsBut = new JCheckBox(Messages
      .getInstance().getString("ClustererPanel_StopBut_JCheckBox_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** A thread that clustering runs in */
  protected Thread m_RunThread;

  /** The instances summary panel displayed by m_SetTestFrame */
  protected InstancesSummaryPanel m_Summary;

  /** Filter to ensure only model files are selected */
  protected FileFilter m_ModelFilter = new ExtensionFileFilter(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    MODEL_FILE_EXTENSION, "Model object files");

  /** The file chooser for selecting model files */
  protected JFileChooser m_FileChooser = new JFileChooser(new File(
    System.getProperty("user.dir")));

  /** Whether startup settings have been applied yet or not */
  protected boolean m_initialSettingsSet;
<<<<<<< HEAD
=======
=======
      MODEL_FILE_EXTENSION, Messages.getInstance().getString(
          "ClustererPanel_ModelFilter_ExtensionFileFilter_Text"));

  /** The file chooser for selecting model files */
  protected JFileChooser m_FileChooser = new JFileChooser(new File(
      System.getProperty("user.dir")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /* Register the property editors we need */
  static {
    GenericObjectEditor.registerEditors();
  }

  /**
   * Creates the clusterer panel
   */
  public ClustererPanel() {

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
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JPanel historyHolder = new JPanel(new BorderLayout());
    historyHolder.setBorder(BorderFactory
      .createTitledBorder("Result list (right-click for options)"));
    historyHolder.add(m_History, BorderLayout.CENTER);
    m_ClustererEditor.setClassType(Clusterer.class);
    m_ClustererEditor.setValue(ExplorerDefaults.getClusterer());
    m_ClustererEditor.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
<<<<<<< HEAD
=======
=======
    m_History.setBorder(BorderFactory.createTitledBorder(Messages.getInstance()
        .getString(
            "ClustererPanel_History_BorderFactoryCreateTitledBorder_Text")));
    m_ClustererEditor.setClassType(Clusterer.class);
    m_ClustererEditor.setValue(ExplorerDefaults.getClusterer());
    m_ClustererEditor.addPropertyChangeListener(new PropertyChangeListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void propertyChange(PropertyChangeEvent e) {
        m_StartBut.setEnabled(true);
        Capabilities currentFilter = m_ClustererEditor.getCapabilitiesFilter();
        Clusterer clusterer = (Clusterer) m_ClustererEditor.getValue();
        Capabilities currentSchemeCapabilities = null;
        if (clusterer != null && currentFilter != null
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          && (clusterer instanceof CapabilitiesHandler)) {
          currentSchemeCapabilities =
            ((CapabilitiesHandler) clusterer).getCapabilities();

          if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
            && !currentSchemeCapabilities.supports(currentFilter)) {
<<<<<<< HEAD
=======
=======
            && (clusterer instanceof CapabilitiesHandler)) {
          currentSchemeCapabilities = ((CapabilitiesHandler) clusterer)
              .getCapabilities();

          if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
              && !currentSchemeCapabilities.supports(currentFilter)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            m_StartBut.setEnabled(false);
          }
        }
        repaint();
      }
    });

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_TrainBut.setToolTipText("Cluster the same set that the clusterer"
      + " is trained on");
    m_PercentBut.setToolTipText("Train on a percentage of the data and"
      + " cluster the remainder");
    m_TestSplitBut.setToolTipText("Cluster a user-specified dataset");
    m_ClassesToClustersBut.setToolTipText("Evaluate clusters with respect to a"
      + " class");
    m_ClassCombo.setToolTipText("Select the class attribute for class based"
      + " evaluation");
    m_StartBut.setToolTipText("Starts the clustering");
    m_StopBut.setToolTipText("Stops a running clusterer");
    m_StorePredictionsBut
      .setToolTipText("Store predictions in the result list for later "
        + "visualization");
    m_ignoreBut.setToolTipText("Ignore attributes during clustering");
<<<<<<< HEAD
=======
=======
    m_TrainBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_TrainBut_SetToolTipText_Text"));
    m_PercentBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_PercentBut_SetToolTipText_Text"));
    m_TestSplitBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_TestSplitBut_SetToolTipText_Text"));
    m_ClassesToClustersBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_ClassesToClustersBut_SetToolTipText_Text"));
    m_ClassCombo.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_ClassCombo_SetToolTipText_Text"));
    m_StartBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_StartBut_SetToolTipText_Text"));
    m_StopBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_StartBut_StopBut_Text"));
    m_StorePredictionsBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_StorePredictionsBut_SetToolTipText_Text"));
    m_ignoreBut.setToolTipText(Messages.getInstance().getString(
        "ClustererPanel_IgnoreBut_SetToolTipText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_FileChooser.setFileFilter(m_ModelFilter);
    m_FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

    m_ClassCombo.setPreferredSize(COMBO_SIZE);
    m_ClassCombo.setMaximumSize(COMBO_SIZE);
    m_ClassCombo.setMinimumSize(COMBO_SIZE);
    m_ClassCombo.setEnabled(false);

    m_PercentBut.setSelected(ExplorerDefaults.getClustererTestMode() == 2);
    m_TrainBut.setSelected(ExplorerDefaults.getClustererTestMode() == 3);
    m_TestSplitBut.setSelected(ExplorerDefaults.getClustererTestMode() == 4);
    m_ClassesToClustersBut
<<<<<<< HEAD
      .setSelected(ExplorerDefaults.getClustererTestMode() == 5);
    m_StorePredictionsBut.setSelected(ExplorerDefaults
      .getClustererStoreClustersForVis());
=======
<<<<<<< HEAD
      .setSelected(ExplorerDefaults.getClustererTestMode() == 5);
    m_StorePredictionsBut.setSelected(ExplorerDefaults
      .getClustererStoreClustersForVis());
=======
        .setSelected(ExplorerDefaults.getClustererTestMode() == 5);
    m_StorePredictionsBut.setSelected(ExplorerDefaults
        .getClustererStoreClustersForVis());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    updateRadioLinks();
    ButtonGroup bg = new ButtonGroup();
    bg.add(m_TrainBut);
    bg.add(m_PercentBut);
    bg.add(m_TestSplitBut);
    bg.add(m_ClassesToClustersBut);
    m_TrainBut.addActionListener(m_RadioListener);
    m_PercentBut.addActionListener(m_RadioListener);
    m_TestSplitBut.addActionListener(m_RadioListener);
    m_ClassesToClustersBut.addActionListener(m_RadioListener);
    m_SetTestBut.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        setTestSet();
      }
    });

    m_StartBut.setEnabled(false);
    m_StopBut.setEnabled(false);
    m_ignoreBut.setEnabled(false);
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

        if (proceed) {
          startClusterer();
        }
      }
    });
    m_StopBut.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        stopClusterer();
      }
    });

    m_ignoreBut.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        setIgnoreColumns();
      }
    });

    m_History.setHandleRightClicks(false);
    // see if we can popup a menu for the selected result
    m_History.getList().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          || e.isAltDown()) {
          int index = m_History.getList().locationToIndex(e.getPoint());
          if (index != -1) {
            List<String> selectedEls =
              (List<String>) m_History.getList().getSelectedValuesList();
            visualizeClusterer(selectedEls, e.getX(), e.getY());
<<<<<<< HEAD
=======
=======
            || e.isAltDown()) {
          int index = m_History.getList().locationToIndex(e.getPoint());
          if (index != -1) {
            String name = m_History.getNameAtIndex(index);
            visualizeClusterer(name, e.getX(), e.getY());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          } else {
            visualizeClusterer(null, e.getX(), e.getY());
          }
        }
      }
    });

    m_ClassCombo.addActionListener(new ActionListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        updateCapabilitiesFilter(m_ClustererEditor.getCapabilitiesFilter());
      }
    });

    // Layout the GUI
    JPanel p1 = new JPanel();
    p1.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Clusterer"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Clusterer"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
        BorderFactory.createTitledBorder(Messages.getInstance().getString(
            "ClustererPanel_P1_BorderFactoryCreateTitledBorder_Text")),
        BorderFactory.createEmptyBorder(0, 5, 5, 5)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p1.setLayout(new BorderLayout());
    p1.add(m_CLPanel, BorderLayout.NORTH);

    JPanel p2 = new JPanel();
    GridBagLayout gbL = new GridBagLayout();
    p2.setLayout(gbL);
    p2.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Cluster mode"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
<<<<<<< HEAD
      BorderFactory.createTitledBorder("Cluster mode"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
=======
        BorderFactory.createTitledBorder(Messages.getInstance().getString(
            "ClustererPanel_P2_BorderFactoryCreateTitledBorder_Text")),
        BorderFactory.createEmptyBorder(0, 5, 5, 5)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
    gbL.setConstraints(m_PercentBut, gbC);
    p2.add(m_PercentBut);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 2;
    gbC.gridx = 1;
    gbC.insets = new Insets(2, 10, 2, 10);
    gbL.setConstraints(m_PercentLab, gbC);
    p2.add(m_PercentLab);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.EAST;
    gbC.fill = GridBagConstraints.HORIZONTAL;
    gbC.gridy = 2;
    gbC.gridx = 2;
    gbC.weightx = 100;
    gbC.ipadx = 20;
    gbL.setConstraints(m_PercentText, gbC);
    p2.add(m_PercentText);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 3;
    gbC.gridx = 0;
    gbC.gridwidth = 2;
    gbL.setConstraints(m_ClassesToClustersBut, gbC);
    p2.add(m_ClassesToClustersBut);

    m_ClassCombo.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 4;
    gbC.gridx = 0;
    gbC.gridwidth = 2;
    gbL.setConstraints(m_ClassCombo, gbC);
    p2.add(m_ClassCombo);

    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.WEST;
    gbC.gridy = 5;
    gbC.gridx = 0;
    gbC.gridwidth = 2;
    gbL.setConstraints(m_StorePredictionsBut, gbC);
    p2.add(m_StorePredictionsBut);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // Any launcher plugins
    List<String> pluginsVector =
      PluginManager.getPluginNamesOfTypeList(ClustererPanelLaunchHandlerPlugin.class.getName());
    JButton pluginBut = null;
    if (pluginsVector.size() == 1) {
      try {
        // display a single button
        String className = pluginsVector.get(0);
        final ClustererPanelLaunchHandlerPlugin plugin =
          (ClustererPanelLaunchHandlerPlugin) WekaPackageClassLoaderManager
            .objectForName(className);
        // Class.forName(className).newInstance();
        if (plugin != null) {
          plugin.setClustererPanel(this);
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
      // make a popup menu
      int okPluginCount = 0;
      final java.awt.PopupMenu pluginPopup = new java.awt.PopupMenu();

      for (int i = 0; i < pluginsVector.size(); i++) {
        String className = (pluginsVector.get(i));
        try {
          final ClustererPanelLaunchHandlerPlugin plugin =
            (ClustererPanelLaunchHandlerPlugin) WekaPackageClassLoaderManager
              .objectForName(className);
          // Class.forName(className).newInstance();

          if (plugin == null) {
            continue;
          }
          okPluginCount++;
          plugin.setClustererPanel(this);
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

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JPanel buttons = new JPanel();
    buttons.setLayout(new GridLayout(2, 1));
    JPanel ssButs = new JPanel();
    ssButs.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
=======
=======
    ssButs.setLayout(new GridLayout(1, 2, 5, 5));
    ssButs.add(m_StartBut);
    ssButs.add(m_StopBut);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JPanel ib = new JPanel();
    ib.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    ib.setLayout(new GridLayout(1, 1, 5, 5));
    ib.add(m_ignoreBut);
    buttons.add(ib);
    buttons.add(ssButs);

    JPanel p3 = new JPanel();
<<<<<<< HEAD
    p3.setBorder(BorderFactory.createTitledBorder("Clusterer output"));
=======
<<<<<<< HEAD
    p3.setBorder(BorderFactory.createTitledBorder("Clusterer output"));
=======
    p3.setBorder(BorderFactory.createTitledBorder(Messages.getInstance()
        .getString("ClustererPanel_P3_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p3.setLayout(new BorderLayout());
    final JScrollPane js = new JScrollPane(m_OutText);
    p3.add(js, BorderLayout.CENTER);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;

<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
    gbL.setConstraints(historyHolder, gbC);
    mondo.add(historyHolder);
=======
    gbL.setConstraints(m_History, gbC);
    mondo.add(m_History);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
    m_PercentText.setEnabled(m_PercentBut.isSelected());
    m_PercentLab.setEnabled(m_PercentBut.isSelected());
    m_ClassCombo.setEnabled(m_ClassesToClustersBut.isSelected());

    updateCapabilitiesFilter(m_ClustererEditor.getCapabilitiesFilter());
  }

  /**
   * Sets the Logger to receive informational messages
   * 
   * @param newLog the Logger that will now get info messages
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setLog(Logger newLog) {

    m_Log = newLog;
  }

  /**
   * Tells the panel to use a new set of instances.
   * 
   * @param inst a set of Instances
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setInstances(Instances inst) {

    m_Instances = inst;

    m_ignoreKeyModel.removeAllElements();

    String[] attribNames = new String[m_Instances.numAttributes()];
    for (int i = 0; i < m_Instances.numAttributes(); i++) {
      String name = m_Instances.attribute(i).name();
      m_ignoreKeyModel.addElement(name);
<<<<<<< HEAD
      String type =
        "(" + Attribute.typeToStringShort(m_Instances.attribute(i)) + ") ";
      String attnm = m_Instances.attribute(i).name();
=======
<<<<<<< HEAD
      String type =
        "(" + Attribute.typeToStringShort(m_Instances.attribute(i)) + ") ";
      String attnm = m_Instances.attribute(i).name();
=======

      String type = "";
      switch (m_Instances.attribute(i).type()) {
      case Attribute.NOMINAL:
        type = Messages.getInstance().getString(
            "ClustererPanel_SetInstances_Type_AttributeNOMINAL_Text");
        break;
      case Attribute.NUMERIC:
        type = Messages.getInstance().getString(
            "ClustererPanel_SetInstances_Type_AttributeNUMERIC_Text");
        break;
      case Attribute.STRING:
        type = Messages.getInstance().getString(
            "ClustererPanel_SetInstances_Type_AttributeSTRING_Text");
        break;
      case Attribute.DATE:
        type = Messages.getInstance().getString(
            "ClustererPanel_SetInstances_Type_AttributeDATE_Text");
        break;
      case Attribute.RELATIONAL:
        type = Messages.getInstance().getString(
            "ClustererPanel_SetInstances_Type_AttributeRELATIONAL_Text");
        break;
      default:
        type = Messages.getInstance().getString(
            "ClustererPanel_SetInstances_Type_AttributeDEFAULT_Text");
      }
      String attnm = m_Instances.attribute(i).name();

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      attribNames[i] = type + attnm;
    }

    m_StartBut.setEnabled(m_RunThread == null);
    m_StopBut.setEnabled(m_RunThread != null);
    m_ignoreBut.setEnabled(true);
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
<<<<<<< HEAD
=======
=======
    if (inst.classIndex() == -1)
      m_ClassCombo.setSelectedIndex(attribNames.length - 1);
    else
      m_ClassCombo.setSelectedIndex(inst.classIndex());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    updateRadioLinks();
  }

  /**
   * Sets the user test set. Information about the current test set is displayed
   * in an InstanceSummaryPanel and the user is given the ability to load
   * another set from a file or url.
   * 
   */
  protected void setTestSet() {

    if (m_SetTestFrame == null) {
      final SetInstancesPanel sp = new SetInstancesPanel();
      sp.setReadIncrementally(false);
      m_Summary = sp.getSummary();
      if (m_TestInstances != null) {
        sp.setInstances(m_TestInstances);
      }
      sp.addPropertyChangeListener(new PropertyChangeListener() {
<<<<<<< HEAD
        @Override
=======
<<<<<<< HEAD
        @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        public void propertyChange(PropertyChangeEvent e) {
          m_TestInstances = sp.getInstances();
          m_TestInstances.setClassIndex(-1); // make sure that no class
                                             // attribute is set!
        }
      });
      // Add propertychangelistener to update m_TestInstances whenever
      // it changes in the settestframe
<<<<<<< HEAD
      m_SetTestFrame = Utils.getWekaJFrame("Test Instances", this);
=======
<<<<<<< HEAD
      m_SetTestFrame = Utils.getWekaJFrame("Test Instances", this);
=======
      m_SetTestFrame = new JFrame(Messages.getInstance().getString(
          "ClustererPanel_SetUpVisualizableInstances_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      sp.setParentFrame(m_SetTestFrame); // enable Close-Button
      m_SetTestFrame.getContentPane().setLayout(new BorderLayout());
      m_SetTestFrame.getContentPane().add(sp, BorderLayout.CENTER);
      m_SetTestFrame.pack();
<<<<<<< HEAD
      m_SetTestFrame.setSize(400,200);
    }
    m_SetTestFrame.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
<<<<<<< HEAD
      m_SetTestFrame.setSize(400,200);
    }
    m_SetTestFrame.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_SetTestFrame.setVisible(true);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
   * Sets up the structure for the visualizable instances. This dataset contains
   * the original attributes plus the clusterer's cluster assignments
   * 
   * @param testInstances the instances that the clusterer has clustered
   * @param eval the evaluation to use
   * @return a PlotData2D object encapsulating the visualizable instances. The
   *         instances contain one more attribute (predicted cluster) than the
   *         testInstances
   */
  public static PlotData2D setUpVisualizableInstances(Instances testInstances,
      ClusterEvaluation eval) throws Exception {

    int numClusters = eval.getNumClusters();
    double[] clusterAssignments = eval.getClusterAssignments();

    FastVector hv = new FastVector();
    Instances newInsts;

    Attribute predictedCluster;
    FastVector clustVals = new FastVector();

    for (int i = 0; i < numClusters; i++) {
      clustVals.addElement(Messages.getInstance().getString(
          "ClustererPanel_SetUpVisualizableInstances_ClustVals_Text")
          + i);
    }
    predictedCluster = new Attribute(Messages.getInstance().getString(
        "ClustererPanel_SetUpVisualizableInstances_PredictedCluster_Text"),
        clustVals);
    for (int i = 0; i < testInstances.numAttributes(); i++) {
      hv.addElement(testInstances.attribute(i).copy());
    }
    hv.addElement(predictedCluster);

    newInsts = new Instances(testInstances.relationName() + "_clustered", hv,
        testInstances.numInstances());

    double[] values;
    int j;
    int[] pointShapes = null;
    int[] classAssignments = null;
    if (testInstances.classIndex() >= 0) {
      classAssignments = eval.getClassesToClusters();
      pointShapes = new int[testInstances.numInstances()];
      for (int i = 0; i < testInstances.numInstances(); i++) {
        pointShapes[i] = Plot2D.CONST_AUTOMATIC_SHAPE;
      }
    }

    for (int i = 0; i < testInstances.numInstances(); i++) {
      values = new double[newInsts.numAttributes()];
      for (j = 0; j < testInstances.numAttributes(); j++) {
        values[j] = testInstances.instance(i).value(j);
      }
      if (clusterAssignments[i] < 0) {
        values[j] = Instance.missingValue();
      } else {
        values[j] = clusterAssignments[i];
      }
      newInsts.add(new Instance(1.0, values));
      if (pointShapes != null) {
        if (clusterAssignments[i] >= 0) {
          if ((int) testInstances.instance(i).classValue() != classAssignments[(int) clusterAssignments[i]]) {
            pointShapes[i] = Plot2D.ERROR_SHAPE;
          }
        } else {
          pointShapes[i] = Plot2D.MISSING_SHAPE;
        }
      }
    }
    PlotData2D plotData = new PlotData2D(newInsts);
    if (pointShapes != null) {
      plotData.setShapeType(pointShapes);
    }
    plotData.addInstanceNumberAttribute();
    return plotData;
  }

  /**
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Starts running the currently configured clusterer with the current
   * settings. This is run in a separate thread, and will only start if there is
   * no clusterer already running. The clusterer output is sent to the results
   * history panel.
   */
  protected void startClusterer() {

    if (m_RunThread == null) {
      m_StartBut.setEnabled(false);
      m_StopBut.setEnabled(true);
      m_ignoreBut.setEnabled(false);
      m_RunThread = new Thread() {
        @Override
        public void run() {
<<<<<<< HEAD
          m_CLPanel.addToHistory();

=======
<<<<<<< HEAD
          m_CLPanel.addToHistory();

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          // for timing
          long trainTimeStart = 0, trainTimeElapsed = 0;

          // Copy the current state of things
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_Log.statusMessage("Setting up...");
          Instances inst = new Instances(m_Instances);
          inst.setClassIndex(-1);
          Instances userTest = null;
          ClustererAssignmentsPlotInstances plotInstances =
            ExplorerDefaults.getClustererAssignmentsPlotInstances();
          plotInstances.setClusterer((Clusterer) m_ClustererEditor.getValue());
<<<<<<< HEAD
=======
=======
          m_Log
              .statusMessage(Messages
                  .getInstance()
                  .getString(
                      "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Text_First"));
          Instances inst = new Instances(m_Instances);
          inst.setClassIndex(-1);
          Instances userTest = null;
          PlotData2D predData = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (m_TestInstances != null) {
            userTest = new Instances(m_TestInstances);
          }

          boolean saveVis = m_StorePredictionsBut.isSelected();
          String grph = null;
          int[] ignoredAtts = null;

          int testMode = 0;
          int percent = 66;
          Clusterer clusterer = (Clusterer) m_ClustererEditor.getValue();
          Clusterer fullClusterer = null;
          StringBuffer outBuff = new StringBuffer();
<<<<<<< HEAD
          String name =
            (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
=======
<<<<<<< HEAD
          String name =
            (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
=======
          String name = (new SimpleDateFormat("HH:mm:ss - "))
              .format(new Date());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          String cname = clusterer.getClass().getName();
          if (cname.startsWith("weka.clusterers.")) {
            name += cname.substring("weka.clusterers.".length());
          } else {
            name += cname;
          }
          String cmd = m_ClustererEditor.getValue().getClass().getName();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (m_ClustererEditor.getValue() instanceof OptionHandler) {
            cmd +=
              " "
                + Utils.joinOptions(((OptionHandler) m_ClustererEditor
                  .getValue()).getOptions());
          }
          try {
            m_Log.logMessage("Started " + cname);
            m_Log.logMessage("Command: " + cmd);
<<<<<<< HEAD
=======
=======
          if (m_ClustererEditor.getValue() instanceof OptionHandler)
            cmd += " "
                + Utils.joinOptions(((OptionHandler) m_ClustererEditor
                    .getValue()).getOptions());
          try {
            m_Log.logMessage(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_Log_LogMessage_Text_First")
                + cname);
            m_Log.logMessage(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_Log_LogMessage_Text_Second")
                + cmd);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
            if (m_PercentBut.isSelected()) {
              testMode = 2;
              percent = Integer.parseInt(m_PercentText.getText());
              if ((percent <= 0) || (percent >= 100)) {
<<<<<<< HEAD
                throw new Exception("Percentage must be between 0 and 100");
=======
<<<<<<< HEAD
                throw new Exception("Percentage must be between 0 and 100");
=======
                throw new Exception(Messages.getInstance().getString(
                    "ClustererPanel_StartClusterer_Run_Exception_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              }
            } else if (m_TrainBut.isSelected()) {
              testMode = 3;
            } else if (m_TestSplitBut.isSelected()) {
              testMode = 4;
              // Check the test instance compatibility
              if (userTest == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                throw new Exception("No user test set has been opened");
              }
              if (!inst.equalHeaders(userTest)) {
                throw new Exception("Train and test set are not compatible\n"
                  + inst.equalHeadersMsg(userTest));
<<<<<<< HEAD
=======
=======
                throw new Exception(Messages.getInstance().getString(
                    "ClustererPanel_StartClusterer_Run_Exception_Text_Second"));
              }
              if (!inst.equalHeaders(userTest)) {
                throw new Exception(Messages.getInstance().getString(
                    "ClustererPanel_StartClusterer_Run_Exception_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              }
            } else if (m_ClassesToClustersBut.isSelected()) {
              testMode = 5;
            } else {
<<<<<<< HEAD
              throw new Exception("Unknown test mode");
=======
<<<<<<< HEAD
              throw new Exception("Unknown test mode");
=======
              throw new Exception(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_Exception_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }

            Instances trainInst = new Instances(inst);
            if (m_ClassesToClustersBut.isSelected()) {
              trainInst.setClassIndex(m_ClassCombo.getSelectedIndex());
              inst.setClassIndex(m_ClassCombo.getSelectedIndex());
              if (inst.classAttribute().isNumeric()) {
<<<<<<< HEAD
                throw new Exception("Class must be nominal for class based "
                  + "evaluation!");
=======
<<<<<<< HEAD
                throw new Exception("Class must be nominal for class based "
                  + "evaluation!");
=======
                throw new Exception(Messages.getInstance().getString(
                    "ClustererPanel_StartClusterer_Run_Exception_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              }
            }
            if (!m_ignoreKeyList.isSelectionEmpty()) {
              trainInst = removeIgnoreCols(trainInst);
            }

            // Output some header information
<<<<<<< HEAD
            outBuff.append("=== Run information ===\n\n");
            outBuff.append("Scheme:       " + cname);
=======
<<<<<<< HEAD
            outBuff.append("=== Run information ===\n\n");
            outBuff.append("Scheme:       " + cname);
=======
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_First"));
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Second")
                + cname);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (clusterer instanceof OptionHandler) {
              String[] o = ((OptionHandler) clusterer).getOptions();
              outBuff.append(" " + Utils.joinOptions(o));
            }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            outBuff.append("\n");
            outBuff.append("Relation:     " + inst.relationName() + '\n');
            outBuff.append("Instances:    " + inst.numInstances() + '\n');
            outBuff.append("Attributes:   " + inst.numAttributes() + '\n');
<<<<<<< HEAD
=======
=======
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Third"));
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Fourth")
                + inst.relationName() + '\n');
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Sixth")
                + inst.numInstances() + '\n');
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Eighth")
                + inst.numAttributes() + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (inst.numAttributes() < 100) {
              boolean[] selected = new boolean[inst.numAttributes()];
              for (int i = 0; i < inst.numAttributes(); i++) {
                selected[i] = true;
              }
              if (!m_ignoreKeyList.isSelectionEmpty()) {
                int[] indices = m_ignoreKeyList.getSelectedIndices();
                for (int i = 0; i < indices.length; i++) {
                  selected[indices[i]] = false;
                }
              }
              if (m_ClassesToClustersBut.isSelected()) {
                selected[m_ClassCombo.getSelectedIndex()] = false;
              }
              for (int i = 0; i < inst.numAttributes(); i++) {
                if (selected[i]) {
                  outBuff.append("              " + inst.attribute(i).name()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                    + '\n');
                }
              }
              if (!m_ignoreKeyList.isSelectionEmpty()
                || m_ClassesToClustersBut.isSelected()) {
                outBuff.append("Ignored:\n");
                for (int i = 0; i < inst.numAttributes(); i++) {
                  if (!selected[i]) {
                    outBuff.append("              " + inst.attribute(i).name()
                      + '\n');
<<<<<<< HEAD
=======
=======
                      + '\n');
                }
              }
              if (!m_ignoreKeyList.isSelectionEmpty()
                  || m_ClassesToClustersBut.isSelected()) {
                outBuff
                    .append(Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Eleventh"));
                for (int i = 0; i < inst.numAttributes(); i++) {
                  if (!selected[i]) {
                    outBuff.append("              " + inst.attribute(i).name()
                        + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  }
                }
              }
            } else {
<<<<<<< HEAD
              outBuff.append("              [list of attributes omitted]\n");
=======
<<<<<<< HEAD
              outBuff.append("              [list of attributes omitted]\n");
=======
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Thirteenth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }

            if (!m_ignoreKeyList.isSelectionEmpty()) {
              ignoredAtts = m_ignoreKeyList.getSelectedIndices();
            }

            if (m_ClassesToClustersBut.isSelected()) {
              // add class to ignored list
              if (ignoredAtts == null) {
                ignoredAtts = new int[1];
                ignoredAtts[0] = m_ClassCombo.getSelectedIndex();
              } else {
                int[] newIgnoredAtts = new int[ignoredAtts.length + 1];
                System.arraycopy(ignoredAtts, 0, newIgnoredAtts, 0,
<<<<<<< HEAD
                  ignoredAtts.length);
                newIgnoredAtts[ignoredAtts.length] =
                  m_ClassCombo.getSelectedIndex();
=======
<<<<<<< HEAD
                  ignoredAtts.length);
                newIgnoredAtts[ignoredAtts.length] =
                  m_ClassCombo.getSelectedIndex();
=======
                    ignoredAtts.length);
                newIgnoredAtts[ignoredAtts.length] = m_ClassCombo
                    .getSelectedIndex();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                ignoredAtts = newIgnoredAtts;
              }
            }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            outBuff.append("Test mode:    ");
            switch (testMode) {
            case 3: // Test on training
              outBuff.append("evaluate on training data\n");
              break;
            case 2: // Percent split
              outBuff.append("split " + percent + "% train, remainder test\n");
              break;
            case 4: // Test on user split
              outBuff.append("user supplied test set: "
                + userTest.numInstances() + " instances\n");
              break;
            case 5: // Classes to clusters evaluation on training
              outBuff.append("Classes to clusters evaluation on training data");
<<<<<<< HEAD
=======
=======
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Fourteenth"));
            switch (testMode) {
            case 3: // Test on training
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Fifteenth"));
              break;
            case 2: // Percent split
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Sixteenth")
                      + percent
                      + Messages
                          .getInstance()
                          .getString(
                              "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Seventeenth"));
              break;
            case 4: // Test on user split
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Eighteenth")
                      + userTest.numInstances()
                      + Messages
                          .getInstance()
                          .getString(
                              "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Nineteenth"));
              break;
            case 5: // Classes to clusters evaluation on training
              outBuff.append(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_OutBuffer_Text_Twentyth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

              break;
            }
            outBuff.append("\n");
            m_History.addResult(name, outBuff);
            m_History.setSingle(name);

            // Build the model and output it.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            m_Log.statusMessage("Building model on training data...");

            // remove the class attribute (if set) and build the clusterer
            trainTimeStart = System.currentTimeMillis();
<<<<<<< HEAD
=======
=======
            m_Log.statusMessage(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Second"));

            trainTimeStart = System.currentTimeMillis();
            // remove the class attribute (if set) and build the clusterer
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            clusterer.buildClusterer(removeClass(trainInst));
            trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;

            // if (testMode == 2) {
            outBuff
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              .append("\n=== Clustering model (full training set) ===\n\n");

            outBuff.append(clusterer.toString() + '\n');
            outBuff
              .append("\nTime taken to build model (full training data) : "
                + Utils.doubleToString(trainTimeElapsed / 1000.0, 2)
                + " seconds\n\n");
<<<<<<< HEAD
=======
=======
                .append(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_StartClusterer_Run_OutBuffer_Text_TwentySecond"));

            outBuff.append(clusterer.toString() + '\n');
            outBuff
                .append(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_StartClusterer_Run_OutBuffer_Text_TimeTakenFull")
                    + Utils.doubleToString(trainTimeElapsed / 1000.0, 2)
                    + " "
                    + Messages
                        .getInstance()
                        .getString(
                            "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentyNineth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            // }
            m_History.updateResult(name);
            if (clusterer instanceof Drawable) {
              try {
                grph = ((Drawable) clusterer).graph();
              } catch (Exception ex) {
              }
            }
            // copy full model for output
            SerializedObject so = new SerializedObject(clusterer);
            fullClusterer = (Clusterer) so.getObject();

            ClusterEvaluation eval = new ClusterEvaluation();
            eval.setClusterer(clusterer);
            switch (testMode) {
            case 3:
            case 5: // Test on training
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              m_Log.statusMessage("Clustering training data...");
              eval.evaluateClusterer(trainInst, "", false);
              plotInstances.setInstances(inst);
              plotInstances.setClusterEvaluation(eval);
              outBuff
                .append("=== Model and evaluation on training set ===\n\n");
              break;

            case 2: // Percent split
              m_Log.statusMessage("Randomizing instances...");
<<<<<<< HEAD
=======
=======
              m_Log.statusMessage(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Third"));
              eval.evaluateClusterer(trainInst, "", false);
              predData = setUpVisualizableInstances(inst, eval);
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_TwentySecond"));
              break;

            case 2: // Percent split
              m_Log
                  .statusMessage(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              inst.randomize(new Random(1));
              trainInst.randomize(new Random(1));
              int trainSize = trainInst.numInstances() * percent / 100;
              int testSize = trainInst.numInstances() - trainSize;
              Instances train = new Instances(trainInst, 0, trainSize);
              Instances test = new Instances(trainInst, trainSize, testSize);
              Instances testVis = new Instances(inst, trainSize, testSize);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              m_Log.statusMessage("Building model on training split...");
              trainTimeStart = System.currentTimeMillis();
              clusterer.buildClusterer(train);
              trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;
              m_Log.statusMessage("Evaluating on test split...");
              eval.evaluateClusterer(test, "", false);
              plotInstances.setInstances(testVis);
              plotInstances.setClusterEvaluation(eval);
              outBuff.append("=== Model and evaluation on test split ===\n");
              outBuff.append(clusterer.toString() + "\n");
              outBuff
                .append("\nTime taken to build model (percentage split) : "
                  + Utils.doubleToString(trainTimeElapsed / 1000.0, 2)
                  + " seconds\n\n");
              break;

            case 4: // Test on user split
              m_Log.statusMessage("Evaluating on test data...");
<<<<<<< HEAD
=======
=======
              m_Log.statusMessage(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Fifth"));
              trainTimeStart = System.currentTimeMillis();
              clusterer.buildClusterer(train);
              trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;

              m_Log.statusMessage(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Sixth"));
              eval.evaluateClusterer(test, "", false);
              predData = setUpVisualizableInstances(testVis, eval);
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_TwentyThird"));
              outBuff.append(clusterer.toString() + '\n');
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_TimeTakenPercentage")
                      + Utils.doubleToString(trainTimeElapsed / 1000.0, 2)
                      + " "
                      + Messages
                          .getInstance()
                          .getString(
                              "ClassifierPanel_StartClassifier_OutBuffer_Text_TwentyNineth"));
              break;

            case 4: // Test on user split
              m_Log
                  .statusMessage(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Seventh"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              Instances userTestT = new Instances(userTest);
              if (!m_ignoreKeyList.isSelectionEmpty()) {
                userTestT = removeIgnoreCols(userTestT);
              }
              eval.evaluateClusterer(userTestT, "", false);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              plotInstances.setInstances(userTest);
              plotInstances.setClusterEvaluation(eval);
              outBuff.append("=== Evaluation on test set ===\n");
              break;

            default:
              throw new Exception("Test mode not implemented");
<<<<<<< HEAD
=======
=======
              predData = setUpVisualizableInstances(userTest, eval);
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_OutBuffer_Text_TwentyFourth"));
              break;

            default:
              throw new Exception(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_Exception_Text_Sixth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }
            outBuff.append(eval.clusterResultsToString());
            outBuff.append("\n");
            m_History.updateResult(name);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            m_Log.logMessage("Finished " + cname);
            m_Log.statusMessage("OK");
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane.showMessageDialog(ClustererPanel.this,
              "Problem evaluating clusterer:\n" + ex.getMessage(),
              "Evaluate clusterer", JOptionPane.ERROR_MESSAGE);
            m_Log.statusMessage("Problem evaluating clusterer");
          } finally {
            if ((plotInstances != null) && plotInstances.canPlot(true)) {
              m_CurrentVis = new VisualizePanel();
              if (getMainApplication() != null) {
                Settings settings =
                  getMainApplication().getApplicationSettings();
                m_CurrentVis.applySettings(settings,
                  weka.gui.explorer.VisualizePanel.ScatterDefaults.ID);
              }
              m_CurrentVis.setName(name + " (" + inst.relationName() + ")");
              m_CurrentVis.setLog(m_Log);
              try {
                m_CurrentVis.addPlot(plotInstances.getPlotData(name));
              } catch (Exception ex) {
                System.err.println(ex);
              }
              plotInstances.cleanUp();

              ArrayList<Object> vv = new ArrayList<Object>();
              vv.add(fullClusterer);
              Instances trainHeader = new Instances(m_Instances, 0);
              vv.add(trainHeader);
              if (ignoredAtts != null) {
                vv.add(ignoredAtts);
              }
              if (saveVis) {
                vv.add(m_CurrentVis);
                if (grph != null) {
                  vv.add(grph);
<<<<<<< HEAD
=======
=======
            m_Log.logMessage(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_Log_LogMessage_Text_Third")
                + cname);
            m_Log.statusMessage(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Eighth"));
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane
                .showMessageDialog(
                    ClustererPanel.this,
                    Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_StartClusterer_Run_JOptionPaneShowMessageDialog_Text_First")
                        + ex.getMessage(),
                    Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_StartClusterer_Run_JOptionPaneShowMessageDialog_Text_Second"),
                    JOptionPane.ERROR_MESSAGE);
            m_Log.statusMessage(Messages.getInstance().getString(
                "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Nineth"));
          } finally {
            if (predData != null) {
              m_CurrentVis = new VisualizePanel();
              m_CurrentVis.setName(name + " (" + inst.relationName() + ")");
              m_CurrentVis.setLog(m_Log);
              predData.setPlotName(name + " (" + inst.relationName() + ")");

              try {
                m_CurrentVis.addPlot(predData);
              } catch (Exception ex) {
                System.err.println(ex);
              }

              FastVector vv = new FastVector();
              vv.addElement(fullClusterer);
              Instances trainHeader = new Instances(m_Instances, 0);
              vv.addElement(trainHeader);
              if (ignoredAtts != null)
                vv.addElement(ignoredAtts);
              if (saveVis) {
                vv.addElement(m_CurrentVis);
                if (grph != null) {
                  vv.addElement(grph);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                }

              }
              m_History.addObject(name, vv);
            }
            if (isInterrupted()) {
<<<<<<< HEAD
              m_Log.logMessage("Interrupted " + cname);
              m_Log.statusMessage("See error log");
=======
<<<<<<< HEAD
              m_Log.logMessage("Interrupted " + cname);
              m_Log.statusMessage("See error log");
=======
              m_Log
                  .logMessage(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_StartClusterer_Run_Log_LogMessage_Text_Fourth")
                      + cname);
              m_Log.statusMessage(Messages.getInstance().getString(
                  "ClustererPanel_StartClusterer_Run_Log_StatusMessage_Tenth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }
            m_RunThread = null;
            m_StartBut.setEnabled(true);
            m_StopBut.setEnabled(false);
            m_ignoreBut.setEnabled(true);
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

  private Instances removeClass(Instances inst) {
    Remove af = new Remove();
    Instances retI = null;

    try {
      if (inst.classIndex() < 0) {
        retI = inst;
      } else {
        af.setAttributeIndices("" + (inst.classIndex() + 1));
        af.setInvertSelection(false);
        af.setInputFormat(inst);
        retI = Filter.useFilter(inst, af);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return retI;
  }

  private Instances removeIgnoreCols(Instances inst) {

    // If the user is doing classes to clusters evaluation and
    // they have opted to ignore the class, then unselect the class in
    // the ignore list
    if (m_ClassesToClustersBut.isSelected()) {
      int classIndex = m_ClassCombo.getSelectedIndex();
      if (m_ignoreKeyList.isSelectedIndex(classIndex)) {
        m_ignoreKeyList.removeSelectionInterval(classIndex, classIndex);
      }
    }
    int[] selected = m_ignoreKeyList.getSelectedIndices();
    Remove af = new Remove();
    Instances retI = null;

    try {
      af.setAttributeIndicesArray(selected);
      af.setInvertSelection(false);
      af.setInputFormat(inst);
      retI = Filter.useFilter(inst, af);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return retI;
  }

  private Instances removeIgnoreCols(Instances inst, int[] toIgnore) {

    Remove af = new Remove();
    Instances retI = null;

    try {
      af.setAttributeIndicesArray(toIgnore);
      af.setInvertSelection(false);
      af.setInputFormat(inst);
      retI = Filter.useFilter(inst, af);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return retI;
  }

  /**
   * Stops the currently running clusterer (if any).
   */
<<<<<<< HEAD
  @SuppressWarnings("deprecation")
=======
<<<<<<< HEAD
  @SuppressWarnings("deprecation")
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected void stopClusterer() {

    if (m_RunThread != null) {
      m_RunThread.interrupt();

      // This is deprecated (and theoretically the interrupt should do).
      m_RunThread.stop();

    }
  }

  /**
   * Pops up a TreeVisualizer for the clusterer from the currently selected item
   * in the results list
   * 
   * @param graphString the description of the tree in dotty format
   * @param treeName the title to assign to the display
   */
  protected void visualizeTree(String graphString, String treeName) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    final javax.swing.JFrame jf =
      Utils.getWekaJFrame("Weka Cluster Tree Visualizer: " + treeName, this);
    jf.getContentPane().setLayout(new BorderLayout());
    if (graphString.contains("digraph")) {
      TreeVisualizer tv =
        new TreeVisualizer(null, graphString, new PlaceNode2());
<<<<<<< HEAD
=======
=======
    final javax.swing.JFrame jf = new javax.swing.JFrame(Messages.getInstance()
        .getString("ClustererPanel_VisualizeTree_JFrame_Text") + treeName);
    jf.setSize(500, 400);
    jf.getContentPane().setLayout(new BorderLayout());
    if (graphString.contains("digraph")) {
      TreeVisualizer tv = new TreeVisualizer(null, graphString,
          new PlaceNode2());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().add(tv, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.pack();
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
      jf.setVisible(true);
      tv.fitToScreen();
    } else if (graphString.startsWith("Newick:")) {
      HierarchyVisualizer tv =
        new HierarchyVisualizer(graphString.substring(7));
<<<<<<< HEAD
=======
=======

      jf.setVisible(true);
      tv.fitToScreen();
    } else if (graphString.startsWith(Messages.getInstance().getString(
        "ClustererPanel_VisualizeTree_GraphStringStartsWith_Text"))) {
      HierarchyVisualizer tv = new HierarchyVisualizer(graphString.substring(7));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
      jf.pack();
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setVisible(true);
      tv.fitToScreen();
    }
  }

  /**
   * Pops up a visualize panel to display cluster assignments
   * 
   * @param sp the visualize panel to display
   */
  protected void visualizeClusterAssignments(VisualizePanel sp) {
    if (sp != null) {
      String plotName = sp.getName();
<<<<<<< HEAD
      final javax.swing.JFrame jf =
        Utils.getWekaJFrame("Weka Clusterer Visualize: " + plotName, this);
=======
<<<<<<< HEAD
      final javax.swing.JFrame jf =
        Utils.getWekaJFrame("Weka Clusterer Visualize: " + plotName, this);
=======
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages
          .getInstance().getString(
              "ClustererPanel_VisualizeClusterAssignments_JFrame_Text")
          + plotName);
      jf.setSize(500, 400);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(sp, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.pack();
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setVisible(true);
    }
  }

  /**
   * Handles constructing a popup menu with visualization options
   * 
<<<<<<< HEAD
   * @param names the name of the result history list entry clicked on by the
=======
<<<<<<< HEAD
   * @param names the name of the result history list entry clicked on by the
=======
   * @param name the name of the result history list entry clicked on by the
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *          user
   * @param x the x coordinate for popping up the menu
   * @param y the y coordinate for popping up the menu
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  protected void visualizeClusterer(List<String> names, int x, int y) {
    final List<String> selectedNames = names;
    JPopupMenu resultListMenu = new JPopupMenu();

    JMenuItem visMainBuffer = new JMenuItem("View in main window");
    if (selectedNames != null && selectedNames.size() == 1) {
      visMainBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.setSingle(selectedNames.get(0));
<<<<<<< HEAD
=======
=======
  protected void visualizeClusterer(String name, int x, int y) {
    final String selectedName = name;
    JPopupMenu resultListMenu = new JPopupMenu();

    JMenuItem visMainBuffer = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_VisMainBuffer_JMenuItem_Text"));
    if (selectedName != null) {
      visMainBuffer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          m_History.setSingle(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      });
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
<<<<<<< HEAD
=======
=======
    JMenuItem visSepBuffer = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_VisSepBuffer_JMenuItem_Text"));
    if (selectedName != null) {
      visSepBuffer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          m_History.openFrame(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
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
<<<<<<< HEAD
=======
=======
    JMenuItem saveOutput = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_SaveOutput_JMenuItem_Text"));
    if (selectedName != null) {
      saveOutput.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          saveBuffer(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
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
<<<<<<< HEAD
=======
=======
    JMenuItem deleteOutput = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_DeleteOutput_JMenuItem_Text"));
    if (selectedName != null) {
      deleteOutput.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          m_History.removeResult(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      });
    } else {
      deleteOutput.setEnabled(false);
    }
    resultListMenu.add(deleteOutput);

    resultListMenu.addSeparator();

<<<<<<< HEAD
    JMenuItem loadModel = new JMenuItem("Load model");
    loadModel.addActionListener(new ActionListener() {
      @Override
=======
<<<<<<< HEAD
    JMenuItem loadModel = new JMenuItem("Load model");
    loadModel.addActionListener(new ActionListener() {
      @Override
=======
    JMenuItem loadModel = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_LoadModel_JMenuItem_Text"));
    loadModel.addActionListener(new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        loadClusterer();
      }
    });
    resultListMenu.add(loadModel);

<<<<<<< HEAD
    ArrayList<Object> o = null;
    if (selectedNames != null && selectedNames.size() == 1) {
      o = (ArrayList<Object>) m_History.getNamedObject(selectedNames.get(0));
=======
<<<<<<< HEAD
    ArrayList<Object> o = null;
    if (selectedNames != null && selectedNames.size() == 1) {
      o = (ArrayList<Object>) m_History.getNamedObject(selectedNames.get(0));
=======
    FastVector o = null;
    if (selectedName != null) {
      o = (FastVector) m_History.getNamedObject(selectedName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    VisualizePanel temp_vp = null;
    String temp_grph = null;
    Clusterer temp_clusterer = null;
    Instances temp_trainHeader = null;
    int[] temp_ignoreAtts = null;

    if (o != null) {
      for (int i = 0; i < o.size(); i++) {
<<<<<<< HEAD
        Object temp = o.get(i);
=======
<<<<<<< HEAD
        Object temp = o.get(i);
=======
        Object temp = o.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (temp instanceof Clusterer) {
          temp_clusterer = (Clusterer) temp;
        } else if (temp instanceof Instances) { // training header
          temp_trainHeader = (Instances) temp;
        } else if (temp instanceof int[]) { // ignored attributes
          temp_ignoreAtts = (int[]) temp;
        } else if (temp instanceof VisualizePanel) { // normal errors
          temp_vp = (VisualizePanel) temp;
        } else if (temp instanceof String) { // graphable output
          temp_grph = (String) temp;
        }
      }
    }

    final VisualizePanel vp = temp_vp;
    final String grph = temp_grph;
    final Clusterer clusterer = temp_clusterer;
    final Instances trainHeader = temp_trainHeader;
    final int[] ignoreAtts = temp_ignoreAtts;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem saveModel = new JMenuItem("Save model");
    if (clusterer != null && selectedNames != null && selectedNames.size() == 1) {
      saveModel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveClusterer(selectedNames.get(0), clusterer, trainHeader,
            ignoreAtts);
<<<<<<< HEAD
=======
=======
    JMenuItem saveModel = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_SaveModel_JMenuItem_Text"));
    if (clusterer != null) {
      saveModel.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          saveClusterer(selectedName, clusterer, trainHeader, ignoreAtts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      });
    } else {
      saveModel.setEnabled(false);
    }
    resultListMenu.add(saveModel);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem reEvaluate =
      new JMenuItem("Re-evaluate model on current test set");
    if (clusterer != null && m_TestInstances != null && selectedNames != null
      && selectedNames.size() == 1) {
      reEvaluate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          reevaluateModel(selectedNames.get(0), clusterer, trainHeader,
            ignoreAtts);
<<<<<<< HEAD
=======
=======
    JMenuItem reEvaluate = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_ReEvaluate_JMenuItem_Text"));
    if (clusterer != null && m_TestInstances != null) {
      reEvaluate.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          reevaluateModel(selectedName, clusterer, trainHeader, ignoreAtts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      });
    } else {
      reEvaluate.setEnabled(false);
    }
    resultListMenu.add(reEvaluate);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem reApplyConfig =
      new JMenuItem("Re-apply this model's configuration");
    if (clusterer != null) {
      reApplyConfig.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_ClustererEditor.setValue(clusterer);
        }
      });
    } else {
      reApplyConfig.setEnabled(false);
    }
    resultListMenu.add(reApplyConfig);

    resultListMenu.addSeparator();

    JMenuItem visClusts = new JMenuItem("Visualize cluster assignments");
    if (vp != null) {
      visClusts.addActionListener(new ActionListener() {
        @Override
<<<<<<< HEAD
=======
=======
    resultListMenu.addSeparator();

    JMenuItem visClusts = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_VisClusts_JMenuItem_Text"));
    if (vp != null) {
      visClusts.addActionListener(new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        public void actionPerformed(ActionEvent e) {
          visualizeClusterAssignments(vp);
        }
      });

    } else {
      visClusts.setEnabled(false);
    }
    resultListMenu.add(visClusts);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem visTree = new JMenuItem("Visualize tree");
    if (grph != null) {
      visTree.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String title;
          if (vp != null) {
            title = vp.getName();
          } else {
            title = selectedNames.get(0);
          }
<<<<<<< HEAD
=======
=======
    JMenuItem visTree = new JMenuItem(Messages.getInstance().getString(
        "ClustererPanel_VisualizeClusterer_VisTree_JMenuItem_Text"));
    if (grph != null) {
      visTree.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String title;
          if (vp != null)
            title = vp.getName();
          else
            title = selectedName;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          visualizeTree(grph, title);
        }
      });
    } else {
      visTree.setEnabled(false);
    }
    resultListMenu.add(visTree);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // visualization plugins
    JMenu visPlugins = new JMenu("Plugins");
    boolean availablePlugins = false;

    // trees
    if (grph != null) {
      // trees
      List<String> pluginsVector =
        PluginManager.getPluginNamesOfTypeList(TreeVisualizePlugin.class.getName());
      for (int i = 0; i < pluginsVector.size(); i++) {
        String className = (pluginsVector.get(i));
        try {
          TreeVisualizePlugin plugin =
            (TreeVisualizePlugin) WekaPackageClassLoaderManager
              .objectForName(className);
          // Class.forName(className).newInstance();
          if (plugin == null) {
            continue;
          }
          availablePlugins = true;
          JMenuItem pluginMenuItem =
            plugin.getVisualizeMenuItem(grph, selectedNames.get(0));
          Version version = new Version();
          if (pluginMenuItem != null) {
            if (version.compareTo(plugin.getMinVersion()) < 0) {
              pluginMenuItem.setText(pluginMenuItem.getText()
                + " (weka outdated)");
            }
            if (version.compareTo(plugin.getMaxVersion()) >= 0) {
              pluginMenuItem.setText(pluginMenuItem.getText()
                + " (plugin outdated)");
            }
            visPlugins.add(pluginMenuItem);
          }
        } catch (Exception e) {
          // e.printStackTrace();
        }
      }
    }

    if (availablePlugins) {
      resultListMenu.add(visPlugins);
    }

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    resultListMenu.show(m_History.getList(), x, y);
  }

  /**
   * Save the currently selected clusterer output to a file.
   * 
   * @param name the name of the buffer to save
   */
  protected void saveBuffer(String name) {
    StringBuffer sb = m_History.getNamedBuffer(name);
    if (sb != null) {
      if (m_SaveOut.save(sb)) {
<<<<<<< HEAD
        m_Log.logMessage("Save successful.");
=======
<<<<<<< HEAD
        m_Log.logMessage("Save successful.");
=======
        m_Log
            .logMessage(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_SaveBuffer_Log_LohMessage_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  private void setIgnoreColumns() {
<<<<<<< HEAD
    ListSelectorDialog jd = new ListSelectorDialog(SwingUtilities.getWindowAncestor(this), m_ignoreKeyList);
=======
<<<<<<< HEAD
    ListSelectorDialog jd = new ListSelectorDialog(SwingUtilities.getWindowAncestor(this), m_ignoreKeyList);
=======
    ListSelectorDialog jd = new ListSelectorDialog(null, m_ignoreKeyList);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Open the dialog
    int result = jd.showDialog();

    if (result != ListSelectorDialog.APPROVE_OPTION) {
      // clear selected indices
      m_ignoreKeyList.clearSelection();
    }
    updateCapabilitiesFilter(m_ClustererEditor.getCapabilitiesFilter());
  }

  /**
   * Saves the currently selected clusterer
   */
  protected void saveClusterer(String name, Clusterer clusterer,
<<<<<<< HEAD
    Instances trainHeader, int[] ignoredAtts) {
=======
<<<<<<< HEAD
    Instances trainHeader, int[] ignoredAtts) {
=======
      Instances trainHeader, int[] ignoredAtts) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    File sFile = null;
    boolean saveOK = true;

    int returnVal = m_FileChooser.showSaveDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      sFile = m_FileChooser.getSelectedFile();
      if (!sFile.getName().toLowerCase().endsWith(MODEL_FILE_EXTENSION)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        sFile =
          new File(sFile.getParent(), sFile.getName() + MODEL_FILE_EXTENSION);
      }
      m_Log.statusMessage("Saving model to file...");
<<<<<<< HEAD
=======
=======
        sFile = new File(sFile.getParent(), sFile.getName()
            + MODEL_FILE_EXTENSION);
      }
      m_Log
          .statusMessage(Messages
              .getInstance()
              .getString(
                  "ClustererPanel_VisualizeClusterer_SaveBuffer_Log_LohMessage_Text_Alpha"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      try {
        OutputStream os = new FileOutputStream(sFile);
        if (sFile.getName().endsWith(".gz")) {
          os = new GZIPOutputStream(os);
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
        objectOutputStream.writeObject(clusterer);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (trainHeader != null) {
          objectOutputStream.writeObject(trainHeader);
        }
        if (ignoredAtts != null) {
          objectOutputStream.writeObject(ignoredAtts);
        }
<<<<<<< HEAD
=======
=======
        if (trainHeader != null)
          objectOutputStream.writeObject(trainHeader);
        if (ignoredAtts != null)
          objectOutputStream.writeObject(ignoredAtts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        objectOutputStream.flush();
        objectOutputStream.close();
      } catch (Exception e) {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        JOptionPane.showMessageDialog(null, e, "Save Failed",
          JOptionPane.ERROR_MESSAGE);
        saveOK = false;
      }
      if (saveOK) {
        m_Log.logMessage("Saved model (" + name + ") to file '"
          + sFile.getName() + "'");
      }
      m_Log.statusMessage("OK");
<<<<<<< HEAD
=======
=======
        JOptionPane
            .showMessageDialog(
                null,
                e,
                Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_VisualizeClusterer_SaveCluster_JOptionPaneShowMessageDialog_Text"),
                JOptionPane.ERROR_MESSAGE);
        saveOK = false;
      }
      if (saveOK)
        m_Log
            .logMessage(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_SaveCluster_Log_LogMessage_Text")
                + name

                + Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_VisualizeClusterer_SaveCluster_Log_LogMessage_Text_Alpha")
                + sFile.getName() + "'");
      m_Log
          .statusMessage(Messages
              .getInstance()
              .getString(
                  "ClustererPanel_VisualizeClusterer_SaveCluster_Log_StatusMessage_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Loads a clusterer
   */
  protected void loadClusterer() {

    int returnVal = m_FileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File selected = m_FileChooser.getSelectedFile();
      Clusterer clusterer = null;
      Instances trainHeader = null;
      int[] ignoredAtts = null;

<<<<<<< HEAD
      m_Log.statusMessage("Loading model from file...");
=======
<<<<<<< HEAD
      m_Log.statusMessage("Loading model from file...");
=======
      m_Log
          .statusMessage(Messages
              .getInstance()
              .getString(
                  "ClustererPanel_VisualizeClusterer_LoadClusterer_Log_StatusSessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      try {
        InputStream is = new FileInputStream(selected);
        if (selected.getName().endsWith(".gz")) {
          is = new GZIPInputStream(is);
        }
<<<<<<< HEAD
        // ObjectInputStream objectInputStream = new ObjectInputStream(is);
        ObjectInputStream objectInputStream =
          SerializationHelper.getObjectInputStream(is);
=======
<<<<<<< HEAD
        // ObjectInputStream objectInputStream = new ObjectInputStream(is);
        ObjectInputStream objectInputStream =
          SerializationHelper.getObjectInputStream(is);
=======
        ObjectInputStream objectInputStream = new ObjectInputStream(is);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        clusterer = (Clusterer) objectInputStream.readObject();
        try { // see if we can load the header & ignored attribute info
          trainHeader = (Instances) objectInputStream.readObject();
          ignoredAtts = (int[]) objectInputStream.readObject();
        } catch (Exception e) {
        } // don't fuss if we can't
        objectInputStream.close();
      } catch (Exception e) {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        JOptionPane.showMessageDialog(null, e, "Load Failed",
          JOptionPane.ERROR_MESSAGE);
      }

      m_Log.statusMessage("OK");

      if (clusterer != null) {
        m_Log.logMessage("Loaded model from file '" + selected.getName() + "'");
        String name = (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
        String cname = clusterer.getClass().getName();
        if (cname.startsWith("weka.clusterers.")) {
          cname = cname.substring("weka.clusterers.".length());
        }
        name += cname + " from file '" + selected.getName() + "'";
        StringBuffer outBuff = new StringBuffer();

        outBuff.append("=== Model information ===\n\n");
        outBuff.append("Filename:     " + selected.getName() + "\n");
        outBuff.append("Scheme:       " + clusterer.getClass().getName());
<<<<<<< HEAD
=======
=======
        JOptionPane
            .showMessageDialog(
                null,
                e,
                Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_VisualizeClusterer_LoadClusterer_JOptionPaneShowMessageDialog_Text"),
                JOptionPane.ERROR_MESSAGE);
      }

      m_Log
          .statusMessage(Messages
              .getInstance()
              .getString(
                  "ClustererPanel_VisualizeClusterer_LoadClusterer_Log_StatusMessage_Text_Second"));

      if (clusterer != null) {
        m_Log
            .logMessage(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_LoadClusterer_Log_LogMessage_Text_First")
                + selected.getName() + "'");
        String name = (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
        String cname = clusterer.getClass().getName();
        if (cname.startsWith("weka.clusterers."))
          cname = cname.substring("weka.clusterers.".length());
        name += cname
            + Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_LoadClusterer_CNAme_Text_First")
            + selected.getName() + "'";
        StringBuffer outBuff = new StringBuffer();

        outBuff
            .append(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_First"));
        outBuff
            .append(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Second")
                + selected.getName() + "\n");
        outBuff
            .append(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Fourth")
                + clusterer.getClass().getName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (clusterer instanceof OptionHandler) {
          String[] o = ((OptionHandler) clusterer).getOptions();
          outBuff.append(" " + Utils.joinOptions(o));
        }
        outBuff.append("\n");

        if (trainHeader != null) {

<<<<<<< HEAD
          outBuff.append("Relation:     " + trainHeader.relationName() + '\n');
          outBuff.append("Attributes:   " + trainHeader.numAttributes() + '\n');
=======
<<<<<<< HEAD
          outBuff.append("Relation:     " + trainHeader.relationName() + '\n');
          outBuff.append("Attributes:   " + trainHeader.numAttributes() + '\n');
=======
          outBuff
              .append(Messages
                  .getInstance()
                  .getString(
                      "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Sixth")
                  + trainHeader.relationName() + '\n');
          outBuff
              .append(Messages
                  .getInstance()
                  .getString(
                      "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Eighth")
                  + trainHeader.numAttributes() + '\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (trainHeader.numAttributes() < 100) {
            boolean[] selectedAtts = new boolean[trainHeader.numAttributes()];
            for (int i = 0; i < trainHeader.numAttributes(); i++) {
              selectedAtts[i] = true;
            }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (ignoredAtts != null) {
              for (int i = 0; i < ignoredAtts.length; i++) {
                selectedAtts[ignoredAtts[i]] = false;
              }
            }
<<<<<<< HEAD
=======
=======
            if (ignoredAtts != null)
              for (int i = 0; i < ignoredAtts.length; i++)
                selectedAtts[ignoredAtts[i]] = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

            for (int i = 0; i < trainHeader.numAttributes(); i++) {
              if (selectedAtts[i]) {
                outBuff.append("              "
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  + trainHeader.attribute(i).name() + '\n');
              }
            }
            if (ignoredAtts != null) {
              outBuff.append("Ignored:\n");
              for (int ignoredAtt : ignoredAtts) {
                outBuff.append("              "
                  + trainHeader.attribute(ignoredAtt).name() + '\n');
              }
            }
          } else {
            outBuff.append("              [list of attributes omitted]\n");
          }
        } else {
          outBuff.append("\nTraining data unknown\n");
        }

        outBuff.append("\n=== Clustering model ===\n\n");
<<<<<<< HEAD
=======
=======
                    + trainHeader.attribute(i).name() + '\n');
              }
            }
            if (ignoredAtts != null) {
              outBuff
                  .append(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Eleventh"));
              for (int i = 0; i < ignoredAtts.length; i++)
                outBuff.append("              "
                    + trainHeader.attribute(ignoredAtts[i]).name() + '\n');
            }
          } else {
            outBuff
                .append(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Twelveth"));
          }
        } else {
          outBuff
              .append(Messages
                  .getInstance()
                  .getString(
                      "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Thirteenth"));
        }

        outBuff
            .append(Messages
                .getInstance()
                .getString(
                    "ClustererPanel_VisualizeClusterer_LoadClusterer_OutBuffer_Text_Fourteenth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        outBuff.append(clusterer.toString() + "\n");

        m_History.addResult(name, outBuff);
        m_History.setSingle(name);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        ArrayList<Object> vv = new ArrayList<Object>();
        vv.add(clusterer);
        if (trainHeader != null) {
          vv.add(trainHeader);
        }
        if (ignoredAtts != null) {
          vv.add(ignoredAtts);
        }
<<<<<<< HEAD
=======
=======
        FastVector vv = new FastVector();
        vv.addElement(clusterer);
        if (trainHeader != null)
          vv.addElement(trainHeader);
        if (ignoredAtts != null)
          vv.addElement(ignoredAtts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // allow visualization of graphable classifiers
        String grph = null;
        if (clusterer instanceof Drawable) {
          try {
            grph = ((Drawable) clusterer).graph();
          } catch (Exception ex) {
          }
        }
<<<<<<< HEAD
        if (grph != null) {
          vv.add(grph);
        }
=======
<<<<<<< HEAD
        if (grph != null) {
          vv.add(grph);
        }
=======
        if (grph != null)
          vv.addElement(grph);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        m_History.addObject(name, vv);

      }
    }
  }

  /**
   * Re-evaluates the named clusterer with the current test set. Unpredictable
   * things will happen if the data set is not compatible with the clusterer.
   * 
   * @param name the name of the clusterer entry
   * @param clusterer the clusterer to evaluate
   * @param trainHeader the header of the training set
   * @param ignoredAtts ignored attributes
   */
  protected void reevaluateModel(final String name, final Clusterer clusterer,
<<<<<<< HEAD
    final Instances trainHeader, final int[] ignoredAtts) {
=======
<<<<<<< HEAD
    final Instances trainHeader, final int[] ignoredAtts) {
=======
      final Instances trainHeader, final int[] ignoredAtts) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_RunThread == null) {
      m_StartBut.setEnabled(false);
      m_StopBut.setEnabled(true);
      m_ignoreBut.setEnabled(false);
      m_RunThread = new Thread() {
        @Override
        public void run() {
          // Copy the current state of things
<<<<<<< HEAD
          m_Log.statusMessage("Setting up...");
=======
<<<<<<< HEAD
          m_Log.statusMessage("Setting up...");
=======
          m_Log
              .statusMessage(Messages
                  .getInstance()
                  .getString(
                      "ClustererPanel_ReEvaluateModel_Run_Log_StatusMessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          StringBuffer outBuff = m_History.getNamedBuffer(name);
          Instances userTest = null;

<<<<<<< HEAD
          ClustererAssignmentsPlotInstances plotInstances =
            ExplorerDefaults.getClustererAssignmentsPlotInstances();
          plotInstances.setClusterer(clusterer);
=======
<<<<<<< HEAD
          ClustererAssignmentsPlotInstances plotInstances =
            ExplorerDefaults.getClustererAssignmentsPlotInstances();
          plotInstances.setClusterer(clusterer);
=======
          PlotData2D predData = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (m_TestInstances != null) {
            userTest = new Instances(m_TestInstances);
          }

          boolean saveVis = m_StorePredictionsBut.isSelected();
          String grph = null;

          try {
            if (userTest == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              throw new Exception("No user test set has been opened");
            }
            if (trainHeader != null && !trainHeader.equalHeaders(userTest)) {
              throw new Exception("Train and test set are not compatible\n"
                + trainHeader.equalHeadersMsg(userTest));
            }

            m_Log.statusMessage("Evaluating on test data...");
            m_Log.logMessage("Re-evaluating clusterer (" + name
              + ") on test set");

            m_Log.logMessage("Started reevaluate model");
<<<<<<< HEAD
=======
=======
              throw new Exception(Messages.getInstance().getString(
                  "ClustererPanel_ReEvaluateModel_Run_Exception_Text_First"));
            }
            if (trainHeader != null && !trainHeader.equalHeaders(userTest)) {
              throw new Exception(Messages.getInstance().getString(
                  "ClustererPanel_ReEvaluateModel_Run_Exception_Text_Second"));
            }

            m_Log
                .statusMessage(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_Log_StatusMessage_Text_Second"));
            m_Log
                .logMessage(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_Log_LogMessage_Text_First")
                    + name
                    + Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_ReEvaluateModel_Run_Log_LogMessage_Text_Second"));

            m_Log
                .logMessage(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_Log_LogMessage_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
            ClusterEvaluation eval = new ClusterEvaluation();
            eval.setClusterer(clusterer);

            Instances userTestT = new Instances(userTest);
            if (ignoredAtts != null) {
              userTestT = removeIgnoreCols(userTestT, ignoredAtts);
            }

            eval.evaluateClusterer(userTestT);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            plotInstances.setClusterEvaluation(eval);
            plotInstances.setInstances(userTest);
            plotInstances.setUp();

            outBuff.append("\n=== Re-evaluation on test set ===\n\n");
            outBuff.append("User supplied test set\n");
            outBuff.append("Relation:     " + userTest.relationName() + '\n');
            outBuff.append("Instances:    " + userTest.numInstances() + '\n');
            outBuff
              .append("Attributes:   " + userTest.numAttributes() + "\n\n");
            if (trainHeader == null) {
              outBuff
                .append("NOTE - if test set is not compatible then results are "
                  + "unpredictable\n\n");
            }

            outBuff.append(eval.clusterResultsToString());
            outBuff.append("\n");
            m_History.updateResult(name);
            m_Log.logMessage("Finished re-evaluation");
            m_Log.statusMessage("OK");
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane.showMessageDialog(ClustererPanel.this,
              "Problem evaluating clusterer:\n" + ex.getMessage(),
              "Evaluate clusterer", JOptionPane.ERROR_MESSAGE);
            m_Log.statusMessage("Problem evaluating clusterer");

          } finally {
            if (plotInstances != null) {
              m_CurrentVis = new VisualizePanel();
              if (getMainApplication() != null) {
                Settings settings =
                  getMainApplication().getApplicationSettings();
                m_CurrentVis.applySettings(settings,
                  weka.gui.explorer.VisualizePanel.ScatterDefaults.ID);
              }
              m_CurrentVis.setName(name + " (" + userTest.relationName() + ")");
              m_CurrentVis.setLog(m_Log);
              try {
                m_CurrentVis.addPlot(plotInstances.getPlotData(name));
<<<<<<< HEAD
=======
=======
            predData = setUpVisualizableInstances(userTest, eval);

            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_First"));
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Second"));
            outBuff
                .append(Messages.getInstance().getString(
                    "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Third")
                    + userTest.relationName()
                    + Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Fourth"));
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Fifth")
                + userTest.numInstances()
                + Messages.getInstance().getString(
                    "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Sixth"));
            outBuff
                .append(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Seventh")
                    + userTest.numAttributes()
                    + Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Eighth"));
            if (trainHeader == null)
              outBuff.append(Messages.getInstance().getString(
                  "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Nineth"));

            outBuff.append(eval.clusterResultsToString());
            outBuff.append(Messages.getInstance().getString(
                "ClustererPanel_ReEvaluateModel_Run_OutBuffer_Text_Tenth"));
            m_History.updateResult(name);
            m_Log
                .logMessage(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_Log_LogMessage_Text_Fourth"));
            m_Log
                .statusMessage(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_Log_StatusMessage_Text_Third"));
          } catch (Exception ex) {
            ex.printStackTrace();
            m_Log.logMessage(ex.getMessage());
            JOptionPane
                .showMessageDialog(
                    ClustererPanel.this,
                    Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_ReEvaluateModel_Run_JOptionPaneShowMessageDialog_Text_First")
                        + ex.getMessage(),
                    Messages
                        .getInstance()
                        .getString(
                            "ClustererPanel_ReEvaluateModel_Run_JOptionPaneShowMessageDialog_Text_Second"),
                    JOptionPane.ERROR_MESSAGE);
            m_Log
                .statusMessage(Messages
                    .getInstance()
                    .getString(
                        "ClustererPanel_ReEvaluateModel_Run_Log_StatusMessage_Text_Fourth"));

          } finally {
            if (predData != null) {
              m_CurrentVis = new VisualizePanel();
              m_CurrentVis.setName(name + " (" + userTest.relationName() + ")");
              m_CurrentVis.setLog(m_Log);
              predData.setPlotName(name + " (" + userTest.relationName() + ")");

              try {
                m_CurrentVis.addPlot(predData);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              } catch (Exception ex) {
                System.err.println(ex);
              }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              ArrayList<Object> vv = new ArrayList<Object>();
              vv.add(clusterer);
              if (trainHeader != null) {
                vv.add(trainHeader);
              }
              if (ignoredAtts != null) {
                vv.add(ignoredAtts);
              }
              if (saveVis) {
                vv.add(m_CurrentVis);
                if (grph != null) {
                  vv.add(grph);
<<<<<<< HEAD
=======
=======
              FastVector vv = new FastVector();
              vv.addElement(clusterer);
              if (trainHeader != null)
                vv.addElement(trainHeader);
              if (ignoredAtts != null)
                vv.addElement(ignoredAtts);
              if (saveVis) {
                vv.addElement(m_CurrentVis);
                if (grph != null) {
                  vv.addElement(grph);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                }

              }
              m_History.addObject(name, vv);

            }
            if (isInterrupted()) {
<<<<<<< HEAD
              m_Log.logMessage("Interrupted reevaluate model");
              m_Log.statusMessage("See error log");
=======
<<<<<<< HEAD
              m_Log.logMessage("Interrupted reevaluate model");
              m_Log.statusMessage("See error log");
=======
              m_Log
                  .logMessage(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_ReEvaluateModel_Run_Log_LogMessage_Text_Fifth"));
              m_Log
                  .statusMessage(Messages
                      .getInstance()
                      .getString(
                          "ClustererPanel_ReEvaluateModel_Run_Log_StatusMessage_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }
            m_RunThread = null;
            m_StartBut.setEnabled(true);
            m_StopBut.setEnabled(false);
            m_ignoreBut.setEnabled(true);
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
   * updates the capabilities filter of the GOE
   * 
   * @param filter the new filter to use
   */
  protected void updateCapabilitiesFilter(Capabilities filter) {
    Instances tempInst;
    Capabilities filterClass;

    if (filter == null) {
      m_ClustererEditor.setCapabilitiesFilter(new Capabilities(null));
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
<<<<<<< HEAD
=======
=======
    if (!ExplorerDefaults.getInitGenericObjectEditorFilter())
      tempInst = new Instances(m_Instances, 0);
    else
      tempInst = new Instances(m_Instances);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    tempInst.setClassIndex(-1);

    if (!m_ignoreKeyList.isSelectionEmpty()) {
      tempInst = removeIgnoreCols(tempInst);
    }

    if (m_ClassesToClustersBut.isSelected()) {
      // remove the class too
      String classSelection = m_ClassCombo.getSelectedItem().toString();
<<<<<<< HEAD
      classSelection =
        classSelection.substring(classSelection.indexOf(")") + 1).trim();
=======
<<<<<<< HEAD
      classSelection =
        classSelection.substring(classSelection.indexOf(")") + 1).trim();
=======
      classSelection = classSelection
          .substring(classSelection.indexOf(")") + 1).trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      int classIndex = tempInst.attribute(classSelection).index();

      Remove rm = new Remove();
      rm.setAttributeIndices("" + (classIndex + 1));
      try {
        rm.setInputFormat(tempInst);
        tempInst = Filter.useFilter(tempInst, rm);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    try {
      filterClass = Capabilities.forInstances(tempInst);
    } catch (Exception e) {
      filterClass = new Capabilities(null);
    }

    m_ClustererEditor.setCapabilitiesFilter(filterClass);

    // check capabilities
    m_StartBut.setEnabled(true);
    Capabilities currentFilter = m_ClustererEditor.getCapabilitiesFilter();
    Clusterer clusterer = (Clusterer) m_ClustererEditor.getValue();
    Capabilities currentSchemeCapabilities = null;
    if (clusterer != null && currentFilter != null
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      && (clusterer instanceof CapabilitiesHandler)) {
      currentSchemeCapabilities =
        ((CapabilitiesHandler) clusterer).getCapabilities();

      if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
        && !currentSchemeCapabilities.supports(currentFilter)) {
<<<<<<< HEAD
=======
=======
        && (clusterer instanceof CapabilitiesHandler)) {
      currentSchemeCapabilities = ((CapabilitiesHandler) clusterer)
          .getCapabilities();

      if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
          && !currentSchemeCapabilities.supports(currentFilter)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_StartBut.setEnabled(false);
      }
    }
  }

  /**
   * method gets called in case of a change event
   * 
   * @param e the associated change event
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
   * @param parent the parent frame
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }

  /**
   * returns the parent Explorer frame
   * 
   * @return the parent
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Explorer getExplorer() {
    return m_Explorer;
  }

  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return the title of this tab
   */
<<<<<<< HEAD
  @Override
  public String getTabTitle() {
    return "Cluster";
=======
<<<<<<< HEAD
  @Override
  public String getTabTitle() {
    return "Cluster";
=======
  public String getTabTitle() {
    return Messages.getInstance().getString("ClustererPanel_GetTabTitle_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return the tooltip of this tab
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String getTabTitleToolTip() {
    return "Identify instance clusters";
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
    return new ClustererPanelDefaults();
  }

  @Override
  public boolean okToBeActive() {
    return m_Instances != null;
  }

  @Override
  public void setActive(boolean active) {
    super.setActive(active);
    if (m_isActive) {
      settingsChanged();
    }
  }

  @Override
  public void settingsChanged() {
    if (getMainApplication() != null) {
      if (!m_initialSettingsSet) {
        m_initialSettingsSet = true;
        Object initialC =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), ClustererPanelDefaults.CLUSTERER_KEY,
            ClustererPanelDefaults.CLUSTERER, Environment.getSystemWide());
        m_ClustererEditor.setValue(initialC);

        TestMode iniitalTestMode =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), ClustererPanelDefaults.TEST_MODE_KEY,
            ClustererPanelDefaults.TEST_MODE, Environment.getSystemWide());
        m_TrainBut.setSelected(iniitalTestMode == TestMode.USE_TRAINING_SET);
        m_PercentBut.setSelected(iniitalTestMode == TestMode.PERCENTAGE_SPLIT);
        m_TestSplitBut
          .setSelected(iniitalTestMode == TestMode.SUPPLIED_TEST_SET);
        m_ClassesToClustersBut
          .setSelected(iniitalTestMode == TestMode.CLASSES_TO_CLUSTERS_EVAL);
        m_StorePredictionsBut.setSelected(getMainApplication()
          .getApplicationSettings().getSetting(getPerspectiveID(),
            ClustererPanelDefaults.STORE_CLUSTERS_FOR_VIS_KEY,
            ClustererPanelDefaults.STORE_CLUSTERS_VIS,
            Environment.getSystemWide()));
      }
      Font outputFont =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(), ClustererPanelDefaults.OUTPUT_FONT_KEY,
          ClustererPanelDefaults.OUTPUT_FONT, Environment.getSystemWide());
      m_OutText.setFont(outputFont);
      Color textColor =
        getMainApplication().getApplicationSettings()
          .getSetting(getPerspectiveID(),
            ClustererPanelDefaults.OUTPUT_TEXT_COLOR_KEY,
            ClustererPanelDefaults.OUTPUT_TEXT_COLOR,
            Environment.getSystemWide());
      m_OutText.setForeground(textColor);
      Color outputBackgroundColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(),
          ClustererPanelDefaults.OUTPUT_BACKGROUND_COLOR_KEY,
          ClustererPanelDefaults.OUTPUT_BACKGROUND_COLOR,
          Environment.getSystemWide());
      m_OutText.setBackground(outputBackgroundColor);
      m_History.setBackground(outputBackgroundColor);
    }
  }

  public static enum TestMode {
    PERCENTAGE_SPLIT, USE_TRAINING_SET, SUPPLIED_TEST_SET,
    CLASSES_TO_CLUSTERS_EVAL;
  }

  /**
   * Default settings for the clusterer panel
   */
  protected static final class ClustererPanelDefaults extends Defaults {
    public static final String ID = "weka.gui.explorer.clustererpanel";

    protected static final Settings.SettingKey CLUSTERER_KEY =
      new Settings.SettingKey(ID + ".initialClusterer", "Initial clusterer",
        "On startup, set this clusterer as the default one");
    protected static final Clusterer CLUSTERER = new SimpleKMeans();

    protected static final Settings.SettingKey TEST_MODE_KEY =
      new Settings.SettingKey(ID + ".initialTestMode", "Default test mode", "");
    protected static final TestMode TEST_MODE = TestMode.USE_TRAINING_SET;

    protected static final Settings.SettingKey STORE_CLUSTERS_FOR_VIS_KEY =
      new Settings.SettingKey(ID + ".storeClusterersForVis", "Store clusters "
        + "for visualization", "");
    protected static final boolean STORE_CLUSTERS_VIS = true;

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

    private static final long serialVersionUID = 2708388782229179493L;

    public ClustererPanelDefaults() {
      super(ID);

      m_defaults.put(CLUSTERER_KEY, CLUSTERER);
      m_defaults.put(TEST_MODE_KEY, TEST_MODE);
      m_defaults.put(STORE_CLUSTERS_FOR_VIS_KEY, STORE_CLUSTERS_VIS);
      m_defaults.put(OUTPUT_FONT_KEY, OUTPUT_FONT);
      m_defaults.put(OUTPUT_TEXT_COLOR_KEY, OUTPUT_TEXT_COLOR);
      m_defaults.put(OUTPUT_BACKGROUND_COLOR_KEY, OUTPUT_BACKGROUND_COLOR);
    }
<<<<<<< HEAD
=======
=======
  public String getTabTitleToolTip() {
    return Messages.getInstance().getString(
        "ClustererPanel_GetTabTitleToolTip_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tests out the clusterer panel from the command line.
   * 
   * @param args may optionally contain the name of a dataset to load.
   */
  public static void main(String[] args) {

    try {
<<<<<<< HEAD
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Cluster");
=======
<<<<<<< HEAD
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Cluster");
=======
      final javax.swing.JFrame jf = new javax.swing.JFrame(Messages
          .getInstance().getString("ClustererPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      final ClustererPanel sp = new ClustererPanel();
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
<<<<<<< HEAD
        System.err.println("Loading instances from " + args[0]);
        java.io.Reader r =
          new java.io.BufferedReader(new java.io.FileReader(args[0]));
=======
        System.err.println(Messages.getInstance().getString(
            "ClustererPanel_Main_Error_Text_First")
            + args[0]);
        java.io.Reader r = new java.io.BufferedReader(new java.io.FileReader(
            args[0]));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        Instances i = new Instances(r);
        sp.setInstances(i);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
