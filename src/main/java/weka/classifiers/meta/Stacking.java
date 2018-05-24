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
 *    Stacking.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers.meta;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.RandomizableParallelMultipleClassifiersCombiner;
import weka.classifiers.rules.ZeroR;
import weka.core.*;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;

=======
import weka.classifiers.Classifier;
import weka.classifiers.RandomizableMultipleClassifiersCombiner;
import weka.classifiers.rules.ZeroR;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 <!-- globalinfo-start -->
 * Combines several classifiers using the stacking method. Can do classification or regression.<br/>
 * <br/>
 * For more information, see<br/>
 * <br/>
 * David H. Wolpert (1992). Stacked generalization. Neural Networks. 5:241-259.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- technical-bibtex-start -->
 * BibTeX:
 * <pre>
 * &#64;article{Wolpert1992,
 *    author = {David H. Wolpert},
 *    journal = {Neural Networks},
 *    pages = {241-259},
 *    publisher = {Pergamon Press},
 *    title = {Stacked generalization},
 *    volume = {5},
 *    year = {1992}
 * }
 * </pre>
 * <p/>
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
<<<<<<< HEAD
 * 
 * <pre> -M &lt;scheme specification&gt;
 *  Full name of meta classifier, followed by options.
 *  (default: "weka.classifiers.rules.Zero")</pre>
 * 
 * <pre> -X &lt;number of folds&gt;
 *  Sets the number of cross-validation folds.</pre>
 * 
 * <pre> -S &lt;num&gt;
 *  Random number seed.
 *  (default 1)</pre>
 * 
=======
 *
 * <pre> -M &lt;scheme specification&gt;
 *  Full name of meta classifier, followed by options.
 *  (default: "weka.classifiers.rules.Zero")</pre>
 *
 * <pre> -X &lt;number of folds&gt;
 *  Sets the number of cross-validation folds.</pre>
 *
 * <pre> -S &lt;num&gt;
 *  Random number seed.
 *  (default 1)</pre>
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre> -B &lt;classifier specification&gt;
 *  Full class name of classifier to include, followed
 *  by scheme options. May be specified multiple times.
 *  (default: "weka.classifiers.rules.ZeroR")</pre>
<<<<<<< HEAD
 * 
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 12205 $ 
 */
public class Stacking 
  extends RandomizableParallelMultipleClassifiersCombiner
=======
 *
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 *
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 6996 $
 */
