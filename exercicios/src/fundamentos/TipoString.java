package fundamentos;

public class TipoString 
{
	
	public static void main(String[] args) 
	{
		//Strings e a utilização do operador ponto (.)
		
		
		//Mostrar o caractere na posição 2 dentro da String
		//Obs: posições de caracteres em Strings são contadas através de Arrays, deste modo, começando pelo número 0
		System.out.println("Olá pessoal".charAt(2));
		

		String a = "Boa tarde";
		
		//Concatenação através do operador ponto (.)
		System.out.println(a.concat("!!!"));
		
		//Concatenação com sinal de adição (+)
		System.out.println(a + "!!!");
		
		//Pergunta se a String começa com "Boa" (booleano, ou seja, retorna true ou false)
		System.out.println(a.startsWith("Boa"));
		
		//Coloca todos os caracteres da String em letras minúsculas e pergunta se a String começa com "boa"
		System.out.println(a.toLowerCase().startsWith("boa"));
		
		//Coloca todos os caracteres da String em letras maiúsculas e pergunta se termina com "TARDE"
		System.out.println(a.toUpperCase().endsWith("TARDE"));
		
		//Retorna o tamanho da String em valor numérico (espaços em branco são considerados)
		System.out.println(a.length());
		
		//Coloca todos os caracteres da String em letras minúsculas e pergunta se a String é igual a "boa tarde"
		System.out.println(a.toLowerCase().equals("boa tarde"));
		
		//Pergunta se a String é igual a "boa tarde" e pede para ignorar a diferença entre letras maiúsculas
		//e minúsculas entre a String digitada e a String declarada
		System.out.println(a.equalsIgnoreCase("boa tarde"));
		
		//Pergunta se a String contém em qualquer posição a série de caracteres "qual"
		System.out.println("Frase qualquer".contains("qual"));
		
		//Retorna a posição inicial da palavra "qual"
		System.out.println("Frase qualquer".indexOf("qual"));
		
		//Retorna a String a partir da posição 6 para frente
		System.out.println("Frase qualquer".substring(6));
		
		//Retorna a String dentro de um intervalo entre a posição 6 até a posição 10
		System.out.println("Frase qualquer".substring(6,10));
		
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		//Utilização do \n para pular para a próxima linha
		System.out.println("\nNome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalário: " + salario);
		
		//%s representa String, %d representa um tipo numérico inteiro e %f representa um tipo numérico real
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$ %f",
				nome, sobrenome, idade, salario);
		
		//Armazenando a mesma frase dentro de uma variável tipo String
		//Obs: o .2 significa que o console só irá mostrar 2 casas decimais depois da vírgula
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
