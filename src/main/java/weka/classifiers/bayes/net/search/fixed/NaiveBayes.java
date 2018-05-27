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
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

/*
 * NaiveBayes.java
<<<<<<< HEAD
 * Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 */
package weka.classifiers.bayes.net.search.fixed;

import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.SearchAlgorithm;
import weka.core.Instances;
import weka.core.RevisionUtils;

/** 
 <!-- globalinfo-start -->
 * The NaiveBayes class generates a fixed Bayes network structure with arrows from the class variable to each of the attribute variables.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 <!-- options-end -->
 * 
 * @author Remco Bouckaert
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.6 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class NaiveBayes 
	extends SearchAlgorithm {

  	/** for serialization */
  	static final long serialVersionUID = -4808572519709755811L;
  	    
  	/**
  	 * Returns a string describing this object
  	 * @return a description of the classifier suitable for
  	 * displaying in the explorer/experimenter gui
  	 */
  	public String globalInfo() {
  	  return 
  	      "The NaiveBayes class generates a fixed Bayes network structure "
  	    + "with arrows from the class variable to each of the attribute "
  	    + "variables.";
  	}
	
  	/**
  	 * 
  	 * @param bayesNet
  	 * @param instances the instances to work with
  	 * @throws Exception if something goes wrong
  	 */
	public void buildStructure (BayesNet bayesNet, Instances instances) throws Exception {
	  for (int iAttribute = 0; iAttribute < instances.numAttributes(); iAttribute++) {
	    if (iAttribute != instances.classIndex()) {
	      bayesNet.getParentSet(iAttribute).addParent(instances.classIndex(), instances);
	    }
	  }
	} // buildStructure

	/**
	 * Returns the revision string.
	 * 
	 * @return		the revision
	 */
	public String getRevision() {
<<<<<<< HEAD
	  return RevisionUtils.extract("$Revision: 8034 $");
=======
<<<<<<< HEAD
	  return RevisionUtils.extract("$Revision: 8034 $");
=======
	  return RevisionUtils.extract("$Revision: 1.6 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	}
	
} // class NaiveBayes
