package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.JogoDaVelha;
import modulos.PadraoJogadas;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	JogoDaVelha jogodavelha = new JogoDaVelha();
	PadraoJogadas padraojogadas = new PadraoJogadas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
				);
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 0, 0));

		JButton btnJogadorVs = new JButton("Jogador 1     VS     Jogador 2");
		btnJogadorVs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jogodavelha.computador = false;
				jogodavelha.labelJogador2.setText("Jogador 2");
				jogodavelha.sort.SorteaJogador();
				jogodavelha.jogador = jogodavelha.sort.random;

				System.out.println("Jogador: "+jogodavelha.jogador);

				if(jogodavelha.jogador=="1") 
					jogodavelha.labelJogador1.setForeground(Color.red);
				else
					jogodavelha.labelJogador1.setForeground(Color.black);

				if(jogodavelha.jogador=="2") 
					jogodavelha.labelJogador2.setForeground(Color.red);
				else
					jogodavelha.labelJogador2.setForeground(Color.black);

				jogodavelha.setVisible(true); 

			}
		});
		btnJogadorVs.setFont(new Font("Arial", Font.BOLD, 26));
		panel.add(btnJogadorVs);

		JButton btnNewButton = new JButton("Jogador 1     VS     Computador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ativar as jogadas automaticas
				jogodavelha.computador = true;
				//modificar o nome
				jogodavelha.labelJogador2.setText("Computador");
				//sortear a vez do computador
				jogodavelha.sort.SorteaJogador();
				jogodavelha.jogador = jogodavelha.sort.random;

				padraojogadas.Jogadas();

				//mudar cor jogador 1
				if(jogodavelha.jogador=="1") 
					jogodavelha.labelJogador1.setForeground(Color.red);
				else
					jogodavelha.labelJogador1.setForeground(Color.black);
				//mudar cor jogador 2
				if(jogodavelha.jogador=="2") 
					jogodavelha.labelJogador2.setForeground(Color.red);
				else
					jogodavelha.labelJogador2.setForeground(Color.black);

				//exibir o formulario
				jogodavelha.setLocationRelativeTo(null);
				jogodavelha.setVisible(true);
				dispose();
			}
		});		
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 26));
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(20);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setVgap(20);
		contentPane.add(panel_2, BorderLayout.NORTH);
	}

}

