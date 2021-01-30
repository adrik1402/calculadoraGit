
package calculadora;

public class EstructuraSimple {
    private double n1;
    private String operacionSimple;
    private double resultadoSimple;
    
    public EstructuraSimple(double n1,String operacionS){
     this.n1=n1;
     this.operacionSimple=operacionS;
    }
     public void mostrarResultadoSimple(){
        System.out.println(this.operacionSimple+"("+this.n1+")"+" = "+this.resultadoSimple);
    }
     
    public double getN1(){
        return n1;
    }
    public void setN1(double n1){
        this.n1=n1;
    }
    
    
    public String getOperacionSimple() {
        return operacionSimple;
    }
    public void setOperacionSimple(String operacionSimple) {
        this.operacionSimple = operacionSimple;
    }
    
    
    public void setResultadoSimple(double resultado) {
        this.resultadoSimple = resultadoSimple;
    }
    public double getResultadoSimple() {
        return resultadoSimple;
    }
    
      
}
