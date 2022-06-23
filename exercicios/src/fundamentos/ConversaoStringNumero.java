package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero 
{
	
	public static void main(String[] args) 
	{
		//Digitando valores numéricos dentro de Strings
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		
		//Ao somar Strings (mesmo que estes sejam números) 
		//ocorre a concatenação das variáveis
		System.out.println(valor1 + valor2);
		
		
		//Convertendo Strings em variáveis do tipo double
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		//Agora convertidas em tipo numérico, as variáveis podem
		//sofrer alterações através de operações
		double soma = num1 + num2;
		double media = soma / 2;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + media);
		
	}

}
