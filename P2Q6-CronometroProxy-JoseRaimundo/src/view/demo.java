package view;

import model.Componente;
import model.ComponenteConcreto;
import model.Interceptador;

public class demo {

	public static void main(String[] args) {
		Componente proxy = new Interceptador(new ComponenteConcreto());
		
		proxy.executarTarefa();

	}

}
