package classe;

public class AreaCirc 
{
	
	double raio;
	/*O static final não permite que o valor do
	atributo seja alterado*/
	static final double pi = 3.14;
	
	//Construtor padrão
	AreaCirc()
	{
		
	}
	
	//Construtor criado
	AreaCirc(double raio)
	{
		/*O this mostra para o programa que a variável
		da qual está se referindo é a deste escopo*/
		this.raio = raio;
	}
	
	//Método area
	double area() 
	{
		return pi * Math.pow(raio, 2);
	}

}
