package controle;

public class BreakRotulado 
{
	
	public static void main(String[] args) 
	{
		/*
		 	Colocamos uma label "externo" em um for e "interno"
		 	no outro, a função do break rotulado é sair do
		 	escopo indicado, ou seja, quando i for igual a 1, o
		 	programa executará o break e ao invés de sair do escopo
		 	do for interno, sairá do escopo do for externo,
		 	retornando a mensagem final do código "Fim!" no terminal
		 */
		
		externo: for (int i = 0; i < 3; i++) 
		{
			
			/*interno:*/ for (int j = 0; j < 3; j++) 
			{
				
				if (i == 1) 
				{
					break externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println();
			
		}
		
		System.out.println("Fim!");
		
	}

}
