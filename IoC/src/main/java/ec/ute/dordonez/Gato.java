package ec.ute.dordonez;

import org.springframework.stereotype.Component;

@Component
public class Gato extends Animal {
	private String habla = "Soy un gato: miau miau!";
	
	public String getHabla() {
		return habla;
	}
}
