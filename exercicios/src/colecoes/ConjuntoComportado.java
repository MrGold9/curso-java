package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado 
{
	
	public static void main(String[] args) 
	{
		/*HashSet -> N�o � ordenado, ou seja, no print sair� os elementos aleatoriamente
		  Obs: o termo entre <> define o tipo do conjunto*/
		//Set<String> listaAprovados = new HashSet<String>();
		
		/*O SortedSet permite que os elementos sejam ordenados em um crit�rio espec�fico
		  O TreeSet faz com que os elementos sejam retornados na ordem de inser��o*/
		SortedSet<String> listaAprovados = new TreeSet<String>();
		
		
		//Adicionando elementos ao conjunto
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) 
		{
			System.out.println(candidato);
		}
		
		
		//Conjunto de n�meros inteiros (int)
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (Integer num : nums) 
		{
			System.out.println(num);
		}
		
	}

}
