package calculadora;

import java.util.Scanner;


public class Calculadora {
 
  
    public static void main(String[] args) {
    	String signo;
        double valor1, valor2;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Bienvenido!");
    	System.out.println("Que operacion desea realizar?");
    	System.out.println("Suma / Resta / Multiplicacion / Division / Raiz / Seno / Coseno ");
    	signo=sc.nextLine().toLowerCase();
        
            switch(signo){
            case"suma":  System.out.println("Introduzca el primer valor");
                         valor1=sc.nextDouble();
                         System.out.println("Introduzca el segundo valor");
                         valor2=sc.nextDouble();
                         Suma sum=new Suma(valor1,valor2);
                         sum.mostrarResultadoDoble(); 
                         break;
            case"resta": System.out.println("Introduzca el primer valor");
                         valor1=sc.nextDouble();
                         System.out.println("Introduzca el segundo valor");
                         valor2=sc.nextDouble();
                         Resta rest=new Resta(valor1,valor2);
                         rest.mostrarResultadoDoble(); 
                         break;
            case"multiplicacion":System.out.println("Introduzca el primer valor");
                         valor1=sc.nextDouble();
                         System.out.println("Introduzca el segundo valor");
                         valor2=sc.nextDouble();
                         Multiplicacion multi=new Multiplicacion(valor1,valor2);
                         multi.mostrarResultadoDoble();
                         break;
            case"division":System.out.println("Introduzca el primer valor");
                         valor1=sc.nextDouble();
                         System.out.println("Introduzca el segundo valor");
                         valor2=sc.nextDouble();
                         Division div=new Division(valor1,valor2);
                         div.mostrarResultadoDoble(); 
                         break;
            case"seno":System.out.println("Introduzca el valor:");
                       valor1=sc.nextDouble();
                       Seno sen=new Seno(valor1);
                       sen.mostrarResultadoSimple();
                       break;
            default: System.out.println("Error");             
            }
    }   
}
    	
    		
    	
    

    
