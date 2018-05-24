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
 *    SimpleSetupPanel.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2015 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.experiment;

import weka.classifiers.Classifier;
<<<<<<< HEAD
import weka.core.Utils;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.xml.KOML;
import weka.experiment.CSVResultListener;
import weka.experiment.ClassifierSplitEvaluator;
import weka.experiment.CrossValidationResultProducer;
import weka.experiment.DatabaseResultListener;
import weka.experiment.Experiment;
import weka.experiment.InstancesResultListener;
import weka.experiment.PropertyNode;
import weka.experiment.RandomSplitResultProducer;
import weka.experiment.RegressionSplitEvaluator;
import weka.experiment.SplitEvaluator;
import weka.gui.DatabaseConnectionDialog;
import weka.gui.ExtensionFileFilter;

<<<<<<< HEAD
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
=======
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.IntrospectionException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyDescriptor;
import java.io.File;

<<<<<<< HEAD
=======
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/** 
 * This panel controls the configuration of an experiment.
  * <p>
 * If <a href="http://koala.ilog.fr/XML/serialization/" target="_blank">KOML</a>
 * is in the classpath the experiments can also be serialized to XML instead of a
 * binary format.
*
 * @author Richard kirkby (rkirkby@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz) 
<<<<<<< HEAD
 * @version $Revision: 14497 $
 */
