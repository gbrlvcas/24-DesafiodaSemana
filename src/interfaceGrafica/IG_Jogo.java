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

//

	
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
		
		JLabel lblImgPergunta = new JLabel("New label");
		lblImgPergunta.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/Pergunta.jpg")));
		lblImgPergunta.setBounds(10, 53, 40, 40);
		pnPrincipal.add(lblImgPergunta);
		
		//Pergunta
		JLabel lblPergunta = new JLabel(MO_Perguntas.categoriaGame.get(0).getPergunta());
		lblPergunta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPergunta.setBounds(80, 53, 531, 32);
		pnPrincipal.add(lblPergunta);
		
		//Alternativa A
		JLabel lblAlternativaA = new JLabel();
		lblAlternativaA.setText(MO_Perguntas.categoriaGame.get(0).getAlternativaA());
		lblAlternativaA.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaA.setBounds(80, 126, 531, 32);
		pnPrincipal.add(lblAlternativaA);
		
		//Botão [Alternativa A]
		JLabel lblBotaoA = new JLabel("New label");
		lblBotaoA.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaA_NORMAL.jpg")));
		lblBotaoA.setBounds(10, 124, 40, 40);
		pnPrincipal.add(lblBotaoA);
		
		//Label botão [Alternativa A]
		lblBotaoA.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {

				CO_Jogo.alternativaEscolhida = 'A';
				
				lblBotaoA.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaA_ESCOLHIDA.jpg")));
				
				
				
				
			}
		});
	
		//Alternativa B
		JLabel lblAlternativaB = new JLabel();
		lblAlternativaB.setText(MO_Perguntas.categoriaGame.get(0).getAlternativaB());
		lblAlternativaB.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaB.setBounds(80, 193, 531, 32);
		pnPrincipal.add(lblAlternativaB);
		
		//Botão [Alternativa B]
		JLabel lblBotaoB = new JLabel("New label");
		lblBotaoB.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaB_NORMAL.jpg")));
		lblBotaoB.setBounds(10, 191, 40, 40);
		pnPrincipal.add(lblBotaoB);
		
		//Label botão [Alternativa B]
		lblBotaoB.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				CO_Jogo.alternativaEscolhida = 'B';
				
				lblBotaoB.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaB_ESCOLHIDA.jpg")));
				
				
			}
		});
		
		//Alternativa C
		JLabel lblAlternativaC = new JLabel(MO_Perguntas.categoriaGame.get(0).getAlternativaC());
		lblAlternativaC.setText("Pergunta 1");
		lblAlternativaC.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaC.setBounds(80, 267, 531, 32);
		pnPrincipal.add(lblAlternativaC);
		
		//Botão [Alternativa C]
		JLabel lblBotaoC = new JLabel("New label");
		lblBotaoC.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaC_NORMAL.jpg")));
		lblBotaoC.setBounds(10, 265, 40, 40);
		pnPrincipal.add(lblBotaoC);
		
		//Label botão [Alternativa C]
		lblBotaoC.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CO_Jogo.alternativaEscolhida = 'C';
				
				lblBotaoC.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaC_ESCOLHIDA.jpg")));
				
				
			}
		});
		
		//Alternativa D
		JLabel lblAlternativaD = new JLabel(MO_Perguntas.categoriaGame.get(0).getAlternativaD());
		lblAlternativaD.setText("Pergunta 1");
		lblAlternativaD.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaD.setBounds(80, 339, 531, 32);
		pnPrincipal.add(lblAlternativaD);
		
		//Botão [Alternativa D]
		JLabel lblBotaoD = new JLabel("New label");
		lblBotaoD.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaD_NORMAL.jpg")));
		lblBotaoD.setBounds(10, 337, 40, 40);
		pnPrincipal.add(lblBotaoD);
		
		//Label botão [Alternativa D]
		lblBotaoD.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CO_Jogo.alternativaEscolhida = 'D';
				
				lblBotaoD.setIcon(new ImageIcon(getClass().getResource("/Botoes_alternativas/AlternativaD_ESCOLHIDA.jpg")));
				
				
			}
		});
		

				
		//Botão [Ajuda]
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAjuda.setBounds(451, 449, 128, 38);
		pnPrincipal.add(btnAjuda);
		
		
		//Botão [Pular]
		JButton btnPular = new JButton("PULAR");
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPular.setBounds(308, 449, 128, 38);
		pnPrincipal.add(btnPular);
		
		//Função botão [Pular
		btnPular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Contador para pegar os valores randomicos da ArrayList em sequencia
				CO_Jogo.contaPulos++;
				int indice = MO_Perguntas.guardaPergunta.get(CO_Jogo.contaPulos);
				
				//Alterar o texto dos labels, conforme o número randomico da ArrayList
				lblPergunta.setText(MO_Perguntas.categoriaGame.get(indice).getPergunta());
				lblAlternativaA.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaA());
				lblAlternativaA.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaB());
				lblAlternativaA.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaC());
				lblAlternativaA.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaD());
				
				
				//Contar 3 pulos
				CO_Jogo.contadorPulos++;
				if(CO_Jogo.contadorPulos == 3) {
					btnPular.setVisible(false);
				}
				
				
			}
		});
		
		
		//Botão [Confirmar]
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmar.setBounds(45, 449, 148, 38);
		pnPrincipal.add(btnConfirmar);
		
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
					
				//Contador para pegar os valores randomicos da ArrayList em sequencia
				CO_Jogo.contador++;
				int indice = MO_Perguntas.guardaPergunta.get(CO_Jogo.contador);
				
					//Contador de pulo
				CO_Jogo.contaPulos = CO_Jogo.contador;
			
				//Alterar o texto dos labels, conforme o número randomico da ArrayList
				lblPergunta.setText(MO_Perguntas.categoriaGame.get(indice).getPergunta());
				lblAlternativaA.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaA());
				lblAlternativaB.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaB());
				lblAlternativaC.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaC());
				lblAlternativaD.setText(MO_Perguntas.categoriaGame.get(indice).getAlternativaD());
				
				
				//Gravar pontuação do jogo
				if(CO_Jogo.alternativaEscolhida == MO_Perguntas.categoriaGame.get(indice).getResposta()){
					CO_Jogo.acertos++;
					System.out.println(CO_Jogo.acertos);
				}
				
	
					
				//Fechar as opcoes quando chegar as 10 questões
				if(CO_Jogo.contador == 11){
					
					//Guardar pontuação
					MO_Players MOP = new MO_Players();
					MOP.setNomePlayer(CO_Jogo.jogador);
					MOP.setAcertosPlayer(CO_Jogo.acertos);
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
