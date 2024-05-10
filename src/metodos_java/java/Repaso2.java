package metodos_java.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduzca su DNI (sin la letra): ");
		int dniUser = Integer.parseInt(br.readLine());
		
		System.out.println(dniUser);
		
		String [] letrasDNI = { "T"," R"," W", "A", "G"," M"," Y", "F"," P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		int plusDNI = dniUser % 23 ;
	
		System.out.println(letrasDNI[plusDNI]);
	}
}
