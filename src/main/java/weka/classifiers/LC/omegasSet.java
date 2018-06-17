package weka.classifiers.LC;


import java.util.ArrayList;
import java.io.Serializable;

import weka.core.WekaException;

public class omegasSet implements Serializable {

	private static final long serialVersionUID = -422874939059679971L;
	public ArrayList<omegas> omegaset = new ArrayList<omegas>();
	private  ArrayList<thresholdSet> thresholds = new ArrayList<thresholdSet>();
	private String indices="";
	private String class_name;
	private ArrayList<Double> weights = new ArrayList<>();
	private static final Double DEFAULT_WEIGHT =1.0;

	public ArrayList<thresholdSet> getThresholds(){
		return thresholds;
	}
	public ArrayList<Double> getWeghts(){
		return weights;
	}
	public void setOmegasFromString(String _className,String _indices, int _range) throws Exception {
		indices = _indices;
		String aux_indices=_className+":"+_indices;
		setOmegasSetFromFile(aux_indices,_range);
	}
	public String getIndicesString() {
		return indices;
	}
	public void setOmegasFromSize(String _className,int _size, int _range) throws Exception {
		if(_size<=_range) {
			for(int i=1; i<_range;i++) {
				ArrayList<Integer> root=new ArrayList<>();
				root.add(i);
				generateOmegasets(root,i,_size,1,_range);
			}
			String aux_indices=_className+":"+indices;
			setOmegasSetFromFile(aux_indices,_range);
		}else {
			sendException("There is a out of range attribute in the Omegaset from file."
							+ "\nClass Name: "+this.getOmegasClassName()+" Index of attibute: ");
		}
	}

	private void generateOmegasets(ArrayList<Integer> _root, int _indice, int _size, int _profundidad, int _range) {
		// TODO Auto-generated method stub
		if(_profundidad==_size) {
			String aux_indices=_root.toString().replaceAll("\\[", "");
			aux_indices=aux_indices.toString().replaceAll("\\]", "");
			aux_indices=aux_indices.toString().replaceAll(" ", "");
			if(indices.length()==0) {
				indices = aux_indices;
			}else {
				indices = indices+";"+aux_indices;
			}
		}else {
			while(_indice<_range) {
				_root.add(_indice+1);
				generateOmegasets(_root,_indice+1,_size,_profundidad+1,_range);
				_root.remove(_root.size()-1);
				_indice+=1;
			}
		}
	}
	public void setThresholds(String _tresh, int opc) {
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
	public void setOmegasSetFromFile(String indices,int range) throws Exception {
		String[] div1 = indices.split("\\:",2);
		this.setOmegasClassName(div1[0]);
		String[] div3 = div1[1].split(";");
		for(int i=0;i<div3.length;i++) {
			omegas n_omega= new omegas();
			String[] div4 = div3[i].split(":");
			String tempIndices="";
			if(div4.length==2) {
				Double weigth = Double.parseDouble(div4[0]);
				weights.add(weigth);
				tempIndices=div4[1];
			}else {
				tempIndices=div3[i];
				weights.add(DEFAULT_WEIGHT);
			}
			int response = n_omega.setOmegasFromFile(tempIndices,range);
			if(response==-1) {
				omegaset.add(n_omega);
			}else {
				sendException("There is a out of range attribute in the Omegaset from file."
								+ "\nClass Name: "+this.getOmegasClassName()+" Index of attibute: "
								+response);
			}
		}
	}
	public ArrayList<omegas> getOmegasSet() {
		return omegaset;
	}
	private void sendException(String message) throws Exception{
		Exception m_FailReason = new WekaException(message);
		throw m_FailReason;
	}

}