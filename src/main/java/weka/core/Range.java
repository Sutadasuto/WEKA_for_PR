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
 *    Range.java
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 1999-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 1999 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core;

import java.io.Serializable;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing a range of cardinal numbers. The range is set by a string
 * representation such as:
 * <P>
 * 
 * <code>
 *   first-last
 *   1,2,3,4
 * </code>
 * <P>
 * or combinations thereof. The range is internally converted from 1-based to
 * 0-based (so methods that set or get numbers not in string format should use
 * 0-based numbers).
 * 
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 10203 $
 */
public class Range implements Serializable, RevisionHandler,
  CustomDisplayStringProvider {

  /** for serialization. */
  static final long serialVersionUID = 3667337062176835900L;

  /** Record the string representations of the columns to delete. */
  /* @non_null spec_public@ */ArrayList<String> m_RangeStrings = new ArrayList<String>();

  /** Whether matching should be inverted. */
  /* @spec_public@ */boolean m_Invert;

  /** The array of flags for whether an column is selected. */
  /* @spec_public@ */boolean[] m_SelectFlags;

  /**
   * Store the maximum value permitted in the range. -1 indicates that no upper
   * value has been set
   */
  /* @spec_public@ */int m_Upper = -1;

  /** Default constructor. */
  // @assignable this.*;
  public Range() {
<<<<<<< HEAD
=======
=======
import java.util.Enumeration;
import java.util.Vector;

/** 
 * Class representing a range of cardinal numbers. The range is set by a 
 * string representation such as: <P>
 *
 * <code>
 *   first-last
 *   1,2,3,4
 * </code> <P>
 * or combinations thereof. The range is internally converted from
 * 1-based to 0-based (so methods that set or get numbers not in string
 * format should use 0-based numbers).
 *
 * @author Len Trigg (trigg@cs.waikato.ac.nz)
 * @version $Revision: 1.18 $
 */
public class Range
  implements Serializable, RevisionHandler {
  
  /** for serialization */
  static final long serialVersionUID = 3667337062176835900L;

  /** Record the string representations of the columns to delete */
  /*@non_null spec_public@*/Vector m_RangeStrings = new Vector();

  /** Whether matching should be inverted */
  /*@spec_public@*/ boolean m_Invert;

  /** The array of flags for whether an column is selected */
  /*@spec_public@*/boolean [] m_SelectFlags;

  /** Store the maximum value permitted in the range. -1 indicates that
      no upper value has been set */
  /*@spec_public@*/ int m_Upper = -1;

  /** Default constructor. */
  //@assignable this.*;
    public Range() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Constructor to set initial range.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param rangeList the initial range
   * @throws IllegalArgumentException if the range list is invalid
   */
  public Range(/* @non_null@ */String rangeList) {
<<<<<<< HEAD
=======
=======
   *
   * @param rangeList the initial range
   * @throws IllegalArgumentException if the range list is invalid
   */
  public Range(/*@non_null@*/ String rangeList) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    setRanges(rangeList);
  }

  /**
   * Sets the value of "last".
<<<<<<< HEAD
   * 
=======
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newUpper the value of "last"
   */
  public void setUpper(int newUpper) {

    if (newUpper >= 0) {
      m_Upper = newUpper;
      setFlags();
    }
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * Gets whether the range sense is inverted, i.e. all <i>except</i> the values
   * included by the range string are selected.
   * 
   * @return whether the matching sense is inverted
   */
  // @ensures \result <==> m_Invert;
  public/* @pure@ */boolean getInvert() {
<<<<<<< HEAD
=======
=======
  
  /**
   * Gets whether the range sense is inverted, i.e. all <i>except</i>
   * the values included by the range string are selected.
   * 
   * @return whether the matching sense is inverted
   */
  //@ensures \result <==> m_Invert;
  public /*@pure@*/boolean getInvert() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return m_Invert;
  }

  /**
<<<<<<< HEAD
   * Sets whether the range sense is inverted, i.e. all <i>except</i> the values
   * included by the range string are selected.
=======
<<<<<<< HEAD
   * Sets whether the range sense is inverted, i.e. all <i>except</i> the values
   * included by the range string are selected.
=======
   * Sets whether the range sense is inverted, i.e. all <i>except</i>
   * the values included by the range string are selected.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param newSetting true if the matching sense is inverted
   */
  public void setInvert(boolean newSetting) {

    m_Invert = newSetting;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets the string representing the selected range of values.
   * 
   * @return the range selection string
   */
  public/* @non_null pure@ */String getRanges() {

    StringBuffer result = new StringBuffer(m_RangeStrings.size() * 4);
<<<<<<< HEAD
=======
=======
   * Gets the string representing the selected range of values
   *
   * @return the range selection string
   */
  public /*@non_null pure@*/String getRanges() {

    StringBuffer result = new StringBuffer(m_RangeStrings.size()*4);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    boolean first = true;
    char sep = ',';
    for (int i = 0; i < m_RangeStrings.size(); i++) {
      if (first) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        result.append(m_RangeStrings.get(i));
        first = false;
      } else {
        result.append(sep + m_RangeStrings.get(i));
<<<<<<< HEAD
=======
=======
        result.append((String)m_RangeStrings.elementAt(i));
        first = false;
      } else {
        result.append(sep + (String)m_RangeStrings.elementAt(i));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    return result.toString();
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Sets the ranges from a string representation. Note that setUpper() must be
   * called afterwards for ranges to be actually set internally.
   * 
   * @param rangeList the comma separated list of ranges. The empty string sets
   *          the range to empty.
   * @throws IllegalArgumentException if the rangeList was not well formed
   */
  // @requires rangeList != null;
  // @assignable m_RangeStrings,m_SelectFlags;
  public void setRanges(String rangeList) {

    ArrayList<String> ranges = new ArrayList<String>(10);
<<<<<<< HEAD
=======
=======
   * Sets the ranges from a string representation. Note that setUpper()
   * must be called afterwards for ranges to be actually set internally.
   *
   * @param rangeList the comma separated list of ranges. The empty
   * string sets the range to empty.
   * @throws IllegalArgumentException if the rangeList was not well formed
   */
  //@requires rangeList != null;
  //@assignable m_RangeStrings,m_SelectFlags;
  public void setRanges(String rangeList) {

    Vector ranges = new Vector (10);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    // Split the rangeList up into the vector
    while (!rangeList.equals("")) {
      String range = rangeList.trim();
      int commaLoc = rangeList.indexOf(',');
      if (commaLoc != -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        range = rangeList.substring(0, commaLoc).trim();
        rangeList = rangeList.substring(commaLoc + 1).trim();
      } else {
        rangeList = "";
      }
      if (!range.equals("")) {
        ranges.add(range);
<<<<<<< HEAD
=======
=======
	range = rangeList.substring(0, commaLoc).trim();
	rangeList = rangeList.substring(commaLoc + 1).trim();
      } else {
	rangeList = "";
      }
      if (!range.equals("")) {
	ranges.addElement(range);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
    m_RangeStrings = ranges;
    m_SelectFlags = null;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets whether the supplied cardinal number is included in the current range.
   * 
   * @param index the number of interest
   * @return true if index is in the current range
   * @throws RuntimeException if the upper limit of the range hasn't been
   *           defined
   */
  // @requires m_Upper >= 0;
  // @requires 0 <= index && index < m_SelectFlags.length;
  public/* @pure@ */boolean isInRange(int index) {
<<<<<<< HEAD
=======
=======
   * Gets whether the supplied cardinal number is included in the current
   * range.
   *
   * @param index the number of interest
   * @return true if index is in the current range
   * @throws RuntimeException if the upper limit of the range hasn't been defined
   */
  //@requires m_Upper >= 0;
  //@requires 0 <= index && index < m_SelectFlags.length;
  public /*@pure@*/ boolean isInRange(int index) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_Upper == -1) {
      throw new RuntimeException("No upper limit has been specified for range");
    }
    if (m_Invert) {
      return !m_SelectFlags[index];
    } else {
      return m_SelectFlags[index];
    }
  }

  /**
   * Constructs a representation of the current range. Being a string
   * representation, the numbers are based from 1.
   * 
   * @return the string representation of the current range
   */
<<<<<<< HEAD
  @Override
  public/* @non_null pure@ */String toString() {
=======
<<<<<<< HEAD
  @Override
  public/* @non_null pure@ */String toString() {
=======
  public /*@non_null pure@*/ String toString() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_RangeStrings.size() == 0) {
      return "Empty";
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String result = "Strings: ";
    Iterator<String> enu = m_RangeStrings.iterator();
    while (enu.hasNext()) {
      result += enu.next() + " ";
<<<<<<< HEAD
=======
=======
    String result ="Strings: ";
    Enumeration enu = m_RangeStrings.elements();
    while (enu.hasMoreElements()) {
      result += (String)enu.nextElement() + " ";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    result += "\n";

    result += "Invert: " + m_Invert + "\n";

    try {
      if (m_Upper == -1) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        throw new RuntimeException("Upper limit has not been specified");
      }
      String cols = null;
      for (int i = 0; i < m_SelectFlags.length; i++) {
        if (isInRange(i)) {
          if (cols == null) {
            cols = "Cols: " + (i + 1);
          } else {
            cols += "," + (i + 1);
          }
        }
      }
      if (cols != null) {
        result += cols + "\n";
<<<<<<< HEAD
=======
=======
	throw new RuntimeException("Upper limit has not been specified");
      }
      String cols = null;
      for (int i = 0; i < m_SelectFlags.length; i++) {
	if (isInRange(i)) {
	  if (cols == null) {
	    cols = "Cols: " + (i + 1);
	  } else {
	    cols += "," + (i + 1);
	  }
	}
      }
      if (cols != null) {
	result += cols + "\n";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    } catch (Exception ex) {
      result += ex.getMessage();
    }
    return result;
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Gets an array containing all the selected values, in the order that they
   * were selected (or ascending order if range inversion is on).
   * 
   * @return the array of selected values
   * @throws RuntimeException if the upper limit of the range hasn't been
   *           defined
   */
  // @requires m_Upper >= 0;
  public/* @non_null@ */int[] getSelection() {
<<<<<<< HEAD
=======
=======
   * Gets an array containing all the selected values, in the order
   * that they were selected (or ascending order if range inversion is on)
   *
   * @return the array of selected values
   * @throws RuntimeException if the upper limit of the range hasn't been defined
   */
  //@requires m_Upper >= 0;
  public /*@non_null@*/ int [] getSelection() {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (m_Upper == -1) {
      throw new RuntimeException("No upper limit has been specified for range");
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    int[] selectIndices = new int[m_Upper + 1];
    int numSelected = 0;
    if (m_Invert) {
      for (int i = 0; i <= m_Upper; i++) {
        if (!m_SelectFlags[i]) {
          selectIndices[numSelected++] = i;
        }
      }
    } else {
      Iterator<String> enu = m_RangeStrings.iterator();
      while (enu.hasNext()) {
        String currentRange = enu.next();
        int start = rangeLower(currentRange);
        int end = rangeUpper(currentRange);
        for (int i = start; (i <= m_Upper) && (i <= end); i++) {
          if (m_SelectFlags[i]) {
            selectIndices[numSelected++] = i;
          }
        }
      }
    }
    int[] result = new int[numSelected];
<<<<<<< HEAD
=======
=======
    int [] selectIndices = new int [m_Upper + 1];
    int numSelected = 0;
    if (m_Invert)
    {
      for (int i = 0; i <= m_Upper; i++) {
	if (!m_SelectFlags[i]) {
	  selectIndices[numSelected++] = i;
	}
      }
    }
    else
    {
      Enumeration enu = m_RangeStrings.elements();
      while (enu.hasMoreElements()) {
	String currentRange = (String)enu.nextElement();
	int start = rangeLower(currentRange);
	int end = rangeUpper(currentRange);
	for (int i = start; (i <= m_Upper) && (i <= end); i++) {
	  if (m_SelectFlags[i]) {
	    selectIndices[numSelected++] = i;
	  }
	}
      }
    }
    int [] result = new int [numSelected];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    System.arraycopy(selectIndices, 0, result, 0, numSelected);
    return result;
  }

  /**
   * Creates a string representation of the indices in the supplied array.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param indices an array containing indices to select. Since the array will
   *          typically come from a program, indices are assumed from 0, and
   *          thus will have 1 added in the String representation.
   * @return the string representation of the indices
   */
  public static/* @non_null pure@ */String indicesToRangeList(
  /* @non_null@ */int[] indices) {
<<<<<<< HEAD
=======
=======
   *
   * @param indices an array containing indices to select.
   * Since the array will typically come from a program, indices are assumed
   * from 0, and thus will have 1 added in the String representation.
   * @return the string representation of the indices
   */
  public static /*@non_null pure@*/String indicesToRangeList(/*@non_null@*/ int []indices) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    StringBuffer rl = new StringBuffer();
    int last = -2;
    boolean range = false;
<<<<<<< HEAD
    for (int i = 0; i < indices.length; i++) {
      if (i == 0) {
        rl.append(indices[i] + 1);
=======
<<<<<<< HEAD
    for (int i = 0; i < indices.length; i++) {
      if (i == 0) {
        rl.append(indices[i] + 1);
=======
    for(int i = 0; i < indices.length; i++) {
      if (i == 0) {
	rl.append(indices[i] + 1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      } else if (indices[i] == last) {
        range = true;
      } else {
        if (range) {
          rl.append('-').append(last);
          range = false;
        }
<<<<<<< HEAD
        rl.append(',').append(indices[i] + 1);
=======
<<<<<<< HEAD
        rl.append(',').append(indices[i] + 1);
=======
	rl.append(',').append(indices[i] + 1);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      last = indices[i] + 1;
    }
    if (range) {
      rl.append('-').append(last);
    }
    return rl.toString();
  }

  /** Sets the flags array. */
  protected void setFlags() {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_SelectFlags = new boolean[m_Upper + 1];
    Iterator<String> enu = m_RangeStrings.iterator();
    while (enu.hasNext()) {
      String currentRange = enu.next();
      if (!isValidRange(currentRange)) {
        throw new IllegalArgumentException("Invalid range list at "
          + currentRange);
<<<<<<< HEAD
=======
=======
    m_SelectFlags = new boolean [m_Upper + 1];
    Enumeration enu = m_RangeStrings.elements();
    while (enu.hasMoreElements()) {
      String currentRange = (String)enu.nextElement();
      if (!isValidRange(currentRange)) {
	throw new IllegalArgumentException("Invalid range list at " + currentRange);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      int start = rangeLower(currentRange);
      int end = rangeUpper(currentRange);
      for (int i = start; (i <= m_Upper) && (i <= end); i++) {
<<<<<<< HEAD
        m_SelectFlags[i] = true;
=======
<<<<<<< HEAD
        m_SelectFlags[i] = true;
=======
	m_SelectFlags[i] = true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Translates a single string selection into it's internal 0-based equivalent.
   * 
   * @param single the string representing the selection (eg: 1 first last)
   * @return the number corresponding to the selected value
   */
  protected/* @pure@ */int rangeSingle(/* @non_null@ */String single) {
<<<<<<< HEAD
=======
=======

  /**
   * Translates a single string selection into it's internal 0-based equivalent
   *
   * @param single the string representing the selection (eg: 1 first last)
   * @return the number corresponding to the selected value
   */
  protected /*@pure@*/ int rangeSingle(/*@non_null@*/ String single) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    if (single.toLowerCase().equals("first")) {
      return 0;
    }
    if (single.toLowerCase().equals("last")) {
      return m_Upper;
    }
    int index = Integer.parseInt(single) - 1;
    if (index < 0) {
      index = 0;
    }
    if (index > m_Upper) {
      index = m_Upper;
    }
    return index;
  }

  /**
   * Translates a range into it's lower index.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param range the string representation of the range
   * @return the lower index of the range
   */
  protected int rangeLower(/* @non_null@ */String range) {
<<<<<<< HEAD
=======
=======
   *
   * @param range the string representation of the range
   * @return the lower index of the range
   */ 
  protected int rangeLower(/*@non_null@*/ String range) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int hyphenIndex;
    if ((hyphenIndex = range.indexOf('-')) >= 0) {
      return Math.min(rangeLower(range.substring(0, hyphenIndex)),
<<<<<<< HEAD
        rangeLower(range.substring(hyphenIndex + 1)));
=======
<<<<<<< HEAD
        rangeLower(range.substring(hyphenIndex + 1)));
=======
		       rangeLower(range.substring(hyphenIndex + 1)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return rangeSingle(range);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Translates a range into it's upper index. Must only be called once setUpper
   * has been called.
   * 
   * @param range the string representation of the range
   * @return the upper index of the range
   */
  protected int rangeUpper(/* @non_null@ */String range) {
<<<<<<< HEAD
=======
=======
   * Translates a range into it's upper index. Must only be called once
   * setUpper has been called.
   *
   * @param range the string representation of the range
   * @return the upper index of the range
   */
  protected int rangeUpper(/*@non_null@*/ String range) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    int hyphenIndex;
    if ((hyphenIndex = range.indexOf('-')) >= 0) {
      return Math.max(rangeUpper(range.substring(0, hyphenIndex)),
<<<<<<< HEAD
        rangeUpper(range.substring(hyphenIndex + 1)));
=======
<<<<<<< HEAD
        rangeUpper(range.substring(hyphenIndex + 1)));
=======
		       rangeUpper(range.substring(hyphenIndex + 1)));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
    return rangeSingle(range);
  }

  /**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * Determines if a string represents a valid index or simple range. Examples:
   * <code>first  last   2   first-last  first-4  4-last</code> Doesn't check
   * that a < b for a-b
   * 
<<<<<<< HEAD
=======
=======
   * Determines if a string represents a valid index or simple range.
   * Examples: <code>first  last   2   first-last  first-4  4-last</code>
   * Doesn't check that a < b for a-b
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param range the string to check
   * @return true if the range is valid
   */
  protected boolean isValidRange(String range) {

    if (range == null) {
      return false;
    }
    int hyphenIndex;
    if ((hyphenIndex = range.indexOf('-')) >= 0) {
<<<<<<< HEAD
      if (isValidRange(range.substring(0, hyphenIndex))
        && isValidRange(range.substring(hyphenIndex + 1))) {
        return true;
=======
<<<<<<< HEAD
      if (isValidRange(range.substring(0, hyphenIndex))
        && isValidRange(range.substring(hyphenIndex + 1))) {
        return true;
=======
      if (isValidRange(range.substring(0, hyphenIndex)) &&
	  isValidRange(range.substring(hyphenIndex + 1))) {
	return true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      return false;
    }
    if (range.toLowerCase().equals("first")) {
      return true;
    }
    if (range.toLowerCase().equals("last")) {
      return true;
    }
    try {
      int index = Integer.parseInt(range);
<<<<<<< HEAD
      if ((index > 0) && (index <= m_Upper + 1)) {
        return true;
=======
<<<<<<< HEAD
      if ((index > 0) && (index <= m_Upper + 1)) {
        return true;
=======
      if ((index > 0) && (index <= m_Upper + 1)){
	return true;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      return false;
    } catch (NumberFormatException ex) {
      return false;
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
    return RevisionUtils.extract("$Revision: 10203 $");
  }

  /**
   * Returns the custom display string.
   * 
   * @return the string
   */
  @Override
  public String toDisplay() {
    if (getInvert()) {
      return "inv(" + getRanges() + ")";
    } else {
      return getRanges();
    }
<<<<<<< HEAD
=======
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 1.18 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * 
   * @param argv one parameter: a test range specification
   */
  public static void main(String[] argv) {

    try {
      if (argv.length == 0) {
        throw new Exception("Usage: Range <rangespec>");
<<<<<<< HEAD
=======
=======
   *
   * @param argv one parameter: a test range specification
   */
  public static void main(String [] argv) {

    try {
      if (argv.length == 0) {
	throw new Exception("Usage: Range <rangespec>");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
      Range range = new Range();
      range.setRanges(argv[0]);
      range.setUpper(9);
      range.setInvert(false);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.out.println("Input: " + argv[0] + "\n" + range.toString());
      int[] rangeIndices = range.getSelection();
      for (int rangeIndice : rangeIndices) {
        System.out.print(" " + (rangeIndice + 1));
      }
<<<<<<< HEAD
=======
=======
      System.out.println("Input: " + argv[0] + "\n"
			 + range.toString());
      int [] rangeIndices = range.getSelection();
      for (int i = 0; i < rangeIndices.length; i++)
	System.out.print(" " + (rangeIndices[i] + 1));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      System.out.println("");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
