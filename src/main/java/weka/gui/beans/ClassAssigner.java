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
 *    ClassAssigner.java
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
import java.awt.BorderLayout;
import java.beans.EventSetDescriptor;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JPanel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Attribute;
import weka.core.Instances;

/**
 * Bean that assigns a class attribute to a data set.
 * 
 * @author Mark Hall
 * @version $Revision: 10220 $
 */
public class ClassAssigner extends JPanel implements Visible,
  DataSourceListener, TrainingSetListener, TestSetListener, DataSource,
  TrainingSetProducer, TestSetProducer, BeanCommon, EventConstraints,
  Serializable, InstanceListener, StructureProducer {

  /** for serialization */
  private static final long serialVersionUID = 4011131665025817924L;

<<<<<<< HEAD
=======
=======
/**
 * Bean that assigns a class attribute to a data set.
 *
 * @author Mark Hall
 * @version $Revision: 7439 $
 */
public class ClassAssigner
  extends JPanel
  implements Visible, DataSourceListener, TrainingSetListener, TestSetListener,
	     DataSource, TrainingSetProducer, TestSetProducer,
	     BeanCommon, EventConstraints, Serializable,
	     InstanceListener, StructureProducer {

  /** for serialization */
  private static final long serialVersionUID = 4011131665025817924L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private String m_classColumn = "last";

  /** format of instances for current incoming connection (if any) */
  private Instances m_connectedFormat;

  private Object m_trainingProvider;
  private Object m_testProvider;
  private Object m_dataProvider;
  private Object m_instanceProvider;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final Vector<TrainingSetListener> m_trainingListeners = new Vector<TrainingSetListener>();
  private final Vector<TestSetListener> m_testListeners = new Vector<TestSetListener>();
  private final Vector<DataSourceListener> m_dataListeners = new Vector<DataSourceListener>();
  private final Vector<InstanceListener> m_instanceListeners = new Vector<InstanceListener>();

  private final Vector<DataFormatListener> m_dataFormatListeners = new Vector<DataFormatListener>();

  protected transient weka.gui.Logger m_logger = null;

  protected BeanVisual m_visual = new BeanVisual("ClassAssigner",
    BeanVisual.ICON_PATH + "ClassAssigner.gif", BeanVisual.ICON_PATH
      + "ClassAssigner_animated.gif");

  /**
   * Global info for this bean
   * 
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return "Designate which column is to be considered the class column "
      + "in incoming data.";
<<<<<<< HEAD
=======
=======
  private Vector m_trainingListeners = new Vector();
  private Vector m_testListeners = new Vector();
  private Vector m_dataListeners = new Vector();
  private Vector m_instanceListeners = new Vector();

  private Vector m_dataFormatListeners = new Vector();

  protected transient weka.gui.Logger m_logger = null;

  protected BeanVisual m_visual = 
    new BeanVisual("ClassAssigner", 
		   BeanVisual.ICON_PATH+"ClassAssigner.gif",
		   BeanVisual.ICON_PATH+"ClassAssigner_animated.gif");

  /**
   * Global info for this bean
   *
   * @return a <code>String</code> value
   */
  public String globalInfo() {
    return Messages.getInstance().getString("ClassAssigner_GlobalInfo_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  public ClassAssigner() {
    setLayout(new BorderLayout());
<<<<<<< HEAD
    add(m_visual, BorderLayout.CENTER);
=======
<<<<<<< HEAD
    add(m_visual, BorderLayout.CENTER);
=======
    add(m_visual, BorderLayout.CENTER);    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

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
   * Tool tip text for this property
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a <code>String</code> value
   */
  public String classColumnTipText() {
    return "Specify the number of the column that contains the class attribute";
  }

  private Instances getUpstreamStructure() {
    if (m_dataProvider != null && m_dataProvider instanceof StructureProducer) {
      return ((StructureProducer) m_dataProvider).getStructure("dataSet");
    }
    if (m_trainingProvider != null
      && m_trainingProvider instanceof StructureProducer) {
      return ((StructureProducer) m_trainingProvider)
        .getStructure("trainingSet");
    }
    if (m_testProvider != null && m_testProvider instanceof StructureProducer) {
      return ((StructureProducer) m_testProvider).getStructure("testSet");
    }
    if (m_instanceProvider != null
      && m_instanceProvider instanceof StructureProducer) {
      return ((StructureProducer) m_instanceProvider).getStructure("instance");
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
    if (!eventName.equals("trainingSet") && !eventName.equals("testSet")
      && !eventName.equals("dataSet") && !eventName.equals("instance")) {
      return null;
    }
    if (m_trainingProvider == null && m_testProvider == null
      && m_dataProvider == null && m_instanceProvider == null) {
      return null;
    }

    if (eventName.equals("dataSet") && m_dataListeners.size() == 0) {
<<<<<<< HEAD
=======
=======
   *
   * @return a <code>String</code> value
   */
  public String classColumnTipText() {
    return Messages.getInstance().getString("ClassAssigner_ClassColumnTipText_Text");
  }
  
  private Instances getUpstreamStructure() {
    if (m_dataProvider != null && m_dataProvider instanceof StructureProducer) {
      return ((StructureProducer)m_dataProvider).getStructure("dataSet");
    }
    if (m_trainingProvider != null && 
        m_trainingProvider instanceof StructureProducer) {
      return ((StructureProducer)m_trainingProvider).getStructure("trainingSet");
    }
    if (m_testProvider != null && m_testProvider instanceof StructureProducer) {
      return ((StructureProducer)m_testProvider).getStructure("testSet");
    }
    if (m_instanceProvider != null && 
        m_instanceProvider instanceof StructureProducer) {
      return ((StructureProducer)m_instanceProvider).getStructure("instance");
    }
    return null;
  }
  
  /**
   * Get the structure of the output encapsulated in the named
   * event. If the structure can't be determined in advance of
   * seeing input, or this StructureProducer does not generate
   * the named event, null should be returned.
   * 
   * @param eventName the name of the output event that encapsulates
   * the requested output.
   * 
   * @return the structure of the output encapsulated in the named
   * event or null if it can't be determined in advance of seeing input
   * or the named event is not generated by this StructureProduce.
   */
  public Instances getStructure(String eventName) {
    if (!eventName.equals("trainingSet") && !eventName.equals("testSet") && 
        !eventName.equals("dataSet") && !eventName.equals("instance")) {
      return null;
    }
    if (m_trainingProvider == null && m_testProvider == null && 
        m_dataProvider == null && m_instanceProvider == null) {
      return null;
    }
    
    if (eventName.equals("dataSet") && m_dataListeners.size() == 0) {    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // downstream has asked for the structure of something that we
      // are not producing at the moment
      return null;
    }
<<<<<<< HEAD

    if (eventName.equals("trainingSet") && m_trainingListeners.size() == 0) {
=======
<<<<<<< HEAD

    if (eventName.equals("trainingSet") && m_trainingListeners.size() == 0) {
=======
    
    if (eventName.equals("trainingSet") && m_trainingListeners.size() == 0) {    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // downstream has asked for the structure of something that we
      // are not producing at the moment
      return null;
    }
<<<<<<< HEAD

    if (eventName.equals("testSet") && m_testListeners.size() == 0) {
=======
<<<<<<< HEAD

    if (eventName.equals("testSet") && m_testListeners.size() == 0) {
=======
    
    if (eventName.equals("testSet") && m_testListeners.size() == 0) {    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // downstream has asked for the structure of something that we
      // are not producing at the moment
      return null;
    }
<<<<<<< HEAD

    if (eventName.equals("instance") && m_instanceListeners.size() == 0) {
=======
<<<<<<< HEAD

    if (eventName.equals("instance") && m_instanceListeners.size() == 0) {
=======
    
    if (eventName.equals("instance") && m_instanceListeners.size() == 0) {    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // downstream has asked for the structure of something that we
      // are not producing at the moment
      return null;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_connectedFormat == null) {
      m_connectedFormat = getUpstreamStructure();
    }

    if (m_connectedFormat != null) {
      assignClass(m_connectedFormat);
    }

<<<<<<< HEAD
=======
=======
    
    if (m_connectedFormat == null) {
      m_connectedFormat = getUpstreamStructure();
    }
    
    assignClass(m_connectedFormat);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_connectedFormat;
  }

  /**
   * Returns the structure of the incoming instances (if any)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an <code>Instances</code> value
   */
  public Instances getConnectedFormat() {
    // loaders will push instances format to us
<<<<<<< HEAD
=======
=======
   *
   * @return an <code>Instances</code> value
   */
  public Instances getConnectedFormat() {
 // loaders will push instances format to us
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // when the user makes configuration changes
    // to the loader in the gui. However, if a fully
    // configured flow is loaded then we won't get
    // this information pushed to us until the
    // flow is run. In this case we want to pull
    // it (if possible) from upstream steps so
    // that our customizer can provide the nice
<<<<<<< HEAD
    // UI with the drop down box of class names.
=======
<<<<<<< HEAD
    // UI with the drop down box of class names.
=======
    // UI with the drop down box of class names.    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_connectedFormat == null) {
      // try and pull the incoming structure
      // from the upstream step (if possible)
      m_connectedFormat = getUpstreamStructure();
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_connectedFormat;
  }

  public void setClassColumn(String col) {
    m_classColumn = col;
    if (m_connectedFormat != null) {
      assignClass(m_connectedFormat);
    }
  }

  public String getClassColumn() {
    return m_classColumn;
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptDataSet(DataSetEvent e) {
    Instances dataSet = e.getDataSet();
    assignClass(dataSet);
    notifyDataListeners(e);
    if (e.isStructureOnly()) {
      m_connectedFormat = e.getDataSet();
      // tell any listening customizers (or other
      notifyDataFormatListeners();
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptTrainingSet(TrainingSetEvent e) {
    Instances trainingSet = e.getTrainingSet();
    assignClass(trainingSet);
    notifyTrainingListeners(e);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (e.isStructureOnly()) {
      m_connectedFormat = e.getTrainingSet();
      // tell any listening customizers (or other
      notifyDataFormatListeners();
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void acceptTestSet(TestSetEvent e) {
    Instances testSet = e.getTestSet();
    assignClass(testSet);
    notifyTestListeners(e);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (e.isStructureOnly()) {
      m_connectedFormat = e.getTestSet();
      // tell any listening customizers (or other
      notifyDataFormatListeners();
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public void acceptInstance(InstanceEvent e) {
    if (e.getStatus() == InstanceEvent.FORMAT_AVAILABLE) {
      // Instances dataSet = e.getInstance().dataset();
      m_connectedFormat = e.getStructure();

      // System.err.println("Assigning class column...");
<<<<<<< HEAD
=======
=======
  public void acceptInstance(InstanceEvent e) {
    if (e.getStatus() == InstanceEvent.FORMAT_AVAILABLE) {
      //      Instances dataSet = e.getInstance().dataset();
      m_connectedFormat = e.getStructure();
      
      //      System.err.println("Assigning class column...");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      assignClass(m_connectedFormat);
      notifyInstanceListeners(e);

      // tell any listening customizers (or other interested parties)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.println("Notifying customizer...");
      notifyDataFormatListeners();
    } else {
      // Instances dataSet = e.getInstance().dataset();
      // assignClass(dataSet);
<<<<<<< HEAD
=======
=======
      System.err.println(Messages.getInstance().getString("ClassAssigner_AcceptInstance_Error_Text"));
      notifyDataFormatListeners();
    } else {
      //      Instances dataSet = e.getInstance().dataset();
      //      assignClass(dataSet);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      notifyInstanceListeners(e);
    }
  }

  private void assignClass(Instances dataSet) {
    int classCol = -1;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_classColumn.trim().toLowerCase().compareTo("last") == 0
      || m_classColumn.equalsIgnoreCase("/last")) {
      dataSet.setClassIndex(dataSet.numAttributes() - 1);
    } else if (m_classColumn.trim().toLowerCase().compareTo("first") == 0
      || m_classColumn.equalsIgnoreCase("/first")) {
      dataSet.setClassIndex(0);
    } else {
      // try to look up the class attribute as a string
      Attribute classAtt = dataSet.attribute(m_classColumn.trim());
      if (classAtt != null) {
        dataSet.setClass(classAtt);
      } else {
        // parse it as a number
        try {
          classCol = Integer.parseInt(m_classColumn.trim()) - 1;
        } catch (NumberFormatException ex) {
          if (m_logger != null) {
            m_logger
              .logMessage("Warning : can't parse '"
                + m_classColumn.trim()
                + "' as a number "
                + " or find it as an attribute in the incoming data (ClassAssigner)");
          }
        }
        if (/* classCol < 0 || */classCol > dataSet.numAttributes() - 1) {
          if (m_logger != null) {
            m_logger.logMessage("Class column outside range of data "
              + "(ClassAssigner)");
          }
        } else {
          dataSet.setClassIndex(classCol);
        }
<<<<<<< HEAD
=======
=======
    if (m_classColumn.toLowerCase().compareTo("last") == 0) {
      dataSet.setClassIndex(dataSet.numAttributes()-1);
    } else if (m_classColumn.toLowerCase().compareTo("first") == 0) {
      dataSet.setClassIndex(0);
    } else {
      classCol = Integer.parseInt(m_classColumn) - 1;
      if (/*classCol < 0 ||*/ classCol > dataSet.numAttributes()-1) {
	if (m_logger != null) {
	  m_logger.logMessage(Messages.getInstance().getString("ClassAssigner_AssignClass_LogMessage_Text"));
	}
      } else {
	dataSet.setClassIndex(classCol);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  protected void notifyTestListeners(TestSetEvent tse) {
    Vector<TestSetListener> l;
    synchronized (this) {
      l = (Vector<TestSetListener>) m_testListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        System.err.println("Notifying test listeners " + "(ClassAssigner)");
        l.elementAt(i).acceptTestSet(tse);
<<<<<<< HEAD
=======
=======
  protected void notifyTestListeners(TestSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_testListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	System.err.println(Messages.getInstance().getString("ClassAssigner_NotifyTestListeners_Error_Text"));
	((TestSetListener)l.elementAt(i)).acceptTestSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  protected void notifyTrainingListeners(TrainingSetEvent tse) {
    Vector<TrainingSetListener> l;
    synchronized (this) {
      l = (Vector<TrainingSetListener>) m_trainingListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        System.err.println("Notifying training listeners " + "(ClassAssigner)");
        l.elementAt(i).acceptTrainingSet(tse);
<<<<<<< HEAD
=======
=======
  protected void notifyTrainingListeners(TrainingSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_trainingListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	System.err.println(Messages.getInstance().getString("ClassAssigner_NotifyTrainingListeners_Error_Text"));
	((TrainingSetListener)l.elementAt(i)).acceptTrainingSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  protected void notifyDataListeners(DataSetEvent tse) {
    Vector<DataSourceListener> l;
    synchronized (this) {
      l = (Vector<DataSourceListener>) m_dataListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        System.err.println("Notifying data listeners " + "(ClassAssigner)");
        l.elementAt(i).acceptDataSet(tse);
<<<<<<< HEAD
=======
=======
  protected void notifyDataListeners(DataSetEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_dataListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	System.err.println(Messages.getInstance().getString("ClassAssigner_NotifyDataListeners_Error_Text"));
	((DataSourceListener)l.elementAt(i)).acceptDataSet(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  protected void notifyInstanceListeners(InstanceEvent tse) {
    Vector<InstanceListener> l;
    synchronized (this) {
      l = (Vector<InstanceListener>) m_instanceListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        // System.err.println("Notifying instance listeners "
        // +"(ClassAssigner)");

        l.elementAt(i).acceptInstance(tse);
<<<<<<< HEAD
=======
=======
  protected void notifyInstanceListeners(InstanceEvent tse) {
    Vector l;
    synchronized (this) {
      l = (Vector)m_instanceListeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	//	System.err.println("Notifying instance listeners "
	//			   +"(ClassAssigner)");
	
	((InstanceListener)l.elementAt(i)).acceptInstance(tse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  protected void notifyDataFormatListeners() {
    Vector<DataFormatListener> l;
    synchronized (this) {
      l = (Vector<DataFormatListener>) m_dataFormatListeners.clone();
    }
    if (l.size() > 0) {
      DataSetEvent dse = new DataSetEvent(this, m_connectedFormat);
      for (int i = 0; i < l.size(); i++) {
        // System.err.println("Notifying instance listeners "
        // +"(ClassAssigner)");
        l.elementAt(i).newDataFormat(dse);
<<<<<<< HEAD
=======
=======
  protected void notifyDataFormatListeners() {
    Vector l;
    synchronized (this) {
      l = (Vector)m_dataFormatListeners.clone();
    }
    if (l.size() > 0) {
      DataSetEvent dse = new DataSetEvent(this, m_connectedFormat);
      for(int i = 0; i < l.size(); i++) {
	//	System.err.println("Notifying instance listeners "
	//			   +"(ClassAssigner)");
	((DataFormatListener)l.elementAt(i)).newDataFormat(dse);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void addInstanceListener(InstanceListener tsl) {
    m_instanceListeners.addElement(tsl);
    if (m_connectedFormat != null) {
      InstanceEvent e = new InstanceEvent(this, m_connectedFormat);
      tsl.acceptInstance(e);
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void removeInstanceListener(InstanceListener tsl) {
    m_instanceListeners.removeElement(tsl);
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void addDataSourceListener(DataSourceListener tsl) {
    m_dataListeners.addElement(tsl);
    // pass on any format that we might know about
    if (m_connectedFormat != null) {
      DataSetEvent e = new DataSetEvent(this, m_connectedFormat);
      tsl.acceptDataSet(e);
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void removeDataSourceListener(DataSourceListener tsl) {
    m_dataListeners.removeElement(tsl);
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void addTrainingSetListener(TrainingSetListener tsl) {
    m_trainingListeners.addElement(tsl);
    // pass on any format that we might know about
    if (m_connectedFormat != null) {
      TrainingSetEvent e = new TrainingSetEvent(this, m_connectedFormat);
      tsl.acceptTrainingSet(e);
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void removeTrainingSetListener(TrainingSetListener tsl) {
    m_trainingListeners.removeElement(tsl);
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void addTestSetListener(TestSetListener tsl) {
    m_testListeners.addElement(tsl);
    // pass on any format that we might know about
    if (m_connectedFormat != null) {
      TestSetEvent e = new TestSetEvent(this, m_connectedFormat);
      tsl.acceptTestSet(e);
    }
  }

<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public synchronized void removeTestSetListener(TestSetListener tsl) {
    m_testListeners.removeElement(tsl);
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
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setVisual(BeanVisual newVisual) {
    m_visual = newVisual;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public BeanVisual getVisual() {
    return m_visual;
  }

  @Override
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH + "ClassAssigner.gif",
      BeanVisual.ICON_PATH + "ClassAssigner_animated.gif");
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
    if (eventName.compareTo("trainingSet") == 0
      && (m_trainingProvider != null || m_dataProvider != null || m_instanceProvider != null)) {
      return false;
    }

    if (eventName.compareTo("testSet") == 0 && m_testProvider != null) {
      return false;
    }

    if (eventName.compareTo("instance") == 0 && m_instanceProvider != null
      || m_trainingProvider != null || m_dataProvider != null) {
      return false;
    }
<<<<<<< HEAD
=======
=======
  public BeanVisual getVisual() {
    return m_visual;
  }
  
  public void useDefaultVisual() {
    m_visual.loadIcons(BeanVisual.ICON_PATH+"ClassAssigner.gif",
		       BeanVisual.ICON_PATH+"ClassAssigner_animated.gif");
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
    if (eventName.compareTo("trainingSet") == 0 && 
	(m_trainingProvider != null || m_dataProvider != null ||
	 m_instanceProvider != null)) { 
      return false;
    }
    
    if (eventName.compareTo("testSet") == 0 && 
	m_testProvider != null) { 
      return false;
    }

     if (eventName.compareTo("instance") == 0 &&
	m_instanceProvider != null || m_trainingProvider != null ||
	 m_dataProvider != null) {
       return false;
     } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
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
      if (eventName.compareTo("trainingSet") == 0) {
        m_trainingProvider = source;
      } else if (eventName.compareTo("testSet") == 0) {
        m_testProvider = source;
      } else if (eventName.compareTo("dataSet") == 0) {
        m_dataProvider = source;
      } else if (eventName.compareTo("instance") == 0) {
        m_instanceProvider = source;
<<<<<<< HEAD
=======
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
      if (eventName.compareTo("trainingSet") == 0) {
	m_trainingProvider = source;
      } else if (eventName.compareTo("testSet") == 0) {
	m_testProvider = source;
      } else if (eventName.compareTo("dataSet") == 0) {
	m_dataProvider = source;
      } else if (eventName.compareTo("instance") == 0) {
	m_instanceProvider = source;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      m_connectedFormat = null;
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

    if (eventName.compareTo("trainingSet") == 0) {
      if (m_trainingProvider == source) {
        m_trainingProvider = null;
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

    if (eventName.compareTo("trainingSet") == 0) {
      if (m_trainingProvider == source) {
	m_trainingProvider = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (eventName.compareTo("testSet") == 0) {
      if (m_testProvider == source) {
<<<<<<< HEAD
        m_testProvider = null;
=======
<<<<<<< HEAD
        m_testProvider = null;
=======
	m_testProvider = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (eventName.compareTo("dataSet") == 0) {
      if (m_dataProvider == source) {
<<<<<<< HEAD
        m_dataProvider = null;
=======
<<<<<<< HEAD
        m_dataProvider = null;
=======
	m_dataProvider = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    if (eventName.compareTo("instance") == 0) {
      if (m_instanceProvider == source) {
<<<<<<< HEAD
        m_instanceProvider = null;
=======
<<<<<<< HEAD
        m_instanceProvider = null;
=======
	m_instanceProvider = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_connectedFormat = null;
  }
<<<<<<< HEAD

  @Override
=======
<<<<<<< HEAD

  @Override
=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setLog(weka.gui.Logger logger) {
    m_logger = logger;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public void stop() {
    // Pass on to upstream beans
    if (m_trainingProvider != null && m_trainingProvider instanceof BeanCommon) {
      ((BeanCommon) m_trainingProvider).stop();
    }

    if (m_testProvider != null && m_testProvider instanceof BeanCommon) {
      ((BeanCommon) m_testProvider).stop();
    }

    if (m_dataProvider != null && m_dataProvider instanceof BeanCommon) {
      ((BeanCommon) m_dataProvider).stop();
    }

    if (m_instanceProvider != null && m_instanceProvider instanceof BeanCommon) {
      ((BeanCommon) m_instanceProvider).stop();
    }
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
  public boolean isBusy() {
    return false;
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
    if (eventName.compareTo("trainingSet") == 0) {
      if (m_trainingProvider == null) {
        return false;
      } else {
        if (m_trainingProvider instanceof EventConstraints) {
          if (!((EventConstraints) m_trainingProvider)
            .eventGeneratable("trainingSet")) {
            return false;
          }
        }
      }
    }

    if (eventName.compareTo("dataSet") == 0) {
      if (m_dataProvider == null) {
        if (m_instanceProvider == null) {
          m_connectedFormat = null;
          notifyDataFormatListeners();
        }
        return false;
      } else {
        if (m_dataProvider instanceof EventConstraints) {
          if (!((EventConstraints) m_dataProvider).eventGeneratable("dataSet")) {
            m_connectedFormat = null;
            notifyDataFormatListeners();
            return false;
          }
        }
      }
    }

    if (eventName.compareTo("instance") == 0) {
      if (m_instanceProvider == null) {
        if (m_dataProvider == null) {
          m_connectedFormat = null;
          notifyDataFormatListeners();
        }
        return false;
      } else {
        if (m_instanceProvider instanceof EventConstraints) {
          if (!((EventConstraints) m_instanceProvider)
            .eventGeneratable("instance")) {
            m_connectedFormat = null;
            notifyDataFormatListeners();
            return false;
          }
        }
<<<<<<< HEAD
=======
=======
  public void stop() {
    // Pass on to upstream beans
    if (m_trainingProvider != null && m_trainingProvider instanceof BeanCommon) {
      ((BeanCommon)m_trainingProvider).stop();
    }
    
    if (m_testProvider != null && m_testProvider instanceof BeanCommon) {
      ((BeanCommon)m_testProvider).stop();
    }
    
    if (m_dataProvider != null && m_dataProvider instanceof BeanCommon) {
      ((BeanCommon)m_dataProvider).stop();
    }
    
    if (m_instanceProvider != null && m_instanceProvider instanceof BeanCommon) {
      ((BeanCommon)m_instanceProvider).stop();
    }
  }
  
  /**
   * Returns true if. at this time, the bean is busy with some
   * (i.e. perhaps a worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  public boolean isBusy() {
    return false;
  }
  
  /**
   * Returns true, if at the current time, the named event could
   * be generated. Assumes that the supplied event name is
   * an event that could be generated by this bean
   *
   * @param eventName the name of the event in question
   * @return true if the named event could be generated at this point in
   * time
   */
  public boolean eventGeneratable(String eventName) {
    if (eventName.compareTo("trainingSet") == 0) { 
      if (m_trainingProvider == null) {
	return false;
      } else {
	if (m_trainingProvider instanceof EventConstraints) {
	  if (!((EventConstraints)m_trainingProvider).
	      eventGeneratable("trainingSet")) {
	    return false;
	  }
	}
      }
    }

    if (eventName.compareTo("dataSet") == 0) { 
      if (m_dataProvider == null) {
	if (m_instanceProvider == null) {
	  m_connectedFormat = null;
	  notifyDataFormatListeners();
	}
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
      }
    }

    if (eventName.compareTo("instance") == 0) { 
      if (m_instanceProvider == null) {
	if (m_dataProvider == null) {
	  m_connectedFormat = null;
	  notifyDataFormatListeners();
	}
	return false;
      } else {
	if (m_instanceProvider instanceof EventConstraints) {
	  if (!((EventConstraints)m_instanceProvider).
	      eventGeneratable("instance")) {
	    m_connectedFormat = null;
	    notifyDataFormatListeners();
	    return false;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    if (eventName.compareTo("testSet") == 0) {
      if (m_testProvider == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        return false;
      } else {
        if (m_testProvider instanceof EventConstraints) {
          if (!((EventConstraints) m_testProvider).eventGeneratable("testSet")) {
            return false;
          }
        }
<<<<<<< HEAD
=======
=======
	return false;
      } else {
	if (m_testProvider instanceof EventConstraints) {
	  if (!((EventConstraints)m_testProvider).
	      eventGeneratable("testSet")) {
	    return false;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return true;
  }
}
