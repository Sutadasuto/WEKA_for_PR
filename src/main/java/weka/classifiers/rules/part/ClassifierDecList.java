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
 *    ClassifierDecList.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.rules.part;

<<<<<<< HEAD
import java.io.Serializable;

=======
<<<<<<< HEAD
import java.io.Serializable;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.trees.j48.ClassifierSplitModel;
import weka.classifiers.trees.j48.Distribution;
import weka.classifiers.trees.j48.EntropySplitCrit;
import weka.classifiers.trees.j48.ModelSelection;
import weka.classifiers.trees.j48.NoSplit;
<<<<<<< HEAD
import weka.core.ContingencyTables;
=======
<<<<<<< HEAD
import weka.core.ContingencyTables;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Class for handling a rule (partial tree) for a decision list.
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 10153 $
 */
public class ClassifierDecList implements Serializable, RevisionHandler {
<<<<<<< HEAD
=======
=======
import java.io.Serializable;

/**
 * Class for handling a rule (partial tree) for a decision list.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 1.13 $
 */
public class ClassifierDecList
  implements Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 7284358349711992497L;

  /** Minimum number of objects */
  protected int m_minNumObj;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** To compute the entropy. */
  protected static EntropySplitCrit m_splitCrit = new EntropySplitCrit();

  /** The model selection method. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected ModelSelection m_toSelectModel;

  /** Local model at node. */
  protected ClassifierSplitModel m_localModel;

  /** References to sons. */
  protected ClassifierDecList[] m_sons;

  /** True if node is leaf. */
  protected boolean m_isLeaf;

  /** True if node is empty. */
  protected boolean m_isEmpty;

  /** The training instances. */
  protected Instances m_train;

  /** The pruning instances. */
  protected Distribution m_test;

  /** Which son to expand? */
  protected int indeX;
<<<<<<< HEAD
=======
=======
  protected ModelSelection m_toSelectModel;   

  /** Local model at node. */  
  protected ClassifierSplitModel m_localModel; 

  /** References to sons. */
  protected ClassifierDecList [] m_sons;       
  
  /** True if node is leaf. */
  protected boolean m_isLeaf;   

  /** True if node is empty. */
  protected boolean m_isEmpty;                 

  /** The training instances. */
  protected Instances m_train;                 

  /** The pruning instances. */ 
  protected Distribution m_test;               

  /** Which son to expand? */  
  protected int indeX;         
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Constructor - just calls constructor of class DecList.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public ClassifierDecList(ModelSelection toSelectLocModel, int minNum) {

    m_toSelectModel = toSelectLocModel;
    m_minNumObj = minNum;
  }

