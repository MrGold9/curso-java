package fundamentos;

import java.util.Scanner;

public class DesafioConversao 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		//Declarando e inserindo os sal�rios como Strings
		String salario1, salario2, salario3;
		
		/*Usando o .replace para n�o dar erro quando o usu�rio
		digitar "," ao inv�s de "." para digitar as casas
		decimais*/
		System.out.println("Digite o primeiro sal�rio: ");
		salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo sal�rio: ");
		salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro sal�rio: ");
		salario3 = entrada.next().replace(",", ".");
		
		//Transformando cada sal�rio em tipo num�rico para que
		//o c�lculo da m�dia possa ser feito
		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);
		double media = (num1+num2+num3)/3;
		
		//M�dia dos sal�rios
		System.out.println("A m�dia do sal�rio �: " + media);
		
		
		
		entrada.close();
		
	}

}