public class Stacking
  extends RandomizableMultipleClassifiersCombiner
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  implements TechnicalInformationHandler {

  /** for serialization */
  static final long serialVersionUID = 5134738557155845452L;
<<<<<<< HEAD
  
  /** The meta classifier */
  protected Classifier m_MetaClassifier = new ZeroR();
 
=======

  /** The meta classifier */
  protected Classifier m_MetaClassifier = new ZeroR();

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Format for meta data */
  protected Instances m_MetaFormat = null;

  /** Format for base data */
  protected Instances m_BaseFormat = null;

  /** Set the number of folds for the cross-validation */
  protected int m_NumFolds = 10;
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns a string describing classifier
   * @return a description suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {

    return "Combines several classifiers using the stacking method. "
      + "Can do classification or regression.\n\n"
      + "For more information, see\n\n"
      + getTechnicalInformation().toString();
  }

  /**
<<<<<<< HEAD
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
=======
   * Returns an instance of a TechnicalInformation object, containing
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result = new TechnicalInformation(Type.ARTICLE);
    result.setValue(Field.AUTHOR, "David H. Wolpert");
    result.setValue(Field.YEAR, "1992");
    result.setValue(Field.TITLE, "Stacked generalization");
    result.setValue(Field.JOURNAL, "Neural Networks");
    result.setValue(Field.VOLUME, "5");
    result.setValue(Field.PAGES, "241-259");
    result.setValue(Field.PUBLISHER, "Pergamon Press");
<<<<<<< HEAD
    
    return result;
  }
  
=======

    return result;
  }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  public Enumeration<Option> listOptions() {
    
    Vector<Option> newVector = new Vector<Option>(2);
=======
  public Enumeration listOptions() {

    Vector newVector = new Vector(2);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    newVector.addElement(new Option(
	      metaOption(),
	      "M", 0, "-M <scheme specification>"));
    newVector.addElement(new Option(
	      "\tSets the number of cross-validation folds.",
	      "X", 1, "-X <number of folds>"));

<<<<<<< HEAD
    newVector.addAll(Collections.list(super.listOptions()));
    
    if (getMetaClassifier() instanceof OptionHandler) {
      newVector.addElement(new Option(
        "",
        "", 0, "\nOptions specific to meta classifier "
          + getMetaClassifier().getClass().getName() + ":"));
      newVector.addAll(Collections.list(((OptionHandler)getMetaClassifier()).listOptions()));
=======
    Enumeration enu = super.listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return newVector.elements();
  }

  /**
   * String describing option for setting meta classifier
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the string describing the option
   */
  protected String metaOption() {

    return "\tFull name of meta classifier, followed by options.\n" +
      "\t(default: \"weka.classifiers.rules.Zero\")";
  }

  /**
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
<<<<<<< HEAD
   * 
   * <pre> -M &lt;scheme specification&gt;
   *  Full name of meta classifier, followed by options.
   *  (default: "weka.classifiers.rules.Zero")</pre>
   * 
   * <pre> -X &lt;number of folds&gt;
   *  Sets the number of cross-validation folds.</pre>
   * 
   * <pre> -S &lt;num&gt;
   *  Random number seed.
   *  (default 1)</pre>
   * 
=======
   *
   * <pre> -M &lt;scheme specification&gt;
   *  Full name of meta classifier, followed by options.
   *  (default: "weka.classifiers.rules.Zero")</pre>
   *
   * <pre> -X &lt;number of folds&gt;
   *  Sets the number of cross-validation folds.</pre>
   *
   * <pre> -S &lt;num&gt;
   *  Random number seed.
   *  (default 1)</pre>
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * <pre> -B &lt;classifier specification&gt;
   *  Full class name of classifier to include, followed
   *  by scheme options. May be specified multiple times.
   *  (default: "weka.classifiers.rules.ZeroR")</pre>
<<<<<<< HEAD
   * 
   * <pre> -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console</pre>
   * 
=======
   *
   * <pre> -D
   *  If set, classifier is run in debug mode and
   *  may output additional info to the console</pre>
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {

    String numFoldsString = Utils.getOption('X', options);
    if (numFoldsString.length() != 0) {
      setNumFolds(Integer.parseInt(numFoldsString));
    } else {
      setNumFolds(10);
    }
    processMetaOptions(options);
    super.setOptions(options);
  }

  /**
   * Process options setting meta classifier.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param options the options to parse
   * @throws Exception if the parsing fails
   */
  protected void processMetaOptions(String[] options) throws Exception {

    String classifierString = Utils.getOption('M', options);
    String [] classifierSpec = Utils.splitOptions(classifierString);
    String classifierName;
    if (classifierSpec.length == 0) {
      classifierName = "weka.classifiers.rules.ZeroR";
    } else {
      classifierName = classifierSpec[0];
      classifierSpec[0] = "";
    }
<<<<<<< HEAD
    setMetaClassifier(AbstractClassifier.forName(classifierName, classifierSpec));
=======
    setMetaClassifier(Classifier.forName(classifierName, classifierSpec));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

    String [] superOptions = super.getOptions();
    String [] options = new String [superOptions.length + 4];

    int current = 0;
    options[current++] = "-X"; options[current++] = "" + getNumFolds();
    options[current++] = "-M";
    options[current++] = getMetaClassifier().getClass().getName() + " "
      + Utils.joinOptions(((OptionHandler)getMetaClassifier()).getOptions());

<<<<<<< HEAD
    System.arraycopy(superOptions, 0, options, current, 
		     superOptions.length);
    return options;
  }
  
=======
    System.arraycopy(superOptions, 0, options, current,
		     superOptions.length);
    return options;
  }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String numFoldsTipText() {
    return "The number of folds used for cross-validation.";
  }

