package avulsos;

import java.util.Scanner;
import java.util.Random;

public class ExerciciosMatriz 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		
		Random aleatorio = new Random();
		int colunas = aleatorio.nextInt(10);
		int linhas = aleatorio.nextInt(10);
		
		int posicaoColuna = 0;
		String juncaoLinha = "";
		

		for (int i = 0; i <= linhas; i++) 
		{
			
			for (int j = 0; j <= colunas; j++) 
			{
				posicaoColuna = aleatorio.nextInt(10);
				juncaoLinha += " " + posicaoColuna;
			}
			
			juncaoLinha += "\n";
		}
		
		System.out.println(juncaoLinha);
		
		entrada.close();
	}
	
}
