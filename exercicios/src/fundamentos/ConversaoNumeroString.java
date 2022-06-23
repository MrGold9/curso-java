package fundamentos;

public class ConversaoNumeroString 
{
	
	public static void main(String[] args) 
	{
		//Converter o objeto do tipo inteiro para String permite o 
		//uso do operador ponto (.)
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		
		//Convertendo o tipo primitivo inteiro para String
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//Convertendo o tipo primitivo inteiro em String sem o uso
		//do operador ponto (.)
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}

}
