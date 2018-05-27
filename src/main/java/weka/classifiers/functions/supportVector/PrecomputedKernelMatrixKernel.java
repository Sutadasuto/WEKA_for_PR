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
 *    PrecomputedKernelMatrixKernel.java
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
package weka.classifiers.functions.supportVector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Copyable;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.matrix.Matrix;

/**
 * 
 <!-- globalinfo-start --> This kernel is based on a static kernel matrix that
 * is read from a file. Instances must have a single nominal attribute
 * (excluding the class). This attribute must be the first attribute in the file
 * and its values are used to reference rows/columns in the kernel matrix. The
 * second attribute must be the class attribute.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D
 *  Enables debugging output (if available) to be printed.
 *  (default: off)
 * </pre>
 *
 * <pre>
 * -M &lt;file name&gt;
 *  The file name of the file that holds the kernel matrix.
 *  (default: kernelMatrix.matrix)
 * </pre>
 *
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14534 $
<<<<<<< HEAD
=======
=======
import weka.core.Option;
import weka.core.matrix.Matrix;
import weka.core.Copyable;
import weka.core.Instances;
import weka.core.Utils;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;

import java.util.Enumeration;
import java.util.Vector;

import java.io.FileReader;
import java.io.File;

/**
 *
 <!-- globalinfo-start -->
 * This kernel is based on a static kernel matrix that is read from a file. Instances must have a single nominal attribute (excluding the class). This attribute must be the first attribute in the file and its values are used to reference rows/columns in the kernel matrix. The second attribute must be the class attribute.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  Enables debugging output (if available) to be printed.
 *  (default: off)</pre>
 * 
 * <pre> -no-checks
 *  Turns off all checks - use with caution!
 *  (default: checks on)</pre>
 * 
 * <pre> -M &lt;file name&gt;
 *  The file name of the file that holds the kernel matrix.
 *  (default: kernelMatrix.matrix)</pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 9897 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class PrecomputedKernelMatrixKernel extends Kernel implements Copyable {

  /** for serialization */
  static final long serialVersionUID = -321831645846363333L;

  /** The file holding the kernel matrix. */
  protected File m_KernelMatrixFile = new File("kernelMatrix.matrix");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The kernel matrix. */
  protected Matrix m_KernelMatrix;

  /** A classifier counter. */
  protected int m_Counter;

