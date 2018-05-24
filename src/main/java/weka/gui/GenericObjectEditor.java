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
 *    GenericObjectEditor.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui;

<<<<<<< HEAD
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.CapabilitiesHandler;
import weka.core.ClassDiscovery;
import weka.core.CustomDisplayStringProvider;
import weka.core.InheritanceUtils;
import weka.core.OptionHandler;
import weka.core.SerializationHelper;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.WekaPackageClassLoaderManager;
import weka.core.WekaPackageManager;
import weka.core.logging.Logger;
import weka.gui.CheckBoxList.CheckBoxListModel;
import weka.core.PluginManager;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.*;
=======
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

=======
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.CapabilitiesHandler;
import weka.core.ClassDiscovery;
import weka.core.OptionHandler;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.gui.CheckBoxList.CheckBoxListModel;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * A PropertyEditor for objects. It can be used either in a static or a dynamic
 * way. <br>
 * <br>
 * In the <b>static</b> way (<code>USE_DYNAMIC</code> is <code>false</code>) the
 * objects have been defined as editable in the GenericObjectEditor
 * configuration file, which lists possible values that can be selected from,
 * and themselves configured. The configuration file is called
 * "GenericObjectEditor.props" and may live in either the location given by
 * "user.home" or the current directory (this last will take precedence), and a
 * default properties file is read from the Weka distribution. For speed, the
 * properties file is read only once when the class is first loaded -- this may
 * need to be changed if we ever end up running in a Java OS ;-). <br>
 * <br>
 * If it is used in a <b>dynamic</b> way (the <code>UseDynamic</code> property
 * of the GenericPropertiesCreator props file is set to <code>true</code>) then
 * the classes to list are discovered by the
 * <code>GenericPropertiesCreator</code> class (it checks the complete
 * classpath).
 * 
 * @see GenericPropertiesCreator
 * @see GenericPropertiesCreator#useDynamic()
 * @see GenericPropertiesCreator#CREATOR_FILE
 * @see weka.core.ClassDiscovery
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Xin Xu (xx5@cs.waikato.ac.nz)
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 14627 $
=======
 * @version $Revision: 11356 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class GenericObjectEditor implements PropertyEditor, CustomPanelSupplier {

  /** The object being configured. */
  protected Object m_Object;

  /**
   * Holds a copy of the current object that can be reverted to if the user
   * decides to cancel.
   */
  protected Object m_Backup;

  /** Handles property change notification. */
  protected PropertyChangeSupport m_Support = new PropertyChangeSupport(this);

  /** The Class of objects being edited. */
<<<<<<< HEAD
  protected Class<?> m_ClassType;

  /** The model containing the list of names to select from. */
  protected Hashtable<String, HierarchyPropertyParser> m_ObjectNames;
=======
  protected Class m_ClassType;

  /** The model containing the list of names to select from. */
  protected Hashtable m_ObjectNames;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The GUI component for editing values, created when needed. */
  protected GOEPanel m_EditorComponent;

<<<<<<< HEAD
  /** True if the cancel button was pressed */
  protected boolean m_CancelWasPressed;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** True if the GUI component is needed. */
  protected boolean m_Enabled = true;

  /** The name of the properties file. */
  protected static String PROPERTY_FILE = "weka/gui/GenericObjectEditor.props";

  /** Contains the editor properties. */
  protected static Properties EDITOR_PROPERTIES;

  /** the properties files containing the class/editor mappings. */
  public static final String GUIEDITORS_PROPERTY_FILE = "weka/gui/GUIEditors.props";

  /** The tree node of the current object so we can re-select it for the user. */
  protected GOETreeNode m_treeNodeOfCurrentObject;

  /** The property panel created for the objects. */
  protected PropertyPanel m_ObjectPropertyPanel;

  /** whether the class can be changed. */
  protected boolean m_canChangeClassInDialog;

<<<<<<< HEAD
  /** the history of used setups. */
  protected GenericObjectEditorHistory m_History;

  /** whether the Weka Editors were already registered. */
  protected static boolean m_EditorsRegistered;

  /** whether to display the global info tool tip in the tree. */
  protected static boolean m_ShowGlobalInfoToolTip;

  /** for filtering the tree based on the Capabilities of the leaves. */
  protected Capabilities m_CapabilitiesFilter = null;

  public static void setShowGlobalInfoToolTips(boolean show) {
    m_ShowGlobalInfoToolTip = show;
  }

  public boolean getShowGlobalInfoToolTips() {
    return m_ShowGlobalInfoToolTip;
  }

  public static void determineClasses() {
    try {
      // make sure we load all packages first!!!
      WekaPackageManager.loadPackages(false);

      // Don't do anything else until all initial packages are loaded...
      if (WekaPackageManager.m_initialPackageLoadingInProcess) {
        return;
      }

      EDITOR_PROPERTIES = GenericPropertiesCreator.getGlobalOutputProperties();
      if (EDITOR_PROPERTIES == null) {
        // try creating a new one from scratch
        GenericPropertiesCreator creator = new GenericPropertiesCreator();

        // dynamic approach?
        if (creator.useDynamic()) {
          try {
            creator.execute(false);
            EDITOR_PROPERTIES = creator.getOutputProperties();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
              "Could not determine the properties for the generic object\n"
                + "editor. This exception was produced:\n" + e.toString(),
              "GenericObjectEditor", JOptionPane.ERROR_MESSAGE);
          }
        } else {
          // Allow a properties file in the current directory to override
          try {
            EDITOR_PROPERTIES = Utils.readProperties(PROPERTY_FILE);
            java.util.Enumeration<?> keys = EDITOR_PROPERTIES.propertyNames();
            if (!keys.hasMoreElements()) {
              throw new Exception("Failed to read a property file for the "
                + "generic object editor");
            }
          } catch (Exception ex) {
            JOptionPane
              .showMessageDialog(
                null,
                "Could not read a configuration file for the generic object\n"
                  + "editor. An example file is included with the Weka distribution.\n"
                  + "This file should be named \"" + PROPERTY_FILE + "\" and\n"
                  + "should be placed either in your user home (which is set\n"
                  + "to \"" + System.getProperties().getProperty("user.home")
                  + "\")\n" + "or the directory that java was started from\n",
                "GenericObjectEditor", JOptionPane.ERROR_MESSAGE);
          }
        }
      }

      if (EDITOR_PROPERTIES == null) {
        JOptionPane.showMessageDialog(null,
          "Could not initialize the GenericPropertiesCreator. ",
          "GenericObjectEditor", JOptionPane.ERROR_MESSAGE);
      } else {
        PluginManager.addFromProperties(EDITOR_PROPERTIES);
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
        "Could not initialize the GenericPropertiesCreator. "
          + "This exception was produced:\n" + e.toString(),
        "GenericObjectEditor", JOptionPane.ERROR_MESSAGE);
    }
  }

