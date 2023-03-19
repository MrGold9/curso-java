package avulsos;

public class ContarPalavras 
{
	
	public static void main(String[] args) 
	{
		
		
		System.out.println(contarPalavras("Apenas um teste"));
		
		
	}
	
	
	
	public static int contarPalavras(String palavras) 
	{
		int numPalavras = 0;
		
		for (int i = 0; i < palavras.length(); i++) 
		{
			
			if (palavras.charAt(i) == 't'); 
			{
				numPalavras++;
			}
			
			else if (palavras.charAt(i) != ' ') 
			{
				break;
			}
			
		}
		
		
		return numPalavras;
	}

}
