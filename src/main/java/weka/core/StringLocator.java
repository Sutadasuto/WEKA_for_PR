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
 * StringLocator.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.core;

<<<<<<< HEAD
/**
 * This class locates and records the indices of String attributes, recursively
 * in case of Relational attributes. The indices are normally used for copying
 * the Strings from one Instances object to another.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 12038 $
 * @see Attribute#STRING
 * @see Attribute#RELATIONAL
 */
public class StringLocator extends AttributeLocator {

=======

/**
 * This class locates and records the indices of String attributes, 
 * recursively in case of Relational attributes. The indices are normally
 * used for copying the Strings from one Instances object to another.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 6226 $
 * @see Attribute#STRING
 * @see Attribute#RELATIONAL
 */
public class StringLocator
  extends AttributeLocator {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  private static final long serialVersionUID = 7805522230268783972L;

  /**
   * initializes the StringLocator with the given data
   * 
<<<<<<< HEAD
   * @param data the data to work on
=======
   * @param data	the data to work on
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public StringLocator(Instances data) {
    super(data, Attribute.STRING);
  }
<<<<<<< HEAD

  /**
   * Initializes the StringLocator with the given data. Checks only the given
   * range.
   * 
   * @param data the data to work on
   * @param fromIndex the first index to inspect (including)
   * @param toIndex the last index to check (including)
=======
  
  /**
   * Initializes the StringLocator with the given data. 
   * Checks only the given range.
   * 
   * @param data	the data to work on
   * @param fromIndex	the first index to inspect (including)
   * @param toIndex	the last index to check (including)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public StringLocator(Instances data, int fromIndex, int toIndex) {
    super(data, Attribute.STRING, fromIndex, toIndex);
  }
<<<<<<< HEAD

  /**
   * Initializes the AttributeLocator with the given data. Checks only the
   * specified attribute indices.
   * 
   * @param data the data to work on
   * @param indices the attribute indices to check
=======
  
  /**
   * Initializes the AttributeLocator with the given data.
   * Checks only the specified attribute indices.
   * 
   * @param data	the data to work on
   * @param indices	the attribute indices to check
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public StringLocator(Instances data, int[] indices) {
    super(data, Attribute.STRING, indices);
  }

  /**
<<<<<<< HEAD
   * Copies string values contained in the instance copied to a new dataset. The
   * Instance must already be assigned to a dataset. This dataset and the
   * destination dataset must have the same structure.
   * 
   * @param inst the Instance containing the string values to copy.
   * @param destDataset the destination set of Instances
   * @param strAtts an AttributeLocator containing the indices of any string
   *          attributes in the dataset.
   */
  public static void copyStringValues(Instance inst, Instances destDataset,
    AttributeLocator strAtts) {
=======
   * Copies string values contained in the instance copied to a new
   * dataset. The Instance must already be assigned to a dataset. This
   * dataset and the destination dataset must have the same structure.
   *
   * @param inst 		the Instance containing the string values to copy.
   * @param destDataset 	the destination set of Instances
   * @param strAtts 		an AttributeLocator containing the indices of 
   * 				any string attributes in the dataset.  
   */
  public static void copyStringValues(Instance inst, Instances destDataset, 
                               AttributeLocator strAtts) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (inst.dataset() == null) {
      throw new IllegalArgumentException("Instance has no dataset assigned!!");
    } else if (inst.dataset().numAttributes() != destDataset.numAttributes()) {
      throw new IllegalArgumentException(
<<<<<<< HEAD
        "Src and Dest differ in # of attributes: "
          + inst.dataset().numAttributes() + " != "
          + destDataset.numAttributes());
    }
    copyStringValues(inst, true, inst.dataset(), strAtts, destDataset, strAtts);
  }

  /**
   * Takes string values referenced by an Instance and copies them from a source
   * dataset to a destination dataset. The instance references are updated to be
   * valid for the destination dataset. The instance may have the structure
   * (i.e. number and attribute position) of either dataset (this affects where
   * references are obtained from). Only works if the number of string
   * attributes is the same in both indices (implicitly these string attributes
   * should be semantically same but just with shifted positions).
   * 
   * @param instance the instance containing references to strings in the source
   *          dataset that will have references updated to be valid for the
   *          destination dataset.
   * @param instSrcCompat true if the instance structure is the same as the
   *          source, or false if it is the same as the destination (i.e. which
   *          of the string attribute indices contains the correct locations for
   *          this instance).
   * @param srcDataset the dataset for which the current instance string
   *          references are valid (after any position mapping if needed)
   * @param srcLoc an AttributeLocator containing the indices of string
   *          attributes in the source datset.
   * @param destDataset the dataset for which the current instance string
   *          references need to be inserted (after any position mapping if
   *          needed)
   * @param destLoc an AttributeLocator containing the indices of string
   *          attributes in the destination datset.
   */
  public static void copyStringValues(Instance instance, boolean instSrcCompat,
    Instances srcDataset, AttributeLocator srcLoc, Instances destDataset,
    AttributeLocator destLoc) {
    if (srcDataset == destDataset) {
      return;
    }

    if (srcLoc.getAttributeIndices().length != destLoc.getAttributeIndices().length) {
      throw new IllegalArgumentException(
        "Src and Dest string indices differ in length: "
          + srcLoc.getAttributeIndices().length + " != "
          + destLoc.getAttributeIndices().length);
    }

    if (srcLoc.getLocatorIndices().length != destLoc.getLocatorIndices().length) {
      throw new IllegalArgumentException(
        "Src and Dest locator indices differ in length: "
          + srcLoc.getLocatorIndices().length + " != "
          + destLoc.getLocatorIndices().length);
    }

    for (int i = 0; i < srcLoc.getAttributeIndices().length; i++) {
      int instIndex = instSrcCompat ? srcLoc.getActualIndex(srcLoc
        .getAttributeIndices()[i]) : destLoc.getActualIndex(destLoc
        .getAttributeIndices()[i]);
      Attribute src = srcDataset.attribute(srcLoc.getActualIndex(srcLoc
        .getAttributeIndices()[i]));
      Attribute dest = destDataset.attribute(destLoc.getActualIndex(destLoc
        .getAttributeIndices()[i]));
      if (!instance.isMissing(instIndex)) {
        int valIndex = dest.addStringValue(src, (int) instance.value(instIndex));
        instance.setValue(instIndex, valIndex);
      }
    }

    // recurse if necessary
    int[] srcIndices = srcLoc.getLocatorIndices();
    int[] destIndices = destLoc.getLocatorIndices();
    for (int i = 0; i < srcIndices.length; i++) {
      int index = instSrcCompat ? srcLoc.getActualIndex(srcIndices[i])
        : destLoc.getActualIndex(destIndices[i]);
      if (instance.isMissing(index)) {
        continue;
      }
      int valueIndex = (int)instance.value(index);
      Instances rel = instSrcCompat ? srcDataset.attribute(index).relation(valueIndex)
        : destDataset.attribute(index).relation(valueIndex);
=======
	  "Src and Dest differ in # of attributes: " 
	  + inst.dataset().numAttributes() + " != " + destDataset.numAttributes());
    } 
    copyStringValues(inst, true, inst.dataset(), strAtts,
                     destDataset, strAtts);
  }

