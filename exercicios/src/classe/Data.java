package classe;

public class Data 
{
	
	/* As vari�veis de classe s�o inicializadas com
	um valor padr�o, neste caso, Strings sempre ser�o
	iguais a "" e inteiros sempre iguais a 0 */
	String dia, mes, ano;
	
	Data()
	{
		// dia = "01";
		// mes = "01";
		// ano = "1970";
		
		/*O this pode ser usado para invocar um
		 outro construtor com os par�metros 
		 necess�rios e definir os valores dos 
		 atributos de um objeto*/
		this("01", "01", "1970");
		
		/*As vari�veis locais necessitam de uma
		 inicializa��o, caso contr�rio, ocorrer�
		 um erro ao invocar estas*/
		int a = 0;
	}
	
	Data(String dia, String mes, String ano)
	{
		/*O this tamb�m serve para referenciar os 
		atributos da classe e diferenci�-los dos 
		par�metros do m�todo que possuem o mesmo nome*/
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
