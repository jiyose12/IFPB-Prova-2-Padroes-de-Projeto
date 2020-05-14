package view;

import model.Arquivos;
import model.ImplementacaoSistema;
import model.Pastas;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementacaoSistema p0= new Pastas("Pasta de Geral");
		ImplementacaoSistema p1= new Pastas("Pasta de Músicas");
		ImplementacaoSistema p2= new Pastas("Pasta de Códigos");
		
		ImplementacaoSistema a1= new Arquivos("Sibito Baleado.mp3", 10);
		ImplementacaoSistema a2= new Arquivos("Java.java", 230);
		ImplementacaoSistema a3= new Arquivos("Eita!", 30);
		ImplementacaoSistema a4= new Arquivos("ArquivoLouco.txt", 50);
		ImplementacaoSistema a5= new Arquivos("Mamamia.html", 1);
		ImplementacaoSistema a6= new Arquivos("NossosOlhos.mp3", 2);
		
		p0.add(p1);
		p0.add(p2);
		p0.add(a4);
		
		p1.add(a1);
		p1.add(a6);
		p1.add(p2);
		
		p2.add(a2);
		p2.add(a3);
		p2.add(a5);
		
		p0.imprimirLista();
		
	}

}
