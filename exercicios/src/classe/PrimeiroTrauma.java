package classe;

public class PrimeiroTrauma 
{
	
	int a = 3; // não pode mexer aqui
	static int b = 4;
	
	public static void main(String[] args) 
	{
		/*A variável "a" só pode ser chamada se for
		 instanciado um objeto da classe em que está
		 inserida*/
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		
		/*A variável pode ser chamada por qualquer 
		 método pois está como static*/
		System.out.println(b);
		
	}

}
