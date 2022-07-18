package controle;

import javax.swing.JOptionPane;

public class IfElse 
{
	
	public static void main(String[] args) 
	{
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);
		
		//Se o número digitado for dividido por 2 e não sobrar resto na
		//operação, significa que é um número par
		if(numero % 2 == 0) 
		{
			System.out.println("Este é um número par");
		}
		//else é o bloco de código que é executado quando nenhum if
		//é dado como verdadeiro, logo, cai automaticamente no else
		else
		{
			System.out.println("Este é um número ímpar");
		}
		
	}

}
