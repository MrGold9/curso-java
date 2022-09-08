package classe;

public class ProdutoTeste 
{
	
	public static void main(String[] args) 
	{
		
		Produto p1 = new Produto();
		p1.nome = "Refrigerante";
		p1.preco = 9.99;
		p1.desconto = 0.10;
		
		var p2 = new Produto();
		p2.nome = "Colar";
		p2.preco = 119.99;
		p2.desconto = 0.25;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaPreco = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("A média dos preços dos produtos %s e %s é %.2f", p1.nome, p2.nome, mediaPreco);
		
	}

}
