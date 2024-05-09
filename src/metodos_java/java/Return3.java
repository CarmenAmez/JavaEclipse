package metodos_java.java;

public class Return3 {
	public String testGreaterThan(int val) {
		  if (val > 100) {  
		    return "Por encima de 100";
		  }

		  if (val > 10) {  
		    return "Por encima de 10";
		  }

		  return "10 o menos";
		}
	public static void main(String[] args) {
		Return3 m= new Return3();
		String valorDevuelto = m.testGreaterThan(158);
		System.out.println(valorDevuelto);
	}
}
