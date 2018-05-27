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
 *    AssociationsPanel.java
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

package weka.gui.explorer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.associations.AssociationRules;
import weka.associations.Associator;
import weka.associations.FPGrowth;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Defaults;
import weka.core.Drawable;
import weka.core.Environment;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.PluginManager;
import weka.core.Settings;
import weka.core.Utils;
import weka.core.WekaPackageClassLoaderManager;
import weka.gui.AbstractPerspective;
import weka.gui.GenericObjectEditor;
import weka.gui.Logger;
import weka.gui.PerspectiveInfo;
<<<<<<< HEAD
=======
=======
import weka.associations.Associator;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.gui.GenericObjectEditor;
import weka.gui.Logger;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.PropertyPanel;
import weka.gui.ResultHistoryPanel;
import weka.gui.SaveBuffer;
import weka.gui.SysErrLog;
import weka.gui.TaskLogger;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeEvent;
import weka.gui.explorer.Explorer.CapabilitiesFilterChangeListener;
import weka.gui.explorer.Explorer.ExplorerPanel;
import weka.gui.explorer.Explorer.LogHandler;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;
import weka.gui.visualize.plugins.AssociationRuleVisualizePlugin;
import weka.gui.visualize.plugins.TreeVisualizePlugin;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;
import java.awt.Color;
<<<<<<< HEAD
=======
=======

import java.awt.BorderLayout;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.List;
import java.util.Vector;

/**
 * This panel allows the user to select, configure, and run a scheme that learns
 * associations.
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
@PerspectiveInfo(ID = "weka.gui.explorer.associationspanel",
  title = "Associate", toolTipText = "Discover association rules",
  iconPath = "weka/gui/weka_icon_new_small.png")
public class AssociationsPanel extends AbstractPerspective implements
  CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {

<<<<<<< HEAD
=======
=======

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/** 
 * This panel allows the user to select, configure, and run a scheme
 * that learns associations.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 9495 $
 */
public class AssociationsPanel 
  extends JPanel
  implements CapabilitiesFilterChangeListener, ExplorerPanel, LogHandler {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -6867871711865476971L;

  /** the parent frame */
  protected Explorer m_Explorer = null;

  /** Lets the user configure the associator */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected GenericObjectEditor m_AssociatorEditor = new GenericObjectEditor();

  /** The panel showing the current associator selection */
  protected PropertyPanel m_CEPanel = new PropertyPanel(m_AssociatorEditor);

<<<<<<< HEAD
=======
=======
  protected GenericObjectEditor m_AssociatorEditor =
    new GenericObjectEditor();

  /** The panel showing the current associator selection */
  protected PropertyPanel m_CEPanel = new PropertyPanel(m_AssociatorEditor);
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The output area for associations */
  protected JTextArea m_OutText = new JTextArea(20, 40);

  /** The destination for log/status messages */
  protected Logger m_Log = new SysErrLog();

  /** The buffer saving object for saving output */
  protected SaveBuffer m_SaveOut = new SaveBuffer(m_Log, this);

  /** A panel controlling results viewing */
  protected ResultHistoryPanel m_History = new ResultHistoryPanel(m_OutText);

  /** Click to start running the associator */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected JButton m_StartBut = new JButton("Start");

  /** Click to stop a running associator */
  protected JButton m_StopBut = new JButton("Stop");

  /**
   * Whether to store any graph or xml rules output in the history list
   */
  protected JCheckBox m_storeOutput = new JCheckBox(
    "Store output for visualization");

<<<<<<< HEAD
=======
=======
  protected JButton m_StartBut = new JButton(Messages.getInstance().getString("AssociationsPanel_StartBut_JButton_Text"));

  /** Click to stop a running associator */
  protected JButton m_StopBut = new JButton(Messages.getInstance().getString("AssociationsPanel_StopBut_JButton_Text"));
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The main set of instances we're playing with */
  protected Instances m_Instances;

  /** The user-supplied test set (if any) */
  protected Instances m_TestInstances;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** A thread that associator runs in */
  protected Thread m_RunThread;

  /**
   * Whether start-up settings have been applied (i.e. initial default
   * associator to use
   */
  protected boolean m_initialSettingsSet;

  /* Register the property editors we need */
  static {
    GenericObjectEditor.registerEditors();
  }

<<<<<<< HEAD
=======
=======
  
  /** A thread that associator runs in */
  protected Thread m_RunThread;

  /* Register the property editors we need */
  static {
     GenericObjectEditor.registerEditors();
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Creates the associator panel
   */
  public AssociationsPanel() {

    // Connect / configure the components
    m_OutText.setEditable(false);
    m_OutText.setFont(new Font("Monospaced", Font.PLAIN, 12));
    m_OutText.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    m_OutText.addMouseListener(new MouseAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      @Override
      public void mouseClicked(MouseEvent e) {
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK) {
          m_OutText.selectAll();
        }
      }
    });
    JPanel historyHolder = new JPanel(new BorderLayout());
    historyHolder.setBorder(BorderFactory
      .createTitledBorder("Result list (right-click for options)"));
    historyHolder.add(m_History, BorderLayout.CENTER);
    m_History.setHandleRightClicks(false);
    // see if we can popup a menu for the selected result
    m_History.getList().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
          || e.isAltDown()) {
          int index = m_History.getList().locationToIndex(e.getPoint());
          if (index != -1) {
            List<String> selectedEls =
              (List<String>) m_History.getList().getSelectedValuesList();
            historyRightClickPopup(selectedEls, e.getX(), e.getY());
          } else {
            historyRightClickPopup(null, e.getX(), e.getY());
          }
        }
      }
    });
