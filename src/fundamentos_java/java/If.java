package fundamentos_java.java;

public class If {

	public static void main(String[] args) {

		int nota = 8;

		if (nota < 5) {
			System.out.println("Has suspedido!");
		} else if (nota > 5) {
			System.out.println("Has aprobado!");
		} else {
			System.out.println("Un 10! Excelente!");
		}
		int i = 45;

		if (i >= 0) {
			System.out.println("El valor de 'i' es positivo.");
		} else {
			System.out.println("El valor de 'i' es negativo.");
		}

		if (i % 2 == 0) {
			System.out.println("El valor de 'i' es par.");
		} else {
			System.out.println("El valor de 'i' es impar.");
		}

		if (i % 5 == 0) {
			System.out.println("El valor de 'i' es múltiplo de 5.");
		} else {
			System.out.println("El valor de 'i' no es múltiplo de 5.");
		}

		if (i % 10 == 0) {
			System.out.println("El valor de 'i' es múltiplo de 10.");
		} else {
			System.out.println("El valor de 'i' no es múltiplo de 10.");
		}

		if (i > 100) {
			System.out.println("El valor de 'i' es mayor que 100.");
		} else if (i < 100) {
			System.out.println("El valor de 'i' es menor que 100.");
		} else {
			System.out.println("El valor de 'i' es igual a 100.");
		}
		
		System.out.println("Ejercicios ternarios.");
		int b = 27;
	
		String resultado = (b>0)?"Es un número positivo.":"Es un número negativo.";
		System.out.println(resultado);
		
		int w = 27;
		String par= (w % 2 == 0 )?"Es un número par.":"Es un número inpar.";
		System.out.println(par);
		

	}

}
