package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	
	public static void main(String[] args) 
	{
		
		// Ler o num1
		// Ler o num2
		// Qual operação deseja (+ - * / %)
		
		Scanner entrada = new Scanner(System.in);
		
		//Criação e inicialização das variáveis
		String escolha="";
		String resultado="";
		String resultadoFinal="";
		Double operacaoSoma=0.0, operacaoSubt=0.0, operacaoMulti=0.0,
				operacaoDiv=0.0, operacaoMod=0.0;
		double num1=0.0, num2=0.0;
		
		
		//Input das variáveis principais
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Qual operação deseja fazer? Digite: "
		+ "+ para adição, - para subtração, * para multiplicação, "
		+ "/ para divisão e % para resto de divisão");
		escolha = entrada.next().trim();
		
		//Cálculo de cada operação
		operacaoSoma = num1 + num2;
		operacaoSubt = num1 - num2;
		operacaoMulti = num1 * num2;
		operacaoDiv = num1 / num2;
		operacaoMod = num1 % num2;
		
		/*Pergunta se a escolha (número inserido pelo usuário) é igual
		ao número correspondente da operação, se for verdadeiro vai
		realizar a respectiva operação, caso falso vai pular para outro
		booleano até encontrar a opção que se encaixa*/
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
