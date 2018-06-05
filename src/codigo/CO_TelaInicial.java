package codigo;

import interfaceGrafica.IG_Erro;

public class CO_TelaInicial {

	//Atributos
	public static String mensagemErro = "";
	public int erroLogin = 0;
	
	//Método - Validar acesso ao Quiz
	public void validaAcesso(String nomeUsuario, String categoria){
		
		//Erro 1 - Usuario preenchido e categoria selecionada
		if(nomeUsuario.equals("") || categoria.equals("Categoria")){
			mensagemErro = "Preencha ou selecione os campos";
			IG_Erro IGE = new IG_Erro();
					IGE.setVisible(true);
			
		}
	}
}
