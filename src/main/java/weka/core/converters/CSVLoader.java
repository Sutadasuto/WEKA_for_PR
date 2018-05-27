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
 *    CSVLoader.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core.converters;

import java.io.BufferedReader;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.DenseInstance;
<<<<<<< HEAD
=======
=======
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Range;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Utils;
import weka.core.converters.ArffLoader.ArffReader;

/**
 <!-- globalinfo-start -->
 * Reads a source that is in comma separated format (the default). One can also change the column separator from comma to tab or another character, specify string enclosures, specify whether aheader row is present or not and specify which attributes are to beforced to be nominal or date. Can operate in batch or incremental mode. In batch mode, a buffer is used to process a fixed number of rows in memory at any one time and the data is dumped to a temporary file. This allows the legal values for nominal attributes to be automatically determined. The final ARFF file is produced in a second pass over the temporary file using the structure determined on the first pass. In incremental mode, the first buffer full of rows is used to determine the structure automatically. Following this all rows are read and output incrementally. An error will occur if a row containing nominal values not seen in the initial buffer is encountered. In this case, the size of the initial buffer can be increased, or the user can explicitly provide the legal values of all nominal attributes using the -L (setNominalLabelSpecs) option.
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -H
 *  No header row present in the data.</pre>
 * 
 * <pre> -N &lt;range&gt;
 *  The range of attributes to force type to be NOMINAL.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)</pre>
 * 
 * <pre> -L &lt;nominal label spec&gt;
 *  Optional specification of legal labels for nominal
 *  attributes. May be specified multiple times.
 *  Batch mode can determine this
 *  automatically (and so can incremental mode if
 *  the first in memory buffer load of instances
 *  contains an example of each legal value). The
 *  spec contains two parts separated by a ":". The
 *  first part can be a range of attribute indexes or
 *  a comma-separated list off attruibute names; the
 *  second part is a comma-separated list of labels. E.g
 *  "1,2,4-6:red,green,blue" or "att1,att2:red,green,blue"</pre>
 * 
 * <pre> -S &lt;range&gt;
 *  The range of attribute to force type to be STRING.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)</pre>
 * 
 * <pre> -D &lt;range&gt;
 *  The range of attribute to force type to be DATE.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)</pre>
 * 
 * <pre> -format &lt;date format&gt;
 *  The date formatting string to use to parse date values.
 *  (default: "yyyy-MM-dd'T'HH:mm:ss")</pre>
 * 
 * <pre> -R &lt;range&gt;
 *  The range of attribute to force type to be NUMERIC.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)</pre>
 * 
 * <pre> -M &lt;str&gt;
 *  The string representing a missing value.
 *  (default: ?)</pre>
 * 
 * <pre> -F &lt;separator&gt;
 *  The field separator to be used.
 *  '\t' can be used as well.
 *  (default: ',')</pre>
 * 
 * <pre> -E &lt;enclosures&gt;
 *  The enclosure character(s) to use for strings.
 *  Specify as a comma separated list (e.g. ",' (default: ",')</pre>
 * 
 * <pre> -B &lt;num&gt;
 *  The size of the in memory buffer (in rows).
 *  (default: 100)</pre>
 * 
 <!-- options-end -->
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision: 14116 $
 */
