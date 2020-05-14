package model;

public abstract class NumeroUmDecorator extends NumeroUmComponente{

	protected NumeroUmComponente numero;

	public NumeroUmDecorator(NumeroUmComponente numero) {
		super();
		this.numero = numero;
	}
	
//	public String imprimir() {
//		return numero.imprimir();
//	}
}
