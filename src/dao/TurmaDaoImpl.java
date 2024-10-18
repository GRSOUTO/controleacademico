package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.Aluno;
import model.Curso;
import model.Professor;
import model.Turma;

public class TurmaDaoImpl implements TurmaDao {

	private static List<Turma> cadturma;

	public TurmaDaoImpl() {
		createCursoList();
	}

	private List<Turma> createCursoList() {
		if (cadturma == null) {
			cadturma = new LinkedList<>();

			cadturma.add(new Turma(1L, 2024, 1, 1, "Seg-Sex", 1L, 2L));

		}
		return cadturma;
	}

	@Override
	public void salvar(Turma turma) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editar(Turma turma) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Long codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Turma getId(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turma> getTodos() {

		return cadturma;

	}
}