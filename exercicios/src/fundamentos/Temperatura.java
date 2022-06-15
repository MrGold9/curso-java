package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) 
	{
		// (°F - 32) * 5/9 = °C
		
		final int subtracao = 32;
		final double multiplicador = 5/9.0;
		
		double F = 75;
		double C = (F - subtracao) * multiplicador;
		
		System.out.println(F + "° Fahrenheit é igual a " + C + "° Celsius");	
	}

}
