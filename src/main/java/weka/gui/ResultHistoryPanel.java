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
 *    ResultHistoryPanel.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.gui;

import java.awt.*;
<<<<<<< HEAD
=======
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.gui;

import weka.gui.visualize.PrintableComponent;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Point;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.*;
<<<<<<< HEAD
=======
=======
import java.util.Hashtable;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.JTextComponent;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Utils;
import weka.gui.visualize.PrintableComponent;

/**
 * A component that accepts named stringbuffers and displays the name in a list
 * box. When a name is right-clicked, a frame is popped up that contains the
 * string held by the stringbuffer. Optionally a text component may be provided
 * that will have it's text set to the named result text on a left-click.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
public class ResultHistoryPanel extends JPanel {

  /** for serialization */
  static final long serialVersionUID = 4297069440135326829L;

<<<<<<< HEAD
=======
=======
/** 
 * A component that accepts named stringbuffers and displays the name in a list
 * box. When a name is right-clicked, a frame is popped up that contains
 * the string held by the stringbuffer. Optionally a text component may be
 * provided that will have it's text set to the named result text on a
 * left-click.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class ResultHistoryPanel
  extends JPanel {
  
  /** for serialization */
  static final long serialVersionUID = 4297069440135326829L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** An optional component for single-click display */
  protected JTextComponent m_SingleText;

  /** The named result being viewed in the single-click display */
  protected String m_SingleName;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The list model */
  protected DefaultListModel m_Model = new DefaultListModel();

  /** The list component */
  protected JList m_List = new JList(m_Model);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** A Hashtable mapping names to result buffers */
  protected Hashtable<String, StringBuffer> m_Results =
    new Hashtable<String, StringBuffer>();

  /** A Hashtable mapping names to output text components */
  protected Hashtable<String, JTextArea> m_FramedOutput =
    new Hashtable<String, JTextArea>();

  /** A hashtable mapping names to arbitrary objects */
  protected Hashtable<String, Object> m_Objs = new Hashtable<String, Object>();

  /**
   * Let the result history list handle right clicks in the default manner---ie,
   * pop up a window displaying the buffer
   */
