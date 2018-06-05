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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IG_Jogo extends JFrame {

	private JPanel pnPrincipal;



	/**
	 * Create the frame.
	 */
	public IG_Jogo() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 530);
		pnPrincipal = new JPanel();
		pnPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnPrincipal);
		setLocationRelativeTo(null);
		pnPrincipal.setLayout(null);
		
		JLabel lblPergunta = new JLabel("Qual a capital de S\u00E3o Paulo?");
		lblPergunta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPergunta.setBounds(80, 53, 531, 32);
		pnPrincipal.add(lblPergunta);
		
		JLabel lblAlternativaA = new JLabel("Blumenau");
		lblAlternativaA.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaA.setBounds(80, 124, 531, 32);
		pnPrincipal.add(lblAlternativaA);
		
		JLabel lblAlternativaB = new JLabel("Blumenau");
		lblAlternativaB.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaB.setBounds(80, 172, 531, 32);
		pnPrincipal.add(lblAlternativaB);
		
		JLabel lblAlternativaC = new JLabel("Blumenau");
		lblAlternativaC.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaC.setBounds(80, 220, 531, 32);
		pnPrincipal.add(lblAlternativaC);
		
		JLabel lblAlternativaD = new JLabel("Blumenau");
		lblAlternativaD.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaD.setBounds(80, 268, 531, 32);
		pnPrincipal.add(lblAlternativaD);
		
		
		//Botão [Jogar]
		JButton btnPular = new JButton("PULAR");
		btnPular.addMouseListener(new MouseAdapter() {
			
			//Ação do botão [Clique / Jogar]
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Pegar os valores
				String nomeUsuario = txtJogador.getText();
				String categoria = comboPerguntas.getSelectedItem().toString();
				
				//Instanciar [Classe: codigo / Classe: CO_TelaInicial]
				CO_Jogo COT = new CO_Jogo();
				COT.validaAcesso(nomeUsuario, categoria);
				
			}
		});
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmar.setBounds(45, 449, 148, 38);
		pnPrincipal.add(btnConfirmar);
		
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPular.setBounds(308, 449, 128, 38);
		pnPrincipal.add(btnPular);
		
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAjuda.setBounds(451, 449, 128, 38);
		pnPrincipal.add(btnAjuda);
	}
}
