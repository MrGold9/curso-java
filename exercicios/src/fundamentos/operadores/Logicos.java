package fundamentos.operadores;

public class Logicos 
{
	
	public static void main(String[] args) 
	{
		//booleano explícito
		boolean condicao1 = true; //true
		//booleano implícito
		boolean condicao2 = 3 > 7; //false
		
		//true E false = false
		System.out.println(condicao1 && condicao2);
		//true OU false = true
		System.out.println(condicao1 || condicao2);
		//true OU EXCLUSIVO false = true  
		System.out.println(condicao1 ^ condicao2);
		//NÃO NÃO true = true
		System.out.println(!!condicao1);
		//NÃO false = true
		System.out.println(!condicao2);
		
		
		/*Obs: O aviso de "dead code" é dado quando uma operação
		ou comando é ineficaz em Java, o uso desta(e) não
		altera nenhum resultado ou caminho, sendo assim,
		desnecessário*/
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
		
		System.out.println("\nTabela verdade NÃO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
