package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.CO_Jogo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IG_TelaInicial extends JFrame {

	private JPanel pnPrincipal;
	private JTextField txtJogador;



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
		
		JLabel lblJogador = new JLabel("Digite seu nome");
		lblJogador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJogador.setBounds(70, 247, 149, 32);
		pnPrincipal.add(lblJogador);
		
		txtJogador = new JTextField();
		txtJogador.setBounds(80, 278, 128, 32);
		pnPrincipal.add(txtJogador);
		txtJogador.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCategoria.setBounds(70, 331, 149, 32);
		pnPrincipal.add(lblCategoria);
		
		JComboBox<String> comboPerguntas = new JComboBox<>();
		comboPerguntas.setBounds(80, 366, 128, 38);
		pnPrincipal.add(comboPerguntas);
		comboPerguntas.addItem("Categoria");
		comboPerguntas.addItem("Games");
		comboPerguntas.addItem("Esportes");
		comboPerguntas.addItem("Musica");
		
		
		//Botão [Jogar]
		JButton btnJogar = new JButton("JOGAR");
		btnJogar.addMouseListener(new MouseAdapter() {
			
			//Ação do botão [Clique / Jogar]
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Pegar os valores
				String nomeUsuario = txtJogador.getText();
				String categoria = comboPerguntas.getSelectedItem().toString();
				
				//Instanciar [Classe: codigo / Classe: CO_TelaInicial]
				CO_Jogo COJ = new CO_Jogo();
				COJ.validarAcesso(nomeUsuario, categoria);
				
	
				
				
			}
		});
		
		btnJogar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnJogar.setBounds(80, 449, 128, 38);
		pnPrincipal.add(btnJogar);
	}
}
