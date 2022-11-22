package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t01.n02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers"})
public class S04T01N02SamayoaSoniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N02SamayoaSoniaApplication.class, args);
		System.out.println("Hola");
	}

}
