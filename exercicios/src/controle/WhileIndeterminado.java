package controle;

import java.util.Scanner;

public class WhileIndeterminado 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		String digitUsuario="";
		
		/*Neste caso, o laço de repetição While é utilizado de modo
		 * indeterminado e não possui um número definido de repetições,
		 * fica a critério do usuário parar o loop*/
		while (!digitUsuario.equalsIgnoreCase("sair")) 
		{
			System.out.print("Você digita: ");
			digitUsuario = entrada.next();
		}
		
		
		entrada.close();
		
	}

}
