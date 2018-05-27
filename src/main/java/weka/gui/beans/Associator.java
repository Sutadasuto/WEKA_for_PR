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
 *    Associator.java
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
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
import java.beans.EventSetDescriptor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.EventListener;
<<<<<<< HEAD
=======
=======
import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.gui.Logger;

import java.awt.BorderLayout;
import java.beans.EventSetDescriptor;
import java.io.Serializable;
import java.util.Enumeration;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JPanel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.associations.Apriori;
import weka.associations.AssociationRules;
import weka.associations.AssociationRulesProducer;
import weka.core.Attribute;
import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.gui.Logger;

/**
 * Bean that wraps around weka.associations. If used in a non-graphical
 * environment, options for the wrapped associator can be provided by setting an
 * environment variable: weka.gui.beans.associator.schemeOptions. The value of
 * this environment variable needs to be a string containing command-line option
 * settings.
 * 
 * @author Mark Hall (mhall at cs dot waikato dot ac dot nz)
 * @version $Revision: 10216 $
<<<<<<< HEAD
=======
=======
/**
 * Bean that wraps around weka.associations
 *
 * @author Mark Hall (mhall at cs dot waikato dot ac dot nz)
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @since 1.0
 * @see JPanel
 * @see BeanCommon
 * @see Visible
 * @see WekaWrapper
 * @see Serializable
 * @see UserRequestAcceptor
 * @see TrainingSetListener
 * @see DataSourceListener
 */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
