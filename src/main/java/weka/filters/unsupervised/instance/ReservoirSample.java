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
 *    ReservoirSample.java
<<<<<<< HEAD
 *    Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.filters.unsupervised.instance;

<<<<<<< HEAD
import weka.core.*;
=======
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.StreamableFilter;
import weka.filters.UnsupervisedFilter;
<<<<<<< HEAD
import weka.gui.ProgrammaticProperty;

import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 * <!-- globalinfo-start --> Produces a random subsample of a dataset using the
 * reservoir sampling Algorithm "R" by Vitter. The original data set does not
 * have to fit into main memory, but the reservoir does.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======

/** 
 <!-- globalinfo-start -->
 * Produces a random subsample of a dataset using the reservoir sampling Algorithm "R" by Vitter. The original data set does not have to fit into main memory, but the reservoir does.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;article{Vitter1985,
 *    author = {J. S. Vitter},
 *    journal = {ACM Transactions on Mathematical Software},
 *    number = {1}
 *    volume = {11}
 *    pages = {37-57},
 *    title = {Random Sampling with a Reservoir},
 *    year = {1985}
 * }
 * </pre>
<<<<<<< HEAD
 * 
 * </p>
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -S &lt;num&gt;
 *  Specify the random number seed (default 1)
 * </pre>
 * 
 * <pre>
 * -Z &lt;num&gt;
 *  The size of the output dataset - number of instances
 *  (default 100)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org)
 * @version $Revision: 14534 $
 */
public class ReservoirSample extends Filter implements UnsupervisedFilter,
  OptionHandler, StreamableFilter, Randomizable, WeightedAttributesHandler {

=======
 * </p>
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -S &lt;num&gt;
 *  Specify the random number seed (default 1)</pre>
 * 
 * <pre> -Z &lt;num&gt;
 *  The size of the output dataset - number of instances
 *  (default 100)</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}org)
 * @version $Revision: 5562 $ 
 */
