package oop;

public class Tempo1 
{
	
	private int hora; // 0-23
	private int minuto; // 0 - 59
	private int segundo; // 0 - 59
	
	public void definirHora(int hora, int minuto, int segundo) 
	{
		
		//Erro caso a hora esteja incorreta
		if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || 
				segundo < 0 || segundo >= 60) 
		{
			//Lançar exceção ou mensagem de erro através do throw
			throw new IllegalArgumentException
			("Hora, minuto ou segundo está fora do alcance");
		}
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	
	public String paraStringUniversal() 
	{
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	
	//alterando o método padrão .toString para o padrão de hora
	public String toString() 
	{
		return String.format("%d:%02d:%02d %s",
				((hora == 0 || hora == 12) ? 12 : hora % 12),
				minuto, segundo, (hora < 12 ? "AM" : "PM"));
	}

}
