package weka.classifiers.LC;


public class omegas {
	private int[] indice_omegas;
	//private String indice_omegas;
	
	public void setOmegasFromFile(String indices) {
		String[] numStr = indices.split(",");
		//System.out.println(numStr.toString());
		int [] auxArray = new int[numStr.length];
		
		for(int i =0; i<auxArray.length;i++)
	    {
	        auxArray[i]= Integer.parseInt(numStr[i]);
	    }
		indice_omegas= auxArray;
	}
	//public int[] getOmegas() {
	public int[] getOmegas() {
		return indice_omegas;
	}
}
