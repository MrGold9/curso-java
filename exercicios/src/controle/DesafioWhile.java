package controle;

import java.util.Scanner;

public class DesafioWhile 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);

		double nota = 0, total = 0;
		int contNotas = 0;
		
		while (nota != -1) 
		{
			System.out.println("Até agora a quantidade digitada de notas "
					+ "foram " + contNotas 
					+ "\nDigite a nota de cada aluno"
					+ " (digite -1 para sair): ");
			nota = entrada.nextDouble();
			
			if (nota >= 0 || nota <= 10) 
			{
				contNotas++;
			}
			if (nota > 10 || nota < 0 && nota != -1) 
			{
				System.out.println("Digite uma nota válida!");
			}
			
			total += nota;
		}
		total = total + 1;
		
		System.out.println(total);

		entrada.close();
		
	}

}
