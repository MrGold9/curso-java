package avulsos;

import java.util.Scanner;

public class CalculadoraSomaDoisNumeros 
{
	
	public static void main(String[] args) 
	{
		//Calculadora de soma entre dois números
		
		//Declarando as variáveis
		int num1=0, num2=0, soma=0;
		String juncao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		//Fórmula da adição
		soma = num1 + num2;
		//Junção dos tipos numéricos transformando em Strings
		//para evitar a soma entre eles
		juncao = Integer.toString(num1) + " + " + 
		Integer.toString(num2) + " = " + 
		Integer.toString(soma);
		
		//Resultado final
		System.out.println(juncao);
		
		entrada.close();
		
	}

}
