package controle;

public class DesafioFor 
{
	
	public static void main(String[] args) 
	{
		//Controlar o laço for sem o uso de valores numéricos
		
		/*
		 	Ter o seguinte output: #
		 						   ##
		 						   ###
		 						   ####
		 						   #####
		
		*/
		
		String valor = "#";
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(valor);
			valor += "#";
		}
		
		
		//Resposta
		
		for (String v = "#"; !v.equals("######"); v += "#") 
		{
			System.out.println(v);
		}
		
	}

}
