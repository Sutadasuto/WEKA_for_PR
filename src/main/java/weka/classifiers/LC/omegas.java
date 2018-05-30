package weka.classifiers.LC;


public class omegas {
	private String indice_omegas;
	//private String indice_omegas;
	
	public void setOmegasFromFile(String indices) {
		indice_omegas= indices;
	}
	//public int[] getOmegas() {
	public String getOmegas() {
		return indice_omegas;
	}
}
