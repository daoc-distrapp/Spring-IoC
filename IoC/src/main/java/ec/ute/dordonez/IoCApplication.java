package ec.ute.dordonez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCApplication implements CommandLineRunner {
	
	// v1
	@Autowired
	Animal animal;//cambie aquí (y en run/v1) el nombre de la variable a gato
	
	// v2
	@Autowired
	@Qualifier("perro")
	Animal animalV2;
	
	// v3
	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(IoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String str;
		
		// v1
		str = animal.getHabla();
		System.out.println(str);
		
		// v2
		str = animalV2.getHabla();
		System.out.println(str);	
		
		// v3
		Animal animalV3 = context.getBean("caballo", Animal.class);
		str = animalV3.getHabla();
		System.out.println(str);
	}

}
