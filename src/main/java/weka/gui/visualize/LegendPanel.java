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
 *    LegendPanel.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.gui.visualize;

<<<<<<< HEAD
=======
import weka.core.FastVector;
import weka.core.Instances;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
<<<<<<< HEAD
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
=======
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

<<<<<<< HEAD
import weka.core.Instances;

/**
 * This panel displays legends for a list of plots. If a given plot has a custom
 * colour defined then this panel allows the colour to be changed.
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 10222 $
 */
public class LegendPanel extends JScrollPane {
=======
/**
 * This panel displays legends for a list of plots. If a given plot
 * has a custom colour defined then this panel allows the colour to
 * be changed.
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 7059 $
 */
public class LegendPanel
  extends JScrollPane {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -1262384440543001505L;

  /** the list of plot elements */
<<<<<<< HEAD
  protected ArrayList<PlotData2D> m_plots;

  /** the panel that contains the legend entries */
  protected JPanel m_span = null;

  /**
   * a list of components that need to be repainted when a colour is changed
   */
  protected ArrayList<Component> m_Repainters = new ArrayList<Component>();
=======
  protected FastVector m_plots;

  /** the panel that contains the legend entries */
  protected JPanel m_span=null;

  /** a list of components that need to be repainted when a colour is
      changed */
  protected FastVector m_Repainters = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * Inner class for handling legend entries
   */
<<<<<<< HEAD
  protected class LegendEntry extends JPanel {
=======
  protected class LegendEntry
    extends JPanel {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    /** for serialization */
    private static final long serialVersionUID = 3879990289042935670L;

    /** the data for this legend entry */
<<<<<<< HEAD
    private PlotData2D m_plotData = null;

    /**
     * the index (in the list of plots) of the data for this legend--- used to
     * draw the correct shape for this data
     */
    private final int m_dataIndex;

    /** the text part of this legend */
    private final JLabel m_legendText;

    /** displays the point shape associated with this legend entry */
    private final JPanel m_pointShape;
=======
    private PlotData2D m_plotData=null;

    /** the index (in the list of plots) of the data for this legend---
	used to draw the correct shape for this data */
    private int m_dataIndex;

    /** the text part of this legend */
    private JLabel m_legendText;

    /** displays the point shape associated with this legend entry */
    private JPanel m_pointShape;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    public LegendEntry(PlotData2D data, int dataIndex) {
      javax.swing.ToolTipManager.sharedInstance().setDismissDelay(5000);
      m_plotData = data;
      m_dataIndex = dataIndex;
<<<<<<< HEAD
      // this.setBackground(Color.black);
      /*
       * this.setPreferredSize(new Dimension(0, 20)); this.setMinimumSize(new
       * Dimension(0, 20));
       */

      if (m_plotData.m_useCustomColour) {
        this.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {

            if ((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
              Color tmp = JColorChooser.showDialog(LegendPanel.this,
                "Select new Color", m_plotData.m_customColour);

              if (tmp != null) {
                m_plotData.m_customColour = tmp;
                m_legendText.setForeground(tmp);

                if (m_Repainters.size() > 0) {
                  for (int i = 0; i < m_Repainters.size(); i++) {
                    (m_Repainters.get(i)).repaint();
                  }
                }
                LegendPanel.this.repaint();
              }
            }
          }
        });
=======
      //      this.setBackground(Color.black);
      /*      this.setPreferredSize(new Dimension(0, 20));
	      this.setMinimumSize(new Dimension(0, 20)); */

      if (m_plotData.m_useCustomColour) {
	this.addMouseListener(new MouseAdapter() {
	    public void mouseClicked(MouseEvent e) {
	      
	      if ((e.getModifiers() & e.BUTTON1_MASK) == e.BUTTON1_MASK) {
		Color tmp = JColorChooser.showDialog
		  (LegendPanel.this, Messages.getInstance().getString("LegendPanel_Main_JColorChooserShowDialog_Text"), 
		   m_plotData.m_customColour);
		
		if (tmp != null) {
		  m_plotData.m_customColour = tmp;
		  m_legendText.setForeground(tmp);

		  if (m_Repainters.size() > 0) {
		    for (int i=0;i<m_Repainters.size();i++) {
		      ((Component)(m_Repainters.elementAt(i))).repaint();
		    }
		  }
		  LegendPanel.this.repaint();
		}
	      }
	    }
	  });
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      m_legendText = new JLabel(m_plotData.m_plotName);
      m_legendText.setToolTipText(m_plotData.getPlotNameHTML());
      if (m_plotData.m_useCustomColour) {
<<<<<<< HEAD
        m_legendText.setForeground(m_plotData.m_customColour);
      }
      this.setLayout(new BorderLayout());
      this.add(m_legendText, BorderLayout.CENTER);
      /*
       * GridBagLayout gb = new GridBagLayout(); GridBagConstraints constraints
       * = new GridBagConstraints(); constraints.fill =
       * GridBagConstraints.HORIZONTAL;
       * constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
       */
      m_pointShape = new JPanel() {
        private static final long serialVersionUID = -7048435221580488238L;

        @Override
        public void paintComponent(Graphics gx) {
          super.paintComponent(gx);
          if (!m_plotData.m_useCustomColour) {
            gx.setColor(Color.black);
          } else {
            gx.setColor(m_plotData.m_customColour);
          }
          Plot2D.drawDataPoint(10, 10, 3, m_dataIndex, gx);
        }
      };
      // m_pointShape.setBackground(Color.black);
=======
	m_legendText.setForeground(m_plotData.m_customColour);
      }
      this.setLayout(new BorderLayout());
      this.add(m_legendText, BorderLayout.CENTER);
      /*      GridBagLayout gb = new GridBagLayout();
      GridBagConstraints constraints = new GridBagConstraints();
      constraints.fill = GridBagConstraints.HORIZONTAL;
      constraints.gridx=0;constraints.gridy=0;constraints.weightx=5; */
      m_pointShape = new JPanel() {
	private static final long serialVersionUID = -7048435221580488238L;
	
	public void paintComponent(Graphics gx) {
	  super.paintComponent(gx);
	  if (!m_plotData.m_useCustomColour) {
	    gx.setColor(Color.black);
	  } else {
	    gx.setColor(m_plotData.m_customColour);
	  }
	  Plot2D.drawDataPoint(10,10,3,m_dataIndex,gx);
	}
      };
      //      m_pointShape.setBackground(Color.black);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      m_pointShape.setPreferredSize(new Dimension(20, 20));
      m_pointShape.setMinimumSize(new Dimension(20, 20));
      this.add(m_pointShape, BorderLayout.WEST);
    }
  }

  /**
   * Constructor
   */
  public LegendPanel() {
    this.setBackground(Color.blue);
    setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
  }

  /**
   * Set the list of plots to generate legend entries for
<<<<<<< HEAD
   * 
   * @param pl a list of plots
   */
  public void setPlotList(ArrayList<PlotData2D> pl) {
=======
   * @param pl a list of plots
   */
  public void setPlotList(FastVector pl) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_plots = pl;
    updateLegends();
  }

  /**
<<<<<<< HEAD
   * Adds a component that will need to be repainted if the user changes the
   * colour of a label.
   * 
   * @param c the component to be repainted
   */
  public void addRepaintNotify(Component c) {
    m_Repainters.add(c);
=======
   * Adds a component that will need to be repainted if the user
   * changes the colour of a label.
   * @param c the component to be repainted
   */
  public void addRepaintNotify(Component c) {
    m_Repainters.addElement(c);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Redraw the panel with the legend entries
   */
  private void updateLegends() {
    if (m_span == null) {
      m_span = new JPanel();
    }
<<<<<<< HEAD

    JPanel padder = new JPanel();
    JPanel padd2 = new JPanel();

    m_span.setPreferredSize(new Dimension(m_span.getPreferredSize().width,
      (m_plots.size() + 1) * 20));
    m_span.setMaximumSize(new Dimension(m_span.getPreferredSize().width,
      (m_plots.size() + 1) * 20));
=======
      
    JPanel padder = new JPanel();
    JPanel padd2 = new JPanel();

    m_span.setPreferredSize(new Dimension(m_span.getPreferredSize().width, 
					  (m_plots.size() + 1) * 20));
    m_span.setMaximumSize(new Dimension(m_span.getPreferredSize().width, 
					  (m_plots.size() + 1) * 20));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    LegendEntry tmp;

    GridBagLayout gb = new GridBagLayout();
    GridBagLayout gb2 = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    m_span.removeAll();

    padder.setLayout(gb);
    m_span.setLayout(gb2);
    constraints.anchor = GridBagConstraints.CENTER;
<<<<<<< HEAD
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.insets = new Insets(0, 0, 0, 0);
    padder.add(m_span, constraints);

    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.BOTH;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.weighty = 5;
    constraints.insets = new Insets(0, 0, 0, 0);
    padder.add(padd2, constraints);

    constraints.weighty = 0;
    setViewportView(padder);

    constraints.anchor = GridBagConstraints.CENTER;
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth = 1;
    constraints.gridheight = 1;
    constraints.weighty = 5;
    constraints.insets = new Insets(2, 4, 2, 4);
    // int numLines =
    // ((PlotData2D)m_plots.get(0)).getPlotName().split("<br>").length;
    for (int i = 0; i < m_plots.size(); i++) {
      tmp = new LegendEntry(m_plots.get(i), i);
      constraints.gridy = i;
      /*
       * constraints.gridheight = 1; if (numLines > 0) { constraints.gridheight
       * = (numLines + 2); }
       */
      m_span.add(tmp, constraints);
    }
=======
    constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;
    constraints.insets = new Insets(0, 0, 0, 0);
    padder.add(m_span, constraints);

    constraints.gridx=0;constraints.gridy=1;constraints.weightx=5;
    constraints.fill = GridBagConstraints.BOTH;
    constraints.gridwidth=1;constraints.gridheight=1;constraints.weighty=5;
    constraints.insets = new Insets(0, 0, 0, 0);
    padder.add(padd2, constraints);

    constraints.weighty=0;
    setViewportView(padder);

    constraints.anchor = GridBagConstraints.CENTER;
    constraints.gridx=0;constraints.gridy=0;constraints.weightx=5;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.gridwidth=1;constraints.gridheight=1;constraints.weighty=5;
    constraints.insets = new Insets(2,4,2,4);
    //int numLines = ((PlotData2D)m_plots.elementAt(0)).getPlotName().split("<br>").length;
     for (int i=0;i<m_plots.size();i++) {
       tmp = new LegendEntry((PlotData2D)m_plots.elementAt(i),i);
       constraints.gridy = i;
/*       constraints.gridheight = 1;
       if (numLines > 0) {
         constraints.gridheight = (numLines + 2);
       } */
       m_span.add(tmp, constraints);
     }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class
<<<<<<< HEAD
   * 
   * @param args a list of arff files
   */
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.err.println("Usage : weka.gui.visualize.LegendPanel "
          + "<dataset> [dataset2], [dataset3],...");
        System.exit(1);
      }

      final javax.swing.JFrame jf = new javax.swing.JFrame(
        "Weka Explorer: Legend");
      jf.setSize(100, 100);
=======
   * @param args a list of arff files
   */
  public static void main(String [] args) {
    try {
      if (args.length < 1) {
	System.err.println(Messages.getInstance().getString("LegendPanel_Main_Error_Text_First"));
	System.exit(1);
      }

      final javax.swing.JFrame jf = 
	new javax.swing.JFrame(Messages.getInstance().getString("LegendPanel_Main_JFrame_Text"));
      jf.setSize(100,100);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      jf.getContentPane().setLayout(new BorderLayout());
      final LegendPanel p2 = new LegendPanel();
      jf.getContentPane().add(p2, BorderLayout.CENTER);
      jf.addWindowListener(new java.awt.event.WindowAdapter() {
<<<<<<< HEAD
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          jf.dispose();
          System.exit(0);
        }
      });

      ArrayList<PlotData2D> plotList = new ArrayList<PlotData2D>();
      for (int j = 0; j < args.length; j++) {
        System.err.println("Loading instances from " + args[j]);
        java.io.Reader r = new java.io.BufferedReader(new java.io.FileReader(
          args[j]));
        Instances i = new Instances(r);
        PlotData2D tmp = new PlotData2D(i);
        if (j != 1) {
          tmp.m_useCustomColour = true;
          tmp.m_customColour = Color.red;
        }
        tmp.setPlotName(i.relationName());
        plotList.add(tmp);
      }

=======
	public void windowClosing(java.awt.event.WindowEvent e) {
	  jf.dispose();
	  System.exit(0);
	}
      });

      FastVector plotList = new FastVector();
      for (int j=0;j<args.length;j++) {
	System.err.println(Messages.getInstance().getString("LegendPanel_Main_Error_Text_Second") + args[j]);
	java.io.Reader r = new java.io.BufferedReader(
			   new java.io.FileReader(args[j]));
	Instances i = new Instances(r);
	PlotData2D tmp = new PlotData2D(i);
	if (j != 1) {
	  tmp.m_useCustomColour = true;
	  tmp.m_customColour = Color.red;
	}
	tmp.setPlotName(i.relationName());
	plotList.addElement(tmp);
      }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      p2.setPlotList(plotList);
      jf.setVisible(true);
    } catch (Exception ex) {
      System.err.println(ex.getMessage());
      ex.printStackTrace();
    }
  }
}