<<<<<<< HEAD
=======
=======
      public void mouseClicked(MouseEvent e) {
	if ((e.getModifiers() & InputEvent.BUTTON1_MASK)
	    != InputEvent.BUTTON1_MASK) {
	  m_OutText.selectAll();
	}
      }
    });
    m_History.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("AssociationsPanel_MouseClicked_History_BorderFactoryCreateTitledBorder_Text")));
    m_History.setHandleRightClicks(false);
    // see if we can popup a menu for the selected result
    m_History.getList().addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
	  if (((e.getModifiers() & InputEvent.BUTTON1_MASK)
	       != InputEvent.BUTTON1_MASK) || e.isAltDown()) {
	    int index = m_History.getList().locationToIndex(e.getPoint());
	    if (index != -1) {
	      String name = m_History.getNameAtIndex(index);
	      historyRightClickPopup(name, e.getX(), e.getY());
	    } else {
	      historyRightClickPopup(null, e.getX(), e.getY());
	    }
	  }
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_AssociatorEditor.setClassType(Associator.class);
    m_AssociatorEditor.setValue(ExplorerDefaults.getAssociator());
    m_AssociatorEditor.addPropertyChangeListener(new PropertyChangeListener() {
<<<<<<< HEAD
      @Override
=======
<<<<<<< HEAD
      @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void propertyChange(PropertyChangeEvent e) {
        m_StartBut.setEnabled(true);
        // Check capabilities
        Capabilities currentFilter = m_AssociatorEditor.getCapabilitiesFilter();
        Associator associator = (Associator) m_AssociatorEditor.getValue();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        Capabilities currentSchemeCapabilities = null;
        if (associator != null && currentFilter != null
          && (associator instanceof CapabilitiesHandler)) {
          currentSchemeCapabilities =
            ((CapabilitiesHandler) associator).getCapabilities();

          if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
            && !currentSchemeCapabilities.supports(currentFilter)) {
            m_StartBut.setEnabled(false);
          }
        }
        repaint();
      }
    });

    m_StartBut.setToolTipText("Starts the associator");
    m_StopBut.setToolTipText("Stops the associator");
    m_StartBut.setEnabled(false);
    m_StopBut.setEnabled(false);
    m_StartBut.addActionListener(new ActionListener() {
      @Override
<<<<<<< HEAD
=======
=======
        Capabilities currentSchemeCapabilities =  null;
        if (associator != null && currentFilter != null && 
            (associator instanceof CapabilitiesHandler)) {
          currentSchemeCapabilities = ((CapabilitiesHandler)associator).getCapabilities();
          
          if (!currentSchemeCapabilities.supportsMaybe(currentFilter) &&
              !currentSchemeCapabilities.supports(currentFilter)) {
            m_StartBut.setEnabled(false);
          }
        }
	repaint();
      }
    });

    m_StartBut.setToolTipText(Messages.getInstance().getString("AssociationsPanel_StartBut_SetToolTipText_Text"));
    m_StopBut.setToolTipText(Messages.getInstance().getString("AssociationsPanel_StopBut_SetToolTipText_Text"));
    m_StartBut.setEnabled(false);
    m_StopBut.setEnabled(false);
    m_StartBut.addActionListener(new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public void actionPerformed(ActionEvent e) {
        boolean proceed = true;
        if (Explorer.m_Memory.memoryIsLow()) {
          proceed = Explorer.m_Memory.showMemoryIsLow();
        }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (proceed) {
          startAssociator();
        }
      }
    });
    m_StopBut.addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      @Override
      public void actionPerformed(ActionEvent e) {
        stopAssociator();
      }
    });

    // check for any visualization plugins so that we
    // can add a checkbox for storing graphs or rules
    boolean showStoreOutput =
      (PluginManager.getPluginNamesOfTypeList(AssociationRuleVisualizePlugin.class.getName()).size() > 0 ||
        PluginManager.getPluginNamesOfTypeList(TreeVisualizePlugin.class.getName()).size() > 0);

    // Layout the GUI
    JPanel p1 = new JPanel();
    p1.setBorder(BorderFactory.createCompoundBorder(
      BorderFactory.createTitledBorder("Associator"),
      BorderFactory.createEmptyBorder(0, 5, 5, 5)));
<<<<<<< HEAD
=======
=======
      public void actionPerformed(ActionEvent e) {
	stopAssociator();
      }
    });

    // Layout the GUI
    JPanel p1 = new JPanel();
    p1.setBorder(BorderFactory.createCompoundBorder(
		 BorderFactory.createTitledBorder(Messages.getInstance().getString("AssociationsPanel_P1_JPanel_BorderFactoryCreateTitledBorder_Text")),
		 BorderFactory.createEmptyBorder(0, 5, 5, 5)
		 ));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p1.setLayout(new BorderLayout());
    p1.add(m_CEPanel, BorderLayout.NORTH);

    JPanel buttons = new JPanel();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    buttons.setLayout(new BorderLayout());
    JPanel buttonsP = new JPanel();
    buttonsP.setLayout(new GridLayout(1, 2));

