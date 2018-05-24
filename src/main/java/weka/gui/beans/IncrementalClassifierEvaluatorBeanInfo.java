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
 *    IncrementalClassifierEvaluatorBeanInfo.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
=======
import java.beans.*;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

/**
 * Bean info class for the incremental classifier evaluator bean
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.4 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class IncrementalClassifierEvaluatorBeanInfo extends SimpleBeanInfo {
  
  /**
   * Return the property descriptors for this bean
   *
   * @return a <code>PropertyDescriptor[]</code> value
   */
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor p1;
      PropertyDescriptor p2;
<<<<<<< HEAD
      PropertyDescriptor p3;
      p1 = new PropertyDescriptor("statusFrequency", IncrementalClassifierEvaluator.class);
      p2 = new PropertyDescriptor("outputPerClassInfoRetrievalStats", 
                                  IncrementalClassifierEvaluator.class);
      p3 = new PropertyDescriptor("chartingEvalWindowSize", 
          IncrementalClassifierEvaluator.class);
      PropertyDescriptor [] pds = { p1, p2, p3 };
=======
      p1 = new PropertyDescriptor("statusFrequency", IncrementalClassifierEvaluator.class);
      p2 = new PropertyDescriptor("outputPerClassInfoRetrievalStats", 
                                  IncrementalClassifierEvaluator.class);
      PropertyDescriptor [] pds = { p1, p2 };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return pds;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  /**
   * Get the event set descriptors for this bean
   *
   * @return an <code>EventSetDescriptor[]</code> value
   */
  public EventSetDescriptor [] getEventSetDescriptors() {
    try {
      EventSetDescriptor [] esds = { 
	new EventSetDescriptor(IncrementalClassifierEvaluator.class, 
			       "chart", 
			       ChartListener.class, 
			       "acceptDataPoint"),
	new EventSetDescriptor(IncrementalClassifierEvaluator.class,
			       "text",
			       TextListener.class,
<<<<<<< HEAD
			       "acceptText")
=======
			       "acceptText") 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      };
      return esds;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  /**
   * Return the bean descriptor for this bean
   *
   * @return a <code>BeanDescriptor</code> value
   */
  public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(weka.gui.beans.IncrementalClassifierEvaluator.class,
			      IncrementalClassifierEvaluatorCustomizer.class);
  }
}
