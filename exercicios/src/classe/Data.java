package classe;

public class Data 
{
	
	String dia, mes, ano;
	
	String dataFormatada() 
	{
		return dia + "/" + mes + "/" + ano;
	}
	
	//M�todo void com um retorno (o void n�o utiliza o comando return)
	void imprimirDataFormatada() 
	{
		System.out.println(dataFormatada());
	}

}
