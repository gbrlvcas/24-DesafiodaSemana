package codigo;

import java.util.Random;

import interfaceGrafica.IG_Erro;
import interfaceGrafica.IG_Jogo;
import modelo.MO_Perguntas;
import modelo.MO_Players;

public class CO_Jogo{
//
	//Atributos
	public static String mensagemErro = "";
	public int erroLogin = 0;
	
	public static int erroJogo = 0;
	public static String jogador = "";
	public static int contador = 0;
	public static char alternativaEscolhida = 'E';
	public static int acertos = 0;
	public static int erros = 0;
	
	//Método - Validar acesso ao Quiz
	public void validarAcesso(String nomePlayer, String categoria){
		
		//Erro 1 - Usuario preenchido e categoria selecionada
		if(nomePlayer.equals("") || categoria.equals("Categoria")){
			erroLogin = 1;
			mensagemErro = "Preencha ou selecione os campos";
			IG_Erro IGE = new IG_Erro();
					IGE.setVisible(true);
					
		}
		
		if(erroLogin == 0) {
			gerarJogo(categoria);
			perguntaRandomica();
			comecarJogo(nomePlayer, categoria);
			jogador = nomePlayer;
			
		}
		
	}

	//Método - Gerar o jogo [Esta dentro do validar acesso]
	public void gerarJogo(String categoria) {
		
		if(categoria.equals("Games")) {
			CO_Game COG = new CO_Game();
			COG.cadastrarPerguntar();
		}
		
		}
	
	//Método - Gerar número randomico
	public void perguntaRandomica() {
		
		boolean valida = false;
		Random geraPergunta = new Random();
	
			//Condicional
			for(int i = 0 ; i < 13; i++) {
				
				//Random
				int escolher = geraPergunta.nextInt(20);
				
				//Se não tiver número cadastrado no vetor, será adicionado o primeiro
				if(i == 0){
					MO_Perguntas.guardaPergunta.add(escolher);
						
				}else{
					//Segundo for, para poder analisar todas as posicões do ArrayList.
					for(int i2 = 0 ; i2 < MO_Perguntas.guardaPergunta.size() ; i2++){
						
						/*
						 * Aqui o resultado do segundo for, será em boolean, pois a cada número que ele analisa ele retorna um valor,
						 * se caso ele retornar false (Número do random igual a um número no vetor), então é dado um BREAK, para poder
						 * gerar um novo número randomico.
						 * (Obs: É usado dessa forma, pois se trocar a validação retornando boolean, por adicionar o valor randomico no ArrayList,
						 * ele irá analisar o primeiro número, então ele ja adicionara no vetor, sem analisar os demais.
						 */
						
						if(escolher == MO_Perguntas.guardaPergunta.get(i2)){
							valida = false;
							break;
						
						}else{
							
							valida = true;
					}
					
				}
					//Se o o numero gerado não existir no ArrayList, então será adicionado ao mesmo
					if(valida == true){
					MO_Perguntas.guardaPergunta.add(escolher);
					}else{
						
						i--;
					}
			}
						
						
		}
	}
	
	//Método - Logar jogador
	public void comecarJogo(String nomePlayer, String categoria) {
		
	//Liberando acesso
	if(erroLogin == 0) {
		
		//Cadastrar usuario
		MO_Players MOP = new MO_Players();
			MOP.setNomePlayer(nomePlayer);
				MO_Players.Players.add(MOP);
	
		//Abrir o JFrame do Jogo
		IG_Jogo IGJ = new IG_Jogo();
			IGJ.setVisible(true);
		}
	}
	
	//Método - Contabilizar Acertos e Erros
	public void pontuacaoJogo(){
		
		//For avançado
		for(MO_Players MOP : MO_Players.Players){
			if(jogador.equals(MOP.getNomePlayer())){
				MOP.setAcertosPlayer(0);
				MOP.setAcertosPlayer(acertos);
				
			}else{
				MOP.setNomePlayer(jogador);
				MOP.setAcertosPlayer(acertos);
			}
		}
		
		
	}
	
	}

			
	
			


