package classe;

public class AreaCircTeste 
{
	
	public static void main(String[] args) 
	{
		/*Instanciando o objeto "a1" e definindo o atributo raio
		entre os parênteses*/
		AreaCirc a1 = new AreaCirc(10);
		
		/*Mostrando a área do círculo invocando o método area
		no objeto "a1" sem alterar o valor de pi definido na
		classe AreaCirc*/
		System.out.println(a1.area());
		
		
		
		/*Instanciando o objeto "a2"*/
		AreaCirc a2 = new AreaCirc(10);
		
		/*Mudando o valor do atributo pi através do objeto
		 * Obs: o valor de pi não está sendo alterado apenas
		 * dentro do objeto "a2", mas sim, o próprio atributo
		 * que está na classe*/
		//a2.pi = 5;
				
		System.out.println(a2.area());
		
		
		
		/*Instanciando o objeto "a3"*/
		AreaCirc a3 = new AreaCirc(10);
				
		/*Mudando o valor do atributo pi dentro da classe AreaCirc*/
		//AreaCirc.pi = 7;
						
		System.out.println(a3.area());
		
		
		
		//Utilizando o método area static sem instanciar um objeto
		System.out.println(AreaCirc.area(100));
		
		//Chamando o atributo pi da classe AreaCirc
		System.out.println(AreaCirc.pi);
		
		//Chamando o atributo pi da classe Math
		System.out.println(Math.PI);
		
	}

}
