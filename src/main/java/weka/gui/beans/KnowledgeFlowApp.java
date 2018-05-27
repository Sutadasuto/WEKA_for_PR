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
 *    KnowledgeFlowApp.java
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Attribute;
import weka.core.Copyright;
import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Instances;
import weka.core.Memory;
import weka.core.PluginManager;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.WekaEnumeration;
import weka.core.WekaPackageClassLoaderManager;
import weka.core.WekaPackageManager;
import weka.core.converters.FileSourcedConverter;
import weka.core.xml.KOML;
import weka.core.xml.XStream;
import weka.gui.AttributeSelectionPanel;
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.GenericPropertiesCreator;
import weka.gui.HierarchyPropertyParser;
import weka.gui.LookAndFeel;
import weka.gui.beans.xml.XMLBeans;
import weka.gui.visualize.PrintablePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.FlowLayout;
<<<<<<< HEAD
=======
=======
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
<<<<<<< HEAD
import java.awt.Menu;
=======
<<<<<<< HEAD
import java.awt.Menu;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
<<<<<<< HEAD
import java.awt.RenderingHints;
=======
<<<<<<< HEAD
import java.awt.RenderingHints;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
<<<<<<< HEAD
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
=======
<<<<<<< HEAD
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.beans.BeanInfo;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import java.beans.Beans;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.beans.Customizer;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import java.beans.MethodDescriptor;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextSupport;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
<<<<<<< HEAD
import java.io.FileWriter;
=======
<<<<<<< HEAD
import java.io.FileWriter;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
<<<<<<< HEAD
import java.io.Reader;
import java.io.Serializable;
import java.lang.annotation.Annotation;
=======
<<<<<<< HEAD
import java.io.Reader;
import java.io.Serializable;
import java.lang.annotation.Annotation;
=======
import java.lang.reflect.Method;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedSet;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

<<<<<<< HEAD
=======
=======
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JWindow;
import javax.swing.filechooser.FileFilter;

import weka.core.ClassloaderUtil;
import weka.core.Copyright;
import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Memory;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.xml.KOML;
import weka.core.xml.XStream;
import weka.gui.ExtensionFileFilter;
import weka.gui.GenericObjectEditor;
import weka.gui.GenericPropertiesCreator;
import weka.gui.HierarchyPropertyParser;
import weka.gui.LookAndFeel;
import weka.gui.beans.xml.XMLBeans;
import weka.gui.visualize.PrintablePanel;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Main GUI class for the KnowledgeFlow. Modifications to allow interoperability
 * with swt provided by Davide Zerbetto (davide dot zerbetto at eng dot it).
 * 
 * @author Mark Hall
<<<<<<< HEAD
 * @version $Revision: 14497 $
=======
<<<<<<< HEAD
 * @version $Revision: 14497 $
=======
 * @version $Revision: 9495 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @since 1.0
 * @see JPanel
 * @see PropertyChangeListener
 */
