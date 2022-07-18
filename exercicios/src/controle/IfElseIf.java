package controle;

import java.util.Scanner;

public class IfElseIf 
{
	
	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		/*O else if é interligado com o primeiro if do código, caso o
		 * primeiro if seja falso, vai passar de else if em else if
		 * um de cada vez até encontrar a expressão verdadeira. 
		 * O else if é utilizado para evitar a execução de dois
		 * códigos ou mais simultaneamente, se fossemos utilizar ifs em
		 * todos esse blocos de código e duas expressões fossem 
		 * verdadeiras, ambas seriam executadas, quando utilizamos
		 * apenas else ifs, após a execução de um único bloco, o sistema
		 * pula todos os seguintes*/
		if(nota > 10 || nota < 0) 
		{
			System.out.println("Nota inválida.");
		}
		else if(nota <= 10 && nota >= 7)
		{
			System.out.println("Você foi aprovado!");
		}
		else if(nota <= 6 && nota >= 4)
		{
			System.out.println("Você está de recuperação.");
		}
		else
		{
			System.out.println("Você foi reprovado.");
		}
		
		
		entrada.close();
		
	}

}
