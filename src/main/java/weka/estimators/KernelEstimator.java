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
 *    KernelEstimator.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.estimators;

<<<<<<< HEAD
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Aggregateable;
import weka.core.RevisionUtils;
import weka.core.Statistics;
import weka.core.Utils;

/**
 * Simple kernel density estimator. Uses one gaussian kernel per observed data
 * value.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 9785 $
 */
public class KernelEstimator extends Estimator implements IncrementalEstimator,
    Aggregateable<KernelEstimator> {
=======
import weka.core.Capabilities.Capability;
import weka.core.Capabilities;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.Statistics;

/** 
 * Simple kernel density estimator. Uses one gaussian kernel per observed
 * data value.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 5540 $
 */
public class KernelEstimator extends Estimator implements IncrementalEstimator {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 3646923563367683925L;

  /** Vector containing all of the values seen */
<<<<<<< HEAD
  private double[] m_Values;

  /** Vector containing the associated weights */
  private double[] m_Weights;
=======
  private double [] m_Values;

  /** Vector containing the associated weights */
  private double [] m_Weights;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Number of values stored in m_Weights and m_Values so far */
  private int m_NumValues;

  /** The sum of the weights so far */
  private double m_SumOfWeights;

  /** The standard deviation */
  private double m_StandardDev;

  /** The precision of data values */
  private double m_Precision;

  /** Whether we can optimise the kernel summation */
  private boolean m_AllWeightsOne;

  /** Maximum percentage error permitted in probability calculations */
  private static double MAX_ERROR = 0.01;

<<<<<<< HEAD
  /**
   * Execute a binary search to locate the nearest data value
   * 
=======

  /**
   * Execute a binary search to locate the nearest data value
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param the data value to locate
   * @return the index of the nearest data value
   */
  private int findNearestValue(double key) {

<<<<<<< HEAD
    int low = 0;
=======
    int low = 0; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int high = m_NumValues;
    int middle = 0;
    while (low < high) {
      middle = (low + high) / 2;
      double current = m_Values[middle];
      if (current == key) {
<<<<<<< HEAD
        return middle;
      }
      if (current > key) {
        high = middle;
      } else if (current < key) {
        low = middle + 1;
=======
	return middle;
      }
      if (current > key) {
	high = middle;
      } else if (current < key) {
	low = middle + 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return low;
  }

  /**
   * Round a data value using the defined precision for this estimator
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param data the value to round
   * @return the rounded data value
   */
  private double round(double data) {

    return Math.rint(data / m_Precision) * m_Precision;
  }
<<<<<<< HEAD

  // ===============
  // Public methods.
  // ===============

  /**
   * Constructor that takes a precision argument.
   * 
   * @param precision the precision to which numeric values are given. For
   *          example, if the precision is stated to be 0.1, the values in the
   *          interval (0.25,0.35] are all treated as 0.3.
   */
  public KernelEstimator(double precision) {

    m_Values = new double[50];
    m_Weights = new double[50];
=======
  
  // ===============
  // Public methods.
  // ===============
  
  /**
   * Constructor that takes a precision argument.
   *
   * @param precision the  precision to which numeric values are given. For
   * example, if the precision is stated to be 0.1, the values in the
   * interval (0.25,0.35] are all treated as 0.3. 
   */
  public KernelEstimator(double precision) {

    m_Values = new double [50];
    m_Weights = new double [50];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_NumValues = 0;
    m_SumOfWeights = 0;
    m_AllWeightsOne = true;
    m_Precision = precision;
    // precision cannot be zero
<<<<<<< HEAD
    if (m_Precision < Utils.SMALL)
      m_Precision = Utils.SMALL;
    // m_StandardDev = 1e10 * m_Precision; // Set the standard deviation
    // initially very wide
=======
    if (m_Precision < Utils.SMALL) m_Precision = Utils.SMALL;
    //    m_StandardDev = 1e10 * m_Precision; // Set the standard deviation initially very wide
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_StandardDev = m_Precision / (2 * 3);
  }

  /**
   * Add a new data value to the current estimator.
<<<<<<< HEAD
   * 
   * @param data the new data value
   * @param weight the weight assigned to the data value
   */
  @Override
  public void addValue(double data, double weight) {

=======
   *
   * @param data the new data value 
   * @param weight the weight assigned to the data value 
   */
  public void addValue(double data, double weight) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (weight == 0) {
      return;
    }
    data = round(data);
    int insertIndex = findNearestValue(data);
    if ((m_NumValues <= insertIndex) || (m_Values[insertIndex] != data)) {
      if (m_NumValues < m_Values.length) {
<<<<<<< HEAD
        int left = m_NumValues - insertIndex;
        System
            .arraycopy(m_Values, insertIndex, m_Values, insertIndex + 1, left);
        System.arraycopy(m_Weights, insertIndex, m_Weights, insertIndex + 1,
            left);

=======
        int left = m_NumValues - insertIndex; 
        System.arraycopy(m_Values, insertIndex, 
            m_Values, insertIndex + 1, left);
        System.arraycopy(m_Weights, insertIndex, 
            m_Weights, insertIndex + 1, left);
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        m_Values[insertIndex] = data;
        m_Weights[insertIndex] = weight;
        m_NumValues++;
      } else {
<<<<<<< HEAD
        double[] newValues = new double[m_Values.length * 2];
        double[] newWeights = new double[m_Values.length * 2];
        int left = m_NumValues - insertIndex;
=======
        double [] newValues = new double [m_Values.length * 2];
        double [] newWeights = new double [m_Values.length * 2];
        int left = m_NumValues - insertIndex; 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        System.arraycopy(m_Values, 0, newValues, 0, insertIndex);
        System.arraycopy(m_Weights, 0, newWeights, 0, insertIndex);
        newValues[insertIndex] = data;
        newWeights[insertIndex] = weight;
<<<<<<< HEAD
        System.arraycopy(m_Values, insertIndex, newValues, insertIndex + 1,
            left);
        System.arraycopy(m_Weights, insertIndex, newWeights, insertIndex + 1,
            left);
=======
        System.arraycopy(m_Values, insertIndex, 
            newValues, insertIndex + 1, left);
        System.arraycopy(m_Weights, insertIndex, 
            newWeights, insertIndex + 1, left);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        m_NumValues++;
        m_Values = newValues;
        m_Weights = newWeights;
      }
      if (weight != 1) {
        m_AllWeightsOne = false;
      }
    } else {
      m_Weights[insertIndex] += weight;
<<<<<<< HEAD
      m_AllWeightsOne = false;
=======
      m_AllWeightsOne = false;      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    m_SumOfWeights += weight;
    double range = m_Values[m_NumValues - 1] - m_Values[0];
    if (range > 0) {
<<<<<<< HEAD
      m_StandardDev = Math.max(range / Math.sqrt(m_SumOfWeights),
      // allow at most 3 sds within one interval
          m_Precision / (2 * 3));
    }
  }

  /**
   * Get a probability estimate for a value.
   * 
   * @param data the value to estimate the probability of
   * @return the estimated probability of the supplied value
   */
  @Override
=======
      m_StandardDev = Math.max(range / Math.sqrt(m_SumOfWeights), 
          // allow at most 3 sds within one interval
          m_Precision / (2 * 3));
    }
  }
  
  /**
   * Get a probability estimate for a value.
   *
   * @param data the value to estimate the probability of
   * @return the estimated probability of the supplied value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public double getProbability(double data) {

    double delta = 0, sum = 0, currentProb = 0;
    double zLower = 0, zUpper = 0;
    if (m_NumValues == 0) {
      zLower = (data - (m_Precision / 2)) / m_StandardDev;
      zUpper = (data + (m_Precision / 2)) / m_StandardDev;
<<<<<<< HEAD
      return (Statistics.normalProbability(zUpper) - Statistics
          .normalProbability(zLower));
=======
      return (Statistics.normalProbability(zUpper)
	      - Statistics.normalProbability(zLower));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    double weightSum = 0;
    int start = findNearestValue(data);
    for (int i = start; i < m_NumValues; i++) {
      delta = m_Values[i] - data;
      zLower = (delta - (m_Precision / 2)) / m_StandardDev;
      zUpper = (delta + (m_Precision / 2)) / m_StandardDev;
<<<<<<< HEAD
      currentProb = (Statistics.normalProbability(zUpper) - Statistics
          .normalProbability(zLower));
      sum += currentProb * m_Weights[i];
      /*
       * System.out.print("zL" + (i + 1) + ": " + zLower + " ");
       * System.out.print("zU" + (i + 1) + ": " + zUpper + " ");
       * System.out.print("P" + (i + 1) + ": " + currentProb + " ");
       * System.out.println("total: " + (currentProb * m_Weights[i]) + " ");
       */
      weightSum += m_Weights[i];
      if (currentProb * (m_SumOfWeights - weightSum) < sum * MAX_ERROR) {
        break;
=======
      currentProb = (Statistics.normalProbability(zUpper)
		     - Statistics.normalProbability(zLower));
      sum += currentProb * m_Weights[i];
      /*
      System.out.print("zL" + (i + 1) + ": " + zLower + " ");
      System.out.print("zU" + (i + 1) + ": " + zUpper + " ");
      System.out.print("P" + (i + 1) + ": " + currentProb + " ");
      System.out.println("total: " + (currentProb * m_Weights[i]) + " ");
      */
      weightSum += m_Weights[i];
      if (currentProb * (m_SumOfWeights - weightSum) < sum * MAX_ERROR) {
	break;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    for (int i = start - 1; i >= 0; i--) {
      delta = m_Values[i] - data;
      zLower = (delta - (m_Precision / 2)) / m_StandardDev;
      zUpper = (delta + (m_Precision / 2)) / m_StandardDev;
<<<<<<< HEAD
      currentProb = (Statistics.normalProbability(zUpper) - Statistics
          .normalProbability(zLower));
      sum += currentProb * m_Weights[i];
      weightSum += m_Weights[i];
      if (currentProb * (m_SumOfWeights - weightSum) < sum * MAX_ERROR) {
        break;
=======
      currentProb = (Statistics.normalProbability(zUpper)
		     - Statistics.normalProbability(zLower));
      sum += currentProb * m_Weights[i];
      weightSum += m_Weights[i];
      if (currentProb * (m_SumOfWeights - weightSum) < sum * MAX_ERROR) {
	break;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return sum / m_SumOfWeights;
  }

  /** Display a representation of this estimator */
<<<<<<< HEAD
  @Override
  public String toString() {

    String result = m_NumValues + " Normal Kernels. \nStandardDev = "
        + Utils.doubleToString(m_StandardDev, 6, 4) + " Precision = "
        + m_Precision;
=======
  public String toString() {

    String result = m_NumValues + " Normal Kernels. \nStandardDev = " 
      + Utils.doubleToString(m_StandardDev,6,4)
      + " Precision = " + m_Precision;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_NumValues == 0) {
      result += "  \nMean = 0";
    } else {
      result += "  \nMeans =";
      for (int i = 0; i < m_NumValues; i++) {
<<<<<<< HEAD
        result += " " + m_Values[i];
      }
      if (!m_AllWeightsOne) {
        result += "\nWeights = ";
        for (int i = 0; i < m_NumValues; i++) {
          result += " " + m_Weights[i];
        }
=======
	result += " " + m_Values[i];
      }
      if (!m_AllWeightsOne) {
	result += "\nWeights = ";
	for (int i = 0; i < m_NumValues; i++) {
	  result += " " + m_Weights[i];
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return result + "\n";
  }

  /**
   * Return the number of kernels in this kernel estimator
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the number of kernels
   */
  public int getNumKernels() {
    return m_NumValues;
  }

  /**
   * Return the means of the kernels.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the means of the kernels
   */
  public double[] getMeans() {
    return m_Values;
  }

  /**
   * Return the weights of the kernels.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the weights of the kernels
   */
  public double[] getWeights() {
    return m_Weights;
  }

  /**
   * Return the precision of this kernel estimator.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the precision
   */
  public double getPrecision() {
    return m_Precision;
  }

  /**
   * Return the standard deviation of this kernel estimator.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the standard deviation
   */
  public double getStdDev() {
    return m_StandardDev;
  }

  /**
   * Returns default capabilities of the classifier.
<<<<<<< HEAD
   * 
   * @return the capabilities of this classifier
   */
  @Override
=======
   *
   * @return      the capabilities of this classifier
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
    // class
    if (!m_noClass) {
      result.enable(Capability.NOMINAL_CLASS);
      result.enable(Capability.MISSING_CLASS_VALUES);
    } else {
      result.enable(Capability.NO_CLASS);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // attributes
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    return result;
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9785 $");
  }

  @Override
  public KernelEstimator aggregate(KernelEstimator toAggregate)
      throws Exception {

    for (int i = 0; i < toAggregate.m_NumValues; i++) {
      addValue(toAggregate.m_Values[i], toAggregate.m_Weights[i]);
    }

    return this;
  }

  @Override
  public void finalizeAggregation() throws Exception {
    // nothing to do
  }

  public static void testAggregation() {
    KernelEstimator ke = new KernelEstimator(0.01);
    KernelEstimator one = new KernelEstimator(0.01);
    KernelEstimator two = new KernelEstimator(0.01);

    java.util.Random r = new java.util.Random(1);

    for (int i = 0; i < 100; i++) {
      double z = r.nextDouble();

      ke.addValue(z, 1);
      if (i < 50) {
        one.addValue(z, 1);
      } else {
        two.addValue(z, 1);
      }
    }

    try {

      System.out.println("\n\nFull\n");
      System.out.println(ke.toString());
      System.out.println("Prob (0): " + ke.getProbability(0));

      System.out.println("\nOne\n" + one.toString());
      System.out.println("Prob (0): " + one.getProbability(0));

      System.out.println("\nTwo\n" + two.toString());
      System.out.println("Prob (0): " + two.getProbability(0));

      one = one.aggregate(two);

      System.out.println("Aggregated\n");
      System.out.println(one.toString());
      System.out.println("Prob (0): " + one.getProbability(0));
    } catch (Exception ex) {
      ex.printStackTrace();
    }
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5540 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv should contain a sequence of numeric values
   */
  public static void main(String[] argv) {

    try {
      if (argv.length < 2) {
        System.out.println("Please specify a set of instances.");
        return;
      }
      KernelEstimator newEst = new KernelEstimator(0.01);
      for (int i = 0; i < argv.length - 3; i += 2) {
        newEst.addValue(Double.valueOf(argv[i]).doubleValue(),
            Double.valueOf(argv[i + 1]).doubleValue());
=======
   *
   * @param argv should contain a sequence of numeric values
   */
  public static void main(String [] argv) {

    try {
      if (argv.length < 2) {
	System.out.println("Please specify a set of instances.");
	return;
      }
      KernelEstimator newEst = new KernelEstimator(0.01);
      for (int i = 0; i < argv.length - 3; i += 2) {
	newEst.addValue(Double.valueOf(argv[i]).doubleValue(), 
			Double.valueOf(argv[i + 1]).doubleValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.out.println(newEst);

      double start = Double.valueOf(argv[argv.length - 2]).doubleValue();
      double finish = Double.valueOf(argv[argv.length - 1]).doubleValue();
<<<<<<< HEAD
      for (double current = start; current < finish; current += (finish - start) / 50) {
        System.out.println("Data: " + current + " "
            + newEst.getProbability(current));
      }

      KernelEstimator.testAggregation();
=======
      for (double current = start; current < finish; 
	  current += (finish - start) / 50) {
	System.out.println("Data: " + current + " " 
			   + newEst.getProbability(current));
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
