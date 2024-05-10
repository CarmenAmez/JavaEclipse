package metodos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Potencia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("Introduzca base: ");
//		int base = Integer.parseInt(br.readLine());
		System.out.println("Introduzca un número: ");
		int number = Integer.parseInt(br.readLine());

//        for (int i = 0; i < exponente; i++) {
//            resultado *= base;
//        }
		int resultado = 1;
		for (int i = number; i > 0; i--) {
			resultado = resultado * i;
		}
		System.out.println(resultado);
	}

}
