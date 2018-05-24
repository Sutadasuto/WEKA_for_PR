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
 *    Filter.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.filters;

import weka.core.Capabilities;
<<<<<<< HEAD
import weka.core.Capabilities.Capability;
import weka.core.CapabilitiesHandler;
import weka.core.CapabilitiesIgnorer;
import weka.core.CommandlineRunnable;
=======
import weka.core.CapabilitiesHandler;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Queue;
import weka.core.RelationalLocator;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.SerializedObject;
import weka.core.StringLocator;
import weka.core.UnsupportedAttributeTypeException;
import weka.core.Utils;
import weka.core.Version;
<<<<<<< HEAD
=======
import weka.core.Capabilities.Capability;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.converters.ConverterUtils.DataSource;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
<<<<<<< HEAD
import java.util.Vector;

/**
 * An abstract class for instance filters: objects that take instances as input,
 * carry out some transformation on the instance and then output the instance.
 * The method implementations in this class assume that most of the work will be
 * done in the methods overridden by subclasses.
 * <p>
 * 
 * A simple example of filter use. This example doesn't remove instances from
 * the output queue until all instances have been input, so has higher memory
 * consumption than an approach that uses output instances as they are made
 * available:
 * <p>
 * 
=======

/** 
 * An abstract class for instance filters: objects that take instances
 * as input, carry out some transformation on the instance and then
 * output the instance. The method implementations in this class
 * assume that most of the work will be done in the methods overridden
 * by subclasses.<p>
 *
 * A simple example of filter use. This example doesn't remove
 * instances from the output queue until all instances have been
 * input, so has higher memory consumption than an approach that
 * uses output instances as they are made available:<p>
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <code> <pre>
 *  Filter filter = ..some type of filter..
 *  Instances instances = ..some instances..
 *  for (int i = 0; i < data.numInstances(); i++) {
 *    filter.input(data.instance(i));
 *  }
 *  filter.batchFinished();
 *  Instances newData = filter.outputFormat();
 *  Instance processed;
 *  while ((processed = filter.output()) != null) {
 *    newData.add(processed);
 *  }
 *  ..do something with newData..
 * </pre> </code>
<<<<<<< HEAD
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 14271 $
 */
