package modulos;

import java.util.Random;

public class SortearJogador {
	
	//declara��o de atributos
	public String random;
	
	public void SorteaJogador(){
		//construindo o array de jogadores
		String [] jogadores = {"1","2","1","2","1","2"};
		
		// sortear os jogadoores com o m�todo random
		random = (jogadores[new Random().nextInt(jogadores.length)]);
	}
}
