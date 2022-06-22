package fundamentos;

public class PrimitivoVsObjeto 
{
	
	public static void main(String[] args) 
	{
		
		String s = new String("Texto");
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos
		int num = 123;
		System.out.println(num);
		
	}

}
