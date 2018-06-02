package weka.classifiers.LC;
import sun.security.jca.GetInstance;
import weka.core.Instance;

import java.util.ArrayList;


public class omegaSimilarity {
	private String omega;
	private ArrayList<Instance> instances = new ArrayList<Instance>();
	private double similarity;
	private boolean sameClass;
	private String classToAnalyze;
	private String[] values;


	//private String indice_omegas;
	
	public void setOmega(String omegaToAnalyze) {
		omega = omegaToAnalyze;
	}
	public String getOmega() {
		return omega;
	}

	public void setInstances(Instance instance1, Instance instance2)
	{
		instances.add(instance1);
		instances.add(instance2);
	}
	public ArrayList<Instance> getInstances() {
		return instances;
	}

	public void setSimilarity(double calculatedSimilarity) {
		similarity = calculatedSimilarity;
	}
	public double getSimilarity() {
		return similarity;
	}

	public void setSameClass(boolean trueOrFalse) { sameClass = trueOrFalse; }
	public boolean sameClass() {
		return sameClass;
	}

	public void setClass(String classOfInstance1) {
		classToAnalyze = classOfInstance1;
	}
	public String getAnalyzedClass() {
		return classToAnalyze;
	}

	public void setValues(String[] code) {
		values = code;
	}
	public String[] getValues() {
		return values;
	}
}
