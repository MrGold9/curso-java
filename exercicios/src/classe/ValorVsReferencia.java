package classe;

public class ValorVsReferencia 
{
	
	public static void main(String[] args) 
	{
		//Atribui��o por valor
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		
		
		//Atribui��o por refer�ncia (Objeto)
		Data d1 = new Data("01", "06", "2022");
		Data d2 = d1;
		
		//Como tanto o objeto d1 quanto o d2 est�o com a mesma
		//refer�ncia, ao alterar o valor do atributo de um, tamb�m 
		//ser� alterado o valor do outro objeto
		d1.dia = "31";
		d2.mes = "12";
		d1.ano = "2025";
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		//O output ser� 5
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	//seta os atributos do objeto Data para um valor padr�o
	/*O valor dos atributos de um objeto ser�o alterados porque
	 s�o baseados em atribui��o por refer�ncia*/
	static void voltarDataParaValorPadrao(Data d) 
	{
		d.dia = "01";
		d.mes = "01";
		d.ano = "1970";
	}
	
	/* O valor do tipo primitivo n�o ser� alterado pois
	� feita uma c�pia da vari�vel "c" atrav�s do par�metro*/
	static void alterarPrimitivo(int c) 
	{
		c++;
	}

}
