package controle;

import java.util.Scanner;

public class DesafioDiaSemana 
{
	
	public static void main(String[] args) 
	{
		
		// Domingo -> 1
		// Segunda -> 2
		// Ter�a   -> 3
		// Quarta  -> 4
		// Quinta  -> 5
		// Sexta   -> 6
		// S�bado  -> 7
		
		/*Ao digitar o dia da semana, o sistema retornar� o n�mero do
		do dia em espec�fico*/
		
		Scanner entrada = new Scanner(System.in);
		
		int domingo = 1, segunda = 2, terca = 3, quarta = 4, quinta = 5,
				sexta = 6, sabado = 7;
		String diaSemana;
		
		// .trim para remover espa�os em branco
		// .toLowerCase para colocar todas as letras em min�sculas
		System.out.print("Digite um dia da semana: ");
		diaSemana = entrada.next().trim().toLowerCase();
		
		//Caso o primeiro if seja falso, vai pular de else if em else if
		//at� encontrar uma express�o verdadeira ou cair em else
		/*Obs: ao inv�s de .equals o .equalsIgnoreCase poderia ser usado
		para ignorar diferen�as entre letras mai�sculas e min�sculas,
		sendo assim, desnecess�rio o uso do .toLowerCase*/
		if(diaSemana.equals("domingo"))
		{
			System.out.println(domingo);
		}
		else if(diaSemana.equals("segunda"))
		{
			System.out.println(segunda);
		}
		else if(diaSemana.equals("ter�a") || diaSemana.equals("terca"))
		{
			System.out.println(terca);
		}
		else if(diaSemana.equals("quarta"))
		{
			System.out.println(quarta);
		}
		else if(diaSemana.equals("quinta"))
		{
			System.out.println(quinta);
		}
		else if(diaSemana.equals("sexta"))
		{
			System.out.println(sexta);
		}
		else if(diaSemana.equals("s�bado") || diaSemana.equals("sabado"))
		{
			System.out.println(sabado);
		}
		//Exception
		else
		{
			System.out.println("Digite um dia da semana!");
		}
		
		entrada.close();
	}

}
