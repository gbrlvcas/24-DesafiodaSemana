package interfaceGrafica;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import codigo.CO_Ranking;
import modelo.MO_Players;


public class IG_Ranking extends JFrame {

	private JPanel pnPrincipal;




	
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
		

		
		JLabel lblPrimeiro = new JLabel();
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
		
		//Adicionar ao rankink
		if(MO_Players.Players.size() == 1){
			lblPrimeiro.setText(MO_Players.Players.get(0).getNomePlayer());
			
		}else if(MO_Players.Players.size() == 2){

			lblPrimeiro.setText(MO_Players.Players.get(0).getNomePlayer());
			lblSegundo.setText(MO_Players.Players.get(1).getNomePlayer());
			
			
		}else if(MO_Players.Players.size() == 3){

			lblPrimeiro.setText(MO_Players.Players.get(0).getNomePlayer());
			lblSegundo.setText(MO_Players.Players.get(1).getNomePlayer());
			lblTerceiro.setText(MO_Players.Players.get(2).getNomePlayer());
			
		}
		
		
		
		
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBackground.setIcon(new ImageIcon(getClass().getResource("/BG_Ranking2.jpg")));
		lblBackground.setBounds(0, 0, 680, 530);
		pnPrincipal.add(lblBackground);
	}
}
