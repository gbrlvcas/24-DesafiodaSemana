package interfaceGrafica;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.CO_Jogo;
import modelo.MO_Perguntas;
import modelo.MO_Players;

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


public class IG_Jogo extends JFrame {

	private JPanel pnPrincipal;
	
	//Variaveis estaticas
	public static int contador = 0;
	public static int contaPulos = 0;
	public static int contadorPulos = 0;
	public static String jogador = "";
	public static int acertos = 0;
	public static int indice = MO_Perguntas.guardaPergunta.get(contador);

	
	//Interface Grafica do Jogo
	public IG_Jogo() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 530);
		pnPrincipal = new JPanel();

		pnPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnPrincipal);
		setLocationRelativeTo(null);
		pnPrincipal.setLayout(null);
		
		JLabel lblCogumeloA = new JLabel("");
		lblCogumeloA.setVisible(false);
		lblCogumeloA.setIcon(new ImageIcon(getClass().getResource("/Cogumelo.png")));
		lblCogumeloA.setBounds(25, 120, 30, 30);
		pnPrincipal.add(lblCogumeloA);
		
		JLabel lblCogumeloB = new JLabel("");
		lblCogumeloB.setVisible(false);
		lblCogumeloB.setIcon(new ImageIcon(getClass().getResource("/Cogumelo.png")));
		lblCogumeloB.setBounds(25, 192, 30, 30);
		pnPrincipal.add(lblCogumeloB);
		
		JLabel lblCogumeloC = new JLabel("");
		lblCogumeloC.setVisible(false);
		lblCogumeloC.setIcon(new ImageIcon(getClass().getResource("/Cogumelo.png")));
		lblCogumeloC.setBounds(25, 265, 30, 30);
		pnPrincipal.add(lblCogumeloC);
		
		JLabel lblCogumeloD = new JLabel("");
		lblCogumeloD.setVisible(false);
		lblCogumeloD.setIcon(new ImageIcon(getClass().getResource("/Cogumelo.png")));
		lblCogumeloD.setBounds(25, 337, 30, 30);
		pnPrincipal.add(lblCogumeloD);
		
		//Pergunta
		JLabel lblPergunta = new JLabel(MO_Perguntas.categoriaEscolhida.get(indice).getPergunta());
		lblPergunta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPergunta.setBounds(80, 40, 531, 32);
		pnPrincipal.add(lblPergunta);
		
		//Alternativa A
		JLabel lblAlternativaA = new JLabel();
		lblAlternativaA.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaA());
		lblAlternativaA.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAlternativaA.setBounds(80, 151, 531, 32);
		pnPrincipal.add(lblAlternativaA);
		
		//Botão [Alternativa A]
		JLabel lblBotaoA = new JLabel("");
		lblBotaoA.setBounds(20, 151, 40, 40);
		pnPrincipal.add(lblBotaoA);
		
		//Label botão [Alternativa A]
		lblBotaoA.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				lblCogumeloA.setVisible(true);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
				
				CO_Jogo.alternativaEscolhida = 'A';
				

			}
		});
	
		//Alternativa B
		JLabel lblAlternativaB = new JLabel();
		lblAlternativaB.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaB());
		lblAlternativaB.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaB.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAlternativaB.setBounds(80, 230, 531, 32);
		pnPrincipal.add(lblAlternativaB);
		
		//Botão [Alternativa B]
		JLabel lblBotaoB = new JLabel("");
		lblBotaoB.setBounds(20, 222, 40, 40);
		pnPrincipal.add(lblBotaoB);
		
		//Label botão [Alternativa B]
		lblBotaoB.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblCogumeloB.setVisible(true);
				lblCogumeloA.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
				
				CO_Jogo.alternativaEscolhida = 'B';
				

				
			}
		});
		
		//Alternativa C
		JLabel lblAlternativaC = new JLabel(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaC());
		lblAlternativaC.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaC.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAlternativaC.setBounds(80, 301, 531, 32);
		pnPrincipal.add(lblAlternativaC);
		
		//Botão [Alternativa C]
		JLabel lblBotaoC = new JLabel("");
		lblBotaoC.setBounds(20, 293, 40, 40);
		pnPrincipal.add(lblBotaoC);
		
		//Label botão [Alternativa C]
		lblBotaoC.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblCogumeloC.setVisible(true);
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloD.setVisible(false);
				
				CO_Jogo.alternativaEscolhida = 'C';
				
				
				
			}
		});
		
		//Alternativa D
		JLabel lblAlternativaD = new JLabel(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaD());
		lblAlternativaD.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaD.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAlternativaD.setBounds(80, 372, 531, 32);
		pnPrincipal.add(lblAlternativaD);
		
		//Botão [Alternativa D]
		JLabel lblBotaoD = new JLabel("");
		lblBotaoD.setBounds(20, 364, 40, 40);
		pnPrincipal.add(lblBotaoD);
		
		//Label botão [Alternativa D]
		lblBotaoD.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblCogumeloD.setVisible(true);
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				
				CO_Jogo.alternativaEscolhida = 'D';

				
			}
		});
		

				
		//Botão [Ajuda]
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAjuda.setBounds(451, 449, 128, 38);
		pnPrincipal.add(btnAjuda);
		btnAjuda.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Setar os cogumelos como não visiveis
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
			}
		});
		

		
		
		//Botão [Pular]
		JButton btnPular = new JButton("PULAR");
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPular.setBounds(308, 449, 128, 38);
		pnPrincipal.add(btnPular);
		
		//Função botão [Pular
		btnPular.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Setar os cogumelos como não visiveis
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
				
				//Contador para pegar os valores randomicos da ArrayList em sequencia
				contadorPulos++;

				
				//Alterar o texto dos labels, conforme o número randomico da ArrayList
				lblPergunta.setText(MO_Perguntas.categoriaEscolhida.get(contadorPulos).getPergunta());
				lblAlternativaA.setText(MO_Perguntas.categoriaEscolhida.get(contadorPulos).getAlternativaA());
				lblAlternativaB.setText(MO_Perguntas.categoriaEscolhida.get(contadorPulos).getAlternativaB());
				lblAlternativaC.setText(MO_Perguntas.categoriaEscolhida.get(contadorPulos).getAlternativaC());
				lblAlternativaD.setText(MO_Perguntas.categoriaEscolhida.get(contadorPulos).getAlternativaD());
				
				
				//Contar 3 pulos
				contaPulos++;
				if(contaPulos == 3) {
					btnPular.setVisible(false);
				}
				
				
			}
		});
		
		
		//Botão [Confirmar]
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmar.setBounds(45, 449, 148, 38);
		pnPrincipal.add(btnConfirmar);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(getClass().getResource("/BG_Principal.jpg")));
		Background.setBounds(0, 0, 680, 530);
		pnPrincipal.add(Background);
		
		//Função botão
		btnConfirmar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {

				
				
				
				//Erro 1 - Caso usuario não selecione uma questão
				if(CO_Jogo.alternativaEscolhida == 'E'){
					CO_Jogo.erroJogo = 1;
					CO_Jogo.mensagemErro ="Selecione uma das alternativas";
						IG_Erro IGE = new IG_Erro();
							IGE.setVisible(true);
				}
				
				//Caso não haja erro, rodará o sistema
				if(CO_Jogo.erroJogo == 0){
					
				//Setar os cogumelos como não visiveis
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
					
				//Contador para pegar os valores randomicos da ArrayList em sequencia
				contador++;
				int indice = MO_Perguntas.guardaPergunta.get(contador);
				
				//Contador de pulo
				contadorPulos = contador;
			
				//Alterar o texto dos labels, conforme o número randomico da ArrayList
				lblPergunta.setText(MO_Perguntas.categoriaEscolhida.get(indice).getPergunta());
				lblAlternativaA.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaA());
				lblAlternativaB.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaB());
				lblAlternativaC.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaC());
				lblAlternativaD.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaD());
				
				
				//Gravar pontuação do jogo
				if(CO_Jogo.alternativaEscolhida == MO_Perguntas.categoriaEscolhida.get(indice).getResposta()){
					acertos++;
					
				}
			
				
				//Fechar as opcoes quando chegar as 10 questões
				if(contador == 10){
					
					//Guardar pontuação
					MO_Players MOP = new MO_Players();
					MOP.setNomePlayer(jogador);
					MOP.setAcertosPlayer(acertos);
					MO_Players.Players.add(MOP);
						
					//Desativando os componentes
					lblPergunta.setVisible(false);
					lblBotaoA.setVisible(false);
					lblBotaoB.setVisible(false);
					lblBotaoC.setVisible(false);
					lblBotaoD.setVisible(false);
					lblAlternativaA.setVisible(false);
					lblAlternativaB.setVisible(false);
					lblAlternativaC.setVisible(false);
					lblAlternativaD.setVisible(false);
					btnConfirmar.setVisible(false);
					btnAjuda.setVisible(false);
					btnPular.setVisible(false);
				}
				
				}
				
				//Deixando variaveis no valor padrão
				CO_Jogo.alternativaEscolhida = 'E';
				CO_Jogo.erroJogo = 0;
			}
		});
		
		//Alternativa selecionada
		pnPrincipal.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				if(CO_Jogo.alternativaEscolhida == 'D') {
					lblBotaoD.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaD_ESCOLHIDA.jpg")));
					lblBotaoA.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaA_NORMAL.jpg")));
					lblBotaoB.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaC_NORMAL.jpg")));
					lblBotaoC.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaD_NORMAL.jpg")));
				}
				
				
			}
		});
		
	}
}
