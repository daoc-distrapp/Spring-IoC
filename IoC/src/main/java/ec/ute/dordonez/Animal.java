package ec.ute.dordonez;

import org.springframework.stereotype.Component;

@Component
public class Animal {

	private String habla = "Soy un animal genérico y no digo nada!";
	
	public String getHabla() {
		return habla;
	}

}
