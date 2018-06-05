package codigo;

import interfaceGrafica.IG_Erro;
import modelo.MO_Players;

public class CO_Jogo {

	//Atributos
	public static String mensagemErro = "";
	public int erroLogin = 0;
	
	//Método - Validar acesso ao Quiz
	public void validaAcesso(String nomeUsuario, String categoria){
		
		//Erro 1 - Usuario preenchido e categoria selecionada
		if(nomeUsuario.equals("") || categoria.equals("Categoria")){
			erroLogin = 1;
			mensagemErro = "Preencha ou selecione os campos";
			IG_Erro IGE = new IG_Erro();
					IGE.setVisible(true);
					
		}
		
		//Liberando acesso
		if(erroLogin == 0) {
		MO_Players MOP = new MO_Players();
		MOP.setNomePlayer(nomeUsuario);
		}
	}
}
