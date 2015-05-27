package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
import modulos.*;

public class JogoDaVelha extends JFrame {

	/*declaração de atributos*/
	private JPanel contentPane;
	public static String jogador;
	public static Boolean computador = false;
	public static JButton campo1;
	public static JButton campo2;
	public static JButton campo3;
	public static JButton campo4;
	public static JButton campo5;
	public static JButton campo6;
	public static JButton campo7;
	public static JButton campo8;
	public static JButton campo9;
	ArrayList<String> matrizjogo;
	GerarMatriz g = new GerarMatriz();
	PadraoJogadas padraojogadas = new PadraoJogadas();
	Resultados resultados = new Resultados();
	Color cor = Color.green;
	private JButton btnLimpr;
	public static JLabel labelJogador2;
	public static JLabel labelJogador1;
	public static SortearJogador sort = new SortearJogador();


	public static void main(String[] args) {

		sort.SorteaJogador();
		jogador = sort.random;

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDaVelha frame = new JogoDaVelha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JogoDaVelha() {
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 422);

		//criação do container principal da janela
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);

		//criação do panel	
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(178, 34, 34));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 5, 5));

		//criação do panel de informação de jogadores
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(1);
		contentPane.add(panel_1, BorderLayout.NORTH);

		//criação do label jogador 1
		labelJogador1 = new JLabel("Jogador 1");
		labelJogador1.setFont(new Font("Arial", Font.BOLD, 26));
		if(jogador=="1") 
			labelJogador1.setForeground(Color.red);
		else
			labelJogador1.setForeground(Color.blue);
		panel_1.add(labelJogador1);

		//criação do label vs
		JLabel vs = new JLabel("        VS        ");
		vs.setFont(new Font("Arial", Font.BOLD, 26));
		panel_1.add(vs);

		//criação do label jogador 2
		labelJogador2 = new JLabel("Jogador 2");
		labelJogador2.setFont(new Font("Arial", Font.BOLD, 26));
		if(jogador=="2") 
			labelJogador2.setForeground(Color.red);
		else
			labelJogador2.setForeground(Color.black);
		panel_1.add(labelJogador2);

		//criação do campo1
		campo1 = new JButton("");
		campo1.setForeground(Color.BLUE);
		campo1.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo1.setBackground(new Color(240, 230, 140));
		panel.add(campo1);

		//ação ao clicar
		campo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	

				if(campo1.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo1.setText("X");
						campo1.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo1.setText("O");
						campo1.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/* aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();
				}
			}
		}
				);		

		//criação do campo2
		campo2 = new JButton("");
		campo2.setForeground(Color.BLUE);
		campo2.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo2.setBackground(new Color(240, 230, 140));
		panel.add(campo2);

		//ação ao clicar
		campo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo2.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo2.setText("X");
						campo2.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo2.setText("O");
						campo2.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}

			}
		}
				);

		//criação do campo 3
		campo3 = new JButton("");
		campo3.setForeground(Color.BLUE);
		campo3.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo3.setBackground(new Color(240, 230, 140));
		panel.add(campo3);

		//ação ao clicar
		campo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo3.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo3.setText("X");
						campo3.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo3.setText("O");
						campo3.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}

			}
		}
				);


		//campo4
		campo4 = new JButton("");
		campo4.setForeground(Color.BLUE);
		campo4.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo4.setBackground(new Color(240, 230, 140));
		panel.add(campo4);

		//ação ao clicar
		campo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo4.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo4.setText("X");
						campo4.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);
					}
					else{
						jogador="1";
						campo4.setText("O");
						campo4.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}

			}
		}
				);

		//criação do campo 5
		campo5 = new JButton("");
		campo5.setForeground(Color.BLUE);
		campo5.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo5.setBackground(new Color(240, 230, 140));
		panel.add(campo5);

		//ação ao clicar
		campo5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo5.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo5.setText("X");
						campo5.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);
					}
					else{
						jogador="1";
						campo5.setText("O");
						campo5.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}
			}
		}
				);

		//campo6
		campo6 = new JButton("");
		campo6.setForeground(Color.BLUE);
		campo6.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo6.setBackground(new Color(240, 230, 140));
		panel.add(campo6);

		//ação ao clicar
		campo6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo6.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo6.setText("X");
						campo6.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo6.setText("O");
						campo6.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}
			}
		}
				);


		//campo7
		campo7 = new JButton("");
		campo7.setForeground(Color.BLUE);
		campo7.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo7.setBackground(new Color(240, 230, 140));
		panel.add(campo7);

		//ação ao clicar
		campo7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo7.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo7.setText("X");
						campo7.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo7.setText("O");
						campo7.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}
			}
		}
				);

		//campo8
		campo8 = new JButton("");
		campo8.setForeground(Color.BLUE);
		campo8.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo8.setBackground(new Color(240, 230, 140));
		panel.add(campo8);

		//ação ao clicar
		campo8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo8.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo8.setText("X");
						campo8.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo8.setText("O");
						campo8.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada */			
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();	
				}
			}
		}
				);


		//campo9
		campo9 = new JButton("");
		campo9.setForeground(Color.BLUE);
		campo9.setFont(new Font("Arial blue", Font.BOLD, 99));
		campo9.setBackground(new Color(240, 230, 140));
		panel.add(campo9);
		//ação ao clicar	
		campo9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(campo9.getText() == ""){	
					if(jogador=="1") {			
						jogador="2";
						campo9.setText("X");
						campo9.setForeground(Color.red);
						labelJogador1.setForeground(Color.blue);
						labelJogador2.setForeground(Color.red);	
					}
					else{
						jogador="1";
						campo9.setText("O");
						campo9.setForeground(Color.blue);
						labelJogador1.setForeground(Color.red);
						labelJogador2.setForeground(Color.blue);
					}

					/*aplica uma jogada*/
					padraojogadas.Jogadas();
					/*verificar resultado*/
					resultados.resultado();		
				}
			}
		}
				);	

		btnLimpr = new JButton("Matriz");
		btnLimpr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				g.GeraMatriz();
				System.out.println("");
				System.out.println("matriz base: "+g.matriz);
				System.out.println("jogador: "+jogador);	
			}
		});
		contentPane.add(btnLimpr, BorderLayout.SOUTH);
	}
}