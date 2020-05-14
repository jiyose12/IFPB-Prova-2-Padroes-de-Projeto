package model;

public class Linha extends ImplementacaoTexto{

	public void imprimir() {
		//imprime borda lateral
		System.out.println(" |");
		//imprime linha
		int tamanho = (texto.size() * 17) + 5;
		char[] linha = new char[tamanho];
		
		for(int i = 0; i < tamanho; i++) 
			linha[i] = '-';
		
		System.out.println(" "+ new String(linha));
	}
}
