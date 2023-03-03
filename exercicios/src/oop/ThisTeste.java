package oop;

//No escopo principal só pode haver uma única classe public
public class ThisTeste 
{
	
	public static void main(String[] args) 
	{
		
		TempoSimples tempo = new TempoSimples(15, 30, 19);
		
	}

}

class TempoSimples
{
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public TempoSimples(int hora, int minuto, int segundo) 
	{
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String montarString() 
	{
		return String.format("%24s: %s%n%24s: %s",
				"this.paraStringUniversal()", this.paraStringUniversal(),
				"this.paraStringUniversal()", this.paraStringUniversal());
	}
	
	public String paraStringUniversal() 
	{
		String teste = "";
		return teste;
	}
	
}
