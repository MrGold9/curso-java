package classe;

public class Usuario 
{
	
	String nome;
	String email;
	
	
	public boolean equals(Object objeto) 
	{
		if (objeto instanceof Usuario) 
		{
			//Cast de objeto para classe Usuario
			Usuario outro = (Usuario) objeto;
			
			/*Checando se o nome e o email do objeto atual
			é igual ao do outro objeto*/
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}
		
		else 
		{
			return false;
		}
	}

}
