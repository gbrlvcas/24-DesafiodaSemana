package modelo;

import java.util.ArrayList;

public class MO_Players {

	//Variaveis
	private String nomePlayer;
	private int acertosPlayer;
	
	
	//Metodos magicos
	public String getNomePlayer() {
		return nomePlayer;
	}
	public void setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
	}
	public int getAcertosPlayer() {
		return acertosPlayer;
	}
	public void setAcertosPlayer(int acertosPlayer) {
		this.acertosPlayer = acertosPlayer;
	}

	
	//ArrayList
	ArrayList <MO_Players> Players = new ArrayList<>();
}
