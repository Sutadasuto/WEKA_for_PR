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
 * SubspaceClusterDefinition.java
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
<<<<<<< HEAD
 * Copyright (C) 2005-2012 University of Waikato, Hamilton, New Zealand
=======
 * Copyright (C) 2005 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 *
 */

package weka.datagenerators.clusterers;

import java.util.Enumeration;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import weka.core.Option;
import weka.core.Range;
import weka.core.RevisionUtils;
import weka.core.SelectedTag;
import weka.core.Utils;
import weka.datagenerators.ClusterDefinition;
import weka.datagenerators.ClusterGenerator;

/**
 * <!-- globalinfo-start --> A single cluster for the SubspaceCluster
 * datagenerator
 * <p/>
 * <!-- globalinfo-end -->
 * 
 * <!-- options-start --> Valid options are:
 * <p/>
 * 
 * <pre>
 * -A &lt;range&gt;
 *  Generates randomly distributed instances in the cluster.
 * </pre>
 * 
 * <pre>
 * -U &lt;range&gt;
 *  Generates uniformly distributed instances in the cluster.
 * </pre>
 * 
 * <pre>
 * -G &lt;range&gt;
 *  Generates gaussian distributed instances in the cluster.
 * </pre>
 * 
 * <pre>
 * -D &lt;num&gt;,&lt;num&gt;
 *  The attribute min/max (-A and -U) or mean/stddev (-G) for
 *  the cluster.
 * </pre>
 * 
 * <pre>
 * -N &lt;num&gt;..&lt;num&gt;
 *  The range of number of instances per cluster (default 1..50).
 * </pre>
 * 
 * <pre>
 * -I
 *  Uses integer instead of continuous values (default continuous).
 * </pre>
 * 
 * <!-- options-end -->
 * 
 * @author Gabi Schmidberger (gabi@cs.waikato.ac.nz)
 * @author FracPete (fracpete at waikato dot ac dot nz)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
 * @version $Revision: 12478 $
 * @see SubspaceCluster
 */
public class SubspaceClusterDefinition extends ClusterDefinition {
<<<<<<< HEAD
=======
=======
 * @version $Revision: 1.5 $
 * @see SubspaceCluster
 */
public class SubspaceClusterDefinition
  extends ClusterDefinition {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /** for serialization */
  static final long serialVersionUID = 3135678125044007231L;

  /** cluster type */
  protected int m_clustertype;

  /** cluster subtypes */
  protected int m_clustersubtype;

  /** number of attributes the cluster is defined for */
  protected int m_numClusterAttributes;

  /** number of instances for this cluster */
  protected int m_numInstances;

  /** minimal number of instances for this cluster */
  protected int m_MinInstNum;

  /** maximal number of instances for this cluster */
  protected int m_MaxInstNum;

  /** range of atttributes */
  protected Range m_AttrIndexRange;

  /** attributes of this cluster */
  protected boolean[] m_attributes;

  /** global indices of the attributes of the cluster */
  protected int[] m_attrIndices;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  /** min or mean */
  protected double[] m_valueA;

  /** max or stddev */
  protected double[] m_valueB;
<<<<<<< HEAD
=======
=======
  /** ranges of each attribute (min); not used if gaussian */
  protected double[] m_minValue;

  /** ranges of each attribute (max); not used if gaussian */
  protected double[] m_maxValue;

  /** mean ; only used if gaussian */
  protected double[] m_meanValue;

  /** standarddev; only used if gaussian */
  protected double[] m_stddevValue;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

  /**
   * initializes the cluster, without a parent cluster (necessary for GOE)
   */
  public SubspaceClusterDefinition() {
    super();
  }

  /**
   * initializes the cluster with default values
   * 
   * @param parent the datagenerator this cluster belongs to
   */
  public SubspaceClusterDefinition(ClusterGenerator parent) {
    super(parent);
  }

  /**
   * sets the default values
   * 
   * @throws Exception if setting of defaults fails
   */
  @Override
  protected void setDefaults() throws Exception {
    setClusterType(defaultClusterType());
    setClusterSubType(defaultClusterSubType());
    setMinInstNum(defaultMinInstNum());
    setMaxInstNum(defaultMaxInstNum());
    setAttrIndexRange(defaultAttrIndexRange());
    m_numClusterAttributes = 1;
    setValuesList(defaultValuesList());
  }

  /**
   * Returns a string describing this data generator.
   * 
   * @return a description of the data generator suitable for displaying in the
   *         explorer/experimenter gui
   */
  @Override
  public String globalInfo() {
    return "A single cluster for the SubspaceCluster datagenerator";
  }

  /**
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options
   */
  @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option(
      "\tGenerates randomly distributed instances in the cluster.", "A", 1,
      "-A <range>"));

