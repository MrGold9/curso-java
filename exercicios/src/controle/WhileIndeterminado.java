package controle;

import java.util.Scanner;

public class WhileIndeterminado 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		String digitUsuario="";
		
		/*Neste caso, o la�o de repeti��o While � utilizado de modo
		 * indeterminado e n�o possui um n�mero definido de repeti��es,
		 * fica a crit�rio do usu�rio parar o loop*/
		while (!digitUsuario.equalsIgnoreCase("sair")) 
		{
			System.out.print("Voc� digita: ");
			digitUsuario = entrada.next();
		}
		
		
		entrada.close();
		
	}

}
