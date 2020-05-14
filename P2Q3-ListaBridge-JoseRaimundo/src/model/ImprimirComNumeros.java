package model;

public class ImprimirComNumeros extends Imprimir{

	public ImprimirComNumeros(ImplementacaoLista lista) {
		super(lista);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimir() {
		int i = 1;
		for(String s:lista.getLista()){
			   System.out.println(i+": "+s+"\n");
			   i++;
			}
	}

}
