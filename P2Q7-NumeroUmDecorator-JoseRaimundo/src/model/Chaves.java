package model;

public class Chaves extends NumeroUmDecorator{

	public Chaves(NumeroUmComponente numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	public String imprimir() {
		return "{" + numero.imprimir() + "}";
	}

}
