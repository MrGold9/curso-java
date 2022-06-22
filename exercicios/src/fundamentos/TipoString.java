package fundamentos;

public class TipoString 
{
	
	public static void main(String[] args) 
	{
		//Strings e a utiliza��o do operador ponto (.)
		
		
		//Mostrar o caractere na posi��o 2 dentro da String
		//Obs: posi��es de caracteres em Strings s�o contadas atrav�s de Arrays, deste modo, come�ando pelo n�mero 0
		System.out.println("Ol� pessoal".charAt(2));
		

		String a = "Boa tarde";
		
		//Concatena��o atrav�s do operador ponto (.)
		System.out.println(a.concat("!!!"));
		
		//Concatena��o com sinal de adi��o (+)
		System.out.println(a + "!!!");
		
		//Pergunta se a String come�a com "Boa" (booleano, ou seja, retorna true ou false)
		System.out.println(a.startsWith("Boa"));
		
		//Coloca todos os caracteres da String em letras min�sculas e pergunta se a String come�a com "boa"
		System.out.println(a.toLowerCase().startsWith("boa"));
		
		//Coloca todos os caracteres da String em letras mai�sculas e pergunta se termina com "TARDE"
		System.out.println(a.toUpperCase().endsWith("TARDE"));
		
		//Retorna o tamanho da String em valor num�rico (espa�os em branco s�o considerados)
		System.out.println(a.length());
		
		//Coloca todos os caracteres da String em letras min�sculas e pergunta se a String � igual a "boa tarde"
		System.out.println(a.toLowerCase().equals("boa tarde"));
		
		//Pergunta se a String � igual a "boa tarde" e pede para ignorar a diferen�a entre letras mai�sculas
		//e min�sculas entre a String digitada e a String declarada
		System.out.println(a.equalsIgnoreCase("boa tarde"));
		
		//Pergunta se a String cont�m em qualquer posi��o a s�rie de caracteres "qual"
		System.out.println("Frase qualquer".contains("qual"));
		
		//Retorna a posi��o inicial da palavra "qual"
		System.out.println("Frase qualquer".indexOf("qual"));
		
		//Retorna a String a partir da posi��o 6 para frente
		System.out.println("Frase qualquer".substring(6));
		
		//Retorna a String dentro de um intervalo entre a posi��o 6 at� a posi��o 10
		System.out.println("Frase qualquer".substring(6,10));
		
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		//Utiliza��o do \n para pular para a pr�xima linha
		System.out.println("\nNome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSal�rio: " + salario);
		
		//%s representa String, %d representa um tipo num�rico inteiro e %f representa um tipo num�rico real
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$ %f",
				nome, sobrenome, idade, salario);
		
		//Armazenando a mesma frase dentro de uma vari�vel tipo String
		//Obs: o .2 significa que o console s� ir� mostrar 2 casas decimais depois da v�rgula
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
