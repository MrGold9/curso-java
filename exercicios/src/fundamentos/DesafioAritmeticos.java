package fundamentos;

public class DesafioAritmeticos 
{
	
	public static void main(String[] args) 
	{
		//Obs: Math.pow serve para calcular potênciação
		
		//Criando a primeira parte do cálculo
		double a = (6 * (3 + 2));
		double aPot = Math.pow(a, 2);
		double aMult = 3 * 2;
		double aFinal = aPot / aMult;
		
		//Criando a segunda parte do cálculo
		double b = ((1 - 5) * (2 - 7) / 2);
		double bPot = Math.pow(b, 2);
		double bFinal = bPot;
		
		//Subtração da primeira com a segunda parte
		double aEbSubt = aFinal - bFinal;
		
		double aEbPot = Math.pow(aEbSubt, 3);
		
		double aEbFinal = aEbPot;
		
		//Criando a terceira parte do cálculo
		double c = Math.pow(10, 3);
		
		//Resultado final do cálculo
		double aEbEcFinal = aEbFinal / c;
		
		System.out.println(aEbEcFinal);
		
		
		
	}

}
