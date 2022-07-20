package testLogica;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import logica.OperacoesAritmeticas;

public class TestOperacoesAritmeticas {
	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
	
	
	
	//1.	Entrar via teclado com a base e a altura de um retângulo,
	//calcular e exibir sua área.
	@Test
	public void testAreaRetangulo() {
		int area = opAritmeticas.calculoAreaRetangulo(5, 10);
		
		assertEquals(50, area);
	}
	
	//2.	Calcular e exibir a área de um quadrado, 
	//a partir do valor de sua aresta que será digitado.
	@Test
	public void testAreaQuadrado() {
		int area = opAritmeticas.calculoAreaQuadrado(10);
		
		assertEquals(100, area);
	}
	
	//15.	Entrar via teclado com o valor da cotação do dólar 
	//e uma certa quantidade de dólares. Calcular e exibir o 
	//valor correspondente em Reais (R$).
	
	@Test
	public void testCotacaoDolar() {
		double reais = opAritmeticas.calculoDolarReais(5.55,10);
		
		assertEquals(55.50, reais, 0);
		
	}
	
	/*6.	Calcular e exibir a média aritmética de quatro valores
	quaisquer que serão digitados.
	*/
	
	@Test
	public void testMediaAritmetica() {
		OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
		double media = this.opAritmeticas.calculoMediaAritmetica(5, 7, 4, 8);
		assertEquals(6, media, 0);
	}
	
	/*17.	Entrar via teclado com dois valores quaisquer “X” e “X”.
	Calcular e exibir o cálculo XY (“X” elevado a “Y”). 
	Pesquisar as funções Exp e Ln.
	*/
	
	@Test
	public void testExponencial() {
		int exp = opAritmeticas.calculoExponencial(2, 2);
		assertEquals(6, exp);
	}
	
	/*18.	Entrar via teclado com o valor de cinco produtos. Após as entradas,
	digitar um valor referente ao pagamento da somatória destes valores. 
	Calcular e exibir o troco que deverá ser devolvido.
	*/
	
	@Test
	public void testTroco() {
		int troco = opAritmeticas.calculoTroco(5, 2, 3, 7, 4, 50);
		assertEquals(29, troco);
	}
	
	/*21.	Entrar com dois valores quaisquer. Exibir o maior deles,
	se existir, caso contrário, enviar mensagem avisando que os números são idênticos.
	*/
	
	@Test
	public void testMaiorIgual() {
		String mensagem = opAritmeticas.verificaMaiorNumero(15, 2);
		String mensagem2 = opAritmeticas.verificaMaiorNumero(5, 10);
		String mensagem3 = opAritmeticas.verificaMaiorNumero(10, 10);
	
		assertEquals("O maior numero é: 15", mensagem);
		assertEquals("O maior numero é: 10", mensagem2);
		assertEquals("Os Valores são identicos", mensagem3);
	}
	
	@Test
	public void testTamanhoTerreno() {
		String mensagem = opAritmeticas.tamanhoTerreno(10, 5);
		assertEquals("Terreno pequeno", mensagem);
		mensagem = opAritmeticas.tamanhoTerreno(10, 15);
		assertEquals("Terreno grande", mensagem);
	}
	
	@Test
	public void testPesoAltura() {
		String mensagem = opAritmeticas.pesoAltura(57, "m", 1.82);
		assertEquals("Abaixo do peso", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(68, "m", 1.70);
		assertEquals("Peso ideal", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(100, "m", 1.40);
		assertEquals("Acima do peso", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(78, "f", 1.58);
		assertEquals("Acima do peso", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(78, "f", 0);
		assertEquals("Valor invalido para altura", mensagem);
		System.out.println(mensagem);
	}
	
	
}
