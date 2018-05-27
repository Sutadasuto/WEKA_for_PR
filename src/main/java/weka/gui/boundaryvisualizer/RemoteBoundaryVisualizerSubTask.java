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
 *   RemoteBoundaryVisualizerSubTask.java
<<<<<<< HEAD
 *   Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *   Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *   Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.boundaryvisualizer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Random;

import weka.classifiers.Classifier;
import weka.core.DenseInstance;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Utils;
import weka.experiment.Task;
import weka.experiment.TaskStatusInfo;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Class that encapsulates a sub task for distributed boundary visualization.
 * Produces probability distributions for each pixel in one row of the
 * visualization.
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10222 $
<<<<<<< HEAD
=======
=======
import java.util.Random;

/**
 * Class that encapsulates a sub task for distributed boundary
 * visualization. Produces probability distributions for each pixel
 * in one row of the visualization.
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @since 1.0
 * @see Task
 */
public class RemoteBoundaryVisualizerSubTask implements Task {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** ID added to avoid warning */
  private static final long serialVersionUID = -5275252329449241592L;

  // status information for this sub task
  private final TaskStatusInfo m_status = new TaskStatusInfo();
<<<<<<< HEAD
=======
=======
  // status information for this sub task
  private TaskStatusInfo m_status = new TaskStatusInfo();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  // the result of this sub task
  private RemoteResult m_result;

  // which row are we doing
  private int m_rowNumber;

  // width and height of the visualization
  private int m_panelHeight;
  private int m_panelWidth;

  // the classifier to use
  private Classifier m_classifier;

  // the kernel density estimator
  private DataGenerator m_dataGenerator;

  // the training data
  private Instances m_trainingData;

  // attributes for visualizing on (fixed dimensions)
  private int m_xAttribute;
  private int m_yAttribute;

  // pixel width and height in terms of attribute values
  private double m_pixHeight;
  private double m_pixWidth;

  // min, max of these attributes
  private double m_minX;
  private double m_minY;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
  private double m_maxX;
  private double m_maxY;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  // number of samples to take from each region in the fixed dimensions
  private int m_numOfSamplesPerRegion = 2;

  // number of samples per kernel = base ^ (# non-fixed dimensions)
  private int m_numOfSamplesPerGenerator;
  private double m_samplesBase = 2.0;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  // A random number generator
  private Random m_random;

  private double[] m_weightingAttsValues;
  private boolean[] m_attsToWeightOn;
  private double[] m_vals;
  private double[] m_dist;
  private Instance m_predInst;

  /**
   * Set the row number for this sub task
   * 
<<<<<<< HEAD
=======
=======
  // A random number generator 
  private Random m_random;

  private double [] m_weightingAttsValues;
  private boolean [] m_attsToWeightOn;
  private double [] m_vals;
  private double [] m_dist;
  private Instance m_predInst;
  
  /**
   * Set the row number for this sub task
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param rn the row number
   */
  public void setRowNumber(int rn) {
    m_rowNumber = rn;
  }

  /**
   * Set the width of the visualization
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pw the width
   */
  public void setPanelWidth(int pw) {
    m_panelWidth = pw;
  }

  /**
   * Set the height of the visualization
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param ph the height
   */
  public void setPanelHeight(int ph) {
    m_panelHeight = ph;
  }

  /**
   * Set the height of a pixel
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param ph the height of a pixel
   */
  public void setPixHeight(double ph) {
    m_pixHeight = ph;
  }

  /**
   * Set the width of a pixel
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pw the width of a pixel
   */
  public void setPixWidth(double pw) {
    m_pixWidth = pw;
  }

  /**
   * Set the classifier to use
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param dc the classifier
   */
  public void setClassifier(Classifier dc) {
    m_classifier = dc;
  }

  /**
   * Set the density estimator to use
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param dg the density estimator
   */
  public void setDataGenerator(DataGenerator dg) {
    m_dataGenerator = dg;
  }

  /**
   * Set the training data
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param i the training data
   */
  public void setInstances(Instances i) {
    m_trainingData = i;
  }

