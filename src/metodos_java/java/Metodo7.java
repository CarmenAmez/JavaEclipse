package metodos_java.java;

public class Metodo7 {
	void sum(int a, int b) {
		System.out.println("Suma " + "de " + a  + " y "+ b + ":");
		System.out.println(a + b);}

	void rest(int a, int b) {
		System.out.println("Resta " + "de " + a  + " y "+ b + ":");
			System.out.println(a - b);}

	void mult(int a, int b) {
		System.out.println("Multiplicación " + "de " + a  + " y "+ b + ":");
				System.out.println(a * b);}

	void div(int a, int b) {
		System.out.println("División " + "de " + a  + " y "+ b + ":");
		System.out.println(a / b);

	}

	public static void main(String[] args) {
		Metodo7 m = new Metodo7();

		m.sum(8, 8);
		m.rest(34, 8);
		m.mult(67, 3);
		m.div(58, 2);
	}
}
