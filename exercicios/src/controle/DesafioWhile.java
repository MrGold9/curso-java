package controle;

import java.util.Scanner;

public class DesafioWhile 
{
	
	public static void main(String[] args) 
	{
		/*O usu�rio digita m�ltiplas notas no terminal e estas notas s�o
		 * somadas na vari�vel total, quando o usu�rio digita uma nota
		 * v�lida (maior ou igual a 0 ou menor ou igual a 10) o sistema
		 * computa isto e adiciona +1 na vari�vel contNotas (contador 
		 * de notas v�lidas), quando o usu�rio insere uma nota inv�lida 
		 * (menor que 0 ou maior que 10) o sistema retorna uma mensagem
		 * requisitando uma nota v�lida. Para sair do loop e ver a m�dia
		 * das notas o usu�rio deve digitar -1*/
		
		Scanner entrada = new Scanner(System.in);

		//Inicializa��o das vari�veis
		double nota = 0, media = 0, total = 0;
		int contNotas = 0;
		
		//Enquanto a nota digitada for diferente de -1, o loop
		//continuar� rodando
		while (nota != -1) 
		{
			System.out.println("Quantidade de notas v�lidas digitadas: "
					+ contNotas 
					+ "\nDigite a nota de cada aluno"
					+ " (digite -1 para sair): ");
			nota = entrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) 
			{
				contNotas++;
			}
			if (nota > 10 || nota < 0 && nota != -1) 
			{
				System.out.println("Digite uma nota v�lida!");
			}
			
			total += nota;
		}
		//Retirando o erro do valor total. Quando o usu�rio colocar -1
		//ao inserir a nota o mesmo valor ser� retirado do total, ent�o
		//estamos repondo este valor
		total = total + 1;
		
		media = total / contNotas;
		
		//Utilizando printf para formatar 2 casas decimais depois da
		//v�rgula na vari�vel media
		System.out.printf("A m�dia das notas �: %.2f", media);

		entrada.close();
		
	}

}
