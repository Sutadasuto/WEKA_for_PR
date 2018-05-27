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
 *    MultilayerPerceptron.java
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.classifiers.functions;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import weka.classifiers.Classifier;
import weka.classifiers.functions.neural.LinearUnit;
import weka.classifiers.functions.neural.NeuralConnection;
import weka.classifiers.functions.neural.NeuralNode;
import weka.classifiers.functions.neural.SigmoidUnit;
import weka.core.Capabilities;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Randomizable;
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;
import weka.core.WeightedInstancesHandler;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NominalToBinary;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.IterativeClassifier;
import weka.classifiers.functions.neural.LinearUnit;
import weka.classifiers.functions.neural.NeuralConnection;
import weka.classifiers.functions.neural.NeuralNode;
import weka.classifiers.functions.neural.SigmoidUnit;
import weka.core.*;
import weka.core.Capabilities.Capability;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NominalToBinary;

/**
 * <!-- globalinfo-start --> A Classifier that uses backpropagation to classify
 * instances.<br/>
 * This network can be built by hand, created by an algorithm or both. The
 * network can also be monitored and modified during training time. The nodes in
 * this network are all sigmoid (except for when the class is numeric in which
 * case the the output nodes become unthresholded linear units).
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -L &lt;learning rate&gt;
 *  Learning Rate for the backpropagation algorithm.
 *  (Value should be between 0 - 1, Default = 0.3).
 * </pre>
 * 
 * <pre>
 * -M &lt;momentum&gt;
 *  Momentum Rate for the backpropagation algorithm.
 *  (Value should be between 0 - 1, Default = 0.2).
 * </pre>
 * 
 * <pre>
 * -N &lt;number of epochs&gt;
 *  Number of epochs to train through.
 *  (Default = 500).
 * </pre>
 * 
 * <pre>
 * -V &lt;percentage size of validation set&gt;
 *  Percentage size of validation set to use to terminate
 *  training (if this is non zero it can pre-empt num of epochs.
 *  (Value should be between 0 - 100, Default = 0).
 * </pre>
 * 
 * <pre>
 * -S &lt;seed&gt;
 *  The value used to seed the random number generator
 *  (Value should be &gt;= 0 and and a long, Default = 0).
 * </pre>
 * 
 * <pre>
 * -E &lt;threshold for number of consequetive errors&gt;
 *  The consequetive number of errors allowed for validation
 *  testing before the netwrok terminates.
 *  (Value should be &gt; 0, Default = 20).
 * </pre>
 * 
 * <pre>
 * -G
 *  GUI will be opened.
 *  (Use this to bring up a GUI).
 * </pre>
 * 
 * <pre>
 * -A
 *  Autocreation of the network connections will NOT be done.
 *  (This will be ignored if -G is NOT set)
 * </pre>
 * 
 * <pre>
 * -B
 *  A NominalToBinary filter will NOT automatically be used.
 *  (Set this to not use a NominalToBinary filter).
 * </pre>
 * 
 * <pre>
 * -H &lt;comma seperated numbers for nodes on each layer&gt;
<<<<<<< HEAD
=======
=======
/** 
 <!-- globalinfo-start -->
 * A Classifier that uses backpropagation to classify instances.<br/>
 * This network can be built by hand, created by an algorithm or both. The network can also be monitored and modified during training time. The nodes in this network are all sigmoid (except for when the class is numeric in which case the the output nodes become unthresholded linear units).
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -L &lt;learning rate&gt;
 *  Learning Rate for the backpropagation algorithm.
 *  (Value should be between 0 - 1, Default = 0.3).</pre>
 * 
 * <pre> -M &lt;momentum&gt;
 *  Momentum Rate for the backpropagation algorithm.
 *  (Value should be between 0 - 1, Default = 0.2).</pre>
 * 
 * <pre> -N &lt;number of epochs&gt;
 *  Number of epochs to train through.
 *  (Default = 500).</pre>
 * 
 * <pre> -V &lt;percentage size of validation set&gt;
 *  Percentage size of validation set to use to terminate
 *  training (if this is non zero it can pre-empt num of epochs.
 *  (Value should be between 0 - 100, Default = 0).</pre>
 * 
 * <pre> -S &lt;seed&gt;
 *  The value used to seed the random number generator
 *  (Value should be &gt;= 0 and and a long, Default = 0).</pre>
 * 
 * <pre> -E &lt;threshold for number of consequetive errors&gt;
 *  The consequetive number of errors allowed for validation
 *  testing before the netwrok terminates.
 *  (Value should be &gt; 0, Default = 20).</pre>
 * 
 * <pre> -G
 *  GUI will be opened.
 *  (Use this to bring up a GUI).</pre>
 * 
 * <pre> -A
 *  Autocreation of the network connections will NOT be done.
 *  (This will be ignored if -G is NOT set)</pre>
 * 
 * <pre> -B
 *  A NominalToBinary filter will NOT automatically be used.
 *  (Set this to not use a NominalToBinary filter).</pre>
 * 
 * <pre> -H &lt;comma seperated numbers for nodes on each layer&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *  The hidden layers to be created for the network.
 *  (Value should be a list of comma separated Natural 
 *  numbers or the letters 'a' = (attribs + classes) / 2, 
 *  'i' = attribs, 'o' = classes, 't' = attribs .+ classes)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *  for wildcard values, Default = a).
 * </pre>
 * 
 * <pre>
 * -C
 *  Normalizing a numeric class will NOT be done.
 *  (Set this to not normalize the class if it's numeric).
 * </pre>
 * 
 * <pre>
 * -I
 *  Normalizing the attributes will NOT be done.
 *  (Set this to not normalize the attributes).
 * </pre>
 * 
 * <pre>
 * -R
 *  Reseting the network will NOT be allowed.
 *  (Set this to not allow the network to reset).
 * </pre>
 * 
 * <pre>
 * -D
 *  Learning rate decay will occur.
 *  (Set this to cause the learning rate to decay).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
 * @version $Revision: 14497 $
 */