public class CSVLoader extends AbstractFileLoader implements BatchConverter,
  IncrementalConverter, OptionHandler {

  /** For serialization */
  private static final long serialVersionUID = -1300595850715808438L;
<<<<<<< HEAD
=======
=======
import weka.core.RevisionUtils;
import weka.core.Utils;

/**
 * <!-- globalinfo-start --> Reads a source that is in comma separated or tab
 * separated format. Assumes that the first row in the file determines the
 * number of and names of the attributes.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -N &lt;range&gt;
 *  The range of attributes to force type to be NOMINAL.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)
 * </pre>
 * 
 * <pre>
 * -S &lt;range&gt;
 *  The range of attribute to force type to be STRING.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)
 * </pre>
 * 
 * <pre>
 * -D &lt;range&gt;
 *  The range of attribute to force type to be DATE.
 *  'first' and 'last' are accepted as well.
 *  Examples: "first-last", "1,4,5-27,50-last"
 *  (default: -none-)
 * </pre>
 * 
 * <pre>
 * -format &lt;date format&gt;
 *  The date formatting string to use to parse date values.
 *  (default: "yyyy-MM-dd'T'HH:mm:ss")
 * </pre>
 * 
 * <pre>
 * -M &lt;str&gt;
 *  The string representing a missing value.
 *  (default: ?)
 * </pre>
 * 
 * <pre>
 * -E &lt;enclosures&gt;
 *  The enclosure character(s) to use for strings.
 *  Specify as a comma separated list (e.g. ",' (default: '"')
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10372 $
 * @see Loader
 */
public class CSVLoader extends AbstractFileLoader implements BatchConverter,
  OptionHandler {

  /** for serialization. */
  static final long serialVersionUID = 5607529739745491340L;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the file extension. */
  public static String FILE_EXTENSION = ".csv";

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
  /**
   * A list of hash tables for accumulating nominal values during parsing.
   */
  protected FastVector m_cumulativeStructure;

  /**
   * Holds instances accumulated so far.
   */
  protected FastVector m_cumulativeInstances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The reader for the data. */
  protected transient BufferedReader m_sourceReader;

  /** Tokenizer for the data. */
  protected transient StreamTokenizer m_st;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected transient File m_tempFile;
  protected transient PrintWriter m_dataDumper;

  /** the field separator. */
  protected String m_FieldSeparator = ",";

  /** The placeholder for missing values. */
  protected String m_MissingValue = "?";

  /** The range of attributes to force to type nominal. */
  protected Range m_NominalAttributes = new Range();

  /** The user-supplied legal nominal values - each entry in the list is a spec */
  protected List<String> m_nominalLabelSpecs = new ArrayList<String>();

<<<<<<< HEAD
=======
=======
  /** The range of attributes to force to type nominal. */
  protected Range m_NominalAttributes = new Range();

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The range of attributes to force to type string. */
  protected Range m_StringAttributes = new Range();

  /** The range of attributes to force to type date */
  protected Range m_dateAttributes = new Range();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The range of attributes to force to type numeric */
  protected Range m_numericAttributes = new Range();

  /** The formatting string to use to parse dates */
  protected String m_dateFormat = "yyyy-MM-dd'T'HH:mm:ss";
<<<<<<< HEAD
=======
=======
  /** The formatting string to use to parse dates */
  protected String m_dateFormat = "";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The formatter to use on dates */
  protected SimpleDateFormat m_formatter;

<<<<<<< HEAD
  /** whether the csv file contains a header row with att names */
  protected boolean m_noHeaderRow = false;
=======
<<<<<<< HEAD
  /** whether the csv file contains a header row with att names */
  protected boolean m_noHeaderRow = false;
=======
  /** The placeholder for missing values. */
  protected String m_MissingValue = "?";

  /** whether the first row has been read. */
  protected boolean m_FirstCheck;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** enclosure character(s) to use for strings */
  protected String m_Enclosures = "\",\'";

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The in memory row buffer */
  protected List<String> m_rowBuffer;

  /** The maximum number of rows to hold in memory at any one time */
  protected int m_bufferSize = 100;

  /** Lookup for nominal values */
  protected Map<Integer, LinkedHashSet<String>> m_nominalVals;

  /** Reader used to process and output data incrementally */
  protected ArffReader m_incrementalReader;

  protected transient int m_rowCount;

  /**
   * Array holding field separator and enclosures to pass through to the
   * underlying ArffReader
   */
  protected String[] m_fieldSeparatorAndEnclosures;
  protected ArrayList<Object> m_current;
  protected TYPE[] m_types;
  private int m_numBufferedRows;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * default constructor.
   */
  public CSVLoader() {
    // No instances retrieved yet
    setRetrieval(NONE);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Main method.
   *
   * @param args should contain the name of an input file.
   */
  public static void main(String[] args) {
    runFileLoader(new CSVLoader(), args);
  }

  /**
   * Returns a string describing this attribute evaluator.
   *
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Reads a source that is in comma separated format (the default). "
      + "One can also change the column separator from comma to tab or "
      + "another character, specify string enclosures, specify whether a"
      + "header row is present or not and specify which attributes are to be"
      + "forced to be nominal or date. Can operate in batch or incremental mode. "
      + "In batch mode, a buffer is used to process a fixed number of rows in "
      + "memory at any one time and the data is dumped to a temporary file. This "
      + "allows the legal values for nominal attributes to be automatically "
      + "determined. The final ARFF file is produced in a second pass over the "
      + "temporary file using the structure determined on the first pass. In "
      + "incremental mode, the first buffer full of rows is used to determine "
      + "the structure automatically. Following this all rows are read and output "
      + "incrementally. An error will occur if a row containing nominal values not "
      + "seen in the initial buffer is encountered. In this case, the size of the "
      + "initial buffer can be increased, or the user can explicitly provide the "
      + "legal values of all nominal attributes using the -L (setNominalLabelSpecs) "
      + "option.";
  }

<<<<<<< HEAD
=======
=======
   * Get the file extension used for arff files.
   * 
   * @return the file extension
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String getFileExtension() {
    return FILE_EXTENSION;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String[] getFileExtensions() {
    return new String[] { getFileExtension() };
  }

<<<<<<< HEAD
=======
=======
  /**
   * Returns a description of the file type.
   * 
   * @return a short file description
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String getFileDescription() {
    return "CSV data files";
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public String getRevision() {
    return "$Revision: 14116 $";
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String noHeaderRowPresentTipText() {
    return "First row of data does not contain attribute names";
  }

  /**
   * Get whether there is no header row in the data.
   *
   * @return true if there is no header row in the data
   */
  public boolean getNoHeaderRowPresent() {
    return m_noHeaderRow;
  }

  /**
   * Set whether there is no header row in the data.
   *
   * @param b true if there is no header row in the data
   */
  public void setNoHeaderRowPresent(boolean b) {
    m_noHeaderRow = b;
  }

  /**
   * Returns the current placeholder for missing values.
   *
   * @return the placeholder
   */
  public String getMissingValue() {
    return m_MissingValue;
  }

  /**
   * Sets the placeholder for missing values.
   *
   * @param value the placeholder
   */
  public void setMissingValue(String value) {
    m_MissingValue = value;
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String missingValueTipText() {
    return "The placeholder for missing values, default is '?'.";
  }

  /**
   * Returns the current attribute range to be forced to type string.
   *
   * @return the range
   */
  public String getStringAttributes() {
    return m_StringAttributes.getRanges();
<<<<<<< HEAD
=======
=======
  /**
   * Gets all the file extensions used for this type of file.
   * 
   * @return the file extensions
   */
  @Override
  public String[] getFileExtensions() {
    return new String[] { getFileExtension() };
  }

  /**
   * Returns a string describing this attribute evaluator.
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Reads a source that is in comma separated or tab separated format. "
      + "Assumes that the first row in the file determines the number of "
      + "and names of the attributes.";
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
      "\tThe range of attributes to force type to be NOMINAL.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "N", 1, "-N <range>"));

    result.addElement(new Option(
      "\tThe range of attribute to force type to be STRING.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "S", 1, "-S <range>"));

    result.add(new Option(
      "\tThe range of attribute to force type to be DATE.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "D", 1, "-D <range>"));

    result.add(new Option(
      "\tThe date formatting string to use to parse date values.\n"
        + "\t(default: \"yyyy-MM-dd'T'HH:mm:ss\")", "format", 1,
      "-format <date format>"));

    result.addElement(new Option("\tThe string representing a missing value.\n"
      + "\t(default: ?)", "M", 1, "-M <str>"));

    result
      .addElement(new Option(
        "\tThe enclosure character(s) to use for strings.\n"
          + "\tSpecify as a comma separated list (e.g. \",'"
          + " (default: \",')", "E", 1, "-E <enclosures>"));

    return result.elements();
  }

  /**
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -N &lt;range&gt;
   *  The range of attributes to force type to be NOMINAL.
   *  'first' and 'last' are accepted as well.
   *  Examples: "first-last", "1,4,5-27,50-last"
   *  (default: -none-)
   * </pre>
   * 
   * <pre>
   * -S &lt;range&gt;
   *  The range of attribute to force type to be STRING.
   *  'first' and 'last' are accepted as well.
   *  Examples: "first-last", "1,4,5-27,50-last"
   *  (default: -none-)
   * </pre>
   * 
   * <pre>
   * -D &lt;range&gt;
   *  The range of attribute to force type to be DATE.
   *  'first' and 'last' are accepted as well.
   *  Examples: "first-last", "1,4,5-27,50-last"
   *  (default: -none-)
   * </pre>
   * 
   * <pre>
   * -format &lt;date format&gt;
   *  The date formatting string to use to parse date values.
   *  (default: "yyyy-MM-dd'T'HH:mm:ss")
   * </pre>
   * 
   * <pre>
   * -M &lt;str&gt;
   *  The string representing a missing value.
   *  (default: ?)
   * </pre>
   * 
   * <pre>
   * -E &lt;enclosures&gt;
   *  The enclosure character(s) to use for strings.
   *  Specify as a comma separated list (e.g. ",' (default: '"')
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0)
      setNominalAttributes(tmpStr);
    else
      setNominalAttributes("");

    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0)
      setStringAttributes(tmpStr);
    else
      setStringAttributes("");

    tmpStr = Utils.getOption('M', options);
    if (tmpStr.length() != 0)
      setMissingValue(tmpStr);
    else
      setMissingValue("?");

    tmpStr = Utils.getOption('D', options);
    if (tmpStr.length() > 0) {
      setDateAttributes(tmpStr);
    }
    tmpStr = Utils.getOption("format", options);
    if (tmpStr.length() > 0) {
      setDateFormat(tmpStr);
    }
    tmpStr = Utils.getOption("E", options);
    if (tmpStr.length() > 0) {
      setEnclosureCharacters(tmpStr);
    }
  }

  /**
   * Gets the current settings of the Classifier.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result;

    result = new Vector<String>();

    if (getNominalAttributes().length() > 0) {
      result.add("-N");
      result.add(getNominalAttributes());
    }

    if (getStringAttributes().length() > 0) {
      result.add("-S");
      result.add(getStringAttributes());
    }

    if (getDateAttributes().length() > 0) {
      result.add("-D");
      result.add(getDateAttributes());
      result.add("-format");
      result.add(getDateFormat());
    }

    result.add("-M");
    result.add(getMissingValue());

    result.add("-E");
    result.add(getEnclosureCharacters());

    return result.toArray(new String[result.size()]);
  }

  /**
   * Sets the attribute range to be forced to type nominal.
   * 
   * @param value the range
   */
  public void setNominalAttributes(String value) {
    m_NominalAttributes.setRanges(value);
  }

  /**
   * Returns the current attribute range to be forced to type nominal.
   * 
   * @return the range
   */
  public String getNominalAttributes() {
    return m_NominalAttributes.getRanges();
  }

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String nominalAttributesTipText() {
    return "The range of attributes to force to be of type NOMINAL, example "
      + "ranges: 'first-last', '1,4,7-14,50-last'.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the attribute range to be forced to type string.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the range
   */
  public void setStringAttributes(String value) {
    m_StringAttributes.setRanges(value);
  }

  /**
<<<<<<< HEAD
   * Returns the tip text for this property.
   *
=======
<<<<<<< HEAD
   * Returns the tip text for this property.
   *
=======
   * Returns the current attribute range to be forced to type string.
   * 
   * @return the range
   */
  public String getStringAttributes() {
    return m_StringAttributes.getRanges();
  }

  /**
   * Returns the tip text for this property.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String stringAttributesTipText() {
    return "The range of attributes to force to be of type STRING, example "
      + "ranges: 'first-last', '1,4,7-14,50-last'.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the current attribute range to be forced to type nominal.
   *
   * @return the range
   */
  public String getNominalAttributes() {
    return m_NominalAttributes.getRanges();
  }

  /**
   * Sets the attribute range to be forced to type nominal.
   *
   * @param value the range
   */
  public void setNominalAttributes(String value) {
    m_NominalAttributes.setRanges(value);
<<<<<<< HEAD
=======
=======
   * Set the attribute range to be forced to type date.
   * 
   * @param value the range
   */
  public void setDateAttributes(String value) {
    m_dateAttributes.setRanges(value);
  }

  /**
   * Returns the current attribute range to be forced to type date.
   * 
   * @return the range.
   */
  public String getDateAttributes() {
    return m_dateAttributes.getRanges();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the tip text for this property.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String nominalAttributesTipText() {
    return "The range of attributes to force to be of type NOMINAL, example "
      + "ranges: 'first-last', '1,4,7-14,50-last'.";
  }

  /**
   * Gets the attribute range to be forced to type numeric
   *
   * @return the range
   */
  public String getNumericAttributes() {
    return m_numericAttributes.getRanges();
  }

  /**
<<<<<<< HEAD
   * Sets the attribute range to be forced to type numeric
   *
   * @param value the range
   */
  public void setNumericAttributes(String value) {
    m_numericAttributes.setRanges(value);
=======
   * Sets the attribute range to be forced to type numeric
   *
   * @param value the range
   */
  public void setNumericAttributes(String value) {
    m_numericAttributes.setRanges(value);
=======
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String dateAttributesTipText() {
    return "The range of attributes to force to type STRING, example "
      + "ranges: 'first-last', '1,4,7-14, 50-last'.";
  }

  /**
   * Set the format to use for parsing date values.
   * 
   * @param value the format to use.
   */
  public void setDateFormat(String value) {
    m_dateFormat = value;
    m_formatter = null;
  }

  /**
   * Get the format to use for parsing date values.
   * 
   * @return the format to use for parsing date values.
   * 
   */
  public String getDateFormat() {
    return m_dateFormat;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Returns the tip text for this property.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String numericAttributesTipText() {
    return "The range of attributes to force to be of type NUMERIC, example "
      + "ranges: 'first-last', '1,4,7-14,50-last'.";
  }

  /**
   * Get the format to use for parsing date values.
   *
   * @return the format to use for parsing date values.
   *
   */
  public String getDateFormat() {
    return m_dateFormat;
  }

  /**
   * Set the format to use for parsing date values.
   *
   * @param value the format to use.
   */
  public void setDateFormat(String value) {
    m_dateFormat = value;
    m_formatter = null;
  }

  /**
   * Returns the tip text for this property.
   *
<<<<<<< HEAD
=======
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String dateFormatTipText() {
    return "The format to use for parsing date values.";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Returns the current attribute range to be forced to type date.
   *
   * @return the range.
   */
  public String getDateAttributes() {
    return m_dateAttributes.getRanges();
  }

  /**
   * Set the attribute range to be forced to type date.
   *
   * @param value the range
   */
  public void setDateAttributes(String value) {
    m_dateAttributes.setRanges(value);
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String dateAttributesTipText() {
    return "The range of attributes to force to type DATE, example "
      + "ranges: 'first-last', '1,4,7-14, 50-last'.";
  }

  /**
   * Returns the tip text for this property.
   *
<<<<<<< HEAD
=======
=======
   * Returns the tip text for this property.
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String enclosureCharactersTipText() {
    return "The characters to use as enclosures for strings. E.g. \",'";
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Get the character(s) to use/recognize as string enclosures
   *
   * @return the characters to use as string enclosures
   */
  public String getEnclosureCharacters() {
    return m_Enclosures;
  }

  /**
   * Set the character(s) to use/recognize as string enclosures
   *
<<<<<<< HEAD
=======
=======
   * Set the character(s) to use/recognize as string enclosures
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param enclosure the characters to use as string enclosures
   */
  public void setEnclosureCharacters(String enclosure) {
    m_Enclosures = enclosure;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the character used as column separator.
   *
   * @return the character to use
   */
  public String getFieldSeparator() {
    return Utils.backQuoteChars(m_FieldSeparator);
  }

  /**
   * Sets the character used as column separator.
   *
   * @param value the character to use
   */
  public void setFieldSeparator(String value) {
    m_FieldSeparator = Utils.unbackQuoteChars(value);
    if (m_FieldSeparator.length() != 1) {
      m_FieldSeparator = ",";
      System.err
        .println("Field separator can only be a single character (exception being '\t'), "
          + "defaulting back to '" + m_FieldSeparator + "'!");
    }
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String fieldSeparatorTipText() {
    return "The character to use as separator for the columns/fields (use '\\t' for TAB).";
  }

  /**
   * Get the buffer size to use - i.e. the number of rows to load and process in
   * memory at any one time
   *
   * @return
   */
  public int getBufferSize() {
    return m_bufferSize;
  }

  /**
   * Set the buffer size to use - i.e. the number of rows to load and process in
   * memory at any one time
   *
   * @param buff the buffer size (number of rows)
   */
  public void setBufferSize(int buff) {
    m_bufferSize = buff;
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String bufferSizeTipText() {
    return "The number of rows to process in memory at any one time.";
  }

  /**
   * Get label specifications for nominal attributes.
   *
   * @return an array of label specifications
   */
  public Object[] getNominalLabelSpecs() {
    return m_nominalLabelSpecs.toArray(new String[0]);
  }

  /**
   * Set label specifications for nominal attributes.
   *
   * @param specs an array of label specifications
   */
  public void setNominalLabelSpecs(Object[] specs) {
    m_nominalLabelSpecs.clear();
    for (Object s : specs) {
      m_nominalLabelSpecs.add(s.toString());
    }
  }

  /**
   * Returns the tip text for this property.
   *
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String nominalLabelSpecsTipText() {
    return "Optional specification of legal labels for nominal "
      + "attributes. May be specified multiple times. "
      + "Batch mode can determine this "
      + "automatically (and so can incremental mode if "
      + "the first in memory buffer load of instances "
      + "contains an example of each legal value). The "
      + "spec contains two parts separated by a \":\". The "
      + "first part can be a range of attribute indexes or "
      + "a comma-separated list off attruibute names; the "
      + "second part is a comma-separated list of labels. E.g "
      + "\"1,2,4-6:red,green,blue\" or \"att1,att2:red,green,blue\"";
  }

  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result
      .add(new Option("\tNo header row present in the data.", "H", 0, "-H"));
    result.add(new Option(
      "\tThe range of attributes to force type to be NOMINAL.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "N", 1, "-N <range>"));

    result.add(new Option(
      "\tOptional specification of legal labels for nominal\n"
        + "\tattributes. May be specified multiple times.\n"
        + "\tBatch mode can determine this\n"
        + "\tautomatically (and so can incremental mode if\n"
        + "\tthe first in memory buffer load of instances\n"
        + "\tcontains an example of each legal value). The\n"
        + "\tspec contains two parts separated by a \":\". The\n"
        + "\tfirst part can be a range of attribute indexes or\n"
        + "\ta comma-separated list off attruibute names; the\n"
        + "\tsecond part is a comma-separated list of labels. E.g\n"
        + "\t\"1,2,4-6:red,green,blue\" or \"att1,att2:red,green," + "blue\"",
      "L", 1, "-L <nominal label spec>"));

    result.add(new Option(
      "\tThe range of attribute to force type to be STRING.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "S", 1, "-S <range>"));

    result.add(new Option(
      "\tThe range of attribute to force type to be DATE.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "D", 1, "-D <range>"));

    result.add(new Option(
      "\tThe date formatting string to use to parse date values.\n"
        + "\t(default: \"yyyy-MM-dd'T'HH:mm:ss\")", "format", 1,
      "-format <date format>"));

    result.add(new Option(
      "\tThe range of attribute to force type to be NUMERIC.\n"
        + "\t'first' and 'last' are accepted as well.\n"
        + "\tExamples: \"first-last\", \"1,4,5-27,50-last\"\n"
        + "\t(default: -none-)", "R", 1, "-R <range>"));

    result.add(new Option("\tThe string representing a missing value.\n"
      + "\t(default: ?)", "M", 1, "-M <str>"));

    result.addElement(new Option("\tThe field separator to be used.\n"
      + "\t'\\t' can be used as well.\n" + "\t(default: ',')", "F", 1,
      "-F <separator>"));

    result
      .addElement(new Option(
        "\tThe enclosure character(s) to use for strings.\n"
          + "\tSpecify as a comma separated list (e.g. \",'"
          + " (default: \",')", "E", 1, "-E <enclosures>"));

    result.add(new Option("\tThe size of the in memory buffer (in rows).\n"
      + "\t(default: 100)", "B", 1, "-B <num>"));

    return result.elements();
  }

  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    if (getNominalAttributes().length() > 0) {
      result.add("-N");
      result.add(getNominalAttributes());
    }

    if (getStringAttributes().length() > 0) {
      result.add("-S");
      result.add(getStringAttributes());
    }

    if (getDateAttributes().length() > 0) {
      result.add("-D");
      result.add(getDateAttributes());
    }
    result.add("-format");
    result.add(getDateFormat());

    if (getNumericAttributes().length() > 0) {
      result.add("-R");
      result.add(getNumericAttributes());
    }

    result.add("-M");
    result.add(getMissingValue());

    result.add("-B");
    result.add("" + getBufferSize());

    result.add("-E");
    result.add(getEnclosureCharacters());

    result.add("-F");
    result.add(getFieldSeparator());

    for (String spec : m_nominalLabelSpecs) {
      result.add("-L");
      result.add(spec);
    }

    return result.toArray(new String[result.size()]);
  }

  @Override
  public void setOptions(String[] options) throws Exception {
    String tmpStr;

    setNoHeaderRowPresent(Utils.getFlag('H', options));

    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0) {
      setNominalAttributes(tmpStr);
    } else {
      setNominalAttributes("");
    }

    tmpStr = Utils.getOption('S', options);
    if (tmpStr.length() != 0) {
      setStringAttributes(tmpStr);
    } else {
      setStringAttributes("");
    }

    tmpStr = Utils.getOption('D', options);
    if (tmpStr.length() > 0) {
      setDateAttributes(tmpStr);
    }
    tmpStr = Utils.getOption("format", options);
    if (tmpStr.length() > 0) {
      setDateFormat(tmpStr);
    }

    tmpStr = Utils.getOption( 'R', options );
    if (tmpStr.length() > 0) {
      setNumericAttributes( tmpStr );
    }

    tmpStr = Utils.getOption('M', options);
    if (tmpStr.length() != 0) {
      setMissingValue(tmpStr);
    } else {
      setMissingValue("?");
    }

    tmpStr = Utils.getOption('F', options);
    if (tmpStr.length() != 0) {
      setFieldSeparator(tmpStr);
    } else {
      setFieldSeparator(",");
    }

    tmpStr = Utils.getOption('B', options);
    if (tmpStr.length() > 0) {
      int buff = Integer.parseInt(tmpStr);
      if (buff < 1) {
        throw new Exception("Buffer size must be >= 1");
      }
      setBufferSize(buff);
    }

    tmpStr = Utils.getOption("E", options);
    if (tmpStr.length() > 0) {
      setEnclosureCharacters(tmpStr);
    }

    while (true) {
      tmpStr = Utils.getOption('L', options);
      if (tmpStr.length() == 0) {
        break;
      }

      m_nominalLabelSpecs.add(tmpStr);
    }
  }

  @Override
  public Instance getNextInstance(Instances structure) throws IOException {
    m_structure = structure;
    if (getRetrieval() == BATCH) {
      throw new IOException(
        "Cannot mix getting instances in both incremental and batch modes");
    }
    setRetrieval(INCREMENTAL);

    if (m_dataDumper != null) {
      // close the uneeded temp files (if necessary)
      m_dataDumper.close();
      m_dataDumper = null;
    }

    if (m_rowBuffer.size() > 0 && m_incrementalReader == null) {
      StringBuilder tempB = new StringBuilder();
      for (String r : m_rowBuffer) {
        tempB.append(r).append("\n");
      }
      m_numBufferedRows = m_rowBuffer.size();
      Reader batchReader =
        new BufferedReader(new StringReader(tempB.toString()));

      m_incrementalReader =
        new ArffReader(batchReader, m_structure, 0, 0,
          m_fieldSeparatorAndEnclosures);

      m_rowBuffer.clear();
    }

    if (m_numBufferedRows == 0) {
      // m_incrementalReader = new ArffReader(m_sourceReader, m_structure, 0,
      // 0);
      m_numBufferedRows = -1;

      m_st = new StreamTokenizer(m_sourceReader);
      initTokenizer(m_st);
      m_st.ordinaryChar(m_FieldSeparator.charAt(0));
      //
      m_incrementalReader = null;
    }

    Instance current = null;
    if (m_sourceReader != null) {
      if (m_incrementalReader != null) {
        current = m_incrementalReader.readInstance(m_structure);
      } else {
        if (getInstance(m_st) != null) {
          current = makeInstance();
        }
      }
      if (current == null) {
      }
      if (m_numBufferedRows > 0) {
        m_numBufferedRows--;
      }
    }

    if ((m_sourceReader != null) && (current == null)) {
      try {
        // close the stream
        m_sourceReader.close();
        m_sourceReader = null;
        // reset();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    return current;
  }

  @Override
  public Instances getDataSet() throws IOException {

    if (m_sourceReader == null) {
      throw new IOException("No source has been specified");
    }

    if (getRetrieval() == INCREMENTAL) {
      throw new IOException(
        "Cannot mix getting instances in both incremental and batch modes");
    }
    setRetrieval(BATCH);

    if (m_structure == null) {
      getStructure();
    }

    while (readData(true)) {
      ;
    }

    m_dataDumper.flush();
    m_dataDumper.close();

    // make final structure
    makeStructure();

    Reader sr = new BufferedReader(new FileReader(m_tempFile));
    ArffReader initialArff =
      new ArffReader(sr, m_structure, 0, m_fieldSeparatorAndEnclosures);

    Instances initialInsts = initialArff.getData();
    sr.close();
    initialArff = null;

    return initialInsts;
  }

  private boolean readData(boolean dump) throws IOException {
    if (m_sourceReader == null) {
      throw new IOException("No source has been specified");
    }

    boolean finished = false;
    do {
      String checked = getInstance(m_st);
      if (checked == null) {
        return false;
      }

      if (dump) {
        dumpRow(checked);
      }
      m_rowBuffer.add(checked);

      if (m_rowBuffer.size() == m_bufferSize) {
        finished = true;

        if (getRetrieval() == BATCH) {
          m_rowBuffer.clear();
        }
      }
    } while (!finished);

    return true;
<<<<<<< HEAD
=======
=======
  /**
   * Get the character(s) to use/recognize as string enclosures
   * 
   * @return the characters to use as string enclosures
   */
  public String getEnclosureCharacters() {
    return m_Enclosures;
  }

  /**
   * Sets the placeholder for missing values.
   * 
   * @param value the placeholder
   */
  public void setMissingValue(String value) {
    m_MissingValue = value;
  }

  /**
   * Returns the current placeholder for missing values.
   * 
   * @return the placeholder
   */
  public String getMissingValue() {
    return m_MissingValue;
  }

  /**
   * Returns the tip text for this property.
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String missingValueTipText() {
    return "The placeholder for missing values, default is '?'.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Resets the Loader object and sets the source of the data set to be the
   * supplied Stream object.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param input the input stream
   * @exception IOException if an error occurs
   */
  @Override
  public void setSource(InputStream input) throws IOException {
    m_structure = null;
    m_sourceFile = null;
    m_File = null;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    m_FirstCheck = true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_sourceReader = new BufferedReader(new InputStreamReader(input));
  }

  /**
   * Resets the Loader object and sets the source of the data set to be the
   * supplied File object.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param file the source file.
   * @exception IOException if an error occurs
   */
  @Override
  public void setSource(File file) throws IOException {
    super.setSource(file);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public Instances getStructure() throws IOException {

    if (m_sourceReader == null) {
      throw new IOException("No source has been specified");
    }

    m_fieldSeparatorAndEnclosures = separatorAndEnclosuresToArray();

    if (m_structure == null) {
      readHeader();
<<<<<<< HEAD
=======
=======
  /**
   * Determines and returns (if possible) the structure (internally the header)
   * of the data set as an empty set of instances.
   * 
   * @return the structure of the data set as an empty set of Instances
   * @exception IOException if an error occurs
   */
  @Override
  public Instances getStructure() throws IOException {
    if ((m_sourceFile == null) && (m_sourceReader == null)) {
      throw new IOException("No source has been specified");
    }

    if (m_structure == null) {
      try {
        m_st = new StreamTokenizer(m_sourceReader);
        initTokenizer(m_st);
        readStructure(m_st);
      } catch (FileNotFoundException ex) {
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    return m_structure;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected Instance makeInstance() throws IOException {

    if (m_current == null) {
      return null;
    }

    double[] vals = new double[m_structure.numAttributes()];
    for (int i = 0; i < m_structure.numAttributes(); i++) {
      Object val = m_current.get(i);
      if (val.toString().equals("?")) {
        vals[i] = Utils.missingValue();
      } else if (m_structure.attribute(i).isString()) {
        vals[i] = 0;
        m_structure.attribute(i).setStringValue(Utils.unquote(val.toString()));
      } else if (m_structure.attribute(i).isDate()) {
        String format = m_structure.attribute(i).getDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateVal = Utils.unquote(val.toString());
        try {
          vals[i] = sdf.parse(dateVal).getTime();
        } catch (ParseException e) {
          throw new IOException("Unable to parse date value " + dateVal
            + " using date format " + format + " for date attribute "
            + m_structure.attribute(i) + " (line: " + m_rowCount + ")");
        }
      } else if (m_structure.attribute(i).isNumeric()) {
        try {
          Double v = Double.parseDouble(val.toString());
          vals[i] = v.doubleValue();
        } catch (NumberFormatException ex) {
          throw new IOException("Was expecting a number for attribute "
            + m_structure.attribute(i).name() + " but read " + val.toString()
            + " instead. (line: " + m_rowCount + ")");
        }
      } else {
        // nominal
        double index =
          m_structure.attribute(i).indexOfValue(Utils.unquote(val.toString()));
        if (index < 0) {
          throw new IOException("Read unknown nominal value " + val.toString()
            + "for attribute " + m_structure.attribute(i).name() + " (line: "
            + m_rowCount + "). Try increasing the size of the memory buffer"
            + " (-B option) or explicitly specify legal nominal values with "
            + "the -L option.");
        }
        vals[i] = index;
      }
    }

    DenseInstance inst = new DenseInstance(1.0, vals);
    inst.setDataset(m_structure);

    return inst;
  }

  protected void makeStructure() {
    // make final structure
    ArrayList<Attribute> attribs = new ArrayList<Attribute>();
    for (int i = 0; i < m_types.length; i++) {
      if (m_types[i] == TYPE.STRING || m_types[i] == TYPE.UNDETERMINED) {
        attribs.add(new Attribute(m_structure.attribute(i).name(),
          (java.util.List<String>) null));
      } else if (m_types[i] == TYPE.NUMERIC) {
        attribs.add(new Attribute(m_structure.attribute(i).name()));
      } else if (m_types[i] == TYPE.NOMINAL) {
        LinkedHashSet<String> vals = m_nominalVals.get(i);
        ArrayList<String> theVals = new ArrayList<String>();
        if (vals.size() > 0) {
          for (String v : vals) {
            /*
             * if (v.startsWith("'") || v.startsWith("\"")) { v = v.substring(1,
             * v.length() - 1); }
             */
            theVals.add(v);
          }
        } else {
          theVals.add("*unknown*");
        }
        attribs.add(new Attribute(m_structure.attribute(i).name(), theVals));
      } else {
        attribs
          .add(new Attribute(m_structure.attribute(i).name(), m_dateFormat));
      }
    }
    m_structure = new Instances(m_structure.relationName(), attribs, 0);
  }

  private void readHeader() throws IOException {
    m_rowCount = 1;
    m_incrementalReader = null;
    m_current = new ArrayList<Object>();
    openTempFiles();

    m_rowBuffer = new ArrayList<String>();

    String firstRow = m_sourceReader.readLine();
    if (firstRow == null) {
      throw new IOException("No data in the file!");
    }
    if (m_noHeaderRow) {
      m_rowBuffer.add(firstRow);
    }

    ArrayList<Attribute> attribNames = new ArrayList<Attribute>();

    // now tokenize to determine attribute names (or create att names if
    // no header row
    StringReader sr = new StringReader(firstRow + "\n");
    // System.out.print(firstRow + "\n");
    m_st = new StreamTokenizer(sr);
    initTokenizer(m_st);

    m_st.ordinaryChar(m_FieldSeparator.charAt(0));

    int attNum = 1;
    StreamTokenizerUtils.getFirstToken(m_st);
    if (m_st.ttype == StreamTokenizer.TT_EOF) {
      StreamTokenizerUtils.errms(m_st, "premature end of file");
<<<<<<< HEAD
=======
=======
  /**
   * reads the structure.
   * 
   * @param st the stream tokenizer to read from
   * @throws IOException if reading fails
   */
  private void readStructure(StreamTokenizer st) throws IOException {
    readHeader(st);
  }

  /**
   * Return the full data set. If the structure hasn't yet been determined by a
   * call to getStructure then method should do so before processing the rest of
   * the data set.
   * 
   * @return the structure of the data set as an empty set of Instances
   * @exception IOException if there is no source or parsing fails
   */
  @Override
  public Instances getDataSet() throws IOException {
    if ((m_sourceFile == null) && (m_sourceReader == null)) {
      throw new IOException("No source has been specified");
    }

    if (m_structure == null) {
      getStructure();
    }

    if (m_st == null) {
      m_st = new StreamTokenizer(m_sourceReader);
      initTokenizer(m_st);
    }

    m_st.ordinaryChar(',');
    m_st.ordinaryChar('\t');

    m_cumulativeStructure = new FastVector(m_structure.numAttributes());
    for (int i = 0; i < m_structure.numAttributes(); i++) {
      m_cumulativeStructure.addElement(new Hashtable());
    }

    m_cumulativeInstances = new FastVector();
    FastVector current;
    while ((current = getInstance(m_st)) != null) {
      m_cumulativeInstances.addElement(current);
    }

    FastVector atts = new FastVector(m_structure.numAttributes());
    for (int i = 0; i < m_structure.numAttributes(); i++) {
      String attname = m_structure.attribute(i).name();
      Hashtable tempHash = ((Hashtable) m_cumulativeStructure.elementAt(i));
      if (tempHash.size() == 0) {
        if (m_dateAttributes.isInRange(i)) {
          atts.addElement(new Attribute(attname, m_dateFormat));
        } else {
          atts.addElement(new Attribute(attname));
        }
      } else {
        if (m_StringAttributes.isInRange(i)) {
          atts.addElement(new Attribute(attname, (FastVector) null));
        } else {
          FastVector values = new FastVector(tempHash.size());
          // add dummy objects in order to make the FastVector's size ==
          // capacity
          for (int z = 0; z < tempHash.size(); z++) {
            values.addElement("dummy");
          }
          Enumeration e = tempHash.keys();
          while (e.hasMoreElements()) {
            Object ob = e.nextElement();
            // if (ob instanceof Double) {
            int index = ((Integer) tempHash.get(ob)).intValue();
            String s = ob.toString();
            if (s.startsWith("'") || s.startsWith("\""))
              s = s.substring(1, s.length() - 1);
            values.setElementAt(new String(s), index);
            // }
          }
          atts.addElement(new Attribute(attname, values));
        }
      }
    }

    // make the instances
    String relationName;
    if (m_sourceFile != null)
      relationName = (m_sourceFile.getName())
        .replaceAll("\\.[cC][sS][vV]$", "");
    else
      relationName = "stream";
    Instances dataSet = new Instances(relationName, atts,
      m_cumulativeInstances.size());

    for (int i = 0; i < m_cumulativeInstances.size(); i++) {
      current = ((FastVector) m_cumulativeInstances.elementAt(i));
      double[] vals = new double[dataSet.numAttributes()];
      for (int j = 0; j < current.size(); j++) {
        Object cval = current.elementAt(j);
        if (cval instanceof String) {
          if (((String) cval).compareTo(m_MissingValue) == 0) {
            vals[j] = Instance.missingValue();
          } else {
            if (dataSet.attribute(j).isString()) {
              vals[j] = dataSet.attribute(j).addStringValue((String) cval);
            } else if (dataSet.attribute(j).isNominal()) {
              // find correct index
              Hashtable lookup = (Hashtable) m_cumulativeStructure.elementAt(j);
              int index = ((Integer) lookup.get(cval)).intValue();
              vals[j] = index;
            } else {
              throw new IllegalStateException(
                "Wrong attribute type at position " + (i + 1) + "!!!");
            }
          }
        } else if (dataSet.attribute(j).isNominal()) {
          // find correct index
          Hashtable lookup = (Hashtable) m_cumulativeStructure.elementAt(j);
          int index = ((Integer) lookup.get(cval)).intValue();
          vals[j] = index;
        } else if (dataSet.attribute(j).isString()) {
          vals[j] = dataSet.attribute(j).addStringValue("" + cval);
        } else {
          vals[j] = ((Double) cval).doubleValue();
        }
      }
      dataSet.add(new Instance(1.0, vals));
    }
    m_structure = new Instances(dataSet, 0);
    setRetrieval(BATCH);
    m_cumulativeStructure = null; // conserve memory
    m_cumulativeInstances = null;

    // close the stream
    m_sourceReader.close();

    return dataSet;
  }

  /**
   * CSVLoader is unable to process a data set incrementally.
   * 
   * @param structure ignored
   * @return never returns without throwing an exception
   * @exception IOException always. CSVLoader is unable to process a data set
   *              incrementally.
   */
  @Override
  public Instance getNextInstance(Instances structure) throws IOException {
    throw new IOException("CSVLoader can't read data sets incrementally.");
  }

  /**
   * Attempts to parse a line of the data set.
   * 
   * @param tokenizer the tokenizer
   * @return a FastVector containg String and Double objects representing the
   *         values of the instance.
   * @exception IOException if an error occurs
   * 
   *              <pre>
   * <jml>
   *    private_normal_behavior
   *      requires: tokenizer != null;
   *      ensures: \result  != null;
   *  also
   *    private_exceptional_behavior
   *      requires: tokenizer == null
   *                || (* unsucessful parse *);
   *      signals: (IOException);
   * </jml>
   * </pre>
   */
  private FastVector getInstance(StreamTokenizer tokenizer) throws IOException {

    FastVector current = new FastVector();

    // Check if end of file reached.
    ConverterUtils.getFirstToken(tokenizer);
    if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
      return null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    boolean first = true;
    boolean wasSep;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    while (m_st.ttype != StreamTokenizer.TT_EOL
      && m_st.ttype != StreamTokenizer.TT_EOF) {
      // Get next token

      if (!first) {
        StreamTokenizerUtils.getToken(m_st);
      }

      if (m_st.ttype == m_FieldSeparator.charAt(0)
        || m_st.ttype == StreamTokenizer.TT_EOL) {
        wasSep = true;
      } else {
        wasSep = false;

        String attName = null;

        if (m_noHeaderRow) {
          attName = "att" + attNum;
          attNum++;
        } else {
          attName = m_st.sval;
        }

        attribNames.add(new Attribute(attName, (java.util.List<String>) null));
      }
      if (!wasSep) {
        StreamTokenizerUtils.getToken(m_st);
      }
      first = false;
    }
    String relationName;
    if (m_sourceFile != null) {
      relationName =
        (m_sourceFile.getName()).replaceAll("\\.[cC][sS][vV]$", "");
    } else {
      relationName = "stream";
    }
    m_structure = new Instances(relationName, attribNames, 0);
    m_NominalAttributes.setUpper(m_structure.numAttributes() - 1);
    m_StringAttributes.setUpper(m_structure.numAttributes() - 1);
    m_dateAttributes.setUpper(m_structure.numAttributes() - 1);
    m_numericAttributes.setUpper(m_structure.numAttributes() - 1);
    m_nominalVals = new HashMap<Integer, LinkedHashSet<String>>();

    m_types = new TYPE[m_structure.numAttributes()];
    for (int i = 0; i < m_structure.numAttributes(); i++) {
      if (m_NominalAttributes.isInRange(i)) {
        m_types[i] = TYPE.NOMINAL;
        LinkedHashSet<String> ts = new LinkedHashSet<String>();
        m_nominalVals.put(i, ts);
      } else if (m_StringAttributes.isInRange(i)) {
        m_types[i] = TYPE.STRING;
      } else if (m_dateAttributes.isInRange(i)) {
        m_types[i] = TYPE.DATE;
      } else if (m_numericAttributes.isInRange(i)) {
        m_types[i] = TYPE.NUMERIC;
      } else {
        m_types[i] = TYPE.UNDETERMINED;
      }
    }

    if (m_nominalLabelSpecs.size() > 0) {
      for (String spec : m_nominalLabelSpecs) {
        String[] attsAndLabels = spec.split(":");
        if (attsAndLabels.length == 2) {
          String[] labels = attsAndLabels[1].split(",");
          try {
            // try as a range string first
            Range tempR = new Range();
            tempR.setRanges(attsAndLabels[0].trim());
            tempR.setUpper(m_structure.numAttributes() - 1);

            int[] rangeIndexes = tempR.getSelection();
            for (int i = 0; i < rangeIndexes.length; i++) {
              m_types[rangeIndexes[i]] = TYPE.NOMINAL;
              LinkedHashSet<String> ts = new LinkedHashSet<String>();
              for (String lab : labels) {
                ts.add(lab);
              }
              m_nominalVals.put(rangeIndexes[i], ts);
            }
          } catch (IllegalArgumentException e) {
            // one or more named attributes?
            String[] attNames = attsAndLabels[0].split(",");
            for (String attN : attNames) {
              Attribute a = m_structure.attribute(attN.trim());
              if (a != null) {
                int attIndex = a.index();
                m_types[attIndex] = TYPE.NOMINAL;
                LinkedHashSet<String> ts = new LinkedHashSet<String>();
                for (String lab : labels) {
                  ts.add(lab);
                }
                m_nominalVals.put(attIndex, ts);
              }
            }
          }
        }
      }
    }

    // Prevents the first row from getting lost in the
    // case where there is no header row and we're
    // running in batch mode
    if (m_noHeaderRow && getRetrieval() == BATCH) {
      StreamTokenizer tempT = new StreamTokenizer(new StringReader(firstRow));
      initTokenizer(tempT);
      tempT.ordinaryChar(m_FieldSeparator.charAt(0));
      String checked = getInstance(tempT);
      dumpRow(checked);
    }

    m_st = new StreamTokenizer(m_sourceReader);
    initTokenizer(m_st);
    m_st.ordinaryChar(m_FieldSeparator.charAt(0));

    // try and determine a more accurate structure from the first batch
    readData(false || getRetrieval() == BATCH);
    makeStructure();
  }

  protected void openTempFiles() throws IOException {
    String tempPrefix = "" + Math.random() + "arffOut";
    m_tempFile = File.createTempFile(tempPrefix, null);
    m_tempFile.deleteOnExit();
    Writer os2 = new FileWriter(m_tempFile);
    m_dataDumper = new PrintWriter(new BufferedWriter(os2));
  }

  protected void dumpRow(String row) throws IOException {
    m_dataDumper.println(row);
  };

  /**
   * Assemble the field separator and enclosures into an array of Strings
   *
   * @return the field separator and enclosures as an array of strings
   */
  private String[] separatorAndEnclosuresToArray() {
    String[] parts = m_Enclosures.split(",");

    String[] result = new String[parts.length + 1];
    result[0] = m_FieldSeparator;
    int index = 1;
    for (String e : parts) {
      if (e.length() > 1 || e.length() == 0) {
        throw new IllegalArgumentException(
          "Enclosures can only be single characters");
      }
      result[index++] = e;
    }

    return result;
<<<<<<< HEAD
=======
=======
    while (tokenizer.ttype != StreamTokenizer.TT_EOL
      && tokenizer.ttype != StreamTokenizer.TT_EOF) {

      // Get next token
      if (!first) {
        ConverterUtils.getToken(tokenizer);
      }

      if (tokenizer.ttype == ',' || tokenizer.ttype == '\t'
        || tokenizer.ttype == StreamTokenizer.TT_EOL) {
        current.addElement(m_MissingValue);
        wasSep = true;
      } else {
        wasSep = false;
        if (tokenizer.sval.equals(m_MissingValue)
          || tokenizer.sval.trim().length() == 0) {
          current.addElement(new String(m_MissingValue));
        } else {
          // try to parse as a number
          try {
            double val = Double.valueOf(tokenizer.sval).doubleValue();
            current.addElement(new Double(val));
          } catch (NumberFormatException e) {
            // otherwise assume its an enumerated value
            current.addElement(new String(tokenizer.sval));
          }
        }
      }

      if (!wasSep) {
        ConverterUtils.getToken(tokenizer);
      }
      first = false;
    }

    // check number of values read
    if (current.size() != m_structure.numAttributes()) {
      ConverterUtils.errms(tokenizer,
        "wrong number of values. Read " + current.size() + ", expected "
          + m_structure.numAttributes());
    }

    // check for structure update
    try {
      checkStructure(current);
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return current;
  }

  /**
   * Checks the current instance against what is known about the structure of
   * the data set so far. If there is a nominal value for an attribute that was
   * beleived to be numeric then all previously seen values for this attribute
   * are stored in a Hashtable.
   * 
   * @param current a <code>FastVector</code> value
   * @exception Exception if an error occurs
   * 
   *              <pre>
   * <jml>
   *    private_normal_behavior
   *      requires: current != null;
   *  also
   *    private_exceptional_behavior
   *      requires: current == null
   *                || (* unrecognized object type in current *);
   *      signals: (Exception);
   * </jml>
   * </pre>
   */
  private void checkStructure(FastVector current) throws Exception {
    if (current == null) {
      throw new Exception("current shouldn't be null in checkStructure");
    }

    // initialize ranges, if necessary
    if (m_FirstCheck) {
      m_NominalAttributes.setUpper(current.size() - 1);
      m_StringAttributes.setUpper(current.size() - 1);
      m_dateAttributes.setUpper(current.size() - 1);
      m_FirstCheck = false;
    }

    for (int i = 0; i < current.size(); i++) {
      Object ob = current.elementAt(i);
      if ((ob instanceof String) || (m_NominalAttributes.isInRange(i))
        || (m_StringAttributes.isInRange(i)) || m_dateAttributes.isInRange(i)) {
        if (ob.toString().compareTo(m_MissingValue) == 0) {
          // do nothing
        } else {

          boolean notDate = true;
          if (m_dateAttributes.isInRange(i)) {
            // try to parse date string
            if (m_formatter == null) {
              m_formatter = new SimpleDateFormat(m_dateFormat);
            }

            try {
              long time = m_formatter.parse(ob.toString()).getTime();
              Double timeL = new Double(time);
              current.setElementAt(timeL, i);
              notDate = false;
            } catch (ParseException e) {
              notDate = true;
            }
          }

          if (notDate) {
            Hashtable tempHash = (Hashtable) m_cumulativeStructure.elementAt(i);
            if (!tempHash.containsKey(ob)) {
              // may have found a nominal value in what was previously thought
              // to
              // be a numeric variable.
              if (tempHash.size() == 0) {
                for (int j = 0; j < m_cumulativeInstances.size(); j++) {
                  FastVector tempUpdate = ((FastVector) m_cumulativeInstances
                    .elementAt(j));
                  Object tempO = tempUpdate.elementAt(i);
                  if (tempO instanceof String) {
                    // must have been a missing value
                  } else {
                    if (!tempHash.containsKey(tempO)) {
                      tempHash.put(new Double(((Double) tempO).doubleValue()),
                        new Integer(tempHash.size()));
                    }
                  }
                }
              }
              int newIndex = tempHash.size();
              tempHash.put(ob, new Integer(newIndex));
            }
          }
        }
      } else if (ob instanceof Double) {
        Hashtable tempHash = (Hashtable) m_cumulativeStructure.elementAt(i);
        if (tempHash.size() != 0) {
          if (!tempHash.containsKey(ob)) {
            int newIndex = tempHash.size();
            tempHash.put(new Double(((Double) ob).doubleValue()), new Integer(
              newIndex));
          }
        }
      } else {
        throw new Exception("Wrong object type in checkStructure!");
      }
    }
  }

  /**
   * Assumes the first line of the file contains the attribute names. Assumes
   * all attributes are String attributes (Reading the full data set with
   * getDataSet will establish the true structure).
   * 
   * @param tokenizer a <code>StreamTokenizer</code> value
   * @exception IOException if an error occurs
   * 
   *              <pre>
   * <jml>
   *    private_normal_behavior
   *      requires: tokenizer != null;
   *      modifiable: m_structure;
   *      ensures: m_structure != null;
   *  also
   *    private_exceptional_behavior
   *      requires: tokenizer == null
   *                || (* unsucessful parse *);
   *      signals: (IOException);
   * </jml>
   * </pre>
   */
  private void readHeader(StreamTokenizer tokenizer) throws IOException {

    FastVector attribNames = new FastVector();
    ConverterUtils.getFirstToken(tokenizer);
    if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
      ConverterUtils.errms(tokenizer, "premature end of file");
    }

    while (tokenizer.ttype != StreamTokenizer.TT_EOL) {
      attribNames.addElement(new Attribute(tokenizer.sval, (FastVector) null));
      ConverterUtils.getToken(tokenizer);
    }
    String relationName;
    if (m_sourceFile != null)
      relationName = (m_sourceFile.getName())
        .replaceAll("\\.[cC][sS][vV]$", "");
    else
      relationName = "stream";
    m_structure = new Instances(relationName, attribNames, 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Initializes the stream tokenizer.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param tokenizer the tokenizer to initialize
   */
  private void initTokenizer(StreamTokenizer tokenizer) {
    tokenizer.resetSyntax();
    tokenizer.whitespaceChars(0, (' ' - 1));
    tokenizer.wordChars(' ', '\u00FF');
<<<<<<< HEAD
    tokenizer.whitespaceChars(m_FieldSeparator.charAt(0),
      m_FieldSeparator.charAt(0));
    // tokenizer.commentChar('%');
=======
<<<<<<< HEAD
    tokenizer.whitespaceChars(m_FieldSeparator.charAt(0),
      m_FieldSeparator.charAt(0));
    // tokenizer.commentChar('%');
=======
    tokenizer.whitespaceChars(',', ',');
    tokenizer.whitespaceChars('\t', '\t');
    tokenizer.commentChar('%');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    String[] parts = m_Enclosures.split(",");
    for (String e : parts) {
      if (e.length() > 1 || e.length() == 0) {
        throw new IllegalArgumentException(
          "Enclosures can only be single characters");
      }
      tokenizer.quoteChar(e.charAt(0));
    }

    tokenizer.eolIsSignificant(true);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Attempts to parse a line of the data set.
   * 
   * @param tokenizer the tokenizer
   * @return a String version of the instance that has had String and nominal
   *         attribute values quoted if necessary
   * @exception IOException if an error occurs
   * 
   *              <pre>
   * <jml>
   *    private_normal_behavior
   *      requires: tokenizer != null;
   *      ensures: \result  != null;
   *  also
   *    private_exceptional_behavior
   *      requires: tokenizer == null
   *                || (* unsucessful parse *);
   *      signals: (IOException);
   * </jml>
   * </pre>
   */
  private String getInstance(StreamTokenizer tokenizer) throws IOException {

    try {
      // Check if end of file reached.
      StreamTokenizerUtils.getFirstToken(tokenizer);
      if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
        return null;
      }

      boolean first = true;
      boolean wasSep;
      m_current.clear();

      int i = 0;
      while (tokenizer.ttype != StreamTokenizer.TT_EOL
        && tokenizer.ttype != StreamTokenizer.TT_EOF) {

        // Get next token
        if (!first) {
          StreamTokenizerUtils.getToken(tokenizer);
        }

        if (tokenizer.ttype == m_FieldSeparator.charAt(0)
          || tokenizer.ttype == StreamTokenizer.TT_EOL) {
          m_current.add("?");
          wasSep = true;
        } else {
          wasSep = false;
          if (tokenizer.sval.equals(m_MissingValue)
            || tokenizer.sval.trim().length() == 0) {
            m_current.add("?");
          } else if (m_types[i] == TYPE.NUMERIC
            || m_types[i] == TYPE.UNDETERMINED) {
            // try to parse as a number
            try {
              Double.parseDouble(tokenizer.sval);
              m_current.add(tokenizer.sval);
              m_types[i] = TYPE.NUMERIC;
            } catch (NumberFormatException e) {
              // otherwise assume its an enumerated value
              m_current.add(Utils.quote(tokenizer.sval));
              if (m_types[i] == TYPE.UNDETERMINED) {
                m_types[i] = TYPE.NOMINAL;
                LinkedHashSet<String> ts = new LinkedHashSet<String>();
                ts.add(tokenizer.sval);
                m_nominalVals.put(i, ts);
              } else {
                m_types[i] = TYPE.STRING;
              }
            }
          } else if (m_types[i] == TYPE.STRING || m_types[i] == TYPE.DATE) {
            m_current.add(Utils.quote(tokenizer.sval));
          } else if (m_types[i] == TYPE.NOMINAL) {
            m_current.add(Utils.quote(tokenizer.sval));
            m_nominalVals.get(i).add(tokenizer.sval);
          }
        }

        if (!wasSep) {
          StreamTokenizerUtils.getToken(tokenizer);
        }
        first = false;
        i++;
      }

      // check number of values read
      if (m_current.size() != m_structure.numAttributes()) {
        for (Object o : m_current) {
          System.out.print(o.toString() + "|||");
        }
        System.out.println();
        StreamTokenizerUtils.errms(tokenizer, "wrong number of values. Read "
          + m_current.size() + ", expected " + m_structure.numAttributes());

      }
    } catch (Exception ex) {
      throw new IOException(ex.getMessage() + " Problem encountered on line: "
        + (m_rowCount + 1));
    }

    StringBuilder temp = new StringBuilder();
    for (Object o : m_current) {
      temp.append(o.toString()).append(m_FieldSeparator);
    }
    m_rowCount++;

    return temp.substring(0, temp.length() - 1);
  }

  @Override
  public void reset() throws IOException {
    m_structure = null;
    m_rowBuffer = null;

    if (m_dataDumper != null) {
      // close the unneeded temp files (if necessary)
      m_dataDumper.close();
      m_dataDumper = null;
    }
    if (m_sourceReader != null) {
      m_sourceReader.close();
    }
<<<<<<< HEAD
=======
=======
   * Resets the Loader ready to read a new data set or the same data set again.
   * 
   * @throws IOException if something goes wrong
   */
  @Override
  public void reset() throws IOException {
    m_structure = null;
    m_cumulativeStructure = null;
    m_cumulativeInstances = null;
    m_st = null;
    setRetrieval(NONE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_File != null) {
      setFile(new File(m_File));
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  enum TYPE {
    UNDETERMINED, NUMERIC, NOMINAL, STRING, DATE
  }
}

<<<<<<< HEAD
=======
=======
  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10372 $");
  }

  /**
   * Main method.
   * 
   * @param args should contain the name of an input file.
   */
  public static void main(String[] args) {
    runFileLoader(new CSVLoader(), args);
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
