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
 *    it under the terms/*
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
 *    NBTreeClassifierTree.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.trees.j48;

import weka.core.Capabilities;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Capabilities.Capability;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * Class for handling a naive bayes tree structure used for classification.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
 */
public class NBTreeClassifierTree extends ClassifierTree {
<<<<<<< HEAD
=======
=======
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.core.Capabilities.Capability;
import weka.core.Utils;

/**
 * Class for handling a naive bayes tree structure used for
 * classification.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10286 $
 */
public class NBTreeClassifierTree
  extends ClassifierTree {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -4472639447877404786L;

  public NBTreeClassifierTree(ModelSelection toSelectLocModel) {
    super(toSelectLocModel);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Method for building a naive bayes classifier tree
   * 
   * @exception Exception if something goes wrong
   */
  @Override
  public void buildClassifier(Instances data) throws Exception {
    super.buildClassifier(data);
    cleanup(new Instances(data, 0));
    assignIDs(-1);
<<<<<<< HEAD
=======
=======
   * Returns default capabilities of the classifier tree.
   *
   * @return      the capabilities of this classifier tree
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);

    // instances
    result.setMinimumNumberInstances(0);
    
    return result;
  }

  /**
   * Method for building a naive bayes classifier tree
   *
   * @exception Exception if something goes wrong
   */
  public void buildClassifier(Instances data) throws Exception {
   super.buildClassifier(data);
   cleanup(new Instances(data, 0));
   assignIDs(-1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Assigns a uniqe id to every node in the tree.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * public int assignIDs(int lastID) {
   * 
   * int currLastID = lastID + 1;
   * 
   * m_id = currLastID; if (m_sons != null) { for (int i = 0; i < m_sons.length;
   * i++) { currLastID = m_sons[i].assignIDs(currLastID); } } return currLastID;
   * }
   */

  /**
   * Returns a newly created tree.
   * 
   * @param data the training data
   * @exception Exception if something goes wrong
   */
  @Override
  protected ClassifierTree getNewTree(Instances data) throws Exception {

    ClassifierTree newTree = new NBTreeClassifierTree(m_toSelectModel);
    newTree.buildTree(data, false);

<<<<<<< HEAD
=======
=======
   *
  public int assignIDs(int lastID) {

    int currLastID = lastID + 1;

    m_id = currLastID;
    if (m_sons != null) {
      for (int i = 0; i < m_sons.length; i++) {
	currLastID = m_sons[i].assignIDs(currLastID);
      }
    }
    return currLastID;
    } */

  /**
   * Returns a newly created tree.
   *
   * @param data the training data
   * @exception Exception if something goes wrong
   */
  protected ClassifierTree getNewTree(Instances data) throws Exception {
	 
    ClassifierTree newTree = new NBTreeClassifierTree(m_toSelectModel);
    newTree.buildTree(data, false);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return newTree;
  }

  /**
   * Returns a newly created tree.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param train the training data
   * @param test the pruning data.
   * @exception Exception if something goes wrong
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  protected ClassifierTree getNewTree(Instances train, Instances test)
    throws Exception {

    ClassifierTree newTree = new NBTreeClassifierTree(m_toSelectModel);
    newTree.buildTree(train, test, false);

<<<<<<< HEAD
=======
=======
  protected ClassifierTree getNewTree(Instances train, Instances test) 
       throws Exception {
	 
    ClassifierTree newTree = new NBTreeClassifierTree(m_toSelectModel);
    newTree.buildTree(train, test, false);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return newTree;
  }

  /**
   * Print the models at the leaves
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return textual description of the leaf models
   */
  public String printLeafModels() {
    StringBuffer text = new StringBuffer();

    if (m_isLeaf) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      text.append("\nLeaf number: " + m_id + " ");
      text.append(m_localModel.toString());
      text.append("\n");
    } else {
      for (ClassifierTree m_son : m_sons) {
        text.append(((NBTreeClassifierTree) m_son).printLeafModels());
      }
    }
<<<<<<< HEAD
=======
=======
      text.append("\nLeaf number: " + m_id+" ");
      text.append(m_localModel.toString());
      text.append("\n");
    } else {
       for (int i=0;i<m_sons.length;i++) {
	 text.append(((NBTreeClassifierTree)m_sons[i]).printLeafModels());
       }
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return text.toString();
  }

  /**
   * Prints tree structure.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {

    try {
      StringBuffer text = new StringBuffer();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      if (m_isLeaf) {
        text.append(": NB");
        text.append(m_id);
      } else {
        dumpTreeNB(0, text);
      }

      text.append("\n" + printLeafModels());
      text.append("\n\nNumber of Leaves  : \t" + numLeaves() + "\n");
      text.append("\nSize of the tree : \t" + numNodes() + "\n");

<<<<<<< HEAD
=======
=======
      
      if (m_isLeaf) {
	text.append(": NB");
	text.append(m_id);
      }else
	dumpTreeNB(0,text);

      text.append("\n"+printLeafModels());
      text.append("\n\nNumber of Leaves  : \t"+numLeaves()+"\n");
      text.append("\nSize of the tree : \t"+numNodes()+"\n");
 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return text.toString();
    } catch (Exception e) {
      e.printStackTrace();
      return "Can't print nb tree.";
    }
  }

  /**
   * Help method for printing tree structure.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @exception Exception if something goes wrong
   */
  private void dumpTreeNB(int depth, StringBuffer text) throws Exception {

    int i, j;

    for (i = 0; i < m_sons.length; i++) {
      text.append("\n");
      ;
      for (j = 0; j < depth; j++) {
        text.append("|   ");
      }
      text.append(m_localModel.leftSide(m_train));
      text.append(m_localModel.rightSide(i, m_train));
      if (m_sons[i].m_isLeaf) {
        text.append(": NB ");
        text.append(m_sons[i].m_id);
      } else {
        ((NBTreeClassifierTree) m_sons[i]).dumpTreeNB(depth + 1, text);
      }
<<<<<<< HEAD
=======
=======
   *
   * @exception Exception if something goes wrong
   */
  private void dumpTreeNB(int depth,StringBuffer text) 
       throws Exception {
    
    int i,j;
    
    for (i=0;i<m_sons.length;i++) {
      text.append("\n");;
      for (j=0;j<depth;j++)
	text.append("|   ");
      text.append(m_localModel.leftSide(m_train));
      text.append(m_localModel.rightSide(i, m_train));
      if (m_sons[i].m_isLeaf) {
	text.append(": NB ");
	text.append(m_sons[i].m_id);
      }else
	((NBTreeClassifierTree)m_sons[i]).dumpTreeNB(depth+1,text);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Returns graph describing the tree.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @exception Exception if something goes wrong
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @exception Exception if something goes wrong
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String graph() throws Exception {

    StringBuffer text = new StringBuffer();

    text.append("digraph J48Tree {\n");
    if (m_isLeaf) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      text.append("N" + m_id + " [label=\"" + "NB model" + "\" "
        + "shape=box style=filled ");
      if (m_train != null && m_train.numInstances() > 0) {
        text.append("data =\n" + m_train + "\n");
        text.append(",\n");

      }
      text.append("]\n");
    } else {
      text.append("N" + m_id + " [label=\""
        + Utils.backQuoteChars(m_localModel.leftSide(m_train)) + "\" ");
      if (m_train != null && m_train.numInstances() > 0) {
        text.append("data =\n" + m_train + "\n");
        text.append(",\n");
      }
      text.append("]\n");
      graphTree(text);
    }

    return text.toString() + "}\n";
<<<<<<< HEAD
=======
=======
      text.append("N" + m_id 
		  + " [label=\"" + 
		  "NB model" + "\" " + 
		  "shape=box style=filled ");
      if (m_train != null && m_train.numInstances() > 0) {
	text.append("data =\n" + m_train + "\n");
	text.append(",\n");

      }
      text.append("]\n");
    }else {
      text.append("N" + m_id 
		  + " [label=\"" + 
		  Utils.backQuoteChars(m_localModel.leftSide(m_train)) + "\" ");
      if (m_train != null && m_train.numInstances() > 0) {
	text.append("data =\n" + m_train + "\n");
	text.append(",\n");
     }
      text.append("]\n");
      graphTree(text);
    }
    
    return text.toString() +"}\n";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Help method for printing tree structure as a graph.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @exception Exception if something goes wrong
   */
  private void graphTree(StringBuffer text) throws Exception {

    for (int i = 0; i < m_sons.length; i++) {
      text.append("N" + m_id + "->" + "N" + m_sons[i].m_id + " [label=\""
        + Utils.backQuoteChars(m_localModel.rightSide(i, m_train).trim())
        + "\"]\n");
      if (m_sons[i].m_isLeaf) {
        text.append("N" + m_sons[i].m_id + " [label=\"" + "NB Model" + "\" "
          + "shape=box style=filled ");
        if (m_train != null && m_train.numInstances() > 0) {
          text.append("data =\n" + m_sons[i].m_train + "\n");
          text.append(",\n");
        }
        text.append("]\n");
      } else {
        text.append("N" + m_sons[i].m_id + " [label=\""
          + Utils.backQuoteChars(m_sons[i].m_localModel.leftSide(m_train))
          + "\" ");
        if (m_train != null && m_train.numInstances() > 0) {
          text.append("data =\n" + m_sons[i].m_train + "\n");
          text.append(",\n");
        }
        text.append("]\n");
        ((NBTreeClassifierTree) m_sons[i]).graphTree(text);
      }
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
<<<<<<< HEAD
=======
=======
   *
   * @exception Exception if something goes wrong
   */
  private void graphTree(StringBuffer text) throws Exception {
    
    for (int i = 0; i < m_sons.length; i++) {
      text.append("N" + m_id  
		  + "->" + 
		  "N" + m_sons[i].m_id +
		  " [label=\"" + Utils.backQuoteChars(m_localModel.rightSide(i,m_train).trim()) + 
		  "\"]\n");
      if (m_sons[i].m_isLeaf) {
	text.append("N" + m_sons[i].m_id +
		    " [label=\""+"NB Model"+"\" "+ 
		    "shape=box style=filled ");
	if (m_train != null && m_train.numInstances() > 0) {
	  text.append("data =\n" + m_sons[i].m_train + "\n");
	  text.append(",\n");
	}
	text.append("]\n");
      } else {
	text.append("N" + m_sons[i].m_id +
		    " [label=\""+ Utils.backQuoteChars(m_sons[i].m_localModel.leftSide(m_train)) + 
		    "\" ");
	if (m_train != null && m_train.numInstances() > 0) {
	  text.append("data =\n" + m_sons[i].m_train + "\n");
	  text.append(",\n");
	}
	text.append("]\n");
	((NBTreeClassifierTree)m_sons[i]).graphTree(text);
      }
    }
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10286 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