=======
  /** whether the Weka Editors were already registered. */
  protected static boolean m_EditorsRegistered;

  /** for filtering the tree based on the Capabilities of the leaves. */
  protected Capabilities m_CapabilitiesFilter = null;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Loads the configuration property file (USE_DYNAMIC is FALSE) or determines
   * the classes dynamically (USE_DYNAMIC is TRUE)
   * 
   * @see #USE_DYNAMIC
   * @see GenericPropertiesCreator
   */
  static {
<<<<<<< HEAD
    determineClasses();
=======

    try {
      GenericPropertiesCreator creator = new GenericPropertiesCreator();

      // dynamic approach?
      if (creator.useDynamic()) {
        try {
          creator.execute(false);
          EDITOR_PROPERTIES = creator.getOutputProperties();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(
            null,
            Messages.getInstance().getString(
              "GenericObjectEditor_JOptionPaneShowMessageDialog_Text_First")
              + e.toString(),
            Messages.getInstance().getString(
              "GenericObjectEditor_JOptionPaneShowMessageDialog_Text_Second"),
            JOptionPane.ERROR_MESSAGE);
        }
      } else {
        // Allow a properties file in the current directory to override
        try {
          EDITOR_PROPERTIES = Utils.readProperties(PROPERTY_FILE);
          java.util.Enumeration keys = EDITOR_PROPERTIES.propertyNames();
          if (!keys.hasMoreElements()) {
            throw new Exception(Messages.getInstance().getString(
              "GenericObjectEditor_Exception_Text"));
          }
        } catch (Exception ex) {
          JOptionPane
            .showMessageDialog(
              null,
              Messages
                .getInstance()
                .getString(
                  "GenericObjectEditor_Exception_JOptionPaneShowMessageDialog_Text_First")
                + PROPERTY_FILE
                + Messages
                  .getInstance()
                  .getString(
                    "GenericObjectEditor_Exception_JOptionPaneShowMessageDialog_Text_Second")
                + System.getProperties().getProperty("user.home")
                + Messages
                  .getInstance()
                  .getString(
                    "GenericObjectEditor_Exception_JOptionPaneShowMessageDialog_Text_Third"),
              Messages
                .getInstance()
                .getString(
                  "GenericObjectEditor_Exception_JOptionPaneShowMessageDialog_Text_Fourth"),
              JOptionPane.ERROR_MESSAGE);
        }
      }
    } catch (Exception e) {
      JOptionPane
        .showMessageDialog(
          null,
          Messages
            .getInstance()
            .getString(
              "GenericObjectEditor_Exception_JOptionPaneShowMessageDialog_Text_Fifth")
            + e.toString(),
          Messages
            .getInstance()
            .getString(
              "GenericObjectEditor_Exception_JOptionPaneShowMessageDialog_Text_Sixth"),
          JOptionPane.ERROR_MESSAGE);
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * A specialized TreeNode for supporting filtering via Capabilities.
   */
  public class GOETreeNode extends DefaultMutableTreeNode {

    /** for serialization. */
    static final long serialVersionUID = -1707872446682150133L;

    /** color for "no support". */
    public final static String NO_SUPPORT = "silver";

    /** color for "maybe support". */
    public final static String MAYBE_SUPPORT = "blue";

    /** the Capabilities object to use for filtering. */
    protected Capabilities m_Capabilities = null;

    /** tool tip */
    protected String m_toolTipText;

    /**
     * Creates a tree node that has no parent and no children, but which allows
     * children.
     */
    public GOETreeNode() {
      super();
    }

    /**
     * Creates a tree node with no parent, no children, but which allows
     * children, and initializes it with the specified user object.
     * 
     * @param userObject an Object provided by the user that constitutes the
     *          node's data
     */
    public GOETreeNode(Object userObject) {
      super(userObject);
    }

    /**
     * Creates a tree node with no parent, no children, initialized with the
     * specified user object, and that allows children only if specified.
     * 
     * @param userObject an Object provided by the user that constitutes the
     *          node's data
     * @param allowsChildren if true, the node is allowed to have child nodes --
     *          otherwise, it is always a leaf node
     */
    public GOETreeNode(Object userObject, boolean allowsChildren) {
      super(userObject, allowsChildren);
    }

    /**
     * Set the tool tip for this node
     * 
     * @param tip the tool tip for this node
     */
    public void setToolTipText(String tip) {
      m_toolTipText = tip;
    }

    /**
     * Get the tool tip for this node
     * 
     * @return the tool tip for this node
     */
    public String getToolTipText() {
      return m_toolTipText;
    }

    /**
     * generates if necessary a Capabilities object for the given leaf.
     */
    protected void initCapabilities() {
      String classname;
<<<<<<< HEAD
      Class<?> cls;
=======
      Class cls;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      Object obj;

      if (m_Capabilities != null) {
        return;
      }
      if (!isLeaf()) {
        return;
      }

      classname = getClassnameFromPath(new TreePath(getPath()));
      try {
<<<<<<< HEAD
        // cls = Class.forName(classname);
        cls = WekaPackageClassLoaderManager.forName(classname);
        if (!InheritanceUtils.hasInterface(CapabilitiesHandler.class, cls)) {
=======
        cls = Class.forName(classname);
        if (!ClassDiscovery.hasInterface(CapabilitiesHandler.class, cls)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          return;
        }

        obj = cls.newInstance();
        m_Capabilities = ((CapabilitiesHandler) obj).getCapabilities();
      } catch (Exception e) {
        // ignore it
      }
    }

    /**
     * returns a string representation of this treenode.
     * 
     * @return the text to display
     */
    @Override
    public String toString() {
      String result;

      result = super.toString();

      if (m_CapabilitiesFilter != null) {
        initCapabilities();
        if (m_Capabilities != null) {
          if (m_Capabilities.supportsMaybe(m_CapabilitiesFilter)
            && !m_Capabilities.supports(m_CapabilitiesFilter)) {
<<<<<<< HEAD
            result = "<html><font color=\"" + MAYBE_SUPPORT + "\">" + result
              + "</font></i><html>";
          } else if (!m_Capabilities.supports(m_CapabilitiesFilter)) {
            result = "<html><font color=\"" + NO_SUPPORT + "\">" + result
              + "</font></i><html>";
=======
            result = "<html><font color=\"" 
              + MAYBE_SUPPORT
	      + "\">"
              + result
		+ "</font><html>";
          } else if (!m_Capabilities.supports(m_CapabilitiesFilter)) {
            result = "<html><font color=\"" 
              + NO_SUPPORT
              + "\">"
              + result
              + "</font><html>";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          }
        }
      }

      return result;
    }
  }

  /**
   * A dialog for selecting Capabilities to look for in the GOE tree.
   */
  public class CapabilitiesFilterDialog extends JDialog {

    /** for serialization. */
    static final long serialVersionUID = -7845503345689646266L;

    /** the dialog itself. */
    protected JDialog m_Self;

    /** the popup to display again. */
    protected JPopupMenu m_Popup = null;

    /** the capabilities used for initializing the dialog. */
    protected Capabilities m_Capabilities = new Capabilities(null);

    /** the label, listing the name of the superclass. */
    protected JLabel m_InfoLabel = new JLabel();

    /** the list with all the capabilities. */
    protected CheckBoxList m_List = new CheckBoxList();

    /** the OK button. */
<<<<<<< HEAD
    protected JButton m_OkButton = new JButton("OK");

    /** the Cancel button. */
    protected JButton m_CancelButton = new JButton("Cancel");
=======
    protected JButton m_OkButton = new JButton(Messages.getInstance()
      .getString(
        "GenericObjectEditor_CapabilitiesFilterDialog_OkButton_JButton_Text"));

    /** the Cancel button. */
    protected JButton m_CancelButton = new JButton(
      Messages
        .getInstance()
        .getString(
          "GenericObjectEditor_CapabilitiesFilterDialog_CancelButton_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    /**
     * creates a dialog to choose Capabilities from.
     */
    public CapabilitiesFilterDialog() {
      super();

      m_Self = this;

      initGUI();
    }

    /**
     * sets up the GUI.
     */
    protected void initGUI() {
      JPanel panel;
      CheckBoxListModel model;

<<<<<<< HEAD
      setTitle("Filtering Capabilities...");
=======
      setTitle(Messages.getInstance().getString(
        "GenericObjectEditor_InitGUI_SetTitle_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      setLayout(new BorderLayout());

      panel = new JPanel(new BorderLayout());
      panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      getContentPane().add(panel, BorderLayout.NORTH);
<<<<<<< HEAD
      m_InfoLabel.setText("<html>"
        + m_ClassType.getName().replaceAll(".*\\.", "") + "s"
        + " have to support <i>at least</i> the following capabilities <br>"
        + "(the ones highlighted <font color=\"" + GOETreeNode.NO_SUPPORT
        + "\">" + GOETreeNode.NO_SUPPORT
        + "</font> don't meet these requirements <br>"
        + "the ones highlighted  <font color=\"" + GOETreeNode.MAYBE_SUPPORT
        + "\">" + GOETreeNode.MAYBE_SUPPORT + "</font> possibly meet them):"
        + "</html>");
=======
      m_InfoLabel.setText(Messages.getInstance().getString(
        "GenericObjectEditor_InitGUI_InfoLabel_SetTitle_Text_First")
        + m_ClassType.getName().replaceAll(".*\\.", "")
        + Messages.getInstance().getString(
          "GenericObjectEditor_InitGUI_InfoLabel_SetTitle_Text_Second")
        + GOETreeNode.NO_SUPPORT
        + Messages.getInstance().getString(
          "GenericObjectEditor_InitGUI_InfoLabel_SetTitle_Text_Third")
        + GOETreeNode.NO_SUPPORT
        + Messages.getInstance().getString(
          "GenericObjectEditor_InitGUI_InfoLabel_SetTitle_Text_Fourth")
        + GOETreeNode.MAYBE_SUPPORT
        + Messages.getInstance().getString(
          "GenericObjectEditor_InitGUI_InfoLabel_SetTitle_Text_Fifth")
        + GOETreeNode.MAYBE_SUPPORT
        + Messages.getInstance().getString(
          "GenericObjectEditor_InitGUI_InfoLabel_SetTitle_Text_Sixth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      panel.add(m_InfoLabel, BorderLayout.CENTER);

      // list
      getContentPane().add(new JScrollPane(m_List), BorderLayout.CENTER);
      model = (CheckBoxListModel) m_List.getModel();
      for (Capability cap : Capability.values()) {
        model.addElement(cap);
      }

      // buttons
      panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
      getContentPane().add(panel, BorderLayout.SOUTH);

      m_OkButton.setMnemonic('O');
      m_OkButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          updateCapabilities();
          if (m_CapabilitiesFilter == null) {
            m_CapabilitiesFilter = new Capabilities(null);
          }
          m_CapabilitiesFilter.assign(m_Capabilities);
          m_Self.setVisible(false);
          showPopup();
        }
      });
      panel.add(m_OkButton);

      m_CancelButton.setMnemonic('C');
      m_CancelButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_Self.setVisible(false);
          showPopup();
        }
      });
      panel.add(m_CancelButton);
      pack();
    }

    /**
     * transfers the Capabilities object to the JList.
     * 
     * @see #m_Capabilities
     * @see #m_List
     */
    protected void updateList() {
      CheckBoxListModel model;

      model = (CheckBoxListModel) m_List.getModel();

      for (Capability cap : Capability.values()) {
        model.setChecked(model.indexOf(cap), m_Capabilities.handles(cap));
      }
    }

    /**
     * transfers the selected Capabilities from the JList to the Capabilities
     * object.
     * 
     * @see #m_Capabilities
     * @see #m_List
     */
    protected void updateCapabilities() {
      CheckBoxListModel model;

      model = (CheckBoxListModel) m_List.getModel();

      for (Capability cap : Capability.values()) {
        if (model.getChecked(model.indexOf(cap))) {
          m_Capabilities.enable(cap);
        } else {
          m_Capabilities.disable(cap);
        }
      }
    }

    /**
     * sets the initial capabilities.
     * 
     * @param value the capabilities to use
     */
    public void setCapabilities(Capabilities value) {
      if (value != null) {
        m_Capabilities.assign(value);
      } else {
        m_Capabilities = new Capabilities(null);
      }

      updateList();
    }

    /**
     * returns the currently selected capabilities.
     * 
     * @return the currently selected capabilities
     */
    public Capabilities getCapabilities() {
      return m_Capabilities;
    }

    /**
     * sets the JPopupMenu to display again after closing the dialog.
     * 
     * @param value the JPopupMenu to display again
     */
    public void setPopup(JPopupMenu value) {
      m_Popup = value;
    }

    /**
     * returns the currently set JPopupMenu.
     * 
     * @return the current JPopupMenu
     */
    public JPopupMenu getPopup() {
      return m_Popup;
    }

    /**
     * if a JPopupMenu is set, it is displayed again. Displaying this dialog
     * closes any JPopupMenu automatically.
     */
    public void showPopup() {
      if (getPopup() != null) {
        getPopup().setVisible(true);
      }
    }
  }

  /**
   * Creates a popup menu containing a tree that is aware of the screen
   * dimensions.
   */
  public class JTreePopupMenu extends JPopupMenu {

    /** for serialization. */
    static final long serialVersionUID = -3404546329655057387L;

    /** the popup itself. */
    private final JPopupMenu m_Self;

    /** The tree. */
    private final JTree m_tree;

    /** The scroller. */
    private final JScrollPane m_scroller;

    /** The filter button in case of CapabilitiesHandlers. */
<<<<<<< HEAD
    private final JButton m_FilterButton = new JButton("Filter...");

    /** The remove filter button in case of CapabilitiesHandlers. */
    private final JButton m_RemoveFilterButton = new JButton("Remove filter");

    /** The button for closing the popup again. */
    private final JButton m_CloseButton = new JButton("Close");
=======
    private final JButton m_FilterButton = new JButton(
      Messages.getInstance().getString(
        "GenericObjectEditor_JTreePopupMenu_FilterButton_JButton_Text"));

    /** The remove filter button in case of CapabilitiesHandlers. */
    private final JButton m_RemoveFilterButton = new JButton(Messages
      .getInstance().getString(
        "GenericObjectEditor_JTreePopupMenu_RemoveFilterButton_JButton_Text"));

    /** The button for closing the popup again. */
    private final JButton m_CloseButton = new JButton(Messages.getInstance()
      .getString("GenericObjectEditor_JTreePopupMenu_CloseButton_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    /**
     * Constructs a new popup menu.
     * 
     * @param tree the tree to put in the menu
     */
    public JTreePopupMenu(JTree tree) {

      m_Self = this;

      setLayout(new BorderLayout());
      JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      add(panel, BorderLayout.SOUTH);

<<<<<<< HEAD
      if (InheritanceUtils.hasInterface(CapabilitiesHandler.class, m_ClassType)) {
=======
      if (ClassDiscovery.hasInterface(CapabilitiesHandler.class, m_ClassType)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        // filter
        m_FilterButton.setMnemonic('F');
        m_FilterButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == m_FilterButton) {
              CapabilitiesFilterDialog dialog = new CapabilitiesFilterDialog();
              dialog.setCapabilities(m_CapabilitiesFilter);
              dialog.setPopup(m_Self);
<<<<<<< HEAD
              dialog.setLocationRelativeTo(m_Self);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
              dialog.setVisible(true);
              m_Support.firePropertyChange("", null, null);
              repaint();
            }
          }
        });
        panel.add(m_FilterButton);

        // remove
        m_RemoveFilterButton.setMnemonic('R');
        m_RemoveFilterButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            if (e.getSource() == m_RemoveFilterButton) {
              m_CapabilitiesFilter = null;
              m_Support.firePropertyChange("", null, null);
              repaint();
            }
          }
        });
        panel.add(m_RemoveFilterButton);
      }

      // close
      m_CloseButton.setMnemonic('C');
      m_CloseButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (e.getSource() == m_CloseButton) {
            m_Self.setVisible(false);
          }
        }
      });
      panel.add(m_CloseButton);

      m_tree = tree;

      JPanel treeView = new JPanel();
      treeView.setLayout(new BorderLayout());
      treeView.add(m_tree, BorderLayout.NORTH);

      // make backgrounds look the same
      treeView.setBackground(m_tree.getBackground());

      m_scroller = new JScrollPane(treeView);