<<<<<<< HEAD
=======
=======
    buttons.setLayout(new GridLayout(1,2));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JPanel ssButs = new JPanel();
    ssButs.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    ssButs.setLayout(new GridLayout(1, 2, 5, 5));
    ssButs.add(m_StartBut);
    ssButs.add(m_StopBut);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    buttonsP.add(ssButs);
    buttons.add(buttonsP, BorderLayout.SOUTH);
    if (showStoreOutput) {
      buttons.add(m_storeOutput, BorderLayout.NORTH);
    }

    JPanel p3 = new JPanel();
    p3.setBorder(BorderFactory.createTitledBorder("Associator output"));
<<<<<<< HEAD
=======
=======
    buttons.add(ssButs);

    JPanel p3 = new JPanel();
    p3.setBorder(BorderFactory.createTitledBorder(Messages.getInstance().getString("AssociationsPanel_P3_JPanel_BorderFactoryCreateTitledBorder_Text")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    p3.setLayout(new BorderLayout());
    final JScrollPane js = new JScrollPane(m_OutText);
    p3.add(js, BorderLayout.CENTER);
    js.getViewport().addChangeListener(new ChangeListener() {
      private int lastHeight;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      @Override
      public void stateChanged(ChangeEvent e) {
        JViewport vp = (JViewport) e.getSource();
        int h = vp.getViewSize().height;
        if (h != lastHeight) { // i.e. an addition not just a user scrolling
          lastHeight = h;
          int x = h - vp.getExtentSize().height;
          vp.setViewPosition(new Point(0, x));
        }
      }
    });

<<<<<<< HEAD
=======
=======
      public void stateChanged(ChangeEvent e) {
	JViewport vp = (JViewport)e.getSource();
	int h = vp.getViewSize().height; 
	if (h != lastHeight) { // i.e. an addition not just a user scrolling
	  lastHeight = h;
	  int x = h - vp.getExtentSize().height;
	  vp.setViewPosition(new Point(0, x));
	}
      }
    });
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    GridBagLayout gbL = new GridBagLayout();
    GridBagConstraints gbC = new GridBagConstraints();
    JPanel mondo = new JPanel();
    gbL = new GridBagLayout();
    mondo.setLayout(gbL);
    gbC = new GridBagConstraints();
    gbC.anchor = GridBagConstraints.NORTH;
    gbC.fill = GridBagConstraints.HORIZONTAL;
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 0;
=======
<<<<<<< HEAD
    gbC.gridy = 1;
    gbC.gridx = 0;
=======
    gbC.gridy = 1;     gbC.gridx = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(buttons, gbC);
    mondo.add(buttons);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbC.gridy = 2;
    gbC.gridx = 0;
    gbC.weightx = 0;
    gbL.setConstraints(historyHolder, gbC);
    mondo.add(historyHolder);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
    gbC.gridy = 0;
    gbC.gridx = 1;
    gbC.gridheight = 3;
    gbC.weightx = 100;
    gbC.weighty = 100;