public abstract class Filter implements Serializable, CapabilitiesHandler,
  RevisionHandler, OptionHandler, CapabilitiesIgnorer, CommandlineRunnable {
=======
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 7880 $
 */
public abstract class Filter
  implements Serializable, CapabilitiesHandler, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -8835063755891851218L;

  /** The output format for instances */
  private Instances m_OutputFormat = null;

  /** The output instance queue */
  private Queue m_OutputQueue = null;

  /** Indices of string attributes in the output format */
  protected StringLocator m_OutputStringAtts = null;

  /** Indices of string attributes in the input format */
  protected StringLocator m_InputStringAtts = null;

  /** Indices of relational attributes in the output format */
  protected RelationalLocator m_OutputRelAtts = null;

  /** Indices of relational attributes in the input format */
  protected RelationalLocator m_InputRelAtts = null;

  /** The input format for instances */
  private Instances m_InputFormat = null;

  /** Record whether the filter is at the start of a batch */
  protected boolean m_NewBatch = true;

  /** True if the first batch has been done */
  protected boolean m_FirstBatchDone = false;

<<<<<<< HEAD
  /** Whether the classifier is run in debug mode. */
  protected boolean m_Debug = false;

  /** Whether capabilities should not be checked before classifier is built. */
  protected boolean m_DoNotCheckCapabilities = false;

  /**
   * Returns true if the a new batch was started, either a new instance of the
   * filter was created or the batchFinished() method got called.
   *
=======
  /**
   * Returns true if the a new batch was started, either a new instance of the 
   * filter was created or the batchFinished() method got called.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if a new batch has been initiated
   * @see #m_NewBatch
   * @see #batchFinished()
   */
  public boolean isNewBatch() {
    return m_NewBatch;
  }
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns true if the first batch of instances got processed. Necessary for
   * supervised filters, which "learn" from the first batch and then shouldn't
   * get updated with subsequent calls of batchFinished().
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if the first batch has been processed
   * @see #m_FirstBatchDone
   * @see #batchFinished()
   */
  public boolean isFirstBatchDone() {
    return m_FirstBatchDone;
  }

<<<<<<< HEAD
  /**
   * Default implementation returns false. Some filters may not necessarily be
   * able to produce an instance for output for every instance input after the
   * first batch has been completed - such filters should override this method
   * and return true.
   *
   * @return false by default
   */
  public boolean mayRemoveInstanceAfterFirstBatchDone() {
    return false;
  }

  /**
   * Returns the Capabilities of this filter. Derived filters have to override
   * this method to enable capabilities.
   *
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result;

    result = new Capabilities(this);
    result.enableAll();

    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * Returns the revision string.
   *
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14271 $");
  }

  /**
   * Returns the Capabilities of this filter, customized based on the data.
   * I.e., if removes all class capabilities, in case there's not class
   * attribute present or removes the NO_CLASS capability, in case that there's
   * a class present.
   *
   * @param data the data to use for customization
   * @return the capabilities of this object, based on the data
   * @see #getCapabilities()
   */
  public Capabilities getCapabilities(Instances data) {
    Capabilities result;
    Capabilities classes;
    Iterator<Capability> iter;
    Capability cap;
=======
  /** 
   * Returns the Capabilities of this filter. Derived filters have to
   * override this method to enable capabilities.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities 	result;

    result = new Capabilities(this);
    result.enableAll();
    
    result.setMinimumNumberInstances(0);
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return            the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7880 $");
  }

  /** 
   * Returns the Capabilities of this filter, customized based on the data.
   * I.e., if removes all class capabilities, in case there's not class
   * attribute present or removes the NO_CLASS capability, in case that
   * there's a class present.
   *
   * @param data	the data to use for customization
   * @return            the capabilities of this object, based on the data
   * @see               #getCapabilities()
   */
  public Capabilities getCapabilities(Instances data) {
    Capabilities 	result;
    Capabilities 	classes;
    Iterator		iter;
    Capability		cap;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result = getCapabilities();

    // no class? -> remove all class capabilites apart from NO_CLASS
    if (data.classIndex() == -1) {
      classes = result.getClassCapabilities();
<<<<<<< HEAD
      iter = classes.capabilities();
      while (iter.hasNext()) {
        cap = iter.next();
        if (cap != Capability.NO_CLASS) {
          result.disable(cap);
          result.disableDependency(cap);
        }
=======
      iter    = classes.capabilities();
      while (iter.hasNext()) {
	cap = (Capability) iter.next();
	if (cap != Capability.NO_CLASS) {
	  result.disable(cap);
	  result.disableDependency(cap);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    // class? -> remove NO_CLASS
    else {
      result.disable(Capability.NO_CLASS);
      result.disableDependency(Capability.NO_CLASS);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Sets the format of output instances. The derived class should use this
<<<<<<< HEAD
   * method once it has determined the outputformat. The output queue is
   * cleared.
=======
   * method once it has determined the outputformat. The 
   * output queue is cleared.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param outputFormat the new output format
   */
  protected void setOutputFormat(Instances outputFormat) {

    if (outputFormat != null) {
      m_OutputFormat = outputFormat.stringFreeStructure();
      initOutputLocators(m_OutputFormat, null);

      // Rename the relation
<<<<<<< HEAD
      String relationName =
        outputFormat.relationName() + "-" + this.getClass().getName();
      if (this instanceof OptionHandler) {
        String[] options = ((OptionHandler) this).getOptions();
        for (String option : options) {
          relationName += option.trim();
=======
      String relationName = outputFormat.relationName() 
        + "-" + this.getClass().getName();
      if (this instanceof OptionHandler) {
        String [] options = ((OptionHandler)this).getOptions();
        for (int i = 0; i < options.length; i++) {
          relationName += options[i].trim();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
      m_OutputFormat.setRelationName(relationName);
    } else {
      m_OutputFormat = null;
    }
    m_OutputQueue = new Queue();
  }

  /**
   * Gets the currently set inputformat instances. This dataset may contain
   * buffered instances.
   *
   * @return the input Instances.
   */
  protected Instances getInputFormat() {

    return m_InputFormat;
  }

  /**
<<<<<<< HEAD
   * Gets a copy of just the structure of the input format instances.
   *
   * @return a copy of the structure (attribute information) of the input
   * format instances
   */
  public Instances getCopyOfInputFormat() {
    return getInputFormat() == null ? null : new Instances(getInputFormat(), 0);
  }

  /**
   * Returns a reference to the current input format without copying it.
=======
   * Returns a reference to the current input format without
   * copying it.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @return a reference to the current input format
   */
  protected Instances inputFormatPeek() {

    return m_InputFormat;
  }

  /**
<<<<<<< HEAD
   * Returns a reference to the current output format without copying it.
=======
   * Returns a reference to the current output format without
   * copying it.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @return a reference to the current output format
   */
  protected Instances outputFormatPeek() {

    return m_OutputFormat;
  }

  /**
   * Adds an output instance to the queue. The derived class should use this
<<<<<<< HEAD
   * method for each output instance it makes available. Note that the instance
   * is only copied before it is added to the output queue if it has a reference
   * to a dataset.
=======
   * method for each output instance it makes available. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param instance the instance to be added to the queue.
   */
  protected void push(Instance instance) {

<<<<<<< HEAD
    push(instance, true);
  }

  /**
   * Adds an output instance to the queue. The derived class should use this
   * method for each output instance it makes available. Note that the instance
   * is only copied before it is added to the output queue if copyInstance has
   * value true and if the instance has a reference to a dataset.
   *
   * @param instance the instance to be added to the queue.
   * @param copyInstance whether instance is to be copied
   */
  protected void push(Instance instance, boolean copyInstance) {

    if (instance != null) {
      if (instance.dataset() != null) {
        if (copyInstance) {
          instance = (Instance) instance.copy();
        }
        copyValues(instance, false);
      }
=======
    if (instance != null) {
      if (instance.dataset() != null)
	copyValues(instance, false);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      instance.setDataset(m_OutputFormat);
      m_OutputQueue.push(instance);
    }
  }

  /**
   * Clears the output queue.
   */
  protected void resetQueue() {

    m_OutputQueue = new Queue();
  }

  /**
<<<<<<< HEAD
   * Adds the supplied input instance to the inputformat dataset for later
   * processing. Use this method rather than getInputFormat().add(instance). Or
   * else. Note that the provided instance gets copied when buffered.
   *
   * @param instance the <code>Instance</code> to buffer.
=======
   * Adds the supplied input instance to the inputformat dataset for
   * later processing.  Use this method rather than
   * getInputFormat().add(instance). Or else. Note that the provided
   * instance gets copied when buffered. 
   *
   * @param instance the <code>Instance</code> to buffer.  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void bufferInput(Instance instance) {

    if (instance != null) {
<<<<<<< HEAD
      instance = (Instance)instance.copy(); // The copyValues() method *does* modify the instance!
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      copyValues(instance, true);
      m_InputFormat.add(instance);
    }
  }

  /**
<<<<<<< HEAD
   * Initializes the input attribute locators. If indices is null then all
   * attributes of the data will be considered, otherwise only the ones that
   * were provided.
   *
   * @param data the data to initialize the locators with
   * @param indices if not null, the indices to which to restrict the locating
=======
   * Initializes the input attribute locators. If indices is null then all 
   * attributes of the data will be considered, otherwise only the ones
   * that were provided.
   * 
   * @param data		the data to initialize the locators with
   * @param indices		if not null, the indices to which to restrict
   * 				the locating
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void initInputLocators(Instances data, int[] indices) {
    if (indices == null) {
      m_InputStringAtts = new StringLocator(data);
<<<<<<< HEAD
      m_InputRelAtts = new RelationalLocator(data);
    } else {
      m_InputStringAtts = new StringLocator(data, indices);
      m_InputRelAtts = new RelationalLocator(data, indices);
=======
      m_InputRelAtts    = new RelationalLocator(data);
    }
    else {
      m_InputStringAtts = new StringLocator(data, indices);
      m_InputRelAtts    = new RelationalLocator(data, indices);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Initializes the output attribute locators. If indices is null then all
   * attributes of the data will be considered, otherwise only the ones that
   * were provided.
   *
   * @param data the data to initialize the locators with
   * @param indices if not null, the indices to which to restrict the locating
=======
   * Initializes the output attribute locators. If indices is null then all 
   * attributes of the data will be considered, otherwise only the ones
   * that were provided.
   * 
   * @param data		the data to initialize the locators with
   * @param indices		if not null, the indices to which to restrict
   * 				the locating
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void initOutputLocators(Instances data, int[] indices) {
    if (indices == null) {
      m_OutputStringAtts = new StringLocator(data);
<<<<<<< HEAD
      m_OutputRelAtts = new RelationalLocator(data);
    } else {
      m_OutputStringAtts = new StringLocator(data, indices);
      m_OutputRelAtts = new RelationalLocator(data, indices);
    }
  }

  /**
   * Copies string/relational values contained in the instance copied to a new
   * dataset. The Instance must already be assigned to a dataset. This dataset
   * and the destination dataset must have the same structure.
   *
   * @param instance the Instance containing the string/relational values to
   *          copy.
   * @param isInput if true the input format and input attribute locators are
   *          used otherwise the output format and output locators
   */
  protected void copyValues(Instance instance, boolean isInput) {

    RelationalLocator.copyRelationalValues(instance,
      (isInput) ? m_InputFormat : m_OutputFormat,
      (isInput) ? m_InputRelAtts : m_OutputRelAtts);

    StringLocator.copyStringValues(instance,
      (isInput) ? m_InputFormat : m_OutputFormat,
      (isInput) ? m_InputStringAtts : m_OutputStringAtts);
  }

  /**
   * Takes string/relational values referenced by an Instance and copies them
   * from a source dataset to a destination dataset. The instance references are
   * updated to be valid for the destination dataset. The instance may have the
   * structure (i.e. number and attribute position) of either dataset (this
   * affects where references are obtained from). Only works if the number of
   * string/relational attributes is the same in both indices (implicitly these
   * string/relational attributes should be semantically same but just with
   * shifted positions).
   *
   * @param instance the instance containing references to strings/ relational
   *          values in the source dataset that will have references updated to
   *          be valid for the destination dataset.
   * @param instSrcCompat true if the instance structure is the same as the
   *          source, or false if it is the same as the destination (i.e. which
   *          of the string/relational attribute indices contains the correct
   *          locations for this instance).
   * @param srcDataset the dataset for which the current instance
   *          string/relational value references are valid (after any position
   *          mapping if needed)
   * @param destDataset the dataset for which the current instance
   *          string/relational value references need to be inserted (after any
   *          position mapping if needed)
   */
  protected void copyValues(Instance instance, boolean instSrcCompat,
    Instances srcDataset, Instances destDataset) {

    RelationalLocator.copyRelationalValues(instance, instSrcCompat, srcDataset,
      m_InputRelAtts, destDataset, m_OutputRelAtts);

    StringLocator.copyStringValues(instance, instSrcCompat, srcDataset,
      m_InputStringAtts, destDataset, m_OutputStringAtts);
  }

  /**
   * This will remove all buffered instances from the inputformat dataset. Use
   * this method rather than getInputFormat().delete();
   */
  protected void flushInput() {

    if ((m_InputStringAtts.getAttributeIndices().length > 0)
      || (m_InputRelAtts.getAttributeIndices().length > 0)) {
      m_InputFormat = m_InputFormat.stringFreeStructure();
      m_InputStringAtts =
        new StringLocator(m_InputFormat, m_InputStringAtts.getAllowedIndices());
      m_InputRelAtts = new RelationalLocator(m_InputFormat,
        m_InputRelAtts.getAllowedIndices());
=======
      m_OutputRelAtts    = new RelationalLocator(data);
    }
    else {
      m_OutputStringAtts = new StringLocator(data, indices);
      m_OutputRelAtts    = new RelationalLocator(data, indices);
    }
  }
  
  /**
   * Copies string/relational values contained in the instance copied to a new
   * dataset. The Instance must already be assigned to a dataset. This
   * dataset and the destination dataset must have the same structure.
   *
   * @param instance		the Instance containing the string/relational 
   * 				values to copy.
   * @param isInput		if true the input format and input attribute 
   * 				locators are used otherwise the output format 
   * 				and output locators
   */
  protected void copyValues(Instance instance, boolean isInput) {

    RelationalLocator.copyRelationalValues(
	instance, 
	(isInput) ? m_InputFormat : m_OutputFormat, 
	(isInput) ? m_InputRelAtts : m_OutputRelAtts);

    StringLocator.copyStringValues(
	instance, 
	(isInput) ? m_InputFormat : m_OutputFormat, 
	(isInput) ? m_InputStringAtts : m_OutputStringAtts);
  }

  /**
   * Takes string/relational values referenced by an Instance and copies them 
   * from a source dataset to a destination dataset. The instance references are
   * updated to be valid for the destination dataset. The instance may have the 
   * structure (i.e. number and attribute position) of either dataset (this
   * affects where references are obtained from). Only works if the number
   * of string/relational attributes is the same in both indices (implicitly 
   * these string/relational attributes should be semantically same but just 
   * with shifted positions).
   *
   * @param instance 		the instance containing references to strings/
   * 				relational values in the source dataset that 
   * 				will have references updated to be valid for 
   * 				the destination dataset.
   * @param instSrcCompat 	true if the instance structure is the same as 
   * 				the source, or false if it is the same as the 
   * 				destination (i.e. which of the string/relational 
   * 				attribute indices contains the correct locations 
   * 				for this instance).
   * @param srcDataset 		the dataset for which the current instance 
   * 				string/relational value references are valid 
   * 				(after any position mapping if needed)
   * @param destDataset 	the dataset for which the current instance 
   * 				string/relational value references need to be 
   * 				inserted (after any position mapping if needed)
   */
  protected void copyValues(Instance instance, boolean instSrcCompat,
                         Instances srcDataset, Instances destDataset) {

    RelationalLocator.copyRelationalValues(
	instance, instSrcCompat, 
	srcDataset, m_InputRelAtts,
	destDataset, m_OutputRelAtts);

    StringLocator.copyStringValues(
	instance, instSrcCompat, 
	srcDataset, m_InputStringAtts,
	getOutputFormat(), m_OutputStringAtts);
  }

  /**
   * This will remove all buffered instances from the inputformat dataset.
   * Use this method rather than getInputFormat().delete();
   */
  protected void flushInput() {

    if (    (m_InputStringAtts.getAttributeIndices().length > 0) 
	 || (m_InputRelAtts.getAttributeIndices().length > 0) ) {
      m_InputFormat = m_InputFormat.stringFreeStructure();
      m_InputStringAtts = new StringLocator(m_InputFormat, m_InputStringAtts.getAllowedIndices());
      m_InputRelAtts = new RelationalLocator(m_InputFormat, m_InputRelAtts.getAllowedIndices());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    } else {
      // This more efficient than new Instances(m_InputFormat, 0);
      m_InputFormat.delete();
    }
  }
<<<<<<< HEAD

  /**
   * tests the data whether the filter can actually handle it
   *
   * @param instanceInfo the data to test
   * @throws Exception if the test fails
=======
  
  /**
   * tests the data whether the filter can actually handle it
   * 
   * @param instanceInfo	the data to test
   * @throws Exception		if the test fails
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected void testInputFormat(Instances instanceInfo) throws Exception {
    getCapabilities(instanceInfo).testWithFail(instanceInfo);
  }

  /**
<<<<<<< HEAD
   * Sets the format of the input instances. If the filter is able to determine
   * the output format before seeing any input instances, it does so here. This
   * default implementation clears the output format and output queue, and the
   * new batch flag is set. Overriders should call
   * <code>super.setInputFormat(Instances)</code>
   *
   * @param instanceInfo an Instances object containing the input instance
   *          structure (any instances contained in the object are ignored -
   *          only the structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the inputFormat can't be set successfully
=======
   * Sets the format of the input instances. If the filter is able to
   * determine the output format before seeing any input instances, it
   * does so here. This default implementation clears the output format
   * and output queue, and the new batch flag is set. Overriders should
   * call <code>super.setInputFormat(Instances)</code>
   *
   * @param instanceInfo an Instances object containing the input instance
   * structure (any instances contained in the object are ignored - only the
   * structure is required).
   * @return true if the outputFormat may be collected immediately
   * @throws Exception if the inputFormat can't be set successfully 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public boolean setInputFormat(Instances instanceInfo) throws Exception {

    testInputFormat(instanceInfo);
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_InputFormat = instanceInfo.stringFreeStructure();
    m_OutputFormat = null;
    m_OutputQueue = new Queue();
    m_NewBatch = true;
    m_FirstBatchDone = false;
    initInputLocators(m_InputFormat, null);
    return false;
  }

  /**
<<<<<<< HEAD
   * Gets the format of the output instances. This should only be called after
   * input() or batchFinished() has returned true. The relation name of the
   * output instances should be changed to reflect the action of the filter (eg:
   * add the filter name and options).
   *
   * @return an Instances object containing the output instance structure only.
   * @throws NullPointerException if no input structure has been defined (or the
   *           output format hasn't been determined yet)
=======
   * Gets the format of the output instances. This should only be called
   * after input() or batchFinished() has returned true. The relation
   * name of the output instances should be changed to reflect the
   * action of the filter (eg: add the filter name and options).
   *
   * @return an Instances object containing the output instance
   * structure only.
   * @throws NullPointerException if no input structure has been
   * defined (or the output format hasn't been determined yet) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Instances getOutputFormat() {

    if (m_OutputFormat == null) {
      throw new NullPointerException("No output format defined.");
    }
    return new Instances(m_OutputFormat, 0);
  }

  /**
<<<<<<< HEAD
   * Input an instance for filtering. Ordinarily the instance is processed and
   * made available for output immediately. Some filters require all instances
   * be read before producing output, in which case output instances should be
   * collected after calling batchFinished(). If the input marks the start of a
   * new batch, the output queue is cleared. This default implementation assumes
   * all instance conversion will occur when batchFinished() is called.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be collected with output().
   * @throws NullPointerException if the input format has not been defined.
   * @throws Exception if the input instance was not of the correct format or if
   *           there was a problem with the filtering.
=======
   * Input an instance for filtering. Ordinarily the instance is
   * processed and made available for output immediately. Some filters
   * require all instances be read before producing output, in which
   * case output instances should be collected after calling
   * batchFinished(). If the input marks the start of a new batch, the
   * output queue is cleared. This default implementation assumes all
   * instance conversion will occur when batchFinished() is called.
   *
   * @param instance the input instance
   * @return true if the filtered instance may now be
   * collected with output().
   * @throws NullPointerException if the input format has not been
   * defined.
   * @throws Exception if the input instance was not of the correct 
   * format or if there was a problem with the filtering.  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public boolean input(Instance instance) throws Exception {

    if (m_InputFormat == null) {
      throw new NullPointerException("No input instance format defined");
    }
    if (m_NewBatch) {
      m_OutputQueue = new Queue();
      m_NewBatch = false;
    }
    bufferInput(instance);
    return false;
  }

  /**
<<<<<<< HEAD
   * Signify that this batch of input to the filter is finished. If the filter
   * requires all instances prior to filtering, output() may now be called to
   * retrieve the filtered instances. Any subsequent instances filtered should
   * be filtered based on setting obtained from the first batch (unless the
   * inputFormat has been re-assigned or new options have been set). This
   * default implementation assumes all instance processing occurs during
=======
   * Signify that this batch of input to the filter is finished. If
   * the filter requires all instances prior to filtering, output()
   * may now be called to retrieve the filtered instances. Any
   * subsequent instances filtered should be filtered based on setting
   * obtained from the first batch (unless the inputFormat has been
   * re-assigned or new options have been set). This default
   * implementation assumes all instance processing occurs during
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * inputFormat() and input().
   *
   * @return true if there are instances pending output
   * @throws NullPointerException if no input structure has been defined,
   * @throws Exception if there was a problem finishing the batch.
   */
  public boolean batchFinished() throws Exception {

    if (m_InputFormat == null) {
      throw new NullPointerException("No input instance format defined");
    }
    flushInput();
    m_NewBatch = true;
    m_FirstBatchDone = true;
<<<<<<< HEAD

    if (m_OutputQueue.empty()) {
      // Clear out references to old strings/relationals occasionally
      if ((m_OutputStringAtts.getAttributeIndices().length > 0)
        || (m_OutputRelAtts.getAttributeIndices().length > 0)) {
        m_OutputFormat = m_OutputFormat.stringFreeStructure();
        m_OutputStringAtts = new StringLocator(m_OutputFormat,
          m_OutputStringAtts.getAllowedIndices());
      }
    }

    return (numPendingOutput() != 0);
  }

  /**
   * Output an instance after filtering and remove from the output queue.
   *
   * @return the instance that has most recently been filtered (or null if the
   *         queue is empty).
=======
    
    if (m_OutputQueue.empty()) {
      // Clear out references to old strings/relationals occasionally
      if (    (m_OutputStringAtts.getAttributeIndices().length > 0)
          || (m_OutputRelAtts.getAttributeIndices().length > 0) ) {
        m_OutputFormat = m_OutputFormat.stringFreeStructure();
        m_OutputStringAtts = new StringLocator(m_OutputFormat, m_OutputStringAtts.getAllowedIndices());
      }
    }
    
    return (numPendingOutput() != 0);
  }


  /**
   * Output an instance after filtering and remove from the output queue.
   *
   * @return the instance that has most recently been filtered (or null if
   * the queue is empty).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @throws NullPointerException if no output structure has been defined
   */
  public Instance output() {

    if (m_OutputFormat == null) {
      throw new NullPointerException("No output instance format defined");
    }
    if (m_OutputQueue.empty()) {
      return null;
    }
<<<<<<< HEAD
    Instance result = (Instance) m_OutputQueue.pop();

    // Clear out references to old strings/relationals occasionally
    /*
     * if (m_OutputQueue.empty() && m_NewBatch) { if (
     * (m_OutputStringAtts.getAttributeIndices().length > 0) ||
     * (m_OutputRelAtts.getAttributeIndices().length > 0) ) { m_OutputFormat =
     * m_OutputFormat.stringFreeStructure(); } }
     */
    return result;
  }

  /**
   * Output an instance after filtering but do not remove from the output queue.
   *
   * @return the instance that has most recently been filtered (or null if the
   *         queue is empty).
   * @throws NullPointerException if no input structure has been defined
=======
    Instance result = (Instance)m_OutputQueue.pop();

    return result;
  }
  
  /**
   * Output an instance after filtering but do not remove from the
   * output queue.
   *
   * @return the instance that has most recently been filtered (or null if
   * the queue is empty).
   * @throws NullPointerException if no input structure has been defined 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Instance outputPeek() {

    if (m_OutputFormat == null) {
      throw new NullPointerException("No output instance format defined");
    }
    if (m_OutputQueue.empty()) {
      return null;
    }
<<<<<<< HEAD
    Instance result = (Instance) m_OutputQueue.peek();
=======
    Instance result = (Instance)m_OutputQueue.peek();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Returns the number of instances pending output
   *
<<<<<<< HEAD
   * @return the number of instances pending output
=======
   * @return the number of instances  pending output
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @throws NullPointerException if no input structure has been defined
   */
  public int numPendingOutput() {

    if (m_OutputFormat == null) {
      throw new NullPointerException("No output instance format defined");
    }
    return m_OutputQueue.size();
  }

  /**
   * Returns whether the output format is ready to be collected
   *
   * @return true if the output format is set
   */
  public boolean isOutputFormatDefined() {

    return (m_OutputFormat != null);
  }

  /**
   * Creates a deep copy of the given filter using serialization.
   *
<<<<<<< HEAD
   * @param model the filter to copy
   * @return a deep copy of the filter
   * @throws Exception if an error occurs
   */
  public static Filter makeCopy(Filter model) throws Exception {
    return (Filter) new SerializedObject(model).getObject();
  }

  /**
   * Creates a given number of deep copies of the given filter using
   * serialization.
   *
   * @param model the filter to copy
   * @param num the number of filter copies to create.
   * @return an array of filters.
   * @throws Exception if an error occurs
=======
   * @param model 	the filter to copy
   * @return 		a deep copy of the filter
   * @throws Exception 	if an error occurs
   */
  public static Filter makeCopy(Filter model) throws Exception {
    return (Filter)new SerializedObject(model).getObject();
  }

  /**
   * Creates a given number of deep copies of the given filter using 
   * serialization.
   * 
   * @param model 	the filter to copy
   * @param num 	the number of filter copies to create.
   * @return 		an array of filters.
   * @throws Exception 	if an error occurs
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static Filter[] makeCopies(Filter model, int num) throws Exception {

    if (model == null) {
      throw new Exception("No model filter set");
    }
    Filter[] filters = new Filter[num];
    SerializedObject so = new SerializedObject(model);
    for (int i = 0; i < filters.length; i++) {
      filters[i] = (Filter) so.getObject();
    }
    return filters;
  }
<<<<<<< HEAD

  /**
   * Filters an entire set of instances through a filter and returns the new
   * set.
=======
  
  /**
   * Filters an entire set of instances through a filter and returns
   * the new set. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *
   * @param data the data to be filtered
   * @param filter the filter to be used
   * @return the filtered set of data
   * @throws Exception if the filter can't be used successfully
   */
<<<<<<< HEAD
  public static Instances useFilter(Instances data, Filter filter)
    throws Exception {
    /*
     * System.err.println(filter.getClass().getName() + " in:" +
     * data.numInstances());
     */
=======
  public static Instances useFilter(Instances data,
				    Filter filter) throws Exception {
    /*
    System.err.println(filter.getClass().getName() 
                       + " in:" + data.numInstances());
    */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (int i = 0; i < data.numInstances(); i++) {
      filter.input(data.instance(i));
    }
    filter.batchFinished();
    Instances newData = filter.getOutputFormat();
    Instance processed;
    while ((processed = filter.output()) != null) {
      newData.add(processed);
    }

    /*
<<<<<<< HEAD
     * System.err.println(filter.getClass().getName() + " out:" +
     * newData.numInstances());
     */
=======
    System.err.println(filter.getClass().getName() 
                       + " out:" + newData.numInstances());
    */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return newData;
  }

  /**
   * Returns a description of the filter, by default only the classname.
<<<<<<< HEAD
   *
   * @return a string describing the filter
   */
  @Override
  public String toString() {
    return this.getClass().getName();
  }

  /**
   * generates source code from the filter
   *
=======
   * 
   * @return a string describing the filter
   */
  public String toString() {
    return this.getClass().getName();
  }
  
  /**
   * generates source code from the filter
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param filter the filter to output as source
   * @param className the name of the generated class
   * @param input the input data the header is generated for
   * @param output the output data the header is generated for
   * @return the generated source code
   * @throws Exception if source code cannot be generated
   */
<<<<<<< HEAD
  public static String wekaStaticWrapper(Sourcable filter, String className,
    Instances input, Instances output) throws Exception {

    StringBuffer result;
    int i;
    int n;

    result = new StringBuffer();

    result.append("// Generated with Weka " + Version.VERSION + "\n");
    result.append("//\n");
    result
      .append("// This code is public domain and comes with no warranty.\n");
=======
  public static String wekaStaticWrapper(
      Sourcable filter, String className, Instances input, Instances output) 
    throws Exception {
    
    StringBuffer	result;
    int			i;
    int			n;
    
    result = new StringBuffer();
    
    result.append("// Generated with Weka " + Version.VERSION + "\n");
    result.append("//\n");
    result.append("// This code is public domain and comes with no warranty.\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("//\n");
    result.append("// Timestamp: " + new Date() + "\n");
    result.append("// Relation: " + input.relationName() + "\n");
    result.append("\n");
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("package weka.filters;\n");
    result.append("\n");
    result.append("import weka.core.Attribute;\n");
    result.append("import weka.core.Capabilities;\n");
    result.append("import weka.core.Capabilities.Capability;\n");
<<<<<<< HEAD
    result.append("import weka.core.DenseInstance;\n");
    result.append("import weka.core.Instance;\n");
    result.append("import weka.core.Instances;\n");
    result.append("import weka.core.Utils;\n");
    result.append("import weka.filters.Filter;\n");
    result.append("import java.util.ArrayList;\n");
=======
    result.append("import weka.core.FastVector;\n");
    result.append("import weka.core.Instance;\n");
    result.append("import weka.core.Instances;\n");
    result.append("import weka.filters.Filter;\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("\n");
    result.append("public class WekaWrapper\n");
    result.append("  extends Filter {\n");

    // globalInfo
    result.append("\n");
    result.append("  /**\n");
    result.append("   * Returns only the toString() method.\n");
    result.append("   *\n");
    result.append("   * @return a string describing the filter\n");
    result.append("   */\n");
    result.append("  public String globalInfo() {\n");
    result.append("    return toString();\n");
    result.append("  }\n");
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // getCapabilities
    result.append("\n");
    result.append("  /**\n");
    result.append("   * Returns the capabilities of this filter.\n");
    result.append("   *\n");
    result.append("   * @return the capabilities\n");
    result.append("   */\n");
    result.append("  public Capabilities getCapabilities() {\n");
    result.append(((Filter) filter).getCapabilities().toSource("result", 4));
    result.append("    return result;\n");
    result.append("  }\n");

    // objectsToInstance
    result.append("\n");
    result.append("  /**\n");
    result.append("   * turns array of Objects into an Instance object\n");
    result.append("   *\n");
<<<<<<< HEAD
    result
      .append("   * @param obj	the Object array to turn into an Instance\n");
    result.append("   * @param format	the data format to use\n");
    result.append("   * @return		the generated Instance object\n");
    result.append("   */\n");
    result.append(
      "  protected Instance objectsToInstance(Object[] obj, Instances format) {\n");
    result.append("    Instance		result;\n");
    result.append("    double[]		values;\n");
    result.append("    int		i;\n");
    result.append("\n");
=======
    result.append("   * @param obj	the Object array to turn into an Instance\n");
    result.append("   * @param format	the data format to use\n");
    result.append("   * @return		the generated Instance object\n");
    result.append("   */\n");
    result.append("  protected Instance objectsToInstance(Object[] obj, Instances format) {\n");
    result.append("    Instance		result;\n");
    result.append("    double[]		values;\n");
    result.append("    int		i;\n");
    result.append("\n");  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("    values = new double[obj.length];\n");
    result.append("\n");
    result.append("    for (i = 0 ; i < obj.length; i++) {\n");
    result.append("      if (obj[i] == null)\n");
<<<<<<< HEAD
    result.append("        values[i] = Utils.missingValue();\n");
    result.append("      else if (format.attribute(i).isNumeric())\n");
    result.append("        values[i] = (Double) obj[i];\n");
    result.append("      else if (format.attribute(i).isNominal())\n");
    result.append(
      "        values[i] = format.attribute(i).indexOfValue((String) obj[i]);\n");
    result.append("    }\n");
    result.append("\n");
    result.append("    // create new instance\n");
    result.append("    result = new DenseInstance(1.0, values);\n");
=======
    result.append("        values[i] = Instance.missingValue();\n");
    result.append("      else if (format.attribute(i).isNumeric())\n");
    result.append("        values[i] = (Double) obj[i];\n");
    result.append("      else if (format.attribute(i).isNominal())\n");
    result.append("        values[i] = format.attribute(i).indexOfValue((String) obj[i]);\n");
    result.append("    }\n");
    result.append("\n");
    result.append("    // create new instance\n");
    result.append("    result = new Instance(1.0, values);\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("    result.setDataset(format);\n");
    result.append("\n");
    result.append("    return result;\n");
    result.append("  }\n");

    // instanceToObjects
    result.append("\n");
    result.append("  /**\n");
    result.append("   * turns the Instance object into an array of Objects\n");
    result.append("   *\n");
    result.append("   * @param inst	the instance to turn into an array\n");
<<<<<<< HEAD
    result.append(
      "   * @return		the Object array representing the instance\n");
=======
    result.append("   * @return		the Object array representing the instance\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("   */\n");
    result.append("  protected Object[] instanceToObjects(Instance inst) {\n");
    result.append("    Object[]	result;\n");
    result.append("    int		i;\n");
<<<<<<< HEAD
    result.append("\n");
=======
    result.append("\n");  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("    result = new Object[inst.numAttributes()];\n");
    result.append("\n");
    result.append("    for (i = 0 ; i < inst.numAttributes(); i++) {\n");
    result.append("      if (inst.isMissing(i))\n");
    result.append("  	result[i] = null;\n");
    result.append("      else if (inst.attribute(i).isNumeric())\n");
    result.append("  	result[i] = inst.value(i);\n");
    result.append("      else\n");
    result.append("  	result[i] = inst.stringValue(i);\n");
    result.append("    }\n");
    result.append("\n");
    result.append("    return result;\n");
    result.append("  }\n");

    // instancesToObjects
    result.append("\n");
    result.append("  /**\n");
    result.append("   * turns the Instances object into an array of Objects\n");
    result.append("   *\n");
    result.append("   * @param data	the instances to turn into an array\n");
<<<<<<< HEAD
    result.append(
      "   * @return		the Object array representing the instances\n");
    result.append("   */\n");
    result
      .append("  protected Object[][] instancesToObjects(Instances data) {\n");
    result.append("    Object[][]	result;\n");
    result.append("    int		i;\n");
    result.append("\n");
    result.append("    result = new Object[data.numInstances()][];\n");
    result.append("\n");
    result.append("    for (i = 0; i < data.numInstances(); i++)\n");
    result.append("      result[i] = instanceToObjects(data.instance(i));\n");
    result.append("\n");
    result.append("    return result;\n");
    result.append("  }\n");

=======
    result.append("   * @return		the Object array representing the instances\n");
    result.append("   */\n");
    result.append("  protected Object[][] instancesToObjects(Instances data) {\n");
    result.append("    Object[][]	result;\n");
    result.append("    int		i;\n");
    result.append("\n");  
    result.append("    result = new Object[data.numInstances()][];\n");
    result.append("\n");  
    result.append("    for (i = 0; i < data.numInstances(); i++)\n");
    result.append("      result[i] = instanceToObjects(data.instance(i));\n");
    result.append("\n");  
    result.append("    return result;\n");
    result.append("  }\n");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // setInputFormat
    result.append("\n");
    result.append("  /**\n");
    result.append("   * Only tests the input data.\n");
    result.append("   *\n");
<<<<<<< HEAD
    result
      .append("   * @param instanceInfo the format of the data to convert\n");
    result.append(
      "   * @return always true, to indicate that the output format can \n");
    result.append("   *         be collected immediately.\n");
    result.append("   */\n");
    result.append(
      "  public boolean setInputFormat(Instances instanceInfo) throws Exception {\n");
    result.append("    super.setInputFormat(instanceInfo);\n");
    result.append("    \n");
    result.append("    // generate output format\n");
    result
      .append("    ArrayList<Attribute> atts = new ArrayList<Attribute>();\n");
    result.append("    ArrayList<String> attValues;\n");
    for (i = 0; i < output.numAttributes(); i++) {
      result.append("    // " + output.attribute(i).name() + "\n");
      if (output.attribute(i).isNumeric()) {
        result.append("    atts.add(new Attribute(\""
          + output.attribute(i).name() + "\"));\n");
      } else if (output.attribute(i).isNominal()) {
        result.append("    attValues = new ArrayList<String>();\n");
        for (n = 0; n < output.attribute(i).numValues(); n++) {
          result.append(
            "    attValues.add(\"" + output.attribute(i).value(n) + "\");\n");
        }
        result.append("    atts.add(new Attribute(\""
          + output.attribute(i).name() + "\", attValues));\n");
      } else {
        throw new UnsupportedAttributeTypeException(
          "Attribute type '" + output.attribute(i).type() + "' (position "
            + (i + 1) + ") is not supported!");
      }
    }
    result.append("    \n");
    result.append("    Instances format = new Instances(\""
      + output.relationName() + "\", atts, 0);\n");
=======
    result.append("   * @param instanceInfo the format of the data to convert\n");
    result.append("   * @return always true, to indicate that the output format can \n");
    result.append("   *         be collected immediately.\n");
    result.append("   */\n");
    result.append("  public boolean setInputFormat(Instances instanceInfo) throws Exception {\n");
    result.append("    super.setInputFormat(instanceInfo);\n");
    result.append("    \n");
    result.append("    // generate output format\n");
    result.append("    FastVector atts = new FastVector();\n");
    result.append("    FastVector attValues;\n");
    for (i = 0; i < output.numAttributes(); i++) {
      result.append("    // " + output.attribute(i).name() + "\n");
      if (output.attribute(i).isNumeric()) {
	result.append("    atts.addElement(new Attribute(\"" 
	    + output.attribute(i).name() + "\"));\n");
      }
      else if (output.attribute(i).isNominal()) {
	result.append("    attValues = new FastVector();\n");
	for (n = 0; n < output.attribute(i).numValues(); n++) {
	  result.append("    attValues.addElement(\"" + output.attribute(i).value(n) + "\");\n");
	}
	result.append("    atts.addElement(new Attribute(\"" 
	    + output.attribute(i).name() + "\", attValues));\n");
      }
      else {
	throw new UnsupportedAttributeTypeException(
	    "Attribute type '" + output.attribute(i).type() + "' (position " 
	    + (i+1) + ") is not supported!");
      }
    }
    result.append("    \n");
    result.append("    Instances format = new Instances(\"" + output.relationName() + "\", atts, 0);\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("    format.setClassIndex(" + output.classIndex() + ");\n");
    result.append("    setOutputFormat(format);\n");
    result.append("    \n");
    result.append("    return true;\n");
    result.append("  }\n");
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // input
    result.append("\n");
    result.append("  /**\n");
    result.append("   * Directly filters the instance.\n");
    result.append("   *\n");
    result.append("   * @param instance the instance to convert\n");
<<<<<<< HEAD
    result
      .append("   * @return always true, to indicate that the output can \n");
    result.append("   *         be collected immediately.\n");
    result.append("   */\n");
    result
      .append("  public boolean input(Instance instance) throws Exception {\n");
    result.append("    Object[] filtered = " + className
      + ".filter(instanceToObjects(instance));\n");
    result
      .append("    push(objectsToInstance(filtered, getOutputFormat()));\n");
    result.append("    return true;\n");
    result.append("  }\n");

    // batchFinished
    result.append("\n");
    result.append("  /**\n");
    result.append(
      "   * Performs a batch filtering of the buffered data, if any available.\n");
    result.append("   *\n");
    result
      .append("   * @return true if instances were filtered otherwise false\n");
    result.append("   */\n");
    result.append("  public boolean batchFinished() throws Exception {\n");
    result.append("    if (getInputFormat() == null)\n");
    result.append(
      "      throw new NullPointerException(\"No input instance format defined\");;\n");
    result.append("\n");
    result.append("    Instances inst = getInputFormat();\n");
    result.append("    if (inst.numInstances() > 0) {\n");
    result.append("      Object[][] filtered = " + className
      + ".filter(instancesToObjects(inst));\n");
    result.append("      for (int i = 0; i < filtered.length; i++) {\n");
    result.append(
      "        push(objectsToInstance(filtered[i], getOutputFormat()));\n");
=======
    result.append("   * @return always true, to indicate that the output can \n");
    result.append("   *         be collected immediately.\n");
    result.append("   */\n");
    result.append("  public boolean input(Instance instance) throws Exception {\n");
    result.append("    Object[] filtered = " + className + ".filter(instanceToObjects(instance));\n");
    result.append("    push(objectsToInstance(filtered, getOutputFormat()));\n");
    result.append("    return true;\n");
    result.append("  }\n");
    
    // batchFinished
    result.append("\n");
    result.append("  /**\n");
    result.append("   * Performs a batch filtering of the buffered data, if any available.\n");
    result.append("   *\n");
    result.append("   * @return true if instances were filtered otherwise false\n");
    result.append("   */\n");
    result.append("  public boolean batchFinished() throws Exception {\n");
    result.append("    if (getInputFormat() == null)\n");
    result.append("      throw new NullPointerException(\"No input instance format defined\");;\n");
    result.append("\n");
    result.append("    Instances inst = getInputFormat();\n");
    result.append("    if (inst.numInstances() > 0) {\n");
    result.append("      Object[][] filtered = " + className + ".filter(instancesToObjects(inst));\n");
    result.append("      for (int i = 0; i < filtered.length; i++) {\n");
    result.append("        push(objectsToInstance(filtered[i], getOutputFormat()));\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("      }\n");
    result.append("    }\n");
    result.append("\n");
    result.append("    flushInput();\n");
    result.append("    m_NewBatch = true;\n");
    result.append("    m_FirstBatchDone = true;\n");
    result.append("\n");
    result.append("    return (inst.numInstances() > 0);\n");
    result.append("  }\n");

    // toString
    result.append("\n");
    result.append("  /**\n");
<<<<<<< HEAD
    result.append(
      "   * Returns only the classnames and what filter it is based on.\n");
=======
    result.append("   * Returns only the classnames and what filter it is based on.\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("   *\n");
    result.append("   * @return a short description\n");
    result.append("   */\n");
    result.append("  public String toString() {\n");
<<<<<<< HEAD
    result.append("    return \"Auto-generated filter wrapper, based on "
      + filter.getClass().getName() + " (generated with Weka " + Version.VERSION
      + ").\\n" + "\" + this.getClass().getName() + \"/" + className + "\";\n");
    result.append("  }\n");

=======
    result.append("    return \"Auto-generated filter wrapper, based on " 
	+ filter.getClass().getName() + " (generated with Weka " + Version.VERSION + ").\\n" 
	+ "\" + this.getClass().getName() + \"/" + className + "\";\n");
    result.append("  }\n");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // main
    result.append("\n");
    result.append("  /**\n");
    result.append("   * Runs the filter from commandline.\n");
    result.append("   *\n");
    result.append("   * @param args the commandline arguments\n");
    result.append("   */\n");
    result.append("  public static void main(String args[]) {\n");
    result.append("    runFilter(new WekaWrapper(), args);\n");
    result.append("  }\n");
    result.append("}\n");

    // actual filter code
    result.append("\n");
    result.append(filter.toSource(className, input));
<<<<<<< HEAD

    return result.toString();
  }

=======
    
    return result.toString();
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Method for testing filters.
   *
   * @param filter the filter to use
   * @param options should contain the following arguments: <br/>
<<<<<<< HEAD
   *          -i input_file <br/>
   *          -o output_file <br/>
   *          -c class_index <br/>
   *          -z classname (for filters implementing weka.filters.Sourcable)
   *          <br/>
   *          -decimal num (the number of decimal places to use in the output;
   *          default = 6) <br/>
   *          or -h for help on options
   * @throws Exception if something goes wrong or the user requests help on
   *           command options
   */
  public static void filterFile(Filter filter, String[] options)
=======
   * -i input_file <br/>
   * -o output_file <br/>
   * -c class_index <br/>
   * -z classname (for filters implementing weka.filters.Sourcable) <br/>
   * or -h for help on options
   * @throws Exception if something goes wrong or the user requests help on
   * command options
   */
  public static void filterFile(Filter filter, String [] options) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    throws Exception {

    boolean debug = false;
    Instances data = null;
    DataSource input = null;
    PrintWriter output = null;
    boolean helpRequest;
    String sourceCode = "";
<<<<<<< HEAD
    int maxDecimalPlaces = 6;

    try {
      helpRequest = Utils.getFlag('h', options);

      if (Utils.getFlag('d', options)) {
        debug = true;
      }
      String infileName = Utils.getOption('i', options);
      String outfileName = Utils.getOption('o', options);
      String classIndex = Utils.getOption('c', options);
      if (filter instanceof Sourcable) {
        sourceCode = Utils.getOption('z', options);
      }

      String tmpStr = Utils.getOption("decimal", options);
      if (tmpStr.length() > 0) {
        maxDecimalPlaces = Integer.parseInt(tmpStr);
      }

      if (filter instanceof OptionHandler) {
        ((OptionHandler) filter).setOptions(options);
=======

    try {
       helpRequest = Utils.getFlag('h', options);

      if (Utils.getFlag('d', options)) {
	debug = true;
      }
      String infileName = Utils.getOption('i', options);
      String outfileName = Utils.getOption('o', options); 
      String classIndex = Utils.getOption('c', options);
      if (filter instanceof Sourcable)
	sourceCode = Utils.getOption('z', options);
      
      if (filter instanceof OptionHandler) {
	((OptionHandler)filter).setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      Utils.checkForRemainingOptions(options);
      if (helpRequest) {
<<<<<<< HEAD
        throw new Exception("Help requested.\n");
      }
      if (infileName.length() != 0) {
        input = new DataSource(infileName);
      } else {
        input = new DataSource(System.in);
      }
      if (outfileName.length() != 0) {
        output = new PrintWriter(new FileOutputStream(outfileName));
      } else {
        output = new PrintWriter(System.out);
=======
	throw new Exception("Help requested.\n");
      }
      if (infileName.length() != 0) {
	input = new DataSource(infileName);
      } else {
	input = new DataSource(System.in);
      }
      if (outfileName.length() != 0) {
	output = new PrintWriter(new FileOutputStream(outfileName));
      } else { 
	output = new PrintWriter(System.out);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      data = input.getStructure();
      if (classIndex.length() != 0) {
<<<<<<< HEAD
        if (classIndex.equals("first")) {
          data.setClassIndex(0);
        } else if (classIndex.equals("last")) {
          data.setClassIndex(data.numAttributes() - 1);
        } else {
          data.setClassIndex(Integer.parseInt(classIndex) - 1);
        }
=======
	if (classIndex.equals("first")) {
	  data.setClassIndex(0);
	} else if (classIndex.equals("last")) {
	  data.setClassIndex(data.numAttributes() - 1);
	} else {
	  data.setClassIndex(Integer.parseInt(classIndex) - 1);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } catch (Exception ex) {
      String filterOptions = "";
      // Output the error and also the valid options
      if (filter instanceof OptionHandler) {
<<<<<<< HEAD
        filterOptions += "\nFilter options:\n\n";
        Enumeration<Option> enu = ((OptionHandler) filter).listOptions();
        while (enu.hasMoreElements()) {
          Option option = enu.nextElement();
          filterOptions +=
            option.synopsis() + '\n' + option.description() + "\n";
        }
      }

      String genericOptions =
        "\nGeneral options:\n\n" + "-h\n" + "\tGet help on available options.\n"
          + "\t(use -b -h for help on batch mode.)\n" + "-i <file>\n"
          + "\tThe name of the file containing input instances.\n"
          + "\tIf not supplied then instances will be read from stdin.\n"
          + "-o <file>\n"
          + "\tThe name of the file output instances will be written to.\n"
          + "\tIf not supplied then instances will be written to stdout.\n"
          + "-c <class index>\n"
          + "\tThe number of the attribute to use as the class.\n"
          + "\t\"first\" and \"last\" are also valid entries.\n"
          + "\tIf not supplied then no class is assigned.\n"
          + "-decimal <integer>\n"
          + "\tThe maximum number of digits to print after the decimal\n"
          + "\tplace for numeric values (default: 6)\n";

      if (filter instanceof Sourcable) {
        genericOptions += "-z <class name>\n"
          + "\tOutputs the source code representing the trained filter.\n";
      }

      throw new Exception(
        '\n' + ex.getMessage() + filterOptions + genericOptions);
    }

=======
	filterOptions += "\nFilter options:\n\n";
	Enumeration enu = ((OptionHandler)filter).listOptions();
	while (enu.hasMoreElements()) {
	  Option option = (Option) enu.nextElement();
	  filterOptions += option.synopsis() + '\n'
	    + option.description() + "\n";
	}
      }

      String genericOptions = "\nGeneral options:\n\n"
	+ "-h\n"
	+ "\tGet help on available options.\n"
	+ "\t(use -b -h for help on batch mode.)\n"
	+ "-i <file>\n"
	+ "\tThe name of the file containing input instances.\n"
	+ "\tIf not supplied then instances will be read from stdin.\n"
	+ "-o <file>\n"
	+ "\tThe name of the file output instances will be written to.\n"
	+ "\tIf not supplied then instances will be written to stdout.\n"
	+ "-c <class index>\n"
	+ "\tThe number of the attribute to use as the class.\n"
	+ "\t\"first\" and \"last\" are also valid entries.\n"
	+ "\tIf not supplied then no class is assigned.\n";

      if (filter instanceof Sourcable) {
	genericOptions +=
	  "-z <class name>\n"
	  + "\tOutputs the source code representing the trained filter.\n";
      }
      
      throw new Exception('\n' + ex.getMessage()
			  + filterOptions+genericOptions);
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (debug) {
      System.err.println("Setting input format");
    }
    boolean printedHeader = false;
    if (filter.setInputFormat(data)) {
      if (debug) {
<<<<<<< HEAD
        System.err.println("Getting output format");
=======
	System.err.println("Getting output format");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      output.println(filter.getOutputFormat().toString());
      printedHeader = true;
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // Pass all the instances to the filter
    Instance inst;
    while (input.hasMoreElements(data)) {
      inst = input.nextElement(data);
      if (debug) {
<<<<<<< HEAD
        System.err.println("Input instance to filter");
      }
      if (filter.input(inst)) {
        if (debug) {
          System.err.println("Filter said collect immediately");
        }
        if (!printedHeader) {
          throw new Error(
            "Filter didn't return true from setInputFormat() " + "earlier!");
        }
        if (debug) {
          System.err.println("Getting output instance");
        }
        output
          .println(filter.output().toStringMaxDecimalDigits(maxDecimalPlaces));
=======
	System.err.println("Input instance to filter");
      }
      if (filter.input(inst)) {
	if (debug) {
	  System.err.println("Filter said collect immediately");
	}
	if (!printedHeader) {
	  throw new Error("Filter didn't return true from setInputFormat() "
			  + "earlier!");
	}
	if (debug) {
	  System.err.println("Getting output instance");
	}
	output.println(filter.output().toString());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // Say that input has finished, and print any pending output instances
    if (debug) {
      System.err.println("Setting end of batch");
    }
    if (filter.batchFinished()) {
      if (debug) {
<<<<<<< HEAD
        System.err.println("Filter said collect output");
      }
      if (!printedHeader) {
        if (debug) {
          System.err.println("Getting output format");
        }
        output.println(filter.getOutputFormat().toString());
      }
      if (debug) {
        System.err.println("Getting output instance");
      }
      while (filter.numPendingOutput() > 0) {
        output
          .println(filter.output().toStringMaxDecimalDigits(maxDecimalPlaces));
        if (debug) {
          System.err.println("Getting output instance");
        }
=======
	System.err.println("Filter said collect output");
      }
      if (!printedHeader) {
	if (debug) {
	  System.err.println("Getting output format");
	}
	output.println(filter.getOutputFormat().toString());
      }
      if (debug) {
	System.err.println("Getting output instance");
      }
      while (filter.numPendingOutput() > 0) {
	output.println(filter.output().toString());
	if (debug){
	  System.err.println("Getting output instance");
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    if (debug) {
      System.err.println("Done");
    }
<<<<<<< HEAD

    if (output != null) {
      output.close();
    }

    if (sourceCode.length() != 0) {
      System.out.println(wekaStaticWrapper((Sourcable) filter, sourceCode, data,
        filter.getOutputFormat()));
    }
=======
    
    if (output != null) {
      output.close();
    }
    
    if (sourceCode.length() != 0)
      System.out.println(
	  wekaStaticWrapper(
	      (Sourcable) filter, sourceCode, data, filter.getOutputFormat()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Method for testing filters ability to process multiple batches.
   *
   * @param filter the filter to use
   * @param options should contain the following arguments: <br/>
<<<<<<< HEAD
   *          -i (first) input file <br/>
   *          -o (first) output file <br/>
   *          -r (second) input file <br/>
   *          -s (second) output file <br/>
   *          -c class_index <br/>
   *          -z classname (for filters implementing weka.filters.Sourcable)
   *          <br/>
   *          -decimal num (the number of decimal places to use in the output;
   *          default = 6) <br/>
   *          or -h for help on options
   * @throws Exception if something goes wrong or the user requests help on
   *           command options
   */
  public static void batchFilterFile(Filter filter, String[] options)
=======
   * -i (first) input file <br/>
   * -o (first) output file <br/>
   * -r (second) input file <br/>
   * -s (second) output file <br/>
   * -c class_index <br/>
   * -z classname (for filters implementing weka.filters.Sourcable) <br/>
   * or -h for help on options
   * @throws Exception if something goes wrong or the user requests help on
   * command options
   */
  public static void batchFilterFile(Filter filter, String [] options) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    throws Exception {

    Instances firstData = null;
    Instances secondData = null;
    DataSource firstInput = null;
    DataSource secondInput = null;
    PrintWriter firstOutput = null;
    PrintWriter secondOutput = null;
    boolean helpRequest;
    String sourceCode = "";
<<<<<<< HEAD
    int maxDecimalPlaces = 6;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    try {
      helpRequest = Utils.getFlag('h', options);

<<<<<<< HEAD
      String fileName = Utils.getOption('i', options);
      if (fileName.length() != 0) {
        firstInput = new DataSource(fileName);
      } else {
        throw new Exception("No first input file given.\n");
      }

      fileName = Utils.getOption('r', options);
      if (fileName.length() != 0) {
        secondInput = new DataSource(fileName);
      } else {
        throw new Exception("No second input file given.\n");
      }

      fileName = Utils.getOption('o', options);
      if (fileName.length() != 0) {
        firstOutput = new PrintWriter(new FileOutputStream(fileName));
      } else {
        firstOutput = new PrintWriter(System.out);
      }

      fileName = Utils.getOption('s', options);
      if (fileName.length() != 0) {
        secondOutput = new PrintWriter(new FileOutputStream(fileName));
      } else {
        secondOutput = new PrintWriter(System.out);
      }
      String classIndex = Utils.getOption('c', options);
      if (filter instanceof Sourcable) {
        sourceCode = Utils.getOption('z', options);
      }

      String tmpStr = Utils.getOption("decimal", options);
      if (tmpStr.length() > 0) {
        maxDecimalPlaces = Integer.parseInt(tmpStr);
      }

      if (filter instanceof OptionHandler) {
        ((OptionHandler) filter).setOptions(options);
      }
      Utils.checkForRemainingOptions(options);

      if (helpRequest) {
        throw new Exception("Help requested.\n");
=======
      String fileName = Utils.getOption('i', options); 
      if (fileName.length() != 0) {
	firstInput = new DataSource(fileName);
      } else {
	throw new Exception("No first input file given.\n");
      }

      fileName = Utils.getOption('r', options); 
      if (fileName.length() != 0) {
	secondInput = new DataSource(fileName);
      } else {
	throw new Exception("No second input file given.\n");
      }

      fileName = Utils.getOption('o', options); 
      if (fileName.length() != 0) {
	firstOutput = new PrintWriter(new FileOutputStream(fileName));
      } else {
	firstOutput = new PrintWriter(System.out);
      }
      
      fileName = Utils.getOption('s', options); 
      if (fileName.length() != 0) {
	secondOutput = new PrintWriter(new FileOutputStream(fileName));
      } else {
	secondOutput = new PrintWriter(System.out);
      }
      String classIndex = Utils.getOption('c', options);
      if (filter instanceof Sourcable)
	sourceCode = Utils.getOption('z', options);

      if (filter instanceof OptionHandler) {
	((OptionHandler)filter).setOptions(options);
      }
      Utils.checkForRemainingOptions(options);
      
      if (helpRequest) {
	throw new Exception("Help requested.\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      firstData = firstInput.getStructure();
      secondData = secondInput.getStructure();
      if (!secondData.equalHeaders(firstData)) {
<<<<<<< HEAD
        throw new Exception("Input file formats differ.\n"
          + secondData.equalHeadersMsg(firstData) + "\n");
      }
      if (classIndex.length() != 0) {
        if (classIndex.equals("first")) {
          firstData.setClassIndex(0);
          secondData.setClassIndex(0);
        } else if (classIndex.equals("last")) {
          firstData.setClassIndex(firstData.numAttributes() - 1);
          secondData.setClassIndex(secondData.numAttributes() - 1);
        } else {
          firstData.setClassIndex(Integer.parseInt(classIndex) - 1);
          secondData.setClassIndex(Integer.parseInt(classIndex) - 1);
        }
=======
	throw new Exception("Input file formats differ.\n");
      }
      if (classIndex.length() != 0) {
	if (classIndex.equals("first")) {
	  firstData.setClassIndex(0);
	  secondData.setClassIndex(0);
	} else if (classIndex.equals("last")) {
	  firstData.setClassIndex(firstData.numAttributes() - 1);
	  secondData.setClassIndex(secondData.numAttributes() - 1);
	} else {
	  firstData.setClassIndex(Integer.parseInt(classIndex) - 1);
	  secondData.setClassIndex(Integer.parseInt(classIndex) - 1);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } catch (Exception ex) {
      String filterOptions = "";
      // Output the error and also the valid options
      if (filter instanceof OptionHandler) {
<<<<<<< HEAD
        filterOptions += "\nFilter options:\n\n";
        Enumeration<Option> enu = ((OptionHandler) filter).listOptions();
        while (enu.hasMoreElements()) {
          Option option = enu.nextElement();
          filterOptions +=
            option.synopsis() + '\n' + option.description() + "\n";
        }
      }

      String genericOptions = "\nGeneral options:\n\n" + "-h\n"
        + "\tGet help on available options.\n" + "-i <filename>\n"
        + "\tThe file containing first input instances.\n" + "-o <filename>\n"
        + "\tThe file first output instances will be written to.\n"
        + "-r <filename>\n" + "\tThe file containing second input instances.\n"
        + "-s <filename>\n"
        + "\tThe file second output instances will be written to.\n"
        + "-c <class index>\n"
        + "\tThe number of the attribute to use as the class.\n"
        + "\t\"first\" and \"last\" are also valid entries.\n"
        + "\tIf not supplied then no class is assigned.\n"
        + "-decimal <integer>\n"
        + "\tThe maximum number of digits to print after the decimal\n"
        + "\tplace for numeric values (default: 6)\n";

      if (filter instanceof Sourcable) {
        genericOptions += "-z <class name>\n"
          + "\tOutputs the source code representing the trained filter.\n";
      }

      throw new Exception(
        '\n' + ex.getMessage() + filterOptions + genericOptions);
=======
	filterOptions += "\nFilter options:\n\n";
	Enumeration enu = ((OptionHandler)filter).listOptions();
	while (enu.hasMoreElements()) {
	  Option option = (Option) enu.nextElement();
	  filterOptions += option.synopsis() + '\n'
	    + option.description() + "\n";
	}
      }

      String genericOptions = "\nGeneral options:\n\n"
	+ "-h\n"
	+ "\tGet help on available options.\n"
	+ "-i <filename>\n"
	+ "\tThe file containing first input instances.\n"
	+ "-o <filename>\n"
	+ "\tThe file first output instances will be written to.\n"
	+ "-r <filename>\n"
	+ "\tThe file containing second input instances.\n"
	+ "-s <filename>\n"
	+ "\tThe file second output instances will be written to.\n"
	+ "-c <class index>\n"
	+ "\tThe number of the attribute to use as the class.\n"
	+ "\t\"first\" and \"last\" are also valid entries.\n"
	+ "\tIf not supplied then no class is assigned.\n";

      if (filter instanceof Sourcable) {
	genericOptions +=
	  "-z <class name>\n"
	  + "\tOutputs the source code representing the trained filter.\n";
      }
      
      throw new Exception('\n' + ex.getMessage()
			  + filterOptions+genericOptions);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    boolean printedHeader = false;
    if (filter.setInputFormat(firstData)) {
      firstOutput.println(filter.getOutputFormat().toString());
      printedHeader = true;
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // Pass all the instances to the filter
    Instance inst;
    while (firstInput.hasMoreElements(firstData)) {
      inst = firstInput.nextElement(firstData);
      if (filter.input(inst)) {
<<<<<<< HEAD
        if (!printedHeader) {
          throw new Error(
            "Filter didn't return true from setInputFormat() " + "earlier!");
        }
        firstOutput
          .println(filter.output().toStringMaxDecimalDigits(maxDecimalPlaces));
      }
    }

    // Say that input has finished, and print any pending output instances
    if (filter.batchFinished()) {
      if (!printedHeader) {
        firstOutput.println(filter.getOutputFormat().toString());
      }
      while (filter.numPendingOutput() > 0) {
        firstOutput
          .println(filter.output().toStringMaxDecimalDigits(maxDecimalPlaces));
      }
    }

    if (firstOutput != null) {
      firstOutput.close();
    }
=======
	if (!printedHeader) {
	  throw new Error("Filter didn't return true from setInputFormat() "
			  + "earlier!");
	}
	firstOutput.println(filter.output().toString());
      }
    }
    
    // Say that input has finished, and print any pending output instances
    if (filter.batchFinished()) {
      if (!printedHeader) {
	firstOutput.println(filter.getOutputFormat().toString());
      }
      while (filter.numPendingOutput() > 0) {
	firstOutput.println(filter.output().toString());
      }
    }
    
    if (firstOutput != null) {
      firstOutput.close();
    }    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    printedHeader = false;
    if (filter.isOutputFormatDefined()) {
      secondOutput.println(filter.getOutputFormat().toString());
      printedHeader = true;
    }
    // Pass all the second instances to the filter
    while (secondInput.hasMoreElements(secondData)) {
      inst = secondInput.nextElement(secondData);
      if (filter.input(inst)) {
<<<<<<< HEAD
        if (!printedHeader) {
          throw new Error("Filter didn't return true from"
            + " isOutputFormatDefined() earlier!");
        }
        secondOutput
          .println(filter.output().toStringMaxDecimalDigits(maxDecimalPlaces));
      }
    }

    // Say that input has finished, and print any pending output instances
    if (filter.batchFinished()) {
      if (!printedHeader) {
        secondOutput.println(filter.getOutputFormat().toString());
      }
      while (filter.numPendingOutput() > 0) {
        secondOutput
          .println(filter.output().toStringMaxDecimalDigits(maxDecimalPlaces));
=======
	if (!printedHeader) {
	  throw new Error("Filter didn't return true from"
			  + " isOutputFormatDefined() earlier!");
	}
	secondOutput.println(filter.output().toString());
      }
    }
    
    // Say that input has finished, and print any pending output instances
    if (filter.batchFinished()) {
      if (!printedHeader) {
	secondOutput.println(filter.getOutputFormat().toString());
      }
      while (filter.numPendingOutput() > 0) {
	secondOutput.println(filter.output().toString());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    if (secondOutput != null) {
      secondOutput.close();
    }

<<<<<<< HEAD
    if (sourceCode.length() != 0) {
      System.out.println(wekaStaticWrapper((Sourcable) filter, sourceCode,
        firstData, filter.getOutputFormat()));
    }
=======
    if (sourceCode.length() != 0)
      System.out.println(
	  wekaStaticWrapper(
	      (Sourcable) filter, sourceCode, firstData, filter.getOutputFormat()));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * runs the filter instance with the given options.
<<<<<<< HEAD
   *
   * @param filter the filter to run
   * @param options the commandline options
   */
  public static void runFilter(Filter filter, String[] options) {
    try {
      filter.preExecution();
      if (Utils.getFlag('b', options)) {
        Filter.batchFilterFile(filter, options);
      } else {
        Filter.filterFile(filter, options);
      }
    } catch (Exception e) {
      if ((e.toString().indexOf("Help requested") == -1)
        && (e.toString().indexOf("Filter options") == -1)) {
        e.printStackTrace();
      } else {
        System.err.println(e.getMessage());
      }
    }
    try {
      filter.postExecution();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector =
      Option.listOptionsForClassHierarchy(this.getClass(), Filter.class);

    newVector.addElement(new Option(
      "\tIf set, filter is run in debug mode and\n"
        + "\tmay output additional info to the console",
      "output-debug-info", 0, "-output-debug-info"));
    newVector.addElement(new Option(
      "\tIf set, filter capabilities are not checked before filter is built\n"
        + "\t(use with caution).",
      "-do-not-check-capabilities", 0, "-do-not-check-capabilities"));

    return newVector.elements();
  }

  /**
   * Parses a given list of options. Valid options are:
   * <p>
   *
   * -D <br>
   * If set, filter is run in debug mode and may output additional info to the
   * console.
   * <p>
   *
   * -do-not-check-capabilities <br>
   * If set, filter capabilities are not checked before filter is built (use
   * with caution).
   * <p>
   *
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    Option.setOptionsForHierarchy(options, this, Filter.class);
    setDebug(Utils.getFlag("output-debug-info", options));
    setDoNotCheckCapabilities(
      Utils.getFlag("do-not-check-capabilities", options));
  }

  /**
   * Gets the current settings of the filter.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();
    for (String s : Option.getOptionsForHierarchy(this, Filter.class)) {
      options.add(s);
    }

    if (getDebug()) {
      options.add("-output-debug-info");
    }
    if (getDoNotCheckCapabilities()) {
      options.add("-do-not-check-capabilities");
    }

    return options.toArray(new String[0]);
  }

  /**
   * Set debugging mode.
   *
   * @param debug true if debug output should be printed
   */
  public void setDebug(boolean debug) {

    m_Debug = debug;
  }

  /**
   * Get whether debugging is turned on.
   * 
   * @return true if debugging output is on
   */
  public boolean getDebug() {

    return m_Debug;
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String debugTipText() {
    return "If set to true, filter may output additional info to "
      + "the console.";
  }

  /**
   * Set whether not to check capabilities.
   *
   * @param doNotCheckCapabilities true if capabilities are not to be checked.
   */
  public void setDoNotCheckCapabilities(boolean doNotCheckCapabilities) {

    m_DoNotCheckCapabilities = doNotCheckCapabilities;
  }

  /**
   * Get whether capabilities checking is turned off.
   * 
   * @return true if capabilities checking is turned off.
   */
  public boolean getDoNotCheckCapabilities() {

    return m_DoNotCheckCapabilities;
  }

  /**
   * Returns the tip text for this property
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String doNotCheckCapabilitiesTipText() {
    return "If set, the filter's capabilities are not checked before it is built."
      + " (Use with caution to reduce runtime.)";
  }

  /**
   * Perform any setup stuff that might need to happen before commandline
   * execution. Subclasses should override if they need to do something here
   *
   * @throws Exception if a problem occurs during setup
   */
  @Override
  public void preExecution() throws Exception {
  }

  /**
   * Execute the supplied object.
   *
   * @param toRun the object to execute
   * @param options any options to pass to the object
   * @throws Exception if the object is not of the expected type.
   */
  @Override
  public void run(Object toRun, String[] options) throws Exception {
    if (!(toRun instanceof Filter)) {
      throw new IllegalArgumentException("Object to run is not a Filter!");
    }
    runFilter((Filter) toRun, options);
  }

  /**
   * Perform any teardown stuff that might need to happen after execution.
   * Subclasses should override if they need to do something here
   *
   * @throws Exception if a problem occurs during teardown
   */
  @Override
  public void postExecution() throws Exception {
  }

=======
   * 
   * @param filter	the filter to run
   * @param options	the commandline options
   */
  protected static void runFilter(Filter filter, String[] options) {
    try {
      if (Utils.getFlag('b', options)) {
	Filter.batchFilterFile(filter, options);
      } else {
	Filter.filterFile(filter, options);
      }
    } catch (Exception e) {
      if (    (e.toString().indexOf("Help requested") == -1) 
	   && (e.toString().indexOf("Filter options") == -1) )
	e.printStackTrace();
      else
	System.err.println(e.getMessage());
    }
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Main method for testing this class.
   *
   * @param args should contain arguments to the filter: use -h for help
   */
<<<<<<< HEAD
  public static void main(String[] args) {

    try {
      if (args.length == 0) {
        throw new Exception(
          "First argument must be the class name of a Filter");
      }
      String fname = args[0];
      Filter f = (Filter) Class.forName(fname).newInstance();
=======
  public static void main(String [] args) {
    
    try {
      if (args.length == 0) {
        throw new Exception("First argument must be the class name of a Filter");
      }
      String fname = args[0];
      Filter f = (Filter)Class.forName(fname).newInstance();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      args[0] = "";
      runFilter(f, args);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
