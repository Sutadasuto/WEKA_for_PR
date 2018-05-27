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
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

/*
 * BayesNetEstimator.java
<<<<<<< HEAD
 * Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 */

package weka.classifiers.bayes.net.estimate;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.bayes.BayesNet;
import weka.core.Instance;
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
 * <!-- globalinfo-start --> BayesNetEstimator is the base class for estimating
 * the conditional probability tables of a Bayes network once the structure has
 * been learned.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -A &lt;alpha&gt;
 *  Initial count (alpha)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Remco Bouckaert (rrb@xm.co.nz)
 * @version $Revision: 10153 $
 */
public class BayesNetEstimator implements OptionHandler, Serializable,
  RevisionHandler {

  /** for serialization */
  static final long serialVersionUID = 2184330197666253884L;

  /**
   * Holds prior on count
   */
  protected double m_fAlpha = 0.5;

  /**
   * estimateCPTs estimates the conditional probability tables for the Bayes Net
   * using the network structure.
   * 
   * @param bayesNet the bayes net to use
   * @throws Exception always throws an exception, since subclass needs to be
   *           used
   */
  public void estimateCPTs(BayesNet bayesNet) throws Exception {
    throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
  }

  /**
   * Updates the classifier with the given instance.
   * 
   * @param bayesNet the bayes net to use
   * @param instance the new training instance to include in the model
   * @throws Exception always throws an exception, since subclass needs to be
   *           used
   */
  public void updateClassifier(BayesNet bayesNet, Instance instance)
    throws Exception {
    throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
  }

  /**
   * Calculates the class membership probabilities for the given test instance.
   * 
   * @param bayesNet the bayes net to use
   * @param instance the instance to be classified
   * @return predicted class probability distribution
   * @throws Exception always throws an exception, since subclass needs to be
   *           used
   */
  public double[] distributionForInstance(BayesNet bayesNet, Instance instance)
    throws Exception {
    throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
  }

  /**
   * initCPTs reserves space for CPTs and set all counts to zero
   * 
   * @param bayesNet the bayes net to use
   * @throws Exception always throws an exception, since subclass needs to be
   *           used
   */
  public void initCPTs(BayesNet bayesNet) throws Exception {
    throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
  } // initCPTs

  /**
   * Returns an enumeration describing the available options
   * 
   * @return an enumeration of all the available options
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> newVector = new Vector<Option>(1);

    newVector.addElement(new Option("\tInitial count (alpha)\n", "A", 1,
      "-A <alpha>"));

    return newVector.elements();
  } // listOptions

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -A &lt;alpha&gt;
   *  Initial count (alpha)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String sAlpha = Utils.getOption('A', options);

    if (sAlpha.length() != 0) {
      m_fAlpha = (new Float(sAlpha)).floatValue();
    } else {
      m_fAlpha = 0.5f;
    }

    Utils.checkForRemainingOptions(options);
  } // setOptions

  /**
   * Gets the current settings of the classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    String[] options = new String[2];
    int current = 0;

    options[current++] = "-A";
    options[current++] = "" + m_fAlpha;

    return options;
  } // getOptions

  /**
   * Set prior used in probability table estimation
   * 
   * @param fAlpha representing prior
   */
  public void setAlpha(double fAlpha) {
    m_fAlpha = fAlpha;
  }

  /**
   * Get prior used in probability table estimation
   * 
   * @return prior
   */
  public double getAlpha() {
    return m_fAlpha;
  }

  /**
   * @return a string to describe the Alpha option.
   */
  public String alphaTipText() {
    return "Alpha is used for estimating the probability tables and can be interpreted"
      + " as the initial count on each value.";
  }

  /**
   * This will return a string describing the class.
   * 
   * @return The string.
   */
  public String globalInfo() {
    return "BayesNetEstimator is the base class for estimating the "
      + "conditional probability tables of a Bayes network once the "
      + "structure has been learned.";
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
<<<<<<< HEAD
=======
=======
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

/** 
 <!-- globalinfo-start -->
 * BayesNetEstimator is the base class for estimating the conditional probability tables of a Bayes network once the structure has been learned.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -A &lt;alpha&gt;
 *  Initial count (alpha)
 * </pre>
 * 
 <!-- options-end -->
 * 
 * @author Remco Bouckaert (rrb@xm.co.nz)
 * @version $Revision: 1.4 $
 */
public class BayesNetEstimator 
    implements OptionHandler, Serializable, RevisionHandler {
  
    /** for serialization */
    static final long serialVersionUID = 2184330197666253884L;
    
    /**
     * Holds prior on count
     */
    protected double m_fAlpha = 0.5;

    /**
     * estimateCPTs estimates the conditional probability tables for the Bayes
     * Net using the network structure.
     * 
     * @param bayesNet the bayes net to use
     * @throws Exception always throws an exception, since subclass needs to be used
     */
    public void estimateCPTs(BayesNet bayesNet) throws Exception {
        throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
    }

    /**
     * Updates the classifier with the given instance.
     * 
     * @param bayesNet the bayes net to use
     * @param instance the new training instance to include in the model
     * @throws Exception always throws an exception, since subclass needs to be used
     */
    public void updateClassifier(BayesNet bayesNet, Instance instance) throws Exception {
        throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
    }

    /**
     * Calculates the class membership probabilities for the given test
     * instance.
     * 
     * @param bayesNet the bayes net to use
     * @param instance the instance to be classified
     * @return predicted class probability distribution
     * @throws Exception always throws an exception, since subclass needs to be used
     */
    public double[] distributionForInstance(BayesNet bayesNet, Instance instance) throws Exception {
        throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
    }

    /** 
     * initCPTs reserves space for CPTs and set all counts to zero
     * 
     * @param bayesNet the bayes net to use
     * @throws Exception always throws an exception, since subclass needs to be used
     */
    public void initCPTs(BayesNet bayesNet) throws Exception {
        throw new Exception("Incorrect BayesNetEstimator: use subclass instead.");
    } // initCPTs

    /**
     * Returns an enumeration describing the available options
     * 
     * @return an enumeration of all the available options
     */
    public Enumeration listOptions() {
        Vector newVector = new Vector(1);

        newVector.addElement(new Option("\tInitial count (alpha)\n", "A", 1, "-A <alpha>"));

        return newVector.elements();
    } // listOptions

    /**
     * Parses a given list of options. <p/>
     *
     <!-- options-start -->
     * Valid options are: <p/>
     * 
     * <pre> -A &lt;alpha&gt;
     *  Initial count (alpha)
     * </pre>
     * 
     <!-- options-end -->
     * 
     * @param options the list of options as an array of strings
     * @throws Exception if an option is not supported
     */
    public void setOptions(String[] options) throws Exception {
        String sAlpha = Utils.getOption('A', options);

        if (sAlpha.length() != 0) {
            m_fAlpha = (new Float(sAlpha)).floatValue();
        } else {
            m_fAlpha = 0.5f;
        }

        Utils.checkForRemainingOptions(options);
    } // setOptions

    /**
     * Gets the current settings of the classifier.
     * 
     * @return an array of strings suitable for passing to setOptions
     */
    public String[] getOptions() {
        String[] options = new String[2];
        int current = 0;

        options[current++] = "-A";
        options[current++] = "" + m_fAlpha;

        return options;
    } // getOptions

    /**
     * Set prior used in probability table estimation
     * @param fAlpha representing prior
     */
    public void setAlpha(double fAlpha) {
        m_fAlpha = fAlpha;
    }

    /**
     * Get prior used in probability table estimation
     * @return prior
     */
    public double getAlpha() {
        return m_fAlpha;
    }


    /**
     * @return a string to describe the Alpha option.
     */
    public String alphaTipText() {
        return "Alpha is used for estimating the probability tables and can be interpreted"
            + " as the initial count on each value.";
    }

    /**
     * This will return a string describing the class.
     * @return The string.
     */
    public String globalInfo() {
        return 
            "BayesNetEstimator is the base class for estimating the "
          + "conditional probability tables of a Bayes network once the "
          + "structure has been learned.";
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 1.4 $");
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

} // BayesNetEstimator