public class ReservoirSample 
  extends Filter 
  implements UnsupervisedFilter, OptionHandler, StreamableFilter {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** for serialization */
  static final long serialVersionUID = 3119607037607101160L;

  /** The subsample size, number of instances% */
  protected int m_SampleSize = 100;

  /** Holds the sub-sample (reservoir) */
<<<<<<< HEAD
  protected Object[] m_subSample;

  /** The current instance being processed */
  protected int m_currentInst;

=======
  protected Instance[] m_subSample;

  /** The current instance being processed */
  protected int m_currentInst;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The random number generator seed */
  protected int m_RandomSeed = 1;

  /** The random number generator */
  protected Random m_random;
<<<<<<< HEAD

  /** True if the incoming data contains string attributes */
  protected boolean m_containsStringAtts;

  /**
   * Returns a string describing this filter
   * 
   * @return a description of the classifier suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Produces a random subsample of a dataset using the reservoir sampling "
=======
  
  /**
   * Returns a string describing this filter
   * @return a description of the classifier suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "Produces a random subsample of a dataset using the reservoir sampling "
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "Algorithm \"R\" by Vitter. The original data set does not have to fit "
      + "into main memory, but the reservoir does. ";
  }

  /**
   * Returns an enumeration describing the available options.
<<<<<<< HEAD
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tSpecify the random number seed (default 1)", "S", 1, "-S <num>"));

    result.addElement(new Option(
      "\tThe size of the output dataset - number of instances\n"
        + "\t(default 100)", "Z", 1, "-Z <num>"));
=======
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
	"\tSpecify the random number seed (default 1)",
	"S", 1, "-S <num>"));

    result.addElement(new Option(
	"\tThe size of the output dataset - number of instances\n"
	+"\t(default 100)",
	"Z", 1, "-Z <num>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result.elements();
  }

<<<<<<< HEAD
  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -S &lt;num&gt;
   *  Specify the random number seed (default 1)
   * </pre>
   * 
   * <pre>
   * -Z &lt;num&gt;
   *  The size of the output dataset - number of instances
   *  (default 100)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    String tmpStr = Utils.getOption('S', options);
=======

  /**
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -S &lt;num&gt;
   *  Specify the random number seed (default 1)</pre>
   * 
   * <pre> -Z &lt;num&gt;
   *  The size of the output dataset - number of instances
   *  (default 100)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption('S', options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (tmpStr.length() != 0) {
      setRandomSeed(Integer.parseInt(tmpStr));
    } else {
      setRandomSeed(1);
    }

    tmpStr = Utils.getOption('Z', options);
    if (tmpStr.length() != 0) {
      setSampleSize(Integer.parseInt(tmpStr));
    } else {
      setSampleSize(100);
    }
<<<<<<< HEAD

    Utils.checkForRemainingOptions(options);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the filter.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {
    Vector<String>	result;

    result = new Vector<String>();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result.add("-S");
    result.add("" + getRandomSeed());

    result.add("-Z");
    result.add("" + getSampleSize());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String randomSeedTipText() {
    return "The seed used for random sampling.";
  }

  /**
   * Gets the random number seed.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the random number seed.
   */
  public int getRandomSeed() {
    return m_RandomSeed;
  }
<<<<<<< HEAD

  /**
   * Sets the random number seed.
   * 
=======
  
  /**
   * Sets the random number seed.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newSeed the new random number seed.
   */
  public void setRandomSeed(int newSeed) {
    m_RandomSeed = newSeed;
  }
<<<<<<< HEAD

  @ProgrammaticProperty
  public void setSeed(int seed) {
    setRandomSeed(seed);
  }

  @ProgrammaticProperty
  public int getSeed() {
    return getRandomSeed();
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String sampleSizeTipText() {
    return "Size of the subsample (reservoir). i.e. the number of instances.";
  }

  /**
   * Gets the subsample size.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the subsample size
   */
  public int getSampleSize() {
    return m_SampleSize;
  }
<<<<<<< HEAD

  /**
   * Sets the size of the subsample.
   * 
=======
  
  /**
   * Sets the size of the subsample.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newSampleSize size of the subsample.
   */
  public void setSampleSize(int newSampleSize) {
    m_SampleSize = newSampleSize;
  }
<<<<<<< HEAD

  /**
   * Returns the Capabilities of this filter.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
  
  
  /** 
   * Returns the Capabilities of this filter.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // class
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Sets the format of the input instances.
<<<<<<< HEAD
   * 
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set successfully
   */
  @Override
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    super.setInputFormat(instanceInfo);
    m_containsStringAtts = instanceInfo.checkForStringAttributes();

    setOutputFormat(instanceInfo);

    m_subSample = new Object[m_SampleSize];
=======
   *
   * @param instanceInfo an Instances object containing the input 
   * instance structure (any instances contained in the object are 
   * ignored - only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the input format can't be set 
   * successfully
   */
  public boolean setInputFormat(Instances instanceInfo) 
       throws Exception {

    super.setInputFormat(instanceInfo);
    setOutputFormat(instanceInfo);

    m_subSample = new Instance[m_SampleSize];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_currentInst = 0;
    m_random = new Random(m_RandomSeed);

    return true;
  }

  /**
<<<<<<< HEAD
   * Decides whether the current instance gets retained in the reservoir.
   * 
=======
   * Decides whether the current instance gets retained in the
   * reservoir.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instance the Instance to potentially retain
   */
  protected void processInstance(Instance instance) {
    if (m_currentInst < m_SampleSize) {
<<<<<<< HEAD
      m_subSample[m_currentInst] = m_containsStringAtts ? instance.toString() : instance.copy();
    } else {
      double r = m_random.nextDouble();
      if (r < ((double) m_SampleSize / (double) m_currentInst)) {
        r = m_random.nextDouble();
        int replace = (int) (m_SampleSize * r);
        m_subSample[replace] = m_containsStringAtts ? instance.toString() : instance.copy();
=======
      m_subSample[m_currentInst] = (Instance)instance.copy();
    } else {
      double r = m_random.nextDouble();
      if (r < ((double)m_SampleSize / (double)m_currentInst)) {
        r = m_random.nextDouble();
        int replace = (int)((double)m_SampleSize * r);
        m_subSample[replace] = (Instance)instance.copy();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    m_currentInst++;
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering. Filter requires all training instances be
   * read before producing output.
   * 
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
=======
   * Input an instance for filtering. Filter requires all
   * training instances be read before producing output.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws IllegalStateException if no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean input(Instance instance) {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }
    if (m_NewBatch) {
      resetQueue();
      m_NewBatch = false;
    }
    if (isFirstBatchDone()) {
      push(instance);
      return true;
    } else {
<<<<<<< HEAD
      // bufferInput(instance);
      if (!m_containsStringAtts) {
        copyValues(instance, false);
      }
=======
      //      bufferInput(instance);
      copyValues(instance, false);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      processInstance(instance);
      return false;
    }
  }

  /**
<<<<<<< HEAD
   * Signify that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances.
   * 
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
  @Override
=======
   * Signify that this batch of input to the filter is finished. 
   * If the filter requires all instances prior to filtering,
   * output() may now be called to retrieve the filtered instances.
   *
   * @return true if there are instances pending output
   * @throws IllegalStateException if no input structure has been defined
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean batchFinished() {

    if (getInputFormat() == null) {
      throw new IllegalStateException("No input instance format defined");
    }

    if (!isFirstBatchDone()) {
      // Do the subsample, and clear the input instances.
      createSubsample();
    }
    flushInput();

    m_NewBatch = true;
    m_FirstBatchDone = true;
    return (numPendingOutput() != 0);
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Creates a subsample of the current set of input instances. The output
   * instances are pushed onto the output queue for collection.
   */
  protected void createSubsample() {

<<<<<<< HEAD
    StringBuilder sb = null;
    if (m_containsStringAtts) {
      sb = new StringBuilder();
      sb.append(getInputFormat().stringFreeStructure()).append("\n");
    }
    for (int i = 0; i < m_SampleSize; i++) {
      if (m_subSample[i] != null) {
        if (!m_containsStringAtts) {
          Instance copy = (Instance) ((Instance) m_subSample[i]).copy();
          push(copy, false); // No need to copy instance
        } else {
          sb.append(m_subSample[i].toString()).append("\n");
        }
=======
    for (int i = 0; i < m_SampleSize; i++) {
      if (m_subSample[i] != null) {
        Instance copy = (Instance) m_subSample[i].copy();
        push(copy);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      } else {
        // less data in the original than was asked for
        // as a sample.
        break;
      }
    }
    m_subSample = null;
<<<<<<< HEAD

    if (m_containsStringAtts) {
      try {
        Instances stringSample = new Instances(new StringReader(sb.toString()));
        for (int i = 0; i < stringSample.numInstances(); i++) {
          push(stringSample.instance(i), false);
        }
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    }
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
   * Main method for testing this class.
   * 
   * @param argv should contain arguments to the filter: use -h for help
   */
  public static void main(String[] argv) {
    runFilter(new ReservoirSample(), argv);
  }
}
=======
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5562 $");
  }
  
  /**
   * Main method for testing this class.
   *
   * @param argv should contain arguments to the filter: 
   * use -h for help
   */
  public static void main(String [] argv) {
    runFilter(new ReservoirSample(), argv);
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
