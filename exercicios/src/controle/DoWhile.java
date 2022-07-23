package controle;

import java.util.Scanner;

public class DoWhile 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		/*No la�o de repeti��o DoWhile o Do executa o bloco de c�digo
		 * sem qualquer tipo de express�o verificada como true ou false
		 * e ap�s a primeira execu��o ele verifica o While, enquanto a
		 * express�o dentro do While for verdadeira, o bloco continuar� 
		 * sendo executado*/
		do 
		{
			System.out.println("Voc� precisa falar "
					+ "as palavras m�gicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} 
		while (!texto.equalsIgnoreCase("por favor"));

		entrada.close();
	}

}
