package avulsos;

import java.util.ArrayList;
import java.util.Random;

public class RpgJogador 
{
	public static String nomeJogador;
	public static int vidaJogador = 100;
	
	static int dadoVinte = 0;
	static ArrayList<Integer> historicoDados = new ArrayList<Integer>();
	
	public RpgJogador()
	{
		
	}
	
	public void golpearInimigo() 
	{
		//int dadoVinte = 0;
		Random random = new Random();
		dadoVinte = random.nextInt(20)+1;
		
		historicoDados.add(dadoVinte);
		
		if(dadoVinte < 20 && dadoVinte > 1 && RpgInimigo.vidaInimigo > 0) 
		{
			RpgInimigo.vidaInimigo -= 10;
			System.out.println(RpgInimigo.nomeInimigo + " perdeu 10 de vida");
			
			System.out.println("Dado Golpe Jogador = " + dadoVinte);
		}
		
		if(dadoVinte == 20 && RpgInimigo.vidaInimigo > 0) 
		{
			RpgInimigo.vidaInimigo -= 40;
			System.out.println(RpgInimigo.nomeInimigo + " perdeu 40 de vida");
			
			System.out.println("Dado Golpe Jogador = " + dadoVinte);
		}
		
		if(dadoVinte == 1 && RpgInimigo.vidaInimigo > 0)
		{
			vidaJogador -= 40;
			System.out.println(nomeJogador + " perdeu 40 de vida");
			
			System.out.println("Dado Golpe Jogador = " + dadoVinte);
		}
	}

}
