package controle;

public class DesafioIf 
{
	
	public static void main(String[] args) 
	{
		/*
		 Resposta: o bloco de c�digo que est� entre chaves � mostrado no 
		 terminal mesmo sem a condi��o estar satisfeita pois o bloco a 
		 ser executado ap�s a condi��o ser satisfeita � o ponto e 
		 v�rgula (;), qualquer c�digo pode ser colocado dentro de
		 chaves, n�o apenas c�digos de comandos espec�ficos (como o if)
		 */
		
		double nota = 1.3;
		
		// n�o usar ; em estruturas de controle (apenas uma exce��o)
		if (nota >= 9.0);
		{
			
			System.out.println("Quadro de honra!");
			System.out.println("Voc� � fera!!!");
			
		}
		
	}

}