<<<<<<< HEAD
  /** 
=======
  /**
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Gets the number of folds for the cross-validation.
   *
   * @return the number of folds for the cross-validation
   */
  public int getNumFolds() {

    return m_NumFolds;
  }

  /**
   * Sets the number of folds for the cross-validation.
   *
   * @param numFolds the number of folds for the cross-validation
   * @throws Exception if parameter illegal
   */
  public void setNumFolds(int numFolds) throws Exception {
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (numFolds < 0) {
      throw new IllegalArgumentException("Stacking: Number of cross-validation " +
					 "folds must be positive.");
    }
    m_NumFolds = numFolds;
  }
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String metaClassifierTipText() {
    return "The meta classifiers to be used.";
  }

  /**
   * Adds meta classifier
   *
   * @param classifier the classifier with all options set.
   */
  public void setMetaClassifier(Classifier classifier) {

    m_MetaClassifier = classifier;
  }
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Gets the meta classifier.
   *
   * @return the meta classifier
   */
  public Classifier getMetaClassifier() {
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_MetaClassifier;
  }

  /**
   * Returns combined capabilities of the base classifiers, i.e., the
   * capabilities all of them have in common.
   *
   * @return      the capabilities of the base classifiers
   */
  public Capabilities getCapabilities() {
    Capabilities      result;
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result = super.getCapabilities();
    result.setMinimumNumberInstances(getNumFolds());

    return result;
  }
