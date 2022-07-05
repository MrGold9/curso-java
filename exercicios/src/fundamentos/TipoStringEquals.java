package fundamentos;

import java.util.Scanner;

public class TipoStringEquals 
{
	
	public static void main(String[] args) 
	{
		//Quando a comparação de Strings é feita dessa forma não causa
		//nenhum conflito e retorna true corretamente
		System.out.println("2" == "2");
		
		//Ao criar uma String deste modo o retorno será false
	    //incorretamente, isso se dá através dos conflitos internos 
		//do Java
		String s = new String ("2");
		System.out.println("2" == s);
		//Neste caso, o método .equals compara as Strings da maneira
		//certa e retorna true corretamente
		System.out.println("2".equals(s));
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		//Aqui o sistema retorna false incorretamente
		System.out.println("2" == s2);
		//Após o uso dos métodos .equals (comparação) e .trim 
		//(remover os espaços em branco) o sistema retorna true 
		//corretamente
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}

}
