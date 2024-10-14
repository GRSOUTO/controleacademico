package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Curso;
import model.Disciplina;
import model.Professor;

public class CursoDaoImpl implements CursoDao {

	private static List<Curso> cadcurso;

	public CursoDaoImpl() {
		createCursoList();
	}

	private List<Curso> createCursoList() {
		if (cadcurso == null) {
			cadcurso = new LinkedList<>();

			cadcurso.add(new Curso(1L, "Curso 1", 1L, 1L));
			cadcurso.add(new Curso(2L, "Curso 2", 2L, 2L));
			cadcurso.add(new Curso(3L, "Curso 3", 3L, 3L));
		}
		return cadcurso;
	}

	@Override
	public void salvar(Curso curso) {
		cadcurso.add(curso);
	}

	@Override
	public void editar(Curso curso) {
		cadcurso.stream().filter((u) -> u.getCodigo().equals(curso.getCodigo())).forEach((u) -> {
			u.setDescricao(curso.getDescricao());
			u.setDisciplinaId(curso.getDisciplinaId());
			u.setProfessor(curso.getProfessor());
		});

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
