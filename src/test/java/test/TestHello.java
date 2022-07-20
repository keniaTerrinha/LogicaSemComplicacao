package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hello.HelloWorld;

public class TestHello {
	
	@Test
	public void RealizaTestHello() throws Exception {
		//Classe nomeObjeto = new Classe();
		HelloWorld helloWorld = new HelloWorld("HelloWorld");
		String texto = "teste";
		texto = helloWorld.getHelloWorld();
		if(texto.equals("HelloWorld")) {
			System.out.println("Teste com sucesso");
		}else {
			System.out.println("Esperado: 'HelloWorld', Encontrado: '"+texto+"'");
			throw new Exception("Esperado: 'HelloWorld', Encontrado: '"+texto+"'");
		}
	}
	
	@Test
	public void RealizaTestHello2() {
		//Classe nomeObjeto = new Classe();
		HelloWorld helloWorld = new HelloWorld("Hello World");
		String texto = "teste";
		texto = helloWorld.getHelloWorld();
		assertEquals("Hello World", texto);
	}
	
	@Test
	public void TesteComparacao() {
		String texto = HelloWorld.getTexto();
		assertEquals("TesteAA", texto);
	}
	
	
}
