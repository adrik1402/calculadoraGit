
package calculadora;

public class Suma extends Operaciones {
    
    private double suma;
    
    public Suma(double n1,double n2){
        super(n1,n2,'+');
        this.suma= n1 + n2;
        this.setRes(this.suma);
    }
}
