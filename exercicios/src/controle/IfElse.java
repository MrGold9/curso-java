package controle;

import javax.swing.JOptionPane;

public class IfElse 
{
	
	public static void main(String[] args) 
	{
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		int numero = Integer.parseInt(valor);
		
		//Se o n�mero digitado for dividido por 2 e n�o sobrar resto na
		//opera��o, significa que � um n�mero par
		if(numero % 2 == 0) 
		{
			System.out.println("Este � um n�mero par");
		}
		//else � o bloco de c�digo que � executado quando nenhum if
		//� dado como verdadeiro, logo, cai automaticamente no else
		else
		{
			System.out.println("Este � um n�mero �mpar");
		}
		
	}

}
