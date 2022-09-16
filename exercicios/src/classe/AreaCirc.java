package classe;

public class AreaCirc 
{
	
	double raio;
	/*O static final n�o permite que o valor do
	atributo seja alterado*/
	static final double pi = 3.14;
	
	//Construtor padr�o
	AreaCirc()
	{
		
	}
	
	//Construtor criado
	AreaCirc(double raio)
	{
		/*O this mostra para o programa que a vari�vel
		da qual est� se referindo � a deste escopo*/
		this.raio = raio;
	}
	
	//M�todo area
	double area() 
	{
		return pi * Math.pow(raio, 2);
	}

}
