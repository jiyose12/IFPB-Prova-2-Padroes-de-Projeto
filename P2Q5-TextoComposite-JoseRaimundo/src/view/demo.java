package view;

import java.util.List;

import model.Celula;
import model.ImplementacaoTexto;
import model.Linha;
import model.TextoComposto;

public class demo {
	
//	public static void imprimir(List<ImplementacaoTexto> t) {
//		for (ImplementacaoTexto i: t){
//			
//			i.imprimir();
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementacaoTexto tabela = new TextoComposto();
		ImplementacaoTexto linha1 = new Linha();
		ImplementacaoTexto linha2 = new Linha();
		ImplementacaoTexto celula1 = new Celula("texto pequenodsdadas");
		ImplementacaoTexto celula2 = new Celula("Conteudo medio!!asd");
		ImplementacaoTexto celula3 = new Celula("Conteudo grande??!!!dasdshgytuy");
		ImplementacaoTexto celula4 = new Celula("fim ou seria começo?");
		ImplementacaoTexto celula5 = new Celula("Errrrou!dsadasdsadas");
		
		tabela.adicionar(linha1);
		tabela.adicionar(linha2);
		
		linha1.adicionar(celula1);
		linha1.adicionar(celula2);
		linha1.adicionar(celula3);
		linha1.adicionar(celula5);
		
		linha2.adicionar(celula2);
		linha2.adicionar(celula4);
		
		
//		imprimir(tabela.getTexto());
		tabela.imprimir();

	}

}