<<<<<<< HEAD
public class KnowledgeFlowApp extends JPanel implements PropertyChangeListener,
  BeanCustomizer.ModifyListener {
=======
<<<<<<< HEAD
public class KnowledgeFlowApp extends JPanel implements PropertyChangeListener,
  BeanCustomizer.ModifyListener {
=======
public class KnowledgeFlowApp extends JPanel implements PropertyChangeListener {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -7064906770289728431L;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Map of all plugin perspectives */
  protected Map<String, String> m_pluginPerspectiveLookup =
    new HashMap<String, String>();

  /** Those perspectives that have been instantiated */
  protected Map<String, KFPerspective> m_perspectiveCache =
    new HashMap<String, KFPerspective>();

  /**
   * Holds the details needed to construct button bars for various supported
   * classes of weka algorithms/tools
   */
  private static Vector<Vector<?>> TOOLBARS = new Vector<Vector<?>>();

  /**
   * Add a plugin bean props file
   * 
   * @param beanPropsFile the plugin properties to add
   * @throws Exception if a problem occurs
   */
  public static void addToPluginBeanProps(File beanPropsFile) throws Exception {
    BeansProperties.addToPluginBeanProps(beanPropsFile);
  }

  /**
   * Remove a plugin bean props file
   * 
   * @param beanPropsFile the plugin properties to remove
   * @throws Exception if a problem occurs
   */
  public static void removeFromPluginBeanProps(File beanPropsFile)
    throws Exception {
    BeansProperties.removeFromPluginBeanProps(beanPropsFile);
  }
<<<<<<< HEAD
=======
=======
  /**
   * Location of the property file for the KnowledgeFlowApp
   */
  protected static String PROPERTY_FILE = "weka/gui/beans/Beans.props";

  /** Contains the editor properties */
  protected static Properties BEAN_PROPERTIES;

  private static ArrayList<Properties> BEAN_PLUGINS_PROPERTIES;

  /**
   * Holds the details needed to construct button bars for various supported
   * classes of weka algorithms/tools
   */
  private static Vector TOOLBARS = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Loads KnowledgeFlow properties and any plugins (adds jars to the classpath)
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static synchronized void loadProperties() {
    BeansProperties.loadProperties();
  }

  public static void reInitialize() {
    loadProperties();
    init();
<<<<<<< HEAD
=======
=======
  public static void loadProperties() {
    if (BEAN_PROPERTIES == null) {
      System.out.println(Messages.getInstance().getString(
          "KnowledgeFlowApp_LoadProperties_Text_First"));
      /** Loads the configuration property file */
      // static {
      // Allow a properties file in the current directory to override
      try {
        BEAN_PROPERTIES = Utils.readProperties(PROPERTY_FILE);
        java.util.Enumeration keys = BEAN_PROPERTIES.propertyNames();
        if (!keys.hasMoreElements()) {
          throw new Exception(Messages.getInstance().getString(
              "KnowledgeFlowApp_LoadProperties_Exception_Text_First")
              + Messages.getInstance().getString(
                  "KnowledgeFlowApp_LoadProperties_Exception_Text_Second")
              + PROPERTY_FILE
              + Messages.getInstance().getString(
                  "KnowledgeFlowApp_LoadProperties_Exception_Text_Third")
              + System.getProperties().getProperty("user.home")
              + Messages.getInstance().getString(
                  "KnowledgeFlowApp_LoadProperties_Exception_Text_Fourth"));
        }
      } catch (Exception ex) {
        JOptionPane
            .showMessageDialog(
                null,
                ex.getMessage(),
                Messages
                    .getInstance()
                    .getString(
                        "KnowledgeFlowApp_LoadProperties_Exception_JOptionPaneShowMessageDialog_Text"),
                JOptionPane.ERROR_MESSAGE);
      }

      // try and load any plugin beans properties
      File pluginDir = new File(System.getProperty("user.home")
          + File.separator + ".knowledgeFlow" + File.separator + "plugins");
      if (pluginDir.exists() && pluginDir.isDirectory()) {
        BEAN_PLUGINS_PROPERTIES = new ArrayList<Properties>();
        // How many sub-dirs are there?
        File[] contents = pluginDir.listFiles();
        for (int i = 0; i < contents.length; i++) {
          if (contents[i].isDirectory() && contents[i].listFiles().length > 0) {
            try {
              Properties tempP = new Properties();
              File propFile = new File(contents[i].getPath() + File.separator
                  + "Beans.props");
              tempP.load(new FileInputStream(propFile));
              BEAN_PLUGINS_PROPERTIES.add(tempP);

              // Now try and add all jar files in this directory to the
              // classpath
              File anyJars[] = contents[i].listFiles();
              for (int j = 0; j < anyJars.length; j++) {
                if (anyJars[j].getPath().endsWith(".jar")) {
                  System.out.println(Messages.getInstance().getString(
                      "KnowledgeFlowApp_LoadProperties_Text_Second")
                      + anyJars[j].getPath()
                      + Messages.getInstance().getString(
                          "KnowledgeFlowApp_LoadProperties_Text_Third"));
                  ClassloaderUtil.addFile(anyJars[j].getPath());
                }
              }
            } catch (Exception ex) {
              // Don't make a fuss
              System.err.println(Messages.getInstance().getString(
                  "KnowledgeFlowApp_LoadProperties_Error_Text_First")
                  + contents[i].getPath());
            }
          }
          // BEAN_PLUGINS_PROPERTIES = new Properties();
          // BEAN_PLUGINS_PROPERTIES.load(new FileInputStream(pluginDir));
        }
      } else {
        // make the plugin directory for the user
        pluginDir.mkdir();
      }
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Initializes the temporary files necessary to construct the toolbars from.
   */
  private static void init() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
      "[KnowledgeFlow] Initializing KF...");

    // suppress these benign warnings when loading/deserializing XML flows
    if (!XMLBeans.SUPPRESS_PROPERTY_WARNINGS.contains("visual.iconPath")) {
      XMLBeans.SUPPRESS_PROPERTY_WARNINGS.add("visual.iconPath");
    }
    if (!XMLBeans.SUPPRESS_PROPERTY_WARNINGS
      .contains("visual.animatedIconPath")) {
      XMLBeans.SUPPRESS_PROPERTY_WARNINGS.add("visual.animatedIconPath");
    }

    try {
      TOOLBARS = new Vector<Vector<?>>();

      TreeMap<Integer, Object> wrapList = new TreeMap<Integer, Object>();
      Properties GEOProps = GenericPropertiesCreator
        .getGlobalOutputProperties();

      if (GEOProps == null) {
        GenericPropertiesCreator creator = new GenericPropertiesCreator();

        if (creator.useDynamic()) {
          creator.execute(false);
          /*
           * now process the keys in the GenericObjectEditor.props. For each key
           * that has an entry in the Beans.props associating it with a bean
           * component a button tool bar will be created
           */
          GEOProps = creator.getOutputProperties();
        } else {
          // Read the static information from the GenericObjectEditor.props
          GEOProps = Utils.readProperties("weka/gui/GenericObjectEditor.props");
        }
      }
      Enumeration<?> en = GEOProps.propertyNames();
      while (en.hasMoreElements()) {
        String geoKey = (String) en.nextElement();
        // System.err.println("GEOKey " + geoKey);

        // try to match this key with one in the Beans.props file
        String beanCompName = BeansProperties.BEAN_PROPERTIES
          .getProperty(geoKey);
        if (beanCompName != null) {
          // add details necessary to construct a button bar for this class
          // of algorithms
          Vector<Object> newV = new Vector<Object>();
          // check for a naming alias for this toolbar
          String toolBarNameAlias = BeansProperties.BEAN_PROPERTIES
            .getProperty(geoKey + ".alias");
          String toolBarName = (toolBarNameAlias != null) ? toolBarNameAlias
            : geoKey.substring(geoKey.lastIndexOf('.') + 1, geoKey.length());

          // look for toolbar ordering information for this wrapper type
          String order = BeansProperties.BEAN_PROPERTIES.getProperty(geoKey
            + ".order");
          Integer intOrder = (order != null) ? new Integer(order)
            : new Integer(0);
<<<<<<< HEAD
=======
=======
    System.out.println(Messages.getInstance().getString(
        "KnowledgeFlowApp_Init_Text_First"));

    try {
      TreeMap wrapList = new TreeMap();
      GenericPropertiesCreator creator = new GenericPropertiesCreator();
      Properties GEOProps = null;

      if (creator.useDynamic()) {
        creator.execute(false);
        /*
         * now process the keys in the GenericObjectEditor.props. For each key
         * that has an entry in the Beans.props associating it with a bean
         * component a button tool bar will be created
         */
        GEOProps = creator.getOutputProperties();
      } else {
        // Read the static information from the GenericObjectEditor.props
        GEOProps = Utils.readProperties("weka/gui/GenericObjectEditor.props");
      }
      Enumeration en = GEOProps.propertyNames();
      while (en.hasMoreElements()) {
        String geoKey = (String) en.nextElement();

        // try to match this key with one in the Beans.props file
        String beanCompName = BEAN_PROPERTIES.getProperty(geoKey);
        if (beanCompName != null) {
          // add details necessary to construct a button bar for this class
          // of algorithms
          Vector newV = new Vector();
          // check for a naming alias for this toolbar
          String toolBarNameAlias = BEAN_PROPERTIES.getProperty(geoKey
              + ".alias");
          String toolBarName = (toolBarNameAlias != null) ? toolBarNameAlias
              : geoKey.substring(geoKey.lastIndexOf('.') + 1, geoKey.length());

          // look for toolbar ordering information for this wrapper type
          String order = BEAN_PROPERTIES.getProperty(geoKey + ".order");
          Integer intOrder = (order != null) ? new Integer(order)
              : new Integer(0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          // Name for the toolbar (name of weka algorithm class)
          newV.addElement(toolBarName);
          // Name of bean capable of handling this class of algorithm
          newV.addElement(beanCompName);

          // add the root package for this key
          String rootPackage = geoKey.substring(0, geoKey.lastIndexOf('.'));

          newV.addElement(rootPackage);

          // All the weka algorithms of this class of algorithm
          String wekaAlgs = GEOProps.getProperty(geoKey);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          Hashtable<String, String> roots = GenericObjectEditor
            .sortClassesByRoot(wekaAlgs);
          Hashtable<String, HierarchyPropertyParser> hpps =
            new Hashtable<String, HierarchyPropertyParser>();
          Enumeration<String> enm = roots.keys();
          while (enm.hasMoreElements()) {
            String root = enm.nextElement();
            String classes = roots.get(root);
            weka.gui.HierarchyPropertyParser hpp =
              new weka.gui.HierarchyPropertyParser();
<<<<<<< HEAD
=======
=======
          Hashtable roots = GenericObjectEditor.sortClassesByRoot(wekaAlgs);
          Hashtable hpps = new Hashtable();
          Enumeration enm = roots.keys();
          while (enm.hasMoreElements()) {
            String root = (String) enm.nextElement();
            String classes = (String) roots.get(root);
            weka.gui.HierarchyPropertyParser hpp = new weka.gui.HierarchyPropertyParser();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            hpp.build(classes, ", ");
            // System.err.println(hpp.showTree());
            hpps.put(root, hpp);
          }

          // ------ test the HierarchyPropertyParser
          /*
           * weka.gui.HierarchyPropertyParser hpp = new
           * weka.gui.HierarchyPropertyParser(); hpp.build(wekaAlgs, ", ");
<<<<<<< HEAD
           *
=======
<<<<<<< HEAD
           *
=======
           * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
           * System.err.println(hpp.showTree());
           */
          // ----- end test the HierarchyPropertyParser
          // newV.addElement(hpp); // add the hierarchical property parser
          newV.addElement(hpps); // add the hierarchical property parser

          StringTokenizer st = new StringTokenizer(wekaAlgs, ", ");
          while (st.hasMoreTokens()) {
            String current = st.nextToken().trim();
            newV.addElement(current);
          }
          wrapList.put(intOrder, newV);
          // TOOLBARS.addElement(newV);
        }
      }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Iterator<Integer> keysetIt = wrapList.keySet().iterator();
      while (keysetIt.hasNext()) {
        Integer key = keysetIt.next();
        @SuppressWarnings("unchecked")
        Vector<Object> newV = (Vector<Object>) wrapList.get(key);
<<<<<<< HEAD
=======
=======
      Iterator keysetIt = wrapList.keySet().iterator();
      while (keysetIt.hasNext()) {
        Integer key = (Integer) keysetIt.next();
        Vector newV = (Vector) wrapList.get(key);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (newV != null) {
          TOOLBARS.addElement(newV);
        }
      }
    } catch (Exception ex) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      JOptionPane.showMessageDialog(null,
        "Could not read a configuration file for the generic objecte editor"
          + ". An example file is included with the Weka distribution.\n"
          + "This file should be named \"GenericObjectEditor.props\" and\n"
          + "should be placed either in your user home (which is set\n"
          + "to \"" + System.getProperties().getProperty("user.home") + "\")\n"
          + "or the directory that java was started from\n", "KnowledgeFlow",
        JOptionPane.ERROR_MESSAGE);
    }

    try {
      String standardToolBarNames = BeansProperties.BEAN_PROPERTIES
        .getProperty("weka.gui.beans.KnowledgeFlow.standardToolBars");
<<<<<<< HEAD
=======
=======
      JOptionPane
          .showMessageDialog(
              null,
              Messages
                  .getInstance()
                  .getString(
                      "KnowledgeFlowApp_Init_Exception_JOptionPaneShowMessageDialog_Text_First")
                  + System.getProperties().getProperty("user.home")
                  + Messages
                      .getInstance()
                      .getString(
                          "KnowledgeFlowApp_Init_Exception_JOptionPaneShowMessageDialog_Text_Second"),
              Messages
                  .getInstance()
                  .getString(
                      "KnowledgeFlowApp_Init_Exception_JOptionPaneShowMessageDialog_Text_Third"),
              JOptionPane.ERROR_MESSAGE);
    }

    try {
      String standardToolBarNames = BEAN_PROPERTIES
          .getProperty("weka.gui.beans.KnowledgeFlow.standardToolBars");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      StringTokenizer st = new StringTokenizer(standardToolBarNames, ", ");
      while (st.hasMoreTokens()) {
        String tempBarName = st.nextToken().trim();
        // construct details for this toolbar
<<<<<<< HEAD
        Vector<String> newV = new Vector<String>();
=======
<<<<<<< HEAD
        Vector<String> newV = new Vector<String>();
=======
        Vector newV = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // add the name of the toolbar
        newV.addElement(tempBarName);

        // indicate that this is a standard toolbar (no wrapper bean)
        newV.addElement("null");
<<<<<<< HEAD
        String toolBarContents = BeansProperties.BEAN_PROPERTIES
          .getProperty("weka.gui.beans.KnowledgeFlow." + tempBarName);
=======
<<<<<<< HEAD
        String toolBarContents = BeansProperties.BEAN_PROPERTIES
          .getProperty("weka.gui.beans.KnowledgeFlow." + tempBarName);
=======
        String toolBarContents = BEAN_PROPERTIES
            .getProperty("weka.gui.beans.KnowledgeFlow." + tempBarName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        StringTokenizer st2 = new StringTokenizer(toolBarContents, ", ");
        while (st2.hasMoreTokens()) {
          String tempBeanName = st2.nextToken().trim();
          newV.addElement(tempBeanName);
        }
        TOOLBARS.addElement(newV);
      }
    } catch (Exception ex) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      JOptionPane.showMessageDialog(null, ex.getMessage(), "KnowledgeFlow",
        JOptionPane.ERROR_MESSAGE);
    }
  }

  protected class BeanIconRenderer extends DefaultTreeCellRenderer {

    /** Added ID to avoid warning. */
    private static final long serialVersionUID = -4488876734500244945L;

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value,
      boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
      super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row,
        hasFocus);

      if (leaf) {
        Object userO = ((DefaultMutableTreeNode) value).getUserObject();
        if (userO instanceof JTreeLeafDetails) {
          Icon i = ((JTreeLeafDetails) userO).getIcon();
          if (i != null) {
            setIcon(i);
          }
        }
      }
      return this;
    }
  }

  protected class InvisibleNode extends DefaultMutableTreeNode {

    /**
     *
     */
    private static final long serialVersionUID = -9064396835384819887L;
    protected boolean m_isVisible;

    public InvisibleNode() {
      this(null);
    }

    public InvisibleNode(Object userObject) {
      this(userObject, true, true);
    }

    public InvisibleNode(Object userObject, boolean allowsChildren,
      boolean isVisible) {
      super(userObject, allowsChildren);
      this.m_isVisible = isVisible;
    }

    public TreeNode getChildAt(int index, boolean filterIsActive) {
      if (!filterIsActive) {
        return super.getChildAt(index);
      }
      if (children == null) {
        throw new ArrayIndexOutOfBoundsException("node has no children");
      }

      int realIndex = -1;
      int visibleIndex = -1;
      Enumeration<TreeNode> e = new WekaEnumeration<TreeNode>(
        children);
      while (e.hasMoreElements()) {
        InvisibleNode node = (InvisibleNode)e.nextElement();
        if (node.isVisible()) {
          visibleIndex++;
        }
        realIndex++;
        if (visibleIndex == index) {
          return (TreeNode) children.elementAt(realIndex);
        }
      }

      throw new ArrayIndexOutOfBoundsException("index unmatched");
    }

    public int getChildCount(boolean filterIsActive) {
      if (!filterIsActive) {
        return super.getChildCount();
      }
      if (children == null) {
        return 0;
      }

      int count = 0;
      Enumeration<TreeNode> e = new WekaEnumeration<TreeNode>(
        children);
      while (e.hasMoreElements()) {
        InvisibleNode node = (InvisibleNode)e.nextElement();
        if (node.isVisible()) {
          count++;
        }
      }

      return count;
    }

    public void setVisible(boolean visible) {
      this.m_isVisible = visible;
    }

    public boolean isVisible() {
      return m_isVisible;
    }
  }

  protected class InvisibleTreeModel extends DefaultTreeModel {

    /**
     *
     */
    private static final long serialVersionUID = 6940101211275068260L;
    protected boolean m_filterIsActive;

    public InvisibleTreeModel(TreeNode root) {
      this(root, false);
    }

    public InvisibleTreeModel(TreeNode root, boolean asksAllowsChildren) {
      this(root, false, false);
    }

    public InvisibleTreeModel(TreeNode root, boolean asksAllowsChildren,
      boolean filterIsActive) {
      super(root, asksAllowsChildren);
      this.m_filterIsActive = filterIsActive;
    }

    public void activateFilter(boolean newValue) {
      m_filterIsActive = newValue;
    }

    public boolean isActivatedFilter() {
      return m_filterIsActive;
    }

    @Override
    public Object getChild(Object parent, int index) {
      if (m_filterIsActive) {
        if (parent instanceof InvisibleNode) {
          return ((InvisibleNode) parent).getChildAt(index, m_filterIsActive);
        }
      }
      return ((TreeNode) parent).getChildAt(index);
    }

    @Override
    public int getChildCount(Object parent) {
      if (m_filterIsActive) {
        if (parent instanceof InvisibleNode) {
          return ((InvisibleNode) parent).getChildCount(m_filterIsActive);
        }
      }
      return ((TreeNode) parent).getChildCount();
    }
  }

  /**
   * Inner class for encapsulating information about a bean that is represented
   * at a leaf in the JTree.
   */
  protected class JTreeLeafDetails implements Serializable {

    /**
     * For serialization
     */
    private static final long serialVersionUID = 6197221540272931626L;

    /** fully qualified bean name */
    protected String m_fullyQualifiedCompName = "";

    /**
     * the label (usually derived from the qualified name or wrapped algorithm)
     * for the leaf
     */
    protected String m_leafLabel = "";

    /** the fully qualified wrapped weka algorithm name */
    protected String m_wekaAlgoName = "";

    /** icon to display at the leaf (scaled appropriately) */
    protected transient Icon m_scaledIcon = null;

    /** XML serialized MetaBean (if this is a user component) */
    // protected StringBuffer m_metaBean = null;
    protected Vector<Object> m_metaBean = null;

    /** true if this is a MetaBean (user component) */
    protected boolean m_isMeta = false;

    /** tool tip text to display */
    protected String m_toolTipText = null;

    /**
     * Constructor.
     *
     * @param fullName flully qualified name of the bean
     * @param icon icon for the bean
     */
    protected JTreeLeafDetails(String fullName, Icon icon) {
      this(fullName, "", icon);
    }

    /**
     * Constructor
     *
     * @param name fully qualified name of the bean
     * @param serializedMeta empty string or XML serialized MetaBean if this
     *          leaf represents a "user" component
     *
     * @param icon icon for the bean
     */
    protected JTreeLeafDetails(String name, Vector<Object> serializedMeta,
      Icon icon) {
      this(name, "", icon);

      // m_isMeta = isMeta;
      m_metaBean = serializedMeta;
      m_isMeta = true;
      m_toolTipText = "Hold down shift and click to remove";
    }

    /**
     * Constructor
     *
     * @param fullName fully qualified name of the bean
     * @param wekaAlgoName fully qualified name of the encapsulated (wrapped)
     *          weka algorithm, or null if this bean does not wrap a Weka
     *          algorithm
     *
     * @param icon icon for the bean
     */
    protected JTreeLeafDetails(String fullName, String wekaAlgoName, Icon icon) {
      m_fullyQualifiedCompName = fullName;
      m_wekaAlgoName = wekaAlgoName;
      m_leafLabel = (wekaAlgoName.length() > 0) ? wekaAlgoName
        : m_fullyQualifiedCompName;
      if (m_leafLabel.lastIndexOf('.') > 0) {
        m_leafLabel = m_leafLabel.substring(m_leafLabel.lastIndexOf('.') + 1,
          m_leafLabel.length());
      }
      m_scaledIcon = icon;
    }

    /**
     * Get the tool tip for this leaf
     *
     * @return the tool tip
     */
    protected String getToolTipText() {
      return m_toolTipText;
    }

    protected void setToolTipText(String tipText) {
      m_toolTipText = tipText;
    }

    /**
     * Returns the leaf label
     *
     * @return the leaf label
     */
    @Override
    public String toString() {
      return m_leafLabel;
    }

    /**
     * Gets the icon for this bean
     *
     * @return the icon for this bean
     */
    protected Icon getIcon() {
      return m_scaledIcon;
    }

    /**
     * Set the icon to use for this bean
     *
     * @param icon the icon to use
     */
    protected void setIcon(Icon icon) {
      m_scaledIcon = icon;
    }

    /**
     * Returns true if this leaf represents a wrapped Weka algorithm (i.e.
     * filter, classifier, clusterer etc.).
     *
     * @return true if this leaf represents a wrapped algorithm
     */
    protected boolean isWrappedAlgorithm() {
      return (m_wekaAlgoName != null && m_wekaAlgoName.length() > 0);
    }

    /**
     * Returns true if this leaf represents a MetaBean (i.e. "user" component)
     *
     * @return true if this leaf represents a MetaBean
     */
    protected boolean isMetaBean() {
      return (m_metaBean != null);
      // return (m_wekaAlgoName.length() == 0);
      // return m_isMeta;
    }

    /**
     * Gets the XML serialized MetaBean and associated information (icon,
     * displayname)
     *
     * @return the XML serialized MetaBean as a 3-element Vector containing
     *         display name serialized bean and icon
     */
    protected Vector<Object> getMetaBean() {
      return m_metaBean;
    }

    /**
     * "Instantiates" the bean represented by this leaf.
     */
    protected void instantiateBean() {
      try {
        if (isMetaBean()) {
          // MetaBean copy = copyMetaBean(m_metaBean, false);
          // copy.addPropertyChangeListenersSubFlow(KnowledgeFlowApp.this);
          m_toolBarBean = m_metaBean.get(1);
        } else {
          m_toolBarBean = WekaPackageClassLoaderManager.objectForName(m_fullyQualifiedCompName);
          //m_toolBarBean = Beans.instantiate(KnowledgeFlowApp.this.getClass()
           // .getClassLoader(), m_fullyQualifiedCompName);
          if (isWrappedAlgorithm()) {
            Object algo = WekaPackageClassLoaderManager.objectForName(m_wekaAlgoName);
            //Object algo = Beans.instantiate(KnowledgeFlowApp.this.getClass()
            //  .getClassLoader(), m_wekaAlgoName);
            ((WekaWrapper) m_toolBarBean).setWrappedAlgorithm(algo);
          }
        }

        KnowledgeFlowApp.this.setCursor(Cursor
          .getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        m_mode = ADDING;
        m_pasteB.setEnabled(false);

      } catch (Exception ex) {
        System.err
          .println("Problem instantiating bean \"" + m_fullyQualifiedCompName
            + "\" (JTreeLeafDetails.instantiateBean()");
        ex.printStackTrace();
      }
<<<<<<< HEAD
=======
=======
      JOptionPane
          .showMessageDialog(
              null,
              ex.getMessage(),
              Messages
                  .getInstance()
                  .getString(
                      "KnowledgeFlowApp_Init_Exception_JOptionPaneShowMessageDialog_Text_Fourth"),
              JOptionPane.ERROR_MESSAGE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Used for displaying the bean components and their visible connections
<<<<<<< HEAD
   *
   * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
   * @version $Revision: 14497 $
=======
<<<<<<< HEAD
   *
   * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
   * @version $Revision: 14497 $
=======
   * 
   * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
   * @version $Revision: 9495 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @since 1.0
   * @see PrintablePanel
   */
  protected class BeanLayout extends PrintablePanel {

    /** for serialization */
    private static final long serialVersionUID = -146377012429662757L;

    @Override
    public void paintComponent(Graphics gx) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      double lz = m_layoutZoom / 100.0;
      ((Graphics2D) gx).scale(lz, lz);
      if (m_layoutZoom < 100) {
        ((Graphics2D) gx).setStroke(new BasicStroke(2));
      }
      super.paintComponent(gx);

      ((Graphics2D) gx).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

      ((Graphics2D) gx).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
        RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);

      BeanInstance.paintLabels(gx, m_mainKFPerspective.getCurrentTabIndex());
      BeanConnection.paintConnections(gx,
        m_mainKFPerspective.getCurrentTabIndex());
<<<<<<< HEAD
=======
=======
      super.paintComponent(gx);
      BeanInstance.paintLabels(gx);
      BeanConnection.paintConnections(gx);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // BeanInstance.paintConnections(gx);
      if (m_mode == CONNECTING) {
        gx.drawLine(m_startX, m_startY, m_oldX, m_oldY);
      } else if (m_mode == SELECTING) {
        gx.drawRect((m_startX < m_oldX) ? m_startX : m_oldX,
<<<<<<< HEAD
          (m_startY < m_oldY) ? m_startY : m_oldY, Math.abs(m_oldX - m_startX),
          Math.abs(m_oldY - m_startY));
=======
<<<<<<< HEAD
          (m_startY < m_oldY) ? m_startY : m_oldY, Math.abs(m_oldX - m_startX),
          Math.abs(m_oldY - m_startY));
=======
            (m_startY < m_oldY) ? m_startY : m_oldY,
            Math.abs(m_oldX - m_startX), Math.abs(m_oldY - m_startY));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    @Override
    public void doLayout() {
      super.doLayout();
<<<<<<< HEAD
      Vector<Object> comps = BeanInstance.getBeanInstances(m_mainKFPerspective
        .getCurrentTabIndex());
=======
<<<<<<< HEAD
      Vector<Object> comps = BeanInstance.getBeanInstances(m_mainKFPerspective
        .getCurrentTabIndex());
=======
      Vector comps = BeanInstance.getBeanInstances();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (int i = 0; i < comps.size(); i++) {
        BeanInstance bi = (BeanInstance) comps.elementAt(i);
        JComponent c = (JComponent) bi.getBean();
        Dimension d = c.getPreferredSize();
        c.setBounds(bi.getX(), bi.getY(), d.width, d.height);
        c.revalidate();
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Interface for perspectives.
   */
  public static interface KFPerspective {

    /**
     * Set instances (if the perspective accepts them)
     *
     * @param insts the instances
     */
    void setInstances(Instances insts) throws Exception;

    /**
     * Returns true if this perspective accepts instances
     *
     * @return true if this perspective can accept instances
     */
    boolean acceptsInstances();

    /**
     * Get the title of this perspective
     *
     * @return the title of this perspective
     */
    String getPerspectiveTitle();

    /**
     * Get the tool tip text for this perspective.
     *
     * @return the tool tip text for this perspective
     */
    String getPerspectiveTipText();

    /**
     * Get the icon for this perspective.
     *
     * @return the Icon for this perspective (or null if the perspective does
     *         not have an icon)
     */
    Icon getPerspectiveIcon();

    /**
     * Set active status of this perspective. True indicates that this
     * perspective is the visible active perspective in the KnowledgeFlow
     *
     * @param active true if this perspective is the active one
     */
    void setActive(boolean active);

    /**
     * Set whether this perspective is "loaded" - i.e. whether or not the user
     * has opted to have it available in the perspective toolbar. The
     * perspective can make the decision as to allocating or freeing resources
     * on the basis of this.
     *
     * @param loaded true if the perspective is available in the perspective
     *          toolbar of the KnowledgeFlow
     */
    void setLoaded(boolean loaded);

    /**
     * Set a reference to the main KnowledgeFlow perspective - i.e. the
     * perspective that manages flow layouts.
     *
     * @param main the main KnowledgeFlow perspective.
     */
    void setMainKFPerspective(KnowledgeFlowApp.MainKFPerspective main);
  }

  /**
   * Main Knowledge Flow perspective
   *
   */
  public class MainKFPerspective extends JPanel implements KFPerspective {

    /**
     *
     */
    private static final long serialVersionUID = 7666381888012259527L;

    /** Holds the tabs of the perspective */
    protected JTabbedPane m_flowTabs = new JTabbedPane();

    /** List of layouts - one for each tab */
    protected List<BeanLayout> m_beanLayouts = new ArrayList<BeanLayout>();

    /** List of zoom settings - one for each tab */
    protected List<Integer> m_zoomSettings = new ArrayList<Integer>();

    /** List of log panels - one for each tab */
    protected List<KFLogPanel> m_logPanels = new ArrayList<KFLogPanel>();

    /** List of environment variable settings - one for each tab */
    protected List<Environment> m_environmentSettings =
      new ArrayList<Environment>();

    /** List of flow file paths - one for each tab */
    protected List<File> m_filePaths = new ArrayList<File>();

    /** Keeps track of which tabs have been edited but not saved */
    protected List<Boolean> m_editedList = new ArrayList<Boolean>();

    /** Keeps track of which tabs have flows that are executing */
    protected List<Boolean> m_executingList = new ArrayList<Boolean>();

    /** Keeps track of the threads used for execution */
    protected List<RunThread> m_executionThreads = new ArrayList<RunThread>();

    /** Keeps track of any highlighted beans on the canvas for a tab */
    protected List<Vector<Object>> m_selectedBeans =
      new ArrayList<Vector<Object>>();

    /** Keeps track of the undo buffers for each tab */
    protected List<Stack<File>> m_undoBufferList = new ArrayList<Stack<File>>();

    protected Map<String, DefaultMutableTreeNode> m_nodeTextIndex =
      new LinkedHashMap<String, DefaultMutableTreeNode>();

    @Override
    public void setActive(boolean active) {
      // nothing to do here
    }

    @Override
    public void setLoaded(boolean loaded) {
      // we are always loaded and part of the set of perspectives
    }

    @Override
    public void setMainKFPerspective(MainKFPerspective main) {
      // we don't need this :-)
    }

    public JTabbedPane getTabbedPane() {
      return m_flowTabs;
    }

    public synchronized int getNumTabs() {
      return m_flowTabs.getTabCount();
    }

    public synchronized String getTabTitle(int index) {
      if (index < getNumTabs() && index >= 0) {
        return m_flowTabs.getTitleAt(index);
      }
      return null;
    }

    public synchronized int getCurrentTabIndex() {
      return m_flowTabs.getSelectedIndex();
    }

    public synchronized KFLogPanel getCurrentLogPanel() {
      if (getCurrentTabIndex() >= 0) {
        return m_logPanels.get(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized KFLogPanel getLogPanel(int index) {
      if (index >= 0 && index < m_logPanels.size()) {
        return m_logPanels.get(index);
      }
      return null;
    }

    public synchronized BeanLayout getCurrentBeanLayout() {
      if (getCurrentTabIndex() >= 0) {
        return m_beanLayouts.get(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized BeanLayout getBeanLayout(int index) {
      if (index >= 0 && index < m_logPanels.size()) {
        return m_beanLayouts.get(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized int getCurrentZoomSetting() {
      if (getCurrentTabIndex() >= 0) {
        return m_zoomSettings.get(getCurrentTabIndex()).intValue();
      }

      // no scaling
      return 100;
    }

    public synchronized int getZoomSetting(int index) {
      if (index >= 0 && index < m_zoomSettings.size()) {
        return m_zoomSettings.get(index);
      }

      // no scaling
      return 100;
    }

    public synchronized void setCurrentZoomSetting(int z) {
      if (getNumTabs() > 0) {
        setZoomSetting(getCurrentTabIndex(), z);
      }
    }

    public synchronized void setZoomSetting(int index, int z) {
      if (index < getNumTabs() && index >= 0) {
        m_zoomSettings.set(index, new Integer(z));
      }
    }

    public synchronized void setActiveTab(int index) {
      if (index < getNumTabs() && index >= 0) {
        m_flowTabs.setSelectedIndex(index);

        // set the log and layout to the ones belonging to this tab
        m_logPanel = m_logPanels.get(index);
        m_beanLayout = m_beanLayouts.get(index);
        m_layoutZoom = m_zoomSettings.get(index);
        m_flowEnvironment = m_environmentSettings.get(index);

        m_saveB.setEnabled(!getExecuting());
        m_saveBB.setEnabled(!getExecuting());
        m_playB.setEnabled(!getExecuting());
        m_playBB.setEnabled(!getExecuting());
        m_saveB.setEnabled(!getExecuting());
        m_saveBB.setEnabled(!getExecuting());

        m_zoomOutB.setEnabled(!getExecuting());
        m_zoomInB.setEnabled(!getExecuting());
        if (m_layoutZoom == 50) {
          m_zoomOutB.setEnabled(false);
        }
        if (m_layoutZoom == 200) {
          m_zoomInB.setEnabled(false);
        }

        m_groupB.setEnabled(false);
        if (getSelectedBeans().size() > 0 && !getExecuting()) {
          // Able to group selected subflow?
          final Vector<Object> selected = m_mainKFPerspective
            .getSelectedBeans();
          // check if sub flow is valid
          final Vector<Object> inputs = BeanConnection.inputs(selected,
            m_mainKFPerspective.getCurrentTabIndex());
          final Vector<Object> outputs = BeanConnection.outputs(selected,
            m_mainKFPerspective.getCurrentTabIndex());

          if (groupable(selected, inputs, outputs)) {
            m_groupB.setEnabled(true);
          }
        }

        m_cutB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_copyB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_deleteB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
          getCurrentTabIndex()).size() > 0
          && !getExecuting());
        m_pasteB
          .setEnabled((m_pasteBuffer != null && m_pasteBuffer.length() > 0)
            && !getExecuting());
        m_stopB.setEnabled(getExecuting());
        m_undoB.setEnabled(!getExecuting() && getUndoBuffer().size() > 0);
      }
    }

    public synchronized void setExecuting(boolean executing) {
      if (getNumTabs() > 0) {
        setExecuting(getCurrentTabIndex(), executing);
      }
    }

    public synchronized void setExecuting(int index, boolean executing) {
      if (index < getNumTabs() && index >= 0) {
        m_executingList.set(index, new Boolean(executing));
        ((CloseableTabTitle) m_flowTabs.getTabComponentAt(index))
          .setButtonEnabled(!executing);

        m_saveB.setEnabled(!getExecuting());
        m_saveBB.setEnabled(!getExecuting());
        m_playB.setEnabled(!getExecuting());
        m_playBB.setEnabled(!getExecuting());
        m_stopB.setEnabled(getExecuting());

        m_groupB.setEnabled(false);
        if (getSelectedBeans().size() > 0 && !getExecuting()) {
          // Able to group selected subflow?
          final Vector<Object> selected = m_mainKFPerspective
            .getSelectedBeans();
          // check if sub flow is valid
          final Vector<Object> inputs = BeanConnection.inputs(selected,
            m_mainKFPerspective.getCurrentTabIndex());
          final Vector<Object> outputs = BeanConnection.outputs(selected,
            m_mainKFPerspective.getCurrentTabIndex());

          if (groupable(selected, inputs, outputs)) {
            m_groupB.setEnabled(true);
          }
        }

        m_cutB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_deleteB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
          getCurrentTabIndex()).size() > 0
          && !getExecuting());
        m_copyB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_pasteB
          .setEnabled((m_pasteBuffer != null && m_pasteBuffer.length() > 0)
            && !getExecuting());
        m_undoB.setEnabled(!getExecuting() && getUndoBuffer().size() > 0);
      }
    }

    public synchronized boolean getExecuting() {
      return getExecuting(getCurrentTabIndex());
    }

    public synchronized boolean getExecuting(int index) {
      if (index < getNumTabs() && index >= 0) {
        return m_executingList.get(index);
      }
      return false;
    }

    public synchronized void setExecutionThread(RunThread execution) {
      if (getNumTabs() > 0) {
        setExecutionThread(getCurrentTabIndex(), execution);
      }
    }

    public synchronized void setExecutionThread(int index, RunThread execution) {
      if (index < getNumTabs() && index >= 0) {
        m_executionThreads.set(index, execution);
      }
    }

    public synchronized RunThread getExecutionThread() {
      return getExecutionThread(getCurrentTabIndex());
    }

    public synchronized RunThread getExecutionThread(int index) {
      if (index < getNumTabs() && index >= 0) {
        return m_executionThreads.get(index);
      }
      return null;
    }

    public synchronized File getFlowFile() {
      if (getNumTabs() > 0) {
        return getFlowFile(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized File getFlowFile(int index) {
      if (index >= 0 && index < getNumTabs()) {
        return m_filePaths.get(index);
      }

      return null;
    }

    public synchronized void setFlowFile(File flowFile) {
      if (getNumTabs() > 0) {
        setFlowFile(getCurrentTabIndex(), flowFile);
      }
    }

    public synchronized void setFlowFile(int index, File flowFile) {
      if (index < getNumTabs() && index >= 0) {
        m_filePaths.set(index, flowFile);
      }
    }

    public synchronized void setTabTitle(String title) {
      if (getNumTabs() > 0) {
        setTabTitle(getCurrentTabIndex(), title);
      }
    }

    public synchronized void setTabTitle(int index, String title) {
      if (index < getNumTabs() && index >= 0) {
        m_flowTabs.setTitleAt(index, title);
        ((CloseableTabTitle) m_flowTabs.getTabComponentAt(index)).revalidate();

      }
    }

    public synchronized void setEditedStatus(boolean status) {
      if (getNumTabs() > 0) {
        int current = getCurrentTabIndex();
        setEditedStatus(current, status);
      }
    }

    public synchronized void setEditedStatus(int index, boolean status) {
      if (index < getNumTabs() && index >= 0) {
        Boolean newStatus = new Boolean(status);
        m_editedList.set(index, newStatus);
        ((CloseableTabTitle) m_flowTabs.getTabComponentAt(index))
          .setBold(status);
      }
    }

    /**
     * Get the edited status of the currently selected tab. Returns false if
     * there are no tabs
     *
     * @return the edited status of the currently selected tab or false if there
     *         are no tabs
     */
    public synchronized boolean getEditedStatus() {
      if (getNumTabs() <= 0) {
        return false;
      }

      return getEditedStatus(getCurrentTabIndex());
    }

    /**
     * Get the edited status of the tab at the supplied index. Returns false if
     * the index is out of bounds or there are no tabs
     *
     * @param index the index of the tab to check
     * @return the edited status of the tab
     */
    public synchronized boolean getEditedStatus(int index) {
      if (index < getNumTabs() && index >= 0) {
        return m_editedList.get(index);
      }
      return false;
    }

    public synchronized void setUndoBuffer(Stack<File> buffer) {
      if (getNumTabs() > 0) {
        setUndoBuffer(getCurrentTabIndex(), buffer);
      }
    }

    public synchronized void setUndoBuffer(int index, Stack<File> buffer) {
      if (index < getNumTabs() && index >= 0) {
        m_undoBufferList.set(index, buffer);
      }
    }

    public synchronized Stack<File> getUndoBuffer() {
      if (getNumTabs() > 0) {
        return getUndoBuffer(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized Stack<File> getUndoBuffer(int index) {
      if (index >= 0 && index < getNumTabs()) {
        return m_undoBufferList.get(index);
      }
      return null;
    }

    public synchronized Vector<Object> getSelectedBeans() {
      if (getNumTabs() > 0) {
        return getSelectedBeans(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized Vector<Object> getSelectedBeans(int index) {
      if (index < getNumTabs() && index >= 0) {
        return m_selectedBeans.get(index);
      }
      return null;
    }

    public synchronized void setSelectedBeans(Vector<Object> beans) {
      if (getNumTabs() > 0) {
        setSelectedBeans(getCurrentTabIndex(), beans);

        m_groupB.setEnabled(false);
        if (getSelectedBeans().size() > 0 && !getExecuting()) {
          // Able to group selected subflow?
          final Vector<Object> selected = m_mainKFPerspective
            .getSelectedBeans();
          // check if sub flow is valid
          final Vector<Object> inputs = BeanConnection.inputs(selected,
            m_mainKFPerspective.getCurrentTabIndex());
          final Vector<Object> outputs = BeanConnection.outputs(selected,
            m_mainKFPerspective.getCurrentTabIndex());

          if (groupable(selected, inputs, outputs)) {
            m_groupB.setEnabled(true);
          }
        }

        m_cutB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_copyB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
        m_deleteB.setEnabled(getSelectedBeans().size() > 0 && !getExecuting());
      }
    }

    public synchronized void setSelectedBeans(int index, Vector<Object> beans) {
      if (index < getNumTabs() && index >= 0) {
        // turn turn off any set ones
        for (int i = 0; i < m_selectedBeans.get(index).size(); i++) {
          BeanInstance temp = (BeanInstance) m_selectedBeans.get(index)
            .elementAt(i);
          if (temp.getBean() instanceof Visible) {
            ((Visible) temp.getBean()).getVisual().setDisplayConnectors(false);
          } else if (temp.getBean() instanceof Note) {
            ((Note) temp.getBean()).setHighlighted(false);
          }
        }

        m_selectedBeans.set(index, beans);

        // highlight any new ones
        for (int i = 0; i < beans.size(); i++) {
          BeanInstance temp = (BeanInstance) beans.elementAt(i);
          if (temp.getBean() instanceof Visible) {
            ((Visible) temp.getBean()).getVisual().setDisplayConnectors(true);
          } else if (temp.getBean() instanceof Note) {
            ((Note) temp.getBean()).setHighlighted(true);
          }
        }
      }
    }

    public synchronized Environment getEnvironmentSettings() {
      if (getNumTabs() > 0) {
        return getEnvironmentSettings(getCurrentTabIndex());
      }
      return null;
    }

    public synchronized Environment getEnvironmentSettings(int index) {
      if (index < getNumTabs() && index >= 0) {
        return m_environmentSettings.get(index);
      }
      return null;
    }

    @Override
    public void setInstances(Instances insts) {
      // nothing to do as we don't process externally supplied instances
    }

    @Override
    public boolean acceptsInstances() {
      // not needed

      return false;
    }

    /**
     * Get the title of this perspective
     */
    @Override
    public String getPerspectiveTitle() {
      return "Data mining processes";
    }

    /**
     * Get the tool tip text for this perspective
     */
    @Override
    public String getPerspectiveTipText() {
      return "Knowledge Flow processes";
    }

    /**
     * Get the icon for this perspective
     */
    @Override
    public Icon getPerspectiveIcon() {
      Image wekaI = loadImage("weka/gui/weka_icon_new.png");
      ImageIcon icon = new ImageIcon(wekaI);

      double width = icon.getIconWidth();
      double height = icon.getIconHeight();
      width *= 0.035;
      height *= 0.035;

      wekaI = wekaI.getScaledInstance((int) width, (int) height,
        Image.SCALE_SMOOTH);
      icon = new ImageIcon(wekaI);

      return icon;
    }

    @SuppressWarnings("unchecked")
    private void setUpToolsAndJTree() {
      JPanel toolBarPanel = new JPanel();
      toolBarPanel.setLayout(new BorderLayout());

      // modifications by Zerbetto
      // first construct the toolbar for saving, loading etc
      if (m_showFileMenu) {

        // set up an action for closing the curren tab
        final Action closeAction = new AbstractAction("Close") {
          /**
           *
           */
          private static final long serialVersionUID = 4762166880144590384L;

          @Override
          public void actionPerformed(ActionEvent e) {
            if (m_mainKFPerspective.getCurrentTabIndex() >= 0) {
              m_mainKFPerspective.removeTab(getCurrentTabIndex());
            }
          }
        };
        KeyStroke closeKey = KeyStroke.getKeyStroke(KeyEvent.VK_W,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Close", closeAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(closeKey, "Close");

        JToolBar fixedTools = new JToolBar();
        fixedTools.setOrientation(JToolBar.HORIZONTAL);

        m_groupB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "bricks.png")));
        m_groupB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_groupB.setToolTipText("Group selected (Ctrl+Z)");
        m_cutB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "cut.png")));
        m_cutB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_cutB.setToolTipText("Cut selected (Ctrl+X)");
        m_copyB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "page_copy.png")));
        m_copyB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_copyB.setToolTipText("Copy selected (Ctrl+C)");
        m_pasteB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "paste_plain.png")));
        m_pasteB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_pasteB.setToolTipText("Paste from clipboard (Ctrl+V)");
        m_deleteB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "delete.png")));
        m_deleteB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_deleteB.setToolTipText("Delete selected (DEL)");
        m_snapToGridB = new JToggleButton(new ImageIcon(
          loadImage(BeanVisual.ICON_PATH + "shape_handles.png")));
        // m_snapToGridB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_snapToGridB.setToolTipText("Snap to grid (Ctrl+G)");

        m_saveB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "disk.png")));
        m_saveB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_saveB.setToolTipText("Save layout (Ctrl+S)");
        m_saveBB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "disk_multiple.png")));
        m_saveBB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_saveBB.setToolTipText("Save layout with new name");

        m_loadB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "folder_add.png")));
        m_loadB.setToolTipText("Open (Ctrl+O)");
        m_loadB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_newB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "page_add.png")));
        m_newB.setToolTipText("New layout (Ctrl+N)");
        m_newB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_newB.setEnabled(getAllowMultipleTabs());

        m_helpB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "help.png")));
        m_helpB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_helpB.setToolTipText("Display help (Ctrl+H)");
        m_togglePerspectivesB = new JButton(new ImageIcon(
          loadImage(BeanVisual.ICON_PATH + "cog_go.png")));
        m_togglePerspectivesB.setBorder(BorderFactory.createEmptyBorder(0, 8,
          0, 0));
        m_togglePerspectivesB
          .setToolTipText("Show/hide perspectives toolbar (Ctrl+P)");

        m_templatesB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "application_view_tile.png")));
        m_templatesB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_templatesB.setToolTipText("Load a template layout");

        m_noteB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "note_add.png")));
        m_noteB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_noteB.setToolTipText("Add a note to the layout (Ctrl+I)");

        m_selectAllB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "shape_group.png")));
        m_selectAllB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_selectAllB.setToolTipText("Select all (Ctrl+A)");

        m_zoomInB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "zoom_in.png")));
        m_zoomInB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_zoomInB.setToolTipText("Zoom in (Ctrl++)");

        m_zoomOutB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "zoom_out.png")));
        m_zoomOutB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_zoomOutB.setToolTipText("Zoom out (Ctrl+-)");

        m_undoB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "arrow_undo.png")));
        m_undoB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        m_undoB.setToolTipText("Undo (Ctrl+U)");

        fixedTools.add(m_zoomInB);
        fixedTools.add(m_zoomOutB);
        fixedTools.addSeparator();
        fixedTools.add(m_selectAllB);
        fixedTools.add(m_groupB);
        fixedTools.add(m_cutB);
        fixedTools.add(m_copyB);
        fixedTools.add(m_deleteB);
        fixedTools.add(m_pasteB);
        fixedTools.add(m_undoB);
        fixedTools.add(m_noteB);
        fixedTools.addSeparator();
        fixedTools.add(m_snapToGridB);
        fixedTools.addSeparator();
        fixedTools.add(m_newB);
        fixedTools.add(m_saveB);
        fixedTools.add(m_saveBB);
        fixedTools.add(m_loadB);
        fixedTools.add(m_templatesB);
        fixedTools.addSeparator();
        fixedTools.add(m_togglePerspectivesB);

        fixedTools.add(m_helpB);
        Dimension d = m_undoB.getPreferredSize();
        Dimension d2 = fixedTools.getMinimumSize();
        Dimension d3 = new Dimension(d2.width, d.height + 4);
        fixedTools.setPreferredSize(d3);
        fixedTools.setMaximumSize(d3);

        final Action saveAction = new AbstractAction("Save") {
          /**
           *
           */
          private static final long serialVersionUID = 5182044142154404706L;

          @Override
          public void actionPerformed(ActionEvent e) {
            if (m_mainKFPerspective.getCurrentTabIndex() >= 0) {
              saveLayout(m_mainKFPerspective.getCurrentTabIndex(), false);
            }
          }
        };
        KeyStroke saveKey = KeyStroke.getKeyStroke(KeyEvent.VK_S,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Save", saveAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(saveKey, "Save");
        m_saveB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            saveAction.actionPerformed(e);
          }
        });

        m_saveBB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            saveLayout(m_mainKFPerspective.getCurrentTabIndex(), true);
          }
        });

        final Action openAction = new AbstractAction("Open") {
          /**
           *
           */
          private static final long serialVersionUID = -5106547209818805444L;

          @Override
          public void actionPerformed(ActionEvent e) {
            m_flowEnvironment = new Environment();
            loadLayout();
          }
        };
        KeyStroke openKey = KeyStroke.getKeyStroke(KeyEvent.VK_O,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Open", openAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(openKey, "Open");
        m_loadB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            openAction.actionPerformed(e);
          }
        });

        final Action newAction = new AbstractAction("New") {
          /**
           *
           */
          private static final long serialVersionUID = 8002244400334262966L;

          @Override
          public void actionPerformed(ActionEvent e) {
            clearLayout();
          }
        };
        KeyStroke newKey = KeyStroke.getKeyStroke(KeyEvent.VK_N,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("New", newAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(newKey, "New");
        m_newB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
            newAction.actionPerformed(ae);
          }
        });

        final Action selectAllAction = new AbstractAction("SelectAll") {
          /**
           *
           */
          private static final long serialVersionUID = -8086754050844707658L;

          @Override
          public void actionPerformed(ActionEvent e) {
            if (BeanInstance.getBeanInstances(
              m_mainKFPerspective.getCurrentTabIndex()).size() > 0) {
              // select all beans
              Vector<Object> allBeans = BeanInstance
                .getBeanInstances(m_mainKFPerspective.getCurrentTabIndex());
              Vector<Object> newSelected = new Vector<Object>();
              for (int i = 0; i < allBeans.size(); i++) {
                newSelected.add(allBeans.get(i));
              }

              // toggle
              if (newSelected.size() == m_mainKFPerspective.getSelectedBeans()
                .size()) {
                // unselect all beans
                m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
              } else {
                // select all beans
                m_mainKFPerspective.setSelectedBeans(newSelected);
              }
            }
            revalidate();
            repaint();
            notifyIsDirty();
          }
        };
        KeyStroke selectAllKey = KeyStroke.getKeyStroke(KeyEvent.VK_A,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("SelectAll", selectAllAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(selectAllKey, "SelectAll");
        m_selectAllB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            selectAllAction.actionPerformed(e);
          }
        });

        final Action zoomInAction = new AbstractAction("ZoomIn") {
          /**
           *
           */
          private static final long serialVersionUID = 1348383794897269484L;

          @Override
          public void actionPerformed(ActionEvent e) {
            m_layoutZoom += 25;
            m_zoomOutB.setEnabled(true);
            if (m_layoutZoom >= 200) {
              m_layoutZoom = 200;
              m_zoomInB.setEnabled(false);
            }
            m_mainKFPerspective.setCurrentZoomSetting(m_layoutZoom);
            revalidate();
            repaint();
            notifyIsDirty();
          }
        };
        KeyStroke zoomInKey = KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("ZoomIn", zoomInAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(zoomInKey, "ZoomIn");
        m_zoomInB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            zoomInAction.actionPerformed(e);
          }
        });

        final Action zoomOutAction = new AbstractAction("ZoomOut") {
          /**
           *
           */
          private static final long serialVersionUID = -1120096894263455918L;

          @Override
          public void actionPerformed(ActionEvent e) {
            m_layoutZoom -= 25;
            m_zoomInB.setEnabled(true);
            if (m_layoutZoom <= 50) {
              m_layoutZoom = 50;
              m_zoomOutB.setEnabled(false);
            }
            m_mainKFPerspective.setCurrentZoomSetting(m_layoutZoom);
            revalidate();
            repaint();
            notifyIsDirty();
          }
        };
        KeyStroke zoomOutKey = KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("ZoomOut", zoomOutAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(zoomOutKey, "ZoomOut");
        m_zoomOutB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            zoomOutAction.actionPerformed(e);
          }
        });

        final Action groupAction = new AbstractAction("Group") {
          /**
           *
           */
          private static final long serialVersionUID = -5752742619180091435L;

          @Override
          public void actionPerformed(ActionEvent e) {
            final Vector<Object> selected = m_mainKFPerspective
              .getSelectedBeans();
            final Vector<Object> inputs = BeanConnection.inputs(selected,
              m_mainKFPerspective.getCurrentTabIndex());
            final Vector<Object> outputs = BeanConnection.outputs(selected,
              m_mainKFPerspective.getCurrentTabIndex());
            groupSubFlow(selected, inputs, outputs);
          }
        };
        KeyStroke groupKey = KeyStroke.getKeyStroke(KeyEvent.VK_Z,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Group", groupAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(groupKey, "Group");
        m_groupB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            groupAction.actionPerformed(e);
          }
        });

        final Action cutAction = new AbstractAction("Cut") {
          /**
           *
           */
          private static final long serialVersionUID = -4955878102742013040L;

          @Override
          public void actionPerformed(ActionEvent e) {
            // only delete if our copy was successful!
            if (copyToClipboard()) {
              deleteSelectedBeans();
            }
          }
        };
        KeyStroke cutKey = KeyStroke.getKeyStroke(KeyEvent.VK_X,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Cut", cutAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(cutKey, "Cut");
        m_cutB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            cutAction.actionPerformed(e);
          }
        });

        final Action deleteAction = new AbstractAction("Delete") {
          /**
           *
           */
          private static final long serialVersionUID = 4621688037874199553L;

          @Override
          public void actionPerformed(ActionEvent e) {
            deleteSelectedBeans();
          }
        };
        KeyStroke deleteKey = KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0);
        MainKFPerspective.this.getActionMap().put("Delete", deleteAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(deleteKey, "Delete");
        m_deleteB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            deleteAction.actionPerformed(e);
          }
        });

        final Action copyAction = new AbstractAction("Copy") {
          /**
           *
           */
          private static final long serialVersionUID = 117010390180468707L;

          @Override
          public void actionPerformed(ActionEvent e) {
            copyToClipboard();
            m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
          }
        };
        KeyStroke copyKey = KeyStroke.getKeyStroke(KeyEvent.VK_C,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Copy", copyAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(copyKey, "Copy");
        m_copyB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            copyAction.actionPerformed(e);
          }
        });

        final Action pasteAction = new AbstractAction("Paste") {
          /**
           *
           */
          private static final long serialVersionUID = 5935121051028929455L;

          @Override
          public void actionPerformed(ActionEvent e) {
            KnowledgeFlowApp.this.setCursor(Cursor
              .getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            m_mode = PASTING;
          }
        };
        KeyStroke pasteKey = KeyStroke.getKeyStroke(KeyEvent.VK_V,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Paste", pasteAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(pasteKey, "Paste");
        m_pasteB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            pasteAction.actionPerformed(e);
          }
        });

        final Action snapAction = new AbstractAction("Snap") {
          /**
           *
           */
          private static final long serialVersionUID = 7820689847829357449L;

          @Override
          public void actionPerformed(ActionEvent e) {
            // toggle first
            m_snapToGridB.setSelected(!m_snapToGridB.isSelected());
            if (m_snapToGridB.isSelected()) {
              snapSelectedToGrid();
            }
          }
        };
        KeyStroke snapKey = KeyStroke.getKeyStroke(KeyEvent.VK_G,
          InputEvent.CTRL_DOWN_MASK);
        MainKFPerspective.this.getActionMap().put("Snap", snapAction);
        MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
          .put(snapKey, "Snap");
        m_snapToGridB.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            if (m_snapToGridB.isSelected()) {
              snapSelectedToGrid();
            }
          }
        });

        fixedTools.setFloatable(false);
        toolBarPanel.add(fixedTools, BorderLayout.EAST);
      }

      final Action noteAction = new AbstractAction("Note") {
        /**
         *
         */
        private static final long serialVersionUID = 2991743619130024875L;

        @Override
        public void actionPerformed(ActionEvent e) {
          Note n = new Note();
          m_toolBarBean = n;

          KnowledgeFlowApp.this.setCursor(Cursor
            .getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
          m_mode = ADDING;
        }
      };
      KeyStroke noteKey = KeyStroke.getKeyStroke(KeyEvent.VK_I,
        InputEvent.CTRL_DOWN_MASK);
      MainKFPerspective.this.getActionMap().put("Note", noteAction);
      MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(noteKey, "Note");
      m_noteB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          noteAction.actionPerformed(e);
        }
      });

      final Action undoAction = new AbstractAction("Undo") {
        /**
         *
         */
        private static final long serialVersionUID = 7248362305594881263L;

        @Override
        public void actionPerformed(ActionEvent e) {
          Stack<File> undo = m_mainKFPerspective.getUndoBuffer();
          if (undo.size() > 0) {
            File undoF = undo.pop();
            if (undo.size() == 0) {
              m_undoB.setEnabled(false);
            }
            loadLayout(undoF, false, true);
          }
        }
      };
      KeyStroke undoKey = KeyStroke.getKeyStroke(KeyEvent.VK_U,
        InputEvent.CTRL_DOWN_MASK);
      MainKFPerspective.this.getActionMap().put("Undo", undoAction);
      MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(undoKey, "Undo");
      m_undoB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          undoAction.actionPerformed(e);
        }
      });

      m_playB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
        + "resultset_next.png")));
      m_playB.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
      m_playB
        .setToolTipText("Run this flow (all start points launched in parallel)");
      m_playB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (BeanInstance.getBeanInstances(
            m_mainKFPerspective.getCurrentTabIndex()).size() == 0) {
            return;
          }

          boolean proceed = true;
          if (m_Memory.memoryIsLow()) {
            proceed = m_Memory.showMemoryIsLow();
          }

          if (proceed) {
            runFlow(false);
          }
        }
      });

      m_playBB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
        + "resultset_last.png")));
      m_playBB.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
      m_playBB
        .setToolTipText("Run this flow (start points launched sequentially)");
      m_playBB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (BeanInstance.getBeanInstances(
            m_mainKFPerspective.getCurrentTabIndex()).size() == 0) {
            return;
          }
          if (!Utils
            .getDontShowDialog("weka.gui.beans.KnowledgeFlow.SequentialRunInfo")) {
            JCheckBox dontShow =
              new JCheckBox("Do not show this message again");
            Object[] stuff = new Object[2];
            stuff[0] =
              "The order that data sources are launched in can be\n"
                + "specified by setting a custom name for each data source that\n"
                + "that includes a number. E.g. \"1:MyArffLoader\". To set a name,\n"
                + "right-click over a data source and select \"Set name\"\n\n"
                + "If the prefix is not specified, then the order of execution\n"
                + "will correspond to the order that the components were added\n"
                + "to the layout. Note that it is also possible to prevent a data\n"
                + "source from executing by prefixing its name with a \"!\". E.g\n"
                + "\"!:MyArffLoader\"";
            stuff[1] = dontShow;

            JOptionPane.showMessageDialog(KnowledgeFlowApp.this, stuff,
              "Sequential execution information", JOptionPane.OK_OPTION);

            if (dontShow.isSelected()) {
              try {
                Utils
                  .setDontShowDialog("weka.gui.beans.KnowledgeFlow.SequentialRunInfo");
              } catch (Exception ex) {
                // quietly ignore
              }
            }
          }

          boolean proceed = true;
          if (m_Memory.memoryIsLow()) {
            proceed = m_Memory.showMemoryIsLow();
          }

          if (proceed) {
            runFlow(true);
          }
        }
      });

      m_stopB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
        + "shape_square.png")));
      m_stopB.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
      m_stopB.setToolTipText("Stop all execution");

      Image tempI = loadImage(BeanVisual.ICON_PATH + "cursor.png");
      m_pointerB = new JButton(new ImageIcon(tempI));
      m_pointerB.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
      m_pointerB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_toolBarBean = null;
          m_mode = NONE;
          KnowledgeFlowApp.this.setCursor(Cursor
            .getPredefinedCursor(Cursor.DEFAULT_CURSOR));
          m_componentTree.clearSelection();
        }
      });

      // Dimension dP = m_saveB.getPreferredSize();
      // Dimension dM = m_saveB.getMaximumSize();
      // Dimension dP = m_stopB.getPreferredSize();
      // Dimension dM = m_stopB.getMaximumSize();
      // m_pointerB.setPreferredSize(dP);
      // m_pointerB.setMaximumSize(dM);
      // m_toolBarGroup.add(m_pointerB);

      JToolBar fixedTools2 = new JToolBar();
      fixedTools2.setOrientation(JToolBar.HORIZONTAL);
      fixedTools2.setFloatable(false);
      fixedTools2.add(m_pointerB);
      fixedTools2.add(m_playB);
      fixedTools2.add(m_playBB);
      fixedTools2.add(m_stopB);

      Dimension d = m_playB.getPreferredSize();
      Dimension d2 = fixedTools2.getMinimumSize();
      Dimension d3 = new Dimension(d2.width, d.height + 4);
      fixedTools2.setPreferredSize(d3);
      fixedTools2.setMaximumSize(d3);

      // m_helpB.setPreferredSize(dP);
      // m_helpB.setMaximumSize(dP);
      // m_helpB.setSize(m_pointerB.getSize().width,
      // m_pointerB.getSize().height);
      toolBarPanel.add(fixedTools2, BorderLayout.WEST);
      // end modifications by Zerbetto
      m_stopB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_logPanel
            .statusMessage("@!@[KnowledgeFlow]|Attempting to stop all components...");
          stopFlow();
          m_logPanel.statusMessage("@!@[KnowledgeFlow]|OK.");
        }
      });

      final Action helpAction = new AbstractAction("Help") {
        /**
         *
         */
        private static final long serialVersionUID = 3301809940717051925L;

        @Override
        public void actionPerformed(ActionEvent e) {
          popupHelp();
        }
      };
      KeyStroke helpKey = KeyStroke.getKeyStroke(KeyEvent.VK_H,
        InputEvent.CTRL_DOWN_MASK);
      MainKFPerspective.this.getActionMap().put("Help", helpAction);
      MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(helpKey, "Help");
      m_helpB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
          helpAction.actionPerformed(ae);
        }
      });

      m_templatesB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          createTemplateMenuPopup();
        }
      });

      m_templatesB.setEnabled(BeansProperties.TEMPLATE_PATHS.size() > 0);

      final Action togglePerspectivesAction = new AbstractAction(
        "Toggle perspectives") {
        /**
           *
           */
        private static final long serialVersionUID = 5394622655137498495L;

        @Override
        public void actionPerformed(ActionEvent e) {
          if (m_firstUserComponentOpp) {
            installWindowListenerForSavingUserStuff();
            m_firstUserComponentOpp = false;
          }

          if (!Utils
            .getDontShowDialog("weka.gui.beans.KnowledgeFlow.PerspectiveInfo")) {
            JCheckBox dontShow =
              new JCheckBox("Do not show this message again");
            Object[] stuff = new Object[2];
            stuff[0] =
              "Perspectives are environments that take over the\n"
                + "Knowledge Flow UI and provide major additional functionality.\n"
                + "Many perspectives will operate on a set of instances. Instances\n"
                + "Can be sent to a perspective by placing a DataSource on the\n"
                + "layout canvas, configuring it and then selecting \"Send to perspective\"\n"
                + "from the contextual popup menu that appears when you right-click on\n"
                + "it. Several perspectives are built in to the Knowledge Flow, others\n"
                + "can be installed via the package manager.\n";
            stuff[1] = dontShow;

            JOptionPane.showMessageDialog(KnowledgeFlowApp.this, stuff,
              "Perspective information", JOptionPane.OK_OPTION);

            if (dontShow.isSelected()) {
              try {
                Utils
                  .setDontShowDialog("weka.gui.beans.KnowledgeFlow.PerspectiveInfo");
              } catch (Exception ex) {
                // quietly ignore
              }
            }
          }

          if (m_configAndPerspectivesVisible) {
            KnowledgeFlowApp.this.remove(m_configAndPerspectives);
            m_configAndPerspectivesVisible = false;
          } else {
            KnowledgeFlowApp.this.add(m_configAndPerspectives,
              BorderLayout.NORTH);
            m_configAndPerspectivesVisible = true;
          }
          revalidate();
          repaint();
          notifyIsDirty();
        }
      };
      KeyStroke togglePerspectivesKey = KeyStroke.getKeyStroke(KeyEvent.VK_P,
        InputEvent.CTRL_DOWN_MASK);
      MainKFPerspective.this.getActionMap().put("Toggle perspectives",
        togglePerspectivesAction);
      MainKFPerspective.this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(togglePerspectivesKey, "Toggle perspectives");
      m_togglePerspectivesB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          togglePerspectivesAction.actionPerformed(e);
        }
      });

      final int standard_toolset = 0;
      final int wrapper_toolset = 1;

      int toolBarType = standard_toolset;

      DefaultMutableTreeNode jtreeRoot = new DefaultMutableTreeNode("Weka");
      // set up wrapper toolsets
      for (int i = 0; i < TOOLBARS.size(); i++) {
        Vector<?> tempBarSpecs = TOOLBARS.elementAt(i);

        // name for the tool bar
        String tempToolSetName = (String) tempBarSpecs.elementAt(0);
        DefaultMutableTreeNode subTreeNode = new InvisibleNode(tempToolSetName);
        jtreeRoot.add(subTreeNode);

        // Used for weka leaf packages
        // Box singletonHolderPanel = null;

        // name of the bean component to handle this class of weka algorithms
        String tempBeanCompName = (String) tempBarSpecs.elementAt(1);

        // the root package for weka algorithms
        String rootPackage = "";
        weka.gui.HierarchyPropertyParser hpp = null;
        Hashtable<String, HierarchyPropertyParser> hpps = null;

        // Is this a wrapper toolbar?
        if (tempBeanCompName.compareTo("null") != 0) {
          toolBarType = wrapper_toolset;
          rootPackage = (String) tempBarSpecs.elementAt(2);
          // hpp = (weka.gui.HierarchyPropertyParser)tempBarSpecs.elementAt(3);
          hpps = (Hashtable<String, HierarchyPropertyParser>) tempBarSpecs
            .elementAt(3);

          try {
            // modifications by Zerbetto
            // Beans.instantiate(null, tempBeanCompName);
            WekaPackageClassLoaderManager.objectForName(tempBeanCompName);
            //Beans.instantiate(this.getClass().getClassLoader(),
             // tempBeanCompName);

            // end modifications by Zerbetto
          } catch (Exception ex) {
            // ignore
            weka.core.logging.Logger.log(
              weka.core.logging.Logger.Level.WARNING,
              "[KnowledgeFlow] Failed to instantiate: "
                + tempBeanCompName);

            break;
          }
        } else {
          toolBarType = standard_toolset;
        }

        // a toolbar to hold buttons---one for each algorithm
        // JToolBar tempToolBar = new JToolBar();

        // System.err.println(tempToolBar.getLayout());
        // tempToolBar.setLayout(new FlowLayout());
        int z = 2;

        if (toolBarType == wrapper_toolset) {
          Enumeration<String> enm = hpps.keys();

          while (enm.hasMoreElements()) {
            String root = enm.nextElement();
            hpp = hpps.get(root);

            if (!hpp.goTo(rootPackage)) {
            }

            String[] primaryPackages = hpp.childrenValues();

            for (String primaryPackage : primaryPackages) {

              hpp.goToChild(primaryPackage);

              // check to see if this is a leaf - if so then there are no
              // sub packages
              if (hpp.isLeafReached()) {
                /*
                 * if (singletonHolderPanel == null) { singletonHolderPanel =
                 * Box.createHorizontalBox();
                 * singletonHolderPanel.setBorder(javax
                 * .swing.BorderFactory.createTitledBorder( tempToolSetName)); }
                 */

                String algName = hpp.fullValue();
                // -- tempBean = instantiateToolBarBean(true, tempBeanCompName,
                // algName);
                Object visibleCheck = instantiateBean(
                  (toolBarType == wrapper_toolset), tempBeanCompName, algName);

                // if (tempBean != null) {
                if (visibleCheck != null) {
                  // tempToolBar.add(tempBean);
                  // singletonHolderPanel.add(tempBean);

                  /*
                   * Object visibleCheck = instantiateBean((toolBarType ==
                   * wrapper_toolset), tempBeanCompName, algName);
                   */
                  if (visibleCheck instanceof BeanContextChild) {
                    m_bcSupport.add(visibleCheck);
                  }
                  ImageIcon scaledForTree = null;
                  if (visibleCheck instanceof Visible) {
                    BeanVisual bv = ((Visible) visibleCheck).getVisual();
                    if (bv != null) {
                      scaledForTree = new ImageIcon(bv.scale(0.33));
                      // m_iconLookup.put(algName, scaledForTree);
                    }
                  }

                  // try and get a tool tip
                  String toolTip = "";
                  try {
                    Object wrappedA = WekaPackageClassLoaderManager.objectForName(algName);
                    // Object wrappedA = Class.forName(algName).newInstance();
                    toolTip = getGlobalInfo(wrappedA);
                  } catch (Exception ex) {
                  }

                  JTreeLeafDetails leafData = new JTreeLeafDetails(
                    tempBeanCompName, algName, scaledForTree);

                  if (toolTip != null && toolTip.length() > 0) {
                    leafData.setToolTipText(toolTip);
                  }
                  DefaultMutableTreeNode leafAlgo = new InvisibleNode(leafData);
                  subTreeNode.add(leafAlgo);

                  m_nodeTextIndex.put(algName.toLowerCase() + " "
                    + (toolTip != null ? toolTip.toLowerCase() + " " : ""),
                    leafAlgo);
                }

                hpp.goToParent();
              } else {
                // make a titledborder JPanel to hold all the schemes in this
                // package
                // JPanel holderPanel = new JPanel();
                /*
                 * Box holderPanel = Box.createHorizontalBox();
                 * holderPanel.setBorder
                 * (javax.swing.BorderFactory.createTitledBorder(userPrefix +
                 * primaryPackages[kk]));
                 */

                DefaultMutableTreeNode firstLevelOfMainAlgoType =
                  new InvisibleNode(
                    primaryPackage);
                subTreeNode.add(firstLevelOfMainAlgoType);

                // processPackage(holderPanel, tempBeanCompName, hpp,
                // firstLevelOfMainAlgoType);
                processPackage(tempBeanCompName, hpp, firstLevelOfMainAlgoType,
                  m_nodeTextIndex);
                // tempToolBar.add(holderPanel);
              }
            }

            /*
             * if (singletonHolderPanel != null) {
             * tempToolBar.add(singletonHolderPanel); singletonHolderPanel =
             * null; }
             */
          }
        } else {
          /*
           * Box holderPanel = Box.createHorizontalBox();
           * holderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
           * tempToolSetName));
           */

          for (int j = z; j < tempBarSpecs.size(); j++) {
            tempBeanCompName = (String) tempBarSpecs.elementAt(j);
            Object visibleCheck = instantiateBean(
              (toolBarType == wrapper_toolset), tempBeanCompName, "");

            /*
             * -- tempBean = instantiateToolBarBean((toolBarType ==
             * wrapper_toolset), tempBeanCompName, "");
             */

            // if (tempBean != null) {
            if (visibleCheck != null) {
              // set tool tip text (if any)
              // setToolTipText(tempBean)
              // holderPanel.add(tempBean);

              String treeName = tempBeanCompName;
              if (treeName.lastIndexOf('.') > 0) {
                treeName = treeName.substring(treeName.lastIndexOf('.') + 1,
                  treeName.length());
              }

              /*
               * Object visibleCheck = instantiateBean((toolBarType ==
               * wrapper_toolset), tempBeanCompName, "");
               */
              if (visibleCheck instanceof BeanContextChild) {
                m_bcSupport.add(visibleCheck);
              }
              ImageIcon scaledForTree = null;

              if (visibleCheck instanceof Visible) {
                BeanVisual bv = ((Visible) visibleCheck).getVisual();
                if (bv != null) {
                  scaledForTree = new ImageIcon(bv.scale(0.33));

                  // m_iconLookup.put(treeName, scaledForTree);
                }
              }

              String tipText = null;
              tipText = getGlobalInfo(visibleCheck);

              // check for annotation and let this override any global info tool
              // tip
              Class<?> compClass = visibleCheck.getClass();
              Annotation[] annotations = compClass.getDeclaredAnnotations();

              String category = null;
              DefaultMutableTreeNode targetFolder = null;
              for (Annotation ann : annotations) {
                if (ann instanceof KFStep) {
                  tipText = "<html><font color=blue>"
                    + ((KFStep) ann).toolTipText() + "</font></html>";
                  category = ((KFStep) ann).category();

                  // Does this category already exist?
                  Enumeration<TreeNode> children = jtreeRoot.children();
                  while (children.hasMoreElements()) {
                    Object child = children.nextElement();
                    if (child instanceof DefaultMutableTreeNode) {
                      if (((DefaultMutableTreeNode) child).getUserObject()
                        .toString().equals(category)) {
                        targetFolder = (DefaultMutableTreeNode) child;
                        break;
                      }
                    }
                  }

                  break;
                }
              }

              JTreeLeafDetails leafData = new JTreeLeafDetails(
                tempBeanCompName, "", scaledForTree);
              if (tipText != null) {
                leafData.setToolTipText(tipText);
              }
              DefaultMutableTreeNode fixedLeafNode =
                new InvisibleNode(leafData);
              if (targetFolder != null) {
                targetFolder.add(fixedLeafNode);
              } else {
                subTreeNode.add(fixedLeafNode);
              }

              m_nodeTextIndex
                .put(tempBeanCompName.toLowerCase() + " "
                  + (tipText != null ? tipText.toLowerCase() : ""),
                  fixedLeafNode);
            }
          }

          // tempToolBar.add(holderPanel);
        }

        // JScrollPane tempJScrollPane =
        // createScrollPaneForToolBar(tempToolBar);
        // ok, now create tabbed pane to hold this toolbar
        // m_toolBars.addTab(tempToolSetName, null, tempJScrollPane,
        // tempToolSetName);
      }

      // / ----

      // TODO Prescan for bean plugins and only create user tree node if there
      // are actually some beans (rather than just all perspectives)

      // Any plugin components to process?
      if (BeansProperties.BEAN_PLUGINS_PROPERTIES != null
        && BeansProperties.BEAN_PLUGINS_PROPERTIES.size() > 0) {

        boolean pluginBeans = false;

        DefaultMutableTreeNode userSubTree = null;
        for (int i = 0; i < BeansProperties.BEAN_PLUGINS_PROPERTIES.size(); i++) {
          Properties tempP = BeansProperties.BEAN_PLUGINS_PROPERTIES.get(i);
          String components = tempP
            .getProperty("weka.gui.beans.KnowledgeFlow.Plugins");
          if (components != null && components.length() > 0) {
            StringTokenizer st2 = new StringTokenizer(components, ", ");

            while (st2.hasMoreTokens()) {
              String tempBeanCompName = st2.nextToken().trim();

              String treeName = tempBeanCompName;
              if (treeName.lastIndexOf('.') > 0) {
                treeName = treeName.substring(treeName.lastIndexOf('.') + 1,
                  treeName.length());
              }

              // tempBean = instantiateToolBarBean(false, tempBeanCompName, "");
              /*
               * if (m_pluginsToolBar == null) { // need to create the plugins
               * tab and toolbar setUpPluginsToolBar(); }
               * m_pluginsBoxPanel.add(tempBean);
               */

              Object visibleCheck = instantiateBean(
                (toolBarType == wrapper_toolset), tempBeanCompName, "");
              if (visibleCheck instanceof BeanContextChild) {
                m_bcSupport.add(visibleCheck);
              }
              ImageIcon scaledForTree = null;
              if (visibleCheck instanceof Visible) {
                BeanVisual bv = ((Visible) visibleCheck).getVisual();
                if (bv != null) {
                  scaledForTree = new ImageIcon(bv.scale(0.33));
                  // m_iconLookup.put(tempBeanCompName, scaledForTree);
                }
              }

              String tipText = null;
              tipText = getGlobalInfo(visibleCheck);

              // check for annotation
              Class<?> compClass = visibleCheck.getClass();
              Annotation[] annotations = compClass.getDeclaredAnnotations();
              DefaultMutableTreeNode targetFolder = null;
              String category = null;

              for (Annotation ann : annotations) {
                if (ann instanceof KFStep) {
                  category = ((KFStep) ann).category();
                  tipText = "<html><font color=red>"
                    + ((KFStep) ann).toolTipText() + "</font></html>";

                  // Does this category already exist?
                  Enumeration<TreeNode> children = jtreeRoot.children();

                  while (children.hasMoreElements()) {
                    Object child = children.nextElement();
                    if (child instanceof DefaultMutableTreeNode) {
                      if (((DefaultMutableTreeNode) child).getUserObject()
                        .toString().equals(category)) {
                        targetFolder = (DefaultMutableTreeNode) child;
                        break;
                      }
                    }
                  }
                  break;
                }
              }

              JTreeLeafDetails leafData = new JTreeLeafDetails(
                tempBeanCompName, "", scaledForTree);
              if (tipText != null) {
                leafData.setToolTipText(tipText);
              }
              DefaultMutableTreeNode pluginLeaf = new InvisibleNode(leafData);

              m_nodeTextIndex.put(tempBeanCompName.toLowerCase()
                + (tipText != null ? " " + tipText.toLowerCase() : ""),
                pluginLeaf);
              if (targetFolder != null) {
                targetFolder.add(pluginLeaf);
              } else if (category != null) {
                // make a new category folder
                DefaultMutableTreeNode newCategoryNode = new InvisibleNode(
                  category);
                jtreeRoot.add(newCategoryNode);
                newCategoryNode.add(pluginLeaf);
              } else {
                // add to the default "Plugins" folder
                if (!pluginBeans) {
                  // make the Plugins tree node entry
                  userSubTree = new InvisibleNode("Plugins");
                  jtreeRoot.add(userSubTree);
                  pluginBeans = true;
                }
                userSubTree.add(pluginLeaf);
              }
            }
          }

          // check for perspectives
          String perspectives = tempP
            .getProperty(("weka.gui.beans.KnowledgeFlow.Perspectives"));
          if (perspectives != null && perspectives.length() > 0) {
            StringTokenizer st2 = new StringTokenizer(perspectives, ",");
            while (st2.hasMoreTokens()) {
              String className = st2.nextToken();
              try {
                if (PluginManager.isInDisabledList(className)) {
                  continue;
                }
                Object p = WekaPackageClassLoaderManager.objectForName(className);
                // Object p = Class.forName(className).newInstance();
                if (p instanceof KFPerspective && p instanceof JPanel) {
                  String title = ((KFPerspective) p).getPerspectiveTitle();
                  weka.core.logging.Logger.log(
                    weka.core.logging.Logger.Level.INFO,
                    "[KnowledgeFlow] loaded perspective: "
                      + title);
                  m_pluginPerspectiveLookup.put(className, title);

                  // not selected as part of the users set of perspectives
                  // yet...
                  ((KFPerspective) p).setLoaded(false);

                  // check to see if user has selected to use this perspective
                  if (BeansProperties.VISIBLE_PERSPECTIVES.contains(className)) {
                    // add to the perspective cache. After processing
                    // all plugins we will iterate over the sorted
                    // VISIBLE_PERSPECTIVES in order to add them
                    // to the toolbar in consistent sorted order

                    // ((KFPerspective)p).setMainKFPerspective(m_mainKFPerspective);
                    m_perspectiveCache.put(className, (KFPerspective) p);
                  }
                }
              } catch (Exception ex) {
                if (m_logPanel != null) {
                  m_logPanel
                    .logMessage("[KnowledgeFlow] WARNING: "
                      + "unable to instantiate perspective \"" + className
                      + "\"");
                  ex.printStackTrace();
                } else {
                  System.err
                    .println("[KnowledgeFlow] WARNING: "
                      + "unable to instantiate perspective \"" + className
                      + "\"");
                  ex.printStackTrace();
                }
              }
            }
          }
        }
      }

      m_togglePerspectivesB.setEnabled(m_pluginPerspectiveLookup.keySet()
        .size() > 0);

      // toolBarPanel.add(m_toolBars, BorderLayout.CENTER);

      // add(m_toolBars, BorderLayout.NORTH);
      add(toolBarPanel, BorderLayout.NORTH);

      InvisibleTreeModel model = new InvisibleTreeModel(jtreeRoot);// new
                                                                   // DefaultTreeModel(jtreeRoot);
      model.activateFilter(true);

      // subclass JTree so that tool tips can be displayed for leaves (if
      // necessary)
      m_componentTree = new JTree(model) {
        /**
         *
         */
        private static final long serialVersionUID = 6628795889296634120L;

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
              JTreeLeafDetails leaf = (JTreeLeafDetails) node.getUserObject();
              return leaf.getToolTipText();
            }
          }
          return null;
        }
      };

      m_componentTree.setEnabled(true);
      m_componentTree.setToolTipText("");
      m_componentTree.setRootVisible(false);
      m_componentTree.setShowsRootHandles(true);
      m_componentTree.setCellRenderer(new BeanIconRenderer());
      DefaultTreeSelectionModel selectionModel =
        new DefaultTreeSelectionModel();
      selectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
      m_componentTree.setSelectionModel(selectionModel);

      m_componentTree.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

          if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
            || e.isAltDown()) {
            boolean clearSelection = true;

            if (clearSelection) {
              // right click cancels selected component
              m_toolBarBean = null;
              m_mode = NONE;
              KnowledgeFlowApp.this.setCursor(Cursor
                .getPredefinedCursor(Cursor.DEFAULT_CURSOR));
              m_componentTree.clearSelection();
            }
          }

          TreePath p = m_componentTree.getSelectionPath();
          if (p != null) {
            if (p.getLastPathComponent() instanceof DefaultMutableTreeNode) {
              DefaultMutableTreeNode tNode = (DefaultMutableTreeNode) p
                .getLastPathComponent();

              if (tNode.isLeaf()) {
                // System.err.println("Selected : " +
                // tNode.getUserObject().toString());
                Object userObject = tNode.getUserObject();
                if (userObject instanceof JTreeLeafDetails) {

                  if ((e.getModifiers() & InputEvent.SHIFT_MASK) != 0
                    && ((JTreeLeafDetails) userObject).isMetaBean()) {
                    if (m_firstUserComponentOpp) {
                      installWindowListenerForSavingUserStuff();
                      m_firstUserComponentOpp = false;
                    }

                    Vector<Object> toRemove = ((JTreeLeafDetails) userObject)
                      .getMetaBean();
                    DefaultTreeModel model = (DefaultTreeModel) m_componentTree
                      .getModel();
                    MutableTreeNode userRoot = (MutableTreeNode) tNode
                      .getParent(); // The "User" folder
                    model.removeNodeFromParent(tNode);
                    m_userComponents.remove(toRemove);

                    if (m_userComponents.size() == 0) {
                      model.removeNodeFromParent(userRoot);
                      m_userCompNode = null;
                    }

                  } else {
                    ((JTreeLeafDetails) userObject).instantiateBean();
                  }
                }
              }
            }
          }
        }
      });
    }

    public MainKFPerspective() {
      setLayout(new BorderLayout());
      setUpToolsAndJTree();

      JScrollPane treeView = new JScrollPane(m_componentTree);
      JPanel treeHolder = new JPanel();
      treeHolder.setLayout(new BorderLayout());
      treeHolder.setBorder(BorderFactory.createTitledBorder("Design"));
      treeHolder.add(treeView, BorderLayout.CENTER);

      final JTextField searchField = new JTextField();
      treeHolder.add(searchField, BorderLayout.NORTH);
      searchField.setToolTipText("Search (clear field to reset)");

      searchField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
          String searchTerm = searchField.getText();
          List<DefaultMutableTreeNode> nonhits =
            new ArrayList<DefaultMutableTreeNode>();
          List<DefaultMutableTreeNode> hits =
            new ArrayList<DefaultMutableTreeNode>();
          DefaultTreeModel model = (DefaultTreeModel) m_componentTree
            .getModel();
          model.reload(); // collapse all nodes first

          for (Map.Entry<String, DefaultMutableTreeNode> entry : m_nodeTextIndex
            .entrySet()) {
            if (entry.getValue() instanceof InvisibleNode) {
              ((InvisibleNode) entry.getValue()).setVisible(true);
            }

            if (searchTerm != null && searchTerm.length() > 0) {
              if (entry.getKey().contains(searchTerm.toLowerCase())) {
                hits.add(entry.getValue());
              } else {
                nonhits.add(entry.getValue());
              }
            }
          }

          if (searchTerm == null || searchTerm.length() == 0) {
            model.reload(); // just reset everything
          }
          // if we have some hits then set all the non-hits to invisible
          if (hits.size() > 0) {
            for (DefaultMutableTreeNode h : nonhits) {
              if (h instanceof InvisibleNode) {
                ((InvisibleNode) h).setVisible(false);
              }
            }
            model.reload(); // collapse all the nodes first

            // expand all the hits
            for (DefaultMutableTreeNode h : hits) {
              TreeNode[] path = model.getPathToRoot(h);
              TreePath tpath = new TreePath(path);
              tpath = tpath.getParentPath();
              m_componentTree.expandPath(tpath);
            }
          }
        }
      });

      // m_perspectiveHolder.add(treeHolder, BorderLayout.WEST);

      JSplitPane p2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeHolder,
        m_flowTabs);
      p2.setOneTouchExpandable(true);

      add(p2, BorderLayout.CENTER);

      Dimension d = treeView.getPreferredSize();
      d = new Dimension((int) (d.getWidth() * 1.5), (int) d.getHeight());
      treeView.setPreferredSize(d);
      treeView.setMinimumSize(d);

      m_flowTabs.addChangeListener(new ChangeListener() {
        // This method is called whenever the selected tab changes
        @Override
        public void stateChanged(ChangeEvent evt) {

          // Get current tab
          int sel = m_flowTabs.getSelectedIndex();
          setActiveTab(sel);
        }
      });
    }

    public synchronized void removeTab(int tabIndex) {
      if (tabIndex < 0 || tabIndex >= getNumTabs()) {
        return;
      }

      if (m_editedList.get(tabIndex)) {
        // prompt for save
        String tabTitle = m_flowTabs.getTitleAt(tabIndex);
        String message = "\"" + tabTitle
          + "\" has been modified. Save changes " + "before closing?";
        int result = JOptionPane.showConfirmDialog(KnowledgeFlowApp.this,
          message, "Save changes", JOptionPane.YES_NO_CANCEL_OPTION);

        if (result == JOptionPane.YES_OPTION) {
          saveLayout(tabIndex, false);
        } else if (result == JOptionPane.CANCEL_OPTION) {
          return;
        }
      }

      BeanLayout bl = m_beanLayouts.get(tabIndex);
      BeanInstance.removeBeanInstances(bl, tabIndex);
      BeanConnection.removeConnectionList(tabIndex);
      m_beanLayouts.remove(tabIndex);
      m_zoomSettings.remove(tabIndex);
      m_logPanels.remove(tabIndex);
      m_editedList.remove(tabIndex);
      m_environmentSettings.remove(tabIndex);
      m_selectedBeans.remove(tabIndex);
      bl = null;

      m_flowTabs.remove(tabIndex);

      if (getCurrentTabIndex() < 0) {
        m_beanLayout = null;
        m_logPanel = null;
        m_saveB.setEnabled(false);
      }
    }

    public synchronized void addTab(String tabTitle) {
      // new beans for this tab
      BeanInstance.addBeanInstances(new Vector<Object>(), null);
      // new connections for this tab
      BeanConnection.addConnections(new Vector<BeanConnection>());

      JPanel p1 = new JPanel();
      p1.setLayout(new BorderLayout());
      /*
       * p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
       * javax.swing.BorderFactory. createTitledBorder("Knowledge Flow Layout"),
       * javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5) ));
       */
      BeanLayout tabBeanLayout = new BeanLayout();

      final JScrollPane js = new JScrollPane(tabBeanLayout);
      p1.add(js, BorderLayout.CENTER);
      js.getVerticalScrollBar().setUnitIncrement(m_ScrollBarIncrementLayout);
      js.getHorizontalScrollBar().setUnitIncrement(m_ScrollBarIncrementLayout);

      configureBeanLayout(tabBeanLayout);
      m_beanLayouts.add(tabBeanLayout);

      tabBeanLayout.setSize(m_FlowWidth, m_FlowHeight);
      Dimension d = tabBeanLayout.getPreferredSize();
      tabBeanLayout.setMinimumSize(d);
      // tabBeanLayout.setMaximumSize(d);
      tabBeanLayout.setPreferredSize(d);

      m_zoomSettings.add(new Integer(100));

      KFLogPanel tabLogPanel = new KFLogPanel();
      setUpLogPanel(tabLogPanel);
      Dimension d2 = new Dimension(100, 170);
      tabLogPanel.setPreferredSize(d2);
      tabLogPanel.setMinimumSize(d2);
      m_logPanels.add(tabLogPanel);

      m_environmentSettings.add(new Environment());
      m_filePaths.add(new File("-NONE-"));

      JSplitPane p2 =
        new JSplitPane(JSplitPane.VERTICAL_SPLIT, p1, tabLogPanel);
      p2.setOneTouchExpandable(true);
      // p2.setDividerLocation(500);
      p2.setDividerLocation(0.7);
      p2.setResizeWeight(1.0);
      JPanel splitHolder = new JPanel();
      splitHolder.setLayout(new BorderLayout());
      splitHolder.add(p2, BorderLayout.CENTER);

      // add(splitHolder, BorderLayout.CENTER);

      m_editedList.add(new Boolean(false));
      m_executingList.add(new Boolean(false));
      m_executionThreads.add((RunThread) null);
      m_selectedBeans.add(new Vector<Object>());
      m_undoBufferList.add(new Stack<File>());

      m_flowTabs.addTab(tabTitle, splitHolder);
      int tabIndex = getNumTabs() - 1;
      m_flowTabs.setTabComponentAt(tabIndex, new CloseableTabTitle(m_flowTabs));
      setActiveTab(getNumTabs() - 1);
      m_saveB.setEnabled(true);
    }
  }

  private class CloseableTabTitle extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = -6844232025394346426L;

    private final JTabbedPane m_enclosingPane;

    private JLabel m_tabLabel;
    private TabButton m_tabButton;

    public CloseableTabTitle(final JTabbedPane pane) {
      super(new FlowLayout(FlowLayout.LEFT, 0, 0));

      m_enclosingPane = pane;
      setOpaque(false);
      setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));

      // read the title from the JTabbedPane
      m_tabLabel = new JLabel() {
        /**
         *
         */
        private static final long serialVersionUID = 8515052190461050324L;

        @Override
        public String getText() {
          int index = m_enclosingPane
            .indexOfTabComponent(CloseableTabTitle.this);
          if (index >= 0) {
            return m_enclosingPane.getTitleAt(index);
          }
          return null;
        }
      };

      add(m_tabLabel);
      m_tabLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
      m_tabButton = new TabButton();
      add(m_tabButton);

    }

    public void setBold(boolean bold) {
      m_tabLabel.setEnabled(bold);
    }

    public void setButtonEnabled(boolean enabled) {
      m_tabButton.setEnabled(enabled);
    }

    private class TabButton extends JButton implements ActionListener {
      /**
       *
       */
      private static final long serialVersionUID = -4915800749132175968L;

      public TabButton() {
        int size = 17;
        setPreferredSize(new Dimension(size, size));
        setToolTipText("close this tab");
        // Make the button looks the same for all Laf's
        setUI(new BasicButtonUI());
        // Make it transparent
        setContentAreaFilled(false);
        // No need to be focusable
        setFocusable(false);
        setBorder(BorderFactory.createEtchedBorder());
        setBorderPainted(false);
        // Making nice rollover effect
        // we use the same listener for all buttons
        addMouseListener(new MouseAdapter() {
          @Override
          public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();

            if (component instanceof AbstractButton) {
              AbstractButton button = (AbstractButton) component;
              button.setBorderPainted(true);

              int i = m_enclosingPane
                .indexOfTabComponent(CloseableTabTitle.this);
              if (i == m_mainKFPerspective.getCurrentTabIndex()) {
                button.setToolTipText("close this tab (Ctrl+W)");
              } else {
                button.setToolTipText("close this tab");
              }
            }
          }

          @Override
          public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
              AbstractButton button = (AbstractButton) component;
              button.setBorderPainted(false);
            }
          }
        });
        setRolloverEnabled(true);
        // Close the proper tab by clicking the button
        addActionListener(this);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
        int i = m_enclosingPane.indexOfTabComponent(CloseableTabTitle.this);
        if (i >= 0 && getAllowMultipleTabs()) {
          // m_enclosingPane.remove(i);
          m_mainKFPerspective.removeTab(i);
        }
      }

      // we don't want to update UI for this button
      @Override
      public void updateUI() {
      }

      // paint the cross
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        // shift the image for pressed buttons
        if (getModel().isPressed()) {
          g2.translate(1, 1);
        }
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.BLACK);
        if (!isEnabled()) {
          g2.setColor(Color.GRAY);
        }
        if (getModel().isRollover()) {
          g2.setColor(Color.MAGENTA);
        }
        int delta = 6;
        g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta
          - 1);
        g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta
          - 1);
        g2.dispose();
      }
    }
  }

  // Used for measuring and splitting icon labels
  // over multiple lines
  FontMetrics m_fontM;

  // constants for operations in progress
  protected static final int NONE = 0;
  protected static final int MOVING = 1;
  protected static final int CONNECTING = 2;
  protected static final int ADDING = 3;
  protected static final int SELECTING = 4;
  protected static final int PASTING = 5;

  // which operation is in progress
  private int m_mode = NONE;

  /** the extension for the user components, when serialized to XML */
  protected final static String USERCOMPONENTS_XML_EXTENSION = ".xml";

  /**
   * Holds the selected toolbar bean
   */
  private Object m_toolBarBean;

  /** Snap-to-grid spacing */
  private final int m_gridSpacing = 40;

  /** Number of untitled tabs so far */
  protected int m_untitledCount = 1;

  /**
   * The layout area
   */
  private BeanLayout m_beanLayout = null;// new BeanLayout();

  private int m_layoutZoom = 100;

  /** Whether to allow more than one tab or not */
  private boolean m_allowMultipleTabs = true;

  private final Vector<Object> m_userComponents = new Vector<Object>();

  private boolean m_firstUserComponentOpp = true;

  protected JButton m_pointerB;
  protected JButton m_saveB;
  protected JButton m_saveBB;
  protected JButton m_loadB;
  protected JButton m_stopB;
  protected JButton m_playB;
  protected JButton m_playBB;
  protected JButton m_helpB;
  protected JButton m_newB;
  protected JButton m_togglePerspectivesB;
  protected JButton m_templatesB;

  protected JButton m_groupB;
  protected JButton m_cutB;
  protected JButton m_copyB;
  protected JButton m_pasteB;
  protected JButton m_deleteB;
  protected JButton m_noteB;
  protected JButton m_selectAllB;
  protected JButton m_undoB;
  protected JButton m_zoomInB;
  protected JButton m_zoomOutB;

  protected JToggleButton m_snapToGridB;

  /**
   * Reference to bean being manipulated
   */
  private BeanInstance m_editElement;

  /**
   * Event set descriptor for the bean being manipulated
   */
  private EventSetDescriptor m_sourceEventSetDescriptor;

  /**
   * Used to record screen coordinates during move, select and connect
   * operations
   */
  private int m_oldX, m_oldY;
  private int m_startX, m_startY;

  /** The file chooser for selecting layout files */
  protected JFileChooser m_FileChooser = new JFileChooser(new File(
    System.getProperty("user.dir")));

  protected class KFLogPanel extends LogPanel {
    /**
     *
     */
    private static final long serialVersionUID = -2224509243343105276L;

    public synchronized void
      setMessageOnAll(boolean mainKFLine, String message) {
      for (String key : m_tableIndexes.keySet()) {
        if (!mainKFLine && key.equals("[KnowledgeFlow]")) {
          continue;
        }

        String tm = key + "|" + message;
        statusMessage(tm);
      }
    }
  }

  protected KFLogPanel m_logPanel = null; // new LogPanel();//new LogPanel(null,
                                          // true);

  /** Toolbar to hold the perspective buttons */
  protected JToolBar m_perspectiveToolBar = new JToolBar(JToolBar.HORIZONTAL);

  /** Panel to hold the perspectives toolbar and config button */
  protected JPanel m_configAndPerspectives;

  /**
   * Whether the perspectives toolbar is visible at present (will never be
   * visible if there are no plugin perspectives installed)
   */
  protected boolean m_configAndPerspectivesVisible = true;

  /**
   * Button group to manage all perspective toggle buttons
   */
  private final ButtonGroup m_perspectiveGroup = new ButtonGroup();

  /** Component that holds the currently visible perspective */
  protected JPanel m_perspectiveHolder;

  /**
   * Holds the list of currently loaded perspectives. Element at 0 is always the
   * main KF data mining flow perspective
   */
  protected List<KFPerspective> m_perspectives = new ArrayList<KFPerspective>();

  /** Thread for loading data for perspectives */
  protected Thread m_perspectiveDataLoadThread = null;

  protected AttributeSelectionPanel m_perspectiveConfigurer;

  /** Shortcut to the main perspective */
  protected MainKFPerspective m_mainKFPerspective;

  protected BeanContextSupport m_bcSupport = new BeanContextSupport();

  /** the extension for the serialized setups (Java serialization) */
  public final static String FILE_EXTENSION = ".kf";

  /** the extension for the serialized setups (Java serialization) */
  public final static String FILE_EXTENSION_XML = ".kfml";

  /**
   * A filter to ensure only KnowledgeFlow files in binary format get shown in
   * the chooser
   */
  protected FileFilter m_KfFilter = new ExtensionFileFilter(FILE_EXTENSION,
    "Binary KnowledgeFlow configuration files (*" + FILE_EXTENSION + ")");

  /**
   * A filter to ensure only KnowledgeFlow files in KOML format get shown in the
   * chooser
   */
  protected FileFilter m_KOMLFilter = new ExtensionFileFilter(
    KOML.FILE_EXTENSION + "kf", "XML KnowledgeFlow configuration files (*"
      + KOML.FILE_EXTENSION + "kf)");

  /**
   * A filter to ensure only KnowledgeFlow files in XStream format get shown in
   * the chooser
   */
  protected FileFilter m_XStreamFilter = new ExtensionFileFilter(
    XStream.FILE_EXTENSION + "kf", "XML KnowledgeFlow configuration files (*"
      + XStream.FILE_EXTENSION + "kf)");
