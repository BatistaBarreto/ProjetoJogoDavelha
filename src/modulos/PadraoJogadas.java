package modulos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import view.JogoDaVelha;
import modulos.GerarMatriz;

public class PadraoJogadas {

	//criação do objeto
	GerarMatriz g = new GerarMatriz();
	//declaração de atributos
	private boolean resultado = false;
	private String random; 
	List<String> lista = new ArrayList<String>();

	public void formatarcenario1(){
		JogoDaVelha.jogador="1";
		JogoDaVelha.labelJogador1.setForeground(Color.red);
		JogoDaVelha.labelJogador2.setForeground(Color.black);	
	}

	private void CampoVazio() {

		if ((JogoDaVelha.jogador =="2")	 &&	 (JogoDaVelha.computador == true)){

			g.GeraMatriz();
			if (JogoDaVelha.jogador =="2"){

				if (JogoDaVelha.computador == true){

					lista.clear();
					lista.add("OOOOOOOOO");
					if(lista.containsAll(g.matriz)){

						formatarcenario1();
						String [] jogadas = {"1","2","3","4","5","6","7","8","9"};					
						random = (jogadas[new Random().nextInt(jogadas.length)]);

						switch(random){
						case "1": JogoDaVelha.campo1.setText("O");
						JogoDaVelha.campo1.setForeground(Color.blue);
						break;
						case "2": JogoDaVelha.campo2.setText("O");	
						JogoDaVelha.campo2.setForeground(Color.blue);
						break;
						case "3": JogoDaVelha.campo3.setText("O");	
						JogoDaVelha.campo3.setForeground(Color.blue);
						break;
						case "4": JogoDaVelha.campo4.setText("O");	
						JogoDaVelha.campo4.setForeground(Color.blue);
						break;
						case "5": JogoDaVelha.campo5.setText("O");	
						JogoDaVelha.campo5.setForeground(Color.blue);
						break;
						case "6": JogoDaVelha.campo6.setText("O");	
						JogoDaVelha.campo6.setForeground(Color.blue);
						break;
						case "7": JogoDaVelha.campo7.setText("O");	
						JogoDaVelha.campo7.setForeground(Color.blue);
						break;
						case "8": JogoDaVelha.campo8.setText("O");	
						JogoDaVelha.campo8.setForeground(Color.blue);
						break;
						case "9": JogoDaVelha.campo9.setText("O");	
						JogoDaVelha.campo9.setForeground(Color.blue);
						break;
						default:
						}}
				}
			}
		}
	}

