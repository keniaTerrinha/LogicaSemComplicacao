package logica;

import java.util.ArrayList;
import java.util.List;

public class EstruturaRepeticao {

	/*
	 * 36.	Entrar via teclado com um valor qualquer. 
	 * exibir a tabuada do valor solicitado, no intervalo de um a dez.
	 * 
	 */
	
	public List<Integer> tabuada(int valor){
		List<Integer> resultado = new ArrayList<Integer>(); 
				
		int cont = 1;
		while (cont < 11) {
			resultado.add(valor * cont);
			cont += 1;
		}
		
		return resultado;
	}
	
	//comentario
}
