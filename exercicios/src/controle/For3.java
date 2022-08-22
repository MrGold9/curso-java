package controle;

public class For3 
{
	
	public static void main(String[] args) 
	{
		//Criando laços de repetição dentro de outros laços
		
		/*A variável i ficará disponível apenas dentro do escopo
		deste for (consequentemente podendo ser utilizada dentro
		de outros escopos inseridos neste), não sendo possível 
		utilizá-la fora deste*/
		for (int i = 0; i < 10; i++) 
		{
			/*O mesmo se aplica para a variável j, não é possível
			chamá-la dentro do for anterior, apenas em outros escopos
			criados dentro deste for*/
			for (int j = 0; j < 10; j++) 
			{
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
	}

}
