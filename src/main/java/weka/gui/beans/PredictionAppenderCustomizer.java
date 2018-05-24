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
 *    PredictionAppenderCustomizer.java
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

import weka.gui.PropertySheetPanel;

<<<<<<< HEAD
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

=======
import java.awt.BorderLayout;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.JPanel;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * GUI Customizer for the prediction appender bean
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
<<<<<<< HEAD
 * @version $Revision: 12107 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

public class PredictionAppenderCustomizer
  extends JPanel
<<<<<<< HEAD
  implements BeanCustomizer, CustomizerCloseRequester, 
  CustomizerClosingListener {
=======
  implements Customizer {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 6884933202506331888L;

  private PropertyChangeSupport m_pcSupport = 
    new PropertyChangeSupport(this);
  
  private PropertySheetPanel m_paEditor = 
    new PropertySheetPanel();
<<<<<<< HEAD
  
  private PredictionAppender m_appender;
  private boolean m_appendProbsBackup;
  
  private ModifyListener m_modifyListener;
  private Window m_parent;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  public PredictionAppenderCustomizer() {
    setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

    setLayout(new BorderLayout());
    add(m_paEditor, BorderLayout.CENTER);
<<<<<<< HEAD
    add(new javax.swing.JLabel("PredcitionAppenderCustomizer"), 
	BorderLayout.NORTH);
    addButtons();
  }
  
  private void addButtons() {
    JButton okBut = new JButton("OK");
    JButton cancelBut = new JButton("Cancel");
    
    JPanel butHolder = new JPanel();
    butHolder.setLayout(new GridLayout(1, 2));
    butHolder.add(okBut); butHolder.add(cancelBut);
    add(butHolder, BorderLayout.SOUTH);
    
    okBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_modifyListener.setModifiedStatus(PredictionAppenderCustomizer.this, true);
        if (m_parent != null) {
          m_parent.dispose();
        }
      }
    });
    
    cancelBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        customizerClosing();
        if (m_parent != null) {
          m_parent.dispose();
        }
      }
    });
=======
    add(new javax.swing.JLabel(Messages.getInstance().getString("PredictionAppenderCustomizer_JLabel_Text")), 
	BorderLayout.NORTH);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Set the object to be edited
   *
   * @param object a PredictionAppender object
   */
  public void setObject(Object object) {
<<<<<<< HEAD
    m_appender = ((PredictionAppender)object);
    m_paEditor.setTarget(m_appender);
    m_appendProbsBackup = m_appender.getAppendPredictedProbabilities();
=======
    m_paEditor.setTarget((PredictionAppender)object);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Add a property change listener
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.addPropertyChangeListener(pcl);
  }
  
  /**
   * Remove a property change listener
   *
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }
<<<<<<< HEAD

  @Override
  public void setModifiedListener(ModifyListener l) {
    m_modifyListener = l;
  }

  @Override
  public void setParentWindow(Window parent) {
    m_parent = parent;
  }

  @Override
  public void customizerClosing() {
    // restore the backup value
    m_appender.setAppendPredictedProbabilities(m_appendProbsBackup);
  }
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
}
