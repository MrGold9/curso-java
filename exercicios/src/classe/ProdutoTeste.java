package classe;

public class ProdutoTeste 
{
	
	public static void main(String[] args) 
	{
		
		//Instanciando o objeto p1
		/*Os atributos podem ser definidos dentro
		dos par�nteses usando um construtor*/
		Produto p1 = new Produto("Refrigerante", 9.99, 0.10);
		
		//p1.nome = "Refrigerante";
		//p1.preco = 9.99;
		//p1.desconto = 0.10;
		
		
		//Instanciando o objeto p2
		var p2 = new Produto();
		
		/*Defini��o dos atributos acessando o objeto*/
		p2.nome = "Colar";
		p2.preco = 119.99;
		p2.desconto = 0.25;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//Invocando o m�todo precoComDesconto em um objeto
		//espec�fico e definindo o valor do seu par�metro 
		//dentro dos par�nteses
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.10);
		
		double mediaPreco = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("A m�dia dos pre�os dos produtos %s e %s � de %.2f reais", p1.nome, p2.nome, mediaPreco);
		
				
	}

}
