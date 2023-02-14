package oo.composicao;

import java.util.ArrayList;

public class Aluno 
{
	
	final String nome;
	//ArrayList para adicionar os cursos 
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome)
	{
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) 
	{
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	//Encontrar os alunos inseridos em um único curso
	Curso obterCursoPorNome(String nome) 
	{
		
		for(Curso curso: this.cursos) 
		{
			if(curso.nome.equalsIgnoreCase(nome)) 
			{
				return curso;
			}
		}
		return null;
		
	}
	
	//Alterando o método .toString
	public String toString() 
	{
		return nome;
	}
	
	
}
