package calculadora;

import java.util.Scanner;


public class Calculadora {
 
  
    public static void main(String[] args) {
    	String signo;
        double valor1, valor2;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Bienvenido!");
    	System.out.println("Que operacion desea realizar?");
    	System.out.println("Suma / Resta / Multiplicacion / Division / Raiz / Sen / Cos ");
    	signo=sc.nextLine().toLowerCase();
        System.out.println("Introduzca el primer valor");
        valor1=sc.nextDouble();
        System.out.println("Introduzca el segundo valor");
        valor2=sc.nextDouble();
        
     
    
        
        if (signo == "suma" || signo == "resta" || signo == "multiplicacion" || signo == "division"){
            
        
        switch(signo){
            case"suma": Suma sum=new Suma(valor1,valor2);
            return  sum.mostrarResultadoDoble(); 
            case"resta": Resta rest=new Resta(valor1,valor2);
                         rest.mostrarResultadoDoble(); 
            case"multiplicacion": Multiplicacion multi=new Multiplicacion(valor1,valor2);
                         multi.mostrarResultadoDoble(); 
            case"division": Division div=new Division(valor1,valor2);
                         div.mostrarResultadoDoble(); 
             
        }         
               }else{
               System.out.println("Error");
        }
//            
//            
//  	public static void Numero (String signo, double valor1, double valor2)  {
//	switch(signo) {
//        case "Suma": Suma sum=new Suma(valor1,valor2);
//                         sum.mostrarResultadoDoble();  ;
//        case "Division": Division div=new Division(valor1,valor2);
//                           div.mostrarResultadoDoble(); ;
//        case "Resta": Resta rest=new Resta(valor1,valor2);
//                         rest.mostrarResultadoDoble(); 
//        case "Multi": Multiplicacion multi=new Multiplicacion(valor1,valor2);
//                         multi.mostrarResultadoDoble(); ;
//         default: return;      
     
        }
		
		
//	}
	
//            case"raiz": Raiz suma=new Suma(valor1,valor2);
//                         suma.mostrarResultadoDoble();              
//            case"sen": Suma suma=new Suma(valor1,valor2);
//                         suma.mostrarResultadoDoble();    
//            case"cosen": Suma suma=new Suma(valor1,valor2);
//                         suma.mostrarResultadoDoble();              
      
}
    	
    		
    	
    

    
