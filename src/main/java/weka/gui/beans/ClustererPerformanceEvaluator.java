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
 *    ClustererPerformanceEvaluator.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
=======
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.Clusterer;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

<<<<<<< HEAD
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.Clusterer;

/**
 * A bean that evaluates the performance of batch trained clusterers
 * 
 * @author <a href="mailto:mutter@cs.waikato.ac.nz">Stefan Mutter</a>
 * @version $Revision: 10220 $
 */
public class ClustererPerformanceEvaluator extends AbstractEvaluator implements
  BatchClustererListener, Serializable, UserRequestAcceptor, EventConstraints {
=======
/**
 * A bean that evaluates the performance of batch trained clusterers
 *
 * @author <a href="mailto:mutter@cs.waikato.ac.nz">Stefan Mutter</a>
 * @version $Revision: 7059 $
 */
public class ClustererPerformanceEvaluator
  extends AbstractEvaluator
  implements BatchClustererListener, Serializable, UserRequestAcceptor, 
             EventConstraints {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 8041163601333978584L;

  /**
   * Evaluation object used for evaluating a clusterer
   */
  private transient ClusterEvaluation m_eval;

  /**
   * Holds the clusterer to be evaluated
   */
  private transient Clusterer m_clusterer;

  private transient Thread m_evaluateThread = null;
<<<<<<< HEAD

  private final Vector<TextListener> m_textListeners = new Vector<TextListener>();

  public ClustererPerformanceEvaluator() {
    m_visual.loadIcons(BeanVisual.ICON_PATH
      + "ClustererPerformanceEvaluator.gif", BeanVisual.ICON_PATH
      + "ClustererPerformanceEvaluator_animated.gif");
=======
  
  private Vector m_textListeners = new Vector();

  public ClustererPerformanceEvaluator() {
    m_visual.loadIcons(BeanVisual.ICON_PATH
		       +"ClustererPerformanceEvaluator.gif",
		       BeanVisual.ICON_PATH
		       +"ClustererPerformanceEvaluator_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_visual.setText("ClustererPerformanceEvaluator");
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
  public String getCustomName() {
    return m_visual.getText();
  }

  /**
   * Global info for this bean
   * 
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return "Evaluate the performance of batch trained clusterers.";
=======
  public String getCustomName() {
    return m_visual.getText();
  }
  
  /**
   * Global info for this bean
   *
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return Messages.getInstance().getString("ClustererPerformanceEvaluator_GlobalInfo_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Accept a clusterer to be evaluated
<<<<<<< HEAD
   * 
   * @param ce a <code>BatchClustererEvent</code> value
   */
  @Override
  public void acceptClusterer(final BatchClustererEvent ce) {

=======
   *
   * @param ce a <code>BatchClustererEvent</code> value
   */
  public void acceptClusterer(final BatchClustererEvent ce) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (ce.getTestSet().isStructureOnly()) {
      return; // cant evaluate empty instances
    }
    try {
      if (m_evaluateThread == null) {
<<<<<<< HEAD
        m_evaluateThread = new Thread() {
          @Override
          @SuppressWarnings("deprecation")
          public void run() {
            boolean numericClass = false;
            // final String oldText = m_visual.getText();
            try {
              if (ce.getSetNumber() == 1 /*
                                          * || ce.getClusterer() != m_clusterer
                                          */) {
                m_eval = new ClusterEvaluation();
                m_clusterer = ce.getClusterer();
                m_eval.setClusterer(m_clusterer);
              }

              if (ce.getSetNumber() <= ce.getMaxSetNumber()) {
                // m_visual.setText("Evaluating ("+ce.getSetNumber()+")...");
                if (m_logger != null) {
                  m_logger.statusMessage(statusMessagePrefix() + "Evaluating ("
                    + ce.getSetNumber() + ")...");
                }
                m_visual.setAnimated();
                if (ce.getTestSet().getDataSet().classIndex() != -1
                  && ce.getTestSet().getDataSet().classAttribute().isNumeric()) {
                  numericClass = true;
                  ce.getTestSet().getDataSet().setClassIndex(-1);
                }
                m_eval.evaluateClusterer(ce.getTestSet().getDataSet());
              }

              if (ce.getSetNumber() == ce.getMaxSetNumber()) {
                String textTitle = m_clusterer.getClass().getName();
                textTitle = textTitle.substring(textTitle.lastIndexOf('.') + 1,
                  textTitle.length());
                String test;
                if (ce.getTestOrTrain() == 0) {
                  test = "test";
                } else {
                  test = "training";
                }
                String resultT = "=== Evaluation result for " + test
                  + " instances ===\n\n" + "Scheme: " + textTitle + "\n"
                  + "Relation: " + ce.getTestSet().getDataSet().relationName()
                  + "\n\n" + m_eval.clusterResultsToString();
                if (numericClass) {
                  resultT = resultT
                    + "\n\nNo class based evaluation possible. Class attribute has to be nominal.";
                }
                TextEvent te = new TextEvent(
                  ClustererPerformanceEvaluator.this, resultT, textTitle);
                notifyTextListeners(te);
                if (m_logger != null) {
                  m_logger.statusMessage(statusMessagePrefix() + "Finished.");
                }
              }
            } catch (Exception ex) {
              // stop all processing
              ClustererPerformanceEvaluator.this.stop();
              if (m_logger != null) {
                m_logger.statusMessage(statusMessagePrefix()
                  + "ERROR (see log for details");
                m_logger.logMessage("[ClustererPerformanceEvaluator] "
                  + statusMessagePrefix()
                  + " problem while evaluating clusterer. " + ex.getMessage());
              }
              ex.printStackTrace();
            } finally {
              // m_visual.setText(oldText);
              m_visual.setStatic();
              m_evaluateThread = null;
              if (isInterrupted()) {
                if (m_logger != null) {
                  m_logger.logMessage("[" + getCustomName()
                    + "] Evaluation interrupted!");
                  m_logger.statusMessage(statusMessagePrefix() + "INTERRUPTED");
                }
              }
              block(false);
            }
          }
        };
        m_evaluateThread.setPriority(Thread.MIN_PRIORITY);
        m_evaluateThread.start();

        // make sure the thread is still running before we block
        // if (m_evaluateThread.isAlive()) {
        block(true);
        // }
        m_evaluateThread = null;
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
=======
	m_evaluateThread = new Thread() {
	    public void run() {
              boolean numericClass = false;  
//	      final String oldText = m_visual.getText();
	      try {
		if (ce.getSetNumber() == 1 /*|| 
		    ce.getClusterer() != m_clusterer */) {
		  m_eval = new ClusterEvaluation();
		  m_clusterer = ce.getClusterer();
                  m_eval.setClusterer(m_clusterer);
		}
		
		if (ce.getSetNumber() <= ce.getMaxSetNumber()) {
//		  m_visual.setText("Evaluating ("+ce.getSetNumber()+")...");
		  if (m_logger != null) {
		    m_logger.statusMessage(statusMessagePrefix()
					   + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_StatusMessage_Text_First") + ce.getSetNumber()
					   + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_StatusMessage_Text_Second"));
		  }
		  m_visual.setAnimated();
                  if(ce.getTestSet().getDataSet().classIndex() != -1 && ce.getTestSet().getDataSet().classAttribute().isNumeric()){
                    numericClass = true;
                    ce.getTestSet().getDataSet().setClassIndex(-1);
                  } 
                  m_eval.evaluateClusterer(ce.getTestSet().getDataSet());
		}
		
		if (ce.getSetNumber() == ce.getMaxSetNumber()) {
		  String textTitle = m_clusterer.getClass().getName();
		  textTitle = 
		    textTitle.substring(textTitle.lastIndexOf('.')+1,
					textTitle.length());
                  String test;
                  if(ce.getTestOrTrain() == 0)
                      test = Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_Test_Text_First");
                  else
                      test = Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_Test_Text_Second");
		  String resultT = Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_ResultT_Text_First") + test 
		  	+ Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_ResultT_Text_Second") 
		    + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_ResultT_Text_Third") + textTitle 
		    + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_ResultT_Text_Fourth") + ce.getTestSet().getDataSet().relationName()
		    + "\n\n" + m_eval.clusterResultsToString();
                  if(numericClass)
                      resultT = resultT + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_ResultT_Text_Fifth");
		  TextEvent te = 
		    new TextEvent(ClustererPerformanceEvaluator.this, 
				  resultT,
				  textTitle);
		  notifyTextListeners(te);
		  if (m_logger != null) {
		    m_logger.statusMessage(statusMessagePrefix() + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_StatusMessage_Text_Third"));
		  }
		}
	      } catch (Exception ex) {
	        // stop all processing
	        ClustererPerformanceEvaluator.this.stop();
	        if (m_logger != null) {
	          m_logger.statusMessage(statusMessagePrefix()
	              + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_StatusMessage_Text_Fourth"));
	          m_logger.logMessage(Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_LogMessage_Text_First")
	              + statusMessagePrefix()
	              + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_LogMessage_Text_Second") + ex.getMessage());
	        }
		ex.printStackTrace();
	      } finally {
//		m_visual.setText(oldText);
		m_visual.setStatic();
		m_evaluateThread = null;
		if (isInterrupted()) {
		  if (m_logger != null) {
		    m_logger.logMessage(Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_LogMessage_Text_Third") + getCustomName() 
		        + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_LogMessage_Text_Fourth"));
		    m_logger.statusMessage(statusMessagePrefix() 
		        + Messages.getInstance().getString("ClustererPerformanceEvaluator_AcceptClusterer_LogMessage_Text_Fifth"));
		  }
		}
		block(false);
	      }
	    }
	  };
	m_evaluateThread.setPriority(Thread.MIN_PRIORITY);
	m_evaluateThread.start();

	// make sure the thread is still running before we block
	//	if (m_evaluateThread.isAlive()) {
	block(true);
	  //	}
	m_evaluateThread = null;
      }
    }  catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  /**
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean isBusy() {
    return (m_evaluateThread != null);
  }

  /**
   * Try and stop any action
   */
<<<<<<< HEAD
  @Override
  @SuppressWarnings("deprecation")
  public void stop() {
    // tell the listenee (upstream bean) to stop
    if (m_listenee instanceof BeanCommon) {
      // System.err.println("Listener is BeanCommon");
      ((BeanCommon) m_listenee).stop();
=======
  public void stop() {
    // tell the listenee (upstream bean) to stop
    if (m_listenee instanceof BeanCommon) {
      //      System.err.println("Listener is BeanCommon");
      ((BeanCommon)m_listenee).stop();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    // stop the evaluate thread
    if (m_evaluateThread != null) {
      m_evaluateThread.interrupt();
      m_evaluateThread.stop();
      m_evaluateThread = null;
      m_visual.setStatic();
    }
  }
<<<<<<< HEAD

  /**
   * Function used to stop code that calls acceptClusterer. This is needed as
   * clusterer evaluation is performed inside a separate thread of execution.
   * 
=======
  
  /**
   * Function used to stop code that calls acceptClusterer. This is 
   * needed as clusterer evaluation is performed inside a separate
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
        if (m_evaluateThread != null && m_evaluateThread.isAlive()) {
          wait();
        }
=======
	// only block if thread is still doing something useful!
	if (m_evaluateThread != null && m_evaluateThread.isAlive()) {
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
   * Return an enumeration of user activated requests for this bean
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
    if (m_evaluateThread != null) {
      newVector.addElement("Stop");
    }
    return newVector.elements();
  }

  /**
   * Perform the named request
<<<<<<< HEAD
   * 
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
=======
   *
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    } else {
<<<<<<< HEAD
      throw new IllegalArgumentException(request

      + " not supported (ClustererPerformanceEvaluator)");
=======
      throw new 
	IllegalArgumentException(request

		    + Messages.getInstance().getString("ClustererPerformanceEvaluator_PerformRequest_IllegalArgumentException_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
<<<<<<< HEAD

  /**
   * Notify all text listeners of a TextEvent
   * 
   * @param te a <code>TextEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyTextListeners(TextEvent te) {
    Vector<TextListener> l;
    synchronized (this) {
      l = (Vector<TextListener>) m_textListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        // System.err.println("Notifying text listeners "
        // +"(ClustererPerformanceEvaluator)");
        l.elementAt(i).acceptText(te);
=======
  
  /**
   * Notify all text listeners of a TextEvent
   *
   * @param te a <code>TextEvent</code> value
   */
  private void notifyTextListeners(TextEvent te) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_textListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	//	System.err.println("Notifying text listeners "
	//			   +"(ClustererPerformanceEvaluator)");
	((TextListener)l.elementAt(i)).acceptText(te);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Returns true, if at the current time, the named event could be generated.
   * Assumes that supplied event names are names of events that could be
   * generated by this bean.
   * 
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in time
   */
  @Override
=======
   * Returns true, if at the current time, the named event could
   * be generated. Assumes that supplied event names are names of
   * events that could be generated by this bean.
   *
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in
   * time
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean eventGeneratable(String eventName) {
    if (m_listenee == null) {
      return false;
    }

    if (m_listenee instanceof EventConstraints) {
<<<<<<< HEAD
      if (!((EventConstraints) m_listenee).eventGeneratable("batchClusterer")) {
        return false;
=======
      if (!((EventConstraints)m_listenee).
	  eventGeneratable("batchClusterer")) {
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return true;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private String statusMessagePrefix() {
    return getCustomName() + "$" + hashCode() + "|";
  }
}
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
