package model;

public class Curso {

	private Integer codigo;
	private String descricao;

	private Disciplina disciplina;

	private Professor professor;

	///private Aluno aluno;

	public Curso() {

	}

	public Curso(Integer codigo, String descricao, Disciplina disciplina, Professor professor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.disciplina = disciplina;
		this.professor = professor;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}




	@Override
	public String toString() {
		return "\n" + "Curso [codigo=" + codigo + ", descricao=" + descricao + ", disciplina=" + disciplina + ", professor="
				+ professor + "]";
	}



}
