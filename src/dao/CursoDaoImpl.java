package dao;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Curso;

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
		}

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
				break; // SaÃ­mos do loop assim que encontramos e removemos o aluno
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
