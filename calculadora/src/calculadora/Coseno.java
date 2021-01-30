
package calculadora;

public class Coseno extends EstructuraSimple{
    private double coseno;
    
    public Coseno(double n1){
        super(n1,"cos");
        n1=Math.toRadians(n1);
        this.coseno= Math.cos(n1);
        this.setResultadoSimple(this.coseno);
    }
}
