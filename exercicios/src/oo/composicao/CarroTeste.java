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
		  O encapsulamento n�o permite que atributos
		   sejam manipulados pelo usu�rio*/
		//c1.motor.fatorInjecao = -30;
		
		//Rela��o bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
	}

}
