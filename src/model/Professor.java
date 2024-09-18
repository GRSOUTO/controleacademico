package model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	private Integer id;
	private String titulacaoMaxima;

	public Professor() {
	}

	public Professor(Long id, String titulacaoMaxima) {
		super();
		this.titulacaoMaxima = titulacaoMaxima;

	}

	public Integer getId() {
		return id;
	}

	public Integer setId(Integer id) {
		return this.id = id;

	}

	public String getTitulacaoMaxima() {
		return titulacaoMaxima;
	}

	public void setTitulacaoMaxima(String titulacaoMaxima) {
		this.titulacaoMaxima = titulacaoMaxima;
	}

	public void cadastrar() {

	}

	@Override
	public String toString() {
		return "\n" + "Professor [id=" + id + ", titulacaoMaxima=" + titulacaoMaxima + ", Nome=" + getNome()
				+ ", Endereco=" + getEndereco() + ", Telefone=" + getTelefone() + "]";
	}
}
