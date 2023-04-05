package avulsos;

import java.util.ArrayList;
import java.util.Random;

public class RpgInimigo 
{
	
	public static String nomeInimigo = "Bob";
	public static int vidaInimigo = 100;
	
	static int dadoVinte = 0;
	static ArrayList<Integer> historicoDados = new ArrayList<Integer>();
	
	public RpgInimigo() 
	{
		
	}
	
	public void golpearJogador() 
	{
		//int dadoVinte = 0;
		Random random = new Random();
		dadoVinte = random.nextInt(20)+1;
		
		historicoDados.add(dadoVinte);
		
		if(dadoVinte < 20 && dadoVinte > 1) 
		{
			RpgJogador.vidaJogador -= 10;
			System.out.println("\n" + RpgJogador.nomeJogador + " perdeu 10 de vida");
			
			System.out.println("Dado Golpe Inimigo = " + dadoVinte);
		}
		
		if(dadoVinte == 20) 
		{
			RpgJogador.vidaJogador -= 40;
			System.out.println("\n" + RpgJogador.nomeJogador + " perdeu 40 de vida");
			
			System.out.println("Dado Golpe Inimigo = " + dadoVinte);
		}
		
		if(dadoVinte == 1)
		{
			vidaInimigo -= 40;
			System.out.println("\n" + nomeInimigo + " perdeu 40 de vida");
			
			System.out.println("Dado Golpe Inimigo = " + dadoVinte);
		}
	}
	

}
