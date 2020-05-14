package model;

import java.time.LocalTime;
import java.util.Date;

public class Interceptador implements Componente {

	private Componente componente;
	
	
	public Interceptador(Componente componente) {
		super();
		this.componente = componente;
	}


	@Override
	public void executarTarefa() {
		
		LocalTime time = LocalTime.now();
		
		System.out.println(this.log()+": mensagem");
		
		if(this.verificarMinutoPar()) {
			System.out.println("Execução interrompida em minuto par: "+ time.getMinute() +" min");
//			return;
			System.exit(1);
		}
		
		do {
		long antes =System.currentTimeMillis();
		componente.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois - antes)+ " ms");
		
		} while(!this.verificarMinutoPar());

	}

	@Override
	public Date log() {
		
		return componente.log();
	}


	@Override
	public Boolean verificarMinutoPar() {
		
		return componente.verificarMinutoPar();
	}

}