<<<<<<< HEAD
=======
=======
  // Used for measuring and splitting icon labels
  // over multiple lines
  FontMetrics m_fontM;

  // constants for operations in progress
  protected static final int NONE = 0;
  protected static final int MOVING = 1;
  protected static final int CONNECTING = 2;
  protected static final int ADDING = 3;
  protected static final int SELECTING = 4;

  // which operation is in progress
  private int m_mode = NONE;

  /** the extension for the user components, when serialized to XML */
  protected final static String USERCOMPONENTS_XML_EXTENSION = ".xml";

  /**
   * Button group to manage all toolbar buttons
   */
  private final ButtonGroup m_toolBarGroup = new ButtonGroup();

  /**
   * Holds the selected toolbar bean
   */
  private Object m_toolBarBean;

  /**
   * The layout area
   */
  private final BeanLayout m_beanLayout = new BeanLayout();

  /**
   * Tabbed pane to hold tool bars
   */
  private final JTabbedPane m_toolBars = new JTabbedPane();

  /**
   * Stuff relating to plugin beans
   */
  private JToolBar m_pluginsToolBar = null;
  private Box m_pluginsBoxPanel = null;

  /**
   * Stuff relating to user created meta beans
   */
  private JToolBar m_userToolBar = null;
  private Box m_userBoxPanel = null;
  private final Vector m_userComponents = new Vector();
  private boolean m_firstUserComponentOpp = true;

  private JToggleButton m_pointerB;
  private JButton m_saveB;
  private JButton m_loadB;
  private JButton m_stopB;
  private JButton m_helpB;
  private JButton m_newB;

  /**
   * Reference to bean being manipulated
   */
  private BeanInstance m_editElement;

  /**
   * Event set descriptor for the bean being manipulated
   */
  private EventSetDescriptor m_sourceEventSetDescriptor;

  /**
   * Used to record screen coordinates during move, select and connect
   * operations
   */
  private int m_oldX, m_oldY;
  private int m_startX, m_startY;

  /** The file chooser for selecting layout files */
  protected JFileChooser m_FileChooser = new JFileChooser(new File(
      System.getProperty("user.dir")));

  protected LogPanel m_logPanel = new LogPanel();// new LogPanel(null, true);

  protected BeanContextSupport m_bcSupport = new BeanContextSupport();

  /** the extension for the serialized setups (Java serialization) */
  public final static String FILE_EXTENSION = ".kf";

  /** the extension for the serialized setups (Java serialization) */
  public final static String FILE_EXTENSION_XML = ".kfml";

  /**
   * A filter to ensure only KnowledgeFlow files in binary format get shown in
   * the chooser
   */
  protected FileFilter m_KfFilter = new ExtensionFileFilter(FILE_EXTENSION,
      Messages.getInstance().getString("KnowledgeFlowApp_KfFilter_Text_First")
          + FILE_EXTENSION
          + Messages.getInstance().getString(
              "KnowledgeFlowApp_KfFilter_Text_Second"));

  /**
   * A filter to ensure only KnowledgeFlow files in KOML format get shown in the
   * chooser
   */
  protected FileFilter m_KOMLFilter = new ExtensionFileFilter(
      KOML.FILE_EXTENSION + "kf", Messages.getInstance().getString(
          "KnowledgeFlowApp_KOMLFilter_Text_Second")
          + KOML.FILE_EXTENSION
          + Messages.getInstance().getString(
              "KnowledgeFlowApp_KOMLFilter_Text_Third"));

  /**
   * A filter to ensure only KnowledgeFlow files in XStream format get shown in
   * the chooser
   */
  protected FileFilter m_XStreamFilter = new ExtensionFileFilter(
      XStream.FILE_EXTENSION + "kf", Messages.getInstance().getString(
          "KnowledgeFlowApp_XStreamFilter_Text_Second")
          + XStream.FILE_EXTENSION
          + Messages.getInstance().getString(
              "KnowledgeFlowApp_XStreamFilter_Text_Third"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * A filter to ensure only KnowledgeFlow layout files in XML format get shown
   * in the chooser
   */
  protected FileFilter m_XMLFilter = new ExtensionFileFilter(
<<<<<<< HEAD
    FILE_EXTENSION_XML, "XML KnowledgeFlow layout files (*"
      + FILE_EXTENSION_XML + ")");
=======
<<<<<<< HEAD
    FILE_EXTENSION_XML, "XML KnowledgeFlow layout files (*"
      + FILE_EXTENSION_XML + ")");
=======
      FILE_EXTENSION_XML, Messages.getInstance().getString(
          "KnowledgeFlowApp_XMLFilter_Text_First")
          + FILE_EXTENSION_XML
          + Messages.getInstance().getString(
              "KnowledgeFlowApp_XMLFilter_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the scrollbar increment of the layout scrollpane */
  protected int m_ScrollBarIncrementLayout = 20;

  /** the scrollbar increment of the components scrollpane */
  protected int m_ScrollBarIncrementComponents = 50;

  /** the flow layout width */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected int m_FlowWidth = 2560;

  /** the flow layout height */
  protected int m_FlowHeight = 1440;
<<<<<<< HEAD
=======
=======
  protected int m_FlowWidth = 1024;

  /** the flow layout height */
  protected int m_FlowHeight = 768;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the preferred file extension */
  protected String m_PreferredExtension = FILE_EXTENSION;

  /** whether to store the user components in XML or in binary format */
  protected boolean m_UserComponentsInXML = false;

  /** Environment variables for the current flow */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected Environment m_flowEnvironment = new Environment();

  /** Palette of components stored in a JTree */
  protected JTree m_componentTree;

  /** The node of the JTree that holds "user" (metabean) components */
  protected DefaultMutableTreeNode m_userCompNode;

  /** The clip board */
  protected StringBuffer m_pasteBuffer;
<<<<<<< HEAD
=======
=======
  protected Environment m_flowEnvironment = new Environment();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Set the environment variables to use. NOTE: loading a new layout resets
   * back to the default set of variables
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param env
   */
  public void setEnvironment(Environment env) {
    m_flowEnvironment = env;
    setEnvironment();
  }

  private void setEnvironment() {
    // pass m_flowEnvironment to all components
    // that implement EnvironmentHandler
<<<<<<< HEAD
    Vector<Object> beans = BeanInstance.getBeanInstances(m_mainKFPerspective
      .getCurrentTabIndex());
=======
<<<<<<< HEAD
    Vector<Object> beans = BeanInstance.getBeanInstances(m_mainKFPerspective
      .getCurrentTabIndex());
=======
    Vector beans = BeanInstance.getBeanInstances();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < beans.size(); i++) {
      Object temp = ((BeanInstance) beans.elementAt(i)).getBean();

      if (temp instanceof EnvironmentHandler) {
        ((EnvironmentHandler) temp).setEnvironment(m_flowEnvironment);
      }
    }
  }

  /**
   * Creates a new <code>KnowledgeFlowApp</code> instance.
   */
  // modifications by Zerbetto
  // public KnowledgeFlowApp() {
  public KnowledgeFlowApp(boolean showFileMenu) {
<<<<<<< HEAD
    if (BeansProperties.BEAN_PROPERTIES == null) {
=======
<<<<<<< HEAD
    if (BeansProperties.BEAN_PROPERTIES == null) {
=======
    if (BEAN_PROPERTIES == null) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      loadProperties();
      init();
    }

    m_showFileMenu = showFileMenu;

    // end modifications by Zerbetto
    // Grab a fontmetrics object
    JWindow temp = new JWindow();
    temp.setVisible(true);
    temp.getGraphics().setFont(new Font(null, Font.PLAIN, 9));
    m_fontM = temp.getGraphics().getFontMetrics();
    temp.setVisible(false);

    // some GUI defaults
    try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_ScrollBarIncrementLayout = Integer
        .parseInt(BeansProperties.BEAN_PROPERTIES.getProperty(
          "ScrollBarIncrementLayout", "" + m_ScrollBarIncrementLayout));
      m_ScrollBarIncrementComponents = Integer
        .parseInt(BeansProperties.BEAN_PROPERTIES.getProperty(
          "ScrollBarIncrementComponents", "" + m_ScrollBarIncrementComponents));
      m_FlowWidth = Integer.parseInt(BeansProperties.BEAN_PROPERTIES
        .getProperty("FlowWidth", "" + m_FlowWidth));
      m_FlowHeight = Integer.parseInt(BeansProperties.BEAN_PROPERTIES
        .getProperty("FlowHeight", "" + m_FlowHeight));
      m_PreferredExtension = BeansProperties.BEAN_PROPERTIES.getProperty(
        "PreferredExtension", m_PreferredExtension);
      m_UserComponentsInXML = Boolean.valueOf(
        BeansProperties.BEAN_PROPERTIES.getProperty("UserComponentsInXML", ""
          + m_UserComponentsInXML)).booleanValue();
<<<<<<< HEAD
=======
=======
      m_ScrollBarIncrementLayout = Integer.parseInt(BEAN_PROPERTIES
          .getProperty("ScrollBarIncrementLayout", ""
              + m_ScrollBarIncrementLayout));
      m_ScrollBarIncrementComponents = Integer.parseInt(BEAN_PROPERTIES
          .getProperty("ScrollBarIncrementComponents", ""
              + m_ScrollBarIncrementComponents));
      m_FlowWidth = Integer.parseInt(BEAN_PROPERTIES.getProperty("FlowWidth",
          "" + m_FlowWidth));
      m_FlowHeight = Integer.parseInt(BEAN_PROPERTIES.getProperty("FlowHeight",
          "" + m_FlowHeight));
      m_PreferredExtension = BEAN_PROPERTIES.getProperty("PreferredExtension",
          m_PreferredExtension);
      m_UserComponentsInXML = Boolean.valueOf(
          BEAN_PROPERTIES.getProperty("UserComponentsInXML", ""
              + m_UserComponentsInXML)).booleanValue();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    // FileChooser
    m_FileChooser.addChoosableFileFilter(m_KfFilter);
    if (KOML.isPresent()) {
      m_FileChooser.addChoosableFileFilter(m_KOMLFilter);
    }
    if (XStream.isPresent()) {
      m_FileChooser.addChoosableFileFilter(m_XStreamFilter);
    }

    m_FileChooser.addChoosableFileFilter(m_XMLFilter);

    if (m_PreferredExtension.equals(FILE_EXTENSION_XML)) {
      m_FileChooser.setFileFilter(m_XMLFilter);
    } else if (KOML.isPresent()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      && m_PreferredExtension.equals(KOML.FILE_EXTENSION + "kf")) {
      m_FileChooser.setFileFilter(m_KOMLFilter);
    } else if (XStream.isPresent()
      && m_PreferredExtension.equals(XStream.FILE_EXTENSION + "kf")) {
<<<<<<< HEAD
=======
=======
        && m_PreferredExtension.equals(KOML.FILE_EXTENSION + "kf")) {
      m_FileChooser.setFileFilter(m_KOMLFilter);
    } else if (XStream.isPresent()
        && m_PreferredExtension.equals(XStream.FILE_EXTENSION + "kf")) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_FileChooser.setFileFilter(m_XStreamFilter);
    } else {
      m_FileChooser.setFileFilter(m_KfFilter);
    }
    m_FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

    m_bcSupport.setDesignTime(true);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_perspectiveHolder = new JPanel();
    m_perspectiveHolder.setLayout(new BorderLayout());

    // TODO North will hold main perspective toggle buttons
    // WEST will hold JTree - perhaps not
    // CENTER will hold perspective

    /*
     * JPanel p2 = new JPanel(); p2.setLayout(new BorderLayout());
     */

    m_mainKFPerspective = new MainKFPerspective();

    // m_perspectiveHolder.add(m_mainKFPerspective, BorderLayout.CENTER);
    m_perspectives.add(m_mainKFPerspective);

    // mainPanel.add(m_perspectiveHolder, BorderLayout.CENTER);
    setLayout(new BorderLayout());

    add(m_perspectiveHolder, BorderLayout.CENTER);

    // setUpToolBars(p2);
    // setUpToolsAndJTree(m_mainKFPerspective);

    m_perspectiveHolder.add(m_mainKFPerspective, BorderLayout.CENTER);

    if (m_pluginPerspectiveLookup.size() > 0) {

      // add the main perspective first
      String titleM = m_mainKFPerspective.getPerspectiveTitle();
      Icon icon = m_mainKFPerspective.getPerspectiveIcon();
      JToggleButton tBut = new JToggleButton(titleM, icon, true);
      tBut.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          KFPerspective current = (KFPerspective) m_perspectiveHolder
            .getComponent(0);
          current.setActive(false);
          m_perspectiveHolder.remove(0);
          m_perspectiveHolder.add((JComponent) m_perspectives.get(0),
            BorderLayout.CENTER);
          m_perspectives.get(0).setActive(true);
          // KnowledgeFlowApp.this.invalidate();
          KnowledgeFlowApp.this.revalidate();
          KnowledgeFlowApp.this.repaint();
          notifyIsDirty();
        }
      });
      m_perspectiveToolBar.add(tBut);
      m_perspectiveGroup.add(tBut);

      // set up the perspective toolbar toggle buttons
      // first load the perspectives list in sorted order (kf perspective
      // is always at index 0)
      setupUserPerspectives();
    }

    if (m_pluginPerspectiveLookup.size() > 0) {
      m_configAndPerspectives = new JPanel();
      m_configAndPerspectives.setLayout(new BorderLayout());
      m_configAndPerspectives.add(m_perspectiveToolBar, BorderLayout.CENTER);

      try {
        Properties visible = Utils
          .readProperties(BeansProperties.VISIBLE_PERSPECTIVES_PROPERTIES_FILE);
        Enumeration<?> keys = visible.propertyNames();
        if (keys.hasMoreElements()) {

          String toolBarIsVisible =
            visible
              .getProperty("weka.gui.beans.KnowledgeFlow.PerspectiveToolBarVisisble");
          if (toolBarIsVisible != null && toolBarIsVisible.length() > 0) {
            m_configAndPerspectivesVisible = toolBarIsVisible
              .equalsIgnoreCase("yes");
          }
        }
      } catch (Exception ex) {
        System.err
          .println("Problem reading visible perspectives property file");
        ex.printStackTrace();
      }

      // add the perspectives toolbar
      // does the user want it visible?
      if (m_configAndPerspectivesVisible) {
        add(m_configAndPerspectives, BorderLayout.NORTH);
      }

      JButton configB = new JButton(new ImageIcon(
        loadImage(BeanVisual.ICON_PATH + "cog.png")));
      configB.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 1));
      configB.setToolTipText("Enable/disable perspectives");
      m_configAndPerspectives.add(configB, BorderLayout.WEST);

      configB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (!Utils
            .getDontShowDialog("weka.gui.beans.KnowledgeFlow.PerspectiveInfo")) {
            JCheckBox dontShow =
              new JCheckBox("Do not show this message again");
            Object[] stuff = new Object[2];
            stuff[0] =
              "Perspectives are environments that take over the\n"
                + "Knowledge Flow UI and provide major additional functionality.\n"
                + "Many perspectives will operate on a set of instances. Instances\n"
                + "Can be sent to a perspective by placing a DataSource on the\n"
                + "layout canvas, configuring it and then selecting \"Send to perspective\"\n"
                + "from the contextual popup menu that appears when you right-click on\n"
                + "it. Several perspectives are built in to the Knowledge Flow, others\n"
                + "can be installed via the package manager.\n";
            stuff[1] = dontShow;

            JOptionPane.showMessageDialog(KnowledgeFlowApp.this, stuff,
              "Perspective information", JOptionPane.OK_OPTION);

            if (dontShow.isSelected()) {
              try {
                Utils
                  .setDontShowDialog("weka.gui.beans.KnowledgeFlow.PerspectiveInfo");
              } catch (Exception ex) {
                // quietly ignore
              }
            }
          }

          popupPerspectiveConfigurer();
        }
      });
    }

    // set main perspective on all cached perspectives
    for (String pName : m_perspectiveCache.keySet()) {
      m_perspectiveCache.get(pName).setMainKFPerspective(m_mainKFPerspective);
    }

    loadUserComponents();
    clearLayout(); // add an initial "Untitled" tab
  }

  /**
   * Gets the main knowledge flow perspective
   *
   * @return the main knowledge flow perspective
   */
  public MainKFPerspective getMainPerspective() {
    return m_mainKFPerspective;
  }

  private void popupPerspectiveConfigurer() {
    if (m_perspectiveConfigurer == null) {
      m_perspectiveConfigurer = new AttributeSelectionPanel(true, true, true,
        true);
    }

    if (m_firstUserComponentOpp) {
      installWindowListenerForSavingUserStuff();
      m_firstUserComponentOpp = false;
    }

    ArrayList<Attribute> atts = new ArrayList<Attribute>();
    final ArrayList<String> pClasses = new ArrayList<String>();
    SortedSet<String> sortedPerspectives = new TreeSet<String>();
    for (String clName : m_pluginPerspectiveLookup.keySet()) {
      sortedPerspectives.add(clName);
    }
    for (String clName : sortedPerspectives) {
      pClasses.add(clName);
      String pName = m_pluginPerspectiveLookup.get(clName);
      atts.add(new Attribute(pName));
    }
    Instances perspectiveInstances = new Instances("Perspectives", atts, 1);

    boolean[] selectedPerspectives = new boolean[perspectiveInstances
      .numAttributes()];
    for (String selected : BeansProperties.VISIBLE_PERSPECTIVES) {
      String pName = m_pluginPerspectiveLookup.get(selected);

      // check here - just in case the user has uninstalled/deleted a plugin
      // perspective since the last time that the user-selected visible
      // perspectives
      // list was written out to the props file
      if (pName != null) {
        int index = perspectiveInstances.attribute(pName).index();
        selectedPerspectives[index] = true;
      }
    }

    m_perspectiveConfigurer.setInstances(perspectiveInstances);
    try {
      m_perspectiveConfigurer.setSelectedAttributes(selectedPerspectives);
    } catch (Exception ex) {
      ex.printStackTrace();
      return;
    }

    final JDialog d = new JDialog(
      (JFrame) KnowledgeFlowApp.this.getTopLevelAncestor(),
      "Manage Perspectives", ModalityType.DOCUMENT_MODAL);
    d.setLayout(new BorderLayout());

    JPanel holder = new JPanel();
    holder.setLayout(new BorderLayout());
    holder.add(m_perspectiveConfigurer, BorderLayout.CENTER);
    JButton okBut = new JButton("OK");
    JButton cancelBut = new JButton("Cancel");
    JPanel butHolder = new JPanel();
    butHolder.setLayout(new GridLayout(1, 2));
    butHolder.add(okBut);
    butHolder.add(cancelBut);
    holder.add(butHolder, BorderLayout.SOUTH);
    okBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BeansProperties.VISIBLE_PERSPECTIVES = new TreeSet<String>();

        int[] selected = m_perspectiveConfigurer.getSelectedAttributes();
        for (int element : selected) {
          String selectedClassName = pClasses.get(element);

          // first check to see if it's in the cache already
          if (m_perspectiveCache.get(selectedClassName) == null) {
            // need to instantiate and add to the cache

            try {
              Object p = WekaPackageClassLoaderManager.objectForName(selectedClassName);
              // Object p = Class.forName(selectedClassName).newInstance();
              if (p instanceof KFPerspective && p instanceof JPanel) {
                String title = ((KFPerspective) p).getPerspectiveTitle();
                weka.core.logging.Logger.log(
                  weka.core.logging.Logger.Level.INFO,
                  "[KnowledgeFlow] loaded perspective: "
                    + title);

                ((KFPerspective) p).setLoaded(true);
                ((KFPerspective) p).setMainKFPerspective(m_mainKFPerspective);
                m_perspectiveCache.put(selectedClassName, (KFPerspective) p);
              }
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
          BeansProperties.VISIBLE_PERSPECTIVES.add(selectedClassName);
        }
        setupUserPerspectives();

        d.dispose();
      }
    });

    cancelBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        d.dispose();
      }
    });

    d.getContentPane().add(holder, BorderLayout.CENTER);
    /*
     * d.addWindowListener(new java.awt.event.WindowAdapter() { public void
     * windowClosing(java.awt.event.WindowEvent e) {
     *
     *
     * d.dispose(); } });
     */

    d.pack();
    d.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this));
    d.setVisible(true);
  }

  private void setupUserPerspectives() {
    // first clear the toolbar
    for (int i = m_perspectiveToolBar.getComponentCount() - 1; i > 0; i--) {
      m_perspectiveToolBar.remove(i);
      m_perspectives.remove(i);
    }

    int index = 1;
    for (String c : BeansProperties.VISIBLE_PERSPECTIVES) {
      KFPerspective toAdd = m_perspectiveCache.get(c);
      if (toAdd instanceof JComponent) {
        toAdd.setLoaded(true);
        m_perspectives.add(toAdd);
        String titleM = toAdd.getPerspectiveTitle();
        Icon icon = toAdd.getPerspectiveIcon();
        JToggleButton tBut = null;
        if (icon != null) {
          tBut = new JToggleButton(titleM, icon, false);
        } else {
          tBut = new JToggleButton(titleM, false);
        }
        tBut.setToolTipText(toAdd.getPerspectiveTipText());
        final int theIndex = index;
        tBut.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            setActivePerspective(theIndex);
          }
        });
        m_perspectiveToolBar.add(tBut);
        m_perspectiveGroup.add(tBut);

        index++;
      }
    }

    KFPerspective current = (KFPerspective) m_perspectiveHolder.getComponent(0);
    if (current != m_mainKFPerspective) {
      current.setActive(false);
      m_perspectiveHolder.remove(0);
      m_perspectiveHolder.add(m_mainKFPerspective);
      ((JToggleButton) m_perspectiveToolBar.getComponent(0)).setSelected(true);
    }

    revalidate();
    repaint();
    notifyIsDirty();
  }

  protected void setActivePerspective(int theIndex) {
    if (theIndex < 0 || theIndex > m_perspectives.size() - 1) {
      return;
    }

    KFPerspective current = (KFPerspective) m_perspectiveHolder.getComponent(0);
    current.setActive(false);
    m_perspectiveHolder.remove(0);
    m_perspectiveHolder.add((JComponent) m_perspectives.get(theIndex),
      BorderLayout.CENTER);
    m_perspectives.get(theIndex).setActive(true);
    ((JToggleButton) m_perspectiveToolBar.getComponent(theIndex))
      .setSelected(true);

    // KnowledgeFlowApp.this.invalidate();
    KnowledgeFlowApp.this.revalidate();
    KnowledgeFlowApp.this.repaint();
    notifyIsDirty();
  }

  private void snapSelectedToGrid() {
    Vector<Object> v = m_mainKFPerspective.getSelectedBeans();
    if (v.size() > 0) {
      for (int i = 0; i < v.size(); i++) {
        BeanInstance b = (BeanInstance) v.get(i);
        // if (!(b.getBean() instanceof Note)) {
        int x = b.getX();
        int y = b.getY();
        b.setXY(snapToGrid(x), snapToGrid(y));
        // }
      }
      revalidate();
      m_beanLayout.repaint();
      notifyIsDirty();
      m_mainKFPerspective.setEditedStatus(true);
    }
  }

  private int snapToGrid(int val) {
    int r = val % m_gridSpacing;
    val /= m_gridSpacing;
    if (r > (m_gridSpacing / 2)) {
      val++;
    }
    val *= m_gridSpacing;

    return val;
  }

  private void configureBeanLayout(final BeanLayout layout) {

    layout.setLayout(null);

    // handle mouse events
    layout.addMouseListener(new MouseAdapter() {

      @Override
      public void mousePressed(MouseEvent me) {
        layout.requestFocusInWindow();
        double z = m_layoutZoom / 100.0;
        double px = me.getX();
        double py = me.getY();
        py /= z;
        px /= z;
        if (m_toolBarBean == null) {
          if (((me.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
            && m_mode == NONE) {
            /*
             * BeanInstance bi = BeanInstance.findInstance(me.getPoint(),
             * m_mainKFPerspective.getCurrentTabIndex());
             */
            BeanInstance bi = BeanInstance.findInstance(new Point((int) px,
              (int) py), m_mainKFPerspective.getCurrentTabIndex());
<<<<<<< HEAD
=======
=======
    m_beanLayout.setLayout(null);

    // handle mouse events
    m_beanLayout.addMouseListener(new MouseAdapter() {

      @Override
      public void mousePressed(MouseEvent me) {
        if (m_toolBarBean == null) {
          if (((me.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK)
              && m_mode == NONE) {
            BeanInstance bi = BeanInstance.findInstance(me.getPoint());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            JComponent bc = null;
            if (bi != null) {
              bc = (JComponent) (bi.getBean());
            }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

            if (bc != null /* && (bc instanceof Visible) */) {
              m_editElement = bi;

              /*
               * m_oldX = me.getX(); m_oldY = me.getY();
               */

              m_oldX = (int) px;
              m_oldY = (int) py;

<<<<<<< HEAD
=======
=======
            if (bc != null && (bc instanceof Visible)) {
              m_editElement = bi;
              m_oldX = me.getX();
              m_oldY = me.getY();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              m_mode = MOVING;
            }
            if (m_mode != MOVING) {
              m_mode = SELECTING;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

              /*
               * m_oldX = me.getX(); m_oldY = me.getY();
               */

              m_oldX = (int) px;
              m_oldY = (int) py;

              m_startX = m_oldX;
              m_startY = m_oldY;
              Graphics2D gx = (Graphics2D) layout.getGraphics();
<<<<<<< HEAD
=======
=======
              m_oldX = me.getX();
              m_oldY = me.getY();
              m_startX = m_oldX;
              m_startY = m_oldY;
              Graphics2D gx = (Graphics2D) m_beanLayout.getGraphics();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              gx.setXORMode(java.awt.Color.white);
              // gx.drawRect(m_oldX, m_oldY, m_oldX, m_oldY);
              // gx.drawLine(m_startX, m_startY, m_startX, m_startY);
              gx.dispose();
              m_mode = SELECTING;
            }
          }
        }
      }

      @Override
      public void mouseReleased(MouseEvent me) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        layout.requestFocusInWindow();
        if (m_editElement != null && m_mode == MOVING) {
          if (m_snapToGridB.isSelected()) {
            int x = snapToGrid(m_editElement.getX());
            int y = snapToGrid(m_editElement.getY());
            m_editElement.setXY(x, y);
            snapSelectedToGrid();
          }

          m_editElement = null;
          revalidate();
          layout.repaint();
<<<<<<< HEAD
=======
=======
        if (m_editElement != null && m_mode == MOVING) {
          m_editElement = null;
          revalidate();
          m_beanLayout.repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_mode = NONE;
        }
        if (m_mode == SELECTING) {
          revalidate();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          layout.repaint();
          m_mode = NONE;

          double z = m_layoutZoom / 100.0;
          double px = me.getX();
          double py = me.getY();
          py /= z;
          px /= z;

          // highlightSubFlow(m_startX, m_startY, me.getX(), me.getY());
          highlightSubFlow(m_startX, m_startY, (int) px, (int) py);
<<<<<<< HEAD
=======
=======
          m_beanLayout.repaint();
          m_mode = NONE;

          checkSubFlow(m_startX, m_startY, me.getX(), me.getY());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }

      @Override
      public void mouseClicked(MouseEvent me) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        layout.requestFocusInWindow();
        Point p = me.getPoint();
        Point np = new Point();
        double z = m_layoutZoom / 100.0;
        np.setLocation(p.getX() / z, p.getY() / z);
        BeanInstance bi = BeanInstance.findInstance(np,
          m_mainKFPerspective.getCurrentTabIndex());
<<<<<<< HEAD
=======
=======
        BeanInstance bi = BeanInstance.findInstance(me.getPoint());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (m_mode == ADDING || m_mode == NONE) {
          // try and popup a context sensitive menu if we have
          // been clicked over a bean.
          if (bi != null) {
            JComponent bc = (JComponent) bi.getBean();
            // if we've been double clicked, then popup customizer
            // as long as we're not a meta bean
            if (me.getClickCount() == 2 && !(bc instanceof MetaBean)) {
              try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                Class<?> custClass = Introspector.getBeanInfo(bc.getClass())
                  .getBeanDescriptor().getCustomizerClass();
                if (custClass != null) {
                  if (bc instanceof BeanCommon) {
                    if (!((BeanCommon) bc).isBusy()
                      && !m_mainKFPerspective.getExecuting()) {
<<<<<<< HEAD
=======
=======
                Class custClass = Introspector.getBeanInfo(bc.getClass())
                    .getBeanDescriptor().getCustomizerClass();
                if (custClass != null) {
                  if (bc instanceof BeanCommon) {
                    if (!((BeanCommon) bc).isBusy()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                      popupCustomizer(custClass, bc);
                    }
                  } else {
                    popupCustomizer(custClass, bc);
                  }
                }
              } catch (IntrospectionException ex) {
                ex.printStackTrace();
              }
            } else if (((me.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              || me.isAltDown()) {
              // doPopup(me.getPoint(), bi, me.getX(), me.getY());
              doPopup(me.getPoint(), bi, (int) (p.getX() / z),
                (int) (p.getY() / z));
              return;
            } else {
              // just select this bean
              Vector<Object> v = m_mainKFPerspective.getSelectedBeans();
              if (me.isShiftDown()) {
              } else {
                v = new Vector<Object>();
              }
              v.add(bi);
              m_mainKFPerspective.setSelectedBeans(v);

              return;
            }
          } else {
            if (((me.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
              || me.isAltDown()) {

              double px = me.getX();
              double py = me.getY();
              py /= z;
              px /= z;

              // find connections if any close to this point
              if (!m_mainKFPerspective.getExecuting()) {
                // rightClickCanvasPopup(me.getX(), me.getY());
                rightClickCanvasPopup((int) px, (int) py);

                revalidate();
                repaint();
                notifyIsDirty();
              }
              return;
              /*
               * int delta = 10; deleteConnectionPopup(BeanConnection.
               * getClosestConnections(new Point(me.getX(), me.getY()), delta,
               * m_mainKFPerspective.getCurrentTabIndex()), me.getX(),
               * me.getY());
               */
            } else if (m_toolBarBean != null) {
              // otherwise, if a toolbar button is active then
              // add the component

              // snap to grid
              double x = me.getX();
              double y = me.getY();
              x /= z;
              y /= z;
              if (m_snapToGridB.isSelected()) {
                // x = snapToGrid(me.getX());
                x = snapToGrid((int) x);
                // y = snapToGrid(me.getY());
                y = snapToGrid((int) y);
              }

              addUndoPoint();
              if (m_toolBarBean instanceof StringBuffer) {
                // serialized user meta bean
                pasteFromClipboard((int) x, (int) y,
                  (StringBuffer) m_toolBarBean, false);
                m_mode = NONE;
                KnowledgeFlowApp.this.setCursor(Cursor
                  .getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                m_toolBarBean = null;
              } else {
                // saveLayout(m_mainKFPerspective.getCurrentTabIndex(), false);
                addComponent((int) x, (int) y);
              }
              m_componentTree.clearSelection();
              m_mainKFPerspective.setEditedStatus(true);
            }
          }
          revalidate();
          repaint();
          notifyIsDirty();
        }

        double px = me.getX();
        double py = me.getY();
        px /= z;
        py /= z;
        if (m_mode == PASTING && m_pasteBuffer.length() > 0) {
          // pasteFromClipboard(me.getX(), me.getY(), m_pasteBuffer, true);
          pasteFromClipboard((int) px, (int) py, m_pasteBuffer, true);
          m_mode = NONE;
          KnowledgeFlowApp.this.setCursor(Cursor
            .getPredefinedCursor(Cursor.DEFAULT_CURSOR));
          return;
<<<<<<< HEAD
=======
=======
                || me.isAltDown()) {
              doPopup(me.getPoint(), bi, me.getX(), me.getY());
            }
          } else {
            if (((me.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
                || me.isAltDown()) {
              // find connections if any close to this point
              int delta = 10;
              deleteConnectionPopup(
                  BeanConnection.getClosestConnections(
                      new Point(me.getX(), me.getY()), delta), me.getX(),
                  me.getY());
            } else if (m_toolBarBean != null) {
              // otherwise, if a toolbar button is active then
              // add the component
              addComponent(me.getX(), me.getY());
            }
          }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }

        if (m_mode == CONNECTING) {
          // turn off connecting points and remove connecting line
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          layout.repaint();
          Vector<Object> beanInstances = BeanInstance
            .getBeanInstances(m_mainKFPerspective.getCurrentTabIndex());
          for (int i = 0; i < beanInstances.size(); i++) {
            JComponent bean = (JComponent) ((BeanInstance) beanInstances
              .elementAt(i)).getBean();
<<<<<<< HEAD
=======
=======
          m_beanLayout.repaint();
          Vector beanInstances = BeanInstance.getBeanInstances();
          for (int i = 0; i < beanInstances.size(); i++) {
            JComponent bean = (JComponent) ((BeanInstance) beanInstances
                .elementAt(i)).getBean();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (bean instanceof Visible) {
              ((Visible) bean).getVisual().setDisplayConnectors(false);
            }
          }

          if (bi != null) {
            boolean doConnection = false;
            if (!(bi.getBean() instanceof BeanCommon)) {
              doConnection = true;
            } else {
              // Give the target bean a chance to veto the proposed
              // connection
              if (((BeanCommon) bi.getBean()).
<<<<<<< HEAD
                // connectionAllowed(m_sourceEventSetDescriptor.getName())) {
                connectionAllowed(m_sourceEventSetDescriptor)) {
=======
<<<<<<< HEAD
                // connectionAllowed(m_sourceEventSetDescriptor.getName())) {
                connectionAllowed(m_sourceEventSetDescriptor)) {
=======
              // connectionAllowed(m_sourceEventSetDescriptor.getName())) {
                  connectionAllowed(m_sourceEventSetDescriptor)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                doConnection = true;
              }
            }
            if (doConnection) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

              addUndoPoint();
              // attempt to connect source and target beans
              if (bi.getBean() instanceof MetaBean) {
                BeanConnection.doMetaConnection(m_editElement, bi,
                  m_sourceEventSetDescriptor, layout,
                  m_mainKFPerspective.getCurrentTabIndex());
              } else {
                new BeanConnection(m_editElement, bi,
                  m_sourceEventSetDescriptor, m_mainKFPerspective
                    .getCurrentTabIndex());
              }
              m_mainKFPerspective.setEditedStatus(true);
            }
            layout.repaint();
<<<<<<< HEAD
=======
=======
              // attempt to connect source and target beans

              if (bi.getBean() instanceof MetaBean) {
                BeanConnection.doMetaConnection(m_editElement, bi,
                    m_sourceEventSetDescriptor, m_beanLayout);
              } else {
                BeanConnection bc = new BeanConnection(m_editElement, bi,
                    m_sourceEventSetDescriptor);
              }
            }
            m_beanLayout.repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
          m_mode = NONE;
          m_editElement = null;
          m_sourceEventSetDescriptor = null;
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        if (m_mainKFPerspective.getSelectedBeans().size() > 0) {
          m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
        }
      }
    });

    layout.addMouseMotionListener(new MouseMotionAdapter() {

      @Override
      public void mouseDragged(MouseEvent me) {
        double z = m_layoutZoom / 100.0;
        double px = me.getX();
        double py = me.getY();
        px /= z;
        py /= z;
        if (m_editElement != null && m_mode == MOVING) {

          /*
           * int deltaX = me.getX() - m_oldX; int deltaY = me.getY() - m_oldY;
           */

          int deltaX = (int) px - m_oldX;
          int deltaY = (int) py - m_oldY;

          m_editElement.setXY(m_editElement.getX() + deltaX,
            m_editElement.getY() + deltaY);

          if (m_mainKFPerspective.getSelectedBeans().size() > 0) {
            Vector<Object> v = m_mainKFPerspective.getSelectedBeans();
            for (int i = 0; i < v.size(); i++) {
              BeanInstance b = (BeanInstance) v.get(i);
              if (b != m_editElement) {
                b.setXY(b.getX() + deltaX, b.getY() + deltaY);
              }
            }
          }
          layout.repaint();

          // note the new points
          /*
           * m_oldX = me.getX(); m_oldY = me.getY();
           */
          m_oldX = (int) px;
          m_oldY = (int) py;
          m_mainKFPerspective.setEditedStatus(true);
        }
        if (m_mode == SELECTING) {
          layout.repaint();
          /*
           * m_oldX = me.getX(); m_oldY = me.getY();
           */
          m_oldX = (int) px;
          m_oldY = (int) py;
<<<<<<< HEAD
=======
=======
      }
    });

    m_beanLayout.addMouseMotionListener(new MouseMotionAdapter() {

      @Override
      public void mouseDragged(MouseEvent me) {
        if (m_editElement != null && m_mode == MOVING) {
          ImageIcon ic = ((Visible) m_editElement.getBean()).getVisual()
              .getStaticIcon();
          int width = ic.getIconWidth() / 2;
          int height = ic.getIconHeight() / 2;

          /*
           * m_editElement.setX(m_oldX-width);
           * m_editElement.setY(m_oldY-height);
           */

          m_editElement.setXY(m_oldX - width, m_oldY - height);
          m_beanLayout.repaint();

          // note the new points
          m_oldX = me.getX();
          m_oldY = me.getY();
        }
        if (m_mode == SELECTING) {
          m_beanLayout.repaint();
          m_oldX = me.getX();
          m_oldY = me.getY();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }

      @Override
      public void mouseMoved(MouseEvent e) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        double z = m_layoutZoom / 100.0;
        double px = e.getX();
        double py = e.getY();
        px /= z;
        py /= z;

        if (m_mode == CONNECTING) {
          layout.repaint();
          // note the new coordinates
          /*
           * m_oldX = e.getX(); m_oldY = e.getY();
           */

          m_oldX = (int) px;
          m_oldY = (int) py;
        }
      }
    });
  }

  private void setUpLogPanel(final LogPanel logPanel) {
    String date = (new SimpleDateFormat("EEEE, d MMMM yyyy"))
      .format(new Date());
    logPanel.logMessage("Weka Knowledge Flow was written by Mark Hall");
    logPanel.logMessage("Weka Knowledge Flow");
    logPanel.logMessage("(c) 2002-" + Copyright.getToYear() + " "
      + Copyright.getOwner() + ", " + Copyright.getAddress());
    logPanel.logMessage("web: " + Copyright.getURL());
    logPanel.logMessage(date);
    logPanel
      .statusMessage("@!@[KnowledgeFlow]|Welcome to the Weka Knowledge Flow");
    logPanel.getStatusTable().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (logPanel.getStatusTable().rowAtPoint(e.getPoint()) == 0) {
          if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
            || e.isAltDown()) {
<<<<<<< HEAD
=======
=======
        if (m_mode == CONNECTING) {
          m_beanLayout.repaint();
          // note the new coordinates
          m_oldX = e.getX();
          m_oldY = e.getY();
        }
      }
    });

    String date = (new SimpleDateFormat("EEEE, d MMMM yyyy"))
        .format(new Date());
    m_logPanel.logMessage(Messages.getInstance().getString(
        "KnowledgeFlowApp_MouseClicked_LogPanel_LogMessage_Text_First"));
    m_logPanel.logMessage(Messages.getInstance().getString(
        "KnowledgeFlowApp_MouseClicked_LogPanel_LogMessage_Text_Second"));
    m_logPanel.logMessage(Messages.getInstance().getString(
        "KnowledgeFlowApp_MouseClicked_LogPanel_LogMessage_Text_Third")
        + Copyright.getToYear()
        + " "
        + Copyright.getOwner()
        + ", "
        + Copyright.getAddress());
    m_logPanel.logMessage(Messages.getInstance().getString(
        "KnowledgeFlowApp_MouseClicked_LogPanel_LogMessage_Text_Fourth")
        + Copyright.getURL());
    m_logPanel.logMessage(date);
    m_logPanel.statusMessage(Messages.getInstance().getString(
        "KnowledgeFlowApp_MouseClicked_LogPanel_StatusMessage_Text_First"));
    m_logPanel.getStatusTable().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (m_logPanel.getStatusTable().rowAtPoint(e.getPoint()) == 0) {
          if (((e.getModifiers() & InputEvent.BUTTON1_MASK) != InputEvent.BUTTON1_MASK)
              || e.isAltDown()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            System.gc();
            Runtime currR = Runtime.getRuntime();
            long freeM = currR.freeMemory();
            long totalM = currR.totalMemory();
            long maxM = currR.maxMemory();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            logPanel
              .logMessage("[KnowledgeFlow] Memory (free/total/max.) in bytes: "
                + String.format("%,d", freeM) + " / "
                + String.format("%,d", totalM) + " / "
                + String.format("%,d", maxM));
            logPanel
              .statusMessage("@!@[KnowledgeFlow]|Memory (free/total/max.) in bytes: "
<<<<<<< HEAD
=======
=======
            m_logPanel.logMessage(Messages.getInstance().getString(
                "KnowledgeFlowApp_MouseClicked_LogPanel_LogMessage_Text_Fifth")
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                + String.format("%,d", freeM)
                + " / "
                + String.format("%,d", totalM)
                + " / "
                + String.format("%,d", maxM));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      }
    });
  }

  private Image loadImage(String path) {
    Image pic = null;
    // Modified by Zerbetto
    // java.net.URL imageURL = ClassLoader.getSystemResource(path);
    java.net.URL imageURL = this.getClass().getClassLoader().getResource(path);

    // end modifications
    if (imageURL == null) {
      weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
        "Unable to load " + path);
    } else {
      pic = Toolkit.getDefaultToolkit().getImage(imageURL);
    }
    return pic;
  }

  protected class RunThread extends Thread {
    int m_flowIndex;
    boolean m_sequential;
    boolean m_wasUserStopped = false;

    public RunThread(boolean sequential) {
      m_sequential = sequential;
    }

    @Override
    public void run() {
      m_flowIndex = m_mainKFPerspective.getCurrentTabIndex();
      String flowName = m_mainKFPerspective.getTabTitle(m_flowIndex);
      m_mainKFPerspective.setExecuting(true);
      m_mainKFPerspective.getLogPanel(m_flowIndex).clearStatus();
      m_mainKFPerspective.getLogPanel(m_flowIndex).statusMessage(
        "@!@[KnowledgeFlow]|Executing...");

      FlowRunner runner = new FlowRunner(false, false);
      runner.setStartSequentially(m_sequential);
      runner.setEnvironment(m_flowEnvironment);
      runner.setLog(m_logPanel);
      Vector<Object> comps = BeanInstance.getBeanInstances(m_flowIndex);

      runner.setFlows(comps);
      try {
        runner.run();
        runner.waitUntilFinished();
      } catch (InterruptedException ie) {

      } catch (Exception ex) {
        m_logPanel.logMessage("An error occurred while running the flow: "
          + ex.getMessage());
      } finally {
        if (m_flowIndex >= m_mainKFPerspective.getNumTabs() - 1
          || !m_mainKFPerspective.getTabTitle(m_flowIndex).equals(flowName)) {
          // try and find which index our flow is at (user must have closed some
          // other tabs at lower indexes than us)!
          for (int i = 0; i < m_mainKFPerspective.getNumTabs(); i++) {
            String tabT = m_mainKFPerspective.getTabTitle(i);
            if (tabT != null && tabT.equals(flowName)) {
              m_flowIndex = i;
              break;
            }
          }
        }

        m_mainKFPerspective.setExecuting(m_flowIndex, false);
        m_mainKFPerspective.setExecutionThread(m_flowIndex, null);
        if (m_wasUserStopped) {
          // TODO global Stop message to the status area
          KFLogPanel lp = m_mainKFPerspective.getLogPanel(m_flowIndex);
          lp.setMessageOnAll(false, "Stopped.");
        } else {
          m_mainKFPerspective.getLogPanel(m_flowIndex).statusMessage(
            "@!@[KnowledgeFlow]|OK.");
        }
      }
    }

    public void stopAllFlows() {
      Vector<Object> components = BeanInstance.getBeanInstances(m_flowIndex);

      if (components != null) {
        for (int i = 0; i < components.size(); i++) {
          Object temp = ((BeanInstance) components.elementAt(i)).getBean();

          if (temp instanceof BeanCommon) {
            ((BeanCommon) temp).stop();
          }
        }
        m_wasUserStopped = true;

      }
    }
  }

  /**
   * Run all start-points in a layout in parallel or sequentially. Order of
   * execution is arbitrary if the user has not prefixed the names of the start
   * points with "<num> :" in order to specify the order. In both parallel and
   * sequential mode, a start point can be ommitted from exectution by prefixing
   * its name with "! :".
   *
   * @param sequential true if the flow layout is to have its start points run
   *          sequentially rather than in parallel
   *
   */
  private void runFlow(final boolean sequential) {
    if (m_mainKFPerspective.getNumTabs() > 0) {
      RunThread runThread = new RunThread(sequential);
      m_mainKFPerspective.setExecutionThread(runThread);

      runThread.start();
    }
  }

  private void stopFlow() {
    if (m_mainKFPerspective.getCurrentTabIndex() >= 0) {
      RunThread running = m_mainKFPerspective.getExecutionThread();

      if (running != null) {
        running.stopAllFlows();
      }

      /*
       * Vector components =
       * BeanInstance.getBeanInstances(m_mainKFPerspective.getCurrentTabIndex
       * ());
       *
       * if (components != null) { for (int i = 0; i < components.size(); i++) {
       * Object temp = ((BeanInstance) components.elementAt(i)).getBean();
       *
       * if (temp instanceof BeanCommon) { ((BeanCommon) temp).stop(); } } }
       */
    }
  }

  private void processPackage(String tempBeanCompName,
    weka.gui.HierarchyPropertyParser hpp, DefaultMutableTreeNode parentNode,
    Map<String, DefaultMutableTreeNode> nodeTextIndex) {
    if (hpp.isLeafReached()) {
      // instantiate a bean and add it to the holderPanel
      // System.err.println("Would add "+hpp.fullValue());
      /*
       * String algName = hpp.fullValue(); JPanel tempBean =
       * instantiateToolBarBean(true, tempBeanCompName, algName); if (tempBean
       * != null && holderPanel != null) { holderPanel.add(tempBean); }
       */

<<<<<<< HEAD
      hpp.goToParent();
      return;
    }
    String[] children = hpp.childrenValues();
    for (String element : children) {
      hpp.goToChild(element);
      DefaultMutableTreeNode child = null;

      if (hpp.isLeafReached()) {
        String algName = hpp.fullValue();

        Object visibleCheck = instantiateBean(true, tempBeanCompName, algName);
        if (visibleCheck != null) {
          if (visibleCheck instanceof BeanContextChild) {
            m_bcSupport.add(visibleCheck);
=======
=======
            m_logPanel
                .statusMessage(Messages
                    .getInstance()
                    .getString(
                        "KnowledgeFlowApp_MouseClicked_LogPanel_StatusMessage_Text_Second")
                    + String.format("%,d", freeM)
                    + " / "
                    + String.format("%,d", totalM)
                    + " / "
                    + String.format("%,d", maxM));
          }
        }
      }
    });

    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory
            .createTitledBorder(Messages
                .getInstance()
                .getString(
                    "KnowledgeFlowApp_P1_JPanel_BorderFactoryCreateTitledBorder_Text")),
        javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5)));
    final JScrollPane js = new JScrollPane(m_beanLayout);
    p1.add(js, BorderLayout.CENTER);
    js.getVerticalScrollBar().setUnitIncrement(m_ScrollBarIncrementLayout);
    js.getHorizontalScrollBar().setUnitIncrement(m_ScrollBarIncrementLayout);

    setLayout(new BorderLayout());

    add(p1, BorderLayout.CENTER);
    m_beanLayout.setSize(m_FlowWidth, m_FlowHeight);
    Dimension d = m_beanLayout.getPreferredSize();
    m_beanLayout.setMinimumSize(d);
    m_beanLayout.setMaximumSize(d);
    m_beanLayout.setPreferredSize(d);

    Dimension d2 = new Dimension(100, 170);
    m_logPanel.setPreferredSize(d2);
    m_logPanel.setMinimumSize(d2);
    add(m_logPanel, BorderLayout.SOUTH);

    setUpToolBars();
    loadUserComponents();
  }

  private Image loadImage(String path) {
    Image pic = null;
    // Modified by Zerbetto
    // java.net.URL imageURL = ClassLoader.getSystemResource(path);
    java.net.URL imageURL = this.getClass().getClassLoader().getResource(path);

    // end modifications
    if (imageURL == null) {
      // System.err.println("Warning: unable to load "+path);
    } else {
      pic = Toolkit.getDefaultToolkit().getImage(imageURL);
    }
    return pic;
  }

  /**
   * Describe <code>setUpToolBars</code> method here.
   */
  private void setUpToolBars() {
    JPanel toolBarPanel = new JPanel();
    toolBarPanel.setLayout(new BorderLayout());

    // modifications by Zerbetto
    // first construct the toolbar for saving, loading etc
    if (m_showFileMenu) {
      JToolBar fixedTools = new JToolBar();
      fixedTools.setOrientation(JToolBar.VERTICAL);
      m_saveB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "Save24.gif")));
      m_saveB.setToolTipText(Messages.getInstance().getString(
          "KnowledgeFlowApp_SaveB_SetToolTipText_Text"));
      m_loadB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "Open24.gif")));
      m_loadB.setToolTipText(Messages.getInstance().getString(
          "KnowledgeFlowApp_LoadB_SetToolTipText_Text"));
      m_newB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
          + "New24.gif")));
      m_newB.setToolTipText(Messages.getInstance().getString(
          "KnowledgeFlowApp_NewB_SetToolTipText_Text"));
      fixedTools.add(m_newB);
      fixedTools.add(m_saveB);
      fixedTools.add(m_loadB);

      m_saveB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          saveLayout();
        }
      });

      m_loadB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          m_flowEnvironment = new Environment();
          loadLayout();
        }
      });

      m_newB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          clearLayout();
        }
      });

      fixedTools.setFloatable(false);
      toolBarPanel.add(fixedTools, BorderLayout.WEST);
    }

    m_stopB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
        + "Stop24.gif")));
    m_helpB = new JButton(new ImageIcon(loadImage(BeanVisual.ICON_PATH
        + "Help24.gif")));
    m_stopB.setToolTipText(Messages.getInstance().getString(
        "KnowledgeFlowApp_StopB_SetToolTipText_Text"));
    m_helpB.setToolTipText(Messages.getInstance().getString(
        "KnowledgeFlowApp_HelpB_SetToolTipText_Text"));

    Image tempI = loadImage(BeanVisual.ICON_PATH + "Pointer.gif");
    m_pointerB = new JToggleButton(new ImageIcon(tempI));
    m_pointerB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_toolBarBean = null;
        m_mode = NONE;
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
      }
    });

    // Dimension dP = m_saveB.getPreferredSize();
    // Dimension dM = m_saveB.getMaximumSize();
    // Dimension dP = m_stopB.getPreferredSize();
    // Dimension dM = m_stopB.getMaximumSize();
    // m_pointerB.setPreferredSize(dP);
    // m_pointerB.setMaximumSize(dM);
    m_toolBarGroup.add(m_pointerB);

    JToolBar fixedTools2 = new JToolBar();
    fixedTools2.setOrientation(JToolBar.VERTICAL);
    fixedTools2.setFloatable(false);
    fixedTools2.add(m_pointerB);
    fixedTools2.add(m_helpB);
    fixedTools2.add(m_stopB);
    // m_helpB.setPreferredSize(dP);
    // m_helpB.setMaximumSize(dP);
    m_helpB.setSize(m_pointerB.getSize().width, m_pointerB.getSize().height);
    toolBarPanel.add(fixedTools2, BorderLayout.EAST);
    // end modifications by Zerbetto
    m_stopB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        m_logPanel.statusMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_StopB_LogPanel_StatusMessage_Text_First"));
        stopFlow();
        m_logPanel.statusMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_StopB_LogPanel_StatusMessage_Text_Second"));
      }
    });

    m_helpB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        popupHelp();
      }
    });

    final int STANDARD_TOOLBAR = 0;
    final int WEKAWRAPPER_TOOLBAR = 1;

    int toolBarType = STANDARD_TOOLBAR;

    // set up wrapper toolbars
    for (int i = 0; i < TOOLBARS.size(); i++) {
      Vector tempBarSpecs = (Vector) TOOLBARS.elementAt(i);

      // name for the tool bar
      String tempBarName = (String) tempBarSpecs.elementAt(0);

      // Used for weka leaf packages
      Box singletonHolderPanel = null;

      // name of the bean component to handle this class of weka algorithms
      String tempBeanCompName = (String) tempBarSpecs.elementAt(1);

      // a JPanel holding an instantiated bean + label ready to be added
      // to the current toolbar
      JPanel tempBean;

      // the root package for weka algorithms
      String rootPackage = "";
      weka.gui.HierarchyPropertyParser hpp = null;
      Hashtable hpps = null;

      // Is this a wrapper toolbar?
      if (tempBeanCompName.compareTo("null") != 0) {
        tempBean = null;
        toolBarType = WEKAWRAPPER_TOOLBAR;
        rootPackage = (String) tempBarSpecs.elementAt(2);
        // hpp = (weka.gui.HierarchyPropertyParser)tempBarSpecs.elementAt(3);
        hpps = (Hashtable) tempBarSpecs.elementAt(3);

        try {
          // modifications by Zerbetto
          // Beans.instantiate(null, tempBeanCompName);
          Beans.instantiate(this.getClass().getClassLoader(), tempBeanCompName);

          // end modifications by Zerbetto
        } catch (Exception ex) {
          // ignore
          System.err.println(Messages.getInstance().getString(
              "KnowledgeFlowApp_Error_Text")
              + tempBeanCompName);

          break;
        }
      } else {
        toolBarType = STANDARD_TOOLBAR;
      }

      // a toolbar to hold buttons---one for each algorithm
      JToolBar tempToolBar = new JToolBar();

      // System.err.println(tempToolBar.getLayout());
      // tempToolBar.setLayout(new FlowLayout());
      int z = 2;

      if (toolBarType == WEKAWRAPPER_TOOLBAR) {
        Enumeration enm = hpps.keys();

        while (enm.hasMoreElements()) {
          String root = (String) enm.nextElement();
          String userPrefix = "";
          hpp = (HierarchyPropertyParser) hpps.get(root);

          if (!hpp.goTo(rootPackage)) {
            System.out.println(Messages.getInstance().getString(
                "KnowledgeFlowApp_Text_First"));
            // System.exit(1);
            userPrefix = root + ".";
          }

          String[] primaryPackages = hpp.childrenValues();

          for (int kk = 0; kk < primaryPackages.length; kk++) {
            hpp.goToChild(primaryPackages[kk]);

            // check to see if this is a leaf - if so then there are no
            // sub packages
            if (hpp.isLeafReached()) {
              if (singletonHolderPanel == null) {
                singletonHolderPanel = Box.createHorizontalBox();
                singletonHolderPanel.setBorder(javax.swing.BorderFactory
                    .createTitledBorder(tempBarName));
              }

              String algName = hpp.fullValue();
              tempBean = instantiateToolBarBean(true, tempBeanCompName, algName);

              if (tempBean != null) {
                // tempToolBar.add(tempBean);
                singletonHolderPanel.add(tempBean);
              }

              hpp.goToParent();
            } else {
              // make a titledborder JPanel to hold all the schemes in this
              // package
              // JPanel holderPanel = new JPanel();
              Box holderPanel = Box.createHorizontalBox();
              holderPanel.setBorder(javax.swing.BorderFactory
                  .createTitledBorder(userPrefix + primaryPackages[kk]));
              processPackage(holderPanel, tempBeanCompName, hpp);
              tempToolBar.add(holderPanel);
            }
          }

          if (singletonHolderPanel != null) {
            tempToolBar.add(singletonHolderPanel);
            singletonHolderPanel = null;
          }
        }
      } else {
        Box holderPanel = Box.createHorizontalBox();
        holderPanel.setBorder(javax.swing.BorderFactory
            .createTitledBorder(tempBarName));

        for (int j = z; j < tempBarSpecs.size(); j++) {
          tempBean = null;
          tempBeanCompName = (String) tempBarSpecs.elementAt(j);
          tempBean = instantiateToolBarBean(
              (toolBarType == WEKAWRAPPER_TOOLBAR), tempBeanCompName, "");

          if (tempBean != null) {
            // set tool tip text (if any)
            // setToolTipText(tempBean)
            holderPanel.add(tempBean);
          }
        }

        tempToolBar.add(holderPanel);
      }

      JScrollPane tempJScrollPane = createScrollPaneForToolBar(tempToolBar);
      // ok, now create tabbed pane to hold this toolbar
      m_toolBars.addTab(tempBarName, null, tempJScrollPane, tempBarName);
    }

    // Any plugin components to process?
    if (BEAN_PLUGINS_PROPERTIES != null && BEAN_PLUGINS_PROPERTIES.size() > 0) {
      for (int i = 0; i < BEAN_PLUGINS_PROPERTIES.size(); i++) {
        Properties tempP = BEAN_PLUGINS_PROPERTIES.get(i);
        JPanel tempBean = null;
        String components = tempP
            .getProperty("weka.gui.beans.KnowledgeFlow.Plugins");
        StringTokenizer st2 = new StringTokenizer(components, ", ");

        while (st2.hasMoreTokens()) {
          String tempBeanCompName = st2.nextToken().trim();
          tempBean = instantiateToolBarBean(false, tempBeanCompName, "");
          if (m_pluginsToolBar == null) {
            // need to create the plugins tab and toolbar
            setUpPluginsToolBar();
          }
          m_pluginsBoxPanel.add(tempBean);
        }
      }
    }

    toolBarPanel.add(m_toolBars, BorderLayout.CENTER);

    // add(m_toolBars, BorderLayout.NORTH);
    add(toolBarPanel, BorderLayout.NORTH);
  }

  private void stopFlow() {
    Vector components = BeanInstance.getBeanInstances();

    for (int i = 0; i < components.size(); i++) {
      Object temp = ((BeanInstance) components.elementAt(i)).getBean();

      if (temp instanceof BeanCommon) {
        ((BeanCommon) temp).stop();
      }
    }
  }

  private JScrollPane createScrollPaneForToolBar(JToolBar tb) {
    JScrollPane tempJScrollPane = new JScrollPane(tb,
        JScrollPane.VERTICAL_SCROLLBAR_NEVER,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    Dimension d = tb.getPreferredSize();
    tempJScrollPane.setMinimumSize(new Dimension((int) d.getWidth(), (int) (d
        .getHeight() + 15)));
    tempJScrollPane.setPreferredSize(new Dimension((int) d.getWidth(), (int) (d
        .getHeight() + 15)));
    tempJScrollPane.getHorizontalScrollBar().setUnitIncrement(
        m_ScrollBarIncrementComponents);

    return tempJScrollPane;
  }

  private void processPackage(JComponent holderPanel, String tempBeanCompName,
      weka.gui.HierarchyPropertyParser hpp) {
    if (hpp.isLeafReached()) {
      // instantiate a bean and add it to the holderPanel
      // System.err.println("Would add "+hpp.fullValue());
      String algName = hpp.fullValue();
      JPanel tempBean = instantiateToolBarBean(true, tempBeanCompName, algName);
      if (tempBean != null) {
        holderPanel.add(tempBean);
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      hpp.goToParent();
      return;
    }
    String[] children = hpp.childrenValues();
<<<<<<< HEAD
    for (String element : children) {
      hpp.goToChild(element);
      DefaultMutableTreeNode child = null;

      if (hpp.isLeafReached()) {
        String algName = hpp.fullValue();

        Object visibleCheck = instantiateBean(true, tempBeanCompName, algName);
        if (visibleCheck != null) {
          if (visibleCheck instanceof BeanContextChild) {
            m_bcSupport.add(visibleCheck);
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
          ImageIcon scaledForTree = null;
          if (visibleCheck instanceof Visible) {
            BeanVisual bv = ((Visible) visibleCheck).getVisual();
            if (bv != null) {
              scaledForTree = new ImageIcon(bv.scale(0.33));
              // m_iconLookup.put(algName, scaledForTree);
            }
          }

          // try and get a tool tip
          String toolTip = "";
          try {
            Object wrappedA = WekaPackageClassLoaderManager.objectForName(algName);
            // Object wrappedA = Class.forName(algName).newInstance();
            toolTip = getGlobalInfo(wrappedA);
          } catch (Exception ex) {
          }

          JTreeLeafDetails leafData = new JTreeLeafDetails(tempBeanCompName,
            algName, scaledForTree);
          if (toolTip != null && toolTip.length() > 0) {
            leafData.setToolTipText(toolTip);
          }
          child = new InvisibleNode(leafData);
          nodeTextIndex.put(algName.toLowerCase() + " "
            + (toolTip != null ? toolTip.toLowerCase() : ""), child);
        }
      } else {
        child = new InvisibleNode(element);
      }

      if (child != null) {
        parentNode.add(child);
      }

      processPackage(tempBeanCompName, hpp, child, nodeTextIndex);
<<<<<<< HEAD
=======
=======
    for (int i = 0; i < children.length; i++) {
      hpp.goToChild(children[i]);
      processPackage(holderPanel, tempBeanCompName, hpp);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    hpp.goToParent();
  }

<<<<<<< HEAD
  private Object instantiateBean(boolean wekawrapper, String tempBeanCompName,
    String algName) {
=======
<<<<<<< HEAD
  private Object instantiateBean(boolean wekawrapper, String tempBeanCompName,
    String algName) {
=======
  /**
   * Instantiates a bean for display in the toolbars
   * 
   * @param wekawrapper true if the bean to be instantiated is a wekawrapper
   * @param tempBeanCompName the name of the bean to instantiate
   * @param algName holds the name of a weka algorithm to configure the bean
   *          with if it is a wekawrapper bean
   * @return a JPanel holding the instantiated (and configured bean)
   */
  private JPanel instantiateToolBarBean(boolean wekawrapper,
      String tempBeanCompName, String algName) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Object tempBean;
    if (wekawrapper) {
      try {
        // modifications by Zerbetto
        // tempBean = Beans.instantiate(null, tempBeanCompName);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        tempBean = WekaPackageClassLoaderManager.objectForName(tempBeanCompName);
        //tempBean = Beans.instantiate(this.getClass().getClassLoader(),
        //  tempBeanCompName);

        // end modifications by Zerbetto
      } catch (Exception ex) {
        weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
          "[KnowledgeFlow] Failed to instantiate :"
            + tempBeanCompName + "KnowledgeFlowApp.instantiateBean()");
<<<<<<< HEAD
=======
=======
        tempBean = Beans.instantiate(this.getClass().getClassLoader(),
            tempBeanCompName);

        // end modifications by Zerbetto
      } catch (Exception ex) {
        System.err.println(Messages.getInstance().getString(
            "KnowledgeFlowApp_InstantiateToolBarBean_Error_Text_First")
            + tempBeanCompName + "KnowledgeFlowApp.instantiateToolBarBean()");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        return null;
      }
      if (tempBean instanceof WekaWrapper) {
        // algName = (String)tempBarSpecs.elementAt(j);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        Class<?> c = null;
        try {
          c = WekaPackageClassLoaderManager.forName(algName);
          // c = Class.forName(algName);

          // check for ignore
          for (Annotation a : c.getAnnotations()) {
            if (a instanceof KFIgnore) {
              return null;
            }
          }
        } catch (Exception ex) {
          weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
            "[KnowledgeFlow] Can't find class called: "
<<<<<<< HEAD
=======
=======
        Class c = null;
        try {
          c = Class.forName(algName);
        } catch (Exception ex) {
          System.err.println(Messages.getInstance().getString(
              "KnowledgeFlowApp_InstantiateToolBarBean_Error_Text_Third")
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              + algName);
          return null;
        }
        try {
          Object o = c.newInstance();
          ((WekaWrapper) tempBean).setWrappedAlgorithm(o);
        } catch (Exception ex) {
<<<<<<< HEAD
          weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
            "[KnowledgeFlow] Failed to configure "
              + tempBeanCompName + " with " + algName);
=======
<<<<<<< HEAD
          weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
            "[KnowledgeFlow] Failed to configure "
              + tempBeanCompName + " with " + algName);
=======
          System.err.println(Messages.getInstance().getString(
              "KnowledgeFlowApp_InstantiateToolBarBean_Error_Text_Fourth")
              + tempBeanCompName
              + Messages.getInstance().getString(
                  "KnowledgeFlowApp_InstantiateToolBarBean_Error_Text_Fifth")
              + algName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          return null;
        }
      }
    } else {
      try {
        // modifications by Zerbetto
        // tempBean = Beans.instantiate(null, tempBeanCompName);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        tempBean = WekaPackageClassLoaderManager.objectForName(tempBeanCompName);
        //tempBean = Beans.instantiate(this.getClass().getClassLoader(),
        //  tempBeanCompName);
<<<<<<< HEAD
=======
=======
        tempBean = Beans.instantiate(this.getClass().getClassLoader(),
            tempBeanCompName);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        // end modifications
      } catch (Exception ex) {
        ex.printStackTrace();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
          "[KnowledgeFlow] Failed to instantiate :"
            + tempBeanCompName + "KnowledgeFlowApp.instantiateBean()");
        return null;
      }
    }
    return tempBean;
<<<<<<< HEAD
=======
=======
        System.err.println(Messages.getInstance().getString(
            "KnowledgeFlowApp_InstantiateToolBarBean_Error_Text_Sixth")
            + tempBeanCompName + "KnowledgeFlowApp.setUpToolBars()");
        return null;
      }
    }

    if (tempBean instanceof BeanContextChild) {
      m_bcSupport.add(tempBean);
    }
    if (tempBean instanceof Visible) {
      ((Visible) tempBean).getVisual().scale(3);
    }

    return makeHolderPanelForToolBarBean(tempBeanCompName, tempBean,
        wekawrapper, algName, false);
  }

  /**
   * Instantiates (by making a serialized copy) the supplied template meta bean
   * for display in the user tool bar
   * 
   * @param bean the prototype MetaBean to display in the toolbar
   */
  private JPanel instantiateToolBarMetaBean(MetaBean bean) {
    // copy the bean via serialization
    ((Visible) bean).getVisual().removePropertyChangeListener(this);
    bean.removePropertyChangeListenersSubFlow(this);
    Object copy = null;
    try {
      SerializedObject so = new SerializedObject(bean);
      copy = so.getObject();
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
    ((Visible) bean).getVisual().addPropertyChangeListener(this);
    bean.addPropertyChangeListenersSubFlow(this);

    String displayName = "";
    //
    if (copy instanceof Visible) {
      ((Visible) copy).getVisual().scale(3);
      displayName = ((Visible) copy).getVisual().getText();
    }
    return makeHolderPanelForToolBarBean(displayName, copy, false, null, true);
  }

  private JPanel makeHolderPanelForToolBarBean(final String tempName,
      Object tempBean, boolean wekawrapper, String algName,
      final boolean metabean) {
    // ---------------------------------------
    JToggleButton tempButton;
    final JPanel tempP = new JPanel();
    JLabel tempL = new JLabel();
    tempL.setFont(new Font(null, Font.PLAIN, 9));

    String labelName = (wekawrapper == true) ? algName : tempName;
    labelName = labelName.substring(labelName.lastIndexOf('.') + 1,
        labelName.length());
    tempL.setText(" " + labelName + " ");
    tempL.setHorizontalAlignment(JLabel.CENTER);
    tempP.setLayout(new BorderLayout());

    if (tempBean instanceof Visible) {
      BeanVisual bv = ((Visible) tempBean).getVisual();

      tempButton = new JToggleButton(bv.getStaticIcon());
      int width = bv.getStaticIcon().getIconWidth();
      int height = bv.getStaticIcon().getIconHeight();

      JPanel labelPanel = multiLineLabelPanel(labelName, width);
      tempP.add(labelPanel, BorderLayout.SOUTH);
    } else {
      tempButton = new JToggleButton();
      tempP.add(tempL, BorderLayout.SOUTH);
    }
    tempP.add(tempButton, BorderLayout.NORTH);
    // tempP.add(tempL, BorderLayout.SOUTH);

    // holderPanel.add(tempP);
    // tempToolBar.add(tempP);
    m_toolBarGroup.add(tempButton);

    // add an action listener for the button here
    final Object tempBN = tempBean;
    final JToggleButton fButton = tempButton;
    // final JToggleButton tempButton2 = tempButton;
    tempButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        boolean changeCursor = true;
        try {
          m_toolBarBean = null;
          if (metabean) {
            if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
              changeCursor = false;
              m_toolBarGroup.remove(fButton);
              m_userBoxPanel.remove(tempP);
              m_userBoxPanel.revalidate();
              m_userComponents.remove(tempBN);
              if (m_firstUserComponentOpp) {
                installWindowListenerForSavingUserBeans();
                m_firstUserComponentOpp = false;
              }
              if (m_userComponents.size() == 0) {
                m_toolBars.removeTabAt(m_toolBars.getTabCount() - 1);
                m_userToolBar = null;
                notifyIsDirty();
              }
            } else {
              SerializedObject so = new SerializedObject(tempBN);
              MetaBean copy = (MetaBean) so.getObject();
              /*
               * ((Visible)copy).getVisual().
               * addPropertyChangeListener(KnowledgeFlowApp.this);
               */
              copy.addPropertyChangeListenersSubFlow(KnowledgeFlowApp.this);
              m_toolBarBean = copy;
            }
          } else {
            // modifications by Zerbetto
            // m_toolBarBean = Beans.instantiate(null, tempName);
            m_toolBarBean = Beans.instantiate(this.getClass().getClassLoader(),
                tempName);

            // end modifications
          }
          if (m_toolBarBean instanceof WekaWrapper) {
            Object wrappedAlg = ((WekaWrapper) tempBN).getWrappedAlgorithm();

            ((WekaWrapper) m_toolBarBean).setWrappedAlgorithm(wrappedAlg
                .getClass().newInstance());
            // tempButton2.setSelected(false);
          }
          if (changeCursor) {
            setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            m_mode = ADDING;
          }
        } catch (Exception ex) {
          System.err.println(Messages.getInstance().getString(
              "KnowledgeFlowApp_MakeHolderPanelForToolBarBean_Error_Text"));
          ex.printStackTrace();
        }
        notifyIsDirty();
      }
    });

    if (tempBean instanceof MetaBean) {
      tempButton
          .setToolTipText(Messages
              .getInstance()
              .getString(
                  "KnowledgeFlowApp_MakeHolderPanelForToolBarBean_TempButton_SetToolTipText_Text"));
      m_userComponents.add(tempBean);
    } else {
      // set tool tip text from global info if supplied
      String summary = getGlobalInfo(tempBean);
      if (summary != null) {
        int ci = summary.indexOf('.');
        if (ci != -1) {
          summary = summary.substring(0, ci + 1);
        }
        tempButton.setToolTipText(summary);
      }
    }

    // return tempBean;
    return tempP;
  }

  private JPanel multiLineLabelPanel(String sourceL, int splitWidth) {
    JPanel jp = new JPanel();
    Vector v = new Vector();

    int labelWidth = m_fontM.stringWidth(sourceL);

    if (labelWidth < splitWidth) {
      v.addElement(sourceL);
    } else {
      // find mid point
      int mid = sourceL.length() / 2;

      // look for split point closest to the mid
      int closest = sourceL.length();
      int closestI = -1;
      for (int i = 0; i < sourceL.length(); i++) {
        if (sourceL.charAt(i) < 'a') {
          if (Math.abs(mid - i) < closest) {
            closest = Math.abs(mid - i);
            closestI = i;
          }
        }
      }
      if (closestI != -1) {
        String left = sourceL.substring(0, closestI);
        String right = sourceL.substring(closestI, sourceL.length());
        if (left.length() > 1 && right.length() > 1) {
          v.addElement(left);
          v.addElement(right);
        } else {
          v.addElement(sourceL);
        }
      } else {
        v.addElement(sourceL);
      }
    }

    jp.setLayout(new GridLayout(v.size(), 1));
    for (int i = 0; i < v.size(); i++) {
      JLabel temp = new JLabel();
      temp.setFont(new Font(null, Font.PLAIN, 9));
      temp.setText(" " + ((String) v.elementAt(i)) + " ");
      temp.setHorizontalAlignment(JLabel.CENTER);
      jp.add(temp);
    }
    return jp;
  }

  private void setUpUserToolBar() {
    m_userBoxPanel = Box.createHorizontalBox();
    m_userBoxPanel
        .setBorder(javax.swing.BorderFactory
            .createTitledBorder(Messages
                .getInstance()
                .getString(
                    "KnowledgeFlowApp_SetUpUserToolBar_SetBorder_BorderFactory_CreateTitledBorder_Text")));
    m_userToolBar = new JToolBar();
    m_userToolBar.add(m_userBoxPanel);
    JScrollPane tempJScrollPane = createScrollPaneForToolBar(m_userToolBar);
    // ok, now create tabbed pane to hold this toolbar

    m_toolBars.addTab(
        Messages.getInstance().getString(
            "KnowledgeFlowApp_SetUpUserToolBar_AddTab_Text_First"),
        null,
        tempJScrollPane,
        Messages.getInstance().getString(
            "KnowledgeFlowApp_SetUpUserToolBar_AddTab_Text_Second"));
  }

  private void setUpPluginsToolBar() {
    m_pluginsBoxPanel = Box.createHorizontalBox();
    m_pluginsBoxPanel
        .setBorder(javax.swing.BorderFactory
            .createTitledBorder(Messages
                .getInstance()
                .getString(
                    "KnowledgeFlowApp_SetUpPluginsToolBar_PluginsBoxPanel_SetBorder_BorderFactory_CreateTitledBorder_Text")));
    m_pluginsToolBar = new JToolBar();
    m_pluginsToolBar.add(m_pluginsBoxPanel);
    JScrollPane tempJScrollPane = createScrollPaneForToolBar(m_pluginsToolBar);
    // ok, now create tabbed pane to hold this toolbar

    m_toolBars.addTab(
        Messages.getInstance().getString(
            "KnowledgeFlowApp_SetUpUserToolBar_AddTab_Text_Third"),
        null,
        tempJScrollPane,
        Messages.getInstance().getString(
            "KnowledgeFlowApp_SetUpUserToolBar_AddTab_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Pop up a help window
   */
  private void popupHelp() {
    final JButton tempB = m_helpB;
    try {
      tempB.setEnabled(false);
      // Modified by Zerbetto
      // InputStream inR =
      // ClassLoader.
      // getSystemResourceAsStream("weka/gui/beans/README_KnowledgeFlow");
      InputStream inR = this.getClass().getClassLoader()
<<<<<<< HEAD
        .getResourceAsStream("weka/gui/beans/README_KnowledgeFlow");
=======
<<<<<<< HEAD
        .getResourceAsStream("weka/gui/beans/README_KnowledgeFlow");
=======
          .getResourceAsStream("weka/gui/beans/README_KnowledgeFlow");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // end modifications
      StringBuffer helpHolder = new StringBuffer();
      LineNumberReader lnr = new LineNumberReader(new InputStreamReader(inR));

      String line;

      while ((line = lnr.readLine()) != null) {
        helpHolder.append(line + "\n");
      }

      lnr.close();
      final javax.swing.JFrame jf = new javax.swing.JFrame();
      jf.getContentPane().setLayout(new java.awt.BorderLayout());
      final JTextArea ta = new JTextArea(helpHolder.toString());
      ta.setFont(new Font("Monospaced", Font.PLAIN, 12));
      ta.setEditable(false);
      final JScrollPane sp = new JScrollPane(ta);
      jf.getContentPane().add(sp, java.awt.BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          tempB.setEnabled(true);
          jf.dispose();
        }
      });
      jf.setSize(600, 600);
      jf.setVisible(true);

    } catch (Exception ex) {
      tempB.setEnabled(true);
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void closeAllTabs() {
    for (int i = m_mainKFPerspective.getNumTabs() - 1; i >= 0; i--) {
      m_mainKFPerspective.removeTab(i);
    }
  }

  public void clearLayout() {
    stopFlow(); // try and stop any running components

    if (m_mainKFPerspective.getNumTabs() == 0 || getAllowMultipleTabs()) {
      m_mainKFPerspective.addTab("Untitled" + m_untitledCount++);
    }

    if (!getAllowMultipleTabs()) {
      BeanConnection.setConnections(new Vector<BeanConnection>(),
        m_mainKFPerspective.getCurrentTabIndex());
      BeanInstance.setBeanInstances(new Vector<Object>(), m_mainKFPerspective
        .getBeanLayout(m_mainKFPerspective.getCurrentTabIndex()),
        m_mainKFPerspective.getCurrentTabIndex());
    }

    /*
     * BeanInstance.reset(m_beanLayout); BeanConnection.reset();
     * m_beanLayout.revalidate(); m_beanLayout.repaint();
     * m_logPanel.clearStatus();
     * m_logPanel.statusMessage("[KnowledgeFlow]|Welcome to the Weka Knowledge Flow"
     * );
     */
  }

  /**
   * Pops up the menu for selecting template layouts
   */
  private void createTemplateMenuPopup() {
    PopupMenu templatesMenu = new PopupMenu();
    // MenuItem addToUserTabItem = new MenuItem("Add to user tab");
    for (int i = 0; i < BeansProperties.TEMPLATE_PATHS.size(); i++) {
      String mE = BeansProperties.TEMPLATE_DESCRIPTIONS.get(i);
      final String path = BeansProperties.TEMPLATE_PATHS.get(i);

      MenuItem m = new MenuItem(mE);
      m.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ee) {
          try {
            ClassLoader resourceClassLoader = WekaPackageClassLoaderManager.getWekaPackageClassLoaderManager().findClassloaderForResource(path);
            InputStream inR = resourceClassLoader.getResourceAsStream(path);
            //InputStream inR = this.getClass().getClassLoader()
            //  .getResourceAsStream(path);
            m_mainKFPerspective.addTab("Untitled" + m_untitledCount++);
            XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
              m_mainKFPerspective.getCurrentTabIndex());
            InputStreamReader isr = new InputStreamReader(inR);

            @SuppressWarnings("unchecked")
            Vector<Vector<?>> v = (Vector<Vector<?>>) xml.read(isr);
            @SuppressWarnings("unchecked")
            Vector<Object> beans = (Vector<Object>) v
              .get(XMLBeans.INDEX_BEANINSTANCES);
            @SuppressWarnings("unchecked")
            Vector<BeanConnection> connections = (Vector<BeanConnection>) v
              .get(XMLBeans.INDEX_BEANCONNECTIONS);
            isr.close();

            integrateFlow(beans, connections, false, false);
            notifyIsDirty();
            revalidate();
          } catch (Exception ex) {
            m_mainKFPerspective.getCurrentLogPanel().logMessage(
              "Problem loading template: " + ex.getMessage());
          }
        }
      });
      templatesMenu.add(m);
    }

    m_templatesB.add(templatesMenu);
    templatesMenu.show(m_templatesB, 0, 0);