public class MultilayerPerceptron extends AbstractClassifier implements
  OptionHandler, WeightedInstancesHandler, Randomizable, IterativeClassifier {

<<<<<<< HEAD
=======
=======
 *  for wildcard values, Default = a).</pre>
 * 
 * <pre> -C
 *  Normalizing a numeric class will NOT be done.
 *  (Set this to not normalize the class if it's numeric).</pre>
 * 
 * <pre> -I
 *  Normalizing the attributes will NOT be done.
 *  (Set this to not normalize the attributes).</pre>
 * 
 * <pre> -R
 *  Reseting the network will NOT be allowed.
 *  (Set this to not allow the network to reset).</pre>
 * 
 * <pre> -D
 *  Learning rate decay will occur.
 *  (Set this to cause the learning rate to decay).</pre>
 * 
 <!-- options-end -->
 *
 * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
 * @version $Revision: 10073 $
 */
public class MultilayerPerceptron 
  extends Classifier 
  implements OptionHandler, WeightedInstancesHandler, Randomizable {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  private static final long serialVersionUID = -5990607817048210779L;

  /**
   * Main method for testing this class.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param argv should contain command line options (see setOptions)
   */
  public static void main(String[] argv) {
    runClassifier(new MultilayerPerceptron(), argv);
  }

  /**
   * This inner class is used to connect the nodes in the network up to the data
   * that they are classifying, Note that objects of this class are only
   * suitable to go on the attribute side or class side of the network and not
   * both.
   */
  protected class NeuralEnd extends NeuralConnection {

    /** for serialization */
    static final long serialVersionUID = 7305185603191183338L;

    /**
     * the value that represents the instance value this node represents. For an
     * input it is the attribute number, for an output, if nominal it is the
     * class value.
     */
    private int m_link;

<<<<<<< HEAD
=======
=======
   *
   * @param argv should contain command line options (see setOptions)
   */
  public static void main(String [] argv) {
    runClassifier(new MultilayerPerceptron(), argv);
  }
  

  /** 
   * This inner class is used to connect the nodes in the network up to
   * the data that they are classifying, Note that objects of this class are
   * only suitable to go on the attribute side or class side of the network
   * and not both.
   */
  protected class NeuralEnd 
    extends NeuralConnection {
    
    /** for serialization */
    static final long serialVersionUID = 7305185603191183338L;
  
    /** 
     * the value that represents the instance value this node represents. 
     * For an input it is the attribute number, for an output, if nominal
     * it is the class value. 
     */
    private int m_link;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /** True if node is an input, False if it's an output. */
    private boolean m_input;

    /**
     * Constructor
     */
    public NeuralEnd(String id) {
      super(id);

      m_link = 0;
      m_input = true;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    }

    /**
     * Call this function to determine if the point at x,y is on the unit.
     * 
<<<<<<< HEAD
=======
=======
      
    }
  
    /**
     * Call this function to determine if the point at x,y is on the unit.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param g The graphics context for font size info.
     * @param x The x coord.
     * @param y The y coord.
     * @param w The width of the display.
     * @param h The height of the display.
     * @return True if the point is on the unit, false otherwise.
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public boolean onUnit(Graphics g, int x, int y, int w, int h) {

      FontMetrics fm = g.getFontMetrics();
      int l = (int) (m_x * w) - fm.stringWidth(m_id) / 2;
      int t = (int) (m_y * h) - fm.getHeight() / 2;
      if (x < l || x > l + fm.stringWidth(m_id) + 4 || y < t
        || y > t + fm.getHeight() + fm.getDescent() + 4) {
        return false;
      }
      return true;

    }

    /**
     * This will draw the node id to the graphics context.
     * 
<<<<<<< HEAD
=======
=======
    public boolean onUnit(Graphics g, int x, int y, int w, int h) {
      
      FontMetrics fm = g.getFontMetrics();
      int l = (int)(m_x * w) - fm.stringWidth(m_id) / 2;
      int t = (int)(m_y * h) - fm.getHeight() / 2;
      if (x < l || x > l + fm.stringWidth(m_id) + 4 
	  || y < t || y > t + fm.getHeight() + fm.getDescent() + 4) {
	return false;
      }
      return true;
      
    }
   

    /**
     * This will draw the node id to the graphics context.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param g The graphics context.
     * @param w The width of the drawing area.
     * @param h The height of the drawing area.
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public void drawNode(Graphics g, int w, int h) {

      if ((m_type & PURE_INPUT) == PURE_INPUT) {
        g.setColor(Color.green);
      } else {
        g.setColor(Color.orange);
      }

      FontMetrics fm = g.getFontMetrics();
      int l = (int) (m_x * w) - fm.stringWidth(m_id) / 2;
      int t = (int) (m_y * h) - fm.getHeight() / 2;
      g.fill3DRect(l, t, fm.stringWidth(m_id) + 4,
        fm.getHeight() + fm.getDescent() + 4, true);
      g.setColor(Color.black);

<<<<<<< HEAD
=======
=======
    public void drawNode(Graphics g, int w, int h) {
      
      if ((m_type & PURE_INPUT) == PURE_INPUT) {
	g.setColor(Color.green);
      }
      else {
	g.setColor(Color.orange);
      }
      
      FontMetrics fm = g.getFontMetrics();
      int l = (int)(m_x * w) - fm.stringWidth(m_id) / 2;
      int t = (int)(m_y * h) - fm.getHeight() / 2;
      g.fill3DRect(l, t, fm.stringWidth(m_id) + 4
		   , fm.getHeight() + fm.getDescent() + 4
		   , true);
      g.setColor(Color.black);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      g.drawString(m_id, l + 2, t + fm.getHeight() + 2);

    }

<<<<<<< HEAD
    /**
     * Call this function to draw the node highlighted.
     * 
=======
<<<<<<< HEAD
    /**
     * Call this function to draw the node highlighted.
     * 
=======

    /**
     * Call this function to draw the node highlighted.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param g The graphics context.
     * @param w The width of the drawing area.
     * @param h The height of the drawing area.
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    @Override
    public void drawHighlight(Graphics g, int w, int h) {

      g.setColor(Color.black);
      FontMetrics fm = g.getFontMetrics();
      int l = (int) (m_x * w) - fm.stringWidth(m_id) / 2;
      int t = (int) (m_y * h) - fm.getHeight() / 2;
      g.fillRect(l - 2, t - 2, fm.stringWidth(m_id) + 8,
        fm.getHeight() + fm.getDescent() + 8);
      drawNode(g, w, h);
    }

    /**
     * Call this to get the output value of this unit.
     * 
     * @param calculate True if the value should be calculated if it hasn't been
     *          already.
     * @return The output value, or NaN, if the value has not been calculated.
     */
    @Override
    public double outputValue(boolean calculate) {

      if (Double.isNaN(m_unitValue) && calculate) {
        if (m_input) {
          if (m_currentInstance.isMissing(m_link)) {
            m_unitValue = 0;
          } else {

            m_unitValue = m_currentInstance.value(m_link);
          }
        } else {
          // node is an output.
          m_unitValue = 0;
          for (int noa = 0; noa < m_numInputs; noa++) {
            m_unitValue += m_inputList[noa].outputValue(true);

          }
          if (m_numeric && m_normalizeClass) {
            // then scale the value;
            // this scales linearly from between -1 and 1
            m_unitValue = m_unitValue
              * m_attributeRanges[m_instances.classIndex()]
              + m_attributeBases[m_instances.classIndex()];
          }
        }
      }
      return m_unitValue;

    }

    /**
     * Call this to get the error value of this unit, which in this case is the
     * difference between the predicted class, and the actual class.
     * 
     * @param calculate True if the value should be calculated if it hasn't been
     *          already.
     * @return The error value, or NaN, if the value has not been calculated.
     */
    @Override
    public double errorValue(boolean calculate) {

      if (!Double.isNaN(m_unitValue) && Double.isNaN(m_unitError) && calculate) {

        if (m_input) {
          m_unitError = 0;
          for (int noa = 0; noa < m_numOutputs; noa++) {
            m_unitError += m_outputList[noa].errorValue(true);
          }
        } else {
          if (m_currentInstance.classIsMissing()) {
            m_unitError = .1;
          } else if (m_instances.classAttribute().isNominal()) {
            if (m_currentInstance.classValue() == m_link) {
              m_unitError = 1 - m_unitValue;
            } else {
              m_unitError = 0 - m_unitValue;
            }
          } else if (m_numeric) {

            if (m_normalizeClass) {
              if (m_attributeRanges[m_instances.classIndex()] == 0) {
                m_unitError = 0;
              } else {
                m_unitError = (m_currentInstance.classValue() - m_unitValue)
                  / m_attributeRanges[m_instances.classIndex()];
                // m_numericRange;

              }
            } else {
              m_unitError = m_currentInstance.classValue() - m_unitValue;
            }
          }
        }
      }
      return m_unitError;
    }

    /**
     * Call this to reset the value and error for this unit, ready for the next
     * run. This will also call the reset function of all units that are
     * connected as inputs to this one. This is also the time that the update
     * for the listeners will be performed.
     */
    @Override
    public void reset() {

      if (!Double.isNaN(m_unitValue) || !Double.isNaN(m_unitError)) {
        m_unitValue = Double.NaN;
        m_unitError = Double.NaN;
        m_weightsUpdated = false;
        for (int noa = 0; noa < m_numInputs; noa++) {
          m_inputList[noa].reset();
        }
      }
    }

    /**
     * Call this to have the connection save the current weights.
     */
    @Override
<<<<<<< HEAD
=======
=======
    public void drawHighlight(Graphics g, int w, int h) {
      
      g.setColor(Color.black);
      FontMetrics fm = g.getFontMetrics();
      int l = (int)(m_x * w) - fm.stringWidth(m_id) / 2;
      int t = (int)(m_y * h) - fm.getHeight() / 2;
      g.fillRect(l - 2, t - 2, fm.stringWidth(m_id) + 8
		 , fm.getHeight() + fm.getDescent() + 8); 
      drawNode(g, w, h);
    }
    
    /**
     * Call this to get the output value of this unit. 
     * @param calculate True if the value should be calculated if it hasn't 
     * been already.
     * @return The output value, or NaN, if the value has not been calculated.
     */
    public double outputValue(boolean calculate) {
     
      if (Double.isNaN(m_unitValue) && calculate) {
	if (m_input) {
	  if (m_currentInstance.isMissing(m_link)) {
	    m_unitValue = 0;
	  }
	  else {
	    
	    m_unitValue = m_currentInstance.value(m_link);
	  }
	}
	else {
	  //node is an output.
	  m_unitValue = 0;
	  for (int noa = 0; noa < m_numInputs; noa++) {
	    m_unitValue += m_inputList[noa].outputValue(true);
	   
	  }
	  if (m_numeric && m_normalizeClass) {
	    //then scale the value;
	    //this scales linearly from between -1 and 1
	    m_unitValue = m_unitValue * 
	      m_attributeRanges[m_instances.classIndex()] + 
	      m_attributeBases[m_instances.classIndex()];
	  }
	}
      }
      return m_unitValue;
      
      
    }
    
    /**
     * Call this to get the error value of this unit, which in this case is
     * the difference between the predicted class, and the actual class.
     * @param calculate True if the value should be calculated if it hasn't 
     * been already.
     * @return The error value, or NaN, if the value has not been calculated.
     */
    public double errorValue(boolean calculate) {
      
      if (!Double.isNaN(m_unitValue) && Double.isNaN(m_unitError) 
	  && calculate) {
	
	if (m_input) {
	  m_unitError = 0;
	  for (int noa = 0; noa < m_numOutputs; noa++) {
	    m_unitError += m_outputList[noa].errorValue(true);
	  }
	}
	else {
	  if (m_currentInstance.classIsMissing()) {
	    m_unitError = .1;  
	  }
	  else if (m_instances.classAttribute().isNominal()) {
	    if (m_currentInstance.classValue() == m_link) {
	      m_unitError = 1 - m_unitValue;
	    }
	    else {
	      m_unitError = 0 - m_unitValue;
	    }
	  }
	  else if (m_numeric) {
	    
	    if (m_normalizeClass) {
	      if (m_attributeRanges[m_instances.classIndex()] == 0) {
		m_unitError = 0;
	      }
	      else {
		m_unitError = (m_currentInstance.classValue() - m_unitValue ) /
		  m_attributeRanges[m_instances.classIndex()];
		//m_numericRange;
		
	      }
	    }
	    else {
	      m_unitError = m_currentInstance.classValue() - m_unitValue;
	    }
	  }
	}
      }
      return m_unitError;
    }
    
    
    /**
     * Call this to reset the value and error for this unit, ready for the next
     * run. This will also call the reset function of all units that are 
     * connected as inputs to this one.
     * This is also the time that the update for the listeners will be 
     * performed.
     */
    public void reset() {
      
      if (!Double.isNaN(m_unitValue) || !Double.isNaN(m_unitError)) {
	m_unitValue = Double.NaN;
	m_unitError = Double.NaN;
	m_weightsUpdated = false;
	for (int noa = 0; noa < m_numInputs; noa++) {
	  m_inputList[noa].reset();
	}
      }
    }
    
    /**
     * Call this to have the connection save the current
     * weights.
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public void saveWeights() {
      for (int i = 0; i < m_numInputs; i++) {
        m_inputList[i].saveWeights();
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Call this to have the connection restore from the saved weights.
     */
    @Override
<<<<<<< HEAD
=======
=======
    
    /**
     * Call this to have the connection restore from the saved
     * weights.
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public void restoreWeights() {
      for (int i = 0; i < m_numInputs; i++) {
        m_inputList[i].restoreWeights();
      }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Call this function to set What this end unit represents.
     * 
     * @param input True if this unit is used for entering an attribute, False
     *          if it's used for determining a class value.
     * @param val The attribute number or class type that this unit represents.
     *          (for nominal attributes).
     */
    public void setLink(boolean input, int val) throws Exception {
      m_input = input;

      if (input) {
        m_type = PURE_INPUT;
      } else {
        m_type = PURE_OUTPUT;
      }
      if (val < 0
        || (input && val > m_instances.numAttributes())
        || (!input && m_instances.classAttribute().isNominal() && val > m_instances
          .classAttribute().numValues())) {
        m_link = 0;
      } else {
        m_link = val;
      }
    }

<<<<<<< HEAD
=======
=======
    
    
    /** 
     * Call this function to set What this end unit represents.
     * @param input True if this unit is used for entering an attribute,
     * False if it's used for determining a class value.
     * @param val The attribute number or class type that this unit represents.
     * (for nominal attributes).
     */
    public void setLink(boolean input, int val) throws Exception {
      m_input = input;
      
      if (input) {
	m_type = PURE_INPUT;
      }
      else {
	m_type = PURE_OUTPUT;
      }
      if (val < 0 || (input && val > m_instances.numAttributes()) 
	  || (!input && m_instances.classAttribute().isNominal() 
	      && val > m_instances.classAttribute().numValues())) {
	m_link = 0;
      }
      else {
	m_link = val;
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * @return link for this node.
     */
    public int getLink() {
      return m_link;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 14497 $");
    }
  }

  /**
   * Inner class used to draw the nodes onto.(uses the node lists!!) This will
   * also handle the user input.
   */
  private class NodePanel extends JPanel implements RevisionHandler {

<<<<<<< HEAD
=======
=======
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 10073 $");
    }
  }
  

 
  /** Inner class used to draw the nodes onto.(uses the node lists!!) 
   * This will also handle the user input. */
  private class NodePanel 
    extends JPanel
    implements RevisionHandler {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /** for serialization */
    static final long serialVersionUID = -3067621833388149984L;

    /**
     * The constructor.
     */
    public NodePanel() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      addMouseListener(new MouseAdapter() {

        @Override
        public void mousePressed(MouseEvent e) {

          if (!m_stopped) {
            return;
          }
          if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == MouseEvent.BUTTON1_MASK
            && !e.isAltDown()) {
            Graphics g = NodePanel.this.getGraphics();
            int x = e.getX();
            int y = e.getY();
            int w = NodePanel.this.getWidth();
            int h = NodePanel.this.getHeight();
            ArrayList<NeuralConnection> tmp = new ArrayList<NeuralConnection>(4);
            for (int noa = 0; noa < m_numAttributes; noa++) {
              if (m_inputs[noa].onUnit(g, x, y, w, h)) {
                tmp.add(m_inputs[noa]);
                selection(
                  tmp,
                  (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
                  true);
                return;
              }
            }
            for (int noa = 0; noa < m_numClasses; noa++) {
              if (m_outputs[noa].onUnit(g, x, y, w, h)) {
                tmp.add(m_outputs[noa]);
                selection(
                  tmp,
                  (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
                  true);
                return;
              }
            }
            for (NeuralConnection m_neuralNode : m_neuralNodes) {
              if (m_neuralNode.onUnit(g, x, y, w, h)) {
                tmp.add(m_neuralNode);
                selection(
                  tmp,
                  (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
                  true);
                return;
              }

            }
            NeuralNode temp = new NeuralNode(String.valueOf(m_nextId),
              m_random, m_sigmoidUnit);
            m_nextId++;
            temp.setX((double) e.getX() / w);
            temp.setY((double) e.getY() / h);
            tmp.add(temp);
            addNode(temp);
            selection(
              tmp,
              (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
              true);
          } else {
            // then right click
            Graphics g = NodePanel.this.getGraphics();
            int x = e.getX();
            int y = e.getY();
            int w = NodePanel.this.getWidth();
            int h = NodePanel.this.getHeight();
            ArrayList<NeuralConnection> tmp = new ArrayList<NeuralConnection>(4);
            for (int noa = 0; noa < m_numAttributes; noa++) {
              if (m_inputs[noa].onUnit(g, x, y, w, h)) {
                tmp.add(m_inputs[noa]);
                selection(
                  tmp,
                  (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
                  false);
                return;
              }

            }
            for (int noa = 0; noa < m_numClasses; noa++) {
              if (m_outputs[noa].onUnit(g, x, y, w, h)) {
                tmp.add(m_outputs[noa]);
                selection(
                  tmp,
                  (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
                  false);
                return;
              }
            }
            for (NeuralConnection m_neuralNode : m_neuralNodes) {
              if (m_neuralNode.onUnit(g, x, y, w, h)) {
                tmp.add(m_neuralNode);
                selection(
                  tmp,
                  (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
                  false);
                return;
              }
            }
            selection(
              null,
              (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK,
              false);
          }
        }
      });
    }

    /**
     * This function gets called when the user has clicked something It will
     * amend the current selection or connect the current selection to the new
     * selection. Or if nothing was selected and the right button was used it
     * will delete the node.
     * 
<<<<<<< HEAD
=======
=======
      

      addMouseListener(new MouseAdapter() {
	  
	  public void mousePressed(MouseEvent e) {
	    
	    if (!m_stopped) {
	      return;
	    }
	    if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == MouseEvent.BUTTON1_MASK && 
		!e.isAltDown()) {
	      Graphics g = NodePanel.this.getGraphics();
	      int x = e.getX();
	      int y = e.getY();
	      int w = NodePanel.this.getWidth();
	      int h = NodePanel.this.getHeight();
	      FastVector tmp = new FastVector(4);
	      for (int noa = 0; noa < m_numAttributes; noa++) {
		if (m_inputs[noa].onUnit(g, x, y, w, h)) {
		  tmp.addElement(m_inputs[noa]);
		  selection(tmp, 
			    (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			    , true);
		  return;
		}
	      }
	      for (int noa = 0; noa < m_numClasses; noa++) {
		if (m_outputs[noa].onUnit(g, x, y, w, h)) {
		  tmp.addElement(m_outputs[noa]);
		  selection(tmp,
			    (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			    , true);
		  return;
		}
	      }
	      for (int noa = 0; noa < m_neuralNodes.length; noa++) {
		if (m_neuralNodes[noa].onUnit(g, x, y, w, h)) {
		  tmp.addElement(m_neuralNodes[noa]);
		  selection(tmp,
			    (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			    , true);
		  return;
		}

	      }
	      NeuralNode temp = new NeuralNode(String.valueOf(m_nextId), 
					       m_random, m_sigmoidUnit);
	      m_nextId++;
	      temp.setX((double)e.getX() / w);
	      temp.setY((double)e.getY() / h);
	      tmp.addElement(temp);
	      addNode(temp);
	      selection(tmp, (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			, true);
	    }
	    else {
	      //then right click
	      Graphics g = NodePanel.this.getGraphics();
	      int x = e.getX();
	      int y = e.getY();
	      int w = NodePanel.this.getWidth();
	      int h = NodePanel.this.getHeight();
	      FastVector tmp = new FastVector(4);
	      for (int noa = 0; noa < m_numAttributes; noa++) {
		if (m_inputs[noa].onUnit(g, x, y, w, h)) {
		  tmp.addElement(m_inputs[noa]);
		  selection(tmp, 
			    (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			    , false);
		  return;
		}
		
		
	      }
	      for (int noa = 0; noa < m_numClasses; noa++) {
		if (m_outputs[noa].onUnit(g, x, y, w, h)) {
		  tmp.addElement(m_outputs[noa]);
		  selection(tmp,
			    (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			    , false);
		  return;
		}
	      }
	      for (int noa = 0; noa < m_neuralNodes.length; noa++) {
		if (m_neuralNodes[noa].onUnit(g, x, y, w, h)) {
		  tmp.addElement(m_neuralNodes[noa]);
		  selection(tmp,
			    (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			    , false);
		  return;
		}
	      }
	      selection(null, (e.getModifiers() & MouseEvent.CTRL_MASK) == MouseEvent.CTRL_MASK
			, false);
	    }
	  }
	});
    }
    
    
    /**
     * This function gets called when the user has clicked something
     * It will amend the current selection or connect the current selection
     * to the new selection.
     * Or if nothing was selected and the right button was used it will 
     * delete the node.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * @param v The units that were selected.
     * @param ctrl True if ctrl was held down.
     * @param left True if it was the left mouse button.
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    private void selection(ArrayList<NeuralConnection> v, boolean ctrl,
      boolean left) {

      if (v == null) {
        // then unselect all.
        m_selected.clear();
        repaint();
        return;
      }

      // then exclusive or the new selection with the current one.
      if ((ctrl || m_selected.size() == 0) && left) {
        boolean removed = false;
        for (int noa = 0; noa < v.size(); noa++) {
          removed = false;
          for (int nob = 0; nob < m_selected.size(); nob++) {
            if (v.get(noa) == m_selected.get(nob)) {
              // then remove that element
              m_selected.remove(nob);
              removed = true;
              break;
            }
          }
          if (!removed) {
            m_selected.add(v.get(noa));
          }
        }
        repaint();
        return;
      }

      if (left) {
        // then connect the current selection to the new one.
        for (int noa = 0; noa < m_selected.size(); noa++) {
          for (int nob = 0; nob < v.size(); nob++) {
            NeuralConnection.connect(m_selected.get(noa), v.get(nob));
          }
        }
      } else if (m_selected.size() > 0) {
        // then disconnect the current selection from the new one.

        for (int noa = 0; noa < m_selected.size(); noa++) {
          for (int nob = 0; nob < v.size(); nob++) {
            NeuralConnection.disconnect(m_selected.get(noa), v.get(nob));

            NeuralConnection.disconnect(v.get(nob), m_selected.get(noa));

          }
        }
      } else {
        // then remove the selected node. (it was right clicked while
        // no other units were selected
        for (int noa = 0; noa < v.size(); noa++) {
          v.get(noa).removeAllInputs();
          v.get(noa).removeAllOutputs();
          removeNode(v.get(noa));
        }
<<<<<<< HEAD
=======
=======
    private void selection(FastVector v, boolean ctrl, boolean left) {
      
      if (v == null) {
	//then unselect all.
	m_selected.removeAllElements();
	repaint();
	return;
      }
      

      //then exclusive or the new selection with the current one.
      if ((ctrl || m_selected.size() == 0) && left) {
	boolean removed = false;
	for (int noa = 0; noa < v.size(); noa++) {
	  removed = false;
	  for (int nob = 0; nob < m_selected.size(); nob++) {
	    if (v.elementAt(noa) == m_selected.elementAt(nob)) {
	      //then remove that element
	      m_selected.removeElementAt(nob);
	      removed = true;
	      break;
	    }
	  }
	  if (!removed) {
	    m_selected.addElement(v.elementAt(noa));
	  }
	}
	repaint();
	return;
      }

      
      if (left) {
	//then connect the current selection to the new one.
	for (int noa = 0; noa < m_selected.size(); noa++) {
	  for (int nob = 0; nob < v.size(); nob++) {
	    NeuralConnection
	      .connect((NeuralConnection)m_selected.elementAt(noa)
		       , (NeuralConnection)v.elementAt(nob));
	  }
	}
      }
      else if (m_selected.size() > 0) {
	//then disconnect the current selection from the new one.
	
	for (int noa = 0; noa < m_selected.size(); noa++) {
	  for (int nob = 0; nob < v.size(); nob++) {
	    NeuralConnection
	      .disconnect((NeuralConnection)m_selected.elementAt(noa)
			  , (NeuralConnection)v.elementAt(nob));
	    
	    NeuralConnection
	      .disconnect((NeuralConnection)v.elementAt(nob)
			  , (NeuralConnection)m_selected.elementAt(noa));
	    
	  }
	}
      }
      else {
	//then remove the selected node. (it was right clicked while 
	//no other units were selected
	for (int noa = 0; noa < v.size(); noa++) {
	  ((NeuralConnection)v.elementAt(noa)).removeAllInputs();
	  ((NeuralConnection)v.elementAt(noa)).removeAllOutputs();
	  removeNode((NeuralConnection)v.elementAt(noa));
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      repaint();
    }

    /**
     * This will paint the nodes ontot the panel.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
     * 
     * @param g The graphics context.
     */
    @Override
<<<<<<< HEAD
=======
=======
     * @param g The graphics context.
     */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public void paintComponent(Graphics g) {

      super.paintComponent(g);
      int x = getWidth();
      int y = getHeight();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (25 * m_numAttributes > 25 * m_numClasses && 25 * m_numAttributes > y) {
        setSize(x, 25 * m_numAttributes);
      } else if (25 * m_numClasses > y) {
        setSize(x, 25 * m_numClasses);
      } else {
        setSize(x, y);
<<<<<<< HEAD
=======
=======
      if (25 * m_numAttributes > 25 * m_numClasses && 
	  25 * m_numAttributes > y) {
	setSize(x, 25 * m_numAttributes);
      }
      else if (25 * m_numClasses > y) {
	setSize(x, 25 * m_numClasses);
      }
      else {
	setSize(x, y);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }

      y = getHeight();
      for (int noa = 0; noa < m_numAttributes; noa++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_inputs[noa].drawInputLines(g, x, y);
      }
      for (int noa = 0; noa < m_numClasses; noa++) {
        m_outputs[noa].drawInputLines(g, x, y);
        m_outputs[noa].drawOutputLines(g, x, y);
      }
      for (NeuralConnection m_neuralNode : m_neuralNodes) {
        m_neuralNode.drawInputLines(g, x, y);
      }
      for (int noa = 0; noa < m_numAttributes; noa++) {
        m_inputs[noa].drawNode(g, x, y);
      }
      for (int noa = 0; noa < m_numClasses; noa++) {
        m_outputs[noa].drawNode(g, x, y);
      }
      for (NeuralConnection m_neuralNode : m_neuralNodes) {
        m_neuralNode.drawNode(g, x, y);
      }

      for (int noa = 0; noa < m_selected.size(); noa++) {
        m_selected.get(noa).drawHighlight(g, x, y);
      }
    }

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 14497 $");
    }
  }

  /**
   * This provides the basic controls for working with the neuralnetwork
   * 
   * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
   * @version $Revision: 14497 $
   */
  class ControlPanel extends JPanel implements RevisionHandler {

    /** for serialization */
    static final long serialVersionUID = 7393543302294142271L;

    /** The start stop button. */
    public JButton m_startStop;

    /** The button to accept the network (even if it hasn't done all epochs. */
    public JButton m_acceptButton;

    /** A label to state the number of epochs processed so far. */
    public JPanel m_epochsLabel;

    /** A label to state the total number of epochs to be processed. */
    public JLabel m_totalEpochsLabel;

    /** A text field to allow the changing of the total number of epochs. */
    public JTextField m_changeEpochs;

    /** A label to state the learning rate. */
    public JLabel m_learningLabel;

    /** A label to state the momentum. */
    public JLabel m_momentumLabel;

    /** A text field to allow the changing of the learning rate. */
    public JTextField m_changeLearning;

    /** A text field to allow the changing of the momentum. */
    public JTextField m_changeMomentum;

    /**
     * A label to state roughly the accuracy of the network.(because the
     * accuracy is calculated per epoch, but the network is changing throughout
     * each epoch train).
     */
    public JPanel m_errorLabel;

    /** The constructor. */
    public ControlPanel() {
      setBorder(BorderFactory.createTitledBorder("Controls"));

      m_totalEpochsLabel = new JLabel("Num Of Epochs  ");
      m_epochsLabel = new JPanel() {
        /** for serialization */
        private static final long serialVersionUID = 2562773937093221399L;

        @Override
        public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(m_controlPanel.m_totalEpochsLabel.getForeground());
          g.drawString("Epoch  " + m_epoch, 0, 10);
        }
      };
      m_epochsLabel.setFont(m_totalEpochsLabel.getFont());

      m_changeEpochs = new JTextField();
      m_changeEpochs.setText("" + m_numEpochs);
      m_errorLabel = new JPanel() {
        /** for serialization */
        private static final long serialVersionUID = 4390239056336679189L;

        @Override
        public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(m_controlPanel.m_totalEpochsLabel.getForeground());
          if (m_valSize == 0) {
            g.drawString(
              "Error per Epoch = " + Utils.doubleToString(m_error, 7), 0, 10);
          } else {
            g.drawString(
              "Validation Error per Epoch = "
                + Utils.doubleToString(m_error, 7), 0, 10);
          }
        }
      };
      m_errorLabel.setFont(m_epochsLabel.getFont());

<<<<<<< HEAD
=======
=======
	m_inputs[noa].drawInputLines(g, x, y);
      }
      for (int noa = 0; noa < m_numClasses; noa++) {
	m_outputs[noa].drawInputLines(g, x, y);
	m_outputs[noa].drawOutputLines(g, x, y);
      }
      for (int noa = 0; noa < m_neuralNodes.length; noa++) {
	m_neuralNodes[noa].drawInputLines(g, x, y);
      }
      for (int noa = 0; noa < m_numAttributes; noa++) {
	m_inputs[noa].drawNode(g, x, y);
      }
      for (int noa = 0; noa < m_numClasses; noa++) {
	m_outputs[noa].drawNode(g, x, y);
      }
      for (int noa = 0; noa < m_neuralNodes.length; noa++) {
	m_neuralNodes[noa].drawNode(g, x, y);
      }

      for (int noa = 0; noa < m_selected.size(); noa++) {
	((NeuralConnection)m_selected.elementAt(noa)).drawHighlight(g, x, y);
      }
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 10073 $");
    }
  }

  /** 
   * This provides the basic controls for working with the neuralnetwork
   * @author Malcolm Ware (mfw4@cs.waikato.ac.nz)
   * @version $Revision: 10073 $
   */
  class ControlPanel 
    extends JPanel
    implements RevisionHandler {
    
    /** for serialization */
    static final long serialVersionUID = 7393543302294142271L;
    
    /** The start stop button. */
    public JButton m_startStop;
    
    /** The button to accept the network (even if it hasn't done all epochs. */
    public JButton m_acceptButton;
    
    /** A label to state the number of epochs processed so far. */
    public JPanel m_epochsLabel;
    
    /** A label to state the total number of epochs to be processed. */
    public JLabel m_totalEpochsLabel;
    
    /** A text field to allow the changing of the total number of epochs. */
    public JTextField m_changeEpochs;
    
    /** A label to state the learning rate. */
    public JLabel m_learningLabel;
    
    /** A label to state the momentum. */
    public JLabel m_momentumLabel;
    
    /** A text field to allow the changing of the learning rate. */
    public JTextField m_changeLearning;
    
    /** A text field to allow the changing of the momentum. */
    public JTextField m_changeMomentum;
    
    /** A label to state roughly the accuracy of the network.(because the
	accuracy is calculated per epoch, but the network is changing 
	throughout each epoch train).
    */
    public JPanel m_errorLabel;
    
    /** The constructor. */
    public ControlPanel() { 
      setBorder(BorderFactory.createTitledBorder("Controls"));
      
      m_totalEpochsLabel = new JLabel("Num Of Epochs  ");
      m_epochsLabel = new JPanel(){ 
	  /** for serialization */
	  private static final long serialVersionUID = 2562773937093221399L;

	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.setColor(m_controlPanel.m_totalEpochsLabel.getForeground());
	    g.drawString("Epoch  " + m_epoch, 0, 10);
	  }
	};
      m_epochsLabel.setFont(m_totalEpochsLabel.getFont());
      
      m_changeEpochs = new JTextField();
      m_changeEpochs.setText("" + m_numEpochs);
      m_errorLabel = new JPanel(){
	  /** for serialization */
	  private static final long serialVersionUID = 4390239056336679189L;

	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.setColor(m_controlPanel.m_totalEpochsLabel.getForeground());
	    if (m_valSize == 0) {
	      g.drawString("Error per Epoch = " + 
			   Utils.doubleToString(m_error, 7), 0, 10);
	    }
	    else {
	      g.drawString("Validation Error per Epoch = "
			   + Utils.doubleToString(m_error, 7), 0, 10);
	    }
	  }
	};
      m_errorLabel.setFont(m_epochsLabel.getFont());
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_learningLabel = new JLabel("Learning Rate = ");
      m_momentumLabel = new JLabel("Momentum = ");
      m_changeLearning = new JTextField();
      m_changeMomentum = new JTextField();
      m_changeLearning.setText("" + m_learningRate);
      m_changeMomentum.setText("" + m_momentum);
      setLayout(new BorderLayout(15, 10));

      m_stopIt = true;
      m_accepted = false;
      m_startStop = new JButton("Start");
      m_startStop.setActionCommand("Start");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      m_acceptButton = new JButton("Accept");
      m_acceptButton.setActionCommand("Accept");

<<<<<<< HEAD
=======
=======
      
      m_acceptButton = new JButton("Accept");
      m_acceptButton.setActionCommand("Accept");
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      JPanel buttons = new JPanel();
      buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS));
      buttons.add(m_startStop);
      buttons.add(m_acceptButton);
      add(buttons, BorderLayout.WEST);
      JPanel data = new JPanel();
      data.setLayout(new BoxLayout(data, BoxLayout.Y_AXIS));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      Box ab = new Box(BoxLayout.X_AXIS);
      ab.add(m_epochsLabel);
      data.add(ab);

<<<<<<< HEAD
=======
=======
      
      Box ab = new Box(BoxLayout.X_AXIS);
      ab.add(m_epochsLabel);
      data.add(ab);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ab = new Box(BoxLayout.X_AXIS);
      Component b = Box.createGlue();
      ab.add(m_totalEpochsLabel);
      ab.add(m_changeEpochs);
      m_changeEpochs.setMaximumSize(new Dimension(200, 20));
      ab.add(b);
      data.add(ab);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      ab = new Box(BoxLayout.X_AXIS);
      ab.add(m_errorLabel);
      data.add(ab);

      add(data, BorderLayout.CENTER);

<<<<<<< HEAD
=======
=======
      
      ab = new Box(BoxLayout.X_AXIS);
      ab.add(m_errorLabel);
      data.add(ab);
      
      add(data, BorderLayout.CENTER);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      data = new JPanel();
      data.setLayout(new BoxLayout(data, BoxLayout.Y_AXIS));
      ab = new Box(BoxLayout.X_AXIS);
      b = Box.createGlue();
      ab.add(m_learningLabel);
      ab.add(m_changeLearning);
      m_changeLearning.setMaximumSize(new Dimension(200, 20));
      ab.add(b);
      data.add(ab);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ab = new Box(BoxLayout.X_AXIS);
      b = Box.createGlue();
      ab.add(m_momentumLabel);
      ab.add(m_changeMomentum);
      m_changeMomentum.setMaximumSize(new Dimension(200, 20));
      ab.add(b);
      data.add(ab);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      add(data, BorderLayout.EAST);

      m_startStop.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (e.getActionCommand().equals("Start")) {
            m_stopIt = false;
            m_startStop.setText("Stop");
            m_startStop.setActionCommand("Stop");
            int n = Integer.valueOf(m_changeEpochs.getText()).intValue();

            m_numEpochs = n;
            m_changeEpochs.setText("" + m_numEpochs);

            double m = Double.valueOf(m_changeLearning.getText()).doubleValue();
            setLearningRate(m);
            m_changeLearning.setText("" + m_learningRate);

            m = Double.valueOf(m_changeMomentum.getText()).doubleValue();
            setMomentum(m);
            m_changeMomentum.setText("" + m_momentum);

            blocker(false);
          } else if (e.getActionCommand().equals("Stop")) {
            m_stopIt = true;
            m_startStop.setText("Start");
            m_startStop.setActionCommand("Start");
          }
        }
      });

      m_acceptButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          m_accepted = true;
          blocker(false);
        }
      });

      m_changeEpochs.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          int n = Integer.valueOf(m_changeEpochs.getText()).intValue();
          if (n > 0) {
            m_numEpochs = n;
            blocker(false);
          }
        }
      });
    }

    /**
     * Returns the revision string.
     * 
     * @return the revision
     */
    @Override
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 14497 $");
    }
  }

  /**
   * a ZeroR model in case no model can be built from the data or the network
   * predicts all zeros for the classes
   */
