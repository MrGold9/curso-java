package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	
	public static void main(String[] args) 
	{
		
		// Ler o num1
		// Ler o num2
		// Qual opera��o deseja (+ - * / %)
		
		Scanner entrada = new Scanner(System.in);
		
		String escolha;
		String operacao1, operacao2, operacao3, operacao4,
				operacao5;
		double num1, num2, resultado;
		
		System.out.print("Qual opera��o deseja fazer? + - * / % ");
		escolha = entrada.nextLine().trim();
		
		operacao5 = escolha == "%" ?
				"Digite um n�mero: " : "Digite uma opera��o v�lida.";
		
		operacao4 = escolha == "/" ?
				"Digite um n�mero: " : operacao5;
		
		operacao3 = escolha == "*" ?
				"Digite um n�mero: " : operacao4;
		
		operacao2 = escolha == "-" ?
				"Digite um n�mero: " : operacao3;
		
		operacao1 = escolha == "+" ?
				"Digite um n�mero: " : operacao2;
		
		System.out.println(operacao1);
		num1 = entrada.nextDouble();
		
	}

}
