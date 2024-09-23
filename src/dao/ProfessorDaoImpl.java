package dao;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Aluno;
import model.Professor;
import model.Situacao;
import model.TipoSexo;
import model.Titulacao;

public class ProfessorDaoImpl implements ProfessorDao {

	private static List<Professor> cadprofessor;
	
	public ProfessorDaoImpl() {
		createProfessorList(); 
	}
	
	private List<Professor> createProfessorList() {
		if (cadprofessor == null) {
			cadprofessor = new LinkedList<>();
			cadprofessor.add(new Professor(1L, Titulacao.DOUTOR, "Professora Doutor",LocalDate.of(1992, 05 , 10), TipoSexo.FEMININO,"Endereço 01","97190-970", "Bairro 01","Complemento 01","51-999999","Porto Alegre"));
			cadprofessor.add(new Professor(2L, Titulacao.GRADUADO, "Professor Graduado",LocalDate.of(1992, 05 , 11), TipoSexo.FEMININO,"Endereço 01","97190-970", "Bairro 02","Complemento 02","51-88888","Porto Alegre"));
			cadprofessor.add(new Professor(3L, Titulacao.MESTRE, "Professor Mestre",LocalDate.of(1992, 05 , 11), TipoSexo.FEMININO,"Endereço 01","97190-970", "Bairro 03","Complemento 03","51-777777","Porto Alegre"));
		}
		return cadprofessor;
	}

	@Override
	public void salvar(Professor professor) {
		cadprofessor.add(professor);
	}

	@Override
	public void editar(Professor professor) {
		/*
		 * cadaluno.stream() .filter((u) ->
		 * u.getMatricula().equals(aluno.getMatricula())) .forEach((u) -> {
		 * u.setSituacao(aluno.getSituacao()); u.setNome(aluno.getNome());
		 * u.setEndereco(aluno.getEndereco()); u.setTelefone(aluno.getTelefone());
		 * 
		 * });
		 */

		for (Professor u : cadprofessor) {
			if (u.getId().equals(professor.getId())) {
				u.setTitulacaoMaxima(professor.getTitulacaoMaxima());
				u.setNome(professor.getNome()); 
				u.setDtNascimento(professor.getDtNascimento()); 
				u.setSexo(professor.getSexo());
				u.setEndereco(professor.getEndereco());
				u.setCep(professor.getCep());
				u.setBairro(professor.getBairro());
				u.setComplemento(professor.getComplemento());
				u.setTelefone(professor.getTelefone());
				u.setCidade(professor.getCidade()); 
			}
		}

	}

	@Override
	public void excluir(Long id) {
		// cadaluno.removeIf((u) -> u.getMatricula().equals(matricula));

		for (Iterator<Professor> iterator = cadprofessor.iterator(); iterator.hasNext();) {
			Professor professor = iterator.next();
			if (professor.getId().equals(id)) {
				iterator.remove();
				break; // Saímos do loop assim que encontramos e removemos o aluno
			}
		}

	}

	@Override
	public List<Professor> getTodos() {
		return cadprofessor;
	}

	@Override
	public Professor getId(Long id) {

		// return cadaluno.stream().filter((u) ->
		// u.getMatricula().equals(matricula)).collect(Collectors.toList()).get(0);

		for (Professor professor : cadprofessor) {
			if (professor.getId().equals(id)) {
				return professor;

			}
		}

		return null;

	}

}
