
package calculadora;

public class Estructura{
    private double n1;
    private  double n2;
    private double resultado;
    private char operacion;
    
    
    public Estructura(double n1, double n2, char operacion){
        this.n1=n1;
        this.n2=n2;
        this.operacion=operacion;
        
    }
   
    public void mostrarResultadoDoble(){
        
        System.out.println(this.n1+" "+this.operacion+" "+this.n2+"  = "+this.resultado);
        
    }
   
    
    public double getN1(){
        return n1;
    }
    public void setN1(double n1){
        this.n1=n1;
    }
    
    
    public double getN2() {
        return n2;
     }
    public void setN2(double n2) {
        this.n2 = n2;
    }

    
    public char getOperacion() {
        return operacion;
    }
    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
    
    

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getResultado() {
        return resultado;
    }   
}