<<<<<<< HEAD
=======
=======
  
  /** A Hashtable mapping names to result buffers */
  protected Hashtable m_Results = new Hashtable();

  /** A Hashtable mapping names to output text components */
  protected Hashtable m_FramedOutput = new Hashtable();

  /** A hashtable mapping names to arbitrary objects */
  protected Hashtable m_Objs = new Hashtable();

  /** Let the result history list handle right clicks in the default
      manner---ie, pop up a window displaying the buffer */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected boolean m_HandleRightClicks = true;

  /** for printing the output to files */
  protected PrintableComponent m_Printer = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Something listening for list deletions */
  protected transient RDeleteListener m_deleteListener;

  /**
   * Extension of MouseAdapter that implements Serializable.
   */
  public static class RMouseAdapter extends MouseAdapter implements
    Serializable {

    /** for serialization */
    static final long serialVersionUID = -8991922650552358669L;
  }

  /**
   * Extension of KeyAdapter that implements Serializable.
   */
  public static class RKeyAdapter extends KeyAdapter implements Serializable {

<<<<<<< HEAD
=======
=======
  
  /**
   * Extension of MouseAdapter that implements Serializable.
   */
  public static class RMouseAdapter 
    extends MouseAdapter implements Serializable {
    
    /** for serialization */
    static final long serialVersionUID = -8991922650552358669L;    
  }
 
  
  /**
   * Extension of KeyAdapter that implements Serializable.
   */
  public static class RKeyAdapter 
    extends KeyAdapter implements Serializable {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /** for serialization */
    static final long serialVersionUID = -8675332541861828079L;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Interface for something to be notified when an entry in the list is deleted
   */
  public static interface RDeleteListener {

    /**
     * Called when an entry in the list is deleted
     *
     * @param name the name of the entry deleted
     * @param index the index of the entry deleted
     */
    void entryDeleted(String name, int index);

    /**
     * @param names
     * @param indexes
     */
    void entriesDeleted(List<String> names, List<Integer> indexes);
  }

  /**
   * Create the result history object
   * 
<<<<<<< HEAD
=======
=======
   * Create the result history object
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param text the optional text component for single-click display
   */
  public ResultHistoryPanel(JTextComponent text) {
    m_SingleText = text;
    if (text != null) {
      m_Printer = new PrintableComponent(m_SingleText);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    //m_List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    m_List.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    m_List.addMouseListener(new RMouseAdapter() {
      private static final long serialVersionUID = -9015397020486290479L;

      @Override
      public void mouseClicked(MouseEvent e) {
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
//          if (((e.getModifiers() & InputEvent.SHIFT_DOWN_MASK) == 0)
//            && ((e.getModifiers() & InputEvent.CTRL_DOWN_MASK) == 0)) {
//            int index = m_List.locationToIndex(e.getPoint());
//            if ((index != -1) && (m_SingleText != null)) {
//              setSingle((String) m_Model.elementAt(index));
//            }
//          }
        } else {
          // if there are stored objects then assume that the storer
          // will handle popping up the text in a separate frame
          if (m_HandleRightClicks) {
            int index = m_List.locationToIndex(e.getPoint());
            if (index != -1) {
              String name = (String) m_Model.elementAt(index);
              openFrame(name);
            }
          }
        }
<<<<<<< HEAD
=======
=======
    m_List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    m_List.addMouseListener(new RMouseAdapter() {
      private static final long serialVersionUID = -9015397020486290479L;
      
      public void mouseClicked(MouseEvent e) {
	if ((e.getModifiers() & InputEvent.BUTTON1_MASK)
	    == InputEvent.BUTTON1_MASK) {
            if (    ((e.getModifiers() & InputEvent.SHIFT_DOWN_MASK) == 0)
                 && ((e.getModifiers() & InputEvent.CTRL_DOWN_MASK) == 0) ) {
              int index = m_List.locationToIndex(e.getPoint());
              if ((index != -1) && (m_SingleText != null)) {
                setSingle((String)m_Model.elementAt(index));
            }
          }
	} else {
	  // if there are stored objects then assume that the storer
	  // will handle popping up the text in a seperate frame
	  if (m_HandleRightClicks) {
	    int index = m_List.locationToIndex(e.getPoint());
	    if (index != -1) {
	      String name = (String)m_Model.elementAt(index);
	      openFrame(name);
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    });

    m_List.addKeyListener(new RKeyAdapter() {
      private static final long serialVersionUID = 7910681776999302344L;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      @Override
      public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
          removeResults(m_List.getSelectedIndices());

//          int selected = m_List.getSelectedIndex();
//          if (selected != -1) {
//            String element = m_Model.elementAt(selected).toString();
//            removeResult(element);
//            if (m_deleteListener != null) {
//              m_deleteListener.entryDeleted(element, selected);
//            }
//          }
        }
      }
    });
    m_List.getSelectionModel().addListSelectionListener(
      new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
          if (!e.getValueIsAdjusting()) {
            if (m_List.getSelectedIndices().length <= 1) {
              ListSelectionModel lm = (ListSelectionModel) e.getSource();
              for (int i = e.getFirstIndex(); i <= e.getLastIndex(); i++) {
                if (lm.isSelectedIndex(i)) {
                  // m_AttSummaryPanel.setAttribute(i);
                  if ((i != -1) && (m_SingleText != null)) {
                    setSingle((String) m_Model.elementAt(i));
                  }
                  break;
                }
              }
            }
          }
        }
      });

    setLayout(new BorderLayout());
    // setBorder(BorderFactory.createTitledBorder("Result history"));
    final JScrollPane js = new JScrollPane(m_List);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;

      @Override
      public void stateChanged(ChangeEvent e) {
        JViewport vp = (JViewport) e.getSource();
        int h = vp.getViewSize().height;
        if (h != lastHeight) { // i.e. an addition not just a user scrolling
          lastHeight = h;
          int x = h - vp.getExtentSize().height;
          vp.setViewPosition(new Point(0, x));
        }
<<<<<<< HEAD
=======
=======
      
      public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
          int selected = m_List.getSelectedIndex();
          if (selected != -1) {
            removeResult((String)m_Model.elementAt(selected));
          }
        }
      }
    });
    m_List.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
	if (!e.getValueIsAdjusting()) {
	  ListSelectionModel lm = (ListSelectionModel) e.getSource();
	  for (int i = e.getFirstIndex(); i <= e.getLastIndex(); i++) {
	    if (lm.isSelectedIndex(i)) {
	      //m_AttSummaryPanel.setAttribute(i);
	       if ((i != -1) && (m_SingleText != null)) {
		 setSingle((String)m_Model.elementAt(i));
	       }
	      break;
	    }
	  }
	}
      }
    });


    setLayout(new BorderLayout());
    //    setBorder(BorderFactory.createTitledBorder("Result history"));
    final JScrollPane js = new JScrollPane(m_List);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;
      public void stateChanged(ChangeEvent e) {
	JViewport vp = (JViewport)e.getSource();
	int h = vp.getViewSize().height; 
	if (h != lastHeight) { // i.e. an addition not just a user scrolling
	  lastHeight = h;
	  int x = h - vp.getExtentSize().height;
	  vp.setViewPosition(new Point(0, x));
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    });
    add(js, BorderLayout.CENTER);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set a listener for deletions from the list
   *
   * @param listener the listener to set
   */
  public void setDeleteListener(RDeleteListener listener) {
    m_deleteListener = listener;
  }

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Adds a new result to the result list.
   *
   * @param name the name to associate with the result
   * @param result the StringBuffer that contains the result text
   */
  public void addResult(String name, StringBuffer result) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String nameCopy = name;
    int i = 0;
    while (m_Results.containsKey(nameCopy)) {
      nameCopy = name + "_" + i++;
    }

    m_Model.addElement(nameCopy);
    m_Results.put(nameCopy, result);
  }

  /**
   * Remove the entries at the specified indices in the list
   *
   * @param selectedI the entries to remove
   */
  public void removeResults(int[] selectedI) {
    if (selectedI != null && selectedI.length > 0) {
      List<String> elsToDelete = new ArrayList<String>();
      for (int i : selectedI) {
        elsToDelete.add(m_Model.elementAt(i).toString());
      }
      removeResults(elsToDelete);
    }
  }

  /**
   * Remove the specified entries from the list
   *
   * @param entries the entries to remove
   */
  public void removeResults(List<String> entries) {
    for (String el : entries) {
      removeResult(el);
    }
<<<<<<< HEAD
=======
=======
    
    m_Model.addElement(name);
    m_Results.put(name, result);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Removes one of the result buffers from the history. Any windows currently
   * displaying the contents of the buffer are not affected.
   *
   * @param name the name of the buffer to remove.
   */
  public void removeResult(String name) {

<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
=======
<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
=======
    StringBuffer buff = (StringBuffer) m_Results.get(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (buff != null) {
      m_Results.remove(name);
      m_Model.removeElement(name);
      m_Objs.remove(name);
      System.gc();
<<<<<<< HEAD
    }
=======
<<<<<<< HEAD
    }
=======
    } 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Removes all of the result buffers from the history. Any windows currently
   * displaying the contents of the buffer are not affected.
   */
  public void clearResults() {
    m_Results.clear();
    m_Model.clear();
    m_Objs.clear();
    System.gc();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Adds an object to the results list. If an object with the same
   * name already exists, then a number is appended to the end of the name
   * to make it unique.
   *
<<<<<<< HEAD
=======
=======
   * Adds an object to the results list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param name the name to associate with the object
   * @param o the object
   */
  public void addObject(String name, Object o) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String nameCopy = name;
    int i = 0;
    while (m_Objs.containsKey(nameCopy)) {
      nameCopy = name + "_" + i++;
    }

    m_Objs.put(nameCopy, o);
  }

  /**
   * Adds an object to the result list. Overwrites any exsiting
   * object with the same name
   * 
   * @param name the name to associate with the object
   * @param o the object
   */
  public void addOrOverwriteObject(String name, Object o) {
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Objs.put(name, o);
  }

  /**
   * Get the named object from the list
<<<<<<< HEAD
   * 
   * @param name the name of the item to retrieve the stored object for
=======
<<<<<<< HEAD
   * 
   * @param name the name of the item to retrieve the stored object for
=======
   * @param name the name of the item to retrieve the stored object
   * for
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the object or null if there is no object at this index
   */
  public Object getNamedObject(String name) {
    Object v = null;
    v = m_Objs.get(name);
    return v;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the object associated with the currently selected item in the list.
   * 
   * @return the object or null if there is no object corresponding to the
   *         current selection in the list
<<<<<<< HEAD
=======
=======
   * Gets the object associated with the currently
   * selected item in the list.
   * @return the object or null if there is no
   * object corresponding to the current selection in
   * the list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Object getSelectedObject() {
    Object v = null;
    int index = m_List.getSelectedIndex();
    if (index != -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      String name = (String) (m_Model.elementAt(index));
      v = m_Objs.get(name);
    }

<<<<<<< HEAD
=======
=======
      String name = (String)(m_Model.elementAt(index));
      v = m_Objs.get(name);
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return v;
  }

  /**
   * Gets the named buffer
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the buffer or null if there are no items in the list
   */
  public StringBuffer getNamedBuffer(String name) {
    StringBuffer b = null;
    b = (m_Results.get(name));
<<<<<<< HEAD
=======
=======
   * @return the buffer or null if there are no items in
   * the list
   */
  public StringBuffer getNamedBuffer(String name) {
    StringBuffer b = null;
    b = (StringBuffer)(m_Results.get(name));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return b;
  }

  /**
<<<<<<< HEAD
   * Gets the buffer associated with the currently selected item in the list.
   * 
   * @return the buffer or null if there are no items in the list
=======
<<<<<<< HEAD
   * Gets the buffer associated with the currently selected item in the list.
   * 
   * @return the buffer or null if there are no items in the list
=======
   * Gets the buffer associated with the currently
   * selected item in the list.
   * @return the buffer or null if there are no items in
   * the list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public StringBuffer getSelectedBuffer() {
    StringBuffer b = null;
    int index = m_List.getSelectedIndex();
    if (index != -1) {
<<<<<<< HEAD
      String name = (String) (m_Model.elementAt(index));
      b = (m_Results.get(name));
=======
<<<<<<< HEAD
      String name = (String) (m_Model.elementAt(index));
      b = (m_Results.get(name));
=======
      String name = (String)(m_Model.elementAt(index));
      b = (StringBuffer)(m_Results.get(name));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return b;
  }

  /**
   * Get the name of the currently selected item in the list
<<<<<<< HEAD
   * 
   * @return the name of the currently selected item or null if no item selected
=======
<<<<<<< HEAD
   * 
   * @return the name of the currently selected item or null if no item selected
=======
   * @return the name of the currently selected item or null if no
   * item selected
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getSelectedName() {
    int index = m_List.getSelectedIndex();
    if (index != -1) {
<<<<<<< HEAD
      return (String) (m_Model.elementAt(index));
=======
<<<<<<< HEAD
      return (String) (m_Model.elementAt(index));
=======
      return (String)(m_Model.elementAt(index));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return null;
  }

  /**
   * Gets the name of theitem in the list at the specified index
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the name of item or null if there is no item at that index
   */
  public String getNameAtIndex(int index) {
    if (index != -1) {
<<<<<<< HEAD
      return (String) (m_Model.elementAt(index));
=======
<<<<<<< HEAD
      return (String) (m_Model.elementAt(index));
=======
      return (String)(m_Model.elementAt(index));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return null;
  }

  /**
   * Sets the single-click display to view the named result.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param name the name of the result to display.
   */
  public void setSingle(String name) {

<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
=======
<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
=======
    StringBuffer buff = (StringBuffer) m_Results.get(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (buff != null) {
      m_SingleName = name;
      m_SingleText.setText(buff.toString());
      m_List.setSelectedValue(name, true);
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Set the selected list entry. Note, does not update the single click display
   * to the corresponding named result - use setSingle() to set the selected
   * list entry and view the corresponding result
   *
   * @param name the name of the list entry to be selected
   */
  public void setSelectedListValue(String name) {
    m_List.setSelectedValue(name, true);
  }

  /**
   * Opens the named result in a separate frame.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Opens the named result in a separate frame.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param name the name of the result to open.
   */
  public void openFrame(String name) {

<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
    JTextComponent currentText = m_FramedOutput.get(name);
=======
<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
    JTextComponent currentText = m_FramedOutput.get(name);
=======
    StringBuffer buff = (StringBuffer) m_Results.get(name);
    JTextComponent currentText = (JTextComponent) m_FramedOutput.get(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if ((buff != null) && (currentText == null)) {
      // Open the frame.
      JTextArea ta = new JTextArea();
      ta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      ta.setFont(new Font("Monospaced", Font.PLAIN, 12));
      ta.setEditable(false);
      ta.setText(buff.toString());
      m_FramedOutput.put(name, ta);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      final JFrame jf = Utils.getWekaJFrame(name, this);
      jf.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
          m_FramedOutput.remove(jf.getTitle());
          jf.dispose();
        }
<<<<<<< HEAD
=======
=======
      final JFrame jf = new JFrame(name);
      jf.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	  m_FramedOutput.remove(jf.getTitle());
	  jf.dispose();
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add(new JScrollPane(ta), BorderLayout.CENTER);
      jf.pack();
<<<<<<< HEAD
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
<<<<<<< HEAD
      jf.setSize(800, 600);
      jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
=======
      jf.setSize(450, 350);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setVisible(true);
    }
  }

  /**
<<<<<<< HEAD
   * Tells any component currently displaying the named result that the contents
   * of the result text in the StringBuffer have been updated.
   * 
=======
<<<<<<< HEAD
   * Tells any component currently displaying the named result that the contents
   * of the result text in the StringBuffer have been updated.
   * 
=======
   * Tells any component currently displaying the named result that the
   * contents of the result text in the StringBuffer have been updated.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param name the name of the result that has been updated.
   */
  public void updateResult(String name) {

<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
=======
<<<<<<< HEAD
    StringBuffer buff = m_Results.get(name);
=======
    StringBuffer buff = (StringBuffer) m_Results.get(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (buff == null) {
      return;
    }
    if (m_SingleName == name) {
      m_SingleText.setText(buff.toString());
    }
<<<<<<< HEAD
    JTextComponent currentText = m_FramedOutput.get(name);
=======
<<<<<<< HEAD
    JTextComponent currentText = m_FramedOutput.get(name);
=======
    JTextComponent currentText = (JTextComponent) m_FramedOutput.get(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (currentText != null) {
      currentText.setText(buff.toString());
    }
  }

  /**
   * Gets the selection model used by the results list.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a value of type 'ListSelectionModel'
   */
  public ListSelectionModel getSelectionModel() {

<<<<<<< HEAD
=======
=======
   *
   * @return a value of type 'ListSelectionModel'
   */
  public ListSelectionModel getSelectionModel() {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_List.getSelectionModel();
  }

  /**
   * Gets the JList used by the results list
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the JList
   */
  public JList getList() {
    return m_List;
  }

  /**
<<<<<<< HEAD
   * Set whether the result history list should handle right clicks or whether
   * the parent object will handle them.
   * 
=======
<<<<<<< HEAD
   * Set whether the result history list should handle right clicks or whether
   * the parent object will handle them.
   * 
=======
   * Set whether the result history list should handle right clicks
   * or whether the parent object will handle them.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param tf false if parent object will handle right clicks
   */
  public void setHandleRightClicks(boolean tf) {
    m_HandleRightClicks = tf;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Set the background color for this component and the list
   *
   * @param c the background color to use
   */
  @Override
  public void setBackground(Color c) {
    super.setBackground(c);
    if (m_List != null) {
      m_List.setBackground(c);
    }
  }

  /**
   * Set the font to use in the list
   *
   * @param f the font to use
   */
  @Override
  public void setFont(Font f) {
    super.setFont(f);
    if (m_List != null) {
      m_List.setFont(f);
    }
  }

  /**
   * Tests out the result history from the command line.
   * 
   * @param args ignored
   */
  public static void main(String[] args) {

    try {
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Classifier");
      jf.getContentPane().setLayout(new BorderLayout());
      final ResultHistoryPanel jd = new ResultHistoryPanel(null);
      jd.addResult("blah", new StringBuffer("Nothing to see here"));
      jd.addResult("blah1", new StringBuffer("Nothing to see here1"));
      jd.addResult("blah2", new StringBuffer("Nothing to see here2"));
      jd.addResult("blah3", new StringBuffer("Nothing to see here3"));
      jf.getContentPane().add(jd, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
<<<<<<< HEAD
=======
=======

  /**
   * Tests out the result history from the command line.
   *
   * @param args ignored
   */
  public static void main(String [] args) {

    try {
      final javax.swing.JFrame jf =
	new javax.swing.JFrame(Messages.getInstance().getString("ResultHistoryPanel_Main_JFrame_Text"));
      jf.getContentPane().setLayout(new BorderLayout());
      final ResultHistoryPanel jd = new ResultHistoryPanel(null);
      jd.addResult(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_First"), new StringBuffer(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Second")));
      jd.addResult(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Third"), new StringBuffer(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Fourth")));
      jd.addResult(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Fifth"), new StringBuffer(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Sixth")));
      jd.addResult(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Seventh"), new StringBuffer(Messages.getInstance().getString("ResultHistoryPanel_Main_Jd_JFrame_AddResult_Text_Eighth")));
      jf.getContentPane().add(jd, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
	public void windowClosing(java.awt.event.WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
      jf.pack();
      jf.setVisible(true);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
