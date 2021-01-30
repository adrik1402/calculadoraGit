
package calculadora;

public class Seno extends EstructuraSimple{
    private double seno;
    
    public Seno(double n1){
        super(n1,"sen");
        n1=Math.toRadians(n1);
        this.seno= Math.sin(n1);
        this.setResultadoSimple(this.seno);
    }
}