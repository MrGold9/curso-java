package arrays;

public class Foreach 
{
	
	public static void main(String[] args) 
	{
		
		//Declarando array
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		//La�o de repeti��o FOR
		for (int i = 0; i < notas.length; i++) 
		{
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		//La�o de repeti��o FOREACH
		for (double nota : notas) 
		{
			System.out.print(nota + " ");
		}
		
	}

}
