package controle;

import java.util.Scanner;

public class DesafioWhile 
{
	
	public static void main(String[] args) 
	{
		/*O usuário digita múltiplas notas no terminal e estas notas são
		 * somadas na variável total, quando o usuário digita uma nota
		 * válida (maior ou igual a 0 ou menor ou igual a 10) o sistema
		 * computa isto e adiciona +1 na variável contNotas (contador 
		 * de notas válidas), quando o usuário insere uma nota inválida 
		 * (menor que 0 ou maior que 10) o sistema retorna uma mensagem
		 * requisitando uma nota válida. Para sair do loop e ver a média
		 * das notas o usuário deve digitar -1*/
		
		Scanner entrada = new Scanner(System.in);

		//Inicialização das variáveis
		double nota = 0, media = 0, total = 0;
		int contNotas = 0;
		
		//Enquanto a nota digitada for diferente de -1, o loop
		//continuará rodando
		while (nota != -1) 
		{
			System.out.println("Quantidade de notas válidas digitadas: "
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
				System.out.println("Digite uma nota válida!");
			}
			
			total += nota;
		}
		//Retirando o erro do valor total. Quando o usuário colocar -1
		//ao inserir a nota o mesmo valor será retirado do total, então
		//estamos repondo este valor
		total = total + 1;
		
		media = total / contNotas;
		
		//Utilizando printf para formatar 2 casas decimais depois da
		//vírgula na variável media
		System.out.printf("A média das notas é: %.2f", media);

		entrada.close();
		
	}

}
