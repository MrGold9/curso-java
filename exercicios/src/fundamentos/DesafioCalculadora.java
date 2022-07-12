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
		String resultado="";
		String resultadoFinal="";
		Double operacaoSoma=0.0, operacaoSubt=0.0, operacaoMulti=0.0,
				operacaoDiv=0.0, operacaoMod=0.0;
		double num1=0.0, num2=0.0;
		
		
		//Input das vari�veis principais
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Qual opera��o deseja fazer? Digite: "
		+ "+ para adi��o, - para subtra��o, * para multiplica��o, "
		+ "/ para divis�o e % para resto de divis�o");
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
		resultado = escolha.equals("+") ?
				operacaoSoma.toString() : "0";
		
		resultado = escolha.equals("-") ?
				operacaoSubt.toString() : resultado;
		
		resultado = escolha.equals("*") ?
				operacaoMulti.toString() : resultado;
		
		resultado = escolha.equals("/") ?
				operacaoDiv.toString() : resultado;
		
		resultado = escolha.equals("%") ?
				operacaoMod.toString() : resultado;
		

		//Armazenando os dados dentro de uma String
		resultadoFinal = num1 + " " + escolha + " " + num2 + " = " + resultado;
		
		//Output final
		System.out.println(resultadoFinal);
		
		entrada.close();
	}

}
