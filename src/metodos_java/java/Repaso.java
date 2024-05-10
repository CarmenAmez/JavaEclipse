package metodos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int max = 5;
//		int min = 1;
//		int numRan =  (int) (Math.floor(Math.random() * (max - min + 1)) + min);
//		
//		System.out.println(numRan);
//		
//		  System.out.println("Introduzca un número entero: "); 
//		  int numUsuario =Integer.parseInt(br.readLine()); 
//		  
//		  if(numRan == numUsuario) {
//			  System.out.println("Son iguales.");
//		  } else {
//			  System.out.println("No son iguales.");
//		  }

		int max = 20;

		int numRan = (int) (Math.floor(Math.random() * (max)));

		int counter = 5;

		while (counter != 0) {
			System.out.println("Introduzca el número secreto: ");
			int numUsuario = Integer.parseInt(br.readLine());
			if (numRan == numUsuario) {
				System.out.println("Acertaste! Este es el número random: " + numRan);
				break ;
			} else if (counter == 0) {
				System.out.println("Fallaste! Este es el número random" + numRan);
			}else {
				counter--;
			}
		}
	}

}
