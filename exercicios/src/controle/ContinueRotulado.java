package controle;

public class ContinueRotulado 
{
	
	public static void main(String[] args) 
	{
		
		/*
	 	A função do continue rotulado é retornar ao início do
	 	escopo indicado, ou seja, quando i for igual a 1, o
	 	programa executará o continue e ao invés de repetir o escopo
	 	do for interno, será repetido o for externo a partir do início
	 */
	
	externo: for (int i = 0; i < 3; i++) 
	{
		
		interno: for (int j = 0; j < 3; j++) 
		{
			
			if (i == 1) 
			{
				continue externo;
			}
			
			System.out.printf("[%d %d] ", i, j);
		}
		
		System.out.println();
		
	}
	
	System.out.println("Fim!");
	
	}
		
}
