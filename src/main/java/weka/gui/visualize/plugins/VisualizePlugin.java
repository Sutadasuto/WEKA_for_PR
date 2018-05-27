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
 * VisualizePlugin.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * Written by Jeffery Grajkowski of the AICML
 *
 */

package weka.gui.visualize.plugins;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;

import javax.swing.JMenuItem;

import weka.classifiers.evaluation.Prediction;
import weka.core.Attribute;

/**
 * Interface implemented by classes loaded dynamically to visualize classifier
 * results in the explorer.
 * 
 * @author Jeffery Grajkowski (grajkows@cs.ualberta.ca)
 * @version $Revision: 10216 $
<<<<<<< HEAD
=======
=======
import weka.core.FastVector;
import weka.core.Attribute;
import javax.swing.JMenuItem;

/**
 * Interface implemented by classes loaded dynamically to
 * visualize classifier results in the explorer.
 *
 * @author Jeffery Grajkowski (grajkows@cs.ualberta.ca)
 * @version $Revision: 1.1 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public interface VisualizePlugin {

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Get a JMenu or JMenuItem which contain action listeners that perform the
   * visualization, using some but not necessarily all of the data. Exceptions
   * thrown because of changes in Weka since compilation need to be caught by
   * the implementer.
   * 
   * @see NoClassDefFoundError
   * @see IncompatibleClassChangeError
   * 
   * @param preds predictions
   * @param classAtt class attribute
   * @return menuitem for opening visualization(s), or null to indicate no
   *         visualization is applicable for the input
   */
  public JMenuItem getVisualizeMenuItem(ArrayList<Prediction> preds,
    Attribute classAtt);

  /**
   * Get the minimum version of Weka, inclusive, the class is designed to work
   * with. eg: <code>3.5.0</code>
<<<<<<< HEAD
=======
=======
   * Get a JMenu or JMenuItem which contain action listeners
   * that perform the visualization, using some but not
   * necessarily all of the data.  Exceptions thrown because of
   * changes in Weka since compilation need to be caught by
   * the implementer.
   *
   * @see NoClassDefFoundError
   * @see IncompatibleClassChangeError
   *
   * @param  preds predictions
   * @param  classAtt class attribute
   * @return menuitem for opening visualization(s), or null
   *         to indicate no visualization is applicable for the input
   */
  public JMenuItem getVisualizeMenuItem(FastVector preds, Attribute classAtt);

  /**
   * Get the minimum version of Weka, inclusive, the class
   * is designed to work with.  eg: <code>3.5.0</code>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getMinVersion();

  /**
<<<<<<< HEAD
   * Get the maximum version of Weka, exclusive, the class is designed to work
   * with. eg: <code>3.6.0</code>
=======
<<<<<<< HEAD
   * Get the maximum version of Weka, exclusive, the class is designed to work
   * with. eg: <code>3.6.0</code>
=======
   * Get the maximum version of Weka, exclusive, the class
   * is designed to work with.  eg: <code>3.6.0</code>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public String getMaxVersion();

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Get the specific version of Weka the class is designed for. eg:
   * <code>3.5.1</code>
   */
  public String getDesignVersion();
}
<<<<<<< HEAD
=======
=======
   * Get the specific version of Weka the class is designed for.
   * eg: <code>3.5.1</code>
   */
  public String getDesignVersion();
}



>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
