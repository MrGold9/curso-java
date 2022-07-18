package controle;

import java.util.Scanner;

public class IfElseIf 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		/*O else if � interligado com o primeiro if do c�digo, caso o
		 * primeiro if seja falso, vai passar de else if em else if
		 * um de cada vez at� encontrar a express�o verdadeira. 
		 * O else if � utilizado para evitar a execu��o de dois
		 * c�digos ou mais simultaneamente, se fossemos utilizar ifs em
		 * todos esse blocos de c�digo e duas express�es fossem 
		 * verdadeiras, ambas seriam executadas, quando utilizamos
		 * apenas else ifs, ap�s a execu��o de um �nico bloco, o sistema
		 * pula todos os seguintes*/
		if(nota > 10 || nota < 0) 
		{
			System.out.println("Nota inv�lida.");
		}
		else if(nota <= 10 && nota >= 7)
		{
			System.out.println("Voc� foi aprovado!");
		}
		else if(nota <= 6 && nota >= 4)
		{
			System.out.println("Voc� est� de recupera��o.");
		}
		else
		{
			System.out.println("Voc� foi reprovado.");
		}
		
		
		entrada.close();
		
	}

}
