/*
 * This software is a cooperative product of The MathWorks and the National
 * Institute of Standards and Technology (NIST) which has been released to the
 * public domain. Neither The MathWorks nor NIST assumes any responsibility
 * whatsoever for its use by other parties, and makes no guarantees, expressed
 * or implied, about its quality, reliability, or any other characteristic.
 */

/*
 * Matrix.java
 * Copyright (C) 1999 The Mathworks and NIST and 2005 University of Waikato,
 *               Hamilton, New Zealand
 *
 */

package weka.core.matrix;

<<<<<<< HEAD
=======
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import java.io.BufferedReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

<<<<<<< HEAD
import weka.core.RevisionHandler;
import weka.core.RevisionUtils;
import weka.core.Utils;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 * Jama = Java Matrix class.
 * <P>
 * The Java Matrix Class provides the fundamental operations of numerical linear
<<<<<<< HEAD
 * algebra. Various constructors create Matrices from two dimensional arrays of
 * double precision floating point numbers. Various "gets" and "sets" provide
 * access to submatrices and matrix elements. Several methods implement basic
 * matrix arithmetic, including matrix addition and multiplication, matrix
 * norms, and element-by-element array operations. Methods for reading and
 * printing matrices are also included. All the operations in this version of
 * the Matrix Class involve real matrices. Complex matrices may be handled in a
=======
 * algebra.  Various constructors create Matrices from two dimensional arrays of
 * double precision floating point numbers.  Various "gets" and "sets" provide
 * access to submatrices and matrix elements.  Several methods implement basic
 * matrix arithmetic, including matrix addition and multiplication, matrix
 * norms, and element-by-element array operations.  Methods for reading and
 * printing matrices are also included.  All the operations in this version of
 * the Matrix Class involve real matrices.  Complex matrices may be handled in a
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * future version.
 * <P>
 * Five fundamental matrix decompositions, which consist of pairs or triples of
 * matrices, permutation vectors, and the like, produce results in five
<<<<<<< HEAD
 * decomposition classes. These decompositions are accessed by the Matrix class
 * to compute solutions of simultaneous linear equations, determinants, inverses
 * and other matrix functions. The five decompositions are:
 * <P>
 * <UL>
 * <LI>Cholesky Decomposition of symmetric, positive definite matrices.
 * <LI>LU Decomposition of rectangular matrices.
 * <LI>QR Decomposition of rectangular matrices.
 * <LI>Singular Value Decomposition of rectangular matrices.
 * <LI>Eigenvalue Decomposition of both symmetric and nonsymmetric square
 * matrices.
=======
 * decomposition classes.  These decompositions are accessed by the Matrix class
 * to compute solutions of simultaneous linear equations, determinants, inverses
 * and other matrix functions.  The five decompositions are:
 * <P>
 * <UL>
 *    <LI>Cholesky Decomposition of symmetric, positive definite matrices.
 *    <LI>LU Decomposition of rectangular matrices.
 *    <LI>QR Decomposition of rectangular matrices.
 *    <LI>Singular Value Decomposition of rectangular matrices.
 *    <LI>Eigenvalue Decomposition of both symmetric and nonsymmetric square matrices.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * </UL>
 * <DL>
 * <DT><B>Example of use:</B></DT>
 * <P>
 * <DD>Solve a linear system A x = b and compute the residual norm, ||b - A x||.
<<<<<<< HEAD
 * <P>
 * 
 * <PRE>
 * double[][] vals = { { 1., 2., 3 }, { 4., 5., 6. }, { 7., 8., 10. } };
 * Matrix A = new Matrix(vals);
 * Matrix b = Matrix.random(3, 1);
 * Matrix x = A.solve(b);
 * Matrix r = A.times(x).minus(b);
 * double rnorm = r.normInf();
 * </PRE>
 * 
 * </DD>
 * </DL>
 * <p/>
 * Adapted from the <a href="http://math.nist.gov/javanumerics/jama/"
 * target="_blank">JAMA</a> package. Additional methods are tagged with the
 * <code>@author</code> tag.
 * 
 * @author The Mathworks and NIST
 * @author Fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10203 $
 */
