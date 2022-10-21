package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio 
{
	
	public static void main(String[] args) 
	{
		/* 
		   1- Perguntar quantas notas o usu�rio deseja informar e
		   setar esse n�mero de elementos em um array
		   
		   2- Pedir para o usu�rio informar o valor de cada elemento
		   dentro de um FOR
		   
		   3- Passar por cada elemento e somar seus valores dentro
		   de uma vari�vel utilizando o FOREACH
		   
		   4- Calcular e exibir a m�dia das notas informadas
		*/
		
		Scanner entrada = new Scanner(System.in);

		int numeroNotas = 0;
		double totalNotas = 0, mediaNotas = 0;
		
		System.out.println("Quantas notas voc� deseja informar?");
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
		
		System.out.printf("A m�dia deste aluno � %.2f", mediaNotas);

		entrada.close();
		
	}

}
