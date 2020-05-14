package model;

public class Colchetes extends NumeroUmDecorator{

	public Colchetes(NumeroUmComponente numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	public String imprimir() {
		return "[" + numero.imprimir() + "]";
	}

}
