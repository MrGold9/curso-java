package classe;

public class PrimeiroTrauma 
{
	
	int a = 3; // n�o pode mexer aqui
	static int b = 4;
	
	public static void main(String[] args) 
	{
		/*A vari�vel "a" s� pode ser chamada se for
		 instanciado um objeto da classe em que est�
		 inserida*/
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		
		/*A vari�vel pode ser chamada por qualquer 
		 m�todo pois est� como static*/
		System.out.println(b);
		
	}

}
