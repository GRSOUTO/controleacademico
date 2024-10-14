package dao;

import java.util.List;
import java.util.function.Function;

import model.Aluno;
import model.Curso;
import model.CursoDiscipProfessor;
import model.Disciplina;
import model.Professor;

public interface CursoDisciplinaProfessor {

	List<CursoDiscipProfessor> obterCursoDiscProf();

	List<CursoDiscipProfessor> getTodosCursos();

	CursoDiscipProfessor getId(Long cursoId);

}
