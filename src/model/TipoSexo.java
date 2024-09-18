package model;

public enum TipoSexo {

	FEMININO('F'), MASCULINO('M'),INDEFINIDO('I');

	private char desc;

	TipoSexo(char desc) {
		this.desc = desc;
	}

	public char getDesc() {
		return desc;

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
