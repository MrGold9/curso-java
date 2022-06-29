package fundamentos.operadores;

public class Aritmeticos 
{
	
	public static void main(String[] args) 
	{
		//Operadores aritméticos
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		 /*
		  Operador de soma (+)
		  Operador de subtração (-) 
		  Operador de multiplicação (*)
		  Operador de divisão (/) 
		 */
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		/*Converter um dos números envolvidos no cálculo para outro 
		tipo irá necessariamente alterar o resultado para o tipo
		condizente*/
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		//Operador % mostra o resto que sobrou de uma divisão
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
		
	}

}
