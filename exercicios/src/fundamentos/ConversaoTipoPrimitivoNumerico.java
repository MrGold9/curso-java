package fundamentos;

public class ConversaoTipoPrimitivoNumerico 
{
	
	public static void main(String[] args) 
	{
		//
		double a = 1; //convers�o impl�cita
		System.out.println(a);
		
		/*Ao inserir o valor da vari�vel, o sistema muda o seu tipo
		automaticamente para double para que o n�mero completo 
		apare�a, ao digitar (float) voc� deixa expl�cito que quer 
		manter o tipo desta vari�vel e est� ciente de que ir� 
		perder informa��es*/
		float b = (float) 1.123456788888; //convers�o expl�cita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //convers�o expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; //convers�o expl�cita (CAST)
		System.out.println(f);
		
	}

}
