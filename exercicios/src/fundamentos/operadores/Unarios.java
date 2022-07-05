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
		 O retorno será true porque o algoritmo funciona da esquerda
		para a direita, então o programa vai incrementar +1 na
		variável a, comparar e só depois decrementar -1 na 
		variável b. Resultado segundo esta ordem do programa para o
		retorno true na comparação: a = 2 e b = 2
		*/
		System.out.println(++a == b--);
		/*
		 Resultado correto após as operações de incremento e
		decremento retornando false para a comparação: a = 2 e b = 1
		*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
