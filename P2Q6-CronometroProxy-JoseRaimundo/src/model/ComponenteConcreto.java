package model;

import java.time.LocalTime;
import java.util.Date;

public class ComponenteConcreto implements Componente {

	@Override
	public void executarTarefa() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Date log() {
		Date date = new java.util.Date();
	    return date;
	}

	@Override
	public Boolean verificarMinutoPar() {
		LocalTime time = LocalTime.now();
		if(time.getMinute() % 2 == 0)
			return true;
		else
			return false;
	}

}
