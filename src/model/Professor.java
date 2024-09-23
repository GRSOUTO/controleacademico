package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	private Long id;
	private Titulacao titulacaoMaxima;

	public Professor() {
		super();
	}

	public Professor(Long id) {
		this.id = id;

	}	
	
	public Professor(Long id, Titulacao titulacaoMaxima) {
		super();
		this.id = id;
		this.titulacaoMaxima = titulacaoMaxima;
	}

		
	public Professor(Long id, Titulacao titulacaoMaxima, String nome, LocalDate data, TipoSexo sexo, String endereco,
			String cep, String bairro, String complemento, String telefone, String cidade) {
		super(nome, data, sexo, endereco, cep, bairro, complemento, telefone, cidade);
		this.id = id;
		this.titulacaoMaxima = titulacaoMaxima; 
	}
	
	
	public Long getId() {
		return id;
	}

	public Long setId(Long id) {
		return this.id = id;

	}

	public Titulacao getTitulacaoMaxima() {
		return titulacaoMaxima;
	}

	public void setTitulacaoMaxima(Titulacao titulacaoMaxima) {
		this.titulacaoMaxima = titulacaoMaxima;
	}
	
		public void cadastrar() {

	}

	
		
	@Override
	public String toString() {
			return "\n Professor [id=" + id + ", titulacaoMaxima=" + titulacaoMaxima + ", Nome=" + getNome() + ", dtNascimento="
					+ getDtNascimento() + ", sexo= " + getSexo() + ", EndereÃ§o=" + getEndereco() + ", Cep=" + getCep()
					+ ", Bairro=" + getBairro() + ", Complemento=" + getComplemento() + ", Telefone=" + getTelefone()
					+ ", Cidade = " + getCidade() + ""; 			
			
	}
}
