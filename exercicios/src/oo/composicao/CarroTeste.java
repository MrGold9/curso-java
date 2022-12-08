package oo.composicao;

public class CarroTeste 
{
	
	public static void main(String[] args) 
	{
	
		//Instanciando um carro com motor
		Carro c1 = new Carro();
		
		
		System.out.println(c1.estaLigado());
		
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		
		System.out.println(c1.motor.giros());
		
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
		
		/*Faltou encapsulamento
		  O encapsulamento não permite que atributos
		   sejam manipulados pelo usuário*/
		//c1.motor.fatorInjecao = -30;
		
		//Relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
	}

}
