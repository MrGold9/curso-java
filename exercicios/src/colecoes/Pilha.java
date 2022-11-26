package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha 
{
	
	public static void main(String[] args) 
	{
		
		//Criando uma pilha de elementos String
		//O primeiro a entrar � o �ltimo a sair
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Pr�ncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		//Imprimindo todos os elementos da pilha
		System.out.println(livros.toString());
		
		//Retornando o primeiro elemento da pilha
		System.out.println(livros.peek() + " - peek");
		System.out.println(livros.element() + " - element");
		
		// .pop remove o primeiro elemento da pilha
		System.out.println(livros.pop() + " - pop");
		
		// .poll remove o pr�ximo elemento da pilha
		System.out.println(livros.poll() + " - poll");
		
	}

}
