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
 *    InstanceJoiner.java
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
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.Serializable;
import java.util.Vector;

import weka.core.Instance;
import weka.core.Instances;

/**
 * A bean that joins two streams of instances into one.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10222 $
 */
public class InstanceJoiner implements Serializable, InstanceProducer,
  SerialInstanceListener {
<<<<<<< HEAD
=======
=======
import weka.core.Instance;
import weka.core.Instances;

import java.io.Serializable;
import java.util.Vector;

/** 
 * A bean that joins two streams of instances into one.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class InstanceJoiner
  implements Serializable, InstanceProducer, SerialInstanceListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -6529972700291329656L;

  /** The listeners */
<<<<<<< HEAD
  private final Vector<InstanceListener> listeners;
=======
<<<<<<< HEAD
  private final Vector<InstanceListener> listeners;
=======
  private Vector listeners;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Debugging mode */
  private boolean b_Debug;

  /** The input format for instances */
  protected Instances m_InputFormat;

  /** The current output instance */
  private Instance m_OutputInstance;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Whether the first input batch has finished */
  private boolean b_FirstInputFinished;

  // private boolean b_SecondInputFinished; NOT USED

  /** Setup the initial states of the member variables */
  public InstanceJoiner() {

    listeners = new Vector<InstanceListener>();
<<<<<<< HEAD
=======
=======

  /** Whether the first input batch has finished */
  private boolean b_FirstInputFinished;
  private boolean b_SecondInputFinished;


  /** Setup the initial states of the member variables */
  public InstanceJoiner() {
    
    listeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_InputFormat = null;
    m_OutputInstance = null;
    b_Debug = false;
    b_FirstInputFinished = false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // b_SecondInputFinished = false; NOT USED
  }

  /**
   * Sets the format of the input instances. If the filter is able to determine
   * the output format before seeing any input instances, it does so here. This
   * default implementation assumes the output format is determined when
   * batchFinished() is called.
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   */
  public boolean inputFormat(Instances instanceInfo) {

    m_InputFormat = new Instances(instanceInfo, 0);
    notifyInstanceProduced(new InstanceEvent(this,
      InstanceEvent.FORMAT_AVAILABLE));
    b_FirstInputFinished = false;
    // b_SecondInputFinished = false; NOT USED
<<<<<<< HEAD
=======
=======
    b_SecondInputFinished = false;
  }


  /**
   * Sets the format of the input instances. If the filter is able to determine
   * the output format before seeing any input instances, it does so here. This
   * default implementation assumes the output format is determined when 
   * batchFinished() is called.
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   */
  public boolean inputFormat(Instances instanceInfo) {
    
    m_InputFormat = new Instances(instanceInfo,0);
    notifyInstanceProduced(new InstanceEvent(this, InstanceEvent.FORMAT_AVAILABLE));
    b_FirstInputFinished = false;
    b_SecondInputFinished = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return true;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the format of the output instances. This should only be called after
   * input() or batchFinished() has returned true.
   * 
   * @return an Instances object containing the output instance structure only.
   * @throws Exception if no input structure has been defined (or the output
   *           format hasn't been determined yet)
   */
  @Override
  public Instances outputFormat() throws Exception {

    if (m_InputFormat == null) {
      throw new Exception("No output format defined.");
    }
    return new Instances(m_InputFormat, 0);
  }

  public boolean input(Instance instance) throws Exception {

    if (m_InputFormat == null) {
      throw new Exception("No input instance format defined");
    }
    if (instance != null) {
      m_OutputInstance = (Instance) instance.copy();
      notifyInstanceProduced(new InstanceEvent(this,
        InstanceEvent.INSTANCE_AVAILABLE));
<<<<<<< HEAD
=======
=======
   * Gets the format of the output instances. This should only be called
   * after input() or batchFinished() has returned true.
   *
   * @return an Instances object containing the output instance
   * structure only.
   * @throws Exception if no input structure has been defined (or the output
   * format hasn't been determined yet)
   */
  public Instances outputFormat() throws Exception {
    
    if (m_InputFormat == null) {
      throw new Exception(Messages.getInstance().getString("InstanceJoiner_OutputFormat_Exception_Text"));
    }
    return new Instances(m_InputFormat,0);
  }
  
  public boolean input(Instance instance) throws Exception {
    
    if (m_InputFormat == null) {
      throw new Exception(Messages.getInstance().getString("InstanceJoiner_Input_Exception_Text"));
    }
    if (instance != null) {
      m_OutputInstance = (Instance)instance.copy();
      notifyInstanceProduced(new InstanceEvent(this,
				InstanceEvent.INSTANCE_AVAILABLE));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return true;
    }
    return false;
  }

  /**
   * Signify that this batch of input to the filter is finished. If the filter
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances. Any subsequent instances filtered should
   * be filtered based on setting obtained from the first batch (unless the
   * inputFormat has been re-assigned or new options have been set). This
   * default implementation assumes all instance processing occurs during
   * inputFormat() and input().
   * 
   * @throws Exception if no input structure has been defined
   */
  public void batchFinished() throws Exception {

    if (m_InputFormat == null) {
      throw new Exception("No input instance format defined");
    }
    notifyInstanceProduced(new InstanceEvent(this, InstanceEvent.BATCH_FINISHED));
  }

  /**
   * Output an instance after filtering but do not remove from the output queue.
   * 
   * @return the instance that has most recently been filtered (or null if the
   *         queue is empty).
   * @throws Exception if no input structure has been defined
   */
  @Override
  public Instance outputPeek() throws Exception {

    if (m_InputFormat == null) {
      throw new Exception("No output instance format defined");
<<<<<<< HEAD
=======
=======
   * requires all instances prior to filtering, output() may now be called
   * to retrieve the filtered instances. Any subsequent instances filtered
   * should be filtered based on setting obtained from the first batch
   * (unless the inputFormat has been re-assigned or new options have been
   * set). This default implementation assumes all instance processing occurs
   * during inputFormat() and input().
   *
   * @throws Exception if no input structure has been defined
   */
  public void batchFinished() throws Exception {
    
    if (m_InputFormat == null) {
      throw new Exception(Messages.getInstance().getString("InstanceJoiner_BatchFinished_Exception_Text"));
    }
    notifyInstanceProduced(new InstanceEvent(this,
					     InstanceEvent.BATCH_FINISHED));
  }


  /**
   * Output an instance after filtering but do not remove from the output
   * queue.
   *
   * @return the instance that has most recently been filtered (or null if
   * the queue is empty).
   * @throws Exception if no input structure has been defined
   */
  public Instance outputPeek() throws Exception {
    
    if (m_InputFormat == null) {
      throw new Exception(Messages.getInstance().getString("InstanceJoiner_OutputPeek_Exception_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    if (m_OutputInstance == null) {
      return null;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return (Instance) m_OutputInstance.copy();
  }

  public void setDebug(boolean debug) {

    b_Debug = debug;
  }

  public boolean getDebug() {

    return b_Debug;
  }

  @Override
  public synchronized void addInstanceListener(InstanceListener ipl) {

    listeners.addElement(ipl);
  }

  @Override
  public synchronized void removeInstanceListener(InstanceListener ipl) {

    listeners.removeElement(ipl);
  }

  @SuppressWarnings("unchecked")
  protected void notifyInstanceProduced(InstanceEvent e) {

    if (listeners.size() > 0) {
      if (b_Debug) {
        System.err.println(this.getClass().getName()
          + "::notifyInstanceProduced()");
      }
      Vector<InstanceListener> l;
      synchronized (this) {
        l = (Vector<InstanceListener>) listeners.clone();
      }
      for (int i = 0; i < l.size(); i++) {
        l.elementAt(i).instanceProduced(e);
<<<<<<< HEAD
=======
=======
    return (Instance)m_OutputInstance.copy();
  }


  public void setDebug(boolean debug) {
    
    b_Debug = debug;
  }
  
  public boolean getDebug() {
    
    return b_Debug;
  }

  public synchronized void addInstanceListener(InstanceListener ipl) {
    
    listeners.addElement(ipl);
  }
  
  public synchronized void removeInstanceListener(InstanceListener ipl) {
    
    listeners.removeElement(ipl);
  }
  
  protected void notifyInstanceProduced(InstanceEvent e) {
    
    if (listeners.size() > 0) {
      if (b_Debug) {
	System.err.println(this.getClass().getName()
			   + Messages.getInstance().getString("InstanceJoiner_NotifyInstanceProduced_Error_Text_First"));
      }
      Vector l;
      synchronized (this) {
	l = (Vector)listeners.clone();
      }
      for(int i = 0; i < l.size(); i++) {
	((InstanceListener)l.elementAt(i)).instanceProduced(e);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      // If there are any listeners, and the event is an INSTANCE_AVAILABLE,
      // they should have retrieved the instance with outputPeek();
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (e.getID() == InstanceEvent.INSTANCE_AVAILABLE) {
          m_OutputInstance = null;
        }
      } catch (Exception ex) {
        System.err.println("Problem: notifyInstanceProduced() was\n"
          + "called with INSTANCE_AVAILABLE, but output()\n"
          + "threw an exception: " + ex.getMessage());
<<<<<<< HEAD
=======
=======
	if (e.getID() == InstanceEvent.INSTANCE_AVAILABLE) {
	  m_OutputInstance = null;
	}
      } catch (Exception ex) {
	System.err.println(Messages.getInstance().getString("InstanceJoiner_NotifyInstanceProduced_Exception_Text") + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  public void instanceProduced(InstanceEvent e) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Object source = e.getSource();
    if (source instanceof InstanceProducer) {
      try {
        InstanceProducer a = (InstanceProducer) source;
        switch (e.getID()) {
        case InstanceEvent.FORMAT_AVAILABLE:
          if (b_Debug) {
            System.err.println(this.getClass().getName()
              + "::firstInstanceProduced() - Format available");
          }
          inputFormat(a.outputFormat());
          break;
        case InstanceEvent.INSTANCE_AVAILABLE:
          if (b_Debug) {
            System.err.println(this.getClass().getName()
              + "::firstInstanceProduced() - Instance available");
          }
          input(a.outputPeek());
          break;
        case InstanceEvent.BATCH_FINISHED:
          if (b_Debug) {
            System.err.println(this.getClass().getName()
              + "::firstInstanceProduced() - End of instance batch");
          }
          batchFinished();
          b_FirstInputFinished = true;
          break;
        default:
          System.err.println(this.getClass().getName()
            + "::firstInstanceProduced() - unknown event type");
          break;
        }
      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    } else {
      System.err.println(this.getClass().getName()
        + "::firstInstanceProduced() - Unknown source object type");
    }
  }

  @Override
  public void secondInstanceProduced(InstanceEvent e) {

    Object source = e.getSource();
    if (source instanceof InstanceProducer) {
      try {
        if (!b_FirstInputFinished) {
          throw new Exception(this.getClass().getName()
            + "::secondInstanceProduced() - Input received from"
            + " second stream before first stream finished");
        }
        InstanceProducer a = (InstanceProducer) source;
        switch (e.getID()) {
        case InstanceEvent.FORMAT_AVAILABLE:
          if (b_Debug) {
            System.err.println(this.getClass().getName()
              + "::secondInstanceProduced() - Format available");
          }
          // Check the formats are compatible
          if (!(a.outputFormat()).equalHeaders(outputFormat())) {
            throw new Exception(this.getClass().getName()
              + "::secondInstanceProduced() - incompatible instance streams\n"
              + (a.outputFormat()).equalHeadersMsg(outputFormat()));
          }
          break;
        case InstanceEvent.INSTANCE_AVAILABLE:
          if (b_Debug) {
            System.err.println(this.getClass().getName()
              + "::secondInstanceProduced() - Instance available");
          }
          input(a.outputPeek());
          break;
        case InstanceEvent.BATCH_FINISHED:
          if (b_Debug) {
            System.err.println(this.getClass().getName()
              + "::secondInstanceProduced() - End of instance batch");
          }
          batchFinished();
          break;
        default:
          System.err.println(this.getClass().getName()
            + "::secondInstanceProduced() - unknown event type");
          break;
        }
      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    } else {
      System.err.println(this.getClass().getName()
        + "::secondInstanceProduced() - Unknown source object type");
    }
  }
}
<<<<<<< HEAD
=======
=======
    
    Object source = e.getSource();
    if (source instanceof InstanceProducer) { 
      try {
	InstanceProducer a = (InstanceProducer) source;
	switch (e.getID()) {
	case InstanceEvent.FORMAT_AVAILABLE:
	  if (b_Debug) {
	    System.err.println(this.getClass().getName()
			+ Messages.getInstance().getString("InstanceJoiner_InstanceProduced_InstanceEventFORMAT_AVAILABLE_Error_Text"));
	  }
	  inputFormat(a.outputFormat());
	  break;
	case InstanceEvent.INSTANCE_AVAILABLE:
	  if (b_Debug) {
	    System.err.println(this.getClass().getName()
			+ Messages.getInstance().getString("InstanceJoiner_InstanceProduced_InstanceEventINSTANCE_AVAILABLE_Error_Text"));
	  }
	  input(a.outputPeek());
	  break;
	case InstanceEvent.BATCH_FINISHED:
	  if (b_Debug) {
	    System.err.println(this.getClass().getName()
			+ Messages.getInstance().getString("InstanceJoiner_InstanceProduced_InstanceEventBATCH_FINISHED_Error_Text"));
	  }
	  batchFinished();
	  b_FirstInputFinished = true;
	  break;
	default:
	  System.err.println(this.getClass().getName()
	       + Messages.getInstance().getString("InstanceJoiner_InstanceProduced_InstanceEventDEFAULT_Error_Text"));
	  break;
	}
      } catch (Exception ex) {
	System.err.println(ex.getMessage());
      }
    } else {
      System.err.println(this.getClass().getName()
	     + Messages.getInstance().getString("InstanceJoiner_InstanceProduced_InstanceEventDEFAULT_Error_Text"));
    }
  }

  public void secondInstanceProduced(InstanceEvent e) {
    
    Object source = e.getSource();
    if (source instanceof InstanceProducer) { 
      try {
	if (!b_FirstInputFinished) {
	  throw new Exception(this.getClass().getName()
	  + Messages.getInstance().getString("InstanceJoiner_InstanceProduced_Error_Text"));
	}
	InstanceProducer a = (InstanceProducer) source;
	switch (e.getID()) {
	case InstanceEvent.FORMAT_AVAILABLE:
	  if (b_Debug) {
	    System.err.println(this.getClass().getName()
	    + Messages.getInstance().getString("InstanceJoiner_SecondInstanceProduced_Error_Text_First"));
	  }
	  // Check the formats are compatible
	  if (!(a.outputFormat()).equalHeaders(outputFormat())) {
	    throw new Exception(this.getClass().getName()
	    + Messages.getInstance().getString("InstanceJoiner_SecondInstanceProduced_InstanceEventFORMAT_AVAILABLE_Error_Text"));
	  }
	  break;
	case InstanceEvent.INSTANCE_AVAILABLE:
	  if (b_Debug) {
	    System.err.println(this.getClass().getName()
	    + Messages.getInstance().getString("InstanceJoiner_SecondInstanceProduced_InstanceEventINSTANCE_AVAILABLE_Error_Text"));
	  }
	  input(a.outputPeek());
	  break;
	case InstanceEvent.BATCH_FINISHED:
	  if (b_Debug) {
	    System.err.println(this.getClass().getName()
	    + Messages.getInstance().getString("InstanceJoiner_SecondInstanceProduced_InstanceEventBATCH_FINISHED_Error_Text"));
	  }
	  batchFinished();
	  break;
	default:
	  System.err.println(this.getClass().getName()
		+ Messages.getInstance().getString("InstanceJoiner_SecondInstanceProduced_InstanceEventDEFAULT_Error_Text"));
	  break;
	}
      } catch (Exception ex) {
	System.err.println(ex.getMessage());
      }
    } else {
      System.err.println(this.getClass().getName()
	  + Messages.getInstance().getString("InstanceJoiner_SecondInstanceProduced_Error_Text_Second"));
    }
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
