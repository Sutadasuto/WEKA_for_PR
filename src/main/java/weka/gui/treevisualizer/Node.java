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
 *    Node.java
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

package weka.gui.treevisualizer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.io.StringReader;
import java.util.Vector;

import weka.core.Instances;

<<<<<<< HEAD
=======
=======
import java.awt.*;
import java.util.*;
import java.io.*;
import weka.core.Instances;


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
//this is a node structure that to be useful needs the Edge class as well

//note i have done an unintentional naughty thing
//getHeight() returns the pixel height of the node
//getHeight(Node,int) returns how many levels down the tree goes
//setHeight(int) is associated to the prior

/**
 * This class records all the data about a particular node for displaying.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
 * @version $Revision: 10222 $
 */
public class Node {

  /** The fill mode for the node (not in use). */
  // private int m_backstyle; //how the back color will fill NOT USED
<<<<<<< HEAD
=======
=======
 *
 * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class Node {
  
  /** The fill mode for the node (not in use). */
  private int m_backstyle;       //how the back color will fill
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The shape of the node. */
  private int m_shape;

  /** The color of the node. */
  private Color m_color;

  /** the text for the node. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final String m_label;

  /** the text broken up into lines */
  private final Vector<String> m_lines;

  // the coord of the left side .note all coords are
  // between 1-0 for scaling per Stuart's suggestion
  /** The center of the node (between 0 and 1). */
  private double m_center; // coord of the center . main x value used

  /** The top of the node (between 0 and 1). */
  private double m_top; // main y coord to go by

  /** true if this nodes descendants are visible (not in use currently). */
  private boolean m_cVisible; // whether it's descendants are visible

  /** true if this node is visible (not currently in use). */
  private boolean m_visible; // whether it's visible

  /** true if this is the top of the tree. ie has no parent */
  private boolean m_root; // whether it is anscestor to all i.e top of tree

  /**
   * An array containing references to all the parent edges (only 1 currently).
   */
  private final Vector<Edge> m_parent; // the edge to its parent edges(or itself

  // if true root)
  /** An array containing references to all the child edges. */
  private final Vector<Edge> m_children; // a vector list of edges to the nodes
                                         // children
<<<<<<< HEAD
=======
=======
  private String m_label;

  /** the text broken up into lines */
  private Vector m_lines;

  //the coord of the left side .note all coords are
  //between 1-0 for scaling per Stuart's suggestion
  /** The center of the node (between 0 and 1). */
  private double m_center;       //coord of the center . main x value used

  /** The top of the node (between 0 and 1). */
  private double m_top;          //main y coord to go by
     
  /** true if this nodes descendants are visible (not in use currently). */
  private boolean m_cVisible;   //whether it's descendants are visible

  /** true if this node is visible (not currently in use). */
  private boolean m_visible;     //whether it's visible

  /** true if this is the top of the tree. ie has no parent */
  private boolean m_root;     //whether it is anscestor to all i.e top of tree 

  /** An array containing references to all the parent edges 
   * (only 1 currently). */
  private Vector m_parent;      //the edge to its parent edges(or itself 

  //if true root)
  /** An array containing references to all the child edges. */
  private Vector m_children;     //a vector list of edges to the nodes children
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The ID string for this node (used for construction purposes) */
  private String m_refer;

  /** A String containing extra information about the node. */
  private String m_data;

  /**
<<<<<<< HEAD
   * An Instances variable generated from the data. Note that if this exists
   * then the string shall be NULL to save space.
=======
<<<<<<< HEAD
   * An Instances variable generated from the data. Note that if this exists
   * then the string shall be NULL to save space.
=======
   * An Instances variable generated from the data.
   * Note that if this exists then the string shall be NULL to save space.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private Instances m_theData;

  /**
   * This will setup all the values of the node except for its top and center.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param label The text for the node.
   * @param refer The ID string for this node.
   * @param backstyle The backstyle of this node.
   * @param shape The shape of this node.
   * @param color The color of this node.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Node(String label, String refer, int backstyle, int shape,
    Color color, String d) {
    m_label = label;
    // m_backstyle = backstyle; NOT USED
    m_shape = shape;
    m_color = color;
    m_refer = refer;

<<<<<<< HEAD
=======
=======
  public Node(String label,String refer,int backstyle,int shape,
	      Color color,String d) {
    m_label = label;
    m_backstyle = backstyle;
    m_shape = shape;
    m_color = color;
    m_refer = refer;
   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_center = 0;
    m_top = 0;

    m_cVisible = true;
    m_visible = true;
    m_root = false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_parent = new Vector<Edge>(1, 1);
    m_children = new Vector<Edge>(20, 10);
    m_lines = new Vector<String>(4, 2);
    breakupLabel();
    m_data = d;
    m_theData = null;
  }

  /**
   * This will return the Instances object related to this node. If it has not
   * been allocated then that will be done also.
   * 
<<<<<<< HEAD
=======
=======
    m_parent = new Vector(1,1);
    m_children = new Vector(20,10);
    m_lines = new Vector(4,2);
    breakupLabel();
    m_data = d;
    m_theData = null;
  } 	
  
  /**
   * This will return the Instances object related to this node.
   * If it has not been allocated then that will be done also.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return The Instances object.
   */
  public Instances getInstances() {
    if (m_theData == null && m_data != null) {
      try {
<<<<<<< HEAD
        m_theData = new Instances(new StringReader(m_data));
      } catch (Exception e) {
        System.out.println("Error : " + e);
=======
<<<<<<< HEAD
        m_theData = new Instances(new StringReader(m_data));
      } catch (Exception e) {
        System.out.println("Error : " + e);
=======
	m_theData = new Instances(new StringReader(m_data));
      } catch(Exception e) {
	System.out.println(Messages.getInstance().getString("Node_GetInstances_Exception_Text") + e);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_data = null;
    }
    return m_theData;
  }

  /**
   * Get If this node's childs are visible.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return True if the childs are visible.
   */
  public boolean getCVisible() {
    return m_cVisible;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Recursively goes through the tree and sets all the children and the parent
   * to visible.
   * 
<<<<<<< HEAD
=======
=======
  /** 
   * Recursively goes through the tree and sets all the children and the 
   * parent to visible.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current node to set visible.
   */
  private void childVis(Node r) {
    Edge e;
    r.setVisible(true);
    if (r.getCVisible()) {
<<<<<<< HEAD
      for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
        childVis(e.getTarget());
=======
<<<<<<< HEAD
      for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
        childVis(e.getTarget());
=======
      for (int noa = 0;(e = r.getChild(noa)) != null;noa++) {
	childVis(e.getTarget());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Sets all the children of this node either to visible or invisible
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param v True if the children are to be visible
   */
  public void setCVisible(boolean v) {
    m_cVisible = v;
    if (v) {
      childVis(this);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else if (!v) {
      childInv(this);
    }
  }

  /**
   * Recursively goes through the tree and sets all the children to invisible,
   * Not the parent though.
   * 
   * @param r The current node from whom the children are gonna be set
   *          invisible.
<<<<<<< HEAD
=======
=======
    }
    else if (!v) {
      childInv(this);
    }
  }
  
  /**
   * Recursively goes through the tree and sets all the children to invisible,
   * Not the parent though.
   *
   * @param r The current node from whom the children are gonna be set 
   * invisible.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void childInv(Node r) {
    Edge e;
    Node s;
<<<<<<< HEAD
    for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
=======
<<<<<<< HEAD
    for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
=======
    for (int noa = 0;(e = r.getChild(noa)) != null;noa++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      s = e.getTarget();
      s.setVisible(false);
      childInv(s);
    }
  }

  /**
   * Get the value of refer.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return Value of refer.
   */
  public String getRefer() {

    return m_refer;
  }

  /**
   * Set the value of refer.
   * 
   * @param v Value to assign to refer.
   */
  public void setRefer(String v) {

    m_refer = v;
  }

  /**
   * Get the value of shape.
   * 
   * @return Value of shape.
   */
  public int getShape() {

    return m_shape;
  }

  /**
   * Set the value of shape.
   * 
   * @param v Value to assign to shape.
   */
  public void setShape(int v) {

    m_shape = v;
  }

  /**
   * Get the value of color.
   * 
   * @return Value of color.
   */
  public Color getColor() {

    return m_color;
  }

  /**
   * Set the value of color.
   * 
   * @param v Value to assign to color.
   */
  public void setColor(Color v) {

    m_color = v;
  }

  /**
   * Get the value of label.
   * 
   * @return Value of label.
   */
  public String getLabel() {

    return m_label;
  }

  /**
   * This Will break the node's text up into lines.
   * 
   */
  private void breakupLabel() {
    int prev = 0, noa;
    for (noa = 0; noa < m_label.length(); noa++) {
      if (m_label.charAt(noa) == '\n') {
        m_lines.addElement(m_label.substring(prev, noa));
        prev = noa + 1;
      }
    }
    m_lines.addElement(m_label.substring(prev, noa));

  }

  /**
   * This will return the width and height of the rectangle that the text will
   * fit into.
   * 
<<<<<<< HEAD
=======
=======
   *
   * @return Value of refer.
   */
  public String getRefer() {
    
    return m_refer;
  }
  
  /**
   * Set the value of refer.
   *
   * @param v  Value to assign to refer.
   */
  public void setRefer(String v) {
    
    m_refer = v;
  }
  
  
  
  /**
   * Get the value of shape.
   *
   * @return Value of shape.
   */
  public int getShape() {
    
    return m_shape;
  }
  
  /**
   * Set the value of shape.
   *
   * @param v  Value to assign to shape.
   */
  public void setShape(int v) {
    
    m_shape = v;
  }
  
  
  /**
   * Get the value of color.
   *
   * @return Value of color.
   */
  public Color getColor() {
    
    return m_color;
  }
  
  /**
   * Set the value of color.
   *
   * @param v  Value to assign to color.
   */
  public void setColor(Color v) {
    
    m_color = v;
  }
  
  
  /**
   * Get the value of label.
   *
   * @return Value of label.
   */
  public String getLabel() {
    
    return m_label;
  }
  
  /**
   * This Will break the node's text up into lines.
   *
   */
  private void breakupLabel() {
    int prev = 0,noa;
    for (noa = 0;noa < m_label.length();noa++) {
      if (m_label.charAt(noa) == '\n') {
	m_lines.addElement(m_label.substring(prev,noa));
	prev = noa+1;
      }
    }
    m_lines.addElement(m_label.substring(prev,noa));
    
  }
  
  /**
   * This will return the width and height of the rectangle that the text 
   * will fit into.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param f The size info for the Font.
   * @return A Dimension containing the size of the text.
   */
  public Dimension stringSize(FontMetrics f) {
    Dimension d = new Dimension();
    int old = 0;
    String s;
    int noa = 0;
    while ((s = getLine(noa)) != null) {
      noa++;
      old = f.stringWidth(s);
<<<<<<< HEAD

      if (old > d.width) {
        d.width = old;
=======
<<<<<<< HEAD

      if (old > d.width) {
        d.width = old;
=======
      
      if (old > d.width) {
	d.width = old;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    d.height = noa * f.getHeight();
    return d;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the text String for the specfied line.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param n The line wanted.
   * @return The String corresponding to that line.
   */
  public String getLine(int n) {
    if (n < m_lines.size()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return m_lines.elementAt(n);
    } else {
      return null;
    }
  }

  /**
   * Get the value of center.
   * 
   * @return Value of center.
   */
  public double getCenter() {

    return m_center;
  }

  /**
   * Set the value of center.
   * 
   * @param v Value to assign to center.
   */
  public void setCenter(double v) {

    m_center = v;
  }

  /**
   * Will increase or decrease the postion of center.
   * 
<<<<<<< HEAD
=======
=======
      return (String)m_lines.elementAt(n);
    }
    else {
      return null;
    }
  }
  
  
  

  
 
  

  
  
  /**
   * Get the value of center.
   *
   * @return Value of center.
   */
  public double getCenter() {
    
    return m_center;
  }
  
  /**
   * Set the value of center.
   *
   * @param v  Value to assign to center.
   */
  public void setCenter(double v) {
    
    m_center = v;
  }
  
  /**
   * Will increase or decrease the postion of center.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param v The amount to increase or decrease center by.
   */
  public void adjustCenter(double v) {
    m_center += v;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Get the value of top.
   * 
   * @return Value of top.
   */
  public double getTop() {

    return m_top;
  }

  /**
   * Set the value of top.
   * 
   * @param v Value to assign to top.
   */
  public void setTop(double v) {

    m_top = v;
  }

  /**
   * Get the value of visible.
   * 
   * @return Value of visible.
   */
  public boolean getVisible() {

    return m_visible;
  }

  /**
   * Set the value of visible.
   * 
   * @param v Value to assign to visible.
   */
  private void setVisible(boolean v) {

    m_visible = v;
  }

  /**
   * Get the value of root.
   * 
   * @return True if has no parents.
   */
  public boolean getRoot() {

    return m_root;
  }

  /**
   * Set the value of root.
   * 
   * @param v Value to assign to root.
   */
  public void setRoot(boolean v) {

    m_root = v;
  }

  /**
   * Get the parent edge.
   * 
<<<<<<< HEAD
=======
=======
  
  
  /**
   * Get the value of top.
   *
   * @return Value of top.
   */
  public double getTop() {
    
    return m_top;
  }
  
  /**
   * Set the value of top.
   *
   * @param v  Value to assign to top.
   */
  public void setTop(double v) {
    
    m_top = v;
  }
  

  
  
  
  /**
   * Get the value of visible.
   *
   * @return Value of visible.
   */
  public boolean getVisible() {
    
    return m_visible;
  }
  
  /**
   * Set the value of visible.
   *
   * @param v  Value to assign to visible.
   */
  private void setVisible(boolean v) {
    
    m_visible = v;
  }
  
  
  
  
  /**
   * Get the value of root.
   *
   * @return True if has no parents.
   */
  public boolean getRoot() {
    
    return m_root;
  }
  
  /**
   * Set the value of root.
   *
   * @param v  Value to assign to root.
   */
  public void setRoot(boolean v) {
    
    m_root = v;
  }
  
  
  
  /**
   * Get the parent edge.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param i The parent number to get.
   * @return The parent edge or NULL if it doesn't exist.
   */
  public Edge getParent(int i) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (i < m_parent.size()) {
      return m_parent.elementAt(i);
    } else {
<<<<<<< HEAD
=======
=======
    
    if (i < m_parent.size()) {
      return (Edge)m_parent.elementAt(i);
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return null;
    }

  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Set the value of parent.
   * 
   * @param v Value to assign to parent.
   */
  public void setParent(Edge v) {

    m_parent.addElement(v);
  }

  /**
   * Get the Edge for the child number 'i'.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Set the value of parent.
   *
   * @param v  Value to assign to parent.
   */
  public void setParent(Edge v) {
    
    m_parent.addElement(v);
  }
  
  
  
  /**
   * Get the Edge for the child number 'i'.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param i The child number to get.
   * @return The child Edge or NULL if it doesn't exist.
   */
  public Edge getChild(int i) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (i < m_children.size()) {
      return m_children.elementAt(i);
    } else {
      return null;
    }
  }

  /**
   * Set the value of children.
   * 
   * @param v Value to assign to children.
<<<<<<< HEAD
=======
=======
    
    if (i < m_children.size()) {
      return (Edge)m_children.elementAt(i);
    }
    else {
      return null;
    }
  }
  
  /**
   * Set the value of children.
   *
   * @param v  Value to assign to children.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void addChild(Edge v) {
    m_children.addElement(v);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Recursively finds the number of visible groups of siblings there are.
   * 
<<<<<<< HEAD
=======
=======
  

  /**
   * Recursively finds the number of visible groups of siblings there are.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current Node upto.
   * @param n The current number of groups there are.
   * @return The number of groups found so far.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int getGCount(Node r, int n) {
    Edge e;

    if (r.getChild(0) != null && r.getCVisible()) {
      n++;
      for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
        n = getGCount(e.getTarget(), n);
<<<<<<< HEAD
=======
=======
  public static int getGCount(Node r,int n) {
    Edge e;
    
    if (r.getChild(0) != null && r.getCVisible()) {
      n++;
      for (int noa = 0;(e = r.getChild(noa)) != null;noa++) {
	n = getGCount(e.getTarget(),n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return n;
  }

  /**
   * Recursively finds the total number of groups of siblings there are.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current Node upto.
   * @param n The current number of groups there are.
   * @return The number of groups found so far.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int getTotalGCount(Node r, int n) {
    Edge e;

    if (r.getChild(0) != null) {
      n++;
      for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
        n = getTotalGCount(e.getTarget(), n);
<<<<<<< HEAD
=======
=======
  public static int getTotalGCount(Node r,int n) {
    Edge e;
    
    if (r.getChild(0) != null) {
      n++;
      for (int noa = 0;(e = r.getChild(noa)) != null;noa++) {
	n = getTotalGCount(e.getTarget(),n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return n;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Recursively finds the number of visible nodes there are (this may
   * accidentally count some of the invis nodes).
   * 
<<<<<<< HEAD
=======
=======
  




  /**
   * Recursively finds the number of visible nodes there are (this may 
   * accidentally count some of the invis nodes).
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current Node upto.
   * @param n The current number nodes there are.
   * @return The number of nodes found so far.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int getCount(Node r, int n) {
    Edge e;
    n++;
    for (int noa = 0; (e = r.getChild(noa)) != null && r.getCVisible(); noa++) {
      n = getCount(e.getTarget(), n);
    }
    return n;

<<<<<<< HEAD
=======
=======
  public static int getCount(Node r,int n) {
    Edge e;
    n++;
    for (int noa = 0;(e = r.getChild(noa)) != null && r.getCVisible();noa++) {
      n = getCount(e.getTarget(),n);
    }
    return n;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Recursively finds the total number of nodes there are.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current Node upto.
   * @param n The current number nodes there are.
   * @return The number of nodes found so far.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int getTotalCount(Node r, int n) {
    Edge e;
    n++;
    for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
      n = getTotalCount(e.getTarget(), n);
    }
    return n;
  }

  /**
   * Recursively finds the number of visible levels there are.
   * 
<<<<<<< HEAD
=======
=======
  public static int getTotalCount(Node r,int n) {
    Edge e;
    n++;
    for (int noa = 0;(e = r.getChild(noa)) != null;noa++) {
      n = getTotalCount(e.getTarget(),n);
    }
    return n;
  }
  
  
  /**
   * Recursively finds the number of visible levels there are.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current Node upto.
   * @param l The curent level.
   * @return The max number of levels found so far.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int getHeight(Node r, int l) {
    l++;
    int lev = l, temp = 0;
    Edge e;

    for (int noa = 0; (e = r.getChild(noa)) != null && r.getCVisible(); noa++) {
      temp = getHeight(e.getTarget(), l);
      if (temp > lev) {
        lev = temp;
      }

    }

    return lev;

<<<<<<< HEAD
=======
=======
  public static int getHeight(Node r,int l) {
    l++;
    int lev = l,temp = 0;
    Edge e;
    
    for (int noa = 0;(e = r.getChild(noa)) != null && r.getCVisible();noa++) {
      temp = getHeight(e.getTarget(),l);
      if (temp > lev) {
	lev = temp;
      }
      
    }
    
    return lev;


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Recursively finds the total number of levels there are.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r The current Node upto.
   * @param l The curent level.
   * @return The max number of levels found so far.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int getTotalHeight(Node r, int l) {
    l++;
    int lev = l, temp = 0;
    Edge e;

    for (int noa = 0; (e = r.getChild(noa)) != null; noa++) {
      temp = getTotalHeight(e.getTarget(), l);
      if (temp > lev) {
        lev = temp;
<<<<<<< HEAD
=======
=======
  public static int getTotalHeight(Node r,int l) {
    l++;
    int lev = l,temp = 0;
    Edge e;
    
    for (int noa = 0;(e = r.getChild(noa)) != null;noa++) {
      temp = getTotalHeight(e.getTarget(),l);
      if (temp > lev) {
	lev = temp;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return lev;
  }
}
