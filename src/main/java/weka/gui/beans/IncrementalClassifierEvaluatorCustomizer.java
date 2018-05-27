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
 *    IncrementalClassifierEvaluatorCustomizer.java
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.JButton;
import javax.swing.JPanel;

import weka.gui.PropertySheetPanel;

/**
 * GUI Customizer for the incremental classifier evaluator bean
 * 
 * @author Mark Hall (mhall{[at}]pentaho{[dot]}org
 * @version $Revision: 10220 $
 */
public class IncrementalClassifierEvaluatorCustomizer extends JPanel implements
  BeanCustomizer, CustomizerCloseRequester, CustomizerClosingListener {

  /** Added ID to avoid warning */
  private static final long serialVersionUID = 443506897387629418L;

  /** for serialization */
  // private static final long serialVersionUID = 1229878140258668581L;

  private final PropertyChangeSupport m_pcSupport = new PropertyChangeSupport(
    this);

  private final PropertySheetPanel m_ieEditor = new PropertySheetPanel();

  private IncrementalClassifierEvaluator m_evaluator;
  private ModifyListener m_modifyListener;

  private Window m_parent;

  private int m_freqBackup;
  private boolean m_perClassBackup;
<<<<<<< HEAD
=======
=======
import weka.gui.PropertySheetPanel;

import java.awt.BorderLayout;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.JPanel;

/**
 * GUI Customizer for the incremental classifier evaluator bean
 *
 * @author Mark Hall (mhall{[at}]pentaho{[dot]}org
 * @version $Revision: 7059 $
 */
public class IncrementalClassifierEvaluatorCustomizer
  extends JPanel
  implements Customizer {

  /** for serialization */
  //  private static final long serialVersionUID = 1229878140258668581L;

  private PropertyChangeSupport m_pcSupport = 
    new PropertyChangeSupport(this);

  private PropertySheetPanel m_ieEditor = 
    new PropertySheetPanel();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  public IncrementalClassifierEvaluatorCustomizer() {
    setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));

    setLayout(new BorderLayout());
    add(m_ieEditor, BorderLayout.CENTER);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    add(new javax.swing.JLabel("IncrementalClassifierEvaluatorCustomizer"),
      BorderLayout.NORTH);
    addButtons();
  }

  private void addButtons() {
    JButton okBut = new JButton("OK");
    JButton cancelBut = new JButton("Cancel");

    JPanel butHolder = new JPanel();
    butHolder.setLayout(new GridLayout(1, 2));
    butHolder.add(okBut);
    butHolder.add(cancelBut);
    add(butHolder, BorderLayout.SOUTH);

    okBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_modifyListener.setModifiedStatus(
          IncrementalClassifierEvaluatorCustomizer.this, true);
        if (m_parent != null) {
          m_parent.dispose();
        }
      }
    });

    cancelBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        customizerClosing();
        if (m_parent != null) {
          m_parent.dispose();
        }
      }
    });
  }

  /**
   * Set the object to be edited
   * 
   * @param object a IncrementalClassifierEvaluator object
   */
  @Override
  public void setObject(Object object) {
    m_evaluator = ((IncrementalClassifierEvaluator) object);
    m_ieEditor.setTarget(m_evaluator);
    m_freqBackup = m_evaluator.getStatusFrequency();
    m_perClassBackup = m_evaluator.getOutputPerClassInfoRetrievalStats();
<<<<<<< HEAD
=======
=======
    add(new javax.swing.JLabel(Messages.getInstance().getString("IncrementalClassifierEvaluatorCustomizer_JLabel_Text")), 
	BorderLayout.NORTH);
  }
  
  /**
   * Set the object to be edited
   *
   * @param object a IncrementalClassifierEvaluator object
   */
  public void setObject(Object object) {
    m_ieEditor.setTarget((IncrementalClassifierEvaluator)object);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Add a property change listener
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.addPropertyChangeListener(pcl);
  }

  /**
   * Remove a property change listener
   * 
   * @param pcl a <code>PropertyChangeListener</code> value
   */
  @Override
  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    m_pcSupport.removePropertyChangeListener(pcl);
  }

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
    // restore original state (window closed or cancel pressed)
    m_evaluator.setStatusFrequency(m_freqBackup);
    m_evaluator.setOutputPerClassInfoRetrievalStats(m_perClassBackup);
  }
<<<<<<< HEAD
=======
=======
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
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
