package classe;

public class Data 
{
	
	String dia, mes, ano;
	
	Data()
	{
		dia = "01";
		mes = "01";
		ano = "1970";
	}
	
	Data(String dia, String mes, String ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
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
