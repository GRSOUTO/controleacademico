package dao;

import java.util.List;

import model.Disciplina;

public interface DisciplinaDao {

	void salvar(Disciplina disciplina);

	void editar(Disciplina disciplina);

	void excluir(Long codigo);

	Disciplina getId(Long codigo);

	List<Disciplina> getTodos();

}
