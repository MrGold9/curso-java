package classe.desafio;

public class Jantar 
{
	
	public static void main(String[] args) 
	{
		
		Comida c1 = new Comida("Feijão", 0.100);
		Comida c2 = new Comida("Arroz", 0.150);
		Comida c3 = new Comida("Frango", 0.220);
		
		Pessoa p1 = new Pessoa("Paulo", 70);
		
		System.out.printf("O peso de %s era %.2fKG antes de comer e se tornou "
				+ "%.2fKG depois de comer", p1.nomePessoa, p1.pesoPessoa, 
				p1.comer(c1.pesoComida));
		
		System.out.printf("\n\nO peso de %s era %.2fKG antes de comer e se tornou "
				+ "%.2fKG depois de comer", p1.nomePessoa, p1.pesoPessoa, 
				p1.comer(c2.pesoComida + c3.pesoComida));
	}

}
