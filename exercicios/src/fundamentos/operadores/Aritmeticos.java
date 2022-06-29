package fundamentos.operadores;

public class Aritmeticos 
{
	
	public static void main(String[] args) 
	{
		//Operadores aritm�ticos
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		 /*
		  Operador de soma (+)
		  Operador de subtra��o (-) 
		  Operador de multiplica��o (*)
		  Operador de divis�o (/) 
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
		/*Converter um dos n�meros envolvidos no c�lculo para outro 
		tipo ir� necessariamente alterar o resultado para o tipo
		condizente*/
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		//Operador % mostra o resto que sobrou de uma divis�o
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
		
	}

}
