package fundamentos;

public class TiposPrimitivos 
{
	
	public static void main(String[] args) 
	{
		//Informa��es do funcion�rio
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3134845223L;
		
		//Tipos num�ricos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		
		
		//Dias de empresa
		System.out.println("Quantos dias est� na empresa: " + anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println("N�mero de viagens feitas: " + numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Mostrar o sal�rio desse id
		System.out.println("ID " + id + " ganha " + salario + " reais");
		
		//Est� de f�rias
		System.out.println("Est� de f�rias? R: " + estaDeFerias);
		
		//Status atual na empresa
		System.out.println("Status: " + status);
	}

}
