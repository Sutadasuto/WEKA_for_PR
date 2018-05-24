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
 *    FilterCustomizer.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
import weka.filters.Filter;
import weka.gui.GenericObjectEditor;
import weka.gui.PropertySheetPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Customizer;
import java.beans.PropertyChangeEvent;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.BorderFactory;
import javax.swing.JButton;
<<<<<<< HEAD
import javax.swing.JPanel;

import weka.gui.GenericObjectEditor;
import weka.gui.PropertySheetPanel;

/**
 * GUI customizer for the filter bean
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 9467 $
 */
public class FilterCustomizer extends JPanel implements BeanCustomizer,
    CustomizerCloseRequester {

  /** for serialization */
  private static final long serialVersionUID = 2049895469240109738L;

  static {
    GenericObjectEditor.registerEditors();
  }

  private final PropertyChangeSupport m_pcSupport = new PropertyChangeSupport(
      this);

  private weka.gui.beans.Filter m_filter;
  /*
   * private GenericObjectEditor m_filterEditor = new GenericObjectEditor(true);
   */

  /** Backup if user presses cancel */
  private weka.filters.Filter m_backup;

  private final PropertySheetPanel m_filterEditor = new PropertySheetPanel();

  private Window m_parentWindow;

  private ModifyListener m_modifyListener;

  public FilterCustomizer() {
    m_filterEditor
        .setBorder(BorderFactory.createTitledBorder("Filter options"));
=======
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GUI customizer for the filter bean
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 7059 $
 */
public class FilterCustomizer
  extends JPanel
  implements Customizer, CustomizerCloseRequester {

  /** for serialization */
  private static final long serialVersionUID = 2049895469240109738L;
  
  static {
     GenericObjectEditor.registerEditors();
  }

  private PropertyChangeSupport m_pcSupport = 
    new PropertyChangeSupport(this);

  private weka.gui.beans.Filter m_filter;
/*  private GenericObjectEditor m_filterEditor = 
    new GenericObjectEditor(true); */
  
  /** Backup if user presses cancel */
  private weka.filters.Filter m_backup;
  
  private PropertySheetPanel m_filterEditor = 
    new PropertySheetPanel();
  
  private JFrame m_parentFrame;
 
  public FilterCustomizer() {
    m_filterEditor.
    setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("FilterCustomizer_FilterEditor_SetBorder_BorderFactory_CreateTitledBorder_Text")));


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    setLayout(new BorderLayout());
    add(m_filterEditor, BorderLayout.CENTER);

    JPanel butHolder = new JPanel();
<<<<<<< HEAD
    butHolder.setLayout(new GridLayout(1, 2));
    JButton OKBut = new JButton("OK");
    OKBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Tell the editor that we are closing under an OK condition
        // so that it can pass on the message to any customizer that
        // might be in use
        m_filterEditor.closingOK();

        if (m_modifyListener != null) {
          m_modifyListener.setModifiedStatus(FilterCustomizer.this, true);
        }

        m_parentWindow.dispose();
      }
    });

    JButton CancelBut = new JButton("Cancel");
    CancelBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Tell the editor that we are closing under a CANCEL condition
        // so that it can pass on the message to any customizer that
        // might be in use
        m_filterEditor.closingCancel();

=======
    butHolder.setLayout(new GridLayout(1,2));
    JButton OKBut = new JButton(Messages.getInstance().getString("FilterCustomizer_OKBut_JButton_Text"));
    OKBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_parentFrame.dispose();
      }
    });

    JButton CancelBut = new JButton(Messages.getInstance().getString("FilterCustomizer_CancelBut_JButton_Text"));
    CancelBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        // cancel requested, so revert to backup and then
        // close the dialog
        if (m_backup != null) {
          m_filter.setFilter(m_backup);
        }
<<<<<<< HEAD

        if (m_modifyListener != null) {
          m_modifyListener.setModifiedStatus(FilterCustomizer.this, false);
        }
        m_parentWindow.dispose();
      }
    });

=======
        m_parentFrame.dispose();
      }
    });
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    butHolder.add(OKBut);
    butHolder.add(CancelBut);
    add(butHolder, BorderLayout.SOUTH);
  }
<<<<<<< HEAD

  /**
   * Set the filter bean to be edited
   * 
   * @param object a Filter bean
   */
  @Override
  public void setObject(Object object) {
    m_filter = (weka.gui.beans.Filter) object;
    try {
      m_backup = (weka.filters.Filter) GenericObjectEditor.makeCopy(m_filter
          .getFilter());
=======
  
  /**
   * Set the filter bean to be edited
   *
   * @param object a Filter bean
   */
  public void setObject(Object object) {
    m_filter = (weka.gui.beans.Filter)object;
    try {
      m_backup = 
        (weka.filters.Filter)GenericObjectEditor.makeCopy(m_filter.getFilter());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } catch (Exception ex) {
      // ignore
    }
    m_filterEditor.setTarget(m_filter.getFilter());
  }

  /**
   * Add a property change listener
<<<<<<< HEAD
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
=======
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.addPropertyChangeListener(pcl);
  }

  /**
   * Remove a property change listener
<<<<<<< HEAD
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
=======
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }

<<<<<<< HEAD
  @Override
  public void setParentWindow(Window parent) {
    m_parentWindow = parent;
  }

  @Override
  public void setModifiedListener(ModifyListener l) {
    m_modifyListener = l;
  }
}
=======
  public void setParentFrame(JFrame parent) {
    m_parentFrame = parent;
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
