package fundamentos.operadores;

public class Ternario 
{
	
	public static void main(String[] args) 
	{
		
		double media = 7;
		
		// ? separa a express�o dos valores atribuidos
		// : separa o valor true do valor false
		String resultadoParcial = media >= 5.0 ? 
				"em recupera��o." : "reprovado.";
		
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		
		boolean bomComportamento = true;
		//boolean passouPorMedia = media >= 7;
		
		boolean temDesconto = bomComportamento && media >= 7;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s", resultado);
		
	}

}
