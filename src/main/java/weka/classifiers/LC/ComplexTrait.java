package weka.classifiers.LC;
import weka.core.Instance;

import java.util.ArrayList;
import java.io.Serializable;


public class ComplexTrait implements Serializable {

  private static final long serialVersionUID = 544223188659933358L;
  private String omega;
  private String classToAnalyze;
  private String[] values;
  private Instance equivalentInstance;
  private Double weight;


  //private String indice_omegas;

  public void setOmega(String omegaToAnalyze) {
    omega = omegaToAnalyze;
  }
  public String getOmega() {
    return omega;
  }

  public void setClass(String classOfInstance1) {
    classToAnalyze = classOfInstance1;
  }
  public String getAnalyzedClass() {
    return classToAnalyze;
  }

  public void setValues(String[] code) {
    values = code;
  }
  public String[] getValues() {
    return values;
  }

  public void setEquivalentInstance(Instance baseline){
    equivalentInstance = baseline;
  }

  public Instance getEquivalentInstance() {
    return equivalentInstance;
  }

  public void setWeight(Double _weight) { weight = _weight; }
  public double getWeight() { return weight; }
}