<<<<<<< HEAD
=======
=======
    gbC.gridy = 2;     gbC.gridx = 0; gbC.weightx = 0;
    gbL.setConstraints(m_History, gbC);
    mondo.add(m_History);
    gbC = new GridBagConstraints();
    gbC.fill = GridBagConstraints.BOTH;
    gbC.gridy = 0;     gbC.gridx = 1;
    gbC.gridheight = 3;
    gbC.weightx = 100; gbC.weighty = 100;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    gbL.setConstraints(p3, gbC);
    mondo.add(p3);

    setLayout(new BorderLayout());
    add(p1, BorderLayout.NORTH);
    add(mondo, BorderLayout.CENTER);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the Logger to receive informational messages
   * 
   * @param newLog the Logger that will now get info messages
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  /**
   * Sets the Logger to receive informational messages
   *
   * @param newLog the Logger that will now get info messages
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setLog(Logger newLog) {

    m_Log = newLog;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Tells the panel to use a new set of instances.
   * 
   * @param inst a set of Instances
   */
  @Override
  public void setInstances(Instances inst) {

    m_Instances = inst;
    String[] attribNames = new String[m_Instances.numAttributes()];
    for (int i = 0; i < attribNames.length; i++) {
      String type =
        "(" + Attribute.typeToStringShort(m_Instances.attribute(i)) + ") ";
<<<<<<< HEAD
=======
=======
  
  /**
   * Tells the panel to use a new set of instances.
   *
   * @param inst a set of Instances
   */
  public void setInstances(Instances inst) {
    
    m_Instances = inst;
    String [] attribNames = new String [m_Instances.numAttributes()];
    for (int i = 0; i < attribNames.length; i++) {
      String type = "";
      switch (m_Instances.attribute(i).type()) {
      case Attribute.NOMINAL:
	type = Messages.getInstance().getString("AssociationsPanel_SetInstances_AttributeNOMINAL_Text");
	break;
      case Attribute.NUMERIC:
	type = Messages.getInstance().getString("AssociationsPanel_SetInstances_AttributeNUMERIC_Text");
	break;
      case Attribute.STRING:
	type = Messages.getInstance().getString("AssociationsPanel_SetInstances_AttributeSTRING_Text");
	break;
      case Attribute.DATE:
	type = Messages.getInstance().getString("AssociationsPanel_SetInstances_AttributeDATE_Text");
	break;
      case Attribute.RELATIONAL:
	type = Messages.getInstance().getString("AssociationsPanel_SetInstances_AttributeRELATIONAL_Text");
	break;
      default:
	type = Messages.getInstance().getString("AssociationsPanel_SetInstances_AttributeDEFAULT_Text");
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      attribNames[i] = type + m_Instances.attribute(i).name();
    }
    m_StartBut.setEnabled(m_RunThread == null);
    m_StopBut.setEnabled(m_RunThread != null);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Starts running the currently configured associator with the current
   * settings. This is run in a separate thread, and will only start if there is
   * no associator already running. The associator output is sent to the results
   * history panel.
<<<<<<< HEAD
=======
=======
  
  /**
   * Starts running the currently configured associator with the current
   * settings. This is run in a separate thread, and will only start if
   * there is no associator already running. The associator output is sent
   * to the results history panel.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void startAssociator() {

    if (m_RunThread == null) {
      m_StartBut.setEnabled(false);
      m_StopBut.setEnabled(true);
      m_RunThread = new Thread() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void run() {
          m_CEPanel.addToHistory();

          // Copy the current state of things
          m_Log.statusMessage("Setting up...");
          Instances inst = new Instances(m_Instances);
          String grph = null;
          // String xmlRules = null;
          AssociationRules rulesList = null;
          Associator associator = (Associator) m_AssociatorEditor.getValue();
          StringBuffer outBuff = new StringBuffer();
          String name =
            (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
          String cname = associator.getClass().getName();
          if (cname.startsWith("weka.associations.")) {
            name += cname.substring("weka.associations.".length());
          } else {
            name += cname;
          }
          String cmd = m_AssociatorEditor.getValue().getClass().getName();
          if (m_AssociatorEditor.getValue() instanceof OptionHandler) {
            cmd +=
              " "
                + Utils.joinOptions(((OptionHandler) m_AssociatorEditor
                  .getValue()).getOptions());
          }
          try {

            // Output some header information
            m_Log.logMessage("Started " + cname);
            m_Log.logMessage("Command: " + cmd);
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskStarted();
            }
            outBuff.append("=== Run information ===\n\n");
            outBuff.append("Scheme:       " + cname);
            if (associator instanceof OptionHandler) {
              String[] o = ((OptionHandler) associator).getOptions();
              outBuff.append(" " + Utils.joinOptions(o));
            }
            outBuff.append("\n");
            outBuff.append("Relation:     " + inst.relationName() + '\n');
            outBuff.append("Instances:    " + inst.numInstances() + '\n');
            outBuff.append("Attributes:   " + inst.numAttributes() + '\n');
            if (inst.numAttributes() < 100) {
              for (int i = 0; i < inst.numAttributes(); i++) {
                outBuff.append("              " + inst.attribute(i).name()
                  + '\n');
              }
            } else {
              outBuff.append("              [list of attributes omitted]\n");
            }
            m_History.addResult(name, outBuff);
            m_History.setSingle(name);

            // Build the model and output it.
            m_Log.statusMessage("Building model on training data...");
            associator.buildAssociations(inst);
            outBuff.append("=== Associator model (full training set) ===\n\n");
            outBuff.append(associator.toString() + '\n');
            m_History.updateResult(name);
            if (m_storeOutput.isSelected()) {
              if (associator instanceof Drawable) {
                grph = null;
                try {
                  grph = ((Drawable) associator).graph();
                } catch (Exception ex) {
                }
              }

              if (associator instanceof weka.associations.AssociationRulesProducer) {
                // xmlRules = null;
                rulesList = null;
                try {
                  // xmlRules =
                  // ((weka.associations.XMLRulesProducer)associator).xmlRules();
                  rulesList =
                    ((weka.associations.AssociationRulesProducer) associator)
                      .getAssociationRules();
                } catch (Exception ex) {
                }
              }
            }
            m_Log.logMessage("Finished " + cname);
            m_Log.statusMessage("OK");
          } catch (Exception ex) {
            m_Log.logMessage(ex.getMessage());
            m_Log.statusMessage("See error log");
          } finally {
            Vector<Object> visVect = new Vector<Object>();
            try {
              // save a copy since we don't need the learned model for
              // anything yet.
              // TODO should probably add options to store full model and
              // save/load
              // models like the classifier and clusterer panels
              Associator configCopy = associator.getClass().newInstance();
              if (configCopy instanceof OptionHandler) {
                ((OptionHandler) configCopy)
                  .setOptions(((OptionHandler) associator).getOptions());
              }
              visVect.add(configCopy);
            } catch (Exception ex) {
              ex.printStackTrace();

              // just add the original if we have problems copying
              visVect.add(associator);
            }

            if (grph != null || rulesList != null) {

              if (grph != null) {
                visVect.add(grph);
              }

              if (rulesList != null) {
                visVect.add(rulesList);
              }
            }
            m_History.addObject(name, visVect);
            if (isInterrupted()) {
              m_Log.logMessage("Interrupted " + cname);
              m_Log.statusMessage("See error log");
            }
            m_RunThread = null;
            m_StartBut.setEnabled(true);
            m_StopBut.setEnabled(false);
            if (m_Log instanceof TaskLogger) {
              ((TaskLogger) m_Log).taskFinished();
            }
          }
        }
<<<<<<< HEAD
=======
=======
	public void run() {
	  // Copy the current state of things
	  m_Log.statusMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_StatusMessage_Text_First"));
	  Instances inst = new Instances(m_Instances);

	  Associator associator = (Associator) m_AssociatorEditor.getValue();
	  StringBuffer outBuff = new StringBuffer();
	  String name = (new SimpleDateFormat("HH:mm:ss - "))
	  .format(new Date());
	  String cname = associator.getClass().getName();
	  if (cname.startsWith("weka.associations.")) {
	    name += cname.substring("weka.associations.".length());
	  } else {
	    name += cname;
	  }
          String cmd = m_AssociatorEditor.getValue().getClass().getName();
          if (m_AssociatorEditor.getValue() instanceof OptionHandler)
            cmd += " " + Utils.joinOptions(((OptionHandler) m_AssociatorEditor.getValue()).getOptions());
	  try {

	    // Output some header information
	    m_Log.logMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_LogMessage_Text_First") + cname);
	    m_Log.logMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_LogMessage_Text_Second") + cmd);
	    if (m_Log instanceof TaskLogger) {
	      ((TaskLogger)m_Log).taskStarted();
	    }
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_First"));
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Second") + cname);
	    if (associator instanceof OptionHandler) {
	      String [] o = ((OptionHandler) associator).getOptions();
	      outBuff.append(" " + Utils.joinOptions(o));
	    }
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Third"));
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Fourth") + inst.relationName() + '\n');
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Sixth") + inst.numInstances() + '\n');
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Seventh") + inst.numAttributes() + '\n');
	    if (inst.numAttributes() < 100) {
	      for (int i = 0; i < inst.numAttributes(); i++) {
		outBuff.append("              " + inst.attribute(i).name()
			       + '\n');
	      }
	    } else {
	      outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Eighth"));
	    }
	    m_History.addResult(name, outBuff);
	    m_History.setSingle(name);
	    
	    // Build the model and output it.
	    m_Log.statusMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_StatusMessage_Text_Second"));
	    associator.buildAssociations(inst);
	    outBuff.append(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_OutBuffer_Text_Nineth"));
	    outBuff.append(associator.toString() + '\n');
	    m_History.updateResult(name);
	    m_Log.logMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_LogMessage_Text_Third") + cname);
	    m_Log.statusMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_StatusMessage_Text_Third"));
	  } catch (Exception ex) {
	    m_Log.logMessage(ex.getMessage());
	    m_Log.statusMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_StatusMessage_Text_Fourth"));
	  } finally {
	    if (isInterrupted()) {
	      m_Log.logMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_LogMessage_Text_Fourth") + cname);
	      m_Log.statusMessage(Messages.getInstance().getString("AssociationsPanel_StartAssociator_Run_Log_StatusMessage_Text_Fifth"));
	    }
	    m_RunThread = null;
	    m_StartBut.setEnabled(true);
	    m_StopBut.setEnabled(false);
	    if (m_Log instanceof TaskLogger) {
	      ((TaskLogger)m_Log).taskFinished();
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      };
      m_RunThread.setPriority(Thread.MIN_PRIORITY);
      m_RunThread.start();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Stops the currently running Associator (if any).
   */
  @SuppressWarnings("deprecation")
<<<<<<< HEAD
=======
=======
  
  /**
   * Stops the currently running Associator (if any).
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected void stopAssociator() {

    if (m_RunThread != null) {
      m_RunThread.interrupt();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // This is deprecated (and theoretically the interrupt should do).
      m_RunThread.stop();

<<<<<<< HEAD
=======
=======
      
      // This is deprecated (and theoretically the interrupt should do).
      m_RunThread.stop();
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Save the currently selected associator output to a file.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param name the name of the buffer to save
   */
  protected void saveBuffer(String name) {
    StringBuffer sb = m_History.getNamedBuffer(name);
    if (sb != null) {
      if (m_SaveOut.save(sb)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_Log.logMessage("Save successful.");
      }
    }
  }

  /**
   * Pops up a TreeVisualizer for the associator from the currently selected
   * item in the results list
   * 
   * @param dottyString the description of the tree in dotty format
   * @param treeName the title to assign to the display
   */
  protected void visualizeTree(String dottyString, String treeName) {
    final javax.swing.JFrame jf =
      Utils.getWekaJFrame("Weka Associator Tree Visualizer: " + treeName, this);
    jf.getContentPane().setLayout(new BorderLayout());
    TreeVisualizer tv = new TreeVisualizer(null, dottyString, new PlaceNode2());
    jf.getContentPane().add(tv, BorderLayout.CENTER);
    jf.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent e) {
        jf.dispose();
      }
    });
    jf.pack();
    jf.setSize(800, 600);
    jf.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
    jf.setVisible(true);
    tv.fitToScreen();
  }

  /**
   * Handles constructing a popup menu with visualization options.
   * 
   * @param names the names of the result history list entries clicked on by the
   *          user
   * @param x the x coordinate for popping up the menu
   * @param y the y coordinate for popping up the menu
   */
  @SuppressWarnings("unchecked")
  protected void historyRightClickPopup(List<String> names, int x, int y) {
    final List<String> selectedNames = names;
    JPopupMenu resultListMenu = new JPopupMenu();

    JMenuItem visMainBuffer = new JMenuItem("View in main window");
    if (selectedNames != null && selectedNames.size() == 1) {
      visMainBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.setSingle(selectedNames.get(0));
        }
      });
