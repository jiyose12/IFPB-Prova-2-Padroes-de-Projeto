package model;

public class Celula extends ImplementacaoTexto{
	
	private String conteudo;

	public Celula(String conteudo) {
		super();
		this.conteudo = conteudo;
	}
	
	public void imprimir() {
		//limita o conteudo a exatamente 15 caracteres
		conteudo += " ";
		conteudo = conteudo.substring(0, 15);
		//imprime na mesma linha e com borda lateral
		System.out.println(" | " + conteudo);
	}

}
