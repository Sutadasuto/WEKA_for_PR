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
 *    BinC45ModelSelection.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.trees.j48;

<<<<<<< HEAD
import java.util.Enumeration;

=======
<<<<<<< HEAD
import java.util.Enumeration;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.core.Utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Class for selecting a C4.5-like binary (!) split for a given dataset.
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 10531 $
 */
public class BinC45ModelSelection extends ModelSelection {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;

/**
 * Class for selecting a C4.5-like binary (!) split for a given dataset.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 1.11 $
 */
public class BinC45ModelSelection
  extends ModelSelection {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 179170923545122001L;

  /** Minimum number of instances in interval. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected final int m_minNoObj;

  /** Use MDL correction? */
  protected final boolean m_useMDLcorrection;

  /** The FULL training dataset. */
  protected Instances m_allData;

  /** Do not relocate split point to actual data value */
  protected final boolean m_doNotMakeSplitPointActualValue;

  /**
   * Initializes the split selection method with the given parameters.
   * 
   * @param minNoObj minimum number of instances that have to occur in at least
   *          two subsets induced by split
   * @param allData FULL training dataset (necessary for selection of split
   *          points).
   * @param useMDLcorrection whether to use MDL adjustement when finding splits
   *          on numeric attributes
   */
  public BinC45ModelSelection(int minNoObj, Instances allData,
    boolean useMDLcorrection, boolean doNotMakeSplitPointActualValue) {
    m_minNoObj = minNoObj;
    m_allData = allData;
    m_useMDLcorrection = useMDLcorrection;
    m_doNotMakeSplitPointActualValue = doNotMakeSplitPointActualValue;
<<<<<<< HEAD
=======
=======
  private int m_minNoObj;               

  /** The FULL training dataset. */
  private Instances m_allData; 

  /**
   * Initializes the split selection method with the given parameters.
   *
   * @param minNoObj minimum number of instances that have to occur in
   * at least two subsets induced by split
   * @param allData FULL training dataset (necessary for selection of
   * split points).  
   */
  public BinC45ModelSelection(int minNoObj,Instances allData){
    m_minNoObj = minNoObj;
    m_allData = allData;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets reference to training data to null.
   */
  public void cleanup() {

    m_allData = null;
  }

  /**
   * Selects C4.5-type split for the given dataset.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public final ClassifierSplitModel selectModel(Instances data) {

    double minResult;
    BinC45Split[] currentModel;
<<<<<<< HEAD
=======
=======
  public final ClassifierSplitModel selectModel(Instances data){

    double minResult;
    double currentResult;
    BinC45Split [] currentModel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    BinC45Split bestModel = null;
    NoSplit noSplitModel = null;
    double averageInfoGain = 0;
    int validModels = 0;
    boolean multiVal = true;
    Distribution checkDistribution;
    double sumOfWeights;
    int i;
<<<<<<< HEAD

    try {
=======
<<<<<<< HEAD

    try {
=======
    
    try{
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // Check if all Instances belong to one class or if not
      // enough Instances to split.
      checkDistribution = new Distribution(data);
      noSplitModel = new NoSplit(checkDistribution);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (Utils.sm(checkDistribution.total(), 2 * m_minNoObj)
        || Utils.eq(checkDistribution.total(),
          checkDistribution.perClass(checkDistribution.maxClass()))) {
        return noSplitModel;
      }

      // Check if all attributes are nominal and have a
      // lot of values.
      Enumeration<Attribute> enu = data.enumerateAttributes();
      while (enu.hasMoreElements()) {
        Attribute attribute = enu.nextElement();
        if ((attribute.isNumeric())
          || (Utils.sm(attribute.numValues(), (0.3 * m_allData.numInstances())))) {
          multiVal = false;
          break;
        }
<<<<<<< HEAD
=======
=======
      if (Utils.sm(checkDistribution.total(),2*m_minNoObj) ||
	  Utils.eq(checkDistribution.total(),
		   checkDistribution.perClass(checkDistribution.maxClass())))
	return noSplitModel;

      // Check if all attributes are nominal and have a 
      // lot of values.
      Enumeration enu = data.enumerateAttributes();
      while (enu.hasMoreElements()) {
	Attribute attribute = (Attribute) enu.nextElement();
	if ((attribute.isNumeric()) ||
	    (Utils.sm((double)attribute.numValues(),
		      (0.3*(double)m_allData.numInstances())))){
	  multiVal = false;
	  break;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      currentModel = new BinC45Split[data.numAttributes()];
      sumOfWeights = data.sumOfWeights();

      // For each attribute.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (i = 0; i < data.numAttributes(); i++) {

        // Apart from class attribute.
        if (i != (data).classIndex()) {

          // Get models for current attribute.
          currentModel[i] = new BinC45Split(i, m_minNoObj, sumOfWeights,
            m_useMDLcorrection);
          currentModel[i].buildClassifier(data);

          // Check if useful split for current attribute
          // exists and check for enumerated attributes with
          // a lot of values.
          if (currentModel[i].checkModel()) {
            if ((data.attribute(i).isNumeric())
              || (multiVal || Utils.sm(data.attribute(i).numValues(),
                (0.3 * m_allData.numInstances())))) {
              averageInfoGain = averageInfoGain + currentModel[i].infoGain();
              validModels++;
            }
          }
        } else {
          currentModel[i] = null;
        }
      }

      // Check if any useful split was found.
      if (validModels == 0) {
        return noSplitModel;
      }
      averageInfoGain = averageInfoGain / validModels;

      // Find "best" attribute to split on.
      minResult = 0;
      for (i = 0; i < data.numAttributes(); i++) {
        if ((i != (data).classIndex()) && (currentModel[i].checkModel())) {
          // Use 1E-3 here to get a closer approximation to the original
          // implementation.
          if ((currentModel[i].infoGain() >= (averageInfoGain - 1E-3))
            && Utils.gr(currentModel[i].gainRatio(), minResult)) {
            bestModel = currentModel[i];
            minResult = currentModel[i].gainRatio();
          }
        }
      }

      // Check if useful split was found.
      if (Utils.eq(minResult, 0)) {
        return noSplitModel;
      }

      // Add all Instances with unknown values for the corresponding
      // attribute to the distribution for the model, so that
      // the complete distribution is stored with the model.
      bestModel.distribution().addInstWithUnknown(data, bestModel.attIndex());

      // Set the split point analogue to C45 if attribute numeric.
      if (!m_doNotMakeSplitPointActualValue) {
        bestModel.setSplitPoint(m_allData);
      }
      return bestModel;
    } catch (Exception e) {
<<<<<<< HEAD
=======
=======
      for (i = 0; i < data.numAttributes(); i++){
	
	// Apart from class attribute.
	if (i != (data).classIndex()){
	  
	  // Get models for current attribute.
	  currentModel[i] = new BinC45Split(i,m_minNoObj,sumOfWeights);
	  currentModel[i].buildClassifier(data);
	  
	  // Check if useful split for current attribute
	  // exists and check for enumerated attributes with 
	  // a lot of values.
	  if (currentModel[i].checkModel())
	    if ((data.attribute(i).isNumeric()) ||
		(multiVal || Utils.sm((double)data.attribute(i).numValues(),
				      (0.3*(double)m_allData.numInstances())))){
	      averageInfoGain = averageInfoGain+currentModel[i].infoGain();
	      validModels++;
	    }
	}else
	  currentModel[i] = null;
      }
      
      // Check if any useful split was found.
      if (validModels == 0)
	return noSplitModel;
      averageInfoGain = averageInfoGain/(double)validModels;

      // Find "best" attribute to split on.
      minResult = 0;
      for (i=0;i<data.numAttributes();i++){
	if ((i != (data).classIndex()) &&
	    (currentModel[i].checkModel()))
	  
	  // Use 1E-3 here to get a closer approximation to the original
	  // implementation.
	  if ((currentModel[i].infoGain() >= (averageInfoGain-1E-3)) &&
	      Utils.gr(currentModel[i].gainRatio(),minResult)){ 
	    bestModel = currentModel[i];
	    minResult = currentModel[i].gainRatio();
	  }
      }
      
      // Check if useful split was found.
      if (Utils.eq(minResult,0))
	return noSplitModel;

      // Add all Instances with unknown values for the corresponding
      // attribute to the distribution for the model, so that
      // the complete distribution is stored with the model. 
      bestModel.distribution().
	addInstWithUnknown(data,bestModel.attIndex());
      
      // Set the split point analogue to C45 if attribute numeric.
      bestModel.setSplitPoint(m_allData);
      return bestModel;
    }catch(Exception e){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Selects C4.5-type split for the given dataset.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public final ClassifierSplitModel selectModel(Instances train, Instances test) {

    return selectModel(train);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10531 $");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.11 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
