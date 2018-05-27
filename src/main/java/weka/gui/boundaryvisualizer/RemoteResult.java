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
 *   RemoteResult.java
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

import java.io.Serializable;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * Class that encapsulates a result (and progress info) for part of a
 * distributed boundary visualization. The result of a sub-task is the
 * probabilities necessary to display one row of the final visualization.
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10222 $
 * @since 1.0
 * @see Serializable
 */
public class RemoteResult implements Serializable {
<<<<<<< HEAD
=======
=======
 * Class that encapsulates a result (and progress info) for part
 * of a distributed boundary visualization. The result of a sub-task
 * is the probabilities necessary to display one row of the final 
 * visualization.
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 1.3 $
 * @since 1.0
 * @see Serializable
 */
public class RemoteResult
  implements Serializable {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 1873271280044633808L;

  /** the row number that this result corresponds to */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  // private int m_rowNumber; NOT USED

  /** how many pixels in a row */
  // private int m_rowLength; NOT USED

  /**
   * the result - ie. the probability distributions produced by the classifier
   * for this row in the visualization
   */
  private final double[][] m_probabilities;
<<<<<<< HEAD
=======
=======
  private int m_rowNumber;

  /** how many pixels in a row */
  private int m_rowLength;

  /** the result - ie. the probability distributions produced by the
   * classifier for this row in the visualization */
  private double [][] m_probabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** progress on computing this row */
  private int m_percentCompleted;

  /**
   * Creates a new <code>RemoteResult</code> instance.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param rowNum the row number
   * @param rowLength the number of pixels in the row
   */
  public RemoteResult(int rowNum, int rowLength) {
    m_probabilities = new double[rowLength][0];
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Store the classifier's distribution for a particular pixel in the
   * visualization
   * 
   * @param index the pixel
   * @param distribution the probability distribution from the classifier
   */
  public void setLocationProbs(int index, double[] distribution) {
<<<<<<< HEAD
=======
=======
  
  /**
   * Store the classifier's distribution for a particular pixel in the
   * visualization
   *
   * @param index the pixel
   * @param distribution the probability distribution from the classifier
   */
  public void setLocationProbs(int index, double [] distribution) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_probabilities[index] = distribution;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Return the probability distributions for this row in the visualization
   * 
   * @return the probability distributions
   */
  public double[][] getProbabilities() {
<<<<<<< HEAD
=======
=======
   * Return the probability distributions  for this row in the visualization
   *
   * @return the probability distributions
   */
  public double [][] getProbabilities() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_probabilities;
  }

  /**
   * Set the progress for this row so far
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pc a percent completed value
   */
  public void setPercentCompleted(int pc) {
    m_percentCompleted = pc;
  }

  /**
   * Return the progress for this row
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a percent completed value
   */
  public int getPercentCompleted() {
    return m_percentCompleted;
  }
}
