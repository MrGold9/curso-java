package avulsos;

import java.util.Scanner;

public class AreaVolumeCaixa {

	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		CalcularAreaVolume(entrada);
		
		entrada.close();

	}
	
	public static void CalcularAreaVolume(Scanner entrada)
	{
		double comprimento, largura, altura, area, volume;
		
		System.out.print("Insira o comprimento da caixa: ");
		comprimento = entrada.nextDouble();
		while (comprimento <= 0) 
		{
			System.out.print("O número não pode ser negativo ou nulo. Insira o comprimento da caixa: ");
			comprimento = entrada.nextDouble();
		}
		
		System.out.print("Insira a largura da caixa: ");
		largura = entrada.nextDouble();
		while (largura <= 0) 
		{
			System.out.print("O número não pode ser negativo ou nulo. Insira a largura da caixa: ");
			largura = entrada.nextDouble();
		}
		
		System.out.print("Insira a altura da caixa: ");
		altura = entrada.nextDouble();
		while (altura <= 0)
		{
			System.out.print("O número não pode ser negativo ou nulo. Insira a altura da caixa: ");
			altura = entrada.nextDouble();
		}
		
		area = 2*((comprimento*largura) + (comprimento*altura) + (largura*altura));
		
		volume = comprimento * largura * altura;
		
		System.out.println("A área da caixa é de: " + area);
		System.out.println("O volume da caixa é de: " + volume);
	}

}
