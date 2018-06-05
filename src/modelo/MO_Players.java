package modelo;

import java.util.ArrayList;

public class MO_Players {

	//Variaveis
	private String nomePlayer;
	private static int acertosPlayer;
	private static int errosPlayer;
	
	

	
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
		MO_Players.acertosPlayer = acertosPlayer;
	}
	public static int getErrosPlayer() {
		return errosPlayer;
	}
	public static void setErrosPlayer(int errosPlayer) {
		MO_Players.errosPlayer = errosPlayer;
	}
	
	//ArrayList
	public static ArrayList <MO_Players> Players = new ArrayList<>();
}
