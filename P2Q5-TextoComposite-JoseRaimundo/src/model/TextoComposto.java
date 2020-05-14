package model;

import java.util.ArrayList;
import java.util.List;

public class TextoComposto extends ImplementacaoTexto{
	
	public void imprimir() {
		for (ImplementacaoTexto i: texto){
			if (i.getTexto() instanceof List) {
				for(ImplementacaoTexto j:i.getTexto()) {
					j.imprimir();
					System.out.println(j.getClass().getSimpleName());
				}
				i.imprimir();
				System.out.println(i.getClass().getSimpleName());
			}

		}
	}
}
