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
		
		
		//Invocando o método dataFormatada para aglutinar
		//os atributos e formar a data completa de cada objeto
		String data1 = d1.dataFormatada();
		String data2 = d2.dataFormatada();
		
		//Output
		System.out.println(data1);
		System.out.println(data2);
		
		System.out.println();
		
		//Invocando o método void imprimirDataFormatada
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}

}
