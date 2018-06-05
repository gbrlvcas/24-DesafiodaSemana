package codigo;

import modelo.MO_Perguntas;

public class CO_Game extends CO_Formulario {

	@Override
	public void cadastrarPerguntar() {

				
		//Adicionando perguntas ao ArrayList
				
				//Pergunta #1
				MO_Perguntas p1 = new MO_Perguntas();
				p1.setPergunta("Pergunta 1");
				p1.setAlternativaA("Alternativa 1");
				p1.setAlternativaA("Alternativa 2");
				p1.setAlternativaA("Alternativa 3");
				p1.setAlternativaA("Alternativa 4");
				p1.setResposta("a");
				
				MO_Perguntas.categoriaGame.add(p1);
	}

}
