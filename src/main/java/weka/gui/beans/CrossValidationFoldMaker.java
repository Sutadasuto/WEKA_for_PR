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
 *    CrossValidationFoldMaker.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
=======
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

<<<<<<< HEAD
import weka.core.Instances;

/**
 * Bean for splitting instances into training ant test sets according to a cross
 * validation
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10220 $
 */
public class CrossValidationFoldMaker extends AbstractTrainAndTestSetProducer
  implements DataSourceListener, TrainingSetListener, TestSetListener,
  UserRequestAcceptor, EventConstraints, Serializable, StructureProducer {
=======
/**
 * Bean for splitting instances into training ant test sets according to
 * a cross validation
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 7059 $
 */
public class CrossValidationFoldMaker 
  extends AbstractTrainAndTestSetProducer
  implements DataSourceListener, TrainingSetListener, TestSetListener, 
	     UserRequestAcceptor, EventConstraints, Serializable {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -6350179298851891512L;

  private int m_numFolds = 10;
  private int m_randomSeed = 1;

<<<<<<< HEAD
  private boolean m_preserveOrder = false;

  private transient Thread m_foldThread = null;

  private boolean m_dataProvider = false;
  private boolean m_trainingProvider = false;
  private boolean m_testProvider = false;

  public CrossValidationFoldMaker() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "CrossValidationFoldMaker.gif",
      BeanVisual.ICON_PATH + "CrossValidationFoldMaker_animated.gif");
    m_visual.setText("CrossValidationFoldMaker");
  }

  private Instances getUpstreamStructure() {
    if (m_listenee != null && m_listenee instanceof StructureProducer) {
      if (m_dataProvider) {
        return ((StructureProducer) m_listenee).getStructure("dataSet");
      }
      if (m_trainingProvider) {
        return ((StructureProducer) m_listenee).getStructure("trainingSet");
      }
      if (m_testProvider) {
        return ((StructureProducer) m_listenee).getStructure("testSet");
      }
    }
    return null;
  }

  /**
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
    if (!eventName.equals("trainingSet") && !eventName.equals("testSet")) {
      return null;
    }
    if (m_listenee == null) {
      return null;
    }

    if (eventName.equals("trainingSet") && m_trainingListeners.size() == 0) {
      // downstream has asked for the structure of something that we
      // are not producing at the moment
      return null;
    }

    if (eventName.equals("testSet") && m_testListeners.size() == 0) {
      // downstream has asked for the structure of something that we
      // are not producing at the moment
      return null;
    }

    return getUpstreamStructure();
  }

  /**
   * Notify this object that it has been registered as a listener with a source
   * with respect to the supplied event name
   * 
   * @param eventName the event
   * @param source the source with which this object has been registered as a
   *          listener
   */
  @Override
  public synchronized void connectionNotification(String eventName,
    Object source) {
    super.connectionNotification(eventName, source);

    if (connectionAllowed(eventName)) {
      if (eventName.equals("dataSet")) {
        m_dataProvider = true;
        m_trainingProvider = false;
        m_testProvider = false;
      } else if (eventName.equals("trainingSet")) {
        m_dataProvider = false;
        m_trainingProvider = true;
        m_testProvider = false;
      } else if (eventName.equals("testSet")) {
        m_dataProvider = false;
        m_trainingProvider = false;
        m_testProvider = true;
      }
    }
  }

  /**
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
    super.disconnectionNotification(eventName, source);

    if (m_listenee == null) {
      m_dataProvider = false;
      m_trainingProvider = false;
      m_testProvider = false;
    }
  }

=======
  private transient Thread m_foldThread = null;

  public CrossValidationFoldMaker() {
    m_visual.loadIcons(BeanVisual.ICON_PATH
		       +"CrossValidationFoldMaker.gif",
		       BeanVisual.ICON_PATH
		       +"CrossValidationFoldMaker_animated.gif");
    m_visual.setText("CrossValidationFoldMaker");
  }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
   * Global info for this bean
<<<<<<< HEAD
   * 
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return "Split an incoming data set into cross validation folds. "
      + "Separate train and test sets are produced for each of the k folds.";
=======
   *
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return Messages.getInstance().getString("CrossValidationFoldMaker_GlobalInfo_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Accept a training set
<<<<<<< HEAD
   * 
   * @param e a <code>TrainingSetEvent</code> value
   */
  @Override
