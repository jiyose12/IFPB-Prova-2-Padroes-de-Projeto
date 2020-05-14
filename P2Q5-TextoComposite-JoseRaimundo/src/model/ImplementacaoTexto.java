package model;

import java.util.ArrayList;
import java.util.List;

public abstract class ImplementacaoTexto {

	protected List<ImplementacaoTexto> texto = new ArrayList<ImplementacaoTexto>();
	
	public void imprimir() {}

	public List<ImplementacaoTexto> getTexto() {
		return texto;
	}
	
	public void adicionar(ImplementacaoTexto l) {
		texto.add(l);
	}

}