public class Associator extends JPanel implements BeanCommon, Visible,
  WekaWrapper, EventConstraints, Serializable, UserRequestAcceptor,
  DataSourceListener, TrainingSetListener, ConfigurationProducer,
  StructureProducer, EnvironmentHandler {
<<<<<<< HEAD
=======
=======
public class Associator
  extends JPanel
  implements BeanCommon, Visible, 
	     WekaWrapper, EventConstraints,
	     Serializable, UserRequestAcceptor,
             DataSourceListener,
	     TrainingSetListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -7843500322130210057L;

<<<<<<< HEAD
  protected BeanVisual m_visual = new BeanVisual("Associator",
    BeanVisual.ICON_PATH + "DefaultAssociator.gif", BeanVisual.ICON_PATH
      + "DefaultAssociator_animated.gif");
=======
<<<<<<< HEAD
  protected BeanVisual m_visual = new BeanVisual("Associator",
    BeanVisual.ICON_PATH + "DefaultAssociator.gif", BeanVisual.ICON_PATH
      + "DefaultAssociator_animated.gif");
=======
  protected BeanVisual m_visual = 
    new BeanVisual("Associator",
		   BeanVisual.ICON_PATH+"DefaultAssociator.gif",
		   BeanVisual.ICON_PATH+"DefaultAssociator_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private static int IDLE = 0;
  private static int BUILDING_MODEL = 1;

  private int m_state = IDLE;

  private Thread m_buildThread = null;

  /**
   * Global info for the wrapped associator (if it exists).
   */
  protected String m_globalInfo;

  /**
   * Objects talking to us
   */
<<<<<<< HEAD
  private final Hashtable<String, Object> m_listenees = new Hashtable<String, Object>();
=======
<<<<<<< HEAD
  private final Hashtable<String, Object> m_listenees = new Hashtable<String, Object>();
=======
  private Hashtable m_listenees = new Hashtable();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Objects listening for text events
   */
<<<<<<< HEAD
  private final Vector<EventListener> m_textListeners = new Vector<EventListener>();
=======
<<<<<<< HEAD
  private final Vector<EventListener> m_textListeners = new Vector<EventListener>();
=======
  private Vector m_textListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Objects listening for graph events
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final Vector<EventListener> m_graphListeners = new Vector<EventListener>();

  /** The objects listening for batchAssociationRules events **/
  private final Vector<BatchAssociationRulesListener> m_rulesListeners = new Vector<BatchAssociationRulesListener>();
<<<<<<< HEAD
=======
=======
  private Vector m_graphListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private weka.associations.Associator m_Associator = new Apriori();

  private transient Logger m_log = null;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The environment variables */
  private transient Environment m_env = null;

  /**
   * Global info (if it exists) for the wrapped classifier
   * 
<<<<<<< HEAD
=======
=======
  /**
   * Global info (if it exists) for the wrapped classifier
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the global info
   */
  public String globalInfo() {
    return m_globalInfo;
  }

  /**
   * Creates a new <code>Associator</code> instance.
   */
  public Associator() {
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
    setAssociator(m_Associator);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set environment variables to use.
   * 
   * @param env the environment variables to use
   */
  @Override
  public void setEnvironment(Environment env) {
    m_env = env;
  }

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set a custom (descriptive) name for this bean
   * 
   * @param name the name to use
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String getCustomName() {
    return m_visual.getText();
  }

  /**
   * Set the associator for this wrapper
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param c a <code>weka.associations.Associator</code> value
   */
  public void setAssociator(weka.associations.Associator c) {
    boolean loadImages = true;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (c.getClass().getName().compareTo(m_Associator.getClass().getName()) == 0) {
      loadImages = false;
    }
    m_Associator = c;
    String associatorName = c.getClass().toString();
    associatorName = associatorName.substring(
      associatorName.lastIndexOf('.') + 1, associatorName.length());
    if (loadImages) {
      if (!m_visual.loadIcons(BeanVisual.ICON_PATH + associatorName + ".gif",
        BeanVisual.ICON_PATH + associatorName + "_animated.gif")) {
        useDefaultVisual();
<<<<<<< HEAD
=======
=======
    if (c.getClass().getName().
	compareTo(m_Associator.getClass().getName()) == 0) {
      loadImages = false;
    } 
    m_Associator = c;
    String associatorName = c.getClass().toString();
    associatorName = associatorName.substring(associatorName.
					      lastIndexOf('.')+1, 
					      associatorName.length());
    if (loadImages) {
      if (!m_visual.loadIcons(BeanVisual.ICON_PATH+associatorName+".gif",
		       BeanVisual.ICON_PATH+associatorName+"_animated.gif")) {
	useDefaultVisual();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_visual.setText(associatorName);

    // get global info
    m_globalInfo = KnowledgeFlowApp.getGlobalInfo(m_Associator);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Get the associator currently set for this wrapper
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Get the associator currently set for this wrapper
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a <code>weka.associations.Associator</code> value
   */
  public weka.associations.Associator getAssociator() {
    return m_Associator;
  }

  /**
   * Sets the algorithm (associator) for this bean
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param algorithm an <code>Object</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
  public void setWrappedAlgorithm(Object algorithm) {

    if (!(algorithm instanceof weka.associations.Associator)) {
      throw new IllegalArgumentException(algorithm.getClass() + " : incorrect "
        + "type of algorithm (Associator)");
    }
    setAssociator((weka.associations.Associator) algorithm);
<<<<<<< HEAD
=======
=======
   *
   * @param algorithm an <code>Object</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  public void setWrappedAlgorithm(Object algorithm) {

    if (!(algorithm instanceof weka.associations.Associator)) { 
      throw new IllegalArgumentException(algorithm.getClass()
					 + Messages.getInstance().getString("Associator_SetWrappedAlgorithm_IllegalArgumentException_Text"));
    }
    setAssociator((weka.associations.Associator)algorithm);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the wrapped associator
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an <code>Object</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return an <code>Object</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Object getWrappedAlgorithm() {
    return getAssociator();
  }

  /**
   * Accept a training set
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param e a <code>TrainingSetEvent</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param e a <code>TrainingSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptTrainingSet(TrainingSetEvent e) {
    // construct and pass on a DataSetEvent
    Instances trainingSet = e.getTrainingSet();
    DataSetEvent dse = new DataSetEvent(this, trainingSet);
    acceptDataSet(dse);
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptDataSet(final DataSetEvent e) {
    if (e.isStructureOnly()) {
      // no need to build an associator, just absorb and return
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_buildThread == null) {
      try {
        if (m_state == IDLE) {
          synchronized (this) {
            m_state = BUILDING_MODEL;
          }
          final Instances trainingData = e.getDataSet();
          // final String oldText = m_visual.getText();
          m_buildThread = new Thread() {
            @SuppressWarnings("deprecation")
            @Override
            public void run() {
              try {
                if (trainingData != null) {
                  m_visual.setAnimated();
                  // m_visual.setText("Building model...");
                  if (m_log != null) {
                    m_log.statusMessage(statusMessagePrefix()
                      + "Building model...");
                  }
                  buildAssociations(trainingData);

                  if (m_textListeners.size() > 0) {
                    String modelString = m_Associator.toString();
                    String titleString = m_Associator.getClass().getName();

                    titleString = titleString.substring(
                      titleString.lastIndexOf('.') + 1, titleString.length());
                    modelString = "=== Associator model ===\n\n" + "Scheme:   "
                      + titleString + "\n" + "Relation: "
                      + trainingData.relationName() + "\n\n" + modelString;
                    titleString = "Model: " + titleString;

                    TextEvent nt = new TextEvent(Associator.this, modelString,
                      titleString);
                    notifyTextListeners(nt);
                  }

                  if (m_Associator instanceof weka.core.Drawable
                    && m_graphListeners.size() > 0) {
                    String grphString = ((weka.core.Drawable) m_Associator)
                      .graph();
                    int grphType = ((weka.core.Drawable) m_Associator)
                      .graphType();
                    String grphTitle = m_Associator.getClass().getName();
                    grphTitle = grphTitle.substring(
                      grphTitle.lastIndexOf('.') + 1, grphTitle.length());
                    grphTitle = " (" + e.getDataSet().relationName() + ") "
                      + grphTitle;

                    GraphEvent ge = new GraphEvent(Associator.this, grphString,
                      grphTitle, grphType);
                    notifyGraphListeners(ge);
                  }

                  if ((m_Associator instanceof AssociationRulesProducer)
                    && m_rulesListeners.size() > 0) {
                    AssociationRules rules = ((AssociationRulesProducer) m_Associator)
                      .getAssociationRules();

                    BatchAssociationRulesEvent bre = new BatchAssociationRulesEvent(
                      Associator.this, rules);
                    notifyRulesListeners(bre);
                  }
                }
              } catch (Exception ex) {
                Associator.this.stop();
                if (m_log != null) {
                  m_log.statusMessage(statusMessagePrefix()
                    + "ERROR (See log for details)");
                  m_log.logMessage("[Associator] " + statusMessagePrefix()
                    + " problem training associator. " + ex.getMessage());
                }
                ex.printStackTrace();
              } finally {
                // m_visual.setText(oldText);
                m_visual.setStatic();
                m_state = IDLE;
                if (isInterrupted()) {
                  if (m_log != null) {
                    String titleString = m_Associator.getClass().getName();
                    titleString = titleString.substring(
                      titleString.lastIndexOf('.') + 1, titleString.length());
                    m_log.logMessage("[Associator] " + statusMessagePrefix()
                      + " Build associator interrupted!");
                    m_log.statusMessage(statusMessagePrefix() + "INTERRUPTED");
                  }
                } else {
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
<<<<<<< HEAD
=======
=======

    if (m_buildThread == null) {
      try {
	if (m_state == IDLE) {
	  synchronized (this) {
	    m_state = BUILDING_MODEL;
	  }
	  final Instances trainingData = e.getDataSet();
//	  final String oldText = m_visual.getText();
	  m_buildThread = new Thread() {
	      public void run() {
		try {
		  if (trainingData != null) {
		    m_visual.setAnimated();
//		    m_visual.setText("Building model...");
		    if (m_log != null) {
		      m_log.statusMessage(statusMessagePrefix() 
		          + Messages.getInstance().getString("Associator_AcceptDataSet_StatusMessage_Text_First"));
		    }
		    buildAssociations(trainingData);

		    if (m_textListeners.size() > 0) {
		      String modelString = m_Associator.toString();
		      String titleString = m_Associator.getClass().getName();
		      
		      titleString = titleString.
			substring(titleString.lastIndexOf('.') + 1,
				  titleString.length());
		      modelString = Messages.getInstance().getString("Associator_AcceptDataSet_ModelString_Text_First") 
		      + Messages.getInstance().getString("Associator_AcceptDataSet_ModelString_Text_Second")  + trainingData.relationName() 
		      + "\n\n" + modelString;

		      titleString = Messages.getInstance().getString("Associator_AcceptDataSet_TitleString_Text_First") + titleString;

		      TextEvent nt = new TextEvent(Associator.this,
						   modelString,
						   titleString);
		      notifyTextListeners(nt);
		    }

                    if (m_Associator instanceof weka.core.Drawable && 
			m_graphListeners.size() > 0) {
		      String grphString = 
			((weka.core.Drawable)m_Associator).graph();
                      int grphType = ((weka.core.Drawable)m_Associator).graphType();
		      String grphTitle = m_Associator.getClass().getName();
		      grphTitle = grphTitle.substring(grphTitle.
						      lastIndexOf('.')+1, 
						      grphTitle.length());
		      grphTitle = " ("
			+e.getDataSet().relationName() + ") "
			+grphTitle;
		      
		      GraphEvent ge = new GraphEvent(Associator.this, 
						     grphString, 
						     grphTitle,
                                                     grphType);
		      notifyGraphListeners(ge);
		    }
		  }
		} catch (Exception ex) {
		  Associator.this.stop();
		  if (m_log != null) {
		    m_log.statusMessage(statusMessagePrefix()
		        + Messages.getInstance().getString("Associator_AcceptDataSet_StatusMessage_Text_Second"));
		    m_log.logMessage(Messages.getInstance().getString("Associator_AcceptDataSet_LogMessage_Text_First") + statusMessagePrefix()
		        + Messages.getInstance().getString("Associator_AcceptDataSet_LogMessage_Text_Second") + ex.getMessage());
		  }
		  ex.printStackTrace();
		} finally {
//		  m_visual.setText(oldText);
		  m_visual.setStatic();
		  m_state = IDLE;
		  if (isInterrupted()) {
		    if (m_log != null) {
                      String titleString = m_Associator.getClass().getName();		      
		      titleString = titleString.
			substring(titleString.lastIndexOf('.') + 1,
				  titleString.length());
		      m_log.logMessage(Messages.getInstance().getString("Associator_AcceptDataSet_LogMessage_Text_Third") + statusMessagePrefix() 
		          + Messages.getInstance().getString("Associator_AcceptDataSet_LogMessage_Text_Fourth"));
		      m_log.statusMessage(statusMessagePrefix() + Messages.getInstance().getString("Associator_AcceptDataSet_StatusMessage_Text_Third"));
		    }
		  } else {
		    if (m_log != null) {
		      m_log.statusMessage(statusMessagePrefix() + Messages.getInstance().getString("Associator_AcceptDataSet_StatusMessage_Text_Fourth"));
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
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private void buildAssociations(Instances data) throws Exception {

    // see if there is an environment variable with
    // options for the associator
    if (m_env != null && m_Associator instanceof OptionHandler) {
      String opts = m_env
        .getVariableValue("weka.gui.beans.associator.schemeOptions");
      if (opts != null && opts.length() > 0) {
        String[] options = Utils.splitOptions(opts);
        if (options.length > 0) {
          try {
            ((OptionHandler) m_Associator).setOptions(options);
          } catch (Exception ex) {
            String warningMessage = "[Associator] WARNING: unable to set options \""
              + opts + "\"for " + m_Associator.getClass().getName();
            if (m_log != null) {
              m_log.logMessage(warningMessage);
            } else {
              System.err.print(warningMessage);
            }
          }
        }
      }
    }

<<<<<<< HEAD
=======
=======

  private void buildAssociations(Instances data) 
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Associator.buildAssociations(data);
  }

  /**
   * Sets the visual appearance of this wrapper bean
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
   * Gets the visual appearance of this wrapper bean
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public BeanVisual getVisual() {
    return m_visual;
  }

  /**
   * Use the default visual appearance for this bean
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "DefaultAssociator.gif",
      BeanVisual.ICON_PATH + "DefaultAssociator_animated.gif");
  }

  /**
   * Add a batch association rules listener
   * 
   * @param al a <code>BatchAssociationRulesListener</code>
   */
  public synchronized void addBatchAssociationRulesListener(
    BatchAssociationRulesListener al) {
    m_rulesListeners.add(al);
  }

  /**
   * Remove a batch association rules listener
   * 
   * @param al a <code>BatchAssociationRulesListener</code>
   */
  public synchronized void removeBatchAssociationRulesListener(
    BatchAssociationRulesListener al) {
    m_rulesListeners.remove(al);
<<<<<<< HEAD
=======
=======
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"DefaultAssociator.gif",
		       BeanVisual.ICON_PATH+"DefaultAssociator_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Add a text listener
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param cl a <code>TextListener</code> value
   */
  public synchronized void removeTextListener(TextListener cl) {
    m_textListeners.remove(cl);
  }

  /**
   * Add a graph listener
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param cl a <code>GraphListener</code> value
   */
  public synchronized void removeGraphListener(GraphListener cl) {
    m_graphListeners.remove(cl);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
   * Notify all text listeners of a text event
   * 
   * @param ge a <code>TextEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyTextListeners(TextEvent ge) {
    Vector<EventListener> l;
    synchronized (this) {
      l = (Vector<EventListener>) m_textListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        ((TextListener) l.elementAt(i)).acceptText(ge);
<<<<<<< HEAD
=======
=======
   * Notify all text listeners of a text event
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
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Notify all graph listeners of a graph event
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param ge a <code>GraphEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyGraphListeners(GraphEvent ge) {
    Vector<EventListener> l;
    synchronized (this) {
      l = (Vector<EventListener>) m_graphListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        ((GraphListener) l.elementAt(i)).acceptGraph(ge);
      }
    }
  }

  /**
   * Notify all batch association rules listeners of a rules event.
   * 
   * @param are a <code>BatchAssociationRulesEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyRulesListeners(BatchAssociationRulesEvent are) {
    Vector<BatchAssociationRulesListener> l;

    synchronized (this) {
      l = (Vector<BatchAssociationRulesListener>) m_rulesListeners.clone();
      for (int i = 0; i < l.size(); i++) {
        l.get(i).acceptAssociationRules(are);
<<<<<<< HEAD
=======
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
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns true if, at this time, the object will accept a connection with
   * respect to the named event
   * 
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Returns true if, at this time, 
   * the object will accept a connection with respect to the named event
   *
   * @param eventName the event
   * @return true if the object will accept a connection
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean connectionAllowed(String eventName) {
    if (m_listenees.containsKey(eventName)) {
      return false;
    }
    return true;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns true if, at this time, the object will accept a connection
   * according to the supplied EventSetDescriptor
   * 
   * @param esd the EventSetDescriptor
   * @return true if the object will accept a connection
   */
  @Override
<<<<<<< HEAD
=======
=======
   * Returns true if, at this time, 
   * the object will accept a connection according to the supplied
   * EventSetDescriptor
   *
   * @param esd the EventSetDescriptor
   * @return true if the object will accept a connection
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean connectionAllowed(EventSetDescriptor esd) {
    return connectionAllowed(esd.getName());
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
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
<<<<<<< HEAD
=======
=======
  
  /**
   * Notify this object that it has been registered as a listener with
   * a source with respect to the named event
   *
   * @param eventName the event
   * @param source the source with which this object has been registered as
   * a listener
   */
  public synchronized void connectionNotification(String eventName,
						  Object source) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (connectionAllowed(eventName)) {
      m_listenees.put(eventName, source);
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
<<<<<<< HEAD
=======
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
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_listenees.remove(eventName);
  }

  /**
<<<<<<< HEAD
   * Function used to stop code that calls acceptTrainingSet. This is needed as
   * classifier construction is performed inside a separate thread of execution.
   * 
=======
<<<<<<< HEAD
   * Function used to stop code that calls acceptTrainingSet. This is needed as
   * classifier construction is performed inside a separate thread of execution.
   * 
=======
   * Function used to stop code that calls acceptTrainingSet. This is 
   * needed as classifier construction is performed inside a separate
   * thread of execution.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param tf a <code>boolean</code> value
   */
  private synchronized void block(boolean tf) {

    if (tf) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // only block if thread is still doing something useful!
        if (m_buildThread.isAlive() && m_state != IDLE) {
          wait();
        }
<<<<<<< HEAD
=======
=======
	  // only block if thread is still doing something useful!
	if (m_buildThread.isAlive() && m_state != IDLE) {
	  wait();
	  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } catch (InterruptedException ex) {
      }
    } else {
      notifyAll();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
<<<<<<< HEAD
=======
=======
  }  
  
  /**
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean isBusy() {
    return (m_buildThread != null);
  }

  /**
   * Stop any associator action
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("deprecation")
  @Override
  public void stop() {
    // tell all listenees (upstream beans) to stop
    Enumeration<String> en = m_listenees.keys();
    while (en.hasMoreElements()) {
      Object tempO = m_listenees.get(en.nextElement());
      if (tempO instanceof BeanCommon) {
        ((BeanCommon) tempO).stop();
<<<<<<< HEAD
=======
=======
  public void stop() {
    // tell all listenees (upstream beans) to stop
    Enumeration en = m_listenees.keys();
    while (en.hasMoreElements()) {
      Object tempO = m_listenees.get(en.nextElement());
      if (tempO instanceof BeanCommon) {
	((BeanCommon)tempO).stop();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param logger a <code>Logger</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param logger a <code>Logger</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setLog(Logger logger) {
    m_log = logger;
  }

  /**
   * Return an enumeration of requests that can be made by the user
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
    if (m_buildThread != null) {
      newVector.addElement("Stop");
    }
    return newVector.elements();
  }

  /**
   * Perform a particular request
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    } else {
      throw new IllegalArgumentException(request
<<<<<<< HEAD
        + " not supported (Associator)");
=======
<<<<<<< HEAD
        + " not supported (Associator)");
=======
					 + Messages.getInstance().getString("Associator_PerformRequest_IllegalArgumentException_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
<<<<<<< HEAD
   * Returns true, if at the current time, the event described by the supplied
   * event descriptor could be generated.
   * 
=======
<<<<<<< HEAD
   * Returns true, if at the current time, the event described by the supplied
   * event descriptor could be generated.
   * 
=======
   * Returns true, if at the current time, the event described by the
   * supplied event descriptor could be generated.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param esd an <code>EventSetDescriptor</code> value
   * @return a <code>boolean</code> value
   */
  public boolean eventGeneratable(EventSetDescriptor esd) {
    String eventName = esd.getName();
    return eventGeneratable(eventName);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Get the structure of the output encapsulated in the named event. If the
   * structure can't be determined in advance of seeing input, or this
   * StructureProducer does not generate the named event, null should be
   * returned.
   * 
   * @param eventName the name of the output event that encapsulates the
   *          requested output.
   * 
   * @return the structure of the output encapsulated in the named event or null
   *         if it can't be determined in advance of seeing input or the named
   *         event is not generated by this StructureProduce.
   */
  @Override
  public Instances getStructure(String eventName) {

    Instances structure = null;

    if (eventName.equals("text")) {
      ArrayList<Attribute> attInfo = new ArrayList<Attribute>();
      attInfo.add(new Attribute("Title", (ArrayList<String>) null));
      attInfo.add(new Attribute("Text", (ArrayList<String>) null));
      structure = new Instances("TextEvent", attInfo, 0);
    } else if (eventName.equals("batchAssociationRules")) {
      if (m_Associator != null
        && m_Associator instanceof AssociationRulesProducer) {
        // we make the assumption here that consumers of
        // batchAssociationRules events will utilize a structure
        // consisting of the RHS of the rule (String), LHS of the
        // rule (String) and one numeric attribute for each metric
        // associated with the rules.

        String[] metricNames = ((AssociationRulesProducer) m_Associator)
          .getRuleMetricNames();
        ArrayList<Attribute> attInfo = new ArrayList<Attribute>();
        attInfo.add(new Attribute("LHS", (ArrayList<String>) null));
        attInfo.add(new Attribute("RHS", (ArrayList<String>) null));
        attInfo.add(new Attribute("Support"));
        for (String metricName : metricNames) {
          attInfo.add(new Attribute(metricName));
        }
        structure = new Instances("batchAssociationRulesEvent", attInfo, 0);
      }
    }

    return structure;
  }

  /**
   * Returns true, if at the current time, the named event could be generated.
   * Assumes that the supplied event name is an event that could be generated by
   * this bean
   * 
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in time
   */
  @Override
  public boolean eventGeneratable(String eventName) {
    if (eventName.compareTo("text") == 0 || eventName.compareTo("graph") == 0
      || eventName.equals("batchAssociationRules")) {
      if (!m_listenees.containsKey("dataSet")
        && !m_listenees.containsKey("trainingSet")) {
        return false;
      }
      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("trainingSet")) {
          return false;
        }
      }
      source = m_listenees.get("dataSet");
      if (source != null && source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("dataSet")) {
          return false;
        }
      }

      if (eventName.compareTo("graph") == 0
        && !(m_Associator instanceof weka.core.Drawable)) {
        return false;
      }

      if (eventName.equals("batchAssociationRules")) {
        if (!(m_Associator instanceof AssociationRulesProducer)) {
          return false;
        }

        if (!((AssociationRulesProducer) m_Associator).canProduceRules()) {
          return false;
        }
      }
    }
    return true;
  }

  private String statusMessagePrefix() {
    return getCustomName()
      + "$"
      + hashCode()
      + "|"
      + ((m_Associator instanceof OptionHandler && Utils.joinOptions(
        ((OptionHandler) m_Associator).getOptions()).length() > 0) ? Utils
        .joinOptions(((OptionHandler) m_Associator).getOptions()) + "|" : "");
<<<<<<< HEAD
=======
=======
   * Returns true, if at the current time, the named event could
   * be generated. Assumes that the supplied event name is
   * an event that could be generated by this bean
   *
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in
   * time
   */
  public boolean eventGeneratable(String eventName) {
    if (eventName.compareTo("text") == 0 ||
        eventName.compareTo("graph") == 0) {
      if (!m_listenees.containsKey("dataSet") &&
	  !m_listenees.containsKey("trainingSet")) {
	return false;
      }
      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
	if (!((EventConstraints)source).eventGeneratable("trainingSet")) {
	  return false;
	}
      }
      source = m_listenees.get("dataSet");
      if (source != null && source instanceof EventConstraints) {
	if (!((EventConstraints)source).eventGeneratable("dataSet")) {
	  return false;
	}
      }

      if (eventName.compareTo("graph") == 0 &&
          !(m_Associator instanceof weka.core.Drawable)) {
        return false;
      }
    }
    return true;
  }
  
  private String statusMessagePrefix() {
    return getCustomName() + "$" + hashCode() + "|"
    + ((m_Associator instanceof OptionHandler && 
        Utils.joinOptions(((OptionHandler)m_Associator).getOptions()).length() > 0) 
        ? Utils.joinOptions(((OptionHandler)m_Associator).getOptions()) + "|"
            : "");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
