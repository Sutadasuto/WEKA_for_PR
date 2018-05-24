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
 *    FlowRunner.java
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
=======
import java.text.SimpleDateFormat;
import java.util.ArrayList;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
<<<<<<< HEAD
=======
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.RevisionHandler;
<<<<<<< HEAD
import weka.gui.Logger;
import weka.gui.beans.xml.XMLBeans;

/**
 * Small utility class for executing KnowledgeFlow flows outside of the
 * KnowledgeFlow application
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org)
 * @version $Revision: 10328 $
=======
import weka.core.RevisionUtils;
import weka.gui.Logger;
import weka.gui.beans.xml.*;

/**
 * Small utility class for executing KnowledgeFlow
 * flows outside of the KnowledgeFlow application
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org)
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class FlowRunner implements RevisionHandler {

  /** The potential flow(s) to execute */
<<<<<<< HEAD
  protected Vector<Object> m_beans;
=======
  protected Vector m_beans;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  protected int m_runningCount = 0;

  protected transient Logger m_log = null;
<<<<<<< HEAD

  /** Whether to register the set log object with the beans */
  protected boolean m_registerLog = true;

  protected transient Environment m_env;

  /** run each Startable bean sequentially? (default in parallel) */
  protected boolean m_startSequentially = false;

  public static class SimpleLogger implements weka.gui.Logger {
    SimpleDateFormat m_DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void logMessage(String lm) {
      System.out.println(m_DateFormat.format(new Date()) + ": " + lm);
    }

    @Override
    public void statusMessage(String lm) {
      System.out.println(m_DateFormat.format(new Date()) + ": " + lm);
=======
  
  protected transient Environment m_env;
  
  /** run each Startable bean sequentially? (default in parallel) */
  protected boolean m_startSequentially = false;
  
  public static class SimpleLogger implements weka.gui.Logger {
    SimpleDateFormat m_DateFormat = 
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public void logMessage(String lm) {
      System.out.println(m_DateFormat.format(new Date()) + ": " + lm);
    }
    
    public void statusMessage(String lm) {
      System.out.println(m_DateFormat.format(new Date()) + ": " + lm);  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Constructor
   */
  public FlowRunner() {
<<<<<<< HEAD
    this(true, true);
  }

  public FlowRunner(boolean loadProps, boolean registerLog) {
    if (loadProps) {
      // make sure that properties and plugins are loaded
      BeansProperties.loadProperties();
    }
    m_registerLog = registerLog;
=======
    // make sure that properties and plugins are loaded
    KnowledgeFlowApp.loadProperties();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  public void setLog(Logger log) {
    m_log = log;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected void runSequentially(TreeMap<Integer, Startable> startables) {
    Set<Integer> s = startables.keySet();
    for (Integer i : s) {
      try {
        Startable startPoint = startables.get(i);
        startPoint.start();
        Thread.sleep(200);
        waitUntilFinished();
      } catch (Exception ex) {
        ex.printStackTrace();
        if (m_log != null) {
          m_log.logMessage(ex.getMessage());
<<<<<<< HEAD
          m_log.logMessage("Aborting...");
        } else {
          System.err.println(ex.getMessage());
          System.err.println("Aborting...");
=======
          m_log.logMessage(Messages.getInstance().getString("FlowRunner_RunSequentially_LogMessage_Text_First"));
        } else {
          System.err.println(ex.getMessage());
          System.err.println(Messages.getInstance().getString("FlowRunner_RunSequentially_LogMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
        break;
      }
    }
  }

  protected synchronized void launchThread(final Startable s, final int flowNum) {
    Thread t = new Thread() {
<<<<<<< HEAD
      // private int m_num = flowNum;
      @Override
      public void run() {
        try {
          s.start();
        } catch (Exception ex) {
          ex.printStackTrace();
          if (m_log != null) {
            m_log.logMessage(ex.getMessage());
          } else {
            System.err.println(ex.getMessage());
          }
        } finally {
          /*
           * if (m_log != null) { m_log.logMessage("[FlowRunner] flow " + m_num
           * + " finished."); } else { System.out.println("[FlowRunner] Flow " +
           * m_num + " finished."); }
           */
          decreaseCount();
        }
      }
    };
=======
        private int m_num = flowNum;
        public void run() {
          try {
            s.start();
          } catch (Exception ex) {
            ex.printStackTrace();
            if (m_log != null) {
              m_log.logMessage(ex.getMessage());
            } else {
              System.err.println(ex.getMessage());
            }
          } finally {
            /*
            if (m_log != null) { 
              m_log.logMessage("[FlowRunner] flow " + m_num + " finished.");
            } else {
              System.out.println("[FlowRunner] Flow " + m_num + " finished.");
            }
            */
            decreaseCount();
          }
        }
      };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_runningCount++;
    t.setPriority(Thread.MIN_PRIORITY);
    t.start();
  }

  protected synchronized void decreaseCount() {
    m_runningCount--;
  }

  public synchronized void stopAllFlows() {
    for (int i = 0; i < m_beans.size(); i++) {
<<<<<<< HEAD
      BeanInstance temp = (BeanInstance) m_beans.elementAt(i);
      if (temp.getBean() instanceof BeanCommon) {
        // try to stop any execution
        ((BeanCommon) temp.getBean()).stop();
=======
      BeanInstance temp = (BeanInstance)m_beans.elementAt(i);
      if (temp.getBean() instanceof BeanCommon) {
        // try to stop any execution
        ((BeanCommon)temp.getBean()).stop();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
   * Waits until all flows have finished executing before returning
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void waitUntilFinished() {
    try {
      while (m_runningCount > 0) {
        Thread.sleep(200);
      }
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // now poll beans to see if there are any that are still busy
      // (i.e. any multi-threaded ones that queue data instead of blocking)
      while (true) {
        boolean busy = false;
        for (int i = 0; i < m_beans.size(); i++) {
<<<<<<< HEAD
          BeanInstance temp = (BeanInstance) m_beans.elementAt(i);
          if (temp.getBean() instanceof BeanCommon) {
            if (((BeanCommon) temp.getBean()).isBusy()) {
              busy = true;
              break; // for
            }
=======
          BeanInstance temp = (BeanInstance)m_beans.elementAt(i);
          if (temp.getBean() instanceof BeanCommon) {
            if (((BeanCommon)temp.getBean()).isBusy()) {
              busy = true;
              break; // for
            }            
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          }
        }
        if (busy) {
          Thread.sleep(3000);
        } else {
          break; // while
        }
      }
    } catch (Exception ex) {
      if (m_log != null) {
<<<<<<< HEAD
        m_log.logMessage("[FlowRunner] Attempting to stop all flows...");
      } else {
        System.err.println("[FlowRunner] Attempting to stop all flows...");
      }
      stopAllFlows();
      // ex.printStackTrace();
=======
        m_log.logMessage(Messages.getInstance().getString("FlowRunner_WaitUntilFinished_LogMessage_Text"));
      } else {
        System.err.println(Messages.getInstance().getString("FlowRunner_WaitUntilFinished_Error_Text"));
      }
      stopAllFlows();
      //      ex.printStackTrace();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Load a serialized KnowledgeFlow (either binary or xml)
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param fileName the name of the file to load from
   * @throws Exception if something goes wrong
   */
  public void load(String fileName) throws Exception {
    if (!fileName.endsWith(".kf") && !fileName.endsWith(".kfml")) {
<<<<<<< HEAD
      throw new Exception(
        "Can only load and run binary or xml serialized KnowledgeFlows "
          + "(*.kf | *.kfml)");
    }

=======
      throw new Exception(Messages.getInstance().getString("FlowRunner_Load_Exception_Text"));
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (fileName.endsWith(".kf")) {
      loadBinary(fileName);
    } else if (fileName.endsWith(".kfml")) {
      loadXML(fileName);
    }
  }

  /**
   * Load a binary serialized KnowledgeFlow
<<<<<<< HEAD
   * 
   * @param fileName the name of the file to load from
   * @throws Exception if something goes wrong
   */
  @SuppressWarnings("unchecked")
  public void loadBinary(String fileName) throws Exception {
    if (!fileName.endsWith(".kf")) {
      throw new Exception("File must be a binary flow (*.kf)");
=======
   *
   * @param fileName the name of the file to load from
   * @throws Exception if something goes wrong
   */
  public void loadBinary(String fileName) throws Exception {
    if (!fileName.endsWith(".kf")) {
      throw new Exception(Messages.getInstance().getString("FlowRunner_LoadBinary_Exception_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    InputStream is = new FileInputStream(fileName);
    ObjectInputStream ois = new ObjectInputStream(is);
<<<<<<< HEAD
    m_beans = (Vector<Object>) ois.readObject();

    // don't need the graphical connections
    ois.close();

=======
    m_beans = (Vector)ois.readObject();
    
    // don't need the graphical connections
    ois.close();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_env != null) {
      String parentDir = (new File(fileName)).getParent();
      if (parentDir == null) {
        parentDir = "./";
      }
<<<<<<< HEAD
      m_env.addVariable("Internal.knowledgeflow.directory", parentDir);
=======
      m_env.addVariable("Internal.knowledgeflow.directory", 
          parentDir);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Load an XML serialized KnowledgeFlow
<<<<<<< HEAD
   * 
   * @param fileName the name of the file to load from
   * @throws Exception if something goes wrong
   */
  @SuppressWarnings("unchecked")
  public void loadXML(String fileName) throws Exception {
    if (!fileName.endsWith(".kfml")) {
      throw new Exception("File must be an XML flow (*.kfml)");
    }
    BeanConnection.init();
    BeanInstance.init();
    XMLBeans xml = new XMLBeans(null, null, 0);
    Vector<?> v = (Vector<?>) xml.read(new File(fileName));
    m_beans = (Vector<Object>) v.get(XMLBeans.INDEX_BEANINSTANCES);
=======
   *
   * @param fileName the name of the file to load from
   * @throws Exception if something goes wrong
   */
  public void loadXML(String fileName) throws Exception {
    if (!fileName.endsWith(".kfml")) {
      throw new Exception(Messages.getInstance().getString("FlowRunner_LoadXML_Exception_Text"));
    }

    XMLBeans xml = new XMLBeans(null, null);
    Vector v = (Vector) xml.read(new File(fileName));
    m_beans = (Vector) v.get(XMLBeans.INDEX_BEANINSTANCES);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (m_env != null) {
      String parentDir = (new File(fileName)).getParent();
      if (parentDir == null) {
        parentDir = "./";
      }
<<<<<<< HEAD
      m_env.addVariable("Internal.knowledgeflow.directory", parentDir);
    } else {
      System.err.println("++++++++++++ Environment variables null!!...");
    }
  }

  /**
   * Get the vector holding the flow(s)
   * 
   * @return the Vector holding the flow(s)
   */
  public Vector<Object> getFlows() {
=======
      m_env.addVariable("Internal.knowledgeflow.directory", 
          parentDir);
    } else {
      System.err.println(Messages.getInstance().getString("FlowRunner_LoadXML_Error_Text"));
    }
  }
  
  /**
   * Get the vector holding the flow(s)
   *
   * @return the Vector holding the flow(s)
   */
  public Vector getFlows() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_beans;
  }

  /**
   * Set the vector holding the flows(s) to run
<<<<<<< HEAD
   * 
   * @param beans the Vector holding the flows to run
   */
  public void setFlows(Vector<Object> beans) {
    m_beans = beans;
  }

  /**
   * Set the environment variables to use. NOTE: this needs to be called BEFORE
   * a load method is invoked to ensure that the
   * ${Internal.knowledgeflow.directory} variable get set in the supplied
   * Environment object.
=======
   *
   * @param beans the Vector holding the flows to run
   */
  public void setFlows(Vector beans) {
    m_beans = beans;
  }
  
  /**
   * Set the environment variables to use. NOTE: this needs
   * to be called BEFORE a load method is invoked to ensure
   * that the ${Internal.knowledgeflow.directory} variable get
   * set in the supplied Environment object.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param env the environment variables to use.
   */
  public void setEnvironment(Environment env) {
    m_env = env;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Get the environment variables that are in use.
   * 
   * @return the environment variables that are in ues.
   */
  public Environment getEnvironment() {
    return m_env;
  }
<<<<<<< HEAD

  /**
   * Set whether to launch Startable beans one after the other or all in
   * parallel.
=======
  
  /**
   * Set whether to launch Startable beans one after the other
   * or all in parallel.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @param s true if Startable beans are to be launched sequentially
   */
  public void setStartSequentially(boolean s) {
    m_startSequentially = s;
  }
<<<<<<< HEAD

  /**
   * Gets whether Startable beans will be launched sequentially or all in
   * parallel.
=======
  
  /**
   * Gets whether Startable beans will be launched sequentially
   * or all in parallel.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return true if Startable beans will be launched sequentially
   */
  public boolean getStartSequentially() {
    return m_startSequentially;
  }

  /**
   * Launch all loaded KnowledgeFlow
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @throws Exception if something goes wrong during execution
   */
  public void run() throws Exception {
    if (m_beans == null) {
<<<<<<< HEAD
      throw new Exception("Don't seem to have any beans I can execute.");
    }

    // register the log (if set) with the beans
    for (int i = 0; i < m_beans.size(); i++) {
      BeanInstance tempB = (BeanInstance) m_beans.elementAt(i);
      if (m_log != null && m_registerLog) {
        if (tempB.getBean() instanceof BeanCommon) {
          ((BeanCommon) tempB.getBean()).setLog(m_log);
        }
      }

      if (tempB.getBean() instanceof EnvironmentHandler) {
        ((EnvironmentHandler) tempB.getBean()).setEnvironment(m_env);
      }
    }

=======
      throw new Exception(Messages.getInstance().getString("FlowRunner_Run_Exception_Text"));
    }
    
    // register the log (if set) with the beans
    for (int i = 0; i < m_beans.size(); i++) {
      BeanInstance tempB = (BeanInstance)m_beans.elementAt(i);
      if (m_log != null) {
        if (tempB.getBean() instanceof BeanCommon) {
          ((BeanCommon)tempB.getBean()).setLog(m_log);
        }
      }
        
      if (tempB.getBean() instanceof EnvironmentHandler) {
        ((EnvironmentHandler)tempB.getBean()).setEnvironment(m_env);
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int numFlows = 1;

    if (m_log != null) {
      if (m_startSequentially) {
<<<<<<< HEAD
        m_log
          .logMessage("[FlowRunner] launching flow start points sequentially...");
      } else {
        m_log
          .logMessage("[FlowRunner] launching flow start points in parallel...");
=======
        m_log.logMessage(Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_First"));
      } else {
        m_log.logMessage(Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    TreeMap<Integer, Startable> startables = new TreeMap<Integer, Startable>();
    // look for a Startable bean...
    for (int i = 0; i < m_beans.size(); i++) {
<<<<<<< HEAD
      BeanInstance tempB = (BeanInstance) m_beans.elementAt(i);
      boolean launch = true;

      if (tempB.getBean() instanceof Startable) {

        Startable s = (Startable) tempB.getBean();
        String beanName = s.getClass().getName();
        String customName = beanName;
        if (s instanceof BeanCommon) {
          customName = ((BeanCommon) s).getCustomName();
          beanName = customName;
          if (customName.indexOf(':') > 0) {
            if (customName.substring(0, customName.indexOf(':'))
              .startsWith("!")) {
              launch = false;
            }
          }
        }

        // start that sucker (if it's happy to be started)...
        if (!m_startSequentially) {
          if (s.getStartMessage().charAt(0) != '$') {
            if (launch) {
              if (m_log != null) {
                m_log.logMessage("[FlowRunner] Launching flow " + numFlows
                  + "...");
              } else {
                System.out.println("[FlowRunner] Launching flow " + numFlows
                  + "...");
              }
              launchThread(s, numFlows);
              numFlows++;
            }
          } else {
            if (m_log != null) {
              m_log.logMessage("[FlowRunner] WARNING: Can't start " + beanName
                + " at this time.");
            } else {
              System.out.println("[FlowRunner] WARNING: Can't start "
                + beanName + " at this time.");
=======
      BeanInstance tempB = (BeanInstance)m_beans.elementAt(i);
      if (tempB.getBean() instanceof Startable) {
        Startable s = (Startable)tempB.getBean();
        // start that sucker (if it's happy to be started)...
        if (!m_startSequentially) {
          if (s.getStartMessage().charAt(0) != '$') {
            if (m_log != null) {
              m_log.logMessage(Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Third") + numFlows + Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Fourth"));
            } else {
              System.out.println(Messages.getInstance().getString("FlowRunner_Run_Text_First") + numFlows + Messages.getInstance().getString("FlowRunner_Run_Text_Second"));
            }
            launchThread(s, numFlows);
            numFlows++;
          } else {
            String beanName = s.getClass().getName();
            if (s instanceof BeanCommon) {
              String customName = ((BeanCommon)s).getCustomName();
              beanName = customName;
            }
            if (m_log != null) {
              m_log.logMessage(Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Fifth") + beanName + Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Sixth"));
            } else {
              System.out.println(Messages.getInstance().getString("FlowRunner_Run_Text_Third") + beanName + Messages.getInstance().getString("FlowRunner_Run_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            }
          }
        } else {
          boolean ok = false;
          Integer position = null;
<<<<<<< HEAD
          // String beanName = s.getClass().getName();
          if (s instanceof BeanCommon) {
            // String customName = ((BeanCommon)s).getCustomName();
            // beanName = customName;
            // see if we have a parseable integer at the start of the name
            if (customName.indexOf(':') > 0) {
              if (customName.substring(0, customName.indexOf(':')).startsWith(
                "!")) {
                launch = false;
              } else {
                String startPos = customName.substring(0,
                  customName.indexOf(':'));

                try {
                  position = new Integer(startPos);
                  ok = true;
                } catch (NumberFormatException n) {
                }
              }
            }
          }

          if (!ok && launch) {
=======
          String beanName = s.getClass().getName();
          if (s instanceof BeanCommon) {
            String customName = ((BeanCommon)s).getCustomName();
            beanName = customName;
            // see if we have a parseable integer at the start of the name
            if (customName.indexOf(':') > 0) {
              String startPos = customName.substring(0, customName.indexOf(':'));
              try {
                position = new Integer(startPos);
                ok = true;
              } catch (NumberFormatException n) {
              }
            }            
          }
          
          if (!ok) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            if (startables.size() == 0) {
              position = new Integer(0);
            } else {
              int newPos = startables.lastKey().intValue();
              newPos++;
              position = new Integer(newPos);
            }
          }
<<<<<<< HEAD

          if (s.getStartMessage().charAt(0) != '$') {
            if (launch) {
              if (m_log != null) {
                m_log.logMessage("[FlowRunner] adding start point " + beanName
                  + " to the execution list (position " + position + ")");
              } else {
                System.out.println("[FlowRunner] adding start point "
                  + beanName + " to the execution list (position " + position
                  + ")");
              }
              startables.put(position, s);
            }
          } else {
            if (m_log != null) {
              m_log.logMessage("[FlowRunner] WARNING: Can't start " + beanName
                + " at this time.");
            } else {
              System.out.println("[FlowRunner] WARNING: Can't start "
                + beanName + " at this time.");
            }
          }
        }

        if (!launch) {
          if (m_log != null) {
            m_log.logMessage("[FlowRunner] start point " + beanName
              + " will not be launched.");
          } else {
            System.out.println("[FlowRunner] start point " + beanName
              + " will not be launched.");
          }
        }
      }
    }

=======
          
          if (s.getStartMessage().charAt(0) != '$') {
            if (m_log != null) {
              m_log.logMessage(Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Seventh") + beanName
                  + Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Eighth") + position 
                  + Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Nineth"));
            } else {
              System.out.println(Messages.getInstance().getString("FlowRunner_Run_Text_Fifth") + beanName
                  + Messages.getInstance().getString("FlowRunner_Run_Text_Sixth") + position + Messages.getInstance().getString("FlowRunner_Run_Text_Seventh"));
            }
            startables.put(position, s);
          } else {
            if (m_log != null) {
              m_log.logMessage(Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Tenth") + beanName + Messages.getInstance().getString("FlowRunner_Run_LogMessage_Text_Eleventh"));
            } else {
              System.out.println(Messages.getInstance().getString("FlowRunner_Run_Text_Eighth") + beanName + Messages.getInstance().getString("FlowRunner_Run_Text_Nineth"));
            }
          }
        }
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_startSequentially) {
      runSequentially(startables);
    }
  }

  /**
<<<<<<< HEAD
   * Main method for testing this class.
   * 
   * <pre>
   * Usage:\n\nFlowRunner <serialized kf file>
   * </pre>
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    System.setProperty("apple.awt.UIElement", "true");
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
      "Logging started");
    if (args.length < 1) {
      System.err.println("Usage:\n\nFlowRunner <serialized kf file> [-s]\n\n"
        + "\tUse -s to launch start points sequentially (default launches "
        + "in parallel).");
=======
   * Main method for testing this class. <p>
   * <br>Usage:<br><br>
   * <pre>Usage:\n\nFlowRunner <serialized kf file></pre>
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO, Messages.getInstance().getString("FlowRunner_Main_Logger_Text"));
    if (args.length < 1) {
      System.err.println(Messages.getInstance().getString("FlowRunner_Main_Error_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      try {
        FlowRunner fr = new FlowRunner();
        FlowRunner.SimpleLogger sl = new FlowRunner.SimpleLogger();
        String fileName = args[0];
<<<<<<< HEAD

        if (args.length == 2 && args[1].equals("-s")) {
          fr.setStartSequentially(true);
        }

=======
        
        if (args.length == 2 && args[1].equals("-s")) {
          fr.setStartSequentially(true);
        }
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        // start with the system-wide vars
        Environment env = Environment.getSystemWide();

        fr.setLog(sl);
        fr.setEnvironment(env);
<<<<<<< HEAD

        fr.load(fileName);
        fr.run();
        fr.waitUntilFinished();
        System.out.println("Finished all flows.");
=======
        
        fr.load(fileName);
        fr.run();
        fr.waitUntilFinished();
        System.out.println(Messages.getInstance().getString("FlowRunner_Main_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        System.exit(1);
      } catch (Exception ex) {
        ex.printStackTrace();
        System.err.println(ex.getMessage());
      }
<<<<<<< HEAD
    }
  }

  @Override
  public String getRevision() {
    return "$Revision: 10328 $";
=======
    }                         
  }

  public String getRevision() {
    return "$Revision: 7059 $";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
