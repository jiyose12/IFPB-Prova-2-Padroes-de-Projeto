package model;

public class TamanhoMedio extends AbstracaoTamanho{

	public TamanhoMedio(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		System.out.println("Toma um gole de "+ refrigerante + " bom demais!");
		System.out.println("Toma outro gole de "+ refrigerante);
		System.out.println("Acabou  o(a) "+ refrigerante);
		System.out.println();
		
	}

}
