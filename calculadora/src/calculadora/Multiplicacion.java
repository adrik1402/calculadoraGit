
package calculadora;

class Multiplicacion extends Estructura{
    
    private double multiplicacion;
    public Multiplicacion(double n1,double n2){
        super(n1,n2,'x');
        this.multiplicacion=n1*n2;
        this.setResultado(this.multiplicacion);
    }
}
