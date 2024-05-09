package metodos_java.java;

public class Metodos2 {

	void Calculate(int numero) {
		int cubo = numero * numero * numero;
		System.out.println("El cubo de " + numero + " es: " + cubo);

	}

	public static void main(String[] args) {
		Metodos2 m = new Metodos2();

		m.Calculate(4);
	}
}
