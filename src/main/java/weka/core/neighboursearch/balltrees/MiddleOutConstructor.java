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
 * MiddleOutConstructor.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.core.neighboursearch.balltrees;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import weka.core.DenseInstance;
=======
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.Randomizable;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
<<<<<<< HEAD
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;

/**
 * <!-- globalinfo-start --> The class that builds a BallTree middle out.<br/>
 * <br/>
 * For more information see also:<br/>
 * <br/>
 * Andrew W. Moore: The Anchors Hierarchy: Using the Triangle Inequality to
 * Survive High Dimensional Data. In: UAI '00: Proceedings of the 16th
 * Conference on Uncertainty in Artificial Intelligence, San Francisco, CA, USA,
 * 397-405, 2000.<br/>
 * <br/>
 * Ashraf Masood Kibriya (2007). Fast Algorithms for Nearest Neighbour Search.
 * Hamilton, New Zealand.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * The class that builds a BallTree middle out.<br/>
 * <br/>
 * For more information see also:<br/>
 * <br/>
 * Andrew W. Moore: The Anchors Hierarchy: Using the Triangle Inequality to Survive High Dimensional Data. In: UAI '00: Proceedings of the 16th Conference on Uncertainty in Artificial Intelligence, San Francisco, CA, USA, 397-405, 2000.<br/>
 * <br/>
 * Ashraf Masood Kibriya (2007). Fast Algorithms for Nearest Neighbour Search. Hamilton, New Zealand.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;inproceedings{Moore2000,
 *    address = {San Francisco, CA, USA},
 *    author = {Andrew W. Moore},
 *    booktitle = {UAI '00: Proceedings of the 16th Conference on Uncertainty in Artificial Intelligence},
 *    pages = {397-405},
 *    publisher = {Morgan Kaufmann Publishers Inc.},
 *    title = {The Anchors Hierarchy: Using the Triangle Inequality to Survive High Dimensional Data},
 *    year = {2000}
 * }
 * 
 * &#64;mastersthesis{Kibriya2007,
 *    address = {Hamilton, New Zealand},
 *    author = {Ashraf Masood Kibriya},
 *    school = {Department of Computer Science, School of Computing and Mathematical Sciences, University of Waikato},
 *    title = {Fast Algorithms for Nearest Neighbour Search},
 *    year = {2007}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
 * <!-- technical-bibtex-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -S &lt;num&gt;
 *  The seed for the random number generator used
 *  in selecting random anchor.
 * (default: 1)
 * </pre>
 * 
 * <pre>
 * -R
 *  Use randomly chosen initial anchors.
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
 * @version $Revision: 11269 $
 */
