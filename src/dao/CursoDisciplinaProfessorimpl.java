package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;
import model.Curso;
import model.CursoDiscipProfessor;
import model.Disciplina;
import model.Professor;

public class CursoDisciplinaProfessorimpl implements CursoDisciplinaProfessor {

	public List<CursoDiscipProfessor> obterCursoDiscProf() {
		List<Curso> cursos = new CursoDaoImpl().getTodos();
		List<Disciplina> disciplinas = new DisciplinaDaoImpl().getTodos();
		List<Professor> professores = new ProfessorDaoImpl().getTodos();

		Map<Long, Disciplina> disciplinaMap = new HashMap<>();
		for (Disciplina disciplina : disciplinas) {
			//System.out.println(disciplina);
			disciplinaMap.put(disciplina.getCodigo(), disciplina);
			//System.out.println(disciplinaMap.put(disciplina.getCodigo(), disciplina));
		}

		Map<Long, Professor> professorMap = new HashMap<>();
		//System.out.println(professorMap);
		for (Professor professor : professores) {
			//System.out.println(professorMap);
			professorMap.put(professor.getId(), professor);
			//System.out.println(professorMap.put(professor.getId(), professor));
		}

		List<CursoDiscipProfessor> cursosComDetalhes = new ArrayList<>();

		for (Curso curso : cursos) {
			CursoDiscipProfessor cdp = new CursoDiscipProfessor();

			cdp.setCursoId(curso.getCodigo());
			cdp.setDesCurso(curso.getDescricao());

			if (cdp.getCursoId().equals(curso.getCodigo())) {

				for (Disciplina disciplina : disciplinas) {
					if (curso.getDisciplinaId().equals(disciplina.getCodigo())) {
						cdp.setDisciplina(disciplina.getDescricao());
						break;
					}
				}

				for (Professor professor : professores) {
					if (curso.getProfessorId().equals(professor.getId())) {
						cdp.setProfessor(professor.getNome());
						break;
					}

				}

			}
			cursosComDetalhes.add(cdp);

		}
		//System.out.println(cursosComDetalhes);
		return cursosComDetalhes;
	}

	@Override
	public List<CursoDiscipProfessor> getTodosCursos() {
		return obterCursoDiscProf();
	}

	@Override
	public CursoDiscipProfessor getId(Long cursoId) {
		List<CursoDiscipProfessor> cursosComDetalhes = obterCursoDiscProf();
		for (CursoDiscipProfessor cdp : cursosComDetalhes) {
			if (cdp.getCursoId().equals(cursoId)) {
				return cdp;
			}
		}
		return null;
	}

}
