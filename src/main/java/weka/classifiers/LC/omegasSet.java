package weka.classifiers.LC;


import java.util.ArrayList;


import weka.core.WekaException;

public class omegasSet {
	private ArrayList<Double> weigths = new ArrayList<>();
	private ArrayList<omegas> omegaset = new ArrayList<omegas>();
	private ArrayList<thresholdSet> thresholds = new ArrayList<thresholdSet>();
	private int omegaSize=3;
	private String strOmegas="";
	private static final double DEFAULT_WEIGTH=1.0;

	private String class_name;

	public ArrayList<thresholdSet> getThresholds(){
		return thresholds;
	}
	public int setOmegaWeigth(String _weigth) {
		int result=0;
		  Double tempWeigth = Double.parseDouble(_weigth);
		  if(tempWeigth>0) {
			  weigths.add(tempWeigth);
			  result = -1;
		  }
		  return result;
	  }
	  public ArrayList<Double> getOmegaWeigth() {
		  return weigths;
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
			thresholds.add(auxT);
			String[] div3 = div1[1].split(",",2);
			auxDato = Double.parseDouble(div3[0]);
			thresholdSet auxT2 = new thresholdSet();
			auxT2.setThresholds(auxDato);
			auxDato=Double.parseDouble(div3[1]);
			auxT2.setThresholds(auxDato);
			thresholds.add(auxT2);
		}else { //kora omega
			String[] div1 = _tresh.split(",",2);
			Double auxDato = Double.parseDouble(div1[0]);
			thresholdSet auxT = new thresholdSet();
			auxT.setThresholds(auxDato);
			auxDato=Double.parseDouble(div1[1]);
			auxT.setThresholds(auxDato);
			thresholds.add(auxT);
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
	public void setOmegasSetFromSize(String _className,int _size, int _range) throws Exception {
		setOmegasClassName(_className);
		setOmegaSize(_size);
		for(int i=1;i<=_range-1;i++) {
			ArrayList<Integer> atributos = new ArrayList<Integer>();
			atributos.add(i);
			generateOmegas(atributos,i,_range-1,1);
		}
		setOmegasSetFromFile(_className,strOmegas,_range);
	}
	private void setOmegaSize(int _size) {
		omegaSize=_size;
	}
	private int getOmegaSize() {
		return omegaSize;
	}
	private void generateOmegas(ArrayList<Integer> atributos, int _numAtri, int _range, int _profundidad) {
		// TODO Auto-generated method stub
		if(_profundidad==getOmegaSize()) {
			String strAtri = atributos.toString();
			String[] str = strAtri.split("\\[",2);
			String[] str1 = str[1].split("\\]");
			strAtri = str1[0].replace(" ", "");
			
			if(strOmegas.length()==0) {
				strOmegas=strAtri;
			}else {
				strOmegas = strOmegas +";" +strAtri;
			}
		}else {
			while (_numAtri<=_range) {
				atributos.add(_numAtri+1);
				generateOmegas(atributos,_numAtri+1,_range,_profundidad+1);
				atributos.remove(atributos.size()-1);
				_numAtri+=1;
			}
		}
		
	}
	private void sendException(String message) throws Exception{
		Exception m_FailReason = new WekaException(message);
		throw m_FailReason;
	}
	public void setOmegasSetFromFile(String _className,String _indices,int range) throws Exception {
		//class
		setOmegasClassName(_className);
		//omega_weight_1:indice_1,indice_n; omega_weight_n:indice_1,indice_n
		String[] div3 = _indices.split(";");
		for(int i=0;i<div3.length;i++) {
			String div2[] = div3[i].split(":");
			String tempIndices;
			omegas n_omega= new omegas();
		    if (div2.length==2) {
		    		//indice_1,indice_n; omega_weight_n:indice_1,indice_n
		    		tempIndices=div2[1];
		    		//omega_weight_1
		    		int response = setOmegaWeigth(div2[0]);
		    		if(response!=-1) {
						sendException("There is a out of range weigth in the Omegaset."
								+ "\nClass Name: "+this.getOmegasClassName()+" weigth: "
								+response);
					}
		    }else {
		    	//peso por omision 1
		    		weigths.add(DEFAULT_WEIGTH);
		    		tempIndices=div3[i];
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

}