<<<<<<< HEAD
=======
=======
  public void clearLayout() {
    stopFlow(); // try and stop any running components
    BeanInstance.reset(m_beanLayout);
    BeanConnection.reset();
    m_beanLayout.revalidate();
    m_beanLayout.repaint();
    m_logPanel.clearStatus();
    m_logPanel.statusMessage(Messages.getInstance().getString(
        "KnowledgeFlowApp_ClearLayout_StatusMessage_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Popup a context sensitive menu for the bean component
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pt holds the panel coordinates for the component
   * @param bi the bean component over which the user right clicked the mouse
   * @param x the x coordinate at which to popup the menu
   * @param y the y coordinate at which to popup the menu
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   *          Modified by Zerbetto: javax.swing.JPopupMenu transformed into
   *          java.awt.PopupMenu
   *
<<<<<<< HEAD
=======
=======
   * 
   *          Modified by Zerbetto: javax.swing.JPopupMenu transformed into
   *          java.awt.PopupMenu
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private void doPopup(Point pt, final BeanInstance bi, int x, int y) {
    final JComponent bc = (JComponent) bi.getBean();
    final int xx = x;
    final int yy = y;
    int menuItemCount = 0;

    // modifications by Zerbetto
    PopupMenu beanContextMenu = new PopupMenu();

    // JPopupMenu beanContextMenu = new JPopupMenu();

    // beanContextMenu.insert(new JLabel("Edit",
    // SwingConstants.CENTER),
    // menuItemCount);
<<<<<<< HEAD
    boolean executing = m_mainKFPerspective.getExecuting();

    MenuItem edit = new MenuItem("Edit:");
=======
<<<<<<< HEAD
    boolean executing = m_mainKFPerspective.getExecuting();

    MenuItem edit = new MenuItem("Edit:");
=======
    MenuItem edit = new MenuItem(Messages.getInstance().getString(
        "KnowledgeFlowApp_DoPopup_Edit_MenuItem_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    edit.setEnabled(false);
    beanContextMenu.insert(edit, menuItemCount);
    menuItemCount++;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_mainKFPerspective.getSelectedBeans().size() > 0) {
      MenuItem copyItem = new MenuItem("Copy");
      copyItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          copyToClipboard();
          m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
        }
      });
      beanContextMenu.add(copyItem);
      copyItem.setEnabled(!executing);
      menuItemCount++;
    }

    if (bc instanceof MetaBean) {
      // JMenuItem ungroupItem = new JMenuItem("Ungroup");
      MenuItem ungroupItem = new MenuItem("Ungroup");
      ungroupItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // ungroup
          bi.removeBean(m_beanLayout, m_mainKFPerspective.getCurrentTabIndex());

          Vector<Object> group = ((MetaBean) bc).getBeansInSubFlow();
          Vector<BeanConnection> associatedConnections = ((MetaBean) bc)
            .getAssociatedConnections();
          ((MetaBean) bc).restoreBeans(xx, yy);
<<<<<<< HEAD
=======
=======
    if (bc instanceof MetaBean) {
      // JMenuItem ungroupItem = new JMenuItem("Ungroup");
      MenuItem ungroupItem = new MenuItem(Messages.getInstance().getString(
          "KnowledgeFlowApp_DoPopup_UngroupItem_MenuItem_Text"));
      ungroupItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // ungroup
          bi.removeBean(m_beanLayout);

          Vector group = ((MetaBean) bc).getBeansInSubFlow();
          Vector associatedConnections = ((MetaBean) bc)
              .getAssociatedConnections();
          ((MetaBean) bc).restoreBeans();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          for (int i = 0; i < group.size(); i++) {
            BeanInstance tbi = (BeanInstance) group.elementAt(i);
            addComponent(tbi, false);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            tbi.addBean(m_beanLayout, m_mainKFPerspective.getCurrentTabIndex());
          }

          for (int i = 0; i < associatedConnections.size(); i++) {
            BeanConnection tbc = associatedConnections.elementAt(i);
<<<<<<< HEAD
=======
=======
            tbi.addBean(m_beanLayout);
          }

          for (int i = 0; i < associatedConnections.size(); i++) {
            BeanConnection tbc = (BeanConnection) associatedConnections
                .elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            tbc.setHidden(false);
          }

          m_beanLayout.repaint();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_mainKFPerspective.setEditedStatus(true);
          notifyIsDirty();
        }
      });
      ungroupItem.setEnabled(!executing);

<<<<<<< HEAD
=======
=======
          notifyIsDirty();
        }
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      beanContextMenu.add(ungroupItem);
      menuItemCount++;

      // Add to user tab
      // JMenuItem addToUserTabItem = new JMenuItem("Add to user tab");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      MenuItem addToUserTabItem = new MenuItem("Add to user tab");
      addToUserTabItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // addToUserToolBar((MetaBean) bi.getBean(), true);
          // addToUserTreeNode((MetaBean) bi.getBean(), true);
          addToUserTreeNode(bi, true);
          notifyIsDirty();
        }
      });
      addToUserTabItem.setEnabled(!executing);
