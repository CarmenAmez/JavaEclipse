package metodos_java.java;

public class Return1 {
	
	public String echo(String parametroEntrada){
		String respuesta = parametroEntrada;
		return respuesta;
	}
	public static void main(String[] args) {
		Return1 m= new Return1();
		String valorDevuelto = m.echo("Greta");
		System.out.println(valorDevuelto);
	}

}
