package fundamentos;

public class PrimitivoVsObjeto 
{
	
	public static void main(String[] args) 
	{
		
		String s = new String("Texto");
		s.toUpperCase();
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos
		int num = 123;
		System.out.println(num);
		
	}

}