public class SimpleSetupPanel
  extends AbstractSetupPanel {
=======
 * @version $Revision: 7059 $
 */
public class SimpleSetupPanel
  extends JPanel {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 5257424515609176509L;

  /** The experiment being configured */
  protected Experiment m_Exp;

  /** The panel which switched between simple and advanced setup modes */
  protected SetupModePanel m_modePanel = null;

  /** The database destination URL to store results into */
  protected String m_destinationDatabaseURL;

  /** The filename to store results into */
  protected String m_destinationFilename = "";

  /** The number of folds for a cross-validation experiment */
  protected int m_numFolds = 10;

  /** The training percentage for a train/test split experiment */
  protected double m_trainPercent = 66;

  /** The number of times to repeat the sub-experiment */
  protected int m_numRepetitions = 10;

  /** Whether or not the user has consented for the experiment to be simplified */
  protected boolean m_userHasBeenAskedAboutConversion;

  /** Filter for choosing CSV files */
  protected ExtensionFileFilter m_csvFileFilter =
<<<<<<< HEAD
    new ExtensionFileFilter(".csv", "Comma separated value files");

  /** FIlter for choosing ARFF files */
  protected ExtensionFileFilter m_arffFileFilter =
    new ExtensionFileFilter(".arff", "ARFF files");

  /** Click to load an experiment */
  protected JButton m_OpenBut = new JButton("Open...");

  /** Click to save an experiment */
  protected JButton m_SaveBut = new JButton("Save...");

  /** Click to create a new experiment with default settings */
  protected JButton m_NewBut = new JButton("New");
=======
    new ExtensionFileFilter(".csv", Messages.getInstance().getString("SimpleSetupPanel_CsvFileFilter_Text"));

  /** FIlter for choosing ARFF files */
  protected ExtensionFileFilter m_arffFileFilter =
    new ExtensionFileFilter(".arff", Messages.getInstance().getString("SimpleSetupPanel_ArffFileFilter_Text"));

  /** Click to load an experiment */
  protected JButton m_OpenBut = new JButton(Messages.getInstance().getString("SimpleSetupPanel_OpenBut_JButton_Text"));

  /** Click to save an experiment */
  protected JButton m_SaveBut = new JButton(Messages.getInstance().getString("SimpleSetupPanel_SaveBut_JButton_Text"));

  /** Click to create a new experiment with default settings */
  protected JButton m_NewBut = new JButton(Messages.getInstance().getString("SimpleSetupPanel_NewBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** A filter to ensure only experiment files get shown in the chooser */
  protected FileFilter m_ExpFilter = 
    new ExtensionFileFilter(Experiment.FILE_EXTENSION, 
<<<<<<< HEAD
                            "Experiment configuration files (*" + Experiment.FILE_EXTENSION + ")");
=======
    		Messages.getInstance().getString("SimpleSetupPanel_ExpFilter_ExtensionFileFilter_Text_First") + Experiment.FILE_EXTENSION + Messages.getInstance().getString("SimpleSetupPanel_ExpFilter_ExtensionFileFilter_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** A filter to ensure only experiment (in KOML format) files get shown in the chooser */
  protected FileFilter m_KOMLFilter = 
    new ExtensionFileFilter(KOML.FILE_EXTENSION, 
<<<<<<< HEAD
                            "Experiment configuration files (*" + KOML.FILE_EXTENSION + ")");
=======
    		Messages.getInstance().getString("SimpleSetupPanel_KOMLFilter_ExtensionFileFilter_Text_First") + KOML.FILE_EXTENSION + Messages.getInstance().getString("SimpleSetupPanel_KOMLFilter_ExtensionFileFilter_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** A filter to ensure only experiment (in XML format) files get shown in the chooser */
  protected FileFilter m_XMLFilter = 
    new ExtensionFileFilter(".xml", 
<<<<<<< HEAD
                            "Experiment configuration files (*.xml)");
=======
    		Messages.getInstance().getString("SimpleSetupPanel_XMLFilter_ExtensionFileFilter_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The file chooser for selecting experiments */
  protected JFileChooser m_FileChooser =
    new JFileChooser(new File(System.getProperty("user.dir")));

  /** The file chooser for selecting result destinations */
  protected JFileChooser m_DestFileChooser =
    new JFileChooser(new File(System.getProperty("user.dir")));

  /** Combo box for choosing experiment destination type */
  protected JComboBox m_ResultsDestinationCBox = new JComboBox();

  /** Label for destination field */
<<<<<<< HEAD
  protected JLabel m_ResultsDestinationPathLabel = new JLabel("Filename:");
=======
  protected JLabel m_ResultsDestinationPathLabel = new JLabel(Messages.getInstance().getString("SimpleSetupPanel_ResultsDestinationPathLabel_JLabel_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Input field for result destination path */ 
  protected JTextField m_ResultsDestinationPathTField = new JTextField();

  /** Button for browsing destination files */
<<<<<<< HEAD
  protected JButton m_BrowseDestinationButton = new JButton("Browse...");
=======
  protected JButton m_BrowseDestinationButton = new JButton(Messages.getInstance().getString("SimpleSetupPanel_BrowseDestinationButton_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Combo box for choosing experiment type */
  protected JComboBox m_ExperimentTypeCBox = new JComboBox();

  /** Label for parameter field */
<<<<<<< HEAD
  protected JLabel m_ExperimentParameterLabel = new JLabel("Number of folds:");
=======
  protected JLabel m_ExperimentParameterLabel = new JLabel(Messages.getInstance().getString("SimpleSetupPanel_ExperimentParameterLabel_JLabel_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Input field for experiment parameter */
  protected JTextField m_ExperimentParameterTField = new JTextField(); 

  /** Radio button for choosing classification experiment */
  protected JRadioButton m_ExpClassificationRBut = 
<<<<<<< HEAD
    new JRadioButton("Classification");

  /** Radio button for choosing regression experiment */
  protected JRadioButton m_ExpRegressionRBut = 
    new JRadioButton("Regression");
=======
    new JRadioButton(Messages.getInstance().getString("SimpleSetupPanel_ExpClassificationRBut_JRadioButton_Text"));

  /** Radio button for choosing regression experiment */
  protected JRadioButton m_ExpRegressionRBut = 
    new JRadioButton(Messages.getInstance().getString("SimpleSetupPanel_ExpRegressionRBut_JRadioButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Input field for number of repetitions */
  protected JTextField m_NumberOfRepetitionsTField = new JTextField();  

  /** Radio button for choosing datasets first in order of execution */ 
  protected JRadioButton m_OrderDatasetsFirstRBut = 
<<<<<<< HEAD
    new JRadioButton("Data sets first");

  /** Radio button for choosing algorithms first in order of execution */ 
  protected JRadioButton m_OrderAlgorithmsFirstRBut = 
    new JRadioButton("Algorithms first");

  /** The strings used to identify the combo box choices */
  protected static String DEST_DATABASE_TEXT = ("JDBC database");
  protected static String DEST_ARFF_TEXT = ("ARFF file");
  protected static String DEST_CSV_TEXT = ("CSV file");
  protected static String TYPE_CROSSVALIDATION_TEXT = ("Cross-validation");
  protected static String TYPE_RANDOMSPLIT_TEXT = ("Train/Test Percentage Split (data randomized)");
  protected static String TYPE_FIXEDSPLIT_TEXT = ("Train/Test Percentage Split (order preserved)");
=======
    new JRadioButton(Messages.getInstance().getString("SimpleSetupPanel_OrderDatasetsFirstRBut_JRadioButton_Text"));

  /** Radio button for choosing algorithms first in order of execution */ 
  protected JRadioButton m_OrderAlgorithmsFirstRBut = 
    new JRadioButton(Messages.getInstance().getString("SimpleSetupPanel_OrderAlgorithmsFirstRBut_JRadioButton_Text"));

  /** The strings used to identify the combo box choices */
  protected static String DEST_DATABASE_TEXT = (Messages.getInstance().getString("SimpleSetupPanel_DEST_DATABASE_TEXT_Text"));
  protected static String DEST_ARFF_TEXT = (Messages.getInstance().getString("SimpleSetupPanel_DEST_ARFF_TEXT_Text"));
  protected static String DEST_CSV_TEXT = (Messages.getInstance().getString("SimpleSetupPanel_DEST_CSV_TEXT_Text"));
  protected static String TYPE_CROSSVALIDATION_TEXT = (Messages.getInstance().getString("SimpleSetupPanel_TYPE_CROSSVALIDATION_TEXT_Text"));
  protected static String TYPE_RANDOMSPLIT_TEXT = (Messages.getInstance().getString("SimpleSetupPanel_TYPE_RANDOMSPLIT_TEXT_Text"));
  protected static String TYPE_FIXEDSPLIT_TEXT = (Messages.getInstance().getString("SimpleSetupPanel_TYPE_FIXEDSPLIT_TEXT_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The panel for configuring selected datasets */
  protected DatasetListPanel m_DatasetListPanel = new DatasetListPanel();

  /** The panel for configuring selected algorithms */
  protected AlgorithmListPanel m_AlgorithmListPanel = new AlgorithmListPanel();

  /** A button for bringing up the notes */
<<<<<<< HEAD
  protected JButton m_NotesButton =  new JButton("Notes");

  /** Frame for the notes */
  protected JFrame m_NotesFrame = Utils.getWekaJFrame("Notes", this);
=======
  protected JButton m_NotesButton =  new JButton(Messages.getInstance().getString("SimpleSetupPanel_NotesButton_JButton_Text"));

  /** Frame for the notes */
  protected JFrame m_NotesFrame = new JFrame(Messages.getInstance().getString("SimpleSetupPanel_NotesFrame_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Area for user notes Default of 10 rows */
  protected JTextArea m_NotesText = new JTextArea(null, 10, 0);

  /**
   * Manages sending notifications to people when we change the experiment,
   * at this stage, only the resultlistener so the resultpanel can update.
   */
  protected PropertyChangeSupport m_Support = new PropertyChangeSupport(this);
  
  /**
   * Creates the setup panel with the supplied initial experiment.
   *
   * @param exp a value of type 'Experiment'
   */
  public SimpleSetupPanel(Experiment exp) {

    this();
    setExperiment(exp);
  }
  
  /**
   * Creates the setup panel with no initial experiment.
   */
  public SimpleSetupPanel() {

    // everything disabled on startup
    m_ResultsDestinationCBox.setEnabled(false);
    m_ResultsDestinationPathLabel.setEnabled(false);
    m_ResultsDestinationPathTField.setEnabled(false);
    m_BrowseDestinationButton.setEnabled(false); 
    m_ExperimentTypeCBox.setEnabled(false);
    m_ExperimentParameterLabel.setEnabled(false);
    m_ExperimentParameterTField.setEnabled(false);
    m_ExpClassificationRBut.setEnabled(false);
    m_ExpRegressionRBut.setEnabled(false);
    m_NumberOfRepetitionsTField.setEnabled(false);
    m_OrderDatasetsFirstRBut.setEnabled(false);
    m_OrderAlgorithmsFirstRBut.setEnabled(false);

    // get sensible default database address
    try {
      m_destinationDatabaseURL = (new DatabaseResultListener()).getDatabaseURL();
    } catch (Exception e) {}

    // create action listeners
    m_NewBut.setMnemonic('N');
    m_NewBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  Experiment newExp = new Experiment();
	  CrossValidationResultProducer cvrp = new CrossValidationResultProducer();
	  cvrp.setNumFolds(10);
	  cvrp.setSplitEvaluator(new ClassifierSplitEvaluator());
	  newExp.setResultProducer(cvrp);
	  newExp.setPropertyArray(new Classifier[0]);
	  newExp.setUsePropertyIterator(true);
	  setExperiment(newExp);

          // defaults
          if (ExperimenterDefaults.getUseClassification())
            m_ExpClassificationRBut.setSelected(true);
          else
            m_ExpRegressionRBut.setSelected(true);
          
          setSelectedItem(
              m_ResultsDestinationCBox, ExperimenterDefaults.getDestination());
          destinationTypeChanged();
          
          setSelectedItem(
              m_ExperimentTypeCBox, ExperimenterDefaults.getExperimentType());
          
          m_numRepetitions = ExperimenterDefaults.getRepetitions();
          m_NumberOfRepetitionsTField.setText(
              "" + m_numRepetitions);
          
          if (ExperimenterDefaults.getExperimentType().equals(
                TYPE_CROSSVALIDATION_TEXT)) {
            m_numFolds = ExperimenterDefaults.getFolds();
            m_ExperimentParameterTField.setText(
                "" + m_numFolds);
          }
          else {
            m_trainPercent = ExperimenterDefaults.getTrainPercentage();
            m_ExperimentParameterTField.setText(
                "" + m_trainPercent);
          }
          
          if (ExperimenterDefaults.getDatasetsFirst())
            m_OrderDatasetsFirstRBut.setSelected(true);
          else
            m_OrderAlgorithmsFirstRBut.setSelected(true);

          expTypeChanged();
	}
      });
    m_SaveBut.setEnabled(false);
    m_SaveBut.setMnemonic('S');
    m_SaveBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  saveExperiment();
	}
      });
    m_OpenBut.setMnemonic('O');
    m_OpenBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  openExperiment();
	}
      });
    m_FileChooser.addChoosableFileFilter(m_ExpFilter);
    if (KOML.isPresent())
       m_FileChooser.addChoosableFileFilter(m_KOMLFilter);
    m_FileChooser.addChoosableFileFilter(m_XMLFilter);
    if (ExperimenterDefaults.getExtension().equals(".xml"))
      m_FileChooser.setFileFilter(m_XMLFilter);
    else if (KOML.isPresent() && ExperimenterDefaults.getExtension().equals(KOML.FILE_EXTENSION))
      m_FileChooser.setFileFilter(m_KOMLFilter);
    else
      m_FileChooser.setFileFilter(m_ExpFilter);
    m_FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    m_DestFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

    m_BrowseDestinationButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  //using this button for both browsing file & setting username/password
	  if (m_ResultsDestinationCBox.getSelectedItem() == DEST_DATABASE_TEXT){
	    chooseURLUsername();
	  } else {
	    chooseDestinationFile();
	  }
	}
      });

    m_ExpClassificationRBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  expTypeChanged();
	}
      });
  
    m_ExpRegressionRBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  expTypeChanged();
	}
      });

    m_OrderDatasetsFirstRBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  if (m_Exp != null) {
	    m_Exp.setAdvanceDataSetFirst(true);
	    m_Support.firePropertyChange("", null, null);
	  }
	}
      });
    
    m_OrderAlgorithmsFirstRBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  if (m_Exp != null) {
	    m_Exp.setAdvanceDataSetFirst(false);
	    m_Support.firePropertyChange("", null, null);
	  }
	}
      });

    m_ResultsDestinationPathTField.getDocument().addDocumentListener(new DocumentListener() {
	public void insertUpdate(DocumentEvent e) {destinationAddressChanged();}
	public void removeUpdate(DocumentEvent e) {destinationAddressChanged();}
	public void changedUpdate(DocumentEvent e) {destinationAddressChanged();}
      });

    m_ExperimentParameterTField.getDocument().addDocumentListener(new DocumentListener() {
	public void insertUpdate(DocumentEvent e) {expParamChanged();}
	public void removeUpdate(DocumentEvent e) {expParamChanged();}
	public void changedUpdate(DocumentEvent e) {expParamChanged();}
      });

    m_NumberOfRepetitionsTField.getDocument().addDocumentListener(new DocumentListener() {
	public void insertUpdate(DocumentEvent e) {numRepetitionsChanged();}
	public void removeUpdate(DocumentEvent e) {numRepetitionsChanged();}
	public void changedUpdate(DocumentEvent e) {numRepetitionsChanged();}
      });

    m_NotesFrame.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	  m_NotesButton.setEnabled(true);
	}
      });
    m_NotesFrame.getContentPane().add(new JScrollPane(m_NotesText));
