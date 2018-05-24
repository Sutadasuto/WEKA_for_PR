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
 * Agrawal.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.datagenerators.classifiers.classification;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.DenseInstance;
=======
import weka.core.Attribute;
import weka.core.FastVector;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.core.TechnicalInformation;
<<<<<<< HEAD
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.datagenerators.ClassificationGenerator;

/**
 * <!-- globalinfo-start --> Generates a people database and is based on the
 * paper by Agrawal et al.:<br/>
 * R. Agrawal, T. Imielinski, A. Swami (1993). Database Mining: A Performance
 * Perspective. IEEE Transactions on Knowledge and Data Engineering.
 * 5(6):914-925. URL
 * http://www.almaden.ibm.com/software/quest/Publications/ByDate.html.
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- technical-bibtex-start --> BibTeX:
 * 
=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.datagenerators.ClassificationGenerator;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

/**
 <!-- globalinfo-start -->
 * Generates a people database and is based on the paper by Agrawal et al.:<br/>
 * R. Agrawal, T. Imielinski, A. Swami (1993). Database Mining: A Performance Perspective. IEEE Transactions on Knowledge and Data Engineering. 5(6):914-925. URL http://www.almaden.ibm.com/software/quest/Publications/ByDate.html.
 * <p/>
 <!-- globalinfo-end -->
 *
 <!-- technical-bibtex-start -->
 * BibTeX:
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * <pre>
 * &#64;article{Agrawal1993,
 *    author = {R. Agrawal and T. Imielinski and A. Swami},
 *    journal = {IEEE Transactions on Knowledge and Data Engineering},
 *    note = {Special issue on Learning and Discovery in Knowledge-Based Databases},
 *    number = {6},
 *    pages = {914-925},
 *    title = {Database Mining: A Performance Perspective},
 *    volume = {5},
 *    year = {1993},
 *    URL = {http://www.almaden.ibm.com/software/quest/Publications/ByDate.html},
 *    PDF = {http://www.almaden.ibm.com/software/quest/Publications/papers/tkde93.pdf}
 * }
 * </pre>
 * <p/>
<<<<<<< HEAD
 * <!-- technical-bibtex-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -h
 *  Prints this help.
 * </pre>
 * 
 * <pre>
 * -o &lt;file&gt;
 *  The name of the output file, otherwise the generated data is
 *  printed to stdout.
 * </pre>
 * 
 * <pre>
 * -r &lt;name&gt;
 *  The name of the relation.
 * </pre>
 * 
 * <pre>
 * -d
 *  Whether to print debug informations.
 * </pre>
 * 
 * <pre>
 * -S
 *  The seed for random function (default 1)
 * </pre>
 * 
 * <pre>
 * -n &lt;num&gt;
 *  The number of examples to generate (default 100)
 * </pre>
 * 
 * <pre>
 * -F &lt;num&gt;
 *  The function to use for generating the data. (default 1)
 * </pre>
 * 
 * <pre>
 * -B
 *  Whether to balance the class.
 * </pre>
 * 
 * <pre>
 * -P &lt;num&gt;
 *  The perturbation factor. (default 0.05)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Richard Kirkby (rkirkby at cs dot waikato dot ac dot nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */

