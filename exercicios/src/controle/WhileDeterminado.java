package controle;

public class WhileDeterminado 
{
	
	public static void main(String[] args) 
	{
		
		int contador = 1;
		
		/*Diferentemente do if que executa um bloco de c�digo uma �nica
		  vez caso a express�o seja verdadeira, o while continuar� 
		  executando o c�digo at� que a express�o verdadeira se torne
		  falsa*/
		while(contador<=10) 
		{
			System.out.println("contador = " + contador);
			contador++;
		}
		
	}

}
