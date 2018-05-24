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
 *    BatchClassifierEvent.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.util.EventObject;

import weka.classifiers.Classifier;

/**
 * Class encapsulating a built classifier and a batch of instances to test on.
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 9263 $
 * @since 1.0
 * @see EventObject
 */
public class BatchClassifierEvent extends EventObject {
=======
import weka.classifiers.Classifier;

import java.util.EventObject;

/**
 * Class encapsulating a built classifier and a batch of instances to
 * test on.
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 5782 $
 * @since 1.0
 * @see EventObject
 */
public class BatchClassifierEvent
  extends EventObject {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 878097199815991084L;

  /**
   * The classifier
   */
  protected Classifier m_classifier;
<<<<<<< HEAD
  // protected Instances m_trainingSet;
=======
  //  protected Instances m_trainingSet;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Instances that can be used for testing the classifier
   */
<<<<<<< HEAD
  // protected Instances m_testSet;
  protected DataSetEvent m_testSet;

  /**
   * Instances that were used to train the classifier (may be null if not
   * available)
   */
  protected DataSetEvent m_trainSet;

  /**
   * The run number that this classifier was generated for
   */
  protected int m_runNumber = 1;

  /**
   * The maximum number of runs
=======
  //  protected Instances m_testSet;
  protected DataSetEvent m_testSet;
  
  /**
   * Instances that were used to train the classifier (may be null if not available)
   */
  protected DataSetEvent m_trainSet;
  
  /**
   * The run number that this classifier was generated for 
   */
  protected int m_runNumber = 1;
    
  /**
   * The maximum number of runs 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected int m_maxRunNumber = 1;

  /**
   * The set number for the test set
   */
  protected int m_setNumber;

  /**
   * The last set number for this series
   */
  protected int m_maxSetNumber;
<<<<<<< HEAD

  /**
   * An identifier that can be used to group all related runs/sets together.
=======
  
  /**
   * An identifier that can be used to group all related runs/sets
   * together.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected long m_groupIdentifier = Long.MAX_VALUE;

  /**
<<<<<<< HEAD
   * Label for this event
   */
  protected String m_eventLabel = "";

  /**
   * Creates a new <code>BatchClassifierEvent</code> instance.
   * 
=======
   * Creates a new <code>BatchClassifierEvent</code> instance.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param source the source object
   * @param scheme a Classifier
   * @param trsI the training instances used to train the classifier
   * @param tstI the test instances
   * @param setNum the set number of the test instances
   * @param maxSetNum the last set number in the series
   */
  public BatchClassifierEvent(Object source, Classifier scheme,
<<<<<<< HEAD
      DataSetEvent trsI, DataSetEvent tstI, int setNum, int maxSetNum) {
    super(source);
    // m_trainingSet = trnI;
=======
			 DataSetEvent trsI, DataSetEvent tstI, int setNum,
			 int maxSetNum) {
    super(source);
    //    m_trainingSet = trnI;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_classifier = scheme;
    m_testSet = tstI;
    m_trainSet = trsI;
    m_setNumber = setNum;
    m_maxSetNumber = maxSetNum;
  }
<<<<<<< HEAD

  /**
   * Creates a new <code>BatchClassifierEvent</code> instance.
   * 
=======
  
  /**
   * Creates a new <code>BatchClassifierEvent</code> instance.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param source the source object
   * @param scheme a Classifier
   * @param trsI the training instances used to train the classifier
   * @param tstI the test instances
   * @param runNum the run number
   * @param maxRunNum the maximum run number
   * @param setNum the set number of the test instances
   * @param maxSetNum the last set number in the series
   */
  public BatchClassifierEvent(Object source, Classifier scheme,
<<<<<<< HEAD
      DataSetEvent trsI, DataSetEvent tstI, int runNum, int maxRunNum,
      int setNum, int maxSetNum) {

    this(source, scheme, trsI, tstI, setNum, maxSetNum);

=======
    DataSetEvent trsI, DataSetEvent tstI, int runNum, int maxRunNum,
    int setNum, int maxSetNum) {
    
    this(source, scheme, trsI, tstI, setNum, maxSetNum);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_runNumber = runNum;
    m_maxRunNumber = maxRunNum;
  }

<<<<<<< HEAD
  /**
   * Set the label for this event.
   * 
   * @param lab the label to use
   */
  public void setLabel(String lab) {
    m_eventLabel = lab;
  }

  /**
   * Get the label for this event
   * 
   * @return the label for this event
   */
  public String getLabel() {
    return m_eventLabel;
  }

  /**
   * Get the classifier
   * 
=======
//    /**
//     * Get the training instances
//     *
//     * @return the training instances
//     */
//    public Instances getTrainingSet() {
//      return m_trainingSet;
//    }

  /**
   * Get the classifier
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the classifier
   */
  public Classifier getClassifier() {
    return m_classifier;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set the classifier
   * 
   * @param classifier the classifier
   */
  public void setClassifier(Classifier classifier) {
    m_classifier = classifier;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set the test set
   * 
   * @param tse the test set
   */
  public void setTestSet(DataSetEvent tse) {
    m_testSet = tse;
  }

  /**
   * Get the test set
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the test set
   */
  public DataSetEvent getTestSet() {
    return m_testSet;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Set the training set
   * 
   * @param tse the training set
   */
  public void setTrainSet(DataSetEvent tse) {
    m_trainSet = tse;
  }
<<<<<<< HEAD

  /**
   * Get the train set
   * 
=======
  
  /**
   * Get the train set
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the training set
   */
  public DataSetEvent getTrainSet() {
    return m_trainSet;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Get the run number.
   * 
   * @return the run number
   */
  public int getRunNumber() {
    return m_runNumber;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Get the maximum run number
   * 
   * @return the maximum run number
   */
  public int getMaxRunNumber() {
    return m_maxRunNumber;
  }

  /**
   * Get the set number (ie which fold this is)
<<<<<<< HEAD
   * 
   * @return the set number for the training and testing data sets encapsulated
   *         in this event
=======
   *
   * @return the set number for the training and testing data sets
   * encapsulated in this event
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getSetNumber() {
    return m_setNumber;
  }

  /**
<<<<<<< HEAD
   * Get the maximum set number (ie the total number of training and testing
   * sets in the series).
   * 
=======
   * Get the maximum set number (ie the total number of training
   * and testing sets in the series).
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the maximum set number
   */
  public int getMaxSetNumber() {
    return m_maxSetNumber;
  }
<<<<<<< HEAD

  public void setGroupIdentifier(long identifier) {
    m_groupIdentifier = identifier;
  }

=======
  
  public void setGroupIdentifier(long identifier) {
    m_groupIdentifier = identifier;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public long getGroupIdentifier() {
    return m_groupIdentifier;
  }
}
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