  /**
   * Set the minimum and maximum values of the x axis fixed dimension
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param minx a <code>double</code> value
   * @param maxx a <code>double</code> value
   */
  public void setMinMaxX(double minx, double maxx) {
<<<<<<< HEAD
    m_minX = minx;
=======
<<<<<<< HEAD
    m_minX = minx;
=======
    m_minX = minx; m_maxX = maxx;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set the minimum and maximum values of the y axis fixed dimension
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param miny a <code>double</code> value
   * @param maxy a <code>double</code> value
   */
  public void setMinMaxY(double miny, double maxy) {
<<<<<<< HEAD
    m_minY = miny;
=======
<<<<<<< HEAD
    m_minY = miny;
=======
    m_minY = miny; m_maxY = maxy;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set the x axis fixed dimension
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param xatt an <code>int</code> value
   */
  public void setXAttribute(int xatt) {
    m_xAttribute = xatt;
  }

  /**
   * Set the y axis fixed dimension
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param yatt an <code>int</code> value
   */
  public void setYAttribute(int yatt) {
    m_yAttribute = yatt;
  }

  /**
   * Set the number of points to uniformly sample from a region (fixed
   * dimensions).
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param num an <code>int</code> value
   */
  public void setNumSamplesPerRegion(int num) {
    m_numOfSamplesPerRegion = num;
  }

  /**
   * Set the base for computing the number of samples to obtain from each
   * generator. number of samples = base ^ (# non fixed dimensions)
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param ksb a <code>double</code> value
   */
  public void setGeneratorSamplesBase(double ksb) {
    m_samplesBase = ksb;
  }

  /**
   * Perform the sub task
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void execute() {

    m_random = new Random(m_rowNumber * 11);
    m_dataGenerator.setSeed(m_rowNumber * 11);
    m_result = new RemoteResult(m_rowNumber, m_panelWidth);
    m_status.setTaskResult(m_result);
    m_status.setExecutionStatus(TaskStatusInfo.PROCESSING);

    try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_numOfSamplesPerGenerator = (int) Math.pow(m_samplesBase,
        m_trainingData.numAttributes() - 3);
      if (m_trainingData == null) {
        throw new Exception("No training data set (BoundaryPanel)");
      }
      if (m_classifier == null) {
        throw new Exception("No classifier set (BoundaryPanel)");
      }
      if (m_dataGenerator == null) {
        throw new Exception("No data generator set (BoundaryPanel)");
      }
      if (m_trainingData.attribute(m_xAttribute).isNominal()
        || m_trainingData.attribute(m_yAttribute).isNominal()) {
        throw new Exception("Visualization dimensions must be numeric "
          + "(RemoteBoundaryVisualizerSubTask)");
      }

      m_attsToWeightOn = new boolean[m_trainingData.numAttributes()];
      m_attsToWeightOn[m_xAttribute] = true;
      m_attsToWeightOn[m_yAttribute] = true;

      // generate samples
      m_weightingAttsValues = new double[m_attsToWeightOn.length];
      m_vals = new double[m_trainingData.numAttributes()];
      m_predInst = new DenseInstance(1.0, m_vals);
      m_predInst.setDataset(m_trainingData);

      System.err.println("Executing row number " + m_rowNumber);
      for (int j = 0; j < m_panelWidth; j++) {
        double[] preds = calculateRegionProbs(j, m_rowNumber);
        m_result.setLocationProbs(j, preds);
        m_result
          .setPercentCompleted((int) (100 * ((double) j / (double) m_panelWidth)));
      }
    } catch (Exception ex) {
      m_status.setExecutionStatus(TaskStatusInfo.FAILED);
      m_status.setStatusMessage("Row " + m_rowNumber + " failed.");
<<<<<<< HEAD
=======
=======
      m_numOfSamplesPerGenerator = 
	(int)Math.pow(m_samplesBase, m_trainingData.numAttributes()-3);
      if (m_trainingData == null) {
	throw new Exception(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_TrainingData_Error_Text_First"));
      }
      if (m_classifier == null) {
	throw new Exception(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_Classifier_Error_Text"));
      }
      if (m_dataGenerator == null) {
	throw new Exception(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_DataGenerator_Error_Text"));
      }
      if (m_trainingData.attribute(m_xAttribute).isNominal() || 
	m_trainingData.attribute(m_yAttribute).isNominal()) {
	throw new Exception(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_TrainingData_Error_Text_Second"));
      }
      
      m_attsToWeightOn = new boolean[m_trainingData.numAttributes()];
      m_attsToWeightOn[m_xAttribute] = true;
      m_attsToWeightOn[m_yAttribute] = true;
      
      // generate samples
      m_weightingAttsValues = new double [m_attsToWeightOn.length];
      m_vals = new double[m_trainingData.numAttributes()];
      m_predInst = new Instance(1.0, m_vals);
      m_predInst.setDataset(m_trainingData);

      System.err.println(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_Error_Text") + m_rowNumber);
      for (int j = 0; j < m_panelWidth; j++) {
	double [] preds = calculateRegionProbs(j, m_rowNumber);
	m_result.setLocationProbs(j, preds);
	m_result.
	  setPercentCompleted((int)(100 * ((double)j / (double)m_panelWidth)));
      }
    } catch (Exception ex) {
      m_status.setExecutionStatus(TaskStatusInfo.FAILED);
      m_status.setStatusMessage(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_StatusMessage_Text_Front_First") + m_rowNumber + Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_StatusMessage_Text_End_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.print(ex);
      return;
    }

    // finished
    m_status.setExecutionStatus(TaskStatusInfo.FINISHED);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_status
      .setStatusMessage("Row " + m_rowNumber + " completed successfully.");
  }

  private double[] calculateRegionProbs(int j, int i) throws Exception {
    double[] sumOfProbsForRegion = new double[m_trainingData.classAttribute()
      .numValues()];

    for (int u = 0; u < m_numOfSamplesPerRegion; u++) {

      double[] sumOfProbsForLocation = new double[m_trainingData
        .classAttribute().numValues()];

      m_weightingAttsValues[m_xAttribute] = getRandomX(j);
      m_weightingAttsValues[m_yAttribute] = getRandomY(m_panelHeight - i - 1);

      m_dataGenerator.setWeightingValues(m_weightingAttsValues);

      double[] weights = m_dataGenerator.getWeights();
      double sumOfWeights = Utils.sum(weights);
      int[] indices = Utils.sort(weights);

      // Prune 1% of weight mass
      int[] newIndices = new int[indices.length];
      double sumSoFar = 0;
      double criticalMass = 0.99 * sumOfWeights;
      int index = weights.length - 1;
      int counter = 0;
      for (int z = weights.length - 1; z >= 0; z--) {
        newIndices[index--] = indices[z];
        sumSoFar += weights[indices[z]];
        counter++;
        if (sumSoFar > criticalMass) {
          break;
        }
      }
      indices = new int[counter];
      System.arraycopy(newIndices, index + 1, indices, 0, counter);

      for (int z = 0; z < m_numOfSamplesPerGenerator; z++) {

        m_dataGenerator.setWeightingValues(m_weightingAttsValues);
        double[][] values = m_dataGenerator.generateInstances(indices);

        for (int q = 0; q < values.length; q++) {
          if (values[q] != null) {
            System.arraycopy(values[q], 0, m_vals, 0, m_vals.length);
            m_vals[m_xAttribute] = m_weightingAttsValues[m_xAttribute];
            m_vals[m_yAttribute] = m_weightingAttsValues[m_yAttribute];

            // classify the instance
            m_dist = m_classifier.distributionForInstance(m_predInst);

            for (int k = 0; k < sumOfProbsForLocation.length; k++) {
              sumOfProbsForLocation[k] += (m_dist[k] * weights[q]);
            }
          }
        }
      }

      for (int k = 0; k < sumOfProbsForRegion.length; k++) {
        sumOfProbsForRegion[k] += (sumOfProbsForLocation[k] * sumOfWeights);
      }
    }

<<<<<<< HEAD
=======
=======
    m_status.setStatusMessage(Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_StatusMessage_Text_Front") + m_rowNumber + Messages.getInstance().getString("RemoteBoundaryVisualizerSubTask_Execute_StatusMessage_Text_End"));
  }


  private double [] calculateRegionProbs(int j, int i) throws Exception {
    double [] sumOfProbsForRegion = 
      new double [m_trainingData.classAttribute().numValues()];

    for (int u = 0; u < m_numOfSamplesPerRegion; u++) {
      
      double [] sumOfProbsForLocation = 
	new double [m_trainingData.classAttribute().numValues()];
      
      m_weightingAttsValues[m_xAttribute] = getRandomX(j);
      m_weightingAttsValues[m_yAttribute] = getRandomY(m_panelHeight-i-1);
      
      m_dataGenerator.setWeightingValues(m_weightingAttsValues);
      
      double [] weights = m_dataGenerator.getWeights();
      double sumOfWeights = Utils.sum(weights);
      int [] indices = Utils.sort(weights);
      
      // Prune 1% of weight mass
      int [] newIndices = new int[indices.length];
      double sumSoFar = 0; 
      double criticalMass = 0.99 * sumOfWeights;
      int index = weights.length - 1; int counter = 0;
      for (int z = weights.length - 1; z >= 0; z--) {
	newIndices[index--] = indices[z];
	sumSoFar += weights[indices[z]];
	counter++;
	if (sumSoFar > criticalMass) {
	  break;
	}
      }
      indices = new int[counter];
      System.arraycopy(newIndices, index + 1, indices, 0, counter);
      
      for (int z = 0; z < m_numOfSamplesPerGenerator; z++) {
        
	m_dataGenerator.setWeightingValues(m_weightingAttsValues);
	double [][] values = m_dataGenerator.generateInstances(indices);
        
	for (int q = 0; q < values.length; q++) {
	  if (values[q] != null) {
	    System.arraycopy(values[q], 0, m_vals, 0, m_vals.length);
	    m_vals[m_xAttribute] = m_weightingAttsValues[m_xAttribute];
	    m_vals[m_yAttribute] = m_weightingAttsValues[m_yAttribute];
            
	    // classify the instance
	    m_dist = m_classifier.distributionForInstance(m_predInst);

	    for (int k = 0; k < sumOfProbsForLocation.length; k++) {
	      sumOfProbsForLocation[k] += (m_dist[k] * weights[q]); 
	    }
	  }
	}
      }
      
      for (int k = 0; k < sumOfProbsForRegion.length; k++) {
	sumOfProbsForRegion[k] += (sumOfProbsForLocation[k] * sumOfWeights); 
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // average
    Utils.normalize(sumOfProbsForRegion);

    // cache
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double[] tempDist = new double[sumOfProbsForRegion.length];
    System.arraycopy(sumOfProbsForRegion, 0, tempDist, 0,
      sumOfProbsForRegion.length);

<<<<<<< HEAD
=======
=======
    double [] tempDist = new double[sumOfProbsForRegion.length];
    System.arraycopy(sumOfProbsForRegion, 0, tempDist, 
		     0, sumOfProbsForRegion.length);
		
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return tempDist;
  }

  /**
<<<<<<< HEAD
   * Return a random x attribute value contained within the pix'th horizontal
   * pixel
   * 
=======
<<<<<<< HEAD
   * Return a random x attribute value contained within the pix'th horizontal
   * pixel
   * 
=======
   * Return a random x attribute value contained within
   * the pix'th horizontal pixel
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pix the horizontal pixel number
   * @return a value in attribute space
   */
  private double getRandomX(int pix) {

<<<<<<< HEAD
    double minPix = m_minX + (pix * m_pixWidth);
=======
<<<<<<< HEAD
    double minPix = m_minX + (pix * m_pixWidth);
=======
    double minPix =  m_minX + (pix * m_pixWidth);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return minPix + m_random.nextDouble() * m_pixWidth;
  }

  /**
<<<<<<< HEAD
   * Return a random y attribute value contained within the pix'th vertical
   * pixel
   * 
=======
<<<<<<< HEAD
   * Return a random y attribute value contained within the pix'th vertical
   * pixel
   * 
=======
   * Return a random y attribute value contained within
   * the pix'th vertical pixel
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pix the vertical pixel number
   * @return a value in attribute space
   */
  private double getRandomY(int pix) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    double minPix = m_minY + (pix * m_pixHeight);

    return minPix + m_random.nextDouble() * m_pixHeight;
  }

  /**
   * Return status information for this sub task
   * 
   * @return a <code>TaskStatusInfo</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
    
    double minPix = m_minY + (pix * m_pixHeight);
    
    return minPix +  m_random.nextDouble() * m_pixHeight;
  }
  
  /**
   * Return status information for this sub task
   *
   * @return a <code>TaskStatusInfo</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public TaskStatusInfo getTaskStatus() {
    return m_status;
  }
}
