package ec.ute.dordonez;

import org.springframework.stereotype.Component;

@Component
public class Caballo extends Animal {
	private String habla = "Soy un caballo: ihihihihi!";
	
	public String getHabla() {
		return habla;
	}
}
