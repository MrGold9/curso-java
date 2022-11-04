package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado 
{
	
	//Silenciar advertências
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		//Criando um conjunto heterogêneo
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		//.size mostra o tamanho do conjunto
		System.out.println("O tamanho é: " + conjunto.size());
		
		//.add adiciona elementos ao conjunto
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("O tamanho é: " + conjunto.size());
		
		//.remove elimina um elemento do conjunto
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("O tamanho é: " + conjunto.size());
		
		// .contains retorna true/false para a pesquisa correspondente
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // interseção entre dois conjuntos
		
		// .clear limpa todos os elementos de um conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
