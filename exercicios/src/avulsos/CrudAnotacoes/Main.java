package avulsos.CrudAnotacoes;

import java.util.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) 
	{
		MeuFrame MeuFrame = new MeuFrame();
		
		int escolhaOpcao;
		String conteudoNota;
		int escolhaNota;
		
		ArrayList<String> notas = new ArrayList<>();
		
		while(true) 
		{
			Scanner entrada = new Scanner (System.in);
			
			try 
			{
				escolhaOpcao = 0;
				conteudoNota = "";
				escolhaNota = 0;
				
				System.out.println("Escolha uma das opções abaixo: \n"
						+ "1 - Criar uma nota \n"
						+ "2 - Ler uma nota \n"
						+ "3 - Alterar uma nota \n"
						+ "4 - Excluir uma nota");
				escolhaOpcao = entrada.nextInt();
				entrada.nextLine();
				
				if(escolhaOpcao == 2 && notas.size() == 0) 
				{
					System.out.println("Não tem nenhuma nota para ler!\n\n");
				}
				
				else if(escolhaOpcao == 3 && notas.size() == 0) 
				{
					System.out.println("Não tem nenhuma nota para alterar!\n\n");
				}
				
				else if(escolhaOpcao == 4 && notas.size() == 0) 
				{
					System.out.println("Não tem nenhuma nota para excluir!\n\n");
				}
				
				else if(escolhaOpcao == 1) 
				{
					System.out.print("Insira o conteúdo da nota: ");
				 	conteudoNota = entrada.nextLine();
					notas.add(conteudoNota);
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 2) 
				{
					System.out.println("Qual das notas você deseja visualizar? Existem " + notas.size());
					escolhaNota = entrada.nextInt() - 1;
					entrada.nextLine();
					System.out.println(notas.get(escolhaNota));
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 3) 
				{
					System.out.println("Qual das notas você deseja alterar? Existem " + notas.size());
					escolhaNota = entrada.nextInt() - 1;
					entrada.nextLine();
					
					System.out.println("Nota antiga: " + notas.get(escolhaNota));
					
					System.out.print("Nota editada: ");
					conteudoNota = entrada.nextLine();
					notas.set(escolhaNota, conteudoNota);
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao == 4) 
				{
					System.out.println("Qual das notas você deseja excluir? Existem " + notas.size());
					escolhaNota = entrada.nextInt() - 1;
					entrada.nextLine();
					
					System.out.println("A seguinte nota foi excluída: " + notas.get(escolhaNota));
					notas.remove(escolhaNota);
					
					System.out.println("\n");
				}
				
				else if(escolhaOpcao <= 0 || escolhaOpcao >= 5) 
				{
					System.out.println("Selecione um número entre 1 e 4 apenas!\n\n");
				}
				
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Insira um número!\n\n");
			}
			catch (Exception e) 
			{
				System.out.println("Algo de errado não está certo!\n\n");
			}
			
		
		}
		
	}

}