public class Agrawal extends ClassificationGenerator implements
  TechnicalInformationHandler {

  /** for serialization */
  static final long serialVersionUID = 2254651939636143025L;

=======
 <!-- technical-bibtex-end -->
 *
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -h
 *  Prints this help.</pre>
 * 
 * <pre> -o &lt;file&gt;
 *  The name of the output file, otherwise the generated data is
 *  printed to stdout.</pre>
 * 
 * <pre> -r &lt;name&gt;
 *  The name of the relation.</pre>
 * 
 * <pre> -d
 *  Whether to print debug informations.</pre>
 * 
 * <pre> -S
 *  The seed for random function (default 1)</pre>
 * 
 * <pre> -n &lt;num&gt;
 *  The number of examples to generate (default 100)</pre>
 * 
 * <pre> -F &lt;num&gt;
 *  The function to use for generating the data. (default 1)</pre>
 * 
 * <pre> -B
 *  Whether to balance the class.</pre>
 * 
 * <pre> -P &lt;num&gt;
 *  The perturbation factor. (default 0.05)</pre>
 * 
 <!-- options-end -->
 *
 * @author Richard Kirkby (rkirkby at cs dot waikato dot ac dot nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.6 $
 */

public class Agrawal
  extends ClassificationGenerator
  implements TechnicalInformationHandler {
  
  /** for serialization */
  static final long serialVersionUID = 2254651939636143025L;
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * the interface for the class functions
   */
  protected interface ClassFunction {
    /**
     * returns a class value based on the given inputs
<<<<<<< HEAD
     * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     * @param salary the salary
     * @param commission the commission
     * @param age the age
     * @param elevel the education level
<<<<<<< HEAD
     * @param car
=======
     * @param car 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
     * @param zipcode the zip code
     * @param hvalue
     * @param hyears
     * @param loan
     */
    public long determineClass(double salary, double commission, int age,
<<<<<<< HEAD
      int elevel, int car, int zipcode, double hvalue, int hyears, double loan);
  }

  /**
   * built in functions are based on the paper (page 924), which turn out to be
   * functions pred20 thru pred29 in the public c code
=======
        int elevel, int car, int zipcode, double hvalue, int hyears,
        double loan);
  }

  /** 
   * built in functions are based on the paper (page 924),
   * which turn out to be functions pred20 thru pred29 in the public c code
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected static ClassFunction[] builtInFunctions = {
    // function 1
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        if (age < 40 || 60 <= age) {
          return 0;
        } else {
          return 1;
        }
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        if (age < 40 || 60 <= age)
          return 0;
        else
          return 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    },
    // function 2
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        if (age < 40) {
          if (50000 <= salary && salary <= 100000) {
            return 0;
          } else {
            return 1;
          }
        } else if (age < 60) {
          if (75000 <= salary && salary <= 125000) {
            return 0;
          } else {
            return 1;
          }
        } else // age >= 60
        if (25000 <= salary && salary <= 75000) {
          return 0;
        } else {
          return 1;
        }
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        if (age < 40)
          if (50000 <= salary && salary <= 100000)
            return 0;
          else
            return 1;
        else if (age < 60) // && age >= 40
          if (75000 <= salary && salary <= 125000)
            return 0;
          else
            return 1;
        else // age >= 60
          if (25000 <= salary && salary <= 75000)
            return 0;
          else
            return 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    },
    // function 3
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        if (age < 40) {
          if (elevel == 0 || elevel == 1) {
            return 0;
          } else {
            return 1;
          }
        } else if (age < 60) {
          if (elevel == 1 || elevel == 2 || elevel == 3) {
            return 0;
          } else {
            return 1;
          }
        } else // age >= 60
        if (elevel == 2 || elevel == 3 || elevel == 4) {
          return 0;
        } else {
          return 1;
        }
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        if (age < 40)
          if (elevel == 0 || elevel == 1)
            return 0;
          else
            return 1;
        else if (age < 60) // && age >= 40
          if (elevel == 1 || elevel == 2 || elevel == 3)
            return 0;
          else
            return 1;
        else // age >= 60
          if (elevel == 2 || elevel == 3 || elevel == 4)
            return 0;
          else
            return 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    },
    // function 4
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        if (age < 40) {
          if (elevel == 0 || elevel == 1) {
            if (25000 <= salary && salary <= 75000) {
              return 0;
            } else {
              return 1;
            }
          } else if (50000 <= salary && salary <= 100000) {
            return 0;
          } else {
            return 1;
          }
        } else if (age < 60) {
          if (elevel == 1 || elevel == 2 || elevel == 3) {
            if (50000 <= salary && salary <= 100000) {
              return 0;
            } else {
              return 1;
            }
          } else if (75000 <= salary && salary <= 125000) {
            return 0;
          } else {
            return 1;
          }
        } else // age >= 60
        if (elevel == 2 || elevel == 3 || elevel == 4) {
          if (50000 <= salary && salary <= 100000) {
            return 0;
          } else {
            return 1;
          }
        } else if (25000 <= salary && salary <= 75000) {
          return 0;
        } else {
          return 1;
        }
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        if (age < 40)
          if (elevel == 0 || elevel == 1)
            if (25000 <= salary && salary <= 75000)
              return 0;
            else
              return 1;
          else if (50000 <= salary && salary <= 100000)
            return 0;
          else
            return 1;
        else if (age < 60) // && age >= 40
          if (elevel == 1 || elevel == 2 || elevel == 3)
            if (50000 <= salary && salary <= 100000)
              return 0;
            else
              return 1;
          else if (75000 <= salary && salary <= 125000)
            return 0;
          else
            return 1;
        else // age >= 60
          if (elevel == 2 || elevel == 3 || elevel == 4)
            if (50000 <= salary && salary <= 100000)
              return 0;
            else
              return 1;
          else if (25000 <= salary && salary <= 75000)
            return 0;
          else
            return 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    },
    // function 5
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        if (age < 40) {
          if (50000 <= salary && salary <= 100000) {
            if (100000 <= loan && loan <= 300000) {
              return 0;
            } else {
              return 1;
            }
          } else if (200000 <= loan && loan <= 400000) {
            return 0;
          } else {
            return 1;
          }
        } else if (age < 60) {
          if (75000 <= salary && salary <= 125000) {
            if (200000 <= loan && loan <= 400000) {
              return 0;
            } else {
              return 1;
            }
          } else if (300000 <= loan && loan <= 500000) {
            return 0;
          } else {
            return 1;
          }
        } else // age >= 60
        if (25000 <= salary && salary <= 75000) {
          if (300000 <= loan && loan <= 500000) {
            return 0;
          } else {
            return 1;
          }
        } else if (100000 <= loan && loan <= 300000) {
          return 0;
        } else {
          return 1;
        }
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        if (age < 40)
          if (50000 <= salary && salary <= 100000)
            if (100000 <= loan && loan <= 300000)
              return 0;
            else
              return 1;
          else if (200000 <= loan && loan <= 400000)
            return 0;
          else
            return 1;
        else if (age < 60) // && age >= 40
          if (75000 <= salary && salary <= 125000)
            if (200000 <= loan && loan <= 400000)
              return 0;
            else
              return 1;
          else if (300000 <= loan && loan <= 500000)
            return 0;
          else
            return 1;
        else // age >= 60
          if (25000 <= salary && salary <= 75000)
            if (300000 <= loan && loan <= 500000)
              return 0;
            else
              return 1;
          else if (100000 <= loan && loan <= 300000)
            return 0;
          else
            return 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    },
    // function 6
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        double totalSalary = salary + commission;
        if (age < 40) {
          if (50000 <= totalSalary && totalSalary <= 100000) {
            return 0;
          } else {
            return 1;
          }
        } else if (age < 60) {
          if (75000 <= totalSalary && totalSalary <= 125000) {
            return 0;
          } else {
            return 1;
          }
        } else // age >= 60
        if (25000 <= totalSalary && totalSalary <= 75000) {
          return 0;
        } else {
          return 1;
        }
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        double totalSalary = salary + commission;
        if (age < 40)
          if (50000 <= totalSalary && totalSalary <= 100000)
            return 0;
          else
            return 1;
        else if (age < 60) // && age >= 40
          if (75000 <= totalSalary && totalSalary <= 125000)
            return 0;
          else
            return 1;
        else // age >= 60
          if (25000 <= totalSalary && totalSalary <= 75000)
            return 0;
          else
            return 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    },
    // function 7
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        double disposable = (2.0 * (salary + commission) / 3.0 - loan / 5.0 - 20000.0);
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        double disposable = (2.0 * (salary + commission) / 3.0
            - loan / 5.0 - 20000.0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        return disposable > 0 ? 0 : 1;
      }
    },
    // function 8
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        double disposable = (2.0 * (salary + commission) / 3.0 - 5000.0
          * elevel - 20000.0);
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        double disposable = (2.0 * (salary + commission) / 3.0
            - 5000.0 * (double) elevel - 20000.0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        return disposable > 0 ? 0 : 1;
      }
    },
    // function 9
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        double disposable = (2.0 * (salary + commission) / 3.0 - 5000.0
          * elevel - loan / 5.0 - 10000.0);
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        double disposable = (2.0 * (salary + commission) / 3.0
            - 5000.0 * (double) elevel - loan / 5.0 - 10000.0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        return disposable > 0 ? 0 : 1;
      }
    },
    // function 10
    new ClassFunction() {
<<<<<<< HEAD
      @Override
      public long determineClass(double salary, double commission, int age,
        int elevel, int car, int zipcode, double hvalue, int hyears, double loan) {
        double equity = 0.0;
        if (hyears >= 20) {
          equity = hvalue * (hyears - 20.0) / 10.0;
        }
        double disposable = (2.0 * (salary + commission) / 3.0 - 5000.0
          * elevel + equity / 5.0 - 10000.0);
        return disposable > 0 ? 0 : 1;
      }
    } };
=======
      public long determineClass(double salary, double commission,
          int age, int elevel, int car, int zipcode,
          double hvalue, int hyears, double loan) {
        double equity = 0.0;
        if (hyears >= 20)
          equity = hvalue * ((double) hyears - 20.0) / 10.0;
        double disposable = (2.0 * (salary + commission) / 3.0
            - 5000.0 * (double) elevel + equity / 5.0 - 10000.0);
        return disposable > 0 ? 0 : 1;
      }
    } 
  };
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** function 1 */
  public final static int FUNCTION_1 = 1;
  /** function 2 */
  public final static int FUNCTION_2 = 2;
  /** function 3 */
  public final static int FUNCTION_3 = 3;
  /** function 4 */
  public final static int FUNCTION_4 = 4;
  /** function 5 */
  public final static int FUNCTION_5 = 5;
  /** function 6 */
  public final static int FUNCTION_6 = 6;
  /** function 7 */
  public final static int FUNCTION_7 = 7;
  /** function 8 */
  public final static int FUNCTION_8 = 8;
  /** function 9 */
  public final static int FUNCTION_9 = 9;
  /** function 10 */
  public final static int FUNCTION_10 = 10;
  /** the funtion tags */
  public static final Tag[] FUNCTION_TAGS = {
<<<<<<< HEAD
    new Tag(FUNCTION_1, "Function 1"), new Tag(FUNCTION_2, "Function 2"),
    new Tag(FUNCTION_3, "Function 3"), new Tag(FUNCTION_4, "Function 4"),
    new Tag(FUNCTION_5, "Function 5"), new Tag(FUNCTION_6, "Function 6"),
    new Tag(FUNCTION_7, "Function 7"), new Tag(FUNCTION_8, "Function 8"),
    new Tag(FUNCTION_9, "Function 9"), new Tag(FUNCTION_10, "Function 10"), };

=======
    new Tag(FUNCTION_1,  "Function 1"),
    new Tag(FUNCTION_2,  "Function 2"),
    new Tag(FUNCTION_3,  "Function 3"),
    new Tag(FUNCTION_4,  "Function 4"),
    new Tag(FUNCTION_5,  "Function 5"),
    new Tag(FUNCTION_6,  "Function 6"),
    new Tag(FUNCTION_7,  "Function 7"),
    new Tag(FUNCTION_8,  "Function 8"),
    new Tag(FUNCTION_9,  "Function 9"),
    new Tag(FUNCTION_10, "Function 10"),
  };
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** the function to use for generating the data */
  protected int m_Function;

  /** whether to balance the class */
  protected boolean m_BalanceClass;

  /** the perturabation fraction */
  protected double m_PerturbationFraction;
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /** used for balancing the class */
  protected boolean m_nextClassShouldBeZero;

  /** the last class label that was generated */
  protected double m_lastLabel;
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * initializes the generator with default values
   */
  public Agrawal() {
    super();

    setFunction(defaultFunction());
    setBalanceClass(defaultBalanceClass());
    setPerturbationFraction(defaultPerturbationFraction());
  }

  /**
   * Returns a string describing this data generator.
<<<<<<< HEAD
   * 
   * @return a description of the data generator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Generates a people database and is based on the paper by Agrawal "
      + "et al.:\n" + getTechnicalInformation().toString();
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  @Override
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;

=======
   *
   * @return a description of the data generator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return 
         "Generates a people database and is based on the paper by Agrawal "
       + "et al.:\n"
       + getTechnicalInformation().toString();
  }

  /**
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result = new TechnicalInformation(Type.ARTICLE);
    result.setValue(Field.AUTHOR, "R. Agrawal and T. Imielinski and A. Swami");
    result.setValue(Field.YEAR, "1993");
    result.setValue(Field.TITLE, "Database Mining: A Performance Perspective");
<<<<<<< HEAD
    result.setValue(Field.JOURNAL,
      "IEEE Transactions on Knowledge and Data Engineering");
    result.setValue(Field.VOLUME, "5");
    result.setValue(Field.NUMBER, "6");
    result.setValue(Field.PAGES, "914-925");
    result.setValue(Field.NOTE,
      "Special issue on Learning and Discovery in Knowledge-Based Databases");
    result.setValue(Field.URL,
      "http://www.almaden.ibm.com/software/quest/Publications/ByDate.html");
    result
      .setValue(Field.PDF,
        "http://www.almaden.ibm.com/software/quest/Publications/papers/tkde93.pdf");

    return result;
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options
   */
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = enumToVector(super.listOptions());

    result
      .add(new Option(
        "\tThe function to use for generating the data. (default "
          + defaultFunction().getSelectedTag().getID() + ")", "F", 1,
        "-F <num>"));

    result.add(new Option("\tWhether to balance the class.", "B", 0, "-B"));

    result.add(new Option("\tThe perturbation factor. (default "
      + defaultPerturbationFraction() + ")", "P", 1, "-P <num>"));
=======
    result.setValue(Field.JOURNAL, "IEEE Transactions on Knowledge and Data Engineering");
    result.setValue(Field.VOLUME, "5");
    result.setValue(Field.NUMBER, "6");
    result.setValue(Field.PAGES, "914-925");
    result.setValue(Field.NOTE, "Special issue on Learning and Discovery in Knowledge-Based Databases");
    result.setValue(Field.URL, "http://www.almaden.ibm.com/software/quest/Publications/ByDate.html");
    result.setValue(Field.PDF, "http://www.almaden.ibm.com/software/quest/Publications/papers/tkde93.pdf");
    
    return result;
  }

 /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options
   */
  public Enumeration listOptions() {
    Vector result = enumToVector(super.listOptions());

    result.add(new Option(
              "\tThe function to use for generating the data. (default " 
              + defaultFunction().getSelectedTag().getID() + ")",
              "F", 1, "-F <num>"));

    result.add(new Option(
              "\tWhether to balance the class.",
              "B", 0, "-B"));

    result.add(new Option(
              "\tThe perturbation factor. (default " 
              + defaultPerturbationFraction() + ")",
              "P", 1, "-P <num>"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result.elements();
  }

  /**
<<<<<<< HEAD
   * Parses a list of options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -h
   *  Prints this help.
   * </pre>
   * 
   * <pre>
   * -o &lt;file&gt;
   *  The name of the output file, otherwise the generated data is
   *  printed to stdout.
   * </pre>
   * 
   * <pre>
   * -r &lt;name&gt;
   *  The name of the relation.
   * </pre>
   * 
   * <pre>
   * -d
   *  Whether to print debug informations.
   * </pre>
   * 
   * <pre>
   * -S
   *  The seed for random function (default 1)
   * </pre>
   * 
   * <pre>
   * -n &lt;num&gt;
   *  The number of examples to generate (default 100)
   * </pre>
   * 
   * <pre>
   * -F &lt;num&gt;
   *  The function to use for generating the data. (default 1)
   * </pre>
   * 
   * <pre>
   * -B
   *  Whether to balance the class.
   * </pre>
   * 
   * <pre>
   * -P &lt;num&gt;
   *  The perturbation factor. (default 0.05)
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
=======
   * Parses a list of options for this object. <p/>
   *
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -h
   *  Prints this help.</pre>
   * 
   * <pre> -o &lt;file&gt;
   *  The name of the output file, otherwise the generated data is
   *  printed to stdout.</pre>
   * 
   * <pre> -r &lt;name&gt;
   *  The name of the relation.</pre>
   * 
   * <pre> -d
   *  Whether to print debug informations.</pre>
   * 
   * <pre> -S
   *  The seed for random function (default 1)</pre>
   * 
   * <pre> -n &lt;num&gt;
   *  The number of examples to generate (default 100)</pre>
   * 
   * <pre> -F &lt;num&gt;
   *  The function to use for generating the data. (default 1)</pre>
   * 
   * <pre> -B
   *  Whether to balance the class.</pre>
   * 
   * <pre> -P &lt;num&gt;
   *  The perturbation factor. (default 0.05)</pre>
   * 
   <!-- options-end -->
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    String        tmpStr;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    super.setOptions(options);

    tmpStr = Utils.getOption('F', options);
<<<<<<< HEAD
    if (tmpStr.length() != 0) {
      setFunction(new SelectedTag(Integer.parseInt(tmpStr), FUNCTION_TAGS));
    } else {
      setFunction(defaultFunction());
    }
=======
    if (tmpStr.length() != 0)
      setFunction(new SelectedTag(Integer.parseInt(tmpStr), FUNCTION_TAGS));
    else
      setFunction(defaultFunction());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    setBalanceClass(Utils.getFlag('B', options));

    tmpStr = Utils.getOption('P', options);
<<<<<<< HEAD
    if (tmpStr.length() != 0) {
      setPerturbationFraction(Double.parseDouble(tmpStr));
    } else {
      setPerturbationFraction(defaultPerturbationFraction());
    }
=======
    if (tmpStr.length() != 0)
      setPerturbationFraction(Double.parseDouble(tmpStr));
    else
      setPerturbationFraction(defaultPerturbationFraction());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of the datagenerator.
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    Vector<String> result = new Vector<String>();

    Collections.addAll(result, super.getOptions());

    result.add("-F");
    result.add("" + m_Function);

    if (getBalanceClass()) {
      result.add("-B");
    }

    result.add("-P");
    result.add("" + getPerturbationFraction());

    return result.toArray(new String[result.size()]);
=======
   *
   * @return an array of strings suitable for passing to setOptions
   */
  public String[] getOptions() {
    Vector        result;
    String[]      options;
    int           i;
    
    result  = new Vector();
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);
    
    result.add("-F");
    result.add("" + m_Function);
    
    if (getBalanceClass())
      result.add("-B");
    
    result.add("-P");
    result.add("" + getPerturbationFraction());
    
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * returns the default function
   * 
   * @return the default function
   */
  protected SelectedTag defaultFunction() {
    return new SelectedTag(FUNCTION_1, FUNCTION_TAGS);
  }
<<<<<<< HEAD

  /**
   * Gets the function for generating the data.
   * 
=======
  
  /**
   * Gets the function for generating the data.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the function.
   * @see #FUNCTION_TAGS
   */
  public SelectedTag getFunction() {
    return new SelectedTag(m_Function, FUNCTION_TAGS);
  }
<<<<<<< HEAD

  /**
   * Sets the function for generating the data.
   * 
=======
  
  /**
   * Sets the function for generating the data.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param value the function.
   * @see #FUNCTION_TAGS
   */
  public void setFunction(SelectedTag value) {
<<<<<<< HEAD
    if (value.getTags() == FUNCTION_TAGS) {
      m_Function = value.getSelectedTag().getID();
    }
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
    if (value.getTags() == FUNCTION_TAGS)
      m_Function = value.getSelectedTag().getID();
  }
  
  /**
   * Returns the tip text for this property
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String functionTipText() {
    return "The function to use for generating the data.";
  }

  /**
   * returns the default for balancing the class
   * 
   * @return the default for balancing the class
   */
  protected boolean defaultBalanceClass() {
    return false;
  }
<<<<<<< HEAD

  /**
   * Gets whether the class is balanced.
   * 
   * @return whether the class is balanced.
   */
  public boolean getBalanceClass() {
    return m_BalanceClass;
  }

  /**
   * Sets whether the class is balanced.
   * 
   * @param value whether to balance the class.
   */
  public void setBalanceClass(boolean value) {
    m_BalanceClass = value;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Gets whether the class is balanced.
   *
   * @return whether the class is balanced.
   */
  public boolean getBalanceClass() { 
    return m_BalanceClass; 
  }
  
  /**
   * Sets whether the class is balanced.
   *
   * @param value whether to balance the class.
   */
  public void setBalanceClass(boolean value) { 
    m_BalanceClass = value;
  }  
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String balanceClassTipText() {
    return "Whether to balance the class.";
  }

  /**
   * returns the default perturbation fraction
   * 
   * @return the default perturbation fraction
   */
  protected double defaultPerturbationFraction() {
    return 0.05;
  }
<<<<<<< HEAD

  /**
   * Gets the perturbation fraction.
   * 
   * @return the perturbation fraction.
   */
  public double getPerturbationFraction() {
    return m_PerturbationFraction;
  }

  /**
   * Sets the perturbation fraction.
   * 
   * @param value the perturbation fraction.
   */
  public void setPerturbationFraction(double value) {
    if ((value >= 0.0) && (value <= 1.0)) {
      m_PerturbationFraction = value;
    } else {
      throw new IllegalArgumentException(
        "Perturbation fraction must be in [0,1] (provided: " + value + ")!");
    }
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
  
  /**
   * Gets the perturbation fraction.
   *
   * @return the perturbation fraction.
   */
  public double getPerturbationFraction() { 
    return m_PerturbationFraction; 
  }
  
  /**
   * Sets the perturbation fraction.
   *
   * @param value the perturbation fraction.
   */
  public void setPerturbationFraction(double value) { 
    if ( (value >= 0.0) && (value <= 1.0) )
      m_PerturbationFraction = value;
    else
      throw new IllegalArgumentException(
          "Perturbation fraction must be in [0,1] (provided: " + value + ")!");
  }  
  
  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for
   *         displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String perturbationFractionTipText() {
    return "The perturbation fraction: 0 <= fraction <= 1.";
  }

  /**
<<<<<<< HEAD
   * Return if single mode is set for the given data generator mode depends on
   * option setting and or generator type.
=======
   * Return if single mode is set for the given data generator
   * mode depends on option setting and or generator type.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return single mode flag
   * @throws Exception if mode is not set yet
   */
<<<<<<< HEAD
  @Override
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public boolean getSingleModeFlag() throws Exception {
    return true;
  }

  /**
<<<<<<< HEAD
   * Initializes the format for the dataset produced. Must be called before the
   * generateExample or generateExamples methods are used. Re-initializes the
   * random number generator with the given seed.
   * 
   * @return the format for the dataset
   * @throws Exception if the generating of the format failed
   * @see #getSeed()
   */
  @Override
  public Instances defineDataFormat() throws Exception {
    ArrayList<Attribute> atts;
    ArrayList<String> attValues;
    int i;

    m_Random = new Random(getSeed());
    m_nextClassShouldBeZero = true;
    m_lastLabel = Double.NaN;
=======
   * Initializes the format for the dataset produced. 
   * Must be called before the generateExample or generateExamples
   * methods are used.
   * Re-initializes the random number generator with the given seed.
   *
   * @return the format for the dataset 
   * @throws Exception if the generating of the format failed
   * @see  #getSeed()
   */
  public Instances defineDataFormat() throws Exception {
    FastVector      atts;
    FastVector      attValues;
    int             i;

    m_Random = new Random(getSeed());
    m_nextClassShouldBeZero = true;
    m_lastLabel             = Double.NaN;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // number of examples is the same as given per option
    setNumExamplesAct(getNumExamples());

    // set up attributes
<<<<<<< HEAD
    atts = new ArrayList<Attribute>();

    atts.add(new Attribute("salary"));

    atts.add(new Attribute("commission"));

    atts.add(new Attribute("age"));

    attValues = new ArrayList<String>();
    for (i = 0; i < 5; i++) {
      attValues.add("" + i);
    }
    atts.add(new Attribute("elevel", attValues));

    attValues = new ArrayList<String>();
    for (i = 1; i <= 20; i++) {
      attValues.add("" + i);
    }
    atts.add(new Attribute("car", attValues));

    attValues = new ArrayList<String>();
    for (i = 0; i < 9; i++) {
      attValues.add("" + i);
    }
    atts.add(new Attribute("zipcode", attValues));

    atts.add(new Attribute("hvalue"));

    atts.add(new Attribute("hyears"));

    atts.add(new Attribute("loan"));

    attValues = new ArrayList<String>();
    for (i = 0; i < 2; i++) {
      attValues.add("" + i);
    }
    atts.add(new Attribute("group", attValues));

    // dataset
    m_DatasetFormat = new Instances(getRelationNameToUse(), atts, 0);

=======
    atts = new FastVector();
    
    atts.addElement(new Attribute("salary"));
    
    atts.addElement(new Attribute("commission"));
    
    attValues = new FastVector();
    atts.addElement(new Attribute("age"));

    attValues = new FastVector();
    for (i = 0; i < 5; i++)
      attValues.addElement("" + i);
    atts.addElement(new Attribute("elevel", attValues));
    
    attValues = new FastVector();
    for (i = 1; i <= 20; i++)
      attValues.addElement("" + i);
    atts.addElement(new Attribute("car", attValues));
    
    attValues = new FastVector();
    for (i = 0; i < 9; i++)
      attValues.addElement("" + i);
    atts.addElement(new Attribute("zipcode", attValues));
    
    atts.addElement(new Attribute("hvalue"));
    
    atts.addElement(new Attribute("hyears"));
    
    atts.addElement(new Attribute("loan"));
    
    attValues = new FastVector();
    for (i = 0; i < 2; i++)
      attValues.addElement("" + i);
    atts.addElement(new Attribute("group", attValues));
    
    // dataset
    m_DatasetFormat = new Instances(getRelationNameToUse(), atts, 0);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return m_DatasetFormat;
  }

  /**
   * perturbs the given value
   * 
   * @param val the value to perturb
   * @param min the minimum
   * @param max the maximum
   * @return the perturbed value
   */
  protected double perturbValue(double val, double min, double max) {
    return perturbValue(val, max - min, min, max);
  }

  /**
   * perturbs the given value
   * 
   * @param val the value to perturb
   * @param range the range for the perturbation
   * @param min the minimum
   * @param max the maximum
   * @return the perturbed value
   */
<<<<<<< HEAD
  protected double perturbValue(double val, double range, double min, double max) {

    val += range * (2.0 * (getRandom().nextDouble() - 0.5))
      * getPerturbationFraction();

    if (val < min) {
      val = min;
    } else if (val > max) {
      val = max;
    }

=======
  protected double perturbValue(double val, double range, 
      double min, double max) {
    
    val += range * (2.0 * (getRandom().nextDouble() - 0.5)) 
                 * getPerturbationFraction();

    if (val < min)
      val = min;
    else if (val > max)
      val = max;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return val;
  }

  /**
<<<<<<< HEAD
   * Generates one example of the dataset.
   * 
   * @return the generated example
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExamples which
   *           means in non single mode
   */
  @Override
  public Instance generateExample() throws Exception {
    Instance result;
    double salary;
    double commission;
    double hvalue;
    double loan;
    int age;
    int elevel;
    int car;
    int zipcode;
    int hyears;
    boolean desiredClassFound;
    double[] atts;
    Random random;
=======
   * Generates one example of the dataset. 
   *
   * @return the generated example
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExamples
   * which means in non single mode
   */
  public Instance generateExample() throws Exception {
    Instance      result;
    double        salary;
    double        commission;
    double        hvalue;
    double        loan;
    int           age;
    int           elevel;
    int           car;
    int           zipcode;
    int           hyears;
    boolean       desiredClassFound;
    double[]      atts;
    Random        random;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    ClassFunction classFunction;

    result = null;
    random = getRandom();

<<<<<<< HEAD
    if (m_DatasetFormat == null) {
      throw new Exception("Dataset format not defined.");
    }

    salary = 0;
    commission = 0;
    hvalue = 0;
    loan = 0;
    age = 0;
    elevel = 0;
    car = 0;
    zipcode = 0;
    hyears = 0;
    desiredClassFound = false;
    classFunction = builtInFunctions[m_Function - 1];

    while (!desiredClassFound) {
      // generate attributes
      salary = 20000.0 + 130000.0 * random.nextDouble();
      commission = (salary >= 75000.0) ? 0 : (10000.0 + 65000.0 * random
        .nextDouble());
      age = 20 + random.nextInt(61);
      elevel = random.nextInt(5);
      car = 1 + random.nextInt(20);
      zipcode = random.nextInt(9);
      hvalue = (9.0 - zipcode) * 100000.0 * (0.5 + random.nextDouble());
      hyears = 1 + random.nextInt(30);
      loan = random.nextDouble() * 500000.0;

      // determine class
      m_lastLabel = classFunction.determineClass(salary, commission, age,
        elevel, car, zipcode, hvalue, hyears, loan);
      if (!getBalanceClass()) {
        desiredClassFound = true;
      } else {
        // balance the classes
        if ((m_nextClassShouldBeZero && (m_lastLabel == 0))
          || (!m_nextClassShouldBeZero && (m_lastLabel == 1))) {
=======
    if (m_DatasetFormat == null)
      throw new Exception("Dataset format not defined.");

    salary            = 0;
    commission        = 0;
    hvalue            = 0;
    loan              = 0;
    age               = 0;
    elevel            = 0;
    car               = 0;
    zipcode           = 0;
    hyears            = 0;
    desiredClassFound = false;
    classFunction     = builtInFunctions[m_Function - 1];

    while (!desiredClassFound) {
      // generate attributes
      salary     = 20000.0 + 130000.0 * random.nextDouble();
      commission = (salary >= 75000.0) ? 
                   0 : (10000.0 + 65000.0 * random.nextDouble());
      age        = 20 + random.nextInt(61);
      elevel     = random.nextInt(5);
      car        = 1 + random.nextInt(20);
      zipcode    = random.nextInt(9);
      hvalue     = (9.0 - (double) zipcode) * 100000.0
                   * (0.5 + random.nextDouble());
      hyears     = 1 + random.nextInt(30);
      loan       = random.nextDouble() * 500000.0;
      
      // determine class
      m_lastLabel = classFunction.determineClass(salary, commission, age,
          elevel, car, zipcode, hvalue, hyears, loan);
      if (!getBalanceClass()) {
        desiredClassFound = true;
      }
      else {
        // balance the classes
        if (    ( m_nextClassShouldBeZero && (m_lastLabel == 0))
             || (!m_nextClassShouldBeZero && (m_lastLabel == 1)) ) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          desiredClassFound = true;
          m_nextClassShouldBeZero = !m_nextClassShouldBeZero;
        } // else keep searching
      }
    }
<<<<<<< HEAD

    // perturb values
    if (getPerturbationFraction() > 0.0) {
      salary = perturbValue(salary, 20000, 150000);
      if (commission > 0) {
        commission = perturbValue(commission, 10000, 75000);
      }
      age = (int) Math.round(perturbValue(age, 20, 80));
      hvalue = perturbValue(hvalue, (9.0 - zipcode) * 100000.0, 0, 135000);
      hyears = (int) Math.round(perturbValue(hyears, 1, 30));
      loan = perturbValue(loan, 0, 500000);
    }

    // create instance
    atts = new double[m_DatasetFormat.numAttributes()];
=======
    
    // perturb values
    if (getPerturbationFraction() > 0.0) {
      salary = perturbValue(salary, 20000, 150000);
      if (commission > 0)
        commission = perturbValue(commission, 10000, 75000);
      age    = (int) Math.round(perturbValue(age, 20, 80));
      hvalue = perturbValue(
                  hvalue, (9.0 - (double) zipcode) * 100000.0, 0, 135000);
      hyears = (int) Math.round(perturbValue(hyears, 1, 30));
      loan   = perturbValue(loan, 0, 500000);
    }

    // create instance
    atts    = new double[m_DatasetFormat.numAttributes()];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    atts[0] = salary;
    atts[1] = commission;
    atts[2] = age;
    atts[3] = elevel;
    atts[4] = car - 1;
    atts[5] = zipcode;
    atts[6] = hvalue;
    atts[7] = hyears;
    atts[8] = loan;
    atts[9] = m_lastLabel;
<<<<<<< HEAD
    result = new DenseInstance(1.0, atts);
=======
    result  = new Instance(1.0, atts);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.setDataset(m_DatasetFormat);

    return result;
  }

  /**
   * Generates all examples of the dataset. Re-initializes the random number
   * generator with the given seed, before generating instances.
<<<<<<< HEAD
   * 
   * @return the generated dataset
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExample, which
   *           means in single mode
   * @see #getSeed()
   */
  @Override
  public Instances generateExamples() throws Exception {
    Instances result;
    int i;

    result = new Instances(m_DatasetFormat, 0);
    m_Random = new Random(getSeed());

    for (i = 0; i < getNumExamplesAct(); i++) {
      result.add(generateExample());
    }

=======
   *
   * @return the generated dataset
   * @throws Exception if the format of the dataset is not yet defined
   * @throws Exception if the generator only works with generateExample,
   * which means in single mode
   * @see   #getSeed()
   */
  public Instances generateExamples() throws Exception {
    Instances       result;
    int             i;

    result   = new Instances(m_DatasetFormat, 0);
    m_Random = new Random(getSeed());

    for (i = 0; i < getNumExamplesAct(); i++)
      result.add(generateExample());
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
<<<<<<< HEAD
   * Generates a comment string that documentates the data generator. By default
   * this string is added at the beginning of the produced output as ARFF file
   * type, next after the options.
   * 
   * @return string contains info about the generated rules
   */
  @Override
  public String generateStart() {
=======
   * Generates a comment string that documentates the data generator.
   * By default this string is added at the beginning of the produced output
   * as ARFF file type, next after the options.
   * 
   * @return string contains info about the generated rules
   */
  public String generateStart () {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return "";
  }

  /**
<<<<<<< HEAD
   * Generates a comment string that documentats the data generator. By default
   * this string is added at the end of theproduces output as ARFF file type.
=======
   * Generates a comment string that documentats the data generator.
   * By default this string is added at the end of theproduces output
   * as ARFF file type.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   * @return string contains info about the generated rules
   * @throws Exception if the generating of the documentaion fails
   */
<<<<<<< HEAD
  @Override
  public String generateFinished() throws Exception {
    return "";
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
=======
  public String generateFinished() throws Exception {
    return "";
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.6 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for executing this class.
<<<<<<< HEAD
   * 
   * @param args should contain arguments for the data producer:
=======
   *
   * @param args should contain arguments for the data producer: 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static void main(String[] args) {
    runDataGenerator(new Agrawal(), args);
  }
}
