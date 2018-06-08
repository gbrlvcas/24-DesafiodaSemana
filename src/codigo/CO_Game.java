package codigo;

import modelo.MO_Perguntas;

public class CO_Game extends CO_Formulario {
//
	@Override
	public void cadastrarPerguntar() {

				
		//Adicionando perguntas ao ArrayList
				
		//Pergunta #1
		MO_Perguntas p1 = new MO_Perguntas();

		p1.setPergunta("Qual jogo possui um personagem que é um marsupial?");
		p1.setAlternativaA("Crash Bandicoot");
		p1.setAlternativaB("Pepsi-Man");
		p1.setAlternativaC("Driver");
		p1.setAlternativaD("Sonic");
		p1.setResposta('A');

		MO_Perguntas.categoriaGame.add(p1);

		//Pergunta #2
		MO_Perguntas p2 = new MO_Perguntas();

		p2.setPergunta("O Gran Turismo é um jogo de?");
		p2.setAlternativaA("Luta");
		p2.setAlternativaB("Corrida");
		p2.setAlternativaC("RPG");
		p2.setAlternativaD("Tabuleiro");
		p2.setResposta('B');

		MO_Perguntas.categoriaGame.add(p2);

		//Pergunta #3
		MO_Perguntas p3 = new MO_Perguntas();

		p3.setPergunta("Qual nome do jogo que você enfrenta monstros gigantes?");
		p3.setAlternativaA("Call of Duty");
		p3.setAlternativaB("Burnout");
		p3.setAlternativaC("Shadow of the Colossus");
		p3.setAlternativaD("Resident Evil");
		p3.setResposta('C');

		MO_Perguntas.categoriaGame.add(p3);

		//Pergunta #4
		MO_Perguntas p4 = new MO_Perguntas();

		p4.setPergunta("O personagem CJ, esta presente em qual GTA?");
		p4.setAlternativaA("GTA IV");
		p4.setAlternativaB("GTA Liberty City");
		p4.setAlternativaC("GTA Vice City");
		p4.setAlternativaD("GTA San Andreas");
		p4.setResposta('D');

		MO_Perguntas.categoriaGame.add(p4);

		//Pergunta #5
		MO_Perguntas p5 = new MO_Perguntas();

		p5.setPergunta("Qual o tipo de jogo que o Bomberman proporciona?");
		p5.setAlternativaA("Corridas por inumeros cenarios");
		p5.setAlternativaB("Colocar bombas para terminar a fase");
		p5.setAlternativaC("Atirar em animais voadores");
		p5.setAlternativaD("Cuidar da fazenda");
		p5.setResposta('B');

		MO_Perguntas.categoriaGame.add(p5);

		//Pergunta #6
		MO_Perguntas p6 = new MO_Perguntas();

		p6.setPergunta("Qual jogo de PS2 você destroi carros insanamente?");
		p6.setAlternativaA("Burnout");
		p6.setAlternativaB("Metal Gear Solid");
		p6.setAlternativaC("Gran Turismo");
		p6.setAlternativaD("Midnight Club");
		p6.setResposta('A');

		MO_Perguntas.categoriaGame.add(p6);

		//Pergunta #7
		MO_Perguntas p7 = new MO_Perguntas();

		p7.setPergunta("Qual jogo de RPG Online possui a classe Pikeman?");
		p7.setAlternativaA("Maple Story");
		p7.setAlternativaB("Priston Tale");
		p7.setAlternativaC("Ragnarok");
		p7.setAlternativaD("Grand Chase");
		p7.setResposta('B');

		MO_Perguntas.categoriaGame.add(p7);

		//Pergunta #8
		MO_Perguntas p8 = new MO_Perguntas();

		p8.setPergunta("Qual jogo é considero extremamente dificil?");
		p8.setAlternativaA("Assassins Creed");
		p8.setAlternativaB("The Witcher 3");
		p8.setAlternativaC("Dark Souls 3");
		p8.setAlternativaD("God of War");
		p8.setResposta('C');

		MO_Perguntas.categoriaGame.add(p8);

		//Pergunta #9
		MO_Perguntas p9 = new MO_Perguntas();

		p9.setPergunta("Qual o personagem principal de God of War?");
		p9.setAlternativaA("Kratos");
		p9.setAlternativaB("Saci Perere");
		p9.setAlternativaC("Aquiles");
		p9.setAlternativaD("Jason");
		p9.setResposta('A');

		MO_Perguntas.categoriaGame.add(p9);

		//Pergunta #10
		MO_Perguntas p10 = new MO_Perguntas();

		p10.setPergunta("Qual jogo do Assassins Creed se passa no egito?");
		p10.setAlternativaA("AC Black Flag");
		p10.setAlternativaB("AC Syndicate");
		p10.setAlternativaC("AC Origins");
		p10.setAlternativaD("AC Brotherhood");
		p10.setResposta('C');

		MO_Perguntas.categoriaGame.add(p10);

		//Pergunta #11
		MO_Perguntas p11 = new MO_Perguntas();

		p11.setPergunta("Qual jogo você joga com o personagem Guerra e Morte?");
		p11.setAlternativaA("Darksiders I e II");
		p11.setAlternativaB("God of War I e II");
		p11.setAlternativaC("Need for Speed Mostwanted");
		p11.setAlternativaD("Mercenaries I e II");
		p11.setResposta('A');

		MO_Perguntas.categoriaGame.add(p11);

		//Pergunta #12
		MO_Perguntas p12 = new MO_Perguntas();

		p12.setPergunta("Qual nome do vilao principal de Crash Bandicoot?");
		p12.setAlternativaA("Bowser");
		p12.setAlternativaB("DR. N Cortex");
		p12.setAlternativaC("Zeus");
		p12.setAlternativaD("Razor");
		p12.setResposta('B');

		MO_Perguntas.categoriaGame.add(p12);

		//Pergunta #13
		MO_Perguntas p13 = new MO_Perguntas();

		p13.setPergunta("Qual jogo possui o sufixo Modern Warfare?");
		p13.setAlternativaA("Medal of Honor");
		p13.setAlternativaB("Battlefield");
		p13.setAlternativaC("Call of Duty");
		p13.setAlternativaD("Splinter Cell");
		p13.setResposta('C');

		MO_Perguntas.categoriaGame.add(p13);

		//Pergunta #14
		MO_Perguntas p14 = new MO_Perguntas();

		p14.setPergunta("Qual jogo de zumbi esta na edição 7?");
		p14.setAlternativaA("Call of Duty");
		p14.setAlternativaB("Residen Evil");
		p14.setAlternativaC("Dead Island");
		p14.setAlternativaD("Left 4 Dead");
		p14.setResposta('B');

		MO_Perguntas.categoriaGame.add(p14);

		//Pergunta #15
		MO_Perguntas p15 = new MO_Perguntas();

		p15.setPergunta("Qual jogo possui o famoso Fatality?");
		p15.setAlternativaA("Mortal Kombat");
		p15.setAlternativaB("Street Fighter");
		p15.setAlternativaC("Killer Instinct");
		p15.setAlternativaD("Tekken");
		p15.setResposta('A');

		MO_Perguntas.categoriaGame.add(p15);

		//Pergunta #16
		MO_Perguntas p16 = new MO_Perguntas();

		p16.setPergunta("Qual modo de jogo mais famoso no momento?");
		p16.setAlternativaA("RPG");
		p16.setAlternativaB("Tiro");
		p16.setAlternativaC("Corrida");
		p16.setAlternativaD("Battle Royale");
		p16.setResposta('D');

		MO_Perguntas.categoriaGame.add(p16);

		//Pergunta #17
		MO_Perguntas p17 = new MO_Perguntas();

		p17.setPergunta("Qual jogo de corrida de rua mais famoso?");
		p17.setAlternativaA("Project Cars");
		p17.setAlternativaB("Need for Speed");
		p17.setAlternativaC("One Rush");
		p17.setAlternativaD("Forza Horizon");
		p17.setResposta('B');

		MO_Perguntas.categoriaGame.add(p17);

		//Pergunta #18
		MO_Perguntas p18 = new MO_Perguntas();

		p18.setPergunta("O novo God of War, se passa na mitolgia?");
		p18.setAlternativaA("Grega");
		p18.setAlternativaB("Nordica");
		p18.setAlternativaC("Egipcia");
		p18.setAlternativaD("Oriental");
		p18.setResposta('B');

		MO_Perguntas.categoriaGame.add(p18);

		//Pergunta #19
		MO_Perguntas p19 = new MO_Perguntas();

		p19.setPergunta("Qual jogo de tiro que possuia a versão 1.6?");
		p19.setAlternativaA("Killer Zone");
		p19.setAlternativaB("Destiny");
		p19.setAlternativaC("Half Life");
		p19.setAlternativaD("Counter-Strike");
		p19.setResposta('D');

		MO_Perguntas.categoriaGame.add(p19);

		//Pergunta #20
		MO_Perguntas p20 = new MO_Perguntas();

		p20.setPergunta("Qual RPG 2D é jogado a mais tempo?");
		p20.setAlternativaA("Tibia");
		p20.setAlternativaB("Ragnarok");
		p20.setAlternativaC("Maple Story");
		p20.setAlternativaD("Gunbound");
		p20.setResposta('A');

		MO_Perguntas.categoriaGame.add(p20);


		
	}

}
