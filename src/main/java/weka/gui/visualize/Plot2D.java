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
 *    Plot2D.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.visualize;

<<<<<<< HEAD
import weka.core.Environment;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Settings;
import weka.core.Utils;

import javax.swing.JFrame;
import javax.swing.JPanel;
=======
import weka.core.FastVector;
import weka.core.Instances;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/**
 * This class plots datasets in two dimensions. It can also plot classifier
 * errors and clusterer predictions.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 14589 $
 */
public class Plot2D extends JPanel {

  /** for serialization */
  private static final long serialVersionUID = -1673162410856660442L;
=======
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * This class plots datasets in two dimensions. It can also plot
 * classifier errors and clusterer predictions.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class Plot2D
  extends JPanel {

  /** for serialization */
  private static final long serialVersionUID = -1673162410856660442L;  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /* constants for shape types */
  public static final int MAX_SHAPES = 5;
  public static final int ERROR_SHAPE = 1000;
  public static final int MISSING_SHAPE = 2000;
  public static final int CONST_AUTOMATIC_SHAPE = -1;
  public static final int X_SHAPE = 0;
  public static final int PLUS_SHAPE = 1;
  public static final int DIAMOND_SHAPE = 2;
  public static final int TRIANGLEUP_SHAPE = 3;
  public static final int TRIANGLEDOWN_SHAPE = 4;
  public static final int DEFAULT_SHAPE_SIZE = 2;

  /** Default colour for the axis */
  protected Color m_axisColour = Color.green;

  /** Default colour for the plot background */
  protected Color m_backgroundColour = Color.black;

  /** The plots to display */
<<<<<<< HEAD
  protected ArrayList<PlotData2D> m_plots = new ArrayList<PlotData2D>();
=======
  protected FastVector m_plots = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** The master plot */
  protected PlotData2D m_masterPlot = null;

  /** The name of the master plot */
<<<<<<< HEAD
  protected String m_masterName = "master plot";

  /** The instances to be plotted */
  protected Instances m_plotInstances = null;

  /**
   * An optional "compainion" of the panel. If specified, this class will get to
   * do its thing with our graphics context before we do any drawing. Eg. the
   * visualize panel may need to draw polygons etc. before we draw plot axis and
   * data points
   */
  protected Plot2DCompanion m_plotCompanion = null;

  /** the class for displaying instance info. */
  protected Class<?> m_InstanceInfoFrameClass = null;

  /** For popping up text info on data points */
  protected JFrame m_InstanceInfo = null;

  /** The list of the colors used */
  protected ArrayList<Color> m_colorList;

  /** default colours for colouring discrete class */
  protected Color[] m_DefaultColors = { Color.blue, Color.red, Color.green,
    Color.cyan, Color.pink, new Color(255, 0, 255), Color.orange,
    new Color(255, 0, 0), new Color(0, 255, 0), Color.white };

  /**
   * Indexes of the attributes to go on the x and y axis and the attribute to
   * use for colouring and the current shape for drawing
   */
  protected int m_xIndex = 0;
  protected int m_yIndex = 0;
  protected int m_cIndex = 0;
  protected int m_sIndex = 0;

  /**
   * Holds the min and max values of the x, y and colouring attributes over all
   * plots
   */
=======
  protected String m_masterName = Messages.getInstance().getString("Plot2D_MasterName_Text");

  /** The instances to be plotted */
  protected Instances m_plotInstances=null;

  /** An optional "compainion" of the panel. If specified, this
      class will get to do its thing with our graphics context
      before we do any drawing. Eg. the visualize panel may need
      to draw polygons etc. before we draw plot axis and data points */
  protected Plot2DCompanion m_plotCompanion=null;

  /** For popping up text info on data points */
  protected JFrame m_InstanceInfo = null;
  protected JTextArea m_InstanceInfoText = new JTextArea();

  /** The list of the colors used */
  protected FastVector m_colorList;

  /** default colours for colouring discrete class */
  protected Color [] m_DefaultColors = {Color.blue,
					Color.red,
					Color.green,
					Color.cyan,
					Color.pink,
					new Color(255, 0, 255),
					Color.orange,
					new Color(255, 0, 0),
					new Color(0, 255, 0),
					Color.white};

  /** Indexes of the attributes to go on the x and y axis and the attribute
      to use for colouring and the current shape for drawing */
  protected int m_xIndex=0;
  protected int m_yIndex=0;
  protected int m_cIndex=0;
  protected int m_sIndex=0;

  /** Holds the min and max values of the x, y and colouring attributes 
   over all plots */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected double m_maxX;
  protected double m_minX;
  protected double m_maxY;
  protected double m_minY;
  protected double m_maxC;
  protected double m_minC;
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Axis padding */
  protected final int m_axisPad = 5;

  /** Tick size */
  protected final int m_tickSize = 5;

<<<<<<< HEAD
  /** the offsets of the axes once label metrics are calculated */
  protected int m_XaxisStart = 0;
  protected int m_YaxisStart = 0;
  protected int m_XaxisEnd = 0;
  protected int m_YaxisEnd = 0;

  /**
   * if the user resizes the window, or the attributes selected for the
   * attributes change, then the lookup table for points needs to be
   * recalculated
   */
  protected boolean m_plotResize = true;

  /** if the user changes attribute assigned to an axis */
  protected boolean m_axisChanged = false;

  /**
   * An array used to show if a point is hidden or not. This is used for
   * speeding up the drawing of the plot panel although I am not sure how much
   * performance this grants over not having it.
=======
  /**the offsets of the axes once label metrics are calculated */
  protected int m_XaxisStart=0;
  protected int m_YaxisStart=0;
  protected int m_XaxisEnd=0;
  protected int m_YaxisEnd=0;

  /** if the user resizes the window, or the attributes selected for
      the attributes change, then the lookup table for points needs
      to be recalculated */
  protected boolean m_plotResize = true;
  
  /** if the user changes attribute assigned to an axis */
  protected boolean m_axisChanged = false;

  /** An array used to show if a point is hidden or not.
   * This is used for speeding up the drawing of the plot panel
   * although I am not sure how much performance this grants over
   * not having it.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected int[][] m_drawnPoints;

  /** Font for labels */
  protected Font m_labelFont;
<<<<<<< HEAD
  protected FontMetrics m_labelMetrics = null;

  /** the level of jitter */
  protected int m_JitterVal = 0;
=======
  protected FontMetrics m_labelMetrics=null; 

  /** the level of jitter */
  protected int m_JitterVal=0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** random values for perterbing the data points */
  protected Random m_JRand = new Random(0);

<<<<<<< HEAD
=======
  /** lookup table for plotted points */
  protected double [][] m_pointLookup=null;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Constructor */
  public Plot2D() {
    super();
    setProperties();
    this.setBackground(m_backgroundColour);
<<<<<<< HEAD
=======
    m_InstanceInfoText.setFont(new Font("Monospaced", Font.PLAIN,12));
    m_InstanceInfoText.setEditable(false);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_drawnPoints = new int[this.getWidth()][this.getHeight()];

    /** Set up some default colours */
<<<<<<< HEAD
    m_colorList = new ArrayList<Color>(10);
    for (int noa = m_colorList.size(); noa < 10; noa++) {
      Color pc = m_DefaultColors[noa % 10];
      int ija = noa / 10;
      ija *= 2;
      for (int j = 0; j < ija; j++) {
        pc = pc.darker();
      }

      m_colorList.add(pc);
=======
    m_colorList = new FastVector(10);
    for (int noa = m_colorList.size(); noa < 10; noa++) {
      Color pc = m_DefaultColors[noa % 10];
      int ija =  noa / 10;
      ija *= 2; 
      for (int j=0;j<ija;j++) {
	pc = pc.darker();
      }
      
      m_colorList.addElement(pc);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Set the properties for Plot2D
   */
  private void setProperties() {
    if (VisualizeUtils.VISUALIZE_PROPERTIES != null) {
      String thisClass = this.getClass().getName();
<<<<<<< HEAD
      String axisKey = thisClass + ".axisColour";
      String backgroundKey = thisClass + ".backgroundColour";

      String axisColour =
        VisualizeUtils.VISUALIZE_PROPERTIES.getProperty(axisKey);
      if (axisColour == null) {
        /*
         * System.err.println("Warning: no configuration property found in "
         * +VisualizeUtils.PROPERTY_FILE +" for "+axisKey);
         */
      } else {
        // System.err.println("Setting axis colour to: "+axisColour);
        m_axisColour = VisualizeUtils.processColour(axisColour, m_axisColour);
      }

      String backgroundColour =
        VisualizeUtils.VISUALIZE_PROPERTIES.getProperty(backgroundKey);
      if (backgroundColour == null) {
        /*
         * System.err.println("Warning: no configuration property found in "
         * +VisualizeUtils.PROPERTY_FILE +" for "+backgroundKey);
         */
      } else {
        // System.err.println("Setting background colour to: "+backgroundColour);
        m_backgroundColour =
          VisualizeUtils.processColour(backgroundColour, m_backgroundColour);
      }

      try {
        m_InstanceInfoFrameClass =
          Class.forName(VisualizeUtils.VISUALIZE_PROPERTIES.getProperty(
            thisClass + ".instanceInfoFrame",
            "weka.gui.visualize.InstanceInfoFrame"));
      } catch (Exception e) {
        e.printStackTrace();
        m_InstanceInfoFrameClass = InstanceInfoFrame.class;
=======
      String axisKey = thisClass+".axisColour";
      String backgroundKey = thisClass+".backgroundColour";

      String axisColour = VisualizeUtils.VISUALIZE_PROPERTIES.
	getProperty(axisKey);
      if (axisColour == null) {
	/*
	System.err.println("Warning: no configuration property found in "
			   +VisualizeUtils.PROPERTY_FILE
			   +" for "+axisKey);*/
      } else {
	//System.err.println("Setting axis colour to: "+axisColour);
	m_axisColour = VisualizeUtils.processColour(axisColour, m_axisColour);
      }

      String backgroundColour = 
	VisualizeUtils.VISUALIZE_PROPERTIES.getProperty(backgroundKey);
      if (backgroundColour == null) {
	/*
	System.err.println("Warning: no configuration property found in "
			   +VisualizeUtils.PROPERTY_FILE
			   +" for "+backgroundKey);*/
      } else {
	//System.err.println("Setting background colour to: "+backgroundColour);
	m_backgroundColour = VisualizeUtils.processColour(backgroundColour, 
							  m_backgroundColour);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  /**
   * Apply settings
   *
   * @param settings the settings to apply
   * @param ownerID the ID of the owner perspective, panel etc. to use when
   *          looking up our settings
   */
  public void applySettings(Settings settings, String ownerID) {
    m_axisColour =
      settings.getSetting(ownerID,
        VisualizeUtils.VisualizeDefaults.AXIS_COLOUR_KEY,
        VisualizeUtils.VisualizeDefaults.AXIS_COLOR,
        Environment.getSystemWide());
    m_backgroundColour =
      settings.getSetting(ownerID,
        VisualizeUtils.VisualizeDefaults.BACKGROUND_COLOUR_KEY,
        VisualizeUtils.VisualizeDefaults.BACKGROUND_COLOR,
        Environment.getSystemWide());
    this.setBackground(m_backgroundColour);

    repaint();
  }

  /**
   * Set a companion class. This is a class that might want to render something
   * on the plot before we do our thing. Eg, Malcolm's shape drawing stuff needs
   * to happen before we plot axis and points
   * 
=======
  /** 
   * This will check the values of the screen points passed and make sure 
   * that they land on the screen
   * @param x1 The x coord.
   * @param y1 The y coord.
   */
  private boolean checkPoints(double x1, double y1) {
    if (x1 < 0 || x1 > this.getSize().width || y1 < 0 
	|| y1 > this.getSize().height) {
      return false;
    }
    return true;
  }

  /**
   * Set a companion class. This is a class that might want
   * to render something on the plot before we do our thing. Eg,
   * Malcolm's shape drawing stuff needs to happen before we plot
   * axis and points
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param p a companion class
   */
  public void setPlotCompanion(Plot2DCompanion p) {
    m_plotCompanion = p;
  }

  /**
   * Set level of jitter and repaint the plot using the new jitter value
<<<<<<< HEAD
   * 
   * @param j the level of jitter
   */
  public void setJitter(int j) {
    if (m_plotInstances.numAttributes() > 0
      && m_plotInstances.numInstances() > 0) {
      if (j >= 0) {
        m_JitterVal = j;
        m_JRand = new Random(m_JitterVal);
        // if (m_pointLookup != null) {
        m_drawnPoints =
          new int[m_XaxisEnd - m_XaxisStart + 1][m_YaxisEnd - m_YaxisStart + 1];
        updatePturb();
        // }
        this.repaint();
=======
   * @param j the level of jitter
   */
  public void setJitter(int j) {
    if (m_plotInstances.numAttributes() > 0 
	&& m_plotInstances.numInstances() > 0) {
      if (j >= 0) {
	m_JitterVal = j;
	m_JRand = new Random(m_JitterVal);
	//      if (m_pointLookup != null) {
	m_drawnPoints = new int[m_XaxisEnd - m_XaxisStart + 1]
	  [m_YaxisEnd - m_YaxisStart + 1];
	updatePturb();
	//      }
	this.repaint();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Set a list of colours to use when colouring points according to class
   * values or cluster numbers
   * 
   * @param cols the list of colours to use
   */
  public void setColours(ArrayList<Color> cols) {
=======
   * Set a list of colours to use when colouring points according
   * to class values or cluster numbers
   * @param cols the list of colours to use
   */
  public void setColours (FastVector cols) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_colorList = cols;
  }

  /**
   * Set the index of the attribute to go on the x axis
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param x the index of the attribute to use on the x axis
   */
  public void setXindex(int x) {
    m_xIndex = x;
<<<<<<< HEAD
    for (int i = 0; i < m_plots.size(); i++) {
      m_plots.get(i).setXindex(m_xIndex);
=======
    for (int i=0;i<m_plots.size();i++) {
      ((PlotData2D)m_plots.elementAt(i)).setXindex(m_xIndex);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    determineBounds();
    if (m_JitterVal != 0) {
      updatePturb();
    }
    m_axisChanged = true;
    this.repaint();
  }
<<<<<<< HEAD

  /**
   * Set the index of the attribute to go on the y axis
   * 
=======
    
  /**
   * Set the index of the attribute to go on the y axis
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param y the index of the attribute to use on the y axis
   */
  public void setYindex(int y) {
    m_yIndex = y;
<<<<<<< HEAD
    for (int i = 0; i < m_plots.size(); i++) {
      m_plots.get(i).setYindex(m_yIndex);
=======
    for (int i=0;i<m_plots.size();i++) {
      ((PlotData2D)m_plots.elementAt(i)).setYindex(m_yIndex);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    determineBounds();
    if (m_JitterVal != 0) {
      updatePturb();
    }
    m_axisChanged = true;
    this.repaint();
  }

  /**
   * Set the index of the attribute to use for colouring
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param c the index of the attribute to use for colouring
   */
  public void setCindex(int c) {
    m_cIndex = c;
<<<<<<< HEAD
    for (int i = 0; i < m_plots.size(); i++) {
      m_plots.get(i).setCindex(m_cIndex);
=======
    for (int i=0;i<m_plots.size();i++) {
      ((PlotData2D)m_plots.elementAt(i)).setCindex(m_cIndex);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    determineBounds();
    m_axisChanged = true;
    this.repaint();
  }

  /**
   * Return the list of plots
<<<<<<< HEAD
   * 
   * @return the list of plots
   */
  public ArrayList<PlotData2D> getPlots() {
=======
   * @return the list of plots
   */
  public FastVector getPlots() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_plots;
  }

  /**
   * Get the master plot
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the master plot
   */
  public PlotData2D getMasterPlot() {
    return m_masterPlot;
  }

<<<<<<< HEAD
  /**
   * Return the current max value of the attribute plotted on the x axis
   * 
=======
  /** 
   * Return the current max value of the attribute plotted on the x axis
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the max x value
   */
  public double getMaxX() {
    return m_maxX;
  }

<<<<<<< HEAD
  /**
   * Return the current max value of the attribute plotted on the y axis
   * 
=======
  /** 
   * Return the current max value of the attribute plotted on the y axis
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the max y value
   */
  public double getMaxY() {
    return m_maxY;
  }

<<<<<<< HEAD
  /**
   * Return the current min value of the attribute plotted on the x axis
   * 
=======
  /** 
   * Return the current min value of the attribute plotted on the x axis
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the min x value
   */
  public double getMinX() {
    return m_minX;
  }
<<<<<<< HEAD

  /**
   * Return the current min value of the attribute plotted on the y axis
   * 
=======
  
  /** 
   * Return the current min value of the attribute plotted on the y axis
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the min y value
   */
  public double getMinY() {
    return m_minY;
  }

<<<<<<< HEAD
  /**
   * Return the current max value of the colouring attribute
   * 
=======
  /** 
   * Return the current max value of the colouring attribute
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the max colour value
   */
  public double getMaxC() {
    return m_maxC;
  }
<<<<<<< HEAD

  /**
   * Return the current min value of the colouring attribute
   * 
=======
  
  /** 
   * Return the current min value of the colouring attribute
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the min colour value
   */
  public double getMinC() {
    return m_minC;
  }
<<<<<<< HEAD

  /**
   * Sets the master plot from a set of instances
   * 
=======
    
  /**
   * Sets the master plot from a set of instances
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param inst the instances
   * @exception Exception if instances could not be set
   */
  public void setInstances(Instances inst) throws Exception {
<<<<<<< HEAD
    // System.err.println("Setting Instances");
    PlotData2D tempPlot = new PlotData2D(inst);
    tempPlot.setPlotName("master plot");
=======
    //System.err.println("Setting Instances");
    PlotData2D tempPlot = new PlotData2D(inst);
    tempPlot.setPlotName(Messages.getInstance().getString("Plot2D_SetInstances_TempPlot_SetPlotName_Text"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setMasterPlot(tempPlot);
  }

  /**
   * Set the master plot.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param master the plot to make the master plot
   * @exception Exception if the plot could not be set.
   */
  public void setMasterPlot(PlotData2D master) throws Exception {
    if (master.m_plotInstances == null) {
<<<<<<< HEAD
      throw new Exception("No instances in plot data!");
    }
    removeAllPlots();
    m_masterPlot = master;
    m_plots.add(m_masterPlot);
    m_plotInstances = m_masterPlot.m_plotInstances;

    m_xIndex = 0;
    m_yIndex = 0;
    m_cIndex = 0;

=======
      throw new Exception(Messages.getInstance().getString("Plot2D_SetMasterPlot_Exception_Text"));
    }
    removeAllPlots();
    m_masterPlot = master;
    m_plots.addElement(m_masterPlot);
    m_plotInstances = m_masterPlot.m_plotInstances;
    
    m_xIndex=0;
    m_yIndex=0;
    m_cIndex=0;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    determineBounds();
  }

  /**
   * Clears all plots
   */
  public void removeAllPlots() {
    m_masterPlot = null;
    m_plotInstances = null;
<<<<<<< HEAD
    m_plots = new ArrayList<PlotData2D>();
    m_xIndex = 0;
    m_yIndex = 0;
    m_cIndex = 0;
=======
    m_plots = new FastVector();
    m_xIndex = 0; m_yIndex = 0; m_cIndex = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Add a plot to the list of plots to display
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param newPlot the new plot to add
   * @exception Exception if the plot could not be added
   */
  public void addPlot(PlotData2D newPlot) throws Exception {
    if (newPlot.m_plotInstances == null) {
<<<<<<< HEAD
      throw new Exception("No instances in plot data!");
    }

    if (m_masterPlot != null) {
      if (m_masterPlot.m_plotInstances.equalHeaders(newPlot.m_plotInstances) == false) {
        throw new Exception("Plot2D :Plot data's instances are incompatable "
          + " with master plot");
=======
      throw new Exception(Messages.getInstance().getString("Plot2D_AddPlot_Exception_Text_First"));
    }

    if (m_masterPlot != null) {
      if (m_masterPlot.m_plotInstances.
	  equalHeaders(newPlot.m_plotInstances) == false) {
	throw new Exception(Messages.getInstance().getString("Plot2D_AddPlot_Exception_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } else {
      m_masterPlot = newPlot;
      m_plotInstances = m_masterPlot.m_plotInstances;
    }
<<<<<<< HEAD
    m_plots.add(newPlot);
=======
    m_plots.addElement(newPlot);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    setXindex(m_xIndex);
    setYindex(m_yIndex);
    setCindex(m_cIndex);
  }

  /**
   * Set up fonts and font metrics
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   */
  private void setFonts(Graphics gx) {
    if (m_labelMetrics == null) {
      m_labelFont = new Font("Monospaced", Font.PLAIN, 12);
      m_labelMetrics = gx.getFontMetrics(m_labelFont);
    }
    gx.setFont(m_labelFont);
  }

  /**
<<<<<<< HEAD
   * Pops up a window displaying attribute information on any instances at a
   * point+-plotting_point_size (in panel coordinates)
   * 
   * @param x the x value of the clicked point
   * @param y the y value of the clicked point
   * @param newFrame true if instance info is to be displayed in a new frame.
   */
  public void searchPoints(int x, int y, final boolean newFrame) {
    if (m_masterPlot.m_plotInstances != null) {
      int longest = 0;
      for (int j = 0; j < m_masterPlot.m_plotInstances.numAttributes(); j++) {
        if (m_masterPlot.m_plotInstances.attribute(j).name().length() > longest) {
          longest = m_masterPlot.m_plotInstances.attribute(j).name().length();
        }
      }

      StringBuffer insts = new StringBuffer();
      Vector<Instances> data = new Vector<Instances>();
      for (int jj = 0; jj < m_plots.size(); jj++) {
        PlotData2D temp_plot = (m_plots.get(jj));
        data.add(new Instances(temp_plot.m_plotInstances, 0));

        for (int i = 0; i < temp_plot.m_plotInstances.numInstances(); i++) {
          if (temp_plot.m_pointLookup[i][0] != Double.NEGATIVE_INFINITY) {
            double px =
              temp_plot.m_pointLookup[i][0] + temp_plot.m_pointLookup[i][2];
            double py =
              temp_plot.m_pointLookup[i][1] + temp_plot.m_pointLookup[i][3];
            // double size = temp_plot.m_pointLookup[i][2];
            double size = temp_plot.m_shapeSize[i];
            if ((x >= px - size) && (x <= px + size) && (y >= py - size)
              && (y <= py + size)) {
              {
                data.get(jj).add(
                  (Instance) temp_plot.m_plotInstances.instance(i).copy());
                insts.append("\nPlot : " + temp_plot.m_plotName
                  + "\nInstance: " + (i + 1) + "\n");
                if (temp_plot.m_plotInstances.instance(i).weight() != 1.0) {
                  insts.append("Weight : " + temp_plot.m_plotInstances.instance(i).weight() + "\n");
                }
                for (int j = 0; j < temp_plot.m_plotInstances.numAttributes(); j++) {
                  for (int k = 0; k < (longest - temp_plot.m_plotInstances
                    .attribute(j).name().length()); k++) {
                    insts.append(" ");
                  }
                  insts.append(temp_plot.m_plotInstances.attribute(j).name());
                  insts.append(" : ");

                  if (temp_plot.m_plotInstances.instance(i).isMissing(j)) {
                    insts.append("Missing");
                  } else if (temp_plot.m_plotInstances.attribute(j).isNominal()
                    || temp_plot.m_plotInstances.attribute(j).isString()) {
                    insts.append(temp_plot.m_plotInstances.attribute(j).value(
                      (int) temp_plot.m_plotInstances.instance(i).value(j)));
                  } else {
                    insts
                      .append(temp_plot.m_plotInstances.instance(i).value(j));
                  }
                  insts.append("\n");
                }
              }
            }
          }
        }
      }
      // remove datasets that contain no instances
      int i = 0;
      while (data.size() > i) {
        if (data.get(i).numInstances() == 0) {
          data.remove(i);
        } else {
          i++;
        }
      }

      if (insts.length() > 0) {
        // Pop up a new frame
        if (newFrame || m_InstanceInfo == null) {
          try {
            final JFrame jf = (JFrame) m_InstanceInfoFrameClass.newInstance();
            ((InstanceInfo) jf).setInfoText(insts.toString());
            ((InstanceInfo) jf).setInfoData(data);
            final JFrame testf = m_InstanceInfo;
            jf.addWindowListener(new WindowAdapter() {
              @Override
              public void windowClosing(WindowEvent e) {
                if (!newFrame || testf == null) {
                  m_InstanceInfo = null;
                }
                jf.dispose();
              }
            });
            jf.setVisible(true);
            if (m_InstanceInfo == null) {
              m_InstanceInfo = jf;
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        } else {
          // Overwrite info in existing frame
          ((InstanceInfo) m_InstanceInfo).setInfoText(insts.toString());
          ((InstanceInfo) m_InstanceInfo).setInfoData(data);
        }
      }
    }
  }
=======
   * Pops up a window displaying attribute information on any instances
   * at a point+-plotting_point_size (in panel coordinates)
   *
   * @param x the x value of the clicked point
   * @param y the y value of the clicked point
   * @param newFrame true if instance info is to be displayed in a
   * new frame.
   */
  public void searchPoints(int x, int y, final boolean newFrame) {
    if (m_masterPlot.m_plotInstances != null) {
      int longest=0;
      for (int j=0;j<m_masterPlot.m_plotInstances.numAttributes();j++) {
	if (m_masterPlot.m_plotInstances.attribute(j).name().length() > 
	    longest) {
	  longest = m_masterPlot.m_plotInstances.attribute(j).name().length();
	}
      }

      StringBuffer insts = new StringBuffer(); 
      for (int jj=0;jj<m_plots.size();jj++) {
	PlotData2D temp_plot = (PlotData2D)(m_plots.elementAt(jj));
	
	for (int i=0;i<temp_plot.m_plotInstances.numInstances();i++) {
	  if (temp_plot.m_pointLookup[i][0] != Double.NEGATIVE_INFINITY) {
	    double px = temp_plot.m_pointLookup[i][0] + 
	      temp_plot.m_pointLookup[i][2];
	    double py = temp_plot.m_pointLookup[i][1] + 
	      temp_plot.m_pointLookup[i][3];
	    //	    double size = temp_plot.m_pointLookup[i][2];
	    double size = temp_plot.m_shapeSize[i];
	    if ((x >= px-size) && (x <= px+size) &&
		(y >= py-size) && (y <= py+size)) {
	      {
		insts.append(Messages.getInstance().getString("Plot2D_SearchPoints_Text_First") + temp_plot.m_plotName
			     + Messages.getInstance().getString("Plot2D_SearchPoints_Text_Second") + (i + 1 ) + Messages.getInstance().getString("Plot2D_SearchPoints_Text_Third"));
		for (int j=0;j<temp_plot.m_plotInstances.numAttributes();j++) {
		  for (int k = 0;k < 
			 (longest-temp_plot.m_plotInstances.
			  attribute(j).name().length()); k++) {
		    insts.append(" ");
		  }
		  insts.append(temp_plot.m_plotInstances.attribute(j).name());  
		  insts.append(Messages.getInstance().getString("Plot2D_SearchPoints_Text_Fourth"));
		  
		  if (temp_plot.m_plotInstances.instance(i).isMissing(j)) {
		    insts.append(Messages.getInstance().getString("Plot2D_SearchPoints_Text_Fifth"));
		  } else if (temp_plot.m_plotInstances.attribute(j).
			     isNominal()) {
		    insts.append(temp_plot.m_plotInstances.
				 attribute(j).
				 value((int)temp_plot.m_plotInstances.
				       instance(i).value(j)));
		  } else {
		    insts.append(temp_plot.m_plotInstances.
				 instance(i).value(j));
		  }
		  insts.append(Messages.getInstance().getString("Plot2D_SearchPoints_Text_Sixth"));
		}
	      }
	    }
	  }
	}
      }

      if (insts.length() > 0) {
	// Pop up a new frame
	if (newFrame || m_InstanceInfo == null) {
	  JTextArea jt = new JTextArea();
	  jt.setFont(new Font("Monospaced", Font.PLAIN,12));
	  jt.setEditable(false);
	  jt.setText(insts.toString());
	  final JFrame jf = new JFrame(Messages.getInstance().getString("Plot2D_SearchPoints_JFrame_Text"));
	  final JFrame testf = m_InstanceInfo;
	  jf.addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
		if (!newFrame || testf == null) {
		  m_InstanceInfo = null;
		}
		jf.dispose();
	      }
	    });
	  jf.getContentPane().setLayout(new BorderLayout());
	  jf.getContentPane().add(new JScrollPane(jt), BorderLayout.CENTER);
	  jf.pack();
	  jf.setSize(320, 400);
	  jf.setVisible(true);
	  if (m_InstanceInfo == null) {
	    m_InstanceInfo = jf;
	    m_InstanceInfoText = jt;
	  }
	}  else {
	  // Overwrite info in existing frame	  
	  m_InstanceInfoText.setText(insts.toString());
	}
      }
    }
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Determine the min and max values for axis and colouring attributes
   */
  public void determineBounds() {
<<<<<<< HEAD
    double value; // , min, max; NOT USED

    // find maximums minimums over all plots
    m_minX = m_plots.get(0).m_minX;
    m_maxX = m_plots.get(0).m_maxX;
    m_minY = m_plots.get(0).m_minY;
    m_maxY = m_plots.get(0).m_maxY;
    m_minC = m_plots.get(0).m_minC;
    m_maxC = m_plots.get(0).m_maxC;
    for (int i = 1; i < m_plots.size(); i++) {
      value = m_plots.get(i).m_minX;
      if (value < m_minX) {
        m_minX = value;
      }
      value = m_plots.get(i).m_maxX;
      if (value > m_maxX) {
        m_maxX = value;
      }
      value = m_plots.get(i).m_minY;
      if (value < m_minY) {
        m_minY = value;
      }
      value = m_plots.get(i).m_maxY;
      if (value > m_maxY) {
        m_maxY = value;
      }
      value = m_plots.get(i).m_minC;
      if (value < m_minC) {
        m_minC = value;
      }
      value = m_plots.get(i).m_maxC;
      if (value > m_maxC) {
        m_maxC = value;
=======
    double value,min,max;
    
    // find maximums minimums over all plots
    m_minX = ((PlotData2D)m_plots.elementAt(0)).m_minX;
    m_maxX = ((PlotData2D)m_plots.elementAt(0)).m_maxX;
    m_minY = ((PlotData2D)m_plots.elementAt(0)).m_minY;
    m_maxY = ((PlotData2D)m_plots.elementAt(0)).m_maxY;
    m_minC = ((PlotData2D)m_plots.elementAt(0)).m_minC;
    m_maxC = ((PlotData2D)m_plots.elementAt(0)).m_maxC;
    for (int i=1;i<m_plots.size();i++) {
      value = ((PlotData2D)m_plots.elementAt(i)).m_minX;
      if (value < m_minX) {
	m_minX = value;
      }
      value = ((PlotData2D)m_plots.elementAt(i)).m_maxX;
      if (value > m_maxX) {
	m_maxX = value;
      }
      value = ((PlotData2D)m_plots.elementAt(i)).m_minY;
      if (value < m_minY) {
	m_minY= value;
      }
      value = ((PlotData2D)m_plots.elementAt(i)).m_maxY;
      if (value > m_maxY) {
	m_maxY = value;
      }
      value = ((PlotData2D)m_plots.elementAt(i)).m_minC;
      if (value < m_minC) {
	m_minC = value;
      }
      value = ((PlotData2D)m_plots.elementAt(i)).m_maxC;
      if (value > m_maxC) {
	m_maxC = value;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    fillLookup();
    this.repaint();
  }

<<<<<<< HEAD
  // to convert screen coords to attrib values
  // note that I use a double to avoid accuracy
  // headaches with ints
  /**
   * convert a Panel x coordinate to a raw x value.
   * 
=======
    
  //to convert screen coords to attrib values
  // note that I use a double to avoid accuracy 
  //headaches with ints
  /**
   * convert a Panel x coordinate to a raw x value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param scx The Panel x coordinate
   * @return A raw x value.
   */
  public double convertToAttribX(double scx) {
    double temp = m_XaxisEnd - m_XaxisStart;
    double temp2 = ((scx - m_XaxisStart) * (m_maxX - m_minX)) / temp;
<<<<<<< HEAD

    temp2 = temp2 + m_minX;

    return temp2;
  }

  /**
   * convert a Panel y coordinate to a raw y value.
   * 
=======
      
    temp2 = temp2 + m_minX;
      
    return temp2;
  }
    
  /**
   * convert a Panel y coordinate to a raw y value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param scy The Panel y coordinate
   * @return A raw y value.
   */
  public double convertToAttribY(double scy) {
    double temp = m_YaxisEnd - m_YaxisStart;
    double temp2 = ((scy - m_YaxisEnd) * (m_maxY - m_minY)) / temp;
<<<<<<< HEAD

    temp2 = -(temp2 - m_minY);

    return temp2;
  }

  // ////

  /**
   * returns a value by which an x value can be peturbed. Makes sure that the x
   * value+pturb stays within the plot bounds
   * 
=======
      
    temp2 = -(temp2 - m_minY);
      
    return temp2;
  }
  //////
    
  /**
   * returns a value by which an x value can be peturbed. Makes sure
   * that the x value+pturb stays within the plot bounds
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param xvalP the x coordinate to be peturbed
   * @param xj a random number to use in calculating a peturb value
   * @return a peturb value
   */
  int pturbX(double xvalP, double xj) {
    int xpturb = 0;
    if (m_JitterVal > 0) {
<<<<<<< HEAD
      xpturb = (int) (m_JitterVal * (xj / 2.0));
      if (((xvalP + xpturb) < m_XaxisStart) || ((xvalP + xpturb) > m_XaxisEnd)) {
        xpturb *= -1;
=======
      xpturb = (int)((double)m_JitterVal * (xj / 2.0));
      if (((xvalP + xpturb) < m_XaxisStart) || 
	  ((xvalP + xpturb) > m_XaxisEnd)) {
	xpturb *= -1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return xpturb;
  }

  /**
   * Convert an raw x value to Panel x coordinate.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param xval the raw x value
   * @return an x value for plotting in the panel.
   */
  public double convertToPanelX(double xval) {
<<<<<<< HEAD
    double temp = (xval - m_minX) / (m_maxX - m_minX);
    double temp2 = temp * (m_XaxisEnd - m_XaxisStart);

    temp2 = temp2 + m_XaxisStart;

=======
    double temp = (xval - m_minX)/(m_maxX - m_minX);
    double temp2 = temp * (m_XaxisEnd - m_XaxisStart);
      
    temp2 = temp2 + m_XaxisStart;
	
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return temp2;
  }

  /**
<<<<<<< HEAD
   * returns a value by which a y value can be peturbed. Makes sure that the y
   * value+pturb stays within the plot bounds
   * 
=======
   * returns a value by which a y value can be peturbed. Makes sure
   * that the y value+pturb stays within the plot bounds
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param yvalP the y coordinate to be peturbed
   * @param yj a random number to use in calculating a peturb value
   * @return a peturb value
   */
  int pturbY(double yvalP, double yj) {
    int ypturb = 0;
    if (m_JitterVal > 0) {
<<<<<<< HEAD
      ypturb = (int) (m_JitterVal * (yj / 2.0));
      if (((yvalP + ypturb) < m_YaxisStart) || ((yvalP + ypturb) > m_YaxisEnd)) {
        ypturb *= -1;
=======
      ypturb = (int)((double)m_JitterVal * (yj / 2.0));
      if (((yvalP + ypturb) < m_YaxisStart) || 
	  ((yvalP + ypturb) > m_YaxisEnd)) {
	ypturb *= -1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return ypturb;
  }

  /**
   * Convert an raw y value to Panel y coordinate.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param yval the raw y value
   * @return an y value for plotting in the panel.
   */
  public double convertToPanelY(double yval) {
<<<<<<< HEAD
    double temp = (yval - m_minY) / (m_maxY - m_minY);
    double temp2 = temp * (m_YaxisEnd - m_YaxisStart);

=======
    double temp = (yval - m_minY)/(m_maxY - m_minY);
    double temp2 = temp * (m_YaxisEnd - m_YaxisStart);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    temp2 = m_YaxisEnd - temp2;

    return temp2;
  }

  /**
   * Draws an X.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   * @param x the x coord
   * @param y the y coord
   * @param size the size of the shape
   */
  private static void drawX(Graphics gx, double x, double y, int size) {
<<<<<<< HEAD
    gx.drawLine((int) (x - size), (int) (y - size), (int) (x + size),
      (int) (y + size));

    gx.drawLine((int) (x + size), (int) (y - size), (int) (x - size),
      (int) (y + size));
=======
     gx.drawLine((int)(x-size),(int)(y-size),
		  (int)(x+size),(int)(y+size));
     
      gx.drawLine((int)(x+size),(int)(y-size),
		  (int)(x-size),(int)(y+size));     
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Draws a plus.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   * @param x the x coord
   * @param y the y coord
   * @param size the size of the shape
   */
  private static void drawPlus(Graphics gx, double x, double y, int size) {
<<<<<<< HEAD
    gx.drawLine((int) (x - size), (int) (y), (int) (x + size), (int) (y));

    gx.drawLine((int) (x), (int) (y - size), (int) (x), (int) (y + size));
=======
     gx.drawLine((int)(x-size),(int)(y),
		  (int)(x+size),(int)(y));
     
      gx.drawLine((int)(x),(int)(y-size),
		  (int)(x),(int)(y+size));     
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Draws a diamond.
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   * @param x the x coord
   * @param y the y coord
   * @param size the size of the shape
   */
  private static void drawDiamond(Graphics gx, double x, double y, int size) {
<<<<<<< HEAD
    gx.drawLine((int) (x - size), (int) (y), (int) (x), (int) (y - size));

    gx.drawLine((int) (x), (int) (y - size), (int) (x + size), (int) (y));

    gx.drawLine((int) (x + size), (int) (y), (int) (x), (int) (y + size));

    gx.drawLine((int) (x), (int) (y + size), (int) (x - size), (int) (y));
=======
    gx.drawLine((int)(x-size),(int)(y),
		(int)(x),(int)(y-size));
    
    gx.drawLine((int)(x),(int)(y-size),
		  (int)(x+size),(int)(y));

    gx.drawLine((int)(x+size),(int)(y),
		  (int)(x),(int)(y+size));

     gx.drawLine((int)(x),(int)(y+size),
		  (int)(x-size),(int)(y));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Draws an triangle (point at top).
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   * @param x the x coord
   * @param y the y coord
   * @param size the size of the shape
   */
<<<<<<< HEAD
  private static void drawTriangleUp(Graphics gx, double x, double y, int size) {
    gx.drawLine((int) (x), (int) (y - size), (int) (x - size), (int) (y + size));

    gx.drawLine((int) (x - size), (int) (y + size), (int) (x + size),
      (int) (y + size));

    gx.drawLine((int) (x + size), (int) (y + size), (int) (x), (int) (y - size));
=======
  private static void drawTriangleUp(Graphics gx, double x, 
				     double y, int size) {
    gx.drawLine((int)(x),(int)(y-size),
		(int)(x-size),(int)(y+size));

    gx.drawLine((int)(x-size),(int)(y+size),
		(int)(x+size),(int)(y+size));

    gx.drawLine((int)(x+size),(int)(y+size),
		(int)(x),(int)(y-size));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  }

  /**
   * Draws an triangle (point at bottom).
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   * @param x the x coord
   * @param y the y coord
   * @param size the size of the shape
   */
<<<<<<< HEAD
  private static void
    drawTriangleDown(Graphics gx, double x, double y, int size) {
    gx.drawLine((int) (x), (int) (y + size), (int) (x - size), (int) (y - size));

    gx.drawLine((int) (x - size), (int) (y - size), (int) (x + size),
      (int) (y - size));

    gx.drawLine((int) (x + size), (int) (y - size), (int) (x), (int) (y + size));
=======
  private static void drawTriangleDown(Graphics gx, double x, 
				       double y, int size) {
    gx.drawLine((int)(x),(int)(y+size),
		(int)(x-size),(int)(y-size));

    gx.drawLine((int)(x-size),(int)(y-size),
		(int)(x+size),(int)(y-size));

    gx.drawLine((int)(x+size),(int)(y-size),
		(int)(x),(int)(y+size));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  }

  /**
<<<<<<< HEAD
   * Draws a data point at a given set of panel coordinates at a given size and
   * connects a line to the previous point.
   * 
=======
   * Draws a data point at a given set of panel coordinates at a given
   * size and connects a line to the previous point.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param x the x coord
   * @param y the y coord
   * @param xprev the x coord of the previous point
   * @param yprev the y coord of the previous point
   * @param size the size of the point
   * @param shape the shape of the data point (square is reserved for nominal
<<<<<<< HEAD
   *          error data points). Shapes: 0=x, 1=plus, 2=diamond,
   *          3=triangle(up), 4 = triangle (down).
   * @param gx the graphics context
   */
  protected static void drawDataPoint(double x, double y, double xprev,
    double yprev, int size, int shape, Graphics gx) {

    drawDataPoint(x, y, size, shape, gx);

    // connect a line to the previous point
    gx.drawLine((int) x, (int) y, (int) xprev, (int) yprev);
  }

  /**
   * Draws a data point at a given set of panel coordinates at a given size.
   * 
=======
   * error data points). Shapes: 0=x, 1=plus, 2=diamond, 3=triangle(up),
   * 4 = triangle (down).
   * @param gx the graphics context
   */
  protected static void drawDataPoint(double x, 
			       double y,
			       double xprev,
			       double yprev,
			       int size,
			       int shape,
			       Graphics gx) {

    drawDataPoint(x,y,size,shape,gx);

    // connect a line to the previous point
    gx.drawLine((int)x, (int)y, (int)xprev, (int)yprev);
  }

  /**
   * Draws a data point at a given set of panel coordinates at a given
   * size.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param x the x coord
   * @param y the y coord
   * @param size the size of the point
   * @param shape the shape of the data point (square is reserved for nominal
<<<<<<< HEAD
   *          error data points). Shapes: 0=x, 1=plus, 2=diamond,
   *          3=triangle(up), 4 = triangle (down).
   * @param gx the graphics context
   */
  protected static void drawDataPoint(double x, double y, int size, int shape,
    Graphics gx) {
=======
   * error data points). Shapes: 0=x, 1=plus, 2=diamond, 3=triangle(up),
   * 4 = triangle (down).
   * @param gx the graphics context
   */
  protected static void drawDataPoint(double x, 
				      double y,
				      int size,
				      int shape,
				      Graphics gx) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    Font lf = new Font("Monospaced", Font.PLAIN, 12);
    FontMetrics fm = gx.getFontMetrics(lf);

    if (size == 0) {
      size = 1;
    }

    if (shape != ERROR_SHAPE && shape != MISSING_SHAPE) {
      shape = shape % 5;
    }

    switch (shape) {
    case X_SHAPE:
      drawX(gx, x, y, size);
<<<<<<< HEAD
      break;
=======
      break;      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    case PLUS_SHAPE:
      drawPlus(gx, x, y, size);
      break;
    case DIAMOND_SHAPE:
      drawDiamond(gx, x, y, size);
      break;
    case TRIANGLEUP_SHAPE:
      drawTriangleUp(gx, x, y, size);
      break;
    case TRIANGLEDOWN_SHAPE:
      drawTriangleDown(gx, x, y, size);
      break;
<<<<<<< HEAD
    case ERROR_SHAPE: // draws the nominal error shape
      gx.drawRect((int) (x - size), (int) (y - size), (size * 2), (size * 2));
=======
    case ERROR_SHAPE: // draws the nominal error shape 
      gx.drawRect((int)(x-size),(int)(y-size),(size*2),(size*2));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      break;
    case MISSING_SHAPE:
      int hf = fm.getAscent();
      int width = fm.stringWidth("M");
<<<<<<< HEAD
      gx.drawString("M", (int) (x - (width / 2)), (int) (y + (hf / 2)));
=======
      gx.drawString("M",(int)(x-(width / 2)), (int)(y+(hf / 2)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      break;
    }
  }

  /**
<<<<<<< HEAD
   * Updates the perturbed values for the plots when the jitter value is changed
   */
  private void updatePturb() {
    double xj = 0;
    double yj = 0;
    for (int j = 0; j < m_plots.size(); j++) {
      PlotData2D temp_plot = (m_plots.get(j));
      for (int i = 0; i < temp_plot.m_plotInstances.numInstances(); i++) {
        if (temp_plot.m_plotInstances.instance(i).isMissing(m_xIndex)
          || temp_plot.m_plotInstances.instance(i).isMissing(m_yIndex)) {
        } else {
          if (m_JitterVal > 0) {
            xj = m_JRand.nextGaussian();
            yj = m_JRand.nextGaussian();
          }
          temp_plot.m_pointLookup[i][2] =
            pturbX(temp_plot.m_pointLookup[i][0], xj);
          temp_plot.m_pointLookup[i][3] =
            pturbY(temp_plot.m_pointLookup[i][1], yj);
        }
=======
   * Updates the perturbed values for the plots when the jitter value is
   * changed
   */
  private void updatePturb() {
    double xj=0;
    double yj=0;
    for (int j=0;j<m_plots.size();j++) {
      PlotData2D temp_plot = (PlotData2D)(m_plots.elementAt(j));
      for (int i=0;i<temp_plot.m_plotInstances.numInstances();i++) {
	if (temp_plot.m_plotInstances.instance(i).isMissing(m_xIndex) ||
	    temp_plot.m_plotInstances.instance(i).isMissing(m_yIndex)) {
	} else {
	  if (m_JitterVal > 0) {
	    xj = m_JRand.nextGaussian();
	    yj = m_JRand.nextGaussian();
	  }
	  temp_plot.m_pointLookup[i][2] = 
	    pturbX(temp_plot.m_pointLookup[i][0],xj);
	  temp_plot.m_pointLookup[i][3] = 
	    pturbY(temp_plot.m_pointLookup[i][1],yj);
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Fills the lookup caches for the plots. Also calculates errors for numeric
   * predictions (if any) in plots
   */
  private void fillLookup() {

    for (int j = 0; j < m_plots.size(); j++) {
      PlotData2D temp_plot = (m_plots.get(j));

      if (temp_plot.m_plotInstances.numInstances() > 0
        && temp_plot.m_plotInstances.numAttributes() > 0) {
        for (int i = 0; i < temp_plot.m_plotInstances.numInstances(); i++) {
          if (temp_plot.m_plotInstances.instance(i).isMissing(m_xIndex)
            || temp_plot.m_plotInstances.instance(i).isMissing(m_yIndex)) {
            temp_plot.m_pointLookup[i][0] = Double.NEGATIVE_INFINITY;
            temp_plot.m_pointLookup[i][1] = Double.NEGATIVE_INFINITY;
          } else {
            double x =
              convertToPanelX(temp_plot.m_plotInstances.instance(i).value(
                m_xIndex));
            double y =
              convertToPanelY(temp_plot.m_plotInstances.instance(i).value(
                m_yIndex));
            temp_plot.m_pointLookup[i][0] = x;
            temp_plot.m_pointLookup[i][1] = y;
          }
        }
      }
    }
  }

  /**
   * Draws the data points and predictions (if provided).
   * 
=======
   * Fills the lookup caches for the plots. Also calculates errors for
   * numeric predictions (if any) in plots
   */
  private void fillLookup() {

    for (int j=0;j<m_plots.size();j++) {
      PlotData2D temp_plot = (PlotData2D)(m_plots.elementAt(j));

      if (temp_plot.m_plotInstances.numInstances() > 0 &&
	  temp_plot.m_plotInstances.numAttributes() > 0) {
	for (int i=0;i<temp_plot.m_plotInstances.numInstances();i++) {
	  if (temp_plot.m_plotInstances.instance(i).isMissing(m_xIndex) ||
	      temp_plot.m_plotInstances.instance(i).isMissing(m_yIndex)) {
	    temp_plot.m_pointLookup[i][0] = Double.NEGATIVE_INFINITY;
	    temp_plot.m_pointLookup[i][1] = Double.NEGATIVE_INFINITY;
	  } else {
	    double x = convertToPanelX(temp_plot.m_plotInstances.
				       instance(i).value(m_xIndex));
	    double y = convertToPanelY(temp_plot.m_plotInstances.
				       instance(i).value(m_yIndex));
	    temp_plot.m_pointLookup[i][0] = x;
	    temp_plot.m_pointLookup[i][1] = y;
	  }
	}
      }
    }
  }
    
  /**
   * Draws the data points and predictions (if provided).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   */
  private void paintData(Graphics gx) {

<<<<<<< HEAD
    for (int j = 0; j < m_plots.size(); j++) {
      PlotData2D temp_plot = (m_plots.get(j));

      for (int i = 0; i < temp_plot.m_plotInstances.numInstances(); i++) {
        if (temp_plot.m_plotInstances.instance(i).isMissing(m_xIndex)
          || temp_plot.m_plotInstances.instance(i).isMissing(m_yIndex)) {
        } else {
          double x =
            (temp_plot.m_pointLookup[i][0] + temp_plot.m_pointLookup[i][2]);
          double y =
            (temp_plot.m_pointLookup[i][1] + temp_plot.m_pointLookup[i][3]);

          double prevx = 0;
          double prevy = 0;
          if (i > 0) {
            prevx =
              (temp_plot.m_pointLookup[i - 1][0] + temp_plot.m_pointLookup[i - 1][2]);
            prevy =
              (temp_plot.m_pointLookup[i - 1][1] + temp_plot.m_pointLookup[i - 1][3]);
          }

          int x_range = (int) x - m_XaxisStart;
          int y_range = (int) y - m_YaxisStart;

          if (x_range >= 0 && y_range >= 0) {
            if (m_drawnPoints[x_range][y_range] == i
              || m_drawnPoints[x_range][y_range] == 0
              || temp_plot.m_shapeSize[i] == temp_plot.m_alwaysDisplayPointsOfThisSize
              || temp_plot.m_displayAllPoints == true) {
              m_drawnPoints[x_range][y_range] = i;
              if (temp_plot.m_plotInstances.attribute(m_cIndex).isNominal()) {
                if (temp_plot.m_plotInstances.attribute(m_cIndex).numValues() > m_colorList
                  .size() && !temp_plot.m_useCustomColour) {
                  extendColourMap(temp_plot.m_plotInstances.attribute(m_cIndex)
                    .numValues());
                }

                Color ci;
                if (temp_plot.m_plotInstances.instance(i).isMissing(m_cIndex)) {
                  ci = Color.gray;
                } else {
                  int ind =
                    (int) temp_plot.m_plotInstances.instance(i).value(m_cIndex);
                  ci = m_colorList.get(ind);
                }

                if (!temp_plot.m_useCustomColour) {
                  gx.setColor(ci);
                } else {
                  gx.setColor(temp_plot.m_customColour);
                }

                if (temp_plot.m_plotInstances.instance(i).isMissing(m_cIndex)) {
                  if (temp_plot.m_connectPoints[i] == true) {
                    drawDataPoint(x, y, prevx, prevy, temp_plot.m_shapeSize[i],
                      MISSING_SHAPE, gx);
                  } else {
                    drawDataPoint(x, y, temp_plot.m_shapeSize[i],
                      MISSING_SHAPE, gx);
                  }
                } else {
                  if (temp_plot.m_shapeType[i] == CONST_AUTOMATIC_SHAPE) {
                    if (temp_plot.m_connectPoints[i] == true) {
                      drawDataPoint(x, y, prevx, prevy,
                        temp_plot.m_shapeSize[i], j, gx);
                    } else {
                      drawDataPoint(x, y, temp_plot.m_shapeSize[i], j, gx);
                    }
                  } else {
                    if (temp_plot.m_connectPoints[i] == true) {
                      drawDataPoint(x, y, prevx, prevy,
                        temp_plot.m_shapeSize[i], temp_plot.m_shapeType[i], gx);
                    } else {
                      drawDataPoint(x, y, temp_plot.m_shapeSize[i],
                        temp_plot.m_shapeType[i], gx);
                    }
                  }
                }
              } else {
                double r;
                Color ci = null;
                if (!temp_plot.m_plotInstances.instance(i).isMissing(m_cIndex)) {
                  r =
                    (temp_plot.m_plotInstances.instance(i).value(m_cIndex) - m_minC)
                      / (m_maxC - m_minC);
                  r = (r * 240) + 15;
                  ci = new Color((int) r, 150, (int) (255 - r));
                } else {
                  ci = Color.gray;
                }
                if (!temp_plot.m_useCustomColour) {
                  gx.setColor(ci);
                } else {
                  gx.setColor(temp_plot.m_customColour);
                }
                if (temp_plot.m_plotInstances.instance(i).isMissing(m_cIndex)) {
                  if (temp_plot.m_connectPoints[i] == true) {
                    drawDataPoint(x, y, prevx, prevy, temp_plot.m_shapeSize[i],
                      MISSING_SHAPE, gx);
                  } else {
                    drawDataPoint(x, y, temp_plot.m_shapeSize[i],
                      MISSING_SHAPE, gx);
                  }
                } else {
                  if (temp_plot.m_shapeType[i] == CONST_AUTOMATIC_SHAPE) {
                    if (temp_plot.m_connectPoints[i] == true) {
                      drawDataPoint(x, y, prevx, prevy,
                        temp_plot.m_shapeSize[i], j, gx);
                    } else {
                      drawDataPoint(x, y, temp_plot.m_shapeSize[i], j, gx);
                    }
                  } else {
                    if (temp_plot.m_connectPoints[i] == true) {
                      drawDataPoint(x, y, prevx, prevy,
                        temp_plot.m_shapeSize[i], temp_plot.m_shapeType[i], gx);
                    } else {
                      drawDataPoint(x, y, temp_plot.m_shapeSize[i],
                        temp_plot.m_shapeType[i], gx);
                    }
                  }
                }
              }
            }
          }
        }
=======
    for (int j=0;j<m_plots.size();j++) {
      PlotData2D temp_plot = (PlotData2D)(m_plots.elementAt(j));

      for (int i=0;i<temp_plot.m_plotInstances.numInstances();i++) {
	if (temp_plot.m_plotInstances.instance(i).isMissing(m_xIndex) ||
	    temp_plot.m_plotInstances.instance(i).isMissing(m_yIndex)) {
	} else {
	  double x = (temp_plot.m_pointLookup[i][0] + 
		      temp_plot.m_pointLookup[i][2]);
	  double y = (temp_plot.m_pointLookup[i][1] + 
		      temp_plot.m_pointLookup[i][3]);

	  double prevx = 0;
	  double prevy = 0;
	  if (i > 0) {
	    prevx = (temp_plot.m_pointLookup[i - 1][0] + 
			temp_plot.m_pointLookup[i - 1][2]);
	    prevy = (temp_plot.m_pointLookup[i - 1][1] + 
			temp_plot.m_pointLookup[i - 1][3]);
	  }

	  int x_range = (int)x - m_XaxisStart;
	  int y_range = (int)y - m_YaxisStart;

	  if (x_range >= 0 && y_range >= 0) {
	    if (m_drawnPoints[x_range][y_range] == i 
		|| m_drawnPoints[x_range][y_range] == 0
		|| temp_plot.m_shapeSize[i] == temp_plot.m_alwaysDisplayPointsOfThisSize
		|| temp_plot.m_displayAllPoints == true) {
	      m_drawnPoints[x_range][y_range] = i;
	      if (temp_plot.m_plotInstances.attribute(m_cIndex).isNominal()) {
		if (temp_plot.m_plotInstances.attribute(m_cIndex).numValues() >
		    m_colorList.size() && 
		    !temp_plot.m_useCustomColour) {
		  extendColourMap(temp_plot.m_plotInstances.
				  attribute(m_cIndex).numValues());
		}

		Color ci;
		if (temp_plot.m_plotInstances.instance(i).
		    isMissing(m_cIndex)) {
		  ci = Color.gray;
		} else {
		  int ind = (int)temp_plot.m_plotInstances.instance(i).
		    value(m_cIndex);
		  ci = (Color)m_colorList.elementAt(ind);
		}

		if (!temp_plot.m_useCustomColour) {
		  gx.setColor(ci);	    
		} else {
		  gx.setColor(temp_plot.m_customColour);
		}

		if (temp_plot.m_plotInstances.instance(i).
		    isMissing(m_cIndex)) {
		  if (temp_plot.m_connectPoints[i] == true) {
		    drawDataPoint(x,y,prevx,prevy,temp_plot.m_shapeSize[i],
				  MISSING_SHAPE,gx);
		  } else {
		    drawDataPoint(x,y,temp_plot.m_shapeSize[i],
				  MISSING_SHAPE,gx);
		  }
		} else {
		  if (temp_plot.m_shapeType[i] == CONST_AUTOMATIC_SHAPE) {
		    if (temp_plot.m_connectPoints[i] == true) {
		      drawDataPoint(x,y,prevx,prevy,
				    temp_plot.m_shapeSize[i],j,gx);
		    } else {
		      drawDataPoint(x,y,temp_plot.m_shapeSize[i],j,gx);
		    }
		  } else {
		    if (temp_plot.m_connectPoints[i] == true) {
		       drawDataPoint(x,y,prevx,prevy,temp_plot.m_shapeSize[i],
				     temp_plot.m_shapeType[i],gx);
		    } else {
		      drawDataPoint(x,y,temp_plot.m_shapeSize[i],
				    temp_plot.m_shapeType[i],gx);
		    }
		  }
		}
	      } else {
		double r;
		Color ci = null;
		if (!temp_plot.m_plotInstances.instance(i).
		    isMissing(m_cIndex)) {
		  r = (temp_plot.m_plotInstances.instance(i).
		       value(m_cIndex) - m_minC) / (m_maxC - m_minC);
		  r = (r * 240) + 15;
		  ci = new Color((int)r,150,(int)(255-r));
		} else {
		  ci = Color.gray;
		}
		if (!temp_plot.m_useCustomColour) {
		  gx.setColor(ci);
		} else {
		  gx.setColor(temp_plot.m_customColour);
		}
		if (temp_plot.m_plotInstances.instance(i).
		    isMissing(m_cIndex)) {
		  if (temp_plot.m_connectPoints[i] == true) {
		    drawDataPoint(x,y,prevx,prevy,temp_plot.m_shapeSize[i],
				  MISSING_SHAPE,gx);
		  } else {
		    drawDataPoint(x,y,temp_plot.m_shapeSize[i],
				  MISSING_SHAPE,gx);
		  }
		} else {
		  if (temp_plot.m_shapeType[i] == CONST_AUTOMATIC_SHAPE) {
		    if (temp_plot.m_connectPoints[i] == true) {
		      drawDataPoint(x,y,prevx,prevy,
				    temp_plot.m_shapeSize[i],j,gx);
		    } else {
		      drawDataPoint(x,y,temp_plot.m_shapeSize[i],j,gx);
		    }
		  } else {
		    if (temp_plot.m_connectPoints[i] == true) {
		      drawDataPoint(x,y,prevx,prevy,temp_plot.m_shapeSize[i],
				    temp_plot.m_shapeType[i],gx);
		    } else {
		      drawDataPoint(x,y,temp_plot.m_shapeSize[i],
				    temp_plot.m_shapeType[i],gx);
		    }
		  }
		}
	      }
	    }
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /*
<<<<<<< HEAD
   * public void determineAxisPositions(Graphics gx) { setFonts(gx); int mxs =
   * m_XaxisStart; int mxe = m_XaxisEnd; int mys = m_YaxisStart; int mye =
   * m_YaxisEnd; m_axisChanged = false;
   * 
   * int h = this.getHeight(); int w = this.getWidth(); int hf =
   * m_labelMetrics.getAscent(); int mswx=0; int mswy=0;
   * 
   * // determineBounds(); int fieldWidthX =
   * (int)((Math.log(m_maxX)/Math.log(10)))+1; int precisionX = 1; if
   * ((Math.abs(m_maxX-m_minX) < 1) && ((m_maxY-m_minX) != 0)) { precisionX =
   * (int)Math.abs(((Math.log(Math.abs(m_maxX-m_minX)) / Math.log(10))))+1; }
   * String maxStringX = Utils.doubleToString(m_maxX, fieldWidthX+1+precisionX
   * ,precisionX); mswx = m_labelMetrics.stringWidth(maxStringX); int
   * fieldWidthY = (int)((Math.log(m_maxY)/Math.log(10)))+1; int precisionY = 1;
   * if (Math.abs((m_maxY-m_minY)) < 1 && ((m_maxY-m_minY) != 0)) { precisionY =
   * (int)Math.abs(((Math.log(Math.abs(m_maxY-m_minY)) / Math.log(10))))+1; }
   * String maxStringY = Utils.doubleToString(m_maxY, fieldWidthY+1+precisionY
   * ,precisionY); String minStringY = Utils.doubleToString(m_minY,
   * fieldWidthY+1+precisionY ,precisionY);
   * 
   * if (m_plotInstances.attribute(m_yIndex).isNumeric()) { mswy =
   * (m_labelMetrics.stringWidth(maxStringY) >
   * m_labelMetrics.stringWidth(minStringY)) ?
   * m_labelMetrics.stringWidth(maxStringY) :
   * m_labelMetrics.stringWidth(minStringY); } else { mswy =
   * m_labelMetrics.stringWidth("MM"); }
   * 
   * m_YaxisStart = m_axisPad; m_XaxisStart = 0+m_axisPad+m_tickSize+mswy;
   * 
   * m_XaxisEnd = w-m_axisPad-(mswx/2);
   * 
   * m_YaxisEnd = h-m_axisPad-(2 * hf)-m_tickSize; }
   */

  /**
   * Draws the axis and a spectrum if the colouring attribute is numeric
   * 
=======
  public void determineAxisPositions(Graphics gx) {
    setFonts(gx);
    int mxs = m_XaxisStart;
    int mxe = m_XaxisEnd;
    int mys = m_YaxisStart;
    int mye = m_YaxisEnd;
    m_axisChanged = false;

    int h = this.getHeight();
    int w = this.getWidth();
    int hf = m_labelMetrics.getAscent();
    int mswx=0;
    int mswy=0;

    //      determineBounds();
    int fieldWidthX = (int)((Math.log(m_maxX)/Math.log(10)))+1;
    int precisionX = 1;
    if ((Math.abs(m_maxX-m_minX) < 1) && ((m_maxY-m_minX) != 0)) {
      precisionX = (int)Math.abs(((Math.log(Math.abs(m_maxX-m_minX)) / 
				   Math.log(10))))+1;
    }
    String maxStringX = Utils.doubleToString(m_maxX,
					     fieldWidthX+1+precisionX
					     ,precisionX);
    mswx = m_labelMetrics.stringWidth(maxStringX);
    int fieldWidthY = (int)((Math.log(m_maxY)/Math.log(10)))+1;
    int precisionY = 1;
    if (Math.abs((m_maxY-m_minY)) < 1 && ((m_maxY-m_minY) != 0)) {
      precisionY = (int)Math.abs(((Math.log(Math.abs(m_maxY-m_minY)) / 
				   Math.log(10))))+1;
    }
    String maxStringY = Utils.doubleToString(m_maxY,
					     fieldWidthY+1+precisionY
					     ,precisionY);
    String minStringY = Utils.doubleToString(m_minY,
					     fieldWidthY+1+precisionY
					     ,precisionY);

    if (m_plotInstances.attribute(m_yIndex).isNumeric()) {
      mswy = (m_labelMetrics.stringWidth(maxStringY) > 
	      m_labelMetrics.stringWidth(minStringY))
	? m_labelMetrics.stringWidth(maxStringY)
	: m_labelMetrics.stringWidth(minStringY);
    } else {
      mswy = m_labelMetrics.stringWidth("MM");
    }

    m_YaxisStart = m_axisPad;
    m_XaxisStart = 0+m_axisPad+m_tickSize+mswy;

    m_XaxisEnd = w-m_axisPad-(mswx/2);
      
    m_YaxisEnd = h-m_axisPad-(2 * hf)-m_tickSize;
    } */

  /**
   * Draws the axis and a spectrum if the colouring attribute is numeric
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param gx the graphics context
   */
  private void paintAxis(Graphics gx) {
    setFonts(gx);
    int mxs = m_XaxisStart;
    int mxe = m_XaxisEnd;
    int mys = m_YaxisStart;
    int mye = m_YaxisEnd;
    m_plotResize = false;

    int h = this.getHeight();
    int w = this.getWidth();
    int hf = m_labelMetrics.getAscent();
<<<<<<< HEAD
    int mswx = 0;
    int mswy = 0;

    // determineBounds();
    int precisionXmax = 1;
    int precisionXmin = 1;
    int precisionXmid = 1;
    /*
     * if ((Math.abs(m_maxX-m_minX) < 1) && ((m_maxY-m_minX) != 0)) { precisionX
     * = (int)Math.abs(((Math.log(Math.abs(m_maxX-m_minX)) / Math.log(10))))+1;
     * }
     */
    int whole = (int) Math.abs(m_maxX);
    double decimal = Math.abs(m_maxX) - whole;
    int nondecimal;
    nondecimal = (whole > 0) ? (int) (Math.log(whole) / Math.log(10)) : 1;

    precisionXmax =
      (decimal > 0) ? (int) Math.abs(((Math.log(Math.abs(m_maxX)) / Math
        .log(10)))) + 2 : 1;
=======
    int mswx=0;
    int mswy=0;

    //      determineBounds();
    int precisionXmax = 1;
    int precisionXmin = 1;
    int precisionXmid = 1;
    /*if ((Math.abs(m_maxX-m_minX) < 1) && ((m_maxY-m_minX) != 0)) {
      precisionX = (int)Math.abs(((Math.log(Math.abs(m_maxX-m_minX)) / 
				   Math.log(10))))+1;
				   } */
    int whole = (int)Math.abs(m_maxX);
    double decimal = Math.abs(m_maxX) - whole;
    int nondecimal;
    nondecimal = (whole > 0) 
      ? (int)(Math.log(whole) / Math.log(10))
      : 1;
    
    precisionXmax = (decimal > 0) 
      ? (int)Math.abs(((Math.log(Math.abs(m_maxX)) / 
				      Math.log(10))))+2
      : 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (precisionXmax > VisualizeUtils.MAX_PRECISION) {
      precisionXmax = 1;
    }

<<<<<<< HEAD
    String maxStringX =
      Utils.doubleToString(m_maxX, nondecimal + 1 + precisionXmax,
        precisionXmax);

    whole = (int) Math.abs(m_minX);
    decimal = Math.abs(m_minX) - whole;
    nondecimal = (whole > 0) ? (int) (Math.log(whole) / Math.log(10)) : 1;
    precisionXmin =
      (decimal > 0) ? (int) Math.abs(((Math.log(Math.abs(m_minX)) / Math
        .log(10)))) + 2 : 1;
    if (precisionXmin > VisualizeUtils.MAX_PRECISION) {
      precisionXmin = 1;
    }

    String minStringX =
      Utils.doubleToString(m_minX, nondecimal + 1 + precisionXmin,
        precisionXmin);
=======
    String maxStringX = Utils.doubleToString(m_maxX,
					     nondecimal+1+precisionXmax
					     ,precisionXmax);

    whole = (int)Math.abs(m_minX);
    decimal = Math.abs(m_minX) - whole;
    nondecimal = (whole > 0) 
      ? (int)(Math.log(whole) / Math.log(10))
      : 1;
    precisionXmin = (decimal > 0) 
      ? (int)Math.abs(((Math.log(Math.abs(m_minX)) / 
				      Math.log(10))))+2
      : 1;
    if (precisionXmin > VisualizeUtils.MAX_PRECISION) {
      precisionXmin = 1;
    }
   
    String minStringX = Utils.doubleToString(m_minX,
					     nondecimal+1+precisionXmin,
					     precisionXmin);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    mswx = m_labelMetrics.stringWidth(maxStringX);

    int precisionYmax = 1;
    int precisionYmin = 1;
    int precisionYmid = 1;
<<<<<<< HEAD
    whole = (int) Math.abs(m_maxY);
    decimal = Math.abs(m_maxY) - whole;
    nondecimal = (whole > 0) ? (int) (Math.log(whole) / Math.log(10)) : 1;
    precisionYmax =
      (decimal > 0) ? (int) Math.abs(((Math.log(Math.abs(m_maxY)) / Math
        .log(10)))) + 2 : 1;
    if (precisionYmax > VisualizeUtils.MAX_PRECISION) {
      precisionYmax = 1;
    }

    String maxStringY =
      Utils.doubleToString(m_maxY, nondecimal + 1 + precisionYmax,
        precisionYmax);

    whole = (int) Math.abs(m_minY);
    decimal = Math.abs(m_minY) - whole;
    nondecimal = (whole > 0) ? (int) (Math.log(whole) / Math.log(10)) : 1;
    precisionYmin =
      (decimal > 0) ? (int) Math.abs(((Math.log(Math.abs(m_minY)) / Math
        .log(10)))) + 2 : 1;
    if (precisionYmin > VisualizeUtils.MAX_PRECISION) {
      precisionYmin = 1;
    }

    String minStringY =
      Utils.doubleToString(m_minY, nondecimal + 1 + precisionYmin,
        precisionYmin);

    if (m_plotInstances.attribute(m_yIndex).isNumeric()) {
      mswy =
        (m_labelMetrics.stringWidth(maxStringY) > m_labelMetrics
          .stringWidth(minStringY)) ? m_labelMetrics.stringWidth(maxStringY)
          : m_labelMetrics.stringWidth(minStringY);
=======
    whole = (int)Math.abs(m_maxY);
    decimal = Math.abs(m_maxY) - whole;
    nondecimal = (whole > 0) 
      ? (int)(Math.log(whole) / Math.log(10))
      : 1;
    precisionYmax = (decimal > 0) 
      ? (int)Math.abs(((Math.log(Math.abs(m_maxY)) / 
				      Math.log(10))))+2
      : 1;
    if (precisionYmax > VisualizeUtils.MAX_PRECISION) {
      precisionYmax = 1;
    }
    
    String maxStringY = Utils.doubleToString(m_maxY,
					     nondecimal+1+precisionYmax
					     ,precisionYmax);


    whole = (int)Math.abs(m_minY);
    decimal = Math.abs(m_minY) - whole;
    nondecimal = (whole > 0) 
      ? (int)(Math.log(whole) / Math.log(10))
      : 1;
    precisionYmin = (decimal > 0) 
      ? (int)Math.abs(((Math.log(Math.abs(m_minY)) / 
				      Math.log(10))))+2
      : 1;
    if (precisionYmin > VisualizeUtils.MAX_PRECISION) {
      precisionYmin = 1;
    }
   
    String minStringY = Utils.doubleToString(m_minY,
					     nondecimal+1+precisionYmin
					     ,precisionYmin);

    if (m_plotInstances.attribute(m_yIndex).isNumeric()) {
      mswy = (m_labelMetrics.stringWidth(maxStringY) > 
	      m_labelMetrics.stringWidth(minStringY))
	? m_labelMetrics.stringWidth(maxStringY)
	: m_labelMetrics.stringWidth(minStringY);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      mswy += m_labelMetrics.stringWidth("M");
    } else {
      mswy = m_labelMetrics.stringWidth("MM");
    }

    m_YaxisStart = m_axisPad;
<<<<<<< HEAD
    m_XaxisStart = 0 + m_axisPad + m_tickSize + mswy;

    m_XaxisEnd = w - m_axisPad - (mswx / 2);

    m_YaxisEnd = h - m_axisPad - (2 * hf) - m_tickSize;
=======
    m_XaxisStart = 0+m_axisPad+m_tickSize+mswy;

    m_XaxisEnd = w-m_axisPad-(mswx/2);
      
    m_YaxisEnd = h-m_axisPad-(2 * hf)-m_tickSize;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // draw axis
    gx.setColor(m_axisColour);
    if (m_plotInstances.attribute(m_xIndex).isNumeric()) {
      if (w > (2 * mswx)) {
<<<<<<< HEAD

        gx.drawString(maxStringX, m_XaxisEnd - (mswx / 2), m_YaxisEnd + hf
          + m_tickSize);

        mswx = m_labelMetrics.stringWidth(minStringX);
        gx.drawString(minStringX, (m_XaxisStart - (mswx / 2)), m_YaxisEnd + hf
          + m_tickSize);

        // draw the middle value
        if (w > (3 * mswx) && (m_plotInstances.attribute(m_xIndex).isNumeric())) {
          double mid = m_minX + ((m_maxX - m_minX) / 2.0);
          whole = (int) Math.abs(mid);
          decimal = Math.abs(mid) - whole;
          nondecimal = (whole > 0) ? (int) (Math.log(whole) / Math.log(10)) : 1;
          precisionXmid =
            (decimal > 0) ? (int) Math.abs(((Math.log(Math.abs(mid)) / Math
              .log(10)))) + 2 : 1;
          if (precisionXmid > VisualizeUtils.MAX_PRECISION) {
            precisionXmid = 1;
          }

          String maxString =
            Utils.doubleToString(mid, nondecimal + 1 + precisionXmid,
              precisionXmid);
          int sw = m_labelMetrics.stringWidth(maxString);
          double mx = m_XaxisStart + ((m_XaxisEnd - m_XaxisStart) / 2.0);
          gx.drawString(maxString, (int) (mx - ((sw) / 2.0)), m_YaxisEnd + hf
            + m_tickSize);
          gx.drawLine((int) mx, m_YaxisEnd, (int) mx, m_YaxisEnd + m_tickSize);
        }
      }
    } else {
      int numValues = m_plotInstances.attribute(m_xIndex).numValues();
      int maxXStringWidth = (m_XaxisEnd - m_XaxisStart) / numValues;

      for (int i = 0; i < numValues; i++) {
        String val = m_plotInstances.attribute(m_xIndex).value(i);
        int sw = m_labelMetrics.stringWidth(val);
        int rm;
        // truncate string if necessary
        if (sw > maxXStringWidth) {
          int incr = (sw / val.length());
          rm = (sw - maxXStringWidth) / incr;
          if (rm == 0) {
            rm = 1;
          }
          val = val.substring(0, val.length() - rm);
          sw = m_labelMetrics.stringWidth(val);
        }
        if (i == 0) {
          gx.drawString(val, (int) convertToPanelX(i), m_YaxisEnd + hf
            + m_tickSize);
        } else if (i == numValues - 1) {
          if ((i % 2) == 0) {
            gx.drawString(val, m_XaxisEnd - sw, m_YaxisEnd + hf + m_tickSize);
          } else {
            gx.drawString(val, m_XaxisEnd - sw, m_YaxisEnd + (2 * hf)
              + m_tickSize);
          }
        } else {
          if ((i % 2) == 0) {
            gx.drawString(val, (int) convertToPanelX(i) - (sw / 2), m_YaxisEnd
              + hf + m_tickSize);
          } else {
            gx.drawString(val, (int) convertToPanelX(i) - (sw / 2), m_YaxisEnd
              + (2 * hf) + m_tickSize);
          }
        }
        gx.drawLine((int) convertToPanelX(i), m_YaxisEnd,
          (int) convertToPanelX(i), m_YaxisEnd + m_tickSize);
      }

=======
	
	gx.drawString(maxStringX, 
		      m_XaxisEnd-(mswx/2),
		      m_YaxisEnd+hf+m_tickSize);
	
	mswx = m_labelMetrics.stringWidth(minStringX);
	gx.drawString(minStringX,
		      (m_XaxisStart-(mswx/2)),
		      m_YaxisEnd+hf+m_tickSize);

	// draw the middle value
	if (w > (3 * mswx) && 
	    (m_plotInstances.attribute(m_xIndex).isNumeric())) {
	  double mid = m_minX+((m_maxX-m_minX)/2.0);
	   whole = (int)Math.abs(mid);
	   decimal = Math.abs(mid) - whole;
	   nondecimal = (whole > 0) 
	     ? (int)(Math.log(whole) / Math.log(10))
	     : 1;
	   precisionXmid = (decimal > 0) 
	     ? (int)Math.abs(((Math.log(Math.abs(mid)) / 
			       Math.log(10))))+2
	     : 1;
	   if (precisionXmid > VisualizeUtils.MAX_PRECISION) {
	     precisionXmid = 1;
	   }
	  
	  String maxString = Utils.doubleToString(mid,
						  nondecimal+1+precisionXmid,
						  precisionXmid);
	  int sw = m_labelMetrics.stringWidth(maxString);
	  double mx = m_XaxisStart+((double)(m_XaxisEnd-m_XaxisStart)/2.0);
	  gx.drawString(maxString,
			(int)(mx-(((double)sw)/2.0)),
			m_YaxisEnd+hf+m_tickSize);
	  gx.drawLine((int)mx,m_YaxisEnd,(int)mx,m_YaxisEnd+m_tickSize);
	}
      }
    } else {
      int numValues = m_plotInstances.attribute(m_xIndex).numValues();
      int div = (numValues % 2 > 0) ? (numValues/2)+1 : (numValues/2);
      int maxXStringWidth = (m_XaxisEnd - m_XaxisStart) / numValues;

      for (int i=0;i<numValues;i++) {
	String val = m_plotInstances.attribute(m_xIndex).value(i);
	int sw = m_labelMetrics.stringWidth(val);
	int rm;
	// truncate string if necessary
	if (sw > maxXStringWidth) {
	  int incr = (sw / val.length());
	  rm = (sw - maxXStringWidth) / incr;
	  if (rm == 0) {
	    rm = 1;
	  }
	  val = val.substring(0,val.length()-rm);
	  sw = m_labelMetrics.stringWidth(val);
	}
	if (i == 0) {
	  gx.drawString(val,(int)convertToPanelX(i),
			m_YaxisEnd+hf+m_tickSize);
	} else if (i == numValues -1) {
	  if ((i % 2) == 0) {
	    gx.drawString(val,
			  m_XaxisEnd-sw,
			  m_YaxisEnd+hf+m_tickSize);
	  } else {
	    gx.drawString(val,
			  m_XaxisEnd-sw,
			  m_YaxisEnd+(2*hf)+m_tickSize);
	  }
	} else {
	  if ((i % 2) == 0) {
	    gx.drawString(val,
			  (int)convertToPanelX(i)-(sw/2),
			  m_YaxisEnd+hf+m_tickSize);
	  } else {
	    gx.drawString(val,
			  (int)convertToPanelX(i)-(sw/2),
			  m_YaxisEnd+(2*hf)+m_tickSize);
	  }
	}
	gx.drawLine((int)convertToPanelX(i),
		    m_YaxisEnd,
		    (int)convertToPanelX(i),
		    m_YaxisEnd+m_tickSize);
      }
	
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    // draw the y axis
    if (m_plotInstances.attribute(m_yIndex).isNumeric()) {
      if (h > (2 * hf)) {
<<<<<<< HEAD
        gx.drawString(maxStringY, m_XaxisStart - mswy - m_tickSize,
          m_YaxisStart + (hf));

        gx.drawString(minStringY, (m_XaxisStart - mswy - m_tickSize),
          m_YaxisEnd);

        // draw the middle value
        if (w > (3 * hf) && (m_plotInstances.attribute(m_yIndex).isNumeric())) {
          double mid = m_minY + ((m_maxY - m_minY) / 2.0);
          whole = (int) Math.abs(mid);
          decimal = Math.abs(mid) - whole;
          nondecimal = (whole > 0) ? (int) (Math.log(whole) / Math.log(10)) : 1;
          precisionYmid =
            (decimal > 0) ? (int) Math.abs(((Math.log(Math.abs(mid)) / Math
              .log(10)))) + 2 : 1;
          if (precisionYmid > VisualizeUtils.MAX_PRECISION) {
            precisionYmid = 1;
          }

          String maxString =
            Utils.doubleToString(mid, nondecimal + 1 + precisionYmid,
              precisionYmid);
          int sw = m_labelMetrics.stringWidth(maxString);
          double mx = m_YaxisStart + ((m_YaxisEnd - m_YaxisStart) / 2.0);
          gx.drawString(maxString, m_XaxisStart - sw - m_tickSize - 1,
            (int) (mx + ((hf) / 2.0)));
          gx.drawLine(m_XaxisStart - m_tickSize, (int) mx, m_XaxisStart,
            (int) mx);
        }
      }
    } else {
      int numValues = m_plotInstances.attribute(m_yIndex).numValues();
      int div = ((numValues % 2) == 0) ? (numValues / 2) : (numValues / 2 + 1);
      int maxYStringHeight = (m_YaxisEnd - m_XaxisStart) / div;
      int sw = m_labelMetrics.stringWidth("M");
      for (int i = 0; i < numValues; i++) {
        // can we at least print 2 characters
        if (maxYStringHeight >= (2 * hf)) {
          String val = m_plotInstances.attribute(m_yIndex).value(i);
          int numPrint =
            ((maxYStringHeight / hf) > val.length()) ? val.length()
              : (maxYStringHeight / hf);

          for (int j = 0; j < numPrint; j++) {
            String ll = val.substring(j, j + 1);
            if (val.charAt(j) == '_' || val.charAt(j) == '-') {
              ll = "|";
            }
            if (i == 0) {
              gx.drawString(ll, m_XaxisStart - sw - m_tickSize - 1,
                (int) convertToPanelY(i) - ((numPrint - 1) * hf) + (j * hf)
                  + (hf / 2));
            } else if (i == (numValues - 1)) {
              if ((i % 2) == 0) {
                gx.drawString(ll, m_XaxisStart - sw - m_tickSize - 1,
                  (int) convertToPanelY(i) + (j * hf) + (hf / 2));
              } else {
                gx.drawString(ll, m_XaxisStart - (2 * sw) - m_tickSize - 1,
                  (int) convertToPanelY(i) + (j * hf) + (hf / 2));
              }
            } else {
              if ((i % 2) == 0) {
                gx.drawString(ll, m_XaxisStart - sw - m_tickSize - 1,
                  (int) convertToPanelY(i) - (((numPrint - 1) * hf) / 2)
                    + (j * hf) + (hf / 2));
              } else {
                gx.drawString(ll, m_XaxisStart - (2 * sw) - m_tickSize - 1,
                  (int) convertToPanelY(i) - (((numPrint - 1) * hf) / 2)
                    + (j * hf) + (hf / 2));
              }
            }
          }
        }
        gx.drawLine(m_XaxisStart - m_tickSize, (int) convertToPanelY(i),
          m_XaxisStart, (int) convertToPanelY(i));
      }
    }

    gx.drawLine(m_XaxisStart, m_YaxisStart, m_XaxisStart, m_YaxisEnd);
    gx.drawLine(m_XaxisStart, m_YaxisEnd, m_XaxisEnd, m_YaxisEnd);

    if (m_XaxisStart != mxs || m_XaxisEnd != mxe || m_YaxisStart != mys
      || m_YaxisEnd != mye) {
=======
	gx.drawString(maxStringY, 
		      m_XaxisStart-mswy-m_tickSize,
		      m_YaxisStart+(hf));

	gx.drawString(minStringY,
		      (m_XaxisStart-mswy-m_tickSize),
		      m_YaxisEnd);

	// draw the middle value
	if (w > (3 * hf) && 
	    (m_plotInstances.attribute(m_yIndex).isNumeric())) {
	  double mid = m_minY+((m_maxY-m_minY)/2.0);
	  whole = (int)Math.abs(mid);
	  decimal = Math.abs(mid) - whole;
	  nondecimal = (whole > 0) 
	    ? (int)(Math.log(whole) / Math.log(10))
	    : 1;
	  precisionYmid = (decimal > 0) 
	    ? (int)Math.abs(((Math.log(Math.abs(mid)) / 
			      Math.log(10))))+2
	    : 1;
	  if (precisionYmid > VisualizeUtils.MAX_PRECISION) {
	    precisionYmid = 1;
	  }
	 
	  String maxString = Utils.doubleToString(mid,
						  nondecimal+1+precisionYmid,
						  precisionYmid);
	  int sw = m_labelMetrics.stringWidth(maxString);
	  double mx = m_YaxisStart+((double)(m_YaxisEnd-m_YaxisStart)/2.0);
	  gx.drawString(maxString,
			m_XaxisStart-sw-m_tickSize-1,
			(int)(mx+(((double)hf)/2.0)));
	  gx.drawLine(m_XaxisStart-m_tickSize,(int)mx,m_XaxisStart,(int)mx);
	}
      }
    } else {
      int numValues = m_plotInstances.attribute(m_yIndex).numValues();
      int div = ((numValues % 2) == 0) ? (numValues/2) : (numValues/2+1);
      int maxYStringHeight = (m_YaxisEnd - m_XaxisStart) / div;
      int sw = m_labelMetrics.stringWidth("M");
      for (int i=0;i<numValues;i++) {
	// can we at least print 2 characters
	if (maxYStringHeight >= (2*hf)) {
	  String val = m_plotInstances.attribute(m_yIndex).value(i);
	  int numPrint = ((maxYStringHeight/hf) > val.length()) ?
	    val.length() :
	    (maxYStringHeight/hf);
	    
	  for (int j=0;j<numPrint;j++) {
	    String ll = val.substring(j,j+1);
	    if (val.charAt(j) == '_' || val.charAt(j) == '-') {
	      ll = "|";
	    }
	    if (i == 0) {
	      gx.drawString(ll,m_XaxisStart-sw-m_tickSize-1,
			    (int)convertToPanelY(i)
			    -((numPrint-1)*hf)
			    +(j*hf)
			    +(hf/2));
	    } else if (i == (numValues-1)) {
	      if ((i % 2) == 0) {
		gx.drawString(ll,m_XaxisStart-sw-m_tickSize-1,
			      (int)convertToPanelY(i)
			      +(j*hf)
			      +(hf/2));
	      } else {
		gx.drawString(ll,m_XaxisStart-(2*sw)-m_tickSize-1,
			      (int)convertToPanelY(i)
			      +(j*hf)
			      +(hf/2));
	      }
	    } else {
	      if ((i % 2) == 0) {
		gx.drawString(ll,m_XaxisStart-sw-m_tickSize-1,
			      (int)convertToPanelY(i)
			      -(((numPrint-1)*hf)/2)
			      +(j*hf)
			      +(hf/2));
	      } else {
		gx.drawString(ll,m_XaxisStart-(2*sw)-m_tickSize-1,
			      (int)convertToPanelY(i)
			      -(((numPrint-1)*hf)/2)
			      +(j*hf)
			      +(hf/2));
	      }
	    }
	  }
	}
	gx.drawLine(m_XaxisStart-m_tickSize,
		    (int)convertToPanelY(i),
		    m_XaxisStart,
		    (int)convertToPanelY(i));
      }
    }

    gx.drawLine(m_XaxisStart,
		m_YaxisStart,
		m_XaxisStart,
		m_YaxisEnd);
    gx.drawLine(m_XaxisStart,
		m_YaxisEnd,
		m_XaxisEnd,
		m_YaxisEnd);

    if (m_XaxisStart != mxs || m_XaxisEnd != mxe ||
	m_YaxisStart != mys || m_YaxisEnd != mye) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_plotResize = true;
    }
  }

  /**
   * Add more colours to the colour map
   */
  private void extendColourMap(int highest) {
<<<<<<< HEAD
    // System.err.println("Extending colour map");
    for (int i = m_colorList.size(); i < highest; i++) {
      Color pc = m_DefaultColors[i % 10];
      int ija = i / 10;
      ija *= 2;
      for (int j = 0; j < ija; j++) {
        pc = pc.brighter();
      }

      m_colorList.add(pc);
=======
    //System.err.println("Extending colour map");
    for (int i = m_colorList.size(); i < highest; i++) {
      Color pc = m_DefaultColors[i % 10];
      int ija =  i / 10;
      ija *= 2; 
      for (int j=0;j<ija;j++) {
	pc = pc.brighter();
      }
      
      m_colorList.addElement(pc);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
   * Renders this component
<<<<<<< HEAD
   * 
   * @param gx the graphics context
   */
  @Override
  public void paintComponent(Graphics gx) {
    super.paintComponent(gx);
    if (m_plotInstances != null && m_plotInstances.numInstances() > 0
      && m_plotInstances.numAttributes() > 0) {
      if (m_plotCompanion != null) {
        m_plotCompanion.prePlot(gx);
=======
   * @param gx the graphics context
   */
  public void paintComponent(Graphics gx) {
    super.paintComponent(gx);
    if (m_plotInstances != null 
	&& m_plotInstances.numInstances() > 0
	&& m_plotInstances.numAttributes() > 0) {
      if (m_plotCompanion != null) {
	m_plotCompanion.prePlot(gx);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      m_JRand = new Random(m_JitterVal);
      paintAxis(gx);
      if (m_axisChanged || m_plotResize) {
<<<<<<< HEAD
        int x_range = m_XaxisEnd - m_XaxisStart;
        int y_range = m_YaxisEnd - m_YaxisStart;
        if (x_range < 10) {
          x_range = 10;
        }
        if (y_range < 10) {
          y_range = 10;
        }

        m_drawnPoints = new int[x_range + 1][y_range + 1];
        fillLookup();
        m_plotResize = false;
        m_axisChanged = false;
=======
	int x_range = m_XaxisEnd - m_XaxisStart;
	int y_range = m_YaxisEnd - m_YaxisStart;
	if (x_range < 10) {
	  x_range = 10;
	}
	if (y_range < 10) {
	  y_range = 10;
	}

	m_drawnPoints = new int[x_range + 1][y_range + 1];
	fillLookup();
	m_plotResize = false;
	m_axisChanged = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      paintData(gx);
    }
  }

  protected static Color checkAgainstBackground(Color c, Color background) {
    if (background == null) {
      return c;
    }
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (c.equals(background)) {
      int red = c.getRed();
      int blue = c.getBlue();
      int green = c.getGreen();
      red += (red < 128) ? (255 - red) / 2 : -(red / 2);
      blue += (blue < 128) ? (blue - red) / 2 : -(blue / 2);
<<<<<<< HEAD
      green += (green < 128) ? (255 - green) / 2 : -(green / 2);
=======
      green += (green< 128) ? (255 - green) / 2 : -(green / 2);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      c = new Color(red, green, blue);
    }
    return c;
  }

  /**
   * Main method for testing this class
<<<<<<< HEAD
   * 
   * @param args arguments
   */
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.err.println("Usage : weka.gui.visualize.Plot2D "
          + "<dataset> [<dataset> <dataset>...]");
        System.exit(1);
      }

      final javax.swing.JFrame jf =
        new javax.swing.JFrame("Weka Explorer: Visualize");
      jf.setSize(500, 400);
=======
   * @param args arguments
   */
  public static void main(String [] args) {
    try {
      if (args.length < 1) {
	System.err.println(Messages.getInstance().getString("Plot2D_Main_Error_Text_First"));
	System.exit(1);
      }

      final javax.swing.JFrame jf = 
	new javax.swing.JFrame(Messages.getInstance().getString("Plot2D_Main_JFrame_Text"));
      jf.setSize(500,400);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.getContentPane().setLayout(new BorderLayout());
      final Plot2D p2 = new Plot2D();
      jf.getContentPane().add(p2, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });

      p2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          if ((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
            p2.searchPoints(e.getX(), e.getY(), false);
          } else {
            p2.searchPoints(e.getX(), e.getY(), true);
          }
        }
      });

      jf.setVisible(true);
      if (args.length >= 1) {
        for (int j = 0; j < args.length; j++) {
          System.err.println("Loading instances from " + args[j]);
          java.io.Reader r =
            new java.io.BufferedReader(new java.io.FileReader(args[j]));
          Instances i = new Instances(r);
          i.setClassIndex(i.numAttributes() - 1);
          PlotData2D pd1 = new PlotData2D(i);

          if (j == 0) {
            pd1.setPlotName("Master plot");
            p2.setMasterPlot(pd1);
            p2.setXindex(2);
            p2.setYindex(3);
            p2.setCindex(i.classIndex());
          } else {
            pd1.setPlotName("Plot " + (j + 1));
            pd1.m_useCustomColour = true;
            pd1.m_customColour = (j % 2 == 0) ? Color.red : Color.blue;
            p2.addPlot(pd1);
          }
        }
=======
	  public void windowClosing(java.awt.event.WindowEvent e) {
	    jf.dispose();
	    System.exit(0);
	  }
	});
      
      p2.addMouseListener(new MouseAdapter() {
	  public void mouseClicked(MouseEvent e) {
	    if ((e.getModifiers() & InputEvent.BUTTON1_MASK) ==
		InputEvent.BUTTON1_MASK) {
	      p2.searchPoints(e.getX(), e.getY(), false);
	    } else {
	      p2.searchPoints(e.getX(), e.getY(), true);
	    }
	  }
	});

      jf.setVisible(true);
      if (args.length >= 1) {
	for (int j = 0; j < args.length; j++) {
	  System.err.println(Messages.getInstance().getString("Plot2D_Main_Error_Text_Second") + args[j]);
	  java.io.Reader r = new java.io.BufferedReader(
			     new java.io.FileReader(args[j]));
	  Instances i = new Instances(r);
	  i.setClassIndex(i.numAttributes()-1);
	  PlotData2D pd1 = new PlotData2D(i);

	  if (j == 0) {
	    pd1.setPlotName(Messages.getInstance().getString("Plot2D_Main_Pd1_SetPlotName_Text_First"));
	    p2.setMasterPlot(pd1);
	    p2.setXindex(2);
	    p2.setYindex(3);
	    p2.setCindex(i.classIndex());
	  } else {
	    pd1.setPlotName(Messages.getInstance().getString("Plot2D_Main_Pd1_SetPlotName_Text_Second") + (j+1));
	    pd1.m_useCustomColour = true;
	    pd1.m_customColour = (j % 2 == 0) ? Color.red : Color.blue; 
	    p2.addPlot(pd1);
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
