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
 *    TrainTestSplitMaker.java
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
=======
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;

/**
 * Bean that accepts data sets, training sets, test sets and produces both a
 * training and test set by randomly spliting the data
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10216 $
 */
public class TrainTestSplitMaker extends AbstractTrainAndTestSetProducer
  implements DataSourceListener, TrainingSetListener, TestSetListener,
  UserRequestAcceptor, EventConstraints, Serializable, StructureProducer {
<<<<<<< HEAD
=======
=======
/**
 * Bean that accepts data sets, training sets, test sets and produces
 * both a training and test set by randomly spliting the data
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 7059 $
 */
public class TrainTestSplitMaker
  extends AbstractTrainAndTestSetProducer
  implements DataSourceListener, TrainingSetListener, TestSetListener,
	     UserRequestAcceptor, EventConstraints, Serializable {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 7390064039444605943L;

  private double m_trainPercentage = 66;
  private int m_randomSeed = 1;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private Thread m_splitThread = null;

  private boolean m_dataProvider = false;
  private boolean m_trainingProvider = false;
  private boolean m_testProvider = false;

  public TrainTestSplitMaker() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "TrainTestSplitMaker.gif",
      BeanVisual.ICON_PATH + "TrainTestSplittMaker_animated.gif");
    m_visual.setText("TrainTestSplitMaker");
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

<<<<<<< HEAD
=======
=======
  
  private Thread m_splitThread = null;

  public TrainTestSplitMaker() {
         m_visual.loadIcons(BeanVisual.ICON_PATH
		       +"TrainTestSplitMaker.gif",
		       BeanVisual.ICON_PATH
		       +"TrainTestSplittMaker_animated.gif");
    m_visual.setText("TrainTestSplitMaker");
  }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
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
   * Global info for this bean
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return "Split an incoming data set into separate train and test sets.";
<<<<<<< HEAD
=======
=======
   *
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return Messages.getInstance().getString("TrainTestSplitMaker_GlobalInfo_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tip text info for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a <code>String</code> value
   */
  public String trainPercentTipText() {
    return "The percentage of data to go into the training set";
<<<<<<< HEAD
=======
=======
   *
   * @return a <code>String</code> value
   */
  public String trainPercentTipText() {
    return Messages.getInstance().getString("TrainTestSplitMaker_TrainPercentTipText_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set the percentage of data to be in the training portion of the split
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newTrainPercent an <code>int</code> value
   */
  public void setTrainPercent(double newTrainPercent) {
    m_trainPercentage = newTrainPercent;
  }

  /**
<<<<<<< HEAD
   * Get the percentage of the data that will be in the training portion of the
   * split
   * 
=======
<<<<<<< HEAD
   * Get the percentage of the data that will be in the training portion of the
   * split
   * 
=======
   * Get the percentage of the data that will be in the training portion of
   * the split
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an <code>int</code> value
   */
  public double getTrainPercent() {
    return m_trainPercentage;
  }

  /**
   * Tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a <code>String</code> value
   */
  public String seedTipText() {
    return "The randomization seed";
<<<<<<< HEAD
=======
=======
   *
   * @return a <code>String</code> value
   */
  public String seedTipText() {
    return Messages.getInstance().getString("TrainTestSplitMaker_SeedTipText_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set the random seed
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newSeed an <code>int</code> value
   */
  public void setSeed(int newSeed) {
    m_randomSeed = newSeed;
  }

  /**
   * Get the value of the random seed
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return an <code>int</code> value
   */
  public int getSeed() {
    return m_randomSeed;
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
    Instances trainingSet = e.getTrainingSet();
    DataSetEvent dse = new DataSetEvent(this, trainingSet);
    acceptDataSet(dse);
  }

  /**
   * Accept a test set
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param e a <code>TestSetEvent</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param e a <code>TestSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptTestSet(TestSetEvent e) {
    Instances testSet = e.getTestSet();
    DataSetEvent dse = new DataSetEvent(this, testSet);
    acceptDataSet(dse);
  }

  /**
   * Accept a data set
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param e a <code>DataSetEvent</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param e a <code>DataSetEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptDataSet(DataSetEvent e) {
    if (m_splitThread == null) {
      final Instances dataSet = new Instances(e.getDataSet());
      m_splitThread = new Thread() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        @SuppressWarnings("deprecation")
        public void run() {
          try {
            dataSet.randomize(new Random(m_randomSeed));
            int trainSize = (int) Math.round(dataSet.numInstances()
              * m_trainPercentage / 100);
            int testSize = dataSet.numInstances() - trainSize;

            Instances train = new Instances(dataSet, 0, trainSize);
            Instances test = new Instances(dataSet, trainSize, testSize);

            TrainingSetEvent tse = new TrainingSetEvent(
              TrainTestSplitMaker.this, train);
            tse.m_setNumber = 1;
            tse.m_maxSetNumber = 1;
            if (m_splitThread != null) {
              notifyTrainingSetProduced(tse);
            }

            // inform all test set listeners
            TestSetEvent teste = new TestSetEvent(TrainTestSplitMaker.this,
              test);
            teste.m_setNumber = 1;
            teste.m_maxSetNumber = 1;
            if (m_splitThread != null) {
              notifyTestSetProduced(teste);
            } else {
              if (m_logger != null) {
                m_logger.logMessage("[TrainTestSplitMaker] "
                  + statusMessagePrefix() + " Split has been canceled!");
                m_logger.statusMessage(statusMessagePrefix() + "INTERRUPTED");
              }
            }
          } catch (Exception ex) {
            stop(); // stop all processing
            if (m_logger != null) {
              m_logger.statusMessage(statusMessagePrefix()
                + "ERROR (See log for details)");
              m_logger.logMessage("[TrainTestSplitMaker] "
                + statusMessagePrefix() + " problem during split creation. "
                + ex.getMessage());
            }
            ex.printStackTrace();
          } finally {
            if (isInterrupted()) {
              if (m_logger != null) {
                m_logger.logMessage("[TrainTestSplitMaker] "
                  + statusMessagePrefix() + " Split has been canceled!");
                m_logger.statusMessage(statusMessagePrefix() + "INTERRUPTED");
              }
            }
            block(false);
          }
        }
      };
      m_splitThread.setPriority(Thread.MIN_PRIORITY);
      m_splitThread.start();

      // if (m_splitThread.isAlive()) {
      block(true);
      // }
<<<<<<< HEAD
=======
=======
	  public void run() {
	    try {
	      dataSet.randomize(new Random(m_randomSeed));
	      int trainSize = 
                (int)Math.round(dataSet.numInstances() * m_trainPercentage / 100);
	      int testSize = dataSet.numInstances() - trainSize;
      
	      Instances train = new Instances(dataSet, 0, trainSize);
	      Instances test = new Instances(dataSet, trainSize, testSize);
      
	      TrainingSetEvent tse =
		new TrainingSetEvent(TrainTestSplitMaker.this, train);
	      tse.m_setNumber = 1; tse.m_maxSetNumber = 1;
	      if (m_splitThread != null) {
		notifyTrainingSetProduced(tse);
	      }
    
	      // inform all test set listeners
	      TestSetEvent teste = 
		new TestSetEvent(TrainTestSplitMaker.this, test);
	      teste.m_setNumber = 1; teste.m_maxSetNumber = 1;
	      if (m_splitThread != null) {
		notifyTestSetProduced(teste);
	      } else {
		if (m_logger != null) {
		  m_logger.logMessage(Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_First")
		      + statusMessagePrefix() + Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Second"));
		  m_logger.statusMessage(statusMessagePrefix()
		      + Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Third"));
		}
	      }
	    } catch (Exception ex) {
	      stop(); // stop all processing
	      if (m_logger != null) {
	          m_logger.statusMessage(statusMessagePrefix()
	              + Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Fourth"));
	          m_logger.logMessage(Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Fifth")
	              + statusMessagePrefix()
	              + Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Sixth")
	              + ex.getMessage());
	      }
	      ex.printStackTrace();
	    } finally {
	      if (isInterrupted()) {
	        if (m_logger != null) {
	          m_logger.logMessage(Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Sixth_Alpha")
	              + statusMessagePrefix() + Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Seventh"));
	          m_logger.statusMessage(statusMessagePrefix()
	              + Messages.getInstance().getString("TrainTestSplitMaker_AcceptDataSet_Run_LogMessage_Text_Eighth"));
	        }
	      }
	      block(false);
	    }
	  }
	};
      m_splitThread.setPriority(Thread.MIN_PRIORITY);
      m_splitThread.start();

      //      if (m_splitThread.isAlive()) {
      block(true);
      //      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_splitThread = null;
    }
  }

  /**
   * Notify test set listeners that a test set is available
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param tse a <code>TestSetEvent</code> value
   */
  @SuppressWarnings("unchecked")
  protected void notifyTestSetProduced(TestSetEvent tse) {
    Vector<TestSetListener> l;
    synchronized (this) {
      l = (Vector<TestSetListener>) m_testListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        if (m_splitThread == null) {
          break;
        }
        // System.err.println("Notifying test listeners "
        // +"(Train - test split maker)");
        l.elementAt(i).acceptTestSet(tse);
<<<<<<< HEAD
=======
=======
   *
   * @param tse a <code>TestSetEvent</code> value
   */
  protected void notifyTestSetProduced(TestSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_testListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
        if (m_splitThread == null) {
          break;
        }
        //	System.err.println("Notifying test listeners "
        //			   +"(Train - test split maker)");
	((TestSetListener)l.elementAt(i)).acceptTestSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Notify training set listeners that a training set is available
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
        if (m_splitThread == null) {
          break;
        }
        // System.err.println("Notifying training listeners "
        // +"(Train - test split fold maker)");
        l.elementAt(i).acceptTrainingSet(tse);
<<<<<<< HEAD
=======
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
        if (m_splitThread == null) {
          break;
        }
        //	System.err.println("Notifying training listeners "
        //			   +"(Train - test split fold maker)");
	((TrainingSetListener)l.elementAt(i)).acceptTrainingSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Function used to stop code that calls acceptDataSet. This is needed as
   * split is performed inside a separate thread of execution.
   * 
=======
<<<<<<< HEAD
   * Function used to stop code that calls acceptDataSet. This is needed as
   * split is performed inside a separate thread of execution.
   * 
=======
   * Function used to stop code that calls acceptDataSet. This is 
   * needed as split is performed inside a separate
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
        // make sure that the thread is still alive before blocking
        if (m_splitThread.isAlive()) {
          wait();
        }
<<<<<<< HEAD
=======
=======
	// make sure that the thread is still alive before blocking
	if (m_splitThread.isAlive()) {
	  wait();
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } catch (InterruptedException ex) {
      }
    } else {
      notifyAll();
    }
  }

  /**
   * Stop processing
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("deprecation")
  @Override
  public void stop() {
    // tell the listenee (upstream bean) to stop
    if (m_listenee instanceof BeanCommon) {
      // System.err.println("Listener is BeanCommon");
      ((BeanCommon) m_listenee).stop();
<<<<<<< HEAD
=======
=======
  public void stop() {
    // tell the listenee (upstream bean) to stop
    if (m_listenee instanceof BeanCommon) {
      //      System.err.println("Listener is BeanCommon");
      ((BeanCommon)m_listenee).stop();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // stop the split thread
    if (m_splitThread != null) {
      Thread temp = m_splitThread;
      m_splitThread = null;
      temp.interrupt();
      temp.stop();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

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
  
  /**
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean isBusy() {
    return (m_splitThread != null);
  }

  /**
   * Get list of user requests
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
    if (m_splitThread != null) {
      newVector.addElement("Stop");
    }
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
<<<<<<< HEAD
=======
=======
   *
   * @param request a <code>String</code> value
   * @exception IllegalArgumentException if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    } else {
<<<<<<< HEAD
      throw new IllegalArgumentException(request
        + " not supported (TrainTestSplitMaker)");
=======
<<<<<<< HEAD
      throw new IllegalArgumentException(request
        + " not supported (TrainTestSplitMaker)");
=======
      throw new IllegalArgumentException(request + " not supported (TrainTestSplitMaker)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns true, if at the current time, the named event could be generated.
   * Assumes that the supplied event name is an event that could be generated by
   * this bean
   * 
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in time
   */
  @Override
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
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean eventGeneratable(String eventName) {
    if (m_listenee == null) {
      return false;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_listenee instanceof EventConstraints) {
      if (((EventConstraints) m_listenee).eventGeneratable("dataSet")
        || ((EventConstraints) m_listenee).eventGeneratable("trainingSet")
        || ((EventConstraints) m_listenee).eventGeneratable("testSet")) {
        return true;
      } else {
        return false;
<<<<<<< HEAD
=======
=======
    
    if (m_listenee instanceof EventConstraints) {
      if (((EventConstraints)m_listenee).eventGeneratable("dataSet") ||
	  ((EventConstraints)m_listenee).eventGeneratable("trainingSet") ||
	  ((EventConstraints)m_listenee).eventGeneratable("testSet")) {
	return true;
      } else {
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return true;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private String statusMessagePrefix() {
    return getCustomName() + "$" + hashCode() + "|";
  }
}