<<<<<<< HEAD
  
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Buildclassifier selects a classifier from the set of classifiers
   * by minimising error on the training data.
   *
   * @param data the training data to be used for generating the
   * boosted classifier.
   * @throws Exception if the classifier could not be built successfully
   */
  public void buildClassifier(Instances data) throws Exception {

    if (m_MetaClassifier == null) {
      throw new IllegalArgumentException("No meta classifier has been set");
    }

    // can classifier handle the data?
    getCapabilities().testWithFail(data);

    // remove instances with missing class
    Instances newData = new Instances(data);
    m_BaseFormat = new Instances(data, 0);
    newData.deleteWithMissingClass();
<<<<<<< HEAD
    
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Random random = new Random(m_Seed);
    newData.randomize(random);
    if (newData.classAttribute().isNominal()) {
      newData.stratify(m_NumFolds);
    }

    // Create meta level
    generateMetaLevel(newData, random);
<<<<<<< HEAD
  
    // restart the executor pool because at the end of processing
    // a set of classifiers it gets shutdown to prevent the program
    // executing as a server
    super.buildClassifier(newData);
    
    // Rebuild all the base classifiers on the full training data
    buildClassifiers(newData);
=======

    // Rebuilt all the base classifiers on the full training data
    for (int i = 0; i < m_Classifiers.length; i++) {
      getClassifier(i).buildClassifier(newData);
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Generates the meta data
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newData the data to work on
   * @param random the random number generator to use for cross-validation
   * @throws Exception if generation fails
   */
<<<<<<< HEAD
  protected void generateMetaLevel(Instances newData, Random random) 
=======
  protected void generateMetaLevel(Instances newData, Random random)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    throws Exception {

    Instances metaData = metaFormat(newData);
    m_MetaFormat = new Instances(metaData, 0);
    for (int j = 0; j < m_NumFolds; j++) {
      Instances train = newData.trainCV(m_NumFolds, j, random);
<<<<<<< HEAD
      
      // start the executor pool (if necessary)
      // has to be done after each set of classifiers as the
      // executor pool gets shut down in order to prevent the
      // program executing as a server (and not returning to
      // the command prompt when run from the command line
      super.buildClassifier(train);
      
      // construct the actual classifiers
      buildClassifiers(train);
      
=======

      // Build base classifiers
      for (int i = 0; i < m_Classifiers.length; i++) {
	getClassifier(i).buildClassifier(train);
      }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // Classify test instances and add to meta data
      Instances test = newData.testCV(m_NumFolds, j);
      for (int i = 0; i < test.numInstances(); i++) {
	metaData.add(metaInstance(test.instance(i)));
      }
    }

<<<<<<< HEAD
    m_MetaClassifier.buildClassifier(metaData);    
=======
    m_MetaClassifier.buildClassifier(metaData);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns class probabilities.
   *
   * @param instance the instance to be classified
   * @return the distribution
   * @throws Exception if instance could not be classified
   * successfully
   */
  public double[] distributionForInstance(Instance instance) throws Exception {

    return m_MetaClassifier.distributionForInstance(metaInstance(instance));
  }

  /**
   * Output a representation of this classifier
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a string representation of the classifier
   */
  public String toString() {

    if (m_Classifiers.length == 0) {
      return "Stacking: No base schemes entered.";
    }
    if (m_MetaClassifier == null) {
      return "Stacking: No meta scheme selected.";
    }
    if (m_MetaFormat == null) {
      return "Stacking: No model built yet.";
    }
    String result = "Stacking\n\nBase classifiers\n\n";
    for (int i = 0; i < m_Classifiers.length; i++) {
      result += getClassifier(i).toString() +"\n\n";
    }
<<<<<<< HEAD
   
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result += "\n\nMeta classifier\n\n";
    result += m_MetaClassifier.toString();

    return result;
  }

  /**
   * Makes the format for the level-1 data.
   *
   * @param instances the level-0 format
   * @return the format for the meta data
   * @throws Exception if the format generation fails
   */
  protected Instances metaFormat(Instances instances) throws Exception {
<<<<<<< HEAD
    ArrayList<Attribute> attributes = new ArrayList<Attribute>();
=======

    FastVector attributes = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    Instances metaFormat;

    for (int k = 0; k < m_Classifiers.length; k++) {
      Classifier classifier = (Classifier) getClassifier(k);
      String name = classifier.getClass().getName() + "-" + (k+1);
      if (m_BaseFormat.classAttribute().isNumeric()) {
<<<<<<< HEAD
	attributes.add(new Attribute(name));
      } else {
	for (int j = 0; j < m_BaseFormat.classAttribute().numValues(); j++) {
	  attributes.add(
	      new Attribute(
		  name + ":" + m_BaseFormat.classAttribute().value(j)));
	}
      }
    }
    attributes.add((Attribute) m_BaseFormat.classAttribute().copy());
=======
	attributes.addElement(new Attribute(name));
      } else {
	for (int j = 0; j < m_BaseFormat.classAttribute().numValues(); j++) {
	  attributes.addElement(new Attribute(name + ":" +
					      m_BaseFormat
					      .classAttribute().value(j)));
	}
      }
    }
    attributes.addElement(m_BaseFormat.classAttribute().copy());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    metaFormat = new Instances("Meta format", attributes, 0);
    metaFormat.setClassIndex(metaFormat.numAttributes() - 1);
    return metaFormat;
  }

  /**
   * Makes a level-1 instance from the given instance.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instance the instance to be transformed
   * @return the level-1 instance
   * @throws Exception if the instance generation fails
   */
  protected Instance metaInstance(Instance instance) throws Exception {

    double[] values = new double[m_MetaFormat.numAttributes()];
    Instance metaInstance;
    int i = 0;
    for (int k = 0; k < m_Classifiers.length; k++) {
      Classifier classifier = getClassifier(k);
      if (m_BaseFormat.classAttribute().isNumeric()) {
	values[i++] = classifier.classifyInstance(instance);
      } else {
	double[] dist = classifier.distributionForInstance(instance);
	for (int j = 0; j < dist.length; j++) {
	  values[i++] = dist[j];
	}
      }
    }
    values[i] = instance.classValue();
<<<<<<< HEAD
    metaInstance = new DenseInstance(1, values);
=======
    metaInstance = new Instance(1, values);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    metaInstance.setDataset(m_MetaFormat);
    return metaInstance;
  }

<<<<<<< HEAD
  @Override
  public void preExecution() throws Exception {
    super.preExecution();
    if (getMetaClassifier() instanceof CommandlineRunnable) {
      ((CommandlineRunnable) getMetaClassifier()).preExecution();
    }
  }

  @Override
  public void postExecution() throws Exception {
    super.postExecution();
    if (getMetaClassifier() instanceof CommandlineRunnable) {
      ((CommandlineRunnable) getMetaClassifier()).postExecution();
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 12205 $");
=======
  /**
   * Returns the revision string.
   *
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 6996 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
   *
   * @param argv should contain the following arguments:
   * -t training file [-T test file] [-c class index]
   */
  public static void main(String [] argv) {
    runClassifier(new Stacking(), argv);
  }
}
