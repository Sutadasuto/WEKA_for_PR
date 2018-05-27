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
 * AssociatorEvaluation.java
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

package weka.associations;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Enumeration;

import weka.core.Drawable;
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
import weka.core.converters.ConverterUtils.DataSource;

/**
 * Class for evaluating Associaters.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10172 $
 */
public class AssociatorEvaluation implements RevisionHandler {

  /** the result string */
  protected StringBuffer m_Result;

<<<<<<< HEAD
=======
=======
import weka.core.Drawable;
import weka.core.converters.ConverterUtils.DataSource;

import java.util.Enumeration;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Class for evaluating Associaters.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.5 $
 */
public class AssociatorEvaluation
  implements RevisionHandler {

  /** the result string */
  protected StringBuffer m_Result;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * default constructor
   */
  public AssociatorEvaluation() {
    super();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_Result = new StringBuffer();
  }

  /**
   * Generates an option string to output on the commandline.
   * 
   * @param associator the associator to generate the string for
   * @return the option string
   */
  protected static String makeOptionString(Associator associator) {
    StringBuffer text;

    text = new StringBuffer();

<<<<<<< HEAD
=======
=======
    
    m_Result = new StringBuffer();
  }
  
  /**
   * Generates an option string to output on the commandline.
   * 
   * @param associator	the associator to generate the string for
   * @return		the option string
   */
  protected static String makeOptionString(Associator associator) {
    StringBuffer	text;
    
    text = new StringBuffer();   
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // general options
    text.append("\nGeneral options:\n\n");
    text.append("-t <training file>\n");
    text.append("\tThe name of the training file.\n");
    text.append("-g <name of graph file>\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    text
      .append("\tOutputs the graph representation (if supported) of the associator to a file.\n");

    // associator specific options, if any
    if (associator instanceof OptionHandler) {
      text.append("\nOptions specific to "
        + associator.getClass().getName().replaceAll(".*\\.", "") + ":\n\n");

      Enumeration<Option> enm = ((OptionHandler) associator).listOptions();
      while (enm.hasMoreElements()) {
        Option option = enm.nextElement();
        text.append(option.synopsis() + "\n");
        text.append(option.description() + "\n");
      }
    }

<<<<<<< HEAD
=======
=======
    text.append("\tOutputs the graph representation (if supported) of the associator to a file.\n");
    
    // associator specific options, if any
    if (associator instanceof OptionHandler) {
      text.append(
	  "\nOptions specific to " 
	  + associator.getClass().getName().replaceAll(".*\\.", "") + ":\n\n");
      
      Enumeration enm = ((OptionHandler) associator).listOptions();
      while (enm.hasMoreElements()) {
	Option option = (Option) enm.nextElement();
	text.append(option.synopsis() + "\n");
	text.append(option.description() + "\n");
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return text.toString();
  }

  /**
   * Evaluates an associator with the options given in an array of strings.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param associatorString class of associator as a string
   * @param options the array of string containing the options
   * @throws Exception if model could not be evaluated successfully
   * @return a string describing the results
   */
  public static String evaluate(String associatorString, String[] options)
    throws Exception {
    Associator associator;
<<<<<<< HEAD
=======
=======
   *
   * @param associatorString 	class of associator as a string
   * @param options 		the array of string containing the options
   * @throws Exception 		if model could not be evaluated successfully
   * @return 			a string describing the results 
   */
  public static String evaluate(String associatorString, String[] options) throws Exception {
    Associator associator;	 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Create associator
    try {
      associator = (Associator) Class.forName(associatorString).newInstance();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception e) {
      throw new Exception("Can't find class with name " + associatorString
        + '.');
    }

    return evaluate(associator, options);
  }

  /**
   * Evaluates the associator with the given commandline options and returns the
   * evaluation string.
   * 
   * @param associator the Associator to evaluate
   * @param options the commandline options
   * @return the generated output string
   * @throws Exception if evaluation fails
   */
  public static String evaluate(Associator associator, String[] options)
<<<<<<< HEAD
=======
=======
    }
    catch (Exception e) {
      throw new Exception("Can't find class with name " + associatorString + '.');
    }
    
    return evaluate(associator, options);
  }
  
  /**
   * Evaluates the associator with the given commandline options and returns
   * the evaluation string.
   * 
   * @param associator	the Associator to evaluate
   * @param options	the commandline options
   * @return		the generated output string
   * @throws Exception	if evaluation fails
   */
  public static String evaluate(Associator associator, String[] options) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    throws Exception {

    String trainFileString = "";
    String graphFileName = "";
    AssociatorEvaluation eval;
    DataSource loader;

    // help?
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (Utils.getFlag('h', options)) {
      throw new Exception("\nHelp requested.\n" + makeOptionString(associator));
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
      throw new Exception("\nHelp requested.\n" + makeOptionString(associator));
    
    try {
      // general options
      trainFileString = Utils.getOption('t', options);
      if (trainFileString.length() == 0) 
	throw new Exception("No training file given!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      loader = new DataSource(trainFileString);

      graphFileName = Utils.getOption('g', options);

      // associator specific options
      if (associator instanceof OptionHandler) {
        ((OptionHandler) associator).setOptions(options);
      }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      // left-over options?
      Utils.checkForRemainingOptions(options);
    } catch (Exception e) {
      throw new Exception("\nWeka exception: " + e.getMessage() + "\n"
        + makeOptionString(associator));
    }

    // load file and build associations
    eval = new AssociatorEvaluation();
    String results = eval.evaluate(associator,
      new Instances(loader.getDataSet()));
<<<<<<< HEAD
=======
=======
      
      // left-over options?
      Utils.checkForRemainingOptions(options);
    }
    catch (Exception e) {
      throw new Exception(
	  "\nWeka exception: " 
	  + e.getMessage() + "\n" 
	  + makeOptionString(associator));
    }
    
    // load file and build associations
    eval = new AssociatorEvaluation();
    String results = eval.evaluate(associator, new Instances(loader.getDataSet()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // If associator is drawable output string describing graph
    if ((associator instanceof Drawable) && (graphFileName.length() != 0)) {
      BufferedWriter writer = new BufferedWriter(new FileWriter(graphFileName));
      writer.write(((Drawable) associator).graph());
      writer.newLine();
      writer.flush();
      writer.close();
    }

    return results;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Evaluates the associator with the given commandline options and returns the
   * evaluation string.
   * 
   * @param associator the Associator to evaluate
   * @param data the data to run the associator with
   * @return the generated output string
   * @throws Exception if evaluation fails
   */
  public String evaluate(Associator associator, Instances data)
    throws Exception {

    long startTime;
    long endTime;

<<<<<<< HEAD
=======
=======
  
  /**
   * Evaluates the associator with the given commandline options and returns
   * the evaluation string.
   * 
   * @param associator	the Associator to evaluate
   * @param data	the data to run the associator with
   * @return		the generated output string
   * @throws Exception	if evaluation fails
   */
  public String evaluate(Associator associator, Instances data) 
    throws Exception {
    
    long startTime;
    long endTime;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // build associations
    startTime = System.currentTimeMillis();
    associator.buildAssociations(data);
    endTime = System.currentTimeMillis();

    m_Result = new StringBuffer(associator.toString());
    m_Result.append("\n=== Evaluation ===\n\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Result.append("Elapsed time: "
      + (((double) (endTime - startTime)) / 1000) + "s");
    m_Result.append("\n");

<<<<<<< HEAD
=======
=======
    m_Result.append("Elapsed time: " + (((double) (endTime - startTime)) / 1000) + "s");
    m_Result.append("\n");
    
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

    AssociatorEvaluation cmp = (AssociatorEvaluation) obj;

    // TODO: better comparison???
    String associatingResults1 = m_Result.toString().replaceAll(
      "Elapsed time.*", "");
    String associatingResults2 = cmp.m_Result.toString().replaceAll(
      "Elapsed time.*", "");
    if (!associatingResults1.equals(associatingResults2)) {
      return false;
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
    
    AssociatorEvaluation cmp = (AssociatorEvaluation) obj;
    
    // TODO: better comparison???
    String associatingResults1 = m_Result.toString().replaceAll("Elapsed time.*", "");
    String associatingResults2 = cmp.m_Result.toString().replaceAll("Elapsed time.*", "");
    if (!associatingResults1.equals(associatingResults2)) 
      return false;
    
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
    return RevisionUtils.extract("$Revision: 10172 $");
  }

  /**
   * A test method for this class. Just extracts the first command line argument
   * as an associator class name and calls evaluate.
   * 
   * @param args an array of command line arguments, the first of which must be
   *          the class name of an associator.
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
    return RevisionUtils.extract("$Revision: 1.5 $");
  }

  /**
   * A test method for this class. Just extracts the first command line
   * argument as an associator class name and calls evaluate.
   * 
   * @param args 	an array of command line arguments, the first of which
   * 			must be the class name of an associator.
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
      String associator = args[0];
      args[0] = "";
      System.out.println(evaluate(associator, args));
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
