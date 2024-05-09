package metodos_java.java;

public class Return6 {
	public String testLessThan(int val) {
		  if (val <= 12) {  
			  return "Menor o igual a 12";
		  }

		  if (val <= 24) {  
		    return "Menor o igual a 24";
		  }

		  return "More Than 24";
		}
	public static void main(String[] args) {
		Return6 m= new Return6();
		String valorDevuelto = m.testLessThan(40);
		System.out.println(valorDevuelto);
	}

}
