package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) 
	{
		
		//Comando print mostra as informações no console em sequência
		//sem quebra de linhha
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		//Comando println mostra as informações no console e quebra
		//uma linha em seguida
		System.out.println("Bom");
		System.out.println("dia!");
		
		//Comando printf permite a formatação de dados e o uso
		//do %n para quebra de linha
		System.out.printf("Megasena: %d %d %d %d %d", 
				1, 2, 3, 4, 5, 6);
		
		
		// %.1f representa um número real que será mostrado com
		//apenas uma casa decimal depois da vírgula
		System.out.printf("\nSalário: %.1f%n", 1234.5678);
		
		// %s representa uma String
		System.out.printf("Nome: %s%n", "João");
		
		
		
		//Input e Output
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n");
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Seu nome é %s %s e você tem %d anos",
				nome, sobrenome, idade);
		
		entrada.close();
		
	}

}
