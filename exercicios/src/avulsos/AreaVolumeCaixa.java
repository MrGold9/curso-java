package avulsos;

import java.util.Scanner;

public class AreaVolumeCaixa {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		
		CalcularArea();
		
		System.out.println(resultadoArea);
		
		entrada.close();

	}
	
	public static void CalcularArea()
	{
		Scanner entrada = new Scanner(System.in);
		
		double lado1, lado2, resultadoArea;
		
		System.out.print("Insira o primeiro lado da caixa: ");
		lado1 = entrada.nextDouble();
		
		System.out.print("Insira o segundo da caixa: ");
		lado2 = entrada.nextDouble();
		
		static resultadoArea = lado1 * lado2;
		
		entrada.close();
	}

}
