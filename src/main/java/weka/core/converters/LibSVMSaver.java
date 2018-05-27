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
 * LibSVMSaver.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, NZ
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, NZ
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, NZ
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core.converters;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.SingleIndex;
import weka.core.Utils;
<<<<<<< HEAD

/**
 * <!-- globalinfo-start --> Writes to a destination that is in libsvm format.<br/>
=======
<<<<<<< HEAD

/**
 * <!-- globalinfo-start --> Writes to a destination that is in libsvm format.<br/>
=======
import weka.core.Capabilities.Capability;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Writes to a destination that is in libsvm format.<br/>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <br/>
 * For more information about libsvm see:<br/>
 * <br/>
 * http://www.csie.ntu.edu.tw/~cjlin/libsvm/
 * <p/>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -i &lt;the input file&gt;
 *  The input file
 * </pre>
 * 
 * <pre>
 * -o &lt;the output file&gt;
 *  The output file
 * </pre>
 * 
 * <pre>
 * -c &lt;class index&gt;
 *  The class index
 *  (default: last)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 * @see Saver
 */
public class LibSVMSaver extends AbstractFileSaver implements BatchConverter,
  IncrementalConverter {

<<<<<<< HEAD
=======
=======
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -i &lt;the input file&gt;
 *  The input file</pre>
 * 
 * <pre> -o &lt;the output file&gt;
 *  The output file</pre>
 * 
 * <pre> -c &lt;class index&gt;
 *  The class index
 *  (default: last)</pre>
 * 
 <!-- options-end -->
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 8011 $
 * @see Saver
 */
public class LibSVMSaver 
  extends AbstractFileSaver 
  implements BatchConverter, IncrementalConverter {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  private static final long serialVersionUID = 2792295817125694786L;

  /** the file extension */
  public static String FILE_EXTENSION = LibSVMLoader.FILE_EXTENSION;

  /** the class index */
<<<<<<< HEAD
  protected SingleIndex m_ClassIndex = new SingleIndex("last");
=======
<<<<<<< HEAD
  protected SingleIndex m_ClassIndex = new SingleIndex("last");
=======
  protected SingleIndex m_ClassIndex = new SingleIndex("last"); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Constructor
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public LibSVMSaver() {
    resetOptions();
  }

  /**
   * Returns a string describing this Saver
   * 
   * @return a description of the Saver suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Writes to a destination that is in libsvm format.\n\n"
      + "For more information about libsvm see:\n\n"
      + "http://www.csie.ntu.edu.tw/~cjlin/libsvm/";
  }

<<<<<<< HEAD
=======
=======
  public LibSVMSaver(){
    resetOptions();
  }
  
  /**
   * Returns a string describing this Saver
   * 
   * @return 		a description of the Saver suitable for
   * 			displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "Writes to a destination that is in libsvm format.\n\n"
      + "For more information about libsvm see:\n\n"
      + "http://www.csie.ntu.edu.tw/~cjlin/libsvm/";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tThe class index\n" + "\t(default: last)",
      "c", 1, "-c <class index>"));

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
  public Enumeration listOptions() {
    Vector      result;
    
    result = new Vector();
    
    Enumeration en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement(en.nextElement());
    
    result.addElement(
        new Option(
            "\tThe class index\n"
            + "\t(default: last)",
            "c", 1, "-c <class index>"));
    
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
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    result.add("-c");
    result.add(getClassIndex());

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
   * -i &lt;the input file&gt;
   *  The input file
   * </pre>
   * 
   * <pre>
   * -o &lt;the output file&gt;
   *  The output file
   * </pre>
   * 
   * <pre>
   * -c &lt;class index&gt;
   *  The class index
   *  (default: last)
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

    tmpStr = Utils.getOption('c', options);
    if (tmpStr.length() != 0) {
      setClassIndex(tmpStr);
    } else {
      setClassIndex("last");
    }

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
  }

  /**
   * Returns a description of the file type.
   * 
   * @return a short file description
   */
  @Override
  public String getFileDescription() {
    return "libsvm data files";
  }

  /**
   * Resets the Saver
   */
  @Override
<<<<<<< HEAD
=======
=======
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return (String[]) result.toArray(new String[result.size()]);	  
  }

  /**
   * Parses the options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -i &lt;the input file&gt;
   *  The input file</pre>
   * 
   * <pre> -o &lt;the output file&gt;
   *  The output file</pre>
   * 
   * <pre> -c &lt;class index&gt;
   *  The class index
   *  (default: last)</pre>
   * 
   <!-- options-end -->
   *
   * @param options	the options to use
   * @throws Exception	if setting of options fails
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;

    tmpStr = Utils.getOption('c', options);
    if (tmpStr.length() != 0)
      setClassIndex(tmpStr);
    else
      setClassIndex("last");
    
    super.setOptions(options);
  }
  
  /**
   * Returns a description of the file type.
   *
   * @return a short file description
   */
  public String getFileDescription() {
    return "libsvm data files";
  }
  
  /**
   * Resets the Saver 
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void resetOptions() {
    super.resetOptions();
    setFileExtension(LibSVMLoader.FILE_EXTENSION);
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String classIndexTipText() {
    return "Sets the class index (\"first\" and \"last\" are valid values)";
  }

  /**
   * Get the index of the class attribute.
<<<<<<< HEAD
   * 
   * @return the index of the class attribute
=======
<<<<<<< HEAD
   * 
   * @return the index of the class attribute
=======
   *
   * @return 		the index of the class attribute
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getClassIndex() {
    return m_ClassIndex.getSingleIndex();
  }

  /**
   * Sets index of the class attribute.
<<<<<<< HEAD
   * 
   * @param value the index of the class attribute
=======
<<<<<<< HEAD
   * 
   * @param value the index of the class attribute
=======
   *
   * @param value 	the index of the class attribute
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setClassIndex(String value) {
    m_ClassIndex.setSingleIndex(value);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the Capabilities of this saver.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();

<<<<<<< HEAD
=======
=======
  /** 
   * Returns the Capabilities of this saver.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.NUMERIC_CLASS);
    result.enable(Capability.DATE_CLASS);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result;
  }

  /**
   * Sets instances that should be stored.
   * 
   * @param instances the instances
   */
  @Override
  public void setInstances(Instances instances) {
    m_ClassIndex.setUpper(instances.numAttributes() - 1);
    instances.setClassIndex(m_ClassIndex.getIndex());

    super.setInstances(instances);
  }

  /**
   * turns the instance into a libsvm row
   * 
   * @param inst the instance to transform
   * @return the generated libsvm row
   */
  protected String instanceToLibsvm(Instance inst) {
    StringBuffer result;
    int i;

<<<<<<< HEAD
=======
=======
    
    return result;
  }
  
  /**
   * Sets instances that should be stored.
   *
   * @param instances 	the instances
   */
  public void setInstances(Instances instances) {
    m_ClassIndex.setUpper(instances.numAttributes() - 1);
    instances.setClassIndex(m_ClassIndex.getIndex());
    
    super.setInstances(instances);
  }
  
  /**
   * turns the instance into a libsvm row
   * 
   * @param inst	the instance to transform
   * @return		the generated libsvm row
   */
  protected String instanceToLibsvm(Instance inst) {
    StringBuffer	result;
    int			i;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // class
    result = new StringBuffer("" + inst.classValue());

    // attributes
    for (i = 0; i < inst.numAttributes(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (i == inst.classIndex()) {
        continue;
      }
      if (inst.value(i) == 0) {
        continue;
      }
      result.append(" " + (i + 1) + ":" + inst.value(i));
    }

    return result.toString();
  }

<<<<<<< HEAD
=======
=======
      if (i == inst.classIndex())
	continue;
      if (inst.value(i) == 0)
	continue;
      result.append(" " + (i+1) + ":" + inst.value(i));
    }
    
    return result.toString();
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Saves an instances incrementally. Structure has to be set by using the
   * setStructure() method or setInstances() method.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param inst the instance to save
   * @throws IOException throws IOEXception if an instance cannot be saved
   *           incrementally.
   */
  @Override
  public void writeIncremental(Instance inst) throws IOException {
    int writeMode = getWriteMode();
    Instances structure = getInstances();
    PrintWriter outW = null;

    if ((getRetrieval() == BATCH) || (getRetrieval() == NONE)) {
      throw new IOException("Batch and incremental saving cannot be mixed.");
    }

    if (getWriter() != null) {
      outW = new PrintWriter(getWriter());
    }

    if (writeMode == WAIT) {
      if (structure == null) {
        setWriteMode(CANCEL);
        if (inst != null) {
          System.err
            .println("Structure (Header Information) has to be set in advance");
        }
      } else {
        setWriteMode(STRUCTURE_READY);
      }
      writeMode = getWriteMode();
    }

    if (writeMode == CANCEL) {
      if (outW != null) {
        outW.close();
      }
      cancel();
    }

<<<<<<< HEAD
=======
=======
   * @param inst 		the instance to save
   * @throws IOException 	throws IOEXception if an instance cannot be 
   * 				saved incrementally.
   */  
  public void writeIncremental(Instance inst) throws IOException{
    int writeMode = getWriteMode();
    Instances structure = getInstances();
    PrintWriter outW = null;
    
    if ((getRetrieval() == BATCH) || (getRetrieval() == NONE))
      throw new IOException("Batch and incremental saving cannot be mixed.");

    if (getWriter() != null)
      outW = new PrintWriter(getWriter());
    
    if (writeMode == WAIT) {
      if (structure == null) {
	setWriteMode(CANCEL);
	if (inst != null)
	  System.err.println("Structure (Header Information) has to be set in advance");
      }
      else {
	setWriteMode(STRUCTURE_READY);
      }
      writeMode = getWriteMode();
    }
    
    if (writeMode == CANCEL) {
      if (outW != null)
	outW.close();
      cancel();
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // header
    if (writeMode == STRUCTURE_READY) {
      setWriteMode(WRITE);
      // no header
      writeMode = getWriteMode();
    }

    // row
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (writeMode == WRITE) {
      if (structure == null) {
        throw new IOException("No instances information available.");
      }

      if (inst != null) {
        // write instance
        if ((retrieveFile() == null) && (outW == null)) {
          System.out.println(instanceToLibsvm(inst));
        } else {
          outW.println(instanceToLibsvm(inst));
          m_incrementalCounter++;
          // flush every 100 instances
          if (m_incrementalCounter > 100) {
            m_incrementalCounter = 0;
            outW.flush();
          }
        }
      } else {
        // close
        if (outW != null) {
          outW.flush();
          outW.close();
        }
        m_incrementalCounter = 0;
        resetStructure();
        outW = null;
        resetWriter();
      }
    }
  }

  /**
   * Writes a Batch of instances
   * 
   * @throws IOException throws IOException if saving in batch mode is not
   *           possible
   */
  @Override
  public void writeBatch() throws IOException {
    if (getInstances() == null) {
      throw new IOException("No instances to save");
    }

    if (getRetrieval() == INCREMENTAL) {
      throw new IOException("Batch and incremental saving cannot be mixed.");
    }

<<<<<<< HEAD
=======
=======
    if (writeMode == WRITE){
      if (structure == null)
	throw new IOException("No instances information available.");
      
      if (inst != null) {
	//write instance 
	if ((retrieveFile() == null) && (outW == null)) {
	  System.out.println(instanceToLibsvm(inst));
	}
	else {
	  outW.println(instanceToLibsvm(inst));
	  m_incrementalCounter++;
	  //flush every 100 instances
	  if (m_incrementalCounter > 100){
	    m_incrementalCounter = 0;
	    outW.flush();
	  }
	}
      }
      else{
	//close
	if (outW != null) {
	  outW.flush();
	  outW.close();
	}
	m_incrementalCounter = 0;
	resetStructure();
	outW = null;
	resetWriter();
      }
    }
  }
  
  /**
   * Writes a Batch of instances
   * 
   * @throws IOException 	throws IOException if saving in batch mode 
   * 				is not possible
   */
  public void writeBatch() throws IOException {
    if (getInstances() == null)
      throw new IOException("No instances to save");
    
    if (getRetrieval() == INCREMENTAL)
      throw new IOException("Batch and incremental saving cannot be mixed.");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setRetrieval(BATCH);
    setWriteMode(WRITE);

    if ((retrieveFile() == null) && (getWriter() == null)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      for (int i = 0; i < getInstances().numInstances(); i++) {
        System.out.println(instanceToLibsvm(getInstances().instance(i)));
      }
      setWriteMode(WAIT);
    } else {
      PrintWriter outW = new PrintWriter(getWriter());
      for (int i = 0; i < getInstances().numInstances(); i++) {
        outW.println(instanceToLibsvm(getInstances().instance(i)));
      }
<<<<<<< HEAD
=======
=======
      for (int i = 0; i < getInstances().numInstances(); i++)
	System.out.println(instanceToLibsvm(getInstances().instance(i)));
      setWriteMode(WAIT);
    }
    else {
      PrintWriter outW = new PrintWriter(getWriter());
      for (int i = 0; i < getInstances().numInstances(); i++)
	outW.println(instanceToLibsvm(getInstances().instance(i)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      outW.flush();
      outW.close();
      setWriteMode(WAIT);
      outW = null;
      resetWriter();
      setWriteMode(CANCEL);
    }
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
    return RevisionUtils.extract("$Revision: 10203 $");
  }

  /**
   * Main method.
   * 
   * @param args should contain the options of a Saver.
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 8011 $");
  }
  
  /**
   * Main method.
   *
   * @param args 	should contain the options of a Saver.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    runFileSaver(new LibSVMSaver(), args);
  }
}
