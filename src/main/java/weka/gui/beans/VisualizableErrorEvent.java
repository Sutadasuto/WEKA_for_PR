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
 *    VisualizableErrorEvent.java
<<<<<<< HEAD
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.util.EventObject;

import weka.gui.visualize.PlotData2D;

=======
import weka.gui.visualize.PlotData2D;

import java.util.EventObject;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * Event encapsulating error information for a learning scheme
 * that can be visualized in the DataVisualizer
 *
 * @author Mark Hall
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.3 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @see EventObject
 */
public class VisualizableErrorEvent
  extends EventObject {

  /** for serialization */
  private static final long serialVersionUID = -5811819270887223400L;

  private PlotData2D m_dataSet;

  public VisualizableErrorEvent(Object source, PlotData2D dataSet) {
    super(source);
    m_dataSet = dataSet;
  }
  
  /**
   * Return the instances of the data set
   *
   * @return an <code>Instances</code> value
   */
  public PlotData2D getDataSet() {
    return m_dataSet;
  }
}
