package fundamentos.operadores;

public class DesafioLogicos 
{
	
	public static void main(String[] args) 
	{
		/* Situa��o: se conseguir realizar o trabalho da ter�a-feira
		    e da quinta-feira, a fam�lia vai ao shopping comprar uma
		    televis�o de 50 polegadas e tomar sorvete, se apenas um
		    trabalho der certo (seja de ter�a ou quinta) a fam�lia
		    compra a televis�o de 32 polegadas e toma sorvete e por
		    �ltimo, se n�o conseguir nenhum trabalho (nem na ter�a e
		    nem na quinta) a fam�lia fica em casa sem fazer nada
		*/
		
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		Boolean trabalhoTer = true;
		Boolean trabalhoQui = true;
		
		
		Boolean televisao50 = trabalhoTer && trabalhoQui;
		Boolean televisao32 = trabalhoTer ^ trabalhoQui;
		Boolean tomarSorvete = televisao50 || televisao32;
		Boolean ficarEmCasa = !trabalhoTer && !trabalhoQui;
		
		System.out.println("O trabalho de ter�a deu certo? " 
		+ trabalhoTer
		.toString()
		.replace("true", "Verdadeiro")
		.replace("false", "Falso"));
		
		System.out.println("O trabalho de quinta deu certo? " 
				+ trabalhoQui
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		System.out.println("A televis�o de 50 polegadas foi comprada? " 
				+ televisao50
				.toString()
				.replace("true", "Verdadeiro")
				.replace("false", "Falso"));
		
		System.out.println("A televis�o de 32 polegadas foi comprada? " 
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
