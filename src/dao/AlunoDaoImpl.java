package dao;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


import model.Aluno;
import model.Situacao;
import model.TipoSexo;

public class AlunoDaoImpl implements AlunoDao {

	private static List<Aluno> cadaluno;

	public AlunoDaoImpl() {
		createAlunoList();
	}

	private List<Aluno> createAlunoList() {
		if (cadaluno == null) {
			cadaluno = new LinkedList<>();
			cadaluno.add(new Aluno(1L, Situacao.ATIVO, "Fulana",LocalDate.of(1992, 05 , 10), TipoSexo.FEMININO, "testes  ", "97190-970", "Restinga", "X", "51-999999","Porto Alegre"));
			cadaluno.add(new Aluno(2L, Situacao.INATIVO, "Fulano",LocalDate.of(2000, 10 , 01), TipoSexo.MASCULINO, "testes  ", "97190-999", "Centro", "X", "51-999999","Porto Alegre"));
			cadaluno.add(new Aluno(3L, Situacao.ATIVO, "Fulano1",LocalDate.of(1990, 06 , 07), TipoSexo.MASCULINO, "testes  ", "97190-999", "Centro", "X", "51-999999","Porto Alegre"));
		}
		return cadaluno;
	}

	@Override
	public void salvar(Aluno aluno) {
		cadaluno.add(aluno);
	}

	@Override
	public void editar(Aluno aluno) {
		/*
		 * cadaluno.stream() .filter((u) ->
		 * u.getMatricula().equals(aluno.getMatricula())) .forEach((u) -> {
		 * u.setSituacao(aluno.getSituacao()); u.setNome(aluno.getNome());
		 * u.setEndereco(aluno.getEndereco()); u.setTelefone(aluno.getTelefone());
		 * 
		 * });
		 */

		for (Aluno u : cadaluno) {
			if (u.getMatricula().equals(aluno.getMatricula())) {
				u.setSituacao(aluno.getSituacao());
				u.setNome(aluno.getNome());
				u.setDtNascimento(aluno.getDtNascimento());
				u.setSexo(aluno.getSexo());				
				u.setEndereco(aluno.getEndereco());
				u.setCep(aluno.getCep());
				u.setBairro(aluno.getBairro());
				u.setComplemento(aluno.getComplemento());
				u.setTelefone(aluno.getTelefone());
				u.setCidade(aluno.getCidade());
			}
		}

	}

	@Override
	public void excluir(Long matricula) {
		// cadaluno.removeIf((u) -> u.getMatricula().equals(matricula));

		for (Iterator<Aluno> iterator = cadaluno.iterator(); iterator.hasNext();) {
			Aluno aluno = iterator.next();
			if (aluno.getMatricula().equals(matricula)) {
				iterator.remove();
				break; // Saímos do loop assim que encontramos e removemos o aluno
			}
		}

	}

	@Override
	public List<Aluno> getTodos() {
		return cadaluno;
	}

	@Override
	public Aluno getId(Long matricula) {

		// return cadaluno.stream().filter((u) ->
		// u.getMatricula().equals(matricula)).collect(Collectors.toList()).get(0);

		for (Aluno aluno : cadaluno) {
			if (aluno.getMatricula().equals(matricula)) {
				return aluno;

			}
		}

		return null;

	}

}
