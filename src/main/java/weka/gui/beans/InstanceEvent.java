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
 *    InstanceEvent.java
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

import weka.core.Instance;
import weka.core.Instances;

/**
 * Event that encapsulates a single instance or header information only
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 9205 $
 * @see EventObject
 */
public class InstanceEvent extends EventObject {

  /** for serialization */
  private static final long serialVersionUID = 6104920894559423946L;

  public static final int FORMAT_AVAILABLE = 0;
  public static final int INSTANCE_AVAILABLE = 1;
  public static final int BATCH_FINISHED = 2;

=======
import weka.core.Instance;
import weka.core.Instances;

import java.util.EventObject;

/**
 * Event that encapsulates a single instance or header information only
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 1.5 $
 * @see EventObject
 */
public class InstanceEvent
  extends EventObject {

  /** for serialization */
  private static final long serialVersionUID = 6104920894559423946L;
  
  public static final int FORMAT_AVAILABLE = 0;
  public static final int INSTANCE_AVAILABLE = 1;
  public static final int BATCH_FINISHED = 2;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private Instances m_structure;
  private Instance m_instance;
  private int m_status;

  /**
<<<<<<< HEAD
   * for FORMAT_AVAILABLE, if this is true then it indicates that this is not
   * the actual start of stream processing, but rather that a file/source has
   * changed via the user from the UI
   */
  protected boolean m_formatNotificationOnly = false;

  /**
   * Creates a new <code>InstanceEvent</code> instance that encapsulates a
   * single instance only.
   * 
=======
   * Creates a new <code>InstanceEvent</code> instance that encapsulates
   * a single instance only.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param source the source of the event
   * @param instance the instance
   * @param status status code (either INSTANCE_AVAILABLE or BATCH_FINISHED)
   */
  public InstanceEvent(Object source, Instance instance, int status) {
    super(source);
    m_instance = instance;
    m_status = status;
  }

  /**
<<<<<<< HEAD
   * Creates a new <code>InstanceEvent</code> instance which encapsulates header
   * information only.
   * 
=======
   * Creates a new <code>InstanceEvent</code> instance which encapsulates
   * header information only.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param source an <code>Object</code> value
   * @param structure an <code>Instances</code> value
   */
  public InstanceEvent(Object source, Instances structure) {
    super(source);
    m_structure = structure;
    m_status = FORMAT_AVAILABLE;
  }

  public InstanceEvent(Object source) {
    super(source);
  }
<<<<<<< HEAD

  /**
   * Get the instance
   * 
=======
  
  /**
   * Get the instance
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an <code>Instance</code> value
   */
  public Instance getInstance() {
    return m_instance;
  }
<<<<<<< HEAD

  /**
   * Set the instance
   * 
=======
  
  /**
   * Set the instance
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param i an <code>Instance</code> value
   */
  public void setInstance(Instance i) {
    m_instance = i;
  }

  /**
   * Get the status
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an <code>int</code> value
   */
  public int getStatus() {
    return m_status;
  }

  /**
   * Set the status
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param s an <code>int</code> value
   */
  public void setStatus(int s) {
    m_status = s;
<<<<<<< HEAD

    if (m_status != FORMAT_AVAILABLE) {
      m_formatNotificationOnly = false;
    }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set the instances structure
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param structure an <code>Instances</code> value
   */
  public void setStructure(Instances structure) {
    m_structure = structure;
    m_instance = null;
    m_status = FORMAT_AVAILABLE;
  }

  /**
<<<<<<< HEAD
   * Get the instances structure (may be null if this is not a FORMAT_AVAILABLE
   * event)
   * 
=======
   * Get the instances structure (may be null if this is not
   * a FORMAT_AVAILABLE event)
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return an <code>Instances</code> value
   */
  public Instances getStructure() {
    return m_structure;
  }
}
