package fundamentos.operadores;

public class Unarios 
{
	
	public static void main(String[] args) 
	{
		
		int a = 1;
		int b = 2;
		
		// ++ incremento
		// -- decremento
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		b++; // b = b + 1;
		b--; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("Mini Desafio...");
		/*
		 O retorno ser� true porque o algoritmo funciona da esquerda
		para a direita, ent�o o programa vai incrementar +1 na
		vari�vel a, comparar e s� depois decrementar -1 na 
		vari�vel b. Resultado segundo esta ordem do programa para o
		retorno true na compara��o: a = 2 e b = 2
		*/
		System.out.println(++a == b--);
		/*
		 Resultado correto ap�s as opera��es de incremento e
		decremento retornando false para a compara��o: a = 2 e b = 1
		*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
