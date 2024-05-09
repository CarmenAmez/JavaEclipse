package metodos_java.java;

public class Return4 {
	public String testGreaterOrEqual(int val) {
		  if (val >= 20) { 
		    return "20 or más";
		  }

		  if (val >= 10) { 
		    return "10 o más";
		  }

		  return "menos de 10";
		}
	public static void main(String[] args) {
		Return4 m= new Return4();
		String valorDevuelto = m.testGreaterOrEqual(10);
		System.out.println(valorDevuelto);
	}
}
