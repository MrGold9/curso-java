package classe;

public class AreaCircTeste 
{
	
	public static void main(String[] args) 
	{
		/*Instanciando o objeto "a1" e definindo o atributo raio
		entre os par�nteses*/
		AreaCirc a1 = new AreaCirc(10);
		
		/*Mostrando a �rea do c�rculo invocando o m�todo area
		no objeto "a1" sem alterar o valor de pi definido na
		classe AreaCirc*/
		System.out.println(a1.area());
		
		
		
		/*Instanciando o objeto "a2"*/
		AreaCirc a2 = new AreaCirc(10);
		
		/*Mudando o valor do atributo pi atrav�s do objeto
		 * Obs: o valor de pi n�o est� sendo alterado apenas
		 * dentro do objeto "a2", mas sim, o pr�prio atributo
		 * que est� na classe*/
		//a2.pi = 5;
				
		System.out.println(a2.area());
		
		
		
		/*Instanciando o objeto "a3"*/
		AreaCirc a3 = new AreaCirc(10);
				
		/*Mudando o valor do atributo pi dentro da classe AreaCirc*/
		//AreaCirc.pi = 7;
						
		System.out.println(a3.area());
	}

}
