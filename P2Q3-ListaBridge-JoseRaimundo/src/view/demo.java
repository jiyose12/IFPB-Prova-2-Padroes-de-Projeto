package view;

import model.Imprimir;
import model.ImprimirComLetras;
import model.ImprimirComNumeros;
import model.ListaNaoOrdenada;
import model.ListaOrdenada;

public class demo {

	public static void main(String[] args) {

		Imprimir numeros = new ImprimirComNumeros(new ListaOrdenada());
		numeros.adicionar("Oi");
		numeros.adicionar("tudo bem");
		numeros.adicionar("contigo?");
		numeros.imprimir();
		
		Imprimir letras = new ImprimirComLetras(new ListaOrdenada());
		letras.adicionar("Oi");
		letras.adicionar("tudo bem");
		letras.adicionar("contigo?");
		letras.imprimir();
		
		Imprimir numeros2 = new ImprimirComNumeros(new ListaNaoOrdenada());
		numeros2.adicionar("Oi");
		numeros2.adicionar("tudo bem");
		numeros2.adicionar("contigo?");
		numeros2.imprimir();

	}

}
