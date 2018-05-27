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
 * ResultSetTable.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.sql;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.gui.JTableHelper;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

<<<<<<< HEAD
import weka.gui.JTableHelper;

=======
<<<<<<< HEAD
import weka.gui.JTableHelper;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Represents an extended JTable, containing a table model based on a ResultSet
 * and the corresponding query.
 *
 * @author      FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version     $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version     $Revision: 8034 $
=======
 * @version     $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class ResultSetTable
  extends JTable {

  /** for serialization */
  private static final long serialVersionUID = -3391076671854464137L;

  /** the query the table model is based on */
  protected String m_Query;

  /** the connect string with which the query was run */
  protected String m_URL;

  /** the user that was used to connect to the DB */
  protected String m_User;

  /** the password that was used to connect to the DB */
  protected String m_Password;

  /**
   * initializes the table
   * @param url         the database URL
   * @param user        the database user
   * @param pw          the database password
   * @param query       the query
   */
  public ResultSetTable(String url, String user, String pw, String query, 
                        ResultSetTableModel model) {
    super(model);

    m_URL      = url;
    m_User     = user;
    m_Password = pw;
    m_Query    = query;
    
    setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    // optimal colwidths (only according to header!)/cell renderer
    for (int i = 0; i < getColumnCount(); i++) {
      JTableHelper.setOptimalHeaderWidth(this, i);
      getColumnModel().getColumn(i).setCellRenderer(
          new ResultSetTableCellRenderer());
    }
    
    // double click on column displays optimal colwidth
    final JTable table = this;
    getTableHeader().addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        TableColumnModel columnModel = getColumnModel();
        int viewColumn = columnModel.getColumnIndexAtX(e.getX());
        int column = convertColumnIndexToModel(viewColumn);
        if (    (e.getButton() == MouseEvent.BUTTON1)
             && (e.getClickCount() == 2)
             && (column != -1) )
          JTableHelper.setOptimalColumnWidth(table, column);
      }
    });
<<<<<<< HEAD
    getTableHeader().setToolTipText("double left click on column displays the column with optimal width");
=======
<<<<<<< HEAD
    getTableHeader().setToolTipText("double left click on column displays the column with optimal width");
=======
    getTableHeader().setToolTipText(Messages.getInstance().getString("ResultSetTable_GetTableHeader_SetToolTipText_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * returns the database URL that produced the table model
   */
  public String getURL() {
    return m_URL;
  }

  /**
   * returns the user that produced the table model
   */
  public String getUser() {
    return m_User;
  }

  /**
   * returns the password that produced the table model
   */
  public String getPassword() {
    return m_Password;
  }

  /**
   * returns the query that produced the table model
   */
  public String getQuery() {
    return m_Query;
  }

  /**
   * frees up the memory
   */
  public void finalize() throws Throwable {
    if (getModel() != null)
      ((ResultSetTableModel) getModel()).finalize();
    
    super.finalize();

    System.gc();
  }
}
