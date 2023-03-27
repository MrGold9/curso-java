package avulsos;

import java.util.Scanner;

public class RpgTeste 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		String continuar = "s";
		
		while(continuar == "s")
		{
		
		RpgJogador jogador1 = new RpgJogador("Walter");
		RpgInimigo inimigo1 = new RpgInimigo();
		
		System.out.println(jogador1.nomeJogador + "\nVida: " + jogador1.vidaJogador);
		System.out.println();
		System.out.println(inimigo1.nomeInimigo + "\nVida: " + inimigo1.vidaInimigo);
		System.out.println();
		
		
		System.out.println();

		
		if (inimigo1.vidaInimigo <= 0) 
		{
			System.out.println(jogador1.nomeJogador + " ganhou o jogo");
		}
		else if (jogador1.vidaJogador <= 0) 
		{
			System.out.println(inimigo1.nomeInimigo + " ganhou o jogo");
		}
		
		
		//continuar = entrada.nextLine();
		
		}

	}

}
