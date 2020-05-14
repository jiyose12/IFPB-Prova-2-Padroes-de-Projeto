package model;

public class ImprimirComLetras extends Imprimir{

	public ImprimirComLetras(ImplementacaoLista lista) {
		super(lista);
		// TODO Auto-generated constructor stub
	}

	public void imprimir() {
		char i = 'A';
		for(String s:lista.getLista()){
			   System.out.println(i+": "+s +"\n");
			   i++;
			}
	}
}
