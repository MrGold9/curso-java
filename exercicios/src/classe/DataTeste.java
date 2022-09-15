package classe;

public class DataTeste 
{
	
	public static void main(String[] args) 
	{
		
		//Instanciando os objetos e definindo seus atributos
		Data d1 = new Data();
		d1.dia = "01";
		d1.mes = "10";
		d1.ano = "2010";
		
		Data d2 = new Data();
		d2.dia = "15";
		d2.mes = "03";
		d2.ano = "2077";
		
		/*Atributos do construtor default da classe Produto serão mostrados*/
		Data d3 = new Data();
		
		/*Atributos definidos como parâmetros entre parênteses do 
		objeto d4 serão mostrados*/
		Data d4 = new Data("10", "10", "2010");
		
		
		/*Invocando o método dataFormatada para aglutinar
		os atributos e formar a data completa de cada objeto*/
		//String data1 = d1.dataFormatada();
		//String data2 = d2.dataFormatada();
		
		/*Output do objeto d1 e d2*/
		//System.out.println(data1);
		//System.out.println(data2);
		
		/*Invocando o método void imprimirDataFormatada*/
		//d1.imprimirDataFormatada();
		//d2.imprimirDataFormatada();
		
		/*Output do objeto d3*/
		System.out.printf("%s/%s/%s", d3.dia, d3.mes, d3.ano);
		
		System.out.println();
		
		/*Output do objeto d4*/
		System.out.printf("%s/%s/%s", d4.dia, d4.mes, d4.ano);
		
	}

}
