package controle;

import java.util.Scanner;

public class If 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		//No if se a opera��o entre par�nteses for verdadeira, significa
		//que este ser� o bloco de c�digo a ser executado
		if (media >= 7.0 && media <= 10.0) 
		{
			System.out.println("Parab�ns! Voc� foi aprovado.");
		}
		
		if (media < 7.0 && media >= 4.5) 
		{
			System.out.println("Voc� est� de recupera��o.");
		}
		
		if (media < 4.5 && media >= 0)
		{
			System.out.println("Voc� foi reprovado.");
		}
		
		
		entrada.close();
		
	}

}
