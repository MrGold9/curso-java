package controle;

import java.util.Scanner;

public class If 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0 && media <= 10.0) 
		{
			System.out.println("Parabéns! Você foi aprovado.");
		}
		
		if (media < 7.0 && media >= 4.5) 
		{
			System.out.println("Você está de recuperação.");
		}
		
		if (media < 4.5 && media >= 0)
		{
			System.out.println("Você foi reprovado.");
		}
		
		
		entrada.close();
		
	}

}
