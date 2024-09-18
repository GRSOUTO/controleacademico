package dao;

import model.Situacao;
import model.TipoSexo;

public interface Conversor {
	TipoSexo convert(String texto);
	Situacao convertSituacao(String texto);
}
