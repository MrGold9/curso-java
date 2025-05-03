package avulsos.CrudAnotacoes;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		int escolhaOpcao;
		
		
		
		ArrayList<String> notas = new ArrayList<>();
		
		while(true) 
		{
			Scanner entrada = new Scanner (System.in);
			
			try 
			{
				escolhaOpcao = 0;
				System.out.println("Escolha uma das opções abaixo: \n"
						+ "1 - Criar uma nota \n"
						+ "2 - Ler uma nota \n"
						+ "3 - Alterar uma nota \n"
						+ "4 - Excluir uma nota");
				escolhaOpcao = entrada.nextInt();
				entrada.nextLine();
				
				if(escolhaOpcao == 1) 
				{
					System.out.println("Insira o conteúdo da nota");
				 	String conteudoNota = entrada.nextLine();
					notas.add(conteudoNota);
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 2) 
				{
					System.out.println("Qual das notas você deseja visualizar? Existem " + notas.size());
					int escolhaNota = entrada.nextInt() - 1;
					entrada.nextLine();
					System.out.println(notas.get(escolhaNota));
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 3) 
				{
					System.out.println("Qual das notas você deseja alterar? Existem " + notas.size());
					int escolhaNota = entrada.nextInt() - 1;
					entrada.nextLine();
					System.out.println("Reescreva: " + entrada.nextLine());
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 4) 
				{
					
				}
				
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Insira um número!\n\n");
				//entrada.nextLine();
			}
			catch (Exception e) 
			{
				System.out.println("Algo de errado não está certo!\n\n");
				//entrada.nextLine();
			}
			
		
		}
		
	}

}
