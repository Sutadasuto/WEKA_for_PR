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
 *    AbstractSaver.java
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

package weka.core.converters;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.CapabilitiesIgnorer;
import weka.core.Instance;
import weka.core.Instances;

/**
 * Abstract class for Saver
 * 
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author Stefan Mutter (mutter@cs.waikato.ac.nz)
 * @version $Revision: 11006 $
 */
public abstract class AbstractSaver implements Saver, CapabilitiesHandler,
                                               CapabilitiesIgnorer {

  /** ID to avoid warning */
  private static final long serialVersionUID = -27467499727819258L;
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.Instance;
import weka.core.Instances;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Abstract class for Saver
 *
 * @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 * @author Stefan Mutter (mutter@cs.waikato.ac.nz)
 * @version $Revision: 1.4 $
 */
public abstract class AbstractSaver
  implements Saver, CapabilitiesHandler {
  
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The write modes */
  protected static final int WRITE = 0;
  protected static final int WAIT = 1;
  protected static final int CANCEL = 2;
  protected static final int STRUCTURE_READY = 3;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The instances that should be stored */
  private Instances m_instances;

  /** The current retrieval mode */
  protected int m_retrieval;

  /** The current write mode */
  private int m_writeMode;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Whether capabilities should not be checked */
  protected boolean m_DoNotCheckCapabilities = false;

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String doNotCheckCapabilitiesTipText() {
    return "If set, saver capabilities are not checked"
      + " (Use with caution to reduce runtime).";
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
   * resets the options
   * 
   */
  public void resetOptions() {

    m_instances = null;
    m_writeMode = WAIT;
  }

  /** Resets the structure (header information of the instances) */
  public void resetStructure() {

    m_instances = null;
    m_writeMode = WAIT;
  }

  /**
   * Sets the retrieval mode.
   * 
   * @param mode the retrieval mode
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  
  /**
   * resets the options
   *
   */
  public void resetOptions(){
      
     m_instances = null;
     m_writeMode = WAIT;
  }
  
  
  /** Resets the structure (header information of the instances) */  
  public void resetStructure(){
   
      m_instances = null;
      m_writeMode = WAIT;
  }
  
  
  /**
   * Sets the retrieval mode.
   *
   * @param mode the retrieval mode
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setRetrieval(int mode) {

    m_retrieval = mode;
  }

  /**
   * Gets the retrieval mode.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the retrieval mode
   */
  protected int getRetrieval() {

    return m_retrieval;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets the write mode.
   * 
<<<<<<< HEAD
=======
=======
  
  
  /**
   * Sets the write mode.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param mode the write mode
   */
  protected void setWriteMode(int mode) {

    m_writeMode = mode;
  }

  /**
   * Gets the write mode.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the write mode
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return the write mode
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int getWriteMode() {

    return m_writeMode;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets instances that should be stored.
   * 
   * @param instances the instances
   */
  @Override
  public void setInstances(Instances instances) {

    Capabilities cap = getCapabilities();
    if (!cap.test(instances)) {
      throw new IllegalArgumentException(cap.getFailReason());
    }

    if (m_retrieval == INCREMENTAL) {
      if (setStructure(instances) == CANCEL) {
        cancel();
      }
    } else {
      m_instances = instances;
    }
  }

  /**
   * Gets instances that should be stored.
   * 
   * @return the instances
   */
  public Instances getInstances() {

    return m_instances;
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @param file the File
   * @exception IOException always
   */
  @Override
  public void setDestination(File file) throws IOException {

    throw new IOException("Writing to a file not supported");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @param output the OutputStream
   * @exception IOException always
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  
  /**
   * Sets instances that should be stored.
   *
   * @param instances the instances
   */
  public void setInstances(Instances instances){

      Capabilities cap = getCapabilities();
      if (!cap.test(instances))
	throw new IllegalArgumentException(cap.getFailReason());
    
      if(m_retrieval == INCREMENTAL){
          if(setStructure(instances) == CANCEL)
              cancel();
      }
      else  
        m_instances = instances;
  }
  
  /**
   * Gets instances that should be stored.
   *
   * @return the instances
   */
  public Instances getInstances(){
   
      return m_instances;
  }
 

  /**
   * Default implementation throws an IOException.
   *
   * @param file the File
   * @exception IOException always
   */
  public void setDestination(File file) throws IOException {
  
    throw new IOException("Writing to a file not supported");
  }
  
  
  /**
   * Default implementation throws an IOException.
   *
   * @param output the OutputStream
   * @exception IOException always
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setDestination(OutputStream output) throws IOException {

    throw new IOException("Writing to an outputstream not supported");
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the Capabilities of this saver. Derived savers have to override
   * this method to enable capabilities.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = new Capabilities(this);

    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * Sets the strcuture of the instances for the first step of incremental
   * saving. The instances only need to have a header.
   * 
   * @param headerInfo an instances object.
   * @return the appropriate write mode
   */
  public int setStructure(Instances headerInfo) {

    Capabilities cap = getCapabilities();
    if (!cap.test(headerInfo)) {
      throw new IllegalArgumentException(cap.getFailReason());
    }

    if (m_writeMode == WAIT && headerInfo != null) {
      m_instances = headerInfo;
      m_writeMode = STRUCTURE_READY;
    } else {
      if ((headerInfo == null) || !(m_writeMode == STRUCTURE_READY)
        || !headerInfo.equalHeaders(m_instances)) {
        m_instances = null;
        if (m_writeMode != WAIT) {
          System.err
            .println("A structure cannot be set up during an active incremental saving process.");
        }
        m_writeMode = CANCEL;
      }
    }
    return m_writeMode;
  }

  /** Cancels the incremental saving process if the write mode is CANCEL. */
  public void cancel() {

    if (m_writeMode == CANCEL) {
      resetOptions();
    }
  }

  /**
   * Method for incremental saving. Standard behaviour: no incremental saving is
   * possible, therefore throw an IOException. An incremental saving process is
   * stopped by calling this method with null.
   * 
   * @param i the instance to be saved
   * @throws IOException IOEXception if the instance acnnot be written to the
   *           specified destination
   */
  @Override
  public void writeIncremental(Instance i) throws IOException {

    throw new IOException("No Incremental saving possible.");
  }

  /**
   * Writes to a file in batch mode To be overridden.
   * 
   * @throws IOException exception if writting is not possible
   */
  @Override
  public abstract void writeBatch() throws IOException;

  /**
   * Default implementation throws an IOException.
   * 
   * @exception IOException always
   */
  @Override
  public String getFileExtension() throws Exception {

    throw new Exception("Saving in a file not supported.");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @param file the File
   * @exception IOException always
   */
  @Override
  public void setFile(File file) throws IOException {

    throw new IOException("Saving in a file not supported.");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @param prefix the file prefix
   * @exception IOException always
   */
  @Override
  public void setFilePrefix(String prefix) throws Exception {

    throw new Exception("Saving in a file not supported.");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @exception IOException always
   */
  @Override
  public String filePrefix() throws Exception {

    throw new Exception("Saving in a file not supported.");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @param dir the name of the directory to save in
   * @exception IOException always
   */
  @Override
  public void setDir(String dir) throws IOException {

    throw new IOException("Saving in a file not supported.");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @param relationName
   * @param add
   * @exception IOException always
   */
  @Override
  public void setDirAndPrefix(String relationName, String add)
    throws IOException {

    throw new IOException("Saving in a file not supported.");
  }

  /**
   * Default implementation throws an IOException.
   * 
   * @exception IOException always
   */
  @Override
  public String retrieveDir() throws IOException {

    throw new IOException("Saving in a file not supported.");
  }

<<<<<<< HEAD
=======
=======
  /** 
   * Returns the Capabilities of this saver. Derived savers have to
   * override this method to enable capabilities.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = new Capabilities(this);
    
    result.setMinimumNumberInstances(0);
    
    return result;
  }
  
  /** Sets the strcuture of the instances for the first step of incremental saving.
   * The instances only need to have a header.
   * @param headerInfo an instances object.
   * @return the appropriate write mode
   */  
  public int setStructure(Instances headerInfo){
  
      Capabilities cap = getCapabilities();
      if (!cap.test(headerInfo))
	throw new IllegalArgumentException(cap.getFailReason());
  
      if(m_writeMode == WAIT && headerInfo != null){
        m_instances = headerInfo;
        m_writeMode = STRUCTURE_READY;
      }
      else{
        if((headerInfo == null)  || !(m_writeMode == STRUCTURE_READY) || !headerInfo.equalHeaders(m_instances)){
            m_instances = null;
            if(m_writeMode != WAIT)
                System.err.println("A structure cannot be set up during an active incremental saving process.");
            m_writeMode = CANCEL;
        }
      }
      return m_writeMode;
  }
  
  /** Cancels the incremental saving process if the write mode is CANCEL. */  
  public void cancel(){
  
      if(m_writeMode == CANCEL)
        resetOptions();
  }
  

  
  /** Method for incremental saving.
   * Standard behaviour: no incremental saving is possible, therefore throw an
   * IOException.
   * An incremental saving process is stopped by calling this method with null.
   * @param i the instance to be saved
   * @throws IOException IOEXception if the instance acnnot be written to the specified destination
   */  
  public void writeIncremental(Instance i) throws IOException{
  
      throw new IOException("No Incremental saving possible.");
  }
  
  
  
  /** Writes to a file in batch mode
   * To be overridden.
   * @throws IOException exception if writting is not possible
   */  
  public abstract void writeBatch() throws IOException;

   
  /**
   * Default implementation throws an IOException.
   *
   * @exception IOException always
   */
  public String getFileExtension() throws Exception{
  
      throw new Exception("Saving in a file not supported.");
  }
  
  /**
   * Default implementation throws an IOException.
   *
   * @param file the File
   * @exception IOException always
   */
  public void setFile(File file)throws IOException{
  
      throw new IOException("Saving in a file not supported.");
  }
  
  /**
   * Default implementation throws an IOException.
   *
   * @param prefix the file prefix
   * @exception IOException always
   */
  public void setFilePrefix(String prefix) throws Exception{
  
      throw new Exception("Saving in a file not supported.");
  }
  
  /**
   * Default implementation throws an IOException.
   *
   * @exception IOException always
   */
  public String filePrefix() throws Exception{
  
      throw new Exception("Saving in a file not supported.");
  }
  
  /**
   * Default implementation throws an IOException.
   *
   * @param dir the name of the directory to save in
   * @exception IOException always
   */
  public void setDir(String dir) throws IOException{
    
      throw new IOException("Saving in a file not supported.");
  }
  
  /**
   * Default implementation throws an IOException.
   *
   * @param relationName 
   * @param add
   * @exception IOException always
   */
  public void setDirAndPrefix(String relationName, String add) throws IOException{
  
      throw new IOException("Saving in a file not supported.");
  }
  
  /**
   * Default implementation throws an IOException.
   *
   * @exception IOException always
   */
  public String retrieveDir() throws IOException{
  
      throw new IOException("Saving in a file not supported.");
  }
  
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
