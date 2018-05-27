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
 *    RemoteEngine.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.experiment;

<<<<<<< HEAD
=======
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.experiment;

import weka.core.Queue;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.net.InetAddress;
import java.net.URL;
import java.net.URLClassLoader;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Hashtable;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Queue;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * A general purpose server for executing Task objects sent via RMI.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 11247 $
 */
public class RemoteEngine extends UnicastRemoteObject implements Compute,
  RevisionHandler {
<<<<<<< HEAD
=======
=======
/**
 * A general purpose server for executing Task objects sent via RMI.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 1.12 $
 */
public class RemoteEngine
  extends UnicastRemoteObject
  implements Compute, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -1021538162895448259L;

  /** The name of the host that this engine is started on */
  private String m_HostName = "local";

  /** A queue of waiting tasks */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final Queue m_TaskQueue = new Queue();

  /** A queue of corresponding ID's for tasks */
  private final Queue m_TaskIdQueue = new Queue();

  /** A hashtable of experiment status */
  private final Hashtable<String, TaskStatusInfo> m_TaskStatus = new Hashtable<String, TaskStatusInfo>();

  /** Is there a task running */
  private boolean m_TaskRunning = false;

<<<<<<< HEAD
=======
=======
  private Queue m_TaskQueue = new Queue();

  /** A queue of corresponding ID's for tasks */
  private Queue m_TaskIdQueue = new Queue();

  /** A hashtable of experiment status */
  private Hashtable m_TaskStatus = new Hashtable();

  /** Is there a task running */
  private boolean m_TaskRunning = false;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Clean up interval (in ms) */
  protected static long CLEANUPTIMEOUT = 3600000;

  /**
   * Constructor
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param hostName name of the host
   * @exception RemoteException if something goes wrong
   */
  public RemoteEngine(String hostName) throws RemoteException {
    super();
    m_HostName = hostName;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /*
     * launch a clean-up thread. Will purge any failed or finished tasks still
     * in the TaskStatus hashtable after an hour
     */

    Thread cleanUpThread;
    cleanUpThread = new Thread() {
      @Override
      public void run() {
        while (true) {
          try {
            // sleep for a while
            Thread.sleep(CLEANUPTIMEOUT);
          } catch (InterruptedException ie) {
          }

          if (m_TaskStatus.size() > 0) {
            purge();
          } else {
            System.err.println("RemoteEngine : purge - no tasks to check.");
          }
        }
      }
    };
<<<<<<< HEAD
=======
=======
    /* launch a clean-up thread. Will purge any failed or finished 
       tasks still in the TaskStatus hashtable after an hour */
       
    Thread cleanUpThread;
    cleanUpThread = new Thread() {
	public void run() {
	  while (true) {
	    try {
	      // sleep for a while
	      Thread.sleep(CLEANUPTIMEOUT);
	    } catch (InterruptedException ie) {}

	    if (m_TaskStatus.size() > 0) {
	      purge();
	    } else {
	      System.err.println("RemoteEngine : purge - no tasks to check.");
	    }
	  }
	}
      };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    cleanUpThread.setPriority(Thread.MIN_PRIORITY);
    cleanUpThread.setDaemon(true);
    cleanUpThread.start();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Takes a task object and queues it for execution
   * 
   * @param t the Task object to execute
   * @return an identifier for the Task that can be used when querying Task
   *         status
   */
  @Override
  public synchronized Object executeTask(Task t) throws RemoteException {
    String taskId = "" + System.currentTimeMillis() + ":";
<<<<<<< HEAD
=======
=======
  
  /**
   * Takes a task object and queues it for execution
   * @param t the Task object to execute
   * @return an identifier for the Task that can be used when querying
   * Task status
   */
  public synchronized Object executeTask(Task t) throws RemoteException {
    String taskId = ""+System.currentTimeMillis()+":";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    taskId += t.hashCode();
    addTaskToQueue(t, taskId);

    return taskId;
<<<<<<< HEAD
    // return t.execute();
=======
<<<<<<< HEAD
    // return t.execute();
=======
    //    return t.execute();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns status information on a particular task
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param taskId the ID of the task to check
   * @return a <code>TaskStatusInfo</code> encapsulating task status info
   * @exception Exception if an error occurs
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Object checkStatus(Object taskId) throws Exception {

    TaskStatusInfo inf = m_TaskStatus.get(taskId);

    if (inf == null) {
      throw new Exception("RemoteEngine (" + m_HostName + ") : Task not found.");
    }

<<<<<<< HEAD
=======
=======
  public Object checkStatus(Object taskId) throws Exception {
    
    TaskStatusInfo inf = (TaskStatusInfo)m_TaskStatus.get(taskId);

    if (inf == null) {
      throw new Exception("RemoteEngine ("+m_HostName+") : Task not found.");
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    TaskStatusInfo result = new TaskStatusInfo();
    result.setExecutionStatus(inf.getExecutionStatus());
    result.setStatusMessage(inf.getStatusMessage());
    result.setTaskResult(inf.getTaskResult());

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (inf.getExecutionStatus() == TaskStatusInfo.FINISHED
      || inf.getExecutionStatus() == TaskStatusInfo.FAILED) {
      System.err.println("Finished/failed Task id : " + taskId
        + " checked by client. Removing.");
<<<<<<< HEAD
=======
=======
    if (inf.getExecutionStatus() == TaskStatusInfo.FINISHED ||
	inf.getExecutionStatus() == TaskStatusInfo.FAILED) {
      System.err.println("Finished/failed Task id : " 
			 + taskId + " checked by client. Removing.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      inf.setTaskResult(null);
      inf = null;
      m_TaskStatus.remove(taskId);
    }
    inf = null;
    return result;
  }

  /**
   * Adds a new task to the queue.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param t a <code>Task</code> value to be added
   * @param taskId the id of the task to be added
   */
  private synchronized void addTaskToQueue(Task t, String taskId) {
    TaskStatusInfo newTask = t.getTaskStatus();
    if (newTask == null) {
      newTask = new TaskStatusInfo();
    }
    m_TaskQueue.push(t);
    m_TaskIdQueue.push(taskId);
<<<<<<< HEAD
    newTask.setStatusMessage("RemoteEngine (" + m_HostName + ") : task "
      + taskId + " queued at postion: " + m_TaskQueue.size());
=======
<<<<<<< HEAD
    newTask.setStatusMessage("RemoteEngine (" + m_HostName + ") : task "
      + taskId + " queued at postion: " + m_TaskQueue.size());
=======
    newTask.setStatusMessage("RemoteEngine ("
			     +m_HostName
			     +") : task " + taskId + " queued at postion: "
			     +m_TaskQueue.size());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // add task status to HashTable
    m_TaskStatus.put(taskId, newTask);
    System.err.println("Task id : " + taskId + " Queued.");
    if (m_TaskRunning == false) {
      startTask();
    }
  }

  /**
<<<<<<< HEAD
   * Checks to see if there are any waiting tasks, and if no task is currently
   * running starts a waiting task.
=======
<<<<<<< HEAD
   * Checks to see if there are any waiting tasks, and if no task is currently
   * running starts a waiting task.
=======
   * Checks to see if there are any waiting tasks, and if no task is
   * currently running starts a waiting task.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void startTask() {

    if (m_TaskRunning == false && m_TaskQueue.size() > 0) {
      Thread activeTaskThread;
      activeTaskThread = new Thread() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void run() {
          m_TaskRunning = true;
          Task currentTask = (Task) m_TaskQueue.pop();
          String taskId = (String) m_TaskIdQueue.pop();
          TaskStatusInfo tsi = m_TaskStatus.get(taskId);
          tsi.setExecutionStatus(TaskStatusInfo.PROCESSING);
          tsi.setStatusMessage("RemoteEngine (" + m_HostName + ") : task "
            + taskId + " running...");
          try {
            System.err.println("Launching task id : " + taskId + "...");
            currentTask.execute();
            TaskStatusInfo runStatus = currentTask.getTaskStatus();
            tsi.setExecutionStatus(runStatus.getExecutionStatus());
            tsi.setStatusMessage("RemoteExperiment (" + m_HostName + ") "
              + runStatus.getStatusMessage());
            tsi.setTaskResult(runStatus.getTaskResult());
          } catch (Error er) {
            // Object initialization can raise Error, which are not subclass of
            // Exception
            tsi.setExecutionStatus(TaskStatusInfo.FAILED);
            if (er.getCause() instanceof java.security.AccessControlException) {
              tsi.setStatusMessage("RemoteEngine (" + m_HostName
                + ") : security error, check remote policy file.");
              System.err.println("Task id " + taskId
                + " Failed! Check remote policy file");
            } else {
              tsi.setStatusMessage("RemoteEngine (" + m_HostName
                + ") : unknown initialization error.");
              System.err.println("Task id " + taskId
                + " Unknown initialization error");
              er.printStackTrace();
              System.err.println("Detailed message " + er.getMessage());
              System.err.println("Detailed cause: " + er.getCause().toString());
            }
          } catch (Exception ex) {
            tsi.setExecutionStatus(TaskStatusInfo.FAILED);
            tsi.setStatusMessage("RemoteEngine (" + m_HostName + ") : "
              + ex.getMessage());
            System.err.println("Task id " + taskId + " Failed, "
              + ex.getMessage());
           } finally {
            if (m_TaskStatus.size() == 0) {
              purgeClasses();
            }
            m_TaskRunning = false;
            // start any waiting tasks
            startTask();
          }
        }
      };
<<<<<<< HEAD
=======
=======
	  public void run() {
	    m_TaskRunning = true;
	    Task currentTask = (Task)m_TaskQueue.pop();
	    String taskId = (String)m_TaskIdQueue.pop();
	    TaskStatusInfo tsi = (TaskStatusInfo)m_TaskStatus.get(taskId);
	    tsi.setExecutionStatus(TaskStatusInfo.PROCESSING);
	    tsi.setStatusMessage("RemoteEngine ("
				 +m_HostName
				 +") : task " + taskId + " running...");
	    try {
	      System.err.println("Launching task id : "
				 + taskId + "...");
	      currentTask.execute();
	      TaskStatusInfo runStatus = currentTask.getTaskStatus();
	      tsi.setExecutionStatus(runStatus.getExecutionStatus());
	      tsi.setStatusMessage("RemoteExperiment ("
				   +m_HostName+") "
				   +runStatus.getStatusMessage());
	      tsi.setTaskResult(runStatus.getTaskResult());
	    } catch (Error er) {
              // Object initialization can raise Error, which are not subclass of Exception
	      tsi.setExecutionStatus(TaskStatusInfo.FAILED);
              if (er.getCause() instanceof java.security.AccessControlException) {
                tsi.setStatusMessage("RemoteEngine ("
                                     +m_HostName
                                     +") : security error, check remote policy file.");
                System.err.println("Task id " + taskId + " Failed! Check remote policy file");
              }
              else {
                tsi.setStatusMessage("RemoteEngine ("
                                     +m_HostName
                                     +") : unknown initialization error.");
                System.err.println("Task id " + taskId + " Unknown initialization error");
              }
	    } catch (Exception ex) {
	      tsi.setExecutionStatus(TaskStatusInfo.FAILED);
              if (ex instanceof java.io.FileNotFoundException) {
                tsi.setStatusMessage("RemoteEngine ("
                                     +m_HostName
                                     +") : " + ex.getMessage());
                System.err.println("Task id " + taskId + " Failed, " + ex.getMessage());
              }
              else {
                tsi.setStatusMessage("RemoteEngine ("
                                     +m_HostName
                                     +") : task " + taskId + " failed.");
                System.err.println("Task id " + taskId + " Failed!");
              }
	    } finally {
	      if (m_TaskStatus.size() == 0) {
		purgeClasses();
	      }
	      m_TaskRunning = false;
	      // start any waiting tasks
	      startTask();
	    }
	  }
	};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      activeTaskThread.setPriority(Thread.MIN_PRIORITY);
      activeTaskThread.start();
    }
  }

  /**
<<<<<<< HEAD
   * Attempts to purge class types from the virtual machine. May take some time
   * as it relies on garbage collection
=======
<<<<<<< HEAD
   * Attempts to purge class types from the virtual machine. May take some time
   * as it relies on garbage collection
=======
   * Attempts to purge class types from the virtual machine. May take some
   * time as it relies on garbage collection
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void purgeClasses() {
    try {
      // see if we can purge classes
<<<<<<< HEAD
      ClassLoader prevCl = Thread.currentThread().getContextClassLoader();
      ClassLoader urlCl = URLClassLoader.newInstance(new URL[] { new URL(
        "file:.") }, prevCl);
=======
<<<<<<< HEAD
      ClassLoader prevCl = Thread.currentThread().getContextClassLoader();
      ClassLoader urlCl = URLClassLoader.newInstance(new URL[] { new URL(
        "file:.") }, prevCl);
=======
      ClassLoader prevCl = 
	Thread.currentThread().getContextClassLoader();
      ClassLoader urlCl = 
	URLClassLoader.newInstance(new URL[] {new URL("file:.")}, prevCl);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Thread.currentThread().setContextClassLoader(urlCl);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Checks the hash table for failed/finished tasks. Any that have been around
   * for an @seeCLEANUPTIMEOUT or more are removed. Clients are expected to
   * check on the status of their remote tasks. Checking on the status of a
   * finished/failed task will remove it from the hash table, therefore any
   * failed/finished tasks left lying around for more than an hour suggest that
   * their client has died..
   * 
   */
  private void purge() {
    Enumeration<String> keys = m_TaskStatus.keys();
    long currentTime = System.currentTimeMillis();
    System.err.println("RemoteEngine purge. Current time : " + currentTime);
    while (keys.hasMoreElements()) {
      String taskId = keys.nextElement();
<<<<<<< HEAD
=======
=======
  
  /**
   * Checks the hash table for failed/finished tasks. Any that have been
   * around for an @seeCLEANUPTIMEOUT or more are removed. Clients are expected to check
   * on the status of their remote tasks. Checking on the status of a
   * finished/failed task will remove it from the hash table, therefore
   * any failed/finished tasks left lying around for more than an hour
   * suggest that their client has died..
   *
   */
  private void purge() {
    Enumeration keys = m_TaskStatus.keys();
    long currentTime = System.currentTimeMillis();
    System.err.println("RemoteEngine purge. Current time : " + currentTime);
    while (keys.hasMoreElements()) {
      String taskId = (String)keys.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.print("Examining task id : " + taskId + "... ");
      String timeString = taskId.substring(0, taskId.indexOf(':'));
      long ts = Long.valueOf(timeString).longValue();
      if (currentTime - ts > CLEANUPTIMEOUT) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        TaskStatusInfo tsi = m_TaskStatus.get(taskId);
        if ((tsi != null)
          && (tsi.getExecutionStatus() == TaskStatusInfo.FINISHED || tsi
            .getExecutionStatus() == TaskStatusInfo.FAILED)) {
          System.err.println("\nTask id : " + taskId
            + " has gone stale. Removing.");
          m_TaskStatus.remove(taskId);
          tsi.setTaskResult(null);
          tsi = null;
        }
      } else {
        System.err.println("ok.");
<<<<<<< HEAD
=======
=======
	TaskStatusInfo tsi = (TaskStatusInfo)m_TaskStatus.get(taskId);
	if ((tsi != null) 
	    && (tsi.getExecutionStatus() == TaskStatusInfo.FINISHED ||
                tsi.getExecutionStatus() == TaskStatusInfo.FAILED)) {
	  System.err.println("\nTask id : " 
			     + taskId + " has gone stale. Removing.");
	  m_TaskStatus.remove(taskId);
	  tsi.setTaskResult(null);
	  tsi = null;
	}
      } else {
	System.err.println("ok.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (m_TaskStatus.size() == 0) {
      purgeClasses();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11247 $");
  }

  /**
   * Main method. Gets address of the local host, creates a remote engine object
   * and binds it in the RMI registry. If there is no RMI registry, then it
   * tries to create one with default port 1099.
   * 
   * @param args
   */
  public static void main(String[] args) {
    // make sure that all packages are loaded and available to
    // the remote engines
    weka.gui.GenericObjectEditor.determineClasses();

    if (System.getSecurityManager() == null) {
      System.setSecurityManager(new RMISecurityManager());
    }

<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.12 $");
  }

  /**
   * Main method. Gets address of the local host, creates a remote engine
   * object and binds it in the RMI registry. If there is no RMI registry,
   * then it tries to create one with default port 1099.
   *
   * @param args 
   */
  public static void main(String[] args) {
    if (System.getSecurityManager() == null) {
      System.setSecurityManager(new RMISecurityManager());
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int port = 1099;
    InetAddress localhost = null;
    try {
      localhost = InetAddress.getLocalHost();
<<<<<<< HEAD
      System.err.println("Host name : " + localhost.getHostName());
=======
<<<<<<< HEAD
      System.err.println("Host name : " + localhost.getHostName());
=======
      System.err.println("Host name : "+localhost.getHostName());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    String name;
    if (localhost != null) {
      name = localhost.getHostName();
    } else {
      name = "localhost";
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // get optional port
    try {
      String portOption = Utils.getOption("p", args);
      if (!portOption.equals("")) {
        port = Integer.parseInt(portOption);
      }
<<<<<<< HEAD
=======
=======
    
    // get optional port
    try {
      String portOption = Utils.getOption("p", args);
      if (!portOption.equals("")) 
        port = Integer.parseInt(portOption);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      System.err.println("Usage : -p <port>");
    }

    if (port != 1099) {
      name = name + ":" + port;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    name = "//" + name + "/RemoteEngine";

    try {
      Compute engine = new RemoteEngine(name);

      try {
<<<<<<< HEAD
=======
=======
    name = "//"+name+"/RemoteEngine";
    
    try {
      Compute engine = new RemoteEngine(name);
      
      try {      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        Naming.rebind(name, engine);
        System.out.println("RemoteEngine bound in RMI registry");
      } catch (RemoteException ex) {
        // try to bootstrap a new registry
<<<<<<< HEAD
        System.err.println("Attempting to start RMI registry on port " + port
          + "...");
=======
<<<<<<< HEAD
        System.err.println("Attempting to start RMI registry on port " + port
          + "...");
=======
        System.err.println("Attempting to start RMI registry on port " + port + "...");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        java.rmi.registry.LocateRegistry.createRegistry(port);
        Naming.bind(name, engine);
        System.out.println("RemoteEngine bound in RMI registry");
      }
<<<<<<< HEAD

    } catch (Exception e) {
      System.err.println("RemoteEngine exception: " + e.getMessage());
=======
<<<<<<< HEAD

    } catch (Exception e) {
      System.err.println("RemoteEngine exception: " + e.getMessage());
=======
      
    } catch (Exception e) {
      System.err.println("RemoteEngine exception: " + 
			 e.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      e.printStackTrace();
    }
  }
}
