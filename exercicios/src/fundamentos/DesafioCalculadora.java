package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	
	public static void main(String[] args) 
	{
		
		// Ler o num1
		// Ler o num2
		// Qual opera��o deseja (+ - * / %)
		
		Scanner entrada = new Scanner(System.in);
		
		//Cria��o e inicializa��o das vari�veis
		String escolha="";
		String seleciona1="", seleciona2="", seleciona3="", seleciona4="",
				seleciona5="";
		Double operacaoSoma=0.0, operacaoSubt=0.0, operacaoMulti=0.0,
				operacaoDiv=0.0, operacaoMod=0.0;
		double num1=0.0, num2=0.0;
		
		
		//Input das vari�veis principais
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Qual opera��o deseja fazer? Digite: "
		+ "1 para +, 2 para -, 3 para *, 4 para / e  5 para %");
		escolha = entrada.next().trim();
		
		//C�lculo de cada opera��o
		operacaoSoma = num1 + num2;
		operacaoSubt = num1 - num2;
		operacaoMulti = num1 * num2;
		operacaoDiv = num1 / num2;
		operacaoMod = num1 % num2;
		
		/*Pergunta se a escolha (n�mero inserido pelo usu�rio) � igual
		ao n�mero correspondente da opera��o, se for verdadeiro vai
		realizar a respectiva opera��o, caso falso vai pular para outro
		booleano at� encontrar a op��o que se encaixa*/
		seleciona1 = escolha.equals("1") ?
				operacaoSoma.toString() : seleciona2;
		
		seleciona2 = escolha.equals("2") ?
				operacaoSubt.toString() : seleciona3;
		
		seleciona3 = escolha.equals("3") ?
				operacaoMulti.toString() : seleciona4;
		
		seleciona4 = escolha.equals("4") ?
				operacaoDiv.toString() : seleciona5;
		
		seleciona5 = escolha.equals("5") ?
				operacaoMod.toString() : "";

		
		//Output final
		System.out.println("O resultado final da opera��o �: " + seleciona1 + seleciona2 + seleciona3 + 
				seleciona4 + seleciona5);
		
		entrada.close();
	}

}