public class Matrix implements Cloneable, Serializable, RevisionHandler {
=======
 * <P><PRE>
 *       double[][] vals = {{1.,2.,3},{4.,5.,6.},{7.,8.,10.}};
 *       Matrix A = new Matrix(vals);
 *       Matrix b = Matrix.random(3,1);
 *       Matrix x = A.solve(b);
 *       Matrix r = A.times(x).minus(b);
 *       double rnorm = r.normInf();
 * </PRE></DD>
 * </DL>
 * <p/>
 * Adapted from the <a href="http://math.nist.gov/javanumerics/jama/" target="_blank">JAMA</a> package. Additional methods are tagged with the 
 * <code>@author</code> tag.
 *
 * @author The Mathworks and NIST 
 * @author Fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.8 $
 */
public class Matrix 
  implements Cloneable, Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = 7856794138418366180L;

<<<<<<< HEAD
  /**
   * Array for internal storage of elements.
   * 
=======
  /** 
   * Array for internal storage of elements.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @serial internal array storage.
   */
  protected double[][] A;

<<<<<<< HEAD
  /**
   * Row and column dimensions.
   * 
=======
  /** 
   * Row and column dimensions.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @serial row dimension.
   * @serial column dimension.
   */
  protected int m, n;

<<<<<<< HEAD
  /**
   * Construct an m-by-n matrix of zeros.
   * 
   * @param m Number of rows.
   * @param n Number of colums.
=======
  /** 
   * Construct an m-by-n matrix of zeros. 
   * @param m    Number of rows.
   * @param n    Number of colums.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix(int m, int n) {
    this.m = m;
    this.n = n;
    A = new double[m][n];
  }

<<<<<<< HEAD
  /**
   * Construct an m-by-n constant matrix.
   * 
   * @param m Number of rows.
   * @param n Number of colums.
   * @param s Fill the matrix with this scalar value.
=======
  /** 
   * Construct an m-by-n constant matrix.
   * @param m    Number of rows.
   * @param n    Number of colums.
   * @param s    Fill the matrix with this scalar value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix(int m, int n, double s) {
    this.m = m;
    this.n = n;
    A = new double[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = s;
      }
    }
  }

<<<<<<< HEAD
  /**
   * Construct a matrix from a 2-D array.
   * 
   * @param A Two-dimensional array of doubles.
   * @throws IllegalArgumentException All rows must have the same length
   * @see #constructWithCopy
=======
  /** 
   * Construct a matrix from a 2-D array.
   * @param A    Two-dimensional array of doubles.
   * @throws  IllegalArgumentException All rows must have the same length
   * @see        #constructWithCopy
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix(double[][] A) {
    m = A.length;
    n = A[0].length;
    for (int i = 0; i < m; i++) {
      if (A[i].length != n) {
<<<<<<< HEAD
        throw new IllegalArgumentException(
          "All rows must have the same length.");
=======
        throw new IllegalArgumentException("All rows must have the same length.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    this.A = A;
  }

<<<<<<< HEAD
  /**
   * Construct a matrix quickly without checking arguments.
   * 
   * @param A Two-dimensional array of doubles.
   * @param m Number of rows.
   * @param n Number of colums.
=======
  /** 
   * Construct a matrix quickly without checking arguments.
   * @param A    Two-dimensional array of doubles.
   * @param m    Number of rows.
   * @param n    Number of colums.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix(double[][] A, int m, int n) {
    this.A = A;
    this.m = m;
    this.n = n;
  }

<<<<<<< HEAD
  /**
   * Construct a matrix from a one-dimensional packed array
   * 
   * @param vals One-dimensional array of doubles, packed by columns (ala
   *          Fortran).
   * @param m Number of rows.
   * @throws IllegalArgumentException Array length must be a multiple of m.
   */
  public Matrix(double vals[], int m) {
    this.m = m;
    n = (m != 0 ? vals.length / m : 0);
    if (m * n != vals.length) {
      throw new IllegalArgumentException(
        "Array length must be a multiple of m.");
=======
  /** 
   * Construct a matrix from a one-dimensional packed array
   * @param vals One-dimensional array of doubles, packed by columns (ala
   * Fortran).
   * @param m    Number of rows.
   * @throws  IllegalArgumentException Array length must be a multiple of m.
   */
  public Matrix(double vals[], int m) {
    this.m = m;
    n = (m != 0 ? vals.length/m : 0);
    if (m*n != vals.length) {
      throw new IllegalArgumentException("Array length must be a multiple of m.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    A = new double[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
<<<<<<< HEAD
        A[i][j] = vals[i + j * m];
=======
        A[i][j] = vals[i+j*m];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

  /**
<<<<<<< HEAD
   * Reads a matrix from a reader. The first line in the file should contain the
   * number of rows and columns. Subsequent lines contain elements of the
   * matrix. (FracPete: taken from old weka.core.Matrix class)
   * 
   * @param r the reader containing the matrix
   * @throws Exception if an error occurs
   * @see #write(Writer)
=======
   * Reads a matrix from a reader. The first line in the file should
   * contain the number of rows and columns. Subsequent lines
   * contain elements of the matrix.
   * (FracPete: taken from old weka.core.Matrix class)
   *
   * @param     r the reader containing the matrix
   * @throws    Exception if an error occurs
   * @see       #write(Writer)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix(Reader r) throws Exception {
    LineNumberReader lnr = new LineNumberReader(r);
    String line;
    int currentRow = -1;

    while ((line = lnr.readLine()) != null) {

      // Comments
<<<<<<< HEAD
      if (line.startsWith("%")) {
        continue;
      }

      StringTokenizer st = new StringTokenizer(line);
      // Ignore blank lines
      if (!st.hasMoreTokens()) {
        continue;
      }

      if (currentRow < 0) {
        int rows = Integer.parseInt(st.nextToken());
        if (!st.hasMoreTokens()) {
          throw new Exception("Line " + lnr.getLineNumber()
            + ": expected number of columns");
        }
=======
      if (line.startsWith("%"))  
        continue;
      
      StringTokenizer st = new StringTokenizer(line);
      // Ignore blank lines
      if (!st.hasMoreTokens())  
        continue;

      if (currentRow < 0) {
        int rows = Integer.parseInt(st.nextToken());
        if (!st.hasMoreTokens())
          throw new Exception("Line " + lnr.getLineNumber() 
              + ": expected number of columns");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

        int cols = Integer.parseInt(st.nextToken());
        A = new double[rows][cols];
        m = rows;
        n = cols;
        currentRow++;
        continue;

<<<<<<< HEAD
      } else {
        if (currentRow == getRowDimension()) {
          throw new Exception("Line " + lnr.getLineNumber()
            + ": too many rows provided");
        }

        for (int i = 0; i < getColumnDimension(); i++) {
          if (!st.hasMoreTokens()) {
            throw new Exception("Line " + lnr.getLineNumber()
              + ": too few matrix elements provided");
          }
=======
      } 
      else {
        if (currentRow == getRowDimension())
          throw new Exception("Line " + lnr.getLineNumber() 
              + ": too many rows provided");

        for (int i = 0; i < getColumnDimension(); i++) {
          if (!st.hasMoreTokens())
            throw new Exception("Line " + lnr.getLineNumber() 
                + ": too few matrix elements provided");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

          set(currentRow, i, Double.valueOf(st.nextToken()).doubleValue());
        }
        currentRow++;
      }
    }

<<<<<<< HEAD
    if (currentRow == -1) {
      throw new Exception("Line " + lnr.getLineNumber()
        + ": expected number of rows");
    } else if (currentRow != getRowDimension()) {
      throw new Exception("Line " + lnr.getLineNumber()
        + ": too few rows provided");
    }
  }

  /**
   * Construct a matrix from a copy of a 2-D array.
   * 
   * @param A Two-dimensional array of doubles.
   * @throws IllegalArgumentException All rows must have the same length
=======
    if (currentRow == -1)
      throw new Exception("Line " + lnr.getLineNumber() 
          + ": expected number of rows");
    else if (currentRow != getRowDimension())
      throw new Exception("Line " + lnr.getLineNumber() 
          + ": too few rows provided");
  }

  /** 
   * Construct a matrix from a copy of a 2-D array.
   * @param A    Two-dimensional array of doubles.
   * @throws  IllegalArgumentException All rows must have the same length
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static Matrix constructWithCopy(double[][] A) {
    int m = A.length;
    int n = A[0].length;
<<<<<<< HEAD
    Matrix X = new Matrix(m, n);
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      if (A[i].length != n) {
        throw new IllegalArgumentException(
          "All rows must have the same length.");
=======
    Matrix X = new Matrix(m,n);
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      if (A[i].length != n) {
        throw new IllegalArgumentException
          ("All rows must have the same length.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Make a deep copy of a matrix
   */
  public Matrix copy() {
    Matrix X = new Matrix(m, n);
=======
  /** 
   * Make a deep copy of a matrix
   */
  public Matrix copy() {
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Clone the Matrix object.
   */
  @Override
=======
  /** 
   * Clone the Matrix object.
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Object clone() {
    return this.copy();
  }

<<<<<<< HEAD
  /**
   * Access the internal two-dimensional array.
   * 
   * @return Pointer to the two-dimensional array of matrix elements.
=======
  /** 
   * Access the internal two-dimensional array.
   * @return     Pointer to the two-dimensional array of matrix elements.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double[][] getArray() {
    return A;
  }

<<<<<<< HEAD
  /**
   * Copy the internal two-dimensional array.
   * 
   * @return Two-dimensional array copy of matrix elements.
=======
  /** 
   * Copy the internal two-dimensional array.
   * @return     Two-dimensional array copy of matrix elements.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double[][] getArrayCopy() {
    double[][] C = new double[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j];
      }
    }
    return C;
  }

<<<<<<< HEAD
  /**
   * Make a one-dimensional column packed copy of the internal array.
   * 
   * @return Matrix elements packed in a one-dimensional array by columns.
   */
  public double[] getColumnPackedCopy() {
    double[] vals = new double[m * n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        vals[i + j * m] = A[i][j];
=======
  /** 
   * Make a one-dimensional column packed copy of the internal array.
   * @return     Matrix elements packed in a one-dimensional array by columns.
   */
  public double[] getColumnPackedCopy() {
    double[] vals = new double[m*n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        vals[i+j*m] = A[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return vals;
  }

<<<<<<< HEAD
  /**
   * Make a one-dimensional row packed copy of the internal array.
   * 
   * @return Matrix elements packed in a one-dimensional array by rows.
   */
  public double[] getRowPackedCopy() {
    double[] vals = new double[m * n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        vals[i * n + j] = A[i][j];
=======
  /** 
   * Make a one-dimensional row packed copy of the internal array.
   * @return     Matrix elements packed in a one-dimensional array by rows.
   */
  public double[] getRowPackedCopy() {
    double[] vals = new double[m*n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        vals[i*n+j] = A[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return vals;
  }

<<<<<<< HEAD
  /**
   * Get row dimension.
   * 
   * @return m, the number of rows.
=======
  /** 
   * Get row dimension.
   * @return     m, the number of rows.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getRowDimension() {
    return m;
  }

<<<<<<< HEAD
  /**
   * Get column dimension.
   * 
   * @return n, the number of columns.
=======
  /** 
   * Get column dimension.
   * @return     n, the number of columns.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int getColumnDimension() {
    return n;
  }

<<<<<<< HEAD
  /**
   * Get a single element.
   * 
   * @param i Row index.
   * @param j Column index.
   * @return A(i,j)
   * @throws ArrayIndexOutOfBoundsException
=======
  /** 
   * Get a single element.
   * @param i    Row index.
   * @param j    Column index.
   * @return     A(i,j)
   * @throws  ArrayIndexOutOfBoundsException
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double get(int i, int j) {
    return A[i][j];
  }

<<<<<<< HEAD
  /**
   * Get a submatrix.
   * 
   * @param i0 Initial row index
   * @param i1 Final row index
   * @param j0 Initial column index
   * @param j1 Final column index
   * @return A(i0:i1,j0:j1)
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int i0, int i1, int j0, int j1) {
    Matrix X = new Matrix(i1 - i0 + 1, j1 - j0 + 1);
=======
  /** 
   * Get a submatrix.
   * @param i0   Initial row index
   * @param i1   Final row index
   * @param j0   Initial column index
   * @param j1   Final column index
   * @return     A(i0:i1,j0:j1)
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int i0, int i1, int j0, int j1) {
    Matrix X = new Matrix(i1-i0+1,j1-j0+1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] B = X.getArray();
    try {
      for (int i = i0; i <= i1; i++) {
        for (int j = j0; j <= j1; j++) {
<<<<<<< HEAD
          B[i - i0][j - j0] = A[i][j];
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
=======
          B[i-i0][j-j0] = A[i][j];
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Get a submatrix.
   * 
   * @param r Array of row indices.
   * @param c Array of column indices.
   * @return A(r(:),c(:))
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int[] r, int[] c) {
    Matrix X = new Matrix(r.length, c.length);
=======
  /** 
   * Get a submatrix.
   * @param r    Array of row indices.
   * @param c    Array of column indices.
   * @return     A(r(:),c(:))
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int[] r, int[] c) {
    Matrix X = new Matrix(r.length,c.length);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] B = X.getArray();
    try {
      for (int i = 0; i < r.length; i++) {
        for (int j = 0; j < c.length; j++) {
          B[i][j] = A[r[i]][c[j]];
        }
      }
<<<<<<< HEAD
    } catch (ArrayIndexOutOfBoundsException e) {
=======
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Get a submatrix.
   * 
   * @param i0 Initial row index
   * @param i1 Final row index
   * @param c Array of column indices.
   * @return A(i0:i1,c(:))
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int i0, int i1, int[] c) {
    Matrix X = new Matrix(i1 - i0 + 1, c.length);
=======
  /** 
   * Get a submatrix.
   * @param i0   Initial row index
   * @param i1   Final row index
   * @param c    Array of column indices.
   * @return     A(i0:i1,c(:))
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int i0, int i1, int[] c) {
    Matrix X = new Matrix(i1-i0+1,c.length);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] B = X.getArray();
    try {
      for (int i = i0; i <= i1; i++) {
        for (int j = 0; j < c.length; j++) {
<<<<<<< HEAD
          B[i - i0][j] = A[i][c[j]];
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
=======
          B[i-i0][j] = A[i][c[j]];
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Get a submatrix.
   * 
   * @param r Array of row indices.
   * @param j0 Initial column index
   * @param j1 Final column index
   * @return A(r(:),j0:j1)
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int[] r, int j0, int j1) {
    Matrix X = new Matrix(r.length, j1 - j0 + 1);
=======
  /** 
   * Get a submatrix.
   * @param r    Array of row indices.
   * @param j0   Initial column index
   * @param j1   Final column index
   * @return     A(r(:),j0:j1)
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
   */
  public Matrix getMatrix(int[] r, int j0, int j1) {
    Matrix X = new Matrix(r.length,j1-j0+1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] B = X.getArray();
    try {
      for (int i = 0; i < r.length; i++) {
        for (int j = j0; j <= j1; j++) {
<<<<<<< HEAD
          B[i][j - j0] = A[r[i]][j];
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
=======
          B[i][j-j0] = A[r[i]][j];
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Set a single element.
   * 
   * @param i Row index.
   * @param j Column index.
   * @param s A(i,j).
   * @throws ArrayIndexOutOfBoundsException
=======
  /** 
   * Set a single element.
   * @param i    Row index.
   * @param j    Column index.
   * @param s    A(i,j).
   * @throws  ArrayIndexOutOfBoundsException
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void set(int i, int j, double s) {
    A[i][j] = s;
  }

<<<<<<< HEAD
  /**
   * Set a submatrix.
   * 
   * @param i0 Initial row index
   * @param i1 Final row index
   * @param j0 Initial column index
   * @param j1 Final column index
   * @param X A(i0:i1,j0:j1)
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
=======
  /** 
   * Set a submatrix.
   * @param i0   Initial row index
   * @param i1   Final row index
   * @param j0   Initial column index
   * @param j1   Final column index
   * @param X    A(i0:i1,j0:j1)
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setMatrix(int i0, int i1, int j0, int j1, Matrix X) {
    try {
      for (int i = i0; i <= i1; i++) {
        for (int j = j0; j <= j1; j++) {
<<<<<<< HEAD
          A[i][j] = X.get(i - i0, j - j0);
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
=======
          A[i][j] = X.get(i-i0,j-j0);
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
  }

<<<<<<< HEAD
  /**
   * Set a submatrix.
   * 
   * @param r Array of row indices.
   * @param c Array of column indices.
   * @param X A(r(:),c(:))
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
=======
  /** 
   * Set a submatrix.
   * @param r    Array of row indices.
   * @param c    Array of column indices.
   * @param X    A(r(:),c(:))
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setMatrix(int[] r, int[] c, Matrix X) {
    try {
      for (int i = 0; i < r.length; i++) {
        for (int j = 0; j < c.length; j++) {
<<<<<<< HEAD
          A[r[i]][c[j]] = X.get(i, j);
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
=======
          A[r[i]][c[j]] = X.get(i,j);
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
  }

<<<<<<< HEAD
  /**
   * Set a submatrix.
   * 
   * @param r Array of row indices.
   * @param j0 Initial column index
   * @param j1 Final column index
   * @param X A(r(:),j0:j1)
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
=======
  /** 
   * Set a submatrix.
   * @param r    Array of row indices.
   * @param j0   Initial column index
   * @param j1   Final column index
   * @param X    A(r(:),j0:j1)
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setMatrix(int[] r, int j0, int j1, Matrix X) {
    try {
      for (int i = 0; i < r.length; i++) {
        for (int j = j0; j <= j1; j++) {
<<<<<<< HEAD
          A[r[i]][j] = X.get(i, j - j0);
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
=======
          A[r[i]][j] = X.get(i,j-j0);
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
  }

<<<<<<< HEAD
  /**
   * Set a submatrix.
   * 
   * @param i0 Initial row index
   * @param i1 Final row index
   * @param c Array of column indices.
   * @param X A(i0:i1,c(:))
   * @throws ArrayIndexOutOfBoundsException Submatrix indices
=======
  /** 
   * Set a submatrix.
   * @param i0   Initial row index
   * @param i1   Final row index
   * @param c    Array of column indices.
   * @param X    A(i0:i1,c(:))
   * @throws  ArrayIndexOutOfBoundsException Submatrix indices
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void setMatrix(int i0, int i1, int[] c, Matrix X) {
    try {
      for (int i = i0; i <= i1; i++) {
        for (int j = 0; j < c.length; j++) {
<<<<<<< HEAD
          A[i][c[j]] = X.get(i - i0, j);
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
  }

  /**
   * Returns true if the matrix is symmetric. (FracPete: taken from old
   * weka.core.Matrix class)
   * 
=======
          A[i][c[j]] = X.get(i-i0,j);
        }
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      throw new ArrayIndexOutOfBoundsException("Submatrix indices");
    }
  }
  
  /**
   * Returns true if the matrix is symmetric.
   * (FracPete: taken from old weka.core.Matrix class)
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return boolean true if matrix is symmetric.
   */
  public boolean isSymmetric() {
    int nr = A.length, nc = A[0].length;
<<<<<<< HEAD
    if (nr != nc) {
      return false;
    }

    for (int i = 0; i < nc; i++) {
      for (int j = 0; j < i; j++) {
        if (A[i][j] != A[j][i]) {
          return false;
        }
=======
    if (nr != nc)
      return false;

    for (int i = 0; i < nc; i++) {
      for (int j = 0; j < i; j++) {
        if (A[i][j] != A[j][i])
          return false;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return true;
  }

  /**
   * returns whether the matrix is a square matrix or not.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return true if the matrix is a square matrix
   */
  public boolean isSquare() {
    return (getRowDimension() == getColumnDimension());
  }

<<<<<<< HEAD
  /**
   * Matrix transpose.
   * 
   * @return A'
   */
  public Matrix transpose() {
    Matrix X = new Matrix(n, m);
=======
  /** 
   * Matrix transpose.
   * @return    A'
   */
  public Matrix transpose() {
    Matrix X = new Matrix(n,m);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[j][i] = A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * One norm
   * 
   * @return maximum column sum.
=======
  /** 
   * One norm
   * @return    maximum column sum.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double norm1() {
    double f = 0;
    for (int j = 0; j < n; j++) {
      double s = 0;
      for (int i = 0; i < m; i++) {
        s += Math.abs(A[i][j]);
      }
<<<<<<< HEAD
      f = Math.max(f, s);
=======
      f = Math.max(f,s);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return f;
  }

<<<<<<< HEAD
  /**
   * Two norm
   * 
   * @return maximum singular value.
=======
  /** 
   * Two norm
   * @return    maximum singular value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double norm2() {
    return (new SingularValueDecomposition(this).norm2());
  }

<<<<<<< HEAD
  /**
   * Infinity norm
   * 
   * @return maximum row sum.
=======
  /** 
   * Infinity norm
   * @return    maximum row sum.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double normInf() {
    double f = 0;
    for (int i = 0; i < m; i++) {
      double s = 0;
      for (int j = 0; j < n; j++) {
        s += Math.abs(A[i][j]);
      }
<<<<<<< HEAD
      f = Math.max(f, s);
=======
      f = Math.max(f,s);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    return f;
  }

<<<<<<< HEAD
  /**
   * Frobenius norm
   * 
   * @return sqrt of sum of squares of all elements.
=======
  /** 
   * Frobenius norm
   * @return    sqrt of sum of squares of all elements.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double normF() {
    double f = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
<<<<<<< HEAD
        f = Maths.hypot(f, A[i][j]);
=======
        f = Maths.hypot(f,A[i][j]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return f;
  }

<<<<<<< HEAD
  /**
   * Unary minus
   * 
   * @return -A
   */
  public Matrix uminus() {
    Matrix X = new Matrix(m, n);
=======
  /**  
   * Unary minus
   * @return    -A
   */
  public Matrix uminus() {
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = -A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * C = A + B
   * 
   * @param B another matrix
   * @return A + B
   */
  public Matrix plus(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m, n);
=======
  /** 
   * C = A + B
   * @param B    another matrix
   * @return     A + B
   */
  public Matrix plus(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j] + B.A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * A = A + B
   * 
   * @param B another matrix
   * @return A + B
=======
  /** 
   * A = A + B
   * @param B    another matrix
   * @return     A + B
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix plusEquals(Matrix B) {
    checkMatrixDimensions(B);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = A[i][j] + B.A[i][j];
      }
    }
    return this;
  }

<<<<<<< HEAD
  /**
   * C = A - B
   * 
   * @param B another matrix
   * @return A - B
   */
  public Matrix minus(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m, n);
=======
  /** 
   * C = A - B
   * @param B    another matrix
   * @return     A - B
   */
  public Matrix minus(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j] - B.A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * A = A - B
   * 
   * @param B another matrix
   * @return A - B
=======
  /** 
   * A = A - B
   * @param B    another matrix
   * @return     A - B
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix minusEquals(Matrix B) {
    checkMatrixDimensions(B);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = A[i][j] - B.A[i][j];
      }
    }
    return this;
  }

<<<<<<< HEAD
  /**
   * Element-by-element multiplication, C = A.*B
   * 
   * @param B another matrix
   * @return A.*B
   */
  public Matrix arrayTimes(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m, n);
=======
  /** 
   * Element-by-element multiplication, C = A.*B
   * @param B    another matrix
   * @return     A.*B
   */
  public Matrix arrayTimes(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j] * B.A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Element-by-element multiplication in place, A = A.*B
   * 
   * @param B another matrix
   * @return A.*B
=======
  /** 
   * Element-by-element multiplication in place, A = A.*B
   * @param B    another matrix
   * @return     A.*B
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix arrayTimesEquals(Matrix B) {
    checkMatrixDimensions(B);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = A[i][j] * B.A[i][j];
      }
    }
    return this;
  }

<<<<<<< HEAD
  /**
   * Element-by-element right division, C = A./B
   * 
   * @param B another matrix
   * @return A./B
   */
  public Matrix arrayRightDivide(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m, n);
=======
  /** 
   * Element-by-element right division, C = A./B
   * @param B    another matrix
   * @return     A./B
   */
  public Matrix arrayRightDivide(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = A[i][j] / B.A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Element-by-element right division in place, A = A./B
   * 
   * @param B another matrix
   * @return A./B
=======
  /** 
   * Element-by-element right division in place, A = A./B
   * @param B    another matrix
   * @return     A./B
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix arrayRightDivideEquals(Matrix B) {
    checkMatrixDimensions(B);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = A[i][j] / B.A[i][j];
      }
    }
    return this;
  }

<<<<<<< HEAD
  /**
   * Element-by-element left division, C = A.\B
   * 
   * @param B another matrix
   * @return A.\B
   */
  public Matrix arrayLeftDivide(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m, n);
=======
  /** 
   * Element-by-element left division, C = A.\B
   * @param B    another matrix
   * @return     A.\B
   */
  public Matrix arrayLeftDivide(Matrix B) {
    checkMatrixDimensions(B);
    Matrix X = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = B.A[i][j] / A[i][j];
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Element-by-element left division in place, A = A.\B
   * 
   * @param B another matrix
   * @return A.\B
=======
  /** 
   * Element-by-element left division in place, A = A.\B
   * @param B    another matrix
   * @return     A.\B
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix arrayLeftDivideEquals(Matrix B) {
    checkMatrixDimensions(B);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = B.A[i][j] / A[i][j];
      }
    }
    return this;
  }

<<<<<<< HEAD
  /**
   * Multiply a matrix by a scalar, C = s*A
   * 
   * @param s scalar
   * @return s*A
   */
  public Matrix times(double s) {
    Matrix X = new Matrix(m, n);
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = s * A[i][j];
=======
  /** 
   * Multiply a matrix by a scalar, C = s*A
   * @param s    scalar
   * @return     s*A
   */
  public Matrix times(double s) {
    Matrix X = new Matrix(m,n);
    double[][] C = X.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        C[i][j] = s*A[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * Multiply a matrix by a scalar in place, A = s*A
   * 
   * @param s scalar
   * @return replace A by s*A
=======
  /** 
   * Multiply a matrix by a scalar in place, A = s*A
   * @param s    scalar
   * @return     replace A by s*A
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix timesEquals(double s) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
<<<<<<< HEAD
        A[i][j] = s * A[i][j];
=======
        A[i][j] = s*A[i][j];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return this;
  }

<<<<<<< HEAD
  /**
   * Linear algebraic matrix multiplication, A * B
   * 
   * @param B another matrix
   * @return Matrix product, A * B
   * @throws IllegalArgumentException Matrix inner dimensions must agree.
=======
  /** 
   * Linear algebraic matrix multiplication, A * B
   * @param B    another matrix
   * @return     Matrix product, A * B
   * @throws  IllegalArgumentException Matrix inner dimensions must agree.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix times(Matrix B) {
    if (B.m != n) {
      throw new IllegalArgumentException("Matrix inner dimensions must agree.");
    }
<<<<<<< HEAD
    Matrix X = new Matrix(m, B.n);
=======
    Matrix X = new Matrix(m,B.n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] C = X.getArray();
    double[] Bcolj = new double[n];
    for (int j = 0; j < B.n; j++) {
      for (int k = 0; k < n; k++) {
        Bcolj[k] = B.A[k][j];
      }
      for (int i = 0; i < m; i++) {
        double[] Arowi = A[i];
        double s = 0;
        for (int k = 0; k < n; k++) {
<<<<<<< HEAD
          s += Arowi[k] * Bcolj[k];
=======
          s += Arowi[k]*Bcolj[k];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
        C[i][j] = s;
      }
    }
    return X;
  }

<<<<<<< HEAD
  /**
   * LU Decomposition
   * 
   * @return LUDecomposition
=======
  /** 
   * LU Decomposition
   * @return     LUDecomposition
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see LUDecomposition
   */
  public LUDecomposition lu() {
    return new LUDecomposition(this);
  }

<<<<<<< HEAD
  /**
   * QR Decomposition
   * 
   * @return QRDecomposition
=======
  /** 
   * QR Decomposition
   * @return     QRDecomposition
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see QRDecomposition
   */
  public QRDecomposition qr() {
    return new QRDecomposition(this);
  }

<<<<<<< HEAD
  /**
   * Cholesky Decomposition
   * 
   * @return CholeskyDecomposition
=======
  /** 
   * Cholesky Decomposition
   * @return     CholeskyDecomposition
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see CholeskyDecomposition
   */
  public CholeskyDecomposition chol() {
    return new CholeskyDecomposition(this);
  }

<<<<<<< HEAD
  /**
   * Singular Value Decomposition
   * 
   * @return SingularValueDecomposition
=======
  /** 
   * Singular Value Decomposition
   * @return     SingularValueDecomposition
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see SingularValueDecomposition
   */
  public SingularValueDecomposition svd() {
    return new SingularValueDecomposition(this);
  }

<<<<<<< HEAD
  /**
   * Eigenvalue Decomposition
   * 
   * @return EigenvalueDecomposition
=======
  /** 
   * Eigenvalue Decomposition
   * @return     EigenvalueDecomposition
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see EigenvalueDecomposition
   */
  public EigenvalueDecomposition eig() {
    return new EigenvalueDecomposition(this);
  }

<<<<<<< HEAD
  /**
   * Solve A*X = B
   * 
   * @param B right hand side
   * @return solution if A is square, least squares solution otherwise
   */
  public Matrix solve(Matrix B) {
    return (m == n ? (new LUDecomposition(this)).solve(B)
      : (new QRDecomposition(this)).solve(B));
  }

  /**
   * Solve X*A = B, which is also A'*X' = B'
   * 
   * @param B right hand side
   * @return solution if A is square, least squares solution otherwise.
=======
  /** 
   * Solve A*X = B
   * @param B    right hand side
   * @return     solution if A is square, least squares solution otherwise
   */
  public Matrix solve(Matrix B) {
    return (m == n ? (new LUDecomposition(this)).solve(B) :
        (new QRDecomposition(this)).solve(B));
  }

  /** 
   * Solve X*A = B, which is also A'*X' = B'
   * @param B    right hand side
   * @return     solution if A is square, least squares solution otherwise.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public Matrix solveTranspose(Matrix B) {
    return transpose().solve(B.transpose());
  }

<<<<<<< HEAD
  /**
   * Matrix inverse or pseudoinverse
   * 
   * @return inverse(A) if A is square, pseudoinverse otherwise.
   */
  public Matrix inverse() {
    return solve(identity(m, m));
  }

  /**
   * returns the square root of the matrix, i.e., X from the equation X*X = A.<br/>
   * Steps in the Calculation (see <a href=
   * "http://www.mathworks.com/access/helpdesk/help/techdoc/ref/sqrtm.html"
   * target="blank"><code>sqrtm</code></a> in Matlab):<br/>
   * <ol>
   * <li>perform eigenvalue decomposition<br/>
   * [V,D]=eig(A)</li>
   * <li>take the square root of all elements in D (only the ones with positive
   * sign are considered for further computation)<br/>
   * S=sqrt(D)</li>
   * <li>calculate the root<br/>
   * X=V*S/V, which can be also written as X=(V'\(V*S)')'</li>
   * </ol>
   * <p/>
   * <b>Note:</b> since this method uses other high-level methods, it generates
   * several instances of matrices. This can be problematic with large matrices.
   * <p/>
   * Examples:
   * <ol>
   * <li>
   * 
   * <pre>
=======
  /** 
   * Matrix inverse or pseudoinverse
   * @return     inverse(A) if A is square, pseudoinverse otherwise.
   */
  public Matrix inverse() {
    return solve(identity(m,m));
  }

  /**
   * returns the square root of the matrix, i.e., X from the equation
   * X*X = A.<br/>
   * Steps in the Calculation (see <a href="http://www.mathworks.com/access/helpdesk/help/techdoc/ref/sqrtm.html" target="blank"><code>sqrtm</code></a> in Matlab):<br/>
   * <ol>
   *   <li>perform eigenvalue decomposition<br/>[V,D]=eig(A)</li>
   *   <li>take the square root of all elements in D (only the ones with 
   *       positive sign are considered for further computation)<br/>
   *       S=sqrt(D)</li>
   *   <li>calculate the root<br/>
   *       X=V*S/V, which can be also written as X=(V'\(V*S)')'</li>
   * </ol>
   * <p/>
   * <b>Note:</b> since this method uses other high-level methods, it generates
   * several instances of matrices. This can be problematic with large
   * matrices.
   * <p/>
   * Examples:
   * <ol>
   *   <li>
   *   <pre>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  X =
   *   5   -4    1    0    0
   *  -4    6   -4    1    0
   *   1   -4    6   -4    1
   *   0    1   -4    6   -4
   *   0    0    1   -4    5
   * 
   *  sqrt(X) =
   *   2   -1   -0   -0   -0 
   *  -1    2   -1    0   -0 
   *   0   -1    2   -1    0 
   *  -0    0   -1    2   -1 
   *  -0   -0   -0   -1    2 
   *  
   *  Matrix m = new Matrix(new double[][]{{5,-4,1,0,0},{-4,6,-4,1,0},{1,-4,6,-4,1},{0,1,-4,6,-4},{0,0,1,-4,5}});
<<<<<<< HEAD
   * </pre>
   * 
   * </li>
   * <li>
   * 
   * <pre>
=======
   *   </pre>
   *   </li>
   *   <li>
   *   <pre>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   *  X =
   *   7   10
   *  15   22
   *  
   *  sqrt(X) =
   *  1.5667    1.7408
   *  2.6112    4.1779
   * 
   *  Matrix m = new Matrix(new double[][]{{7, 10},{15, 22}});
<<<<<<< HEAD
   * </pre>
   * 
   * </li>
   * </ol>
   * 
   * @return sqrt(A)
   */
  public Matrix sqrt() {
    EigenvalueDecomposition evd;
    Matrix s;
    Matrix v;
    Matrix d;
    Matrix result;
    Matrix a;
    Matrix b;
    int i;
    int n;

    result = null;

    // eigenvalue decomp.
    // [V, D] = eig(A) with A = this
    evd = this.eig();
    v = evd.getV();
    d = evd.getD();

    // S = sqrt of cells of D
    s = new Matrix(d.getRowDimension(), d.getColumnDimension());
    for (i = 0; i < s.getRowDimension(); i++) {
      for (n = 0; n < s.getColumnDimension(); n++) {
        s.set(i, n, StrictMath.sqrt(d.get(i, n)));
      }
    }

    // to calculate:
    // result = V*S/V
    //
    // with X = B/A
    // and B/A = (A'\B')'
    // and V=A and V*S=B
    // we get
    // result = (V'\(V*S)')'
    //
    // A*X = B
    // X = A\B
    // which is
    // X = A.solve(B)
    //
    // with A=V' and B=(V*S)'
    // we get
    // X = V'.solve((V*S)')
    // or
    // result = X'
    //
    // which is in full length
    // result = (V'.solve((V*S)'))'
    a = v.inverse();
    b = v.times(s).inverse();
    v = null;
    d = null;
    evd = null;
    s = null;
=======
   *   </pre>
   *   </li>
   * </ol>
   *
   * @return    sqrt(A)
   */
  public Matrix sqrt() {
    EigenvalueDecomposition   evd;
    Matrix                    s;
    Matrix                    v;
    Matrix                    d;
    Matrix                    result;
    Matrix                    a;
    Matrix                    b;
    int                       i;
    int                       n;

    result = null;
    
    // eigenvalue decomp.
    // [V, D] = eig(A) with A = this
    evd = this.eig();
    v   = evd.getV();
    d   = evd.getD();

    // S = sqrt of cells of D
    s = new Matrix(d.getRowDimension(), d.getColumnDimension());
    for (i = 0; i < s.getRowDimension(); i++)
      for (n = 0; n < s.getColumnDimension(); n++)
        s.set(i, n, StrictMath.sqrt(d.get(i, n)));

    // to calculate:
    //      result = V*S/V
    //
    //    with   X = B/A
    //    and  B/A = (A'\B')'
    //    and V=A and V*S=B
    // we get 
    //      result = (V'\(V*S)')'
    //      
    //         A*X = B
    //           X = A\B
    // which is 
    //           X = A.solve(B)
    //           
    // with A=V' and B=(V*S)' 
    // we get
    //           X = V'.solve((V*S)')
    // or
    //      result = X'
    //
    // which is in full length
    //      result = (V'.solve((V*S)'))'
    a      = v.inverse();
    b      = v.times(s).inverse();
    v      = null;
    d      = null;
    evd    = null;
    s      = null;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result = a.solve(b).inverse();

    return result;
  }

  /**
<<<<<<< HEAD
   * Performs a (ridged) linear regression. (FracPete: taken from old
   * weka.core.Matrix class)
   * 
   * @param y the dependent variable vector
   * @param ridge the ridge parameter
   * @return the coefficients
   * @throws IllegalArgumentException if not successful
=======
   * Performs a (ridged) linear regression.
   * (FracPete: taken from old weka.core.Matrix class)
   *
   * @param     y the dependent variable vector
   * @param     ridge the ridge parameter
   * @return    the coefficients 
   * @throws    IllegalArgumentException if not successful
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public LinearRegression regression(Matrix y, double ridge) {
    return new LinearRegression(this, y, ridge);
  }

  /**
<<<<<<< HEAD
   * Performs a weighted (ridged) linear regression. (FracPete: taken from old
   * weka.core.Matrix class)
   * 
   * @param y the dependent variable vector
   * @param w the array of data point weights
   * @param ridge the ridge parameter
   * @return the coefficients
   * @throws IllegalArgumentException if the wrong number of weights were
   *           provided.
=======
   * Performs a weighted (ridged) linear regression. 
   * (FracPete: taken from old weka.core.Matrix class)
   *
   * @param     y the dependent variable vector
   * @param     w the array of data point weights
   * @param     ridge the ridge parameter
   * @return    the coefficients 
   * @throws    IllegalArgumentException if the wrong number of weights were
   *            provided.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public final LinearRegression regression(Matrix y, double[] w, double ridge) {
    return new LinearRegression(this, y, w, ridge);
  }

<<<<<<< HEAD
  /**
   * Matrix determinant
   * 
   * @return determinant
=======
  /** 
   * Matrix determinant
   * @return     determinant
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double det() {
    return new LUDecomposition(this).det();
  }

<<<<<<< HEAD
  /**
   * Matrix rank
   * 
   * @return effective numerical rank, obtained from SVD.
=======
  /** 
   * Matrix rank
   * @return     effective numerical rank, obtained from SVD.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public int rank() {
    return new SingularValueDecomposition(this).rank();
  }

<<<<<<< HEAD
  /**
   * Matrix condition (2 norm)
   * 
   * @return ratio of largest to smallest singular value.
=======
  /** 
   * Matrix condition (2 norm)
   * @return     ratio of largest to smallest singular value.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public double cond() {
    return new SingularValueDecomposition(this).cond();
  }

<<<<<<< HEAD
  /**
   * Matrix trace.
   * 
   * @return sum of the diagonal elements.
   */
  public double trace() {
    double t = 0;
    for (int i = 0; i < Math.min(m, n); i++) {
=======
  /** 
   * Matrix trace.
   * @return     sum of the diagonal elements.
   */
  public double trace() {
    double t = 0;
    for (int i = 0; i < Math.min(m,n); i++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      t += A[i][i];
    }
    return t;
  }

<<<<<<< HEAD
  /**
   * Generate matrix with random elements
   * 
   * @param m Number of rows.
   * @param n Number of colums.
   * @return An m-by-n matrix with uniformly distributed random elements.
   */
  public static Matrix random(int m, int n) {
    Matrix A = new Matrix(m, n);
=======
  /** 
   * Generate matrix with random elements
   * @param m    Number of rows.
   * @param n    Number of colums.
   * @return     An m-by-n matrix with uniformly distributed random elements.
   */
  public static Matrix random(int m, int n) {
    Matrix A = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] X = A.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        X[i][j] = Math.random();
      }
    }
    return A;
  }

<<<<<<< HEAD
  /**
   * Generate identity matrix
   * 
   * @param m Number of rows.
   * @param n Number of colums.
   * @return An m-by-n matrix with ones on the diagonal and zeros elsewhere.
   */
  public static Matrix identity(int m, int n) {
    Matrix A = new Matrix(m, n);
=======
  /** 
   * Generate identity matrix
   * @param m    Number of rows.
   * @param n    Number of colums.
   * @return     An m-by-n matrix with ones on the diagonal and zeros elsewhere.
   */
  public static Matrix identity(int m, int n) {
    Matrix A = new Matrix(m,n);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    double[][] X = A.getArray();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        X[i][j] = (i == j ? 1.0 : 0.0);
      }
    }
    return A;
  }

<<<<<<< HEAD
  /**
   * Print the matrix to stdout. Line the elements up in columns with a
   * Fortran-like 'Fw.d' style format.
   * 
   * @param w Column width.
   * @param d Number of digits after the decimal.
   */
  public void print(int w, int d) {
    print(new PrintWriter(System.out, true), w, d);
  }

  /**
   * Print the matrix to the output stream. Line the elements up in columns with
   * a Fortran-like 'Fw.d' style format.
   * 
   * @param output Output stream.
   * @param w Column width.
   * @param d Number of digits after the decimal.
=======
  /** 
   * Print the matrix to stdout.   Line the elements up in columns
   * with a Fortran-like 'Fw.d' style format.
   * @param w    Column width.
   * @param d    Number of digits after the decimal.
   */
  public void print(int w, int d) {
    print(new PrintWriter(System.out,true),w,d); 
  }

  /** 
   * Print the matrix to the output stream.   Line the elements up in
   * columns with a Fortran-like 'Fw.d' style format.
   * @param output Output stream.
   * @param w      Column width.
   * @param d      Number of digits after the decimal.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void print(PrintWriter output, int w, int d) {
    DecimalFormat format = new DecimalFormat();
    format.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
    format.setMinimumIntegerDigits(1);
    format.setMaximumFractionDigits(d);
    format.setMinimumFractionDigits(d);
    format.setGroupingUsed(false);
<<<<<<< HEAD
    print(output, format, w + 2);
  }

  /**
   * Print the matrix to stdout. Line the elements up in columns. Use the format
   * object, and right justify within columns of width characters. Note that is
   * the matrix is to be read back in, you probably will want to use a
   * NumberFormat that is set to US Locale.
   * 
   * @param format A Formatting object for individual elements.
   * @param width Field width for each column.
   * @see java.text.DecimalFormat#setDecimalFormatSymbols
   */
  public void print(NumberFormat format, int width) {
    print(new PrintWriter(System.out, true), format, width);
=======
    print(output,format,w+2);
  }

  /** 
   * Print the matrix to stdout.  Line the elements up in columns.
   * Use the format object, and right justify within columns of width
   * characters.
   * Note that is the matrix is to be read back in, you probably will want
   * to use a NumberFormat that is set to US Locale.
   * @param format A  Formatting object for individual elements.
   * @param width     Field width for each column.
   * @see java.text.DecimalFormat#setDecimalFormatSymbols
   */
  public void print(NumberFormat format, int width) {
    print(new PrintWriter(System.out,true),format,width); 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  // DecimalFormat is a little disappointing coming from Fortran or C's printf.
  // Since it doesn't pad on the left, the elements will come out different
<<<<<<< HEAD
  // widths. Consequently, we'll pass the desired column width in as an
  // argument and do the extra padding ourselves.

  /**
   * Print the matrix to the output stream. Line the elements up in columns. Use
   * the format object, and right justify within columns of width characters.
   * Note that is the matrix is to be read back in, you probably will want to
   * use a NumberFormat that is set to US Locale.
   * 
   * @param output the output stream.
   * @param format A formatting object to format the matrix elements
   * @param width Column width.
   * @see java.text.DecimalFormat#setDecimalFormatSymbols
   */
  public void print(PrintWriter output, NumberFormat format, int width) {
    output.println(); // start on new line.
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        String s = format.format(A[i][j]); // format the number
        int padding = Math.max(1, width - s.length()); // At _least_ 1 space
        for (int k = 0; k < padding; k++) {
          output.print(' ');
        }
=======
  // widths.  Consequently, we'll pass the desired column width in as an
  // argument and do the extra padding ourselves.

  /** 
   * Print the matrix to the output stream.  Line the elements up in columns.
   * Use the format object, and right justify within columns of width
   * characters.
   * Note that is the matrix is to be read back in, you probably will want
   * to use a NumberFormat that is set to US Locale.
   * @param output the output stream.
   * @param format A formatting object to format the matrix elements 
   * @param width  Column width.
   * @see java.text.DecimalFormat#setDecimalFormatSymbols
   */
  public void print(PrintWriter output, NumberFormat format, int width) {
    output.println();  // start on new line.
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        String s = format.format(A[i][j]); // format the number
        int padding = Math.max(1,width-s.length()); // At _least_ 1 space
        for (int k = 0; k < padding; k++)
          output.print(' ');
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        output.print(s);
      }
      output.println();
    }
<<<<<<< HEAD
    output.println(); // end with blank line.
  }

  /**
   * Read a matrix from a stream. The format is the same the print method, so
   * printed matrices can be read back in (provided they were printed using US
   * Locale). Elements are separated by whitespace, all the elements for each
   * row appear on a single line, the last row is followed by a blank line.
   * <p/>
   * Note: This format differs from the one that can be read via the
   * Matrix(Reader) constructor! For that format, the write(Writer) method is
   * used (from the original weka.core.Matrix class).
   * 
=======
    output.println();   // end with blank line.
  }

  /** 
   * Read a matrix from a stream.  The format is the same the print method,
   * so printed matrices can be read back in (provided they were printed using
   * US Locale).  Elements are separated by
   * whitespace, all the elements for each row appear on a single line,
   * the last row is followed by a blank line.
   * <p/>
   * Note: This format differs from the one that can be read via the
   * Matrix(Reader) constructor! For that format, the write(Writer) method
   * is used (from the original weka.core.Matrix class).
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param input the input stream.
   * @see #Matrix(Reader)
   * @see #write(Writer)
   */
  public static Matrix read(BufferedReader input) throws java.io.IOException {
<<<<<<< HEAD
    StreamTokenizer tokenizer = new StreamTokenizer(input);
=======
    StreamTokenizer tokenizer= new StreamTokenizer(input);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // Although StreamTokenizer will parse numbers, it doesn't recognize
    // scientific notation (E or D); however, Double.valueOf does.
    // The strategy here is to disable StreamTokenizer's number parsing.
    // We'll only get whitespace delimited words, EOL's and EOF's.
    // These words should all be numbers, for Double.valueOf to parse.

    tokenizer.resetSyntax();
<<<<<<< HEAD
    tokenizer.wordChars(0, 255);
    tokenizer.whitespaceChars(0, ' ');
    tokenizer.eolIsSignificant(true);
    java.util.Vector<Object> v = new java.util.Vector<Object>();

    // Ignore initial empty lines
    while (tokenizer.nextToken() == StreamTokenizer.TT_EOL) {
      ;
    }
    if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
      throw new java.io.IOException("Unexpected EOF on matrix read.");
    }
=======
    tokenizer.wordChars(0,255);
    tokenizer.whitespaceChars(0, ' ');
    tokenizer.eolIsSignificant(true);
    java.util.Vector v = new java.util.Vector();

    // Ignore initial empty lines
    while (tokenizer.nextToken() == StreamTokenizer.TT_EOL);
    if (tokenizer.ttype == StreamTokenizer.TT_EOF)
      throw new java.io.IOException("Unexpected EOF on matrix read.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    do {
      v.addElement(Double.valueOf(tokenizer.sval)); // Read & store 1st row.
    } while (tokenizer.nextToken() == StreamTokenizer.TT_WORD);

<<<<<<< HEAD
    int n = v.size(); // Now we've got the number of columns!
    double row[] = new double[n];
    for (int j = 0; j < n; j++) {
      row[j] = ((Double) v.elementAt(j)).doubleValue();
    }
    v.removeAllElements();
    v.addElement(row); // Start storing rows instead of columns.
=======
    int n = v.size();  // Now we've got the number of columns!
    double row[] = new double[n];
    for (int j=0; j<n; j++)  // extract the elements of the 1st row.
      row[j]=((Double)v.elementAt(j)).doubleValue();
    v.removeAllElements();
    v.addElement(row);  // Start storing rows instead of columns.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    while (tokenizer.nextToken() == StreamTokenizer.TT_WORD) {
      // While non-empty lines
      v.addElement(row = new double[n]);
      int j = 0;
      do {
<<<<<<< HEAD
        if (j >= n) {
          throw new java.io.IOException("Row " + v.size() + " is too long.");
        }
        row[j++] = Double.valueOf(tokenizer.sval).doubleValue();
      } while (tokenizer.nextToken() == StreamTokenizer.TT_WORD);
      if (j < n) {
        throw new java.io.IOException("Row " + v.size() + " is too short.");
      }
    }
    int m = v.size(); // Now we've got the number of rows.
    double[][] A = new double[m][];
    v.copyInto(A); // copy the rows out of the vector
    return new Matrix(A);
  }

  /**
   * Check if size(A) == size(B)
=======
        if (j >= n) throw new java.io.IOException
          ("Row " + v.size() + " is too long.");
        row[j++] = Double.valueOf(tokenizer.sval).doubleValue();
      } while (tokenizer.nextToken() == StreamTokenizer.TT_WORD);
      if (j < n) throw new java.io.IOException
        ("Row " + v.size() + " is too short.");
    }
    int m = v.size();  // Now we've got the number of rows.
    double[][] A = new double[m][];
    v.copyInto(A);  // copy the rows out of the vector
    return new Matrix(A);
  }


  /** 
   * Check if size(A) == size(B) 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  private void checkMatrixDimensions(Matrix B) {
    if (B.m != m || B.n != n) {
      throw new IllegalArgumentException("Matrix dimensions must agree.");
    }
  }

  /**
   * Writes out a matrix. The format can be read via the Matrix(Reader)
<<<<<<< HEAD
   * constructor. (FracPete: taken from old weka.core.Matrix class)
   * 
   * @param w the output Writer
   * @throws Exception if an error occurs
   * @see #Matrix(Reader)
=======
   * constructor.
   * (FracPete: taken from old weka.core.Matrix class)
   *
   * @param     w the output Writer
   * @throws    Exception if an error occurs
   * @see       #Matrix(Reader)
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public void write(Writer w) throws Exception {
    w.write("% Rows\tColumns\n");
    w.write("" + getRowDimension() + "\t" + getColumnDimension() + "\n");
    w.write("% Matrix elements\n");
<<<<<<< HEAD
    for (int i = 0; i < getRowDimension(); i++) {
      for (int j = 0; j < getColumnDimension(); j++) {
        w.write("" + get(i, j) + "\t");
      }
=======
    for(int i = 0; i < getRowDimension(); i++) {
      for(int j = 0; j < getColumnDimension(); j++)
        w.write("" + get(i, j) + "\t");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      w.write("\n");
    }
    w.flush();
  }

<<<<<<< HEAD
  /**
   * Converts a matrix to a string. (FracPete: taken from old weka.core.Matrix
   * class)
   * 
   * @return the converted string
   */
  @Override
=======
  /** 
   * Converts a matrix to a string.
   * (FracPete: taken from old weka.core.Matrix class)
   *
   * @return    the converted string
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String toString() {
    // Determine the width required for the maximum element,
    // and check for fractional display requirement.
    double maxval = 0;
    boolean fractional = false;
    for (int i = 0; i < getRowDimension(); i++) {
      for (int j = 0; j < getColumnDimension(); j++) {
        double current = get(i, j);
<<<<<<< HEAD
        if (current < 0) {
          current *= -11;
        }
        if (current > maxval) {
          maxval = current;
        }
        double fract = Math.abs(current - Math.rint(current));
        if (!fractional && ((Math.log(fract) / Math.log(10)) >= -2)) {
=======
        if (current < 0)
          current *= -11;
        if (current > maxval)
          maxval = current;
        double fract = Math.abs(current - Math.rint(current));
        if (!fractional
            && ((Math.log(fract) / Math.log(10)) >= -2)) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          fractional = true;
        }
      }
    }
<<<<<<< HEAD
    int width = (int) (Math.log(maxval) / Math.log(10) + (fractional ? 4 : 1));

    StringBuffer text = new StringBuffer();
    for (int i = 0; i < getRowDimension(); i++) {
      for (int j = 0; j < getColumnDimension(); j++) {
        text.append(" ").append(
          Utils.doubleToString(get(i, j), width, (fractional ? 2 : 0)));
      }
=======
    int width = (int)(Math.log(maxval) / Math.log(10) 
        + (fractional ? 4 : 1));

    StringBuffer text = new StringBuffer();   
    for (int i = 0; i < getRowDimension(); i++) {
      for (int j = 0; j < getColumnDimension(); j++)
        text.append(" ").append(Utils.doubleToString(get(i, j),
              width, (fractional ? 2 : 0)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      text.append("\n");
    }

    return text.toString();
<<<<<<< HEAD
  }

  /**
   * converts the Matrix into a single line Matlab string: matrix is enclosed by
   * parentheses, rows are separated by semicolon and single cells by blanks,
   * e.g., [1 2; 3 4].
   * 
   * @return the matrix in Matlab single line format
   */
  public String toMatlab() {
    StringBuffer result;
    int i;
    int n;
=======
  } 

  /**
   * converts the Matrix into a single line Matlab string: matrix is enclosed 
   * by parentheses, rows are separated by semicolon and single cells by
   * blanks, e.g., [1 2; 3 4].
   * @return      the matrix in Matlab single line format
   */
  public String toMatlab() {
    StringBuffer      result;
    int               i;
    int               n;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result = new StringBuffer();

    result.append("[");

    for (i = 0; i < getRowDimension(); i++) {
<<<<<<< HEAD
      if (i > 0) {
        result.append("; ");
      }

      for (n = 0; n < getColumnDimension(); n++) {
        if (n > 0) {
          result.append(" ");
        }
        result.append(Double.toString(get(i, n)));
      }
    }

=======
      if (i > 0)
        result.append("; ");
      
      for (n = 0; n < getColumnDimension(); n++) {
        if (n > 0)
          result.append(" ");
        result.append(Double.toString(get(i, n)));
      }
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.append("]");

    return result.toString();
  }

  /**
   * creates a matrix from the given Matlab string.
<<<<<<< HEAD
   * 
   * @param matlab the matrix in matlab format
   * @return the matrix represented by the given string
   * @see #toMatlab()
   */
  public static Matrix parseMatlab(String matlab) throws Exception {
    StringTokenizer tokRow;
    StringTokenizer tokCol;
    int rows;
    int cols;
    Matrix result;
    String cells;

    // get content
    cells = matlab.substring(matlab.indexOf("[") + 1, matlab.indexOf("]"))
      .trim();

    // determine dimenions
    tokRow = new StringTokenizer(cells, ";");
    rows = tokRow.countTokens();
    tokCol = new StringTokenizer(tokRow.nextToken(), " ");
    cols = tokCol.countTokens();

    // fill matrix
    result = new Matrix(rows, cols);
    tokRow = new StringTokenizer(cells, ";");
    rows = 0;
    while (tokRow.hasMoreTokens()) {
      tokCol = new StringTokenizer(tokRow.nextToken(), " ");
      cols = 0;
=======
   * @param matlab  the matrix in matlab format
   * @return        the matrix represented by the given string
   * @see           #toMatlab()
   */
  public static Matrix parseMatlab(String matlab) throws Exception {
    StringTokenizer   tokRow;
    StringTokenizer   tokCol;
    int               rows;
    int               cols;
    Matrix            result;
    String            cells;
    
    // get content
    cells = matlab.substring(
              matlab.indexOf("[") + 1, matlab.indexOf("]")).trim();
    
    // determine dimenions
    tokRow = new StringTokenizer(cells, ";");
    rows   = tokRow.countTokens();
    tokCol = new StringTokenizer(tokRow.nextToken(), " ");
    cols   = tokCol.countTokens();
    
    // fill matrix
    result = new Matrix(rows, cols);
    tokRow = new StringTokenizer(cells, ";");
    rows   = 0;
    while (tokRow.hasMoreTokens()) {
      tokCol = new StringTokenizer(tokRow.nextToken(), " ");
      cols   = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      while (tokCol.hasMoreTokens()) {
        result.set(rows, cols, Double.parseDouble(tokCol.nextToken()));
        cols++;
      }
      rows++;
    }
<<<<<<< HEAD

    return result;
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10203 $");
  }

=======
    
    return result;
  }
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.8 $");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Main method for testing this class.
   */
  public static void main(String[] args) {
<<<<<<< HEAD
    Matrix I;
    Matrix A;
    Matrix B;
=======
    Matrix        I;
    Matrix        A;
    Matrix        B;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    try {
      // Identity
      System.out.println("\nIdentity\n");
      I = Matrix.identity(3, 5);
      System.out.println("I(3,5)\n" + I);
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      // basic operations - square
      System.out.println("\nbasic operations - square\n");
      A = Matrix.random(3, 3);
      B = Matrix.random(3, 3);
      System.out.println("A\n" + A);
      System.out.println("B\n" + B);
      System.out.println("A'\n" + A.inverse());
      System.out.println("A^T\n" + A.transpose());
      System.out.println("A+B\n" + A.plus(B));
      System.out.println("A*B\n" + A.times(B));
      System.out.println("X from A*X=B\n" + A.solve(B));

      // basic operations - non square
      System.out.println("\nbasic operations - non square\n");
      A = Matrix.random(2, 3);
      B = Matrix.random(3, 4);
      System.out.println("A\n" + A);
      System.out.println("B\n" + B);
      System.out.println("A*B\n" + A.times(B));

      // sqrt
      System.out.println("\nsqrt (1)\n");
<<<<<<< HEAD
      A = new Matrix(new double[][] { { 5, -4, 1, 0, 0 }, { -4, 6, -4, 1, 0 },
        { 1, -4, 6, -4, 1 }, { 0, 1, -4, 6, -4 }, { 0, 0, 1, -4, 5 } });
=======
      A = new Matrix(new double[][]{{5,-4,1,0,0},{-4,6,-4,1,0},{1,-4,6,-4,1},{0,1,-4,6,-4},{0,0,1,-4,5}});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.out.println("A\n" + A);
      System.out.println("sqrt(A)\n" + A.sqrt());

      // sqrt
      System.out.println("\nsqrt (2)\n");
<<<<<<< HEAD
      A = new Matrix(new double[][] { { 7, 10 }, { 15, 22 } });
=======
      A = new Matrix(new double[][]{{7, 10},{15, 22}});
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.out.println("A\n" + A);
      System.out.println("sqrt(A)\n" + A.sqrt());
      System.out.println("det(A)\n" + A.det() + "\n");

      // eigenvalue decomp.
      System.out.println("\nEigenvalue Decomposition\n");
      EigenvalueDecomposition evd = A.eig();
      System.out.println("[V,D] = eig(A)");
      System.out.println("- V\n" + evd.getV());
      System.out.println("- D\n" + evd.getD());

      // LU decomp.
      System.out.println("\nLU Decomposition\n");
      LUDecomposition lud = A.lu();
      System.out.println("[L,U,P] = lu(A)");
      System.out.println("- L\n" + lud.getL());
      System.out.println("- U\n" + lud.getU());
      System.out.println("- P\n" + Utils.arrayToString(lud.getPivot()) + "\n");

      // regression
      System.out.println("\nRegression\n");
<<<<<<< HEAD
      B = new Matrix(new double[][] { { 3 }, { 2 } });
      double ridge = 0.5;
      double[] weights = new double[] { 0.3, 0.7 };
=======
      B = new Matrix(new double[][]{{3},{2}});
      double ridge = 0.5;
      double[] weights = new double[]{0.3, 0.7};
      LinearRegression lr = A.regression(B, ridge);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      System.out.println("A\n" + A);
      System.out.println("B\n" + B);
      System.out.println("ridge = " + ridge + "\n");
      System.out.println("weights = " + Utils.arrayToString(weights) + "\n");
<<<<<<< HEAD
      System.out.println("A.regression(B, ridge)\n" + A.regression(B, ridge)
        + "\n");
      System.out.println("A.regression(B, weights, ridge)\n"
        + A.regression(B, weights, ridge) + "\n");
=======
      System.out.println("A.regression(B, ridge)\n" 
          + A.regression(B, ridge) + "\n");
      System.out.println("A.regression(B, weights, ridge)\n" 
          + A.regression(B, weights, ridge) + "\n");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      // writer/reader
      System.out.println("\nWriter/Reader\n");
      StringWriter writer = new StringWriter();
      A.write(writer);
      System.out.println("A.write(Writer)\n" + writer);
      A = new Matrix(new StringReader(writer.toString()));
      System.out.println("A = new Matrix.read(Reader)\n" + A);

      // Matlab
      System.out.println("\nMatlab-Format\n");
      String matlab = "[ 1   2;3 4 ]";
      System.out.println("Matlab: " + matlab);
      System.out.println("from Matlab:\n" + Matrix.parseMatlab(matlab));
<<<<<<< HEAD
      System.out
        .println("to Matlab:\n" + Matrix.parseMatlab(matlab).toMatlab());
      matlab = "[1 2 3 4;3 4 5 6;7 8 9 10]";
      System.out.println("Matlab: " + matlab);
      System.out.println("from Matlab:\n" + Matrix.parseMatlab(matlab));
      System.out.println("to Matlab:\n" + Matrix.parseMatlab(matlab).toMatlab()
        + "\n");
    } catch (Exception e) {
=======
      System.out.println("to Matlab:\n" + Matrix.parseMatlab(matlab).toMatlab());
      matlab = "[1 2 3 4;3 4 5 6;7 8 9 10]";
      System.out.println("Matlab: " + matlab);
      System.out.println("from Matlab:\n" + Matrix.parseMatlab(matlab));
      System.out.println("to Matlab:\n" + Matrix.parseMatlab(matlab).toMatlab() + "\n");
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
    }
  }
}
