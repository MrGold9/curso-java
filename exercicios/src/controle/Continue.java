package controle;

public class Continue 
{
	
	public static void main(String[] args) 
	{
		//O continue dá continuidade para a execução das
		//instruções ignorando o código abaixo e retornando
		//para o começo do laço, diferentemente do 
		//break que ao ser executado quebra o laço 
		//automaticamente e volta para o escopo anterior
		
		for (int i = 0; i < 10; i++) 
		{
			if (i % 2 == 1) 
			{
				continue;	
			}
			
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) 
		{
			if (i == 5) 
			{
				continue;	
			}
			
			System.out.println(i);
		}
		
	}

}
