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
 *    UpdateableClassifier.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers;

<<<<<<< HEAD
import weka.core.Instance;
=======
import weka.core.*;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

/**
 * Interface to incremental classification models that can learn using
 * one instance at a time.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.5 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public interface UpdateableClassifier {

  /**
   * Updates a classifier using the given instance.
   *
   * @param instance the instance to included
   * @exception Exception if instance could not be incorporated
   * successfully
   */
  void updateClassifier(Instance instance) throws Exception;

}
<<<<<<< HEAD
=======
 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
