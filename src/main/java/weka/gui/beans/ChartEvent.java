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
 *    ChartEvent.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

import java.util.EventObject;
import java.util.Vector;

/**
 * Event encapsulating info for plotting a data point on the StripChart
<<<<<<< HEAD
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 10216 $
 */
public class ChartEvent extends EventObject {
=======
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 1.4 $
 */
public class ChartEvent
  extends EventObject {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 7812460715499569390L;

<<<<<<< HEAD
  private Vector<String> m_legendText;
=======
  private Vector m_legendText;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  private double m_max;
  private double m_min;

  private boolean m_reset;

  /**
   * Y values of the data points
   */
<<<<<<< HEAD
  private double[] m_dataPoint;

  /**
   * Creates a new <code>ChartEvent</code> instance.
   * 
=======
  private double [] m_dataPoint;

  /**
   * Creates a new <code>ChartEvent</code> instance.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param source the source of the event
   * @param legendText a vector of strings to display in the legend
   * @param min minimum y value
   * @param max maximum y value
   * @param dataPoint an array of y values to plot
   * @param reset true if display is to be reset
   */
<<<<<<< HEAD
  public ChartEvent(Object source, Vector<String> legendText, double min,
    double max, double[] dataPoint, boolean reset) {
=======
  public ChartEvent(Object source, Vector legendText, double min, double max,
		    double [] dataPoint, boolean reset) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    super(source);
    m_legendText = legendText;
    m_max = max;
    m_min = min;
    m_dataPoint = dataPoint;
    m_reset = reset;
  }

  /**
   * Creates a new <code>ChartEvent</code> instance.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param source the source of the event
   */
  public ChartEvent(Object source) {
    super(source);
  }

  /**
   * Get the legend text vector
<<<<<<< HEAD
   * 
   * @return a <code>Vector</code> value
   */
  public Vector<String> getLegendText() {
=======
   *
   * @return a <code>Vector</code> value
   */
  public Vector getLegendText() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_legendText;
  }

  /**
   * Set the legend text vector
<<<<<<< HEAD
   * 
   * @param lt a <code>Vector</code> value
   */
  public void setLegendText(Vector<String> lt) {
=======
   *
   * @param lt a <code>Vector</code> value
   */
  public void setLegendText(Vector lt) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_legendText = lt;
  }

  /**
   * Get the min y value
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a <code>double</code> value
   */
  public double getMin() {
    return m_min;
  }

  /**
   * Set the min y value
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param m a <code>double</code> value
   */
  public void setMin(double m) {
    m_min = m;
  }

  /**
   * Get the max y value
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a <code>double</code> value
   */
  public double getMax() {
    return m_max;
  }

  /**
   * Set the max y value
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param m a <code>double</code> value
   */
  public void setMax(double m) {
    m_max = m;
  }

  /**
   * Get the data point
<<<<<<< HEAD
   * 
   * @return a <code>double[]</code> value
   */
  public double[] getDataPoint() {
=======
   *
   * @return a <code>double[]</code> value
   */
  public double [] getDataPoint() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_dataPoint;
  }

  /**
   * Set the data point
<<<<<<< HEAD
   * 
   * @param dp a <code>double[]</code> value
   */
  public void setDataPoint(double[] dp) {
=======
   *
   * @param dp a <code>double[]</code> value
   */
  public void setDataPoint(double [] dp) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_dataPoint = dp;
  }

  /**
   * Set the reset flag
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param reset a <code>boolean</code> value
   */
  public void setReset(boolean reset) {
    m_reset = reset;
  }

  /**
   * get the value of the reset flag
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a <code>boolean</code> value
   */
  public boolean getReset() {
    return m_reset;
  }
}
