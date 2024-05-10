package metodos_java.java;

public class Random {

	public static void main(String[] args) {
//		int max = 7;
//		int min = 5;
//
//		int nRandom = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
//
//		System.out.println(nRandom);
		
		String nombre = "carmen";
		 int nRandom = (int) (Math.floor(Math.random() * (nombre.length())));
		 
		 System.out.println(nRandom);
		 System.out.println(nombre.charAt(nRandom));
		 
		 
		
	}

}
