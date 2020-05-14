package model;

public abstract class Imprimir {

	protected ImplementacaoLista lista;

	public Imprimir(ImplementacaoLista lista) {
		this.lista = lista;
	}
	public void adicionar(String s) {
		lista.adicionar(s);
	
	}
	
	public void imprimir() {
		lista.imprimir();
		
	}
	
}
