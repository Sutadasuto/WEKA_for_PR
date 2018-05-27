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
 * BMPWriter.java
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2007-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.gui.visualize;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * This class takes any JComponent and outputs it to a BMP-file.
 * Scaling is by default disabled, since we always take a screenshot.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 7059 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class BMPWriter
  extends JComponentWriter {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** the background color. */
  protected Color m_Background;
  
  /**
   * initializes the object.
<<<<<<< HEAD
=======
=======
  /** the background color */
  protected Color m_Background;
  
  /**
   * initializes the object 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public BMPWriter() {
    super();
  }

  /**
<<<<<<< HEAD
   * initializes the object with the given Component.
=======
<<<<<<< HEAD
   * initializes the object with the given Component.
=======
   * initializes the object with the given Component
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param c		the component to print in the output format
   */
  public BMPWriter(JComponent c) {
    super(c);
  }

  /**
<<<<<<< HEAD
   * initializes the object with the given Component and filename.
=======
<<<<<<< HEAD
   * initializes the object with the given Component and filename.
=======
   * initializes the object with the given Component and filename
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param c		the component to print in the output format
   * @param f		the file to store the output in
   */
  public BMPWriter(JComponent c, File f) {
    super(c, f);
  }
  
  /**
<<<<<<< HEAD
   * further initialization.
=======
<<<<<<< HEAD
   * further initialization.
=======
   * further initialization 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void initialize() {
    super.initialize();
    
    setScalingEnabled(false);
  }

  /**
   * returns the name of the writer, to display in the FileChooser.
   * must be overridden in the derived class.
   * 
   * @return 		the name of the writer
   */
  public String getDescription() {
<<<<<<< HEAD
    return "BMP-Image";
=======
<<<<<<< HEAD
    return "BMP-Image";
=======
    return Messages.getInstance().getString("BMPWriter_GetDescription_Text");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
  
  /**
   * returns the extension (incl. ".") of the output format, to use in the
   * FileChooser. 
   * 
   * @return 		the file extension
   */
  public String getExtension() {
    return ".bmp";
  }
  
  /**
<<<<<<< HEAD
   * returns the current background color.
=======
<<<<<<< HEAD
   * returns the current background color.
=======
   * returns the current background color
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return		the current background color
   */
  public Color getBackground() {
    return m_Background;
  }
  
  /**
<<<<<<< HEAD
   * sets the background color to use in creating the BMP.
=======
<<<<<<< HEAD
   * sets the background color to use in creating the BMP.
=======
   * sets the background color to use in creating the JPEG
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param c 		the color to use for background
   */
  public void setBackground(Color c) {
    m_Background = c;
  }
  
  /**
<<<<<<< HEAD
   * generates the actual output.
=======
<<<<<<< HEAD
   * generates the actual output.
=======
   * generates the actual output
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws Exception	if something goes wrong
   */
  public void generateOutput() throws Exception {
    BufferedImage	bi;
    Graphics		g;

    bi = new BufferedImage(getComponent().getWidth(), getComponent().getHeight(), BufferedImage.TYPE_INT_RGB);
    g  = bi.getGraphics();
    g.setPaintMode();
    g.setColor(getBackground());
    if (g instanceof Graphics2D)
      ((Graphics2D) g).scale(getXScale(), getYScale());
    g.fillRect(0, 0, getComponent().getWidth(), getComponent().getHeight());
    getComponent().printAll(g);
    ImageIO.write(bi, "bmp", getFile());
  }
  
  /**
<<<<<<< HEAD
   * for testing only.
=======
<<<<<<< HEAD
   * for testing only.
=======
   * for testing only 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param args 	the commandline arguments
   * @throws Exception 	if something goes wrong
   */
  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    System.out.println("building TreeVisualizer...");
    weka.gui.treevisualizer.TreeBuild builder = new weka.gui.treevisualizer.TreeBuild();
    weka.gui.treevisualizer.NodePlace arrange = new weka.gui.treevisualizer.PlaceNode2();
    weka.gui.treevisualizer.Node top = builder.create(new java.io.StringReader("digraph atree { top [label=\"the top\"] a [label=\"the first node\"] b [label=\"the second nodes\"] c [label=\"comes off of first\"] top->a top->b b->c }"));
<<<<<<< HEAD
=======
=======
    System.out.println(Messages.getInstance().getString("BMPWriter_Main_Text_First"));
    weka.gui.treevisualizer.TreeBuild builder = new weka.gui.treevisualizer.TreeBuild();
    weka.gui.treevisualizer.NodePlace arrange = new weka.gui.treevisualizer.PlaceNode2();
    weka.gui.treevisualizer.Node top = builder.create(new java.io.StringReader(Messages.getInstance().getString("BMPWriter_Main_Text_Second")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    weka.gui.treevisualizer.TreeVisualizer tv = new weka.gui.treevisualizer.TreeVisualizer(null, top, arrange);
    tv.setSize(800 ,600);
    
    String filename = System.getProperty("java.io.tmpdir") + File.separator + "test.bmp";
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    System.out.println("outputting to '" + filename + "'...");
    toOutput(new BMPWriter(), tv, new File(filename));

    System.out.println("done!");
<<<<<<< HEAD
=======
=======
    System.out.println(Messages.getInstance().getString("BMPWriter_Main_Text_Third") + filename + Messages.getInstance().getString("BMPWriter_Main_Text_Fourth"));
    toOutput(new BMPWriter(), tv, new File(filename));

    System.out.println(Messages.getInstance().getString("BMPWriter_Main_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
