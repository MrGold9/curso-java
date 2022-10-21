package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio 
{
	
	public static void main(String[] args) 
	{
		/* 
		   1- Perguntar quantas notas o usuário deseja informar e
		   setar esse número de elementos em um array
		   
		   2- Pedir para o usuário informar o valor de cada elemento
		   dentro de um FOR
		   
		   3- Passar por cada elemento e somar seus valores dentro
		   de uma variável utilizando o FOREACH
		   
		   4- Calcular e exibir a média das notas informadas
		*/
		
		Scanner entrada = new Scanner(System.in);

		int numeroNotas = 0;
		double totalNotas = 0, mediaNotas = 0;
		
		System.out.println("Quantas notas você deseja informar?");
		numeroNotas = entrada.nextInt();
		
		double[] notas = new double[numeroNotas];
		
		//FOR
		for(int i = 0; i < numeroNotas; i++) 
		{
			System.out.println("Digite a nota " + (i + 1));
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		//FOREACH
		for (double nota : notas) 
		{
			totalNotas += nota;
		}
		mediaNotas = totalNotas / numeroNotas;
		
		System.out.printf("A média deste aluno é %.2f", mediaNotas);

		entrada.close();
		
	}

}
