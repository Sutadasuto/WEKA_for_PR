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
 * SerializedClassifier.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.classifiers.misc;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.File;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
<<<<<<< HEAD
=======
=======
import weka.classifiers.Classifier;
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.SerializationHelper;
import weka.core.Utils;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * <!-- globalinfo-start --> A wrapper around a serialized classifier model.
 * This classifier loads a serialized models and uses it to make predictions.<br/>
 * <br/>
 * Warning: since the serialized model doesn't get changed, cross-validation
 * cannot bet used with this classifier.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
 * 
 * <pre>
 * -model &lt;filename&gt;
 *  The file containing the serialized model.
 *  (required)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10153 $
 */
public class SerializedClassifier extends AbstractClassifier {
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities.Capability;

import java.io.File;
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * A wrapper around a serialized classifier model. This classifier loads a serialized models and uses it to make predictions.<br/>
 * <br/>
 * Warning: since the serialized model doesn't get changed, cross-validation cannot bet used with this classifier.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 * <pre> -model &lt;filename&gt;
 *  The file containing the serialized model.
 *  (required)</pre>
 * 
 <!-- options-end -->
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7560 $
 */
public class SerializedClassifier
  extends Classifier {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = 4599593909947628642L;

  /** the serialized classifier model used for making predictions */
  protected transient Classifier m_Model = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the file where the serialized model is stored */
  protected File m_ModelFile = new File(System.getProperty("user.dir"));

  /**
   * Returns a string describing classifier
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  public String globalInfo() {
    return "A wrapper around a serialized classifier model. This classifier loads "
<<<<<<< HEAD
=======
=======
  
  /** the file where the serialized model is stored */
  protected File m_ModelFile = new File(System.getProperty("user.dir"));
  
  /**
   * Returns a string describing classifier
   * 
   * @return 		a description suitable for displaying in the
   *         		explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "A wrapper around a serialized classifier model. This classifier loads "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "a serialized models and uses it to make predictions.\n\n"
      + "Warning: since the serialized model doesn't get changed, cross-validation "
      + "cannot bet used with this classifier.";
  }

  /**
   * Gets an enumeration describing the available options.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tThe file containing the serialized model.\n" + "\t(required)",
      "model", 1, "-model <filename>"));

    result.addAll(Collections.list(super.listOptions()));

    return result.elements();
  }

  /**
   * returns the options of the current setup
   * 
   * @return the current options
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
<<<<<<< HEAD
=======
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions(){
    Vector        	result;
    Enumeration   	enm;

    result = new Vector();

    enm = super.listOptions();
    while (enm.hasMoreElements())
      result.addElement(enm.nextElement());

    result.addElement(new Option(
	"\tThe file containing the serialized model.\n"
	+ "\t(required)",
	"model", 1, "-model <filename>"));

    return result.elements();
  }
  
  /**
   * returns the options of the current setup
   *
   * @return		the current options
   */
  public String[] getOptions(){
    int       	i;
    Vector    	result;
    String[]  	options;

    result = new Vector();

    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    result.add("-model");
    result.add("" + getModelFile());

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Parses the options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console
   * </pre>
   * 
   * <pre>
   * -model &lt;filename&gt;
   *  The file containing the serialized model.
   *  (required)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the options to use
   * @throws Exception if setting of options fails
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    super.setOptions(options);

    tmpStr = Utils.getOption("model", options);
    if (tmpStr.length() != 0) {
      setModelFile(new File(tmpStr));
    } else {
      setModelFile(new File(System.getProperty("user.dir")));
    }
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
<<<<<<< HEAD
=======
=======
    return (String[]) result.toArray(new String[result.size()]);	  
  }

  /**
   * Parses the options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console</pre>
   * 
   * <pre> -model &lt;filename&gt;
   *  The file containing the serialized model.
   *  (required)</pre>
   * 
   <!-- options-end -->
   *
   * @param options	the options to use
   * @throws Exception	if setting of options fails
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    super.setOptions(options);
    
    tmpStr = Utils.getOption("model", options);
    if (tmpStr.length() != 0)
      setModelFile(new File(tmpStr));
    else
      setModelFile(new File(System.getProperty("user.dir")));
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String modelFileTipText() {
    return "The serialized classifier model to use for predictions.";
  }

  /**
   * Gets the file containing the serialized model.
<<<<<<< HEAD
   * 
   * @return the file.
=======
<<<<<<< HEAD
   * 
   * @return the file.
=======
   *
   * @return 		the file.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public File getModelFile() {
    return m_ModelFile;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the file containing the serialized model.
   * 
   * @param value the file.
   */
  public void setModelFile(File value) {
    m_ModelFile = value;

    if (value.exists() && value.isFile()) {
      try {
        initModel();
      } catch (Exception e) {
        throw new IllegalArgumentException("Cannot load model from file '"
          + value + "': " + e);
<<<<<<< HEAD
=======
=======
  
  /**
   * Sets the file containing the serialized model.
   *
   * @param value 	the file.
   */
  public void setModelFile(File value) {
    m_ModelFile = value;
    
    if (value.exists() && value.isFile()) {
      try {
	initModel();
      }
      catch (Exception e) {
	throw new IllegalArgumentException("Cannot load model from file '" + value + "': " + e);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the fully built model to use, if one doesn't want to load a model from
   * a file or already deserialized a model from somewhere else.
   * 
   * @param value the built model
   * @see #getCurrentModel()
<<<<<<< HEAD
=======
=======
   * Sets the fully built model to use, if one doesn't want to load a model
   * from a file or already deserialized a model from somewhere else.
   * 
   * @param value	the built model
   * @see		#getCurrentModel()
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setModel(Classifier value) {
    m_Model = value;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Gets the currently loaded model (can be null). Call buildClassifier method
   * to load model from file.
   * 
<<<<<<< HEAD
   * @return the current model
   * @see #setModel(Classifier)
=======
<<<<<<< HEAD
   * @return the current model
   * @see #setModel(Classifier)
=======
   * @return		the current model
   * @see		#setModel(Classifier)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public Classifier getCurrentModel() {
    return m_Model;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * loads the serialized model if necessary, throws an Exception if the
   * derserialization fails.
   * 
   * @throws Exception if deserialization fails
   */
  protected void initModel() throws Exception {
    if (m_Model == null) {
      m_Model = (Classifier) SerializationHelper.read(m_ModelFile
        .getAbsolutePath());
    }
<<<<<<< HEAD
=======
=======
  
  /**
   * loads the serialized model if necessary, throws an Exception if the
   * derserialization fails. Always propagates the current debug flag.
   * 
   * @throws Exception	if deserialization fails
   */
  protected void initModel() throws Exception {
    if (m_Model == null)
      m_Model = (Classifier) SerializationHelper.read(m_ModelFile.getAbsolutePath());
    
    m_Model.setDebug(getDebug());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns default capabilities of the base classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of the base classifier
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;
<<<<<<< HEAD
=======
=======
   *
   * @return      the capabilities of the base classifier
   */
  public Capabilities getCapabilities() {
    Capabilities        result;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // init model if necessary
    if (m_ModelFile != null && m_ModelFile.exists() && m_ModelFile.isFile()) {
      try {
        initModel();
<<<<<<< HEAD
      } catch (Exception e) {
=======
<<<<<<< HEAD
      } catch (Exception e) {
=======
      }
      catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        System.err.println(e);
      }
    }

    if (m_Model != null) {
      result = m_Model.getCapabilities();
    } else {
      result = new Capabilities(this);
      result.disableAll();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // set dependencies
    for (Capability cap : Capability.values()) {
      result.enableDependency(cap);
    }

    result.setOwner(this);

    return result;
  }

  /**
   * Calculates the class membership probabilities for the given test instance.
   * 
   * @param instance the instance to be classified
   * @return preedicted class probability distribution
   * @throws Exception if distribution can't be computed successfully
   */
  @Override
  public double[] distributionForInstance(Instance instance) throws Exception {
    double[] result;

    // init model if necessary
    initModel();

    result = m_Model.distributionForInstance(instance);

    return result;
  }

  /**
   * loads only the serialized classifier
   * 
   * @param data the training instances
   * @throws Exception if something goes wrong
   */
  @Override
<<<<<<< HEAD
=======
=======
    
    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);
    
    result.setOwner(this);
    
    return result;
  }
  
  /**
   * Calculates the class membership probabilities for the given test
   * instance.
   *
   * @param instance the instance to be classified
   * @return preedicted class probability distribution
   * @throws Exception if distribution can't be computed successfully 
   */
  public double[] distributionForInstance(Instance instance) throws Exception {
    double[]	result;

    // init model if necessary
    initModel();
    
    result = m_Model.distributionForInstance(instance);
    
    return result;
  }
  
  /**
   * loads only the serialized classifier
   * 
   * @param data        the training instances
   * @throws Exception  if something goes wrong
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void buildClassifier(Instances data) throws Exception {
    // init model if necessary
    initModel();

    // can classifier handle the data?
    getCapabilities().testWithFail(data);
  }

  /**
   * Returns a string representation of the classifier
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the string representation of the classifier
   */
  @Override
  public String toString() {
    StringBuffer result;

    if (m_Model == null) {
      result = new StringBuffer("No model loaded yet.");
    } else {
<<<<<<< HEAD
=======
=======
   * @return		the string representation of the classifier
   */
  public String toString() {
    StringBuffer	result;
    
    if (m_Model == null) {
      result = new StringBuffer("No model loaded yet.");
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      result = new StringBuffer();
      result.append("SerializedClassifier\n");
      result.append("====================\n\n");
      result.append("File: " + getModelFile() + "\n\n");
      result.append(m_Model.toString());
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.toString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10153 $");
  }

  /**
   * Runs the classifier with the given options
   * 
   * @param args the commandline options
<<<<<<< HEAD
=======
=======
    
    return result.toString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7560 $");
  }
  
  /**
   * Runs the classifier with the given options
   * 
   * @param args	the commandline options
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    runClassifier(new SerializedClassifier(), args);
  }
}
