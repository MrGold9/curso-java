package oop;

//No escopo principal s� pode haver uma �nica classe public
public class ThisTeste 
{
	
	public static void main(String[] args) 
	{
		
		TempoSimples tempo = new TempoSimples(15, 30, 19);
		System.out.println(tempo.montarString());
		
	}

}

class TempoSimples
{
	
	private int hora;
	private int minuto;
	private int segundo;
	
	//Uso do .this se faz necess�rio para diferenciar
	//as vari�veis do par�metro das vari�veis 
	//dos atributos da classe
	public TempoSimples(int hora, int minuto, int segundo) 
	{
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	//.this expl�cito e impl�cito
	public String montarString() 
	{
		return String.format("%24s: %s%n%24s: %s",
				"this.paraStringUniversal()", this.paraStringUniversal(),
				"paraStringUniversal()", paraStringUniversal());
	}
	
	public String paraStringUniversal() 
	{
		return String.format("%02d:%02d:%02d", 
				this.hora, this.minuto, this.segundo);
	}
	
}