=======
   *
   * @param e a <code>TrainingSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void acceptTrainingSet(TrainingSetEvent e) {
    Instances trainingSet = e.getTrainingSet();
    DataSetEvent dse = new DataSetEvent(this, trainingSet);
    acceptDataSet(dse);
  }

  /**
   * Accept a test set
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
    Instances testSet = e.getTestSet();
    DataSetEvent dse = new DataSetEvent(this, testSet);
    acceptDataSet(dse);
  }

  /**
   * Accept a data set
<<<<<<< HEAD
   * 
   * @param e a <code>DataSetEvent</code> value
   */
  @Override
=======
   *
   * @param e a <code>DataSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void acceptDataSet(DataSetEvent e) {
    if (e.isStructureOnly()) {
      // Pass on structure to training and test set listeners
      TrainingSetEvent tse = new TrainingSetEvent(this, e.getDataSet());
      TestSetEvent tsee = new TestSetEvent(this, e.getDataSet());
      notifyTrainingSetProduced(tse);
      notifyTestSetProduced(tsee);
      return;
    }
    if (m_foldThread == null) {
      final Instances dataSet = new Instances(e.getDataSet());
      m_foldThread = new Thread() {
<<<<<<< HEAD
        @Override
        public void run() {
          boolean errorOccurred = false;
          try {
            Random random = new Random(getSeed());
            if (!m_preserveOrder) {
              dataSet.randomize(random);
            }
            if (dataSet.classIndex() >= 0
              && dataSet.attribute(dataSet.classIndex()).isNominal()
              && !m_preserveOrder) {
              dataSet.stratify(getFolds());
              if (m_logger != null) {
                m_logger.logMessage("[" + getCustomName() + "] "
                  + "stratifying data");
              }
            }

            for (int i = 0; i < getFolds(); i++) {
              if (m_foldThread == null) {
                if (m_logger != null) {
                  m_logger.logMessage("[" + getCustomName()
                    + "] Cross validation has been canceled!");
                }
                // exit gracefully
                break;
              }
              Instances train = (!m_preserveOrder) ? dataSet.trainCV(
                getFolds(), i, random) : dataSet.trainCV(getFolds(), i);
              Instances test = dataSet.testCV(getFolds(), i);

              // inform all training set listeners
              TrainingSetEvent tse = new TrainingSetEvent(this, train);
              tse.m_setNumber = i + 1;
              tse.m_maxSetNumber = getFolds();
              String msg = getCustomName() + "$"
                + CrossValidationFoldMaker.this.hashCode() + "|";
              if (m_logger != null) {
                m_logger.statusMessage(msg + "seed: " + getSeed() + " folds: "
                  + getFolds() + "|Training fold " + (i + 1));
              }
              if (m_foldThread != null) {
                // System.err.println("--Just before notify training set");
                notifyTrainingSetProduced(tse);
                // System.err.println("---Just after notify");
              }

              // inform all test set listeners
              TestSetEvent teste = new TestSetEvent(this, test);
              teste.m_setNumber = i + 1;
              teste.m_maxSetNumber = getFolds();

              if (m_logger != null) {
                m_logger.statusMessage(msg + "seed: " + getSeed() + " folds: "
                  + getFolds() + "|Test fold " + (i + 1));
              }
              if (m_foldThread != null) {
                notifyTestSetProduced(teste);
              }
            }
          } catch (Exception ex) {
            // stop all processing
            errorOccurred = true;
            if (m_logger != null) {
              m_logger.logMessage("[" + getCustomName()
                + "] problem during fold creation. " + ex.getMessage());
            }
            ex.printStackTrace();
            CrossValidationFoldMaker.this.stop();
          } finally {
            m_foldThread = null;

            if (errorOccurred) {
              if (m_logger != null) {
                m_logger.statusMessage(getCustomName() + "$"
                  + CrossValidationFoldMaker.this.hashCode() + "|"
                  + "ERROR (See log for details).");
              }
            } else if (isInterrupted()) {
              String msg = "[" + getCustomName()
                + "] Cross validation interrupted";
              if (m_logger != null) {
                m_logger.logMessage("[" + getCustomName()
                  + "] Cross validation interrupted");
                m_logger.statusMessage(getCustomName() + "$"
                  + CrossValidationFoldMaker.this.hashCode() + "|"
                  + "INTERRUPTED");
              } else {
                System.err.println(msg);
              }
            } else {
              String msg = getCustomName() + "$"
                + CrossValidationFoldMaker.this.hashCode() + "|";
              if (m_logger != null) {
                m_logger.statusMessage(msg + "Finished.");
              }
            }
            block(false);
          }
        }
      };
      m_foldThread.setPriority(Thread.MIN_PRIORITY);
      m_foldThread.start();

      // if (m_foldThread.isAlive()) {
      block(true);
      // }
=======
	  public void run() {
	    boolean errorOccurred = false;
	    try {
	      Random random = new Random(getSeed());
	      dataSet.randomize(random);
	      if (dataSet.classIndex() >= 0 && 
		  dataSet.attribute(dataSet.classIndex()).isNominal()) {
		dataSet.stratify(getFolds());
		if (m_logger != null) {
		  m_logger.logMessage(Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_First") + getCustomName() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Second"));
		}
	      }
	      
	      for (int i = 0; i < getFolds(); i++) {
		if (m_foldThread == null) {
		  if (m_logger != null) {
		    m_logger.logMessage(Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Third") + getCustomName() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Fourth"));
		  }
		  // exit gracefully
		  break;
		}
		Instances train = dataSet.trainCV(getFolds(), i, random);
		Instances test  = dataSet.testCV(getFolds(), i);
		
		// inform all training set listeners
		TrainingSetEvent tse = new TrainingSetEvent(this, train);
		tse.m_setNumber = i+1; tse.m_maxSetNumber = getFolds();
		String msg = getCustomName() + "$" 
		  + CrossValidationFoldMaker.this.hashCode() + "|";
		if (m_logger != null) {
		  m_logger.statusMessage(msg + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_First") + getSeed() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Second")
		      + getFolds() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Third") + (i+1));
		}
		if (m_foldThread != null) {
		  //		  System.err.println("--Just before notify training set");
		  notifyTrainingSetProduced(tse);
		  //		  System.err.println("---Just after notify");
		}
	      
		// inform all test set listeners
		TestSetEvent teste = new TestSetEvent(this, test);
		teste.m_setNumber = i+1; teste.m_maxSetNumber = getFolds();
		
		if (m_logger != null) {
		  m_logger.statusMessage(msg + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Fourth") + getSeed() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Fifth")
		      + getFolds() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Sixth") + (i+1));
		}
		if (m_foldThread != null) {
		  notifyTestSetProduced(teste);
		}
	      }
	    } catch (Exception ex) {
	      // stop all processing
	      errorOccurred = true;
	      CrossValidationFoldMaker.this.stop();
	      if (m_logger != null) {
	        m_logger.logMessage(Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Fifth") + getCustomName() 
	            + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Sixth")
	            + ex.getMessage());
	      }
	      ex.printStackTrace();
	    } finally {
	      m_foldThread = null;
	      if (errorOccurred) {
	        if (m_logger != null) {
	          m_logger.statusMessage(getCustomName() 
	              + "$" + CrossValidationFoldMaker.this.hashCode()
	              + "|"
	              + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Seventh"));
	        }
	      } else if (isInterrupted()) {
	        String msg = Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_Msg_Text_First") + getCustomName() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_Msg_Text_Second");
	        if (m_logger != null) {
	          m_logger.logMessage(Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Fifth") + getCustomName() + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_LogMessage_Text_Sixth_Alpha"));
	          m_logger.statusMessage(getCustomName() + "$"
	              + CrossValidationFoldMaker.this.hashCode() + "|"
	              + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Eighth"));
	        } else {
	          System.err.println(msg);
	        }
	      } else {
	        String msg = getCustomName() + "$" 
	        + CrossValidationFoldMaker.this.hashCode() + "|";
	        if (m_logger != null) {
	          m_logger.statusMessage(msg + Messages.getInstance().getString("CrossValidationFoldMaker_AcceptDataSet_StatusMessage_Text_Nineth"));
	        }
	      }
	      block(false);
	    }
	  }
	};
      m_foldThread.setPriority(Thread.MIN_PRIORITY);
      m_foldThread.start();

      //      if (m_foldThread.isAlive()) {
      block(true);
	//      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_foldThread = null;
    }
  }

