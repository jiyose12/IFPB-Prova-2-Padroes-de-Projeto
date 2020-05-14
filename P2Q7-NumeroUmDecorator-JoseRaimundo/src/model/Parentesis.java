package model;

public class Parentesis extends NumeroUmDecorator{

	public Parentesis(NumeroUmComponente numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public String imprimir() {
		return "(" + numero.imprimir() + ")";
	}
}
