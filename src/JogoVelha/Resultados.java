package modulos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import view.JogoDaVelha;
import modulos.GerarMatriz;
import modulos.LimparTela;

public class Resultados {

	//instanciar a classe gerar matriz
	GerarMatriz g = new GerarMatriz();	
	LimparTela limp = new LimparTela();
	PadraoJogadas padraojogadas = new PadraoJogadas();

	//declaração de atributos
	List<String> lista = new ArrayList<String>();

	public void resultado(){

		//iniciando o método de captura dos valores dos botões
		g.GeraMatriz();

		//vitoria 1
		if (((g.cp1=="1")&&(g.cp2=="1")&&(g.cp3=="1"))	||	((g.cp4=="1")&&(g.cp5=="1")&&(g.cp6=="1"))	||((g.cp7=="1")&&(g.cp8=="1")&&(g.cp9=="1"))
				|| ((g.cp1=="1")&&(g.cp4=="1")&&(g.cp7=="1"))	|| ((g.cp2=="1")&&(g.cp5=="1")&&(g.cp8=="1"))	|| ((g.cp3=="1")&&(g.cp6=="1")&&(g.cp9=="1"))
				|| ((g.cp1=="1")&&(g.cp5=="1")&&(g.cp9=="1"))	|| ((g.cp3=="1")&&(g.cp5=="1")&&(g.cp7=="1"))){	

			//executar comandos	
			if (g.cp1=="1" && g.cp2=="1" && g.cp3=="1"){
				JogoDaVelha.campo1.setBackground(Color.GREEN);
				JogoDaVelha.campo1.setForeground(Color.BLACK);
				JogoDaVelha.campo2.setBackground(Color.GREEN);
				JogoDaVelha.campo2.setForeground(Color.BLACK);
				JogoDaVelha.campo3.setBackground(Color.GREEN);
				JogoDaVelha.campo3.setForeground(Color.BLACK);
				
			}
			JOptionPane.showMessageDialog(null,"VITÓRIA DO JOGADOR 1");	
			limp.limpar();

			//iniciar uma nova partida se for o computador a jogar		
			padraojogadas.Jogadas();

			return;
		}

		//vitoria 2
		if (((g.cp1=="2")&&(g.cp2=="2")&&(g.cp3=="2"))	||	((g.cp4=="2")&&(g.cp5=="2")&&(g.cp6=="2"))	||((g.cp7=="2")&&(g.cp8=="2")&&(g.cp9=="2"))
				|| ((g.cp1=="2")&&(g.cp4=="2")&&(g.cp7=="2"))	|| ((g.cp2=="2")&&(g.cp5=="2")&&(g.cp8=="2"))	|| ((g.cp3=="2")&&(g.cp6=="2")&&(g.cp9=="2"))
				|| ((g.cp1=="2")&&(g.cp5=="2")&&(g.cp9=="2"))	|| ((g.cp3=="2")&&(g.cp5=="2")&&(g.cp7=="2"))){	

			//executar comandos	 
			JOptionPane.showMessageDialog(null,"VITÓRIA DO JOGADOR 2");	
			limp.limpar();

			//iniciar uma nova partida se for o computador a jogar
			padraojogadas.Jogadas();

			return;
		}

		//empate
		if ((JogoDaVelha.campo1.getText() != "") && (JogoDaVelha.campo2.getText() != "") && (JogoDaVelha.campo3.getText() != "")
				&& (JogoDaVelha.campo4.getText() != "") && (JogoDaVelha.campo5.getText() != "") && (JogoDaVelha.campo6.getText() != "")
				&& (JogoDaVelha.campo7.getText() != "") && (JogoDaVelha.campo8.getText() != "") && (JogoDaVelha.campo9.getText() != "")){

			//executar comandos
			JOptionPane.showMessageDialog(null,"FIM DO JOGO!");	
			limp.limpar();

			//iniciar uma nova partida se for o computador a jogar
			padraojogadas.Jogadas();
		}
	}
}
