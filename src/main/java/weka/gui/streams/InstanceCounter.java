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
 *    InstanceCounter.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.streams;

<<<<<<< HEAD
=======
import weka.core.Instance;
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

<<<<<<< HEAD
import weka.core.Instance;
import weka.core.Instances;

/**
 * A bean that counts instances streamed to it.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10222 $
 */
public class InstanceCounter extends JPanel implements InstanceListener {

  /** for serialization */
  private static final long serialVersionUID = -6084967152645935934L;

  private final JLabel m_Count_Lab;
=======
/** 
 * A bean that counts instances streamed to it.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class InstanceCounter
  extends JPanel
  implements InstanceListener {

  /** for serialization */
  private static final long serialVersionUID = -6084967152645935934L;
  
  private JLabel m_Count_Lab;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private int m_Count;
  private boolean m_Debug;

  public void input(Instance instance) throws Exception {
<<<<<<< HEAD

    if (m_Debug) {
      System.err.println("InstanceCounter::input(" + instance + ")");
    }
    m_Count++;
    m_Count_Lab.setText("" + m_Count + " instances");
    repaint();
  }

  public void inputFormat(Instances instanceInfo) {

    if (m_Debug) {
      System.err.println("InstanceCounter::inputFormat()");
    }
    // Instances inputInstances = new Instances(instanceInfo,0); NOT USED
    m_Count = 0;
    m_Count_Lab.setText("" + m_Count + " instances");
  }

  public void setDebug(boolean debug) {

    m_Debug = debug;
  }

  public boolean getDebug() {

=======
    
    if (m_Debug) {
      System.err.println(Messages.getInstance().getString("InstanceCounter_Input_Error_Text_First") + instance +Messages.getInstance().getString("InstanceCounter_Input_Error_Text_Second"));
    }
    m_Count++;
    m_Count_Lab.setText(""+m_Count+Messages.getInstance().getString("InstanceCounter_Input_Count_Lab_SetText_Text_Second"));
    repaint();
  }
  
  public void inputFormat(Instances instanceInfo) {
    
    if (m_Debug) {
      System.err.println(Messages.getInstance().getString("InstanceCounter_InputFormat_Error_Text_First"));
    }
    Instances inputInstances = new Instances(instanceInfo,0);
    m_Count = 0;
    m_Count_Lab.setText(""+m_Count+Messages.getInstance().getString("InstanceCounter_InputFormat_Count_Lab_SetText_Text_Second"));
  }

  public void setDebug(boolean debug) {
    
    m_Debug = debug;
  }
  
  public boolean getDebug() {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_Debug;
  }

  public InstanceCounter() {
<<<<<<< HEAD

    m_Count = 0;
    m_Count_Lab = new JLabel("no instances");
    add(m_Count_Lab);
    // setSize(60,40);
    setBackground(Color.lightGray);
  }

  @Override
  public void instanceProduced(InstanceEvent e) {

    Object source = e.getSource();
    if (source instanceof InstanceProducer) {
      try {
        InstanceProducer a = (InstanceProducer) source;
        switch (e.getID()) {
        case InstanceEvent.FORMAT_AVAILABLE:
          inputFormat(a.outputFormat());
          break;
        case InstanceEvent.INSTANCE_AVAILABLE:
          input(a.outputPeek());
          break;
        case InstanceEvent.BATCH_FINISHED:
          if (m_Debug) {
            System.err
              .println("InstanceCounter::instanceProduced() - End of instance batch");
          }
          break;
        default:
          System.err
            .println("InstanceCounter::instanceProduced() - unknown event type");
          break;
        }
      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    } else {
      System.err
        .println("InstanceCounter::instanceProduced() - Unknown source object type");
    }
  }
}
=======
    
    m_Count = 0;
    m_Count_Lab = new JLabel(Messages.getInstance().getString("InstanceCounter_Count_Lab_JLabel_Text"));
    add(m_Count_Lab);
    //    setSize(60,40);
    setBackground(Color.lightGray);
  }

  public void instanceProduced(InstanceEvent e) {
    
    Object source = e.getSource();
    if (source instanceof InstanceProducer) { 
      try {
	InstanceProducer a = (InstanceProducer) source;
	switch (e.getID()) {
	case InstanceEvent.FORMAT_AVAILABLE:
	  inputFormat(a.outputFormat());
	  break;
	case InstanceEvent.INSTANCE_AVAILABLE:
	  input(a.outputPeek());
	  break;
	case InstanceEvent.BATCH_FINISHED:
	  if (m_Debug)
	    System.err.println(Messages.getInstance().getString("InstanceCounter_InstanceProduced_InstanceEventBATCH_FINISHED_Error_Text"));
	  break;
	default:
	  System.err.println(Messages.getInstance().getString("InstanceCounter_InstanceProduced_InstanceEventDEFAULT_Error_Text"));
	  break;
	}
      } catch (Exception ex) {
	System.err.println(ex.getMessage());
      }
    } else {
      System.err.println(Messages.getInstance().getString("InstanceCounter_InstanceProduced_Error_Text"));
    }
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
