package arrays;

import java.util.Scanner;

public class Desafio 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);

		int numeroNotas = 0, totalNotas = 0;
		
		System.out.println("Quantas notas você quer informar?");
		numeroNotas = entrada.nextInt();
		
		for(int i = 0; i <= numeroNotas; i++) 
		{
			numeroNotas += i;
		}
		double[] notas = new double[numeroNotas];
		
		for (String string : args) 
		{
			
		}

		entrada.close();
		
	}

}
