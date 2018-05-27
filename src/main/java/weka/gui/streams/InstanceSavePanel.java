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
 *    InstanceSavePanel.java
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
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.io.FileOutputStream;
import java.io.PrintWriter;

<<<<<<< HEAD
import weka.core.Instance;
import weka.core.Instances;

=======
<<<<<<< HEAD
import weka.core.Instance;
import weka.core.Instances;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/** 
 * A bean that saves a stream of instances to a file.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class InstanceSavePanel
  extends Panel
  implements InstanceListener {

  /** for serialization */
  private static final long serialVersionUID = -6061005366989295026L;
  
  private Label count_Lab;
  private int m_Count;
  private TextField arffFile_Tex;
  private boolean b_Debug;
  private PrintWriter outputWriter;

  public void input(Instance instance) throws Exception {
    
    if (b_Debug)
<<<<<<< HEAD
      System.err.println("InstanceSavePanel::input(" + instance +")");
    m_Count++;
    count_Lab.setText(""+m_Count+" instances");
=======
<<<<<<< HEAD
      System.err.println("InstanceSavePanel::input(" + instance +")");
    m_Count++;
    count_Lab.setText(""+m_Count+" instances");
=======
      System.err.println(Messages.getInstance().getString("InstanceSavePanel_Input_Error_Text_First") + instance + Messages.getInstance().getString("InstanceSavePanel_Input_Error_Text_Second"));
    m_Count++;
    count_Lab.setText(""+m_Count+Messages.getInstance().getString("InstanceSavePanel_Input_Count_Lab_SetText_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (outputWriter != null)
      outputWriter.println(instance.toString());      
  }
  
  public void inputFormat(Instances instanceInfo) {
    
    if (b_Debug)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.println("InstanceSavePanel::inputFormat()\n"
			 +instanceInfo.toString());
    m_Count = 0;
    count_Lab.setText(""+m_Count+" instances");
<<<<<<< HEAD
=======
=======
      System.err.println(Messages.getInstance().getString("InstanceSavePanel::inputFormat()\n") + instanceInfo.toString());
    m_Count = 0;
    count_Lab.setText(""+m_Count+Messages.getInstance().getString("InstanceSavePanel_InputFormat_Count_Lab_SetText_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    try {
      outputWriter = new PrintWriter(new FileOutputStream(arffFile_Tex.getText()));
      outputWriter.println(instanceInfo.toString());
      if (b_Debug)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	System.err.println("InstanceSavePanel::inputFormat() - written header");
    } catch (Exception ex) {
      outputWriter = null;
      System.err.println("InstanceSavePanel::inputFormat(): "+ex.getMessage());
<<<<<<< HEAD
=======
=======
	System.err.println(Messages.getInstance().getString("InstanceSavePanel_InputFormat_Error_Text_Second"));
    } catch (Exception ex) {
      outputWriter = null;
      System.err.println(Messages.getInstance().getString("InstanceSavePanel_InputFormat_Error_Text_Third") + ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  public void batchFinished() {
    
    if (b_Debug)
<<<<<<< HEAD
      System.err.println("InstanceSavePanel::batchFinished()");
=======
<<<<<<< HEAD
      System.err.println("InstanceSavePanel::batchFinished()");
=======
      System.err.println(Messages.getInstance().getString("InstanceSavePanel_BatchFinished_Error_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (outputWriter != null)
      outputWriter.close();
  }

  public InstanceSavePanel() {
    
    setLayout(new BorderLayout());
    arffFile_Tex = new TextField("arffoutput.arff");
    add("Center", arffFile_Tex);
<<<<<<< HEAD
    count_Lab = new Label("0 instances");
    add("East", count_Lab);
=======
<<<<<<< HEAD
    count_Lab = new Label("0 instances");
    add("East", count_Lab);
=======
    count_Lab = new Label(Messages.getInstance().getString("InstanceSavePanel_Count_Lab_Label_Text"));
    add(Messages.getInstance().getString("InstanceSavePanel_Count_Lab_Label_Add_Text"), count_Lab);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    //    setSize(60,40);
    setBackground(Color.lightGray);
  }

  public void setDebug(boolean debug) {
    b_Debug = debug;
  }
  
  public boolean getDebug() {
    return b_Debug;
  }

  public void setArffFile(String newArffFile) {
    arffFile_Tex.setText(newArffFile);
  }
  
  public String getArffFile() {
    return arffFile_Tex.getText();
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
	  batchFinished();
	  break;
	default:
<<<<<<< HEAD
	  System.err.println("InstanceSavePanel::instanceProduced() - unknown event type");
=======
<<<<<<< HEAD
	  System.err.println("InstanceSavePanel::instanceProduced() - unknown event type");
=======
	  System.err.println(Messages.getInstance().getString("InstanceSavePanel_InstanceProduced_InstanceProducerDEFAULT_Error_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	  break;
	}
      } catch (Exception ex) {
	System.err.println(ex.getMessage());
      }
    } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.println("InstanceSavePanel::instanceProduced() - Unknown source object type");
    }
  }
}

  
<<<<<<< HEAD
=======
=======
      System.err.println(Messages.getInstance().getString("InstanceSavePanel_InstanceProduced_Error_Text"));
    }
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
