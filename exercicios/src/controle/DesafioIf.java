package controle;

public class DesafioIf 
{
	
	public static void main(String[] args) 
	{
		/*
		 Resposta: o bloco de código que está entre chaves é mostrado no 
		 terminal mesmo sem a condição estar satisfeita pois o bloco a 
		 ser executado após a condição ser satisfeita é o ponto e 
		 vírgula (;), qualquer código pode ser colocado dentro de
		 chaves, não apenas códigos de comandos específicos (como o if)
		 */
		
		double nota = 1.3;
		
		// não usar ; em estruturas de controle (apenas uma exceção)
		if (nota >= 9.0);
		{
			
			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!!!");
			
		}
		
	}

}
