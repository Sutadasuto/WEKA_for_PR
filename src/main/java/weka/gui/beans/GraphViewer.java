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
 *    GraphViewer.java
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextChildSupport;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.*;

import weka.core.Drawable;
import weka.core.Utils;
import weka.gui.ResultHistoryPanel;
import weka.gui.graphvisualizer.BIFFormatException;
import weka.gui.graphvisualizer.GraphVisualizer;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

/**
 * A bean encapsulating weka.gui.treevisualize.TreeVisualizer
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 14497 $
 */
public class GraphViewer extends JPanel implements Visible, GraphListener,
  UserRequestAcceptor, Serializable, BeanContextChild {
<<<<<<< HEAD
=======
=======
import weka.core.Drawable;
import weka.core.FastVector;
import weka.gui.ResultHistoryPanel;
import weka.gui.graphvisualizer.BIFFormatException;
import weka.gui.graphvisualizer.GraphVisualizer;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextChildSupport;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A bean encapsulating weka.gui.treevisualize.TreeVisualizer
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 7059 $
 */
public class GraphViewer 
  extends JPanel
  implements Visible, GraphListener,
	     UserRequestAcceptor, 
             Serializable, BeanContextChild {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -5183121972114900617L;

  protected BeanVisual m_visual;

  private transient JFrame m_resultsFrame = null;

  protected transient ResultHistoryPanel m_history;

  /**
   * BeanContex that this bean might be contained within
   */
  protected transient BeanContext m_beanContext = null;

  /**
   * BeanContextChild support
   */
<<<<<<< HEAD
  protected BeanContextChildSupport m_bcSupport = new BeanContextChildSupport(
    this);
=======
<<<<<<< HEAD
  protected BeanContextChildSupport m_bcSupport = new BeanContextChildSupport(
    this);
=======
  protected BeanContextChildSupport m_bcSupport = 
    new BeanContextChildSupport(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * True if this bean's appearance is the design mode appearance
   */
  protected boolean m_design;

  public GraphViewer() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /*
     * setUpResultHistory(); setLayout(new BorderLayout()); add(m_visual,
     * BorderLayout.CENTER);
     */

    if (!GraphicsEnvironment.isHeadless()) {
<<<<<<< HEAD
=======
=======
    /*    setUpResultHistory();
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER); */

    java.awt.GraphicsEnvironment ge = 
      java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment(); 
    if (!ge.isHeadless()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      appearanceFinal();
    }
  }

  protected void appearanceDesign() {
    setUpResultHistory();
    removeAll();
<<<<<<< HEAD
    m_visual = new BeanVisual("GraphViewer", BeanVisual.ICON_PATH
      + "DefaultGraph.gif", BeanVisual.ICON_PATH + "DefaultGraph_animated.gif");
=======
<<<<<<< HEAD
    m_visual = new BeanVisual("GraphViewer", BeanVisual.ICON_PATH
      + "DefaultGraph.gif", BeanVisual.ICON_PATH + "DefaultGraph_animated.gif");
=======
    m_visual = 
      new BeanVisual("GraphViewer", 
                     BeanVisual.ICON_PATH+"DefaultGraph.gif",
		   BeanVisual.ICON_PATH+"DefaultGraph_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
  }

  protected void appearanceFinal() {
    removeAll();
    setLayout(new BorderLayout());
    setUpFinal();
  }

  protected void setUpFinal() {
    setUpResultHistory();
    add(m_history, BorderLayout.CENTER);
  }

  /**
   * Global info for this bean
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return "Graphically visualize trees or graphs produced by classifiers/clusterers.";
<<<<<<< HEAD
=======
=======
   *
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return Messages.getInstance().getString("GraphViewer_GlobalInfo_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  private void setUpResultHistory() {
    if (m_history == null) {
      m_history = new ResultHistoryPanel(null);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_history.setBorder(BorderFactory.createTitledBorder("Graph list"));
    m_history.setHandleRightClicks(false);
    m_history.getList().addMouseListener(
      new ResultHistoryPanel.RMouseAdapter() {
        /** for serialization */
        private static final long serialVersionUID = -4984130887963944249L;

        @Override
        public void mouseClicked(MouseEvent e) {
          int index = m_history.getList().locationToIndex(e.getPoint());
          if (index != -1) {
            String name = m_history.getNameAtIndex(index);
            doPopup(name);
          }
        }
      });
<<<<<<< HEAD
=======
=======
    m_history.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("GraphViewer_SetUpResultHistory_History_SetBorder_BorderFactory_CreateTitledBorder_Text")));
    m_history.setHandleRightClicks(false);
    m_history.getList().
      addMouseListener(new ResultHistoryPanel.RMouseAdapter() {
	  /** for serialization */
	  private static final long serialVersionUID = -4984130887963944249L;

	  public void mouseClicked(MouseEvent e) {
	    int index = m_history.getList().locationToIndex(e.getPoint());
	    if (index != -1) {
	      String name = m_history.getNameAtIndex(index);
	      doPopup(name);
	    }
	  }
	});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set a bean context for this bean
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param bc a <code>BeanContext</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param bc a <code>BeanContext</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setBeanContext(BeanContext bc) {
    m_beanContext = bc;
    m_design = m_beanContext.isDesignTime();
    if (m_design) {
      appearanceDesign();
    } else {
<<<<<<< HEAD
      if (!GraphicsEnvironment.isHeadless()) {
=======
<<<<<<< HEAD
      if (!GraphicsEnvironment.isHeadless()) {
=======
      java.awt.GraphicsEnvironment ge = 
        java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment(); 
      if (!ge.isHeadless()){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        appearanceFinal();
      }
    }
  }

  /**
   * Return the bean context (if any) that this bean is embedded in
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a <code>BeanContext</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return a <code>BeanContext</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public BeanContext getBeanContext() {
    return m_beanContext;
  }

  /**
   * Add a vetoable change listener to this bean
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param name the name of the property of interest
   * @param vcl a <code>VetoableChangeListener</code> value
   */
  @Override
  public void addVetoableChangeListener(String name, VetoableChangeListener vcl) {
    m_bcSupport.addVetoableChangeListener(name, vcl);
  }

  /**
   * Remove a vetoable change listener from this bean
   * 
   * @param name the name of the property of interest
   * @param vcl a <code>VetoableChangeListener</code> value
   */
  @Override
  public void removeVetoableChangeListener(String name,
    VetoableChangeListener vcl) {
<<<<<<< HEAD
=======
=======
   *
   * @param name the name of the property of interest
   * @param vcl a <code>VetoableChangeListener</code> value
   */
  public void addVetoableChangeListener(String name,
				       VetoableChangeListener vcl) {
    m_bcSupport.addVetoableChangeListener(name, vcl);
  }
  
  /**
   * Remove a vetoable change listener from this bean
   *
   * @param name the name of the property of interest
   * @param vcl a <code>VetoableChangeListener</code> value
   */
  public void removeVetoableChangeListener(String name,
					   VetoableChangeListener vcl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_bcSupport.removeVetoableChangeListener(name, vcl);
  }

  /**
   * Accept a graph
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param e a <code>GraphEvent</code> value
   */
  @Override
  public synchronized void acceptGraph(GraphEvent e) {

    ArrayList<Object> graphInfo = new ArrayList<Object>();
<<<<<<< HEAD
=======
=======
   *
   * @param e a <code>GraphEvent</code> value
   */
  public synchronized void acceptGraph(GraphEvent e) {

    FastVector graphInfo = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_history == null) {
      setUpResultHistory();
    }
    String name = (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());

    name += e.getGraphTitle();
<<<<<<< HEAD
    graphInfo.add(new Integer(e.getGraphType()));
    graphInfo.add(e.getGraphString());
=======
<<<<<<< HEAD
    graphInfo.add(new Integer(e.getGraphType()));
    graphInfo.add(e.getGraphString());
=======
    graphInfo.addElement(new Integer(e.getGraphType()));
    graphInfo.addElement(e.getGraphString());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_history.addResult(name, new StringBuffer());
    m_history.addObject(name, graphInfo);
  }

  /**
   * Set the visual appearance of this bean
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newVisual a <code>BeanVisual</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param newVisual a <code>BeanVisual</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setVisual(BeanVisual newVisual) {
    m_visual = newVisual;
  }

  /**
   * Get the visual appearance of this bean
<<<<<<< HEAD
   * 
   */
  @Override
=======
<<<<<<< HEAD
   * 
   */
  @Override
=======
   *
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public BeanVisual getVisual() {
    return m_visual;
  }

  /**
   * Use the default visual appearance
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   */
  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "DefaultGraph.gif",
      BeanVisual.ICON_PATH + "DefaultGraph_animated.gif");
<<<<<<< HEAD
=======
=======
   *
   */
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"DefaultGraph.gif",
		       BeanVisual.ICON_PATH+"DefaultGraph_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Popup a result list from which the user can select a graph to view
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void showResults() {
    if (m_resultsFrame == null) {
      if (m_history == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        setUpResultHistory();
      }
      m_resultsFrame = Utils.getWekaJFrame("Graph Viewer", m_visual);
      m_resultsFrame.getContentPane().setLayout(new BorderLayout());
      m_resultsFrame.getContentPane().add(m_history, BorderLayout.CENTER);
      m_resultsFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          m_resultsFrame.dispose();
          m_resultsFrame = null;
        }
      });
      m_resultsFrame.pack();
      m_resultsFrame.setLocationRelativeTo(SwingUtilities.getWindowAncestor(m_visual));
<<<<<<< HEAD
=======
=======
	setUpResultHistory();
      }
      m_resultsFrame = new JFrame(Messages.getInstance().getString("GraphViewer_ShowResult_ResultsFrame_JFrame_Text"));
      m_resultsFrame.getContentPane().setLayout(new BorderLayout());
      m_resultsFrame.getContentPane().add(m_history, BorderLayout.CENTER);
      m_resultsFrame.addWindowListener(new java.awt.event.WindowAdapter() {
	  public void windowClosing(java.awt.event.WindowEvent e) {
	    m_resultsFrame.dispose();
	    m_resultsFrame = null;
	  }
	});
      m_resultsFrame.pack();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_resultsFrame.setVisible(true);
    } else {
      m_resultsFrame.toFront();
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  private void doPopup(String name) {

    ArrayList<Object> graph;
    String grphString;
    int grphType;

    graph = (ArrayList<Object>) m_history.getNamedObject(name);
    grphType = ((Integer) graph.get(0)).intValue();
    grphString = (String) graph.get(graph.size() - 1);

    if (grphType == Drawable.TREE) {
      final javax.swing.JFrame jf = Utils.getWekaJFrame(
        "Weka Classifier Tree Visualizer: " + name, m_resultsFrame);
      jf.getContentPane().setLayout(new BorderLayout());
      TreeVisualizer tv = new TreeVisualizer(null, grphString, new PlaceNode2());
      jf.getContentPane().add(tv, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });
      jf.pack();
      jf.setSize(500, 400);
      jf.setLocationRelativeTo(m_resultsFrame);
      jf.setVisible(true);
    }
    if (grphType == Drawable.BayesNet) {
      final javax.swing.JFrame jf = Utils.getWekaJFrame(
        "Weka Classifier Graph Visualizer: " + name, m_resultsFrame);
      jf.getContentPane().setLayout(new BorderLayout());
      GraphVisualizer gv = new GraphVisualizer();
      try {
        gv.readBIF(grphString);
      } catch (BIFFormatException be) {
        System.err.println("unable to visualize BayesNet");
        be.printStackTrace();
<<<<<<< HEAD
=======
=======
  private void doPopup(String name) {

    FastVector graph;  
    String grphString;
    int grphType;

    graph = (FastVector)m_history.getNamedObject(name);
    grphType = ((Integer)graph.firstElement()).intValue();
    grphString = (String)graph.lastElement();

    if(grphType == Drawable.TREE){
        final javax.swing.JFrame jf = 
            new javax.swing.JFrame(Messages.getInstance().getString("GraphViewer_DoPopup_Jf_JFrame_Text_First") + name);
        jf.setSize(500,400);
        jf.getContentPane().setLayout(new BorderLayout());
        TreeVisualizer tv = 
            new TreeVisualizer(null,
			 grphString,
			 new PlaceNode2());
        jf.getContentPane().add(tv, BorderLayout.CENTER);
        jf.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
            jf.dispose();
            }
        });

        jf.setVisible(true);
    }
    if(grphType == Drawable.BayesNet) {
      final javax.swing.JFrame jf = 
	new javax.swing.JFrame(Messages.getInstance().getString("GraphViewer_DoPopup_Jf_JFrame_Text_Second") + name);
      jf.setSize(500,400);
      jf.getContentPane().setLayout(new BorderLayout());
      GraphVisualizer gv = 
	new GraphVisualizer();
      try { 
	gv.readBIF(grphString);
      }
      catch (BIFFormatException be) { 
	System.err.println(Messages.getInstance().getString("GraphViewer_DoPopup_Error_Text")); be.printStackTrace(); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      gv.layoutGraph();
      jf.getContentPane().add(gv, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
        }
      });
      jf.pack();
      jf.setSize(500, 400);
      jf.setLocationRelativeTo(m_resultsFrame);
<<<<<<< HEAD
=======
=======
	  public void windowClosing(java.awt.event.WindowEvent e) {
            jf.dispose();
	  }
        });
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setVisible(true);
    }
  }

  /**
   * Return an enumeration of user requests
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an <code>Enumeration</code> value
   */
  @Override
  public Enumeration<String> enumerateRequests() {
    Vector<String> newVector = new Vector<String>(0);
<<<<<<< HEAD
=======
=======
   *
   * @return an <code>Enumeration</code> value
   */
  public Enumeration enumerateRequests() {
    Vector newVector = new Vector(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    newVector.addElement("Show results");

    return newVector.elements();
  }

  /**
   * Perform the named request
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param request a <code>String</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
  public void performRequest(String request) {
    if (request.compareTo("Show results") == 0) {
      showResults();
    } else {
      throw new IllegalArgumentException(request
        + " not supported (GraphViewer)");
<<<<<<< HEAD
=======
=======
   *
   * @param request a <code>String</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  public void performRequest(String request) 
    {
    if (request.compareTo("Show results") == 0) {
      showResults();
    } else {
      throw new 
	IllegalArgumentException(request
		    + Messages.getInstance().getString("GraphViewer_PerformRequest_IllegalArgumentException_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }
}
