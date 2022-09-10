package classe;

public class Data 
{
	
	String dia, mes, ano;
	
	String dataFormatada() 
	{
		return dia + "/" + mes + "/" + ano;
	}
	
	//Método void com um retorno (o void não utiliza o comando return)
	void imprimirDataFormatada() 
	{
		System.out.println(dataFormatada());
	}

}
