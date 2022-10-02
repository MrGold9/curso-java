package classe;

public class Data 
{
	
	String dia, mes, ano;
	
	Data()
	{
		// dia = "01";
		// mes = "01";
		// ano = "1970";
		
		/*O this pode ser usado para invocar um
		 outro construtor com os parâmetros 
		 necessários e definir os valores dos 
		 atributos de um objeto*/
		this("01", "01", "1970");
	}
	
	Data(String dia, String mes, String ano)
	{
		/*O this também serve para referenciar os 
		atributos da classe e diferenciá-los dos 
		parâmetros do método que possuem o mesmo nome*/
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
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
