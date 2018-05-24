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
 *    DatabaseResultListener.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.experiment;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ArrayList;

import weka.core.RevisionUtils;

/**
 * <!-- globalinfo-start --> Takes results from a result producer and sends them
 * to a database.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 11247 $
 */
public class DatabaseResultListener extends DatabaseUtils implements
  ResultListener {

  /** for serialization */
  static final long serialVersionUID = 7388014746954652818L;

  /** The ResultProducer to listen to */
  protected ResultProducer m_ResultProducer;

  /** The name of the current results table */
  protected String m_ResultsTableName;

=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
 *
 */


package weka.experiment;

import weka.core.FastVector;
import weka.core.RevisionUtils;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

/**
 <!-- globalinfo-start -->
 * Takes results from a result producer and sends them to a database.
 * <p/>
 <!-- globalinfo-end -->
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 5125 $
 */
public class DatabaseResultListener 
  extends DatabaseUtils
  implements ResultListener {

  /** for serialization */
  static final long serialVersionUID = 7388014746954652818L;  
  
  /** The ResultProducer to listen to */
  protected ResultProducer m_ResultProducer;
  
  /** The name of the current results table */
  protected String m_ResultsTableName;

  /** True if debugging output should be printed */
  protected boolean m_Debug = true;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** Holds the name of the key field to cache upon, or null if no caching */
  protected String m_CacheKeyName = "";

  /** Stores the index of the key column holding the cache key data */
  protected int m_CacheKeyIndex;

  /** Stores the key for which the cache is valid */
<<<<<<< HEAD
  protected Object[] m_CacheKey;

  /** Stores the cached values */
  protected ArrayList<String> m_Cache = new ArrayList<String>();

  /**
   * Returns a string describing this result listener
   * 
   * @return a description of the result listener suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Takes results from a result producer and sends them to a "
      + "database.";
=======
  protected Object [] m_CacheKey;

  /** Stores the cached values */
  protected FastVector m_Cache = new FastVector();


  /**
   * Returns a string describing this result listener
   * @return a description of the result listener suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "Takes results from a result producer and sends them to a "
      +"database.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Sets up the database drivers
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @throws Exception if an error occurs
   */
  public DatabaseResultListener() throws Exception {

    super();
  }

  /**
   * Prepare for the results to be received.
<<<<<<< HEAD
   * 
   * @param rp the ResultProducer that will generate the results
   * @throws Exception if an error occurs during preprocessing.
   */
  @Override
=======
   *
   * @param rp the ResultProducer that will generate the results
   * @throws Exception if an error occurs during preprocessing.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void preProcess(ResultProducer rp) throws Exception {

    m_ResultProducer = rp;
    // Connect to the database and find out what table corresponds to this
<<<<<<< HEAD
    // ResultProducer
    updateResultsTableName(m_ResultProducer);
  }

  /**
   * Perform any postprocessing. When this method is called, it indicates that
   * no more results will be sent that need to be grouped together in any way.
   * 
   * @param rp the ResultProducer that generated the results
   * @throws Exception if an error occurs
   */
  @Override
=======
    //   ResultProducer
    updateResultsTableName(m_ResultProducer);
  }
  
  /**
   * Perform any postprocessing. When this method is called, it indicates
   * that no more results will be sent that need to be grouped together
   * in any way.
   *
   * @param rp the ResultProducer that generated the results
   * @throws Exception if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void postProcess(ResultProducer rp) throws Exception {

    if (m_ResultProducer != rp) {
      throw new Error("Unrecognized ResultProducer calling postProcess!!");
    }
    disconnectFromDatabase();
  }
<<<<<<< HEAD

  /**
   * Determines if there are any constraints (imposed by the destination) on any
   * additional measures produced by resultProducers. Null should be returned if
   * there are NO constraints, otherwise a list of column names should be
   * returned as an array of Strings. In the case of DatabaseResultListener, the
   * structure of an existing database will impose constraints.
   * 
   * @param rp the ResultProducer to which the constraints will apply
   * @return an array of column names to which resutltProducer's results will be
   *         restricted.
   * @throws Exception if an error occurs.
   */
  @Override
  public String[] determineColumnConstraints(ResultProducer rp)
    throws Exception {
    ArrayList<String> cNames = new ArrayList<String>();
=======
  
  /**
   * Determines if there are any constraints (imposed by the
   * destination) on any additional measures produced by
   * resultProducers. Null should be returned if there are NO
   * constraints, otherwise a list of column names should be
   * returned as an array of Strings. In the case of
   * DatabaseResultListener, the structure of an existing database
   * will impose constraints.
   * @param rp the ResultProducer to which the constraints will apply
   * @return an array of column names to which resutltProducer's
   * results will be restricted.
   * @throws Exception if an error occurs.
   */
  public String [] determineColumnConstraints(ResultProducer rp) 
    throws Exception {
    FastVector cNames = new FastVector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    updateResultsTableName(rp);
    DatabaseMetaData dbmd = m_Connection.getMetaData();
    ResultSet rs;
    // gets a result set where each row is info on a column
    if (m_checkForUpperCaseNames) {
      rs = dbmd.getColumns(null, null, m_ResultsTableName.toUpperCase(), null);
    } else {
      rs = dbmd.getColumns(null, null, m_ResultsTableName, null);
    }
<<<<<<< HEAD
    boolean tableExists = false;
    int numColumns = 0;

=======
    boolean tableExists=false;
    int numColumns = 0;
   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    while (rs.next()) {
      tableExists = true;
      // column four contains the column name
      String name = rs.getString(4);
      if (name.toLowerCase().startsWith("measure")) {
<<<<<<< HEAD
        numColumns++;
        cNames.add(name);
=======
	numColumns++;
	cNames.addElement(name);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    // no constraints on any additional measures if the table does not exist
    if (!tableExists) {
      return null;
    }

    // a zero element array indicates maximum constraint
<<<<<<< HEAD
    String[] columnNames = new String[numColumns];
    for (int i = 0; i < numColumns; i++) {
      columnNames[i] = (cNames.get(i));
=======
    String [] columnNames = new String [numColumns];
    for (int i=0;i<numColumns;i++) {
      columnNames[i] = (String)(cNames.elementAt(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return columnNames;
  }

  /**
   * Submit the result to the appropriate table of the database
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rp the ResultProducer that generated the result
   * @param key The key for the results.
   * @param result The actual results.
   * @throws Exception if the result couldn't be sent to the database
   */
<<<<<<< HEAD
  @Override
  public void acceptResult(ResultProducer rp, Object[] key, Object[] result)
=======
  public void acceptResult(ResultProducer rp, Object[] key, Object[] result) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    throws Exception {

    if (m_ResultProducer != rp) {
      throw new Error("Unrecognized ResultProducer calling acceptResult!!");
    }

    // null result could occur from a chain of doRunKeys calls
    if (result != null) {
<<<<<<< HEAD
      putResultInTable(m_ResultsTableName, rp, key, result);
=======
      putResultInTable(m_ResultsTableName, rp, key, result);      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /**
<<<<<<< HEAD
   * Always says a result is required. If this is the first call, prints out the
   * header for the Database output.
   * 
=======
   * Always says a result is required. If this is the first call,
   * prints out the header for the Database output.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rp the ResultProducer wanting to generate the result
   * @param key The key for which a result may be needed.
   * @return true if the result should be calculated.
   * @throws Exception if the database couldn't be queried
   */
<<<<<<< HEAD
  @Override
  public boolean isResultRequired(ResultProducer rp, Object[] key)
    throws Exception {

=======
  public boolean isResultRequired(ResultProducer rp, Object[] key)
    throws Exception {
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (m_ResultProducer != rp) {
      throw new Error("Unrecognized ResultProducer calling isResultRequired!");
    }
    if (m_Debug) {
      System.err.print("Is result required...");
<<<<<<< HEAD
      for (Object element : key) {
        System.err.print(" " + element);
=======
      for (int i = 0; i < key.length; i++) {
	System.err.print(" " + key[i]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.err.flush();
    }
    boolean retval = false;

    // Check the key cache first
    if (!m_CacheKeyName.equals("")) {
      if (!isCacheValid(key)) {
<<<<<<< HEAD
        loadCache(rp, key);
=======
	loadCache(rp, key);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      retval = !isKeyInCache(rp, key);
    } else {
      // Ask whether the results are needed
<<<<<<< HEAD
      retval = !isKeyInTable(m_ResultsTableName, rp, key);
    }

    if (m_Debug) {
      System.err.println(" ..." + (retval ? "required" : "not required")
        + (m_CacheKeyName.equals("") ? "" : " (cache)"));
=======
      retval = !isKeyInTable(m_ResultsTableName,
					     rp, key);
    }
    
    if (m_Debug) {
      System.err.println(" ..." + (retval ? "required" : "not required")
			 + (m_CacheKeyName.equals("") ? "" : " (cache)"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.err.flush();
    }
    return retval;
  }

<<<<<<< HEAD
  /**
   * Determines the table name that results will be inserted into. If required:
   * a connection will be opened, an experiment index table created, and the
   * results table created.
   * 
=======
  
  /**
   * Determines the table name that results will be inserted into. If
   * required: a connection will be opened, an experiment index table created,
   * and the results table created.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rp the ResultProducer
   * @throws Exception if an error occurs
   */
  protected void updateResultsTableName(ResultProducer rp) throws Exception {

    if (!isConnected()) {
      connectToDatabase();
    }
    if (!experimentIndexExists()) {
      createExperimentIndex();
    }

    String tableName = getResultsTableName(rp);
    if (tableName == null) {
      tableName = createExperimentIndexEntry(rp);
    }
    if (!tableExists(tableName)) {
      createResultsTable(rp, tableName);
    }
    m_ResultsTableName = tableName;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String cacheKeyNameTipText() {
    return "Set the name of the key field by which to cache.";
  }
<<<<<<< HEAD

  /**
   * Get the value of CacheKeyName.
   * 
   * @return Value of CacheKeyName.
   */
  public String getCacheKeyName() {

    return m_CacheKeyName;
  }

  /**
   * Set the value of CacheKeyName.
   * 
   * @param newCacheKeyName Value to assign to CacheKeyName.
   */
  public void setCacheKeyName(String newCacheKeyName) {

    m_CacheKeyName = newCacheKeyName;
  }

  /**
   * Checks whether the current cache contents are valid for the supplied key.
   * 
   * @param key the results key
   * @return true if the cache contents are valid for the key given
   */
  protected boolean isCacheValid(Object[] key) {
=======
  
  /**
   * Get the value of CacheKeyName.
   *
   * @return Value of CacheKeyName.
   */
  public String getCacheKeyName() {
    
    return m_CacheKeyName;
  }

  
  /**
   * Set the value of CacheKeyName.
   *
   * @param newCacheKeyName Value to assign to CacheKeyName.
   */
  public void setCacheKeyName(String newCacheKeyName) {
    
    m_CacheKeyName = newCacheKeyName;
  }

  

  /**
   * Checks whether the current cache contents are valid for the supplied
   * key.
   *
   * @param key the results key
   * @return true if the cache contents are valid for the key given
   */
  protected boolean isCacheValid(Object []key) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (m_CacheKey == null) {
      return false;
    }
    if (m_CacheKey.length != key.length) {
      return false;
    }
    for (int i = 0; i < key.length; i++) {
      if ((i != m_CacheKeyIndex) && (!m_CacheKey[i].equals(key[i]))) {
<<<<<<< HEAD
        return false;
=======
	return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return true;
  }

  /**
<<<<<<< HEAD
   * Returns true if the supplied key is in the key cache (and thus we do not
   * need to execute a database query).
   * 
=======
   * Returns true if the supplied key is in the key cache (and thus
   * we do not need to execute a database query).
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rp the ResultProducer the key belongs to.
   * @param key the result key
   * @return true if the key is in the key cache
   * @throws Exception if an error occurs
   */
  protected boolean isKeyInCache(ResultProducer rp, Object[] key)
    throws Exception {

    for (int i = 0; i < m_Cache.size(); i++) {
<<<<<<< HEAD
      if (m_Cache.get(i).equals(key[m_CacheKeyIndex])) {
        return true;
=======
      if (m_Cache.elementAt(i).equals(key[m_CacheKeyIndex])) {
	return true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return false;
  }
<<<<<<< HEAD

  /**
   * Executes a database query to fill the key cache
   * 
=======
  
  /**
   * Executes a database query to fill the key cache
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rp the ResultProducer the key belongs to
   * @param key the key
   * @throws Exception if an error occurs
   */
<<<<<<< HEAD
  protected void loadCache(ResultProducer rp, Object[] key) throws Exception {

    System.err.print(" (updating cache)");
    System.err.flush();
    m_Cache.clear();
    m_CacheKey = null;
    String query = "SELECT Key_" + m_CacheKeyName + " FROM "
      + m_ResultsTableName;
    String[] keyNames = rp.getKeyNames();
=======
  protected void loadCache(ResultProducer rp, Object[] key)
    throws Exception {

    System.err.print(" (updating cache)"); System.err.flush();
    m_Cache.removeAllElements();
    m_CacheKey = null;
    String query = "SELECT Key_" + m_CacheKeyName
      + " FROM " + m_ResultsTableName;
    String [] keyNames = rp.getKeyNames();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    if (keyNames.length != key.length) {
      throw new Exception("Key names and key values of different lengths");
    }
    m_CacheKeyIndex = -1;
    for (int i = 0; i < keyNames.length; i++) {
      if (keyNames[i].equalsIgnoreCase(m_CacheKeyName)) {
<<<<<<< HEAD
        m_CacheKeyIndex = i;
        break;
=======
	m_CacheKeyIndex = i;
	break;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    if (m_CacheKeyIndex == -1) {
      throw new Exception("No key field named " + m_CacheKeyName
<<<<<<< HEAD
        + " (as specified for caching)");
=======
			  + " (as specified for caching)");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    boolean first = true;
    for (int i = 0; i < key.length; i++) {
      if ((key[i] != null) && (i != m_CacheKeyIndex)) {
<<<<<<< HEAD
        if (first) {
          query += " WHERE ";
          first = false;
        } else {
          query += " AND ";
        }
        query += "Key_" + keyNames[i] + '=';
        if (key[i] instanceof String) {
          query += "'" + DatabaseUtils.processKeyString(key[i].toString())
            + "'";
        } else {
          query += key[i].toString();
        }
=======
	if (first) {
	  query += " WHERE ";
	  first = false;
	} else {
	  query += " AND ";
	}
	query += "Key_" + keyNames[i] + '=';
	if (key[i] instanceof String) {
	  query += "'" + DatabaseUtils.processKeyString(key[i].toString()) + "'";
	} else {
	  query += key[i].toString();
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    ResultSet rs = select(query);
    while (rs.next()) {
      String keyVal = rs.getString(1);
      if (!rs.wasNull()) {
<<<<<<< HEAD
        m_Cache.add(keyVal);
      }
    }
    close(rs);
    m_CacheKey = key.clone();
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 11247 $");
=======
	m_Cache.addElement(keyVal);
      }
    }
    close(rs);
    m_CacheKey = (Object [])key.clone();
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5125 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }
}
