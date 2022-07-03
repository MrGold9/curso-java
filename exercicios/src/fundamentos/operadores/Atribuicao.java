package fundamentos.operadores;

public class Atribuicao 
{
	
	public static void main(String[] args) 
	{
		
		int a = 3;
		int b = a; // 3
		int c = a + b; // 6
		System.out.println(c);
		
		//Atribui��o aditiva
		c += b; // c = c + b;
		System.out.println(c);
		
		//Atribui��o subtrativa
		c -= a; // c = c - b;
		System.out.println(c);
		
		//Atribui��o multiplicativa
		c *= b; // c = c * b;
		System.out.println(c);
		
		//Atribui��o divisiva
		c /= a; // c = c / b;
		System.out.println(c);
		
		//Atribui��o modular
		c %= 2; // c = c % 2;
		System.out.println(c);
		
		c++; // c = c + 1;
		System.out.println(c);
		
	}

}