<<<<<<< HEAD
=======
=======
      MenuItem addToUserTabItem = new MenuItem(Messages.getInstance()
          .getString("KnowledgeFlowApp_DoPopup_AddToUserTabItem_MenuItem_Text"));
      addToUserTabItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          addToUserToolBar((MetaBean) bi.getBean(), true);
          notifyIsDirty();
        }
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      beanContextMenu.add(addToUserTabItem);
      menuItemCount++;
    }

    // JMenuItem deleteItem = new JMenuItem("Delete");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    MenuItem deleteItem = new MenuItem("Delete");
    deleteItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BeanConnection.removeConnections(bi,
          m_mainKFPerspective.getCurrentTabIndex());
        bi.removeBean(m_beanLayout, m_mainKFPerspective.getCurrentTabIndex());
<<<<<<< HEAD
=======
=======
    MenuItem deleteItem = new MenuItem(Messages.getInstance().getString(
        "KnowledgeFlowApp_DoPopup_DeleteItem_MenuItem_Text"));
    deleteItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        BeanConnection.removeConnections(bi);
        bi.removeBean(m_beanLayout);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (bc instanceof BeanCommon) {
          String key = ((BeanCommon) bc).getCustomName() + "$" + bc.hashCode();
          m_logPanel.statusMessage(key + "|remove");
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        // delete any that have been actively selected
        if (m_mainKFPerspective.getSelectedBeans().size() > 0) {
          deleteSelectedBeans();
        }

        revalidate();
        m_mainKFPerspective.setEditedStatus(true);
        notifyIsDirty();
        m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
          m_mainKFPerspective.getCurrentTabIndex()).size() > 0);
      }
    });

    deleteItem.setEnabled(!executing);
