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
 *    GraphEdge.java
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.graphvisualizer;

/**
 * This class represents an edge in the graph
 *
 * @author Ashraf M. Kibriya (amk14@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $ - 23 Apr 2003 - Initial version (Ashraf M. Kibriya)
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $ - 23 Apr 2003 - Initial version (Ashraf M. Kibriya)
=======
 * @version $Revision: 1.4 $ - 23 Apr 2003 - Initial version (Ashraf M. Kibriya)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class GraphEdge extends Object {
  
  /** The index of source node in Nodes vector */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int src;
  /** The index of target node in Nodes vector */
  public int dest;
  /** The type of Edge */
  public int type;
  /** Label of source node */
  public String srcLbl;
  /** Label of target node */
  public String destLbl;
<<<<<<< HEAD
=======
=======
  protected int src;
  /** The index of target node in Nodes vector */
  protected int dest;
  /** The type of Edge */
  protected int type;
  /** Label of source node */
  protected String srcLbl;
  /** Label of target node */
  protected String destLbl;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  
  public GraphEdge(int s, int d, int t) {
    src=s; dest=d; type=t;
    srcLbl = null; destLbl = null;
  }
  
  public GraphEdge(int s, int d, int t, String sLbl, String dLbl) {
    src=s; dest=d; type=t;
    srcLbl = sLbl; destLbl = dLbl;
  }
  
  public String toString() {
    return ("("+src+","+dest+","+type+")");
  }
  
  public boolean equals(Object e) {
    if( e instanceof GraphEdge &&
    ((GraphEdge)e).src==this.src &&
    ((GraphEdge)e).dest==this.dest &&
    ((GraphEdge)e).type==this.type)
      return true;
    else
      return false;
  }
  
} // GraphEdge
