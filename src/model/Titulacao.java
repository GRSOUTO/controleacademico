package model;

public enum Titulacao {
	
	GRADUADO('G'),POSGRADUADO('P'),MESTRE('M'),DOUTOR('D');
	
		
	private char desc;
	
	Titulacao(char desc){
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
