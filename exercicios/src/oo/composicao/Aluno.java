package oo.composicao;

import java.util.ArrayList;

public class Aluno 
{
	
	String nome;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	void adicionarCurso(Curso curso) 
	{
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	
}
