package model;

import java.time.LocalDate;

public class Aluno extends Pessoa {

	private Long matricula;
	private Situacao situacao;

	public Aluno() {
		super();

	}

	public Aluno(Long matricula) {
		this.matricula = matricula;

	}

	public Aluno(Long matricula, Situacao situacao, String nome, LocalDate dtNascimento, TipoSexo sexo, String endereco,
			String cep, String bairro, String complemento, String telefone, String cidade) {
		super(nome, dtNascimento, sexo, endereco, cep, bairro, complemento, telefone, cidade);
		this.matricula = matricula;
		this.situacao = situacao;

	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public void matricularCurso() {
	}

	public void trancar() {
	}

	public void formar() {

	}

	public void evadir() {
	}

	public void obterAvalicacoes() {
	}

	public void emtirHistorico() {

	}

	@Override
	public String toString() {
		return "\n Aluno [matricula=" + matricula + ", situacao=" + situacao + ", Nome=" + getNome() + ", dtNascimento="
				+ getDtNascimento() + ", sexo= " + getSexo() + ", Endereço=" + getEndereco() + ", Cep=" + getCep()
				+ ", Bairro=" + getBairro() + ", Complemento=" + getComplemento() + ", Telefone=" + getTelefone()
				+ ", Cidade = " + getCidade() + "";

	}
}
