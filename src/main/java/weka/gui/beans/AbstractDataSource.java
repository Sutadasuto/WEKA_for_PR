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
 *    AbstractDataSource.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

import java.awt.BorderLayout;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextChildSupport;
import java.io.Serializable;
<<<<<<< HEAD
import java.util.EventListener;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Vector;

import javax.swing.JPanel;

/**
 * Abstract class for objects that can provide instances from some source
<<<<<<< HEAD
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10216 $
=======
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 1.4 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @since 1.0
 * @see JPanel
 * @see DataSource
 * @see Serializable
 */
<<<<<<< HEAD
public abstract class AbstractDataSource extends JPanel implements DataSource,
  Visible, Serializable, BeanContextChild {
=======
public abstract class AbstractDataSource
  extends JPanel
  implements DataSource, Visible, Serializable, BeanContextChild {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -4127257701890044793L;

  /**
   * True if this bean's appearance is the design mode appearance
   */
  protected boolean m_design;
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
  protected BeanContextChildSupport m_bcSupport = 
    new BeanContextChildSupport(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Default visual for data sources
   */
<<<<<<< HEAD
  protected BeanVisual m_visual = new BeanVisual("AbstractDataSource",
    BeanVisual.ICON_PATH + "DefaultDataSource.gif", BeanVisual.ICON_PATH
      + "DefaultDataSource_animated.gif");

  /**
   * Objects listening for events from data sources
   */
  protected Vector<EventListener> m_listeners;

  /**
   * Creates a new <code>AbstractDataSource</code> instance.
   * 
   */
  public AbstractDataSource() {
    useDefaultVisual();
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
    m_listeners = new Vector<EventListener>();
=======
  protected BeanVisual m_visual = 
    new BeanVisual("AbstractDataSource", 
		   BeanVisual.ICON_PATH+"DefaultDataSource.gif",
		   BeanVisual.ICON_PATH+"DefaultDataSource_animated.gif");
  
  /**
   * Objects listening for events from data sources
   */
  protected Vector m_listeners;

  /**
   * Creates a new <code>AbstractDataSource</code> instance.
   *
   */
  public AbstractDataSource() {    
    useDefaultVisual();
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
    m_listeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Add a listener
<<<<<<< HEAD
   * 
   * @param dsl a <code>DataSourceListener</code> value
   */
  @Override
  public synchronized void addDataSourceListener(DataSourceListener dsl) {
    m_listeners.addElement(dsl);
  }

  /**
   * Remove a listener
   * 
   * @param dsl a <code>DataSourceListener</code> value
   */
  @Override
=======
   *
   * @param dsl a <code>DataSourceListener</code> value
   */
  public synchronized void addDataSourceListener(DataSourceListener dsl) {
    m_listeners.addElement(dsl);
  }
  
  /**
   * Remove a listener
   *
   * @param dsl a <code>DataSourceListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public synchronized void removeDataSourceListener(DataSourceListener dsl) {
    m_listeners.remove(dsl);
  }

  /**
   * Add an instance listener
<<<<<<< HEAD
   * 
   * @param dsl a <code>InstanceListener</code> value
   */
  @Override
  public synchronized void addInstanceListener(InstanceListener dsl) {
    m_listeners.add(dsl);
  }

  /**
   * Remove an instance listener
   * 
   * @param dsl a <code>InstanceListener</code> value
   */
  @Override
=======
   *
   * @param dsl a <code>InstanceListener</code> value
   */
  public synchronized void addInstanceListener(InstanceListener dsl) {
    m_listeners.addElement(dsl);
  }
  
  /**
   * Remove an instance listener
   *
   * @param dsl a <code>InstanceListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public synchronized void removeInstanceListener(InstanceListener dsl) {
    m_listeners.remove(dsl);
  }

  /**
   * Set the visual for this data source
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
   * Get the visual being used by this data source.
<<<<<<< HEAD
   * 
   */
  @Override
=======
   *
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public BeanVisual getVisual() {
    return m_visual;
  }

  /**
   * Use the default images for a data source
<<<<<<< HEAD
   * 
   */
  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "DefaultDataSource.gif",
      BeanVisual.ICON_PATH + "DefaultDataSource_animated.gif");
=======
   *
   */
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"DefaultDataSource.gif",
		       BeanVisual.ICON_PATH+"DefaultDataSource_animated.gif");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set a bean context for this bean
<<<<<<< HEAD
   * 
   * @param bc a <code>BeanContext</code> value
   */
  @Override
=======
   *
   * @param bc a <code>BeanContext</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setBeanContext(BeanContext bc) {
    m_beanContext = bc;
    m_design = m_beanContext.isDesignTime();
  }

  /**
   * Return the bean context (if any) that this bean is embedded in
<<<<<<< HEAD
   * 
   * @return a <code>BeanContext</code> value
   */
  @Override
=======
   *
   * @return a <code>BeanContext</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public BeanContext getBeanContext() {
    return m_beanContext;
  }

  /**
   * Add a property change listener to this bean
<<<<<<< HEAD
   * 
   * @param name the name of the property of interest
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void addPropertyChangeListener(String name, PropertyChangeListener pcl) {
=======
   *
   * @param name the name of the property of interest
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void addPropertyChangeListener(String name,
					PropertyChangeListener pcl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_bcSupport.addPropertyChangeListener(name, pcl);
  }

  /**
   * Remove a property change listener from this bean
<<<<<<< HEAD
   * 
   * @param name the name of the property of interest
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void removePropertyChangeListener(String name,
    PropertyChangeListener pcl) {
=======
   *
   * @param name the name of the property of interest
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void removePropertyChangeListener(String name,
					   PropertyChangeListener pcl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_bcSupport.removePropertyChangeListener(name, pcl);
  }

  /**
   * Add a vetoable change listener to this bean
<<<<<<< HEAD
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
    m_bcSupport.removeVetoableChangeListener(name, vcl);
  }
}
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
    m_bcSupport.removeVetoableChangeListener(name, vcl);
  }
}







>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
