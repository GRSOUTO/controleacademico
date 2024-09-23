package Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.crypto.Data;

import dao.Conversor;
import model.Situacao;
import model.TipoSexo;
import model.Titulacao;

public class Converter implements Conversor {

	public TipoSexo convert(String texto) {
		switch (texto.toUpperCase()) {
		case "M":
		case "MASCULINO":
			return TipoSexo.MASCULINO;
		case "F":
		case "FEMININO":
			return TipoSexo.FEMININO;
		default:
			throw new IllegalArgumentException("Valor de sexo inválido: " + texto);
		}
	}

	public Situacao convertSituacao(String texto) {
		switch (texto.toUpperCase()) {
		case "A":
		case "ATIVO":
			return Situacao.ATIVO;
		case "I":
		case "INATIVO":
			return Situacao.INATIVO;
		default:
			throw new IllegalArgumentException("Valor de Situacao inválido: " + texto);
		}

	}
	
	public Titulacao convertTitulacao(String texto) {
		switch (texto.toUpperCase()) {
		case "G":
		case "GRADUADO":
			return Titulacao.GRADUADO;
		case "P":
		case "POSGRADUADO":
			return Titulacao.POSGRADUADO;
		case "M":
		case "MESTRE":
			return Titulacao.MESTRE;
		case "D":
		case "DOUTOR":
			return Titulacao.DOUTOR;	
		default:
			throw new IllegalArgumentException("Valor de Titulacao invÃ¡lido: " + texto);
		}

	}


	public LocalDate convertData(String texto) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data = LocalDate.parse(texto, formatter);
		return data;

	}

}
