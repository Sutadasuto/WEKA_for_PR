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
 *    PropertySelectorDialog.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui;

<<<<<<< HEAD
=======
import weka.experiment.PropertyNode;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

<<<<<<< HEAD
import weka.experiment.PropertyNode;

/**
 * Allows the user to select any (supported) property of an object, including
 * properties that any of it's property values may have.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
public class PropertySelectorDialog extends JDialog {
=======
/**
 * Allows the user to select any (supported) property of an object, including
 * properties that any of it's property values may have.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7899 $
 */
public class PropertySelectorDialog
  extends JDialog {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -3155058124137930518L;

  /** Click to choose the currently selected property */
<<<<<<< HEAD
  protected JButton m_SelectBut = new JButton("Select");

  /** Click to cancel the property selection */
  protected JButton m_CancelBut = new JButton("Cancel");
=======
  protected JButton m_SelectBut = new JButton(Messages.getInstance().getString("PropertySelectorDialog_SelectBut_JButton_Text"));

  /** Click to cancel the property selection */
  protected JButton m_CancelBut = new JButton(Messages.getInstance().getString("PropertySelectorDialog_CancelBut_JButton_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The root of the property tree */
  protected DefaultMutableTreeNode m_Root;

  /** The object at the root of the tree */
  protected Object m_RootObject;

  /** Whether the selection was made or cancelled */
  protected int m_Result;

  /** Stores the path to the selected property */
<<<<<<< HEAD
  protected Object[] m_ResultPath;
=======
  protected Object [] m_ResultPath;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The component displaying the property tree */
  protected JTree m_Tree;

  /** Signifies an OK property selection */
  public static final int APPROVE_OPTION = 0;

  /** Signifies a cancelled property selection */
  public static final int CANCEL_OPTION = 1;

  /**
   * Create the property selection dialog.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param parentFrame the parent frame of the dialog
   * @param rootObject the object containing properties to select from
   */
  public PropertySelectorDialog(Frame parentFrame, Object rootObject) {

<<<<<<< HEAD
    super(parentFrame, "Select a property", ModalityType.DOCUMENT_MODAL);
    m_CancelBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m_Result = CANCEL_OPTION;
        setVisible(false);
      }
    });
    m_SelectBut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // value = path from root to selected;
        TreePath tPath = m_Tree.getSelectionPath();
        if (tPath == null) {
          m_Result = CANCEL_OPTION;
        } else {
          m_ResultPath = tPath.getPath();
          if ((m_ResultPath == null) || (m_ResultPath.length < 2)) {
            m_Result = CANCEL_OPTION;
          } else {
            m_Result = APPROVE_OPTION;
          }
        }
        setVisible(false);
      }
    });
    m_RootObject = rootObject;
    m_Root = new DefaultMutableTreeNode(new PropertyNode(m_RootObject));
=======
    super(parentFrame, Messages.getInstance().getString("PropertySelectorDialog_Text"), ModalityType.DOCUMENT_MODAL);
    m_CancelBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	m_Result = CANCEL_OPTION;
	setVisible(false);
      }
    });
    m_SelectBut.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
	// value = path from root to selected;
	TreePath tPath = m_Tree.getSelectionPath();
	if (tPath == null) {
	  m_Result = CANCEL_OPTION;
	} else {
	  m_ResultPath = tPath.getPath();
	  if ((m_ResultPath == null) || (m_ResultPath.length < 2)) {
	    m_Result = CANCEL_OPTION;
	  } else {
	    m_Result = APPROVE_OPTION;
	  }
	}
	setVisible(false);
      }
    });
    m_RootObject = rootObject;
    m_Root = new DefaultMutableTreeNode(
	     new PropertyNode(m_RootObject));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    createNodes(m_Root);

    Container c = getContentPane();
    c.setLayout(new BorderLayout());
<<<<<<< HEAD
    // setBorder(BorderFactory.createTitledBorder("Select a property"));
