package classe;

public class AreaCirc 
{
	
	double raio;
	/*O static por sí só permite que o valor de um atributo
	 ou um método seja chamado no Main sem instanciar
	 um objeto, exemplo, ao chamar o valor de pi usando 
	 Math.PI não é necessário intanciar um objeto com o 
	 New Math()*/
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
	
	//Método area como static
	/*Não é preciso instanciar um objeto para usar
	 * este método, é possível chamá-lo usando apenas
	 * a sua classe, exemplo: AreaCirc.area(50)*/
		static double area(double raio) 
		{
			return pi * Math.pow(raio, 2);
		}

}
