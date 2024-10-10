package dao;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.Curso;
import model.Disciplina;
import model.Professor;
import dao.ProfessorDao;
import dao.ProfessorDaoImpl;

public class CursoDisciplinaProfessorimpl implements CursoDisciplinaProfessor {

	@Override
	public List<Curso> obterCursoDiscProf() {

		CursoDao cursoDao = new CursoDaoImpl();
		List<Curso> cursos = cursoDao.getTodos();
		// System.out.println(cursoDao.getTodos());

		DisciplinaDaoImp disciplinaDao = new DisciplinaDaoImp();
		List<Disciplina> disciplinas = disciplinaDao.getTodos();
		// System.out.println(disciplinaDao.getTodos());

		ProfessorDao professorDao = new ProfessorDaoImpl();
		System.out.println(professorDao.getTodos());
		// List<Professor> professores =new professorDao.getTodos();

		associarDiscipProfACursos(cursos, disciplinas, professorDao.getTodos());

		return cursos;
	}

	private void associarDiscipProfACursos(List<Curso> cursos, List<Disciplina> disciplinas,
			List<Professor> professores) {
		for (Curso curso : cursos) {
	

			System.out.println(curso);
			System.out.println("ID CURSO:" + curso.getCodigo());
			System.out.println("Descrição do Curso:" + curso.getDescricao());

			for (Disciplina disciplina : disciplinas) {
				if (curso.getDisciplinaId().equals(disciplina.getCodigo())) {
					System.out.println("Disciplina:" + disciplina.getDescricao());
					break;
				}
			}

			for (Professor professor : professores) {

				if (curso.getProfessorId().equals(professor.getId())) {
					System.out.println("Proferssor:" + professor.getNome());
					System.out.println("  ");
					break;
				}

			}
		}
	}

	public void imprimirCursoDisciplinaProfessor(List<Curso> cursos, List<Disciplina> disciplinas) {
		System.out.println("Oi");
		for (Curso curso : cursos) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("ID Curso: " + curso.getCodigo());
			System.out.println("Descrição Curso: " + curso.getDescricao());
			System.out.println("Disciplina:" + curso.getDisciplinaId());
			System.out.println("proFessor:" + curso.getProfessorId());

			System.out.println(curso.getDisciplinaId());

			/*
			 * for (Disciplina disciplina : curso.getDisciplinaId()) {
			 * 
			 * System.out.println(disciplina.getCodigo());
			 * System.out.println(" - Disciplina: " + disciplina.getDescricao());
			 * 
			 * }
			 */
		}
	}
}
