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
 *    PMMLFactory.java
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core.pmml;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

<<<<<<< HEAD
=======
=======
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.AbstractClassifier;
import weka.classifiers.pmml.consumer.GeneralRegression;
import weka.classifiers.pmml.consumer.NeuralNetwork;
import weka.classifiers.pmml.consumer.PMMLClassifier;
import weka.classifiers.pmml.consumer.Regression;
import weka.classifiers.pmml.consumer.RuleSetModel;
import weka.classifiers.pmml.consumer.SupportVectorMachineModel;
import weka.classifiers.pmml.consumer.TreeModel;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.classifiers.pmml.consumer.*;
import weka.core.Instances;
import weka.core.Instance;
import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Utils;
import weka.gui.Logger;

/**
 * This class is a factory class for reading/writing PMML models
<<<<<<< HEAD
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision: 10203 $
=======
<<<<<<< HEAD
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision: 10203 $
=======
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision: 5562 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class PMMLFactory {

  /** for serialization */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  protected enum ModelType {
    UNKNOWN_MODEL("unknown"), REGRESSION_MODEL("Regression"), GENERAL_REGRESSION_MODEL(
      "GeneralRegression"), NEURAL_NETWORK_MODEL("NeuralNetwork"), TREE_MODEL(
      "TreeModel"), RULESET_MODEL("RuleSetModel"), SVM_MODEL(
      "SupportVectorMachineModel");

    private final String m_stringVal;

    ModelType(String name) {
      m_stringVal = name;
    }

    @Override
<<<<<<< HEAD
=======
=======
  
  protected enum ModelType {
    UNKNOWN_MODEL ("unknown"),
    REGRESSION_MODEL ("Regression"),
    GENERAL_REGRESSION_MODEL ("GeneralRegression"),
    NEURAL_NETWORK_MODEL ("NeuralNetwork");
    
    private final String m_stringVal;
    
    ModelType(String name) {
      m_stringVal = name;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public String toString() {
      return m_stringVal;
    }
  }

  /**
   * Read and return a PMML model.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param filename the name of the file to read from
   * @return a PMML model
   * @throws Exception if there is a problem while reading the file
   */
  public static PMMLModel getPMMLModel(String filename) throws Exception {
    return getPMMLModel(filename, null);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Read and return a PMML model.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Read and return a PMML model.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param file a <code>File</code> to read from
   * @return a PMML model
   * @throws Exception if there is a problem while reading the file
   */
  public static PMMLModel getPMMLModel(File file) throws Exception {
    return getPMMLModel(file, null);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Read and return a PMML model.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Read and return a PMML model.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param stream the <code>InputStream</code> to read from
   * @return a PMML model
   * @throws Exception if there is a problem while reading from the stream
   */
  public static PMMLModel getPMMLModel(InputStream stream) throws Exception {
    return getPMMLModel(stream, null);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Read and return a PMML model.
   * 
<<<<<<< HEAD
=======
=======
  
  /**
   * Read and return a PMML model.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param filename the name of the file to read from
   * @param log the logging object to use (or null if none is to be used)
   * @return a PMML model
   * @throws Exception if there is a problem while reading the file
   */
<<<<<<< HEAD
  public static PMMLModel getPMMLModel(String filename, Logger log)
    throws Exception {
=======
<<<<<<< HEAD
  public static PMMLModel getPMMLModel(String filename, Logger log)
    throws Exception {
=======
  public static PMMLModel getPMMLModel(String filename, Logger log) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return getPMMLModel(new File(filename), log);
  }

  /**
   * Read and return a PMML model.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param file a <code>File</code> to read from
   * @param log the logging object to use (or null if none is to be used)
   * @return a PMML model
   * @throws Exception if there is a problem while reading the file
   */
  public static PMMLModel getPMMLModel(File file, Logger log) throws Exception {
    return getPMMLModel(new BufferedInputStream(new FileInputStream(file)), log);
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private static boolean isPMML(Document doc) {
    NodeList tempL = doc.getElementsByTagName("PMML");
    if (tempL.getLength() == 0) {
      return false;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return true;
  }

  /**
   * Read and return a PMML model.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param stream the <code>InputStream</code> to read from
   * @param log the logging object to use (or null if none is to be used)
   * @return a PMML model
   * @throws Exception if there is a problem while reading from the stream
   */
  public static PMMLModel getPMMLModel(InputStream stream, Logger log)
    throws Exception {
<<<<<<< HEAD
=======
=======
   *
   * @param stream the <code>InputStream</code> to read from
   * @param log the logging object to use (or null if none is to be used)
   * @returns a PMML model
   * @throws Exception if there is a problem while reading from the stream
   */
  public static PMMLModel getPMMLModel(InputStream stream, Logger log) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(stream);
    stream.close();
    doc.getDocumentElement().normalize();
    if (!isPMML(doc)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      throw new IllegalArgumentException(
        "[PMMLFactory] Source is not a PMML file!!");
    }

    // System.out.println("Root element " +
    // doc.getDocumentElement().getNodeName());

    Instances dataDictionary = getDataDictionaryAsInstances(doc);
    TransformationDictionary transDict = getTransformationDictionary(doc,
      dataDictionary);

<<<<<<< HEAD
=======
=======
      throw new IllegalArgumentException("[PMMLFactory] Source is not a PMML file!!");
    }
    
    //    System.out.println("Root element " + doc.getDocumentElement().getNodeName());

    Instances dataDictionary = getDataDictionaryAsInstances(doc);
    TransformationDictionary transDict = getTransformationDictionary(doc, dataDictionary);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    ModelType modelType = getModelType(doc);
    if (modelType == ModelType.UNKNOWN_MODEL) {
      throw new Exception("Unsupported PMML model type");
    }
    Element model = getModelElement(doc, modelType);

    // Construct mining schema and meta data
    MiningSchema ms = new MiningSchema(model, dataDictionary, transDict);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // System.out.println(ms);
    // System.exit(1);
    // Instances miningSchema = getMiningSchemaAsInstances(model,
    // dataDictionary);
    PMMLModel theModel = getModelInstance(doc, modelType, model,
      dataDictionary, ms);
<<<<<<< HEAD
=======
=======
    //System.out.println(ms);
    //System.exit(1);
    //    Instances miningSchema = getMiningSchemaAsInstances(model, dataDictionary);
    PMMLModel theModel = getModelInstance(doc, modelType, model, dataDictionary, ms);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (log != null) {
      theModel.setLog(log);
    }
    return theModel;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Get the transformation dictionary (if there is one).
   * 
   * @param doc the Document containing the PMML model
   * @param dataDictionary the data dictionary as an Instances object
   * @return the transformation dictionary or null if there is none defined in
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *         the Document
   * @throws Exception if there is a problem getting the transformation
   *           dictionary
   */
  protected static TransformationDictionary getTransformationDictionary(
    Document doc, Instances dataDictionary) throws Exception {
    TransformationDictionary transDict = null;

<<<<<<< HEAD
=======
=======
   * the Document
   * @throws Exception if there is a problem getting the transformation
   * dictionary
   */
  protected static TransformationDictionary getTransformationDictionary(Document doc, 
      Instances dataDictionary) throws Exception {
    TransformationDictionary transDict = null;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    NodeList transL = doc.getElementsByTagName("TransformationDictionary");
    // should be of size 0 or 1
    if (transL.getLength() > 0) {
      Node transNode = transL.item(0);
      if (transNode.getNodeType() == Node.ELEMENT_NODE) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        transDict = new TransformationDictionary((Element) transNode,
          dataDictionary);
      }
    }

<<<<<<< HEAD
=======
=======
        transDict = new TransformationDictionary((Element)transNode, dataDictionary);
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return transDict;
  }

  /**
   * Serialize a <code>PMMLModel</code> object that encapsulates a PMML model
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param model the <code>PMMLModel</code> to serialize
   * @param filename the name of the file to save to
   * @throws Exception if something goes wrong during serialization
   */
<<<<<<< HEAD
  public static void serializePMMLModel(PMMLModel model, String filename)
=======
<<<<<<< HEAD
  public static void serializePMMLModel(PMMLModel model, String filename)
=======
  public static void serializePMMLModel(PMMLModel model, String filename) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {
    serializePMMLModel(model, new File(filename));
  }

  /**
   * Serialize a <code>PMMLModel</code> object that encapsulates a PMML model
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param model the <code>PMMLModel</code> to serialize
   * @param file the <code>File</code> to save to
   * @throws Exception if something goes wrong during serialization
   */
  public static void serializePMMLModel(PMMLModel model, File file)
    throws Exception {
<<<<<<< HEAD
    serializePMMLModel(model, new BufferedOutputStream(new FileOutputStream(
      file)));
=======
<<<<<<< HEAD
    serializePMMLModel(model, new BufferedOutputStream(new FileOutputStream(
      file)));
=======
    serializePMMLModel(model, new BufferedOutputStream(new FileOutputStream(file)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Serialize a <code>PMMLModel</code> object that encapsulates a PMML model
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param model the <code>PMMLModel</code> to serialize
   * @param stream the <code>OutputStream</code> to serialize to
   * @throws Exception if something goes wrong during serialization
   */
  public static void serializePMMLModel(PMMLModel model, OutputStream stream)
    throws Exception {
    ObjectOutputStream oo = new ObjectOutputStream(stream);
    Instances header = model.getMiningSchema().getFieldsAsInstances();
    oo.writeObject(header);
    oo.writeObject(model);
    oo.flush();
    oo.close();
  }

  /**
   * Get an instance of a PMMLModel from the supplied Document
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param doc the Document holding the pmml
   * @param modelType the type of model
   * @param model the Element encapsulating the model part of the Document
   * @param dataDictionary the data dictionary as an Instances object
   * @param miningSchema the mining schema
   * @return a PMMLModel object
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @throws Exception if there is a problem constructing the model or if the
   *           model type is not supported
   */
  protected static PMMLModel getModelInstance(Document doc,
    ModelType modelType, Element model, Instances dataDictionary,
    MiningSchema miningSchema) throws Exception {
<<<<<<< HEAD
=======
=======
   * @throws Exception if there is a problem constructing the model or
   * if the model type is not supported
   */
  protected static PMMLModel getModelInstance(Document doc, 
                                              ModelType modelType, Element model,
                                              Instances dataDictionary,
                                              MiningSchema miningSchema) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    PMMLModel pmmlM = null;
    switch (modelType) {
    case REGRESSION_MODEL:
      pmmlM = new Regression(model, dataDictionary, miningSchema);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // System.out.println(pmmlM);
      break;
    case GENERAL_REGRESSION_MODEL:
      pmmlM = new GeneralRegression(model, dataDictionary, miningSchema);
      // System.out.println(pmmlM);
<<<<<<< HEAD
=======
=======
      //System.out.println(pmmlM);
      break;
    case GENERAL_REGRESSION_MODEL:
      pmmlM = new GeneralRegression(model, dataDictionary, miningSchema);
      //System.out.println(pmmlM);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      break;
    case NEURAL_NETWORK_MODEL:
      pmmlM = new NeuralNetwork(model, dataDictionary, miningSchema);
      break;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    case TREE_MODEL:
      pmmlM = new TreeModel(model, dataDictionary, miningSchema);
      break;
    case RULESET_MODEL:
      pmmlM = new RuleSetModel(model, dataDictionary, miningSchema);
      break;
    case SVM_MODEL:
      pmmlM = new SupportVectorMachineModel(model, dataDictionary, miningSchema);
      break;
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    default:
      throw new Exception("[PMMLFactory] Unknown model type!!");
    }
    pmmlM.setPMMLVersion(doc);
    pmmlM.setCreatorApplication(doc);
    return pmmlM;
  }

  /**
   * Get the type of model
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param doc the Document encapsulating the pmml
   * @return the type of model
   */
  protected static ModelType getModelType(Document doc) {
    NodeList temp = doc.getElementsByTagName("RegressionModel");
    if (temp.getLength() > 0) {
      return ModelType.REGRESSION_MODEL;
    }

    temp = doc.getElementsByTagName("GeneralRegressionModel");
    if (temp.getLength() > 0) {
      return ModelType.GENERAL_REGRESSION_MODEL;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    temp = doc.getElementsByTagName("NeuralNetwork");
    if (temp.getLength() > 0) {
      return ModelType.NEURAL_NETWORK_MODEL;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    temp = doc.getElementsByTagName("TreeModel");
    if (temp.getLength() > 0) {
      return ModelType.TREE_MODEL;
    }

    temp = doc.getElementsByTagName("RuleSetModel");
    if (temp.getLength() > 0) {
      return ModelType.RULESET_MODEL;
    }

    temp = doc.getElementsByTagName("SupportVectorMachineModel");
    if (temp.getLength() > 0) {
      return ModelType.SVM_MODEL;
    }

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return ModelType.UNKNOWN_MODEL;
  }

  /**
   * Get the Element that contains the pmml model
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param doc the Document encapsulating the pmml
   * @param modelType the type of model
   * @throws Exception if the model type is unsupported/unknown
   */
<<<<<<< HEAD
  protected static Element getModelElement(Document doc, ModelType modelType)
=======
<<<<<<< HEAD
  protected static Element getModelElement(Document doc, ModelType modelType)
=======
  protected static Element getModelElement(Document doc, ModelType modelType) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {
    NodeList temp = null;
    Element model = null;
    switch (modelType) {
    case REGRESSION_MODEL:
      temp = doc.getElementsByTagName("RegressionModel");
      break;
    case GENERAL_REGRESSION_MODEL:
      temp = doc.getElementsByTagName("GeneralRegressionModel");
      break;
    case NEURAL_NETWORK_MODEL:
      temp = doc.getElementsByTagName("NeuralNetwork");
      break;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    case TREE_MODEL:
      temp = doc.getElementsByTagName("TreeModel");
      break;
    case RULESET_MODEL:
      temp = doc.getElementsByTagName("RuleSetModel");
      break;
    case SVM_MODEL:
      temp = doc.getElementsByTagName("SupportVectorMachineModel");
      break;
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    default:
      throw new Exception("[PMMLFactory] unknown/unsupported model type.");
    }

    if (temp != null && temp.getLength() > 0) {
      Node modelNode = temp.item(0);
      if (modelNode.getNodeType() == Node.ELEMENT_NODE) {
<<<<<<< HEAD
        model = (Element) modelNode;
=======
<<<<<<< HEAD
        model = (Element) modelNode;
=======
        model = (Element)modelNode;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    return model;
  }

  /**
   * Get the mining schema as an Instances object
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param model the Element containing the pmml model
   * @param dataDictionary the data dictionary as an Instances object
   * @return the mining schema as an Instances object
   * @throws Exception if something goes wrong during reading the mining schema
   * @deprecated Use the MiningSchema class instead
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Deprecated
  protected static Instances getMiningSchemaAsInstances(Element model,
    Instances dataDictionary) throws Exception {
    ArrayList<Attribute> attInfo = new ArrayList<Attribute>();
<<<<<<< HEAD
=======
=======
  protected static Instances getMiningSchemaAsInstances(Element model,
                                                        Instances dataDictionary) 
    throws Exception {
    FastVector attInfo = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    NodeList fieldList = model.getElementsByTagName("MiningField");
    int classIndex = -1;
    int addedCount = 0;
    for (int i = 0; i < fieldList.getLength(); i++) {
      Node miningField = fieldList.item(i);
      if (miningField.getNodeType() == Node.ELEMENT_NODE) {
<<<<<<< HEAD
        Element miningFieldEl = (Element) miningField;
=======
<<<<<<< HEAD
        Element miningFieldEl = (Element) miningField;
=======
        Element miningFieldEl = (Element)miningField;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        String name = miningFieldEl.getAttribute("name");
        String usage = miningFieldEl.getAttribute("usageType");
        // TO-DO: also missing value replacement etc.

        // find this attribute in the dataDictionary
        Attribute miningAtt = dataDictionary.attribute(name);
        if (miningAtt != null) {
<<<<<<< HEAD
          if (usage.length() == 0 || usage.equals("active")
            || usage.equals("predicted")) {
            attInfo.add(miningAtt);
=======
<<<<<<< HEAD
          if (usage.length() == 0 || usage.equals("active")
            || usage.equals("predicted")) {
            attInfo.add(miningAtt);
=======
          if (usage.length() == 0 || usage.equals("active") || usage.equals("predicted")) {
            attInfo.addElement(miningAtt);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            addedCount++;
          }
          if (usage.equals("predicted")) {
            classIndex = addedCount - 1;
          }
        } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          throw new Exception("Can't find mining field: " + name
            + " in the data dictionary.");
        }
      }
    }

    Instances insts = new Instances("miningSchema", attInfo, 0);
    // System.out.println(insts);
<<<<<<< HEAD
=======
=======
          throw new Exception("Can't find mining field: " + name 
                              + " in the data dictionary.");
        }
      }
    }
    
    Instances insts = new Instances("miningSchema", attInfo, 0);
    //    System.out.println(insts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (classIndex != -1) {
      insts.setClassIndex(classIndex);
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return insts;
  }

  /**
   * Get the data dictionary as an Instances object
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param doc the Document encapsulating the pmml
   * @return the data dictionary as an Instances object
   * @throws Exception if there are fields that are not continuous, ordinal or
   *           categorical in the data dictionary
   */
  protected static Instances getDataDictionaryAsInstances(Document doc)
<<<<<<< HEAD
=======
=======
   *
   * @param doc the Document encapsulating the pmml
   * @return the data dictionary as an Instances object
   * @throws Exception if there are fields that are not continuous, 
   * ordinal or categorical in the data dictionary
   */
  protected static Instances getDataDictionaryAsInstances(Document doc) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {

    // TO-DO: definition of missing values (see below)

<<<<<<< HEAD
    ArrayList<Attribute> attInfo = new ArrayList<Attribute>();
=======
<<<<<<< HEAD
    ArrayList<Attribute> attInfo = new ArrayList<Attribute>();
=======
    FastVector attInfo = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    NodeList dataDictionary = doc.getElementsByTagName("DataField");
    for (int i = 0; i < dataDictionary.getLength(); i++) {
      Node dataField = dataDictionary.item(i);
      if (dataField.getNodeType() == Node.ELEMENT_NODE) {
<<<<<<< HEAD
        Element dataFieldEl = (Element) dataField;
=======
<<<<<<< HEAD
        Element dataFieldEl = (Element) dataField;
=======
        Element dataFieldEl = (Element)dataField;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        String name = dataFieldEl.getAttribute("name");
        String type = dataFieldEl.getAttribute("optype");
        Attribute tempAtt = null;
        if (name != null && type != null) {
          if (type.equals("continuous")) {
            tempAtt = new Attribute(name);
          } else if (type.equals("categorical") || type.equals("ordinal")) {
            NodeList valueList = dataFieldEl.getElementsByTagName("Value");
            if (valueList == null || valueList.getLength() == 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              // assume that categorical values will be revealed in the actual
              // model.
              // Create a string attribute for now
              ArrayList<String> nullV = null;
              tempAtt = new Attribute(name, nullV);
            } else {
              // add the values (if defined as "valid")
              ArrayList<String> valueVector = new ArrayList<String>();
<<<<<<< HEAD
=======
=======
              // assume that categorical values will be revealed in the actual model.
              // Create a string attribute for now
              FastVector nullV = null;
              tempAtt = new Attribute(name, nullV);
            } else {
              // add the values (if defined as "valid")
              FastVector valueVector = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              for (int j = 0; j < valueList.getLength(); j++) {
                Node val = valueList.item(j);
                if (val.getNodeType() == Node.ELEMENT_NODE) {
                  // property is optional (default value is "valid")
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  String property = ((Element) val).getAttribute("property");
                  if (property == null || property.length() == 0
                    || property.equals("valid")) {
                    String value = ((Element) val).getAttribute("value");
                    valueVector.add(value);
                  } else {
                    // Just ignore invalid or missing value definitions for
                    // now...
                    // TO-DO: implement Value meta data with missing/invalid
                    // value defs.
<<<<<<< HEAD
=======
=======
                  String property = ((Element)val).getAttribute("property");
                  if (property == null || property.length() == 0 || property.equals("valid")) {
                    String value = ((Element)val).getAttribute("value");
                    valueVector.addElement(value);
                  } else {
                    // Just ignore invalid or missing value definitions for now...
                    // TO-DO: implement Value meta data with missing/invalid value defs.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
                  }
                }
              }
              tempAtt = new Attribute(name, valueVector);
            }
          } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            throw new Exception("[PMMLFactory] can't handle " + type
              + "attributes.");
          }
          attInfo.add(tempAtt);
<<<<<<< HEAD
=======
=======
            throw new Exception("[PMMLFactory] can't handle " + type + "attributes.");
          }
          attInfo.addElement(tempAtt);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
      }
    }

    // TO-DO: check whether certain values are declared to represent
    // missing or invalid values (applies to both categorical and continuous
    // attributes

    // create the Instances structure
    Instances insts = new Instances("dataDictionary", attInfo, 0);
<<<<<<< HEAD
    // System.out.println(insts);
=======
<<<<<<< HEAD
    // System.out.println(insts);
=======
    //    System.out.println(insts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return insts;
  }

<<<<<<< HEAD
  public static String applyClassifier(PMMLModel model, Instances test)
    throws Exception {
=======
<<<<<<< HEAD
  public static String applyClassifier(PMMLModel model, Instances test)
    throws Exception {
=======
  public static String applyClassifier(PMMLModel model, Instances test) throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    StringBuffer buff = new StringBuffer();
    if (!(model instanceof PMMLClassifier)) {
      throw new Exception("PMML model is not a classifier!");
    }

    double[] preds = null;
<<<<<<< HEAD
    PMMLClassifier classifier = (PMMLClassifier) model;
=======
<<<<<<< HEAD
    PMMLClassifier classifier = (PMMLClassifier) model;
=======
    PMMLClassifier classifier = (PMMLClassifier)model;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int i = 0; i < test.numInstances(); i++) {
      buff.append("Actual: ");
      Instance temp = test.instance(i);
      if (temp.classAttribute().isNumeric()) {
        buff.append(temp.value(temp.classIndex()) + " ");
      } else {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        buff.append(temp.classAttribute().value(
          (int) temp.value(temp.classIndex()))
          + " ");
      }
      preds = classifier.distributionForInstance(temp);
      buff.append(" Predicted: ");
      for (double pred : preds) {
        buff.append("" + pred + " ");
<<<<<<< HEAD
=======
=======
        buff.append(temp.classAttribute().value((int)temp.value(temp.classIndex())) + " ");
      }
      preds = classifier.distributionForInstance(temp);
      buff.append(" Predicted: ");
      for (int j = 0; j < preds.length; j++) {
        buff.append("" + preds[j] + " ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      buff.append("\n");
    }
    return buff.toString();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  private static class PMMLClassifierRunner extends AbstractClassifier {

    /** ID added to avoid warning */
    private static final long serialVersionUID = -3742334356788083347L;

    @Override
    public double[] distributionForInstance(Instance test) throws Exception {
      throw new Exception("Don't call this method!!");
    }

    @Override
    public void buildClassifier(Instances instances) throws Exception {
      throw new Exception("Don't call this method!!");
    }

    @Override
    public String getRevision() {
      return weka.core.RevisionUtils.extract("$Revision: 10203 $");
    }

<<<<<<< HEAD
=======
=======
  
  private static class PMMLClassifierRunner extends Classifier {
    public double[] distributionForInstance(Instance test) throws Exception {
      throw new Exception("Don't call this method!!");
    }
    
    public void buildClassifier(Instances instances) throws Exception {
      throw new Exception("Don't call this method!!");
    }
    
    public String getRevision() {
      return weka.core.RevisionUtils.extract("$Revision: 5562 $");
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public void evaluatePMMLClassifier(String[] options) {
      runClassifier(this, options);
    }
  }

  public static void main(String[] args) {
    try {
      String[] optionsTmp = new String[args.length];
      for (int i = 0; i < args.length; i++) {
        optionsTmp[i] = args[i];
      }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      String pmmlFile = Utils.getOption('l', optionsTmp);
      if (pmmlFile.length() == 0) {
        throw new Exception(
          "[PMMLFactory] must specify a PMML file using the -l option.");
      }
      // see if it is supported before going any further
      getPMMLModel(pmmlFile, null);

      PMMLClassifierRunner pcr = new PMMLClassifierRunner();
      pcr.evaluatePMMLClassifier(args);

      /*
       * PMMLModel model = getPMMLModel(args[0], null);
       * System.out.println(model); if (args.length == 2) { // load an arff file
       * Instances testData = new Instances(new java.io.BufferedReader(new
       * java.io.FileReader(args[1]))); Instances miningSchemaI =
       * model.getMiningSchema().getFieldsAsInstances(); if
       * (miningSchemaI.classIndex() >= 0) { String className =
       * miningSchemaI.classAttribute().name(); for (int i = 0; i <
       * testData.numAttributes(); i++) { if
       * (testData.attribute(i).name().equals(className)) {
       * testData.setClassIndex(i); System.out.println("Found class " +
       * className + " in test data."); break; } } }
       * System.out.println(applyClassifier(model, testData)); }
       */
<<<<<<< HEAD
=======
=======
      String pmmlFile = Utils.getOption('l', optionsTmp); 
      if (pmmlFile.length() == 0) {
        throw new Exception("[PMMLFactory] must specify a PMML file using the -l option.");
      }
      // see if it is supported before going any further
      PMMLModel model = getPMMLModel(pmmlFile, null);
      
      PMMLClassifierRunner pcr = new PMMLClassifierRunner();
      pcr.evaluatePMMLClassifier(args);

/*      System.out.println(model);
      if (args.length == 2) {
        // load an arff file
        Instances testData = new Instances(new BufferedReader(new FileReader(args[1])));
        Instances miningSchemaI = model.getMiningSchema().getFieldsAsInstances();
        if (miningSchemaI.classIndex() >= 0) {
          String className = miningSchemaI.classAttribute().name();
          for (int i = 0; i < testData.numAttributes(); i++) {
            if (testData.attribute(i).name().equals(className)) {
              testData.setClassIndex(i);
              System.out.println("Found class " + className + " in test data.");
              break;
            }
          }
        }
        System.out.println(applyClassifier(model, testData));
      } */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
