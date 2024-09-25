package dao;

import java.util.List;

import model.Curso;

public interface CursoDao {

	void salvar(Curso curso);

	void editar(Curso curso);

	void excluir(Long codigo);

	Curso getCodigo(Long codigo);

	List<Curso> getTodos();

	void editar(Curso curso, Long codigo, Long id);

}
