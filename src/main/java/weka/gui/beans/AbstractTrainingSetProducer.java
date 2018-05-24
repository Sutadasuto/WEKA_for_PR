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
 *    AbstractTrainingSetProducer.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

import java.awt.BorderLayout;
import java.beans.EventSetDescriptor;
import java.io.Serializable;
<<<<<<< HEAD
import java.util.EventListener;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Vector;

import javax.swing.JPanel;

/**
<<<<<<< HEAD
 * Abstract class for TrainingSetProducers that contains default implementations
 * of add/remove listener methods and default visual representation
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10216 $
 * @since 1.0
 * @see TrainingSetProducer
 */
public abstract class AbstractTrainingSetProducer extends JPanel implements
  TrainingSetProducer, Visible, BeanCommon, Serializable {
=======
 * Abstract class for TrainingSetProducers that contains default
 * implementations of add/remove listener methods and default
 * visual representation
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 1.7 $
 * @since 1.0
 * @see TrainingSetProducer
 */
public abstract class AbstractTrainingSetProducer
  extends JPanel
  implements TrainingSetProducer, Visible, 
	     BeanCommon, Serializable {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -7842746199524591125L;

  /**
   * Objects listening for training set events
   */
<<<<<<< HEAD
  protected Vector<EventListener> m_listeners = new Vector<EventListener>();

  protected BeanVisual m_visual = new BeanVisual("AbstractTraingSetProducer",
    BeanVisual.ICON_PATH + "DefaultTrainTest.gif", BeanVisual.ICON_PATH
      + "DefaultTrainTest_animated.gif");

=======
  protected Vector m_listeners = new Vector();

  protected BeanVisual m_visual = 
    new BeanVisual("AbstractTraingSetProducer", 
		   BeanVisual.ICON_PATH+"DefaultTrainTest.gif",
		   BeanVisual.ICON_PATH+"DefaultTrainTest_animated.gif");

  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * non null if this object is a target for any events.
   */
  protected Object m_listenee = null;

  protected transient weka.gui.Logger m_logger = null;

  /**
   * Creates a new <code>AbstractTrainingSetProducer</code> instance.
   */
  public AbstractTrainingSetProducer() {
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
  }

  /**
   * Add a training set listener
<<<<<<< HEAD
   * 
   * @param tsl a <code>TrainingSetListener</code> value
   */
  @Override
=======
   *
   * @param tsl a <code>TrainingSetListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public synchronized void addTrainingSetListener(TrainingSetListener tsl) {
    m_listeners.addElement(tsl);
  }

  /**
   * Remove a training set listener
<<<<<<< HEAD
   * 
   * @param tsl a <code>TrainingSetListener</code> value
   */
  @Override
=======
   *
   * @param tsl a <code>TrainingSetListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public synchronized void removeTrainingSetListener(TrainingSetListener tsl) {
    m_listeners.removeElement(tsl);
  }

  /**
   * Set the visual for this bean
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
   * Get the visual for this bean
<<<<<<< HEAD
   * 
   * @return a <code>BeanVisual</code> value
   */
  @Override
  public BeanVisual getVisual() {
    return m_visual;
  }

  /**
   * Use the default visual for this bean
   */
  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "DefaultTrainTest.gif",
      BeanVisual.ICON_PATH + "DefaultTrainTest_animated.gif");
  }

  /**
   * Returns true if, at this time, the object will accept a connection
   * according to the supplied event name
   * 
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  @Override
=======
   *
   * @return a <code>BeanVisual</code> value
   */
  public BeanVisual getVisual() {
    return m_visual;
  }
  
  /**
   * Use the default visual for this bean
   */
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"DefaultTrainTest.gif",
		       BeanVisual.ICON_PATH+"DefaultTrainTest_animated.gif");
  }
  
  /**
   * Returns true if, at this time, 
   * the object will accept a connection according to the supplied
   * event name
   *
   * @param eventName the event
   * @return true if the object will accept a connection
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean connectionAllowed(String eventName) {
    return (m_listenee == null);
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
   * with respect to the supplied event name
   * 
   * @param eventName
   * @param source the source with which this object has been registered as a
   *          listener
   */
  @Override
  public synchronized void connectionNotification(String eventName,
    Object source) {
=======
   * Notify this object that it has been registered as a listener with
   * a source with respect to the supplied event name
   *
   * @param eventName
   * @param source the source with which this object has been registered as
   * a listener
   */
  public synchronized void connectionNotification(String eventName,
						  Object source) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (connectionAllowed(eventName)) {
      m_listenee = source;
    }
  }

  /**
<<<<<<< HEAD
   * Notify this object that it has been deregistered as a listener with a
   * source with respect to the supplied event name
   * 
   * @param eventName the event name
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
   * @param eventName the event name
   * @param source the source with which this object has been registered as
   * a listener
   */
  public synchronized void disconnectionNotification(String eventName,
						     Object source) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_listenee == source) {
      m_listenee = null;
    }
  }

  /**
   * Set a logger
<<<<<<< HEAD
   * 
   * @param logger a <code>weka.gui.Logger</code> value
   */
  @Override
=======
   *
   * @param logger a <code>weka.gui.Logger</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setLog(weka.gui.Logger logger) {
    m_logger = logger;
  }

  /**
<<<<<<< HEAD
   * Stop any processing that the bean might be doing. Subclass must implement
   */
  @Override
  public abstract void stop();

}
=======
   * Stop any processing that the bean might be doing.
   * Subclass must implement
   */
  public abstract void stop();

}



>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
