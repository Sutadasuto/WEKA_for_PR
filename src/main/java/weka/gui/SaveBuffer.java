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
 *    SaveBuffer.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
<<<<<<< HEAD
=======
=======
import weka.gui.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.awt.Component;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * This class handles the saving of StringBuffers to files. It will pop
 * up a file chooser allowing the user to select a destination file. If
 * the file exists, the user is prompted for the correct course of action,
 * ie. overwriting, appending, selecting a new filename or canceling.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision 1.0 $
 */
public class SaveBuffer {

  /** The Logger to send messages to */
  private Logger m_Log;

  /** The parent component requesting the save */
  private Component m_parentComponent;

  /** Last directory selected from the file chooser */
  private String m_lastvisitedDirectory=null;

  /**
   * Constructor
   * @param log the logger to send messages to
   * @param parent the parent component will be requesting a save
   */
  public SaveBuffer(Logger log, Component parent) {
    m_Log = log;
    m_parentComponent = parent;
  }

  /**
   * Save a buffer
   * @param buf the buffer to save
   * @return true if the save is completed succesfully
   */
  public boolean save(StringBuffer buf) {
    if (buf != null) {
      JFileChooser fileChooser;
      if (m_lastvisitedDirectory == null) {
	fileChooser = new JFileChooser(
		      new File(System.getProperty("user.dir")));
      } else {
	fileChooser = new JFileChooser(m_lastvisitedDirectory);
      }

      fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
      int returnVal = fileChooser.showSaveDialog(m_parentComponent);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
	File sFile = fileChooser.getSelectedFile();
	m_lastvisitedDirectory = sFile.getPath();

	if (sFile.exists()) {
	  Object [] options = new String[4];
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	  options[0] = "Append";
	  options[1] = "Overwrite";
	  options[2] = "Choose new name";
	  options[3] = "Cancel";
	
	  JOptionPane jop = new JOptionPane("File exists",
<<<<<<< HEAD
=======
=======
	  options[0] = Messages.getInstance().getString("SaveBuffer_Save_Options_0_Text");
	  options[1] = Messages.getInstance().getString("SaveBuffer_Save_Options_1_Text");
	  options[2] = Messages.getInstance().getString("SaveBuffer_Save_Options_2_Text");
	  options[3] = Messages.getInstance().getString("SaveBuffer_Save_Options_3_Text");
	
	  JOptionPane jop = new JOptionPane(Messages.getInstance().getString("SaveBuffer_Save_JOptionPane_Text"),
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
					     JOptionPane.QUESTION_MESSAGE,
					    1,
					    null,
					    options);
<<<<<<< HEAD
	  JDialog dialog = jop.createDialog(m_parentComponent, "File query");
=======
<<<<<<< HEAD
	  JDialog dialog = jop.createDialog(m_parentComponent, "File query");
=======
	  JDialog dialog = jop.createDialog(m_parentComponent, Messages.getInstance().getString("SaveBuffer_Save_Dialog_JopCreateDialog_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	  dialog.setVisible(true);
	  Object selectedValue = jop.getValue();
	  if (selectedValue == null) {
	  } else {
	    for(int i=0; i<4; i++) {
	      if(options[i].equals(selectedValue)) {
		switch (i) {
		  // append
		case 0:
		  return saveOverwriteAppend(buf, sFile, true);
		  // overwrite
		case 1: 
		  return saveOverwriteAppend(buf, sFile, false);
		  // pick new name
		case 2:
		  return save(buf);
		  // cancel
		case 3: break;
		}
	      }
	    }
	  }
	} else {
	  saveOverwriteAppend(buf, sFile, false); // file does not exist
	}
      } else {
	return false; // file save canceled
      }
    }
    return false; // buffer null
  }

  /** 
   * Saves the provided buffer to the specified file
   * @param buf the buffer to save
   * @param sFile the file to save to
   * @param append true if buffer is to be appended to file
   * @return true if save is succesful
   */
  private boolean saveOverwriteAppend(StringBuffer buf, 
				      File sFile,
				      boolean append) {

    try {
      String path = sFile.getPath();
      if (m_Log != null) {
	if (append) {
<<<<<<< HEAD
	  m_Log.statusMessage("Appending to file...");
	} else {
	  m_Log.statusMessage("Saving to file...");
=======
<<<<<<< HEAD
	  m_Log.statusMessage("Appending to file...");
	} else {
	  m_Log.statusMessage("Saving to file...");
=======
	  m_Log.statusMessage(Messages.getInstance().getString("SaveBuffer_SaveOverwriteAppend_Log_StatusMessage_Text_First"));
	} else {
	  m_Log.statusMessage(Messages.getInstance().getString("SaveBuffer_SaveOverwriteAppend_Log_StatusMessage_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	}
      }
      PrintWriter out
	= new PrintWriter(new BufferedWriter(
			  new FileWriter(path, append)));
      out.write(buf.toString(),0,buf.toString().length());
      out.close();
      if (m_Log != null) {
<<<<<<< HEAD
	m_Log.statusMessage("OK");
=======
<<<<<<< HEAD
	m_Log.statusMessage("OK");
=======
	m_Log.statusMessage(Messages.getInstance().getString("SaveBuffer_SaveOverwriteAppend_Log_StatusMessage_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      if (m_Log != null) {
	m_Log.logMessage(ex.getMessage());
      }
      return false;
    }

    return true;
  }

  /**
   * Main method for testing this class
   */
  public static void main(String [] args) {
     try {
       final javax.swing.JFrame jf =
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	 new javax.swing.JFrame("SaveBuffer test");
      jf.getContentPane().setLayout(new java.awt.BorderLayout());
      weka.gui.LogPanel lp = new weka.gui.LogPanel();
      javax.swing.JButton jb = new javax.swing.JButton("Save");
<<<<<<< HEAD
=======
=======
	 new javax.swing.JFrame(Messages.getInstance().getString("SaveBuffer_Main_JFrame_Text"));
      jf.getContentPane().setLayout(new java.awt.BorderLayout());
      weka.gui.LogPanel lp = new weka.gui.LogPanel();
      javax.swing.JButton jb = new javax.swing.JButton(Messages.getInstance().getString("SaveBuffer_Main_Jb_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().add(jb,java.awt.BorderLayout.SOUTH);
      jf.getContentPane().add(lp, java.awt.BorderLayout.CENTER);
      final SaveBuffer svb = new SaveBuffer(lp, jf);
      jb.addActionListener(new java.awt.event.ActionListener() {
	  public void actionPerformed(java.awt.event.ActionEvent e) {
<<<<<<< HEAD
	    svb.save(new StringBuffer("A bit of test text"));
=======
<<<<<<< HEAD
	    svb.save(new StringBuffer("A bit of test text"));
=======
	    svb.save(new StringBuffer(Messages.getInstance().getString("SaveBuffer_Main_Svb_Save_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
	  }
	});

      jf.addWindowListener(new java.awt.event.WindowAdapter() {
	  public void windowClosing(java.awt.event.WindowEvent e) {
	    jf.dispose();
	    System.exit(0);
	  }
	});
      jf.pack();
      jf.setVisible(true);
     } catch (Exception ex) {
       ex.printStackTrace();
       System.err.println(ex.getMessage());
     }
  }
}
