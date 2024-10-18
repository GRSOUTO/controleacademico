package dao;

import java.util.List;

import model.Aluno;
import model.Curso;
import model.Turma;

public interface TurmaDao {

	void salvar(Turma turma);

	void editar(Turma turma);

	void excluir(Long codigo);

	Turma getId(Long codigo);

	List<Turma> getTodos();
	
}
