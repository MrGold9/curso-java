package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) 
	{
		//Transformando tipos primitivos em objetos
		
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 10000; //int
		Long l = 100000L;
		
		//Retorna o valor contido na variável b tipo Byte
		System.out.println(b.byteValue());
		
		//Retorna a variável s tipo Short como String
		System.out.println(s.toString());
		
		System.out.println(i * 3);
		
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		//Transforma a String "true" para booleano
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		//Transforma o tipo booleano para String e coloca em letras
		//maiúsculas
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
	}

}
