package hello;

public class HelloWorld {
	private String texto;
	
	public HelloWorld(String _texto) {
		texto = _texto;
	}	
	
	public String getHelloWorld() {
		return texto;
	}
	
	private String getHelloWorld2() {
		return texto;
	}
	
	public static String getTexto() {
		return "Teste";
	}
}
