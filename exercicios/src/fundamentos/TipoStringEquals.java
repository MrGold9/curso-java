package fundamentos;

import java.util.Scanner;

public class TipoStringEquals 
{
	
	public static void main(String[] args) 
	{
		//Quando a compara��o de Strings � feita dessa forma n�o causa
		//nenhum conflito e retorna true corretamente
		System.out.println("2" == "2");
		
		//Ao criar uma String deste modo o retorno ser� false
	    //incorretamente, isso se d� atrav�s dos conflitos internos 
		//do Java
		String s = new String ("2");
		System.out.println("2" == s);
		//Neste caso, o m�todo .equals compara as Strings da maneira
		//certa e retorna true corretamente
		System.out.println("2".equals(s));
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		//Aqui o sistema retorna false incorretamente
		System.out.println("2" == s2);
		//Ap�s o uso dos m�todos .equals (compara��o) e .trim 
		//(remover os espa�os em branco) o sistema retorna true 
		//corretamente
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}

}
