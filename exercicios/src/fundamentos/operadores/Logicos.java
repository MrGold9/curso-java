package fundamentos.operadores;

public class Logicos 
{
	
	public static void main(String[] args) 
	{
		//booleano expl�cito
		boolean condicao1 = true; //true
		//booleano impl�cito
		boolean condicao2 = 3 > 7; //false
		
		//true E false = false
		System.out.println(condicao1 && condicao2);
		//true OU false = true
		System.out.println(condicao1 || condicao2);
		//true OU EXCLUSIVO false = true  
		System.out.println(condicao1 ^ condicao2);
		//N�O N�O true = true
		System.out.println(!!condicao1);
		//N�O false = true
		System.out.println(!condicao2);
		
		
		/*Obs: O aviso de "dead code" � dado quando uma opera��o
		ou comando � ineficaz em Java, o uso desta(e) n�o
		altera nenhum resultado ou caminho, sendo assim,
		desnecess�rio*/
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade N�O (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
