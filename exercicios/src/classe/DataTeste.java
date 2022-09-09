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
		
		
		//Aglutinando os atributos de cada objeto em Strings distintas
		String data1 = d1.dia +  "/" + d1.mes + "/" + d1.ano;
		String data2 = d2.dia +  "/" + d2.mes + "/" + d2.ano;
		
		//Output
		System.out.println(data1);
		System.out.println(data2);
		
	}

}
