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
		
		//Como tanto o objeto d1 quanto o d2 estão com a mesma
		//referência, ao alterar o valor do atributo de um, também 
		//será alterado o valor do outro objeto
		d1.dia = "31";
		d2.mes = "12";
		d1.ano = "2025";
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		//O output será 5
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	//seta os atributos do objeto Data para um valor padrão
	/*O valor dos atributos de um objeto serão alterados porque
	 são baseados em atribuição por referência*/
	static void voltarDataParaValorPadrao(Data d) 
	{
		d.dia = "01";
		d.mes = "01";
		d.ano = "1970";
	}
	
	/* O valor do tipo primitivo não será alterado pois
	é feita uma cópia da variável "c" através do parâmetro*/
	static void alterarPrimitivo(int c) 
	{
		c++;
	}

}
