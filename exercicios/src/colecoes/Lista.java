package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista 
{
	
	public static void main(String[] args) 
	{
		//Listas possuem índices, aceitam objetos duplicados e são ordenadas
		List<Usuario> lista = new ArrayList<>();
		
		//Adicionando usuários de dois modos diferentes
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //Acessando pelo índice
		
		//Removendo um elemento através do índice e retornando o mesmo
		System.out.println(">>>> " + lista.remove(1));
		//Removendo um elemento da lista "manualmente"
		System.out.println(lista.remove(new Usuario("Manu")));
		
		//Pergunta se o elemento "Lia" existe na lista
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		//Pergunta se o objeto u1 existe na lista
		System.out.println("Tem? " + lista.contains(u1));
		
		//FOREACH
		for (Usuario u : lista) 
		{
			System.out.println(u.nome);	
		}
		
		//Retornando resultado final da lista
		System.out.println(lista);
		
	}

}