<<<<<<< HEAD
  /**
   * Notify all test set listeners of a TestSet event
   * 
   * @param tse a <code>TestSetEvent</code> value
   */
  @SuppressWarnings("unchecked")
  private void notifyTestSetProduced(TestSetEvent tse) {
    Vector<TestSetListener> l;
    synchronized (this) {
      l = (Vector<TestSetListener>) m_testListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        if (m_foldThread == null) {
          break;
        }
        // System.err.println("Notifying test listeners "
        // +"(cross validation fold maker)");
        l.elementAt(i).acceptTestSet(tse);
=======

  /**
   * Notify all test set listeners of a TestSet event
   *
   * @param tse a <code>TestSetEvent</code> value
   */
  private void notifyTestSetProduced(TestSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_testListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
        if (m_foldThread == null) {
          break;
        }
	//	System.err.println("Notifying test listeners "
	//			   +"(cross validation fold maker)");
	((TestSetListener)l.elementAt(i)).acceptTestSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Notify all listeners of a TrainingSet event
<<<<<<< HEAD
   * 
   * @param tse a <code>TrainingSetEvent</code> value
   */
  @SuppressWarnings("unchecked")
  protected void notifyTrainingSetProduced(TrainingSetEvent tse) {
    Vector<TrainingSetListener> l;
    synchronized (this) {
      l = (Vector<TrainingSetListener>) m_trainingListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        if (m_foldThread == null) {
          break;
        }
        // System.err.println("Notifying training listeners "
        // +"(cross validation fold maker)");
        l.elementAt(i).acceptTrainingSet(tse);
=======
   *
   * @param tse a <code>TrainingSetEvent</code> value
   */
  protected void notifyTrainingSetProduced(TrainingSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_trainingListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
        if (m_foldThread == null) {
          break;
        }
	//	System.err.println("Notifying training listeners "
	//			   +"(cross validation fold maker)");
	((TrainingSetListener)l.elementAt(i)).acceptTrainingSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Set the number of folds for the cross validation
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param numFolds an <code>int</code> value
   */
  public void setFolds(int numFolds) {
    m_numFolds = numFolds;
  }
<<<<<<< HEAD

  /**
   * Get the currently set number of folds
   * 
=======
  
  /**
   * Get the currently set number of folds
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an <code>int</code> value
   */
  public int getFolds() {
    return m_numFolds;
  }

  /**
   * Tip text for this property
<<<<<<< HEAD
   * 
   * @return a <code>String</code> value
   */
  public String foldsTipText() {
    return "The number of train and test splits to produce";
  }

  /**
   * Set the seed
   * 
=======
   *
   * @return a <code>String</code> value
   */
  public String foldsTipText() {
    return Messages.getInstance().getString("CrossValidationFoldMaker_FoldsTipText_Text");
  }
    
  /**
   * Set the seed
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param randomSeed an <code>int</code> value
   */
  public void setSeed(int randomSeed) {
    m_randomSeed = randomSeed;
  }
<<<<<<< HEAD

  /**
   * Get the currently set seed
   * 
=======
  
  /**
   * Get the currently set seed
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an <code>int</code> value
   */
  public int getSeed() {
    return m_randomSeed;
  }
<<<<<<< HEAD

  /**
   * Tip text for this property
   * 
   * @return a <code>String</code> value
   */
  public String seedTipText() {
    return "The randomization seed";
  }

  /**
   * Returns true if the order of the incoming instances is to be preserved
   * under cross-validation (no randomization or stratification is done in this
   * case).
   * 
   * @return true if the order of the incoming instances is to be preserved.
   */
  public boolean getPreserveOrder() {
    return m_preserveOrder;
  }

  /**
   * Sets whether the order of the incoming instances is to be preserved under
   * cross-validation (no randomization or stratification is done in this case).
   * 
   * @param p true if the order is to be preserved.
   */
  public void setPreserveOrder(boolean p) {
    m_preserveOrder = p;
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
=======
  
  /**
   * Tip text for this property
   *
   * @return a <code>String</code> value
   */
  public String seedTipText() {
    return Messages.getInstance().getString("CrossValidationFoldMaker_SeedTipText_Text");
  }
  
  /**
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean isBusy() {
    return (m_foldThread != null);
  }

  /**
   * Stop any action
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

    // stop the fold thread
    if (m_foldThread != null) {
      Thread temp = m_foldThread;
      m_foldThread = null;
      temp.interrupt();
      temp.stop();
    }
  }

  /**
<<<<<<< HEAD
   * Function used to stop code that calls acceptDataSet. This is needed as
   * cross validation is performed inside a separate thread of execution.
   * 
=======
   * Function used to stop code that calls acceptDataSet. This is 
   * needed as cross validation is performed inside a separate
   * thread of execution.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param tf a <code>boolean</code> value
   */
  private synchronized void block(boolean tf) {
    if (tf) {
      try {
<<<<<<< HEAD
        // make sure the thread is still running before we block
        if (m_foldThread != null && m_foldThread.isAlive()) {
          wait();
        }
=======
	// make sure the thread is still running before we block
	if (m_foldThread.isAlive()) {
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
   * Return an enumeration of user requests
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
    if (m_foldThread != null) {
      newVector.addElement("Stop");
    }
    return newVector.elements();
  }

  /**
   * Perform the named request
<<<<<<< HEAD
   * 
   * @param request a <code>String</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
=======
   *
   * @param request a <code>String</code> value
   * @exception IllegalArgumentException if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    } else {
      throw new IllegalArgumentException(request
<<<<<<< HEAD
        + " not supported (CrossValidation)");
=======
					 + Messages.getInstance().getString("CrossValidationFoldMaker_PerformRequest_IllegalArgumentException_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
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
    if (m_listenee == null) {
      return false;
    }
<<<<<<< HEAD

    if (m_listenee instanceof EventConstraints) {
      if (((EventConstraints) m_listenee).eventGeneratable("dataSet")
        || ((EventConstraints) m_listenee).eventGeneratable("trainingSet")
        || ((EventConstraints) m_listenee).eventGeneratable("testSet")) {
        return true;
      } else {
        return false;
=======
    
    if (m_listenee instanceof EventConstraints) {
      if (((EventConstraints)m_listenee).eventGeneratable("dataSet") ||
	  ((EventConstraints)m_listenee).eventGeneratable("trainingSet") ||
	  ((EventConstraints)m_listenee).eventGeneratable("testSet")) {
	return true;
      } else {
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return true;
  }
}
