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
 *    FieldMetaInfo.java
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 *    Copyright (C) 2008-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.core.pmml;

import java.io.Serializable;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
import org.w3c.dom.Element;

import weka.core.Attribute;

/**
<<<<<<< HEAD
 * Abstract superclass for various types of field meta data.
=======
<<<<<<< HEAD
 * Abstract superclass for various types of field meta data.
=======
 * Abstract superclass for various types of field meta
 * data.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com
 * @version $Revision 1.0 $
 */
public abstract class FieldMetaInfo implements Serializable {

<<<<<<< HEAD
  /** ID added to avoid warning */
  private static final long serialVersionUID = -6116715567129830143L;

=======
<<<<<<< HEAD
  /** ID added to avoid warning */
  private static final long serialVersionUID = -6116715567129830143L;

=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Inner class for Values
   */
  public static class Value implements Serializable {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * For serialization
     */
    private static final long serialVersionUID = -3981030320273649739L;

    /** The value */
    protected String m_value;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /**
     * The display value (might hold a human readable value - e.g. product name
     * instead of cryptic code).
     */
    protected String m_displayValue;

    /**
     * Enumerated type for the property. A value can be valid, invalid or
     * indicate a value that should be considered as "missing".
     */
    public enum Property {
      VALID("valid"), INVALID("invalid"), MISSING("missing");

      private final String m_stringVal;

      Property(String name) {
        m_stringVal = name;
      }

      @Override
<<<<<<< HEAD
=======
=======
    
    /** 
     * The display value (might hold a human readable value - e.g.
     * product name instead of cryptic code).
     */
    protected String m_displayValue;
    
    /**
     * Enumerated type for the property. A value
     * can be valid, invalid or indicate a value
     * that should be considered as "missing".
     */
    public enum Property {
      VALID ("valid"),
      INVALID ("invalid"),
      MISSING ("missing");
      
      private final String m_stringVal;
      
      Property(String name) {
        m_stringVal = name;
      }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public String toString() {
        return m_stringVal;
      }
    }
<<<<<<< HEAD

    protected Property m_property = Property.VALID;

=======
<<<<<<< HEAD

