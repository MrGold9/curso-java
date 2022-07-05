package fundamentos.operadores;

public class Ternario 
{
	
	public static void main(String[] args) 
	{
		
		double media = 7;
		
		// ? separa a expressão dos valores atribuidos
		// : separa o valor true do valor false
		String resultadoParcial = media >= 5.0 ? 
				"em recuperação." : "reprovado.";
		
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		boolean bomComportamento = true;
		//boolean passouPorMedia = media >= 7;
		
		boolean temDesconto = bomComportamento && media >= 7;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
		
	}

}
