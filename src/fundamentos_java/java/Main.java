package fundamentos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * System.out.println("Introduzca euros: "); int euros =
		 * Integer.parseInt(br.readLine()); int dolares = euros*2;
		 * System.out.println(dolares);
		 */

		/*
		 * System.out.println("Introduzca precio: "); int precio =
		 * Integer.parseInt(br.readLine()); int precioConIva = (int) (precio*1.21f);
		 * System.out.println(precioConIva);
		 */

		/*
		 * System.out.println("Introduzca ancho: "); int ancho =
		 * Integer.parseInt(br.readLine()); System.out.println("Introduzca alto: "); int
		 * alto = Integer.parseInt(br.readLine()); int area = (ancho + alto) * 2;
		 * System.out.println(area + " es el area del rectangulo.");
		 */

		/*
		 * System.out.println("Introduzca centigrados: "); float centigrados=
		 * Integer.parseInt(br.readLine()); float fahrenheit= centigrados * 9/5 + 32;
		 * System.out.println(fahrenheit + " fahrenheit.");
		 */

		System.out.println("Introduzca Nombre: ");
		String nombres = br.readLine();
		System.out.println("Introduzca Material: ");
		String material = br.readLine();
		System.out.println("Introduzca Dimensiones: ");
		String dimensiones = br.readLine();
		System.out.println("Introduzca Comentario: ");
		String comentario = br.readLine();
		System.out.println(nombres + " ha pedido una caja de " + material + " con dimesiones " + dimensiones
				+ ". Y deja este comentario: " + comentario + ".");

	}

}
