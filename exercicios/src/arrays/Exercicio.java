package arrays;

import java.util.Arrays;

public class Exercicio 
{
	
	public static void main(String[] args) 
	{
		//Criando um array: tipo -> nome -> número de elementos
		double notasAlunoA [] = new double [3];
		
		//Definindo os valores de cada elemento do array
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		//Imprimindo um array inteiro
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Imprimindo cada elemento de um array
		for (int i = 0; i < 3; i++) 
		{
			System.out.println(notasAlunoA[i]);
		}
		
		
	}

}
