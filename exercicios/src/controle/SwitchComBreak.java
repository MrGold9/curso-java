package controle;

import java.util.Scanner;

public class SwitchComBreak 
{
	
	public static void main(String[] args) 
	{
		//O break serve para parar a execu��o de um bloco
		//de c�digo a partir da respectiva linha e voltar
		//ao escopo anterior
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		int nota = 0;
		
		System.out.println("Informe a nota: ");
		nota = entrada.nextInt();
		
		switch(nota) 
		{
		
		case 10: case 9:
			conceito = "A";
			break;
			
		case 8: case 7:
			conceito = "B";
			break;
			
		case 6: case 5:
			conceito = "C";
			break;
			
		case 4: case 3:
			conceito = "D";
			break;
			
		case 2: case 1:
			conceito = "E";
			break;
			
		case 0:
			conceito = "F";
			break;
			
		default:
			conceito = "inv�lido!";
//			break;
			
		}
		
		System.out.println("O conceito � " + conceito);
		
		entrada.close();
	}

}