  /**
   * Method for building a pruned partial tree.
   * 
   * @exception Exception if something goes wrong
   */
  public void buildRule(Instances data) throws Exception {

<<<<<<< HEAD
=======
=======
  public ClassifierDecList(ModelSelection toSelectLocModel, int minNum){

    m_toSelectModel = toSelectLocModel;
    m_minNumObj = minNum;
   }
  
  /**
   * Method for building a pruned partial tree.
   *
   * @exception Exception if something goes wrong
   */
  public void buildRule(Instances data) throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    buildDecList(data, false);

    cleanup(new Instances(data, 0));
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Builds the partial tree without hold out set.
   * 
   * @exception Exception if something goes wrong
   */
  public void buildDecList(Instances data, boolean leaf) throws Exception {

    Instances[] localInstances;
    int ind;
    int i, j;
    double sumOfWeights;
    NoSplit noSplit;

<<<<<<< HEAD
=======
=======
 
  /**
   * Builds the partial tree without hold out set.
   *
   * @exception Exception if something goes wrong
   */
  public void buildDecList(Instances data, boolean leaf) throws Exception {
    
    Instances [] localInstances,localPruneInstances;
    int index,ind;
    int i,j;
    double sumOfWeights;
    NoSplit noSplit;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_train = null;
    m_test = null;
    m_isLeaf = false;
    m_isEmpty = false;
    m_sons = null;
    indeX = 0;
    sumOfWeights = data.sumOfWeights();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    noSplit = new NoSplit(new Distribution(data));
    if (leaf) {
      m_localModel = noSplit;
    } else {
      m_localModel = m_toSelectModel.selectModel(data);
    }
    if (m_localModel.numSubsets() > 1) {
      localInstances = m_localModel.split(data);
      data = null;
      m_sons = new ClassifierDecList[m_localModel.numSubsets()];
      i = 0;
      do {
        i++;
        ind = chooseIndex();
        if (ind == -1) {
          for (j = 0; j < m_sons.length; j++) {
            if (m_sons[j] == null) {
              m_sons[j] = getNewDecList(localInstances[j], true);
            }
          }
          if (i < 2) {
            m_localModel = noSplit;
            m_isLeaf = true;
            m_sons = null;
            if (Utils.eq(sumOfWeights, 0)) {
              m_isEmpty = true;
            }
            return;
          }
          ind = 0;
          break;
        } else {
          m_sons[ind] = getNewDecList(localInstances[ind], false);
        }
      } while ((i < m_sons.length) && (m_sons[ind].m_isLeaf));

      // Choose rule
      indeX = chooseLastIndex();
    } else {
      m_isLeaf = true;
      if (Utils.eq(sumOfWeights, 0)) {
        m_isEmpty = true;
      }
    }
  }

  /**
   * Classifies an instance.
   * 
   * @exception Exception if something goes wrong
   */
  public double classifyInstance(Instance instance) throws Exception {
<<<<<<< HEAD
=======
=======
    noSplit = new NoSplit (new Distribution((Instances)data));
    if (leaf)
      m_localModel = noSplit;
    else
      m_localModel = m_toSelectModel.selectModel(data);
    if (m_localModel.numSubsets() > 1) {
      localInstances = m_localModel.split(data);
      data = null;
      m_sons = new ClassifierDecList [m_localModel.numSubsets()];
      i = 0;
      do {
	i++;
	ind = chooseIndex();
	if (ind == -1) {
	  for (j = 0; j < m_sons.length; j++) 
	    if (m_sons[j] == null)
	      m_sons[j] = getNewDecList(localInstances[j],true);
	  if (i < 2) {
	    m_localModel = noSplit;
	    m_isLeaf = true;
	    m_sons = null;
	    if (Utils.eq(sumOfWeights,0))
	      m_isEmpty = true;
	    return;
	  }
	  ind = 0;
	  break;
	} else 
	  m_sons[ind] = getNewDecList(localInstances[ind],false);
      } while ((i < m_sons.length) && (m_sons[ind].m_isLeaf));
      
      // Choose rule
      indeX = chooseLastIndex();
    }else{
      m_isLeaf = true;
      if (Utils.eq(sumOfWeights, 0))
	m_isEmpty = true;
    }
  }

  /** 
   * Classifies an instance.
   *
   * @exception Exception if something goes wrong
   */
  public double classifyInstance(Instance instance)
       throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    double maxProb = -1;
    double currentProb;
    int maxIndex = 0;
    int j;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (j = 0; j < instance.numClasses(); j++) {
      currentProb = getProbs(j, instance, 1);
      if (Utils.gr(currentProb, maxProb)) {
        maxIndex = j;
        maxProb = currentProb;
      }
    }
    if (Utils.eq(maxProb, 0)) {
      return -1.0;
    } else {
      return maxIndex;
    }
  }

  /**
   * Returns class probabilities for a weighted instance.
   * 
   * @exception Exception if something goes wrong
   */
  public final double[] distributionForInstance(Instance instance)
    throws Exception {

    double[] doubles = new double[instance.numClasses()];

    for (int i = 0; i < doubles.length; i++) {
      doubles[i] = getProbs(i, instance, 1);
    }

    return doubles;
  }

  /**
   * Returns the weight a rule assigns to an instance.
   * 
<<<<<<< HEAD
=======
=======
    for (j = 0; j < instance.numClasses();
	 j++){
      currentProb = getProbs(j,instance,1);
      if (Utils.gr(currentProb,maxProb)){
	maxIndex = j;
	maxProb = currentProb;
      }
    }
    if (Utils.eq(maxProb,0))
      return -1.0;
    else
      return (double)maxIndex;
  }

  /** 
   * Returns class probabilities for a weighted instance.
   *
   * @exception Exception if something goes wrong
   */
  public final double [] distributionForInstance(Instance instance) 
       throws Exception {
		

    double [] doubles =
      new double[instance.numClasses()];

    for (int i = 0; i < doubles.length; i++)
      doubles[i] = getProbs(i,instance,1);
    
    return doubles;
  }
  
  /**
   * Returns the weight a rule assigns to an instance.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @exception Exception if something goes wrong
   */
  public double weight(Instance instance) throws Exception {

    int subset;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_isLeaf) {
      return 1;
    }
    subset = m_localModel.whichSubset(instance);
    if (subset == -1) {
      return (m_localModel.weights(instance))[indeX]
        * m_sons[indeX].weight(instance);
    }
    if (subset == indeX) {
      return m_sons[indeX].weight(instance);
    }
<<<<<<< HEAD
=======
=======
    if (m_isLeaf)
      return 1;
    subset = m_localModel.whichSubset(instance);
    if (subset == -1)
      return (m_localModel.weights(instance))[indeX]*
	m_sons[indeX].weight(instance);
    if (subset == indeX)
      return m_sons[indeX].weight(instance);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return 0;
  }

