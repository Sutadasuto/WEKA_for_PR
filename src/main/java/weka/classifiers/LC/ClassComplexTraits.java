package weka.classifiers.LC;

import java.util.ArrayList;
import java.io.Serializable;

public class ClassComplexTraits implements Serializable {

  private static final long serialVersionUID = 9078969117389410942L;
  ArrayList<ComplexTrait> complexTraits = new ArrayList<ComplexTrait>();
  private String classToAnalyze;

  public void setClass(String classOfComplexTraits) {
      classToAnalyze = classOfComplexTraits;
  }
  public String getAnalyzedClass() {
      return classToAnalyze;
  }

  public void addComplexTrait(ComplexTrait complexTrait) {
    complexTraits.add(complexTrait);
  }
  public  ArrayList<ComplexTrait> getComplexTraits() {
    return complexTraits;
  }

  public int getSize() {
    return complexTraits.size();
  }

  public ComplexTrait getComplexTrait(int index){
    return complexTraits.get(index);
  }
}
