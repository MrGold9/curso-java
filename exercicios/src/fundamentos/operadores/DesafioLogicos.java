package fundamentos.operadores;

public class DesafioLogicos 
{
	
	public static void main(String[] args) 
	{
		/* Situação: se conseguir realizar o trabalho da terça-feira
		    e da quinta-feira, a família vai ao shopping comprar uma
		    televisão de 50 polegadas e tomar sorvete, se apenas um
		    trabalho der certo (seja de terça ou quinta) a família
		    compra a televisão de 32 polegadas e toma sorvete e por
		    último, se não conseguir nenhum trabalho (nem na terça e
		    nem na quinta) a família fica em casa sem fazer nada
		*/
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		Boolean trabalhoTer = true;
		Boolean trabalhoQui = true;
		
		
		Boolean televisao50 = trabalhoTer && trabalhoQui;
		Boolean televisao32 = trabalhoTer ^ trabalhoQui;
		Boolean tomarSorvete = televisao50 || televisao32;
		Boolean ficarEmCasa = !trabalhoTer && !trabalhoQui;
		
		System.out.println("O trabalho de terça deu certo? " 
		+ trabalhoTer
		.toString()
		.replace("true", "Verdadeiro")
		.replace("false", "Falso"));
		
		System.out.println("O trabalho de quinta deu certo? " 
				+ trabalhoQui
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		System.out.println("A televisão de 50 polegadas foi comprada? " 
				+ televisao50
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		System.out.println("A televisão de 32 polegadas foi comprada? " 
				+ televisao32
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		System.out.println("Fomos tomar sorvete? " 
				+ tomarSorvete
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		System.out.println("Ficamos em casa? " 
				+ ficarEmCasa
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		
	}

}
