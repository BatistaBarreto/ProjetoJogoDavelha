package modulos;

import java.util.Random;

public class SortearJogador {
	
	//declaração de atributos
	public String random;
	
	public void SorteaJogador(){
		//construindo o array de jogadores
		String [] jogadores = {"1","2","1","2","1","2"};
		
		// sortear os jogadoores com o método random
		random = (jogadores[new Random().nextInt(jogadores.length)]);
	}
}
