package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNaoOrdenada implements ImplementacaoLista {

	List<String> lista = new ArrayList<String>();
	
	@Override
	public void adicionar(String s) {
		lista.add(s);
	
	}

	@Override
	public void imprimir(){
		for(String s:lista){
			   System.out.println(s);
			}
	}

	public List<String> getLista() {
		return lista;

	}	

}
