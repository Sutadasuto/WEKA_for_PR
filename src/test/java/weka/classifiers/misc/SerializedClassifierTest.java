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
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
 */

package weka.classifiers.misc;

<<<<<<< HEAD
import java.io.File;
import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.EvaluationUtils;
import weka.classifiers.evaluation.Prediction;
import weka.core.Attribute;
import weka.core.CheckOptionHandler;
=======
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.EvaluationUtils;
import weka.core.Attribute;
import weka.core.CheckOptionHandler;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.TestInstances;
import weka.test.Regression;

<<<<<<< HEAD
/**
 * Tests SerializedClassifier. Run from the command line with:
 * <p>
 * java weka.classifiers.misc.SerializedClassifierTest
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10160 $
 */
public class SerializedClassifierTest extends TestCase {

  /** the filename for temporary serialized models */
  public final static String MODEL_FILENAME = System.getProperty("user.dir")
    + "/" + "temp.model";

  /** the setup classifier */
  protected SerializedClassifier m_Classifier;

=======
import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests SerializedClassifier. Run from the command line with:<p>
 * java weka.classifiers.misc.SerializedClassifierTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.1 $
 */
public class SerializedClassifierTest
  extends TestCase {

  /** the filename for temporary serialized models */
  public final static String MODEL_FILENAME = System.getProperty("user.dir") + "/" + "temp.model";
  
  /** the setup classifier */
  protected SerializedClassifier m_Classifier;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** the OptionHandler tester */
  protected CheckOptionHandler m_OptionTester;

  /**
   * initializes the test
   * 
   * @param name the name of the test
   */
  public SerializedClassifierTest(String name) {
    super(name);
  }
<<<<<<< HEAD

  /**
   * Called by JUnit before each test method.
   * 
   * @throws Exception if an error occurs reading the example instances.
   */
  @Override
  protected void setUp() throws Exception {
    m_Classifier = null;
=======
  
  /**
   * Called by JUnit before each test method.
   *
   * @throws Exception if an error occurs reading the example instances.
   */
  protected void setUp() throws Exception {
    m_Classifier   = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_OptionTester = new CheckOptionHandler();
    m_OptionTester.setSilent(true);

    // delete temp file
    File file = new File(MODEL_FILENAME);
<<<<<<< HEAD
    if (file.exists()) {
      file.delete();
    }
=======
    if (file.exists())
      file.delete();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Called by JUnit after each test method
   */
<<<<<<< HEAD
  @Override
  protected void tearDown() {
    m_Classifier = null;
=======
  protected void tearDown() {
    m_Classifier   = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_OptionTester = null;

    // delete temp file
    File file = new File(MODEL_FILENAME);
<<<<<<< HEAD
    if (file.exists()) {
      file.delete();
    }
=======
    if (file.exists())
      file.delete();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * creates a classifier, trains and serializes it
   * 
<<<<<<< HEAD
   * @param data the data to use (J48 with nominal class, M5P with numeric
   *          class)
   * @return the results for the data
   */
  protected double[] trainAndSerializeClassifier(Instances data) {
    Classifier classifier;
    double[] result;
    int i;

    try {
      // build
      if (data.classAttribute().isNominal()) {
        classifier = new weka.classifiers.trees.J48();
      } else {
        classifier = new weka.classifiers.trees.M5P();
      }
      classifier.buildClassifier(data);

      // record predictions
      result = new double[data.numInstances()];
      for (i = 0; i < result.length; i++) {
        result[i] = classifier.classifyInstance(data.instance(i));
      }

      // save
      SerializationHelper.write(MODEL_FILENAME, classifier);
    } catch (Exception e) {
      fail("Training base classifier failed: " + e);
      return null;
    }

    return result;
  }

  /**
   * performs the actual test
   * 
   * @param nomClass whether to use a nominal class with J48 (TRUE) or a numeric
   *          one with M5P (FALSE)
   */
  protected void performTest(boolean nomClass) {
    TestInstances test;
    Instances data;
    double[] originalResults;
    double[] testResults;
    int i;
=======
   * @param data	the data to use (J48 with nominal class, M5P with
   * 			numeric class)
   * @return		the results for the data
   */
  protected double[] trainAndSerializeClassifier(Instances data) {
    Classifier	classifier;
    double[]	result;
    int		i;
    
    try {
      // build
      if (data.classAttribute().isNominal())
	classifier = new weka.classifiers.trees.J48();
      else
	classifier = new weka.classifiers.trees.M5P();
      classifier.buildClassifier(data);
      
      // record predictions
      result = new double[data.numInstances()];
      for (i = 0; i < result.length; i++)
	result[i] = classifier.classifyInstance(data.instance(i));
      
      // save
      SerializationHelper.write(MODEL_FILENAME, classifier);
    }
    catch (Exception e) {
      fail("Training base classifier failed: " + e);
      return null;
    }
    
    return result;
  }
  
  /**
   * performs the actual test
   * 
   * @param nomClass	whether to use a nominal class with J48 (TRUE) or 
   * 			a numeric one with M5P (FALSE)
   */
  protected void performTest(boolean nomClass) {
    TestInstances	test;
    Instances		data;
    double[]		originalResults;
    double[]		testResults;
    int			i;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // generate data
    try {
      test = new TestInstances();
      if (nomClass) {
<<<<<<< HEAD
        test.setClassType(Attribute.NOMINAL);
        test.setNumNominal(5);
        test.setNumNominalValues(4);
        test.setNumNumeric(0);
      } else {
        test.setClassType(Attribute.NUMERIC);
        test.setNumNominal(0);
        test.setNumNumeric(5);
=======
	test.setClassType(Attribute.NOMINAL);
	test.setNumNominal(5);
	test.setNumNominalValues(4);
	test.setNumNumeric(0);
      }
      else {
	test.setClassType(Attribute.NUMERIC);
	test.setNumNominal(0);
	test.setNumNumeric(5);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      test.setNumDate(0);
      test.setNumString(0);
      test.setNumRelational(0);
      test.setNumInstances(100);
      data = test.generate();
<<<<<<< HEAD
    } catch (Exception e) {
      fail("Generating test data failed: " + e);
      return;
    }

    // train and save base classifier
    try {
      originalResults = trainAndSerializeClassifier(data);
    } catch (Exception e) {
      fail("Training base classifier failed: " + e);
      return;
    }

=======
    }
    catch (Exception e) {
      fail("Generating test data failed: " + e);
      return;
    }
    
    // train and save base classifier
    try {
      originalResults = trainAndSerializeClassifier(data);
    }
    catch (Exception e) {
      fail("Training base classifier failed: " + e);
      return;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // test loading
    try {
      m_Classifier = new SerializedClassifier();
      m_Classifier.setModelFile(new File(MODEL_FILENAME));
      m_Classifier.buildClassifier(data);
<<<<<<< HEAD
    } catch (Exception e) {
      fail("Loading/testing of classifier failed: " + e);
    }

=======
    }
    catch (Exception e) {
      fail("Loading/testing of classifier failed: " + e);
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // compare results
    try {
      // get results from serialized model
      testResults = new double[data.numInstances()];
<<<<<<< HEAD
      for (i = 0; i < testResults.length; i++) {
        testResults[i] = m_Classifier.classifyInstance(data.instance(i));
      }

      // compare
      for (i = 0; i < originalResults.length; i++) {
        if (originalResults[i] != testResults[i]) {
          throw new Exception("Result #" + (i + 1) + " differs!");
        }
      }
    } catch (Exception e) {
      fail("Comparing results failed: " + e);
    }
  }

=======
      for (i = 0; i < testResults.length; i++)
	testResults[i] = m_Classifier.classifyInstance(data.instance(i));
      
      // compare
      for (i = 0; i < originalResults.length; i++) {
	if (originalResults[i] != testResults[i])
	  throw new Exception("Result #" + (i+1) + " differs!");
      }
    }
    catch (Exception e) {
      fail("Comparing results failed: " + e);
    }
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests a serialized classifier (J48) handling nominal classes
   */
  public void testNominalClass() {
    performTest(true);
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests a serialized classifier (M5P) handling numeric classes
   */
  public void testNumericClass() {
    performTest(true);
  }

  /**
   * Returns a string containing all the predictions.
<<<<<<< HEAD
   * 
   * @param predictions a <code>FastVector</code> containing the predictions
   * @return a <code>String</code> representing the vector of predictions.
   */
  protected String predictionsToString(ArrayList<Prediction> predictions) {
    StringBuffer sb = new StringBuffer();
    sb.append(predictions.size()).append(" predictions\n");
    for (int i = 0; i < predictions.size(); i++) {
      sb.append(predictions.get(i)).append('\n');
=======
   *
   * @param predictions a <code>FastVector</code> containing the predictions
   * @return a <code>String</code> representing the vector of predictions.
   */
  protected String predictionsToString(FastVector predictions) {
    StringBuffer sb = new StringBuffer();
    sb.append(predictions.size()).append(" predictions\n");
    for (int i = 0; i < predictions.size(); i++) {
      sb.append(predictions.elementAt(i)).append('\n');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return sb.toString();
  }

  /**
<<<<<<< HEAD
   * Runs a regression test -- this checks that the output of the tested object
   * matches that in a reference version. When this test is run without any
   * pre-existing reference output, the reference version is created. Uses J48
   * for this purpose.
   */
  public void testRegression() {
    Regression reg;
    Instances train;
    Instances test;
    Instances data;
    TestInstances testInst;
    int tot;
    int mid;
    EvaluationUtils evaluation;
    ArrayList<Prediction> regressionResults;

=======
   * Runs a regression test -- this checks that the output of the tested
   * object matches that in a reference version. When this test is
   * run without any pre-existing reference output, the reference version
   * is created. Uses J48 for this purpose.
   */
  public void testRegression() {
    Regression 		reg;
    Instances   	train;
    Instances   	test;
    Instances   	data;
    TestInstances	testInst;
    int 		tot;
    int 		mid;
    EvaluationUtils 	evaluation;
    FastVector		regressionResults;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    reg = new Regression(this.getClass());

    // generate test data
    try {
      testInst = new TestInstances();
      testInst.setClassType(Attribute.NOMINAL);
      testInst.setNumNominal(5);
      testInst.setNumNominalValues(4);
      testInst.setNumNumeric(0);
      testInst.setNumDate(0);
      testInst.setNumString(0);
      testInst.setNumRelational(0);
      testInst.setNumInstances(100);
      data = testInst.generate();
<<<<<<< HEAD
    } catch (Exception e) {
      fail("Failed generating data: " + e);
      return;
    }

=======
    }
    catch (Exception e) {
      fail("Failed generating data: " + e);
      return;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // split data into train/test
    tot = data.numInstances();
    mid = tot / 2;
    train = null;
    test = null;
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    try {
      train = new Instances(data, 0, mid);
      test = new Instances(data, mid, tot - mid);
      m_Classifier = new SerializedClassifier();
      m_Classifier.setModelFile(new File(MODEL_FILENAME));
<<<<<<< HEAD
    } catch (Exception e) {
=======
    } 
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      fail("Problem setting up to use classifier: " + e);
    }

    evaluation = new EvaluationUtils();
    try {
      trainAndSerializeClassifier(train);
<<<<<<< HEAD
      regressionResults = evaluation.getTrainTestPredictions(m_Classifier,
        train, test);
      reg.println(predictionsToString(regressionResults));
    } catch (Exception e) {
      fail("Failed obtaining classifier predictions: " + e);
    }

    try {
      String diff = reg.diff();
      if (diff == null) {
        System.err.println("Warning: No reference available, creating.");
      } else if (!diff.equals("")) {
        fail("Regression test failed. Difference:\n" + diff);
      }
    } catch (java.io.IOException ex) {
      fail("Problem during regression testing.\n" + ex);
    }
  }

=======
      regressionResults = evaluation.getTrainTestPredictions(m_Classifier, train, test);
      reg.println(predictionsToString(regressionResults));
    }
    catch (Exception e) {
      fail("Failed obtaining classifier predictions: " + e);
    }
    
    try {
      String diff = reg.diff();
      if (diff == null) {
        System.err.println("Warning: No reference available, creating."); 
      } else if (!diff.equals("")) {
        fail("Regression test failed. Difference:\n" + diff);
      }
    } 
    catch (java.io.IOException ex) {
      fail("Problem during regression testing.\n" + ex);
    }
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests the listing of the options
   */
  public void testListOptions() {
<<<<<<< HEAD
    if (!m_OptionTester.checkListOptions()) {
      fail("Options cannot be listed via listOptions.");
    }
  }

=======
    if (!m_OptionTester.checkListOptions())
      fail("Options cannot be listed via listOptions.");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests the setting of the options
   */
  public void testSetOptions() {
<<<<<<< HEAD
    if (!m_OptionTester.checkSetOptions()) {
      fail("setOptions method failed.");
    }
  }

=======
    if (!m_OptionTester.checkSetOptions())
      fail("setOptions method failed.");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests whether there are any remaining options
   */
  public void testRemainingOptions() {
<<<<<<< HEAD
    if (!m_OptionTester.checkRemainingOptions()) {
      fail("There were 'left-over' options.");
    }
  }

=======
    if (!m_OptionTester.checkRemainingOptions())
      fail("There were 'left-over' options.");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests the whether the user-supplied options stay the same after setting.
   * getting, and re-setting again.
   */
  public void testCanonicalUserOptions() {
<<<<<<< HEAD
    if (!m_OptionTester.checkCanonicalUserOptions()) {
      fail("setOptions method failed");
    }
  }

=======
    if (!m_OptionTester.checkCanonicalUserOptions())
      fail("setOptions method failed");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * tests the resetting of the options to the default ones
   */
  public void testResettingOptions() {
<<<<<<< HEAD
    if (!m_OptionTester.checkSetOptions()) {
      fail("Resetting of options failed");
    }
  }

=======
    if (!m_OptionTester.checkSetOptions())
      fail("Resetting of options failed");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public static Test suite() {
    return new TestSuite(SerializedClassifierTest.class);
  }

<<<<<<< HEAD
  public static void main(String[] args) {
=======
  public static void main(String[] args){
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    junit.textui.TestRunner.run(suite());
  }
}
