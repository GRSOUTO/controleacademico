package dao;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Curso;
import model.Professor;

public class CursoDaoImpl implements CursoDao {

	private static List<Curso> cadcurso;
	
	public CursoDaoImpl() {
		createCursoList(); 
	}
	
	private List<Curso> createCursoList() {
		if (cadcurso == null) {
			cadcurso = new LinkedList<>();
			cadcurso.add(new Curso(1L, "Curso um"));
			cadcurso.add(new Curso(2L, "Curso dois"));
			cadcurso.add(new Curso(3L, "Curso tres"));
		}
		return cadcurso;
	}

	@Override
	public void salvar(Curso curso) {
		cadcurso.add(curso);
	}

	@Override
	public void editar(Curso curso) {
		/*
		 * cadaluno.stream() .filter((u) ->
		 * u.getMatricula().equals(aluno.getMatricula())) .forEach((u) -> {
		 * u.setSituacao(aluno.getSituacao()); u.setNome(aluno.getNome());
		 * u.setEndereco(aluno.getEndereco()); u.setTelefone(aluno.getTelefone());
		 * 
		 * });
		 */

		for (Curso u : cadcurso) {
			if (u.getCodigo().equals(curso.getCodigo())) {
				u.setDescricao(curso.getDescricao());
			}
		}

	}

	
	@Override
	public void excluir(Long codigo) {
		
		for (Iterator<Curso> iterator = cadcurso.iterator(); iterator.hasNext();) {
			Curso curso = iterator.next();
			if (curso.getCodigo().equals(codigo)) {
				iterator.remove();
				break; // Saímos do loop assim que encontramos e removemos o aluno
			}
		}

	}
	

	@Override
	public List<Curso> getTodos() {
		return cadcurso;
	}

	
	@Override
	public Curso getCodigo(Long codigo) {

		// return cadaluno.stream().filter((u) ->
		// u.getMatricula().equals(matricula)).collect(Collectors.toList()).get(0);

		for (Curso curso : cadcurso) {
			if (curso.getCodigo().equals(codigo)) {
				return curso;

			}
		}

		return null;
	
	}

}
