package classe;

public class ValorVsReferencia 
{
	
	public static void main(String[] args) 
	{
		//Atribuição por valor
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		
		
		//Atribuição por referência (Objeto)
		Data d1 = new Data("01", "06", "2022");
		Data d2 = d1;
		
		d1.dia = "31";
		d2.mes = "12";
		d1.ano = "2025";
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) 
	{
		d.dia = "01";
		d.mes = "01";
		d.ano = "1970";
	}
	
	static void alterarPrimitivo(int a) 
	{
		a++;
	}

}
