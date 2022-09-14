package classe;

public class Produto 
{
	
	String nome;
	double preco;
	double desconto;
	
	//Obs: métodos podem possuir nomes iguais, contanto que
	//os parâmetros não sejam iguais
	
	//Construtores
	/*Um construtor é criado automaticamente pelo Java quando
	 * um objeto é instanciado, mas é possível manipular este
	 * construtor criando e definindo os parâmetros necessários*/
	Produto()
	{
		//Construtor padrão
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial)
	{
		//Construtor criado
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	//Método que pode ser invocado no Main
	double precoComDesconto() 
	{
		return preco * (1- desconto);
	}
	
	double precoComDesconto(double descontoGerente) 
	{
		return preco * (1- desconto + descontoGerente);
	}

}
