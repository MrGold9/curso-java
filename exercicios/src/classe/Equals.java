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
		
		/*O resultado é falso porque o sistema compara os endereços de memória,
		 onde o endereço do objeto u1 é diferente do endereço de u2*/
		System.out.println(u1 == u2);
		
		/*O resultado é verdadeiro porque o método .equals foi configurado na classe
		 Usuario, possibilitando a comparação dos atributos dos dois objetos*/
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
		
	}

}
