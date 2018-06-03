package weka.classifiers.LC;

import java.util.ArrayList;

public class thresholdSet {
	
	private ArrayList<Double> thresholds = new ArrayList<>();
	
	public void setThresholds(Double _threshold) {
		thresholds.add(_threshold);
	}
	public ArrayList<Double> getThresholdSet(){
		return thresholds;
	}
}