<<<<<<< HEAD
    m_NotesFrame.pack();
    m_NotesFrame.setSize(800, 600);
=======
    m_NotesFrame.setSize(600, 400);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_NotesButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  m_NotesButton.setEnabled(false);
<<<<<<< HEAD
	  m_NotesFrame.setIconImage(((JFrame)SwingUtilities.getWindowAncestor(SimpleSetupPanel.this)).getIconImage());
	  m_NotesFrame.setLocationRelativeTo(SwingUtilities.getWindowAncestor(SimpleSetupPanel.this));
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
	  m_NotesFrame.setVisible(true);
	}
      });
    m_NotesButton.setEnabled(false);

    m_NotesText.setEditable(true);
    //m_NotesText.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    m_NotesText.addKeyListener(new KeyAdapter() {
	public void keyReleased(KeyEvent e) {
	  m_Exp.setNotes(m_NotesText.getText());
	}
      });
    m_NotesText.addFocusListener(new FocusAdapter() {
	public void focusLost(FocusEvent e) {
	  m_Exp.setNotes(m_NotesText.getText());
	}
      });
    
    // Set up the GUI layout
    JPanel buttons = new JPanel();
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
    buttons.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
    buttons.setLayout(gb);
    constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;
    constraints.insets = new Insets(0,2,0,2);
    buttons.add(m_OpenBut,constraints);
    constraints.gridx=1;constraints.gridy=0;constraints.weightx=5;
    constraints.gridwidth=1;constraints.gridheight=1;
    buttons.add(m_SaveBut,constraints);
    constraints.gridx=2;constraints.gridy=0;constraints.weightx=5;
    constraints.gridwidth=1;constraints.gridheight=1;
    buttons.add(m_NewBut,constraints);

    JPanel destName = new JPanel();
    destName.setLayout(new BorderLayout(5, 5));
    destName.add(m_ResultsDestinationPathLabel, BorderLayout.WEST);
    destName.add(m_ResultsDestinationPathTField, BorderLayout.CENTER);
    
    m_ResultsDestinationCBox.addItem(DEST_ARFF_TEXT);
    m_ResultsDestinationCBox.addItem(DEST_CSV_TEXT);
    m_ResultsDestinationCBox.addItem(DEST_DATABASE_TEXT);
    
    m_ResultsDestinationCBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  destinationTypeChanged();
	}
      });

    JPanel destInner = new JPanel();
    destInner.setLayout(new BorderLayout(5, 5));
    destInner.add(m_ResultsDestinationCBox, BorderLayout.WEST);
    destInner.add(destName, BorderLayout.CENTER);
    destInner.add(m_BrowseDestinationButton, BorderLayout.EAST);

    JPanel dest = new JPanel();
    dest.setLayout(new BorderLayout());
    dest.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
		  BorderFactory.createTitledBorder("Results Destination"),