	private void PadraoJogoAtaque() {
		if ((JogoDaVelha.jogador =="2")	 &&	 (JogoDaVelha.computador == true)){
			g.GeraMatriz();

			//possibilidade #campo1
			if (((g.cp1=="O")&&(g.cp4=="2")&&(g.cp7=="2"))	||	((g.cp1=="O")&&(g.cp2=="2")&&(g.cp3=="2"))	||((g.cp1=="O")&&(g.cp5=="2")&&(g.cp9=="2"))){	
				formatarcenario1();
				JogoDaVelha.campo1.setText("O");
				JogoDaVelha.campo1.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo2
			if (((g.cp2=="O")&&(g.cp5=="2")&&(g.cp8=="2"))	||	((g.cp1=="2")&&(g.cp2=="O")&&(g.cp3=="2"))){
				formatarcenario1();
				JogoDaVelha.campo2.setText("O");
				JogoDaVelha.campo2.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo3
			if (((g.cp3=="O")&&(g.cp6=="2")&&(g.cp9=="2"))	||	((g.cp1=="2")&&(g.cp2=="2")&&(g.cp3=="O"))	||((g.cp3=="O")&&(g.cp5=="2")&&(g.cp7=="2"))){	
				formatarcenario1();
				JogoDaVelha.campo3.setText("O");
				JogoDaVelha.campo3.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo4
			if (((g.cp1=="2")&&(g.cp4=="O")&&(g.cp7=="2"))	||	((g.cp4=="O")&&(g.cp5=="2")&&(g.cp6=="2"))){	
				formatarcenario1();
				JogoDaVelha.campo4.setText("O");
				JogoDaVelha.campo4.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo5
			if (((g.cp2=="2")&&(g.cp5=="O")&&(g.cp8=="2"))	||	((g.cp4=="2")&&(g.cp5=="O")&&(g.cp6=="2"))	||	((g.cp1=="2")&&(g.cp5=="O")&&(g.cp9=="2"))	||	((g.cp3=="2")&&(g.cp5=="O")&&(g.cp7=="2"))){	
				formatarcenario1();
				JogoDaVelha.campo5.setText("O");
				JogoDaVelha.campo5.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo6
			if (((g.cp3=="2")&&(g.cp6=="O")&&(g.cp9=="2"))	||	((g.cp4=="2")&&(g.cp5=="2")&&(g.cp6=="O"))){	
				formatarcenario1();
				JogoDaVelha.campo6.setText("O");
				JogoDaVelha.campo6.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo7
			if (((g.cp1=="2")&&(g.cp4=="2")&&(g.cp7=="O"))	||	((g.cp7=="O")&&(g.cp8=="2")&&(g.cp9=="2"))	||((g.cp3=="2")&&(g.cp5=="2")&&(g.cp7=="O"))){	
				formatarcenario1();
				JogoDaVelha.campo7.setText("O");
				JogoDaVelha.campo7.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo8
			if (((g.cp2=="2")&&(g.cp5=="2")&&(g.cp8=="O"))	||	((g.cp7=="2")&&(g.cp8=="O")&&(g.cp9=="2"))){	
				formatarcenario1();
				JogoDaVelha.campo8.setText("O");
				JogoDaVelha.campo8.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo9
			if (((g.cp3=="2")&&(g.cp6=="2")&&(g.cp9=="O"))	||	((g.cp7=="2")&&(g.cp8=="2")&&(g.cp9=="O"))	||((g.cp1=="2")&&(g.cp5=="2")&&(g.cp9=="O"))){	
				formatarcenario1();
				JogoDaVelha.campo9.setText("O");
				JogoDaVelha.campo9.setForeground(Color.blue);
				return;
			}		
		}	
	}		

	private void PadraoJogoDefesa(){

		//condiçoes para o jogador 2
		if ((JogoDaVelha.jogador =="2")	 &&	 (JogoDaVelha.computador == true)){				
			g.GeraMatriz();	

			//jogadas de defesa
			//possibilidade #campo1
			if (((g.cp1=="O")&&(g.cp4=="1")&&(g.cp7=="1"))	||	((g.cp1=="O")&&(g.cp2=="1")&&(g.cp3=="1"))	||((g.cp1=="O")&&(g.cp5=="1")&&(g.cp9=="1"))){	
				//executar jogada
				System.out.println("padrao defesa campo 1");
				formatarcenario1();
				JogoDaVelha.campo1.setText("O");
				JogoDaVelha.campo1.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo2
			if (((g.cp2=="O")&&(g.cp5=="1")&&(g.cp8=="1"))	||	((g.cp1=="1")&&(g.cp2=="O")&&(g.cp3=="1"))){	
				//executar jogada
				System.out.println("padrao defesa campo 2");
				formatarcenario1();
				JogoDaVelha.campo2.setText("O");
				JogoDaVelha.campo2.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo3
			if (((g.cp3=="O")&&(g.cp6=="1")&&(g.cp9=="1"))	||	((g.cp1=="1")&&(g.cp2=="1")&&(g.cp3=="O"))	||((g.cp3=="O")&&(g.cp5=="1")&&(g.cp7=="1"))){	
				//executar jogada
				System.out.println("padrao defesa campo 3");
				formatarcenario1();
				JogoDaVelha.campo3.setText("O");
				JogoDaVelha.campo3.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo4
			if (((g.cp1=="1")&&(g.cp4=="O")&&(g.cp7=="1"))	||	((g.cp4=="O")&&(g.cp5=="1")&&(g.cp6=="1"))){
				//executar jogada
				System.out.println("padrao defesa campo 4");
				formatarcenario1();
				JogoDaVelha.campo4.setText("O");
				JogoDaVelha.campo4.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo5
			if (((g.cp2=="1")&&(g.cp5=="O")&&(g.cp8=="1"))	||	((g.cp4=="1")&&(g.cp5=="O")&&(g.cp6=="1"))	||	((g.cp1=="1")&&(g.cp5=="O")&&(g.cp9=="1"))	||	((g.cp3=="1")&&(g.cp5=="O")&&(g.cp7=="1"))){	
				//executar jogada
				System.out.println("padrao defesa campo 5");
				formatarcenario1();
				JogoDaVelha.campo5.setText("O");
				JogoDaVelha.campo5.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo6
			if (((g.cp3=="1")&&(g.cp6=="O")&&(g.cp9=="21"))	||	((g.cp4=="1")&&(g.cp5=="1")&&(g.cp6=="O"))){	
				//executar jogada
				System.out.println("padrao defesa campo 6");
				formatarcenario1();
				JogoDaVelha.campo6.setText("O");
				JogoDaVelha.campo6.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo7
			if (((g.cp1=="1")&&(g.cp4=="1")&&(g.cp7=="O"))	||	((g.cp7=="O")&&(g.cp8=="1")&&(g.cp9=="1"))	||((g.cp3=="1")&&(g.cp5=="1")&&(g.cp7=="O"))){	
				//executar jogada
				System.out.println("padrao defesa campo 7");
				formatarcenario1();
				JogoDaVelha.campo7.setText("O");
				JogoDaVelha.campo7.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo8
			if (((g.cp2=="1")&&(g.cp5=="1")&&(g.cp8=="O"))	||	((g.cp7=="1")&&(g.cp8=="O")&&(g.cp9=="1"))){	
				//executar jogada
				System.out.println("padrao defesa campo 8");
				formatarcenario1();
				JogoDaVelha.campo8.setText("O");
				JogoDaVelha.campo8.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo9
			if (((g.cp3=="1")&&(g.cp6=="1")&&(g.cp9=="O"))	||	((g.cp7=="1")&&(g.cp8=="1")&&(g.cp9=="O"))	||((g.cp1=="1")&&(g.cp5=="1")&&(g.cp9=="O"))){	
				//executar jogada
				System.out.println("padrao defesa campo 9");
				formatarcenario1();
				JogoDaVelha.campo9.setText("O");
				JogoDaVelha.campo9.setForeground(Color.blue);
				return;
			}
			System.out.println("padrao ataque alternativo");
			PadraoJogoAtaque();
		}
	}

	private void PadraoJogadaAleatoria(){
		if ((JogoDaVelha.jogador =="2")	 &&	 (JogoDaVelha.computador == true)){
			//inicializar o método para carregar as variáveis
			g.GeraMatriz();

			//linha 1
			if(((g.cp1!="1") &&(g.cp2!="1") && (g.cp3!="1")) && ((g.cp1=="O") || (g.cp2=="O") || (g.cp3=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);
					switch(random){
					case "1": if (g.cp1=="O"){
						JogoDaVelha.campo1.setText("O");
						JogoDaVelha.campo1.setForeground(Color.blue);
						resultado = true;	
						break;	}
					case "2": if(g.cp2=="O"){
						JogoDaVelha.campo2.setText("O");
						JogoDaVelha.campo2.setForeground(Color.blue);
						resultado = true;	
						break;	}
					case "3": if(g.cp3=="O"){
						JogoDaVelha.campo3.setText("O");	
						JogoDaVelha.campo3.setForeground(Color.blue);
						resultado = true;	
						break;	}
					default:
					}
				}
				System.out.println("aleatória - linha 1");
				formatarcenario1();
				return;
			}


			//linha 2
			if(((g.cp4!="1") &&(g.cp5!="1") && (g.cp6!="1")) && ((g.cp4=="O") || (g.cp5=="O") || (g.cp6=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp4=="O"){
						JogoDaVelha.campo4.setText("O");
						JogoDaVelha.campo4.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp5=="O"){
						JogoDaVelha.campo5.setText("O");	
						JogoDaVelha.campo5.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp6=="O"){
						JogoDaVelha.campo6.setText("O");	
						JogoDaVelha.campo6.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - linha 2");
				formatarcenario1();
				return;
			}

			//linha 3
			if(((g.cp7!="1") &&(g.cp8!="1") && (g.cp9!="1")) && ((g.cp7=="O") || (g.cp8=="O") || (g.cp9=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp7=="O"){
						JogoDaVelha.campo7.setText("O");
						JogoDaVelha.campo7.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp8=="O"){
						JogoDaVelha.campo8.setText("O");
						JogoDaVelha.campo8.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp9=="O"){
						JogoDaVelha.campo9.setText("O");
						JogoDaVelha.campo9.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - linha 3");
				formatarcenario1();
				return;
			}

			//coluna 1
			if(((g.cp1!="1") &&(g.cp4!="1") && (g.cp7!="1")) && ((g.cp1=="O") || (g.cp4=="O") || (g.cp7=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp1=="O"){
						JogoDaVelha.campo1.setText("O");
						JogoDaVelha.campo1.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp4=="O"){
						JogoDaVelha.campo4.setText("O");	
						JogoDaVelha.campo4.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp7=="O"){
						JogoDaVelha.campo7.setText("O");	
						JogoDaVelha.campo7.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - coluna 1");
				formatarcenario1();
				return;
			}

			//coluna 2
			if(((g.cp2!="1") &&(g.cp5!="1") && (g.cp8!="1")) && ((g.cp2=="O") || (g.cp5=="O") || (g.cp8=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp2=="O"){
						JogoDaVelha.campo2.setText("O");
						JogoDaVelha.campo2.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp5=="O"){
						JogoDaVelha.campo5.setText("O");	
						JogoDaVelha.campo5.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp8=="O"){
						JogoDaVelha.campo8.setText("O");	
						JogoDaVelha.campo8.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - coluna 2");
				formatarcenario1();
				return;
			}

			//coluna 3
			if(((g.cp3!="1") &&(g.cp6!="1") && (g.cp9!="1")) && ((g.cp3=="O") || (g.cp6=="O") || (g.cp9=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp3=="O"){
						JogoDaVelha.campo3.setText("O");
						JogoDaVelha.campo3.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp6=="O"){
						JogoDaVelha.campo6.setText("O");	
						JogoDaVelha.campo6.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp9=="O"){
						JogoDaVelha.campo9.setText("O");
						JogoDaVelha.campo9.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - coluna 3");
				formatarcenario1();
				return;
			}

			//diagonal 1
			if(((g.cp1!="1") &&(g.cp5!="1") && (g.cp9!="1")) && ((g.cp1=="O") || (g.cp5=="O") || (g.cp9=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp1=="O"){
						JogoDaVelha.campo1.setText("O");
						JogoDaVelha.campo1.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp5=="O"){
						JogoDaVelha.campo5.setText("O");	
						JogoDaVelha.campo5.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp9=="O"){
						JogoDaVelha.campo9.setText("O");	
						JogoDaVelha.campo9.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - diagonal 1");
				formatarcenario1();
				return;
			}

			//diagobal 2
			if(((g.cp3!="1") &&(g.cp5!="1") && (g.cp7!="1")) && ((g.cp3=="O") || (g.cp5=="O") || (g.cp7=="O"))){
				resultado = false;
				while(resultado ==false){
					String [] jogadas = {"1","2","3"};					
					random = (jogadas[new Random().nextInt(jogadas.length)]);

					switch(random){
					case "1": if (g.cp3=="O"){
						JogoDaVelha.campo3.setText("O");
						JogoDaVelha.campo3.setForeground(Color.blue);
						resultado = true;
						break;
					}
					case "2": if(g.cp5=="O"){
						JogoDaVelha.campo5.setText("O");
						JogoDaVelha.campo5.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					case "3": if(g.cp7=="O"){
						JogoDaVelha.campo7.setText("O");
						JogoDaVelha.campo7.setForeground(Color.blue);
						resultado = true;
						break;					
					}
					default:
					}
				}
				System.out.println("aleatória - diagonal 2");
				formatarcenario1();
				return;
			}
		}
	}

	private void JogadaEscape(){
		//condiçoes para o jogador 2
		if ((JogoDaVelha.jogador =="2")	 &&	 (JogoDaVelha.computador == true)){				
			g.GeraMatriz();	

			System.out.println("entrou na jogada de escape");
		
			//possibilidade #campo1
			if((g.cp1=="O") && (g.cp2!="O") && (g.cp3!="O") &&
					(g.cp4!="O") && (g.cp5!="O") && (g.cp6!="O") &&
					(g.cp7!="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 1");
				formatarcenario1();
				JogoDaVelha.campo1.setText("O");
				JogoDaVelha.campo1.setForeground(Color.blue);
				return;
			}	

			//possibilidade #campo2
			if((g.cp1!="O") && (g.cp2=="O") && (g.cp3!="O") &&
					(g.cp4!="O") && (g.cp5!="O") && (g.cp6!="O") &&
					(g.cp7!="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 2");
				formatarcenario1();
				JogoDaVelha.campo2.setText("O");
				JogoDaVelha.campo2.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo3
			if((g.cp1!="O") && (g.cp2!="O") && (g.cp3=="O") &&
					(g.cp4!="O") && (g.cp5!="O") && (g.cp6!="O") &&
					(g.cp7!="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 3");
				formatarcenario1();
				JogoDaVelha.campo3.setText("O");
				JogoDaVelha.campo3.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo4
			if((g.cp1!="O") && (g.cp2!="O") && (g.cp3!="O") &&
					(g.cp4=="O") && (g.cp5!="O") && (g.cp6!="O") &&
					(g.cp7!="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 4");
				formatarcenario1();
				JogoDaVelha.campo4.setText("O");
				JogoDaVelha.campo4.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo5
			if((g.cp1!="O") && (g.cp2!="O") && (g.cp3!="O") &&
					(g.cp4!="O") && (g.cp5=="O") && (g.cp6!="O") &&
					(g.cp7!="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 5");
				formatarcenario1();
				JogoDaVelha.campo5.setText("O");
				JogoDaVelha.campo5.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo6
			if((g.cp1!="O") && (g.cp2!="O") && (g.cp3!="O") &&
					(g.cp4!="O") && (g.cp5!="O") && (g.cp6=="O") &&
					(g.cp7!="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 6");
				formatarcenario1();
				JogoDaVelha.campo6.setText("O");
				JogoDaVelha.campo6.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo7
			if((g.cp1!="O") && (g.cp2!="O") && (g.cp3!="O") &&
					(g.cp4!="O") && (g.cp5!="O") && (g.cp6!="O") &&
					(g.cp7=="O") && (g.cp8!="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 7");
				formatarcenario1();
				JogoDaVelha.campo7.setText("O");
				JogoDaVelha.campo7.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo8
			if((g.cp1!="O") && (g.cp2!="O") && (g.cp3!="O") &&
					(g.cp4!="O") && (g.cp5!="O") && (g.cp6!="O") &&
					(g.cp7!="O") && (g.cp8=="O") && (g.cp9!="O")){	
				//executar jogada
				System.out.println("escape campo 8");
				formatarcenario1();
				JogoDaVelha.campo8.setText("O");
				JogoDaVelha.campo8.setForeground(Color.blue);
				return;
			}

			//possibilidade #campo9
			if(g.cp1!="O" && g.cp2!="O" && g.cp3!="O" &&
					g.cp4!="O" && g.cp5!="O" && g.cp6!="O" &&
					g.cp7!="O" && g.cp8!="O" && g.cp9=="O"){	
				//executar jogada
				System.out.println("escape campo 9");
				formatarcenario1();
				JogoDaVelha.campo9.setText("O");
				JogoDaVelha.campo9.setForeground(Color.blue);
				return;
			}
		}
	}


	public void Jogadas(){
		PadraoJogoAtaque();
		PadraoJogoDefesa();
		PadraoJogadaAleatoria();
		JogadaEscape();
		CampoVazio();
	}


}
