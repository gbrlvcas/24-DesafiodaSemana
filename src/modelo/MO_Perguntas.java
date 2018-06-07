package modelo;

import java.util.ArrayList;

public class MO_Perguntas {

	//Atributos
	private String pergunta, alternativaA, alternativaB, alternativaC, alternativaD;
	private char resposta;
	private int escolherPergunta;
	
//
	//Métodos magicos
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getAlternativaA() {
		return alternativaA;
	}
	public void setAlternativaA(String alternativaA) {
		this.alternativaA = alternativaA;
	}
	public String getAlternativaB() {
		return alternativaB;
	}
	public void setAlternativaB(String alternativaB) {
		this.alternativaB = alternativaB;
	}
	public String getAlternativaC() {
		return alternativaC;
	}
	public void setAlternativaC(String alternativaC) {
		this.alternativaC = alternativaC;
	}
	public String getAlternativaD() {
		return alternativaD;
	}
	public void setAlternativaD(String alternativaD) {
		this.alternativaD = alternativaD;
	}
	public char getResposta() {
		return resposta;
	}
	public void setResposta(char resposta) {
		this.resposta = resposta;
	}
	public int getEscolherPergunta() {
		return escolherPergunta;
	}
	public void setEscolherPergunta(int escolherPergunta) {
		this.escolherPergunta = escolherPergunta;
	}
	
	//ArrayList
	public static ArrayList<MO_Perguntas> categoriaGame = new ArrayList<>();
	public static ArrayList<MO_Perguntas> categoriaProway = new ArrayList<>();
	public static ArrayList<MO_Perguntas> categoriaMusica = new ArrayList<>();
	public static ArrayList<MO_Perguntas> categoriaEscolhida = new ArrayList<>();
	public static ArrayList<Integer> guardaPergunta = new ArrayList<>();
}
