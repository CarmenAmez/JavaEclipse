package metodos_java.java;

public class Metodo4 {
	void Calculate(int alto, int ancho) {
		int perimetro =  2*ancho + 2*alto;
		System.out.println(perimetro + " es el perímetro de este rectángulo con ancho: " + ancho + " y alto: " + alto + ".");

	}

	public static void main(String[] args) {
		Metodo4 m = new Metodo4();

		m.Calculate(4, 8);
	}

}