<<<<<<< HEAD
      m_scroller.setPreferredSize(new Dimension(350, 500));
=======
      m_scroller.setPreferredSize(new Dimension(300, 400));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_scroller.getVerticalScrollBar().setUnitIncrement(20);

      add(m_scroller);
    }

    /**
     * Displays the menu, making sure it will fit on the screen.
     * 
     * @param invoker the component thast invoked the menu
     * @param x the x location of the popup
     * @param y the y location of the popup
     */
    @Override
    public void show(Component invoker, int x, int y) {

      super.show(invoker, x, y);

      // calculate available screen area for popup
<<<<<<< HEAD
      Rectangle r = new Rectangle();
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice[] gs = ge.getScreenDevices();
      for (int j = 0; j < gs.length; j++) {
        GraphicsDevice gd = gs[j];
        GraphicsConfiguration[] gc = gd.getConfigurations();
        for (int i =0 ; i < gc.length; i++) {
          r = r.union(gc[i].getBounds());
        }
      }

      java.awt.Point location = invoker.getLocationOnScreen();
      int maxWidth = (int) (r.getX() + r.getWidth() - location.getX());
      int maxHeight = (int) (r.getY() + r.getHeight() - location.getY());

      // if the part of the popup goes off the screen then resize it
      Dimension size = getPreferredSize();
      int height = (int) size.getHeight();
      int width = (int) size.getWidth();
=======
      java.awt.Point location = getLocationOnScreen();
      java.awt.Dimension screenSize = getToolkit().getScreenSize();
      int maxWidth = (int) (screenSize.getWidth() - location.getX());
      int maxHeight = (int) (screenSize.getHeight() - location.getY());

      // if the part of the popup goes off the screen then resize it
      Dimension scrollerSize = m_scroller.getPreferredSize();
      int height = (int) scrollerSize.getHeight();
      int width = (int) scrollerSize.getWidth();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (width > maxWidth) {
        width = maxWidth;
      }
      if (height > maxHeight) {
        height = maxHeight;
      }

      // commit any size changes
<<<<<<< HEAD
      setPreferredSize(new Dimension(width, height));
      setLocation(location);
      revalidate();
      pack();
      m_tree.requestFocusInWindow();
=======
      m_scroller.setPreferredSize(new Dimension(width, height));
      revalidate();
      pack();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Handles the GUI side of editing values.
   */
  public class GOEPanel extends JPanel {

    /** for serialization. */
    static final long serialVersionUID = 3656028520876011335L;

    /** The component that performs classifier customization. */
    protected PropertySheetPanel m_ChildPropertySheet;

    /** The name of the current class. */
    protected JLabel m_ClassNameLabel;

    /** Open object from disk. */
    protected JButton m_OpenBut;

    /** Save object to disk. */
    protected JButton m_SaveBut;

    /** ok button. */
    protected JButton m_okBut;

    /** cancel button. */
    protected JButton m_cancelBut;

    /** The filechooser for opening and saving object files. */
    protected JFileChooser m_FileChooser;

    /** Creates the GUI editor component. */
    public GOEPanel() {

      m_Backup = copyObject(m_Object);

<<<<<<< HEAD
      m_ClassNameLabel = new JLabel("None");
=======
      m_ClassNameLabel = new JLabel(Messages.getInstance().getString(
        "GenericObjectEditor_GOEPanel_ClassNameLabel_JLabel_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_ClassNameLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

      m_ChildPropertySheet = new PropertySheetPanel();
      m_ChildPropertySheet
        .addPropertyChangeListener(new PropertyChangeListener() {
          @Override
          public void propertyChange(PropertyChangeEvent evt) {
            m_Support.firePropertyChange("", null, null);
          }
        });

<<<<<<< HEAD
      m_OpenBut = new JButton("Open...");
      m_OpenBut.setToolTipText("Load a configured object");
=======
      m_OpenBut = new JButton(Messages.getInstance().getString(
        "GenericObjectEditor_OpenBut_JButton_Text"));
      m_OpenBut.setToolTipText(Messages.getInstance().getString(
        "GenericObjectEditor_OpenBut_SetToolTipText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_OpenBut.setEnabled(true);
      m_OpenBut.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          Object object = openObject();
          if (object != null) {
            // setValue takes care of: Making sure obj is of right type,
            // and firing property change.
            setValue(object);
            // Need a second setValue to get property values filled in OK.
            // Not sure why.
            setValue(object);
          }
        }
      });

<<<<<<< HEAD
      m_SaveBut = new JButton("Save...");
      m_SaveBut.setToolTipText("Save the current configured object");
=======
      m_SaveBut = new JButton(Messages.getInstance().getString(
        "GenericObjectEditor_SaveBut_JButton_Text"));
      m_SaveBut.setToolTipText(Messages.getInstance().getString(
        "GenericObjectEditor_SaveBut_SetToolTipText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_SaveBut.setEnabled(true);
      m_SaveBut.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          saveObject(m_Object);
        }
      });

<<<<<<< HEAD
      m_okBut = new JButton("OK");
=======
      m_okBut = new JButton(Messages.getInstance().getString(
        "GenericObjectEditor_OkBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_okBut.setEnabled(true);
      m_okBut.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

<<<<<<< HEAD
          m_ChildPropertySheet.closingOK();
          m_CancelWasPressed = false;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          m_Backup = copyObject(m_Object);
          if ((getTopLevelAncestor() != null)
            && (getTopLevelAncestor() instanceof Window)) {
            Window w = (Window) getTopLevelAncestor();
            w.dispose();
          }
        }
      });

<<<<<<< HEAD
      m_cancelBut = new JButton("Cancel");
=======
      m_cancelBut = new JButton(Messages.getInstance().getString(
        "GenericObjectEditor_CancelBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_cancelBut.setEnabled(true);
      m_cancelBut.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD

          m_ChildPropertySheet.closingCancel();
          m_CancelWasPressed = true;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          if (m_Backup != null) {

            m_Object = copyObject(m_Backup);

            // To fire property change
            m_Support.firePropertyChange("", null, null);
            m_ObjectNames = getClassesFromProperties();
            updateObjectNames();
            updateChildPropertySheet();
          }
          if ((getTopLevelAncestor() != null)
            && (getTopLevelAncestor() instanceof Window)) {
            Window w = (Window) getTopLevelAncestor();
            w.dispose();
          }
        }
      });

      setLayout(new BorderLayout());

      if (m_canChangeClassInDialog) {
        JButton chooseButton = createChooseClassButton();
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        top.add(chooseButton, BorderLayout.WEST);
        top.add(m_ClassNameLabel, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);
      } else {
        add(m_ClassNameLabel, BorderLayout.NORTH);
      }

      add(m_ChildPropertySheet, BorderLayout.CENTER);
      // Since we resize to the size of the property sheet, a scrollpane isn't
      // typically needed
      // add(new JScrollPane(m_ChildPropertySheet), BorderLayout.CENTER);

      JPanel okcButs = new JPanel();
      okcButs.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      okcButs.setLayout(new GridLayout(1, 4, 5, 5));
      okcButs.add(m_OpenBut);
      okcButs.add(m_SaveBut);
      okcButs.add(m_okBut);
      okcButs.add(m_cancelBut);
      add(okcButs, BorderLayout.SOUTH);

      if (m_ClassType != null) {
        m_ObjectNames = getClassesFromProperties();
        if (m_Object != null) {
          updateObjectNames();
          updateChildPropertySheet();
        }
      }
    }

    /**
     * Enables/disables the cancel button.
     * 
     * @param flag true to enable cancel button, false to disable it
     */
    protected void setCancelButton(boolean flag) {

      if (m_cancelBut != null) {
        m_cancelBut.setEnabled(flag);
      }
    }

    /**
     * Opens an object from a file selected by the user.
     * 
     * @return the loaded object, or null if the operation was cancelled
     */
    protected Object openObject() {

      if (m_FileChooser == null) {
        createFileChooser();
      }
      int returnVal = m_FileChooser.showOpenDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File selected = m_FileChooser.getSelectedFile();
        try {
<<<<<<< HEAD
          ObjectInputStream oi =
            SerializationHelper.getObjectInputStream(new BufferedInputStream(new FileInputStream(selected)));
          /* ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(
            new FileInputStream(selected))); */
          Object obj = oi.readObject();
          oi.close();
          if (!m_ClassType.isAssignableFrom(obj.getClass())) {
            throw new Exception("Object not of type: " + m_ClassType.getName());
          }
          return obj;
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, "Couldn't read object: "
            + selected.getName() + "\n" + ex.getMessage(), "Open object file",
            JOptionPane.ERROR_MESSAGE);
=======
          ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(
            new FileInputStream(selected)));
          Object obj = oi.readObject();
          oi.close();
          if (!m_ClassType.isAssignableFrom(obj.getClass())) {
            throw new Exception(Messages.getInstance().getString(
              "GenericObjectEditor_OpenObject_Exception_Text")
              + m_ClassType.getName());
          }
          return obj;
        } catch (Exception ex) {
          JOptionPane
            .showMessageDialog(
              this,
              Messages
                .getInstance()
                .getString(
                  "GenericObjectEditor_OpenObject_Exception_JOptionPaneShowMessageDialog_Text")
                + selected.getName()
                + Messages
                  .getInstance()
                  .getString(
                    "GenericObjectEditor_OpenObject_Exception_JOptionPaneShowMessageDialog_Text")
                + ex.getMessage(),
              Messages
                .getInstance()
                .getString(
                  "GenericObjectEditor_OpenObject_Exception_JOptionPaneShowMessageDialog_Text"),
              JOptionPane.ERROR_MESSAGE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
      return null;
    }

    /**
     * Saves an object to a file selected by the user.
     * 
     * @param object the object to save
     */
    protected void saveObject(Object object) {

      if (m_FileChooser == null) {
        createFileChooser();
      }
      int returnVal = m_FileChooser.showSaveDialog(this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File sFile = m_FileChooser.getSelectedFile();
        try {
          ObjectOutputStream oo = new ObjectOutputStream(
            new BufferedOutputStream(new FileOutputStream(sFile)));
          oo.writeObject(object);
          oo.close();
        } catch (Exception ex) {
<<<<<<< HEAD
          JOptionPane.showMessageDialog(this, "Couldn't write to file: "
            + sFile.getName() + "\n" + ex.getMessage(), "Save object",
            JOptionPane.ERROR_MESSAGE);
=======
          JOptionPane
            .showMessageDialog(
              this,
              Messages
                .getInstance()
                .getString(
                  "GenericObjectEditor_SaveObject_Exception_JOptionPaneShowMessageDialog_Text")
                + sFile.getName()
                + Messages
                  .getInstance()
                  .getString(
                    "GenericObjectEditor_SaveObject_Exception_JOptionPaneShowMessageDialog_Text")
                + ex.getMessage(),
              Messages
                .getInstance()
                .getString(
                  "GenericObjectEditor_SaveObject_Exception_JOptionPaneShowMessageDialog_Text"),
              JOptionPane.ERROR_MESSAGE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    }

    /**
     * Creates the file chooser the user will use to save/load files with.
     */
    protected void createFileChooser() {

      m_FileChooser = new JFileChooser(new File(System.getProperty("user.dir")));
      m_FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

    /**
     * Makes a copy of an object using serialization.
     * 
     * @param source the object to copy
     * @return a copy of the source object
     */
    protected Object copyObject(Object source) {

      Object result = null;
      try {
<<<<<<< HEAD
        result = GenericObjectEditor.makeCopy(source);
=======
        result = GenericObjectEditor.this.makeCopy(source);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        setCancelButton(true);

      } catch (Exception ex) {
        setCancelButton(false);
<<<<<<< HEAD
        Logger.log(weka.core.logging.Logger.Level.WARNING,
          "GenericObjectEditor: Problem making backup object");
        Logger.log(weka.core.logging.Logger.Level.WARNING, ex);
=======
        System.err.println(Messages.getInstance().getString(
          "GenericObjectEditor_CopyObject_Error_Text"));
        System.err.println(ex);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      return result;
    }

    /**
     * Allows customization of the action label on the dialog.
     * 
     * @param newLabel the new string for the ok button
     */
    public void setOkButtonText(String newLabel) {

      m_okBut.setText(newLabel);
    }

    /**
     * This is used to hook an action listener to the ok button.
     * 
     * @param a The action listener.
     */
    public void addOkListener(ActionListener a) {

      m_okBut.addActionListener(a);
    }

    /**
     * This is used to hook an action listener to the cancel button.
     * 
     * @param a The action listener.
     */
    public void addCancelListener(ActionListener a) {

      m_cancelBut.addActionListener(a);
    }

    /**
     * This is used to remove an action listener from the ok button.
     * 
     * @param a The action listener
     */
    public void removeOkListener(ActionListener a) {

      m_okBut.removeActionListener(a);
    }

    /**
     * This is used to remove an action listener from the cancel button.
     * 
     * @param a The action listener
     */
    public void removeCancelListener(ActionListener a) {

      m_cancelBut.removeActionListener(a);
    }

    /**
     * Updates the child property sheet, and creates if needed.
     */
    public void updateChildPropertySheet() {

      // Update the object name displayed
<<<<<<< HEAD
      String className = "None";
=======
      String className = Messages.getInstance().getString(
        "GenericObjectEditor_UpdateChildPropertySheet_ClassName_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (m_Object != null) {
        className = m_Object.getClass().getName();
      }
      m_ClassNameLabel.setText(className);

      // Set the object as the target of the propertysheet
      m_ChildPropertySheet.setTarget(m_Object);

      // Adjust size of containing window if possible
      if ((getTopLevelAncestor() != null)
        && (getTopLevelAncestor() instanceof Window)) {
        ((Window) getTopLevelAncestor()).pack();
      }
    }
  }

  /**
   * Default constructor.
   */
  public GenericObjectEditor() {
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    this(false);
  }

  /**
   * Constructor that allows specifying whether it is possible to change the
   * class within the editor dialog.
   * 
   * @param canChangeClassInDialog whether the user can change the class
   */
  public GenericObjectEditor(boolean canChangeClassInDialog) {
<<<<<<< HEAD
    m_canChangeClassInDialog = canChangeClassInDialog;
    m_History = new GenericObjectEditorHistory();
    ToolTipManager.sharedInstance().setDismissDelay(7000);
=======

    m_canChangeClassInDialog = canChangeClassInDialog;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * registers all the editors in Weka.
   */
  public static void registerEditors() {
    Properties props;
<<<<<<< HEAD
    Enumeration<?> enm;
    String name;
    String value;
=======
    Enumeration enm;
    String name;
    String value;
    Class baseCls;
    Class cls;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_EditorsRegistered) {
      return;
    }

<<<<<<< HEAD
    Logger.log(weka.core.logging.Logger.Level.INFO,
      "---Registering Weka Editors---");
=======
    System.err.println(Messages.getInstance().getString(
      "GenericObjectEditor_RegisterEditors_Error_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_EditorsRegistered = true;

    // load properties
    try {
      props = Utils.readProperties(GUIEDITORS_PROPERTY_FILE);
    } catch (Exception e) {
      props = new Properties();
      e.printStackTrace();
    }

<<<<<<< HEAD
    // show the tool tip?
    m_ShowGlobalInfoToolTip = props.getProperty(
      "ShowGlobalInfoToolTip", "true").equals("true");

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    enm = props.propertyNames();
    while (enm.hasMoreElements()) {
      name = enm.nextElement().toString();
      value = props.getProperty(name, "");
<<<<<<< HEAD

      registerEditor(name, value);
    }
  }

  public static void registerEditor(String name, String value) {

    // skip (and don't try to instantiate) the ShowGlobalInfoToolTip
    // property as a class; and any other non-class properties. Makes
    // the assumption that anything that should be instantiated is not
    // in the default package.
    if (!name.contains(".")) {
      return;
    }

    Class<?> baseCls;
    Class<?> cls;

    try {
      // array class?
      if (name.endsWith("[]")) {
        //baseCls = Class.forName(name.substring(0, name.indexOf("[]")));
        baseCls = WekaPackageClassLoaderManager.forName(name.substring(0, name.indexOf("[]")));
        cls = Array.newInstance(baseCls, 1).getClass();
      } else {
        // cls = Class.forName(name);
        cls = WekaPackageClassLoaderManager.forName(name);
      }
      // register
      //PropertyEditorManager.registerEditor(cls, Class.forName(value));
      PropertyEditorManager.registerEditor(cls, WekaPackageClassLoaderManager.forName(value));
    } catch (Exception e) {
      Logger.log(weka.core.logging.Logger.Level.WARNING, "Problem registering "
        + name + "/" + value + ": " + e);
=======
      try {
        // array class?
        if (name.endsWith("[]")) {
          baseCls = Class.forName(name.substring(0, name.indexOf("[]")));
          cls = Array.newInstance(baseCls, 1).getClass();
        } else {
          cls = Class.forName(name);
        }
        // register
        PropertyEditorManager.registerEditor(cls, Class.forName(value));
      } catch (Exception e) {
        System.err.println(Messages.getInstance().getString(
          "GenericObjectEditor_RegisterEditors_Exception_Error_Text_First")
          + name
          + Messages.getInstance().getString(
            "GenericObjectEditor_RegisterEditors_Exception_Error_Text_Second")
          + value
          + Messages.getInstance().getString(
            "GenericObjectEditor_RegisterEditors_Exception_Error_Text_Third")
          + e);
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Sets whether the user can change the class in the dialog.
   * 
   * @param value if true then the user can change the class
   */
  public void setCanChangeClassInDialog(boolean value) {
    m_canChangeClassInDialog = value;
  }

  /**
   * Returns whether the user can change the class in the dialog.
   * 
   * @return true if the user can change the class
   */
  public boolean getCanChangeClassInDialog() {
    return m_canChangeClassInDialog;
  }

  /**
   * Returns the backup object (may be null if there is no backup.
   * 
   * @return the backup object
   */
  public Object getBackup() {
    return m_Backup;
  }

  /**
   * returns the name of the root element of the given class name,
   * <code>null</code> if it doesn't contain the separator.
   * 
   * @param clsname the full classname
   * @param separator the separator
   * @return string the root element
   */
  protected static String getRootFromClass(String clsname, String separator) {
    if (clsname.indexOf(separator) > -1) {
      return clsname.substring(0, clsname.indexOf(separator));
    } else {
      return null;
    }
  }

  /**
   * parses the given string of classes separated by ", " and returns the a
   * hashtable with as many entries as there are different root elements in the
   * class names (the key is the root element). E.g. if there's only "weka." as
   * the prefix for all classes the a hashtable of size 1 is returned. if NULL
   * is the input, then NULL is also returned.
   * 
   * @param classes the classnames to work on
   * @return for each distinct root element in the classnames, one entry in the
   *         hashtable (with the root element as key)
   */
<<<<<<< HEAD
  public static Hashtable<String, String> sortClassesByRoot(String classes) {
    Hashtable<String, Vector<String>> roots;
    Hashtable<String, String> result;
    Enumeration<String> enm;
    int i;
    StringTokenizer tok;
    String clsname;
    Vector<String> list;
=======
  public static Hashtable sortClassesByRoot(String classes) {
    Hashtable roots;
    Hashtable result;
    Enumeration enm;
    int i;
    StringTokenizer tok;
    String clsname;
    Vector list;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    HierarchyPropertyParser hpp;
    String separator;
    String root;
    String tmpStr;

    if (classes == null) {
      return null;
    }

<<<<<<< HEAD
    roots = new Hashtable<String, Vector<String>>();
=======
    roots = new Hashtable();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    hpp = new HierarchyPropertyParser();
    separator = hpp.getSeperator();

    // go over all classnames and store them in the hashtable, with the
    // root element as the key
    tok = new StringTokenizer(classes, ", ");
    while (tok.hasMoreElements()) {
      clsname = tok.nextToken();
      root = getRootFromClass(clsname, separator);
      if (root == null) {
        continue;
      }

      // already stored?
      if (!roots.containsKey(root)) {
<<<<<<< HEAD
        list = new Vector<String>();
        roots.put(root, list);
      } else {
        list = roots.get(root);
=======
        list = new Vector();
        roots.put(root, list);
      } else {
        list = (Vector) roots.get(root);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      list.add(clsname);
    }

    // build result
<<<<<<< HEAD
    result = new Hashtable<String, String>();
    enm = roots.keys();
    while (enm.hasMoreElements()) {
      root = enm.nextElement();
      list = roots.get(root);
=======
    result = new Hashtable();
    enm = roots.keys();
    while (enm.hasMoreElements()) {
      root = (String) enm.nextElement();
      list = (Vector) roots.get(root);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      tmpStr = "";
      for (i = 0; i < list.size(); i++) {
        if (i > 0) {
          tmpStr += ",";
        }
<<<<<<< HEAD
        tmpStr += list.get(i);
=======
        tmpStr += (String) list.get(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      result.put(root, tmpStr);
    }

    return result;
  }

  /**
   * Called when the class of object being edited changes.
   * 
   * @return the hashtable containing the HierarchyPropertyParsers for the root
   *         elements
   */
<<<<<<< HEAD
  protected Hashtable<String, HierarchyPropertyParser> getClassesFromProperties() {

    Hashtable<String, HierarchyPropertyParser> hpps = new Hashtable<String, HierarchyPropertyParser>();
    String className = m_ClassType.getName();
    Set<String> cls = PluginManager.getPluginNamesOfType(className);
    if (cls == null) {
      return hpps;
    }
    List<String> toSort = new ArrayList<String>(cls);
    Collections.sort(toSort, new ClassDiscovery.StringCompare());

    StringBuilder b = new StringBuilder();
    for (String s : toSort) {
      b.append(s).append(",");
    }
    String listS = b.substring(0, b.length() - 1);
    // Hashtable typeOptions =
    // sortClassesByRoot(EDITOR_PROPERTIES.getProperty(className));
    Hashtable<String, String> typeOptions = sortClassesByRoot(listS);
=======
  protected Hashtable getClassesFromProperties() {

    Hashtable hpps = new Hashtable();
    String className = m_ClassType.getName();
    Hashtable typeOptions = sortClassesByRoot(EDITOR_PROPERTIES
      .getProperty(className));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (typeOptions == null) {
      /*
       * System.err.println("Warning: No configuration property found in\n" +
       * PROPERTY_FILE + "\n" + "for " + className);
       */
    } else {
      try {
<<<<<<< HEAD
        Enumeration<String> enm = typeOptions.keys();
        while (enm.hasMoreElements()) {
          String root = enm.nextElement();
          String typeOption = typeOptions.get(root);
=======
        Enumeration enm = typeOptions.keys();
        while (enm.hasMoreElements()) {
          String root = (String) enm.nextElement();
          String typeOption = (String) typeOptions.get(root);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          HierarchyPropertyParser hpp = new HierarchyPropertyParser();
          hpp.build(typeOption, ", ");
          hpps.put(root, hpp);
        }
      } catch (Exception ex) {
<<<<<<< HEAD
        Logger.log(weka.core.logging.Logger.Level.WARNING, "Invalid property: "
=======
        System.err.println(Messages.getInstance().getString(
          "GenericObjectEditor_GetClassesFromProperties_Exception_Error_Text")
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          + typeOptions);
      }
    }
    return hpps;
  }

  /**
   * Updates the list of selectable object names, adding any new names to the
   * list.
   */
  protected void updateObjectNames() {

    if (m_ObjectNames == null) {
      m_ObjectNames = getClassesFromProperties();
    }

    if (m_Object != null) {
      String className = m_Object.getClass().getName();
      String root = getRootFromClass(className,
        new HierarchyPropertyParser().getSeperator());
<<<<<<< HEAD
      HierarchyPropertyParser hpp = m_ObjectNames.get(root);
=======
      HierarchyPropertyParser hpp = (HierarchyPropertyParser) m_ObjectNames
        .get(root);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (hpp != null) {
        if (!hpp.contains(className)) {
          hpp.add(className);
        }
      }
    }
  }

  /**
   * Sets whether the editor is "enabled", meaning that the current values will
   * be painted.
   * 
   * @param newVal a value of type 'boolean'
   */
  public void setEnabled(boolean newVal) {

    if (newVal != m_Enabled) {
      m_Enabled = newVal;
    }
  }

  /**
   * Sets the class of values that can be edited.
   * 
   * @param type a value of type 'Class'
   */
<<<<<<< HEAD
  public void setClassType(Class<?> type) {
=======
  public void setClassType(Class type) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_ClassType = type;
    m_ObjectNames = getClassesFromProperties();
  }

  /**
   * Sets the current object to be the default, taken as the first item in the
   * chooser.
   */
  public void setDefaultValue() {

    if (m_ClassType == null) {
<<<<<<< HEAD
      Logger.log(weka.core.logging.Logger.Level.WARNING,
        "No ClassType set up for GenericObjectEditor!!");
      return;
    }

    Hashtable<String, HierarchyPropertyParser> hpps = getClassesFromProperties();
    HierarchyPropertyParser hpp = null;
    Enumeration<HierarchyPropertyParser> enm = hpps.elements();

    try {
      while (enm.hasMoreElements()) {
        hpp = enm.nextElement();
=======
      System.err.println(Messages.getInstance().getString(
        "GenericObjectEditor_SetDefaultValue_Error_Text"));
      return;
    }

    Hashtable hpps = getClassesFromProperties();
    HierarchyPropertyParser hpp = null;
    Enumeration enm = hpps.elements();

    try {
      while (enm.hasMoreElements()) {
        hpp = (HierarchyPropertyParser) enm.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        if (hpp.depth() > 0) {
          hpp.goToRoot();
          while (!hpp.isLeafReached()) {
            hpp.goToChild(0);
          }

          String defaultValue = hpp.fullValue();
<<<<<<< HEAD
          // setValue(Class.forName(defaultValue).newInstance());
          setValue(WekaPackageClassLoaderManager.forName(defaultValue).newInstance());
        }
      }
    } catch (Exception ex) {
      Logger.log(weka.core.logging.Logger.Level.WARNING,
        "Problem loading the first class: " + hpp.fullValue());
=======
          setValue(Class.forName(defaultValue).newInstance());
        }
      }
    } catch (Exception ex) {
      System.err.println(Messages.getInstance().getString(
        "GenericObjectEditor_SetDefaultValue_Exception_Error_Text")
        + hpp.fullValue());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
    }
  }

  /**
<<<<<<< HEAD
   * True if the cancel button was used to close the editor.
   *
   * @return true if the cancel button was pressed the last time the
   * editor was closed
   */
  public boolean wasCancelPressed() {
    return m_CancelWasPressed;
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Sets the current Object. If the Object is in the Object chooser, this
   * becomes the selected item (and added to the chooser if necessary).
   * 
   * @param o an object that must be a Object.
   */
  @Override
  public void setValue(Object o) {

    if (m_ClassType == null) {
<<<<<<< HEAD
      JOptionPane.showMessageDialog(null,
              "No ClassType set up for GenericObjectEditor.", "Error...",
              JOptionPane.ERROR_MESSAGE);
      Logger.log(weka.core.logging.Logger.Level.WARNING,
        "No ClassType set up for GenericObjectEditor!");
      return;
    }
    if (!m_ClassType.isAssignableFrom(o.getClass())) {
      JOptionPane.showMessageDialog(null,
              "Object not of correct type and cannot be assigned.", "Error...",
              JOptionPane.ERROR_MESSAGE);
      Logger.log(weka.core.logging.Logger.Level.WARNING,
        "Object not of correct type and cannot be assigned!");
=======
      System.err.println(Messages.getInstance().getString(
        "GenericObjectEditor_SetValue_Error_Text_First"));
      return;
    }
    if (!m_ClassType.isAssignableFrom(o.getClass())) {
      System.err.println(Messages.getInstance().getString(
        "GenericObjectEditor_SetValue_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return;
    }

    setObject(o);

    if (m_EditorComponent != null) {
      m_EditorComponent.repaint();
    }

    updateObjectNames();
<<<<<<< HEAD
    m_CancelWasPressed = false;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Sets the current Object.
   * 
   * @param c a value of type 'Object'
   */
  protected void setObject(Object c) {

    // This should really call equals() for comparison.
    boolean trueChange;
    if (getValue() != null) {
      trueChange = (!c.equals(getValue()));
    } else {
      trueChange = true;
    }

    m_Backup = m_Object;

    m_Object = c;

    if (m_EditorComponent != null) {
      m_EditorComponent.updateChildPropertySheet();
    }
    if (trueChange) {
      m_Support.firePropertyChange("", null, null);
    }
  }

  /**
   * Gets the current Object.
   * 
   * @return the current Object
   */
  @Override
  public Object getValue() {

    Object result = null;
    try {
      result = makeCopy(m_Object);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return result;
  }

  /**
   * Supposedly returns an initialization string to create a Object identical to
   * the current one, including it's state, but this doesn't appear possible
   * given that the initialization string isn't supposed to contain multiple
   * statements.
   * 
   * @return the java source code initialisation string
   */
  @Override
  public String getJavaInitializationString() {

    return "new " + m_Object.getClass().getName() + "()";
  }

  /**
   * Returns true to indicate that we can paint a representation of the Object.
   * 
   * @return true
   */
  @Override
  public boolean isPaintable() {

    return true;
  }

  /**
   * Paints a representation of the current Object.
   * 
   * @param gfx the graphics context to use
   * @param box the area we are allowed to paint into
   */
  @Override
  public void paintValue(java.awt.Graphics gfx, java.awt.Rectangle box) {

    if (m_Enabled) {
      String rep;
      if (m_Object != null) {
<<<<<<< HEAD
        if (m_Object instanceof CustomDisplayStringProvider) {
          rep = ((CustomDisplayStringProvider) m_Object).toDisplay();
        } else {
          rep = m_Object.getClass().getName();
          int dotPos = rep.lastIndexOf('.');
          if (dotPos != -1) {
            rep = rep.substring(dotPos + 1);
          }
        }
      } else {
        rep = "None";
      }
=======
        rep = m_Object.getClass().getName();
      } else {
        rep = Messages.getInstance().getString(
          "GenericObjectEditor_PaintValue_Rep_Text");
      }
      int dotPos = rep.lastIndexOf('.');
      if (dotPos != -1) {
        rep = rep.substring(dotPos + 1);
      }
      /*
       * if (m_Object instanceof OptionHandler) { rep += " " +
       * Utils.joinOptions(((OptionHandler)m_Object) .getOptions()); }
       */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      java.awt.Font originalFont = gfx.getFont();
      gfx.setFont(originalFont.deriveFont(java.awt.Font.BOLD));

      FontMetrics fm = gfx.getFontMetrics();
      int vpad = (box.height - fm.getHeight());
      gfx.drawString(rep, 2, fm.getAscent() + vpad);
      int repwidth = fm.stringWidth(rep);

      gfx.setFont(originalFont);
<<<<<<< HEAD
      if ((m_Object instanceof OptionHandler)
        && !(m_Object instanceof CustomDisplayStringProvider)) {
=======
      if (m_Object instanceof OptionHandler) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        gfx.drawString(
          " " + Utils.joinOptions(((OptionHandler) m_Object).getOptions()),
          repwidth + 2, fm.getAscent() + vpad);
      }
    }
  }

  /**
   * Returns null as we don't support getting/setting values as text.
   * 
   * @return null
   */
  @Override
  public String getAsText() {

    return null;
  }

  /**
   * Returns null as we don't support getting/setting values as text.
   * 
   * @param text the text value
   * @throws IllegalArgumentException as we don't support getting/setting values
   *           as text.
   */
  @Override
  public void setAsText(String text) {

    throw new IllegalArgumentException(text);
  }

  /**
   * Returns null as we don't support getting values as tags.
   * 
   * @return null
   */
  @Override
  public String[] getTags() {

    return null;
  }

  /**
   * Returns true because we do support a custom editor.
   * 
   * @return true
   */
  @Override
  public boolean supportsCustomEditor() {

    return true;
  }

  /**
   * Returns the array editing component.
   * 
   * @return a value of type 'java.awt.Component'
   */
  @Override
  public java.awt.Component getCustomEditor() {

    if (m_EditorComponent == null) {
      m_EditorComponent = new GOEPanel();
    }
    return m_EditorComponent;
  }

  /**
   * Adds a PropertyChangeListener who will be notified of value changes.
   * 
   * @param l a value of type 'PropertyChangeListener'
   */
  @Override
  public void addPropertyChangeListener(PropertyChangeListener l) {

    m_Support.addPropertyChangeListener(l);
  }

  /**
   * Removes a PropertyChangeListener.
   * 
   * @param l a value of type 'PropertyChangeListener'
   */
  @Override
  public void removePropertyChangeListener(PropertyChangeListener l) {

    m_Support.removePropertyChangeListener(l);
  }

  /**
   * Gets the custom panel used for editing the object.
   * 
   * @return the panel
   */
  @Override
  public JPanel getCustomPanel() {
    final JButton chooseButton = createChooseClassButton();
    m_ObjectPropertyPanel = new PropertyPanel(this, true);

    JPanel customPanel = new JPanel() {
<<<<<<< HEAD

      /** ID added to avoid warning */
      private static final long serialVersionUID = 1024049543672124980L;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      @Override
      public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        chooseButton.setEnabled(enabled);
      }
    };
    customPanel.setLayout(new BorderLayout());
    customPanel.add(chooseButton, BorderLayout.WEST);
    customPanel.add(m_ObjectPropertyPanel, BorderLayout.CENTER);
    return customPanel;
  }

  /**
   * Creates a button that when clicked will enable the user to change the class
   * of the object being edited.
   * 
   * @return the choose button
   */
  protected JButton createChooseClassButton() {

<<<<<<< HEAD
    JButton setButton = new JButton("Choose");
=======
    JButton setButton = new JButton(Messages.getInstance().getString(
      "GenericObjectEditor_CreateChooseClassButton_SetButton_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // anonymous action listener shows a JTree popup and allows the user
    // to choose the class they want
    setButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        JPopupMenu popup = getChooseClassPopupMenu();

        // show the popup where the source component is
        if (e.getSource() instanceof Component) {
          Component comp = (Component) e.getSource();
          popup.show(comp, comp.getX(), comp.getY());
<<<<<<< HEAD
=======
          popup.pack();
          popup.repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    });

    return setButton;
  }

  /**
   * creates a classname from the given path.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param path the path to generate the classname from
   * @return the generated classname
   */
  protected String getClassnameFromPath(TreePath path) {
    StringBuffer classname = new StringBuffer();

    // recreate class name from path
    int start = 0;
    if (m_ObjectNames.size() > 1) {
      start = 1;
    }

    for (int i = start; i < path.getPathCount(); i++) {
      if (i > start) {
        classname.append(".");
      }
<<<<<<< HEAD
      classname.append((String) ((GOETreeNode) path.getPathComponent(i)).getUserObject());
=======
      classname.append((String) ((GOETreeNode) path.getPathComponent(i))
        .getUserObject());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return classname.toString();
  }

  /**
   * Returns a popup menu that allows the user to change the class of object.
   * 
   * @return a JPopupMenu that when shown will let the user choose the class
   */
  public JPopupMenu getChooseClassPopupMenu() {

    updateObjectNames();

    // create the tree, and find the path to the current class
    m_treeNodeOfCurrentObject = null;
    final JTree tree = createTree(m_ObjectNames);
    if (m_treeNodeOfCurrentObject != null) {
      tree.setSelectionPath(new TreePath(m_treeNodeOfCurrentObject.getPath()));
<<<<<<< HEAD
    } else {
      TreePath path = tree.getPathForRow(0);
      if (path != null) {
        tree.setSelectionPath(path);
      }
    }
    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
=======
    }
    tree.getSelectionModel().setSelectionMode(
      TreeSelectionModel.SINGLE_TREE_SELECTION);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // create the popup
    final JPopupMenu popup = new JTreePopupMenu(tree);

<<<<<<< HEAD
    //  respond when the user chooses a class
    tree.addTreeSelectionListener(new TreeSelectionListener() {

=======
    // respond when the user chooses a class
    tree.addTreeSelectionListener(new TreeSelectionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      @Override
      public void valueChanged(TreeSelectionEvent e) {
        GOETreeNode node = (GOETreeNode) tree.getLastSelectedPathComponent();

        if (node == null) {
          return;
        }

        if (node.isLeaf()) {
<<<<<<< HEAD
          classSelected(getClassnameFromPath(tree.getSelectionPath()));
        }
      }
    });

    MouseListener ml = new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        if(tree.getRowForLocation(e.getX(), e.getY()) != -1) {
          if(e.getClickCount() == 1) {
            popup.setVisible(false);
          }
        }
      }
    };
    tree.addMouseListener(ml);

    tree.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter_action");
    tree.getActionMap().put("enter_action", new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        if (((GOETreeNode)tree.getLastSelectedPathComponent()).isLeaf()) {
=======
          /*
           * if (node.m_Capabilities != null && m_CapabilitiesFilter != null) {
           * if (!node.m_Capabilities.supportsMaybe(m_CapabilitiesFilter) &&
           * !node.m_Capabilities.supports(m_CapabilitiesFilter)) { return; } }
           */
          classSelected(getClassnameFromPath(tree.getSelectionPath()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          popup.setVisible(false);
        }
      }
    });

<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return popup;
  }

  /**
   * Creates a JTree from an object heirarchy.
   * 
   * @param hpps the hierarchy of objects to mirror in the tree
   * @return a JTree representation of the hierarchy
   */
<<<<<<< HEAD
  protected JTree createTree(Hashtable<String, HierarchyPropertyParser> hpps) {
    GOETreeNode superRoot;
    Enumeration<HierarchyPropertyParser> enm;
    HierarchyPropertyParser hpp;

    if (hpps.size() > 1) {
      superRoot = new GOETreeNode("root");
=======
  protected JTree createTree(Hashtable hpps) {
    GOETreeNode superRoot;
    Enumeration enm;
    HierarchyPropertyParser hpp;

    if (hpps.size() > 1) {
      superRoot = new GOETreeNode(Messages.getInstance().getString(
        "GenericObjectEditor_CreateTree_GOETreeNode_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      superRoot = null;
    }

    enm = hpps.elements();
    while (enm.hasMoreElements()) {
<<<<<<< HEAD
      hpp = enm.nextElement();
=======
      hpp = (HierarchyPropertyParser) enm.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      hpp.goToRoot();
      GOETreeNode root = new GOETreeNode(hpp.getValue());
      addChildrenToTree(root, hpp);

      if (superRoot == null) {
        superRoot = root;
      } else {
        superRoot.add(root);
      }
    }

    JTree tree = new JTree(superRoot) {

      /** For serialization */
      private static final long serialVersionUID = 6991903188102450549L;

      @Override
      public String getToolTipText(MouseEvent e) {
        if ((getRowForLocation(e.getX(), e.getY())) == -1) {
          return null;
        }
        TreePath currPath = getPathForLocation(e.getX(), e.getY());
        if (currPath.getLastPathComponent() instanceof DefaultMutableTreeNode) {
          DefaultMutableTreeNode node = (DefaultMutableTreeNode) currPath
            .getLastPathComponent();

          if (node.isLeaf()) {

            return ((GOETreeNode) node).getToolTipText();
          }
        }
        return null;
      }
    };
    tree.setToolTipText("");

    return tree;
  }

  /**
   * Recursively builds a JTree from an object heirarchy. Also updates
   * m_treeNodeOfCurrentObject if the current object is discovered during
   * creation.
   * 
   * @param tree the root of the tree to add children to
   * @param hpp the hierarchy of objects to mirror in the tree
   */
  protected void addChildrenToTree(GOETreeNode tree, HierarchyPropertyParser hpp) {

    try {
      for (int i = 0; i < hpp.numChildren(); i++) {
        hpp.goToChild(i);
        GOETreeNode child = new GOETreeNode(hpp.getValue());
        if ((m_Object != null)
          && m_Object.getClass().getName().equals(hpp.fullValue())) {
          m_treeNodeOfCurrentObject = child;
        }
        tree.add(child);

<<<<<<< HEAD
        if (hpp.isLeafReached() && m_ShowGlobalInfoToolTip) {
          String algName = hpp.fullValue();
          try {
            // Object alg = Class.forName(algName).newInstance();
            Object alg = WekaPackageClassLoaderManager.forName(algName).newInstance();
=======
        if (hpp.isLeafReached()) {
          String algName = hpp.fullValue();
          try {
            Object alg = Class.forName(algName).newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            String toolTip = Utils.getGlobalInfo(alg, true);
            if (toolTip != null) {
              child.setToolTipText(toolTip);
            }
          } catch (Exception ex) {
          }
        }

        addChildrenToTree(child, hpp);
        hpp.goToParent();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Called when the user selects an class type to change to.
   * 
   * @param className the name of the class that was selected
   */
  protected void classSelected(String className) {

    try {
      if ((m_Object != null) && m_Object.getClass().getName().equals(className)) {
        return;
      }

<<<<<<< HEAD
      //setValue(Class.forName(className).newInstance());
      setValue(WekaPackageClassLoaderManager.forName(className).newInstance());
=======
      setValue(Class.forName(className).newInstance());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // m_ObjectPropertyPanel.showPropertyDialog();
      if (m_EditorComponent != null) {
        m_EditorComponent.updateChildPropertySheet();
      }
    } catch (Exception ex) {
<<<<<<< HEAD
      JOptionPane.showMessageDialog(null, "Could not create an example of\n"
        + className + "\n" + "from the current classpath", "Class load failed",
        JOptionPane.ERROR_MESSAGE);
=======
      JOptionPane
        .showMessageDialog(
          null,
          Messages
            .getInstance()
            .getString(
              "GenericObjectEditor_ClassSelected_Exception_JOptionPaneShowMessageDialog_Text_First")
            + className
            + Messages
              .getInstance()
              .getString(
                "GenericObjectEditor_ClassSelected_Exception_JOptionPaneShowMessageDialog_Text_Second"),
          Messages
            .getInstance()
            .getString(
              "GenericObjectEditor_ClassSelected_Exception_JOptionPaneShowMessageDialog_Text_Third"),
          JOptionPane.ERROR_MESSAGE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      ex.printStackTrace();
      try {
        if (m_Backup != null) {
          setValue(m_Backup);
        } else {
          setDefaultValue();
        }
      } catch (Exception e) {
<<<<<<< HEAD
        Logger.log(weka.core.logging.Logger.Level.WARNING, ex.getMessage());
=======
        System.err.println(ex.getMessage());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        ex.printStackTrace();
      }
    }
  }

  /**
   * Sets the capabilities to use for filtering.
   * 
   * @param value the object to get the filter capabilities from
   */
  public void setCapabilitiesFilter(Capabilities value) {
    m_CapabilitiesFilter = new Capabilities(null);
    m_CapabilitiesFilter.assign(value);
  }

  /**
   * Returns the current Capabilities filter, can be null.
   * 
   * @return the current Capabiliities used for filtering
   */
  public Capabilities getCapabilitiesFilter() {
    return m_CapabilitiesFilter;
  }

  /**
   * Removes the current Capabilities filter.
   */
  public void removeCapabilitiesFilter() {
    m_CapabilitiesFilter = null;
  }

  /**
   * Makes a copy of an object using serialization.
   * 
   * @param source the object to copy
   * @return a copy of the source object
   * @exception Exception if the copy fails
   */
  public static Object makeCopy(Object source) throws Exception {
    SerializedObject so = new SerializedObject(source);
    Object result = so.getObject();
    return result;
  }

  /**
<<<<<<< HEAD
   * Returns the history of the used setups.
   * 
   * @return the history
   */
  public GenericObjectEditorHistory getHistory() {
    return m_History;
=======
   * Returns the available classnames for a certain property in the props file.
   * 
   * @param property the property to get the classnames for
   * @return the classnames
   */
  public static Vector<String> getClassnames(String property) {
    Vector<String> result;
    String value;
    String[] items;
    int i;

    result = new Vector<String>();

    value = EDITOR_PROPERTIES.getProperty(property, "").replaceAll(" ", "")
      .trim();
    if (value.length() > 0) {
      items = value.split(",");
      for (i = 0; i < items.length; i++) {
        result.add(items[i]);
      }
    }

    return result;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Tests out the Object editor from the command line.
   * 
   * @param args may contain the class name of a Object to edit
   */
  public static void main(String[] args) {

    try {
      GenericObjectEditor.registerEditors();
      GenericObjectEditor ce = new GenericObjectEditor(true);
      ce.setClassType(weka.classifiers.Classifier.class);
      Object initial = new weka.classifiers.rules.ZeroR();
      if (args.length > 0) {
<<<<<<< HEAD
        //ce.setClassType(Class.forName(args[0]));
        ce.setClassType(WekaPackageClassLoaderManager.forName(args[0]));
        if (args.length > 1) {
          //initial = Class.forName(args[1]).newInstance();
          initial = WekaPackageClassLoaderManager.forName(args[1]).newInstance();
=======
        ce.setClassType(Class.forName(args[0]));
        if (args.length > 1) {
          initial = Class.forName(args[1]).newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          ce.setValue(initial);
        } else {
          ce.setDefaultValue();
        }
      } else {
        ce.setValue(initial);
      }

      PropertyDialog pd = new PropertyDialog((Frame) null, ce, 100, 100);
      pd.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
          PropertyEditor pe = ((PropertyDialog) e.getSource()).getEditor();
          Object c = pe.getValue();
          String options = "";
          if (c instanceof OptionHandler) {
            options = Utils.joinOptions(((OptionHandler) c).getOptions());
          }
          System.out.println(c.getClass().getName() + " " + options);
          System.exit(0);
        }
      });
      pd.setVisible(true);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
