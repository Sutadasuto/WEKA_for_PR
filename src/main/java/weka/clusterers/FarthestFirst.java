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
 *    FarthestFirst.java
<<<<<<< HEAD
 *    Copyright (C) 2002-2012 University of Waikato, Hamilton, New Zealand
=======
 *    Copyright (C) 2002 University of Waikato, Hamilton, New Zealand
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 *
 */
package weka.clusterers;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
=======
import weka.core.Attribute;
import weka.core.Capabilities;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Option;
import weka.core.RevisionUtils;
import weka.core.TechnicalInformation;
<<<<<<< HEAD
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

=======
import weka.core.TechnicalInformationHandler;
import weka.core.Utils;
import weka.core.Capabilities.Capability;
import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
/**
 <!-- globalinfo-start -->
 * Cluster data using the FarthestFirst algorithm.<br/>
 * <br/>
 * For more information see:<br/>
 * <br/>
 * Hochbaum, Shmoys (1985). A best possible heuristic for the k-center problem. Mathematics of Operations Research. 10(2):180-184.<br/>
 * <br/>
 * Sanjoy Dasgupta: Performance Guarantees for Hierarchical Clustering. In: 15th Annual Conference on Computational Learning Theory, 351-363, 2002.<br/>
 * <br/>
 * Notes:<br/>
 * - works as a fast simple approximate clusterer<br/>
 * - modelled after SimpleKMeans, might be a useful initializer for it
 * <p/>
 <!-- globalinfo-end -->
<<<<<<< HEAD
 * 
=======
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 <!-- technical-bibtex-start -->
 * BibTeX:
 * <pre>
 * &#64;article{Hochbaum1985,
 *    author = {Hochbaum and Shmoys},
 *    journal = {Mathematics of Operations Research},
 *    number = {2},
 *    pages = {180-184},
 *    title = {A best possible heuristic for the k-center problem},
 *    volume = {10},
 *    year = {1985}
 * }
 * 
 * &#64;inproceedings{Dasgupta2002,
 *    author = {Sanjoy Dasgupta},
 *    booktitle = {15th Annual Conference on Computational Learning Theory},
 *    pages = {351-363},
 *    publisher = {Springer},
 *    title = {Performance Guarantees for Hierarchical Clustering},
 *    year = {2002}
 * }
 * </pre>
 * <p/>
 <!-- technical-bibtex-end -->
<<<<<<< HEAD
 * 
=======
 *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
 <!-- options-start -->
 * Valid options are: <p/>
 * 
 * <pre> -N &lt;num&gt;
 *  number of clusters. (default = 2).</pre>
 * 
 * <pre> -S &lt;num&gt;
 *  Random number seed.
 *  (default 1)</pre>
 * 
 <!-- options-end -->
<<<<<<< HEAD
 * 
 * @author Bernhard Pfahringer (bernhard@cs.waikato.ac.nz)
 * @version $Revision: 10453 $
 * @see RandomizableClusterer
 */
