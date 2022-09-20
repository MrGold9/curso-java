package classe;

public class DesafioProdutoTeste 
{
	
	public static void main(String[] args) 
	{
		//Instanciando objeto p1
		DesafioProduto p1 = new DesafioProduto("Boneca", 99.99);
		
		//Usando printf para formatar as casas decimais e retornando
		//o preço final do produto e seu desconto
		System.out.printf("O preço final deste produto é %.2f e seu desconto foi de %.0f"
				+ " porcento", p1.precoFinal(), DesafioProduto.desconto * 100);
		
		
		
		//Instanciando objeto p2
		DesafioProduto p2 = new DesafioProduto("Carrinho", 14.99);
		
		//Alterando o atributo desconto da classe DesafioProduto
		DesafioProduto.desconto = 0.50;
		
		System.out.printf("\nO preço final deste produto é %.2f e seu desconto foi de %.0f"
				+ " porcento", p2.precoFinal(), DesafioProduto.desconto * 100);
	}

}
