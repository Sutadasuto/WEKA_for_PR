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
 * ResultMatrixPlainText.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */

package weka.experiment;

import weka.core.RevisionUtils;
import weka.core.Utils;

/**
<<<<<<< HEAD
 * <!-- globalinfo-start --> Generates the output as plain text (for fixed width
 * fonts).
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -mean-prec &lt;int&gt;
 *  The number of decimals after the decimal point for the mean.
 *  (default: 2)
 * </pre>
 * 
 * <pre>
 * -stddev-prec &lt;int&gt;
 *  The number of decimals after the decimal point for the mean.
 *  (default: 2)
 * </pre>
 * 
 * <pre>
 * -col-name-width &lt;int&gt;
 *  The maximum width for the column names (0 = optimal).
 *  (default: 0)
 * </pre>
 * 
 * <pre>
 * -row-name-width &lt;int&gt;
 *  The maximum width for the row names (0 = optimal).
 *  (default: 25)
 * </pre>
 * 
 * <pre>
 * -mean-width &lt;int&gt;
 *  The width of the mean (0 = optimal).
 *  (default: 0)
 * </pre>
 * 
 * <pre>
 * -stddev-width &lt;int&gt;
 *  The width of the standard deviation (0 = optimal).
 *  (default: 0)
 * </pre>
 * 
 * <pre>
 * -sig-width &lt;int&gt;
 *  The width of the significance indicator (0 = optimal).
 *  (default: 0)
 * </pre>
 * 
 * <pre>
 * -count-width &lt;int&gt;
 *  The width of the counts (0 = optimal).
 *  (default: 5)
 * </pre>
 * 
 * <pre>
 * -show-stddev
 *  Whether to display the standard deviation column.
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -show-avg
 *  Whether to show the row with averages.
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -remove-filter
 *  Whether to remove the classname package prefixes from the
 *  filter names in datasets.
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -print-col-names
 *  Whether to output column names or just numbers representing them.
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -print-row-names
 *  Whether to output row names or just numbers representing them.
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -enum-col-names
 *  Whether to enumerate the column names (prefixing them with 
 *  '(x)', with 'x' being the index).
 *  (default: no)
 * </pre>
 * 
 * <pre>
 * -enum-row-names
 *  Whether to enumerate the row names (prefixing them with 
 *  '(x)', with 'x' being the index).
 *  (default: no)
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10204 $
 */
public class ResultMatrixPlainText extends ResultMatrix {

  /** for serialization. */
  private static final long serialVersionUID = 1502934525382357937L;

