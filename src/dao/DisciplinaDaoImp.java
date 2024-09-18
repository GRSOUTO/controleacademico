package dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Disciplina;

public class DisciplinaDaoImp implements DisciplinaDao {

	private static List<Disciplina> caddisciplina;

	public DisciplinaDaoImp() {
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
		System.out.println("1 : " + disciplina.getCargaHoraria());
		for (Disciplina u : caddisciplina) {
			System.out.println("2 :" + disciplina.getCodigo());
			
			if (u.getCodigo().equals(disciplina.getCodigo())) {
				
				System.out.println("3 :" + disciplina.getCodigo());
				u.setDescricao(disciplina.getDescricao());
				System.out.println("4 :" + disciplina.getDescricao());
				u.setCargaHoraria(disciplina.getCargaHoraria());
				System.out.println("5 :" + disciplina.getCargaHoraria());
				u.setEmenta(disciplina.getEmenta());
				System.out.println("6 :" + disciplina.getEmenta());
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
