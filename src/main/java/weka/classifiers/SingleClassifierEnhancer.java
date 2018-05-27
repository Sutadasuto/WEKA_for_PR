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
 *    SingleClassifierEnhancer.java
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

package weka.classifiers;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.classifiers.rules.ZeroR;
import weka.core.*;
import weka.core.Capabilities.Capability;

/**
 * Abstract utility class for handling settings common to meta
 * classifiers that use a single base learner.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 14259 $
 */
public abstract class SingleClassifierEnhancer extends AbstractClassifier {
<<<<<<< HEAD
=======
=======
import weka.classifiers.rules.ZeroR;
import weka.core.Capabilities;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.core.Capabilities.Capability;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Abstract utility class for handling settings common to meta
 * classifiers that use a single base learner.  
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 5536 $
 */
public abstract class SingleClassifierEnhancer extends Classifier {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  private static final long serialVersionUID = -3665885256363525164L;

  /** The base classifier to use */
  protected Classifier m_Classifier = new ZeroR();

  /**
   * String describing default classifier.
   */
  protected String defaultClassifierString() {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "weka.classifiers.rules.ZeroR";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * String describing options for default classifier.
   */
  protected String[] defaultClassifierOptions() {

    return new String[0];
  }

  /**
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(3);

    newVector.addElement(new Option(
          "\tFull name of base classifier.\n"
          + "\t(default: " + defaultClassifierString() + 
          ((defaultClassifierOptions().length > 0) ? 
           " with options " + Utils.joinOptions(defaultClassifierOptions()) + ")" : ")"),
          "W", 1, "-W <classifier name>"));
    
    newVector.addAll(Collections.list(super.listOptions()));

    newVector.addElement(new Option(
          "",
          "", 0, "\nOptions specific to classifier "
          + m_Classifier.getClass().getName() + ":"));
    newVector.addAll(Collections.list(((OptionHandler)m_Classifier).listOptions()));
<<<<<<< HEAD
=======
=======
  public Enumeration listOptions() {

    Vector newVector = new Vector(3);

    Enumeration enu = super.listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }

    newVector.addElement(new Option(
	      "\tFull name of base classifier.\n"
	      + "\t(default: " + defaultClassifierString() +")",
	      "W", 1, "-W"));

    newVector.addElement(new Option(
	     "",
	     "", 0, "\nOptions specific to classifier "
	     + m_Classifier.getClass().getName() + ":"));
    enu = ((OptionHandler)m_Classifier).listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return newVector.elements();
  }

  /**
   * Parses a given list of options. Valid options are:<p>
   *
   * -W classname <br>
   * Specify the full class name of the base learner.<p>
   *
   * Options after -- are passed to the designated classifier.<p>
   *
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {

    super.setOptions(options);

    String classifierName = Utils.getOption('W', options);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (classifierName.length() > 0) {
      setClassifier(AbstractClassifier.forName(classifierName, null));
      setClassifier(AbstractClassifier.forName(classifierName,
            Utils.partitionOptions(options)));
    } else {
      setClassifier(AbstractClassifier.forName(defaultClassifierString(), null));
      String[] classifierOptions = Utils.partitionOptions(options);
      if (classifierOptions.length > 0) {
        setClassifier(AbstractClassifier.forName(defaultClassifierString(),
                                                 classifierOptions));
      } else {
        setClassifier(AbstractClassifier.forName(defaultClassifierString(),
                                                 defaultClassifierOptions()));
      }
<<<<<<< HEAD
=======
=======
    if (classifierName.length() > 0) { 
      
      // This is just to set the classifier in case the option 
      // parsing fails.
      setClassifier(Classifier.forName(classifierName, null));
      setClassifier(Classifier.forName(classifierName,
				       Utils.partitionOptions(options)));
    } else {
      
      // This is just to set the classifier in case the option 
      // parsing fails.
      setClassifier(Classifier.forName(defaultClassifierString(), null));
      setClassifier(Classifier.forName(defaultClassifierString(),
				       Utils.partitionOptions(options)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Vector<String> options = new Vector<String>();
       
    options.add("-W");
    options.add(getClassifier().getClass().getName());
    
    Collections.addAll(options, super.getOptions());
    
    String[] classifierOptions = ((OptionHandler)m_Classifier).getOptions();
    if (classifierOptions.length > 0) {
      options.add("--");
      Collections.addAll(options, classifierOptions);
    }

    return options.toArray(new String[0]);
  }

<<<<<<< HEAD
=======
=======
    String [] classifierOptions = ((OptionHandler)m_Classifier).getOptions();
    int extraOptionsLength = classifierOptions.length;
    if (extraOptionsLength > 0) {
      extraOptionsLength++; // for the double hyphen
    }

    String [] superOptions = super.getOptions();
    String [] options = new String [superOptions.length + 
				   extraOptionsLength + 2];

    int current = 0;
    options[current++] = "-W";
    options[current++] = getClassifier().getClass().getName();

    System.arraycopy(superOptions, 0, options, current, 
		     superOptions.length);
    current += superOptions.length;

    if (classifierOptions.length > 0) {
      options[current++] = "--";
      System.arraycopy(classifierOptions, 0, options, current, 
		       classifierOptions.length);
    }

    return options;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String classifierTipText() {
    return "The base classifier to be used.";
  }

  /**
   * Returns default capabilities of the base classifier.
   *
   * @return      the capabilities of the base classifier
   */
  public Capabilities getCapabilities() {
    Capabilities        result;

    if (getClassifier() != null) {
      result = getClassifier().getCapabilities();
    } else {
      result = new Capabilities(this);
      result.disableAll();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);

    result.setOwner(this);

<<<<<<< HEAD
=======
=======
    
    // set dependencies
    for (Capability cap: Capability.values())
      result.enableDependency(cap);
    
    result.setOwner(this);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return result;
  }

  /**
   * Set the base learner.
   *
   * @param newClassifier the classifier to use.
   */
  public void setClassifier(Classifier newClassifier) {

    m_Classifier = newClassifier;
  }

  /**
   * Get the classifier used as the base learner.
   *
   * @return the classifier used as the classifier
   */
  public Classifier getClassifier() {

    return m_Classifier;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Gets the classifier specification string, which contains the class name of
   * the classifier and any options to the classifier
   *
   * @return the classifier string
   */
  protected String getClassifierSpec() {

    Classifier c = getClassifier();
    return c.getClass().getName() + " "
      + Utils.joinOptions(((OptionHandler)c).getOptions());
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  @Override
  public void preExecution() throws Exception {
    if (getClassifier() instanceof CommandlineRunnable) {
      ((CommandlineRunnable) getClassifier()).preExecution();
    }
  }

  @Override
  public void postExecution() throws Exception {
    if (getClassifier() instanceof CommandlineRunnable) {
      ((CommandlineRunnable) getClassifier()).postExecution();
    }
  }
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
