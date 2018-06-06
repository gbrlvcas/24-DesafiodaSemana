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


public class IG_Resultado extends JFrame {

	private JPanel pnPrincipal;

//

	
	//Interface Grafica do Jogo
	public IG_Resultado() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 530);
		pnPrincipal = new JPanel();
		pnPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnPrincipal);
		setLocationRelativeTo(null);
		pnPrincipal.setLayout(null);
		
		//Pergunta
		JLabel lblPergunta = new JLabel(MO_Perguntas.categoriaGame.get(0).getPergunta());
		lblPergunta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPergunta.setBounds(80, 53, 531, 32);
		pnPrincipal.add(lblPergunta);
		
		//Alternativa A
		JLabel lblAlternativaA = new JLabel();
		lblAlternativaA.setText("Pergunta 1");
		lblAlternativaA.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaA.setBounds(80, 126, 531, 32);
		pnPrincipal.add(lblAlternativaA);
		
		//Botão [Alternativa A]
		JLabel lblBotaoA = new JLabel("New label");
		lblBotaoA.setBounds(10, 124, 40, 40);
		pnPrincipal.add(lblBotaoA);
		
		//Label botão [Alternativa A]
		lblBotaoA.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				CO_Jogo.alternativaEscolhida = 'A';
			}
		});
	
		//Alternativa B
		JLabel lblAlternativaB = new JLabel();
		lblAlternativaB.setText("Pergunta 1");
		lblAlternativaB.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaB.setBounds(80, 193, 531, 32);
		pnPrincipal.add(lblAlternativaB);
		
		//Botão [Alternativa B]
		JLabel lblBotaoB = new JLabel("New label");
		lblBotaoB.setBounds(10, 191, 40, 40);
		pnPrincipal.add(lblBotaoB);
		
		//Label botão [Alternativa B]
		lblBotaoB.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CO_Jogo.alternativaEscolhida = 'B';
			}
		});
		
		//Alternativa C
		JLabel lblAlternativaC = new JLabel();
		lblAlternativaC.setText("Pergunta 1");
		lblAlternativaC.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaC.setBounds(80, 267, 531, 32);
		pnPrincipal.add(lblAlternativaC);
		
		//Botão [Alternativa C]
		JLabel lblBotaoC = new JLabel("New label");
		lblBotaoC.setBounds(10, 265, 40, 40);
		pnPrincipal.add(lblBotaoC);
		
		//Label botão [Alternativa C]
		lblBotaoC.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CO_Jogo.alternativaEscolhida = 'C';
			}
		});
		
		//Alternativa D
		JLabel lblAlternativaD = new JLabel();
		lblAlternativaD.setText("Pergunta 1");
		lblAlternativaD.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlternativaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlternativaD.setBounds(80, 339, 531, 32);
		pnPrincipal.add(lblAlternativaD);
		
		//Botão [Alternativa D]
		JLabel lblBotaoD = new JLabel("New label");
		lblBotaoD.setBounds(10, 337, 40, 40);
		pnPrincipal.add(lblBotaoD);
		
		//Label botão [Alternativa D]
		lblBotaoD.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CO_Jogo.alternativaEscolhida = 'D';
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
				
				CO_Jogo.contaPulos++;
				
				
				
				
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
				
				//Zerar a variavel de erro toda vez que for iniciado
				CO_Jogo.erroJogo = 0;
				
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
			
				//Alterar o texto dos labels, conforme o número randomico da ArrayList
				lblPergunta.setText(MO_Perguntas.categoriaGame.get(indice).getPergunta());
				
				//Gravar pontuação do jogo
				if(CO_Jogo.alternativaEscolhida == MO_Perguntas.categoriaGame.get(indice).getResposta()){
					CO_Jogo.acertos++;
					System.out.println(CO_Jogo.acertos);
				}
				
				CO_Jogo COJ = new CO_Jogo();
				COJ.pontuacaoJogo();
			
				//Fechar as opcoes quando chegar as 10 questões
				if(CO_Jogo.contador == 11){
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
			}
		});
	}
}
