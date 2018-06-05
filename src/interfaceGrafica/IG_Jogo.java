package interfaceGrafica;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.CO_Jogo;
import modelo.MO_Perguntas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


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
		
		CO_Jogo COJ = new CO_Jogo();
		JLabel lblPergunta = new JLabel(MO_Perguntas.categoriaGame.get(COJ.selecionaPergunta()).getPergunta());
		lblPergunta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPergunta.setBounds(80, 53, 531, 32);
		pnPrincipal.add(lblPergunta);
		
		JLabel lblAlternativaA = new JLabel();
		lblAlternativaA.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaA.setBounds(80, 124, 531, 32);
		pnPrincipal.add(lblAlternativaA);
		
		JLabel lblAlternativaB = new JLabel();
		lblAlternativaB.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaB.setBounds(80, 172, 531, 32);
		pnPrincipal.add(lblAlternativaB);
		
		JLabel lblAlternativaC = new JLabel();
		lblAlternativaC.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaC.setBounds(80, 220, 531, 32);
		pnPrincipal.add(lblAlternativaC);
		
		JLabel lblAlternativaD = new JLabel();
		lblAlternativaD.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaD.setBounds(80, 268, 531, 32);
		pnPrincipal.add(lblAlternativaD);
		
		
		//Botão [Jogar]
		JButton btnPular = new JButton("PULAR");
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPular.setBounds(308, 449, 128, 38);
		pnPrincipal.add(btnPular);
		
		//Botão [Confirmar]
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				CO_Jogo COJ = new CO_Jogo();
				lblPergunta.setText(MO_Perguntas.categoriaGame.get(COJ.selecionaPergunta()).getPergunta());
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmar.setBounds(45, 449, 148, 38);
		pnPrincipal.add(btnConfirmar);
		
	
		
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAjuda.setBounds(451, 449, 128, 38);
		pnPrincipal.add(btnAjuda);
	}
}