<<<<<<< HEAD
=======
=======
	  
  /** The kernel matrix. */
  protected Matrix m_KernelMatrix;
	  
  /** A classifier counter. */
  protected int m_Counter;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Return a shallow copy of this kernel
   * 
   * @return a shallow copy of this kernel
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Object copy() {
    PrecomputedKernelMatrixKernel newK = new PrecomputedKernelMatrixKernel();

    newK.setKernelMatrix(m_KernelMatrix);
    newK.setKernelMatrixFile(m_KernelMatrixFile);
    newK.m_Counter = m_Counter;

    return newK;
  }

  /**
   * Returns a string describing the kernel
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  @Override
  public String globalInfo() {
    return "This kernel is based on a static kernel matrix that is read from a file. "
      + "Instances must have a single nominal attribute (excluding the class). "
      + "This attribute must be the first attribute in the file and its values are "
      + "used to reference rows/columns in the kernel matrix. The second attribute "
      + "must be the class attribute.";
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tThe file name of the file that holds the kernel matrix.\n"
        + "\t(default: kernelMatrix.matrix)", "M", 1, "-M <file name>"));

    result.addAll(Collections.list(super.listOptions()));
<<<<<<< HEAD
=======
=======
  public Object copy() {
    PrecomputedKernelMatrixKernel newK = new PrecomputedKernelMatrixKernel();
    
    newK.setKernelMatrix(m_KernelMatrix);
    newK.setKernelMatrixFile(m_KernelMatrixFile);
    newK.m_Counter = m_Counter;
    
    return newK;
  }

 
  /**
   * Returns a string describing the kernel
   * 
   * @return a description suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return 
      "This kernel is based on a static kernel matrix that is read from a file. " +
      "Instances must have a single nominal attribute (excluding the class). " +
      "This attribute must be the first attribute in the file and its values are " +
      "used to reference rows/columns in the kernel matrix. The second attribute " +
      "must be the class attribute.";
  }
	  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector		result;
	    
    result = new Vector();

    Enumeration en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement(en.nextElement());

    result.addElement(new Option(
                                 "\tThe file name of the file that holds the kernel matrix.\n"
                                 + "\t(default: kernelMatrix.matrix)",
                                 "M", 1, "-M <file name>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.elements();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -D
   *  Enables debugging output (if available) to be printed.
   *  (default: off)
   * </pre>
   *
   * <pre>
   * -M &lt;file name&gt;
   *  The file name of the file that holds the kernel matrix.
   *  (default: kernelMatrix.matrix)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('M', options);
    if (tmpStr.length() != 0) {
      setKernelMatrixFile(new File(tmpStr));
    } else {
      setKernelMatrixFile(new File("kernelMatrix.matrix"));
    }

<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Enables debugging output (if available) to be printed.
   *  (default: off)</pre>
   * 
   * <pre> -no-checks
   *  Turns off all checks - use with caution!
   *  (default: checks on)</pre>
   * 
   * <pre> -M &lt;file name&gt;
   *  The file name of the file that holds the kernel matrix.
   *  (default: kernelMatrix.matrix)</pre>
   * 
   <!-- options-end -->
   * 
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
	    
    tmpStr = Utils.getOption('M', options);
    if (tmpStr.length() != 0)
      setKernelMatrixFile(new File(tmpStr));
    else
      setKernelMatrixFile(new File("kernelMatrix.matrix"));
	    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setOptions(options);
  }

  /**
   * Gets the current settings of the Kernel.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    int       i;
    Vector<String>    result;
    String[]  options;

    result = new Vector<String>();
	    
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    result.add("-M");
    result.add("" + getKernelMatrixFile());

<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
=======
<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
=======
    return (String[]) result.toArray(new String[result.size()]);	  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param id1 the index of instance 1
   * @param id2 the index of instance 2
   * @param inst1 the instance 1 object
   * @return the dot product
   * @throws Exception if something goes wrong
   */
  @Override
  public double eval(int id1, int id2, Instance inst1) throws Exception {

    if (m_KernelMatrix == null) {
      throw new IllegalArgumentException(
        "Kernel matrix has not been loaded successfully.");
    }
    int index1 = -1;
    if (id1 > -1) {
      index1 = (int) m_data.instance(id1).value(0);
    } else {
      index1 = (int) inst1.value(0);
    }
    int index2 = (int) m_data.instance(id2).value(0);
    return m_KernelMatrix.get(index1, index2);
  }

  /**
   * initializes variables etc.
   * 
   * @param data the data to use
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @param id1   	the index of instance 1
   * @param id2		the index of instance 2
   * @param inst1	the instance 1 object
   * @return 		the dot product
   * @throws Exception 	if something goes wrong
   */
  public double eval(int id1, int id2, Instance inst1)
    throws Exception {
			
    if (m_KernelMatrix == null) {
      throw new IllegalArgumentException("Kernel matrix has not been loaded successfully.");
    }
    int index1 = -1;
    if (id1 > -1) { 
      index1 = (int)m_data.instance(id1).value(0);
    } else {
      index1 = (int)inst1.value(0);
    }
    int index2 = (int)m_data.instance(id2).value(0);
    return m_KernelMatrix.get(index1, index2);
  }
	  
  /**
   * initializes variables etc.
   * 
   * @param data	the data to use
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected void initVars(Instances data) {
    super.initVars(data);

    try {
      if (m_KernelMatrix == null) {
        m_KernelMatrix = new Matrix(new FileReader(m_KernelMatrixFile));
<<<<<<< HEAD
        // System.err.println("Read kernel matrix.");
=======
<<<<<<< HEAD
        // System.err.println("Read kernel matrix.");
=======
        //        System.err.println("Read kernel matrix.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception e) {
      System.err.println("Problem reading matrix from " + m_KernelMatrixFile);
    }
    m_Counter++;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // System.err.print("Building classifier: " + m_Counter + "\r");
  }

  /**
   * Returns the Capabilities of this kernel.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);

    return result;
  }

  /**
   * Sets the file holding the kernel matrix
   * 
   * @param f the file holding the matrix
<<<<<<< HEAD
=======
=======
    //    System.err.print("Building classifier: " + m_Counter + "\r");
  }

  /** 
   * Returns the Capabilities of this kernel.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
	    
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
	    
    return result;
  }
	  
  /**
   * Sets the file holding the kernel matrix
   * 
   * @param value	the exponent value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setKernelMatrixFile(File f) {
    m_KernelMatrixFile = f;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the file containing the kernel matrix.
   * 
   * @return the exponent value
<<<<<<< HEAD
=======
=======
	  
  /**
   * Gets the file containing the kernel matrix.
   * 
   * @return		the exponent value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public File getKernelMatrixFile() {
    return m_KernelMatrixFile;
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
  public String kernelMatrixFileTipText() {
    return "The file holding the kernel matrix.";
  }

  /**
<<<<<<< HEAD
   * Set the kernel matrix. This method is used by the unit test for this class,
   * as it loads at test matrix as a system resource.
   * 
=======
<<<<<<< HEAD
   * Set the kernel matrix. This method is used by the unit test for this class,
   * as it loads at test matrix as a system resource.
   * 
=======
   * Set the kernel matrix. This method is used by the
   * unit test for this class, as it loads at test matrix
   * as a system resource.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param km the kernel matrix to use
   */
  protected void setKernelMatrix(Matrix km) {
    m_KernelMatrix = km;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * returns a string representation for the Kernel
   * 
   * @return a string representaiton of the kernel
   */
  @Override
  public String toString() {
    return "Using kernel matrix from file with name: " + getKernelMatrixFile();
  }

  /**
   * Frees the memory used by the kernel. (Useful with kernels which use cache.)
   * This function is called when the training is done. i.e. after that, eval
   * will be called with id1 == -1.
   */
  @Override
<<<<<<< HEAD
=======
=======
		  
  /**
   * returns a string representation for the Kernel
   * 
   * @return 		a string representaiton of the kernel
   */
  public String toString() {
    return "Using kernel matrix from file with name: " + getKernelMatrixFile();
  }
	  
  /**
   * Frees the memory used by the kernel.
   * (Useful with kernels which use cache.)
   * This function is called when the training is done.
   * i.e. after that, eval will be called with id1 == -1.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void clean() {
    // do nothing
  }

  /**
   * Returns the number of kernel evaluation performed.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of kernel evaluation performed.
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the number of kernel evaluation performed.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int numEvals() {
    return 0;
  }

  /**
   * Returns the number of dot product cache hits.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the number of dot product cache hits, or -1 if not supported by
   *         this kernel.
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the number of dot product cache hits, or -1 if not supported by this kernel.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int numCacheHits() {
    return 0;
  }

  /**
   * Returns the revision string.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
  }
}
<<<<<<< HEAD
=======
=======
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9897 $");
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
