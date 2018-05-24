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
 *    RandomizableIteratedSingleClassifierEnhancer.java
<<<<<<< HEAD
 *    Copyright (C) 2004-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2004 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.classifiers;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Option;
import weka.core.Randomizable;
import weka.core.Utils;

<<<<<<< HEAD
/**
 * Abstract utility class for handling settings common to randomizable
 * meta classifiers that build an ensemble from a single base learner.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 10141 $
 */
public abstract class RandomizableIteratedSingleClassifierEnhancer
=======
import java.util.Enumeration;
import java.util.Vector;

/**
 * Abstract utility class for handling settings common to randomizable
 * meta classifiers that build an ensemble from a single base learner.  
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @version $Revision: 1.4 $
 */
public abstract class RandomizableIteratedSingleClassifierEnhancer 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  extends IteratedSingleClassifierEnhancer implements Randomizable {

  /** for serialization */
  private static final long serialVersionUID = 5063351391524938557L;
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** The random number seed. */
  protected int m_Seed = 1;

  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  public Enumeration<Option> listOptions() {

    Vector<Option> newVector = new Vector<Option>(2);

    newVector.addElement(new Option(
          "\tRandom number seed.\n"
          + "\t(default 1)",
          "S", 1, "-S <num>"));

    newVector.addAll(Collections.list(super.listOptions()));
    
=======
  public Enumeration listOptions() {

    Vector newVector = new Vector(2);

    newVector.addElement(new Option(
	      "\tRandom number seed.\n"
	      + "\t(default 1)",
	      "S", 1, "-S <num>"));

    Enumeration enu = super.listOptions();
    while (enu.hasMoreElements()) {
      newVector.addElement(enu.nextElement());
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return newVector.elements();
  }

  /**
   * Parses a given list of options. Valid options are:<p>
   *
   * -W classname <br>
   * Specify the full class name of the base learner.<p>
   *
   * -I num <br>
   * Set the number of iterations (default 10). <p>
   *
   * -S num <br>
   * Set the random number seed (default 1). <p>
   *
   * Options after -- are passed to the designated classifier.<p>
   *
   * @param options the list of options as an array of strings
   * @exception Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    String seed = Utils.getOption('S', options);
    if (seed.length() != 0) {
      setSeed(Integer.parseInt(seed));
    } else {
      setSeed(1);
    }

    super.setOptions(options);
  }

  /**
   * Gets the current settings of the classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String [] getOptions() {

<<<<<<< HEAD
    Vector<String> options = new Vector<String>();

    options.add("-S");
    options.add("" + getSeed());

    Collections.addAll(options, super.getOptions());

    return options.toArray(new String[0]);
  }

=======
    String [] superOptions = super.getOptions();
    String [] options = new String [superOptions.length + 2];

    int current = 0;
    options[current++] = "-S"; 
    options[current++] = "" + getSeed();

    System.arraycopy(superOptions, 0, options, current, 
		     superOptions.length);

    return options;
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
   */
  public String seedTipText() {
    return "The random number seed to be used.";
  }

  /**
   * Set the seed for random number generation.
   *
<<<<<<< HEAD
   * @param seed the seed
=======
   * @param seed the seed 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setSeed(int seed) {

    m_Seed = seed;
  }

  /**
   * Gets the seed for the random number generations
   *
   * @return the seed for the random number generation
   */
  public int getSeed() {
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_Seed;
  }
}
