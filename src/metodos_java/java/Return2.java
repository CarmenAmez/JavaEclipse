package metodos_java.java;

public class Return2 {
	public String echo(String parametroEntrada){
		String respuesta = "Hola, "+  parametroEntrada + ".";
		return respuesta;
	}
	public static void main(String[] args) {
		Return2 m= new Return2();
		String valorDevuelto = m.echo("Ada");
		System.out.println(valorDevuelto);
	}

}
