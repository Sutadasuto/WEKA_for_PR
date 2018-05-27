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
 *    VisualizeUtils.java
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

package weka.gui.visualize;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Defaults;
import weka.core.Settings;
import weka.core.Utils;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Properties;
<<<<<<< HEAD
=======
=======
import weka.core.Utils;
import java.util.Properties;
import java.io.FileInputStream;

import java.awt.Color;
import javax.swing.JOptionPane;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * This class contains utility routines for visualization
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
<<<<<<< HEAD
 * @version $Revision: 13477 $
=======
<<<<<<< HEAD
 * @version $Revision: 13477 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

public class VisualizeUtils {

  /** The name of the properties file */
  protected static String PROPERTY_FILE = "weka/gui/visualize/Visualize.props";

  /** Contains the visualization properties */
  protected static Properties VISUALIZE_PROPERTIES;

  /** Default maximum precision for the display of numeric values */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public static int MAX_PRECISION = 10;

  static {

    try {
      VISUALIZE_PROPERTIES = Utils.readProperties(PROPERTY_FILE);
      String precision =
        VISUALIZE_PROPERTIES.getProperty("weka.gui.visualize.precision");
      if (precision == null) {
        /*
         * System.err.println("Warning: no configuration property found in"
         * +PROPERTY_FILE +" for weka.gui.visualize.precision. Using"
         * +" default instead.");
         */
      } else {
        MAX_PRECISION = Integer.parseInt(precision);
        // System.err.println("Setting numeric precision to: "+precision);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null,
        "VisualizeUtils: Could not read a visualization configuration file.\n"
          + "An example file is included in the Weka distribution.\n"
          + "This file should be named \"" + PROPERTY_FILE + "\"  and\n"
          + "should be placed either in your user home (which is set\n"
          + "to \"" + System.getProperties().getProperty("user.home") + "\")\n"
          + "or the directory that java was started from\n", "Plot2D",
        JOptionPane.ERROR_MESSAGE);
<<<<<<< HEAD
=======
=======
  protected static int MAX_PRECISION = 10;

  static {

    
    try {
      VISUALIZE_PROPERTIES = Utils.readProperties(PROPERTY_FILE);
      String precision = 
	VISUALIZE_PROPERTIES.getProperty("weka.gui.visualize.precision");
      if (precision == null) {
	/*
	System.err.println("Warning: no configuration property found in"
			   +PROPERTY_FILE
			   +" for weka.gui.visualize.precision. Using"
			   +" default instead.");*/
      } else {
	MAX_PRECISION = Integer.parseInt(precision);
	// System.err.println("Setting numeric precision to: "+precision);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null,
    	Messages.getInstance().getString("VisualizeUtils_JOptionPaneShowMessageDialog_Text_First") + PROPERTY_FILE + 
       Messages.getInstance().getString("VisualizeUtils_JOptionPaneShowMessageDialog_Text_Second") + System.getProperties().getProperty("user.home") + 
       Messages.getInstance().getString("VisualizeUtils_JOptionPaneShowMessageDialog_Text_Third")
       ,
       Messages.getInstance().getString("VisualizeUtils_JOptionPaneShowMessageDialog_Text_Fourth"),
       JOptionPane.ERROR_MESSAGE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Parses a string containing either a named colour or r,g,b values.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param colourDef the string containing the named colour (or r,g,b)
   * @param defaultColour the colour to return if parsing fails
   * @return the Color corresponding to the string.
   */
  public static Color processColour(String colourDef, Color defaultColour) {
    String colourDefBack = new String(colourDef);
    Color retC = defaultColour;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (colourDef.indexOf(",") >= 0) {
      // Looks like property value is in R, G, B format
      try {
        int index = colourDef.indexOf(",");
        int R = Integer.parseInt(colourDef.substring(0, index));
        colourDef = colourDef.substring(index + 1, colourDef.length());
        index = colourDef.indexOf(",");
        int G = Integer.parseInt(colourDef.substring(0, index));
        colourDef = colourDef.substring(index + 1, colourDef.length());
        int B = Integer.parseInt(colourDef);
        // System.err.println(R+" "+G+" "+B);
        retC = new Color(R, G, B);
      } catch (Exception ex) {
        System.err.println("VisualizeUtils: Problem parsing colour property "
          + "value (" + colourDefBack + ").");
<<<<<<< HEAD
=======
=======
    if (colourDef.indexOf(",") >= 0) { 
      // Looks like property value is in R, G, B format
      try {
	int index = colourDef.indexOf(",");
	int R = Integer.parseInt(colourDef.substring(0,index));
	colourDef = colourDef.substring(index+1,colourDef.length());
	index = colourDef.indexOf(",");
	int G = Integer.parseInt(colourDef.substring(0,index));
	colourDef = colourDef.substring(index+1,colourDef.length());
	int B = Integer.parseInt(colourDef);
	//System.err.println(R+" "+G+" "+B);
	retC = new Color(R,G,B);
      } catch (Exception ex) {
	System.err.println(Messages.getInstance().getString("VisualizeUtils_ProcessColour_Error_Text_First")
			   + colourDefBack+Messages.getInstance().getString("VisualizeUtils_ProcessColour_Error_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } else {
      // assume that the string is the name of a default Color.color
      if (colourDef.compareTo("black") == 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        retC = Color.black;
      } else if (colourDef.compareTo("blue") == 0) {
        retC = Color.blue;
      } else if (colourDef.compareTo("cyan") == 0) {
        retC = Color.cyan;
      } else if (colourDef.compareTo("darkGray") == 0) {
        retC = Color.darkGray;
      } else if (colourDef.compareTo("gray") == 0) {
        retC = Color.gray;
      } else if (colourDef.compareTo("green") == 0) {
        retC = Color.green;
      } else if (colourDef.compareTo("lightGray") == 0) {
        retC = Color.lightGray;
      } else if (colourDef.compareTo("magenta") == 0) {
        retC = Color.magenta;
      } else if (colourDef.compareTo("orange") == 0) {
        retC = Color.orange;
      } else if (colourDef.compareTo("pink") == 0) {
        retC = Color.pink;
      } else if (colourDef.compareTo("red") == 0) {
        retC = Color.red;
      } else if (colourDef.compareTo("white") == 0) {
        retC = Color.white;
      } else if (colourDef.compareTo("yellow") == 0) {
        retC = Color.yellow;
      } else {
        System.err
          .println("VisualizeUtils: colour property name not recognized " + "("
            + colourDefBack + ").");
<<<<<<< HEAD
=======
=======
	retC = Color.black;
      } else if (colourDef.compareTo("blue") == 0) {
	retC = Color.blue;
      } else if (colourDef.compareTo("cyan") == 0) {
	retC = Color.cyan;
      } else if (colourDef.compareTo("darkGray") == 0) {
	retC = Color.darkGray;
      } else if (colourDef.compareTo("gray") == 0) {
	retC = Color.gray;
      } else if (colourDef.compareTo("green") == 0) {
	retC = Color.green;
      } else if (colourDef.compareTo("lightGray") == 0) {
	retC = Color.lightGray;
      } else if (colourDef.compareTo("magenta") == 0) {
	retC = Color.magenta;
      } else if (colourDef.compareTo("orange") == 0) {
	retC = Color.orange;
      } else if (colourDef.compareTo("pink") == 0) {
	retC = Color.pink;
      } else if (colourDef.compareTo("red") == 0) {
	retC = Color.red;
      } else if (colourDef.compareTo("white") == 0) {
	retC = Color.white;
      } else if (colourDef.compareTo("yellow") == 0) {
	retC = Color.yellow;
      } else {
	System.err.println(Messages.getInstance().getString("VisualizeUtils_ProcessColour_Error_Text_Third")+colourDefBack+Messages.getInstance().getString("VisualizeUtils_ProcessColour_Error_Text_Fourth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return retC;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Defaults for the 2D scatter plot and attribute bars
   */
  public static class VisualizeDefaults extends Defaults {

    /** ID for the metastore */
    public static final String ID = "weka.gui.visualize.visualizepanel";

    /** Axis colour key */
    public static final Settings.SettingKey AXIS_COLOUR_KEY =
      new Settings.SettingKey(ID + ".axisColor", "Colour of the axis", "");

    /** Axis colour default */
    public static final Color AXIS_COLOR = Color.GREEN;

    /** Scatter plot background colour key */
    public static final Settings.SettingKey BACKGROUND_COLOUR_KEY =
      new Settings.SettingKey(ID + ".backgroundColor",
        "Background colour of scatter plot", "");

    /** Scatter plot background colour default */
    public static final Color BACKGROUND_COLOR = Color.WHITE;

    /** Attribute bar background colour key */
    public static final Settings.SettingKey BAR_BACKGROUND_COLOUR_KEY =
      new Settings.SettingKey(ID + ".attributeBarBackgroundColor",
        "Background " + "colour for the 1-dimensional attribute bars", "");

    /** Attribute bar background colour key */
    public static final Color BAR_BACKGROUND_COLOUR = Color.WHITE;

    /** For serialization */
    private static final long serialVersionUID = 4227480313375404688L;

    /**
     * Constructor
     */
    public VisualizeDefaults() {
      super(ID);

      m_defaults.put(AXIS_COLOUR_KEY, AXIS_COLOR);
      m_defaults.put(BACKGROUND_COLOUR_KEY, BACKGROUND_COLOR);
      m_defaults.put(BAR_BACKGROUND_COLOUR_KEY, BAR_BACKGROUND_COLOUR);
    }
  }
<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
}
