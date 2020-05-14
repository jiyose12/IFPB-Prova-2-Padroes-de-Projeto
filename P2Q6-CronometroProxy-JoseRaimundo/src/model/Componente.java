package model;

import java.util.Date;

public interface Componente {

	void executarTarefa();
	
	Date log();
	
	Boolean verificarMinutoPar();
}
