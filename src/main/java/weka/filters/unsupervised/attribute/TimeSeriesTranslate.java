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
 *    TimeSeriesTranslate.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */


package weka.filters.unsupervised.attribute;

import weka.core.Capabilities;
<<<<<<< HEAD
import weka.core.Capabilities.Capability;
import weka.core.DenseInstance;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.core.SparseInstance;
import weka.core.UnsupportedAttributeTypeException;
<<<<<<< HEAD
import weka.core.Utils;
=======
import weka.core.Capabilities.Capability;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

/** 
 <!-- globalinfo-start -->
 * An instance filter that assumes instances form time-series data and replaces attribute values in the current instance with the equivalent attribute values of some previous (or future) instance. For instances where the desired value is unknown either the instance may be dropped, or missing values used. Skips the class attribute if it is set.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -R &lt;index1,index2-index4,...&gt;
 *  Specify list of columns to translate in time. First and
 *  last are valid indexes. (default none)</pre>
 * 
 * <pre> -V
 *  Invert matching sense (i.e. calculate for all non-specified columns)</pre>
 * 
 * <pre> -I &lt;num&gt;
 *  The number of instances forward to translate values
 *  between. A negative number indicates taking values from
 *  a past instance. (default -1)</pre>
 * 
 * <pre> -M
 *  For instances at the beginning or end of the dataset where
 *  the translated values are not known, remove those instances
 *  (default is to use missing values).</pre>
 * 
 <!-- options-end -->
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 5547 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */
public class TimeSeriesTranslate 
  extends AbstractTimeSeries {
  
  /** for serialization */
  static final long serialVersionUID = -8901621509691785705L;

  /**
   * Returns a string describing this classifier
   * @return a description of the classifier suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return
        "An instance filter that assumes instances form time-series data and "
      + "replaces attribute values in the current instance with the equivalent "
      + "attribute values of some previous (or future) instance. For "
      + "instances where the desired value is unknown either the instance may "
      + "be dropped, or missing values used. Skips the class attribute if it is set.";
  }

  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);
    
    // class
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);
    
    return result;
  }

  /**
   * Sets the format of the input instances.
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws UnsupportedAttributeTypeException if selected
   * attributes are not numeric or nominal.
   */
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    if ((instanceInfo.classIndex() > 0) && (!getFillWithMissing())) {
      throw new IllegalArgumentException("TimeSeriesTranslate: Need to fill in missing values " +
                                         "using appropriate option when class index is set.");
    }
    super.setInputFormat(instanceInfo);
    // Create the output buffer
    Instances outputFormat = new Instances(instanceInfo, 0); 
    for(int i = 0; i < instanceInfo.numAttributes(); i++) {
      if (i != instanceInfo.classIndex()) {
        if (m_SelectedCols.isInRange(i)) {
          if (outputFormat.attribute(i).isNominal()
              || outputFormat.attribute(i).isNumeric()) {
            outputFormat.renameAttribute(i, outputFormat.attribute(i).name()
                                         + (m_InstanceRange < 0 ? '-' : '+')
                                         + Math.abs(m_InstanceRange));
          } else {
            throw new UnsupportedAttributeTypeException("Only numeric and nominal attributes may be "
                                                        + " manipulated in time series.");
          }
        }
      }
    }
    outputFormat.setClassIndex(instanceInfo.classIndex());
    setOutputFormat(outputFormat);
    return true;
  }
  
  /**
   * Creates a new instance the same as one instance (the "destination")
   * but with some attribute values copied from another instance
   * (the "source")
   *
   * @param source the source instance
   * @param dest the destination instance
   * @return the new merged instance
   */
  protected Instance mergeInstances(Instance source, Instance dest) {

    Instances outputFormat = outputFormatPeek();
    double[] vals = new double[outputFormat.numAttributes()];
    for(int i = 0; i < vals.length; i++) {
      if ((i != outputFormat.classIndex()) && (m_SelectedCols.isInRange(i))) {
        if (source != null) {
          vals[i] = source.value(i);
        } else {
<<<<<<< HEAD
          vals[i] = Utils.missingValue();
=======
          vals[i] = Instance.missingValue();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      } else {
        vals[i] = dest.value(i);
      }
    }
    Instance inst = null;
    if (dest instanceof SparseInstance) {
      inst = new SparseInstance(dest.weight(), vals);
    } else {
<<<<<<< HEAD
      inst = new DenseInstance(dest.weight(), vals);
=======
      inst = new Instance(dest.weight(), vals);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    inst.setDataset(dest.dataset());
    return inst;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 8034 $");
=======
    return RevisionUtils.extract("$Revision: 5547 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
  
  /**
   * Main method for testing this class.
   *
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String [] argv) {
    runFilter(new TimeSeriesTranslate(), argv);
  }
}
