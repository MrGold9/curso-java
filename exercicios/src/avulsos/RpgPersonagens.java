package avulsos;

import java.util.Random;

public class RpgPersonagens 
{
	private String nomeJogador;
	private int vidaJogador;
	
	
	public RpgPersonagens(String nomeJogador, int vidaJogador)
	{
		this.nomeJogador = nomeJogador;
		this.vidaJogador = vidaJogador;
	}
	
	public void golpear(int dadoVinte) 
	{
		Random random = new Random();
		dadoVinte = random.nextInt(20)+1;
		
		if(dadoVinte < 20 || dadoVinte > 1) 
		{
			vida =- 10;
			System.out.println("-10 de vida");
		}
		
		else if(dadoVinte == 20) 
		{
			vida =- 40;
		}
		
		else if(dadoVinte == 1) 
		{
			vida =- 40;
		}
	}

}
