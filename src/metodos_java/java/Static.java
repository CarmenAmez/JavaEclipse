package metodos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Static {
	
	public static int sumar(int first, int second){
		return second + second;
	}
	public static int restar(int first, int second){
		return first - second;
	}
	public static int multiplicar(int first, int second){
		return first*second;
	}
	public static int dividir(int first, int second){
		return first/second;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduzca un número para la operación: ");
		int first = Integer.parseInt(br.readLine());

		System.out.println("Introduzca un segundo número para operación: ");
		int second = Integer.parseInt(br.readLine());

		System.out.println("Introduzca el operador aritmético deseado (+, -, *, /): ");
		String operator = br.readLine();

		int result = 0;

		if (operator.equals("+")) {
			result = sumar(first , second);
		} else if (operator.equals("-")) {
			result = restar(first ,second);
		} else if (operator.equals("*")) {
			result = multiplicar(first , second);
		} else if (operator.equals("/")) {
			result = dividir(first, second);
		}

		System.out.println("El resultado es: " + result);

	}

}
