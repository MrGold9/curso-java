package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero 
{
	
	public static void main(String[] args) 
	{
		//Digitando valores num�ricos dentro de Strings
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero: ");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero: ");
		
		//Ao somar Strings (mesmo que estes sejam n�meros) 
		//ocorre a concatena��o das vari�veis
		System.out.println(valor1 + valor2);
		
		
		//Convertendo Strings em vari�veis do tipo double
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		//Agora convertidas em tipo num�rico, as vari�veis podem
		//sofrer altera��es atrav�s de opera��es
		double soma = num1 + num2;
		double media = soma / 2;
		System.out.println("Soma � " + soma);
		System.out.println("M�dia � " + media);
		
	}

}
