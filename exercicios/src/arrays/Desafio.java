package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);

		int numeroNotas = 0;
		double totalNotas = 0;
		
		System.out.println("Quantas notas você quer informar?");
		numeroNotas = entrada.nextInt();
		
		double[] notas = new double[numeroNotas];
		
		for(int i = 0; i < numeroNotas; i++) 
		{
			System.out.println("Digite a nota " + (i + 1));
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		for (double nota : notas) 
		{
			
		}

		entrada.close();
		
	}

}
