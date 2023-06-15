package avulsos;

public class ContarPalavras 
{
	
	public static void main(String[] args) 
	{
		
		
		System.out.println(contarPalavras(""));
		
		
	}
	
	
	
	public static String contarPalavras(String palavras)
	{
		int numPalavras = 1;
		
		for (int i = 0; i < palavras.length(); i++) 
		{
			if (palavras.charAt(i) == ' ' && palavras.length() > 0)
			{
				numPalavras++;
				continue;
			}
			
			else if (palavras.isBlank() || palavras.equalsIgnoreCase("")) 
			{
				numPalavras = 0;
			}
			
			else if (palavras.length() > 0 && palavras.contains(" ")) 
			{
				numPalavras = 1;
			}
			
			
		}
		
		System.out.println(palavras);
		return numPalavras + " palavra(s)";
	}

}
