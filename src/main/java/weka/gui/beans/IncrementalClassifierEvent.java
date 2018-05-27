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
 *    IncrementalClassifierEvent.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.gui.beans;

<<<<<<< HEAD
import java.util.EventObject;

=======
<<<<<<< HEAD
import java.util.EventObject;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.classifiers.Classifier;
import weka.core.Instance;
import weka.core.Instances;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import java.util.EventObject;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Class encapsulating an incrementally built classifier and current instance
 *
 * @author <a href="mailto:mhall@cs.waikato.ac.nz">Mark Hall</a>
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
<<<<<<< HEAD
 * @version $Revision: 8034 $
=======
 * @version $Revision: 1.9 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @since 1.0
 * @see EventObject
 */
public class IncrementalClassifierEvent
  extends EventObject {

  /** for serialization */
  private static final long serialVersionUID = 28979464317643232L;

  public static final int NEW_BATCH = 0;
  public static final int WITHIN_BATCH = 1;
  public static final int BATCH_FINISHED = 2;

  private Instances m_structure;
  private int m_status;
  protected Classifier m_classifier;
  protected Instance m_currentInstance;

  /**
   * Creates a new <code>IncrementalClassifierEvent</code> instance.
   *
   * @param source the source of the event
   * @param scheme the classifier
   * @param currentI the current instance
   * @param status the status
   */
  public IncrementalClassifierEvent(Object source, Classifier scheme,
			 Instance currentI, int status) {
    super(source);
    //    m_trainingSet = trnI;
    m_classifier = scheme;
    m_currentInstance = currentI;
    m_status = status;
  }

  /**
   * Creates a new incremental classifier event that encapsulates
   * header information and classifier.
   *
   * @param source an <code>Object</code> value
   * @param scheme a <code>Classifier</code> value
   * @param structure an <code>Instances</code> value
   */
  public IncrementalClassifierEvent(Object source, Classifier scheme,
				    Instances structure) {
    super(source);
    m_structure = structure;
    m_status = NEW_BATCH;
    m_classifier = scheme;
  }

  public IncrementalClassifierEvent(Object source) {
    super(source);
  }

  /**
   * Get the classifier
   *
   * @return the classifier
   */
  public Classifier getClassifier() {
    return m_classifier;
  }
  
  public void setClassifier(Classifier c) {
    m_classifier = c;
  }

  /**
   * Get the current instance
   *
   * @return the current instance
   */
  public Instance getCurrentInstance() {
    return m_currentInstance;
  }

  /**
   * Set the current instance for this event
   *
   * @param i an <code>Instance</code> value
   */
  public void setCurrentInstance(Instance i) {
    m_currentInstance = i;
  }

  /**
   * Get the status
   *
   * @return an <code>int</code> value
   */
  public int getStatus() {
    return m_status;
  }

  /**
   * Set the status
   *
   * @param s an <code>int</code> value
   */
  public void setStatus(int s) {
    m_status = s;
  }

  /**
   * Set the instances structure
   *
   * @param structure an <code>Instances</code> value
   */
  public void setStructure(Instances structure) {
    m_structure = structure;
    m_currentInstance = null;
    m_status = NEW_BATCH;
  }

  /**
   * Get the instances structure (may be null if this is not
   * a NEW_BATCH event)
   *
   * @return an <code>Instances</code> value
   */
  public Instances getStructure() {
    return m_structure;
  }
}

