package weka.classifiers.LC;


import java.util.ArrayList;
import java.util.Arrays;

import weka.core.WekaException;

public class omegasSet {
	public ArrayList<omegas> omegaset = new ArrayList<omegas>();
	private  ArrayList<thresholdSet> thresholds = new ArrayList<thresholdSet>();

	private String class_name;

	public ArrayList<thresholdSet> getThresholds(){
		return thresholds;
	}

	public void setTresholds(String _tresh, int opc) {
		if(opc==1) { //CRplus
			String[] div1 = _tresh.split(";",2);
			String[] div2 = div1[0].split(",",2);
			Double auxDato = Double.parseDouble(div2[0]);
			thresholdSet auxT = new thresholdSet();
			auxT.setThresholds(auxDato);
			auxDato=Double.parseDouble(div2[1]);
			auxT.setThresholds(auxDato);
			this.thresholds.add(auxT);
			String[] div3 = div1[1].split(",",2);
			auxDato = Double.parseDouble(div3[0]);
			thresholdSet auxT2 = new thresholdSet();
			auxT2.setThresholds(auxDato);
			auxDato=Double.parseDouble(div3[1]);
			auxT2.setThresholds(auxDato);
			this.thresholds.add(auxT2);
		}else { //kora omega
			String[] div1 = _tresh.split(";",2);
			String[] div2 = div1[0].split(",",2);
			Double auxDato = Double.parseDouble(div2[0]);
			thresholdSet auxT = new thresholdSet();
			auxT.setThresholds(auxDato);
			auxDato=Double.parseDouble(div2[1]);
			auxT.setThresholds(auxDato);
			this.thresholds.add(auxT);
		}
	}

	public void setOmegasClassName(String name) {
		class_name=name;
	}
	public String getOmegasClassName() {
		return class_name;
	}
	public void setOmegasSet(ArrayList<int[]> indices) {
		for (int i=0;i<indices.size();i++) {
			omegas n_omegas = new omegas();
			n_omegas.setOmegas(indices.get(i));
		}
	}
	private void sendException(String message) throws Exception{
		Exception m_FailReason = new WekaException(message);
		throw m_FailReason;
	}
	public void setOmegasSetFromFile(String indices,int range) throws Exception {
		String[] div1 = indices.split("\\:",2);
		this.setOmegasClassName(div1[0]);
		//String[] div2 = div1[1].split("\\:");
		//this.setNumOfTimes(div2[0]);
		String[] div3 = div1[1].split(";");
		for(int i=0;i<div3.length;i++) {
			omegas n_omega= new omegas();
			//System.out.println(div2[i]);
			int response = n_omega.setOmegasFromFile(div3[i],range);
			if(response==-1) {
				omegaset.add(n_omega);
			}else {
				sendException("There is a out of range attribute in the Omegaset from file."
								+ "\nClass Name: "+this.getOmegasClassName()+" Index of attibute: "
								+response);
			}
		}
		for (int i=0; i<omegaset.size();i++) {
			//System.out.println("Hi");
			//System.out.println(omegaset.get(i).getOmegas());
		}
		//class_name=indices;
		//System.out.println(indices);
	}
	public ArrayList<omegas> getOmegasSet() {
		return omegaset;
	}

}
