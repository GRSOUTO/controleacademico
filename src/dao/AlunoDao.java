package dao;

import java.util.List;

import model.Aluno;

public interface AlunoDao {

	void salvar(Aluno aluno);

	void editar(Aluno aluno);

	void excluir(Long id);

	Aluno getId(Long matricula);

	List<Aluno> getTodos();

}
