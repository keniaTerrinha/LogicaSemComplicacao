package testLogica;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

import logica.EstruturaRepeticao;

public class TestEstruturaRepeticao {
	
	//Tipo/Classe nomeObjeto = new Classe();
	EstruturaRepeticao estruturaRepeticao = new EstruturaRepeticao();
	
	@Test
	public void testTabuada() {
		List<Integer> resultado = estruturaRepeticao.tabuada(5);
		
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(5);
		esperado.add(10);
		esperado.add(15);
		esperado.add(20);
		esperado.add(25);
		esperado.add(30);
		esperado.add(35);
		esperado.add(40);
		esperado.add(45);
		esperado.add(50);
		
		assertEquals(esperado, resultado);
	}


	
	/*
	 * 37.	Entrar via teclado com um valor (X) qualquer.
	 * Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, 
	 * sendo que o segundo valor (B), deverá ser maior que o primeiro (A), 
	 * caso contrário, Exibir mensagem de erros. Após a validação dos dados, 
	 * exibir a tabuada do valor digitado, no intervalo decrescente, 
	 * ou seja, a tabuada de X no intervalo de B para A.
	 */
	@Test
	public void testTabuadaDecrescente() {
		int x = 5;
		int a = 2;
		int b = 8;
		
		if (b < a) {
			System.out.println("O valor B deve ser maior que o valor A");
			return;
		}
		//tipo(for, while, do while)| contador | condição | incremento|
		
		for(int i = b; i >= a; i--) {
			System.out.println(x+" x "+i+" = "+x*i);
		}
		
	}
	
	/*
	 * 49.	O jogo da mega-sena consiste em acertar seis dos sessenta números disponíveis em um 
	 * volante. Fazer um programa para calcular a quantidade de jogos que temos que fazer,
	 *  para com certeza acertar o resultado da mega-sena. Admitindo que faremos jogos de 
	 *  seis números por volante, o programa deverá exibir quais seriam estes números em cada volante,
	 *   ou seja, exibir todos os resultados possíveis.
	 */
	@Test
	public void megaSena() {
		//1.2.3.4.5.6

		int x = 10;
		int cont = 0;

		
		for(int n1 = 1; n1 <= x; n1++) {
			for(int n2 = 1; n2 <= x; n2++) {

									
									System.out.println(n1+"."+n2+"."+n3+"."+n4+"."+n5+"."+n6);
									cont++;
								}*/
								LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
								map.put(n1, 0);
								map.put(n2, 1);
								map.put(n3, 2);
								map.put(n4, 3);
								map.put(n5, 4);

								map.put(n6, 5);
								
								if (map.size() == 6) {
									System.out.println(n1+"."+n2+"."+n3+"."+n4+"."+n5+"."+n6);
									cont++;
								}
															
							}
						}
					}
				}

			}
		}
		System.out.println("Total de jogos: "+cont);
		
		
	}

	
	@Test
	public void clima() {


		/*clima = ensolarado, chovendo, nublado, nevando
				"sai de csa com mascara"
				"sai mas com guarda chuva e mascara"
				"sai mas leva o casaco e mascara"
				"fica em casa"
		*/
		String situacao = "";
		String tempo = "nevando";
		
				
		switch (tempo) {
		case "ensolarado":
			situacao = "sai de casa com mascara";
			break;
		case "chovendo":
			situacao = "sai mas com guarda chuva e mascara";
			break;
		case "nublado":
			situacao = "sai mas leva o casaco e mascara";
			break;
		case "nevando":
			situacao = "fica em casa";
			break;

		default:
			System.out.println("Valor invalido!");
		}
		
		System.out.println(situacao);
		
	}
	
	@Test
	public void climaComArtesMisticas() {
		String tempo = "ensolarado";
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("ensolarado", "sai de casa com mascara");
		map.put("chovendo","sai mas com guarda chuva e mascara");
		map.put("nublado", "sai mas leva o casaco e mascara");
		map.put("nevando", "fica em casa");
		
		map.put("ensolarado", "vai pra praia");
		
		System.out.println(map.get(tempo));
	}
	
	
}
