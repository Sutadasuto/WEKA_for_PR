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
 *    RemoteExperiment.java
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *    Copyright (C) 2000-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.experiment;

<<<<<<< HEAD
=======
=======
 *    Copyright (C) 2000 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.experiment;

import weka.core.FastVector;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Queue;
import weka.core.RevisionUtils;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.xml.KOML;
import weka.core.xml.XMLOptions;
import weka.experiment.xml.XMLExperiment;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.Naming;
<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.Enumeration;

import javax.swing.DefaultListModel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Queue;
import weka.core.RevisionUtils;
import weka.core.SerializedObject;
import weka.core.Utils;
import weka.core.xml.KOML;
import weka.core.xml.XMLOptions;
import weka.experiment.xml.XMLExperiment;

/**
 * Holds all the necessary configuration information for a distributed
 * experiment. This object is able to be serialized for storage on disk.
 * <p>
 * 
 * This class is experimental at present. Has been tested using
 * CSVResultListener (sending results to standard out) and
 * DatabaseResultListener (InstantDB + RmiJdbc bridge).
 * <p>
 * 
 * Getting started:
 * <p>
 * 
 * Start InstantDB (with the RMI bridge) on some machine. If using java2 then
 * specify -Djava.security.policy=db.policy to the virtual machine. Where
 * db.policy is as follows: <br>
 * 
<<<<<<< HEAD
=======
=======
/**
 * Holds all the necessary configuration information for a distributed
 * experiment. This object is able to be serialized for storage on disk.<p>
 * 
 * This class is experimental at present. Has been tested using 
 * CSVResultListener (sending results to standard out) and 
 * DatabaseResultListener (InstantDB + RmiJdbc bridge). <p>
 *
 * Getting started:<p>
 *
 * Start InstantDB (with the RMI bridge) on some machine. If using java2
 * then specify -Djava.security.policy=db.policy to the
 * virtual machine. Where db.policy is as follows: <br>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * <pre>
 * grant {
 *   permission java.security.AllPermission;
 * };
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * </pre>
 * <p>
 * 
 * Start RemoteEngine servers on x machines as per the instructons in the
 * README_Experiment_Gui file. There must be a DatabaseUtils.props in either the
 * HOME or current directory of each machine, listing all necessary jdbc
 * drivers.
 * <p>
 * 
 * The machine where a RemoteExperiment is started must also have a copy of
 * DatabaseUtils.props listing the URL to the machine where the database server
 * is running (RmiJdbc + InstantDB).
 * <p>
 * 
 * Here is an example of starting a RemoteExperiment:
 * <p>
 * 
 * <pre>
 * 
<<<<<<< HEAD
=======
=======
 * </pre><p>
 *
 * Start RemoteEngine servers on x machines as per the instructons in the
 * README_Experiment_Gui file. There must be a 
 * DatabaseUtils.props in either the HOME or current directory of each
 * machine, listing all necessary jdbc drivers.<p>
 *
 * The machine where a RemoteExperiment is started must also have a copy
 * of DatabaseUtils.props listing the URL to the machine where the 
 * database server is running (RmiJdbc + InstantDB). <p>
 *
 * Here is an example of starting a RemoteExperiment: <p>
 *
 * <pre>
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * java -Djava.rmi.server.codebase=file:/path to weka classes/ \
 * weka.experiment.RemoteExperiment -L 1 -U 10 \
 * -T /home/ml/datasets/UCI/iris.arff \
 * -D "weka.experiment.DatabaseResultListener" \
 * -P "weka.experiment.RandomSplitResultProducer" \
 * -h rosebud.cs.waikato.ac.nz -h blackbird.cs.waikato.ac.nz -r -- \
 * -W weka.experiment.ClassifierSplitEvaluator -- \
 * -W weka.classifiers.bayes.NaiveBayes
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * </pre>
 * <p>
 * The "codebase" property tells rmi where to serve up weka classes from. This
 * can either be a file url (as long as a shared file system is being used that
 * is accessable by the remoteEngine servers), or http url (which of course
 * supposes that a web server is running and you have put your weka classes
 * somewhere that is web accessable). If using a file url the trailing "/" is
 * *most* important unless the weka classes are in a jar file.
 * <p>
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -L &lt;num&gt;
 *  The lower run number to start the experiment from.
 *  (default 1)
 * </pre>
 * 
 * <pre>
 * -U &lt;num&gt;
 *  The upper run number to end the experiment at (inclusive).
 *  (default 10)
 * </pre>
 * 
 * <pre>
 * -T &lt;arff file&gt;
 *  The dataset to run the experiment on.
 *  (required, may be specified multiple times)
 * </pre>
 * 
 * <pre>
 * -P &lt;class name&gt;
 *  The full class name of a ResultProducer (required).
 *  eg: weka.experiment.RandomSplitResultProducer
 * </pre>
 * 
 * <pre>
 * -D &lt;class name&gt;
 *  The full class name of a ResultListener (required).
 *  eg: weka.experiment.CSVResultListener
 * </pre>
 * 
 * <pre>
 * -N &lt;string&gt;
 *  A string containing any notes about the experiment.
 *  (default none)
 * </pre>
 * 
 * <pre>
 * Options specific to result producer weka.experiment.RandomSplitResultProducer:
 * </pre>
 * 
 * <pre>
 * -P &lt;percent&gt;
 *  The percentage of instances to use for training.
 *  (default 66)
 * </pre>
 * 
 * <pre>
 * -D
 * Save raw split evaluator output.
 * </pre>
 * 
 * <pre>
 * -O &lt;file/directory name/path&gt;
 *  The filename where raw output will be stored.
 *  If a directory name is specified then then individual
 *  outputs will be gzipped, otherwise all output will be
 *  zipped to the named file. Use in conjuction with -D. (default splitEvalutorOut.zip)
 * </pre>
 * 
 * <pre>
 * -W &lt;class name&gt;
 *  The full class name of a SplitEvaluator.
 *  eg: weka.experiment.ClassifierSplitEvaluator
 * </pre>
 * 
 * <pre>
 * -R
 *  Set when data is not to be randomized and the data sets' size.
 *  Is not to be determined via probabilistic rounding.
 * </pre>
 * 
 * <pre>
 * Options specific to split evaluator weka.experiment.ClassifierSplitEvaluator:
 * </pre>
 * 
 * <pre>
 * -W &lt;class name&gt;
 *  The full class name of the classifier.
 *  eg: weka.classifiers.bayes.NaiveBayes
 * </pre>
 * 
 * <pre>
 * -C &lt;index&gt;
 *  The index of the class for which IR statistics
 *  are to be output. (default 1)
 * </pre>
 * 
 * <pre>
 * -I &lt;index&gt;
<<<<<<< HEAD
=======
=======
 *
 * </pre> <p>
 * The "codebase" property tells rmi where to serve up weka classes from.
 * This can either be a file url (as long as a shared file system is being
 * used that is accessable by the remoteEngine servers), or http url (which
 * of course supposes that a web server is running and you have put your
 * weka classes somewhere that is web accessable). If using a file url the
 * trailing "/" is *most* important unless the weka classes are in a jar
 * file. <p>
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -L &lt;num&gt;
 *  The lower run number to start the experiment from.
 *  (default 1)</pre>
 * 
 * <pre> -U &lt;num&gt;
 *  The upper run number to end the experiment at (inclusive).
 *  (default 10)</pre>
 * 
 * <pre> -T &lt;arff file&gt;
 *  The dataset to run the experiment on.
 *  (required, may be specified multiple times)</pre>
 * 
 * <pre> -P &lt;class name&gt;
 *  The full class name of a ResultProducer (required).
 *  eg: weka.experiment.RandomSplitResultProducer</pre>
 * 
 * <pre> -D &lt;class name&gt;
 *  The full class name of a ResultListener (required).
 *  eg: weka.experiment.CSVResultListener</pre>
 * 
 * <pre> -N &lt;string&gt;
 *  A string containing any notes about the experiment.
 *  (default none)</pre>
 * 
 * <pre> 
 * Options specific to result producer weka.experiment.RandomSplitResultProducer:
 * </pre>
 * 
 * <pre> -P &lt;percent&gt;
 *  The percentage of instances to use for training.
 *  (default 66)</pre>
 * 
 * <pre> -D
 * Save raw split evaluator output.</pre>
 * 
 * <pre> -O &lt;file/directory name/path&gt;
 *  The filename where raw output will be stored.
 *  If a directory name is specified then then individual
 *  outputs will be gzipped, otherwise all output will be
 *  zipped to the named file. Use in conjuction with -D. (default splitEvalutorOut.zip)</pre>
 * 
 * <pre> -W &lt;class name&gt;
 *  The full class name of a SplitEvaluator.
 *  eg: weka.experiment.ClassifierSplitEvaluator</pre>
 * 
 * <pre> -R
 *  Set when data is not to be randomized and the data sets' size.
 *  Is not to be determined via probabilistic rounding.</pre>
 * 
 * <pre> 
 * Options specific to split evaluator weka.experiment.ClassifierSplitEvaluator:
 * </pre>
 * 
 * <pre> -W &lt;class name&gt;
 *  The full class name of the classifier.
 *  eg: weka.classifiers.bayes.NaiveBayes</pre>
 * 
 * <pre> -C &lt;index&gt;
 *  The index of the class for which IR statistics
 *  are to be output. (default 1)</pre>
 * 
 * <pre> -I &lt;index&gt;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *  The index of an attribute to output in the
 *  results. This attribute should identify an
 *  instance in order to know which instances are
 *  in the test set of a cross validation. if 0
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *  no output (default 0).
 * </pre>
 * 
 * <pre>
 * -P
 *  Add target and prediction columns to the result
 *  for each fold.
 * </pre>
 * 
 * <pre>
 * Options specific to classifier weka.classifiers.rules.ZeroR:
 * </pre>
 * 
 * <pre>
 * -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 12590 $
 */
