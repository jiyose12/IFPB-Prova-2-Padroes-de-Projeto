package model;

public class TamanhoPequeno extends AbstracaoTamanho{

	
	public TamanhoPequeno(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		System.out.println("Toma um gole de "+ refrigerante);
		System.out.println("Acabou  o(a) "+ refrigerante);
		System.out.println();
		
	}

}
