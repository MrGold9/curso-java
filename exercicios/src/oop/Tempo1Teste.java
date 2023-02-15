package oop;

public class Tempo1Teste 
{
	
	public static void main(String[] args) 
	{
		
		Tempo1 tempo = new Tempo1();
		
		mostrarTempo("After time object is created", tempo);
		System.out.println();
		
		
		
		private static void mostrarTempo(String cabecalho, Tempo1 t) 
		{
			System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
					cabecalho, t.paraStringUniversal(), t.toString());
		}
		
	}

}
