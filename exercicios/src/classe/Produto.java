package classe;

public class Produto 
{
	
	String nome;
	double preco;
	double desconto;
	
	//Obs: m�todos podem possuir nomes iguais, contanto que
	//os par�metros n�o sejam iguais
	
	//Construtores
	/*Um construtor � criado automaticamente pelo Java quando
	 * um objeto � instanciado, mas � poss�vel manipular este
	 * construtor criando e definindo os par�metros necess�rios*/
	Produto()
	{
		//Construtor padr�o
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial)
	{
		//Construtor criado
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	//M�todo que pode ser invocado no Main
	double precoComDesconto() 
	{
		return preco * (1- desconto);
	}
	
	double precoComDesconto(double descontoGerente) 
	{
		return preco * (1- desconto + descontoGerente);
	}

}
