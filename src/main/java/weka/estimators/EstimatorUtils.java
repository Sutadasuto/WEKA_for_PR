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
 *    EstimatorUtils.java
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

package weka.estimators;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Contains static utility functions for Estimators.
 * <p>
 * 
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 10153 $
 */
public class EstimatorUtils implements RevisionHandler {

  /**
   * Find the minimum distance between values
   * 
<<<<<<< HEAD
=======
=======
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;
 
/** 
 * Contains static utility functions for Estimators.<p>
 *
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @version $Revision: 1.4 $
 */
public class EstimatorUtils
  implements RevisionHandler {
  
  /** 
   * Find the minimum distance between values
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param inst sorted instances, sorted
   * @param attrIndex index of the attribute, they are sorted after
   * @return the minimal distance
   */
  public static double findMinDistance(Instances inst, int attrIndex) {
    double min = Double.MAX_VALUE;
    int numInst = inst.numInstances();
    double diff;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (numInst < 2) {
      return min;
    }
    int begin = -1;
    Instance instance = null;
    do {
      begin++;
      if (begin < numInst) {
        instance = inst.instance(begin);
      }
    } while (begin < numInst && instance.isMissing(attrIndex));

    double secondValue = inst.instance(begin).value(attrIndex);
    for (int i = begin; i < numInst && !inst.instance(i).isMissing(attrIndex); i++) {
      double firstValue = secondValue;
      secondValue = inst.instance(i).value(attrIndex);
      if (secondValue != firstValue) {
        diff = secondValue - firstValue;
        if (diff < min && diff > 0.0) {
          min = diff;
        }
<<<<<<< HEAD
=======
=======
    if (numInst < 2) return min;
    int begin = -1;
    Instance instance = null;
    do { 
      begin++;
      if (begin < numInst) 
	{ instance = inst.instance(begin); }
    } while (begin < numInst && instance.isMissing(attrIndex)); 

    double secondValue = inst.instance(begin).value(attrIndex);
    for (int i = begin; i < numInst && !inst.instance(i).isMissing(attrIndex);  i++) {
      double firstValue = secondValue; 
      secondValue = inst.instance(i).value(attrIndex);
      if (secondValue != firstValue) {
	diff = secondValue - firstValue;
	if (diff < min && diff > 0.0) {
	  min = diff;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return min;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Find the minimum and the maximum of the attribute and return it in the last
   * parameter..
   * 
<<<<<<< HEAD
=======
=======
  /** 
   * Find the minimum and the maximum of the attribute and return it in 
   * the last parameter..
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param inst instances used to build the estimator
   * @param attrIndex index of the attribute
   * @param minMax the array to return minimum and maximum in
   * @return number of not missing values
   * @exception Exception if parameter minMax wasn't initialized properly
   */
<<<<<<< HEAD
  public static int getMinMax(Instances inst, int attrIndex, double[] minMax)
=======
<<<<<<< HEAD
  public static int getMinMax(Instances inst, int attrIndex, double[] minMax)
=======
  public static int getMinMax(Instances inst, int attrIndex, double [] minMax) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {
    double min = Double.NaN;
    double max = Double.NaN;
    Instance instance = null;
    int numNotMissing = 0;
    if ((minMax == null) || (minMax.length < 2)) {
      throw new Exception("Error in Program, privat method getMinMax");
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Enumeration<Instance> enumInst = inst.enumerateInstances();
    if (enumInst.hasMoreElements()) {
      do {
        instance = enumInst.nextElement();
      } while (instance.isMissing(attrIndex) && (enumInst.hasMoreElements()));

      // add values if not missing
      if (!instance.isMissing(attrIndex)) {
        numNotMissing++;
        min = instance.value(attrIndex);
        max = instance.value(attrIndex);
      }
      while (enumInst.hasMoreElements()) {
        instance = enumInst.nextElement();
        if (!instance.isMissing(attrIndex)) {
          numNotMissing++;
          if (instance.value(attrIndex) < min) {
            min = (instance.value(attrIndex));
          } else {
            if (instance.value(attrIndex) > max) {
              max = (instance.value(attrIndex));
            }
          }
        }
<<<<<<< HEAD
=======
=======
    
    Enumeration enumInst = inst.enumerateInstances();
    if (enumInst.hasMoreElements()) {
      do {
	instance = (Instance) enumInst.nextElement();
      } while (instance.isMissing(attrIndex) && (enumInst.hasMoreElements()));
      
      // add values if not  missing
      if (!instance.isMissing(attrIndex)) {
	numNotMissing++;
	min = instance.value(attrIndex);
	max = instance.value(attrIndex);
      }
      while (enumInst.hasMoreElements()) {
	instance = (Instance) enumInst.nextElement();
	if (!instance.isMissing(attrIndex)) {
	  numNotMissing++;
	  if (instance.value(attrIndex) < min) {
	    min = (instance.value(attrIndex));
	  } else {
	    if (instance.value(attrIndex) > max) {	      
	      max = (instance.value(attrIndex));
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    minMax[0] = min;
    minMax[1] = max;
    return numNotMissing;
  }

  /**
   * Returns a dataset that contains all instances of a certain class value.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param data dataset to select the instances from
   * @param attrIndex index of the relevant attribute
   * @param classIndex index of the class attribute
   * @param classValue the relevant class value
   * @return a dataset with only
   */
  public static Vector<Object> getInstancesFromClass(Instances data,
    int attrIndex, int classIndex, double classValue, Instances workData) {
    // Oops.pln("getInstancesFromClass classValue"+classValue+" workData"+data.numInstances());
    Vector<Object> dataPlusInfo = new Vector<Object>(0);
    int num = 0;
    int numClassValue = 0;
    // workData = new Instances(data, 0);
    for (int i = 0; i < data.numInstances(); i++) {
      if (!data.instance(i).isMissing(attrIndex)) {
        num++;
        if (data.instance(i).value(classIndex) == classValue) {
          workData.add(data.instance(i));
          numClassValue++;
        }
      }
    }

    Double alphaFactor = new Double((double) numClassValue / (double) num);
<<<<<<< HEAD
=======
=======
   *
   * @param data dataset to select the instances from
   * @param attrIndex index of the relevant attribute
   * @param classIndex index of the class attribute
   * @param classValue the relevant class value 
   * @return a dataset with only 
   */
  public static Vector getInstancesFromClass(Instances data, int attrIndex,
					     int classIndex,
					     double classValue, Instances workData) {
    //Oops.pln("getInstancesFromClass classValue"+classValue+" workData"+data.numInstances());
    Vector dataPlusInfo = new Vector(0);
    int num = 0;
    int numClassValue = 0;
    //workData = new Instances(data, 0);
    for (int i = 0; i < data.numInstances(); i++) {
      if (!data.instance(i).isMissing(attrIndex)) {
	num++;
	if (data.instance(i).value(classIndex) == classValue) {
	  workData.add(data.instance(i));
	  numClassValue++;
	}
      }
    } 

    Double alphaFactor = new Double((double)numClassValue/(double)num);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    dataPlusInfo.add(workData);
    dataPlusInfo.add(alphaFactor);
    return dataPlusInfo;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns a dataset that contains of all instances of a certain class value.
   * 
   * @param data dataset to select the instances from
   * @param classIndex index of the class attribute
   * @param classValue the class value
   * @return a dataset with only instances of one class value
   */
  public static Instances getInstancesFromClass(Instances data, int classIndex,
    double classValue) {
    Instances workData = new Instances(data, 0);
    for (int i = 0; i < data.numInstances(); i++) {
      if (data.instance(i).value(classIndex) == classValue) {
        workData.add(data.instance(i));
      }

    }
    return workData;
  }

  /**
   * Output of an n points of a density curve. Filename is parameter f +
   * ".curv".
   * 
<<<<<<< HEAD
=======
=======

  /**
   * Returns a dataset that contains of all instances of a certain class value.
   * @param data dataset to select the instances from
   * @param classIndex index of the class attribute
   * @param classValue the class value 
   * @return a dataset with only instances of one class value
   */
  public static Instances getInstancesFromClass(Instances data, int classIndex,
						double classValue) {
     Instances workData = new Instances(data, 0);
    for (int i = 0; i < data.numInstances(); i++) {
      if (data.instance(i).value(classIndex) == classValue) {
	workData.add(data.instance(i));
      }
     
    }
    return workData;
  }
  
    
   
  /**
   * Output of an n points of a density curve.
   * Filename is parameter f + ".curv".
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param f string to build filename
   * @param est
   * @param min
   * @param max
   * @param numPoints
   * @throws Exception if something goes wrong
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static void writeCurve(String f, Estimator est, double min,
    double max, int numPoints) throws Exception {

    PrintWriter output = null;
    StringBuffer text = new StringBuffer("");

<<<<<<< HEAD
=======
=======
  public static void writeCurve(String f, Estimator est, 
				double min, double max,
				int numPoints) throws Exception {

    PrintWriter output = null;
    StringBuffer text = new StringBuffer("");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (f.length() != 0) {
      // add attribute indexnumber to filename and extension .hist
      String name = f + ".curv";
      output = new PrintWriter(new FileOutputStream(name));
    } else {
      return;
    }

<<<<<<< HEAD
    double diff = (max - min) / (numPoints - 1.0);
=======
<<<<<<< HEAD
    double diff = (max - min) / (numPoints - 1.0);
=======
    double diff = (max - min) / ((double)numPoints - 1.0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    try {
      text.append("" + min + " " + est.getProbability(min) + " \n");

      for (double value = min + diff; value < max; value += diff) {
<<<<<<< HEAD
        text.append("" + value + " " + est.getProbability(value) + " \n");
=======
<<<<<<< HEAD
        text.append("" + value + " " + est.getProbability(value) + " \n");
=======
	text.append("" + value + " " + est.getProbability(value) + " \n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      text.append("" + max + " " + est.getProbability(max) + " \n");
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println(ex.getMessage());
    }
<<<<<<< HEAD
    output.println(text.toString());
=======
<<<<<<< HEAD
    output.println(text.toString());
=======
    output.println(text.toString());    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // close output
    if (output != null) {
      output.close();
    }
  }

  /**
<<<<<<< HEAD
   * Output of an n points of a density curve. Filename is parameter f +
   * ".curv".
   * 
=======
<<<<<<< HEAD
   * Output of an n points of a density curve. Filename is parameter f +
   * ".curv".
   * 
=======
   * Output of an n points of a density curve.
   * Filename is parameter f + ".curv".
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param f string to build filename
   * @param est
   * @param classEst
   * @param classIndex
   * @param min
   * @param max
   * @param numPoints
   * @throws Exception if something goes wrong
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static void writeCurve(String f, Estimator est, Estimator classEst,
    double classIndex, double min, double max, int numPoints) throws Exception {

    PrintWriter output = null;
    StringBuffer text = new StringBuffer("");

<<<<<<< HEAD
=======
=======
  public static void writeCurve(String f, Estimator est, 
				Estimator classEst,
				double classIndex,
				double min, double max,
				int numPoints) throws Exception {

    PrintWriter output = null;
    StringBuffer text = new StringBuffer("");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (f.length() != 0) {
      // add attribute indexnumber to filename and extension .hist
      String name = f + ".curv";
      output = new PrintWriter(new FileOutputStream(name));
    } else {
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double diff = (max - min) / (numPoints - 1.0);
    try {
      text.append("" + min + " " + est.getProbability(min)
        * classEst.getProbability(classIndex) + " \n");

      for (double value = min + diff; value < max; value += diff) {
        text.append("" + value + " " + est.getProbability(value)
          * classEst.getProbability(classIndex) + " \n");
      }
      text.append("" + max + " " + est.getProbability(max)
        * classEst.getProbability(classIndex) + " \n");
<<<<<<< HEAD
=======
=======
    double diff = (max - min) / ((double)numPoints - 1.0);
    try {
      text.append("" + min + " " + 
		  est.getProbability(min) * classEst.getProbability(classIndex)
		  + " \n");

      for (double value = min + diff; value < max; value += diff) {
	text.append("" + value + " " + 
		    est.getProbability(value) * classEst.getProbability(classIndex)
		    + " \n");
      }
      text.append("" + max + " " +
		  est.getProbability(max) * classEst.getProbability(classIndex)
		  + " \n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println(ex.getMessage());
    }
<<<<<<< HEAD
    output.println(text.toString());
=======
<<<<<<< HEAD
    output.println(text.toString());
=======
    output.println(text.toString());    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // close output
    if (output != null) {
      output.close();
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns a dataset that contains of all instances of a certain value for the
   * given attribute.
   * 
   * @param data dataset to select the instances from
   * @param index the index of the attribute
   * @param v the value
   * @return a subdataset with only instances of one value for the attribute
   */
  public static Instances getInstancesFromValue(Instances data, int index,
    double v) {
    Instances workData = new Instances(data, 0);
    for (int i = 0; i < data.numInstances(); i++) {
      if (data.instance(i).value(index) == v) {
        workData.add(data.instance(i));
      }
    }
    return workData;
  }

  /**
   * Returns a string representing the cutpoints
   */
  public static String cutpointsToString(double[] cutPoints,
    boolean[] cutAndLeft) {
    StringBuffer text = new StringBuffer("");
    if (cutPoints == null) {
      text.append("\n# no cutpoints found - attribute \n");
    } else {
      text.append("\n#* " + cutPoints.length + " cutpoint(s) -\n");
      for (int i = 0; i < cutPoints.length; i++) {
        text.append("# " + cutPoints[i] + " ");
        text.append("" + cutAndLeft[i] + "\n");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns a dataset that contains of all instances of a certain value
   * for the given attribute.
   * @param data dataset to select the instances from
   * @param index the index of the attribute  
   * @param v the value 
   * @return a subdataset with only instances of one value for the attribute 
   */
  public static Instances getInstancesFromValue(Instances data, int index,
					  double v) {
    Instances workData = new Instances(data, 0);
    for (int i = 0; i < data.numInstances(); i++) {
      if (data.instance(i).value(index) == v) {
	workData.add(data.instance(i));
      }
    } 
    return workData;
  }

   
  /**
   * Returns a string representing the cutpoints
   */
  public static String cutpointsToString(double [] cutPoints, boolean [] cutAndLeft) {
    StringBuffer text = new StringBuffer("");
    if (cutPoints == null) {
      text.append("\n# no cutpoints found - attribute \n"); 
    } else {
      text.append("\n#* "+cutPoints.length+" cutpoint(s) -\n"); 
      for (int i = 0; i < cutPoints.length; i++) {
	text.append("# "+cutPoints[i]+" "); 
	text.append(""+cutAndLeft[i]+"\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      text.append("# end\n");
    }
    return text.toString();
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
    return RevisionUtils.extract("$Revision: 10153 $");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.4 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
