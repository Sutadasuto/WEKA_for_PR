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
 *    Saver.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

import java.io.IOException;
import java.io.ObjectInputStream;

import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.converters.ArffSaver;
import weka.core.converters.DatabaseConverter;
import weka.core.converters.DatabaseSaver;

/**
 * Saves data sets using weka.core.converter classes
 * 
 * @author <a href="mailto:mutter@cs.waikato.ac.nz">Stefan Mutter</a>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 10221 $
 * 
 */
public class Saver extends AbstractDataSink implements WekaWrapper,
  EnvironmentHandler {
<<<<<<< HEAD
=======
=======
 * @version $Revision: 9217 $
 * 
 */
public class Saver extends AbstractDataSink implements WekaWrapper,
    EnvironmentHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 5371716690308950755L;

  /**
   * Holds the instances to be saved
   */
  private Instances m_dataSet;

  /**
   * Holds the structure
   */
  private Instances m_structure;

  /**
   * Global info for the wrapped loader (if it exists).
   */
  protected String m_globalInfo;

  /**
   * Thread for doing IO in
   */
  private transient SaveBatchThread m_ioThread;

  /**
   * Saver
   */
  private weka.core.converters.Saver m_Saver = new ArffSaver();
  private weka.core.converters.Saver m_SaverTemplate = m_Saver;

  /**
   * The relation name that becomes part of the file name
   */
  private String m_fileName;

  /**
   * Flag indicating that instances will be saved to database. Used because
   * structure information can only be sent after a database has been
   * configured.
   */
  private boolean m_isDBSaver;

  /**
   * For file-based savers - if true (default), relation name is used as the
   * primary part of the filename. If false, then the prefix is used as the
   * filename. Useful for preventing filenames from getting too long when there
   * are many filters in a flow.
   */
  private boolean m_relationNameForFilename = true;

  /**
   * Count for structure available messages
   */
  private int m_count;

  /**
   * The environment variables.
   */
  protected transient Environment m_env;

  private weka.core.converters.Saver makeCopy() throws Exception {
    return (weka.core.converters.Saver) new SerializedObject(m_SaverTemplate)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      .getObject();
  }

  private class SaveBatchThread extends Thread {
    public SaveBatchThread(DataSink ds) {
    }

    @SuppressWarnings("deprecation")
<<<<<<< HEAD
=======
=======
        .getObject();
  }

  private class SaveBatchThread extends Thread {
    private final DataSink m_DS;

    public SaveBatchThread(DataSink ds) {
      m_DS = ds;
    }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public void run() {
      try {
        m_visual.setAnimated();

        m_Saver.setInstances(m_dataSet);
        if (m_logger != null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_logger.statusMessage(statusMessagePrefix() + "Saving "
            + m_dataSet.relationName() + "...");
        }
        m_Saver.writeBatch();
        if (m_logger != null) {
          m_logger.logMessage("[Saver] " + statusMessagePrefix()
            + "Save successful.");
<<<<<<< HEAD
=======
=======
          m_logger.statusMessage(statusMessagePrefix()
              + Messages.getInstance().getString(
                  "Saver_SaveBatchThread_Run_StatusMessage_Text_First")
              + m_dataSet.relationName()
              + Messages.getInstance().getString(
                  "Saver_SaveBatchThread_Run_StatusMessage_Text_Second"));
        }
        m_Saver.writeBatch();
        if (m_logger != null) {
          m_logger.logMessage(Messages.getInstance().getString(
              "Saver_SaveBatchThread_Run_LogMessage_Text_First")
              + statusMessagePrefix()
              + Messages.getInstance().getString(
                  "Saver_SaveBatchThread_Run_LogMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }

      } catch (Exception ex) {
        if (m_logger != null) {
          m_logger.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
            + "ERROR (See log for details)");
          m_logger.logMessage("[Saver] " + statusMessagePrefix()
            + " problem saving. " + ex.getMessage());
=======
<<<<<<< HEAD
            + "ERROR (See log for details)");
          m_logger.logMessage("[Saver] " + statusMessagePrefix()
            + " problem saving. " + ex.getMessage());
=======
              + Messages.getInstance().getString(
                  "Saver_SaveBatchThread_Run_StatusMessage_Text_Third"));
          m_logger.logMessage(Messages.getInstance().getString(
              "Saver_SaveBatchThread_Run_LogMessage_Text_Third")
              + statusMessagePrefix()
              + Messages.getInstance().getString(
                  "Saver_SaveBatchThread_Run_LogMessage_Text_Fourth")
              + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
        ex.printStackTrace();
      } finally {
        if (Thread.currentThread().isInterrupted()) {
          if (m_logger != null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            m_logger.logMessage("[Saver] " + statusMessagePrefix()
              + " Saving interrupted!!");
          }
        }
        if (m_logger != null) {
          m_logger.statusMessage(statusMessagePrefix() + "Finished.");
<<<<<<< HEAD
=======
=======
            m_logger.logMessage(Messages.getInstance().getString(
                "Saver_SaveBatchThread_Run_LogMessage_Text_Fifth")
                + statusMessagePrefix()
                + Messages.getInstance().getString(
                    "Saver_SaveBatchThread_Run_LogMessage_Text_Sixth"));
          }
        }
        if (m_logger != null) {
          m_logger.statusMessage(statusMessagePrefix()
              + Messages.getInstance().getString(
                  "Saver_SaveBatchThread_Run_StatusMessage_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
        block(false);
        m_visual.setStatic();
        m_ioThread = null;
      }
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
        if (m_ioThread.isAlive()) {
          wait();
        }
      } catch (InterruptedException ex) {
      }
    } else {
      notifyAll();
    }
  }

  /**
   * Returns true if. at this time, the bean is busy with some (i.e. perhaps a
   * worker thread is performing some calculation).
   * 
   * @return true if the bean is busy.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean isBusy() {
    return (m_ioThread != null);
  }

  /**
   * Global info (if it exists) for the wrapped loader
   * 
   * @return the global info
   */
  public String globalInfo() {
    return m_globalInfo;
  }

  /** Contsructor */
  public Saver() {
    super();
    setSaverTemplate(m_Saver);
    m_fileName = "";
    m_dataSet = null;
    m_count = 0;

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
   * Set environment variables to use.
   * 
   * @param env the environment variables to use
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setEnvironment(Environment env) {
    m_env = env;
  }

  /**
   * Pass the environment variables on the the wrapped saver
   */
  private void passEnvOnToSaver() {
    // set environment variables
    if (m_SaverTemplate instanceof EnvironmentHandler && m_env != null) {
      ((EnvironmentHandler) m_Saver).setEnvironment(m_env);
    }
  }

  /**
   * Set the loader to use
   * 
   * @param saver a Saver
   */
  public void setSaverTemplate(weka.core.converters.Saver saver) {
    boolean loadImages = true;
    if (saver.getClass().getName()
<<<<<<< HEAD
      .compareTo(m_SaverTemplate.getClass().getName()) == 0) {
=======
<<<<<<< HEAD
      .compareTo(m_SaverTemplate.getClass().getName()) == 0) {
=======
        .compareTo(m_SaverTemplate.getClass().getName()) == 0) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      loadImages = false;
    }
    m_SaverTemplate = saver;
    String saverName = saver.getClass().toString();
    saverName = saverName.substring(saverName.lastIndexOf('.') + 1,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      saverName.length());
    if (loadImages) {

      if (!m_visual.loadIcons(BeanVisual.ICON_PATH + saverName + ".gif",
        BeanVisual.ICON_PATH + saverName + "_animated.gif")) {
<<<<<<< HEAD
=======
=======
        saverName.length());
    if (loadImages) {

      if (!m_visual.loadIcons(BeanVisual.ICON_PATH + saverName + ".gif",
          BeanVisual.ICON_PATH + saverName + "_animated.gif")) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        useDefaultVisual();
      }
    }
    m_visual.setText(saverName);

    // get global info
    m_globalInfo = KnowledgeFlowApp.getGlobalInfo(m_SaverTemplate);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_SaverTemplate instanceof DatabaseConverter) {
      m_isDBSaver = true;
    } else {
      m_isDBSaver = false;
    }
<<<<<<< HEAD
=======
=======
    if (m_SaverTemplate instanceof DatabaseConverter)
      m_isDBSaver = true;
    else
      m_isDBSaver = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * makes sure that the filename is valid, i.e., replaces slashes, backslashes
   * and colons with underscores ("_"). Also try to prevent filename from
   * becoming insanely long by removing package part of class names.
   * 
   * @param filename the filename to cleanse
   * @return the cleansed filename
   */
  protected String sanitizeFilename(String filename) {
    filename = filename.replaceAll("\\\\", "_").replaceAll(":", "_")
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      .replaceAll("/", "_");
    filename = Utils.removeSubstring(filename,
      "weka.filters.supervised.instance.");
    filename = Utils.removeSubstring(filename,
      "weka.filters.supervised.attribute.");
    filename = Utils.removeSubstring(filename,
      "weka.filters.unsupervised.instance.");
    filename = Utils.removeSubstring(filename,
      "weka.filters.unsupervised.attribute.");
<<<<<<< HEAD
=======
=======
        .replaceAll("/", "_");
    filename = Utils.removeSubstring(filename,
        "weka.filters.supervised.instance.");
    filename = Utils.removeSubstring(filename,
        "weka.filters.supervised.attribute.");
    filename = Utils.removeSubstring(filename,
        "weka.filters.unsupervised.instance.");
    filename = Utils.removeSubstring(filename,
        "weka.filters.unsupervised.attribute.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    filename = Utils.removeSubstring(filename, "weka.clusterers.");
    filename = Utils.removeSubstring(filename, "weka.associations.");
    filename = Utils.removeSubstring(filename, "weka.attributeSelection.");
    filename = Utils.removeSubstring(filename, "weka.estimators.");
    filename = Utils.removeSubstring(filename, "weka.datagenerators.");

    if (!m_isDBSaver && !m_relationNameForFilename) {
      filename = "";
      try {
        if (m_Saver.filePrefix().equals("")) {
          m_Saver.setFilePrefix("no-name");
        }
      } catch (Exception ex) {
        System.err.println(ex);
      }
    }

    return filename;
  }

  /**
   * Method reacts to a dataset event and starts the writing process in batch
   * mode
   * 
   * @param e a dataset event
   */
  @Override
  public synchronized void acceptDataSet(DataSetEvent e) {

    try {
      m_Saver = makeCopy();
    } catch (Exception ex) {
      if (m_logger != null) {
        m_logger.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
            + Messages.getInstance().getString(
                "Saver_AcceptDataSet_StatusMessage_Text_First"));
        m_logger
            .logMessage(Messages.getInstance().getString(
                "Saver_AcceptDataSet_LogMessage_Text_First")
                + statusMessagePrefix()
                + Messages.getInstance().getString(
                    "Saver_AcceptDataSet_LogMessage_Text_Second")
                + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    passEnvOnToSaver();
    m_fileName = sanitizeFilename(e.getDataSet().relationName());
    m_dataSet = e.getDataSet();
    if (e.isStructureOnly() && m_isDBSaver
<<<<<<< HEAD
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {//
=======
<<<<<<< HEAD
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {//
=======
        && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {//
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ((DatabaseSaver) m_Saver).setTableName(m_fileName);
    }
    if (!e.isStructureOnly()) {
      if (!m_isDBSaver) {
        try {
          m_Saver.setDirAndPrefix(m_fileName, "");
        } catch (Exception ex) {
          System.out.println(ex);
        }
      }
      saveBatch();
<<<<<<< HEAD
      System.out.println("...relation " + m_fileName + " saved.");
=======
<<<<<<< HEAD
      System.out.println("...relation " + m_fileName + " saved.");
=======
      System.out
          .println(Messages.getInstance().getString(
              "Saver_AcceptDataSet_Text_First")
              + m_fileName
              + Messages.getInstance().getString(
                  "Saver_AcceptDataSet_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Method reacts to a threshold data event ans starts the writing process in
   * batch mode.
   * 
   * @param e threshold data event.
   */
  @Override
  public synchronized void acceptDataSet(ThresholdDataEvent e) {
    try {
      m_Saver = makeCopy();
    } catch (Exception ex) {
      if (m_logger != null) {
        m_logger.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
            + Messages.getInstance().getString(
                "Saver_AcceptDataSet_StatusMessage_Text_Second"));
        m_logger
            .logMessage(Messages.getInstance().getString(
                "Saver_AcceptDataSet_LogMessage_Text_Third")
                + statusMessagePrefix()
                + Messages.getInstance().getString(
                    "Saver_AcceptDataSet_LogMessage_Text_Fourth")
                + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    passEnvOnToSaver();
    m_fileName = sanitizeFilename(e.getDataSet().getPlotInstances()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      .relationName());
    m_dataSet = e.getDataSet().getPlotInstances();

    if (m_isDBSaver
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {//
<<<<<<< HEAD
=======
=======
        .relationName());
    m_dataSet = e.getDataSet().getPlotInstances();

    if (m_isDBSaver
        && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {//
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ((DatabaseSaver) m_Saver).setTableName(m_fileName);
      ((DatabaseSaver) m_Saver).setRelationForTableName(false);
    }

    if (!m_isDBSaver) {
      try {
        m_Saver.setDirAndPrefix(m_fileName, "");
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }
    saveBatch();
<<<<<<< HEAD
    System.out.println("...relation " + m_fileName + " saved.");
=======
<<<<<<< HEAD
    System.out.println("...relation " + m_fileName + " saved.");
=======
    System.out.println(Messages.getInstance().getString(
        "Saver_AcceptDataSet_Text_Third")
        + m_fileName
        + Messages.getInstance().getString("Saver_AcceptDataSet_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Method reacts to a test set event and starts the writing process in batch
   * mode
   * 
   * @param e test set event
   */
  @Override
  public synchronized void acceptTestSet(TestSetEvent e) {

    try {
      m_Saver = makeCopy();
    } catch (Exception ex) {
      if (m_logger != null) {
        m_logger.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
            + Messages.getInstance().getString(
                "Saver_AcceptTestSet_StatusMessage_Text_First"));
        m_logger
            .logMessage(Messages.getInstance().getString(
                "Saver_AcceptTestSet_LogMessage_Text_First")
                + statusMessagePrefix()
                + Messages.getInstance().getString(
                    "Saver_AcceptTestSet_LogMessage_Text_Second")
                + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    passEnvOnToSaver();
    m_fileName = sanitizeFilename(e.getTestSet().relationName());
    m_dataSet = e.getTestSet();
    if (e.isStructureOnly() && m_isDBSaver
<<<<<<< HEAD
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
=======
<<<<<<< HEAD
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
=======
        && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ((DatabaseSaver) m_Saver).setTableName(m_fileName);
    }
    if (!e.isStructureOnly()) {
      if (!m_isDBSaver) {
        try {
          m_Saver.setDirAndPrefix(m_fileName, "_test_" + e.getSetNumber()
<<<<<<< HEAD
            + "_of_" + e.getMaxSetNumber());
=======
<<<<<<< HEAD
            + "_of_" + e.getMaxSetNumber());
=======
              + "_of_" + e.getMaxSetNumber());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        } catch (Exception ex) {
          System.out.println(ex);
        }
      } else {
        ((DatabaseSaver) m_Saver).setRelationForTableName(false);
        String setName = ((DatabaseSaver) m_Saver).getTableName();
        setName = setName.replaceFirst(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          "_[tT][eE][sS][tT]_[0-9]+_[oO][fF]_[0-9]+", "");
        ((DatabaseSaver) m_Saver).setTableName(setName + "_test_"
          + e.getSetNumber() + "_of_" + e.getMaxSetNumber());
      }
      saveBatch();
      System.out.println("... test set " + e.getSetNumber() + " of "
        + e.getMaxSetNumber() + " for relation " + m_fileName + " saved.");
<<<<<<< HEAD
=======
=======
            "_[tT][eE][sS][tT]_[0-9]+_[oO][fF]_[0-9]+", "");
        ((DatabaseSaver) m_Saver).setTableName(setName + "_test_"
            + e.getSetNumber() + "_of_" + e.getMaxSetNumber());
      }
      saveBatch();
      System.out
          .println(Messages.getInstance().getString(
              "Saver_AcceptTestSet_Text_First")
              + e.getSetNumber()
              + Messages.getInstance().getString(
                  "Saver_AcceptTestSet_Text_Second")
              + e.getMaxSetNumber()
              + Messages.getInstance().getString(
                  "Saver_AcceptTestSet_Text_Third")
              + m_fileName
              + Messages.getInstance().getString(
                  "Saver_AcceptTestSet_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Method reacts to a training set event and starts the writing process in
   * batch mode
   * 
   * @param e a training set event
   */
  @Override
  public synchronized void acceptTrainingSet(TrainingSetEvent e) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    try {
      m_Saver = makeCopy();
    } catch (Exception ex) {
      if (m_logger != null) {
        m_logger.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
<<<<<<< HEAD
          + "ERROR (See log for details)");
        m_logger.logMessage("[Saver] " + statusMessagePrefix()
          + " unable to copy saver. " + ex.getMessage());
=======
            + Messages.getInstance().getString(
                "Saver_AcceptTrainingSet_StatusMessage_Text_First"));
        m_logger.logMessage(Messages.getInstance().getString(
            "Saver_AcceptTrainingSet_LogMessage_Text_First")
            + statusMessagePrefix()
            + Messages.getInstance().getString(
                "Saver_AcceptTrainingSet_LogMessage_Text_Second")
            + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    passEnvOnToSaver();
    m_fileName = sanitizeFilename(e.getTrainingSet().relationName());
    m_dataSet = e.getTrainingSet();
    if (e.isStructureOnly() && m_isDBSaver
<<<<<<< HEAD
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
=======
<<<<<<< HEAD
      && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
=======
        && ((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ((DatabaseSaver) m_Saver).setTableName(m_fileName);
    }
    if (!e.isStructureOnly()) {
      if (!m_isDBSaver) {
        try {
          m_Saver.setDirAndPrefix(m_fileName, "_training_" + e.getSetNumber()
<<<<<<< HEAD
            + "_of_" + e.getMaxSetNumber());
=======
<<<<<<< HEAD
            + "_of_" + e.getMaxSetNumber());
=======
              + "_of_" + e.getMaxSetNumber());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        } catch (Exception ex) {
          System.out.println(ex);
        }
      } else {
        ((DatabaseSaver) m_Saver).setRelationForTableName(false);
        String setName = ((DatabaseSaver) m_Saver).getTableName();
        setName = setName.replaceFirst(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          "_[tT][rR][aA][iI][nN][iI][nN][gG]_[0-9]+_[oO][fF]_[0-9]+", "");
        ((DatabaseSaver) m_Saver).setTableName(setName + "_training_"
          + e.getSetNumber() + "_of_" + e.getMaxSetNumber());
      }
      saveBatch();
      System.out.println("... training set " + e.getSetNumber() + " of "
        + e.getMaxSetNumber() + " for relation " + m_fileName + " saved.");
<<<<<<< HEAD
=======
=======
            "_[tT][rR][aA][iI][nN][iI][nN][gG]_[0-9]+_[oO][fF]_[0-9]+", "");
        ((DatabaseSaver) m_Saver).setTableName(setName + "_training_"
            + e.getSetNumber() + "_of_" + e.getMaxSetNumber());
      }
      saveBatch();
      System.out.println(Messages.getInstance().getString(
          "Saver_AcceptTrainingSet_Text_First")
          + e.getSetNumber()
          + Messages.getInstance().getString(
              "Saver_AcceptTrainingSet_Text_Second")
          + e.getMaxSetNumber()
          + Messages.getInstance().getString(
              "Saver_AcceptTrainingSet_Text_Third")
          + m_fileName
          + Messages.getInstance().getString(
              "Saver_AcceptTrainingSet_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /** Saves instances in batch mode */
  public synchronized void saveBatch() {

<<<<<<< HEAD
    m_Saver.setRetrieval(weka.core.converters.Saver.BATCH);
=======
<<<<<<< HEAD
    m_Saver.setRetrieval(weka.core.converters.Saver.BATCH);
=======
    m_Saver.setRetrieval(m_Saver.BATCH);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /*
     * String visText = this.getName(); try { visText = (m_fileName.length() >
     * 0) ? m_fileName : m_Saver.filePrefix(); } catch (Exception ex) { }
     * m_visual.setText(visText);
     */
    m_ioThread = new SaveBatchThread(Saver.this);
    m_ioThread.setPriority(Thread.MIN_PRIORITY);
    m_ioThread.start();
    block(true);
  }

<<<<<<< HEAD
  protected transient StreamThroughput m_throughput;

=======
<<<<<<< HEAD
  protected transient StreamThroughput m_throughput;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Methods reacts to instance events and saves instances incrementally. If the
   * instance to save is null, the file is closed and the saving process is
   * ended.
   * 
   * @param e instance event
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("deprecation")
  @Override
  public synchronized void acceptInstance(InstanceEvent e) {

    if (e.getStatus() == InstanceEvent.FORMAT_AVAILABLE) {
      m_throughput = new StreamThroughput(statusMessagePrefix());
<<<<<<< HEAD
=======
=======
  @Override
  public synchronized void acceptInstance(InstanceEvent e) {

    if (e.getStatus() == e.FORMAT_AVAILABLE) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // start of a new stream
      try {
        m_Saver = makeCopy();
      } catch (Exception ex) {
        if (m_logger != null) {
          m_logger.statusMessage(statusMessagePrefix()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            + "ERROR (See log for details)");
          m_logger.logMessage("[Saver] " + statusMessagePrefix()
            + " unable to copy saver. " + ex.getMessage());
        }
      }
      m_Saver.setRetrieval(weka.core.converters.Saver.INCREMENTAL);
      m_structure = e.getStructure();
      m_fileName = sanitizeFilename(m_structure.relationName());
      m_Saver.setInstances(m_structure);
      if (m_isDBSaver) {
<<<<<<< HEAD
=======
=======
              + Messages.getInstance().getString(
                  "Saver_AcceptInstance_StatusMessage_Text_First"));
          m_logger.logMessage(Messages.getInstance().getString(
              "Saver_AcceptInstance_LogMessage_Text_First")
              + statusMessagePrefix()
              + Messages.getInstance().getString(
                  "Saver_AcceptInstance_LogMessage_Text_Second")
              + ex.getMessage());
        }
      }
      m_Saver.setRetrieval(m_Saver.INCREMENTAL);
      m_structure = e.getStructure();
      m_fileName = sanitizeFilename(m_structure.relationName());
      m_Saver.setInstances(m_structure);
      if (m_isDBSaver)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (((DatabaseSaver) m_SaverTemplate).getRelationForTableName()) {
          ((DatabaseSaver) m_Saver).setTableName(m_fileName);
          ((DatabaseSaver) m_Saver).setRelationForTableName(false);
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (e.getStatus() == InstanceEvent.INSTANCE_AVAILABLE) {
      m_visual.setAnimated();
      m_throughput.updateStart();
<<<<<<< HEAD
=======
=======
    }
    if (e.getStatus() == e.INSTANCE_AVAILABLE) {
      m_visual.setAnimated();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (m_count == 0) {
        passEnvOnToSaver();
        if (!m_isDBSaver) {
          try {
            m_Saver.setDirAndPrefix(m_fileName, "");
          } catch (Exception ex) {
            System.out.println(ex);
            m_visual.setStatic();
          }
        }
        m_count++;
      }
      try {
        /*
         * String visText = this.getName(); visText = (m_fileName.length() > 0)
         * ? m_fileName : m_Saver.filePrefix(); m_visual.setText(m_fileName);
         */
        m_Saver.writeIncremental(e.getInstance());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_throughput.updateEnd(m_logger);
      } catch (Exception ex) {
        m_visual.setStatic();
        System.err.println("Instance " + e.getInstance()
          + " could not been saved");
        ex.printStackTrace();
      }
    }
    if (e.getStatus() == InstanceEvent.BATCH_FINISHED) {
<<<<<<< HEAD
=======
=======
      } catch (Exception ex) {
        m_visual.setStatic();
        System.err.println(Messages.getInstance().getString(
            "Saver_AcceptInstance_Error_Text_First")
            + e.getInstance()
            + Messages.getInstance().getString(
                "Saver_AcceptInstance_Error_Text_Second"));
        ex.printStackTrace();
      }
    }
    if (e.getStatus() == e.BATCH_FINISHED) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      try {
        if (m_count == 0) {
          passEnvOnToSaver();
          if (!m_isDBSaver) {
            try {
              m_Saver.setDirAndPrefix(m_fileName, "");
            } catch (Exception ex) {
              System.out.println(ex);
              m_visual.setStatic();
            }
          }
          m_count++;
        }
        m_Saver.writeIncremental(e.getInstance());
        if (e.getInstance() != null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_throughput.updateStart();
          m_Saver.writeIncremental(null);
          m_throughput.updateEnd(m_logger);
        }
        // m_firstNotice = true;
        m_visual.setStatic();
        // System.out.println("...relation " + m_fileName + " saved.");
<<<<<<< HEAD
=======
=======
          m_Saver.writeIncremental(null);
        }
        // m_firstNotice = true;
        m_visual.setStatic();
        System.out.println(Messages.getInstance().getString(
            "Saver_AcceptInstance_Text_First")
            + m_fileName
            + Messages.getInstance().getString(
                "Saver_AcceptInstance_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        /*
         * String visText = this.getName(); visText = (m_fileName.length() > 0)
         * ? m_fileName : m_Saver.filePrefix(); m_visual.setText(visText);
         */
        m_count = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_throughput.finished(m_logger);
      } catch (Exception ex) {
        m_visual.setStatic();
        System.err.println("File could not have been closed.");
<<<<<<< HEAD
=======
=======
      } catch (Exception ex) {
        m_visual.setStatic();
        System.err.println(Messages.getInstance().getString(
            "Saver_AcceptInstance_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        ex.printStackTrace();
      }
    }
  }

  /**
   * Get the saver
   * 
   * @return a <code>weka.core.converters.Saver</code> value
   */
  public weka.core.converters.Saver getSaverTemplate() {
    return m_SaverTemplate;
  }

  /**
   * Set the saver
   * 
   * @param algorithm a Saver
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public void setWrappedAlgorithm(Object algorithm) {
    if (!(algorithm instanceof weka.core.converters.Saver)) {
      throw new IllegalArgumentException(algorithm.getClass() + " : incorrect "
        + "type of algorithm (Loader)");
<<<<<<< HEAD
=======
=======
  public void setWrappedAlgorithm(Object algorithm) {
    if (!(algorithm instanceof weka.core.converters.Saver)) {
      throw new IllegalArgumentException(algorithm.getClass()
          + Messages.getInstance().getString(
              "Saver_SetWrappedAlgorithm_IllegalArgumentException_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    setSaverTemplate((weka.core.converters.Saver) algorithm);
  }

  /**
   * Get the saver
   * 
   * @return a Saver
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Object getWrappedAlgorithm() {
    return getSaverTemplate();
  }

  /**
   * Set whether to use the relation name as the primary part of the filename.
   * If false, then the prefix becomes the filename.
   * 
   * @param r true if the relation name is to be part of the filename.
   */
  public void setRelationNameForFilename(boolean r) {
    m_relationNameForFilename = r;
  }

  /**
   * Get whether the relation name is the primary part of the filename.
   * 
   * @return true if the relation name is part of the filename.
   */
  public boolean getRelationNameForFilename() {
    return m_relationNameForFilename;
  }

  /** Stops the bean */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("deprecation")
  @Override
  public void stop() {

<<<<<<< HEAD
=======
=======
  @Override
  public void stop() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // tell the listenee (upstream bean) to stop
    if (m_listenee instanceof BeanCommon) {
      ((BeanCommon) m_listenee).stop();
    }

    // stop the io thread
    if (m_ioThread != null) {
      m_ioThread.interrupt();
      m_ioThread.stop();
      m_ioThread = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    m_count = 0;

    m_visual.setStatic();
<<<<<<< HEAD
=======
=======
      m_visual.setStatic();
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  private String statusMessagePrefix() {
    return getCustomName()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "$"
      + hashCode()
      + "|"
      + ((m_Saver instanceof OptionHandler) ? Utils
        .joinOptions(((OptionHandler) m_Saver).getOptions()) + "|" : "");
<<<<<<< HEAD
=======
=======
        + "$"
        + hashCode()
        + "|"
        + ((m_Saver instanceof OptionHandler) ? Utils
            .joinOptions(((OptionHandler) m_Saver).getOptions()) + "|" : "");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  // Custom de-serialization in order to set default
  // environment variables on de-serialization
  private void readObject(ObjectInputStream aStream) throws IOException,
<<<<<<< HEAD
    ClassNotFoundException {
=======
<<<<<<< HEAD
    ClassNotFoundException {
=======
      ClassNotFoundException {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    aStream.defaultReadObject();

    // set a default environment to use
    m_env = Environment.getSystemWide();
  }

  /**
   * The main method for testing
   * 
   * @param args
   */
  public static void main(String[] args) {
    try {
      final javax.swing.JFrame jf = new javax.swing.JFrame();
      jf.getContentPane().setLayout(new java.awt.BorderLayout());

      final Saver tv = new Saver();

      jf.getContentPane().add(tv, java.awt.BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });
      jf.setSize(800, 600);
      jf.setVisible(true);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
