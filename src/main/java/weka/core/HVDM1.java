package weka.core;

import java.util.Enumeration;
import java.util.Hashtable;

import weka.core.TechnicalInformation.Field;
import weka.core.TechnicalInformation.Type;
import weka.core.neighboursearch.PerformanceStats;

public class HVDM1
extends NormalizableDistance
implements Cloneable, TechnicalInformationHandler {

	/**
	 * @author Jorge Madrid (jorgegus.93@gmail.com)
	 */
	private static final long serialVersionUID = 106860625836594739L;
	
	protected Hashtable<String,Hashtable<String,Integer>> Naxc;
	
	protected Hashtable<String,Integer> Nax;
	
	protected boolean equalWeights;
	
	protected double allWeights = 0;
	
	
	public HVDM1() {
		super();
	}
	
	public HVDM1(Instances data) {
		super(data);
	}

	@Override
	public String getRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TechnicalInformation getTechnicalInformation() {
		TechnicalInformation 	result;
	    
	    result = new TechnicalInformation(Type.ARTICLE);
	    result.setValue(Field.AUTHOR, "Randall Wilson & Tony Martinez");
	    result.setValue(Field.TITLE, "Improved Heterogeneous Distance Functions");
	    result.setValue(Field.URL, "https://arxiv.org/pdf/cs/9701101.pdf");

	    return result;
	}

	@Override
	public String globalInfo() {
		return 
		        "Implements Heterogeneous Value Difference Metric (HVDM).\n"
			  + "Similarity version\n\n"	
		      + "For nominal attributes it uses the normalized Value Differen"
		      + "ce Metric 1 (vdm1), based on absolute value\n\n"
		      + "For more information, see:\n\n"
		      + getTechnicalInformation().toString();
	}
	 /**
	   * Calculates the distance between two instances.
	   * 
	   * @param first 	the first instance
	   * @param second 	the second instance
	   * @return 		the distance between the two given instances
	   */
	public double distance(Instance first, Instance second) {
		double usedWeights = allWeights;
		if(!m_Data.allAttributeWeightsIdentical()) {
			for(int i = 0; i < m_Data.numAttributes();i++) {
				if (!this.m_ActiveIndices[i]) {
					usedWeights -= first.attribute(i).weight();
				}
			}
		}
		//System.out.println(m_Data.toString());
	  return Math.sqrt(distance(first, second, Double.POSITIVE_INFINITY) / (usedWeights * this.m_AttributeIndices.m_RangeStrings.size()));
	}
	

	  /**
	   * Calculates the distance between two instances.
	   * 
	   * @param first the first instance
	   * @param second the second instance
	   * @param stats the performance stats object
	   * @return the distance between the two given instances
	   */
	  @Override
	  public double distance(Instance first, Instance second, PerformanceStats stats) {
	    return distance(first, second, Double.POSITIVE_INFINITY, stats);
	  }

	  /**
	   * Calculates the distance between two instances. Offers speed up (if the
	   * distance function class in use supports it) in nearest neighbour search by
	   * taking into account the cutOff or maximum distance. Depending on the
	   * distance function class, post processing of the distances by
	   * postProcessDistances(double []) may be required if this function is used.
	   * 
	   * @param first the first instance
	   * @param second the second instance
	   * @param cutOffValue If the distance being calculated becomes larger than
	   *          cutOffValue then the rest of the calculation is discarded.
	   * @return the distance between the two given instances or
	   *         Double.POSITIVE_INFINITY if the distance being calculated becomes
	   *         larger than cutOffValue.
	   */
	  @Override
	  public double distance(Instance first, Instance second, double cutOffValue) {
	    return distance(first, second, cutOffValue, null);
	  }

	  /**
	   * Calculates the distance between two instances. Offers speed up (if the
	   * distance function class in use supports it) in nearest neighbour search by
	   * taking into account the cutOff or maximum distance. Depending on the
	   * distance function class, post processing of the distances by
	   * postProcessDistances(double []) may be required if this function is used.
	   * 
	   * @param first the first instance
	   * @param second the second instance
	   * @param cutOffValue If the distance being calculated becomes larger than
	   *          cutOffValue then the rest of the calculation is discarded.
	   * @param stats the performance stats object
	   * @return the distance between the two given instances or
	   *         Double.POSITIVE_INFINITY if the distance being calculated becomes
	   *         larger than cutOffValue.
	   */
	  @Override
	  public double distance(Instance first, Instance second, double cutOffValue,
	    PerformanceStats stats) {
	    double distance = 0;
	    int firstI, secondI;
	    int firstNumValues = first.numValues();
	    int secondNumValues = second.numValues();
	    int numAttributes = m_Data.numAttributes();
	    int classIndex = m_Data.classIndex();
	    double cWeight;

	    validate();

	    for (int p1 = 0, p2 = 0; p1 < firstNumValues || p2 < secondNumValues;) {
	      if (p1 >= firstNumValues) {
	        firstI = numAttributes;
	      } else {
	        firstI = first.index(p1);
	      }

	      if (p2 >= secondNumValues) {
	        secondI = numAttributes;
	      } else {
	        secondI = second.index(p2);
	      }

	      if (firstI == classIndex) {
	        p1++;
	        continue;
	      }
	      if ((firstI < numAttributes) && !m_ActiveIndices[firstI]) {
	        p1++;
	        continue;
	      }

	      if (secondI == classIndex) {
	        p2++;
	        continue;
	      }
	      if ((secondI < numAttributes) && !m_ActiveIndices[secondI]) {
	        p2++;
	        continue;
	      }

	      double diff;

	      if (firstI == secondI) {
	        diff = difference(firstI, first.valueSparse(p1), second.valueSparse(p2));
	        p1++;
	        p2++;
	        cWeight = first.attribute(p1).weight();
	      } else if (firstI > secondI) {
	        diff = difference(secondI, 0, second.valueSparse(p2));
	        p2++;
	        cWeight = second.attribute(p2).weight();
	      } else {
	        diff = difference(firstI, first.valueSparse(p1), 0);
	        p1++;
	        cWeight = first.attribute(p1).weight();
	      }
	      if (stats != null) {
	        stats.incrCoordCount();
	      }

	      distance = cWeight * updateDistance(distance, diff);
	      if (distance > cutOffValue) {
	        return Double.POSITIVE_INFINITY;
	      }
	    }

	    return distance;
	  }

	  
	  /**
	   * Computes the difference between two given attribute values.
	   * 
	   * @param index the attribute index
	   * @param val1 the first value
	   * @param val2 the second value
	   * @return the difference
	   */
	  @Override
	  protected double difference(int index, double val1, double val2) {
	    switch (m_Data.attribute(index).type()) {
	    case Attribute.NOMINAL:
	      if (Utils.isMissingValue(val1) || Utils.isMissingValue(val2)
	        ) {
	        return 1;
	      } else {
	    	String attName = m_Data.attribute(index).name();
	    	String keyX = attName+Double.toString(val1);
	    	String keyY = attName+Double.toString(val2);
	    	int nax, nay;
	    	if(Nax.containsKey(keyX))
	    		nax = Nax.get(keyX);
	    	else
	    		nax = 1;
	    	if(Nax.containsKey(keyY))
	    		nay = Nax.get(keyY);
	    	else
	    		nay = 1;
	    	//int nClasses = m_Data.numClasses();
	    	double diff = 0;
	    	Enumeration<String> keysX = Naxc.keys();
	    	Enumeration<String> keysY = Naxc.keys();
	    	String key1, key2;
	    	double valueX, valueY;
	    	while(keysX.hasMoreElements()){
	    		key1 = keysX.nextElement();
	    		key2 = keysY.nextElement();
	    		if(Naxc.get(key1).containsKey(keyX)) {
	    			valueX = (double)Naxc.get(key1).get(keyX);
	    			//System.out.println("SI hay valores para la clase "+key1);
	    		}
	    		else {
	    			valueX = 0;
	    			//System.out.println("NO hay valores para la clase "+key1);
	    		}
	    		if(Naxc.get(key2).containsKey(keyY))
	    			valueY = (double)Naxc.get(key2).get(keyY);
	    		else
	    			valueY = 0;
	    		diff+=Math.abs((valueX/(double)nax)-(valueY/(double)nay));
	    	}
	        return diff;
	      }

	    case Attribute.NUMERIC:
	      if (Utils.isMissingValue(val1) || Utils.isMissingValue(val2)) {
	        if (Utils.isMissingValue(val1) && Utils.isMissingValue(val2)) {
	          if (!m_DontNormalize) {
	            return 1;
	          } else {
	            return (m_Ranges[index][R_MAX] - m_Ranges[index][R_MIN]);
	          }
	        } else {
	          double diff;
	          if (Utils.isMissingValue(val2)) {
	            diff = (!m_DontNormalize) ? norm(val1, index) : val1;
	          } else {
	            diff = (!m_DontNormalize) ? norm(val2, index) : val2;
	          }
	          if (!m_DontNormalize && diff < 0.5) {
	            diff = 1.0 - diff;
	          } else if (m_DontNormalize) {
	            if ((m_Ranges[index][R_MAX] - diff) > (diff - m_Ranges[index][R_MIN])) {
	              return m_Ranges[index][R_MAX] - diff;
	            } else {
	              return diff - m_Ranges[index][R_MIN];
	            }
	          }
	          return diff;
	        }
	      } else {
	        return (!m_DontNormalize) ? (norm(val1, index) - norm(val2, index))
	          : (val1 - val2);
	      }

	    default:
	      return 0;
	    }
	  }
	  
	  /**
	   * Normalizes a given value of a numeric attribute.
	   * 
	   * @param x the value to be normalized
	   * @param i the attribute's index
	   * @return the normalized value
	   */
	  @Override
	  protected double norm(double x, int i) {
	    if (Double.isNaN(m_Ranges[i][R_MIN])
	      || (m_Ranges[i][R_MAX] == m_Ranges[i][R_MIN])) {
	      return 0;
	    } else {
	      return (x - m_Ranges[i][R_MIN]) / (4*Math.sqrt(m_Data.variance(i)));
	    }
	  }
	  

	@Override
	protected double updateDistance(double currDist, double diff) {
		double	result;
	    
	    result  = currDist;
	    result += (1-Math.abs(diff)) * (1-Math.abs(diff));
	    
	    return result;
	}
	/**
	 * Does post processing of the distances (if necessary) returned by
	 * distance(distance(Instance first, Instance second, double cutOffValue). It
	 * is necessary to do so to get the correct distances if
	 * distance(distance(Instance first, Instance second, double cutOffValue) is
	 * used. This is because that function actually returns the squared distance
	 * to avoid inaccuracies arising from floating point comparison.
	 * 
	 * @param distances	the distances to post-process
	 */
	public void postProcessDistances(double distances[]) {
	   for(int i = 0; i < distances.length; i++) {
	     distances[i] = Math.sqrt(distances[i]);
	   }
	 }
	 
	 /**
	  * Returns the squared difference of two values of an attribute.
	  * 
	  * @param index	the attribute index
	  * @param val1	the first value
	  * @param val2	the second value
	  * @return		the squared difference
	  */
	 public double sqDifference(int index, double val1, double val2) {
	   double val = difference(index, val1, val2);
	   return val*val;
	 }
	 
	 
	 public void initiate() {
		 	Naxc = new Hashtable<String,Hashtable<String,Integer>>();
		 	Nax = new Hashtable<String,Integer>();
		 	Instance cInstance;
		 	String attKey;
		 	String cKey;
		 	double cValue;
		 	int classIndex = m_Data.m_ClassIndex;
		 	equalWeights = m_Data.allAttributeWeightsIdentical();
		 	if(equalWeights || m_Data.numAttributes()==0) {
		 		allWeights = 1.0;
		 	}
		 	else {
		 		for(int i = 0; i< m_Data.numAttributes(); i++) {
		 			allWeights+=m_Data.attribute(i).weight();
		 		}
		 	}
		 	for(int i = 0; i< m_Data.numInstances();i++){
		 		cInstance = m_Data.get(i);
		 		cKey = cInstance.attribute(classIndex).name() + Double.toString(cInstance.valueSparse(classIndex));
		 		if(!Naxc.containsKey(cKey))
		 			Naxc.put(cKey, new Hashtable<String,Integer>());
		 		for(int j = 0; j<m_Data.numAttributes();j++){
		 			if(j==classIndex)
		 				continue;
		 			cValue = cInstance.valueSparse(j);
		 			attKey = cInstance.attribute(j).name()+Double.toString(cValue);
		 			if(Nax.containsKey(attKey)){
		 				Nax.put(attKey, Nax.get(attKey) + 1);
		 			}
		 			else{
		 				Nax.put(attKey, 1);
		 			}
		 			if(Naxc.get(cKey).containsKey(attKey)){
		 				Naxc.get(cKey).put(attKey, Naxc.get(cKey).get(attKey) + 1);
		 			}
		 			else{
		 				Naxc.get(cKey).put(attKey, 1);
		 			}
		 		}
		 	}
		 	/*System.out.println("hola");
		 	cInstance = m_Data.get(0);
		 	System.out.println(cInstance.attribute(0).name());
		 	System.out.println(m_Data.numInstances());
		 	System.out.println(Naxc.get(cInstance.attribute(classIndex).name()+Double.toString(cInstance.value(classIndex))).get(cInstance.attribute(2).name()+cInstance.valueSparse(2)));
		 	System.out.println(Nax.get(cInstance.attribute(2).name()+Double.toString(cInstance.valueSparse(2))));*/
		  }
	  /**
	   * Sets the instances.
	   * 
	   * @param insts the instances to use
	   */
	  @Override
	  public void setInstances(Instances insts) {
	    m_Data = insts;
	    invalidate();
	    initiate();
	  }
}