=======
    //    setBorder(BorderFactory.createTitledBorder("Select a property"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Box b1 = new Box(BoxLayout.X_AXIS);
    b1.add(m_SelectBut);
    b1.add(Box.createHorizontalStrut(10));
    b1.add(m_CancelBut);
    c.add(b1, BorderLayout.SOUTH);
    m_Tree = new JTree(m_Root);
<<<<<<< HEAD
    m_Tree.getSelectionModel().setSelectionMode(
      TreeSelectionModel.SINGLE_TREE_SELECTION);
    c.add(new JScrollPane(m_Tree), BorderLayout.CENTER);
    pack();
    setLocationRelativeTo(parentFrame);
=======
    m_Tree.getSelectionModel()
      .setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
    c.add(new JScrollPane(m_Tree), BorderLayout.CENTER);
    pack();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Pops up the modal dialog and waits for cancel or a selection.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return either APPROVE_OPTION, or CANCEL_OPTION
   */
  public int showDialog() {

    m_Result = CANCEL_OPTION;
    setVisible(true);
    return m_Result;
  }

  /**
   * Gets the path of property nodes to the selected property.
<<<<<<< HEAD
   * 
   * @return an array of PropertyNodes
   */
  public PropertyNode[] getPath() {

    PropertyNode[] result = new PropertyNode[m_ResultPath.length - 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = (PropertyNode) ((DefaultMutableTreeNode) m_ResultPath[i + 1])
        .getUserObject();
=======
   *
   * @return an array of PropertyNodes
   */
  public PropertyNode [] getPath() {

    PropertyNode [] result = new PropertyNode [m_ResultPath.length - 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = (PropertyNode) ((DefaultMutableTreeNode) m_ResultPath[i + 1])
	.getUserObject();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return result;
  }

  /**
   * Creates the property tree below the current node.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param localNode a value of type 'DefaultMutableTreeNode'
   */
  protected void createNodes(DefaultMutableTreeNode localNode) {

<<<<<<< HEAD
    PropertyNode pNode = (PropertyNode) localNode.getUserObject();
=======
    PropertyNode pNode = (PropertyNode)localNode.getUserObject();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Object localObject = pNode.value;
    // Find all the properties of the object in the root node
    PropertyDescriptor localProperties[];
    try {
      BeanInfo bi = Introspector.getBeanInfo(localObject.getClass());
      localProperties = bi.getPropertyDescriptors();
    } catch (IntrospectionException ex) {
<<<<<<< HEAD
      System.err.println("PropertySelectorDialog: Couldn't introspect");
=======
      System.err.println(Messages.getInstance().getString("PropertySelectorDialog_CreateNodes_Error_Text_First"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return;
    }

    // Put their values into child nodes.
<<<<<<< HEAD
    for (PropertyDescriptor localPropertie : localProperties) {
      // Don't display hidden or expert properties.
      if (localPropertie.isHidden() || localPropertie.isExpert()) {
        continue;
      }
      String name = localPropertie.getDisplayName();
      Class<?> type = localPropertie.getPropertyType();
      Method getter = localPropertie.getReadMethod();
      Method setter = localPropertie.getWriteMethod();
      Object value = null;
      // Only display read/write properties.
      if (getter == null || setter == null) {
        continue;
      }
      try {
        Object args[] = {};
        value = getter.invoke(localObject, args);
        PropertyEditor editor = null;
        Class<?> pec = localPropertie.getPropertyEditorClass();
        if (pec != null) {
          try {
            editor = (PropertyEditor) pec.newInstance();
          } catch (Exception ex) {
          }
        }
        if (editor == null) {
          editor = PropertyEditorManager.findEditor(type);
        }
        if ((editor == null) || (value == null)) {
          continue;
        }
      } catch (InvocationTargetException ex) {
        System.err.println("Skipping property " + name
          + " ; exception on target: " + ex.getTargetException());
        ex.getTargetException().printStackTrace();
        continue;
      } catch (Exception ex) {
        System.err.println("Skipping property " + name + " ; exception: " + ex);
        ex.printStackTrace();
        continue;
      }
      // Make a child node
      DefaultMutableTreeNode child = new DefaultMutableTreeNode(
        new PropertyNode(value, localPropertie, localObject.getClass()));
=======
    for (int i = 0; i < localProperties.length; i++) {
      // Don't display hidden or expert properties.
      if (localProperties[i].isHidden() || localProperties[i].isExpert()) {
	continue;
      }
      String name = localProperties[i].getDisplayName();
      Class type = localProperties[i].getPropertyType();
      Method getter = localProperties[i].getReadMethod();
      Method setter = localProperties[i].getWriteMethod();
      Object value = null;
      // Only display read/write properties.
      if (getter == null || setter == null) {
	continue;
      }
      try {
	Object args[] = { };
	value = getter.invoke(localObject, args);
	PropertyEditor editor = null;
	Class pec = localProperties[i].getPropertyEditorClass();
	if (pec != null) {
	  try {
	    editor = (PropertyEditor)pec.newInstance();
	  } catch (Exception ex) {
	  }
	}
	if (editor == null) {
	  editor = PropertyEditorManager.findEditor(type);
	}
	if ((editor == null) || (value == null)) {
	  continue;
	}
      } catch (InvocationTargetException ex) {
	System.err.println(Messages.getInstance().getString("PropertySelectorDialog_CreateNodes_Error_Text_Second") + name
			   + Messages.getInstance().getString("PropertySelectorDialog_CreateNodes_Error_Text_Third")
			   + ex.getTargetException());
	ex.getTargetException().printStackTrace();
	continue;
      } catch (Exception ex) {
	System.err.println(Messages.getInstance().getString("PropertySelectorDialog_CreateNodes_Error_Text_Fourth") + name
			   + Messages.getInstance().getString("PropertySelectorDialog_CreateNodes_Error_Text_Fifth") + ex);
	ex.printStackTrace();
	continue;
      }
      // Make a child node
      DefaultMutableTreeNode child = new DefaultMutableTreeNode(
				     new PropertyNode(value,
						      localProperties[i],
						      localObject.getClass()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      localNode.add(child);
      createNodes(child);
    }
  }

<<<<<<< HEAD
  /**
   * Tests out the property selector from the command line.
   * 
   * @param args ignored
   */
  public static void main(String[] args) {
=======

  /**
   * Tests out the property selector from the command line.
   *
   * @param args ignored
   */
  public static void main(String [] args) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    try {
      GenericObjectEditor.registerEditors();

<<<<<<< HEAD
      Object rp = new weka.experiment.AveragingResultProducer();
      final PropertySelectorDialog jd = new PropertySelectorDialog(null, rp);
      int result = jd.showDialog();
      if (result == PropertySelectorDialog.APPROVE_OPTION) {
        System.err.println("Property Selected");
        PropertyNode[] path = jd.getPath();
        for (int i = 0; i < path.length; i++) {
          PropertyNode pn = path[i];
          System.err.println("" + (i + 1) + "  " + pn.toString() + " "
            + pn.value.toString());
        }
      } else {
        System.err.println("Cancelled");
=======
      Object rp
	= new weka.experiment.AveragingResultProducer();
      final PropertySelectorDialog jd = new PropertySelectorDialog(null, rp);
      int result = jd.showDialog();
      if (result == PropertySelectorDialog.APPROVE_OPTION) {
	System.err.println(Messages.getInstance().getString("PropertySelectorDialog_Main_Error_Text_First"));
	PropertyNode [] path = jd.getPath();
	for (int i = 0; i < path.length; i++) {
	  PropertyNode pn = path[i];
	  System.err.println("" + (i + 1) + "  " + pn.toString()
			     + " " + pn.value.toString());
	}
      } else {
	System.err.println(Messages.getInstance().getString("PropertySelectorDialog_Main_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.exit(0);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
