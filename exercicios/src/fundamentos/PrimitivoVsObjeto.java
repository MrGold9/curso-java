package fundamentos;

public class PrimitivoVsObjeto 
{
	
	public static void main(String[] args) 
	{
		//Objeto
		String s = new String("Texto");
		s.toUpperCase();
		
		//Obs: wrappers s�o a vers�o objeto dos tipos primitivos
		//Primitivo
		int num = 123;
		System.out.println(num);
		
	}

}
