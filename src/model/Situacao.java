package model;

public enum Situacao {
	
	ATIVO('A'),INATIVO('I'),VAZIO('V') ;
	
	private char desc;
	
	Situacao(char desc){
		this.desc = desc;
	}
	
	public char getDesc() {
		return desc;
		
	}
	@Override
	public String toString() {
		return  super.toString();		
	}

}