  /**
   * Cleanup in order to save memory.
   */
  public final void cleanup(Instances justHeaderInfo) {

    m_train = justHeaderInfo;
    m_test = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (!m_isLeaf) {
      for (ClassifierDecList m_son : m_sons) {
        if (m_son != null) {
          m_son.cleanup(justHeaderInfo);
        }
      }
    }
<<<<<<< HEAD
=======
=======
    if (!m_isLeaf)
      for (int i = 0; i < m_sons.length; i++)
	if (m_sons[i] != null)
	  m_sons[i].cleanup(justHeaderInfo);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Prints rules.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String toString() {

    try {
      StringBuffer text;

      text = new StringBuffer();
      if (m_isLeaf) {
        text.append(": ");
        text.append(m_localModel.dumpLabel(0, m_train) + "\n");
      } else {
        dumpDecList(text);
        // dumpTree(0,text);
<<<<<<< HEAD
=======
=======
  public String toString(){

    try {
      StringBuffer text;
      
      text = new StringBuffer();
      if (m_isLeaf){
	text.append(": ");
	text.append(m_localModel.dumpLabel(0,m_train)+"\n");
      }else{
      dumpDecList(text);
      //dumpTree(0,text);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      return text.toString();
    } catch (Exception e) {
      return "Can't print rule.";
    }
  }

  /**
   * Returns a newly created tree.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @exception Exception if something goes wrong
   */
  protected ClassifierDecList getNewDecList(Instances train, boolean leaf)
    throws Exception {

    ClassifierDecList newDecList = new ClassifierDecList(m_toSelectModel,
      m_minNumObj);
    newDecList.buildDecList(train, leaf);

    return newDecList;
  }

<<<<<<< HEAD
=======
=======
   *
   * @exception Exception if something goes wrong
   */
  protected ClassifierDecList getNewDecList(Instances train, boolean leaf) 
    throws Exception {
	 
    ClassifierDecList newDecList = new ClassifierDecList(m_toSelectModel,
							 m_minNumObj);
    newDecList.buildDecList(train,leaf);
    
    return newDecList;
  }
 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Method for choosing a subset to expand.
   */
  public final int chooseIndex() {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int minIndex = -1;
    double estimated, min = Double.MAX_VALUE;
    int i, j;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (i = 0; i < m_sons.length; i++) {
      if (son(i) == null) {
        if (Utils.sm(localModel().distribution().perBag(i), m_minNumObj)) {
          estimated = Double.MAX_VALUE;
        } else {
          estimated = 0;
          for (j = 0; j < localModel().distribution().numClasses(); j++) {
            estimated -= m_splitCrit.lnFunc(localModel().distribution()
              .perClassPerBag(i, j));
          }
          estimated += m_splitCrit
            .lnFunc(localModel().distribution().perBag(i));
          estimated /= (localModel().distribution().perBag(i) * ContingencyTables.log2);
        }
        if (Utils.smOrEq(estimated, 0)) {
          return i;
        }
        if (Utils.sm(estimated, min)) {
          min = estimated;
          minIndex = i;
        }
      }
    }

    return minIndex;
  }

<<<<<<< HEAD
=======
=======
    for (i = 0; i < m_sons.length; i++)
      if (son(i) == null) {
	if (Utils.sm(localModel().distribution().perBag(i),
		     (double)m_minNumObj))
	  estimated = Double.MAX_VALUE;
	else{
	  estimated = 0;
	  for (j = 0; j < localModel().distribution().numClasses(); j++) 
	    estimated -= m_splitCrit.logFunc(localModel().distribution().
				     perClassPerBag(i,j));
	  estimated += m_splitCrit.logFunc(localModel().distribution().
				   perBag(i));
	  estimated /= localModel().distribution().perBag(i);
	}
	if (Utils.smOrEq(estimated,0))
	  return i;
	if (Utils.sm(estimated,min)) {
	  min = estimated;
	  minIndex = i;
	}
      }

    return minIndex;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Choose last index (ie. choose rule).
   */
  public final int chooseLastIndex() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int minIndex = 0;
    double estimated, min = Double.MAX_VALUE;

    if (!m_isLeaf) {
      for (int i = 0; i < m_sons.length; i++) {
        if (son(i) != null) {
          if (Utils.grOrEq(localModel().distribution().perBag(i), m_minNumObj)) {
            estimated = son(i).getSizeOfBranch();
            if (Utils.sm(estimated, min)) {
              min = estimated;
              minIndex = i;
            }
          }
        }
      }
    }

    return minIndex;
  }

<<<<<<< HEAD
=======
=======
    
    int minIndex = 0;
    double estimated, min = Double.MAX_VALUE;
    
    if (!m_isLeaf) 
      for (int i = 0; i < m_sons.length; i++)
	if (son(i) != null) {
	  if (Utils.grOrEq(localModel().distribution().perBag(i),
			   (double)m_minNumObj)) {
	    estimated = son(i).getSizeOfBranch();
	    if (Utils.sm(estimated,min)) {
	      min = estimated;
	      minIndex = i;
	    }
	  }
	}

    return minIndex;
  }
 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the number of instances covered by a branch
   */
  protected double getSizeOfBranch() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_isLeaf) {
      return -localModel().distribution().total();
    } else {
      return son(indeX).getSizeOfBranch();
    }
<<<<<<< HEAD
=======
=======
    
    if (m_isLeaf) {
      return -localModel().distribution().total();
    } else
      return son(indeX).getSizeOfBranch();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Help method for printing tree structure.
   */
  private void dumpDecList(StringBuffer text) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    text.append(m_localModel.leftSide(m_train));
    text.append(m_localModel.rightSide(indeX, m_train));
    if (m_sons[indeX].m_isLeaf) {
      text.append(": ");
      text.append(m_localModel.dumpLabel(indeX, m_train) + "\n");
    } else {
<<<<<<< HEAD
=======
=======
    
    text.append(m_localModel.leftSide(m_train));
    text.append(m_localModel.rightSide(indeX, m_train));
    if (m_sons[indeX].m_isLeaf){
      text.append(": ");
      text.append(m_localModel.dumpLabel(indeX,m_train)+"\n");
    }else{
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      text.append(" AND\n");
      m_sons[indeX].dumpDecList(text);
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Help method for computing class probabilities of a given instance.
   * 
   * @exception Exception Exception if something goes wrong
   */
  private double getProbs(int classIndex, Instance instance, double weight)
    throws Exception {

    double[] weights;
<<<<<<< HEAD
=======
=======
   * Dumps the partial tree (only used for debugging)
   *
   * @exception Exception Exception if something goes wrong
   */
  private void dumpTree(int depth,StringBuffer text)
       throws Exception {
    
    int i,j;
    
    for (i=0;i<m_sons.length;i++){
      text.append("\n");;
      for (j=0;j<depth;j++)
	text.append("|   ");
      text.append(m_localModel.leftSide(m_train));
      text.append(m_localModel.rightSide(i, m_train));
      if (m_sons[i] == null)
	text.append("null");
      else if (m_sons[i].m_isLeaf){
	text.append(": ");
	text.append(m_localModel.dumpLabel(i,m_train));
      }else
	m_sons[i].dumpTree(depth+1,text);
    }
  }

  /**
   * Help method for computing class probabilities of 
   * a given instance.
   *
   * @exception Exception Exception if something goes wrong
   */
  private double getProbs(int classIndex,Instance instance,
			  double weight) throws Exception {
    
    double [] weights;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int treeIndex;

    if (m_isLeaf) {
      return weight * localModel().classProb(classIndex, instance, -1);
    } else {
      treeIndex = localModel().whichSubset(instance);
      if (treeIndex == -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        weights = localModel().weights(instance);
        return son(indeX).getProbs(classIndex, instance,
          weights[indeX] * weight);
      } else {
        if (treeIndex == indeX) {
          return son(indeX).getProbs(classIndex, instance, weight);
        } else {
          return 0;
        }
<<<<<<< HEAD
=======
=======
	weights = localModel().weights(instance);
	return son(indeX).getProbs(classIndex, instance, 
				   weights[indeX] * weight);
      }else{
	if (treeIndex == indeX) {
	  return son(indeX).getProbs(classIndex, instance, weight);
	} else {
	  return 0;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Method just exists to make program easier to read.
   */
<<<<<<< HEAD
  protected ClassifierSplitModel localModel() {

    return m_localModel;
=======
<<<<<<< HEAD
  protected ClassifierSplitModel localModel() {

    return m_localModel;
=======
  protected ClassifierSplitModel localModel(){
    
    return (ClassifierSplitModel)m_localModel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Method just exists to make program easier to read.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected ClassifierDecList son(int index) {

    return m_sons[index];
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10153 $");
<<<<<<< HEAD
=======
=======
  protected ClassifierDecList son(int index){
    
    return m_sons[index];
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.13 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
