package classe;

public class Equals 
{
	
	public static void main(String[] args) 
	{
		/*Comparando objetos*/
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@hotmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@hotmail.com";
		
		/*O resultado � falso porque o sistema compara os endere�os de mem�ria,
		 onde o endere�o do objeto u1 � diferente do endere�o de u2*/
		System.out.println(u1 == u2);
		
		/*O resultado � verdadeiro porque o m�todo .equals foi configurado na classe
		 Usuario, possibilitando a compara��o dos atributos dos dois objetos*/
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
		
	}

}
