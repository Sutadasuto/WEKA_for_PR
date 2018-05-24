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
 *    Clusterer.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.awt.BorderLayout;
import java.beans.EventSetDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
=======
import weka.clusterers.EM;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.Logger;
import weka.gui.ExtensionFileFilter;

import java.awt.BorderLayout;
import java.beans.EventSetDescriptor;
import java.io.*;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

<<<<<<< HEAD
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import weka.clusterers.EM;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.ExtensionFileFilter;
import weka.gui.Logger;

/**
 * Bean that wraps around weka.clusterers
 * 
 * @author <a href="mailto:mutter@cs.waikato.ac.nz">Stefan Mutter</a>
 * @version $Revision: 10220 $
=======
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

import javax.swing.JPanel;

/**
 * Bean that wraps around weka.clusterers
 *
 * @author <a href="mailto:mutter@cs.waikato.ac.nz">Stefan Mutter</a>
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @see JPanel
 * @see BeanCommon
 * @see Visible
 * @see WekaWrapper
 * @see Serializable
 * @see UserRequestAcceptor
 * @see TrainingSetListener
 * @see TestSetListener
 */
<<<<<<< HEAD
public class Clusterer extends JPanel implements BeanCommon, Visible,
  WekaWrapper, EventConstraints, UserRequestAcceptor, TrainingSetListener,
  TestSetListener, ConfigurationProducer {
=======
public class Clusterer
  extends JPanel
  implements BeanCommon, Visible, WekaWrapper, EventConstraints, 
             UserRequestAcceptor, TrainingSetListener, TestSetListener{
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 7729795159836843810L;

<<<<<<< HEAD
  protected BeanVisual m_visual = new BeanVisual("Clusterer",
    BeanVisual.ICON_PATH + "EM.gif", BeanVisual.ICON_PATH + "EM_animated.gif");
=======
  protected BeanVisual m_visual = 
    new BeanVisual("Clusterer",
		   BeanVisual.ICON_PATH+"EM.gif",
		   BeanVisual.ICON_PATH+"EM_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  private static int IDLE = 0;
  private static int BUILDING_MODEL = 1;
  private static int CLUSTERING = 2;

  private int m_state = IDLE;

  private Thread m_buildThread = null;

  /**
   * Global info for the wrapped classifier (if it exists).
   */
  protected String m_globalInfo;

  /**
   * Objects talking to us
   */
<<<<<<< HEAD
  private final Hashtable<String, Object> m_listenees = new Hashtable<String, Object>();
=======
  private Hashtable m_listenees = new Hashtable();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for batch clusterer events
   */
<<<<<<< HEAD
  private final Vector<BatchClustererListener> m_batchClustererListeners = new Vector<BatchClustererListener>();
=======
  private Vector m_batchClustererListeners = new Vector();

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for graph events
   */
<<<<<<< HEAD
  private final Vector<GraphListener> m_graphListeners = new Vector<GraphListener>();
=======
  private Vector m_graphListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for text events
   */
<<<<<<< HEAD
  private final Vector<TextListener> m_textListeners = new Vector<TextListener>();

  /**
   * Holds training instances for batch training.
=======
  private Vector m_textListeners = new Vector();

  /**
   * Holds training instances for batch training. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  private Instances m_trainingSet;
  private transient Instances m_testingSet;
  private weka.clusterers.Clusterer m_Clusterer = new EM();
<<<<<<< HEAD

  private transient Logger m_log = null;

  @SuppressWarnings("unused")
  private final Double m_dummy = new Double(0.0);
=======
  

  private transient Logger m_log = null;

  private Double m_dummy = new Double(0.0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  private transient JFileChooser m_fileChooser = null;

  /**
   * Global info (if it exists) for the wrapped classifier
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the global info
   */
  public String globalInfo() {
    return m_globalInfo;
  }

  /**
   * Creates a new <code>Clusterer</code> instance.
   */
  public Clusterer() {
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
    setClusterer(m_Clusterer);
  }

  /**
   * Set a custom (descriptive) name for this bean
   * 
   * @param name the name to use
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setCustomName(String name) {
    m_visual.setText(name);
  }

  /**
   * Get the custom (descriptive) name for this bean (if one has been set)
   * 
   * @return the custom name (or the default name)
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String getCustomName() {
    return m_visual.getText();
  }

  /**
   * Set the clusterer for this wrapper
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param c a <code>weka.clusterers.Clusterer</code> value
   */
  public void setClusterer(weka.clusterers.Clusterer c) {
    boolean loadImages = true;
<<<<<<< HEAD
    if (c.getClass().getName().compareTo(m_Clusterer.getClass().getName()) == 0) {
=======
    if (c.getClass().getName().
	compareTo(m_Clusterer.getClass().getName()) == 0) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      loadImages = false;
    } else {
      // clusterer has changed so any batch training status is now
      // invalid
      m_trainingSet = null;
    }
    m_Clusterer = c;
    String clustererName = c.getClass().toString();
<<<<<<< HEAD
    clustererName = clustererName.substring(clustererName.lastIndexOf('.') + 1,
      clustererName.length());
    if (loadImages) {
      if (!m_visual.loadIcons(BeanVisual.ICON_PATH + clustererName + ".gif",
        BeanVisual.ICON_PATH + clustererName + "_animated.gif")) {
        useDefaultVisual();
=======
    clustererName = clustererName.substring(clustererName.
					      lastIndexOf('.')+1, 
					      clustererName.length());
    if (loadImages) {
      if (!m_visual.loadIcons(BeanVisual.ICON_PATH+clustererName+".gif",
		       BeanVisual.ICON_PATH+clustererName+"_animated.gif")) {
	useDefaultVisual();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    m_visual.setText(clustererName);

    // get global info
    m_globalInfo = KnowledgeFlowApp.getGlobalInfo(m_Clusterer);
  }

<<<<<<< HEAD
  /**
   * Returns true if this clusterer has an incoming connection that is a batch
   * set of instances
   * 
=======

  /**
   * Returns true if this clusterer has an incoming connection that is
   * a batch set of instances
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a <code>boolean</code> value
   */
  public boolean hasIncomingBatchInstances() {
    if (m_listenees.size() == 0) {
      return false;
    }
<<<<<<< HEAD
    if (m_listenees.containsKey("trainingSet")
      || m_listenees.containsKey("testSet")
      || m_listenees.containsKey("dataSet")) {
=======
    if (m_listenees.containsKey("trainingSet") ||
	m_listenees.containsKey("testSet") ||
        m_listenees.containsKey("dataSet")) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return true;
    }
    return false;
  }

  /**
   * Get the clusterer currently set for this wrapper
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a <code>weka.clusterers.Clusterer</code> value
   */
  public weka.clusterers.Clusterer getClusterer() {
    return m_Clusterer;
  }

  /**
   * Sets the algorithm (clusterer) for this bean
<<<<<<< HEAD
   * 
   * @param algorithm an <code>Object</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
  public void setWrappedAlgorithm(Object algorithm) {

    if (!(algorithm instanceof weka.clusterers.Clusterer)) {
      throw new IllegalArgumentException(algorithm.getClass() + " : incorrect "
        + "type of algorithm (Clusterer)");
    }
    setClusterer((weka.clusterers.Clusterer) algorithm);
=======
   *
   * @param algorithm an <code>Object</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  public void setWrappedAlgorithm(Object algorithm) 
    {

    if (!(algorithm instanceof weka.clusterers.Clusterer)) { 
      throw new IllegalArgumentException(algorithm.getClass() + Messages.getInstance().getString("Clusterer_SetWrappedAlgorithm_IllegalArgumentException_Text"));
    }
    setClusterer((weka.clusterers.Clusterer)algorithm);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the wrapped clusterer
<<<<<<< HEAD
   * 
   * @return an <code>Object</code> value
   */
  @Override
=======
   *
   * @return an <code>Object</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Object getWrappedAlgorithm() {
    return getClusterer();
  }

<<<<<<< HEAD
  /**
   * Accepts a training set and builds batch clusterer
   * 
   * @param e a <code>TrainingSetEvent</code> value
   */
  @Override
=======

  /**
   * Accepts a training set and builds batch clusterer
   *
   * @param e a <code>TrainingSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void acceptTrainingSet(final TrainingSetEvent e) {
    if (e.isStructureOnly()) {
      // no need to build a clusterer, instead just generate a dummy
      // BatchClustererEvent in order to pass on instance structure to
<<<<<<< HEAD
      // any listeners
      BatchClustererEvent ce = new BatchClustererEvent(this, m_Clusterer,
        new DataSetEvent(this, e.getTrainingSet()), e.getSetNumber(),
        e.getMaxSetNumber(), 1);
=======
      // any listeners 
      BatchClustererEvent ce = 
	new BatchClustererEvent(this, m_Clusterer, 
				 new DataSetEvent(this, e.getTrainingSet()),
				 e.getSetNumber(), e.getMaxSetNumber(),1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      notifyBatchClustererListeners(ce);
      return;
    }
    if (m_buildThread == null) {
      try {
<<<<<<< HEAD
        if (m_state == IDLE) {
          synchronized (this) {
            m_state = BUILDING_MODEL;
          }
          m_trainingSet = e.getTrainingSet();
          // final String oldText = m_visual.getText();
          m_buildThread = new Thread() {
            @SuppressWarnings("deprecation")
            @Override
            public void run() {
              try {
                if (m_trainingSet != null) {
                  m_visual.setAnimated();
                  // m_visual.setText("Building clusters...");
                  if (m_log != null) {
                    m_log.statusMessage(statusMessagePrefix()
                      + "Building clusters...");
                  }
                  buildClusterer();
                  if (m_batchClustererListeners.size() > 0) {
                    BatchClustererEvent ce = new BatchClustererEvent(this,
                      m_Clusterer, new DataSetEvent(this, e.getTrainingSet()),
                      e.getSetNumber(), e.getMaxSetNumber(), 1);
                    notifyBatchClustererListeners(ce);
                  }
                  if (m_Clusterer instanceof weka.core.Drawable
                    && m_graphListeners.size() > 0) {
                    String grphString = ((weka.core.Drawable) m_Clusterer)
                      .graph();
                    int grphType = ((weka.core.Drawable) m_Clusterer)
                      .graphType();
                    String grphTitle = m_Clusterer.getClass().getName();
                    grphTitle = grphTitle.substring(
                      grphTitle.lastIndexOf('.') + 1, grphTitle.length());
                    grphTitle = "Set " + e.getSetNumber() + " ("
                      + e.getTrainingSet().relationName() + ") " + grphTitle;

                    GraphEvent ge = new GraphEvent(Clusterer.this, grphString,
                      grphTitle, grphType);
                    notifyGraphListeners(ge);
                  }

                  if (m_textListeners.size() > 0) {
                    String modelString = m_Clusterer.toString();
                    String titleString = m_Clusterer.getClass().getName();

                    titleString = titleString.substring(
                      titleString.lastIndexOf('.') + 1, titleString.length());
                    modelString = "=== Clusterer model ===\n\n"
                      + "Scheme:   "
                      + titleString
                      + "\n"
                      + "Relation: "
                      + m_trainingSet.relationName()
                      + ((e.getMaxSetNumber() > 1) ? "\nTraining Fold: "
                        + e.getSetNumber() : "") + "\n\n" + modelString;
                    titleString = "Model: " + titleString;

                    TextEvent nt = new TextEvent(Clusterer.this, modelString,
                      titleString);
                    notifyTextListeners(nt);
                  }
                }
              } catch (Exception ex) {
                Clusterer.this.stop(); // stop processing
                if (m_log != null) {
                  m_log.statusMessage(statusMessagePrefix()
                    + "ERROR (See log for details");
                  m_log.logMessage("[Clusterer] " + statusMessagePrefix()
                    + " problem training clusterer. " + ex.getMessage());
                }
                ex.printStackTrace();
              } finally {
                // m_visual.setText(oldText);
                m_visual.setStatic();
                m_state = IDLE;
                if (isInterrupted()) {
                  // prevent any clusterer events from being fired
                  m_trainingSet = null;
                  if (m_log != null) {
                    m_log.logMessage("[Clusterer]" + statusMessagePrefix()
                      + " Build clusterer interrupted!");
                    m_log.statusMessage(statusMessagePrefix() + "INTERRUPTED");
                  }
                } else {
                  // save header
                  m_trainingSet = new Instances(m_trainingSet, 0);
                  if (m_log != null) {
                    m_log.statusMessage(statusMessagePrefix() + "Finished.");
                  }
                }
                block(false);
              }
            }
          };
          m_buildThread.setPriority(Thread.MIN_PRIORITY);
          m_buildThread.start();
          // make sure the thread is still running before we block
          // if (m_buildThread.isAlive()) {
          block(true);
          // }
          m_buildThread = null;
          m_state = IDLE;
        }
      } catch (Exception ex) {
        ex.printStackTrace();
=======
	if (m_state == IDLE) {
	  synchronized (this) {
	    m_state = BUILDING_MODEL;
	  }
	  m_trainingSet = e.getTrainingSet();
//	  final String oldText = m_visual.getText();
	  m_buildThread = new Thread() {
	      public void run() {
		try {
		  if (m_trainingSet != null) {  
		    m_visual.setAnimated();
//		    m_visual.setText("Building clusters...");
		    if (m_log != null) {
		      m_log.statusMessage(statusMessagePrefix() 
		          + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text"));
		    }
		    buildClusterer();
                    if(m_batchClustererListeners.size() > 0){
                        BatchClustererEvent ce = 
                            new BatchClustererEvent(this, m_Clusterer, 
				 new DataSetEvent(this, e.getTrainingSet()),
				 e.getSetNumber(), e.getMaxSetNumber(),1);
                        notifyBatchClustererListeners(ce);
                    }
		    if (m_Clusterer instanceof weka.core.Drawable && 
			m_graphListeners.size() > 0) {
		      String grphString = 
			((weka.core.Drawable)m_Clusterer).graph();
                      int grphType = ((weka.core.Drawable)m_Clusterer).graphType();
		      String grphTitle = m_Clusterer.getClass().getName();
		      grphTitle = grphTitle.substring(grphTitle.
						      lastIndexOf('.')+1, 
						      grphTitle.length());
		      grphTitle = Messages.getInstance().getString("Clusterer_AcceptTrainingSet_GrphTitle_Text_First") + e.getSetNumber() + " ("
			+e.getTrainingSet().relationName() + ") "
			+grphTitle;
		      
		      GraphEvent ge = new GraphEvent(Clusterer.this, 
						     grphString, 
						     grphTitle,
                                                     grphType);
		      notifyGraphListeners(ge);
		    }

		    if (m_textListeners.size() > 0) {
		      String modelString = m_Clusterer.toString();
		      String titleString = m_Clusterer.getClass().getName();
		      
		      titleString = titleString.
			substring(titleString.lastIndexOf('.') + 1,
				  titleString.length());
		      modelString = Messages.getInstance().getString("Clusterer_AcceptTrainingSet_ModelString_Text_First") + titleString +
		      Messages.getInstance().getString("Clusterer_AcceptTrainingSet_ModelString_Text_Second") + m_trainingSet.relationName() + 
			((e.getMaxSetNumber() > 1) 
			 ? Messages.getInstance().getString("Clusterer_AcceptTrainingSet_ModelString_Text_Third") + e.getSetNumber()
			 :"")
			+ "\n\n"
			+ modelString;
		      titleString = Messages.getInstance().getString("Clusterer_AcceptTrainingSet_TitleString_Text") + titleString;

		      TextEvent nt = new TextEvent(Clusterer.this,
						   modelString,
						   titleString);
		      notifyTextListeners(nt);
		    }
		  }
		} catch (Exception ex) {
		  Clusterer.this.stop(); // stop processing
		  if (m_log != null) {
		    m_log.statusMessage(statusMessagePrefix()
		        + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_StatusMessage_Text_First"));
		    m_log.logMessage(Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text_First") + statusMessagePrefix()
		        + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text_First_Alpha") + ex.getMessage());
		  }
		  ex.printStackTrace();
		} finally {
//		  m_visual.setText(oldText);
		  m_visual.setStatic();
		  m_state = IDLE;
		  if (isInterrupted()) {
		    // prevent any clusterer events from being fired
		    m_trainingSet = null;
		    if (m_log != null) {
		      m_log.logMessage(Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text_First") + statusMessagePrefix() 
		          + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text_Second"));
		      m_log.statusMessage(statusMessagePrefix() 
		          + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_StatusMessage_Text_Second"));
		    }
		  } else {
		    // save header
		    m_trainingSet = new Instances(m_trainingSet, 0);
		    if (m_log != null) {
		      m_log.statusMessage(statusMessagePrefix() + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_StatusMessage_Text_Third"));
		    }
		  }
		  block(false);
		}
	      }	
	    };
	  m_buildThread.setPriority(Thread.MIN_PRIORITY);
	  m_buildThread.start();
	  // make sure the thread is still running before we block
	  //	  if (m_buildThread.isAlive()) {
	  block(true);
	    //	  }
	  m_buildThread = null;
	  m_state = IDLE;
	}
      } catch (Exception ex) {
	ex.printStackTrace();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Accepts a test set for a batch trained clusterer
<<<<<<< HEAD
   * 
   * @param e a <code>TestSetEvent</code> value
   */
  @Override
=======
   *
   * @param e a <code>TestSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void acceptTestSet(TestSetEvent e) {

    if (m_trainingSet != null) {
      try {
<<<<<<< HEAD
        if (m_state == IDLE) {
          synchronized (this) {
            m_state = CLUSTERING;
          }
          m_testingSet = e.getTestSet();
          if (m_trainingSet.equalHeaders(m_testingSet)) {
            BatchClustererEvent ce = new BatchClustererEvent(this, m_Clusterer,
              new DataSetEvent(this, e.getTestSet()), e.getSetNumber(),
              e.getMaxSetNumber(), 0);

            notifyBatchClustererListeners(ce);

          }
          m_state = IDLE;
        }
=======
	if (m_state == IDLE) {
	  synchronized(this) {
	    m_state = CLUSTERING;
	  }
          m_testingSet = e.getTestSet();
	  if (m_trainingSet.equalHeaders(m_testingSet)) {
	    BatchClustererEvent ce = 
	      new BatchClustererEvent(this, m_Clusterer, 
				       new DataSetEvent(this, e.getTestSet()),
				  e.getSetNumber(), e.getMaxSetNumber(),0);

	    notifyBatchClustererListeners(ce);
	    
	  }
	  m_state = IDLE;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } catch (Exception ex) {
        stop(); // stop any processing
        if (m_log != null) {
          m_log.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
            + "ERROR (see log for details");
          m_log.logMessage("[Clusterer] " + statusMessagePrefix()
            + " problem during testing. " + ex.getMessage());
        }
        ex.printStackTrace();
=======
              + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_StatusMessage_Text_Fourth"));
          m_log.logMessage(Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text_Third") + statusMessagePrefix()
              + Messages.getInstance().getString("Clusterer_AcceptTrainingSet_LogMessage_Text_Fourth") + ex.getMessage());
        }
	ex.printStackTrace();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  /**
   * Builds the clusters
   */
  private void buildClusterer() throws Exception {
    if (m_trainingSet.classIndex() < 0) {
      m_Clusterer.buildClusterer(m_trainingSet);
    } else { // class based evaluation if class attribute is set
      Remove removeClass = new Remove();
      removeClass.setAttributeIndices("" + (m_trainingSet.classIndex() + 1));
      removeClass.setInvertSelection(false);
      removeClass.setInputFormat(m_trainingSet);
      Instances clusterTrain = Filter.useFilter(m_trainingSet, removeClass);
      m_Clusterer.buildClusterer(clusterTrain);
    }
=======
/**
   * Builds the clusters
   */
  private void buildClusterer() throws Exception {
      if(m_trainingSet.classIndex() < 0)  
        m_Clusterer.buildClusterer(m_trainingSet);
      else{ //class based evaluation if class attribute is set
        Remove removeClass = new Remove();
	removeClass.setAttributeIndices(""+(m_trainingSet.classIndex()+1));
	removeClass.setInvertSelection(false);
	removeClass.setInputFormat(m_trainingSet);
	Instances clusterTrain = Filter.useFilter(m_trainingSet, removeClass);
	m_Clusterer.buildClusterer(clusterTrain);
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Sets the visual appearance of this wrapper bean
<<<<<<< HEAD
   * 
   * @param newVisual a <code>BeanVisual</code> value
   */
  @Override
=======
   *
   * @param newVisual a <code>BeanVisual</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setVisual(BeanVisual newVisual) {
    m_visual = newVisual;
  }

  /**
   * Gets the visual appearance of this wrapper bean
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public BeanVisual getVisual() {
    return m_visual;
  }

  /**
   * Use the default visual appearance for this bean
   */
<<<<<<< HEAD
  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "DefaultClusterer.gif",
      BeanVisual.ICON_PATH + "DefaultClusterer_animated.gif");
=======
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"DefaultClusterer.gif",
		       BeanVisual.ICON_PATH+"DefaultClusterer_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Add a batch clusterer listener
<<<<<<< HEAD
   * 
   * @param cl a <code>BatchClustererListener</code> value
   */
  public synchronized void addBatchClustererListener(BatchClustererListener cl) {
=======
   *
   * @param cl a <code>BatchClustererListener</code> value
   */
  public synchronized void 
    addBatchClustererListener(BatchClustererListener cl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_batchClustererListeners.addElement(cl);
  }

  /**
   * Remove a batch clusterer listener
<<<<<<< HEAD
   * 
   * @param cl a <code>BatchClustererListener</code> value
   */
  public synchronized void removeBatchClustererListener(
    BatchClustererListener cl) {
=======
   *
   * @param cl a <code>BatchClustererListener</code> value
   */
  public synchronized void 
    removeBatchClustererListener(BatchClustererListener cl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_batchClustererListeners.remove(cl);
  }

  /**
   * Notify all batch clusterer listeners of a batch clusterer event
<<<<<<< HEAD
   * 
   * @param ce a <code>BatchClustererEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyBatchClustererListeners(BatchClustererEvent ce) {
    Vector<BatchClustererListener> l;
    synchronized (this) {
      l = (Vector<BatchClustererListener>) m_batchClustererListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).acceptClusterer(ce);
=======
   *
   * @param ce a <code>BatchClustererEvent</code> value
   */
  private void notifyBatchClustererListeners(BatchClustererEvent ce) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_batchClustererListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	((BatchClustererListener)l.elementAt(i)).acceptClusterer(ce);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Add a graph listener
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param cl a <code>GraphListener</code> value
   */
  public synchronized void addGraphListener(GraphListener cl) {
    m_graphListeners.addElement(cl);
  }

  /**
   * Remove a graph listener
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param cl a <code>GraphListener</code> value
   */
  public synchronized void removeGraphListener(GraphListener cl) {
    m_graphListeners.remove(cl);
  }

  /**
   * Notify all graph listeners of a graph event
<<<<<<< HEAD
   * 
   * @param ge a <code>GraphEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyGraphListeners(GraphEvent ge) {
    Vector<GraphListener> l;
    synchronized (this) {
      l = (Vector<GraphListener>) m_graphListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).acceptGraph(ge);
=======
   *
   * @param ge a <code>GraphEvent</code> value
   */
  private void notifyGraphListeners(GraphEvent ge) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_graphListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	((GraphListener)l.elementAt(i)).acceptGraph(ge);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Add a text listener
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param cl a <code>TextListener</code> value
   */
  public synchronized void addTextListener(TextListener cl) {
    m_textListeners.addElement(cl);
  }

  /**
   * Remove a text listener
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param cl a <code>TextListener</code> value
   */
  public synchronized void removeTextListener(TextListener cl) {
    m_textListeners.remove(cl);
  }

  /**
   * Notify all text listeners of a text event
<<<<<<< HEAD
   * 
   * @param ge a <code>TextEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyTextListeners(TextEvent ge) {
    Vector<TextListener> l;
    synchronized (this) {
      l = (Vector<TextListener>) m_textListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).acceptText(ge);
=======
   *
   * @param ge a <code>TextEvent</code> value
   */
  private void notifyTextListeners(TextEvent ge) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_textListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	((TextListener)l.elementAt(i)).acceptText(ge);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  /**
   * We don't have to keep track of configuration listeners (see the
   * documentation for ConfigurationListener/ConfigurationEvent).
   * 
   * @param cl a ConfigurationListener.
   */
  @Override
  public synchronized void addConfigurationListener(ConfigurationListener cl) {

  }

  /**
   * We don't have to keep track of configuration listeners (see the
   * documentation for ConfigurationListener/ConfigurationEvent).
   * 
   * @param cl a ConfigurationListener.
   */
  @Override
  public synchronized void removeConfigurationListener(ConfigurationListener cl) {

  }

  /**
   * Returns true if, at this time, the object will accept a connection with
   * respect to the named event
   * 
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  @Override
  public boolean connectionAllowed(String eventName) {
    /*
     * if (eventName.compareTo("instance") == 0) { if (!(m_Clusterer instanceof
     * weka.classifiers.UpdateableClassifier)) { return false; } }
     */
=======

  /**
   * Returns true if, at this time, 
   * the object will accept a connection with respect to the named event
   *
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  public boolean connectionAllowed(String eventName) {
    /*    if (eventName.compareTo("instance") == 0) {
      if (!(m_Clusterer instanceof weka.classifiers.UpdateableClassifier)) {
	return false;
      }
      } */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_listenees.containsKey(eventName)) {
      return false;
    }
    return true;
  }

  /**
<<<<<<< HEAD
   * Returns true if, at this time, the object will accept a connection
   * according to the supplied EventSetDescriptor
   * 
   * @param esd the EventSetDescriptor
   * @return true if the object will accept a connection
   */
  @Override
=======
   * Returns true if, at this time, 
   * the object will accept a connection according to the supplied
   * EventSetDescriptor
   *
   * @param esd the EventSetDescriptor
   * @return true if the object will accept a connection
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean connectionAllowed(EventSetDescriptor esd) {
    return connectionAllowed(esd.getName());
  }

  /**
<<<<<<< HEAD
   * Notify this object that it has been registered as a listener with a source
   * with respect to the named event
   * 
   * @param eventName the event
   * @param source the source with which this object has been registered as a
   *          listener
   */
  @Override
  public synchronized void connectionNotification(String eventName,
    Object source) {

    if (connectionAllowed(eventName)) {
      m_listenees.put(eventName, source);
      /*
       * if (eventName.compareTo("instance") == 0) { startIncrementalHandler();
       * }
       */
=======
   * Notify this object that it has been registered as a listener with
   * a source with respect to the named event
   *
   * @param eventName the event
   * @param source the source with which this object has been registered as
   * a listener
   */
  public synchronized void connectionNotification(String eventName,
						  Object source) {

    if (connectionAllowed(eventName)) {
      m_listenees.put(eventName, source);
      /*      if (eventName.compareTo("instance") == 0) {
	startIncrementalHandler();
	} */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Notify this object that it has been deregistered as a listener with a
   * source with respect to the supplied event name
   * 
   * @param eventName the event
   * @param source the source with which this object has been registered as a
   *          listener
   */
  @Override
  public synchronized void disconnectionNotification(String eventName,
    Object source) {
=======
   * Notify this object that it has been deregistered as a listener with
   * a source with respect to the supplied event name
   *
   * @param eventName the event
   * @param source the source with which this object has been registered as
   * a listener
   */
  public synchronized void disconnectionNotification(String eventName,
						     Object source) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_listenees.remove(eventName);
  }

  /**
<<<<<<< HEAD
   * Function used to stop code that calls acceptTrainingSet. This is needed as
   * clusterer construction is performed inside a separate thread of execution.
   * 
=======
   * Function used to stop code that calls acceptTrainingSet. This is 
   * needed as clusterer construction is performed inside a separate
   * thread of execution.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param tf a <code>boolean</code> value
   */
  private synchronized void block(boolean tf) {

    if (tf) {
      try {
<<<<<<< HEAD
        // only block if thread is still doing something useful!
        if (m_buildThread.isAlive() && m_state != IDLE) {
          wait();
        }
=======
	  // only block if thread is still doing something useful!
	if (m_buildThread.isAlive() && m_state != IDLE) {
	  wait();
	  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } catch (InterruptedException ex) {
      }
    } else {
      notifyAll();
    }
  }

  /**
<<<<<<< HEAD
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
  public boolean isBusy() {
    return (m_buildThread != null);
  }

  /**
   * Stop any clusterer action
   */
  @SuppressWarnings("deprecation")
  @Override
  public void stop() {
    // tell all listenees (upstream beans) to stop
    Enumeration<String> en = m_listenees.keys();
    while (en.hasMoreElements()) {
      Object tempO = m_listenees.get(en.nextElement());
      if (tempO instanceof BeanCommon) {
        ((BeanCommon) tempO).stop();
=======
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  public boolean isBusy() {
    return (m_buildThread != null);
  }
  
  /**
   * Stop any clusterer action
   */
  public void stop() {
    // tell all listenees (upstream beans) to stop
    Enumeration en = m_listenees.keys();
    while (en.hasMoreElements()) {
      Object tempO = m_listenees.get(en.nextElement());
      if (tempO instanceof BeanCommon) {
	((BeanCommon)tempO).stop();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // stop the build thread
    if (m_buildThread != null) {
      m_buildThread.interrupt();
      m_buildThread.stop();
      m_buildThread = null;
      m_visual.setStatic();
    }
  }

  /**
   * Set a logger
<<<<<<< HEAD
   * 
   * @param logger a <code>Logger</code> value
   */
  @Override
=======
   *
   * @param logger a <code>Logger</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setLog(Logger logger) {
    m_log = logger;
  }

  public void saveModel() {
    try {
      if (m_fileChooser == null) {
        // i.e. after de-serialization
<<<<<<< HEAD
        m_fileChooser = new JFileChooser(new File(
          System.getProperty("user.dir")));
        ExtensionFileFilter ef = new ExtensionFileFilter("model",
          "Serialized weka clusterer");
        m_fileChooser.setFileFilter(ef);
=======
        m_fileChooser = 
          new JFileChooser(new File(System.getProperty("user.dir")));
        ExtensionFileFilter ef = new ExtensionFileFilter("model", "Serialized weka clusterer");
      m_fileChooser.setFileFilter(ef);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      int returnVal = m_fileChooser.showSaveDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File saveTo = m_fileChooser.getSelectedFile();
        String fn = saveTo.getAbsolutePath();
        if (!fn.endsWith(".model")) {
          fn += ".model";
          saveTo = new File(fn);
        }
<<<<<<< HEAD
        ObjectOutputStream os = new ObjectOutputStream(
          new BufferedOutputStream(new FileOutputStream(saveTo)));
=======
        ObjectOutputStream os = 
          new ObjectOutputStream(new BufferedOutputStream(
                                                          new FileOutputStream(saveTo)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        os.writeObject(m_Clusterer);
        if (m_trainingSet != null) {
          Instances header = new Instances(m_trainingSet, 0);
          os.writeObject(header);
        }
        os.close();
        if (m_log != null) {
<<<<<<< HEAD
          m_log.logMessage("[Clusterer] Saved clusterer " + getCustomName());
=======
          m_log.logMessage(Messages.getInstance().getString("Clusterer_SaveModel_LogMessage_Text_Fourth") + getCustomName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(Clusterer.this,
<<<<<<< HEAD
        "Problem saving clusterer.\n", "Save Model", JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.logMessage("[Clusterer] Problem saving clusterer. "
          + getCustomName() + ex.getMessage());
=======
    		  Messages.getInstance().getString("Clusterer_SaveModel_JOptionPane_ShowMessageDialog_Text_First"),
    		  Messages.getInstance().getString("Clusterer_SaveModel_JOptionPane_ShowMessageDialog_Text_Second"),
                                    JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.logMessage(Messages.getInstance().getString("Clusterer_SaveModel_LogMessage_Text_Fifth") 
            + getCustomName() + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  public void loadModel() {
    try {
      if (m_fileChooser == null) {
        // i.e. after de-serialization
<<<<<<< HEAD
        m_fileChooser = new JFileChooser(new File(
          System.getProperty("user.dir")));
        ExtensionFileFilter ef = new ExtensionFileFilter("model",
          "Serialized weka clusterer");
=======
        m_fileChooser = 
          new JFileChooser(new File(System.getProperty("user.dir")));
        ExtensionFileFilter ef = new ExtensionFileFilter("model", "Serialized weka clusterer");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        m_fileChooser.setFileFilter(ef);
      }
      int returnVal = m_fileChooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File loadFrom = m_fileChooser.getSelectedFile();
<<<<<<< HEAD
        ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(
          new FileInputStream(loadFrom)));
        // try and read the model
        weka.clusterers.Clusterer temp = (weka.clusterers.Clusterer) is
          .readObject();

        // Update name and icon
        setClusterer(temp);

        // try and read the header (if present)
        try {
          m_trainingSet = (Instances) is.readObject();
=======
        ObjectInputStream is = 
          new ObjectInputStream(new BufferedInputStream(
                                new FileInputStream(loadFrom)));
        // try and read the model
        weka.clusterers.Clusterer temp = (weka.clusterers.Clusterer)is.readObject();

        // Update name and icon
        setClusterer(temp);
        
        // try and read the header (if present)
        try {
          m_trainingSet = (Instances)is.readObject();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        } catch (Exception ex) {
          // quietly ignore
        }
        is.close();
        if (m_log != null) {
<<<<<<< HEAD
          m_log.logMessage("[Clusterer] Loaded clusterer: "
            + m_Clusterer.getClass().toString());
=======
          m_log.logMessage(Messages.getInstance().getString("Clusterer_LoadModel_LogMessage_Text_First")
                           + m_Clusterer.getClass().toString());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(Clusterer.this,
<<<<<<< HEAD
        "Problem loading classifier.\n", "Load Model",
        JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.logMessage("[Clusterer] Problem loading classifier. "
          + ex.getMessage());
=======
    		  Messages.getInstance().getString("Clusterer_LoadModel_JOptionPane_ShowMessageDialog_Text_First"),
    		  Messages.getInstance().getString("Clusterer_LoadModel_JOptionPane_ShowMessageDialog_Text_Second"),
                                    JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.logMessage(Messages.getInstance().getString("Clusterer_LoadModel_LogMessage_Text_Second") 
            + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Return an enumeration of requests that can be made by the user
<<<<<<< HEAD
   * 
   * @return an <code>Enumeration</code> value
   */
  @Override
  public Enumeration<String> enumerateRequests() {
    Vector<String> newVector = new Vector<String>(0);
=======
   *
   * @return an <code>Enumeration</code> value
   */
  public Enumeration enumerateRequests() {
    Vector newVector = new Vector(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_buildThread != null) {
      newVector.addElement("Stop");
    }

<<<<<<< HEAD
    if (m_buildThread == null && m_Clusterer != null) {
=======
    if (m_buildThread == null &&
        m_Clusterer != null) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      newVector.addElement("Save model");
    }

    if (m_buildThread == null) {
      newVector.addElement("Load model");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return newVector.elements();
  }

  /**
   * Perform a particular request
<<<<<<< HEAD
   * 
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    } else if (request.compareTo("Save model") == 0) {
=======
   *
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    }  else if (request.compareTo("Save model") == 0) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      saveModel();
    } else if (request.compareTo("Load model") == 0) {
      loadModel();
    } else {
      throw new IllegalArgumentException(request + " not supported (Clusterer)");
    }
  }

  /**
<<<<<<< HEAD
   * Returns true, if at the current time, the event described by the supplied
   * event descriptor could be generated.
   * 
=======
   * Returns true, if at the current time, the event described by the
   * supplied event descriptor could be generated.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param esd an <code>EventSetDescriptor</code> value
   * @return a <code>boolean</code> value
   */
  public boolean eventGeneratable(EventSetDescriptor esd) {
    String eventName = esd.getName();
    return eventGeneratable(eventName);
  }

  /**
<<<<<<< HEAD
   * Returns true, if at the current time, the named event could be generated.
   * Assumes that the supplied event name is an event that could be generated by
   * this bean
   * 
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in time
   */
  @Override
=======
   * Returns true, if at the current time, the named event could
   * be generated. Assumes that the supplied event name is
   * an event that could be generated by this bean
   *
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in
   * time
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean eventGeneratable(String eventName) {
    if (eventName.compareTo("graph") == 0) {
      // can't generate a GraphEvent if clusterer is not drawable
      if (!(m_Clusterer instanceof weka.core.Drawable)) {
<<<<<<< HEAD
        return false;
=======
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      // need to have a training set before the clusterer
      // can generate a graph!
      if (!m_listenees.containsKey("trainingSet")) {
<<<<<<< HEAD
        return false;
=======
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      // Source needs to be able to generate a trainingSet
      // before we can generate a graph
      Object source = m_listenees.get("trainingSet");
<<<<<<< HEAD
      if (source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("trainingSet")) {
          return false;
        }
=======
       if (source instanceof EventConstraints) {
	if (!((EventConstraints)source).eventGeneratable("trainingSet")) {
	  return false;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    if (eventName.compareTo("batchClusterer") == 0) {
      if (!m_listenees.containsKey("trainingSet")) {
<<<<<<< HEAD
        return false;
      }

      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("trainingSet")) {
          return false;
        }
=======
	return false;
      }
     
      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
	if (!((EventConstraints)source).eventGeneratable("trainingSet")) {
	  return false;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    if (eventName.compareTo("text") == 0) {
<<<<<<< HEAD
      if (!m_listenees.containsKey("trainingSet")) {
        return false;
      }
      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("trainingSet")) {
          return false;
        }
      }
    }

    if (eventName.compareTo("batchClassifier") == 0) {
      return false;
    }
    if (eventName.compareTo("incrementalClassifier") == 0) {
      return false;
    }

    return true;
  }

  private String statusMessagePrefix() {
    return getCustomName()
      + "$"
      + hashCode()
      + "|"
      + ((m_Clusterer instanceof OptionHandler && Utils.joinOptions(
        ((OptionHandler) m_Clusterer).getOptions()).length() > 0) ? Utils
        .joinOptions(((OptionHandler) m_Clusterer).getOptions()) + "|" : "");
=======
      if (!m_listenees.containsKey("trainingSet")){ 
	return false;
      }
      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
	if (!((EventConstraints)source).eventGeneratable("trainingSet")) {
	  return false;
	}
      }
    }

    if (eventName.compareTo("batchClassifier") == 0)
        return false;
    if (eventName.compareTo("incrementalClassifier") == 0)
        return false;
    
    return true;
  }
  
  private String statusMessagePrefix() {
    return getCustomName() + "$" + hashCode() + "|"
    + ((m_Clusterer instanceof OptionHandler &&
        Utils.joinOptions(((OptionHandler)m_Clusterer).getOptions()).length() > 0)
        ? Utils.joinOptions(((OptionHandler)m_Clusterer).getOptions()) + "|"
            : "");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
