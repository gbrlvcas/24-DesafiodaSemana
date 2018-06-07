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
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;


public class IG_Ranking extends JFrame {

	private JPanel pnPrincipal;

//

	
	//Interface Grafica do Jogo
	public IG_Ranking() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 530);
		pnPrincipal = new JPanel();
		pnPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnPrincipal);
		setLocationRelativeTo(null);
		pnPrincipal.setLayout(null);
		
		//Nome do jogador atual
		JLabel lblNome = new JLabel(IG_Jogo.jogador);
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setForeground(new Color(255, 255, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBounds(73, 70, 195, 26);
		pnPrincipal.add(lblNome);
		
		//Pontuação do jogador atual
		JLabel lblPontos = new JLabel(String.valueOf(IG_Jogo.acertos));
		lblPontos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPontos.setForeground(Color.YELLOW);
		lblPontos.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPontos.setBounds(73, 95, 195, 54);
		pnPrincipal.add(lblPontos);
		
		JLabel lblSair = new JLabel("");
		lblSair.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				IG_TelaInicial IGT = new IG_TelaInicial();
				IGT.setVisible(true);
			}
		});
		lblSair.setBounds(288, 415, 147, 54);
		pnPrincipal.add(lblSair);
		
		JLabel lblPrimeiro = new JLabel("");
		lblPrimeiro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrimeiro.setForeground(new Color(255, 255, 0));
		lblPrimeiro.setBounds(363, 210, 160, 26);
		pnPrincipal.add(lblPrimeiro);
		
		JLabel lblSegundo = new JLabel("");
		lblSegundo.setForeground(Color.YELLOW);
		lblSegundo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSegundo.setBounds(363, 253, 160, 26);
		pnPrincipal.add(lblSegundo);
		
		JLabel lblTerceiro = new JLabel("");
		lblTerceiro.setForeground(Color.YELLOW);
		lblTerceiro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTerceiro.setBounds(363, 296, 160, 26);
		pnPrincipal.add(lblTerceiro);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\24-DesafiodaSemana\\resources\\BG_Ranking2.jpg"));
		lblBackground.setBounds(0, 0, 680, 530);
		pnPrincipal.add(lblBackground);
	}
}
