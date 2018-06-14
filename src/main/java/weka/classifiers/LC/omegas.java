package weka.classifiers.LC;


import java.util.Arrays;

public class omegas {
  private String string_omegas;

  public void setOmegas(int[] indices) {
    string_omegas=indices.toString();
  }
  private int testAttributeInRange(String indices, int range) {
    String[] numStr = indices.split(",");
    boolean out=false;
    int sa=0;
    int result=-1;
    while(sa<numStr.length && out==false) {
      int auxInt = Integer.parseInt(numStr[sa]);
      if (auxInt<1 || auxInt>range ) {
        result = auxInt;
      }
      sa++;
    }
    return result;
  }
  
  public int setOmegasFromFile(String indices,int range) {
    int result=-1;
    int response =testAttributeInRange(indices,range);
    if (response==-1) {
      string_omegas= indices;
    }else {
      result=response;
    }
    return result;
  }

  public String getOmegas() {
      return string_omegas;
  }

  public int[] getOmegaIndices(){
    String[] numStr = string_omegas.split(",");
    int[] auxArray = new int[numStr.length];

    for(int i =0; i<auxArray.length;i++)
    {
        auxArray[i]= Integer.parseInt(numStr[i]) - 1;
    }
    Arrays.sort(auxArray);
    return auxArray;
  }
}