=======
		  BorderFactory.createTitledBorder(Messages.getInstance().getString("SimpleSetupPanel_Dest_JPanel_BorderFactoryCreateTitledBorder_Text")),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
		  BorderFactory.createEmptyBorder(0, 5, 5, 5)
		  ));
    dest.add(destInner, BorderLayout.NORTH);

    JPanel expParam = new JPanel();
    expParam.setLayout(new BorderLayout(5, 5));
    expParam.add(m_ExperimentParameterLabel, BorderLayout.WEST);
    expParam.add(m_ExperimentParameterTField, BorderLayout.CENTER);

    ButtonGroup typeBG = new ButtonGroup();
    typeBG.add(m_ExpClassificationRBut);
    typeBG.add(m_ExpRegressionRBut);
    m_ExpClassificationRBut.setSelected(true);

    JPanel typeRButtons = new JPanel();
    typeRButtons.setLayout(new GridLayout(1,0));
    typeRButtons.add(m_ExpClassificationRBut);
    typeRButtons.add(m_ExpRegressionRBut);

    m_ExperimentTypeCBox.addItem(TYPE_CROSSVALIDATION_TEXT);
    m_ExperimentTypeCBox.addItem(TYPE_RANDOMSPLIT_TEXT);
    m_ExperimentTypeCBox.addItem(TYPE_FIXEDSPLIT_TEXT);

    m_ExperimentTypeCBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  expTypeChanged();
	}
      });

    JPanel typeInner = new JPanel();
    typeInner.setLayout(new GridLayout(0,1));
    typeInner.add(m_ExperimentTypeCBox);
    typeInner.add(expParam);
    typeInner.add(typeRButtons);

    JPanel type = new JPanel();
    type.setLayout(new BorderLayout());
    type.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
		  BorderFactory.createTitledBorder("Experiment Type"),
=======
		  BorderFactory.createTitledBorder(Messages.getInstance().getString("SimpleSetupPanel_Type_JPanel_BorderFactoryCreateTitledBorder_Text")),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
		  BorderFactory.createEmptyBorder(0, 5, 5, 5)
		  ));
    type.add(typeInner, BorderLayout.NORTH);

    ButtonGroup iterBG = new ButtonGroup();
    iterBG.add(m_OrderDatasetsFirstRBut);
    iterBG.add(m_OrderAlgorithmsFirstRBut);
    m_OrderDatasetsFirstRBut.setSelected(true);

    JPanel numIter = new JPanel();
    numIter.setLayout(new BorderLayout(5, 5));
<<<<<<< HEAD
    numIter.add(new JLabel("Number of repetitions:"), BorderLayout.WEST);
=======
    numIter.add(new JLabel(Messages.getInstance().getString("SimpleSetupPanel_NumIter_JPanel_Add_JLabel_Text")), BorderLayout.WEST);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    numIter.add(m_NumberOfRepetitionsTField, BorderLayout.CENTER);

    JPanel controlInner = new JPanel();
    controlInner.setLayout(new GridLayout(0,1));
    controlInner.add(numIter);
    controlInner.add(m_OrderDatasetsFirstRBut);
    controlInner.add(m_OrderAlgorithmsFirstRBut);

    JPanel control = new JPanel();
    control.setLayout(new BorderLayout());
    control.setBorder(BorderFactory.createCompoundBorder(
<<<<<<< HEAD
		  BorderFactory.createTitledBorder("Iteration Control"),
=======
		  BorderFactory.createTitledBorder(Messages.getInstance().getString("SimpleSetupPanel_Control_JPanel_BorderFactoryCreateTitledBorder_Text")),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
		  BorderFactory.createEmptyBorder(0, 5, 5, 5)
		  ));
    control.add(controlInner, BorderLayout.NORTH);

    JPanel type_control = new JPanel();
    type_control.setLayout(new GridLayout(1,0));
    type_control.add(type);
    type_control.add(control);

    JPanel notes = new JPanel();
    notes.setLayout(new BorderLayout());
    notes.add(m_NotesButton, BorderLayout.CENTER);

    JPanel top1 = new JPanel();
    top1.setLayout(new BorderLayout());
    top1.add(dest, BorderLayout.NORTH);
    top1.add(type_control, BorderLayout.CENTER);

    JPanel top = new JPanel();
    top.setLayout(new BorderLayout());
    top.add(buttons, BorderLayout.NORTH);
    top.add(top1, BorderLayout.CENTER);  

    JPanel datasets = new JPanel();
    datasets.setLayout(new BorderLayout());
    datasets.add(m_DatasetListPanel, BorderLayout.CENTER);

    JPanel algorithms = new JPanel();
    algorithms.setLayout(new BorderLayout());
    algorithms.add(m_AlgorithmListPanel, BorderLayout.CENTER);

    JPanel schemes = new JPanel();
    schemes.setLayout(new GridLayout(1,0));
    schemes.add(datasets);
    schemes.add(algorithms);

    setLayout(new BorderLayout());
    add(top, BorderLayout.NORTH);
    add(schemes, BorderLayout.CENTER);
    add(notes, BorderLayout.SOUTH);
  }
