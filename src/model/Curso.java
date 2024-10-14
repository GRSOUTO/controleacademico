package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private Long codigo;
	private String descricao;
	private Long disciplinaId;
	private Long professorId;
	private List<Disciplina> disciplinas;
	private List<Professor> professor;

	
	public Curso(Long codigo) {
		this.codigo = codigo;
	}

	public Curso(Long codigo, String descricao, Long disciplinaId, Long professorId) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.disciplinaId = disciplinaId;
		this.professorId = professorId;
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

	public Long getDisciplinaId() {
		return disciplinaId;
	}

	public void setDisciplinaId(Long disciplinaId) {
		this.disciplinaId = disciplinaId;
	}

	public Long getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

	
	public List<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "\n Curso [codigo=" + codigo + ", descricao=" + descricao + ", disciplinaId=" + disciplinaId
				+ ", professorId=" + professorId +  "]";
	}

	
	
}