<<<<<<< HEAD
=======
=======
      
      add(data, BorderLayout.EAST);
      
      m_startStop.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    if (e.getActionCommand().equals("Start")) {
	      m_stopIt = false;
	      m_startStop.setText("Stop");
	      m_startStop.setActionCommand("Stop");
	      int n = Integer.valueOf(m_changeEpochs.getText()).intValue();
	      
	      m_numEpochs = n;
	      m_changeEpochs.setText("" + m_numEpochs);
	      
	      double m=Double.valueOf(m_changeLearning.getText()).
		doubleValue();
	      setLearningRate(m);
	      m_changeLearning.setText("" + m_learningRate);
	      
	      m = Double.valueOf(m_changeMomentum.getText()).doubleValue();
	      setMomentum(m);
	      m_changeMomentum.setText("" + m_momentum);
	      
	      blocker(false);
	    }
	    else if (e.getActionCommand().equals("Stop")) {
	      m_stopIt = true;
	      m_startStop.setText("Start");
	      m_startStop.setActionCommand("Start");
	    }
	  }
	});
      
      m_acceptButton.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    m_accepted = true;
	    blocker(false);
	  }
	});
      
      m_changeEpochs.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
	    int n = Integer.valueOf(m_changeEpochs.getText()).intValue();
	    if (n > 0) {
	      m_numEpochs = n;
	      blocker(false);
	    }
	  }
	});
    }
    
    /**
     * Returns the revision string.
     * 
     * @return		the revision
     */
    public String getRevision() {
      return RevisionUtils.extract("$Revision: 10073 $");
    }
  }
  
  /** a ZeroR model in case no model can be built from the data 
   * or the network predicts all zeros for the classes */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private Classifier m_ZeroR;

  /** Whether to use the default ZeroR model */
  private boolean m_useDefaultModel = false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The training instances. */
  private Instances m_instances;

  /** The current instance running through the network. */
  private Instance m_currentInstance;

<<<<<<< HEAD
=======
=======
    
  /** The training instances. */
  private Instances m_instances;
  
  /** The current instance running through the network. */
  private Instance m_currentInstance;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** A flag to say that it's a numeric class. */
  private boolean m_numeric;

  /** The ranges for all the attributes. */
  private double[] m_attributeRanges;

  /** The base values for all the attributes. */
  private double[] m_attributeBases;

  /** The output units.(only feeds the errors, does no calcs) */
  private NeuralEnd[] m_outputs;

  /** The input units.(only feeds the inputs does no calcs) */
  private NeuralEnd[] m_inputs;

  /** All the nodes that actually comprise the logical neural net. */
  private NeuralConnection[] m_neuralNodes;

  /** The number of classes. */
  private int m_numClasses = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The number of attributes. */
  private int m_numAttributes = 0; // note the number doesn't include the class.

  /** The panel the nodes are displayed on. */
  private NodePanel m_nodePanel;

<<<<<<< HEAD
=======
=======
  
  /** The number of attributes. */
  private int m_numAttributes = 0; //note the number doesn't include the class.
  
  /** The panel the nodes are displayed on. */
  private NodePanel m_nodePanel;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The control panel. */
  private ControlPanel m_controlPanel;

  /** The next id number available for default naming. */
  private int m_nextId;
<<<<<<< HEAD

  /** A Vector list of the units currently selected. */
  private ArrayList<NeuralConnection> m_selected;
=======
<<<<<<< HEAD

  /** A Vector list of the units currently selected. */
  private ArrayList<NeuralConnection> m_selected;
=======
   
  /** A Vector list of the units currently selected. */
  private FastVector m_selected;

  /** A Vector list of the graphers. */
  private FastVector m_graphers;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The number of epochs to train through. */
  private int m_numEpochs;

  /** a flag to state if the network should be running, or stopped. */
  private boolean m_stopIt;

  /** a flag to state that the network has in fact stopped. */
  private boolean m_stopped;

  /** a flag to state that the network should be accepted the way it is. */
  private boolean m_accepted;
  /** The window for the network. */
  private JFrame m_win;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * A flag to tell the build classifier to automatically build a neural net.
   */
  private boolean m_autoBuild;

  /**
   * A flag to state that the gui for the network should be brought up. To allow
   * interaction while training.
   */
<<<<<<< HEAD
=======
=======
  /** A flag to tell the build classifier to automatically build a neural net.
   */
  private boolean m_autoBuild;

  /** A flag to state that the gui for the network should be brought up.
      To allow interaction while training. */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private boolean m_gui;

  /** An int to say how big the validation set should be. */
  private int m_valSize;

  /** The number to to use to quit on validation testing. */
  private int m_driftThreshold;

  /** The number used to seed the random number generator. */
  private int m_randomSeed;

  /** The actual random number generator. */
  private Random m_random;

  /** A flag to state that a nominal to binary filter should be used. */
  private boolean m_useNomToBin;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The actual filter. */
  private NominalToBinary m_nominalToBinaryFilter;

  /** The string that defines the hidden layers */
  private String m_hiddenLayers;

  /** This flag states that the user wants the input values normalized. */
  private boolean m_normalizeAttributes;

  /** This flag states that the user wants the learning rate to decay. */
  private boolean m_decay;

  /** This is the learning rate for the network. */
  private double m_learningRate;

  /** This is the momentum for the network. */
  private double m_momentum;

  /** Shows the number of the epoch that the network just finished. */
  private int m_epoch;

  /** Shows the error of the epoch that the network just finished. */
  private double m_error;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * This flag states that the user wants the network to restart if it is found
   * to be generating infinity or NaN for the error value. This would restart
   * the network with the current options except that the learning rate would be
   * smaller than before, (perhaps half of its current value). This option will
   * not be available if the gui is chosen (if the gui is open the user can fix
   * the network themselves, it is an architectural minefield for the network to
   * be reset with the gui open).
   */
  private boolean m_reset;

  /**
   * This flag states that the user wants the class to be normalized while
   * processing in the network is done. (the final answer will be in the
   * original range regardless). This option will only be used when the class is
   * numeric.
   */
  private boolean m_normalizeClass;

  /**
   * this is a sigmoid unit.
   */
  private final SigmoidUnit m_sigmoidUnit;

  /**
   * This is a linear unit.
   */
  private final LinearUnit m_linearUnit;

