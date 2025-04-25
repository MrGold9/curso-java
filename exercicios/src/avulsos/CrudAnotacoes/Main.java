package avulsos.CrudAnotacoes;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner (System.in);
		
		ArrayList<String> anotacoes = new ArrayList<>();
		
		while(true) 
		{
			
			try 
			{
				int escolhaOpcao = 0;
				String conteudoNota = "";
				
				System.out.print("Escolha uma das opções abaixo: \n"
						+ "1 - Criar uma nota \n"
						+ "2 - Ler uma nota \n"
						+ "3 - Alterar uma nota \n"
						+ "4 - Excluir uma nota \n");
				escolhaOpcao = entrada.nextInt();
				
				if(escolhaOpcao == 1) 
				{
					System.out.println("Insira o conteúdo da nota");
					conteudoNota = entrada.next();
					anotacoes.add(conteudoNota);
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 2) 
				{
					System.out.println(anotacoes);
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 3) 
				{
					
				}
				
				else if(escolhaOpcao == 4) 
				{
					
				}
				
			} 
			catch (Exception e) 
			{
				//System.out.println("Algo de errado não está certo!");
			}
			
			
			
		}

	}

}
