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
 *    NBTreeModelSelection.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
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
 * Class for selecting a NB tree split.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10531 $
 */
public class NBTreeModelSelection extends ModelSelection {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;

/**
 * Class for selecting a NB tree split.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 1.5 $
 */
public class NBTreeModelSelection
  extends ModelSelection {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 990097748931976704L;

  /** Minimum number of objects in interval. */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected final int m_minNoObj;

  /** All the training data */
  protected Instances m_allData; //

  /**
   * Initializes the split selection method with the given parameters.
   * 
   * @param minNoObj minimum number of instances that have to occur in at least
   *          two subsets induced by split
   * @param allData FULL training dataset (necessary for selection of split
   *          points).
<<<<<<< HEAD
=======
=======
  private int m_minNoObj;               

  /** All the training data */
  private Instances m_allData; // 

  /**
   * Initializes the split selection method with the given parameters.
   *
   * @param minNoObj minimum number of instances that have to occur in at least two
   * subsets induced by split
   * @param allData FULL training dataset (necessary for
   * selection of split points).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public NBTreeModelSelection(int minNoObj, Instances allData) {
    m_minNoObj = minNoObj;
    m_allData = allData;
  }

  /**
   * Sets reference to training data to null.
   */
  public void cleanup() {

    m_allData = null;
  }

  /**
   * Selects NBTree-type split for the given dataset.
   */
<<<<<<< HEAD
  @Override
  public final ClassifierSplitModel selectModel(Instances data) {
=======
<<<<<<< HEAD
  @Override
  public final ClassifierSplitModel selectModel(Instances data) {
=======
  public final ClassifierSplitModel selectModel(Instances data){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    double globalErrors = 0;

    double minResult;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    NBTreeSplit[] currentModel;
    NBTreeSplit bestModel = null;
    NBTreeNoSplit noSplitModel = null;
    int validModels = 0;
<<<<<<< HEAD
=======
=======
    double currentResult;
    NBTreeSplit [] currentModel;
    NBTreeSplit bestModel = null;
    NBTreeNoSplit noSplitModel = null;
    int validModels = 0;
    boolean multiVal = true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Distribution checkDistribution;
    Attribute attribute;
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
      // build the global model at this node
      noSplitModel = new NBTreeNoSplit();
      noSplitModel.buildClassifier(data);
      if (data.numInstances() < 5) {
<<<<<<< HEAD
        return noSplitModel;
=======
<<<<<<< HEAD
        return noSplitModel;
=======
	return noSplitModel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      // evaluate it
      globalErrors = noSplitModel.getErrors();
      if (globalErrors == 0) {
<<<<<<< HEAD
        return noSplitModel;
=======
<<<<<<< HEAD
        return noSplitModel;
=======
	return noSplitModel;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      // Check if all Instances belong to one class or if not
      // enough Instances to split.
      checkDistribution = new Distribution(data);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (Utils.sm(checkDistribution.total(), m_minNoObj)
        || Utils.eq(checkDistribution.total(),
          checkDistribution.perClass(checkDistribution.maxClass()))) {
        return noSplitModel;
      }

      // Check if all attributes are nominal and have a
      // lot of values.
      if (m_allData != null) {
        Enumeration<Attribute> enu = data.enumerateAttributes();
        while (enu.hasMoreElements()) {
          attribute = enu.nextElement();
          if ((attribute.isNumeric())
            || (Utils.sm(attribute.numValues(),
              (0.3 * m_allData.numInstances())))) {
            break;
          }
        }
<<<<<<< HEAD
=======
=======
      if (Utils.sm(checkDistribution.total(), m_minNoObj) ||
	  Utils.eq(checkDistribution.total(),
		   checkDistribution.perClass(checkDistribution.maxClass()))) {
	return noSplitModel;
      }

      // Check if all attributes are nominal and have a 
      // lot of values.
      if (m_allData != null) {
	Enumeration enu = data.enumerateAttributes();
	while (enu.hasMoreElements()) {
	  attribute = (Attribute) enu.nextElement();
	  if ((attribute.isNumeric()) ||
	      (Utils.sm((double)attribute.numValues(),
			(0.3*(double)m_allData.numInstances())))){
	    multiVal = false;
	    break;
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      currentModel = new NBTreeSplit[data.numAttributes()];
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
          currentModel[i] = new NBTreeSplit(i, m_minNoObj, sumOfWeights);
          currentModel[i].setGlobalModel(noSplitModel);
          currentModel[i].buildClassifier(data);

          // Check if useful split for current attribute
          // exists and check for enumerated attributes with
          // a lot of values.
          if (currentModel[i].checkModel()) {
            validModels++;
          }
        } else {
          currentModel[i] = null;
        }
      }

      // Check if any useful split was found.
      if (validModels == 0) {
        return noSplitModel;
      }

      // Find "best" attribute to split on.
      minResult = globalErrors;
      for (i = 0; i < data.numAttributes(); i++) {
        if ((i != (data).classIndex()) && (currentModel[i].checkModel())) {
          /*
           * System.err.println("Errors for "+data.attribute(i).name()+" "+
           * currentModel[i].getErrors());
           */
          if (currentModel[i].getErrors() < minResult) {
            bestModel = currentModel[i];
            minResult = currentModel[i].getErrors();
          }
        }
      }
      // System.exit(1);
      // Check if useful split was found.

      if (((globalErrors - minResult) / globalErrors) < 0.05) {
        return noSplitModel;
      }

      /*
       * if (bestModel == null) {
       * System.err.println("This shouldn't happen! glob : "+globalErrors+
       * " minRes : "+minResult); System.exit(1); }
       */
      // Set the global model for the best split
      // bestModel.setGlobalModel(noSplitModel);

      return bestModel;
    } catch (Exception e) {
<<<<<<< HEAD
=======
=======
      for (i = 0; i < data.numAttributes(); i++){
	
	// Apart from class attribute.
	if (i != (data).classIndex()){
	  
	  // Get models for current attribute.
	  currentModel[i] = new NBTreeSplit(i,m_minNoObj,sumOfWeights);
	  currentModel[i].setGlobalModel(noSplitModel);
	  currentModel[i].buildClassifier(data);
	  
	  // Check if useful split for current attribute
	  // exists and check for enumerated attributes with 
	  // a lot of values.
	  if (currentModel[i].checkModel()){
	    validModels++;
	  }
	} else {
	  currentModel[i] = null;
	}
      }
      
      // Check if any useful split was found.
      if (validModels == 0) {
	return noSplitModel;
      }
      
     // Find "best" attribute to split on.
      minResult = globalErrors;
      for (i=0;i<data.numAttributes();i++){
	if ((i != (data).classIndex()) &&
	    (currentModel[i].checkModel())) {
	  /*  System.err.println("Errors for "+data.attribute(i).name()+" "+
	      currentModel[i].getErrors()); */
	  if (currentModel[i].getErrors() < minResult) {
	    bestModel = currentModel[i];
	    minResult = currentModel[i].getErrors();
	  }
	}
      }
      //      System.exit(1);
      // Check if useful split was found.
      

      if (((globalErrors - minResult) / globalErrors) < 0.05) {
	return noSplitModel;
      }
      
      /*      if (bestModel == null) {
	System.err.println("This shouldn't happen! glob : "+globalErrors+
			   " minRes : "+minResult);
	System.exit(1);
	} */
      // Set the global model for the best split
      //      bestModel.setGlobalModel(noSplitModel);

      return bestModel;
    }catch(Exception e){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Selects NBTree-type split for the given dataset.
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
    return RevisionUtils.extract("$Revision: 1.5 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
