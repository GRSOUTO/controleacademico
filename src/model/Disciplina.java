package model;

public class Disciplina {

	private Long codigo;
	private String descricao;
	private Integer cargaHoraria;
	private String ementa;
	private String bibliografia;

	public Disciplina() {

	}

	public Disciplina(Long codigo, String descricao, Integer cargaHoraria, String ementa, String bibliografia) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.bibliografia = bibliografia;
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

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public void cadastrar() {

	}

	@Override
	public String toString() {
		return "\n" + "Disciplina [codigo=" + codigo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria
				+ ", ementa=" + ementa + ", bibliografia=" + bibliografia + "]";
	}

}
