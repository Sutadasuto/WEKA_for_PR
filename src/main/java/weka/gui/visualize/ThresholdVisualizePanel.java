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
 *    ThresholdVisualizePanel.java
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.visualize;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.EvaluationUtils;
import weka.classifiers.evaluation.ThresholdCurve;
import weka.core.FastVector;
import weka.core.Instances;
import weka.core.SingleIndex;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.EvaluationUtils;
import weka.classifiers.evaluation.Prediction;
import weka.classifiers.evaluation.ThresholdCurve;
import weka.core.Instances;
import weka.core.SingleIndex;
import weka.core.Utils;

/**
 * This panel is a VisualizePanel, with the added ablility to display the area
 * under the ROC curve if an ROC curve is chosen.
 * 
 * @author Dale Fletcher (dale@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10222 $
 */
public class ThresholdVisualizePanel extends VisualizePanel {
<<<<<<< HEAD
=======
=======
/** 
 * This panel is a VisualizePanel, with the added ablility to display the
 * area under the ROC curve if an ROC curve is chosen.
 *
 * @author Dale Fletcher (dale@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7059 $
 */
public class ThresholdVisualizePanel 
  extends VisualizePanel {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 3070002211779443890L;

  /** The string to add to the Plot Border. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private String m_ROCString = "";

  /** Original border text */
  private final String m_savePanelBorderText;
<<<<<<< HEAD
=======
=======
  private String m_ROCString="";
 
  /** Original border text */
  private String m_savePanelBorderText;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * default constructor
   */
  public ThresholdVisualizePanel() {
    super();

    // Save the current border text
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    TitledBorder tb = (TitledBorder) m_plotSurround.getBorder();
    m_savePanelBorderText = tb.getTitle();
  }

  /**
   * Set the string with ROC area
   * 
   * @param str ROC area string to add to border
   */
  public void setROCString(String str) {
    m_ROCString = str;
  }

  /**
   * This extracts the ROC area string
   * 
   * @return ROC area string
<<<<<<< HEAD
=======
=======
    TitledBorder tb=(TitledBorder) m_plotSurround.getBorder();
    m_savePanelBorderText = tb.getTitle();
  }
  
  /**
   * Set the string with ROC area
   * @param str ROC area string to add to border
   */  
  public void setROCString(String str) {
    m_ROCString=str;
  }

  /**
   * This extracts the ROC area string 
   * @return ROC area string 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getROCString() {
    return m_ROCString;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This overloads VisualizePanel's setUpComboBoxes to add ActionListeners to
   * watch for when the X/Y Axis comboboxes are changed.
   * 
   * @param inst a set of instances with data for plotting
   */
  @Override
<<<<<<< HEAD
=======
=======
   * This overloads VisualizePanel's setUpComboBoxes to add 
   * ActionListeners to watch for when the X/Y Axis comboboxes
   * are changed. 
   * @param inst a set of instances with data for plotting
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setUpComboBoxes(Instances inst) {
    super.setUpComboBoxes(inst);

    m_XCombo.addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      @Override
      public void actionPerformed(ActionEvent e) {
        setBorderText();
      }
    });
    m_YCombo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setBorderText();
      }
