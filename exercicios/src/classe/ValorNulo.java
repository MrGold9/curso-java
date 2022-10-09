package classe;

public class ValorNulo 
{
	
	public static void main(String[] args) 
	{
		/*O null é utilizado principalmente no tratamento
		 de exceções para evitar erros*/
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		
		/*Se um número gerado entre 0 e 1 for maior que
		 0.5 o objeto d1 será instanciado, senão, será igual
		 a nulo*/
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if (d1 != null) 
		{
			d1.mes = "03";
			System.out.println(d1.dataFormatada());
		}
		
		
		/*Se um número gerado entre 0 e 1 for maior que
		 0.5 s2 será igual a "Opa", senão, será igual a
		 nulo*/
		String s2 = Math.random() > 0.5 ? "Opa" : null;

		if (s2 != null) 
		{
			System.out.println(s2.concat("???"));
		}
		
	}

}
