package avulsos;

import java.util.Scanner;

public class RpgTeste 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		char continuar = 's';
		int acao;
		
		while (continuar == 's')
		{
		
		RpgJogador jogador1 = new RpgJogador("Walter");
		RpgInimigo inimigo1 = new RpgInimigo();
		
		System.out.println(jogador1.nomeJogador + "\nVida: " + jogador1.vidaJogador);
		System.out.println();
		System.out.println(inimigo1.nomeInimigo + "\nVida: " + inimigo1.vidaInimigo);
		System.out.println();
		
		switch (acao) 
		{
		case 1: 
		{
			
		}
		case 2:
		{
			
		}
		default:
		{
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
		
		System.out.println();

		
		if (inimigo1.vidaInimigo <= 0) 
		{
			System.out.println(jogador1.nomeJogador + " ganhou o jogo");
		}
		else if (jogador1.vidaJogador <= 0) 
		{
			System.out.println(inimigo1.nomeInimigo + " ganhou o jogo");
		}
		
		System.out.println("Deseja reiniciar o jogo? (s/n)");
		continuar = entrada.next().charAt(0);
		
		
		}
		
		System.out.println("Jogo finalizado");
		
		entrada.close();

	}

}