<<<<<<< HEAD
=======
=======
	m_Log.logMessage(Messages.getInstance().getString("AssociationsPanel_SaveBuffer_Log_LogMessage_Text"));
      }
    }
  }
    
  /**
   * Handles constructing a popup menu with visualization options.
   * @param name the name of the result history list entry clicked on by
   * the user
   * @param x the x coordinate for popping up the menu
   * @param y the y coordinate for popping up the menu
   */
  protected void historyRightClickPopup(String name, int x, int y) {
    final String selectedName = name;
    JPopupMenu resultListMenu = new JPopupMenu();
    
    JMenuItem visMainBuffer = new JMenuItem(Messages.getInstance().getString("AssociationsPanel_HistoryRightClickPopup_VisMainBuffer_JPopupMenu_Text"));
    if (selectedName != null) {
      visMainBuffer.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    m_History.setSingle(selectedName);
	  }
	});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      visMainBuffer.setEnabled(false);
    }
    resultListMenu.add(visMainBuffer);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JMenuItem visSepBuffer = new JMenuItem("View in separate window");
    if (selectedNames != null && selectedNames.size() == 1) {
      visSepBuffer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.openFrame(selectedNames.get(0));
        }
<<<<<<< HEAD
=======
=======
    
    JMenuItem visSepBuffer = new JMenuItem(Messages.getInstance().getString("AssociationsPanel_HistoryRightClickPopup_VisSepBuffer_JMenuItem_Text"));
    if (selectedName != null) {
      visSepBuffer.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  m_History.openFrame(selectedName);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
    } else {
      visSepBuffer.setEnabled(false);
    }
    resultListMenu.add(visSepBuffer);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    JMenuItem saveOutput = new JMenuItem("Save result buffer");
    if (selectedNames != null && selectedNames.size() == 1) {
      saveOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveBuffer(selectedNames.get(0));
        }
      });
