package model;

public class CursoDiscipProfessor {
	private Long cursoId;
	private String DesCurso;
	private String disciplina;
	private String professor;

	
	public Long getCursoId() {
		return cursoId;
	}


	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}


	public String getDesCurso() {
		return DesCurso;
	}


	public void setDesCurso(String desCurso) {
		DesCurso = desCurso;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public String getProfessor() {
		return professor;
	}


	public void setProfessor(String professor) {
		this.professor = professor;
	}


	@Override
	public String toString() {
		return " \n CursoDiscipProfessor [cursoId=" + cursoId + ", DesCurso=" + DesCurso + ", disciplina="
				+ disciplina + ", professor=" + professor + "]";
	}

}
