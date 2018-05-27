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
 *    ClassifierPerformanceEvaluatorBeanInfo.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * Bean info class for the classifier performance evaluator
 * 
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 9455 $
 */
public class ClassifierPerformanceEvaluatorBeanInfo extends SimpleBeanInfo {

  @Override
  public EventSetDescriptor[] getEventSetDescriptors() {
    try {
      EventSetDescriptor[] esds = {
          new EventSetDescriptor(ClassifierPerformanceEvaluator.class, "text",
              TextListener.class, "acceptText"),
          new EventSetDescriptor(ClassifierPerformanceEvaluator.class,
              "thresholdData", ThresholdDataListener.class, "acceptDataSet"),
          new EventSetDescriptor(ClassifierPerformanceEvaluator.class,
              "visualizableError", VisualizableErrorListener.class,
              "acceptDataSet") };
<<<<<<< HEAD
=======
=======
import java.beans.*;

/**
 * Bean info class for the classifier performance evaluator
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
 * @version $Revision: 1.5 $
 */
public class ClassifierPerformanceEvaluatorBeanInfo extends SimpleBeanInfo {
  
  public EventSetDescriptor [] getEventSetDescriptors() {
    try {
      EventSetDescriptor [] esds = { 
	new EventSetDescriptor(ClassifierPerformanceEvaluator.class, 
			       "text", 
			       TextListener.class, 
			       "acceptText"),
	new EventSetDescriptor(ClassifierPerformanceEvaluator.class, 
			       "thresholdData", 
			       ThresholdDataListener.class, 
			       "acceptDataSet"),
      	new EventSetDescriptor(ClassifierPerformanceEvaluator.class, 
			       "visualizableError", 
			       VisualizableErrorListener.class, 
			       "acceptDataSet")};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return esds;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Get the property descriptors for this bean
   * 
   * @return a <code>PropertyDescriptor[]</code> value
   */
  @Override
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor p1;
      PropertyDescriptor p2;
      p1 = new PropertyDescriptor("executionSlots",
          ClassifierPerformanceEvaluator.class);
      p2 = new PropertyDescriptor("errorPlotPointSizeProportionalToMargin",
          ClassifierPerformanceEvaluator.class);
      PropertyDescriptor[] pds = { p1, p2 };
      return pds;
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  /**
   * Get the bean descriptor for this bean
   * 
   * @return a <code>BeanDescriptor</code> value
   */
  @Override
  public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(
        weka.gui.beans.ClassifierPerformanceEvaluator.class,
        ClassifierPerformanceEvaluatorCustomizer.class);
  }
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