    protected Property m_property = Property.VALID;

=======
    protected Property m_property = Property.VALID;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * Construct a value.
     * 
     * @param value the Element containing the value
     * @throws Exception if there is a problem constucting the value
     */
    protected Value(Element value) throws Exception {
      m_value = value.getAttribute("value");
      String displayV = value.getAttribute("displayValue");
      if (displayV != null && displayV.length() > 0) {
        m_displayValue = displayV;
      }
      String property = value.getAttribute("property");
      if (property != null && property.length() > 0) {
<<<<<<< HEAD
        for (Property p : Property.values()) {
=======
<<<<<<< HEAD
        for (Property p : Property.values()) {
=======
        for (Property p: Property.values()) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          if (p.toString().equals(property)) {
            m_property = p;
            break;
          }
        }
      }
    }
<<<<<<< HEAD

    @Override
=======
<<<<<<< HEAD

    @Override
=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public String toString() {
      String retV = m_value;
      if (m_displayValue != null) {
        retV += "(" + m_displayValue + "): " + m_property.toString();
      }
      return retV;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    public String getValue() {
      return m_value;
    }

    public String getDisplayValue() {
      return m_displayValue;
    }

<<<<<<< HEAD
=======
=======
    
    public String getValue() {
      return m_value;
    }
    
    public String getDisplayValue() {
      return m_displayValue;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public Property getProperty() {
      return m_property;
    }
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Inner class for an Interval.
   */
  public static class Interval implements Serializable {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * For serialization
     */
    private static final long serialVersionUID = -7339790632684638012L;

    /** The left boundary value */
    protected double m_leftMargin = Double.NEGATIVE_INFINITY;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    /** The right boundary value */
    protected double m_rightMargin = Double.POSITIVE_INFINITY;

<<<<<<< HEAD
=======
=======
    
    /** The right boundary value */
    protected double m_rightMargin = Double.POSITIVE_INFINITY;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * Enumerated type for the closure.
     */
    public enum Closure {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      OPENCLOSED("openClosed", "(", "]"), OPENOPEN("openOpen", "(", ")"), CLOSEDOPEN(
        "closedOpen", "[", ")"), CLOSEDCLOSED("closedClosed", "[", "]");

      private final String m_stringVal;
      private final String m_left;
      private final String m_right;

<<<<<<< HEAD
=======
=======
      OPENCLOSED ("openClosed", "(", "]"),
      OPENOPEN ("openOpen", "(", ")"),
      CLOSEDOPEN ("closedOpen", "[", ")"),
      CLOSEDCLOSED ("closedClosed", "[", "]");
      
      private final String m_stringVal;
      private final String m_left;
      private final String m_right;
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      Closure(String name, String left, String right) {
        m_stringVal = name;
        m_left = left;
        m_right = right;
      }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      @Override
      public String toString() {
        return m_stringVal;
      }

<<<<<<< HEAD
=======
=======
      
      public String toString() {
        return m_stringVal;
      }
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      public String toString(double leftMargin, double rightMargin) {
        return m_left + leftMargin + "-" + rightMargin + m_right;
      }
    }
<<<<<<< HEAD

    protected Closure m_closure = Closure.OPENOPEN;

=======
<<<<<<< HEAD

    protected Closure m_closure = Closure.OPENOPEN;

=======
    protected Closure m_closure = Closure.OPENOPEN;
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * Construct an interval.
     * 
     * @param interval the Element containing the interval
     * @throws Exception if there is a problem constructing the interval
     */
    protected Interval(Element interval) throws Exception {
      String leftM = interval.getAttribute("leftMargin");
      try {
        m_leftMargin = Double.parseDouble(leftM);
      } catch (IllegalArgumentException ex) {
        throw new Exception("[Interval] Can't parse left margin as a number");
      }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      String rightM = interval.getAttribute("rightMargin");
      try {
        m_rightMargin = Double.parseDouble(rightM);
      } catch (IllegalArgumentException ex) {
        throw new Exception("[Interval] Can't parse right margin as a number");
      }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      String closure = interval.getAttribute("closure");
      if (closure == null || closure.length() == 0) {
        throw new Exception("[Interval] No closure specified!");
      }
      for (Closure c : Closure.values()) {
        if (c.toString().equals(closure)) {
          m_closure = c;
          break;
        }
      }
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    /**
     * Returns true if this interval contains the supplied value.
     * 
     * @param value the value to check
     * @return true if the interval contains the supplied value
     */
    public boolean containsValue(double value) {
      boolean result = false;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
      
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      switch (m_closure) {
      case OPENCLOSED:
        if (value > m_leftMargin && value <= m_rightMargin) {
          result = true;
        }
        break;
      case OPENOPEN:
        if (value > m_leftMargin && value < m_rightMargin) {
          result = true;
        }
        break;
      case CLOSEDOPEN:
        if (value >= m_leftMargin && value < m_rightMargin) {
          result = true;
        }
        break;
      case CLOSEDCLOSED:
        if (value >= m_leftMargin && value <= m_rightMargin) {
          result = true;
        }
        break;
      default:
        result = false;
        break;
      }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

      return result;
    }

    @Override
<<<<<<< HEAD
=======
=======
        
      return result;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public String toString() {
      return m_closure.toString(m_leftMargin, m_rightMargin);
    }
  }

  // -----------------------------
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** the name of the field */
  protected String m_fieldName;

  /**
   * Enumerated type for the Optype
   */
  public enum Optype {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    NONE("none"), CONTINUOUS("continuous"), CATEGORICAL("categorical"), ORDINAL(
      "ordinal");

    private final String m_stringVal;

    Optype(String name) {
      m_stringVal = name;
    }

    @Override
<<<<<<< HEAD
=======
=======
    NONE ("none"), 
    CONTINUOUS ("continuous"), 
    CATEGORICAL ("categorical"),
    ORDINAL ("ordinal");
  
    private final String m_stringVal;
    
    Optype(String name) {
      m_stringVal = name;
    }
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    public String toString() {
      return m_stringVal;
    }
  }

  /** The optype for the target */
  protected Optype m_optype = Optype.NONE;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Get the optype.
   * 
   * @return the optype
   */
  public Optype getOptype() {
    return m_optype;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Get the name of this field.
   * 
   * @return the name of this field
   */
  public String getFieldName() {
    return m_fieldName;
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Construct a new FieldMetaInfo.
   * 
   * @param field the Element containing the field
   */
  public FieldMetaInfo(Element field) {
    m_fieldName = field.getAttribute("name");
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    String opType = field.getAttribute("optype");
    if (opType != null && opType.length() > 0) {
      for (Optype o : Optype.values()) {
        if (o.toString().equals(opType)) {
          m_optype = o;
          break;
        }
      }
    }
  }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /**
   * Return this field as an Attribute.
   * 
   * @return an Attribute for this field.
   */
  public abstract Attribute getFieldAsAttribute();
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
