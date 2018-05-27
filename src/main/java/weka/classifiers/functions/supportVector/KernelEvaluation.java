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
 * KernelEvaluation.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.classifiers.functions.supportVector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Enumeration;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Class for evaluating Kernels.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 14534 $
 */
public class KernelEvaluation implements RevisionHandler {

  /** the result string */
  protected StringBuffer m_Result;

  /** the kernel evaluation results */
  protected double[][] m_Evaluations;

  /** the number of performed evaluations */
  protected int m_NumEvals;

  /** the number of cache hits */
  protected int m_NumCacheHits;

  /** user-supplied options */
  protected String[] m_Options;

<<<<<<< HEAD
=======
=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Enumeration;

/**
 * Class for evaluating Kernels.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.3 $
 */
public class KernelEvaluation
  implements RevisionHandler {

  /** the result string */
  protected StringBuffer m_Result;
  
  /** the kernel evaluation results */
  protected double[][] m_Evaluations;
  
  /** the number of performed evaluations */
  protected int m_NumEvals;
  
  /** the number of cache hits */
  protected int m_NumCacheHits;
  
  /** user-supplied options */
  protected String[] m_Options;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * default constructor
   */
  public KernelEvaluation() {
    super();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_Result = new StringBuffer();
    m_Evaluations = new double[0][0];
    m_Options = new String[0];
    m_NumEvals = 0;
    m_NumCacheHits = 0;
  }

  /**
   * sets the option the user supplied for the kernel
   * 
   * @param options options that were supplied for the kernel
   */
  public void setUserOptions(String[] options) {
    m_Options = options.clone();
  }

  /**
   * returns the options the user supplied for the kernel
   * 
   * @return the user supplied options for the kernel
   */
  public String[] getUserOptions() {
    return m_Options.clone();
  }

  /**
   * Generates an option string to output on the commandline.
   * 
   * @param Kernel the Kernel to generate the string for
   * @return the option string
   */
  protected static String makeOptionString(Kernel Kernel) {
    StringBuffer text;

    text = new StringBuffer();

<<<<<<< HEAD
=======
=======
    
    m_Result       = new StringBuffer();
    m_Evaluations  = new double[0][0];
    m_Options      = new String[0];
    m_NumEvals     = 0;
    m_NumCacheHits = 0;
  }
  
  /**
   * sets the option the user supplied for the kernel
   * 
   * @param options	options that were supplied for the kernel
   */
  public void setUserOptions(String[] options) {
    m_Options = (String[]) options.clone();
  }
  
  /**
   * returns the options the user supplied for the kernel
   * 
   * @return		the user supplied options for the kernel
   */
  public String[] getUserOptions() {
    return (String[]) m_Options.clone();
  }
  
  /**
   * Generates an option string to output on the commandline.
   * 
   * @param Kernel	the Kernel to generate the string for
   * @return		the option string
   */
  protected static String makeOptionString(Kernel Kernel) {
    StringBuffer	text;
    
    text = new StringBuffer();   
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // general options
    text.append("\nGeneral options:\n\n");
    text.append("-t <training file>\n");
    text.append("\tThe name of the training file.\n");
    text.append("-c <class index>\n");
    text.append("\tSets index of class attribute (default: last).\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Kernel specific options, if any
    if (Kernel instanceof OptionHandler) {
      text.append("\nOptions specific to "
        + Kernel.getClass().getName().replaceAll(".*\\.", "") + ":\n\n");

      Enumeration<Option> enm = ((OptionHandler) Kernel).listOptions();
      while (enm.hasMoreElements()) {
        Option option = enm.nextElement();
        text.append(option.synopsis() + "\n");
        text.append(option.description() + "\n");
      }
    }

    return text.toString();
  }

  /**
   * Evaluates the Kernel with the given commandline options and returns the
   * evaluation string.
   * 
   * @param Kernel the Kernel to evaluate
   * @param options the commandline options
   * @return the generated output string
   * @throws Exception if evaluation fails
   */
  public static String evaluate(Kernel Kernel, String[] options)
<<<<<<< HEAD
=======
=======
    
    // Kernel specific options, if any
    if (Kernel instanceof OptionHandler) {
      text.append(
	  "\nOptions specific to " 
	  + Kernel.getClass().getName().replaceAll(".*\\.", "") + ":\n\n");
      
      Enumeration enm = ((OptionHandler) Kernel).listOptions();
      while (enm.hasMoreElements()) {
	Option option = (Option) enm.nextElement();
	text.append(option.synopsis() + "\n");
	text.append(option.description() + "\n");
      }
    }
    
    return text.toString();
  }
  
  /**
   * Evaluates the Kernel with the given commandline options and returns
   * the evaluation string.
   * 
   * @param Kernel	the Kernel to evaluate
   * @param options	the commandline options
   * @return		the generated output string
   * @throws Exception	if evaluation fails
   */
  public static String evaluate(Kernel Kernel, String[] options) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {

    String trainFileString = "";
    BufferedReader reader;
    KernelEvaluation eval;
    String classIndexString;
    int classIndex = -1;
    Instances train;
    String[] userOptions;

    // help?
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (Utils.getFlag('h', options)) {
      throw new Exception("\nHelp requested.\n" + makeOptionString(Kernel));
    }

    try {
      // general options
      trainFileString = Utils.getOption('t', options);
      if (trainFileString.length() == 0) {
        throw new Exception("No training file given!");
      }
<<<<<<< HEAD
=======
=======
    if (Utils.getFlag('h', options))
      throw new Exception("\nHelp requested.\n" + makeOptionString(Kernel));
    
    try {
      // general options
      trainFileString = Utils.getOption('t', options);
      if (trainFileString.length() == 0) 
	throw new Exception("No training file given!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      reader = new BufferedReader(new FileReader(trainFileString));

      classIndexString = Utils.getOption('c', options);
      if (classIndexString.length() != 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (classIndexString.equals("first")) {
          classIndex = 1;
        } else if (classIndexString.equals("last")) {
          classIndex = -1;
        } else {
          classIndex = Integer.parseInt(classIndexString);
        }
      }

      // Kernel specific options
      userOptions = options.clone();
      if (Kernel instanceof OptionHandler) {
        ((OptionHandler) Kernel).setOptions(options);
      }

      // left-over options?
      Utils.checkForRemainingOptions(options);
    } catch (Exception e) {
      throw new Exception("\nWeka exception: " + e.getMessage() + "\n"
        + makeOptionString(Kernel));
    }

<<<<<<< HEAD
=======
=======
	if (classIndexString.equals("first"))
	  classIndex = 1;
	else if (classIndexString.equals("last"))
	  classIndex = -1;
	else
	  classIndex = Integer.parseInt(classIndexString);
      }
      
      // Kernel specific options
      userOptions = (String[]) options.clone();
      if (Kernel instanceof OptionHandler) {
        ((OptionHandler) Kernel).setOptions(options);
      }
      
      // left-over options?
      Utils.checkForRemainingOptions(options);
    }
    catch (Exception e) {
      throw new Exception(
	  "\nWeka exception: " 
	  + e.getMessage() + "\n" 
	  + makeOptionString(Kernel));
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // load file and build kernel
    eval = new KernelEvaluation();
    eval.setUserOptions(userOptions);
    train = new Instances(reader);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (classIndex == -1) {
      train.setClassIndex(train.numAttributes() - 1);
    } else {
      train.setClassIndex(classIndex);
    }

<<<<<<< HEAD
=======
=======
    if (classIndex == -1)
      train.setClassIndex(train.numAttributes() - 1);
    else
      train.setClassIndex(classIndex);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return eval.evaluate(Kernel, train);
  }

  /**
   * Evaluates a kernel with the options given in an array of strings.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param kernelString class of kernel as a string
   * @param options the array of string containing the options
   * @throws Exception if model could not be evaluated successfully
   * @return a string describing the results
   */
  public static String evaluate(String kernelString, String[] options)
    throws Exception {
    Kernel kernel;
<<<<<<< HEAD
=======
=======
   *
   * @param kernelString 	class of kernel as a string
   * @param options 		the array of string containing the options
   * @throws Exception 		if model could not be evaluated successfully
   * @return 			a string describing the results 
   */
  public static String evaluate(String kernelString, String[] options) throws Exception {
    Kernel kernel;	 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Create kernel
    try {
      kernel = (Kernel) Class.forName(kernelString).newInstance();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception e) {
      throw new Exception("Can't find class with name " + kernelString + '.');
    }

    return evaluate(kernel, options);
  }

  /**
   * Evaluates the Kernel with the given commandline options and returns the
   * evaluation string.
   * 
   * @param kernel the Kernel to evaluate
   * @param data the data to run the Kernel with
   * @return the generated output string
   * @throws Exception if evaluation fails
   */
  public String evaluate(Kernel kernel, Instances data) throws Exception {

    long startTime;
    long endTime;
    int i;
    int n;

    m_Result = new StringBuffer();

    // build kernel
    startTime = System.currentTimeMillis();
    kernel.getCapabilities().testWithFail(data);
    kernel.buildKernel(data);
    endTime = System.currentTimeMillis();
    m_Result.append("\n=== Model ===\n\n");
    if (Utils.joinOptions(getUserOptions()).trim().length() != 0) {
      m_Result.append("Options: " + Utils.joinOptions(getUserOptions())
        + "\n\n");
    }
<<<<<<< HEAD
=======
=======
    }
    catch (Exception e) {
      throw new Exception("Can't find class with name " + kernelString + '.');
    }
    
    return evaluate(kernel, options);
  }
  
  /**
   * Evaluates the Kernel with the given commandline options and returns
   * the evaluation string.
   * 
   * @param kernel	the Kernel to evaluate
   * @param data	the data to run the Kernel with
   * @return		the generated output string
   * @throws Exception	if evaluation fails
   */
  public String evaluate(Kernel kernel, Instances data) 
    throws Exception {
    
    long 	startTime;
    long 	endTime;
    int 	i;
    int		n;

    m_Result = new StringBuffer();
    
    // build kernel
    startTime = System.currentTimeMillis();
    kernel.buildKernel(data);
    endTime = System.currentTimeMillis();
    m_Result.append("\n=== Model ===\n\n");
    if (Utils.joinOptions(getUserOptions()).trim().length() != 0)
      m_Result.append("Options: " + Utils.joinOptions(getUserOptions()) + "\n\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Result.append(kernel.toString() + "\n");

    // evaluate dataset
    m_Evaluations = new double[data.numInstances()][data.numInstances()];
    for (n = 0; n < data.numInstances(); n++) {
      for (i = n; i < data.numInstances(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_Evaluations[n][i] = kernel.eval(n, i, data.instance(n));
      }
    }

    // test cache for cached kernels
    if (kernel instanceof CachedKernel) {
      for (n = 0; n < data.numInstances(); n++) {
        for (i = n; i < data.numInstances(); i++) {
          m_Evaluations[n][i] = kernel.eval(n, i, data.instance(n));
        }
      }
    }

    m_NumEvals = kernel.numEvals();
    m_NumCacheHits = kernel.numCacheHits();

    // summary
    m_Result.append("\n=== Evaluation ===\n\n");
    if (kernel instanceof CachedKernel) {
      m_Result.append("Cache size   : "
        + ((CachedKernel) kernel).getCacheSize() + "\n");
    }
    m_Result.append("# Evaluations: " + m_NumEvals + "\n");
    m_Result.append("# Cache hits : " + m_NumCacheHits + "\n");
    m_Result.append("Elapsed time : "
      + (((double) (endTime - startTime)) / 1000) + "s\n");

<<<<<<< HEAD
=======
=======
	m_Evaluations[n][i] = kernel.eval(n, i, data.instance(n));
      }
    }
    
    // test cache for cached kernels
    if (kernel instanceof CachedKernel) {
      for (n = 0; n < data.numInstances(); n++) {
	for (i = n; i < data.numInstances(); i++) {
	  m_Evaluations[n][i] = kernel.eval(n, i, data.instance(n));
	}
      }
    }
    
    m_NumEvals     = kernel.numEvals();
    m_NumCacheHits = kernel.numCacheHits();
    
    // summary
    m_Result.append("\n=== Evaluation ===\n\n");
    if (kernel instanceof CachedKernel) {
      m_Result.append("Cache size   : " + ((CachedKernel) kernel).getCacheSize() + "\n");
    }
    m_Result.append("# Evaluations: " + m_NumEvals + "\n");
    m_Result.append("# Cache hits : " + m_NumCacheHits + "\n");
    m_Result.append("Elapsed time : " + (((double) (endTime - startTime)) / 1000) + "s\n");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_Result.toString();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Tests whether the current evaluation object is equal to another evaluation
   * object
   * 
   * @param obj the object to compare against
   * @return true if the two objects are equal
   */
  @Override
  public boolean equals(Object obj) {
    if ((obj == null) || !(obj.getClass().equals(this.getClass()))) {
      return false;
    }

    KernelEvaluation cmp = (KernelEvaluation) obj;

    if (m_NumEvals != cmp.m_NumEvals) {
      return false;
    }
    if (m_NumCacheHits != cmp.m_NumCacheHits) {
      return false;
    }

    if (m_Evaluations.length != cmp.m_Evaluations.length) {
      return false;
    }
    for (int n = 0; n < m_Evaluations.length; n++) {
      for (int i = 0; i < m_Evaluations[n].length; i++) {
        if (Double.isNaN(m_Evaluations[n][i])
          && Double.isNaN(cmp.m_Evaluations[n][i])) {
          continue;
        }
        if (m_Evaluations[n][i] != cmp.m_Evaluations[n][i]) {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * returns a summary string of the evaluation with a no title
   * 
   * @return the summary string
<<<<<<< HEAD
=======
=======
   * Tests whether the current evaluation object is equal to another
   * evaluation object
   *
   * @param obj the object to compare against
   * @return true if the two objects are equal
   */
  public boolean equals(Object obj) {
    if ((obj == null) || !(obj.getClass().equals(this.getClass())))
      return false;
    
    KernelEvaluation cmp = (KernelEvaluation) obj;
    
    if (m_NumEvals != cmp.m_NumEvals) return false;
    if (m_NumCacheHits != cmp.m_NumCacheHits) return false;

    if (m_Evaluations.length != cmp.m_Evaluations.length) 
      return false;
    for (int n = 0; n < m_Evaluations.length; n++) {
      for (int i = 0; i < m_Evaluations[n].length; i++) {
	if (Double.isNaN(m_Evaluations[n][i]) && Double.isNaN(cmp.m_Evaluations[n][i]))
	  continue;
	if (m_Evaluations[n][i] != cmp.m_Evaluations[n][i])
	  return false;
      }
    }
    
    return true;
  }
  
  /**
   * returns a summary string of the evaluation with a no title
   * 
   * @return		the summary string
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String toSummaryString() {
    return toSummaryString("");
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * returns a summary string of the evaluation with a default title
   * 
   * @param title the title to print before the result
   * @return the summary string
   */
  public String toSummaryString(String title) {
    StringBuffer result;

    result = new StringBuffer(title);
    if (title.length() != 0) {
      result.append("\n");
    }
    result.append(m_Result);

    return result.toString();
  }

  /**
   * returns the current result
   * 
   * @return the currently stored result
   * @see #toSummaryString()
   */
  @Override
  public String toString() {
    return toSummaryString();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
  }

  /**
   * A test method for this class. Just extracts the first command line argument
   * as a kernel class name and calls evaluate.
   * 
   * @param args an array of command line arguments, the first of which must be
   *          the class name of a kernel.
<<<<<<< HEAD
=======
=======
  
  /**
   * returns a summary string of the evaluation with a default title
   * 
   * @param title	the title to print before the result
   * @return		the summary string
   */
  public String toSummaryString(String title) {
    StringBuffer	result;
    
    result = new StringBuffer(title);
    if (title.length() != 0)
      result.append("\n");
    result.append(m_Result);
    
    return result.toString();
  }
  
  /**
   * returns the current result
   * 
   * @return		the currently stored result
   * @see		#toSummaryString()
   */
  public String toString() {
    return toSummaryString();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.3 $");
  }

  /**
   * A test method for this class. Just extracts the first command line
   * argument as a kernel class name and calls evaluate.
   * 
   * @param args 	an array of command line arguments, the first of which
   * 			must be the class name of a kernel.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void main(String[] args) {
    try {
      if (args.length == 0) {
<<<<<<< HEAD
        throw new Exception(
          "The first argument must be the class name of a kernel");
=======
<<<<<<< HEAD
        throw new Exception(
          "The first argument must be the class name of a kernel");
=======
	throw new Exception(
	    "The first argument must be the class name of a kernel");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      String kernel = args[0];
      args[0] = "";
      System.out.println(evaluate(kernel, args));
<<<<<<< HEAD
    } catch (Exception ex) {
=======
<<<<<<< HEAD
    } catch (Exception ex) {
=======
    }
    catch (Exception ex) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
