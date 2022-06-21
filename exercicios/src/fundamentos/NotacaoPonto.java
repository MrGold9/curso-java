package fundamentos;

public class NotacaoPonto 
{
	
	public static void main(String[] args) 
	{
		//Alterando a String por atribui��es sequenciais
		String a = "Bom dia X";
		a = a.replace("X", "Eduardo");
		a = a.toUpperCase();
		a = a.concat("!!!");
		
		System.out.println(a);
		
		
		//Alterando a String com operador ponto (.) na primeira atribui��o
		String b = "Bom dia X"
				.replace("X", "Carlos")
				.toLowerCase()
				.concat("!!!");
		
		System.out.println(b);
		
		
		//N�o � poss�vel usar o operador ponto (.) em tipos primitivos
		int num = 3;
		
		System.out.println(num);
		
	}

}
