
package calculadora;


public class Division extends Estructura{
    double division;
    
    public Division(double n1,double n2){
        super(n1,n2,'/');
        if(n2==0){
            System.out.println("Error divisor no valido. Elija un numero distinto a 0");
        }else{
            this.division = n1/n2;
        }
        this.setResultado(this.division);
    }
}
