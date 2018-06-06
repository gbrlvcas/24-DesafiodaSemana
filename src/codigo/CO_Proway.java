package codigo;

import modelo.MO_Perguntas;

public class CO_Proway extends CO_Formulario {

	@Override
	public void cadastrarPerguntar() {
		
		//Pergunta #1
		MO_Perguntas p1 = new MO_Perguntas();

		p1.setPergunta("Como o aluno Lucas William costuma chamar seu amiguinho?");
		p1.setAlternativaA("Amigão");
		p1.setAlternativaB("Mané");
		p1.setAlternativaC("Panaca");
		p1.setAlternativaD("Zorelha");
		p1.setResposta('C');

		MO_Perguntas.categoriaProway.add(p1);

		//Pergunta #2
		MO_Perguntas p2 = new MO_Perguntas();

		p2.setPergunta("Quem é o professor(a) mais legal?");
		p2.setAlternativaA("Ralf");
		p2.setAlternativaB("Priscila");
		p2.setAlternativaC("Girafales");
		p2.setAlternativaD("Utonio");
		p2.setResposta('A');

		MO_Perguntas.categoriaProway.add(p2);

		//Pergunta #3
		MO_Perguntas p3 = new MO_Perguntas();

		p3.setPergunta("Qual aluno tem desejo em fazer hidromel?");
		p3.setAlternativaA("Kbelo");
		p3.setAlternativaB("Tiago");
		p3.setAlternativaC("Alison");
		p3.setAlternativaD("Lucas Steps");
		p3.setResposta('B');

		MO_Perguntas.categoriaProway.add(p3);

		//Pergunta #4
		MO_Perguntas p4 = new MO_Perguntas();

		p4.setPergunta("Quando aprendo um código dificil, eu...");
		p4.setAlternativaA("sinto saudades do JOptionPane");
		p4.setAlternativaB("treino de forma gloriosa");
		p4.setAlternativaC("atualizo meu linkedin para colhedor de algodao");
		p4.setAlternativaD("fico mais louco a cada dia");
		p4.setResposta('B');

		MO_Perguntas.categoriaProway.add(p4);

		//Pergunta #5
		MO_Perguntas p5 = new MO_Perguntas();

		p5.setPergunta("Na linguagem de programação, como se chamaria a pessoa que só namora gente errada?");
		p5.setAlternativaA("Boolean");
		p5.setAlternativaB("Try catch");
		p5.setAlternativaC("Array");
		p5.setAlternativaD("Integer");
		p5.setResposta('B');

		MO_Perguntas.categoriaProway.add(p5);

		//Pergunta #6
		MO_Perguntas p6 = new MO_Perguntas();

		p6.setPergunta("No vetor Ralf, quantas Strings Chopp cabem?");
		p6.setAlternativaA("1");
		p6.setAlternativaB("5");
		p6.setAlternativaC("20");
		p6.setAlternativaD("Converter Ralf para ArrayList");
		p6.setResposta('D');

		MO_Perguntas.categoriaProway.add(p6);

		//Pergunta #7
		MO_Perguntas p7 = new MO_Perguntas();

		p7.setPergunta("Qual signo da professora de IDH?");
		p7.setAlternativaA("Libra");
		p7.setAlternativaB("Gemeos");
		p7.setAlternativaC("Leao");
		p7.setAlternativaD("Touro");
		p7.setResposta('D');

		MO_Perguntas.categoriaProway.add(p7);

		//Pergunta #8
		MO_Perguntas p8 = new MO_Perguntas();

		p8.setPergunta("Na questão do professor(a) mais legal, você tem certeza da sua escolha?");
		p8.setAlternativaA("Sim");
		p8.setAlternativaB("Na verdade não");
		p8.setAlternativaC("talvez");
		p8.setAlternativaD("Eu ainda não vi a questão, mas digo que sim");
		p8.setResposta('A');

		MO_Perguntas.categoriaProway.add(p8);

		//Pergunta #9
		MO_Perguntas p9 = new MO_Perguntas();

		p9.setPergunta("O que faz os alunos desistirem da aula de programação?");
		p9.setAlternativaA("Complexidade");
		p9.setAlternativaB("Monotonia");
		p9.setAlternativaC("A cadeira da segunda fila");
		p9.setAlternativaD("Stress");
		p9.setResposta('C');

		MO_Perguntas.categoriaProway.add(p9);

		//Pergunta #10
		MO_Perguntas p10 = new MO_Perguntas();

		p10.setPergunta("Quando termina as aulas de programação, geralmente...");
		p10.setAlternativaA("... A vida perde o sentido");
		p10.setAlternativaB("... Vão para area de humanas");
		p10.setAlternativaC("... Procuram um emprego na área");
		p10.setAlternativaD("... Ajoelha e chora");
		p10.setResposta('C');

		MO_Perguntas.categoriaProway.add(p10);

		//Pergunta #11
		MO_Perguntas p11 = new MO_Perguntas();

		p11.setPergunta("Quando Ralf é chamado para resolver um problema, geralmente a solução é...");
		p11.setAlternativaA("... Algo que ainda não foi aprendido");
		p11.setAlternativaB("... Algo que desconfiava que fosse resolver");
		p11.setAlternativaC("... Let Me Google That For You");
		p11.setAlternativaD(".... Dar CTRL + S");
		p11.setResposta('D');

		MO_Perguntas.categoriaProway.add(p11);

		//Pergunta #12
		MO_Perguntas p12 = new MO_Perguntas();

		p12.setPergunta("Qual a formula que impede charlatões de procurar brechas nas validacoes?");
		p12.setAlternativaA("Formula de Bhaskara");
		p12.setAlternativaB("Formula Secreta X");
		p12.setAlternativaC("Formula Anti - Kbelo");
		p12.setAlternativaD("Formula 1");
		p12.setResposta('C');

		MO_Perguntas.categoriaProway.add(p12);

		//Pergunta #13
		MO_Perguntas p13 = new MO_Perguntas();

		p13.setPergunta("Qual a probabilidade do Lucas Steps comprar um casquinha no intervalo?");
		p13.setAlternativaA("0,1");
		p13.setAlternativaB("0,3");
		p13.setAlternativaC("0,97");
		p13.setAlternativaD("0,2");
		p13.setResposta('C');

		MO_Perguntas.categoriaProway.add(p13);

		//Pergunta #14
		MO_Perguntas p14 = new MO_Perguntas();

		p14.setPergunta("Gloriosa");
		p14.setAlternativaA("Professora IDH");
		p14.setAlternativaB("Executar uma tarefa");
		p14.setAlternativaC("5x1");
		p14.setAlternativaD("Estava sem ideia pra essa questão");
		p14.setResposta('B');

		MO_Perguntas.categoriaProway.add(p14);

		//Pergunta #15
		MO_Perguntas p15 = new MO_Perguntas();

		p15.setPergunta("Se o Lucas W fosse uma classe, e se ele chamasse o Lucas Steps, como se chamaria?");
		p15.setAlternativaA("public LucasW extends panaca();");
		p15.setAlternativaB("public LucasW extends mané();");
		p15.setAlternativaC("public LucasW extends otario();");
		p15.setAlternativaD("public LucasW extends zorelha();");
		p15.setResposta('A');

		MO_Perguntas.categoriaProway.add(p15);

		//Pergunta #16
		MO_Perguntas p16 = new MO_Perguntas();

		p16.setPergunta("O que se imagina depois que se forma em programação?");
		p16.setAlternativaA("Criar a Skynet");
		p16.setAlternativaB("Se tratar");
		p16.setAlternativaC("Criar programas com Gif do professor");
		p16.setAlternativaD("Trabalhar na area, e criar coisa inutil porem legal");
		p16.setResposta('D');

		MO_Perguntas.categoriaProway.add(p16);

		//Pergunta #17
		MO_Perguntas p17 = new MO_Perguntas();

		p17.setPergunta("Quando tem muitas variaveis e um ArrayList?");
		p17.setAlternativaA("Colocar tudo ordenadamente via métodos magicos");
		p17.setAlternativaB("Faz no excel e anexa no trabalho");
		p17.setAlternativaC("Senta na cadeira da segunda fila");
		p17.setAlternativaD("Cololocar tudo junto e segurar na mão de Deus");
		p17.setResposta('A');

		MO_Perguntas.categoriaProway.add(p17);

		//Pergunta #18
		MO_Perguntas p18 = new MO_Perguntas();

		p18.setPergunta("Quando código é grande e não é comentado");
		p18.setAlternativaA("É melhor estudar Russo");
		p18.setAlternativaB("que?");
		p18.setAlternativaC("O que importa é funcionar");
		p18.setAlternativaD("Começa tudo denovo");
		p18.setResposta('C');

		MO_Perguntas.categoriaProway.add(p18);

		//Pergunta #19
		MO_Perguntas p19 = new MO_Perguntas();

		p19.setPergunta("Quando se esta estudando programação, o que pensam geralmente?");
		p19.setAlternativaA("Criar um rede social");
		p19.setAlternativaB("Hackear a maquina de bichinho");
		p19.setAlternativaC("Crédito infinito no MC Donalds");
		p19.setAlternativaD("Hackear o pentagono");
		p19.setResposta('B');

		MO_Perguntas.categoriaProway.add(p19);

		//Pergunta #20
		MO_Perguntas p20 = new MO_Perguntas();

		p20.setPergunta("Quando não se coloca validação nó código");
		p20.setAlternativaA("Torce pra ninguem errar");
		p20.setAlternativaB("Vive num utopia de que ninguem erra");
		p20.setAlternativaC("Se errar tenta denovo");
		p20.setAlternativaD("Faz gambiarra que funciona mais ou menos");
		p20.setResposta('D');

		MO_Perguntas.categoriaProway.add(p20);

		
	}


}
