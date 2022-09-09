package classe;

public class Produto 
{
	
	String nome;
	double preco;
	double desconto;
	
	//M�todo que pode ser invocado no Main
	//Obs: m�todos podem possuir nomes iguais, contanto que
	//os par�metros n�o sejam iguais
	double precoComDesconto() 
	{
		return preco * (1- desconto);
	}
	
	double precoComDesconto(double descontoGerente) 
	{
		return preco * (1- desconto + descontoGerente);
	}

}
