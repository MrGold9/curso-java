package avulsos;

import java.util.Random;

public class RpgInimigo 
{
	
	public static String nomeInimigo = "Bob";
	public static int vidaInimigo = 100;
	
	public RpgInimigo() 
	{
		
	}
	
	public void golpearJogador() 
	{
		int dadoVinte = 0;
		Random random = new Random();
		dadoVinte = random.nextInt(20)+1;
		
		if(dadoVinte < 20 || dadoVinte > 1) 
		{
			RpgJogador.vidaJogador -= 10;
			System.out.println(RpgJogador.nomeJogador + " perdeu 10 de vida");
			System.out.println("Dado = " + dadoVinte);
		}
		
		else if(dadoVinte == 20) 
		{
			RpgJogador.vidaJogador -= 40;
			System.out.println(RpgJogador.nomeJogador + " perdeu 40 de vida");
		}
		
		else if(dadoVinte == 1)
		{
			vidaInimigo -= 40;
			System.out.println(nomeInimigo + " perdeu 40 de vida");
		}
	}
	

}
