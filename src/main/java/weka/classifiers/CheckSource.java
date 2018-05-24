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
 * CheckSource.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 */

package weka.classifiers;

<<<<<<< HEAD
import java.io.File;
import java.util.Enumeration;
import java.util.Vector;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.converters.ConverterUtils.DataSource;

<<<<<<< HEAD
=======
import java.io.File;
import java.util.Enumeration;
import java.util.Vector;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * A simple class for checking the source generated from Classifiers
 * implementing the <code>weka.classifiers.Sourcable</code> interface.
 * It takes a classifier, the classname of the generated source
 * and the dataset the source was generated with as parameters and tests
 * the output of the built classifier against the output of the generated
 * source. Use option '-h' to display all available commandline options.
<<<<<<< HEAD
 *
 <!-- options-start -->
 * Valid options are: <p/>
 *
 * <pre> -W &lt;classname and options&gt;
 *  The classifier (incl. options) that was used to generate
 *  the source code.</pre>
 *
 * <pre> -S &lt;classname&gt;
 *  The classname of the generated source code.</pre>
 *
 * <pre> -t &lt;file&gt;
 *  The training set with which the source code was generated.</pre>
 *
=======
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -W &lt;classname and options&gt;
 *  The classifier (incl. options) that was used to generate
 *  the source code.</pre>
 * 
 * <pre> -S &lt;classname&gt;
 *  The classname of the generated source code.</pre>
 * 
 * <pre> -t &lt;file&gt;
 *  The training set with which the source code was generated.</pre>
 * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre> -c &lt;index&gt;
 *  The class index of the training set. 'first' and 'last' are
 *  valid indices.
 *  (default: last)</pre>
<<<<<<< HEAD
 *
=======
 * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 <!-- options-end -->
 *
 * Options after -- are passed to the designated classifier (specified with -W).
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 10141 $
=======
 * @version $Revision: 1.4 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @see     weka.classifiers.Sourcable
 */
