package view;

import model.Chaves;
import model.Colchetes;
import model.NumeroUmComponente;
import model.NumeroUmConcreto;
import model.Parentesis;

public class demo {

	public static void main(String[] args) {
		
		NumeroUmComponente n1 = new Colchetes(new Parentesis(new Chaves(new NumeroUmConcreto())));
		System.out.println(n1.imprimir());

		NumeroUmComponente n2 = new Chaves(new Colchetes(new NumeroUmConcreto()));
		System.out.println(n2.imprimir());

	}
}