    result.addElement(new Option(
      "\tGenerates uniformly distributed instances in the cluster.", "U", 1,
      "-U <range>"));

    result.addElement(new Option(
      "\tGenerates gaussian distributed instances in the cluster.", "G", 1,
      "-G <range>"));

    result.addElement(new Option(
      "\tThe attribute min/max (-A and -U) or mean/stddev (-G) for\n"
        + "\tthe cluster.", "D", 1, "-D <num>,<num>"));

    result.addElement(new Option(
      "\tThe range of number of instances per cluster (default "
        + defaultMinInstNum() + ".." + defaultMaxInstNum() + ").", "N", 1,
      "-N <num>..<num>"));

    result.addElement(new Option(
      "\tUses integer instead of continuous values (default continuous).", "I",
      0, "-I"));
<<<<<<< HEAD
=======
=======
  public Enumeration listOptions() {
    Vector result = new Vector();

    result.addElement(new Option(
      "\tGenerates randomly distributed instances in the cluster.",
      "A", 1, "-A <range>"));

    result.addElement(new Option(
      "\tGenerates uniformly distributed instances in the cluster.",
      "U", 1, "-U <range>"));

    result.addElement(new Option(
      "\tGenerates gaussian distributed instances in the cluster.",
      "G", 1, "-G <range>"));

    result.addElement(new Option(
      "\tThe attribute min/max (-A and -U) or mean/stddev (-G) for\n"
        + "\tthe cluster.",
      "D", 1, "-D <num>,<num>"));

    result.addElement(new Option(
      "\tThe range of number of instances per cluster (default "
        + defaultMinInstNum() + ".." + defaultMaxInstNum() + ").",
      "N", 1, "-N <num>..<num>"));

    result.addElement(new Option(
      "\tUses integer instead of continuous values (default continuous).",
      "I", 0, "-I"));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    return result.elements();
  }

