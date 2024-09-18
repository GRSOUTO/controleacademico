package model;

import java.time.LocalDate;



public class Pessoa {

	private String nome;
	private LocalDate dtNascimento;
	private TipoSexo sexo;
	private String endereco;
	private String cep;
	private String bairro;
	private String complemento;
	private String telefone;
	private String cidade;

	public Pessoa() {

	}

	public Pessoa(String nome,LocalDate dtNascimento,TipoSexo sexo, String endereco,String cep, String bairro, String complemento, String telefone,String cidade) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.cep = cep;
		this.bairro = bairro;
		this.complemento = complemento;
		this.telefone = telefone;
		this.cidade = cidade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dtNascimento=" + dtNascimento + ", sexo=" + sexo + ", endereco=" + endereco
				+ ", cep=" + cep + ", bairro=" + bairro + ", complemento=" + complemento + ", telefone=" + telefone
				+ ", cidade=" + cidade + "]";
	}

	
	
}
	