  /**
   * Takes string values referenced by an Instance and copies them from a
   * source dataset to a destination dataset. The instance references are
   * updated to be valid for the destination dataset. The instance may have the 
   * structure (i.e. number and attribute position) of either dataset (this
   * affects where references are obtained from). Only works if the number
   * of string attributes is the same in both indices (implicitly these string
   * attributes should be semantically same but just with shifted positions).
   *
   * @param instance 		the instance containing references to strings 
   * 				in the source dataset that will have references 
   * 				updated to be valid for the destination dataset.
   * @param instSrcCompat 	true if the instance structure is the same as 
   * 				the source, or false if it is the same as the 
   * 				destination (i.e. which of the string attribute 
   * 				indices contains the correct locations for this 
   * 				instance).
   * @param srcDataset 		the dataset for which the current instance 
   * 				string references are valid (after any position 
   * 				mapping if needed)
   * @param srcLoc 		an AttributeLocator containing the indices of 
   * 				string attributes in the source datset.
   * @param destDataset 	the dataset for which the current instance 
   * 				string references need to be inserted (after 
   * 				any position mapping if needed)
   * @param destLoc 	an AttributeLocator containing the indices of 
   * 				string attributes in the destination datset.
   */
  public static void copyStringValues(Instance instance, boolean instSrcCompat,
                                  Instances srcDataset, AttributeLocator srcLoc,
                                  Instances destDataset, AttributeLocator destLoc) {
    if (srcDataset == destDataset)
      return;
    
    if (srcLoc.getAttributeIndices().length != destLoc.getAttributeIndices().length)
      throw new IllegalArgumentException(
	  "Src and Dest string indices differ in length: "
	  + srcLoc.getAttributeIndices().length + " != " + destLoc.getAttributeIndices().length);

    if (srcLoc.getLocatorIndices().length != destLoc.getLocatorIndices().length)
      throw new IllegalArgumentException(
	  "Src and Dest locator indices differ in length: "
	  + srcLoc.getLocatorIndices().length + " != " + destLoc.getLocatorIndices().length);

    for (int i = 0; i < srcLoc.getAttributeIndices().length; i++) {
      int instIndex  = instSrcCompat 
      			  ? srcLoc.getActualIndex(srcLoc.getAttributeIndices()[i]) 
      			  : destLoc.getActualIndex(destLoc.getAttributeIndices()[i]);
      Attribute src  = srcDataset.attribute(srcLoc.getActualIndex(srcLoc.getAttributeIndices()[i]));
      Attribute dest = destDataset.attribute(destLoc.getActualIndex(destLoc.getAttributeIndices()[i]));
      if (!instance.isMissing(instIndex)) {
        int valIndex = dest.addStringValue(src, (int)instance.value(instIndex));
        instance.setValue(instIndex, (double)valIndex);
      }
    }
    
    // recurse if necessary
    int[] srcIndices  = srcLoc.getLocatorIndices();
    int[] destIndices = destLoc.getLocatorIndices();
    for (int i = 0; i < srcIndices.length; i++) {
      int index = instSrcCompat
                 ? srcLoc.getActualIndex(srcIndices[i])
                 : destLoc.getActualIndex(destIndices[i]);
      if (instance.isMissing(index))
        continue;
      Instances rel = instSrcCompat
		         ? instance.relationalValue(index)
		         : instance.relationalValue(index);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      AttributeLocator srcStrAttsNew = srcLoc.getLocator(srcIndices[i]);
      Instances srcDatasetNew = srcStrAttsNew.getData();
      AttributeLocator destStrAttsNew = destLoc.getLocator(destIndices[i]);
      Instances destDatasetNew = destStrAttsNew.getData();
      for (int n = 0; n < rel.numInstances(); n++) {
<<<<<<< HEAD
        copyStringValues(rel.instance(n), instSrcCompat, srcDatasetNew,
          srcStrAttsNew, destDatasetNew, destStrAttsNew);
      }
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 12038 $");
=======
        copyStringValues(rel.instance(n), instSrcCompat, srcDatasetNew, srcStrAttsNew, destDatasetNew, destStrAttsNew);
      }
    }
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 6226 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
