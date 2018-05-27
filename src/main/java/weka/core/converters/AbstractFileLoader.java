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
 * AbstractFileLoader.java
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2006-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 */

package weka.core.converters;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;

<<<<<<< HEAD
=======
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import weka.core.Environment;
import weka.core.EnvironmentHandler;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.Utils;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
/**
 * Abstract superclass for all file loaders.
 * 
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 12104 $
 */
public abstract class AbstractFileLoader extends AbstractLoader implements
  FileSourcedConverter, EnvironmentHandler {

  /* ID to avoid warning */
  private static final long serialVersionUID = 5535537461920594758L;

  /** the file */
  protected String m_File = (new File(System.getProperty("user.dir")))
    .getAbsolutePath();
<<<<<<< HEAD
=======
=======
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;


/**
 * Abstract superclass for all file loaders.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 7391 $
 */
public abstract class AbstractFileLoader
  extends AbstractLoader
  implements FileSourcedConverter, EnvironmentHandler {

  /** the file */
  protected String m_File = (new File(System.getProperty("user.dir"))).getAbsolutePath();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Holds the determined structure (header) of the data set. */
  protected transient Instances m_structure = null;

  /** Holds the source of the data set. */
  protected File m_sourceFile = null;

  /** the extension for compressed files */
  public static String FILE_EXTENSION_COMPRESSED = ".gz";

  /** use relative file paths */
  protected boolean m_useRelativePath = false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** Environment variables */
  protected transient Environment m_env;

  /**
   * get the File specified as the source
   * 
   * @return the source file
   */
  @Override
<<<<<<< HEAD
=======
=======
  
  /** Environment variables */
  protected transient Environment m_env;
  
  /**
   * get the File specified as the source
   *
   * @return the source file
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public File retrieveFile() {
    return new File(m_File);
  }

  /**
   * sets the source File
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param file the source file
   * @exception IOException if an error occurs
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param file the source file
   * @exception IOException if an error occurs
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setFile(File file) throws IOException {
    m_structure = null;
    setRetrieval(NONE);

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    // m_File = file.getAbsolutePath();
    setSource(file);
  }

<<<<<<< HEAD
=======
=======
    //m_File = file.getAbsolutePath();
    setSource(file);
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Set the environment variables to use.
   * 
   * @param env the environment variables to use
   */
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  @Override
  public void setEnvironment(Environment env) {
    m_env = env;
    try {
      // causes setSource(File) to be called and
<<<<<<< HEAD
=======
=======
  public void setEnvironment(Environment env) {
    m_env = env;
    try {
      // causes setSource(File) to be called and 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      // forces the input stream to be reset with a new file
      // that has environment variables resolved with those
      // in the new Environment object
      reset();
    } catch (IOException ex) {
      // we won't complain about it here...
    }
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Resets the loader ready to read a new data set
   * 
   * @throws IOException if something goes wrong
   */
<<<<<<< HEAD
  @Override
=======
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void reset() throws IOException {
    m_structure = null;
    setRetrieval(NONE);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Resets the Loader object and sets the source of the data set to be the
   * supplied File object.
   * 
   * @param file the source file.
   * @throws IOException if an error occurs
   */
  @Override
  public void setSource(File file) throws IOException {
    File original = file;
    m_structure = null;

    setRetrieval(NONE);

    if (file == null) {
      throw new IOException("Source file object is null!");
    }

    // try {
    String fName = file.getPath();
    try {
      if (m_env == null) {
        m_env = Environment.getSystemWide();
      }
      fName = m_env.substitute(fName);
    } catch (Exception e) {
      // ignore any missing environment variables at this time
      // as it is possible that these may be set by the time
      // the actual file is processed

      // throw new IOException(e.getMessage());
    }
    file = new File(fName);
    // set the source only if the file exists
    if (file.exists() && file.isFile()) {
      if (file.getName().endsWith(
        getFileExtension() + FILE_EXTENSION_COMPRESSED)) {
        setSource(new GZIPInputStream(new FileInputStream(file)));
      } else {
        setSource(new FileInputStream(file));
      }
    } else {
      // System.out.println("Looking in classpath....");
      // look for it as a resource in the classpath

      // forward slashes are platform independent for loading from the
      // classpath...
      String fnameWithCorrectSeparators = fName
        .replace(File.separatorChar, '/');
      if (this.getClass().getClassLoader()
        .getResource(fnameWithCorrectSeparators) != null) {
        // System.out.println("Found resource in classpath...");
        setSource(this.getClass().getClassLoader()
          .getResourceAsStream(fnameWithCorrectSeparators));
      }
    }
    // }
    /*
     * catch (FileNotFoundException ex) { throw new
     * IOException("File not found"); }
     */
<<<<<<< HEAD
=======
=======
   * Resets the Loader object and sets the source of the data set to be 
   * the supplied File object.
   *
   * @param file 		the source file.
   * @throws IOException 	if an error occurs
   */
  public void setSource(File file) throws IOException {
    File original = file;
    m_structure = null;
    
    setRetrieval(NONE);

    if (file == null)
      throw new IOException("Source file object is null!");

  //  try {
      String fName = file.getPath();
      try {
        if (m_env == null) {
          m_env = Environment.getSystemWide();
        }
        fName = m_env.substitute(fName);
      } catch (Exception e) {
        // ignore any missing environment variables at this time
        // as it is possible that these may be set by the time
        // the actual file is processed
        
        //throw new IOException(e.getMessage());
      }
      file = new File(fName);
      // set the source only if the file exists
      if (file.exists()) {
        if (file.getName().endsWith(getFileExtension() + FILE_EXTENSION_COMPRESSED)) {
          setSource(new GZIPInputStream(new FileInputStream(file)));
        } else {
          setSource(new FileInputStream(file));
        }
      }
   // }
  /*  catch (FileNotFoundException ex) {
      throw new IOException("File not found");
    } */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_useRelativePath) {
      try {
        m_sourceFile = Utils.convertToRelativePath(original);
        m_File = m_sourceFile.getPath();
      } catch (Exception ex) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        // System.err.println("[AbstractFileLoader] can't convert path to relative path.");
        m_sourceFile = original;
        m_File = m_sourceFile.getPath();
      }
    } else {
      m_sourceFile = original;
      m_File = m_sourceFile.getPath();
<<<<<<< HEAD
=======
=======
        //        System.err.println("[AbstractFileLoader] can't convert path to relative path.");
        m_sourceFile = original;
        m_File       = m_sourceFile.getPath();
      }
    } else {
      m_sourceFile = original;
      m_File       = m_sourceFile.getPath();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Resets the Loader object and sets the source of the data set to be the
   * supplied File object.
   * 
   * @param file the source file.
   * @exception IOException if an error occurs
   * 
   *              public void setSource(File file) throws IOException {
   *              m_structure = null; setRetrieval(NONE);
   * 
   *              if (file == null) { throw new
   *              IOException("Source file object is null!"); }
   * 
   *              try { setSource(new FileInputStream(file)); } catch
   *              (FileNotFoundException ex) { throw new
   *              IOException("File not found"); }
   * 
   *              m_sourceFile = file; m_File = file.getAbsolutePath(); }
   */

  /**
   * Tip text suitable for displaying int the GUI
   * 
<<<<<<< HEAD
=======
=======
   * Resets the Loader object and sets the source of the data set to be 
   * the supplied File object.
   *
   * @param file the source file.
   * @exception IOException if an error occurs
   *
  public void setSource(File file) throws IOException {
    m_structure = null;
    setRetrieval(NONE);

    if (file == null) {
      throw new IOException("Source file object is null!");
    }

    try {
      setSource(new FileInputStream(file));
    }
    catch (FileNotFoundException ex) {
      throw new IOException("File not found");
    }

    m_sourceFile = file;
    m_File       = file.getAbsolutePath();
    } */

  /**
   * Tip text suitable for displaying int the GUI
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return a description of this property as a String
   */
  public String useRelativePathTipText() {
    return "Use relative rather than absolute paths";
  }

  /**
   * Set whether to use relative rather than absolute paths
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param rp true if relative paths are to be used
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @param rp true if relative paths are to be used
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public void setUseRelativePath(boolean rp) {
    m_useRelativePath = rp;
  }

  /**
   * Gets whether relative paths are to be used
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @return true if relative paths are to be used
   */
  @Override
<<<<<<< HEAD
=======
=======
   *
   * @return true if relative paths are to be used
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public boolean getUseRelativePath() {
    return m_useRelativePath;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * generates a string suitable for output on the command line displaying all
   * available options (currently only a simple usage).
   * 
   * @param loader the loader to create the option string for
   * @return the option string
   */
  protected static String makeOptionStr(AbstractFileLoader loader) {
    StringBuffer result;
    Option option;

    result = new StringBuffer("\nUsage:\n");
    result.append("\t" + loader.getClass().getName().replaceAll(".*\\.", ""));
    result.append(" <");
    String[] ext = loader.getFileExtensions();
    for (int i = 0; i < ext.length; i++) {
      if (i > 0) {
        result.append(" | ");
      }
      result.append("file" + ext[i]);
    }
    result.append(">");
    if (loader instanceof OptionHandler) {
      result.append(" [options]");
    }
    result.append("\n");

    if (loader instanceof OptionHandler) {
      result.append("\nOptions:\n\n");
      Enumeration<Option> enm = ((OptionHandler) loader).listOptions();
      while (enm.hasMoreElements()) {
        option = enm.nextElement();
        result.append(option.synopsis() + "\n");
        result.append(option.description() + "\n");
      }
    }

    return result.toString();
  }

  /**
   * runs the given loader with the provided options
   * 
   * @param loader the loader to run
   * @param options the commandline options, first argument must be the file to
   *          load
<<<<<<< HEAD
=======
=======
   * generates a string suitable for output on the command line displaying
   * all available options (currently only a simple usage).
   * 
   * @param loader	the loader to create the option string for
   * @return		the option string
   */
  protected static String makeOptionStr(AbstractFileLoader loader) {
    StringBuffer 	result;
    Option 		option;
    
    result = new StringBuffer("\nUsage:\n");
    result.append("\t" + loader.getClass().getName().replaceAll(".*\\.", ""));
    if (loader instanceof OptionHandler)
      result.append(" [options]");
    result.append(" <");
    String[] ext = loader.getFileExtensions();
    for (int i = 0; i < ext.length; i++) {
	if (i > 0)
	  result.append(" | ");
	result.append("file" + ext[i]);
    }
    result.append(">\n");

    if (loader instanceof OptionHandler) {
      result.append("\nOptions:\n\n");
      Enumeration enm = ((OptionHandler) loader).listOptions();
      while (enm.hasMoreElements()) {
	option = (Option) enm.nextElement();
	result.append(option.synopsis() + "\n");
	result.append(option.description() + "\n");
      }
    }
    
    return result.toString();
  }
  
  /**
   * runs the given loader with the provided options
   * 
   * @param loader	the loader to run
   * @param options	the commandline options, first argument must be the
   * 			file to load
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   */
  public static void runFileLoader(AbstractFileLoader loader, String[] options) {
    // help request?
    try {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      String[] tmpOptions = options.clone();
      if (Utils.getFlag('h', tmpOptions)) {
        System.err.println("\nHelp requested\n" + makeOptionStr(loader));
        return;
      }
    } catch (Exception e) {
      // ignore it
    }

    if (options.length > 0) {
      String fileName = options[0];
      options[0] = "";
      if (loader instanceof OptionHandler) {
        // set options
        try {
          ((OptionHandler) loader).setOptions(options);
          // find file
          for (int i = 0; i < options.length; i++) {
            if (options[i].length() > 0) {
              options = new String[] { options[i] };
              break;
            }
          }
        } catch (Exception ex) {
          System.err.println(makeOptionStr(loader));
          System.exit(1);
        }
      }

      try {
        loader.setFile(new File(fileName));
        // incremental
        if (loader instanceof IncrementalConverter) {
          Instances structure = loader.getStructure();
          System.out.println(structure);
          Instance temp;
          do {
            temp = loader.getNextInstance(structure);
            if (temp != null) {
              System.out.println(temp);
            }
          } while (temp != null);
        }
        // batch
        else {
          System.out.println(loader.getDataSet());
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    } else {
<<<<<<< HEAD
=======
=======
      String[] tmpOptions = (String[]) options.clone();
      if (Utils.getFlag('h', tmpOptions)) {
	System.err.println("\nHelp requested\n" + makeOptionStr(loader));
	return;
      }
    }
    catch (Exception e) {
      // ignore it
    }
    
    if (options.length > 0) {
      if (loader instanceof OptionHandler) {
	// set options
	try {
	  ((OptionHandler) loader).setOptions(options);
	  // find file
	  for (int i = 0; i < options.length; i++) {
	    if (options[i].length() > 0) {
	      options = new String[]{options[i]};
	      break;
	    }
	  }
	}
	catch (Exception ex) {
	  System.err.println(makeOptionStr(loader));
	  System.exit(1);
	}
      }
      
      try {
	loader.setFile(new File(options[0]));
	// incremental
	if (loader instanceof IncrementalConverter) {
	  Instances structure = loader.getStructure();
	  System.out.println(structure);
	  Instance temp;
	  do {
	    temp = loader.getNextInstance(structure);
	    if (temp != null)
	      System.out.println(temp);
	  }
	  while (temp != null);
	}
	// batch
	else {
	  System.out.println(loader.getDataSet());
	}
      }
      catch (Exception ex) {
	ex.printStackTrace();
      }
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.err.println(makeOptionStr(loader));
    }
  }
}
