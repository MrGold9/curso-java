package oo.composicao;

public class Carro 
{
	
	//Instanciando um motor no Carro
	final Motor motor;
	
	//Construtor
	Carro()
	{
		this.motor = new Motor(this);
	}
	
	//Método para acelerar o carro
	void acelerar() 
	{
		//Impedindo que o giro se torne muito alto
		if (motor.fatorInjecao < 2.6) 
		{
			motor.fatorInjecao += 0.4;
		}
	}
	
	//Método para frear o carro
	void frear() 
	{
		//Impedindo que o giro se torne negativo
		if (motor.fatorInjecao > 0.5) 
		{
			motor.fatorInjecao -= 0.4;
		}
	}
	
	//Método para ligar o carro
	void ligar() 
	{
		motor.ligado = true;
	}
	
	//Método para desligar o carro
	void desligar() 
	{
		motor.ligado = false;
	}
	
	//Método para checar se o carro está ligado ou não
	boolean estaLigado() 
	{
		return motor.ligado;
	}

}
