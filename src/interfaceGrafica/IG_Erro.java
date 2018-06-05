package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.CO_Jogo;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IG_Erro extends JFrame {

	private JPanel pnlErro;


	/**
	 * Create the frame.
	 */
	public IG_Erro() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 189);
		pnlErro = new JPanel();
		pnlErro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlErro);
		setLocationRelativeTo(null);
		pnlErro.setLayout(null);
		
		//Mensagem de erro
		JLabel lblErro = new JLabel("Ocorreu algum erro");
		lblErro.setOpaque(true);
		lblErro.setBackground(Color.DARK_GRAY);
		lblErro.setForeground(Color.WHITE);
		lblErro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblErro.setBounds(0, 0, 450, 26);
		pnlErro.add(lblErro);
		
		JLabel lblMensagemErro = new JLabel(CO_Jogo.mensagemErro);
		lblMensagemErro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagemErro.setBounds(10, 81, 430, 26);
		pnlErro.add(lblMensagemErro);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnSair.setBackground(Color.DARK_GRAY);
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSair.setBounds(159, 134, 131, 44);
		pnlErro.add(btnSair);
	}

}
