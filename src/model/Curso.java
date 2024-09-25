package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private Long codigo;
	private String descricao;

	private List<Disciplina> disciplinasc = new ArrayList<>();

	private List<Professor> professor = new ArrayList<>();

	public Curso(Long codigo) {
		this.codigo = codigo;
	}

	public Curso(Long codigo, String descricao, List<Disciplina> disciplinas, List<Professor> professor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.disciplinasc = disciplinas;
		this.professor = professor;
	}

	public Curso(Long codigo, String descricao, Long codigodiscp, Long id) {
		this(codigo, descricao, new ArrayList<>(), new ArrayList<>());
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Disciplina> getDisciplinasc(Long codigo) {
		for (Disciplina disciplina : disciplinasc) {
			if (disciplina.getCodigo().equals(codigo)) {
				return Collections.singletonList(disciplina); // Retorna uma lista imutável com a disciplina encontrada

			}
		}
		return Collections.emptyList(); // Retorna uma lista vazia se a disciplina não for encontrada
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinasc = disciplinas;
	}

	public List<Professor> getProfessor(Long id) {
		for (Professor professor : professor) {
			if (professor.getId().equals(id)) {
				return Collections.singletonList(professor); // Retorna uma lista imutável com a disciplina encontrada
			}
		}
		return Collections.emptyList(); // Retorna uma lista vazia se a disciplina não for encontrada
	}

	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return " \n Curso [codigo=" + codigo + ", descricao=" + descricao + ", disciplinas=" + getCodigo()
				+ ", professor="
				+ getProfessor(id) + "]";
	}

}
