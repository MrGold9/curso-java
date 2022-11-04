package arrays;

import java.util.Arrays;

public class Exercicio 
{
	
	public static void main(String[] args) 
	{
		//Criando um array: tipo -> nome -> n�mero de elementos
		double notasAlunoA [] = new double [4];
		
		//Arrays.toString mostra um array completo
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Definindo os valores de cada elemento do array
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Acessando um elemento espec�fico do array
		System.out.println(notasAlunoA[0]);
		//O .length exibe a quantidade de elementos de um array
		System.out.println(notasAlunoA.length);
		//Acessando o �ltimo elemento de um array
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);

		
		//Somando as notas para exibir a m�dia do aluno
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) 
		{
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("\n" + totalAlunoA / notasAlunoA.length);
		
		
		
		/*Criando um array e definindo a quantidade de elementos
		atrav�s de seus respectivos valores*/
		//Obs: uma vari�vel pode ser colocada dentro de um array
		final double notaArmazenada = 5.5;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0; 
		for (int i = 0; i < notasAlunoB.length; i++) 
		{
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}
