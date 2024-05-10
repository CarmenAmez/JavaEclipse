package metodos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca el numero de noches: ");
		int numNoches = Integer.parseInt(br.readLine());
		System.out.println("Introduzca el destino: ");
		String destino = br.readLine();
			
		Repaso3 costeViaje = new Repaso3();
		int resultado1 = costeViaje.costeHotel(numNoches);
		int resultado2 = costeViaje.costeAvion(destino);
		int resultado3 = costeViaje.costeAlquilerCoche(numNoches);

		int sumaCostes = resultado1 + resultado2 + resultado3;
		System.out.println("Coste total: " + sumaCostes);
		
		
		}
	public int costeHotel (int n) {
			return n *140;
	}
	
	public Integer costeAvion (String destino) {
		
		if (destino.equals("Oviedo")) {
			 return 15;
		} else if (destino.equals("Tokyo")) {
			return 700;
		} else if (destino.equals("Madrid")) {
			return 90;
		} else if (destino.equals("Barcelona")) {
			return 90;
		} else {
			return null;
		}
	}
	
	public Integer costeAlquilerCoche (int dias) {
		int coste = dias*40;
		
		if (dias >= 7) {
			return coste - 50;
		} else if (dias >= 3) {
			return coste - 20;
		}else {
			return null;
		}
		
		
		
		
		
	}
}
