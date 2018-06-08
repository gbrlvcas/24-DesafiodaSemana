package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.CO_Jogo;
import modelo.MO_Perguntas;
import modelo.MO_Players;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class IG_TelaInicial extends JFrame {

	private JPanel pnPrincipal;
	private JTextField txtJogador;
//


	/**
	 * Create the frame.
	 */
	public IG_TelaInicial() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 530);
		pnPrincipal = new JPanel();
		pnPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnPrincipal);
		setLocationRelativeTo(null);
		pnPrincipal.setLayout(null);
		
		txtJogador = new JTextField();
		txtJogador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtJogador.setBorder(null);
		txtJogador.setBackground(new Color(255, 255, 255));
		txtJogador.setBounds(310, 103, 128, 32);
		pnPrincipal.add(txtJogador);
		txtJogador.setColumns(10);
		
		JComboBox<String> comboPerguntas = new JComboBox<>();
		comboPerguntas.setBorder(null);
		comboPerguntas.setBounds(310, 213, 128, 38);
		pnPrincipal.add(comboPerguntas);
		comboPerguntas.addItem("Categoria");
		comboPerguntas.addItem("Games");
		comboPerguntas.addItem("Proway");
		comboPerguntas.addItem("Musica");
		
		
		//Botão [Jogar]
		JLabel btnJogar = new JLabel("");
		btnJogar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnJogar.setBounds(314, 266, 119, 38);
		pnPrincipal.add(btnJogar);
		
		//Botão [Jogar]
		btnJogar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Zerar o vetor caso haja algo cadastrado
				MO_Perguntas.guardaPergunta.clear();
				MO_Perguntas.categoriaEscolhida.clear();
				MO_Perguntas.categoriaGame.clear();
				MO_Perguntas.categoriaMusica.clear();
				MO_Perguntas.categoriaProway.clear();
				
				
				//Pegar os valores
				String nomePlayer = txtJogador.getText();
				String categoria = comboPerguntas.getSelectedItem().toString();
				
				//Instanciar [Classe: codigo / Classe: CO_TelaInicial]
				CO_Jogo COJ = new CO_Jogo();
				COJ.iniciarJogo(nomePlayer, categoria);
				if(COJ.erroLogin == 0) {
				dispose();
				}
			}
		});
		
		//Botão [Ranking]
		JLabel btnRanking = new JLabel("");
		btnRanking.setBounds(340, 430, 69, 84);
		pnPrincipal.add(btnRanking);
		btnRanking.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(MO_Players.Players.isEmpty()) {
					CO_Jogo.mensagemErro = "Deve haver um jogador no rank";
					IG_Erro IGE = new IG_Erro();
					IGE.setVisible(true);
					
				}else {
				IG_Ranking IGR = new IG_Ranking();
				IGR.setVisible(true);
				dispose();
				}
			}
		});

		

		
		

		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon(getClass().getResource("/BG_TelaInicial3.jpg")));
		lblBackGround.setBounds(0, 0, 680, 530);
		pnPrincipal.add(lblBackGround);
	}
}
