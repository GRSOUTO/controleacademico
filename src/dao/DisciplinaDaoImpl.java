package dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Disciplina;

public class DisciplinaDaoImpl implements DisciplinaDao {

	private static List<Disciplina> caddisciplina;

	public DisciplinaDaoImpl() {
		createDiscList();
	}

	private List<Disciplina> createDiscList() {
		if (caddisciplina == null) {
			caddisciplina = new LinkedList<>();
			caddisciplina.add(new Disciplina(1L, "Matemática", 40, "xxxx", "ggggggg"));
			caddisciplina.add(new Disciplina(2L, "Português", 30, "xxxx", "ggggggg"));
			caddisciplina.add(new Disciplina(3L, "História", 20, "xxxx", "ggggggg"));
		}
		return caddisciplina;
	}

	@Override
	public void salvar(Disciplina disciplina) {
		caddisciplina.add(disciplina);

	}

	@Override
	public void editar(Disciplina disciplina) {

		for (Disciplina u : caddisciplina) {
			if (u.getCodigo().equals(disciplina.getCodigo())) {
				u.setDescricao(disciplina.getDescricao());
				u.setCargaHoraria(disciplina.getCargaHoraria());
				u.setEmenta(disciplina.getEmenta());
				u.setBibliografia(disciplina.getBibliografia());
			}

		}
	}

	@Override
	public void excluir(Long codigo) {

		for (Iterator<Disciplina> iterator = caddisciplina.iterator(); iterator.hasNext();) {
			Disciplina disciplina = iterator.next();
			if (disciplina.getCodigo().equals(codigo)) {
				iterator.remove();
				break;
			}
		}

	}

	@Override
	public Disciplina getId(Long codigo) {
		for (Disciplina disciplina : caddisciplina) {
			if (disciplina.getCodigo().equals(codigo)) {
				return disciplina;

			}
		}
		return null;

	}

	@Override
	public List<Disciplina> getTodos() {
		return caddisciplina;
	}

}
