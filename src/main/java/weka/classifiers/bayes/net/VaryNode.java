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
 */

/*
 * VaryNode.java
<<<<<<< HEAD
 * Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * 
 */

package weka.classifiers.bayes.net;

<<<<<<< HEAD
import java.io.Serializable;

import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

=======
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

import java.io.Serializable;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * Part of ADTree implementation. See ADNode.java for more details.
 * 
 * @author Remco Bouckaert (rrb@xm.co.nz)
<<<<<<< HEAD
 * @version $Revision: 10153 $
 */
public class VaryNode implements Serializable, RevisionHandler {
=======
 * @version $Revision: 1.6 $
 */
public class VaryNode
  implements Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -6196294370675872424L;

  /** index of the node varied **/
  public int m_iNode;

  /** most common value **/
  public int m_nMCV;

  /** list of ADNode children **/
<<<<<<< HEAD
  public ADNode[] m_ADNodes;
=======
  public ADNode [] m_ADNodes;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** Creates new VaryNode */
  public VaryNode(int iNode) {
    m_iNode = iNode;
  }

  /**
   * get counts for specific instantiation of a set of nodes
   * 
   * @param nCounts array for storing counts
<<<<<<< HEAD
   * @param nNodes array of node indexes
=======
   * @param nNodes array of node indexes 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param nOffsets offset for nodes in nNodes in nCounts
   * @param iNode index into nNode indicating current node
   * @param iOffset Offset into nCounts due to nodes below iNode
   * @param parent parant ADNode of this VaryNode
   * @param bSubstract indicate whether counts should be added or substracted
   */
<<<<<<< HEAD
  public void getCounts(int[] nCounts, int[] nNodes, int[] nOffsets, int iNode,
    int iOffset, ADNode parent, boolean bSubstract) {
    for (int iValue = 0; iValue < m_ADNodes.length; iValue++) {
      if (iValue != m_nMCV) {
        if (m_ADNodes[iValue] != null) {
          m_ADNodes[iValue].getCounts(nCounts, nNodes, nOffsets, iNode + 1,
            iOffset + nOffsets[iNode] * iValue, bSubstract);
        }
      } else {
        parent.getCounts(nCounts, nNodes, nOffsets, iNode + 1, iOffset
          + nOffsets[iNode] * iValue, bSubstract);
        for (int iValue2 = 0; iValue2 < m_ADNodes.length; iValue2++) {
          if (iValue2 != m_nMCV && m_ADNodes[iValue2] != null) {
            m_ADNodes[iValue2].getCounts(nCounts, nNodes, nOffsets, iNode + 1,
              iOffset + nOffsets[iNode] * iValue, !bSubstract);
          }
        }
=======
  public void getCounts(
      int [] nCounts, 
      int [] nNodes, 
      int [] nOffsets, 
      int iNode, 
      int iOffset, 
      ADNode parent,
      boolean bSubstract) {
    int nCurrentNode = nNodes[iNode];
    for (int iValue = 0 ; iValue < m_ADNodes.length; iValue++) {
      if (iValue != m_nMCV) {
	if (m_ADNodes[iValue] != null) {
	  m_ADNodes[iValue].getCounts(nCounts, 
	      nNodes, 
	      nOffsets, 
	      iNode + 1, 
	      iOffset + nOffsets[iNode] * iValue, 
	      bSubstract);
	}
      } else {
	parent.getCounts(nCounts, 
	    nNodes, 
	    nOffsets, 
	    iNode + 1, 
	    iOffset + nOffsets[iNode] * iValue, 
	    bSubstract);
	for (int iValue2 = 0; iValue2 < m_ADNodes.length; iValue2++) {
	  if (iValue2 != m_nMCV && m_ADNodes[iValue2] != null) {
	    m_ADNodes[iValue2].getCounts(nCounts, 
		nNodes, 
		nOffsets, 
		iNode + 1, 
		iOffset + nOffsets[iNode] * iValue, 
		!bSubstract);
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  /**
=======
  /** 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * print is used for debugging only, called from ADNode
   * 
   * @param sTab amount of space.
   */
  public void print(String sTab) {
    for (int iValue = 0; iValue < m_ADNodes.length; iValue++) {
      System.out.print(sTab + iValue + ": ");
      if (m_ADNodes[iValue] == null) {
<<<<<<< HEAD
        if (iValue == m_nMCV) {
          System.out.println("MCV");
        } else {
          System.out.println("null");
        }
      } else {
        System.out.println();
        m_ADNodes[iValue].print();
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
    return RevisionUtils.extract("$Revision: 10153 $");
=======
	if (iValue == m_nMCV) {
	  System.out.println("MCV");
	} else {
	  System.out.println("null");
	}
      } else {
	System.out.println();
	m_ADNodes[iValue].print();
      }
    }
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.6 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
