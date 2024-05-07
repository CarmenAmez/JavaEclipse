package fundamentos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
	
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	  System.out.println("Introduzca un número para sumar: "); 
//	  int first =Integer.parseInt(br.readLine()); 
//	  System.out.println("Introduzca un segundo número para sumar: "); 
//	  int second =Integer.parseInt(br.readLine()); 
//	  int plus = first + second;
//	 System.out.println("El resultado es: " + plus);
	 
	 
	System.out.println("Introduzca un número para la operación: ");
    int first = Integer.parseInt(br.readLine());
    
    System.out.println("Introduzca un segundo número para operación: ");
    int second = Integer.parseInt(br.readLine());
    
    System.out.println("Introduzca el operador aritmético deseado (+, -, *, /): ");
    String operator = br.readLine();
    
    int result = 0;
    
//    if (operator.equals("+")) {
//        result = first + second;
//    } else if (operator.equals("-")) {
//        result = first - second;
//    } else if (operator.equals("*")) {
//        result = first * second;
//    } else if (operator.equals("/")) {
//            result = first / second;
//        } 

    switch (operator) {
        case "+":
            result = first + second;
            break;
        case "-":
            result = first - second;
            break;
        case "*":
            result = first * second;
            break;
        case "/":
            result = first / second;
            break;
        default:
            System.out.println("Operador no válido");
    }

    System.out.println("El resultado es: " + result);

	}
}