<<<<<<< HEAD
=======
=======
    
    JMenuItem saveOutput = new JMenuItem(Messages.getInstance().getString("AssociationsPanel_HistoryRightClickPopup_SaveOutput_JMenuItem_Text"));
    if (selectedName != null) {
      saveOutput.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    saveBuffer(selectedName);
	  }
	});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      saveOutput.setEnabled(false);
    }
    resultListMenu.add(saveOutput);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JMenuItem deleteOutput = new JMenuItem("Delete result buffer(s)");
    if (selectedNames != null) {
      deleteOutput.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_History.removeResults(selectedNames);
        }
<<<<<<< HEAD
=======
=======
    JMenuItem deleteOutput = new JMenuItem(Messages.getInstance().getString("AssociationsPanel_HistoryRightClickPopup_DeleteOutput_JMenuItem_Text"));
    if (selectedName != null) {
      deleteOutput.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  m_History.removeResult(selectedName);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
    } else {
      deleteOutput.setEnabled(false);
    }
    resultListMenu.add(deleteOutput);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Vector<Object> visVect = null;
    if (selectedNames != null && selectedNames.size() == 1) {
      visVect = (Vector<Object>) m_History.getNamedObject(selectedNames.get(0));
    }

    // check for the associator itself
    if (visVect != null) {
      // should be the first element
      Associator temp_model = null;
      if (visVect.get(0) instanceof Associator) {
        temp_model = (Associator) visVect.get(0);
      }

      final Associator model = temp_model;
      JMenuItem reApplyConfig =
        new JMenuItem("Re-apply this model's configuration");
      if (model != null) {
        reApplyConfig.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            m_AssociatorEditor.setValue(model);
          }
        });
      } else {
        reApplyConfig.setEnabled(false);
      }
      resultListMenu.add(reApplyConfig);
    }

    // plugins
    JMenu visPlugins = new JMenu("Plugins");
    boolean availablePlugins = false;

    // tree plugins
    if (visVect != null) {
      for (Object o : visVect) {
        if (o instanceof AssociationRules) {
          List<String> pluginsVector =
            PluginManager.getPluginNamesOfTypeList(AssociationRuleVisualizePlugin.class.getName());
          for (int i = 0; i < pluginsVector.size(); i++) {
            String className = (pluginsVector.get(i));
            try {
              AssociationRuleVisualizePlugin plugin =
                (AssociationRuleVisualizePlugin) WekaPackageClassLoaderManager.objectForName(className);
                  //Class.forName(className).newInstance();
              if (plugin == null) {
                continue;
              }
              availablePlugins = true;
              JMenuItem pluginMenuItem =
                plugin.getVisualizeMenuItem((AssociationRules) o, selectedNames.get(0));
              if (pluginMenuItem != null) {
                visPlugins.add(pluginMenuItem);
              }
            } catch (Exception ex) {
              // ex.printStackTrace();
            }
          }
        } else if (o instanceof String) {
          List<String> pluginsVector =
            PluginManager.getPluginNamesOfTypeList(TreeVisualizePlugin.class.getName());
          for (int i = 0; i < pluginsVector.size(); i++) {
            String className = (pluginsVector.get(i));
            try {
              TreeVisualizePlugin plugin =
                (TreeVisualizePlugin) WekaPackageClassLoaderManager.objectForName(className);
                  // Class.forName(className).newInstance();
              if (plugin == null) {
                continue;
              }
              availablePlugins = true;
              JMenuItem pluginMenuItem =
                plugin.getVisualizeMenuItem((String) o, selectedNames.get(0));
              // Version version = new Version();
              if (pluginMenuItem != null) {
                /*
                 * if (version.compareTo(plugin.getMinVersion()) < 0)
                 * pluginMenuItem.setText(pluginMenuItem.getText() +
                 * " (weka outdated)"); if
                 * (version.compareTo(plugin.getMaxVersion()) >= 0)
                 * pluginMenuItem.setText(pluginMenuItem.getText() +
                 * " (plugin outdated)");
                 */
                visPlugins.add(pluginMenuItem);
              }
            } catch (Exception e) {
              // e.printStackTrace();
            }
          }
        }
      }
    }

    if (availablePlugins) {
      resultListMenu.add(visPlugins);
    }

    resultListMenu.show(m_History.getList(), x, y);
  }

  /**
   * updates the capabilities filter of the GOE
   * 
   * @param filter the new filter to use
   */
  protected void updateCapabilitiesFilter(Capabilities filter) {
    Instances tempInst;
    Capabilities filterClass;

<<<<<<< HEAD
=======
=======
    resultListMenu.show(m_History.getList(), x, y);
  }
  
  /**
   * updates the capabilities filter of the GOE
   * 
   * @param filter	the new filter to use
   */
  protected void updateCapabilitiesFilter(Capabilities filter) {
    Instances           tempInst;
    Capabilities        filterClass;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (filter == null) {
      m_AssociatorEditor.setCapabilitiesFilter(new Capabilities(null));
      return;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (!ExplorerDefaults.getInitGenericObjectEditorFilter()) {
      tempInst = new Instances(m_Instances, 0);
    } else {
      tempInst = new Instances(m_Instances);
    }
    tempInst.setClassIndex(-1);

    try {
      filterClass = Capabilities.forInstances(tempInst);
    } catch (Exception e) {
      filterClass = new Capabilities(null);
    }

    m_AssociatorEditor.setCapabilitiesFilter(filterClass);

<<<<<<< HEAD
=======
=======
    
    if (!ExplorerDefaults.getInitGenericObjectEditorFilter())
      tempInst = new Instances(m_Instances, 0);
    else
      tempInst = new Instances(m_Instances);
    tempInst.setClassIndex(-1);
    
    try {
      filterClass = Capabilities.forInstances(tempInst);
    }
    catch (Exception e) {
      filterClass = new Capabilities(null);
    }
    
    m_AssociatorEditor.setCapabilitiesFilter(filterClass);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_StartBut.setEnabled(true);
    // Check capabilities
    Capabilities currentFilter = m_AssociatorEditor.getCapabilitiesFilter();
    Associator associator = (Associator) m_AssociatorEditor.getValue();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Capabilities currentSchemeCapabilities = null;
    if (associator != null && currentFilter != null
      && (associator instanceof CapabilitiesHandler)) {
      currentSchemeCapabilities =
        ((CapabilitiesHandler) associator).getCapabilities();

      if (!currentSchemeCapabilities.supportsMaybe(currentFilter)
        && !currentSchemeCapabilities.supports(currentFilter)) {
<<<<<<< HEAD
=======
=======
    Capabilities currentSchemeCapabilities =  null;
    if (associator != null && currentFilter != null && 
        (associator instanceof CapabilitiesHandler)) {
      currentSchemeCapabilities = ((CapabilitiesHandler)associator).getCapabilities();
      
      if (!currentSchemeCapabilities.supportsMaybe(currentFilter) &&
          !currentSchemeCapabilities.supports(currentFilter)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_StartBut.setEnabled(false);
      }
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * method gets called in case of a change event
   * 
   * @param e the associated change event
   */
  @Override
  public void capabilitiesFilterChanged(CapabilitiesFilterChangeEvent e) {
    if (e.getFilter() == null) {
      updateCapabilitiesFilter(null);
    } else {
      updateCapabilitiesFilter((Capabilities) e.getFilter().clone());
    }
<<<<<<< HEAD
=======
=======
  
  /**
   * method gets called in case of a change event
   * 
   * @param e		the associated change event
   */
  public void capabilitiesFilterChanged(CapabilitiesFilterChangeEvent e) {
    if (e.getFilter() == null)
      updateCapabilitiesFilter(null);
    else
      updateCapabilitiesFilter((Capabilities) e.getFilter().clone());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the Explorer to use as parent frame (used for sending notifications
   * about changes in the data)
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param parent the parent frame
   */
  @Override
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }

  /**
   * returns the parent Explorer frame
   * 
   * @return the parent
   */
  @Override
  public Explorer getExplorer() {
    return m_Explorer;
  }

  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return the title of this tab
   */
  @Override
  public String getTabTitle() {
    return "Associate";
  }

  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return the tooltip of this tab
   */
  @Override
  public String getTabTitleToolTip() {
    return "Discover association rules";
  }

  @Override
  public boolean requiresLog() {
    return true;
  }

  @Override
  public boolean acceptsInstances() {
    return true;
  }

  @Override
  public Defaults getDefaultSettings() {
    return new AssociationsPanelDefaults();
  }

  @Override
  public boolean okToBeActive() {
    return m_Instances != null;
  }

  public void setActive(boolean active) {
    super.setActive(active);
    if (m_isActive) {
      // make sure initial settings get applied
      settingsChanged();
    }
  }

  @Override
  public void settingsChanged() {
    if (getMainApplication() != null) {
      if (!m_initialSettingsSet) {
        m_initialSettingsSet = true;

        Object initialA =
          getMainApplication().getApplicationSettings().getSetting(
            getPerspectiveID(), AssociationsPanelDefaults.ASSOCIATOR_KEY,
            AssociationsPanelDefaults.ASSOCIATOR, Environment.getSystemWide());
        m_AssociatorEditor.setValue(initialA);
      }

      Font outputFont =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(), AssociationsPanelDefaults.OUTPUT_FONT_KEY,
          AssociationsPanelDefaults.OUTPUT_FONT, Environment.getSystemWide());
      m_OutText.setFont(outputFont);
      Color textColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(), AssociationsPanelDefaults.OUTPUT_TEXT_COLOR_KEY,
          AssociationsPanelDefaults.OUTPUT_TEXT_COLOR,
          Environment.getSystemWide());
      m_OutText.setForeground(textColor);
      Color outputBackgroundColor =
        getMainApplication().getApplicationSettings().getSetting(
          getPerspectiveID(),
          AssociationsPanelDefaults.OUTPUT_BACKGROUND_COLOR_KEY,
          AssociationsPanelDefaults.OUTPUT_BACKGROUND_COLOR,
          Environment.getSystemWide());
      m_OutText.setBackground(outputBackgroundColor);
      m_History.setBackground(outputBackgroundColor);
    }
  }

  /**
   * Default settings for the associations panel
   */
  protected static final class AssociationsPanelDefaults extends Defaults {
    public static final String ID = "weka.gui.explorer.associationspanel";

    protected static final Settings.SettingKey ASSOCIATOR_KEY =
      new Settings.SettingKey(ID + ".initialAssociator", "Initial associator",
        "On startup, set this associator as the default one");
    protected static final Associator ASSOCIATOR = new FPGrowth();

    protected static final Settings.SettingKey OUTPUT_FONT_KEY =
      new Settings.SettingKey(ID + ".outputFont", "Font for text output",
        "Font to " + "use in the output area");
    protected static final Font OUTPUT_FONT = new Font("Monospaced",
      Font.PLAIN, 12);

    protected static final Settings.SettingKey OUTPUT_TEXT_COLOR_KEY =
      new Settings.SettingKey(ID + ".outputFontColor", "Output text color",
        "Color " + "of output text");
    protected static final Color OUTPUT_TEXT_COLOR = Color.black;

    protected static final Settings.SettingKey OUTPUT_BACKGROUND_COLOR_KEY =
      new Settings.SettingKey(ID + ".outputBackgroundColor",
        "Output background color", "Output background color");
    protected static final Color OUTPUT_BACKGROUND_COLOR = Color.white;
    private static final long serialVersionUID = 1108450683775771792L;

    public AssociationsPanelDefaults() {
      super(ID);
      m_defaults.put(ASSOCIATOR_KEY, ASSOCIATOR);
      m_defaults.put(OUTPUT_FONT_KEY, OUTPUT_FONT);
      m_defaults.put(OUTPUT_TEXT_COLOR_KEY, OUTPUT_TEXT_COLOR);
      m_defaults.put(OUTPUT_BACKGROUND_COLOR_KEY, OUTPUT_BACKGROUND_COLOR);
    }
<<<<<<< HEAD
=======
=======
   * @param parent	the parent frame
   */
  public void setExplorer(Explorer parent) {
    m_Explorer = parent;
  }
  
  /**
   * returns the parent Explorer frame
   * 
   * @return		the parent
   */
  public Explorer getExplorer() {
    return m_Explorer;
  }
  
  /**
   * Returns the title for the tab in the Explorer
   * 
   * @return 		the title of this tab
   */
  public String getTabTitle() {
    return Messages.getInstance().getString("AssociationsPanel_GetTabTitle_Text");
  }
  
  /**
   * Returns the tooltip for the tab in the Explorer
   * 
   * @return 		the tooltip of this tab
   */
  public String getTabTitleToolTip() {
    return Messages.getInstance().getString("AssociationsPanel_GetTabTitleToolTip_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Tests out the Associator panel from the command line.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args may optionally contain the name of a dataset to load.
   */
  public static void main(String[] args) {

    try {
      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Associator");
<<<<<<< HEAD
=======
=======
   *
   * @param args may optionally contain the name of a dataset to load.
   */
  public static void main(String [] args) {

    try {
      final javax.swing.JFrame jf =
	new javax.swing.JFrame(Messages.getInstance().getString("AssociationsPanel_Main_JFrame_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.getContentPane().setLayout(new BorderLayout());
      final AssociationsPanel sp = new AssociationsPanel();
      jf.getContentPane().add(sp, BorderLayout.CENTER);
      weka.gui.LogPanel lp = new weka.gui.LogPanel();
      sp.setLog(lp);
      jf.getContentPane().add(lp, BorderLayout.SOUTH);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
<<<<<<< HEAD
=======
=======
	public void windowClosing(java.awt.event.WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      });
      jf.pack();
      jf.setVisible(true);
      if (args.length == 1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        System.err.println("Loading instances from " + args[0]);
        java.io.Reader r =
          new java.io.BufferedReader(new java.io.FileReader(args[0]));
        Instances i = new Instances(r);
        sp.setInstances(i);
<<<<<<< HEAD
=======
=======
	System.err.println(Messages.getInstance().getString("AssociationsPanel_Main_Error_Text") + args[0]);
	java.io.Reader r = new java.io.BufferedReader(
			   new java.io.FileReader(args[0]));
	Instances i = new Instances(r);
	sp.setInstances(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
