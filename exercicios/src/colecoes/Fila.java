package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila 
{
	
	public static void main(String[] args) 
	{
		
		//Criando uma fila de elementos do tipo String
		//O primeiro a entrar � o primeiro a sair
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//A diferen�a � o comportamento que ocorre quando a fila est� cheia
		fila.add("Ana"); // Retorna null
		fila.offer("Bia"); // Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		
		
		//Peek e Element -> obter o pr�ximo elemento da fila (sem remover)
		//A diferen�a � o comportamento que ocorre quando a fila est� vazia
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.element()); // Lan�a um exce��o
		
		
		//Poll e remove -> Obter o pr�ximo elemento da fila e remover
		//A diferen�a ocorre quando a fila est� vazia
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		/*Ver quantos elementos a fila possui*/
		//fila.size();
		
		/*Limpa a lista*/
		//fila.clear();
		
		/*Pergunta se a lista est� vazia*/
		//fila.isEmpty();
		
		/*Pergunta se "x" est� na lista*/
		//fila.contains("x");
		
	}

}
