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
 *    ClassValuePicker.java
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
import weka.core.Attribute;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.SwapValues;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.beans.EventSetDescriptor;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JPanel;

<<<<<<< HEAD
import weka.core.Attribute;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.SwapValues;

/**
 * @author Mark Hall
 * @version $Revision: 11344 $
 */
public class ClassValuePicker extends JPanel implements Visible,
  DataSourceListener, BeanCommon, EventConstraints, Serializable,
  StructureProducer {
=======
/**
 * @author Mark Hall
 * @version $Revision: 7439 $
 */
public class ClassValuePicker
  extends JPanel
  implements Visible, DataSourceListener, BeanCommon,
	     EventConstraints, Serializable, StructureProducer {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -1196143276710882989L;

  /** the class value considered to be the positive class */
  private String m_classValue;

  /** format of instances for the current incoming connection (if any) */
  private Instances m_connectedFormat;

  private Object m_dataProvider;

<<<<<<< HEAD
  private final Vector<DataSourceListener> m_dataListeners =
    new Vector<DataSourceListener>();
  private final Vector<DataFormatListener> m_dataFormatListeners =
    new Vector<DataFormatListener>();

  protected transient weka.gui.Logger m_logger = null;

  protected BeanVisual m_visual = new BeanVisual("ClassValuePicker",
    BeanVisual.ICON_PATH + "ClassValuePicker.gif", BeanVisual.ICON_PATH
      + "ClassValuePicker_animated.gif");

  /**
   * Global info for this bean
   * 
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return "Designate which class value is to be considered the \"positive\" "
      + "class value (useful for ROC style curves).";
=======
  private Vector m_dataListeners = new Vector();
  private Vector m_dataFormatListeners = new Vector();

  protected transient weka.gui.Logger m_logger = null;
  
  protected BeanVisual m_visual = 
    new BeanVisual("ClassValuePicker", 
		   BeanVisual.ICON_PATH+"ClassValuePicker.gif",
		   BeanVisual.ICON_PATH+"ClassValuePicker_animated.gif");

  /**
   * Global info for this bean
   *
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return Messages.getInstance().getString("ClassValuePicker_GlobalInfo_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  public ClassValuePicker() {
    setLayout(new BorderLayout());
<<<<<<< HEAD
    add(m_visual, BorderLayout.CENTER);
=======
    add(m_visual, BorderLayout.CENTER);    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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

  @Override
=======
  public String getCustomName() {
    return m_visual.getText();
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Instances getStructure(String eventName) {
    if (!eventName.equals("dataSet")) {
      return null;
    }
    if (m_dataProvider == null) {
      return null;
    }
<<<<<<< HEAD

    if (m_dataProvider != null && m_dataProvider instanceof StructureProducer) {
      m_connectedFormat = ((StructureProducer) m_dataProvider)
        .getStructure("dataSet");
    }

    return m_connectedFormat;
  }

=======
    
    if (m_dataProvider != null && m_dataProvider instanceof StructureProducer) {
      m_connectedFormat =  ((StructureProducer)m_dataProvider).getStructure("dataSet");
    }
    
    return m_connectedFormat;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected Instances getStructure() {
    if (m_dataProvider != null) {
      return getStructure("dataSet");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return null;
  }

  /**
   * Returns the structure of the incoming instances (if any)
<<<<<<< HEAD
   * 
   * @return an <code>Instances</code> value
   */
  public Instances getConnectedFormat() {
    // loaders will push instances format to us
    // when the user makes configuration changes
    // to the loader in the gui. However, if a fully
    // configured flow is loaded then we won't get
    // this information pushed to us until the
    // flow is run. In this case we want to pull
    // it (if possible) from upstream steps so
    // that our customizer can provide the nice
    // UI with the drop down box of class names.
    // if (m_connectedFormat == null) {
    // try and pull the incoming structure
    // from the upstream step (if possible)
    // m_connectedFormat = getStructure();
    // }
=======
   *
   * @return an <code>Instances</code> value
   */
  public Instances getConnectedFormat() {
    /*if (m_connectedFormat ==null) {
      System.err.println(Messages.getInstance().getString("ClassValuePicker_GetConnectedFormat_Error_Text"));
    }
    return m_connectedFormat;*/
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return getStructure();
  }

  /**
<<<<<<< HEAD
   * Set the class value considered to be the "positive" class value.
   * 
=======
   * Set the class value index considered to be the "positive"
   * class value.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param index the class value index to use
   */
  public void setClassValue(String value) {
    m_classValue = value;
    if (m_connectedFormat != null) {
      notifyDataFormatListeners();
    }
  }

  /**
<<<<<<< HEAD
   * Gets the class value considered to be the "positive" class value.
   * 
=======
   * Gets the class value considered to be the "positive"
   * class value.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the class value index
   */
  public String getClassValue() {
    return m_classValue;
  }

<<<<<<< HEAD
  @Override
  public void acceptDataSet(DataSetEvent e) {
    if (e.isStructureOnly()) {
      if (m_connectedFormat == null
        || !m_connectedFormat.equalHeaders(e.getDataSet())) {
        m_connectedFormat = new Instances(e.getDataSet(), 0);
        // tell any listening customizers (or other
        notifyDataFormatListeners();
=======
  public void acceptDataSet(DataSetEvent e) {
    if (e.isStructureOnly()) {
      if (m_connectedFormat == null ||
	  !m_connectedFormat.equalHeaders(e.getDataSet())) { 
	m_connectedFormat = new Instances(e.getDataSet(), 0);
	// tell any listening customizers (or other
	notifyDataFormatListeners();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    Instances dataSet = e.getDataSet();
    Instances newDataSet = assignClassValue(dataSet);
<<<<<<< HEAD

    if (newDataSet != null) {
      e = new DataSetEvent(this, newDataSet);
      notifyDataListeners(e);
    } else {
      if (m_logger != null) {
        m_logger.logMessage("[ClassValuePicker] " + statusMessagePrefix()
          + " Class value '" + m_classValue + "' does not seem to exist!");
        m_logger
          .statusMessage(statusMessagePrefix()
            + "ERROR: Class value '" + m_classValue
            + "' does not seem to exist!");
      }
=======
    
    if (newDataSet != null) {
      e = new DataSetEvent(this, newDataSet);
      notifyDataListeners(e);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  private Instances assignClassValue(Instances dataSet) {
    if (dataSet.classIndex() < 0) {
      if (m_logger != null) {
<<<<<<< HEAD
        m_logger.logMessage("[ClassValuePicker] " + statusMessagePrefix()
          + " No class attribute defined in data set.");
        m_logger.statusMessage(statusMessagePrefix()
          + "WARNING: No class attribute defined in data set.");
      }
      return dataSet;
    }

    if (dataSet.classAttribute().isNumeric()) {
      if (m_logger != null) {
        m_logger.logMessage("[ClassValuePicker] " + statusMessagePrefix()
          + " Class attribute must be nominal (ClassValuePicker)");
        m_logger.statusMessage(statusMessagePrefix()
          + "WARNING: Class attribute must be nominal.");
      }
      return dataSet;
    } else {
      if (m_logger != null) {
        m_logger.statusMessage(statusMessagePrefix() + "remove");
      }
    }

    if ((m_classValue == null || m_classValue.length() == 0)
      && dataSet.numInstances() > 0) {

      if (m_logger != null) {
        m_logger.logMessage("[ClassValuePicker] " + statusMessagePrefix()
          + " Class value to consider as positive has not been set"
          + " (ClassValuePicker)");
        m_logger.statusMessage(statusMessagePrefix()
          + "WARNING: Class value to consider as positive has not been set.");
      }
      return dataSet;
    }

=======
	m_logger.
	  logMessage(Messages.getInstance().getString("ClassValuePicker_AssignClassValue_LogMessage_Text_First") 
	      + statusMessagePrefix() 
	      + Messages.getInstance().getString("ClassValuePicker_AssignClassValue_LogMessage_Text_Second"));
	m_logger.statusMessage(statusMessagePrefix()
	    + Messages.getInstance().getString("ClassValuePicker_AssignClassValue_StatusMessage_Text_First"));
      }
      return dataSet;
    }
    
    if (dataSet.classAttribute().isNumeric()) {
      if (m_logger != null) {
	m_logger.
	  logMessage(Messages.getInstance().getString("ClassValuePicker_AssignClassValue_LogMessage_Text_Third")
	      + statusMessagePrefix()
	      + Messages.getInstance().getString("ClassValuePicker_AssignClassValue_LogMessage_Text_Fourth"));
	m_logger.statusMessage(statusMessagePrefix()
	    + Messages.getInstance().getString("ClassValuePicker_AssignClassValue_StatusMessage_Text_Second"));
      }
      
      return dataSet;
    } else {
      if (m_logger != null) {
        m_logger.statusMessage(statusMessagePrefix() + Messages.getInstance().getString("ClassValuePicker_AssignClassValue_StatusMessage_Text_Third"));
      }
    }
    
    if ((m_classValue == null || m_classValue.length() == 0) && 
        dataSet.numInstances() > 0) {

      if (m_logger != null) {
        m_logger.
          logMessage("[ClassValuePicker] "
              + statusMessagePrefix()
              + " Class value to consider as positive has not been set" +
                        " (ClassValuePicker)");
        m_logger.statusMessage(statusMessagePrefix()
            + "WARNING: Class value to consider as positive has not been set.");
      }
      return dataSet;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_classValue == null) {
      // in this case we must just have a structure only
      // dataset, so don't fuss about it and return the
      // exsting structure so that it can get pushed downstream
      return dataSet;
    }

    Attribute classAtt = dataSet.classAttribute();
    int classValueIndex = -1;
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // if first char is "/" then see if we have "first" or "last"
    // or if the remainder can be parsed as a number
    if (m_classValue.startsWith("/") && m_classValue.length() > 1) {
      String remainder = m_classValue.substring(1);
      remainder = remainder.trim();
      if (remainder.equalsIgnoreCase("first")) {
        classValueIndex = 0;
      } else if (remainder.equalsIgnoreCase("last")) {
        classValueIndex = classAtt.numValues() - 1;
      } else {
        // try and parse as a number
        try {
          classValueIndex = Integer.parseInt(remainder);
          classValueIndex--; // 0-based index
<<<<<<< HEAD

          if (classValueIndex < 0 || classValueIndex > classAtt.numValues() - 1) {
            if (m_logger != null) {
              m_logger
                .logMessage("[ClassValuePicker] " + statusMessagePrefix()
                  + " Class value index is out of range!"
                  + " (ClassValuePicker)");
              m_logger.statusMessage(statusMessagePrefix()
                + "ERROR: Class value index is out of range!.");
=======
          
          if (classValueIndex < 0 || 
              classValueIndex > classAtt.numValues() - 1) {
            if (m_logger != null) {
              m_logger.
                logMessage("[ClassValuePicker] "
                    + statusMessagePrefix()
                    + " Class value index is out of range!" +
                              " (ClassValuePicker)");
              m_logger.statusMessage(statusMessagePrefix()
                  + "ERROR: Class value index is out of range!.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }
          }
        } catch (NumberFormatException n) {
          if (m_logger != null) {
<<<<<<< HEAD
            m_logger.logMessage("[ClassValuePicker] " + statusMessagePrefix()
              + " Unable to parse supplied class value index as an integer"
              + " (ClassValuePicker)");
            m_logger.statusMessage(statusMessagePrefix()
              + "WARNING: Unable to parse supplied class value index "
              + "as an integer.");
=======
            m_logger.
              logMessage("[ClassValuePicker] "
                  + statusMessagePrefix()
                  + " Unable to parse supplied class value index as an integer" +
                            " (ClassValuePicker)");
            m_logger.statusMessage(statusMessagePrefix()
                + "WARNING: Unable to parse supplied class value index " +
                                "as an integer.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            return dataSet;
          }
        }
      }
    } else {
      // treat the string as the label to look for
      classValueIndex = classAtt.indexOfValue(m_classValue.trim());
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (classValueIndex < 0) {
      return null; // error
    }

    if (classValueIndex != 0) { // nothing to do if == 0
      // swap selected index with index 0
      try {
        SwapValues sv = new SwapValues();
<<<<<<< HEAD
        sv.setAttributeIndex("" + (dataSet.classIndex() + 1));
        sv.setFirstValueIndex("first");
        sv.setSecondValueIndex("" + (classValueIndex + 1));
=======
        sv.setAttributeIndex(""+(dataSet.classIndex()+1));
        sv.setFirstValueIndex("first");
        sv.setSecondValueIndex(""+(classValueIndex+1));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        sv.setInputFormat(dataSet);
        Instances newDataSet = Filter.useFilter(dataSet, sv);
        newDataSet.setRelationName(dataSet.relationName());
        return newDataSet;
      } catch (Exception ex) {
        if (m_logger != null) {
<<<<<<< HEAD
          m_logger.logMessage("[ClassValuePicker] " + statusMessagePrefix()
            + " Unable to swap class attibute values.");
          m_logger.statusMessage(statusMessagePrefix()
            + "ERROR: (See log for details)");
=======
          m_logger.
            logMessage("[ClassValuePicker] "
                +statusMessagePrefix()
                + " Unable to swap class attibute values.");
          m_logger.statusMessage(statusMessagePrefix()
              + "ERROR: (See log for details)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          return null;
        }
      }
    }
    return dataSet;
  }

<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  protected void notifyDataListeners(DataSetEvent tse) {
    Vector<DataSourceListener> l;
    synchronized (this) {
      l = (Vector<DataSourceListener>) m_dataListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        System.err.println("Notifying data listeners " + "(ClassValuePicker)");
        l.elementAt(i).acceptDataSet(tse);
=======
  protected void notifyDataListeners(DataSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_dataListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	System.err.println(Messages.getInstance().getString("ClassValuePicker_NotifyDataListeners_Text"));
	((DataSourceListener)l.elementAt(i)).acceptDataSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  protected void notifyDataFormatListeners() {
    Vector<DataFormatListener> l;
    synchronized (this) {
      l = (Vector<DataFormatListener>) m_dataFormatListeners.clone();
    }
    if (l.size() > 0) {
      DataSetEvent dse = new DataSetEvent(this, m_connectedFormat);
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).newDataFormat(dse);
=======
  protected void notifyDataFormatListeners() {
    Vector l;
    synchronized (this) {
      l = (Vector)m_dataFormatListeners.clone();
    }
    if (l.size() > 0) {
      DataSetEvent dse = new DataSetEvent(this, m_connectedFormat);
      for(int i = 0; i < l.size(); i++) {
	((DataFormatListener)l.elementAt(i)).newDataFormat(dse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  public synchronized void addDataSourceListener(DataSourceListener tsl) {
    m_dataListeners.addElement(tsl);
  }

  public synchronized void removeDataSourceListener(DataSourceListener tsl) {
    m_dataListeners.removeElement(tsl);
  }

  public synchronized void addDataFormatListener(DataFormatListener dfl) {
    m_dataFormatListeners.addElement(dfl);
  }

  public synchronized void removeDataFormatListener(DataFormatListener dfl) {
    m_dataFormatListeners.removeElement(dfl);
  }

<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setVisual(BeanVisual newVisual) {
    m_visual = newVisual;
  }

<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public BeanVisual getVisual() {
    return m_visual;
  }

<<<<<<< HEAD
  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "ClassValuePicker.gif",
      BeanVisual.ICON_PATH + "ClassValuePicker_animated.gif");
  }

  /**
   * Returns true if, at this time, the object will accept a connection
   * according to the supplied event name
   * 
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  @Override
  public boolean connectionAllowed(String eventName) {
    if (eventName.compareTo("dataSet") == 0 && (m_dataProvider != null)) {
=======
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"ClassValuePicker.gif",
		       BeanVisual.ICON_PATH+"ClassValuePicker_animated.gif");
  }

  /**
   * Returns true if, at this time, 
   * the object will accept a connection according to the supplied
   * event name
   *
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  public boolean connectionAllowed(String eventName) {
    if (eventName.compareTo("dataSet") == 0 && 
	(m_dataProvider != null)) { 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
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
   * with respect to the supplied event name
   * 
   * @param eventName the event
   * @param source the source with which this object has been registered as a
   *          listener
   */
  @Override
  public synchronized void connectionNotification(String eventName,
    Object source) {
    if (connectionAllowed(eventName)) {
      if (eventName.compareTo("dataSet") == 0) {
        m_dataProvider = source;
=======
   * Notify this object that it has been registered as a listener with
   * a source with respect to the supplied event name
   *
   * @param eventName the event
   * @param source the source with which this object has been registered as
   * a listener
   */
  public synchronized void connectionNotification(String eventName,
						  Object source) {
    if (connectionAllowed(eventName)) {
      if (eventName.compareTo("dataSet") == 0) {
	m_dataProvider = source;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    m_connectedFormat = null;
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

    if (eventName.compareTo("dataSet") == 0) {
      if (m_dataProvider == source) {
        m_dataProvider = null;
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

    if (eventName.compareTo("dataSet") == 0) {
      if (m_dataProvider == source) {
	m_dataProvider = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    m_connectedFormat = null;
  }

<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void setLog(weka.gui.Logger logger) {
    m_logger = logger;
  }

<<<<<<< HEAD
  @Override
  public void stop() {
    // nothing to do
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
=======
  public void stop() {
    // nothing to do
  }
  
  /**
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean isBusy() {
    return false;
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
    if (eventName.compareTo("dataSet") != 0) {
      return false;
    }

<<<<<<< HEAD
    if (eventName.compareTo("dataSet") == 0) {
      if (m_dataProvider == null) {
        m_connectedFormat = null;
        notifyDataFormatListeners();
        return false;
      } else {
        if (m_dataProvider instanceof EventConstraints) {
          if (!((EventConstraints) m_dataProvider).eventGeneratable("dataSet")) {
            m_connectedFormat = null;
            notifyDataFormatListeners();
            return false;
          }
        }
=======
    if (eventName.compareTo("dataSet") == 0) { 
      if (m_dataProvider == null) {
	m_connectedFormat = null;
	notifyDataFormatListeners();
	return false;
      } else {
	if (m_dataProvider instanceof EventConstraints) {
	  if (!((EventConstraints)m_dataProvider).
	      eventGeneratable("dataSet")) {
	    m_connectedFormat = null;
	    notifyDataFormatListeners();
	    return false;
	  }
	}
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
