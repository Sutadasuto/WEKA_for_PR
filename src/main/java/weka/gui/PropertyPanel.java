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
 *    PropertyPanel.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.gui;

<<<<<<< HEAD
=======
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.gui;

import weka.core.OptionHandler;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
<<<<<<< HEAD
import java.lang.reflect.Array;
=======
<<<<<<< HEAD
import java.lang.reflect.Array;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.gui.GenericObjectEditorHistory.HistorySelectionEvent;
import weka.gui.GenericObjectEditorHistory.HistorySelectionListener;

/**
 * Support for drawing a property value in a component.
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
public class PropertyPanel extends JPanel {

<<<<<<< HEAD
=======
=======
/** 
 * Support for drawing a property value in a component.
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class PropertyPanel 
  extends JPanel {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = 5370025273466728904L;

  /** The property editor */
<<<<<<< HEAD
  private final PropertyEditor m_Editor;
=======
<<<<<<< HEAD
  private final PropertyEditor m_Editor;
=======
  private PropertyEditor m_Editor;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The currently displayed property dialog, if any */
  private PropertyDialog m_PD;

  /** Whether the editor has provided its own panel */
  private boolean m_HasCustomPanel = false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The custom panel (if any) */
  private JPanel m_CustomPanel;

  /**
   * Create the panel with the supplied property editor.
   * 
<<<<<<< HEAD
=======
=======
  
  /** The custom panel (if any) */
  private JPanel m_CustomPanel;
  
  /**
   * Create the panel with the supplied property editor.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pe the PropertyEditor
   */
  public PropertyPanel(PropertyEditor pe) {

    this(pe, false);
  }

  /**
<<<<<<< HEAD
   * Create the panel with the supplied property editor, optionally ignoring any
   * custom panel the editor can provide.
   * 
=======
<<<<<<< HEAD
   * Create the panel with the supplied property editor, optionally ignoring any
   * custom panel the editor can provide.
   * 
=======
   * Create the panel with the supplied property editor,
   * optionally ignoring any custom panel the editor can provide.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param pe the PropertyEditor
   * @param ignoreCustomPanel whether to make use of any available custom panel
   */
  public PropertyPanel(PropertyEditor pe, boolean ignoreCustomPanel) {

    m_Editor = pe;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (!ignoreCustomPanel && m_Editor instanceof CustomPanelSupplier) {
      setLayout(new BorderLayout());
      m_CustomPanel = ((CustomPanelSupplier) m_Editor).getCustomPanel();
<<<<<<< HEAD
=======
=======
    
    if (!ignoreCustomPanel && m_Editor instanceof CustomPanelSupplier) {
      setLayout(new BorderLayout());
      m_CustomPanel = ((CustomPanelSupplier)m_Editor).getCustomPanel();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      add(m_CustomPanel, BorderLayout.CENTER);
      m_HasCustomPanel = true;
    } else {
      createDefaultPanel();
    }
  }

  /**
<<<<<<< HEAD
   * Creates the default style of panel for editors that do not supply their
   * own.
=======
<<<<<<< HEAD
   * Creates the default style of panel for editors that do not supply their
   * own.
=======
   * Creates the default style of panel for editors that do not
   * supply their own.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  protected void createDefaultPanel() {

    setBorder(BorderFactory.createEtchedBorder());
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setToolTipText("Left-click to edit properties for this object, right-click/Alt+Shift+left-click for menu");
    setOpaque(true);
    final Component comp = this;
    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent evt) {
        if (evt.getClickCount() == 1) {
          if ((evt.getButton() == MouseEvent.BUTTON1) && !evt.isAltDown()
              && !evt.isShiftDown()) {
            showPropertyDialog();
          } else if ((evt.getButton() == MouseEvent.BUTTON3)
              || ((evt.getButton() == MouseEvent.BUTTON1) && evt.isAltDown() && evt
                  .isShiftDown())) {
<<<<<<< HEAD
=======
=======
    setToolTipText(Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_SetToolTipText_Text"));
    setOpaque(true);
    final Component comp = this;
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent evt) {
        if (evt.getClickCount() == 1) {
          if (    (evt.getButton() == MouseEvent.BUTTON1) && !evt.isAltDown() && !evt.isShiftDown() ) {
            showPropertyDialog();
          }
          else if (    (evt.getButton() == MouseEvent.BUTTON3) 
              	    || ((evt.getButton() == MouseEvent.BUTTON1) && evt.isAltDown() && evt.isShiftDown()) ) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            JPopupMenu menu = new JPopupMenu();
            JMenuItem item;

            if (m_Editor.getValue() != null) {
<<<<<<< HEAD
              item = new JMenuItem("Show properties...");
              item.addActionListener(new ActionListener() {
                @Override
=======
<<<<<<< HEAD
              item = new JMenuItem("Show properties...");
              item.addActionListener(new ActionListener() {
                @Override
=======
              item = new JMenuItem(Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_Item_JMenuItem_Text_First"));
              item.addActionListener(new ActionListener() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                public void actionPerformed(ActionEvent e) {
                  showPropertyDialog();
                }
              });
              menu.add(item);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              item = new JMenuItem("Copy configuration to clipboard");
              item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  Object value = m_Editor.getValue();
                  String str = "";
                  if (value.getClass().isArray()) {
                    str += value.getClass().getName();
                    Object[] arr = (Object[])value;
                    for (Object v : arr) {
                      String s = v.getClass().getName();
                      if (v instanceof OptionHandler) {
                        s += " " + Utils.joinOptions(((OptionHandler) v).getOptions());
                      }
                      str += " \"" + Utils.backQuoteChars(s.trim()) + "\"";
                    }
                  } else {
                    str += value.getClass().getName();
                    if (value instanceof OptionHandler) {
                      str += " " + Utils.joinOptions(((OptionHandler) value).getOptions());
                    }
                  }
<<<<<<< HEAD
=======
=======
              item = new JMenuItem(Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_Item_JMenuItem_Text_Second"));
              item.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  String str = m_Editor.getValue().getClass().getName();
                  if (m_Editor.getValue() instanceof OptionHandler)
                    str += " " + Utils.joinOptions(((OptionHandler) m_Editor.getValue()).getOptions());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  StringSelection selection = new StringSelection(str.trim());
                  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                  clipboard.setContents(selection, selection);
                }
              });
              menu.add(item);
            }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

            item = new JMenuItem("Enter configuration...");
            item.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog(comp,
                    "Configuration (<classname> [<options>])");
                if (str != null && str.length() > 0) {
                  try {
                    String[] options = Utils.splitOptions(str);
                    String classname = options[0];
                    options[0] = "";
                    Class c = Utils.forName(Object.class, classname, null).getClass();
                    if (c.isArray()) {
                      Object[] arr = (Object[])Array.newInstance(c.getComponentType(), options.length - 1);
                      for (int i = 1; i < options.length; i++) {
                        String[] ops = Utils.splitOptions(options[i]);
                        String cname = ops[0];
                        ops[0] = "";
                        arr[i - 1] = Utils.forName(Object.class, cname, ops);
                      }
                      m_Editor.setValue(arr);
                    } else {
                      m_Editor.setValue(Utils.forName(Object.class, classname, options));
                    }
                  } catch (Exception ex) {
                    JOptionPane.showMessageDialog(comp,
                        "Error parsing commandline:\n" + ex, "Error...",
                        JOptionPane.ERROR_MESSAGE);
                  }
                }
              }
            });
            menu.add(item);

            if (m_Editor.getValue() instanceof OptionHandler) {
              item = new JMenuItem("Edit configuration...");
              item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  String str = m_Editor.getValue().getClass().getName();
                  str += " "
                      + Utils.joinOptions(((OptionHandler) m_Editor.getValue())
                          .getOptions());
                  str = JOptionPane.showInputDialog(comp, "Configuration", str);
                  if (str != null && str.length() > 0) {
                    try {
                      String[] options = Utils.splitOptions(str);
                      String classname = options[0];
                      options[0] = "";
                      m_Editor.setValue(Utils.forName(Object.class, classname,
                          options));
                    } catch (Exception ex) {
                      JOptionPane.showMessageDialog(comp,
                          "Error parsing commandline:\n" + ex, "Error...",
                          JOptionPane.ERROR_MESSAGE);
                    }
                  }
                }
              });
              menu.add(item);
            }

            if (m_Editor instanceof GenericObjectEditor) {
              ((GenericObjectEditor) m_Editor).getHistory().customizePopupMenu(
                  menu, m_Editor.getValue(), new HistorySelectionListener() {
                    @Override
                    public void historySelected(HistorySelectionEvent e) {
                      m_Editor.setValue(e.getHistoryItem());
                    }
                  });
            }

<<<<<<< HEAD
=======
=======
            
            item = new JMenuItem(Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_Item_JMenuItem_Text_Third"));
            item.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
        	String str = JOptionPane.showInputDialog(
        	                 comp, 
        	                 Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_Str_JOptionPaneShowInputDialog_Text"));
        	if (str != null) {
        	  try {
        	    String[] options = Utils.splitOptions(str);
        	    String classname = options[0];
        	    options[0] = "";
        	    m_Editor.setValue(
        		Utils.forName(
        		    Object.class, classname, options));
        	  }
        	  catch (Exception ex) {
        	    ex.printStackTrace();
        	    JOptionPane.showMessageDialog(
        		comp, 
        		Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_Exception_Text_First") + ex, 
        		Messages.getInstance().getString("PropertyPanel_CreateDefaultPanel_Exception_Text_Second"),
        		JOptionPane.ERROR_MESSAGE);
        	  }
        	}
              }
            });
            menu.add(item);
            
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            menu.show(comp, evt.getX(), evt.getY());
          }
        }
      }
    });
    Dimension newPref = getPreferredSize();
    newPref.height = getFontMetrics(getFont()).getHeight() * 5 / 4;
    newPref.width = newPref.height * 5;
    setPreferredSize(newPref);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Editor.addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        repaint();
      }
    });
<<<<<<< HEAD
=======
=======
    m_Editor.addPropertyChangeListener(new PropertyChangeListener () {
	public void propertyChange(PropertyChangeEvent evt) {
	  repaint();
	}
      });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Displays the property edit dialog for the panel.
   */
  public void showPropertyDialog() {

    if (m_Editor.getValue() != null) {
      if (m_PD == null) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (PropertyDialog.getParentDialog(this) != null)
          m_PD = new PropertyDialog(PropertyDialog.getParentDialog(this), m_Editor, -1, -1);
        else
          m_PD = new PropertyDialog(PropertyDialog.getParentFrame(this), m_Editor, -1, -1);
        m_PD.setVisible(true);
      } else {
        if (PropertyDialog.getParentDialog(this) != null) {
          m_PD.setLocationRelativeTo(PropertyDialog.getParentDialog(this));
        } else {
          m_PD.setLocationRelativeTo(PropertyDialog.getParentFrame(this));
        }
        m_PD.setVisible(true);
<<<<<<< HEAD
=======
=======
	int x = getLocationOnScreen().x;
	int y = getLocationOnScreen().y;
	if (PropertyDialog.getParentDialog(this) != null)
	  m_PD = new PropertyDialog(PropertyDialog.getParentDialog(this), m_Editor, x, y);
	else
	  m_PD = new PropertyDialog(PropertyDialog.getParentFrame(this), m_Editor, x, y);
	m_PD.setVisible(true);
      } else {
	m_PD.setVisible(true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      // make sure that m_Backup is correctly initialized!
      m_Editor.setValue(m_Editor.getValue());
    }
  }

  /**
   * Cleans up when the panel is destroyed.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void removeNotify() {

    super.removeNotify();
    if (m_PD != null) {
      m_PD.dispose();
      m_PD = null;
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Passes on enabled/disabled status to the custom panel (if one is set).
   * 
   * @param enabled true if this panel (and the custom panel is enabled)
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  /**
   * Passes on enabled/disabled status to the custom
   * panel (if one is set).
   * 
   * @param enabled true if this panel (and the custom panel is enabled)
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    if (m_HasCustomPanel) {
      m_CustomPanel.setEnabled(enabled);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Paints the component, using the property editor's paint method.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param g the current graphics context
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param g the current graphics context
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void paintComponent(Graphics g) {

    if (!m_HasCustomPanel) {
      Insets i = getInsets();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Rectangle box = new Rectangle(i.left, i.top, getSize().width - i.left
          - i.right - 1, getSize().height - i.top - i.bottom - 1);

      g.clearRect(i.left, i.top, getSize().width - i.right - i.left,
          getSize().height - i.bottom - i.top);
<<<<<<< HEAD
=======
=======
      Rectangle box = new Rectangle(i.left, i.top,
				    getSize().width - i.left - i.right - 1,
				    getSize().height - i.top - i.bottom - 1);
      
      g.clearRect(i.left, i.top,
		  getSize().width - i.right - i.left,
		  getSize().height - i.bottom - i.top);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_Editor.paintValue(g, box);
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Adds the current editor value to the history.
   * 
   * @return true if successfully added (i.e., if editor is a GOE)
   */
  public boolean addToHistory() {
    return addToHistory(m_Editor.getValue());
  }

  /**
   * Adds the specified value to the history.
   * 
   * @param obj the object to add to the history
   * @return true if successfully added (i.e., if editor is a GOE)
   */
  public boolean addToHistory(Object obj) {
    if ((m_Editor instanceof GenericObjectEditor) && (obj != null)) {
      ((GenericObjectEditor) m_Editor).getHistory().add(obj);
      return true;
    }

    return false;
  }
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
