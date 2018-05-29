package weka.classifiers.LC;


import java.util.ArrayList;
import java.util.Arrays;

public class omegasSet {
	public ArrayList<omegas> omegaset = new ArrayList<omegas>();
	private String class_name;
	public void setOmegasClassName(String name) {
		class_name=name;
	}
	public String getOmegasClassName() {
		return class_name;
	}
	public void setOmegasSet(ArrayList<int[]> indices) {
		
	}
	public void setOmegasSetFromFile(String indices) {
		String[] div1 = indices.split("\\:",2);
		this.setOmegasClassName(div1[0]);
		String[] div2 = div1[1].split(";");
		System.out.println(div2.length);
		for(int i=0;i<div2.length;i++) {
			omegas n_omega= new omegas();
			//System.out.println(div2[i]);
			n_omega.setOmegasFromFile(div2[i]);
			omegaset.add(n_omega);
		}
		for (int i=0; i<omegaset.size();i++) {
			//System.out.println("Hi");
			System.out.println(Arrays.toString(omegaset.get(i).getOmegas()));
		}
		//class_name=indices;
		//System.out.println(indices);
	}
	public ArrayList<omegas> getOmegasSet() {
		
		return omegaset;
	}

}
