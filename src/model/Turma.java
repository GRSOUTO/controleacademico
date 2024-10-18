package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Turma {

	private Long codigo;
	private Integer ano;
	private Integer semestre;
	private Integer diaSemana;
	private String horarios;
    private Long cursosId;
    private Long alunoId;

    




	public Turma() {
	}

	public Turma(Long codigo, Integer ano, Integer semestre, Integer diaSemana, String horarios, Long cursosId,Long alunoId) {
		this.codigo = codigo;
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horarios = horarios;
		this.cursosId = cursosId;
		this.cursosId = alunoId;
		
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public Long getCursosId() {
		return cursosId;
	}

	public void setCursosId(Long cursosId) {
		this.cursosId = cursosId;
	}

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}


	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", ano=" + ano + ", semestre=" + semestre + ", diaSemana=" + diaSemana
				+ ", horarios=" + horarios + ", cursosId=" + cursosId + ", alunoId=" + alunoId + "]";
	}
}