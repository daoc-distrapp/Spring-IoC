package ec.ute.dordonez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCApplication implements CommandLineRunner {
	
	@Autowired
	Gato animal;
	
	// o también
	@Autowired
	ApplicationContext context;
	
	
	public static void main(String[] args) {
		SpringApplication.run(IoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String str = animal.getHabla();
		System.out.println(str);
		
		Animal otroAnimal = context.getBean("perro", Animal.class);
		str = otroAnimal.getHabla();
		System.out.println(str);
	}

}
