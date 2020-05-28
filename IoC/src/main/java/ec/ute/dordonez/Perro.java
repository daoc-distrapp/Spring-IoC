package ec.ute.dordonez;

import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {
	private String habla = "Soy un perro: guau guau!";
	
	public String getHabla() {
		return habla;
	}
}
