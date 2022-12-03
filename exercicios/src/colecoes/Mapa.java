package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa 
{
	
	public static void main(String[] args) 
	{
		//Criando um mapa
		//Integer (chave) --- String (valor)
		Map<Integer, String> usuarios = new HashMap<>();
		
		// O .put não apenas adiciona uma chave e um valor no mapa,
		//mas também altera o valor atribuído a uma chave existente
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Rafael");
		System.out.println(usuarios.toString());
		
		usuarios.put(1, "Ronaldo");
		usuarios.put(3, "Danilo");
		usuarios.put(4, "Guilherme");
		usuarios.put(5, "Vanessa");
		System.out.println(usuarios.toString());
		
		//Remove o elemento apenas através da chave e retorna o valor
		System.out.println(usuarios.remove(4));
		//Remove o elemento com a chave e o valor e retorna true
		//caso encontrado e removido
		System.out.println(usuarios.remove(5, "Vanessa"));
		
		System.out.println("Tamanho do mapa: " + usuarios.size());
		
		// .keySet retorna apenas as chaves registradas
		System.out.println("keySet: " + usuarios.keySet());
		
		// .values retorna apenas os valores de cada chave
		System.out.println("values: " + usuarios.values());
		
		// .entrySet retorna as chaves e seus respectivos valores
		System.out.println("entrySet: " + usuarios.entrySet());
		
		// .containsKey pergunta se o mapa possui a chave específica
		System.out.println("Contém a chave 3? " + usuarios.containsKey(3));
		
		// .containsValue pergunta se o mapa possui o valor específico
		System.out.println("Contém o valor 'Carlos'? " + usuarios.containsValue("Carlos"));
		
		
		//Percorrendo todas as chaves de um mapa
		for (int chave : usuarios.keySet()) 
		{
			System.out.println(chave);
		}
		
		//Percorrendo todos os valores de um mapa
		for (String valor : usuarios.values()) 
		{
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) 
		{
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
		
	}

}
