package fundamentos_java.java;

public class BucleFor {
	
	    public static void main(String[] args) {
	    	System.out.println("Ejercicio 1: ");
	        for (int i = 2; i <= 100; i += 2) {
	            System.out.println(i);
	        }
	        
	        System.out.println("Ejercicio 2: ");
	        
	            for (int a = 1; a <= 100; a++) {
	                if (a % 2 == 0) {
	                    System.out.println(a);
	                }
	            }
	            
	            System.out.println("Ejercicio 3: ");
	             
	            for ( int e = 1 ; e <=20; e++) {
	            	if (e % 3 == 0 && e % 5 == 0) {
	            		System.out.println("FizzBuzz");
	            	} else if ( e % 5 == 0) {
	            		System.out.println("Buzz");
	            	} else if (e % 3 == 0 ) {
	            		System.out.println("Fizz");
	            	} else {
	            		System.out.println(e);
	            	}
	            }
	            
	            System.out.println("Ejercicio 4: ");
	            
	            int numero = 7;
	            
	            for( int o = 1; o < 9; o++) {
	            	System.out.println(numero + " x " + o + " = " + (numero * o));
	            }
	            
	            System.out.println("Ejercicio 5: ");  
	            
	            for (int u = 1; u <= 10; u++) {
	                System.out.println("Tabla de multiplicar del " + u + ":");
	                for (int j = 1; j <= 10; j++) {
	                    System.out.println(u + " x " + j + " = " + (u * j));
	                }
	                System.out.println();}
	        }
	    }
