package model;

public class Turma {

	private Integer ano;
	private Integer semestre;
	private Integer diaSemana;
	private String horarios;

	private Curso curso;
	private Aluno aluno;


	public Turma() {
	}


	public Turma(Integer ano, Integer semestre, Integer diaSemana, String horarios, Curso curso, Aluno aluno) {
		super();
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horarios = horarios;
		this.curso = curso;
		this.aluno = aluno;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public Integer getSemestre() {
		return semestre;
	}


	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}


	public Integer getDiaSemana() {
		return diaSemana;
	}


	public void setDiaSemana(Integer diaSemana) {
		this.diaSemana = diaSemana;
	}


	public String getHorarios() {
		return horarios;
	}


	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	@Override
	public String toString() {
		return "Turma [ano=" + ano + ", semestre=" + semestre + ", diaSemana=" + diaSemana + ", horarios=" + horarios
				+ ", curso=" + curso + ", aluno=" + aluno + "]";
	}

	
	
}