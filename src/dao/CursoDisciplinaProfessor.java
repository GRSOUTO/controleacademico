package dao;

import java.util.List;
import java.util.function.Function;

import model.Curso;
import model.Disciplina;
import model.Professor;

public interface CursoDisciplinaProfessor {
	List<Curso> obterCursoDiscProf();
	
}
