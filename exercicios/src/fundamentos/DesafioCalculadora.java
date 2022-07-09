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
		
		String escolha;
		String operacao1, operacao2, operacao3, operacao4,
				operacao5;
		double num1, num2, resultado;
		
		System.out.print("Qual operação deseja fazer? + - * / % ");
		escolha = entrada.nextLine().trim();
		
		operacao5 = escolha == "%" ?
				"Digite um número: " : "Digite uma operação válida.";
		
		operacao4 = escolha == "/" ?
				"Digite um número: " : operacao5;
		
		operacao3 = escolha == "*" ?
				"Digite um número: " : operacao4;
		
		operacao2 = escolha == "-" ?
				"Digite um número: " : operacao3;
		
		operacao1 = escolha == "+" ?
				"Digite um número: " : operacao2;
		
		System.out.println(operacao1);
		num1 = entrada.nextDouble();
		
	}

}
