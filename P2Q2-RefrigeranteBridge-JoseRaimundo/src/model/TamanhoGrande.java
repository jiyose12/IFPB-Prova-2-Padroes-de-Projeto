package model;

public class TamanhoGrande extends AbstracaoTamanho{

	public TamanhoGrande(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		System.out.println("Toma um gole de "+ refrigerante);
		System.out.println("Toma mais um gole de "+ refrigerante);
		System.out.println("Toma outro gole de "+ refrigerante);
		System.out.println("Acabou  o(a) "+ refrigerante);
		System.out.println();
		
	}

}
