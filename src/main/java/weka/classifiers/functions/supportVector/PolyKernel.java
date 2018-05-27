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
 *    PolyKernel.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.classifiers.functions.supportVector;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
<<<<<<< HEAD
=======
=======
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.Utils;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

/**
 * <!-- globalinfo-start --> The polynomial kernel : K(x, y) = &lt;x, y&gt;^p or
 * K(x, y) = (&lt;x, y&gt;+1)^p
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -D
 *  Enables debugging output (if available) to be printed.
 *  (default: off)
 * </pre>
 *
 * <pre>
 * -C &lt;num&gt;
 *  The size of the cache (a prime number), 0 for full cache and 
 *  -1 to turn it off.
 *  (default: 250007)
 * </pre>
 * 
 * <pre>
 * -E &lt;num&gt;
 *  The Exponent to use.
 *  (default: 1.0)
 * </pre>
 * 
 * <pre>
 * -L
 *  Use lower-order terms.
 *  (default: no)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Shane Legg (shane@intelligenesis.net) (sparse vector code)
 * @author Stuart Inglis (stuart@reeltwo.com) (sparse vector code)
 * @version $Revision: 14534 $
 */
public class PolyKernel extends CachedKernel {

  /** for serialization */
  static final long serialVersionUID = -321831645846363201L;

<<<<<<< HEAD
=======
=======
import weka.core.Capabilities.Capability;

import java.util.Enumeration;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * The polynomial kernel : K(x, y) = &lt;x, y&gt;^p or K(x, y) = (&lt;x, y&gt;+1)^p
 * <p/>
 <!-- globalinfo-end -->
 * 
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -D
 *  Enables debugging output (if available) to be printed.
 *  (default: off)</pre>
 * 
 * <pre> -no-checks
 *  Turns off all checks - use with caution!
 *  (default: checks on)</pre>
 * 
 * <pre> -C &lt;num&gt;
 *  The size of the cache (a prime number), 0 for full cache and 
 *  -1 to turn it off.
 *  (default: 250007)</pre>
 * 
 * <pre> -E &lt;num&gt;
 *  The Exponent to use.
 *  (default: 1.0)</pre>
 * 
 * <pre> -L
 *  Use lower-order terms.
 *  (default: no)</pre>
 * 
 <!-- options-end -->
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Shane Legg (shane@intelligenesis.net) (sparse vector code)
 * @author Stuart Inglis (stuart@reeltwo.com) (sparse vector code)
 * @version $Revision: 9993 $
 */
public class PolyKernel 
  extends CachedKernel {

  /** for serialization */
  static final long serialVersionUID = -321831645846363201L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** Use lower-order terms? */
  protected boolean m_lowerOrder = false;

  /** The exponent for the polynomial kernel. */
  protected double m_exponent = 1.0;

  /**
   * default constructor - does nothing.
   */
  public PolyKernel() {
    super();
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Creates a new <code>PolyKernel</code> instance.
   * 
   * @param data the training dataset used.
   * @param cacheSize the size of the cache (a prime number)
   * @param exponent the exponent to use
   * @param lowerOrder whether to use lower-order terms
   * @throws Exception if something goes wrong
   */
  public PolyKernel(Instances data, int cacheSize, double exponent,
    boolean lowerOrder) throws Exception {

    super();

<<<<<<< HEAD
=======
=======
  
  /**
   * Frees the cache used by the kernel.
   */
  public void clean() {
    if (getExponent() == 1.0) {
      m_data = null;
    }    
    super.clean();
  }

  
  /**
   * Creates a new <code>PolyKernel</code> instance.
   * 
   * @param data	the training dataset used.
   * @param cacheSize	the size of the cache (a prime number)
   * @param exponent	the exponent to use
   * @param lowerOrder	whether to use lower-order terms
   * @throws Exception	if something goes wrong
   */
  public PolyKernel(Instances data, int cacheSize, double exponent,
		    boolean lowerOrder) throws Exception {
		
    super();
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setCacheSize(cacheSize);
    setExponent(exponent);
    setUseLowerOrder(lowerOrder);

    buildKernel(data);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Returns a string describing the kernel
   * 
   * @return a description suitable for displaying in the explorer/experimenter
   *         gui
   */
  @Override
  public String globalInfo() {
    return "The polynomial kernel : K(x, y) = <x, y>^p or K(x, y) = (<x, y>+1)^p";
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tThe Exponent to use.\n"
      + "\t(default: 1.0)", "E", 1, "-E <num>"));

    result.addElement(new Option("\tUse lower-order terms.\n"
      + "\t(default: no)", "L", 0, "-L"));

    result.addAll(Collections.list(super.listOptions()));
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns a string describing the kernel
   * 
   * @return a description suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return 
        "The polynomial kernel : K(x, y) = <x, y>^p or K(x, y) = (<x, y>+1)^p";
  }
  
  /**
   * Returns an enumeration describing the available options.
   *
   * @return 		an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    Vector		result;
    Enumeration		en;
    
    result = new Vector();

    en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement(en.nextElement());

    result.addElement(new Option(
	"\tThe Exponent to use.\n"
	+ "\t(default: 1.0)",
	"E", 1, "-E <num>"));

    result.addElement(new Option(
	"\tUse lower-order terms.\n"
	+ "\t(default: no)",
	"L", 0, "-L"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.elements();
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
   * -D
   *  Enables debugging output (if available) to be printed.
   *  (default: off)
   * </pre>
   *
   * <pre>
   * -C &lt;num&gt;
   *  The size of the cache (a prime number), 0 for full cache and 
   *  -1 to turn it off.
   *  (default: 250007)
   * </pre>
   * 
   * <pre>
   * -E &lt;num&gt;
   *  The Exponent to use.
   *  (default: 1.0)
   * </pre>
   * 
   * <pre>
   * -L
   *  Use lower-order terms.
   *  (default: no)
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

    tmpStr = Utils.getOption('E', options);
    if (tmpStr.length() != 0) {
      setExponent(Double.parseDouble(tmpStr));
    } else {
      setExponent(1.0);
    }

    setUseLowerOrder(Utils.getFlag('L', options));

<<<<<<< HEAD
=======
=======
   * Parses a given list of options. <p/>
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -D
   *  Enables debugging output (if available) to be printed.
   *  (default: off)</pre>
   * 
   * <pre> -no-checks
   *  Turns off all checks - use with caution!
   *  (default: checks on)</pre>
   * 
   * <pre> -C &lt;num&gt;
   *  The size of the cache (a prime number), 0 for full cache and 
   *  -1 to turn it off.
   *  (default: 250007)</pre>
   * 
   * <pre> -E &lt;num&gt;
   *  The Exponent to use.
   *  (default: 1.0)</pre>
   * 
   * <pre> -L
   *  Use lower-order terms.
   *  (default: no)</pre>
   * 
   <!-- options-end -->
   * 
   * @param options 	the list of options as an array of strings
   * @throws Exception 	if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String	tmpStr;
    
    tmpStr = Utils.getOption('E', options);
    if (tmpStr.length() != 0)
      setExponent(Double.parseDouble(tmpStr));
    else
      setExponent(1.0);

    setUseLowerOrder(Utils.getFlag('L', options));
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setOptions(options);
  }

  /**
   * Gets the current settings of the Kernel.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
<<<<<<< HEAD
=======
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    int       i;
    Vector    result;
    String[]  options;

    result = new Vector();
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    result.add("-E");
    result.add("" + getExponent());

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (getUseLowerOrder()) {
      result.add("-L");
    }

    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
<<<<<<< HEAD
=======
=======
    if (getUseLowerOrder())
      result.add("-L");

    return (String[]) result.toArray(new String[result.size()]);	  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * 
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param id1 the index of instance 1
   * @param id2 the index of instance 2
   * @param inst1 the instance 1 object
   * @return the dot product
   * @throws Exception if something goes wrong
   */
  @Override
  protected double evaluate(int id1, int id2, Instance inst1) throws Exception {

<<<<<<< HEAD
=======
=======
   * @param id1   	the index of instance 1
   * @param id2		the index of instance 2
   * @param inst1	the instance 1 object
   * @return 		the dot product
   * @throws Exception 	if something goes wrong
   */
  protected double evaluate(int id1, int id2, Instance inst1)
    throws Exception {
		
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    double result;
    if (id1 == id2) {
      result = dotProd(inst1, inst1);
    } else {
      result = dotProd(inst1, m_data.instance(id2));
    }
    // Use lower order terms?
    if (m_lowerOrder) {
      result += 1.0;
    }
    if (m_exponent != 1.0) {
      result = Math.pow(result, m_exponent);
    }
    return result;
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Returns the Capabilities of this kernel.
   * 
   * @return the capabilities of this object
   * @see Capabilities
   */
  @Override
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();

    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.enable(Capability.NO_CLASS);

    return result;
  }

  /**
   * Sets the exponent value.
   * 
   * @param value the exponent value
<<<<<<< HEAD
=======
=======
  /** 
   * Returns the Capabilities of this kernel.
   *
   * @return            the capabilities of this object
   * @see               Capabilities
   */
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
    
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enableAllClasses();
    result.enable(Capability.MISSING_CLASS_VALUES);
    
    return result;
  }
  
  /**
   * Sets the exponent value.
   * 
   * @param value	the exponent value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setExponent(double value) {
    m_exponent = value;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets the exponent value.
   * 
   * @return the exponent value
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets the exponent value.
   * 
   * @return		the exponent value
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public double getExponent() {
    return m_exponent;
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String exponentTipText() {
    return "The exponent value.";
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Sets whether to use lower-order terms.
   * 
   * @param value true if lower-order terms will be used
<<<<<<< HEAD
=======
=======
  
  /**
   * Sets whether to use lower-order terms.
   * 
   * @param value	true if lower-order terms will be used
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public void setUseLowerOrder(boolean value) {
    m_lowerOrder = value;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets whether lower-order terms are used.
   * 
   * @return true if lower-order terms are used
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets whether lower-order terms are used.
   * 
   * @return		true if lower-order terms are used
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getUseLowerOrder() {
    return m_lowerOrder;
  }

  /**
   * Returns the tip text for this property
   * 
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
<<<<<<< HEAD
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return 		tip text for this property suitable for
   * 			displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String useLowerOrderTipText() {
    return "Whether to use lower-order terms.";
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * returns a string representation for the Kernel
   * 
   * @return a string representaiton of the kernel
   */
  @Override
  public String toString() {
    String result;

    if (getExponent() == 1.0) {
      if (getUseLowerOrder()) {
        result = "Linear Kernel with lower order: K(x,y) = <x,y> + 1";
      } else {
        result = "Linear Kernel: K(x,y) = <x,y>";
      }
    } else {
      if (getUseLowerOrder()) {
        result = "Poly Kernel with lower order: K(x,y) = (<x,y> + 1)^"
          + getExponent();
      } else {
        result = "Poly Kernel: K(x,y) = <x,y>^" + getExponent();
      }
    }

    return result;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 14534 $");
  }
}
<<<<<<< HEAD
=======
=======
  
  /**
   * returns a string representation for the Kernel
   * 
   * @return 		a string representaiton of the kernel
   */
  public String toString() {
    String	result;
    
    if (getExponent() == 1.0) {
      if (getUseLowerOrder())
        result = "Linear Kernel with lower order: K(x,y) = <x,y> + 1";
      else
        result = "Linear Kernel: K(x,y) = <x,y>";
    }
    else {
      if (getUseLowerOrder())
	result = "Poly Kernel with lower order: K(x,y) = (<x,y> + 1)^" + getExponent();
      else
	result = "Poly Kernel: K(x,y) = <x,y>^" + getExponent();
    }
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 9993 $");
  }
}

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
