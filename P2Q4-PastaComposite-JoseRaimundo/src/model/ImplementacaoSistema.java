package model;

import java.util.ArrayList;

public abstract class ImplementacaoSistema {

	public ImplementacaoSistema() {}
	
	public String getNome(){
		throw new UnsupportedOperationException();
	}
	
	public int getTamanho() {
		throw new UnsupportedOperationException();
	}

	public ArrayList getLista() {
		throw new UnsupportedOperationException();
	}

	public void imprimirLista(){}
	public void add(ImplementacaoSistema i){}
	public void remove(int i){}

}
