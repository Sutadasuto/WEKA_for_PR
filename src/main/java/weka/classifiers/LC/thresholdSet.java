package weka.classifiers.LC;

import java.util.ArrayList;
import java.io.Serializable;

public class thresholdSet implements Serializable {

	private static final long serialVersionUID = 1234930262804027582L;
	private ArrayList<Double> thresholds = new ArrayList<>();

	public void setThresholds(Double _threshold) {
		thresholds.add(_threshold);
	}
	public ArrayList<Double> getThresholdSet(){
		return thresholds;
	}
}
