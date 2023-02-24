package oop;

import java.sql.Time;

public class Tempo1Teste 
{
	
	public static void main(String[] args) 
	{
		
		Tempo1 tempo = new Tempo1();
		
		mostrarTempo("Depois que o objeto tempo � criado", tempo);
		System.out.println();
		
		tempo.definirTempo(13, 27, 6);
		mostrarTempo("Depois de chamar o m�todo definirTempo", tempo);
		System.out.println();
		
		try 
		{
			tempo.definirTempo(99, 99, 99); //valores fora do intervalo
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("Exce��o: %s%n%n", e.getMessage());
		}
		
		mostrarTempo("Depois da tentativa de definir valores inv�lidos", tempo);
		
		
	}
	
	/*M�todos private s� podem ser chamados dentro 
	das classes em que foram criados*/
	private static void mostrarTempo(String cabecalho, Tempo1 t) 
	{
		System.out.printf("%s%nTempo universal: %s%nTempo padr�o: %s%n",
				cabecalho, t.paraStringUniversal(), t.toString());
	}

}
