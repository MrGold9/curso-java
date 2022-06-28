package fundamentos;

public class DesafioAritmeticos 
{
	
	public static void main(String[] args) 
	{
		//Obs: Math.pow serve para calcular pot�ncia��o
		
		//Criando a primeira parte do c�lculo
		double a = (6 * (3 + 2));
		double aPot = Math.pow(a, 2);
		double aMult = 3 * 2;
		double aFinal = aPot / aMult;
		
		//Criando a segunda parte do c�lculo
		double b = ((1 - 5) * (2 - 7) / 2);
		double bPot = Math.pow(b, 2);
		double bFinal = bPot;
		
		//Subtra��o da primeira com a segunda parte
		double aEbSubt = aFinal - bFinal;
		
		double aEbPot = Math.pow(aEbSubt, 3);
		
		double aEbFinal = aEbPot;
		
		//Criando a terceira parte do c�lculo
		double c = Math.pow(10, 3);
		
		//Resultado final do c�lculo
		double aEbEcFinal = aEbFinal / c;
		
		System.out.println(aEbEcFinal);
		
		
		
	}

}
