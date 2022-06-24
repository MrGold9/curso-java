package fundamentos;

import java.util.Scanner;

public class DesafioConversao 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		//Declarando e inserindo os salários como Strings
		String salario1, salario2, salario3;
		
		/*Usando o .replace para não dar erro quando o usuário
		digitar "," ao invés de "." para digitar as casas
		decimais*/
		System.out.println("Digite o primeiro salário: ");
		salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo salário: ");
		salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		salario3 = entrada.next().replace(",", ".");
		
		//Transformando cada salário em tipo numérico para que
		//o cálculo da média possa ser feito
		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);
		double media = (num1+num2+num3)/3;
		
		//Média dos salários
		System.out.println("A média do salário é: " + media);
		
		
		
		entrada.close();
		
	}

}
