package model;

import model.Professor;
import model.Disciplina;

public class Curso {

	private Long codigo;
	private String descricao; 
	private Long codprofessor;
	private Long coddisciplina;
	private String nomeprofessor;
	private String nomedisciplina;


	public Curso() {

	}

	
	public Curso(Long codigo, String descricao, Long coddisciplina, Long codprofessor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.coddisciplina = coddisciplina;
		this.codprofessor = codprofessor;
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

	
	
	@Override
	public String toString() { 
		
		Disciplina caddisciplina;

		Professor cadprofessor;
		
		for (Professor professor : cadprofessor) {
			if (professor.getCodigo().equals(cadprofessor)) {
				this.nomeprofessor =  professor.getNome(); 
			}
		}
		
		
		for (Disciplina disciplina : caddisc) {
			if (disciplina.getCodigo().equals(coddisc)) {
				this.nomedisciplina =   disciplina.getDescricao(); 
			}
		}
				
				
		
		return "\n" + "Curso [codigo=" + codigo + ", descricao=" + descricao + ", disciplina=" + coddisciplina + ", professor="
				+ codprofessor + "]";

	}



}
