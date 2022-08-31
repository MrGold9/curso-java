package controle;

public class ContinueRotulado 
{
	
	public static void main(String[] args) 
	{
		
		/*
	 	A fun��o do continue rotulado � retornar ao in�cio do
	 	escopo indicado, ou seja, quando i for igual a 1, o
	 	programa executar� o continue e ao inv�s de repetir o escopo
	 	do for interno, ser� repetido o for externo a partir do in�cio
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
