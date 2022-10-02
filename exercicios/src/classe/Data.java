package classe;

public class Data 
{
	
	/* As variáveis de classe são inicializadas com
	um valor padrão, neste caso, Strings sempre serão
	iguais a "" e inteiros sempre iguais a 0 */
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
		
		/*As variáveis locais necessitam de uma
		 inicialização, caso contrário, ocorrerá
		 um erro ao invocar estas*/
		int a = 0;
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
