package model;

public class Turma {

	private Integer ano;
	private Integer semestre;
	private Integer diaSemana;
	private String horarios;

	private Professor professor;
	private Aluno aluno;
	private Disciplina disciplina;

	public Turma() {

	}

	public Turma(Integer ano, Integer semestre, Integer diaSemana, String horarios, Professor professor, Aluno aluno,
			Disciplina disciplina) {
		super();
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horarios = horarios;
		this.professor = professor;
		this.aluno = aluno;
		this.disciplina = disciplina;
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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void abrirTurno() {

	}

	public void alocarProfessor() {

	}

	public void matricularAluno() {

	}

	public void emitirDiario() {

	}

	@Override
	public String toString() {
		return "\n" + "Turma [ano=" + ano + ", semestre=" + semestre + ", diaSemana=" + diaSemana + ", horarios=" + horarios
				+ ", professor=" + professor + ", aluno=" + aluno + ", disciplina=" + disciplina + "]";
	}
	
	
}
