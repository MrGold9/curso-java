package fundamentos;

public class TiposPrimitivos 
{
	
	public static void main(String[] args) 
	{
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3134845223L;
		
		//Tipos numéricos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		
		
		//Dias de empresa
		System.out.println("Quantos dias está na empresa: " + anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println("Número de viagens feitas: " + numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Mostrar o salário desse id
		System.out.println("ID " + id + " ganha " + salario + " reais");
		
		//Está de férias
		System.out.println("Está de férias? R: " + estaDeFerias);
		
		//Status atual na empresa
		System.out.println("Status: " + status);
	}

}
