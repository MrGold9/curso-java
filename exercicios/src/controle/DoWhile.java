package controle;

import java.util.Scanner;

public class DoWhile 
{
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		/*No laço de repetição DoWhile o Do executa o bloco de código
		 * sem qualquer tipo de expressão verificada como true ou false
		 * e após a primeira execução ele verifica o While, enquanto a
		 * expressão dentro do While for verdadeira, o bloco continuará 
		 * sendo executado*/
		do 
		{
			System.out.println("Você precisa falar "
					+ "as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} 
		while (!texto.equalsIgnoreCase("por favor"));

		entrada.close();
	}

}
