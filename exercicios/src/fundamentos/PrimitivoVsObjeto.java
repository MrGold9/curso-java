package fundamentos;

public class PrimitivoVsObjeto 
{
	
	public static void main(String[] args) 
	{
		//Objeto
		String s = new String("Texto");
		s.toUpperCase();
		
		//Obs: wrappers são a versão objeto dos tipos primitivos
		//Primitivo
		int num = 123;
		System.out.println(num);
		
	}

}
