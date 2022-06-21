package fundamentos;

public class NotacaoPonto 
{
	
	public static void main(String[] args) 
	{
		//Alterando a String por atribuições sequenciais
		String a = "Bom dia X";
		a = a.replace("X", "Eduardo");
		a = a.toUpperCase();
		a = a.concat("!!!");
		
		System.out.println(a);
		
		
		//Alterando a String com operador ponto (.) na primeira atribuição
		String b = "Bom dia X"
				.replace("X", "Carlos")
				.toLowerCase()
				.concat("!!!");
		
		System.out.println(b);
		
		
		//Não é possível usar o operador ponto (.) em tipos primitivos
		int num = 3;
		
		System.out.println(num);
		
	}

}
