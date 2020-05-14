package view;

import model.AbstracaoTamanho;
import model.CocaCola;
import model.Guarana;
import model.TamanhoGrande;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class demo {

	public static void main(String[] args) {

		AbstracaoTamanho pequeno = new TamanhoPequeno(new CocaCola());
		pequeno.beber();
		AbstracaoTamanho medio = new TamanhoMedio(new CocaCola());
		medio.beber();
		AbstracaoTamanho grande = new TamanhoGrande(new Guarana());
		grande.beber();
	}

}
