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
import java.util.Random;

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
		
		JLabel lblAjudaA = new JLabel("");
		lblAjudaA.setVisible(false);
		lblAjudaA.setIcon(new ImageIcon(getClass().getResource("/Ajuda.jpg")));
		lblAjudaA.setBounds(20, 151, 40, 40);
		pnPrincipal.add(lblAjudaA);
		
		JLabel lblAjudaB = new JLabel("");
		lblAjudaB.setVisible(false);
		lblAjudaB.setIcon(new ImageIcon(getClass().getResource("/Ajuda.jpg")));
		lblAjudaB.setBounds(20, 222, 40, 40);
		pnPrincipal.add(lblAjudaB);
		
		JLabel lblAjudaC = new JLabel("");
		lblAjudaC.setVisible(false);
		lblAjudaC.setIcon(new ImageIcon(getClass().getResource("/Ajuda.jpg")));
		lblAjudaC.setBounds(20, 293, 40, 40);
		pnPrincipal.add(lblAjudaC);
		
		JLabel lblAjudaD = new JLabel("");
		lblAjudaD.setVisible(false);
		lblAjudaD.setIcon(new ImageIcon(getClass().getResource("/Ajuda.jpg")));
		lblAjudaD.setBounds(20, 364, 40, 40);
		pnPrincipal.add(lblAjudaD);
		
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
		
		//Bot�o [Alternativa A]
		JLabel lblBotaoA = new JLabel("");
		lblBotaoA.setBounds(20, 151, 40, 40);
		pnPrincipal.add(lblBotaoA);
		
		//Label bot�o [Alternativa A]
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
		
		//Bot�o [Alternativa B]
		JLabel lblBotaoB = new JLabel("");
		lblBotaoB.setBounds(20, 222, 40, 40);
		pnPrincipal.add(lblBotaoB);
		
		//Label bot�o [Alternativa B]
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
		
		//Bot�o [Alternativa C]
		JLabel lblBotaoC = new JLabel("");
		lblBotaoC.setBounds(20, 293, 40, 40);
		pnPrincipal.add(lblBotaoC);
		
		//Label bot�o [Alternativa C]
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
		
		//Bot�o [Alternativa D]
		JLabel lblBotaoD = new JLabel("");
		lblBotaoD.setBounds(20, 364, 40, 40);
		pnPrincipal.add(lblBotaoD);
		
		//Label bot�o [Alternativa D]
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
		

				
		//Bot�o [Ajuda]
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAjuda.setBounds(451, 449, 128, 38);
		pnPrincipal.add(btnAjuda);
		btnAjuda.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Gerando n�mero randomico
				Random ajuda = new Random();
				int rndAjuda = ajuda.nextInt(4);
				
				if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'A' && rndAjuda == 0) {
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'B' && rndAjuda == 0) {
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'C' && rndAjuda == 0) {
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'D' && rndAjuda == 0) {
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'A' && rndAjuda == 2) {
					lblAjudaB.setVisible(true);
					lblAjudaC.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'A' && rndAjuda == 3) {
					lblAjudaB.setVisible(true);
					lblAjudaC.setVisible(true);
					lblAjudaD.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'B' && rndAjuda == 1) {
					lblAjudaA.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'B' && rndAjuda == 2) {
					lblAjudaA.setVisible(true);
					lblAjudaC.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'B' && rndAjuda == 3) {
					lblAjudaA.setVisible(true);
					lblAjudaC.setVisible(true);
					lblAjudaD.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'C' && rndAjuda == 1) {
					lblAjudaA.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'C' && rndAjuda == 2) {
					lblAjudaA.setVisible(true);
					lblAjudaB.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'C' && rndAjuda == 3) {
					lblAjudaA.setVisible(true);
					lblAjudaB.setVisible(true);
					lblAjudaD.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'D' && rndAjuda == 1) {
					lblAjudaA.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'D' && rndAjuda == 2) {
					lblAjudaA.setVisible(true);
					lblAjudaB.setVisible(true);
					
				}else if(MO_Perguntas.categoriaEscolhida.get(contador).getResposta() == 'D' && rndAjuda == 3) {
					lblAjudaA.setVisible(true);
					lblAjudaB.setVisible(true);
					lblAjudaC.setVisible(true);
					
				}
				
				
				
				//Setar os cogumelos como n�o visiveis
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
				
				btnAjuda.setVisible(false);
			}
		});
		

		
		
		//Bot�o [Pular]
		JButton btnPular = new JButton("PULAR");
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPular.setBounds(308, 449, 128, 38);
		pnPrincipal.add(btnPular);
		
		//Fun��o bot�o [Pular]
		btnPular.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Setar os cogumelos como n�o visiveis
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
				
				//Contador para pegar os valores randomicos da ArrayList em sequencia
				contadorPulos++;

				
				//Alterar o texto dos labels, conforme o n�mero randomico da ArrayList
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
		
		
		//Bot�o [Confirmar]
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmar.setBounds(45, 449, 148, 38);
		pnPrincipal.add(btnConfirmar);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(getClass().getResource("/BG_Principal.jpg")));
		Background.setBounds(0, 0, 680, 530);
		pnPrincipal.add(Background);
		
		//Fun��o bot�o
		btnConfirmar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {

				
				
				
				//Erro 1 - Caso usuario n�o selecione uma quest�o
				if(CO_Jogo.alternativaEscolhida == 'E'){
					CO_Jogo.erroJogo = 1;
					CO_Jogo.mensagemErro ="Selecione uma das alternativas";
						IG_Erro IGE = new IG_Erro();
							IGE.setVisible(true);
				}
				
				//Caso n�o haja erro, rodar� o sistema
				if(CO_Jogo.erroJogo == 0){
					
				//Setar os cogumelos como n�o visiveis
				lblCogumeloA.setVisible(false);
				lblCogumeloB.setVisible(false);
				lblCogumeloC.setVisible(false);
				lblCogumeloD.setVisible(false);
					
				//Contador para pegar os valores randomicos da ArrayList em sequencia
				contador++;
				int indice = MO_Perguntas.guardaPergunta.get(contador);
				
				//Contador de pulo
				contadorPulos = contador;
			
				//Alterar o texto dos labels, conforme o n�mero randomico da ArrayList
				lblPergunta.setText(MO_Perguntas.categoriaEscolhida.get(indice).getPergunta());
				lblAlternativaA.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaA());
				lblAlternativaB.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaB());
				lblAlternativaC.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaC());
				lblAlternativaD.setText(MO_Perguntas.categoriaEscolhida.get(indice).getAlternativaD());
				
				
				//Gravar pontua��o do jogo
				if(CO_Jogo.alternativaEscolhida == MO_Perguntas.categoriaEscolhida.get(indice).getResposta()){
					acertos++;
					
				}
			
				
				//Fechar as opcoes quando chegar as 10 quest�es
				if(contador == 10){
					
					//Guardar pontua��o
					MO_Players MOP = new MO_Players();
					MOP.setNomePlayer(jogador);
					MOP.setAcertosPlayer(acertos);
					MO_Players.Players.add(MOP);
						
					//Abrindo componente do resultado
					dispose();
					IG_Ranking IGR = new IG_Ranking();
					IGR.setVisible(true);
					

				}
				
				}
				
				//Deixando variaveis no valor padr�o
				CO_Jogo.alternativaEscolhida = 'E';
				CO_Jogo.erroJogo = 0;
			}
		});

		
	}
}
