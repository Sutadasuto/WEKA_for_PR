<<<<<<< HEAD
/*
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
 */

/*
 *    PrintableComponent.java
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
 *
 */
=======
 /*
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
  */

 /*
  *    PrintableComponent.java
  *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
  *
  */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

package weka.gui.visualize;

import java.util.Hashtable;

/**
<<<<<<< HEAD
 * This interface is for all JComponent classes that provide the ability to
 * print itself to a file.
=======
 * This interface is for all JComponent classes that provide the ability to 
 * print itself to a file. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * 
 * @see PrintableComponent
 * @see PrintablePanel
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 10222 $
 */
public interface PrintableHandler {
  /**
   * returns a Hashtable with the current available JComponentWriters in the
   * save dialog. the key of the Hashtable is the description of the writer.
   * 
   * @return all currently available JComponentWriters
   * @see JComponentWriter#getDescription()
   */
  public Hashtable<String, JComponentWriter> getWriters();

  /**
   * returns the JComponentWriter associated with the given name, is
=======
 * @version $Revision: 1.2 $
 */
public interface PrintableHandler {
  /**
   * returns a Hashtable with the current available JComponentWriters in the 
   * save dialog. the key of the Hashtable is the description of the writer.
   * 
   * @return all currently available JComponentWriters 
   * @see JComponentWriter#getDescription()
   */
  public Hashtable getWriters();
  
  /**
   * returns the JComponentWriter associated with the given name, is 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <code>null</code> if not found
   * 
   * @return the writer associated with the given name
   * @see JComponentWriter#getDescription()
   */
  public JComponentWriter getWriter(String name);

  /**
   * sets the title for the save dialog
   */
  public void setSaveDialogTitle(String title);
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * returns the title for the save dialog
   */
  public String getSaveDialogTitle();
<<<<<<< HEAD

  /**
   * sets the scale factor
   * 
   * @param x the scale factor for the x-axis
   * @param y the scale factor for the y-axis
   */
  public void setScale(double x, double y);

=======
  
  /**
   * sets the scale factor
   * @param x the scale factor for the x-axis 
   * @param y the scale factor for the y-axis 
   */
  public void setScale(double x, double y);
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * returns the scale factor for the x-axis
   */
  public double getXScale();
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * returns the scale factor for the y-axis
   */
  public double getYScale();
<<<<<<< HEAD

  /**
   * displays a save dialog for saving the component to a file.
=======
  
  /**
   * displays a save dialog for saving the component to a file.  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void saveComponent();
}
