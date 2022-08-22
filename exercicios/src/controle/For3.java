package controle;

public class For3 
{
	
	public static void main(String[] args) 
	{
		//Criando la�os de repeti��o dentro de outros la�os
		
		/*A vari�vel i ficar� dispon�vel apenas dentro do escopo
		deste for (consequentemente podendo ser utilizada dentro
		de outros escopos inseridos neste), n�o sendo poss�vel 
		utiliz�-la fora deste*/
		for (int i = 0; i < 10; i++) 
		{
			/*O mesmo se aplica para a vari�vel j, n�o � poss�vel
			cham�-la dentro do for anterior, apenas em outros escopos
			criados dentro deste for*/
			for (int j = 0; j < 10; j++) 
			{
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
	}

}
