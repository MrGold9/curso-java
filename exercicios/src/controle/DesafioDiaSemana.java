package controle;

import java.util.Scanner;

public class DesafioDiaSemana 
{
	
	public static void main(String[] args) 
	{
		
		// Domingo -> 1
		// Segunda -> 2
		// Terça   -> 3
		// Quarta  -> 4
		// Quinta  -> 5
		// Sexta   -> 6
		// Sábado  -> 7
		
		/*Ao digitar o dia da semana, o sistema retornará o número do
		do dia em específico*/
		
		Scanner entrada = new Scanner(System.in);
		
		int domingo = 1, segunda = 2, terca = 3, quarta = 4, quinta = 5,
				sexta = 6, sabado = 7;
		String diaSemana;
		
		// .trim para remover espaços em branco
		// .toLowerCase para colocar todas as letras em minúsculas
		System.out.print("Digite um dia da semana: ");
		diaSemana = entrada.next().trim().toLowerCase();
		
		//Caso o primeiro if seja falso, vai pular de else if em else if
		//até encontrar uma expressão verdadeira ou cair em else
		/*Obs: ao invés de .equals o .equalsIgnoreCase poderia ser usado
		para ignorar diferenças entre letras maiúsculas e minúsculas,
		sendo assim, desnecessário o uso do .toLowerCase*/
		if(diaSemana.equals("domingo"))
		{
			System.out.println(domingo);
		}
		else if(diaSemana.equals("segunda"))
		{
			System.out.println(segunda);
		}
		else if(diaSemana.equals("terça") || diaSemana.equals("terca"))
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
		else if(diaSemana.equals("sábado") || diaSemana.equals("sabado"))
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