  /**
   * Parses a list of options for this object.
   * <p/>
   * 
   * <!-- options-start --> Valid options are:
   * <p/>
   * 
   * <pre>
   * -A &lt;range&gt;
   *  Generates randomly distributed instances in the cluster.
   * </pre>
   * 
   * <pre>
   * -U &lt;range&gt;
   *  Generates uniformly distributed instances in the cluster.
   * </pre>
   * 
   * <pre>
   * -G &lt;range&gt;
   *  Generates gaussian distributed instances in the cluster.
   * </pre>
   * 
   * <pre>
   * -D &lt;num&gt;,&lt;num&gt;
   *  The attribute min/max (-A and -U) or mean/stddev (-G) for
   *  the cluster.
   * </pre>
   * 
   * <pre>
   * -N &lt;num&gt;..&lt;num&gt;
   *  The range of number of instances per cluster (default 1..50).
   * </pre>
   * 
   * <pre>
   * -I
   *  Uses integer instead of continuous values (default continuous).
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
    String fromToStr;
    int typeCount;

    typeCount = 0;
    fromToStr = "";

    tmpStr = Utils.getOption('A', options);
    if (tmpStr.length() != 0) {
      fromToStr = tmpStr;
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.UNIFORM_RANDOM,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.UNIFORM_RANDOM,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
      setClusterType(new SelectedTag(
        SubspaceCluster.UNIFORM_RANDOM, SubspaceCluster.TAGS_CLUSTERTYPE));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      typeCount++;
    }

    tmpStr = Utils.getOption('U', options);
    if (tmpStr.length() != 0) {
      fromToStr = tmpStr;
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.TOTAL_UNIFORM,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.TOTAL_UNIFORM,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
      setClusterType(new SelectedTag(
        SubspaceCluster.TOTAL_UNIFORM, SubspaceCluster.TAGS_CLUSTERTYPE));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      typeCount++;
    }

    tmpStr = Utils.getOption('G', options);
    if (tmpStr.length() != 0) {
      fromToStr = tmpStr;
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.GAUSSIAN,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.GAUSSIAN,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
      setClusterType(new SelectedTag(
        SubspaceCluster.GAUSSIAN, SubspaceCluster.TAGS_CLUSTERTYPE));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      typeCount++;
    }

    // default is uniform/random
    if (typeCount == 0) {
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.UNIFORM_RANDOM,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
<<<<<<< HEAD
      setClusterType(new SelectedTag(SubspaceCluster.UNIFORM_RANDOM,
        SubspaceCluster.TAGS_CLUSTERTYPE));
=======
      setClusterType(new SelectedTag(
        SubspaceCluster.UNIFORM_RANDOM, SubspaceCluster.TAGS_CLUSTERTYPE));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else if (typeCount > 1) {
      throw new Exception("Only one cluster type can be specified!");
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    setAttrIndexRange(fromToStr);

    tmpStr = Utils.getOption('D', options);
    if (tmpStr.length() != 0) {
        setValuesList(tmpStr);
    } else {
        setValuesList(defaultValuesList());
    }


<<<<<<< HEAD
=======
=======
    if (getParent() != null) {
      setAttrIndexRange(fromToStr);
    }

    tmpStr = Utils.getOption('D', options);
    if (isGaussian()) {
      if (tmpStr.length() != 0) {
        setMeanStddev(tmpStr);
      } else {
        setMeanStddev(defaultMeanStddev());
      }
    }
    else {
      if (tmpStr.length() != 0) {
        setValuesList(tmpStr);
      } else {
        m_numClusterAttributes = 1;
        setValuesList(defaultValuesList());
      }
    }

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    tmpStr = Utils.getOption('N', options);
    if (tmpStr.length() != 0) {
      setInstNums(tmpStr);
    } else {
      setInstNums(defaultMinInstNum() + ".." + defaultMaxInstNum());
    }

    if (Utils.getFlag('I', options)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      setClusterSubType(new SelectedTag(SubspaceCluster.INTEGER,
        SubspaceCluster.TAGS_CLUSTERSUBTYPE));
    } else {
      setClusterSubType(new SelectedTag(SubspaceCluster.CONTINUOUS,
        SubspaceCluster.TAGS_CLUSTERSUBTYPE));
<<<<<<< HEAD
=======
=======
      setClusterSubType(new SelectedTag(
        SubspaceCluster.INTEGER, SubspaceCluster.TAGS_CLUSTERSUBTYPE));
    } else {
      setClusterSubType(new SelectedTag(
        SubspaceCluster.CONTINUOUS, SubspaceCluster.TAGS_CLUSTERSUBTYPE));
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }
  }

  /**
   * Gets the current settings of the datagenerator BIRCHCluster.
   * 
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    Vector<String> result;

    result = new Vector<String>();

    if (isRandom()) {
      result.add("-A");
      result.add("" + getAttrIndexRange());
    } else if (isUniform()) {
      result.add("-U");
      result.add("" + getAttrIndexRange());
    } else if (isGaussian()) {
      result.add("-G");
      result.add("" + getAttrIndexRange());
    }
 
    result.add("-D");
    result.add("" + getValuesList());
<<<<<<< HEAD
=======
=======
    Vector result;

    result = new Vector();

    if (isRandom()) {
      if (getAttrIndexRange().length() > 0) {
        result.add("-A");
        result.add("" + getAttrIndexRange());
      }
      if (getValuesList().length() > 0) {
        result.add("-D");
        result.add("" + getValuesList());
      }
    }
    else if (isUniform()) {
      if (getAttrIndexRange().length() > 0) {
        result.add("-U");
        result.add("" + getAttrIndexRange());
      }
      if (getValuesList().length() > 0) {
        result.add("-D");
        result.add("" + getValuesList());
      }
    }
    else if (isGaussian()) {
      if (getAttrIndexRange().length() > 0) {
        result.add("-G");
        result.add("" + getAttrIndexRange());
      }
      if (getValuesList().length() > 0) {
        result.add("-D");
        result.add("" + getMeanStddev());
      }
    }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb

    result.add("-N");
    result.add("" + getInstNums());

    if (m_clustersubtype == SubspaceCluster.INTEGER) {
      result.add("-I");
    }

<<<<<<< HEAD
    return result.toArray(new String[result.size()]);
=======
<<<<<<< HEAD
    return result.toArray(new String[result.size()]);
=======
    return (String[]) result.toArray(new String[result.size()]);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Make a string from the attribues list.
   * 
   * @return the attributes as string
   */
  public String attributesToString() {
    StringBuffer text = new StringBuffer();
    int j = 0;
    for (int i = 0; i < m_attributes.length; i++) {
      if (m_attributes[i]) {
        if (isGaussian()) {
          text.append(" Attribute: " + i);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          text.append(" Mean: " + m_valueA[j]);
          text.append(" StdDev: " + m_valueB[j] + "\n%");
        } else {
          text.append(" Attribute: " + i);
          text.append(" Range: " + m_valueA[j]);
          text.append(" - " + m_valueB[j] + "\n%");
<<<<<<< HEAD
=======
=======
          text.append(" Mean: " + m_meanValue[j]);
          text.append(" StdDev: " + m_stddevValue[j] + "\n%");
        }
        else {
          text.append(" Attribute: " + i);
          text.append(" Range: " + m_minValue[j]);
          text.append(" - " + m_maxValue[j] + "\n%");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        }
        j++;
      }
    }
    return text.toString();
  }