  /**
   * initializes the matrix as 1x1 matrix.
=======
 * This matrix is a container for the datasets and classifier setups and 
 * their statistics. It outputs the matrix in plain text (columns).
 *
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 1.8 $
 */
public class ResultMatrixPlainText
  extends ResultMatrix {

  /** for serialization */
  private static final long serialVersionUID = 1502934525382357937L;

  /**
   * initializes the matrix as 1x1 matrix
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public ResultMatrixPlainText() {
    this(1, 1);
  }

  /**
<<<<<<< HEAD
   * initializes the matrix with the given dimensions.
   * 
   * @param cols the number of columns
   * @param rows the number of rows
=======
   * initializes the matrix with the given dimensions
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public ResultMatrixPlainText(int cols, int rows) {
    super(cols, rows);
  }

  /**
<<<<<<< HEAD
   * initializes the matrix with the values from the given matrix.
   * 
   * @param matrix the matrix to get the values from
=======
   * initializes the matrix with the values from the given matrix
   * @param matrix      the matrix to get the values from
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public ResultMatrixPlainText(ResultMatrix matrix) {
    super(matrix);
  }

  /**
<<<<<<< HEAD
   * Returns a string describing the matrix.
   * 
   * @return a description suitable for displaying in the experimenter gui
   */
  @Override
  public String globalInfo() {
    return "Generates the output as plain text (for fixed width fonts).";
  }

  /**
   * returns the name of the output format.
   * 
   * @return the display name
   */
  @Override
=======
   * returns the name of the output format
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public String getDisplayName() {
    return "Plain Text";
  }

  /**
<<<<<<< HEAD
   * returns the default width for the row names.
   * 
   * @return the width
   */
  @Override
  public int getDefaultRowNameWidth() {
    return 25;
  }

  /**
   * returns the default width for the counts.
   * 
   * @return the width
   */
  @Override
  public int getDefaultCountWidth() {
    return 5;
  }

  /**
   * returns the header of the matrix as a string.
   * 
   * @return the header
   * @see #m_HeaderKeys
   * @see #m_HeaderValues
   */
  @Override
  public String toStringHeader() {
    int i;
    int size;
    String[][] data;
    String result;

    result = "";

=======
   * removes the stored data but retains the dimensions of the matrix
   */
  public void clear() {
    super.clear();
    setRowNameWidth(25);
    setCountWidth(5);
  }
  
  /**
   * returns the header of the matrix as a string
   * @see #m_HeaderKeys
   * @see #m_HeaderValues
   */
  public String toStringHeader() {
    int         i;
    int         size;
    String[][]  data;
    String      result;

    result = "";
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // fill in data
    data = new String[m_HeaderKeys.size()][2];
    for (i = 0; i < m_HeaderKeys.size(); i++) {
      data[i][0] = m_HeaderKeys.get(i).toString() + ":";
      data[i][1] = m_HeaderValues.get(i).toString();
    }

    // pad
    size = getColSize(data, 0);
<<<<<<< HEAD
    for (i = 0; i < data.length; i++) {
      data[i][0] = padString(data[i][0], size);
    }

    // build result
    for (i = 0; i < data.length; i++) {
      result += data[i][0] + " " + data[i][1] + "\n";
    }
=======
    for (i = 0; i < data.length; i++)
      data[i][0] = padString(data[i][0], size);

    // build result
    for (i = 0; i < data.length; i++)
      result += data[i][0] + " " + data[i][1] + "\n";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    return result;
  }

  /**
<<<<<<< HEAD
   * returns the matrix as plain text.
   * 
   * @return the matrix
   */
  @Override
  public String toStringMatrix() {
    StringBuffer result;
    String[][] cells;
    int i;
    int j;
    int n;
    int k;
    int size;
    String line;
    int indexBase;
    StringBuffer head;
    StringBuffer body;
    StringBuffer foot;
    int[] startMeans;
    int[] startSigs;
    int maxLength;

    result = new StringBuffer();
    head = new StringBuffer();
    body = new StringBuffer();
    foot = new StringBuffer();
    cells = toArray();
    startMeans = new int[getColCount()];
    startSigs = new int[getColCount() - 1];
    maxLength = 0;
=======
   * returns the matrix as plain text
   */
  public String toStringMatrix() {
    StringBuffer    result;
    String[][]      cells;
    int             i;
    int             j;
    int             n;
    int             k;
    int             size;
    String          line;
    int             indexBase;
    int             indexSecond;
    StringBuffer    head;
    StringBuffer    body;
    StringBuffer    foot;
    int[]           startMeans;
    int[]           startSigs;
    int             maxLength;

    result     = new StringBuffer();
    head       = new StringBuffer();
    body       = new StringBuffer();
    foot       = new StringBuffer();
    cells      = toArray();
    startMeans = new int[getColCount()];
    startSigs  = new int[getColCount() - 1];
    maxLength  = 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // pad numbers
    for (n = 1; n < cells[0].length; n++) {
      size = getColSize(cells, n, true, true);
<<<<<<< HEAD
      for (i = 1; i < cells.length - 1; i++) {
        cells[i][n] = padString(cells[i][n], size, true);
      }
=======
      for (i = 1; i < cells.length - 1; i++)
        cells[i][n] = padString(cells[i][n], size, true);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    // index of base column in array
    indexBase = 1;
<<<<<<< HEAD
    if (getShowStdDev()) {
      indexBase++;
    }

    if (getShowStdDev()) {
    }
=======
    if (getShowStdDev())
      indexBase++;

    // index of second column in array
    indexSecond = indexBase + 1;
    if (getShowStdDev())
      indexSecond++;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    // output data (without "(v/ /*)")
    j = 0;
    k = 0;
    for (i = 1; i < cells.length - 1; i++) {
<<<<<<< HEAD
      if (isAverage(i)) {
        body.append(padString("", maxLength).replaceAll(".", "-") + "\n");
      }
      line = "";

=======
      if (isAverage(i))
        body.append(padString("", maxLength).replaceAll(".", "-") + "\n");
      line = "";
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      for (n = 0; n < cells[0].length; n++) {
        // record starts
        if (i == 1) {
          if (isMean(n)) {
            startMeans[j] = line.length();
            j++;
          }

          if (isSignificance(n)) {
            startSigs[k] = line.length();
            k++;
          }
        }
<<<<<<< HEAD

        if (n == 0) {
          line += padString(cells[i][n], getRowNameWidth());
          if (!isAverage(i)) {
            line += padString(
              "(" + Utils.doubleToString(getCount(getDisplayRow(i - 1)), 0)
                + ")", getCountWidth(), true);
          } else {
            line += padString("", getCountWidth(), true);
          }
        } else {
          // additional space before means
          if (isMean(n)) {
            line += "  ";
          }
=======
        
        if (n == 0) {
          line += padString(cells[i][n], getRowNameWidth());
          if (!isAverage(i))
            line += padString("(" +
                Utils.doubleToString(getCount(getDisplayRow(i-1)), 0) + ")",
                getCountWidth(), true);
          else
            line += padString("", getCountWidth(), true);
        }
        else {
          // additional space before means
          if (isMean(n))
            line += "  ";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

          // print cell
          if (getShowStdDev()) {
            if (isMean(n - 1)) {
<<<<<<< HEAD
              if (!cells[i][n].trim().equals("")) {
                line += "(" + cells[i][n] + ")";
              } else {
                line += " " + cells[i][n] + " ";
              }
            } else {
              line += " " + cells[i][n];
            }
          } else {
=======
              if (!cells[i][n].trim().equals(""))              
                line += "(" + cells[i][n] + ")";
              else
                line += " " + cells[i][n] + " ";
            }
            else
              line += " " + cells[i][n];
          }
          else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
            line += " " + cells[i][n];
          }
        }

        // add separator after base column
<<<<<<< HEAD
        if (n == indexBase) {
          line += " |";
        }
      }

      // record overall length
      if (i == 1) {
        maxLength = line.length();
      }

=======
        if (n == indexBase)
          line += " |";
      }

      // record overall length
      if (i == 1)
        maxLength = line.length();
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      body.append(line + "\n");
    }

    // column names
    line = padString(cells[0][0], startMeans[0]);
<<<<<<< HEAD
    i = -1;
=======
    i    = -1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (n = 1; n < cells[0].length; n++) {
      if (isMean(n)) {
        i++;

<<<<<<< HEAD
        if (i == 0) {
          line = padString(line, startMeans[i] - getCountWidth());
        } else if (i == 1) {
          line = padString(line, startMeans[i] - " |".length());
        } else if (i > 1) {
          line = padString(line, startMeans[i]);
        }

        if (i == 1) {
          line += " |";
        }

=======
        if (i == 0)
          line = padString(line, startMeans[i] - getCountWidth());
        else if (i == 1)
          line = padString(line, startMeans[i] - " |".length());
        else if (i > 1)
          line = padString(line, startMeans[i]);
        
        if (i == 1)
          line += " |";
        
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        line += " " + cells[0][n];
      }
    }
    line = padString(line, maxLength);
    head.append(line + "\n");
    head.append(line.replaceAll(".", "-") + "\n");
    body.append(line.replaceAll(".", "-") + "\n");

    // output wins/losses/ties
    if (getColCount() > 1) {
<<<<<<< HEAD
      line = padString(cells[cells.length - 1][0], startMeans[1] - 2, true)
        + " |";
      i = 0;
      for (n = 1; n < cells[cells.length - 1].length; n++) {
        if (isSignificance(n)) {
          line = padString(line,
            startSigs[i] + 1 - cells[cells.length - 1][n].length());
=======
      line = padString(cells[cells.length - 1][0], startMeans[1]-2, true) + " |";
      i    = 0;
      for (n = 1; n < cells[cells.length - 1].length; n++) {
        if (isSignificance(n)) {
          line = padString(
                  line, startSigs[i] + 1 - cells[cells.length - 1][n].length());
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
          line += " " + cells[cells.length - 1][n];
          i++;
        }
      }
      line = padString(line, maxLength);
<<<<<<< HEAD
    } else {
      line = padString(cells[cells.length - 1][0], line.length() - 2) + " |";
    }
    foot.append(line + "\n");

=======
    }
    else {
      line = padString(cells[cells.length - 1][0], line.length() - 2) + " |";
    }
    foot.append(line + "\n");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // assemble output
    result.append(head.toString());
    result.append(body.toString());
    result.append(foot.toString());

    return result.toString();
  }

  /**
<<<<<<< HEAD
   * returns returns a key for all the col names, for better readability if the
   * names got cut off.
   * 
   * @return the key
   */
  @Override
  public String toStringKey() {
    String result;
    int i;

    result = "Key:\n";
    for (i = 0; i < getColCount(); i++) {
      if (getColHidden(i)) {
        continue;
      }

      result += LEFT_PARENTHESES + (i + 1) + RIGHT_PARENTHESES + " "
        + removeFilterName(m_ColNames[i]) + "\n";
=======
   * returns returns a key for all the col names, for better readability if
   * the names got cut off
   */
  public String toStringKey() {
    String          result;
    int             i;

    result = "Key:\n";
    for (i = 0; i < getColCount(); i++) {
      if (getColHidden(i))
        continue;

      result +=   LEFT_PARENTHESES + (i+1) + RIGHT_PARENTHESES 
                + " " + removeFilterName(m_ColNames[i]) + "\n";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }

    return result;
  }

  /**
<<<<<<< HEAD
   * returns the summary as string.
   * 
   * @return the summary
   */
  @Override
  public String toStringSummary() {
    String result;
    String titles;
    int resultsetLength;
    int i;
    int j;

    if (m_NonSigWins == null) {
      return "-summary data not set-";
    }

    result = "";
    titles = "";
    resultsetLength = 1 + Math.max(
      (int) (Math.log(getColCount()) / Math.log(10)),
      (int) (Math.log(getRowCount()) / Math.log(10)));

    for (i = 0; i < getColCount(); i++) {
      if (getColHidden(i)) {
        continue;
      }
      titles += " "
        + Utils.padLeft("" + getSummaryTitle(i), resultsetLength * 2 + 3);
=======
   * returns the summary as string
   */
  public String toStringSummary() {
    String      result;
    String      titles;
    int         resultsetLength;
    int         i;
    int         j;

    if (m_NonSigWins == null)
      return "-summary data not set-";
    
    result = "";
    titles = "";
    resultsetLength = 1 + Math.max((int)(Math.log(getColCount())/Math.log(10)),
                                   (int)(Math.log(getRowCount())/Math.log(10)));

    for (i = 0; i < getColCount(); i++) {
      if (getColHidden(i))
        continue;
      titles += " " + Utils.padLeft("" + getSummaryTitle(i),
				    resultsetLength * 2 + 3);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    }
    result += titles + "  (No. of datasets where [col] >> [row])\n";

    for (i = 0; i < getColCount(); i++) {
<<<<<<< HEAD
      if (getColHidden(i)) {
        continue;
      }

      for (j = 0; j < getColCount(); j++) {
        if (getColHidden(j)) {
          continue;
        }

        result += " ";
        if (j == i) {
          result += Utils.padLeft("-", resultsetLength * 2 + 3);
        } else {
          result += Utils.padLeft("" + m_NonSigWins[i][j] + " (" + m_Wins[i][j]
            + ")", resultsetLength * 2 + 3);
        }
=======
      if (getColHidden(i))
        continue;

      for (j = 0; j < getColCount(); j++) {
        if (getColHidden(j))
          continue;

        result += " ";
	if (j == i)
	  result += Utils.padLeft("-", resultsetLength * 2 + 3);
	else
	  result += Utils.padLeft("" + m_NonSigWins[i][j] 
                                  + " (" + m_Wins[i][j] + ")",
				  resultsetLength * 2 + 3);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }

      result += " | " + getSummaryTitle(i) + " = " + getColName(i) + '\n';
    }

    return result;
  }

  /**
<<<<<<< HEAD
   * returns the ranking in a string representation.
   * 
   * @return the ranking
   */
  @Override
  public String toStringRanking() {
    int biggest;
    int width;
    String result;
    int[] ranking;
    int i;
    int curr;

    if (m_RankingWins == null) {
      return "-ranking data not set-";
    }

    biggest = Math.max(m_RankingWins[Utils.maxIndex(m_RankingWins)],
      m_RankingLosses[Utils.maxIndex(m_RankingLosses)]);
    width = Math.max(2 + (int) (Math.log(biggest) / Math.log(10)),
      ">-<".length());
    result = Utils.padLeft(">-<", width) + ' ' + Utils.padLeft(">", width)
      + ' ' + Utils.padLeft("<", width) + " Resultset\n";
=======
   * returns the ranking in a string representation
   */
  public String toStringRanking() {
    int           biggest;
    int           width;
    String        result;
    int[]         ranking;
    int           i;
    int           curr;

    if (m_RankingWins == null)
      return "-ranking data not set-";

    biggest = Math.max(m_RankingWins[Utils.maxIndex(m_RankingWins)],
                       m_RankingLosses[Utils.maxIndex(m_RankingLosses)]);
    width = Math.max(2 + (int)(Math.log(biggest) / Math.log(10)),
			 ">-<".length());
    result =   Utils.padLeft(">-<", width) + ' '
             + Utils.padLeft(">", width) + ' '
             + Utils.padLeft("<", width) + " Resultset\n";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    ranking = Utils.sort(m_RankingDiff);

    for (i = getColCount() - 1; i >= 0; i--) {
      curr = ranking[i];

<<<<<<< HEAD
      if (getColHidden(curr)) {
        continue;
      }
=======
      if (getColHidden(curr))
        continue;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

      result += Utils.padLeft("" + m_RankingDiff[curr], width) + ' '
        + Utils.padLeft("" + m_RankingWins[curr], width) + ' '
        + Utils.padLeft("" + m_RankingLosses[curr], width) + ' '
        + removeFilterName(m_ColNames[curr]) + '\n';
    }

    return result;
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10204 $");
  }

  /**
   * for testing only.
   * 
   * @param args ignored
   */
  public static void main(String[] args) {
    ResultMatrix matrix;
    int i;
    int n;

    matrix = new ResultMatrixPlainText(3, 3);

=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.8 $");
  }

  /**
   * for testing only
   */
  public static void main(String[] args) {
    ResultMatrix        matrix;
    int                 i;
    int                 n;
    
    matrix = new ResultMatrixPlainText(3, 3);
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    // set header
    matrix.addHeader("header1", "value1");
    matrix.addHeader("header2", "value2");
    matrix.addHeader("header2", "value3");
<<<<<<< HEAD

    // set values
    for (i = 0; i < matrix.getRowCount(); i++) {
      for (n = 0; n < matrix.getColCount(); n++) {
        matrix.setMean(n, i, (i + 1) * n);
        matrix.setStdDev(n, i, ((double) (i + 1) * n) / 100);
        if (i == n) {
          if (i % 2 == 1) {
            matrix.setSignificance(n, i, SIGNIFICANCE_WIN);
          } else {
            matrix.setSignificance(n, i, SIGNIFICANCE_LOSS);
          }
=======
    
    // set values
    for (i = 0; i < matrix.getRowCount(); i++) {
      for (n = 0; n < matrix.getColCount(); n++) {
        matrix.setMean(n, i, (i+1)*n);
        matrix.setStdDev(n, i, ((double) (i+1)*n) / 100);
        if (i == n) {
          if (i % 2 == 1)
            matrix.setSignificance(n, i, SIGNIFICANCE_WIN);
          else
            matrix.setSignificance(n, i, SIGNIFICANCE_LOSS);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
        }
      }
    }

    System.out.println("\n\n--> " + matrix.getDisplayName());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    System.out.println("\n1. complete\n");
    System.out.println(matrix.toStringHeader() + "\n");
    System.out.println(matrix.toStringMatrix() + "\n");
    System.out.println(matrix.toStringKey());
<<<<<<< HEAD

    System.out.println("\n2. complete with std deviations\n");
    matrix.setShowStdDev(true);
    System.out.println(matrix.toStringMatrix());

    System.out.println("\n3. cols numbered\n");
    matrix.setPrintColNames(false);
    System.out.println(matrix.toStringMatrix());

    System.out.println("\n4. second col missing\n");
    matrix.setColHidden(1, true);
    System.out.println(matrix.toStringMatrix());

=======
    
    System.out.println("\n2. complete with std deviations\n");
    matrix.setShowStdDev(true);
    System.out.println(matrix.toStringMatrix());
    
    System.out.println("\n3. cols numbered\n");
    matrix.setPrintColNames(false);
    System.out.println(matrix.toStringMatrix());
    
    System.out.println("\n4. second col missing\n");
    matrix.setColHidden(1, true);
    System.out.println(matrix.toStringMatrix());
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    System.out.println("\n5. last row missing, rows numbered too\n");
    matrix.setRowHidden(2, true);
    matrix.setPrintRowNames(false);
    System.out.println(matrix.toStringMatrix());
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    System.out.println("\n6. mean prec to 3\n");
    matrix.setMeanPrec(3);
    matrix.setPrintRowNames(false);
    System.out.println(matrix.toStringMatrix());
  }
}
