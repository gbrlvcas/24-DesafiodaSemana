package codigo;

import modelo.MO_Perguntas;
import modelo.MO_Players;

public class CO_Ranking {

	//Atributos
	String armazenaNomeMaior;
	String armazenaNomeMenor;
	
	int armazenaMaior = 0;
	int armazenaMenor = 0;

	
	
	
	
	//Método - Gerar ranking
	public void gerarRanking() {
	for(int i = 0 ; i < MO_Players.Players.size() - 1 ; i++) {
		
		for(int i2 = i+1; i2 < MO_Players.Players.size(); i2++) {
			
			if(MO_Players.Players.get(i2).getAcertosPlayer() > MO_Players.Players.get(i).getAcertosPlayer()){
				
				//Obter os jogadores
				MO_Players armazenaMaior = MO_Players.Players.get(i2);
				MO_Players armazenaMenor = MO_Players.Players.get(i);
				
				//Trocar a ordem
				MO_Players.Players.set(i, armazenaMaior);
				MO_Players.Players.set(i2, armazenaMenor);
			}
				
			}
			
		}
	
	exibirRankig();
	}
	
	
	public void exibirRankig(){
		for(int i=0; i < MO_Players.Players.size(); i++){
			System.out.println(MO_Players.Players.get(i).getNomePlayer()+" "+MO_Players.Players.get(i).getAcertosPlayer());
		}
	}
	
	}
	

