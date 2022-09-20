package classe;

public class DesafioProduto 
{
	//Atributos
	String nome;
	double preco = 5;
	static double desconto = 0.25;
	
	//Construtor padrão
	DesafioProduto()
	{
		
	}
	
	//Construtor criado
	DesafioProduto(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}
	
	//Método precoFinal
	double precoFinal()
	{
		return preco * (1 - desconto);
	}

}