<<<<<<< HEAD
=======
=======
  /** This flag states that the user wants the network to restart if it
   * is found to be generating infinity or NaN for the error value. This
   * would restart the network with the current options except that the
   * learning rate would be smaller than before, (perhaps half of its current
   * value). This option will not be available if the gui is chosen (if the
   * gui is open the user can fix the network themselves, it is an 
   * architectural minefield for the network to be reset with the gui open). */
  private boolean m_reset;

  /** This flag states that the user wants the class to be normalized while
   * processing in the network is done. (the final answer will be in the
   * original range regardless). This option will only be used when the class
   * is numeric. */
  private boolean m_normalizeClass;

  /**
   * this is a sigmoid unit. 
   */
  private SigmoidUnit m_sigmoidUnit;
  
  /**
   * This is a linear unit.
   */
  private LinearUnit m_linearUnit;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * The constructor.
   */
  public MultilayerPerceptron() {
    m_instances = null;
    m_currentInstance = null;
    m_controlPanel = null;
    m_nodePanel = null;
    m_epoch = 0;
    m_error = 0;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_outputs = new NeuralEnd[0];
    m_inputs = new NeuralEnd[0];
    m_numAttributes = 0;
    m_numClasses = 0;
    m_neuralNodes = new NeuralConnection[0];
<<<<<<< HEAD
    m_selected = new ArrayList<NeuralConnection>(4);
=======
<<<<<<< HEAD
    m_selected = new ArrayList<NeuralConnection>(4);
=======
    m_selected = new FastVector(4);
    m_graphers = new FastVector(2);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_nextId = 0;
    m_stopIt = true;
    m_stopped = true;
    m_accepted = false;
    m_numeric = false;
    m_random = null;
    m_nominalToBinaryFilter = new NominalToBinary();
    m_sigmoidUnit = new SigmoidUnit();
    m_linearUnit = new LinearUnit();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // setting all the options to their defaults. To completely change these
    // defaults they will also need to be changed down the bottom in the
    // setoptions function (the text info in the accompanying functions should
    // also be changed to reflect the new defaults
<<<<<<< HEAD
=======
=======
    //setting all the options to their defaults. To completely change these
    //defaults they will also need to be changed down the bottom in the 
    //setoptions function (the text info in the accompanying functions should 
    //also be changed to reflect the new defaults
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_normalizeClass = true;
    m_normalizeAttributes = true;
    m_autoBuild = true;
    m_gui = false;
    m_useNomToBin = true;
    m_driftThreshold = 20;
    m_numEpochs = 500;
    m_valSize = 0;
    m_randomSeed = 0;
    m_hiddenLayers = "a";
    m_learningRate = .3;
    m_momentum = .2;
    m_reset = true;
    m_decay = false;
  }

  /**
   * @param d True if the learning rate should decay.
   */
  public void setDecay(boolean d) {
    m_decay = d;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return the flag for having the learning rate decay.
   */
  public boolean getDecay() {
    return m_decay;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This sets the network up to be able to reset itself with the current
   * settings and the learning rate at half of what it is currently. This will
   * only happen if the network creates NaN or infinite errors. Also this will
   * continue to happen until the network is trained properly. The learning rate
   * will also get set back to it's original value at the end of this. This can
   * only be set to true if the GUI is not brought up.
   * 
   * @param r True if the network should restart with it's current options and
   *          set the learning rate to half what it currently is.
<<<<<<< HEAD
=======
=======
   * This sets the network up to be able to reset itself with the current 
   * settings and the learning rate at half of what it is currently. This
   * will only happen if the network creates NaN or infinite errors. Also this
   * will continue to happen until the network is trained properly. The 
   * learning rate will also get set back to it's original value at the end of
   * this. This can only be set to true if the GUI is not brought up.
   * @param r True if the network should restart with it's current options
   * and set the learning rate to half what it currently is.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setReset(boolean r) {
    if (m_gui) {
      r = false;
    }
    m_reset = r;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * @return The flag for reseting the network.
   */
  public boolean getReset() {
    return m_reset;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * @param c True if the class should be normalized (the class will only ever
   *          be normalized if it is numeric). (Normalization puts the range
   *          between -1 - 1).
<<<<<<< HEAD
=======
=======
  
  /**
   * @param c True if the class should be normalized (the class will only ever
   * be normalized if it is numeric). (Normalization puts the range between
   * -1 - 1).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setNormalizeNumericClass(boolean c) {
    m_normalizeClass = c;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return The flag for normalizing a numeric class.
   */
  public boolean getNormalizeNumericClass() {
    return m_normalizeClass;
  }

  /**
   * @param a True if the attributes should be normalized (even nominal
<<<<<<< HEAD
   *          attributes will get normalized here) (range goes between -1 - 1).
=======
<<<<<<< HEAD
   *          attributes will get normalized here) (range goes between -1 - 1).
=======
   * attributes will get normalized here) (range goes between -1 - 1).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setNormalizeAttributes(boolean a) {
    m_normalizeAttributes = a;
  }

  /**
   * @return The flag for normalizing attributes.
   */
  public boolean getNormalizeAttributes() {
    return m_normalizeAttributes;
  }

  /**
<<<<<<< HEAD
   * @param f True if a nominalToBinary filter should be used on the data.
=======
<<<<<<< HEAD
   * @param f True if a nominalToBinary filter should be used on the data.
=======
   * @param f True if a nominalToBinary filter should be used on the
   * data.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setNominalToBinaryFilter(boolean f) {
    m_useNomToBin = f;
  }

  /**
   * @return The flag for nominal to binary filter use.
   */
  public boolean getNominalToBinaryFilter() {
    return m_useNomToBin;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This seeds the random number generator, that is used when a random number
   * is needed for the network.
   * 
   * @param l The seed.
   */
  @Override
<<<<<<< HEAD
=======
=======
   * This seeds the random number generator, that is used when a random
   * number is needed for the network.
   * @param l The seed.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setSeed(int l) {
    if (l >= 0) {
      m_randomSeed = l;
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * @return The seed for the random number generator.
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  /**
   * @return The seed for the random number generator.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public int getSeed() {
    return m_randomSeed;
  }

  /**
   * This sets the threshold to use for when validation testing is being done.
<<<<<<< HEAD
   * It works by ending testing once the error on the validation set has
   * consecutively increased a certain number of times.
   * 
=======
<<<<<<< HEAD
   * It works by ending testing once the error on the validation set has
   * consecutively increased a certain number of times.
   * 
=======
   * It works by ending testing once the error on the validation set has 
   * consecutively increased a certain number of times.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param t The threshold to use for this.
   */
  public void setValidationThreshold(int t) {
    if (t > 0) {
      m_driftThreshold = t;
    }
  }

  /**
   * @return The threshold used for validation testing.
   */
  public int getValidationThreshold() {
    return m_driftThreshold;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * The learning rate can be set using this command. NOTE That this is a static
   * variable so it affect all networks that are running. Must be greater than 0
   * and no more than 1.
   * 
   * @param l The New learning rate.
<<<<<<< HEAD
=======
=======
  
  /**
   * The learning rate can be set using this command.
   * NOTE That this is a static variable so it affect all networks that are
   * running.
   * Must be greater than 0 and no more than 1.
   * @param l The New learning rate. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setLearningRate(double l) {
    if (l > 0 && l <= 1) {
      m_learningRate = l;
<<<<<<< HEAD

      if (m_controlPanel != null) {
        m_controlPanel.m_changeLearning.setText("" + l);
=======
<<<<<<< HEAD

      if (m_controlPanel != null) {
        m_controlPanel.m_changeLearning.setText("" + l);
=======
    
      if (m_controlPanel != null) {
	m_controlPanel.m_changeLearning.setText("" + l);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * @return The learning rate for the nodes.
   */
  public double getLearningRate() {
    return m_learningRate;
  }

  /**
<<<<<<< HEAD
   * The momentum can be set using this command. THE same conditions apply to
   * this as to the learning rate.
   * 
=======
<<<<<<< HEAD
   * The momentum can be set using this command. THE same conditions apply to
   * this as to the learning rate.
   * 
=======
   * The momentum can be set using this command.
   * THE same conditions apply to this as to the learning rate.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param m The new Momentum.
   */
  public void setMomentum(double m) {
    if (m >= 0 && m <= 1) {
      m_momentum = m;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      if (m_controlPanel != null) {
        m_controlPanel.m_changeMomentum.setText("" + m);
      }
    }
  }

<<<<<<< HEAD
=======
=======
  
      if (m_controlPanel != null) {
	m_controlPanel.m_changeMomentum.setText("" + m);
      }
    }
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return The momentum for the nodes.
   */
  public double getMomentum() {
    return m_momentum;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This will set whether the network is automatically built or if it is left
   * up to the user. (there is nothing to stop a user from altering an autobuilt
   * network however).
   * 
<<<<<<< HEAD
=======
=======
   * This will set whether the network is automatically built
   * or if it is left up to the user. (there is nothing to stop a user
   * from altering an autobuilt network however). 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param a True if the network should be auto built.
   */
  public void setAutoBuild(boolean a) {
    if (!m_gui) {
      a = true;
    }
    m_autoBuild = a;
  }

  /**
   * @return The auto build state.
   */
  public boolean getAutoBuild() {
    return m_autoBuild;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * This will set what the hidden layers are made up of when auto build is
   * enabled. Note to have no hidden units, just put a single 0, Any more 0's
   * will indicate that the string is badly formed and make it unaccepted.
<<<<<<< HEAD
=======
=======

  /**
   * This will set what the hidden layers are made up of when auto build is
   * enabled. Note to have no hidden units, just put a single 0, Any more
   * 0's will indicate that the string is badly formed and make it unaccepted.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Negative numbers, and floats will do the same. There are also some
   * wildcards. These are 'a' = (number of attributes + number of classes) / 2,
   * 'i' = number of attributes, 'o' = number of classes, and 't' = number of
   * attributes + number of classes.
<<<<<<< HEAD
   * 
   * @param h A string with a comma seperated list of numbers. Each number is
   *          the number of nodes to be on a hidden layer.
=======
<<<<<<< HEAD
   * 
   * @param h A string with a comma seperated list of numbers. Each number is
   *          the number of nodes to be on a hidden layer.
=======
   * @param h A string with a comma seperated list of numbers. Each number is 
   * the number of nodes to be on a hidden layer.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setHiddenLayers(String h) {
    String tmp = "";
    StringTokenizer tok = new StringTokenizer(h, ",");
    if (tok.countTokens() == 0) {
      return;
    }
    double dval;
    int val;
    String c;
    boolean first = true;
    while (tok.hasMoreTokens()) {
      c = tok.nextToken().trim();

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (c.equals("a") || c.equals("i") || c.equals("o") || c.equals("t")) {
        tmp += c;
      } else {
        dval = Double.valueOf(c).doubleValue();
        val = (int) dval;

        if ((val == dval && (val != 0 || (tok.countTokens() == 0 && first)) && val >= 0)) {
          tmp += val;
        } else {
          return;
        }
      }

      first = false;
      if (tok.hasMoreTokens()) {
        tmp += ", ";
<<<<<<< HEAD
      }
    }
=======
=======
      if (c.equals("a") || c.equals("i") || c.equals("o") || 
	       c.equals("t")) {
	tmp += c;
      }
      else {
	dval = Double.valueOf(c).doubleValue();
	val = (int)dval;
	
	if ((val == dval && (val != 0 || (tok.countTokens() == 0 && first)) && 
	     val >= 0)) {
	  tmp += val;
	}
	else {
	  return;
	}
      }
      
      first = false;
      if (tok.hasMoreTokens()) {
	tmp += ", ";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_hiddenLayers = tmp;
  }

  /**
   * @return A string representing the hidden layers, each number is the number
<<<<<<< HEAD
   *         of nodes on a hidden layer.
=======
<<<<<<< HEAD
   *         of nodes on a hidden layer.
=======
   * of nodes on a hidden layer.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getHiddenLayers() {
    return m_hiddenLayers;
  }

  /**
   * This will set whether A GUI is brought up to allow interaction by the user
   * with the neural network during training.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param a True if gui should be created.
   */
  public void setGUI(boolean a) {
    m_gui = a;
    if (!a) {
      setAutoBuild(true);
<<<<<<< HEAD

    } else {
=======
<<<<<<< HEAD

    } else {
=======
      
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      setReset(false);
    }
  }

  /**
   * @return The true if should show gui.
   */
  public boolean getGUI() {
    return m_gui;
  }

  /**
   * This will set the size of the validation set.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param a The size of the validation set, as a percentage of the whole.
   */
  public void setValidationSetSize(int a) {
    if (a < 0 || a > 99) {
      return;
    }
    m_valSize = a;
  }

  /**
   * @return The percentage size of the validation set.
   */
  public int getValidationSetSize() {
    return m_valSize;
  }

<<<<<<< HEAD
  /**
   * Set the number of training epochs to perform. Must be greater than 0.
   * 
=======
<<<<<<< HEAD
  /**
   * Set the number of training epochs to perform. Must be greater than 0.
   * 
=======
  
  
  
  /**
   * Set the number of training epochs to perform.
   * Must be greater than 0.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param n The number of epochs to train through.
   */
  public void setTrainingTime(int n) {
    if (n > 0) {
      m_numEpochs = n;
    }
  }

  /**
   * @return The number of epochs to train through.
   */
  public int getTrainingTime() {
    return m_numEpochs;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Call this function to place a node into the network list.
   * 
   * @param n The node to place in the list.
   */
  private void addNode(NeuralConnection n) {

<<<<<<< HEAD
=======
=======
  
  /**
   * Call this function to place a node into the network list.
   * @param n The node to place in the list.
   */
  private void addNode(NeuralConnection n) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    NeuralConnection[] temp1 = new NeuralConnection[m_neuralNodes.length + 1];
    for (int noa = 0; noa < m_neuralNodes.length; noa++) {
      temp1[noa] = m_neuralNodes[noa];
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    temp1[temp1.length - 1] = n;
    m_neuralNodes = temp1;
  }

  /**
   * Call this function to remove the passed node from the list. This will only
   * remove the node if it is in the neuralnodes list.
   * 
<<<<<<< HEAD
=======
=======
    temp1[temp1.length-1] = n;
    m_neuralNodes = temp1;
  }

  /** 
   * Call this function to remove the passed node from the list.
   * This will only remove the node if it is in the neuralnodes list.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param n The neuralConnection to remove.
   * @return True if removed false if not (because it wasn't there).
   */
  private boolean removeNode(NeuralConnection n) {
    NeuralConnection[] temp1 = new NeuralConnection[m_neuralNodes.length - 1];
    int skip = 0;
    for (int noa = 0; noa < m_neuralNodes.length; noa++) {
      if (n == m_neuralNodes[noa]) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        skip++;
      } else if (!((noa - skip) >= temp1.length)) {
        temp1[noa - skip] = m_neuralNodes[noa];
      } else {
        return false;
<<<<<<< HEAD
=======
=======
	skip++;
      }
      else if (!((noa - skip) >= temp1.length)) {
	temp1[noa - skip] = m_neuralNodes[noa];
      }
      else {
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_neuralNodes = temp1;
    return true;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This function sets what the m_numeric flag to represent the passed class it
   * also performs the normalization of the attributes if applicable and sets up
   * the info to normalize the class. (note that regardless of the options it
   * will fill an array with the range and base, set to normalize all attributes
   * and the class to be between -1 and 1)
   * 
   * @param inst the instances.
   * @return The modified instances. This needs to be done. If the attributes
   *         are normalized then deep copies will be made of all the instances
   *         which will need to be passed back out.
<<<<<<< HEAD
=======
=======
   * This function sets what the m_numeric flag to represent the passed class
   * it also performs the normalization of the attributes if applicable
   * and sets up the info to normalize the class. (note that regardless of
   * the options it will fill an array with the range and base, set to 
   * normalize all attributes and the class to be between -1 and 1)
   * @param inst the instances.
   * @return The modified instances. This needs to be done. If the attributes
   * are normalized then deep copies will be made of all the instances which
   * will need to be passed back out.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  private Instances setClassType(Instances inst) throws Exception {
    if (inst != null) {
      // x bounds
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_attributeRanges = new double[inst.numAttributes()];
      m_attributeBases = new double[inst.numAttributes()];
      for (int noa = 0; noa < inst.numAttributes(); noa++) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < inst.numInstances(); i++) {
          if (!inst.instance(i).isMissing(noa)) {
            double value = inst.instance(i).value(noa);
            if (value < min) {
              min = value;
            }
            if (value > max) {
              max = value;
            }
          }
        }
        m_attributeRanges[noa] = (max - min) / 2;
        m_attributeBases[noa] = (max + min) / 2;
      }

      if (m_normalizeAttributes) {
        for (int i = 0; i < inst.numInstances(); i++) {
          Instance currentInstance = inst.instance(i);
          double[] instance = new double[inst.numAttributes()];
          for (int noa = 0; noa < inst.numAttributes(); noa++) {
            if (noa != inst.classIndex()) {
              if (m_attributeRanges[noa] != 0) {
                instance[noa] = (currentInstance.value(noa) - m_attributeBases[noa]) / m_attributeRanges[noa];
              } else {
                instance[noa] = currentInstance.value(noa) - m_attributeBases[noa];
              }
            } else {
              instance[noa] = currentInstance.value(noa);
            }
          }
          inst.set(i, new DenseInstance(currentInstance.weight(), instance));
        }
      }

      if (inst.classAttribute().isNumeric()) {
        m_numeric = true;
      } else {
        m_numeric = false;
<<<<<<< HEAD
=======
=======
      double min=Double.POSITIVE_INFINITY;
      double max=Double.NEGATIVE_INFINITY;
      double value;
      m_attributeRanges = new double[inst.numAttributes()];
      m_attributeBases = new double[inst.numAttributes()];
      for (int noa = 0; noa < inst.numAttributes(); noa++) {
	min = Double.POSITIVE_INFINITY;
	max = Double.NEGATIVE_INFINITY;
	for (int i=0; i < inst.numInstances();i++) {
	  if (!inst.instance(i).isMissing(noa)) {
	    value = inst.instance(i).value(noa);
	    if (value < min) {
	      min = value;
	    }
	    if (value > max) {
	      max = value;
	    }
	  }
	}
	
	m_attributeRanges[noa] = (max - min) / 2;
	m_attributeBases[noa] = (max + min) / 2;
	if (noa != inst.classIndex() && m_normalizeAttributes) {
	  for (int i = 0; i < inst.numInstances(); i++) {
	    if (m_attributeRanges[noa] != 0) {
	      inst.instance(i).setValue(noa, (inst.instance(i).value(noa)  
					      - m_attributeBases[noa]) /
					m_attributeRanges[noa]);
	    }
	    else {
	      inst.instance(i).setValue(noa, inst.instance(i).value(noa) - 
					m_attributeBases[noa]);
	    }
	  }
	}
      }
      if (inst.classAttribute().isNumeric()) {
	m_numeric = true;
      }
      else {
	m_numeric = false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return inst;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * A function used to stop the code that called buildclassifier from
   * continuing on before the user has finished the decision tree.
   * 
   * @param tf True to stop the thread, False to release the thread that is
   *          waiting there (if one).
<<<<<<< HEAD
=======
=======
   * A function used to stop the code that called buildclassifier
   * from continuing on before the user has finished the decision tree.
   * @param tf True to stop the thread, False to release the thread that is
   * waiting there (if one).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public synchronized void blocker(boolean tf) {
    if (tf) {
      try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        wait();
      } catch (InterruptedException e) {
      }
    } else {
<<<<<<< HEAD
=======
=======
	wait();
      } catch(InterruptedException e) {
      }
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      notifyAll();
    }
  }

  /**
   * Call this function to update the control panel for the gui.
   */
  private void updateDisplay() {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_gui) {
      m_controlPanel.m_errorLabel.repaint();
      m_controlPanel.m_epochsLabel.repaint();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * this will reset all the nodes in the network.
   */
  private void resetNetwork() {
    for (int noc = 0; noc < m_numClasses; noc++) {
      m_outputs[noc].reset();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * This will cause the output values of all the nodes to be calculated. Note
   * that the m_currentInstance is used to calculate these values.
   */
  private void calculateOutputs() {
    for (int noc = 0; noc < m_numClasses; noc++) {
      // get the values.
<<<<<<< HEAD
=======
=======
  
  /**
   * This will cause the output values of all the nodes to be calculated.
   * Note that the m_currentInstance is used to calculate these values.
   */
  private void calculateOutputs() {
    for (int noc = 0; noc < m_numClasses; noc++) {	
      //get the values. 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_outputs[noc].outputValue(true);
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * This will cause the error values to be calculated for all nodes. Note that
   * the m_currentInstance is used to calculate these values. Also the output
   * values should have been calculated first.
   * 
   * @return The squared error.
   */
  private double calculateErrors() throws Exception {
    double ret = 0, temp = 0;
    for (int noc = 0; noc < m_numAttributes; noc++) {
      // get the errors.
      m_inputs[noc].errorValue(true);

<<<<<<< HEAD
=======
=======
   * This will cause the error values to be calculated for all nodes.
   * Note that the m_currentInstance is used to calculate these values.
   * Also the output values should have been calculated first.
   * @return The squared error.
   */
  private double calculateErrors() throws Exception {
    double ret = 0, temp = 0; 
    for (int noc = 0; noc < m_numAttributes; noc++) {
      //get the errors.
      m_inputs[noc].errorValue(true);
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    for (int noc = 0; noc < m_numClasses; noc++) {
      temp = m_outputs[noc].errorValue(false);
      ret += temp * temp;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return ret;

  }

  /**
   * This will cause the weight values to be updated based on the learning rate,
   * momentum and the errors that have been calculated for each node.
   * 
<<<<<<< HEAD
=======
=======
    }    
    return ret;
    
  }

  /**
   * This will cause the weight values to be updated based on the learning
   * rate, momentum and the errors that have been calculated for each node.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param l The learning rate to update with.
   * @param m The momentum to update with.
   */
  private void updateNetworkWeights(double l, double m) {
    for (int noc = 0; noc < m_numClasses; noc++) {
<<<<<<< HEAD
      // update weights
=======
<<<<<<< HEAD
      // update weights
=======
      //update weights
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_outputs[noc].updateWeights(l, m);
    }

  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * This creates the required input units.
   */
  private void setupInputs() throws Exception {
    m_inputs = new NeuralEnd[m_numAttributes];
    int now = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int noa = 0; noa < m_numAttributes + 1; noa++) {
      if (m_instances.classIndex() != noa) {
        m_inputs[noa - now] = new NeuralEnd(m_instances.attribute(noa).name());

        m_inputs[noa - now].setX(.1);
        m_inputs[noa - now].setY((noa - now + 1.0) / (m_numAttributes + 1));
        m_inputs[noa - now].setLink(true, noa);
      } else {
        now = 1;
<<<<<<< HEAD
=======
=======
    for (int noa = 0; noa < m_numAttributes+1; noa++) {
      if (m_instances.classIndex() != noa) {
	m_inputs[noa - now] = new NeuralEnd(m_instances.attribute(noa).name());
	
	m_inputs[noa - now].setX(.1);
	m_inputs[noa - now].setY((noa - now + 1.0) / (m_numAttributes + 1));
	m_inputs[noa - now].setLink(true, noa);
      }    
      else {
	now = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

  }

  /**
   * This creates the required output units.
   */
  private void setupOutputs() throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_outputs = new NeuralEnd[m_numClasses];
    for (int noa = 0; noa < m_numClasses; noa++) {
      if (m_numeric) {
        m_outputs[noa] = new NeuralEnd(m_instances.classAttribute().name());
      } else {
        m_outputs[noa] = new NeuralEnd(m_instances.classAttribute().value(noa));
      }

<<<<<<< HEAD
=======
=======
  
    m_outputs = new NeuralEnd[m_numClasses];
    for (int noa = 0; noa < m_numClasses; noa++) {
      if (m_numeric) {
	m_outputs[noa] = new NeuralEnd(m_instances.classAttribute().name());
      }
      else {
	m_outputs[noa]= new NeuralEnd(m_instances.classAttribute().value(noa));
      }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_outputs[noa].setX(.9);
      m_outputs[noa].setY((noa + 1.0) / (m_numClasses + 1));
      m_outputs[noa].setLink(false, noa);
      NeuralNode temp = new NeuralNode(String.valueOf(m_nextId), m_random,
<<<<<<< HEAD
        m_sigmoidUnit);
=======
<<<<<<< HEAD
        m_sigmoidUnit);
=======
				       m_sigmoidUnit);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_nextId++;
      temp.setX(.75);
      temp.setY((noa + 1.0) / (m_numClasses + 1));
      addNode(temp);
      NeuralConnection.connect(temp, m_outputs[noa]);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  }

  /**
   * Call this function to automatically generate the hidden units
   */
  private void setupHiddenLayer() {
    StringTokenizer tok = new StringTokenizer(m_hiddenLayers, ",");
    int val = 0; // num of nodes in a layer
    int prev = 0; // used to remember the previous layer
    int num = tok.countTokens(); // number of layers
    String c;
    for (int noa = 0; noa < num; noa++) {
      // note that I am using the Double to get the value rather than the
      // Integer class, because for some reason the Double implementation can
      // handle leading white space and the integer version can't!?!
      c = tok.nextToken().trim();
      if (c.equals("a")) {
        val = (m_numAttributes + m_numClasses) / 2;
      } else if (c.equals("i")) {
        val = m_numAttributes;
      } else if (c.equals("o")) {
        val = m_numClasses;
      } else if (c.equals("t")) {
        val = m_numAttributes + m_numClasses;
      } else {
        val = Double.valueOf(c).intValue();
      }
      for (int nob = 0; nob < val; nob++) {
        NeuralNode temp = new NeuralNode(String.valueOf(m_nextId), m_random,
          m_sigmoidUnit);
        m_nextId++;
        temp.setX(.5 / (num) * noa + .25);
        temp.setY((nob + 1.0) / (val + 1));
        addNode(temp);
        if (noa > 0) {
          // then do connections
          for (int noc = m_neuralNodes.length - nob - 1 - prev; noc < m_neuralNodes.length
            - nob - 1; noc++) {
            NeuralConnection.connect(m_neuralNodes[noc], temp);
          }
        }
      }
<<<<<<< HEAD
=======
=======
 
  }
  
  /**
   * Call this function to automatically generate the hidden units
   */
  private void setupHiddenLayer()
  {
    StringTokenizer tok = new StringTokenizer(m_hiddenLayers, ",");
    int val = 0;  //num of nodes in a layer
    int prev = 0; //used to remember the previous layer
    int num = tok.countTokens(); //number of layers
    String c;
    for (int noa = 0; noa < num; noa++) {
      //note that I am using the Double to get the value rather than the
      //Integer class, because for some reason the Double implementation can
      //handle leading white space and the integer version can't!?!
      c = tok.nextToken().trim();
      if (c.equals("a")) {
	val = (m_numAttributes + m_numClasses) / 2;
      }
      else if (c.equals("i")) {
	val = m_numAttributes;
      }
      else if (c.equals("o")) {
	val = m_numClasses;
      }
      else if (c.equals("t")) {
	val = m_numAttributes + m_numClasses;
      }
      else {
	val = Double.valueOf(c).intValue();
      }
      for (int nob = 0; nob < val; nob++) {
	NeuralNode temp = new NeuralNode(String.valueOf(m_nextId), m_random,
					 m_sigmoidUnit);
	m_nextId++;
	temp.setX(.5 / (num) * noa + .25);
	temp.setY((nob + 1.0) / (val + 1));
	addNode(temp);
	if (noa > 0) {
	  //then do connections
	  for (int noc = m_neuralNodes.length - nob - 1 - prev;
	       noc < m_neuralNodes.length - nob - 1; noc++) {
	    NeuralConnection.connect(m_neuralNodes[noc], temp);
	  }
	}
      }      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      prev = val;
    }
    tok = new StringTokenizer(m_hiddenLayers, ",");
    c = tok.nextToken();
    if (c.equals("a")) {
      val = (m_numAttributes + m_numClasses) / 2;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else if (c.equals("i")) {
      val = m_numAttributes;
    } else if (c.equals("o")) {
      val = m_numClasses;
    } else if (c.equals("t")) {
      val = m_numAttributes + m_numClasses;
    } else {
      val = Double.valueOf(c).intValue();
    }

    if (val == 0) {
      for (int noa = 0; noa < m_numAttributes; noa++) {
        for (int nob = 0; nob < m_numClasses; nob++) {
          NeuralConnection.connect(m_inputs[noa], m_neuralNodes[nob]);
        }
      }
    } else {
      for (int noa = 0; noa < m_numAttributes; noa++) {
        for (int nob = m_numClasses; nob < m_numClasses + val; nob++) {
          NeuralConnection.connect(m_inputs[noa], m_neuralNodes[nob]);
        }
      }
      for (int noa = m_neuralNodes.length - prev; noa < m_neuralNodes.length; noa++) {
        for (int nob = 0; nob < m_numClasses; nob++) {
          NeuralConnection.connect(m_neuralNodes[noa], m_neuralNodes[nob]);
        }
      }
    }

  }

  /**
   * This will go through all the nodes and check if they are connected to a
   * pure output unit. If so they will be set to be linear units. If not they
   * will be set to be sigmoid units.
   */
  private void setEndsToLinear() {
    for (NeuralConnection m_neuralNode : m_neuralNodes) {
      if ((m_neuralNode.getType() & NeuralConnection.OUTPUT) == NeuralConnection.OUTPUT) {
        ((NeuralNode) m_neuralNode).setMethod(m_linearUnit);
      } else {
        ((NeuralNode) m_neuralNode).setMethod(m_sigmoidUnit);
<<<<<<< HEAD
=======
=======
    }
    else if (c.equals("i")) {
      val = m_numAttributes;
    }
    else if (c.equals("o")) {
      val = m_numClasses;
    }
    else if (c.equals("t")) {
      val = m_numAttributes + m_numClasses;
    }
    else {
      val = Double.valueOf(c).intValue();
    }
    
    if (val == 0) {
      for (int noa = 0; noa < m_numAttributes; noa++) {
	for (int nob = 0; nob < m_numClasses; nob++) {
	  NeuralConnection.connect(m_inputs[noa], m_neuralNodes[nob]);
	}
      }
    }
    else {
      for (int noa = 0; noa < m_numAttributes; noa++) {
	for (int nob = m_numClasses; nob < m_numClasses + val; nob++) {
	  NeuralConnection.connect(m_inputs[noa], m_neuralNodes[nob]);
	}
      }
      for (int noa = m_neuralNodes.length - prev; noa < m_neuralNodes.length;
	   noa++) {
	for (int nob = 0; nob < m_numClasses; nob++) {
	  NeuralConnection.connect(m_neuralNodes[noa], m_neuralNodes[nob]);
	}
      }
    }
    
  }
  
  /**
   * This will go through all the nodes and check if they are connected
   * to a pure output unit. If so they will be set to be linear units.
   * If not they will be set to be sigmoid units.
   */
  private void setEndsToLinear() {
    for (int noa = 0; noa < m_neuralNodes.length; noa++) {
      if ((m_neuralNodes[noa].getType() & NeuralConnection.OUTPUT) ==
	  NeuralConnection.OUTPUT) {
	((NeuralNode)m_neuralNodes[noa]).setMethod(m_linearUnit);
      }
      else {
	((NeuralNode)m_neuralNodes[noa]).setMethod(m_sigmoidUnit);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

  /**
   * Returns default capabilities of the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return the capabilities of this classifier
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return      the capabilities of this classifier
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    // class
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.NUMERIC_CLASS);
    result.enable(Capability.DATE_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result;
  }

  /** The instances in the validation set (if any) */
  protected transient Instances valSet = null;

  /** The number of instances in the validation set (if any) */
  protected transient int numInVal = 0;

  /** Total weight of the instances in the training set */
  protected transient double totalWeight = 0;

  /** Total weight of the instances in the validation set (if any) */
  protected transient double totalValWeight = 0;

  /** Drift off counter */
  protected transient double driftOff = 0;

  /** To keep track of error */
  protected transient double lastRight = Double.POSITIVE_INFINITY;
  protected transient double bestError = Double.POSITIVE_INFINITY;

  /** Data in original format (in case learning rate gets reset */
  protected transient Instances originalFormatData = null;

  /**
   * Initializes an iterative classifier.
   *
   * @param data the instances to be used in induction
   * @exception Exception if the model cannot be initialized
   */
  public void initializeClassifier(Instances data) throws Exception {

    // can classifier handle the data?
    getCapabilities().testWithFail(data);

    // remove instances with missing class
    data = new Instances(data);
    data.deleteWithMissingClass();
    originalFormatData = data;

    m_ZeroR = new weka.classifiers.rules.ZeroR();
    m_ZeroR.buildClassifier(data);
    // only class? -> use ZeroR model
    if (data.numAttributes() == 1) {
      System.err.println("Cannot build model (only class attribute present in data!), "
                      + "using ZeroR model instead!");
      m_useDefaultModel = true;
      return;
    } else {
      m_useDefaultModel = false;
    }

<<<<<<< HEAD
=======
=======
    
    return result;
  }
  
  /**
   * Call this function to build and train a neural network for the training
   * data provided.
   * @param i The training data.
   * @throws Exception if can't build classification properly.
   */
  public void buildClassifier(Instances i) throws Exception {

    // can classifier handle the data?
    getCapabilities().testWithFail(i);

    // remove instances with missing class
    i = new Instances(i);
    i.deleteWithMissingClass();

    m_ZeroR = new weka.classifiers.rules.ZeroR();
    m_ZeroR.buildClassifier(i);
    // only class? -> use ZeroR model
    if (i.numAttributes() == 1) {
      System.err.println(
	  "Cannot build model (only class attribute present in data!), "
	  + "using ZeroR model instead!");
      m_useDefaultModel = true;
      return;
    }
    else {
      m_useDefaultModel = false;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_epoch = 0;
    m_error = 0;
    m_instances = null;
    m_currentInstance = null;
    m_controlPanel = null;
    m_nodePanel = null;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_outputs = new NeuralEnd[0];
    m_inputs = new NeuralEnd[0];
    m_numAttributes = 0;
    m_numClasses = 0;
    m_neuralNodes = new NeuralConnection[0];
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    m_selected = new ArrayList<NeuralConnection>(4);
    m_nextId = 0;
    m_stopIt = true;
    m_stopped = true;
    m_accepted = false;
    m_instances = new Instances(data);
<<<<<<< HEAD
=======
=======
    
    m_selected = new FastVector(4);
    m_graphers = new FastVector(2);
    m_nextId = 0;
    m_stopIt = true;
    m_stopped = true;
    m_accepted = false;    
    m_instances = new Instances(i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_random = new Random(m_randomSeed);
    m_instances.randomize(m_random);

    if (m_useNomToBin) {
      m_nominalToBinaryFilter = new NominalToBinary();
      m_nominalToBinaryFilter.setInputFormat(m_instances);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_instances = Filter.useFilter(m_instances, m_nominalToBinaryFilter);
    }
    m_numAttributes = m_instances.numAttributes() - 1;
    m_numClasses = m_instances.numClasses();

    setClassType(m_instances);

    // this sets up the validation set.
    // numinval is needed later
    numInVal = (int) (m_valSize / 100.0 * m_instances.numInstances());
    if (m_valSize > 0) {
      if (numInVal == 0) {
        numInVal = 1;
      }
      valSet = new Instances(m_instances, 0, numInVal);
    }
    // /////////

    setupInputs();

    setupOutputs();
    if (m_autoBuild) {
      setupHiddenLayer();
    }

    // ///////////////////////////
    // this sets up the gui for usage
    if (m_gui) {
      m_win = Utils.getWekaJFrame("Neural Network", null);

      m_win.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
          boolean k = m_stopIt;
          m_stopIt = true;
          int well = JOptionPane.showConfirmDialog(m_win, "Are You Sure...\n"
                          + "Click Yes To Accept" + " The Neural Network"
                          + "\n Click No To Return", "Accept Neural Network",
                  JOptionPane.YES_NO_OPTION);

          if (well == 0) {
            m_win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            m_accepted = true;
            blocker(false);
          } else {
            m_win.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          }
          m_stopIt = k;
        }
      });

      m_win.getContentPane().setLayout(new BorderLayout());
      m_nodePanel = new NodePanel();
      // without the following two lines, the
      // NodePanel.paintComponents(Graphics)
<<<<<<< HEAD
=======
=======
      m_instances = Filter.useFilter(m_instances,
				     m_nominalToBinaryFilter);
    }
    m_numAttributes = m_instances.numAttributes() - 1;
    m_numClasses = m_instances.numClasses();
 
    
    setClassType(m_instances);
    

   
    //this sets up the validation set.
    Instances valSet = null;
    //numinval is needed later
    int numInVal = (int)(m_valSize / 100.0 * m_instances.numInstances());
    if (m_valSize > 0) {
      if (numInVal == 0) {
	numInVal = 1;
      }
      valSet = new Instances(m_instances, 0, numInVal);
    }
    ///////////

    setupInputs();
      
    setupOutputs();    
    if (m_autoBuild) {
      setupHiddenLayer();
    }
    
    /////////////////////////////
    //this sets up the gui for usage
    if (m_gui) {
      m_win = new JFrame();
      
      m_win.addWindowListener(new WindowAdapter() {
	  public void windowClosing(WindowEvent e) {
	    boolean k = m_stopIt;
	    m_stopIt = true;
	    int well =JOptionPane.showConfirmDialog(m_win, 
						    "Are You Sure...\n"
						    + "Click Yes To Accept"
						    + " The Neural Network" 
						    + "\n Click No To Return",
						    "Accept Neural Network", 
						    JOptionPane.YES_NO_OPTION);
	    
	    if (well == 0) {
	      m_win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      m_accepted = true;
	      blocker(false);
	    }
	    else {
	      m_win.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    }
	    m_stopIt = k;
	  }
	});
      
      m_win.getContentPane().setLayout(new BorderLayout());
      m_win.setTitle("Neural Network");
      m_nodePanel = new NodePanel();
      // without the following two lines, the NodePanel.paintComponents(Graphics) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // method will go berserk if the network doesn't fit completely: it will
      // get called on a constant basis, using 100% of the CPU
      // see the following forum thread:
      // http://forum.java.sun.com/thread.jspa?threadID=580929&messageID=2945011
      m_nodePanel.setPreferredSize(new Dimension(640, 480));
      m_nodePanel.revalidate();

      JScrollPane sp = new JScrollPane(m_nodePanel,
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
              JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
              JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      m_controlPanel = new ControlPanel();

<<<<<<< HEAD
=======
=======
				       JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				       JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      m_controlPanel = new ControlPanel();
           
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_win.getContentPane().add(sp, BorderLayout.CENTER);
      m_win.getContentPane().add(m_controlPanel, BorderLayout.SOUTH);
      m_win.setSize(640, 480);
      m_win.setVisible(true);
    }
<<<<<<< HEAD

    // This sets up the initial state of the gui
=======
<<<<<<< HEAD

    // This sets up the initial state of the gui
=======
   
    //This sets up the initial state of the gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_gui) {
      blocker(true);
      m_controlPanel.m_changeEpochs.setEnabled(false);
      m_controlPanel.m_changeLearning.setEnabled(false);
      m_controlPanel.m_changeMomentum.setEnabled(false);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    // For silly situations in which the network gets accepted before training
    // commenses
<<<<<<< HEAD
=======
=======
    } 
    
    //For silly situations in which the network gets accepted before training
    //commenses
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_numeric) {
      setEndsToLinear();
    }
    if (m_accepted) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      return;
    }

    // connections done.

    totalWeight = 0;
    totalValWeight = 0;
    driftOff = 0;
    lastRight = Double.POSITIVE_INFINITY;
    bestError = Double.POSITIVE_INFINITY;

    // ensure that at least 1 instance is trained through.
<<<<<<< HEAD
=======
=======
      m_win.dispose();
      m_controlPanel = null;
      m_nodePanel = null;
      m_instances = new Instances(m_instances, 0);
      m_currentInstance = null;
      return;
    }

    //connections done.
    double right = 0;
    double driftOff = 0;
    double lastRight = Double.POSITIVE_INFINITY;
    double bestError = Double.POSITIVE_INFINITY;
    double tempRate;
    double totalWeight = 0;
    double totalValWeight = 0;
    double origRate = m_learningRate; //only used for when reset
    
    //ensure that at least 1 instance is trained through.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (numInVal == m_instances.numInstances()) {
      numInVal--;
    }
    if (numInVal < 0) {
      numInVal = 0;
    }
    for (int noa = numInVal; noa < m_instances.numInstances(); noa++) {
      if (!m_instances.instance(noa).classIsMissing()) {
<<<<<<< HEAD
        totalWeight += m_instances.instance(noa).weight();
=======
<<<<<<< HEAD
        totalWeight += m_instances.instance(noa).weight();
=======
	totalWeight += m_instances.instance(noa).weight();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (m_valSize != 0) {
      for (int noa = 0; noa < valSet.numInstances(); noa++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if (!valSet.instance(noa).classIsMissing()) {
          totalValWeight += valSet.instance(noa).weight();
        }
      }
    }
    m_stopped = false;
  }

  /**
   * Performs one iteration.
   *
   * @return false if no further iterations could be performed, true otherwise
   * @exception Exception if this iteration fails for unexpected reasons
   */
  public boolean next() throws Exception {

    if (m_accepted || m_useDefaultModel) { // Has user accepted the network already or do we need to use default model?
      return false;
    }
    m_epoch++;
    double right = 0;
    for (int nob = numInVal; nob < m_instances.numInstances(); nob++) {
      m_currentInstance = m_instances.instance(nob);

      if (!m_currentInstance.classIsMissing()) {

        // this is where the network updating (and training occurs, for the
        // training set
        resetNetwork();
        calculateOutputs();
        double tempRate = m_learningRate * m_currentInstance.weight();
        if (m_decay) {
          tempRate /= m_epoch;
        }

        right += (calculateErrors() / m_instances.numClasses())
                * m_currentInstance.weight();
        updateNetworkWeights(tempRate, m_momentum);
      }
    }
    right /= totalWeight;
    if (Double.isInfinite(right) || Double.isNaN(right)) {
      if ((!m_reset) || (originalFormatData == null)){
        m_instances = null;
        throw new Exception("Network cannot train. Try restarting with a smaller learning rate.");
      } else {
        // reset the network if possible
        if (m_learningRate <= Utils.SMALL) {
          throw new IllegalStateException("Learning rate got too small ("
                  + m_learningRate + " <= " + Utils.SMALL + ")!");
        }
        double origRate = m_learningRate; // only used for when reset
        m_learningRate /= 2;
        buildClassifier(originalFormatData);
        m_learningRate = origRate;
        return false;
      }
    }

    // //////////////////////do validation testing if applicable
    if (m_valSize != 0) {
      right = 0;
      if (valSet == null) {
        throw new IllegalArgumentException("Trying to use validation set but validation set is null.");
      }
      for (int nob = 0; nob < valSet.numInstances(); nob++) {
        m_currentInstance = valSet.instance(nob);
        if (!m_currentInstance.classIsMissing()) {
          // this is where the network updating occurs, for the validation set
          resetNetwork();
          calculateOutputs();
          right += (calculateErrors() / valSet.numClasses()) * m_currentInstance.weight();
          // note 'right' could be calculated here just using
          // the calculate output values. This would be faster.
          // be less modular
        }
      }

      if (right < lastRight) {
        if (right < bestError) {
          bestError = right;
          // save the network weights at this point
          for (int noc = 0; noc < m_numClasses; noc++) {
            m_outputs[noc].saveWeights();
          }
          driftOff = 0;
        }
      } else {
        driftOff++;
      }
      lastRight = right;
      if (driftOff > m_driftThreshold || m_epoch + 1 >= m_numEpochs) {
        for (int noc = 0; noc < m_numClasses; noc++) {
          m_outputs[noc].restoreWeights();
        }
        m_accepted = true;
      }
      right /= totalValWeight;
    }
    m_error = right;
    // shows what the neuralnet is upto if a gui exists.
    updateDisplay();
    // This junction controls what state the gui is in at the end of each
    // epoch, Such as if it is paused, if it is resumable etc...
    if (m_gui) {
      while ((m_stopIt || (m_epoch >= m_numEpochs && m_valSize == 0)) && !m_accepted) {
        m_stopIt = true;
        m_stopped = true;
        if (m_epoch >= m_numEpochs && m_valSize == 0) {

          m_controlPanel.m_startStop.setEnabled(false);
        } else {
          m_controlPanel.m_startStop.setEnabled(true);
        }
        m_controlPanel.m_startStop.setText("Start");
        m_controlPanel.m_startStop.setActionCommand("Start");
        m_controlPanel.m_changeEpochs.setEnabled(true);
        m_controlPanel.m_changeLearning.setEnabled(true);
        m_controlPanel.m_changeMomentum.setEnabled(true);

        blocker(true);
        if (m_numeric) {
          setEndsToLinear();
        }
      }
      m_controlPanel.m_changeEpochs.setEnabled(false);
      m_controlPanel.m_changeLearning.setEnabled(false);
      m_controlPanel.m_changeMomentum.setEnabled(false);

      m_stopped = false;
      // if the network has been accepted stop the training loop
      if (m_accepted) {
        return false;
      }
    }
    if (m_accepted) {
      return false;
    }
    if (m_epoch < m_numEpochs) {
      return true; // We can keep iterating
    } else {
      return false;
    }
  }

  /**
   * Signal end of iterating, useful for any house-keeping/cleanup
   *
   * @exception Exception if cleanup fails
   */
  public void done() throws Exception {

<<<<<<< HEAD
=======
=======
	if (!valSet.instance(noa).classIsMissing()) {
	  totalValWeight += valSet.instance(noa).weight();
	}
      }
    }
    m_stopped = false;
     

    for (int noa = 1; noa < m_numEpochs + 1; noa++) {
      right = 0;
      for (int nob = numInVal; nob < m_instances.numInstances(); nob++) {
	m_currentInstance = m_instances.instance(nob);
	
	if (!m_currentInstance.classIsMissing()) {
	   
	  //this is where the network updating (and training occurs, for the
	  //training set
	  resetNetwork();
	  calculateOutputs();
	  tempRate = m_learningRate * m_currentInstance.weight();  
	  if (m_decay) {
	    tempRate /= noa;
	  }

	  right += (calculateErrors() / m_instances.numClasses()) *
	    m_currentInstance.weight();
	  updateNetworkWeights(tempRate, m_momentum);
	  
	}
	
      }
      right /= totalWeight;
      if (Double.isInfinite(right) || Double.isNaN(right)) {
	if (!m_reset) {
	  m_instances = null;
	  throw new Exception("Network cannot train. Try restarting with a" +
			      " smaller learning rate.");
	}
	else {
	  //reset the network if possible
	  if (m_learningRate <= Utils.SMALL)
	    throw new IllegalStateException(
		"Learning rate got too small (" + m_learningRate 
		+ " <= " + Utils.SMALL + ")!");
	  m_learningRate /= 2;
	  buildClassifier(i);
	  m_learningRate = origRate;
	  m_instances = new Instances(m_instances, 0);
	  m_currentInstance = null;
	  return;
	}
      }

      ////////////////////////do validation testing if applicable
      if (m_valSize != 0) {
	right = 0;
	for (int nob = 0; nob < valSet.numInstances(); nob++) {
	  m_currentInstance = valSet.instance(nob);
	  if (!m_currentInstance.classIsMissing()) {
	    //this is where the network updating occurs, for the validation set
	    resetNetwork();
	    calculateOutputs();
	    right += (calculateErrors() / valSet.numClasses()) 
	      * m_currentInstance.weight();
	    //note 'right' could be calculated here just using
	    //the calculate output values. This would be faster.
	    //be less modular
	  }
	  
	}
	
	if (right < lastRight) {
	  
	  if (right < bestError) {
	    bestError = right;
	    // save the network weights at this point
	    for (int noc = 0; noc < m_numClasses; noc++) {
	      m_outputs[noc].saveWeights();
	    }
	    driftOff = 0;
	  }
	}
	else {
	  driftOff++;
	}
	lastRight = right;
	if (driftOff > m_driftThreshold || noa + 1 >= m_numEpochs) {
	  for (int noc = 0; noc < m_numClasses; noc++) {
            m_outputs[noc].restoreWeights();
          }
	  m_accepted = true;
	}
	right /= totalValWeight;
      }
      m_epoch = noa;
      m_error = right;
      //shows what the neuralnet is upto if a gui exists. 
      updateDisplay();
      //This junction controls what state the gui is in at the end of each
      //epoch, Such as if it is paused, if it is resumable etc...
      if (m_gui) {
	while ((m_stopIt || (m_epoch >= m_numEpochs && m_valSize == 0)) && 
		!m_accepted) {
	  m_stopIt = true;
	  m_stopped = true;
	  if (m_epoch >= m_numEpochs && m_valSize == 0) {
	    
	    m_controlPanel.m_startStop.setEnabled(false);
	  }
	  else {
	    m_controlPanel.m_startStop.setEnabled(true);
	  }
	  m_controlPanel.m_startStop.setText("Start");
	  m_controlPanel.m_startStop.setActionCommand("Start");
	  m_controlPanel.m_changeEpochs.setEnabled(true);
	  m_controlPanel.m_changeLearning.setEnabled(true);
	  m_controlPanel.m_changeMomentum.setEnabled(true);
	  
	  blocker(true);
	  if (m_numeric) {
	    setEndsToLinear();
	  }
	}
	m_controlPanel.m_changeEpochs.setEnabled(false);
	m_controlPanel.m_changeLearning.setEnabled(false);
	m_controlPanel.m_changeMomentum.setEnabled(false);
	
	m_stopped = false;
	//if the network has been accepted stop the training loop
	if (m_accepted) {
	  m_win.dispose();
	  m_controlPanel = null;
	  m_nodePanel = null;
	  m_instances = new Instances(m_instances, 0);
	  m_currentInstance = null;
	  return;
	}
      }
      if (m_accepted) {
	m_instances = new Instances(m_instances, 0);
	m_currentInstance = null;
	return;
      }
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_gui) {
      m_win.dispose();
      m_controlPanel = null;
      m_nodePanel = null;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (!m_useDefaultModel) {
      m_instances = new Instances(m_instances, 0);
    }
    m_currentInstance = null;
    originalFormatData = null;
  }

  /**
   * Call this function to build and train a neural network for the training
   * data provided.
   * 
   * @param i The training data.
   * @throws Exception if can't build classification properly.
   */
  @Override
  public void buildClassifier(Instances i) throws Exception {

    // Initialize classifier
    initializeClassifier(i);

    // For the given number of iterations
    while (next()) {
    }

    // Clean up
    done();
  }

  /**
   * Call this function to predict the class of an instance once a
   * classification model has been built with the buildClassifier call.
   * 
<<<<<<< HEAD
=======
=======
    m_instances = new Instances(m_instances, 0);
    m_currentInstance = null;
  }

  /**
   * Call this function to predict the class of an instance once a 
   * classification model has been built with the buildClassifier call.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param i The instance to classify.
   * @return A double array filled with the probabilities of each class type.
   * @throws Exception if can't classify instance.
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public double[] distributionForInstance(Instance i) throws Exception {

    // default model?
    if (m_useDefaultModel) {
      return m_ZeroR.distributionForInstance(i);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_useNomToBin) {
      m_nominalToBinaryFilter.input(i);
      m_currentInstance = m_nominalToBinaryFilter.output();
    } else {
      m_currentInstance = i;
    }

    // Make a copy of the instance so that it isn't modified
    m_currentInstance = (Instance) m_currentInstance.copy();

    if (m_normalizeAttributes) {
      double[] instance = new double[m_currentInstance.numAttributes()];
      for (int noa = 0; noa < m_instances.numAttributes(); noa++) {
        if (noa != m_instances.classIndex()) {
          if (m_attributeRanges[noa] != 0) {
            instance[noa] = (m_currentInstance.value(noa) - m_attributeBases[noa]) / m_attributeRanges[noa];
          } else {
            instance[noa] = m_currentInstance.value(noa) - m_attributeBases[noa];
          }
        } else {
          instance[noa] = m_currentInstance.value(noa);
        }
      }
      m_currentInstance = new DenseInstance(m_currentInstance.weight(), instance);
      m_currentInstance.setDataset(m_instances);
    }
    resetNetwork();

    // since all the output values are needed.
    // They are calculated manually here and the values collected.
<<<<<<< HEAD
=======
=======
    
    if (m_useNomToBin) {
      m_nominalToBinaryFilter.input(i);
      m_currentInstance = m_nominalToBinaryFilter.output();
    }
    else {
      m_currentInstance = i;
    }
    
    // Make a copy of the instance so that it isn't modified
    m_currentInstance = (Instance)m_currentInstance.copy();
    
    if (m_normalizeAttributes) {
      for (int noa = 0; noa < m_instances.numAttributes(); noa++) {
	if (noa != m_instances.classIndex()) {
	  if (m_attributeRanges[noa] != 0) {
	    m_currentInstance.setValue(noa, (m_currentInstance.value(noa) - 
					     m_attributeBases[noa]) / 
				       m_attributeRanges[noa]);
	  }
	  else {
	    m_currentInstance.setValue(noa, m_currentInstance.value(noa) -
				       m_attributeBases[noa]);
	  }
	}
      }
    }
    resetNetwork();
    
    //since all the output values are needed.
    //They are calculated manually here and the values collected.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double[] theArray = new double[m_numClasses];
    for (int noa = 0; noa < m_numClasses; noa++) {
      theArray[noa] = m_outputs[noa].outputValue(true);
    }
    if (m_instances.classAttribute().isNumeric()) {
      return theArray;
    }
<<<<<<< HEAD

    // now normalize the array
=======
<<<<<<< HEAD

    // now normalize the array
=======
    
    //now normalize the array
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double count = 0;
    for (int noa = 0; noa < m_numClasses; noa++) {
      count += theArray[noa];
    }
    if (count <= 0) {
      return m_ZeroR.distributionForInstance(i);
    }
    for (int noa = 0; noa < m_numClasses; noa++) {
      theArray[noa] /= count;
    }
    return theArray;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(14);

    newVector.addElement(new Option(
      "\tLearning Rate for the backpropagation algorithm.\n"
        + "\t(Value should be between 0 - 1, Default = 0.3).", "L", 1,
      "-L <learning rate>"));
    newVector.addElement(new Option(
      "\tMomentum Rate for the backpropagation algorithm.\n"
        + "\t(Value should be between 0 - 1, Default = 0.2).", "M", 1,
      "-M <momentum>"));
    newVector.addElement(new Option("\tNumber of epochs to train through.\n"
      + "\t(Default = 500).", "N", 1, "-N <number of epochs>"));
    newVector.addElement(new Option(
      "\tPercentage size of validation set to use to terminate\n"
        + "\ttraining (if this is non zero it can pre-empt num of epochs.\n"
        + "\t(Value should be between 0 - 100, Default = 0).", "V", 1,
      "-V <percentage size of validation set>"));
    newVector.addElement(new Option(
      "\tThe value used to seed the random number generator\n"
        + "\t(Value should be >= 0 and and a long, Default = 0).", "S", 1,
      "-S <seed>"));
    newVector.addElement(new Option(
      "\tThe consequetive number of errors allowed for validation\n"
        + "\ttesting before the netwrok terminates.\n"
        + "\t(Value should be > 0, Default = 20).", "E", 1,
      "-E <threshold for number of consequetive errors>"));
    newVector.addElement(new Option("\tGUI will be opened.\n"
      + "\t(Use this to bring up a GUI).", "G", 0, "-G"));
    newVector.addElement(new Option(
      "\tAutocreation of the network connections will NOT be done.\n"
        + "\t(This will be ignored if -G is NOT set)", "A", 0, "-A"));
    newVector.addElement(new Option(
      "\tA NominalToBinary filter will NOT automatically be used.\n"
        + "\t(Set this to not use a NominalToBinary filter).", "B", 0, "-B"));
    newVector.addElement(new Option(
      "\tThe hidden layers to be created for the network.\n"
        + "\t(Value should be a list of comma separated Natural \n"
        + "\tnumbers or the letters 'a' = (attribs + classes) / 2, \n"
        + "\t'i' = attribs, 'o' = classes, 't' = attribs .+ classes)\n"
        + "\tfor wildcard values, Default = a).", "H", 1,
      "-H <comma seperated numbers for nodes on each layer>"));
    newVector.addElement(new Option(
      "\tNormalizing a numeric class will NOT be done.\n"
        + "\t(Set this to not normalize the class if it's numeric).", "C", 0,
      "-C"));
    newVector.addElement(new Option(
      "\tNormalizing the attributes will NOT be done.\n"
        + "\t(Set this to not normalize the attributes).", "I", 0, "-I"));
    newVector.addElement(new Option(
      "\tReseting the network will NOT be allowed.\n"
        + "\t(Set this to not allow the network to reset).", "R", 0, "-R"));
    newVector.addElement(new Option("\tLearning rate decay will occur.\n"
      + "\t(Set this to cause the learning rate to decay).", "D", 0, "-D"));

    newVector.addAll(Collections.list(super.listOptions()));

<<<<<<< HEAD
=======
=======
  


  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    
    Vector newVector = new Vector(14);

    newVector.addElement(new Option(
	      "\tLearning Rate for the backpropagation algorithm.\n"
	      +"\t(Value should be between 0 - 1, Default = 0.3).",
	      "L", 1, "-L <learning rate>"));
    newVector.addElement(new Option(
	      "\tMomentum Rate for the backpropagation algorithm.\n"
	      +"\t(Value should be between 0 - 1, Default = 0.2).",
	      "M", 1, "-M <momentum>"));
    newVector.addElement(new Option(
	      "\tNumber of epochs to train through.\n"
	      +"\t(Default = 500).",
	      "N", 1,"-N <number of epochs>"));
    newVector.addElement(new Option(
	      "\tPercentage size of validation set to use to terminate\n"
	      + "\ttraining (if this is non zero it can pre-empt num of epochs.\n"
	      +"\t(Value should be between 0 - 100, Default = 0).",
	      "V", 1, "-V <percentage size of validation set>"));
    newVector.addElement(new Option(
	      "\tThe value used to seed the random number generator\n"
	      + "\t(Value should be >= 0 and and a long, Default = 0).",
	      "S", 1, "-S <seed>"));
    newVector.addElement(new Option(
	      "\tThe consequetive number of errors allowed for validation\n"
	      + "\ttesting before the netwrok terminates.\n"
	      + "\t(Value should be > 0, Default = 20).",
	      "E", 1, "-E <threshold for number of consequetive errors>"));
    newVector.addElement(new Option(
              "\tGUI will be opened.\n"
	      +"\t(Use this to bring up a GUI).",
	      "G", 0,"-G"));
    newVector.addElement(new Option(
              "\tAutocreation of the network connections will NOT be done.\n"
	      +"\t(This will be ignored if -G is NOT set)",
	      "A", 0,"-A"));
    newVector.addElement(new Option(
              "\tA NominalToBinary filter will NOT automatically be used.\n"
	      +"\t(Set this to not use a NominalToBinary filter).",
	      "B", 0,"-B"));
    newVector.addElement(new Option(
	      "\tThe hidden layers to be created for the network.\n"
	      + "\t(Value should be a list of comma separated Natural \n"
	      + "\tnumbers or the letters 'a' = (attribs + classes) / 2, \n"
	      + "\t'i' = attribs, 'o' = classes, 't' = attribs .+ classes)\n"
	      + "\tfor wildcard values, Default = a).",
	      "H", 1, "-H <comma seperated numbers for nodes on each layer>"));
    newVector.addElement(new Option(
              "\tNormalizing a numeric class will NOT be done.\n"
	      +"\t(Set this to not normalize the class if it's numeric).",
	      "C", 0,"-C"));
    newVector.addElement(new Option(
              "\tNormalizing the attributes will NOT be done.\n"
	      +"\t(Set this to not normalize the attributes).",
	      "I", 0,"-I"));
    newVector.addElement(new Option(
              "\tReseting the network will NOT be allowed.\n"
	      +"\t(Set this to not allow the network to reset).",
	      "R", 0,"-R"));
    newVector.addElement(new Option(
              "\tLearning rate decay will occur.\n"
	      +"\t(Set this to cause the learning rate to decay).",
	      "D", 0,"-D"));
    
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return newVector.elements();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Parses a given list of options.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -L &lt;learning rate&gt;
   *  Learning Rate for the backpropagation algorithm.
   *  (Value should be between 0 - 1, Default = 0.3).
   * </pre>
   * 
   * <pre>
   * -M &lt;momentum&gt;
   *  Momentum Rate for the backpropagation algorithm.
   *  (Value should be between 0 - 1, Default = 0.2).
   * </pre>
   * 
   * <pre>
   * -N &lt;number of epochs&gt;
   *  Number of epochs to train through.
   *  (Default = 500).
   * </pre>
   * 
   * <pre>
   * -V &lt;percentage size of validation set&gt;
   *  Percentage size of validation set to use to terminate
   *  training (if this is non zero it can pre-empt num of epochs.
   *  (Value should be between 0 - 100, Default = 0).
   * </pre>
   * 
   * <pre>
   * -S &lt;seed&gt;
   *  The value used to seed the random number generator
   *  (Value should be &gt;= 0 and and a long, Default = 0).
   * </pre>
   * 
   * <pre>
   * -E &lt;threshold for number of consequetive errors&gt;
   *  The consequetive number of errors allowed for validation
   *  testing before the netwrok terminates.
   *  (Value should be &gt; 0, Default = 20).
   * </pre>
   * 
   * <pre>
   * -G
   *  GUI will be opened.
   *  (Use this to bring up a GUI).
   * </pre>
   * 
   * <pre>
   * -A
   *  Autocreation of the network connections will NOT be done.
   *  (This will be ignored if -G is NOT set)
   * </pre>
   * 
   * <pre>
   * -B
   *  A NominalToBinary filter will NOT automatically be used.
   *  (Set this to not use a NominalToBinary filter).
   * </pre>
   * 
   * <pre>
   * -H &lt;comma seperated numbers for nodes on each layer&gt;
<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -L &lt;learning rate&gt;
   *  Learning Rate for the backpropagation algorithm.
   *  (Value should be between 0 - 1, Default = 0.3).</pre>
   * 
   * <pre> -M &lt;momentum&gt;
   *  Momentum Rate for the backpropagation algorithm.
   *  (Value should be between 0 - 1, Default = 0.2).</pre>
   * 
   * <pre> -N &lt;number of epochs&gt;
   *  Number of epochs to train through.
   *  (Default = 500).</pre>
   * 
   * <pre> -V &lt;percentage size of validation set&gt;
   *  Percentage size of validation set to use to terminate
   *  training (if this is non zero it can pre-empt num of epochs.
   *  (Value should be between 0 - 100, Default = 0).</pre>
   * 
   * <pre> -S &lt;seed&gt;
   *  The value used to seed the random number generator
   *  (Value should be &gt;= 0 and and a long, Default = 0).</pre>
   * 
   * <pre> -E &lt;threshold for number of consequetive errors&gt;
   *  The consequetive number of errors allowed for validation
   *  testing before the netwrok terminates.
   *  (Value should be &gt; 0, Default = 20).</pre>
   * 
   * <pre> -G
   *  GUI will be opened.
   *  (Use this to bring up a GUI).</pre>
   * 
   * <pre> -A
   *  Autocreation of the network connections will NOT be done.
   *  (This will be ignored if -G is NOT set)</pre>
   * 
   * <pre> -B
   *  A NominalToBinary filter will NOT automatically be used.
   *  (Set this to not use a NominalToBinary filter).</pre>
   * 
   * <pre> -H &lt;comma seperated numbers for nodes on each layer&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *  The hidden layers to be created for the network.
   *  (Value should be a list of comma separated Natural 
   *  numbers or the letters 'a' = (attribs + classes) / 2, 
   *  'i' = attribs, 'o' = classes, 't' = attribs .+ classes)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *  for wildcard values, Default = a).
   * </pre>
   * 
   * <pre>
   * -C
   *  Normalizing a numeric class will NOT be done.
   *  (Set this to not normalize the class if it's numeric).
   * </pre>
   * 
   * <pre>
   * -I
   *  Normalizing the attributes will NOT be done.
   *  (Set this to not normalize the attributes).
   * </pre>
   * 
   * <pre>
   * -R
   *  Reseting the network will NOT be allowed.
   *  (Set this to not allow the network to reset).
   * </pre>
   * 
   * <pre>
   * -D
   *  Learning rate decay will occur.
   *  (Set this to cause the learning rate to decay).
   * </pre>
   * 
   * <!-- options-end -->
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
    // the defaults can be found here!!!!
<<<<<<< HEAD
=======
=======
   *  for wildcard values, Default = a).</pre>
   * 
   * <pre> -C
   *  Normalizing a numeric class will NOT be done.
   *  (Set this to not normalize the class if it's numeric).</pre>
   * 
   * <pre> -I
   *  Normalizing the attributes will NOT be done.
   *  (Set this to not normalize the attributes).</pre>
   * 
   * <pre> -R
   *  Reseting the network will NOT be allowed.
   *  (Set this to not allow the network to reset).</pre>
   * 
   * <pre> -D
   *  Learning rate decay will occur.
   *  (Set this to cause the learning rate to decay).</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    //the defaults can be found here!!!!
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String learningString = Utils.getOption('L', options);
    if (learningString.length() != 0) {
      setLearningRate((new Double(learningString)).doubleValue());
    } else {
      setLearningRate(0.3);
    }
    String momentumString = Utils.getOption('M', options);
    if (momentumString.length() != 0) {
      setMomentum((new Double(momentumString)).doubleValue());
    } else {
      setMomentum(0.2);
    }
    String epochsString = Utils.getOption('N', options);
    if (epochsString.length() != 0) {
      setTrainingTime(Integer.parseInt(epochsString));
    } else {
      setTrainingTime(500);
    }
    String valSizeString = Utils.getOption('V', options);
    if (valSizeString.length() != 0) {
      setValidationSetSize(Integer.parseInt(valSizeString));
    } else {
      setValidationSetSize(0);
    }
    String seedString = Utils.getOption('S', options);
    if (seedString.length() != 0) {
      setSeed(Integer.parseInt(seedString));
    } else {
      setSeed(0);
    }
    String thresholdString = Utils.getOption('E', options);
    if (thresholdString.length() != 0) {
      setValidationThreshold(Integer.parseInt(thresholdString));
    } else {
      setValidationThreshold(20);
    }
    String hiddenLayers = Utils.getOption('H', options);
    if (hiddenLayers.length() != 0) {
      setHiddenLayers(hiddenLayers);
    } else {
      setHiddenLayers("a");
    }
    if (Utils.getFlag('G', options)) {
      setGUI(true);
    } else {
      setGUI(false);
<<<<<<< HEAD
    } // small note. since the gui is the only option that can change the other
    // options this should be set first to allow the other options to set
    // properly
=======
<<<<<<< HEAD
    } // small note. since the gui is the only option that can change the other
    // options this should be set first to allow the other options to set
    // properly
=======
    } //small note. since the gui is the only option that can change the other
    //options this should be set first to allow the other options to set 
    //properly
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (Utils.getFlag('A', options)) {
      setAutoBuild(false);
    } else {
      setAutoBuild(true);
    }
    if (Utils.getFlag('B', options)) {
      setNominalToBinaryFilter(false);
    } else {
      setNominalToBinaryFilter(true);
    }
    if (Utils.getFlag('C', options)) {
      setNormalizeNumericClass(false);
    } else {
      setNormalizeNumericClass(true);
    }
    if (Utils.getFlag('I', options)) {
      setNormalizeAttributes(false);
    } else {
      setNormalizeAttributes(true);
    }
    if (Utils.getFlag('R', options)) {
      setReset(false);
    } else {
      setReset(true);
    }
    if (Utils.getFlag('D', options)) {
      setDecay(true);
    } else {
      setDecay(false);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
  }

  /**
   * Gets the current settings of NeuralNet.
   * 
   * @return an array of strings suitable for passing to setOptions()
   */
  @Override
  public String[] getOptions() {

    Vector<String> options = new Vector<String>();

    options.add("-L");
    options.add("" + getLearningRate());
    options.add("-M");
    options.add("" + getMomentum());
    options.add("-N");
    options.add("" + getTrainingTime());
    options.add("-V");
    options.add("" + getValidationSetSize());
    options.add("-S");
    options.add("" + getSeed());
    options.add("-E");
    options.add("" + getValidationThreshold());
    options.add("-H");
    options.add(getHiddenLayers());
    if (getGUI()) {
      options.add("-G");
    }
    if (!getAutoBuild()) {
      options.add("-A");
    }
    if (!getNominalToBinaryFilter()) {
      options.add("-B");
    }
    if (!getNormalizeNumericClass()) {
      options.add("-C");
    }
    if (!getNormalizeAttributes()) {
      options.add("-I");
    }
    if (!getReset()) {
      options.add("-R");
    }
    if (getDecay()) {
      options.add("-D");
    }

    Collections.addAll(options, super.getOptions());

    return options.toArray(new String[0]);
  }

  /**
   * @return string describing the model.
   */
  @Override
<<<<<<< HEAD
=======
=======
    
    Utils.checkForRemainingOptions(options);
  }
  
  /**
   * Gets the current settings of NeuralNet.
   *
   * @return an array of strings suitable for passing to setOptions()
   */
  public String [] getOptions() {

    String [] options = new String [21];
    int current = 0;
    options[current++] = "-L"; options[current++] = "" + getLearningRate(); 
    options[current++] = "-M"; options[current++] = "" + getMomentum();
    options[current++] = "-N"; options[current++] = "" + getTrainingTime(); 
    options[current++] = "-V"; options[current++] = "" +getValidationSetSize();
    options[current++] = "-S"; options[current++] = "" + getSeed();
    options[current++] = "-E"; options[current++] =""+getValidationThreshold();
    options[current++] = "-H"; options[current++] = getHiddenLayers();
    if (getGUI()) {
      options[current++] = "-G";
    }
    if (!getAutoBuild()) {
      options[current++] = "-A";
    }
    if (!getNominalToBinaryFilter()) {
      options[current++] = "-B";
    }
    if (!getNormalizeNumericClass()) {
      options[current++] = "-C";
    }
    if (!getNormalizeAttributes()) {
      options[current++] = "-I";
    }
    if (!getReset()) {
      options[current++] = "-R";
    }
    if (getDecay()) {
      options[current++] = "-D";
    }

    
    while (current < options.length) {
      options[current++] = "";
    }
    return options;
  }
  
  /**
   * @return string describing the model.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {
    // only ZeroR model?
    if (m_useDefaultModel) {
      StringBuffer buf = new StringBuffer();
      buf.append(this.getClass().getName().replaceAll(".*\\.", "") + "\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      buf.append(this.getClass().getName().replaceAll(".*\\.", "")
        .replaceAll(".", "=")
        + "\n\n");
      buf
        .append("Warning: No model could be built, hence ZeroR model is used:\n\n");
      buf.append(m_ZeroR.toString());
      return buf.toString();
    }

    StringBuffer model = new StringBuffer(m_neuralNodes.length * 100);
    // just a rough size guess
    NeuralNode con;
    double[] weights;
    NeuralConnection[] inputs;
    for (NeuralConnection m_neuralNode : m_neuralNodes) {
      con = (NeuralNode) m_neuralNode; // this would need a change
                                       // for items other than nodes!!!
      weights = con.getWeights();
      inputs = con.getInputs();
      if (con.getMethod() instanceof SigmoidUnit) {
        model.append("Sigmoid ");
      } else if (con.getMethod() instanceof LinearUnit) {
        model.append("Linear ");
<<<<<<< HEAD
=======
=======
      buf.append(this.getClass().getName().replaceAll(".*\\.", "").replaceAll(".", "=") + "\n\n");
      buf.append("Warning: No model could be built, hence ZeroR model is used:\n\n");
      buf.append(m_ZeroR.toString());
      return buf.toString();
    }
    
    StringBuffer model = new StringBuffer(m_neuralNodes.length * 100); 
    //just a rough size guess
    NeuralNode con;
    double[] weights;
    NeuralConnection[] inputs;
    for (int noa = 0; noa < m_neuralNodes.length; noa++) {
      con = (NeuralNode) m_neuralNodes[noa];  //this would need a change
                                              //for items other than nodes!!!
      weights = con.getWeights();
      inputs = con.getInputs();
      if (con.getMethod() instanceof SigmoidUnit) {
	model.append("Sigmoid ");
      }
      else if (con.getMethod() instanceof LinearUnit) {
	model.append("Linear ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      model.append("Node " + con.getId() + "\n    Inputs    Weights\n");
      model.append("    Threshold    " + weights[0] + "\n");
      for (int nob = 1; nob < con.getNumInputs() + 1; nob++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        if ((inputs[nob - 1].getType() & NeuralConnection.PURE_INPUT) == NeuralConnection.PURE_INPUT) {
          model.append("    Attrib "
            + m_instances.attribute(((NeuralEnd) inputs[nob - 1]).getLink())
              .name() + "    " + weights[nob] + "\n");
        } else {
          model.append("    Node " + inputs[nob - 1].getId() + "    "
            + weights[nob] + "\n");
        }
      }
    }
    // now put in the ends
    for (NeuralEnd m_output : m_outputs) {
      inputs = m_output.getInputs();
      model.append("Class "
        + m_instances.classAttribute().value(m_output.getLink())
        + "\n    Input\n");
      for (int nob = 0; nob < m_output.getNumInputs(); nob++) {
        if ((inputs[nob].getType() & NeuralConnection.PURE_INPUT) == NeuralConnection.PURE_INPUT) {
          model.append("    Attrib "
            + m_instances.attribute(((NeuralEnd) inputs[nob]).getLink()).name()
            + "\n");
        } else {
          model.append("    Node " + inputs[nob].getId() + "\n");
        }
<<<<<<< HEAD
=======
=======
	if ((inputs[nob - 1].getType() & NeuralConnection.PURE_INPUT) 
	    == NeuralConnection.PURE_INPUT) {
	  model.append("    Attrib " + 
		       m_instances.attribute(((NeuralEnd)inputs[nob-1]).
					     getLink()).name()
		       + "    " + weights[nob] + "\n");
	}
	else {
	  model.append("    Node " + inputs[nob-1].getId() + "    " +
		       weights[nob] + "\n");
	}
      }      
    }
    //now put in the ends
    for (int noa = 0; noa < m_outputs.length; noa++) {
      inputs = m_outputs[noa].getInputs();
      model.append("Class " + 
		   m_instances.classAttribute().
		   value(m_outputs[noa].getLink()) + 
		   "\n    Input\n");
      for (int nob = 0; nob < m_outputs[noa].getNumInputs(); nob++) {
	if ((inputs[nob].getType() & NeuralConnection.PURE_INPUT)
	    == NeuralConnection.PURE_INPUT) {
	  model.append("    Attrib " +
		       m_instances.attribute(((NeuralEnd)inputs[nob]).
					     getLink()).name() + "\n");
	}
	else {
	  model.append("    Node " + inputs[nob].getId() + "\n");
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return model.toString();
  }

  /**
   * This will return a string describing the classifier.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return The string.
   */
  public String globalInfo() {
    return "A Classifier that uses backpropagation to classify instances.\n"
<<<<<<< HEAD
=======
=======
   * @return The string.
   */
  public String globalInfo() {
    return 
        "A Classifier that uses backpropagation to classify instances.\n"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      + "This network can be built by hand, created by an algorithm or both. "
      + "The network can also be monitored and modified during training time. "
      + "The nodes in this network are all sigmoid (except for when the class "
      + "is numeric in which case the the output nodes become unthresholded "
      + "linear units).";
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the learning rate option.
   */
  public String learningRateTipText() {
<<<<<<< HEAD
    return "The amount the" + " weights are updated.";
  }

=======
<<<<<<< HEAD
    return "The amount the" + " weights are updated.";
  }

=======
    return "The amount the" + 
      " weights are updated.";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the momentum option.
   */
  public String momentumTipText() {
    return "Momentum applied to the weights during updating.";
  }

  /**
   * @return a string to describe the AutoBuild option.
   */
  public String autoBuildTipText() {
    return "Adds and connects up hidden layers in the network.";
  }

  /**
   * @return a string to describe the random seed option.
   */
  public String seedTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "Seed used to initialise the random number generator."
      + "Random numbers are used for setting the initial weights of the"
      + " connections betweem nodes, and also for shuffling the training data.";
  }

<<<<<<< HEAD
=======
=======
    return "Seed used to initialise the random number generator." +
      "Random numbers are used for setting the initial weights of the" +
      " connections betweem nodes, and also for shuffling the training data.";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the validation threshold option.
   */
  public String validationThresholdTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "Used to terminate validation testing."
      + "The value here dictates how many times in a row the validation set"
      + " error can get worse before training is terminated.";
  }

<<<<<<< HEAD
=======
=======
    return "Used to terminate validation testing." +
      "The value here dictates how many times in a row the validation set" +
      " error can get worse before training is terminated.";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the GUI option.
   */
  public String GUITipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "Brings up a gui interface."
      + " This will allow the pausing and altering of the nueral network"
      + " during training.\n\n"
      + "* To add a node left click (this node will be automatically selected,"
      + " ensure no other nodes were selected).\n"
      + "* To select a node left click on it either while no other node is"
      + " selected or while holding down the control key (this toggles that"
      + " node as being selected and not selected.\n"
      + "* To connect a node, first have the start node(s) selected, then click"
      + " either the end node or on an empty space (this will create a new node"
      + " that is connected with the selected nodes). The selection status of"
      + " nodes will stay the same after the connection. (Note these are"
      + " directed connections, also a connection between two nodes will not"
      + " be established more than once and certain connections that are"
      + " deemed to be invalid will not be made).\n"
      + "* To remove a connection select one of the connected node(s) in the"
      + " connection and then right click the other node (it does not matter"
      + " whether the node is the start or end the connection will be removed"
      + ").\n"
      + "* To remove a node right click it while no other nodes (including it)"
      + " are selected. (This will also remove all connections to it)\n."
      + "* To deselect a node either left click it while holding down control,"
      + " or right click on empty space.\n"
      + "* The raw inputs are provided from the labels on the left.\n"
      + "* The red nodes are hidden layers.\n"
      + "* The orange nodes are the output nodes.\n"
      + "* The labels on the right show the class the output node represents."
      + " Note that with a numeric class the output node will automatically be"
      + " made into an unthresholded linear unit.\n\n"
      + "Alterations to the neural network can only be done while the network"
      + " is not running, This also applies to the learning rate and other"
      + " fields on the control panel.\n\n"
      + "* You can accept the network as being finished at any time.\n"
      + "* The network is automatically paused at the beginning.\n"
      + "* There is a running indication of what epoch the network is up to"
      + " and what the (rough) error for that epoch was (or for"
      + " the validation if that is being used). Note that this error value"
      + " is based on a network that changes as the value is computed."
      + " (also depending on whether"
      + " the class is normalized will effect the error reported for numeric"
      + " classes.\n"
      + "* Once the network is done it will pause again and either wait to be"
      + " accepted or trained more.\n\n"
      + "Note that if the gui is not set the network will not require any"
      + " interaction.\n";
  }

<<<<<<< HEAD
=======
=======
    return "Brings up a gui interface." +
      " This will allow the pausing and altering of the nueral network" +
      " during training.\n\n" +
      "* To add a node left click (this node will be automatically selected," +
      " ensure no other nodes were selected).\n" +
      "* To select a node left click on it either while no other node is" +
      " selected or while holding down the control key (this toggles that" +
      " node as being selected and not selected.\n" + 
      "* To connect a node, first have the start node(s) selected, then click"+
      " either the end node or on an empty space (this will create a new node"+
      " that is connected with the selected nodes). The selection status of" +
      " nodes will stay the same after the connection. (Note these are" +
      " directed connections, also a connection between two nodes will not" +
      " be established more than once and certain connections that are" + 
      " deemed to be invalid will not be made).\n" +
      "* To remove a connection select one of the connected node(s) in the" +
      " connection and then right click the other node (it does not matter" +
      " whether the node is the start or end the connection will be removed" +
      ").\n" +
      "* To remove a node right click it while no other nodes (including it)" +
      " are selected. (This will also remove all connections to it)\n." +
      "* To deselect a node either left click it while holding down control," +
      " or right click on empty space.\n" +
      "* The raw inputs are provided from the labels on the left.\n" +
      "* The red nodes are hidden layers.\n" +
      "* The orange nodes are the output nodes.\n" +
      "* The labels on the right show the class the output node represents." +
      " Note that with a numeric class the output node will automatically be" +
      " made into an unthresholded linear unit.\n\n" +
      "Alterations to the neural network can only be done while the network" +
      " is not running, This also applies to the learning rate and other" +
      " fields on the control panel.\n\n" + 
      "* You can accept the network as being finished at any time.\n" +
      "* The network is automatically paused at the beginning.\n" +
      "* There is a running indication of what epoch the network is up to" + 
      " and what the (rough) error for that epoch was (or for" +
      " the validation if that is being used). Note that this error value" +
      " is based on a network that changes as the value is computed." +
      " (also depending on whether" +
      " the class is normalized will effect the error reported for numeric" +
      " classes.\n" +
      "* Once the network is done it will pause again and either wait to be" +
      " accepted or trained more.\n\n" +
      "Note that if the gui is not set the network will not require any" +
      " interaction.\n";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the validation size option.
   */
  public String validationSetSizeTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "The percentage size of the validation set."
      + "(The training will continue until it is observed that"
      + " the error on the validation set has been consistently getting"
      + " worse, or if the training time is reached).\n"
      + "If This is set to zero no validation set will be used and instead"
      + " the network will train for the specified number of epochs.";
  }

<<<<<<< HEAD
=======
=======
    return "The percentage size of the validation set." +
      "(The training will continue until it is observed that" +
      " the error on the validation set has been consistently getting" +
      " worse, or if the training time is reached).\n" +
      "If This is set to zero no validation set will be used and instead" +
      " the network will train for the specified number of epochs.";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the learning rate option.
   */
  public String trainingTimeTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "The number of epochs to train through."
      + " If the validation set is non-zero then it can terminate the network"
      + " early";
  }

<<<<<<< HEAD
=======
=======
    return "The number of epochs to train through." + 
      " If the validation set is non-zero then it can terminate the network" +
      " early";
  }


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the nominal to binary option.
   */
  public String nominalToBinaryFilterTipText() {
<<<<<<< HEAD
    return "This will preprocess the instances with the filter."
      + " This could help improve performance if there are nominal attributes"
      + " in the data.";
=======
<<<<<<< HEAD
    return "This will preprocess the instances with the filter."
      + " This could help improve performance if there are nominal attributes"
      + " in the data.";
=======
    return "This will preprocess the instances with the filter." +
      " This could help improve performance if there are nominal attributes" +
      " in the data.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * @return a string to describe the hidden layers in the network.
   */
  public String hiddenLayersTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "This defines the hidden layers of the neural network."
      + " This is a list of positive whole numbers. 1 for each hidden layer."
      + " Comma seperated. To have no hidden layers put a single 0 here."
      + " This will only be used if autobuild is set. There are also wildcard"
      + " values 'a' = (attribs + classes) / 2, 'i' = attribs, 'o' = classes"
      + " , 't' = attribs + classes.";
  }

<<<<<<< HEAD
=======
=======
    return "This defines the hidden layers of the neural network." +
      " This is a list of positive whole numbers. 1 for each hidden layer." +
      " Comma seperated. To have no hidden layers put a single 0 here." +
      " This will only be used if autobuild is set. There are also wildcard" +
      " values 'a' = (attribs + classes) / 2, 'i' = attribs, 'o' = classes" +
      " , 't' = attribs + classes.";
  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the nominal to binary option.
   */
  public String normalizeNumericClassTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "This will normalize the class if it's numeric."
      + " This could help improve performance of the network, It normalizes"
      + " the class to be between -1 and 1. Note that this is only internally"
      + ", the output will be scaled back to the original range.";
  }

<<<<<<< HEAD
=======
=======
    return "This will normalize the class if it's numeric." +
      " This could help improve performance of the network, It normalizes" +
      " the class to be between -1 and 1. Note that this is only internally" +
      ", the output will be scaled back to the original range.";
  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the nominal to binary option.
   */
  public String normalizeAttributesTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "This will normalize the attributes."
      + " This could help improve performance of the network."
      + " This is not reliant on the class being numeric. This will also"
      + " normalize nominal attributes as well (after they have been run"
      + " through the nominal to binary filter if that is in use) so that the"
      + " nominal values are between -1 and 1";
  }

<<<<<<< HEAD
=======
=======
    return "This will normalize the attributes." +
      " This could help improve performance of the network." +
      " This is not reliant on the class being numeric. This will also" +
      " normalize nominal attributes as well (after they have been run" +
      " through the nominal to binary filter if that is in use) so that the" +
      " nominal values are between -1 and 1";
  }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the Reset option.
   */
  public String resetTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "This will allow the network to reset with a lower learning rate."
      + " If the network diverges from the answer this will automatically"
      + " reset the network with a lower learning rate and begin training"
      + " again. This option is only available if the gui is not set. Note"
      + " that if the network diverges but isn't allowed to reset it will"
      + " fail the training process and return an error message.";
  }

<<<<<<< HEAD
=======
=======
    return "This will allow the network to reset with a lower learning rate." +
      " If the network diverges from the answer this will automatically" +
      " reset the network with a lower learning rate and begin training" +
      " again. This option is only available if the gui is not set. Note" +
      " that if the network diverges but isn't allowed to reset it will" +
      " fail the training process and return an error message.";
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * @return a string to describe the Decay option.
   */
  public String decayTipText() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return "This will cause the learning rate to decrease."
      + " This will divide the starting learning rate by the epoch number, to"
      + " determine what the current learning rate should be. This may help"
      + " to stop the network from diverging from the target output, as well"
      + " as improve general performance. Note that the decaying learning"
      + " rate will not be shown in the gui, only the original learning rate"
      + ". If the learning rate is changed in the gui, this is treated as the"
      + " starting learning rate.";
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14497 $");
<<<<<<< HEAD
=======
=======
    return "This will cause the learning rate to decrease." +
      " This will divide the starting learning rate by the epoch number, to" +
      " determine what the current learning rate should be. This may help" +
      " to stop the network from diverging from the target output, as well" +
      " as improve general performance. Note that the decaying learning" +
      " rate will not be shown in the gui, only the original learning rate" +
      ". If the learning rate is changed in the gui, this is treated as the" +
      " starting learning rate.";
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10073 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