<<<<<<< HEAD
=======
=======
	public void actionPerformed(ActionEvent e) {
	  setBorderText();
	}
    });
    m_YCombo.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  setBorderText();
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    });

    // Just in case the default is ROC
    setBorderText();
  }

  /**
<<<<<<< HEAD
   * This checks the current selected X/Y Axis comboBoxes to see if an ROC graph
   * is selected. If so, add the ROC area string to the plot border, otherwise
   * display the original border text.
=======
<<<<<<< HEAD
   * This checks the current selected X/Y Axis comboBoxes to see if an ROC graph
   * is selected. If so, add the ROC area string to the plot border, otherwise
   * display the original border text.
=======
   * This checks the current selected X/Y Axis comboBoxes to see if 
   * an ROC graph is selected. If so, add the ROC area string to the
   * plot border, otherwise display the original border text.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void setBorderText() {

    String xs = m_XCombo.getSelectedItem().toString();
    String ys = m_YCombo.getSelectedItem().toString();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (xs.equals("X: False Positive Rate (Num)")
      && ys.equals("Y: True Positive Rate (Num)")) {
      m_plotSurround.setBorder((BorderFactory
        .createTitledBorder(m_savePanelBorderText + " " + m_ROCString)));
    } else {
      m_plotSurround.setBorder((BorderFactory
        .createTitledBorder(m_savePanelBorderText)));
    }
<<<<<<< HEAD
=======
=======
    if (xs.equals(Messages.getInstance().getString("ThresholdVisualizePanel_SetBorderText_Text_First")) && ys.equals(Messages.getInstance().getString("ThresholdVisualizePanel_SetBorderText_Text_Second")))   {
        m_plotSurround.setBorder((BorderFactory.createTitledBorder(m_savePanelBorderText+" "+m_ROCString)));
    } else
        m_plotSurround.setBorder((BorderFactory.createTitledBorder(m_savePanelBorderText))); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * displays the previously saved instances
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param insts the instances to display
   * @throws Exception if display is not possible
   */
  @Override
  protected void openVisibleInstances(Instances insts) throws Exception {
    super.openVisibleInstances(insts);

    setROCString("(Area under ROC = "
      + Utils.doubleToString(ThresholdCurve.getROCArea(insts), 4) + ")");

    setBorderText();
  }

  /**
   * Starts the ThresholdVisualizationPanel with parameters from the command
   * line.
   * <p/>
   * 
   * Valid options are:
   * <p/>
   * -h <br/>
   * lists all the commandline parameters
   * <p/>
   * 
   * -t file <br/>
   * Dataset to process with given classifier.
   * <p/>
   * 
   * -W classname <br/>
   * Full classname of classifier to run.<br/>
   * Options after '--' are passed to the classifier. <br/>
   * (default weka.classifiers.functions.Logistic)
   * <p/>
   * 
   * -r number <br/>
   * The number of runs to perform (default 2).
   * <p/>
   * 
   * -x number <br/>
   * The number of Cross-validation folds (default 10).
   * <p/>
   * 
   * -l file <br/>
   * Previously saved threshold curve ARFF file.
   * <p/>
   * 
   * @param args optional commandline parameters
   */
  public static void main(String[] args) {
    Instances inst;
    Classifier classifier;
    int runs;
    int folds;
    String tmpStr;
    boolean compute;
    Instances result;
    String[] options;
    SingleIndex classIndex;
    SingleIndex valueIndex;
    int seed;

    inst = null;
    classifier = null;
    runs = 2;
    folds = 10;
    compute = true;
    result = null;
    classIndex = null;
    valueIndex = null;
    seed = 1;

    try {
      // help?
      if (Utils.getFlag('h', args)) {
        System.out.println("\nOptions for "
          + ThresholdVisualizePanel.class.getName() + ":\n");
        System.out.println("-h\n\tThis help.");
        System.out
          .println("-t <file>\n\tDataset to process with given classifier.");
        System.out
          .println("-c <num>\n\tThe class index. first and last are valid, too (default: last).");
        System.out
          .println("-C <num>\n\tThe index of the class value to get the the curve for (default: first).");
        System.out
          .println("-W <classname>\n\tFull classname of classifier to run.\n\tOptions after '--' are passed to the classifier.\n\t(default: weka.classifiers.functions.Logistic)");
        System.out
          .println("-r <number>\n\tThe number of runs to perform (default: 1).");
        System.out
          .println("-x <number>\n\tThe number of Cross-validation folds (default: 10).");
        System.out
          .println("-S <number>\n\tThe seed value for randomizing the data (default: 1).");
        System.out
          .println("-l <file>\n\tPreviously saved threshold curve ARFF file.");
        return;
      }

      // regular options
      tmpStr = Utils.getOption('l', args);
      if (tmpStr.length() != 0) {
        result = new Instances(new BufferedReader(new FileReader(tmpStr)));
        compute = false;
      }

      if (compute) {
        tmpStr = Utils.getOption('r', args);
        if (tmpStr.length() != 0) {
          runs = Integer.parseInt(tmpStr);
        } else {
          runs = 1;
        }

        tmpStr = Utils.getOption('x', args);
        if (tmpStr.length() != 0) {
          folds = Integer.parseInt(tmpStr);
        } else {
          folds = 10;
        }

        tmpStr = Utils.getOption('S', args);
        if (tmpStr.length() != 0) {
          seed = Integer.parseInt(tmpStr);
        } else {
          seed = 1;
        }

        tmpStr = Utils.getOption('t', args);
        if (tmpStr.length() != 0) {
          inst = new Instances(new BufferedReader(new FileReader(tmpStr)));
          inst.setClassIndex(inst.numAttributes() - 1);
        }

        tmpStr = Utils.getOption('W', args);
        if (tmpStr.length() != 0) {
          options = Utils.partitionOptions(args);
        } else {
          tmpStr = weka.classifiers.functions.Logistic.class.getName();
          options = new String[0];
        }
        classifier = AbstractClassifier.forName(tmpStr, options);

        tmpStr = Utils.getOption('c', args);
        if (tmpStr.length() != 0) {
          classIndex = new SingleIndex(tmpStr);
        } else {
          classIndex = new SingleIndex("last");
        }

        tmpStr = Utils.getOption('C', args);
        if (tmpStr.length() != 0) {
          valueIndex = new SingleIndex(tmpStr);
        } else {
          valueIndex = new SingleIndex("first");
        }
      }

      // compute if necessary
      if (compute) {
        if (classIndex != null) {
          classIndex.setUpper(inst.numAttributes() - 1);
          inst.setClassIndex(classIndex.getIndex());
        } else {
          inst.setClassIndex(inst.numAttributes() - 1);
        }

        if (valueIndex != null) {
          valueIndex.setUpper(inst.classAttribute().numValues() - 1);
        }

        ThresholdCurve tc = new ThresholdCurve();
        EvaluationUtils eu = new EvaluationUtils();
        ArrayList<Prediction> predictions = new ArrayList<Prediction>();
        for (int i = 0; i < runs; i++) {
          eu.setSeed(seed + i);
          predictions.addAll(eu.getCVPredictions(classifier, inst, folds));
        }

        if (valueIndex != null) {
          result = tc.getCurve(predictions, valueIndex.getIndex());
        } else {
          result = tc.getCurve(predictions);
        }
      }

      // setup GUI
      ThresholdVisualizePanel vmc = new ThresholdVisualizePanel();
      vmc.setROCString("(Area under ROC = "
        + Utils.doubleToString(ThresholdCurve.getROCArea(result), 4) + ")");
      if (compute) {
        vmc.setName(result.relationName() + ". (Class value "
          + inst.classAttribute().value(valueIndex.getIndex()) + ")");
      } else {
        vmc.setName(result.relationName() + " (display only)");
      }
<<<<<<< HEAD
=======
=======
   * @param insts	the instances to display
   * @throws Exception	if display is not possible
   */
  protected void openVisibleInstances(Instances insts) throws Exception {
    super.openVisibleInstances(insts);

    setROCString(
    		Messages.getInstance().getString("ThresholdVisualizePanel_OpenVisibleInstances_Text_First") 
	+ Utils.doubleToString(ThresholdCurve.getROCArea(insts), 4) + Messages.getInstance().getString("ThresholdVisualizePanel_OpenVisibleInstances_Text_Second"));
    
    setBorderText();
  }
  
  /**
   * Starts the ThresholdVisualizationPanel with parameters from the command line. <p/>
   * 
   * Valid options are: <p/>
   *  -h <br/>
   *  lists all the commandline parameters <p/>
   *  
   *  -t file <br/>
   *  Dataset to process with given classifier. <p/>
   *  
   *  -W classname <br/>
   *  Full classname of classifier to run.<br/>
   *  Options after '--' are passed to the classifier. <br/>
   *  (default weka.classifiers.functions.Logistic) <p/>
   *  
   *  -r number <br/>
   *  The number of runs to perform (default 2). <p/>
   *  
   *  -x number <br/>
   *  The number of Cross-validation folds (default 10). <p/>
   *  
   *  -l file <br/>
   *  Previously saved threshold curve ARFF file. <p/>
   *
   * @param args optional commandline parameters
   */
  public static void main(String [] args) {
    Instances 		inst;
    Classifier 		classifier;
    int			runs;
    int			folds;
    String 		tmpStr;
    boolean		compute;
    Instances 		result;
    String[] 		options;
    SingleIndex		classIndex;
    SingleIndex		valueIndex;
    int			seed;
    
    inst       = null;
    classifier = null;
    runs       = 2;
    folds      = 10;
    compute    = true;
    result     = null;
    classIndex = null;
    valueIndex = null;
    seed       = 1;
    
    try {
      // help?
      if (Utils.getFlag('h', args)) {
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_First") + ThresholdVisualizePanel.class.getName() + Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Second"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Third"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Fourth"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Fifth"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Sixth"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Seventh"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Eighth"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Nineth"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Tenth"));
	System.out.println(Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Eleventh"));
	return;
      }
      
      // regular options
      tmpStr = Utils.getOption('l', args);
      if (tmpStr.length() != 0) {
	result = new Instances(new BufferedReader(new FileReader(tmpStr)));
	compute = false;
      }
      
      if (compute) {
	tmpStr = Utils.getOption('r', args);
	if (tmpStr.length() != 0)
	  runs = Integer.parseInt(tmpStr);
	else
	  runs = 1;
	
	tmpStr = Utils.getOption('x', args);
	if (tmpStr.length() != 0)
	  folds = Integer.parseInt(tmpStr);
	else
	  folds = 10;
	
	tmpStr = Utils.getOption('S', args);
	if (tmpStr.length() != 0)
	  seed = Integer.parseInt(tmpStr);
	else
	  seed = 1;
	
	tmpStr = Utils.getOption('t', args);
	if (tmpStr.length() != 0) {
	  inst = new Instances(new BufferedReader(new FileReader(tmpStr)));
	  inst.setClassIndex(inst.numAttributes() - 1);
	}
	
	tmpStr = Utils.getOption('W', args);
	if (tmpStr.length() != 0) {
	  options = Utils.partitionOptions(args);
	}
	else {
	  tmpStr = weka.classifiers.functions.Logistic.class.getName();
	  options = new String[0];
	}
	classifier = Classifier.forName(tmpStr, options);
	
	tmpStr = Utils.getOption('c', args);
	if (tmpStr.length() != 0)
	  classIndex = new SingleIndex(tmpStr);
	else
	  classIndex = new SingleIndex("last");
	
	tmpStr = Utils.getOption('C', args);
	if (tmpStr.length() != 0)
	  valueIndex = new SingleIndex(tmpStr);
	else
	  valueIndex = new SingleIndex("first");
      }
      
      // compute if necessary
      if (compute) {
	if (classIndex != null) {
	  classIndex.setUpper(inst.numAttributes() - 1);
	  inst.setClassIndex(classIndex.getIndex());
	}
	else {
	  inst.setClassIndex(inst.numAttributes() - 1);
	}
	
	if (valueIndex != null) {
	  valueIndex.setUpper(inst.classAttribute().numValues() - 1);
	}
	
	ThresholdCurve tc = new ThresholdCurve();
	EvaluationUtils eu = new EvaluationUtils();
	FastVector predictions = new FastVector();
	for (int i = 0; i < runs; i++) {
	  eu.setSeed(seed + i);
	  predictions.appendElements(eu.getCVPredictions(classifier, inst, folds));
	}
	
	if (valueIndex != null)
	  result = tc.getCurve(predictions, valueIndex.getIndex());
	else
	  result = tc.getCurve(predictions);
      }
      
      // setup GUI
      ThresholdVisualizePanel vmc = new ThresholdVisualizePanel();
      vmc.setROCString(Messages.getInstance().getString("ThresholdVisualizePanel_OpenVisibleInstances_Text_Third") + 
	  Utils.doubleToString(ThresholdCurve.getROCArea(result), 4) + Messages.getInstance().getString("ThresholdVisualizePanel_OpenVisibleInstances_Text_Fourth"));
      if (compute)     
	vmc.setName(
	    result.relationName() 
	    + Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Twelveth") + inst.classAttribute().value(valueIndex.getIndex()) + Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Thirteenth"));
      else
	vmc.setName(
	    result.relationName()
	    + Messages.getInstance().getString("ThresholdVisualizePanel_Main_Text_Fourteenth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      PlotData2D tempd = new PlotData2D(result);
      tempd.setPlotName(result.relationName());
      tempd.addInstanceNumberAttribute();
      vmc.addPlot(tempd);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      String plotName = vmc.getName();
      final JFrame jf = new JFrame("Weka Classifier Visualize: " + plotName);
      jf.setSize(500, 400);
      jf.getContentPane().setLayout(new BorderLayout());

      jf.getContentPane().add(vmc, BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
          jf.dispose();
        }
      });

      jf.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
<<<<<<< HEAD
=======
=======
      
      String plotName = vmc.getName(); 
      final JFrame jf = new JFrame(Messages.getInstance().getString("ThresholdVisualizePanel_Main_JFrame_Text") + plotName);
      jf.setSize(500,400);
      jf.getContentPane().setLayout(new BorderLayout());
      
      jf.getContentPane().add(vmc, BorderLayout.CENTER);
      jf.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	  jf.dispose();
	}
      });
      
      jf.setVisible(true);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
