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
 * Version.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.core;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * This class contains the version number of the current WEKA release and some
 * methods for comparing another version string. The normal layout of a version
 * string is "MAJOR.MINOR.REVISION", but it can also handle partial version
 * strings, e.g. "3.4". <br/>
 * Should be used e.g. in exports to XML for keeping track, with which version
 * of WEKA the file was produced.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 10203 $
 */
public class Version implements Comparable<String>, RevisionHandler {
=======
 * @version $Revision: 1.8 $
 */
public class Version implements Comparable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** the version file */
  public final static String VERSION_FILE = "weka/core/version.txt";

  /** the major version */
  public static int MAJOR = 3;

  /** the minor version */
  public static int MINOR = 4;

  /** the revision */
  public static int REVISION = 3;

<<<<<<< HEAD
  /** point revision */
  public static int POINT = 0;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** True if snapshot */
  public static boolean SNAPSHOT = false;

  protected static final String SNAPSHOT_STRING = "-SNAPSHOT";

  static {
    try {
      InputStream inR = (new Version()).getClass().getClassLoader()
<<<<<<< HEAD
        .getResourceAsStream(VERSION_FILE);
=======
          .getResourceAsStream(VERSION_FILE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // InputStream inR = ClassLoader.getSystemResourceAsStream(VERSION_FILE);
      LineNumberReader lnr = new LineNumberReader(new InputStreamReader(inR));

      String line = lnr.readLine();
      int[] maj = new int[1];
      int[] min = new int[1];
      int[] rev = new int[1];
<<<<<<< HEAD
      int[] point = new int[1];
      SNAPSHOT = parseVersion(line, maj, min, rev, point);
      MAJOR = maj[0];
      MINOR = min[0];
      REVISION = rev[0];
      POINT = point[0];
      lnr.close();
    } catch (Exception e) {
      System.err.println(Version.class.getName()
        + ": Unable to load version information!");
=======
      SNAPSHOT = parseVersion(line, maj, min, rev);
      MAJOR = maj[0];
      MINOR = min[0];
      REVISION = rev[0];
      lnr.close();
    } catch (Exception e) {
      System.err.println(Version.class.getName()
          + ": Unable to load version information!");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
  }

  /** the complete version */
  public static String VERSION = MAJOR + "." + MINOR + "." + REVISION
<<<<<<< HEAD
    + (POINT > 0 ? "." + POINT : "") + (SNAPSHOT ? SNAPSHOT_STRING : "");
=======
      + (SNAPSHOT ? SNAPSHOT_STRING : "");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /**
   * parses the version and stores the result in the arrays
   * 
   * @param version the version string to parse (contains "-" instead of "."!)
   * @param maj the major version
   * @param min the minor version
   * @param rev the revision version
   */
  private static boolean parseVersion(String version, int[] maj, int[] min,
<<<<<<< HEAD
    int[] rev, int[] point) {
    int major = 0;
    int minor = 0;
    int revision = 0;
    int pnt = 0;
=======
      int[] rev) {
    int major = 0;
    int minor = 0;
    int revision = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    boolean isSnapshot = false;

    try {
      String tmpStr = version;
      if (tmpStr.toLowerCase().endsWith("-snapshot")) {
        tmpStr = tmpStr.substring(0, tmpStr.toLowerCase().indexOf("-snapshot"));
        isSnapshot = true;
      }
      tmpStr = tmpStr.replace('-', '.');
      if (tmpStr.indexOf(".") > -1) {
        major = Integer.parseInt(tmpStr.substring(0, tmpStr.indexOf(".")));
        tmpStr = tmpStr.substring(tmpStr.indexOf(".") + 1);
        if (tmpStr.indexOf(".") > -1) {
          minor = Integer.parseInt(tmpStr.substring(0, tmpStr.indexOf(".")));
          tmpStr = tmpStr.substring(tmpStr.indexOf(".") + 1);
<<<<<<< HEAD
          if (tmpStr.indexOf(".") > 0) {
            revision = Integer
              .parseInt(tmpStr.substring(0, tmpStr.indexOf(".")));
            tmpStr = tmpStr.substring(tmpStr.indexOf(".") + 1);

            if (!tmpStr.equals("")) {
              pnt = Integer.parseInt(tmpStr);
            } else {
              pnt = 0;
            }
          } else {
            if (!tmpStr.equals("")) {
              revision = Integer.parseInt(tmpStr);
            } else {
              revision = 0;
            }
          }
        } else {
          if (!tmpStr.equals("")) {
            minor = Integer.parseInt(tmpStr);
          } else {
            minor = 0;
          }
        }
      } else {
        if (!tmpStr.equals("")) {
          major = Integer.parseInt(tmpStr);
        } else {
          major = 0;
        }
=======
          if (!tmpStr.equals(""))
            revision = Integer.parseInt(tmpStr);
          else
            revision = 0;
        } else {
          if (!tmpStr.equals(""))
            minor = Integer.parseInt(tmpStr);
          else
            minor = 0;
        }
      } else {
        if (!tmpStr.equals(""))
          major = Integer.parseInt(tmpStr);
        else
          major = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    } catch (Exception e) {
      e.printStackTrace();
      major = -1;
      minor = -1;
      revision = -1;
    } finally {
      maj[0] = major;
      min[0] = minor;
      rev[0] = revision;
<<<<<<< HEAD
      point[0] = pnt;
    }

=======
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return isSnapshot;
  }

  /**
   * checks the version of this class against the given version-string
   * 
   * @param o the version-string to compare with
   * @return -1 if this version is less, 0 if equal and +1 if greater than the
   *         provided version
   */
<<<<<<< HEAD
  @Override
  public int compareTo(String o) {
=======
  public int compareTo(Object o) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int result;
    int major;
    int minor;
    int revision;
<<<<<<< HEAD
    int pnt;
    int[] maj = new int[1];
    int[] min = new int[1];
    int[] rev = new int[1];
    int[] point = new int[1];

    // do we have a string?

    parseVersion(o, maj, min, rev, point);
    major = maj[0];
    minor = min[0];
    revision = rev[0];
    pnt = point[0];
=======
    int[] maj = new int[1];
    int[] min = new int[1];
    int[] rev = new int[1];

    // do we have a string?
    if (o instanceof String) {
      parseVersion((String) o, maj, min, rev);
      major = maj[0];
      minor = min[0];
      revision = rev[0];
    } else {
      System.out.println(this.getClass().getName()
          + ": no version-string for comparTo povided!");
      major = -1;
      minor = -1;
      revision = -1;
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    if (MAJOR < major) {
      result = -1;
    } else if (MAJOR == major) {
      if (MINOR < minor) {
        result = -1;
      } else if (MINOR == minor) {
        if (REVISION < revision) {
          result = -1;
        } else if (REVISION == revision) {
<<<<<<< HEAD
          if (POINT < pnt) {
            result = -1;
          } else if (POINT == pnt) {
            result = 0;
          } else {
            result = 1;
          }
=======
          result = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        } else {
          result = 1;
        }
      } else {
        result = 1;
      }
    } else {
      result = 1;
    }

    return result;
  }

  /**
   * whether the given version string is equal to this version
   * 
   * @param o the version-string to compare to
   * @return TRUE if the version-string is equals to its own
   */
  @Override
  public boolean equals(Object o) {
<<<<<<< HEAD
    return (compareTo((String) o) == 0);
=======
    return (compareTo(o) == 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * checks whether this version is older than the one from the given version
   * string
   * 
   * @param o the version-string to compare with
   * @return TRUE if this version is older than the given one
   */
<<<<<<< HEAD
  public boolean isOlder(String o) {
=======
  public boolean isOlder(Object o) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return (compareTo(o) == -1);
  }

  /**
   * checks whether this version is newer than the one from the given version
   * string
   * 
   * @param o the version-string to compare with
   * @return TRUE if this version is newer than the given one
   */
<<<<<<< HEAD
  public boolean isNewer(String o) {
=======
  public boolean isNewer(Object o) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return (compareTo(o) == 1);
  }

  /**
   * returns the current version as string
   * 
   * @return the current version
   */
  @Override
  public String toString() {
    return VERSION;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
<<<<<<< HEAD
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
=======
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.8 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * only for testing
   * 
   * @param args the commandline arguments - ignored
   */
  public static void main(String[] args) {
    Version v;
    String tmpStr;

    // print version
    System.out.println(VERSION + "\n");

    // test on different versions
    v = new Version();
    System.out.println("-1? " + v.compareTo("5.0.1"));
    System.out.println(" 0? " + v.compareTo(VERSION));
    System.out.println("+1? " + v.compareTo("3.4.0"));

    tmpStr = "5.0.1";
    System.out.println("\ncomparing with " + tmpStr);
    System.out.println("isOlder? " + v.isOlder(tmpStr));
    System.out.println("equals ? " + v.equals(tmpStr));
    System.out.println("isNewer? " + v.isNewer(tmpStr));

    tmpStr = VERSION;
    System.out.println("\ncomparing with " + tmpStr);
    System.out.println("isOlder? " + v.isOlder(tmpStr));
    System.out.println("equals ? " + v.equals(tmpStr));
    System.out.println("isNewer? " + v.isNewer(tmpStr));

    tmpStr = "3.4.0";
    System.out.println("\ncomparing with " + tmpStr);
    System.out.println("isOlder? " + v.isOlder(tmpStr));
    System.out.println("equals ? " + v.equals(tmpStr));
    System.out.println("isNewer? " + v.isNewer(tmpStr));

    tmpStr = "3.4";
    System.out.println("\ncomparing with " + tmpStr);
    System.out.println("isOlder? " + v.isOlder(tmpStr));
    System.out.println("equals ? " + v.equals(tmpStr));
    System.out.println("isNewer? " + v.isNewer(tmpStr));

    tmpStr = "5";
    System.out.println("\ncomparing with " + tmpStr);
    System.out.println("isOlder? " + v.isOlder(tmpStr));
    System.out.println("equals ? " + v.equals(tmpStr));
    System.out.println("isNewer? " + v.isNewer(tmpStr));
  }
}
