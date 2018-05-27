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
 *   DataGenerator.java
<<<<<<< HEAD
 *   Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *   Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *   Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.boundaryvisualizer;

<<<<<<< HEAD
import weka.core.Instances;
=======
<<<<<<< HEAD
import weka.core.Instances;
=======
import weka.core.*;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * Interface to something that can generate new instances based on
 * a set of input instances
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.4 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @since 1.0
 */
public interface DataGenerator {

  /**
   * Build the data generator
   *
   * @param inputInstances Instances to build the generator from
   * @exception Exception if an error occurs
   */
  void buildGenerator(Instances inputInstances) throws Exception;

  /**
   * Generate an instance. Should return a new Instance object
   *
   * @return an <code>Instance</code> value
   * @exception Exception if an error occurs
   */
  double [][] generateInstances(int [] indices) throws Exception;

  /**
   * Get weights
   */
  double [] getWeights() throws Exception;

  /**
   * Set the dimensions to be used in computing a weight for
   * each instance generated
   *
   * @param dimensions an array of booleans specifying the dimensions to
   * be used when computing instance weights
   */
  void setWeightingDimensions(boolean [] dimensions);

  /**
   * Set the values of the dimensions (chosen via setWeightingDimensions)
   * to be used when computing instance weights
   *
   * @param vals a <code>double[]</code> value
   */
  void setWeightingValues(double [] vals);

  /**
   * Returns the number of generating models used by this DataGenerator
   *
   * @return an <code>int</code> value
   */
  int getNumGeneratingModels();

  /**
   * Set a seed for random number generation (if needed).
   *
   * @param seed an <code>int</code> value
   */
  void setSeed(int seed);
}