public class MiddleOutConstructor extends BallTreeConstructor implements
  Randomizable, TechnicalInformationHandler {
=======
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -S &lt;num&gt;
 *  The seed for the random number generator used
 *  in selecting random anchor.
 * (default: 1)</pre>
 * 
 * <pre> -R
 *  Use randomly chosen initial anchors.</pre>
 * 
 <!-- options-end --> 
 * 
 * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
 * @version $Revision: 1.3 $
 */
public class MiddleOutConstructor
  extends BallTreeConstructor
  implements Randomizable, TechnicalInformationHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization. */
  private static final long serialVersionUID = -8523314263062524462L;

  /** Seed form random number generator. */
  protected int m_RSeed = 1;
<<<<<<< HEAD

  /**
   * The random number generator for selecting the first anchor point randomly
   * (if selecting randomly).
   */
  protected Random rand = new Random(m_RSeed);

=======
	
  /** 
   * The random number generator for selecting 
   * the first anchor point randomly 
   * (if selecting randomly).
   */
  protected Random rand = new Random(m_RSeed);
 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * The radius of the smallest ball enclosing all the data points.
   */
  private double rootRadius = -1;
<<<<<<< HEAD

  /**
=======
  
  /** 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * True if the initial anchor is chosen randomly. False if it is the furthest
   * point from the mean/centroid.
   */
  protected boolean m_RandomInitialAnchor = true;

  /**
   * Creates a new instance of MiddleOutConstructor.
   */
  public MiddleOutConstructor() {
  }

  /**
   * Returns a string describing this nearest neighbour search algorithm.
   * 
<<<<<<< HEAD
   * @return a description of the algorithm for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "The class that builds a BallTree middle out.\n\n"
      + "For more information see also:\n\n"
      + getTechnicalInformation().toString();
  }

=======
   * @return 		a description of the algorithm for displaying in the
   *         		explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "The class that builds a BallTree middle out.\n\n"
      + "For more information see also:\n\n"
      + getTechnicalInformation().toString();
  }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
<<<<<<< HEAD
   * @return the technical information about this class
   */
  @Override
=======
   * @return 		the technical information about this class
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;
    TechnicalInformation additional;

    result = new TechnicalInformation(Type.INPROCEEDINGS);
    result.setValue(Field.AUTHOR, "Andrew W. Moore");
<<<<<<< HEAD
    result
      .setValue(
        Field.TITLE,
        "The Anchors Hierarchy: Using the Triangle Inequality to Survive High Dimensional Data");
    result.setValue(Field.YEAR, "2000");
    result
      .setValue(
        Field.BOOKTITLE,
        "UAI '00: Proceedings of the 16th Conference on Uncertainty in Artificial Intelligence");
=======
    result.setValue(Field.TITLE, "The Anchors Hierarchy: Using the Triangle Inequality to Survive High Dimensional Data");
    result.setValue(Field.YEAR, "2000");
    result.setValue(Field.BOOKTITLE, "UAI '00: Proceedings of the 16th Conference on Uncertainty in Artificial Intelligence");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.setValue(Field.PAGES, "397-405");
    result.setValue(Field.PUBLISHER, "Morgan Kaufmann Publishers Inc.");
    result.setValue(Field.ADDRESS, "San Francisco, CA, USA");

    additional = result.add(Type.MASTERSTHESIS);
    additional.setValue(Field.AUTHOR, "Ashraf Masood Kibriya");
<<<<<<< HEAD
    additional.setValue(Field.TITLE,
      "Fast Algorithms for Nearest Neighbour Search");
    additional.setValue(Field.YEAR, "2007");
    additional
      .setValue(
        Field.SCHOOL,
        "Department of Computer Science, School of Computing and Mathematical Sciences, University of Waikato");
    additional.setValue(Field.ADDRESS, "Hamilton, New Zealand");

=======
    additional.setValue(Field.TITLE, "Fast Algorithms for Nearest Neighbour Search");
    additional.setValue(Field.YEAR, "2007");
    additional.setValue(Field.SCHOOL, "Department of Computer Science, School of Computing and Mathematical Sciences, University of Waikato");
    additional.setValue(Field.ADDRESS, "Hamilton, New Zealand");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
<<<<<<< HEAD
   * Builds a ball tree middle out.
   * 
   * @return The root node of the tree.
   * @throws Exception If there is problem building the tree.
   */
  @Override
  public BallNode buildTree() throws Exception {
    m_NumNodes = m_MaxDepth = m_NumLeaves = 0;
    if (rootRadius == -1) {
      rootRadius = BallNode
        .calcRadius(m_InstList, m_Instances,
          BallNode.calcCentroidPivot(m_InstList, m_Instances),
          m_DistanceFunction);
    }
    BallNode root = buildTreeMiddleOut(0, m_Instances.numInstances() - 1);
    return root;
  }

  /**
   * Builds a ball tree middle out from the portion of the master index array
   * given by supplied start and end index.
   * 
   * @param startIdx The start of the portion in master index array.
   * @param endIdx the end of the portion in master index array.
   * @return The root node of the built tree.
   * @throws Exception If there is some problem building the tree.
   */
  protected BallNode buildTreeMiddleOut(int startIdx, int endIdx)
    throws Exception {

    Instance pivot;
    double radius;
    Vector<TempNode> anchors;
    int numInsts = endIdx - startIdx + 1;
    int numAnchors = (int) Math.round(Math.sqrt(numInsts));

    // create anchor's hierarchy
    if (numAnchors > 1) {
      pivot = BallNode.calcCentroidPivot(startIdx, endIdx, m_InstList,
        m_Instances);
      radius = BallNode.calcRadius(startIdx, endIdx, m_InstList, m_Instances,
        pivot, m_DistanceFunction);
      if (numInsts <= m_MaxInstancesInLeaf
        || (rootRadius == 0 ? true : radius / rootRadius < m_MaxRelLeafRadius)) { // just
                                                                                  // make
                                                                                  // a
                                                                                  // leaf
                                                                                  // don't
                                                                                  // make
                                                                                  // anchors
                                                                                  // hierarchy
        BallNode node = new BallNode(startIdx, endIdx, m_NumNodes, pivot,
          radius);
        return node;
      }
      anchors = new Vector<TempNode>(numAnchors);
      createAnchorsHierarchy(anchors, numAnchors, startIdx, endIdx);

      BallNode node = mergeNodes(anchors, startIdx, endIdx);

      buildLeavesMiddleOut(node);

      return node;
    }// end anchors hierarchy
    else {
      BallNode node = new BallNode(startIdx, endIdx, m_NumNodes,
        (pivot = BallNode.calcCentroidPivot(startIdx, endIdx, m_InstList,
          m_Instances)), BallNode.calcRadius(startIdx, endIdx, m_InstList,
          m_Instances, pivot, m_DistanceFunction));
      return node;
    }
  }

  /**
   * Creates an anchors hierarchy from a portion of master index array.
   * 
   * @param anchors The vector for putting the anchors into.
   * @param numAnchors The number of anchors to create.
   * @param startIdx The start of the portion of master index array.
   * @param endIdx The end of the portion of master index array.
   * @throws Exception If there is some problem in creating the hierarchy.
   */
  protected void createAnchorsHierarchy(Vector<TempNode> anchors,
    final int numAnchors, final int startIdx, final int endIdx)
    throws Exception {

    TempNode anchr1 = m_RandomInitialAnchor ? getRandomAnchor(startIdx, endIdx)
      : getFurthestFromMeanAnchor(startIdx, endIdx);

    TempNode amax = anchr1; // double maxradius = anchr1.radius;
    TempNode newAnchor;
    Vector<double[]> anchorDistances = new Vector<double[]>(numAnchors - 1);
    anchors.add(anchr1);

    // creating anchors
    while (anchors.size() < numAnchors) {
      // create new anchor
      newAnchor = new TempNode();
      newAnchor.points = new MyIdxList();
      Instance newpivot = m_Instances.instance(amax.points.getFirst().idx);
      newAnchor.anchor = newpivot;
      newAnchor.idx = amax.points.getFirst().idx;

      setInterAnchorDistances(anchors, newAnchor, anchorDistances);
      if (stealPoints(newAnchor, anchors, anchorDistances)) {
        newAnchor.radius = newAnchor.points.getFirst().distance;
      } else {
        newAnchor.radius = 0.0;
      }
      anchors.add(newAnchor);

      // find new amax
      amax = anchors.elementAt(0);
      for (int i = 1; i < anchors.size(); i++) {
        newAnchor = anchors.elementAt(i);
        if (newAnchor.radius > amax.radius) {
          amax = newAnchor;
        }
      }// end for
    }// end while
  }

  /**
   * Applies the middle out build procedure to the leaves of the tree. The leaf
   * nodes should be the ones that were created by createAnchorsHierarchy(). The
   * process continues recursively for the leaves created for each leaf of the
   * given tree until for some leaf node <= m_MaxInstancesInLeaf instances
   * remain in the leaf.
   * 
   * @param node The root of the tree.
   * @throws Exception If there is some problem in building the tree leaves.
   */
  protected void buildLeavesMiddleOut(BallNode node) throws Exception {
    if (node.m_Left != null && node.m_Right != null) { // if an internal node
      buildLeavesMiddleOut(node.m_Left);
      buildLeavesMiddleOut(node.m_Right);
    } else if (node.m_Left != null || node.m_Right != null) {
      throw new Exception("Invalid leaf assignment. Please check code");
    } else { // if node is a leaf
      BallNode n2 = buildTreeMiddleOut(node.m_Start, node.m_End);
      if (n2.m_Left != null && n2.m_Right != null) {
        node.m_Left = n2.m_Left;
        node.m_Right = n2.m_Right;
        buildLeavesMiddleOut(node);
        // the stopping condition in buildTreeMiddleOut will stop the recursion,
        // where it won't split a node at all, and we won't recurse here.
      } else if (n2.m_Left != null || n2.m_Right != null) {
        throw new Exception("Invalid leaf assignment. Please check code");
      }
=======
   * Builds a ball tree middle out. 
   * @return The root node of the tree. 
   * @throws Exception If there is problem building
   * the tree.
   */
  public BallNode buildTree() throws Exception {
    m_NumNodes = m_MaxDepth = m_NumLeaves = 0;
    if(rootRadius == -1) {
      rootRadius = BallNode.calcRadius(m_InstList, m_Instances, 
                		BallNode.calcCentroidPivot(m_InstList, m_Instances),
                		m_DistanceFunction);
    }
    BallNode root = buildTreeMiddleOut(0, m_Instances.numInstances()-1);
    return root;
  }

  /** 
   * Builds a ball tree middle out from the 
   * portion of the master index array given
   * by supplied start and end index.
   * @param startIdx The start of the portion
   * in master index array.
   * @param endIdx the end of the portion in 
   * master index array.
   * @return The root node of the built tree.
   * @throws Exception If there is some 
   * problem building the tree. 
   */
  protected BallNode buildTreeMiddleOut(int startIdx, int endIdx) 
    throws Exception {
	
    Instance pivot;
    double radius;
    Vector anchors;
    int numInsts = endIdx - startIdx + 1;
    int numAnchors = (int) Math.round(Math.sqrt(numInsts));
    
    //create anchor's hierarchy
    if (numAnchors > 1) {
      pivot = BallNode.calcCentroidPivot(startIdx, endIdx, m_InstList,m_Instances);
      radius = BallNode.calcRadius(startIdx, endIdx, m_InstList, m_Instances, 
    	  						   pivot, m_DistanceFunction);      
      if(numInsts <= m_MaxInstancesInLeaf || 
    	 (rootRadius==0 ? true : radius/rootRadius < m_MaxRelLeafRadius)) { //just make a leaf don't make anchors hierarchy 
		BallNode node = new BallNode(startIdx, endIdx, m_NumNodes,pivot, radius);
		return node;
	  }
      anchors = new Vector(numAnchors);
      createAnchorsHierarchy(anchors, numAnchors, startIdx, endIdx);

      BallNode node = mergeNodes(anchors, startIdx, endIdx);
      
      buildLeavesMiddleOut(node);
      
      return node;
    }// end anchors hierarchy
    else {
      BallNode node = new BallNode(startIdx, endIdx, m_NumNodes, 
                      (pivot=BallNode.calcCentroidPivot(startIdx, endIdx, 
                                                      m_InstList, m_Instances)), 
                      BallNode.calcRadius(startIdx, endIdx, m_InstList, 
                                          m_Instances, pivot, 
                                          m_DistanceFunction)
                         );
      return node;
    }        
  }
  
  /**
   * Creates an anchors hierarchy from a portion
   * of master index array.
   * 
   * @param anchors The vector for putting the anchors
   * into. 
   * @param numAnchors The number of anchors to create.
   * @param startIdx The start of the portion of master
   * index array.
   * @param endIdx The end of the portion of master 
   * index array.
   * @throws Exception If there is some problem in creating 
   * the hierarchy.
   */
  protected void createAnchorsHierarchy(Vector anchors, final int numAnchors, 
      final int startIdx, final int endIdx) 
    throws Exception {
    
    TempNode anchr1 = m_RandomInitialAnchor ? 
            getRandomAnchor(startIdx, endIdx) : 
            getFurthestFromMeanAnchor(startIdx, endIdx);
	              
    TempNode amax = anchr1; //double maxradius = anchr1.radius;
    TempNode newAnchor;
    Vector anchorDistances = new Vector(numAnchors-1);
    anchors.add(anchr1);

    //creating anchors
    while(anchors.size() < numAnchors) {
      //create new anchor
      newAnchor = new TempNode();
      newAnchor.points = new MyIdxList();        
      Instance newpivot = m_Instances.instance(((ListNode)amax.points.getFirst()).idx);
      newAnchor.anchor = newpivot;
      newAnchor.idx = ((ListNode)amax.points.getFirst()).idx;

      setInterAnchorDistances(anchors, newAnchor, anchorDistances);
      if(stealPoints(newAnchor, anchors, anchorDistances)) //if points stolen
    	newAnchor.radius = ((ListNode)newAnchor.points.getFirst()).distance;
      else
    	newAnchor.radius = 0.0;
      anchors.add(newAnchor);

      //find new amax        
      amax = (TempNode)anchors.elementAt(0);
      for(int i=1; i<anchors.size(); i++) {
        newAnchor = (TempNode)anchors.elementAt(i);
        if(newAnchor.radius > amax.radius)
          amax = newAnchor;
      }//end for
    }//end while
  }
  
  /**
   * Applies the middle out build procedure to 
   * the leaves of the tree. The leaf nodes 
   * should be the ones that were created by 
   * createAnchorsHierarchy(). The process
   * continues recursively for the leaves 
   * created for each leaf of the given tree 
   * until for some leaf node <= 
   * m_MaxInstancesInLeaf instances remain
   * in the leaf.
   * 
   * @param node The root of the tree.
   * @throws Exception If there is some problem
   * in building the tree leaves.
   */
  protected void buildLeavesMiddleOut(BallNode node) throws Exception {
    if(node.m_Left!=null && node.m_Right!=null) { //if an internal node
      buildLeavesMiddleOut(node.m_Left);
      buildLeavesMiddleOut(node.m_Right);
    }
    else if(node.m_Left!=null || node.m_Right!=null) {
      throw new Exception("Invalid leaf assignment. Please check code");
    }
    else { //if node is a leaf
      BallNode n2 = buildTreeMiddleOut(node.m_Start, node.m_End);
      if(n2.m_Left!=null && n2.m_Right!=null) {
        node.m_Left = n2.m_Left;
        node.m_Right = n2.m_Right;
        buildLeavesMiddleOut(node); 
        //the stopping condition in buildTreeMiddleOut will stop the recursion,
        //where it won't split a node at all, and we won't recurse here.
      }
      else if(n2.m_Left!=null || n2.m_Right!=null)
        throw new Exception("Invalid leaf assignment. Please check code");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Merges nodes created by createAnchorsHierarchy() into one top node.
   * 
   * @param list List of anchor nodes.
   * @param startIdx The start of the portion of master index array containing
   *          these anchor nodes.
   * @param endIdx The end of the portion of master index array containing these
   *          anchor nodes.
   * @return The top/root node after merging the given anchor nodes.
   * @throws Exception IF there is some problem in merging.
   */
  protected BallNode mergeNodes(Vector<TempNode> list, int startIdx, int endIdx)
    throws Exception {

    for (int i = 0; i < list.size(); i++) {
      TempNode n = list.get(i);
      n.anchor = calcPivot(n.points, new MyIdxList(), m_Instances);
      n.radius = calcRadius(n.points, new MyIdxList(), n.anchor, m_Instances);
    }
    double minRadius, tmpRadius; // tmpVolume, minVolume;
    Instance pivot, minPivot = null;
    TempNode parent;
    int min1 = -1, min2 = -1;

    while (list.size() > 1) { // main merging loop
      minRadius = Double.POSITIVE_INFINITY;

      for (int i = 0; i < list.size(); i++) {
        TempNode first = list.get(i);
        for (int j = i + 1; j < list.size(); j++) {
          TempNode second = list.get(j);
          pivot = calcPivot(first, second, m_Instances);
          tmpRadius = calcRadius(first, second); // calcRadius(first.points,
                                                 // second.points, pivot,
                                                 // m_Instances);
          if (tmpRadius < minRadius) { // (tmpVolume < minVolume) {
            minRadius = tmpRadius; // minVolume = tmpVolume;
            minPivot = pivot;
            min1 = i;
            min2 = j;
            // minInstList = tmpInstList;
          }
        }// end for(j)
      }// end for(i)
      parent = new TempNode();
      parent.left = list.get(min1);
      parent.right = list.get(min2);
      parent.anchor = minPivot;
      parent.radius = calcRadius(parent.left.points, parent.right.points,
        minPivot, m_Instances); // minRadius;
      parent.points = parent.left.points.append(parent.left.points,
        parent.right.points);
      list.remove(min1);
      list.remove(min2 - 1);
      list.add(parent);
    }// end while
    TempNode tmpRoot = list.get(list.size() - 1);

    if ((endIdx - startIdx + 1) != tmpRoot.points.length()) {
      throw new Exception("Root nodes instance list is of irregular length. "
        + "Please check code. Length should " + "be: "
        + (endIdx - startIdx + 1) + " whereas it is found to be: "
        + tmpRoot.points.length());
    }
    for (int i = 0; i < tmpRoot.points.length(); i++) {
      m_InstList[startIdx + i] = tmpRoot.points.get(i).idx;
    }

    BallNode node = makeBallTreeNodes(tmpRoot, startIdx, endIdx, 0);

    return node;
  }

  /**
   * Makes BallTreeNodes out of TempNodes.
   * 
   * @param node The root TempNode
   * @param startidx The start of the portion of master index array the
   *          TempNodes are made from.
   * @param endidx The end of the portion of master index array the TempNodes
   *          are made from.
   * @param depth The depth in the tree where this root TempNode is made (needed
   *          when leaves of a tree deeper down are built middle out).
   * @return The root BallTreeNode.
   */
  protected BallNode makeBallTreeNodes(TempNode node, int startidx, int endidx,
    int depth) {
    BallNode ball = null;

    if (node.left != null && node.right != null) { // make an internal node
      ball = new BallNode(startidx, endidx, m_NumNodes, node.anchor,
        node.radius);
      m_NumNodes += 1;
      ball.m_Left = makeBallTreeNodes(node.left, startidx, startidx
        + node.left.points.length() - 1, depth + 1);
      ball.m_Right = makeBallTreeNodes(node.right,
        startidx + node.left.points.length(), endidx, depth + 1);
      m_MaxDepth++;
    } else { // make a leaf node
      ball = new BallNode(startidx, endidx, m_NumNodes, node.anchor,
        node.radius);
      m_NumNodes += 1;
=======
   * Merges nodes created by createAnchorsHierarchy()
   * into one top node.
   * 
   * @param list List of anchor nodes.
   * @param startIdx The start of the portion of 
   * master index array containing these anchor 
   * nodes. 
   * @param endIdx The end of the portion of master 
   * index array containing these anchor nodes. 
   * @return The top/root node after merging 
   * the given anchor nodes.
   * @throws Exception IF there is some problem in
   * merging.
   */
  protected BallNode mergeNodes(Vector list, int startIdx, int endIdx)
    throws Exception {
    
    for(int i=0; i<list.size(); i++) {
      TempNode n = (TempNode) list.get(i);
      n.anchor = calcPivot(n.points, new MyIdxList(), m_Instances);
      n.radius = calcRadius(n.points, new MyIdxList(), n.anchor, m_Instances);
    }
    double minRadius, tmpRadius; //tmpVolume, minVolume;
    Instance pivot, minPivot=null;
    TempNode parent; int min1=-1, min2=-1;    
    
    while(list.size() > 1) { //main merging loop
      minRadius=Double.POSITIVE_INFINITY;      
      
      for(int i=0; i<list.size(); i++) {
        TempNode first = (TempNode) list.get(i);
        for(int j=i+1; j<list.size(); j++) {
          TempNode second = (TempNode) list.get(j);
          pivot = calcPivot(first, second, m_Instances); 
          tmpRadius = calcRadius(first, second); //calcRadius(first.points, second.points, pivot, m_Instances);    
          if(tmpRadius < minRadius) { //(tmpVolume < minVolume) {
            minRadius = tmpRadius; //minVolume = tmpVolume; 
            minPivot = pivot; 
            min1=i; min2=j; 
            //minInstList = tmpInstList;
          }
        }//end for(j)
      }//end for(i)
      parent = new TempNode();
      parent.left  = (TempNode) list.get(min1);
      parent.right = (TempNode) list.get(min2);
      parent.anchor = minPivot;
      parent.radius = calcRadius(parent.left.points, parent.right.points, minPivot, m_Instances); //minRadius;
      parent.points = parent.left.points.append(parent.left.points, parent.right.points);
      list.remove(min1); list.remove(min2-1);
      list.add(parent);
    }//end while
    TempNode tmpRoot = (TempNode)list.get(list.size()-1);
    
    if((endIdx-startIdx+1)!= tmpRoot.points.length()) {
      throw new Exception("Root nodes instance list is of irregular length. " +
                          "Please check code. Length should " +
                          "be: " + (endIdx-startIdx+1) + 
                          " whereas it is found to be: "+tmpRoot.points.length());
    }
    for(int i=0; i<tmpRoot.points.length(); i++) {
      m_InstList[startIdx+i] = ((ListNode)tmpRoot.points.get(i)).idx;
    }
    
    BallNode node = makeBallTreeNodes(tmpRoot, startIdx, endIdx, 0);
    
    return node;    
  }
  
  /**
   * Makes BallTreeNodes out of TempNodes.
   *  
   * @param node The root TempNode
   * @param startidx The start of the portion of 
   * master index array the TempNodes 
   * are made from. 
   * @param endidx The end of the portion of 
   * master index array the TempNodes are 
   * made from. 
   * @param depth The depth in the tree where 
   * this root TempNode is made (needed when 
   * leaves of a tree deeper down are built 
   * middle out).
   * @return The root BallTreeNode.
   */
  protected BallNode makeBallTreeNodes(TempNode node, int startidx, 
      int endidx, int depth) {
    BallNode ball=null;
    
    if(node.left!=null && node.right!=null) { //make an internal node
      ball = new BallNode(
      startidx, endidx, m_NumNodes, 
      node.anchor,
      node.radius
      );
      m_NumNodes += 1;
      ball.m_Left = makeBallTreeNodes(node.left, startidx, startidx+node.left.points.length()-1, depth+1);
      ball.m_Right= makeBallTreeNodes(node.right, startidx+node.left.points.length(), endidx, depth+1);
      m_MaxDepth++;
    }
    else { //make a leaf node
      ball = new BallNode(startidx, endidx, m_NumNodes,       
      node.anchor, 
      node.radius 
                         );
      m_NumNodes += 1;      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_NumLeaves += 1;
    }
    return ball;
  }
<<<<<<< HEAD

  /**
   * Returns an anchor point which is furthest from the mean point for a given
   * set of points (instances) (The anchor instance is chosen from the given set
   * of points).
   * 
   * @param startIdx The start index of the points for which anchor point is
   *          required.
   * @param endIdx The end index of the points for which anchor point is
   *          required.
   * @return The furthest point/instance from the mean of given set of points.
   */
  protected TempNode getFurthestFromMeanAnchor(int startIdx, int endIdx) {
    TempNode anchor = new TempNode();
    Instance centroid = BallNode.calcCentroidPivot(startIdx, endIdx,
      m_InstList, m_Instances);
    Instance temp;
    double tmpr;
    anchor.radius = Double.NEGATIVE_INFINITY;
    for (int i = startIdx; i <= endIdx; i++) {
      temp = m_Instances.instance(m_InstList[i]);
      tmpr = m_DistanceFunction.distance(centroid, temp);
      if (tmpr > anchor.radius) {
=======
    
  /**
   * Returns an anchor point which is furthest from the
   * mean point for a given set of points (instances) 
   * (The anchor instance is chosen from the given
   * set of points).
   * 
   * @param startIdx The start index of the points
   * for which anchor point is required.
   * @param endIdx The end index of the points for
   * which anchor point is required.
   * @return The furthest point/instance from the mean 
   * of given set of points.
   */
  protected TempNode getFurthestFromMeanAnchor(int startIdx, int endIdx) {
    TempNode anchor = new TempNode();
    Instance centroid = BallNode.calcCentroidPivot(startIdx, endIdx, m_InstList, 
                                                   m_Instances);
    Instance temp;
    double tmpr;
    anchor.radius = Double.NEGATIVE_INFINITY;
    for(int i=startIdx; i<=endIdx; i++) {
      temp = m_Instances.instance(m_InstList[i]);
      tmpr = m_DistanceFunction.distance(centroid, temp);
      if(tmpr > anchor.radius) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        anchor.idx = m_InstList[i];
        anchor.anchor = temp;
        anchor.radius = tmpr;
      }
    }
<<<<<<< HEAD

    setPoints(anchor, startIdx, endIdx, m_InstList);
    return anchor;
  }

  /**
   * Returns a random anchor point/instance from a given set of
   * points/instances.
   * 
   * @param startIdx The start index of the points for which anchor is required.
   * @param endIdx The end index of the points for which anchor is required.
   * @return The random anchor point/instance for the given set of
   */
  protected TempNode getRandomAnchor(int startIdx, int endIdx) {
    TempNode anchr1 = new TempNode();
    anchr1.idx = m_InstList[startIdx + rand.nextInt((endIdx - startIdx + 1))];
    anchr1.anchor = m_Instances.instance(anchr1.idx);
    setPoints(anchr1, startIdx, endIdx, m_InstList);
    anchr1.radius = anchr1.points.getFirst().distance;

    return anchr1;
  }

  /**
   * Sets the points of an anchor node. It takes the indices of points from the
   * given portion of an index array and stores those indices, together with
   * their distances to the given anchor node, in the point index list of the
   * anchor node.
   * 
   * @param node The node in which the points are needed to be set.
   * @param startIdx The start of the portion in the given index array (the
   *          master index array).
   * @param endIdx The end of the portion in the given index array.
   * @param indices The index array.
   */
  public void setPoints(TempNode node, int startIdx, int endIdx, int[] indices) {
    node.points = new MyIdxList();
    Instance temp;
    double dist;
    for (int i = startIdx; i <= endIdx; i++) {
=======
    
    setPoints(anchor, startIdx, endIdx, m_InstList);
    return anchor;
  }
  
  /** 
   * Returns a random anchor point/instance from a 
   * given set of points/instances.
   * 
   * @param startIdx The start index of the points
   * for which anchor is required.
   * @param endIdx The end index of the points for
   * which anchor is required.
   * @return The random anchor point/instance
   * for the given set of 
   */
  protected TempNode getRandomAnchor(int startIdx, int endIdx) {
    TempNode anchr1 = new TempNode();
    anchr1.idx = m_InstList[startIdx+rand.nextInt((endIdx-startIdx+1))];
    anchr1.anchor = m_Instances.instance(anchr1.idx);
    setPoints(anchr1, startIdx, endIdx, m_InstList);
    anchr1.radius = ((ListNode)anchr1.points.getFirst()).distance;
    
    return anchr1;
  }
  
  /**
   * Sets the points of an anchor node. It takes the
   * indices of points from the given portion of 
   * an index array and stores those indices, together
   * with their distances to the given anchor node, 
   * in the point index list of the anchor node.
   *  
   * @param node The node in which the points are
   * needed to be set.
   * @param startIdx The start of the portion in 
   * the given index array (the master index
   * array).
   * @param endIdx The end of the portion in the
   * given index array. 
   * @param indices The index array.
   */
  public void setPoints(TempNode node, int startIdx, int endIdx, int[] indices) {
    node.points = new MyIdxList();    
    Instance temp; double dist;
    for(int i=startIdx; i<=endIdx; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      temp = m_Instances.instance(indices[i]);
      dist = m_DistanceFunction.distance(node.anchor, temp);
      node.points.insertReverseSorted(indices[i], dist);
    }
  }

  /**
<<<<<<< HEAD
   * Sets the distances of a supplied new anchor to all the rest of the previous
   * anchor points.
   * 
   * @param anchors The old anchor points.
   * @param newAnchor The new anchor point.
   * @param anchorDistances The vector to store the distances of newAnchor to
   *          each of the old anchors.
   * @throws Exception If there is some problem in calculating the distances.
   */
  public void setInterAnchorDistances(Vector<TempNode> anchors,
    TempNode newAnchor, Vector<double[]> anchorDistances) throws Exception {
    double[] distArray = new double[anchors.size()];

    for (int i = 0; i < anchors.size(); i++) {
      Instance anchr = anchors.elementAt(i).anchor;
=======
   * Sets the distances of a supplied new
   * anchor to all the rest of the 
   * previous anchor points.
   * @param anchors The old anchor points.
   * @param newAnchor The new anchor point.
   * @param anchorDistances The vector to
   * store the distances of newAnchor to 
   * each of the old anchors.
   * @throws Exception If there is some 
   * problem in calculating the distances.
   */
  public void setInterAnchorDistances(Vector anchors, TempNode newAnchor,
                                      Vector anchorDistances) throws Exception {
    double[] distArray = new double[anchors.size()];
    
    for(int i=0; i<anchors.size(); i++) {
      Instance anchr = ((TempNode)anchors.elementAt(i)).anchor;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      distArray[i] = m_DistanceFunction.distance(anchr, newAnchor.anchor);
    }
    anchorDistances.add(distArray);
  }
<<<<<<< HEAD

  /**
   * Removes points from old anchors that are nearer to the given new anchor and
   * adds them to the list of points of the new anchor.
   * 
   * @param newAnchor The new anchor.
   * @param anchors The old anchors.
   * @param anchorDistances The distances of new anchor to each of the old
   *          anchors.
   * @return true if any points are removed from the old anchors
   */
  public boolean stealPoints(TempNode newAnchor, Vector<TempNode> anchors,
    Vector<double[]> anchorDistances) {

    double maxDist = Double.NEGATIVE_INFINITY;
    double[] distArray = anchorDistances.lastElement();

    for (double element : distArray) {
      if (maxDist < element) {
        maxDist = element;
      }
    }

    boolean anyPointsStolen = false, pointsStolen = false;
    TempNode anchorI;
    double newDist, distI, interAnchMidDist;
    Instance newAnchInst = newAnchor.anchor, anchIInst;
    for (int i = 0; i < anchors.size(); i++) {
      anchorI = anchors.elementAt(i);
      anchIInst = anchorI.anchor;

      pointsStolen = false;
      interAnchMidDist = m_DistanceFunction.distance(newAnchInst, anchIInst) / 2D;
      for (int j = 0; j < anchorI.points.length(); j++) {
        ListNode tmp = anchorI.points.get(j);
        // break if we reach a point whose distance is less than the midpoint
        // of inter anchor distance
        if (tmp.distance < interAnchMidDist) {
          break;
        }
        // else test if this point can be stolen by the new anchor
        newDist = m_DistanceFunction.distance(newAnchInst,
          m_Instances.instance(tmp.idx));
        distI = tmp.distance;
        if (newDist < distI) {
          newAnchor.points.insertReverseSorted(tmp.idx, newDist);
          anchorI.points.remove(j);
          anyPointsStolen = pointsStolen = true;
        }
      }
      if (pointsStolen) {
        anchorI.radius = anchorI.points.getFirst().distance;
      }
    }// end for
    return anyPointsStolen;
  }// end stealPoints()

  /**
   * /** Calculates the centroid pivot of a node based on its two child nodes
   * (if merging two nodes).
   * 
   * @param node1 The first child.
   * @param node2 The second child.
   * @param insts The set of instances on which the tree is being built (as
   *          dataset header information is required).
   * @return The centroid pivot of a node.
=======
  
  /**
   * Removes points from old anchors that
   * are nearer to the given new anchor and
   * adds them to the list of points of the
   * new anchor. 
   * @param newAnchor The new anchor.
   * @param anchors The old anchors.
   * @param anchorDistances The distances
   * of new anchor to each of the old 
   * anchors.
   * @return true if any points are removed
   * from the old anchors
   */
  public boolean stealPoints(TempNode newAnchor, Vector anchors, 
                          Vector anchorDistances) {
                            
    int maxIdx = -1; 
    double maxDist = Double.NEGATIVE_INFINITY;
    double[] distArray = (double[])anchorDistances.lastElement();
    
    for(int i=0; i<distArray.length; i++)
      if(maxDist < distArray[i]) {
        maxDist = distArray[i]; maxIdx = i;
      }
    
    boolean anyPointsStolen=false, pointsStolen=false;
    TempNode anchorI;
    double newDist, distI, interAnchMidDist;
    Instance newAnchInst = newAnchor.anchor, anchIInst;
    for(int i=0; i<anchors.size(); i++) {
      anchorI = (TempNode)anchors.elementAt(i);
      anchIInst = anchorI.anchor;
      
      pointsStolen = false;
      interAnchMidDist = m_DistanceFunction.distance(newAnchInst, anchIInst)/2D;
      for(int j=0; j<anchorI.points.length(); j++) {
        ListNode tmp = (ListNode) anchorI.points.get(j);
        //break if we reach a point whose distance is less than the midpoint
        //of inter anchor distance
        if(tmp.distance < interAnchMidDist)
          break;
        //else test if this point can be stolen by the new anchor
        newDist = m_DistanceFunction.distance(newAnchInst, 
                                              m_Instances.instance(tmp.idx));
        distI = tmp.distance;
        if(newDist < distI) {
          newAnchor.points.insertReverseSorted(tmp.idx, newDist);
          anchorI.points.remove(j);
          anyPointsStolen=pointsStolen=true;
        }
      }
      if (pointsStolen)
        anchorI.radius = ((ListNode)anchorI.points.getFirst()).distance;
    }//end for
    return anyPointsStolen;
  }//end stealPoints()

  /**
  /**
   * Calculates the centroid pivot of a node based on its
   * two child nodes (if merging two nodes).
   * @param node1 The first child.
   * @param node2 The second child.
   * @param insts The set of instances on which the tree 
   * is being built (as dataset header information is 
   * required). 
   * @return The centroid pivot of a node. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Instance calcPivot(TempNode node1, TempNode node2, Instances insts) {
    int classIdx = m_Instances.classIndex();
    double[] attrVals = new double[insts.numAttributes()];
    Instance temp;
<<<<<<< HEAD
    double anchr1Ratio = (double) node1.points.length()
      / (node1.points.length() + node2.points.length()), anchr2Ratio = (double) node2.points
      .length() / (node1.points.length() + node2.points.length());
    ;
    for (int k = 0; k < node1.anchor.numValues(); k++) {
      if (node1.anchor.index(k) == classIdx) {
        continue;
      }
      attrVals[k] += node1.anchor.valueSparse(k) * anchr1Ratio;
    }
    for (int k = 0; k < node2.anchor.numValues(); k++) {
      if (node2.anchor.index(k) == classIdx) {
        continue;
      }
      attrVals[k] += node2.anchor.valueSparse(k) * anchr2Ratio;
    }
    temp = new DenseInstance(1.0, attrVals);
    return temp;
  }

  /**
   * Calculates the centroid pivot of a node based on the list of points that it
   * contains (tbe two lists of its children are provided).
   * 
   * @param list1 The point index list of first child.
   * @param list2 The point index list of second child.
   * @param insts The insts object on which the tree is being built (for header
   *          information).
   * @return The centroid pivot of the node.
=======
    double anchr1Ratio = (double)node1.points.length() / 
                         (node1.points.length()+node2.points.length()),
           anchr2Ratio = (double)node2.points.length() / 
                         (node1.points.length()+node2.points.length());                         ;
    for(int k=0; k<node1.anchor.numValues(); k++) {
      if(node1.anchor.index(k)==classIdx)
        continue;
      attrVals[k] += node1.anchor.valueSparse(k)*anchr1Ratio;
    }
    for(int k=0; k<node2.anchor.numValues(); k++) {
      if(node2.anchor.index(k)==classIdx)
        continue;
      attrVals[k] += node2.anchor.valueSparse(k)*anchr2Ratio;
    }
    temp = new Instance(1.0, attrVals);
    return temp;
  }
  
  /**
   * Calculates the centroid pivot of a node based on 
   * the list of points that it  contains (tbe two 
   * lists of its children are provided).
   * @param list1 The point index list of first child.
   * @param list2 The point index list of second 
   * child.
   * @param insts The insts object on which the tree 
   * is being built (for header information). 
   * @return The centroid pivot of the node. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Instance calcPivot(MyIdxList list1, MyIdxList list2, Instances insts) {
    int classIdx = m_Instances.classIndex();
    double[] attrVals = new double[insts.numAttributes()];
<<<<<<< HEAD

    Instance temp;
    for (int i = 0; i < list1.length(); i++) {
      temp = insts.instance(list1.get(i).idx);
      for (int k = 0; k < temp.numValues(); k++) {
        if (temp.index(k) == classIdx) {
          continue;
        }
        attrVals[k] += temp.valueSparse(k);
      }
    }
    for (int j = 0; j < list2.length(); j++) {
      temp = insts.instance(list2.get(j).idx);
      for (int k = 0; k < temp.numValues(); k++) {
        if (temp.index(k) == classIdx) {
          continue;
        }
        attrVals[k] += temp.valueSparse(k);
      }
    }
    for (int j = 0, numInsts = list1.length() + list2.length(); j < attrVals.length; j++) {
      attrVals[j] /= numInsts;
    }
    temp = new DenseInstance(1.0, attrVals);
    return temp;
  }

  /**
   * Calculates the radius of a node based on its two child nodes (if merging
   * two nodes).
   * 
   * @param n1 The first child of the node.
   * @param n2 The second child of the node.
   * @return The radius of the node.
   * @throws Exception
   */
  public double calcRadius(TempNode n1, TempNode n2) {
    Instance p1 = n1.anchor, p2 = n2.anchor;
    double radius = n1.radius + m_DistanceFunction.distance(p1, p2) + n2.radius;
    return radius / 2;
  }

  /**
   * Calculates the radius of a node based on the list of points that it
   * contains (the two lists of its children are provided).
   * 
   * @param list1 The point index list of first child.
   * @param list2 The point index list of second child.
   * @param pivot The centre/pivot of the node.
   * @param insts The instances on which the tree is being built (for header
   *          info).
   * @return The radius of the node.
   */
  public double calcRadius(MyIdxList list1, MyIdxList list2, Instance pivot,
    Instances insts) {
    double radius = Double.NEGATIVE_INFINITY;

    for (int i = 0; i < list1.length(); i++) {
      double dist = m_DistanceFunction.distance(pivot,
        insts.instance(list1.get(i).idx));
      if (dist > radius) {
        radius = dist;
      }
    }
    for (int j = 0; j < list2.length(); j++) {
      double dist = m_DistanceFunction.distance(pivot,
        insts.instance(list2.get(j).idx));
      if (dist > radius) {
        radius = dist;
      }
    }
    return radius;
  }

  /**
   * Adds an instance to the tree. This implementation of MiddleOutConstructor
   * doesn't support addition of instances to already built tree, hence it
   * always throws an exception.
   * 
   * @param node The root of the tree to which the instance is to be added.
   * @param inst The instance to add to the tree.
   * @return The updated master index array after adding the instance.
   * @throws Exception Always as this implementation of MiddleOutConstructor
   *           doesn't support addition of instances after batch construction of
   *           the tree.
   */
  @Override
  public int[] addInstance(BallNode node, Instance inst) throws Exception {
    throw new Exception("Addition of instances after the tree is built, not "
      + "possible with MiddleOutConstructor.");
=======
    
    Instance temp;
    for(int i=0; i<list1.length(); i++) {
      temp = insts.instance(((ListNode)list1.get(i)).idx);
      for(int k=0; k<temp.numValues(); k++) {
        if(temp.index(k)==classIdx)
          continue;
        attrVals[k] += temp.valueSparse(k);
      }
    }
    for(int j=0; j<list2.length(); j++) {
      temp = insts.instance(((ListNode)list2.get(j)).idx);
      for(int k=0; k<temp.numValues(); k++) {
        if(temp.index(k)==classIdx)
          continue;
        attrVals[k] += temp.valueSparse(k);
      }
    }
    for(int j=0, numInsts=list1.length()+list2.length(); 
        j < attrVals.length; j++) {
      attrVals[j] /= numInsts;
    }
    temp = new Instance(1.0, attrVals);
    return temp;
  }
  
  /** 
   * Calculates the radius of a node based on its two 
   * child nodes (if merging two nodes).
   * @param n1 The first child of the node.
   * @param n2 The second child of the node.
   * @return The radius of the node. 
   * @throws Exception
   */
  public double calcRadius(TempNode n1, TempNode n2) {
	  Instance p1 = n1.anchor, p2 = n2.anchor;
	  double radius = n1.radius + m_DistanceFunction.distance(p1, p2) + n2.radius;
	  return radius/2;
  }
  
  /**
   * Calculates the radius of a node based on the
   * list of points that it contains (the two lists of 
   * its children are provided). 
   * @param list1 The point index list of first child.
   * @param list2 The point index list of second child.
   * @param pivot The centre/pivot of the node.
   * @param insts The instances on which the tree is 
   * being built (for header info). 
   * @return The radius of the node. 
   */
  public double calcRadius(MyIdxList list1, MyIdxList list2, 
                           Instance pivot, Instances insts) {
    double radius = Double.NEGATIVE_INFINITY;
    
    for(int i=0; i<list1.length(); i++) {
      double dist = m_DistanceFunction.distance(pivot, 
                                              insts.instance(((ListNode)list1.get(i)).idx));
      if(dist>radius)
        radius = dist;
    }
    for(int j=0; j<list2.length(); j++) {
      double dist = m_DistanceFunction.distance(pivot, 
                                              insts.instance(((ListNode)list2.get(j)).idx));
      if(dist>radius)
        radius = dist;
    }
    return radius;
  }
  
  /**
   * Adds an instance to the tree. This implementation of 
   * MiddleOutConstructor doesn't support addition of 
   * instances to already built tree, hence it always
   * throws an exception.
   * @param node The root of the tree to which the 
   * instance is to be added.
   * @param inst The instance to add to the tree.
   * @return The updated master index array after 
   * adding the instance.
   * @throws Exception Always as this implementation of
   * MiddleOutConstructor doesn't support addition of
   * instances after batch construction of the tree.
   */
  public int[] addInstance(BallNode node, Instance inst) throws Exception {
    throw new Exception("Addition of instances after the tree is built, not " +
                        "possible with MiddleOutConstructor.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Sets the maximum number of instances allowed in a leaf.
<<<<<<< HEAD
   * 
   * @param num The maximum number of instances allowed in a leaf.
   * @throws Exception If the num is < 2, as the method cannot work for < 2
   *           instances.
   */
  @Override
  public void setMaxInstancesInLeaf(int num) throws Exception {
    if (num < 2) {
      throw new Exception("The maximum number of instances in a leaf for "
        + "using MiddleOutConstructor must be >=2.");
    }
    super.setMaxInstancesInLeaf(num);
  }

  /**
   * Sets the instances on which the tree is to be built.
   * 
   * @param insts The instances on which to build the ball tree.
   */
  @Override
  public void setInstances(Instances insts) {
    super.setInstances(insts);
    rootRadius = -1; // this needs to be re-calculated by buildTree()
  }

  /**
   * Sets the master index array that points to instances in m_Instances, so
   * that only this array is manipulated, and m_Instances is left untouched.
   * 
   * @param instList The master index array.
   */
  @Override
  public void setInstanceList(int[] instList) {
    super.setInstanceList(instList);
    rootRadius = -1; // this needs to be re-calculated by buildTree()
  }

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @param num The maximum number of instances allowed in 
   * a leaf.
   * @throws Exception If the num is < 2, as the method 
   * cannot work for < 2 instances. 
   */ 
  public void setMaxInstancesInLeaf(int num) throws Exception {
    if(num<2)
      throw new Exception("The maximum number of instances in a leaf for " +
                          "using MiddleOutConstructor must be >=2.");
    super.setMaxInstancesInLeaf(num);
  }  

  /**
   * Sets the instances on which the tree is to be built.
   * @param inst The instances on which to build the 
   * ball tree.
   */
  public void setInstances(Instances insts) {
    super.setInstances(insts);
    rootRadius = -1; //this needs to be re-calculated by buildTree()
  }
  
  /**
   * Sets the master index array that points to 
   * instances in m_Instances, so that only this array
   * is manipulated, and m_Instances is left 
   * untouched.
   * @param instList The master index array.
   */
  public void setInstanceList(int[] instList) {
    super.setInstanceList(instList); 
    rootRadius = -1; //this needs to be re-calculated by buildTree()
  }
  
  /**
   * Returns the tip text for this property.
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String initialAnchorRandomTipText() {
    return "Whether the initial anchor is chosen randomly.";
  }
<<<<<<< HEAD

  /**
   * Gets whether if the initial anchor is chosen randomly.
   * 
   * @return true if the initial anchor is a random one.
=======
  
  /** 
   * Gets whether if the initial anchor is chosen randomly.
   * @return true if the initial anchor is a random one. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public boolean isInitialAnchorRandom() {
    return m_RandomInitialAnchor;
  }
<<<<<<< HEAD

  /**
   * Sets whether if the initial anchor is chosen randomly. If not then if it is
   * the furthest point from the mean/centroid.
   * 
   * @param randomInitialAnchor Should be true if the first anchor is to be
   *          chosen randomly.
=======
  
  /** 
   * Sets whether if the initial anchor is chosen randomly. If not 
   * then if it is the furthest point from the mean/centroid.
   * @param randomInitialAnchor Should be true if the first 
   * anchor is to be chosen randomly.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setInitialAnchorRandom(boolean randomInitialAnchor) {
    m_RandomInitialAnchor = randomInitialAnchor;
  }
<<<<<<< HEAD

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String seedTipText() {
    return "The seed value for the random number generator.";
  }

  /**
   * Returns the seed for random number generator.
<<<<<<< HEAD
   * 
   * @return The random number seed.
   */
  @Override
  public int getSeed() {
    return m_RSeed;
  }

  /**
   * Sets the seed for random number generator (that is used for selecting the
   * first anchor point randomly).
   * 
   * @param seed The seed.
   */
  @Override
  public void setSeed(int seed) {
    m_RSeed = seed;
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>();

    newVector.addElement(new Option(
      "\tThe seed for the random number generator used\n"
        + "\tin selecting random anchor.\n" + "(default: 1)", "S", 1,
      "-S <num>"));

    newVector.addElement(new Option("\tUse randomly chosen initial anchors.",
      "R", 0, "-R"));

    newVector.addAll(Collections.list(super.listOptions()));

=======
   * @return The random number seed.
   */
  public int getSeed() {
    return m_RSeed;
  }
  
  /**
   * Sets the seed for random number generator 
   * (that is used for selecting the first anchor 
   * point randomly).
   * @param seed The seed. 
   */
  public void setSeed(int seed) {
    m_RSeed = seed;
  }
  
  /**
   * Returns an enumeration describing the available options.
   * 
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector newVector = new Vector();
    
    newVector.addElement(new Option(
	"\tThe seed for the random number generator used\n"
	+ "\tin selecting random anchor.\n"
	+ "(default: 1)", 
	"S", 1, "-S <num>"));
    
    newVector.addElement(new Option(
	"\tUse randomly chosen initial anchors.",
	"R", 0, "-R"));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return newVector.elements();
  }

  /**
   * Parses a given list of options.
   * 
<<<<<<< HEAD
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -S &lt;num&gt;
   *  The seed for the random number generator used
   *  in selecting random anchor.
   * (default: 1)
   * </pre>
   * 
   * <pre>
   * -R
   *  Use randomly chosen initial anchors.
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   **/
  @Override
  public void setOptions(String[] options) throws Exception {

    String temp = Utils.getOption('S', options);
    if (temp.length() > 0) {
      setSeed(Integer.parseInt(temp));
    } else {
      setSeed(1);
    }

    super.setOptions(options);

=======
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -S &lt;num&gt;
   *  The seed for the random number generator used
   *  in selecting random anchor.
   * (default: 1)</pre>
   * 
   * <pre> -R
   *  Use randomly chosen initial anchors.</pre>
   * 
   <!-- options-end --> 
   * 
   * @param options 	the list of options as an array of strings
   * @throws Exception	if an option is not supported
   **/
  public void setOptions(String[] options)
    throws Exception {

    super.setOptions(options);
   
    String temp = Utils.getOption('S', options);
    if(temp.length()>0) {
      setSeed(Integer.parseInt(temp));
    }
    else {
      setSeed(1);
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setInitialAnchorRandom(Utils.getFlag('R', options));
  }

  /**
   * Gets the current settings of this BallTree MiddleOutConstructor.
   * 
<<<<<<< HEAD
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    result.add("-S");
    result.add("" + getSeed());

    if (isInitialAnchorRandom()) {
      result.add("-R");
    }

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Checks whether if the points in an index list are in some specified of the
   * master index array.
   * 
   * @param list The point list.
   * @param startidx The start of the portion in master index array.
   * @param endidx The end of the portion in master index array.
   * @throws Exception If some point in the point list is not in the specified
   *           portion of master index array.
   */
  public void checkIndicesList(MyIdxList list, int startidx, int endidx)
    throws Exception {

    boolean found;
    ListNode node;
    for (int i = 0; i < list.size(); i++) {
      node = list.get(i);
      found = false;
      for (int j = startidx; j <= endidx; j++) {
        if (node.idx == m_InstList[j]) {
          found = true;
          break;
        }
      }
      if (!found) {
        throw new Exception("Error: Element " + node.idx
          + " of the list not in " + "the array." + "\nArray: "
          + printInsts(startidx, endidx) + "\nList: " + printList(list));
      }
    }
  }

  /**
   * For printing indices in some given portion of the master index array.
   * 
   * @param startIdx The start of the portion in master index array.
   * @param endIdx The end of the portion in master index array.
   * @return The string containing the indices in specified portion of the
   *         master index array.
=======
   * @return 		an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector<String>	result;
    String[]		options;
    int			i;
    
    result = new Vector<String>();
    
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
    
    result.add("-S");
    result.add("" + getSeed());
    
    if(isInitialAnchorRandom())
      result.add("-R");
    
    return result.toArray(new String[result.size()]);
  }
  
  /**
   * Checks whether if the points in an index list
   * are in some specified of the master index array. 
   * @param list The point list.
   * @param startidx The start of the portion in 
   * master index array. 
   * @param endidx The end of the portion in master
   * index array.
   * @throws Exception If some point in the point
   * list is not in the specified portion of master
   * index array. 
   */
  public void checkIndicesList(MyIdxList list, int startidx, int endidx) 
    throws Exception {
    
    boolean found;
    ListNode node;
    for(int i=0; i<list.size(); i++) {
      node = (ListNode)list.elementAt(i);
      found=false;
      for(int j=startidx; j<=endidx; j++) {
        if(node.idx==m_InstList[j]) {
          found=true; 
          break;
        }
      }
      if(!found)
        throw new Exception("Error: Element "+node.idx+" of the list not in " +
                            "the array." +
                            "\nArray: "+printInsts(startidx, endidx)+
                            "\nList: "+printList(list));
    }
  }
  
  /**
   * For printing indices in some given portion
   * of the master index array. 
   * @param startIdx The start of the portion 
   * in master index array. 
   * @param endIdx The end of the portion in 
   * master index array.
   * @return The string containing the indices
   * in specified portion of the master index 
   * array. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String printInsts(int startIdx, int endIdx) {
    StringBuffer bf = new StringBuffer();
    try {
      bf.append("i: ");
      for (int i = startIdx; i <= endIdx; i++) {
<<<<<<< HEAD
        if (i == startIdx) {
          bf.append("" + m_InstList[i]);
        } else {
          bf.append(", " + m_InstList[i]);
        }
=======
        if (i == startIdx)
          bf.append("" + m_InstList[i]);
        else
          bf.append(", " + m_InstList[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return bf.toString();
  }
<<<<<<< HEAD

  /**
   * For printing indices in a given point list.
   * 
   * @param points The point list.
   * @return String containing indices of the points in the point list.
   */
  public String printList(MyIdxList points) {
    if (points == null || points.length() == 0) {
      return "";
    }
    StringBuffer bf = new StringBuffer();
    try {
      ListNode temp;
      for (int i = 0; i < points.size(); i++) {
        temp = points.get(i);
        if (i == 0) {
          bf.append("" + temp.idx);
        } else {
          bf.append(", " + temp.idx);
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return bf.toString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11269 $");
  }

  /**
   * Temp class to represent either a leaf node or an internal node. Should only
   * have two children (could be the case one child is an instance and the other
   * another node). Primarily used for anchor nodes. It stores the points
   * contained in a node together with their distances to the node's
   * centre/anchor point.
   * 
   * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
   * @version $Revision: 11269 $
   */
  protected class TempNode implements RevisionHandler {

    /** The anchor point of the node. */
    Instance anchor;

    /** The index of the anchor point. */
    int idx;

    /** The radius of the node. */
    double radius;

    /** The list of points inside the node. */
    MyIdxList points;

=======
  
  /**
   * For printing indices in a given point list.
   * @param points The point list.
   * @return String containing indices of the
   * points in the point list.
   */
  public String printList(MyIdxList points) {
    if(points==null || points.length()==0) return "";
    StringBuffer bf = new StringBuffer();
    try {
      ListNode temp;
      for(int i=0; i<points.size(); i++) {
        temp = (ListNode) points.elementAt(i);
        if(i==0)
          bf.append(""+temp.idx);
        else
          bf.append(", "+temp.idx);
      }
    } catch(Exception ex) { ex.printStackTrace(); }
    return bf.toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.3 $");
  }
  
  /** 
   * Temp class to represent either a leaf node or an internal node. Should only 
   * have two children (could be the case one child is an instance and the 
   * other another node). Primarily used for anchor nodes. It stores the
   * points contained in a node together with their distances to the 
   * node's centre/anchor point.
   * 
   * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
   * @version $Revision: 1.3 $
   */
  protected class TempNode
    implements RevisionHandler {
    
    /** The anchor point of the node. */
    Instance anchor;
    
    /** The index of the anchor point. */
    int idx;
    
    /** The radius of the node. */
    double radius;
    
    /** The list of points inside the node. */
    MyIdxList points;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    /** Node's left child. */
    TempNode left;

    /** Node's right child. */
    TempNode right;
<<<<<<< HEAD

    /**
     * Returns a string represention of the node.
     * 
     * @return The string representation of the node.
     */
    @Override
    public String toString() {
      if (points == null || points.length() == 0) {
        return idx + "";
      }
      StringBuffer bf = new StringBuffer();
      try {
        bf.append(idx + " p: ");
        ListNode temp;
        for (int i = 0; i < points.size(); i++) {
          temp = points.get(i);
          if (i == 0) {
            bf.append("" + temp.idx);
          } else {
            bf.append(", " + temp.idx);
          }
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      return bf.toString();
    }

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 11269 $");
=======
    
    /**
     * Returns a string represention of the node.
     * @return The string representation of the 
     * node.
     */
    public String toString() {
      if(points==null || points.length()==0) return idx+"";
      StringBuffer bf = new StringBuffer();
      try {
        bf.append(idx+" p: ");
        ListNode temp; 
        for(int i=0; i<points.size(); i++) {
          temp = (ListNode) points.elementAt(i);
          if(i==0)
            bf.append(""+temp.idx);
          else
            bf.append(", "+temp.idx);
        }
      } catch(Exception ex) { ex.printStackTrace(); }
      return bf.toString();
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 1.3 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * An element of MyIdxList. It stores a points index, and its distance to some
   * specific point (usually a node's anchor point).
   * 
   * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
   * @version $Revision: 11269 $
   */
  protected class ListNode implements RevisionHandler, Serializable {

    /** The index of the point. */
    int idx = -1;

    /** The distance of the point to the anchor. */
    double distance = Double.NEGATIVE_INFINITY;

    /**
     * Constructor.
     * 
     * @param i The point's index.
     * @param d The point's distance to the anchor.
=======
   * An element of MyIdxList. It stores a points index, and 
   * its distance to some specific point (usually a node's
   * anchor point). 
   * 
   * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
   * @version $Revision: 1.3 $
   */
  protected class ListNode
    implements RevisionHandler {
    
    /** The index of the point. */
    int idx = -1;
    
    /** The distance of the point to the anchor.*/
    double distance = Double.NEGATIVE_INFINITY;
    
    /**
     * Constructor. 
     * @param i The point's index. 
     * @param d The point's distance to the 
     * anchor.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     */
    public ListNode(int i, double d) {
      idx = i;
      distance = d;
    }
<<<<<<< HEAD

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 11269 $");
    }
  }

  /**
   * Class implementing a list. It stores indices of instances/points, together
   * with their distances to a nodes centre/pivot/anchor, in a (reverse sorted)
   * list.
   * 
   * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
   * @version $Revision: 11269 $
   */
  protected class MyIdxList implements Serializable, RevisionHandler {

    /** for serialization. */
    private static final long serialVersionUID = -2283869109722934927L;

    /** The array list backing this list */
    protected ArrayList<ListNode> m_List;

    /**
     * Constructor.
     */
    public MyIdxList() {
      m_List = new ArrayList<ListNode>();
    }

    /**
     * Constructor for given capacity.
     */
    public MyIdxList(int capacity) {
      m_List = new ArrayList<ListNode>(capacity);
    }

    /**
     * Returns the first element in the list.
     * 
     * @return The list's first element.
     */
    public ListNode getFirst() {
      return m_List.get(0);
    }

    /**
     * Inserts an element in reverse sorted order in the list.
     * 
     * @param idx The index of the point to insert.
     * @param distance The distance of the point to a node's anchor (this would
     *          be used to determine the sort order).
     */
    public void insertReverseSorted(final int idx, final double distance) {

      int i = 0;
      for (ListNode temp : m_List) {
        if (temp.distance < distance) {
          break;
        }
        i++;
      }
      m_List.add(i, new ListNode(idx, distance));
    }

    /**
     * Returns an element at the specified index in the list.
     * 
     * @param index The index of the element in the list.
     * @return The element at the given index.
     */
    public ListNode get(int index) {
      return m_List.get(index);
    }

    /**
     * Removes an element at the specified index from the list.
     * 
     * @param index The index of the element in the list to remove.
     */
    public void remove(int index) {
      m_List.remove(index);
    }

    /**
     * Returns the size of the list.
     * 
     * @return The size of the list.
     */
    public int length() {
      return m_List.size();
    }

    /**
     * Returns the size of the list.
     * 
     * @return The size of the list.
     */
    public int size() {
      return m_List.size();
    }

    /**
     * Appends one list at the end of the other.
     * 
     * @param list1 The list to which the other list would be appended.
     * @param list2 The list to append to the other list.
     * @return The new list with list2 appended to list1.
     */
    public MyIdxList append(MyIdxList list1, MyIdxList list2) {
      MyIdxList temp = new MyIdxList(list1.size() + list2.size());
      temp.m_List.addAll(list1.m_List);
      temp.m_List.addAll(list2.m_List);
      return temp;
    }

    /**
     * Checks the sorting of a list.
     * 
     * @param list The list whose sorting is to be checked.
     * @throws Exception If the list is not in (reverse) sorted order.
     */
    public void checkSorting(MyIdxList list) throws Exception {
      Iterator<ListNode> en = m_List.iterator();
      ListNode first = null, second = null;
      while (en.hasNext()) {
        if (first == null) {
          first = en.next();
        } else {
          second = en.next();
          if (first.distance < second.distance) {
            throw new Exception("List not sorted correctly."
              + " first.distance: " + first.distance + " second.distance: "
              + second.distance + " Please check code.");
          }
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
      return RevisionUtils.extract("$Revision: 11269 $");
=======
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 1.3 $");
    }
  }
  
  /**
   * Class implementing a list. It stores indices of 
   * instances/points, together with their distances to a nodes
   * centre/pivot/anchor, in a (reverse sorted) list.  
   * 
   * @author Ashraf M. Kibriya (amk14[at-the-rate]cs[dot]waikato[dot]ac[dot]nz)
   * @version $Revision: 1.3 $
   */
  protected class MyIdxList
    extends FastVector {
    
    /** for serialization. */
    private static final long serialVersionUID = -2283869109722934927L;    
    
    /** Constructor. */
    public MyIdxList() {
      super();
    }
    
    /**
     * Constructor.  
     * @param size The initial capacity of the list. 
     */
    public MyIdxList(int size) {
      super(size);
    }
    
    /**
     * Returns the first element in the list.
     * @return The list's first element.
     */
    public ListNode getFirst() {
      return (ListNode) this.elementAt(0);
    }
    
    /**
     * Inserts an element in reverse sorted order in 
     * the list.
     * @param idx The index of the point to insert.
     * @param distance The distance of the point to
     * a node's anchor (this would be used to 
     * determine the sort order).
     */
    public void insertReverseSorted(final int idx, final double distance) {
      java.util.Enumeration en = this.elements();
      ListNode temp; int i=0;
      while(en.hasMoreElements()) {
        temp = (ListNode) en.nextElement();
        if(temp.distance < distance)
          break;
        i++;
      }
      this.insertElementAt(new ListNode(idx, distance), i);
    }
    
    /**
     * Returns an element at the specified index in 
     * the list. 
     * @param index The index of the element in the 
     * list.
     * @return The element at the given index.
     */
    public ListNode get(int index) {
      return (ListNode) this.elementAt(index);
    }
    
    /** 
     * Removes an element at the specified index 
     * from the list.
     * @param index The index of the element
     * in the list to remove.
     */
    public void remove(int index) {
      this.removeElementAt(index);
    }
    
    /**
     * Returns the size of the list.
     * @return The size of the list.
     */
    public int length() {
      return super.size();
    }
    
    /**
     * Appends one list at the end of the other. 
     * @param list1 The list to which the other
     * list would be appended.
     * @param list2 The list to append to the 
     * other list.
     * @return The new list with list2 appended 
     * to list1.
     */
    public MyIdxList append(MyIdxList list1, MyIdxList list2) {
      MyIdxList temp = new MyIdxList(list1.size()+list2.size());
      temp.appendElements(list1);
      temp.appendElements(list2);
      return temp;
    }
    
    /**
     * Checks the sorting of a list.
     * @param list The list whose sorting is
     * to be checked.
     * @throws Exception If the list is not
     * in (reverse) sorted order.
     */
    public void checkSorting(MyIdxList list) throws Exception {
      java.util.Enumeration en = list.elements();
      ListNode first=null, second=null;
      while(en.hasMoreElements()) {
        if(first==null)
          first = (ListNode) en.nextElement();
        else {
          second = (ListNode)en.nextElement();
          if(first.distance < second.distance)
            throw new Exception("List not sorted correctly." +
                                " first.distance: " + first.distance +
                                " second.distance: " + second.distance +
                                " Please check code.");            
        }
      }
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 1.3 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }
}
