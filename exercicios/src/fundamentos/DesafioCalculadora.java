package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	
	public static void main(String[] args) 
	{
		
		// Ler o num1
		// Ler o num2
		// Qual operação deseja (+ - * / %)
		
		Scanner entrada = new Scanner(System.in);
		
		int escolha=0;
		double operacao1=0.0, operacao2=0.0, operacao3=0.0, operacao4=0.0,
				operacao5=0.0;
		double num1=0.0, num2=0.0;
		double resultadoFinal=0.0;
		
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Qual operação deseja fazer? Digite: "
		+ "1 para +, 2 para -, 3 para *, 4 para / e  5 para %");
		escolha = entrada.nextInt();
		
		
		operacao1 = escolha == 1 ?
				num1 + num2 : operacao2;
		
		operacao2 = escolha == 2 ?
				num1 - num2 : operacao3;
		
		operacao3 = escolha == 3 ?
				num1 * num2 : operacao4;
		
		operacao4 = escolha == 4 ?
				num1 / num2 : operacao5;
		
		operacao5 = escolha == 5 ?
				num1 % num2 : 0;
		
		resultadoFinal = operacao1 + operacao2 + 
				operacao3 + operacao4 + operacao5;
		
		
		System.out.println("O resultado da operação é: " + resultadoFinal);
		
		entrada.close();
	}

}
