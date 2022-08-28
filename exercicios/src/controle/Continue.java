package controle;

public class Continue 
{
	
	public static void main(String[] args) 
	{
		//O continue d� continuidade para a execu��o das
		//instru��es ignorando o c�digo abaixo e retornando
		//para o come�o do la�o, diferentemente do 
		//break que ao ser executado quebra o la�o 
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
