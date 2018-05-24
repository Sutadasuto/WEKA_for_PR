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
 *    Classifier.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.GraphicsEnvironment;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.beans.EventSetDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
=======
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

<<<<<<< HEAD
import javax.swing.JCheckBox;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

<<<<<<< HEAD
import weka.classifiers.UpdateableBatchProcessor;
import weka.classifiers.rules.ZeroR;
import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.SerializationHelper;
=======
import weka.classifiers.rules.ZeroR;
import weka.core.Instances;
import weka.core.OptionHandler;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Utils;
import weka.core.xml.KOML;
import weka.core.xml.XStream;
import weka.experiment.Task;
import weka.experiment.TaskStatusInfo;
import weka.gui.ExtensionFileFilter;
import weka.gui.Logger;

/**
 * Bean that wraps around weka.classifiers
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
<<<<<<< HEAD
 * @version $Revision: 13477 $
=======
 * @version $Revision: 10819 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @since 1.0
 * @see JPanel
 * @see BeanCommon
 * @see Visible
 * @see WekaWrapper
 * @see Serializable
 * @see UserRequestAcceptor
 * @see TrainingSetListener
 * @see TestSetListener
<<<<<<< HEAD
 * @see EnvironmentHandler
 */
public class Classifier extends JPanel implements BeanCommon, Visible,
  WekaWrapper, EventConstraints, Serializable, UserRequestAcceptor,
  TrainingSetListener, TestSetListener, InstanceListener,
  ConfigurationProducer, EnvironmentHandler {
=======
 */
public class Classifier extends JPanel implements BeanCommon, Visible,
  WekaWrapper, EventConstraints, Serializable, UserRequestAcceptor,
  TrainingSetListener, TestSetListener, InstanceListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 659603893917736008L;

  protected BeanVisual m_visual = new BeanVisual("Classifier",
    BeanVisual.ICON_PATH + "DefaultClassifier.gif", BeanVisual.ICON_PATH
      + "DefaultClassifier_animated.gif");

  private static int IDLE = 0;
  private static int BUILDING_MODEL = 1;
  private int m_state = IDLE;

  // private Thread m_buildThread = null;

  /**
   * Global info for the wrapped classifier (if it exists).
   */
  protected String m_globalInfo;

  /**
<<<<<<< HEAD
   * Objects talking to us. String connection event key, 2 element list
   * containing source and count
   */
  // protected Hashtable m_listenees = new Hashtable();
  protected HashMap<String, List<Object>> m_listenees =
    new HashMap<String, List<Object>>();
=======
   * Objects talking to us
   */
  private final Hashtable m_listenees = new Hashtable();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for batch classifier events
   */
<<<<<<< HEAD
  private final Vector<BatchClassifierListener> m_batchClassifierListeners =
    new Vector<BatchClassifierListener>();
=======
  private final Vector m_batchClassifierListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for incremental classifier events
   */
<<<<<<< HEAD
  private final Vector<IncrementalClassifierListener> m_incrementalClassifierListeners =
    new Vector<IncrementalClassifierListener>();
=======
  private final Vector m_incrementalClassifierListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for graph events
   */
<<<<<<< HEAD
  private final Vector<GraphListener> m_graphListeners =
    new Vector<GraphListener>();
=======
  private final Vector m_graphListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Objects listening for text events
   */
<<<<<<< HEAD
  private final Vector<TextListener> m_textListeners =
    new Vector<TextListener>();
=======
  private final Vector m_textListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Holds training instances for batch training. Not transient because header
   * is retained for validating any instance events that this classifier might
   * be asked to predict in the future.
   */
  private Instances m_trainingSet;
  private weka.classifiers.Classifier m_Classifier = new ZeroR();
  /** Template used for creating copies when building in parallel */
  private weka.classifiers.Classifier m_ClassifierTemplate = m_Classifier;

  private final IncrementalClassifierEvent m_ie =
    new IncrementalClassifierEvent(this);

  /** the extension for serialized models (binary Java serialization) */
  public final static String FILE_EXTENSION = "model";

  private transient JFileChooser m_fileChooser = null;

  protected FileFilter m_binaryFilter = new ExtensionFileFilter("."
<<<<<<< HEAD
    + FILE_EXTENSION, "Binary serialized model file (*" + FILE_EXTENSION + ")");

  protected FileFilter m_KOMLFilter = new ExtensionFileFilter(
    KOML.FILE_EXTENSION + FILE_EXTENSION, "XML serialized model file (*"
      + KOML.FILE_EXTENSION + FILE_EXTENSION + ")");

  protected FileFilter m_XStreamFilter = new ExtensionFileFilter(
    XStream.FILE_EXTENSION + FILE_EXTENSION, "XML serialized model file (*"
      + XStream.FILE_EXTENSION + FILE_EXTENSION + ")");

  protected transient Environment m_env;

  /**
   * If the classifier is an incremental classifier, should we reset it (i.e.
   * call buildClassifier()) and discard any previously learned model before
   * processing the first instance in the stream. Note that this happens
   * automatically if the incoming instance structure does not match that (if
   * any) that the classifier was trained with previously.
   */
  private boolean m_resetIncrementalClassifier = false;
=======
    + FILE_EXTENSION, Messages.getInstance().getString(
    "Classifier_BinaryFilter_ExtensionFileFilter_Text_First")
    + FILE_EXTENSION
    + Messages.getInstance().getString(
      "Classifier_BinaryFilter_ExtensionFileFilter_Text_Second"));

  protected FileFilter m_KOMLFilter = new ExtensionFileFilter(
    KOML.FILE_EXTENSION + FILE_EXTENSION, Messages.getInstance().getString(
      "Classifier_KOMLFilter_ExtensionFileFilter_Text_First")
      + KOML.FILE_EXTENSION
      + FILE_EXTENSION
      + Messages.getInstance().getString(
        "Classifier_KOMLFilter_ExtensionFileFilter_Text_Second"));

  protected FileFilter m_XStreamFilter = new ExtensionFileFilter(
    XStream.FILE_EXTENSION + FILE_EXTENSION, Messages.getInstance().getString(
      "Classifier_XStreamFilter_ExtensionFileFilter_Text_First")
      + XStream.FILE_EXTENSION
      + FILE_EXTENSION
      + Messages.getInstance().getString(
        "Classifier_XStreamFilter_ExtensionFileFilter_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * If the classifier is an incremental classifier, should we update it (ie
   * train it on incoming instances). This makes it possible incrementally test
   * on a separate stream of instances without updating the classifier, or mix
   * batch training/testing with incremental training/testing
   */
  private boolean m_updateIncrementalClassifier = true;

  private transient Logger m_log = null;

  /**
   * Event to handle when processing incremental updates
   */
  private InstanceEvent m_incrementalEvent;

  /**
   * Number of threads to use to train models with
   */
  protected int m_executionSlots = 2;

  // protected int m_queueSize = 5;

  /**
   * Pool of threads to train models on incoming data
   */
  protected transient ThreadPoolExecutor m_executorPool;

  /**
   * Stores completed models and associated data sets.
   */
  protected transient BatchClassifierEvent[][] m_outputQueues;

  /**
   * Stores which sets from which runs have been completed.
   */
  protected transient boolean[][] m_completedSets;

  /**
   * Identifier for the current batch. A batch is a group of related runs/sets.
   */
  protected transient Date m_currentBatchIdentifier;
  protected transient boolean m_batchStarted = false;

  /**
   * Holds original icon label text
   */
  protected String m_oldText = "";

  /**
<<<<<<< HEAD
   * true if we should reject any further training data sets, until all
   * processing has been finished, once we've received the last fold of the last
   * run.
   */
  protected boolean m_reject = false;

  /**
   * True if we should block rather reject until all processing has been
   * completed.
=======
   * true if we should block any further training data sets.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected boolean m_block = false;

  /**
<<<<<<< HEAD
   * Optional file to load a pre-trained model to score with (batch, or to score
   * and update (incremental) in the case of testSet only (batch) or instance
   * (incremental) connections
   */
  protected String m_loadModelFileName = "";

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Global info (if it exists) for the wrapped classifier
   * 
   * @return the global info
   */
  public String globalInfo() {
    return m_globalInfo;
  }

  /**
   * Creates a new <code>Classifier</code> instance.
   */
  public Classifier() {
    setLayout(new BorderLayout());
    add(m_visual, BorderLayout.CENTER);
    setClassifierTemplate(m_ClassifierTemplate);

    // setupFileChooser();
  }

  private void startExecutorPool() {

    if (m_executorPool != null) {
      m_executorPool.shutdownNow();
    }

    m_executorPool =
      new ThreadPoolExecutor(m_executionSlots, m_executionSlots, 120,
        TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
  }

  /**
   * Set a custom (descriptive) name for this bean
   * 
   * @param name the name to use
   */
  @Override
  public void setCustomName(String name) {
    m_visual.setText(name);
  }

  /**
   * Get the custom (descriptive) name for this bean (if one has been set)
   * 
   * @return the custom name (or the default name)
   */
  @Override
  public String getCustomName() {
    return m_visual.getText();
  }

  protected void setupFileChooser() {
    if (m_fileChooser == null) {
      m_fileChooser =
        new JFileChooser(new File(System.getProperty("user.dir")));
    }

    m_fileChooser.addChoosableFileFilter(m_binaryFilter);
    if (KOML.isPresent()) {
      m_fileChooser.addChoosableFileFilter(m_KOMLFilter);
    }
    if (XStream.isPresent()) {
      m_fileChooser.addChoosableFileFilter(m_XStreamFilter);
    }
    m_fileChooser.setFileFilter(m_binaryFilter);
  }

  /**
   * Get the number of execution slots (threads) used to train models.
   * 
   * @return the number of execution slots.
   */
  public int getExecutionSlots() {
    return m_executionSlots;
  }

  /**
   * Set the number of execution slots (threads) to use to train models with.
   * 
   * @param slots the number of execution slots to use.
   */
  public void setExecutionSlots(int slots) {
    m_executionSlots = slots;
  }

  /**
<<<<<<< HEAD
   * Set whether to block on receiving the last fold of the last run rather than
   * rejecting any further data until all processing is complete.
   * 
   * @param block true if we should block on the last fold of the last run.
   */
  public void setBlockOnLastFold(boolean block) {
    m_block = block;
  }

  /**
   * Gets whether we are blocking on the last fold of the last run rather than
   * rejecting any further data until all processing has been completed.
   * 
   * @return true if we are blocking on the last fold of the last run
   */
  public boolean getBlockOnLastFold() {
    return m_block;
  }

  /**
   * Set the template classifier for this wrapper
=======
   * Set the classifier for this wrapper
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param c a <code>weka.classifiers.Classifier</code> value
   */
  public void setClassifierTemplate(weka.classifiers.Classifier c) {
    boolean loadImages = true;
    if (c.getClass().getName()
      .compareTo(m_ClassifierTemplate.getClass().getName()) == 0) {
      loadImages = false;
    } else {
      // classifier has changed so any batch training status is now
      // invalid
      m_trainingSet = null;
    }
    m_ClassifierTemplate = c;
    String classifierName = c.getClass().toString();
    classifierName =
      classifierName.substring(classifierName.lastIndexOf('.') + 1,
        classifierName.length());
    if (loadImages) {
      if (!m_visual.loadIcons(BeanVisual.ICON_PATH + classifierName + ".gif",
        BeanVisual.ICON_PATH + classifierName + "_animated.gif")) {
        useDefaultVisual();
      }
      m_visual.setText(classifierName);
    }

    if (!(m_ClassifierTemplate instanceof weka.classifiers.UpdateableClassifier)
      && (m_listenees.containsKey("instance"))) {
      if (m_log != null) {
<<<<<<< HEAD
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + " WARNING : " + getCustomName()
          + " is not an incremental classifier");
=======
        m_log.logMessage(Messages.getInstance().getString(
          "Classifier_SetClassifierTemplate_LogMessage_Text_First")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_SetClassifierTemplate_LogMessage_Text_Second")
          + getCustomName()
          + Messages.getInstance().getString(
            "Classifier_SetClassifierTemplate_LogMessage_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    // get global info
    m_globalInfo = KnowledgeFlowApp.getGlobalInfo(m_ClassifierTemplate);
<<<<<<< HEAD

    try {
      if (m_ClassifierTemplate instanceof weka.classifiers.misc.InputMappedClassifier) {
        m_Classifier =
          weka.classifiers.AbstractClassifier.makeCopy(m_ClassifierTemplate);
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Return the classifier template currently in use.
   * 
   * @return the classifier template currently in use.
   */
  public weka.classifiers.Classifier getClassifierTemplate() {
    return m_ClassifierTemplate;
  }

  private void setTrainedClassifier(weka.classifiers.Classifier tc)
    throws Exception {

    // set the template
    weka.classifiers.Classifier newTemplate = null;
<<<<<<< HEAD
    String[] options = ((OptionHandler) tc).getOptions();
    newTemplate =
      weka.classifiers.AbstractClassifier.forName(tc.getClass().getName(),
        options);
=======

    String[] options = tc.getOptions();
    newTemplate =
      weka.classifiers.Classifier.forName(tc.getClass().getName(), options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (!newTemplate.getClass().equals(m_ClassifierTemplate.getClass())) {
      throw new Exception("Classifier model " + tc.getClass().getName()
        + " is not the same type " + "of classifier as this one ("
        + m_ClassifierTemplate.getClass().getName() + ")");
    }
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setClassifierTemplate(newTemplate);

    m_Classifier = tc;
  }

  /**
   * Returns true if this classifier has an incoming connection that is an
   * instance stream
   * 
   * @return true if has an incoming connection that is an instance stream
   */
  public boolean hasIncomingStreamInstances() {
    if (m_listenees.size() == 0) {
      return false;
    }
    if (m_listenees.containsKey("instance")) {
      return true;
    }
    return false;
  }

  /**
   * Returns true if this classifier has an incoming connection that is a batch
   * set of instances
   * 
   * @return a <code>boolean</code> value
   */
  public boolean hasIncomingBatchInstances() {
    if (m_listenees.size() == 0) {
      return false;
    }
    if (m_listenees.containsKey("trainingSet")
      || m_listenees.containsKey("testSet")) {
      return true;
    }
    return false;
  }

  /**
<<<<<<< HEAD
   * Get the currently trained classifier.
=======
   * Get the classifier currently set for this wrapper
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return a <code>weka.classifiers.Classifier</code> value
   */
  public weka.classifiers.Classifier getClassifier() {
    return m_Classifier;
  }

  /**
   * Sets the algorithm (classifier) for this bean
   * 
   * @param algorithm an <code>Object</code> value
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
  public void setWrappedAlgorithm(Object algorithm) {

    if (!(algorithm instanceof weka.classifiers.Classifier)) {
<<<<<<< HEAD
      throw new IllegalArgumentException(algorithm.getClass() + " : incorrect "
        + "type of algorithm (Classifier)");
=======
      throw new IllegalArgumentException(algorithm.getClass()
        + Messages.getInstance().getString(
          "Classifier_SetWrappedAlgorithm_IllegalArgumentException_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    setClassifierTemplate((weka.classifiers.Classifier) algorithm);
  }

  /**
   * Returns the wrapped classifier
   * 
   * @return an <code>Object</code> value
   */
  @Override
  public Object getWrappedAlgorithm() {
    return getClassifierTemplate();
  }

  /**
<<<<<<< HEAD
   * Set the name of the classifier to load at execution time. This only applies
   * in the case where the only incoming connection is a test set connection
   * (batch mode) or an instance connection (incremental mode).
   * 
   * @param filename the name of the file to load the model from
   */
  public void setLoadClassifierFileName(String filename) {
    m_loadModelFileName = filename;
  }

  /**
   * Get the name of the classifier to load at execution time. This only applies
   * in the case where the only incoming connection is a test set connection
   * (batch mode) or an instance connection (incremental mode).
   * 
   * @return the name of the file to load the model from
   */
  public String getLoadClassifierFileName() {
    return m_loadModelFileName;
  }

  /**
   * Set whether to reset (by calling buildClassifier()) an incremental
   * classifier, and thus discarding any previously learned model, before
   * processing the first instance in the incoming stream. Note that this
   * happens automatically if the incoming instances structure does not match
   * that of any previous structure used to train the model.
   * 
   * @param reset true if the incremental classifier should be reset before
   *          processing the first instance in the incoming data stream
   */
  public void setResetIncrementalClassifier(boolean reset) {
    m_resetIncrementalClassifier = reset;
  }

  /**
   * Get whether to reset (by calling buildClassifier()) an incremental
   * classifier, and thus discarding any previously learned model, before
   * processing the first instance in the incoming stream. Note that this
   * happens automatically if the incoming instances structure does not match
   * that of any previous structure used to train the model.
   *
   */
  public boolean getResetIncrementalClassifier() {
    return m_resetIncrementalClassifier;
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Get whether an incremental classifier will be updated on the incoming
   * instance stream.
   * 
   * @return true if an incremental classifier is to be updated.
   */
  public boolean getUpdateIncrementalClassifier() {
    return m_updateIncrementalClassifier;
  }

  /**
   * Set whether an incremental classifier will be updated on the incoming
   * instance stream.
   * 
   * @param update true if an incremental classifier is to be updated.
   */
  public void setUpdateIncrementalClassifier(boolean update) {
    m_updateIncrementalClassifier = update;
  }

  /**
   * Accepts an instance for incremental processing.
   * 
   * @param e an <code>InstanceEvent</code> value
   */
  @Override
  public void acceptInstance(InstanceEvent e) {
<<<<<<< HEAD
    if (m_log == null) {
      System.err.println("Log is null");
    }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_incrementalEvent = e;
    handleIncrementalEvent();
  }

<<<<<<< HEAD
  protected transient StreamThroughput m_throughput;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Handles initializing and updating an incremental classifier
   */
  private void handleIncrementalEvent() {
    if (m_executorPool != null
      && (m_executorPool.getQueue().size() > 0 || m_executorPool
        .getActiveCount() > 0)) {

      String messg =
<<<<<<< HEAD
        "[Classifier] " + statusMessagePrefix()
          + " is currently batch training!";
      if (m_log != null) {
        m_log.logMessage(messg);
        m_log.statusMessage(statusMessagePrefix() + "WARNING: "
          + "Can't accept instance - batch training in progress.");
=======
        Messages.getInstance().getString(
          "Classifier_HandleIncrementalEvent_Messg_Text_First")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_HandleIncrementalEvent_Messg_Text_Second");
      if (m_log != null) {
        m_log.logMessage(messg);
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_HandleIncrementalEvent_StatusMessage_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } else {
        System.err.println(messg);
      }
      return;
    }

    if (m_incrementalEvent.getStatus() == InstanceEvent.FORMAT_AVAILABLE) {
<<<<<<< HEAD
      m_throughput = new StreamThroughput(statusMessagePrefix());

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // clear any warnings/errors from the log
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix() + "remove");
      }

      // Instances dataset = m_incrementalEvent.getInstance().dataset();
      Instances dataset = m_incrementalEvent.getStructure();
      // default to the last column if no class is set
      if (dataset.classIndex() < 0) {
        stop();
        String errorMessage =
          statusMessagePrefix()
<<<<<<< HEAD
            + "ERROR: no class attribute set in incoming stream!";
        if (m_log != null) {
          m_log.statusMessage(errorMessage);
          m_log.logMessage("[" + getCustomName() + "] " + errorMessage);
        } else {
          System.err.println("[" + getCustomName() + "] " + errorMessage);
=======
            + Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_ErrorMessage_Text_First");
        if (m_log != null) {
          m_log.statusMessage(errorMessage);
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_HandleIncrementalEvent_LogMessage_Text_First")
            + getCustomName()
            + Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_LogMessage_Text_Second")
            + errorMessage);
        } else {
          System.err.println(Messages.getInstance().getString(
            "Classifier_HandleIncrementalEvent_Error_Text_First")
            + getCustomName()
            + Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_Error_Text_Second")
            + errorMessage);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
        return;

        // System.err.println("Classifier : setting class index...");
        // dataset.setClassIndex(dataset.numAttributes()-1);
      }
<<<<<<< HEAD

      if (m_loadModelFileName != null && m_loadModelFileName.length() > 0
        && m_state == IDLE && !m_listenees.containsKey("trainingSet")) {

        // load model (if specified)
        String resolvedFileName = m_loadModelFileName;
        if (m_env != null) {
          try {
            resolvedFileName = m_env.substitute(resolvedFileName);
          } catch (Exception ex) {
          }
        }
        File loadFrom = new File(resolvedFileName);
        try {
          loadFromFile(loadFrom);
        } catch (Exception ex) {
          // stop();
          m_log.statusMessage(statusMessagePrefix()
            + "WARNING: unable to load " + "model (see log).");
          m_log.logMessage("[Classifier] " + statusMessagePrefix()
            + "Problem loading classifier - training from scratch... "
            + ex.getMessage());
          // return;
        }
      }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      try {
        // initialize classifier if m_trainingSet is null
        // otherwise assume that classifier has been pre-trained in batch
        // mode, *if* headers match
<<<<<<< HEAD
        if (m_trainingSet == null || !m_trainingSet.equalHeaders(dataset)
          || m_resetIncrementalClassifier) {
          if (!(m_ClassifierTemplate instanceof weka.classifiers.UpdateableClassifier)
            && !(m_ClassifierTemplate instanceof weka.classifiers.misc.InputMappedClassifier)) {
=======
        if (m_trainingSet == null || (!dataset.equalHeaders(m_trainingSet))) {
          if (!(m_ClassifierTemplate instanceof weka.classifiers.UpdateableClassifier)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            stop(); // stop all processing
            if (m_log != null) {
              String msg =
                (m_trainingSet == null) ? statusMessagePrefix()
<<<<<<< HEAD
                  + "ERROR: classifier has not been batch "
                  + "trained; can't process instance events."
                  : statusMessagePrefix()
                    + "ERROR: instance event's structure is different from "
                    + "the data that "
                    + "was used to batch train this classifier; can't continue.";
              m_log.logMessage("[Classifier] " + msg);
=======
                  + Messages.getInstance().getString(
                    "Classifier_HandleIncrementalEvent_Msg_Text_First")
                  : statusMessagePrefix()
                    + Messages.getInstance().getString(
                      "Classifier_HandleIncrementalEvent_Msg_Text_Second");
              m_log.logMessage(Messages.getInstance().getString(
                "Classifier_HandleIncrementalEvent_LogMessage_Text_Third")
                + msg);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              m_log.statusMessage(msg);
            }
            return;
          }
<<<<<<< HEAD

          if (m_ClassifierTemplate instanceof weka.classifiers.misc.InputMappedClassifier) {
            m_trainingSet =
              ((weka.classifiers.misc.InputMappedClassifier) m_Classifier)
                .getModelHeader(m_trainingSet);

            /*
             * // check to see if the classifier that gets loaded is updateable
             * weka.classifiers.Classifier tempC =
             * ((weka.classifiers.misc.InputMappedClassifier
             * )m_Classifier).getClassifier(); if (!(tempC instanceof
             * weka.classifiers.UpdateableClassifier)) {
             * 
             * }
             */
          }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (m_trainingSet != null && (!dataset.equalHeaders(m_trainingSet))) {
            if (m_log != null) {
              String msg =
                statusMessagePrefix()
<<<<<<< HEAD
                  + " WARNING : structure of instance events differ "
                  + "from data used in batch training this "
                  + "classifier. Resetting classifier...";
              m_log.logMessage("[Classifier] " + msg);
=======
                  + Messages.getInstance().getString(
                    "Classifier_HandleIncrementalEvent_Msg_Text_Third");
              m_log.logMessage(Messages.getInstance().getString(
                "Classifier_HandleIncrementalEvent_LogMessage_Text_Fourth")
                + msg);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              m_log.statusMessage(msg);
            }
            m_trainingSet = null;
          }
<<<<<<< HEAD

          if (m_resetIncrementalClassifier) {
            if (m_log != null) {
              String msg =
                statusMessagePrefix() + " Reseting incremental classifier";
              m_log.logMessage("[Classifier] " + msg);
              m_log.statusMessage(msg);
            }

            m_trainingSet = null;
          }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (m_trainingSet == null) {
            // initialize the classifier if it hasn't been trained yet
            m_trainingSet = new Instances(dataset, 0);
            m_Classifier =
<<<<<<< HEAD
              weka.classifiers.AbstractClassifier
                .makeCopy(m_ClassifierTemplate);
            if (m_Classifier instanceof EnvironmentHandler && m_env != null) {
              ((EnvironmentHandler) m_Classifier).setEnvironment(m_env);
            }
=======
              weka.classifiers.Classifier.makeCopy(m_ClassifierTemplate);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            m_Classifier.buildClassifier(m_trainingSet);
          }
        }
      } catch (Exception ex) {
        stop();
        if (m_log != null) {
          m_log.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
            + "ERROR (See log for details)");
          m_log.logMessage("[Classifier] " + statusMessagePrefix()
            + " problem during incremental processing. " + ex.getMessage());
=======
            + Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_StatusMessage_Text_Second"));
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_HandleIncrementalEvent_LogMessage_Text_Fifth")
            + statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_LogMessage_Text_Sixth")
            + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
        ex.printStackTrace();
        return;
      }
<<<<<<< HEAD

      if (!m_incrementalEvent.m_formatNotificationOnly) {
        String msg =
          m_updateIncrementalClassifier ? statusMessagePrefix()
            + "Training incrementally..." : statusMessagePrefix()
            + "Predicting incrementally...";
        if (m_log != null) {
          m_log.statusMessage(msg);
        }
      }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // Notify incremental classifier listeners of new batch
      System.err.println("NOTIFYING NEW BATCH");
      m_ie.setStructure(dataset);
      m_ie.setClassifier(m_Classifier);

      notifyIncrementalClassifierListeners(m_ie);
      return;
    } else {
      if (m_trainingSet == null) {
        // simply return. If the training set is still null after
        // the first instance then the classifier must not be updateable
        // and hasn't been previously batch trained - therefore we can't
        // do anything meaningful
        return;
      }
    }

    try {
      // test on this instance
<<<<<<< HEAD
      if (m_incrementalEvent.getInstance() != null) {
        if (m_incrementalEvent.getInstance().dataset().classIndex() < 0) {
          // System.err.println("Classifier : setting class index...");
          m_incrementalEvent
            .getInstance()
            .dataset()
            .setClassIndex(
              m_incrementalEvent.getInstance().dataset().numAttributes() - 1);
        }
      }

      int status = IncrementalClassifierEvent.WITHIN_BATCH;

=======
      if (m_incrementalEvent.getInstance().dataset().classIndex() < 0) {
        // System.err.println("Classifier : setting class index...");
        m_incrementalEvent
          .getInstance()
          .dataset()
          .setClassIndex(
            m_incrementalEvent.getInstance().dataset().numAttributes() - 1);
      }

      int status = IncrementalClassifierEvent.WITHIN_BATCH;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      /*
       * if (m_incrementalEvent.getStatus() == InstanceEvent.FORMAT_AVAILABLE) {
       * status = IncrementalClassifierEvent.NEW_BATCH;
       */
<<<<<<< HEAD
      /* } else */
      if (m_incrementalEvent.getStatus() == InstanceEvent.BATCH_FINISHED
        || m_incrementalEvent.getInstance() == null) {
        status = IncrementalClassifierEvent.BATCH_FINISHED;
      }

      if (m_incrementalEvent.getInstance() != null) {
        m_throughput.updateStart();
      }

      m_ie.setStatus(status);
      m_ie.setClassifier(m_Classifier);
      m_ie.setCurrentInstance(m_incrementalEvent.getInstance());
      if (status == InstanceEvent.BATCH_FINISHED
        && m_Classifier instanceof UpdateableBatchProcessor) {
        ((UpdateableBatchProcessor) m_Classifier).batchFinished();
      }
=======
      /* } else */if (m_incrementalEvent.getStatus() == InstanceEvent.BATCH_FINISHED) {
        status = IncrementalClassifierEvent.BATCH_FINISHED;
      }

      m_ie.setStatus(status);
      m_ie.setClassifier(m_Classifier);
      m_ie.setCurrentInstance(m_incrementalEvent.getInstance());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      notifyIncrementalClassifierListeners(m_ie);

      // now update on this instance (if class is not missing and classifier
      // is updateable and user has specified that classifier is to be
      // updated)
      if (m_ClassifierTemplate instanceof weka.classifiers.UpdateableClassifier
        && m_updateIncrementalClassifier == true
<<<<<<< HEAD
        && m_incrementalEvent.getInstance() != null
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        && !(m_incrementalEvent.getInstance().isMissing(m_incrementalEvent
          .getInstance().dataset().classIndex()))) {
        ((weka.classifiers.UpdateableClassifier) m_Classifier)
          .updateClassifier(m_incrementalEvent.getInstance());
      }
<<<<<<< HEAD

      if (m_incrementalEvent.getInstance() != null) {
        m_throughput.updateEnd(m_log);
      }

      if (m_incrementalEvent.getStatus() == InstanceEvent.BATCH_FINISHED
        || m_incrementalEvent.getInstance() == null) {
=======
      if (m_incrementalEvent.getStatus() == InstanceEvent.BATCH_FINISHED) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (m_textListeners.size() > 0) {
          String modelString = m_Classifier.toString();
          String titleString = m_Classifier.getClass().getName();

          titleString =
            titleString.substring(titleString.lastIndexOf('.') + 1,
              titleString.length());
          modelString =
<<<<<<< HEAD
            "=== Classifier model ===\n\n" + "Scheme:   " + titleString + "\n"
              + "Relation: " + m_trainingSet.relationName() + "\n\n"
              + modelString;
          titleString = "Model: " + titleString;
          TextEvent nt = new TextEvent(this, modelString, titleString);
          notifyTextListeners(nt);
        }

        m_throughput.finished(m_log);
=======
            Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_ModelString_Text_First")
              + titleString
              + "\n"
              + Messages.getInstance().getString(
                "Classifier_HandleIncrementalEvent_ModelString_Text_Second")
              + m_trainingSet.relationName() + "\n\n" + modelString;
          titleString =
            Messages.getInstance().getString(
              "Classifier_HandleIncrementalEvent_TitleString_Text_First")
              + titleString;
          TextEvent nt = new TextEvent(this, modelString, titleString);
          notifyTextListeners(nt);
        }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } catch (Exception ex) {
      stop();
      if (m_log != null) {
<<<<<<< HEAD
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + ex.getMessage());
        m_log.statusMessage(statusMessagePrefix()
          + "ERROR (see log for details)");
=======
        m_log.logMessage(Messages.getInstance().getString(
          "Classifier_HandleIncrementalEvent_LogMessage_Text_Seventh")
          + statusMessagePrefix() + ex.getMessage());
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_HandleIncrementalEvent_StatusMessage_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        ex.printStackTrace();
      } else {
        ex.printStackTrace();
      }
    }
  }

  protected class TrainingTask implements Runnable, Task {
<<<<<<< HEAD

    /** Added ID to prevent warning */
    private static final long serialVersionUID = -7918128680624169641L;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    private final int m_runNum;
    private final int m_maxRunNum;
    private final int m_setNum;
    private final int m_maxSetNum;
    private Instances m_train = null;
    private final TaskStatusInfo m_taskInfo = new TaskStatusInfo();

    public TrainingTask(int runNum, int maxRunNum, int setNum, int maxSetNum,
      Instances train) {
      m_runNum = runNum;
      m_maxRunNum = maxRunNum;
      m_setNum = setNum;
      m_maxSetNum = maxSetNum;
      m_train = train;
      m_taskInfo.setExecutionStatus(TaskStatusInfo.TO_BE_RUN);
    }

    @Override
    public void run() {
      execute();
    }

<<<<<<< HEAD
    @SuppressWarnings("deprecation")
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    @Override
    public void execute() {
      try {
        if (m_train != null) {
          if (m_train.classIndex() < 0) {
            // stop all processing
            stop();
            String errorMessage =
              statusMessagePrefix()
<<<<<<< HEAD
                + "ERROR: no class attribute set in test data!";
            if (m_log != null) {
              m_log.statusMessage(errorMessage);
              m_log.logMessage("[Classifier] " + errorMessage);
            } else {
              System.err.println("[Classifier] " + errorMessage);
            }
            return;

            // assume last column is the class
            /*
=======
                + Messages.getInstance().getString(
                  "Classifier_TrainingTask_Execute_ErrorMessage_Text_First");
            if (m_log != null) {
              m_log.statusMessage(errorMessage);
              m_log.logMessage(Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_LogMessage_Text_First")
                + errorMessage);
            } else {
              System.err.println(Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_Error_Text_First")
                + errorMessage);
            }
            return;

            /*
             * // assume last column is the class
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
             * m_train.setClassIndex(m_train.numAttributes()-1); if (m_log !=
             * null) { m_log.logMessage("[Classifier] " + statusMessagePrefix()
             * + " : assuming last " +"column is the class"); }
             */
          }
          if (m_runNum == 1 && m_setNum == 1) {
            // set this back to idle once the last fold
            // of the last run has completed
            m_state = BUILDING_MODEL; // global state

            // local status of this runnable
            m_taskInfo.setExecutionStatus(TaskStatusInfo.PROCESSING);
          }

          // m_visual.setAnimated();
          // m_visual.setText("Building model...");
          String msg =
<<<<<<< HEAD
            statusMessagePrefix() + "Building model for run " + m_runNum
              + " fold " + m_setNum;
=======
            statusMessagePrefix()
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_Msg_Text_First")
              + m_runNum
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_Msg_Text_Second") + m_setNum;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (m_log != null) {
            m_log.statusMessage(msg);
          } else {
            System.err.println(msg);
          }
          // buildClassifier();

          // copy the classifier configuration
          weka.classifiers.Classifier classifierCopy =
<<<<<<< HEAD
            weka.classifiers.AbstractClassifier.makeCopy(m_ClassifierTemplate);
          if (classifierCopy instanceof EnvironmentHandler && m_env != null) {
            ((EnvironmentHandler) classifierCopy).setEnvironment(m_env);
          }
=======
            weka.classifiers.Classifier.makeCopy(m_ClassifierTemplate);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

          // build this model
          classifierCopy.buildClassifier(m_train);
          if (m_runNum == m_maxRunNum && m_setNum == m_maxSetNum) {
            // Save the last classifier (might be used later on for
            // classifying further test sets.
            m_Classifier = classifierCopy;
            m_trainingSet = new Instances(m_train, 0);
          }

          // if (m_batchClassifierListeners.size() > 0) {
          // notify anyone who might be interested in just the model
          // and training set.
          BatchClassifierEvent ce =
            new BatchClassifierEvent(Classifier.this, classifierCopy,
              new DataSetEvent(this, m_train), null, // no test
                                                     // set
                                                     // (yet)
              m_setNum, m_maxSetNum);
          ce.setGroupIdentifier(m_currentBatchIdentifier.getTime());
<<<<<<< HEAD
          ce.setLabel(getCustomName());
          notifyBatchClassifierListeners(ce);

          // store in the output queue (if we have incoming test set events)
          ce =
            new BatchClassifierEvent(Classifier.this, classifierCopy,
              new DataSetEvent(this, m_train), null, // no test set (yet)
              m_setNum, m_maxSetNum);
          ce.setGroupIdentifier(m_currentBatchIdentifier.getTime());
          ce.setLabel(getCustomName());
=======
          notifyBatchClassifierListeners(ce);

          // store in the output queue (if we have incoming test set events)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          classifierTrainingComplete(ce);
          // }

          if (classifierCopy instanceof weka.core.Drawable
            && m_graphListeners.size() > 0) {
            String grphString = ((weka.core.Drawable) classifierCopy).graph();
            int grphType = ((weka.core.Drawable) classifierCopy).graphType();
            String grphTitle = classifierCopy.getClass().getName();
            grphTitle =
              grphTitle.substring(grphTitle.lastIndexOf('.') + 1,
                grphTitle.length());
            grphTitle =
<<<<<<< HEAD
              "Set " + m_setNum + " (" + m_train.relationName() + ") "
                + grphTitle;
=======
              Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_GrphTitle_Text_First")
                + m_setNum + " (" + m_train.relationName() + ") " + grphTitle;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

            GraphEvent ge =
              new GraphEvent(Classifier.this, grphString, grphTitle, grphType);
            notifyGraphListeners(ge);
          }

          if (m_textListeners.size() > 0) {
            String modelString = classifierCopy.toString();
            String titleString = classifierCopy.getClass().getName();

            titleString =
              titleString.substring(titleString.lastIndexOf('.') + 1,
                titleString.length());
<<<<<<< HEAD

            modelString =
              "=== Classifier model ===\n\n" + "Scheme:   " + titleString
                + "\n" + "Relation: " + m_train.relationName()
                + ((m_maxSetNum > 1) ? "\nTraining Fold: " + m_setNum : "")
                + "\n\n" + modelString;
            titleString = "Model: " + titleString;
=======
            modelString =
              Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_ModelString_Text_First")
                + titleString
                + "\n"
                + Messages.getInstance().getString(
                  "Classifier_TrainingTask_Execute_ModelString_Text_Second")
                + m_train.relationName()
                + ((m_maxSetNum > 1) ? Messages.getInstance().getString(
                  "Classifier_TrainingTask_Execute_ModelString_Text_Third")
                  + m_setNum : "") + "\n\n" + modelString;
            titleString =
              Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_TitleString_Text_First")
                + titleString;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

            TextEvent nt =
              new TextEvent(Classifier.this, modelString, titleString
                + (m_maxSetNum > 1 ? (" (fold " + m_setNum + ")") : ""));
            notifyTextListeners(nt);
          }
        }
      } catch (Exception ex) {
<<<<<<< HEAD
        ex.printStackTrace();
        if (m_log != null) {
          String titleString = "[Classifier] " + statusMessagePrefix();

          titleString +=
            " run " + m_runNum + " fold " + m_setNum + " failed to complete.";
          m_log.logMessage(titleString + " (build classifier). "
            + ex.getMessage());
          m_log.statusMessage(statusMessagePrefix()
            + "ERROR (see log for details)");
          ex.printStackTrace();
        }
        m_taskInfo.setExecutionStatus(TaskStatusInfo.FAILED);
        // Stop all processing
        stop();
      } finally {
        m_visual.setStatic();
        if (m_log != null) {
          if (m_setNum == m_maxSetNum) {
            m_log.statusMessage(statusMessagePrefix() + "Finished.");
          }
        }
        m_state = IDLE;
=======
        // Stop all processing
        stop();
        ex.printStackTrace();
        if (m_log != null) {
          String titleString =
            Messages.getInstance().getString(
              "Classifier_TrainingTask_Execute_TitleString_Text_Second")
              + statusMessagePrefix();

          titleString +=
            Messages.getInstance().getString(
              "Classifier_TrainingTask_Execute_TitleString_Text_Third")
              + m_runNum
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_TitleString_Text_Fourth")
              + m_setNum
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_TitleString_Text_Fifth");
          m_log.logMessage(titleString
            + Messages.getInstance().getString(
              "Classifier_TrainingTask_Execute_LogMessage_Text_Fourth")
            + ex.getMessage());
          m_log.statusMessage(statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_TrainingTask_Execute_StatusMessage_Text_First"));
          ex.printStackTrace();
        }
        m_taskInfo.setExecutionStatus(TaskStatusInfo.FAILED);
      } finally {
        m_visual.setStatic();
        if (m_log != null) {
          m_log.statusMessage(statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_TrainingTask_Execute_StatusMessage_Text_Second"));
        }
        m_state = IDLE;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (Thread.currentThread().isInterrupted()) {
          // prevent any classifier events from being fired
          m_trainingSet = null;
          if (m_log != null) {
<<<<<<< HEAD
            String titleString = "[Classifier] " + statusMessagePrefix();

            m_log.logMessage(titleString + " (" + " run " + m_runNum + " fold "
              + m_setNum + ") interrupted!");
            m_log.statusMessage(statusMessagePrefix() + "INTERRUPTED");
=======
            String titleString =
              Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_TitleString_Text_Sixth")
                + statusMessagePrefix();

            m_log.logMessage(titleString
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_LogMessage_Text_Fifth")
              + m_runNum
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_LogMessage_Text_Sixth")
              + m_setNum
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_LogMessage_Text_Seventh"));
            m_log.statusMessage(statusMessagePrefix()
              + Messages.getInstance().getString(
                "Classifier_TrainingTask_Execute_LogMessage_Text_Seventh"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

            /*
             * // are we the last active thread? if
             * (m_executorPool.getActiveCount() == 1) { String msg =
             * "[Classifier] " + statusMessagePrefix() +
<<<<<<< HEAD
             * " last classifier unblocking..."; System.err.println(msg +
             * " (interrupted)"); m_log.logMessage(msg + " (interrupted)"); //
             * m_log.statusMessage(statusMessagePrefix() + "finished."); m_block
             * = false; m_state = IDLE; block(false); }
=======
             * " last classifier unblocking..."; m_log.logMessage(msg); //
             * m_log.statusMessage(statusMessagePrefix() + "finished."); m_block
             * = false; // block(false); }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
             */
          }
          /*
           * System.err.println("Queue size: " +
           * m_executorPool.getQueue().size() + " Active count: " +
           * m_executorPool.getActiveCount());
           */
        } /*
           * else { // check to see if we are the last active thread if
           * (m_executorPool == null || (m_executorPool.getQueue().size() == 0
           * && m_executorPool.getActiveCount() == 1)) {
           * 
           * String msg = "[Classifier] " + statusMessagePrefix() +
<<<<<<< HEAD
           * " last classifier unblocking..."; System.err.println(msg); if
           * (m_log != null) { m_log.logMessage(msg); } else {
           * System.err.println(msg); } //m_visual.setText(m_oldText);
           * 
           * if (m_log != null) { m_log.statusMessage(statusMessagePrefix() +
           * "Finished."); } // m_outputQueues = null; // free memory m_block =
           * false; block(false); } }
=======
           * " last classifier unblocking..."; if (m_log != null) {
           * m_log.logMessage(msg); } else { System.err.println(msg); }
           * //m_visual.setText(m_oldText);
           * 
           * if (m_log != null) { m_log.statusMessage(statusMessagePrefix() +
           * "Finished."); } // m_outputQueues = null; // free memory m_block =
           * false; m_state = IDLE; // block(false); } }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
           */
      }
    }

    @Override
    public TaskStatusInfo getTaskStatus() {
      // TODO
      return null;
    }
  }

  /**
   * Accepts a training set and builds batch classifier
   * 
   * @param e a <code>TrainingSetEvent</code> value
   */
  @Override
  public void acceptTrainingSet(final TrainingSetEvent e) {

    if (e.isStructureOnly()) {
      // no need to build a classifier, instead just generate a dummy
      // BatchClassifierEvent in order to pass on instance structure to
      // any listeners - eg. PredictionAppender can use it to determine
      // the final structure of instances with predictions appended
      BatchClassifierEvent ce =
        new BatchClassifierEvent(this, m_Classifier, new DataSetEvent(this,
          e.getTrainingSet()), new DataSetEvent(this, e.getTrainingSet()),
          e.getSetNumber(), e.getMaxSetNumber());

      notifyBatchClassifierListeners(ce);
      return;
    }

<<<<<<< HEAD
    if (m_reject) {
      // block(true);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix() + "BUSY. Can't accept data "
          + "at this time.");
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + " BUSY. Can't accept data at this time.");
=======
    if (m_block) {
      // block(true);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_StatusMessage_Text_First"));
        m_log.logMessage(Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_LogMessage_Text_First")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_LogMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return;
    }

    // Do some initialization if this is the first set of the first run
    if (e.getRunNumber() == 1 && e.getSetNumber() == 1) {
      // m_oldText = m_visual.getText();
      // store the training header
      m_trainingSet = new Instances(e.getTrainingSet(), 0);
      m_state = BUILDING_MODEL;

      String msg =
<<<<<<< HEAD
        "[Classifier] " + statusMessagePrefix() + " starting executor pool ("
          + getExecutionSlots() + " slots)...";
=======
        Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_Msg_Text_First")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_Msg_Text_Second")
          + getExecutionSlots()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_Msg_Text_Third");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (m_log != null) {
        m_log.logMessage(msg);
      } else {
        System.err.println(msg);
      }
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // start the execution pool (always re-create the executor because the
      // user
      // might have changed the number of execution slots since the last time)
      // if (m_executorPool == null) {
      startExecutorPool();
      // }

      // setup output queues
<<<<<<< HEAD
      msg = "[Classifier] " + statusMessagePrefix() + " setup output queues.";
=======
      msg =
        Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_Msg_Text_Fourth")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_Msg_Text_Fifth");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (m_log != null) {
        m_log.logMessage(msg);
      } else {
        System.err.println(msg);
      }

      if (!m_batchStarted) {
        m_outputQueues =
          new BatchClassifierEvent[e.getMaxRunNumber()][e.getMaxSetNumber()];
        m_completedSets = new boolean[e.getMaxRunNumber()][e.getMaxSetNumber()];
        m_currentBatchIdentifier = new Date();
        m_batchStarted = true;
      }
    }

    // create a new task and schedule for execution
    TrainingTask newTask =
      new TrainingTask(e.getRunNumber(), e.getMaxRunNumber(), e.getSetNumber(),
        e.getMaxSetNumber(), e.getTrainingSet());
    String msg =
<<<<<<< HEAD
      "[Classifier] " + statusMessagePrefix() + " scheduling run "
        + e.getRunNumber() + " fold " + e.getSetNumber() + " for execution...";
=======
      Messages.getInstance().getString(
        "Classifier_AcceptTrainingSet_Msg_Text_Sixth")
        + statusMessagePrefix()
        + Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_Msg_Text_Seventh")
        + e.getRunNumber()
        + Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_Msg_Text_Eighth")
        + e.getSetNumber()
        + Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_Msg_Text_Nineth");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_log != null) {
      m_log.logMessage(msg);
    } else {
      System.err.println(msg);
    }

    // delay just a little bit
    /*
     * try { Thread.sleep(10); } catch (Exception ex){}
     */
    m_executorPool.execute(newTask);
  }

  /**
<<<<<<< HEAD
   * Check if the class is missing for all instances in the supplied set
   * 
   * @param toCheck the instances to check
   * @return true if all class values are missing
   */
  protected static boolean allMissingClass(Instances toCheck) {
    if (toCheck.classIndex() < 0) {
      return false;
    }

    for (int i = 0; i < toCheck.numInstances(); i++) {
      if (!toCheck.instance(i).classIsMissing()) {
        return false;
      }
    }

    return true;
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Accepts a test set for a batch trained classifier
   * 
   * @param e a <code>TestSetEvent</code> value
   */
  @Override
  public synchronized void acceptTestSet(TestSetEvent e) {
<<<<<<< HEAD
    if (m_reject) {
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix() + "BUSY. Can't accept data "
          + "at this time.");
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + " BUSY. Can't accept data at this time.");
=======

    if (m_block) {
      // block(true);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_StatusMessage_Text_Second"));
        m_log.logMessage(Messages.getInstance().getString(
          "Classifier_AcceptTrainingSet_Msg_Text_Nineth")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTrainingSet_StatusMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return;
    }

    Instances testSet = e.getTestSet();
    if (testSet != null) {
      if (testSet.classIndex() < 0) {
        // testSet.setClassIndex(testSet.numAttributes() - 1);
        // stop all processing
        stop();
        String errorMessage =
<<<<<<< HEAD
          statusMessagePrefix() + "ERROR: no class attribute set in test data!";
        if (m_log != null) {
          m_log.statusMessage(errorMessage);
          m_log.logMessage("[Classifier] " + errorMessage);
        } else {
          System.err.println("[Classifier] " + errorMessage);
        }
        return;
      }
    }

    if (m_loadModelFileName != null && m_loadModelFileName.length() > 0
      && m_state == IDLE && !m_listenees.containsKey("trainingSet")
      && e.getMaxRunNumber() == 1 && e.getMaxSetNumber() == 1) {

      // load model (if specified)
      String resolvedFileName = m_loadModelFileName;
      if (m_env != null) {
        try {
          resolvedFileName = m_env.substitute(resolvedFileName);
        } catch (Exception ex) {
        }
      }
      File loadFrom = new File(resolvedFileName);
      try {
        loadFromFile(loadFrom);
      } catch (Exception ex) {
        stop();
        m_log.statusMessage(statusMessagePrefix() + "ERROR: unable to load "
          + "model (see log).");
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + "Problem loading classifier. " + ex.getMessage());
=======
          statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_AcceptTestSet_ErrorMessage_Text_First");
        if (m_log != null) {
          m_log.statusMessage(errorMessage);
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_AcceptTestSet_LogMessage_Text_First")
            + errorMessage);
        } else {
          System.err.println(Messages.getInstance().getString(
            "Classifier_AcceptTestSet_Error_Text_First")
            + errorMessage);
        }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        return;
      }
    }

<<<<<<< HEAD
    weka.classifiers.Classifier classifierToUse = m_Classifier;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // If we just have a test set connection or
    // there is just one run involving one set (and we are not
    // currently building a model), then use the
    // last saved model
<<<<<<< HEAD
    if (classifierToUse != null && m_state == IDLE
      && (!m_listenees.containsKey("trainingSet") /*
                                                   * || (e.getMaxRunNumber() ==
                                                   * 1 && e .getMaxSetNumber()
                                                   * == 1)
                                                   */)) {
=======
    if (m_Classifier != null && m_state == IDLE
      && (!m_listenees.containsKey("trainingSet"))) {

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // if this is structure only then just return at this point
      if (e.getTestSet() != null && e.isStructureOnly()) {
        return;
      }

<<<<<<< HEAD
      if (classifierToUse instanceof EnvironmentHandler && m_env != null) {
        ((EnvironmentHandler) classifierToUse).setEnvironment(m_env);
      }

      if (classifierToUse instanceof weka.classifiers.misc.InputMappedClassifier) {
        // make sure that we have the correct training header (if
        // InputMappedClassifier
        // is loading a model from a file).
        try {
          m_trainingSet =
            ((weka.classifiers.misc.InputMappedClassifier) classifierToUse)
              .getModelHeader(m_trainingSet); // this returns the argument if a
                                              // model is not being loaded
        } catch (Exception e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
      }

      // check that we have a training set/header (if we don't,
=======
      // first check that we have a training set/header (if we don't,
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // then it means that no model has been loaded
      if (m_trainingSet == null) {
        stop();
        String errorMessage =
          statusMessagePrefix()
<<<<<<< HEAD
            + "ERROR: no trained/loaded classifier to use for prediction!";
        if (m_log != null) {
          m_log.statusMessage(errorMessage);
          m_log.logMessage("[Classifier] " + errorMessage);
        } else {
          System.err.println("[Classifier] " + errorMessage);
=======
            + Messages.getInstance().getString(
              "Classifier_AcceptTestSet_ErrorMessage_Text_First_Alpha");
        if (m_log != null) {
          m_log.statusMessage(errorMessage);
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_AcceptTestSet_LogMessage_Text_Second")
            + errorMessage);
        } else {
          System.err.println(Messages.getInstance().getString(
            "Classifier_AcceptTestSet_Error_Text_Second")
            + errorMessage);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
        return;
      }

      testSet = e.getTestSet();
      if (e.getRunNumber() == 1 && e.getSetNumber() == 1) {
        m_currentBatchIdentifier = new Date();
      }

      if (testSet != null) {
<<<<<<< HEAD
        if (!m_trainingSet.equalHeaders(testSet)
          && !(classifierToUse instanceof weka.classifiers.misc.InputMappedClassifier)) {
          boolean wrapClassifier = false;
          if (!Utils
            .getDontShowDialog("weka.gui.beans.Classifier.AutoWrapInInputMappedClassifier")) {

            // java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment
            // .getLocalGraphicsEnvironment();
            if (!GraphicsEnvironment.isHeadless()) {
              JCheckBox dontShow =
                new JCheckBox("Do not show this message again");
              Object[] stuff = new Object[2];
              stuff[0] =
                "Data used to train model and test set are not compatible.\n"
                  + "Would you like to automatically wrap the classifier in\n"
                  + "an \"InputMappedClassifier\" before proceeding?.\n";
              stuff[1] = dontShow;

              int result =
                JOptionPane.showConfirmDialog(this, stuff,
                  "KnowledgeFlow:Classifier", JOptionPane.YES_OPTION);

              if (result == JOptionPane.YES_OPTION) {
                wrapClassifier = true;
              }

              if (dontShow.isSelected()) {
                String response = (wrapClassifier) ? "yes" : "no";
                try {
                  Utils
                    .setDontShowDialogResponse(
                      "weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier",
                      response);
                } catch (Exception e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
                }
              }
            } else {
              // running headless, so just go ahead and wrap anyway
              wrapClassifier = true;
            }
          } else {
            // What did the user say - do they want to autowrap or not?
            String response;
            try {
              response =
                Utils
                  .getDontShowDialogResponse("weka.gui.explorer.ClassifierPanel.AutoWrapInInputMappedClassifier");
              if (response != null && response.equalsIgnoreCase("yes")) {
                wrapClassifier = true;
              }
            } catch (Exception e1) {
              // TODO Auto-generated catch block
              e1.printStackTrace();
            }
          }

          if (wrapClassifier) {
            weka.classifiers.misc.InputMappedClassifier temp =
              new weka.classifiers.misc.InputMappedClassifier();

            temp.setClassifier(classifierToUse);
            temp.setModelHeader(new Instances(m_trainingSet, 0));
            classifierToUse = temp;
          }
        }

        if (m_trainingSet.equalHeaders(testSet)
          || (classifierToUse instanceof weka.classifiers.misc.InputMappedClassifier)) {
          BatchClassifierEvent ce =
            new BatchClassifierEvent(this, classifierToUse, new DataSetEvent(
              this, m_trainingSet), new DataSetEvent(this, e.getTestSet()),
              e.getRunNumber(), e.getMaxRunNumber(), e.getSetNumber(),
              e.getMaxSetNumber());
          ce.setGroupIdentifier(m_currentBatchIdentifier.getTime());
          ce.setLabel(getCustomName());

          if (m_log != null && !e.isStructureOnly()) {
            m_log.statusMessage(statusMessagePrefix() + "Finished.");
          }
          m_batchStarted = false;
          notifyBatchClassifierListeners(ce);
        } else {
          // if headers do not match check to see if it's
          // just the class that is different and that
          // all class values are missing
          if (testSet.numInstances() > 0) {
            if (testSet.classIndex() == m_trainingSet.classIndex()
              && allMissingClass(testSet)) {
              // now check the other attributes against the training
              // structure
              boolean ok = true;
              for (int i = 0; i < testSet.numAttributes(); i++) {
                if (i != testSet.classIndex()) {
                  ok = testSet.attribute(i).equals(m_trainingSet.attribute(i));
                  if (!ok) {
                    break;
                  }
                }
              }

              if (ok) {
                BatchClassifierEvent ce =
                  new BatchClassifierEvent(this, classifierToUse,
                    new DataSetEvent(this, m_trainingSet), new DataSetEvent(
                      this, e.getTestSet()), e.getRunNumber(),
                    e.getMaxRunNumber(), e.getSetNumber(), e.getMaxSetNumber());
                ce.setGroupIdentifier(m_currentBatchIdentifier.getTime());
                ce.setLabel(getCustomName());

                if (m_log != null && !e.isStructureOnly()) {
                  m_log.statusMessage(statusMessagePrefix() + "Finished.");
                }
                m_batchStarted = false;
                notifyBatchClassifierListeners(ce);
              } else {
                stop();
                String errorMessage =
                  statusMessagePrefix()
                    + "ERROR: structure of training and test sets is not compatible!";
                if (m_log != null) {
                  m_log.statusMessage(errorMessage);
                  m_log.logMessage("[Classifier] " + errorMessage);
                } else {
                  System.err.println("[Classifier] " + errorMessage);
                }
              }
            }
          }
=======
        /*
         * if (testSet.classIndex() < 0) {
         * testSet.setClassIndex(testSet.numAttributes() - 1); }
         */

        if (m_trainingSet.equalHeaders(testSet)) {
          BatchClassifierEvent ce =
            new BatchClassifierEvent(this, m_Classifier, new DataSetEvent(this,
              m_trainingSet), new DataSetEvent(this, e.getTestSet()),
              e.getRunNumber(), e.getMaxRunNumber(), e.getSetNumber(),
              e.getMaxSetNumber());
          ce.setGroupIdentifier(m_currentBatchIdentifier.getTime());

          if (m_log != null && !e.isStructureOnly()) {
            m_log.statusMessage(statusMessagePrefix()
              + Messages.getInstance().getString(
                "Classifier_AcceptTestSet_StatusMessage_Text_First"));
          }
          m_batchStarted = false;
          notifyBatchClassifierListeners(ce);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    } else {
      /*
       * System.err.println("[Classifier] accepting test set: run " +
       * e.getRunNumber() + " fold " + e.getSetNumber());
       */
      if (e.getRunNumber() == 1 && e.getSetNumber() == 1) {
        if (!m_batchStarted) {
          m_outputQueues =
            new BatchClassifierEvent[e.getMaxRunNumber()][e.getMaxSetNumber()];
          m_completedSets =
            new boolean[e.getMaxRunNumber()][e.getMaxSetNumber()];
          m_currentBatchIdentifier = new Date();
          m_batchStarted = true;
        }
      }

      if (m_outputQueues[e.getRunNumber() - 1][e.getSetNumber() - 1] == null) {
<<<<<<< HEAD

        if (!e.isStructureOnly()) {
          // store an event with a null model and training set (to be filled in
          // later)
          m_outputQueues[e.getRunNumber() - 1][e.getSetNumber() - 1] =
            new BatchClassifierEvent(this, null, null, new DataSetEvent(this,
              e.getTestSet()), e.getRunNumber(), e.getMaxRunNumber(),
              e.getSetNumber(), e.getMaxSetNumber());
          m_outputQueues[e.getRunNumber() - 1][e.getSetNumber() - 1]
            .setLabel(getCustomName());
          if (e.getRunNumber() == e.getMaxRunNumber()
            && e.getSetNumber() == e.getMaxSetNumber()) {

            // block on the last fold of the last run (unless there is only one
            // fold and one run)
            /*
             * System.err.println(
             * "[Classifier] blocking on last fold of last run..." );
             * block(true);
             */
            if (e.getMaxSetNumber() != 1) {
              m_reject = true;
              if (m_block) {
                block(true);
              }
            }
=======
        // store an event with a null model and training set (to be filled in
        // later)
        m_outputQueues[e.getRunNumber() - 1][e.getSetNumber() - 1] =
          new BatchClassifierEvent(this, null, null, new DataSetEvent(this,
            e.getTestSet()), e.getRunNumber(), e.getMaxRunNumber(),
            e.getSetNumber(), e.getMaxSetNumber());

        if (e.getRunNumber() == e.getMaxRunNumber()
          && e.getSetNumber() == e.getMaxSetNumber()) {

          // block on the last fold of the last run
          /*
           * System.err.println("[Classifier] blocking on last fold of last run..."
           * ); block(true);
           */
          if (e.getMaxSetNumber() != 1) {
            m_block = true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          }
        }
      } else {
        // Otherwise, there is a model here waiting for a test set...
        m_outputQueues[e.getRunNumber() - 1][e.getSetNumber() - 1]
          .setTestSet(new DataSetEvent(this, e.getTestSet()));
        checkCompletedRun(e.getRunNumber(), e.getMaxRunNumber(),
          e.getMaxSetNumber());
      }
    }
  }

  private synchronized void classifierTrainingComplete(BatchClassifierEvent ce) {
    // check the output queues if we have an incoming test set connection
    if (m_listenees.containsKey("testSet")) {
      String msg =
<<<<<<< HEAD
        "[Classifier] " + statusMessagePrefix() + " storing model for run "
          + ce.getRunNumber() + " fold " + ce.getSetNumber();
=======
        Messages.getInstance().getString(
          "Classifier_AcceptTestSet_Msg_Text_First")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTestSet_Msg_Text_Second")
          + ce.getRunNumber()
          + Messages.getInstance().getString(
            "Classifier_AcceptTestSet_Msg_Text_Third") + ce.getSetNumber();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (m_log != null) {
        m_log.logMessage(msg);
      } else {
        System.err.println(msg);
      }

      if (m_outputQueues[ce.getRunNumber() - 1][ce.getSetNumber() - 1] == null) {
        // store the event - test data filled in later
        m_outputQueues[ce.getRunNumber() - 1][ce.getSetNumber() - 1] = ce;
      } else {
        // there is a test set here waiting for a model and training set
        m_outputQueues[ce.getRunNumber() - 1][ce.getSetNumber() - 1]
          .setClassifier(ce.getClassifier());
        m_outputQueues[ce.getRunNumber() - 1][ce.getSetNumber() - 1]
          .setTrainSet(ce.getTrainSet());

      }
      checkCompletedRun(ce.getRunNumber(), ce.getMaxRunNumber(),
        ce.getMaxSetNumber());
    }
  }

  private synchronized void checkCompletedRun(int runNum, int maxRunNum,
    int maxSets) {
    // look to see if there are any completed classifiers that we can pass
    // on for evaluation
    for (int i = 0; i < maxSets; i++) {
      if (m_outputQueues[runNum - 1][i] != null) {
        if (m_outputQueues[runNum - 1][i].getClassifier() != null
          && m_outputQueues[runNum - 1][i].getTestSet() != null) {
          String msg =
<<<<<<< HEAD
            "[Classifier] " + statusMessagePrefix() + " dispatching run/set "
              + runNum + "/" + (i + 1) + " to listeners.";
=======
            Messages.getInstance().getString(
              "Classifier_AcceptTestSet_Msg_Text_Fourth")
              + statusMessagePrefix()
              + Messages.getInstance().getString(
                "Classifier_AcceptTestSet_Msg_Text_Fifth")
              + runNum
              + "/"
              + (i + 1)
              + Messages.getInstance().getString(
                "Classifier_AcceptTestSet_Msg_Text_Sixth");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (m_log != null) {
            m_log.logMessage(msg);
          } else {
            System.err.println(msg);
          }

          // dispatch this one
          m_outputQueues[runNum - 1][i]
            .setGroupIdentifier(m_currentBatchIdentifier.getTime());
<<<<<<< HEAD
          m_outputQueues[runNum - 1][i].setLabel(getCustomName());
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          notifyBatchClassifierListeners(m_outputQueues[runNum - 1][i]);
          // save memory
          m_outputQueues[runNum - 1][i] = null;
          // mark as done
          m_completedSets[runNum - 1][i] = true;
        }
      }
    }

    // scan for completion
    boolean done = true;
    for (int i = 0; i < maxRunNum; i++) {
      for (int j = 0; j < maxSets; j++) {
        if (!m_completedSets[i][j]) {
          done = false;
          break;
        }
      }
      if (!done) {
        break;
      }
    }

    if (done) {
      String msg =
<<<<<<< HEAD
        "[Classifier] " + statusMessagePrefix()
          + " last classifier unblocking...";
=======
        Messages.getInstance().getString(
          "Classifier_AcceptTestSet_Msg_Text_Seventh")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTestSet_Msg_Text_Eighth");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      if (m_log != null) {
        m_log.logMessage(msg);
      } else {
        System.err.println(msg);
      }
      // m_visual.setText(m_oldText);

      if (m_log != null) {
<<<<<<< HEAD
        m_log.statusMessage(statusMessagePrefix() + "Finished.");
      }
      // m_outputQueues = null; // free memory
      m_reject = false;
      m_batchStarted = false;
      block(false);
=======
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_AcceptTestSet_StatusMessage_Text_Second"));
      }
      // m_outputQueues = null; // free memory

      m_batchStarted = false;
      block(false);
      m_block = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_state = IDLE;
    }
  }

  /*
   * private synchronized void checkCompletedRun(int runNum, int maxRunNum, int
   * maxSets) { boolean runOK = true; for (int i = 0; i < maxSets; i++) { if
   * (m_outputQueues[runNum - 1][i] == null) { runOK = false; break; } else if
   * (m_outputQueues[runNum - 1][i].getClassifier() == null ||
   * m_outputQueues[runNum - 1][i].getTestSet() == null) { runOK = false; break;
   * } }
   * 
   * if (runOK) { String msg = "[Classifier] " + statusMessagePrefix() +
   * " dispatching run " + runNum + " to listeners."; if (m_log != null) {
   * m_log.logMessage(msg); } else { System.err.println(msg); } // dispatch this
   * run to listeners for (int i = 0; i < maxSets; i++) {
   * notifyBatchClassifierListeners(m_outputQueues[runNum - 1][i]); // save
   * memory m_outputQueues[runNum - 1][i] = null; }
   * 
   * if (runNum == maxRunNum) { // unblock msg = "[Classifier] " +
   * statusMessagePrefix() + " last classifier unblocking...";
<<<<<<< HEAD
   * 
   * if (m_log != null) { m_log.logMessage(msg); } else {
   * System.err.println(msg); } //m_visual.setText(m_oldText);
   * 
   * if (m_log != null) { m_log.statusMessage(statusMessagePrefix() +
   * "Finished."); } // m_outputQueues = null; // free memory m_reject = false;
   * block(false); m_state = IDLE; } } }
=======
   * System.err.println(msg); if (m_log != null) { m_log.logMessage(msg); } else
   * { System.err.println(msg); } //m_visual.setText(m_oldText);
   * 
   * if (m_log != null) { m_log.statusMessage(statusMessagePrefix() +
   * "Finished."); } // m_outputQueues = null; // free memory m_block = false;
   * // block(false); m_state = IDLE; } } }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */

  /**
   * Sets the visual appearance of this wrapper bean
   * 
   * @param newVisual a <code>BeanVisual</code> value
   */
  @Override
  public void setVisual(BeanVisual newVisual) {
    m_visual = newVisual;
  }

  /**
   * Gets the visual appearance of this wrapper bean
   */
  @Override
  public BeanVisual getVisual() {
    return m_visual;
  }

  /**
   * Use the default visual appearance for this bean
   */
  @Override
  public void useDefaultVisual() {
    // try to get a default for this package of classifiers
    String name = m_ClassifierTemplate.getClass().toString();
    String packageName = name.substring(0, name.lastIndexOf('.'));
    packageName =
      packageName.substring(packageName.lastIndexOf('.') + 1,
        packageName.length());
    if (!m_visual.loadIcons(BeanVisual.ICON_PATH + "Default_" + packageName
      + "Classifier.gif", BeanVisual.ICON_PATH + "Default_" + packageName
      + "Classifier_animated.gif")) {
      m_visual.loadIcons(BeanVisual.ICON_PATH + "DefaultClassifier.gif",
        BeanVisual.ICON_PATH + "DefaultClassifier_animated.gif");
    }
  }

  /**
   * Add a batch classifier listener
   * 
   * @param cl a <code>BatchClassifierListener</code> value
   */
<<<<<<< HEAD
  public synchronized void
    addBatchClassifierListener(BatchClassifierListener cl) {
=======
  public synchronized void addBatchClassifierListener(BatchClassifierListener cl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_batchClassifierListeners.addElement(cl);
  }

  /**
   * Remove a batch classifier listener
   * 
   * @param cl a <code>BatchClassifierListener</code> value
   */
  public synchronized void removeBatchClassifierListener(
    BatchClassifierListener cl) {
    m_batchClassifierListeners.remove(cl);
  }

  /**
   * Notify all batch classifier listeners of a batch classifier event
   * 
   * @param ce a <code>BatchClassifierEvent</code> value
   */
<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  private synchronized void notifyBatchClassifierListeners(
    BatchClassifierEvent ce) {

=======
  private void notifyBatchClassifierListeners(BatchClassifierEvent ce) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // don't do anything if the thread that we've been running in has been
    // interrupted
    if (Thread.currentThread().isInterrupted()) {
      return;
    }
<<<<<<< HEAD
    Vector<BatchClassifierListener> l;
    synchronized (this) {
      l = (Vector<BatchClassifierListener>) m_batchClassifierListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        if (l.size() > 1) {
          try {
            // make serialized copies here in order to protect classifiers that
            // might not be thread safe in the predict/distributionForInstance()
            // methods (e.g. FilteredClassifier). ClassifierPerformanceEvaluator
            // is multi-threaded, so we could potentially have two different
            // steps
            // calling distributionForInstance() at the same time
            weka.classifiers.Classifier newC =
              weka.classifiers.AbstractClassifier.makeCopy(ce.getClassifier());
            BatchClassifierEvent ne =
              new BatchClassifierEvent(Classifier.this, newC, ce.getTrainSet(),
                ce.getTestSet(), ce.getRunNumber(), ce.getMaxRunNumber(),
                ce.getSetNumber(), ce.getMaxSetNumber());
            l.elementAt(i).acceptClassifier(ne);
          } catch (Exception e) {
            stop(); // stop all processing
            if (m_log != null) {
              String msg =
                statusMessagePrefix()
                  + "ERROR: unable to make copy of classifier - see log ";

              m_log.logMessage("[Classifier] " + msg + " (" + e.getMessage()
                + ")");
              m_log.statusMessage(msg);
            }
            e.printStackTrace();
            break;
          }
        } else {
          l.elementAt(i).acceptClassifier(ce);
        }
=======

    Vector l;
    synchronized (this) {
      l = (Vector) m_batchClassifierListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        ((BatchClassifierListener) l.elementAt(i)).acceptClassifier(ce);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Add a graph listener
   * 
   * @param cl a <code>GraphListener</code> value
   */
  public synchronized void addGraphListener(GraphListener cl) {
    m_graphListeners.addElement(cl);
  }

  /**
   * Remove a graph listener
   * 
   * @param cl a <code>GraphListener</code> value
   */
  public synchronized void removeGraphListener(GraphListener cl) {
    m_graphListeners.remove(cl);
  }

  /**
   * Notify all graph listeners of a graph event
   * 
   * @param ge a <code>GraphEvent</code> value
   */
<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  private void notifyGraphListeners(GraphEvent ge) {
    Vector<GraphListener> l;
    synchronized (this) {
      l = (Vector<GraphListener>) m_graphListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).acceptGraph(ge);
=======
  private void notifyGraphListeners(GraphEvent ge) {
    Vector l;
    synchronized (this) {
      l = (Vector) m_graphListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        ((GraphListener) l.elementAt(i)).acceptGraph(ge);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Add a text listener
   * 
   * @param cl a <code>TextListener</code> value
   */
  public synchronized void addTextListener(TextListener cl) {
    m_textListeners.addElement(cl);
  }

  /**
   * Remove a text listener
   * 
   * @param cl a <code>TextListener</code> value
   */
  public synchronized void removeTextListener(TextListener cl) {
    m_textListeners.remove(cl);
  }

  /**
<<<<<<< HEAD
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
  public synchronized void
    removeConfigurationListener(ConfigurationListener cl) {

  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Notify all text listeners of a text event
   * 
   * @param ge a <code>TextEvent</code> value
   */
<<<<<<< HEAD
  @SuppressWarnings("unchecked")
  private void notifyTextListeners(TextEvent ge) {
    Vector<TextListener> l;
    synchronized (this) {
      l = (Vector<TextListener>) m_textListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).acceptText(ge);
=======
  private void notifyTextListeners(TextEvent ge) {
    Vector l;
    synchronized (this) {
      l = (Vector) m_textListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        ((TextListener) l.elementAt(i)).acceptText(ge);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Add an incremental classifier listener
   * 
   * @param cl an <code>IncrementalClassifierListener</code> value
   */
  public synchronized void addIncrementalClassifierListener(
    IncrementalClassifierListener cl) {
    m_incrementalClassifierListeners.add(cl);
  }

  /**
   * Remove an incremental classifier listener
   * 
   * @param cl an <code>IncrementalClassifierListener</code> value
   */
  public synchronized void removeIncrementalClassifierListener(
    IncrementalClassifierListener cl) {
    m_incrementalClassifierListeners.remove(cl);
  }

  /**
   * Notify all incremental classifier listeners of an incremental classifier
   * event
   * 
   * @param ce an <code>IncrementalClassifierEvent</code> value
   */
<<<<<<< HEAD
  @SuppressWarnings("unchecked")
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private void notifyIncrementalClassifierListeners(
    IncrementalClassifierEvent ce) {
    // don't do anything if the thread that we've been running in has been
    // interrupted
    if (Thread.currentThread().isInterrupted()) {
      return;
    }

<<<<<<< HEAD
    Vector<IncrementalClassifierListener> l;
    synchronized (this) {
      l =
        (Vector<IncrementalClassifierListener>) m_incrementalClassifierListeners
          .clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).acceptClassifier(ce);
=======
    Vector l;
    synchronized (this) {
      l = (Vector) m_incrementalClassifierListeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        ((IncrementalClassifierListener) l.elementAt(i)).acceptClassifier(ce);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Returns true if, at this time, the object will accept a connection with
   * respect to the named event
   * 
   * @param eventName the event
   * @return true if the object will accept a connection
   */
  @Override
  public boolean connectionAllowed(String eventName) {
    /*
     * if (eventName.compareTo("instance") == 0) { if (!(m_Classifier instanceof
     * weka.classifiers.UpdateableClassifier)) { return false; } }
     */
<<<<<<< HEAD

    if (eventName.equals("trainingSet") && m_listenees.containsKey(eventName)) {
      return false;
    }

=======
    if (m_listenees.containsKey(eventName)) {
      return false;
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return true;
  }

  /**
   * Returns true if, at this time, the object will accept a connection
   * according to the supplied EventSetDescriptor
   * 
   * @param esd the EventSetDescriptor
   * @return true if the object will accept a connection
   */
  @Override
  public boolean connectionAllowed(EventSetDescriptor esd) {
    return connectionAllowed(esd.getName());
  }

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
    if (eventName.compareTo("instance") == 0) {
      if (!(m_ClassifierTemplate instanceof weka.classifiers.UpdateableClassifier)) {
        if (m_log != null) {
          String msg =
<<<<<<< HEAD
            statusMessagePrefix() + "WARNING: "
              + m_ClassifierTemplate.getClass().getName()
              + " Is not an updateable classifier. This "
              + "classifier will only be evaluated on incoming "
              + "instance events and not trained on them.";
          m_log.logMessage("[Classifier] " + msg);
=======
            statusMessagePrefix()
              + Messages.getInstance().getString(
                "Classifier_ConnectionNotification_Msg_Text_First")
              + m_ClassifierTemplate.getClass().getName()
              + Messages.getInstance().getString(
                "Classifier_ConnectionNotification_Msg_Text_Second");
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_ConnectionNotification_LogMessage_Text_First")
            + msg);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          m_log.statusMessage(msg);
        }
      }
    }

<<<<<<< HEAD
    if (eventName.equals("testSet") && m_listenees.containsKey("testSet")
      && m_log != null) {
      if (!Utils
        .getDontShowDialog("weka.gui.beans.ClassifierMultipleTestSetConnections")
        && !java.awt.GraphicsEnvironment.isHeadless()) {

        String msg =
          "You have more than one incoming test set connection to \n"
            + "'"
            + getCustomName()
            + "'. In order for this setup to run properly\n"
            + "and generate correct evaluation results you MUST execute the flow\n"
            + "by launching start points sequentially (second play button). In order\n"
            + "to specify the order you'd like the start points launched in you can\n"
            + "set the name of each start point (right click on start point and select\n"
            + "'Set name') to include a number prefix - e.g. '1: load my arff file'.";

        JCheckBox dontShow = new JCheckBox("Do not show this message again");
        Object[] stuff = new Object[2];
        stuff[0] = msg;
        stuff[1] = dontShow;

        JOptionPane.showMessageDialog(null, stuff,
          "Classifier test connection", JOptionPane.OK_OPTION);

        if (dontShow.isSelected()) {
          try {
            Utils
              .setDontShowDialog("weka.gui.beans.ClassifierMultipleTestSetConnections");
          } catch (Exception ex) {
            // quietly ignore
          }
        }
      }
    }

    if (connectionAllowed(eventName)) {
      List<Object> listenee = m_listenees.get(eventName);
      if (listenee == null) {
        listenee = new ArrayList<Object>();
        m_listenees.put(eventName, listenee);
      }
      listenee.add(source);

=======
    if (connectionAllowed(eventName)) {
      m_listenees.put(eventName, source);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      /*
       * if (eventName.compareTo("instance") == 0) { startIncrementalHandler();
       * }
       */
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
<<<<<<< HEAD

    List<Object> listenees = m_listenees.get(eventName);

    if (listenees != null) {
      listenees.remove(source);

      if (listenees.size() == 0) {
        m_listenees.remove(eventName);
      }
    }

=======
    m_listenees.remove(eventName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (eventName.compareTo("instance") == 0) {
      stop(); // kill the incremental handler thread if it is running
    }
  }

  /**
   * Function used to stop code that calls acceptTrainingSet. This is needed as
   * classifier construction is performed inside a separate thread of execution.
   * 
   * @param tf a <code>boolean</code> value
   */
  private synchronized void block(boolean tf) {

    if (tf) {
      try {
        // only block if thread is still doing something useful!
<<<<<<< HEAD
        // if (m_state != IDLE) {
        wait();
        // }
=======
        if (m_state != IDLE) {
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
   * Stop any classifier action
   */
<<<<<<< HEAD
  @SuppressWarnings("deprecation")
  @Override
  public void stop() {
    // tell all listenees (upstream beans) to stop

    for (Map.Entry<String, List<Object>> e : m_listenees.entrySet()) {
      List<Object> l = e.getValue();
      for (Object o : l) {
        if (o instanceof BeanCommon) {
          ((BeanCommon) o).stop();
        }
      }
    }

    /*
     * Enumeration en = m_listenees.keys(); while (en.hasMoreElements()) {
     * Object tempO = m_listenees.get(en.nextElement()); if (tempO instanceof
     * BeanCommon) { ((BeanCommon) tempO).stop(); } }
     */

=======
  @Override
  public void stop() {
    // tell all listenees (upstream beans) to stop
    Enumeration en = m_listenees.keys();
    while (en.hasMoreElements()) {
      Object tempO = m_listenees.get(en.nextElement());
      if (tempO instanceof BeanCommon) {
        ((BeanCommon) tempO).stop();
      }
    }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // shutdown the executor pool and reclaim storage
    if (m_executorPool != null) {
      m_executorPool.shutdownNow();
      m_executorPool.purge();
      m_executorPool = null;
    }
<<<<<<< HEAD
    m_reject = false;
    m_batchStarted = false;
    block(false);
=======
    m_block = false;
    m_batchStarted = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_visual.setStatic();
    if (m_oldText.length() > 0) {
      // m_visual.setText(m_oldText);
    }

    // stop the build thread
    /*
     * if (m_buildThread != null) { m_buildThread.interrupt();
     * m_buildThread.stop(); m_buildThread = null; m_visual.setStatic(); }
     */
  }

  public void loadModel() {
    try {
      if (m_fileChooser == null) {
        // i.e. after de-serialization
        setupFileChooser();
      }
      int returnVal = m_fileChooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File loadFrom = m_fileChooser.getSelectedFile();

        // add extension if necessary
        if (m_fileChooser.getFileFilter() == m_binaryFilter) {
          if (!loadFrom.getName().toLowerCase().endsWith("." + FILE_EXTENSION)) {
            loadFrom =
              new File(loadFrom.getParent(), loadFrom.getName() + "."
                + FILE_EXTENSION);
          }
        } else if (m_fileChooser.getFileFilter() == m_KOMLFilter) {
          if (!loadFrom.getName().toLowerCase()
            .endsWith(KOML.FILE_EXTENSION + FILE_EXTENSION)) {
            loadFrom =
              new File(loadFrom.getParent(), loadFrom.getName()
                + KOML.FILE_EXTENSION + FILE_EXTENSION);
          }
        } else if (m_fileChooser.getFileFilter() == m_XStreamFilter) {
          if (!loadFrom.getName().toLowerCase()
            .endsWith(XStream.FILE_EXTENSION + FILE_EXTENSION)) {
            loadFrom =
              new File(loadFrom.getParent(), loadFrom.getName()
                + XStream.FILE_EXTENSION + FILE_EXTENSION);
          }
        }

<<<<<<< HEAD
        loadFromFile(loadFrom);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(Classifier.this,
        "Problem loading classifier.\n" + ex.getMessage(), "Load Model",
        JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix() + "ERROR: unable to load "
          + "model (see log).");
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + "Problem loading classifier. " + ex.getMessage());
=======
        weka.classifiers.Classifier temp = null;
        Instances tempHeader = null;
        // KOML ?
        if ((KOML.isPresent())
          && (loadFrom.getAbsolutePath().toLowerCase()
            .endsWith(KOML.FILE_EXTENSION + FILE_EXTENSION))) {
          Vector v = (Vector) KOML.read(loadFrom.getAbsolutePath());
          temp = (weka.classifiers.Classifier) v.elementAt(0);
          if (v.size() == 2) {
            // try and grab the header
            tempHeader = (Instances) v.elementAt(1);
          }
        } /* XStream */else if ((XStream.isPresent())
          && (loadFrom.getAbsolutePath().toLowerCase()
            .endsWith(XStream.FILE_EXTENSION + FILE_EXTENSION))) {
          Vector v = (Vector) XStream.read(loadFrom.getAbsolutePath());
          temp = (weka.classifiers.Classifier) v.elementAt(0);
          if (v.size() == 2) {
            // try and grab the header
            tempHeader = (Instances) v.elementAt(1);
          }
        } /* binary */else {

          ObjectInputStream is =
            new ObjectInputStream(new BufferedInputStream(new FileInputStream(
              loadFrom)));
          // try and read the model
          temp = (weka.classifiers.Classifier) is.readObject();
          // try and read the header (if present)
          try {
            tempHeader = (Instances) is.readObject();
          } catch (Exception ex) {
            // System.err.println("No header...");
            // quietly ignore
          }
          is.close();
        }

        // Update name and icon
        setTrainedClassifier(temp);
        // restore header
        m_trainingSet = tempHeader;

        if (m_log != null) {
          m_log.statusMessage(statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_ConnectionNotification_StatusMessage_Text_First"));
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_ConnectionNotification_LogMessage_Text_Second")
            + statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_ConnectionNotification_LogMessage_Text_Third")
            + m_Classifier.getClass().toString());
        }
      }
    } catch (Exception ex) {
      JOptionPane
        .showMessageDialog(
          Classifier.this,
          Messages
            .getInstance()
            .getString(
              "Classifier_ConnectionNotification_JOptionPane_ShowMessageDialog_Text_First"),
          Messages
            .getInstance()
            .getString(
              "Classifier_ConnectionNotification_JOptionPane_ShowMessageDialog_Text_Second"),
          JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_ConnectionNotification_StatusMessage_Text_Second"));
        m_log.logMessage(Messages.getInstance().getString(
          "Classifier_ConnectionNotification_LogMessage_Text_Fourth")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_ConnectionNotification_LogMessage_Text_Fifth")
          + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  protected void loadFromFile(File loadFrom) throws Exception {
    weka.classifiers.Classifier temp = null;
    Instances tempHeader = null;
    // KOML ?
    if ((KOML.isPresent())
      && (loadFrom.getAbsolutePath().toLowerCase().endsWith(KOML.FILE_EXTENSION
        + FILE_EXTENSION))) {
      @SuppressWarnings("unchecked")
      Vector<Object> v = (Vector<Object>) KOML.read(loadFrom.getAbsolutePath());
      temp = (weka.classifiers.Classifier) v.elementAt(0);
      if (v.size() == 2) {
        // try and grab the header
        tempHeader = (Instances) v.elementAt(1);
      }
    } /* XStream */else if ((XStream.isPresent())
      && (loadFrom.getAbsolutePath().toLowerCase()
        .endsWith(XStream.FILE_EXTENSION + FILE_EXTENSION))) {
      @SuppressWarnings("unchecked")
      Vector<Object> v =
        (Vector<Object>) XStream.read(loadFrom.getAbsolutePath());
      temp = (weka.classifiers.Classifier) v.elementAt(0);
      if (v.size() == 2) {
        // try and grab the header
        tempHeader = (Instances) v.elementAt(1);
      }
    } /* binary */else {

      ObjectInputStream is =
        SerializationHelper.getObjectInputStream(new FileInputStream(loadFrom));

      // try and read the model
      temp = (weka.classifiers.Classifier) is.readObject();
      // try and read the header (if present)
      try {
        tempHeader = (Instances) is.readObject();
      } catch (Exception ex) {
        // System.err.println("No header...");
        // quietly ignore
      }
      is.close();
    }

    // Update name and icon
    setTrainedClassifier(temp);
    // restore header
    m_trainingSet = tempHeader;

    if (m_log != null) {
      m_log.statusMessage(statusMessagePrefix() + "Loaded model.");
      m_log.logMessage("[Classifier] " + statusMessagePrefix()
        + "Loaded classifier: " + m_Classifier.getClass().toString()
        + " from file '" + loadFrom.toString() + "'");
    }
  }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void saveModel() {
    try {
      if (m_fileChooser == null) {
        // i.e. after de-serialization
        setupFileChooser();
      }
      int returnVal = m_fileChooser.showSaveDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File saveTo = m_fileChooser.getSelectedFile();
        String fn = saveTo.getAbsolutePath();
        if (m_fileChooser.getFileFilter() == m_binaryFilter) {
          if (!fn.toLowerCase().endsWith("." + FILE_EXTENSION)) {
            fn += "." + FILE_EXTENSION;
          }
        } else if (m_fileChooser.getFileFilter() == m_KOMLFilter) {
          if (!fn.toLowerCase().endsWith(KOML.FILE_EXTENSION + FILE_EXTENSION)) {
            fn += KOML.FILE_EXTENSION + FILE_EXTENSION;
          }
        } else if (m_fileChooser.getFileFilter() == m_XStreamFilter) {
          if (!fn.toLowerCase().endsWith(
            XStream.FILE_EXTENSION + FILE_EXTENSION)) {
            fn += XStream.FILE_EXTENSION + FILE_EXTENSION;
          }
        }
        saveTo = new File(fn);

        // now serialize model
        // KOML?
        if ((KOML.isPresent())
          && saveTo.getAbsolutePath().toLowerCase()
            .endsWith(KOML.FILE_EXTENSION + FILE_EXTENSION)) {
          SerializedModelSaver.saveKOML(saveTo, m_Classifier,
            (m_trainingSet != null) ? new Instances(m_trainingSet, 0) : null);
          /*
           * Vector v = new Vector(); v.add(m_Classifier); if (m_trainingSet !=
           * null) { v.add(new Instances(m_trainingSet, 0)); } v.trimToSize();
           * KOML.write(saveTo.getAbsolutePath(), v);
           */
        } /* XStream */else if ((XStream.isPresent())
          && saveTo.getAbsolutePath().toLowerCase()
            .endsWith(XStream.FILE_EXTENSION + FILE_EXTENSION)) {

          SerializedModelSaver.saveXStream(saveTo, m_Classifier,
            (m_trainingSet != null) ? new Instances(m_trainingSet, 0) : null);
          /*
           * Vector v = new Vector(); v.add(m_Classifier); if (m_trainingSet !=
           * null) { v.add(new Instances(m_trainingSet, 0)); } v.trimToSize();
           * XStream.write(saveTo.getAbsolutePath(), v);
           */
        } else /* binary */{
          ObjectOutputStream os =
            new ObjectOutputStream(new BufferedOutputStream(
              new FileOutputStream(saveTo)));
          os.writeObject(m_Classifier);
          if (m_trainingSet != null) {
            Instances header = new Instances(m_trainingSet, 0);
            os.writeObject(header);
          }
          os.close();
        }
        if (m_log != null) {
<<<<<<< HEAD
          m_log.statusMessage(statusMessagePrefix() + "Model saved.");
          m_log.logMessage("[Classifier] " + statusMessagePrefix()
            + " Saved classifier " + getCustomName());
        }
      }
    } catch (Exception ex) {
      JOptionPane
        .showMessageDialog(Classifier.this, "Problem saving classifier.\n",
          "Save Model", JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix() + "ERROR: unable to"
          + " save model (see log).");
        m_log.logMessage("[Classifier] " + statusMessagePrefix()
          + " Problem saving classifier " + getCustomName() + ex.getMessage());
=======
          m_log.statusMessage(statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_SaveModel_StatusMessage_Text_First"));
          m_log.logMessage(Messages.getInstance().getString(
            "Classifier_SaveModel_LogMessage_Text_First")
            + statusMessagePrefix()
            + Messages.getInstance().getString(
              "Classifier_SaveModel_LogMessage_Text_Second") + getCustomName());
        }
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(
        Classifier.this,
        Messages.getInstance().getString(
          "Classifier_SaveModel_JOptionPane_ShowMessageDialog_Text_First"),
        Messages.getInstance().getString(
          "Classifier_SaveModel_JOptionPane_ShowMessageDialog_Text_Second"),
        JOptionPane.ERROR_MESSAGE);
      if (m_log != null) {
        m_log.statusMessage(statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_SaveModel_StatusMessage_Text_Second"));
        m_log.logMessage(Messages.getInstance().getString(
          "Classifier_SaveModel_LogMessage_Text_Third")
          + statusMessagePrefix()
          + Messages.getInstance().getString(
            "Classifier_SaveModel_LogMessage_Text_Fourth")
          + getCustomName()
          + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Set a logger
   * 
   * @param logger a <code>Logger</code> value
   */
  @Override
  public void setLog(Logger logger) {
    m_log = logger;
  }

  /**
   * Return an enumeration of requests that can be made by the user
   * 
   * @return an <code>Enumeration</code> value
   */
  @Override
<<<<<<< HEAD
  public Enumeration<String> enumerateRequests() {
    Vector<String> newVector = new Vector<String>(0);
=======
  public Enumeration enumerateRequests() {
    Vector newVector = new Vector(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_executorPool != null
      && (m_executorPool.getQueue().size() > 0 || m_executorPool
        .getActiveCount() > 0)) {
      newVector.addElement("Stop");
    }

    if ((m_executorPool == null || (m_executorPool.getQueue().size() == 0 && m_executorPool
      .getActiveCount() == 0)) && m_Classifier != null) {
      newVector.addElement("Save model");
    }

    if (m_executorPool == null
      || (m_executorPool.getQueue().size() == 0 && m_executorPool
        .getActiveCount() == 0)) {
      newVector.addElement("Load model");
    }
    return newVector.elements();
  }

  /**
   * Perform a particular request
   * 
   * @param request the request to perform
   * @exception IllegalArgumentException if an error occurs
   */
  @Override
  public void performRequest(String request) {
    if (request.compareTo("Stop") == 0) {
      stop();
    } else if (request.compareTo("Save model") == 0) {
      saveModel();
    } else if (request.compareTo("Load model") == 0) {
      loadModel();
    } else {
      throw new IllegalArgumentException(request
<<<<<<< HEAD
        + " not supported (Classifier)");
=======
        + Messages.getInstance().getString(
          "Classifier_PerformRequest_IllegalArgumentException_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Returns true, if at the current time, the event described by the supplied
   * event descriptor could be generated.
   * 
   * @param esd an <code>EventSetDescriptor</code> value
   * @return a <code>boolean</code> value
   */
  public boolean eventGeneratable(EventSetDescriptor esd) {
    String eventName = esd.getName();
    return eventGeneratable(eventName);
  }

  /**
   * @param name of the event to check
   * @return true if eventName is one of the possible events that this component
   *         can generate
   */
  private boolean generatableEvent(String eventName) {
    if (eventName.compareTo("graph") == 0 || eventName.compareTo("text") == 0
      || eventName.compareTo("batchClassifier") == 0
<<<<<<< HEAD
      || eventName.compareTo("incrementalClassifier") == 0
      || eventName.compareTo("configuration") == 0) {
=======
      || eventName.compareTo("incrementalClassifier") == 0) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return true;
    }
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
    if (!generatableEvent(eventName)) {
      return false;
    }
    if (eventName.compareTo("graph") == 0) {
      // can't generate a GraphEvent if classifier is not drawable
      if (!(m_ClassifierTemplate instanceof weka.core.Drawable)) {
        return false;
      }
      // need to have a training set before the classifier
      // can generate a graph!
      if (!m_listenees.containsKey("trainingSet")) {
        return false;
      }
      // Source needs to be able to generate a trainingSet
      // before we can generate a graph
      Object source = m_listenees.get("trainingSet");
      if (source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("trainingSet")) {
          return false;
        }
      }
    }

    if (eventName.compareTo("batchClassifier") == 0) {
      /*
       * if (!m_listenees.containsKey("testSet")) { return false; } if
       * (!m_listenees.containsKey("trainingSet") && m_trainingSet == null) {
       * return false; }
       */
      if (!m_listenees.containsKey("testSet")
        && !m_listenees.containsKey("trainingSet")) {
        return false;
      }
      Object source = m_listenees.get("testSet");
      if (source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("testSet")) {
          return false;
        }
      }
      /*
       * source = m_listenees.get("trainingSet"); if (source instanceof
       * EventConstraints) { if
       * (!((EventConstraints)source).eventGeneratable("trainingSet")) { return
       * false; } }
       */
    }

    if (eventName.compareTo("text") == 0) {
      if (!m_listenees.containsKey("trainingSet")
        && !m_listenees.containsKey("instance")) {
        return false;
      }
      Object source = m_listenees.get("trainingSet");
      if (source != null && source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("trainingSet")) {
          return false;
        }
      }
      source = m_listenees.get("instance");
      if (source != null && source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("instance")) {
          return false;
        }
      }
    }

    if (eventName.compareTo("incrementalClassifier") == 0) {
      /*
       * if (!(m_Classifier instanceof weka.classifiers.UpdateableClassifier)) {
       * return false; }
       */
      if (!m_listenees.containsKey("instance")) {
        return false;
      }
      Object source = m_listenees.get("instance");
      if (source instanceof EventConstraints) {
        if (!((EventConstraints) source).eventGeneratable("instance")) {
          return false;
        }
      }
    }
<<<<<<< HEAD

    if (eventName.equals("configuration") && m_Classifier == null) {
      return false;
    }

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return true;
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
  @Override
  public boolean isBusy() {
    if (m_executorPool == null
      || (m_executorPool.getQueue().size() == 0 && m_executorPool
        .getActiveCount() == 0) && m_state == IDLE) {
      return false;
    }
    /*
     * System.err.println("isBusy() Q:" + m_executorPool.getQueue().size()
     * +" A:" + m_executorPool.getActiveCount());
     */
    return true;
  }

  private String statusMessagePrefix() {
    return getCustomName()
      + "$"
      + hashCode()
      + "|"
<<<<<<< HEAD
      + ((m_ClassifierTemplate instanceof OptionHandler && Utils.joinOptions(
=======
      + ((m_Classifier instanceof OptionHandler && Utils.joinOptions(
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        ((OptionHandler) m_ClassifierTemplate).getOptions()).length() > 0) ? Utils
        .joinOptions(((OptionHandler) m_ClassifierTemplate).getOptions()) + "|"
        : "");
  }
<<<<<<< HEAD

  /**
   * Set environment variables to pass on to the classifier (if if is an
   * EnvironmentHandler)
   */
  @Override
  public void setEnvironment(Environment env) {
    m_env = env;
  }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
}
