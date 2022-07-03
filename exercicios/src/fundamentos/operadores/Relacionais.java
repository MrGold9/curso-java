package fundamentos.operadores;

public class Relacionais 
{
	
	public static void main(String[] args) 
	{
		
		int a = 97;
		//Um char dentro de um tipo int pode representar um n�mero 
		// 'a' = 97
		int b = 'a';
		// 'z' = 122
		int c = 'z';
		
		//Pergunta se a vari�vel a � igual a vari�vel b
		System.out.println(a == b);
		
		System.out.println(c);
		
		//Pergunta se 3 � maior que 4
		System.out.println(3 > 4);
		//Pergunta se 3 � maior ou igual a 3
		System.out.println(3 >= 3);
		//Pergunta se 3 � menor que 7 
		System.out.println(3 < 7);
		//Pergunta se 30 � menor ou igual a 7
		System.out.println(30 <= 7);
		//Pergunta se 30 � diferente de 7
		System.out.println(30 != 7);
		
		/*Se o aluno tiver bom comportamento e nota acima da m�dia
		   ele recebe um desconto*/
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}

}
