package codigo;

import java.util.Random;

import interfaceGrafica.IG_Erro;
import interfaceGrafica.IG_Jogo;
import modelo.MO_Perguntas;
import modelo.MO_Players;

public class CO_Jogo{

	//Atributos
	public static String mensagemErro = "";
	public int erroLogin = 0;
	public int selecionarPergunta;
	public static int contador = 0;
	
	//Método - Validar acesso ao Quiz
	public void validarAcesso(String nomeUsuario, String categoria){
		
		//Erro 1 - Usuario preenchido e categoria selecionada
		if(nomeUsuario.equals("") || categoria.equals("Categoria")){
			erroLogin = 1;
			mensagemErro = "Preencha ou selecione os campos";
			IG_Erro IGE = new IG_Erro();
					IGE.setVisible(true);
					
		}
		
		if(erroLogin == 0) {
			gerarJogo(categoria);
			perguntaRandomica();
			comecarJogo(nomeUsuario, categoria);
			
		}
		
	}

	//Método - Gerar o jogo [Esta dentro do validar acesso]
	public void gerarJogo(String categoria) {
		
		if(categoria.equals("Games")) {
			CO_Game COG = new CO_Game();
			COG.cadastrarPerguntar();
		}
		
		}
	
	//Método - Logar jogador
	public void comecarJogo(String nomeUsuario, String categoria) {
		
	//Liberando acesso
	if(erroLogin == 0) {
		
		//Cadastrar usuario
		MO_Players MOP = new MO_Players();
		MOP.setNomePlayer(nomeUsuario);
	
		//Gerar o jogo
		gerarJogo(categoria);
	
		//Abrir o JFrame do Jogo
		IG_Jogo IGJ = new IG_Jogo();
			IGJ.setVisible(true);
		}
	}
	
	//Método - Gerar número randomico
	public void perguntaRandomica() {
		
		Random geraPergunta = new Random();
		int escolher = geraPergunta.nextInt(20);
	
			
			for(int i = 0 ; i < 20 ; i++) {
				if(escolher != MO_Perguntas.categoriaGame.get(i).getEscolherPergunta()) {
					MO_Perguntas MOP = new MO_Perguntas();
					MOP.setEscolherPergunta(escolher);
						MO_Perguntas.guardaPergunta.add(MOP);
						
				}
						
						
				}
			}
	
	//Método - Pegar os números randomicos
	public int selecionaPergunta() {
		contador++;
		selecionarPergunta = MO_Perguntas.guardaPergunta.get(contador).getEscolherPergunta();
		
		
		//Retornar
		return selecionarPergunta;
	}
	
	}

			
	
			


