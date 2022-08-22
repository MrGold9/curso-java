package controle;

import java.util.Scanner;

public class For2 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		//Criando um for com decremento
		for (int i = 10; i >= 0; i -= 2) 
		{
			System.out.println("Contador: " + i);
		}

		
		entrada.close();
	}

}
