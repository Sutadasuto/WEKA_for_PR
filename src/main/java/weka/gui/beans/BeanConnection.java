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
 *    BeanConnection.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.io.Serializable;
import java.lang.reflect.Method;
<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * Class for encapsulating a connection between two beans. Also maintains a list
 * of all connections
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10221 $
 */
public class BeanConnection implements Serializable {
<<<<<<< HEAD
=======
=======
 * Class for encapsulating a connection between two beans. Also
 * maintains a list of all connections
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 7059 $
 */
public class BeanConnection
  implements Serializable {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 8804264241791332064L;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private static ArrayList<Vector<BeanConnection>> TABBED_CONNECTIONS = new ArrayList<Vector<BeanConnection>>();

  /*
   * static { Vector initial = new Vector(); TABBED_CONNECTIONS.add(initial); }
   */

  // details for this connection
  private final BeanInstance m_source;
  private final BeanInstance m_target;
<<<<<<< HEAD
=======
=======
  /**
   * The list of connections
   */
  public static Vector CONNECTIONS = new Vector();

  // details for this connection
  private BeanInstance m_source;
  private BeanInstance m_target;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * The name of the event for this connection
   */
<<<<<<< HEAD
  private final String m_eventName;
=======
<<<<<<< HEAD
  private final String m_eventName;
=======
  private String m_eventName;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  // Should the connection be painted?
  private boolean m_hidden = false;

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets up just a single collection of bean connections in the first element
   * of the list. This is useful for clients that are using XMLBeans to load
   * beans.
   */
  public static void init() {
    // CONNECTIONS = new Vector();

    // TODO remove this soon!!!
    // TABBED_CONNECTIONS.set(0, new Vector());
    TABBED_CONNECTIONS.clear();
    TABBED_CONNECTIONS.add(new Vector<BeanConnection>());
<<<<<<< HEAD
=======
=======
   * Reset the list of connections
   */
  public static void reset() {
    CONNECTIONS = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the list of connections
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the list of connections
   */
  public static Vector<BeanConnection> getConnections(Integer... tab) {
    Vector<BeanConnection> returnV = null;
    int index = 0;
    if (tab.length > 0) {
      index = tab[0].intValue();
    }

    if (TABBED_CONNECTIONS.size() > 0) {
      returnV = TABBED_CONNECTIONS.get(index);
    }

    return returnV;
<<<<<<< HEAD
=======
=======
   *
   * @return the list of connections
   */
  public static Vector getConnections() {
    return CONNECTIONS;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Describe <code>setConnections</code> method here.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param connections a <code>Vector</code> value
   */
  public static void setConnections(Vector<BeanConnection> connections,
    Integer... tab) {
    int index = 0;
    if (tab.length > 0) {
      index = tab[0].intValue();
    }

    if (index < TABBED_CONNECTIONS.size()) {
      TABBED_CONNECTIONS.set(index, connections);
    }
  }

  /**
   * Add the supplied collection of connections to the end of the list.
   * 
   * 
   * @param connections the connections to add
   */
  public static void addConnections(Vector<BeanConnection> connections) {
    TABBED_CONNECTIONS.add(connections);
  }

  /**
   * Append the supplied connections to the list for the given tab index
   * 
   * @param connections the connections to append
   * @param tab the index of the list to append to
   */
  public static void appendConnections(Vector<BeanConnection> connections,
    int tab) {
    if (tab < TABBED_CONNECTIONS.size()) {
      Vector<BeanConnection> cons = TABBED_CONNECTIONS.get(tab);

      for (int i = 0; i < connections.size(); i++) {
        cons.add(connections.get(i));
      }
    }
  }

  /**
   * Returns true if there is a link between the supplied source and target
   * BeanInstances at an earlier index than the supplied index
   * 
<<<<<<< HEAD
=======
=======
   *
   * @param connections a <code>Vector</code> value
   */
  public static void setConnections(Vector connections) {
    CONNECTIONS = connections;
  }

  /**
   * Returns true if there is a link between the supplied source and
   * target BeanInstances at an earlier index than the supplied index
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param source the source BeanInstance
   * @param target the target BeanInstance
   * @param index the index to compare to
   * @return true if there is already a link at an earlier index
   */
  private static boolean previousLink(BeanInstance source, BeanInstance target,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int index, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
<<<<<<< HEAD
=======
=======
				      int index) {
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      BeanInstance compSource = bc.getSource();
      BeanInstance compTarget = bc.getTarget();

      if (compSource == source && compTarget == target && index < i) {
<<<<<<< HEAD
        return true;
=======
<<<<<<< HEAD
        return true;
=======
	return true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return false;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * A candidate BeanInstance can't be an input if it is the target of a
   * connection from a source that is in the listToCheck
   */
  private static boolean checkTargetConstraint(BeanInstance candidate,
    Vector<Object> listToCheck, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
      if (bc.getTarget() == candidate) {
        for (int j = 0; j < listToCheck.size(); j++) {
          BeanInstance tempSource = (BeanInstance) listToCheck.elementAt(j);
          if (bc.getSource() == tempSource) {
            return false;
          }
<<<<<<< HEAD
=======
=======
   * A candidate BeanInstance can be an input if it is in the listToCheck
   * and it is the source of a connection to a target that is in the
   * listToCheck
   */
  private static boolean checkForSource(BeanInstance candidate,
                                        Vector listToCheck) {
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
      if (bc.getSource() != candidate) {
        continue;
      }

      // check to see if target is in list
      for (int j = 0; j < listToCheck.size(); j++) {
        BeanInstance tempTarget = (BeanInstance)listToCheck.elementAt(j);
        if (bc.getTarget() == tempTarget) {
          return true;
        }
      }
    }
    return false;
  }
  
  /**
   * A candidate BeanInstance can't be an input if it is the target
   * of a connection from a source that is in the listToCheck
   */
  private static boolean checkTargetConstraint(BeanInstance candidate,
                                               Vector listToCheck) {
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
      if (bc.getTarget() == candidate) {
        for (int j = 0; j < listToCheck.size(); j++) {
          BeanInstance tempSource = (BeanInstance)listToCheck.elementAt(j);
          if (bc.getSource() == tempSource) {
            return false;
          }          
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
    return true;
  }

  /**
<<<<<<< HEAD
   * Returns a vector of BeanConnections associated with the supplied vector of
   * BeanInstances, i.e. all connections that exist between those BeanInstances
   * in the subFlow.
=======
<<<<<<< HEAD
   * Returns a vector of BeanConnections associated with the supplied vector of
   * BeanInstances, i.e. all connections that exist between those BeanInstances
   * in the subFlow.
=======
   * Returns a vector of BeanConnections associated with
   * the supplied vector of BeanInstances, i.e. all connections
   * that exist between those BeanInstances in the subFlow.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param subFlow a Vector of BeanInstances
   * @return a Vector of BeanConnections
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static Vector<BeanConnection> associatedConnections(
    Vector<Object> subFlow, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    Vector<BeanConnection> associatedConnections = new Vector<BeanConnection>();
    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
<<<<<<< HEAD
=======
=======
  public static Vector associatedConnections(Vector subFlow) {
    Vector associatedConnections = new Vector();
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      BeanInstance tempSource = bc.getSource();
      BeanInstance tempTarget = bc.getTarget();
      boolean sourceInSubFlow = false;
      boolean targetInSubFlow = false;
      for (int j = 0; j < subFlow.size(); j++) {
<<<<<<< HEAD
        BeanInstance toCheck = (BeanInstance) subFlow.elementAt(j);
=======
<<<<<<< HEAD
        BeanInstance toCheck = (BeanInstance) subFlow.elementAt(j);
=======
        BeanInstance toCheck = (BeanInstance)subFlow.elementAt(j);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (toCheck == tempSource) {
          sourceInSubFlow = true;
        }
        if (toCheck == tempTarget) {
          targetInSubFlow = true;
        }
        if (sourceInSubFlow && targetInSubFlow) {
          associatedConnections.add(bc);
          break;
        }
      }
    }
    return associatedConnections;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns a vector of BeanInstances that can be considered as inputs (or the
   * left-hand side of a sub-flow)
   * 
   * @param subset the sub-flow to examine
   * @return a Vector of inputs to the sub-flow
   */
  public static Vector<Object> inputs(Vector<Object> subset, Integer... tab) {
    Vector<Object> result = new Vector<Object>();
    for (int i = 0; i < subset.size(); i++) {
      BeanInstance temp = (BeanInstance) subset.elementAt(i);
      // if (checkForSource(temp, subset)) {
      // now check target constraint
      if (checkTargetConstraint(temp, subset, tab)) {
        result.add(temp);
      }
      // }
<<<<<<< HEAD
=======
=======
   * Returns a vector of BeanInstances that can be considered
   * as inputs (or the left-hand side of a sub-flow)
   *
   * @param subset the sub-flow to examine
   * @return a Vector of inputs to the sub-flow
   */
  public static Vector inputs(Vector subset) {
    Vector result = new Vector();
    for (int i = 0; i < subset.size(); i++) {
      BeanInstance temp = (BeanInstance)subset.elementAt(i);
      //      if (checkForSource(temp, subset)) {
        // now check target constraint
        if (checkTargetConstraint(temp, subset)) {
          result.add(temp);
        }
        //      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return result;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * A candidate BeanInstance can be an output if it is in the listToCheck and
   * it is the target of a connection from a source that is in the listToCheck
   */
  private static boolean checkForTarget(BeanInstance candidate,
    Vector<Object> listToCheck, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
      if (bc.getTarget() != candidate) {
        continue;
      }

      // check to see if source is in list
      for (int j = 0; j < listToCheck.size(); j++) {
        BeanInstance tempSource = (BeanInstance) listToCheck.elementAt(j);
<<<<<<< HEAD
=======
=======

  /**
   * A candidate BeanInstance can be an output if it is in the listToCheck
   * and it is the target of a connection from a source that is in the
   * listToCheck
   */
  private static boolean checkForTarget(BeanInstance candidate,
                                        Vector listToCheck) {
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
      if (bc.getTarget() != candidate) {
        continue;
      }
      
      // check to see if source is in list
      for (int j = 0; j < listToCheck.size(); j++) {
        BeanInstance tempSource = (BeanInstance)listToCheck.elementAt(j);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (bc.getSource() == tempSource) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean isInList(BeanInstance candidate,
<<<<<<< HEAD
    Vector<Object> listToCheck) {
    for (int i = 0; i < listToCheck.size(); i++) {
      BeanInstance temp = (BeanInstance) listToCheck.elementAt(i);
=======
<<<<<<< HEAD
    Vector<Object> listToCheck) {
    for (int i = 0; i < listToCheck.size(); i++) {
      BeanInstance temp = (BeanInstance) listToCheck.elementAt(i);
=======
                                  Vector listToCheck) {
    for (int i = 0; i < listToCheck.size(); i++) {
      BeanInstance temp = (BeanInstance)listToCheck.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (candidate == temp) {
        return true;
      }
    }
    return false;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * A candidate BeanInstance can't be an output if it is the source of a
   * connection only to target(s) that are in the listToCheck
   */
  private static boolean checkSourceConstraint(BeanInstance candidate,
    Vector<Object> listToCheck, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    boolean result = true;
    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
<<<<<<< HEAD
=======
=======
   * A candidate BeanInstance can't be an output if it is the source
   * of a connection only to target(s) that are in the listToCheck
   */
  private static boolean checkSourceConstraint(BeanInstance candidate,
                                               Vector listToCheck) {
    boolean result = true;
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (bc.getSource() == candidate) {
        BeanInstance cTarget = bc.getTarget();
        // is the target of this connection external to the list to check?
        if (!isInList(cTarget, listToCheck)) {
          return true;
        }
        for (int j = 0; j < listToCheck.size(); j++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          BeanInstance tempTarget = (BeanInstance) listToCheck.elementAt(j);
          if (bc.getTarget() == tempTarget) {
            result = false;
          }
<<<<<<< HEAD
=======
=======
          BeanInstance tempTarget = (BeanInstance)listToCheck.elementAt(j);
          if (bc.getTarget() == tempTarget) {
            result = false;
          }          
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns a vector of BeanInstances that can be considered as outputs (or the
   * right-hand side of a sub-flow)
   * 
   * @param subset the sub-flow to examine
   * @return a Vector of outputs of the sub-flow
   */
  public static Vector<Object> outputs(Vector<Object> subset, Integer... tab) {
    Vector<Object> result = new Vector<Object>();
    for (int i = 0; i < subset.size(); i++) {
      BeanInstance temp = (BeanInstance) subset.elementAt(i);
      if (checkForTarget(temp, subset, tab)) {
        // now check source constraint
        if (checkSourceConstraint(temp, subset, tab)) {
          // now check that this bean can actually produce some events
          try {
            BeanInfo bi = Introspector.getBeanInfo(temp.getBean().getClass());
            EventSetDescriptor[] esd = bi.getEventSetDescriptors();
<<<<<<< HEAD
=======
=======
   * Returns a vector of BeanInstances that can be considered
   * as outputs (or the right-hand side of a sub-flow)
   *
   * @param subset the sub-flow to examine
   * @return a Vector of outputs of the sub-flow
   */
  public static Vector outputs(Vector subset) {
    Vector result = new Vector();
    for (int i = 0; i < subset.size(); i++) {
      BeanInstance temp = (BeanInstance)subset.elementAt(i);
      if (checkForTarget(temp, subset)) {
        // now check source constraint
        if (checkSourceConstraint(temp, subset)) {
          // now check that this bean can actually produce some events
          try {
            BeanInfo bi = Introspector.getBeanInfo(temp.getBean().getClass());
            EventSetDescriptor [] esd = bi.getEventSetDescriptors();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (esd != null && esd.length > 0) {
              result.add(temp);
            }
          } catch (IntrospectionException ex) {
            // quietly ignore
          }
        }
      }
    }
    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Renders the connections and their names on the supplied graphics context
   * 
   * @param gx a <code>Graphics</code> value
   */
  public static void paintConnections(Graphics gx, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
<<<<<<< HEAD
=======
=======
   * Renders the connections and their names on the supplied graphics
   * context
   *
   * @param gx a <code>Graphics</code> value
   */
  public static void paintConnections(Graphics gx) {
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (!bc.isHidden()) {
        BeanInstance source = bc.getSource();
        BeanInstance target = bc.getTarget();
        EventSetDescriptor srcEsd = bc.getSourceEventSetDescriptor();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        BeanVisual sourceVisual = (source.getBean() instanceof Visible) ? ((Visible) source
          .getBean()).getVisual() : null;
        BeanVisual targetVisual = (target.getBean() instanceof Visible) ? ((Visible) target
          .getBean()).getVisual() : null;
        if (sourceVisual != null && targetVisual != null) {
          Point bestSourcePt = sourceVisual.getClosestConnectorPoint(new Point(
            (target.getX() + (target.getWidth() / 2)), (target.getY() + (target
              .getHeight() / 2))));
          Point bestTargetPt = targetVisual.getClosestConnectorPoint(new Point(
            (source.getX() + (source.getWidth() / 2)), (source.getY() + (source
              .getHeight() / 2))));
          gx.setColor(Color.red);
          boolean active = true;
          if (source.getBean() instanceof EventConstraints) {
            if (!((EventConstraints) source.getBean()).eventGeneratable(srcEsd
              .getName())) {
<<<<<<< HEAD
=======
=======
        BeanVisual sourceVisual = (source.getBean() instanceof Visible) ?
          ((Visible)source.getBean()).getVisual() :
          null;
        BeanVisual targetVisual = (target.getBean() instanceof Visible) ?
          ((Visible)target.getBean()).getVisual() :
          null;
        if (sourceVisual != null && targetVisual != null) {
          Point bestSourcePt = 
            sourceVisual.getClosestConnectorPoint(
                         new Point((target.getX()+(target.getWidth()/2)), 
                                   (target.getY() + (target.getHeight() / 2))));
          Point bestTargetPt = 
            targetVisual.getClosestConnectorPoint(
                         new Point((source.getX()+(source.getWidth()/2)), 
                                   (source.getY() + (source.getHeight() / 2))));
          gx.setColor(Color.red);
          boolean active = true;
          if (source.getBean() instanceof EventConstraints) {
            if (!((EventConstraints) source.getBean()).
                eventGeneratable(srcEsd.getName())) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              gx.setColor(Color.gray); // link not active at this time
              active = false;
            }
          }
<<<<<<< HEAD
          gx.drawLine((int) bestSourcePt.getX(), (int) bestSourcePt.getY(),
            (int) bestTargetPt.getX(), (int) bestTargetPt.getY());
=======
<<<<<<< HEAD
          gx.drawLine((int) bestSourcePt.getX(), (int) bestSourcePt.getY(),
            (int) bestTargetPt.getX(), (int) bestTargetPt.getY());
=======
          gx.drawLine((int)bestSourcePt.getX(), (int)bestSourcePt.getY(),
                      (int)bestTargetPt.getX(), (int)bestTargetPt.getY());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          // paint an arrow head
          double angle;
          try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            double a = (bestSourcePt.getY() - bestTargetPt.getY())
              / (bestSourcePt.getX() - bestTargetPt.getX());
            angle = Math.atan(a);
          } catch (Exception ex) {
            angle = Math.PI / 2;
          }
          // Point arrowstart = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
          Point arrowstart = new Point(bestTargetPt.x, bestTargetPt.y);
          Point arrowoffset = new Point((int) (7 * Math.cos(angle)),
            (int) (7 * Math.sin(angle)));
          Point arrowend;
          if (bestSourcePt.getX() >= bestTargetPt.getX()) {

            arrowend = new Point(arrowstart.x + arrowoffset.x, arrowstart.y
              + arrowoffset.y);
          } else {
            arrowend = new Point(arrowstart.x - arrowoffset.x, arrowstart.y
              - arrowoffset.y);
          }
          int xs[] = { arrowstart.x,
            arrowend.x + (int) (7 * Math.cos(angle + (Math.PI / 2))),
            arrowend.x + (int) (7 * Math.cos(angle - (Math.PI / 2))) };
          int ys[] = { arrowstart.y,
            arrowend.y + (int) (7 * Math.sin(angle + (Math.PI / 2))),
            arrowend.y + (int) (7 * Math.sin(angle - (Math.PI / 2))) };
<<<<<<< HEAD
=======
=======
            double a = 
              (double)(bestSourcePt.getY() - 
                       bestTargetPt.getY()) / 
              (double)(bestSourcePt.getX() - bestTargetPt.getX());
            angle = Math.atan(a);
          } catch(Exception ex) {
            angle = Math.PI / 2;
          }
          //	Point arrowstart = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
          Point arrowstart = new Point(bestTargetPt.x,
                                       bestTargetPt.y);
          Point arrowoffset = new Point((int)(7 * Math.cos(angle)), 
                                        (int)(7 * Math.sin(angle)));
          Point arrowend;
          if (bestSourcePt.getX() >= bestTargetPt.getX()) {
	  
            arrowend = new Point(arrowstart.x + arrowoffset.x, 
                                 arrowstart.y + arrowoffset.y);
          } else {
            arrowend = new Point(arrowstart.x - arrowoffset.x, 
                                 arrowstart.y - arrowoffset.y);
          }
          int xs[] = { arrowstart.x,
                       arrowend.x + (int)(7 * Math.cos(angle + (Math.PI / 2))),
                       arrowend.x + (int)(7 * Math.cos(angle - (Math.PI / 2)))};
          int ys[] = { arrowstart.y,
                       arrowend.y + (int)(7 * Math.sin(angle + (Math.PI / 2))),
                       arrowend.y + (int)(7 * Math.sin(angle - (Math.PI / 2)))};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          gx.fillPolygon(xs, ys, 3);
          // ----

          // paint the connection name
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          int midx = (int) bestSourcePt.getX();
          midx += (int) ((bestTargetPt.getX() - bestSourcePt.getX()) / 2);
          int midy = (int) bestSourcePt.getY();
          midy += (int) ((bestTargetPt.getY() - bestSourcePt.getY()) / 2) - 2;
          gx.setColor((active) ? Color.blue : Color.gray);
          if (previousLink(source, target, i, tab)) {
<<<<<<< HEAD
=======
=======
          int midx = (int)bestSourcePt.getX();
          midx += (int)((bestTargetPt.getX() - bestSourcePt.getX()) / 2);
          int midy = (int)bestSourcePt.getY();
          midy += (int)((bestTargetPt.getY() - bestSourcePt.getY()) / 2) - 2 ;
          gx.setColor((active) ? Color.blue : Color.gray);
          if (previousLink(source, target, i)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            midy -= 15;
          }
          gx.drawString(srcEsd.getName(), midx, midy);
        }
      }
    }
  }

  /**
   * Return a list of connections within some delta of a point
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pt the point at which to look for connections
   * @param delta connections have to be within this delta of the point
   * @return a list of connections
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static Vector<BeanConnection> getClosestConnections(Point pt,
    int delta, Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    Vector<BeanConnection> closestConnections = new Vector<BeanConnection>();

    for (int i = 0; i < connections.size(); i++) {
      BeanConnection bc = connections.elementAt(i);
      BeanInstance source = bc.getSource();
      BeanInstance target = bc.getTarget();
      bc.getSourceEventSetDescriptor();
      BeanVisual sourceVisual = (source.getBean() instanceof Visible) ? ((Visible) source
        .getBean()).getVisual() : null;
      BeanVisual targetVisual = (target.getBean() instanceof Visible) ? ((Visible) target
        .getBean()).getVisual() : null;
      if (sourceVisual != null && targetVisual != null) {
        Point bestSourcePt = sourceVisual.getClosestConnectorPoint(new Point(
          (target.getX() + (target.getWidth() / 2)), (target.getY() + (target
            .getHeight() / 2))));
        Point bestTargetPt = targetVisual.getClosestConnectorPoint(new Point(
          (source.getX() + (source.getWidth() / 2)), (source.getY() + (source
            .getHeight() / 2))));

        int minx = (int) Math.min(bestSourcePt.getX(), bestTargetPt.getX());
        int maxx = (int) Math.max(bestSourcePt.getX(), bestTargetPt.getX());
        int miny = (int) Math.min(bestSourcePt.getY(), bestTargetPt.getY());
        int maxy = (int) Math.max(bestSourcePt.getY(), bestTargetPt.getY());
        // check to see if supplied pt is inside bounding box
        if (pt.getX() >= minx - delta && pt.getX() <= maxx + delta
          && pt.getY() >= miny - delta && pt.getY() <= maxy + delta) {
          // now see if the point is within delta of the line
          // formulate ax + by + c = 0
          double a = bestSourcePt.getY() - bestTargetPt.getY();
          double b = bestTargetPt.getX() - bestSourcePt.getX();
          double c = (bestSourcePt.getX() * bestTargetPt.getY())
            - (bestTargetPt.getX() * bestSourcePt.getY());

          double distance = Math.abs((a * pt.getX()) + (b * pt.getY()) + c);
          distance /= Math.abs(Math.sqrt((a * a) + (b * b)));

          if (distance <= delta) {
            closestConnections.addElement(bc);
          }
        }
<<<<<<< HEAD
=======
=======
  public static Vector getClosestConnections(Point pt, int delta) {
    Vector closestConnections = new Vector();
    
    for (int i = 0; i < CONNECTIONS.size(); i++) {
      BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
      BeanInstance source = bc.getSource();
      BeanInstance target = bc.getTarget();
      EventSetDescriptor srcEsd = bc.getSourceEventSetDescriptor();
      BeanVisual sourceVisual = (source.getBean() instanceof Visible) ?
	((Visible)source.getBean()).getVisual() :
	null;
      BeanVisual targetVisual = (target.getBean() instanceof Visible) ?
	((Visible)target.getBean()).getVisual() :
	null;
      if (sourceVisual != null && targetVisual != null) {
	Point bestSourcePt = 
	  sourceVisual.getClosestConnectorPoint(
		       new Point((target.getX()+(target.getWidth()/2)), 
				 (target.getY() + (target.getHeight() / 2))));
	Point bestTargetPt = 
	  targetVisual.getClosestConnectorPoint(
		       new Point((source.getX()+(source.getWidth()/2)), 
				 (source.getY() + (source.getHeight() / 2))));

	int minx = (int) Math.min(bestSourcePt.getX(), bestTargetPt.getX());
	int maxx = (int) Math.max(bestSourcePt.getX(), bestTargetPt.getX());
	int miny = (int) Math.min(bestSourcePt.getY(), bestTargetPt.getY());
	int maxy = (int) Math.max(bestSourcePt.getY(), bestTargetPt.getY());
	// check to see if supplied pt is inside bounding box
	if (pt.getX() >= minx-delta && pt.getX() <= maxx+delta && 
	    pt.getY() >= miny-delta && pt.getY() <= maxy+delta) {
	  // now see if the point is within delta of the line
	  // formulate ax + by + c = 0
	  double a = bestSourcePt.getY() - bestTargetPt.getY();
	  double b = bestTargetPt.getX() - bestSourcePt.getX();
	  double c = (bestSourcePt.getX() * bestTargetPt.getY()) -
	    (bestTargetPt.getX() * bestSourcePt.getY());
	  
	  double distance = Math.abs((a * pt.getX()) + (b * pt.getY()) + c);
	  distance /= Math.abs(Math.sqrt((a*a) + (b*b)));

	  if (distance <= delta) {
	    closestConnections.addElement(bc);
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return closestConnections;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Remove the list of connections at the supplied index
   * 
   * @param tab the index of the list to remove (correspods to a tab in the
   *          Knowledge Flow UI)
   * 
   * @param tab the index of the list of connections to remove
   */
  public static void removeConnectionList(Integer tab) {

    TABBED_CONNECTIONS.remove(tab.intValue());
  }

  /**
   * Remove all connections for a bean. If the bean is a target for receiving
   * events then it gets deregistered from the corresonding source bean. If the
   * bean is a source of events then all targets implementing BeanCommon are
   * notified via their disconnectionNotification methods that the source (and
   * hence the connection) is going away.
   * 
   * @param instance the bean to remove connections to/from
   */
  public static void removeConnections(BeanInstance instance, Integer... tab) {

    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    Vector<Object> instancesToRemoveFor = new Vector<Object>();
    if (instance.getBean() instanceof MetaBean) {
      instancesToRemoveFor = ((MetaBean) instance.getBean())
        .getBeansInSubFlow();
    } else {
      instancesToRemoveFor.add(instance);
    }
    Vector<BeanConnection> removeVector = new Vector<BeanConnection>();
    for (int j = 0; j < instancesToRemoveFor.size(); j++) {
      BeanInstance tempInstance = (BeanInstance) instancesToRemoveFor
        .elementAt(j);
      for (int i = 0; i < connections.size(); i++) {
        // In cases where this instance is the target, deregister it
        // as a listener for the source
        BeanConnection bc = connections.elementAt(i);
<<<<<<< HEAD
=======
=======
   * Remove all connections for a bean. If the bean is a target for
   * receiving events then it gets deregistered from the corresonding
   * source bean. If the bean is a source of events then all targets 
   * implementing BeanCommon are notified via their
   * disconnectionNotification methods that the source (and hence the
   * connection) is going away.
   *
   * @param instance the bean to remove connections to/from
   */
  public static void removeConnections(BeanInstance instance) {
    
    Vector instancesToRemoveFor = new Vector();
    if (instance.getBean() instanceof MetaBean) {
      instancesToRemoveFor = 
        ((MetaBean)instance.getBean()).getBeansInSubFlow();
    } else {
      instancesToRemoveFor.add(instance);
    }
    Vector removeVector = new Vector();
    for (int j = 0; j < instancesToRemoveFor.size(); j++) {
      BeanInstance tempInstance = 
        (BeanInstance)instancesToRemoveFor.elementAt(j);
      for (int i = 0; i < CONNECTIONS.size(); i++) {
        // In cases where this instance is the target, deregister it
        // as a listener for the source
        BeanConnection bc = (BeanConnection)CONNECTIONS.elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        BeanInstance tempTarget = bc.getTarget();
        BeanInstance tempSource = bc.getSource();

        EventSetDescriptor tempEsd = bc.getSourceEventSetDescriptor();
        if (tempInstance == tempTarget) {
          // try to deregister the target as a listener for the source
          try {
            Method deregisterMethod = tempEsd.getRemoveListenerMethod();
            Object targetBean = tempTarget.getBean();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            Object[] args = new Object[1];
            args[0] = targetBean;
            deregisterMethod.invoke(tempSource.getBean(), args);
            // System.err.println("Deregistering listener");
<<<<<<< HEAD
=======
=======
            Object [] args = new Object[1];
            args[0] = targetBean;
            deregisterMethod.invoke(tempSource.getBean(), args);
            //            System.err.println("Deregistering listener");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            removeVector.addElement(bc);
          } catch (Exception ex) {
            ex.printStackTrace();
          }
        } else if (tempInstance == tempSource) {
          removeVector.addElement(bc);
          if (tempTarget.getBean() instanceof BeanCommon) {
            // tell the target that the source is going away, therefore
            // this type of connection is as well
<<<<<<< HEAD
            ((BeanCommon) tempTarget.getBean()).disconnectionNotification(
              tempEsd.getName(), tempSource.getBean());
=======
<<<<<<< HEAD
            ((BeanCommon) tempTarget.getBean()).disconnectionNotification(
              tempEsd.getName(), tempSource.getBean());
=======
            ((BeanCommon)tempTarget.getBean()).
              disconnectionNotification(tempEsd.getName(),
                                        tempSource.getBean());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      }
    }
    for (int i = 0; i < removeVector.size(); i++) {
<<<<<<< HEAD
      // System.err.println("removing connection");
      connections.removeElement(removeVector.elementAt(i));
=======
<<<<<<< HEAD
      // System.err.println("removing connection");
      connections.removeElement(removeVector.elementAt(i));
=======
      //      System.err.println("removing connection");
      CONNECTIONS.removeElement((BeanConnection)removeVector.elementAt(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  public static void doMetaConnection(BeanInstance source, BeanInstance target,
<<<<<<< HEAD
    final EventSetDescriptor esd, final JComponent displayComponent,
    final int tab) {
=======
<<<<<<< HEAD
    final EventSetDescriptor esd, final JComponent displayComponent,
    final int tab) {
=======
                                      final EventSetDescriptor esd,
                                      final JComponent displayComponent) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Object targetBean = target.getBean();
    BeanInstance realTarget = null;
    final BeanInstance realSource = source;
    if (targetBean instanceof MetaBean) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Vector<BeanInstance> receivers = ((MetaBean) targetBean)
        .getSuitableTargets(esd);
      if (receivers.size() == 1) {
        realTarget = receivers.elementAt(0);
        new BeanConnection(realSource, realTarget, esd, tab);
<<<<<<< HEAD
=======
=======
      Vector receivers = ((MetaBean)targetBean).getSuitableTargets(esd);
      if (receivers.size() == 1) {
        realTarget = (BeanInstance)receivers.elementAt(0);
        BeanConnection bc = new BeanConnection(realSource, realTarget,
                                               esd);
        //        m_target = (BeanInstance)receivers.elementAt(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } else {
        // have to do the popup thing here
        int menuItemCount = 0;
        JPopupMenu targetConnectionMenu = new JPopupMenu();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        targetConnectionMenu.insert(new JLabel("Select target",
          SwingConstants.CENTER), menuItemCount++);
        for (int i = 0; i < receivers.size(); i++) {
          final BeanInstance tempTarget = receivers.elementAt(i);
          String tName = ""
            + (i + 1)
            + ": "
            + ((tempTarget.getBean() instanceof BeanCommon) ? ((BeanCommon) tempTarget
              .getBean()).getCustomName() : tempTarget.getBean().getClass()
              .getName());
          JMenuItem targetItem = new JMenuItem(tName);
          targetItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new BeanConnection(realSource, tempTarget, esd, tab);
              displayComponent.repaint();
            }
          });
<<<<<<< HEAD
=======
=======
        targetConnectionMenu.insert(new JLabel(Messages.getInstance().getString("BeanConnection_DoMetaConnection_TargetConnectionMenu_Insert_Text_First"),
                                               SwingConstants.CENTER),
                                    menuItemCount++);
        for (int i = 0; i < receivers.size(); i++) {
          final BeanInstance tempTarget = 
            (BeanInstance)receivers.elementAt(i);
          String tName = ""+(i+1)+": " 
          + ((tempTarget.getBean() instanceof BeanCommon) 
              ? ((BeanCommon)tempTarget.getBean()).getCustomName() 
              : tempTarget.getBean().getClass().getName());
          JMenuItem targetItem = new JMenuItem(tName);
          targetItem.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                //    finalTarget.add(tempTarget);
                BeanConnection bc = 
                  new BeanConnection(realSource, tempTarget,
                                     esd);
                displayComponent.repaint();
              }
            });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          targetConnectionMenu.add(targetItem);
          menuItemCount++;
        }
        targetConnectionMenu.show(displayComponent, target.getX(),
<<<<<<< HEAD
          target.getY());
        // m_target = (BeanInstance)finalTarget.elementAt(0);
=======
<<<<<<< HEAD
          target.getY());
        // m_target = (BeanInstance)finalTarget.elementAt(0);
=======
                                  target.getY());
        //        m_target = (BeanInstance)finalTarget.elementAt(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Creates a new <code>BeanConnection</code> instance.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param source the source bean
   * @param target the target bean
   * @param esd the EventSetDescriptor for the connection be displayed
   */
  public BeanConnection(BeanInstance source, BeanInstance target,
    EventSetDescriptor esd, Integer... tab) {

    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

    m_source = source;
    m_target = target;
    // m_sourceEsd = sourceEsd;
    m_eventName = esd.getName();
    // System.err.println(m_eventName);

    // attempt to connect source and target beans
    Method registrationMethod =
    // m_sourceEsd.getAddListenerMethod();
    // getSourceEventSetDescriptor().getAddListenerMethod();
    esd.getAddListenerMethod();
    Object targetBean = m_target.getBean();

    Object[] args = new Object[1];
    args[0] = targetBean;
    Class<?> listenerClass = esd.getListenerType();
    if (listenerClass.isInstance(targetBean)) {
      try {
        registrationMethod.invoke(m_source.getBean(), args);
        // if the target implements BeanCommon, then inform
        // it that it has been registered as a listener with a source via
        // the named listener interface
        if (targetBean instanceof BeanCommon) {
          ((BeanCommon) targetBean).connectionNotification(esd.getName(),
            m_source.getBean());
        }
        connections.addElement(this);
      } catch (Exception ex) {
        System.err.println("[BeanConnection] Unable to connect beans");
        ex.printStackTrace();
      }
    } else {
      System.err.println("[BeanConnection] Unable to connect beans");
<<<<<<< HEAD
=======
=======
   *
   * @param source the source bean
   * @param target the target bean
   * @param esd the EventSetDescriptor for the connection
   * be displayed
   */
  public BeanConnection(BeanInstance source, BeanInstance target,
			EventSetDescriptor esd) {
    m_source = source;
    m_target = target;
    //    m_sourceEsd = sourceEsd;
    m_eventName = esd.getName();
    //    System.err.println(m_eventName);

    // attempt to connect source and target beans
    Method registrationMethod = 
      //      m_sourceEsd.getAddListenerMethod();
      //      getSourceEventSetDescriptor().getAddListenerMethod();
      esd.getAddListenerMethod();
    Object targetBean = m_target.getBean();

    Object [] args = new Object[1];
    args[0] = targetBean;
    Class listenerClass = esd.getListenerType();
    if (listenerClass.isInstance(targetBean)) {
      try {
	registrationMethod.invoke(m_source.getBean(), args);
	// if the target implements BeanCommon, then inform
	// it that it has been registered as a listener with a source via
	// the named listener interface
	if (targetBean instanceof BeanCommon) {
	  ((BeanCommon)targetBean).
	    connectionNotification(esd.getName(), m_source.getBean());
	}
	CONNECTIONS.addElement(this);
      } catch (Exception ex) {
	System.err.println(Messages.getInstance().getString("BeanConnection_Error_Text_First"));
	ex.printStackTrace();
      }
    } else {
      System.err.println(Messages.getInstance().getString("BeanConnection_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Make this connection invisible on the display
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param hidden true to make the connection invisible
   */
  public void setHidden(boolean hidden) {
    m_hidden = hidden;
  }

  /**
   * Returns true if this connection is invisible
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if connection is invisible
   */
  public boolean isHidden() {
    return m_hidden;
  }

  /**
   * Remove this connection
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void remove(Integer... tab) {
    int tabIndex = 0;
    if (tab.length > 0) {
      tabIndex = tab[0].intValue();
    }

    Vector<BeanConnection> connections = TABBED_CONNECTIONS.get(tabIndex);

<<<<<<< HEAD
=======
=======
  public void remove() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    EventSetDescriptor tempEsd = getSourceEventSetDescriptor();
    // try to deregister the target as a listener for the source
    try {
      Method deregisterMethod = tempEsd.getRemoveListenerMethod();
      Object targetBean = getTarget().getBean();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Object[] args = new Object[1];
      args[0] = targetBean;
      deregisterMethod.invoke(getSource().getBean(), args);
      // System.err.println("Deregistering listener");
<<<<<<< HEAD
=======
=======
      Object [] args = new Object[1];
      args[0] = targetBean;
      deregisterMethod.invoke(getSource().getBean(), args);
      //      System.err.println("Deregistering listener");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    if (getTarget().getBean() instanceof BeanCommon) {
      // tell the target that this connection is going away
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ((BeanCommon) getTarget().getBean()).disconnectionNotification(
        tempEsd.getName(), getSource().getBean());
    }

    connections.remove(this);
<<<<<<< HEAD
=======
=======
      ((BeanCommon)getTarget().getBean()).
	disconnectionNotification(tempEsd.getName(),
				  getSource().getBean());
    }

    CONNECTIONS.remove(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the source BeanInstance for this connection
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a <code>BeanInstance</code> value
   */
  public BeanInstance getSource() {
    return m_source;
  }

  /**
   * Returns the target BeanInstance for this connection
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a <code>BeanInstance</code> value
   */
  public BeanInstance getTarget() {
    return m_target;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the name of the event for this conncetion
   * 
   * @return the name of the event for this connection
   */
  public String getEventName() {
    return m_eventName;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the event set descriptor for the event generated by the source for
   * this connection
   * 
   * @return an <code>EventSetDescriptor</code> value
   */
  protected EventSetDescriptor getSourceEventSetDescriptor() {
    JComponent bc = (JComponent) m_source.getBean();
    try {
      BeanInfo sourceInfo = Introspector.getBeanInfo(bc.getClass());
      if (sourceInfo == null) {
        System.err
          .println("[BeanConnection] Error getting bean info, source info is null.");
      } else {
        EventSetDescriptor[] esds = sourceInfo.getEventSetDescriptors();
        for (EventSetDescriptor esd : esds) {
          if (esd.getName().compareTo(m_eventName) == 0) {
            return esd;
          }
        }
      }
    } catch (Exception ex) {
      System.err
        .println("[BeanConnection] Problem retrieving event set descriptor");
    }
    return null;

    // return m_sourceEsd;
<<<<<<< HEAD
=======
=======
   * Returns the event set descriptor for the event generated by the source
   * for this connection
   *
   * @return an <code>EventSetDescriptor</code> value
   */
  protected EventSetDescriptor getSourceEventSetDescriptor() {
    JComponent bc = (JComponent)m_source.getBean();
     try {
       BeanInfo sourceInfo = Introspector.getBeanInfo(bc.getClass());
       if (sourceInfo == null) {
       System.err.println(Messages.getInstance().getString("BeanConnection_GetSourceEventSetDescriptor_Error_Text_First"));
       } else {
	 EventSetDescriptor [] esds = sourceInfo.getEventSetDescriptors();
	 for (int i = 0; i < esds.length; i++) {
	   if (esds[i].getName().compareTo(m_eventName) == 0) {
	     return esds[i];
	   }
	 }
       }
     } catch (Exception ex) {
       System.err.println(Messages.getInstance().getString("BeanConnection_GetSourceEventSetDescriptor_Error_Text_Second"));
     }
     return null;
     
     //    return m_sourceEsd;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
