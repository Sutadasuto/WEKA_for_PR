package weka.classifiers.LC;


import java.util.Arrays;

public class omegas {
	private int[] indice_omegas;
	private String string_omegas;
	//private String indice_omegas;
	
	public void setOmegasFromFile(String indices) {
      string_omegas= indices;
	}
	//public int[] getOmegas() {
	public String getOmegas() {
		return string_omegas;
	}

	public int[] getOmegaIndices(){
      String[] numStr = string_omegas.split(",");
      //System.out.println(numStr.toString());
      int[] auxArray = new int[numStr.length];

      for(int i =0; i<auxArray.length;i++)
      {
          auxArray[i]= Integer.parseInt(numStr[i]) - 1;
      }
      Arrays.sort(auxArray);
      indice_omegas = auxArray;
      return indice_omegas;
	}
}