  /**
   * Make a string from the cluster features.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the cluster features as string
   */
  @Override
  public String toString() {
    StringBuffer text = new StringBuffer();
    text.append("attributes " + attributesToString() + "\n");
    text.append("number of instances " + getInstNums());
    return text.toString();
  }

  /**
   * sets the parent datagenerator this cluster belongs to
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param parent the parent datagenerator
   */
  public void setParent(SubspaceCluster parent) {
    super.setParent(parent);
    m_AttrIndexRange.setUpper(getParent().getNumAttributes());
  }

  /**
   * returns the default attribute index range
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the default attribute index range
   */
  protected String defaultAttrIndexRange() {
    return "1";
  }

  /**
   * Sets which attributes are used in the cluster attributes among the
   * selection will be discretized.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param rangeList a string representing the list of attributes. Since the
   *          string will typically come from a user, attributes are indexed
   *          from 1. <br/>
   *          eg: first-3,5,6-last
   */
  public void setAttrIndexRange(String rangeList) {
    m_numClusterAttributes = 0;
    if (m_AttrIndexRange == null) {
      m_AttrIndexRange = new Range();
    }
    m_AttrIndexRange.setRanges(rangeList);

    if (getParent() != null) {
      m_AttrIndexRange.setUpper(getParent().getNumAttributes());
      m_attributes = new boolean[getParent().getNumAttributes()];
      for (int i = 0; i < m_attributes.length; i++) {
        if (m_AttrIndexRange.isInRange(i)) {
          m_numClusterAttributes++;
          m_attributes[i] = true;
<<<<<<< HEAD
        } else {
=======
<<<<<<< HEAD
        } else {
=======
        }
        else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          m_attributes[i] = false;
        }
      }

      // store translation from attr in cluster to attr in whole dataset
      m_attrIndices = new int[m_numClusterAttributes];
      int clusterI = -1;
      for (int i = 0; i < m_attributes.length; i++) {
        if (m_AttrIndexRange.isInRange(i)) {
          clusterI++;
          m_attrIndices[clusterI] = i;
        }
      }
    }
  }

  /**
   * returns the attribute range(s).
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the attribute range(s).
   */
  public String getAttrIndexRange() {
    return m_AttrIndexRange.getRanges();
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String attrIndexRangeTipText() {
    return "The attribute range(s).";
  }

  public boolean[] getAttributes() {
    return m_attributes;
  }

  public double[] getMinValue() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    return m_valueA;
  }

  public double[] getMaxValue() {
    return m_valueB;
  }

  public double[] getMeanValue() {
    return m_valueA;
  }

  public double[] getStddevValue() {
    return m_valueB;
<<<<<<< HEAD
=======
=======
    return m_minValue;
  }

  public double[] getMaxValue() {
    return m_maxValue;
  }

  public double[] getMeanValue() {
    return m_meanValue;
  }

  public double[] getStddevValue() {
    return m_stddevValue;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  public int getNumInstances() {
    return m_numInstances;
  }

  /**
   * returns the default cluster type
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return the default cluster type
   */
  protected SelectedTag defaultClusterType() {
    return new SelectedTag(SubspaceCluster.UNIFORM_RANDOM,
      SubspaceCluster.TAGS_CLUSTERTYPE);
<<<<<<< HEAD
=======
=======
   * 
   * @return the default cluster type
   */
  protected SelectedTag defaultClusterType() {
    return new SelectedTag(
      SubspaceCluster.UNIFORM_RANDOM, SubspaceCluster.TAGS_CLUSTERTYPE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the cluster type.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the cluster type
   * @see SubspaceCluster#TAGS_CLUSTERTYPE
   */
  public SelectedTag getClusterType() {
    return new SelectedTag(m_clustertype, SubspaceCluster.TAGS_CLUSTERTYPE);
  }

  /**
   * Sets the cluster type.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the new cluster type.
   * @see SubspaceCluster#TAGS_CLUSTERTYPE
   */
  public void setClusterType(SelectedTag value) {
    if (value.getTags() == SubspaceCluster.TAGS_CLUSTERTYPE) {
      m_clustertype = value.getSelectedTag().getID();
    }
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String clusterTypeTipText() {
    return "The type of cluster to use.";
  }

  /**
   * returns the default cluster sub type
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return the default cluster sub type
   */
  protected SelectedTag defaultClusterSubType() {
    return new SelectedTag(SubspaceCluster.CONTINUOUS,
      SubspaceCluster.TAGS_CLUSTERSUBTYPE);
<<<<<<< HEAD
=======
=======
   * 
   * @return the default cluster sub type
   */
  protected SelectedTag defaultClusterSubType() {
    return new SelectedTag(
      SubspaceCluster.CONTINUOUS, SubspaceCluster.TAGS_CLUSTERSUBTYPE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Gets the cluster sub type.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the cluster sub type
   * @see SubspaceCluster#TAGS_CLUSTERSUBTYPE
   */
  public SelectedTag getClusterSubType() {
<<<<<<< HEAD
    return new SelectedTag(m_clustersubtype,
      SubspaceCluster.TAGS_CLUSTERSUBTYPE);
=======
<<<<<<< HEAD
    return new SelectedTag(m_clustersubtype,
      SubspaceCluster.TAGS_CLUSTERSUBTYPE);
=======
    return new SelectedTag(
      m_clustersubtype, SubspaceCluster.TAGS_CLUSTERSUBTYPE);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the cluster sub type.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param value the new cluster sub type.
   * @see SubspaceCluster#TAGS_CLUSTERSUBTYPE
   */
  public void setClusterSubType(SelectedTag value) {
    if (value.getTags() == SubspaceCluster.TAGS_CLUSTERSUBTYPE) {
      m_clustersubtype = value.getSelectedTag().getID();
    }
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String clusterSubTypeTipText() {
    return "The sub-type of cluster to use.";
  }

  /**
   * checks, whether cluster type is random
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if cluster type is random
   */
  public boolean isRandom() {
    return (m_clustertype == SubspaceCluster.UNIFORM_RANDOM);
  }

  /**
   * checks, whether cluster type is uniform
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if cluster type is uniform
   */
  public boolean isUniform() {
    return (m_clustertype == SubspaceCluster.TOTAL_UNIFORM);
  }

  /**
   * checks, whether cluster type is gaussian
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if cluster type is gaussian
   */
  public boolean isGaussian() {
    return (m_clustertype == SubspaceCluster.GAUSSIAN);
  }

  /**
   * checks, whether cluster sub type is continuous
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return true if cluster sub type is continuous
   */
  public boolean isContinuous() {
    return (m_clustertype == SubspaceCluster.CONTINUOUS);
  }

  /**
   * checks, whether cluster sub type is integer
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   *
   * @return true if cluster sub type is integer
   */
  public boolean isInteger() {
    return (m_clustersubtype == SubspaceCluster.INTEGER);
<<<<<<< HEAD
=======
=======
   * 
   * @return true if cluster sub type is integer
   */
  public boolean isInteger() {
    return (m_clustertype == SubspaceCluster.INTEGER);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the upper and lower boundary for instances for this cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param fromTo the string containing the upper and lower boundary for
   *          instances per cluster separated by ..
   */
  protected void setInstNums(String fromTo) {
    int i = fromTo.indexOf("..");
    if (i == -1) {
      i = fromTo.length();
    }
    String from = fromTo.substring(0, i);
    m_MinInstNum = Integer.parseInt(from);
    if (i < fromTo.length()) {
      String to = fromTo.substring(i + 2, fromTo.length());
      m_MaxInstNum = Integer.parseInt(to);
<<<<<<< HEAD
    } else {
=======
<<<<<<< HEAD
    } else {
=======
    }
    else {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      m_MaxInstNum = m_MinInstNum;
    }
  }

  /**
   * Get a string with the upper and lower boundary for the number of instances
   * for this cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the string containing the upper and lower boundary for instances
   *         per cluster separated by ..
   */
  protected String getInstNums() {
    String text = new String("" + m_MinInstNum + ".." + m_MaxInstNum);
    return text;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  protected String instNumsTipText() {
    return "The lower and upper boundary for the number of instances in this cluster.";
  }

  /**
   * returns the default min number of instances
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the default min number of instances
   */
  protected int defaultMinInstNum() {
    return 1;
  }

  /**
   * Gets the lower boundary for instances per cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the the lower boundary for instances per cluster
   */
  public int getMinInstNum() {
    return m_MinInstNum;
  }

  /**
   * Sets the lower boundary for instances per cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newMinInstNum new lower boundary for instances per cluster
   */
  public void setMinInstNum(int newMinInstNum) {
    m_MinInstNum = newMinInstNum;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String minInstNumTipText() {
    return "The lower boundary for instances per cluster.";
  }

  /**
   * returns the default max number of instances
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the default max number of instances
   */
  protected int defaultMaxInstNum() {
    return 50;
  }

  /**
   * Gets the upper boundary for instances per cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the upper boundary for instances per cluster
   */
  public int getMaxInstNum() {
    return m_MaxInstNum;
  }

  /**
   * Sets the upper boundary for instances per cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param newMaxInstNum new upper boundary for instances per cluster
   */
  public void setMaxInstNum(int newMaxInstNum) {
    m_MaxInstNum = newMaxInstNum;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String maxInstNumTipText() {
    return "The upper boundary for instances per cluster.";
  }

  /**
   * Sets the real number of instances for this cluster.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param r random number generator
   */
  public void setNumInstances(Random r) {
    if (m_MaxInstNum > m_MinInstNum) {
<<<<<<< HEAD
      m_numInstances = (int) (r.nextDouble() * (m_MaxInstNum - m_MinInstNum) + m_MinInstNum);
=======
<<<<<<< HEAD
      m_numInstances = (int) (r.nextDouble() * (m_MaxInstNum - m_MinInstNum) + m_MinInstNum);
=======
      m_numInstances = (int) (r.nextDouble()
        * (m_MaxInstNum - m_MinInstNum) + m_MinInstNum);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    } else {
      m_numInstances = m_MinInstNum;
    }
  }

  /**
   * returns the default values list
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return the default values list
   */
  protected String defaultValuesList() {
    return "1,10";
  }

  /**
   * Sets the ranges for each attribute.
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @param fromToList the string containing the upper and lower boundary for
   *          instances per cluster separated by ..
   * @throws Exception if values are not correct in number or value
   */
  public void setValuesList(String fromToList) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    m_valueA = new double[m_numClusterAttributes];
    m_valueB = new double[m_numClusterAttributes];
    setValuesList(fromToList, m_valueA, m_valueB, "D");
    SubspaceCluster parent = (SubspaceCluster) getParent();

    for (int i = 0; i < m_numClusterAttributes; i++) {
      if ((!isGaussian()) && (m_valueA[i] > m_valueB[i])) {
<<<<<<< HEAD
=======
=======
    m_minValue = new double[m_numClusterAttributes];
    m_maxValue = new double[m_numClusterAttributes];
    setValuesList(fromToList, m_minValue, m_maxValue, "D");
    SubspaceCluster parent = (SubspaceCluster) getParent();

    for (int i = 0; i < m_numClusterAttributes; i++) {
      if (m_minValue[i] > m_maxValue[i]) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
        throw new Exception("Min must be smaller than max.");
      }

      if (getParent() != null) {
        // boolean values are only 0.0 and 1.0
        if (parent.isBoolean(m_attrIndices[i])) {
          parent.getNumValues()[m_attrIndices[i]] = 2;
<<<<<<< HEAD
          if (((m_valueA[i] != 0.0) && (m_valueA[i] != 1.0))
            || ((m_valueB[i] != 0.0) && (m_valueB[i] != 1.0))) {
=======
<<<<<<< HEAD
          if (((m_valueA[i] != 0.0) && (m_valueA[i] != 1.0))
            || ((m_valueB[i] != 0.0) && (m_valueB[i] != 1.0))) {
=======
          if (((m_minValue[i] != 0.0) && (m_minValue[i] != 1.0)) ||
            ((m_maxValue[i] != 0.0) && (m_maxValue[i] != 1.0))) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
            throw new Exception("Ranges for boolean must be 0 or 1 only.");
          }
        }

        if (parent.isNominal(m_attrIndices[i])) {
          // nominal values: attributes range might have to be enlarged
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          double rest = m_valueA[i] - Math.rint(m_valueA[i]);
          if (rest != 0.0) {
            throw new Exception(" Ranges for nominal must be integer");
          }
          rest = m_valueB[i] - Math.rint(m_valueB[i]);
          if (rest != 0.0) {
            throw new Exception("Ranges for nominal must be integer");
          }
          if (m_valueA[i] < 0.0) {
            throw new Exception(
              "Range for nominal must start with number 0.0 or higher");
          }
          if (m_valueB[i] + 1 > parent.getNumValues()[m_attrIndices[i]]) {
            // add new values to attribute
            // (actual format is not yet defined)
            parent.getNumValues()[m_attrIndices[i]] = (int) m_valueB[i] + 1;
<<<<<<< HEAD
=======
=======
          double rest = m_minValue[i] - Math.rint(m_minValue[i]);
          if (rest != 0.0) {
            throw new Exception(" Ranges for nominal must be integer");
          }
          rest = m_maxValue[i] - Math.rint(m_maxValue[i]);
          if (rest != 0.0) {
            throw new Exception("Ranges for nominal must be integer");
          }
          if (m_minValue[i] < 0.0) {
            throw new Exception(
              "Range for nominal must start with number 0.0 or higher");
          }
          if (m_maxValue[i] + 1 > parent.getNumValues()[m_attrIndices[i]]) {
            // add new values to attribute
            // (actual format is not yet defined)
            parent.getNumValues()[m_attrIndices[i]] = (int) m_maxValue[i] + 1;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
          }
        }
      }
    }
  }

  /**
   * returns the range for each attribute as string
   */
  public String getValuesList() {
    String result;
    int i;

    result = "";

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    if (m_valueA != null) {
      for (i = 0; i < m_valueA.length; i++) {
        if (i > 0) {
          result += ",";
        }
        result += "" + m_valueA[i] + "," + m_valueB[i];
<<<<<<< HEAD
=======
=======
    if (m_minValue != null) {
      for (i = 0; i < m_minValue.length; i++) {
        if (i > 0) {
          result += ",";
        }
        result += "" + m_minValue[i] + "," + m_maxValue[i];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
      }
    }

    return result;
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   *
=======
<<<<<<< HEAD
   *
=======
   * 
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String valuesListTipText() {
<<<<<<< HEAD
    return "The min (mean) and max (standard deviation) for each attribute as a comma-separated string.";
=======
<<<<<<< HEAD
    return "The min (mean) and max (standard deviation) for each attribute as a comma-separated string.";
=======
    return "The range for each each attribute as string.";
  }

  /**
   * returns the default mean/stddev list
   */
  protected String defaultMeanStddev() {
    return "0,1.0";
  }

  /**
   * Sets mean and standarddeviation.
   * 
   * @param meanstddev the string containing the upper and lower boundary for
   *          instances per cluster separated by ..
   * @throws Exception if values are not correct in number or value
   */
  public void setMeanStddev(String meanstddev) throws Exception {
    m_meanValue = new double[m_numClusterAttributes];
    m_stddevValue = new double[m_numClusterAttributes];
    setValuesList(meanstddev, m_meanValue, m_stddevValue, "D");
  }

  /**
   * returns the current mean/stddev setup
   */
  public String getMeanStddev() {
    String result;
    int i;

    result = "";

    if (m_meanValue != null) {
      for (i = 0; i < m_meanValue.length; i++) {
        if (i > 0) {
          result += ",";
        }
        result += "" + m_meanValue[i] + "," + m_stddevValue[i];
      }
    }

    return result;
  }

  /**
   * Returns the tip text for this property
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String meanStddevTipText() {
    return "The mean and stddev, in case of gaussian.";
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }

  /**
   * Sets the ranges for each attribute.
   * 
   * @param fromToList the string containing the upper and lower boundary for
   *          instances per cluster separated by ..
   * @param first the "from's"
   * @param second the "to's"
   * @param optionLetter the option, from which the list came
   * @throws Exception if values are not correct in number or value
   */
  public void setValuesList(String fromToList, double[] first, double[] second,
    String optionLetter) throws Exception {

    StringTokenizer tok;
    int index;

    tok = new StringTokenizer(fromToList, ",");
    if (tok.countTokens() != first.length + second.length) {
<<<<<<< HEAD
      throw new Exception("Wrong number of values for option '-" + optionLetter
        + "'.");
=======
<<<<<<< HEAD
      throw new Exception("Wrong number of values for option '-" + optionLetter
        + "'.");
=======
      throw new Exception(
        "Wrong number of values for option '-" + optionLetter + "'.");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
    }

    index = 0;
    while (tok.hasMoreTokens()) {
      first[index] = Double.parseDouble(tok.nextToken());
      second[index] = Double.parseDouble(tok.nextToken());
      index++;
    }
  }

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 12478 $");
=======
<<<<<<< HEAD
    return RevisionUtils.extract("$Revision: 12478 $");
=======
    return RevisionUtils.extract("$Revision: 1.5 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
>>>>>>> ef2ab6295a3053865d54c2bdb992ca1d99d638cb
  }
}
