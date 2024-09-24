package model;

public class Curso {

	private Long codigo;
	private String descricao; 

	private Disciplina disciplina;

	private Professor professor;

<<<<<<< Updated upstream
	///private Aluno aluno;
=======
>>>>>>> Stashed changes

	public Curso() {

	}

<<<<<<< Updated upstream
	public Curso(Integer codigo, String descricao, Disciplina disciplina, Professor professor) {
=======
	public Curso(Long codigo) {
		this.codigo = codigo;
	} 
	
	public Curso(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	} 
	
	public Curso(Long codigo, String descricao, Disciplina disciplina, Professor professor) {
>>>>>>> Stashed changes
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.disciplina = disciplina;
		this.professor = professor;
<<<<<<< Updated upstream
		
=======
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream



	@Override
	public String toString() {
		return "\n" + "Curso [codigo=" + codigo + ", descricao=" + descricao + ", disciplina=" + disciplina + ", professor="
				+ professor + "]";
=======
	
	@Override
	public String toString() {
		return "\n" + "Curso [codigo=" + codigo + ", descricao=" + descricao + ", disciplina=" + disciplina + ", professor="
				+ professor +  "]";
>>>>>>> Stashed changes
	}



}
