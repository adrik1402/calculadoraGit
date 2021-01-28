package calculadora;

import java.util.Scanner;


public class Calculadora {
 
  
    public static void main(String[] args) {
    	String signo;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("�Bienvenido!");
    	System.out.println("�Qu� operaci�n desea realizar?");
    	System.out.println("Suma / Resta / Multiplicaci�n / Divisi�n / Ra�z / Seno / Coseno");
    	signo=sc.nextLine();
    	signo.toLowerCase();
    	
    	if(signo=="suma") {
    		
    	}
    	if(signo=="resta") {
    		
    	}
    	if(signo=="multiplicacion") {
    		
    	}
    	if(signo=="division") {
    		
    	}
    	if(signo=="raiz") {
    		
    	}
    	if(signo=="seno") {
    		
    	}
    	if(signo=="coseno") {
    		
    	}else {
    		System.out.println("Syntax Error");
    	}
    }
    
}