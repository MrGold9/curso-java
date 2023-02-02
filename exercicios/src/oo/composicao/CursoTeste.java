package oo.composicao;

public class CursoTeste 
{
	
	public static void main(String[] args) 
	{
	
		//Adicionando alunos ao Array
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		//Adicionando cursos ao Array
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		/*Os alunos podem ser adicionados aos cursos
		tanto quanto os cursos podem ser adicionados
		aos alunos*/
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		//Iterando os alunos do curso 3
		for(Aluno aluno : curso3.alunos) 
		{
			System.out.println("Estou matriculado no curso 3");
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		//Retornando os alunos do curso de índice 0 através do aluno 1
		System.out.println(aluno1.cursos.get(0).alunos + "$");
		
		
		//Encontrar os alunos inseridos no curso de "Java Completo"
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if (cursoEncontrado != null) 
		{
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
		
	}

}