<<<<<<< HEAD

  /**
   * Returns the name of the panel.
   *
   * @return		the name
   */
  public String getName() {
    return "Simple";
  }

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Sets the selected item of an combobox, since using setSelectedItem(...)
   * doesn't work, if one checks object references!
   *
   * @param cb      the combobox to set the item for
   * @param item    the item to set active
   */
  protected void setSelectedItem(JComboBox cb, String item) {
    int       i;

    for (i = 0; i < cb.getItemCount(); i++) {
      if (cb.getItemAt(i).toString().equals(item)) {
        cb.setSelectedIndex(i);
        break;
      }
    }
  }
  
  /**
   * Deletes the notes frame.
   */
  protected void removeNotesFrame() {
    m_NotesFrame.setVisible(false);
  }

  /**
   * Gets te users consent for converting the experiment to a simpler form.
   *
   * @return true if the user has given consent, false otherwise
   */  
  private boolean userWantsToConvert() {
    
    if (m_userHasBeenAskedAboutConversion) return true;
    m_userHasBeenAskedAboutConversion = true;
    return (JOptionPane.showConfirmDialog(this,
<<<<<<< HEAD
					  "This experiment has settings that are too advanced\n" +
					  "to be represented in the simple setup mode.\n" +
					  "Do you want the experiment to be converted,\n" +
					  "losing some of the advanced settings?\n",
					  "Confirm conversion",
=======
    		Messages.getInstance().getString("SimpleSetupPanel_UserWantsToConvert_JOptionPaneShowConfirmDialog_Text_First"),
					  Messages.getInstance().getString("SimpleSetupPanel_UserWantsToConvert_JOptionPaneShowConfirmDialog_Text_Second"),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
					  JOptionPane.YES_NO_OPTION,
					  JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION);
  }

  /**
   * Sets the panel used to switch between simple and advanced modes.
   *
   * @param modePanel the panel
   */
  public void setModePanel(SetupModePanel modePanel) {

    m_modePanel = modePanel;
  }

  /**
   * Sets the experiment to configure.
   *
   * @param exp a value of type 'Experiment'
   * @return true if experiment could be configured, false otherwise
   */
  public boolean setExperiment(Experiment exp) {
    
    m_userHasBeenAskedAboutConversion = false;
    m_Exp = null; // hold off until we are sure we want conversion
    m_SaveBut.setEnabled(true);

    if (exp.getResultListener() instanceof DatabaseResultListener) {
      m_ResultsDestinationCBox.setSelectedItem(DEST_DATABASE_TEXT);
<<<<<<< HEAD
      m_ResultsDestinationPathLabel.setText("URL:");
=======
      m_ResultsDestinationPathLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_DatabaseResultListener_ResultsDestinationPathLabel_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_destinationDatabaseURL = ((DatabaseResultListener)exp.getResultListener()).getDatabaseURL();
      m_ResultsDestinationPathTField.setText(m_destinationDatabaseURL);
      m_BrowseDestinationButton.setEnabled(true);
    } else if (exp.getResultListener() instanceof InstancesResultListener) {
      m_ResultsDestinationCBox.setSelectedItem(DEST_ARFF_TEXT);
<<<<<<< HEAD
      m_ResultsDestinationPathLabel.setText("Filename:");
=======
      m_ResultsDestinationPathLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_InstancesResultListener_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_destinationFilename = ((InstancesResultListener)exp.getResultListener()).outputFileName();
      m_ResultsDestinationPathTField.setText(m_destinationFilename);
      m_BrowseDestinationButton.setEnabled(true);
    } else if (exp.getResultListener() instanceof CSVResultListener) {
      m_ResultsDestinationCBox.setSelectedItem(DEST_CSV_TEXT);
<<<<<<< HEAD
      m_ResultsDestinationPathLabel.setText("Filename:");
=======
      m_ResultsDestinationPathLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_CSVResultListener_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_destinationFilename = ((CSVResultListener)exp.getResultListener()).outputFileName();
      m_ResultsDestinationPathTField.setText(m_destinationFilename);
      m_BrowseDestinationButton.setEnabled(true);
    } else {
      // unrecognised result listener 
<<<<<<< HEAD
      System.out.println("SimpleSetup incompatibility: unrecognised result destination");
      if (userWantsToConvert()) {
	m_ResultsDestinationCBox.setSelectedItem(DEST_ARFF_TEXT);
	m_ResultsDestinationPathLabel.setText("Filename:");
=======
      System.out.println(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnrecognisedResultListener_Text"));
      if (userWantsToConvert()) {
	m_ResultsDestinationCBox.setSelectedItem(DEST_ARFF_TEXT);
	m_ResultsDestinationPathLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnrecognisedResultListener_UserWantsToConvert_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
	m_destinationFilename = "";
	m_ResultsDestinationPathTField.setText(m_destinationFilename);
	m_BrowseDestinationButton.setEnabled(true);
      } else {
	return false;
      }
    }
    m_ResultsDestinationCBox.setEnabled(true);
    m_ResultsDestinationPathLabel.setEnabled(true);
    m_ResultsDestinationPathTField.setEnabled(true);

    if (exp.getResultProducer() instanceof CrossValidationResultProducer) {
      CrossValidationResultProducer cvrp = (CrossValidationResultProducer) exp.getResultProducer();
      m_numFolds = cvrp.getNumFolds();
      m_ExperimentParameterTField.setText("" + m_numFolds);
      
      if (cvrp.getSplitEvaluator() instanceof ClassifierSplitEvaluator) {
	m_ExpClassificationRBut.setSelected(true);
	m_ExpRegressionRBut.setSelected(false);
      } else if (cvrp.getSplitEvaluator() instanceof RegressionSplitEvaluator) {
	m_ExpClassificationRBut.setSelected(false);
	m_ExpRegressionRBut.setSelected(true);
      } else {
	// unknown split evaluator
<<<<<<< HEAD
	System.out.println("SimpleSetup incompatibility: unrecognised split evaluator");
=======
	System.out.println(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnknownSplitEvaluator_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
	if (userWantsToConvert()) {
	  m_ExpClassificationRBut.setSelected(true);
	  m_ExpRegressionRBut.setSelected(false);
	} else {
	  return false;
	}
      }
      m_ExperimentTypeCBox.setSelectedItem(TYPE_CROSSVALIDATION_TEXT);
    } else if (exp.getResultProducer() instanceof RandomSplitResultProducer) {
      RandomSplitResultProducer rsrp = (RandomSplitResultProducer) exp.getResultProducer();
      if (rsrp.getRandomizeData()) {
	m_ExperimentTypeCBox.setSelectedItem(TYPE_RANDOMSPLIT_TEXT);
      } else {
	m_ExperimentTypeCBox.setSelectedItem(TYPE_FIXEDSPLIT_TEXT);
      }
      if (rsrp.getSplitEvaluator() instanceof ClassifierSplitEvaluator) {
	m_ExpClassificationRBut.setSelected(true);
	m_ExpRegressionRBut.setSelected(false);
      } else if (rsrp.getSplitEvaluator() instanceof RegressionSplitEvaluator) {
	m_ExpClassificationRBut.setSelected(false);
	m_ExpRegressionRBut.setSelected(true);
      } else {
	// unknown split evaluator
<<<<<<< HEAD
	System.out.println("SimpleSetup incompatibility: unrecognised split evaluator");
=======
	System.out.println(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnknownSplitEvaluator_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
	if (userWantsToConvert()) {
	  m_ExpClassificationRBut.setSelected(true);
	  m_ExpRegressionRBut.setSelected(false);
	} else {
	  return false;
	}
      }
      m_trainPercent = rsrp.getTrainPercent();
      m_ExperimentParameterTField.setText("" + m_trainPercent);
      
    } else {
      // unknown experiment type
<<<<<<< HEAD
      System.out.println("SimpleSetup incompatibility: unrecognised resultProducer");
=======
      System.out.println(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnknownPropertyIteration_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (userWantsToConvert()) {
	m_ExperimentTypeCBox.setSelectedItem(TYPE_CROSSVALIDATION_TEXT);
	m_ExpClassificationRBut.setSelected(true);
	m_ExpRegressionRBut.setSelected(false);
      } else {
	return false;
      }
    }

    m_ExperimentTypeCBox.setEnabled(true);
    m_ExperimentParameterLabel.setEnabled(true);
    m_ExperimentParameterTField.setEnabled(true);
    m_ExpClassificationRBut.setEnabled(true);
    m_ExpRegressionRBut.setEnabled(true);
    
    if (exp.getRunLower() == 1) {
      m_numRepetitions = exp.getRunUpper();
      m_NumberOfRepetitionsTField.setText("" + m_numRepetitions);
    } else {
      // unsupported iterations
<<<<<<< HEAD
      System.out.println("SimpleSetup incompatibility: runLower is not 1");
=======
      System.out.println(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnknownPropertyIteration_Text_Alpha"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (userWantsToConvert()) {
	exp.setRunLower(1);
	if (m_ExperimentTypeCBox.getSelectedItem() == TYPE_FIXEDSPLIT_TEXT) {
	  exp.setRunUpper(1);
	  m_NumberOfRepetitionsTField.setEnabled(false);
	  m_NumberOfRepetitionsTField.setText("1");
	} else {
	  exp.setRunUpper(10);
	  m_numRepetitions = 10;
	  m_NumberOfRepetitionsTField.setText("" + m_numRepetitions);
	}
	
      } else {
	return false;
      }
    }
    m_NumberOfRepetitionsTField.setEnabled(true);

    m_OrderDatasetsFirstRBut.setSelected(exp.getAdvanceDataSetFirst());
    m_OrderAlgorithmsFirstRBut.setSelected(!exp.getAdvanceDataSetFirst());
    m_OrderDatasetsFirstRBut.setEnabled(true);
    m_OrderAlgorithmsFirstRBut.setEnabled(true);

    m_NotesText.setText(exp.getNotes());
    m_NotesButton.setEnabled(true);

    if (!exp.getUsePropertyIterator() || !(exp.getPropertyArray() instanceof Classifier[])) {
      // unknown property iteration
<<<<<<< HEAD
      System.out.println("SimpleSetup incompatibility: unrecognised property iteration");
=======
      System.out.println(Messages.getInstance().getString("SimpleSetupPanel_SetExperiment_UnknownPropertyIteration_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (userWantsToConvert()) {
	exp.setPropertyArray(new Classifier[0]);
	exp.setUsePropertyIterator(true);
      } else {
	return false;
      }
    }

    m_DatasetListPanel.setExperiment(exp);
    m_AlgorithmListPanel.setExperiment(exp);
    
    m_Exp = exp;
    expTypeChanged(); // recreate experiment
    
    m_Support.firePropertyChange("", null, null);
    
    return true;
  }

  /**
   * Gets the currently configured experiment.
   *
   * @return the currently configured experiment.
   */
  public Experiment getExperiment() {

    return m_Exp;
  }
  
  /**
   * Prompts the user to select an experiment file and loads it.
   */
  private void openExperiment() {
    
    int returnVal = m_FileChooser.showOpenDialog(this);
    if (returnVal != JFileChooser.APPROVE_OPTION) {
      return;
    }
    File expFile = m_FileChooser.getSelectedFile();
    
    // add extension if necessary
    if (m_FileChooser.getFileFilter() == m_ExpFilter) {
      if (!expFile.getName().toLowerCase().endsWith(Experiment.FILE_EXTENSION))
        expFile = new File(expFile.getParent(), expFile.getName() + Experiment.FILE_EXTENSION);
    }
    else if (m_FileChooser.getFileFilter() == m_KOMLFilter) {
      if (!expFile.getName().toLowerCase().endsWith(KOML.FILE_EXTENSION))
        expFile = new File(expFile.getParent(), expFile.getName() + KOML.FILE_EXTENSION);
    }
    else if (m_FileChooser.getFileFilter() == m_XMLFilter) {
      if (!expFile.getName().toLowerCase().endsWith(".xml"))
        expFile = new File(expFile.getParent(), expFile.getName() + ".xml");
    }
    
    try {
      Experiment exp = Experiment.read(expFile.getAbsolutePath());
      if (!setExperiment(exp)) {
	if (m_modePanel != null) m_modePanel.switchToAdvanced(exp);
      }
<<<<<<< HEAD
      System.err.println("Opened experiment:\n" + exp);
    } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(this, "Couldn't open experiment file:\n"
				    + expFile
				    + "\nReason:\n" + ex.getMessage(),
				    "Open Experiment",
=======
      System.err.println(Messages.getInstance().getString("SimpleSetupPanel_OpenExperiment_Exception_JOptionPaneShowMessageDialog_Text") + exp);
    } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(this, Messages.getInstance().getString("SimpleSetupPanel_OpenExperiment_Exception_JOptionPaneShowMessageDialog_Text_First")
				    + expFile
				    + Messages.getInstance().getString("SimpleSetupPanel_OpenExperiment_Exception_JOptionPaneShowMessageDialog_Text_Second") + ex.getMessage(),
				    Messages.getInstance().getString("SimpleSetupPanel_OpenExperiment_Exception_JOptionPaneShowMessageDialog_Text_Third"),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
				    JOptionPane.ERROR_MESSAGE);
      // Pop up error dialog
    }
  }

  /**
   * Prompts the user for a filename to save the experiment to, then saves
   * the experiment.
   */
  private void saveExperiment() {

    int returnVal = m_FileChooser.showSaveDialog(this);
    if (returnVal != JFileChooser.APPROVE_OPTION) {
      return;
    }
    File expFile = m_FileChooser.getSelectedFile();
    
    // add extension if necessary
    if (m_FileChooser.getFileFilter() == m_ExpFilter) {
      if (!expFile.getName().toLowerCase().endsWith(Experiment.FILE_EXTENSION))
        expFile = new File(expFile.getParent(), expFile.getName() + Experiment.FILE_EXTENSION);
    }
    else if (m_FileChooser.getFileFilter() == m_KOMLFilter) {
      if (!expFile.getName().toLowerCase().endsWith(KOML.FILE_EXTENSION))
        expFile = new File(expFile.getParent(), expFile.getName() + KOML.FILE_EXTENSION);
    }
    else if (m_FileChooser.getFileFilter() == m_XMLFilter) {
      if (!expFile.getName().toLowerCase().endsWith(".xml"))
        expFile = new File(expFile.getParent(), expFile.getName() + ".xml");
    }
    
    try {
      Experiment.write(expFile.getAbsolutePath(), m_Exp);
<<<<<<< HEAD
      System.err.println("Saved experiment:\n" + m_Exp);
    } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(this, "Couldn't save experiment file:\n"
				    + expFile
				    + "\nReason:\n" + ex.getMessage(),
				    "Save Experiment",
=======
      System.err.println(Messages.getInstance().getString("SimpleSetupPanel_SaveExperiment_Error_Text") + m_Exp);
    } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(this, Messages.getInstance().getString("SimpleSetupPanel_SaveExperiment_Exception_JOptionPaneShowMessageDialog_Text_First")
				    + expFile
				    + Messages.getInstance().getString("SimpleSetupPanel_SaveExperiment_Exception_JOptionPaneShowMessageDialog_Text_Second") + ex.getMessage(),
				    Messages.getInstance().getString("SimpleSetupPanel_SaveExperiment_Exception_JOptionPaneShowMessageDialog_Text_Third"),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
				    JOptionPane.ERROR_MESSAGE);
    }
  }

  /**
   * Adds a PropertyChangeListener who will be notified of value changes.
   *
   * @param l a value of type 'PropertyChangeListener'
   */
  public void addPropertyChangeListener(PropertyChangeListener l) {
<<<<<<< HEAD
    if (m_Support != null && l != null) {
      m_Support.addPropertyChangeListener(l);
    }
=======
    m_Support.addPropertyChangeListener(l);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Removes a PropertyChangeListener.
   *
   * @param l a value of type 'PropertyChangeListener'
   */
  public void removePropertyChangeListener(PropertyChangeListener l) {
<<<<<<< HEAD
    if (m_Support != null && l != null) {
      m_Support.removePropertyChangeListener(l);
    }
=======
    m_Support.removePropertyChangeListener(l);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Responds to a change in the destination type.
   */
  private void destinationTypeChanged() {

    if (m_Exp == null) return;

    String str = "";

    if (m_ResultsDestinationCBox.getSelectedItem() == DEST_DATABASE_TEXT) {
<<<<<<< HEAD
      m_ResultsDestinationPathLabel.setText("URL:");
      str = m_destinationDatabaseURL;
      m_BrowseDestinationButton.setEnabled(true); //!!!
      m_BrowseDestinationButton.setText("User...");
    } else {
      m_ResultsDestinationPathLabel.setText("Filename:");
=======
      m_ResultsDestinationPathLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_DestinationTypeChanged_DEST_DATABASE_TEXT_ResultsDestinationPathLabel_Text_First"));
      str = m_destinationDatabaseURL;
      m_BrowseDestinationButton.setEnabled(true); //!!!
      m_BrowseDestinationButton.setText(Messages.getInstance().getString("SimpleSetupPanel_DestinationTypeChanged_DEST_DATABASE_TEXT_BrowseDestinationButton_Text"));
    } else {
      m_ResultsDestinationPathLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_DestinationTypeChanged_DEST_DATABASE_TEXT_ResultsDestinationPathLabel_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (m_ResultsDestinationCBox.getSelectedItem() == DEST_ARFF_TEXT) {
	int ind = m_destinationFilename.lastIndexOf(".csv");
	if (ind > -1) {
	  m_destinationFilename = m_destinationFilename.substring(0, ind) + ".arff";
	}
      }
      if (m_ResultsDestinationCBox.getSelectedItem() == DEST_CSV_TEXT) {
	int ind = m_destinationFilename.lastIndexOf(".arff");
	if (ind > -1) {
	  m_destinationFilename = m_destinationFilename.substring(0, ind) + ".csv";
	}
      }
      str = m_destinationFilename;
      if (m_ResultsDestinationCBox.getSelectedItem() == DEST_ARFF_TEXT) {
	int ind = str.lastIndexOf(".csv");
	if (ind > -1) {
	  str = str.substring(0, ind) + ".arff";
	}
      }
      if (m_ResultsDestinationCBox.getSelectedItem() == DEST_CSV_TEXT) {
	int ind = str.lastIndexOf(".arff");
	if (ind > -1) {
	  str = str.substring(0, ind) + ".csv";
	}
      }
      m_BrowseDestinationButton.setEnabled(true);
<<<<<<< HEAD
      m_BrowseDestinationButton.setText("Browse...");
=======
      m_BrowseDestinationButton.setText(Messages.getInstance().getString("SimpleSetupPanel_DestinationTypeChanged_BrowseDestinationButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    if (m_ResultsDestinationCBox.getSelectedItem() == DEST_DATABASE_TEXT) {
      DatabaseResultListener drl = null;
      try {
	drl = new DatabaseResultListener();
      } catch (Exception e) {
	e.printStackTrace();
      }
      drl.setDatabaseURL(m_destinationDatabaseURL);
      m_Exp.setResultListener(drl);
    } else {
      if (m_ResultsDestinationCBox.getSelectedItem() == DEST_ARFF_TEXT) {
	InstancesResultListener irl = new InstancesResultListener();
	if (!m_destinationFilename.equals("")) {
	  irl.setOutputFile(new File(m_destinationFilename));
	}
	m_Exp.setResultListener(irl);
      } else if (m_ResultsDestinationCBox.getSelectedItem() == DEST_CSV_TEXT) {
	CSVResultListener crl = new CSVResultListener();
	if (!m_destinationFilename.equals("")) {
	  crl.setOutputFile(new File(m_destinationFilename));
	}
	m_Exp.setResultListener(crl);
      }
    }

    m_ResultsDestinationPathTField.setText(str);

    m_Support.firePropertyChange("", null, null);
  }

  /**
   * Responds to a change in the destination address.
   */
  private void destinationAddressChanged() {

    if (m_Exp == null) return;

    if (m_ResultsDestinationCBox.getSelectedItem() == DEST_DATABASE_TEXT) {
      m_destinationDatabaseURL = m_ResultsDestinationPathTField.getText();
      if (m_Exp.getResultListener() instanceof DatabaseResultListener) {
	((DatabaseResultListener)m_Exp.getResultListener()).setDatabaseURL(m_destinationDatabaseURL);
      }
    } else {
      File resultsFile = null;
      m_destinationFilename = m_ResultsDestinationPathTField.getText();

      // Use temporary file if no file name is provided
      if (m_destinationFilename.equals("")) {
	try {
	  if (m_ResultsDestinationCBox.getSelectedItem() == DEST_ARFF_TEXT) {
	    resultsFile = File.createTempFile("weka_experiment", ".arff");
	  }
	  if (m_ResultsDestinationCBox.getSelectedItem() == DEST_CSV_TEXT) {
	    resultsFile = File.createTempFile("weka_experiment", ".csv");
	  }
	  resultsFile.deleteOnExit();
	} catch (Exception e) {
<<<<<<< HEAD
	  System.err.println("Cannot create temp file, writing to standard out.");
=======
	  System.err.println(Messages.getInstance().getString("SimpleSetupPanel_DestinationAddressChanged_Exception_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
	  resultsFile = new File("-");
	}
      } else {
	if (m_ResultsDestinationCBox.getSelectedItem() == DEST_ARFF_TEXT) {
	  if (!m_destinationFilename.endsWith(".arff")) {
	    m_destinationFilename += ".arff";
	  }
	}
	if (m_ResultsDestinationCBox.getSelectedItem() == DEST_CSV_TEXT) {
	  if (!m_destinationFilename.endsWith(".csv")) {
	    m_destinationFilename += ".csv";
	  }
	}
	resultsFile = new File(m_destinationFilename);
      }
      ((CSVResultListener)m_Exp.getResultListener()).setOutputFile(resultsFile);
      ((CSVResultListener)m_Exp.getResultListener()).setOutputFileName(m_destinationFilename);
    }

    m_Support.firePropertyChange("", null, null);
  }

  /**
   * Responds to a change in the experiment type.
   */
  private void expTypeChanged() {

    if (m_Exp == null) return;

    // update parameter ui
    if (m_ExperimentTypeCBox.getSelectedItem() == TYPE_CROSSVALIDATION_TEXT) {
<<<<<<< HEAD
      m_ExperimentParameterLabel.setText("Number of folds:");
      m_ExperimentParameterTField.setText("" + m_numFolds);
    } else {
      m_ExperimentParameterLabel.setText("Train percentage:");
=======
      m_ExperimentParameterLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_ExpTypeChanged_TYPE_CROSSVALIDATION_TEXT_ExperimentParameterLabel_Text_First"));
      m_ExperimentParameterTField.setText("" + m_numFolds);
    } else {
      m_ExperimentParameterLabel.setText(Messages.getInstance().getString("SimpleSetupPanel_ExpTypeChanged_TYPE_CROSSVALIDATION_TEXT_ExperimentParameterLabel_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_ExperimentParameterTField.setText("" + m_trainPercent);
    }

    // update iteration ui
    if (m_ExperimentTypeCBox.getSelectedItem() == TYPE_FIXEDSPLIT_TEXT) {
      m_NumberOfRepetitionsTField.setEnabled(false);
      m_NumberOfRepetitionsTField.setText("1");
      m_Exp.setRunLower(1);
      m_Exp.setRunUpper(1);
    } else {
      m_NumberOfRepetitionsTField.setText("" + m_numRepetitions);
      m_NumberOfRepetitionsTField.setEnabled(true);
      m_Exp.setRunLower(1);
      m_Exp.setRunUpper(m_numRepetitions);
    }

    SplitEvaluator se = null;
    Classifier sec = null;
    if (m_ExpClassificationRBut.isSelected()) {
      se = new ClassifierSplitEvaluator();
      sec = ((ClassifierSplitEvaluator)se).getClassifier();
    } else {
      se = new RegressionSplitEvaluator();
      sec = ((RegressionSplitEvaluator)se).getClassifier();
    }
    
    // build new ResultProducer
    if (m_ExperimentTypeCBox.getSelectedItem() == TYPE_CROSSVALIDATION_TEXT) {
      CrossValidationResultProducer cvrp = new CrossValidationResultProducer();
      cvrp.setNumFolds(m_numFolds);
      cvrp.setSplitEvaluator(se);
      
      PropertyNode[] propertyPath = new PropertyNode[2];
      try {
	propertyPath[0] = new PropertyNode(se, new PropertyDescriptor("splitEvaluator",
								      CrossValidationResultProducer.class),
					   CrossValidationResultProducer.class);
	propertyPath[1] = new PropertyNode(sec, new PropertyDescriptor("classifier",
								       se.getClass()),
					   se.getClass());
      } catch (IntrospectionException e) {
	e.printStackTrace();
      }
      
      m_Exp.setResultProducer(cvrp);
      m_Exp.setPropertyPath(propertyPath);

    } else {
      RandomSplitResultProducer rsrp = new RandomSplitResultProducer();
      rsrp.setRandomizeData(m_ExperimentTypeCBox.getSelectedItem() == TYPE_RANDOMSPLIT_TEXT);
      rsrp.setTrainPercent(m_trainPercent);
      rsrp.setSplitEvaluator(se);

      PropertyNode[] propertyPath = new PropertyNode[2];
      try {
	propertyPath[0] = new PropertyNode(se, new PropertyDescriptor("splitEvaluator",
								      RandomSplitResultProducer.class),
					   RandomSplitResultProducer.class);
	propertyPath[1] = new PropertyNode(sec, new PropertyDescriptor("classifier",
								       se.getClass()),
					   se.getClass());
      } catch (IntrospectionException e) {
	e.printStackTrace();
      }

      m_Exp.setResultProducer(rsrp);
      m_Exp.setPropertyPath(propertyPath);

    }

    m_Exp.setUsePropertyIterator(true);
    m_Support.firePropertyChange("", null, null);
  }

  /**
   * Responds to a change in the experiment parameter.
   */
  private void expParamChanged() {

    if (m_Exp == null) return;

    if (m_ExperimentTypeCBox.getSelectedItem() == TYPE_CROSSVALIDATION_TEXT) {
      try {
	m_numFolds = Integer.parseInt(m_ExperimentParameterTField.getText());
      } catch (NumberFormatException e) {
	return;
      }
    } else {
      try {
	m_trainPercent = Double.parseDouble(m_ExperimentParameterTField.getText());
      } catch (NumberFormatException e) {
	return;
      }
    }

    if (m_ExperimentTypeCBox.getSelectedItem() == TYPE_CROSSVALIDATION_TEXT) {

      if (m_Exp.getResultProducer() instanceof CrossValidationResultProducer) {
	CrossValidationResultProducer cvrp = (CrossValidationResultProducer) m_Exp.getResultProducer();
	cvrp.setNumFolds(m_numFolds);
      } else {
	return;
      }

    } else {
      
      if (m_Exp.getResultProducer() instanceof RandomSplitResultProducer) {
	RandomSplitResultProducer rsrp = (RandomSplitResultProducer) m_Exp.getResultProducer();
	rsrp.setRandomizeData(m_ExperimentTypeCBox.getSelectedItem() == TYPE_RANDOMSPLIT_TEXT);
	rsrp.setTrainPercent(m_trainPercent);
      } else {
	//System.err.println("not rsrp");
	return;
      }
    }

    m_Support.firePropertyChange("", null, null);
  }

  /**
   * Responds to a change in the number of repetitions.
   */
  private void numRepetitionsChanged() {

    if (m_Exp == null || !m_NumberOfRepetitionsTField.isEnabled()) return;

    try {
      m_numRepetitions = Integer.parseInt(m_NumberOfRepetitionsTField.getText());
    } catch (NumberFormatException e) {
      return;
    }

    m_Exp.setRunLower(1);
    m_Exp.setRunUpper(m_numRepetitions);

    m_Support.firePropertyChange("", null, null);
  }

  /**
   * Lets user enter username/password/URL.
   */
  private void chooseURLUsername() {
    String dbaseURL=((DatabaseResultListener)m_Exp.getResultListener()).getDatabaseURL();
    String username=((DatabaseResultListener)m_Exp.getResultListener()).getUsername();
<<<<<<< HEAD
    DatabaseConnectionDialog dbd= new DatabaseConnectionDialog((Frame)SwingUtilities.
            getWindowAncestor(SimpleSetupPanel.this),dbaseURL,username);
    dbd.setLocationRelativeTo(SwingUtilities.getWindowAncestor(SimpleSetupPanel.this));
=======
    DatabaseConnectionDialog dbd= new DatabaseConnectionDialog(null,dbaseURL,username);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    dbd.setVisible(true);
      
    //if (dbaseURL == null) {
    if (dbd.getReturnValue()==JOptionPane.CLOSED_OPTION) {
      return;
    }

    ((DatabaseResultListener)m_Exp.getResultListener()).setUsername(dbd.getUsername());
    ((DatabaseResultListener)m_Exp.getResultListener()).setPassword(dbd.getPassword());
    ((DatabaseResultListener)m_Exp.getResultListener()).setDatabaseURL(dbd.getURL());
    ((DatabaseResultListener)m_Exp.getResultListener()).setDebug(dbd.getDebug());
    m_ResultsDestinationPathTField.setText(dbd.getURL());
  }
  /**
   * Lets user browse for a destination file..
   */
  private void chooseDestinationFile() {

    FileFilter fileFilter = null;
    if (m_ResultsDestinationCBox.getSelectedItem() == DEST_CSV_TEXT) {
      fileFilter = m_csvFileFilter;
    } else {
      fileFilter = m_arffFileFilter;
    }
    m_DestFileChooser.setFileFilter(fileFilter);
    int returnVal = m_DestFileChooser.showSaveDialog(this);
    if (returnVal != JFileChooser.APPROVE_OPTION) {
      return;
    }
    m_ResultsDestinationPathTField.setText(m_DestFileChooser.getSelectedFile().toString());
  }
<<<<<<< HEAD

  /**
   * Hook method for cleaning up the interface after a switch.
   */
  public void cleanUpAfterSwitch() {
    removeNotesFrame();
  }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
}
