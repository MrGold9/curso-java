package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quanto alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		//Criando uma matriz:
		// [quantidade de arrays][quantidade de elementos por array]
		double [][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		//Um FOR para percorrer os alunos
		for (int a = 0; a < notasDaTurma.length; a++) 
		{
			//Um FOR para percorrer as notas
			for (int n = 0; n < notasDaTurma[a].length; n++) 
			{
				
				System.out.printf("Informe a nota %d do aluno %d: ",
						n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
				
			}
			
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é " + media);
		
		//FOREACH para mostrar as notas de cada aluno
		for (double[] notasDoAluno : notasDaTurma) 
		{
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
		
	}

}
