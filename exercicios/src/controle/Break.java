package controle;

public class Break 
{
	
	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 10; i++) 
		{
			//Quando i for igual a 5 o programa sairá
			//do laço e retornará para o escopo anterior,
			//por último, retornando "Fim!" no terminal
			
			if (i == 5) 
			{
				break;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Fim!");
		
	}

}