public class FarthestFirst extends RandomizableClusterer implements
  TechnicalInformationHandler {

  // Todo: rewrite to be fully incremental
  // cleanup, like deleting m_instances

  /** for serialization */
  static final long serialVersionUID = 7499838100631329509L;

  /**
   * training instances, not necessary to keep, could be replaced by
   * m_ClusterCentroids where needed for header info
=======
 *
 * @author Bernhard Pfahringer (bernhard@cs.waikato.ac.nz)
 * @version $Revision: 5538 $
 * @see RandomizableClusterer
 */
public class FarthestFirst 
  extends RandomizableClusterer 
  implements TechnicalInformationHandler {

  //Todo: rewrite to be fully incremental
  //      cleanup, like deleting m_instances 

  /** for serialization */
  static final long serialVersionUID = 7499838100631329509L;
  
  /**
   * training instances, not necessary to keep, 
   * could be replaced by m_ClusterCentroids where needed for header info
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected Instances m_instances;

  /**
   * replace missing values in training instances
   */
  protected ReplaceMissingValues m_ReplaceMissingFilter;

  /**
   * number of clusters to generate
   */
  protected int m_NumClusters = 2;

  /**
   * holds the cluster centroids
   */
  protected Instances m_ClusterCentroids;

  /**
   * attribute min values
   */
<<<<<<< HEAD
  private double[] m_Min;

  /**
   * attribute max values
   */
  private double[] m_Max;

  /**
   * Returns a string describing this clusterer
   * 
   * @return a description of the evaluator suitable for displaying in the
   *         explorer/experimenter gui
   */
  public String globalInfo() {
    return "Cluster data using the FarthestFirst algorithm.\n\n"
      + "For more information see:\n\n" + getTechnicalInformation().toString()
      + "\n\n" + "Notes:\n"
=======
  private double [] m_Min;
  
  /**
   * attribute max values
   */
  private double [] m_Max;

  /**
   * Returns a string describing this clusterer
   * @return a description of the evaluator suitable for
   * displaying in the explorer/experimenter gui
   */
  public String globalInfo() {
    return "Cluster data using the FarthestFirst algorithm.\n\n"
      + "For more information see:\n\n"
      + getTechnicalInformation().toString() + "\n\n"
      + "Notes:\n"
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      + "- works as a fast simple approximate clusterer\n"
      + "- modelled after SimpleKMeans, might be a useful initializer for it";
  }

  /**
<<<<<<< HEAD
   * Returns an instance of a TechnicalInformation object, containing detailed
   * information about the technical background of this class, e.g., paper
   * reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  @Override
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation result;
    TechnicalInformation additional;

    result = new TechnicalInformation(Type.ARTICLE);
    result.setValue(Field.AUTHOR, "Hochbaum and Shmoys");
    result.setValue(Field.YEAR, "1985");
    result.setValue(Field.TITLE,
      "A best possible heuristic for the k-center problem");
=======
   * Returns an instance of a TechnicalInformation object, containing 
   * detailed information about the technical background of this class,
   * e.g., paper reference or book this class is based on.
   * 
   * @return the technical information about this class
   */
  public TechnicalInformation getTechnicalInformation() {
    TechnicalInformation 	result;
    TechnicalInformation 	additional;
    
    result = new TechnicalInformation(Type.ARTICLE);
    result.setValue(Field.AUTHOR, "Hochbaum and Shmoys");
    result.setValue(Field.YEAR, "1985");
    result.setValue(Field.TITLE, "A best possible heuristic for the k-center problem");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    result.setValue(Field.JOURNAL, "Mathematics of Operations Research");
    result.setValue(Field.VOLUME, "10");
    result.setValue(Field.NUMBER, "2");
    result.setValue(Field.PAGES, "180-184");
<<<<<<< HEAD

    additional = result.add(Type.INPROCEEDINGS);
    additional.setValue(Field.AUTHOR, "Sanjoy Dasgupta");
    additional.setValue(Field.TITLE,
      "Performance Guarantees for Hierarchical Clustering");
    additional.setValue(Field.BOOKTITLE,
      "15th Annual Conference on Computational Learning Theory");
    additional.setValue(Field.YEAR, "2002");
    additional.setValue(Field.PAGES, "351-363");
    additional.setValue(Field.PUBLISHER, "Springer");

=======
    
    additional = result.add(Type.INPROCEEDINGS);
    additional.setValue(Field.AUTHOR, "Sanjoy Dasgupta");
    additional.setValue(Field.TITLE, "Performance Guarantees for Hierarchical Clustering");
    additional.setValue(Field.BOOKTITLE, "15th Annual Conference on Computational Learning Theory");
    additional.setValue(Field.YEAR, "2002");
    additional.setValue(Field.PAGES, "351-363");
    additional.setValue(Field.PUBLISHER, "Springer");
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return result;
  }

  /**
   * Returns default capabilities of the clusterer.
<<<<<<< HEAD
   * 
   * @return the capabilities of this clusterer
   */
  @Override
=======
   *
   * @return      the capabilities of this clusterer
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public Capabilities getCapabilities() {
    Capabilities result = super.getCapabilities();
    result.disableAll();
    result.enable(Capability.NO_CLASS);

    // attributes
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capability.DATE_ATTRIBUTES);
    result.enable(Capability.MISSING_VALUES);

    return result;
  }

  /**
<<<<<<< HEAD
   * Generates a clusterer. Has to initialize all fields of the clusterer that
   * are not being set via options.
   * 
   * @param data set of instances serving as training data
   * @throws Exception if the clusterer has not been generated successfully
   */
  @Override
=======
   * Generates a clusterer. Has to initialize all fields of the clusterer
   * that are not being set via options.
   *
   * @param data set of instances serving as training data 
   * @throws Exception if the clusterer has not been 
   * generated successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public void buildClusterer(Instances data) throws Exception {

    // can clusterer handle the data?
    getCapabilities().testWithFail(data);

<<<<<<< HEAD
    // long start = System.currentTimeMillis();
=======
    //long start = System.currentTimeMillis();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    m_ReplaceMissingFilter = new ReplaceMissingValues();
    m_ReplaceMissingFilter.setInputFormat(data);
    m_instances = Filter.useFilter(data, m_ReplaceMissingFilter);

    initMinMax(m_instances);

    m_ClusterCentroids = new Instances(m_instances, m_NumClusters);

    int n = m_instances.numInstances();
    Random r = new Random(getSeed());
    boolean[] selected = new boolean[n];
    double[] minDistance = new double[n];

<<<<<<< HEAD
    for (int i = 0; i < n; i++) {
      minDistance[i] = Double.MAX_VALUE;
    }
=======
    for(int i = 0; i<n; i++) minDistance[i] = Double.MAX_VALUE;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    int firstI = r.nextInt(n);
    m_ClusterCentroids.add(m_instances.instance(firstI));
    selected[firstI] = true;

<<<<<<< HEAD
    updateMinDistance(minDistance, selected, m_instances,
      m_instances.instance(firstI));

    if (m_NumClusters > n) {
      m_NumClusters = n;
    }

    for (int i = 1; i < m_NumClusters; i++) {
      int nextI = farthestAway(minDistance, selected);
      m_ClusterCentroids.add(m_instances.instance(nextI));
      selected[nextI] = true;
      updateMinDistance(minDistance, selected, m_instances,
        m_instances.instance(nextI));
    }

    m_instances = new Instances(m_instances, 0);
    // long end = System.currentTimeMillis();
    // System.out.println("Clustering Time = " + (end-start));
  }

  protected void updateMinDistance(double[] minDistance, boolean[] selected,
    Instances data, Instance center) {
    for (int i = 0; i < selected.length; i++) {
      if (!selected[i]) {
        double d = distance(center, data.instance(i));
        if (d < minDistance[i]) {
          minDistance[i] = d;
        }
      }
    }
=======
    updateMinDistance(minDistance,selected,m_instances,m_instances.instance(firstI));

    if (m_NumClusters > n) m_NumClusters = n;

    for(int i = 1; i < m_NumClusters; i++) {
      int nextI =  farthestAway(minDistance, selected);
      m_ClusterCentroids.add(m_instances.instance(nextI));
      selected[nextI] = true;
      updateMinDistance(minDistance,selected,m_instances,m_instances.instance(nextI));
    }

    m_instances = new Instances(m_instances,0);
    //long end = System.currentTimeMillis();
    //System.out.println("Clustering Time = " + (end-start));
  }


  protected void updateMinDistance(double[] minDistance, boolean[] selected, 
				   Instances data, Instance center) {
    for(int i = 0; i<selected.length; i++) 
      if (!selected[i]) {
	double d = distance(center,data.instance(i));
	if (d<minDistance[i]) 
	  minDistance[i] = d;
      }
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  protected int farthestAway(double[] minDistance, boolean[] selected) {
    double maxDistance = -1.0;
    int maxI = -1;
<<<<<<< HEAD
    for (int i = 0; i < selected.length; i++) {
      if (!selected[i]) {
        if (maxDistance < minDistance[i]) {
          maxDistance = minDistance[i];
          maxI = i;
        }
      }
    }
=======
    for(int i = 0; i<selected.length; i++) 
      if (!selected[i]) 
	if (maxDistance < minDistance[i]) {
	  maxDistance = minDistance[i];
	  maxI = i;
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return maxI;
  }

  protected void initMinMax(Instances data) {
<<<<<<< HEAD
    m_Min = new double[data.numAttributes()];
    m_Max = new double[data.numAttributes()];
=======
    m_Min = new double [data.numAttributes()];
    m_Max = new double [data.numAttributes()];
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    for (int i = 0; i < data.numAttributes(); i++) {
      m_Min[i] = m_Max[i] = Double.NaN;
    }

    for (int i = 0; i < data.numInstances(); i++) {
      updateMinMax(data.instance(i));
    }
  }

<<<<<<< HEAD
  /**
   * Updates the minimum and maximum values for all the attributes based on a
   * new instance.
   * 
   * @param instance the new instance
   */
  private void updateMinMax(Instance instance) {

    for (int j = 0; j < instance.numAttributes(); j++) {
      if (Double.isNaN(m_Min[j])) {
        m_Min[j] = instance.value(j);
        m_Max[j] = instance.value(j);
      } else {
        if (instance.value(j) < m_Min[j]) {
          m_Min[j] = instance.value(j);
        } else {
          if (instance.value(j) > m_Max[j]) {
            m_Max[j] = instance.value(j);
          }
        }
=======

  /**
   * Updates the minimum and maximum values for all the attributes
   * based on a new instance.
   *
   * @param instance the new instance
   */
  private void updateMinMax(Instance instance) {  

    for (int j = 0;j < instance.numAttributes(); j++) {
      if (Double.isNaN(m_Min[j])) {
	m_Min[j] = instance.value(j);
	m_Max[j] = instance.value(j);
      } else {
	if (instance.value(j) < m_Min[j]) {
	  m_Min[j] = instance.value(j);
	} else {
	  if (instance.value(j) > m_Max[j]) {
	    m_Max[j] = instance.value(j);
	  }
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
  }

<<<<<<< HEAD
  /**
   * clusters an instance that has been through the filters
   * 
=======

  /**
   * clusters an instance that has been through the filters
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param instance the instance to assign a cluster to
   * @return a cluster number
   */
  protected int clusterProcessedInstance(Instance instance) {
    double minDist = Double.MAX_VALUE;
    int bestCluster = 0;
    for (int i = 0; i < m_NumClusters; i++) {
      double dist = distance(instance, m_ClusterCentroids.instance(i));
      if (dist < minDist) {
<<<<<<< HEAD
        minDist = dist;
        bestCluster = i;
=======
	minDist = dist;
	bestCluster = i;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    return bestCluster;
  }

  /**
   * Classifies a given instance.
<<<<<<< HEAD
   * 
   * @param instance the instance to be assigned to a cluster
   * @return the number of the assigned cluster as an integer if the class is
   *         enumerated, otherwise the predicted value
   * @throws Exception if instance could not be classified successfully
   */
  @Override
=======
   *
   * @param instance the instance to be assigned to a cluster
   * @return the number of the assigned cluster as an integer
   * if the class is enumerated, otherwise the predicted value
   * @throws Exception if instance could not be classified
   * successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public int clusterInstance(Instance instance) throws Exception {
    m_ReplaceMissingFilter.input(instance);
    m_ReplaceMissingFilter.batchFinished();
    Instance inst = m_ReplaceMissingFilter.output();

    return clusterProcessedInstance(inst);
  }

  /**
   * Calculates the distance between two instances
<<<<<<< HEAD
   * 
   * @param first the first instance
   * @param second the second instance
   * @return the distance between the two given instances, between 0 and 1
   */
  protected double distance(Instance first, Instance second) {
=======
   *
   * @param first the first instance
   * @param second the second instance
   * @return the distance between the two given instances, between 0 and 1
   */          
  protected double distance(Instance first, Instance second) {  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    double distance = 0;
    int firstI, secondI;

<<<<<<< HEAD
    for (int p1 = 0, p2 = 0; p1 < first.numValues() || p2 < second.numValues();) {
      if (p1 >= first.numValues()) {
        firstI = m_instances.numAttributes();
      } else {
        firstI = first.index(p1);
      }
      if (p2 >= second.numValues()) {
        secondI = m_instances.numAttributes();
      } else {
        secondI = second.index(p2);
      }
      if (firstI == m_instances.classIndex()) {
        p1++;
        continue;
      }
      if (secondI == m_instances.classIndex()) {
        p2++;
        continue;
      }
      double diff;
      if (firstI == secondI) {
        diff = difference(firstI, first.valueSparse(p1), second.valueSparse(p2));
        p1++;
        p2++;
      } else if (firstI > secondI) {
        diff = difference(secondI, 0, second.valueSparse(p2));
        p2++;
      } else {
        diff = difference(firstI, first.valueSparse(p1), 0);
        p1++;
      }
      distance += diff * diff;
    }

=======
    for (int p1 = 0, p2 = 0; 
	 p1 < first.numValues() || p2 < second.numValues();) {
      if (p1 >= first.numValues()) {
	firstI = m_instances.numAttributes();
      } else {
	firstI = first.index(p1); 
      }
      if (p2 >= second.numValues()) {
	secondI = m_instances.numAttributes();
      } else {
	secondI = second.index(p2);
      }
      if (firstI == m_instances.classIndex()) {
	p1++; continue;
      } 
      if (secondI == m_instances.classIndex()) {
	p2++; continue;
      } 
      double diff;
      if (firstI == secondI) {
	diff = difference(firstI, 
			  first.valueSparse(p1),
			  second.valueSparse(p2));
	p1++; p2++;
      } else if (firstI > secondI) {
	diff = difference(secondI, 
			  0, second.valueSparse(p2));
	p2++;
      } else {
	diff = difference(firstI, 
			  first.valueSparse(p1), 0);
	p1++;
      }
      distance += diff * diff;
    }
    
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
    return Math.sqrt(distance / m_instances.numAttributes());
  }

  /**
<<<<<<< HEAD
   * Computes the difference between two given attribute values.
=======
   * Computes the difference between two given attribute
   * values.
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  protected double difference(int index, double val1, double val2) {

    switch (m_instances.attribute(index).type()) {
    case Attribute.NOMINAL:
<<<<<<< HEAD

      // If attribute is nominal
      if (Utils.isMissingValue(val1) || Utils.isMissingValue(val2)
        || ((int) val1 != (int) val2)) {
        return 1;
      } else {
        return 0;
=======
      
      // If attribute is nominal
      if (Instance.isMissingValue(val1) || 
	  Instance.isMissingValue(val2) ||
	  ((int)val1 != (int)val2)) {
	return 1;
      } else {
	return 0;
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    case Attribute.NUMERIC:

      // If attribute is numeric
<<<<<<< HEAD
      if (Utils.isMissingValue(val1) || Utils.isMissingValue(val2)) {
        if (Utils.isMissingValue(val1) && Utils.isMissingValue(val2)) {
          return 1;
        } else {
          double diff;
          if (Utils.isMissingValue(val2)) {
            diff = norm(val1, index);
          } else {
            diff = norm(val2, index);
          }
          if (diff < 0.5) {
            diff = 1.0 - diff;
          }
          return diff;
        }
      } else {
        return norm(val1, index) - norm(val2, index);
=======
      if (Instance.isMissingValue(val1) || 
	  Instance.isMissingValue(val2)) {
	if (Instance.isMissingValue(val1) && 
	    Instance.isMissingValue(val2)) {
	  return 1;
	} else {
	  double diff;
	  if (Instance.isMissingValue(val2)) {
	    diff = norm(val1, index);
	  } else {
	    diff = norm(val2, index);
	  }
	  if (diff < 0.5) {
	    diff = 1.0 - diff;
	  }
	  return diff;
	}
      } else {
	return norm(val1, index) - norm(val2, index);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    default:
      return 0;
    }
  }

  /**
   * Normalizes a given value of a numeric attribute.
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param x the value to be normalized
   * @param i the attribute's index
   * @return the normalized value
   */
  protected double norm(double x, int i) {

<<<<<<< HEAD
    if (Double.isNaN(m_Min[i]) || Utils.eq(m_Max[i], m_Min[i])) {
=======
    if (Double.isNaN(m_Min[i]) || Utils.eq(m_Max[i],m_Min[i])) {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      return 0;
    } else {
      return (x - m_Min[i]) / (m_Max[i] - m_Min[i]);
    }
  }

  /**
   * Returns the number of clusters.
<<<<<<< HEAD
   * 
   * @return the number of clusters generated for a training dataset.
   * @throws Exception if number of clusters could not be returned successfully
   */
  @Override
=======
   *
   * @return the number of clusters generated for a training dataset.
   * @throws Exception if number of clusters could not be returned
   * successfully
   */
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  public int numberOfClusters() throws Exception {
    return m_NumClusters;
  }

  /**
<<<<<<< HEAD
   * Get the centroids found by FarthestFirst
   * 
   * @return the centroids found by FarthestFirst
   */
  public Instances getClusterCentroids() {
    return m_ClusterCentroids;
  }

  /**
=======
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * Returns an enumeration describing the available options.
   * 
   * @return an enumeration of all the available options.
   */
<<<<<<< HEAD
  @Override
  public Enumeration<Option> listOptions() {
    Vector<Option> result = new Vector<Option>();

    result.addElement(new Option("\tnumber of clusters. (default = 2).", "N",
      1, "-N <num>"));

    result.addAll(Collections.list(super.listOptions()));

    return result.elements();
=======
  public Enumeration listOptions () {
    Vector result = new Vector();
    
    result.addElement(new Option(
	"\tnumber of clusters. (default = 2).", 
	"N", 1, "-N <num>"));
    
    Enumeration en = super.listOptions();
    while (en.hasMoreElements())
      result.addElement(en.nextElement());
    
    return  result.elements();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Returns the tip text for this property
<<<<<<< HEAD
   * 
   * @return tip text for this property suitable for displaying in the
   *         explorer/experimenter gui
=======
   * @return tip text for this property suitable for
   * displaying in the explorer/experimenter gui
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   */
  public String numClustersTipText() {
    return "set number of clusters";
  }

  /**
   * set the number of clusters to generate
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @param n the number of clusters to generate
   * @throws Exception if number of clusters is negative
   */
  public void setNumClusters(int n) throws Exception {
    if (n < 0) {
      throw new Exception("Number of clusters must be > 0");
    }
    m_NumClusters = n;
  }

  /**
   * gets the number of clusters to generate
<<<<<<< HEAD
   * 
=======
   *
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * @return the number of clusters to generate
   */
  public int getNumClusters() {
    return m_NumClusters;
  }

  /**
<<<<<<< HEAD
   * Parses a given list of options.
   * <p/>
=======
   * Parses a given list of options. <p/>
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
   * 
   <!-- options-start -->
   * Valid options are: <p/>
   * 
   * <pre> -N &lt;num&gt;
   *  number of clusters. (default = 2).</pre>
   * 
   * <pre> -S &lt;num&gt;
   *  Random number seed.
   *  (default 1)</pre>
   * 
   <!-- options-end -->
<<<<<<< HEAD
   * 
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  @Override
  public void setOptions(String[] options) throws Exception {
=======
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions (String[] options)
    throws Exception {
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    String optionString = Utils.getOption('N', options);

    if (optionString.length() != 0) {
      setNumClusters(Integer.parseInt(optionString));
    }
<<<<<<< HEAD

    super.setOptions(options);

    Utils.checkForRemainingOptions(options);
=======
    
    super.setOptions(options);
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Gets the current settings of FarthestFirst
<<<<<<< HEAD
   * 
   * @return an array of strings suitable for passing to setOptions()
   */
  @Override
  public String[] getOptions() {

    Vector<String> result = new Vector<String>();
=======
   *
   * @return an array of strings suitable for passing to setOptions()
   */
  public String[] getOptions () {
    int       	i;
    Vector    	result;
    String[]  	options;

    result = new Vector();
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb

    result.add("-N");
    result.add("" + getNumClusters());

<<<<<<< HEAD
    Collections.addAll(result, super.getOptions());

    return result.toArray(new String[result.size()]);
=======
    options = super.getOptions();
    for (i = 0; i < options.length; i++)
      result.add(options[i]);

    return (String[]) result.toArray(new String[result.size()]);	  
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * return a string describing this clusterer
<<<<<<< HEAD
   * 
   * @return a description of the clusterer as a string
   */
  @Override
  public String toString() {
    StringBuffer temp = new StringBuffer();

    temp.append("\nFarthestFirst\n==============\n");

    temp.append("\nCluster centroids:\n");
    for (int i = 0; i < m_NumClusters; i++) {
      temp.append("\nCluster " + i + "\n\t");
      for (int j = 0; j < m_ClusterCentroids.numAttributes(); j++) {
        if (m_ClusterCentroids.attribute(j).isNominal()) {
          temp.append(" "
            + m_ClusterCentroids.attribute(j).value(
              (int) m_ClusterCentroids.instance(i).value(j)));
        } else {
          temp.append(" " + m_ClusterCentroids.instance(i).value(j));
        }
=======
   *
   * @return a description of the clusterer as a string
   */
  public String toString() {
    StringBuffer temp = new StringBuffer();

    temp.append("\n FarthestFirst\n==============\n");

    temp.append("\nCluster centroids:\n");
    for (int i = 0; i < m_NumClusters; i++) {
      temp.append("\nCluster "+i+"\n\t");
      for (int j = 0; j < m_ClusterCentroids.numAttributes(); j++) {
	if (m_ClusterCentroids.attribute(j).isNominal()) {
	  temp.append(" "+m_ClusterCentroids.attribute(j).
		      value((int)m_ClusterCentroids.instance(i).value(j)));
	} else {
	  temp.append(" "+m_ClusterCentroids.instance(i).value(j));
	}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
      }
    }
    temp.append("\n\n");
    return temp.toString();
  }
<<<<<<< HEAD

  /**
   * Returns the revision string.
   * 
   * @return the revision
   */
  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 10453 $");
=======
  
  /**
   * Returns the revision string.
   * 
   * @return		the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("$Revision: 5538 $");
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
  }

  /**
   * Main method for testing this class.
<<<<<<< HEAD
   * 
   * @param argv should contain the following arguments:
   *          <p>
   *          -t training file [-N number of clusters]
   */
  public static void main(String[] argv) {
    runClusterer(new FarthestFirst(), argv);
  }
}

=======
   *
   * @param argv should contain the following arguments: <p>
   * -t training file [-N number of clusters]
   */
  public static void main (String[] argv) {
    runClusterer(new FarthestFirst(), argv);
  }
}
>>>>>>> 25da024d9b6316e99e1931459ffa9a6f3d5c90eb
