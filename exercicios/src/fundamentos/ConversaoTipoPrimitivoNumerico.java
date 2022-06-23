package fundamentos;

public class ConversaoTipoPrimitivoNumerico 
{
	
	public static void main(String[] args) 
	{
		//
		double a = 1; //conversão implícita
		System.out.println(a);
		
		/*Ao inserir o valor da variável, o sistema muda o seu tipo
		automaticamente para double para que o número completo 
		apareça, ao digitar (float) você deixa explícito que quer 
		manter o tipo desta variável e está ciente de que irá 
		perder informações*/
		float b = (float) 1.123456788888; //conversão explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; //conversão explícita (CAST)
		System.out.println(f);
		
	}

}
