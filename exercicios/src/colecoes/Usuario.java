package colecoes;

import java.util.Objects;

public class Usuario 
{
	
	String nome;
	
	//Construtor
	Usuario(String nome)
	{
		this.nome = nome;
	}
	
	
	//Alterando o método .toString padrão
	public String toString() 
	{
		return "Meu nome é " + this.nome + ".";
	}


	/*Alterando o método .hashCode para gerar um
	 * mesmo HashCode para objetos que possuem
	 * propriedades iguais*/
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	/*Alterando o método .equals para mudar o
	 * critério de igualdade*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}

	
	

}
