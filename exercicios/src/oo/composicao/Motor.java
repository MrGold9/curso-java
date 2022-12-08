package oo.composicao;

public class Motor 
{
	//Instanciando um carro no Motor
	final Carro carro;
	
	//Atributos
	boolean ligado = false;
	double fatorInjecao = 1;
	
	//Construtor
	Motor(Carro carro)
	{
		this.carro = carro;
	}
	
	
	//Método para calcular os giros do motor
	int giros()
	{
		if (!ligado) 
		{
			return 0;
		}
		else 
		{
			//Arredondando o resultado e fazendo cast para int
			return (int)Math.round(fatorInjecao * 3000);
		}
	}
		

}
