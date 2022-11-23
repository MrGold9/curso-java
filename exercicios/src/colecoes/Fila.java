package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila 
{
	
	public static void main(String[] args) 
	{
		
		//Criando uma fila de elementos do tipo String
		//O primeiro a entrar é o primeiro a sair
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//A diferença é o comportamento que ocorre quando a fila está cheia
		fila.add("Ana"); // Retorna null
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		
		
		//Peek e Element -> obter o próximo elemento da fila (sem remover)
		//A diferença é o comportamento que ocorre quando a fila está vazia
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.element()); // Lança um exceção
		
		
		//Poll e remove -> Obter o próximo elemento da fila e remover
		//A diferença ocorre quando a fila está vazia
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		/*Ver quantos elementos a fila possui*/
		//fila.size();
		
		/*Limpa a lista*/
		//fila.clear();
		
		/*Pergunta se a lista está vazia*/
		//fila.isEmpty();
		
		/*Pergunta se "x" está na lista*/
		//fila.contains("x");
		
	}

}