public class CheckSource
  implements OptionHandler, RevisionHandler {

  /** the classifier used for generating the source code */
  protected Classifier m_Classifier = null;
<<<<<<< HEAD

  /** the generated source code */
  protected Classifier m_SourceCode = null;

  /** the dataset to use for testing */
  protected File m_Dataset = null;

  /** the class index */
  protected int m_ClassIndex = -1;

=======
  
  /** the generated source code */
  protected Classifier m_SourceCode = null;
  
  /** the dataset to use for testing */
  protected File m_Dataset = null;
  
  /** the class index */
  protected int m_ClassIndex = -1;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

=======
  public Enumeration listOptions() {
    Vector result = new Vector();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.addElement(new Option(
        "\tThe classifier (incl. options) that was used to generate\n"
        + "\tthe source code.",
        "W", 1, "-W <classname and options>"));
<<<<<<< HEAD

    result.addElement(new Option(
        "\tThe classname of the generated source code.",
        "S", 1, "-S <classname>"));

    result.addElement(new Option(
        "\tThe training set with which the source code was generated.",
        "t", 1, "-t <file>"));

=======
    
    result.addElement(new Option(
        "\tThe classname of the generated source code.",
        "S", 1, "-S <classname>"));
    
    result.addElement(new Option(
        "\tThe training set with which the source code was generated.",
        "t", 1, "-t <file>"));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.addElement(new Option(
        "\tThe class index of the training set. 'first' and 'last' are\n"
        + "\tvalid indices.\n"
        + "\t(default: last)",
        "c", 1, "-c <index>"));
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result.elements();
  }

  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
<<<<<<< HEAD
   *
   * <pre> -W &lt;classname and options&gt;
   *  The classifier (incl. options) that was used to generate
   *  the source code.</pre>
   *
   * <pre> -S &lt;classname&gt;
   *  The classname of the generated source code.</pre>
   *
   * <pre> -t &lt;file&gt;
   *  The training set with which the source code was generated.</pre>
   *
=======
   * 
   * <pre> -W &lt;classname and options&gt;
   *  The classifier (incl. options) that was used to generate
   *  the source code.</pre>
   * 
   * <pre> -S &lt;classname&gt;
   *  The classname of the generated source code.</pre>
   * 
   * <pre> -t &lt;file&gt;
   *  The training set with which the source code was generated.</pre>
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre> -c &lt;index&gt;
   *  The class index of the training set. 'first' and 'last' are
   *  valid indices.
   *  (default: last)</pre>
<<<<<<< HEAD
   *
   <!-- options-end -->
   *
   * Options after -- are passed to the designated classifier (specified with
=======
   * 
   <!-- options-end -->
   *
   * Options after -- are passed to the designated classifier (specified with 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * -W).
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String      tmpStr;
    String[]    spec;
    String      classname;

    tmpStr = Utils.getOption('W', options);
    if (tmpStr.length() > 0) {
      spec = Utils.splitOptions(tmpStr);
      if (spec.length == 0)
        throw new IllegalArgumentException("Invalid classifier specification string");
      classname = spec[0];
      spec[0]   = "";
      setClassifier((Classifier) Utils.forName(Classifier.class, classname, spec));
    }
    else {
      throw new Exception("No classifier (classname + options) provided!");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() > 0) {
      spec = Utils.splitOptions(tmpStr);
      if (spec.length != 1)
        throw new IllegalArgumentException("Invalid source code specification string");
      classname = spec[0];
      spec[0]   = "";
      setSourceCode((Classifier) Utils.forName(Classifier.class, classname, spec));
    }
    else {
      throw new Exception("No source code (classname) provided!");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    tmpStr = Utils.getOption('t', options);
    if (tmpStr.length() != 0)
      setDataset(new File(tmpStr));
    else
      throw new Exception("No dataset provided!");

    tmpStr = Utils.getOption('c', options);
    if (tmpStr.length() != 0) {
      if (tmpStr.equals("first"))
        setClassIndex(0);
      else if (tmpStr.equals("last"))
        setClassIndex(-1);
<<<<<<< HEAD
      else
=======
      else 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        setClassIndex(Integer.parseInt(tmpStr) - 1);
    }
    else {
      setClassIndex(-1);
    }
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector<String>      result;
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result  = new Vector<String>();

    if (getClassifier() != null) {
      result.add("-W");
<<<<<<< HEAD
      result.add(getClassifier().getClass().getName() + " "
=======
      result.add(getClassifier().getClass().getName() + " " 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          + Utils.joinOptions(((OptionHandler) getClassifier()).getOptions()));
    }

    if (getSourceCode() != null) {
      result.add("-S");
      result.add(getSourceCode().getClass().getName());
    }

    if (getDataset() != null) {
      result.add("-t");
      result.add(m_Dataset.getAbsolutePath());
    }

    result.add("-c");
    if (getClassIndex() == -1)
      result.add("last");
    else if (getClassIndex() == 0)
      result.add("first");
<<<<<<< HEAD
    else
      result.add("" + (getClassIndex() + 1));

=======
    else 
      result.add("" + (getClassIndex() + 1));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result.toArray(new String[result.size()]);
  }

  /**
   * Sets the classifier to use for the comparison.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value       the classifier to use
   */
  public void setClassifier(Classifier value) {
    m_Classifier = value;
  }
<<<<<<< HEAD

  /**
   * Gets the classifier being used for the tests, can be null.
   *
=======
  
  /**
   * Gets the classifier being used for the tests, can be null.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return            the currently set classifier
   */
  public Classifier getClassifier() {
    return m_Classifier;
  }
<<<<<<< HEAD

  /**
   * Sets the class to test.
   *
=======
  
  /**
   * Sets the class to test.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value       the class to test
   */
  public void setSourceCode(Classifier value) {
    m_SourceCode = value;
  }
<<<<<<< HEAD

  /**
   * Gets the class to test.
   *
=======
  
  /**
   * Gets the class to test.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return            the currently set class, can be null.
   */
  public Classifier getSourceCode() {
    return m_SourceCode;
  }
<<<<<<< HEAD

  /**
   * Sets the dataset to use for testing.
   *
=======
  
  /**
   * Sets the dataset to use for testing.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value       the dataset to use.
   */
  public void setDataset(File value) {
    if (!value.exists())
      throw new IllegalArgumentException(
          "Dataset '" + value.getAbsolutePath() + "' does not exist!");
    else
      m_Dataset = value;
  }
<<<<<<< HEAD

  /**
   * Gets the dataset to use for testing, can be null.
   *
=======
  
  /**
   * Gets the dataset to use for testing, can be null.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return            the dataset to use.
   */
  public File getDataset() {
    return m_Dataset;
  }

  /**
   * Sets the class index of the dataset.
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value       the class index of the dataset.
   */
  public void setClassIndex(int value) {
    m_ClassIndex = value;
  }
<<<<<<< HEAD

  /**
   * Gets the class index of the dataset.
   *
=======
  
  /**
   * Gets the class index of the dataset.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return            the current class index.
   */
  public int getClassIndex() {
    return m_ClassIndex;
  }
<<<<<<< HEAD

  /**
   * performs the comparison test
   *
=======
  
  /**
   * performs the comparison test
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return            true if tests were successful
   * @throws Exception  if tests fail
   */
  public boolean execute() throws Exception {
    boolean     result;
    Classifier  cls;
<<<<<<< HEAD
    Classifier  code;
=======
    Classifier	code;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int         i;
    Instances   data;
    DataSource  source;
    boolean     numeric;
    boolean     different;
    double      predClassifier;
    double      predSource;
<<<<<<< HEAD

    result = true;

=======
    
    result = true;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // a few checks
    if (getClassifier() == null)
      throw new Exception("No classifier set!");
    if (getSourceCode() == null)
      throw new Exception("No source code set!");
    if (getDataset() == null)
      throw new Exception("No dataset set!");
    if (!getDataset().exists())
      throw new Exception(
          "Dataset '" + getDataset().getAbsolutePath() + "' does not exist!");
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // load data
    source = new DataSource(getDataset().getAbsolutePath());
    data   = source.getDataSet();
    if (getClassIndex() == -1)
      data.setClassIndex(data.numAttributes() - 1);
    else
      data.setClassIndex(getClassIndex());
    numeric = data.classAttribute().isNumeric();
<<<<<<< HEAD

    // build classifier
    cls = AbstractClassifier.makeCopy(getClassifier());
    cls.buildClassifier(data);

    code = getSourceCode();

=======
    
    // build classifier
    cls = Classifier.makeCopy(getClassifier());
    cls.buildClassifier(data);
    
    code = getSourceCode();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // compare predictions
    for (i = 0; i < data.numInstances(); i++) {
      // perform predictions
      predClassifier = cls.classifyInstance(data.instance(i));
      predSource     = code.classifyInstance(data.instance(i));
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // compare both results
      if (Double.isNaN(predClassifier) && Double.isNaN(predSource)) {
        different = false;
      }
      else {
        if (numeric)
          different = !Utils.eq(predClassifier, predSource);
        else
          different = ((int) predClassifier != (int) predSource);
      }
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      if (different) {
        result = false;
        if (numeric)
          System.out.println(
<<<<<<< HEAD
              (i+1) + ". instance (Classifier/Source code): "
              + predClassifier + " != " + predSource);
        else
          System.out.println(
              (i+1) + ". instance (Classifier/Source code): "
              + data.classAttribute().value((int) predClassifier)
              + " != " + data.classAttribute().value((int) predSource));
      }
    }

    return result;
  }

  /**
   * Returns the revision string.
   *
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10141 $");
  }

  /**
   * Executes the tests, use "-h" to list the commandline options.
   *
=======
              (i+1) + ". instance (Classifier/Source code): " 
              + predClassifier + " != " + predSource);
        else
          System.out.println(
              (i+1) + ". instance (Classifier/Source code): " 
              + data.classAttribute().value((int) predClassifier) 
              + " != " + data.classAttribute().value((int) predSource));
      }
    }
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.4 $");
  }
  
  /**
   * Executes the tests, use "-h" to list the commandline options.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param args        the commandline parameters
   * @throws Exception  if something goes wrong
   */
  public static void main(String[] args) throws Exception{
    CheckSource         check;
    StringBuffer        text;
<<<<<<< HEAD
    Enumeration<Option>         enm;

    check = new CheckSource();
    if (Utils.getFlag('h', args)) {
      text = new StringBuffer();
=======
    Enumeration         enm;
    
    check = new CheckSource();
    if (Utils.getFlag('h', args)) {
      text = new StringBuffer();   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      text.append("\nHelp requested:\n\n");
      enm = check.listOptions();
      while (enm.hasMoreElements()) {
        Option option = (Option) enm.nextElement();
        text.append(option.synopsis() + "\n");
        text.append(option.description() + "\n");
      }
      System.out.println("\n" + text + "\n");
    }
    else {
      check.setOptions(args);
      if (check.execute())
        System.out.println("Tests OK!");
      else
        System.out.println("Tests failed!");
    }
  }
}
