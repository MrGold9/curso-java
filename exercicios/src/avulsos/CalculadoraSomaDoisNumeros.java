package avulsos;

import java.util.Scanner;

public class CalculadoraSomaDoisNumeros 
{
	
	public static void main(String[] args) 
	{
		//Calculadora de soma entre dois n�meros
		
		//Declarando as vari�veis
		int num1=0, num2=0, soma=0;
		String juncao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextInt();
		
		//F�rmula da adi��o
		soma = num1 + num2;
		//Jun��o dos tipos num�ricos transformando em Strings
		//para evitar a soma entre eles
		juncao = Integer.toString(num1) + " + " + 
		Integer.toString(num2) + " = " + 
		Integer.toString(soma);
		
		//Resultado final
		System.out.println(juncao);
		
		entrada.close();
		
	}

}
