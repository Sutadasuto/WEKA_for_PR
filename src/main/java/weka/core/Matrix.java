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
 *    Matrix.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.core;

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

/**
 * Class for performing operations on a matrix of floating-point values.
 * <p/>
<<<<<<< HEAD
 * Deprecated: Uses internally the code of the sub-package
 * <code>weka.core.matrix</code> - only for backwards compatibility.
 * 
=======
 * Deprecated: Uses internally the code of the sub-package 
 * <code>weka.core.matrix</code> - only for backwards compatibility.
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author Yong Wang (yongwang@cs.waikato.ac.nz)
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Len Trigg (eibe@cs.waikato.ac.nz)
 * @author Fracpete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
 * @version $Revision: 10203 $
 * @deprecated Use <code>weka.core.matrix.Matrix</code> instead - only for
 *             backwards compatibility.
 */
@Deprecated
public class Matrix implements Cloneable, Serializable, RevisionHandler {
=======
 * @version $Revision: 1.25 $
 * @deprecated Use <code>weka.core.matrix.Matrix</code> instead - only for
 * backwards compatibility. 
 */
public class Matrix 
  implements Cloneable, Serializable, RevisionHandler {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

  /** for serialization */
  private static final long serialVersionUID = -3604757095849145838L;

  /**
<<<<<<< HEAD
   * The actual matrix
   */
=======
   * The actual matrix */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  protected weka.core.matrix.Matrix m_Matrix = null;

  /**
   * Constructs a matrix and initializes it with default values.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param nr the number of rows
   * @param nc the number of columns
   */
  public Matrix(int nr, int nc) {
    m_Matrix = new weka.core.matrix.Matrix(nr, nc);
  }

  /**
   * Constructs a matrix using a given array.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param array the values of the matrix
   */
  public Matrix(double[][] array) throws Exception {
    m_Matrix = new weka.core.matrix.Matrix(array);
  }

  /**
<<<<<<< HEAD
   * Reads a matrix from a reader. The first line in the file should contain the
   * number of rows and columns. Subsequent lines contain elements of the
   * matrix.
   * 
=======
   * Reads a matrix from a reader. The first line in the file should
   * contain the number of rows and columns. Subsequent lines
   * contain elements of the matrix.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param r the reader containing the matrix
   * @throws Exception if an error occurs
   */
  public Matrix(Reader r) throws Exception {
    m_Matrix = new weka.core.matrix.Matrix(r);
  }

  /**
   * Creates and returns a clone of this object.
<<<<<<< HEAD
   * 
   * @return a clone of this instance.
   * @throws Exception if an error occurs
   */
  @Override
  public Object clone() {
    try {
      return new Matrix(m_Matrix.getArrayCopy());
    } catch (Exception e) {
=======
   *
   * @return a clone of this instance.
   * @throws Exception if an error occurs
   */
  public Object clone() {
    try {
      return new Matrix(m_Matrix.getArrayCopy());
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      return null;
    }
  }

  /**
   * Writes out a matrix.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param w the output Writer
   * @throws Exception if an error occurs
   */
  public void write(Writer w) throws Exception {
    m_Matrix.write(w);
  }

  /**
   * returns the internal matrix
<<<<<<< HEAD
   * 
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @see #m_Matrix
   */
  protected weka.core.matrix.Matrix getMatrix() {
    return m_Matrix;
  }

  /**
   * Returns the value of a cell in the matrix.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rowIndex the row's index
   * @param columnIndex the column's index
   * @return the value of the cell of the matrix
   */
  public final double getElement(int rowIndex, int columnIndex) {
    return m_Matrix.get(rowIndex, columnIndex);
  }

  /**
   * Add a value to an element.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rowIndex the row's index.
   * @param columnIndex the column's index.
   * @param value the value to add.
   */
  public final void addElement(int rowIndex, int columnIndex, double value) {
<<<<<<< HEAD
    m_Matrix.set(rowIndex, columnIndex, m_Matrix.get(rowIndex, columnIndex)
      + value);
=======
    m_Matrix.set(
        rowIndex, columnIndex, m_Matrix.get(rowIndex, columnIndex) + value);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the number of rows in the matrix.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the number of rows
   */
  public final int numRows() {
    return m_Matrix.getRowDimension();
  }

  /**
   * Returns the number of columns in the matrix.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the number of columns
   */
  public final int numColumns() {
    return m_Matrix.getColumnDimension();
  }

  /**
   * Sets an element of the matrix to the given value.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param rowIndex the row's index
   * @param columnIndex the column's index
   * @param value the value
   */
  public final void setElement(int rowIndex, int columnIndex, double value) {
    m_Matrix.set(rowIndex, columnIndex, value);
  }

  /**
   * Sets a row of the matrix to the given row. Performs a deep copy.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param index the row's index
   * @param newRow an array of doubles
   */
  public final void setRow(int index, double[] newRow) {
<<<<<<< HEAD
    for (int i = 0; i < newRow.length; i++) {
      m_Matrix.set(index, i, newRow[i]);
    }
  }

  /**
   * Gets a row of the matrix and returns it as double array.
   * 
=======
    for (int i = 0; i < newRow.length; i++)
      m_Matrix.set(index, i, newRow[i]);
  }
  
  /**
   * Gets a row of the matrix and returns it as double array.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param index the row's index
   * @return an array of doubles
   */
  public double[] getRow(int index) {
    double[] newRow = new double[this.numColumns()];
<<<<<<< HEAD
    for (int i = 0; i < newRow.length; i++) {
      newRow[i] = getElement(index, i);
    }
=======
    for (int i = 0; i < newRow.length; i++)
      newRow[i] = getElement(index, i);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newRow;
  }

  /**
   * Gets a column of the matrix and returns it as a double array.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param index the column's index
   * @return an array of doubles
   */
  public double[] getColumn(int index) {
    double[] newColumn = new double[this.numRows()];
<<<<<<< HEAD
    for (int i = 0; i < newColumn.length; i++) {
      newColumn[i] = getElement(i, index);
    }
=======
    for (int i = 0; i < newColumn.length; i++)
      newColumn[i] = getElement(i, index);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return newColumn;
  }

  /**
   * Sets a column of the matrix to the given column. Performs a deep copy.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param index the column's index
   * @param newColumn an array of doubles
   */
  public final void setColumn(int index, double[] newColumn) {
<<<<<<< HEAD
    for (int i = 0; i < numRows(); i++) {
      m_Matrix.set(i, index, newColumn[i]);
    }
  }

  /**
   * Converts a matrix to a string
   * 
   * @return the converted string
   */
  @Override
  public String toString() {
    return m_Matrix.toString();
  }

  /**
   * Returns the sum of this matrix with another.
   * 
=======
    for (int i = 0; i < numRows(); i++)
      m_Matrix.set(i, index, newColumn[i]);
  }

  /** 
   * Converts a matrix to a string
   *
   * @return the converted string
   */
  public String toString() {
    return m_Matrix.toString();
  } 
    
  /**
   * Returns the sum of this matrix with another.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return a matrix containing the sum.
   */
  public final Matrix add(Matrix other) {
    try {
      return new Matrix(m_Matrix.plus(other.getMatrix()).getArrayCopy());
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      return null;
    }
  }
<<<<<<< HEAD

  /**
   * Returns the transpose of a matrix.
   * 
=======
  
  /**
   * Returns the transpose of a matrix.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the transposition of this instance.
   */
  public final Matrix transpose() {
    try {
      return new Matrix(m_Matrix.transpose().getArrayCopy());
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      return null;
    }
  }
<<<<<<< HEAD

  /**
   * Returns true if the matrix is symmetric.
   * 
=======
  
  /**
   * Returns true if the matrix is symmetric.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return boolean true if matrix is symmetric.
   */
  public boolean isSymmetric() {
    return m_Matrix.isSymmetric();
  }

  /**
   * Returns the multiplication of two matrices
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param b the multiplication matrix
   * @return the product matrix
   */
  public final Matrix multiply(Matrix b) {
    try {
      return new Matrix(getMatrix().times(b.getMatrix()).getArrayCopy());
<<<<<<< HEAD
    } catch (Exception e) {
=======
    }
    catch (Exception e) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      e.printStackTrace();
      return null;
    }
  }

  /**
   * Performs a (ridged) linear regression.
<<<<<<< HEAD
   * 
   * @param y the dependent variable vector
   * @param ridge the ridge parameter
   * @return the coefficients
=======
   *
   * @param y the dependent variable vector
   * @param ridge the ridge parameter
   * @return the coefficients 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @throws IllegalArgumentException if not successful
   */
  public final double[] regression(Matrix y, double ridge) {
    return getMatrix().regression(y.getMatrix(), ridge).getCoefficients();
  }

  /**
<<<<<<< HEAD
   * Performs a weighted (ridged) linear regression.
   * 
   * @param y the dependent variable vector
   * @param w the array of data point weights
   * @param ridge the ridge parameter
   * @return the coefficients
   * @throws IllegalArgumentException if the wrong number of weights were
   *           provided.
   */
  public final double[] regression(Matrix y, double[] w, double ridge) {
=======
   * Performs a weighted (ridged) linear regression. 
   *
   * @param y the dependent variable vector
   * @param w the array of data point weights
   * @param ridge the ridge parameter
   * @return the coefficients 
   * @throws IllegalArgumentException if the wrong number of weights were
   * provided.
   */
  public final double[] regression(Matrix y, double [] w, double ridge) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return getMatrix().regression(y.getMatrix(), w, ridge).getCoefficients();
  }

  /**
<<<<<<< HEAD
   * Returns the L part of the matrix. This does only make sense after LU
   * decomposition.
   * 
   * @return matrix with the L part of the matrix;
   * @see #LUDecomposition()
   */
  public Matrix getL() throws Exception {
    int nr = numRows(); // num of rows
=======
   * Returns the L part of the matrix.
   * This does only make sense after LU decomposition.
   *
   * @return matrix with the L part of the matrix; 
   * @see #LUDecomposition()
   */
  public Matrix getL() throws Exception {
    int nr = numRows();    // num of rows
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int nc = numColumns(); // num of columns
    double[][] ld = new double[nr][nc];

    for (int i = 0; i < nr; i++) {
      for (int j = 0; (j < i) && (j < nc); j++) {
        ld[i][j] = getElement(i, j);
      }
<<<<<<< HEAD
      if (i < nc) {
        ld[i][i] = 1;
      }
=======
      if (i < nc) ld[i][i] = 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    Matrix l = new Matrix(ld);
    return l;
  }

  /**
<<<<<<< HEAD
   * Returns the U part of the matrix. This does only make sense after LU
   * decomposition.
   * 
   * @return matrix with the U part of a matrix;
   * @see #LUDecomposition()
   */
  public Matrix getU() throws Exception {
    int nr = numRows(); // num of rows
=======
   * Returns the U part of the matrix.
   * This does only make sense after LU decomposition.
   *
   * @return matrix with the U part of a matrix; 
   * @see #LUDecomposition()
   */
  public Matrix getU() throws Exception {
    int nr = numRows();    // num of rows
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    int nc = numColumns(); // num of columns
    double[][] ud = new double[nr][nc];

    for (int i = 0; i < nr; i++) {
<<<<<<< HEAD
      for (int j = i; j < nc; j++) {
=======
      for (int j = i; j < nc ; j++) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        ud[i][j] = getElement(i, j);
      }
    }
    Matrix u = new Matrix(ud);
    return u;
  }
<<<<<<< HEAD

  /**
   * Performs a LUDecomposition on the matrix. It changes the matrix into its LU
   * decomposition.
   * 
=======
  
  /**
   * Performs a LUDecomposition on the matrix.
   * It changes the matrix into its LU decomposition.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the indices of the row permutation
   */
  public int[] LUDecomposition() throws Exception {
    // decompose
    weka.core.matrix.LUDecomposition lu = m_Matrix.lu();

    // singular? old class throws Exception!
<<<<<<< HEAD
    if (!lu.isNonsingular()) {
      throw new Exception("Matrix is singular");
    }
=======
    if (!lu.isNonsingular())
    	throw new Exception("Matrix is singular");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    weka.core.matrix.Matrix u = lu.getU();
    weka.core.matrix.Matrix l = lu.getL();

    // modify internal matrix
    int nr = numRows();
    int nc = numColumns();
    for (int i = 0; i < nr; i++) {
      for (int j = 0; j < nc; j++) {
<<<<<<< HEAD
        if (j < i) {
          setElement(i, j, l.get(i, j));
        } else {
          setElement(i, j, u.get(i, j));
        }
=======
        if (j < i)
          setElement(i, j, l.get(i, j));
        else
          setElement(i, j, u.get(i, j));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }

    u = null;
    l = null;
<<<<<<< HEAD

    return lu.getPivot();
  }

  /**
   * Solve A*X = B using backward substitution. A is current object (this). Note
   * that this matrix will be changed! B parameter bb. X returned in parameter
   * bb.
   * 
=======
    
    return lu.getPivot();
  }
  
  /**
   * Solve A*X = B using backward substitution.
   * A is current object (this). Note that this matrix will be changed! 
   * B parameter bb.
   * X returned in parameter bb.
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param bb first vector B in above equation then X in same equation.
   */
  public void solve(double[] bb) throws Exception {
    // solve
<<<<<<< HEAD
    weka.core.matrix.Matrix x = m_Matrix.solve(new weka.core.matrix.Matrix(bb,
      bb.length));

    // move X into bb
    int nr = x.getRowDimension();
    for (int i = 0; i < nr; i++) {
      bb[i] = x.get(i, 0);
    }
=======
    weka.core.matrix.Matrix x = m_Matrix.solve(
                                    new weka.core.matrix.Matrix(bb, bb.length));
    
    // move X into bb
    int nr = x.getRowDimension();
    for (int i = 0; i < nr; i++)
      bb[i] = x.get(i, 0);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Performs Eigenvalue Decomposition using Householder QR Factorization
<<<<<<< HEAD
   * 
   * Matrix must be symmetrical. Eigenvectors are return in parameter V, as
   * columns of the 2D array. (Real parts of) Eigenvalues are returned in
   * parameter d.
   * 
   * @param V double array in which the eigenvectors are returned
   * @param d array in which the eigenvalues are returned
   * @throws Exception if matrix is not symmetric
   */
  public void eigenvalueDecomposition(double[][] V, double[] d)
    throws Exception {

    // old class only worked with symmetric matrices!
    if (!this.isSymmetric()) {
      throw new Exception("EigenvalueDecomposition: Matrix must be symmetric.");
    }

=======
   *
   * Matrix must be symmetrical.
   * Eigenvectors are return in parameter V, as columns of the 2D array.
   * (Real parts of) Eigenvalues are returned in parameter d.
   *
   * @param V double array in which the eigenvectors are returned 
   * @param d array in which the eigenvalues are returned
   * @throws Exception if matrix is not symmetric
   */
  public void eigenvalueDecomposition(double[][] V, double[] d) 
    throws Exception {

    // old class only worked with symmetric matrices!
    if (!this.isSymmetric())
      throw new Exception("EigenvalueDecomposition: Matrix must be symmetric.");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // perform eigenvalue decomposition
    weka.core.matrix.EigenvalueDecomposition eig = m_Matrix.eig();
    weka.core.matrix.Matrix v = eig.getV();
    double[] d2 = eig.getRealEigenvalues();
<<<<<<< HEAD

    // transfer data
    int nr = numRows();
    int nc = numColumns();
    for (int i = 0; i < nr; i++) {
      for (int j = 0; j < nc; j++) {
        V[i][j] = v.get(i, j);
      }
    }

    for (int i = 0; i < d2.length; i++) {
      d[i] = d2[i];
    }
  }

  /**
   * Returns sqrt(a^2 + b^2) without under/overflow.
   * 
=======
    
    // transfer data
    int nr = numRows();
    int nc = numColumns();
    for (int i = 0; i < nr; i++)
      for (int j = 0; j < nc; j++)
        V[i][j] = v.get(i, j);

    for (int i = 0; i < d2.length; i++)
      d[i] = d2[i];
  } 

  /**
   * Returns sqrt(a^2 + b^2) without under/overflow.
   *   
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param a length of one side of rectangular triangle
   * @param b length of other side of rectangular triangle
   * @return lenght of third side
   */
  protected static double hypot(double a, double b) {
    return weka.core.matrix.Maths.hypot(a, b);
  }

  /**
<<<<<<< HEAD
   * converts the Matrix into a single line Matlab string: matrix is enclosed by
   * parentheses, rows are separated by semicolon and single cells by blanks,
   * e.g., [1 2; 3 4].
   * 
   * @return the matrix in Matlab single line format
=======
   * converts the Matrix into a single line Matlab string: matrix is enclosed 
   * by parentheses, rows are separated by semicolon and single cells by
   * blanks, e.g., [1 2; 3 4].
   * @return      the matrix in Matlab single line format
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String toMatlab() {
    return getMatrix().toMatlab();
  }

  /**
   * creates a matrix from the given Matlab string.
<<<<<<< HEAD
   * 
   * @param matlab the matrix in matlab format
   * @return the matrix represented by the given string
   * @see #toMatlab()
=======
   * @param matlab  the matrix in matlab format
   * @return        the matrix represented by the given string
   * @see           #toMatlab()
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public static Matrix parseMatlab(String matlab) throws Exception {
    return new Matrix(weka.core.matrix.Matrix.parseMatlab(matlab).getArray());
  }
<<<<<<< HEAD

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
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.25 $");
  }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  /**
   * Main method for testing this class.
   */
  public static void main(String[] ops) {

<<<<<<< HEAD
    double[] first = { 2.3, 1.2, 5 };
    double[] second = { 5.2, 1.4, 9 };
    double[] response = { 4, 7, 8 };
    double[] weights = { 1, 2, 3 };

    try {
      // test eigenvaluedecomposition
      double[][] m = { { 1, 2, 3 }, { 2, 5, 6 }, { 3, 6, 9 } };
=======
    double[] first = {2.3, 1.2, 5};
    double[] second = {5.2, 1.4, 9};
    double[] response = {4, 7, 8};
    double[] weights = {1, 2, 3};

    try {
      // test eigenvaluedecomposition
      double[][] m = {{1, 2, 3}, {2, 5, 6},{3, 6, 9}};
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      Matrix M = new Matrix(m);
      int n = M.numRows();
      double[][] V = new double[n][n];
      double[] d = new double[n];
<<<<<<< HEAD
      M.eigenvalueDecomposition(V, d);

=======
      double[] e = new double[n];
      M.eigenvalueDecomposition(V, d);
      Matrix v = new Matrix(V);
      // M.testEigen(v, d, );
      // end of test-eigenvaluedecomposition
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      Matrix a = new Matrix(2, 3);
      Matrix b = new Matrix(3, 2);
      System.out.println("Number of columns for a: " + a.numColumns());
      System.out.println("Number of rows for a: " + a.numRows());
      a.setRow(0, first);
      a.setRow(1, second);
      b.setColumn(0, first);
      b.setColumn(1, second);
      System.out.println("a:\n " + a);
      System.out.println("b:\n " + b);
      System.out.println("a (0, 0): " + a.getElement(0, 0));
      System.out.println("a transposed:\n " + a.transpose());
      System.out.println("a * b:\n " + a.multiply(b));
      Matrix r = new Matrix(3, 1);
      r.setColumn(0, response);
      System.out.println("r:\n " + r);
      System.out.println("Coefficients of regression of b on r: ");
      double[] coefficients = b.regression(r, 1.0e-8);
<<<<<<< HEAD
      for (double coefficient : coefficients) {
        System.out.print(coefficient + " ");
      }
      System.out.println();
      System.out.println("Weights: ");
      for (double weight : weights) {
        System.out.print(weight + " ");
=======
      for (int i = 0; i < coefficients.length; i++) {
	System.out.print(coefficients[i] + " ");
      }
      System.out.println();
      System.out.println("Weights: ");
      for (int i = 0; i < weights.length; i++) {
	System.out.print(weights[i] + " ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.out.println();
      System.out.println("Coefficients of weighted regression of b on r: ");
      coefficients = b.regression(r, weights, 1.0e-8);
<<<<<<< HEAD
      for (double coefficient : coefficients) {
        System.out.print(coefficient + " ");
=======
      for (int i = 0; i < coefficients.length; i++) {
	System.out.print(coefficients[i] + " ");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
      System.out.println();
      a.setElement(0, 0, 6);
      System.out.println("a with (0, 0) set to 6:\n " + a);
      a.write(new java.io.FileWriter("main.matrix"));
      System.out.println("wrote matrix to \"main.matrix\"\n" + a);
      a = new Matrix(new java.io.FileReader("main.matrix"));
      System.out.println("read matrix from \"main.matrix\"\n" + a);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
<<<<<<< HEAD
=======

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
