package dao;

import java.util.List;

import model.Professor;

public interface ProfessorDao {

	void salvar(Professor professor);

	void editar(Professor professor);

	void excluir(Long id);

	Professor getId(Long id);

	List<Professor> getTodos();

}
