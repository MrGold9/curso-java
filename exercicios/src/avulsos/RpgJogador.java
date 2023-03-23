package avulsos;

import java.util.Random;

public class RpgJogador 
{
	public static String nomeJogador;
	public static int vidaJogador = 100;
	
	
	public RpgJogador(String nomeJogador)
	{
		this.nomeJogador = nomeJogador;
	}
	
	public void golpear(int dadoVinte) 
	{
		Random random = new Random();
		dadoVinte = random.nextInt(20)+1;
		
		if(dadoVinte < 20 || dadoVinte > 1) 
		{
			RpgInimigo.vidaInimigo =- 10;
			System.out.println(RpgInimigo.nomeInimigo + " perdeu 10 de vida");
		}
		
		else if(dadoVinte == 20) 
		{
			RpgInimigo.vidaInimigo =- 40;
			System.out.println(RpgInimigo.nomeInimigo + " perdeu 40 de vida");
		}
		
		else if(dadoVinte == 1) 
		{
			RpgInimigo.vidaInimigo =- 40;
			System.out.println(nomeJogador + " perdeu 10 de vida");
		}
	}

}