public class RemoteExperiment extends Experiment {

<<<<<<< HEAD
=======
=======
 *  no output (default 0).</pre>
 * 
 * <pre> -P
 *  Add target and prediction columns to the result
 *  for each fold.</pre>
 * 
 * <pre> 
 * Options specific to classifier weka.classifiers.rules.ZeroR:
 * </pre>
 * 
 * <pre> -D
 *  If set, classifier is run in debug mode and
 *  may output additional info to the console</pre>
 * 
 <!-- options-end -->
 *
 * @author Mark Hall (mhall@cs.waikato.ac.nz)
 * @version $Revision: 1.16 $
 */
public class RemoteExperiment 
  extends Experiment {
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** for serialization */
  static final long serialVersionUID = -7357668825635314937L;

  /** The list of objects listening for remote experiment events */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private final ArrayList<RemoteExperimentListener> m_listeners = new ArrayList<RemoteExperimentListener>();

  /** Holds the names of machines with remoteEngine servers running */
  protected DefaultListModel m_remoteHosts = new DefaultListModel();

<<<<<<< HEAD
=======
=======
  private FastVector m_listeners = new FastVector();

  /** Holds the names of machines with remoteEngine servers running */
  protected DefaultListModel m_remoteHosts = new DefaultListModel();
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** The queue of available hosts */
  private Queue m_remoteHostsQueue = new Queue();

  /** The status of each of the remote hosts */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private int[] m_remoteHostsStatus;

  /** The number of times tasks have failed on each remote host */
  private int[] m_remoteHostFailureCounts;

  /** status of the remote host: available */
  protected static final int AVAILABLE = 0;
  /** status of the remote host: in use */
  protected static final int IN_USE = 1;
  /** status of the remote host: connection failed */
  protected static final int CONNECTION_FAILED = 2;
  /** status of the remote host: some other failure */
  protected static final int SOME_OTHER_FAILURE = 3;

  // protected static final int TO_BE_RUN=0;
  // protected static final int PROCESSING=1;
  // protected static final int FAILED=2;
  // protected static final int FINISHED=3;

  /**
   * allow at most 3 failures on a host before it is removed from the list of
   * usable hosts
   */
  protected static final int MAX_FAILURES = 3;

  /**
   * Set to true if MAX_FAILURES exceeded on all hosts or connections fail on
   * all hosts or user aborts experiment (via gui)
   */
<<<<<<< HEAD
=======
=======
  private int [] m_remoteHostsStatus;

  /** The number of times tasks have failed on each remote host */
  private int [] m_remoteHostFailureCounts;

  /** status of the remote host: available */
  protected static final int AVAILABLE=0;
  /** status of the remote host: in use */
  protected static final int IN_USE=1;
  /** status of the remote host: connection failed */
  protected static final int CONNECTION_FAILED=2;
  /** status of the remote host: some other failure */
  protected static final int SOME_OTHER_FAILURE=3;

//    protected static final int TO_BE_RUN=0;
//    protected static final int PROCESSING=1;
//    protected static final int FAILED=2;
//    protected static final int FINISHED=3;

  /** allow at most 3 failures on a host before it is removed from the list
      of usable hosts */
  protected static final int MAX_FAILURES=3;

  /** Set to true if MAX_FAILURES exceeded on all hosts or connections fail 
      on all hosts or user aborts experiment (via gui) */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private boolean m_experimentAborted = false;

  /** The number of hosts removed due to exceeding max failures */
  private int m_removedHosts;

  /** The count of failed sub-experiments */
  private int m_failedCount;

  /** The count of successfully completed sub-experiments */
  private int m_finishedCount;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * The base experiment to split up into sub experiments for remote execution
   */
  private Experiment m_baseExperiment = null;

  /** The sub experiments */
  protected Experiment[] m_subExperiments;
<<<<<<< HEAD
=======
=======
  /** The base experiment to split up into sub experiments for remote
      execution */
  private Experiment m_baseExperiment = null;

  /** The sub experiments */
  protected Experiment [] m_subExperiments;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** The queue of sub experiments waiting to be processed */
  private Queue m_subExpQueue = new Queue();

  /** The status of each of the sub-experiments */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  protected int[] m_subExpComplete;

  /** If true, then sub experiments are created on the basis of data sets. */
  protected boolean m_splitByDataSet = true;

  /** If true, then sub experiments are created on the basis of properties */
  protected boolean m_splitByProperty = false;

  /**
   * Returns true if sub experiments are to be created on the basis of data
   * set.
   * 
   * @return a <code>boolean</code> value indicating whether sub experiments are
   *         to be created on the basis of data set (true) or run number
   *         (false).
<<<<<<< HEAD
=======
=======
  protected int [] m_subExpComplete;

  /**
   * If true, then sub experiments are created on the basis of data sets
   * rather than run number.
   */
  protected boolean m_splitByDataSet = true;


  /**
   * Returns true if sub experiments are to be created on the basis of
   * data set..
   *
   * @return a <code>boolean</code> value indicating whether sub
   * experiments are to be created on the basis of data set (true) or
   * run number (false).
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public boolean getSplitByDataSet() {
    return m_splitByDataSet;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Set whether sub experiments are to be created on the basis of data set.
   * 
   * @param sd true if sub experiments are to be created on the basis of data
   *          set. Otherwise sub experiments are created on the basis of run
   *          number.
   */
  public void setSplitByDataSet(boolean sd) {
    m_splitByDataSet = sd;
    if (sd) {
      m_splitByProperty = false; // Cannot split based on both dataset and property
    }
  }

  /**
   * Returns true if sub experiments are to be created on the basis of property.
   *
   * @return a <code>boolean</code> value indicating whether sub experiments are
   *         to be created on the basis of data set (true) or run number
   *         (false).
   */
  public boolean getSplitByProperty() {
    return m_splitByProperty;
  }

  /**
   * Set whether sub experiments are to be created on the basis of property.
   *
   * @param sd true if sub experiments are to be created on the basis of data
   *          set. Otherwise sub experiments are created on the basis of run
   *          number.
   */
  public void setSplitByProperty(boolean sd) {
    m_splitByProperty = sd;
    if (sd) {
      m_splitByDataSet = false; // Cannot split based on both dataset and property
    }
  }

  /**
   * Construct a new RemoteExperiment using an empty Experiment as base
   * Experiment
   * 
   * @throws Exception if the base experiment is null
   */
  public RemoteExperiment() throws Exception {
    this(new Experiment());
  }

  /**
   * Construct a new RemoteExperiment using a base Experiment
   * 
<<<<<<< HEAD
=======
=======
   * Set whether sub experiments are to be created on the basis of
   * data set.
   *
   * @param sd true if sub experiments are to be created on the basis
   * of data set. Otherwise sub experiments are created on the basis of
   * run number.
   */
  public void setSplitByDataSet(boolean sd) {
    m_splitByDataSet = sd;
  }
  
  /**
   * Construct a new RemoteExperiment using an empty Experiment as base 
   * Experiment
   * @throws Exception if the base experiment is null
   */
  public RemoteExperiment() throws Exception {
     this(new Experiment());
  }
  
  /**
   * Construct a new RemoteExperiment using a base Experiment
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param base the base experiment to use
   * @throws Exception if the base experiment is null
   */
  public RemoteExperiment(Experiment base) throws Exception {
    setBaseExperiment(base);
  }

  /**
   * Add an object to the list of those interested in recieving update
   * information from the RemoteExperiment
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param r a listener
   */
  public void addRemoteExperimentListener(RemoteExperimentListener r) {
    m_listeners.add(r);
<<<<<<< HEAD
=======
=======
   * @param r a listener
   */
  public void addRemoteExperimentListener(RemoteExperimentListener r) {
    m_listeners.addElement(r);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Get the base experiment used by this remote experiment
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the base experiment
   */
  public Experiment getBaseExperiment() {
    return m_baseExperiment;
  }

  /**
<<<<<<< HEAD
   * Set the base experiment. A sub experiment will be created for each run in
   * the base experiment.
   * 
=======
<<<<<<< HEAD
   * Set the base experiment. A sub experiment will be created for each run in
   * the base experiment.
   * 
=======
   * Set the base experiment. A sub experiment will be created for each
   * run in the base experiment.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param base the base experiment to use.
   * @throws Exception if supplied base experiment is null
   */
  public void setBaseExperiment(Experiment base) throws Exception {
    if (base == null) {
      throw new Exception("Base experiment is null!");
    }
    m_baseExperiment = base;
    setRunLower(m_baseExperiment.getRunLower());
    setRunUpper(m_baseExperiment.getRunUpper());
    setResultListener(m_baseExperiment.getResultListener());
    setResultProducer(m_baseExperiment.getResultProducer());
    setDatasets(m_baseExperiment.getDatasets());
    setUsePropertyIterator(m_baseExperiment.getUsePropertyIterator());
    setPropertyPath(m_baseExperiment.getPropertyPath());
    setPropertyArray(m_baseExperiment.getPropertyArray());
    setNotes(m_baseExperiment.getNotes());
    m_ClassFirst = m_baseExperiment.m_ClassFirst;
    m_AdvanceDataSetFirst = m_baseExperiment.m_AdvanceDataSetFirst;
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Set the user notes.
   * 
   * @param newNotes New user notes.
   */
  @Override
  public void setNotes(String newNotes) {

<<<<<<< HEAD
=======
=======
  
  /**
   * Set the user notes.
   *
   * @param newNotes New user notes.
   */
  public void setNotes(String newNotes) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setNotes(newNotes);
    m_baseExperiment.setNotes(newNotes);
  }

  /**
   * Set the lower run number for the experiment.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newRunLower the lower run number for the experiment.
   */
  @Override
  public void setRunLower(int newRunLower) {

<<<<<<< HEAD
=======
=======
   *
   * @param newRunLower the lower run number for the experiment.
   */
  public void setRunLower(int newRunLower) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setRunLower(newRunLower);
    m_baseExperiment.setRunLower(newRunLower);
  }

  /**
   * Set the upper run number for the experiment.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newRunUpper the upper run number for the experiment.
   */
  @Override
  public void setRunUpper(int newRunUpper) {

<<<<<<< HEAD
=======
=======
   *
   * @param newRunUpper the upper run number for the experiment.
   */
  public void setRunUpper(int newRunUpper) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setRunUpper(newRunUpper);
    m_baseExperiment.setRunUpper(newRunUpper);
  }

  /**
   * Sets the result listener where results will be sent.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newResultListener the result listener where results will be sent.
   */
  @Override
  public void setResultListener(ResultListener newResultListener) {

<<<<<<< HEAD
=======
=======
   *
   * @param newResultListener the result listener where results will be sent.
   */
  public void setResultListener(ResultListener newResultListener) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setResultListener(newResultListener);
    m_baseExperiment.setResultListener(newResultListener);
  }

  /**
   * Set the result producer used for the current experiment.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newResultProducer result producer to use for the current experiment.
   */
  @Override
  public void setResultProducer(ResultProducer newResultProducer) {

<<<<<<< HEAD
=======
=======
   *
   * @param newResultProducer result producer to use for the current 
   * experiment.
   */
  public void setResultProducer(ResultProducer newResultProducer) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setResultProducer(newResultProducer);
    m_baseExperiment.setResultProducer(newResultProducer);
  }

  /**
   * Set the datasets to use in the experiment
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param ds the list of datasets to use
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @param ds the list of datasets to use
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setDatasets(DefaultListModel ds) {
    super.setDatasets(ds);
    m_baseExperiment.setDatasets(ds);
  }

  /**
   * Sets whether the custom property iterator should be used.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newUsePropertyIterator true if so
   */
  @Override
  public void setUsePropertyIterator(boolean newUsePropertyIterator) {

<<<<<<< HEAD
=======
=======
   *
   * @param newUsePropertyIterator true if so
   */
  public void setUsePropertyIterator(boolean newUsePropertyIterator) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setUsePropertyIterator(newUsePropertyIterator);
    m_baseExperiment.setUsePropertyIterator(newUsePropertyIterator);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the path of properties taken to get to the custom property to iterate
   * over.
   * 
   * @param newPropertyPath an array of PropertyNodes
   */
  @Override
  public void setPropertyPath(PropertyNode[] newPropertyPath) {

<<<<<<< HEAD
=======
=======
   * Sets the path of properties taken to get to the custom property
   * to iterate over.
   *
   * @param newPropertyPath an array of PropertyNodes
   */
  public void setPropertyPath(PropertyNode [] newPropertyPath) {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    super.setPropertyPath(newPropertyPath);
    m_baseExperiment.setPropertyPath(newPropertyPath);
  }

  /**
   * Sets the array of values to set the custom property to.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newPropArray a value of type Object which should be an array of the
   *          appropriate values.
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param newPropArray a value of type Object which should be an
   * array of the appropriate values.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setPropertyArray(Object newPropArray) {
    super.setPropertyArray(newPropArray);
    m_baseExperiment.setPropertyArray(newPropArray);
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Prepares a remote experiment for running, creates sub experiments
   * 
   * @throws Exception if an error occurs
   */
  @Override
<<<<<<< HEAD
=======
=======
    
  /**
   * Prepares a remote experiment for running, creates sub experiments
   *
   * @throws Exception if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void initialize() throws Exception {
    if (m_baseExperiment == null) {
      throw new Exception("No base experiment specified!");
    }

    m_experimentAborted = false;
    m_finishedCount = 0;
    m_failedCount = 0;
    m_RunNumber = getRunLower();
    m_DatasetNumber = 0;
    m_PropertyNumber = 0;
    m_CurrentProperty = -1;
    m_CurrentInstances = null;
    m_Finished = false;

    if (m_remoteHosts.size() == 0) {
      throw new Exception("No hosts specified!");
    }
    // initialize all remote hosts to available
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_remoteHostsStatus = new int[m_remoteHosts.size()];
    m_remoteHostFailureCounts = new int[m_remoteHosts.size()];

    m_remoteHostsQueue = new Queue();
    // prime the hosts queue
    for (int i = 0; i < m_remoteHosts.size(); i++) {
<<<<<<< HEAD
=======
=======
    m_remoteHostsStatus = new int [m_remoteHosts.size()];    
    m_remoteHostFailureCounts = new int [m_remoteHosts.size()];

    m_remoteHostsQueue = new Queue();
    // prime the hosts queue
    for (int i=0;i<m_remoteHosts.size();i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_remoteHostsQueue.push(new Integer(i));
    }

    // set up sub experiments
    m_subExpQueue = new Queue();
    int numExps;
    if (getSplitByDataSet()) {
      numExps = m_baseExperiment.getDatasets().size();
<<<<<<< HEAD
    } else if (getSplitByProperty()) {
      numExps = m_baseExperiment.getPropertyArrayLength();
=======
<<<<<<< HEAD
    } else if (getSplitByProperty()) {
      numExps = m_baseExperiment.getPropertyArrayLength();
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      numExps = getRunUpper() - getRunLower() + 1;
    }
    m_subExperiments = new Experiment[numExps];
    m_subExpComplete = new int[numExps];
    // create copy of base experiment
    SerializedObject so = new SerializedObject(m_baseExperiment);

    if (getSplitByDataSet()) {
      for (int i = 0; i < m_baseExperiment.getDatasets().size(); i++) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        m_subExperiments[i] = (Experiment) so.getObject();
        // one for each data set
        DefaultListModel temp = new DefaultListModel();
        temp.addElement(m_baseExperiment.getDatasets().get(i));
        m_subExperiments[i].setDatasets(temp);
        m_subExpQueue.push(new Integer(i));
      }
    } else if (getSplitByProperty()) {
      for (int i = 0; i < m_baseExperiment.getPropertyArrayLength(); i++) {
        m_subExperiments[i] = (Experiment) so.getObject();
        Object[] a = new Object[1];
        a[0] = m_baseExperiment.getPropertyArrayValue(i);
        m_subExperiments[i].setPropertyArray(a);
        m_subExpQueue.push(new Integer(i));
      }
    } else {
      for (int i = getRunLower(); i <= getRunUpper(); i++) {
        m_subExperiments[i - getRunLower()] = (Experiment) so.getObject();
        // one run for each sub experiment
        m_subExperiments[i - getRunLower()].setRunLower(i);
        m_subExperiments[i - getRunLower()].setRunUpper(i);

        m_subExpQueue.push(new Integer(i - getRunLower()));
      }
<<<<<<< HEAD
=======
=======
	m_subExperiments[i] = (Experiment)so.getObject();
	// one for each data set
	DefaultListModel temp = new DefaultListModel();
	temp.addElement(m_baseExperiment.getDatasets().elementAt(i));
	m_subExperiments[i].setDatasets(temp);
	m_subExpQueue.push(new Integer(i));
      }
    } else {
      for (int i = getRunLower(); i <= getRunUpper(); i++) {
	m_subExperiments[i-getRunLower()] = (Experiment)so.getObject();
	// one run for each sub experiment
	m_subExperiments[i-getRunLower()].setRunLower(i);
	m_subExperiments[i-getRunLower()].setRunUpper(i);
	
	m_subExpQueue.push(new Integer(i-getRunLower()));
      }    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Inform all listeners of progress
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param status true if this is a status type of message
   * @param log true if this is a log type of message
   * @param finished true if the remote experiment has finished
   * @param message the message.
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  private synchronized void notifyListeners(boolean status, boolean log,
    boolean finished, String message) {
    if (m_listeners.size() > 0) {
      for (int i = 0; i < m_listeners.size(); i++) {
        RemoteExperimentListener r = (m_listeners.get(i));
        r.remoteExperimentStatus(new RemoteExperimentEvent(status, log,
          finished, message));
<<<<<<< HEAD
=======
=======
  private synchronized void notifyListeners(boolean status, 
					    boolean log, 
					    boolean finished,
					    String message) {
    if (m_listeners.size() > 0) {
      for (int i=0;i<m_listeners.size();i++) {
	RemoteExperimentListener r = 
	  (RemoteExperimentListener)(m_listeners.elementAt(i));
	r.remoteExperimentStatus(new RemoteExperimentEvent(status,
							   log,
							   finished,
							   message));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } else {
      System.err.println(message);
    }
  }

  /**
   * Set the abort flag
   */
  public void abortExperiment() {
    m_experimentAborted = true;
  }

  /**
   * Increment the number of successfully completed sub experiments
   */
  protected synchronized void incrementFinished() {
    m_finishedCount++;
  }

  /**
<<<<<<< HEAD
   * Increment the overall number of failures and the number of failures for a
   * particular host
   * 
=======
<<<<<<< HEAD
   * Increment the overall number of failures and the number of failures for a
   * particular host
   * 
=======
   * Increment the overall number of failures and the number of failures for
   * a particular host
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param hostNum the index of the host to increment failure count
   */
  protected synchronized void incrementFailed(int hostNum) {
    m_failedCount++;
    m_remoteHostFailureCounts[hostNum]++;
  }

  /**
   * Push an experiment back on the queue of waiting experiments
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param expNum the index of the experiment to push onto the queue
   */
  protected synchronized void waitingExperiment(int expNum) {
    m_subExpQueue.push(new Integer(expNum));
  }

  /**
   * Check to see if we have failed to connect to all hosts
   * 
   * @return true if failed to connect to all hosts
   */
  private boolean checkForAllFailedHosts() {
    boolean allbad = true;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    for (int m_remoteHostsStatu : m_remoteHostsStatus) {
      if (m_remoteHostsStatu != CONNECTION_FAILED) {
        allbad = false;
        break;
<<<<<<< HEAD
=======
=======
    for (int i = 0; i < m_remoteHostsStatus.length; i++) {
      if (m_remoteHostsStatus[i] != CONNECTION_FAILED) {
	allbad = false;
	break;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    if (allbad) {
      abortExperiment();
<<<<<<< HEAD
      notifyListeners(false, true, true, "Experiment aborted! All connections "
        + "to remote hosts failed.");
=======
<<<<<<< HEAD
      notifyListeners(false, true, true, "Experiment aborted! All connections "
        + "to remote hosts failed.");
=======
      notifyListeners(false,true,true,"Experiment aborted! All connections "
		      +"to remote hosts failed.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return allbad;
  }

  /**
   * Returns some post experiment information.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a String containing some post experiment info
   */
  private String postExperimentInfo() {
    StringBuffer text = new StringBuffer();
<<<<<<< HEAD
    text.append(m_finishedCount + (m_splitByDataSet ? " data sets" : " runs")
      + " completed successfully. " + m_failedCount
      + " failures during running.\n");
=======
<<<<<<< HEAD
    text.append(m_finishedCount + (m_splitByDataSet ? " data sets" : " runs")
      + " completed successfully. " + m_failedCount
      + " failures during running.\n");
=======
    text.append(m_finishedCount+(m_splitByDataSet 
				 ? " data sets" 
				 : " runs") + " completed successfully. "
		+m_failedCount+" failures during running.\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    System.err.print(text.toString());
    return text.toString();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Pushes a host back onto the queue of available hosts and attempts to launch
   * a waiting experiment (if any).
   * 
   * @param hostNum the index of the host to push back onto the queue of
   *          available hosts
   */
  protected synchronized void availableHost(int hostNum) {
    if (hostNum >= 0) {
      if (m_remoteHostFailureCounts[hostNum] < MAX_FAILURES) {
        m_remoteHostsQueue.push(new Integer(hostNum));
      } else {
        notifyListeners(false, true, false, "Max failures exceeded for host "
          + ((String) m_remoteHosts.elementAt(hostNum))
          + ". Removed from host list.");
        m_removedHosts++;
<<<<<<< HEAD
=======
=======
   * Pushes a host back onto the queue of available hosts and attempts to
   * launch a waiting experiment (if any).
   * @param hostNum the index of the host to push back onto the queue of
   * available hosts
   */
  protected synchronized void availableHost(int hostNum) {
    if (hostNum >= 0) { 
      if (m_remoteHostFailureCounts[hostNum] < MAX_FAILURES) {
	m_remoteHostsQueue.push(new Integer(hostNum));
      } else {
	notifyListeners(false,true,false,"Max failures exceeded for host "
			+((String)m_remoteHosts.elementAt(hostNum))
			+". Removed from host list.");
	m_removedHosts++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    // check for all sub exp complete or all hosts failed or failed count
    // exceeded
    if (m_failedCount == (MAX_FAILURES * m_remoteHosts.size())) {
      abortExperiment();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      notifyListeners(false, true, true, "Experiment aborted! Max failures "
        + "exceeded on all remote hosts.");
      return;
    }

    if ((getSplitByDataSet() && (m_baseExperiment.getDatasets().size() == m_finishedCount))
            || (getSplitByProperty() && (m_baseExperiment.getPropertyArrayLength() == m_finishedCount))
      || (!getSplitByDataSet() && !getSplitByProperty() && (getRunUpper() - getRunLower() + 1) == m_finishedCount)) {
      notifyListeners(false, true, false, "Experiment completed successfully.");
      notifyListeners(false, true, true, postExperimentInfo());
      return;
    }

<<<<<<< HEAD
=======
=======
      notifyListeners(false,true,true,"Experiment aborted! Max failures "
		      +"exceeded on all remote hosts.");
      return;
    }

    if ((getSplitByDataSet() && 
	 (m_baseExperiment.getDatasets().size() == m_finishedCount)) ||
	(!getSplitByDataSet() && 
	 ((getRunUpper() - getRunLower() + 1) == m_finishedCount))) {
      notifyListeners(false,true,false,"Experiment completed successfully.");
      notifyListeners(false,true,true,postExperimentInfo());
      return;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (checkForAllFailedHosts()) {
      return;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_experimentAborted
      && (m_remoteHostsQueue.size() + m_removedHosts) == m_remoteHosts.size()) {
      notifyListeners(false, true, true,
        "Experiment aborted. All remote tasks " + "finished.");
    }

    if (!m_subExpQueue.empty() && !m_experimentAborted) {
      if (!m_remoteHostsQueue.empty()) {
        int availHost, waitingExp;
        try {
          availHost = ((Integer) m_remoteHostsQueue.pop()).intValue();
          waitingExp = ((Integer) m_subExpQueue.pop()).intValue();
          launchNext(waitingExp, availHost);
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    }
<<<<<<< HEAD
=======
=======
    if (m_experimentAborted && 
	(m_remoteHostsQueue.size() + m_removedHosts) == m_remoteHosts.size()) {
      notifyListeners(false,true,true,"Experiment aborted. All remote tasks "
		      +"finished.");
    }
        
    if (!m_subExpQueue.empty() && !m_experimentAborted) {
      if (!m_remoteHostsQueue.empty()) {
	int availHost, waitingExp;
	try {
	  availHost = ((Integer)m_remoteHostsQueue.pop()).intValue();
	  waitingExp = ((Integer)m_subExpQueue.pop()).intValue();
	  launchNext(waitingExp, availHost);
	} catch (Exception ex) {
	  ex.printStackTrace();
	}
      }
    }    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Launch a sub experiment on a remote host
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param wexp the index of the sub experiment to launch
   * @param ah the index of the available host to launch on
   */
  public void launchNext(final int wexp, final int ah) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    Thread subExpThread;
    subExpThread = new Thread() {
      @Override
      public void run() {
        m_remoteHostsStatus[ah] = IN_USE;
        m_subExpComplete[wexp] = TaskStatusInfo.PROCESSING;
        RemoteExperimentSubTask expSubTsk = new RemoteExperimentSubTask();
        expSubTsk.setExperiment(m_subExperiments[wexp]);
        String subTaskType = null;
        if (getSplitByDataSet()) {
          subTaskType = "dataset: "
                  + ((File) m_subExperiments[wexp].getDatasets().elementAt(0))
                  .getName();
        } else if (getSplitByProperty()) {
          subTaskType = "property: " + m_subExperiments[wexp].getPropertyArrayValue(0).getClass().getName() + " :" +
                  m_subExperiments[wexp].getPropertyArrayValue(0);
        } else {
          subTaskType = "run: " + m_subExperiments[wexp].getRunLower();
        }
        try {
          String name = "//" + ((String) m_remoteHosts.elementAt(ah))
            + "/RemoteEngine";
          Compute comp = (Compute) Naming.lookup(name);
          // assess the status of the sub-exp
          notifyListeners(false, true, false, "Starting " + subTaskType
            + " on host " + ((String) m_remoteHosts.elementAt(ah)));
          Object subTaskId = comp.executeTask(expSubTsk);
          boolean finished = false;
          TaskStatusInfo is = null;
          while (!finished) {
            try {
              Thread.sleep(2000);

              TaskStatusInfo cs = (TaskStatusInfo) comp.checkStatus(subTaskId);
              if (cs.getExecutionStatus() == TaskStatusInfo.FINISHED) {
                // push host back onto queue and try launching any waiting
                // sub-experiments
                notifyListeners(false, true, false, cs.getStatusMessage());
                m_remoteHostsStatus[ah] = AVAILABLE;
                incrementFinished();
                availableHost(ah);
                finished = true;
              } else if (cs.getExecutionStatus() == TaskStatusInfo.FAILED) {
                // a non connection related error---possibly host doesn't have
                // access to data sets or security policy is not set up
                // correctly or classifier(s) failed for some reason
                notifyListeners(false, true, false, cs.getStatusMessage());
                m_remoteHostsStatus[ah] = SOME_OTHER_FAILURE;
                m_subExpComplete[wexp] = TaskStatusInfo.FAILED;
                notifyListeners(false, true, false,
                  subTaskType + " " + cs.getStatusMessage()
                    + ". Scheduling for execution on another host.");
                incrementFailed(ah);
                // push experiment back onto queue
                waitingExperiment(wexp);
                // push host back onto queue and try launching any waiting
                // sub-experiments. Host is pushed back on the queue as the
                // failure may be temporary---eg. with InstantDB using the
                // RMI bridge, two or more threads may try to create the
                // experiment index or results table simultaneously; all but
                // one will throw an exception. These hosts are still usable
                // however.
                availableHost(ah);
                finished = true;
              } else {
                if (is == null) {
                  is = cs;
                  notifyListeners(false, true, false, cs.getStatusMessage());
                } else {
                  if (cs.getStatusMessage().compareTo(is.getStatusMessage()) != 0) {

                    notifyListeners(false, true, false, cs.getStatusMessage());
                  }
                  is = cs;
                }
              }
            } catch (InterruptedException ie) {
            }
          }

        } catch (Exception ce) {
          m_remoteHostsStatus[ah] = CONNECTION_FAILED;
          m_subExpComplete[wexp] = TaskStatusInfo.TO_BE_RUN;
          System.err.println(ce);
          ce.printStackTrace();
          notifyListeners(false, true, false, "Connection to "
            + ((String) m_remoteHosts.elementAt(ah)) + " failed. Scheduling "
            + subTaskType + " for execution on another host.");
          checkForAllFailedHosts();
          waitingExperiment(wexp);
        } finally {
          if (isInterrupted()) {
            System.err.println("Sub exp Interupted!");
          }
        }
      }
    };
<<<<<<< HEAD
=======
=======
    
    Thread subExpThread;
    subExpThread = new Thread() {
	public void run() {	      
	  m_remoteHostsStatus[ah] = IN_USE;
	  m_subExpComplete[wexp] = TaskStatusInfo.PROCESSING;
	  RemoteExperimentSubTask expSubTsk = new RemoteExperimentSubTask();
	  expSubTsk.setExperiment(m_subExperiments[wexp]);
	  String subTaskType = (getSplitByDataSet())
	    ? "dataset :" + ((File)m_subExperiments[wexp].getDatasets().
			     elementAt(0)).getName()
	    : "run :" + m_subExperiments[wexp].getRunLower();
	  try {
	    String name = "//"
	      +((String)m_remoteHosts.elementAt(ah))
	      +"/RemoteEngine";
	    Compute comp = (Compute) Naming.lookup(name);
	    // assess the status of the sub-exp
	    notifyListeners(false,true,false,"Starting "
			    +subTaskType
			    +" on host "
			    +((String)m_remoteHosts.elementAt(ah)));
	    Object subTaskId = comp.executeTask(expSubTsk);
	    boolean finished = false;
	    TaskStatusInfo is = null;
	    while (!finished) {
	      try {
		Thread.sleep(2000);
		
		TaskStatusInfo cs = (TaskStatusInfo)comp.
		  checkStatus(subTaskId);
		if (cs.getExecutionStatus() == TaskStatusInfo.FINISHED) {
		  // push host back onto queue and try launching any waiting 
		  // sub-experiments
		  notifyListeners(false, true, false,  cs.getStatusMessage());
		  m_remoteHostsStatus[ah] = AVAILABLE;
		  incrementFinished();
		  availableHost(ah);
		  finished = true;
		} else if (cs.getExecutionStatus() == TaskStatusInfo.FAILED) {
		  // a non connection related error---possibly host doesn't have
		  // access to data sets or security policy is not set up
		  // correctly or classifier(s) failed for some reason
		  notifyListeners(false, true, false,  cs.getStatusMessage());
		  m_remoteHostsStatus[ah] = SOME_OTHER_FAILURE;
		  m_subExpComplete[wexp] = TaskStatusInfo.FAILED;
		  notifyListeners(false,true,false,subTaskType
				  +" "+cs.getStatusMessage()
				  +". Scheduling for execution on another host.");
		  incrementFailed(ah);
		  // push experiment back onto queue
		  waitingExperiment(wexp);	
		  // push host back onto queue and try launching any waiting 
		  // sub-experiments. Host is pushed back on the queue as the
		  // failure may be temporary---eg. with InstantDB using the
		  // RMI bridge, two or more threads may try to create the
		  // experiment index or results table simultaneously; all but
		  // one will throw an exception. These hosts are still usable
		  // however.
		  availableHost(ah);
		  finished = true;
		} else {
		  if (is == null) {
		    is = cs;
		    notifyListeners(false, true, false, cs.getStatusMessage());
		  } else {
		    if (cs.getStatusMessage().
			compareTo(is.getStatusMessage()) != 0) {
		     
		      notifyListeners(false, true, false,  
				      cs.getStatusMessage());
		    }
		    is = cs;
		  }  
		}
	      } catch (InterruptedException ie) {
	      }
	    }	      

	  } catch (Exception ce) {
	    m_remoteHostsStatus[ah] = CONNECTION_FAILED;
	    m_subExpComplete[wexp] = TaskStatusInfo.TO_BE_RUN;
	    System.err.println(ce);
	    ce.printStackTrace();
	    notifyListeners(false,true,false,"Connection to "
			    +((String)m_remoteHosts.elementAt(ah))
			    +" failed. Scheduling "
			    +subTaskType
			    +" for execution on another host.");
	    checkForAllFailedHosts();
	    waitingExperiment(wexp);
	  } finally {
	    if (isInterrupted()) {
	      System.err.println("Sub exp Interupted!");
	    }
	  }
	}	   
      };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    subExpThread.setPriority(Thread.MIN_PRIORITY);
    subExpThread.start();
  }

  /**
   * Overides the one in Experiment
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @throws Exception never throws an exception
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @throws Exception never throws an exception
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void nextIteration() throws Exception {

  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * overides the one in Experiment
   */
  @Override
<<<<<<< HEAD
=======
=======
  /** 
   * overides the one in Experiment
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void advanceCounters() {

  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * overides the one in Experiment
   */
  @Override
  public void postProcess() {

<<<<<<< HEAD
=======
=======
  /** 
   * overides the one in Experiment
   */
  public void postProcess() {
   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Add a host name to the list of remote hosts
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param hostname the host name to add to the list
   */
  public void addRemoteHost(String hostname) {
    m_remoteHosts.addElement(hostname);
  }

  /**
   * Get the list of remote host names
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the list of remote host names
   */
  public DefaultListModel getRemoteHosts() {
    return m_remoteHosts;
  }

  /**
   * Set the list of remote host names
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param list the list of remote host names
   */
  public void setRemoteHosts(DefaultListModel list) {
    m_remoteHosts = list;
  }

  /**
   * Overides toString in Experiment
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return a description of this remote experiment
   */
  @Override
<<<<<<< HEAD
=======
=======
   * @return a description of this remote experiment
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public String toString() {
    String result = m_baseExperiment.toString();

    result += "\nRemote Hosts:\n";
<<<<<<< HEAD
    for (int i = 0; i < m_remoteHosts.size(); i++) {
      result += ((String) m_remoteHosts.elementAt(i)) + '\n';
=======
<<<<<<< HEAD
    for (int i = 0; i < m_remoteHosts.size(); i++) {
      result += ((String) m_remoteHosts.elementAt(i)) + '\n';
=======
    for (int i=0;i<m_remoteHosts.size();i++) {
      result += ((String)m_remoteHosts.elementAt(i)) +'\n';
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return result;
  }

  /**
   * Overides runExperiment in Experiment
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void runExperiment() {
    int totalHosts = m_remoteHostsQueue.size();
    // Try to launch sub experiments on all available hosts
    for (int i = 0; i < totalHosts; i++) {
      availableHost(-1);
    }
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
    return RevisionUtils.extract("$Revision: 12590 $");
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.16 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Configures/Runs the Experiment from the command line.
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param args command line arguments to the Experiment.
   */
  public static void main(String[] args) {

    try {
<<<<<<< HEAD
      weka.core.WekaPackageManager.loadPackages(false, true, false);
=======
<<<<<<< HEAD
      weka.core.WekaPackageManager.loadPackages(false, true, false);
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      RemoteExperiment exp = null;

      // get options from XML?
      String xmlOption = Utils.getOption("xml", args);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      if (!xmlOption.equals("")) {
        args = new XMLOptions(xmlOption).toArray();
      }

<<<<<<< HEAD
=======
=======
      if (!xmlOption.equals(""))
         args = new XMLOptions(xmlOption).toArray();
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Experiment base = null;
      String expFile = Utils.getOption('l', args);
      String saveFile = Utils.getOption('s', args);
      boolean runExp = Utils.getFlag('r', args);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      ArrayList<String> remoteHosts = new ArrayList<String>();
      String runHost = " ";
      while (runHost.length() != 0) {
        runHost = Utils.getOption('h', args);
        if (runHost.length() != 0) {
          remoteHosts.add(runHost);
        }
      }
      if (expFile.length() == 0) {
        base = new Experiment();
        try {
          base.setOptions(args);
          Utils.checkForRemainingOptions(args);
        } catch (Exception ex) {
          ex.printStackTrace();
          String result = "Usage:\n\n" + "-l <exp file>\n"
            + "\tLoad experiment from file (default use cli options)\n"
            + "-s <exp file>\n"
            + "\tSave experiment to file after setting other options\n"
            + "\t(default don't save)\n" + "-h <remote host name>\n"
            + "\tHost to run experiment on (may be specified more than once\n"
            + "\tfor multiple remote hosts)\n" + "-r \n"
            + "\tRun experiment on (default don't run)\n"
            + "-xml <filename | xml-string>\n"
            + "\tget options from XML-Data instead from parameters\n" + "\n";
          Enumeration<Option> enm = ((OptionHandler) base).listOptions();
          while (enm.hasMoreElements()) {
            Option option = enm.nextElement();
            result += option.synopsis() + "\n";
            result += option.description() + "\n";
          }
          throw new Exception(result + "\n" + ex.getMessage());
        }
      } else {
        Object tmp;

        // KOML?
        if ((KOML.isPresent())
          && (expFile.toLowerCase().endsWith(KOML.FILE_EXTENSION))) {
          tmp = KOML.read(expFile);
        } else
        // XML?
        if (expFile.toLowerCase().endsWith(".xml")) {
          XMLExperiment xml = new XMLExperiment();
          tmp = xml.read(expFile);
        }
        // binary
        else {
          FileInputStream fi = new FileInputStream(expFile);
          ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(
            fi));
          tmp = oi.readObject();
          oi.close();
        }
        if (tmp instanceof RemoteExperiment) {
          exp = (RemoteExperiment) tmp;
        } else {
          base = (Experiment) tmp;
        }
      }
      if (base != null) {
        exp = new RemoteExperiment(base);
      }
      for (int i = 0; i < remoteHosts.size(); i++) {
        exp.addRemoteHost(remoteHosts.get(i));
<<<<<<< HEAD
=======
=======
      FastVector remoteHosts = new FastVector();
      String runHost = " ";
      while (runHost.length() != 0) {
	runHost = Utils.getOption('h', args);
	if (runHost.length() != 0) {
	  remoteHosts.addElement(runHost);
	}
      }
      if (expFile.length() == 0) {
	base = new Experiment();
	try {
	  base.setOptions(args);
	  Utils.checkForRemainingOptions(args);
	} catch (Exception ex) {
	  ex.printStackTrace();
	  String result = "Usage:\n\n"
	    + "-l <exp file>\n"
	    + "\tLoad experiment from file (default use cli options)\n"
	    + "-s <exp file>\n"
	    + "\tSave experiment to file after setting other options\n"
	    + "\t(default don't save)\n"
	    + "-h <remote host name>\n"
	    + "\tHost to run experiment on (may be specified more than once\n"
	    + "\tfor multiple remote hosts)\n"
	    + "-r \n"
	    + "\tRun experiment on (default don't run)\n"
       + "-xml <filename | xml-string>\n"
       + "\tget options from XML-Data instead from parameters\n"
       + "\n";
	  Enumeration enm = ((OptionHandler)base).listOptions();
	  while (enm.hasMoreElements()) {
	    Option option = (Option) enm.nextElement();
	    result += option.synopsis() + "\n";
	    result += option.description() + "\n";
	  }
	  throw new Exception(result + "\n" + ex.getMessage());
	}
      } else {
         Object tmp;
         
         // KOML?
         if ( (KOML.isPresent()) && (expFile.toLowerCase().endsWith(KOML.FILE_EXTENSION)) ) {
            tmp = KOML.read(expFile);
         }
         else
         // XML?
         if (expFile.toLowerCase().endsWith(".xml")) {
            XMLExperiment xml = new XMLExperiment(); 
            tmp = xml.read(expFile);
         }
         // binary
         else {
            FileInputStream fi = new FileInputStream(expFile);
            ObjectInputStream oi = new ObjectInputStream(
                                   new BufferedInputStream(fi));
            tmp = oi.readObject();
            oi.close();
         }
	if (tmp instanceof RemoteExperiment) {
	  exp = (RemoteExperiment)tmp;
	} else {
	  base = (Experiment)tmp;
	}
      }
      if (base != null) {
	exp = new RemoteExperiment(base);
      }
      for (int i=0;i<remoteHosts.size();i++) {
	exp.addRemoteHost((String)remoteHosts.elementAt(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      System.err.println("Experiment:\n" + exp.toString());

      if (saveFile.length() != 0) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // KOML?
        if ((KOML.isPresent())
          && (saveFile.toLowerCase().endsWith(KOML.FILE_EXTENSION))) {
          KOML.write(saveFile, exp);
        } else
        // XML?
        if (saveFile.toLowerCase().endsWith(".xml")) {
          XMLExperiment xml = new XMLExperiment();
          xml.write(saveFile, exp);
        }
        // binary
        else {
          FileOutputStream fo = new FileOutputStream(saveFile);
          ObjectOutputStream oo = new ObjectOutputStream(
            new BufferedOutputStream(fo));
          oo.writeObject(exp);
          oo.close();
        }
      }

      if (runExp) {
        System.err.println("Initializing...");
        exp.initialize();
        System.err.println("Iterating...");
        exp.runExperiment();
        System.err.println("Postprocessing...");
        exp.postProcess();
      }
<<<<<<< HEAD
=======
=======
         // KOML?
         if ( (KOML.isPresent()) && (saveFile.toLowerCase().endsWith(KOML.FILE_EXTENSION)) ) {
            KOML.write(saveFile, exp);
         }
         else
         // XML?
         if (saveFile.toLowerCase().endsWith(".xml")) {
            XMLExperiment xml = new XMLExperiment(); 
            xml.write(saveFile, exp);
         }
         // binary
         else {
            FileOutputStream fo = new FileOutputStream(saveFile);
            ObjectOutputStream oo = new ObjectOutputStream(
                                    new BufferedOutputStream(fo));
            oo.writeObject(exp);
            oo.close();
         }
      }
      
      if (runExp) {
	System.err.println("Initializing...");
	exp.initialize();
	System.err.println("Iterating...");
	exp.runExperiment();
	System.err.println("Postprocessing...");
	exp.postProcess();
      }      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }
}
