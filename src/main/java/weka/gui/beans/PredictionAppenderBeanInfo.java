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
 *    PredictionAppenderBeanInfo.java
<<<<<<< HEAD
 *    Copyright (C) 2003-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2003 University of Waikato, Hamilton, New Zealand
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
 * Bean info class for PredictionAppender.
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.3 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @since 1.0
 * @see SimpleBeanInfo
 */
public class PredictionAppenderBeanInfo extends SimpleBeanInfo {

  /**
   * Get the event set descriptors pertinent to data sources
   *
   * @return an <code>EventSetDescriptor[]</code> value
   */
  public EventSetDescriptor [] getEventSetDescriptors() {
    try {
      EventSetDescriptor [] esds =  
      { new EventSetDescriptor(PredictionAppender.class, 
	  "dataSet",
	  DataSourceListener.class,
      "acceptDataSet"),
      new EventSetDescriptor(PredictionAppender.class, 
	  "instance",
	  InstanceListener.class,
      "acceptInstance"),
      new EventSetDescriptor(PredictionAppender.class, 
	  "trainingSet",
	  TrainingSetListener.class,
      "acceptTrainingSet"),
      new EventSetDescriptor(PredictionAppender.class, 
	  "testSet",
	  TestSetListener.class,
      "acceptTestSet")
      };
      return esds;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  /**
   * Return the property descriptors for this bean
   *
   * @return a <code>PropertyDescriptor[]</code> value
   */
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor p1;
      p1 = new PropertyDescriptor("appendPredictedProbabilities", 
				  PredictionAppender.class);
      PropertyDescriptor [] pds = { p1 };
      return pds;
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
    return new BeanDescriptor(weka.gui.beans.PredictionAppender.class,
			      PredictionAppenderCustomizer.class);
  }
}
