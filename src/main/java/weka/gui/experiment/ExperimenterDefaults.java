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
 * ExperimenterDefaults.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.experiment;

import weka.core.Utils;
import weka.experiment.PairedCorrectedTTester;
import weka.experiment.ResultMatrix;
import weka.experiment.ResultMatrixPlainText;
import weka.experiment.Tester;

import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
<<<<<<< HEAD
 * This class offers get methods for the default Experimenter settings in the
 * props file <code>weka/gui/experiment/Experimenter.props</code>.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 11944 $
 * @see #PROPERTY_FILE
 */
public class ExperimenterDefaults implements Serializable {

  /** for serialization. */
  static final long serialVersionUID = -2835933184632147981L;

  /** The name of the properties file. */
  public final static String PROPERTY_FILE = "weka/gui/experiment/Experimenter.props";

  /** Properties associated with the experimenter options. */
=======
 * This class offers get methods for the default Experimenter settings in 
 * the props file <code>weka/gui/experiment/Experimenter.props</code>.
 *
 * @author  FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7059 $
 * @see #PROPERTY_FILE
 */
public class ExperimenterDefaults
  implements Serializable {
  
  /** for serialization */
  static final long serialVersionUID = -2835933184632147981L;
  
  /** The name of the properties file */
  public final static String PROPERTY_FILE = "weka/gui/experiment/Experimenter.props";

  /** Properties associated with the experimenter options */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected static Properties PROPERTIES;
  static {
    try {
      PROPERTIES = Utils.readProperties(PROPERTY_FILE);
<<<<<<< HEAD
    } catch (Exception e) {
      System.err.println("Problem reading properties. Fix before continuing.");
=======
    }
    catch (Exception e) {
      System.err.println(Messages.getInstance().getString("ExperimenterDefaults_STATIC_Error_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      PROPERTIES = new Properties();
    }
  }

  /**
   * returns the value for the specified property, if non-existent then the
   * default value.
<<<<<<< HEAD
   * 
   * @param property the property to retrieve the value for
   * @param defaultValue the default value for the property
   * @return the value of the specified property
=======
   *
   * @param property      the property to retrieve the value for
   * @param defaultValue  the default value for the property
   * @return              the value of the specified property
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static String get(String property, String defaultValue) {
    return PROPERTIES.getProperty(property, defaultValue);
  }

  /**
<<<<<<< HEAD
   * returns the associated properties file.
   * 
   * @return the props file
=======
   * returns the associated properties file
   * 
   * @return              the props file
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static Properties getProperties() {
    return PROPERTIES;
  }

  /**
<<<<<<< HEAD
   * returns the class name of the default setup panel.
   *
   * @return the class name
   */
  public final static String getSetupPanel() {
    return get("SetupPanel", SimpleSetupPanel.class.getName());
  }

  /**
   * returns the default experiment extension.
   * 
   * @return the extension (incl. dot)
=======
   * returns the default experiment extension
   * 
   * @return              the extension (incl. dot)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static String getExtension() {
    return get("Extension", ".exp");
  }

  /**
<<<<<<< HEAD
   * returns the default destination.
   * 
   * @return the destination
   */
  public final static String getDestination() {
    return get("Destination", "ARFF file");
  }

  /**
   * returns the default experiment type.
   * 
   * @return the type
   */
  public final static String getExperimentType() {
    return get("ExperimentType", "Cross-validation");
  }

  /**
   * whether classification or regression is used.
   * 
   * @return true if classification
=======
   * returns the default destination
   * 
   * @return              the destination
   */
  public final static String getDestination() {
    return get("Destination", Messages.getInstance().getString("ExperimenterDefaults_GetDestination_Text"));
  }

  /**
   * returns the default experiment type
   * 
   * @return              the type
   */
  public final static String getExperimentType() {
    return get("ExperimentType", Messages.getInstance().getString("ExperimenterDefaults_GetExperimentType_Text"));
  }

  /**
   * whether classification or regression is used
   * 
   * @return              true if classification
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static boolean getUseClassification() {
    return Boolean.valueOf(get("UseClassification", "true")).booleanValue();
  }

  /**
<<<<<<< HEAD
   * returns the number of folds used for cross-validation.
   * 
   * @return the number of folds
=======
   * returns the number of folds used for cross-validation
   * 
   * @return              the number of folds
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static int getFolds() {
    return Integer.parseInt(get("Folds", "10"));
  }

  /**
<<<<<<< HEAD
   * returns the training percentage in case of splits.
   * 
   * @return the percentage (0-100)
=======
   * returns the training percentage in case of splits
   * 
   * @return              the percentage (0-100)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static double getTrainPercentage() {
    return Integer.parseInt(get("TrainPercentage", "66"));
  }

  /**
<<<<<<< HEAD
   * returns the number of repetitions to use.
   * 
   * @return the repetitions/runs
=======
   * returns the number of repetitions to use
   * 
   * @return              the repetitions/runs
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static int getRepetitions() {
    return Integer.parseInt(get("Repetitions", "10"));
  }

  /**
<<<<<<< HEAD
   * whether datasets or algorithms are iterated first.
   * 
   * @return true if datasets are iterated first
=======
   * whether datasets or algorithms are iterated first
   * 
   * @return              true if datasets are iterated first
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static boolean getDatasetsFirst() {
    return Boolean.valueOf(get("DatasetsFirst", "true")).booleanValue();
  }

  /**
<<<<<<< HEAD
   * returns the initial directory for the datasets (if empty, it returns the
   * user's home directory).
   * 
   * @return the directory
   */
  public final static File getInitialDatasetsDirectory() {
    String dir;

    dir = get("InitialDatasetsDirectory", "");
    if (dir.equals("")) {
      dir = System.getProperty("user.dir");
    }
=======
   * returns the initial directory for the datasets (if empty, it returns
   * the user's home directory)
   * 
   * @return              the directory
   */
  public final static File getInitialDatasetsDirectory() {
    String    dir;
    
    dir = get("InitialDatasetsDirectory", "");
    if (dir.equals(""))
      dir = System.getProperty("user.dir");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return new File(dir);
  }

  /**
<<<<<<< HEAD
   * whether relative paths are used by default.
   * 
   * @return true if relative paths are used
=======
   * whether relative paths are used by default
   * 
   * @return              true if relative paths are used
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static boolean getUseRelativePaths() {
    return Boolean.valueOf(get("UseRelativePaths", "false")).booleanValue();
  }

  /**
<<<<<<< HEAD
   * returns the display name of the preferred Tester algorithm.
   * 
   * @return the display name
=======
   * returns the display name of the preferred Tester algorithm
   * 
   * @return              the display name
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see Tester
   * @see PairedCorrectedTTester
   */
  public final static String getTester() {
    return get("Tester", new PairedCorrectedTTester().getDisplayName());
  }

  /**
<<<<<<< HEAD
   * the comma-separated list of attribute names that identify a row.
   * 
   * @return the attribute list
=======
   * the comma-separated list of attribute names that identify a row
   * 
   * @return              the attribute list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static String getRow() {
    return get("Row", "Key_Dataset");
  }

  /**
<<<<<<< HEAD
   * the comma-separated list of attribute names that identify a column.
   * 
   * @return the attribute list
=======
   * the comma-separated list of attribute names that identify a column
   * 
   * @return              the attribute list
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static String getColumn() {
    return get("Column", "Key_Scheme,Key_Scheme_options,Key_Scheme_version_ID");
  }

  /**
<<<<<<< HEAD
   * returns the name of the field used for comparison.
   * 
   * @return the comparison field
=======
   * returns the name of the field used for comparison
   * 
   * @return              the comparison field
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static String getComparisonField() {
    return get("ComparisonField", "percent_correct");
  }

  /**
<<<<<<< HEAD
   * returns the default significance.
   * 
   * @return the significance (0.0-1.0)
=======
   * returns the default significance
   * 
   * @return              the significance (0.0-1.0)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static double getSignificance() {
    return Double.parseDouble(get("Significance", "0.05"));
  }

  /**
<<<<<<< HEAD
   * returns the default sorting (empty string means none).
   * 
   * @return the sorting field
=======
   * returns the default sorting (empty string means none)
   * 
   * @return              the sorting field
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static String getSorting() {
    return get("Sorting", "");
  }

  /**
<<<<<<< HEAD
   * returns whether StdDevs are shown by default.
   * 
   * @return true if stddevs are shown
=======
   * returns whether StdDevs are shown by default
   * 
   * @return              true if stddevs are shown
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static boolean getShowStdDevs() {
    return Boolean.valueOf(get("ShowStdDev", "false")).booleanValue();
  }

  /**
<<<<<<< HEAD
   * returns whether the Average is shown by default.
   * 
   * @return true if the average is shown
=======
   * returns whether the Average is shown by default
   * 
   * @return              true if the average is shown
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static boolean getShowAverage() {
    return Boolean.valueOf(get("ShowAverage", "false")).booleanValue();
  }

  /**
<<<<<<< HEAD
   * returns the default precision for the mean.
   * 
   * @return the decimals of the mean
=======
   * returns the default precision for the mean
   * 
   * @return              the decimals of the mean
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static int getMeanPrecision() {
    return Integer.parseInt(get("MeanPrecision", "2"));
  }

  /**
<<<<<<< HEAD
   * returns the default precision for the stddevs.
   * 
   * @return the decimals of the stddevs
=======
   * returns the default precision for the stddevs
   * 
   * @return              the decimals of the stddevs
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final static int getStdDevPrecision() {
    return Integer.parseInt(get("StdDevPrecision", "2"));
  }

  /**
<<<<<<< HEAD
   * returns the classname (and optional options) of the ResultMatrix class,
   * responsible for the output format.
   * 
   * @return the classname and options
   * @see ResultMatrix
   * @see ResultMatrixPlainText
   */
  public final static ResultMatrix getOutputFormat() {
    ResultMatrix result;

    try {
      String[] options = Utils
        .splitOptions(get(
          "OutputFormat",
          ResultMatrix.class.getName()
            + " -col-name-width 0 -row-name-width 25 -mean-width 0 -stddev-width 0 -sig-width 0 -count-width 5 -print-col-names -print-row-names -enum-col-names"));
      String classname = options[0];
      options[0] = "";
      result = (ResultMatrix) Utils.forName(ResultMatrix.class, classname,
        options);
    } catch (Exception e) {
      e.printStackTrace();
      result = new ResultMatrixPlainText();
    }

    // override with other default properties
    result.setMeanPrec(getMeanPrecision());
    result.setStdDevPrec(getStdDevPrecision());
    result.setShowAverage(getShowAverage());
    result.setShowStdDev(getShowStdDevs());
    result.setRemoveFilterName(getRemoveFilterClassnames());

    return result;
  }

  /**
   * whether the filter classnames in the dataset names are removed by default.
   * 
   * @return true if filter names are removed
   */
  public final static boolean getRemoveFilterClassnames() {
    return Boolean.valueOf(get("RemoveFilterClassnames", "false"))
      .booleanValue();
  }

  /**
   * only for testing - prints the content of the props file.
   * 
   * @param args commandline parameters - ignored
   */
  public static void main(String[] args) {
    Enumeration<?> names;
    String name;
    Vector<String> sorted;

    System.out.println("\nExperimenter defaults:");
    names = PROPERTIES.propertyNames();

    // sort names
    sorted = new Vector<String>();
    while (names.hasMoreElements()) {
      sorted.add(names.nextElement().toString());
    }
    Collections.sort(sorted);
    names = sorted.elements();

=======
   * returns the classname of the ResultMatrix class, responsible for the
   * output format
   * 
   * @return              the classname
   * @see ResultMatrix
   * @see ResultMatrixPlainText
   */
  public final static String getOutputFormat() {
    return get("OutputFormat", ResultMatrixPlainText.class.getName());
  }

  /**
   * whether the filter classnames in the dataset names are removed by default
   * 
   * @return              true if filter names are removed
   */
  public final static boolean getRemoveFilterClassnames() {
    return Boolean.valueOf(get("RemoveFilterClassnames", "false")).booleanValue();
  }
  
  /**
   * only for testing - prints the content of the props file
   * 
   * @param args	commandline parameters - ignored
   */
  public static void main(String[] args) {
    Enumeration		names;
    String		name;
    Vector		sorted;
    
    System.out.println(Messages.getInstance().getString("ExperimenterDefaults_Main_Text"));
    names = PROPERTIES.propertyNames();

    // sort names
    sorted = new Vector();
    while (names.hasMoreElements())
      sorted.add(names.nextElement());
    Collections.sort(sorted);
    names = sorted.elements();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // output
    while (names.hasMoreElements()) {
      name = names.nextElement().toString();
      System.out.println("- " + name + ": " + PROPERTIES.getProperty(name, ""));
    }
    System.out.println();
  }
}
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
