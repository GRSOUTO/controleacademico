package model;

public class Avaliacao {

	private Long id;

	private Integer nota1;

	private Integer nota2;

	private Float provaFinal;

	private Integer frequencia;

	private Disciplina disciplina;

	private Aluno aluno;

	private Professor professor;

	public Avaliacao() {

	}

	public Avaliacao(Long id, Integer nota1, Integer nota2, Float provaFinal, Integer frequencia, Disciplina disciplina,
			Aluno aluno, Professor professor) {
		super();
		this.id = id;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.provaFinal = provaFinal;
		this.frequencia = frequencia;
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.professor = professor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNota1() {
		return nota1;
	}

	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}

	public Integer getNota2() {
		return nota2;
	}

	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}

	public Float getProvaFinal() {
		return provaFinal;
	}

	public void setProvaFinal(Float provaFinal) {
		this.provaFinal = provaFinal;
	}

	public Integer getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Integer frequencia) {
		this.frequencia = frequencia;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void lancarAvaliacao() {

	}

	public void caclcularAprovacao() {

	}
}
