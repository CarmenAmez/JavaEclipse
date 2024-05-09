package metodos_java.java;

public class Return5 {
	public String testLessThan(int val) {
		  if (val < 25) {  
			  return "Por debajo de 25";
		  }

		  if (val < 55) {  
		    return "Por debajo de 55";
		  }

		  return "55 o más";
		}
	public static void main(String[] args) {
		Return5 m= new Return5();
		String valorDevuelto = m.testLessThan(40);
		System.out.println(valorDevuelto);
	}
}
