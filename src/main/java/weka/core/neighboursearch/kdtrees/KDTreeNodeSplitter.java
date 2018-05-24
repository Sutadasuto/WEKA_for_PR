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
 * KDTreeNodeSplitter.java
<<<<<<< HEAD
 * Copyright (C) 1999-2012 University of Waikato
=======
 * Copyright (C) 1999-2007 University of Waikato
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.core.neighboursearch.kdtrees;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.EuclideanDistance;
import weka.core.Instances;
import weka.core.Option;
=======
import weka.core.EuclideanDistance;
import weka.core.Instances;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

<<<<<<< HEAD
=======
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * Class that splits up a KDTreeNode.
 * 
 * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
<<<<<<< HEAD
 * @version $Revision: 10203 $
 */
public abstract class KDTreeNodeSplitter implements Serializable,
  OptionHandler, RevisionHandler {

  /** ID added to prevent warning */
  private static final long serialVersionUID = 7222420817095067166L;

  /** The instances that'll be used for tree construction. */
  protected Instances m_Instances;

  /** The distance function used for building the tree. */
  protected EuclideanDistance m_EuclideanDistance;

  /**
   * The master index array that'll be reshuffled as nodes are split and the
   * tree is constructed.
   */
  protected int[] m_InstList;

  /**
   * Stores whether if the width of a KDTree node is normalized or not.
   */
  protected boolean m_NormalizeNodeWidth;

  // Constants
  /** Index of min value in an array of attributes' range. */
  public static final int MIN = EuclideanDistance.R_MIN;

  /** Index of max value in an array of attributes' range. */
  public static final int MAX = EuclideanDistance.R_MAX;

=======
 * @version $Revision: 1.2 $
 */
public abstract class KDTreeNodeSplitter
  implements Serializable, OptionHandler, RevisionHandler {
  
  /** The instances that'll be used for tree construction. */
  protected Instances m_Instances;
  
  /** The distance function used for building the tree. */
  protected EuclideanDistance m_EuclideanDistance;
  
  /** 
   * The master index array that'll be reshuffled as nodes
   * are split and the tree is constructed. 
   */
  protected int[] m_InstList;
  
  /** 
   * Stores whether if the width of a KDTree
   * node is normalized or not.
   */
  protected boolean m_NormalizeNodeWidth;
 
  // Constants
  /** Index of min value in an array of attributes' range. */
  public static final int MIN   = EuclideanDistance.R_MIN;

  /** Index of max value in an array of attributes' range. */
  public static final int MAX   = EuclideanDistance.R_MAX;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Index of width value (max-min) in an array of attributes' range. */
  public static final int WIDTH = EuclideanDistance.R_WIDTH;

  /**
   * default constructor.
   */
  public KDTreeNodeSplitter() {
  }
<<<<<<< HEAD

  /**
   * Creates a new instance of KDTreeNodeSplitter.
   * 
   * @param instList Reference of the master index array.
   * @param insts The set of training instances on which the tree is built.
   * @param e The EuclideanDistance object that is used in tree contruction.
   */
  public KDTreeNodeSplitter(int[] instList, Instances insts, EuclideanDistance e) {
=======
  
  /**
   * Creates a new instance of KDTreeNodeSplitter.
   * @param instList Reference of the master index array.
   * @param insts The set of training instances on which 
   * the tree is built.
   * @param e The EuclideanDistance object that is used
   * in tree contruction.
   */
  public KDTreeNodeSplitter(int[] instList, Instances insts, EuclideanDistance e) { 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_InstList = instList;
    m_Instances = insts;
    m_EuclideanDistance = e;
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    return new Vector<Option>().elements();
=======
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    return new Vector().elements();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Parses a given list of options.
   * 
<<<<<<< HEAD
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
=======
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setOptions(String[] options) throws Exception {
  }

  /**
   * Gets the current settings of the object.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
=======
   *
   * @return 		an array of strings suitable for passing to setOptions
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String[] getOptions() {
    return new String[0];
  }

<<<<<<< HEAD
  /**
   * Checks whether an object of this class has been correctly initialized.
   * Performs checks to see if all the necessary things (master index array,
   * training instances, distance function) have been supplied or not.
   * 
   * @throws Exception If the object has not been correctly initialized.
   */
  protected void correctlyInitialized() throws Exception {
    if (m_Instances == null) {
      throw new Exception("No instances supplied.");
    } else if (m_InstList == null) {
      throw new Exception("No instance list supplied.");
    } else if (m_EuclideanDistance == null) {
      throw new Exception("No Euclidean distance function supplied.");
    } else if (m_Instances.numInstances() != m_InstList.length) {
      throw new Exception("The supplied instance list doesn't seem to match "
        + "the supplied instances");
    }
  }

  /**
   * Splits a node into two. After splitting two new nodes are created and
   * correctly initialised. And, node.left and node.right are set appropriately.
   * 
   * @param node The node to split.
   * @param numNodesCreated The number of nodes that so far have been created
   *          for the tree, so that the newly created nodes are assigned
   *          correct/meaningful node numbers/ids.
   * @param nodeRanges The attributes' range for the points inside the node that
   *          is to be split.
   * @param universe The attributes' range for the whole point-space.
   * @throws Exception If there is some problem in splitting the given node.
   */
  public abstract void splitNode(KDTreeNode node, int numNodesCreated,
    double[][] nodeRanges, double[][] universe) throws Exception;

  /**
   * Sets the training instances on which the tree is (or is to be) built.
   * 
=======
  /** 
   * Checks whether an object of this class has been correctly
   * initialized. Performs checks to see if all the necessary
   * things (master index array, training instances, distance
   * function) have been supplied or not.
   * @throws Exception If the object has not been correctly 
   * initialized.
   */
  protected void correctlyInitialized() throws Exception {
    if(m_Instances==null)
      throw new Exception("No instances supplied.");
    else if(m_InstList==null) 
      throw new Exception("No instance list supplied.");
    else if(m_EuclideanDistance==null)
      throw new Exception("No Euclidean distance function supplied.");
    else if(m_Instances.numInstances() != m_InstList.length)
      throw new Exception("The supplied instance list doesn't seem to match " +
                          "the supplied instances");
  }
  
  /** 
   * Splits a node into two. After splitting two new nodes are created
   * and correctly initialised. And, node.left and node.right are 
   * set appropriately.
   * @param node The node to split.
   * @param numNodesCreated The number of nodes that so far have been
   * created for the tree, so that the newly created nodes are 
   * assigned correct/meaningful node numbers/ids.
   * @param nodeRanges The attributes' range for the points inside
   * the node that is to be split.
   * @param universe The attributes' range for the whole 
   * point-space.
   * @throws Exception If there is some problem in splitting the
   * given node.
   */
  public abstract void splitNode(KDTreeNode node, int numNodesCreated, 
      				 double[][] nodeRanges, double[][] universe) 
  throws Exception;
  
  /**
   * Sets the training instances on which the tree is (or is 
   * to be) built. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param inst The training instances.
   */
  public void setInstances(Instances inst) {
    m_Instances = inst;
  }
<<<<<<< HEAD

  /**
   * Sets the master index array containing indices of the training instances.
   * This array will be rearranged as the tree is built, so that each node is
   * assigned a portion in this array which contain the instances insides the
   * node's region.
   * 
=======
  
  /** 
   * Sets the master index array containing indices of the
   * training instances. This array will be rearranged as 
   * the tree is built, so that each node is assigned a 
   * portion in this array which contain the instances 
   * insides the node's region.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instList The master index array.
   */
  public void setInstanceList(int[] instList) {
    m_InstList = instList;
  }
<<<<<<< HEAD

  /**
   * Sets the EuclideanDistance object to use for splitting nodes.
   * 
=======
  
  /**
   * Sets the EuclideanDistance object to use for 
   * splitting nodes.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param func The EuclideanDistance object.
   */
  public void setEuclideanDistanceFunction(EuclideanDistance func) {
    m_EuclideanDistance = func;
  }

  /**
<<<<<<< HEAD
   * Sets whether if a nodes region is normalized or not. If set to true then,
   * when selecting the widest attribute/dimension for splitting, the width of
   * each attribute/dimension, of the points inside the node's region, is
   * divided by the width of that attribute/dimension for the whole point-space.
   * Thus, each attribute/dimension of that node is normalized.
   * 
   * @param normalize Should be true if normalization is required.
=======
   * Sets whether if a nodes region is normalized 
   * or not. If set to true then, when selecting 
   * the widest attribute/dimension for splitting, 
   * the width of each attribute/dimension,
   * of the points inside the node's region, is 
   * divided by the width of that 
   * attribute/dimension for the whole point-space.
   * Thus, each attribute/dimension of that node
   * is normalized.
   *   
   * @param normalize Should be true if 
   * normalization is required.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setNodeWidthNormalization(boolean normalize) {
    m_NormalizeNodeWidth = normalize;
  }
<<<<<<< HEAD

  /**
   * Returns the widest dimension. The width of each dimension (for the points
   * inside the node) is normalized, if m_NormalizeNodeWidth is set to true.
   * 
   * @param nodeRanges The attributes' range of the points inside the node that
   *          is to be split.
   * @param universe The attributes' range for the whole point-space.
   * @return The index of the attribute/dimension in which the points of the
   *         node have widest spread.
=======
  
  /**
   * Returns the widest dimension. The width of each 
   * dimension (for the points inside the node) is 
   * normalized, if m_NormalizeNodeWidth is set to 
   * true.
   * @param nodeRanges The attributes' range of the 
   * points inside the node that is to be split.
   * @param universe The attributes' range for the
   * whole point-space.
   * @return The index of the attribute/dimension
   * in which the points of the node have widest
   * spread.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected int widestDim(double[][] nodeRanges, double[][] universe) {
    final int classIdx = m_Instances.classIndex();
    double widest = 0.0;
    int w = -1;
    if (m_NormalizeNodeWidth) {
      for (int i = 0; i < nodeRanges.length; i++) {
        double newWidest = nodeRanges[i][WIDTH] / universe[i][WIDTH];
        if (newWidest > widest) {
<<<<<<< HEAD
          if (i == classIdx) {
            continue;
          }
=======
          if (i == classIdx)
            continue;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          widest = newWidest;
          w = i;
        }
      }
    } else {
      for (int i = 0; i < nodeRanges.length; i++) {
        if (nodeRanges[i][WIDTH] > widest) {
<<<<<<< HEAD
          if (i == classIdx) {
            continue;
          }
=======
          if (i == classIdx)
            continue;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          widest = nodeRanges[i][WIDTH];
          w = i;
        }
      }
    }
    return w;
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.2 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