<<<<<<< HEAD
=======
=======
        revalidate();
        notifyIsDirty();
      }
    });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (bc instanceof BeanCommon) {
      if (((BeanCommon) bc).isBusy()) {
        deleteItem.setEnabled(false);
      }
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    beanContextMenu.add(deleteItem);
    menuItemCount++;

    if (bc instanceof BeanCommon) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      MenuItem nameItem = new MenuItem("Set name");
      nameItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String oldName = ((BeanCommon) bc).getCustomName();
          String name = JOptionPane.showInputDialog(KnowledgeFlowApp.this,
            "Enter a name for this component", oldName);
          if (name != null) {
            ((BeanCommon) bc).setCustomName(name);
            m_mainKFPerspective.setEditedStatus(true);
<<<<<<< HEAD
=======
=======
      MenuItem nameItem = new MenuItem(Messages.getInstance().getString(
          "KnowledgeFlowApp_DoPopup_NameItem_MenuItem_Text"));
      nameItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String oldName = ((BeanCommon) bc).getCustomName();
          String name = JOptionPane
              .showInputDialog(
                  KnowledgeFlowApp.this,
                  Messages
                      .getInstance()
                      .getString(
                          "KnowledgeFlowApp_DoPopup_Name_JOptionPane_ShowInputDialog_Text"),
                  oldName);
          if (name != null) {
            ((BeanCommon) bc).setCustomName(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      });
      if (bc instanceof BeanCommon) {
        if (((BeanCommon) bc).isBusy()) {
          nameItem.setEnabled(false);
        }
      }
<<<<<<< HEAD
      nameItem.setEnabled(!executing);
=======
<<<<<<< HEAD
      nameItem.setEnabled(!executing);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      beanContextMenu.add(nameItem);
      menuItemCount++;
    }

    try {
      // BeanInfo [] compInfo = null;
      // JComponent [] associatedBeans = null;
<<<<<<< HEAD
      Vector<BeanInfo> compInfo = new Vector<BeanInfo>(1);
      Vector<Object> associatedBeans = null;
=======
<<<<<<< HEAD
      Vector<BeanInfo> compInfo = new Vector<BeanInfo>(1);
      Vector<Object> associatedBeans = null;
=======
      Vector compInfo = new Vector(1);
      Vector associatedBeans = null;
      Vector outputBeans = null;
      Vector compInfoOutputs = null;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (bc instanceof MetaBean) {
        compInfo = ((MetaBean) bc).getBeanInfoSubFlow();
        associatedBeans = ((MetaBean) bc).getBeansInSubFlow();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        ((MetaBean) bc).getBeansInOutputs();
        ((MetaBean) bc).getBeanInfoOutputs();
      } else {
        compInfo.add(Introspector.getBeanInfo(bc.getClass()));
      }

      final Vector<Object> tempAssociatedBeans = associatedBeans;

      if (compInfo == null) {
        weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
          "[KnowledgeFlow] Error in doPopup()");
<<<<<<< HEAD
=======
=======
        outputBeans = ((MetaBean) bc).getBeansInOutputs();
        compInfoOutputs = ((MetaBean) bc).getBeanInfoOutputs();
      } else {
        compInfo.add(Introspector.getBeanInfo(bc.getClass()));
        compInfoOutputs = compInfo;
      }

      final Vector tempAssociatedBeans = associatedBeans;

      if (compInfo == null) {
        System.err.println(Messages.getInstance().getString(
            "KnowledgeFlowApp_DoPopup_Error_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } else {
        // System.err.println("Got bean info");
        for (int zz = 0; zz < compInfo.size(); zz++) {
          final int tt = zz;
<<<<<<< HEAD
          final Class<?> custClass = compInfo.elementAt(zz).getBeanDescriptor()
            .getCustomizerClass();
=======
<<<<<<< HEAD
          final Class<?> custClass = compInfo.elementAt(zz).getBeanDescriptor()
            .getCustomizerClass();
=======
          final Class custClass = ((BeanInfo) compInfo.elementAt(zz))
              .getBeanDescriptor().getCustomizerClass();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          if (custClass != null) {
            // System.err.println("Got customizer class");
            // popupCustomizer(custClass, bc);
            // JMenuItem custItem = null;
            MenuItem custItem = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            boolean customizationEnabled = !executing;

            if (!(bc instanceof MetaBean)) {
              // custItem = new JMenuItem("Configure...");
              custItem = new MenuItem("Configure...");
              if (bc instanceof BeanCommon) {
                customizationEnabled = (!executing && !((BeanCommon) bc)
                  .isBusy());
<<<<<<< HEAD
=======
=======
            boolean customizationEnabled = true;

            if (!(bc instanceof MetaBean)) {
              // custItem = new JMenuItem("Configure...");
              custItem = new MenuItem(Messages.getInstance().getString(
                  "KnowledgeFlowApp_DoPopup_CustItem_MenuItem_Text_First"));
              if (bc instanceof BeanCommon) {
                customizationEnabled = !((BeanCommon) bc).isBusy();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              }
            } else {
              String custName = custClass.getName();
              BeanInstance tbi = (BeanInstance) associatedBeans.elementAt(zz);
              if (tbi.getBean() instanceof BeanCommon) {
                custName = ((BeanCommon) tbi.getBean()).getCustomName();
              } else {
                if (tbi.getBean() instanceof WekaWrapper) {
                  custName = ((WekaWrapper) tbi.getBean())
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                    .getWrappedAlgorithm().getClass().getName();
                } else {
                  custName = custName.substring(0,
                    custName.indexOf("Customizer"));
                }

                custName = custName.substring(custName.lastIndexOf('.') + 1,
                  custName.length());
              }
              // custItem = new JMenuItem("Configure: "+ custName);
              custItem = new MenuItem("Configure: " + custName);
              if (tbi.getBean() instanceof BeanCommon) {
                customizationEnabled = (!executing && !((BeanCommon) tbi
                  .getBean()).isBusy());
<<<<<<< HEAD
=======
=======
                      .getWrappedAlgorithm().getClass().getName();
                } else {
                  custName = custName.substring(0,
                      custName.indexOf("Customizer"));
                }

                custName = custName.substring(custName.lastIndexOf('.') + 1,
                    custName.length());
              }
              // custItem = new JMenuItem("Configure: "+ custName);
              custItem = new MenuItem(Messages.getInstance().getString(
                  "KnowledgeFlowApp_DoPopup_CustItem_MenuItem_Text_Second")
                  + custName);
              if (tbi.getBean() instanceof BeanCommon) {
                customizationEnabled = !((BeanCommon) tbi.getBean()).isBusy();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              }
            }

            custItem.addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              @Override
              public void actionPerformed(ActionEvent e) {
                if (bc instanceof MetaBean) {
                  popupCustomizer(custClass,
                    (JComponent) ((BeanInstance) tempAssociatedBeans
                      .elementAt(tt)).getBean());
<<<<<<< HEAD
=======
=======
              public void actionPerformed(ActionEvent e) {
                if (bc instanceof MetaBean) {
                  popupCustomizer(custClass,
                      (JComponent) ((BeanInstance) tempAssociatedBeans
                          .elementAt(tt)).getBean());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                } else {
                  popupCustomizer(custClass, bc);
                }

                notifyIsDirty();
              }
            });
            custItem.setEnabled(customizationEnabled);
            beanContextMenu.add(custItem);
            menuItemCount++;
          } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
              "[KnowledgeFlow] No customizer class");
          }
        }

        Vector<EventSetDescriptor[]> esdV = new Vector<EventSetDescriptor[]>();
<<<<<<< HEAD
=======
=======
            System.err.println(Messages.getInstance().getString(
                "KnowledgeFlowApp_DoPopup_Error_Text_Second"));
          }
        }

        Vector esdV = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        // for (int i = 0; i < compInfoOutputs.size(); i++) {
        for (int i = 0; i < compInfo.size(); i++) {
          EventSetDescriptor[] temp =
<<<<<<< HEAD
            // ((BeanInfo)
            // compInfoOutputs.elementAt(i)).getEventSetDescriptors();
            compInfo.elementAt(i).getEventSetDescriptors();
=======
<<<<<<< HEAD
            // ((BeanInfo)
            // compInfoOutputs.elementAt(i)).getEventSetDescriptors();
            compInfo.elementAt(i).getEventSetDescriptors();
=======
          // ((BeanInfo) compInfoOutputs.elementAt(i)).getEventSetDescriptors();
          ((BeanInfo) compInfo.elementAt(i)).getEventSetDescriptors();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

          if ((temp != null) && (temp.length > 0)) {
            esdV.add(temp);
          }
        }

        // EventSetDescriptor [] esds = compInfo.getEventSetDescriptors();
        // if (esds != null && esds.length > 0) {
        if (esdV.size() > 0) {
          // beanContextMenu.insert(new JLabel("Connections",
          // SwingConstants.CENTER),
          // menuItemCount);
<<<<<<< HEAD
          MenuItem connections = new MenuItem("Connections:");
=======
<<<<<<< HEAD
          MenuItem connections = new MenuItem("Connections:");
=======
          MenuItem connections = new MenuItem(Messages.getInstance().getString(
              "KnowledgeFlowApp_DoPopup_Connection_MenuItem_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          connections.setEnabled(false);
          beanContextMenu.insert(connections, menuItemCount);
          menuItemCount++;
        }

        // final Vector finalOutputs = outputBeans;
<<<<<<< HEAD
        final Vector<Object> finalOutputs = associatedBeans;
=======
<<<<<<< HEAD
        final Vector<Object> finalOutputs = associatedBeans;
=======
        final Vector finalOutputs = associatedBeans;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        for (int j = 0; j < esdV.size(); j++) {
          final int fj = j;
          String sourceBeanName = "";

          if (bc instanceof MetaBean) {
            // Object sourceBean = ((BeanInstance)
            // outputBeans.elementAt(j)).getBean();
            Object sourceBean = ((BeanInstance) associatedBeans.elementAt(j))
<<<<<<< HEAD
              .getBean();
=======
<<<<<<< HEAD
              .getBean();
=======
                .getBean();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            if (sourceBean instanceof BeanCommon) {
              sourceBeanName = ((BeanCommon) sourceBean).getCustomName();
            } else {
              if (sourceBean instanceof WekaWrapper) {
                sourceBeanName = ((WekaWrapper) sourceBean)
<<<<<<< HEAD
                  .getWrappedAlgorithm().getClass().getName();
=======
<<<<<<< HEAD
                  .getWrappedAlgorithm().getClass().getName();
=======
                    .getWrappedAlgorithm().getClass().getName();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              } else {
                sourceBeanName = sourceBean.getClass().getName();
              }

              sourceBeanName = sourceBeanName.substring(
<<<<<<< HEAD
                sourceBeanName.lastIndexOf('.') + 1, sourceBeanName.length());
=======
<<<<<<< HEAD
                sourceBeanName.lastIndexOf('.') + 1, sourceBeanName.length());
=======
                  sourceBeanName.lastIndexOf('.') + 1, sourceBeanName.length());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            }
            sourceBeanName += ": ";
          }

<<<<<<< HEAD
          EventSetDescriptor[] esds = esdV.elementAt(j);

          for (final EventSetDescriptor esd : esds) {
=======
<<<<<<< HEAD
          EventSetDescriptor[] esds = esdV.elementAt(j);

          for (final EventSetDescriptor esd : esds) {
=======
          EventSetDescriptor[] esds = (EventSetDescriptor[]) esdV.elementAt(j);

          for (int i = 0; i < esds.length; i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            // System.err.println(esds[i].getName());
            // add each event name to the menu
            // JMenuItem evntItem = new JMenuItem(sourceBeanName
            // +esds[i].getName());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            MenuItem evntItem = new MenuItem(sourceBeanName + esd.getName());
            // Check EventConstraints (if any) here
            boolean ok = true;
            evntItem.setEnabled(!executing);
<<<<<<< HEAD
=======
=======
            MenuItem evntItem = new MenuItem(sourceBeanName + esds[i].getName());
            final EventSetDescriptor esd = esds[i];

            // Check EventConstraints (if any) here
            boolean ok = true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

            if (bc instanceof EventConstraints) {
              ok = ((EventConstraints) bc).eventGeneratable(esd.getName());
            }

            if (ok) {
              evntItem.addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                @Override
                public void actionPerformed(ActionEvent e) {
                  connectComponents(
                    esd,
                    (bc instanceof MetaBean) ? ((BeanInstance) finalOutputs
                      .elementAt(fj)) : bi, xx, yy);
<<<<<<< HEAD
=======
=======
                public void actionPerformed(ActionEvent e) {
                  connectComponents(
                      esd,
                      (bc instanceof MetaBean) ? ((BeanInstance) finalOutputs
                          .elementAt(fj)) : bi, xx, yy);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  notifyIsDirty();
                }
              });
            } else {
              evntItem.setEnabled(false);
            }

            beanContextMenu.add(evntItem);
            menuItemCount++;
          }
        }
      }
    } catch (IntrospectionException ie) {
      ie.printStackTrace();
    }

    // System.err.println("Just before look for other options");
    // now look for other options for this bean
    if (bc instanceof UserRequestAcceptor || bc instanceof Startable) {
<<<<<<< HEAD
      Enumeration<String> req = null;
=======
<<<<<<< HEAD
      Enumeration<String> req = null;
=======
      Enumeration req = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      if (bc instanceof UserRequestAcceptor) {
        req = ((UserRequestAcceptor) bc).enumerateRequests();
      }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (/* (bc instanceof Startable) || */(req != null && req
        .hasMoreElements())) {
        // beanContextMenu.insert(new JLabel("Actions",
        // SwingConstants.CENTER),
        // menuItemCount);
        MenuItem actions = new MenuItem("Actions:");
<<<<<<< HEAD
=======
=======
      if ((bc instanceof Startable) || (req != null && req.hasMoreElements())) {
        // beanContextMenu.insert(new JLabel("Actions",
        // SwingConstants.CENTER),
        // menuItemCount);
        MenuItem actions = new MenuItem(Messages.getInstance().getString(
            "KnowledgeFlowApp_DoPopup_Actions_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        actions.setEnabled(false);
        beanContextMenu.insert(actions, menuItemCount);
        menuItemCount++;
      }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      /*
       * if (bc instanceof Startable) { String tempS =
       * ((Startable)bc).getStartMessage(); insertUserOrStartableMenuItem(bc,
       * true, tempS, beanContextMenu); }
       */

      while (req != null && req.hasMoreElements()) {
        String tempS = req.nextElement();
<<<<<<< HEAD
=======
=======
      if (bc instanceof Startable) {
        String tempS = ((Startable) bc).getStartMessage();
        insertUserOrStartableMenuItem(bc, true, tempS, beanContextMenu);
      }

      while (req != null && req.hasMoreElements()) {
        String tempS = (String) req.nextElement();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        insertUserOrStartableMenuItem(bc, false, tempS, beanContextMenu);
        menuItemCount++;
      }
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // Send to perspective menu item?
    if (bc instanceof weka.gui.beans.Loader && m_perspectives.size() > 1
      && m_perspectiveDataLoadThread == null) {
      final weka.core.converters.Loader theLoader =
        ((weka.gui.beans.Loader) bc)
          .getLoader();

      boolean ok = true;
      if (theLoader instanceof FileSourcedConverter) {
        String fileName = ((FileSourcedConverter) theLoader).retrieveFile()
          .getPath();
        Environment env = m_mainKFPerspective.getEnvironmentSettings();
        try {
          fileName = env.substitute(fileName);
        } catch (Exception ex) {
        }

        File tempF = new File(fileName);
        String fileNameFixedPathSep = fileName.replace(File.separatorChar, '/');
        if (!tempF.isFile()
          && this.getClass().getClassLoader().getResource(fileNameFixedPathSep) == null) {
          ok = false;
        }
      }

      if (ok) {
        beanContextMenu.addSeparator();
        menuItemCount++;
        if (m_perspectives.size() > 2) {
          MenuItem sendToAllPerspectives = new MenuItem(
            "Send to all perspectives");
          menuItemCount++;
          sendToAllPerspectives.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              loadDataAndSendToPerspective(theLoader, 0, true);
            }
          });
          beanContextMenu.add(sendToAllPerspectives);
        }
        Menu sendToPerspective = new Menu("Send to perspective...");
        beanContextMenu.add(sendToPerspective);
        menuItemCount++;
        for (int i = 1; i < m_perspectives.size(); i++) {
          final int pIndex = i;

          if (m_perspectives.get(i).acceptsInstances()) {
            String pName = m_perspectives.get(i).getPerspectiveTitle();
            MenuItem pI = new MenuItem(pName);
            pI.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                loadDataAndSendToPerspective(theLoader, pIndex, false);
              }
            });
            sendToPerspective.add(pI);
          }
        }
      }
    }

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // System.err.println("Just before showing menu");
    // popup the menu
    if (menuItemCount > 0) {
      // beanContextMenu.show(m_beanLayout, x, y);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      double z = m_layoutZoom / 100.0;
      double px = x * z;
      double py = y * z;
      m_beanLayout.add(beanContextMenu);
      // beanContextMenu.show(m_beanLayout, x, y);
      beanContextMenu.show(m_beanLayout, (int) px, (int) py);
    }
  }

  private synchronized void loadDataAndSendToPerspective(
    final weka.core.converters.Loader loader, final int perspectiveIndex,
    final boolean sendToAll) {
    if (m_perspectiveDataLoadThread == null) {
      m_perspectiveDataLoadThread = new Thread() {
        @Override
        public void run() {
          try {
            Environment env = m_mainKFPerspective.getEnvironmentSettings();
            if (loader instanceof EnvironmentHandler) {
              ((EnvironmentHandler) loader).setEnvironment(env);
            }

            loader.reset();
            m_logPanel
              .statusMessage("@!@[KnowledgeFlow]|Sending data to perspective(s)...");
            Instances data = loader.getDataSet();
            if (data != null) {
              // make sure the perspective toolbar is visible!!
              if (!m_configAndPerspectivesVisible) {
                KnowledgeFlowApp.this.add(m_configAndPerspectives,
                  BorderLayout.NORTH);
                m_configAndPerspectivesVisible = true;
              }

              // need to disable all the perspective buttons
              for (int i = 0; i < m_perspectives.size(); i++) {
                m_perspectiveToolBar.getComponent(i).setEnabled(false);
              }

              if (sendToAll) {
                for (int i = 1; i < m_perspectives.size(); i++) {
                  if (m_perspectives.get(i).acceptsInstances()) {
                    m_perspectives.get(i).setInstances(data);
                  }
                }
              } else {
                KFPerspective currentP = (KFPerspective) m_perspectiveHolder
                  .getComponent(0);
                if (currentP != m_perspectives.get(perspectiveIndex)) {
                  m_perspectives.get(perspectiveIndex).setInstances(data);
                  currentP.setActive(false);
                  m_perspectiveHolder.remove(0);
                  m_perspectiveHolder.add(
                    (JComponent) m_perspectives.get(perspectiveIndex),
                    BorderLayout.CENTER);
                  m_perspectives.get(perspectiveIndex).setActive(true);
                  ((JToggleButton) m_perspectiveToolBar
                    .getComponent(perspectiveIndex)).setSelected(true);
                  // KnowledgeFlowApp.this.invalidate();
                  KnowledgeFlowApp.this.revalidate();
                  KnowledgeFlowApp.this.repaint();
                  notifyIsDirty();
                }
              }
            }
          } catch (Exception ex) {
            weka.core.logging.Logger.log(
              weka.core.logging.Logger.Level.WARNING,
              "[KnowledgeFlow] problem loading data for "
                + "perspective(s) : " + ex.getMessage());
            ex.printStackTrace();
          } finally {
            // re-enable all the perspective buttons
            for (int i = 0; i < m_perspectives.size(); i++) {
              m_perspectiveToolBar.getComponent(i).setEnabled(true);
            }
            m_perspectiveDataLoadThread = null;
            m_logPanel.statusMessage("@!@[KnowledgeFlow]|OK");
          }
        }
      };
      m_perspectiveDataLoadThread.setPriority(Thread.MIN_PRIORITY);
      m_perspectiveDataLoadThread.start();
<<<<<<< HEAD
=======
=======
      m_beanLayout.add(beanContextMenu);
      beanContextMenu.show(m_beanLayout, x, y);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  private void insertUserOrStartableMenuItem(final JComponent bc,
<<<<<<< HEAD
    final boolean startable, String tempS, PopupMenu beanContextMenu) {
=======
<<<<<<< HEAD
    final boolean startable, String tempS, PopupMenu beanContextMenu) {
=======
      final boolean startable, String tempS, PopupMenu beanContextMenu) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    boolean disabled = false;
    boolean confirmRequest = false;

    // check to see if this item is currently disabled
    if (tempS.charAt(0) == '$') {
      tempS = tempS.substring(1, tempS.length());
      disabled = true;
    }

    // check to see if this item requires confirmation
    if (tempS.charAt(0) == '?') {
      tempS = tempS.substring(1, tempS.length());
      confirmRequest = true;
    }

    final String tempS2 = tempS;

    // JMenuItem custItem = new JMenuItem(tempS2);
    MenuItem custItem = new MenuItem(tempS2);
    if (confirmRequest) {
      custItem.addActionListener(new ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void actionPerformed(ActionEvent e) {
          //
          int result = JOptionPane.showConfirmDialog(KnowledgeFlowApp.this,
            tempS2, "Confirm action", JOptionPane.YES_NO_OPTION);
<<<<<<< HEAD
=======
=======
        public void actionPerformed(ActionEvent e) {
          //
          int result = JOptionPane
              .showConfirmDialog(
                  KnowledgeFlowApp.this,
                  tempS2,
                  Messages
                      .getInstance()
                      .getString(
                          "KnowledgeFlowApp_InsertUserOrStartableMenuItem_Result_JOptionPane_ShowConfirmDialog_Text"),
                  JOptionPane.YES_NO_OPTION);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (result == JOptionPane.YES_OPTION) {
            Thread startPointThread = new Thread() {
              @Override
              public void run() {
                try {
                  if (startable) {
<<<<<<< HEAD
                    ((Startable) bc).start();
=======
<<<<<<< HEAD
                    ((Startable) bc).start();
=======
                    boolean proceed = true;
                    if (m_Memory.memoryIsLow()) {
                      proceed = m_Memory.showMemoryIsLow();
                    }
                    if (proceed) {
                      ((Startable) bc).start();
                    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  } else if (bc instanceof UserRequestAcceptor) {
                    ((UserRequestAcceptor) bc).performRequest(tempS2);
                  }
                  notifyIsDirty();
                } catch (Exception ex) {
                  ex.printStackTrace();
                }
              }
            };
            startPointThread.setPriority(Thread.MIN_PRIORITY);
            startPointThread.start();
          }
        }
      });
    } else {
      custItem.addActionListener(new ActionListener() {
<<<<<<< HEAD
        @Override
=======
<<<<<<< HEAD
        @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        public void actionPerformed(ActionEvent e) {
          Thread startPointThread = new Thread() {
            @Override
            public void run() {
              try {
                if (startable) {
<<<<<<< HEAD
                  ((Startable) bc).start();
=======
<<<<<<< HEAD
                  ((Startable) bc).start();
=======
                  boolean proceed = true;
                  if (m_Memory.memoryIsLow()) {
                    proceed = m_Memory.showMemoryIsLow();
                  }
                  if (proceed) {
                    ((Startable) bc).start();
                  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                } else if (bc instanceof UserRequestAcceptor) {
                  ((UserRequestAcceptor) bc).performRequest(tempS2);
                }
                notifyIsDirty();
              } catch (Exception ex) {
                ex.printStackTrace();
              }
            }
          };
          startPointThread.setPriority(Thread.MIN_PRIORITY);
          startPointThread.start();
        }
      });
    }

    if (disabled) {
      custItem.setEnabled(false);
    }

    beanContextMenu.add(custItem);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Tells us about the modified status of a particular object - typically a
   * customizer that is editing a flow component. Allows us to set the modified
   * flag for the current flow.
   */
  @Override
  public void setModifiedStatus(Object source, boolean modified) {
    if (source instanceof BeanCustomizer && modified) {
      m_mainKFPerspective.setEditedStatus(modified);
    }
  }

  /**
   * Popup the customizer for this bean
   *
   * @param custClass the class of the customizer
   * @param bc the bean to be customized
   */
  private void popupCustomizer(Class<?> custClass, JComponent bc) {
<<<<<<< HEAD
=======
=======
   * Popup the customizer for this bean
   * 
   * @param custClass the class of the customizer
   * @param bc the bean to be customized
   */
  private void popupCustomizer(Class custClass, JComponent bc) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    try {
      // instantiate
      final Object customizer = custClass.newInstance();
      // set environment **before** setting object!!
      if (customizer instanceof EnvironmentHandler) {
        ((EnvironmentHandler) customizer).setEnvironment(m_flowEnvironment);
      }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      if (customizer instanceof BeanCustomizer) {
        ((BeanCustomizer) customizer).setModifiedListener(this);
      }

      ((Customizer) customizer).setObject(bc);
      // final javax.swing.JFrame jf = new javax.swing.JFrame();
      final JDialog d = new JDialog(
        (java.awt.Frame) KnowledgeFlowApp.this.getTopLevelAncestor(),
        ModalityType.DOCUMENT_MODAL);
      d.setLayout(new BorderLayout());
      d.getContentPane().add((JComponent) customizer, BorderLayout.CENTER);

      // jf.getContentPane().setLayout(new BorderLayout());
      // jf.getContentPane().add((JComponent)customizer, BorderLayout.CENTER);
      if (customizer instanceof CustomizerCloseRequester) {
        ((CustomizerCloseRequester) customizer).setParentWindow(d);
      }
      d.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
=======
=======
      ((Customizer) customizer).setObject(bc);
      final javax.swing.JFrame jf = new javax.swing.JFrame();
      jf.getContentPane().setLayout(new BorderLayout());
      jf.getContentPane().add((JComponent) customizer, BorderLayout.CENTER);
      if (customizer instanceof CustomizerCloseRequester) {
        ((CustomizerCloseRequester) customizer).setParentFrame(jf);
      }
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          if (customizer instanceof CustomizerClosingListener) {
            ((CustomizerClosingListener) customizer).customizerClosing();
          }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          d.dispose();
        }
      });
      // jf.pack();
      // jf.setVisible(true);
      d.pack();
      d.setLocationRelativeTo(KnowledgeFlowApp.this);
      d.setVisible(true);
<<<<<<< HEAD
=======
=======
          jf.dispose();
        }
      });
      jf.pack();
      jf.setVisible(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private void addToUserTreeNode(BeanInstance meta, boolean installListener) {
    DefaultTreeModel model = (DefaultTreeModel) m_componentTree.getModel();
    DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
    if (m_userCompNode == null) {
      m_userCompNode = new InvisibleNode("User");
      model.insertNodeInto(m_userCompNode, root, 0);
    }

    Vector<Object> beanHolder = new Vector<Object>();
    beanHolder.add(meta);

    try {
      StringBuffer serialized = copyToBuffer(beanHolder);

      String displayName = "";
      ImageIcon scaledIcon = null;
      //
      if (meta.getBean() instanceof Visible) {
        // ((Visible)copy).getVisual().scale(3);
        scaledIcon = new ImageIcon(((Visible) meta.getBean()).getVisual()
          .scale(0.33));
        displayName = ((Visible) meta.getBean()).getVisual().getText();
      }

      Vector<Object> metaDetails = new Vector<Object>();
      metaDetails.add(displayName);
      metaDetails.add(serialized);
      metaDetails.add(scaledIcon);
      SerializedObject so = new SerializedObject(metaDetails);
      @SuppressWarnings("unchecked")
      Vector<Object> copy = (Vector<Object>) so.getObject();

      JTreeLeafDetails metaLeaf = new JTreeLeafDetails(displayName, copy,
        scaledIcon);

      DefaultMutableTreeNode newUserComp = new InvisibleNode(metaLeaf);
      model.insertNodeInto(newUserComp, m_userCompNode, 0);

      // add to the list of user components
      m_userComponents.add(copy);

      if (installListener && m_firstUserComponentOpp) {
        try {
          installWindowListenerForSavingUserStuff();
          m_firstUserComponentOpp = false;
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    /*
     * java.awt.Color bckC = getBackground(); Vector beans =
     * BeanInstance.getBeanInstances(m_mainKFPerspective.getCurrentTabIndex());
     * detachFromLayout(beans);
     */

    // Disconnect any beans connected to the inputs or outputs
    // of this MetaBean (prevents serialization of the entire
    // KnowledgeFlow!!)
    /*
     * Vector tempRemovedConnections = new Vector(); Vector allConnections =
     * BeanConnection.getConnections(m_mainKFPerspective.getCurrentTabIndex());
     * Vector inputs = bean.getInputs(); Vector outputs = bean.getOutputs();
     * Vector allComps = bean.getSubFlow();
     *
     * for (int i = 0; i < inputs.size(); i++) { BeanInstance temp =
     * (BeanInstance)inputs.elementAt(i); // is this input a target for some
     * event? for (int j = 0; j < allConnections.size(); j++) { BeanConnection
     * tempC = (BeanConnection)allConnections.elementAt(j); if
     * (tempC.getTarget() == temp) { tempRemovedConnections.add(tempC); }
     *
     * // also check to see if this input is a source for // some target that is
     * *not* in the subFlow if (tempC.getSource() == temp &&
     * !bean.subFlowContains(tempC.getTarget())) {
     * tempRemovedConnections.add(tempC); } } }
     *
     * for (int i = 0; i < outputs.size(); i++) { BeanInstance temp =
     * (BeanInstance)outputs.elementAt(i); // is this output a source for some
     * target? for (int j = 0; j < allConnections.size(); j++) { BeanConnection
     * tempC = (BeanConnection)allConnections.elementAt(j); if
     * (tempC.getSource() == temp) { tempRemovedConnections.add(tempC); } } }
     *
     *
     * for (int i = 0; i < tempRemovedConnections.size(); i++) { BeanConnection
     * temp = (BeanConnection)tempRemovedConnections.elementAt(i);
     * temp.remove(m_mainKFPerspective.getCurrentTabIndex()); }
     *
     * MetaBean copy = copyMetaBean(bean, true);
     *
     * String displayName =""; ImageIcon scaledIcon = null; // if (copy
     * instanceof Visible) { //((Visible)copy).getVisual().scale(3); scaledIcon
     * = new ImageIcon(((Visible)copy).getVisual().scale(0.33)); displayName =
     * ((Visible)copy).getVisual().getText(); }
     *
     * JTreeLeafDetails metaLeaf = new JTreeLeafDetails(displayName, copy,
     * scaledIcon); DefaultMutableTreeNode newUserComp = new
     * DefaultMutableTreeNode(metaLeaf); model.insertNodeInto(newUserComp,
     * m_userCompNode, 0);
     *
     * // add to the list of user components m_userComponents.add(copy);
     *
     * if (installListener && m_firstUserComponentOpp) { try {
     * installWindowListenerForSavingUserBeans(); m_firstUserComponentOpp =
     * false; } catch (Exception ex) { ex.printStackTrace(); } }
     *
     * // Now reinstate any deleted connections to the original MetaBean for
     * (int i = 0; i < tempRemovedConnections.size(); i++) { BeanConnection temp
     * = (BeanConnection)tempRemovedConnections.elementAt(i); BeanConnection
     * newC = new BeanConnection(temp.getSource(), temp.getTarget(),
     * temp.getSourceEventSetDescriptor(),
     * m_mainKFPerspective.getCurrentTabIndex()); }
     */

    /*
     * for (int i = 0; i < beans.size(); i++) { BeanInstance tempB =
     * (BeanInstance)beans.elementAt(i); if (tempB.getBean() instanceof Visible)
     * { ((Visible)(tempB.getBean())).getVisual().
     * addPropertyChangeListener(KnowledgeFlowApp.this);
     *
     * if (tempB.getBean() instanceof MetaBean) { ((MetaBean)tempB.getBean()).
     * addPropertyChangeListenersSubFlow(KnowledgeFlowApp.this); } // Restore
     * the default background colour ((Visible)(tempB.getBean())).getVisual().
     * setBackground(bckC); ((JComponent)(tempB.getBean())).setBackground(bckC);
     * } }
     */
  }

  /**
   * Set the contents of the "paste" buffer and enable the paste from cliboard
   * toolbar button
   *
   * @param b the buffer to use
   */
  public void setPasteBuffer(StringBuffer b) {
    m_pasteBuffer = b;

    if (m_pasteBuffer != null && m_pasteBuffer.length() > 0) {
      m_pasteB.setEnabled(true);
    }
  }

  /**
   * Get the contents of the paste buffer
   *
   * @return the contents of the paste buffer
   */
  public StringBuffer getPasteBuffer() {
    return m_pasteBuffer;
  }

  /**
   * Utility routine that serializes the supplied Vector of BeanInstances to XML
   *
   * @param selectedBeans the vector of BeanInstances to serialize
   * @return a StringBuffer containing the serialized vector
   * @throws Exception if a problem occurs
   */
  public StringBuffer copyToBuffer(Vector<Object> selectedBeans)
    throws Exception {

    Vector<BeanConnection> associatedConnections = BeanConnection
      .getConnections(m_mainKFPerspective.getCurrentTabIndex());
    /*
     * BeanConnection.associatedConnections(selectedBeans,
     * m_mainKFPerspective.getCurrentTabIndex());
     */

    // xml serialize to a string and store in the
    // clipboard variable
    Vector<Vector<?>> v = new Vector<Vector<?>>();
    v.setSize(2);
    v.set(XMLBeans.INDEX_BEANINSTANCES, selectedBeans);
    v.set(XMLBeans.INDEX_BEANCONNECTIONS, associatedConnections);

    XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
      m_mainKFPerspective.getCurrentTabIndex());
    java.io.StringWriter sw = new java.io.StringWriter();
    xml.write(sw, v);

    return sw.getBuffer();
    // System.out.println(m_pasteBuffer.toString());

  }

  private boolean copyToClipboard() {
    Vector<Object> selectedBeans = m_mainKFPerspective.getSelectedBeans();
    if (selectedBeans == null || selectedBeans.size() == 0) {
      return false;
    }
    // m_mainKFPerspective.setSelectedBeans(new Vector());

    try {
      m_pasteBuffer = copyToBuffer(selectedBeans);
    } catch (Exception ex) {
      m_logPanel.logMessage("[KnowledgeFlow] problem copying beans: "
        + ex.getMessage());
      ex.printStackTrace();
      return false;
    }

    m_pasteB.setEnabled(true);
    revalidate();
    repaint();
    notifyIsDirty();

    return true;
  }

  protected boolean pasteFromBuffer(int x, int y, StringBuffer pasteBuffer,
    boolean addUndoPoint) {

    if (addUndoPoint) {
      addUndoPoint();
    }

    java.io.StringReader sr = new java.io.StringReader(pasteBuffer.toString());
    try {
      XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
        m_mainKFPerspective.getCurrentTabIndex());
      @SuppressWarnings("unchecked")
      Vector<Vector<?>> v = (Vector<Vector<?>>) xml.read(sr);
      @SuppressWarnings("unchecked")
      Vector<Object> beans = (Vector<Object>) v
        .get(XMLBeans.INDEX_BEANINSTANCES);
      @SuppressWarnings("unchecked")
      Vector<BeanConnection> connections = (Vector<BeanConnection>) v
        .get(XMLBeans.INDEX_BEANCONNECTIONS);

      for (int i = 0; i < beans.size(); i++) {
        BeanInstance b = (BeanInstance) beans.get(i);
        if (b.getBean() instanceof MetaBean) {
          Vector<Object> subFlow = ((MetaBean) b.getBean()).getSubFlow();
          for (int j = 0; j < subFlow.size(); j++) {
            BeanInstance subB = (BeanInstance) subFlow.get(j);
            subB.removeBean(m_beanLayout,
              m_mainKFPerspective.getCurrentTabIndex());
            if (subB.getBean() instanceof Visible) {
              ((Visible) subB.getBean()).getVisual()
                .removePropertyChangeListener(this);
            }
          }
        }
      }

      // adjust beans coords with respect to x, y. Look for
      // the smallest x and the smallest y (top left corner of the bounding)
      // box.
      int minX = Integer.MAX_VALUE;
      int minY = Integer.MAX_VALUE;
      boolean adjust = false;
      for (int i = 0; i < beans.size(); i++) {
        BeanInstance b = (BeanInstance) beans.get(i);
        if (b.getX() < minX) {
          minX = b.getX();
          adjust = true;
        }
        if (b.getY() < minY) {
          minY = b.getY();
          adjust = true;
        }
      }
      if (adjust) {
        int deltaX = x - minX;
        int deltaY = y - minY;
        for (int i = 0; i < beans.size(); i++) {
          BeanInstance b = (BeanInstance) beans.get(i);
          /*
           * b.setX(b.getX() + deltaX); b.setY(b.getY() + deltaY);
           */
          b.setXY(b.getX() + deltaX, b.getY() + deltaY);
        }
      }

      // integrate these beans
      integrateFlow(beans, connections, false, false);
      for (int i = 0; i < beans.size(); i++) {
        checkForDuplicateName((BeanInstance) beans.get(i));
      }
      setEnvironment();
      notifyIsDirty();
      m_mainKFPerspective.setSelectedBeans(beans);
    } catch (Exception e) {
      m_logPanel.logMessage("[KnowledgeFlow] problem pasting beans: "
        + e.getMessage());
      e.printStackTrace();
    }

    revalidate();
    notifyIsDirty();

    return true;
  }

  private boolean pasteFromClipboard(int x, int y, StringBuffer pasteBuffer,
    boolean addUndoPoint) {

    return pasteFromBuffer(x, y, pasteBuffer, addUndoPoint);
  }

  private void deleteSelectedBeans() {

    Vector<Object> v = m_mainKFPerspective.getSelectedBeans();
    if (v.size() > 0) {
      m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
    }
    addUndoPoint();

    for (int i = 0; i < v.size(); i++) {
      BeanInstance b = (BeanInstance) v.get(i);

      BeanConnection.removeConnections(b,
        m_mainKFPerspective.getCurrentTabIndex());
      b.removeBean(m_beanLayout, m_mainKFPerspective.getCurrentTabIndex());
      if (b instanceof BeanCommon) {
        String key = ((BeanCommon) b).getCustomName() + "$" + b.hashCode();
        m_logPanel.statusMessage(key + "|remove");
      }
    }
    m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
    revalidate();
    notifyIsDirty();

    m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
      m_mainKFPerspective.getCurrentTabIndex()).size() > 0);
  }

  private void addUndoPoint() {
    try {
      Stack<File> undo = m_mainKFPerspective.getUndoBuffer();
      File tempFile = File.createTempFile("knowledgeFlow", FILE_EXTENSION_XML);
      tempFile.deleteOnExit();

      if (saveLayout(tempFile, m_mainKFPerspective.getCurrentTabIndex(), true)) {
        undo.push(tempFile);

        // keep no more than 20 undo points
        if (undo.size() > 20) {
          undo.remove(0);
        }
        m_undoB.setEnabled(true);
      }

    } catch (Exception ex) {
      m_logPanel
        .logMessage("[KnowledgeFlow] a problem occurred while trying to "
          + "create a undo point : " + ex.getMessage());
    }
  }

  private boolean groupable(Vector<Object> selected, Vector<Object> inputs,
    Vector<Object> outputs) {
    boolean groupable = true;

    // screen the inputs and outputs
    if (inputs.size() == 0 || outputs.size() == 0) {
      return false;
    }

    // dissallow MetaBeans in the selected set (for the
    // time being).
    for (int i = 0; i < selected.size(); i++) {
      BeanInstance temp = (BeanInstance) selected.elementAt(i);
      if (temp.getBean() instanceof MetaBean) {
        groupable = false;
        return false;
      }
    }

    // show connector dots for input beans
    for (int i = 0; i < inputs.size(); i++) {
      BeanInstance temp = (BeanInstance) inputs.elementAt(i);
      if (temp.getBean() instanceof Visible) {
        ((Visible) temp.getBean()).getVisual().setDisplayConnectors(true,
          java.awt.Color.red);
      }
    }

    // show connector dots for output beans
    for (int i = 0; i < outputs.size(); i++) {
      BeanInstance temp = (BeanInstance) outputs.elementAt(i);
      if (temp.getBean() instanceof Visible) {
        ((Visible) temp.getBean()).getVisual().setDisplayConnectors(true,
          java.awt.Color.green);
      }
    }

    return groupable;
  }

  // right click over empty canvas (not on a bean)
  private void rightClickCanvasPopup(final int x, final int y) {

    Vector<BeanConnection> closestConnections = BeanConnection
      .getClosestConnections(new Point(x, y), 10,
        m_mainKFPerspective.getCurrentTabIndex());

    PopupMenu rightClickMenu = new PopupMenu();
    int menuItemCount = 0;
    if (m_mainKFPerspective.getSelectedBeans().size() > 0
      || closestConnections.size() > 0
      || (m_pasteBuffer != null && m_pasteBuffer.length() > 0)) {

      if (m_mainKFPerspective.getSelectedBeans().size() > 0) {

        MenuItem snapItem = new MenuItem("Snap selected to grid");
        snapItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            snapSelectedToGrid();
          }
        });
        rightClickMenu.add(snapItem);
        menuItemCount++;

        MenuItem copyItem = new MenuItem("Copy selected");
        copyItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

            copyToClipboard();
            m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
          }
        });
        rightClickMenu.add(copyItem);
        menuItemCount++;

        MenuItem cutItem = new MenuItem("Cut selected");
        cutItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            // only delete if our copy was successful!
            if (copyToClipboard()) {
              deleteSelectedBeans();
            }
          }
        });
        rightClickMenu.add(cutItem);
        menuItemCount++;

        MenuItem deleteSelected = new MenuItem("Delete selected");
        deleteSelected.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

            deleteSelectedBeans();
          }
        });
        rightClickMenu.add(deleteSelected);
        menuItemCount++;

        // Able to group selected subflow?
        final Vector<Object> selected = m_mainKFPerspective.getSelectedBeans();
        // check if sub flow is valid
        final Vector<Object> inputs = BeanConnection.inputs(selected,
          m_mainKFPerspective.getCurrentTabIndex());
        final Vector<Object> outputs = BeanConnection.outputs(selected,
          m_mainKFPerspective.getCurrentTabIndex());

        boolean groupable = groupable(selected, inputs, outputs);

        if (groupable) {
          MenuItem groupItem = new MenuItem("Group selected");
          groupItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              groupSubFlow(selected, inputs, outputs);
            }
          });
          rightClickMenu.add(groupItem);
          menuItemCount++;
        }
      }

      if (m_pasteBuffer != null && m_pasteBuffer.length() > 0) {
        rightClickMenu.addSeparator();
        menuItemCount++;

        MenuItem pasteItem = new MenuItem("Paste");
        pasteItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            // deserialize, integerate and
            // position at x, y

            pasteFromClipboard(x, y, m_pasteBuffer, true);
          }
        });
        rightClickMenu.add(pasteItem);
        menuItemCount++;
      }

      if (closestConnections.size() > 0) {
        rightClickMenu.addSeparator();
        menuItemCount++;

        MenuItem deleteConnection = new MenuItem("Delete Connection:");
        deleteConnection.setEnabled(false);
        rightClickMenu.insert(deleteConnection, menuItemCount);
        menuItemCount++;

        for (int i = 0; i < closestConnections.size(); i++) {
          final BeanConnection bc = closestConnections.elementAt(i);
          String connName = bc.getSourceEventSetDescriptor().getName();

          // JMenuItem deleteItem = new JMenuItem(connName);
          String targetName = "";
          if (bc.getTarget().getBean() instanceof BeanCommon) {
            targetName = ((BeanCommon) bc.getTarget().getBean())
              .getCustomName();
          } else {
            targetName = bc.getTarget().getBean().getClass().getName();
            targetName = targetName.substring(targetName.lastIndexOf('.') + 1,
              targetName.length());
          }
          MenuItem deleteItem = new MenuItem(connName + "-->" + targetName);
          deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              addUndoPoint();

              bc.remove(m_mainKFPerspective.getCurrentTabIndex());
              m_beanLayout.revalidate();
              m_beanLayout.repaint();
              m_mainKFPerspective.setEditedStatus(true);
              if (m_mainKFPerspective.getSelectedBeans().size() > 0) {
                m_mainKFPerspective.setSelectedBeans(new Vector<Object>());
              }
              notifyIsDirty();
            }
          });
          rightClickMenu.add(deleteItem);
          menuItemCount++;
        }
      }
    }

    if (menuItemCount > 0) {
      rightClickMenu.addSeparator();
      menuItemCount++;
    }

    MenuItem noteItem = new MenuItem("New note");
    noteItem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        Note n = new Note();
        m_toolBarBean = n;

        KnowledgeFlowApp.this.setCursor(Cursor
          .getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        m_mode = ADDING;
      }
    });
    rightClickMenu.add(noteItem);
    menuItemCount++;

    m_beanLayout.add(rightClickMenu);

    // make sure that popup location takes current scaling into account
    double z = m_layoutZoom / 100.0;
    double px = x * z;
    double py = y * z;
    rightClickMenu.show(m_beanLayout, (int) px, (int) py);
