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
 *    InstanceLoader.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.streams;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.core.Instance;
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;

/**
 * A bean that produces a stream of instances from a file.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10222 $
 */
public class InstanceLoader extends JPanel implements ActionListener,
  InstanceProducer {

  /** for serialization */
  private static final long serialVersionUID = -8725567310271862492L;

  private final Vector<InstanceListener> m_Listeners;
<<<<<<< HEAD
=======
=======
/** 
 * A bean that produces a stream of instances from a file.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class InstanceLoader
  extends JPanel 
  implements ActionListener, InstanceProducer {

  /** for serialization */
  private static final long serialVersionUID = -8725567310271862492L;
  
  private Vector m_Listeners;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private Thread m_LoaderThread;
  private Instance m_OutputInstance;
  private Instances m_OutputInstances;
  private boolean m_Debug;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final JButton m_StartBut;
  private final JTextField m_FileNameTex;

  private class LoadThread extends Thread {

    private final InstanceProducer m_IP;

    public LoadThread(InstanceProducer ip) {

      m_IP = ip;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void run() {

      try {
        m_StartBut.setText("Stop");
        m_StartBut.setBackground(Color.red);
        if (m_Debug) {
          System.err.println("InstanceLoader::LoadThread::run()");
        }
        // Load the instances one at a time and pass them on to the listener
        Reader input = new BufferedReader(new FileReader(
          m_FileNameTex.getText()));
        m_OutputInstances = new Instances(input, 1);
        if (m_Debug) {
          System.err.println("InstanceLoader::LoadThread::run()"
            + " - Instances opened from: " + m_FileNameTex.getText());
        }
        InstanceEvent ie = new InstanceEvent(m_IP,
          InstanceEvent.FORMAT_AVAILABLE);
        notifyInstanceProduced(ie);
        while (m_OutputInstances.readInstance(input)) {
          if (m_LoaderThread != this) {
            return;
          }
          if (m_Debug) {
            System.err.println("InstanceLoader::LoadThread::run()"
              + " - read instance");
          }
          // put the instance into a queue?
          m_OutputInstance = m_OutputInstances.instance(0);
          m_OutputInstances.delete(0);
          ie = new InstanceEvent(m_IP, InstanceEvent.INSTANCE_AVAILABLE);
          notifyInstanceProduced(ie);
        }
        ie = new InstanceEvent(m_IP, InstanceEvent.BATCH_FINISHED);
        notifyInstanceProduced(ie);
      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      } finally {
        m_LoaderThread = null;
        m_StartBut.setText("Start");
        m_StartBut.setBackground(Color.green);
<<<<<<< HEAD
=======
=======
  private JButton m_StartBut;
  private JTextField m_FileNameTex;

  private class LoadThread extends Thread {
    
    private InstanceProducer m_IP;
    public LoadThread(InstanceProducer ip) {
      
      m_IP = ip;
    }

    public void run() {
      
      try {
	m_StartBut.setText(Messages.getInstance().getString("InstanceLoader_LoadThread_Run_StartBut_SetText_Text"));
	m_StartBut.setBackground(Color.red);
	if (m_Debug) {
	  System.err.println(Messages.getInstance().getString("InstanceLoader_LoadThread_Run_Error_Text_First"));
	}
	// Load the instances one at a time and pass them on to the listener
	Reader input = new BufferedReader(
		       new FileReader(m_FileNameTex.getText()));
	m_OutputInstances = new Instances(input, 1);
	if (m_Debug) {
	  System.err.println(Messages.getInstance().getString("InstanceLoader_LoadThread_Run_Error_Text_Second") + m_FileNameTex.getText());
	}
	InstanceEvent ie = new InstanceEvent(m_IP,
					     InstanceEvent.FORMAT_AVAILABLE);
	notifyInstanceProduced(ie);
	while (m_OutputInstances.readInstance(input)) {
	  if (m_LoaderThread != this) {
	    return;
	  }
	  if (m_Debug) {
	    System.err.println(Messages.getInstance().getString("InstanceLoader_LoadThread_Run_Error_Text_Third"));
	  }
	  // put the instance into a queue?
	  m_OutputInstance = m_OutputInstances.instance(0);
	  m_OutputInstances.delete(0);
	  ie = new InstanceEvent(m_IP, InstanceEvent.INSTANCE_AVAILABLE);
	  notifyInstanceProduced(ie);
	}
	ie = new InstanceEvent(m_IP, InstanceEvent.BATCH_FINISHED);
	notifyInstanceProduced(ie);
      } catch (Exception ex) {
	System.err.println(ex.getMessage());
      } finally {
	m_LoaderThread = null;
	m_StartBut.setText(Messages.getInstance().getString("InstanceLoader_LoadThread_Run_StatusBut_SetText_Text"));
	m_StartBut.setBackground(Color.green);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  public InstanceLoader() {
    setLayout(new BorderLayout());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_StartBut = new JButton("Start");
    m_StartBut.setBackground(Color.green);
    add("West", m_StartBut);
    m_StartBut.addActionListener(this);
    m_FileNameTex = new JTextField("/home/trigg/datasets/UCI/iris.arff");
    add("Center", m_FileNameTex);
    m_Listeners = new Vector<InstanceListener>();
    // setSize(60,40);
  }

  public void setDebug(boolean debug) {

    m_Debug = debug;
  }

  public boolean getDebug() {

<<<<<<< HEAD
=======
=======
    m_StartBut = new JButton(Messages.getInstance().getString("InstanceLoader_StartBut_JButton_Text"));
    m_StartBut.setBackground(Color.green);
    add(Messages.getInstance().getString("InstanceLoader_StartBut_JButton_Add_Text_First"), m_StartBut);
    m_StartBut.addActionListener(this);
    m_FileNameTex = new JTextField("/home/trigg/datasets/UCI/iris.arff");
    add(Messages.getInstance().getString("InstanceLoader_StartBut_JButton_Add_Text_Second"), m_FileNameTex);
    m_Listeners = new Vector();
    //    setSize(60,40);
  }

  public void setDebug(boolean debug) {
    
    m_Debug = debug;
  }
  
  public boolean getDebug() {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_Debug;
  }

  public void setArffFile(String newArffFile) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_FileNameTex.setText(newArffFile);
  }

<<<<<<< HEAD
=======
=======
    
    m_FileNameTex.setText(newArffFile);
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String getArffFile() {
    return m_FileNameTex.getText();
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public synchronized void addInstanceListener(InstanceListener ipl) {

    m_Listeners.addElement(ipl);
  }

  @Override
  public synchronized void removeInstanceListener(InstanceListener ipl) {

    m_Listeners.removeElement(ipl);
  }

  @SuppressWarnings("unchecked")
  protected void notifyInstanceProduced(InstanceEvent e) {

    if (m_Debug) {
      System.err.println("InstanceLoader::notifyInstanceProduced()");
    }
    Vector<InstanceListener> l;
    synchronized (this) {
      l = (Vector<InstanceListener>) m_Listeners.clone();
    }
    if (l.size() > 0) {
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).instanceProduced(e);
      }
      if (e.getID() == InstanceEvent.INSTANCE_AVAILABLE) {
        m_OutputInstance = null;
<<<<<<< HEAD
=======
=======
  public synchronized void addInstanceListener(InstanceListener ipl) {
    
    m_Listeners.addElement(ipl);
  }
  
  public synchronized void removeInstanceListener(InstanceListener ipl) {
    
    m_Listeners.removeElement(ipl);
  }
  
  protected void notifyInstanceProduced(InstanceEvent e) {
    
    if (m_Debug) {
      System.err.println(Messages.getInstance().getString("InstanceLoader_NotifyInstanceProduced_Error_Text"));
    }
    Vector l;
    synchronized (this) {
      l = (Vector)m_Listeners.clone();
    }
    if (l.size() > 0) {
      for(int i = 0; i < l.size(); i++) {
	((InstanceListener)l.elementAt(i)).instanceProduced(e);
      }
      if (e.getID() == InstanceEvent.INSTANCE_AVAILABLE) {
	m_OutputInstance = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Instances outputFormat() throws Exception {

    if (m_OutputInstances == null) {
      throw new Exception("No output format defined.");
    }
    return new Instances(m_OutputInstances, 0);
  }

  @Override
  public Instance outputPeek() throws Exception {

    if ((m_OutputInstances == null) || (m_OutputInstance == null)) {
      return null;
    }
    return (Instance) m_OutputInstance.copy();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

<<<<<<< HEAD
=======
=======
  public Instances outputFormat() throws Exception {
    
    if (m_OutputInstances == null) {
      throw new Exception(Messages.getInstance().getString("InstanceLoader_OutputFormat_Exception_Text"));
    }
    return new Instances(m_OutputInstances,0);
  }
  
  public Instance outputPeek() throws Exception {
    
    if ((m_OutputInstances == null)
	|| (m_OutputInstance == null)) {
      return null;
    }
    return (Instance)m_OutputInstance.copy();
  }

  public void actionPerformed(ActionEvent e) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Object source = e.getSource();

    if (source == m_StartBut) {
      // load the arff file and send the instances out to the listener
      if (m_LoaderThread == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_LoaderThread = new LoadThread(this);
        m_LoaderThread.setPriority(Thread.MIN_PRIORITY);
        m_LoaderThread.start();
      } else {
        m_LoaderThread = null;
<<<<<<< HEAD
=======
=======
	m_LoaderThread = new LoadThread(this);
	m_LoaderThread.setPriority(Thread.MIN_PRIORITY);
	m_LoaderThread.start();
      } else {
	m_LoaderThread = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }
}
