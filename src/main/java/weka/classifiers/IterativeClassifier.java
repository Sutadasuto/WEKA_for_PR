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
 *    IterativeClassifier.java
<<<<<<< HEAD
 *    Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2001  University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers;

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
 * Interface for classifiers that can induce models of growing
 * complexity one step at a time.
 *
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author Bernhard Pfahringer (bernhard@cs.waikato.ac.nz)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 10861 $
 */

public interface IterativeClassifier extends Classifier {

  /**
   * Initializes an iterative classifier.
<<<<<<< HEAD
=======
=======
 * @version $Revision: 1.3 $
 */

public interface IterativeClassifier {

  /**
   * Inits an iterative classifier.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param instances the instances to be used in induction
   * @exception Exception if the model cannot be initialized
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  void initializeClassifier(Instances instances) throws Exception;

  /**
   * Performs one iteration.
   *
   * @return false if no further iterations could be performed, true otherwise
   * @exception Exception if this iteration fails for unexpected reasons
   */
  boolean next() throws Exception;

  /**
   * Signal end of iterating, useful for any house-keeping/cleanup
   *
   * @exception Exception if cleanup fails
   */
  void done() throws Exception;
<<<<<<< HEAD
=======
=======
  void initClassifier(Instances instances) throws Exception;

  /**
   * Performs one iteration.
   * 
   * @param iteration the index of the current iteration (0-based)
   * @exception Exception if this iteration fails 
   */  
  void next(int iteration) throws Exception;

  /**
   * Signal end of iterating, useful for any house-keeping/cleanup
   * 
   * @exception Exception if cleanup fails 
   */  
  void done() throws Exception;

  /**
    * Performs a deep copy of the classifier, and a reference copy
    * of the training instances (or a deep copy if required).
    *
    * @return a clone of the classifier
    */
  Object clone() throws CloneNotSupportedException;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
