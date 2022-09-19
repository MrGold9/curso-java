package classe;

public class AreaCirc 
{
	
	double raio;
	/*O static por s� s� permite que o valor de um atributo
	 ou um m�todo seja chamado no Main sem instanciar
	 um objeto, exemplo, ao chamar o valor de pi usando 
	 Math.PI n�o � necess�rio intanciar um objeto com o 
	 New Math()*/
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
	
	//M�todo area como static
	/*N�o � preciso instanciar um objeto para usar
	 * este m�todo, � poss�vel cham�-lo usando apenas
	 * a sua classe, exemplo: AreaCirc.area(50)*/
		static double area(double raio) 
		{
			return pi * Math.pow(raio, 2);
		}

}
