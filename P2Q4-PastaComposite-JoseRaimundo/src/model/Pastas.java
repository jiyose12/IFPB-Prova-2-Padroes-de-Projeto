package model;

import java.util.ArrayList;

public class Pastas extends ImplementacaoSistema{

	public String nome;
	
	ArrayList lista = new ArrayList();
	
	public Pastas(String nome) {
		super();
		this.nome = nome;
	}
	
	public void imprimirLista(){
		System.out.println("\nLista: ");
		for (int i =0; i<this.lista.size(); i++){
			ImplementacaoSistema g = (ImplementacaoSistema) lista.get(i);

			System.out.println(g);
			System.out.println("\n");
		}
	}
	
	public ArrayList getLista() {
		return lista;
	}

	public String getNome() {
		return nome;
	}

	public void add(ImplementacaoSistema i) {
		System.out.println("Adicionando: "+ i.getClass().getSimpleName());
		lista.add(i);
		System.out.println(" "+i+ " Adicionado");
		
	}

	public void remove(ImplementacaoSistema i) {
		System.out.println("Removendo");
		lista.remove(i);
	}

	@Override
	public String toString() {
		return "Pastas [nome=" + nome + ", lista=" + lista + "]";
	}
	
	
}
