package metodos_java.java;

public class Metodo1 {
	void name(boolean valor) {
		if (valor == true) {
			System.out.println("Sí, eso es cierto.");
		} else {
			System.out.println("No, eso es falso.");

		}
		
	}
	public static void main(String[] args) {
		Metodo1 p = new Metodo1();
		
		p.name(true);
	}
}
