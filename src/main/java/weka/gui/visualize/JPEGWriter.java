<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/*
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
 */

/*
 *    JPEGWriter.java
 *    Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
 *
 */
<<<<<<< HEAD
=======
=======
 /*
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
  */

 /*
  *    JPEGWriter.java
  *    Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
  *
  */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

package weka.gui.visualize;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JComponent;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * This class takes any JComponent and outputs it to a JPEG-file. Scaling is by
 * default disabled, since we always take a screenshot.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10222 $
 */
public class JPEGWriter extends JComponentWriter {

  /** the quality of the image. */
  protected float m_Quality;

  /** the background color. */
  protected Color m_Background;

<<<<<<< HEAD
=======
=======
/** 
 * This class takes any JComponent and outputs it to a JPEG-file.
 * Scaling is by default disabled, since we always take a screenshot.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7059 $
 */
public class JPEGWriter
  extends JComponentWriter {
  
  /** the quality of the image. */
  protected float m_Quality;
  
  /** the background color. */
  protected Color m_Background;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * initializes the object.
   */
  public JPEGWriter() {
    super();
  }

  /**
   * initializes the object with the given Component.
   * 
<<<<<<< HEAD
   * @param c the component to print in the output format
=======
<<<<<<< HEAD
   * @param c the component to print in the output format
=======
   * @param c         the component to print in the output format
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public JPEGWriter(JComponent c) {
    super(c);
  }

  /**
   * initializes the object with the given Component and filename.
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param c the component to print in the output format
   * @param f the file to store the output in
   */
  public JPEGWriter(JComponent c, File f) {
    super(c, f);

    m_Quality = 1.0f;
    m_Background = Color.WHITE;
  }

  /**
   * further initialization.
   */
  @Override
  public void initialize() {
    super.initialize();

    m_Quality = 1.0f;
<<<<<<< HEAD
=======
=======
   * @param c         the component to print in the output format
   * @param f         the file to store the output in
   */
  public JPEGWriter(JComponent c, File f) {
    super(c, f);
    
    m_Quality    = 1.0f;
    m_Background = Color.WHITE;
  }
  
  /**
   * further initialization.
   */
  public void initialize() {
    super.initialize();
    
    m_Quality    = 1.0f;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_Background = Color.WHITE;
    setScalingEnabled(false);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * returns the name of the writer, to display in the FileChooser. must be
   * overridden in the derived class.
   * 
   * @return the name of the writer
   */
  @Override
  public String getDescription() {
    return "JPEG-Image";
  }

  /**
   * returns the extension (incl. ".") of the output format, to use in the
   * FileChooser. must be overridden in the derived class.
   * 
   * @return the file extension
   */
  @Override
  public String getExtension() {
    return ".jpg";
  }

<<<<<<< HEAD
=======
=======
   * returns the name of the writer, to display in the FileChooser.
   * must be overridden in the derived class.
   * 
   * @return the name of the writer
   */
  public String getDescription() {
    return Messages.getInstance().getString("JPEGWriter_GetDescription_Text");
  }
  
  /**
   * returns the extension (incl. ".") of the output format, to use in the
   * FileChooser. 
   * must be overridden in the derived class.
   * 
   * @return the file extension
   */
  public String getExtension() {
    return ".jpg";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * returns the current background color.
   * 
   * @return the current background color
   */
  public Color getBackground() {
    return m_Background;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * sets the background color to use in creating the JPEG.
   * 
   * @param c the color to use for background
   */
  public void setBackground(Color c) {
    m_Background = c;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * returns the quality the JPEG will be stored in.
   * 
   * @return the quality
   */
  public float getQuality() {
    return m_Quality;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * sets the quality the JPEG is saved in.
   * 
   * @param q the quality to use
   */
  public void setQuality(float q) {
    m_Quality = q;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * generates the actual output.
   * 
   * @throws Exception if something goes wrong
   */
  @Override
  public void generateOutput() throws Exception {
    BufferedImage bi;
    Graphics g;
    ImageWriter writer;
    Iterator<ImageWriter> iter;
    ImageOutputStream ios;
    ImageWriteParam param;

    // render image
    bi = new BufferedImage(getComponent().getWidth(), getComponent()
      .getHeight(), BufferedImage.TYPE_INT_RGB);
    g = bi.getGraphics();
    g.setPaintMode();
    g.setColor(getBackground());
    if (g instanceof Graphics2D) {
      ((Graphics2D) g).scale(getXScale(), getYScale());
    }
    g.fillRect(0, 0, getComponent().getWidth(), getComponent().getHeight());
    getComponent().printAll(g);

    // get jpeg writer
    writer = null;
    iter = ImageIO.getImageWritersByFormatName(getExtension().replace(".", ""));
    if (iter.hasNext()) {
      writer = iter.next();
    } else {
      throw new Exception("No writer available for " + getDescription() + "!");
    }
<<<<<<< HEAD
=======
=======
  
  /**
   * generates the actual output.
   * 
   * @throws Exception	if something goes wrong
   */
  public void generateOutput() throws Exception {
    BufferedImage	bi;
    Graphics		g;
    ImageWriter 	writer;
    Iterator 		iter;
    ImageOutputStream 	ios;
    ImageWriteParam 	param;

    // render image
    bi = new BufferedImage(getComponent().getWidth(), getComponent().getHeight(), BufferedImage.TYPE_INT_RGB);
    g  = bi.getGraphics();
    g.setPaintMode();
    g.setColor(getBackground());
    if (g instanceof Graphics2D)
      ((Graphics2D) g).scale(getXScale(), getYScale());
    g.fillRect(0, 0, getComponent().getWidth(), getComponent().getHeight());
    getComponent().printAll(g);
    
    // get jpeg writer
    writer = null;
    iter   = ImageIO.getImageWritersByFormatName(getExtension().replace(".", ""));
    if (iter.hasNext())
      writer = (ImageWriter) iter.next();
    else
      throw new Exception(Messages.getInstance().getString("JPEGWriter_GenerateOutput_Exception_Text_First") + getDescription() + Messages.getInstance().getString("JPEGWriter_GenerateOutput_Exception_Text_Second"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // prepare output file
    ios = ImageIO.createImageOutputStream(getFile());
    writer.setOutput(ios);

    // set the quality
    param = new JPEGImageWriteParam(Locale.getDefault());
<<<<<<< HEAD
    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
=======
<<<<<<< HEAD
    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
=======
    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT) ;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    param.setCompressionQuality(getQuality());

    // write the image
    writer.write(null, new IIOImage(bi, null, null), param);

    // cleanup
    ios.flush();
    writer.dispose();
<<<<<<< HEAD
    ios.close();
  }

=======
<<<<<<< HEAD
    ios.close();
  }

=======
    ios.close();    
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * for testing only.
   * 
   * @param args the commandline arguments
   * @throws Exception if something goes wrong
   */
  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    System.out.println("building TreeVisualizer...");
    weka.gui.treevisualizer.TreeBuild builder = new weka.gui.treevisualizer.TreeBuild();
    weka.gui.treevisualizer.NodePlace arrange = new weka.gui.treevisualizer.PlaceNode2();
    weka.gui.treevisualizer.Node top = builder
      .create(new java.io.StringReader(
        "digraph atree { top [label=\"the top\"] a [label=\"the first node\"] b [label=\"the second nodes\"] c [label=\"comes off of first\"] top->a top->b b->c }"));
    weka.gui.treevisualizer.TreeVisualizer tv = new weka.gui.treevisualizer.TreeVisualizer(
      null, top, arrange);
    tv.setSize(800, 600);

    String filename = System.getProperty("java.io.tmpdir") + File.separator
      + "test.jpg";
    System.out.println("outputting to '" + filename + "'...");
    toOutput(new JPEGWriter(), tv, new File(filename));

    System.out.println("done!");
<<<<<<< HEAD
=======
=======
    System.out.println(Messages.getInstance().getString("JPEGWriter_Main_Text_First"));
    weka.gui.treevisualizer.TreeBuild builder = new weka.gui.treevisualizer.TreeBuild();
    weka.gui.treevisualizer.NodePlace arrange = new weka.gui.treevisualizer.PlaceNode2();
    weka.gui.treevisualizer.Node top = builder.create(new java.io.StringReader(Messages.getInstance().getString("JPEGWriter_Main_Text_Second")));
    weka.gui.treevisualizer.TreeVisualizer tv = new weka.gui.treevisualizer.TreeVisualizer(null, top, arrange);
    tv.setSize(800 ,600);
    
    String filename = System.getProperty("java.io.tmpdir") + File.separator + "test.jpg";
    System.out.println(Messages.getInstance().getString("JPEGWriter_Main_Text_Third") + filename + Messages.getInstance().getString("JPEGWriter_Main_Text_Fourth"));
    toOutput(new JPEGWriter(), tv, new File(filename));

    System.out.println(Messages.getInstance().getString("JPEGWriter_Main_Text_Fifth"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
