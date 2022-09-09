package classe;

public class Produto 
{
	
	String nome;
	double preco;
	double desconto;
	
	//Método que pode ser invocado no Main
	//Obs: métodos podem possuir nomes iguais, contanto que
	//os parâmetros não sejam iguais
	double precoComDesconto() 
	{
		return preco * (1- desconto);
	}
	
	double precoComDesconto(double descontoGerente) 
	{
		return preco * (1- desconto + descontoGerente);
	}

}
