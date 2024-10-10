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

		DisciplinaDaoImp disciplinaDao = new DisciplinaDaoImp();
		List<Disciplina> disciplinas = disciplinaDao.getTodos();

		ProfessorDao professorDao = new ProfessorDaoImpl();
		
		associarDiscipProfACursos(cursos, disciplinas, professorDao.getTodos());

		return cursos;
	}

	private void associarDiscipProfACursos(List<Curso> cursos, List<Disciplina> disciplinas,List<Professor> professores) {

		List<CursoDisciplinaProfessor> cursosComDetalhes = new ArrayList<>();

		for (Curso curso : cursos) {
			CursoDisciplinaProfessor cdp = new CursoDisciplinaProfessor();
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
		System.out.println(cursosComDetalhes);
	}

	public void imprimirCursoDisciplinaProfessor() {

	}

	public static class CursoDisciplinaProfessor {
		private Long cursoId;
		private String DesCurso;
		private String disciplina;
		private String professor;

		public Long getCursoId() {
			return cursoId;
		}

		public void setCursoId(Long cursoId) {
			this.cursoId = cursoId;
		}

		public String getDesCurso() {
			return DesCurso;
		}

		public void setDesCurso(String desCurso) {
			DesCurso = desCurso;
		}

		public String getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(String disciplina) {
			this.disciplina = disciplina;
		}

		public String getProfessor() {
			return professor;
		}

		public void setProfessor(String professor) {
			this.professor = professor;
		}

		@Override
		public String toString() {
			return " \n CursoDisciplinaProfessor [cursoId=" + cursoId + ", DesCurso=" + DesCurso + ", disciplina="
					+ disciplina + ", professor=" + professor + "]";
		}

	}
}