<<<<<<< HEAD
=======
=======
  /**
   * Handles adding a custom MetaBean to the user toolbar
   * 
   * @param bean the MetaBean
   * @param installListener install a listener for window close events so as to
   *          save the user components
   */
  private void addToUserToolBar(MetaBean bean, boolean installListener) {

    if (m_userToolBar == null) {
      // need to create the user tab and toolbar
      setUpUserToolBar();
    }

    // Disconnect any beans connected to the inputs or outputs
    // of this MetaBean (prevents serialization of the entire
    // KnowledgeFlow!!)
    Vector tempRemovedConnections = new Vector();
    Vector allConnections = BeanConnection.getConnections();
    Vector inputs = bean.getInputs();
    Vector outputs = bean.getOutputs();
    Vector allComps = bean.getSubFlow();

    for (int i = 0; i < inputs.size(); i++) {
      BeanInstance temp = (BeanInstance) inputs.elementAt(i);
      // is this input a target for some event?
      for (int j = 0; j < allConnections.size(); j++) {
        BeanConnection tempC = (BeanConnection) allConnections.elementAt(j);
        if (tempC.getTarget() == temp) {
          tempRemovedConnections.add(tempC);
        }

        // also check to see if this input is a source for
        // some target that is *not* in the subFlow
        if (tempC.getSource() == temp
            && !bean.subFlowContains(tempC.getTarget())) {
          tempRemovedConnections.add(tempC);
        }
      }
    }

    for (int i = 0; i < outputs.size(); i++) {
      BeanInstance temp = (BeanInstance) outputs.elementAt(i);
      // is this output a source for some target?
      for (int j = 0; j < allConnections.size(); j++) {
        BeanConnection tempC = (BeanConnection) allConnections.elementAt(j);
        if (tempC.getSource() == temp) {
          tempRemovedConnections.add(tempC);
        }
      }
    }

    for (int i = 0; i < tempRemovedConnections.size(); i++) {
      BeanConnection temp = (BeanConnection) tempRemovedConnections
          .elementAt(i);
      temp.remove();
    }

    // now add to user tool bar
    JPanel tempUser = instantiateToolBarMetaBean(bean);
    m_userBoxPanel.add(tempUser);
    if (installListener && m_firstUserComponentOpp) {
      try {
        installWindowListenerForSavingUserBeans();
        m_firstUserComponentOpp = false;
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    // Now reinstate any deleted connections to the original MetaBean
    for (int i = 0; i < tempRemovedConnections.size(); i++) {
      BeanConnection temp = (BeanConnection) tempRemovedConnections
          .elementAt(i);
      BeanConnection newC = new BeanConnection(temp.getSource(),
          temp.getTarget(), temp.getSourceEventSetDescriptor());
    }
  }

  /**
   * Popup a menu giving choices for connections to delete (if any)
   * 
   * @param closestConnections a vector containing 0 or more BeanConnections
   * @param x the x coordinate at which to popup the menu
   * @param y the y coordinate at which to popup the menu
   * 
   *          Modified by Zerbetto: javax.swing.JPopupMenu transformed into
   *          java.awt.PopupMenu
   */
  private void deleteConnectionPopup(Vector closestConnections, int x, int y) {
    if (closestConnections.size() > 0) {
      int menuItemCount = 0;

      // modifications by Zerbetto
      // JPopupMenu deleteConnectionMenu = new JPopupMenu();
      PopupMenu deleteConnectionMenu = new PopupMenu();

      // deleteConnectionMenu.insert(new JLabel("Delete Connection",
      // SwingConstants.CENTER),
      // menuItemCount);
      MenuItem deleteConnection = new MenuItem(
          Messages
              .getInstance()
              .getString(
                  "KnowledgeFlowApp_DeleteConnectionPopup_DeleteConnection_MenuItem_Text"));
      deleteConnection.setEnabled(false);
      deleteConnectionMenu.insert(deleteConnection, menuItemCount);
      menuItemCount++;

      for (int i = 0; i < closestConnections.size(); i++) {
        final BeanConnection bc = (BeanConnection) closestConnections
            .elementAt(i);
        String connName = bc.getSourceEventSetDescriptor().getName();

        // JMenuItem deleteItem = new JMenuItem(connName);
        String targetName = "";
        if (bc.getTarget().getBean() instanceof BeanCommon) {
          targetName = ((BeanCommon) bc.getTarget().getBean()).getCustomName();
        } else {
          targetName = bc.getTarget().getBean().getClass().getName();
          targetName = targetName.substring(targetName.lastIndexOf('.') + 1,
              targetName.length());
        }
        MenuItem deleteItem = new MenuItem(connName + "-->" + targetName);
        deleteItem.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bc.remove();
            m_beanLayout.revalidate();
            m_beanLayout.repaint();
            notifyIsDirty();
          }
        });
        deleteConnectionMenu.add(deleteItem);
        menuItemCount++;
      }

      // deleteConnectionMenu.show(m_beanLayout, x, y);
      m_beanLayout.add(deleteConnectionMenu);
      deleteConnectionMenu.show(m_beanLayout, x, y);
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Initiates the connection process for two beans
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param esd the EventSetDescriptor for the source bean
   * @param bi the source bean
   * @param x the x coordinate to start connecting from
   * @param y the y coordinate to start connecting from
   */
  private void connectComponents(EventSetDescriptor esd, BeanInstance bi,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int x, int y) {
    // unselect any selected beans on the canvas
    if (m_mainKFPerspective.getSelectedBeans(
      m_mainKFPerspective.getCurrentTabIndex()).size() > 0) {
      m_mainKFPerspective.setSelectedBeans(
        m_mainKFPerspective.getCurrentTabIndex(), new Vector<Object>());
    }

    // record the event set descriptior for this event
    m_sourceEventSetDescriptor = esd;

<<<<<<< HEAD
    Class<?> listenerClass = esd.getListenerType(); // class of the listener
=======
    Class<?> listenerClass = esd.getListenerType(); // class of the listener
=======
      int x, int y) {
    // record the event set descriptior for this event
    m_sourceEventSetDescriptor = esd;

    Class listenerClass = esd.getListenerType(); // class of the listener
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    JComponent source = (JComponent) bi.getBean();
    // now determine which (if any) of the other beans implement this
    // listener
    int targetCount = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Vector<Object> beanInstances = BeanInstance
      .getBeanInstances(m_mainKFPerspective.getCurrentTabIndex());
    for (int i = 0; i < beanInstances.size(); i++) {
      JComponent bean =
        (JComponent) ((BeanInstance) beanInstances.elementAt(i))
<<<<<<< HEAD
=======
=======
    Vector beanInstances = BeanInstance.getBeanInstances();
    for (int i = 0; i < beanInstances.size(); i++) {
      JComponent bean = (JComponent) ((BeanInstance) beanInstances.elementAt(i))
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          .getBean();
      boolean connectable = false;
      boolean canContinue = false;
      if (bean != source) {
        if (bean instanceof MetaBean) {
          if (((MetaBean) bean).canAcceptConnection(listenerClass)) {
            canContinue = true;
          }
        } else if (listenerClass.isInstance(bean) && bean != source) {
          canContinue = true;
        }
      }
      if (canContinue) {
        if (!(bean instanceof BeanCommon)) {
          connectable = true; // assume this bean is happy to receive a
                              // connection
        } else {
          // give this bean a chance to veto any proposed connection via
          // the listener interface
          if (((BeanCommon) bean).
<<<<<<< HEAD
            // connectionAllowed(esd.getName())) {
            connectionAllowed(esd)) {
=======
<<<<<<< HEAD
            // connectionAllowed(esd.getName())) {
            connectionAllowed(esd)) {
=======
          // connectionAllowed(esd.getName())) {
              connectionAllowed(esd)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            connectable = true;
          }
        }
        if (connectable) {
          if (bean instanceof Visible) {
            targetCount++;
            ((Visible) bean).getVisual().setDisplayConnectors(true);
          }
        }
      }
    }

    // have some possible beans to connect to?
    if (targetCount > 0) {
      // System.err.println("target count "+targetCount);
      if (source instanceof Visible) {
        ((Visible) source).getVisual().setDisplayConnectors(true);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        m_editElement = bi;
        Point closest = ((Visible) source).getVisual()
          .getClosestConnectorPoint(new Point(x, y));

        m_startX = (int) closest.getX();
        m_startY = (int) closest.getY();
        m_oldX = m_startX;
        m_oldY = m_startY;

        Graphics2D gx = (Graphics2D) m_beanLayout.getGraphics();
        gx.setXORMode(java.awt.Color.white);
        gx.drawLine(m_startX, m_startY, m_startX, m_startY);
        gx.dispose();
        m_mode = CONNECTING;
      }
    }

    revalidate();
    repaint();
    notifyIsDirty();
  }

  private void checkForDuplicateName(BeanInstance comp) {
    if (comp.getBean() instanceof BeanCommon) {
      String currentName = ((BeanCommon) comp.getBean()).getCustomName();
      if (currentName != null && currentName.length() > 0) {
        Vector<Object> layoutBeans = BeanInstance
          .getBeanInstances(m_mainKFPerspective.getCurrentTabIndex());

        boolean exactMatch = false;
        int maxCopyNum = 1;
        for (int i = 0; i < layoutBeans.size(); i++) {
          BeanInstance b = (BeanInstance) layoutBeans.get(i);
          if (b.getBean() instanceof BeanCommon) {
            String compName = ((BeanCommon) b.getBean()).getCustomName();
            if (currentName.equals(compName) && (b.getBean() != comp.getBean())) {
              exactMatch = true;
            } else {
              if (compName.startsWith(currentName)) {
                // see if the comparison bean has a number at the end
                String num = compName.replace(currentName, "");
                try {
                  int compNum = Integer.parseInt(num);
                  if (compNum > maxCopyNum) {
                    maxCopyNum = compNum;
                  }
                } catch (NumberFormatException e) {
                }
              }
            }
          }
        }

        if (exactMatch) {
          maxCopyNum++;
          currentName += "" + maxCopyNum;
          ((BeanCommon) comp.getBean()).setCustomName(currentName);
        }
      }
<<<<<<< HEAD
=======
=======
      }

      m_editElement = bi;
      Point closest = ((Visible) source).getVisual().getClosestConnectorPoint(
          new Point(x, y));

      m_startX = (int) closest.getX();
      m_startY = (int) closest.getY();
      m_oldX = m_startX;
      m_oldY = m_startY;

      Graphics2D gx = (Graphics2D) m_beanLayout.getGraphics();
      gx.setXORMode(java.awt.Color.white);
      gx.drawLine(m_startX, m_startY, m_startX, m_startY);
      gx.dispose();
      m_mode = CONNECTING;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  private void addComponent(BeanInstance comp, boolean repaint) {
    if (comp.getBean() instanceof Visible) {
      ((Visible) comp.getBean()).getVisual().addPropertyChangeListener(this);
    }
    if (comp.getBean() instanceof BeanCommon) {
      ((BeanCommon) comp.getBean()).setLog(m_logPanel);
    }
    if (comp.getBean() instanceof MetaBean) {
      // re-align sub-beans
<<<<<<< HEAD
      Vector<Object> list;
=======
<<<<<<< HEAD
      Vector<Object> list;
=======
      Vector list;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      list = ((MetaBean) comp.getBean()).getInputs();
      for (int i = 0; i < list.size(); i++) {
        ((BeanInstance) list.get(i)).setX(comp.getX());
        ((BeanInstance) list.get(i)).setY(comp.getY());
      }

      list = ((MetaBean) comp.getBean()).getOutputs();
      for (int i = 0; i < list.size(); i++) {
        ((BeanInstance) list.get(i)).setX(comp.getX());
        ((BeanInstance) list.get(i)).setY(comp.getY());
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (comp.getBean() instanceof EnvironmentHandler) {
      ((EnvironmentHandler) comp.getBean()).setEnvironment(m_flowEnvironment);
    }

    // check for a duplicate name
    checkForDuplicateName(comp);

    KnowledgeFlowApp.this.setCursor(Cursor
      .getPredefinedCursor(Cursor.DEFAULT_CURSOR));
<<<<<<< HEAD
=======
=======
    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (repaint) {
      m_beanLayout.repaint();
    }
    m_pointerB.setSelected(true);
    m_mode = NONE;
<<<<<<< HEAD

    m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
      m_mainKFPerspective.getCurrentTabIndex()).size() > 0);
=======
<<<<<<< HEAD

    m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
      m_mainKFPerspective.getCurrentTabIndex()).size() > 0);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  private void addComponent(int x, int y) {
    if (m_toolBarBean instanceof MetaBean) {
      // need to add the MetaBean's internal connections
      // to BeanConnection's vector
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Vector<BeanConnection> associatedConnections = ((MetaBean) m_toolBarBean)
        .getAssociatedConnections();
      BeanConnection.getConnections(m_mainKFPerspective.getCurrentTabIndex())
        .addAll(associatedConnections);

      // ((MetaBean)m_toolBarBean).setXDrop(x);
      // ((MetaBean)m_toolBarBean).setYDrop(y);
      ((MetaBean) m_toolBarBean)
        .addPropertyChangeListenersSubFlow(KnowledgeFlowApp.this);
<<<<<<< HEAD
=======
=======
      Vector associatedConnections = ((MetaBean) m_toolBarBean)
          .getAssociatedConnections();
      BeanConnection.getConnections().addAll(associatedConnections);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    if (m_toolBarBean instanceof BeanContextChild) {
      m_bcSupport.add(m_toolBarBean);
    }
<<<<<<< HEAD
    BeanInstance bi = new BeanInstance(m_beanLayout, m_toolBarBean, x, y,
      m_mainKFPerspective.getCurrentTabIndex());
=======
<<<<<<< HEAD
    BeanInstance bi = new BeanInstance(m_beanLayout, m_toolBarBean, x, y,
      m_mainKFPerspective.getCurrentTabIndex());
=======
    BeanInstance bi = new BeanInstance(m_beanLayout, m_toolBarBean, x, y);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // addBean((JComponent)bi.getBean());
    m_toolBarBean = null;
    addComponent(bi, true);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private void highlightSubFlow(int startX, int startY, int endX, int endY) {
    java.awt.Rectangle r = new java.awt.Rectangle((startX < endX) ? startX
      : endX, (startY < endY) ? startY : endY, Math.abs(startX - endX),
      Math.abs(startY - endY));
    // System.err.println(r);
    Vector<Object> selected = BeanInstance.findInstances(r,
      m_mainKFPerspective.getCurrentTabIndex());

    // show connector dots for selected beans
    /*
     * for (int i = 0; i < selected.size(); i++) { BeanInstance temp =
     * (BeanInstance)selected.elementAt(i); if (temp.getBean() instanceof
     * Visible) {
     * ((Visible)temp.getBean()).getVisual().setDisplayConnectors(true); } }
     */

    m_mainKFPerspective.setSelectedBeans(selected);
  }

  private void groupSubFlow(Vector<Object> selected, Vector<Object> inputs,
    Vector<Object> outputs) {

    int upperLeftX = Integer.MAX_VALUE;
    int upperLeftY = Integer.MAX_VALUE;
    int lowerRightX = Integer.MIN_VALUE;
    int lowerRightY = Integer.MIN_VALUE;
    for (int i = 0; i < selected.size(); i++) {
      BeanInstance b = (BeanInstance) selected.get(i);

      if (b.getX() < upperLeftX) {
        upperLeftX = b.getX();
      }

      if (b.getY() < upperLeftY) {
        upperLeftY = b.getY();
      }

      if (b.getX() > lowerRightX) {
        // ImageIcon ic = ((Visible)b.getBean()).getVisual().getStaticIcon();
        // lowerRightX = (b.getX() + ic.getIconWidth());
        lowerRightX = b.getX();
      }

      if (b.getY() > lowerRightY) {
        // ImageIcon ic = ((Visible)b.getBean()).getVisual().getStaticIcon();
        // lowerRightY = (b.getY() + ic.getIconHeight());
        lowerRightY = b.getY();
      }
    }

    int bx = upperLeftX + ((lowerRightX - upperLeftX) / 2);
    int by = upperLeftY + ((lowerRightY - upperLeftY) / 2);

    new java.awt.Rectangle(upperLeftX, upperLeftY, lowerRightX, lowerRightY);

    /*
     * BufferedImage subFlowPreview = null; try { subFlowPreview =
     * createImage(m_beanLayout, r); } catch (IOException ex) {
     * ex.printStackTrace(); // drop through quietly }
     */

    // Confirmation pop-up
    int result = JOptionPane.showConfirmDialog(KnowledgeFlowApp.this,
      "Group this sub-flow?", "Group Components", JOptionPane.YES_NO_OPTION);
    if (result == JOptionPane.YES_OPTION) {
      Vector<BeanConnection> associatedConnections = BeanConnection
        .associatedConnections(selected,
          m_mainKFPerspective.getCurrentTabIndex());

      String name = JOptionPane.showInputDialog(KnowledgeFlowApp.this,
        "Enter a name for this group", "MyGroup");
      if (name != null) {
        MetaBean group = new MetaBean();
        // group.setXCreate(bx); group.setYCreate(by);
        // group.setXDrop(bx); group.setYDrop(by);
<<<<<<< HEAD
=======
=======
  /**
   * Handles the checking of a selected set of components for suitability for
   * grouping. If suitable the user is prompted for a name and then a MetaBean
   * is used group the components.
   */
  private void checkSubFlow(int startX, int startY, int endX, int endY) {

    java.awt.Rectangle r = new java.awt.Rectangle((startX < endX) ? startX
        : endX, (startY < endY) ? startY : endY, Math.abs(startX - endX),
        Math.abs(startY - endY));
    // System.err.println(r);
    Vector selected = BeanInstance.findInstances(r);
    // System.err.println(r);
    // check if sub flow is valid
    Vector inputs = BeanConnection.inputs(selected);
    Vector outputs = BeanConnection.outputs(selected);

    // screen the inputs and outputs
    if (inputs.size() == 0 || outputs.size() == 0) {
      return;
    }

    // dissallow MetaBeans in the selected set (for the
    // time being).
    for (int i = 0; i < selected.size(); i++) {
      BeanInstance temp = (BeanInstance) selected.elementAt(i);
      if (temp.getBean() instanceof MetaBean) {
        return;
      }
    }

    // show connector dots for selected beans
    for (int i = 0; i < selected.size(); i++) {
      BeanInstance temp = (BeanInstance) selected.elementAt(i);
      if (temp.getBean() instanceof Visible) {
        ((Visible) temp.getBean()).getVisual().setDisplayConnectors(true);
      }
    }

    // show connector dots for input beans
    for (int i = 0; i < inputs.size(); i++) {
      BeanInstance temp = (BeanInstance) inputs.elementAt(i);
      if (temp.getBean() instanceof Visible) {
        ((Visible) temp.getBean()).getVisual().setDisplayConnectors(true,
            java.awt.Color.red);
      }
    }

    // show connector dots for output beans
    for (int i = 0; i < outputs.size(); i++) {
      BeanInstance temp = (BeanInstance) outputs.elementAt(i);
      if (temp.getBean() instanceof Visible) {
        ((Visible) temp.getBean()).getVisual().setDisplayConnectors(true,
            java.awt.Color.green);
      }
    }

    BufferedImage subFlowPreview = null;
    try {
      subFlowPreview = createImage(m_beanLayout, r);
    } catch (IOException ex) {
      ex.printStackTrace();
      // drop through quietly
    }

    // Confirmation pop-up
    int result = JOptionPane
        .showConfirmDialog(
            KnowledgeFlowApp.this,
            Messages
                .getInstance()
                .getString(
                    "KnowledgeFlowApp_CheckSubFlow_Result_JOptionPane_ShowConfirmDialog_Text_First"),
            Messages
                .getInstance()
                .getString(
                    "KnowledgeFlowApp_CheckSubFlow_Result_JOptionPane_ShowConfirmDialog_Text_Second"),
            JOptionPane.YES_NO_OPTION);
    if (result == JOptionPane.YES_OPTION) {
      Vector associatedConnections = BeanConnection
          .associatedConnections(selected);

      String name = JOptionPane
          .showInputDialog(
              KnowledgeFlowApp.this,
              Messages
                  .getInstance()
                  .getString(
                      "KnowledgeFlowApp_CheckSubFlow_Result_Name_ShowConfirmDialog_Text_First"),
              Messages
                  .getInstance()
                  .getString(
                      "KnowledgeFlowApp_CheckSubFlow_Result_Name_ShowConfirmDialog_Text_Second"));
      if (name != null) {
        MetaBean group = new MetaBean();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        group.setSubFlow(selected);
        group.setAssociatedConnections(associatedConnections);
        group.setInputs(inputs);
        group.setOutputs(outputs);
<<<<<<< HEAD
        // group.setSubFlowPreview(new ImageIcon(subFlowPreview));
=======
<<<<<<< HEAD
        // group.setSubFlowPreview(new ImageIcon(subFlowPreview));
=======
        group.setSubFlowPreview(new ImageIcon(subFlowPreview));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (name.length() > 0) {
          // group.getVisual().setText(name);
          group.setCustomName(name);
        }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // if (group instanceof BeanContextChild) {
        // m_bcSupport.add(group);
        // }

        // int bx = (int)r.getCenterX() -
        // group.getVisual().m_icon.getIconWidth();
        // int by = (int)r.getCenterY() -
        // group.getVisual().m_icon.getIconHeight();

        /*
         * BeanInstance bi = new BeanInstance(m_beanLayout, group,
         * (int)r.getX()+(int)(r.getWidth()/2),
         * (int)r.getY()+(int)(r.getHeight()/2),
         * m_mainKFPerspective.getCurrentTabIndex());
         */
        Dimension d = group.getPreferredSize();
        ;
        int dx = (int) (d.getWidth() / 2);
        int dy = (int) (d.getHeight() / 2);

        BeanInstance bi = new BeanInstance(m_beanLayout, group, bx + dx, by
          + dy, m_mainKFPerspective.getCurrentTabIndex());

        for (int i = 0; i < selected.size(); i++) {
          BeanInstance temp = (BeanInstance) selected.elementAt(i);
          temp.removeBean(m_beanLayout,
            m_mainKFPerspective.getCurrentTabIndex());
          if (temp.getBean() instanceof Visible) {
            ((Visible) temp.getBean()).getVisual()
              .removePropertyChangeListener(this);
          }
        }
        for (int i = 0; i < associatedConnections.size(); i++) {
          BeanConnection temp = associatedConnections.elementAt(i);
<<<<<<< HEAD
=======
=======
        if (group instanceof BeanContextChild) {
          m_bcSupport.add(group);
        }
        BeanInstance bi = new BeanInstance(m_beanLayout, group, (int) r.getX()
            + (int) (r.getWidth() / 2), (int) r.getY()
            + (int) (r.getHeight() / 2));
        for (int i = 0; i < selected.size(); i++) {
          BeanInstance temp = (BeanInstance) selected.elementAt(i);
          temp.removeBean(m_beanLayout);
          if (temp.getBean() instanceof Visible) {
            ((Visible) temp.getBean()).getVisual()
                .removePropertyChangeListener(this);
          }
        }
        for (int i = 0; i < associatedConnections.size(); i++) {
          BeanConnection temp = (BeanConnection) associatedConnections
              .elementAt(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          temp.setHidden(true);
        }
        group.shiftBeans(bi, true);

        addComponent(bi, true);
      }
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    // hide connector dots
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < selected.size(); i++) {
      BeanInstance temp = (BeanInstance) selected.elementAt(i);
      if (temp.getBean() instanceof Visible) {
        ((Visible) temp.getBean()).getVisual().setDisplayConnectors(false);
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_mainKFPerspective.setSelectedBeans(new Vector<Object>());

    revalidate();
    notifyIsDirty();
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Accept property change events
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param e a <code>PropertyChangeEvent</code> value
   */
  @Override
<<<<<<< HEAD
=======
=======
   * 
   * @param e a <code>PropertyChangeEvent</code> value
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void propertyChange(PropertyChangeEvent e) {
    revalidate();
    m_beanLayout.repaint();
  }

  /**
   * Load a pre-saved layout
   */
  private void loadLayout() {
    m_loadB.setEnabled(false);
    m_saveB.setEnabled(false);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_playB.setEnabled(false);
    m_playBB.setEnabled(false);

    int returnVal = m_FileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      // stopFlow();
<<<<<<< HEAD
=======
=======
    int returnVal = m_FileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      stopFlow();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // determine filename
      File oFile = m_FileChooser.getSelectedFile();
      // set internal flow directory environment variable
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
      m_flowEnvironment.addVariable("Internal.knowledgeflow.directory",
          oFile.getParent());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // add extension if necessary
      if (m_FileChooser.getFileFilter() == m_KfFilter) {
        if (!oFile.getName().toLowerCase().endsWith(FILE_EXTENSION)) {
          oFile = new File(oFile.getParent(), oFile.getName() + FILE_EXTENSION);
        }
      } else if (m_FileChooser.getFileFilter() == m_KOMLFilter) {
        if (!oFile.getName().toLowerCase().endsWith(KOML.FILE_EXTENSION + "kf")) {
          oFile = new File(oFile.getParent(), oFile.getName()
<<<<<<< HEAD
            + KOML.FILE_EXTENSION + "kf");
=======
<<<<<<< HEAD
            + KOML.FILE_EXTENSION + "kf");
=======
              + KOML.FILE_EXTENSION + "kf");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      } else if (m_FileChooser.getFileFilter() == m_XMLFilter) {
        if (!oFile.getName().toLowerCase().endsWith(FILE_EXTENSION_XML)) {
          oFile = new File(oFile.getParent(), oFile.getName()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            + FILE_EXTENSION_XML);
        }
      } else if (m_FileChooser.getFileFilter() == m_XStreamFilter) {
        if (!oFile.getName().toLowerCase()
          .endsWith(XStream.FILE_EXTENSION + "kf")) {
          oFile = new File(oFile.getParent(), oFile.getName()
            + XStream.FILE_EXTENSION + "kf");
        }
      }

      String flowName = oFile.getName();
      if (flowName.lastIndexOf('.') > 0) {
        flowName = flowName.substring(0, flowName.lastIndexOf('.'));
      }

      loadLayout(oFile, getAllowMultipleTabs());
    }
    m_loadB.setEnabled(true);
    m_playB.setEnabled(true);
    m_playBB.setEnabled(true);
    m_saveB.setEnabled(true);
  }

  /**
   * Load a layout from a file. Supports loading binary and XML serialized flow
   * files
   *
   * @param oFile the file to load from
   * @param newTab true if the loaded layout should be displayed in a new tab
   */
  public void loadLayout(File oFile, boolean newTab) {
    loadLayout(oFile, newTab, false);
  }

  /**
   * Load a layout from a file
   *
   * @param oFile the file to load from
   * @param newTab true if the loaded layout should be displayed in a new tab
   * @param isUndo is this file an "undo" file?
   */
  @SuppressWarnings("unchecked")
  protected void loadLayout(File oFile, boolean newTab, boolean isUndo) {

    // stop any running flow first (if we are loading into this tab)
    if (!newTab) {
      stopFlow();
    }

    m_loadB.setEnabled(false);
    m_saveB.setEnabled(false);
    m_playB.setEnabled(false);
    m_playBB.setEnabled(false);

    if (newTab) {
      String flowName = oFile.getName();
      if (flowName.lastIndexOf('.') > 0) {
        flowName = flowName.substring(0, flowName.lastIndexOf('.'));
      }
      m_mainKFPerspective.addTab(flowName);
      // m_mainKFPerspective.setActiveTab(m_mainKFPerspective.getNumTabs() - 1);
      m_mainKFPerspective.setFlowFile(oFile);
      m_mainKFPerspective.setEditedStatus(false);
    }

    if (!isUndo) {
      File absolute = new File(oFile.getAbsolutePath());
      // m_flowEnvironment.addVariable("Internal.knowledgeflow.directory",
      // absolute.getParent());
      m_mainKFPerspective.getEnvironmentSettings().addVariable(
        "Internal.knowledgeflow.directory", absolute.getParent());
    }

    try {
      Vector<Object> beans = new Vector<Object>();
      Vector<BeanConnection> connections = new Vector<BeanConnection>();

      // KOML?
      if ((KOML.isPresent())
        && (oFile.getAbsolutePath().toLowerCase().endsWith(KOML.FILE_EXTENSION
          + "kf"))) {
        Vector<Vector<?>> v = (Vector<Vector<?>>) KOML.read(oFile
          .getAbsolutePath());
        beans = (Vector<Object>) v.get(XMLBeans.INDEX_BEANINSTANCES);
        connections = (Vector<BeanConnection>) v
          .get(XMLBeans.INDEX_BEANCONNECTIONS);
      } /* XStream */else if ((XStream.isPresent())
        && (oFile.getAbsolutePath().toLowerCase()
          .endsWith(XStream.FILE_EXTENSION + "kf"))) {
        Vector<Vector<?>> v = (Vector<Vector<?>>) XStream.read(oFile
          .getAbsolutePath());
        beans = (Vector<Object>) v.get(XMLBeans.INDEX_BEANINSTANCES);
        connections = (Vector<BeanConnection>) v
          .get(XMLBeans.INDEX_BEANCONNECTIONS);
      } /* XML? */else if (oFile.getAbsolutePath().toLowerCase()
        .endsWith(FILE_EXTENSION_XML)) {
        XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
          m_mainKFPerspective.getCurrentTabIndex());
        Vector<Vector<?>> v = (Vector<Vector<?>>) xml.read(oFile);
        beans = (Vector<Object>) v.get(XMLBeans.INDEX_BEANINSTANCES);
        connections = (Vector<BeanConnection>) v
          .get(XMLBeans.INDEX_BEANCONNECTIONS);
        // connections = new Vector();
      } /* binary */else {
        InputStream is = new FileInputStream(oFile);
        ObjectInputStream ois = new ObjectInputStream(is);
        beans = (Vector<Object>) ois.readObject();
        connections = (Vector<BeanConnection>) ois.readObject();
        ois.close();
      }

      integrateFlow(beans, connections, true, false);
      setEnvironment();
      if (newTab) {
        m_logPanel.clearStatus();
        m_logPanel.statusMessage("@!@[KnowledgeFlow]|Flow loaded.");
      }
    } catch (Exception ex) {
      m_logPanel
        .statusMessage("@!@[KnowledgeFlow]|Unable to load flow (see log).");
      m_logPanel.logMessage("[KnowledgeFlow] Unable to load flow ("
        + ex.getMessage() + ").");
      ex.printStackTrace();
    }
    m_loadB.setEnabled(true);
    m_saveB.setEnabled(true);
    m_playB.setEnabled(true);
    m_playBB.setEnabled(true);
  }

  /**
   * Load a flow file from an input stream. Only supports XML serialized flows.
   *
   * @param is the input stream to laod from
   * @param newTab whether to open a new tab in the UI for the flow
   * @param flowName the name of the flow
   * @throws Exception if a problem occurs during de-serialization
   */
  public void loadLayout(InputStream is, boolean newTab, String flowName)
    throws Exception {
    InputStreamReader isr = new InputStreamReader(is);
    loadLayout(isr, newTab, flowName);
  }

  /**
   * Load a flow file from a reader. Only supports XML serialized flows.
   *
   * @param reader the reader to load from
   * @param newTab whether to open a new tab in the UI for the flow
   * @param flowName the name of the flow
   * @throws Exception if a problem occurs during de-serialization
   */
  @SuppressWarnings("unchecked")
  public void loadLayout(Reader reader, boolean newTab, String flowName)
    throws Exception {

    // stop any running flow first (if we are loading into this tab)
    if (!newTab) {
      stopFlow();
    }

    m_loadB.setEnabled(false);
    m_saveB.setEnabled(false);
    m_playB.setEnabled(false);
    m_playBB.setEnabled(false);

    if (newTab) {
      m_mainKFPerspective.addTab(flowName);
      m_mainKFPerspective.setEditedStatus(false);
    }

    XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
      m_mainKFPerspective.getCurrentTabIndex());
    Vector<Vector<?>> v = (Vector<Vector<?>>) xml.read(reader);
    Vector<Object> beans = (Vector<Object>) v.get(XMLBeans.INDEX_BEANINSTANCES);
    Vector<BeanConnection> connections = (Vector<BeanConnection>) v
      .get(XMLBeans.INDEX_BEANCONNECTIONS);

    integrateFlow(beans, connections, true, false);
    setEnvironment();
    if (newTab) {
      m_logPanel.clearStatus();
      m_logPanel.statusMessage("@!@[KnowledgeFlow]|Flow loaded.");
    }

    m_loadB.setEnabled(true);
    m_saveB.setEnabled(true);
    m_playB.setEnabled(true);
    m_playBB.setEnabled(true);
  }

  // Link the supplied beans into the KnowledgeFlow gui
  protected void integrateFlow(Vector<Object> beans,
    Vector<BeanConnection> connections, boolean replace,
    boolean notReplaceAndSourcedFromBinary) {
<<<<<<< HEAD
=======
=======
              + FILE_EXTENSION_XML);
        }
      } else if (m_FileChooser.getFileFilter() == m_XStreamFilter) {
        if (!oFile.getName().toLowerCase()
            .endsWith(XStream.FILE_EXTENSION + "kf")) {
          oFile = new File(oFile.getParent(), oFile.getName()
              + XStream.FILE_EXTENSION + "kf");
        }
      }

      try {
        Vector beans = new Vector();
        Vector connections = new Vector();

        // KOML?
        if ((KOML.isPresent())
            && (oFile.getAbsolutePath().toLowerCase()
                .endsWith(KOML.FILE_EXTENSION + "kf"))) {
          Vector v = (Vector) KOML.read(oFile.getAbsolutePath());
          beans = (Vector) v.get(XMLBeans.INDEX_BEANINSTANCES);
          connections = (Vector) v.get(XMLBeans.INDEX_BEANCONNECTIONS);
        } /* XStream */else if ((XStream.isPresent())
            && (oFile.getAbsolutePath().toLowerCase()
                .endsWith(XStream.FILE_EXTENSION + "kf"))) {
          Vector v = (Vector) XStream.read(oFile.getAbsolutePath());
          beans = (Vector) v.get(XMLBeans.INDEX_BEANINSTANCES);
          connections = (Vector) v.get(XMLBeans.INDEX_BEANCONNECTIONS);
        } /* XML? */else if (oFile.getAbsolutePath().toLowerCase()
            .endsWith(FILE_EXTENSION_XML)) {
          XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport);
          Vector v = (Vector) xml.read(oFile);
          beans = (Vector) v.get(XMLBeans.INDEX_BEANINSTANCES);
          connections = (Vector) v.get(XMLBeans.INDEX_BEANCONNECTIONS);
          // connections = new Vector();
        } /* binary */else {
          InputStream is = new FileInputStream(oFile);
          ObjectInputStream ois = new ObjectInputStream(is);
          beans = (Vector) ois.readObject();
          connections = (Vector) ois.readObject();
          ois.close();
        }

        integrateFlow(beans, connections);
        setEnvironment();
        m_logPanel.clearStatus();
        m_logPanel.statusMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_LoadLayout_StatusMessage_Text_First"));
      } catch (Exception ex) {
        m_logPanel.statusMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_LoadLayout_StatusMessage_Text_Second"));
        m_logPanel.logMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_LoadLayout_LogMessage_Text_First")
            + ex.getMessage()
            + Messages.getInstance().getString(
                "KnowledgeFlowApp_LoadLayout_LogMessage_Text_Second"));
        ex.printStackTrace();
      }
    }
    m_loadB.setEnabled(true);
    m_saveB.setEnabled(true);
  }

  // Link the supplied beans into the KnowledgeFlow gui
  private void integrateFlow(Vector beans, Vector connections) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    java.awt.Color bckC = getBackground();
    m_bcSupport = new BeanContextSupport();
    m_bcSupport.setDesignTime(true);

    // register this panel as a property change listener with each
    // bean
    for (int i = 0; i < beans.size(); i++) {
      BeanInstance tempB = (BeanInstance) beans.elementAt(i);
      if (tempB.getBean() instanceof Visible) {
        ((Visible) (tempB.getBean())).getVisual().addPropertyChangeListener(
<<<<<<< HEAD
          this);
=======
<<<<<<< HEAD
          this);
=======
            this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

        // A workaround to account for JPanel's with their default
        // background colour not being serializable in Apple's JRE
        ((Visible) (tempB.getBean())).getVisual().setBackground(bckC);
        ((JComponent) (tempB.getBean())).setBackground(bckC);
      }
      if (tempB.getBean() instanceof BeanCommon) {
        ((BeanCommon) (tempB.getBean())).setLog(m_logPanel);
      }
      if (tempB.getBean() instanceof BeanContextChild) {
        m_bcSupport.add(tempB.getBean());
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (replace) {
      BeanInstance.setBeanInstances(beans, m_beanLayout,
        m_mainKFPerspective.getCurrentTabIndex());
      BeanConnection.setConnections(connections,
        m_mainKFPerspective.getCurrentTabIndex());
    } else if (notReplaceAndSourcedFromBinary) {
      BeanInstance.appendBeans(m_beanLayout, beans,
        m_mainKFPerspective.getCurrentTabIndex());
      BeanConnection.appendConnections(connections,
        m_mainKFPerspective.getCurrentTabIndex());
    }
    revalidate();
    m_beanLayout.revalidate();
    m_beanLayout.repaint();
    notifyIsDirty();

    m_selectAllB.setEnabled(BeanInstance.getBeanInstances(
      m_mainKFPerspective.getCurrentTabIndex()).size() > 0);
<<<<<<< HEAD
=======
=======
    BeanInstance.setBeanInstances(beans, m_beanLayout);
    BeanConnection.setConnections(connections);
    m_beanLayout.revalidate();
    m_beanLayout.repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Set the flow for the KnowledgeFlow to edit. Assumes that client has loaded
   * a Vector of beans and a Vector of connections. the supplied beans and
   * connections are deep-copied via serialization before being set in the
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * layout. The beans get added to the flow at position 0.
   *
   * @param v a Vector containing a Vector of beans and a Vector of connections
   * @exception Exception if something goes wrong
   */
  @SuppressWarnings("unchecked")
  public void setFlow(Vector<Vector<?>> v) throws Exception {
    // Vector beansCopy = null, connectionsCopy = null;
    // clearLayout();
    if (getAllowMultipleTabs()) {
      throw new Exception("[KnowledgeFlow] setFlow() - can only set a flow in "
        + "singe tab only mode");
    }

    /*
     * int tabI = 0;
     *
     * BeanInstance.
     * removeAllBeansFromContainer((JComponent)m_mainKFPerspective.
     * getBeanLayout(tabI), tabI); BeanInstance.setBeanInstances(new Vector(),
     * m_mainKFPerspective.getBeanLayout(tabI));
     * BeanConnection.setConnections(new Vector());
     */
    // m_mainKFPerspective.removeTab(0);
    // m_mainKFPerspective.addTab("Untitled");
    m_beanLayout.removeAll();
    BeanInstance.init();
    BeanConnection.init();

    SerializedObject so = new SerializedObject(v);
    Vector<Vector<?>> copy = (Vector<Vector<?>>) so.getObject();

    Vector<Object> beans = (Vector<Object>) copy.elementAt(0);
    Vector<BeanConnection> connections = (Vector<BeanConnection>) copy
      .elementAt(1);

    // reset environment variables
    m_flowEnvironment = new Environment();
    integrateFlow(beans, connections, true, false);
    revalidate();
    notifyIsDirty();
<<<<<<< HEAD
=======
=======
   * layout.
   * 
   * @param v a Vector containing a Vector of beans and a Vector of connections
   * @exception Exception if something goes wrong
   */
  public void setFlow(Vector v) throws Exception {
    // Vector beansCopy = null, connectionsCopy = null;
    clearLayout();
    SerializedObject so = new SerializedObject(v);
    Vector copy = (Vector) so.getObject();

    Vector beans = (Vector) copy.elementAt(0);
    Vector connections = (Vector) copy.elementAt(1);

    // reset environment variables
    m_flowEnvironment = new Environment();
    integrateFlow(beans, connections);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the current flow being edited. The flow is returned as a single Vector
   * containing two other Vectors: the beans and the connections. These two
   * vectors are deep-copied via serialization before being returned.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return the current flow being edited
   * @throws Exception if a problem occurs
   */
  public Vector<Vector<?>> getFlow() throws Exception {
    Vector<Vector<?>> v = new Vector<Vector<?>>();
    Vector<Object> beans = BeanInstance.getBeanInstances(m_mainKFPerspective
      .getCurrentTabIndex());
    Vector<BeanConnection> connections = BeanConnection
      .getConnections(m_mainKFPerspective.getCurrentTabIndex());
<<<<<<< HEAD
=======
=======
   * 
   * @return the current flow being edited
   */
  public Vector getFlow() throws Exception {
    Vector v = new Vector();
    Vector beans = BeanInstance.getBeanInstances();
    Vector connections = BeanConnection.getConnections();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    detachFromLayout(beans);
    v.add(beans);
    v.add(connections);

    SerializedObject so = new SerializedObject(v);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @SuppressWarnings("unchecked")
    Vector<Vector<?>> copy = (Vector<Vector<?>>) so.getObject();

    // tempWrite(beans, connections);

    integrateFlow(beans, connections, true, false);
<<<<<<< HEAD
=======
=======
    Vector copy = (Vector) so.getObject();

    // tempWrite(beans, connections);

    integrateFlow(beans, connections);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return copy;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the current flow being edited in XML format.
   *
   * @return the current flow as an XML string
   * @throws Exception if a problem occurs
   */
  public String getFlowXML() throws Exception {
    Vector<Object> beans = BeanInstance.getBeanInstances(m_mainKFPerspective
      .getCurrentTabIndex());

    StringBuffer buff = copyToBuffer(beans);

    return buff.toString();
  }

  /**
   * Utility method to create an image of a region of the given component
   *
<<<<<<< HEAD
=======
=======
   * Utility method to create an image of a region of the given component
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param component the component to create an image of
   * @param region the region of the component to put into the image
   * @return the image
   * @throws IOException
   */
  protected static BufferedImage createImage(JComponent component,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Rectangle region) throws IOException {
    boolean opaqueValue = component.isOpaque();
    component.setOpaque(true);
    BufferedImage image = new BufferedImage(region.width, region.height,
      BufferedImage.TYPE_INT_RGB);
<<<<<<< HEAD
=======
=======
      Rectangle region) throws IOException {
    boolean opaqueValue = component.isOpaque();
    component.setOpaque(true);
    BufferedImage image = new BufferedImage(region.width, region.height,
        BufferedImage.TYPE_INT_RGB);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Graphics2D g2d = image.createGraphics();
    g2d.translate(-region.getX(), -region.getY());
    // g2d.setClip( region );
    component.paint(g2d);
    g2d.dispose();
    component.setOpaque(opaqueValue);

    return image;
  }

  // Remove this panel as a property changle listener from
  // each bean
<<<<<<< HEAD
  private void detachFromLayout(Vector<Object> beans) {
=======
<<<<<<< HEAD
  private void detachFromLayout(Vector<Object> beans) {
=======
  private void detachFromLayout(Vector beans) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < beans.size(); i++) {
      BeanInstance tempB = (BeanInstance) beans.elementAt(i);
      if (tempB.getBean() instanceof Visible) {
        ((Visible) (tempB.getBean())).getVisual().removePropertyChangeListener(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          this);

        if (tempB.getBean() instanceof MetaBean) {
          ((MetaBean) tempB.getBean())
            .removePropertyChangeListenersSubFlow(this);
<<<<<<< HEAD
=======
=======
            this);

        if (tempB.getBean() instanceof MetaBean) {
          ((MetaBean) tempB.getBean())
              .removePropertyChangeListenersSubFlow(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }

        // A workaround to account for JPanel's with their default
        // background colour not being serializable in Apple's JRE.
        // JComponents are rendered with a funky stripy background
        // under OS X using java.awt.TexturePaint - unfortunately
        // TexturePaint doesn't implement Serializable.
        ((Visible) (tempB.getBean())).getVisual().setBackground(
<<<<<<< HEAD
          java.awt.Color.white);
=======
<<<<<<< HEAD
          java.awt.Color.white);
=======
            java.awt.Color.white);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        ((JComponent) (tempB.getBean())).setBackground(java.awt.Color.white);
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void saveLayout(File toFile, int tabIndex) {
    saveLayout(toFile, tabIndex, false);
  }

  protected boolean saveLayout(File sFile, int tabIndex, boolean isUndoPoint) {
    java.awt.Color bckC = getBackground();

    Vector<Object> beans = BeanInstance.getBeanInstances(tabIndex);
    detachFromLayout(beans);
    detachFromLayout(beans);

    // now serialize components vector and connections vector
    try {
      // KOML?
      if ((KOML.isPresent())
        && (sFile.getAbsolutePath().toLowerCase().endsWith(KOML.FILE_EXTENSION
          + "kf"))) {
        Vector<Vector<?>> v = new Vector<Vector<?>>();
        v.setSize(2);
        v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
        v.set(XMLBeans.INDEX_BEANCONNECTIONS,
          BeanConnection.getConnections(tabIndex));
        KOML.write(sFile.getAbsolutePath(), v);
      } /* XStream */else if ((XStream.isPresent())
        && (sFile.getAbsolutePath().toLowerCase()
          .endsWith(XStream.FILE_EXTENSION + "kf"))) {
        Vector<Vector<?>> v = new Vector<Vector<?>>();
        v.setSize(2);
        v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
        v.set(XMLBeans.INDEX_BEANCONNECTIONS,
          BeanConnection.getConnections(tabIndex));
        XStream.write(sFile.getAbsolutePath(), v);
      } /* XML? */else if (sFile.getAbsolutePath().toLowerCase()
        .endsWith(FILE_EXTENSION_XML)) {
        Vector<Vector<?>> v = new Vector<Vector<?>>();
        v.setSize(2);
        v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
        v.set(XMLBeans.INDEX_BEANCONNECTIONS,
          BeanConnection.getConnections(tabIndex));
        XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport, tabIndex);
        // XML flows are tagged as encoded with UTF-8
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream(sFile), "UTF-8"));
        xml.write(br, v);
      } /* binary */else {
        OutputStream os = new FileOutputStream(sFile);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(beans);
        oos.writeObject(BeanConnection.getConnections(tabIndex));
        oos.flush();
        oos.close();
      }
    } catch (Exception ex) {
      m_logPanel
        .statusMessage("@!@[KnowledgeFlow]|Unable to save flow (see log).");
      m_logPanel.logMessage("[KnowledgeFlow] Unable to save flow ("
        + ex.getMessage() + ").");
      ex.printStackTrace();
      return false;
    } finally {
      // restore this panel as a property change listener in the beans
      for (int i = 0; i < beans.size(); i++) {
        BeanInstance tempB = (BeanInstance) beans.elementAt(i);
        if (tempB.getBean() instanceof Visible) {
          ((Visible) (tempB.getBean())).getVisual().addPropertyChangeListener(
            this);

          if (tempB.getBean() instanceof MetaBean) {
            ((MetaBean) tempB.getBean())
              .addPropertyChangeListenersSubFlow(this);
          }
          // Restore the default background colour
          ((Visible) (tempB.getBean())).getVisual().setBackground(bckC);
          ((JComponent) (tempB.getBean())).setBackground(bckC);
        }
      }

      if (!isUndoPoint) {
        Environment e = m_mainKFPerspective.getEnvironmentSettings(tabIndex);

        e.addVariable("Internal.knowledgeflow.directory",
          new File(sFile.getAbsolutePath()).getParent());
        m_mainKFPerspective.setEditedStatus(tabIndex, false);
        String tabTitle = sFile.getName();
        tabTitle = tabTitle.substring(0, tabTitle.lastIndexOf('.'));
        m_mainKFPerspective.setTabTitle(tabIndex, tabTitle);
      }
    }
    return true;
  }

  /**
   * Serialize the layout to a file
   */
  private void saveLayout(int tabIndex, boolean showDialog) {
    getBackground();

    File sFile = m_mainKFPerspective.getFlowFile(tabIndex);
    int returnVal = JFileChooser.APPROVE_OPTION;
    boolean shownDialog = false;

    if (showDialog || sFile.getName().equals("-NONE-")) {
      returnVal = m_FileChooser.showSaveDialog(this);
      shownDialog = true;
    }

<<<<<<< HEAD
=======
=======
  /**
   * Serialize the layout to a file
   */
  private void saveLayout() {
    // m_loadB.setEnabled(false);
    // m_saveB.setEnabled(false);
    int returnVal = m_FileChooser.showSaveDialog(this);
    java.awt.Color bckC = getBackground();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      // temporarily remove this panel as a property changle listener from
      // each bean

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Vector<Object> beans = BeanInstance.getBeanInstances(tabIndex);
      detachFromLayout(beans);

      // determine filename (if necessary)
      if (shownDialog) {
        sFile = m_FileChooser.getSelectedFile();
      }
<<<<<<< HEAD
=======
=======
      Vector beans = BeanInstance.getBeanInstances();
      detachFromLayout(beans);

      // determine filename
      File sFile = m_FileChooser.getSelectedFile();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // add extension if necessary
      if (m_FileChooser.getFileFilter() == m_KfFilter) {
        if (!sFile.getName().toLowerCase().endsWith(FILE_EXTENSION)) {
          sFile = new File(sFile.getParent(), sFile.getName() + FILE_EXTENSION);
        }
      } else if (m_FileChooser.getFileFilter() == m_KOMLFilter) {
        if (!sFile.getName().toLowerCase().endsWith(KOML.FILE_EXTENSION + "kf")) {
          sFile = new File(sFile.getParent(), sFile.getName()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            + KOML.FILE_EXTENSION + "kf");
        }
      } else if (m_FileChooser.getFileFilter() == m_XStreamFilter) {
        if (!sFile.getName().toLowerCase()
          .endsWith(XStream.FILE_EXTENSION + "kf")) {
          sFile = new File(sFile.getParent(), sFile.getName()
            + XStream.FILE_EXTENSION + "kf");
<<<<<<< HEAD
=======
=======
              + KOML.FILE_EXTENSION + "kf");
        }
      } else if (m_FileChooser.getFileFilter() == m_XStreamFilter) {
        if (!sFile.getName().toLowerCase()
            .endsWith(XStream.FILE_EXTENSION + "kf")) {
          sFile = new File(sFile.getParent(), sFile.getName()
              + XStream.FILE_EXTENSION + "kf");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      } else if (m_FileChooser.getFileFilter() == m_XMLFilter) {
        if (!sFile.getName().toLowerCase().endsWith(FILE_EXTENSION_XML)) {
          sFile = new File(sFile.getParent(), sFile.getName()
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            + FILE_EXTENSION_XML);
        }
      }

      saveLayout(sFile, m_mainKFPerspective.getCurrentTabIndex(), false);
      m_mainKFPerspective.setFlowFile(tabIndex, sFile);
    }
<<<<<<< HEAD
=======
=======
              + FILE_EXTENSION_XML);
        }
      }

      // now serialize components vector and connections vector
      try {
        // KOML?
        if ((KOML.isPresent())
            && (sFile.getAbsolutePath().toLowerCase()
                .endsWith(KOML.FILE_EXTENSION + "kf"))) {
          Vector v = new Vector();
          v.setSize(2);
          v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
          v.set(XMLBeans.INDEX_BEANCONNECTIONS, BeanConnection.getConnections());
          KOML.write(sFile.getAbsolutePath(), v);
        } /* XStream */else if ((XStream.isPresent())
            && (sFile.getAbsolutePath().toLowerCase()
                .endsWith(XStream.FILE_EXTENSION + "kf"))) {
          Vector v = new Vector();
          v.setSize(2);
          v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
          v.set(XMLBeans.INDEX_BEANCONNECTIONS, BeanConnection.getConnections());
          XStream.write(sFile.getAbsolutePath(), v);
        } /* XML? */else if (sFile.getAbsolutePath().toLowerCase()
            .endsWith(FILE_EXTENSION_XML)) {
          Vector v = new Vector();
          v.setSize(2);
          v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
          v.set(XMLBeans.INDEX_BEANCONNECTIONS, BeanConnection.getConnections());
          XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport);
          // XML flows are tagged as encoded with UTF-8
          BufferedWriter br = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(sFile), "UTF-8"));
          xml.write(br, v);
        } /* binary */else {
          OutputStream os = new FileOutputStream(sFile);
          ObjectOutputStream oos = new ObjectOutputStream(os);
          oos.writeObject(beans);
          oos.writeObject(BeanConnection.getConnections());
          oos.flush();
          oos.close();
        }
        m_logPanel.statusMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_SaveLayout_StatusMessage_Text_First"));

        // set the internal knowledgeflow directory environment var for this
        // flow
        m_flowEnvironment.addVariable("Internal.knowledgeflow.directory",
            sFile.getParent());
        setEnvironment();
      } catch (Exception ex) {
        m_logPanel.statusMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_SaveLayout_StatusMessage_Text_Second"));
        m_logPanel.logMessage(Messages.getInstance().getString(
            "KnowledgeFlowApp_SaveLayout_LogMessage_Text_First")
            + ex.getMessage()
            + Messages.getInstance().getString(
                "KnowledgeFlowApp_SaveLayout_LogMessage_Text_Second"));
        ex.printStackTrace();
      } finally {
        // restore this panel as a property change listener in the beans
        for (int i = 0; i < beans.size(); i++) {
          BeanInstance tempB = (BeanInstance) beans.elementAt(i);
          if (tempB.getBean() instanceof Visible) {
            ((Visible) (tempB.getBean())).getVisual()
                .addPropertyChangeListener(this);

            if (tempB.getBean() instanceof MetaBean) {
              ((MetaBean) tempB.getBean())
                  .addPropertyChangeListenersSubFlow(this);
            }
            // Restore the default background colour
            ((Visible) (tempB.getBean())).getVisual().setBackground(bckC);
            ((JComponent) (tempB.getBean())).setBackground(bckC);
          }
        }
      }
    }
    // m_saveB.setEnabled(true);
    // m_loadB.setEnabled(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Save the knowledge flow into the OutputStream passed at input. Only
   * supports saving the layout data (no trained models) to XML.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @param out the output stream to save the layout in
   */
  public void saveLayout(OutputStream out, int tabIndex) {
    // temporarily remove this panel as a property changle listener from
    // each bean
    Vector<Object> beans = BeanInstance.getBeanInstances(tabIndex);
<<<<<<< HEAD
=======
=======
   * 
   * @param out the output stream to save the layout in
   */
  public void saveLayout(OutputStream out) {
    // temporarily remove this panel as a property changle listener from
    // each bean
    Vector beans = BeanInstance.getBeanInstances();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    for (int i = 0; i < beans.size(); i++) {
      BeanInstance tempB = (BeanInstance) beans.elementAt(i);

      if (tempB.getBean() instanceof Visible) {
        ((Visible) (tempB.getBean())).getVisual().removePropertyChangeListener(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          this);

        if (tempB.getBean() instanceof MetaBean) {
          ((MetaBean) tempB.getBean())
            .removePropertyChangeListenersSubFlow(this);
<<<<<<< HEAD
=======
=======
            this);

        if (tempB.getBean() instanceof MetaBean) {
          ((MetaBean) tempB.getBean())
              .removePropertyChangeListenersSubFlow(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }

    // now serialize components vector and connections vector
    try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Vector<Vector<?>> v = new Vector<Vector<?>>();
      v.setSize(2);
      v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
      v.set(XMLBeans.INDEX_BEANCONNECTIONS,
        BeanConnection.getConnections(tabIndex));

      XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport, tabIndex);
<<<<<<< HEAD
=======
=======
      Vector v = new Vector();
      v.setSize(2);
      v.set(XMLBeans.INDEX_BEANINSTANCES, beans);
      v.set(XMLBeans.INDEX_BEANCONNECTIONS, BeanConnection.getConnections());

      XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      xml.write(out, v);
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      // restore this panel as a property change listener in the beans
      for (int i = 0; i < beans.size(); i++) {
        BeanInstance tempB = (BeanInstance) beans.elementAt(i);

        if (tempB.getBean() instanceof Visible) {
          ((Visible) (tempB.getBean())).getVisual().addPropertyChangeListener(
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            this);

          if (tempB.getBean() instanceof MetaBean) {
            ((MetaBean) tempB.getBean())
              .addPropertyChangeListenersSubFlow(this);
<<<<<<< HEAD
=======
=======
              this);

          if (tempB.getBean() instanceof MetaBean) {
            ((MetaBean) tempB.getBean())
                .addPropertyChangeListenersSubFlow(this);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @SuppressWarnings("unchecked")
  private void loadUserComponents() {
    Vector<Vector<Object>> tempV = null;
    // String ext = "";
    /*
     * if (m_UserComponentsInXML) ext = USERCOMPONENTS_XML_EXTENSION;
     */
    File sFile = new File(weka.core.WekaPackageManager.WEKA_HOME.getPath()
      + File.separator + "knowledgeFlow" + File.separator + "userComponents");
    /*
     * new File(System.getProperty("user.home") +File.separator +
     * ".knowledgeFlow" +File.separator + "userComponents" +ext);
     */
    if (sFile.exists()) {
      try {
        /*
         * if (m_UserComponentsInXML) { XMLBeans xml = new
         * XMLBeans(m_beanLayout, m_bcSupport, XMLBeans.DATATYPE_USERCOMPONENTS,
         * 0); tempV = (Vector) xml.read(sFile); } else {
         */
        InputStream is = new FileInputStream(sFile);
        ObjectInputStream ois = new ObjectInputStream(is);
        tempV = (Vector<Vector<Object>>) ois.readObject();
        ois.close();
        // }
      } catch (Exception ex) {
        weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
          "[KnowledgeFlow] Problem reading user components.");
<<<<<<< HEAD
=======
=======
  private void loadUserComponents() {
    Vector tempV = null;
    String ext = "";
    if (m_UserComponentsInXML)
      ext = USERCOMPONENTS_XML_EXTENSION;
    File sFile = new File(System.getProperty("user.home") + File.separator
        + ".knowledgeFlow" + File.separator + "userComponents" + ext);
    if (sFile.exists()) {
      try {
        if (m_UserComponentsInXML) {
          XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
              XMLBeans.DATATYPE_USERCOMPONENTS);
          tempV = (Vector) xml.read(sFile);
        } else {
          InputStream is = new FileInputStream(sFile);
          ObjectInputStream ois = new ObjectInputStream(is);
          tempV = (Vector) ois.readObject();
          ois.close();
        }
      } catch (Exception ex) {
        System.err.println(Messages.getInstance().getString(
            "KnowledgeFlowApp_LoadUserComponents_Error_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        ex.printStackTrace();
        return;
      }
      if (tempV.size() > 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        DefaultTreeModel model = (DefaultTreeModel) m_componentTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        if (m_userCompNode == null) {
          m_userCompNode = new InvisibleNode("User");
          model.insertNodeInto(m_userCompNode, root, 0);
        }

        // add the components
        for (int i = 0; i < tempV.size(); i++) {
          Vector<Object> tempB = tempV.elementAt(i);
          String displayName = (String) tempB.get(0);
          tempB.get(1);
          ImageIcon scaledIcon = (ImageIcon) tempB.get(2);
          JTreeLeafDetails treeLeaf = new JTreeLeafDetails(displayName, tempB,
            scaledIcon);
          DefaultMutableTreeNode newUserComp = new InvisibleNode(treeLeaf);
          model.insertNodeInto(newUserComp, m_userCompNode, 0);

          // add to the list of user components
          m_userComponents.add(tempB);

          // addToUserToolBar(tempB, false);
          // addToUserTreeNode(tempB, false);
<<<<<<< HEAD
=======
=======
        // create the user tab and add the components
        for (int i = 0; i < tempV.size(); i++) {
          MetaBean tempB = (MetaBean) tempV.elementAt(i);
          addToUserToolBar(tempB, false);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private void installWindowListenerForSavingUserStuff() {
    ((java.awt.Window) getTopLevelAncestor())
      .addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {

          weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
            "[KnowledgeFlow] Saving user components....");
          File sFile = new File(WekaPackageManager.WEKA_HOME.getPath()
            + File.separator + "knowledgeFlow");

          if (!sFile.exists()) {
            if (!sFile.mkdir()) {
              weka.core.logging.Logger.log(
                weka.core.logging.Logger.Level.WARNING,
                "[KnowledgeFlow] Unable to create \""
                  + sFile.getPath() + "\" directory");
            }
          }
          try {
            String ext = "";
            /*
             * if (m_UserComponentsInXML) ext = USERCOMPONENTS_XML_EXTENSION;
             */
            File sFile2 = new File(sFile.getAbsolutePath() + File.separator
              + "userComponents" + ext);

            /*
             * if (m_UserComponentsInXML) { XMLBeans xml = new
             * XMLBeans(m_beanLayout, m_bcSupport,
             * XMLBeans.DATATYPE_USERCOMPONENTS,
             * m_mainKFPerspective.getCurrentTabIndex()); xml.write(sFile2,
             * m_userComponents); } else {
             */
            OutputStream os = new FileOutputStream(sFile2);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(m_userComponents);
            oos.flush();
            oos.close();
            // }
          } catch (Exception ex) {
            weka.core.logging.Logger.log(
              weka.core.logging.Logger.Level.WARNING,
              "[KnowledgeFlow] Unable to save user components");
            ex.printStackTrace();
          }

          // if (VISIBLE_PERSPECTIVES.size() > 0) {
          weka.core.logging.Logger.log(weka.core.logging.Logger.Level.INFO,
            "Saving preferences for selected perspectives...");
          sFile = new File(weka.core.WekaPackageManager.PROPERTIES_DIR
            .toString() + File.separator + "VisiblePerspectives.props");
          try {
            FileWriter f = new FileWriter(sFile);
            f.write("weka.gui.beans.KnowledgeFlow.SelectedPerspectives=");
            int i = 0;
            for (String p : BeansProperties.VISIBLE_PERSPECTIVES) {
              if (i > 0) {
                f.write(",");
              }
              f.write(p);
              i++;
            }
            f.write("\n");

            f.write("weka.gui.beans.KnowledgeFlow.PerspectiveToolBarVisisble="
              + ((m_configAndPerspectivesVisible) ? "yes" : "no"));
            f.write("\n");
            f.close();
          } catch (Exception ex) {
            weka.core.logging.Logger.log(
              weka.core.logging.Logger.Level.WARNING,
              "[KnowledgeFlow] Unable to save user perspectives preferences");
            ex.printStackTrace();
          }
          // }

        }
      });
<<<<<<< HEAD
=======
=======
  private void installWindowListenerForSavingUserBeans() {
    ((java.awt.Window) getTopLevelAncestor())
        .addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.out
                .println(Messages
                    .getInstance()
                    .getString(
                        "KnowledgeFlowApp_InstallWindowListenerForSavingUserBeans_Text"));
            File sFile = new File(System.getProperty("user.home")
                + File.separator + ".knowledgeFlow");
            if (!sFile.exists()) {
              if (!sFile.mkdir()) {
                System.err
                    .println(Messages
                        .getInstance()
                        .getString(
                            "KnowledgeFlowApp_InstallWindowListenerForSavingUserBeans_Error_Text_First"));
              } else {
                // make the plugins subdirectory for the user
                sFile = new File(sFile.toString() + File.separator + "plugins");
                sFile.mkdir();
              }
            }
            try {
              String ext = "";
              if (m_UserComponentsInXML)
                ext = USERCOMPONENTS_XML_EXTENSION;
              File sFile2 = new File(sFile.getAbsolutePath() + File.separator
                  + "userComponents" + ext);

              if (m_UserComponentsInXML) {
                XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport,
                    XMLBeans.DATATYPE_USERCOMPONENTS);
                xml.write(sFile2, m_userComponents);
              } else {
                OutputStream os = new FileOutputStream(sFile2);
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(m_userComponents);
                oos.flush();
                oos.close();
              }
            } catch (Exception ex) {
              System.err
                  .println(Messages
                      .getInstance()
                      .getString(
                          "KnowledgeFlowApp_InstallWindowListenerForSavingUserBeans_Error_Text_Second"));
              ex.printStackTrace();
            }

          }
        });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Utility method for grabbing the global info help (if it exists) from an
   * arbitrary object
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param tempBean the object to grab global info from
   * @return the global help info or null if global info does not exist
   */
  public static String getGlobalInfo(Object tempBean) {
<<<<<<< HEAD
    return Utils.getGlobalInfo(tempBean, true);
=======
<<<<<<< HEAD
    return Utils.getGlobalInfo(tempBean, true);
=======
    // set tool tip text from global info if supplied
    String gi = null;
    try {
      BeanInfo bi = Introspector.getBeanInfo(tempBean.getClass());
      MethodDescriptor[] methods = bi.getMethodDescriptors();
      for (int i = 0; i < methods.length; i++) {
        String name = methods[i].getDisplayName();
        Method meth = methods[i].getMethod();
        if (name.equals("globalInfo")) {
          if (meth.getReturnType().equals(String.class)) {
            Object args[] = {};
            String globalInfo = (String) (meth.invoke(tempBean, args));
            gi = globalInfo;
            break;
          }
        }
      }
    } catch (Exception ex) {

    }
    return gi;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * variable for the KnowLedgeFlow class which would be set to null by the
   * memory monitoring thread to free up some memory if we running out of
   * memory.
   */
  private static KnowledgeFlowApp m_knowledgeFlow;

  /** for monitoring the Memory consumption */
  private static Memory m_Memory = new Memory(true);

  // list of things to be notified when the startup process of
  // the KnowledgeFlow is complete
<<<<<<< HEAD
  public static Vector<StartUpListener> s_startupListeners =
    new Vector<StartUpListener>();
=======
<<<<<<< HEAD
  public static Vector<StartUpListener> s_startupListeners =
    new Vector<StartUpListener>();
=======
  public static Vector s_startupListeners = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  // modifications by Zerbetto
  // If showFileMenu is true, the file menu (open file, new file, save file
  // buttons) is showed
  private boolean m_showFileMenu = true;

  /**
   * Create the singleton instance of the KnowledgeFlow
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param args can contain a file argument for loading a flow layout (format:
   *          "file=[path to layout file]") Modified by Zerbetto: you can
   *          specify the path of a knowledge flow layout file at input
   */
  public static void createSingleton(String[] args) {
    // modifications by Zerbetto 05-12-2007
    String fileName = null;
    boolean showFileMenu = true;

    if ((args != null) && (args.length > 0)) {
<<<<<<< HEAD
      for (String arg : args) {
=======
<<<<<<< HEAD
      for (String arg : args) {
=======
      for (int i = 0; i < args.length; i++) {
        String arg = args[i];

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (arg.startsWith("file=")) {
          fileName = arg.substring("file=".length());
        } else if (arg.startsWith("showFileMenu=")) {
          showFileMenu = Boolean.parseBoolean(arg.substring("showFileMenu="
<<<<<<< HEAD
            .length()));
=======
<<<<<<< HEAD
            .length()));
=======
              .length()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }

    if (m_knowledgeFlow == null) {
      m_knowledgeFlow = new KnowledgeFlowApp(showFileMenu);
    }

    // end modifications by Zerbetto

    // notify listeners (if any)
    for (int i = 0; i < s_startupListeners.size(); i++) {
<<<<<<< HEAD
      s_startupListeners.elementAt(i).startUpComplete();
=======
<<<<<<< HEAD
      s_startupListeners.elementAt(i).startUpComplete();
=======
      ((StartUpListener) s_startupListeners.elementAt(i)).startUpComplete();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // modifications by Zerbetto 05-12-2007
    if (fileName != null) {
      m_knowledgeFlow.loadInitialLayout(fileName);
    }

    // end modifications
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static void disposeSingleton() {
    m_knowledgeFlow = null;
  }

  /**
   * Return the singleton instance of the KnowledgeFlow
   *
<<<<<<< HEAD
=======
=======
  /**
   * Return the singleton instance of the KnowledgeFlow
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the singleton instance
   */
  public static KnowledgeFlowApp getSingleton() {
    return m_knowledgeFlow;
  }

  /**
   * Add a listener to be notified when startup is complete
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param s a listener to add
   */
  public static void addStartupListener(StartUpListener s) {
    s_startupListeners.add(s);
  }

  /**
   * Loads the specified file at input
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * Added by Zerbetto
   */
  // modifications by Zerbetto 05-12-2007
  private void loadInitialLayout(String fileName) {
<<<<<<< HEAD
=======
=======
   * 
   * Added by Zerbetto
   */
  // modifications by Zerbetto 05-12-2007
  public void loadInitialLayout(String fileName) {
    stopFlow();

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    File oFile = new File(fileName);

    if (oFile.exists() && oFile.isFile()) {
      m_FileChooser.setSelectedFile(oFile);

      int index = fileName.lastIndexOf('.');

      if (index != -1) {
        String extension = fileName.substring(index);

        if (FILE_EXTENSION_XML.equalsIgnoreCase(extension)) {
          m_FileChooser.setFileFilter(m_knowledgeFlow.m_XMLFilter);
        } else if (FILE_EXTENSION.equalsIgnoreCase(extension)) {
          m_FileChooser.setFileFilter(m_knowledgeFlow.m_KfFilter);
        }
      }
    } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      weka.core.logging.Logger.log(weka.core.logging.Logger.Level.WARNING,
        "[KnowledgeFlow] File '" + fileName
          + "' does not exists.");
    }

    loadLayout(oFile, true);
  }

  public void setAllowMultipleTabs(boolean multiple) {
    m_allowMultipleTabs = multiple;

    if (!multiple) {
      m_newB.setEnabled(false);
      if (m_configAndPerspectives != null) {
        remove(m_configAndPerspectives);
      }
    }
  }

  public boolean getAllowMultipleTabs() {
    return m_allowMultipleTabs;
<<<<<<< HEAD
=======
=======
      System.err.println(Messages.getInstance().getString(
          "KnowledgeFlowApp_LoadInitialLayout_Error_Text_First")
          + fileName
          + Messages.getInstance().getString(
              "KnowledgeFlowApp_LoadInitialLayout_Error_Text_Second"));
    }

    try {
      Vector beans = new Vector();
      Vector connections = new Vector();

      // KOML?
      if ((KOML.isPresent())
          && (oFile.getAbsolutePath().toLowerCase()
              .endsWith(KOML.FILE_EXTENSION))) {
        Vector v = (Vector) KOML.read(oFile.getAbsolutePath());
        beans = (Vector) v.get(XMLBeans.INDEX_BEANINSTANCES);
        connections = (Vector) v.get(XMLBeans.INDEX_BEANCONNECTIONS);
      } /* XML? */else if (oFile.getAbsolutePath().toLowerCase()
          .endsWith(FILE_EXTENSION_XML)) {
        XMLBeans xml = new XMLBeans(m_beanLayout, m_bcSupport);
        Vector v = (Vector) xml.read(oFile);
        beans = (Vector) v.get(XMLBeans.INDEX_BEANINSTANCES);
        connections = (Vector) v.get(XMLBeans.INDEX_BEANCONNECTIONS);

        // connections = new Vector();
      } /* binary */else {
        InputStream is = new FileInputStream(oFile);
        ObjectInputStream ois = new ObjectInputStream(is);
        beans = (Vector) ois.readObject();
        connections = (Vector) ois.readObject();
        ois.close();
      }

      java.awt.Color bckC = getBackground();
      m_bcSupport = new BeanContextSupport();
      m_bcSupport.setDesignTime(true);

      // register this panel as a property change listener with each
      // bean
      for (int i = 0; i < beans.size(); i++) {
        BeanInstance tempB = (BeanInstance) beans.elementAt(i);

        if (tempB.getBean() instanceof Visible) {
          ((Visible) (tempB.getBean())).getVisual().addPropertyChangeListener(
              this);

          // A workaround to account for JPanel's with their default
          // background colour not being serializable in Apple's JRE
          ((Visible) (tempB.getBean())).getVisual().setBackground(bckC);
          ((JComponent) (tempB.getBean())).setBackground(bckC);
        }

        if (tempB.getBean() instanceof BeanCommon) {
          ((BeanCommon) (tempB.getBean())).setLog(m_logPanel);
        }

        if (tempB.getBean() instanceof BeanContextChild) {
          m_bcSupport.add(tempB.getBean());
        }
      }

      BeanInstance.setBeanInstances(beans, m_beanLayout);
      BeanConnection.setConnections(connections);
      File fullPath = new File(oFile.getAbsolutePath().toString());
      m_flowEnvironment.addVariable("Internal.knowledgeflow.directory",
          fullPath.getParent());
      setEnvironment();

      m_beanLayout.revalidate();
      m_beanLayout.repaint();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  // end modifications

  /**
   * Notifies to the parent swt that the layout is dirty
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Added by Zerbetto
   */
  private void notifyIsDirty() {
    // this.firePropertyChange(new Integer(IEditorPart.PROP_DIRTY).toString(),
    // null, null);
    this.firePropertyChange("PROP_DIRTY", null, null);
  }

  /**
   * Main method.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param args a <code>String[]</code> value
   */
  public static void main(String[] args) {

    LookAndFeel.setLookAndFeel();

    try {
      // uncomment to disable the memory management:
      // m_Memory.setEnabled(false);

      final javax.swing.JFrame jf = new javax.swing.JFrame();
      jf.getContentPane().setLayout(new java.awt.BorderLayout());
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // final KnowledgeFlowApp tm = new KnowledgeFlowApp();
      // m_knowledgeFlow = new KnowledgeFlowApp(true);

      for (int i = 0; i < args.length; i++) {
        if (args[i].toLowerCase().endsWith(".kf")
<<<<<<< HEAD
          || args[i].toLowerCase().endsWith(".kfml")) {
=======
<<<<<<< HEAD
          || args[i].toLowerCase().endsWith(".kfml")) {
=======
            || args[i].toLowerCase().endsWith(".kfml")) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          args[i] = "file=" + args[i];
        }
      }

      KnowledgeFlowApp.createSingleton(args);

      Image icon = Toolkit.getDefaultToolkit().getImage(
<<<<<<< HEAD
        m_knowledgeFlow.getClass().getClassLoader()
          .getResource("weka/gui/weka_icon_new_48.png"));
=======
<<<<<<< HEAD
        m_knowledgeFlow.getClass().getClassLoader()
          .getResource("weka/gui/weka_icon_new_48.png"));
=======
          m_knowledgeFlow.getClass().getClassLoader()
              .getResource("weka/gui/weka_icon_new_48.png"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setIconImage(icon);

      jf.getContentPane().add(m_knowledgeFlow, java.awt.BorderLayout.CENTER);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      jf.setSize(1024, 768);
      jf.setVisible(true);

      Thread memMonitor = new Thread() {
        @SuppressWarnings("static-access")
        @Override
        public void run() {
          while (true) {
            // try {
            // System.out.println("Before sleeping");
            // this.sleep(10);

            if (m_Memory.isOutOfMemory()) {
              // clean up
              jf.dispose();
              m_knowledgeFlow = null;
              System.gc();

              // display error
              System.err.println("\n[KnowledgeFlow] displayed message:");
              m_Memory.showOutOfMemory();
              System.err.println("\nexiting");
              System.exit(-1);
            }

            // } catch (InterruptedException ex) {
            // ex.printStackTrace();
            // }
<<<<<<< HEAD
=======
=======
      jf.setSize(1000, 750);
      jf.setVisible(true);

      Thread memMonitor = new Thread() {
        @Override
        public void run() {
          while (true) {
            try {
              // System.out.println("Before sleeping");
              this.sleep(4000);

              System.gc();

              if (m_Memory.isOutOfMemory()) {
                // clean up
                jf.dispose();
                m_knowledgeFlow = null;
                System.gc();

                // display error
                System.err.println(Messages.getInstance().getString(
                    "KnowledgeFlowApp_Main_Error_Text_First"));
                m_Memory.showOutOfMemory();
                System.err.println(Messages.getInstance().getString(
                    "KnowledgeFlowApp_Main_Error_Text_Second"));
                System.exit(-1);
              }

            } catch (InterruptedException ex) {
              ex.printStackTrace();
            }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      };

      memMonitor.setPriority(Thread.NORM_PRIORITY);
      memMonitor.start();
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
