package metodos_java.java;

public class Return7 {
	public String testLogicalOr(int val) {
		if (val >= 10 && val <= 20) {
			return "Inside";
		} else {
			return "Outside";
		}
	}

	public static void main(String[] args) {
		Return7 m = new Return7();
		String valorDevuelto = m.testLogicalOr(14);
		System.out.println(valorDevuelto);
	}

}
