package controle;

public class WhileDeterminado 
{
	
	public static void main(String[] args) 
	{
		
		int contador = 1;
		
		/*Diferentemente do if que executa um bloco de código uma única
		  vez caso a expressão seja verdadeira, o while continuará 
		  executando o código até que a expressão verdadeira se torne
		  falsa*/
		while(contador<=10) 
		{
			System.out.println("contador = " + contador);
			contador++;
		}
		
	}

}
