package classe.desafio;

public class Pessoa 
{
	
	String nomePessoa = "";
	double pesoPessoa = 0.0;
	
	
	Pessoa()
	{
		
	}
	
	Pessoa(String nomePessoa, double pesoPessoa)
	{
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	double comer(double totalPesoComida)
	{
		double pesoPosComida = pesoPessoa + totalPesoComida;
		return pesoPosComida;
	}

}
