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
 *    ArffSaver.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.core.converters;

<<<<<<< HEAD
=======
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Capabilities.Capability;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.util.Enumeration;
import java.util.Vector;
import java.util.zip.GZIPOutputStream;

<<<<<<< HEAD
import weka.core.AbstractInstance;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * Writes to a destination in arff text format.
 * <p/>
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -i &lt;the input file&gt;
 *  The input file
 * </pre>
 * 
 * <pre>
 * -o &lt;the output file&gt;
 *  The output file
 * </pre>
 * 
 * <pre>
 * -compress
 *  Compresses the data (uses '.arff.gz' as extension instead of '.arff')
 *  (default: off)
 * </pre>
 * 
 * <pre>
 * -decimal &lt;num&gt;
 *  The maximum number of digits to print after the decimal
 *  place for numeric values (default: 6)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Stefan Mutter (mutter@cs.waikato.ac.nz)
 * @version $Revision: 11506 $
 * @see Saver
 */
public class ArffSaver extends AbstractFileSaver implements BatchConverter,
  IncrementalConverter {

  /** for serialization */
  static final long serialVersionUID = 2223634248900042228L;

  /** whether to compress the output */
  protected boolean m_CompressOutput = false;

  /** Max number of decimal places for numeric values */
  protected int m_MaxDecimalPlaces = AbstractInstance.s_numericAfterDecimalPoint;

  /** Constructor */
  public ArffSaver() {

    resetOptions();
  }

=======
/**
 * Writes to a destination in arff text format. <p/>
 *
 <!-- options-start -->
 * Valid options are: <p/>
 *
 * <pre> -i &lt;the input file&gt;
 * The input file</pre>
 *
 * <pre> -o &lt;the output file&gt;
 * The output file</pre>
 *
 <!-- options-end -->
 *
 * @author Stefan Mutter (mutter@cs.waikato.ac.nz)
 * @version $Revision: 7950 $
 * @see Saver
 */
public class ArffSaver
  extends AbstractFileSaver
  implements BatchConverter, IncrementalConverter {

  /** for serialization */
  static final long serialVersionUID = 2223634248900042228L;
  
  /** whether to compress the output */
  protected boolean m_CompressOutput = false;

  /** Constructor */
  public ArffSaver(){

      resetOptions();
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tCompresses the data (uses '"
      + ArffLoader.FILE_EXTENSION_COMPRESSED + "' as extension instead of '"
      + ArffLoader.FILE_EXTENSION + "')\n" + "\t(default: off)", "compress", 0,
      "-compress"));

    result.addElement(new Option(
      "\tThe maximum number of digits to print after the decimal\n"
        + "\tplace for numeric values (default: 6)", "decimal", 1,
      "-decimal <num>"));

    result.addAll(Collections.list(super.listOptions()));

    return result.elements();
  }

  /**
   * returns the options of the current setup
   * 
   * @return the current options
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();

    if (getCompressOutput()) {
      result.add("-compress");
    }

    result.add("-decimal");
    result.add("" + getMaxDecimalPlaces());

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Parses the options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -i &lt;the input file&gt;
   *  The input file
   * </pre>
   * 
   * <pre>
   * -o &lt;the output file&gt;
   *  The output file
   * </pre>
   * 
   * <pre>
   * -compress
   *  Compresses the data (uses '.arff.gz' as extension instead of '.arff')
   *  (default: off)
   * </pre>
   * 
   * <pre>
   * -decimal &lt;num&gt;
   *  The maximum number of digits to print after the decimal
   *  place for numeric values (default: 6)
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the options to use
   * @throws Exception if setting of options fails
   */
  @Override
  public void setOptions(String[] options) throws Exception {

    setCompressOutput(Utils.getFlag("compress", options));

    String tmpStr = Utils.getOption("decimal", options);
    if (tmpStr.length() > 0) {
      setMaxDecimalPlaces(Integer.parseInt(tmpStr));
    }

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
  }

  /**
   * Set the maximum number of decimal places to print
   * 
   * @param maxDecimal the maximum number of decimal places to print
   */
  public void setMaxDecimalPlaces(int maxDecimal) {
    m_MaxDecimalPlaces = maxDecimal;
  }

  /**
   * Get the maximum number of decimal places to print
   * 
   * @return the maximum number of decimal places to print
   */
  public int getMaxDecimalPlaces() {
    return m_MaxDecimalPlaces;
  }

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String maxDecimalPlacesTipText() {
    return "The maximum number of digits to print after the decimal "
      + "point for numeric values";
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  public Enumeration listOptions() {
    Vector<Option>      result;
    
    result = new Vector<Option>();
    
    Enumeration en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement((Option)en.nextElement());
    
    result.addElement(
        new Option(
            "\tThe class index (first and last are valid as well).\n"
            + "\t(default: last)",
            "C", 1, "-C <class index>"));
    
    result.addElement(
        new Option(
            "\tCompresses the data (uses '" 
            + XRFFLoader.FILE_EXTENSION_COMPRESSED 
            + "' as extension instead of '" 
            + XRFFLoader.FILE_EXTENSION + "')\n"
            + "\t(default: off)",
            "compress", 0, "-compress"));
    
    return result.elements();
  }
  
  /**
   * returns the options of the current setup
   *
   * @return            the current options
   */
  public String[] getOptions(){
    int         i;
    Vector<String>      result;
    String[]    options;

    result = new Vector<String>();

    if (getCompressOutput())
      result.add("-compress");
    
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return (String[]) result.toArray(new String[result.size()]);          
  }

  /**
   * Parses the options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -i &lt;the input file&gt;
   *  The input file</pre>
   * 
   * <pre> -o &lt;the output file&gt;
   *  The output file</pre>
   *  
   * <pre> -compress
   *  Compresses the data (uses '.xrff.gz' as extension instead of '.xrff')
   *  (default: off)</pre>
   * 
   <!-- options-end -->
   *
   * @param options     the options to use
   * @throws Exception  if setting of options fails
   */
  public void setOptions(String[] options) throws Exception {

    setCompressOutput(Utils.getFlag("compress", options));
    
    super.setOptions(options);
  }
  
  /**
   * Returns the tip text for this property
   * 
   * @return            tip text for this property suitable for
   *                    displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String compressOutputTipText() {
    return "Optional compression of the output data";
  }
<<<<<<< HEAD

  /**
   * Gets whether the output data is compressed.
   * 
   * @return true if the output data is compressed
=======
  
  /**
   * Gets whether the output data is compressed.
   *
   * @return            true if the output data is compressed
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public boolean getCompressOutput() {
    return m_CompressOutput;
  }

  /**
   * Sets whether to compress the output.
<<<<<<< HEAD
   * 
   * @param value if truee the output will be compressed
=======
   *
   * @param value       if truee the output will be compressed
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setCompressOutput(boolean value) {
    m_CompressOutput = value;
  }

<<<<<<< HEAD
  /**
   * Returns a string describing this Saver
   * 
   * @return a description of the Saver suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Writes to a destination that is in arff (attribute relation file format) "
      + "format. The data can be compressed with gzip in order to save space.";
  }

  /**
   * Returns a description of the file type.
   * 
   * @return a short file description
   */
  @Override
  public String getFileDescription() {
    return "Arff data files";
  }

  /**
   * Gets all the file extensions used for this type of file
   * 
   * @return the file extensions
   */
  @Override
  public String[] getFileExtensions() {
    return new String[] { ArffLoader.FILE_EXTENSION,
      ArffLoader.FILE_EXTENSION_COMPRESSED };
  }

  /**
=======

  /**
   * Returns a string describing this Saver
   * @return a description of the Saver suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "Writes to a destination that is in arff (attribute relation file format) "
      +"format. ";
  }


  /**
   * Returns a description of the file type.
   *
   * @return a short file description
   */
  public String getFileDescription() {
    return "Arff data files";
  }
  
  /**
   * Gets all the file extensions used for this type of file
   *
   * @return the file extensions
   */
  public String[] getFileExtensions() {
    return new String[]{ArffLoader.FILE_EXTENSION, ArffLoader.FILE_EXTENSION_COMPRESSED};
  }
  
  /** 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Sets the destination file.
   * 
   * @param outputFile the destination file.
   * @throws IOException throws an IOException if file cannot be set
   */
<<<<<<< HEAD
  @Override
  public void setFile(File outputFile) throws IOException {
    if (outputFile.getAbsolutePath().endsWith(
      ArffLoader.FILE_EXTENSION_COMPRESSED)) {
      setCompressOutput(true);
    }

    super.setFile(outputFile);
  }

  /**
   * Sets the destination output stream.
   * 
   * @param output the output stream.
   * @throws IOException throws an IOException if destination cannot be set
   */
  @Override
  public void setDestination(OutputStream output) throws IOException {
    if (getCompressOutput()) {
      super.setDestination(new GZIPOutputStream(output));
    } else {
      super.setDestination(output);
    }
=======
  public void setFile(File outputFile) throws IOException  {
    if (outputFile.getAbsolutePath().endsWith(ArffLoader.FILE_EXTENSION_COMPRESSED))
      setCompressOutput(true);
    
    super.setFile(outputFile);
  }
  
  /** 
   * Sets the destination output stream.
   * 
   * @param output              the output stream.
   * @throws IOException        throws an IOException if destination cannot be set
   */
  public void setDestination(OutputStream output) throws IOException {
    if (getCompressOutput())
      super.setDestination(new GZIPOutputStream(output));
    else
      super.setDestination(output);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Resets the Saver
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void resetOptions() {

    super.resetOptions();
    setFileExtension(".arff");
  }

  /**
   * Returns the Capabilities of this saver.
<<<<<<< HEAD
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
=======
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();

    // attributes
    result.enableAllAttributes();
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);

    return result;
  }

<<<<<<< HEAD
  /**
   * Saves an instances incrementally. Structure has to be set by using the
   * setStructure() method or setInstances() method.
   * 
   * @param inst the instance to save
   * @throws IOException throws IOEXception if an instance cannot be saved
   *           incrementally.
   */
  @Override
  public void writeIncremental(Instance inst) throws IOException {

    int writeMode = getWriteMode();
    Instances structure = getInstances();
    PrintWriter outW = null;

    if (getRetrieval() == BATCH || getRetrieval() == NONE) {
      throw new IOException("Batch and incremental saving cannot be mixed.");
    }
    if (getWriter() != null) {
      outW = new PrintWriter(getWriter());
    }

    if (writeMode == WAIT) {
      if (structure == null) {
        setWriteMode(CANCEL);
        if (inst != null) {
          System.err
            .println("Structure(Header Information) has to be set in advance");
        }
      } else {
        setWriteMode(STRUCTURE_READY);
      }
      writeMode = getWriteMode();
    }
    if (writeMode == CANCEL) {
      if (outW != null) {
        outW.close();
      }
      cancel();
    }
    if (writeMode == STRUCTURE_READY) {
      setWriteMode(WRITE);
      // write header
      Instances header = new Instances(structure, 0);
      if (retrieveFile() == null && outW == null) {
        System.out.println(header.toString());
      } else {
        outW.print(header.toString());
        outW.print("\n");
        outW.flush();
      }
      writeMode = getWriteMode();
    }
    if (writeMode == WRITE) {
      if (structure == null) {
        throw new IOException("No instances information available.");
      }
      if (inst != null) {

        // write instance
        if (retrieveFile() == null && outW == null) {
          System.out.println(inst.toStringMaxDecimalDigits(m_MaxDecimalPlaces));
        } else {
          outW.println(inst.toStringMaxDecimalDigits(m_MaxDecimalPlaces));
          m_incrementalCounter++;
          // flush every 100 instances
          if (m_incrementalCounter > 100) {
            m_incrementalCounter = 0;
            outW.flush();
          }
        }
      } else {
        // close
        if (outW != null) {
          outW.flush();
          outW.close();
        }
        m_incrementalCounter = 0;
        resetStructure();
        outW = null;
        resetWriter();
      }
    }
  }

  /**
   * Writes a Batch of instances
   * 
   * @throws IOException throws IOException if saving in batch mode is not
   *           possible
   */
  @Override
  public void writeBatch() throws IOException {
    if (getInstances() == null) {
      throw new IOException("No instances to save");
    }
    if (getRetrieval() == INCREMENTAL) {
      throw new IOException("Batch and incremental saving cannot be mixed.");
    }
    setRetrieval(BATCH);
    setWriteMode(WRITE);
    if (retrieveFile() == null && getWriter() == null) {
      Instances data = getInstances();
      System.out.println(new Instances(data, 0));
      for (int i = 0; i < data.numInstances(); i++) {
        System.out.println(data.instance(i).toStringMaxDecimalDigits(
          m_MaxDecimalPlaces));
      }
      setWriteMode(WAIT);
      return;
    }

    PrintWriter outW = new PrintWriter(getWriter());
    Instances data = getInstances();

    // header
    Instances header = new Instances(data, 0);
    outW.print(header.toString());

    // data
    for (int i = 0; i < data.numInstances(); i++) {
      if (i % 1000 == 0) {
        outW.flush();
      }
      outW.println(data.instance(i)
        .toStringMaxDecimalDigits(m_MaxDecimalPlaces));
    }
    outW.flush();
    outW.close();

    setWriteMode(WAIT);
    outW = null;
    resetWriter();
    setWriteMode(CANCEL);
=======
  /** Saves an instances incrementally. Structure has to be set by using the
   * setStructure() method or setInstances() method.
   * @param inst the instance to save
   * @throws IOException throws IOEXception if an instance cannot be saved incrementally.
   */
  public void writeIncremental(Instance inst) throws IOException{

      int writeMode = getWriteMode();
      Instances structure = getInstances();
      PrintWriter outW = null;

      if(getRetrieval() == BATCH || getRetrieval() == NONE)
          throw new IOException("Batch and incremental saving cannot be mixed.");
      if(getWriter() != null)
          outW = new PrintWriter(getWriter());

      if(writeMode == WAIT){
        if(structure == null){
            setWriteMode(CANCEL);
            if(inst != null)
                System.err.println("Structure(Header Information) has to be set in advance");
        }
        else
            setWriteMode(STRUCTURE_READY);
        writeMode = getWriteMode();
      }
      if(writeMode == CANCEL){
          if(outW != null)
              outW.close();
          cancel();
      }
      if(writeMode == STRUCTURE_READY){
          setWriteMode(WRITE);
          //write header
          Instances header = new Instances(structure,0);
          if(retrieveFile() == null && outW == null)
              System.out.println(header.toString());
          else{
              outW.print(header.toString());
              outW.print("\n");
              outW.flush();
          }
          writeMode = getWriteMode();
      }
      if(writeMode == WRITE){
          if(structure == null)
              throw new IOException("No instances information available.");
          if(inst != null){
          //write instance
              if(retrieveFile() == null && outW == null)
                System.out.println(inst);
              else{
                outW.println(inst);
                m_incrementalCounter++;
                //flush every 100 instances
                if(m_incrementalCounter > 100){
                    m_incrementalCounter = 0;
                    outW.flush();
                }
              }
          }
          else{
          //close
              if(outW != null){
                outW.flush();
                outW.close();
              }
              m_incrementalCounter = 0;
              resetStructure();
              outW = null;
              resetWriter();
          }
      }
  }

  /** Writes a Batch of instances
   * @throws IOException throws IOException if saving in batch mode is not possible
   */
  public void writeBatch() throws IOException {

      if(getInstances() == null)
          throw new IOException("No instances to save");
      if(getRetrieval() == INCREMENTAL)
          throw new IOException("Batch and incremental saving cannot be mixed.");
      setRetrieval(BATCH);
      setWriteMode(WRITE);
      if(retrieveFile() == null && getWriter() == null){
          System.out.println((getInstances()).toString());
          setWriteMode(WAIT);
          return;
      }

      PrintWriter outW = new PrintWriter(getWriter());
      Instances data = getInstances();

      // header
      Instances header = new Instances(data, 0);
      outW.print(header.toString());

      // data
      for (int i = 0; i < data.numInstances(); i++) {
	if (i % 1000 == 0)
	  outW.flush();
        outW.println(data.instance(i));
      }
      outW.flush();
      outW.close();

      setWriteMode(WAIT);
      outW = null;
      resetWriter();
      setWriteMode(CANCEL);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the revision string.
<<<<<<< HEAD
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11506 $");
=======
   *
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 7950 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param args should contain the options of a Saver.
   */
  public static void main(String[] args) {
    runFileSaver(new ArffSaver(), args);
  }
}
