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
 * FileLogger.java
<<<<<<< HEAD
 * Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.core.logging;

<<<<<<< HEAD
import weka.core.ResourceUtils;
=======
<<<<<<< HEAD
import weka.core.ResourceUtils;
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.RevisionUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.regex.Matcher;

/**
 * A simple file logger, that just logs to a single file. Deletes the file
 * when an object gets instantiated.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 14281 $
=======
<<<<<<< HEAD
 * @version $Revision: 14281 $
=======
 * @version $Revision: 7462 $
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */
public class FileLogger
  extends ConsoleLogger {

  /** the log file. */
  protected File m_LogFile;
  
  /** the line feed. */
  protected String m_LineFeed;
  
  /**
   * Initializes the logger.
   */
  protected void initialize() {
    super.initialize();

    // log file
    m_LogFile = getLogFile();
    // try to remove file
    try {
      if ((m_LogFile != null) && m_LogFile.exists())
	m_LogFile.delete();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    // the line feed
    m_LineFeed = System.getProperty("line.separator");
  }
  
  /**
   * Returns the log file to use.
   * 
   * @return		the log file
   */
  protected File getLogFile() {
    String	filename;
    File	result;
    
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    filename = m_Properties.getProperty("LogFile", "%w" + File.separator + "weka.log");
    filename = filename.replaceAll("%t", Matcher.quoteReplacement(System.getProperty("java.io.tmpdir")));
    filename = filename.replaceAll("%h", Matcher.quoteReplacement(System.getProperty("user.home")));
    filename = filename.replaceAll("%c", Matcher.quoteReplacement(System.getProperty("user.dir")));
    filename = filename.replaceAll("%w", Matcher.quoteReplacement(ResourceUtils.getWekaHome().toString()));
<<<<<<< HEAD
=======
=======
    filename = m_Properties.getProperty("LogFile", "%h" + File.separator + "weka.log");

    filename = filename.replaceAll("%t", Matcher.quoteReplacement(System.getProperty("java.io.tmpdir")));
    filename = filename.replaceAll("%h", Matcher.quoteReplacement(System.getProperty("user.home")));
    filename = filename.replaceAll("%c", Matcher.quoteReplacement(System.getProperty("user.dir")));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (System.getProperty("%") != null && System.getProperty("%").length() > 0) {
      filename = filename.replaceAll("%%", Matcher.quoteReplacement(System.getProperty("%")));
    }
    
    result = new File(filename);
    
    return result;
  }
  
  /**
   * Appends the given string to the log file (without new line!).
   * 
   * @param s		the string to append
   */
  protected void append(String s) {
    BufferedWriter	writer;
   
    if (m_LogFile == null)
      return;
    
    // append output to file
    try {
      writer = new BufferedWriter(new FileWriter(m_LogFile, true));
      writer.write(s);
      writer.flush();
      writer.close();
    }
    catch (Exception e) {
      // ignored
    }
  }

  /**
   * Performs the actual logging. 
   * 
   * @param level	the level of the message
   * @param msg		the message to log
   * @param cls		the classname originating the log event
   * @param method	the method originating the log event
   * @param lineno	the line number originating the log event
   */
  protected void doLog(Level level, String msg, String cls, String method, int lineno) {
    // output to console
    super.doLog(level, msg, cls, method, lineno);
    
    // append output to file
    append(
	m_DateFormat.format(new Date()) + " " + cls + " " + method + m_LineFeed
	+ level + ": " + msg + m_LineFeed);
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 14281 $");
=======
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 14281 $");
=======
    return RevisionUtils.extract("$Revision: 7462 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
